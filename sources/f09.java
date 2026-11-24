// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f09 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public u30 K;
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
    public final e09 s;
    public yl w;
    public final Drawable x;
    public final Paint y;

    public f09(boolean z, boolean z2, e09 e09Var) {
        Paint paint = new Paint(1);
        this.y = paint;
        this.E = new float[8];
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new float[8];
        this.I = new Path();
        this.J = -1;
        this.a = z;
        this.s = e09Var;
        this.e = z2;
        this.x = b10.d(a.b, R.drawable.mini_quote);
        paint2.setColor(this.J);
        paint.setColor(on2.p(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        e09[] e09VarArr = (e09[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), e09.class);
        int i = 0;
        while (true) {
            if (i >= e09VarArr.length) {
                break;
            }
            e09 e09Var = e09VarArr[i];
            int spanStart = spannableStringBuilder.getSpanStart(e09Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(e09Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | (e09Var.a.e ? 16 : 1)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(e09Var);
            spannableStringBuilder.removeSpan(e09Var.a);
            i++;
        }
        Iterator it = treeSet.iterator();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i2 != intValue) {
                int i4 = intValue - 1;
                int i5 = (i4 < 0 || i4 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i4) != '\n') ? intValue : intValue - 1;
                if (i3 > 0) {
                    c(spannableStringBuilder, i2, i5, z);
                }
                i2 = intValue + 1;
                if (i2 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                    i2 = intValue;
                }
            }
            if ((intValue2 & 2) != 0) {
                i3--;
            }
            if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                i3++;
                z = (intValue2 & 16) != 0;
            }
        }
        if (i2 >= spannableStringBuilder.length() || i3 <= 0) {
            return;
        }
        c(spannableStringBuilder, i2, spannableStringBuilder.length(), z);
    }

    public static void b(Spannable spannable, int i, int i2, boolean z) {
        f09[] f09VarArr = (f09[]) spannable.getSpans(i, i2, f09.class);
        if (f09VarArr == null || f09VarArr.length <= 0) {
            int j = Utilities.j(i, spannable.length(), 0);
            int j2 = Utilities.j(i2, spannable.length(), 0);
            e09 e09Var = new e09();
            f09 f09Var = new f09(false, z, e09Var);
            e09Var.a = f09Var;
            f09Var.c = j;
            f09Var.d = j2;
            spannable.setSpan(e09Var, j, j2, 33);
            spannable.setSpan(f09Var, j, j2, 33);
        }
    }

    public static int c(Editable editable, int i, int i2, boolean z) {
        if (editable == null) {
            return -1;
        }
        int j = Utilities.j(i, editable.length(), 0);
        int j2 = Utilities.j(i2, editable.length(), 0);
        if (j > 0 && editable.charAt(j - 1) != '\n') {
            editable.insert(j, "\n");
            j++;
            j2++;
        }
        int i3 = j2 + 1;
        if (j2 >= editable.length() || editable.charAt(j2) != '\n') {
            editable.insert(j2, "\n");
        }
        e09 e09Var = new e09();
        f09 f09Var = new f09(true, z, e09Var);
        e09Var.a = f09Var;
        f09Var.c = j;
        f09Var.d = j2;
        editable.setSpan(f09Var, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.setSpan(e09Var, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.insert(Utilities.j(j2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j2, editable.length(), 0), Utilities.j(i3, editable.length(), 0));
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(vu3 vu3Var, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        f09[] f09VarArr;
        boolean z;
        boolean z2;
        int lineStart;
        int i;
        boolean z3;
        int i2;
        vu3 vu3Var2 = vu3Var;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z4 = false;
                f09[] f09VarArr2 = (f09[]) spannable.getSpans(0, spannable.length(), f09.class);
                ArrayList arrayList2 = arrayList;
                int i3 = 0;
                while (i3 < f09VarArr2.length) {
                    f09 f09Var = f09VarArr2[i3];
                    boolean z5 = f09Var.n;
                    b09 b09Var = new b09(vu3Var2, layout, spannable, f09Var);
                    if (f09Var.a) {
                        int i4 = f09Var.c;
                        if (i4 == 0 || text.charAt(i4 - 1) == '\n') {
                            if (f09Var.d != text.length() && text.charAt(f09Var.d) != '\n') {
                                int i5 = f09Var.d;
                                while (i5 <= text.length() && i5 != text.length() && text.charAt(i5) != '\n') {
                                    i5++;
                                }
                                spannable.removeSpan(f09VarArr2[i3]);
                                spannable.removeSpan(f09VarArr2[i3].s);
                                spannable.setSpan(f09VarArr2[i3], f09Var.c, i5, 33);
                                spannable.setSpan(f09VarArr2[i3].s, f09Var.c, i5, 33);
                                b09Var = new b09(vu3Var2, layout, spannable, f09VarArr2[i3]);
                            }
                            boolean z6 = spannable instanceof SpannableStringBuilder;
                            f09 f09Var2 = b09Var.e;
                            if (z6) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i6 = f09Var2.d - 1;
                                boolean z7 = (i6 < 0 || spannableStringBuilder.charAt(i6) != '\n') ? z4 : true;
                                if (b09Var.b()) {
                                    int i7 = f09Var2.d;
                                    if (i7 - 2 >= 0) {
                                        z = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i7 - 1)) - gm.L(12.0f) > b09Var.d - (f09Var2.K != null ? (gm.L(23.66f) + r12.b) + (gm.L(3.333f) << 1) : gm.L(23.66f) + (gm.L(3.333f) << 1))) {
                                            z3 = true;
                                            if (z7 != z3) {
                                                int i8 = f09Var2.d;
                                                if (z7) {
                                                    i2 = i8 - 1;
                                                    spannableStringBuilder.delete(i8 - 1, i8);
                                                    charSequence = text;
                                                    f09VarArr = f09VarArr2;
                                                } else {
                                                    i2 = i8 + 2;
                                                    boolean z8 = (Selection.getSelectionStart(spannableStringBuilder) == f09Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z : z4;
                                                    int i9 = f09Var2.d;
                                                    if (f09Var2.L == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        f09Var2.L = spannableString;
                                                        charSequence = text;
                                                        f09VarArr = f09VarArr2;
                                                        spannableString.setSpan(new d09(), 0, f09Var2.L.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        f09VarArr = f09VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i9, (CharSequence) f09Var2.L);
                                                    if (z8) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i10 = f09Var2.d;
                                                        if (selectionStart != i10) {
                                                            Selection.setSelection(spannableStringBuilder, i10, i10);
                                                        }
                                                    }
                                                }
                                                f09Var2.d = Math.min(i2, spannable.length());
                                                spannable.removeSpan(f09VarArr[i3]);
                                                spannable.removeSpan(f09VarArr[i3].s);
                                                spannable.setSpan(f09VarArr[i3], f09Var2.c, f09Var2.d, 33);
                                                spannable.setSpan(f09VarArr[i3].s, f09Var2.c, f09Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z;
                                                }
                                            } else {
                                                charSequence = text;
                                                f09VarArr = f09VarArr2;
                                            }
                                        }
                                        z3 = z4;
                                        if (z7 != z3) {
                                        }
                                    }
                                }
                                z = true;
                                z3 = z4;
                                if (z7 != z3) {
                                }
                            } else {
                                charSequence = text;
                                f09VarArr = f09VarArr2;
                                z = true;
                            }
                            yl ylVar = f09Var2.w;
                            if (ylVar != null) {
                                spannable.removeSpan(ylVar);
                            }
                            if (f09Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(f09Var2.c) + 3, layout.getLineCount()))) < (i = f09Var2.d)) {
                                yl ylVar2 = f09Var2.w;
                                if (ylVar2 == null) {
                                    ylVar2 = new yl(f09Var2);
                                    f09Var2.w = ylVar2;
                                }
                                spannable.setSpan(ylVar2, lineStart, i, 33);
                            }
                        } else {
                            spannable.removeSpan(f09VarArr2[i3]);
                            spannable.removeSpan(f09VarArr2[i3].s);
                            yl ylVar3 = f09VarArr2[i3].w;
                            if (ylVar3 != null) {
                                spannable.removeSpan(ylVar3);
                            }
                            charSequence = text;
                            f09VarArr = f09VarArr2;
                            z2 = z4;
                            i3++;
                            vu3Var2 = vu3Var;
                            z4 = z2;
                            text = charSequence;
                            f09VarArr2 = f09VarArr;
                        }
                    } else {
                        charSequence = text;
                        f09VarArr = f09VarArr2;
                        z = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (f09VarArr[i3].n == z5 || zArr == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                        zArr[0] = z;
                    }
                    arrayList2.add(b09Var);
                    i3++;
                    vu3Var2 = vu3Var;
                    z4 = z2;
                    text = charSequence;
                    f09VarArr2 = f09VarArr;
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
                for (f09 f09Var : (f09[]) spanned.getSpans(0, spanned.length(), f09.class)) {
                    boolean z = f09Var.n;
                    b09 b09Var = new b09(null, layout, spanned, f09Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(b09Var);
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
    public final int getLeadingMargin(boolean z) {
        return gm.L(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }
}
