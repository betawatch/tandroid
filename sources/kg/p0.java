package kg;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.h3;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.i50;
import org.telegram.ui.un;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final mg.b c;
    public LinearLayout d;
    public final /* synthetic */ q0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0539, code lost:
    
        if (r10.isEmpty() != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0555, code lost:
    
        r0 = r44.v2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x055d, code lost:
    
        if (r0.isEmpty() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x055f, code lost:
    
        r0 = r44.u2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0568, code lost:
    
        r3 = new org.telegram.ui.Components.u8(r45, false);
        r3.a.q = org.telegram.messenger.i0.L(3.33f);
        r3.setSize(org.telegram.messenger.i0.L(72.0f));
        r3.setStepFactor(0.4f);
        r4 = java.lang.Math.min(r0.size(), 3);
        r3.setCount(r4);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0595, code lost:
    
        if (r5 >= r4) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0597, code lost:
    
        r6 = (java.lang.Long) r0.get(r5);
        r6.getClass();
        r3.b(r5, r44.a, org.telegram.messenger.vp.r1(r44.a).Z1(r6));
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05b2, code lost:
    
        r3.a(false);
        addView(r3, w7.b6.t(((r4 - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
        r4 = new android.widget.TextView(r45);
        r4.setGravity(17);
        org.telegram.messenger.z20.n(r4, r26, 20.0f);
        r5 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(r4, r5, r44.I0);
        r4.setText(org.telegram.messenger.cd.K0(2131749138));
        addView(r4, w7.b6.t(-1, -2, 1, 32, 0, 32, 9));
        r4 = new android.widget.TextView(r45);
        r4.setGravity(17);
        r4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(r4, r5, r44.I0);
        addView(r4, w7.b6.t(-1, -2, 1, 32, 0, 32, 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0624, code lost:
    
        if (r13 != 34) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0626, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0629, code lost:
    
        r9 = r44.u2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x062d, code lost:
    
        if (r9 == null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x062f, code lost:
    
        r9 = r44.u2;
        r9 = r9.size();
        r10 = r44.v2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x063f, code lost:
    
        if (r9 < r10.size()) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0641, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0649, code lost:
    
        if (r0.size() != 1) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x064b, code lost:
    
        if (r6 == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x064d, code lost:
    
        r3 = 2131749177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x065a, code lost:
    
        r0 = org.telegram.messenger.cd.Z(r3, org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(0))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x07b4, code lost:
    
        r4.setText(org.telegram.messenger.i0.W2(r0));
        r0 = r44.v2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x07bf, code lost:
    
        if (r0 != null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x07c1, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x07cb, code lost:
    
        r3 = r44.u2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x07cf, code lost:
    
        if (r3 != null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x07d1, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x07dd, code lost:
    
        if ((r0 - r3) <= 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x07e0, code lost:
    
        if (r0 != 1) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x07e2, code lost:
    
        if (r3 == 1) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x07e6, code lost:
    
        if (r44.Q1 == false) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x07e8, code lost:
    
        r9 = 0;
        r0 = new kg.x0(r45, r44.I0, false);
        w7.e6.b(r0, 0.02f, 1.2f);
        r0.b(org.telegram.messenger.cd.K0(2131749140), new kg.n0(r43, r9), false);
        addView(r0, w7.b6.k((r44.t0 / org.telegram.messenger.i0.p) + 4.0f, 0.0f, (r44.t0 / org.telegram.messenger.i0.p) + 4.0f, 18.0f, -1, 48));
        r0 = new bi.j6(r43, r45);
        r0.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(r0, org.telegram.ui.ActionBar.t6.z6, r44.I0);
        r0.setText(" " + org.telegram.messenger.cd.K0(2131749141) + " ");
        r0.setTextSize(14.0f);
        addView(r0, w7.b6.t(org.telegram.messenger.zs.U2, -2, 1, 12, 0, 12, 20));
        r0 = new android.widget.TextView(r45);
        r0.setGravity(17);
        r0.setTypeface(org.telegram.messenger.i0.o());
        r0.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.V(r0, r5, r44.I0);
        r0.setText(org.telegram.messenger.cd.K0(2131749181));
        addView(r0, w7.b6.t(-1, -2, 1, 32, 0, 32, 9));
        r0 = new android.widget.TextView(r45);
        r0.setGravity(17);
        r0.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(r0, r5, r44.I0);
        r2 = r44.v2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x08ba, code lost:
    
        if (r2.size() > 1) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x08bc, code lost:
    
        r0.setText(org.telegram.messenger.cd.K0(2131749182));
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x08d1, code lost:
    
        addView(r0, w7.b6.t(-1, -2, 1, 32, 0, 32, 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x08f4, code lost:
    
        r44.F1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x08f7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x08c7, code lost:
    
        r0.setText(org.telegram.messenger.cd.K0(2131749183));
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x08e3, code lost:
    
        ((android.view.ViewGroup.MarginLayoutParams) r4.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(8.0f);
        r44.b2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x07d3, code lost:
    
        r3 = r44.u2;
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x07c3, code lost:
    
        r0 = r44.v2;
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0651, code lost:
    
        if (r9 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0653, code lost:
    
        r3 = 2131749147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0657, code lost:
    
        r3 = 2131749142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x067f, code lost:
    
        if (r0.size() != 2) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0681, code lost:
    
        if (r6 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0683, code lost:
    
        r3 = 2131749175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0690, code lost:
    
        r0 = org.telegram.messenger.cd.Z(r3, org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(0))), org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0687, code lost:
    
        if (r9 == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0689, code lost:
    
        r3 = 2131749145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x068d, code lost:
    
        r3 = 2131749137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06cc, code lost:
    
        if (r0.size() != 3) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06ce, code lost:
    
        if (r6 == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06d0, code lost:
    
        r3 = 2131749176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06dd, code lost:
    
        r0 = org.telegram.messenger.cd.Z(r3, org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(0))), org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(1))), org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(2))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06d4, code lost:
    
        if (r9 == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06d6, code lost:
    
        r3 = 2131749146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06da, code lost:
    
        r3 = 2131749139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x072f, code lost:
    
        if (r6 == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0731, code lost:
    
        r6 = "InviteCallMessagePremiumBlockedMany";
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x073b, code lost:
    
        r6 = org.telegram.messenger.cd.G(r0.size() - 2, r6, org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(0))), org.telegram.messenger.h20.k(org.telegram.messenger.vp.r1(r44.a).Z1((java.lang.Long) r0.get(1))));
        r0 = r0.size() - 2;
        r9 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, r44.I0);
        r3.b = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, null);
        r3.c = new org.telegram.ui.Components.qz0(i0.a.i(r0, "+"), 12.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
        r0 = new android.graphics.Paint(1);
        r3.d = r0;
        r0.setColor(r9);
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0734, code lost:
    
        if (r9 == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0736, code lost:
    
        r6 = "InviteMessagePremiumBlockedMany";
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0739, code lost:
    
        r6 = "InvitePremiumBlockedMany";
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0643, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0628, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0564, code lost:
    
        r0 = r44.v2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0553, code lost:
    
        if (r10 >= r32.size()) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0dec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a3e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0456  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0(q0 q0Var, Context context) {
        super(context);
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String G;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str2;
        boolean z10;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        ArrayList arrayList20;
        int i10;
        int i11;
        float f7;
        ArrayList arrayList21;
        ArrayList arrayList22;
        ArrayList arrayList23;
        ArrayList arrayList24;
        int i12;
        ArrayList arrayList25;
        int i13;
        int i14;
        int i15;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        final int i16;
        boolean z11;
        int i17;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3;
        float f10;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.k2 k2Var = q0Var.o1;
        this.e = q0Var;
        setOrientation(1);
        int i18 = q0.O2;
        setPadding(org.telegram.messenger.i0.L(6.0f) + q0Var.t0, 0, org.telegram.messenger.i0.L(6.0f) + q0Var.t0, 0);
        int i19 = q0Var.Z1;
        androidx.emoji2.text.p o12 = q0.o1(i19, q0Var.a);
        q0Var.E2 = o12;
        int i20 = o12.a;
        vp r12 = vp.r1(q0Var.a);
        boolean A3 = r12.A3();
        boolean r13 = q0Var.r1();
        if (i19 == 31) {
            str = cd.L0(r13 ? 2131753602 : 2131753601, null);
        } else if (i19 == 32) {
            str = q0Var.l1(true);
        } else if (i19 == 19) {
            org.telegram.ui.Cells.q1 q1Var = q0Var.Y1;
            if (q1Var != null) {
                int i21 = q1Var.getMessageObject().k.from_boosts_applied;
                TLRPC.Chat n12 = q0Var.n1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) cd.G(i21, "GroupBoostedByUserWithTimes", h20.j(q0Var.Y1.getCurrentUser(), true)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) cd.a0(null, null, 2131749506, n12 == null ? "" : n12.title));
                str = spannableStringBuilder.toString();
            } else if (k2Var instanceof i50) {
                str = cd.G(mg.k0.g(), "BoostingGroupBoostWhatAreBoostsDescription", new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(q0Var.l1(true));
                if (w3.N(q0Var.n1()) && r13) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) cd.L0(2131753329, null));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i19 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = q0Var.T1;
            if (tL_premium_boostsStatus4.level == 0) {
                int i22 = r13 ? 2131749430 : 2131752353;
                int i23 = tL_premium_boostsStatus4.next_level_boosts;
                str = cd.a0(null, null, i22, cd.G(i23, "MoreBoosts", Integer.valueOf(i23)));
            } else {
                int i24 = r13 ? 2131749428 : 2131752351;
                int i25 = tL_premium_boostsStatus4.next_level_boosts;
                int i26 = tL_premium_boostsStatus4.boosts;
                str = cd.a0(null, null, i24, cd.G(i25 - i26, "MoreBoosts", Integer.valueOf(i25 - i26)), cd.G(q0Var.T1.level + 1, "BoostStories", new Object[0]));
            }
        } else if (i19 == 20) {
            str = cd.a0(null, null, r13 ? 2131749427 : 2131752349, Integer.valueOf(q0Var.j1()));
        } else if (i19 == 24) {
            str = cd.a0(null, null, r13 ? 2131749423 : 2131752346, Integer.valueOf(q0Var.j1()));
        } else if (i19 == 29) {
            str = cd.a0(null, null, 2131749426, Integer.valueOf(r12.y5));
        } else if (i19 == 30) {
            str = cd.a0(null, null, 2131752343, Integer.valueOf(r12.A4));
        } else if (i19 == 35) {
            str = cd.a0(null, null, 2131752350, Integer.valueOf(r12.B4));
        } else if (i19 == 25) {
            str = cd.a0(null, null, r13 ? 2131749424 : 2131752347, Integer.valueOf(r13 ? r12.x5 : r12.t5));
        } else if (i19 == 26) {
            str = cd.a0(null, null, r13 ? 2131749419 : 2131752341, Integer.valueOf(r13 ? r12.x5 : r12.t5));
        } else if (i19 == 27) {
            str = cd.a0(null, null, r13 ? 2131749421 : 2131752344, Integer.valueOf(r12.r5));
        } else if (i19 == 28) {
            str = cd.a0(null, null, r13 ? 2131749422 : 2131752345, Integer.valueOf(r13 ? r12.w5 : r12.s5));
        } else if (i19 == 22) {
            str = cd.a0(null, null, r13 ? 2131749420 : 2131752342, Integer.valueOf(r13 ? r12.z5 : r12.u5));
        } else if (i19 == 23) {
            str = cd.a0(null, null, r13 ? 2131749425 : 2131752348, Integer.valueOf(r13 ? r12.A5 : r12.v5));
        } else if (i19 == 21) {
            int i27 = q0Var.J2;
            str = cd.G(i27, "ReactionReachLvlForReaction", Integer.valueOf(i27));
        } else if (i19 == 11) {
            if (q0Var.Q1) {
                if (w3.V(q0Var.G2)) {
                    arrayList9 = q0Var.t2;
                    if (arrayList9.size() == 1) {
                        arrayList12 = q0Var.t2;
                        G = cd.Z(2131749165, i5.p((TLRPC.User) arrayList12.get(0)));
                    } else {
                        arrayList10 = q0Var.t2;
                        int size = arrayList10.size();
                        arrayList11 = q0Var.t2;
                        G = cd.G(size, "InviteChannelRestrictedUsers", Integer.valueOf(arrayList11.size()));
                    }
                } else {
                    arrayList5 = q0Var.t2;
                    if (arrayList5.size() == 1) {
                        arrayList8 = q0Var.t2;
                        G = cd.Z(2131749130, i5.p((TLRPC.User) arrayList8.get(0)));
                    } else {
                        arrayList6 = q0Var.t2;
                        int size2 = arrayList6.size();
                        arrayList7 = q0Var.t2;
                        G = cd.G(size2, "InviteRestrictedUsers", Integer.valueOf(arrayList7.size()));
                    }
                }
            } else if (w3.V(q0Var.G2)) {
                arrayList17 = q0Var.t2;
                if (arrayList17.size() == 1) {
                    arrayList20 = q0Var.t2;
                    G = cd.Z(2131749168, i5.p((TLRPC.User) arrayList20.get(0)));
                } else {
                    arrayList18 = q0Var.t2;
                    int size3 = arrayList18.size();
                    arrayList19 = q0Var.t2;
                    G = cd.G(size3, "InviteChannelRestrictedUsers2", Integer.valueOf(arrayList19.size()));
                }
            } else {
                arrayList13 = q0Var.t2;
                if (arrayList13.size() == 1) {
                    arrayList16 = q0Var.t2;
                    G = cd.Z(2131749133, i5.p((TLRPC.User) arrayList16.get(0)));
                } else {
                    arrayList14 = q0Var.t2;
                    int size4 = arrayList14.size();
                    arrayList15 = q0Var.t2;
                    G = cd.G(size4, "InviteRestrictedUsers2", Integer.valueOf(arrayList15.size()));
                }
            }
            str2 = G;
            z10 = true;
            androidx.emoji2.text.p pVar = q0Var.E2;
            int i28 = pVar.b;
            int i29 = pVar.c;
            i10 = q0Var.o2;
            if (i19 != 3) {
                i10 = vp.r1(q0Var.a).P0.size() - 1;
            } else if (i19 == 7) {
                i10 = d20.c();
            } else if (i19 == 0) {
                ArrayList V0 = vp.r1(q0Var.a).V0(0);
                i11 = 1;
                int size5 = V0.size();
                int i30 = 0;
                for (int i31 = 0; i31 < size5; i31++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i31);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                        i30++;
                    }
                }
                i10 = i30;
                if (!d20.i(q0Var.a).q() || q0Var.F2) {
                    i10 = i29;
                    f7 = 1.0f;
                } else {
                    i10 = i10 < 0 ? i28 : i10;
                    if (i19 != 7) {
                        f10 = i10;
                        f11 = i29;
                    } else if (i10 > i28) {
                        f10 = i10 - i28;
                        f11 = i29 - i28;
                    } else {
                        f12 = 0.5f;
                        f7 = f12;
                    }
                    f12 = f10 / f11;
                    f7 = f12;
                }
                float f13 = i28 / i29;
                int i32 = (i19 != 18 || i19 == 20 || i19 == 24 || i19 == 25 || i19 == 26 || i19 == 29 || i19 == 22 || i19 == 23 || i19 == 19 || i19 == 30 || i19 == 35 || i19 == 21 || i19 == 27 || i19 == 28 || i19 == 32) ? i11 : 0;
                i10 = i32 != 0 ? 0 : i10;
                if ((i19 != 11 || i19 == 34) && !vp.r1(q0Var.a).A3()) {
                    arrayList21 = q0Var.v2;
                    if (arrayList21 != null) {
                        arrayList25 = q0Var.v2;
                    }
                    arrayList22 = q0Var.u2;
                    if (arrayList22 != null) {
                        arrayList23 = q0Var.u2;
                        int size6 = arrayList23.size();
                        arrayList24 = q0Var.t2;
                        i12 = i10;
                    }
                }
                i12 = i10;
                if (i19 != 31 || i19 == 34) {
                    i13 = 8;
                } else {
                    i13 = 8;
                    o0 o0Var = new o0(this, context, i20, i12, i29, f13, q0Var.I0);
                    q0Var.p2 = o0Var;
                    if (i32 != 0) {
                        tL_premium_boostsStatus2 = q0Var.T1;
                        if (tL_premium_boostsStatus2 != null) {
                            o0 o0Var2 = q0Var.p2;
                            tL_premium_boostsStatus3 = q0Var.T1;
                            h3 h3Var = q0Var.U1;
                            o0Var2.g(tL_premium_boostsStatus3, h3Var != null && h3Var.l);
                        }
                    } else {
                        o0Var.setBagePosition(f7);
                        q0Var.p2.setType(i19);
                        q0Var.p2.x.setVisibility(8);
                        if (z10) {
                            o0 o0Var3 = q0Var.p2;
                            o0Var3.I.setVisibility(8);
                            v vVar = o0Var3.e;
                            if (vVar != null) {
                                vVar.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(3.0f));
                            }
                            o0Var3.J = true;
                        } else if (d20.i(q0Var.a).q() || q0Var.F2) {
                            q0Var.p2.w.setVisibility(8);
                            if (i19 == 6) {
                                q0Var.p2.x.setText("2 GB");
                            } else {
                                q0Var.p2.x.setText(Integer.toString(i28));
                            }
                            z11 = false;
                            q0Var.p2.x.setVisibility(0);
                            i17 = 2;
                            if (i19 != i17 || i19 == 5) {
                                q0Var.p2.H = z11;
                            }
                            addView(q0Var.p2, b6.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                    }
                    i17 = 2;
                    z11 = false;
                    if (i19 != i17) {
                    }
                    q0Var.p2.H = z11;
                    addView(q0Var.p2, b6.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i19 == 31) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f0.c.c(getContext(), R.drawable.large_boosts));
                    frameLayout.addView(imageView, b6.e(-2, -2, 17));
                    int L = org.telegram.messenger.i0.L(79.0f);
                    int i33 = t6.Ci;
                    ShapeDrawable L2 = t6.L(L, t6.v0(i33));
                    w6 N = a7.N(i33);
                    frameLayout.setBackground(L2);
                    a7.k(frameLayout, L2, N, null, null);
                    addView(frameLayout, b6.t(79, 79, 1, 0, 23, 0, 0));
                }
                TextView textView = new TextView(context);
                this.a = textView;
                textView.setTypeface(org.telegram.messenger.i0.o());
                if (i19 == 31) {
                    this.a.setText(cd.K0(2131753600));
                } else if (i19 == 32) {
                    this.a.setText(q0Var.m1());
                } else if (i19 == 19) {
                    if (k2Var instanceof i50) {
                        this.a.setText(cd.K0(2131753353));
                    } else {
                        this.a.setText(q0Var.m1());
                    }
                } else if (i19 == 30) {
                    this.a.setText(q0Var.m1());
                } else if (i19 == 35) {
                    this.a.setText(cd.K0(2131743900));
                } else {
                    i14 = 18;
                    if (i19 == 18) {
                        tL_premium_boostsStatus = q0Var.T1;
                        if (tL_premium_boostsStatus.level == 0) {
                            this.a.setText(cd.K0(2131753529));
                        } else {
                            this.a.setText(cd.K0(2131753344));
                        }
                    } else if (i19 == 21) {
                        this.a.setText(cd.K0(2131746420));
                    } else if (i19 == 20) {
                        this.a.setText(cd.K0(2131753535));
                    } else if (i19 == 24) {
                        this.a.setText(cd.K0(2131753531));
                    } else if (i19 == 27) {
                        this.a.setText(cd.K0(2131753532));
                    } else {
                        if (i19 == 28) {
                            this.a.setText(cd.K0(2131753530));
                        } else if (i19 == 25) {
                            this.a.setText(cd.K0(2131753534));
                        } else if (i19 == 26) {
                            this.a.setText(cd.K0(2131753525));
                        } else {
                            if (i19 != 29) {
                                i15 = 22;
                                if (i19 == 22 || i19 == 23) {
                                    this.a.setText(cd.K0(2131753526));
                                } else if (i19 == 11) {
                                    if (q0Var.Q1) {
                                        this.a.setText(cd.K0(2131752402));
                                    } else {
                                        this.a.setText(cd.K0(2131752400));
                                    }
                                } else if (i19 == 34) {
                                    this.a.setText(cd.K0(2131752621));
                                } else if (i19 == 6) {
                                    this.a.setText(cd.K0(2131750828));
                                } else if (i19 != 14 || q0Var.P1 <= 1) {
                                    this.a.setText(cd.K0(2131748988));
                                } else {
                                    this.a.setText(cd.K0(2131751719));
                                }
                                this.a.setTextSize(1, 20.0f);
                                TextView textView2 = this.a;
                                int i34 = t6.G6;
                                a7.V(textView2, i34, q0Var.I0);
                                this.a.setGravity(17);
                                if (i19 != 19 || i19 == 32 || q0Var.s1()) {
                                    mg.b bVar = new mg.b(context);
                                    this.c = bVar;
                                    bVar.a(q0Var.U1.i, false);
                                    if (i19 == 32) {
                                        bVar.setVisibility(i13);
                                    }
                                    if (q0Var.W1) {
                                        addView(this.a, b6.t(-2, -2, 1, 0, z10 ? i13 : 22, 0, 0));
                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                        linearLayout.setOrientation(0);
                                        linearLayout.setClipChildren(false);
                                        FrameLayout frameLayout2 = new FrameLayout(getContext());
                                        int L3 = org.telegram.messenger.i0.L(14.0f);
                                        int i35 = t6.a7;
                                        a7.C(frameLayout2, t6.d0(L3, t6.w0(i35, q0Var.I0)), a7.N(i35), q0Var.I0);
                                        g9 g9Var = new g9(getContext());
                                        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
                                        TLRPC.Chat L0 = vp.r1(q0Var.a).L0(Long.valueOf(-q0Var.S1));
                                        r8 r8Var = new r8();
                                        r8Var.q(L0);
                                        g9Var.e(L0, r8Var);
                                        frameLayout2.addView(g9Var, b6.c(28.0f, 28));
                                        TextView textView3 = new TextView(getContext());
                                        if (L0 != null) {
                                            textView3.setText(L0.title);
                                        }
                                        textView3.setSingleLine(true);
                                        textView3.setMaxLines(1);
                                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                                        textView3.setTextSize(1, 13.0f);
                                        a7.V(textView3, i34, q0Var.I0);
                                        frameLayout2.addView(textView3, b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                        linearLayout.addView(frameLayout2, b6.t(-2, 28, 80, 18, 0, 18, 0));
                                        LayoutTransition layoutTransition = new LayoutTransition();
                                        layoutTransition.setDuration(100L);
                                        layoutTransition.enableTransitionType(4);
                                        linearLayout.setLayoutTransition(layoutTransition);
                                        linearLayout.addView(bVar, b6.t(-2, -2, 48, -30, 2, 18, 0));
                                        addView(linearLayout, b6.t(-2, 38, 17, 0, -4, 0, 12));
                                        e6.a(linearLayout);
                                        i16 = 1;
                                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: kg.n0
                                            public final /* synthetic */ p0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i16) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.k2 k2Var2 = this.b.e.C2;
                                                        if (k2Var2 != null) {
                                                            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                                                            i2Var.a = true;
                                                            k2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), i2Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        q0 q0Var2 = this.b.e;
                                                        q0Var2.o1.presentFragment(un.ha(q0Var2.S1));
                                                        q0Var2.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                        TextView textView4 = new TextView(context);
                                        this.b = textView4;
                                        textView4.setText(org.telegram.messenger.i0.W2(str2));
                                        this.b.setTextSize(i16, 14.0f);
                                        this.b.setGravity(i16);
                                        TextView textView5 = this.b;
                                        textView5.setLineSpacing(textView5.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                        if (i19 == i14) {
                                            a7.V(this.b, i34, q0Var.I0);
                                        } else if (q0Var.I0 instanceof th.b) {
                                            a7.V(this.b, t6.y6, q0Var.I0);
                                        } else {
                                            a7.V(this.b, i34, q0Var.I0);
                                        }
                                        if (i19 != 19) {
                                            addView(this.b, b6.t(-2, -2, 1, 24, -2, 24, 17));
                                        } else {
                                            addView(this.b, b6.t(-2, -2, 1, 24, 0, 24, 24));
                                        }
                                        if (i19 == 31) {
                                            ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(15.0f);
                                            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(6.0f);
                                            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(12.0f);
                                        }
                                        q0Var.F1();
                                        return;
                                    }
                                    LinearLayout linearLayout2 = new LinearLayout(context);
                                    this.d = linearLayout2;
                                    linearLayout2.setOrientation(0);
                                    this.d.setWeightSum(1.0f);
                                    this.d.addView(this.a, b6.p(-2, -2, 1.0f, 0));
                                    this.d.addView(bVar, b6.t(-2, -2, 48, 0, 2, 0, 0));
                                    addView(this.d, b6.t(-2, -2, 1, 12, z10 ? i13 : 22, 12, 9));
                                } else {
                                    addView(this.a, b6.t(-2, -2, 1, 0, z10 ? i13 : i15, 0, 10));
                                }
                                i16 = 1;
                                TextView textView42 = new TextView(context);
                                this.b = textView42;
                                textView42.setText(org.telegram.messenger.i0.W2(str2));
                                this.b.setTextSize(i16, 14.0f);
                                this.b.setGravity(i16);
                                TextView textView52 = this.b;
                                textView52.setLineSpacing(textView52.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                if (i19 == i14) {
                                }
                                if (i19 != 19) {
                                }
                                if (i19 == 31) {
                                }
                                q0Var.F1();
                                return;
                            }
                            this.a.setText(cd.K0(2131753533));
                        }
                        i15 = 22;
                        this.a.setTextSize(1, 20.0f);
                        TextView textView22 = this.a;
                        int i342 = t6.G6;
                        a7.V(textView22, i342, q0Var.I0);
                        this.a.setGravity(17);
                        if (i19 != 19) {
                        }
                        mg.b bVar2 = new mg.b(context);
                        this.c = bVar2;
                        bVar2.a(q0Var.U1.i, false);
                        if (i19 == 32) {
                        }
                        if (q0Var.W1) {
                        }
                    }
                    i15 = 22;
                    this.a.setTextSize(1, 20.0f);
                    TextView textView222 = this.a;
                    int i3422 = t6.G6;
                    a7.V(textView222, i3422, q0Var.I0);
                    this.a.setGravity(17);
                    if (i19 != 19) {
                    }
                    mg.b bVar22 = new mg.b(context);
                    this.c = bVar22;
                    bVar22.a(q0Var.U1.i, false);
                    if (i19 == 32) {
                    }
                    if (q0Var.W1) {
                    }
                }
                i15 = 22;
                i14 = 18;
                this.a.setTextSize(1, 20.0f);
                TextView textView2222 = this.a;
                int i34222 = t6.G6;
                a7.V(textView2222, i34222, q0Var.I0);
                this.a.setGravity(17);
                if (i19 != 19) {
                }
                mg.b bVar222 = new mg.b(context);
                this.c = bVar222;
                bVar222.a(q0Var.U1.i, false);
                if (i19 == 32) {
                }
                if (q0Var.W1) {
                }
            }
            i11 = 1;
            if (d20.i(q0Var.a).q()) {
            }
            i10 = i29;
            f7 = 1.0f;
            float f132 = i28 / i29;
            if (i19 != 18) {
            }
            if (i32 != 0) {
            }
            if (i19 != 11) {
            }
            arrayList21 = q0Var.v2;
            if (arrayList21 != null) {
            }
            arrayList22 = q0Var.u2;
            if (arrayList22 != null) {
            }
            i12 = i10;
            if (i19 != 31) {
            }
            i13 = 8;
            if (i19 == 31) {
            }
            TextView textView6 = new TextView(context);
            this.a = textView6;
            textView6.setTypeface(org.telegram.messenger.i0.o());
            if (i19 == 31) {
            }
            i15 = 22;
            i14 = 18;
            this.a.setTextSize(1, 20.0f);
            TextView textView22222 = this.a;
            int i342222 = t6.G6;
            a7.V(textView22222, i342222, q0Var.I0);
            this.a.setGravity(17);
            if (i19 != 19) {
            }
            mg.b bVar2222 = new mg.b(context);
            this.c = bVar2222;
            bVar2222.a(q0Var.U1.i, false);
            if (i19 == 32) {
            }
            if (q0Var.W1) {
            }
        } else if (i19 == 34) {
            arrayList = q0Var.t2;
            if (arrayList.size() == 1) {
                arrayList4 = q0Var.t2;
                str = cd.Z(2131749173, i5.p((TLRPC.User) arrayList4.get(0)));
            } else {
                arrayList2 = q0Var.t2;
                int size7 = arrayList2.size();
                arrayList3 = q0Var.t2;
                str = cd.G(size7, "InviteCallRestrictedUsers", Integer.valueOf(arrayList3.size()));
            }
        } else if (A3) {
            str = (String) q0Var.E2.f;
        } else {
            str = (String) ((d20.i(q0Var.a).q() || q0Var.F2) ? q0Var.E2.e : q0Var.E2.d);
        }
        str2 = str;
        z10 = A3;
        androidx.emoji2.text.p pVar2 = q0Var.E2;
        int i282 = pVar2.b;
        int i292 = pVar2.c;
        i10 = q0Var.o2;
        if (i19 != 3) {
        }
        i11 = 1;
        if (d20.i(q0Var.a).q()) {
        }
        i10 = i292;
        f7 = 1.0f;
        float f1322 = i282 / i292;
        if (i19 != 18) {
        }
        if (i32 != 0) {
        }
        if (i19 != 11) {
        }
        arrayList21 = q0Var.v2;
        if (arrayList21 != null) {
        }
        arrayList22 = q0Var.u2;
        if (arrayList22 != null) {
        }
        i12 = i10;
        if (i19 != 31) {
        }
        i13 = 8;
        if (i19 == 31) {
        }
        TextView textView62 = new TextView(context);
        this.a = textView62;
        textView62.setTypeface(org.telegram.messenger.i0.o());
        if (i19 == 31) {
        }
        i15 = 22;
        i14 = 18;
        this.a.setTextSize(1, 20.0f);
        TextView textView222222 = this.a;
        int i3422222 = t6.G6;
        a7.V(textView222222, i3422222, q0Var.I0);
        this.a.setGravity(17);
        if (i19 != 19) {
        }
        mg.b bVar22222 = new mg.b(context);
        this.c = bVar22222;
        bVar22222.a(q0Var.U1.i, false);
        if (i19 == 32) {
        }
        if (q0Var.W1) {
        }
    }
}
