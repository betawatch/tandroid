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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pj0 implements LeadingMarginSpan {
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public gj0 J;
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
    public final oj0 s;
    public ki.y5 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public pj0(boolean z10, boolean z11, oj0 oj0Var) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.a = z10;
        this.s = oj0Var;
        this.e = z11;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.I);
        paint.setColor(i0.a.o(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        oj0[] oj0VarArr = (oj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oj0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= oj0VarArr.length) {
                break;
            }
            oj0 oj0Var = oj0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(oj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(oj0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((oj0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(oj0Var);
            spannableStringBuilder.removeSpan(oj0Var.a);
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
        pj0[] pj0VarArr = (pj0[]) spannable.getSpans(i10, i11, pj0.class);
        if (pj0VarArr == null || pj0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            oj0 oj0Var = new oj0();
            pj0 pj0Var = new pj0(false, z10, oj0Var);
            oj0Var.a = pj0Var;
            pj0Var.c = clamp;
            pj0Var.d = clamp2;
            spannable.setSpan(oj0Var, clamp, clamp2, 33);
            spannable.setSpan(pj0Var, clamp, clamp2, 33);
        }
    }

    public static int c(Editable editable, int i10, int i11, boolean z10) {
        if (editable == null) {
            return -1;
        }
        int clamp = Utilities.clamp(i10, editable.length(), 0);
        int clamp2 = Utilities.clamp(i11, editable.length(), 0);
        if (clamp > 0 && editable.charAt(clamp - 1) != '\n') {
            editable.insert(clamp, "\n");
            clamp++;
            clamp2++;
        }
        int i12 = clamp2 + 1;
        if (clamp2 >= editable.length() || editable.charAt(clamp2) != '\n') {
            editable.insert(clamp2, "\n");
        }
        oj0 oj0Var = new oj0();
        pj0 pj0Var = new pj0(true, z10, oj0Var);
        oj0Var.a = pj0Var;
        pj0Var.c = clamp;
        pj0Var.d = clamp2;
        editable.setSpan(pj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(oj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(ku kuVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        pj0[] pj0VarArr;
        boolean z10;
        boolean z11;
        int lineStart;
        int i10;
        boolean z12;
        int i11;
        ku kuVar2 = kuVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z13 = false;
                pj0[] pj0VarArr2 = (pj0[]) spannable.getSpans(0, spannable.length(), pj0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < pj0VarArr2.length) {
                    pj0 pj0Var = pj0VarArr2[i12];
                    boolean z14 = pj0Var.n;
                    lj0 lj0Var = new lj0(kuVar2, layout, spannable, pj0Var);
                    if (pj0Var.a) {
                        int i13 = pj0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (pj0Var.d != text.length() && text.charAt(pj0Var.d) != '\n') {
                                int i14 = pj0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(pj0VarArr2[i12]);
                                spannable.removeSpan(pj0VarArr2[i12].s);
                                spannable.setSpan(pj0VarArr2[i12], pj0Var.c, i14, 33);
                                spannable.setSpan(pj0VarArr2[i12].s, pj0Var.c, i14, 33);
                                lj0Var = new lj0(kuVar2, layout, spannable, pj0VarArr2[i12]);
                            }
                            boolean z15 = spannable instanceof SpannableStringBuilder;
                            pj0 pj0Var2 = lj0Var.e;
                            if (z15) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = pj0Var2.d - 1;
                                boolean z16 = (i15 < 0 || spannableStringBuilder.charAt(i15) != '\n') ? z13 : true;
                                if (lj0Var.b()) {
                                    int i16 = pj0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > lj0Var.d - (pj0Var2.J != null ? org.telegram.messenger.g0.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.g0.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z12 = true;
                                            if (z16 != z12) {
                                                int i17 = pj0Var2.d;
                                                if (z16) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    pj0VarArr = pj0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z17 = (Selection.getSelectionStart(spannableStringBuilder) == pj0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z10 : false;
                                                    int i18 = pj0Var2.d;
                                                    if (pj0Var2.K == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        pj0Var2.K = spannableString;
                                                        charSequence = text;
                                                        pj0VarArr = pj0VarArr2;
                                                        spannableString.setSpan(new nj0(), 0, pj0Var2.K.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        pj0VarArr = pj0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) pj0Var2.K);
                                                    if (z17) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = pj0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                pj0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(pj0VarArr[i12]);
                                                spannable.removeSpan(pj0VarArr[i12].s);
                                                spannable.setSpan(pj0VarArr[i12], pj0Var2.c, pj0Var2.d, 33);
                                                spannable.setSpan(pj0VarArr[i12].s, pj0Var2.c, pj0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                pj0VarArr = pj0VarArr2;
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
                                pj0VarArr = pj0VarArr2;
                                z10 = true;
                            }
                            ki.y5 y5Var = pj0Var2.v;
                            if (y5Var != null) {
                                spannable.removeSpan(y5Var);
                            }
                            if (pj0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(pj0Var2.c) + 3, layout.getLineCount()))) < (i10 = pj0Var2.d)) {
                                if (pj0Var2.v == null) {
                                    pj0Var2.v = new ki.y5(pj0Var2);
                                }
                                spannable.setSpan(pj0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(pj0VarArr2[i12]);
                            spannable.removeSpan(pj0VarArr2[i12].s);
                            ki.y5 y5Var2 = pj0VarArr2[i12].v;
                            if (y5Var2 != null) {
                                spannable.removeSpan(y5Var2);
                            }
                            charSequence = text;
                            pj0VarArr = pj0VarArr2;
                            z11 = z13;
                            i12++;
                            kuVar2 = kuVar;
                            z13 = z11;
                            text = charSequence;
                            pj0VarArr2 = pj0VarArr;
                        }
                    } else {
                        charSequence = text;
                        pj0VarArr = pj0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (pj0VarArr[i12].n == z14 || zArr == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                        zArr[0] = z10;
                    }
                    arrayList2.add(lj0Var);
                    i12++;
                    kuVar2 = kuVar;
                    z13 = z11;
                    text = charSequence;
                    pj0VarArr2 = pj0VarArr;
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
                for (pj0 pj0Var : (pj0[]) spanned.getSpans(0, spanned.length(), pj0.class)) {
                    boolean z10 = pj0Var.n;
                    lj0 lj0Var = new lj0(null, layout, spanned, pj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(lj0Var);
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
        return AndroidUtilities.dp(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
    }
}
