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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ih0 implements LeadingMarginSpan {
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
    public final hh0 s;
    public oi.w5 w;
    public final Drawable x;
    public final Paint y;

    public ih0(boolean z10, boolean z11, hh0 hh0Var) {
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
        this.s = hh0Var;
        this.e = z11;
        this.x = i5.c.g(org.telegram.messenger.t0.b, R.drawable.mini_quote);
        paint2.setColor(this.J);
        paint.setColor(i0.a.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        hh0[] hh0VarArr = (hh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hh0.class);
        int i7 = 0;
        while (true) {
            if (i7 >= hh0VarArr.length) {
                break;
            }
            hh0 hh0Var = hh0VarArr[i7];
            int spanStart = spannableStringBuilder.getSpanStart(hh0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(hh0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hh0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(hh0Var);
            spannableStringBuilder.removeSpan(hh0Var.a);
            i7++;
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

    public static void b(Spannable spannable, int i7, int i10, boolean z10) {
        ih0[] ih0VarArr = (ih0[]) spannable.getSpans(i7, i10, ih0.class);
        if (ih0VarArr == null || ih0VarArr.length <= 0) {
            int j3 = Utilities.j(i7, spannable.length(), 0);
            int j10 = Utilities.j(i10, spannable.length(), 0);
            hh0 hh0Var = new hh0();
            ih0 ih0Var = new ih0(false, z10, hh0Var);
            hh0Var.a = ih0Var;
            ih0Var.c = j3;
            ih0Var.d = j10;
            spannable.setSpan(hh0Var, j3, j10, 33);
            spannable.setSpan(ih0Var, j3, j10, 33);
        }
    }

    public static int c(Editable editable, int i7, int i10, boolean z10) {
        if (editable == null) {
            return -1;
        }
        int j3 = Utilities.j(i7, editable.length(), 0);
        int j10 = Utilities.j(i10, editable.length(), 0);
        if (j3 > 0 && editable.charAt(j3 - 1) != '\n') {
            editable.insert(j3, "\n");
            j3++;
            j10++;
        }
        int i11 = j10 + 1;
        if (j10 >= editable.length() || editable.charAt(j10) != '\n') {
            editable.insert(j10, "\n");
        }
        hh0 hh0Var = new hh0();
        ih0 ih0Var = new ih0(true, z10, hh0Var);
        hh0Var.a = ih0Var;
        ih0Var.c = j3;
        ih0Var.d = j10;
        editable.setSpan(ih0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.setSpan(hh0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.insert(Utilities.j(j10, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j10, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(pt ptVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        ih0[] ih0VarArr;
        boolean z10;
        boolean z11;
        int lineStart;
        int i7;
        boolean z12;
        int i10;
        pt ptVar2 = ptVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z13 = false;
                ih0[] ih0VarArr2 = (ih0[]) spannable.getSpans(0, spannable.length(), ih0.class);
                ArrayList arrayList2 = arrayList;
                int i11 = 0;
                while (i11 < ih0VarArr2.length) {
                    ih0 ih0Var = ih0VarArr2[i11];
                    boolean z14 = ih0Var.n;
                    eh0 eh0Var = new eh0(ptVar2, layout, spannable, ih0Var);
                    if (ih0Var.a) {
                        int i12 = ih0Var.c;
                        if (i12 == 0 || text.charAt(i12 - 1) == '\n') {
                            if (ih0Var.d != text.length() && text.charAt(ih0Var.d) != '\n') {
                                int i13 = ih0Var.d;
                                while (i13 <= text.length() && i13 != text.length() && text.charAt(i13) != '\n') {
                                    i13++;
                                }
                                spannable.removeSpan(ih0VarArr2[i11]);
                                spannable.removeSpan(ih0VarArr2[i11].s);
                                spannable.setSpan(ih0VarArr2[i11], ih0Var.c, i13, 33);
                                spannable.setSpan(ih0VarArr2[i11].s, ih0Var.c, i13, 33);
                                eh0Var = new eh0(ptVar2, layout, spannable, ih0VarArr2[i11]);
                            }
                            boolean z15 = spannable instanceof SpannableStringBuilder;
                            ih0 ih0Var2 = eh0Var.e;
                            if (z15) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i14 = ih0Var2.d - 1;
                                boolean z16 = (i14 < 0 || spannableStringBuilder.charAt(i14) != '\n') ? z13 : true;
                                if (eh0Var.b()) {
                                    int i15 = ih0Var2.d;
                                    if (i15 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i15 - 1)) - org.telegram.messenger.g0.L(12.0f) > eh0Var.d - (ih0Var2.K != null ? org.telegram.messenger.f3.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + r12.a) : org.telegram.messenger.f3.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f)))) {
                                            z12 = true;
                                            if (z16 != z12) {
                                                int i16 = ih0Var2.d;
                                                if (z16) {
                                                    i10 = i16 - 1;
                                                    spannableStringBuilder.delete(i16 - 1, i16);
                                                    charSequence = text;
                                                    ih0VarArr = ih0VarArr2;
                                                } else {
                                                    i10 = i16 + 2;
                                                    boolean z17 = (Selection.getSelectionStart(spannableStringBuilder) == ih0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z10 : false;
                                                    int i17 = ih0Var2.d;
                                                    if (ih0Var2.L == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        ih0Var2.L = spannableString;
                                                        charSequence = text;
                                                        ih0VarArr = ih0VarArr2;
                                                        spannableString.setSpan(new gh0(), 0, ih0Var2.L.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        ih0VarArr = ih0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i17, (CharSequence) ih0Var2.L);
                                                    if (z17) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i18 = ih0Var2.d;
                                                        if (selectionStart != i18) {
                                                            Selection.setSelection(spannableStringBuilder, i18, i18);
                                                        }
                                                    }
                                                }
                                                ih0Var2.d = Math.min(i10, spannable.length());
                                                spannable.removeSpan(ih0VarArr[i11]);
                                                spannable.removeSpan(ih0VarArr[i11].s);
                                                spannable.setSpan(ih0VarArr[i11], ih0Var2.c, ih0Var2.d, 33);
                                                spannable.setSpan(ih0VarArr[i11].s, ih0Var2.c, ih0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                ih0VarArr = ih0VarArr2;
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
                                ih0VarArr = ih0VarArr2;
                                z10 = true;
                            }
                            oi.w5 w5Var = ih0Var2.w;
                            if (w5Var != null) {
                                spannable.removeSpan(w5Var);
                            }
                            if (ih0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(ih0Var2.c) + 3, layout.getLineCount()))) < (i7 = ih0Var2.d)) {
                                if (ih0Var2.w == null) {
                                    ih0Var2.w = new oi.w5(ih0Var2);
                                }
                                spannable.setSpan(ih0Var2.w, lineStart, i7, 33);
                            }
                        } else {
                            spannable.removeSpan(ih0VarArr2[i11]);
                            spannable.removeSpan(ih0VarArr2[i11].s);
                            oi.w5 w5Var2 = ih0VarArr2[i11].w;
                            if (w5Var2 != null) {
                                spannable.removeSpan(w5Var2);
                            }
                            charSequence = text;
                            ih0VarArr = ih0VarArr2;
                            z11 = z13;
                            i11++;
                            ptVar2 = ptVar;
                            z13 = z11;
                            text = charSequence;
                            ih0VarArr2 = ih0VarArr;
                        }
                    } else {
                        charSequence = text;
                        ih0VarArr = ih0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (ih0VarArr[i11].n == z14 || zArr == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                        zArr[0] = z10;
                    }
                    arrayList2.add(eh0Var);
                    i11++;
                    ptVar2 = ptVar;
                    z13 = z11;
                    text = charSequence;
                    ih0VarArr2 = ih0VarArr;
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
                for (ih0 ih0Var : (ih0[]) spanned.getSpans(0, spanned.length(), ih0.class)) {
                    boolean z10 = ih0Var.n;
                    eh0 eh0Var = new eh0(null, layout, spanned, ih0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(eh0Var);
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
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
    }
}
