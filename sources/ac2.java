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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ac2 extends AccessibilityNodeProvider {
    public final rc2 a;
    public final Path b = new Path();
    public final RectF c = new RectF();
    public final Rect d = new Rect();

    public ac2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final ClickableSpan a(int i, boolean z) {
        if (i == 5000) {
            return null;
        }
        rc2 rc2Var = this.a;
        if (z) {
            int i2 = i - 3000;
            CharSequence charSequence = rc2Var.Q5.z;
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
        CharSequence charSequence2 = rc2Var.Q5.v;
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

    public final qi9 b(int[] iArr, int i) {
        uj9 uj9Var;
        k47 k47Var = this.a.Q5;
        if (k47Var == null || (uj9Var = k47Var.y2) == null) {
            return null;
        }
        ArrayList arrayList = uj9Var.g;
        int i2 = i - 6000;
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            qi9 qi9Var = (qi9) arrayList.get(i4);
            if (qi9Var.R()) {
                int B = qi9Var.B() + (qi9Var.r == null ? 0 : 1) + i3;
                if (i2 < B) {
                    iArr[0] = i2 - i3;
                    return qi9Var;
                }
                i3 = B;
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
        uj9 uj9Var;
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
        sc2 sc2Var;
        byte b2;
        k47 k47Var;
        uj9 uj9Var2;
        int i9;
        RectF rectF;
        ArrayList arrayList7;
        int size3;
        int i10;
        int[] iArr3 = {0, 0};
        rc2 rc2Var = this.a;
        rc2Var.getLocationOnScreen(iArr3);
        ArrayList arrayList8 = rc2Var.Q4;
        ArrayList arrayList9 = rc2Var.I5;
        StaticLayout[] staticLayoutArr2 = rc2Var.C9;
        SparseArray sparseArray = rc2Var.Jb;
        if (i != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setSource(rc2Var, i);
            obtain.setParent(rc2Var);
            obtain.setPackageName(rc2Var.getContext().getPackageName());
            Rect rect = this.d;
            if (i == 5000) {
                TLRPC.User user = rc2Var.va;
                if (user != null) {
                    obtain.setText(m9c.r(user));
                    float f = rc2Var.t9;
                    int i11 = (int) f;
                    float f2 = rc2Var.u9;
                    rect.set(i11, (int) f2, (int) (f + rc2Var.r9), (int) (f2 + (rc2Var.h9 != null ? r4.getHeight() : 10)));
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
                qi9 b3 = b(iArr4, i);
                if (b3 != null) {
                    obtain.setText(b3.w(iArr4[0]));
                    b3.v(iArr4[0], rect);
                    rect.offset(rc2Var.o0, rc2Var.u0);
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
                CharSequence charSequence = rc2Var.Q5.z;
                if ((charSequence instanceof Spannable) && rc2Var.m3 != null) {
                    Spannable spannable = (Spannable) charSequence;
                    ClickableSpan a = a(i, false);
                    if (a != null) {
                        int[] Z1 = rc2.Z1(spannable, a);
                        obtain.setText(spannable.subSequence(Z1[0], Z1[1]).toString());
                        ArrayList arrayList10 = rc2Var.m3.e;
                        int size4 = arrayList10.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                z4 = true;
                                break;
                            }
                            Object obj = arrayList10.get(i13);
                            i13++;
                            h47 h47Var = (h47) obj;
                            int length = h47Var.e.getText().length();
                            int i14 = h47Var.n;
                            int i15 = Z1[0];
                            if (i14 <= i15) {
                                int i16 = length + i14;
                                iArr2 = Z1;
                                int i17 = iArr2[1];
                                if (i16 >= i17) {
                                    h47Var.e.getSelectionPath(i15 - i14, i17 - i14, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) h47Var.p(rc2Var.m3.e, rc2Var.ub));
                                    rect.offset(rc2Var.o0, rc2Var.u0);
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
                CharSequence charSequence2 = rc2Var.Q5.v;
                if (charSequence2 instanceof Spannable) {
                    Spannable spannable2 = (Spannable) charSequence2;
                    ClickableSpan a2 = a(i, false);
                    if (a2 != null) {
                        int[] Z12 = rc2.Z1(spannable2, a2);
                        obtain.setText(spannable2.subSequence(Z12[0], Z12[1]).toString());
                        ArrayList arrayList11 = rc2Var.Q5.B2;
                        int size5 = arrayList11.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size5) {
                                z3 = true;
                                break;
                            }
                            Object obj2 = arrayList11.get(i18);
                            i18++;
                            h47 h47Var2 = (h47) obj2;
                            int length2 = h47Var2.e.getText().length();
                            int i19 = h47Var2.n;
                            int i20 = Z12[0];
                            if (i19 <= i20) {
                                int i21 = length2 + i19;
                                iArr = Z12;
                                int i22 = iArr[1];
                                if (i21 >= i22) {
                                    h47Var2.e.getSelectionPath(i20 - i19, i22 - i19, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) h47Var2.p(rc2Var.Q5.B2, rc2Var.ub));
                                    rect.offset(rc2Var.o0, rc2Var.u0);
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
                    wp0 wp0Var = (wp0) arrayList9.get(i23);
                    if (!wp0Var.b) {
                        obtain.setText(wp0Var.h.i());
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        obtain.setClickable(true);
                        obtain.addAction(16);
                        float f3 = wp0Var.c;
                        float f4 = rc2Var.K5;
                        int i24 = wp0Var.d;
                        rect.set((int) (f3 * f4), i24, (int) ((f3 + wp0Var.e) * f4), wp0Var.f + i24);
                        rect.offset(rc2Var.Q5.O3() ? (rc2Var.getMeasuredWidth() - rc2Var.getWidthForButtons()) - gm.L(10.0f) : rc2Var.N6 + gm.L(rc2Var.C6 ? 1.0f : 7.0f), rc2Var.e7);
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
                    qc2 qc2Var = (qc2) arrayList8.get(i25);
                    StringBuilder sb = new StringBuilder(qc2Var.p.getText());
                    if (rc2Var.W4) {
                        obtain.setSelected(qc2Var.i);
                        sb.append(", ");
                        sb.append(qc2Var.d);
                        sb.append("%");
                        TLRPC.Poll poll = rc2Var.j5;
                        if (poll != null && poll.quiz && (qc2Var.i || qc2Var.l)) {
                            sb.append(", ");
                            if (qc2Var.l) {
                                str2 = "AccDescrQuizCorrectAnswer";
                                i3 = 2131754795;
                            } else {
                                str2 = "AccDescrQuizIncorrectAnswer";
                                i3 = 2131754793;
                            }
                            sb.append(jb6.M0(i3, str2));
                        }
                    } else {
                        obtain.setClassName("android.widget.Button");
                    }
                    obtain.setText(sb);
                    obtain.setEnabled(true);
                    obtain.addAction(16);
                    int i26 = qc2Var.b + rc2Var.gb;
                    int L = rc2Var.b7 - gm.L(76.0f);
                    int i27 = qc2Var.a;
                    rect.set(i27, i26, L + i27, qc2Var.c + i26);
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
                obtain.setText(jb6.L0(2131754794));
                obtain.addAction(16);
                rect.set(rc2Var.o5 - gm.L(8.0f), rc2Var.p5 - gm.L(8.0f), gm.L(32.0f) + rc2Var.o5, gm.L(32.0f) + rc2Var.p5);
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
                StaticLayout staticLayout2 = rc2Var.r2;
                if (staticLayout2 != null) {
                    obtain.setText(staticLayout2.getText());
                }
                obtain.addAction(16);
                rc2Var.M2.round(rect);
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
                StaticLayout staticLayout3 = rc2Var.o2;
                if (staticLayout3 != null) {
                    obtain.setText(staticLayout3.getText());
                }
                obtain.addAction(16);
                rc2Var.v2.round(rect);
                sc2 sc2Var2 = rc2Var.w2;
                if (sc2Var2 != null && (arrayList = sc2Var2.g) != null && arrayList.size() > 1) {
                    oc2 oc2Var = (oc2) rc2Var.w2.g.get(0);
                    if (!oc2Var.e.isEmpty()) {
                        rect.set(rect.left, rect.top, rect.right, (int) (rect.bottom - oc2Var.e.height()));
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
                        if (rc2Var.I2(rc2Var.Q5)) {
                            obtain.setContentDescription(jb6.M0(2131754818, "AccDescrOpenChat"));
                        } else {
                            obtain.setContentDescription(jb6.M0(2131745193, "ShareFile"));
                        }
                        obtain.addAction(16);
                        int i29 = (int) rc2Var.d9;
                        rect.set(i29, (int) rc2Var.e9, gm.L(40.0f) + i29, gm.L(32.0f) + ((int) rc2Var.e9));
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
                        StringBuilder sb2 = new StringBuilder(jb6.M0(2131745996, "Reply"));
                        sb2.append(", ");
                        StaticLayout staticLayout4 = rc2Var.Q7;
                        if (staticLayout4 != null) {
                            sb2.append(staticLayout4.getText());
                            sb2.append(", ");
                        }
                        StaticLayout staticLayout5 = rc2Var.R7;
                        if (staticLayout5 != null) {
                            sb2.append(staticLayout5.getText());
                        }
                        obtain.setContentDescription(sb2.toString());
                        obtain.addAction(16);
                        int i30 = rc2Var.U7;
                        rect.set(i30, rc2Var.V7, Math.max(rc2Var.X7, rc2Var.Z7) + i30, rc2Var.V7 + ((int) rc2Var.W7));
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
                        float f5 = rc2Var.F9;
                        float[] fArr = rc2Var.I9;
                        int min = (int) Math.min(f5 - fArr[0], f5 - fArr[1]);
                        int i32 = rc2Var.G9;
                        rect.set(min, i32, rc2Var.D9 + min, rc2Var.H9 + i32);
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
                        int repliesCount = rc2Var.getRepliesCount();
                        k47 k47Var2 = rc2Var.Q5;
                        if (k47Var2 == null || k47Var2.O5() || rc2Var.Q5.G2()) {
                            S = (rc2Var.u6 || repliesCount <= 0) ? null : jb6.S(null, repliesCount);
                        } else if (rc2Var.u6) {
                            S = jb6.M0(2131743236, "ViewInChat");
                        } else {
                            S = repliesCount == 0 ? jb6.M0(2131748765, "LeaveAComment") : jb6.G(repliesCount, "CommentsCount", new Object[0]);
                        }
                        if (S != null) {
                            obtain.setText(S);
                        }
                        obtain.addAction(16);
                        rect.set(rc2Var.y7);
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
                        if (rc2Var.Q5.S4()) {
                            str = "AccActionCloseTranscription";
                            i2 = 2131754939;
                        } else {
                            str = "AccActionOpenTranscription";
                            i2 = 2131754931;
                        }
                        obtain.setText(jb6.M0(i2, str));
                        obtain.addAction(16);
                        if (rc2Var.J4 != null) {
                            rect.set((int) rc2Var.F1().b, (int) rc2Var.F1().c, (int) (rc2Var.F1().b + rc2Var.J4.B()), (int) (rc2Var.F1().c + rc2Var.J4.h()));
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
                    sc2 sc2Var3 = rc2Var.w2;
                    if (sc2Var3 == null || i33 >= sc2Var3.g.size()) {
                        break;
                    }
                    oc2 oc2Var2 = (oc2) rc2Var.w2.g.get(i33);
                    if (oc2Var2.a == b4) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        StaticLayout staticLayout6 = oc2Var2.d;
                        if (staticLayout6 != null) {
                            obtain.setText(staticLayout6.getText());
                        }
                        obtain.addAction(16);
                        oc2Var2.e.round(rect);
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
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(rc2Var);
        rc2Var.onInitializeAccessibilityNodeInfo(obtain2);
        k47 k47Var3 = rc2Var.Q5;
        if (k47Var3 != null && k47Var3.N3()) {
            k47 k47Var4 = rc2Var.Q5;
            if (!k47Var4.r1 && k47Var4.E4()) {
                z5 = true;
                k47 k47Var5 = rc2Var.Q5;
                boolean z8 = k47Var5 == null && k47Var5.R2();
                k47 k47Var6 = rc2Var.Q5;
                j = k47Var6 == null ? k47Var6.H0 : 0L;
                spannableStringBuilder = rc2Var.P2;
                if (spannableStringBuilder == null) {
                    staticLayoutArr = staticLayoutArr2;
                    if (rc2Var.Q2 == z5 && rc2Var.R2 == z8) {
                        arrayList3 = arrayList8;
                        arrayList2 = arrayList9;
                        if (rc2Var.S2 == j) {
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
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, jb6.M0(2131754936, "AccActionMessageOptions")));
                            int iconForCurrentState = rc2Var.getIconForCurrentState();
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 0 ? iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? iconForCurrentState != 5 ? rc2Var.Q5.D == 16 ? jb6.M0(2131752586, "CallAgain") : null : jb6.M0(2131754933, "AccActionOpenFile") : jb6.M0(2131754941, "AccActionCancelDownload") : jb6.M0(2131754938, "AccActionDownload") : jb6.M0(2131754930, "AccActionPause") : jb6.M0(2131754929, "AccActionPlay")));
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, jb6.M0(2131754937, "AccActionEnterSelectionMode")));
                            if (rc2Var.getMiniIconForCurrentState() == 2) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, jb6.M0(2131754938, "AccActionDownload")));
                            }
                            if (!rc2Var.V8 || rc2Var.s8) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, jb6.M0(2131744013, "SummaryTitle")));
                            }
                            arrayList6 = rc2Var.Q5.B2;
                            if (arrayList6 != null) {
                                int size6 = arrayList6.size();
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= size6) {
                                        break;
                                    }
                                    Object obj3 = arrayList6.get(i34);
                                    i34++;
                                    if (((h47) obj3).O) {
                                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, jb6.M0(2131751702, "CopyCode")));
                                        break;
                                    }
                                }
                            }
                            if ((!rc2Var.Q5.O4() || rc2Var.Q5.g4() || rc2Var.Q5.I3()) && MediaController.w().D(rc2Var.Q5)) {
                                rc2Var.F4.f(accessibilityNodeInfo2);
                            }
                            if (rc2Var.I4 && rc2Var.J4 != null) {
                                accessibilityNodeInfo2.addChild(rc2Var, 493);
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                if (rc2Var.f6 && rc2Var.va != null && !rc2Var.Q5.N3()) {
                                    accessibilityNodeInfo2.addChild(rc2Var, 5000);
                                }
                                CharSequence charSequence3 = rc2Var.Q5.v;
                                if (charSequence3 instanceof Spannable) {
                                    Spannable spannable3 = (Spannable) charSequence3;
                                    int i35 = 0;
                                    for (CharacterStyle characterStyle : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                                        accessibilityNodeInfo2.addChild(rc2Var, i35 + 2000);
                                        i35++;
                                    }
                                }
                                CharSequence charSequence4 = rc2Var.Q5.z;
                                if ((charSequence4 instanceof Spannable) && rc2Var.m3 != null) {
                                    Spannable spannable4 = (Spannable) charSequence4;
                                    int i36 = 0;
                                    for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                                        accessibilityNodeInfo2.addChild(rc2Var, i36 + 3000);
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
                                accessibilityNodeInfo2.addChild(rc2Var, i37 + 1000);
                                i37++;
                            }
                            if (rc2Var.r5 && rc2Var.o5 != -1 && rc2Var.Q5.S3()) {
                                accessibilityNodeInfo2.addChild(rc2Var, 495);
                            }
                            size2 = arrayList4.size();
                            int i38 = 0;
                            i8 = 0;
                            while (i8 < size2) {
                                Object obj5 = arrayList4.get(i8);
                                i8++;
                                accessibilityNodeInfo2.addChild(rc2Var, i38 + 500);
                                i38++;
                            }
                            if (rc2Var.u2 && !rc2Var.M2.isEmpty()) {
                                accessibilityNodeInfo2.addChild(rc2Var, 499);
                            }
                            sc2Var = rc2Var.w2;
                            if (sc2Var != null && sc2Var.b && (rectF = rc2Var.v2) != null && !rectF.isEmpty()) {
                                accessibilityNodeInfo2.addChild(rc2Var, 492);
                                arrayList7 = rc2Var.w2.g;
                                if (arrayList7 != null && arrayList7.size() > 1) {
                                    ArrayList arrayList12 = rc2Var.w2.g;
                                    size3 = arrayList12.size();
                                    i10 = 0;
                                    while (i10 < size3) {
                                        Object obj6 = arrayList12.get(i10);
                                        i10++;
                                        oc2 oc2Var3 = (oc2) obj6;
                                        if (rc2Var.w2.d && oc2Var3.a == 5 && !oc2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(rc2Var, 491);
                                        }
                                        if (rc2Var.w2.e && oc2Var3.a == 31 && !oc2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(rc2Var, 490);
                                        }
                                        if (rc2Var.w2.c && oc2Var3.a == 30 && !oc2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(rc2Var, 489);
                                        }
                                    }
                                }
                            }
                            if (rc2Var.n7 != null) {
                                accessibilityNodeInfo2.addChild(rc2Var, 496);
                            }
                            b2 = rc2Var.R8;
                            if (b2 != 1 || b2 == 2) {
                                accessibilityNodeInfo2.addChild(rc2Var, 498);
                            }
                            if (rc2Var.Q7 != null) {
                                accessibilityNodeInfo2.addChild(rc2Var, 497);
                            }
                            k47Var = rc2Var.Q5;
                            if (k47Var != null && (uj9Var2 = k47Var.y2) != null) {
                                int i39 = 0;
                                for (i9 = 0; i9 < uj9Var2.g.size(); i9++) {
                                    qi9 qi9Var = (qi9) uj9Var2.g.get(i9);
                                    if (qi9Var.R()) {
                                        int B = qi9Var.B() + (qi9Var.r == null ? 0 : 1);
                                        for (int i40 = 0; i40 < B; i40++) {
                                            accessibilityNodeInfo2.addChild(rc2Var, i39 + 6000 + i40);
                                        }
                                        i39 += B;
                                    }
                                }
                            }
                            if (staticLayoutArr[0] != null && staticLayoutArr[1] != null) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, jb6.M0(2131754932, "AccActionOpenForwardedOrigin")));
                            }
                            if (rc2Var.k1 && rc2Var.getBackground() == null) {
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
                if (rc2Var.f6 || rc2Var.va == null || rc2Var.Q5.N3()) {
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList3;
                    j2 = j;
                } else {
                    spannableStringBuilder.append((CharSequence) m9c.r(rc2Var.va));
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList3;
                    spannableStringBuilder.setSpan(new zb2(this, rc2Var.va), 0, spannableStringBuilder.length(), 33);
                    CharSequence adminAccessibilityText = rc2Var.getAdminAccessibilityText();
                    if (TextUtils.isEmpty(adminAccessibilityText)) {
                        j2 = j;
                    } else if (rc2Var.l9) {
                        j2 = j;
                        spannableStringBuilder.append(' ').append((CharSequence) jb6.Z(rc2Var.j9 ? 2131754726 : 2131754725, adminAccessibilityText));
                    } else {
                        j2 = j;
                        spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                    }
                    spannableStringBuilder.append('\n');
                }
                if (rc2Var.E9) {
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
                document = rc2Var.N1;
                if (document != null && rc2Var.M1 == 1) {
                    s = bc4.s(document);
                    if (s.indexOf(46) != -1) {
                        spannableStringBuilder.append((CharSequence) jb6.Z(2131754889, s.substring(s.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                    }
                }
                uj9Var = rc2Var.Q5.y2;
                if (uj9Var == null && !uj9Var.g.isEmpty()) {
                    ArrayList arrayList13 = rc2Var.Q5.y2.g;
                    int size7 = arrayList13.size();
                    int i42 = 0;
                    while (i42 < size7) {
                        Object obj7 = arrayList13.get(i42);
                        i42++;
                        qi9 qi9Var2 = (qi9) obj7;
                        if (qi9Var2.R()) {
                            int length3 = spannableStringBuilder.length();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            qi9Var2.j(spannableStringBuilder2);
                            ArrayList arrayList14 = arrayList13;
                            CharSequence x = qi9Var2.x();
                            int i43 = size7;
                            CharSequence text = (!qi9Var2.x || (staticLayout = qi9Var2.d) == null) ? null : staticLayout.getText();
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
                } else if (!TextUtils.isEmpty(rc2Var.Q5.v)) {
                    CharSequence charSequence5 = rc2Var.Q5.v;
                    if (charSequence5 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence5;
                        bl2[] bl2VarArr = (bl2[]) spanned.getSpans(0, spanned.length(), bl2.class);
                        if (bl2VarArr != null && bl2VarArr.length > 0) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence5);
                            Arrays.sort(bl2VarArr, new yb2(spanned, (byte) 0));
                            int length4 = bl2VarArr.length;
                            int i44 = 0;
                            while (i44 < length4) {
                                bl2 bl2Var = bl2VarArr[i44];
                                int i45 = length4;
                                int spanStart = spanned.getSpanStart(bl2Var);
                                Spanned spanned2 = spanned;
                                if (spanStart >= 0) {
                                    spannableStringBuilder3.insert(spanStart, (CharSequence) (((Object) (TextUtils.isEmpty(bl2Var.a) ? jb6.L0(2131754897) : jb6.Z(2131754896, h47.b(bl2Var.a)))) + ". "));
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
                if (rc2Var.N1 != null && (((b = rc2Var.M1) == 1 || b == 2 || b == 4) && rc2Var.O3 == 1 && rc2Var.A3 != null)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (rc2Var.Q5.n4()) {
                        str4 = "AccDescrDownloadProgress";
                        i6 = 2131754888;
                    } else {
                        str4 = "AccDescrUploadProgress";
                        i6 = 2131754741;
                    }
                    spannableStringBuilder.append((CharSequence) jb6.Y(i6, str4, gm.i0(rc2Var.Q5.H0, false, false), gm.i0(rc2Var.A1, false, false)));
                }
                if (!rc2Var.Q5.I3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) jb6.Y(2131754831, "AccDescrMusicInfo", rc2Var.Q5.w1(true), rc2Var.Q5.y1(true)));
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) jb6.z((int) rc2Var.Q5.L0()));
                } else if (rc2Var.Q5.O4() || rc2Var.Kb) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) jb6.z((int) rc2Var.Q5.L0()));
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (rc2Var.Q5.R2()) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131754837, "AccDescrMsgNotPlayed"));
                    } else {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131754836, "AccDescrMsgPlayed"));
                    }
                }
                if (rc2Var.j5 != null) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) rc2Var.j5.question.text);
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (rc2Var.X4) {
                        M0 = jb6.M0(2131750627, "FinalResults");
                    } else {
                        TLRPC.Poll poll2 = rc2Var.j5;
                        boolean z9 = poll2.quiz;
                        boolean z10 = poll2.public_voters;
                        M0 = z9 ? z10 ? jb6.M0(2131746178, "QuizPoll") : jb6.M0(2131754213, "AnonymousQuizPoll") : z10 ? jb6.M0(2131746321, "PublicPoll") : jb6.M0(2131754214, "AnonymousPoll");
                    }
                    spannableStringBuilder.append((CharSequence) M0);
                }
                if (rc2Var.N1 != null) {
                    if (rc2Var.M1 == 4) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) jb6.z((int) rc2Var.Q5.L0()));
                    }
                    if (rc2Var.O3 == 0 || rc2Var.M1 == 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) gm.i0(rc2Var.N1.size, false, false));
                    }
                }
                if (!rc2Var.Q5.S4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(rc2Var.Q5.i2());
                } else if (k47.n1(rc2Var.Q5.k) != null && !TextUtils.isEmpty(rc2Var.Q5.z)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(rc2Var.Q5.z);
                }
                if (rc2Var.Q5.N3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) jb6.Y(2131754788, "AccDescrReceivedDate", jb6.M0(2131743797, "TodayAt") + " " + ((Object) rc2Var.Q9)));
                } else if (rc2Var.Q5.p4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (rc2Var.Q5.r1) {
                        spannableStringBuilder.append((CharSequence) jb6.Y(2131754780, "AccDescrScheduledDate", rc2Var.Q9));
                    } else {
                        spannableStringBuilder.append((CharSequence) jb6.Y(2131754764, "AccDescrSentDate", jb6.M0(2131743797, "TodayAt") + " " + ((Object) rc2Var.Q9)));
                        spannableStringBuilder.append((CharSequence) ", ");
                        if (rc2Var.Q5.E4()) {
                            str3 = "AccDescrMsgUnread";
                            i5 = 2131754832;
                        } else {
                            str3 = "AccDescrMsgRead";
                            i5 = 2131754835;
                        }
                        spannableStringBuilder.append((CharSequence) jb6.M0(i5, str3));
                    }
                } else if (rc2Var.Q5.n4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131754834, "AccDescrMsgSending"));
                    RadialProgress2 radialProgress2 = rc2Var.Q0;
                    float f6 = (radialProgress2.c ? radialProgress2.j : radialProgress2.i).w;
                    if (f6 > 0.0f) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f6 * 100.0f))).append((CharSequence) "%");
                    }
                } else if (rc2Var.Q5.m4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131754833, "AccDescrMsgSendingError"));
                }
                if (rc2Var.getRepliesCount() > 0 && !rc2Var.x7) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) jb6.G(rc2Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
                }
                tL_messageReactions = rc2Var.Q5.k.reactions;
                if (tL_messageReactions != null && (arrayList5 = tL_messageReactions.results) != null) {
                    String str5 = "";
                    if (arrayList5.size() != 1) {
                        TLRPC.ReactionCount reactionCount = rc2Var.Q5.k.reactions.results.get(0);
                        TLRPC.Reaction reaction = reactionCount.reaction;
                        String str6 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                        int i46 = reactionCount.count;
                        if (i46 == 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            ArrayList<TLRPC.MessagePeerReaction> arrayList15 = rc2Var.Q5.k.reactions.recent_reactions;
                            if (arrayList15 == null || arrayList15.size() != 1 || (messagePeerReaction = rc2Var.Q5.k.reactions.recent_reactions.get(0)) == null) {
                                z6 = false;
                            } else {
                                TLRPC.User W1 = oc7.r1(rc2Var.a6).W1(Long.valueOf(k47.B1(messagePeerReaction.peer_id)));
                                z6 = m9c.D(W1);
                                if (W1 != null) {
                                    str5 = m9c.j(W1);
                                }
                            }
                            if (z6) {
                                spannableStringBuilder.append((CharSequence) jb6.Y(2131754724, "AccDescrYouReactedWith", str6));
                            } else {
                                spannableStringBuilder.append((CharSequence) jb6.Y(2131754790, "AccDescrReactedWith", str5, str6));
                            }
                        } else if (i46 > 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            spannableStringBuilder.append((CharSequence) jb6.G(reactionCount.count, "AccDescrNumberOfPeopleReactions", str6));
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746120, "Reactions")).append((CharSequence) ": ");
                        int size8 = rc2Var.Q5.k.reactions.results.size();
                        int i47 = 0;
                        while (i47 < size8) {
                            TLRPC.ReactionCount reactionCount2 = rc2Var.Q5.k.reactions.results.get(i47);
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
                if ((rc2Var.Q5.k.flags & 1024) == 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    i4 = 0;
                    spannableStringBuilder.append((CharSequence) jb6.G(rc2Var.Q5.k.views, "AccDescrNumberOfViews", new Object[0]));
                } else {
                    i4 = 0;
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannableStringBuilder.getSpans(i4, spannableStringBuilder.length(), ClickableSpan.class)) {
                    int spanStart2 = spannableStringBuilder.getSpanStart(characterStyle3);
                    int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle3);
                    spannableStringBuilder.removeSpan(characterStyle3);
                    spannableStringBuilder.setSpan(new q1((Object) this, (Object) characterStyle3, (byte) 5), spanStart2, spanEnd, 33);
                }
                rc2Var.P2 = spannableStringBuilder;
                rc2Var.Q2 = z5;
                rc2Var.R2 = z8;
                rc2Var.S2 = j2;
                if (Build.VERSION.SDK_INT < 24) {
                }
                accessibilityNodeInfo2.setEnabled(true);
                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, jb6.M0(2131754936, "AccActionMessageOptions")));
                int iconForCurrentState2 = rc2Var.getIconForCurrentState();
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState2 != 0 ? iconForCurrentState2 != 1 ? iconForCurrentState2 != 2 ? iconForCurrentState2 != 3 ? iconForCurrentState2 != 5 ? rc2Var.Q5.D == 16 ? jb6.M0(2131752586, "CallAgain") : null : jb6.M0(2131754933, "AccActionOpenFile") : jb6.M0(2131754941, "AccActionCancelDownload") : jb6.M0(2131754938, "AccActionDownload") : jb6.M0(2131754930, "AccActionPause") : jb6.M0(2131754929, "AccActionPlay")));
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, jb6.M0(2131754937, "AccActionEnterSelectionMode")));
                if (rc2Var.getMiniIconForCurrentState() == 2) {
                }
                if (!rc2Var.V8) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, jb6.M0(2131744013, "SummaryTitle")));
                arrayList6 = rc2Var.Q5.B2;
                if (arrayList6 != null) {
                }
                if (!rc2Var.Q5.O4()) {
                }
                rc2Var.F4.f(accessibilityNodeInfo2);
                if (rc2Var.I4) {
                    accessibilityNodeInfo2.addChild(rc2Var, 493);
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                size = arrayList2.size();
                int i372 = 0;
                i7 = 0;
                while (i7 < size) {
                }
                if (rc2Var.r5) {
                    accessibilityNodeInfo2.addChild(rc2Var, 495);
                }
                size2 = arrayList4.size();
                int i382 = 0;
                i8 = 0;
                while (i8 < size2) {
                }
                if (rc2Var.u2) {
                    accessibilityNodeInfo2.addChild(rc2Var, 499);
                }
                sc2Var = rc2Var.w2;
                if (sc2Var != null) {
                    accessibilityNodeInfo2.addChild(rc2Var, 492);
                    arrayList7 = rc2Var.w2.g;
                    if (arrayList7 != null) {
                        ArrayList arrayList122 = rc2Var.w2.g;
                        size3 = arrayList122.size();
                        i10 = 0;
                        while (i10 < size3) {
                        }
                    }
                }
                if (rc2Var.n7 != null) {
                }
                b2 = rc2Var.R8;
                if (b2 != 1) {
                }
                accessibilityNodeInfo2.addChild(rc2Var, 498);
                if (rc2Var.Q7 != null) {
                }
                k47Var = rc2Var.Q5;
                if (k47Var != null) {
                    int i392 = 0;
                    while (i9 < uj9Var2.g.size()) {
                    }
                }
                if (staticLayoutArr[0] != null) {
                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, jb6.M0(2131754932, "AccActionOpenForwardedOrigin")));
                }
                if (rc2Var.k1) {
                }
                accessibilityNodeInfo2.setSelected(true);
                return accessibilityNodeInfo2;
            }
        }
        z5 = false;
        k47 k47Var52 = rc2Var.Q5;
        if (k47Var52 == null) {
        }
        k47 k47Var62 = rc2Var.Q5;
        if (k47Var62 == null) {
        }
        spannableStringBuilder = rc2Var.P2;
        if (spannableStringBuilder == null) {
        }
        spannableStringBuilder = new SpannableStringBuilder();
        if (rc2Var.f6) {
        }
        accessibilityNodeInfo = obtain2;
        arrayList4 = arrayList3;
        j2 = j;
        if (rc2Var.E9) {
        }
        document = rc2Var.N1;
        if (document != null) {
            s = bc4.s(document);
            if (s.indexOf(46) != -1) {
            }
        }
        uj9Var = rc2Var.Q5.y2;
        if (uj9Var == null) {
        }
        if (!TextUtils.isEmpty(rc2Var.Q5.v)) {
        }
        if (rc2Var.N1 != null) {
            spannableStringBuilder.append((CharSequence) "\n");
            if (rc2Var.Q5.n4()) {
            }
            spannableStringBuilder.append((CharSequence) jb6.Y(i6, str4, gm.i0(rc2Var.Q5.H0, false, false), gm.i0(rc2Var.A1, false, false)));
        }
        if (!rc2Var.Q5.I3()) {
        }
        if (rc2Var.j5 != null) {
        }
        if (rc2Var.N1 != null) {
        }
        if (!rc2Var.Q5.S4()) {
        }
        if (rc2Var.Q5.N3()) {
        }
        if (rc2Var.getRepliesCount() > 0) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) jb6.G(rc2Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
        }
        tL_messageReactions = rc2Var.Q5.k.reactions;
        if (tL_messageReactions != null) {
            String str52 = "";
            if (arrayList5.size() != 1) {
            }
        }
        if ((rc2Var.Q5.k.flags & 1024) == 0) {
        }
        spannableStringBuilder.append((CharSequence) "\n");
        while (r6 < r5) {
        }
        rc2Var.P2 = spannableStringBuilder;
        rc2Var.Q2 = z5;
        rc2Var.R2 = z8;
        rc2Var.S2 = j2;
        if (Build.VERSION.SDK_INT < 24) {
        }
        accessibilityNodeInfo2.setEnabled(true);
        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
        if (collectionItemInfo != null) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, jb6.M0(2131754936, "AccActionMessageOptions")));
        int iconForCurrentState22 = rc2Var.getIconForCurrentState();
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState22 != 0 ? iconForCurrentState22 != 1 ? iconForCurrentState22 != 2 ? iconForCurrentState22 != 3 ? iconForCurrentState22 != 5 ? rc2Var.Q5.D == 16 ? jb6.M0(2131752586, "CallAgain") : null : jb6.M0(2131754933, "AccActionOpenFile") : jb6.M0(2131754941, "AccActionCancelDownload") : jb6.M0(2131754938, "AccActionDownload") : jb6.M0(2131754930, "AccActionPause") : jb6.M0(2131754929, "AccActionPlay")));
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, jb6.M0(2131754937, "AccActionEnterSelectionMode")));
        if (rc2Var.getMiniIconForCurrentState() == 2) {
        }
        if (!rc2Var.V8) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, jb6.M0(2131744013, "SummaryTitle")));
        arrayList6 = rc2Var.Q5.B2;
        if (arrayList6 != null) {
        }
        if (!rc2Var.Q5.O4()) {
        }
        rc2Var.F4.f(accessibilityNodeInfo2);
        if (rc2Var.I4) {
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        size = arrayList2.size();
        int i3722 = 0;
        i7 = 0;
        while (i7 < size) {
        }
        if (rc2Var.r5) {
        }
        size2 = arrayList4.size();
        int i3822 = 0;
        i8 = 0;
        while (i8 < size2) {
        }
        if (rc2Var.u2) {
        }
        sc2Var = rc2Var.w2;
        if (sc2Var != null) {
        }
        if (rc2Var.n7 != null) {
        }
        b2 = rc2Var.R8;
        if (b2 != 1) {
        }
        accessibilityNodeInfo2.addChild(rc2Var, 498);
        if (rc2Var.Q7 != null) {
        }
        k47Var = rc2Var.Q5;
        if (k47Var != null) {
        }
        if (staticLayoutArr[0] != null) {
        }
        if (rc2Var.k1) {
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
        mc2 mc2Var;
        bc2 bc2Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean T;
        CharSequence C;
        rc2 rc2Var = this.a;
        if (i == -1) {
            rc2Var.performAccessibilityAction(i2, bundle);
            return true;
        }
        if (i2 == 64) {
            rc2Var.l3(i, 32768, null);
            return true;
        }
        if (i2 == 16) {
            if (i == 5000) {
                mc2 mc2Var2 = rc2Var.eb;
                if (mc2Var2 != null) {
                    mc2Var2.W(rc2Var, rc2Var.va, 0.0f, 0.0f);
                    return true;
                }
            } else if (i >= 6000) {
                int[] iArr = {0};
                qi9 b = b(iArr, i);
                if (b != null) {
                    int i3 = iArr[0];
                    CheckBoxBase checkBoxBase = b.r;
                    if (checkBoxBase == null || i3 != 0) {
                        T = b.T(i3 - (checkBoxBase == null ? 0 : 1), rc2Var);
                    } else if (b.n()) {
                        b.d0();
                        T = true;
                    } else {
                        T = false;
                    }
                    if (T) {
                        rc2Var.l3(i, 1, null);
                        int i4 = iArr[0];
                        if (b.r == null || i4 != 0) {
                            C = b.C();
                        } else {
                            C = jb6.M0(b.F() ? 2131754902 : 2131754829, null);
                        }
                        gm.g2(C);
                        return true;
                    }
                }
            } else if (i >= 3000) {
                ClickableSpan a = a(i, true);
                if (a != null) {
                    rc2Var.eb.M(rc2Var, a, false);
                    rc2Var.l3(i, 1, null);
                    return true;
                }
            } else {
                if (i < 2000) {
                    if (i >= 1000) {
                        int i5 = i - 1000;
                        if (i5 < rc2Var.I5.size()) {
                            wp0 wp0Var = (wp0) rc2Var.I5.get(i5);
                            mc2 mc2Var3 = rc2Var.eb;
                            if (mc2Var3 != null && !wp0Var.m) {
                                ir0 ir0Var = wp0Var.j;
                                if (ir0Var != null) {
                                    mc2Var3.B1(rc2Var, ir0Var);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = wp0Var.i;
                                    if (keyboardInlineButton != null) {
                                        mc2Var3.L0(rc2Var, keyboardInlineButton);
                                    }
                                }
                            }
                            rc2Var.l3(i, 1, null);
                            return true;
                        }
                    } else if (i >= 500) {
                        int i6 = i - 500;
                        if (i6 < rc2Var.Q4.size()) {
                            qc2 qc2Var = (qc2) rc2Var.Q4.get(i6);
                            if (rc2Var.eb != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(qc2Var.s);
                                rc2Var.eb.b1(rc2Var, arrayList, -1, 0, 0);
                            }
                            rc2Var.l3(i, 1, null);
                            return true;
                        }
                    } else {
                        if (i == 495) {
                            rc2Var.G0();
                            return true;
                        }
                        if (i == 499) {
                            mc2 mc2Var4 = rc2Var.eb;
                            if (mc2Var4 != null) {
                                mc2Var4.t1(rc2Var, rc2Var.y2);
                                return true;
                            }
                        } else if (i == 492) {
                            mc2 mc2Var5 = rc2Var.eb;
                            if (mc2Var5 != null) {
                                mc2Var5.t1(rc2Var, 5);
                                return true;
                            }
                        } else if (i == 491) {
                            mc2 mc2Var6 = rc2Var.eb;
                            if (mc2Var6 != null) {
                                mc2Var6.t1(rc2Var, 5);
                                return true;
                            }
                        } else if (i == 490) {
                            mc2 mc2Var7 = rc2Var.eb;
                            if (mc2Var7 != null) {
                                mc2Var7.t1(rc2Var, 31);
                                return true;
                            }
                        } else if (i == 489) {
                            mc2 mc2Var8 = rc2Var.eb;
                            if (mc2Var8 != null) {
                                mc2Var8.t1(rc2Var, 30);
                                return true;
                            }
                        } else if (i == 498) {
                            mc2 mc2Var9 = rc2Var.eb;
                            if (mc2Var9 != null) {
                                mc2Var9.Z0(rc2Var);
                                return true;
                            }
                        } else if (i == 497) {
                            if (rc2Var.eb != null) {
                                if (rc2Var.o6 && !rc2Var.m6) {
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = rc2Var.Q5.k.reply_to;
                                }
                                if (rc2Var.Q5.B2() || rc2Var.M7 || ((message = rc2Var.Q5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)) {
                                    rc2Var.eb.H(rc2Var, rc2Var.Q5.N1(), 0.0f, 0.0f, false);
                                    return true;
                                }
                            }
                        } else if (i == 494) {
                            mc2 mc2Var10 = rc2Var.eb;
                            if (mc2Var10 != null) {
                                TLRPC.Chat chat = rc2Var.Ga;
                                if (chat != null) {
                                    mc2Var10.W1(rc2Var, chat, rc2Var.Q5.k.fwd_from.channel_post, rc2Var.h1, rc2Var.i1, false);
                                    return true;
                                }
                                TLRPC.User user = rc2Var.Ea;
                                if (user != null) {
                                    mc2Var10.W(rc2Var, user, rc2Var.h1, rc2Var.i1);
                                    return true;
                                }
                                if (rc2Var.Ha != null) {
                                    mc2Var10.Q0(rc2Var);
                                    return true;
                                }
                            }
                        } else if (i == 496) {
                            mc2 mc2Var11 = rc2Var.eb;
                            if (mc2Var11 != null) {
                                if (rc2Var.u6) {
                                    mc2Var11.Z0(rc2Var);
                                    return true;
                                }
                                mc2Var11.F0(rc2Var);
                                return true;
                            }
                        } else if (i == 493 && (bc2Var = rc2Var.J4) != null) {
                            bc2Var.p();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan a2 = a(i, false);
                if (a2 != null) {
                    rc2Var.eb.M(rc2Var, a2, false);
                    rc2Var.l3(i, 1, null);
                    return true;
                }
            }
        } else if (i2 == 32) {
            ClickableSpan a3 = a(i, i >= 3000);
            if (a3 != null && (mc2Var = rc2Var.eb) != null) {
                mc2Var.M(rc2Var, a3, true);
                rc2Var.l3(i, 2, null);
            }
        }
        return true;
    }
}
