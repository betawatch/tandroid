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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout B;
    public LinearLayout C;
    public org.telegram.ui.Components.x80 D;
    public org.telegram.ui.Cells.n8 E;
    public org.telegram.ui.Cells.z8 F;
    public org.telegram.ui.Cells.y6 G;
    public ep H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public oa L;
    public ArrayList M;
    public LinearLayout N;
    public org.telegram.ui.Cells.l4 O;
    public org.telegram.ui.Cells.r8 P;
    public org.telegram.ui.Cells.z8 Q;
    public bp R;
    public boolean S;
    public boolean T;
    public TLRPC.Chat U;
    public TLRPC.ChatFull V;
    public long W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public kg.f a;
    public boolean a0;
    public EditTextBoldCursor b;
    public org.telegram.ui.Cells.y6 b0;
    public org.telegram.ui.Cells.z8 c;
    public ArrayList c0;
    public org.telegram.ui.Cells.l4 d;
    public org.telegram.ui.Cells.r4 d0;
    public org.telegram.ui.Cells.l4 e;
    public int e0;
    public zo f;
    public String f0;
    public hc g0;
    public dg.u3 h;
    public boolean h0;
    public TLRPC.TL_chatInviteExported i0;
    public boolean j0;
    public boolean k0;
    public HashMap l0;
    public org.telegram.ui.Components.t60 m0;
    public org.telegram.ui.ActionBar.w0 n;
    public uo n0;
    public ValueAnimator o0;
    public Boolean p0;
    public boolean q0;
    public org.telegram.ui.Components.lr r;
    public LinearLayout s;
    public org.telegram.ui.Cells.h6 v;
    public org.telegram.ui.Cells.h6 w;
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
        hc hcVar = this.g0;
        if (hcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hcVar);
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
                this.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
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
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
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
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
            return false;
        }
        this.f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.F6);
        this.f0 = str;
        hc hcVar2 = new hc(26, this, str);
        this.g0 = hcVar2;
        AndroidUtilities.runOnUIThread(hcVar2, 300L);
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
        final fp fpVar = this;
        AndroidUtilities.runOnUIThread(fpVar.n0, 200L);
        boolean z12 = true;
        if (fpVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(fpVar.U, true);
            if (fpVar.S || (((publicUsername != null || fpVar.a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(fpVar.a.getText().toString()))) || fpVar.a.length() == 0 || fpVar.h0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = fpVar.S ? "" : fpVar.a.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!fpVar.S || (arrayList = fpVar.U.usernames) == null || arrayList.isEmpty()) {
                        z4 = true;
                    } else if (fpVar.q0) {
                        z4 = false;
                    } else {
                        fpVar.q0 = true;
                        boolean z13 = false;
                        for (int i10 = 0; i10 < fpVar.U.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = fpVar.U.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(fpVar.U);
                            fpVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new so(fpVar, 1));
                        } else {
                            fpVar.q0 = false;
                        }
                        z4 = !z13;
                    }
                    if (z4) {
                        z10 = true;
                        if (z10) {
                            return;
                        }
                        TLRPC.Chat chat = fpVar.U;
                        if (chat.noforwards != fpVar.Y) {
                            if (!ChatObject.isChannel(chat)) {
                                fpVar.a0(true);
                                final int i11 = 2;
                                fpVar.getMessagesController().convertToMegaGroup(fpVar.getParentActivity(), fpVar.W, fpVar, new MessagesStorage.LongCallback(fpVar) { // from class: org.telegram.ui.to
                                    public final /* synthetic */ fp b;

                                    {
                                        this.b = fpVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j10) {
                                        switch (i11) {
                                            case 0:
                                                fp fpVar2 = this.b;
                                                if (j10 == 0) {
                                                    fpVar2.getClass();
                                                    break;
                                                } else {
                                                    fpVar2.W = j10;
                                                    fpVar2.U = fpVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                    fpVar2.Y();
                                                    break;
                                                }
                                            case 1:
                                                fp fpVar3 = this.b;
                                                if (j10 == 0) {
                                                    fpVar3.getClass();
                                                    break;
                                                } else {
                                                    fpVar3.W = j10;
                                                    fpVar3.U = fpVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                    fpVar3.Y();
                                                    break;
                                                }
                                            default:
                                                fp fpVar4 = this.b;
                                                if (j10 == 0) {
                                                    fpVar4.getClass();
                                                    break;
                                                } else {
                                                    fpVar4.W = j10;
                                                    fpVar4.U = fpVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                    MessagesController messagesController = fpVar4.getMessagesController();
                                                    long j11 = -fpVar4.W;
                                                    TLRPC.Chat chat2 = fpVar4.U;
                                                    boolean z14 = fpVar4.Y;
                                                    chat2.noforwards = z14;
                                                    messagesController.toggleChatNoForwards(j11, z14);
                                                    fpVar4.Y();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z11 = false;
                                if (z11) {
                                    return;
                                }
                                if (fpVar.R != null) {
                                    if (fpVar.getParentActivity() != null) {
                                        if (!fpVar.X && !ChatObject.isChannel(fpVar.U)) {
                                            bp bpVar = fpVar.R;
                                            if (bpVar.f || bpVar.h) {
                                                final int i12 = 0;
                                                fpVar.getMessagesController().convertToMegaGroup(fpVar.getParentActivity(), fpVar.W, fpVar, new MessagesStorage.LongCallback(fpVar) { // from class: org.telegram.ui.to
                                                    public final /* synthetic */ fp b;

                                                    {
                                                        this.b = fpVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j10) {
                                                        switch (i12) {
                                                            case 0:
                                                                fp fpVar2 = this.b;
                                                                if (j10 == 0) {
                                                                    fpVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    fpVar2.W = j10;
                                                                    fpVar2.U = fpVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                                    fpVar2.Y();
                                                                    break;
                                                                }
                                                            case 1:
                                                                fp fpVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    fpVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    fpVar3.W = j10;
                                                                    fpVar3.U = fpVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                                    fpVar3.Y();
                                                                    break;
                                                                }
                                                            default:
                                                                fp fpVar4 = this.b;
                                                                if (j10 == 0) {
                                                                    fpVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    fpVar4.W = j10;
                                                                    fpVar4.U = fpVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                                    MessagesController messagesController = fpVar4.getMessagesController();
                                                                    long j11 = -fpVar4.W;
                                                                    TLRPC.Chat chat2 = fpVar4.U;
                                                                    boolean z14 = fpVar4.Y;
                                                                    chat2.noforwards = z14;
                                                                    messagesController.toggleChatNoForwards(j11, z14);
                                                                    fpVar4.Y();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (fpVar.U.join_to_send != fpVar.R.f) {
                                            MessagesController messagesController = fpVar.getMessagesController();
                                            long j10 = fpVar.W;
                                            TLRPC.Chat chat2 = fpVar.U;
                                            boolean z14 = fpVar.R.f;
                                            chat2.join_to_send = z14;
                                            messagesController.toggleChatJoinToSend(j10, z14, null, null);
                                        }
                                        if (fpVar.U.join_request != fpVar.R.h || fpVar.T) {
                                            MessagesController messagesController2 = fpVar.getMessagesController();
                                            long j11 = fpVar.W;
                                            TLRPC.Chat chat3 = fpVar.U;
                                            boolean z15 = fpVar.R.h;
                                            chat3.join_request = z15;
                                            messagesController2.toggleChatJoinRequest(j11, 0L, z15, fpVar.T, false, null, null);
                                        }
                                    }
                                    z12 = false;
                                }
                                if (z12) {
                                    fpVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = fpVar.getMessagesController();
                            long j12 = -fpVar.W;
                            TLRPC.Chat chat4 = fpVar.U;
                            boolean z16 = fpVar.Y;
                            chat4.noforwards = z16;
                            messagesController3.toggleChatNoForwards(j12, z16);
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                } else if (ChatObject.isChannel(fpVar.U)) {
                    fpVar.getMessagesController().updateChannelUserName(fpVar, fpVar.W, obj, new uo(fpVar, 1), new uo(fpVar, 2));
                    fpVar = fpVar;
                } else {
                    final int i13 = 1;
                    fpVar.getMessagesController().convertToMegaGroup(fpVar.getParentActivity(), fpVar.W, fpVar, new MessagesStorage.LongCallback(fpVar) { // from class: org.telegram.ui.to
                        public final /* synthetic */ fp b;

                        {
                            this.b = fpVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j102) {
                            switch (i13) {
                                case 0:
                                    fp fpVar2 = this.b;
                                    if (j102 == 0) {
                                        fpVar2.getClass();
                                        break;
                                    } else {
                                        fpVar2.W = j102;
                                        fpVar2.U = fpVar2.getMessagesController().getChat(Long.valueOf(j102));
                                        fpVar2.Y();
                                        break;
                                    }
                                case 1:
                                    fp fpVar3 = this.b;
                                    if (j102 == 0) {
                                        fpVar3.getClass();
                                        break;
                                    } else {
                                        fpVar3.W = j102;
                                        fpVar3.U = fpVar3.getMessagesController().getChat(Long.valueOf(j102));
                                        fpVar3.Y();
                                        break;
                                    }
                                default:
                                    fp fpVar4 = this.b;
                                    if (j102 == 0) {
                                        fpVar4.getClass();
                                        break;
                                    } else {
                                        fpVar4.W = j102;
                                        fpVar4.U = fpVar4.getMessagesController().getChat(Long.valueOf(j102));
                                        MessagesController messagesController4 = fpVar4.getMessagesController();
                                        long j112 = -fpVar4.W;
                                        TLRPC.Chat chat22 = fpVar4.U;
                                        boolean z142 = fpVar4.Y;
                                        chat22.noforwards = z142;
                                        messagesController4.toggleChatNoForwards(j112, z142);
                                        fpVar4.Y();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) fpVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(fpVar.f);
                fpVar.a0(false);
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
        eg.v0 v0Var = new eg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.s0 = this.X;
        v0Var.E0 = new uo(this, 0);
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
            ofFloat.addUpdateListener(new g3(this, 7));
            this.o0.setDuration((long) (Math.abs(this.r.c - (z4 ? 1.0f : 0.0f)) * 200.0f));
            this.o0.setInterpolator(org.telegram.ui.Components.mr.f);
            this.o0.start();
        }
    }

    public final void b0() {
        if (this.G == null) {
            return;
        }
        int i10 = 8;
        if (this.S || this.Z || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.z8 z8Var = this.c;
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            z8Var.setTag(Integer.valueOf(i11));
            this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
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
            org.telegram.ui.Components.x80 x80Var = this.D;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.i0;
            x80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.D.c(this.i0, this.W);
            zo zoVar = this.f;
            zoVar.setVisibility((this.S || zoVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.W);
            this.F.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.W)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.z8 z8Var2 = this.c;
            int i12 = org.telegram.ui.ActionBar.j6.p7;
            z8Var2.setTag(Integer.valueOf(i12));
            this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
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
        bp bpVar = this.R;
        if (bpVar != null) {
            bpVar.setVisibility((!this.X || this.S) ? 0 : 8);
            bp bpVar2 = this.R;
            TLRPC.ChatFull chatFull2 = this.V;
            bpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.X) ? false : true);
        }
        ep epVar = this.H;
        if (epVar != null) {
            if (!this.S && !this.K.isEmpty()) {
                i10 = 0;
            }
            epVar.setVisibility(i10);
        }
        V();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 18));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(mutate, new org.telegram.ui.Components.qp(org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        this.r = lrVar;
        this.n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), lrVar);
        this.h = new dg.u3(context);
        xo xoVar = new xo(this, context, this.h, this.resourceProvider);
        this.fragmentView = xoVar;
        xoVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.Components.do0 do0Var = (org.telegram.ui.Components.do0) this.fragmentView;
        do0Var.setFillViewport(true);
        do0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(do0Var);
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
        this.h.addView(this.s, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.e = l4Var;
        l4Var.setHeight(46);
        if (this.X) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.s.addView(this.e);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
        this.w = h6Var;
        if (this.X) {
            h6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.S);
        } else {
            h6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.S);
        }
        this.s.addView(this.w, k7.b6.n(-1, -2));
        this.w.setOnClickListener(new wo(this, i10));
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
        this.v = h6Var2;
        if (this.X) {
            h6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.S);
        } else {
            h6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.S);
        }
        this.s.addView(this.v, k7.b6.n(-1, -2));
        this.v.setOnClickListener(new wo(this, 2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
        this.G = y6Var;
        this.h.addView(y6Var, k7.b6.n(-1, -2));
        if (z4) {
            this.w.setVisibility(8);
            this.v.setVisibility(8);
            this.G.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.y, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, 23);
        this.d = l4Var2;
        this.y.addView(l4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.B = linearLayout3;
        linearLayout3.setOrientation(0);
        this.y.addView(this.B, k7.b6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setEnabled(false);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163840);
        this.b.setImeOptions(6);
        this.B.addView(this.b, k7.b6.n(-2, 36));
        kg.f fVar = new kg.f(this, context, 2);
        this.a = fVar;
        fVar.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackground(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        this.B.addView(this.a, k7.b6.n(-1, 36));
        int i14 = 3;
        this.a.addTextChangedListener(new p0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.C = linearLayout4;
        linearLayout4.setOrientation(1);
        this.y.addView(this.C, k7.b6.n(-1, -2));
        org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(context, this, null, true, ChatObject.isChannel(this.U));
        this.D = x80Var;
        x80Var.setDelegate(new yo(this, context));
        this.D.d(0, null, false);
        this.C.addView(this.D);
        zo zoVar = new zo(this, context, this.resourceProvider);
        this.f = zoVar;
        zoVar.setBottomPadding(6);
        this.h.addView(this.f, k7.b6.n(-2, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.c = z8Var;
        z8Var.setImportantForAccessibility(1);
        this.h.addView(this.c, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
        this.d0 = r4Var;
        this.h.addView(r4Var, k7.b6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.x, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (b) null);
        this.b0 = y6Var2;
        this.h.addView(y6Var2, k7.b6.n(-1, -2));
        dg.u3 u3Var = this.h;
        ep epVar = new ep(this, context);
        this.H = epVar;
        u3Var.addView(epVar, k7.b6.n(-1, -2));
        this.H.setVisibility((this.S || this.K.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
        this.E = n8Var;
        n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.E.setOnClickListener(new wo(this, i14));
        this.h.addView(this.E, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.F = z8Var2;
        this.h.addView(z8Var2, k7.b6.n(-1, -2));
        bp bpVar = new bp(this, context, this.U, context);
        this.R = bpVar;
        TLRPC.ChatFull chatFull = this.V;
        bpVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.X) ? false : true);
        bp bpVar2 = this.R;
        TLRPC.ChatFull chatFull2 = this.V;
        org.telegram.ui.Cells.z8 z8Var3 = bpVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(bpVar2.n);
        boolean isPublic = ChatObject.isPublic(bpVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            z8Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            z8Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), new org.telegram.ui.Components.em(29, chatFull2, this)));
        }
        this.h.addView(this.R);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.N);
        org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context, 23);
        this.O = l4Var3;
        l4Var3.setHeight(46);
        this.O.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.N.addView(this.O, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.P = r8Var;
        r8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.Y, false);
        this.P.setOnClickListener(new wo(this, 4));
        this.N.addView(this.P, k7.b6.n(-1, -2));
        this.Q = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        if (!this.X || ChatObject.isMegagroup(this.U)) {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.N.addView(this.Q, k7.b6.n(-1, -2));
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
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var == null || e5Var.getLastFragment() != this) {
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        int i10 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4, null, null, null, null, i14));
        kg.f fVar2 = this.a;
        int i15 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fVar2, TLObject.FLAG_23, null, null, null, null, i15));
        LinearLayout linearLayout = this.s;
        int i16 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, TLObject.FLAG_23, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.j6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.j6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        kg.f fVar;
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
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new so(this, 3));
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
        dg.u3 u3Var = this.h;
        if (u3Var != null) {
            u3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
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
