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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ug0 implements LeadingMarginSpan {
    public final float[] D;
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public e0.g J;
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
    public final tg0 s;
    public li.w5 w;
    public final Drawable x;
    public final Paint y;

    public ug0(boolean z9, boolean z10, tg0 tg0Var) {
        Paint paint = new Paint(1);
        this.y = paint;
        this.D = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.a = z9;
        this.s = tg0Var;
        this.e = z10;
        this.x = jg.g.h(org.telegram.messenger.t0.b, R.drawable.mini_quote);
        paint2.setColor(this.I);
        paint.setColor(i0.a.o(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        tg0[] tg0VarArr = (tg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), tg0.class);
        int i7 = 0;
        while (true) {
            if (i7 >= tg0VarArr.length) {
                break;
            }
            tg0 tg0Var = tg0VarArr[i7];
            int spanStart = spannableStringBuilder.getSpanStart(tg0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(tg0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((tg0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(tg0Var);
            spannableStringBuilder.removeSpan(tg0Var.a);
            i7++;
        }
        Iterator it = treeSet.iterator();
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i10 != intValue) {
                int i12 = intValue - 1;
                int i13 = (i12 < 0 || i12 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i12) != '\n') ? intValue : intValue - 1;
                if (i11 > 0) {
                    c(spannableStringBuilder, i10, i13, z9);
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
                z9 = (intValue2 & 16) != 0;
            }
        }
        if (i10 >= spannableStringBuilder.length() || i11 <= 0) {
            return;
        }
        c(spannableStringBuilder, i10, spannableStringBuilder.length(), z9);
    }

    public static void b(Spannable spannable, int i7, int i10, boolean z9) {
        ug0[] ug0VarArr = (ug0[]) spannable.getSpans(i7, i10, ug0.class);
        if (ug0VarArr == null || ug0VarArr.length <= 0) {
            int j3 = Utilities.j(i7, spannable.length(), 0);
            int j10 = Utilities.j(i10, spannable.length(), 0);
            tg0 tg0Var = new tg0();
            ug0 ug0Var = new ug0(false, z9, tg0Var);
            tg0Var.a = ug0Var;
            ug0Var.c = j3;
            ug0Var.d = j10;
            spannable.setSpan(tg0Var, j3, j10, 33);
            spannable.setSpan(ug0Var, j3, j10, 33);
        }
    }

    public static int c(Editable editable, int i7, int i10, boolean z9) {
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
        tg0 tg0Var = new tg0();
        ug0 ug0Var = new ug0(true, z9, tg0Var);
        tg0Var.a = ug0Var;
        ug0Var.c = j3;
        ug0Var.d = j10;
        editable.setSpan(ug0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.setSpan(tg0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.insert(Utilities.j(j10, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j10, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(dt dtVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        ug0[] ug0VarArr;
        boolean z9;
        boolean z10;
        int lineStart;
        int i7;
        boolean z11;
        int i10;
        dt dtVar2 = dtVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z12 = false;
                ug0[] ug0VarArr2 = (ug0[]) spannable.getSpans(0, spannable.length(), ug0.class);
                ArrayList arrayList2 = arrayList;
                int i11 = 0;
                while (i11 < ug0VarArr2.length) {
                    ug0 ug0Var = ug0VarArr2[i11];
                    boolean z13 = ug0Var.n;
                    qg0 qg0Var = new qg0(dtVar2, layout, spannable, ug0Var);
                    if (ug0Var.a) {
                        int i12 = ug0Var.c;
                        if (i12 == 0 || text.charAt(i12 - 1) == '\n') {
                            if (ug0Var.d != text.length() && text.charAt(ug0Var.d) != '\n') {
                                int i13 = ug0Var.d;
                                while (i13 <= text.length() && i13 != text.length() && text.charAt(i13) != '\n') {
                                    i13++;
                                }
                                spannable.removeSpan(ug0VarArr2[i11]);
                                spannable.removeSpan(ug0VarArr2[i11].s);
                                spannable.setSpan(ug0VarArr2[i11], ug0Var.c, i13, 33);
                                spannable.setSpan(ug0VarArr2[i11].s, ug0Var.c, i13, 33);
                                qg0Var = new qg0(dtVar2, layout, spannable, ug0VarArr2[i11]);
                            }
                            boolean z14 = spannable instanceof SpannableStringBuilder;
                            ug0 ug0Var2 = qg0Var.e;
                            if (z14) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i14 = ug0Var2.d - 1;
                                boolean z15 = (i14 < 0 || spannableStringBuilder.charAt(i14) != '\n') ? z12 : true;
                                if (qg0Var.b()) {
                                    int i15 = ug0Var2.d;
                                    if (i15 - 2 >= 0) {
                                        z9 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i15 - 1)) - org.telegram.messenger.g0.L(12.0f) > qg0Var.d - (ug0Var2.J != null ? org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + r12.a) : org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f)))) {
                                            z11 = true;
                                            if (z15 != z11) {
                                                int i16 = ug0Var2.d;
                                                if (z15) {
                                                    i10 = i16 - 1;
                                                    spannableStringBuilder.delete(i16 - 1, i16);
                                                    charSequence = text;
                                                    ug0VarArr = ug0VarArr2;
                                                } else {
                                                    i10 = i16 + 2;
                                                    boolean z16 = (Selection.getSelectionStart(spannableStringBuilder) == ug0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z9 : false;
                                                    int i17 = ug0Var2.d;
                                                    if (ug0Var2.K == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        ug0Var2.K = spannableString;
                                                        charSequence = text;
                                                        ug0VarArr = ug0VarArr2;
                                                        spannableString.setSpan(new sg0(), 0, ug0Var2.K.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        ug0VarArr = ug0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i17, (CharSequence) ug0Var2.K);
                                                    if (z16) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i18 = ug0Var2.d;
                                                        if (selectionStart != i18) {
                                                            Selection.setSelection(spannableStringBuilder, i18, i18);
                                                        }
                                                    }
                                                }
                                                ug0Var2.d = Math.min(i10, spannable.length());
                                                spannable.removeSpan(ug0VarArr[i11]);
                                                spannable.removeSpan(ug0VarArr[i11].s);
                                                spannable.setSpan(ug0VarArr[i11], ug0Var2.c, ug0Var2.d, 33);
                                                spannable.setSpan(ug0VarArr[i11].s, ug0Var2.c, ug0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z9;
                                                }
                                            } else {
                                                charSequence = text;
                                                ug0VarArr = ug0VarArr2;
                                            }
                                        }
                                        z11 = false;
                                        if (z15 != z11) {
                                        }
                                    }
                                }
                                z9 = true;
                                z11 = false;
                                if (z15 != z11) {
                                }
                            } else {
                                charSequence = text;
                                ug0VarArr = ug0VarArr2;
                                z9 = true;
                            }
                            li.w5 w5Var = ug0Var2.w;
                            if (w5Var != null) {
                                spannable.removeSpan(w5Var);
                            }
                            if (ug0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(ug0Var2.c) + 3, layout.getLineCount()))) < (i7 = ug0Var2.d)) {
                                if (ug0Var2.w == null) {
                                    ug0Var2.w = new li.w5(ug0Var2);
                                }
                                spannable.setSpan(ug0Var2.w, lineStart, i7, 33);
                            }
                        } else {
                            spannable.removeSpan(ug0VarArr2[i11]);
                            spannable.removeSpan(ug0VarArr2[i11].s);
                            li.w5 w5Var2 = ug0VarArr2[i11].w;
                            if (w5Var2 != null) {
                                spannable.removeSpan(w5Var2);
                            }
                            charSequence = text;
                            ug0VarArr = ug0VarArr2;
                            z10 = z12;
                            i11++;
                            dtVar2 = dtVar;
                            z12 = z10;
                            text = charSequence;
                            ug0VarArr2 = ug0VarArr;
                        }
                    } else {
                        charSequence = text;
                        ug0VarArr = ug0VarArr2;
                        z9 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (ug0VarArr[i11].n == z13 || zArr == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                        zArr[0] = z9;
                    }
                    arrayList2.add(qg0Var);
                    i11++;
                    dtVar2 = dtVar;
                    z12 = z10;
                    text = charSequence;
                    ug0VarArr2 = ug0VarArr;
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
                for (ug0 ug0Var : (ug0[]) spanned.getSpans(0, spanned.length(), ug0.class)) {
                    boolean z9 = ug0Var.n;
                    qg0 qg0Var = new qg0(null, layout, spanned, ug0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(qg0Var);
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
    public final int getLeadingMargin(boolean z9) {
        return org.telegram.messenger.g0.L(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z9, Layout layout) {
    }
}
