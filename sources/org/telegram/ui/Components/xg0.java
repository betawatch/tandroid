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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xg0 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public e0.g K;
    public SpannableString L;
    public final boolean a;
    public boolean b = true;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final wg0 s;
    public mi.x5 w;
    public final Drawable x;
    public final Paint y;

    public xg0(boolean z10, boolean z11, wg0 wg0Var) {
        Paint paint = new Paint(1);
        this.y = paint;
        this.E = new float[8];
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new float[8];
        this.I = new Path();
        this.J = -1;
        this.a = z10;
        this.s = wg0Var;
        this.e = z11;
        this.x = k2.p1.g(org.telegram.messenger.t0.b, R.drawable.mini_quote);
        paint2.setColor(this.J);
        paint.setColor(i0.a.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        wg0[] wg0VarArr = (wg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wg0.class);
        int i3 = 0;
        while (true) {
            if (i3 >= wg0VarArr.length) {
                break;
            }
            wg0 wg0Var = wg0VarArr[i3];
            int spanStart = spannableStringBuilder.getSpanStart(wg0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(wg0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((wg0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(wg0Var);
            spannableStringBuilder.removeSpan(wg0Var.a);
            i3++;
        }
        Iterator it = treeSet.iterator();
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i10 != intValue) {
                int i12 = intValue - 1;
                int i13 = (i12 < 0 || i12 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i12) != '\n') ? intValue : intValue - 1;
                if (i11 > 0) {
                    c(spannableStringBuilder, i10, i13, z10);
                }
                i10 = intValue + 1;
                if (i10 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                    i10 = intValue;
                }
            }
            if ((intValue2 & 2) != 0) {
                i11--;
            }
            if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                i11++;
                z10 = (intValue2 & 16) != 0;
            }
        }
        if (i10 >= spannableStringBuilder.length() || i11 <= 0) {
            return;
        }
        c(spannableStringBuilder, i10, spannableStringBuilder.length(), z10);
    }

    public static void b(Spannable spannable, int i3, int i10, boolean z10) {
        xg0[] xg0VarArr = (xg0[]) spannable.getSpans(i3, i10, xg0.class);
        if (xg0VarArr == null || xg0VarArr.length <= 0) {
            int j10 = Utilities.j(i3, spannable.length(), 0);
            int j11 = Utilities.j(i10, spannable.length(), 0);
            wg0 wg0Var = new wg0();
            xg0 xg0Var = new xg0(false, z10, wg0Var);
            wg0Var.a = xg0Var;
            xg0Var.c = j10;
            xg0Var.d = j11;
            spannable.setSpan(wg0Var, j10, j11, 33);
            spannable.setSpan(xg0Var, j10, j11, 33);
        }
    }

    public static int c(Editable editable, int i3, int i10, boolean z10) {
        if (editable == null) {
            return -1;
        }
        int j10 = Utilities.j(i3, editable.length(), 0);
        int j11 = Utilities.j(i10, editable.length(), 0);
        if (j10 > 0 && editable.charAt(j10 - 1) != '\n') {
            editable.insert(j10, "\n");
            j10++;
            j11++;
        }
        int i11 = j11 + 1;
        if (j11 >= editable.length() || editable.charAt(j11) != '\n') {
            editable.insert(j11, "\n");
        }
        wg0 wg0Var = new wg0();
        xg0 xg0Var = new xg0(true, z10, wg0Var);
        wg0Var.a = xg0Var;
        xg0Var.c = j10;
        xg0Var.d = j11;
        editable.setSpan(xg0Var, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.setSpan(wg0Var, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.insert(Utilities.j(j11, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j11, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(bt btVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        xg0[] xg0VarArr;
        boolean z10;
        boolean z11;
        int lineStart;
        int i3;
        boolean z12;
        int i10;
        bt btVar2 = btVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z13 = false;
                xg0[] xg0VarArr2 = (xg0[]) spannable.getSpans(0, spannable.length(), xg0.class);
                ArrayList arrayList2 = arrayList;
                int i11 = 0;
                while (i11 < xg0VarArr2.length) {
                    xg0 xg0Var = xg0VarArr2[i11];
                    boolean z14 = xg0Var.n;
                    tg0 tg0Var = new tg0(btVar2, layout, spannable, xg0Var);
                    if (xg0Var.a) {
                        int i12 = xg0Var.c;
                        if (i12 == 0 || text.charAt(i12 - 1) == '\n') {
                            if (xg0Var.d != text.length() && text.charAt(xg0Var.d) != '\n') {
                                int i13 = xg0Var.d;
                                while (i13 <= text.length() && i13 != text.length() && text.charAt(i13) != '\n') {
                                    i13++;
                                }
                                spannable.removeSpan(xg0VarArr2[i11]);
                                spannable.removeSpan(xg0VarArr2[i11].s);
                                spannable.setSpan(xg0VarArr2[i11], xg0Var.c, i13, 33);
                                spannable.setSpan(xg0VarArr2[i11].s, xg0Var.c, i13, 33);
                                tg0Var = new tg0(btVar2, layout, spannable, xg0VarArr2[i11]);
                            }
                            boolean z15 = spannable instanceof SpannableStringBuilder;
                            xg0 xg0Var2 = tg0Var.e;
                            if (z15) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i14 = xg0Var2.d - 1;
                                boolean z16 = (i14 < 0 || spannableStringBuilder.charAt(i14) != '\n') ? z13 : true;
                                if (tg0Var.b()) {
                                    int i15 = xg0Var2.d;
                                    if (i15 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i15 - 1)) - org.telegram.messenger.g0.L(12.0f) > tg0Var.d - (xg0Var2.K != null ? org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + r12.a) : org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f)))) {
                                            z12 = true;
                                            if (z16 != z12) {
                                                int i16 = xg0Var2.d;
                                                if (z16) {
                                                    i10 = i16 - 1;
                                                    spannableStringBuilder.delete(i16 - 1, i16);
                                                    charSequence = text;
                                                    xg0VarArr = xg0VarArr2;
                                                } else {
                                                    i10 = i16 + 2;
                                                    boolean z17 = (Selection.getSelectionStart(spannableStringBuilder) == xg0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z10 : false;
                                                    int i17 = xg0Var2.d;
                                                    if (xg0Var2.L == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        xg0Var2.L = spannableString;
                                                        charSequence = text;
                                                        xg0VarArr = xg0VarArr2;
                                                        spannableString.setSpan(new vg0(), 0, xg0Var2.L.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        xg0VarArr = xg0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i17, (CharSequence) xg0Var2.L);
                                                    if (z17) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i18 = xg0Var2.d;
                                                        if (selectionStart != i18) {
                                                            Selection.setSelection(spannableStringBuilder, i18, i18);
                                                        }
                                                    }
                                                }
                                                xg0Var2.d = Math.min(i10, spannable.length());
                                                spannable.removeSpan(xg0VarArr[i11]);
                                                spannable.removeSpan(xg0VarArr[i11].s);
                                                spannable.setSpan(xg0VarArr[i11], xg0Var2.c, xg0Var2.d, 33);
                                                spannable.setSpan(xg0VarArr[i11].s, xg0Var2.c, xg0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                xg0VarArr = xg0VarArr2;
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
                                xg0VarArr = xg0VarArr2;
                                z10 = true;
                            }
                            mi.x5 x5Var = xg0Var2.w;
                            if (x5Var != null) {
                                spannable.removeSpan(x5Var);
                            }
                            if (xg0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(xg0Var2.c) + 3, layout.getLineCount()))) < (i3 = xg0Var2.d)) {
                                if (xg0Var2.w == null) {
                                    xg0Var2.w = new mi.x5(xg0Var2);
                                }
                                spannable.setSpan(xg0Var2.w, lineStart, i3, 33);
                            }
                        } else {
                            spannable.removeSpan(xg0VarArr2[i11]);
                            spannable.removeSpan(xg0VarArr2[i11].s);
                            mi.x5 x5Var2 = xg0VarArr2[i11].w;
                            if (x5Var2 != null) {
                                spannable.removeSpan(x5Var2);
                            }
                            charSequence = text;
                            xg0VarArr = xg0VarArr2;
                            z11 = z13;
                            i11++;
                            btVar2 = btVar;
                            z13 = z11;
                            text = charSequence;
                            xg0VarArr2 = xg0VarArr;
                        }
                    } else {
                        charSequence = text;
                        xg0VarArr = xg0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (xg0VarArr[i11].n == z14 || zArr == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                        zArr[0] = z10;
                    }
                    arrayList2.add(tg0Var);
                    i11++;
                    btVar2 = btVar;
                    z13 = z11;
                    text = charSequence;
                    xg0VarArr2 = xg0VarArr;
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
                for (xg0 xg0Var : (xg0[]) spanned.getSpans(0, spanned.length(), xg0.class)) {
                    boolean z10 = xg0Var.n;
                    tg0 tg0Var = new tg0(null, layout, spanned, xg0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tg0Var);
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
        return org.telegram.messenger.g0.L(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i3, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
    }
}
