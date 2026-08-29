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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jr extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A;
    public int A0;
    public final ArrayList B;
    public int B0;
    public final ArrayList C;
    public int C0;
    public final ArrayList D;
    public int D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public int F0;
    public final a0.h G;
    public int G0;
    public final a0.h H;
    public int H0;
    public final a0.h I;
    public int I0;
    public long J;
    public int J0;
    public final int K;
    public int K0;
    public final boolean L;
    public int L0;
    public boolean M;
    public int M0;
    public boolean N;
    public int N0;
    public int O;
    public int O0;
    public int P;
    public int P0;
    public int Q;
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
    public fr a;
    public int a0;
    public final int a1;
    public org.telegram.ui.Components.qw0 b;
    public int b0;
    public int b1;
    public jh.e1 c;
    public int c0;
    public int c1;
    public vq d;
    public int d0;
    public int d1;
    public ir e;
    public int e0;
    public int e1;
    public org.telegram.ui.ActionBar.w0 f;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int h0;
    public boolean h1;
    public int i0;
    public cr i1;
    public int j0;
    public final boolean j1;
    public int k0;
    public boolean k1;
    public int l0;
    public int l1;
    public int m0;
    public int m1;
    public UndoView n;
    public int n0;
    public boolean n1;
    public int o0;
    public int o1;
    public int p0;
    public final boolean p1;
    public int q0;
    public final boolean q1;
    public TLRPC.Chat r;
    public int r0;
    public boolean r1;
    public TLRPC.ChatFull s;
    public boolean s0;
    public boolean s1;
    public int t0;
    public boolean t1;
    public int u0;
    public boolean u1;
    public final boolean v;
    public int v0;
    public long v1;
    public final boolean w;
    public int w0;
    public long w1;
    public final boolean x;
    public int x0;
    public boolean x1;
    public final String y;
    public int y0;
    public org.telegram.ui.Components.p00 y1;
    public int z0;
    public RadialProgressView z1;

    public jr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.A = new TLRPC.TL_chatBannedRights();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.G = new a0.h();
        this.H = new a0.h();
        this.I = new a0.h();
        this.v1 = 10L;
        this.w1 = 10L;
        this.J = this.arguments.getLong("chat_id");
        this.K = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR);
        this.L = this.arguments.getBoolean("transfer");
        this.j1 = this.arguments.getBoolean("open_search");
        this.a1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
        this.r = chat;
        boolean z10 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.A;
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
        this.y = ChatObject.getBannedRightsString(this.A);
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
            this.r1 = z18;
            this.p1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.s1 = z19;
            this.q1 = z19;
        }
    }

    public static /* synthetic */ void U(jr jrVar, long j10) {
        if (j10 != 0) {
            jrVar.J = j10;
            jrVar.r = MessagesController.getInstance(jrVar.currentAccount).getChat(Long.valueOf(j10));
            jrVar.u0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(final jr jrVar, View view, int i10) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m10;
        long j10;
        boolean z10;
        String str;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject;
        boolean z11;
        TLObject tLObject2;
        boolean canBlockUsers;
        boolean z12;
        int i11;
        long j12;
        String str2;
        boolean z13;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i12 = jrVar.a1;
        a0.h hVar = jrVar.G;
        a0.h hVar2 = jrVar.I;
        boolean z14 = jrVar.v;
        int i13 = jrVar.K;
        final int i14 = 0;
        i14 = 0;
        i14 = 0;
        final int i15 = 1;
        boolean z15 = jrVar.c.getAdapter() == jrVar.a;
        if (i10 == jrVar.d1) {
            boolean z16 = !jrVar.r1;
            jrVar.r1 = z16;
            ((org.telegram.ui.Cells.q8) view).setChecked(z16);
            AndroidUtilities.updateVisibleRows(jrVar.c);
            dr w02 = jrVar.w0();
            jrVar.B0();
            jrVar.A0(w02);
            jrVar.a.m(jrVar.f1);
        } else if (i10 == jrVar.e1) {
            boolean z17 = !jrVar.s1;
            jrVar.s1 = z17;
            ((org.telegram.ui.Cells.q8) view).setChecked(z17);
            AndroidUtilities.updateVisibleRows(jrVar.c);
            dr w03 = jrVar.w0();
            jrVar.B0();
            jrVar.A0(w03);
            jrVar.a.m(jrVar.f1);
        } else if (i10 == jrVar.j0) {
            boolean z18 = !jrVar.u1;
            jrVar.u1 = z18;
            ((org.telegram.ui.Cells.q8) view).setChecked(z18);
            AndroidUtilities.updateVisibleRows(jrVar.c);
            dr w04 = jrVar.w0();
            jrVar.B0();
            jrVar.A0(w04);
            jrVar.a.m(jrVar.j0);
        } else if (z15) {
            if (jrVar.p0(i10)) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                if (i10 == jrVar.R) {
                    jrVar.A.send_photos = !r15.send_photos;
                } else if (i10 == jrVar.S) {
                    jrVar.A.send_videos = !r14.send_videos;
                } else if (i10 == jrVar.T) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = jrVar.A;
                    boolean z19 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z19;
                    tL_chatBannedRights2.send_gifs = z19;
                    tL_chatBannedRights2.send_games = z19;
                    tL_chatBannedRights2.send_stickers = z19;
                } else if (i10 == jrVar.U) {
                    jrVar.A.send_audios = !r14.send_audios;
                } else if (i10 == jrVar.V) {
                    jrVar.A.send_docs = !r14.send_docs;
                } else if (i10 == jrVar.W) {
                    jrVar.A.send_voices = !r14.send_voices;
                } else if (i10 == jrVar.X) {
                    jrVar.A.send_roundvideos = !r14.send_roundvideos;
                } else if (i10 == jrVar.Y) {
                    if (jrVar.A.send_plain && (m10 = jrVar.d.m(jrVar.P)) != null) {
                        AndroidUtilities.shakeViewSpring(m10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        jrVar.A.embed_links = !r14.embed_links;
                    }
                } else if (i10 == jrVar.Z) {
                    jrVar.A.send_polls = !r14.send_polls;
                } else if (i10 == jrVar.g0) {
                    jrVar.A.send_reactions = !r14.send_reactions;
                }
                y1Var.c(!y1Var.b(), true);
                AndroidUtilities.updateVisibleRows(jrVar.c);
                dr w05 = jrVar.w0();
                jrVar.B0();
                jrVar.A0(w05);
            } else if (i10 == jrVar.M0) {
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                boolean z20 = !p8Var.d.h;
                jrVar.n1 = z20;
                p8Var.setChecked(z20);
                AndroidUtilities.updateVisibleRows(jrVar.c);
                dr w06 = jrVar.w0();
                jrVar.B0();
                jrVar.A0(w06);
            } else {
                if (i10 == jrVar.v0) {
                    if (i13 == 0 || i13 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", jrVar.J);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i13 == 0 ? 2 : 3);
                        jr jrVar2 = new jr(bundle);
                        jrVar2.x0(jrVar.s);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = jrVar.A;
                        if (tL_chatBannedRights3 != null) {
                            jrVar2.A = tL_chatBannedRights3;
                        }
                        jrVar2.i1 = new xq(jrVar);
                        jrVar.presentFragment(jrVar2);
                        return;
                    }
                    if (i13 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", jrVar.J);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        jr jrVar3 = new jr(bundle2);
                        jrVar3.i1 = new yq(jrVar);
                        jrVar3.x0(jrVar.s);
                        jrVar.presentFragment(jrVar3);
                        return;
                    }
                    if (i13 == 2) {
                        Bundle i16 = a4.w.i("addToGroup", true);
                        i16.putLong(z14 ? "channelId" : "chatId", jrVar.r.id);
                        m60 m60Var = new m60(i16);
                        m60Var.E = jrVar.s;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        m60Var.F = hVar;
                        m60Var.x = new ar(jrVar, m60Var);
                        jrVar.presentFragment(m60Var);
                        return;
                    }
                    return;
                }
                if (i10 == jrVar.r0) {
                    jrVar.presentFragment(new ob(jrVar.r));
                    return;
                }
                if (i10 == jrVar.t0) {
                    final org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    TLRPC.ChatFull chatFull3 = jrVar.s;
                    if (chatFull3 != null && !chatFull3.antispam && jrVar.l0() < jrVar.getMessagesController().telegramAntispamGroupSizeMin) {
                        org.telegram.ui.Components.tc.a0(jrVar).Q(R.raw.msg_antispam, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", jrVar.getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (jrVar.s == null || !ChatObject.canUserDoAdminAction(jrVar.r, 13) || jrVar.s0) {
                        return;
                    }
                    jrVar.s0 = true;
                    final boolean z21 = jrVar.s.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = jrVar.getMessagesController().getInputChannel(jrVar.J);
                    TLRPC.ChatFull chatFull4 = jrVar.s;
                    boolean z22 = !chatFull4.antispam;
                    chatFull4.antispam = z22;
                    tL_channels_toggleAntiSpam.enabled = z22;
                    m8Var.setChecked(z22);
                    m8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 13) && ((chatFull2 = jrVar.s) == null || chatFull2.antispam || jrVar.l0() >= jrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
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
                                        jrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        jrVar4.getMessagesController().putChatFull(jrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.m8 m8Var2 = m8Var;
                                        final boolean z23 = z21;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        jr jrVar5 = jrVar4;
                                                        if (jrVar5.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar5.s;
                                                            boolean z24 = z23;
                                                            chatFull7.antispam = z24;
                                                            org.telegram.ui.Cells.m8 m8Var3 = m8Var2;
                                                            m8Var3.setChecked(z24);
                                                            m8Var3.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar5.r, 13) || ((chatFull5 = jrVar5.s) != null && chatFull5.antispam && jrVar5.l0() < jrVar5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar5).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar4;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z23;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.m8 m8Var4 = m8Var2;
                                                            m8Var4.setChecked(z25);
                                                            m8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar4.s0 = false;
                                    break;
                                default:
                                    final jr jrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        jrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        jrVar5.getMessagesController().putChatFull(jrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.m8 m8Var3 = m8Var;
                                        final boolean z24 = z21;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i18) {
                                                    case 0:
                                                        jr jrVar52 = jrVar5;
                                                        if (jrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar52.s;
                                                            boolean z242 = z24;
                                                            chatFull7.antispam = z242;
                                                            org.telegram.ui.Cells.m8 m8Var32 = m8Var3;
                                                            m8Var32.setChecked(z242);
                                                            m8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar52.r, 13) || ((chatFull5 = jrVar52.s) != null && chatFull5.antispam && jrVar52.l0() < jrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar5;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z24;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.m8 m8Var4 = m8Var3;
                                                            m8Var4.setChecked(z25);
                                                            m8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar5.E0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == jrVar.F0) {
                    final org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                    if (jrVar.l0() < jrVar.getMessagesController().hiddenMembersGroupSizeMin) {
                        org.telegram.ui.Components.tc.a0(jrVar).Q(R.raw.contacts_sync_off, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", jrVar.getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).j();
                        return;
                    }
                    if (jrVar.s == null || !ChatObject.canUserDoAdminAction(jrVar.r, 2) || jrVar.E0) {
                        return;
                    }
                    jrVar.E0 = true;
                    final boolean z23 = jrVar.s.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = jrVar.getMessagesController().getInputChannel(jrVar.J);
                    TLRPC.ChatFull chatFull5 = jrVar.s;
                    boolean z24 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z24;
                    tL_channels_toggleParticipantsHidden.enabled = z24;
                    m8Var2.setChecked(z24);
                    Switch checkBox = m8Var2.getCheckBox();
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
                                        jrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        jrVar4.getMessagesController().putChatFull(jrVar4.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.m8 m8Var22 = m8Var2;
                                        final boolean z232 = z23;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i17) {
                                                    case 0:
                                                        jr jrVar52 = jrVar4;
                                                        if (jrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar52.s;
                                                            boolean z242 = z232;
                                                            chatFull7.antispam = z242;
                                                            org.telegram.ui.Cells.m8 m8Var32 = m8Var22;
                                                            m8Var32.setChecked(z242);
                                                            m8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar52.r, 13) || ((chatFull52 = jrVar52.s) != null && chatFull52.antispam && jrVar52.l0() < jrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar4;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z232;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.m8 m8Var4 = m8Var22;
                                                            m8Var4.setChecked(z25);
                                                            m8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar4.s0 = false;
                                    break;
                                default:
                                    final jr jrVar5 = this.b;
                                    if (tLObject3 != null) {
                                        jrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        jrVar5.getMessagesController().putChatFull(jrVar5.s);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.m8 m8Var3 = m8Var2;
                                        final boolean z242 = z23;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                switch (i18) {
                                                    case 0:
                                                        jr jrVar52 = jrVar5;
                                                        if (jrVar52.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull7 = jrVar52.s;
                                                            boolean z2422 = z242;
                                                            chatFull7.antispam = z2422;
                                                            org.telegram.ui.Cells.m8 m8Var32 = m8Var3;
                                                            m8Var32.setChecked(z2422);
                                                            m8Var32.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar52.r, 13) || ((chatFull52 = jrVar52.s) != null && chatFull52.antispam && jrVar52.l0() < jrVar52.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar52).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jr jrVar6 = jrVar5;
                                                        if (jrVar6.getParentActivity() != null) {
                                                            TLRPC.ChatFull chatFull8 = jrVar6.s;
                                                            boolean z25 = z242;
                                                            chatFull8.participants_hidden = z25;
                                                            org.telegram.ui.Cells.m8 m8Var4 = m8Var3;
                                                            m8Var4.setChecked(z25);
                                                            m8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(jrVar6.r, 2) || ((chatFull6 = jrVar6.s) != null && chatFull6.participants_hidden && jrVar6.l0() < jrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                            org.telegram.ui.Components.tc.a0(jrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    jrVar5.E0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == jrVar.H0) {
                    if (jrVar.r == null) {
                        return;
                    }
                    final org.telegram.ui.Cells.m8 m8Var3 = (org.telegram.ui.Cells.m8) view;
                    final boolean b10 = m8Var3.b();
                    m8Var3.setChecked(!m8Var3.b());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(jrVar.r);
                    TLRPC.Chat chat = jrVar.r;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = jrVar.r.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !m8Var3.b();
                    jrVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.iq
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.Updates updates = (TLRPC.Updates) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            jr jrVar4 = jr.this;
                            if (updates != null) {
                                jrVar4.getMessagesController().processUpdates(updates, false);
                                return;
                            }
                            jrVar4.getClass();
                            if (tL_error != null) {
                                m8Var3.setChecked(b10);
                                org.telegram.ui.Components.tc.a0(jrVar4).d0(tL_error, false);
                            }
                        }
                    });
                } else {
                    if (i10 == jrVar.x0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", jrVar.J);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        jr jrVar4 = new jr(bundle3);
                        jrVar4.x0(jrVar.s);
                        jrVar.presentFragment(jrVar4);
                        return;
                    }
                    if (i10 == jrVar.p0) {
                        jrVar.showDialog(new br(jrVar, jrVar.getParentActivity(), jrVar));
                    } else {
                        if (i10 == jrVar.w0) {
                            if (jrVar.s != null) {
                                hh0 hh0Var = new hh0(jrVar.J, 0L, 0);
                                TLRPC.ChatFull chatFull6 = jrVar.s;
                                hh0Var.g0(chatFull6, chatFull6.exported_invite);
                                jrVar.presentFragment(hh0Var);
                                return;
                            }
                            return;
                        }
                        if ((i10 > jrVar.O && i10 <= Math.max(jrVar.h0, jrVar.c0)) || i10 == jrVar.i0) {
                            org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                            boolean isEnabled = p8Var2.isEnabled();
                            Switch r42 = p8Var2.d;
                            if (isEnabled) {
                                if (r42.B != null) {
                                    if (ChatObject.isPublic(jrVar.r) && (i10 == jrVar.e0 || i10 == jrVar.c0)) {
                                        org.telegram.messenger.x3.s(R.string.EditCantEditPermissionsPublic, org.telegram.ui.Components.tc.a0(jrVar), null);
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(jrVar.currentAccount, jrVar.J) && (i10 == jrVar.e0 || i10 == jrVar.c0)) {
                                        org.telegram.messenger.x3.s(R.string.EditCantEditPermissionsDiscussion, org.telegram.ui.Components.tc.a0(jrVar), null);
                                        return;
                                    } else {
                                        org.telegram.ui.Components.tc.a0(jrVar).t(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions), null).j();
                                        return;
                                    }
                                }
                                if (i10 == jrVar.Q) {
                                    dr w07 = jrVar.w0();
                                    jrVar.h1 = !jrVar.h1;
                                    AndroidUtilities.updateVisibleRows(jrVar.c);
                                    jrVar.A0(w07);
                                    return;
                                }
                                p8Var2.setChecked(!r42.h);
                                if (i10 == jrVar.c0) {
                                    jrVar.A.change_info = !r0.change_info;
                                    return;
                                }
                                if (i10 == jrVar.i0) {
                                    jrVar.A.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i10 == jrVar.d0) {
                                    jrVar.A.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i10 == jrVar.h0) {
                                    jrVar.A.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i10 == jrVar.e0) {
                                    jrVar.A.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i10 == jrVar.f0) {
                                    jrVar.A.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i10 == jrVar.P) {
                                    jrVar.A.send_plain = !r1.send_plain;
                                    int i17 = jrVar.Y;
                                    if (i17 >= 0) {
                                        jrVar.a.m(i17);
                                    }
                                    int i18 = jrVar.Q;
                                    if (i18 >= 0) {
                                        jrVar.a.m(i18);
                                    }
                                    dr w08 = jrVar.w0();
                                    jrVar.B0();
                                    jrVar.A0(w08);
                                    return;
                                }
                                if (i10 == jrVar.Q) {
                                    dr w09 = jrVar.w0();
                                    jrVar.h1 = !jrVar.h1;
                                    AndroidUtilities.updateVisibleRows(jrVar.c);
                                    jrVar.A0(w09);
                                    return;
                                }
                                if (i10 == jrVar.a0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = jrVar.A;
                                    boolean z25 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z25;
                                    tL_chatBannedRights5.send_gifs = z25;
                                    tL_chatBannedRights5.send_games = z25;
                                    tL_chatBannedRights5.send_stickers = z25;
                                    return;
                                }
                                if (i10 == jrVar.b0) {
                                    jrVar.A.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i10 == jrVar.Z) {
                                        jrVar.A.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
                if (z15) {
                    TLObject E = jrVar.e.E(i10);
                    if (E instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) E;
                        jrVar.getMessagesController().putUser(user, false);
                        long j13 = user.id;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 3) {
                                tLObject2 = null;
                                break;
                            }
                            tLObject2 = (TLObject) (i19 == 0 ? hVar2 : i19 == 1 ? jrVar.H : hVar).f(j13);
                            if (tLObject2 != null) {
                                break;
                            } else {
                                i19++;
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
                        z10 = z14;
                        tL_chatBannedRights = tL_chatBannedRights6;
                        str = channelParticipant.rank;
                        tLObject = E;
                        z11 = z26;
                        tL_chatAdminRights = tL_chatAdminRights3;
                    } else if (E instanceof TLRPC.ChatParticipant) {
                        long j14 = ((TLRPC.ChatParticipant) E).user_id;
                        z10 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        tLObject = E;
                        z11 = jrVar.r.creator;
                        tL_chatAdminRights = null;
                        j11 = j14;
                    } else {
                        z10 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = j10;
                        tL_chatAdminRights = null;
                        tLObject = E;
                        if (E != null) {
                            z11 = false;
                        }
                        z11 = true;
                    }
                    if (j11 == 0) {
                    }
                } else {
                    TLObject E2 = jrVar.a.E(i10);
                    if (E2 instanceof TLRPC.User) {
                        z10 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = ((TLRPC.User) E2).id;
                        tL_chatAdminRights = null;
                        tLObject = E2;
                        z11 = true;
                        if (j11 == 0) {
                            return;
                        }
                        if (i12 != 0) {
                            int i20 = 1;
                            if (i12 != 3 && i12 != 1) {
                                if (ChatObject.isChannel(jrVar.r)) {
                                    jrVar.getMessagesController().deleteParticipantFromChat(jrVar.J, jrVar.getMessagesController().getUser(Long.valueOf(j11)));
                                    cr crVar = jrVar.i1;
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
                                if (!z11) {
                                    j12 = j11;
                                    str2 = str;
                                    z13 = z11;
                                    i20 = 1;
                                    jrVar.t0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z13, i12 != i20 ? 0 : 1, i12 != i20 || i12 == 3);
                                    return;
                                }
                                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                                    TLRPC.User user2 = jrVar.getMessagesController().getUser(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jrVar.getParentActivity());
                                    String string = LocaleController.getString("AppName", R.string.AppName);
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.N = string;
                                    c2Var.P = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new jq(jrVar, user2, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z11));
                                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                    jrVar.showDialog(c2Var);
                                    return;
                                }
                                j12 = j11;
                                str2 = str;
                                i20 = 1;
                            }
                            z13 = z11;
                            jrVar.t0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z13, i12 != i20 ? 0 : 1, i12 != i20 || i12 == 3);
                            return;
                        }
                        long j15 = j11;
                        boolean z27 = z11;
                        if (i13 == 1) {
                            canBlockUsers = j15 != jrVar.getUserConfig().getClientUserId() && (jrVar.r.creator || z27);
                        } else {
                            if (i13 != 0 && i13 != 3) {
                                z12 = false;
                                if (i13 != 0 || ((i13 != 1 && z10) || (i13 == 2 && i12 == 0))) {
                                    if (j15 != jrVar.getUserConfig().getClientUserId()) {
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    if (j11 > 0) {
                                        bundle4.putLong("user_id", j15);
                                    } else {
                                        bundle4.putLong("chat_id", -j15);
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
                                dq dqVar = new dq(j15, jrVar.J, tL_chatAdminRights, jrVar.A, tL_chatBannedRights, str, i13 == i11 ? 0 : 1, z12, tLObject == null, null);
                                dqVar.T0 = new oq(jrVar, tLObject);
                                jrVar.presentFragment(dqVar);
                                return;
                            }
                            canBlockUsers = ChatObject.canBlockUsers(jrVar.r);
                        }
                        z12 = canBlockUsers;
                        if (i13 != 0) {
                        }
                        if (j15 != jrVar.getUserConfig().getClientUserId()) {
                        }
                    } else {
                        if (E2 instanceof TLRPC.ChannelParticipant) {
                            TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E2;
                            j11 = MessageObject.getPeerId(channelParticipant2.peer);
                            TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                            String str3 = channelParticipant2.rank;
                            boolean z28 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                            if ((E2 instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights4 = ((TLRPC.TL_channelParticipantCreator) E2).admin_rights) == null) {
                                tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                                tL_chatAdminRights4.manage_ranks = true;
                                tL_chatAdminRights4.add_admins = true;
                                tL_chatAdminRights4.pin_messages = true;
                                tL_chatAdminRights4.manage_topics = true;
                                tL_chatAdminRights4.invite_users = true;
                                tL_chatAdminRights4.ban_users = true;
                                tL_chatAdminRights4.delete_messages = true;
                                tL_chatAdminRights4.edit_messages = true;
                                tL_chatAdminRights4.post_messages = true;
                                tL_chatAdminRights4.change_info = true;
                                if (!z14) {
                                    tL_chatAdminRights4.manage_call = true;
                                }
                            }
                            boolean z29 = z28;
                            tLObject = E2;
                            z11 = z29;
                            tL_chatBannedRights = tL_chatBannedRights7;
                            tL_chatAdminRights = tL_chatAdminRights4;
                            z10 = z14;
                            str = str3;
                        } else {
                            if (E2 instanceof TLRPC.ChatParticipant) {
                                long j16 = ((TLRPC.ChatParticipant) E2).user_id;
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
                                    if (!z14) {
                                        tL_chatAdminRights2.manage_call = true;
                                    }
                                } else {
                                    tL_chatAdminRights2 = null;
                                }
                                str = "";
                                tLObject = E2;
                                z11 = z30;
                                tL_chatAdminRights = tL_chatAdminRights2;
                                j11 = j16;
                                z10 = z14;
                            } else {
                                tLObject = E2;
                                z10 = z14;
                                str = "";
                                j11 = 0;
                                z11 = false;
                                tL_chatAdminRights = null;
                            }
                            tL_chatBannedRights = null;
                        }
                        if (j11 == 0) {
                        }
                    }
                }
            }
        }
        if (z15) {
        }
    }

    public static void W(jr jrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = 0;
        while (i10 < 3) {
            TLObject tLObject = (TLObject) (i10 == 0 ? jrVar.I : i10 == 1 ? jrVar.H : jrVar.G).f(MessageObject.getPeerId(channelParticipant.peer));
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
        a0.h hVar2 = jrVar.G;
        ArrayList arrayList2 = jrVar.B;
        UndoView undoView = jrVar.n;
        long j10 = -jrVar.J;
        boolean z12 = jrVar.v;
        undoView.m(j10, user, z12 ? 9 : 10);
        jrVar.r.creator = false;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < 3) {
            boolean z14 = true;
            if (i10 == 0) {
                hVar = jrVar.I;
                arrayList = jrVar.D;
            } else if (i10 == 1) {
                hVar = jrVar.H;
                arrayList = jrVar.C;
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
                z13 = true;
                z10 = true;
            } else {
                z10 = false;
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
                z11 = z13;
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
                z11 = z13;
                z14 = z10;
            }
            if (z14) {
                Collections.sort(arrayList, new lh.e4(19));
            }
            i10++;
            z13 = z11;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new lh.e4(18));
            jrVar.B0();
        }
        jrVar.a.l();
        cr crVar = jrVar.i1;
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
        f2.q.c(drVar, true).b(this.a);
        jh.e1 e1Var = this.c;
        if (e1Var == null || this.d == null || e1Var.getChildCount() <= 0) {
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
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.J));
        this.r = chat2;
        if (chat2 == null) {
            return;
        }
        this.r0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.q0 = -1;
        this.p0 = -1;
        this.o0 = -1;
        this.B0 = -1;
        this.X0 = -1;
        this.d1 = -1;
        this.e1 = -1;
        this.f1 = -1;
        this.Y0 = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.a0 = -1;
        this.Z = -1;
        this.b0 = -1;
        this.d0 = -1;
        this.i0 = -1;
        this.h0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.c0 = -1;
        this.x0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.W0 = -1;
        this.b1 = -1;
        this.c1 = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.Z0 = 0;
        ArrayList arrayList = this.B;
        boolean z14 = this.w;
        int i10 = 1;
        int i11 = this.K;
        if (i11 == 3) {
            int i12 = this.Z0;
            int i13 = i12 + 1;
            this.Z0 = i13;
            this.O = i12;
            if (!z14) {
                this.P = i13;
                int i14 = i12 + 3;
                this.Z0 = i14;
                this.Q = i12 + 2;
                if (this.h1) {
                    this.R = i14;
                    this.S = i12 + 4;
                    this.T = i12 + 5;
                    this.U = i12 + 6;
                    this.V = i12 + 7;
                    this.W = i12 + 8;
                    this.X = i12 + 9;
                    this.Y = i12 + 10;
                    this.Z = i12 + 11;
                    this.Z0 = i12 + 13;
                    this.g0 = i12 + 12;
                }
                int i15 = this.Z0;
                this.d0 = i15;
                this.e0 = i15 + 1;
                this.Z0 = i15 + 3;
                this.f0 = i15 + 2;
            }
            int i16 = this.Z0;
            int i17 = i16 + 1;
            this.Z0 = i17;
            this.c0 = i16;
            if (z14) {
                this.Z0 = i16 + 2;
                this.i0 = i17;
            } else if (this.x) {
                this.Z0 = i16 + 2;
                this.h0 = i17;
            }
            if (ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat3 = this.r;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !z14) {
                    int i18 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.s;
                    if (Math.max(i18, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i19 = this.Z0;
                        this.D0 = i19;
                        this.o0 = i19 + 1;
                        this.p0 = i19 + 2;
                        this.Z0 = i19 + 4;
                        this.q0 = i19 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.s;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z14 && ChatObject.canUserDoAction(this.r, 2) && (ChatObject.isChannel(this.r) || ((chat = this.r) != null && chat.creator))) {
                if (this.D0 == -1) {
                    int i20 = this.Z0;
                    this.Z0 = i20 + 1;
                    this.D0 = i20;
                }
                int i21 = this.Z0;
                this.j0 = i21;
                int i22 = i21 + 2;
                this.Z0 = i22;
                this.k0 = i21 + 1;
                if (this.u1) {
                    this.l0 = i22;
                    this.m0 = i21 + 3;
                    this.Z0 = i21 + 5;
                    this.n0 = i21 + 4;
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
                if (this.D0 == -1) {
                    int i23 = this.Z0;
                    this.Z0 = i23 + 1;
                    this.D0 = i23;
                }
                int i24 = this.Z0;
                this.J0 = i24;
                this.K0 = i24 + 1;
                this.Z0 = i24 + 3;
                this.L0 = i24 + 2;
            }
            if (q0() && !z14) {
                if (this.D0 == -1) {
                    int i25 = this.Z0;
                    this.Z0 = i25 + 1;
                    this.D0 = i25;
                }
                int i26 = this.Z0;
                int i27 = i26 + 1;
                this.Z0 = i27;
                this.M0 = i26;
                if (this.n1) {
                    this.Z0 = i26 + 2;
                    this.O0 = i27;
                }
                int i28 = this.Z0;
                this.Z0 = i28 + 1;
                this.N0 = i28;
            }
            if (ChatObject.isChannel(this.r) && !z14) {
                if (this.D0 == -1) {
                    int i29 = this.Z0;
                    this.Z0 = i29 + 1;
                    this.D0 = i29;
                }
                int i30 = this.Z0;
                this.Z0 = i30 + 1;
                this.x0 = i30;
            }
            if ((this.L0 == -1 && this.o0 == -1) || this.x0 != -1) {
                int i31 = this.Z0;
                this.Z0 = i31 + 1;
                this.C0 = i31;
            }
            if (ChatObject.canBlockUsers(this.r) && !z14 && l0() > 1 && (ChatObject.isChannel(this.r) || this.r.creator)) {
                int i32 = this.Z0;
                this.Z0 = i32 + 1;
                this.v0 = i32;
            }
            if (this.M && !(z13 = this.N)) {
                if (z13 || (chatFull3 = this.s) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i33 = this.Z0;
                this.Z0 = i33 + 1;
                this.b1 = i33;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i34 = this.Z0;
                this.A0 = i34;
                int size = arrayList.size() + i34;
                this.Z0 = size;
                this.B0 = size;
            }
            if (this.v0 == -1 && this.A0 == -1) {
                return;
            }
            int i35 = this.Z0;
            this.Z0 = i35 + 1;
            this.y0 = i35;
            return;
        }
        if (i11 == 0) {
            if (ChatObject.canBlockUsers(this.r)) {
                int i36 = this.Z0;
                this.Z0 = i36 + 1;
                this.v0 = i36;
                if (!arrayList.isEmpty() || (this.M && !this.N && (chatFull2 = this.s) != null && chatFull2.kicked_count > 0)) {
                    int i37 = this.Z0;
                    this.Z0 = i37 + 1;
                    this.X0 = i37;
                }
            }
            if (this.M && !(z12 = this.N)) {
                if (z12) {
                    return;
                }
                int i38 = this.Z0;
                this.z0 = i38;
                this.Z0 = i38 + 2;
                this.b1 = i38 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i39 = this.Z0;
                int i40 = i39 + 1;
                this.Z0 = i40;
                this.z0 = i39;
                this.A0 = i40;
                int size2 = arrayList.size() + i40;
                this.Z0 = size2;
                this.B0 = size2;
            }
            if (this.A0 == -1) {
                int i41 = this.Z0;
                this.Z0 = i41 + 1;
                this.Y0 = i41;
                return;
            } else if (this.X0 == -1) {
                int i42 = this.Z0;
                this.Z0 = i42 + 1;
                this.X0 = i42;
                return;
            } else {
                int i43 = this.Z0;
                this.Z0 = i43 + 1;
                this.y0 = i43;
                return;
            }
        }
        if (i11 == 1) {
            boolean z15 = this.L;
            if (!z15 && ChatObject.isChannel(this.r)) {
                TLRPC.Chat chat5 = this.r;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.s) == null || chatFull.participants_count <= 200 || (!this.v && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i44 = this.Z0;
                        this.t0 = i44;
                        this.Z0 = i44 + 2;
                        this.u0 = i44 + 1;
                    } else {
                        int i45 = this.Z0;
                        this.Z0 = i45 + 1;
                        this.y0 = i45;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.r)) {
                int i46 = this.Z0;
                this.Z0 = i46 + 1;
                this.v0 = i46;
            }
            if (!this.M || (z11 = this.N)) {
                if (!arrayList.isEmpty()) {
                    int i47 = this.Z0;
                    this.A0 = i47;
                    int size3 = arrayList.size() + i47;
                    this.Z0 = size3;
                    this.B0 = size3;
                }
                if (!z14) {
                    int i48 = this.Z0;
                    this.Z0 = i48 + 1;
                    this.X0 = i48;
                }
            } else if (!z11) {
                int i49 = this.Z0;
                this.Z0 = i49 + 1;
                this.b1 = i49;
            }
            if (z15 || !ChatObject.isChannelAndNotMegaGroup(this.r) || !ChatObject.hasAdminRights(this.r) || z14) {
                return;
            }
            int i50 = this.Z0;
            int i51 = i50 + 1;
            this.Z0 = i51;
            this.d1 = i50;
            if (!this.r1) {
                this.Z0 = i50 + 2;
                this.f1 = i51;
                return;
            } else {
                this.e1 = i51;
                this.Z0 = i50 + 3;
                this.f1 = i50 + 2;
                return;
            }
        }
        if (i11 == 2) {
            if (ChatObject.isChannel(this.r) && !ChatObject.isChannelAndNotMegaGroup(this.r) && !this.j1) {
                int i52 = this.Z0;
                this.F0 = i52;
                this.Z0 = i52 + 2;
                this.G0 = i52 + 1;
            }
            int i53 = this.a1;
            if (i53 == 0 && ChatObject.canAddUsers(this.r)) {
                int i54 = this.Z0;
                this.Z0 = i54 + 1;
                this.v0 = i54;
            }
            if (i53 == 0 && ChatObject.canUserDoAdminAction(this.r, 3)) {
                int i55 = this.Z0;
                this.Z0 = i55 + 1;
                this.w0 = i55;
            }
            if (this.M && !(z10 = this.N)) {
                if (z10) {
                    return;
                }
                if (i53 == 0) {
                    int i56 = this.Z0;
                    this.Z0 = i56 + 1;
                    this.c1 = i56;
                }
                int i57 = this.Z0;
                this.Z0 = i57 + 1;
                this.b1 = i57;
                return;
            }
            ArrayList arrayList2 = this.D;
            if (!arrayList2.isEmpty()) {
                int i58 = this.Z0;
                int i59 = i58 + 1;
                this.Z0 = i59;
                this.P0 = i58;
                this.Q0 = i59;
                int size4 = arrayList2.size() + i59;
                this.Z0 = size4;
                this.R0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.C;
            if (arrayList3.isEmpty()) {
                i10 = r1;
            } else {
                int i60 = this.Z0;
                int i61 = i60 + 1;
                this.Z0 = i61;
                this.S0 = i60;
                this.T0 = i61;
                int size5 = arrayList3.size() + i61;
                this.Z0 = size5;
                this.U0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i62 = this.Z0;
                    this.Z0 = i62 + 1;
                    this.V0 = i62;
                }
                int i63 = this.Z0;
                this.A0 = i63;
                int size6 = arrayList.size() + i63;
                this.Z0 = size6;
                this.B0 = size6;
            }
            int i64 = this.Z0;
            if (i64 != 0) {
                this.Z0 = i64 + 1;
                this.X0 = i64;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.k1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.a1;
        int i11 = this.K;
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
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 22));
        if (i10 != 0 || i11 == 2 || i11 == 0 || i11 == 3) {
            this.e = new ir(this, context);
            org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new bb(this, 2);
            this.f = a2;
            if (i11 == 0 && !this.N) {
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
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.y1 = p00Var;
        p00Var.setViewType(6);
        org.telegram.ui.Components.p00 p00Var2 = this.y1;
        p00Var2.w = false;
        p00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.p00 p00Var3 = this.y1;
        int i12 = org.telegram.ui.ActionBar.g6.G8;
        int i13 = org.telegram.ui.ActionBar.g6.i6;
        p00Var3.f(i12, i13, i13);
        frameLayout3.addView(this.y1, i7.f6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z1 = radialProgressView;
        frameLayout3.addView(radialProgressView, i7.f6.e(-2, -2, 17));
        this.y1.setVisibility(8);
        this.z1.setVisibility(8);
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, frameLayout3, 1, null);
        this.b = qw0Var;
        qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        frameLayout2.addView(this.b, i7.f6.c(-1.0f, -1));
        this.b.addView(frameLayout3, 0);
        jh.e1 e1Var = new jh.e1(this, context, 8);
        this.c = e1Var;
        e1Var.p1();
        jh.e1 e1Var2 = this.c;
        vq vqVar = new vq(this);
        this.d = vqVar;
        e1Var2.setLayoutManager(vqVar);
        wq wqVar = new wq(this);
        wqVar.n(420L);
        wqVar.o(org.telegram.ui.Components.jr.h);
        wqVar.C = false;
        wqVar.m = false;
        this.c.setItemAnimator(wqVar);
        jh.e1 e1Var3 = this.c;
        e1Var3.U1 = true;
        e1Var3.V1 = 0;
        fr frVar = new fr(this, context);
        this.a = frVar;
        e1Var3.setAdapter(frVar);
        this.c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.c, i7.f6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.c);
        this.c.setOnItemClickListener(new gq(this, 3));
        this.c.setOnItemLongClickListener(new gq(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new m3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.n = undoView;
        frameLayout2.addView(undoView, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.c.setEmptyView(this.b);
        jh.e1 e1Var4 = this.c;
        e1Var4.U1 = false;
        e1Var4.V1 = 0;
        if (this.j1) {
            this.f.z(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.J)) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
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
        if (chatFull.id == this.J) {
            if (booleanValue && ChatObject.isChannel(this.r)) {
                return;
            }
            boolean z10 = this.s != null;
            this.s = chatFull;
            if (!z10) {
                int k02 = k0();
                this.m1 = k02;
                this.l1 = k02;
                int i12 = this.s.boosts_unrestrict;
                this.n1 = i12 > 0;
                this.o1 = i12;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
                long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
                boolean z11 = j10 > 0;
                this.u1 = z11;
                this.t1 = z11;
                if (j10 <= 0) {
                    j10 = 10;
                }
                long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.w1 = clamp;
                this.v1 = clamp;
            }
            AndroidUtilities.runOnUIThread(new eq(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r4.s1) != r4.q1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0(boolean z10) {
        if (!this.L) {
            if (ChatObject.getBannedRightsString(this.A).equals(this.y) && this.m1 == this.l1 && !o0() && (r0 = this.r1) == this.p1) {
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.v) {
                    alertDialog$Builder.a.P = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder.a.P = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new gq(this, 1));
                alertDialog$Builder.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new gq(this, 2));
                showDialog(alertDialog$Builder.a);
            }
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.z4.class, org.telegram.ui.Cells.w4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.y9.class, org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        int i10 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i13 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Components.qw0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Components.qw0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
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
        final long j11;
        boolean z12;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z13;
        String str2;
        int i12;
        if (tLObject == null || (i10 = this.a1) != 0) {
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
        int i13 = this.K;
        if (i13 != 2) {
            final long j13 = j10;
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
            org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
            if (i13 == 3 && ChatObject.canBlockUsers(this.r)) {
                jrVar = this;
                H.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new ih.h1(jrVar, j13, tL_chatBannedRights, str, tLObject, 9), false);
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
                                this.b.i0(j13);
                                break;
                            case 1:
                                jr jrVar2 = this.b;
                                long j14 = j13;
                                jrVar2.i0(j14);
                                jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, jrVar2, null);
                                break;
                            case 2:
                                this.b.i0(j13);
                                break;
                            default:
                                jr jrVar3 = this.b;
                                MessagesController messagesController = jrVar3.getMessagesController();
                                long j15 = jrVar3.J;
                                MessagesController messagesController2 = jrVar3.getMessagesController();
                                long j16 = j13;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                jrVar3.v0(j16);
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
                                        this.b.i0(j13);
                                        break;
                                    case 1:
                                        jr jrVar2 = this.b;
                                        long j14 = j13;
                                        jrVar2.i0(j14);
                                        jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, jrVar2, null);
                                        break;
                                    case 2:
                                        this.b.i0(j13);
                                        break;
                                    default:
                                        jr jrVar3 = this.b;
                                        MessagesController messagesController = jrVar3.getMessagesController();
                                        long j15 = jrVar3.J;
                                        MessagesController messagesController2 = jrVar3.getMessagesController();
                                        long j16 = j13;
                                        messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                        jrVar3.v0(j16);
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
                                    this.b.i0(j13);
                                    break;
                                case 1:
                                    jr jrVar2 = this.b;
                                    long j14 = j13;
                                    jrVar2.i0(j14);
                                    jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, jrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j13);
                                    break;
                                default:
                                    jr jrVar3 = this.b;
                                    MessagesController messagesController = jrVar3.getMessagesController();
                                    long j15 = jrVar3.J;
                                    MessagesController messagesController2 = jrVar3.getMessagesController();
                                    long j16 = j13;
                                    messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                    jrVar3.v0(j16);
                                    break;
                            }
                        }
                    }, true);
                } else if (i13 == 1 && ChatObject.canAddAdmins(jrVar.r) && z11) {
                    if (jrVar.r.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                        j11 = j13;
                        H.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new ih.h1(jrVar, j11, tL_chatAdminRights2, str3, tLObject, 10), false);
                    } else {
                        j11 = j13;
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
                                    this.b.i0(j11);
                                    break;
                                case 1:
                                    jr jrVar2 = this.b;
                                    long j14 = j11;
                                    jrVar2.i0(j14);
                                    jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, jrVar2, null);
                                    break;
                                case 2:
                                    this.b.i0(j11);
                                    break;
                                default:
                                    jr jrVar3 = this.b;
                                    MessagesController messagesController = jrVar3.getMessagesController();
                                    long j15 = jrVar3.J;
                                    MessagesController messagesController2 = jrVar3.getMessagesController();
                                    long j16 = j11;
                                    messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                    jrVar3.v0(j16);
                                    break;
                            }
                        }
                    }, true);
                }
            }
            H.W(jrVar.c.V0(view, false));
            H.S = 190;
            boolean z16 = H.x() > 0;
            if (z10 || !z16) {
                return z16;
            }
            H.Z();
            return true;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        boolean z17 = ChatObject.canAddAdmins(this.r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11);
        boolean z18 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
        if ((z18 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) && !z11) {
            z12 = z17;
            j12 = j10;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z13 = false;
        } else {
            z12 = z17;
            j12 = j10;
            tL_chatBannedRights2 = tL_chatBannedRights;
            z13 = true;
        }
        boolean z19 = z18 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
        boolean z20 = ChatObject.canBlockUsers(this.r) && z13 && !z15 && ChatObject.isChannel(this.r) && !this.r.gigagroup;
        if (i10 == 0) {
            z12 = (!UserObject.isDeleted(user)) & z12;
        }
        boolean z21 = z12 || (ChatObject.canBlockUsers(this.r) && z13);
        if (z10 || !z21) {
            return z21;
        }
        boolean z22 = z20;
        nq nqVar = new nq(this, j12, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z13);
        long j14 = j12;
        org.telegram.ui.Components.j70 H2 = org.telegram.ui.Components.j70.H(this, view);
        H2.W(this.c.V0(view, false));
        H2.l(R.drawable.msg_admins, LocaleController.getString(z19 ? R.string.EditAdminRights : R.string.SetAsAdmin), new ui(nqVar, 11), z12);
        H2.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new gg(this, tLObject, user, nqVar, 6), z22);
        boolean z23 = ChatObject.canBlockUsers(this.r) && z13;
        int i18 = R.drawable.msg_remove;
        if (z15) {
            str2 = "ChannelRemoveUser";
            i12 = R.string.ChannelRemoveUser;
        } else {
            str2 = "KickFromGroup";
            i12 = R.string.KickFromGroup;
        }
        H2.m(z23, i18, LocaleController.getString(str2, i12), true, new g5.v(this, user, j14, 18));
        H2.S = 190;
        H2.Z();
        return true;
    }

    public final void i0(long j10) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.J);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new org.telegram.messenger.a(), new b5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.J);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new o(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z10 = this.n1 && q0();
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.o1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        return g0(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
        this.n.setTranslationY(-i13);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        fr frVar = this.a;
        if (frVar != null) {
            frVar.l();
        }
        org.telegram.ui.Components.qw0 qw0Var = this.b;
        if (qw0Var != null) {
            qw0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.x1 = true;
        }
        if (z10 && !z11 && this.j1) {
            this.f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        return i10 == this.R || i10 == this.S || i10 == this.T || i10 == this.U || i10 == this.V || i10 == this.W || i10 == this.g0 || i10 == this.X || i10 == this.Y || i10 == this.Z;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.r;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.l1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.A;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void r0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.M) {
            return;
        }
        int i10 = 0;
        this.F = false;
        this.E = false;
        boolean z10 = this.w;
        int i11 = this.K;
        a0.h hVar = this.H;
        ArrayList arrayList = this.C;
        a0.h hVar2 = this.I;
        ArrayList arrayList2 = this.D;
        a0.h hVar3 = this.G;
        ArrayList arrayList3 = this.B;
        if (z10 && i11 == 2) {
            this.M = false;
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
            this.M = true;
            org.telegram.ui.Components.qw0 qw0Var = this.b;
            if (qw0Var != null) {
                qw0Var.e(true, false);
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
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i14), new jf.i0(arrayList6, i14, atomicInteger, s02, lqVar, 6)), this.classGuid);
            }
            return;
        }
        this.M = false;
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
                int i15 = this.a1;
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
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.J);
        int i10 = this.K;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.a1 == 1) {
                if (this.F) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.g1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.F = true;
                    arrayList.addAll(s0());
                }
            } else if (!this.F) {
                this.g1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.F = true;
                arrayList.addAll(s0());
            } else if (this.E) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.E = true;
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
        dq dqVar = new dq(j10, this.J, tL_chatAdminRights, this.A, tL_chatBannedRights, str, i10, z10, tLObject == null, null);
        dqVar.T0 = new sq(this, tLObject, j10, z11);
        presentFragment(dqVar, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if ((r0 && r13.s1) != r13.q1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0() {
        TLRPC.ChatFull chatFull;
        boolean z10 = false;
        int i10 = this.K;
        if (i10 == 3) {
            TLRPC.Chat chat = this.r;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.l1 != this.m1 || this.u1) && this.s != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.J, this, new gq(this, 0));
                return;
            }
            if (!ChatObject.getBannedRightsString(this.A).equals(this.y)) {
                getMessagesController().setDefaultBannedRole(this.J, this.A, ChatObject.isChannel(this.r), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.J));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.A;
                }
            }
            int i11 = this.l1;
            if (i11 != this.m1 && (chatFull = this.s) != null) {
                chatFull.slowmode_seconds = m0(i11);
                this.s.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.J, this.s.slowmode_seconds);
            }
            boolean z11 = this.u1;
            if (z11 != this.t1 || (z11 && this.v1 != this.w1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.J);
                updatepaidmessagesprice.send_paid_messages_stars = this.u1 ? this.w1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new lh.o5(8));
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.J));
                if (chat3 != null) {
                    if (this.u1) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.w1;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (o0()) {
                boolean z12 = this.n1 && q0();
                if (z12 && this.o1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.J, 1);
                } else if (z12 || this.o1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.J, this.o1);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.J, 0);
                }
            }
        } else if (i10 == 1) {
            boolean z13 = this.r1;
            if (z13 == this.p1) {
            }
            MessagesController messagesController = getMessagesController();
            long j10 = this.J;
            boolean z14 = this.r1;
            if (z14 && this.s1) {
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
                hVar = this.I;
                arrayList = this.D;
            } else if (i10 == 1) {
                hVar = this.H;
                arrayList = this.C;
            } else {
                hVar = this.G;
                arrayList = this.B;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.K == 0 && (chatFull = this.s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(w02);
        }
        f2.p0 adapter = this.c.getAdapter();
        ir irVar = this.e;
        if (adapter == irVar) {
            rf.k1 k1Var = irVar.h;
            Object f9 = k1Var.f.f(j10);
            if (f9 != null) {
                k1Var.e.remove(f9);
            }
            Object f10 = k1Var.h.f(j10);
            if (f10 != null) {
                k1Var.g.remove(f10);
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
        drVar.b = this.Z0;
        drVar.i = this.T0;
        drVar.j = this.U0;
        drVar.l.clear();
        drVar.l.addAll(this.C);
        drVar.h = this.R0;
        drVar.g = this.Q0;
        drVar.m.clear();
        drVar.m.addAll(this.D);
        drVar.e = this.A0;
        drVar.f = this.B0;
        drVar.k.clear();
        drVar.k.addAll(this.B);
        drVar.f(drVar.c);
        return drVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        this.s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.m1 = k02;
            this.l1 = k02;
            int i10 = this.s.boosts_unrestrict;
            this.n1 = i10 > 0;
            this.o1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
            long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z10 = j10 > 0;
            this.u1 = z10;
            this.t1 = z10;
            if (j10 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.w1 = clamp;
            this.v1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (this.isPaused || !this.x1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.N) {
            return;
        }
        View view = null;
        for (int i11 = 0; i11 < this.c.getChildCount(); i11++) {
            View childAt = this.c.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.p00) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i10--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new pq(this, (org.telegram.ui.Components.p00) view, i10, 0));
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new mq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
