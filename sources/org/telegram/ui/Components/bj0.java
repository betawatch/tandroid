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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bj0 implements LeadingMarginSpan {
    public final Path B;
    public final Paint C;
    public final float[] D;
    public final Path E;
    public int F;
    public ti0 G;
    public SpannableString H;
    public final boolean a;
    public boolean b = true;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final aj0 s;
    public wa0 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public bj0(boolean z4, boolean z10, aj0 aj0Var) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new float[8];
        this.B = new Path();
        Paint paint2 = new Paint(1);
        this.C = paint2;
        this.D = new float[8];
        this.E = new Path();
        this.F = -1;
        this.a = z4;
        this.s = aj0Var;
        this.e = z10;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.F);
        paint.setColor(i0.a.k(this.F, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z4;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        aj0[] aj0VarArr = (aj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), aj0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= aj0VarArr.length) {
                break;
            }
            aj0 aj0Var = aj0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(aj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(aj0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((aj0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(aj0Var);
            spannableStringBuilder.removeSpan(aj0Var.a);
            i10++;
        }
        Iterator it = treeSet.iterator();
        int i11 = 0;
        int i12 = 0;
        loop1: while (true) {
            z4 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i11 != intValue) {
                    int i13 = intValue - 1;
                    int i14 = (i13 < 0 || i13 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i13) != '\n') ? intValue : intValue - 1;
                    if (i12 > 0) {
                        c(spannableStringBuilder, i11, i14, z4);
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
                        z4 = true;
                    }
                }
            }
        }
        if (i11 >= spannableStringBuilder.length() || i12 <= 0) {
            return;
        }
        c(spannableStringBuilder, i11, spannableStringBuilder.length(), z4);
    }

    public static void b(Spannable spannable, int i10, int i11, boolean z4) {
        bj0[] bj0VarArr = (bj0[]) spannable.getSpans(i10, i11, bj0.class);
        if (bj0VarArr == null || bj0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            aj0 aj0Var = new aj0();
            bj0 bj0Var = new bj0(false, z4, aj0Var);
            aj0Var.a = bj0Var;
            bj0Var.c = clamp;
            bj0Var.d = clamp2;
            spannable.setSpan(aj0Var, clamp, clamp2, 33);
            spannable.setSpan(bj0Var, clamp, clamp2, 33);
        }
    }

    public static int c(Editable editable, int i10, int i11, boolean z4) {
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
        aj0 aj0Var = new aj0();
        bj0 bj0Var = new bj0(true, z4, aj0Var);
        aj0Var.a = bj0Var;
        bj0Var.c = clamp;
        bj0Var.d = clamp2;
        editable.setSpan(bj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(aj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(zt ztVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        bj0[] bj0VarArr;
        boolean z4;
        int lineStart;
        int i10;
        boolean z10;
        int i11;
        zt ztVar2 = ztVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                bj0[] bj0VarArr2 = (bj0[]) spannable.getSpans(0, spannable.length(), bj0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < bj0VarArr2.length) {
                    bj0 bj0Var = bj0VarArr2[i12];
                    boolean z11 = bj0Var.n;
                    xi0 xi0Var = new xi0(ztVar2, layout, spannable, bj0Var);
                    if (bj0Var.a) {
                        int i13 = bj0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (bj0Var.d != text.length() && text.charAt(bj0Var.d) != '\n') {
                                int i14 = bj0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(bj0VarArr2[i12]);
                                spannable.removeSpan(bj0VarArr2[i12].s);
                                spannable.setSpan(bj0VarArr2[i12], bj0Var.c, i14, 33);
                                spannable.setSpan(bj0VarArr2[i12].s, bj0Var.c, i14, 33);
                                xi0Var = new xi0(ztVar2, layout, spannable, bj0VarArr2[i12]);
                            }
                            boolean z12 = spannable instanceof SpannableStringBuilder;
                            bj0 bj0Var2 = xi0Var.e;
                            if (z12) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = bj0Var2.d - 1;
                                boolean z13 = i15 >= 0 && spannableStringBuilder.charAt(i15) == '\n';
                                if (xi0Var.b()) {
                                    int i16 = bj0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z4 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > xi0Var.d - (bj0Var2.G != null ? org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z10 = true;
                                            if (z13 != z10) {
                                                int i17 = bj0Var2.d;
                                                if (z13) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    bj0VarArr = bj0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z14 = Selection.getSelectionStart(spannableStringBuilder) == bj0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                                    int i18 = bj0Var2.d;
                                                    if (bj0Var2.H == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        bj0Var2.H = spannableString;
                                                        charSequence = text;
                                                        bj0VarArr = bj0VarArr2;
                                                        spannableString.setSpan(new zi0(), 0, bj0Var2.H.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        bj0VarArr = bj0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) bj0Var2.H);
                                                    if (z14) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = bj0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                bj0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(bj0VarArr[i12]);
                                                spannable.removeSpan(bj0VarArr[i12].s);
                                                spannable.setSpan(bj0VarArr[i12], bj0Var2.c, bj0Var2.d, 33);
                                                spannable.setSpan(bj0VarArr[i12].s, bj0Var2.c, bj0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z4;
                                                }
                                            } else {
                                                charSequence = text;
                                                bj0VarArr = bj0VarArr2;
                                            }
                                        }
                                        z10 = false;
                                        if (z13 != z10) {
                                        }
                                    }
                                }
                                z4 = true;
                                z10 = false;
                                if (z13 != z10) {
                                }
                            } else {
                                charSequence = text;
                                bj0VarArr = bj0VarArr2;
                                z4 = true;
                            }
                            wa0 wa0Var = bj0Var2.v;
                            if (wa0Var != null) {
                                spannable.removeSpan(wa0Var);
                            }
                            if (bj0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(bj0Var2.c) + 3, layout.getLineCount()))) < (i10 = bj0Var2.d)) {
                                if (bj0Var2.v == null) {
                                    bj0Var2.v = new wa0(bj0Var2);
                                }
                                spannable.setSpan(bj0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(bj0VarArr2[i12]);
                            spannable.removeSpan(bj0VarArr2[i12].s);
                            wa0 wa0Var2 = bj0VarArr2[i12].v;
                            if (wa0Var2 != null) {
                                spannable.removeSpan(wa0Var2);
                            }
                            charSequence = text;
                            bj0VarArr = bj0VarArr2;
                            i12++;
                            ztVar2 = ztVar;
                            text = charSequence;
                            bj0VarArr2 = bj0VarArr;
                        }
                    } else {
                        charSequence = text;
                        bj0VarArr = bj0VarArr2;
                        z4 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (bj0VarArr[i12].n != z11 && zArr != null) {
                        zArr[0] = z4;
                    }
                    arrayList2.add(xi0Var);
                    i12++;
                    ztVar2 = ztVar;
                    text = charSequence;
                    bj0VarArr2 = bj0VarArr;
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
                for (bj0 bj0Var : (bj0[]) spanned.getSpans(0, spanned.length(), bj0.class)) {
                    boolean z4 = bj0Var.n;
                    xi0 xi0Var = new xi0(null, layout, spanned, bj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(xi0Var);
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
    public final int getLeadingMargin(boolean z4) {
        return AndroidUtilities.dp(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z4, Layout layout) {
    }
}
