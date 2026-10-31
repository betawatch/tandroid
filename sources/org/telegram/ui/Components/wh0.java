package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wh0 implements LeadingMarginSpan {
    public final float[] D;
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public e0.h J;
    public SpannableString K;
    public final boolean a;
    public boolean b = true;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final vh0 s;
    public bi.m6 w;
    public final Drawable x;
    public final Paint y;

    public wh0(boolean z10, boolean z11, vh0 vh0Var) {
        Paint paint = new Paint(1);
        this.y = paint;
        this.D = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.a = z10;
        this.s = vh0Var;
        this.e = z11;
        this.x = i0.a.f(org.telegram.messenger.w0.b, R.drawable.mini_quote);
        paint2.setColor(this.I);
        paint.setColor(i0.b.o(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        vh0[] vh0VarArr = (vh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vh0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= vh0VarArr.length) {
                break;
            }
            vh0 vh0Var = vh0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(vh0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(vh0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((vh0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(vh0Var);
            spannableStringBuilder.removeSpan(vh0Var.a);
            i10++;
        }
        Iterator it = treeSet.iterator();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i11 != intValue) {
                int i13 = intValue - 1;
                int i14 = (i13 < 0 || i13 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i13) != '\n') ? intValue : intValue - 1;
                if (i12 > 0) {
                    c(spannableStringBuilder, i11, i14, z10);
                }
                i11 = intValue + 1;
                if (i11 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                    i11 = intValue;
                }
            }
            if ((intValue2 & 2) != 0) {
                i12--;
            }
            if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                i12++;
                z10 = (intValue2 & 16) != 0;
            }
        }
        if (i11 >= spannableStringBuilder.length() || i12 <= 0) {
            return;
        }
        c(spannableStringBuilder, i11, spannableStringBuilder.length(), z10);
    }

    public static void b(Spannable spannable, int i10, int i11, boolean z10) {
        wh0[] wh0VarArr = (wh0[]) spannable.getSpans(i10, i11, wh0.class);
        if (wh0VarArr == null || wh0VarArr.length <= 0) {
            int j10 = Utilities.j(i10, spannable.length(), 0);
            int j11 = Utilities.j(i11, spannable.length(), 0);
            vh0 vh0Var = new vh0();
            wh0 wh0Var = new wh0(false, z10, vh0Var);
            vh0Var.a = wh0Var;
            wh0Var.c = j10;
            wh0Var.d = j11;
            spannable.setSpan(vh0Var, j10, j11, 33);
            spannable.setSpan(wh0Var, j10, j11, 33);
        }
    }

    public static int c(Editable editable, int i10, int i11, boolean z10) {
        if (editable == null) {
            return -1;
        }
        int j10 = Utilities.j(i10, editable.length(), 0);
        int j11 = Utilities.j(i11, editable.length(), 0);
        if (j10 > 0 && editable.charAt(j10 - 1) != '\n') {
            editable.insert(j10, "\n");
            j10++;
            j11++;
        }
        int i12 = j11 + 1;
        if (j11 >= editable.length() || editable.charAt(j11) != '\n') {
            editable.insert(j11, "\n");
        }
        vh0 vh0Var = new vh0();
        wh0 wh0Var = new wh0(true, z10, vh0Var);
        vh0Var.a = wh0Var;
        wh0Var.c = j10;
        wh0Var.d = j11;
        editable.setSpan(wh0Var, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.setSpan(vh0Var, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.insert(Utilities.j(j11, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j11, editable.length(), 0), Utilities.j(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(qt qtVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        wh0[] wh0VarArr;
        boolean z10;
        boolean z11;
        int lineStart;
        int i10;
        boolean z12;
        int i11;
        qt qtVar2 = qtVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z13 = false;
                wh0[] wh0VarArr2 = (wh0[]) spannable.getSpans(0, spannable.length(), wh0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < wh0VarArr2.length) {
                    wh0 wh0Var = wh0VarArr2[i12];
                    boolean z14 = wh0Var.n;
                    sh0 sh0Var = new sh0(qtVar2, layout, spannable, wh0Var);
                    if (wh0Var.a) {
                        int i13 = wh0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (wh0Var.d != text.length() && text.charAt(wh0Var.d) != '\n') {
                                int i14 = wh0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(wh0VarArr2[i12]);
                                spannable.removeSpan(wh0VarArr2[i12].s);
                                spannable.setSpan(wh0VarArr2[i12], wh0Var.c, i14, 33);
                                spannable.setSpan(wh0VarArr2[i12].s, wh0Var.c, i14, 33);
                                sh0Var = new sh0(qtVar2, layout, spannable, wh0VarArr2[i12]);
                            }
                            boolean z15 = spannable instanceof SpannableStringBuilder;
                            wh0 wh0Var2 = sh0Var.e;
                            if (z15) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = wh0Var2.d - 1;
                                boolean z16 = (i15 < 0 || spannableStringBuilder.charAt(i15) != '\n') ? z13 : true;
                                if (sh0Var.b()) {
                                    int i16 = wh0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - org.telegram.messenger.i0.L(12.0f) > sh0Var.d - (wh0Var2.J != null ? org.telegram.messenger.m5.D(3.333f, 2, org.telegram.messenger.i0.L(23.66f) + r12.a) : org.telegram.messenger.m5.D(3.333f, 2, org.telegram.messenger.i0.L(23.66f)))) {
                                            z12 = true;
                                            if (z16 != z12) {
                                                int i17 = wh0Var2.d;
                                                if (z16) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    wh0VarArr = wh0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z17 = (Selection.getSelectionStart(spannableStringBuilder) == wh0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z10 : false;
                                                    int i18 = wh0Var2.d;
                                                    if (wh0Var2.K == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        wh0Var2.K = spannableString;
                                                        charSequence = text;
                                                        wh0VarArr = wh0VarArr2;
                                                        spannableString.setSpan(new uh0(), 0, wh0Var2.K.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        wh0VarArr = wh0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) wh0Var2.K);
                                                    if (z17) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = wh0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                wh0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(wh0VarArr[i12]);
                                                spannable.removeSpan(wh0VarArr[i12].s);
                                                spannable.setSpan(wh0VarArr[i12], wh0Var2.c, wh0Var2.d, 33);
                                                spannable.setSpan(wh0VarArr[i12].s, wh0Var2.c, wh0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                wh0VarArr = wh0VarArr2;
                                            }
                                        }
                                        z12 = false;
                                        if (z16 != z12) {
                                        }
                                    }
                                }
                                z10 = true;
                                z12 = false;
                                if (z16 != z12) {
                                }
                            } else {
                                charSequence = text;
                                wh0VarArr = wh0VarArr2;
                                z10 = true;
                            }
                            bi.m6 m6Var = wh0Var2.w;
                            if (m6Var != null) {
                                spannable.removeSpan(m6Var);
                            }
                            if (wh0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(wh0Var2.c) + 3, layout.getLineCount()))) < (i10 = wh0Var2.d)) {
                                if (wh0Var2.w == null) {
                                    wh0Var2.w = new bi.m6(wh0Var2);
                                }
                                spannable.setSpan(wh0Var2.w, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(wh0VarArr2[i12]);
                            spannable.removeSpan(wh0VarArr2[i12].s);
                            bi.m6 m6Var2 = wh0VarArr2[i12].w;
                            if (m6Var2 != null) {
                                spannable.removeSpan(m6Var2);
                            }
                            charSequence = text;
                            wh0VarArr = wh0VarArr2;
                            z11 = z13;
                            i12++;
                            qtVar2 = qtVar;
                            z13 = z11;
                            text = charSequence;
                            wh0VarArr2 = wh0VarArr;
                        }
                    } else {
                        charSequence = text;
                        wh0VarArr = wh0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (wh0VarArr[i12].n == z14 || zArr == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                        zArr[0] = z10;
                    }
                    arrayList2.add(sh0Var);
                    i12++;
                    qtVar2 = qtVar;
                    z13 = z11;
                    text = charSequence;
                    wh0VarArr2 = wh0VarArr;
                }
                return arrayList2;
            }
            if (arrayList != null) {
                arrayList.clear();
            }
        } else if (arrayList != null) {
            arrayList.clear();
            return arrayList;
        }
        return arrayList;
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spanned)) {
                Spanned spanned = (Spanned) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                for (wh0 wh0Var : (wh0[]) spanned.getSpans(0, spanned.length(), wh0.class)) {
                    boolean z10 = wh0Var.n;
                    sh0 sh0Var = new sh0(null, layout, spanned, wh0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sh0Var);
                }
                return arrayList;
            }
            if (arrayList != null) {
                arrayList.clear();
            }
        } else if (arrayList != null) {
            arrayList.clear();
            return arrayList;
        }
        return arrayList;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return org.telegram.messenger.i0.L(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
    }
}
