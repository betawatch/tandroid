package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mr extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public boolean A1;
    public int B0;
    public org.telegram.ui.Components.c10 B1;
    public int C0;
    public RadialProgressView C1;
    public int D0;
    public int D1;
    public final ArrayList E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public final ArrayList G;
    public int G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public int I0;
    public final a0.h J;
    public int J0;
    public final a0.h K;
    public int K0;
    public final a0.h L;
    public int L0;
    public long M;
    public int M0;
    public final int N;
    public int N0;
    public final boolean O;
    public int O0;
    public boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public int R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public int U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;
    public ir a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.fy0 b;
    public int b0;
    public int b1;
    public bi.r1 c;
    public int c0;
    public int c1;
    public ig.j0 d;
    public int d0;
    public final int d1;
    public lr e;
    public int e0;
    public int e1;
    public org.telegram.ui.ActionBar.y5 f;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public UndoView h;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public int j0;
    public int j1;
    public int k0;
    public boolean k1;
    public int l0;
    public fr l1;
    public int m0;
    public final boolean m1;
    public TLRPC.Chat n;
    public int n0;
    public boolean n1;
    public int o0;
    public int o1;
    public int p0;
    public int p1;
    public int q0;
    public boolean q1;
    public TLRPC.ChatFull r;
    public int r0;
    public int r1;
    public final boolean s;
    public int s0;
    public final boolean s1;
    public int t0;
    public final boolean t1;
    public int u0;
    public boolean u1;
    public final boolean v;
    public boolean v0;
    public boolean v1;
    public final boolean w;
    public int w0;
    public boolean w1;
    public final String x;
    public int x0;
    public boolean x1;
    public TLRPC.TL_chatBannedRights y;
    public int y0;
    public long y1;
    public int z0;
    public long z1;

    public mr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.y = new TLRPC.TL_chatBannedRights();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.J = new a0.h();
        this.K = new a0.h();
        this.L = new a0.h();
        this.y1 = 10L;
        this.z1 = 10L;
        this.M = this.arguments.getLong("chat_id");
        this.N = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR);
        this.O = this.arguments.getBoolean("transfer");
        this.m1 = this.arguments.getBoolean("open_search");
        this.d1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.M));
        this.n = chat;
        boolean z10 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.y;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z11 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z11;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_reactions = tL_chatBannedRights.send_reactions;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            tL_chatBannedRights2.manage_linked_peers = tL_chatBannedRights.manage_linked_peers;
            boolean z12 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z12;
            boolean z13 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z13;
            boolean z14 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z14;
            boolean z15 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z15;
            boolean z16 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z16;
            boolean z17 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z17;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z11 && z17 && z16 && z15 && z14 && z13 && z12) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.x = ChatObject.getBannedRightsString(this.y);
        boolean isCommunity = ChatObject.isCommunity(this.n);
        this.v = isCommunity;
        if (ChatObject.isChannel(this.n) && !this.n.megagroup && !isCommunity) {
            z10 = true;
        }
        this.s = z10;
        this.w = ChatObject.isForum(this.n);
        TLRPC.Chat chat2 = this.n;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.u1 = z18;
            this.s1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.v1 = z19;
            this.t1 = z19;
        }
    }

    public static /* synthetic */ void V(mr mrVar, long j10) {
        if (j10 != 0) {
            mrVar.M = j10;
            mrVar.n = MessagesController.getInstance(mrVar.currentAccount).getChat(Long.valueOf(j10));
            mrVar.v0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(final mr mrVar, View view, int i10) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m10;
        TLObject E;
        long j10;
        String str;
        boolean z10;
        long peerId;
        TLObject tLObject;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject2;
        boolean canBlockUsers;
        boolean z12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i11 = mrVar.d1;
        a0.h hVar = mrVar.J;
        a0.h hVar2 = mrVar.L;
        boolean z13 = mrVar.s;
        int i12 = mrVar.N;
        final int i13 = 0;
        final int i14 = 1;
        boolean z14 = mrVar.c.getAdapter() == mrVar.a;
        if (i10 == mrVar.g1) {
            boolean z15 = !mrVar.u1;
            mrVar.u1 = z15;
            ((org.telegram.ui.Cells.a9) view).setChecked(z15);
            AndroidUtilities.updateVisibleRows(mrVar.c);
            gr x02 = mrVar.x0();
            mrVar.C0();
            mrVar.B0(x02);
            mrVar.a.m(mrVar.i1);
        } else if (i10 == mrVar.h1) {
            boolean z16 = !mrVar.v1;
            mrVar.v1 = z16;
            ((org.telegram.ui.Cells.a9) view).setChecked(z16);
            AndroidUtilities.updateVisibleRows(mrVar.c);
            gr x03 = mrVar.x0();
            mrVar.C0();
            mrVar.B0(x03);
            mrVar.a.m(mrVar.i1);
        } else if (i10 == mrVar.m0) {
            boolean z17 = !mrVar.x1;
            mrVar.x1 = z17;
            ((org.telegram.ui.Cells.a9) view).setChecked(z17);
            AndroidUtilities.updateVisibleRows(mrVar.c);
            gr x04 = mrVar.x0();
            mrVar.C0();
            mrVar.B0(x04);
            mrVar.a.m(mrVar.m0);
        } else if (z14) {
            if (mrVar.q0(i10)) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                if (i10 == mrVar.U) {
                    mrVar.y.send_photos = !r15.send_photos;
                } else if (i10 == mrVar.V) {
                    mrVar.y.send_videos = !r14.send_videos;
                } else if (i10 == mrVar.W) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = mrVar.y;
                    boolean z18 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z18;
                    tL_chatBannedRights2.send_gifs = z18;
                    tL_chatBannedRights2.send_games = z18;
                    tL_chatBannedRights2.send_stickers = z18;
                } else if (i10 == mrVar.X) {
                    mrVar.y.send_audios = !r14.send_audios;
                } else if (i10 == mrVar.Y) {
                    mrVar.y.send_docs = !r14.send_docs;
                } else if (i10 == mrVar.Z) {
                    mrVar.y.send_voices = !r14.send_voices;
                } else if (i10 == mrVar.a0) {
                    mrVar.y.send_roundvideos = !r14.send_roundvideos;
                } else if (i10 == mrVar.b0) {
                    if (mrVar.y.send_plain && (m10 = mrVar.d.m(mrVar.S)) != null) {
                        AndroidUtilities.shakeViewSpring(m10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        mrVar.y.embed_links = !r14.embed_links;
                    }
                } else if (i10 == mrVar.c0) {
                    mrVar.y.send_polls = !r14.send_polls;
                } else if (i10 == mrVar.j0) {
                    mrVar.y.send_reactions = !r14.send_reactions;
                }
                y1Var.c(!y1Var.b(), true);
                AndroidUtilities.updateVisibleRows(mrVar.c);
                gr x05 = mrVar.x0();
                mrVar.C0();
                mrVar.B0(x05);
            } else if (i10 == mrVar.P0) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                boolean z19 = !z8Var.d.h;
                mrVar.q1 = z19;
                z8Var.setChecked(z19);
                AndroidUtilities.updateVisibleRows(mrVar.c);
                gr x06 = mrVar.x0();
                mrVar.C0();
                mrVar.B0(x06);
            } else {
                if (i10 == mrVar.y0) {
                    if (i12 == 0 || i12 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", mrVar.M);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i12 == 0 ? 2 : 3);
                        mr mrVar2 = new mr(bundle);
                        mrVar2.y0(mrVar.r);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = mrVar.y;
                        if (tL_chatBannedRights3 != null) {
                            mrVar2.y = tL_chatBannedRights3;
                        }
                        mrVar2.l1 = new ar(mrVar);
                        mrVar.presentFragment(mrVar2);
                        return;
                    }
                    if (i12 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", mrVar.M);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        mr mrVar3 = new mr(bundle2);
                        mrVar3.l1 = new br(mrVar);
                        mrVar3.y0(mrVar.r);
                        mrVar.presentFragment(mrVar3);
                        return;
                    }
                    if (i12 == 2) {
                        Bundle i15 = a1.g.i("addToGroup", true);
                        i15.putLong(z13 ? "channelId" : "chatId", mrVar.n.id);
                        t60 t60Var = new t60(i15);
                        t60Var.I = mrVar.r;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        t60Var.J = hVar;
                        t60Var.x = new dr(mrVar, t60Var);
                        mrVar.presentFragment(t60Var);
                        return;
                    }
                    return;
                }
                if (i10 == mrVar.u0) {
                    mrVar.presentFragment(new wb(mrVar.n));
                    return;
                }
                if (i10 == mrVar.w0) {
                    final org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    TLRPC.ChatFull chatFull3 = mrVar.r;
                    if (chatFull3 != null && !chatFull3.antispam && mrVar.m0() < mrVar.getMessagesController().telegramAntispamGroupSizeMin) {
                        org.telegram.ui.Components.wc.b0(mrVar).R(R.raw.msg_antispam, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", mrVar.getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (mrVar.r == null || !ChatObject.canUserDoAdminAction(mrVar.n, 13) || mrVar.v0) {
                        return;
                    }
                    mrVar.v0 = true;
                    final boolean z20 = mrVar.r.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = mrVar.getMessagesController().getInputChannel(mrVar.M);
                    TLRPC.ChatFull chatFull4 = mrVar.r;
                    boolean z21 = !chatFull4.antispam;
                    chatFull4.antispam = z21;
                    tL_channels_toggleAntiSpam.enabled = z21;
                    v8Var.setChecked(z21);
                    v8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(mrVar.n, 13) && ((chatFull2 = mrVar.r) == null || chatFull2.antispam || mrVar.m0() >= mrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    mrVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(mrVar) { // from class: org.telegram.ui.mq
                        public final /* synthetic */ mr b;

                        {
                            this.b = mrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    final mr mrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        mrVar4.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject3, false);
                                        mrVar4.getMessagesController().putChatFull(mrVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 0;
                                        final org.telegram.ui.Cells.v8 v8Var2 = v8Var;
                                        final boolean z22 = z20;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i16) {
                                                    case 0:
                                                        mr mrVar5 = mrVar4;
                                                        if (mrVar5.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = mrVar5.r;
                                                            boolean z23 = z22;
                                                            chatFull7.antispam = z23;
                                                            org.telegram.ui.Cells.v8 v8Var3 = v8Var2;
                                                            v8Var3.setChecked(z23);
                                                            v8Var3.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar5.n, 13) || ((chatFull5 = mrVar5.r) != null && chatFull5.antispam && mrVar5.m0() < mrVar5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar5).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        mr mrVar6 = mrVar4;
                                                        if (mrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = mrVar6.r;
                                                            boolean z24 = z22;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.v8 v8Var4 = v8Var2;
                                                            v8Var4.setChecked(z24);
                                                            v8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar6.n, 2) || ((chatFull6 = mrVar6.r) != null && chatFull6.participants_hidden && mrVar6.m0() < mrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar6).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    mrVar4.v0 = false;
                                    break;
                                default:
                                    final mr mrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        mrVar5.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject3, false);
                                        mrVar5.getMessagesController().putChatFull(mrVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 1;
                                        final org.telegram.ui.Cells.v8 v8Var3 = v8Var;
                                        final boolean z23 = z20;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        mr mrVar52 = mrVar5;
                                                        if (mrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = mrVar52.r;
                                                            boolean z232 = z23;
                                                            chatFull7.antispam = z232;
                                                            org.telegram.ui.Cells.v8 v8Var32 = v8Var3;
                                                            v8Var32.setChecked(z232);
                                                            v8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar52.n, 13) || ((chatFull5 = mrVar52.r) != null && chatFull5.antispam && mrVar52.m0() < mrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar52).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        mr mrVar6 = mrVar5;
                                                        if (mrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = mrVar6.r;
                                                            boolean z24 = z23;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.v8 v8Var4 = v8Var3;
                                                            v8Var4.setChecked(z24);
                                                            v8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar6.n, 2) || ((chatFull6 = mrVar6.r) != null && chatFull6.participants_hidden && mrVar6.m0() < mrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar6).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    mrVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == mrVar.I0) {
                    final org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                    if (mrVar.m0() < mrVar.getMessagesController().hiddenMembersGroupSizeMin) {
                        org.telegram.ui.Components.wc.b0(mrVar).R(R.raw.contacts_sync_off, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", mrVar.getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (mrVar.r == null || !ChatObject.canUserDoAdminAction(mrVar.n, 2) || mrVar.H0) {
                        return;
                    }
                    mrVar.H0 = true;
                    final boolean z22 = mrVar.r.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = mrVar.getMessagesController().getInputChannel(mrVar.M);
                    TLRPC.ChatFull chatFull5 = mrVar.r;
                    boolean z23 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z23;
                    tL_channels_toggleParticipantsHidden.enabled = z23;
                    v8Var2.setChecked(z23);
                    Switch checkBox = v8Var2.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(mrVar.n, 2) || ((chatFull = mrVar.r) != null && !chatFull.participants_hidden && mrVar.m0() < mrVar.getMessagesController().hiddenMembersGroupSizeMin)) {
                        i13 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i13);
                    mrVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(mrVar) { // from class: org.telegram.ui.mq
                        public final /* synthetic */ mr b;

                        {
                            this.b = mrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final mr mrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        mrVar4.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject3, false);
                                        mrVar4.getMessagesController().putChatFull(mrVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 0;
                                        final org.telegram.ui.Cells.v8 v8Var22 = v8Var2;
                                        final boolean z222 = z22;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i16) {
                                                    case 0:
                                                        mr mrVar52 = mrVar4;
                                                        if (mrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = mrVar52.r;
                                                            boolean z232 = z222;
                                                            chatFull7.antispam = z232;
                                                            org.telegram.ui.Cells.v8 v8Var32 = v8Var22;
                                                            v8Var32.setChecked(z232);
                                                            v8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar52.n, 13) || ((chatFull52 = mrVar52.r) != null && chatFull52.antispam && mrVar52.m0() < mrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar52).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        mr mrVar6 = mrVar4;
                                                        if (mrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = mrVar6.r;
                                                            boolean z24 = z222;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.v8 v8Var4 = v8Var22;
                                                            v8Var4.setChecked(z24);
                                                            v8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar6.n, 2) || ((chatFull6 = mrVar6.r) != null && chatFull6.participants_hidden && mrVar6.m0() < mrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar6).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    mrVar4.v0 = false;
                                    break;
                                default:
                                    final mr mrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        mrVar5.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject3, false);
                                        mrVar5.getMessagesController().putChatFull(mrVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 1;
                                        final org.telegram.ui.Cells.v8 v8Var3 = v8Var2;
                                        final boolean z232 = z22;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        mr mrVar52 = mrVar5;
                                                        if (mrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = mrVar52.r;
                                                            boolean z2322 = z232;
                                                            chatFull7.antispam = z2322;
                                                            org.telegram.ui.Cells.v8 v8Var32 = v8Var3;
                                                            v8Var32.setChecked(z2322);
                                                            v8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar52.n, 13) || ((chatFull52 = mrVar52.r) != null && chatFull52.antispam && mrVar52.m0() < mrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar52).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        mr mrVar6 = mrVar5;
                                                        if (mrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = mrVar6.r;
                                                            boolean z24 = z232;
                                                            chatFull8.participants_hidden = z24;
                                                            org.telegram.ui.Cells.v8 v8Var4 = v8Var3;
                                                            v8Var4.setChecked(z24);
                                                            v8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(mrVar6.n, 2) || ((chatFull6 = mrVar6.r) != null && chatFull6.participants_hidden && mrVar6.m0() < mrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.wc.b0(mrVar6).R(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    mrVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == mrVar.K0) {
                    if (mrVar.n == null) {
                        return;
                    }
                    org.telegram.ui.Cells.v8 v8Var3 = (org.telegram.ui.Cells.v8) view;
                    boolean d = v8Var3.d();
                    v8Var3.setChecked(!v8Var3.d());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(mrVar.n);
                    TLRPC.Chat chat = mrVar.n;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = mrVar.n.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !v8Var3.d();
                    mrVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new org.telegram.messenger.a(), new ai.b1(mrVar, v8Var3, d, i14));
                } else {
                    if (i10 == mrVar.A0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", mrVar.M);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        mr mrVar4 = new mr(bundle3);
                        mrVar4.y0(mrVar.r);
                        mrVar.presentFragment(mrVar4);
                        return;
                    }
                    if (i10 == mrVar.s0) {
                        mrVar.showDialog(new er(mrVar, mrVar.getParentActivity(), mrVar));
                    } else {
                        if (i10 == mrVar.z0) {
                            if (mrVar.r != null) {
                                lh0 lh0Var = new lh0(mrVar.M, 0L, 0);
                                TLRPC.ChatFull chatFull6 = mrVar.r;
                                lh0Var.i0(chatFull6, chatFull6.exported_invite);
                                mrVar.presentFragment(lh0Var);
                                return;
                            }
                            return;
                        }
                        if ((i10 > mrVar.R && i10 <= Math.max(mrVar.k0, mrVar.f0)) || i10 == mrVar.l0) {
                            org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
                            boolean isEnabled = z8Var2.isEnabled();
                            Switch r42 = z8Var2.d;
                            if (isEnabled) {
                                if (r42.F != null) {
                                    if (ChatObject.isPublic(mrVar.n) && (i10 == mrVar.h0 || i10 == mrVar.f0)) {
                                        org.telegram.messenger.wh.n(R.string.EditCantEditPermissionsPublic, org.telegram.ui.Components.wc.b0(mrVar), null);
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(mrVar.currentAccount, mrVar.M) && (i10 == mrVar.h0 || i10 == mrVar.f0)) {
                                        org.telegram.messenger.wh.n(R.string.EditCantEditPermissionsDiscussion, org.telegram.ui.Components.wc.b0(mrVar), null);
                                        return;
                                    } else {
                                        org.telegram.ui.Components.wc.b0(mrVar).t(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions), null).j();
                                        return;
                                    }
                                }
                                if (i10 == mrVar.T) {
                                    gr x07 = mrVar.x0();
                                    mrVar.k1 = !mrVar.k1;
                                    AndroidUtilities.updateVisibleRows(mrVar.c);
                                    mrVar.B0(x07);
                                    return;
                                }
                                z8Var2.setChecked(!r42.h);
                                if (i10 == mrVar.f0) {
                                    mrVar.y.change_info = !r0.change_info;
                                    return;
                                }
                                if (i10 == mrVar.l0) {
                                    mrVar.y.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i10 == mrVar.g0) {
                                    mrVar.y.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i10 == mrVar.k0) {
                                    mrVar.y.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i10 == mrVar.h0) {
                                    mrVar.y.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i10 == mrVar.i0) {
                                    mrVar.y.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i10 == mrVar.S) {
                                    mrVar.y.send_plain = !r1.send_plain;
                                    int i16 = mrVar.b0;
                                    if (i16 >= 0) {
                                        mrVar.a.m(i16);
                                    }
                                    int i17 = mrVar.T;
                                    if (i17 >= 0) {
                                        mrVar.a.m(i17);
                                    }
                                    gr x08 = mrVar.x0();
                                    mrVar.C0();
                                    mrVar.B0(x08);
                                    return;
                                }
                                if (i10 == mrVar.T) {
                                    gr x09 = mrVar.x0();
                                    mrVar.k1 = !mrVar.k1;
                                    AndroidUtilities.updateVisibleRows(mrVar.c);
                                    mrVar.B0(x09);
                                    return;
                                }
                                if (i10 == mrVar.d0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = mrVar.y;
                                    boolean z24 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z24;
                                    tL_chatBannedRights5.send_gifs = z24;
                                    tL_chatBannedRights5.send_games = z24;
                                    tL_chatBannedRights5.send_stickers = z24;
                                    return;
                                }
                                if (i10 == mrVar.e0) {
                                    mrVar.y.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i10 == mrVar.c0) {
                                        mrVar.y.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (z14) {
            E = mrVar.a.E(i10);
            if (E instanceof TLRPC.User) {
                j10 = ((TLRPC.User) E).id;
                z10 = true;
            } else {
                if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    peerId = MessageObject.getPeerId(channelParticipant.peer);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                    String str2 = channelParticipant.rank;
                    boolean z25 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                    if ((E instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights3 = ((TLRPC.TL_channelParticipantCreator) E).admin_rights) == null) {
                        tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
                        tL_chatAdminRights3.manage_ranks = true;
                        tL_chatAdminRights3.add_admins = true;
                        tL_chatAdminRights3.pin_messages = true;
                        tL_chatAdminRights3.manage_topics = true;
                        tL_chatAdminRights3.invite_users = true;
                        tL_chatAdminRights3.ban_users = true;
                        tL_chatAdminRights3.delete_messages = true;
                        tL_chatAdminRights3.edit_messages = true;
                        tL_chatAdminRights3.post_messages = true;
                        tL_chatAdminRights3.change_info = true;
                        if (!z13) {
                            tL_chatAdminRights3.manage_call = true;
                        }
                    }
                    boolean z26 = z25;
                    tLObject = E;
                    z11 = z13;
                    tL_chatBannedRights = tL_chatBannedRights6;
                    tL_chatAdminRights = tL_chatAdminRights3;
                    z10 = z26;
                    str = str2;
                } else if (E instanceof TLRPC.ChatParticipant) {
                    long j11 = ((TLRPC.ChatParticipant) E).user_id;
                    z10 = mrVar.n.creator;
                    if (E instanceof TLRPC.TL_chatParticipantCreator) {
                        tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                        tL_chatAdminRights2.manage_ranks = true;
                        tL_chatAdminRights2.add_admins = true;
                        tL_chatAdminRights2.pin_messages = true;
                        tL_chatAdminRights2.manage_topics = true;
                        tL_chatAdminRights2.invite_users = true;
                        tL_chatAdminRights2.ban_users = true;
                        tL_chatAdminRights2.delete_messages = true;
                        tL_chatAdminRights2.edit_messages = true;
                        tL_chatAdminRights2.post_messages = true;
                        tL_chatAdminRights2.change_info = true;
                        if (!z13) {
                            tL_chatAdminRights2.manage_call = true;
                        }
                    } else {
                        tL_chatAdminRights2 = null;
                    }
                    str = "";
                    tLObject = E;
                    z11 = z13;
                    tL_chatAdminRights = tL_chatAdminRights2;
                    tL_chatBannedRights = null;
                    peerId = j11;
                } else {
                    tLObject = E;
                    z11 = z13;
                    str = "";
                    tL_chatAdminRights = null;
                    tL_chatBannedRights = null;
                    z10 = false;
                    peerId = 0;
                }
                if (peerId != 0) {
                    return;
                }
                if (i11 != 0) {
                    if (i11 != 3 && i11 != 1) {
                        if (ChatObject.isChannel(mrVar.n)) {
                            mrVar.getMessagesController().deleteParticipantFromChat(mrVar.M, mrVar.getMessagesController().getUser(Long.valueOf(peerId)));
                            fr frVar = mrVar.l1;
                            if (frVar != null) {
                                frVar.d(peerId);
                            }
                            mrVar.finishFragment();
                            return;
                        }
                        return;
                    }
                    if (i11 == 1 || !z10 || (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin))) {
                        mrVar.u0(peerId, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z10, i11 == 1 ? 0 : 1, i11 == 1 || i11 == 3);
                        return;
                    }
                    TLRPC.User user = mrVar.getMessagesController().getUser(Long.valueOf(peerId));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mrVar.getParentActivity());
                    String string = LocaleController.getString("AppName", R.string.AppName);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.R = string;
                    e2Var.T = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new nq(mrVar, user, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z10));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    mrVar.showDialog(e2Var);
                    return;
                }
                long j12 = peerId;
                if (i12 == 1) {
                    canBlockUsers = j12 != mrVar.getUserConfig().getClientUserId() && (mrVar.n.creator || z10);
                } else {
                    if (i12 != 0 && i12 != 3) {
                        z12 = false;
                        if (i12 != 0 || ((i12 != 1 && z11) || (i12 == 2 && i11 == 0))) {
                            if (j12 != mrVar.getUserConfig().getClientUserId()) {
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            if (peerId > 0) {
                                bundle4.putLong("user_id", j12);
                            } else {
                                bundle4.putLong("chat_id", -j12);
                            }
                            mrVar.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        if (tL_chatBannedRights == null) {
                            tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                            tL_chatBannedRights.view_messages = true;
                            tL_chatBannedRights.send_stickers = true;
                            tL_chatBannedRights.send_media = true;
                            tL_chatBannedRights.send_photos = true;
                            tL_chatBannedRights.send_videos = true;
                            tL_chatBannedRights.send_roundvideos = true;
                            tL_chatBannedRights.send_audios = true;
                            tL_chatBannedRights.send_voices = true;
                            tL_chatBannedRights.send_docs = true;
                            tL_chatBannedRights.embed_links = true;
                            tL_chatBannedRights.send_plain = true;
                            tL_chatBannedRights.send_messages = true;
                            tL_chatBannedRights.send_games = true;
                            tL_chatBannedRights.send_inline = true;
                            tL_chatBannedRights.send_gifs = true;
                            tL_chatBannedRights.pin_messages = true;
                            tL_chatBannedRights.edit_rank = true;
                            tL_chatBannedRights.send_reactions = true;
                            tL_chatBannedRights.send_polls = true;
                            tL_chatBannedRights.invite_users = true;
                            tL_chatBannedRights.manage_topics = true;
                            tL_chatBannedRights.change_info = true;
                        }
                        iq iqVar = new iq(j12, mrVar.M, tL_chatAdminRights, mrVar.y, tL_chatBannedRights, str, i12 == 1 ? 0 : 1, z12, tLObject == null, null);
                        iqVar.X0 = new sq(mrVar, tLObject);
                        mrVar.presentFragment(iqVar);
                        return;
                    }
                    canBlockUsers = ChatObject.canBlockUsers(mrVar.n);
                }
                z12 = canBlockUsers;
                if (i12 != 0) {
                }
                if (j12 != mrVar.getUserConfig().getClientUserId()) {
                }
            }
        } else {
            E = mrVar.e.E(i10);
            if (E instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) E;
                mrVar.getMessagesController().putUser(user2, false);
                long j13 = user2.id;
                int i18 = 0;
                while (true) {
                    if (i18 >= 3) {
                        tLObject2 = null;
                        break;
                    }
                    tLObject2 = (TLObject) (i18 == 0 ? hVar2 : i18 == 1 ? mrVar.K : hVar).f(j13);
                    if (tLObject2 != null) {
                        break;
                    } else {
                        i18++;
                    }
                }
                E = tLObject2;
                j10 = j13;
            } else if ((E instanceof TLRPC.ChannelParticipant) || (E instanceof TLRPC.ChatParticipant)) {
                j10 = 0;
            } else {
                j10 = 0;
                E = null;
            }
            if (E instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E;
                peerId = MessageObject.getPeerId(channelParticipant2.peer);
                boolean z27 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                str = channelParticipant2.rank;
                tLObject = E;
                z11 = z13;
                tL_chatBannedRights = tL_chatBannedRights7;
                z10 = z27;
                tL_chatAdminRights = tL_chatAdminRights4;
                if (peerId != 0) {
                }
            } else if (E instanceof TLRPC.ChatParticipant) {
                j10 = ((TLRPC.ChatParticipant) E).user_id;
                z10 = mrVar.n.creator;
            } else {
                if (E != null) {
                    str = "";
                    z10 = false;
                    peerId = j10;
                    tL_chatAdminRights = null;
                    tLObject = E;
                    z11 = z13;
                    tL_chatBannedRights = null;
                    if (peerId != 0) {
                    }
                }
                z10 = true;
            }
        }
        str = "";
        peerId = j10;
        tL_chatAdminRights = null;
        tLObject = E;
        z11 = z13;
        tL_chatBannedRights = null;
        if (peerId != 0) {
        }
    }

    public static void X(mr mrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = 0;
        while (i10 < 3) {
            TLObject tLObject = (TLObject) (i10 == 0 ? mrVar.L : i10 == 1 ? mrVar.K : mrVar.J).f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i10++;
        }
    }

    public static void d0(mr mrVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = mrVar.J;
        ArrayList arrayList2 = mrVar.E;
        UndoView undoView = mrVar.h;
        long j10 = -mrVar.M;
        boolean z12 = mrVar.s;
        undoView.m(j10, user, z12 ? 9 : 10);
        boolean z13 = false;
        mrVar.n.creator = false;
        int i10 = 0;
        boolean z14 = false;
        while (i10 < 3) {
            boolean z15 = true;
            if (i10 == 0) {
                hVar = mrVar.L;
                arrayList = mrVar.G;
            } else if (i10 == 1) {
                hVar = mrVar.K;
                arrayList = mrVar.F;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.id;
                tL_peerUser.user_id = j11;
                hVar.k(tL_channelParticipantCreator, j11);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z14 = true;
                z10 = true;
            } else {
                z10 = z13;
            }
            long clientUserId = mrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) hVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z11 = z14;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!z12) {
                    tL_chatAdminRights.manage_call = true;
                }
                hVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(12));
            }
            i10++;
            z14 = z11;
            z13 = false;
        }
        if (!z14) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new org.telegram.ui.ActionBar.n4(11));
            mrVar.C0();
        }
        mrVar.a.l();
        fr frVar = mrVar.l1;
        if (frVar != null) {
            frVar.a(user);
        }
    }

    public static int k0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int n0(int i10) {
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 3) {
            return 30;
        }
        if (i10 == 4) {
            return 60;
        }
        if (i10 == 5) {
            return 300;
        }
        return i10 == 6 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i10 == 7 ? 3600 : 0;
    }

    public static int o0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i10++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i10++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i10++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i10++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i10++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i10++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i10++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i10++;
        }
        return !tL_chatBannedRights.send_reactions ? i10 + 1 : i10;
    }

    public final void A0(ArrayList arrayList) {
        Collections.sort(arrayList, new qq(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void B0(gr grVar) {
        View view;
        if (this.a == null) {
            C0();
            return;
        }
        C0();
        grVar.f(grVar.d);
        s4.p.c(grVar, true).c(this.a);
        bi.r1 r1Var = this.c;
        if (r1Var == null || this.d == null || r1Var.getChildCount() <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = -1;
        while (true) {
            if (i10 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            i11 = RecyclerView.R(this.c.getChildAt(i10));
            if (i11 != -1) {
                view = this.c.getChildAt(i10);
                break;
            }
            i10++;
        }
        if (view != null) {
            this.d.h1(i11, view.getTop() - this.c.getPaddingTop());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bd, code lost:
    
        if (org.telegram.messenger.ChatObject.canBlockUsers(r1) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0() {
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.M));
        this.n = chat2;
        if (chat2 == null) {
            return;
        }
        this.u0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.t0 = -1;
        this.s0 = -1;
        this.r0 = -1;
        this.E0 = -1;
        this.a1 = -1;
        this.g1 = -1;
        this.h1 = -1;
        this.i1 = -1;
        this.b1 = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.d0 = -1;
        this.c0 = -1;
        this.e0 = -1;
        this.g0 = -1;
        this.l0 = -1;
        this.k0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.f0 = -1;
        this.A0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.Z0 = -1;
        this.e1 = -1;
        this.f1 = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.c1 = 0;
        ArrayList arrayList = this.E;
        boolean z14 = this.v;
        int i10 = 1;
        int i11 = this.N;
        if (i11 == 3) {
            int i12 = this.c1;
            int i13 = i12 + 1;
            this.c1 = i13;
            this.R = i12;
            if (!z14) {
                this.S = i13;
                int i14 = i12 + 3;
                this.c1 = i14;
                this.T = i12 + 2;
                if (this.k1) {
                    this.U = i14;
                    this.V = i12 + 4;
                    this.W = i12 + 5;
                    this.X = i12 + 6;
                    this.Y = i12 + 7;
                    this.Z = i12 + 8;
                    this.a0 = i12 + 9;
                    this.b0 = i12 + 10;
                    this.c0 = i12 + 11;
                    this.c1 = i12 + 13;
                    this.j0 = i12 + 12;
                }
                int i15 = this.c1;
                this.g0 = i15;
                this.h0 = i15 + 1;
                this.c1 = i15 + 3;
                this.i0 = i15 + 2;
            }
            int i16 = this.c1;
            int i17 = i16 + 1;
            this.c1 = i17;
            this.f0 = i16;
            if (z14) {
                this.c1 = i16 + 2;
                this.l0 = i17;
            } else if (this.w) {
                this.c1 = i16 + 2;
                this.k0 = i17;
            }
            if (ChatObject.isChannel(this.n)) {
                TLRPC.Chat chat3 = this.n;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !z14) {
                    int i18 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.r;
                    if (Math.max(i18, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i19 = this.c1;
                        this.G0 = i19;
                        this.r0 = i19 + 1;
                        this.s0 = i19 + 2;
                        this.c1 = i19 + 4;
                        this.t0 = i19 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.r;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z14 && ChatObject.canUserDoAction(this.n, 2) && (ChatObject.isChannel(this.n) || ((chat = this.n) != null && chat.creator))) {
                if (this.G0 == -1) {
                    int i20 = this.c1;
                    this.c1 = i20 + 1;
                    this.G0 = i20;
                }
                int i21 = this.c1;
                this.m0 = i21;
                int i22 = i21 + 2;
                this.c1 = i22;
                this.n0 = i21 + 1;
                if (this.x1) {
                    this.o0 = i22;
                    this.p0 = i21 + 3;
                    this.c1 = i21 + 5;
                    this.q0 = i21 + 4;
                }
            }
            if (!z14) {
                if (ChatObject.isChannel(this.n) || !this.n.creator) {
                    TLRPC.Chat chat4 = this.n;
                    if (chat4.megagroup) {
                        if (!chat4.gigagroup) {
                        }
                    }
                }
                if (this.G0 == -1) {
                    int i23 = this.c1;
                    this.c1 = i23 + 1;
                    this.G0 = i23;
                }
                int i24 = this.c1;
                this.M0 = i24;
                this.N0 = i24 + 1;
                this.c1 = i24 + 3;
                this.O0 = i24 + 2;
            }
            if (r0() && !z14) {
                if (this.G0 == -1) {
                    int i25 = this.c1;
                    this.c1 = i25 + 1;
                    this.G0 = i25;
                }
                int i26 = this.c1;
                int i27 = i26 + 1;
                this.c1 = i27;
                this.P0 = i26;
                if (this.q1) {
                    this.c1 = i26 + 2;
                    this.R0 = i27;
                }
                int i28 = this.c1;
                this.c1 = i28 + 1;
                this.Q0 = i28;
            }
            if (ChatObject.isChannel(this.n) && !z14) {
                if (this.G0 == -1) {
                    int i29 = this.c1;
                    this.c1 = i29 + 1;
                    this.G0 = i29;
                }
                int i30 = this.c1;
                this.c1 = i30 + 1;
                this.A0 = i30;
            }
            if ((this.O0 == -1 && this.r0 == -1) || this.A0 != -1) {
                int i31 = this.c1;
                this.c1 = i31 + 1;
                this.F0 = i31;
            }
            if (ChatObject.canBlockUsers(this.n) && !z14 && m0() > 1 && (ChatObject.isChannel(this.n) || this.n.creator)) {
                int i32 = this.c1;
                this.c1 = i32 + 1;
                this.y0 = i32;
            }
            if (this.P && !(z13 = this.Q)) {
                if (z13 || (chatFull3 = this.r) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i33 = this.c1;
                this.c1 = i33 + 1;
                this.e1 = i33;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i34 = this.c1;
                this.D0 = i34;
                int size = arrayList.size() + i34;
                this.c1 = size;
                this.E0 = size;
            }
            if (this.y0 == -1 && this.D0 == -1) {
                return;
            }
            int i35 = this.c1;
            this.c1 = i35 + 1;
            this.B0 = i35;
            return;
        }
        if (i11 == 0) {
            if (ChatObject.canBlockUsers(this.n)) {
                int i36 = this.c1;
                this.c1 = i36 + 1;
                this.y0 = i36;
                if (!arrayList.isEmpty() || (this.P && !this.Q && (chatFull2 = this.r) != null && chatFull2.kicked_count > 0)) {
                    int i37 = this.c1;
                    this.c1 = i37 + 1;
                    this.a1 = i37;
                }
            }
            if (this.P && !(z12 = this.Q)) {
                if (z12) {
                    return;
                }
                int i38 = this.c1;
                this.C0 = i38;
                this.c1 = i38 + 2;
                this.e1 = i38 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i39 = this.c1;
                int i40 = i39 + 1;
                this.c1 = i40;
                this.C0 = i39;
                this.D0 = i40;
                int size2 = arrayList.size() + i40;
                this.c1 = size2;
                this.E0 = size2;
            }
            if (this.D0 == -1) {
                int i41 = this.c1;
                this.c1 = i41 + 1;
                this.b1 = i41;
                return;
            } else if (this.a1 == -1) {
                int i42 = this.c1;
                this.c1 = i42 + 1;
                this.a1 = i42;
                return;
            } else {
                int i43 = this.c1;
                this.c1 = i43 + 1;
                this.B0 = i43;
                return;
            }
        }
        if (i11 == 1) {
            boolean z15 = this.O;
            if (!z15 && ChatObject.isChannel(this.n)) {
                TLRPC.Chat chat5 = this.n;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.r) == null || chatFull.participants_count <= 200 || (!this.s && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i44 = this.c1;
                        this.w0 = i44;
                        this.c1 = i44 + 2;
                        this.x0 = i44 + 1;
                    } else {
                        int i45 = this.c1;
                        this.c1 = i45 + 1;
                        this.B0 = i45;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.n)) {
                int i46 = this.c1;
                this.c1 = i46 + 1;
                this.y0 = i46;
            }
            if (!this.P || (z11 = this.Q)) {
                if (!arrayList.isEmpty()) {
                    int i47 = this.c1;
                    this.D0 = i47;
                    int size3 = arrayList.size() + i47;
                    this.c1 = size3;
                    this.E0 = size3;
                }
                if (!z14) {
                    int i48 = this.c1;
                    this.c1 = i48 + 1;
                    this.a1 = i48;
                }
            } else if (!z11) {
                int i49 = this.c1;
                this.c1 = i49 + 1;
                this.e1 = i49;
            }
            if (z15 || !ChatObject.isChannelAndNotMegaGroup(this.n) || !ChatObject.hasAdminRights(this.n) || z14) {
                return;
            }
            int i50 = this.c1;
            int i51 = i50 + 1;
            this.c1 = i51;
            this.g1 = i50;
            if (!this.u1) {
                this.c1 = i50 + 2;
                this.i1 = i51;
                return;
            } else {
                this.h1 = i51;
                this.c1 = i50 + 3;
                this.i1 = i50 + 2;
                return;
            }
        }
        if (i11 == 2) {
            if (ChatObject.isChannel(this.n) && !ChatObject.isChannelAndNotMegaGroup(this.n) && !this.m1) {
                int i52 = this.c1;
                this.I0 = i52;
                this.c1 = i52 + 2;
                this.J0 = i52 + 1;
            }
            int i53 = this.d1;
            if (i53 == 0 && ChatObject.canAddUsers(this.n)) {
                int i54 = this.c1;
                this.c1 = i54 + 1;
                this.y0 = i54;
            }
            if (i53 == 0 && ChatObject.canUserDoAdminAction(this.n, 3)) {
                int i55 = this.c1;
                this.c1 = i55 + 1;
                this.z0 = i55;
            }
            if (this.P && !(z10 = this.Q)) {
                if (z10) {
                    return;
                }
                if (i53 == 0) {
                    int i56 = this.c1;
                    this.c1 = i56 + 1;
                    this.f1 = i56;
                }
                int i57 = this.c1;
                this.c1 = i57 + 1;
                this.e1 = i57;
                return;
            }
            ArrayList arrayList2 = this.G;
            if (!arrayList2.isEmpty()) {
                int i58 = this.c1;
                int i59 = i58 + 1;
                this.c1 = i59;
                this.S0 = i58;
                this.T0 = i59;
                int size4 = arrayList2.size() + i59;
                this.c1 = size4;
                this.U0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.F;
            if (arrayList3.isEmpty()) {
                i10 = r1;
            } else {
                int i60 = this.c1;
                int i61 = i60 + 1;
                this.c1 = i61;
                this.V0 = i60;
                this.W0 = i61;
                int size5 = arrayList3.size() + i61;
                this.c1 = size5;
                this.X0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i62 = this.c1;
                    this.c1 = i62 + 1;
                    this.Y0 = i62;
                }
                int i63 = this.c1;
                this.D0 = i63;
                int size6 = arrayList.size() + i63;
                this.c1 = size6;
                this.E0 = size6;
            }
            int i64 = this.c1;
            if (i64 != 0) {
                this.c1 = i64 + 1;
                this.a1 = i64;
            }
        }
    }

    public final void D0() {
        try {
            if (this.c == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false);
            if (x02 == this.D1 && x03 == this.E1) {
                return;
            }
            this.D1 = x02;
            this.E1 = x03;
            int i10 = 1;
            while (i10 < 4) {
                int childCount = i10 == 0 ? this.c.getChildCount() : i10 == 1 ? this.c.getHiddenChildCount() : i10 == 2 ? this.c.getCachedChildCount() : this.c.getAttachedScrapChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = i10 == 0 ? this.c.getChildAt(i11) : i10 == 1 ? this.c.V(i11) : i10 == 2 ? this.c.P(i11) : this.c.O(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f5) {
                        ((org.telegram.ui.Cells.f5) childAt).updateColors();
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.n1 = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.d1;
        int i11 = this.N;
        if (i11 == 3) {
            this.simpleActionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i11 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i11 == 2) {
            if (i10 == 0) {
                if (this.s) {
                    this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.simpleActionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i10 == 1) {
                this.simpleActionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 8));
        if (i10 != 0 || i11 == 2 || i11 == 0 || i11 == 3) {
            this.e = new lr(this, context);
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.z0 = new jg.e2(this, 3);
            this.f = a2;
            if (i11 == 0 && !this.Q) {
                a2.setVisibility(8);
            }
            if (i11 == 3) {
                this.f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i11 == 3) {
                this.simpleActionBar.i(LocaleController.getString(R.string.Save));
            }
        } else if (i11 == 1 && ChatObject.isChannelAndNotMegaGroup(this.n) && ChatObject.hasAdminRights(this.n)) {
            this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.B1 = c10Var;
        c10Var.setViewType(6);
        org.telegram.ui.Components.c10 c10Var2 = this.B1;
        c10Var2.w = false;
        c10Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.c10 c10Var3 = this.B1;
        int i12 = org.telegram.ui.ActionBar.y6.G8;
        int i13 = org.telegram.ui.ActionBar.y6.i6;
        c10Var3.e(i12, i13, i13);
        frameLayout2.addView(this.B1, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        frameLayout2.addView(radialProgressView, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        this.B1.setVisibility(8);
        this.C1.setVisibility(8);
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, frameLayout2, 1, null);
        this.b = fy0Var;
        fy0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        bi.r1 r1Var = new bi.r1(this, context, 10);
        this.c = r1Var;
        r1Var.u1();
        this.c.setSectionsDrawBackground(true);
        bi.r1 r1Var2 = this.c;
        ig.j0 j0Var = new ig.j0(1, this, false);
        this.d = j0Var;
        r1Var2.setLayoutManager(j0Var);
        zq zqVar = new zq(this);
        zqVar.n(420L);
        zqVar.o(org.telegram.ui.Components.ds.h);
        zqVar.C = false;
        zqVar.m = false;
        this.c.setItemAnimator(zqVar);
        bi.r1 r1Var3 = this.c;
        r1Var3.W1 = true;
        r1Var3.X1 = 0;
        ir irVar = new ir(this, context);
        this.a = irVar;
        r1Var3.setAdapter(irVar);
        this.c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.c.setOnItemClickListener(new lq(this, 3));
        this.c.setOnItemLongClickListener(new lq(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new i3(this, 8));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        C0();
        this.c.setEmptyView(this.b);
        bi.r1 r1Var4 = this.c;
        r1Var4.W1 = false;
        r1Var4.X1 = 0;
        if (this.m1) {
            this.f.F(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
                org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                if (j5Var == null || j5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        if (chatFull.id == this.M) {
            if (booleanValue && ChatObject.isChannel(this.n)) {
                return;
            }
            boolean z10 = this.r != null;
            this.r = chatFull;
            if (!z10) {
                int l02 = l0();
                this.p1 = l02;
                this.o1 = l02;
                int i12 = this.r.boosts_unrestrict;
                this.q1 = i12 > 0;
                this.r1 = i12;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.M));
                long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
                boolean z11 = j10 > 0;
                this.x1 = z11;
                this.w1 = z11;
                if (j10 <= 0) {
                    j10 = 10;
                }
                long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.z1 = clamp;
                this.y1 = clamp;
            }
            AndroidUtilities.runOnUIThread(new jq(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 16, new Class[]{org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.f5.class, org.telegram.ui.Cells.c5.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Components.ax0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.V6));
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r4.v1) != r4.t1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(boolean z10) {
        if (!this.O) {
            if (ChatObject.getBannedRightsString(this.y).equals(this.x) && this.p1 == this.o1 && !p0() && (r0 = this.u1) == this.s1) {
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.s) {
                    alertDialog$Builder.a.T = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder.a.T = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new lq(this, 1));
                alertDialog$Builder.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new lq(this, 2));
                showDialog(alertDialog$Builder.a);
            }
            return false;
        }
        return true;
    }

    public final boolean i0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i11;
        final mr mrVar;
        boolean z12;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z13;
        String str2;
        int i12;
        if (tLObject == null || (i10 = this.d1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j10 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z14 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            z11 = z14;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j10 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z11 = ChatObject.canAddAdmins(this.n);
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                tL_chatAdminRights = null;
                z11 = false;
                i11 = 0;
            }
        }
        if (j10 == 0 || j10 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z15 = this.s;
        int i13 = this.N;
        if (i13 != 2) {
            boolean z16 = z11;
            final long j12 = j10;
            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
            org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
            if (i13 == 3 && ChatObject.canBlockUsers(this.n)) {
                mrVar = this;
                H.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new bi.a0(mrVar, j12, tL_chatBannedRights3, str, tLObject, 9), false);
                final int i14 = 0;
                H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(mrVar) { // from class: org.telegram.ui.kq
                    public final /* synthetic */ mr b;

                    {
                        this.b = mrVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.b.j0(j12);
                                break;
                            case 1:
                                mr mrVar2 = this.b;
                                long j13 = j12;
                                mrVar2.j0(j13);
                                mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, mrVar2, null);
                                break;
                            case 2:
                                this.b.j0(j12);
                                break;
                            default:
                                mr mrVar3 = this.b;
                                MessagesController messagesController = mrVar3.getMessagesController();
                                long j14 = mrVar3.M;
                                MessagesController messagesController2 = mrVar3.getMessagesController();
                                long j15 = j12;
                                messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.s, mrVar3, false, false, null, null);
                                mrVar3.w0(j15);
                                break;
                        }
                    }
                }, true);
            } else {
                String str3 = str;
                mrVar = this;
                if (i13 == 0 && ChatObject.canBlockUsers(mrVar.n)) {
                    if (ChatObject.canAddUsers(mrVar.n) && j10 > 0 && !ChatObject.isCommunity(mrVar.n)) {
                        final int i15 = 1;
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(z15 ? R.string.ChannelAddToChannel : R.string.ChannelAddToGroup), new Runnable(mrVar) { // from class: org.telegram.ui.kq
                            public final /* synthetic */ mr b;

                            {
                                this.b = mrVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        this.b.j0(j12);
                                        break;
                                    case 1:
                                        mr mrVar2 = this.b;
                                        long j13 = j12;
                                        mrVar2.j0(j13);
                                        mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, mrVar2, null);
                                        break;
                                    case 2:
                                        this.b.j0(j12);
                                        break;
                                    default:
                                        mr mrVar3 = this.b;
                                        MessagesController messagesController = mrVar3.getMessagesController();
                                        long j14 = mrVar3.M;
                                        MessagesController messagesController2 = mrVar3.getMessagesController();
                                        long j15 = j12;
                                        messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.s, mrVar3, false, false, null, null);
                                        mrVar3.w0(j15);
                                        break;
                                }
                            }
                        }, false);
                    }
                    final int i16 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(mrVar) { // from class: org.telegram.ui.kq
                        public final /* synthetic */ mr b;

                        {
                            this.b = mrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    this.b.j0(j12);
                                    break;
                                case 1:
                                    mr mrVar2 = this.b;
                                    long j13 = j12;
                                    mrVar2.j0(j13);
                                    mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, mrVar2, null);
                                    break;
                                case 2:
                                    this.b.j0(j12);
                                    break;
                                default:
                                    mr mrVar3 = this.b;
                                    MessagesController messagesController = mrVar3.getMessagesController();
                                    long j14 = mrVar3.M;
                                    MessagesController messagesController2 = mrVar3.getMessagesController();
                                    long j15 = j12;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.s, mrVar3, false, false, null, null);
                                    mrVar3.w0(j15);
                                    break;
                            }
                        }
                    }, true);
                } else if (i13 == 1 && ChatObject.canAddAdmins(mrVar.n) && z16) {
                    if (mrVar.n.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                        H.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new bi.a0(mrVar, j12, tL_chatAdminRights2, str3, tLObject, 10), false);
                    }
                    final int i17 = 3;
                    H.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(mrVar) { // from class: org.telegram.ui.kq
                        public final /* synthetic */ mr b;

                        {
                            this.b = mrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    this.b.j0(j12);
                                    break;
                                case 1:
                                    mr mrVar2 = this.b;
                                    long j13 = j12;
                                    mrVar2.j0(j13);
                                    mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, mrVar2, null);
                                    break;
                                case 2:
                                    this.b.j0(j12);
                                    break;
                                default:
                                    mr mrVar3 = this.b;
                                    MessagesController messagesController = mrVar3.getMessagesController();
                                    long j14 = mrVar3.M;
                                    MessagesController messagesController2 = mrVar3.getMessagesController();
                                    long j15 = j12;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.s, mrVar3, false, false, null, null);
                                    mrVar3.w0(j15);
                                    break;
                            }
                        }
                    }, true);
                }
            }
            H.W(mrVar.c.V0(view, false));
            H.S = 190;
            boolean z17 = H.x() > 0;
            if (z10 || !z17) {
                return z17;
            }
            H.Z();
            return true;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        boolean z18 = ChatObject.canAddAdmins(this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11);
        boolean z19 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
        if ((z19 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) && !z11) {
            z12 = z18;
            j11 = j10;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z13 = false;
        } else {
            z12 = z18;
            j11 = j10;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z13 = true;
        }
        boolean z20 = z19 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
        boolean z21 = ChatObject.canBlockUsers(this.n) && z13 && !z15 && ChatObject.isChannel(this.n) && !this.n.gigagroup;
        if (i10 == 0) {
            z12 = (!UserObject.isDeleted(user)) & z12;
        }
        boolean z22 = z12 || (ChatObject.canBlockUsers(this.n) && z13);
        if (z10 || !z22) {
            return z22;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        boolean z23 = z21;
        rq rqVar = new rq(this, j11, i11, tLObject, tL_chatAdminRights3, tL_chatBannedRights2, str, z13);
        long j13 = j11;
        org.telegram.ui.Components.l80 H2 = org.telegram.ui.Components.l80.H(this, view);
        H2.W(this.c.V0(view, false));
        H2.l(R.drawable.msg_admins, LocaleController.getString(z20 ? R.string.EditAdminRights : R.string.SetAsAdmin), new xi(rqVar, 12), z12);
        H2.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new m4.v0(this, tLObject, user, rqVar, 20), z23);
        boolean z24 = ChatObject.canBlockUsers(this.n) && z13;
        int i18 = R.drawable.msg_remove;
        if (z15) {
            str2 = "ChannelRemoveUser";
            i12 = R.string.ChannelRemoveUser;
        } else {
            str2 = "KickFromGroup";
            i12 = R.string.KickFromGroup;
        }
        H2.m(i18, new a3.i0(this, user, j13, 18), LocaleController.getString(str2, i12), z24, true);
        H2.S = 190;
        H2.Z();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(long j10) {
        if (this.v) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.M);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new org.telegram.messenger.a(), new e5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.M);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    public final int l0() {
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.slowmode_seconds;
        if (i10 == 5) {
            return 1;
        }
        if (i10 == 10) {
            return 2;
        }
        if (i10 == 30) {
            return 3;
        }
        if (i10 == 60) {
            return 4;
        }
        if (i10 == 300) {
            return 5;
        }
        if (i10 == 900) {
            return 6;
        }
        return i10 == 3600 ? 7 : 0;
    }

    public final int m0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i10 : Math.max(i10, arrayList.size());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        return h0(z10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogDeleted);
        s0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ir irVar = this.a;
        if (irVar != null) {
            irVar.l();
        }
        org.telegram.ui.Components.fy0 fy0Var = this.b;
        if (fy0Var != null) {
            fy0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            D0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.A1 = true;
        }
        if (z10 && !z11 && this.m1) {
            this.f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final boolean p0() {
        boolean z10 = this.q1 && r0();
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.r1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean q0(int i10) {
        return i10 == this.U || i10 == this.V || i10 == this.W || i10 == this.X || i10 == this.Y || i10 == this.Z || i10 == this.j0 || i10 == this.a0 || i10 == this.b0 || i10 == this.c0;
    }

    public final boolean r0() {
        TLRPC.Chat chat = this.n;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.o1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.y;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void s0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.P) {
            return;
        }
        int i10 = 0;
        this.I = false;
        this.H = false;
        boolean z10 = this.v;
        int i11 = this.N;
        a0.h hVar = this.K;
        ArrayList arrayList = this.F;
        a0.h hVar2 = this.L;
        ArrayList arrayList2 = this.G;
        a0.h hVar3 = this.J;
        ArrayList arrayList3 = this.E;
        if (z10 && i11 == 2) {
            this.P = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            hVar3.b();
            hVar2.b();
            hVar.b();
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
            ArrayList<String> arrayList4 = ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                String str = arrayList4.get(i12);
                i12++;
                ArrayList<TLRPC.TL_contact> arrayList5 = hashMap.get(str);
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.TL_contact tL_contact = arrayList5.get(i13);
                    i13++;
                    arrayList3.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                }
            }
            C0();
            ir irVar = this.a;
            if (irVar != null) {
                irVar.l();
                return;
            }
            return;
        }
        if (ChatObject.isChannel(this.n)) {
            this.P = true;
            org.telegram.ui.Components.fy0 fy0Var = this.b;
            if (fy0Var != null) {
                fy0Var.e(true, false);
            }
            ir irVar2 = this.a;
            if (irVar2 != null) {
                irVar2.l();
            }
            ArrayList t02 = t0();
            ArrayList arrayList6 = new ArrayList();
            pq pqVar = new pq(this, t02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i14 = 0; i14 < t02.size(); i14++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) t02.get(i14), new ag.p0(arrayList6, i14, atomicInteger, t02, pqVar, 7)), this.classGuid);
            }
            return;
        }
        this.P = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        hVar3.b();
        hVar2.b();
        hVar.b();
        if (i11 == 1) {
            TLRPC.ChatFull chatFull2 = this.r;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i10 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.r.participants.participants.get(i10);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    hVar3.k(chatParticipant, chatParticipant.user_id);
                    i10++;
                }
            }
        } else if (i11 == 2 && (chatFull = this.r) != null && chatFull.participants != null) {
            long j10 = getUserConfig().clientUserId;
            int size4 = this.r.participants.participants.size();
            while (i10 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.r.participants.participants.get(i10);
                int i15 = this.d1;
                if (i15 == 0 || chatParticipant2.user_id != j10) {
                    if (i15 == 1) {
                        if (getContactsController().isContact(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            hVar2.k(chatParticipant2, chatParticipant2.user_id);
                        } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        hVar2.k(chatParticipant2, chatParticipant2.user_id);
                    } else {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                        if (user == null || !user.bot) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        } else {
                            arrayList.add(chatParticipant2);
                            hVar.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    }
                }
                i10++;
            }
        }
        ir irVar3 = this.a;
        if (irVar3 != null) {
            irVar3.l();
        }
        C0();
        ir irVar4 = this.a;
        if (irVar4 != null) {
            irVar4.l();
        }
    }

    public final ArrayList t0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.M);
        int i10 = this.N;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.d1 == 1) {
                if (this.I) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.j1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.I = true;
                    arrayList.addAll(t0());
                }
            } else if (!this.I) {
                this.j1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.I = true;
                arrayList.addAll(t0());
            } else if (this.H) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.H = true;
                arrayList.addAll(t0());
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void u0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        iq iqVar = new iq(j10, this.M, tL_chatAdminRights, this.y, tL_chatBannedRights, str, i10, z10, tLObject == null, null);
        iqVar.X0 = new wq(this, tLObject, j10, z11);
        presentFragment(iqVar, z11);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if ((r0 && r13.v1) != r13.t1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0() {
        TLRPC.ChatFull chatFull;
        boolean z10 = false;
        int i10 = this.N;
        if (i10 == 3) {
            TLRPC.Chat chat = this.n;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.o1 != this.p1 || this.x1) && this.r != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.M, this, new lq(this, 0));
                return;
            }
            if (!ChatObject.getBannedRightsString(this.y).equals(this.x)) {
                getMessagesController().setDefaultBannedRole(this.M, this.y, ChatObject.isChannel(this.n), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.M));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.y;
                }
            }
            int i11 = this.o1;
            if (i11 != this.p1 && (chatFull = this.r) != null) {
                chatFull.slowmode_seconds = n0(i11);
                this.r.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.M, this.r.slowmode_seconds);
            }
            boolean z11 = this.x1;
            if (z11 != this.w1 || (z11 && this.y1 != this.z1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.M);
                updatepaidmessagesprice.send_paid_messages_stars = this.x1 ? this.z1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new di.d6(11));
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.M));
                if (chat3 != null) {
                    if (this.x1) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.z1;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (p0()) {
                boolean z12 = this.q1 && r0();
                if (z12 && this.r1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.M, 1);
                } else if (z12 || this.r1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.M, this.r1);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.M, 0);
                }
            }
        } else if (i10 == 1) {
            boolean z13 = this.u1;
            if (z13 == this.s1) {
            }
            MessagesController messagesController = getMessagesController();
            long j10 = this.M;
            boolean z14 = this.u1;
            if (z14 && this.v1) {
                z10 = true;
            }
            messagesController.toggleChannelSignatures(j10, z14, z10);
        }
        finishFragment();
    }

    public final void w0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        gr x02 = x0();
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.L;
                arrayList = this.G;
            } else if (i10 == 1) {
                hVar = this.K;
                arrayList = this.F;
            } else {
                hVar = this.J;
                arrayList = this.E;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.N == 0 && (chatFull = this.r) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            B0(x02);
        }
        s4.h0 adapter = this.c.getAdapter();
        lr lrVar = this.e;
        if (adapter == lrVar) {
            ig.a2 a2Var = lrVar.h;
            Object f7 = a2Var.f.f(j10);
            if (f7 != null) {
                a2Var.e.remove(f7);
            }
            Object f10 = a2Var.h.f(j10);
            if (f10 != null) {
                a2Var.g.remove(f10);
            }
            Object f11 = lrVar.e.f(j10);
            if (f11 != null) {
                lrVar.d.remove(f11);
            }
            lrVar.l();
        }
    }

    public final gr x0() {
        gr grVar = new gr(this);
        grVar.b = this.c1;
        grVar.i = this.W0;
        grVar.j = this.X0;
        grVar.l.clear();
        grVar.l.addAll(this.F);
        grVar.h = this.U0;
        grVar.g = this.T0;
        grVar.m.clear();
        grVar.m.addAll(this.G);
        grVar.e = this.D0;
        grVar.f = this.E0;
        grVar.k.clear();
        grVar.k.addAll(this.E);
        grVar.f(grVar.c);
        return grVar;
    }

    public final void y0(TLRPC.ChatFull chatFull) {
        this.r = chatFull;
        if (chatFull != null) {
            int l02 = l0();
            this.p1 = l02;
            this.o1 = l02;
            int i10 = this.r.boosts_unrestrict;
            this.q1 = i10 > 0;
            this.r1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.M));
            long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z10 = j10 > 0;
            this.x1 = z10;
            this.w1 = z10;
            if (j10 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.z1 = clamp;
            this.y1 = clamp;
        }
    }

    public final void z0(int i10) {
        if (this.isPaused || !this.A1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.Q) {
            return;
        }
        View view = null;
        for (int i11 = 0; i11 < this.c.getChildCount(); i11++) {
            View childAt = this.c.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.c10) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i10--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new tq(this, (org.telegram.ui.Components.c10) view, i10, 0));
    }
}
