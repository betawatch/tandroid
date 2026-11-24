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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ey8 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public u20 K;
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
    public final dy8 s;
    public yk w;
    public final Drawable x;
    public final Paint y;

    public ey8(boolean z, boolean z2, dy8 dy8Var) {
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
        this.s = dy8Var;
        this.e = z2;
        this.x = b00.d(a.b, R.drawable.mini_quote);
        paint2.setColor(this.J);
        paint.setColor(bm2.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        dy8[] dy8VarArr = (dy8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dy8.class);
        int i = 0;
        while (true) {
            if (i >= dy8VarArr.length) {
                break;
            }
            dy8 dy8Var = dy8VarArr[i];
            int spanStart = spannableStringBuilder.getSpanStart(dy8Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(dy8Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | (dy8Var.a.e ? 16 : 1)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(dy8Var);
            spannableStringBuilder.removeSpan(dy8Var.a);
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
        ey8[] ey8VarArr = (ey8[]) spannable.getSpans(i, i2, ey8.class);
        if (ey8VarArr == null || ey8VarArr.length <= 0) {
            int j = Utilities.j(i, spannable.length(), 0);
            int j2 = Utilities.j(i2, spannable.length(), 0);
            dy8 dy8Var = new dy8();
            ey8 ey8Var = new ey8(false, z, dy8Var);
            dy8Var.a = ey8Var;
            ey8Var.c = j;
            ey8Var.d = j2;
            spannable.setSpan(dy8Var, j, j2, 33);
            spannable.setSpan(ey8Var, j, j2, 33);
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
        dy8 dy8Var = new dy8();
        ey8 ey8Var = new ey8(true, z, dy8Var);
        dy8Var.a = ey8Var;
        ey8Var.c = j;
        ey8Var.d = j2;
        editable.setSpan(ey8Var, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.setSpan(dy8Var, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.insert(Utilities.j(j2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j2, editable.length(), 0), Utilities.j(i3, editable.length(), 0));
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(lt3 lt3Var, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        ey8[] ey8VarArr;
        boolean z;
        boolean z2;
        int lineStart;
        int i;
        boolean z3;
        int i2;
        lt3 lt3Var2 = lt3Var;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z4 = false;
                ey8[] ey8VarArr2 = (ey8[]) spannable.getSpans(0, spannable.length(), ey8.class);
                ArrayList arrayList2 = arrayList;
                int i3 = 0;
                while (i3 < ey8VarArr2.length) {
                    ey8 ey8Var = ey8VarArr2[i3];
                    boolean z5 = ey8Var.n;
                    ay8 ay8Var = new ay8(lt3Var2, layout, spannable, ey8Var);
                    if (ey8Var.a) {
                        int i4 = ey8Var.c;
                        if (i4 == 0 || text.charAt(i4 - 1) == '\n') {
                            if (ey8Var.d != text.length() && text.charAt(ey8Var.d) != '\n') {
                                int i5 = ey8Var.d;
                                while (i5 <= text.length() && i5 != text.length() && text.charAt(i5) != '\n') {
                                    i5++;
                                }
                                spannable.removeSpan(ey8VarArr2[i3]);
                                spannable.removeSpan(ey8VarArr2[i3].s);
                                spannable.setSpan(ey8VarArr2[i3], ey8Var.c, i5, 33);
                                spannable.setSpan(ey8VarArr2[i3].s, ey8Var.c, i5, 33);
                                ay8Var = new ay8(lt3Var2, layout, spannable, ey8VarArr2[i3]);
                            }
                            boolean z6 = spannable instanceof SpannableStringBuilder;
                            ey8 ey8Var2 = ay8Var.e;
                            if (z6) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i6 = ey8Var2.d - 1;
                                boolean z7 = (i6 < 0 || spannableStringBuilder.charAt(i6) != '\n') ? z4 : true;
                                if (ay8Var.b()) {
                                    int i7 = ey8Var2.d;
                                    if (i7 - 2 >= 0) {
                                        z = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i7 - 1)) - gl.L(12.0f) > ay8Var.d - (ey8Var2.K != null ? (gl.L(23.66f) + r12.b) + (gl.L(3.333f) << 1) : gl.L(23.66f) + (gl.L(3.333f) << 1))) {
                                            z3 = true;
                                            if (z7 != z3) {
                                                int i8 = ey8Var2.d;
                                                if (z7) {
                                                    i2 = i8 - 1;
                                                    spannableStringBuilder.delete(i8 - 1, i8);
                                                    charSequence = text;
                                                    ey8VarArr = ey8VarArr2;
                                                } else {
                                                    i2 = i8 + 2;
                                                    boolean z8 = (Selection.getSelectionStart(spannableStringBuilder) == ey8Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z : z4;
                                                    int i9 = ey8Var2.d;
                                                    if (ey8Var2.L == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        ey8Var2.L = spannableString;
                                                        charSequence = text;
                                                        ey8VarArr = ey8VarArr2;
                                                        spannableString.setSpan(new cy8(), 0, ey8Var2.L.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        ey8VarArr = ey8VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i9, (CharSequence) ey8Var2.L);
                                                    if (z8) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i10 = ey8Var2.d;
                                                        if (selectionStart != i10) {
                                                            Selection.setSelection(spannableStringBuilder, i10, i10);
                                                        }
                                                    }
                                                }
                                                ey8Var2.d = Math.min(i2, spannable.length());
                                                spannable.removeSpan(ey8VarArr[i3]);
                                                spannable.removeSpan(ey8VarArr[i3].s);
                                                spannable.setSpan(ey8VarArr[i3], ey8Var2.c, ey8Var2.d, 33);
                                                spannable.setSpan(ey8VarArr[i3].s, ey8Var2.c, ey8Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z;
                                                }
                                            } else {
                                                charSequence = text;
                                                ey8VarArr = ey8VarArr2;
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
                                ey8VarArr = ey8VarArr2;
                                z = true;
                            }
                            yk ykVar = ey8Var2.w;
                            if (ykVar != null) {
                                spannable.removeSpan(ykVar);
                            }
                            if (ey8Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(ey8Var2.c) + 3, layout.getLineCount()))) < (i = ey8Var2.d)) {
                                yk ykVar2 = ey8Var2.w;
                                if (ykVar2 == null) {
                                    ykVar2 = new yk(ey8Var2);
                                    ey8Var2.w = ykVar2;
                                }
                                spannable.setSpan(ykVar2, lineStart, i, 33);
                            }
                        } else {
                            spannable.removeSpan(ey8VarArr2[i3]);
                            spannable.removeSpan(ey8VarArr2[i3].s);
                            yk ykVar3 = ey8VarArr2[i3].w;
                            if (ykVar3 != null) {
                                spannable.removeSpan(ykVar3);
                            }
                            charSequence = text;
                            ey8VarArr = ey8VarArr2;
                            z2 = z4;
                            i3++;
                            lt3Var2 = lt3Var;
                            z4 = z2;
                            text = charSequence;
                            ey8VarArr2 = ey8VarArr;
                        }
                    } else {
                        charSequence = text;
                        ey8VarArr = ey8VarArr2;
                        z = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (ey8VarArr[i3].n == z5 || zArr == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                        zArr[0] = z;
                    }
                    arrayList2.add(ay8Var);
                    i3++;
                    lt3Var2 = lt3Var;
                    z4 = z2;
                    text = charSequence;
                    ey8VarArr2 = ey8VarArr;
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
                for (ey8 ey8Var : (ey8[]) spanned.getSpans(0, spanned.length(), ey8.class)) {
                    boolean z = ey8Var.n;
                    ay8 ay8Var = new ay8(null, layout, spanned, ey8Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ay8Var);
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
        return gl.L(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }
}
