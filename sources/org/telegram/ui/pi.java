package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pi implements org.telegram.ui.Components.dj0 {
    public final /* synthetic */ cn a;

    public pi(cn cnVar) {
        this.a = cnVar;
    }

    @Override // org.telegram.ui.Components.dj0
    public final void f(float f10, float f11, int i7, View view) {
        boolean z9;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.messenger.ij messageObject2;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        cn cnVar = this.a;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        if (z9) {
            return;
        }
        cnVar.P4 = true;
        boolean z10 = view instanceof org.telegram.ui.Cells.t0;
        if (z10 && (messageObject2 = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            TLRPC.MessageAction messageAction = messageObject2.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                if (tL_messageActionWalletTonConnectRequest.expires <= cnVar.getConnectionsManager().getCurrentTime() || messageObject2.N3() || org.telegram.messenger.ij.B0(messageObject2.k) != 777000) {
                    return;
                }
                Activity parentActivity = cnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                int e12 = messageObject2.e1();
                g6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                org.telegram.ui.Wallet.d2.q(parentActivity, i10, j3, e12, g6Var, null);
                return;
            }
        }
        boolean z11 = false;
        if (z10) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            if (t0Var.getMessageObject().j0) {
                if (cnVar.kb) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = t0Var.getMessageObject().k.date;
                bundle.putLong("dialog_id", cnVar.j6);
                bundle.putLong("topic_id", cnVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                h8 h8Var = new h8(0, i11, bundle);
                h8Var.N = cnVar;
                cnVar.presentFragment(h8Var);
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
            if (t0Var2.getMessageObject() != null && (t0Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                cnVar.getNotificationCenter().k(org.telegram.messenger.qs.n3, Long.valueOf(cnVar.j6));
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
            if (t0Var3.getMessageObject() != null && (t0Var3.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                org.telegram.messenger.g0.i3(new bg.m0(this, t0Var3.getMessageObject().N1(), 23), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar.w() || cnVar.X9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (cnVar.s9.z(q1Var2.getMessageObject())) {
                    return;
                } else {
                    z11 = !q1Var2.B2(f10);
                }
            }
            cn.k2(cnVar, view, z11, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1) || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) == null || messageObject.D != 27) {
            cnVar.Y7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.Y5();
        messageObject.K1 = true;
        q1Var.G1();
        view.requestLayout();
        if (i7 >= 0) {
            cnVar.C0.g(i7);
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public final boolean f1(View view) {
        boolean z9;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        cn cnVar = this.a;
        if (!cnVar.W9() && (!((z9 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).P2())) {
            String Q = cnVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cnVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                boolean z10 = cnVar.j6 >= 0;
                if (!z10 && (chatFull = cnVar.p8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z10 = org.telegram.messenger.t3.w0(chatFull, Q);
                }
                if (z10) {
                    if (z9) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.t0) {
                        messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.j0 && !messageObject.o4() && messageObject.z() && !messageObject.Y2()) {
                        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                        if (!kVar.w() && !cnVar.z() && !cnVar.c() && !messageObject.r4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dj0
    public final void r0(View view, float f10, float f11) {
        org.telegram.messenger.ij messageObject;
        boolean z9;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        cn cnVar = this.a;
        if (cnVar.getParentActivity() == null || cnVar.z() || cnVar.c() || cnVar.isInPreviewMode() || cnVar.W9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.t0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
            if (messageObject.j0) {
                return;
            }
        }
        org.telegram.messenger.ij ijVar = messageObject;
        if ((ijVar.k instanceof TLRPC.TL_message_secret) || !ijVar.z() || ijVar.g3() || ijVar.D == 27) {
            return;
        }
        TLRPC.Chat chat = cnVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.w(26, cnVar.e)) {
            ch.k0.b(false);
            String Q = cnVar.getMediaDataController().Q();
            if (Q.startsWith("animated_")) {
                z9 = cnVar.j6 >= 0;
                if (!z9 && (chatFull2 = cnVar.p8) != null) {
                    z9 = org.telegram.messenger.t3.w0(chatFull2, Q);
                }
                if (z9) {
                    cnVar.Db(view, ijVar, null, null, f10, f11, ch.o0.b(Q), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cnVar.getMediaDataController().r.get(Q);
            if (tL_availableReaction == null || ijVar.r4()) {
                return;
            }
            z9 = cnVar.j6 >= 0;
            if (!z9 && (chatFull = cnVar.p8) != null) {
                z9 = org.telegram.messenger.t3.w0(chatFull, tL_availableReaction.reaction);
            }
            if (z9) {
                cnVar.Db(view, ijVar, null, null, f10, f11, ch.o0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}
