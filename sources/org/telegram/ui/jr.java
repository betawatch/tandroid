package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jr extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.b10 C1;
    public int D0;
    public RadialProgressView D1;
    public TLRPC.TL_chatBannedRights E;
    public int E0;
    public final ArrayList F;
    public int F0;
    public final ArrayList G;
    public int G0;
    public final ArrayList H;
    public int H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public int J0;
    public final a0.h K;
    public int K0;
    public final a0.h L;
    public int L0;
    public final a0.h M;
    public int M0;
    public long N;
    public int N0;
    public final int O;
    public int O0;
    public final boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public boolean R;
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
    public fr a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.rx0 b;
    public int b0;
    public int b1;
    public ai.u1 c;
    public int c0;
    public int c1;
    public hg.i0 d;
    public int d0;
    public int d1;
    public ir e;
    public int e0;
    public final int e1;
    public org.telegram.ui.ActionBar.u0 f;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public org.telegram.ui.ActionBar.u0 h;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public int j0;
    public int j1;
    public int k0;
    public int k1;
    public int l0;
    public boolean l1;
    public int m0;
    public cr m1;
    public UndoView n;
    public int n0;
    public final boolean n1;
    public int o0;
    public boolean o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public TLRPC.Chat r;
    public int r0;
    public boolean r1;
    public TLRPC.ChatFull s;
    public int s0;
    public int s1;
    public int t0;
    public final boolean t1;
    public int u0;
    public final boolean u1;
    public final boolean v;
    public int v0;
    public boolean v1;
    public final boolean w;
    public boolean w0;
    public boolean w1;
    public final boolean x;
    public int x0;
    public boolean x1;
    public final String y;
    public int y0;
    public boolean y1;
    public int z0;
    public long z1;

    public jr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new a0.h();
        this.L = new a0.h();
        this.M = new a0.h();
        this.z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR);
        this.P = this.arguments.getBoolean("transfer");
        this.n1 = this.arguments.getBoolean("open_search");
        this.e1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
        this.r = chat;
        boolean z10 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
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
        this.y = ChatObject.getBannedRightsString(this.E);
        boolean isCommunity = ChatObject.isCommunity(this.r);
        this.w = isCommunity;
        if (ChatObject.isChannel(this.r) && !this.r.megagroup && !isCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.x = ChatObject.isForum(this.r);
        TLRPC.Chat chat2 = this.r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.v1 = z18;
            this.t1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.w1 = z19;
            this.u1 = z19;
        }
    }

    public static /* synthetic */ void U(jr jrVar, long j10) {
        if (j10 != 0) {
            jrVar.N = j10;
            jrVar.r = MessagesController.getInstance(jrVar.currentAccount).getChat(Long.valueOf(j10));
            jrVar.u0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(final jr jrVar, View view, int i10) {
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m10;
        long j10;
        boolean z11;
        String str;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject;
        boolean z12;
        TLObject tLObject2;
        boolean canBlockUsers;
        boolean z13;
        int i11;
        long j12;
        String str2;
        boolean z14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i12 = jrVar.e1;
        a0.h hVar = jrVar.K;
        a0.h hVar2 = jrVar.M;
        boolean z15 = jrVar.v;
        int i13 = jrVar.O;
        final int i14 = 0;
        i14 = 0;
        i14 = 0;
        final int i15 = 1;
        Object[] objArr = jrVar.c.getAdapter() == jrVar.a;
        if (i10 == jrVar.h1) {
            boolean z16 = !jrVar.v1;
            jrVar.v1 = z16;
            ((org.telegram.ui.Cells.v8) view).setChecked(z16);
            AndroidUtilities.updateVisibleRows(jrVar.c);
            dr w02 = jrVar.w0();
            jrVar.B0();
            jrVar.A0(w02);
            jrVar.a.m(jrVar.j1);
        } else if (i10 == jrVar.i1) {
            boolean z17 = !jrVar.w1;
            jrVar.w1 = z17;
            ((org.telegram.ui.Cells.v8) view).setChecked(z17);
            AndroidUtilities.updateVisibleRows(jrVar.c);
            dr w03 = jrVar.w0();
            jrVar.B0();
            jrVar.A0(w03);
            jrVar.a.m(jrVar.j1);
        } else if (i10 == jrVar.n0) {
            boolean z18 = !jrVar.y1;
            jrVar.y1 = z18;
            ((org.telegram.ui.Cells.v8) view).setChecked(z18);
            AndroidUtilities.updateVisibleRows(jrVar.c);
            dr w04 = jrVar.w0();
            jrVar.B0();
            jrVar.A0(w04);
            jrVar.a.m(jrVar.n0);
        } else if (objArr != false) {
            if (jrVar.p0(i10)) {
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                if (i10 == jrVar.V) {
                    jrVar.E.send_photos = !r15.send_photos;
                } else if (i10 == jrVar.W) {
                    jrVar.E.send_videos = !r14.send_videos;
                } else if (i10 == jrVar.X) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = jrVar.E;
                    boolean z19 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z19;
                    tL_chatBannedRights2.send_gifs = z19;
                    tL_chatBannedRights2.send_games = z19;
                    tL_chatBannedRights2.send_stickers = z19;
                } else if (i10 == jrVar.Y) {
                    jrVar.E.send_audios = !r14.send_audios;
                } else if (i10 == jrVar.Z) {
                    jrVar.E.send_docs = !r14.send_docs;
                } else if (i10 == jrVar.a0) {
                    jrVar.E.send_voices = !r14.send_voices;
                } else if (i10 == jrVar.b0) {
                    jrVar.E.send_roundvideos = !r14.send_roundvideos;
                } else if (i10 == jrVar.c0) {
                    if (jrVar.E.send_plain && (m10 = jrVar.d.m(jrVar.T)) != null) {
                        AndroidUtilities.shakeViewSpring(m10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        jrVar.E.embed_links = !r14.embed_links;
                    }
                } else if (i10 == jrVar.d0) {
                    jrVar.E.send_polls = !r14.send_polls;
                } else if (i10 == jrVar.k0) {
                    jrVar.E.send_reactions = !r14.send_reactions;
                }
                a2Var.c(!a2Var.b(), true);
                AndroidUtilities.updateVisibleRows(jrVar.c);
                dr w05 = jrVar.w0();
                jrVar.B0();
                jrVar.A0(w05);
            } else if (i10 == jrVar.Q0) {
                org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                boolean z20 = !u8Var.d.h;
                jrVar.r1 = z20;
                u8Var.setChecked(z20);
                AndroidUtilities.updateVisibleRows(jrVar.c);
                dr w06 = jrVar.w0();
                jrVar.B0();
                jrVar.A0(w06);
            } else {
                if (i10 == jrVar.z0) {
                    if (i13 == 0 || i13 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", jrVar.N);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i13 == 0 ? 2 : 3);
                        jr jrVar2 = new jr(bundle);
                        jrVar2.x0(jrVar.s);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = jrVar.E;
                        if (tL_chatBannedRights3 != null) {
                            jrVar2.E = tL_chatBannedRights3;
                        }
                        jrVar2.m1 = new xq(jrVar);
                        jrVar.presentFragment(jrVar2);
                        return;
                    }
                    if (i13 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", jrVar.N);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        jr jrVar3 = new jr(bundle2);
                        jrVar3.m1 = new yq(jrVar);
                        jrVar3.x0(jrVar.s);
                        jrVar.presentFragment(jrVar3);
                        return;
                    }
                    if (i13 == 2) {
                        Bundle h = a1.g.h("addToGroup", true);
                        h.putLong(z15 ? "channelId" : "chatId", jrVar.r.id);
                        n60 n60Var = new n60(h);
                        n60Var.I = jrVar.s;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        n60Var.J = hVar;
                        n60Var.x = new ar(jrVar, n60Var);
                        jrVar.presentFragment(n60Var);
                        return;
                    }
                    return;
                }
                if (i10 == jrVar.v0) {
                    jrVar.presentFragment(new xb(jrVar.r));
                    return;
                }
                if (i10 == jrVar.x0) {
                    final org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    TLRPC.ChatFull chatFull3 = jrVar.s;
                    if (chatFull3 != null && !chatFull3.antispam && jrVar.l0() < jrVar.getMessagesController().telegramAntispamGroupSizeMin) {
                        org.telegram.ui.Components.xc.a0(jrVar).Q(R.raw.msg_antispam, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", jrVar.getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (jrVar.s == null || !ChatObject.canUserDoAdminAction(jrVar.r, 13) || jrVar.w0) {
                        return;
                    }
                    jrVar.w0 = true;
                    final boolean z21 = jrVar.s.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = jrVar.getMessagesController().getInputChannel(jrVar.N);
                    TLRPC.ChatFull chatFull4 = jrVar.s;
                    boolean z22 = !chatFull4.antispam;
                    chatFull4.antispam = z22;
                    tL_channels_toggleAntiSpam.enabled = z22;
                    q8Var.setChecked(z22);
                    q8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 13) && ((chatFull2 = jrVar.s) == null || chatFull2.antispam || jrVar.l0() >= jrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    jrVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(jrVar) { // from class: org.telegram.ui.hq
                        public final /* synthetic */ jr b;

                        {
                            this.b = jrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final jr jrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        jrVar4.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject3, false);
                                        jrVar4.getMessagesController().putChatFull(jrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 0;
                                        final org.telegram.ui.Cells.q8 q8Var2 = q8Var;
                                        final boolean z23 = z21;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i16) {
                                                    case 0:
                                                        jr jrVar5 = jrVar4;
                                                        if (jrVar5.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar5.s;
                                                            boolean z24 = z23;
                                                            chatFull7.antispam = z24;
                                                            org.telegram.ui.Cells.q8 q8Var3 = q8Var2;
                                                            q8Var3.setChecked(z24);
                                                            q8Var3.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar5.r, 13) || ((chatFull5 = jrVar5.s) != null && chatFull5.antispam && jrVar5.l0() < jrVar5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar5).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar4;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z23;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.q8 q8Var4 = q8Var2;
                                                            q8Var4.setChecked(z25);
                                                            q8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar4.w0 = false;
                                    break;
                                default:
                                    final jr jrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        jrVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject3, false);
                                        jrVar5.getMessagesController().putChatFull(jrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 1;
                                        final org.telegram.ui.Cells.q8 q8Var3 = q8Var;
                                        final boolean z24 = z21;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        jr jrVar52 = jrVar5;
                                                        if (jrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar52.s;
                                                            boolean z242 = z24;
                                                            chatFull7.antispam = z242;
                                                            org.telegram.ui.Cells.q8 q8Var32 = q8Var3;
                                                            q8Var32.setChecked(z242);
                                                            q8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar52.r, 13) || ((chatFull5 = jrVar52.s) != null && chatFull5.antispam && jrVar52.l0() < jrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar5;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z24;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.q8 q8Var4 = q8Var3;
                                                            q8Var4.setChecked(z25);
                                                            q8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar5.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == jrVar.J0) {
                    final org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    if (jrVar.l0() < jrVar.getMessagesController().hiddenMembersGroupSizeMin) {
                        org.telegram.ui.Components.xc.a0(jrVar).Q(R.raw.contacts_sync_off, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", jrVar.getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (jrVar.s == null || !ChatObject.canUserDoAdminAction(jrVar.r, 2) || jrVar.I0) {
                        return;
                    }
                    jrVar.I0 = true;
                    final boolean z23 = jrVar.s.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = jrVar.getMessagesController().getInputChannel(jrVar.N);
                    TLRPC.ChatFull chatFull5 = jrVar.s;
                    boolean z24 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z24;
                    tL_channels_toggleParticipantsHidden.enabled = z24;
                    q8Var2.setChecked(z24);
                    Switch checkBox = q8Var2.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(jrVar.r, 2) || ((chatFull = jrVar.s) != null && !chatFull.participants_hidden && jrVar.l0() < jrVar.getMessagesController().hiddenMembersGroupSizeMin)) {
                        i14 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i14);
                    jrVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(jrVar) { // from class: org.telegram.ui.hq
                        public final /* synthetic */ jr b;

                        {
                            this.b = jrVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i15) {
                                case 0:
                                    final jr jrVar4 = this.b;
                                    if (tLObject3 != null) {
                                        jrVar4.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject3, false);
                                        jrVar4.getMessagesController().putChatFull(jrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 0;
                                        final org.telegram.ui.Cells.q8 q8Var22 = q8Var2;
                                        final boolean z232 = z23;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i16) {
                                                    case 0:
                                                        jr jrVar52 = jrVar4;
                                                        if (jrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar52.s;
                                                            boolean z242 = z232;
                                                            chatFull7.antispam = z242;
                                                            org.telegram.ui.Cells.q8 q8Var32 = q8Var22;
                                                            q8Var32.setChecked(z242);
                                                            q8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar52.r, 13) || ((chatFull52 = jrVar52.s) != null && chatFull52.antispam && jrVar52.l0() < jrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar4;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z232;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.q8 q8Var4 = q8Var22;
                                                            q8Var4.setChecked(z25);
                                                            q8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar4.w0 = false;
                                    break;
                                default:
                                    final jr jrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        jrVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject3, false);
                                        jrVar5.getMessagesController().putChatFull(jrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 1;
                                        final org.telegram.ui.Cells.q8 q8Var3 = q8Var2;
                                        final boolean z242 = z23;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        jr jrVar52 = jrVar5;
                                                        if (jrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar52.s;
                                                            boolean z2422 = z242;
                                                            chatFull7.antispam = z2422;
                                                            org.telegram.ui.Cells.q8 q8Var32 = q8Var3;
                                                            q8Var32.setChecked(z2422);
                                                            q8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar52.r, 13) || ((chatFull52 = jrVar52.s) != null && chatFull52.antispam && jrVar52.l0() < jrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar5;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z242;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.q8 q8Var4 = q8Var3;
                                                            q8Var4.setChecked(z25);
                                                            q8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.xc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar5.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 != jrVar.L0) {
                    z10 = true;
                    if (i10 == jrVar.B0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", jrVar.N);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        jr jrVar4 = new jr(bundle3);
                        jrVar4.x0(jrVar.s);
                        jrVar.presentFragment(jrVar4);
                        return;
                    }
                    if (i10 == jrVar.t0) {
                        jrVar.showDialog(new br(jrVar, jrVar.getParentActivity(), jrVar));
                    } else {
                        if (i10 == jrVar.A0) {
                            if (jrVar.s != null) {
                                kh0 kh0Var = new kh0(jrVar.N, 0L, 0);
                                TLRPC.ChatFull chatFull6 = jrVar.s;
                                kh0Var.g0(chatFull6, chatFull6.exported_invite);
                                jrVar.presentFragment(kh0Var);
                                return;
                            }
                            return;
                        }
                        if ((i10 > jrVar.S && i10 <= Math.max(jrVar.l0, jrVar.g0)) || i10 == jrVar.m0) {
                            org.telegram.ui.Cells.u8 u8Var2 = (org.telegram.ui.Cells.u8) view;
                            boolean isEnabled = u8Var2.isEnabled();
                            Switch r42 = u8Var2.d;
                            if (isEnabled) {
                                if (r42.F != null) {
                                    if (ChatObject.isPublic(jrVar.r) && (i10 == jrVar.i0 || i10 == jrVar.g0)) {
                                        org.telegram.messenger.wh.q(R.string.EditCantEditPermissionsPublic, org.telegram.ui.Components.xc.a0(jrVar), null);
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(jrVar.currentAccount, jrVar.N) && (i10 == jrVar.i0 || i10 == jrVar.g0)) {
                                        org.telegram.messenger.wh.q(R.string.EditCantEditPermissionsDiscussion, org.telegram.ui.Components.xc.a0(jrVar), null);
                                        return;
                                    } else {
                                        org.telegram.ui.Components.xc.a0(jrVar).t(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions), null).j();
                                        return;
                                    }
                                }
                                if (i10 == jrVar.U) {
                                    dr w07 = jrVar.w0();
                                    jrVar.l1 = !jrVar.l1;
                                    AndroidUtilities.updateVisibleRows(jrVar.c);
                                    jrVar.A0(w07);
                                    return;
                                }
                                u8Var2.setChecked(!r42.h);
                                if (i10 == jrVar.g0) {
                                    jrVar.E.change_info = !r0.change_info;
                                    return;
                                }
                                if (i10 == jrVar.m0) {
                                    jrVar.E.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i10 == jrVar.h0) {
                                    jrVar.E.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i10 == jrVar.l0) {
                                    jrVar.E.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i10 == jrVar.i0) {
                                    jrVar.E.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i10 == jrVar.j0) {
                                    jrVar.E.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i10 == jrVar.T) {
                                    jrVar.E.send_plain = !r1.send_plain;
                                    int i16 = jrVar.c0;
                                    if (i16 >= 0) {
                                        jrVar.a.m(i16);
                                    }
                                    int i17 = jrVar.U;
                                    if (i17 >= 0) {
                                        jrVar.a.m(i17);
                                    }
                                    dr w08 = jrVar.w0();
                                    jrVar.B0();
                                    jrVar.A0(w08);
                                    return;
                                }
                                if (i10 == jrVar.U) {
                                    dr w09 = jrVar.w0();
                                    jrVar.l1 = !jrVar.l1;
                                    AndroidUtilities.updateVisibleRows(jrVar.c);
                                    jrVar.A0(w09);
                                    return;
                                }
                                if (i10 == jrVar.e0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = jrVar.E;
                                    boolean z25 = !tL_chatBannedRights4.send_stickers;
                                    tL_chatBannedRights4.send_inline = z25;
                                    tL_chatBannedRights4.send_gifs = z25;
                                    tL_chatBannedRights4.send_games = z25;
                                    tL_chatBannedRights4.send_stickers = z25;
                                    return;
                                }
                                if (i10 == jrVar.f0) {
                                    jrVar.E.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i10 == jrVar.d0) {
                                        jrVar.E.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                } else {
                    if (jrVar.r == null) {
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
                    boolean b10 = q8Var3.b();
                    q8Var3.setChecked(!q8Var3.b());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(jrVar.r);
                    TLRPC.Chat chat = jrVar.r;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = jrVar.r.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights5;
                    tL_chatBannedRights5.edit_rank = !q8Var3.b();
                    z10 = true;
                    jrVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new org.telegram.messenger.a(), new iq(jrVar, q8Var3, b10, i14));
                }
                if (objArr == true) {
                    TLObject E = jrVar.e.E(i10);
                    if (E instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) E;
                        jrVar.getMessagesController().putUser(user, false);
                        long j13 = user.id;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= 3) {
                                tLObject2 = null;
                                break;
                            }
                            tLObject2 = (TLObject) (i18 == 0 ? hVar2 : i18 == 1 ? jrVar.L : hVar).f(j13);
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
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                        j11 = MessageObject.getPeerId(channelParticipant.peer);
                        boolean z26 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                        z11 = z15;
                        tL_chatBannedRights = tL_chatBannedRights6;
                        str = channelParticipant.rank;
                        tLObject = E;
                        z12 = z26;
                        tL_chatAdminRights = tL_chatAdminRights3;
                    } else if (E instanceof TLRPC.ChatParticipant) {
                        long j14 = ((TLRPC.ChatParticipant) E).user_id;
                        z11 = z15;
                        str = "";
                        tL_chatBannedRights = null;
                        tLObject = E;
                        z12 = jrVar.r.creator;
                        tL_chatAdminRights = null;
                        j11 = j14;
                    } else {
                        z11 = z15;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = j10;
                        tL_chatAdminRights = null;
                        tLObject = E;
                        z12 = E == null;
                    }
                } else {
                    TLObject E2 = jrVar.a.E(i10);
                    if (E2 instanceof TLRPC.User) {
                        z11 = z15;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = ((TLRPC.User) E2).id;
                        tL_chatAdminRights = null;
                        tLObject = E2;
                        z12 = z10;
                    } else if (E2 instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E2;
                        j11 = MessageObject.getPeerId(channelParticipant2.peer);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                        String str3 = channelParticipant2.rank;
                        boolean z27 = (((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) && !channelParticipant2.can_edit) ? false : z10;
                        if ((E2 instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights4 = ((TLRPC.TL_channelParticipantCreator) E2).admin_rights) == null) {
                            tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                            boolean z28 = z10;
                            tL_chatAdminRights4.manage_ranks = z28;
                            tL_chatAdminRights4.add_admins = z28;
                            tL_chatAdminRights4.pin_messages = z28;
                            tL_chatAdminRights4.manage_topics = z28;
                            tL_chatAdminRights4.invite_users = z28;
                            tL_chatAdminRights4.ban_users = z28;
                            tL_chatAdminRights4.delete_messages = z28;
                            tL_chatAdminRights4.edit_messages = z28;
                            tL_chatAdminRights4.post_messages = z28;
                            tL_chatAdminRights4.change_info = z28;
                            if (!z15) {
                                tL_chatAdminRights4.manage_call = z28;
                            }
                        }
                        boolean z29 = z27;
                        tLObject = E2;
                        z12 = z29;
                        tL_chatBannedRights = tL_chatBannedRights7;
                        tL_chatAdminRights = tL_chatAdminRights4;
                        z11 = z15;
                        str = str3;
                    } else {
                        if (E2 instanceof TLRPC.ChatParticipant) {
                            long j15 = ((TLRPC.ChatParticipant) E2).user_id;
                            boolean z30 = jrVar.r.creator;
                            if (E2 instanceof TLRPC.TL_chatParticipantCreator) {
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
                                if (!z15) {
                                    tL_chatAdminRights2.manage_call = true;
                                }
                            } else {
                                tL_chatAdminRights2 = null;
                            }
                            str = "";
                            tLObject = E2;
                            z12 = z30;
                            tL_chatAdminRights = tL_chatAdminRights2;
                            j11 = j15;
                            z11 = z15;
                        } else {
                            tLObject = E2;
                            z11 = z15;
                            str = "";
                            z12 = false;
                            j11 = 0;
                            tL_chatAdminRights = null;
                        }
                        tL_chatBannedRights = null;
                    }
                }
                if (j11 != 0) {
                    return;
                }
                if (i12 != 0) {
                    int i19 = 1;
                    if (i12 != 3 && i12 != 1) {
                        if (ChatObject.isChannel(jrVar.r)) {
                            jrVar.getMessagesController().deleteParticipantFromChat(jrVar.N, jrVar.getMessagesController().getUser(Long.valueOf(j11)));
                            cr crVar = jrVar.m1;
                            if (crVar != null) {
                                crVar.d(j11);
                            }
                            jrVar.finishFragment();
                            return;
                        }
                        return;
                    }
                    if (i12 == 1) {
                        j12 = j11;
                        str2 = str;
                    } else {
                        if (!z12) {
                            j12 = j11;
                            str2 = str;
                            z14 = z12;
                            i19 = 1;
                            jrVar.t0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z14, i12 != i19 ? 0 : i19, (i12 != i19 || i12 == 3) ? i19 : 0);
                            return;
                        }
                        if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                            TLRPC.User user2 = jrVar.getMessagesController().getUser(Long.valueOf(j11));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jrVar.getParentActivity());
                            String string = LocaleController.getString("AppName", R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.R = string;
                            b2Var.T = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new jq(jrVar, user2, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z12));
                            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                            jrVar.showDialog(b2Var);
                            return;
                        }
                        j12 = j11;
                        str2 = str;
                        i19 = 1;
                    }
                    z14 = z12;
                    jrVar.t0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z14, i12 != i19 ? 0 : i19, (i12 != i19 || i12 == 3) ? i19 : 0);
                    return;
                }
                long j16 = j11;
                boolean z31 = z12;
                if (i13 == 1) {
                    canBlockUsers = j16 != jrVar.getUserConfig().getClientUserId() && (jrVar.r.creator || z31);
                } else {
                    if (i13 != 0 && i13 != 3) {
                        z13 = false;
                        if (i13 != 0 || ((i13 != 1 && z11) || (i13 == 2 && i12 == 0))) {
                            if (j16 != jrVar.getUserConfig().getClientUserId()) {
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            if (j11 > 0) {
                                bundle4.putLong("user_id", j16);
                            } else {
                                bundle4.putLong("chat_id", -j16);
                            }
                            jrVar.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        if (tL_chatBannedRights == null) {
                            tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                            i11 = 1;
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
                        } else {
                            i11 = 1;
                        }
                        dq dqVar = new dq(j16, jrVar.N, tL_chatAdminRights, jrVar.E, tL_chatBannedRights, str, i13 == i11 ? 0 : i11, z13, tLObject == null ? i11 : 0, null);
                        dqVar.X0 = new oq(jrVar, tLObject);
                        jrVar.presentFragment(dqVar);
                        return;
                    }
                    canBlockUsers = ChatObject.canBlockUsers(jrVar.r);
                }
                z13 = canBlockUsers;
                if (i13 != 0) {
                }
                if (j16 != jrVar.getUserConfig().getClientUserId()) {
                }
            }
        }
        z10 = true;
        if (objArr == true) {
        }
        if (j11 != 0) {
        }
    }

    public static void W(jr jrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = 0;
        while (i10 < 3) {
            TLObject tLObject = (TLObject) (i10 == 0 ? jrVar.M : i10 == 1 ? jrVar.L : jrVar.K).f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i10++;
        }
    }

    public static void c0(jr jrVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = jrVar.K;
        ArrayList arrayList2 = jrVar.F;
        UndoView undoView = jrVar.n;
        long j10 = -jrVar.N;
        boolean z12 = jrVar.v;
        undoView.m(j10, user, z12 ? 9 : 10);
        boolean z13 = false;
        jrVar.r.creator = false;
        int i10 = 0;
        boolean z14 = false;
        while (i10 < 3) {
            boolean z15 = true;
            if (i10 == 0) {
                hVar = jrVar.M;
                arrayList = jrVar.H;
            } else if (i10 == 1) {
                hVar = jrVar.L;
                arrayList = jrVar.G;
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
            long clientUserId = jrVar.getUserConfig().getClientUserId();
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
                Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(12));
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
            Collections.sort(arrayList2, new org.telegram.ui.ActionBar.i4(11));
            jrVar.B0();
        }
        jrVar.a.l();
        cr crVar = jrVar.m1;
        if (crVar != null) {
            crVar.a(user);
        }
    }

    public static int j0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int m0(int i10) {
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

    public static int n0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
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

    public final void A0(dr drVar) {
        View view;
        if (this.a == null) {
            B0();
            return;
        }
        B0();
        drVar.f(drVar.d);
        s4.o.c(drVar, true).c(this.a);
        ai.u1 u1Var = this.c;
        if (u1Var == null || this.d == null || u1Var.getChildCount() <= 0) {
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
    public final void B0() {
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.N));
        this.r = chat2;
        if (chat2 == null) {
            return;
        }
        this.v0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.u0 = -1;
        this.t0 = -1;
        this.s0 = -1;
        this.F0 = -1;
        this.b1 = -1;
        this.h1 = -1;
        this.i1 = -1;
        this.j1 = -1;
        this.c1 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.e0 = -1;
        this.d0 = -1;
        this.f0 = -1;
        this.h0 = -1;
        this.m0 = -1;
        this.l0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.g0 = -1;
        this.B0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = -1;
        this.Z0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.a1 = -1;
        this.f1 = -1;
        this.g1 = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.d1 = 0;
        ArrayList arrayList = this.F;
        boolean z14 = this.w;
        int i10 = 1;
        int i11 = this.O;
        if (i11 == 3) {
            int i12 = this.d1;
            int i13 = i12 + 1;
            this.d1 = i13;
            this.S = i12;
            if (!z14) {
                this.T = i13;
                int i14 = i12 + 3;
                this.d1 = i14;
                this.U = i12 + 2;
                if (this.l1) {
                    this.V = i14;
                    this.W = i12 + 4;
                    this.X = i12 + 5;
                    this.Y = i12 + 6;
                    this.Z = i12 + 7;
                    this.a0 = i12 + 8;
                    this.b0 = i12 + 9;
                    this.c0 = i12 + 10;
                    this.d0 = i12 + 11;
                    this.d1 = i12 + 13;
                    this.k0 = i12 + 12;
                }
                int i15 = this.d1;
                this.h0 = i15;
                this.i0 = i15 + 1;
                this.d1 = i15 + 3;
                this.j0 = i15 + 2;
            }
            int i16 = this.d1;
            int i17 = i16 + 1;
            this.d1 = i17;
            this.g0 = i16;
            if (z14) {
                this.d1 = i16 + 2;
                this.m0 = i17;
            } else if (this.x) {
                this.d1 = i16 + 2;
                this.l0 = i17;
            }
            if (ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat3 = this.r;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !z14) {
                    int i18 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.s;
                    if (Math.max(i18, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i19 = this.d1;
                        this.H0 = i19;
                        this.s0 = i19 + 1;
                        this.t0 = i19 + 2;
                        this.d1 = i19 + 4;
                        this.u0 = i19 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.s;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z14 && ChatObject.canUserDoAction(this.r, 2) && (ChatObject.isChannel(this.r) || ((chat = this.r) != null && chat.creator))) {
                if (this.H0 == -1) {
                    int i20 = this.d1;
                    this.d1 = i20 + 1;
                    this.H0 = i20;
                }
                int i21 = this.d1;
                this.n0 = i21;
                int i22 = i21 + 2;
                this.d1 = i22;
                this.o0 = i21 + 1;
                if (this.y1) {
                    this.p0 = i22;
                    this.q0 = i21 + 3;
                    this.d1 = i21 + 5;
                    this.r0 = i21 + 4;
                }
            }
            if (!z14) {
                if (ChatObject.isChannel(this.r) || !this.r.creator) {
                    TLRPC.Chat chat4 = this.r;
                    if (chat4.megagroup) {
                        if (!chat4.gigagroup) {
                        }
                    }
                }
                if (this.H0 == -1) {
                    int i23 = this.d1;
                    this.d1 = i23 + 1;
                    this.H0 = i23;
                }
                int i24 = this.d1;
                this.N0 = i24;
                this.O0 = i24 + 1;
                this.d1 = i24 + 3;
                this.P0 = i24 + 2;
            }
            if (q0() && !z14) {
                if (this.H0 == -1) {
                    int i25 = this.d1;
                    this.d1 = i25 + 1;
                    this.H0 = i25;
                }
                int i26 = this.d1;
                int i27 = i26 + 1;
                this.d1 = i27;
                this.Q0 = i26;
                if (this.r1) {
                    this.d1 = i26 + 2;
                    this.S0 = i27;
                }
                int i28 = this.d1;
                this.d1 = i28 + 1;
                this.R0 = i28;
            }
            if (ChatObject.isChannel(this.r) && !z14) {
                if (this.H0 == -1) {
                    int i29 = this.d1;
                    this.d1 = i29 + 1;
                    this.H0 = i29;
                }
                int i30 = this.d1;
                this.d1 = i30 + 1;
                this.B0 = i30;
            }
            if ((this.P0 == -1 && this.s0 == -1) || this.B0 != -1) {
                int i31 = this.d1;
                this.d1 = i31 + 1;
                this.G0 = i31;
            }
            if (ChatObject.canBlockUsers(this.r) && !z14 && l0() > 1 && (ChatObject.isChannel(this.r) || this.r.creator)) {
                int i32 = this.d1;
                this.d1 = i32 + 1;
                this.z0 = i32;
            }
            if (this.Q && !(z13 = this.R)) {
                if (z13 || (chatFull3 = this.s) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i33 = this.d1;
                this.d1 = i33 + 1;
                this.f1 = i33;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i34 = this.d1;
                this.E0 = i34;
                int size = arrayList.size() + i34;
                this.d1 = size;
                this.F0 = size;
            }
            if (this.z0 == -1 && this.E0 == -1) {
                return;
            }
            int i35 = this.d1;
            this.d1 = i35 + 1;
            this.C0 = i35;
            return;
        }
        if (i11 == 0) {
            if (ChatObject.canBlockUsers(this.r)) {
                int i36 = this.d1;
                this.d1 = i36 + 1;
                this.z0 = i36;
                if (!arrayList.isEmpty() || (this.Q && !this.R && (chatFull2 = this.s) != null && chatFull2.kicked_count > 0)) {
                    int i37 = this.d1;
                    this.d1 = i37 + 1;
                    this.b1 = i37;
                }
            }
            if (this.Q && !(z12 = this.R)) {
                if (z12) {
                    return;
                }
                int i38 = this.d1;
                this.D0 = i38;
                this.d1 = i38 + 2;
                this.f1 = i38 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i39 = this.d1;
                int i40 = i39 + 1;
                this.d1 = i40;
                this.D0 = i39;
                this.E0 = i40;
                int size2 = arrayList.size() + i40;
                this.d1 = size2;
                this.F0 = size2;
            }
            if (this.E0 == -1) {
                int i41 = this.d1;
                this.d1 = i41 + 1;
                this.c1 = i41;
                return;
            } else if (this.b1 == -1) {
                int i42 = this.d1;
                this.d1 = i42 + 1;
                this.b1 = i42;
                return;
            } else {
                int i43 = this.d1;
                this.d1 = i43 + 1;
                this.C0 = i43;
                return;
            }
        }
        if (i11 == 1) {
            boolean z15 = this.P;
            if (!z15 && ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat5 = this.r;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.s) == null || chatFull.participants_count <= 200 || (!this.v && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i44 = this.d1;
                        this.x0 = i44;
                        this.d1 = i44 + 2;
                        this.y0 = i44 + 1;
                    } else {
                        int i45 = this.d1;
                        this.d1 = i45 + 1;
                        this.C0 = i45;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.r)) {
                int i46 = this.d1;
                this.d1 = i46 + 1;
                this.z0 = i46;
            }
            if (!this.Q || (z11 = this.R)) {
                if (!arrayList.isEmpty()) {
                    int i47 = this.d1;
                    this.E0 = i47;
                    int size3 = arrayList.size() + i47;
                    this.d1 = size3;
                    this.F0 = size3;
                }
                if (!z14) {
                    int i48 = this.d1;
                    this.d1 = i48 + 1;
                    this.b1 = i48;
                }
            } else if (!z11) {
                int i49 = this.d1;
                this.d1 = i49 + 1;
                this.f1 = i49;
            }
            if (z15 || !ChatObject.isChannelAndNotMegaGroup(this.r) || !ChatObject.hasAdminRights(this.r) || z14) {
                return;
            }
            int i50 = this.d1;
            int i51 = i50 + 1;
            this.d1 = i51;
            this.h1 = i50;
            if (!this.v1) {
                this.d1 = i50 + 2;
                this.j1 = i51;
                return;
            } else {
                this.i1 = i51;
                this.d1 = i50 + 3;
                this.j1 = i50 + 2;
                return;
            }
        }
        if (i11 == 2) {
            if (ChatObject.isChannel(this.r) && !ChatObject.isChannelAndNotMegaGroup(this.r) && !this.n1) {
                int i52 = this.d1;
                this.J0 = i52;
                this.d1 = i52 + 2;
                this.K0 = i52 + 1;
            }
            int i53 = this.e1;
            if (i53 == 0 && ChatObject.canAddUsers(this.r)) {
                int i54 = this.d1;
                this.d1 = i54 + 1;
                this.z0 = i54;
            }
            if (i53 == 0 && ChatObject.canUserDoAdminAction(this.r, 3)) {
                int i55 = this.d1;
                this.d1 = i55 + 1;
                this.A0 = i55;
            }
            if (this.Q && !(z10 = this.R)) {
                if (z10) {
                    return;
                }
                if (i53 == 0) {
                    int i56 = this.d1;
                    this.d1 = i56 + 1;
                    this.g1 = i56;
                }
                int i57 = this.d1;
                this.d1 = i57 + 1;
                this.f1 = i57;
                return;
            }
            ArrayList arrayList2 = this.H;
            if (!arrayList2.isEmpty()) {
                int i58 = this.d1;
                int i59 = i58 + 1;
                this.d1 = i59;
                this.T0 = i58;
                this.U0 = i59;
                int size4 = arrayList2.size() + i59;
                this.d1 = size4;
                this.V0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.G;
            if (arrayList3.isEmpty()) {
                i10 = r1;
            } else {
                int i60 = this.d1;
                int i61 = i60 + 1;
                this.d1 = i61;
                this.W0 = i60;
                this.X0 = i61;
                int size5 = arrayList3.size() + i61;
                this.d1 = size5;
                this.Y0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i62 = this.d1;
                    this.d1 = i62 + 1;
                    this.Z0 = i62;
                }
                int i63 = this.d1;
                this.E0 = i63;
                int size6 = arrayList.size() + i63;
                this.d1 = size6;
                this.F0 = size6;
            }
            int i64 = this.d1;
            if (i64 != 0) {
                this.d1 = i64 + 1;
                this.b1 = i64;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.o1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.e1;
        int i11 = this.O;
        if (i11 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i11 == 2) {
            if (i10 == 0) {
                if (this.v) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i10 == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 8));
        if (i10 != 0 || i11 == 2 || i11 == 0 || i11 == 3) {
            this.e = new ir(this, context);
            org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new ig.a2(this, 3);
            this.f = a2;
            if (i11 == 0 && !this.R) {
                a2.setVisibility(8);
            }
            if (i11 == 3) {
                this.f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.r) && !this.r.creator) {
                this.f.setVisibility(8);
            }
            if (i11 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else if (i11 == 1 && ChatObject.isChannelAndNotMegaGroup(this.r) && ChatObject.hasAdminRights(this.r)) {
            this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        this.C1 = b10Var;
        b10Var.setViewType(6);
        org.telegram.ui.Components.b10 b10Var2 = this.C1;
        b10Var2.w = false;
        b10Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.b10 b10Var3 = this.C1;
        int i12 = org.telegram.ui.ActionBar.h6.G8;
        int i13 = org.telegram.ui.ActionBar.h6.i6;
        b10Var3.f(i12, i13, i13);
        frameLayout3.addView(this.C1, w7.z5.a(-1.0f, 12.0f, 30.0f, 12.0f, 0.0f, -1, 0));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout3.addView(radialProgressView, w7.z5.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(context, frameLayout3, 1, null);
        this.b = rx0Var;
        rx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        frameLayout2.addView(this.b, w7.z5.d(-1.0f, -1));
        this.b.addView(frameLayout3, 0);
        ai.u1 u1Var = new ai.u1(this, context, 10);
        this.c = u1Var;
        u1Var.p1();
        ai.u1 u1Var2 = this.c;
        hg.i0 i0Var = new hg.i0(this);
        this.d = i0Var;
        u1Var2.setLayoutManager(i0Var);
        wq wqVar = new wq(this);
        wqVar.n(420L);
        wqVar.o(org.telegram.ui.Components.bs.h);
        wqVar.C = false;
        wqVar.m = false;
        this.c.setItemAnimator(wqVar);
        ai.u1 u1Var3 = this.c;
        u1Var3.W1 = true;
        u1Var3.X1 = 0;
        fr frVar = new fr(this, context);
        this.a = frVar;
        u1Var3.setAdapter(frVar);
        this.c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.c, w7.z5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.c);
        this.c.setOnItemClickListener(new gq(this, 3));
        this.c.setOnItemLongClickListener(new gq(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new k3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.n = undoView;
        frameLayout2.addView(undoView, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        B0();
        this.c.setEmptyView(this.b);
        ai.u1 u1Var4 = this.c;
        u1Var4.W1 = false;
        u1Var4.X1 = 0;
        if (this.n1) {
            this.f.z(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.N)) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var == null || d5Var.getLastFragment() != this) {
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
        if (chatFull.id == this.N) {
            if (booleanValue && ChatObject.isChannel(this.r)) {
                return;
            }
            boolean z10 = this.s != null;
            this.s = chatFull;
            if (!z10) {
                int k02 = k0();
                this.q1 = k02;
                this.p1 = k02;
                int i12 = this.s.boosts_unrestrict;
                this.r1 = i12 > 0;
                this.s1 = i12;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
                long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
                boolean z11 = j10 > 0;
                this.y1 = z11;
                this.x1 = z11;
                if (j10 <= 0) {
                    j10 = 10;
                }
                long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.A1 = clamp;
                this.z1 = clamp;
            }
            AndroidUtilities.runOnUIThread(new eq(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r4.w1) != r4.u1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0(boolean z10) {
        if (!this.P) {
            if (ChatObject.getBannedRightsString(this.E).equals(this.y) && this.q1 == this.p1 && !o0() && (r0 = this.v1) == this.t1) {
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.v) {
                    alertDialog$Builder.a.T = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder.a.T = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new gq(this, 1));
                alertDialog$Builder.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new gq(this, 2));
                showDialog(alertDialog$Builder.a);
            }
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.u8.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Components.nw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        int i10 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i13 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Components.rx0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Components.rx0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.h6.r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i11;
        final jr jrVar;
        boolean z12;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z13;
        String str2;
        int i12;
        if (tLObject == null || (i10 = this.e1) != 0) {
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
                z11 = ChatObject.canAddAdmins(this.r);
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
        boolean z15 = this.v;
        int i13 = this.O;
        if (i13 != 2) {
            boolean z16 = z11;
            final long j12 = j10;
            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
            org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(this, view);
            if (i13 == 3 && ChatObject.canBlockUsers(this.r)) {
                jrVar = this;
                H.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new ai.z(jrVar, j12, tL_chatBannedRights3, str, tLObject, 8), false);
                final int i14 = 0;
                H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(jrVar) { // from class: org.telegram.ui.fq
                    public final /* synthetic */ jr b;

                    {
                        this.b = jrVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.b.i0(j12);
                                break;
                            case 1:
                                jr jrVar2 = this.b;
                                long j13 = j12;
                                jrVar2.i0(j13);
                                jrVar2.getMessagesController().addUserToChat(jrVar2.N, jrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, jrVar2, null);
                                break;
                            case 2:
                                this.b.i0(j12);
                                break;
                            default:
                                jr jrVar3 = this.b;
                                MessagesController messagesController = jrVar3.getMessagesController();
                                long j14 = jrVar3.N;
                                MessagesController messagesController2 = jrVar3.getMessagesController();
                                long j15 = j12;
                                messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                jrVar3.v0(j15);
                                break;
                        }
                    }
                }, true);
            } else {
                String str3 = str;
                jrVar = this;
                if (i13 == 0 && ChatObject.canBlockUsers(jrVar.r)) {
                    if (ChatObject.canAddUsers(jrVar.r) && j10 > 0 && !ChatObject.isCommunity(jrVar.r)) {
                        final int i15 = 1;
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(z15 ? R.string.ChannelAddToChannel : R.string.ChannelAddToGroup), new Runnable(jrVar) { // from class: org.telegram.ui.fq
                            public final /* synthetic */ jr b;

                            {
                                this.b = jrVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        this.b.i0(j12);
                                        break;
                                    case 1:
                                        jr jrVar2 = this.b;
                                        long j13 = j12;
                                        jrVar2.i0(j13);
                                        jrVar2.getMessagesController().addUserToChat(jrVar2.N, jrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, jrVar2, null);
                                        break;
                                    case 2:
                                        this.b.i0(j12);
                                        break;
                                    default:
                                        jr jrVar3 = this.b;
                                        MessagesController messagesController = jrVar3.getMessagesController();
                                        long j14 = jrVar3.N;
                                        MessagesController messagesController2 = jrVar3.getMessagesController();
                                        long j15 = j12;
                                        messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                        jrVar3.v0(j15);
                                        break;
                                }
                            }
                        }, false);
                    }
                    final int i16 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(jrVar) { // from class: org.telegram.ui.fq
                        public final /* synthetic */ jr b;

                        {
                            this.b = jrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    this.b.i0(j12);
                                    break;
                                case 1:
                                    jr jrVar2 = this.b;
                                    long j13 = j12;
                                    jrVar2.i0(j13);
                                    jrVar2.getMessagesController().addUserToChat(jrVar2.N, jrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, jrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j12);
                                    break;
                                default:
                                    jr jrVar3 = this.b;
                                    MessagesController messagesController = jrVar3.getMessagesController();
                                    long j14 = jrVar3.N;
                                    MessagesController messagesController2 = jrVar3.getMessagesController();
                                    long j15 = j12;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                    jrVar3.v0(j15);
                                    break;
                            }
                        }
                    }, true);
                } else if (i13 == 1 && ChatObject.canAddAdmins(jrVar.r) && z16) {
                    if (jrVar.r.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                        H.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new ai.z(jrVar, j12, tL_chatAdminRights2, str3, tLObject, 9), false);
                    }
                    final int i17 = 3;
                    H.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(jrVar) { // from class: org.telegram.ui.fq
                        public final /* synthetic */ jr b;

                        {
                            this.b = jrVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    this.b.i0(j12);
                                    break;
                                case 1:
                                    jr jrVar2 = this.b;
                                    long j13 = j12;
                                    jrVar2.i0(j13);
                                    jrVar2.getMessagesController().addUserToChat(jrVar2.N, jrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, jrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j12);
                                    break;
                                default:
                                    jr jrVar3 = this.b;
                                    MessagesController messagesController = jrVar3.getMessagesController();
                                    long j14 = jrVar3.N;
                                    MessagesController messagesController2 = jrVar3.getMessagesController();
                                    long j15 = j12;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                    jrVar3.v0(j15);
                                    break;
                            }
                        }
                    }, true);
                }
            }
            H.W(jrVar.c.V0(view, false));
            H.S = 190;
            boolean z17 = H.x() > 0;
            if (z10 || !z17) {
                return z17;
            }
            H.Z();
            return true;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        boolean z18 = ChatObject.canAddAdmins(this.r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11);
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
        boolean z21 = ChatObject.canBlockUsers(this.r) && z13 && !z15 && ChatObject.isChannel(this.r) && !this.r.gigagroup;
        if (i10 == 0) {
            z12 = (!UserObject.isDeleted(user)) & z12;
        }
        boolean z22 = z12 || (ChatObject.canBlockUsers(this.r) && z13);
        if (z10 || !z22) {
            return z22;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        boolean z23 = z21;
        nq nqVar = new nq(this, j11, i11, tLObject, tL_chatAdminRights3, tL_chatBannedRights2, str, z13);
        long j13 = j11;
        org.telegram.ui.Components.i80 H2 = org.telegram.ui.Components.i80.H(this, view);
        H2.W(this.c.V0(view, false));
        H2.l(R.drawable.msg_admins, LocaleController.getString(z20 ? R.string.EditAdminRights : R.string.SetAsAdmin), new vi(nqVar, 12), z12);
        H2.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new org.telegram.messenger.camera.i(this, tLObject, user, nqVar, 17), z23);
        boolean z24 = ChatObject.canBlockUsers(this.r) && z13;
        int i18 = R.drawable.msg_remove;
        if (z15) {
            str2 = "ChannelRemoveUser";
            i12 = R.string.ChannelRemoveUser;
        } else {
            str2 = "KickFromGroup";
            i12 = R.string.KickFromGroup;
        }
        H2.m(z24, i18, LocaleController.getString(str2, i12), true, new a3.i0(this, user, j13, 18));
        H2.S = 190;
        H2.Z();
        return true;
    }

    public final void i0(long j10) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new org.telegram.messenger.a(), new g5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new m(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.s;
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

    public final int l0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i10 : Math.max(i10, arrayList.size());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z10 = this.r1 && q0();
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.s1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        return g0(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
        this.n.setTranslationY(-i13);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        fr frVar = this.a;
        if (frVar != null) {
            frVar.l();
        }
        org.telegram.ui.Components.rx0 rx0Var = this.b;
        if (rx0Var != null) {
            rx0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.n1) {
            this.f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        return i10 == this.V || i10 == this.W || i10 == this.X || i10 == this.Y || i10 == this.Z || i10 == this.a0 || i10 == this.k0 || i10 == this.b0 || i10 == this.c0 || i10 == this.d0;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.r;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.p1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.E;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void r0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.Q) {
            return;
        }
        int i10 = 0;
        this.J = false;
        this.I = false;
        boolean z10 = this.w;
        int i11 = this.O;
        a0.h hVar = this.L;
        ArrayList arrayList = this.G;
        a0.h hVar2 = this.M;
        ArrayList arrayList2 = this.H;
        a0.h hVar3 = this.K;
        ArrayList arrayList3 = this.F;
        if (z10 && i11 == 2) {
            this.Q = false;
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
            B0();
            fr frVar = this.a;
            if (frVar != null) {
                frVar.l();
                return;
            }
            return;
        }
        if (ChatObject.isChannel(this.r)) {
            this.Q = true;
            org.telegram.ui.Components.rx0 rx0Var = this.b;
            if (rx0Var != null) {
                rx0Var.e(true, false);
            }
            fr frVar2 = this.a;
            if (frVar2 != null) {
                frVar2.l();
            }
            ArrayList s02 = s0();
            ArrayList arrayList6 = new ArrayList();
            lq lqVar = new lq(this, s02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i14 = 0; i14 < s02.size(); i14++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i14), new ai.rb(arrayList6, i14, atomicInteger, s02, lqVar, 6)), this.classGuid);
            }
            return;
        }
        this.Q = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        hVar3.b();
        hVar2.b();
        hVar.b();
        if (i11 == 1) {
            TLRPC.ChatFull chatFull2 = this.s;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i10 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.s.participants.participants.get(i10);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    hVar3.k(chatParticipant, chatParticipant.user_id);
                    i10++;
                }
            }
        } else if (i11 == 2 && (chatFull = this.s) != null && chatFull.participants != null) {
            long j10 = getUserConfig().clientUserId;
            int size4 = this.s.participants.participants.size();
            while (i10 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.s.participants.participants.get(i10);
                int i15 = this.e1;
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
        fr frVar3 = this.a;
        if (frVar3 != null) {
            frVar3.l();
        }
        B0();
        fr frVar4 = this.a;
        if (frVar4 != null) {
            frVar4.l();
        }
    }

    public final ArrayList s0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.N);
        int i10 = this.O;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.e1 == 1) {
                if (this.J) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(s0());
                }
            } else if (!this.J) {
                this.k1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.J = true;
                arrayList.addAll(s0());
            } else if (this.I) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.I = true;
                arrayList.addAll(s0());
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        dq dqVar = new dq(j10, this.N, tL_chatAdminRights, this.E, tL_chatBannedRights, str, i10, z10, tLObject == null, null);
        dqVar.X0 = new tq(this, tLObject, j10, z11);
        presentFragment(dqVar, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if ((r0 && r13.w1) != r13.u1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0() {
        TLRPC.ChatFull chatFull;
        boolean z10 = false;
        int i10 = this.O;
        if (i10 == 3) {
            TLRPC.Chat chat = this.r;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.p1 != this.q1 || this.y1) && this.s != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.N, this, new gq(this, 0));
                return;
            }
            if (!ChatObject.getBannedRightsString(this.E).equals(this.y)) {
                getMessagesController().setDefaultBannedRole(this.N, this.E, ChatObject.isChannel(this.r), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.N));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.E;
                }
            }
            int i11 = this.p1;
            if (i11 != this.q1 && (chatFull = this.s) != null) {
                chatFull.slowmode_seconds = m0(i11);
                this.s.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.N, this.s.slowmode_seconds);
            }
            boolean z11 = this.y1;
            if (z11 != this.x1 || (z11 && this.z1 != this.A1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.N);
                updatepaidmessagesprice.send_paid_messages_stars = this.y1 ? this.A1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new ci.e6(11));
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.N));
                if (chat3 != null) {
                    if (this.y1) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.A1;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (o0()) {
                boolean z12 = this.r1 && q0();
                if (z12 && this.s1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.N, 1);
                } else if (z12 || this.s1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.N, this.s1);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.N, 0);
                }
            }
        } else if (i10 == 1) {
            boolean z13 = this.v1;
            if (z13 == this.t1) {
            }
            MessagesController messagesController = getMessagesController();
            long j10 = this.N;
            boolean z14 = this.v1;
            if (z14 && this.w1) {
                z10 = true;
            }
            messagesController.toggleChannelSignatures(j10, z14, z10);
        }
        finishFragment();
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        dr w02 = w0();
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.M;
                arrayList = this.H;
            } else if (i10 == 1) {
                hVar = this.L;
                arrayList = this.G;
            } else {
                hVar = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(w02);
        }
        s4.g0 adapter = this.c.getAdapter();
        ir irVar = this.e;
        if (adapter == irVar) {
            hg.a2 a2Var = irVar.h;
            Object f7 = a2Var.f.f(j10);
            if (f7 != null) {
                a2Var.e.remove(f7);
            }
            Object f10 = a2Var.h.f(j10);
            if (f10 != null) {
                a2Var.g.remove(f10);
            }
            Object f11 = irVar.e.f(j10);
            if (f11 != null) {
                irVar.d.remove(f11);
            }
            irVar.l();
        }
    }

    public final dr w0() {
        dr drVar = new dr(this);
        drVar.b = this.d1;
        drVar.i = this.X0;
        drVar.j = this.Y0;
        drVar.l.clear();
        drVar.l.addAll(this.G);
        drVar.h = this.V0;
        drVar.g = this.U0;
        drVar.m.clear();
        drVar.m.addAll(this.H);
        drVar.e = this.E0;
        drVar.f = this.F0;
        drVar.k.clear();
        drVar.k.addAll(this.F);
        drVar.f(drVar.c);
        return drVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        this.s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.q1 = k02;
            this.p1 = k02;
            int i10 = this.s.boosts_unrestrict;
            this.r1 = i10 > 0;
            this.s1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
            long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z10 = j10 > 0;
            this.y1 = z10;
            this.x1 = z10;
            if (j10 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.A1 = clamp;
            this.z1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (this.isPaused || !this.B1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.R) {
            return;
        }
        View view = null;
        for (int i11 = 0; i11 < this.c.getChildCount(); i11++) {
            View childAt = this.c.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.b10) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i10--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new qq(this, (org.telegram.ui.Components.b10) view, i10, 0));
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new mq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
