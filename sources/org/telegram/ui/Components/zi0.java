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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zi0 implements LeadingMarginSpan {
    public final Path B;
    public final Paint C;
    public final float[] D;
    public final Path E;
    public int F;
    public ri0 G;
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
    public final yi0 s;
    public ua0 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public zi0(boolean z4, boolean z10, yi0 yi0Var) {
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
        this.s = yi0Var;
        this.e = z10;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.F);
        paint.setColor(i0.a.k(this.F, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z4;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        yi0[] yi0VarArr = (yi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yi0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= yi0VarArr.length) {
                break;
            }
            yi0 yi0Var = yi0VarArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(yi0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(yi0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((yi0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(yi0Var);
            spannableStringBuilder.removeSpan(yi0Var.a);
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
        zi0[] zi0VarArr = (zi0[]) spannable.getSpans(i10, i11, zi0.class);
        if (zi0VarArr == null || zi0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i10, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
            yi0 yi0Var = new yi0();
            zi0 zi0Var = new zi0(false, z4, yi0Var);
            yi0Var.a = zi0Var;
            zi0Var.c = clamp;
            zi0Var.d = clamp2;
            spannable.setSpan(yi0Var, clamp, clamp2, 33);
            spannable.setSpan(zi0Var, clamp, clamp2, 33);
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
        yi0 yi0Var = new yi0();
        zi0 zi0Var = new zi0(true, z4, yi0Var);
        yi0Var.a = zi0Var;
        zi0Var.c = clamp;
        zi0Var.d = clamp2;
        editable.setSpan(zi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(yi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(xt xtVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        zi0[] zi0VarArr;
        boolean z4;
        int lineStart;
        int i10;
        boolean z10;
        int i11;
        xt xtVar2 = xtVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                zi0[] zi0VarArr2 = (zi0[]) spannable.getSpans(0, spannable.length(), zi0.class);
                ArrayList arrayList2 = arrayList;
                int i12 = 0;
                while (i12 < zi0VarArr2.length) {
                    zi0 zi0Var = zi0VarArr2[i12];
                    boolean z11 = zi0Var.n;
                    vi0 vi0Var = new vi0(xtVar2, layout, spannable, zi0Var);
                    if (zi0Var.a) {
                        int i13 = zi0Var.c;
                        if (i13 == 0 || text.charAt(i13 - 1) == '\n') {
                            if (zi0Var.d != text.length() && text.charAt(zi0Var.d) != '\n') {
                                int i14 = zi0Var.d;
                                while (i14 <= text.length() && i14 != text.length() && text.charAt(i14) != '\n') {
                                    i14++;
                                }
                                spannable.removeSpan(zi0VarArr2[i12]);
                                spannable.removeSpan(zi0VarArr2[i12].s);
                                spannable.setSpan(zi0VarArr2[i12], zi0Var.c, i14, 33);
                                spannable.setSpan(zi0VarArr2[i12].s, zi0Var.c, i14, 33);
                                vi0Var = new vi0(xtVar2, layout, spannable, zi0VarArr2[i12]);
                            }
                            boolean z12 = spannable instanceof SpannableStringBuilder;
                            zi0 zi0Var2 = vi0Var.e;
                            if (z12) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i15 = zi0Var2.d - 1;
                                boolean z13 = i15 >= 0 && spannableStringBuilder.charAt(i15) == '\n';
                                if (vi0Var.b()) {
                                    int i16 = zi0Var2.d;
                                    if (i16 - 2 >= 0) {
                                        z4 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i16 - 1)) - AndroidUtilities.dp(12.0f) > vi0Var.d - (zi0Var2.G != null ? org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z10 = true;
                                            if (z13 != z10) {
                                                int i17 = zi0Var2.d;
                                                if (z13) {
                                                    i11 = i17 - 1;
                                                    spannableStringBuilder.delete(i17 - 1, i17);
                                                    charSequence = text;
                                                    zi0VarArr = zi0VarArr2;
                                                } else {
                                                    i11 = i17 + 2;
                                                    boolean z14 = Selection.getSelectionStart(spannableStringBuilder) == zi0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                                    int i18 = zi0Var2.d;
                                                    if (zi0Var2.H == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        zi0Var2.H = spannableString;
                                                        charSequence = text;
                                                        zi0VarArr = zi0VarArr2;
                                                        spannableString.setSpan(new xi0(), 0, zi0Var2.H.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        zi0VarArr = zi0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i18, (CharSequence) zi0Var2.H);
                                                    if (z14) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i19 = zi0Var2.d;
                                                        if (selectionStart != i19) {
                                                            Selection.setSelection(spannableStringBuilder, i19, i19);
                                                        }
                                                    }
                                                }
                                                zi0Var2.d = Math.min(i11, spannable.length());
                                                spannable.removeSpan(zi0VarArr[i12]);
                                                spannable.removeSpan(zi0VarArr[i12].s);
                                                spannable.setSpan(zi0VarArr[i12], zi0Var2.c, zi0Var2.d, 33);
                                                spannable.setSpan(zi0VarArr[i12].s, zi0Var2.c, zi0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z4;
                                                }
                                            } else {
                                                charSequence = text;
                                                zi0VarArr = zi0VarArr2;
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
                                zi0VarArr = zi0VarArr2;
                                z4 = true;
                            }
                            ua0 ua0Var = zi0Var2.v;
                            if (ua0Var != null) {
                                spannable.removeSpan(ua0Var);
                            }
                            if (zi0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(zi0Var2.c) + 3, layout.getLineCount()))) < (i10 = zi0Var2.d)) {
                                if (zi0Var2.v == null) {
                                    zi0Var2.v = new ua0(zi0Var2);
                                }
                                spannable.setSpan(zi0Var2.v, lineStart, i10, 33);
                            }
                        } else {
                            spannable.removeSpan(zi0VarArr2[i12]);
                            spannable.removeSpan(zi0VarArr2[i12].s);
                            ua0 ua0Var2 = zi0VarArr2[i12].v;
                            if (ua0Var2 != null) {
                                spannable.removeSpan(ua0Var2);
                            }
                            charSequence = text;
                            zi0VarArr = zi0VarArr2;
                            i12++;
                            xtVar2 = xtVar;
                            text = charSequence;
                            zi0VarArr2 = zi0VarArr;
                        }
                    } else {
                        charSequence = text;
                        zi0VarArr = zi0VarArr2;
                        z4 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (zi0VarArr[i12].n != z11 && zArr != null) {
                        zArr[0] = z4;
                    }
                    arrayList2.add(vi0Var);
                    i12++;
                    xtVar2 = xtVar;
                    text = charSequence;
                    zi0VarArr2 = zi0VarArr;
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
                for (zi0 zi0Var : (zi0[]) spanned.getSpans(0, spanned.length(), zi0.class)) {
                    boolean z4 = zi0Var.n;
                    vi0 vi0Var = new vi0(null, layout, spanned, zi0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(vi0Var);
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
