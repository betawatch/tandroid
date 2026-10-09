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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xj0 implements LeadingMarginSpan {
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public pj0 J;
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
    public final wj0 s;
    public ii.b6 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public xj0(boolean z10, boolean z11, wj0 wj0Var) {
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
        this.s = wj0Var;
        this.e = z11;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.I);
        paint.setColor(i0.a.k(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        wj0[] wj0VarArr = (wj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wj0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= wj0VarArr.length) {
                break;
            }
            wj0 wj0Var = wj0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(wj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(wj0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((wj0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(wj0Var);
            spannableStringBuilder.removeSpan(wj0Var.a);
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
        xj0[] xj0VarArr = (xj0[]) spannable.getSpans(i10, i11, xj0.class);
        if (xj0VarArr == null || xj0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            wj0 wj0Var = new wj0();
            xj0 xj0Var = new xj0(false, z10, wj0Var);
            wj0Var.a = xj0Var;
            xj0Var.c = clamp;
            xj0Var.d = clamp2;
            spannable.setSpan(wj0Var, clamp, clamp2, 33);
            spannable.setSpan(xj0Var, clamp, clamp2, 33);
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
        wj0 wj0Var = new wj0();
        xj0 xj0Var = new xj0(true, z10, wj0Var);
        wj0Var.a = xj0Var;
        xj0Var.c = clamp;
        xj0Var.d = clamp2;
        editable.setSpan(xj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(wj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(tu tuVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        xj0[] xj0VarArr;
        boolean z10;
        boolean z11;
        int lineStart;
        int i10;
        boolean z12;
        int i11;
        tu tuVar2 = tuVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z13 = false;
                xj0[] xj0VarArr2 = (xj0[]) spannable.getSpans(0, spannable.length(), xj0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < xj0VarArr2.length) {
                    xj0 xj0Var = xj0VarArr2[i12];
                    boolean z14 = xj0Var.n;
                    tj0 tj0Var = new tj0(tuVar2, layout, spannable, xj0Var);
                    if (xj0Var.a) {
                        int i13 = xj0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (xj0Var.d != text.length() && text.charAt(xj0Var.d) != '\n') {
                                int i14 = xj0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(xj0VarArr2[i12]);
                                spannable.removeSpan(xj0VarArr2[i12].s);
                                spannable.setSpan(xj0VarArr2[i12], xj0Var.c, i14, 33);
                                spannable.setSpan(xj0VarArr2[i12].s, xj0Var.c, i14, 33);
                                tj0Var = new tj0(tuVar2, layout, spannable, xj0VarArr2[i12]);
                            }
                            boolean z15 = spannable instanceof SpannableStringBuilder;
                            xj0 xj0Var2 = tj0Var.e;
                            if (z15) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = xj0Var2.d - 1;
                                boolean z16 = (i15 < 0 || spannableStringBuilder.charAt(i15) != '\n') ? z13 : true;
                                if (tj0Var.b()) {
                                    int i16 = xj0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > tj0Var.d - (xj0Var2.J != null ? org.telegram.messenger.q.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.q.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z12 = true;
                                            if (z16 != z12) {
                                                int i17 = xj0Var2.d;
                                                if (z16) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    xj0VarArr = xj0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z17 = (Selection.getSelectionStart(spannableStringBuilder) == xj0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z10 : false;
                                                    int i18 = xj0Var2.d;
                                                    if (xj0Var2.K == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        xj0Var2.K = spannableString;
                                                        charSequence = text;
                                                        xj0VarArr = xj0VarArr2;
                                                        spannableString.setSpan(new vj0(), 0, xj0Var2.K.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        xj0VarArr = xj0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) xj0Var2.K);
                                                    if (z17) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = xj0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                xj0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(xj0VarArr[i12]);
                                                spannable.removeSpan(xj0VarArr[i12].s);
                                                spannable.setSpan(xj0VarArr[i12], xj0Var2.c, xj0Var2.d, 33);
                                                spannable.setSpan(xj0VarArr[i12].s, xj0Var2.c, xj0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                xj0VarArr = xj0VarArr2;
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
                                xj0VarArr = xj0VarArr2;
                                z10 = true;
                            }
                            ii.b6 b6Var = xj0Var2.v;
                            if (b6Var != null) {
                                spannable.removeSpan(b6Var);
                            }
                            if (xj0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(xj0Var2.c) + 3, layout.getLineCount()))) < (i10 = xj0Var2.d)) {
                                if (xj0Var2.v == null) {
                                    xj0Var2.v = new ii.b6(xj0Var2);
                                }
                                spannable.setSpan(xj0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(xj0VarArr2[i12]);
                            spannable.removeSpan(xj0VarArr2[i12].s);
                            ii.b6 b6Var2 = xj0VarArr2[i12].v;
                            if (b6Var2 != null) {
                                spannable.removeSpan(b6Var2);
                            }
                            charSequence = text;
                            xj0VarArr = xj0VarArr2;
                            z11 = z13;
                            i12++;
                            tuVar2 = tuVar;
                            z13 = z11;
                            text = charSequence;
                            xj0VarArr2 = xj0VarArr;
                        }
                    } else {
                        charSequence = text;
                        xj0VarArr = xj0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (xj0VarArr[i12].n == z14 || zArr == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                        zArr[0] = z10;
                    }
                    arrayList2.add(tj0Var);
                    i12++;
                    tuVar2 = tuVar;
                    z13 = z11;
                    text = charSequence;
                    xj0VarArr2 = xj0VarArr;
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
                for (xj0 xj0Var : (xj0[]) spanned.getSpans(0, spanned.length(), xj0.class)) {
                    boolean z10 = xj0Var.n;
                    tj0 tj0Var = new tj0(null, layout, spanned, xj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tj0Var);
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
