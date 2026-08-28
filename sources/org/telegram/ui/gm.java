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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gm implements org.telegram.ui.Components.eg {
    public int a;
    public boolean b;
    public final /* synthetic */ qn c;

    public gm(qn qnVar) {
        this.c = qnVar;
    }

    @Override // org.telegram.ui.Components.eg
    public final TLRPC.TL_channels_sendAsPeers A() {
        return this.c.da;
    }

    @Override // org.telegram.ui.Components.eg
    public final void B(float f10, int i9) {
        uk ukVar = this.c.X2;
        if (ukVar != null) {
            ukVar.e(f10, i9);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void G() {
        qn qnVar = this.c;
        ak akVar = qnVar.U;
        boolean z10 = akVar.u3;
        org.telegram.ui.Components.uf ufVar = akVar.Q0;
        boolean z11 = false;
        boolean z12 = ufVar != null && ufVar.getCurrentPage() == 0;
        td.a aVar = qnVar.tc;
        if (z10 && !z12) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0() {
        qn qnVar = this.c;
        int sendingMessageId = qnVar.getSendMessagesHelper().getSendingMessageId(qnVar.P5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void J1() {
        org.telegram.ui.Components.ux0 ux0Var = this.c.Z0;
        if (ux0Var != null) {
            ux0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void K1(int i9) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        qn qnVar = this.c;
        if (i9 < currentActionBarHeight) {
            qnVar.V4 = false;
            if (qnVar.Z0.getVisibility() == 0) {
                qnVar.Z0.setVisibility(4);
            }
        } else {
            qnVar.V4 = true;
            if (qnVar.Z0.getVisibility() == 4 && !qnVar.isInPreviewMode()) {
                qnVar.Z0.setVisibility(0);
            }
        }
        qnVar.W4 = true ^ qnVar.U.s0();
        int i10 = i9 + (qnVar.U.s0() ? 65536 : 0);
        if (this.a != i10) {
            qnVar.X = 0;
        }
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.eg
    public final void L0(int i9) {
        int i10 = i9 == 0 ? 8 : 0;
        qn qnVar = this.c;
        if (qnVar.Y2.getVisibility() != i10) {
            qnVar.Y2.setVisibility(i10);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final int N0() {
        return this.c.T0.getHeight();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void Q() {
        org.telegram.ui.Components.ux0 ux0Var = this.c.Z0;
        if (ux0Var != null) {
            ux0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void Q1() {
        im imVar;
        int indexOfChild;
        qn qnVar = this.c;
        if (qnVar.getParentActivity() != null) {
            if ((qnVar.e == null && qnVar.W7 == null) || qnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.s30 s30Var = qnVar.b2;
            if ((s30Var == null || s30Var.getVisibility() != 0) && (indexOfChild = (imVar = qnVar.T0).indexOfChild(qnVar.O)) != -1) {
                try {
                    qnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (qnVar.b2 == null) {
                    org.telegram.ui.Components.s30 s30Var2 = new org.telegram.ui.Components.s30(9, qnVar.getParentActivity(), qnVar.aa, false);
                    qnVar.b2 = s30Var2;
                    s30Var2.setVisibility(8);
                    imVar.addView(qnVar.b2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = qnVar.W7;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    qnVar.b2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(qnVar.U.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, qnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(qnVar.e) || ChatObject.canSendRoundVideo(qnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(qnVar.e, 20)) {
                        qnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.e, 21)) {
                        qnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.e, 7)) {
                        qnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = qnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            qnVar.b2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            qnVar.b2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(qnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (qnVar.K6()) {
                        return;
                    }
                    if (qnVar.U.Y0) {
                        qnVar.b2.setText(ChatObject.getRestrictedErrorText(qnVar.e, 21));
                    } else {
                        qnVar.b2.setText(ChatObject.getRestrictedErrorText(qnVar.e, 20));
                    }
                }
                View sendButton = qnVar.U.getSendButton();
                View audioVideoButtonContainer = qnVar.U.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                qnVar.b2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final gn T() {
        return this.c.h5;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void T1(boolean z10) {
        qn qnVar = this.c;
        View view = qnVar.s2;
        if (view != null) {
            view.setVisibility(8);
        }
        qnVar.X4 = !z10;
    }

    @Override // org.telegram.ui.Components.eg
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
        qn qnVar = this.c;
        if (qnVar.X2 == null && CameraView.isCameraAllowed() && qnVar.getParentActivity() != null) {
            uk ukVar = new uk(qnVar, qnVar.getParentActivity(), qnVar, qnVar.aa);
            qnVar.X2 = ukVar;
            ukVar.setClipToPadding(false);
            uk ukVar2 = qnVar.X2;
            ig.a aVar = qnVar.F;
            xi xiVar = qnVar.w;
            LinearLayout linearLayout = ukVar2.N0;
            kg.d c10 = aVar.c(linearLayout, xiVar, false);
            c10.o(AndroidUtilities.dp(6.0f));
            c10.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c10);
            int indexOfChild = qnVar.T0.indexOfChild(qnVar.O);
            if (indexOfChild < 0) {
                indexOfChild = qnVar.T0.getChildCount();
            }
            qnVar.T0.addView(qnVar.X2, Math.min(indexOfChild + 1, qnVar.T0.getChildCount()), g7.e6.e(-1, -1, 51));
        }
        uk ukVar3 = qnVar.X2;
        if (ukVar3 != null) {
            if (i9 == 0) {
                ukVar3.l(false);
                qnVar.t0.B0();
                qnVar.w0.T();
            } else if (i9 == 1 || i9 == 3 || i9 == 4) {
                ukVar3.k(i9, i10, i11, j10, j11, z10);
            } else if (i9 == 2 || i9 == 5) {
                ukVar3.d(i9 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean X0() {
        uk ukVar = this.c.X2;
        return (ukVar == null || ukVar.a0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void X1() {
        qn qnVar = this.c;
        wi wiVar = qnVar.c2;
        if (wiVar != null) {
            wiVar.b(true);
        }
        org.telegram.ui.Components.s30 s30Var = qnVar.e2;
        if (s30Var != null) {
            s30Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.s30 s30Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        qn qnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || qnVar.U.q0());
        tj tjVar = qnVar.E1;
        if (tjVar == null || tjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            qnVar.E1.getAdapter().U(charSequence2, qnVar.U.getCursorPosition(), qnVar.q6, false, false);
        }
        fm fmVar = qnVar.F5;
        if (fmVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fmVar);
            qnVar.F5 = null;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ak akVar = qnVar.U;
            if (akVar.T2 && (!akVar.q0() || !qnVar.U.V1)) {
                if (z10) {
                    qnVar.Ya(charSequence2, true);
                } else {
                    qnVar.M6(charSequence2);
                    fm fmVar2 = new fm(0, this, charSequence2);
                    qnVar.F5 = fmVar2;
                    AndroidUtilities.runOnUIThread(fmVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        lk lkVar = qnVar.ta;
        if (lkVar != null) {
            ArrayList arrayList = lkVar.B;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((oy) arrayList.get(i9)).n = true;
            }
        }
        hg.n0 n0Var = hg.n0.B;
        if (n0Var != null) {
            n0Var.l = true;
        }
        hg.n0 n0Var2 = hg.n0.C;
        if (n0Var2 != null) {
            n0Var2.l = true;
        }
        if (z11) {
            return;
        }
        wi wiVar = qnVar.c2;
        if ((wiVar != null && wiVar.getVisibility() == 0) || ((s30Var = qnVar.e2) != null && s30Var.getVisibility() == 0)) {
            wi wiVar2 = qnVar.c2;
            if (wiVar2 != null) {
                wiVar2.b(true);
            }
            org.telegram.ui.Components.s30 s30Var2 = qnVar.e2;
            if (s30Var2 != null) {
                s30Var2.b(true);
                return;
            }
            return;
        }
        gf gfVar = qnVar.Ja;
        if (UserObject.isUserSelf(qnVar.f) || ((chatFull = qnVar.V7) != null && chatFull.slowmode_next_send_date > 0 && qnVar.N3 == 0)) {
            z12 = true;
        }
        if (qnVar.f2 || qnVar.d2 || z12 || SharedConfig.scheduledHintShows >= 3 || qnVar.U.q0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(gfVar);
        AndroidUtilities.runOnUIThread(gfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.eg
    public final void c() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.eg
    public final void c1() {
        uk ukVar = this.c.X2;
        if (ukVar != null) {
            ukVar.q();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void c2() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar.j0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = qnVar.d0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = qnVar.e0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = qnVar.a0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        wr wrVar = qnVar.Z;
        if (wrVar != null) {
            wrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void d2() {
        qn qnVar = this.c;
        ih.u2 u2Var = qnVar.F1;
        if (u2Var != null) {
            u2Var.I1(null, 0);
        }
        qnVar.X9();
    }

    @Override // org.telegram.ui.Components.eg
    public final void e() {
        org.telegram.ui.Components.ux0 ux0Var = this.c.Z0;
        if (ux0Var != null) {
            ux0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean f1() {
        qn qnVar = this.c;
        TLRPC.User user = qnVar.f;
        return (user == null || UserObject.isUserSelf(user) || qnVar.f.bot || qnVar.h != null || qnVar.N3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean g() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.eg
    public final void h0() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar.j0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = qnVar.e0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(qnVar.U.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = qnVar.d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = qnVar.a0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            wr wrVar = qnVar.Z;
            if (wrVar != null) {
                wrVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void h1() {
        int i9;
        qn qnVar = this.c;
        Activity parentActivity = qnVar.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        long j10 = qnVar.P5;
        MessageSuggestionParams messageSuggestionParams = qnVar.c5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new gh.t0(parentActivity, i9, j10, messageSuggestionParams, qnVar, qnVar.getResourceProvider(), 0, new se(qnVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.eg
    public final void i1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.eg
    public final int j() {
        return this.c.T0.R();
    }

    @Override // org.telegram.ui.Components.eg
    public final void j1() {
        int i9;
        int i10;
        qn qnVar = this.c;
        qnVar.W6();
        ak akVar = qnVar.U;
        boolean z10 = akVar.u3;
        org.telegram.ui.Components.uf ufVar = akVar.Q0;
        qnVar.tc.a(z10 && !(ufVar != null && ufVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
            if (gcVar != null && gcVar.l) {
                gcVar.b();
            }
        } else {
            Activity parentActivity2 = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i9);
        }
        tj tjVar = qnVar.E1;
        float f10 = 0.0f;
        if (tjVar != null) {
            tjVar.animate().alpha((z10 || qnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.gr.f).start();
        }
        org.telegram.ui.Components.ux0 ux0Var = qnVar.Z0;
        if (ux0Var != null) {
            ux0Var.setVisibility(0);
            ViewPropertyAnimator animate = qnVar.Z0.animate();
            if (!z10 && !qnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.gr.f).withEndAction(new eh.f(24, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void k1(View view, CharSequence charSequence, boolean z10) {
        qn qnVar = this.c;
        qnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = qnVar.d0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        qnVar.d0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = qnVar.a0;
        if (yVar != null) {
            yVar.f(8);
        }
        wr wrVar = qnVar.Z;
        if (wrVar != null) {
            wrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void m1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void n() {
        boolean z10;
        qn qnVar = this.c;
        if (qnVar.u0 != null) {
            qnVar.X = qnVar.U.getBackgroundTop();
        }
        tj tjVar = qnVar.E1;
        if (tjVar != null) {
            tjVar.getAdapter().b0 = true;
        }
        if (qnVar.l5 != null) {
            AndroidUtilities.runOnUIThread(new ri(this, 6), 30L);
        }
        if (qnVar.U.s0()) {
            qnVar.U.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.U.V0(true, true, z10);
        if (qnVar.k5 != 0) {
            qnVar.getConnectionsManager().cancelRequest(qnVar.k5, true);
            qnVar.k5 = 0;
        }
        qnVar.yc(0, true);
        qnVar.hc(false);
        qnVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n0() {
        int i9;
        qn qnVar = this.c;
        if ((qnVar.getMessagesController().isForum(qnVar.a()) && !qnVar.d4) || (i9 = qnVar.N3) == 9 || qnVar.O3 <= 0) {
            return false;
        }
        if (i9 != 0) {
            return i9 == 3 && qnVar.I8() == qnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.b5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void o(float f10) {
        qn qnVar = this.c;
        if (f10 != 0.0f) {
            qnVar.z4 = true;
        }
        qnVar.o9();
        qnVar.r9();
        qnVar.Mc(false, false);
        qnVar.T0.invalidate();
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar == null || qnVar.Vb == null) {
            return;
        }
        gcVar.l();
    }

    @Override // org.telegram.ui.Components.eg
    public final void p(boolean z10) {
        int i9;
        int i10;
        qn qnVar = this.c;
        if (!z10) {
            Activity parentActivity = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i9);
        } else {
            Activity parentActivity2 = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i10);
            qnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void p0(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.c;
        if (qnVar.e0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.ux0 ux0Var = qnVar.Z0;
        if (ux0Var != null) {
            ux0Var.e();
        }
        final int i11 = 1;
        final int i12 = 0;
        if (i10 - i9 > 0) {
            org.telegram.ui.ActionBar.y yVar = qnVar.e0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (qnVar.e0.l != 0) {
                    if (!(qnVar.N3 == 3 && qnVar.I8() == qnVar.getUserConfig().getClientUserId()) && (qnVar.N3 != 0 || (!(qnVar.Z3 == 0 || qnVar.d4) || UserObject.isReplyUser(qnVar.f) || qnVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
                        ofFloat.addListener(new em(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.dm
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
                        ofFloat.start();
                    } else {
                        qnVar.e0.f(0);
                        qn.J3(qnVar);
                        org.telegram.ui.ActionBar.w0 w0Var = qnVar.d0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = qnVar.a0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        wr wrVar = qnVar.Z;
                        if (wrVar != null) {
                            wrVar.b(false);
                        }
                    }
                }
            }
            qnVar.w4 = i9;
            qnVar.x4 = i10;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = qnVar.e0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(qnVar.N3 == 3 && qnVar.I8() == qnVar.getUserConfig().getClientUserId()) && (qnVar.N3 != 0 || (!(qnVar.Z3 == 0 || qnVar.d4) || UserObject.isReplyUser(qnVar.f) || qnVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.gr.f);
                    ofFloat2.addListener(new em(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.dm
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i11) {
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
                qnVar.e0.f(8);
                if (qnVar.U.j0() && TextUtils.isEmpty(qnVar.U.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = qnVar.d0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = qnVar.a0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    wr wrVar2 = qnVar.Z;
                    if (wrVar2 != null) {
                        wrVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = qnVar.d0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = qnVar.a0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                wr wrVar3 = qnVar.Z;
                if (wrVar3 != null) {
                    wrVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void q1() {
        int i9;
        qn qnVar = this.c;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        BotForumHelper.getInstance(i9).stopStreaming(qnVar.P5, (int) qnVar.b());
        qnVar.c7(true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void t0() {
        qn qnVar = this.c;
        qnVar.k9 = true;
        bm bmVar = qnVar.w0;
        if (bmVar != null) {
            bmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void u() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
        int i9;
        int i10;
        qn qnVar = this.c;
        if (qnVar.z9() || (i9 = qnVar.N3) == 6 || i9 == 8) {
            return;
        }
        MessagesController messagesController = qnVar.getMessagesController();
        long j10 = qnVar.P5;
        long j11 = qnVar.Z3;
        i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i10);
    }

    @Override // org.telegram.ui.Components.eg
    public final void x0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.eg
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        of.b1 b1Var;
        MessageObject messageObject;
        int i11;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        qn qnVar = this.c;
        ArrayList arrayList = qnVar.q6;
        if (qnVar.u0 != null) {
            qnVar.X = qnVar.U.getBackgroundTop();
        }
        tj tjVar = qnVar.E1;
        if (tjVar != null && tjVar.getAdapter() != null) {
            qnVar.E1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i9 != 0) {
            if (qnVar.O3 == -1) {
                qnVar.O3 = 0;
            }
            if (charSequence != null) {
                qnVar.O3++;
            }
            MessagePreviewParams messagePreviewParams2 = qnVar.b5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                qnVar.O3 += qnVar.b5.forwardMessages.messages.size();
            }
            qnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = qnVar.b5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && qnVar.b5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            qnVar.b5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = qnVar.getMessagesController().getPeer(qnVar.P5);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    z11 = z12;
                    break;
                }
                MessageObject messageObject2 = arrayList2.get(i12);
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (z11) {
                org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(qnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.pi0 pi0Var = ((org.telegram.ui.Components.dc) M.e).a;
                pi0Var.setScaleX(1.8f);
                pi0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(qnVar.e) && !qnVar.d4 && (messageObject = qnVar.j5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                topicId = MessageObject.getTopicId(i11, qnVar.j5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                qnVar.getMediaDataController().cleanDraft(qnVar.P5, j11, false);
            }
        }
        qnVar.zb(false, null, null, null, null, z10, i9, null, false, j10, null, true);
        ak akVar = qnVar.U;
        if (akVar != null && akVar.getEmojiView() != null && (b1Var = qnVar.U.getEmojiView().P0) != null) {
            if (b1Var.e) {
                MessagesController.getInstance(b1Var.a).sendTyping(b1Var.b, b1Var.c, 2, 0);
            }
            b1Var.f = -1L;
        }
        if (qnVar.getMessagesController().premiumFeaturesBlocked() || qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || qnVar.getMessagesController().didPressTranscribeButtonEnough() || qnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.i21.u(messageObject3, true);
            }
        }
    }
}
