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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nq extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.iz C1;
    public int D0;
    public RadialProgressView D1;
    public TLRPC.TL_chatBannedRights E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public int F1;
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
    public iq a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.zu0 b;
    public int b0;
    public int b1;
    public ci.j1 c;
    public int c0;
    public int c1;
    public kg.f0 d;
    public int d0;
    public int d1;
    public mq e;
    public int e0;
    public final int e1;
    public org.telegram.ui.ActionBar.f5 f;
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
    public int k1;
    public int l0;
    public boolean l1;
    public int m0;
    public fq m1;
    public TLRPC.Chat n;
    public int n0;
    public final boolean n1;
    public int o0;
    public boolean o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public TLRPC.ChatFull r;
    public int r0;
    public boolean r1;
    public final boolean s;
    public int s0;
    public int s1;
    public int t0;
    public final boolean t1;
    public int u0;
    public final boolean u1;
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

    public nq(Bundle bundle) {
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
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
        this.n = M0;
        boolean z10 = false;
        if (M0 != null && (tL_chatBannedRights = M0.default_banned_rights) != null) {
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
        this.y = org.telegram.messenger.t3.D(this.E);
        boolean Y = org.telegram.messenger.t3.Y(this.n);
        this.w = Y;
        if (org.telegram.messenger.t3.T(this.n) && !this.n.megagroup && !Y) {
            z10 = true;
        }
        this.s = z10;
        this.x = org.telegram.messenger.t3.c0(this.n);
        TLRPC.Chat chat = this.n;
        if (chat != null) {
            boolean z18 = chat.signatures;
            this.v1 = z18;
            this.t1 = z18;
            boolean z19 = chat.signature_profiles;
            this.w1 = z19;
            this.u1 = z19;
        }
    }

    public static /* synthetic */ void Z(nq nqVar, long j10) {
        if (j10 != 0) {
            nqVar.N = j10;
            nqVar.n = org.telegram.messenger.hp.s1(nqVar.currentAccount).M0(Long.valueOf(j10));
            nqVar.z0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(final nq nqVar, View view, int i3) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m10;
        TLObject E;
        long j10;
        String str;
        boolean z10;
        long C1;
        TLObject tLObject;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject2;
        int i10;
        boolean w10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i11 = nqVar.e1;
        a0.h hVar = nqVar.K;
        a0.h hVar2 = nqVar.M;
        boolean z12 = nqVar.s;
        int i12 = nqVar.O;
        final int i13 = 0;
        final int i14 = 1;
        boolean z13 = nqVar.c.getAdapter() == nqVar.a;
        if (i3 == nqVar.h1) {
            boolean z14 = !nqVar.v1;
            nqVar.v1 = z14;
            ((org.telegram.ui.Cells.q8) view).setChecked(z14);
            org.telegram.messenger.g0.b4(nqVar.c);
            gq B0 = nqVar.B0();
            nqVar.G0();
            nqVar.F0(B0);
            nqVar.a.g(nqVar.j1);
        } else if (i3 == nqVar.i1) {
            boolean z15 = !nqVar.w1;
            nqVar.w1 = z15;
            ((org.telegram.ui.Cells.q8) view).setChecked(z15);
            org.telegram.messenger.g0.b4(nqVar.c);
            gq B02 = nqVar.B0();
            nqVar.G0();
            nqVar.F0(B02);
            nqVar.a.g(nqVar.j1);
        } else if (i3 == nqVar.n0) {
            boolean z16 = !nqVar.y1;
            nqVar.y1 = z16;
            ((org.telegram.ui.Cells.q8) view).setChecked(z16);
            org.telegram.messenger.g0.b4(nqVar.c);
            gq B03 = nqVar.B0();
            nqVar.G0();
            nqVar.F0(B03);
            nqVar.a.g(nqVar.n0);
        } else if (z13) {
            if (nqVar.u0(i3)) {
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (i3 == nqVar.V) {
                    nqVar.E.send_photos = !r15.send_photos;
                } else if (i3 == nqVar.W) {
                    nqVar.E.send_videos = !r14.send_videos;
                } else if (i3 == nqVar.X) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = nqVar.E;
                    boolean z17 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z17;
                    tL_chatBannedRights2.send_gifs = z17;
                    tL_chatBannedRights2.send_games = z17;
                    tL_chatBannedRights2.send_stickers = z17;
                } else if (i3 == nqVar.Y) {
                    nqVar.E.send_audios = !r14.send_audios;
                } else if (i3 == nqVar.Z) {
                    nqVar.E.send_docs = !r14.send_docs;
                } else if (i3 == nqVar.a0) {
                    nqVar.E.send_voices = !r14.send_voices;
                } else if (i3 == nqVar.b0) {
                    nqVar.E.send_roundvideos = !r14.send_roundvideos;
                } else if (i3 == nqVar.c0) {
                    if (nqVar.E.send_plain && (m10 = nqVar.d.m(nqVar.T)) != null) {
                        org.telegram.messenger.g0.H3(m10);
                        org.telegram.messenger.p2.E.a();
                        return;
                    } else {
                        nqVar.E.embed_links = !r14.embed_links;
                    }
                } else if (i3 == nqVar.d0) {
                    nqVar.E.send_polls = !r14.send_polls;
                } else if (i3 == nqVar.k0) {
                    nqVar.E.send_reactions = !r14.send_reactions;
                }
                c2Var.c(!c2Var.b(), true);
                org.telegram.messenger.g0.b4(nqVar.c);
                gq B04 = nqVar.B0();
                nqVar.G0();
                nqVar.F0(B04);
            } else if (i3 == nqVar.Q0) {
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                boolean z18 = !p8Var.d.h;
                nqVar.r1 = z18;
                p8Var.setChecked(z18);
                org.telegram.messenger.g0.b4(nqVar.c);
                gq B05 = nqVar.B0();
                nqVar.G0();
                nqVar.F0(B05);
            } else {
                if (i3 == nqVar.z0) {
                    if (i12 == 0 || i12 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", nqVar.N);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i12 == 0 ? 2 : 3);
                        nq nqVar2 = new nq(bundle);
                        nqVar2.C0(nqVar.r);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = nqVar.E;
                        if (tL_chatBannedRights3 != null) {
                            nqVar2.E = tL_chatBannedRights3;
                        }
                        nqVar2.m1 = new aq(nqVar);
                        nqVar.presentFragment(nqVar2);
                        return;
                    }
                    if (i12 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", nqVar.N);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        nq nqVar3 = new nq(bundle2);
                        nqVar3.m1 = new bq(nqVar);
                        nqVar3.C0(nqVar.r);
                        nqVar.presentFragment(nqVar3);
                        return;
                    }
                    if (i12 == 2) {
                        Bundle k10 = a1.g.k("addToGroup", true);
                        k10.putLong(z12 ? "channelId" : "chatId", nqVar.n.id);
                        r40 r40Var = new r40(k10);
                        r40Var.J = nqVar.r;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        r40Var.K = hVar;
                        r40Var.y = new dq(nqVar, r40Var);
                        nqVar.presentFragment(r40Var);
                        return;
                    }
                    return;
                }
                if (i3 == nqVar.v0) {
                    nqVar.presentFragment(new kb(nqVar.n));
                    return;
                }
                if (i3 == nqVar.x0) {
                    final org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    TLRPC.ChatFull chatFull3 = nqVar.r;
                    if (chatFull3 != null && !chatFull3.antispam && nqVar.q0() < nqVar.getMessagesController().f5) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(nqVar.getMessagesController().f5, "ChannelAntiSpamForbidden", new Object[0]), org.telegram.ui.Components.fc.a0(nqVar), R.raw.msg_antispam, 36);
                        return;
                    }
                    if (nqVar.r == null || !org.telegram.messenger.t3.y(13, nqVar.n) || nqVar.w0) {
                        return;
                    }
                    nqVar.w0 = true;
                    final boolean z19 = nqVar.r.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = nqVar.getMessagesController().h1(nqVar.N);
                    TLRPC.ChatFull chatFull4 = nqVar.r;
                    boolean z20 = !chatFull4.antispam;
                    chatFull4.antispam = z20;
                    tL_channels_toggleAntiSpam.enabled = z20;
                    l8Var.setChecked(z20);
                    l8Var.getCheckBox().setIcon((org.telegram.messenger.t3.y(13, nqVar.n) && ((chatFull2 = nqVar.r) == null || chatFull2.antispam || nqVar.q0() >= nqVar.getMessagesController().f5)) ? 0 : R.drawable.permission_locked);
                    nqVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(nqVar) { // from class: org.telegram.ui.mp
                        public final /* synthetic */ nq b;

                        {
                            this.b = nqVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    final nq nqVar4 = this.b;
                                    if (tLObject3 != null) {
                                        nqVar4.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        nqVar4.getMessagesController().R3(nqVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i15 = 0;
                                        final org.telegram.ui.Cells.l8 l8Var2 = l8Var;
                                        final boolean z21 = z19;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.op
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i16 = i15;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z22 = z21;
                                                org.telegram.ui.Cells.l8 l8Var3 = l8Var2;
                                                nq nqVar5 = nqVar4;
                                                switch (i16) {
                                                    case 0:
                                                        if (nqVar5.getParentActivity() != null) {
                                                            nqVar5.r.antispam = z22;
                                                            l8Var3.setChecked(z22);
                                                            Switch checkBox = l8Var3.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, nqVar5.n) && ((chatFull5 = nqVar5.r) == null || !chatFull5.antispam || nqVar5.q0() >= nqVar5.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (nqVar5.getParentActivity() != null) {
                                                            nqVar5.r.participants_hidden = z22;
                                                            l8Var3.setChecked(z22);
                                                            Switch checkBox2 = l8Var3.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, nqVar5.n) && ((chatFull6 = nqVar5.r) == null || !chatFull6.participants_hidden || nqVar5.q0() >= nqVar5.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    nqVar4.w0 = false;
                                    break;
                                default:
                                    final nq nqVar5 = this.b;
                                    if (tLObject3 != null) {
                                        nqVar5.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        nqVar5.getMessagesController().R3(nqVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 1;
                                        final org.telegram.ui.Cells.l8 l8Var3 = l8Var;
                                        final boolean z22 = z19;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.op
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i16;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z222 = z22;
                                                org.telegram.ui.Cells.l8 l8Var32 = l8Var3;
                                                nq nqVar52 = nqVar5;
                                                switch (i162) {
                                                    case 0:
                                                        if (nqVar52.getParentActivity() != null) {
                                                            nqVar52.r.antispam = z222;
                                                            l8Var32.setChecked(z222);
                                                            Switch checkBox = l8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, nqVar52.n) && ((chatFull5 = nqVar52.r) == null || !chatFull5.antispam || nqVar52.q0() >= nqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (nqVar52.getParentActivity() != null) {
                                                            nqVar52.r.participants_hidden = z222;
                                                            l8Var32.setChecked(z222);
                                                            Switch checkBox2 = l8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, nqVar52.n) && ((chatFull6 = nqVar52.r) == null || !chatFull6.participants_hidden || nqVar52.q0() >= nqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    nqVar5.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i3 == nqVar.J0) {
                    final org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                    if (nqVar.q0() < nqVar.getMessagesController().g5) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(nqVar.getMessagesController().g5, "ChannelHiddenMembersForbidden", new Object[0]), org.telegram.ui.Components.fc.a0(nqVar), R.raw.contacts_sync_off, 36);
                        return;
                    }
                    if (nqVar.r == null || !org.telegram.messenger.t3.y(2, nqVar.n) || nqVar.I0) {
                        return;
                    }
                    nqVar.I0 = true;
                    final boolean z21 = nqVar.r.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = nqVar.getMessagesController().h1(nqVar.N);
                    TLRPC.ChatFull chatFull5 = nqVar.r;
                    boolean z22 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z22;
                    tL_channels_toggleParticipantsHidden.enabled = z22;
                    l8Var2.setChecked(z22);
                    Switch checkBox = l8Var2.getCheckBox();
                    if (!org.telegram.messenger.t3.y(2, nqVar.n) || ((chatFull = nqVar.r) != null && !chatFull.participants_hidden && nqVar.q0() < nqVar.getMessagesController().g5)) {
                        i13 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i13);
                    nqVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(nqVar) { // from class: org.telegram.ui.mp
                        public final /* synthetic */ nq b;

                        {
                            this.b = nqVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final nq nqVar4 = this.b;
                                    if (tLObject3 != null) {
                                        nqVar4.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        nqVar4.getMessagesController().R3(nqVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i15 = 0;
                                        final org.telegram.ui.Cells.l8 l8Var22 = l8Var2;
                                        final boolean z212 = z21;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.op
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i15;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z222 = z212;
                                                org.telegram.ui.Cells.l8 l8Var32 = l8Var22;
                                                nq nqVar52 = nqVar4;
                                                switch (i162) {
                                                    case 0:
                                                        if (nqVar52.getParentActivity() != null) {
                                                            nqVar52.r.antispam = z222;
                                                            l8Var32.setChecked(z222);
                                                            Switch checkBox2 = l8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, nqVar52.n) && ((chatFull52 = nqVar52.r) == null || !chatFull52.antispam || nqVar52.q0() >= nqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (nqVar52.getParentActivity() != null) {
                                                            nqVar52.r.participants_hidden = z222;
                                                            l8Var32.setChecked(z222);
                                                            Switch checkBox22 = l8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, nqVar52.n) && ((chatFull6 = nqVar52.r) == null || !chatFull6.participants_hidden || nqVar52.q0() >= nqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox22.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    nqVar4.w0 = false;
                                    break;
                                default:
                                    final nq nqVar5 = this.b;
                                    if (tLObject3 != null) {
                                        nqVar5.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        nqVar5.getMessagesController().R3(nqVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 1;
                                        final org.telegram.ui.Cells.l8 l8Var3 = l8Var2;
                                        final boolean z222 = z21;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.op
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i16;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z2222 = z222;
                                                org.telegram.ui.Cells.l8 l8Var32 = l8Var3;
                                                nq nqVar52 = nqVar5;
                                                switch (i162) {
                                                    case 0:
                                                        if (nqVar52.getParentActivity() != null) {
                                                            nqVar52.r.antispam = z2222;
                                                            l8Var32.setChecked(z2222);
                                                            Switch checkBox2 = l8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, nqVar52.n) && ((chatFull52 = nqVar52.r) == null || !chatFull52.antispam || nqVar52.q0() >= nqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (nqVar52.getParentActivity() != null) {
                                                            nqVar52.r.participants_hidden = z2222;
                                                            l8Var32.setChecked(z2222);
                                                            Switch checkBox22 = l8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, nqVar52.n) && ((chatFull6 = nqVar52.r) == null || !chatFull6.participants_hidden || nqVar52.q0() >= nqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox22.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743889, org.telegram.ui.Components.fc.a0(nqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    nqVar5.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i3 == nqVar.L0) {
                    if (nqVar.n == null) {
                        return;
                    }
                    org.telegram.ui.Cells.l8 l8Var3 = (org.telegram.ui.Cells.l8) view;
                    boolean d = l8Var3.d();
                    l8Var3.setChecked(!l8Var3.d());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = org.telegram.messenger.hp.l1(nqVar.n);
                    TLRPC.Chat chat = nqVar.n;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = nqVar.n.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !l8Var3.d();
                    nqVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new c3.b(i14), new bi.l0(nqVar, l8Var3, d, i14));
                } else {
                    if (i3 == nqVar.B0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", nqVar.N);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        nq nqVar4 = new nq(bundle3);
                        nqVar4.C0(nqVar.r);
                        nqVar.presentFragment(nqVar4);
                        return;
                    }
                    if (i3 == nqVar.t0) {
                        nqVar.showDialog(new eq(nqVar, nqVar.getParentActivity(), nqVar));
                    } else {
                        if (i3 == nqVar.A0) {
                            if (nqVar.r != null) {
                                xe0 xe0Var = new xe0(nqVar.N, 0, 0L);
                                TLRPC.ChatFull chatFull6 = nqVar.r;
                                xe0Var.m0(chatFull6, chatFull6.exported_invite);
                                nqVar.presentFragment(xe0Var);
                                return;
                            }
                            return;
                        }
                        if ((i3 > nqVar.S && i3 <= Math.max(nqVar.l0, nqVar.g0)) || i3 == nqVar.m0) {
                            org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                            boolean isEnabled = p8Var2.isEnabled();
                            Switch r42 = p8Var2.d;
                            if (isEnabled) {
                                if (r42.G != null) {
                                    if (org.telegram.messenger.t3.t0(nqVar.n) && (i3 == nqVar.i0 || i3 == nqVar.g0)) {
                                        org.telegram.messenger.k5.p(null, 2131751286, org.telegram.ui.Components.fc.a0(nqVar), null);
                                        return;
                                    } else if (org.telegram.messenger.t3.Z(nqVar.currentAccount, nqVar.N) && (i3 == nqVar.i0 || i3 == nqVar.g0)) {
                                        org.telegram.messenger.k5.p(null, 2131751287, org.telegram.ui.Components.fc.a0(nqVar), null);
                                        return;
                                    } else {
                                        org.telegram.messenger.k5.p("EditCantEditPermissions", 2131751288, org.telegram.ui.Components.fc.a0(nqVar), null);
                                        return;
                                    }
                                }
                                if (i3 == nqVar.U) {
                                    gq B06 = nqVar.B0();
                                    nqVar.l1 = !nqVar.l1;
                                    org.telegram.messenger.g0.b4(nqVar.c);
                                    nqVar.F0(B06);
                                    return;
                                }
                                p8Var2.setChecked(!r42.h);
                                if (i3 == nqVar.g0) {
                                    nqVar.E.change_info = !r0.change_info;
                                    return;
                                }
                                if (i3 == nqVar.m0) {
                                    nqVar.E.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i3 == nqVar.h0) {
                                    nqVar.E.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i3 == nqVar.l0) {
                                    nqVar.E.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i3 == nqVar.i0) {
                                    nqVar.E.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i3 == nqVar.j0) {
                                    nqVar.E.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i3 == nqVar.T) {
                                    nqVar.E.send_plain = !r1.send_plain;
                                    int i15 = nqVar.c0;
                                    if (i15 >= 0) {
                                        nqVar.a.g(i15);
                                    }
                                    int i16 = nqVar.U;
                                    if (i16 >= 0) {
                                        nqVar.a.g(i16);
                                    }
                                    gq B07 = nqVar.B0();
                                    nqVar.G0();
                                    nqVar.F0(B07);
                                    return;
                                }
                                if (i3 == nqVar.U) {
                                    gq B08 = nqVar.B0();
                                    nqVar.l1 = !nqVar.l1;
                                    org.telegram.messenger.g0.b4(nqVar.c);
                                    nqVar.F0(B08);
                                    return;
                                }
                                if (i3 == nqVar.e0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = nqVar.E;
                                    boolean z23 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z23;
                                    tL_chatBannedRights5.send_gifs = z23;
                                    tL_chatBannedRights5.send_games = z23;
                                    tL_chatBannedRights5.send_stickers = z23;
                                    return;
                                }
                                if (i3 == nqVar.f0) {
                                    nqVar.E.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i3 == nqVar.d0) {
                                        nqVar.E.send_polls = !r0.send_polls;
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
        if (z13) {
            E = nqVar.a.E(i3);
            if (E instanceof TLRPC.User) {
                j10 = ((TLRPC.User) E).id;
                z10 = true;
            } else {
                if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    C1 = org.telegram.messenger.zi.C1(channelParticipant.peer);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                    String str2 = channelParticipant.rank;
                    boolean z24 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
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
                        if (!z12) {
                            tL_chatAdminRights3.manage_call = true;
                        }
                    }
                    boolean z25 = z24;
                    tLObject = E;
                    z11 = z12;
                    tL_chatBannedRights = tL_chatBannedRights6;
                    tL_chatAdminRights = tL_chatAdminRights3;
                    z10 = z25;
                    str = str2;
                } else if (E instanceof TLRPC.ChatParticipant) {
                    long j11 = ((TLRPC.ChatParticipant) E).user_id;
                    z10 = nqVar.n.creator;
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
                        if (!z12) {
                            tL_chatAdminRights2.manage_call = true;
                        }
                    } else {
                        tL_chatAdminRights2 = null;
                    }
                    str = "";
                    tLObject = E;
                    z11 = z12;
                    tL_chatAdminRights = tL_chatAdminRights2;
                    tL_chatBannedRights = null;
                    C1 = j11;
                } else {
                    tLObject = E;
                    z11 = z12;
                    str = "";
                    tL_chatAdminRights = null;
                    tL_chatBannedRights = null;
                    z10 = false;
                    C1 = 0;
                }
                if (C1 != 0) {
                    return;
                }
                if (i11 != 0) {
                    if (i11 != 3 && i11 != 1) {
                        if (org.telegram.messenger.t3.T(nqVar.n)) {
                            nqVar.getMessagesController().f0(nqVar.N, nqVar.getMessagesController().a2(Long.valueOf(C1)));
                            fq fqVar = nqVar.m1;
                            if (fqVar != null) {
                                fqVar.d(C1);
                            }
                            nqVar.finishFragment();
                            return;
                        }
                        return;
                    }
                    if (i11 == 1 || !z10 || (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin))) {
                        nqVar.y0(C1, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z10, i11 == 1 ? 0 : 1, i11 == 1 || i11 == 3);
                        return;
                    }
                    TLRPC.User a22 = nqVar.getMessagesController().a2(Long.valueOf(C1));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nqVar.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(R.string.AppName, "AppName");
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.a0("AdminWillBeRemoved", null, 2131754350, org.telegram.messenger.l10.p(a22));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new np(nqVar, a22, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z10));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                    nqVar.showDialog(s1Var);
                    return;
                }
                long j12 = C1;
                if (i12 == 1) {
                    w10 = j12 != nqVar.getUserConfig().e() && (nqVar.n.creator || z10);
                } else {
                    if (i12 == 0 || i12 == 3) {
                        i10 = 2;
                        w10 = org.telegram.messenger.t3.w(2, nqVar.n);
                        if (i12 != 0 || ((i12 != 1 && z11) || (i12 == i10 && i11 == 0))) {
                            if (j12 != nqVar.getUserConfig().e()) {
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            if (C1 > 0) {
                                bundle4.putLong("user_id", j12);
                            } else {
                                bundle4.putLong("chat_id", -j12);
                            }
                            nqVar.presentFragment(new ProfileActivity(bundle4, null));
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
                        ip ipVar = new ip(j12, nqVar.N, tL_chatAdminRights, nqVar.E, tL_chatBannedRights, str, i12 == 1 ? 0 : 1, w10, tLObject == null, null);
                        ipVar.Y0 = new sp(nqVar, tLObject);
                        nqVar.presentFragment(ipVar);
                        return;
                    }
                    w10 = false;
                }
                i10 = 2;
                if (i12 != 0) {
                }
                if (j12 != nqVar.getUserConfig().e()) {
                }
            }
        } else {
            E = nqVar.e.E(i3);
            if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                nqVar.getMessagesController().X3(user, false, false);
                long j13 = user.id;
                int i17 = 0;
                while (true) {
                    if (i17 >= 3) {
                        tLObject2 = null;
                        break;
                    }
                    tLObject2 = (TLObject) (i17 == 0 ? hVar2 : i17 == 1 ? nqVar.L : hVar).f(j13);
                    if (tLObject2 != null) {
                        break;
                    } else {
                        i17++;
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
                C1 = org.telegram.messenger.zi.C1(channelParticipant2.peer);
                boolean z26 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                str = channelParticipant2.rank;
                tLObject = E;
                z11 = z12;
                tL_chatBannedRights = tL_chatBannedRights7;
                z10 = z26;
                tL_chatAdminRights = tL_chatAdminRights4;
                if (C1 != 0) {
                }
            } else if (E instanceof TLRPC.ChatParticipant) {
                j10 = ((TLRPC.ChatParticipant) E).user_id;
                z10 = nqVar.n.creator;
            } else {
                if (E != null) {
                    str = "";
                    z10 = false;
                    C1 = j10;
                    tL_chatAdminRights = null;
                    tLObject = E;
                    z11 = z12;
                    tL_chatBannedRights = null;
                    if (C1 != 0) {
                    }
                }
                z10 = true;
            }
        }
        str = "";
        C1 = j10;
        tL_chatAdminRights = null;
        tLObject = E;
        z11 = z12;
        tL_chatBannedRights = null;
        if (C1 != 0) {
        }
    }

    public static void b0(nq nqVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i3 = 0;
        while (i3 < 3) {
            TLObject tLObject = (TLObject) (i3 == 0 ? nqVar.M : i3 == 1 ? nqVar.L : nqVar.K).f(org.telegram.messenger.zi.C1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i3++;
        }
    }

    public static void h0(nq nqVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = nqVar.K;
        ArrayList arrayList2 = nqVar.F;
        UndoView undoView = nqVar.h;
        long j10 = -nqVar.N;
        boolean z12 = nqVar.s;
        undoView.m(j10, user, z12 ? 9 : 10);
        boolean z13 = false;
        nqVar.n.creator = false;
        int i3 = 0;
        boolean z14 = false;
        while (i3 < 3) {
            boolean z15 = true;
            if (i3 == 0) {
                hVar = nqVar.M;
                arrayList = nqVar.H;
            } else if (i3 == 1) {
                hVar = nqVar.L;
                arrayList = nqVar.G;
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
            long e10 = nqVar.getUserConfig().e();
            TLObject tLObject2 = (TLObject) hVar.f(e10);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e10;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e10;
                tL_channelParticipantAdmin.promoted_by = e10;
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
                hVar.k(tL_channelParticipantAdmin, e10);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new org.telegram.messenger.tq(25));
            }
            i3++;
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
            Collections.sort(arrayList2, new org.telegram.messenger.tq(24));
            nqVar.G0();
        }
        nqVar.a.f();
        fq fqVar = nqVar.m1;
        if (fqVar != null) {
            fqVar.a(user);
        }
    }

    public static int o0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int r0(int i3) {
        if (i3 == 1) {
            return 5;
        }
        if (i3 == 2) {
            return 10;
        }
        if (i3 == 3) {
            return 30;
        }
        if (i3 == 4) {
            return 60;
        }
        if (i3 == 5) {
            return org.telegram.messenger.hs.X4;
        }
        if (i3 == 6) {
            return 900;
        }
        return i3 == 7 ? 3600 : 0;
    }

    public static int s0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i3 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i3++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i3++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i3++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i3++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i3++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i3++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i3++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i3++;
        }
        return !tL_chatBannedRights.send_reactions ? i3 + 1 : i3;
    }

    public final void A0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        gq B0 = B0();
        boolean z10 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 == 0) {
                hVar = this.M;
                arrayList = this.H;
            } else if (i3 == 1) {
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
                if (this.O == 0 && (chatFull = this.r) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            F0(B0);
        }
        u4.h0 adapter = this.c.getAdapter();
        mq mqVar = this.e;
        if (adapter == mqVar) {
            kg.v1 v1Var = mqVar.h;
            Object f10 = v1Var.f.f(j10);
            if (f10 != null) {
                v1Var.e.remove(f10);
            }
            Object f11 = v1Var.h.f(j10);
            if (f11 != null) {
                v1Var.g.remove(f11);
            }
            Object f12 = mqVar.e.f(j10);
            if (f12 != null) {
                mqVar.d.remove(f12);
            }
            mqVar.f();
        }
    }

    public final gq B0() {
        gq gqVar = new gq(this);
        gqVar.b = this.d1;
        gqVar.i = this.X0;
        gqVar.j = this.Y0;
        gqVar.l.clear();
        gqVar.l.addAll(this.G);
        gqVar.h = this.V0;
        gqVar.g = this.U0;
        gqVar.m.clear();
        gqVar.m.addAll(this.H);
        gqVar.e = this.E0;
        gqVar.f = this.F0;
        gqVar.k.clear();
        gqVar.k.addAll(this.F);
        gqVar.f(gqVar.c);
        return gqVar;
    }

    public final void C0(TLRPC.ChatFull chatFull) {
        this.r = chatFull;
        if (chatFull != null) {
            int p02 = p0();
            this.q1 = p02;
            this.p1 = p02;
            int i3 = this.r.boosts_unrestrict;
            this.r1 = i3 > 0;
            this.s1 = i3;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
            long j10 = M0 == null ? 0L : M0.send_paid_messages_stars;
            boolean z10 = j10 > 0;
            this.y1 = z10;
            this.x1 = z10;
            if (j10 <= 0) {
                j10 = 10;
            }
            long k10 = Utilities.k(j10, getMessagesController().I6, 1L);
            this.A1 = k10;
            this.z1 = k10;
        }
    }

    public final void D0(int i3) {
        if (this.isPaused || !this.B1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.R) {
            return;
        }
        View view = null;
        for (int i10 = 0; i10 < this.c.getChildCount(); i10++) {
            View childAt = this.c.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Components.iz) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i3--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new tp(this, (org.telegram.ui.Components.iz) view, i3, 0));
    }

    public final void E0(ArrayList arrayList) {
        Collections.sort(arrayList, new qp(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void F0(gq gqVar) {
        View view;
        if (this.a == null) {
            G0();
            return;
        }
        G0();
        gqVar.f(gqVar.d);
        u4.o.c(gqVar, true).c(this.a);
        ci.j1 j1Var = this.c;
        if (j1Var == null || this.d == null || j1Var.getChildCount() <= 0) {
            return;
        }
        int i3 = 0;
        int i10 = -1;
        while (true) {
            if (i3 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            i10 = RecyclerView.R(this.c.getChildAt(i3));
            if (i10 != -1) {
                view = this.c.getChildAt(i3);
                break;
            }
            i3++;
        }
        if (view != null) {
            this.d.h1(i10, view.getTop() - this.c.getPaddingTop());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bd, code lost:
    
        if (org.telegram.messenger.t3.w(2, r1) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0() {
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
        this.n = M0;
        if (M0 == null) {
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
        int i3 = 1;
        int i10 = this.O;
        if (i10 == 3) {
            int i11 = this.d1;
            int i12 = i11 + 1;
            this.d1 = i12;
            this.S = i11;
            if (!z14) {
                this.T = i12;
                int i13 = i11 + 3;
                this.d1 = i13;
                this.U = i11 + 2;
                if (this.l1) {
                    this.V = i13;
                    this.W = i11 + 4;
                    this.X = i11 + 5;
                    this.Y = i11 + 6;
                    this.Z = i11 + 7;
                    this.a0 = i11 + 8;
                    this.b0 = i11 + 9;
                    this.c0 = i11 + 10;
                    this.d0 = i11 + 11;
                    this.d1 = i11 + 13;
                    this.k0 = i11 + 12;
                }
                int i14 = this.d1;
                this.h0 = i14;
                this.i0 = i14 + 1;
                this.d1 = i14 + 3;
                this.j0 = i14 + 2;
            }
            int i15 = this.d1;
            int i16 = i15 + 1;
            this.d1 = i16;
            this.g0 = i15;
            if (z14) {
                this.d1 = i15 + 2;
                this.m0 = i16;
            } else if (this.x) {
                this.d1 = i15 + 2;
                this.l0 = i16;
            }
            if (org.telegram.messenger.t3.T(this.n)) {
                TLRPC.Chat chat2 = this.n;
                if (chat2.creator && chat2.megagroup && !chat2.gigagroup && !z14) {
                    int i17 = chat2.participants_count;
                    TLRPC.ChatFull chatFull4 = this.r;
                    if (Math.max(i17, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().Y2 - 1000) {
                        int i18 = this.d1;
                        this.H0 = i18;
                        this.s0 = i18 + 1;
                        this.t0 = i18 + 2;
                        this.d1 = i18 + 4;
                        this.u0 = i18 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.r;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z14 && org.telegram.messenger.t3.w(2, this.n) && (org.telegram.messenger.t3.T(this.n) || ((chat = this.n) != null && chat.creator))) {
                if (this.H0 == -1) {
                    int i19 = this.d1;
                    this.d1 = i19 + 1;
                    this.H0 = i19;
                }
                int i20 = this.d1;
                this.n0 = i20;
                int i21 = i20 + 2;
                this.d1 = i21;
                this.o0 = i20 + 1;
                if (this.y1) {
                    this.p0 = i21;
                    this.q0 = i20 + 3;
                    this.d1 = i20 + 5;
                    this.r0 = i20 + 4;
                }
            }
            if (!z14) {
                if (org.telegram.messenger.t3.T(this.n) || !this.n.creator) {
                    TLRPC.Chat chat3 = this.n;
                    if (chat3.megagroup) {
                        if (!chat3.gigagroup) {
                        }
                    }
                }
                if (this.H0 == -1) {
                    int i22 = this.d1;
                    this.d1 = i22 + 1;
                    this.H0 = i22;
                }
                int i23 = this.d1;
                this.N0 = i23;
                this.O0 = i23 + 1;
                this.d1 = i23 + 3;
                this.P0 = i23 + 2;
            }
            if (v0() && !z14) {
                if (this.H0 == -1) {
                    int i24 = this.d1;
                    this.d1 = i24 + 1;
                    this.H0 = i24;
                }
                int i25 = this.d1;
                int i26 = i25 + 1;
                this.d1 = i26;
                this.Q0 = i25;
                if (this.r1) {
                    this.d1 = i25 + 2;
                    this.S0 = i26;
                }
                int i27 = this.d1;
                this.d1 = i27 + 1;
                this.R0 = i27;
            }
            if (org.telegram.messenger.t3.T(this.n) && !z14) {
                if (this.H0 == -1) {
                    int i28 = this.d1;
                    this.d1 = i28 + 1;
                    this.H0 = i28;
                }
                int i29 = this.d1;
                this.d1 = i29 + 1;
                this.B0 = i29;
            }
            if ((this.P0 == -1 && this.s0 == -1) || this.B0 != -1) {
                int i30 = this.d1;
                this.d1 = i30 + 1;
                this.G0 = i30;
            }
            if (org.telegram.messenger.t3.w(2, this.n) && !z14 && q0() > 1 && (org.telegram.messenger.t3.T(this.n) || this.n.creator)) {
                int i31 = this.d1;
                this.d1 = i31 + 1;
                this.z0 = i31;
            }
            if (this.Q && !(z13 = this.R)) {
                if (z13 || (chatFull3 = this.r) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i32 = this.d1;
                this.d1 = i32 + 1;
                this.f1 = i32;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i33 = this.d1;
                this.E0 = i33;
                int size = arrayList.size() + i33;
                this.d1 = size;
                this.F0 = size;
            }
            if (this.z0 == -1 && this.E0 == -1) {
                return;
            }
            int i34 = this.d1;
            this.d1 = i34 + 1;
            this.C0 = i34;
            return;
        }
        if (i10 == 0) {
            if (org.telegram.messenger.t3.w(2, this.n)) {
                int i35 = this.d1;
                this.d1 = i35 + 1;
                this.z0 = i35;
                if (!arrayList.isEmpty() || (this.Q && !this.R && (chatFull2 = this.r) != null && chatFull2.kicked_count > 0)) {
                    int i36 = this.d1;
                    this.d1 = i36 + 1;
                    this.b1 = i36;
                }
            }
            if (this.Q && !(z12 = this.R)) {
                if (z12) {
                    return;
                }
                int i37 = this.d1;
                this.D0 = i37;
                this.d1 = i37 + 2;
                this.f1 = i37 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i38 = this.d1;
                int i39 = i38 + 1;
                this.d1 = i39;
                this.D0 = i38;
                this.E0 = i39;
                int size2 = arrayList.size() + i39;
                this.d1 = size2;
                this.F0 = size2;
            }
            if (this.E0 == -1) {
                int i40 = this.d1;
                this.d1 = i40 + 1;
                this.c1 = i40;
                return;
            } else if (this.b1 == -1) {
                int i41 = this.d1;
                this.d1 = i41 + 1;
                this.b1 = i41;
                return;
            } else {
                int i42 = this.d1;
                this.d1 = i42 + 1;
                this.C0 = i42;
                return;
            }
        }
        if (i10 == 1) {
            boolean z15 = this.P;
            if (!z15 && org.telegram.messenger.t3.T(this.n)) {
                TLRPC.Chat chat4 = this.n;
                if (chat4.megagroup && !chat4.gigagroup && ((chatFull = this.r) == null || chatFull.participants_count <= 200 || (!this.s && chatFull.can_set_stickers))) {
                    if (org.telegram.messenger.t3.N(chat4)) {
                        int i43 = this.d1;
                        this.x0 = i43;
                        this.d1 = i43 + 2;
                        this.y0 = i43 + 1;
                    } else {
                        int i44 = this.d1;
                        this.d1 = i44 + 1;
                        this.C0 = i44;
                    }
                }
            }
            if (org.telegram.messenger.t3.w(4, this.n)) {
                int i45 = this.d1;
                this.d1 = i45 + 1;
                this.z0 = i45;
            }
            if (!this.Q || (z11 = this.R)) {
                if (!arrayList.isEmpty()) {
                    int i46 = this.d1;
                    this.E0 = i46;
                    int size3 = arrayList.size() + i46;
                    this.d1 = size3;
                    this.F0 = size3;
                }
                if (!z14) {
                    int i47 = this.d1;
                    this.d1 = i47 + 1;
                    this.b1 = i47;
                }
            } else if (!z11) {
                int i48 = this.d1;
                this.d1 = i48 + 1;
                this.f1 = i48;
            }
            if (z15 || !org.telegram.messenger.t3.V(this.n) || !org.telegram.messenger.t3.N(this.n) || z14) {
                return;
            }
            int i49 = this.d1;
            int i50 = i49 + 1;
            this.d1 = i50;
            this.h1 = i49;
            if (!this.v1) {
                this.d1 = i49 + 2;
                this.j1 = i50;
                return;
            } else {
                this.i1 = i50;
                this.d1 = i49 + 3;
                this.j1 = i49 + 2;
                return;
            }
        }
        if (i10 == 2) {
            if (org.telegram.messenger.t3.T(this.n) && !org.telegram.messenger.t3.V(this.n) && !this.n1) {
                int i51 = this.d1;
                this.J0 = i51;
                this.d1 = i51 + 2;
                this.K0 = i51 + 1;
            }
            int i52 = this.e1;
            if (i52 == 0 && org.telegram.messenger.t3.w(3, this.n)) {
                int i53 = this.d1;
                this.d1 = i53 + 1;
                this.z0 = i53;
            }
            if (i52 == 0 && org.telegram.messenger.t3.y(3, this.n)) {
                int i54 = this.d1;
                this.d1 = i54 + 1;
                this.A0 = i54;
            }
            if (this.Q && !(z10 = this.R)) {
                if (z10) {
                    return;
                }
                if (i52 == 0) {
                    int i55 = this.d1;
                    this.d1 = i55 + 1;
                    this.g1 = i55;
                }
                int i56 = this.d1;
                this.d1 = i56 + 1;
                this.f1 = i56;
                return;
            }
            ArrayList arrayList2 = this.H;
            if (!arrayList2.isEmpty()) {
                int i57 = this.d1;
                int i58 = i57 + 1;
                this.d1 = i58;
                this.T0 = i57;
                this.U0 = i58;
                int size4 = arrayList2.size() + i58;
                this.d1 = size4;
                this.V0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.G;
            if (arrayList3.isEmpty()) {
                i3 = r1;
            } else {
                int i59 = this.d1;
                int i60 = i59 + 1;
                this.d1 = i60;
                this.W0 = i59;
                this.X0 = i60;
                int size5 = arrayList3.size() + i60;
                this.d1 = size5;
                this.Y0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i3 != 0) {
                    int i61 = this.d1;
                    this.d1 = i61 + 1;
                    this.Z0 = i61;
                }
                int i62 = this.d1;
                this.E0 = i62;
                int size6 = arrayList.size() + i62;
                this.d1 = size6;
                this.F0 = size6;
            }
            int i63 = this.d1;
            if (i63 != 0) {
                this.d1 = i63 + 1;
                this.b1 = i63;
            }
        }
    }

    public final void H0() {
        try {
            if (this.c == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
            if (x02 == this.E1 && x03 == this.F1) {
                return;
            }
            this.E1 = x02;
            this.F1 = x03;
            int i3 = 1;
            while (i3 < 4) {
                int childCount = i3 == 0 ? this.c.getChildCount() : i3 == 1 ? this.c.getHiddenChildCount() : i3 == 2 ? this.c.getCachedChildCount() : this.c.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i3 == 0 ? this.c.getChildAt(i10) : i3 == 1 ? this.c.V(i10) : i3 == 2 ? this.c.P(i10) : this.c.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).updateColors();
                    }
                }
                i3++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        return l0(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        boolean z10 = false;
        this.o1 = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i3 = this.e1;
        int i10 = this.O;
        int i11 = 3;
        if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752333, "ChannelPermissions"));
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752453, "ChannelBlacklist"));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752517, null));
        } else if (i10 == 2) {
            if (i3 == 0) {
                if (this.s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752289, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752377, "ChannelMembers"));
                }
            } else if (i3 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752528, "ChannelAddAdmin"));
            } else if (i3 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752452, "ChannelBlockUser"));
            } else if (i3 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752527, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 10));
        int i12 = 8;
        if (i3 != 0 || i10 == 2 || i10 == 0 || i10 == 3) {
            this.e = new mq(this, context);
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.C0 = new lg.w1(this, i11);
            this.f = b10;
            if (i10 == 0 && !this.R) {
                b10.setVisibility(8);
            }
            if (i10 == 3) {
                this.f.setSearchFieldHint(org.telegram.messenger.bd.M0(2131752307, "ChannelSearchException"));
            } else {
                this.f.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, "Search"));
            }
            if (!org.telegram.messenger.t3.T(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i10 == 3) {
                this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
            }
        } else if (i10 == 1 && org.telegram.messenger.t3.V(this.n) && org.telegram.messenger.t3.N(this.n)) {
            this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.C1 = izVar;
        izVar.setViewType(6);
        org.telegram.ui.Components.iz izVar2 = this.C1;
        izVar2.x = false;
        izVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.iz izVar3 = this.C1;
        int i13 = org.telegram.ui.ActionBar.k6.G8;
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        izVar3.e(i13, i14, i14);
        frameLayout2.addView(this.C1, b8.mf.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout2.addView(radialProgressView, b8.mf.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, frameLayout2, 1, null);
        this.b = zu0Var;
        zu0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.b.e.setText(org.telegram.messenger.bd.M0(2131745817, null));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        ci.j1 j1Var = new ci.j1(12, context, this);
        this.c = j1Var;
        j1Var.r1();
        this.c.setSectionsDrawBackground(true);
        ci.j1 j1Var2 = this.c;
        kg.f0 f0Var = new kg.f0(r2, this, z10);
        this.d = f0Var;
        j1Var2.setLayoutManager(f0Var);
        zp zpVar = new zp(this);
        zpVar.n(420L);
        zpVar.o(org.telegram.ui.Components.xq.h);
        zpVar.C = false;
        zpVar.m = false;
        this.c.setItemAnimator(zpVar);
        ci.j1 j1Var3 = this.c;
        j1Var3.X1 = true;
        j1Var3.Y1 = 0;
        iq iqVar = new iq(this, context);
        this.a = iqVar;
        j1Var3.setAdapter(iqVar);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        frameLayout.addView(this.c, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        this.c.setOnItemClickListener(new lp(this, i11));
        this.c.setOnItemLongClickListener(new lp(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new h3(this, i12));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        G0();
        this.c.setEmptyView(this.b);
        ci.j1 j1Var4 = this.c;
        j1Var4.X1 = false;
        j1Var4.Y1 = 0;
        if (this.n1) {
            this.f.F(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.T) {
            if (i3 == org.telegram.messenger.hs.y1 && ((Long) objArr[0]).longValue() == (-this.N)) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var == null || q4Var.getLastFragment() != this) {
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
            if (booleanValue && org.telegram.messenger.t3.T(this.n)) {
                return;
            }
            boolean z10 = this.r != null;
            this.r = chatFull;
            if (!z10) {
                int p02 = p0();
                this.q1 = p02;
                this.p1 = p02;
                int i11 = this.r.boosts_unrestrict;
                this.r1 = i11 > 0;
                this.s1 = i11;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
                long j10 = M0 == null ? 0L : M0.send_paid_messages_stars;
                boolean z11 = j10 > 0;
                this.y1 = z11;
                this.x1 = z11;
                if (j10 <= 0) {
                    j10 = 10;
                }
                long k10 = Utilities.k(j10, getMessagesController().I6, 1L);
                this.A1 = k10;
                this.z1 = k10;
            }
            org.telegram.messenger.g0.h3(new jp(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Components.ut0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V6));
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r5.w1) != r5.u1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l0(boolean z10) {
        int i3 = 1;
        if (!this.P) {
            if (org.telegram.messenger.t3.D(this.E).equals(this.y) && this.q1 == this.p1 && !t0() && (r0 = this.v1) == this.t1) {
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131743736, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                if (this.s) {
                    s1Var.U = org.telegram.messenger.bd.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    s1Var.U = org.telegram.messenger.bd.M0(2131749409, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, "ApplyTheme"), new lp(this, i3));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, "PassportDiscard"), new lp(this, 2));
                showDialog(s1Var);
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m0(TLObject tLObject, boolean z10, View view) {
        int i3;
        long j10;
        String str;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10;
        final long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j12;
        String str2;
        int i11;
        final nq nqVar;
        final int i12;
        String str3;
        int i13;
        boolean z12;
        boolean z13;
        String str4;
        int i14;
        String str5;
        int i15;
        if (tLObject != null && (i3 = this.e1) == 0) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                j12 = org.telegram.messenger.zi.C1(channelParticipant.peer);
                z11 = channelParticipant.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
                tL_chatAdminRights = channelParticipant.admin_rights;
                i10 = channelParticipant.date;
                str2 = channelParticipant.rank;
                j10 = 0;
                tL_chatBannedRights = tL_chatBannedRights2;
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j12 = chatParticipant.user_id;
                i10 = chatParticipant.date;
                z11 = org.telegram.messenger.t3.w(4, this.n);
                str2 = "";
                j10 = 0;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                z11 = false;
                tL_chatAdminRights = null;
                i10 = 0;
                j11 = 0;
                tL_chatBannedRights = null;
                if (j11 != j10 && j11 != getUserConfig().e()) {
                    boolean z14 = this.s;
                    i11 = this.O;
                    if (i11 == 2) {
                        String str6 = str;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                        final int i16 = 1;
                        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
                        if (i11 == 3 && org.telegram.messenger.t3.w(2, this.n)) {
                            String M0 = org.telegram.messenger.bd.M0(2131752414, null);
                            nqVar = this;
                            ai.z1 z1Var = new ai.z1(nqVar, j11, tL_chatBannedRights, str6, tLObject, 10);
                            final int i17 = 0;
                            H.c(R.drawable.msg_permissions, M0, z1Var, false);
                            H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131752420, "ChannelDeleteFromList"), new Runnable(nqVar) { // from class: org.telegram.ui.kp
                                public final /* synthetic */ nq b;

                                {
                                    this.b = nqVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            this.b.n0(j11);
                                            break;
                                        case 1:
                                            nq nqVar2 = this.b;
                                            long j13 = j11;
                                            nqVar2.n0(j13);
                                            nqVar2.getMessagesController().n(nqVar2.N, nqVar2.getMessagesController().a2(Long.valueOf(j13)), null, nqVar2, null);
                                            break;
                                        case 2:
                                            this.b.n0(j11);
                                            break;
                                        default:
                                            nq nqVar3 = this.b;
                                            org.telegram.messenger.hp messagesController = nqVar3.getMessagesController();
                                            long j14 = nqVar3.N;
                                            org.telegram.messenger.hp messagesController2 = nqVar3.getMessagesController();
                                            long j15 = j11;
                                            messagesController.P4(j14, messagesController2.a2(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !nqVar3.s, nqVar3, false, false, null, null, null);
                                            nqVar3.A0(j15);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            nqVar = this;
                            if (i11 == 0 && org.telegram.messenger.t3.w(2, nqVar.n)) {
                                if (org.telegram.messenger.t3.w(3, nqVar.n) && j11 > j10 && !org.telegram.messenger.t3.Y(nqVar.n)) {
                                    if (z14) {
                                        i13 = 2131752524;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i13 = 2131752523;
                                    }
                                    H.c(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(i13, str3), new Runnable(nqVar) { // from class: org.telegram.ui.kp
                                        public final /* synthetic */ nq b;

                                        {
                                            this.b = nqVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    this.b.n0(j11);
                                                    break;
                                                case 1:
                                                    nq nqVar2 = this.b;
                                                    long j13 = j11;
                                                    nqVar2.n0(j13);
                                                    nqVar2.getMessagesController().n(nqVar2.N, nqVar2.getMessagesController().a2(Long.valueOf(j13)), null, nqVar2, null);
                                                    break;
                                                case 2:
                                                    this.b.n0(j11);
                                                    break;
                                                default:
                                                    nq nqVar3 = this.b;
                                                    org.telegram.messenger.hp messagesController = nqVar3.getMessagesController();
                                                    long j14 = nqVar3.N;
                                                    org.telegram.messenger.hp messagesController2 = nqVar3.getMessagesController();
                                                    long j15 = j11;
                                                    messagesController.P4(j14, messagesController2.a2(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !nqVar3.s, nqVar3, false, false, null, null, null);
                                                    nqVar3.A0(j15);
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                final int i18 = 2;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131752420, "ChannelDeleteFromList"), new Runnable(nqVar) { // from class: org.telegram.ui.kp
                                    public final /* synthetic */ nq b;

                                    {
                                        this.b = nqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                this.b.n0(j11);
                                                break;
                                            case 1:
                                                nq nqVar2 = this.b;
                                                long j13 = j11;
                                                nqVar2.n0(j13);
                                                nqVar2.getMessagesController().n(nqVar2.N, nqVar2.getMessagesController().a2(Long.valueOf(j13)), null, nqVar2, null);
                                                break;
                                            case 2:
                                                this.b.n0(j11);
                                                break;
                                            default:
                                                nq nqVar3 = this.b;
                                                org.telegram.messenger.hp messagesController = nqVar3.getMessagesController();
                                                long j14 = nqVar3.N;
                                                org.telegram.messenger.hp messagesController2 = nqVar3.getMessagesController();
                                                long j15 = j11;
                                                messagesController.P4(j14, messagesController2.a2(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !nqVar3.s, nqVar3, false, false, null, null, null);
                                                nqVar3.A0(j15);
                                                break;
                                        }
                                    }
                                }, true);
                            } else if (i11 == 1 && org.telegram.messenger.t3.w(4, nqVar.n) && z11) {
                                if (nqVar.n.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                                    i12 = 3;
                                    H.c(R.drawable.msg_admins, org.telegram.messenger.bd.M0(2131751305, "EditAdminRights"), new ai.z1(nqVar, j11, tL_chatAdminRights2, str6, tLObject, 11), false);
                                } else {
                                    i12 = 3;
                                }
                                H.c(R.drawable.msg_remove, org.telegram.messenger.bd.M0(2131752313, "ChannelRemoveUserAdmin"), new Runnable(nqVar) { // from class: org.telegram.ui.kp
                                    public final /* synthetic */ nq b;

                                    {
                                        this.b = nqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                this.b.n0(j11);
                                                break;
                                            case 1:
                                                nq nqVar2 = this.b;
                                                long j13 = j11;
                                                nqVar2.n0(j13);
                                                nqVar2.getMessagesController().n(nqVar2.N, nqVar2.getMessagesController().a2(Long.valueOf(j13)), null, nqVar2, null);
                                                break;
                                            case 2:
                                                this.b.n0(j11);
                                                break;
                                            default:
                                                nq nqVar3 = this.b;
                                                org.telegram.messenger.hp messagesController = nqVar3.getMessagesController();
                                                long j14 = nqVar3.N;
                                                org.telegram.messenger.hp messagesController2 = nqVar3.getMessagesController();
                                                long j15 = j11;
                                                messagesController.P4(j14, messagesController2.a2(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !nqVar3.s, nqVar3, false, false, null, null, null);
                                                nqVar3.A0(j15);
                                                break;
                                        }
                                    }
                                }, true);
                            }
                        }
                        H.W(nqVar.c.U0(view, false));
                        H.S = org.telegram.messenger.hs.U2;
                        boolean z15 = H.x() > 0;
                        if (z10 || !z15) {
                            return z15;
                        }
                        H.Z();
                        return true;
                    }
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j11));
                    boolean z16 = org.telegram.messenger.t3.w(4, this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11);
                    boolean z17 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
                    boolean z18 = !(z17 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z11;
                    boolean z19 = z17 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                    boolean z20 = org.telegram.messenger.t3.w(2, this.n) && z18 && !z14 && org.telegram.messenger.t3.T(this.n) && !this.n.gigagroup;
                    if (i3 == 0) {
                        z16 &= !org.telegram.messenger.l10.x(a22);
                    }
                    if (z16) {
                        z12 = z20;
                    } else {
                        z12 = z20;
                        if (!org.telegram.messenger.t3.w(2, this.n) || !z18) {
                            z13 = false;
                            if (!z10 || !z13) {
                                return z13;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                            int i19 = i10;
                            boolean z21 = z16;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
                            boolean z22 = z12;
                            boolean z23 = z19;
                            rp rpVar = new rp(this, j11, i19, tLObject, tL_chatAdminRights3, tL_chatBannedRights3, str, z18);
                            long j13 = j11;
                            org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(this, view);
                            H2.W(this.c.U0(view, false));
                            if (z23) {
                                i14 = 2131751305;
                                str4 = null;
                            } else {
                                str4 = null;
                                i14 = 2131745557;
                            }
                            H2.l(R.drawable.msg_admins, org.telegram.messenger.bd.M0(i14, str4), new xg(rpVar, 12), z21);
                            H2.l(R.drawable.msg_permissions, org.telegram.messenger.bd.M0(2131752540, "ChangePermissions"), new o4.b1(this, tLObject, a22, rpVar, 18), z22);
                            boolean z24 = org.telegram.messenger.t3.w(2, this.n) && z18;
                            if (z14) {
                                str5 = "ChannelRemoveUser";
                                i15 = 2131752314;
                            } else {
                                str5 = "KickFromGroup";
                                i15 = 2131749063;
                            }
                            H2.m(R.drawable.msg_remove, new ai.r1(this, a22, j13, 19), org.telegram.messenger.bd.M0(i15, str5), z24, true);
                            H2.S = org.telegram.messenger.hs.U2;
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
                i11 = this.O;
                if (i11 == 2) {
                }
            }
        }
        return false;
    }

    public final void n0(long j10) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().j1(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().h1(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new c3.b(1), new c5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().j1(j10);
        tL_channels_editBanned.channel = getMessagesController().h1(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        return l0(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.hs.T);
        getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
        w0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        iq iqVar = this.a;
        if (iqVar != null) {
            iqVar.f();
        }
        org.telegram.ui.Components.zu0 zu0Var = this.b;
        if (zu0Var != null) {
            zu0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            H0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.n1) {
            this.f.getSearchField().requestFocus();
            org.telegram.messenger.g0.K3(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final int p0() {
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i3 = chatFull.slowmode_seconds;
        if (i3 == 5) {
            return 1;
        }
        if (i3 == 10) {
            return 2;
        }
        if (i3 == 30) {
            return 3;
        }
        if (i3 == 60) {
            return 4;
        }
        if (i3 == 300) {
            return 5;
        }
        if (i3 == 900) {
            return 6;
        }
        return i3 == 3600 ? 7 : 0;
    }

    public final int q0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i3 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i3 : Math.max(i3, arrayList.size());
    }

    public final boolean t0() {
        boolean z10 = this.r1 && v0();
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull != null) {
            int i3 = chatFull.boosts_unrestrict;
            int i10 = this.s1;
            if (i3 != i10 || ((z10 && i10 == 0) || (!z10 && i10 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean u0(int i3) {
        return i3 == this.V || i3 == this.W || i3 == this.X || i3 == this.Y || i3 == this.Z || i3 == this.a0 || i3 == this.k0 || i3 == this.b0 || i3 == this.c0 || i3 == this.d0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.Chat chat = this.n;
        if (!chat.megagroup || chat.gigagroup || !org.telegram.messenger.t3.y(13, chat)) {
            return false;
        }
        if (this.p1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.E;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void w0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.Q) {
            return;
        }
        int i3 = 0;
        this.J = false;
        this.I = false;
        boolean z10 = this.w;
        int i10 = this.O;
        a0.h hVar = this.L;
        ArrayList arrayList = this.G;
        a0.h hVar2 = this.M;
        ArrayList arrayList2 = this.H;
        a0.h hVar3 = this.K;
        ArrayList arrayList3 = this.F;
        if (z10 && i10 == 2) {
            this.Q = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            hVar3.b();
            hVar2.b();
            hVar.b();
            HashMap hashMap = org.telegram.messenger.g5.r(this.currentAccount).h0;
            ArrayList arrayList4 = org.telegram.messenger.g5.r(this.currentAccount).i0;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList4.get(i11);
                i11++;
                ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                int size2 = arrayList5.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList5.get(i12);
                    i12++;
                    arrayList3.add(getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                }
            }
            G0();
            iq iqVar = this.a;
            if (iqVar != null) {
                iqVar.f();
                return;
            }
            return;
        }
        if (org.telegram.messenger.t3.T(this.n)) {
            this.Q = true;
            org.telegram.ui.Components.zu0 zu0Var = this.b;
            if (zu0Var != null) {
                zu0Var.e(true, false);
            }
            iq iqVar2 = this.a;
            if (iqVar2 != null) {
                iqVar2.f();
            }
            ArrayList x02 = x0();
            ArrayList arrayList6 = new ArrayList();
            pp ppVar = new pp(this, x02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i13 = 0; i13 < x02.size(); i13++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) x02.get(i13), new cg.j0(arrayList6, i13, atomicInteger, x02, ppVar, 6)), this.classGuid);
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
        if (i10 == 1) {
            TLRPC.ChatFull chatFull2 = this.r;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i3 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.r.participants.participants.get(i3);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    hVar3.k(chatParticipant, chatParticipant.user_id);
                    i3++;
                }
            }
        } else if (i10 == 2 && (chatFull = this.r) != null && chatFull.participants != null) {
            long j10 = getUserConfig().n;
            int size4 = this.r.participants.participants.size();
            while (i3 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.r.participants.participants.get(i3);
                int i14 = this.e1;
                if (i14 == 0 || chatParticipant2.user_id != j10) {
                    if (i14 == 1) {
                        if (getContactsController().x(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            hVar2.k(chatParticipant2, chatParticipant2.user_id);
                        } else if (!org.telegram.messenger.l10.x(getMessagesController().a2(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    } else if (getContactsController().x(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        hVar2.k(chatParticipant2, chatParticipant2.user_id);
                    } else {
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(chatParticipant2.user_id));
                        if (a22 == null || !a22.bot) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        } else {
                            arrayList.add(chatParticipant2);
                            hVar.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    }
                }
                i3++;
            }
        }
        iq iqVar3 = this.a;
        if (iqVar3 != null) {
            iqVar3.f();
        }
        G0();
        iq iqVar4 = this.a;
        if (iqVar4 != null) {
            iqVar4.f();
        }
    }

    public final ArrayList x0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().h1(this.N);
        int i3 = this.O;
        if (i3 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i3 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i3 == 2) {
            TLRPC.ChatFull chatFull = this.r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.e1 == 1) {
                if (this.J) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(x0());
                }
            } else if (!this.J) {
                this.k1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.J = true;
                arrayList.addAll(x0());
            } else if (this.I) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.I = true;
                arrayList.addAll(x0());
            }
        } else if (i3 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.hs.e3;
        return arrayList;
    }

    public final void y0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i3, boolean z11) {
        ip ipVar = new ip(j10, this.N, tL_chatAdminRights, this.E, tL_chatBannedRights, str, i3, z10, tLObject == null, null);
        ipVar.Y0 = new wp(this, tLObject, j10, z11);
        presentFragment(ipVar, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if ((r0 && r15.w1) != r15.u1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        TLRPC.ChatFull chatFull;
        int i3 = 0;
        int i10 = this.O;
        if (i10 == 3) {
            TLRPC.Chat chat = this.n;
            if (chat.creator && !org.telegram.messenger.t3.T(chat) && ((this.p1 != this.q1 || this.y1) && this.r != null)) {
                org.telegram.messenger.hp.s1(this.currentAccount).T(getParentActivity(), this.N, this, new lp(this, i3), null);
                return;
            }
            if (!org.telegram.messenger.t3.D(this.E).equals(this.y)) {
                getMessagesController().H4(this.N, this.E, org.telegram.messenger.t3.T(this.n), this);
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
                if (M0 != null) {
                    M0.default_banned_rights = this.E;
                }
            }
            int i11 = this.p1;
            if (i11 != this.q1 && (chatFull = this.r) != null) {
                chatFull.slowmode_seconds = r0(i11);
                this.r.flags |= 131072;
                org.telegram.messenger.hp messagesController = getMessagesController();
                long j10 = this.N;
                int i12 = this.r.slowmode_seconds;
                messagesController.getClass();
                TLRPC.TL_channels_toggleSlowMode tL_channels_toggleSlowMode = new TLRPC.TL_channels_toggleSlowMode();
                tL_channels_toggleSlowMode.seconds = i12;
                tL_channels_toggleSlowMode.channel = messagesController.h1(j10);
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleSlowMode, new org.telegram.messenger.gj(messagesController, j10, 14));
            }
            boolean z10 = this.y1;
            if (z10 != this.x1 || (z10 && this.z1 != this.A1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().h1(this.N);
                updatepaidmessagesprice.send_paid_messages_stars = this.y1 ? this.A1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new ei.u5(17));
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.N));
                if (M02 != null) {
                    if (this.y1) {
                        M02.flags2 |= TLObject.FLAG_14;
                        M02.send_paid_messages_stars = this.A1;
                    } else {
                        M02.flags2 &= -16385;
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().Q3(M02, true);
                }
            }
            if (t0()) {
                boolean z11 = this.r1 && v0();
                if (z11 && this.s1 == 0) {
                    getMessagesController().D4(1, this.N);
                } else if (z11 || this.s1 == 0) {
                    getMessagesController().D4(this.s1, this.N);
                } else {
                    getMessagesController().D4(0, this.N);
                }
            }
        } else if (i10 == 1) {
            boolean z12 = this.v1;
            if (z12 == this.t1) {
            }
            org.telegram.messenger.hp messagesController2 = getMessagesController();
            long j11 = this.N;
            boolean z13 = this.v1;
            boolean z14 = z13 && this.w1;
            TLRPC.Chat M03 = messagesController2.M0(Long.valueOf(j11));
            if (M03 != null) {
                M03.signatures = z13;
                M03.signature_profiles = z14;
                messagesController2.Q3(M03, true);
            }
            TLRPC.TL_channels_toggleSignatures tL_channels_toggleSignatures = new TLRPC.TL_channels_toggleSignatures();
            tL_channels_toggleSignatures.channel = messagesController2.h1(j11);
            tL_channels_toggleSignatures.signatures_enabled = z13;
            tL_channels_toggleSignatures.profiles_enabled = z14;
            messagesController2.getConnectionsManager().sendRequest(tL_channels_toggleSignatures, new org.telegram.messenger.ij(messagesController2, 13), 64);
            messagesController2.getNotificationCenter().k(org.telegram.messenger.hs.E3, Long.valueOf(-j11));
        }
        finishFragment();
    }
}
