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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class jh0 implements LeadingMarginSpan {
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
    public final ih0 s;
    public oi.w5 w;
    public final Drawable x;
    public final Paint y;

    public jh0(boolean z10, boolean z11, ih0 ih0Var) {
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
        this.s = ih0Var;
        this.e = z11;
        this.x = i5.c.g(org.telegram.messenger.t0.b, R.drawable.mini_quote);
        paint2.setColor(this.J);
        paint.setColor(i0.a.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ih0[] ih0VarArr = (ih0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ih0.class);
        int i7 = 0;
        while (true) {
            if (i7 >= ih0VarArr.length) {
                break;
            }
            ih0 ih0Var = ih0VarArr[i7];
            int spanStart = spannableStringBuilder.getSpanStart(ih0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(ih0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((ih0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(ih0Var);
            spannableStringBuilder.removeSpan(ih0Var.a);
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
        jh0[] jh0VarArr = (jh0[]) spannable.getSpans(i7, i10, jh0.class);
        if (jh0VarArr == null || jh0VarArr.length <= 0) {
            int j3 = Utilities.j(i7, spannable.length(), 0);
            int j10 = Utilities.j(i10, spannable.length(), 0);
            ih0 ih0Var = new ih0();
            jh0 jh0Var = new jh0(false, z10, ih0Var);
            ih0Var.a = jh0Var;
            jh0Var.c = j3;
            jh0Var.d = j10;
            spannable.setSpan(ih0Var, j3, j10, 33);
            spannable.setSpan(jh0Var, j3, j10, 33);
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
        ih0 ih0Var = new ih0();
        jh0 jh0Var = new jh0(true, z10, ih0Var);
        ih0Var.a = jh0Var;
        jh0Var.c = j3;
        jh0Var.d = j10;
        editable.setSpan(jh0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.setSpan(ih0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.insert(Utilities.j(j10, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j10, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(rt rtVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        jh0[] jh0VarArr;
        boolean z10;
        boolean z11;
        int lineStart;
        int i7;
        boolean z12;
        int i10;
        rt rtVar2 = rtVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z13 = false;
                jh0[] jh0VarArr2 = (jh0[]) spannable.getSpans(0, spannable.length(), jh0.class);
                ArrayList arrayList2 = arrayList;
                int i11 = 0;
                while (i11 < jh0VarArr2.length) {
                    jh0 jh0Var = jh0VarArr2[i11];
                    boolean z14 = jh0Var.n;
                    fh0 fh0Var = new fh0(rtVar2, layout, spannable, jh0Var);
                    if (jh0Var.a) {
                        int i12 = jh0Var.c;
                        if (i12 == 0 || text.charAt(i12 - 1) == '\n') {
                            if (jh0Var.d != text.length() && text.charAt(jh0Var.d) != '\n') {
                                int i13 = jh0Var.d;
                                while (i13 <= text.length() && i13 != text.length() && text.charAt(i13) != '\n') {
                                    i13++;
                                }
                                spannable.removeSpan(jh0VarArr2[i11]);
                                spannable.removeSpan(jh0VarArr2[i11].s);
                                spannable.setSpan(jh0VarArr2[i11], jh0Var.c, i13, 33);
                                spannable.setSpan(jh0VarArr2[i11].s, jh0Var.c, i13, 33);
                                fh0Var = new fh0(rtVar2, layout, spannable, jh0VarArr2[i11]);
                            }
                            boolean z15 = spannable instanceof SpannableStringBuilder;
                            jh0 jh0Var2 = fh0Var.e;
                            if (z15) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i14 = jh0Var2.d - 1;
                                boolean z16 = (i14 < 0 || spannableStringBuilder.charAt(i14) != '\n') ? z13 : true;
                                if (fh0Var.b()) {
                                    int i15 = jh0Var2.d;
                                    if (i15 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i15 - 1)) - org.telegram.messenger.g0.L(12.0f) > fh0Var.d - (jh0Var2.K != null ? org.telegram.messenger.f3.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + r12.a) : org.telegram.messenger.f3.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f)))) {
                                            z12 = true;
                                            if (z16 != z12) {
                                                int i16 = jh0Var2.d;
                                                if (z16) {
                                                    i10 = i16 - 1;
                                                    spannableStringBuilder.delete(i16 - 1, i16);
                                                    charSequence = text;
                                                    jh0VarArr = jh0VarArr2;
                                                } else {
                                                    i10 = i16 + 2;
                                                    boolean z17 = (Selection.getSelectionStart(spannableStringBuilder) == jh0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z10 : false;
                                                    int i17 = jh0Var2.d;
                                                    if (jh0Var2.L == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        jh0Var2.L = spannableString;
                                                        charSequence = text;
                                                        jh0VarArr = jh0VarArr2;
                                                        spannableString.setSpan(new hh0(), 0, jh0Var2.L.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        jh0VarArr = jh0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i17, (CharSequence) jh0Var2.L);
                                                    if (z17) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i18 = jh0Var2.d;
                                                        if (selectionStart != i18) {
                                                            Selection.setSelection(spannableStringBuilder, i18, i18);
                                                        }
                                                    }
                                                }
                                                jh0Var2.d = Math.min(i10, spannable.length());
                                                spannable.removeSpan(jh0VarArr[i11]);
                                                spannable.removeSpan(jh0VarArr[i11].s);
                                                spannable.setSpan(jh0VarArr[i11], jh0Var2.c, jh0Var2.d, 33);
                                                spannable.setSpan(jh0VarArr[i11].s, jh0Var2.c, jh0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                jh0VarArr = jh0VarArr2;
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
                                jh0VarArr = jh0VarArr2;
                                z10 = true;
                            }
                            oi.w5 w5Var = jh0Var2.w;
                            if (w5Var != null) {
                                spannable.removeSpan(w5Var);
                            }
                            if (jh0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(jh0Var2.c) + 3, layout.getLineCount()))) < (i7 = jh0Var2.d)) {
                                if (jh0Var2.w == null) {
                                    jh0Var2.w = new oi.w5(jh0Var2);
                                }
                                spannable.setSpan(jh0Var2.w, lineStart, i7, 33);
                            }
                        } else {
                            spannable.removeSpan(jh0VarArr2[i11]);
                            spannable.removeSpan(jh0VarArr2[i11].s);
                            oi.w5 w5Var2 = jh0VarArr2[i11].w;
                            if (w5Var2 != null) {
                                spannable.removeSpan(w5Var2);
                            }
                            charSequence = text;
                            jh0VarArr = jh0VarArr2;
                            z11 = z13;
                            i11++;
                            rtVar2 = rtVar;
                            z13 = z11;
                            text = charSequence;
                            jh0VarArr2 = jh0VarArr;
                        }
                    } else {
                        charSequence = text;
                        jh0VarArr = jh0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (jh0VarArr[i11].n == z14 || zArr == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                        zArr[0] = z10;
                    }
                    arrayList2.add(fh0Var);
                    i11++;
                    rtVar2 = rtVar;
                    z13 = z11;
                    text = charSequence;
                    jh0VarArr2 = jh0VarArr;
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
                for (jh0 jh0Var : (jh0[]) spanned.getSpans(0, spanned.length(), jh0.class)) {
                    boolean z10 = jh0Var.n;
                    fh0 fh0Var = new fh0(null, layout, spanned, jh0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fh0Var);
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
