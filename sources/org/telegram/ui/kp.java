package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.v80 G;
    public org.telegram.ui.Cells.r8 H;
    public org.telegram.ui.Cells.e9 I;
    public org.telegram.ui.Cells.a7 J;
    public jp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public na O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.m4 R;
    public org.telegram.ui.Cells.w8 S;
    public org.telegram.ui.Cells.e9 T;
    public gp U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ci.h2 a;
    public boolean a0;
    public EditTextBoldCursor b;
    public boolean b0;
    public org.telegram.ui.Cells.e9 c;
    public boolean c0;
    public org.telegram.ui.Cells.m4 d;
    public boolean d0;
    public org.telegram.ui.Cells.m4 e;
    public org.telegram.ui.Cells.a7 e0;
    public ep f;
    public ArrayList f0;
    public org.telegram.ui.Cells.s4 g0;
    public xd h;
    public int h0;
    public String i0;
    public uh j0;
    public boolean k0;
    public TLRPC.TL_chatInviteExported l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.v0 n;
    public boolean n0;
    public HashMap o0;
    public org.telegram.ui.Components.r60 p0;
    public zo q0;
    public org.telegram.ui.Components.pr r;
    public ValueAnimator r0;
    public LinearLayout s;
    public Boolean s0;
    public boolean t0;
    public org.telegram.ui.Cells.j6 v;
    public org.telegram.ui.Cells.j6 w;
    public LinearLayout x;
    public LinearLayout y;

    public final void V() {
        if (!this.V && this.a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.n.setEnabled(false);
            this.n.setAlpha(0.5f);
            return;
        }
        this.n.setEnabled(true);
        this.n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str == null || str.length() <= 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        uh uhVar = this.j0;
        if (uhVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uhVar);
            this.j0 = null;
            this.i0 = null;
            if (this.h0 != 0) {
                getConnectionsManager().cancelRequest(this.h0, true);
            }
        }
        this.k0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.a0) {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.a0) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
            return false;
        }
        this.f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f.setTextColorByKey(org.telegram.ui.ActionBar.i6.F6);
        this.i0 = str;
        uh uhVar2 = new uh(9, this, str);
        this.j0 = uhVar2;
        AndroidUtilities.runOnUIThread(uhVar2, 300L);
        return true;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.u3(6, this, z10)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final kp kpVar = this;
        AndroidUtilities.runOnUIThread(kpVar.q0, 200L);
        boolean z13 = true;
        if (kpVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(kpVar.X, true);
            if (kpVar.V || (((publicUsername != null || kpVar.a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(kpVar.a.getText().toString()))) || kpVar.a.length() == 0 || kpVar.k0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = kpVar.V ? "" : kpVar.a.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!kpVar.V || (arrayList = kpVar.X.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (kpVar.t0) {
                        z10 = false;
                    } else {
                        kpVar.t0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < kpVar.X.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = kpVar.X.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(kpVar.X);
                            kpVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new xo(kpVar, 1));
                        } else {
                            kpVar.t0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = kpVar.X;
                        if (chat.noforwards != kpVar.b0) {
                            if (!ChatObject.isChannel(chat)) {
                                kpVar.a0(true);
                                final int i11 = 2;
                                kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), kpVar.Z, kpVar, new MessagesStorage.LongCallback(kpVar) { // from class: org.telegram.ui.yo
                                    public final /* synthetic */ kp b;

                                    {
                                        this.b = kpVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j3) {
                                        switch (i11) {
                                            case 0:
                                                kp kpVar2 = this.b;
                                                if (j3 == 0) {
                                                    kpVar2.getClass();
                                                    break;
                                                } else {
                                                    kpVar2.Z = j3;
                                                    kpVar2.X = kpVar2.getMessagesController().getChat(Long.valueOf(j3));
                                                    kpVar2.Y();
                                                    break;
                                                }
                                            case 1:
                                                kp kpVar3 = this.b;
                                                if (j3 == 0) {
                                                    kpVar3.getClass();
                                                    break;
                                                } else {
                                                    kpVar3.Z = j3;
                                                    kpVar3.X = kpVar3.getMessagesController().getChat(Long.valueOf(j3));
                                                    kpVar3.Y();
                                                    break;
                                                }
                                            default:
                                                kp kpVar4 = this.b;
                                                if (j3 == 0) {
                                                    kpVar4.getClass();
                                                    break;
                                                } else {
                                                    kpVar4.Z = j3;
                                                    kpVar4.X = kpVar4.getMessagesController().getChat(Long.valueOf(j3));
                                                    MessagesController messagesController = kpVar4.getMessagesController();
                                                    long j10 = -kpVar4.Z;
                                                    TLRPC.Chat chat2 = kpVar4.X;
                                                    boolean z15 = kpVar4.b0;
                                                    chat2.noforwards = z15;
                                                    messagesController.toggleChatNoForwards(j10, z15);
                                                    kpVar4.Y();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (kpVar.U != null) {
                                    if (kpVar.getParentActivity() != null) {
                                        if (!kpVar.a0 && !ChatObject.isChannel(kpVar.X)) {
                                            gp gpVar = kpVar.U;
                                            if (gpVar.f || gpVar.h) {
                                                final int i12 = 0;
                                                kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), kpVar.Z, kpVar, new MessagesStorage.LongCallback(kpVar) { // from class: org.telegram.ui.yo
                                                    public final /* synthetic */ kp b;

                                                    {
                                                        this.b = kpVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j3) {
                                                        switch (i12) {
                                                            case 0:
                                                                kp kpVar2 = this.b;
                                                                if (j3 == 0) {
                                                                    kpVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    kpVar2.Z = j3;
                                                                    kpVar2.X = kpVar2.getMessagesController().getChat(Long.valueOf(j3));
                                                                    kpVar2.Y();
                                                                    break;
                                                                }
                                                            case 1:
                                                                kp kpVar3 = this.b;
                                                                if (j3 == 0) {
                                                                    kpVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    kpVar3.Z = j3;
                                                                    kpVar3.X = kpVar3.getMessagesController().getChat(Long.valueOf(j3));
                                                                    kpVar3.Y();
                                                                    break;
                                                                }
                                                            default:
                                                                kp kpVar4 = this.b;
                                                                if (j3 == 0) {
                                                                    kpVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    kpVar4.Z = j3;
                                                                    kpVar4.X = kpVar4.getMessagesController().getChat(Long.valueOf(j3));
                                                                    MessagesController messagesController = kpVar4.getMessagesController();
                                                                    long j10 = -kpVar4.Z;
                                                                    TLRPC.Chat chat2 = kpVar4.X;
                                                                    boolean z15 = kpVar4.b0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.toggleChatNoForwards(j10, z15);
                                                                    kpVar4.Y();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (kpVar.X.join_to_send != kpVar.U.f) {
                                            MessagesController messagesController = kpVar.getMessagesController();
                                            long j3 = kpVar.Z;
                                            TLRPC.Chat chat2 = kpVar.X;
                                            boolean z15 = kpVar.U.f;
                                            chat2.join_to_send = z15;
                                            messagesController.toggleChatJoinToSend(j3, z15, null, null);
                                        }
                                        if (kpVar.X.join_request != kpVar.U.h || kpVar.W) {
                                            MessagesController messagesController2 = kpVar.getMessagesController();
                                            long j10 = kpVar.Z;
                                            TLRPC.Chat chat3 = kpVar.X;
                                            boolean z16 = kpVar.U.h;
                                            chat3.join_request = z16;
                                            messagesController2.toggleChatJoinRequest(j10, 0L, z16, kpVar.W, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    kpVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = kpVar.getMessagesController();
                            long j11 = -kpVar.Z;
                            TLRPC.Chat chat4 = kpVar.X;
                            boolean z17 = kpVar.b0;
                            chat4.noforwards = z17;
                            messagesController3.toggleChatNoForwards(j11, z17);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (ChatObject.isChannel(kpVar.X)) {
                    kpVar.getMessagesController().updateChannelUserName(kpVar, kpVar.Z, obj, new zo(kpVar, 1), new zo(kpVar, 2));
                    kpVar = kpVar;
                } else {
                    final int i13 = 1;
                    kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), kpVar.Z, kpVar, new MessagesStorage.LongCallback(kpVar) { // from class: org.telegram.ui.yo
                        public final /* synthetic */ kp b;

                        {
                            this.b = kpVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j32) {
                            switch (i13) {
                                case 0:
                                    kp kpVar2 = this.b;
                                    if (j32 == 0) {
                                        kpVar2.getClass();
                                        break;
                                    } else {
                                        kpVar2.Z = j32;
                                        kpVar2.X = kpVar2.getMessagesController().getChat(Long.valueOf(j32));
                                        kpVar2.Y();
                                        break;
                                    }
                                case 1:
                                    kp kpVar3 = this.b;
                                    if (j32 == 0) {
                                        kpVar3.getClass();
                                        break;
                                    } else {
                                        kpVar3.Z = j32;
                                        kpVar3.X = kpVar3.getMessagesController().getChat(Long.valueOf(j32));
                                        kpVar3.Y();
                                        break;
                                    }
                                default:
                                    kp kpVar4 = this.b;
                                    if (j32 == 0) {
                                        kpVar4.getClass();
                                        break;
                                    } else {
                                        kpVar4.Z = j32;
                                        kpVar4.X = kpVar4.getMessagesController().getChat(Long.valueOf(j32));
                                        MessagesController messagesController4 = kpVar4.getMessagesController();
                                        long j102 = -kpVar4.Z;
                                        TLRPC.Chat chat22 = kpVar4.X;
                                        boolean z152 = kpVar4.b0;
                                        chat22.noforwards = z152;
                                        messagesController4.toggleChatNoForwards(j102, z152);
                                        kpVar4.Y();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) kpVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(kpVar.f);
                kpVar.a0(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = this.a0;
        j0Var.H0 = new zo(this, 0);
        showDialog(j0Var);
    }

    public final void a0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.q0);
        }
        if (this.r != null) {
            ValueAnimator valueAnimator = this.r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r.c, z10 ? 1.0f : 0.0f);
            this.r0 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 7));
            this.r0.setDuration((long) (Math.abs(this.r.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.r0.setInterpolator(org.telegram.ui.Components.qr.f);
            this.r0.start();
        }
    }

    public final void b0() {
        if (this.J == null) {
            return;
        }
        int i10 = 8;
        if (this.V || this.c0 || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.e9 e9Var = this.c;
            int i11 = org.telegram.ui.ActionBar.i6.B6;
            e9Var.setTag(Integer.valueOf(i11));
            this.c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            if (this.n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.e0.setVisibility(8);
            this.x.setVisibility(8);
            this.y.setVisibility(0);
            this.g0.setVisibility(8);
            if (this.a0) {
                this.c.setText(LocaleController.getString(this.V ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.d.setText(LocaleController.getString(this.V ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.c.setText(LocaleController.getString(this.V ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.d.setText(LocaleController.getString(this.V ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.E.setVisibility(this.V ? 8 : 0);
            this.F.setVisibility(this.V ? 0 : 8);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            this.y.setPadding(0, 0, 0, this.V ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.v80 v80Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l0;
            v80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.G.c(this.l0, this.Z);
            ep epVar = this.f;
            epVar.setVisibility((this.V || epVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.Z);
            this.I.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.Z)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var2 = this.c;
            int i12 = org.telegram.ui.ActionBar.i6.p7;
            e9Var2.setTag(Integer.valueOf(i12));
            this.c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
            this.y.setVisibility(8);
            this.f.setVisibility(8);
            this.J.setVisibility(8);
            this.e0.setVisibility(0);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.x.setVisibility(8);
            } else {
                this.g0.setVisibility(8);
                this.x.setVisibility(0);
            }
        }
        this.v.a(!this.V);
        this.w.a(this.V);
        this.a.clearFocus();
        gp gpVar = this.U;
        if (gpVar != null) {
            gpVar.setVisibility((!this.a0 || this.V) ? 0 : 8);
            gp gpVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            gpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.a0) ? false : true);
        }
        jp jpVar = this.K;
        if (jpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i10 = 0;
            }
            jpVar.setVisibility(i10);
        }
        V();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new to(this, i10));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.i6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        this.r = prVar;
        this.n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), prVar);
        this.h = new xd(context);
        cp cpVar = new cp(this, context, this.h, this.resourceProvider);
        this.fragmentView = cpVar;
        cpVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        org.telegram.ui.Components.zn0 zn0Var = (org.telegram.ui.Components.zn0) this.fragmentView;
        zn0Var.setFillViewport(true);
        zn0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(zn0Var);
        this.h.setOrientation(1);
        boolean z10 = this.n0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.s, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.e = m4Var;
        m4Var.setHeight(46);
        if (this.a0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.s.addView(this.e);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.w = j6Var;
        if (this.a0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.s.addView(this.w, w7.x5.n(-1, -2));
        this.w.setOnClickListener(new bp(this, i10));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.v = j6Var2;
        if (this.a0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.s.addView(this.v, w7.x5.n(-1, -2));
        this.v.setOnClickListener(new bp(this, 2));
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        this.J = a7Var;
        this.h.addView(a7Var, w7.x5.n(-1, -2));
        if (z10) {
            this.w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.y, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.y.addView(this.E, w7.x5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i12 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setEnabled(false);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163840);
        this.b.setImeOptions(6);
        this.E.addView(this.b, w7.x5.n(-2, 36));
        int i14 = 3;
        ci.h2 h2Var = new ci.h2(this, context, 3);
        this.a = h2Var;
        h2Var.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackground(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        this.E.addView(this.a, w7.x5.n(-1, 36));
        this.a.addTextChangedListener(new l0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.y.addView(this.F, w7.x5.n(-1, -2));
        org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = v80Var;
        v80Var.setDelegate(new dp(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        ep epVar = new ep(this, context, this.resourceProvider);
        this.f = epVar;
        epVar.setBottomPadding(6);
        this.h.addView(this.f, w7.x5.n(-2, -2));
        int i15 = 12;
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.c = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.h.addView(this.c, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.g0 = s4Var;
        this.h.addView(s4Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        this.e0 = a7Var2;
        this.h.addView(a7Var2, w7.x5.n(-1, -2));
        xd xdVar = this.h;
        jp jpVar = new jp(this, context);
        this.K = jpVar;
        xdVar.addView(jpVar, w7.x5.n(-1, -2));
        this.K.setVisibility((this.V || this.N.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.H = r8Var;
        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new bp(this, i14));
        this.h.addView(this.H, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.I = e9Var2;
        this.h.addView(e9Var2, w7.x5.n(-1, -2));
        gp gpVar = new gp(this, context, this.X, context);
        this.U = gpVar;
        TLRPC.ChatFull chatFull = this.Y;
        gpVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.a0) ? false : true);
        gp gpVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.e9 e9Var3 = gpVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gpVar2.n);
        boolean isPublic = ChatObject.isPublic(gpVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            e9Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            e9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.il, false), new org.telegram.ui.Components.ny(i15, chatFull2, this)));
        }
        this.h.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.Q);
        org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context, 23);
        this.R = m4Var3;
        m4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.S = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.b0, false);
        this.S.setOnClickListener(new bp(this, 4));
        this.Q.addView(this.S, w7.x5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (!this.a0 || ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.Q.addView(this.T, w7.x5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.a.setText(publicUsername);
            this.a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.Z) {
                this.Y = chatFull;
                this.l0 = chatFull.exported_invite;
                b0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var == null || d5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        int i10 = org.telegram.ui.ActionBar.i6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.J, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.a, 4, null, null, null, null, i14));
        ci.h2 h2Var = this.a;
        int i15 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, TLObject.FLAG_23, null, null, null, null, i15));
        LinearLayout linearLayout = this.s;
        int i16 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.i6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, TLObject.FLAG_23, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.i6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.i6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.i6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.i6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.r0, eVar, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        ci.h2 h2Var;
        super.onBecomeFullyVisible();
        if (!this.n0 || (h2Var = this.a) == null) {
            return;
        }
        h2Var.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10 = this.n0;
        ArrayList arrayList = this.N;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Z));
        this.X = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = getMessagesStorage().getChatSync(this.Z);
            this.X = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.X, true);
                if (this.Y == null) {
                    TLRPC.ChatFull loadChatInfo = getMessagesStorage().loadChatInfo(this.Z, ChatObject.isChannel(this.X), new CountDownLatch(1), false, false);
                    this.Y = loadChatInfo;
                }
            }
            return false;
        }
        this.V = (z10 || ChatObject.isPublic(this.X)) ? false : true;
        this.a0 = ChatObject.isChannel(this.X) && !this.X.megagroup;
        TLRPC.Chat chat2 = this.X;
        this.b0 = chat2.noforwards;
        if ((z10 && !ChatObject.isPublic(chat2)) || (this.V && this.X.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new xo(this, 3));
        }
        if (this.V && this.Y != null) {
            getMessagesController().loadFullChat(this.Z, this.classGuid, true);
        }
        if (this.X != null) {
            this.M.clear();
            arrayList.clear();
            for (int i10 = 0; i10 < this.X.usernames.size(); i10++) {
                if (this.X.usernames.get(i10).active) {
                    arrayList.add(this.X.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < this.X.usernames.size(); i11++) {
                if (!this.X.usernames.get(i11).active) {
                    arrayList.add(this.X.usernames.get(i11));
                }
            }
        }
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        xd xdVar = this.h;
        if (xdVar != null) {
            xdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.l0 = tL_chatInviteExported;
            this.G.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.G.c(this.l0, this.Z);
        }
    }
}
