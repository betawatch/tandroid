// default package

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fb2 extends AccessibilityNodeProvider {
    public final wb2 a;
    public final Path b = new Path();
    public final RectF c = new RectF();
    public final Rect d = new Rect();

    public fb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final ClickableSpan a(int i, boolean z) {
        if (i == 5000) {
            return null;
        }
        wb2 wb2Var = this.a;
        if (z) {
            int i2 = i - 3000;
            CharSequence charSequence = wb2Var.Q5.z;
            if (!(charSequence instanceof Spannable) || i2 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length > i2) {
                return clickableSpanArr[i2];
            }
            return null;
        }
        int i3 = i - 2000;
        CharSequence charSequence2 = wb2Var.Q5.v;
        if (!(charSequence2 instanceof Spannable) || i3 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length > i3) {
            return clickableSpanArr2[i3];
        }
        return null;
    }

    public final dk9 b(int[] iArr, int i) {
        hl9 hl9Var;
        r47 r47Var = this.a.Q5;
        if (r47Var == null || (hl9Var = r47Var.y2) == null) {
            return null;
        }
        ArrayList arrayList = hl9Var.g;
        int i2 = i - 6000;
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            dk9 dk9Var = (dk9) arrayList.get(i4);
            if (dk9Var.R()) {
                int A = dk9Var.A() + (dk9Var.r == null ? 0 : 1) + i3;
                if (i2 < A) {
                    iArr[0] = i2 - i3;
                    return dk9Var;
                }
                i3 = A;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x085a A[LOOP:3: B:101:0x0858->B:102:0x085a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x088c A[LOOP:4: B:112:0x088a->B:113:0x088c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0676 A[LOOP:11: B:405:0x0674->B:406:0x0676, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07e9  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        boolean z;
        boolean z2;
        String str;
        int i2;
        String S;
        ArrayList arrayList;
        String str2;
        int i3;
        boolean z3;
        int[] iArr;
        boolean z4;
        int[] iArr2;
        char c;
        boolean z5;
        long j;
        SpannableStringBuilder spannableStringBuilder;
        ArrayList arrayList2;
        StaticLayout[] staticLayoutArr;
        ArrayList arrayList3;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ArrayList arrayList4;
        long j2;
        TLRPC.Document document;
        hl9 hl9Var;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i4;
        ArrayList<TLRPC.ReactionCount> arrayList5;
        boolean z6;
        TLRPC.MessagePeerReaction messagePeerReaction;
        String str3;
        int i5;
        String M0;
        byte b;
        String str4;
        int i6;
        StaticLayout staticLayout;
        String s;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        ArrayList arrayList6;
        int size;
        int i7;
        int size2;
        int i8;
        xb2 xb2Var;
        byte b2;
        r47 r47Var;
        hl9 hl9Var2;
        int i9;
        RectF rectF;
        ArrayList arrayList7;
        int size3;
        int i10;
        int[] iArr3 = {0, 0};
        wb2 wb2Var = this.a;
        wb2Var.getLocationOnScreen(iArr3);
        ArrayList arrayList8 = wb2Var.Q4;
        ArrayList arrayList9 = wb2Var.I5;
        StaticLayout[] staticLayoutArr2 = wb2Var.C9;
        SparseArray sparseArray = wb2Var.Jb;
        if (i != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setSource(wb2Var, i);
            obtain.setParent(wb2Var);
            obtain.setPackageName(wb2Var.getContext().getPackageName());
            Rect rect = this.d;
            if (i == 5000) {
                TLRPC.User user = wb2Var.va;
                if (user != null) {
                    obtain.setText(lbc.r(user));
                    float f = wb2Var.t9;
                    int i11 = (int) f;
                    float f2 = wb2Var.u9;
                    rect.set(i11, (int) f2, (int) (f + wb2Var.r9), (int) (f2 + (wb2Var.h9 != null ? r4.getHeight() : 10)));
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i) == null) {
                        sparseArray.put(i, new Rect(rect));
                    }
                    rect.offset(iArr3[0], iArr3[1]);
                    obtain.setBoundsInScreen(rect);
                    obtain.setClassName("android.widget.TextView");
                    obtain.setEnabled(true);
                    obtain.setClickable(true);
                    obtain.setLongClickable(true);
                    obtain.addAction(16);
                    obtain.addAction(32);
                    z2 = true;
                }
                return null;
            }
            if (i >= 6000) {
                int[] iArr4 = {0};
                dk9 b3 = b(iArr4, i);
                if (b3 != null) {
                    obtain.setText(b3.w(iArr4[0]));
                    b3.v(iArr4[0], rect);
                    rect.offset(wb2Var.o0, wb2Var.u0);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i) == null) {
                        sparseArray.put(i, new Rect(rect));
                    }
                    rect.offset(iArr3[0], iArr3[1]);
                    obtain.setBoundsInScreen(rect);
                    int i12 = iArr4[0];
                    boolean z7 = b3.r != null && i12 == 0;
                    if (z7) {
                        obtain.setClassName("android.widget.CheckBox");
                    } else if (b3.O(i12)) {
                        obtain.setClassName("android.widget.TextView");
                    } else {
                        obtain.setClassName("android.widget.ImageView");
                    }
                    obtain.setEnabled(true);
                    if (z7) {
                        obtain.setCheckable(true);
                        c = 0;
                        obtain.setChecked(b3.L(iArr4[0]));
                    } else {
                        c = 0;
                    }
                    boolean M = b3.M(iArr4[c]);
                    obtain.setClickable(M);
                    if (M) {
                        obtain.addAction(16);
                    }
                    z2 = true;
                }
                return null;
            }
            RectF rectF2 = this.c;
            Path path = this.b;
            if (i >= 3000) {
                CharSequence charSequence = wb2Var.Q5.z;
                if ((charSequence instanceof Spannable) && wb2Var.m3 != null) {
                    Spannable spannable = (Spannable) charSequence;
                    ClickableSpan a = a(i, false);
                    if (a != null) {
                        int[] Z1 = wb2.Z1(spannable, a);
                        obtain.setText(spannable.subSequence(Z1[0], Z1[1]).toString());
                        ArrayList arrayList10 = wb2Var.m3.e;
                        int size4 = arrayList10.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                z4 = true;
                                break;
                            }
                            Object obj = arrayList10.get(i13);
                            i13++;
                            o47 o47Var = (o47) obj;
                            int length = o47Var.e.getText().length();
                            int i14 = o47Var.n;
                            int i15 = Z1[0];
                            if (i14 <= i15) {
                                int i16 = length + i14;
                                iArr2 = Z1;
                                int i17 = iArr2[1];
                                if (i16 >= i17) {
                                    o47Var.e.getSelectionPath(i15 - i14, i17 - i14, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) o47Var.p(wb2Var.m3.e, wb2Var.ub));
                                    rect.offset(wb2Var.o0, wb2Var.u0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i) == null) {
                                        sparseArray.put(i, new Rect(rect));
                                    }
                                    z4 = true;
                                    rect.offset(iArr3[0], iArr3[1]);
                                    obtain.setBoundsInScreen(rect);
                                }
                            } else {
                                iArr2 = Z1;
                            }
                            Z1 = iArr2;
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z4);
                        obtain.setClickable(z4);
                        obtain.setLongClickable(z4);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z2 = true;
                    }
                }
                return null;
            }
            if (i >= 2000) {
                CharSequence charSequence2 = wb2Var.Q5.v;
                if (charSequence2 instanceof Spannable) {
                    Spannable spannable2 = (Spannable) charSequence2;
                    ClickableSpan a2 = a(i, false);
                    if (a2 != null) {
                        int[] Z12 = wb2.Z1(spannable2, a2);
                        obtain.setText(spannable2.subSequence(Z12[0], Z12[1]).toString());
                        ArrayList arrayList11 = wb2Var.Q5.B2;
                        int size5 = arrayList11.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size5) {
                                z3 = true;
                                break;
                            }
                            Object obj2 = arrayList11.get(i18);
                            i18++;
                            o47 o47Var2 = (o47) obj2;
                            int length2 = o47Var2.e.getText().length();
                            int i19 = o47Var2.n;
                            int i20 = Z12[0];
                            if (i19 <= i20) {
                                int i21 = length2 + i19;
                                iArr = Z12;
                                int i22 = iArr[1];
                                if (i21 >= i22) {
                                    o47Var2.e.getSelectionPath(i20 - i19, i22 - i19, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) o47Var2.p(wb2Var.Q5.B2, wb2Var.ub));
                                    rect.offset(wb2Var.o0, wb2Var.u0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i) == null) {
                                        sparseArray.put(i, new Rect(rect));
                                    }
                                    z3 = true;
                                    rect.offset(iArr3[0], iArr3[1]);
                                    obtain.setBoundsInScreen(rect);
                                }
                            } else {
                                iArr = Z12;
                            }
                            Z12 = iArr;
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z3);
                        obtain.setClickable(z3);
                        obtain.setLongClickable(z3);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z2 = true;
                    }
                }
                return null;
            }
            if (i >= 1000) {
                int i23 = i - 1000;
                if (i23 < arrayList9.size()) {
                    wo0 wo0Var = (wo0) arrayList9.get(i23);
                    if (!wo0Var.b) {
                        obtain.setText(wo0Var.h.i());
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        obtain.setClickable(true);
                        obtain.addAction(16);
                        float f3 = wo0Var.c;
                        float f4 = wb2Var.K5;
                        int i24 = wo0Var.d;
                        rect.set((int) (f3 * f4), i24, (int) ((f3 + wo0Var.e) * f4), wo0Var.f + i24);
                        rect.offset(wb2Var.Q5.O3() ? (wb2Var.getMeasuredWidth() - wb2Var.getWidthForButtons()) - hl.L(10.0f) : wb2Var.N6 + hl.L(wb2Var.C6 ? 1.0f : 7.0f), wb2Var.e7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        z2 = true;
                    }
                }
                return null;
            }
            if (i >= 500) {
                int i25 = i - 500;
                if (i25 < arrayList8.size()) {
                    vb2 vb2Var = (vb2) arrayList8.get(i25);
                    StringBuilder sb = new StringBuilder(vb2Var.p.getText());
                    if (wb2Var.W4) {
                        obtain.setSelected(vb2Var.i);
                        sb.append(", ");
                        sb.append(vb2Var.d);
                        sb.append("%");
                        TLRPC.Poll poll = wb2Var.j5;
                        if (poll != null && poll.quiz && (vb2Var.i || vb2Var.l)) {
                            sb.append(", ");
                            if (vb2Var.l) {
                                str2 = "AccDescrQuizCorrectAnswer";
                                i3 = 2131754791;
                            } else {
                                str2 = "AccDescrQuizIncorrectAnswer";
                                i3 = 2131754789;
                            }
                            sb.append(ob6.M0(i3, str2));
                        }
                    } else {
                        obtain.setClassName("android.widget.Button");
                    }
                    obtain.setText(sb);
                    obtain.setEnabled(true);
                    obtain.addAction(16);
                    int i26 = vb2Var.b + wb2Var.gb;
                    int L = wb2Var.b7 - hl.L(76.0f);
                    int i27 = vb2Var.a;
                    rect.set(i27, i26, L + i27, vb2Var.c + i26);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i) == null) {
                        sparseArray.put(i, new Rect(rect));
                    }
                    z = true;
                    rect.offset(iArr3[0], iArr3[1]);
                    obtain.setBoundsInScreen(rect);
                    obtain.setClickable(true);
                }
                return null;
            }
            z = true;
            if (i == 495) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                obtain.setText(ob6.L0(2131754790));
                obtain.addAction(16);
                rect.set(wb2Var.o5 - hl.L(8.0f), wb2Var.p5 - hl.L(8.0f), hl.L(32.0f) + wb2Var.o5, hl.L(32.0f) + wb2Var.p5);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                    sparseArray.put(i, new Rect(rect));
                }
                z = true;
                rect.offset(iArr3[0], iArr3[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i == 499) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout2 = wb2Var.r2;
                if (staticLayout2 != null) {
                    obtain.setText(staticLayout2.getText());
                }
                obtain.addAction(16);
                wb2Var.M2.round(rect);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                    sparseArray.put(i, new Rect(rect));
                }
                z = true;
                rect.offset(iArr3[0], iArr3[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i == 492) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout3 = wb2Var.o2;
                if (staticLayout3 != null) {
                    obtain.setText(staticLayout3.getText());
                }
                obtain.addAction(16);
                wb2Var.v2.round(rect);
                xb2 xb2Var2 = wb2Var.w2;
                if (xb2Var2 != null && (arrayList = xb2Var2.g) != null && arrayList.size() > 1) {
                    tb2 tb2Var = (tb2) wb2Var.w2.g.get(0);
                    if (!tb2Var.e.isEmpty()) {
                        rect.set(rect.left, rect.top, rect.right, (int) (rect.bottom - tb2Var.e.height()));
                    }
                }
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                    sparseArray.put(i, new Rect(rect));
                }
                z = true;
                rect.offset(iArr3[0], iArr3[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else {
                int i28 = 491;
                if (i != 491) {
                    if (i == 490 || i == 489) {
                        i28 = 491;
                    } else if (i == 498) {
                        obtain.setClassName("android.widget.ImageButton");
                        obtain.setEnabled(true);
                        if (wb2Var.I2(wb2Var.Q5)) {
                            obtain.setContentDescription(ob6.M0(2131754814, "AccDescrOpenChat"));
                        } else {
                            obtain.setContentDescription(ob6.M0(2131745187, "ShareFile"));
                        }
                        obtain.addAction(16);
                        int i29 = (int) wb2Var.d9;
                        rect.set(i29, (int) wb2Var.e9, hl.L(40.0f) + i29, hl.L(32.0f) + ((int) wb2Var.e9));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 497) {
                        obtain.setEnabled(true);
                        StringBuilder sb2 = new StringBuilder(ob6.M0(2131745990, "Reply"));
                        sb2.append(", ");
                        StaticLayout staticLayout4 = wb2Var.Q7;
                        if (staticLayout4 != null) {
                            sb2.append(staticLayout4.getText());
                            sb2.append(", ");
                        }
                        StaticLayout staticLayout5 = wb2Var.R7;
                        if (staticLayout5 != null) {
                            sb2.append(staticLayout5.getText());
                        }
                        obtain.setContentDescription(sb2.toString());
                        obtain.addAction(16);
                        int i30 = wb2Var.U7;
                        rect.set(i30, wb2Var.V7, Math.max(wb2Var.X7, wb2Var.Z7) + i30, wb2Var.V7 + ((int) wb2Var.W7));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 494) {
                        obtain.setEnabled(true);
                        StringBuilder sb3 = new StringBuilder();
                        if (staticLayoutArr2[0] != null && staticLayoutArr2[1] != null) {
                            int i31 = 0;
                            while (i31 < 2) {
                                sb3.append(staticLayoutArr2[i31].getText());
                                sb3.append(i31 == 0 ? " " : "\n");
                                i31++;
                            }
                        }
                        obtain.setContentDescription(sb3.toString());
                        obtain.addAction(16);
                        float f5 = wb2Var.F9;
                        float[] fArr = wb2Var.I9;
                        int min = (int) Math.min(f5 - fArr[0], f5 - fArr[1]);
                        int i32 = wb2Var.G9;
                        rect.set(min, i32, wb2Var.D9 + min, wb2Var.H9 + i32);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 496) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        int repliesCount = wb2Var.getRepliesCount();
                        r47 r47Var2 = wb2Var.Q5;
                        if (r47Var2 == null || r47Var2.O5() || wb2Var.Q5.G2()) {
                            S = (wb2Var.u6 || repliesCount <= 0) ? null : ob6.S(null, repliesCount);
                        } else if (wb2Var.u6) {
                            S = ob6.M0(2131743204, "ViewInChat");
                        } else {
                            S = repliesCount == 0 ? ob6.M0(2131748762, "LeaveAComment") : ob6.G(repliesCount, "CommentsCount", new Object[0]);
                        }
                        if (S != null) {
                            obtain.setText(S);
                        }
                        obtain.addAction(16);
                        rect.set(wb2Var.y7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 493) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        if (wb2Var.Q5.S4()) {
                            str = "AccActionCloseTranscription";
                            i2 = 2131754935;
                        } else {
                            str = "AccActionOpenTranscription";
                            i2 = 2131754927;
                        }
                        obtain.setText(ob6.M0(i2, str));
                        obtain.addAction(16);
                        if (wb2Var.J4 != null) {
                            rect.set((int) wb2Var.F1().b, (int) wb2Var.F1().c, (int) (wb2Var.F1().b + wb2Var.J4.B()), (int) (wb2Var.F1().c + wb2Var.J4.h()));
                        }
                        obtain.setBoundsInParent(rect);
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    }
                }
                byte b4 = i == i28 ? (byte) 5 : i == 490 ? (byte) 31 : (byte) 30;
                int i33 = 0;
                while (true) {
                    xb2 xb2Var3 = wb2Var.w2;
                    if (xb2Var3 == null || i33 >= xb2Var3.g.size()) {
                        break;
                    }
                    tb2 tb2Var2 = (tb2) wb2Var.w2.g.get(i33);
                    if (tb2Var2.a == b4) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        StaticLayout staticLayout6 = tb2Var2.d;
                        if (staticLayout6 != null) {
                            obtain.setText(staticLayout6.getText());
                        }
                        obtain.addAction(16);
                        tb2Var2.e.round(rect);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z2 = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else {
                        i33++;
                    }
                }
                z2 = true;
            }
            z2 = z;
            obtain.setFocusable(z2);
            obtain.setVisibleToUser(z2);
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(wb2Var);
        wb2Var.onInitializeAccessibilityNodeInfo(obtain2);
        r47 r47Var3 = wb2Var.Q5;
        if (r47Var3 != null && r47Var3.N3()) {
            r47 r47Var4 = wb2Var.Q5;
            if (!r47Var4.r1 && r47Var4.E4()) {
                z5 = true;
                r47 r47Var5 = wb2Var.Q5;
                boolean z8 = r47Var5 == null && r47Var5.R2();
                r47 r47Var6 = wb2Var.Q5;
                j = r47Var6 == null ? r47Var6.H0 : 0L;
                spannableStringBuilder = wb2Var.P2;
                if (spannableStringBuilder == null) {
                    staticLayoutArr = staticLayoutArr2;
                    if (wb2Var.Q2 == z5 && wb2Var.R2 == z8) {
                        arrayList3 = arrayList8;
                        arrayList2 = arrayList9;
                        if (wb2Var.S2 == j) {
                            accessibilityNodeInfo = obtain2;
                            arrayList4 = arrayList3;
                            if (Build.VERSION.SDK_INT < 24) {
                                accessibilityNodeInfo2 = accessibilityNodeInfo;
                                accessibilityNodeInfo2.setContentDescription(spannableStringBuilder.toString());
                            } else {
                                accessibilityNodeInfo2 = accessibilityNodeInfo;
                                accessibilityNodeInfo2.setText(spannableStringBuilder);
                            }
                            accessibilityNodeInfo2.setEnabled(true);
                            collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                            if (collectionItemInfo != null) {
                                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                            }
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, ob6.M0(2131754932, "AccActionMessageOptions")));
                            int iconForCurrentState = wb2Var.getIconForCurrentState();
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 0 ? iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? iconForCurrentState != 5 ? wb2Var.Q5.D == 16 ? ob6.M0(2131752614, "CallAgain") : null : ob6.M0(2131754929, "AccActionOpenFile") : ob6.M0(2131754937, "AccActionCancelDownload") : ob6.M0(2131754934, "AccActionDownload") : ob6.M0(2131754926, "AccActionPause") : ob6.M0(2131754925, "AccActionPlay")));
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754933, "AccActionEnterSelectionMode")));
                            if (wb2Var.getMiniIconForCurrentState() == 2) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, ob6.M0(2131754934, "AccActionDownload")));
                            }
                            if (!wb2Var.V8 || wb2Var.s8) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, ob6.M0(2131743981, "SummaryTitle")));
                            }
                            arrayList6 = wb2Var.Q5.B2;
                            if (arrayList6 != null) {
                                int size6 = arrayList6.size();
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= size6) {
                                        break;
                                    }
                                    Object obj3 = arrayList6.get(i34);
                                    i34++;
                                    if (((o47) obj3).O) {
                                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, ob6.M0(2131751730, "CopyCode")));
                                        break;
                                    }
                                }
                            }
                            if ((!wb2Var.Q5.O4() || wb2Var.Q5.g4() || wb2Var.Q5.I3()) && MediaController.z().H(wb2Var.Q5)) {
                                wb2Var.F4.f(accessibilityNodeInfo2);
                            }
                            if (wb2Var.I4 && wb2Var.J4 != null) {
                                accessibilityNodeInfo2.addChild(wb2Var, 493);
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                if (wb2Var.f6 && wb2Var.va != null && !wb2Var.Q5.N3()) {
                                    accessibilityNodeInfo2.addChild(wb2Var, 5000);
                                }
                                CharSequence charSequence3 = wb2Var.Q5.v;
                                if (charSequence3 instanceof Spannable) {
                                    Spannable spannable3 = (Spannable) charSequence3;
                                    int i35 = 0;
                                    for (CharacterStyle characterStyle : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                                        accessibilityNodeInfo2.addChild(wb2Var, i35 + 2000);
                                        i35++;
                                    }
                                }
                                CharSequence charSequence4 = wb2Var.Q5.z;
                                if ((charSequence4 instanceof Spannable) && wb2Var.m3 != null) {
                                    Spannable spannable4 = (Spannable) charSequence4;
                                    int i36 = 0;
                                    for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                                        accessibilityNodeInfo2.addChild(wb2Var, i36 + 3000);
                                        i36++;
                                    }
                                }
                            }
                            size = arrayList2.size();
                            int i37 = 0;
                            i7 = 0;
                            while (i7 < size) {
                                Object obj4 = arrayList2.get(i7);
                                i7++;
                                accessibilityNodeInfo2.addChild(wb2Var, i37 + 1000);
                                i37++;
                            }
                            if (wb2Var.r5 && wb2Var.o5 != -1 && wb2Var.Q5.S3()) {
                                accessibilityNodeInfo2.addChild(wb2Var, 495);
                            }
                            size2 = arrayList4.size();
                            int i38 = 0;
                            i8 = 0;
                            while (i8 < size2) {
                                Object obj5 = arrayList4.get(i8);
                                i8++;
                                accessibilityNodeInfo2.addChild(wb2Var, i38 + 500);
                                i38++;
                            }
                            if (wb2Var.u2 && !wb2Var.M2.isEmpty()) {
                                accessibilityNodeInfo2.addChild(wb2Var, 499);
                            }
                            xb2Var = wb2Var.w2;
                            if (xb2Var != null && xb2Var.b && (rectF = wb2Var.v2) != null && !rectF.isEmpty()) {
                                accessibilityNodeInfo2.addChild(wb2Var, 492);
                                arrayList7 = wb2Var.w2.g;
                                if (arrayList7 != null && arrayList7.size() > 1) {
                                    ArrayList arrayList12 = wb2Var.w2.g;
                                    size3 = arrayList12.size();
                                    i10 = 0;
                                    while (i10 < size3) {
                                        Object obj6 = arrayList12.get(i10);
                                        i10++;
                                        tb2 tb2Var3 = (tb2) obj6;
                                        if (wb2Var.w2.d && tb2Var3.a == 5 && !tb2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(wb2Var, 491);
                                        }
                                        if (wb2Var.w2.e && tb2Var3.a == 31 && !tb2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(wb2Var, 490);
                                        }
                                        if (wb2Var.w2.c && tb2Var3.a == 30 && !tb2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(wb2Var, 489);
                                        }
                                    }
                                }
                            }
                            if (wb2Var.n7 != null) {
                                accessibilityNodeInfo2.addChild(wb2Var, 496);
                            }
                            b2 = wb2Var.R8;
                            if (b2 != 1 || b2 == 2) {
                                accessibilityNodeInfo2.addChild(wb2Var, 498);
                            }
                            if (wb2Var.Q7 != null) {
                                accessibilityNodeInfo2.addChild(wb2Var, 497);
                            }
                            r47Var = wb2Var.Q5;
                            if (r47Var != null && (hl9Var2 = r47Var.y2) != null) {
                                int i39 = 0;
                                for (i9 = 0; i9 < hl9Var2.g.size(); i9++) {
                                    dk9 dk9Var = (dk9) hl9Var2.g.get(i9);
                                    if (dk9Var.R()) {
                                        int A = dk9Var.A() + (dk9Var.r == null ? 0 : 1);
                                        for (int i40 = 0; i40 < A; i40++) {
                                            accessibilityNodeInfo2.addChild(wb2Var, i39 + 6000 + i40);
                                        }
                                        i39 += A;
                                    }
                                }
                            }
                            if (staticLayoutArr[0] != null && staticLayoutArr[1] != null) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, ob6.M0(2131754928, "AccActionOpenForwardedOrigin")));
                            }
                            if (wb2Var.k1 && wb2Var.getBackground() == null) {
                                return accessibilityNodeInfo2;
                            }
                            accessibilityNodeInfo2.setSelected(true);
                            return accessibilityNodeInfo2;
                        }
                    } else {
                        arrayList3 = arrayList8;
                        arrayList2 = arrayList9;
                    }
                } else {
                    arrayList2 = arrayList9;
                    staticLayoutArr = staticLayoutArr2;
                    arrayList3 = arrayList8;
                }
                spannableStringBuilder = new SpannableStringBuilder();
                if (wb2Var.f6 || wb2Var.va == null || wb2Var.Q5.N3()) {
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList3;
                    j2 = j;
                } else {
                    spannableStringBuilder.append((CharSequence) lbc.r(wb2Var.va));
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList3;
                    spannableStringBuilder.setSpan(new eb2(this, wb2Var.va), 0, spannableStringBuilder.length(), 33);
                    CharSequence adminAccessibilityText = wb2Var.getAdminAccessibilityText();
                    if (TextUtils.isEmpty(adminAccessibilityText)) {
                        j2 = j;
                    } else if (wb2Var.l9) {
                        j2 = j;
                        spannableStringBuilder.append(' ').append((CharSequence) ob6.Z(wb2Var.j9 ? 2131754722 : 2131754721, adminAccessibilityText));
                    } else {
                        j2 = j;
                        spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                    }
                    spannableStringBuilder.append('\n');
                }
                if (wb2Var.E9) {
                    int i41 = 0;
                    while (i41 < 2) {
                        StaticLayout staticLayout7 = staticLayoutArr[i41];
                        if (staticLayout7 != null && staticLayout7.getText() != null) {
                            spannableStringBuilder.append(staticLayoutArr[i41].getText());
                            spannableStringBuilder.append(i41 == 0 ? " " : "\n");
                        }
                        i41++;
                    }
                }
                document = wb2Var.N1;
                if (document != null && wb2Var.M1 == 1) {
                    s = xb4.s(document);
                    if (s.indexOf(46) != -1) {
                        spannableStringBuilder.append((CharSequence) ob6.Z(2131754885, s.substring(s.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                    }
                }
                hl9Var = wb2Var.Q5.y2;
                if (hl9Var == null && !hl9Var.g.isEmpty()) {
                    ArrayList arrayList13 = wb2Var.Q5.y2.g;
                    int size7 = arrayList13.size();
                    int i42 = 0;
                    while (i42 < size7) {
                        Object obj7 = arrayList13.get(i42);
                        i42++;
                        dk9 dk9Var2 = (dk9) obj7;
                        if (dk9Var2.R()) {
                            int length3 = spannableStringBuilder.length();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            dk9Var2.j(spannableStringBuilder2);
                            ArrayList arrayList14 = arrayList13;
                            CharSequence x = dk9Var2.x();
                            int i43 = size7;
                            CharSequence text = (!dk9Var2.x || (staticLayout = dk9Var2.d) == null) ? null : staticLayout.getText();
                            if (!TextUtils.isEmpty(text)) {
                                spannableStringBuilder.append(text);
                                if (!TextUtils.isEmpty(x) || spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append(' ');
                                }
                            }
                            if (!TextUtils.isEmpty(x)) {
                                spannableStringBuilder.append(x);
                                if (spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                            if (spannableStringBuilder.length() > length3 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                                spannableStringBuilder.append('\n');
                            }
                            arrayList13 = arrayList14;
                            size7 = i43;
                        }
                    }
                } else if (!TextUtils.isEmpty(wb2Var.Q5.v)) {
                    CharSequence charSequence5 = wb2Var.Q5.v;
                    if (charSequence5 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence5;
                        jk2[] jk2VarArr = (jk2[]) spanned.getSpans(0, spanned.length(), jk2.class);
                        if (jk2VarArr != null && jk2VarArr.length > 0) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence5);
                            Arrays.sort(jk2VarArr, new db2(spanned, (byte) 0));
                            int length4 = jk2VarArr.length;
                            int i44 = 0;
                            while (i44 < length4) {
                                jk2 jk2Var = jk2VarArr[i44];
                                int i45 = length4;
                                int spanStart = spanned.getSpanStart(jk2Var);
                                Spanned spanned2 = spanned;
                                if (spanStart >= 0) {
                                    spannableStringBuilder3.insert(spanStart, (CharSequence) (((Object) (TextUtils.isEmpty(jk2Var.a) ? ob6.L0(2131754893) : ob6.Z(2131754892, o47.b(jk2Var.a)))) + ". "));
                                }
                                i44++;
                                length4 = i45;
                                spanned = spanned2;
                            }
                            charSequence5 = spannableStringBuilder3;
                        }
                    }
                    spannableStringBuilder.append(charSequence5);
                }
                if (wb2Var.N1 != null && (((b = wb2Var.M1) == 1 || b == 2 || b == 4) && wb2Var.O3 == 1 && wb2Var.A3 != null)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (wb2Var.Q5.n4()) {
                        str4 = "AccDescrDownloadProgress";
                        i6 = 2131754884;
                    } else {
                        str4 = "AccDescrUploadProgress";
                        i6 = 2131754737;
                    }
                    spannableStringBuilder.append((CharSequence) ob6.Y(i6, str4, hl.i0(wb2Var.Q5.H0, false, false), hl.i0(wb2Var.A1, false, false)));
                }
                if (!wb2Var.Q5.I3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) ob6.Y(2131754827, "AccDescrMusicInfo", wb2Var.Q5.w1(true), wb2Var.Q5.y1(true)));
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) ob6.z((int) wb2Var.Q5.L0()));
                } else if (wb2Var.Q5.O4() || wb2Var.Kb) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) ob6.z((int) wb2Var.Q5.L0()));
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (wb2Var.Q5.R2()) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131754833, "AccDescrMsgNotPlayed"));
                    } else {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131754832, "AccDescrMsgPlayed"));
                    }
                }
                if (wb2Var.j5 != null) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) wb2Var.j5.question.text);
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (wb2Var.X4) {
                        M0 = ob6.M0(2131750655, "FinalResults");
                    } else {
                        TLRPC.Poll poll2 = wb2Var.j5;
                        boolean z9 = poll2.quiz;
                        boolean z10 = poll2.public_voters;
                        M0 = z9 ? z10 ? ob6.M0(2131746172, "QuizPoll") : ob6.M0(2131754241, "AnonymousQuizPoll") : z10 ? ob6.M0(2131746315, "PublicPoll") : ob6.M0(2131754242, "AnonymousPoll");
                    }
                    spannableStringBuilder.append((CharSequence) M0);
                }
                if (wb2Var.N1 != null) {
                    if (wb2Var.M1 == 4) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) ob6.z((int) wb2Var.Q5.L0()));
                    }
                    if (wb2Var.O3 == 0 || wb2Var.M1 == 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) hl.i0(wb2Var.N1.size, false, false));
                    }
                }
                if (!wb2Var.Q5.S4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(wb2Var.Q5.i2());
                } else if (r47.n1(wb2Var.Q5.k) != null && !TextUtils.isEmpty(wb2Var.Q5.z)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(wb2Var.Q5.z);
                }
                if (wb2Var.Q5.N3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) ob6.Y(2131754784, "AccDescrReceivedDate", ob6.M0(2131743765, "TodayAt") + " " + ((Object) wb2Var.Q9)));
                } else if (wb2Var.Q5.p4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (wb2Var.Q5.r1) {
                        spannableStringBuilder.append((CharSequence) ob6.Y(2131754776, "AccDescrScheduledDate", wb2Var.Q9));
                    } else {
                        spannableStringBuilder.append((CharSequence) ob6.Y(2131754760, "AccDescrSentDate", ob6.M0(2131743765, "TodayAt") + " " + ((Object) wb2Var.Q9)));
                        spannableStringBuilder.append((CharSequence) ", ");
                        if (wb2Var.Q5.E4()) {
                            str3 = "AccDescrMsgUnread";
                            i5 = 2131754828;
                        } else {
                            str3 = "AccDescrMsgRead";
                            i5 = 2131754831;
                        }
                        spannableStringBuilder.append((CharSequence) ob6.M0(i5, str3));
                    }
                } else if (wb2Var.Q5.n4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131754830, "AccDescrMsgSending"));
                    RadialProgress2 radialProgress2 = wb2Var.Q0;
                    float f6 = (radialProgress2.c ? radialProgress2.j : radialProgress2.i).w;
                    if (f6 > 0.0f) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f6 * 100.0f))).append((CharSequence) "%");
                    }
                } else if (wb2Var.Q5.m4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131754829, "AccDescrMsgSendingError"));
                }
                if (wb2Var.getRepliesCount() > 0 && !wb2Var.x7) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) ob6.G(wb2Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
                }
                tL_messageReactions = wb2Var.Q5.k.reactions;
                if (tL_messageReactions != null && (arrayList5 = tL_messageReactions.results) != null) {
                    String str5 = "";
                    if (arrayList5.size() != 1) {
                        TLRPC.ReactionCount reactionCount = wb2Var.Q5.k.reactions.results.get(0);
                        TLRPC.Reaction reaction = reactionCount.reaction;
                        String str6 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                        int i46 = reactionCount.count;
                        if (i46 == 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            ArrayList<TLRPC.MessagePeerReaction> arrayList15 = wb2Var.Q5.k.reactions.recent_reactions;
                            if (arrayList15 == null || arrayList15.size() != 1 || (messagePeerReaction = wb2Var.Q5.k.reactions.recent_reactions.get(0)) == null) {
                                z6 = false;
                            } else {
                                TLRPC.User X1 = uc7.s1(wb2Var.a6).X1(Long.valueOf(r47.B1(messagePeerReaction.peer_id)));
                                z6 = lbc.D(X1);
                                if (X1 != null) {
                                    str5 = lbc.j(X1);
                                }
                            }
                            if (z6) {
                                spannableStringBuilder.append((CharSequence) ob6.Y(2131754720, "AccDescrYouReactedWith", str6));
                            } else {
                                spannableStringBuilder.append((CharSequence) ob6.Y(2131754786, "AccDescrReactedWith", str5, str6));
                            }
                        } else if (i46 > 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            spannableStringBuilder.append((CharSequence) ob6.G(reactionCount.count, "AccDescrNumberOfPeopleReactions", str6));
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746114, "Reactions")).append((CharSequence) ": ");
                        int size8 = wb2Var.Q5.k.reactions.results.size();
                        int i47 = 0;
                        while (i47 < size8) {
                            TLRPC.ReactionCount reactionCount2 = wb2Var.Q5.k.reactions.results.get(i47);
                            TLRPC.Reaction reaction2 = reactionCount2.reaction;
                            spannableStringBuilder.append((CharSequence) (reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon : "")).append((CharSequence) " ").append((CharSequence) (reactionCount2.count + ""));
                            i47++;
                            if (i47 < size8) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                        }
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                if ((wb2Var.Q5.k.flags & 1024) == 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    i4 = 0;
                    spannableStringBuilder.append((CharSequence) ob6.G(wb2Var.Q5.k.views, "AccDescrNumberOfViews", new Object[0]));
                } else {
                    i4 = 0;
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannableStringBuilder.getSpans(i4, spannableStringBuilder.length(), ClickableSpan.class)) {
                    int spanStart2 = spannableStringBuilder.getSpanStart(characterStyle3);
                    int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle3);
                    spannableStringBuilder.removeSpan(characterStyle3);
                    spannableStringBuilder.setSpan(new r1((Object) this, (Object) characterStyle3, (byte) 5), spanStart2, spanEnd, 33);
                }
                wb2Var.P2 = spannableStringBuilder;
                wb2Var.Q2 = z5;
                wb2Var.R2 = z8;
                wb2Var.S2 = j2;
                if (Build.VERSION.SDK_INT < 24) {
                }
                accessibilityNodeInfo2.setEnabled(true);
                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, ob6.M0(2131754932, "AccActionMessageOptions")));
                int iconForCurrentState2 = wb2Var.getIconForCurrentState();
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState2 != 0 ? iconForCurrentState2 != 1 ? iconForCurrentState2 != 2 ? iconForCurrentState2 != 3 ? iconForCurrentState2 != 5 ? wb2Var.Q5.D == 16 ? ob6.M0(2131752614, "CallAgain") : null : ob6.M0(2131754929, "AccActionOpenFile") : ob6.M0(2131754937, "AccActionCancelDownload") : ob6.M0(2131754934, "AccActionDownload") : ob6.M0(2131754926, "AccActionPause") : ob6.M0(2131754925, "AccActionPlay")));
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754933, "AccActionEnterSelectionMode")));
                if (wb2Var.getMiniIconForCurrentState() == 2) {
                }
                if (!wb2Var.V8) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, ob6.M0(2131743981, "SummaryTitle")));
                arrayList6 = wb2Var.Q5.B2;
                if (arrayList6 != null) {
                }
                if (!wb2Var.Q5.O4()) {
                }
                wb2Var.F4.f(accessibilityNodeInfo2);
                if (wb2Var.I4) {
                    accessibilityNodeInfo2.addChild(wb2Var, 493);
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                size = arrayList2.size();
                int i372 = 0;
                i7 = 0;
                while (i7 < size) {
                }
                if (wb2Var.r5) {
                    accessibilityNodeInfo2.addChild(wb2Var, 495);
                }
                size2 = arrayList4.size();
                int i382 = 0;
                i8 = 0;
                while (i8 < size2) {
                }
                if (wb2Var.u2) {
                    accessibilityNodeInfo2.addChild(wb2Var, 499);
                }
                xb2Var = wb2Var.w2;
                if (xb2Var != null) {
                    accessibilityNodeInfo2.addChild(wb2Var, 492);
                    arrayList7 = wb2Var.w2.g;
                    if (arrayList7 != null) {
                        ArrayList arrayList122 = wb2Var.w2.g;
                        size3 = arrayList122.size();
                        i10 = 0;
                        while (i10 < size3) {
                        }
                    }
                }
                if (wb2Var.n7 != null) {
                }
                b2 = wb2Var.R8;
                if (b2 != 1) {
                }
                accessibilityNodeInfo2.addChild(wb2Var, 498);
                if (wb2Var.Q7 != null) {
                }
                r47Var = wb2Var.Q5;
                if (r47Var != null) {
                    int i392 = 0;
                    while (i9 < hl9Var2.g.size()) {
                    }
                }
                if (staticLayoutArr[0] != null) {
                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, ob6.M0(2131754928, "AccActionOpenForwardedOrigin")));
                }
                if (wb2Var.k1) {
                }
                accessibilityNodeInfo2.setSelected(true);
                return accessibilityNodeInfo2;
            }
        }
        z5 = false;
        r47 r47Var52 = wb2Var.Q5;
        if (r47Var52 == null) {
        }
        r47 r47Var62 = wb2Var.Q5;
        if (r47Var62 == null) {
        }
        spannableStringBuilder = wb2Var.P2;
        if (spannableStringBuilder == null) {
        }
        spannableStringBuilder = new SpannableStringBuilder();
        if (wb2Var.f6) {
        }
        accessibilityNodeInfo = obtain2;
        arrayList4 = arrayList3;
        j2 = j;
        if (wb2Var.E9) {
        }
        document = wb2Var.N1;
        if (document != null) {
            s = xb4.s(document);
            if (s.indexOf(46) != -1) {
            }
        }
        hl9Var = wb2Var.Q5.y2;
        if (hl9Var == null) {
        }
        if (!TextUtils.isEmpty(wb2Var.Q5.v)) {
        }
        if (wb2Var.N1 != null) {
            spannableStringBuilder.append((CharSequence) "\n");
            if (wb2Var.Q5.n4()) {
            }
            spannableStringBuilder.append((CharSequence) ob6.Y(i6, str4, hl.i0(wb2Var.Q5.H0, false, false), hl.i0(wb2Var.A1, false, false)));
        }
        if (!wb2Var.Q5.I3()) {
        }
        if (wb2Var.j5 != null) {
        }
        if (wb2Var.N1 != null) {
        }
        if (!wb2Var.Q5.S4()) {
        }
        if (wb2Var.Q5.N3()) {
        }
        if (wb2Var.getRepliesCount() > 0) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) ob6.G(wb2Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
        }
        tL_messageReactions = wb2Var.Q5.k.reactions;
        if (tL_messageReactions != null) {
            String str52 = "";
            if (arrayList5.size() != 1) {
            }
        }
        if ((wb2Var.Q5.k.flags & 1024) == 0) {
        }
        spannableStringBuilder.append((CharSequence) "\n");
        while (r6 < r5) {
        }
        wb2Var.P2 = spannableStringBuilder;
        wb2Var.Q2 = z5;
        wb2Var.R2 = z8;
        wb2Var.S2 = j2;
        if (Build.VERSION.SDK_INT < 24) {
        }
        accessibilityNodeInfo2.setEnabled(true);
        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
        if (collectionItemInfo != null) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, ob6.M0(2131754932, "AccActionMessageOptions")));
        int iconForCurrentState22 = wb2Var.getIconForCurrentState();
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState22 != 0 ? iconForCurrentState22 != 1 ? iconForCurrentState22 != 2 ? iconForCurrentState22 != 3 ? iconForCurrentState22 != 5 ? wb2Var.Q5.D == 16 ? ob6.M0(2131752614, "CallAgain") : null : ob6.M0(2131754929, "AccActionOpenFile") : ob6.M0(2131754937, "AccActionCancelDownload") : ob6.M0(2131754934, "AccActionDownload") : ob6.M0(2131754926, "AccActionPause") : ob6.M0(2131754925, "AccActionPlay")));
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754933, "AccActionEnterSelectionMode")));
        if (wb2Var.getMiniIconForCurrentState() == 2) {
        }
        if (!wb2Var.V8) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, ob6.M0(2131743981, "SummaryTitle")));
        arrayList6 = wb2Var.Q5.B2;
        if (arrayList6 != null) {
        }
        if (!wb2Var.Q5.O4()) {
        }
        wb2Var.F4.f(accessibilityNodeInfo2);
        if (wb2Var.I4) {
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        size = arrayList2.size();
        int i3722 = 0;
        i7 = 0;
        while (i7 < size) {
        }
        if (wb2Var.r5) {
        }
        size2 = arrayList4.size();
        int i3822 = 0;
        i8 = 0;
        while (i8 < size2) {
        }
        if (wb2Var.u2) {
        }
        xb2Var = wb2Var.w2;
        if (xb2Var != null) {
        }
        if (wb2Var.n7 != null) {
        }
        b2 = wb2Var.R8;
        if (b2 != 1) {
        }
        accessibilityNodeInfo2.addChild(wb2Var, 498);
        if (wb2Var.Q7 != null) {
        }
        r47Var = wb2Var.Q5;
        if (r47Var != null) {
        }
        if (staticLayoutArr[0] != null) {
        }
        if (wb2Var.k1) {
        }
        accessibilityNodeInfo2.setSelected(true);
        return accessibilityNodeInfo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0177, code lost:
    
        if ((r9 != null ? r9.reply_to_top_id : 0) != 0) goto L134;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i, int i2, Bundle bundle) {
        rb2 rb2Var;
        gb2 gb2Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean T;
        CharSequence C;
        wb2 wb2Var = this.a;
        if (i == -1) {
            wb2Var.performAccessibilityAction(i2, bundle);
            return true;
        }
        if (i2 == 64) {
            wb2Var.l3(i, 32768, null);
            return true;
        }
        if (i2 == 16) {
            if (i == 5000) {
                rb2 rb2Var2 = wb2Var.eb;
                if (rb2Var2 != null) {
                    rb2Var2.W(wb2Var, wb2Var.va, 0.0f, 0.0f);
                    return true;
                }
            } else if (i >= 6000) {
                int[] iArr = {0};
                dk9 b = b(iArr, i);
                if (b != null) {
                    int i3 = iArr[0];
                    CheckBoxBase checkBoxBase = b.r;
                    if (checkBoxBase == null || i3 != 0) {
                        T = b.T(i3 - (checkBoxBase == null ? 0 : 1), wb2Var);
                    } else if (b.n()) {
                        b.d0();
                        T = true;
                    } else {
                        T = false;
                    }
                    if (T) {
                        wb2Var.l3(i, 1, null);
                        int i4 = iArr[0];
                        if (b.r == null || i4 != 0) {
                            C = b.C();
                        } else {
                            C = ob6.M0(b.F() ? 2131754898 : 2131754825, null);
                        }
                        hl.g2(C);
                        return true;
                    }
                }
            } else if (i >= 3000) {
                ClickableSpan a = a(i, true);
                if (a != null) {
                    wb2Var.eb.L(wb2Var, a, false);
                    wb2Var.l3(i, 1, null);
                    return true;
                }
            } else {
                if (i < 2000) {
                    if (i >= 1000) {
                        int i5 = i - 1000;
                        if (i5 < wb2Var.I5.size()) {
                            wo0 wo0Var = (wo0) wb2Var.I5.get(i5);
                            rb2 rb2Var3 = wb2Var.eb;
                            if (rb2Var3 != null && !wo0Var.m) {
                                iq0 iq0Var = wo0Var.j;
                                if (iq0Var != null) {
                                    rb2Var3.y1(wb2Var, iq0Var);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var.i;
                                    if (keyboardInlineButton != null) {
                                        rb2Var3.I0(wb2Var, keyboardInlineButton);
                                    }
                                }
                            }
                            wb2Var.l3(i, 1, null);
                            return true;
                        }
                    } else if (i >= 500) {
                        int i6 = i - 500;
                        if (i6 < wb2Var.Q4.size()) {
                            vb2 vb2Var = (vb2) wb2Var.Q4.get(i6);
                            if (wb2Var.eb != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(vb2Var.s);
                                wb2Var.eb.c1(wb2Var, arrayList, -1, 0, 0);
                            }
                            wb2Var.l3(i, 1, null);
                            return true;
                        }
                    } else {
                        if (i == 495) {
                            wb2Var.G0();
                            return true;
                        }
                        if (i == 499) {
                            rb2 rb2Var4 = wb2Var.eb;
                            if (rb2Var4 != null) {
                                rb2Var4.q1(wb2Var, wb2Var.y2);
                                return true;
                            }
                        } else if (i == 492) {
                            rb2 rb2Var5 = wb2Var.eb;
                            if (rb2Var5 != null) {
                                rb2Var5.q1(wb2Var, 5);
                                return true;
                            }
                        } else if (i == 491) {
                            rb2 rb2Var6 = wb2Var.eb;
                            if (rb2Var6 != null) {
                                rb2Var6.q1(wb2Var, 5);
                                return true;
                            }
                        } else if (i == 490) {
                            rb2 rb2Var7 = wb2Var.eb;
                            if (rb2Var7 != null) {
                                rb2Var7.q1(wb2Var, 31);
                                return true;
                            }
                        } else if (i == 489) {
                            rb2 rb2Var8 = wb2Var.eb;
                            if (rb2Var8 != null) {
                                rb2Var8.q1(wb2Var, 30);
                                return true;
                            }
                        } else if (i == 498) {
                            rb2 rb2Var9 = wb2Var.eb;
                            if (rb2Var9 != null) {
                                rb2Var9.a1(wb2Var);
                                return true;
                            }
                        } else if (i == 497) {
                            if (wb2Var.eb != null) {
                                if (wb2Var.o6 && !wb2Var.m6) {
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = wb2Var.Q5.k.reply_to;
                                }
                                if (wb2Var.Q5.B2() || wb2Var.M7 || ((message = wb2Var.Q5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)) {
                                    wb2Var.eb.H(wb2Var, wb2Var.Q5.N1(), 0.0f, 0.0f, false);
                                    return true;
                                }
                            }
                        } else if (i == 494) {
                            rb2 rb2Var10 = wb2Var.eb;
                            if (rb2Var10 != null) {
                                TLRPC.Chat chat = wb2Var.Ga;
                                if (chat != null) {
                                    rb2Var10.T1(wb2Var, chat, wb2Var.Q5.k.fwd_from.channel_post, wb2Var.h1, wb2Var.i1, false);
                                    return true;
                                }
                                TLRPC.User user = wb2Var.Ea;
                                if (user != null) {
                                    rb2Var10.W(wb2Var, user, wb2Var.h1, wb2Var.i1);
                                    return true;
                                }
                                if (wb2Var.Ha != null) {
                                    rb2Var10.N0(wb2Var);
                                    return true;
                                }
                            }
                        } else if (i == 496) {
                            rb2 rb2Var11 = wb2Var.eb;
                            if (rb2Var11 != null) {
                                if (wb2Var.u6) {
                                    rb2Var11.a1(wb2Var);
                                    return true;
                                }
                                rb2Var11.C0(wb2Var);
                                return true;
                            }
                        } else if (i == 493 && (gb2Var = wb2Var.J4) != null) {
                            gb2Var.p();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan a2 = a(i, false);
                if (a2 != null) {
                    wb2Var.eb.L(wb2Var, a2, false);
                    wb2Var.l3(i, 1, null);
                    return true;
                }
            }
        } else if (i2 == 32) {
            ClickableSpan a3 = a(i, i >= 3000);
            if (a3 != null && (rb2Var = wb2Var.eb) != null) {
                rb2Var.L(wb2Var, a3, true);
                wb2Var.l3(i, 2, null);
            }
        }
        return true;
    }
}
