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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hi0 implements LeadingMarginSpan {
    public final Path A;
    public final Paint B;
    public final float[] C;
    public final Path D;
    public int E;
    public zh0 F;
    public SpannableString G;
    public final boolean a;
    public boolean b = true;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final gi0 s;
    public fa0 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public hi0(boolean z10, boolean z11, gi0 gi0Var) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new float[8];
        this.A = new Path();
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new float[8];
        this.D = new Path();
        this.E = -1;
        this.a = z10;
        this.s = gi0Var;
        this.e = z11;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.E);
        paint.setColor(i0.b.k(this.E, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        gi0[] gi0VarArr = (gi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gi0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= gi0VarArr.length) {
                break;
            }
            gi0 gi0Var = gi0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(gi0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(gi0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((gi0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(gi0Var);
            spannableStringBuilder.removeSpan(gi0Var.a);
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
        hi0[] hi0VarArr = (hi0[]) spannable.getSpans(i10, i11, hi0.class);
        if (hi0VarArr == null || hi0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            gi0 gi0Var = new gi0();
            hi0 hi0Var = new hi0(false, z10, gi0Var);
            gi0Var.a = hi0Var;
            hi0Var.c = clamp;
            hi0Var.d = clamp2;
            spannable.setSpan(gi0Var, clamp, clamp2, 33);
            spannable.setSpan(hi0Var, clamp, clamp2, 33);
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
        gi0 gi0Var = new gi0();
        hi0 hi0Var = new hi0(true, z10, gi0Var);
        gi0Var.a = hi0Var;
        hi0Var.c = clamp;
        hi0Var.d = clamp2;
        editable.setSpan(hi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(gi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(nt ntVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        hi0[] hi0VarArr;
        boolean z10;
        int lineStart;
        int i10;
        boolean z11;
        int i11;
        nt ntVar2 = ntVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                hi0[] hi0VarArr2 = (hi0[]) spannable.getSpans(0, spannable.length(), hi0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < hi0VarArr2.length) {
                    hi0 hi0Var = hi0VarArr2[i12];
                    boolean z12 = hi0Var.n;
                    di0 di0Var = new di0(ntVar2, layout, spannable, hi0Var);
                    if (hi0Var.a) {
                        int i13 = hi0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (hi0Var.d != text.length() && text.charAt(hi0Var.d) != '\n') {
                                int i14 = hi0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(hi0VarArr2[i12]);
                                spannable.removeSpan(hi0VarArr2[i12].s);
                                spannable.setSpan(hi0VarArr2[i12], hi0Var.c, i14, 33);
                                spannable.setSpan(hi0VarArr2[i12].s, hi0Var.c, i14, 33);
                                di0Var = new di0(ntVar2, layout, spannable, hi0VarArr2[i12]);
                            }
                            boolean z13 = spannable instanceof SpannableStringBuilder;
                            hi0 hi0Var2 = di0Var.e;
                            if (z13) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = hi0Var2.d - 1;
                                boolean z14 = i15 >= 0 && spannableStringBuilder.charAt(i15) == '\n';
                                if (di0Var.b()) {
                                    int i16 = hi0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > di0Var.d - (hi0Var2.F != null ? org.telegram.messenger.y1.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.y1.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z11 = true;
                                            if (z14 != z11) {
                                                int i17 = hi0Var2.d;
                                                if (z14) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    hi0VarArr = hi0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z15 = Selection.getSelectionStart(spannableStringBuilder) == hi0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                                    int i18 = hi0Var2.d;
                                                    if (hi0Var2.G == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        hi0Var2.G = spannableString;
                                                        charSequence = text;
                                                        hi0VarArr = hi0VarArr2;
                                                        spannableString.setSpan(new fi0(), 0, hi0Var2.G.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        hi0VarArr = hi0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) hi0Var2.G);
                                                    if (z15) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = hi0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                hi0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(hi0VarArr[i12]);
                                                spannable.removeSpan(hi0VarArr[i12].s);
                                                spannable.setSpan(hi0VarArr[i12], hi0Var2.c, hi0Var2.d, 33);
                                                spannable.setSpan(hi0VarArr[i12].s, hi0Var2.c, hi0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                hi0VarArr = hi0VarArr2;
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
                                hi0VarArr = hi0VarArr2;
                                z10 = true;
                            }
                            fa0 fa0Var = hi0Var2.v;
                            if (fa0Var != null) {
                                spannable.removeSpan(fa0Var);
                            }
                            if (hi0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(hi0Var2.c) + 3, layout.getLineCount()))) < (i10 = hi0Var2.d)) {
                                if (hi0Var2.v == null) {
                                    hi0Var2.v = new fa0(hi0Var2);
                                }
                                spannable.setSpan(hi0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(hi0VarArr2[i12]);
                            spannable.removeSpan(hi0VarArr2[i12].s);
                            fa0 fa0Var2 = hi0VarArr2[i12].v;
                            if (fa0Var2 != null) {
                                spannable.removeSpan(fa0Var2);
                            }
                            charSequence = text;
                            hi0VarArr = hi0VarArr2;
                            i12++;
                            ntVar2 = ntVar;
                            text = charSequence;
                            hi0VarArr2 = hi0VarArr;
                        }
                    } else {
                        charSequence = text;
                        hi0VarArr = hi0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (hi0VarArr[i12].n != z12 && zArr != null) {
                        zArr[0] = z10;
                    }
                    arrayList2.add(di0Var);
                    i12++;
                    ntVar2 = ntVar;
                    text = charSequence;
                    hi0VarArr2 = hi0VarArr;
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
                for (hi0 hi0Var : (hi0[]) spanned.getSpans(0, spanned.length(), hi0.class)) {
                    boolean z10 = hi0Var.n;
                    di0 di0Var = new di0(null, layout, spanned, hi0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(di0Var);
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
