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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pr extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int A0;
    public boolean A1;
    public int B0;
    public org.telegram.ui.Components.zz B1;
    public int C0;
    public RadialProgressView C1;
    public TLRPC.TL_chatBannedRights D;
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
    public lr a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.dw0 b;
    public int b0;
    public int b1;
    public ag.b1 c;
    public int c0;
    public int c1;
    public br d;
    public int d0;
    public final int d1;
    public or e;
    public int e0;
    public int e1;
    public org.telegram.ui.ActionBar.p5 f;
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
    public ir l1;
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
    public boolean v0;
    public boolean v1;
    public final boolean w;
    public int w0;
    public boolean w1;
    public final boolean x;
    public int x0;
    public boolean x1;
    public final String y;
    public int y0;
    public long y1;
    public int z0;
    public long z1;

    public pr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.D = new TLRPC.TL_chatBannedRights();
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
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
        this.n = L0;
        boolean z10 = false;
        if (L0 != null && (tL_chatBannedRights = L0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.D;
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
        this.y = org.telegram.messenger.w3.D(this.D);
        boolean Y = org.telegram.messenger.w3.Y(this.n);
        this.w = Y;
        if (org.telegram.messenger.w3.T(this.n) && !this.n.megagroup && !Y) {
            z10 = true;
        }
        this.s = z10;
        this.x = org.telegram.messenger.w3.c0(this.n);
        TLRPC.Chat chat = this.n;
        if (chat != null) {
            boolean z18 = chat.signatures;
            this.u1 = z18;
            this.s1 = z18;
            boolean z19 = chat.signature_profiles;
            this.v1 = z19;
            this.t1 = z19;
        }
    }

    public static /* synthetic */ void Y(pr prVar, long j10) {
        if (j10 != 0) {
            prVar.M = j10;
            prVar.n = org.telegram.messenger.vp.r1(prVar.currentAccount).L0(Long.valueOf(j10));
            prVar.y0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(final pr prVar, View view, int i10) {
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
        int i11;
        boolean w9;
        int i12;
        long j12;
        String str2;
        boolean z13;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i13 = prVar.d1;
        a0.h hVar = prVar.J;
        a0.h hVar2 = prVar.L;
        boolean z14 = prVar.s;
        int i14 = prVar.N;
        final int i15 = 0;
        i15 = 0;
        i15 = 0;
        final int i16 = 1;
        Object[] objArr = prVar.c.getAdapter() == prVar.a;
        if (i10 == prVar.g1) {
            boolean z15 = !prVar.u1;
            prVar.u1 = z15;
            ((org.telegram.ui.Cells.t8) view).setChecked(z15);
            org.telegram.messenger.i0.a4(prVar.c);
            jr A0 = prVar.A0();
            prVar.F0();
            prVar.E0(A0);
            prVar.a.g(prVar.i1);
        } else if (i10 == prVar.h1) {
            boolean z16 = !prVar.v1;
            prVar.v1 = z16;
            ((org.telegram.ui.Cells.t8) view).setChecked(z16);
            org.telegram.messenger.i0.a4(prVar.c);
            jr A02 = prVar.A0();
            prVar.F0();
            prVar.E0(A02);
            prVar.a.g(prVar.i1);
        } else if (i10 == prVar.m0) {
            boolean z17 = !prVar.x1;
            prVar.x1 = z17;
            ((org.telegram.ui.Cells.t8) view).setChecked(z17);
            org.telegram.messenger.i0.a4(prVar.c);
            jr A03 = prVar.A0();
            prVar.F0();
            prVar.E0(A03);
            prVar.a.g(prVar.m0);
        } else if (objArr != false) {
            if (prVar.t0(i10)) {
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (i10 == prVar.U) {
                    prVar.D.send_photos = !r15.send_photos;
                } else if (i10 == prVar.V) {
                    prVar.D.send_videos = !r14.send_videos;
                } else if (i10 == prVar.W) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = prVar.D;
                    boolean z18 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z18;
                    tL_chatBannedRights2.send_gifs = z18;
                    tL_chatBannedRights2.send_games = z18;
                    tL_chatBannedRights2.send_stickers = z18;
                } else if (i10 == prVar.X) {
                    prVar.D.send_audios = !r14.send_audios;
                } else if (i10 == prVar.Y) {
                    prVar.D.send_docs = !r14.send_docs;
                } else if (i10 == prVar.Z) {
                    prVar.D.send_voices = !r14.send_voices;
                } else if (i10 == prVar.a0) {
                    prVar.D.send_roundvideos = !r14.send_roundvideos;
                } else if (i10 == prVar.b0) {
                    if (prVar.D.send_plain && (m10 = prVar.d.m(prVar.S)) != null) {
                        org.telegram.messenger.i0.G3(m10);
                        org.telegram.messenger.t2.D.a();
                        return;
                    } else {
                        prVar.D.embed_links = !r14.embed_links;
                    }
                } else if (i10 == prVar.c0) {
                    prVar.D.send_polls = !r14.send_polls;
                } else if (i10 == prVar.j0) {
                    prVar.D.send_reactions = !r14.send_reactions;
                }
                c2Var.c(!c2Var.b(), true);
                org.telegram.messenger.i0.a4(prVar.c);
                jr A04 = prVar.A0();
                prVar.F0();
                prVar.E0(A04);
            } else if (i10 == prVar.P0) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                boolean z19 = !s8Var.d.h;
                prVar.q1 = z19;
                s8Var.setChecked(z19);
                org.telegram.messenger.i0.a4(prVar.c);
                jr A05 = prVar.A0();
                prVar.F0();
                prVar.E0(A05);
            } else {
                if (i10 == prVar.y0) {
                    if (i14 == 0 || i14 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", prVar.M);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i14 == 0 ? 2 : 3);
                        pr prVar2 = new pr(bundle);
                        prVar2.B0(prVar.r);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = prVar.D;
                        if (tL_chatBannedRights3 != null) {
                            prVar2.D = tL_chatBannedRights3;
                        }
                        prVar2.l1 = new dr(prVar);
                        prVar.presentFragment(prVar2);
                        return;
                    }
                    if (i14 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", prVar.M);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        pr prVar3 = new pr(bundle2);
                        prVar3.l1 = new er(prVar);
                        prVar3.B0(prVar.r);
                        prVar.presentFragment(prVar3);
                        return;
                    }
                    if (i14 == 2) {
                        Bundle g10 = a1.g.g("addToGroup", true);
                        g10.putLong(z14 ? "channelId" : "chatId", prVar.n.id);
                        v50 v50Var = new v50(g10);
                        v50Var.I = prVar.r;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        v50Var.J = hVar;
                        v50Var.y = new gr(prVar, v50Var);
                        prVar.presentFragment(v50Var);
                        return;
                    }
                    return;
                }
                if (i10 == prVar.u0) {
                    prVar.presentFragment(new sb(prVar.n));
                    return;
                }
                if (i10 == prVar.w0) {
                    final org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    TLRPC.ChatFull chatFull3 = prVar.r;
                    if (chatFull3 != null && !chatFull3.antispam && prVar.p0() < prVar.getMessagesController().g5) {
                        org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(prVar.getMessagesController().g5, "ChannelAntiSpamForbidden", new Object[0]), org.telegram.ui.Components.cc.a0(prVar), R.raw.msg_antispam, 36);
                        return;
                    }
                    if (prVar.r == null || !org.telegram.messenger.w3.y(13, prVar.n) || prVar.v0) {
                        return;
                    }
                    prVar.v0 = true;
                    final boolean z20 = prVar.r.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = prVar.getMessagesController().g1(prVar.M);
                    TLRPC.ChatFull chatFull4 = prVar.r;
                    boolean z21 = !chatFull4.antispam;
                    chatFull4.antispam = z21;
                    tL_channels_toggleAntiSpam.enabled = z21;
                    p8Var.setChecked(z21);
                    p8Var.getCheckBox().setIcon((org.telegram.messenger.w3.y(13, prVar.n) && ((chatFull2 = prVar.r) == null || chatFull2.antispam || prVar.p0() >= prVar.getMessagesController().g5)) ? 0 : R.drawable.permission_locked);
                    prVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(prVar) { // from class: org.telegram.ui.mq
                        public final /* synthetic */ pr b;

                        {
                            this.b = prVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i15) {
                                case 0:
                                    final pr prVar4 = this.b;
                                    if (tLObject3 != null) {
                                        prVar4.getMessagesController().L3((TLRPC.Updates) tLObject3, false);
                                        prVar4.getMessagesController().O3(prVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.p8 p8Var2 = p8Var;
                                        final boolean z22 = z20;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i18 = i17;
                                                int i19 = R.drawable.permission_locked;
                                                boolean z23 = z22;
                                                org.telegram.ui.Cells.p8 p8Var3 = p8Var2;
                                                pr prVar5 = prVar4;
                                                switch (i18) {
                                                    case 0:
                                                        if (prVar5.getParentActivity() != null) {
                                                            prVar5.r.antispam = z23;
                                                            p8Var3.setChecked(z23);
                                                            Switch checkBox = p8Var3.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(13, prVar5.n) && ((chatFull5 = prVar5.r) == null || !chatFull5.antispam || prVar5.p0() >= prVar5.getMessagesController().g5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (prVar5.getParentActivity() != null) {
                                                            prVar5.r.participants_hidden = z23;
                                                            p8Var3.setChecked(z23);
                                                            Switch checkBox2 = p8Var3.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(2, prVar5.n) && ((chatFull6 = prVar5.r) == null || !chatFull6.participants_hidden || prVar5.p0() >= prVar5.getMessagesController().h5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox2.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    prVar4.v0 = false;
                                    break;
                                default:
                                    final pr prVar5 = this.b;
                                    if (tLObject3 != null) {
                                        prVar5.getMessagesController().L3((TLRPC.Updates) tLObject3, false);
                                        prVar5.getMessagesController().O3(prVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.p8 p8Var3 = p8Var;
                                        final boolean z23 = z20;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i182 = i18;
                                                int i19 = R.drawable.permission_locked;
                                                boolean z232 = z23;
                                                org.telegram.ui.Cells.p8 p8Var32 = p8Var3;
                                                pr prVar52 = prVar5;
                                                switch (i182) {
                                                    case 0:
                                                        if (prVar52.getParentActivity() != null) {
                                                            prVar52.r.antispam = z232;
                                                            p8Var32.setChecked(z232);
                                                            Switch checkBox = p8Var32.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(13, prVar52.n) && ((chatFull5 = prVar52.r) == null || !chatFull5.antispam || prVar52.p0() >= prVar52.getMessagesController().g5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (prVar52.getParentActivity() != null) {
                                                            prVar52.r.participants_hidden = z232;
                                                            p8Var32.setChecked(z232);
                                                            Switch checkBox2 = p8Var32.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(2, prVar52.n) && ((chatFull6 = prVar52.r) == null || !chatFull6.participants_hidden || prVar52.p0() >= prVar52.getMessagesController().h5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox2.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    prVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 == prVar.I0) {
                    final org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                    if (prVar.p0() < prVar.getMessagesController().h5) {
                        org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(prVar.getMessagesController().h5, "ChannelHiddenMembersForbidden", new Object[0]), org.telegram.ui.Components.cc.a0(prVar), R.raw.contacts_sync_off, 36);
                        return;
                    }
                    if (prVar.r == null || !org.telegram.messenger.w3.y(2, prVar.n) || prVar.H0) {
                        return;
                    }
                    prVar.H0 = true;
                    final boolean z22 = prVar.r.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = prVar.getMessagesController().g1(prVar.M);
                    TLRPC.ChatFull chatFull5 = prVar.r;
                    boolean z23 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z23;
                    tL_channels_toggleParticipantsHidden.enabled = z23;
                    p8Var2.setChecked(z23);
                    Switch checkBox = p8Var2.getCheckBox();
                    if (!org.telegram.messenger.w3.y(2, prVar.n) || ((chatFull = prVar.r) != null && !chatFull.participants_hidden && prVar.p0() < prVar.getMessagesController().h5)) {
                        i15 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i15);
                    prVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(prVar) { // from class: org.telegram.ui.mq
                        public final /* synthetic */ pr b;

                        {
                            this.b = prVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    final pr prVar4 = this.b;
                                    if (tLObject3 != null) {
                                        prVar4.getMessagesController().L3((TLRPC.Updates) tLObject3, false);
                                        prVar4.getMessagesController().O3(prVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i17 = 0;
                                        final org.telegram.ui.Cells.p8 p8Var22 = p8Var2;
                                        final boolean z222 = z22;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i182 = i17;
                                                int i19 = R.drawable.permission_locked;
                                                boolean z232 = z222;
                                                org.telegram.ui.Cells.p8 p8Var32 = p8Var22;
                                                pr prVar52 = prVar4;
                                                switch (i182) {
                                                    case 0:
                                                        if (prVar52.getParentActivity() != null) {
                                                            prVar52.r.antispam = z232;
                                                            p8Var32.setChecked(z232);
                                                            Switch checkBox2 = p8Var32.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(13, prVar52.n) && ((chatFull52 = prVar52.r) == null || !chatFull52.antispam || prVar52.p0() >= prVar52.getMessagesController().g5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox2.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (prVar52.getParentActivity() != null) {
                                                            prVar52.r.participants_hidden = z232;
                                                            p8Var32.setChecked(z232);
                                                            Switch checkBox22 = p8Var32.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(2, prVar52.n) && ((chatFull6 = prVar52.r) == null || !chatFull6.participants_hidden || prVar52.p0() >= prVar52.getMessagesController().h5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox22.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    prVar4.v0 = false;
                                    break;
                                default:
                                    final pr prVar5 = this.b;
                                    if (tLObject3 != null) {
                                        prVar5.getMessagesController().L3((TLRPC.Updates) tLObject3, false);
                                        prVar5.getMessagesController().O3(prVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i18 = 1;
                                        final org.telegram.ui.Cells.p8 p8Var3 = p8Var2;
                                        final boolean z232 = z22;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i182 = i18;
                                                int i19 = R.drawable.permission_locked;
                                                boolean z2322 = z232;
                                                org.telegram.ui.Cells.p8 p8Var32 = p8Var3;
                                                pr prVar52 = prVar5;
                                                switch (i182) {
                                                    case 0:
                                                        if (prVar52.getParentActivity() != null) {
                                                            prVar52.r.antispam = z2322;
                                                            p8Var32.setChecked(z2322);
                                                            Switch checkBox2 = p8Var32.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(13, prVar52.n) && ((chatFull52 = prVar52.r) == null || !chatFull52.antispam || prVar52.p0() >= prVar52.getMessagesController().g5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox2.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (prVar52.getParentActivity() != null) {
                                                            prVar52.r.participants_hidden = z2322;
                                                            p8Var32.setChecked(z2322);
                                                            Switch checkBox22 = p8Var32.getCheckBox();
                                                            if (org.telegram.messenger.w3.y(2, prVar52.n) && ((chatFull6 = prVar52.r) == null || !chatFull6.participants_hidden || prVar52.p0() >= prVar52.getMessagesController().h5)) {
                                                                i19 = 0;
                                                            }
                                                            checkBox22.setIcon(i19);
                                                            org.telegram.messenger.m5.n("UnknownError", 2131743904, org.telegram.ui.Components.cc.a0(prVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    prVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i10 != prVar.K0) {
                    z10 = true;
                    if (i10 == prVar.A0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", prVar.M);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        pr prVar4 = new pr(bundle3);
                        prVar4.B0(prVar.r);
                        prVar.presentFragment(prVar4);
                        return;
                    }
                    if (i10 == prVar.s0) {
                        prVar.showDialog(new hr(prVar, prVar.getParentActivity(), prVar));
                    } else {
                        if (i10 == prVar.z0) {
                            if (prVar.r != null) {
                                kg0 kg0Var = new kg0(prVar.M, 0, 0L);
                                TLRPC.ChatFull chatFull6 = prVar.r;
                                kg0Var.l0(chatFull6, chatFull6.exported_invite);
                                prVar.presentFragment(kg0Var);
                                return;
                            }
                            return;
                        }
                        if ((i10 > prVar.R && i10 <= Math.max(prVar.k0, prVar.f0)) || i10 == prVar.l0) {
                            org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                            boolean isEnabled = s8Var2.isEnabled();
                            Switch r42 = s8Var2.d;
                            if (isEnabled) {
                                if (r42.F != null) {
                                    if (org.telegram.messenger.w3.t0(prVar.n) && (i10 == prVar.h0 || i10 == prVar.f0)) {
                                        org.telegram.messenger.m5.o(null, 2131751286, org.telegram.ui.Components.cc.a0(prVar), null);
                                        return;
                                    } else if (org.telegram.messenger.w3.Z(prVar.currentAccount, prVar.M) && (i10 == prVar.h0 || i10 == prVar.f0)) {
                                        org.telegram.messenger.m5.o(null, 2131751287, org.telegram.ui.Components.cc.a0(prVar), null);
                                        return;
                                    } else {
                                        org.telegram.messenger.m5.o("EditCantEditPermissions", 2131751288, org.telegram.ui.Components.cc.a0(prVar), null);
                                        return;
                                    }
                                }
                                if (i10 == prVar.T) {
                                    jr A06 = prVar.A0();
                                    prVar.k1 = !prVar.k1;
                                    org.telegram.messenger.i0.a4(prVar.c);
                                    prVar.E0(A06);
                                    return;
                                }
                                s8Var2.setChecked(!r42.h);
                                if (i10 == prVar.f0) {
                                    prVar.D.change_info = !r0.change_info;
                                    return;
                                }
                                if (i10 == prVar.l0) {
                                    prVar.D.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i10 == prVar.g0) {
                                    prVar.D.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i10 == prVar.k0) {
                                    prVar.D.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i10 == prVar.h0) {
                                    prVar.D.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i10 == prVar.i0) {
                                    prVar.D.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i10 == prVar.S) {
                                    prVar.D.send_plain = !r1.send_plain;
                                    int i17 = prVar.b0;
                                    if (i17 >= 0) {
                                        prVar.a.g(i17);
                                    }
                                    int i18 = prVar.T;
                                    if (i18 >= 0) {
                                        prVar.a.g(i18);
                                    }
                                    jr A07 = prVar.A0();
                                    prVar.F0();
                                    prVar.E0(A07);
                                    return;
                                }
                                if (i10 == prVar.T) {
                                    jr A08 = prVar.A0();
                                    prVar.k1 = !prVar.k1;
                                    org.telegram.messenger.i0.a4(prVar.c);
                                    prVar.E0(A08);
                                    return;
                                }
                                if (i10 == prVar.d0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = prVar.D;
                                    boolean z24 = !tL_chatBannedRights4.send_stickers;
                                    tL_chatBannedRights4.send_inline = z24;
                                    tL_chatBannedRights4.send_gifs = z24;
                                    tL_chatBannedRights4.send_games = z24;
                                    tL_chatBannedRights4.send_stickers = z24;
                                    return;
                                }
                                if (i10 == prVar.e0) {
                                    prVar.D.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i10 == prVar.c0) {
                                        prVar.D.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                } else {
                    if (prVar.n == null) {
                        return;
                    }
                    org.telegram.ui.Cells.p8 p8Var3 = (org.telegram.ui.Cells.p8) view;
                    boolean d = p8Var3.d();
                    p8Var3.setChecked(!p8Var3.d());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = org.telegram.messenger.vp.k1(prVar.n);
                    TLRPC.Chat chat = prVar.n;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = prVar.n.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights5;
                    tL_chatBannedRights5.edit_rank = !p8Var3.d();
                    z10 = true;
                    prVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new a3.b(i16), new nq(prVar, p8Var3, d, i15));
                }
                if (objArr == true) {
                    TLObject E = prVar.e.E(i10);
                    if (E instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) E;
                        prVar.getMessagesController().U3(user, false, false);
                        long j13 = user.id;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 3) {
                                tLObject2 = null;
                                break;
                            }
                            tLObject2 = (TLObject) (i19 == 0 ? hVar2 : i19 == 1 ? prVar.K : hVar).f(j13);
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
                        j11 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                        boolean z25 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                        z11 = z14;
                        tL_chatBannedRights = tL_chatBannedRights6;
                        str = channelParticipant.rank;
                        tLObject = E;
                        z12 = z25;
                        tL_chatAdminRights = tL_chatAdminRights3;
                    } else if (E instanceof TLRPC.ChatParticipant) {
                        long j14 = ((TLRPC.ChatParticipant) E).user_id;
                        z11 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        tLObject = E;
                        z12 = prVar.n.creator;
                        tL_chatAdminRights = null;
                        j11 = j14;
                    } else {
                        z11 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = j10;
                        tL_chatAdminRights = null;
                        tLObject = E;
                        z12 = E == null;
                    }
                } else {
                    TLObject E2 = prVar.a.E(i10);
                    if (E2 instanceof TLRPC.User) {
                        z11 = z14;
                        str = "";
                        tL_chatBannedRights = null;
                        j11 = ((TLRPC.User) E2).id;
                        tL_chatAdminRights = null;
                        tLObject = E2;
                        z12 = z10;
                    } else if (E2 instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E2;
                        j11 = org.telegram.messenger.jj.C1(channelParticipant2.peer);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                        String str3 = channelParticipant2.rank;
                        boolean z26 = (((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) && !channelParticipant2.can_edit) ? false : z10;
                        if ((E2 instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights4 = ((TLRPC.TL_channelParticipantCreator) E2).admin_rights) == null) {
                            tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                            boolean z27 = z10;
                            tL_chatAdminRights4.manage_ranks = z27;
                            tL_chatAdminRights4.add_admins = z27;
                            tL_chatAdminRights4.pin_messages = z27;
                            tL_chatAdminRights4.manage_topics = z27;
                            tL_chatAdminRights4.invite_users = z27;
                            tL_chatAdminRights4.ban_users = z27;
                            tL_chatAdminRights4.delete_messages = z27;
                            tL_chatAdminRights4.edit_messages = z27;
                            tL_chatAdminRights4.post_messages = z27;
                            tL_chatAdminRights4.change_info = z27;
                            if (!z14) {
                                tL_chatAdminRights4.manage_call = z27;
                            }
                        }
                        boolean z28 = z26;
                        tLObject = E2;
                        z12 = z28;
                        tL_chatBannedRights = tL_chatBannedRights7;
                        tL_chatAdminRights = tL_chatAdminRights4;
                        z11 = z14;
                        str = str3;
                    } else {
                        if (E2 instanceof TLRPC.ChatParticipant) {
                            long j15 = ((TLRPC.ChatParticipant) E2).user_id;
                            boolean z29 = prVar.n.creator;
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
                            z12 = z29;
                            tL_chatAdminRights = tL_chatAdminRights2;
                            j11 = j15;
                            z11 = z14;
                        } else {
                            tLObject = E2;
                            z11 = z14;
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
                if (i13 != 0) {
                    int i20 = 1;
                    if (i13 != 3 && i13 != 1) {
                        if (org.telegram.messenger.w3.T(prVar.n)) {
                            prVar.getMessagesController().f0(prVar.M, prVar.getMessagesController().Z1(Long.valueOf(j11)));
                            ir irVar = prVar.l1;
                            if (irVar != null) {
                                irVar.d(j11);
                            }
                            prVar.finishFragment();
                            return;
                        }
                        return;
                    }
                    if (i13 == 1) {
                        j12 = j11;
                        str2 = str;
                    } else {
                        if (!z12) {
                            j12 = j11;
                            str2 = str;
                            z13 = z12;
                            i20 = 1;
                            prVar.x0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z13, i13 != i20 ? 0 : i20, (i13 != i20 || i13 == 3) ? i20 : 0);
                            return;
                        }
                        if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                            TLRPC.User Z1 = prVar.getMessagesController().Z1(Long.valueOf(j11));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(prVar.getParentActivity());
                            String L0 = org.telegram.messenger.cd.L0(R.string.AppName, "AppName");
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = org.telegram.messenger.cd.a0("AdminWillBeRemoved", null, 2131754350, org.telegram.messenger.h20.p(Z1));
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), new oq(prVar, Z1, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z12));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                            prVar.showDialog(x1Var);
                            return;
                        }
                        j12 = j11;
                        str2 = str;
                        i20 = 1;
                    }
                    z13 = z12;
                    prVar.x0(j12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str2, z13, i13 != i20 ? 0 : i20, (i13 != i20 || i13 == 3) ? i20 : 0);
                    return;
                }
                long j16 = j11;
                boolean z30 = z12;
                if (i14 == 1) {
                    w9 = j16 != prVar.getUserConfig().e() && (prVar.n.creator || z30);
                } else {
                    if (i14 == 0 || i14 == 3) {
                        i11 = 2;
                        w9 = org.telegram.messenger.w3.w(2, prVar.n);
                        if (i14 != 0 || ((i14 != 1 && z11) || (i14 == i11 && i13 == 0))) {
                            if (j16 != prVar.getUserConfig().e()) {
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            if (j11 > 0) {
                                bundle4.putLong("user_id", j16);
                            } else {
                                bundle4.putLong("chat_id", -j16);
                            }
                            prVar.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        if (tL_chatBannedRights == null) {
                            tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                            i12 = 1;
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
                            i12 = 1;
                        }
                        iq iqVar = new iq(j16, prVar.M, tL_chatAdminRights, prVar.D, tL_chatBannedRights, str, i14 == i12 ? 0 : i12, w9, tLObject == null ? i12 : 0, null);
                        iqVar.X0 = new tq(prVar, tLObject);
                        prVar.presentFragment(iqVar);
                        return;
                    }
                    w9 = false;
                }
                i11 = 2;
                if (i14 != 0) {
                }
                if (j16 != prVar.getUserConfig().e()) {
                }
            }
        }
        z10 = true;
        if (objArr == true) {
        }
        if (j11 != 0) {
        }
    }

    public static void a0(pr prVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = 0;
        while (i10 < 3) {
            TLObject tLObject = (TLObject) (i10 == 0 ? prVar.L : i10 == 1 ? prVar.K : prVar.J).f(org.telegram.messenger.jj.C1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i10++;
        }
    }

    public static void g0(pr prVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = prVar.J;
        ArrayList arrayList2 = prVar.E;
        UndoView undoView = prVar.h;
        long j10 = -prVar.M;
        boolean z12 = prVar.s;
        undoView.m(j10, user, z12 ? 9 : 10);
        boolean z13 = false;
        prVar.n.creator = false;
        int i10 = 0;
        boolean z14 = false;
        while (i10 < 3) {
            boolean z15 = true;
            if (i10 == 0) {
                hVar = prVar.L;
                arrayList = prVar.G;
            } else if (i10 == 1) {
                hVar = prVar.K;
                arrayList = prVar.F;
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
            long e = prVar.getUserConfig().e();
            TLObject tLObject2 = (TLObject) hVar.f(e);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e;
                tL_channelParticipantAdmin.promoted_by = e;
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
                hVar.k(tL_channelParticipantAdmin, e);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new f6(7));
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
            Collections.sort(arrayList2, new f6(6));
            prVar.F0();
        }
        prVar.a.f();
        ir irVar = prVar.l1;
        if (irVar != null) {
            irVar.a(user);
        }
    }

    public static int n0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int q0(int i10) {
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
            return org.telegram.messenger.zs.X4;
        }
        if (i10 == 6) {
            return 900;
        }
        return i10 == 7 ? 3600 : 0;
    }

    public static int r0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
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

    public final jr A0() {
        jr jrVar = new jr(this);
        jrVar.b = this.c1;
        jrVar.i = this.W0;
        jrVar.j = this.X0;
        jrVar.l.clear();
        jrVar.l.addAll(this.F);
        jrVar.h = this.U0;
        jrVar.g = this.T0;
        jrVar.m.clear();
        jrVar.m.addAll(this.G);
        jrVar.e = this.D0;
        jrVar.f = this.E0;
        jrVar.k.clear();
        jrVar.k.addAll(this.E);
        jrVar.f(jrVar.c);
        return jrVar;
    }

    public final void B0(TLRPC.ChatFull chatFull) {
        this.r = chatFull;
        if (chatFull != null) {
            int o02 = o0();
            this.p1 = o02;
            this.o1 = o02;
            int i10 = this.r.boosts_unrestrict;
            this.q1 = i10 > 0;
            this.r1 = i10;
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
            long j10 = L0 == null ? 0L : L0.send_paid_messages_stars;
            boolean z10 = j10 > 0;
            this.x1 = z10;
            this.w1 = z10;
            if (j10 <= 0) {
                j10 = 10;
            }
            long k10 = Utilities.k(j10, getMessagesController().J6, 1L);
            this.z1 = k10;
            this.y1 = k10;
        }
    }

    public final void C0(int i10) {
        if (this.isPaused || !this.A1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.Q) {
            return;
        }
        View view = null;
        for (int i11 = 0; i11 < this.c.getChildCount(); i11++) {
            View childAt = this.c.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.zz) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i10--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new uq(this, (org.telegram.ui.Components.zz) view, i10, 0));
    }

    public final void D0(ArrayList arrayList) {
        Collections.sort(arrayList, new rq(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void E0(jr jrVar) {
        View view;
        if (this.a == null) {
            F0();
            return;
        }
        F0();
        jrVar.f(jrVar.d);
        s4.n.c(jrVar, true).c(this.a);
        ag.b1 b1Var = this.c;
        if (b1Var == null || this.d == null || b1Var.getChildCount() <= 0) {
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
    
        if (org.telegram.messenger.w3.w(2, r1) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0() {
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
        this.n = L0;
        if (L0 == null) {
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
        boolean z14 = this.w;
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
            } else if (this.x) {
                this.c1 = i16 + 2;
                this.k0 = i17;
            }
            if (org.telegram.messenger.w3.T(this.n)) {
                TLRPC.Chat chat2 = this.n;
                if (chat2.creator && chat2.megagroup && !chat2.gigagroup && !z14) {
                    int i18 = chat2.participants_count;
                    TLRPC.ChatFull chatFull4 = this.r;
                    if (Math.max(i18, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().X2 - 1000) {
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
            if (chatFull5 != null && chatFull5.paid_messages_available && !z14 && org.telegram.messenger.w3.w(2, this.n) && (org.telegram.messenger.w3.T(this.n) || ((chat = this.n) != null && chat.creator))) {
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
                if (org.telegram.messenger.w3.T(this.n) || !this.n.creator) {
                    TLRPC.Chat chat3 = this.n;
                    if (chat3.megagroup) {
                        if (!chat3.gigagroup) {
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
            if (u0() && !z14) {
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
            if (org.telegram.messenger.w3.T(this.n) && !z14) {
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
            if (org.telegram.messenger.w3.w(2, this.n) && !z14 && p0() > 1 && (org.telegram.messenger.w3.T(this.n) || this.n.creator)) {
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
            if (org.telegram.messenger.w3.w(2, this.n)) {
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
            if (!z15 && org.telegram.messenger.w3.T(this.n)) {
                TLRPC.Chat chat4 = this.n;
                if (chat4.megagroup && !chat4.gigagroup && ((chatFull = this.r) == null || chatFull.participants_count <= 200 || (!this.s && chatFull.can_set_stickers))) {
                    if (org.telegram.messenger.w3.N(chat4)) {
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
            if (org.telegram.messenger.w3.w(4, this.n)) {
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
            if (z15 || !org.telegram.messenger.w3.V(this.n) || !org.telegram.messenger.w3.N(this.n) || z14) {
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
            if (org.telegram.messenger.w3.T(this.n) && !org.telegram.messenger.w3.V(this.n) && !this.m1) {
                int i52 = this.c1;
                this.I0 = i52;
                this.c1 = i52 + 2;
                this.J0 = i52 + 1;
            }
            int i53 = this.d1;
            if (i53 == 0 && org.telegram.messenger.w3.w(3, this.n)) {
                int i54 = this.c1;
                this.c1 = i54 + 1;
                this.y0 = i54;
            }
            if (i53 == 0 && org.telegram.messenger.w3.y(3, this.n)) {
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

    public final void G0() {
        try {
            if (this.c == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
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
                    if (childAt instanceof org.telegram.ui.Cells.e5) {
                        ((org.telegram.ui.Cells.e5) childAt).updateColors();
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i10 = 0;
        this.n1 = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.d1;
        int i12 = this.N;
        int i13 = 3;
        if (i12 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752333, "ChannelPermissions"));
        } else if (i12 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752453, "ChannelBlacklist"));
        } else if (i12 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752517, null));
        } else if (i12 == 2) {
            if (i11 == 0) {
                if (this.s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752289, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752377, "ChannelMembers"));
                }
            } else if (i11 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752528, "ChannelAddAdmin"));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752452, "ChannelBlockUser"));
            } else if (i11 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752527, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, i10));
        int i14 = 8;
        if (i11 != 0 || i12 == 2 || i12 == 0 || i12 == 3) {
            this.e = new or(this, context);
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.B0 = new ag.l3(this, i13);
            this.f = b10;
            if (i12 == 0 && !this.Q) {
                b10.setVisibility(8);
            }
            if (i12 == 3) {
                this.f.setSearchFieldHint(org.telegram.messenger.cd.L0(2131752307, "ChannelSearchException"));
            } else {
                this.f.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, "Search"));
            }
            if (!org.telegram.messenger.w3.T(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i12 == 3) {
                this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
            }
        } else if (i12 == 1 && org.telegram.messenger.w3.V(this.n) && org.telegram.messenger.w3.N(this.n)) {
            this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.B1 = zzVar;
        zzVar.setViewType(6);
        org.telegram.ui.Components.zz zzVar2 = this.B1;
        zzVar2.x = false;
        zzVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.zz zzVar3 = this.B1;
        int i15 = org.telegram.ui.ActionBar.t6.G8;
        int i16 = org.telegram.ui.ActionBar.t6.i6;
        zzVar3.e(i15, i16, i16);
        frameLayout2.addView(this.B1, w7.b6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        frameLayout2.addView(radialProgressView, w7.b6.e(-2, -2, 17));
        this.B1.setVisibility(8);
        this.C1.setVisibility(8);
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, frameLayout2, 1, null);
        this.b = dw0Var;
        dw0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.b.e.setText(org.telegram.messenger.cd.L0(2131745824, null));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        ag.b1 b1Var = new ag.b1(this, context, 7);
        this.c = b1Var;
        b1Var.r1();
        this.c.setSectionsDrawBackground(true);
        ag.b1 b1Var2 = this.c;
        br brVar = new br(this, i10);
        this.d = brVar;
        b1Var2.setLayoutManager(brVar);
        cr crVar = new cr(this);
        crVar.n(420L);
        crVar.o(org.telegram.ui.Components.gr.h);
        crVar.C = false;
        crVar.m = false;
        this.c.setItemAnimator(crVar);
        ag.b1 b1Var3 = this.c;
        b1Var3.W1 = true;
        b1Var3.X1 = 0;
        lr lrVar = new lr(this, context);
        this.a = lrVar;
        b1Var3.setAdapter(lrVar);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        frameLayout.addView(this.c, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        this.c.setOnItemClickListener(new lq(this, i13));
        this.c.setOnItemLongClickListener(new lq(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new h3(this, i14));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        F0();
        this.c.setEmptyView(this.b);
        ag.b1 b1Var4 = this.c;
        b1Var4.W1 = false;
        b1Var4.X1 = 0;
        if (this.m1) {
            this.f.F(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.T) {
            if (i10 == org.telegram.messenger.zs.y1 && ((Long) objArr[0]).longValue() == (-this.M)) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var == null || z4Var.getLastFragment() != this) {
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
            if (booleanValue && org.telegram.messenger.w3.T(this.n)) {
                return;
            }
            boolean z10 = this.r != null;
            this.r = chatFull;
            if (!z10) {
                int o02 = o0();
                this.p1 = o02;
                this.o1 = o02;
                int i12 = this.r.boosts_unrestrict;
                this.q1 = i12 > 0;
                this.r1 = i12;
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
                long j10 = L0 == null ? 0L : L0.send_paid_messages_stars;
                boolean z11 = j10 > 0;
                this.x1 = z11;
                this.w1 = z11;
                if (j10 <= 0) {
                    j10 = 10;
                }
                long k10 = Utilities.k(j10, getMessagesController().J6, 1L);
                this.z1 = k10;
                this.y1 = k10;
            }
            org.telegram.messenger.i0.g3(new jq(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.e5.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Components.yu0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V6));
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r5.v1) != r5.t1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(boolean z10) {
        int i10 = 1;
        if (!this.O) {
            if (org.telegram.messenger.w3.D(this.D).equals(this.y) && this.p1 == this.o1 && !s0() && (r0 = this.u1) == this.s1) {
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131743752, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                if (this.s) {
                    x1Var.T = org.telegram.messenger.cd.L0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    x1Var.T = org.telegram.messenger.cd.L0(2131749410, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, "ApplyTheme"), new lq(this, i10));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, "PassportDiscard"), new lq(this, 2));
                showDialog(x1Var);
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l0(TLObject tLObject, boolean z10, View view) {
        int i10;
        long j10;
        String str;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        final long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j12;
        String str2;
        int i12;
        final pr prVar;
        final int i13;
        String str3;
        int i14;
        boolean z12;
        boolean z13;
        String str4;
        int i15;
        String str5;
        int i16;
        if (tLObject != null && (i10 = this.d1) == 0) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                j12 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                z11 = channelParticipant.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
                tL_chatAdminRights = channelParticipant.admin_rights;
                i11 = channelParticipant.date;
                str2 = channelParticipant.rank;
                j10 = 0;
                tL_chatBannedRights = tL_chatBannedRights2;
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j12 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                z11 = org.telegram.messenger.w3.w(4, this.n);
                str2 = "";
                j10 = 0;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                z11 = false;
                tL_chatAdminRights = null;
                i11 = 0;
                j11 = 0;
                tL_chatBannedRights = null;
                if (j11 != j10 && j11 != getUserConfig().e()) {
                    boolean z14 = this.s;
                    i12 = this.N;
                    if (i12 == 2) {
                        String str6 = str;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                        final int i17 = 1;
                        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
                        if (i12 == 3 && org.telegram.messenger.w3.w(2, this.n)) {
                            String L0 = org.telegram.messenger.cd.L0(2131752414, null);
                            prVar = this;
                            org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(prVar, j11, (TLObject) tL_chatBannedRights, str6, tLObject, 1);
                            final int i18 = 0;
                            H.c(R.drawable.msg_permissions, L0, gVar, false);
                            H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131752420, "ChannelDeleteFromList"), new Runnable(prVar) { // from class: org.telegram.ui.kq
                                public final /* synthetic */ pr b;

                                {
                                    this.b = prVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            this.b.m0(j11);
                                            break;
                                        case 1:
                                            pr prVar2 = this.b;
                                            long j13 = j11;
                                            prVar2.m0(j13);
                                            prVar2.getMessagesController().n(prVar2.M, prVar2.getMessagesController().Z1(Long.valueOf(j13)), null, prVar2, null);
                                            break;
                                        case 2:
                                            this.b.m0(j11);
                                            break;
                                        default:
                                            pr prVar3 = this.b;
                                            org.telegram.messenger.vp messagesController = prVar3.getMessagesController();
                                            long j14 = prVar3.M;
                                            org.telegram.messenger.vp messagesController2 = prVar3.getMessagesController();
                                            long j15 = j11;
                                            messagesController.M4(j14, messagesController2.Z1(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !prVar3.s, prVar3, false, false, null, null, null);
                                            prVar3.z0(j15);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            prVar = this;
                            if (i12 == 0 && org.telegram.messenger.w3.w(2, prVar.n)) {
                                if (org.telegram.messenger.w3.w(3, prVar.n) && j11 > j10 && !org.telegram.messenger.w3.Y(prVar.n)) {
                                    if (z14) {
                                        i14 = 2131752524;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i14 = 2131752523;
                                    }
                                    H.c(R.drawable.msg_contact_add, org.telegram.messenger.cd.L0(i14, str3), new Runnable(prVar) { // from class: org.telegram.ui.kq
                                        public final /* synthetic */ pr b;

                                        {
                                            this.b = prVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i17) {
                                                case 0:
                                                    this.b.m0(j11);
                                                    break;
                                                case 1:
                                                    pr prVar2 = this.b;
                                                    long j13 = j11;
                                                    prVar2.m0(j13);
                                                    prVar2.getMessagesController().n(prVar2.M, prVar2.getMessagesController().Z1(Long.valueOf(j13)), null, prVar2, null);
                                                    break;
                                                case 2:
                                                    this.b.m0(j11);
                                                    break;
                                                default:
                                                    pr prVar3 = this.b;
                                                    org.telegram.messenger.vp messagesController = prVar3.getMessagesController();
                                                    long j14 = prVar3.M;
                                                    org.telegram.messenger.vp messagesController2 = prVar3.getMessagesController();
                                                    long j15 = j11;
                                                    messagesController.M4(j14, messagesController2.Z1(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !prVar3.s, prVar3, false, false, null, null, null);
                                                    prVar3.z0(j15);
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                final int i19 = 2;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131752420, "ChannelDeleteFromList"), new Runnable(prVar) { // from class: org.telegram.ui.kq
                                    public final /* synthetic */ pr b;

                                    {
                                        this.b = prVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                this.b.m0(j11);
                                                break;
                                            case 1:
                                                pr prVar2 = this.b;
                                                long j13 = j11;
                                                prVar2.m0(j13);
                                                prVar2.getMessagesController().n(prVar2.M, prVar2.getMessagesController().Z1(Long.valueOf(j13)), null, prVar2, null);
                                                break;
                                            case 2:
                                                this.b.m0(j11);
                                                break;
                                            default:
                                                pr prVar3 = this.b;
                                                org.telegram.messenger.vp messagesController = prVar3.getMessagesController();
                                                long j14 = prVar3.M;
                                                org.telegram.messenger.vp messagesController2 = prVar3.getMessagesController();
                                                long j15 = j11;
                                                messagesController.M4(j14, messagesController2.Z1(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !prVar3.s, prVar3, false, false, null, null, null);
                                                prVar3.z0(j15);
                                                break;
                                        }
                                    }
                                }, true);
                            } else if (i12 == 1 && org.telegram.messenger.w3.w(4, prVar.n) && z11) {
                                if (prVar.n.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                                    i13 = 3;
                                    H.c(R.drawable.msg_admins, org.telegram.messenger.cd.L0(2131751305, "EditAdminRights"), new org.telegram.messenger.voip.g(prVar, j11, (TLObject) tL_chatAdminRights2, str6, tLObject, 2), false);
                                } else {
                                    i13 = 3;
                                }
                                H.c(R.drawable.msg_remove, org.telegram.messenger.cd.L0(2131752313, "ChannelRemoveUserAdmin"), new Runnable(prVar) { // from class: org.telegram.ui.kq
                                    public final /* synthetic */ pr b;

                                    {
                                        this.b = prVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                this.b.m0(j11);
                                                break;
                                            case 1:
                                                pr prVar2 = this.b;
                                                long j13 = j11;
                                                prVar2.m0(j13);
                                                prVar2.getMessagesController().n(prVar2.M, prVar2.getMessagesController().Z1(Long.valueOf(j13)), null, prVar2, null);
                                                break;
                                            case 2:
                                                this.b.m0(j11);
                                                break;
                                            default:
                                                pr prVar3 = this.b;
                                                org.telegram.messenger.vp messagesController = prVar3.getMessagesController();
                                                long j14 = prVar3.M;
                                                org.telegram.messenger.vp messagesController2 = prVar3.getMessagesController();
                                                long j15 = j11;
                                                messagesController.M4(j14, messagesController2.Z1(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !prVar3.s, prVar3, false, false, null, null, null);
                                                prVar3.z0(j15);
                                                break;
                                        }
                                    }
                                }, true);
                            }
                        }
                        H.W(prVar.c.U0(view, false));
                        H.S = org.telegram.messenger.zs.U2;
                        boolean z15 = H.x() > 0;
                        if (z10 || !z15) {
                            return z15;
                        }
                        H.Z();
                        return true;
                    }
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j11));
                    boolean z16 = org.telegram.messenger.w3.w(4, this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11);
                    boolean z17 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
                    boolean z18 = !(z17 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z11;
                    boolean z19 = z17 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                    boolean z20 = org.telegram.messenger.w3.w(2, this.n) && z18 && !z14 && org.telegram.messenger.w3.T(this.n) && !this.n.gigagroup;
                    if (i10 == 0) {
                        z16 &= !org.telegram.messenger.h20.x(Z1);
                    }
                    if (z16) {
                        z12 = z20;
                    } else {
                        z12 = z20;
                        if (!org.telegram.messenger.w3.w(2, this.n) || !z18) {
                            z13 = false;
                            if (!z10 || !z13) {
                                return z13;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                            int i20 = i11;
                            boolean z21 = z16;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
                            boolean z22 = z12;
                            boolean z23 = z19;
                            sq sqVar = new sq(this, j11, i20, tLObject, tL_chatAdminRights3, tL_chatBannedRights3, str, z18);
                            long j13 = j11;
                            org.telegram.ui.Components.z60 H2 = org.telegram.ui.Components.z60.H(this, view);
                            H2.W(this.c.U0(view, false));
                            if (z23) {
                                i15 = 2131751305;
                                str4 = null;
                            } else {
                                str4 = null;
                                i15 = 2131745564;
                            }
                            H2.l(R.drawable.msg_admins, org.telegram.messenger.cd.L0(i15, str4), new rh(sqVar, 13), z21);
                            H2.l(R.drawable.msg_permissions, org.telegram.messenger.cd.L0(2131752540, "ChangePermissions"), new fp(this, tLObject, Z1, sqVar, 2), z22);
                            boolean z24 = org.telegram.messenger.w3.w(2, this.n) && z18;
                            if (z14) {
                                str5 = "ChannelRemoveUser";
                                i16 = 2131752314;
                            } else {
                                str5 = "KickFromGroup";
                                i16 = 2131749065;
                            }
                            H2.m(R.drawable.msg_remove, new a3.i0(this, Z1, j13, 9), org.telegram.messenger.cd.L0(i16, str5), z24, true);
                            H2.S = org.telegram.messenger.zs.U2;
                            H2.Z();
                            return true;
                        }
                    }
                    z13 = true;
                    if (!z10) {
                    }
                    return z13;
                }
            }
            str = str2;
            j11 = j12;
            if (j11 != j10) {
                boolean z142 = this.s;
                i12 = this.N;
                if (i12 == 2) {
                }
            }
        }
        return false;
    }

    public final void m0(long j10) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().i1(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().g1(this.M);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new a3.b(1), new z4(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().i1(j10);
        tL_channels_editBanned.channel = getMessagesController().g1(this.M);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new k(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final int o0() {
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

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        return k0(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.zs.T);
        getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
        v0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.T);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        lr lrVar = this.a;
        if (lrVar != null) {
            lrVar.f();
        }
        org.telegram.ui.Components.dw0 dw0Var = this.b;
        if (dw0Var != null) {
            dw0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            G0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.A1 = true;
        }
        if (z10 && !z11 && this.m1) {
            this.f.getSearchField().requestFocus();
            org.telegram.messenger.i0.J3(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final int p0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i10 : Math.max(i10, arrayList.size());
    }

    public final boolean s0() {
        boolean z10 = this.q1 && u0();
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

    public final boolean t0(int i10) {
        return i10 == this.U || i10 == this.V || i10 == this.W || i10 == this.X || i10 == this.Y || i10 == this.Z || i10 == this.j0 || i10 == this.a0 || i10 == this.b0 || i10 == this.c0;
    }

    public final boolean u0() {
        TLRPC.Chat chat = this.n;
        if (!chat.megagroup || chat.gigagroup || !org.telegram.messenger.w3.y(13, chat)) {
            return false;
        }
        if (this.o1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.D;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.P) {
            return;
        }
        int i10 = 0;
        this.I = false;
        this.H = false;
        boolean z10 = this.w;
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
            HashMap hashMap = org.telegram.messenger.i5.r(this.currentAccount).g0;
            ArrayList arrayList4 = org.telegram.messenger.i5.r(this.currentAccount).h0;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList5.get(i13);
                    i13++;
                    arrayList3.add(getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                }
            }
            F0();
            lr lrVar = this.a;
            if (lrVar != null) {
                lrVar.f();
                return;
            }
            return;
        }
        if (org.telegram.messenger.w3.T(this.n)) {
            this.P = true;
            org.telegram.ui.Components.dw0 dw0Var = this.b;
            if (dw0Var != null) {
                dw0Var.e(true, false);
            }
            lr lrVar2 = this.a;
            if (lrVar2 != null) {
                lrVar2.f();
            }
            ArrayList w02 = w0();
            ArrayList arrayList6 = new ArrayList();
            qq qqVar = new qq(this, w02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i14 = 0; i14 < w02.size(); i14++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) w02.get(i14), new q8(arrayList6, i14, atomicInteger, w02, qqVar, 1)), this.classGuid);
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
            long j10 = getUserConfig().n;
            int size4 = this.r.participants.participants.size();
            while (i10 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.r.participants.participants.get(i10);
                int i15 = this.d1;
                if (i15 == 0 || chatParticipant2.user_id != j10) {
                    if (i15 == 1) {
                        if (getContactsController().x(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            hVar2.k(chatParticipant2, chatParticipant2.user_id);
                        } else if (!org.telegram.messenger.h20.x(getMessagesController().Z1(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    } else if (getContactsController().x(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        hVar2.k(chatParticipant2, chatParticipant2.user_id);
                    } else {
                        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(chatParticipant2.user_id));
                        if (Z1 == null || !Z1.bot) {
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
        lr lrVar3 = this.a;
        if (lrVar3 != null) {
            lrVar3.f();
        }
        F0();
        lr lrVar4 = this.a;
        if (lrVar4 != null) {
            lrVar4.f();
        }
    }

    public final ArrayList w0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().g1(this.M);
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
                    arrayList.addAll(w0());
                }
            } else if (!this.I) {
                this.j1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.I = true;
                arrayList.addAll(w0());
            } else if (this.H) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.H = true;
                arrayList.addAll(w0());
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.zs.e3;
        return arrayList;
    }

    public final void x0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        iq iqVar = new iq(j10, this.M, tL_chatAdminRights, this.D, tL_chatBannedRights, str, i10, z10, tLObject == null, null);
        iqVar.X0 = new xq(this, tLObject, j10, z11);
        presentFragment(iqVar, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
    
        if ((r0 && r11.v1) != r11.t1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0() {
        TLRPC.ChatFull chatFull;
        int i10 = 14;
        int i11 = 0;
        int i12 = this.N;
        if (i12 == 3) {
            TLRPC.Chat chat = this.n;
            if (chat.creator && !org.telegram.messenger.w3.T(chat) && ((this.o1 != this.p1 || this.x1) && this.r != null)) {
                org.telegram.messenger.vp.r1(this.currentAccount).T(getParentActivity(), this.M, this, new lq(this, i11), null);
                return;
            }
            if (!org.telegram.messenger.w3.D(this.D).equals(this.y)) {
                getMessagesController().E4(this.M, this.D, org.telegram.messenger.w3.T(this.n), this);
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
                if (L0 != null) {
                    L0.default_banned_rights = this.D;
                }
            }
            int i13 = this.o1;
            if (i13 != this.p1 && (chatFull = this.r) != null) {
                chatFull.slowmode_seconds = q0(i13);
                this.r.flags |= 131072;
                org.telegram.messenger.vp messagesController = getMessagesController();
                long j10 = this.M;
                int i14 = this.r.slowmode_seconds;
                messagesController.getClass();
                TLRPC.TL_channels_toggleSlowMode tL_channels_toggleSlowMode = new TLRPC.TL_channels_toggleSlowMode();
                tL_channels_toggleSlowMode.seconds = i14;
                tL_channels_toggleSlowMode.channel = messagesController.g1(j10);
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleSlowMode, new org.telegram.messenger.sj(messagesController, j10, i10));
            }
            boolean z10 = this.x1;
            if (z10 != this.w1 || (z10 && this.y1 != this.z1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().g1(this.M);
                updatepaidmessagesprice.send_paid_messages_stars = this.x1 ? this.z1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new ag.c3(12));
                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.M));
                if (L02 != null) {
                    if (this.x1) {
                        L02.flags2 |= TLObject.FLAG_14;
                        L02.send_paid_messages_stars = this.z1;
                    } else {
                        L02.flags2 &= -16385;
                        L02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().N3(L02, true);
                }
            }
            if (s0()) {
                boolean z11 = this.q1 && u0();
                if (z11 && this.r1 == 0) {
                    getMessagesController().A4(1, this.M);
                } else if (z11 || this.r1 == 0) {
                    getMessagesController().A4(this.r1, this.M);
                } else {
                    getMessagesController().A4(0, this.M);
                }
            }
        } else if (i12 == 1) {
            boolean z12 = this.u1;
            if (z12 == this.s1) {
            }
            org.telegram.messenger.vp messagesController2 = getMessagesController();
            long j11 = this.M;
            boolean z13 = this.u1;
            boolean z14 = z13 && this.v1;
            TLRPC.Chat L03 = messagesController2.L0(Long.valueOf(j11));
            if (L03 != null) {
                L03.signatures = z13;
                L03.signature_profiles = z14;
                messagesController2.N3(L03, true);
            }
            TLRPC.TL_channels_toggleSignatures tL_channels_toggleSignatures = new TLRPC.TL_channels_toggleSignatures();
            tL_channels_toggleSignatures.channel = messagesController2.g1(j11);
            tL_channels_toggleSignatures.signatures_enabled = z13;
            tL_channels_toggleSignatures.profiles_enabled = z14;
            messagesController2.getConnectionsManager().sendRequest(tL_channels_toggleSignatures, new org.telegram.messenger.tj(messagesController2, i10), 64);
            messagesController2.getNotificationCenter().k(org.telegram.messenger.zs.E3, Long.valueOf(-j11));
        }
        finishFragment();
    }

    public final void z0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        jr A0 = A0();
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
            E0(A0);
        }
        s4.g0 adapter = this.c.getAdapter();
        or orVar = this.e;
        if (adapter == orVar) {
            zf.m1 m1Var = orVar.h;
            Object f7 = m1Var.f.f(j10);
            if (f7 != null) {
                m1Var.e.remove(f7);
            }
            Object f10 = m1Var.h.f(j10);
            if (f10 != null) {
                m1Var.g.remove(f10);
            }
            Object f11 = orVar.e.f(j10);
            if (f11 != null) {
                orVar.d.remove(f11);
            }
            orVar.f();
        }
    }
}
