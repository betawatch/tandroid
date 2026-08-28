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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fi0 implements LeadingMarginSpan {
    public final Path A;
    public final Paint B;
    public final float[] C;
    public final Path D;
    public int E;
    public xh0 F;
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
    public final ei0 s;
    public ba0 v;
    public final Drawable w;
    public final Paint x;
    public final float[] y;

    public fi0(boolean z10, boolean z11, ei0 ei0Var) {
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
        this.s = ei0Var;
        this.e = z11;
        this.w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.E);
        paint.setColor(i0.a.k(this.E, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ei0[] ei0VarArr = (ei0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ei0.class);
        int i9 = 0;
        while (true) {
            if (i9 >= ei0VarArr.length) {
                break;
            }
            ei0 ei0Var = ei0VarArr[i9];
            int spanStart = spannableStringBuilder.getSpanStart(ei0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(ei0Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((ei0Var.a.e ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(ei0Var);
            spannableStringBuilder.removeSpan(ei0Var.a);
            i9++;
        }
        Iterator it = treeSet.iterator();
        int i10 = 0;
        int i11 = 0;
        loop1: while (true) {
            z10 = false;
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
                    if ((intValue2 & 16) != 0) {
                        z10 = true;
                    }
                }
            }
        }
        if (i10 >= spannableStringBuilder.length() || i11 <= 0) {
            return;
        }
        c(spannableStringBuilder, i10, spannableStringBuilder.length(), z10);
    }

    public static void b(Spannable spannable, int i9, int i10, boolean z10) {
        fi0[] fi0VarArr = (fi0[]) spannable.getSpans(i9, i10, fi0.class);
        if (fi0VarArr == null || fi0VarArr.length <= 0) {
            int clamp = Utilities.clamp(i9, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i10, spannable.length(), 0);
            ei0 ei0Var = new ei0();
            fi0 fi0Var = new fi0(false, z10, ei0Var);
            ei0Var.a = fi0Var;
            fi0Var.c = clamp;
            fi0Var.d = clamp2;
            spannable.setSpan(ei0Var, clamp, clamp2, 33);
            spannable.setSpan(fi0Var, clamp, clamp2, 33);
        }
    }

    public static int c(Editable editable, int i9, int i10, boolean z10) {
        if (editable == null) {
            return -1;
        }
        int clamp = Utilities.clamp(i9, editable.length(), 0);
        int clamp2 = Utilities.clamp(i10, editable.length(), 0);
        if (clamp > 0 && editable.charAt(clamp - 1) != '\n') {
            editable.insert(clamp, "\n");
            clamp++;
            clamp2++;
        }
        int i11 = clamp2 + 1;
        if (clamp2 >= editable.length() || editable.charAt(clamp2) != '\n') {
            editable.insert(clamp2, "\n");
        }
        ei0 ei0Var = new ei0();
        fi0 fi0Var = new fi0(true, z10, ei0Var);
        ei0Var.a = fi0Var;
        fi0Var.c = clamp;
        fi0Var.d = clamp2;
        editable.setSpan(fi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(ei0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i11, editable.length(), 0));
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(ot otVar, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        fi0[] fi0VarArr;
        boolean z10;
        int lineStart;
        int i9;
        boolean z11;
        int i10;
        ot otVar2 = otVar;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                fi0[] fi0VarArr2 = (fi0[]) spannable.getSpans(0, spannable.length(), fi0.class);
                ArrayList arrayList2 = arrayList;
                int i11 = 0;
                while (i11 < fi0VarArr2.length) {
                    fi0 fi0Var = fi0VarArr2[i11];
                    boolean z12 = fi0Var.n;
                    bi0 bi0Var = new bi0(otVar2, layout, spannable, fi0Var);
                    if (fi0Var.a) {
                        int i12 = fi0Var.c;
                        if (i12 == 0 || text.charAt(i12 - 1) == '\n') {
                            if (fi0Var.d != text.length() && text.charAt(fi0Var.d) != '\n') {
                                int i13 = fi0Var.d;
                                while (i13 <= text.length() && i13 != text.length() && text.charAt(i13) != '\n') {
                                    i13++;
                                }
                                spannable.removeSpan(fi0VarArr2[i11]);
                                spannable.removeSpan(fi0VarArr2[i11].s);
                                spannable.setSpan(fi0VarArr2[i11], fi0Var.c, i13, 33);
                                spannable.setSpan(fi0VarArr2[i11].s, fi0Var.c, i13, 33);
                                bi0Var = new bi0(otVar2, layout, spannable, fi0VarArr2[i11]);
                            }
                            boolean z13 = spannable instanceof SpannableStringBuilder;
                            fi0 fi0Var2 = bi0Var.e;
                            if (z13) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i14 = fi0Var2.d - 1;
                                boolean z14 = i14 >= 0 && spannableStringBuilder.charAt(i14) == '\n';
                                if (bi0Var.b()) {
                                    int i15 = fi0Var2.d;
                                    if (i15 - 2 >= 0) {
                                        z10 = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i15 - 1)) - AndroidUtilities.dp(12.0f) > bi0Var.d - (fi0Var2.F != null ? org.telegram.messenger.l0.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r12.c) : org.telegram.messenger.l0.D(3.333f, 2, AndroidUtilities.dp(23.66f)))) {
                                            z11 = true;
                                            if (z14 != z11) {
                                                int i16 = fi0Var2.d;
                                                if (z14) {
                                                    i10 = i16 - 1;
                                                    spannableStringBuilder.delete(i16 - 1, i16);
                                                    charSequence = text;
                                                    fi0VarArr = fi0VarArr2;
                                                } else {
                                                    i10 = i16 + 2;
                                                    boolean z15 = Selection.getSelectionStart(spannableStringBuilder) == fi0Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                                    int i17 = fi0Var2.d;
                                                    if (fi0Var2.G == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        fi0Var2.G = spannableString;
                                                        charSequence = text;
                                                        fi0VarArr = fi0VarArr2;
                                                        spannableString.setSpan(new di0(), 0, fi0Var2.G.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        fi0VarArr = fi0VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i17, (CharSequence) fi0Var2.G);
                                                    if (z15) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i18 = fi0Var2.d;
                                                        if (selectionStart != i18) {
                                                            Selection.setSelection(spannableStringBuilder, i18, i18);
                                                        }
                                                    }
                                                }
                                                fi0Var2.d = Math.min(i10, spannable.length());
                                                spannable.removeSpan(fi0VarArr[i11]);
                                                spannable.removeSpan(fi0VarArr[i11].s);
                                                spannable.setSpan(fi0VarArr[i11], fi0Var2.c, fi0Var2.d, 33);
                                                spannable.setSpan(fi0VarArr[i11].s, fi0Var2.c, fi0Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z10;
                                                }
                                            } else {
                                                charSequence = text;
                                                fi0VarArr = fi0VarArr2;
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
                                fi0VarArr = fi0VarArr2;
                                z10 = true;
                            }
                            ba0 ba0Var = fi0Var2.v;
                            if (ba0Var != null) {
                                spannable.removeSpan(ba0Var);
                            }
                            if (fi0Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(fi0Var2.c) + 3, layout.getLineCount()))) < (i9 = fi0Var2.d)) {
                                if (fi0Var2.v == null) {
                                    fi0Var2.v = new ba0(fi0Var2);
                                }
                                spannable.setSpan(fi0Var2.v, lineStart, i9, 33);
                            }
                        } else {
                            spannable.removeSpan(fi0VarArr2[i11]);
                            spannable.removeSpan(fi0VarArr2[i11].s);
                            ba0 ba0Var2 = fi0VarArr2[i11].v;
                            if (ba0Var2 != null) {
                                spannable.removeSpan(ba0Var2);
                            }
                            charSequence = text;
                            fi0VarArr = fi0VarArr2;
                            i11++;
                            otVar2 = otVar;
                            text = charSequence;
                            fi0VarArr2 = fi0VarArr;
                        }
                    } else {
                        charSequence = text;
                        fi0VarArr = fi0VarArr2;
                        z10 = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (fi0VarArr[i11].n != z12 && zArr != null) {
                        zArr[0] = z10;
                    }
                    arrayList2.add(bi0Var);
                    i11++;
                    otVar2 = otVar;
                    text = charSequence;
                    fi0VarArr2 = fi0VarArr;
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
                for (fi0 fi0Var : (fi0[]) spanned.getSpans(0, spanned.length(), fi0.class)) {
                    boolean z10 = fi0Var.n;
                    bi0 bi0Var = new bi0(null, layout, spanned, fi0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bi0Var);
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
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i9, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
    }
}
