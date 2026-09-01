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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ep extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout B;
    public LinearLayout C;
    public org.telegram.ui.Components.y80 D;
    public org.telegram.ui.Cells.o8 E;
    public org.telegram.ui.Cells.a9 F;
    public org.telegram.ui.Cells.z6 G;
    public dp H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ma L;
    public ArrayList M;
    public LinearLayout N;
    public org.telegram.ui.Cells.m4 O;
    public org.telegram.ui.Cells.s8 P;
    public org.telegram.ui.Cells.a9 Q;
    public zo R;
    public boolean S;
    public boolean T;
    public TLRPC.Chat U;
    public TLRPC.ChatFull V;
    public long W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public lg.f a;
    public boolean a0;
    public EditTextBoldCursor b;
    public org.telegram.ui.Cells.z6 b0;
    public org.telegram.ui.Cells.a9 c;
    public ArrayList c0;
    public org.telegram.ui.Cells.m4 d;
    public org.telegram.ui.Cells.s4 d0;
    public org.telegram.ui.Cells.m4 e;
    public int e0;
    public xo f;
    public String f0;
    public fc g0;
    public eg.s3 h;
    public boolean h0;
    public TLRPC.TL_chatInviteExported i0;
    public boolean j0;
    public boolean k0;
    public HashMap l0;
    public org.telegram.ui.Components.u60 m0;
    public org.telegram.ui.ActionBar.w0 n;
    public so n0;
    public ValueAnimator o0;
    public Boolean p0;
    public boolean q0;
    public org.telegram.ui.Components.or r;
    public LinearLayout s;
    public org.telegram.ui.Cells.i6 v;
    public org.telegram.ui.Cells.i6 w;
    public LinearLayout x;
    public LinearLayout y;

    public final void V() {
        if (!this.S && this.a.length() <= 0) {
            ArrayList arrayList = this.K;
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
        fc fcVar = this.g0;
        if (fcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fcVar);
            this.g0 = null;
            this.f0 = null;
            if (this.e0 != 0) {
                getConnectionsManager().cancelRequest(this.e0, true);
            }
        }
        this.h0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.X) {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.X) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        this.f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
        this.f0 = str;
        fc fcVar2 = new fc(26, this, str);
        this.g0 = fcVar2;
        AndroidUtilities.runOnUIThread(fcVar2, 300L);
        return true;
    }

    public final void X(boolean z4) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.W);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.zd(5, this, z4)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        boolean z4;
        boolean z10;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z11;
        final ep epVar = this;
        AndroidUtilities.runOnUIThread(epVar.n0, 200L);
        boolean z12 = true;
        if (epVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(epVar.U, true);
            if (epVar.S || (((publicUsername != null || epVar.a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(epVar.a.getText().toString()))) || epVar.a.length() == 0 || epVar.h0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = epVar.S ? "" : epVar.a.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!epVar.S || (arrayList = epVar.U.usernames) == null || arrayList.isEmpty()) {
                        z4 = true;
                    } else if (epVar.q0) {
                        z4 = false;
                    } else {
                        epVar.q0 = true;
                        boolean z13 = false;
                        for (int i10 = 0; i10 < epVar.U.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = epVar.U.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(epVar.U);
                            epVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new qo(epVar, 1));
                        } else {
                            epVar.q0 = false;
                        }
                        z4 = !z13;
                    }
                    if (z4) {
                        z10 = true;
                        if (z10) {
                            return;
                        }
                        TLRPC.Chat chat = epVar.U;
                        if (chat.noforwards != epVar.Y) {
                            if (!ChatObject.isChannel(chat)) {
                                epVar.a0(true);
                                final int i11 = 2;
                                epVar.getMessagesController().convertToMegaGroup(epVar.getParentActivity(), epVar.W, epVar, new MessagesStorage.LongCallback(epVar) { // from class: org.telegram.ui.ro
                                    public final /* synthetic */ ep b;

                                    {
                                        this.b = epVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j10) {
                                        switch (i11) {
                                            case 0:
                                                ep epVar2 = this.b;
                                                if (j10 == 0) {
                                                    epVar2.getClass();
                                                    break;
                                                } else {
                                                    epVar2.W = j10;
                                                    epVar2.U = epVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                    epVar2.Y();
                                                    break;
                                                }
                                            case 1:
                                                ep epVar3 = this.b;
                                                if (j10 == 0) {
                                                    epVar3.getClass();
                                                    break;
                                                } else {
                                                    epVar3.W = j10;
                                                    epVar3.U = epVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                    epVar3.Y();
                                                    break;
                                                }
                                            default:
                                                ep epVar4 = this.b;
                                                if (j10 == 0) {
                                                    epVar4.getClass();
                                                    break;
                                                } else {
                                                    epVar4.W = j10;
                                                    epVar4.U = epVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                    MessagesController messagesController = epVar4.getMessagesController();
                                                    long j11 = -epVar4.W;
                                                    TLRPC.Chat chat2 = epVar4.U;
                                                    boolean z14 = epVar4.Y;
                                                    chat2.noforwards = z14;
                                                    messagesController.toggleChatNoForwards(j11, z14);
                                                    epVar4.Y();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z11 = false;
                                if (z11) {
                                    return;
                                }
                                if (epVar.R != null) {
                                    if (epVar.getParentActivity() != null) {
                                        if (!epVar.X && !ChatObject.isChannel(epVar.U)) {
                                            zo zoVar = epVar.R;
                                            if (zoVar.f || zoVar.h) {
                                                final int i12 = 0;
                                                epVar.getMessagesController().convertToMegaGroup(epVar.getParentActivity(), epVar.W, epVar, new MessagesStorage.LongCallback(epVar) { // from class: org.telegram.ui.ro
                                                    public final /* synthetic */ ep b;

                                                    {
                                                        this.b = epVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j10) {
                                                        switch (i12) {
                                                            case 0:
                                                                ep epVar2 = this.b;
                                                                if (j10 == 0) {
                                                                    epVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    epVar2.W = j10;
                                                                    epVar2.U = epVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                                    epVar2.Y();
                                                                    break;
                                                                }
                                                            case 1:
                                                                ep epVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    epVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    epVar3.W = j10;
                                                                    epVar3.U = epVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                                    epVar3.Y();
                                                                    break;
                                                                }
                                                            default:
                                                                ep epVar4 = this.b;
                                                                if (j10 == 0) {
                                                                    epVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    epVar4.W = j10;
                                                                    epVar4.U = epVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                                    MessagesController messagesController = epVar4.getMessagesController();
                                                                    long j11 = -epVar4.W;
                                                                    TLRPC.Chat chat2 = epVar4.U;
                                                                    boolean z14 = epVar4.Y;
                                                                    chat2.noforwards = z14;
                                                                    messagesController.toggleChatNoForwards(j11, z14);
                                                                    epVar4.Y();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (epVar.U.join_to_send != epVar.R.f) {
                                            MessagesController messagesController = epVar.getMessagesController();
                                            long j10 = epVar.W;
                                            TLRPC.Chat chat2 = epVar.U;
                                            boolean z14 = epVar.R.f;
                                            chat2.join_to_send = z14;
                                            messagesController.toggleChatJoinToSend(j10, z14, null, null);
                                        }
                                        if (epVar.U.join_request != epVar.R.h || epVar.T) {
                                            MessagesController messagesController2 = epVar.getMessagesController();
                                            long j11 = epVar.W;
                                            TLRPC.Chat chat3 = epVar.U;
                                            boolean z15 = epVar.R.h;
                                            chat3.join_request = z15;
                                            messagesController2.toggleChatJoinRequest(j11, 0L, z15, epVar.T, false, null, null);
                                        }
                                    }
                                    z12 = false;
                                }
                                if (z12) {
                                    epVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = epVar.getMessagesController();
                            long j12 = -epVar.W;
                            TLRPC.Chat chat4 = epVar.U;
                            boolean z16 = epVar.Y;
                            chat4.noforwards = z16;
                            messagesController3.toggleChatNoForwards(j12, z16);
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                } else if (ChatObject.isChannel(epVar.U)) {
                    epVar.getMessagesController().updateChannelUserName(epVar, epVar.W, obj, new so(epVar, 1), new so(epVar, 2));
                    epVar = epVar;
                } else {
                    final int i13 = 1;
                    epVar.getMessagesController().convertToMegaGroup(epVar.getParentActivity(), epVar.W, epVar, new MessagesStorage.LongCallback(epVar) { // from class: org.telegram.ui.ro
                        public final /* synthetic */ ep b;

                        {
                            this.b = epVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j102) {
                            switch (i13) {
                                case 0:
                                    ep epVar2 = this.b;
                                    if (j102 == 0) {
                                        epVar2.getClass();
                                        break;
                                    } else {
                                        epVar2.W = j102;
                                        epVar2.U = epVar2.getMessagesController().getChat(Long.valueOf(j102));
                                        epVar2.Y();
                                        break;
                                    }
                                case 1:
                                    ep epVar3 = this.b;
                                    if (j102 == 0) {
                                        epVar3.getClass();
                                        break;
                                    } else {
                                        epVar3.W = j102;
                                        epVar3.U = epVar3.getMessagesController().getChat(Long.valueOf(j102));
                                        epVar3.Y();
                                        break;
                                    }
                                default:
                                    ep epVar4 = this.b;
                                    if (j102 == 0) {
                                        epVar4.getClass();
                                        break;
                                    } else {
                                        epVar4.W = j102;
                                        epVar4.U = epVar4.getMessagesController().getChat(Long.valueOf(j102));
                                        MessagesController messagesController4 = epVar4.getMessagesController();
                                        long j112 = -epVar4.W;
                                        TLRPC.Chat chat22 = epVar4.U;
                                        boolean z142 = epVar4.Y;
                                        chat22.noforwards = z142;
                                        messagesController4.toggleChatNoForwards(j112, z142);
                                        epVar4.Y();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) epVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(epVar.f);
                epVar.a0(false);
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        fg.v0 v0Var = new fg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.s0 = this.X;
        v0Var.E0 = new so(this, 0);
        showDialog(v0Var);
    }

    public final void a0(boolean z4) {
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.n0);
        }
        if (this.r != null) {
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r.c, z4 ? 1.0f : 0.0f);
            this.o0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 7));
            this.o0.setDuration((long) (Math.abs(this.r.c - (z4 ? 1.0f : 0.0f)) * 200.0f));
            this.o0.setInterpolator(org.telegram.ui.Components.pr.f);
            this.o0.start();
        }
    }

    public final void b0() {
        if (this.G == null) {
            return;
        }
        int i10 = 8;
        if (this.S || this.Z || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.a9 a9Var = this.c;
            int i11 = org.telegram.ui.ActionBar.k6.B6;
            a9Var.setTag(Integer.valueOf(i11));
            this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            if (this.k0) {
                this.G.setVisibility(8);
            } else {
                this.G.setVisibility(0);
            }
            this.b0.setVisibility(8);
            this.x.setVisibility(8);
            this.y.setVisibility(0);
            this.d0.setVisibility(8);
            if (this.X) {
                this.c.setText(LocaleController.getString(this.S ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.d.setText(LocaleController.getString(this.S ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.c.setText(LocaleController.getString(this.S ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.d.setText(LocaleController.getString(this.S ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.B.setVisibility(this.S ? 8 : 0);
            this.C.setVisibility(this.S ? 0 : 8);
            this.N.setVisibility(0);
            this.E.setVisibility(0);
            this.F.setVisibility(0);
            this.y.setPadding(0, 0, 0, this.S ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.y80 y80Var = this.D;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.i0;
            y80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.D.c(this.i0, this.W);
            xo xoVar = this.f;
            xoVar.setVisibility((this.S || xoVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.W);
            this.F.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.W)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.a9 a9Var2 = this.c;
            int i12 = org.telegram.ui.ActionBar.k6.p7;
            a9Var2.setTag(Integer.valueOf(i12));
            this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
            this.y.setVisibility(8);
            this.f.setVisibility(8);
            this.G.setVisibility(8);
            this.b0.setVisibility(0);
            if (this.a0) {
                this.d0.setVisibility(0);
                this.x.setVisibility(8);
            } else {
                this.d0.setVisibility(8);
                this.x.setVisibility(0);
            }
        }
        this.v.a(!this.S);
        this.w.a(this.S);
        this.a.clearFocus();
        zo zoVar = this.R;
        if (zoVar != null) {
            zoVar.setVisibility((!this.X || this.S) ? 0 : 8);
            zo zoVar2 = this.R;
            TLRPC.ChatFull chatFull2 = this.V;
            zoVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.X) ? false : true);
        }
        dp dpVar = this.H;
        if (dpVar != null) {
            if (!this.S && !this.K.isEmpty()) {
                i10 = 0;
            }
            dpVar.setVisibility(i10);
        }
        V();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 18));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.k6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i11, false)));
        this.r = orVar;
        this.n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        this.h = new eg.s3(context);
        vo voVar = new vo(this, context, this.h, this.resourceProvider);
        this.fragmentView = voVar;
        voVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.Components.fo0 fo0Var = (org.telegram.ui.Components.fo0) this.fragmentView;
        fo0Var.setFillViewport(true);
        fo0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(fo0Var);
        this.h.setOrientation(1);
        boolean z4 = this.k0;
        if (z4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.X) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.s, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.e = m4Var;
        m4Var.setHeight(46);
        if (this.X) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.s.addView(this.e);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.w = i6Var;
        if (this.X) {
            i6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.S);
        } else {
            i6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.S);
        }
        this.s.addView(this.w, k7.c6.n(-1, -2));
        this.w.setOnClickListener(new uo(this, i10));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.v = i6Var2;
        if (this.X) {
            i6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.S);
        } else {
            i6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.S);
        }
        this.s.addView(this.v, k7.c6.n(-1, -2));
        this.v.setOnClickListener(new uo(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        this.G = z6Var;
        this.h.addView(z6Var, k7.c6.n(-1, -2));
        if (z4) {
            this.w.setVisibility(8);
            this.v.setVisibility(8);
            this.G.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.y, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.B = linearLayout3;
        linearLayout3.setOrientation(0);
        this.y.addView(this.B, k7.c6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setEnabled(false);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163840);
        this.b.setImeOptions(6);
        this.B.addView(this.b, k7.c6.n(-2, 36));
        lg.f fVar = new lg.f(this, context, 2);
        this.a = fVar;
        fVar.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackground(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        this.B.addView(this.a, k7.c6.n(-1, 36));
        int i14 = 3;
        this.a.addTextChangedListener(new n0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.C = linearLayout4;
        linearLayout4.setOrientation(1);
        this.y.addView(this.C, k7.c6.n(-1, -2));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, this, null, true, ChatObject.isChannel(this.U));
        this.D = y80Var;
        y80Var.setDelegate(new wo(this, context));
        this.D.d(0, null, false);
        this.C.addView(this.D);
        xo xoVar = new xo(this, context, this.resourceProvider);
        this.f = xoVar;
        xoVar.setBottomPadding(6);
        this.h.addView(this.f, k7.c6.n(-2, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.c = a9Var;
        a9Var.setImportantForAccessibility(1);
        this.h.addView(this.c, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.d0 = s4Var;
        this.h.addView(s4Var, k7.c6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.x, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (b) null);
        this.b0 = z6Var2;
        this.h.addView(z6Var2, k7.c6.n(-1, -2));
        eg.s3 s3Var = this.h;
        dp dpVar = new dp(this, context);
        this.H = dpVar;
        s3Var.addView(dpVar, k7.c6.n(-1, -2));
        this.H.setVisibility((this.S || this.K.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
        this.E = o8Var;
        o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.E.setOnClickListener(new uo(this, i14));
        this.h.addView(this.E, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.F = a9Var2;
        this.h.addView(a9Var2, k7.c6.n(-1, -2));
        zo zoVar = new zo(this, context, this.U, context);
        this.R = zoVar;
        TLRPC.ChatFull chatFull = this.V;
        zoVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.X) ? false : true);
        zo zoVar2 = this.R;
        TLRPC.ChatFull chatFull2 = this.V;
        org.telegram.ui.Cells.a9 a9Var3 = zoVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(zoVar2.n);
        boolean isPublic = ChatObject.isPublic(zoVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            a9Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            a9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.il, false), new org.telegram.ui.Components.gm(29, chatFull2, this)));
        }
        this.h.addView(this.R);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.N);
        org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context, 23);
        this.O = m4Var3;
        m4Var3.setHeight(46);
        this.O.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.N.addView(this.O, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.P = s8Var;
        s8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.Y, false);
        this.P.setOnClickListener(new uo(this, 4));
        this.N.addView(this.P, k7.c6.n(-1, -2));
        this.Q = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        if (!this.X || ChatObject.isMegagroup(this.U)) {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.N.addView(this.Q, k7.c6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.U, true);
        if (!this.S && publicUsername != null) {
            this.j0 = true;
            this.a.setText(publicUsername);
            this.a.setSelection(publicUsername.length());
            this.j0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.W) {
                this.V = chatFull;
                this.i0 = chatFull.exported_invite;
                b0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.W) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var == null || f5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        int i10 = org.telegram.ui.ActionBar.k6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.G, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 4, null, null, null, null, i14));
        lg.f fVar2 = this.a;
        int i15 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar2, TLObject.FLAG_23, null, null, null, null, i15));
        LinearLayout linearLayout = this.s;
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, TLObject.FLAG_23, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b0, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.k6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.k6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.k6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        lg.f fVar;
        super.onBecomeFullyVisible();
        if (!this.k0 || (fVar = this.a) == null) {
            return;
        }
        fVar.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z4 = this.k0;
        ArrayList arrayList = this.K;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.W));
        this.U = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = getMessagesStorage().getChatSync(this.W);
            this.U = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.U, true);
                if (this.V == null) {
                    TLRPC.ChatFull loadChatInfo = getMessagesStorage().loadChatInfo(this.W, ChatObject.isChannel(this.U), new CountDownLatch(1), false, false);
                    this.V = loadChatInfo;
                }
            }
            return false;
        }
        this.S = (z4 || ChatObject.isPublic(this.U)) ? false : true;
        this.X = ChatObject.isChannel(this.U) && !this.U.megagroup;
        TLRPC.Chat chat2 = this.U;
        this.Y = chat2.noforwards;
        if ((z4 && !ChatObject.isPublic(chat2)) || (this.S && this.U.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new qo(this, 3));
        }
        if (this.S && this.V != null) {
            getMessagesController().loadFullChat(this.W, this.classGuid, true);
        }
        if (this.U != null) {
            this.J.clear();
            arrayList.clear();
            for (int i10 = 0; i10 < this.U.usernames.size(); i10++) {
                if (this.U.usernames.get(i10).active) {
                    arrayList.add(this.U.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < this.U.usernames.size(); i11++) {
                if (!this.U.usernames.get(i11).active) {
                    arrayList.add(this.U.usernames.get(i11));
                }
            }
        }
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        eg.s3 s3Var = this.h;
        if (s3Var != null) {
            s3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.V;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.i0 = tL_chatInviteExported;
            this.D.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.D.c(this.i0, this.W);
        }
    }
}
