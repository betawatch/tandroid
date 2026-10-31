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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.gj;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.qu;
import org.telegram.messenger.vp;
import org.telegram.messenger.vv;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y0 extends AccessibilityNodeProvider {
    public final q1 a;
    public final Path b = new Path();
    public final RectF c = new RectF();
    public final Rect d = new Rect();

    public y0(q1 q1Var) {
        this.a = q1Var;
    }

    public final ClickableSpan a(int i10, boolean z10) {
        if (i10 == 5000) {
            return null;
        }
        q1 q1Var = this.a;
        if (z10) {
            int i11 = i10 - 3000;
            CharSequence charSequence = q1Var.O5.z;
            if (!(charSequence instanceof Spannable) || i11 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i11) {
                return null;
            }
            return clickableSpanArr[i11];
        }
        int i12 = i10 - 2000;
        CharSequence charSequence2 = q1Var.O5.v;
        if (!(charSequence2 instanceof Spannable) || i12 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i12) {
            return null;
        }
        return clickableSpanArr2[i12];
    }

    public final qu b(int[] iArr, int i10) {
        vv vvVar;
        jj jjVar = this.a.O5;
        if (jjVar == null || (vvVar = jjVar.w2) == null) {
            return null;
        }
        ArrayList arrayList = vvVar.g;
        int i11 = i10 - 6000;
        if (i11 < 0) {
            return null;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            qu quVar = (qu) arrayList.get(i13);
            if (quVar.R()) {
                int B = quVar.B() + (quVar.r == null ? 0 : 1) + i12;
                if (i11 < B) {
                    iArr[0] = i11 - i12;
                    return quVar;
                }
                i12 = B;
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
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        boolean z10;
        String str;
        int i11;
        String S;
        ArrayList arrayList;
        String str2;
        int i12;
        boolean z11;
        boolean z12;
        char c10;
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
        vv vvVar;
        Spanned spanned;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i13;
        ArrayList<TLRPC.ReactionCount> arrayList5;
        boolean z14;
        TLRPC.MessagePeerReaction messagePeerReaction;
        String str3;
        int i14;
        String L0;
        int i15;
        StaticLayout staticLayout;
        String s10;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        ArrayList arrayList6;
        int size;
        int i16;
        int size2;
        int i17;
        r1 r1Var;
        int i18;
        jj jjVar;
        vv vvVar2;
        int i19;
        RectF rectF;
        ArrayList arrayList7;
        int size3;
        int i20;
        int[] iArr = {0, 0};
        q1 q1Var = this.a;
        q1Var.getLocationOnScreen(iArr);
        ArrayList arrayList8 = q1Var.O4;
        ArrayList arrayList9 = q1Var.G5;
        StaticLayout[] staticLayoutArr2 = q1Var.o9;
        SparseArray sparseArray = q1Var.vb;
        if (i10 != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setSource(q1Var, i10);
            obtain.setParent(q1Var);
            obtain.setPackageName(q1Var.getContext().getPackageName());
            Rect rect = this.d;
            if (i10 == 5000) {
                TLRPC.User user = q1Var.ha;
                if (user != null) {
                    obtain.setText(h20.p(user));
                    float f7 = q1Var.f9;
                    int i21 = (int) f7;
                    float f10 = q1Var.g9;
                    rect.set(i21, (int) f10, (int) (f7 + q1Var.d9), (int) (f10 + (q1Var.T8 != null ? r4.getHeight() : 10)));
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i10) == null) {
                        sparseArray.put(i10, new Rect(rect));
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
            if (i10 >= 6000) {
                int[] iArr2 = {0};
                qu b10 = b(iArr2, i10);
                if (b10 != null) {
                    obtain.setText(b10.x(iArr2[0]));
                    b10.w(iArr2[0], rect);
                    rect.offset(q1Var.n0, q1Var.t0);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i10) == null) {
                        sparseArray.put(i10, new Rect(rect));
                    }
                    rect.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect);
                    int i22 = iArr2[0];
                    boolean z15 = b10.r != null && i22 == 0;
                    if (z15) {
                        obtain.setClassName("android.widget.CheckBox");
                    } else if (b10.O(i22)) {
                        obtain.setClassName("android.widget.TextView");
                    } else {
                        obtain.setClassName("android.widget.ImageView");
                    }
                    obtain.setEnabled(true);
                    if (z15) {
                        obtain.setCheckable(true);
                        c10 = 0;
                        obtain.setChecked(b10.L(iArr2[0]));
                    } else {
                        c10 = 0;
                    }
                    boolean N = b10.N(iArr2[c10]);
                    obtain.setClickable(N);
                    if (N) {
                        obtain.addAction(16);
                    }
                    z10 = true;
                }
                return null;
            }
            RectF rectF2 = this.c;
            Path path = this.b;
            if (i10 >= 3000) {
                CharSequence charSequence = q1Var.O5.z;
                if ((charSequence instanceof Spannable) && q1Var.k3 != null) {
                    Spannable spannable = (Spannable) charSequence;
                    ClickableSpan a2 = a(i10, false);
                    if (a2 != null) {
                        int[] U1 = q1.U1(spannable, a2);
                        obtain.setText(spannable.subSequence(U1[0], U1[1]).toString());
                        ArrayList arrayList10 = q1Var.k3.e;
                        int size4 = arrayList10.size();
                        int i23 = 0;
                        while (true) {
                            if (i23 >= size4) {
                                z12 = true;
                                break;
                            }
                            Object obj = arrayList10.get(i23);
                            i23++;
                            gj gjVar = (gj) obj;
                            int length = gjVar.e.getText().length();
                            int i24 = gjVar.n;
                            ArrayList arrayList11 = arrayList10;
                            int i25 = U1[0];
                            if (i24 <= i25) {
                                int i26 = length + i24;
                                int i27 = U1[1];
                                if (i26 >= i27) {
                                    gjVar.e.getSelectionPath(i25 - i24, i27 - i24, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) gjVar.p(q1Var.k3.e, q1Var.gb));
                                    rect.offset(q1Var.n0, q1Var.t0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i10) == null) {
                                        sparseArray.put(i10, new Rect(rect));
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
            if (i10 >= 2000) {
                CharSequence charSequence2 = q1Var.O5.v;
                if (charSequence2 instanceof Spannable) {
                    Spannable spannable2 = (Spannable) charSequence2;
                    ClickableSpan a10 = a(i10, false);
                    if (a10 != null) {
                        int[] U12 = q1.U1(spannable2, a10);
                        obtain.setText(spannable2.subSequence(U12[0], U12[1]).toString());
                        ArrayList arrayList12 = q1Var.O5.z2;
                        int size5 = arrayList12.size();
                        int i28 = 0;
                        while (true) {
                            if (i28 >= size5) {
                                z11 = true;
                                break;
                            }
                            Object obj2 = arrayList12.get(i28);
                            i28++;
                            gj gjVar2 = (gj) obj2;
                            int length2 = gjVar2.e.getText().length();
                            int i29 = gjVar2.n;
                            int i30 = U12[0];
                            if (i29 <= i30) {
                                int i31 = length2 + i29;
                                int i32 = U12[1];
                                if (i31 >= i32) {
                                    gjVar2.e.getSelectionPath(i30 - i29, i32 - i29, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) gjVar2.p(q1Var.O5.z2, q1Var.gb));
                                    rect.offset(q1Var.n0, q1Var.t0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i10) == null) {
                                        sparseArray.put(i10, new Rect(rect));
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
            if (i10 >= 1000) {
                int i33 = i10 - 1000;
                if (i33 < arrayList9.size()) {
                    c0 c0Var = (c0) arrayList9.get(i33);
                    if (!c0Var.b) {
                        obtain.setText(c0Var.h.j());
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        obtain.setClickable(true);
                        obtain.addAction(16);
                        float f11 = c0Var.c;
                        float f12 = q1Var.I5;
                        int i34 = c0Var.d;
                        rect.set((int) (f11 * f12), i34, (int) ((f11 + c0Var.e) * f12), c0Var.f + i34);
                        rect.offset(q1Var.O5.P3() ? (q1Var.getMeasuredWidth() - q1Var.getWidthForButtons()) - org.telegram.messenger.i0.L(10.0f) : q1Var.L6 + org.telegram.messenger.i0.L(q1Var.A6 ? 1.0f : 7.0f), q1Var.c7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i10) == null) {
                            sparseArray.put(i10, new Rect(rect));
                        }
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i10 >= 500) {
                int i35 = i10 - 500;
                if (i35 < arrayList8.size()) {
                    p1 p1Var = (p1) arrayList8.get(i35);
                    StringBuilder sb2 = new StringBuilder(p1Var.p.getText());
                    if (q1Var.U4) {
                        obtain.setSelected(p1Var.i);
                        sb2.append(", ");
                        sb2.append(p1Var.d);
                        sb2.append("%");
                        TLRPC.Poll poll = q1Var.h5;
                        if (poll != null && poll.quiz && (p1Var.i || p1Var.l)) {
                            sb2.append(", ");
                            if (p1Var.l) {
                                str2 = "AccDescrQuizCorrectAnswer";
                                i12 = 2131754796;
                            } else {
                                str2 = "AccDescrQuizIncorrectAnswer";
                                i12 = 2131754794;
                            }
                            sb2.append(cd.L0(i12, str2));
                        }
                    } else {
                        obtain.setClassName("android.widget.Button");
                    }
                    obtain.setText(sb2);
                    obtain.setEnabled(true);
                    obtain.addAction(16);
                    int i36 = p1Var.b + q1Var.Sa;
                    int L = q1Var.Z6 - org.telegram.messenger.i0.L(76.0f);
                    int i37 = p1Var.a;
                    rect.set(i37, i36, L + i37, p1Var.c + i36);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i10) == null) {
                        sparseArray.put(i10, new Rect(rect));
                    }
                    z10 = true;
                    rect.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect);
                    obtain.setClickable(true);
                }
                return null;
            }
            z10 = true;
            if (i10 == 495) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                obtain.setText(cd.K0(2131754795));
                obtain.addAction(16);
                rect.set(q1Var.m5 - org.telegram.messenger.i0.L(8.0f), q1Var.n5 - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(32.0f) + q1Var.m5, org.telegram.messenger.i0.L(32.0f) + q1Var.n5);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                    sparseArray.put(i10, new Rect(rect));
                }
                z10 = true;
                rect.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i10 == 499) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout2 = q1Var.p2;
                if (staticLayout2 != null) {
                    obtain.setText(staticLayout2.getText());
                }
                obtain.addAction(16);
                q1Var.K2.round(rect);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                    sparseArray.put(i10, new Rect(rect));
                }
                z10 = true;
                rect.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i10 != 492) {
                int i38 = 491;
                if (i10 != 491) {
                    if (i10 == 490 || i10 == 489) {
                        i38 = 491;
                    } else if (i10 == 498) {
                        obtain.setClassName("android.widget.ImageButton");
                        obtain.setEnabled(true);
                        if (q1Var.C2(q1Var.O5)) {
                            obtain.setContentDescription(cd.L0(2131754819, "AccDescrOpenChat"));
                        } else {
                            obtain.setContentDescription(cd.L0(2131745477, "ShareFile"));
                        }
                        obtain.addAction(16);
                        int i39 = (int) q1Var.P8;
                        rect.set(i39, (int) q1Var.Q8, org.telegram.messenger.i0.L(40.0f) + i39, org.telegram.messenger.i0.L(32.0f) + ((int) q1Var.Q8));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                            sparseArray.put(i10, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i10 == 497) {
                        obtain.setEnabled(true);
                        StringBuilder sb3 = new StringBuilder();
                        z20.q("Reply", 2131746278, sb3, ", ");
                        StaticLayout staticLayout3 = q1Var.O7;
                        if (staticLayout3 != null) {
                            sb3.append(staticLayout3.getText());
                            sb3.append(", ");
                        }
                        StaticLayout staticLayout4 = q1Var.P7;
                        if (staticLayout4 != null) {
                            sb3.append(staticLayout4.getText());
                        }
                        obtain.setContentDescription(sb3.toString());
                        obtain.addAction(16);
                        int i40 = q1Var.S7;
                        rect.set(i40, q1Var.T7, Math.max(q1Var.V7, q1Var.X7) + i40, q1Var.T7 + ((int) q1Var.U7));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                            sparseArray.put(i10, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i10 == 494) {
                        obtain.setEnabled(true);
                        StringBuilder sb4 = new StringBuilder();
                        if (staticLayoutArr2[0] != null && staticLayoutArr2[1] != null) {
                            int i41 = 0;
                            while (i41 < 2) {
                                sb4.append(staticLayoutArr2[i41].getText());
                                sb4.append(i41 == 0 ? " " : "\n");
                                i41++;
                            }
                        }
                        obtain.setContentDescription(sb4.toString());
                        obtain.addAction(16);
                        float f13 = q1Var.r9;
                        float[] fArr = q1Var.u9;
                        int min = (int) Math.min(f13 - fArr[0], f13 - fArr[1]);
                        int i42 = q1Var.s9;
                        rect.set(min, i42, q1Var.p9 + min, q1Var.t9 + i42);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                            sparseArray.put(i10, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i10 == 496) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        int repliesCount = q1Var.getRepliesCount();
                        jj jjVar2 = q1Var.O5;
                        if (jjVar2 == null || jjVar2.O5() || q1Var.O5.G2()) {
                            S = (q1Var.s6 || repliesCount <= 0) ? null : cd.S(null, repliesCount);
                        } else if (q1Var.s6) {
                            S = cd.L0(2131743578, "ViewInChat");
                        } else {
                            S = repliesCount == 0 ? cd.L0(2131749018, "LeaveAComment") : cd.G(repliesCount, "CommentsCount", new Object[0]);
                        }
                        if (S != null) {
                            obtain.setText(S);
                        }
                        obtain.addAction(16);
                        rect.set(q1Var.w7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                            sparseArray.put(i10, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i10 == 493) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        if (q1Var.O5.T4()) {
                            str = "AccActionCloseTranscription";
                            i11 = 2131754939;
                        } else {
                            str = "AccActionOpenTranscription";
                            i11 = 2131754931;
                        }
                        obtain.setText(cd.L0(i11, str));
                        obtain.addAction(16);
                        if (q1Var.H4 != null) {
                            rect.set((int) q1Var.A1().b, (int) q1Var.A1().c, (int) (q1Var.A1().b + q1Var.H4.u()), (int) (q1Var.A1().c + q1Var.H4.h()));
                        }
                        obtain.setBoundsInParent(rect);
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    }
                }
                int i43 = i10 == i38 ? 5 : i10 == 490 ? 31 : 30;
                int i44 = 0;
                while (true) {
                    r1 r1Var2 = q1Var.u2;
                    if (r1Var2 == null || i44 >= r1Var2.g.size()) {
                        break;
                    }
                    n1 n1Var = (n1) q1Var.u2.g.get(i44);
                    if (n1Var.a == i43) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        StaticLayout staticLayout5 = n1Var.d;
                        if (staticLayout5 != null) {
                            obtain.setText(staticLayout5.getText());
                        }
                        obtain.addAction(16);
                        n1Var.e.round(rect);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                            sparseArray.put(i10, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else {
                        i44++;
                    }
                }
            } else {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout6 = q1Var.m2;
                if (staticLayout6 != null) {
                    obtain.setText(staticLayout6.getText());
                }
                obtain.addAction(16);
                q1Var.t2.round(rect);
                r1 r1Var3 = q1Var.u2;
                if (r1Var3 != null && (arrayList = r1Var3.g) != null && arrayList.size() > 1) {
                    n1 n1Var2 = (n1) q1Var.u2.g.get(0);
                    if (!n1Var2.e.isEmpty()) {
                        rect.set(rect.left, rect.top, rect.right, (int) (rect.bottom - n1Var2.e.height()));
                    }
                }
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i10) == null || !((Rect) sparseArray.get(i10)).equals(rect)) {
                    sparseArray.put(i10, new Rect(rect));
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
        jj jjVar3 = q1Var.O5;
        if (jjVar3 != null && jjVar3.N3()) {
            jj jjVar4 = q1Var.O5;
            if (!jjVar4.p1 && jjVar4.F4()) {
                z13 = true;
                jj jjVar5 = q1Var.O5;
                boolean z16 = jjVar5 == null && jjVar5.R2();
                jj jjVar6 = q1Var.O5;
                j10 = jjVar6 == null ? jjVar6.F0 : 0L;
                if (q1Var.N2 == null && q1Var.O2 == z13 && q1Var.P2 == z16) {
                    arrayList2 = arrayList8;
                    arrayList3 = arrayList9;
                    if (q1Var.Q2 == j10) {
                        accessibilityNodeInfo = obtain2;
                        staticLayoutArr = staticLayoutArr2;
                        arrayList4 = arrayList2;
                        if (Build.VERSION.SDK_INT < 24) {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            accessibilityNodeInfo2.setContentDescription(q1Var.N2.toString());
                        } else {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            accessibilityNodeInfo2.setText(q1Var.N2);
                        }
                        accessibilityNodeInfo2.setEnabled(true);
                        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                        if (collectionItemInfo != null) {
                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, cd.L0(2131754936, "AccActionMessageOptions")));
                        int iconForCurrentState = q1Var.getIconForCurrentState();
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 0 ? iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? iconForCurrentState != 5 ? q1Var.O5.D == 16 ? cd.L0(2131752633, "CallAgain") : null : cd.L0(2131754933, "AccActionOpenFile") : cd.L0(2131754941, "AccActionCancelDownload") : cd.L0(2131754938, "AccActionDownload") : cd.L0(2131754930, "AccActionPause") : cd.L0(2131754929, "AccActionPlay")));
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, cd.L0(2131754937, "AccActionEnterSelectionMode")));
                        if (q1Var.getMiniIconForCurrentState() == 2) {
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, cd.L0(2131754938, "AccActionDownload")));
                        }
                        if (!q1Var.H8 || q1Var.q8) {
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, cd.L0(2131744354, "SummaryTitle")));
                        }
                        arrayList6 = q1Var.O5.z2;
                        if (arrayList6 != null) {
                            int size6 = arrayList6.size();
                            int i45 = 0;
                            while (true) {
                                if (i45 >= size6) {
                                    break;
                                }
                                Object obj3 = arrayList6.get(i45);
                                i45++;
                                if (((gj) obj3).N) {
                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, cd.L0(2131751765, "CopyCode")));
                                    break;
                                }
                            }
                        }
                        if ((!q1Var.O5.P4() || q1Var.O5.h4() || q1Var.O5.I3()) && MediaController.B().I(q1Var.O5)) {
                            q1Var.D4.f(accessibilityNodeInfo2);
                        }
                        if (q1Var.G4 && q1Var.H4 != null) {
                            accessibilityNodeInfo2.addChild(q1Var, 493);
                        }
                        if (Build.VERSION.SDK_INT < 24) {
                            if (q1Var.d6 && q1Var.ha != null && !q1Var.O5.N3()) {
                                accessibilityNodeInfo2.addChild(q1Var, 5000);
                            }
                            CharSequence charSequence3 = q1Var.O5.v;
                            if (charSequence3 instanceof Spannable) {
                                Spannable spannable3 = (Spannable) charSequence3;
                                int i46 = 0;
                                for (CharacterStyle characterStyle : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                                    accessibilityNodeInfo2.addChild(q1Var, i46 + 2000);
                                    i46++;
                                }
                            }
                            CharSequence charSequence4 = q1Var.O5.z;
                            if ((charSequence4 instanceof Spannable) && q1Var.k3 != null) {
                                Spannable spannable4 = (Spannable) charSequence4;
                                int i47 = 0;
                                for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                                    accessibilityNodeInfo2.addChild(q1Var, i47 + 3000);
                                    i47++;
                                }
                            }
                        }
                        size = arrayList3.size();
                        int i48 = 0;
                        i16 = 0;
                        while (i16 < size) {
                            Object obj4 = arrayList3.get(i16);
                            i16++;
                            accessibilityNodeInfo2.addChild(q1Var, i48 + 1000);
                            i48++;
                        }
                        if (q1Var.p5 && q1Var.m5 != -1 && q1Var.O5.T3()) {
                            accessibilityNodeInfo2.addChild(q1Var, 495);
                        }
                        size2 = arrayList4.size();
                        int i49 = 0;
                        i17 = 0;
                        while (i17 < size2) {
                            Object obj5 = arrayList4.get(i17);
                            i17++;
                            accessibilityNodeInfo2.addChild(q1Var, i49 + 500);
                            i49++;
                        }
                        if (q1Var.s2 && !q1Var.K2.isEmpty()) {
                            accessibilityNodeInfo2.addChild(q1Var, 499);
                        }
                        r1Var = q1Var.u2;
                        if (r1Var != null && r1Var.b && (rectF = q1Var.t2) != null && !rectF.isEmpty()) {
                            accessibilityNodeInfo2.addChild(q1Var, 492);
                            arrayList7 = q1Var.u2.g;
                            if (arrayList7 != null && arrayList7.size() > 1) {
                                ArrayList arrayList13 = q1Var.u2.g;
                                size3 = arrayList13.size();
                                i20 = 0;
                                while (i20 < size3) {
                                    Object obj6 = arrayList13.get(i20);
                                    i20++;
                                    n1 n1Var3 = (n1) obj6;
                                    if (q1Var.u2.d && n1Var3.a == 5 && !n1Var3.e.isEmpty()) {
                                        accessibilityNodeInfo2.addChild(q1Var, 491);
                                    }
                                    if (q1Var.u2.e && n1Var3.a == 31 && !n1Var3.e.isEmpty()) {
                                        accessibilityNodeInfo2.addChild(q1Var, 490);
                                    }
                                    if (q1Var.u2.c && n1Var3.a == 30 && !n1Var3.e.isEmpty()) {
                                        accessibilityNodeInfo2.addChild(q1Var, 489);
                                    }
                                }
                            }
                        }
                        if (q1Var.l7 != null) {
                            accessibilityNodeInfo2.addChild(q1Var, 496);
                        }
                        i18 = q1Var.D8;
                        if (i18 != 1 || i18 == 2) {
                            accessibilityNodeInfo2.addChild(q1Var, 498);
                        }
                        if (q1Var.O7 != null) {
                            accessibilityNodeInfo2.addChild(q1Var, 497);
                        }
                        jjVar = q1Var.O5;
                        if (jjVar != null && (vvVar2 = jjVar.w2) != null) {
                            int i50 = 0;
                            for (i19 = 0; i19 < vvVar2.g.size(); i19++) {
                                qu quVar = (qu) vvVar2.g.get(i19);
                                if (quVar.R()) {
                                    int B = quVar.B() + (quVar.r == null ? 0 : 1);
                                    for (int i51 = 0; i51 < B; i51++) {
                                        accessibilityNodeInfo2.addChild(q1Var, i50 + 6000 + i51);
                                    }
                                    i50 += B;
                                }
                            }
                        }
                        if (staticLayoutArr[0] != null && staticLayoutArr[1] != null) {
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, cd.L0(2131754932, "AccActionOpenForwardedOrigin")));
                        }
                        if (q1Var.j1 && q1Var.getBackground() == null) {
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
                if (q1Var.d6 || q1Var.ha == null || q1Var.O5.N3()) {
                    accessibilityNodeInfo = obtain2;
                    staticLayoutArr = staticLayoutArr2;
                    j11 = j10;
                    arrayList4 = arrayList2;
                } else {
                    spannableStringBuilder.append((CharSequence) h20.p(q1Var.ha));
                    staticLayoutArr = staticLayoutArr2;
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList2;
                    spannableStringBuilder.setSpan(new x0(this, q1Var.ha), 0, spannableStringBuilder.length(), 33);
                    CharSequence adminAccessibilityText = q1Var.getAdminAccessibilityText();
                    if (TextUtils.isEmpty(adminAccessibilityText)) {
                        j11 = j10;
                    } else if (q1Var.X8) {
                        j11 = j10;
                        spannableStringBuilder.append(' ').append((CharSequence) cd.Z(q1Var.V8 ? 2131754727 : 2131754726, adminAccessibilityText));
                    } else {
                        j11 = j10;
                        spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                    }
                    spannableStringBuilder.append('\n');
                }
                if (q1Var.q9) {
                    int i52 = 0;
                    while (i52 < 2) {
                        StaticLayout staticLayout7 = staticLayoutArr[i52];
                        if (staticLayout7 != null && staticLayout7.getText() != null) {
                            spannableStringBuilder.append(staticLayoutArr[i52].getText());
                            spannableStringBuilder.append(i52 == 0 ? " " : "\n");
                        }
                        i52++;
                    }
                }
                document = q1Var.L1;
                if (document != null && q1Var.K1 == 1) {
                    s10 = org.telegram.messenger.b8.s(document);
                    if (s10.indexOf(46) != -1) {
                        spannableStringBuilder.append((CharSequence) cd.Z(2131754889, s10.substring(s10.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                    }
                }
                vvVar = q1Var.O5.w2;
                if (vvVar == null && !vvVar.g.isEmpty()) {
                    ArrayList arrayList14 = q1Var.O5.w2.g;
                    int size7 = arrayList14.size();
                    int i53 = 0;
                    while (i53 < size7) {
                        Object obj7 = arrayList14.get(i53);
                        i53++;
                        qu quVar2 = (qu) obj7;
                        if (quVar2.R()) {
                            int length3 = spannableStringBuilder.length();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            quVar2.k(spannableStringBuilder2);
                            ArrayList arrayList15 = arrayList14;
                            CharSequence y3 = quVar2.y();
                            int i54 = size7;
                            CharSequence text = (!quVar2.x || (staticLayout = quVar2.d) == null) ? null : staticLayout.getText();
                            if (!TextUtils.isEmpty(text)) {
                                spannableStringBuilder.append(text);
                                if (!TextUtils.isEmpty(y3) || spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append(' ');
                                }
                            }
                            if (!TextUtils.isEmpty(y3)) {
                                spannableStringBuilder.append(y3);
                                if (spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                            if (spannableStringBuilder.length() > length3 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                                spannableStringBuilder.append('\n');
                            }
                            arrayList14 = arrayList15;
                            size7 = i54;
                        }
                    }
                } else if (!TextUtils.isEmpty(q1Var.O5.v)) {
                    CharSequence charSequence5 = q1Var.O5.v;
                    if (charSequence5 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence5;
                        di.i[] iVarArr = (di.i[]) spanned2.getSpans(0, spanned2.length(), di.i.class);
                        if (iVarArr != null && iVarArr.length > 0) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence5);
                            Arrays.sort(iVarArr, new w0(spanned2, 0));
                            int length4 = iVarArr.length;
                            int i55 = 0;
                            while (i55 < length4) {
                                di.i iVar = iVarArr[i55];
                                int i56 = length4;
                                int spanStart = spanned2.getSpanStart(iVar);
                                if (spanStart < 0) {
                                    spanned = spanned2;
                                } else {
                                    spanned = spanned2;
                                    spannableStringBuilder3.insert(spanStart, (CharSequence) (((Object) (TextUtils.isEmpty(iVar.a) ? cd.K0(2131754897) : cd.Z(2131754896, gj.b(iVar.a)))) + ". "));
                                }
                                i55++;
                                length4 = i56;
                                spanned2 = spanned;
                            }
                            charSequence5 = spannableStringBuilder3;
                        }
                    }
                    spannableStringBuilder.append(charSequence5);
                }
                if (q1Var.L1 != null && (((i15 = q1Var.K1) == 1 || i15 == 2 || i15 == 4) && q1Var.M3 == 1 && q1Var.y3 != null)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    boolean o42 = q1Var.O5.o4();
                    spannableStringBuilder.append((CharSequence) cd.Y(!o42 ? 2131754742 : 2131754888, !o42 ? "AccDescrUploadProgress" : "AccDescrDownloadProgress", org.telegram.messenger.i0.i0(q1Var.O5.F0, false, false), org.telegram.messenger.i0.i0(q1Var.y1, false, false)));
                }
                if (!q1Var.O5.I3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) cd.Y(2131754832, "AccDescrMusicInfo", q1Var.O5.x1(true), q1Var.O5.z1(true)));
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) cd.z((int) q1Var.O5.L0()));
                } else if (q1Var.O5.P4() || q1Var.wb) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) cd.z((int) q1Var.O5.L0()));
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (q1Var.O5.R2()) {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131754838, "AccDescrMsgNotPlayed"));
                    } else {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131754837, "AccDescrMsgPlayed"));
                    }
                }
                if (q1Var.h5 != null) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) q1Var.h5.question.text);
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (q1Var.V4) {
                        L0 = cd.L0(2131750696, "FinalResults");
                    } else {
                        TLRPC.Poll poll2 = q1Var.h5;
                        L0 = poll2.quiz ? poll2.public_voters ? cd.L0(2131746460, "QuizPoll") : cd.L0(2131754248, "AnonymousQuizPoll") : poll2.public_voters ? cd.L0(2131746603, "PublicPoll") : cd.L0(2131754249, "AnonymousPoll");
                    }
                    spannableStringBuilder.append((CharSequence) L0);
                }
                if (q1Var.L1 != null) {
                    if (q1Var.K1 == 4) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) cd.z((int) q1Var.O5.L0()));
                    }
                    if (q1Var.M3 == 0 || q1Var.K1 == 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.i0(q1Var.L1.size, false, false));
                    }
                }
                if (!q1Var.O5.T4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(q1Var.O5.j2());
                } else if (jj.o1(q1Var.O5.k) != null && !TextUtils.isEmpty(q1Var.O5.z)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(q1Var.O5.z);
                }
                if (q1Var.O5.N3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    StringBuilder sb5 = new StringBuilder();
                    z20.q("TodayAt", 2131744137, sb5, " ");
                    sb5.append((Object) q1Var.C9);
                    spannableStringBuilder.append((CharSequence) cd.Y(2131754789, "AccDescrReceivedDate", sb5.toString()));
                } else if (q1Var.O5.q4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (q1Var.O5.p1) {
                        spannableStringBuilder.append((CharSequence) cd.Y(2131754781, "AccDescrScheduledDate", q1Var.C9));
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        z20.q("TodayAt", 2131744137, sb6, " ");
                        sb6.append((Object) q1Var.C9);
                        spannableStringBuilder.append((CharSequence) cd.Y(2131754765, "AccDescrSentDate", sb6.toString()));
                        spannableStringBuilder.append((CharSequence) ", ");
                        if (q1Var.O5.F4()) {
                            str3 = "AccDescrMsgUnread";
                            i14 = 2131754833;
                        } else {
                            str3 = "AccDescrMsgRead";
                            i14 = 2131754836;
                        }
                        spannableStringBuilder.append((CharSequence) cd.L0(i14, str3));
                    }
                } else if (q1Var.O5.o4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) cd.L0(2131754835, "AccDescrMsgSending"));
                    RadialProgress2 radialProgress2 = q1Var.P0;
                    float f14 = (radialProgress2.c ? radialProgress2.j : radialProgress2.i).w;
                    if (f14 > 0.0f) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f14 * 100.0f))).append((CharSequence) "%");
                    }
                } else if (q1Var.O5.n4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) cd.L0(2131754834, "AccDescrMsgSendingError"));
                }
                if (q1Var.getRepliesCount() > 0 && !q1Var.b2()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) cd.G(q1Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
                }
                tL_messageReactions = q1Var.O5.k.reactions;
                if (tL_messageReactions != null && (arrayList5 = tL_messageReactions.results) != null) {
                    String str4 = "";
                    if (arrayList5.size() != 1) {
                        TLRPC.ReactionCount reactionCount = q1Var.O5.k.reactions.results.get(0);
                        TLRPC.Reaction reaction = reactionCount.reaction;
                        String str5 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                        int i57 = reactionCount.count;
                        if (i57 == 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            ArrayList<TLRPC.MessagePeerReaction> arrayList16 = q1Var.O5.k.reactions.recent_reactions;
                            if (arrayList16 == null || arrayList16.size() != 1 || (messagePeerReaction = q1Var.O5.k.reactions.recent_reactions.get(0)) == null) {
                                z14 = false;
                            } else {
                                TLRPC.User Z1 = vp.r1(q1Var.Y5).Z1(Long.valueOf(jj.C1(messagePeerReaction.peer_id)));
                                z14 = h20.B(Z1);
                                if (Z1 != null) {
                                    str4 = h20.i(Z1);
                                }
                            }
                            if (z14) {
                                spannableStringBuilder.append((CharSequence) cd.Y(2131754725, "AccDescrYouReactedWith", str5));
                            } else {
                                spannableStringBuilder.append((CharSequence) cd.Y(2131754791, "AccDescrReactedWith", str4, str5));
                            }
                        } else if (i57 > 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            spannableStringBuilder.append((CharSequence) cd.G(reactionCount.count, "AccDescrNumberOfPeopleReactions", str5));
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131746402, "Reactions")).append((CharSequence) ": ");
                        int size8 = q1Var.O5.k.reactions.results.size();
                        int i58 = 0;
                        while (i58 < size8) {
                            TLRPC.ReactionCount reactionCount2 = q1Var.O5.k.reactions.results.get(i58);
                            TLRPC.Reaction reaction2 = reactionCount2.reaction;
                            spannableStringBuilder.append((CharSequence) (reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon : "")).append((CharSequence) " ").append((CharSequence) (reactionCount2.count + ""));
                            i58++;
                            if (i58 < size8) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                        }
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                if ((q1Var.O5.k.flags & 1024) == 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    i13 = 0;
                    spannableStringBuilder.append((CharSequence) cd.G(q1Var.O5.k.views, "AccDescrNumberOfViews", new Object[0]));
                } else {
                    i13 = 0;
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannableStringBuilder.getSpans(i13, spannableStringBuilder.length(), ClickableSpan.class)) {
                    int spanStart2 = spannableStringBuilder.getSpanStart(characterStyle3);
                    int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle3);
                    spannableStringBuilder.removeSpan(characterStyle3);
                    spannableStringBuilder.setSpan(new h(2, this, characterStyle3), spanStart2, spanEnd, 33);
                }
                q1Var.N2 = spannableStringBuilder;
                q1Var.O2 = z13;
                q1Var.P2 = z16;
                q1Var.Q2 = j11;
                if (Build.VERSION.SDK_INT < 24) {
                }
                accessibilityNodeInfo2.setEnabled(true);
                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, cd.L0(2131754936, "AccActionMessageOptions")));
                int iconForCurrentState2 = q1Var.getIconForCurrentState();
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState2 != 0 ? iconForCurrentState2 != 1 ? iconForCurrentState2 != 2 ? iconForCurrentState2 != 3 ? iconForCurrentState2 != 5 ? q1Var.O5.D == 16 ? cd.L0(2131752633, "CallAgain") : null : cd.L0(2131754933, "AccActionOpenFile") : cd.L0(2131754941, "AccActionCancelDownload") : cd.L0(2131754938, "AccActionDownload") : cd.L0(2131754930, "AccActionPause") : cd.L0(2131754929, "AccActionPlay")));
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, cd.L0(2131754937, "AccActionEnterSelectionMode")));
                if (q1Var.getMiniIconForCurrentState() == 2) {
                }
                if (!q1Var.H8) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, cd.L0(2131744354, "SummaryTitle")));
                arrayList6 = q1Var.O5.z2;
                if (arrayList6 != null) {
                }
                if (!q1Var.O5.P4()) {
                }
                q1Var.D4.f(accessibilityNodeInfo2);
                if (q1Var.G4) {
                    accessibilityNodeInfo2.addChild(q1Var, 493);
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                size = arrayList3.size();
                int i482 = 0;
                i16 = 0;
                while (i16 < size) {
                }
                if (q1Var.p5) {
                    accessibilityNodeInfo2.addChild(q1Var, 495);
                }
                size2 = arrayList4.size();
                int i492 = 0;
                i17 = 0;
                while (i17 < size2) {
                }
                if (q1Var.s2) {
                    accessibilityNodeInfo2.addChild(q1Var, 499);
                }
                r1Var = q1Var.u2;
                if (r1Var != null) {
                    accessibilityNodeInfo2.addChild(q1Var, 492);
                    arrayList7 = q1Var.u2.g;
                    if (arrayList7 != null) {
                        ArrayList arrayList132 = q1Var.u2.g;
                        size3 = arrayList132.size();
                        i20 = 0;
                        while (i20 < size3) {
                        }
                    }
                }
                if (q1Var.l7 != null) {
                }
                i18 = q1Var.D8;
                if (i18 != 1) {
                }
                accessibilityNodeInfo2.addChild(q1Var, 498);
                if (q1Var.O7 != null) {
                }
                jjVar = q1Var.O5;
                if (jjVar != null) {
                    int i502 = 0;
                    while (i19 < vvVar2.g.size()) {
                    }
                }
                if (staticLayoutArr[0] != null) {
                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, cd.L0(2131754932, "AccActionOpenForwardedOrigin")));
                }
                if (q1Var.j1) {
                }
                accessibilityNodeInfo2.setSelected(true);
                return accessibilityNodeInfo2;
            }
        }
        z13 = false;
        jj jjVar52 = q1Var.O5;
        if (jjVar52 == null) {
        }
        jj jjVar62 = q1Var.O5;
        if (jjVar62 == null) {
        }
        if (q1Var.N2 == null) {
        }
        arrayList2 = arrayList8;
        arrayList3 = arrayList9;
        spannableStringBuilder = new SpannableStringBuilder();
        if (q1Var.d6) {
        }
        accessibilityNodeInfo = obtain2;
        staticLayoutArr = staticLayoutArr2;
        j11 = j10;
        arrayList4 = arrayList2;
        if (q1Var.q9) {
        }
        document = q1Var.L1;
        if (document != null) {
            s10 = org.telegram.messenger.b8.s(document);
            if (s10.indexOf(46) != -1) {
            }
        }
        vvVar = q1Var.O5.w2;
        if (vvVar == null) {
        }
        if (!TextUtils.isEmpty(q1Var.O5.v)) {
        }
        if (q1Var.L1 != null) {
            spannableStringBuilder.append((CharSequence) "\n");
            boolean o422 = q1Var.O5.o4();
            spannableStringBuilder.append((CharSequence) cd.Y(!o422 ? 2131754742 : 2131754888, !o422 ? "AccDescrUploadProgress" : "AccDescrDownloadProgress", org.telegram.messenger.i0.i0(q1Var.O5.F0, false, false), org.telegram.messenger.i0.i0(q1Var.y1, false, false)));
        }
        if (!q1Var.O5.I3()) {
        }
        if (q1Var.h5 != null) {
        }
        if (q1Var.L1 != null) {
        }
        if (!q1Var.O5.T4()) {
        }
        if (q1Var.O5.N3()) {
        }
        if (q1Var.getRepliesCount() > 0) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) cd.G(q1Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
        }
        tL_messageReactions = q1Var.O5.k.reactions;
        if (tL_messageReactions != null) {
            String str42 = "";
            if (arrayList5.size() != 1) {
            }
        }
        if ((q1Var.O5.k.flags & 1024) == 0) {
        }
        spannableStringBuilder.append((CharSequence) "\n");
        while (r7 < r6) {
        }
        q1Var.N2 = spannableStringBuilder;
        q1Var.O2 = z13;
        q1Var.P2 = z16;
        q1Var.Q2 = j11;
        if (Build.VERSION.SDK_INT < 24) {
        }
        accessibilityNodeInfo2.setEnabled(true);
        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
        if (collectionItemInfo != null) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, cd.L0(2131754936, "AccActionMessageOptions")));
        int iconForCurrentState22 = q1Var.getIconForCurrentState();
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState22 != 0 ? iconForCurrentState22 != 1 ? iconForCurrentState22 != 2 ? iconForCurrentState22 != 3 ? iconForCurrentState22 != 5 ? q1Var.O5.D == 16 ? cd.L0(2131752633, "CallAgain") : null : cd.L0(2131754933, "AccActionOpenFile") : cd.L0(2131754941, "AccActionCancelDownload") : cd.L0(2131754938, "AccActionDownload") : cd.L0(2131754930, "AccActionPause") : cd.L0(2131754929, "AccActionPlay")));
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, cd.L0(2131754937, "AccActionEnterSelectionMode")));
        if (q1Var.getMiniIconForCurrentState() == 2) {
        }
        if (!q1Var.H8) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, cd.L0(2131744354, "SummaryTitle")));
        arrayList6 = q1Var.O5.z2;
        if (arrayList6 != null) {
        }
        if (!q1Var.O5.P4()) {
        }
        q1Var.D4.f(accessibilityNodeInfo2);
        if (q1Var.G4) {
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        size = arrayList3.size();
        int i4822 = 0;
        i16 = 0;
        while (i16 < size) {
        }
        if (q1Var.p5) {
        }
        size2 = arrayList4.size();
        int i4922 = 0;
        i17 = 0;
        while (i17 < size2) {
        }
        if (q1Var.s2) {
        }
        r1Var = q1Var.u2;
        if (r1Var != null) {
        }
        if (q1Var.l7 != null) {
        }
        i18 = q1Var.D8;
        if (i18 != 1) {
        }
        accessibilityNodeInfo2.addChild(q1Var, 498);
        if (q1Var.O7 != null) {
        }
        jjVar = q1Var.O5;
        if (jjVar != null) {
        }
        if (staticLayoutArr[0] != null) {
        }
        if (q1Var.j1) {
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
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        l1 l1Var;
        z0 z0Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean T;
        CharSequence D;
        q1 q1Var = this.a;
        if (i10 == -1) {
            q1Var.performAccessibilityAction(i11, bundle);
            return true;
        }
        if (i11 == 64) {
            q1Var.e3(i10, 32768, null);
            return true;
        }
        r4 = null;
        Object[] objArr = null;
        if (i11 == 16) {
            if (i10 == 5000) {
                l1 l1Var2 = q1Var.Qa;
                if (l1Var2 != null) {
                    l1Var2.r0(q1Var, q1Var.ha, 0.0f, 0.0f);
                    return true;
                }
            } else if (i10 >= 6000) {
                int[] iArr = {0};
                qu b10 = b(iArr, i10);
                if (b10 != null) {
                    int i12 = iArr[0];
                    CheckBoxBase checkBoxBase = b10.r;
                    if (checkBoxBase == null || i12 != 0) {
                        T = b10.T(i12 - (checkBoxBase == null ? 0 : 1), q1Var);
                    } else if (b10.o()) {
                        b10.d0();
                        T = true;
                    } else {
                        T = false;
                    }
                    if (T) {
                        q1Var.e3(i10, 1, null);
                        int i13 = iArr[0];
                        if (b10.r != null && i13 == 0) {
                            objArr = 1;
                        }
                        if (objArr != null) {
                            D = cd.L0(b10.F() ? 2131754902 : 2131754830, null);
                        } else {
                            D = b10.D();
                        }
                        org.telegram.messenger.i0.i2(D);
                        return true;
                    }
                }
            } else if (i10 >= 3000) {
                ClickableSpan a2 = a(i10, true);
                if (a2 != null) {
                    q1Var.Qa.L0(q1Var, a2, false);
                    q1Var.e3(i10, 1, null);
                    return true;
                }
            } else {
                if (i10 < 2000) {
                    if (i10 >= 1000) {
                        int i14 = i10 - 1000;
                        if (i14 < q1Var.G5.size()) {
                            c0 c0Var = (c0) q1Var.G5.get(i14);
                            l1 l1Var3 = q1Var.Qa;
                            if (l1Var3 != null && !c0Var.m) {
                                org.telegram.messenger.s2 s2Var = c0Var.j;
                                if (s2Var != null) {
                                    l1Var3.G(q1Var, s2Var);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var.i;
                                    if (keyboardInlineButton != null) {
                                        l1Var3.W0(q1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            q1Var.e3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 >= 500) {
                        int i15 = i10 - 500;
                        if (i15 < q1Var.O4.size()) {
                            p1 p1Var = (p1) q1Var.O4.get(i15);
                            if (q1Var.Qa != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(p1Var.s);
                                q1Var.Qa.i(q1Var, arrayList, -1, 0, 0);
                            }
                            q1Var.e3(i10, 1, null);
                            return true;
                        }
                    } else {
                        if (i10 == 495) {
                            q1Var.E0();
                            return true;
                        }
                        if (i10 == 499) {
                            l1 l1Var4 = q1Var.Qa;
                            if (l1Var4 != null) {
                                l1Var4.c1(q1Var, q1Var.w2);
                                return true;
                            }
                        } else if (i10 == 492) {
                            l1 l1Var5 = q1Var.Qa;
                            if (l1Var5 != null) {
                                l1Var5.c1(q1Var, 5);
                                return true;
                            }
                        } else if (i10 == 491) {
                            l1 l1Var6 = q1Var.Qa;
                            if (l1Var6 != null) {
                                l1Var6.c1(q1Var, 5);
                                return true;
                            }
                        } else if (i10 == 490) {
                            l1 l1Var7 = q1Var.Qa;
                            if (l1Var7 != null) {
                                l1Var7.c1(q1Var, 31);
                                return true;
                            }
                        } else if (i10 == 489) {
                            l1 l1Var8 = q1Var.Qa;
                            if (l1Var8 != null) {
                                l1Var8.c1(q1Var, 30);
                                return true;
                            }
                        } else if (i10 == 498) {
                            l1 l1Var9 = q1Var.Qa;
                            if (l1Var9 != null) {
                                l1Var9.q(q1Var);
                                return true;
                            }
                        } else if (i10 == 497) {
                            if (q1Var.Qa != null) {
                                if (q1Var.m6 && !q1Var.k6) {
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = q1Var.O5.k.reply_to;
                                }
                                if (q1Var.O5.B2() || q1Var.K7 || ((message = q1Var.O5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)) {
                                    q1Var.Qa.L1(q1Var, q1Var.O5.O1(), 0.0f, 0.0f, false);
                                    return true;
                                }
                            }
                        } else if (i10 == 494) {
                            l1 l1Var10 = q1Var.Qa;
                            if (l1Var10 != null) {
                                TLRPC.Chat chat = q1Var.sa;
                                if (chat != null) {
                                    l1Var10.T(q1Var, chat, q1Var.O5.k.fwd_from.channel_post, q1Var.g1, q1Var.h1, false);
                                    return true;
                                }
                                TLRPC.User user = q1Var.qa;
                                if (user != null) {
                                    l1Var10.r0(q1Var, user, q1Var.g1, q1Var.h1);
                                    return true;
                                }
                                if (q1Var.ta != null) {
                                    l1Var10.n(q1Var);
                                    return true;
                                }
                            }
                        } else if (i10 == 496) {
                            l1 l1Var11 = q1Var.Qa;
                            if (l1Var11 != null) {
                                if (q1Var.s6) {
                                    l1Var11.q(q1Var);
                                    return true;
                                }
                                l1Var11.v(q1Var);
                                return true;
                            }
                        } else if (i10 == 493 && (z0Var = q1Var.H4) != null) {
                            z0Var.l();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan a10 = a(i10, false);
                if (a10 != null) {
                    q1Var.Qa.L0(q1Var, a10, false);
                    q1Var.e3(i10, 1, null);
                    return true;
                }
            }
        } else if (i11 == 32) {
            ClickableSpan a11 = a(i10, i10 >= 3000);
            if (a11 != null && (l1Var = q1Var.Qa) != null) {
                l1Var.L0(q1Var, a11, true);
                q1Var.e3(i10, 2, null);
            }
        }
        return true;
    }
}
