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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class hp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.j90 H;
    public org.telegram.ui.Cells.r8 I;
    public org.telegram.ui.Cells.e9 J;
    public org.telegram.ui.Cells.b7 K;
    public gp L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public pa P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.m4 S;
    public org.telegram.ui.Cells.w8 T;
    public org.telegram.ui.Cells.e9 U;
    public dp V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public zo a;
    public long a0;
    public ci.h2 b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public org.telegram.ui.Cells.e9 d;
    public boolean d0;
    public org.telegram.ui.Cells.m4 e;
    public boolean e0;
    public org.telegram.ui.Cells.m4 f;
    public org.telegram.ui.Cells.b7 f0;
    public ArrayList g0;
    public bp h;
    public org.telegram.ui.Cells.s4 h0;
    public int i0;
    public String j0;
    public oh k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.ro0 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public org.telegram.ui.Components.f70 q0;
    public org.telegram.ui.ActionBar.v0 r;
    public wo r0;
    public org.telegram.ui.Components.sr s;
    public ValueAnimator s0;
    public Boolean t0;
    public boolean u0;
    public LinearLayout v;
    public org.telegram.ui.Cells.j6 w;
    public org.telegram.ui.Cells.j6 x;
    public LinearLayout y;

    public final void T() {
        if (!this.W && this.b.length() <= 0) {
            ArrayList arrayList = this.O;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.r.setEnabled(false);
            this.r.setAlpha(0.5f);
            return;
        }
        this.r.setEnabled(true);
        this.r.setAlpha(1.0f);
    }

    public final boolean U(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        oh ohVar = this.k0;
        if (ohVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ohVar);
            this.k0 = null;
            this.j0 = null;
            if (this.i0 != 0) {
                getConnectionsManager().cancelRequest(this.i0, true);
            }
        }
        this.l0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.b0) {
                        this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.b0) {
                this.h.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.h.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.h.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.i6.p7);
            return false;
        }
        this.h.setText(LocaleController.getString(R.string.LinkChecking));
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.i6.F6);
        this.j0 = str;
        oh ohVar2 = new oh(13, this, str);
        this.k0 = ohVar2;
        AndroidUtilities.runOnUIThread(ohVar2, 300L);
        return true;
    }

    public final void W(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.t3(6, this, z10)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final hp hpVar = this;
        AndroidUtilities.runOnUIThread(hpVar.r0, 200L);
        boolean z13 = true;
        if (hpVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(hpVar.Y, true);
            if (hpVar.W || (((publicUsername != null || hpVar.b.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(hpVar.b.getText().toString()))) || hpVar.b.length() == 0 || hpVar.l0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = hpVar.W ? "" : hpVar.b.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!hpVar.W || (arrayList = hpVar.Y.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (hpVar.u0) {
                        z10 = false;
                    } else {
                        hpVar.u0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < hpVar.Y.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = hpVar.Y.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(hpVar.Y);
                            hpVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new uo(hpVar, 1));
                        } else {
                            hpVar.u0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = hpVar.Y;
                        if (chat.noforwards != hpVar.c0) {
                            if (!ChatObject.isChannel(chat)) {
                                hpVar.Z(true);
                                final int i11 = 2;
                                hpVar.getMessagesController().convertToMegaGroup(hpVar.getParentActivity(), hpVar.a0, hpVar, new MessagesStorage.LongCallback(hpVar) { // from class: org.telegram.ui.vo
                                    public final /* synthetic */ hp b;

                                    {
                                        this.b = hpVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j3) {
                                        switch (i11) {
                                            case 0:
                                                hp hpVar2 = this.b;
                                                if (j3 == 0) {
                                                    hpVar2.getClass();
                                                    break;
                                                } else {
                                                    hpVar2.a0 = j3;
                                                    hpVar2.Y = hpVar2.getMessagesController().getChat(Long.valueOf(j3));
                                                    hpVar2.X();
                                                    break;
                                                }
                                            case 1:
                                                hp hpVar3 = this.b;
                                                if (j3 == 0) {
                                                    hpVar3.getClass();
                                                    break;
                                                } else {
                                                    hpVar3.a0 = j3;
                                                    hpVar3.Y = hpVar3.getMessagesController().getChat(Long.valueOf(j3));
                                                    hpVar3.X();
                                                    break;
                                                }
                                            default:
                                                hp hpVar4 = this.b;
                                                if (j3 == 0) {
                                                    hpVar4.getClass();
                                                    break;
                                                } else {
                                                    hpVar4.a0 = j3;
                                                    hpVar4.Y = hpVar4.getMessagesController().getChat(Long.valueOf(j3));
                                                    MessagesController messagesController = hpVar4.getMessagesController();
                                                    long j10 = -hpVar4.a0;
                                                    TLRPC.Chat chat2 = hpVar4.Y;
                                                    boolean z15 = hpVar4.c0;
                                                    chat2.noforwards = z15;
                                                    messagesController.toggleChatNoForwards(j10, z15);
                                                    hpVar4.X();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (hpVar.V != null) {
                                    if (hpVar.getParentActivity() != null) {
                                        if (!hpVar.b0 && !ChatObject.isChannel(hpVar.Y)) {
                                            dp dpVar = hpVar.V;
                                            if (dpVar.f || dpVar.h) {
                                                final int i12 = 0;
                                                hpVar.getMessagesController().convertToMegaGroup(hpVar.getParentActivity(), hpVar.a0, hpVar, new MessagesStorage.LongCallback(hpVar) { // from class: org.telegram.ui.vo
                                                    public final /* synthetic */ hp b;

                                                    {
                                                        this.b = hpVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j3) {
                                                        switch (i12) {
                                                            case 0:
                                                                hp hpVar2 = this.b;
                                                                if (j3 == 0) {
                                                                    hpVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    hpVar2.a0 = j3;
                                                                    hpVar2.Y = hpVar2.getMessagesController().getChat(Long.valueOf(j3));
                                                                    hpVar2.X();
                                                                    break;
                                                                }
                                                            case 1:
                                                                hp hpVar3 = this.b;
                                                                if (j3 == 0) {
                                                                    hpVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    hpVar3.a0 = j3;
                                                                    hpVar3.Y = hpVar3.getMessagesController().getChat(Long.valueOf(j3));
                                                                    hpVar3.X();
                                                                    break;
                                                                }
                                                            default:
                                                                hp hpVar4 = this.b;
                                                                if (j3 == 0) {
                                                                    hpVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    hpVar4.a0 = j3;
                                                                    hpVar4.Y = hpVar4.getMessagesController().getChat(Long.valueOf(j3));
                                                                    MessagesController messagesController = hpVar4.getMessagesController();
                                                                    long j10 = -hpVar4.a0;
                                                                    TLRPC.Chat chat2 = hpVar4.Y;
                                                                    boolean z15 = hpVar4.c0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.toggleChatNoForwards(j10, z15);
                                                                    hpVar4.X();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (hpVar.Y.join_to_send != hpVar.V.f) {
                                            MessagesController messagesController = hpVar.getMessagesController();
                                            long j3 = hpVar.a0;
                                            TLRPC.Chat chat2 = hpVar.Y;
                                            boolean z15 = hpVar.V.f;
                                            chat2.join_to_send = z15;
                                            messagesController.toggleChatJoinToSend(j3, z15, null, null);
                                        }
                                        if (hpVar.Y.join_request != hpVar.V.h || hpVar.X) {
                                            MessagesController messagesController2 = hpVar.getMessagesController();
                                            long j10 = hpVar.a0;
                                            TLRPC.Chat chat3 = hpVar.Y;
                                            boolean z16 = hpVar.V.h;
                                            chat3.join_request = z16;
                                            messagesController2.toggleChatJoinRequest(j10, 0L, z16, hpVar.X, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    hpVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = hpVar.getMessagesController();
                            long j11 = -hpVar.a0;
                            TLRPC.Chat chat4 = hpVar.Y;
                            boolean z17 = hpVar.c0;
                            chat4.noforwards = z17;
                            messagesController3.toggleChatNoForwards(j11, z17);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (ChatObject.isChannel(hpVar.Y)) {
                    hpVar.getMessagesController().updateChannelUserName(hpVar, hpVar.a0, obj, new wo(hpVar, 1), new wo(hpVar, 2));
                    hpVar = hpVar;
                } else {
                    final int i13 = 1;
                    hpVar.getMessagesController().convertToMegaGroup(hpVar.getParentActivity(), hpVar.a0, hpVar, new MessagesStorage.LongCallback(hpVar) { // from class: org.telegram.ui.vo
                        public final /* synthetic */ hp b;

                        {
                            this.b = hpVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j32) {
                            switch (i13) {
                                case 0:
                                    hp hpVar2 = this.b;
                                    if (j32 == 0) {
                                        hpVar2.getClass();
                                        break;
                                    } else {
                                        hpVar2.a0 = j32;
                                        hpVar2.Y = hpVar2.getMessagesController().getChat(Long.valueOf(j32));
                                        hpVar2.X();
                                        break;
                                    }
                                case 1:
                                    hp hpVar3 = this.b;
                                    if (j32 == 0) {
                                        hpVar3.getClass();
                                        break;
                                    } else {
                                        hpVar3.a0 = j32;
                                        hpVar3.Y = hpVar3.getMessagesController().getChat(Long.valueOf(j32));
                                        hpVar3.X();
                                        break;
                                    }
                                default:
                                    hp hpVar4 = this.b;
                                    if (j32 == 0) {
                                        hpVar4.getClass();
                                        break;
                                    } else {
                                        hpVar4.a0 = j32;
                                        hpVar4.Y = hpVar4.getMessagesController().getChat(Long.valueOf(j32));
                                        MessagesController messagesController4 = hpVar4.getMessagesController();
                                        long j102 = -hpVar4.a0;
                                        TLRPC.Chat chat22 = hpVar4.Y;
                                        boolean z152 = hpVar4.c0;
                                        chat22.noforwards = z152;
                                        messagesController4.toggleChatNoForwards(j102, z152);
                                        hpVar4.X();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) hpVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(hpVar.h);
                hpVar.Z(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        rg.k0 k0Var = new rg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.v0 = this.b0;
        k0Var.H0 = new wo(this, 0);
        showDialog(k0Var);
    }

    public final void Z(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.r0);
        }
        if (this.s != null) {
            ValueAnimator valueAnimator = this.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s.c, z10 ? 1.0f : 0.0f);
            this.s0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 6));
            this.s0.setDuration((long) (Math.abs(this.s.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.s0.setInterpolator(org.telegram.ui.Components.tr.f);
            this.s0.start();
        }
    }

    public final void b0() {
        if (this.K == null) {
            return;
        }
        int i10 = 8;
        if (this.W || this.d0 || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.e9 e9Var = this.d;
            int i11 = org.telegram.ui.ActionBar.i6.B6;
            e9Var.setTag(Integer.valueOf(i11));
            this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            if (this.o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f0.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.h0.setVisibility(8);
            if (this.b0) {
                this.d.setText(LocaleController.getString(this.W ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.e.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.d.setText(LocaleController.getString(this.W ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.e.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.F.setVisibility(this.W ? 8 : 0);
            this.G.setVisibility(this.W ? 0 : 8);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.E.setPadding(0, 0, 0, this.W ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.j90 j90Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            j90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.H.c(this.m0, this.a0);
            bp bpVar = this.h;
            bpVar.setVisibility((this.W || bpVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.a0);
            this.J.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.a0)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.d.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var2 = this.d;
            int i12 = org.telegram.ui.ActionBar.i6.p7;
            e9Var2.setTag(Integer.valueOf(i12));
            this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f0.setVisibility(0);
            if (this.e0) {
                this.h0.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                this.h0.setVisibility(8);
                this.y.setVisibility(0);
            }
        }
        this.w.a(!this.W);
        this.x.a(this.W);
        this.b.clearFocus();
        dp dpVar = this.V;
        if (dpVar != null) {
            dpVar.setVisibility((!this.b0 || this.W) ? 0 : 8);
            dp dpVar2 = this.V;
            TLRPC.ChatFull chatFull2 = this.Z;
            dpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.b0) ? false : true);
        }
        gp gpVar = this.L;
        if (gpVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i10 = 0;
            }
            gpVar.setVisibility(i10);
        }
        T();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, i10));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.i6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.sr srVar = new org.telegram.ui.Components.sr(mutate, new org.telegram.ui.Components.wp(org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        this.s = srVar;
        this.r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), srVar);
        this.n = new org.telegram.ui.Components.ro0(context);
        this.a = new zo(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, w7.z5.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z10 = this.o0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.b0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.v, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.f = m4Var;
        m4Var.setHeight(46);
        if (this.b0) {
            this.f.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.v.addView(this.f);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.x = j6Var;
        if (this.b0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.W);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.W);
        }
        this.v.addView(this.x, w7.z5.n(-1, -2));
        this.x.setOnClickListener(new yo(this, i10));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.w = j6Var2;
        if (this.b0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.W);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.W);
        }
        this.v.addView(this.w, w7.z5.n(-1, -2));
        this.w.setOnClickListener(new yo(this, 2));
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        this.K = b7Var;
        this.n.addView(b7Var, w7.z5.n(-1, -2));
        if (z10) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.E, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.e = m4Var2;
        this.E.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, w7.z5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i12 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.F.addView(this.c, w7.z5.n(-2, 36));
        int i14 = 3;
        ci.h2 h2Var = new ci.h2(this, context, 3);
        this.b = h2Var;
        h2Var.setTextSize(1, 18.0f);
        this.b.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.b.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        this.F.addView(this.b, w7.z5.n(-1, 36));
        this.b.addTextChangedListener(new m0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, w7.z5.n(-1, -2));
        org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(context, this, null, true, ChatObject.isChannel(this.Y));
        this.H = j90Var;
        j90Var.setDelegate(new ap(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        bp bpVar = new bp(this, context, this.resourceProvider);
        this.h = bpVar;
        bpVar.setBottomPadding(6);
        this.n.addView(this.h, w7.z5.n(-2, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.d = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.n.addView(this.d, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.h0 = s4Var;
        this.n.addView(s4Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        this.f0 = b7Var2;
        this.n.addView(b7Var2, w7.z5.n(-1, -2));
        org.telegram.ui.Components.ro0 ro0Var = this.n;
        gp gpVar = new gp(this, context);
        this.L = gpVar;
        ro0Var.addView(gpVar, w7.z5.n(-1, -2));
        this.L.setVisibility((this.W || this.O.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.I = r8Var;
        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.I.setOnClickListener(new yo(this, i14));
        this.n.addView(this.I, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.J = e9Var2;
        this.n.addView(e9Var2, w7.z5.n(-1, -2));
        dp dpVar = new dp(this, context, this.Y, context);
        this.V = dpVar;
        TLRPC.ChatFull chatFull = this.Z;
        dpVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        dp dpVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.e9 e9Var3 = dpVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(dpVar2.n);
        boolean isPublic = ChatObject.isPublic(dpVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            e9Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            e9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.il, false), new org.telegram.ui.Components.yw(16, chatFull2, this)));
        }
        this.n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.R);
        org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context, 23);
        this.S = m4Var3;
        m4Var3.setHeight(46);
        this.S.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.R.addView(this.S, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.T = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.c0, false);
        this.T.setOnClickListener(new yo(this, 4));
        this.R.addView(this.T, w7.z5.n(-1, -2));
        this.U = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (!this.b0 || ChatObject.isMegagroup(this.Y)) {
            this.U.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.U.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.R.addView(this.U, w7.z5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.Y, true);
        if (!this.W && publicUsername != null) {
            this.n0 = true;
            this.b.setText(publicUsername);
            this.b.setSelection(publicUsername.length());
            this.n0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                b0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
                if (c5Var == null || c5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.so0 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        int i10 = org.telegram.ui.ActionBar.i6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.K, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 4, null, null, null, null, i14));
        ci.h2 h2Var = this.b;
        int i15 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, TLObject.FLAG_23, null, null, null, null, i15));
        LinearLayout linearLayout = this.v;
        int i16 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.E, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.i6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, TLObject.FLAG_23, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.J, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.J, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.J, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.i6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.i6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.i6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.i6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.r0, eVar, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.m6));
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
        if (!this.o0 || (h2Var = this.b) == null) {
            return;
        }
        h2Var.requestFocus();
        AndroidUtilities.showKeyboard(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10 = this.o0;
        ArrayList arrayList = this.O;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.a0));
        this.Y = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = getMessagesStorage().getChatSync(this.a0);
            this.Y = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.Y, true);
                if (this.Z == null) {
                    TLRPC.ChatFull loadChatInfo = getMessagesStorage().loadChatInfo(this.a0, ChatObject.isChannel(this.Y), new CountDownLatch(1), false, false);
                    this.Z = loadChatInfo;
                }
            }
            return false;
        }
        this.W = (z10 || ChatObject.isPublic(this.Y)) ? false : true;
        this.b0 = ChatObject.isChannel(this.Y) && !this.Y.megagroup;
        TLRPC.Chat chat2 = this.Y;
        this.c0 = chat2.noforwards;
        if ((z10 && !ChatObject.isPublic(chat2)) || (this.W && this.Y.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new uo(this, 3));
        }
        if (this.W && this.Z != null) {
            getMessagesController().loadFullChat(this.a0, this.classGuid, true);
        }
        if (this.Y != null) {
            this.N.clear();
            arrayList.clear();
            for (int i10 = 0; i10 < this.Y.usernames.size(); i10++) {
                if (this.Y.usernames.get(i10).active) {
                    arrayList.add(this.Y.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < this.Y.usernames.size(); i11++) {
                if (!this.Y.usernames.get(i11).active) {
                    arrayList.add(this.Y.usernames.get(i11));
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
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            this.H.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.H.c(this.m0, this.a0);
        }
    }
}
