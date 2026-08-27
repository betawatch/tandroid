package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hm implements org.telegram.ui.Components.ag {
    public int a;
    public boolean b;
    public final /* synthetic */ rn c;

    public hm(rn rnVar) {
        this.c = rnVar;
    }

    @Override // org.telegram.ui.Components.ag
    public final void A(float f10, int i10) {
        wk wkVar = this.c.X2;
        if (wkVar != null) {
            wkVar.e(f10, i10);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void F() {
        rn rnVar = this.c;
        ck ckVar = rnVar.U;
        boolean z10 = ckVar.u3;
        org.telegram.ui.Components.qf qfVar = ckVar.Q0;
        boolean z11 = false;
        boolean z12 = qfVar != null && qfVar.getCurrentPage() == 0;
        ud.a aVar = rnVar.tc;
        if (z10 && !z12) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.ag
    public final void G(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.ag
    public final void I0() {
        rn rnVar = this.c;
        int sendingMessageId = rnVar.getSendMessagesHelper().getSendingMessageId(rnVar.P5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void N() {
        org.telegram.ui.Components.wx0 wx0Var = this.c.Z0;
        if (wx0Var != null) {
            wx0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void N0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        rn rnVar = this.c;
        if (rnVar.Y2.getVisibility() != i11) {
            rnVar.Y2.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void N1() {
        org.telegram.ui.Components.wx0 wx0Var = this.c.Z0;
        if (wx0Var != null) {
            wx0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final hn P() {
        return this.c.h5;
    }

    @Override // org.telegram.ui.Components.ag
    public final int P0() {
        return this.c.T0.getHeight();
    }

    @Override // org.telegram.ui.Components.ag
    public final void S1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        rn rnVar = this.c;
        if (i10 < currentActionBarHeight) {
            rnVar.V4 = false;
            if (rnVar.Z0.getVisibility() == 0) {
                rnVar.Z0.setVisibility(4);
            }
        } else {
            rnVar.V4 = true;
            if (rnVar.Z0.getVisibility() == 4 && !rnVar.isInPreviewMode()) {
                rnVar.Z0.setVisibility(0);
            }
        }
        rnVar.W4 = true ^ rnVar.U.t0();
        int i11 = i10 + (rnVar.U.t0() ? 65536 : 0);
        if (this.a != i11) {
            rnVar.X = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final void U1() {
        jm jmVar;
        int indexOfChild;
        rn rnVar = this.c;
        if (rnVar.getParentActivity() != null) {
            if ((rnVar.e == null && rnVar.W7 == null) || rnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.x30 x30Var = rnVar.b2;
            if ((x30Var == null || x30Var.getVisibility() != 0) && (indexOfChild = (jmVar = rnVar.T0).indexOfChild(rnVar.O)) != -1) {
                try {
                    rnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (rnVar.b2 == null) {
                    org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(9, rnVar.getParentActivity(), rnVar.aa, false);
                    rnVar.b2 = x30Var2;
                    x30Var2.setVisibility(8);
                    jmVar.addView(rnVar.b2, indexOfChild + 1, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = rnVar.W7;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    rnVar.b2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(rnVar.U.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, rnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(rnVar.e) || ChatObject.canSendRoundVideo(rnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(rnVar.e, 20)) {
                        rnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(rnVar.e, 21)) {
                        rnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(rnVar.e, 7)) {
                        rnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = rnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            rnVar.b2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            rnVar.b2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(rnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (rnVar.K6()) {
                        return;
                    }
                    if (rnVar.U.Y0) {
                        rnVar.b2.setText(ChatObject.getRestrictedErrorText(rnVar.e, 21));
                    } else {
                        rnVar.b2.setText(ChatObject.getRestrictedErrorText(rnVar.e, 20));
                    }
                }
                View sendButton = rnVar.U.getSendButton();
                View audioVideoButtonContainer = rnVar.U.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                rnVar.b2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void W1(boolean z10) {
        rn rnVar = this.c;
        View view = rnVar.s2;
        if (view != null) {
            view.setVisibility(8);
        }
        rnVar.X4 = !z10;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean X0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        rn rnVar = this.c;
        if (rnVar.X2 == null && CameraView.isCameraAllowed() && rnVar.getParentActivity() != null) {
            wk wkVar = new wk(rnVar, rnVar.getParentActivity(), rnVar, rnVar.aa);
            rnVar.X2 = wkVar;
            wkVar.setClipToPadding(false);
            wk wkVar2 = rnVar.X2;
            jg.a aVar = rnVar.F;
            zi ziVar = rnVar.w;
            LinearLayout linearLayout = wkVar2.N0;
            lg.d c10 = aVar.c(linearLayout, ziVar, false);
            c10.o(AndroidUtilities.dp(6.0f));
            c10.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c10);
            int indexOfChild = rnVar.T0.indexOfChild(rnVar.O);
            if (indexOfChild < 0) {
                indexOfChild = rnVar.T0.getChildCount();
            }
            rnVar.T0.addView(rnVar.X2, Math.min(indexOfChild + 1, rnVar.T0.getChildCount()), h7.z5.e(-1, -1, 51));
        }
        wk wkVar3 = rnVar.X2;
        if (wkVar3 != null) {
            if (i10 == 0) {
                wkVar3.l(false);
                rnVar.t0.B0();
                rnVar.w0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                wkVar3.k(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                wkVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean b1() {
        wk wkVar = this.c.X2;
        return (wkVar == null || wkVar.a0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ag
    public final void c() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.ag
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.x30 x30Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        rn rnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || rnVar.U.r0());
        vj vjVar = rnVar.E1;
        if (vjVar == null || vjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            rnVar.E1.getAdapter().U(charSequence2, rnVar.U.getCursorPosition(), rnVar.q6, false, false);
        }
        o0.m mVar = rnVar.F5;
        if (mVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mVar);
            rnVar.F5 = null;
        }
        TLRPC.Chat chat = rnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ck ckVar = rnVar.U;
            if (ckVar.T2 && (!ckVar.r0() || !rnVar.U.V1)) {
                if (z10) {
                    rnVar.Ya(charSequence2, true);
                } else {
                    rnVar.M6(charSequence2);
                    o0.m mVar2 = new o0.m(this, charSequence2, false, 1);
                    rnVar.F5 = mVar2;
                    AndroidUtilities.runOnUIThread(mVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        nk nkVar = rnVar.ta;
        if (nkVar != null) {
            ArrayList arrayList = nkVar.B;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ry) arrayList.get(i10)).n = true;
            }
        }
        ig.m0 m0Var = ig.m0.B;
        if (m0Var != null) {
            m0Var.l = true;
        }
        ig.m0 m0Var2 = ig.m0.C;
        if (m0Var2 != null) {
            m0Var2.l = true;
        }
        if (z11) {
            return;
        }
        yi yiVar = rnVar.c2;
        if ((yiVar != null && yiVar.getVisibility() == 0) || ((x30Var = rnVar.e2) != null && x30Var.getVisibility() == 0)) {
            yi yiVar2 = rnVar.c2;
            if (yiVar2 != null) {
                yiVar2.b(true);
            }
            org.telegram.ui.Components.x30 x30Var2 = rnVar.e2;
            if (x30Var2 != null) {
                x30Var2.b(true);
                return;
            }
            return;
        }
        gf gfVar = rnVar.Ja;
        if (UserObject.isUserSelf(rnVar.f) || ((chatFull = rnVar.V7) != null && chatFull.slowmode_next_send_date > 0 && rnVar.N3 == 0)) {
            z12 = true;
        }
        if (rnVar.f2 || rnVar.d2 || z12 || SharedConfig.scheduledHintShows >= 3 || rnVar.U.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(gfVar);
        AndroidUtilities.runOnUIThread(gfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.ag
    public final void e() {
        org.telegram.ui.Components.wx0 wx0Var = this.c.Z0;
        if (wx0Var != null) {
            wx0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void e2() {
        rn rnVar = this.c;
        yi yiVar = rnVar.c2;
        if (yiVar != null) {
            yiVar.b(true);
        }
        org.telegram.ui.Components.x30 x30Var = rnVar.e2;
        if (x30Var != null) {
            x30Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void f1() {
        wk wkVar = this.c.X2;
        if (wkVar != null) {
            wkVar.q();
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean g() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.ag
    public final void g0() {
        org.telegram.ui.ActionBar.k kVar;
        rn rnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        if (kVar.j0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = rnVar.e0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(rnVar.U.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.v0 v0Var = rnVar.d0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = rnVar.a0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            xr xrVar = rnVar.Z;
            if (xrVar != null) {
                xrVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean g1() {
        rn rnVar = this.c;
        TLRPC.User user = rnVar.f;
        return (user == null || UserObject.isUserSelf(user) || rnVar.f.bot || rnVar.h != null || rnVar.N3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ag
    public final int i() {
        return this.c.T0.R();
    }

    @Override // org.telegram.ui.Components.ag
    public final void i1() {
        int i10;
        rn rnVar = this.c;
        Activity parentActivity = rnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
        long j10 = rnVar.P5;
        MessageSuggestionParams messageSuggestionParams = rnVar.c5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new hh.t0(parentActivity, i10, j10, messageSuggestionParams, rnVar, rnVar.getResourceProvider(), 0, new se(rnVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.ag
    public final void j1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.ag
    public final void k1() {
        int i10;
        int i11;
        rn rnVar = this.c;
        rnVar.W6();
        ck ckVar = rnVar.U;
        boolean z10 = ckVar.u3;
        org.telegram.ui.Components.qf qfVar = ckVar.Q0;
        rnVar.tc.a(z10 && !(qfVar != null && qfVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = rnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
            if (ecVar != null && ecVar.l) {
                ecVar.b();
            }
        } else {
            Activity parentActivity2 = rnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        vj vjVar = rnVar.E1;
        float f10 = 0.0f;
        if (vjVar != null) {
            vjVar.animate().alpha((z10 || rnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.er.f).start();
        }
        org.telegram.ui.Components.wx0 wx0Var = rnVar.Z0;
        if (wx0Var != null) {
            wx0Var.setVisibility(0);
            ViewPropertyAnimator animate = rnVar.Z0.animate();
            if (!z10 && !rnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.er.f).withEndAction(new fh.f(24, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ TLRPC.Peer l() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final void l1(View view, CharSequence charSequence, boolean z10) {
        rn rnVar = this.c;
        rnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = rnVar.d0;
        if (v0Var == null || v0Var.getVisibility() == 0) {
            return;
        }
        rnVar.d0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = rnVar.a0;
        if (yVar != null) {
            yVar.f(8);
        }
        xr xrVar = rnVar.Z;
        if (xrVar != null) {
            xrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void l2() {
        org.telegram.ui.ActionBar.k kVar;
        rn rnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        if (kVar.j0) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = rnVar.d0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = rnVar.e0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = rnVar.a0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        xr xrVar = rnVar.Z;
        if (xrVar != null) {
            xrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void m() {
        boolean z10;
        rn rnVar = this.c;
        if (rnVar.u0 != null) {
            rnVar.X = rnVar.U.getBackgroundTop();
        }
        vj vjVar = rnVar.E1;
        if (vjVar != null) {
            vjVar.getAdapter().b0 = true;
        }
        if (rnVar.l5 != null) {
            AndroidUtilities.runOnUIThread(new ti(this, 6), 30L);
        }
        if (rnVar.U.t0()) {
            rnVar.U.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        rnVar.U.U0(true, true, z10);
        if (rnVar.k5 != 0) {
            rnVar.getConnectionsManager().cancelRequest(rnVar.k5, true);
            rnVar.k5 = 0;
        }
        rnVar.yc(0, true);
        rnVar.hc(false);
        rnVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.ag
    public final void n(float f10) {
        rn rnVar = this.c;
        if (f10 != 0.0f) {
            rnVar.z4 = true;
        }
        rnVar.o9();
        rnVar.r9();
        rnVar.Mc(false, false);
        rnVar.T0.invalidate();
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
        if (ecVar == null || rnVar.Vb == null) {
            return;
        }
        ecVar.l();
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean n0() {
        int i10;
        rn rnVar = this.c;
        if ((rnVar.getMessagesController().isForum(rnVar.a()) && !rnVar.d4) || (i10 = rnVar.N3) == 9 || rnVar.O3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && rnVar.I8() == rnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ag
    public final void n1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.ag
    public final void o0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        rn rnVar = this.c;
        if (rnVar.e0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.wx0 wx0Var = rnVar.Z0;
        if (wx0Var != null) {
            wx0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = rnVar.e0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (rnVar.e0.l != 0) {
                    if (!(rnVar.N3 == 3 && rnVar.I8() == rnVar.getUserConfig().getClientUserId()) && (rnVar.N3 != 0 || (!(rnVar.Z3 == 0 || rnVar.d4) || UserObject.isReplyUser(rnVar.f) || rnVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.er.f);
                        ofFloat.addListener(new gm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.fm
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    } else {
                        rnVar.e0.f(0);
                        rn.J3(rnVar);
                        org.telegram.ui.ActionBar.v0 v0Var = rnVar.d0;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = rnVar.a0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        xr xrVar = rnVar.Z;
                        if (xrVar != null) {
                            xrVar.b(false);
                        }
                    }
                }
            }
            rnVar.w4 = i10;
            rnVar.x4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = rnVar.e0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(rnVar.N3 == 3 && rnVar.I8() == rnVar.getUserConfig().getClientUserId()) && (rnVar.N3 != 0 || (!(rnVar.Z3 == 0 || rnVar.d4) || UserObject.isReplyUser(rnVar.f) || rnVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.er.f);
                    ofFloat2.addListener(new gm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.fm
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i12) {
                                case 0:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                                default:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    ofFloat2.start();
                    return;
                }
                rnVar.e0.f(8);
                if (rnVar.U.k0() && TextUtils.isEmpty(rnVar.U.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.d0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = rnVar.a0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    xr xrVar2 = rnVar.Z;
                    if (xrVar2 != null) {
                        xrVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var3 = rnVar.d0;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = rnVar.a0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                xr xrVar3 = rnVar.Z;
                if (xrVar3 != null) {
                    xrVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean o1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.b5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.ag
    public final void q0() {
        rn rnVar = this.c;
        rnVar.k9 = true;
        dm dmVar = rnVar.w0;
        if (dmVar != null) {
            dmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void q2() {
        rn rnVar = this.c;
        jh.t2 t2Var = rnVar.F1;
        if (t2Var != null) {
            t2Var.I1(null, 0);
        }
        rnVar.X9();
    }

    @Override // org.telegram.ui.Components.ag
    public final void r(boolean z10) {
        int i10;
        int i11;
        rn rnVar = this.c;
        if (!z10) {
            Activity parentActivity = rnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = rnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            rnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void r1() {
        int i10;
        rn rnVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(rnVar.P5, (int) rnVar.b());
        rnVar.c7(true);
    }

    @Override // org.telegram.ui.Components.ag
    public final void s() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.ag
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        org.telegram.ui.Components.ow owVar;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        rn rnVar = this.c;
        ArrayList arrayList = rnVar.q6;
        if (rnVar.u0 != null) {
            rnVar.X = rnVar.U.getBackgroundTop();
        }
        vj vjVar = rnVar.E1;
        if (vjVar != null && vjVar.getAdapter() != null) {
            rnVar.E1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (rnVar.O3 == -1) {
                rnVar.O3 = 0;
            }
            if (charSequence != null) {
                rnVar.O3++;
            }
            MessagePreviewParams messagePreviewParams2 = rnVar.b5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                rnVar.O3 += rnVar.b5.forwardMessages.messages.size();
            }
            rnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = rnVar.b5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && rnVar.b5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            rnVar.b5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = rnVar.getMessagesController().getPeer(rnVar.P5);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    z11 = z12;
                    break;
                }
                MessageObject messageObject2 = arrayList2.get(i13);
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (z11) {
                org.telegram.ui.Components.ec M = org.telegram.ui.Components.mc.a0(rnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.ri0 ri0Var = ((org.telegram.ui.Components.bc) M.e).a;
                ri0Var.setScaleX(1.8f);
                ri0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(rnVar.e) && !rnVar.d4 && (messageObject = rnVar.j5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, rnVar.j5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                rnVar.getMediaDataController().cleanDraft(rnVar.P5, j11, false);
            }
        }
        rnVar.yb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        ck ckVar = rnVar.U;
        if (ckVar != null && ckVar.getEmojiView() != null && (owVar = rnVar.U.getEmojiView().P0) != null) {
            if (owVar.e) {
                MessagesController.getInstance(owVar.a).sendTyping(owVar.b, owVar.c, 2, 0);
            }
            owVar.f = -1L;
        }
        if (rnVar.getMessagesController().premiumFeaturesBlocked() || rnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || rnVar.getMessagesController().didPressTranscribeButtonEnough() || rnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.k21.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final void w0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.ag
    public final void w1() {
        int i10;
        int i11;
        rn rnVar = this.c;
        if (rnVar.z9() || (i10 = rnVar.N3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = rnVar.getMessagesController();
        long j10 = rnVar.P5;
        long j11 = rnVar.Z3;
        i11 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.ag
    public final TLRPC.TL_channels_sendAsPeers y() {
        return this.c.da;
    }
}
