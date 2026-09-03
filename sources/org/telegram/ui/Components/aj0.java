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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class aj0 implements LeadingMarginSpan {
    public final Path B;
    public final Paint C;
    public final float[] D;
    public final Path E;
    public int F;
    public si0 G;
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
    public final zi0 s;
    public va0 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public aj0(boolean z4, boolean z10, zi0 zi0Var) {
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
        this.s = zi0Var;
        this.e = z10;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.F);
        paint.setColor(i0.a.k(this.F, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z4;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        zi0[] zi0VarArr = (zi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zi0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= zi0VarArr.length) {
                break;
            }
            zi0 zi0Var = zi0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(zi0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(zi0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((zi0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(zi0Var);
            spannableStringBuilder.removeSpan(zi0Var.a);
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
        aj0[] aj0VarArr = (aj0[]) spannable.getSpans(i10, i11, aj0.class);
        if (aj0VarArr == null || aj0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            zi0 zi0Var = new zi0();
            aj0 aj0Var = new aj0(false, z4, zi0Var);
            zi0Var.a = aj0Var;
            aj0Var.c = clamp;
            aj0Var.d = clamp2;
            spannable.setSpan(zi0Var, clamp, clamp2, 33);
            spannable.setSpan(aj0Var, clamp, clamp2, 33);
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
        zi0 zi0Var = new zi0();
        aj0 aj0Var = new aj0(true, z4, zi0Var);
        zi0Var.a = aj0Var;
        aj0Var.c = clamp;
        aj0Var.d = clamp2;
        editable.setSpan(aj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(zi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(wt wtVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        aj0[] aj0VarArr;
        boolean z4;
        int lineStart;
        int i10;
        boolean z10;
        int i11;
        wt wtVar2 = wtVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                aj0[] aj0VarArr2 = (aj0[]) spannable.getSpans(0, spannable.length(), aj0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < aj0VarArr2.length) {
                    aj0 aj0Var = aj0VarArr2[i12];
                    boolean z11 = aj0Var.n;
                    wi0 wi0Var = new wi0(wtVar2, layout, spannable, aj0Var);
                    if (aj0Var.a) {
                        int i13 = aj0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (aj0Var.d != text.length() && text.charAt(aj0Var.d) != '\n') {
                                int i14 = aj0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(aj0VarArr2[i12]);
                                spannable.removeSpan(aj0VarArr2[i12].s);
                                spannable.setSpan(aj0VarArr2[i12], aj0Var.c, i14, 33);
                                spannable.setSpan(aj0VarArr2[i12].s, aj0Var.c, i14, 33);
                                wi0Var = new wi0(wtVar2, layout, spannable, aj0VarArr2[i12]);
                            }
                            boolean z12 = spannable instanceof SpannableStringBuilder;
                            aj0 aj0Var2 = wi0Var.e;
                            if (z12) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = aj0Var2.d - 1;
                                boolean z13 = i15 >= 0 && spannableStringBuilder.charAt(i15) == '\n';
                                if (wi0Var.b()) {
                                    int i16 = aj0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z4 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > wi0Var.d - (aj0Var2.G != null ? org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z10 = true;
                                            if (z13 != z10) {
                                                int i17 = aj0Var2.d;
                                                if (z13) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    aj0VarArr = aj0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z14 = Selection.getSelectionStart(spannableStringBuilder) == aj0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                                    int i18 = aj0Var2.d;
                                                    if (aj0Var2.H == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        aj0Var2.H = spannableString;
                                                        charSequence = text;
                                                        aj0VarArr = aj0VarArr2;
                                                        spannableString.setSpan(new yi0(), 0, aj0Var2.H.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        aj0VarArr = aj0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) aj0Var2.H);
                                                    if (z14) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = aj0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                aj0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(aj0VarArr[i12]);
                                                spannable.removeSpan(aj0VarArr[i12].s);
                                                spannable.setSpan(aj0VarArr[i12], aj0Var2.c, aj0Var2.d, 33);
                                                spannable.setSpan(aj0VarArr[i12].s, aj0Var2.c, aj0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z4;
                                                }
                                            } else {
                                                charSequence = text;
                                                aj0VarArr = aj0VarArr2;
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
                                aj0VarArr = aj0VarArr2;
                                z4 = true;
                            }
                            va0 va0Var = aj0Var2.v;
                            if (va0Var != null) {
                                spannable.removeSpan(va0Var);
                            }
                            if (aj0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(aj0Var2.c) + 3, layout.getLineCount()))) < (i10 = aj0Var2.d)) {
                                if (aj0Var2.v == null) {
                                    aj0Var2.v = new va0(aj0Var2);
                                }
                                spannable.setSpan(aj0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(aj0VarArr2[i12]);
                            spannable.removeSpan(aj0VarArr2[i12].s);
                            va0 va0Var2 = aj0VarArr2[i12].v;
                            if (va0Var2 != null) {
                                spannable.removeSpan(va0Var2);
                            }
                            charSequence = text;
                            aj0VarArr = aj0VarArr2;
                            i12++;
                            wtVar2 = wtVar;
                            text = charSequence;
                            aj0VarArr2 = aj0VarArr;
                        }
                    } else {
                        charSequence = text;
                        aj0VarArr = aj0VarArr2;
                        z4 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (aj0VarArr[i12].n != z11 && zArr != null) {
                        zArr[0] = z4;
                    }
                    arrayList2.add(wi0Var);
                    i12++;
                    wtVar2 = wtVar;
                    text = charSequence;
                    aj0VarArr2 = aj0VarArr;
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
                for (aj0 aj0Var : (aj0[]) spanned.getSpans(0, spanned.length(), aj0.class)) {
                    boolean z4 = aj0Var.n;
                    wi0 wi0Var = new wi0(null, layout, spanned, aj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(wi0Var);
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
