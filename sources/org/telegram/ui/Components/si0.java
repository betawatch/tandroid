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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class si0 implements LeadingMarginSpan {
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public ki0 J;
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
    public final ri0 s;
    public ji.c6 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public si0(boolean z10, boolean z11, ri0 ri0Var) {
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
        this.s = ri0Var;
        this.e = z11;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.I);
        paint.setColor(i0.a.k(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ri0[] ri0VarArr = (ri0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ri0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= ri0VarArr.length) {
                break;
            }
            ri0 ri0Var = ri0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(ri0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(ri0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((ri0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(ri0Var);
            spannableStringBuilder.removeSpan(ri0Var.a);
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
        si0[] si0VarArr = (si0[]) spannable.getSpans(i10, i11, si0.class);
        if (si0VarArr == null || si0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            ri0 ri0Var = new ri0();
            si0 si0Var = new si0(false, z10, ri0Var);
            ri0Var.a = si0Var;
            si0Var.c = clamp;
            si0Var.d = clamp2;
            spannable.setSpan(ri0Var, clamp, clamp2, 33);
            spannable.setSpan(si0Var, clamp, clamp2, 33);
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
        ri0 ri0Var = new ri0();
        si0 si0Var = new si0(true, z10, ri0Var);
        ri0Var.a = si0Var;
        si0Var.c = clamp;
        si0Var.d = clamp2;
        editable.setSpan(si0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(ri0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(bu buVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        si0[] si0VarArr;
        boolean z10;
        int lineStart;
        int i10;
        boolean z11;
        int i11;
        bu buVar2 = buVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                si0[] si0VarArr2 = (si0[]) spannable.getSpans(0, spannable.length(), si0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < si0VarArr2.length) {
                    si0 si0Var = si0VarArr2[i12];
                    boolean z12 = si0Var.n;
                    oi0 oi0Var = new oi0(buVar2, layout, spannable, si0Var);
                    if (si0Var.a) {
                        int i13 = si0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (si0Var.d != text.length() && text.charAt(si0Var.d) != '\n') {
                                int i14 = si0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(si0VarArr2[i12]);
                                spannable.removeSpan(si0VarArr2[i12].s);
                                spannable.setSpan(si0VarArr2[i12], si0Var.c, i14, 33);
                                spannable.setSpan(si0VarArr2[i12].s, si0Var.c, i14, 33);
                                oi0Var = new oi0(buVar2, layout, spannable, si0VarArr2[i12]);
                            }
                            boolean z13 = spannable instanceof SpannableStringBuilder;
                            si0 si0Var2 = oi0Var.e;
                            if (z13) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = si0Var2.d - 1;
                                boolean z14 = i15 >= 0 && spannableStringBuilder.charAt(i15) == '\n';
                                if (oi0Var.b()) {
                                    int i16 = si0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > oi0Var.d - (si0Var2.J != null ? org.telegram.messenger.w1.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.w1.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z11 = true;
                                            if (z14 != z11) {
                                                int i17 = si0Var2.d;
                                                if (z14) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    si0VarArr = si0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z15 = Selection.getSelectionStart(spannableStringBuilder) == si0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                                    int i18 = si0Var2.d;
                                                    if (si0Var2.K == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        si0Var2.K = spannableString;
                                                        charSequence = text;
                                                        si0VarArr = si0VarArr2;
                                                        spannableString.setSpan(new qi0(), 0, si0Var2.K.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        si0VarArr = si0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) si0Var2.K);
                                                    if (z15) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = si0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                si0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(si0VarArr[i12]);
                                                spannable.removeSpan(si0VarArr[i12].s);
                                                spannable.setSpan(si0VarArr[i12], si0Var2.c, si0Var2.d, 33);
                                                spannable.setSpan(si0VarArr[i12].s, si0Var2.c, si0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                si0VarArr = si0VarArr2;
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
                                si0VarArr = si0VarArr2;
                                z10 = true;
                            }
                            ji.c6 c6Var = si0Var2.v;
                            if (c6Var != null) {
                                spannable.removeSpan(c6Var);
                            }
                            if (si0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(si0Var2.c) + 3, layout.getLineCount()))) < (i10 = si0Var2.d)) {
                                if (si0Var2.v == null) {
                                    si0Var2.v = new ji.c6(si0Var2);
                                }
                                spannable.setSpan(si0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(si0VarArr2[i12]);
                            spannable.removeSpan(si0VarArr2[i12].s);
                            ji.c6 c6Var2 = si0VarArr2[i12].v;
                            if (c6Var2 != null) {
                                spannable.removeSpan(c6Var2);
                            }
                            charSequence = text;
                            si0VarArr = si0VarArr2;
                            i12++;
                            buVar2 = buVar;
                            text = charSequence;
                            si0VarArr2 = si0VarArr;
                        }
                    } else {
                        charSequence = text;
                        si0VarArr = si0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (si0VarArr[i12].n != z12 && zArr != null) {
                        zArr[0] = z10;
                    }
                    arrayList2.add(oi0Var);
                    i12++;
                    buVar2 = buVar;
                    text = charSequence;
                    si0VarArr2 = si0VarArr;
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
                for (si0 si0Var : (si0[]) spanned.getSpans(0, spanned.length(), si0.class)) {
                    boolean z10 = si0Var.n;
                    oi0 oi0Var = new oi0(null, layout, spanned, si0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(oi0Var);
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
