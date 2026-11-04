package org.telegram.ui.Cells;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cv;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.wi;
import org.telegram.messenger.xt;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z0 extends AccessibilityNodeProvider {
    public final q1 a;
    public final Path b = new Path();
    public final RectF c = new RectF();
    public final Rect d = new Rect();

    public z0(q1 q1Var) {
        this.a = q1Var;
    }

    public final ClickableSpan a(int i3, boolean z10) {
        if (i3 == 5000) {
            return null;
        }
        q1 q1Var = this.a;
        if (z10) {
            int i10 = i3 - 3000;
            CharSequence charSequence = q1Var.P5.z;
            if (!(charSequence instanceof Spannable) || i10 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i10) {
                return null;
            }
            return clickableSpanArr[i10];
        }
        int i11 = i3 - 2000;
        CharSequence charSequence2 = q1Var.P5.v;
        if (!(charSequence2 instanceof Spannable) || i11 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i11) {
            return null;
        }
        return clickableSpanArr2[i11];
    }

    public final xt b(int[] iArr, int i3) {
        cv cvVar;
        zi ziVar = this.a.P5;
        if (ziVar == null || (cvVar = ziVar.w2) == null) {
            return null;
        }
        ArrayList arrayList = cvVar.g;
        int i10 = i3 - 6000;
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            xt xtVar = (xt) arrayList.get(i12);
            if (xtVar.S()) {
                int B = xtVar.B() + (xtVar.r == null ? 0 : 1) + i11;
                if (i10 < B) {
                    iArr[0] = i10 - i11;
                    return xtVar;
                }
                i11 = B;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0864 A[LOOP:3: B:101:0x0862->B:102:0x0864, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0896 A[LOOP:4: B:112:0x0894->B:113:0x0896, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x067c A[LOOP:11: B:416:0x067a->B:417:0x067c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07f3  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        boolean z10;
        String str;
        int i10;
        String S;
        ArrayList arrayList;
        String str2;
        int i11;
        boolean z11;
        boolean z12;
        char c2;
        boolean z13;
        long j10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SpannableStringBuilder spannableStringBuilder;
        AccessibilityNodeInfo accessibilityNodeInfo;
        StaticLayout[] staticLayoutArr;
        long j11;
        ArrayList arrayList4;
        TLRPC.Document document;
        cv cvVar;
        Spanned spanned;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i12;
        ArrayList<TLRPC.ReactionCount> arrayList5;
        boolean z14;
        TLRPC.MessagePeerReaction messagePeerReaction;
        String str3;
        int i13;
        String M0;
        int i14;
        StaticLayout staticLayout;
        String s6;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        ArrayList arrayList6;
        int size;
        int i15;
        int size2;
        int i16;
        r1 r1Var;
        int i17;
        zi ziVar;
        cv cvVar2;
        int i18;
        RectF rectF;
        ArrayList arrayList7;
        int size3;
        int i19;
        int[] iArr = {0, 0};
        q1 q1Var = this.a;
        q1Var.getLocationOnScreen(iArr);
        ArrayList arrayList8 = q1Var.P4;
        ArrayList arrayList9 = q1Var.H5;
        StaticLayout[] staticLayoutArr2 = q1Var.p9;
        SparseArray sparseArray = q1Var.wb;
        if (i3 != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setSource(q1Var, i3);
            obtain.setParent(q1Var);
            obtain.setPackageName(q1Var.getContext().getPackageName());
            Rect rect = this.d;
            if (i3 == 5000) {
                TLRPC.User user = q1Var.ia;
                if (user != null) {
                    obtain.setText(l10.p(user));
                    float f10 = q1Var.g9;
                    int i20 = (int) f10;
                    float f11 = q1Var.h9;
                    rect.set(i20, (int) f11, (int) (f10 + q1Var.e9), (int) (f11 + (q1Var.U8 != null ? r4.getHeight() : 10)));
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new Rect(rect));
                    }
                    rect.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect);
                    obtain.setClassName("android.widget.TextView");
                    obtain.setEnabled(true);
                    obtain.setClickable(true);
                    obtain.setLongClickable(true);
                    obtain.addAction(16);
                    obtain.addAction(32);
                    z10 = true;
                }
                return null;
            }
            if (i3 >= 6000) {
                int[] iArr2 = {0};
                xt b10 = b(iArr2, i3);
                if (b10 != null) {
                    obtain.setText(b10.x(iArr2[0]));
                    b10.w(iArr2[0], rect);
                    rect.offset(q1Var.o0, q1Var.u0);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new Rect(rect));
                    }
                    rect.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect);
                    int i21 = iArr2[0];
                    boolean z15 = b10.r != null && i21 == 0;
                    if (z15) {
                        obtain.setClassName("android.widget.CheckBox");
                    } else if (b10.P(i21)) {
                        obtain.setClassName("android.widget.TextView");
                    } else {
                        obtain.setClassName("android.widget.ImageView");
                    }
                    obtain.setEnabled(true);
                    if (z15) {
                        obtain.setCheckable(true);
                        c2 = 0;
                        obtain.setChecked(b10.N(iArr2[0]));
                    } else {
                        c2 = 0;
                    }
                    boolean O = b10.O(iArr2[c2]);
                    obtain.setClickable(O);
                    if (O) {
                        obtain.addAction(16);
                    }
                    z10 = true;
                }
                return null;
            }
            RectF rectF2 = this.c;
            Path path = this.b;
            if (i3 >= 3000) {
                CharSequence charSequence = q1Var.P5.z;
                if ((charSequence instanceof Spannable) && q1Var.l3 != null) {
                    Spannable spannable = (Spannable) charSequence;
                    ClickableSpan a10 = a(i3, false);
                    if (a10 != null) {
                        int[] W1 = q1.W1(spannable, a10);
                        obtain.setText(spannable.subSequence(W1[0], W1[1]).toString());
                        ArrayList arrayList10 = q1Var.l3.e;
                        int size4 = arrayList10.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= size4) {
                                z12 = true;
                                break;
                            }
                            Object obj = arrayList10.get(i22);
                            i22++;
                            wi wiVar = (wi) obj;
                            int length = wiVar.e.getText().length();
                            int i23 = wiVar.n;
                            ArrayList arrayList11 = arrayList10;
                            int i24 = W1[0];
                            if (i23 <= i24) {
                                int i25 = length + i23;
                                int i26 = W1[1];
                                if (i25 >= i26) {
                                    wiVar.e.getSelectionPath(i24 - i23, i26 - i23, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) wiVar.p(q1Var.l3.e, q1Var.hb));
                                    rect.offset(q1Var.o0, q1Var.u0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i3) == null) {
                                        sparseArray.put(i3, new Rect(rect));
                                    }
                                    z12 = true;
                                    rect.offset(iArr[0], iArr[1]);
                                    obtain.setBoundsInScreen(rect);
                                }
                            }
                            arrayList10 = arrayList11;
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z12);
                        obtain.setClickable(z12);
                        obtain.setLongClickable(z12);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i3 >= 2000) {
                CharSequence charSequence2 = q1Var.P5.v;
                if (charSequence2 instanceof Spannable) {
                    Spannable spannable2 = (Spannable) charSequence2;
                    ClickableSpan a11 = a(i3, false);
                    if (a11 != null) {
                        int[] W12 = q1.W1(spannable2, a11);
                        obtain.setText(spannable2.subSequence(W12[0], W12[1]).toString());
                        ArrayList arrayList12 = q1Var.P5.z2;
                        int size5 = arrayList12.size();
                        int i27 = 0;
                        while (true) {
                            if (i27 >= size5) {
                                z11 = true;
                                break;
                            }
                            Object obj2 = arrayList12.get(i27);
                            i27++;
                            wi wiVar2 = (wi) obj2;
                            int length2 = wiVar2.e.getText().length();
                            int i28 = wiVar2.n;
                            int i29 = W12[0];
                            if (i28 <= i29) {
                                int i30 = length2 + i28;
                                int i31 = W12[1];
                                if (i30 >= i31) {
                                    wiVar2.e.getSelectionPath(i29 - i28, i31 - i28, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) wiVar2.p(q1Var.P5.z2, q1Var.hb));
                                    rect.offset(q1Var.o0, q1Var.u0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i3) == null) {
                                        sparseArray.put(i3, new Rect(rect));
                                    }
                                    z11 = true;
                                    rect.offset(iArr[0], iArr[1]);
                                    obtain.setBoundsInScreen(rect);
                                }
                            }
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z11);
                        obtain.setClickable(z11);
                        obtain.setLongClickable(z11);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i3 >= 1000) {
                int i32 = i3 - 1000;
                if (i32 < arrayList9.size()) {
                    c0 c0Var = (c0) arrayList9.get(i32);
                    if (!c0Var.b) {
                        obtain.setText(c0Var.h.j());
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        obtain.setClickable(true);
                        obtain.addAction(16);
                        float f12 = c0Var.c;
                        float f13 = q1Var.J5;
                        int i33 = c0Var.d;
                        rect.set((int) (f12 * f13), i33, (int) ((f12 + c0Var.e) * f13), c0Var.f + i33);
                        rect.offset(q1Var.P5.Q3() ? (q1Var.getMeasuredWidth() - q1Var.getWidthForButtons()) - org.telegram.messenger.g0.L(10.0f) : q1Var.M6 + org.telegram.messenger.g0.L(q1Var.B6 ? 1.0f : 7.0f), q1Var.d7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i3) == null) {
                            sparseArray.put(i3, new Rect(rect));
                        }
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i3 >= 500) {
                int i34 = i3 - 500;
                if (i34 < arrayList8.size()) {
                    p1 p1Var = (p1) arrayList8.get(i34);
                    StringBuilder sb2 = new StringBuilder(p1Var.p.getText());
                    if (q1Var.V4) {
                        obtain.setSelected(p1Var.i);
                        sb2.append(", ");
                        sb2.append(p1Var.d);
                        sb2.append("%");
                        TLRPC.Poll poll = q1Var.i5;
                        if (poll != null && poll.quiz && (p1Var.i || p1Var.l)) {
                            sb2.append(", ");
                            if (p1Var.l) {
                                str2 = "AccDescrQuizCorrectAnswer";
                                i11 = 2131754796;
                            } else {
                                str2 = "AccDescrQuizIncorrectAnswer";
                                i11 = 2131754794;
                            }
                            sb2.append(bd.M0(i11, str2));
                        }
                    } else {
                        obtain.setClassName("android.widget.Button");
                    }
                    obtain.setText(sb2);
                    obtain.setEnabled(true);
                    obtain.addAction(16);
                    int i35 = p1Var.b + q1Var.Ta;
                    int L = q1Var.a7 - org.telegram.messenger.g0.L(76.0f);
                    int i36 = p1Var.a;
                    rect.set(i36, i35, L + i36, p1Var.c + i35);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new Rect(rect));
                    }
                    z10 = true;
                    rect.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect);
                    obtain.setClickable(true);
                }
                return null;
            }
            z10 = true;
            if (i3 == 495) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                obtain.setText(bd.L0(2131754795));
                obtain.addAction(16);
                rect.set(q1Var.n5 - org.telegram.messenger.g0.L(8.0f), q1Var.o5 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(32.0f) + q1Var.n5, org.telegram.messenger.g0.L(32.0f) + q1Var.o5);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                    sparseArray.put(i3, new Rect(rect));
                }
                z10 = true;
                rect.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i3 == 499) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout2 = q1Var.q2;
                if (staticLayout2 != null) {
                    obtain.setText(staticLayout2.getText());
                }
                obtain.addAction(16);
                q1Var.L2.round(rect);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                    sparseArray.put(i3, new Rect(rect));
                }
                z10 = true;
                rect.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i3 != 492) {
                int i37 = 491;
                if (i3 != 491) {
                    if (i3 == 490 || i3 == 489) {
                        i37 = 491;
                    } else if (i3 == 498) {
                        obtain.setClassName("android.widget.ImageButton");
                        obtain.setEnabled(true);
                        if (q1Var.E2(q1Var.P5)) {
                            obtain.setContentDescription(bd.M0(2131754819, "AccDescrOpenChat"));
                        } else {
                            obtain.setContentDescription(bd.M0(2131745469, "ShareFile"));
                        }
                        obtain.addAction(16);
                        int i38 = (int) q1Var.Q8;
                        rect.set(i38, (int) q1Var.R8, org.telegram.messenger.g0.L(40.0f) + i38, org.telegram.messenger.g0.L(32.0f) + ((int) q1Var.R8));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                            sparseArray.put(i3, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i3 == 497) {
                        obtain.setEnabled(true);
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.messenger.camera.q.q("Reply", 2131746271, sb3, ", ");
                        StaticLayout staticLayout3 = q1Var.P7;
                        if (staticLayout3 != null) {
                            sb3.append(staticLayout3.getText());
                            sb3.append(", ");
                        }
                        StaticLayout staticLayout4 = q1Var.Q7;
                        if (staticLayout4 != null) {
                            sb3.append(staticLayout4.getText());
                        }
                        obtain.setContentDescription(sb3.toString());
                        obtain.addAction(16);
                        int i39 = q1Var.T7;
                        rect.set(i39, q1Var.U7, Math.max(q1Var.W7, q1Var.Y7) + i39, q1Var.U7 + ((int) q1Var.V7));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                            sparseArray.put(i3, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i3 == 494) {
                        obtain.setEnabled(true);
                        StringBuilder sb4 = new StringBuilder();
                        if (staticLayoutArr2[0] != null && staticLayoutArr2[1] != null) {
                            int i40 = 0;
                            while (i40 < 2) {
                                sb4.append(staticLayoutArr2[i40].getText());
                                sb4.append(i40 == 0 ? " " : "\n");
                                i40++;
                            }
                        }
                        obtain.setContentDescription(sb4.toString());
                        obtain.addAction(16);
                        float f14 = q1Var.s9;
                        float[] fArr = q1Var.v9;
                        int min = (int) Math.min(f14 - fArr[0], f14 - fArr[1]);
                        int i41 = q1Var.t9;
                        rect.set(min, i41, q1Var.q9 + min, q1Var.u9 + i41);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                            sparseArray.put(i3, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i3 == 496) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        int repliesCount = q1Var.getRepliesCount();
                        zi ziVar2 = q1Var.P5;
                        if (ziVar2 == null || ziVar2.Q5() || q1Var.P5.H2()) {
                            S = (q1Var.t6 || repliesCount <= 0) ? null : bd.S(null, repliesCount);
                        } else if (q1Var.t6) {
                            S = bd.M0(2131743562, "ViewInChat");
                        } else {
                            S = repliesCount == 0 ? bd.M0(2131749016, "LeaveAComment") : bd.G(repliesCount, "CommentsCount", new Object[0]);
                        }
                        if (S != null) {
                            obtain.setText(S);
                        }
                        obtain.addAction(16);
                        rect.set(q1Var.x7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                            sparseArray.put(i3, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i3 == 493) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        if (q1Var.P5.U4()) {
                            str = "AccActionCloseTranscription";
                            i10 = 2131754939;
                        } else {
                            str = "AccActionOpenTranscription";
                            i10 = 2131754931;
                        }
                        obtain.setText(bd.M0(i10, str));
                        obtain.addAction(16);
                        if (q1Var.I4 != null) {
                            rect.set((int) q1Var.C1().b, (int) q1Var.C1().c, (int) (q1Var.C1().b + q1Var.I4.u()), (int) (q1Var.C1().c + q1Var.I4.h()));
                        }
                        obtain.setBoundsInParent(rect);
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    }
                }
                int i42 = i3 == i37 ? 5 : i3 == 490 ? 31 : 30;
                int i43 = 0;
                while (true) {
                    r1 r1Var2 = q1Var.v2;
                    if (r1Var2 == null || i43 >= r1Var2.g.size()) {
                        break;
                    }
                    n1 n1Var = (n1) q1Var.v2.g.get(i43);
                    if (n1Var.a == i42) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        StaticLayout staticLayout5 = n1Var.d;
                        if (staticLayout5 != null) {
                            obtain.setText(staticLayout5.getText());
                        }
                        obtain.addAction(16);
                        n1Var.e.round(rect);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                            sparseArray.put(i3, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else {
                        i43++;
                    }
                }
            } else {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout6 = q1Var.n2;
                if (staticLayout6 != null) {
                    obtain.setText(staticLayout6.getText());
                }
                obtain.addAction(16);
                q1Var.u2.round(rect);
                r1 r1Var3 = q1Var.v2;
                if (r1Var3 != null && (arrayList = r1Var3.g) != null && arrayList.size() > 1) {
                    n1 n1Var2 = (n1) q1Var.v2.g.get(0);
                    if (!n1Var2.e.isEmpty()) {
                        rect.set(rect.left, rect.top, rect.right, (int) (rect.bottom - n1Var2.e.height()));
                    }
                }
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i3) == null || !((Rect) sparseArray.get(i3)).equals(rect)) {
                    sparseArray.put(i3, new Rect(rect));
                }
                z10 = true;
                rect.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            }
            obtain.setFocusable(z10);
            obtain.setVisibleToUser(z10);
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(q1Var);
        q1Var.onInitializeAccessibilityNodeInfo(obtain2);
        zi ziVar3 = q1Var.P5;
        if (ziVar3 != null && ziVar3.O3()) {
            zi ziVar4 = q1Var.P5;
            if (!ziVar4.p1 && ziVar4.G4()) {
                z13 = true;
                zi ziVar5 = q1Var.P5;
                boolean z16 = ziVar5 == null && ziVar5.S2();
                zi ziVar6 = q1Var.P5;
                j10 = ziVar6 == null ? ziVar6.F0 : 0L;
                if (q1Var.O2 == null && q1Var.P2 == z13 && q1Var.Q2 == z16) {
                    arrayList2 = arrayList8;
                    arrayList3 = arrayList9;
                    if (q1Var.R2 == j10) {
                        accessibilityNodeInfo = obtain2;
                        staticLayoutArr = staticLayoutArr2;
                        arrayList4 = arrayList2;
                        if (Build.VERSION.SDK_INT < 24) {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            accessibilityNodeInfo2.setContentDescription(q1Var.O2.toString());
                        } else {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            accessibilityNodeInfo2.setText(q1Var.O2);
                        }
                        accessibilityNodeInfo2.setEnabled(true);
                        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                        if (collectionItemInfo != null) {
                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, bd.M0(2131754936, "AccActionMessageOptions")));
                        int iconForCurrentState = q1Var.getIconForCurrentState();
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 0 ? iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? iconForCurrentState != 5 ? q1Var.P5.D == 16 ? bd.M0(2131752633, "CallAgain") : null : bd.M0(2131754933, "AccActionOpenFile") : bd.M0(2131754941, "AccActionCancelDownload") : bd.M0(2131754938, "AccActionDownload") : bd.M0(2131754930, "AccActionPause") : bd.M0(2131754929, "AccActionPlay")));
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, bd.M0(2131754937, "AccActionEnterSelectionMode")));
                        if (q1Var.getMiniIconForCurrentState() == 2) {
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, bd.M0(2131754938, "AccActionDownload")));
                        }
                        if (!q1Var.I8 || q1Var.r8) {
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, bd.M0(2131744338, "SummaryTitle")));
                        }
                        arrayList6 = q1Var.P5.z2;
                        if (arrayList6 != null) {
                            int size6 = arrayList6.size();
                            int i44 = 0;
                            while (true) {
                                if (i44 >= size6) {
                                    break;
                                }
                                Object obj3 = arrayList6.get(i44);
                                i44++;
                                if (((wi) obj3).O) {
                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, bd.M0(2131751765, "CopyCode")));
                                    break;
                                }
                            }
                        }
                        if ((!q1Var.P5.Q4() || q1Var.P5.i4() || q1Var.P5.J3()) && MediaController.B().I(q1Var.P5)) {
                            q1Var.E4.f(accessibilityNodeInfo2);
                        }
                        if (q1Var.H4 && q1Var.I4 != null) {
                            accessibilityNodeInfo2.addChild(q1Var, 493);
                        }
                        if (Build.VERSION.SDK_INT < 24) {
                            if (q1Var.e6 && q1Var.ia != null && !q1Var.P5.O3()) {
                                accessibilityNodeInfo2.addChild(q1Var, 5000);
                            }
                            CharSequence charSequence3 = q1Var.P5.v;
                            if (charSequence3 instanceof Spannable) {
                                Spannable spannable3 = (Spannable) charSequence3;
                                int i45 = 0;
                                for (CharacterStyle characterStyle : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                                    accessibilityNodeInfo2.addChild(q1Var, i45 + 2000);
                                    i45++;
                                }
                            }
                            CharSequence charSequence4 = q1Var.P5.z;
                            if ((charSequence4 instanceof Spannable) && q1Var.l3 != null) {
                                Spannable spannable4 = (Spannable) charSequence4;
                                int i46 = 0;
                                for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                                    accessibilityNodeInfo2.addChild(q1Var, i46 + 3000);
                                    i46++;
                                }
                            }
                        }
                        size = arrayList3.size();
                        int i47 = 0;
                        i15 = 0;
                        while (i15 < size) {
                            Object obj4 = arrayList3.get(i15);
                            i15++;
                            accessibilityNodeInfo2.addChild(q1Var, i47 + 1000);
                            i47++;
                        }
                        if (q1Var.q5 && q1Var.n5 != -1 && q1Var.P5.U3()) {
                            accessibilityNodeInfo2.addChild(q1Var, 495);
                        }
                        size2 = arrayList4.size();
                        int i48 = 0;
                        i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList4.get(i16);
                            i16++;
                            accessibilityNodeInfo2.addChild(q1Var, i48 + 500);
                            i48++;
                        }
                        if (q1Var.t2 && !q1Var.L2.isEmpty()) {
                            accessibilityNodeInfo2.addChild(q1Var, 499);
                        }
                        r1Var = q1Var.v2;
                        if (r1Var != null && r1Var.b && (rectF = q1Var.u2) != null && !rectF.isEmpty()) {
                            accessibilityNodeInfo2.addChild(q1Var, 492);
                            arrayList7 = q1Var.v2.g;
                            if (arrayList7 != null && arrayList7.size() > 1) {
                                ArrayList arrayList13 = q1Var.v2.g;
                                size3 = arrayList13.size();
                                i19 = 0;
                                while (i19 < size3) {
                                    Object obj6 = arrayList13.get(i19);
                                    i19++;
                                    n1 n1Var3 = (n1) obj6;
                                    if (q1Var.v2.d && n1Var3.a == 5 && !n1Var3.e.isEmpty()) {
                                        accessibilityNodeInfo2.addChild(q1Var, 491);
                                    }
                                    if (q1Var.v2.e && n1Var3.a == 31 && !n1Var3.e.isEmpty()) {
                                        accessibilityNodeInfo2.addChild(q1Var, 490);
                                    }
                                    if (q1Var.v2.c && n1Var3.a == 30 && !n1Var3.e.isEmpty()) {
                                        accessibilityNodeInfo2.addChild(q1Var, 489);
                                    }
                                }
                            }
                        }
                        if (q1Var.m7 != null) {
                            accessibilityNodeInfo2.addChild(q1Var, 496);
                        }
                        i17 = q1Var.E8;
                        if (i17 != 1 || i17 == 2) {
                            accessibilityNodeInfo2.addChild(q1Var, 498);
                        }
                        if (q1Var.P7 != null) {
                            accessibilityNodeInfo2.addChild(q1Var, 497);
                        }
                        ziVar = q1Var.P5;
                        if (ziVar != null && (cvVar2 = ziVar.w2) != null) {
                            int i49 = 0;
                            for (i18 = 0; i18 < cvVar2.g.size(); i18++) {
                                xt xtVar = (xt) cvVar2.g.get(i18);
                                if (xtVar.S()) {
                                    int B = xtVar.B() + (xtVar.r == null ? 0 : 1);
                                    for (int i50 = 0; i50 < B; i50++) {
                                        accessibilityNodeInfo2.addChild(q1Var, i49 + 6000 + i50);
                                    }
                                    i49 += B;
                                }
                            }
                        }
                        if (staticLayoutArr[0] != null && staticLayoutArr[1] != null) {
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, bd.M0(2131754932, "AccActionOpenForwardedOrigin")));
                        }
                        if (q1Var.k1 && q1Var.getBackground() == null) {
                            return accessibilityNodeInfo2;
                        }
                        accessibilityNodeInfo2.setSelected(true);
                        return accessibilityNodeInfo2;
                    }
                } else {
                    arrayList2 = arrayList8;
                    arrayList3 = arrayList9;
                }
                spannableStringBuilder = new SpannableStringBuilder();
                if (q1Var.e6 || q1Var.ia == null || q1Var.P5.O3()) {
                    accessibilityNodeInfo = obtain2;
                    staticLayoutArr = staticLayoutArr2;
                    j11 = j10;
                    arrayList4 = arrayList2;
                } else {
                    spannableStringBuilder.append((CharSequence) l10.p(q1Var.ia));
                    staticLayoutArr = staticLayoutArr2;
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList2;
                    spannableStringBuilder.setSpan(new y0(this, q1Var.ia), 0, spannableStringBuilder.length(), 33);
                    CharSequence adminAccessibilityText = q1Var.getAdminAccessibilityText();
                    if (TextUtils.isEmpty(adminAccessibilityText)) {
                        j11 = j10;
                    } else if (q1Var.Y8) {
                        j11 = j10;
                        spannableStringBuilder.append(' ').append((CharSequence) bd.Z(q1Var.W8 ? 2131754727 : 2131754726, adminAccessibilityText));
                    } else {
                        j11 = j10;
                        spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                    }
                    spannableStringBuilder.append('\n');
                }
                if (q1Var.r9) {
                    int i51 = 0;
                    while (i51 < 2) {
                        StaticLayout staticLayout7 = staticLayoutArr[i51];
                        if (staticLayout7 != null && staticLayout7.getText() != null) {
                            spannableStringBuilder.append(staticLayoutArr[i51].getText());
                            spannableStringBuilder.append(i51 == 0 ? " " : "\n");
                        }
                        i51++;
                    }
                }
                document = q1Var.M1;
                if (document != null && q1Var.L1 == 1) {
                    s6 = org.telegram.messenger.w7.s(document);
                    if (s6.indexOf(46) != -1) {
                        spannableStringBuilder.append((CharSequence) bd.Z(2131754889, s6.substring(s6.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                    }
                }
                cvVar = q1Var.P5.w2;
                if (cvVar == null && !cvVar.g.isEmpty()) {
                    ArrayList arrayList14 = q1Var.P5.w2.g;
                    int size7 = arrayList14.size();
                    int i52 = 0;
                    while (i52 < size7) {
                        Object obj7 = arrayList14.get(i52);
                        i52++;
                        xt xtVar2 = (xt) obj7;
                        if (xtVar2.S()) {
                            int length3 = spannableStringBuilder.length();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            xtVar2.k(spannableStringBuilder2);
                            ArrayList arrayList15 = arrayList14;
                            CharSequence y9 = xtVar2.y();
                            int i53 = size7;
                            CharSequence text = (!xtVar2.x || (staticLayout = xtVar2.d) == null) ? null : staticLayout.getText();
                            if (!TextUtils.isEmpty(text)) {
                                spannableStringBuilder.append(text);
                                if (!TextUtils.isEmpty(y9) || spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append(' ');
                                }
                            }
                            if (!TextUtils.isEmpty(y9)) {
                                spannableStringBuilder.append(y9);
                                if (spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                            if (spannableStringBuilder.length() > length3 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                                spannableStringBuilder.append('\n');
                            }
                            arrayList14 = arrayList15;
                            size7 = i53;
                        }
                    }
                } else if (!TextUtils.isEmpty(q1Var.P5.v)) {
                    CharSequence charSequence5 = q1Var.P5.v;
                    if (charSequence5 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence5;
                        oi.h[] hVarArr = (oi.h[]) spanned2.getSpans(0, spanned2.length(), oi.h.class);
                        if (hVarArr != null && hVarArr.length > 0) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence5);
                            Arrays.sort(hVarArr, new x0(spanned2, 0));
                            int length4 = hVarArr.length;
                            int i54 = 0;
                            while (i54 < length4) {
                                oi.h hVar = hVarArr[i54];
                                int i55 = length4;
                                int spanStart = spanned2.getSpanStart(hVar);
                                if (spanStart < 0) {
                                    spanned = spanned2;
                                } else {
                                    spanned = spanned2;
                                    spannableStringBuilder3.insert(spanStart, (CharSequence) (((Object) (TextUtils.isEmpty(hVar.a) ? bd.L0(2131754897) : bd.Z(2131754896, wi.b(hVar.a)))) + ". "));
                                }
                                i54++;
                                length4 = i55;
                                spanned2 = spanned;
                            }
                            charSequence5 = spannableStringBuilder3;
                        }
                    }
                    spannableStringBuilder.append(charSequence5);
                }
                if (q1Var.M1 != null && (((i14 = q1Var.L1) == 1 || i14 == 2 || i14 == 4) && q1Var.N3 == 1 && q1Var.z3 != null)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    boolean p42 = q1Var.P5.p4();
                    spannableStringBuilder.append((CharSequence) bd.Y(!p42 ? 2131754742 : 2131754888, !p42 ? "AccDescrUploadProgress" : "AccDescrDownloadProgress", org.telegram.messenger.g0.i0(q1Var.P5.F0, false, false), org.telegram.messenger.g0.i0(q1Var.z1, false, false)));
                }
                if (!q1Var.P5.J3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) bd.Y(2131754832, "AccDescrMusicInfo", q1Var.P5.x1(true), q1Var.P5.z1(true)));
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) bd.z((int) q1Var.P5.L0()));
                } else if (q1Var.P5.Q4() || q1Var.xb) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) bd.z((int) q1Var.P5.L0()));
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (q1Var.P5.S2()) {
                        spannableStringBuilder.append((CharSequence) bd.M0(2131754838, "AccDescrMsgNotPlayed"));
                    } else {
                        spannableStringBuilder.append((CharSequence) bd.M0(2131754837, "AccDescrMsgPlayed"));
                    }
                }
                if (q1Var.i5 != null) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) q1Var.i5.question.text);
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (q1Var.W4) {
                        M0 = bd.M0(2131750696, "FinalResults");
                    } else {
                        TLRPC.Poll poll2 = q1Var.i5;
                        M0 = poll2.quiz ? poll2.public_voters ? bd.M0(2131746453, "QuizPoll") : bd.M0(2131754248, "AnonymousQuizPoll") : poll2.public_voters ? bd.M0(2131746596, "PublicPoll") : bd.M0(2131754249, "AnonymousPoll");
                    }
                    spannableStringBuilder.append((CharSequence) M0);
                }
                if (q1Var.M1 != null) {
                    if (q1Var.L1 == 4) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) bd.z((int) q1Var.P5.L0()));
                    }
                    if (q1Var.N3 == 0 || q1Var.L1 == 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.i0(q1Var.M1.size, false, false));
                    }
                }
                if (!q1Var.P5.U4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(q1Var.P5.j2());
                } else if (zi.o1(q1Var.P5.k) != null && !TextUtils.isEmpty(q1Var.P5.z)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(q1Var.P5.z);
                }
                if (q1Var.P5.O3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    StringBuilder sb5 = new StringBuilder();
                    org.telegram.messenger.camera.q.q("TodayAt", 2131744122, sb5, " ");
                    sb5.append((Object) q1Var.D9);
                    spannableStringBuilder.append((CharSequence) bd.Y(2131754789, "AccDescrReceivedDate", sb5.toString()));
                } else if (q1Var.P5.r4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (q1Var.P5.p1) {
                        spannableStringBuilder.append((CharSequence) bd.Y(2131754781, "AccDescrScheduledDate", q1Var.D9));
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        org.telegram.messenger.camera.q.q("TodayAt", 2131744122, sb6, " ");
                        sb6.append((Object) q1Var.D9);
                        spannableStringBuilder.append((CharSequence) bd.Y(2131754765, "AccDescrSentDate", sb6.toString()));
                        spannableStringBuilder.append((CharSequence) ", ");
                        if (q1Var.P5.G4()) {
                            str3 = "AccDescrMsgUnread";
                            i13 = 2131754833;
                        } else {
                            str3 = "AccDescrMsgRead";
                            i13 = 2131754836;
                        }
                        spannableStringBuilder.append((CharSequence) bd.M0(i13, str3));
                    }
                } else if (q1Var.P5.p4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) bd.M0(2131754835, "AccDescrMsgSending"));
                    RadialProgress2 radialProgress2 = q1Var.Q0;
                    float f15 = (radialProgress2.c ? radialProgress2.j : radialProgress2.i).w;
                    if (f15 > 0.0f) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f15 * 100.0f))).append((CharSequence) "%");
                    }
                } else if (q1Var.P5.o4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) bd.M0(2131754834, "AccDescrMsgSendingError"));
                }
                if (q1Var.getRepliesCount() > 0 && !q1Var.d2()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) bd.G(q1Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
                }
                tL_messageReactions = q1Var.P5.k.reactions;
                if (tL_messageReactions != null && (arrayList5 = tL_messageReactions.results) != null) {
                    String str4 = "";
                    if (arrayList5.size() != 1) {
                        TLRPC.ReactionCount reactionCount = q1Var.P5.k.reactions.results.get(0);
                        TLRPC.Reaction reaction = reactionCount.reaction;
                        String str5 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                        int i56 = reactionCount.count;
                        if (i56 == 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            ArrayList<TLRPC.MessagePeerReaction> arrayList16 = q1Var.P5.k.reactions.recent_reactions;
                            if (arrayList16 == null || arrayList16.size() != 1 || (messagePeerReaction = q1Var.P5.k.reactions.recent_reactions.get(0)) == null) {
                                z14 = false;
                            } else {
                                TLRPC.User a22 = hp.s1(q1Var.Z5).a2(Long.valueOf(zi.C1(messagePeerReaction.peer_id)));
                                z14 = l10.B(a22);
                                if (a22 != null) {
                                    str4 = l10.i(a22);
                                }
                            }
                            if (z14) {
                                spannableStringBuilder.append((CharSequence) bd.Y(2131754725, "AccDescrYouReactedWith", str5));
                            } else {
                                spannableStringBuilder.append((CharSequence) bd.Y(2131754791, "AccDescrReactedWith", str4, str5));
                            }
                        } else if (i56 > 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            spannableStringBuilder.append((CharSequence) bd.G(reactionCount.count, "AccDescrNumberOfPeopleReactions", str5));
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) bd.M0(2131746395, "Reactions")).append((CharSequence) ": ");
                        int size8 = q1Var.P5.k.reactions.results.size();
                        int i57 = 0;
                        while (i57 < size8) {
                            TLRPC.ReactionCount reactionCount2 = q1Var.P5.k.reactions.results.get(i57);
                            TLRPC.Reaction reaction2 = reactionCount2.reaction;
                            spannableStringBuilder.append((CharSequence) (reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon : "")).append((CharSequence) " ").append((CharSequence) (reactionCount2.count + ""));
                            i57++;
                            if (i57 < size8) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                        }
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                if ((q1Var.P5.k.flags & 1024) == 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    i12 = 0;
                    spannableStringBuilder.append((CharSequence) bd.G(q1Var.P5.k.views, "AccDescrNumberOfViews", new Object[0]));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannableStringBuilder.getSpans(i12, spannableStringBuilder.length(), ClickableSpan.class)) {
                    int spanStart2 = spannableStringBuilder.getSpanStart(characterStyle3);
                    int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle3);
                    spannableStringBuilder.removeSpan(characterStyle3);
                    spannableStringBuilder.setSpan(new h(2, this, characterStyle3), spanStart2, spanEnd, 33);
                }
                q1Var.O2 = spannableStringBuilder;
                q1Var.P2 = z13;
                q1Var.Q2 = z16;
                q1Var.R2 = j11;
                if (Build.VERSION.SDK_INT < 24) {
                }
                accessibilityNodeInfo2.setEnabled(true);
                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, bd.M0(2131754936, "AccActionMessageOptions")));
                int iconForCurrentState2 = q1Var.getIconForCurrentState();
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState2 != 0 ? iconForCurrentState2 != 1 ? iconForCurrentState2 != 2 ? iconForCurrentState2 != 3 ? iconForCurrentState2 != 5 ? q1Var.P5.D == 16 ? bd.M0(2131752633, "CallAgain") : null : bd.M0(2131754933, "AccActionOpenFile") : bd.M0(2131754941, "AccActionCancelDownload") : bd.M0(2131754938, "AccActionDownload") : bd.M0(2131754930, "AccActionPause") : bd.M0(2131754929, "AccActionPlay")));
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, bd.M0(2131754937, "AccActionEnterSelectionMode")));
                if (q1Var.getMiniIconForCurrentState() == 2) {
                }
                if (!q1Var.I8) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, bd.M0(2131744338, "SummaryTitle")));
                arrayList6 = q1Var.P5.z2;
                if (arrayList6 != null) {
                }
                if (!q1Var.P5.Q4()) {
                }
                q1Var.E4.f(accessibilityNodeInfo2);
                if (q1Var.H4) {
                    accessibilityNodeInfo2.addChild(q1Var, 493);
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                size = arrayList3.size();
                int i472 = 0;
                i15 = 0;
                while (i15 < size) {
                }
                if (q1Var.q5) {
                    accessibilityNodeInfo2.addChild(q1Var, 495);
                }
                size2 = arrayList4.size();
                int i482 = 0;
                i16 = 0;
                while (i16 < size2) {
                }
                if (q1Var.t2) {
                    accessibilityNodeInfo2.addChild(q1Var, 499);
                }
                r1Var = q1Var.v2;
                if (r1Var != null) {
                    accessibilityNodeInfo2.addChild(q1Var, 492);
                    arrayList7 = q1Var.v2.g;
                    if (arrayList7 != null) {
                        ArrayList arrayList132 = q1Var.v2.g;
                        size3 = arrayList132.size();
                        i19 = 0;
                        while (i19 < size3) {
                        }
                    }
                }
                if (q1Var.m7 != null) {
                }
                i17 = q1Var.E8;
                if (i17 != 1) {
                }
                accessibilityNodeInfo2.addChild(q1Var, 498);
                if (q1Var.P7 != null) {
                }
                ziVar = q1Var.P5;
                if (ziVar != null) {
                    int i492 = 0;
                    while (i18 < cvVar2.g.size()) {
                    }
                }
                if (staticLayoutArr[0] != null) {
                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, bd.M0(2131754932, "AccActionOpenForwardedOrigin")));
                }
                if (q1Var.k1) {
                }
                accessibilityNodeInfo2.setSelected(true);
                return accessibilityNodeInfo2;
            }
        }
        z13 = false;
        zi ziVar52 = q1Var.P5;
        if (ziVar52 == null) {
        }
        zi ziVar62 = q1Var.P5;
        if (ziVar62 == null) {
        }
        if (q1Var.O2 == null) {
        }
        arrayList2 = arrayList8;
        arrayList3 = arrayList9;
        spannableStringBuilder = new SpannableStringBuilder();
        if (q1Var.e6) {
        }
        accessibilityNodeInfo = obtain2;
        staticLayoutArr = staticLayoutArr2;
        j11 = j10;
        arrayList4 = arrayList2;
        if (q1Var.r9) {
        }
        document = q1Var.M1;
        if (document != null) {
            s6 = org.telegram.messenger.w7.s(document);
            if (s6.indexOf(46) != -1) {
            }
        }
        cvVar = q1Var.P5.w2;
        if (cvVar == null) {
        }
        if (!TextUtils.isEmpty(q1Var.P5.v)) {
        }
        if (q1Var.M1 != null) {
            spannableStringBuilder.append((CharSequence) "\n");
            boolean p422 = q1Var.P5.p4();
            spannableStringBuilder.append((CharSequence) bd.Y(!p422 ? 2131754742 : 2131754888, !p422 ? "AccDescrUploadProgress" : "AccDescrDownloadProgress", org.telegram.messenger.g0.i0(q1Var.P5.F0, false, false), org.telegram.messenger.g0.i0(q1Var.z1, false, false)));
        }
        if (!q1Var.P5.J3()) {
        }
        if (q1Var.i5 != null) {
        }
        if (q1Var.M1 != null) {
        }
        if (!q1Var.P5.U4()) {
        }
        if (q1Var.P5.O3()) {
        }
        if (q1Var.getRepliesCount() > 0) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) bd.G(q1Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
        }
        tL_messageReactions = q1Var.P5.k.reactions;
        if (tL_messageReactions != null) {
            String str42 = "";
            if (arrayList5.size() != 1) {
            }
        }
        if ((q1Var.P5.k.flags & 1024) == 0) {
        }
        spannableStringBuilder.append((CharSequence) "\n");
        while (r7 < r6) {
        }
        q1Var.O2 = spannableStringBuilder;
        q1Var.P2 = z13;
        q1Var.Q2 = z16;
        q1Var.R2 = j11;
        if (Build.VERSION.SDK_INT < 24) {
        }
        accessibilityNodeInfo2.setEnabled(true);
        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
        if (collectionItemInfo != null) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, bd.M0(2131754936, "AccActionMessageOptions")));
        int iconForCurrentState22 = q1Var.getIconForCurrentState();
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState22 != 0 ? iconForCurrentState22 != 1 ? iconForCurrentState22 != 2 ? iconForCurrentState22 != 3 ? iconForCurrentState22 != 5 ? q1Var.P5.D == 16 ? bd.M0(2131752633, "CallAgain") : null : bd.M0(2131754933, "AccActionOpenFile") : bd.M0(2131754941, "AccActionCancelDownload") : bd.M0(2131754938, "AccActionDownload") : bd.M0(2131754930, "AccActionPause") : bd.M0(2131754929, "AccActionPlay")));
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, bd.M0(2131754937, "AccActionEnterSelectionMode")));
        if (q1Var.getMiniIconForCurrentState() == 2) {
        }
        if (!q1Var.I8) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, bd.M0(2131744338, "SummaryTitle")));
        arrayList6 = q1Var.P5.z2;
        if (arrayList6 != null) {
        }
        if (!q1Var.P5.Q4()) {
        }
        q1Var.E4.f(accessibilityNodeInfo2);
        if (q1Var.H4) {
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        size = arrayList3.size();
        int i4722 = 0;
        i15 = 0;
        while (i15 < size) {
        }
        if (q1Var.q5) {
        }
        size2 = arrayList4.size();
        int i4822 = 0;
        i16 = 0;
        while (i16 < size2) {
        }
        if (q1Var.t2) {
        }
        r1Var = q1Var.v2;
        if (r1Var != null) {
        }
        if (q1Var.m7 != null) {
        }
        i17 = q1Var.E8;
        if (i17 != 1) {
        }
        accessibilityNodeInfo2.addChild(q1Var, 498);
        if (q1Var.P7 != null) {
        }
        ziVar = q1Var.P5;
        if (ziVar != null) {
        }
        if (staticLayoutArr[0] != null) {
        }
        if (q1Var.k1) {
        }
        accessibilityNodeInfo2.setSelected(true);
        return accessibilityNodeInfo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x017b, code lost:
    
        if ((r10 != null ? r10.reply_to_top_id : 0) != 0) goto L137;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i3, int i10, Bundle bundle) {
        l1 l1Var;
        a1 a1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean U;
        CharSequence D;
        q1 q1Var = this.a;
        if (i3 == -1) {
            q1Var.performAccessibilityAction(i10, bundle);
            return true;
        }
        if (i10 == 64) {
            q1Var.g3(i3, 32768, null);
            return true;
        }
        r4 = null;
        Object[] objArr = null;
        if (i10 == 16) {
            if (i3 == 5000) {
                l1 l1Var2 = q1Var.Ra;
                if (l1Var2 != null) {
                    l1Var2.s0(q1Var, q1Var.ia, 0.0f, 0.0f);
                    return true;
                }
            } else if (i3 >= 6000) {
                int[] iArr = {0};
                xt b10 = b(iArr, i3);
                if (b10 != null) {
                    int i11 = iArr[0];
                    CheckBoxBase checkBoxBase = b10.r;
                    if (checkBoxBase == null || i11 != 0) {
                        U = b10.U(i11 - (checkBoxBase == null ? 0 : 1), q1Var);
                    } else if (b10.n()) {
                        b10.e0();
                        U = true;
                    } else {
                        U = false;
                    }
                    if (U) {
                        q1Var.g3(i3, 1, null);
                        int i12 = iArr[0];
                        if (b10.r != null && i12 == 0) {
                            objArr = 1;
                        }
                        if (objArr != null) {
                            D = bd.M0(b10.G() ? 2131754902 : 2131754830, null);
                        } else {
                            D = b10.D();
                        }
                        org.telegram.messenger.g0.i2(D);
                        return true;
                    }
                }
            } else if (i3 >= 3000) {
                ClickableSpan a10 = a(i3, true);
                if (a10 != null) {
                    q1Var.Ra.N0(q1Var, a10, false);
                    q1Var.g3(i3, 1, null);
                    return true;
                }
            } else {
                if (i3 < 2000) {
                    if (i3 >= 1000) {
                        int i13 = i3 - 1000;
                        if (i13 < q1Var.H5.size()) {
                            c0 c0Var = (c0) q1Var.H5.get(i13);
                            l1 l1Var3 = q1Var.Ra;
                            if (l1Var3 != null && !c0Var.m) {
                                org.telegram.messenger.o2 o2Var = c0Var.j;
                                if (o2Var != null) {
                                    l1Var3.H(q1Var, o2Var);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var.i;
                                    if (keyboardInlineButton != null) {
                                        l1Var3.d1(q1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            q1Var.g3(i3, 1, null);
                            return true;
                        }
                    } else if (i3 >= 500) {
                        int i14 = i3 - 500;
                        if (i14 < q1Var.P4.size()) {
                            p1 p1Var = (p1) q1Var.P4.get(i14);
                            if (q1Var.Ra != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(p1Var.s);
                                q1Var.Ra.i(q1Var, arrayList, -1, 0, 0);
                            }
                            q1Var.g3(i3, 1, null);
                            return true;
                        }
                    } else {
                        if (i3 == 495) {
                            q1Var.G0();
                            return true;
                        }
                        if (i3 == 499) {
                            l1 l1Var4 = q1Var.Ra;
                            if (l1Var4 != null) {
                                l1Var4.f1(q1Var, q1Var.x2);
                                return true;
                            }
                        } else if (i3 == 492) {
                            l1 l1Var5 = q1Var.Ra;
                            if (l1Var5 != null) {
                                l1Var5.f1(q1Var, 5);
                                return true;
                            }
                        } else if (i3 == 491) {
                            l1 l1Var6 = q1Var.Ra;
                            if (l1Var6 != null) {
                                l1Var6.f1(q1Var, 5);
                                return true;
                            }
                        } else if (i3 == 490) {
                            l1 l1Var7 = q1Var.Ra;
                            if (l1Var7 != null) {
                                l1Var7.f1(q1Var, 31);
                                return true;
                            }
                        } else if (i3 == 489) {
                            l1 l1Var8 = q1Var.Ra;
                            if (l1Var8 != null) {
                                l1Var8.f1(q1Var, 30);
                                return true;
                            }
                        } else if (i3 == 498) {
                            l1 l1Var9 = q1Var.Ra;
                            if (l1Var9 != null) {
                                l1Var9.s(q1Var);
                                return true;
                            }
                        } else if (i3 == 497) {
                            if (q1Var.Ra != null) {
                                if (q1Var.n6 && !q1Var.l6) {
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = q1Var.P5.k.reply_to;
                                }
                                if (q1Var.P5.C2() || q1Var.L7 || ((message = q1Var.P5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)) {
                                    q1Var.Ra.W1(q1Var, q1Var.P5.O1(), 0.0f, 0.0f, false);
                                    return true;
                                }
                            }
                        } else if (i3 == 494) {
                            l1 l1Var10 = q1Var.Ra;
                            if (l1Var10 != null) {
                                TLRPC.Chat chat = q1Var.ta;
                                if (chat != null) {
                                    l1Var10.U(q1Var, chat, q1Var.P5.k.fwd_from.channel_post, q1Var.h1, q1Var.i1, false);
                                    return true;
                                }
                                TLRPC.User user = q1Var.ra;
                                if (user != null) {
                                    l1Var10.s0(q1Var, user, q1Var.h1, q1Var.i1);
                                    return true;
                                }
                                if (q1Var.ua != null) {
                                    l1Var10.p(q1Var);
                                    return true;
                                }
                            }
                        } else if (i3 == 496) {
                            l1 l1Var11 = q1Var.Ra;
                            if (l1Var11 != null) {
                                if (q1Var.t6) {
                                    l1Var11.s(q1Var);
                                    return true;
                                }
                                l1Var11.y(q1Var);
                                return true;
                            }
                        } else if (i3 == 493 && (a1Var = q1Var.I4) != null) {
                            a1Var.l();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan a11 = a(i3, false);
                if (a11 != null) {
                    q1Var.Ra.N0(q1Var, a11, false);
                    q1Var.g3(i3, 1, null);
                    return true;
                }
            }
        } else if (i10 == 32) {
            ClickableSpan a12 = a(i3, i3 >= 3000);
            if (a12 != null && (l1Var = q1Var.Ra) != null) {
                l1Var.N0(q1Var, a12, true);
                q1Var.g3(i3, 2, null);
            }
        }
        return true;
    }
}
