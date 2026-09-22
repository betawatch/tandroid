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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fj0 implements LeadingMarginSpan {
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public xi0 J;
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
    public final ej0 s;
    public ii.z5 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public fj0(boolean z10, boolean z11, ej0 ej0Var) {
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
        this.s = ej0Var;
        this.e = z11;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.I);
        paint.setColor(i0.a.k(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ej0[] ej0VarArr = (ej0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ej0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= ej0VarArr.length) {
                break;
            }
            ej0 ej0Var = ej0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(ej0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(ej0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((ej0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(ej0Var);
            spannableStringBuilder.removeSpan(ej0Var.a);
            i10++;
        }
        Iterator it = treeSet.iterator();
        int i11 = 0;
        int i12 = 0;
        loop1: while (true) {
            z10 = false;
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
                    if ((intValue2 & 16) != 0) {
                        z10 = true;
                    }
                }
            }
        }
        if (i11 >= spannableStringBuilder.length() || i12 <= 0) {
            return;
        }
        c(spannableStringBuilder, i11, spannableStringBuilder.length(), z10);
    }

    public static void b(Spannable spannable, int i10, int i11, boolean z10) {
        fj0[] fj0VarArr = (fj0[]) spannable.getSpans(i10, i11, fj0.class);
        if (fj0VarArr == null || fj0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            ej0 ej0Var = new ej0();
            fj0 fj0Var = new fj0(false, z10, ej0Var);
            ej0Var.a = fj0Var;
            fj0Var.c = clamp;
            fj0Var.d = clamp2;
            spannable.setSpan(ej0Var, clamp, clamp2, 33);
            spannable.setSpan(fj0Var, clamp, clamp2, 33);
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
        ej0 ej0Var = new ej0();
        fj0 fj0Var = new fj0(true, z10, ej0Var);
        ej0Var.a = fj0Var;
        fj0Var.c = clamp;
        fj0Var.d = clamp2;
        editable.setSpan(fj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(ej0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(du duVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        fj0[] fj0VarArr;
        boolean z10;
        int lineStart;
        int i10;
        boolean z11;
        int i11;
        du duVar2 = duVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                fj0[] fj0VarArr2 = (fj0[]) spannable.getSpans(0, spannable.length(), fj0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < fj0VarArr2.length) {
                    fj0 fj0Var = fj0VarArr2[i12];
                    boolean z12 = fj0Var.n;
                    bj0 bj0Var = new bj0(duVar2, layout, spannable, fj0Var);
                    if (fj0Var.a) {
                        int i13 = fj0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (fj0Var.d != text.length() && text.charAt(fj0Var.d) != '\n') {
                                int i14 = fj0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(fj0VarArr2[i12]);
                                spannable.removeSpan(fj0VarArr2[i12].s);
                                spannable.setSpan(fj0VarArr2[i12], fj0Var.c, i14, 33);
                                spannable.setSpan(fj0VarArr2[i12].s, fj0Var.c, i14, 33);
                                bj0Var = new bj0(duVar2, layout, spannable, fj0VarArr2[i12]);
                            }
                            boolean z13 = spannable instanceof SpannableStringBuilder;
                            fj0 fj0Var2 = bj0Var.e;
                            if (z13) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = fj0Var2.d - 1;
                                boolean z14 = i15 >= 0 && spannableStringBuilder.charAt(i15) == '\n';
                                if (bj0Var.b()) {
                                    int i16 = fj0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > bj0Var.d - (fj0Var2.J != null ? org.telegram.messenger.l0.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.l0.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z11 = true;
                                            if (z14 != z11) {
                                                int i17 = fj0Var2.d;
                                                if (z14) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    fj0VarArr = fj0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z15 = Selection.getSelectionStart(spannableStringBuilder) == fj0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                                    int i18 = fj0Var2.d;
                                                    if (fj0Var2.K == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        fj0Var2.K = spannableString;
                                                        charSequence = text;
                                                        fj0VarArr = fj0VarArr2;
                                                        spannableString.setSpan(new dj0(), 0, fj0Var2.K.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        fj0VarArr = fj0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) fj0Var2.K);
                                                    if (z15) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = fj0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                fj0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(fj0VarArr[i12]);
                                                spannable.removeSpan(fj0VarArr[i12].s);
                                                spannable.setSpan(fj0VarArr[i12], fj0Var2.c, fj0Var2.d, 33);
                                                spannable.setSpan(fj0VarArr[i12].s, fj0Var2.c, fj0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                fj0VarArr = fj0VarArr2;
                                            }
                                        }
                                        z11 = false;
                                        if (z14 != z11) {
                                        }
                                    }
                                }
                                z10 = true;
                                z11 = false;
                                if (z14 != z11) {
                                }
                            } else {
                                charSequence = text;
                                fj0VarArr = fj0VarArr2;
                                z10 = true;
                            }
                            ii.z5 z5Var = fj0Var2.v;
                            if (z5Var != null) {
                                spannable.removeSpan(z5Var);
                            }
                            if (fj0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(fj0Var2.c) + 3, layout.getLineCount()))) < (i10 = fj0Var2.d)) {
                                if (fj0Var2.v == null) {
                                    fj0Var2.v = new ii.z5(fj0Var2);
                                }
                                spannable.setSpan(fj0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(fj0VarArr2[i12]);
                            spannable.removeSpan(fj0VarArr2[i12].s);
                            ii.z5 z5Var2 = fj0VarArr2[i12].v;
                            if (z5Var2 != null) {
                                spannable.removeSpan(z5Var2);
                            }
                            charSequence = text;
                            fj0VarArr = fj0VarArr2;
                            i12++;
                            duVar2 = duVar;
                            text = charSequence;
                            fj0VarArr2 = fj0VarArr;
                        }
                    } else {
                        charSequence = text;
                        fj0VarArr = fj0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (fj0VarArr[i12].n != z12 && zArr != null) {
                        zArr[0] = z10;
                    }
                    arrayList2.add(bj0Var);
                    i12++;
                    duVar2 = duVar;
                    text = charSequence;
                    fj0VarArr2 = fj0VarArr;
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
                for (fj0 fj0Var : (fj0[]) spanned.getSpans(0, spanned.length(), fj0.class)) {
                    boolean z10 = fj0Var.n;
                    bj0 bj0Var = new bj0(null, layout, spanned, fj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bj0Var);
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
