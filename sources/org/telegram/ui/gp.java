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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.w80 G;
    public org.telegram.ui.Cells.s8 H;
    public org.telegram.ui.Cells.f9 I;
    public org.telegram.ui.Cells.a7 J;
    public fp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public na O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.m4 R;
    public org.telegram.ui.Cells.x8 S;
    public org.telegram.ui.Cells.f9 T;
    public cp U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ci.h2 a;
    public boolean a0;
    public EditTextBoldCursor b;
    public boolean b0;
    public org.telegram.ui.Cells.f9 c;
    public boolean c0;
    public org.telegram.ui.Cells.m4 d;
    public boolean d0;
    public org.telegram.ui.Cells.m4 e;
    public org.telegram.ui.Cells.a7 e0;
    public ap f;
    public ArrayList f0;
    public org.telegram.ui.Cells.s4 g0;
    public xd h;
    public int h0;
    public String i0;
    public rh j0;
    public boolean k0;
    public TLRPC.TL_chatInviteExported l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.v0 n;
    public boolean n0;
    public HashMap o0;
    public org.telegram.ui.Components.s60 p0;
    public vo q0;
    public org.telegram.ui.Components.qr r;
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
        rh rhVar = this.j0;
        if (rhVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rhVar);
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
                this.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.p7);
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
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.p7);
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
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.p7);
            return false;
        }
        this.f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.F6);
        this.i0 = str;
        rh rhVar2 = new rh(9, this, str);
        this.j0 = rhVar2;
        AndroidUtilities.runOnUIThread(rhVar2, 300L);
        return true;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.t3(6, this, z10)), this.classGuid);
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
        final gp gpVar = this;
        AndroidUtilities.runOnUIThread(gpVar.q0, 200L);
        boolean z13 = true;
        if (gpVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(gpVar.X, true);
            if (gpVar.V || (((publicUsername != null || gpVar.a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(gpVar.a.getText().toString()))) || gpVar.a.length() == 0 || gpVar.k0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = gpVar.V ? "" : gpVar.a.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!gpVar.V || (arrayList = gpVar.X.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (gpVar.t0) {
                        z10 = false;
                    } else {
                        gpVar.t0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < gpVar.X.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = gpVar.X.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(gpVar.X);
                            gpVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new to(gpVar, 1));
                        } else {
                            gpVar.t0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = gpVar.X;
                        if (chat.noforwards != gpVar.b0) {
                            if (!ChatObject.isChannel(chat)) {
                                gpVar.a0(true);
                                final int i11 = 2;
                                gpVar.getMessagesController().convertToMegaGroup(gpVar.getParentActivity(), gpVar.Z, gpVar, new MessagesStorage.LongCallback(gpVar) { // from class: org.telegram.ui.uo
                                    public final /* synthetic */ gp b;

                                    {
                                        this.b = gpVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j3) {
                                        switch (i11) {
                                            case 0:
                                                gp gpVar2 = this.b;
                                                if (j3 == 0) {
                                                    gpVar2.getClass();
                                                    break;
                                                } else {
                                                    gpVar2.Z = j3;
                                                    gpVar2.X = gpVar2.getMessagesController().getChat(Long.valueOf(j3));
                                                    gpVar2.Y();
                                                    break;
                                                }
                                            case 1:
                                                gp gpVar3 = this.b;
                                                if (j3 == 0) {
                                                    gpVar3.getClass();
                                                    break;
                                                } else {
                                                    gpVar3.Z = j3;
                                                    gpVar3.X = gpVar3.getMessagesController().getChat(Long.valueOf(j3));
                                                    gpVar3.Y();
                                                    break;
                                                }
                                            default:
                                                gp gpVar4 = this.b;
                                                if (j3 == 0) {
                                                    gpVar4.getClass();
                                                    break;
                                                } else {
                                                    gpVar4.Z = j3;
                                                    gpVar4.X = gpVar4.getMessagesController().getChat(Long.valueOf(j3));
                                                    MessagesController messagesController = gpVar4.getMessagesController();
                                                    long j10 = -gpVar4.Z;
                                                    TLRPC.Chat chat2 = gpVar4.X;
                                                    boolean z15 = gpVar4.b0;
                                                    chat2.noforwards = z15;
                                                    messagesController.toggleChatNoForwards(j10, z15);
                                                    gpVar4.Y();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (gpVar.U != null) {
                                    if (gpVar.getParentActivity() != null) {
                                        if (!gpVar.a0 && !ChatObject.isChannel(gpVar.X)) {
                                            cp cpVar = gpVar.U;
                                            if (cpVar.f || cpVar.h) {
                                                final int i12 = 0;
                                                gpVar.getMessagesController().convertToMegaGroup(gpVar.getParentActivity(), gpVar.Z, gpVar, new MessagesStorage.LongCallback(gpVar) { // from class: org.telegram.ui.uo
                                                    public final /* synthetic */ gp b;

                                                    {
                                                        this.b = gpVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j3) {
                                                        switch (i12) {
                                                            case 0:
                                                                gp gpVar2 = this.b;
                                                                if (j3 == 0) {
                                                                    gpVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    gpVar2.Z = j3;
                                                                    gpVar2.X = gpVar2.getMessagesController().getChat(Long.valueOf(j3));
                                                                    gpVar2.Y();
                                                                    break;
                                                                }
                                                            case 1:
                                                                gp gpVar3 = this.b;
                                                                if (j3 == 0) {
                                                                    gpVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    gpVar3.Z = j3;
                                                                    gpVar3.X = gpVar3.getMessagesController().getChat(Long.valueOf(j3));
                                                                    gpVar3.Y();
                                                                    break;
                                                                }
                                                            default:
                                                                gp gpVar4 = this.b;
                                                                if (j3 == 0) {
                                                                    gpVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    gpVar4.Z = j3;
                                                                    gpVar4.X = gpVar4.getMessagesController().getChat(Long.valueOf(j3));
                                                                    MessagesController messagesController = gpVar4.getMessagesController();
                                                                    long j10 = -gpVar4.Z;
                                                                    TLRPC.Chat chat2 = gpVar4.X;
                                                                    boolean z15 = gpVar4.b0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.toggleChatNoForwards(j10, z15);
                                                                    gpVar4.Y();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (gpVar.X.join_to_send != gpVar.U.f) {
                                            MessagesController messagesController = gpVar.getMessagesController();
                                            long j3 = gpVar.Z;
                                            TLRPC.Chat chat2 = gpVar.X;
                                            boolean z15 = gpVar.U.f;
                                            chat2.join_to_send = z15;
                                            messagesController.toggleChatJoinToSend(j3, z15, null, null);
                                        }
                                        if (gpVar.X.join_request != gpVar.U.h || gpVar.W) {
                                            MessagesController messagesController2 = gpVar.getMessagesController();
                                            long j10 = gpVar.Z;
                                            TLRPC.Chat chat3 = gpVar.X;
                                            boolean z16 = gpVar.U.h;
                                            chat3.join_request = z16;
                                            messagesController2.toggleChatJoinRequest(j10, 0L, z16, gpVar.W, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    gpVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = gpVar.getMessagesController();
                            long j11 = -gpVar.Z;
                            TLRPC.Chat chat4 = gpVar.X;
                            boolean z17 = gpVar.b0;
                            chat4.noforwards = z17;
                            messagesController3.toggleChatNoForwards(j11, z17);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (ChatObject.isChannel(gpVar.X)) {
                    gpVar.getMessagesController().updateChannelUserName(gpVar, gpVar.Z, obj, new vo(gpVar, 1), new vo(gpVar, 2));
                    gpVar = gpVar;
                } else {
                    final int i13 = 1;
                    gpVar.getMessagesController().convertToMegaGroup(gpVar.getParentActivity(), gpVar.Z, gpVar, new MessagesStorage.LongCallback(gpVar) { // from class: org.telegram.ui.uo
                        public final /* synthetic */ gp b;

                        {
                            this.b = gpVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j32) {
                            switch (i13) {
                                case 0:
                                    gp gpVar2 = this.b;
                                    if (j32 == 0) {
                                        gpVar2.getClass();
                                        break;
                                    } else {
                                        gpVar2.Z = j32;
                                        gpVar2.X = gpVar2.getMessagesController().getChat(Long.valueOf(j32));
                                        gpVar2.Y();
                                        break;
                                    }
                                case 1:
                                    gp gpVar3 = this.b;
                                    if (j32 == 0) {
                                        gpVar3.getClass();
                                        break;
                                    } else {
                                        gpVar3.Z = j32;
                                        gpVar3.X = gpVar3.getMessagesController().getChat(Long.valueOf(j32));
                                        gpVar3.Y();
                                        break;
                                    }
                                default:
                                    gp gpVar4 = this.b;
                                    if (j32 == 0) {
                                        gpVar4.getClass();
                                        break;
                                    } else {
                                        gpVar4.Z = j32;
                                        gpVar4.X = gpVar4.getMessagesController().getChat(Long.valueOf(j32));
                                        MessagesController messagesController4 = gpVar4.getMessagesController();
                                        long j102 = -gpVar4.Z;
                                        TLRPC.Chat chat22 = gpVar4.X;
                                        boolean z152 = gpVar4.b0;
                                        chat22.noforwards = z152;
                                        messagesController4.toggleChatNoForwards(j102, z152);
                                        gpVar4.Y();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) gpVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(gpVar.f);
                gpVar.a0(false);
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
        j0Var.H0 = new vo(this, 0);
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
            ofFloat.addUpdateListener(new c3(this, 7));
            this.r0.setDuration((long) (Math.abs(this.r.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.r0.setInterpolator(org.telegram.ui.Components.rr.f);
            this.r0.start();
        }
    }

    public final void b0() {
        if (this.J == null) {
            return;
        }
        int i10 = 8;
        if (this.V || this.c0 || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.f9 f9Var = this.c;
            int i11 = org.telegram.ui.ActionBar.h6.B6;
            f9Var.setTag(Integer.valueOf(i11));
            this.c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
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
            org.telegram.ui.Components.w80 w80Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l0;
            w80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.G.c(this.l0, this.Z);
            ap apVar = this.f;
            apVar.setVisibility((this.V || apVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.Z);
            this.I.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.Z)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.f9 f9Var2 = this.c;
            int i12 = org.telegram.ui.ActionBar.h6.p7;
            f9Var2.setTag(Integer.valueOf(i12));
            this.c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
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
        cp cpVar = this.U;
        if (cpVar != null) {
            cpVar.setVisibility((!this.a0 || this.V) ? 0 : 8);
            cp cpVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            cpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.a0) ? false : true);
        }
        fp fpVar = this.K;
        if (fpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i10 = 0;
            }
            fpVar.setVisibility(i10);
        }
        V();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, i10));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.h6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.qr qrVar = new org.telegram.ui.Components.qr(mutate, new org.telegram.ui.Components.up(org.telegram.ui.ActionBar.h6.w0(null, i11, false)));
        this.r = qrVar;
        this.n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), qrVar);
        this.h = new xd(context);
        yo yoVar = new yo(this, context, this.h, this.resourceProvider);
        this.fragmentView = yoVar;
        yoVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
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
        this.w.setOnClickListener(new xo(this, i10));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.v = j6Var2;
        if (this.a0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.s.addView(this.v, w7.x5.n(-1, -2));
        this.v.setOnClickListener(new xo(this, 2));
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
        int i12 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
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
        this.a.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackground(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        this.E.addView(this.a, w7.x5.n(-1, 36));
        this.a.addTextChangedListener(new m0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.y.addView(this.F, w7.x5.n(-1, -2));
        org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = w80Var;
        w80Var.setDelegate(new zo(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        ap apVar = new ap(this, context, this.resourceProvider);
        this.f = apVar;
        apVar.setBottomPadding(6);
        this.h.addView(this.f, w7.x5.n(-2, -2));
        int i15 = 12;
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.c = f9Var;
        f9Var.setImportantForAccessibility(1);
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
        fp fpVar = new fp(this, context);
        this.K = fpVar;
        xdVar.addView(fpVar, w7.x5.n(-1, -2));
        this.K.setVisibility((this.V || this.N.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.H = s8Var;
        s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new xo(this, i14));
        this.h.addView(this.H, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.I = f9Var2;
        this.h.addView(f9Var2, w7.x5.n(-1, -2));
        cp cpVar = new cp(this, context, this.X, context);
        this.U = cpVar;
        TLRPC.ChatFull chatFull = this.Y;
        cpVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.a0) ? false : true);
        cp cpVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.f9 f9Var3 = cpVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(cpVar2.n);
        boolean isPublic = ChatObject.isPublic(cpVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            f9Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            f9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.il, false), new org.telegram.ui.Components.oy(i15, chatFull2, this)));
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
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.S = x8Var;
        x8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.b0, false);
        this.S.setOnClickListener(new xo(this, 4));
        this.Q.addView(this.S, w7.x5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
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
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        int i10 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.J, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 4, null, null, null, null, i14));
        ci.h2 h2Var = this.a;
        int i15 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, TLObject.FLAG_23, null, null, null, null, i15));
        LinearLayout linearLayout = this.s;
        int i16 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, TLObject.FLAG_23, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e0, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.h6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.h6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.h6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.h6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
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
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new to(this, 3));
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
