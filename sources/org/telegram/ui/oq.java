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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class oq extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int A0;
    public boolean A1;
    public int B0;
    public org.telegram.ui.Components.mz B1;
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
    public kq a;
    public int a0;
    public int a1;
    public org.telegram.ui.Components.av0 b;
    public int b0;
    public int b1;
    public bi.q1 c;
    public int c0;
    public int c1;
    public jg.i0 d;
    public int d0;
    public final int d1;
    public nq e;
    public int e0;
    public int e1;
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
    public boolean k1;
    public int l0;
    public hq l1;
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

    public oq(Bundle bundle) {
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
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
        this.n = M0;
        boolean z9 = false;
        if (M0 != null && (tL_chatBannedRights = M0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.D;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z10 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z10;
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
            boolean z11 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z11;
            boolean z12 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z12;
            boolean z13 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z13;
            boolean z14 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z14;
            boolean z15 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z15;
            boolean z16 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z16;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z10 && z16 && z15 && z14 && z13 && z12 && z11) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.y = org.telegram.messenger.t3.D(this.D);
        boolean Y = org.telegram.messenger.t3.Y(this.n);
        this.w = Y;
        if (org.telegram.messenger.t3.T(this.n) && !this.n.megagroup && !Y) {
            z9 = true;
        }
        this.s = z9;
        this.x = org.telegram.messenger.t3.c0(this.n);
        TLRPC.Chat chat = this.n;
        if (chat != null) {
            boolean z17 = chat.signatures;
            this.u1 = z17;
            this.s1 = z17;
            boolean z18 = chat.signature_profiles;
            this.v1 = z18;
            this.t1 = z18;
        }
    }

    public static /* synthetic */ void Z(oq oqVar, long j3) {
        if (j3 != 0) {
            oqVar.M = j3;
            oqVar.n = org.telegram.messenger.qp.s1(oqVar.currentAccount).M0(Long.valueOf(j3));
            oqVar.z0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(final oq oqVar, View view, int i7) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m10;
        TLObject E;
        long j3;
        String str;
        boolean z9;
        long C1;
        TLObject tLObject;
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObject2;
        int i10;
        boolean w10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i11 = oqVar.d1;
        a0.h hVar = oqVar.J;
        a0.h hVar2 = oqVar.L;
        boolean z11 = oqVar.s;
        int i12 = oqVar.N;
        final int i13 = 0;
        final int i14 = 1;
        boolean z12 = oqVar.c.getAdapter() == oqVar.a;
        if (i7 == oqVar.g1) {
            boolean z13 = !oqVar.u1;
            oqVar.u1 = z13;
            ((org.telegram.ui.Cells.r8) view).setChecked(z13);
            org.telegram.messenger.g0.b4(oqVar.c);
            iq B0 = oqVar.B0();
            oqVar.G0();
            oqVar.F0(B0);
            oqVar.a.g(oqVar.i1);
        } else if (i7 == oqVar.h1) {
            boolean z14 = !oqVar.v1;
            oqVar.v1 = z14;
            ((org.telegram.ui.Cells.r8) view).setChecked(z14);
            org.telegram.messenger.g0.b4(oqVar.c);
            iq B02 = oqVar.B0();
            oqVar.G0();
            oqVar.F0(B02);
            oqVar.a.g(oqVar.i1);
        } else if (i7 == oqVar.m0) {
            boolean z15 = !oqVar.x1;
            oqVar.x1 = z15;
            ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            org.telegram.messenger.g0.b4(oqVar.c);
            iq B03 = oqVar.B0();
            oqVar.G0();
            oqVar.F0(B03);
            oqVar.a.g(oqVar.m0);
        } else if (z12) {
            if (oqVar.u0(i7)) {
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (i7 == oqVar.U) {
                    oqVar.D.send_photos = !r15.send_photos;
                } else if (i7 == oqVar.V) {
                    oqVar.D.send_videos = !r14.send_videos;
                } else if (i7 == oqVar.W) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = oqVar.D;
                    boolean z16 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z16;
                    tL_chatBannedRights2.send_gifs = z16;
                    tL_chatBannedRights2.send_games = z16;
                    tL_chatBannedRights2.send_stickers = z16;
                } else if (i7 == oqVar.X) {
                    oqVar.D.send_audios = !r14.send_audios;
                } else if (i7 == oqVar.Y) {
                    oqVar.D.send_docs = !r14.send_docs;
                } else if (i7 == oqVar.Z) {
                    oqVar.D.send_voices = !r14.send_voices;
                } else if (i7 == oqVar.a0) {
                    oqVar.D.send_roundvideos = !r14.send_roundvideos;
                } else if (i7 == oqVar.b0) {
                    if (oqVar.D.send_plain && (m10 = oqVar.d.m(oqVar.S)) != null) {
                        org.telegram.messenger.g0.H3(m10);
                        org.telegram.messenger.p2.D.a();
                        return;
                    } else {
                        oqVar.D.embed_links = !r14.embed_links;
                    }
                } else if (i7 == oqVar.c0) {
                    oqVar.D.send_polls = !r14.send_polls;
                } else if (i7 == oqVar.j0) {
                    oqVar.D.send_reactions = !r14.send_reactions;
                }
                c2Var.c(!c2Var.b(), true);
                org.telegram.messenger.g0.b4(oqVar.c);
                iq B04 = oqVar.B0();
                oqVar.G0();
                oqVar.F0(B04);
            } else if (i7 == oqVar.P0) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                boolean z17 = !q8Var.d.h;
                oqVar.q1 = z17;
                q8Var.setChecked(z17);
                org.telegram.messenger.g0.b4(oqVar.c);
                iq B05 = oqVar.B0();
                oqVar.G0();
                oqVar.F0(B05);
            } else {
                if (i7 == oqVar.y0) {
                    if (i12 == 0 || i12 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", oqVar.M);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i12 == 0 ? 2 : 3);
                        oq oqVar2 = new oq(bundle);
                        oqVar2.C0(oqVar.r);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = oqVar.D;
                        if (tL_chatBannedRights3 != null) {
                            oqVar2.D = tL_chatBannedRights3;
                        }
                        oqVar2.l1 = new cq(oqVar);
                        oqVar.presentFragment(oqVar2);
                        return;
                    }
                    if (i12 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", oqVar.M);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        oq oqVar3 = new oq(bundle2);
                        oqVar3.l1 = new dq(oqVar);
                        oqVar3.C0(oqVar.r);
                        oqVar.presentFragment(oqVar3);
                        return;
                    }
                    if (i12 == 2) {
                        Bundle k10 = a8.p0.k("addToGroup", true);
                        k10.putLong(z11 ? "channelId" : "chatId", oqVar.n.id);
                        w40 w40Var = new w40(k10);
                        w40Var.I = oqVar.r;
                        if (hVar2 != null && hVar2.m() != 0) {
                            hVar = hVar2;
                        }
                        w40Var.J = hVar;
                        w40Var.y = new fq(oqVar, w40Var);
                        oqVar.presentFragment(w40Var);
                        return;
                    }
                    return;
                }
                if (i7 == oqVar.u0) {
                    oqVar.presentFragment(new mb(oqVar.n));
                    return;
                }
                if (i7 == oqVar.w0) {
                    final org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    TLRPC.ChatFull chatFull3 = oqVar.r;
                    if (chatFull3 != null && !chatFull3.antispam && oqVar.q0() < oqVar.getMessagesController().f5) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.id.G(oqVar.getMessagesController().f5, "ChannelAntiSpamForbidden", new Object[0]), org.telegram.ui.Components.hc.a0(oqVar), R.raw.msg_antispam, 36);
                        return;
                    }
                    if (oqVar.r == null || !org.telegram.messenger.t3.y(13, oqVar.n) || oqVar.v0) {
                        return;
                    }
                    oqVar.v0 = true;
                    final boolean z18 = oqVar.r.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = oqVar.getMessagesController().h1(oqVar.M);
                    TLRPC.ChatFull chatFull4 = oqVar.r;
                    boolean z19 = !chatFull4.antispam;
                    chatFull4.antispam = z19;
                    tL_channels_toggleAntiSpam.enabled = z19;
                    m8Var.setChecked(z19);
                    m8Var.getCheckBox().setIcon((org.telegram.messenger.t3.y(13, oqVar.n) && ((chatFull2 = oqVar.r) == null || chatFull2.antispam || oqVar.q0() >= oqVar.getMessagesController().f5)) ? 0 : R.drawable.permission_locked);
                    oqVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(oqVar) { // from class: org.telegram.ui.op
                        public final /* synthetic */ oq b;

                        {
                            this.b = oqVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    final oq oqVar4 = this.b;
                                    if (tLObject3 != null) {
                                        oqVar4.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        oqVar4.getMessagesController().R3(oqVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i15 = 0;
                                        final org.telegram.ui.Cells.m8 m8Var2 = m8Var;
                                        final boolean z20 = z18;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i16 = i15;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z21 = z20;
                                                org.telegram.ui.Cells.m8 m8Var3 = m8Var2;
                                                oq oqVar5 = oqVar4;
                                                switch (i16) {
                                                    case 0:
                                                        if (oqVar5.getParentActivity() != null) {
                                                            oqVar5.r.antispam = z21;
                                                            m8Var3.setChecked(z21);
                                                            Switch checkBox = m8Var3.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, oqVar5.n) && ((chatFull5 = oqVar5.r) == null || !chatFull5.antispam || oqVar5.q0() >= oqVar5.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (oqVar5.getParentActivity() != null) {
                                                            oqVar5.r.participants_hidden = z21;
                                                            m8Var3.setChecked(z21);
                                                            Switch checkBox2 = m8Var3.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, oqVar5.n) && ((chatFull6 = oqVar5.r) == null || !chatFull6.participants_hidden || oqVar5.q0() >= oqVar5.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar5), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    oqVar4.v0 = false;
                                    break;
                                default:
                                    final oq oqVar5 = this.b;
                                    if (tLObject3 != null) {
                                        oqVar5.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        oqVar5.getMessagesController().R3(oqVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 1;
                                        final org.telegram.ui.Cells.m8 m8Var3 = m8Var;
                                        final boolean z21 = z18;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull5;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i16;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z212 = z21;
                                                org.telegram.ui.Cells.m8 m8Var32 = m8Var3;
                                                oq oqVar52 = oqVar5;
                                                switch (i162) {
                                                    case 0:
                                                        if (oqVar52.getParentActivity() != null) {
                                                            oqVar52.r.antispam = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, oqVar52.n) && ((chatFull5 = oqVar52.r) == null || !chatFull5.antispam || oqVar52.q0() >= oqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (oqVar52.getParentActivity() != null) {
                                                            oqVar52.r.participants_hidden = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox2 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, oqVar52.n) && ((chatFull6 = oqVar52.r) == null || !chatFull6.participants_hidden || oqVar52.q0() >= oqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    oqVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i7 == oqVar.I0) {
                    final org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                    if (oqVar.q0() < oqVar.getMessagesController().g5) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.id.G(oqVar.getMessagesController().g5, "ChannelHiddenMembersForbidden", new Object[0]), org.telegram.ui.Components.hc.a0(oqVar), R.raw.contacts_sync_off, 36);
                        return;
                    }
                    if (oqVar.r == null || !org.telegram.messenger.t3.y(2, oqVar.n) || oqVar.H0) {
                        return;
                    }
                    oqVar.H0 = true;
                    final boolean z20 = oqVar.r.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = oqVar.getMessagesController().h1(oqVar.M);
                    TLRPC.ChatFull chatFull5 = oqVar.r;
                    boolean z21 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z21;
                    tL_channels_toggleParticipantsHidden.enabled = z21;
                    m8Var2.setChecked(z21);
                    Switch checkBox = m8Var2.getCheckBox();
                    if (!org.telegram.messenger.t3.y(2, oqVar.n) || ((chatFull = oqVar.r) != null && !chatFull.participants_hidden && oqVar.q0() < oqVar.getMessagesController().g5)) {
                        i13 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i13);
                    oqVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(oqVar) { // from class: org.telegram.ui.op
                        public final /* synthetic */ oq b;

                        {
                            this.b = oqVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final oq oqVar4 = this.b;
                                    if (tLObject3 != null) {
                                        oqVar4.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        oqVar4.getMessagesController().R3(oqVar4.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i15 = 0;
                                        final org.telegram.ui.Cells.m8 m8Var22 = m8Var2;
                                        final boolean z202 = z20;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i15;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z212 = z202;
                                                org.telegram.ui.Cells.m8 m8Var32 = m8Var22;
                                                oq oqVar52 = oqVar4;
                                                switch (i162) {
                                                    case 0:
                                                        if (oqVar52.getParentActivity() != null) {
                                                            oqVar52.r.antispam = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox2 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, oqVar52.n) && ((chatFull52 = oqVar52.r) == null || !chatFull52.antispam || oqVar52.q0() >= oqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (oqVar52.getParentActivity() != null) {
                                                            oqVar52.r.participants_hidden = z212;
                                                            m8Var32.setChecked(z212);
                                                            Switch checkBox22 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, oqVar52.n) && ((chatFull6 = oqVar52.r) == null || !chatFull6.participants_hidden || oqVar52.q0() >= oqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox22.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    oqVar4.v0 = false;
                                    break;
                                default:
                                    final oq oqVar5 = this.b;
                                    if (tLObject3 != null) {
                                        oqVar5.getMessagesController().O3((TLRPC.Updates) tLObject3, false);
                                        oqVar5.getMessagesController().R3(oqVar5.r);
                                    }
                                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                        final int i16 = 1;
                                        final org.telegram.ui.Cells.m8 m8Var3 = m8Var2;
                                        final boolean z212 = z20;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TLRPC.ChatFull chatFull52;
                                                TLRPC.ChatFull chatFull6;
                                                int i162 = i16;
                                                int i17 = R.drawable.permission_locked;
                                                boolean z2122 = z212;
                                                org.telegram.ui.Cells.m8 m8Var32 = m8Var3;
                                                oq oqVar52 = oqVar5;
                                                switch (i162) {
                                                    case 0:
                                                        if (oqVar52.getParentActivity() != null) {
                                                            oqVar52.r.antispam = z2122;
                                                            m8Var32.setChecked(z2122);
                                                            Switch checkBox2 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(13, oqVar52.n) && ((chatFull52 = oqVar52.r) == null || !chatFull52.antispam || oqVar52.q0() >= oqVar52.getMessagesController().f5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox2.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (oqVar52.getParentActivity() != null) {
                                                            oqVar52.r.participants_hidden = z2122;
                                                            m8Var32.setChecked(z2122);
                                                            Switch checkBox22 = m8Var32.getCheckBox();
                                                            if (org.telegram.messenger.t3.y(2, oqVar52.n) && ((chatFull6 = oqVar52.r) == null || !chatFull6.participants_hidden || oqVar52.q0() >= oqVar52.getMessagesController().g5)) {
                                                                i17 = 0;
                                                            }
                                                            checkBox22.setIcon(i17);
                                                            org.telegram.messenger.k5.o("UnknownError", 2131743882, org.telegram.ui.Components.hc.a0(oqVar52), R.raw.error, 36);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    oqVar5.H0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i7 == oqVar.K0) {
                    if (oqVar.n == null) {
                        return;
                    }
                    org.telegram.ui.Cells.m8 m8Var3 = (org.telegram.ui.Cells.m8) view;
                    boolean d = m8Var3.d();
                    m8Var3.setChecked(!m8Var3.d());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = org.telegram.messenger.qp.l1(oqVar.n);
                    TLRPC.Chat chat = oqVar.n;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = oqVar.n.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !m8Var3.d();
                    oqVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new d3.b(i14), new ai.u0(oqVar, m8Var3, d, i14));
                } else {
                    if (i7 == oqVar.A0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", oqVar.M);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        oq oqVar4 = new oq(bundle3);
                        oqVar4.C0(oqVar.r);
                        oqVar.presentFragment(oqVar4);
                        return;
                    }
                    if (i7 == oqVar.s0) {
                        oqVar.showDialog(new gq(oqVar, oqVar.getParentActivity(), oqVar));
                    } else {
                        if (i7 == oqVar.z0) {
                            if (oqVar.r != null) {
                                cf0 cf0Var = new cf0(oqVar.M, 0, 0L);
                                TLRPC.ChatFull chatFull6 = oqVar.r;
                                cf0Var.m0(chatFull6, chatFull6.exported_invite);
                                oqVar.presentFragment(cf0Var);
                                return;
                            }
                            return;
                        }
                        if ((i7 > oqVar.R && i7 <= Math.max(oqVar.k0, oqVar.f0)) || i7 == oqVar.l0) {
                            org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                            boolean isEnabled = q8Var2.isEnabled();
                            Switch r42 = q8Var2.d;
                            if (isEnabled) {
                                if (r42.F != null) {
                                    if (org.telegram.messenger.t3.t0(oqVar.n) && (i7 == oqVar.h0 || i7 == oqVar.f0)) {
                                        org.telegram.messenger.k5.p(null, 2131751286, org.telegram.ui.Components.hc.a0(oqVar), null);
                                        return;
                                    } else if (org.telegram.messenger.t3.Z(oqVar.currentAccount, oqVar.M) && (i7 == oqVar.h0 || i7 == oqVar.f0)) {
                                        org.telegram.messenger.k5.p(null, 2131751287, org.telegram.ui.Components.hc.a0(oqVar), null);
                                        return;
                                    } else {
                                        org.telegram.messenger.k5.p("EditCantEditPermissions", 2131751288, org.telegram.ui.Components.hc.a0(oqVar), null);
                                        return;
                                    }
                                }
                                if (i7 == oqVar.T) {
                                    iq B06 = oqVar.B0();
                                    oqVar.k1 = !oqVar.k1;
                                    org.telegram.messenger.g0.b4(oqVar.c);
                                    oqVar.F0(B06);
                                    return;
                                }
                                q8Var2.setChecked(!r42.h);
                                if (i7 == oqVar.f0) {
                                    oqVar.D.change_info = !r0.change_info;
                                    return;
                                }
                                if (i7 == oqVar.l0) {
                                    oqVar.D.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i7 == oqVar.g0) {
                                    oqVar.D.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i7 == oqVar.k0) {
                                    oqVar.D.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i7 == oqVar.h0) {
                                    oqVar.D.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i7 == oqVar.i0) {
                                    oqVar.D.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i7 == oqVar.S) {
                                    oqVar.D.send_plain = !r1.send_plain;
                                    int i15 = oqVar.b0;
                                    if (i15 >= 0) {
                                        oqVar.a.g(i15);
                                    }
                                    int i16 = oqVar.T;
                                    if (i16 >= 0) {
                                        oqVar.a.g(i16);
                                    }
                                    iq B07 = oqVar.B0();
                                    oqVar.G0();
                                    oqVar.F0(B07);
                                    return;
                                }
                                if (i7 == oqVar.T) {
                                    iq B08 = oqVar.B0();
                                    oqVar.k1 = !oqVar.k1;
                                    org.telegram.messenger.g0.b4(oqVar.c);
                                    oqVar.F0(B08);
                                    return;
                                }
                                if (i7 == oqVar.d0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = oqVar.D;
                                    boolean z22 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z22;
                                    tL_chatBannedRights5.send_gifs = z22;
                                    tL_chatBannedRights5.send_games = z22;
                                    tL_chatBannedRights5.send_stickers = z22;
                                    return;
                                }
                                if (i7 == oqVar.e0) {
                                    oqVar.D.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i7 == oqVar.c0) {
                                        oqVar.D.send_polls = !r0.send_polls;
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
        if (z12) {
            E = oqVar.a.E(i7);
            if (E instanceof TLRPC.User) {
                j3 = ((TLRPC.User) E).id;
                z9 = true;
            } else {
                if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    C1 = org.telegram.messenger.ij.C1(channelParticipant.peer);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                    String str2 = channelParticipant.rank;
                    boolean z23 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
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
                        if (!z11) {
                            tL_chatAdminRights3.manage_call = true;
                        }
                    }
                    boolean z24 = z23;
                    tLObject = E;
                    z10 = z11;
                    tL_chatBannedRights = tL_chatBannedRights6;
                    tL_chatAdminRights = tL_chatAdminRights3;
                    z9 = z24;
                    str = str2;
                } else if (E instanceof TLRPC.ChatParticipant) {
                    long j10 = ((TLRPC.ChatParticipant) E).user_id;
                    z9 = oqVar.n.creator;
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
                        if (!z11) {
                            tL_chatAdminRights2.manage_call = true;
                        }
                    } else {
                        tL_chatAdminRights2 = null;
                    }
                    str = "";
                    tLObject = E;
                    z10 = z11;
                    tL_chatAdminRights = tL_chatAdminRights2;
                    tL_chatBannedRights = null;
                    C1 = j10;
                } else {
                    tLObject = E;
                    z10 = z11;
                    str = "";
                    tL_chatAdminRights = null;
                    tL_chatBannedRights = null;
                    z9 = false;
                    C1 = 0;
                }
                if (C1 != 0) {
                    return;
                }
                if (i11 != 0) {
                    if (i11 != 3 && i11 != 1) {
                        if (org.telegram.messenger.t3.T(oqVar.n)) {
                            oqVar.getMessagesController().f0(oqVar.M, oqVar.getMessagesController().a2(Long.valueOf(C1)));
                            hq hqVar = oqVar.l1;
                            if (hqVar != null) {
                                hqVar.d(C1);
                            }
                            oqVar.finishFragment();
                            return;
                        }
                        return;
                    }
                    if (i11 == 1 || !z9 || (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin))) {
                        oqVar.y0(C1, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z9, i11 == 1 ? 0 : 1, i11 == 1 || i11 == 3);
                        return;
                    }
                    TLRPC.User a22 = oqVar.getMessagesController().a2(Long.valueOf(C1));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oqVar.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(R.string.AppName, "AppName");
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.a0("AdminWillBeRemoved", null, 2131754350, org.telegram.messenger.t10.p(a22));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, "OK"), new pp(oqVar, a22, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z9));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                    oqVar.showDialog(u1Var);
                    return;
                }
                long j11 = C1;
                if (i12 == 1) {
                    w10 = j11 != oqVar.getUserConfig().e() && (oqVar.n.creator || z9);
                } else {
                    if (i12 == 0 || i12 == 3) {
                        i10 = 2;
                        w10 = org.telegram.messenger.t3.w(2, oqVar.n);
                        if (i12 != 0 || ((i12 != 1 && z10) || (i12 == i10 && i11 == 0))) {
                            if (j11 != oqVar.getUserConfig().e()) {
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            if (C1 > 0) {
                                bundle4.putLong("user_id", j11);
                            } else {
                                bundle4.putLong("chat_id", -j11);
                            }
                            oqVar.presentFragment(new ProfileActivity(bundle4, null));
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
                        kp kpVar = new kp(j11, oqVar.M, tL_chatAdminRights, oqVar.D, tL_chatBannedRights, str, i12 == 1 ? 0 : 1, w10, tLObject == null, null);
                        kpVar.X0 = new up(oqVar, tLObject);
                        oqVar.presentFragment(kpVar);
                        return;
                    }
                    w10 = false;
                }
                i10 = 2;
                if (i12 != 0) {
                }
                if (j11 != oqVar.getUserConfig().e()) {
                }
            }
        } else {
            E = oqVar.e.E(i7);
            if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                oqVar.getMessagesController().X3(user, false, false);
                long j12 = user.id;
                int i17 = 0;
                while (true) {
                    if (i17 >= 3) {
                        tLObject2 = null;
                        break;
                    }
                    tLObject2 = (TLObject) (i17 == 0 ? hVar2 : i17 == 1 ? oqVar.K : hVar).f(j12);
                    if (tLObject2 != null) {
                        break;
                    } else {
                        i17++;
                    }
                }
                E = tLObject2;
                j3 = j12;
            } else if ((E instanceof TLRPC.ChannelParticipant) || (E instanceof TLRPC.ChatParticipant)) {
                j3 = 0;
            } else {
                j3 = 0;
                E = null;
            }
            if (E instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) E;
                C1 = org.telegram.messenger.ij.C1(channelParticipant2.peer);
                boolean z25 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                str = channelParticipant2.rank;
                tLObject = E;
                z10 = z11;
                tL_chatBannedRights = tL_chatBannedRights7;
                z9 = z25;
                tL_chatAdminRights = tL_chatAdminRights4;
                if (C1 != 0) {
                }
            } else if (E instanceof TLRPC.ChatParticipant) {
                j3 = ((TLRPC.ChatParticipant) E).user_id;
                z9 = oqVar.n.creator;
            } else {
                if (E != null) {
                    str = "";
                    z9 = false;
                    C1 = j3;
                    tL_chatAdminRights = null;
                    tLObject = E;
                    z10 = z11;
                    tL_chatBannedRights = null;
                    if (C1 != 0) {
                    }
                }
                z9 = true;
            }
        }
        str = "";
        C1 = j3;
        tL_chatAdminRights = null;
        tLObject = E;
        z10 = z11;
        tL_chatBannedRights = null;
        if (C1 != 0) {
        }
    }

    public static void b0(oq oqVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i7 = 0;
        while (i7 < 3) {
            TLObject tLObject = (TLObject) (i7 == 0 ? oqVar.L : i7 == 1 ? oqVar.K : oqVar.J).f(org.telegram.messenger.ij.C1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i7++;
        }
    }

    public static void h0(oq oqVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z9;
        boolean z10;
        a0.h hVar2 = oqVar.J;
        ArrayList arrayList2 = oqVar.E;
        UndoView undoView = oqVar.h;
        long j3 = -oqVar.M;
        boolean z11 = oqVar.s;
        undoView.m(j3, user, z11 ? 9 : 10);
        boolean z12 = false;
        oqVar.n.creator = false;
        int i7 = 0;
        boolean z13 = false;
        while (i7 < 3) {
            boolean z14 = true;
            if (i7 == 0) {
                hVar = oqVar.L;
                arrayList = oqVar.G;
            } else if (i7 == 1) {
                hVar = oqVar.K;
                arrayList = oqVar.F;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j10 = user.id;
                tL_peerUser.user_id = j10;
                hVar.k(tL_channelParticipantCreator, j10);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z13 = true;
                z9 = true;
            } else {
                z9 = z12;
            }
            long e10 = oqVar.getUserConfig().e();
            TLObject tLObject2 = (TLObject) hVar.f(e10);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e10;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e10;
                tL_channelParticipantAdmin.promoted_by = e10;
                z10 = z13;
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
                if (!z11) {
                    tL_chatAdminRights.manage_call = true;
                }
                hVar.k(tL_channelParticipantAdmin, e10);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z10 = z13;
                z14 = z9;
            }
            if (z14) {
                Collections.sort(arrayList, new oe(5));
            }
            i7++;
            z13 = z10;
            z12 = false;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j11 = user.id;
            tL_peerUser3.user_id = j11;
            hVar2.k(tL_channelParticipantCreator2, j11);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new oe(4));
            oqVar.G0();
        }
        oqVar.a.f();
        hq hqVar = oqVar.l1;
        if (hqVar != null) {
            hqVar.a(user);
        }
    }

    public static int o0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int r0(int i7) {
        if (i7 == 1) {
            return 5;
        }
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 3) {
            return 30;
        }
        if (i7 == 4) {
            return 60;
        }
        if (i7 == 5) {
            return org.telegram.messenger.qs.X4;
        }
        if (i7 == 6) {
            return 900;
        }
        return i7 == 7 ? 3600 : 0;
    }

    public static int s0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i7 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i7++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i7++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i7++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i7++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i7++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i7++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i7++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i7++;
        }
        return !tL_chatBannedRights.send_reactions ? i7 + 1 : i7;
    }

    public final void A0(long j3) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        iq B0 = B0();
        boolean z9 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                hVar = this.L;
                arrayList = this.G;
            } else if (i7 == 1) {
                hVar = this.K;
                arrayList = this.F;
            } else {
                hVar = this.J;
                arrayList = this.E;
            }
            TLObject tLObject = (TLObject) hVar.f(j3);
            if (tLObject != null) {
                hVar.l(j3);
                arrayList.remove(tLObject);
                if (this.N == 0 && (chatFull = this.r) != null) {
                    chatFull.kicked_count--;
                }
                z9 = true;
            }
        }
        if (z9) {
            F0(B0);
        }
        v4.g0 adapter = this.c.getAdapter();
        nq nqVar = this.e;
        if (adapter == nqVar) {
            jg.z1 z1Var = nqVar.h;
            Object f10 = z1Var.f.f(j3);
            if (f10 != null) {
                z1Var.e.remove(f10);
            }
            Object f11 = z1Var.h.f(j3);
            if (f11 != null) {
                z1Var.g.remove(f11);
            }
            Object f12 = nqVar.e.f(j3);
            if (f12 != null) {
                nqVar.d.remove(f12);
            }
            nqVar.f();
        }
    }

    public final iq B0() {
        iq iqVar = new iq(this);
        iqVar.b = this.c1;
        iqVar.i = this.W0;
        iqVar.j = this.X0;
        iqVar.l.clear();
        iqVar.l.addAll(this.F);
        iqVar.h = this.U0;
        iqVar.g = this.T0;
        iqVar.m.clear();
        iqVar.m.addAll(this.G);
        iqVar.e = this.D0;
        iqVar.f = this.E0;
        iqVar.k.clear();
        iqVar.k.addAll(this.E);
        iqVar.f(iqVar.c);
        return iqVar;
    }

    public final void C0(TLRPC.ChatFull chatFull) {
        this.r = chatFull;
        if (chatFull != null) {
            int p02 = p0();
            this.p1 = p02;
            this.o1 = p02;
            int i7 = this.r.boosts_unrestrict;
            this.q1 = i7 > 0;
            this.r1 = i7;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
            long j3 = M0 == null ? 0L : M0.send_paid_messages_stars;
            boolean z9 = j3 > 0;
            this.x1 = z9;
            this.w1 = z9;
            if (j3 <= 0) {
                j3 = 10;
            }
            long k10 = Utilities.k(j3, getMessagesController().I6, 1L);
            this.z1 = k10;
            this.y1 = k10;
        }
    }

    public final void D0(int i7) {
        if (this.isPaused || !this.A1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.Q) {
            return;
        }
        View view = null;
        for (int i10 = 0; i10 < this.c.getChildCount(); i10++) {
            View childAt = this.c.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Components.mz) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i7--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new vp(this, (org.telegram.ui.Components.mz) view, i7, 0));
    }

    public final void E0(ArrayList arrayList) {
        Collections.sort(arrayList, new sp(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void F0(iq iqVar) {
        View view;
        if (this.a == null) {
            G0();
            return;
        }
        G0();
        iqVar.f(iqVar.d);
        v4.o.c(iqVar, true).c(this.a);
        bi.q1 q1Var = this.c;
        if (q1Var == null || this.d == null || q1Var.getChildCount() <= 0) {
            return;
        }
        int i7 = 0;
        int i10 = -1;
        while (true) {
            if (i7 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            i10 = RecyclerView.R(this.c.getChildAt(i7));
            if (i10 != -1) {
                view = this.c.getChildAt(i7);
                break;
            }
            i7++;
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
        boolean z9;
        boolean z10;
        TLRPC.ChatFull chatFull;
        boolean z11;
        TLRPC.ChatFull chatFull2;
        boolean z12;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
        this.n = M0;
        if (M0 == null) {
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
        boolean z13 = this.w;
        int i7 = 1;
        int i10 = this.N;
        if (i10 == 3) {
            int i11 = this.c1;
            int i12 = i11 + 1;
            this.c1 = i12;
            this.R = i11;
            if (!z13) {
                this.S = i12;
                int i13 = i11 + 3;
                this.c1 = i13;
                this.T = i11 + 2;
                if (this.k1) {
                    this.U = i13;
                    this.V = i11 + 4;
                    this.W = i11 + 5;
                    this.X = i11 + 6;
                    this.Y = i11 + 7;
                    this.Z = i11 + 8;
                    this.a0 = i11 + 9;
                    this.b0 = i11 + 10;
                    this.c0 = i11 + 11;
                    this.c1 = i11 + 13;
                    this.j0 = i11 + 12;
                }
                int i14 = this.c1;
                this.g0 = i14;
                this.h0 = i14 + 1;
                this.c1 = i14 + 3;
                this.i0 = i14 + 2;
            }
            int i15 = this.c1;
            int i16 = i15 + 1;
            this.c1 = i16;
            this.f0 = i15;
            if (z13) {
                this.c1 = i15 + 2;
                this.l0 = i16;
            } else if (this.x) {
                this.c1 = i15 + 2;
                this.k0 = i16;
            }
            if (org.telegram.messenger.t3.T(this.n)) {
                TLRPC.Chat chat2 = this.n;
                if (chat2.creator && chat2.megagroup && !chat2.gigagroup && !z13) {
                    int i17 = chat2.participants_count;
                    TLRPC.ChatFull chatFull4 = this.r;
                    if (Math.max(i17, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().X2 - 1000) {
                        int i18 = this.c1;
                        this.G0 = i18;
                        this.r0 = i18 + 1;
                        this.s0 = i18 + 2;
                        this.c1 = i18 + 4;
                        this.t0 = i18 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.r;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z13 && org.telegram.messenger.t3.w(2, this.n) && (org.telegram.messenger.t3.T(this.n) || ((chat = this.n) != null && chat.creator))) {
                if (this.G0 == -1) {
                    int i19 = this.c1;
                    this.c1 = i19 + 1;
                    this.G0 = i19;
                }
                int i20 = this.c1;
                this.m0 = i20;
                int i21 = i20 + 2;
                this.c1 = i21;
                this.n0 = i20 + 1;
                if (this.x1) {
                    this.o0 = i21;
                    this.p0 = i20 + 3;
                    this.c1 = i20 + 5;
                    this.q0 = i20 + 4;
                }
            }
            if (!z13) {
                if (org.telegram.messenger.t3.T(this.n) || !this.n.creator) {
                    TLRPC.Chat chat3 = this.n;
                    if (chat3.megagroup) {
                        if (!chat3.gigagroup) {
                        }
                    }
                }
                if (this.G0 == -1) {
                    int i22 = this.c1;
                    this.c1 = i22 + 1;
                    this.G0 = i22;
                }
                int i23 = this.c1;
                this.M0 = i23;
                this.N0 = i23 + 1;
                this.c1 = i23 + 3;
                this.O0 = i23 + 2;
            }
            if (v0() && !z13) {
                if (this.G0 == -1) {
                    int i24 = this.c1;
                    this.c1 = i24 + 1;
                    this.G0 = i24;
                }
                int i25 = this.c1;
                int i26 = i25 + 1;
                this.c1 = i26;
                this.P0 = i25;
                if (this.q1) {
                    this.c1 = i25 + 2;
                    this.R0 = i26;
                }
                int i27 = this.c1;
                this.c1 = i27 + 1;
                this.Q0 = i27;
            }
            if (org.telegram.messenger.t3.T(this.n) && !z13) {
                if (this.G0 == -1) {
                    int i28 = this.c1;
                    this.c1 = i28 + 1;
                    this.G0 = i28;
                }
                int i29 = this.c1;
                this.c1 = i29 + 1;
                this.A0 = i29;
            }
            if ((this.O0 == -1 && this.r0 == -1) || this.A0 != -1) {
                int i30 = this.c1;
                this.c1 = i30 + 1;
                this.F0 = i30;
            }
            if (org.telegram.messenger.t3.w(2, this.n) && !z13 && q0() > 1 && (org.telegram.messenger.t3.T(this.n) || this.n.creator)) {
                int i31 = this.c1;
                this.c1 = i31 + 1;
                this.y0 = i31;
            }
            if (this.P && !(z12 = this.Q)) {
                if (z12 || (chatFull3 = this.r) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i32 = this.c1;
                this.c1 = i32 + 1;
                this.e1 = i32;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i33 = this.c1;
                this.D0 = i33;
                int size = arrayList.size() + i33;
                this.c1 = size;
                this.E0 = size;
            }
            if (this.y0 == -1 && this.D0 == -1) {
                return;
            }
            int i34 = this.c1;
            this.c1 = i34 + 1;
            this.B0 = i34;
            return;
        }
        if (i10 == 0) {
            if (org.telegram.messenger.t3.w(2, this.n)) {
                int i35 = this.c1;
                this.c1 = i35 + 1;
                this.y0 = i35;
                if (!arrayList.isEmpty() || (this.P && !this.Q && (chatFull2 = this.r) != null && chatFull2.kicked_count > 0)) {
                    int i36 = this.c1;
                    this.c1 = i36 + 1;
                    this.a1 = i36;
                }
            }
            if (this.P && !(z11 = this.Q)) {
                if (z11) {
                    return;
                }
                int i37 = this.c1;
                this.C0 = i37;
                this.c1 = i37 + 2;
                this.e1 = i37 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i38 = this.c1;
                int i39 = i38 + 1;
                this.c1 = i39;
                this.C0 = i38;
                this.D0 = i39;
                int size2 = arrayList.size() + i39;
                this.c1 = size2;
                this.E0 = size2;
            }
            if (this.D0 == -1) {
                int i40 = this.c1;
                this.c1 = i40 + 1;
                this.b1 = i40;
                return;
            } else if (this.a1 == -1) {
                int i41 = this.c1;
                this.c1 = i41 + 1;
                this.a1 = i41;
                return;
            } else {
                int i42 = this.c1;
                this.c1 = i42 + 1;
                this.B0 = i42;
                return;
            }
        }
        if (i10 == 1) {
            boolean z14 = this.O;
            if (!z14 && org.telegram.messenger.t3.T(this.n)) {
                TLRPC.Chat chat4 = this.n;
                if (chat4.megagroup && !chat4.gigagroup && ((chatFull = this.r) == null || chatFull.participants_count <= 200 || (!this.s && chatFull.can_set_stickers))) {
                    if (org.telegram.messenger.t3.N(chat4)) {
                        int i43 = this.c1;
                        this.w0 = i43;
                        this.c1 = i43 + 2;
                        this.x0 = i43 + 1;
                    } else {
                        int i44 = this.c1;
                        this.c1 = i44 + 1;
                        this.B0 = i44;
                    }
                }
            }
            if (org.telegram.messenger.t3.w(4, this.n)) {
                int i45 = this.c1;
                this.c1 = i45 + 1;
                this.y0 = i45;
            }
            if (!this.P || (z10 = this.Q)) {
                if (!arrayList.isEmpty()) {
                    int i46 = this.c1;
                    this.D0 = i46;
                    int size3 = arrayList.size() + i46;
                    this.c1 = size3;
                    this.E0 = size3;
                }
                if (!z13) {
                    int i47 = this.c1;
                    this.c1 = i47 + 1;
                    this.a1 = i47;
                }
            } else if (!z10) {
                int i48 = this.c1;
                this.c1 = i48 + 1;
                this.e1 = i48;
            }
            if (z14 || !org.telegram.messenger.t3.V(this.n) || !org.telegram.messenger.t3.N(this.n) || z13) {
                return;
            }
            int i49 = this.c1;
            int i50 = i49 + 1;
            this.c1 = i50;
            this.g1 = i49;
            if (!this.u1) {
                this.c1 = i49 + 2;
                this.i1 = i50;
                return;
            } else {
                this.h1 = i50;
                this.c1 = i49 + 3;
                this.i1 = i49 + 2;
                return;
            }
        }
        if (i10 == 2) {
            if (org.telegram.messenger.t3.T(this.n) && !org.telegram.messenger.t3.V(this.n) && !this.m1) {
                int i51 = this.c1;
                this.I0 = i51;
                this.c1 = i51 + 2;
                this.J0 = i51 + 1;
            }
            int i52 = this.d1;
            if (i52 == 0 && org.telegram.messenger.t3.w(3, this.n)) {
                int i53 = this.c1;
                this.c1 = i53 + 1;
                this.y0 = i53;
            }
            if (i52 == 0 && org.telegram.messenger.t3.y(3, this.n)) {
                int i54 = this.c1;
                this.c1 = i54 + 1;
                this.z0 = i54;
            }
            if (this.P && !(z9 = this.Q)) {
                if (z9) {
                    return;
                }
                if (i52 == 0) {
                    int i55 = this.c1;
                    this.c1 = i55 + 1;
                    this.f1 = i55;
                }
                int i56 = this.c1;
                this.c1 = i56 + 1;
                this.e1 = i56;
                return;
            }
            ArrayList arrayList2 = this.G;
            if (!arrayList2.isEmpty()) {
                int i57 = this.c1;
                int i58 = i57 + 1;
                this.c1 = i58;
                this.S0 = i57;
                this.T0 = i58;
                int size4 = arrayList2.size() + i58;
                this.c1 = size4;
                this.U0 = size4;
                r1 = 1;
            }
            ArrayList arrayList3 = this.F;
            if (arrayList3.isEmpty()) {
                i7 = r1;
            } else {
                int i59 = this.c1;
                int i60 = i59 + 1;
                this.c1 = i60;
                this.V0 = i59;
                this.W0 = i60;
                int size5 = arrayList3.size() + i60;
                this.c1 = size5;
                this.X0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i7 != 0) {
                    int i61 = this.c1;
                    this.c1 = i61 + 1;
                    this.Y0 = i61;
                }
                int i62 = this.c1;
                this.D0 = i62;
                int size6 = arrayList.size() + i62;
                this.c1 = size6;
                this.E0 = size6;
            }
            int i63 = this.c1;
            if (i63 != 0) {
                this.c1 = i63 + 1;
                this.a1 = i63;
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
            if (x02 == this.D1 && x03 == this.E1) {
                return;
            }
            this.D1 = x02;
            this.E1 = x03;
            int i7 = 1;
            while (i7 < 4) {
                int childCount = i7 == 0 ? this.c.getChildCount() : i7 == 1 ? this.c.getHiddenChildCount() : i7 == 2 ? this.c.getCachedChildCount() : this.c.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i7 == 0 ? this.c.getChildAt(i10) : i7 == 1 ? this.c.V(i10) : i7 == 2 ? this.c.P(i10) : this.c.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).updateColors();
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        return l0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        boolean z9 = false;
        this.n1 = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = this.d1;
        int i10 = this.N;
        int i11 = 3;
        if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752333, "ChannelPermissions"));
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752453, "ChannelBlacklist"));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752517, null));
        } else if (i10 == 2) {
            if (i7 == 0) {
                if (this.s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752289, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752377, "ChannelMembers"));
                }
            } else if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752528, "ChannelAddAdmin"));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752452, "ChannelBlockUser"));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752527, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 9));
        int i12 = 8;
        if (i7 != 0 || i10 == 2 || i10 == 0 || i10 == 3) {
            this.e = new nq(this, context);
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.B0 = new kg.v1(this, i11);
            this.f = b10;
            if (i10 == 0 && !this.Q) {
                b10.setVisibility(8);
            }
            if (i10 == 3) {
                this.f.setSearchFieldHint(org.telegram.messenger.id.M0(2131752307, "ChannelSearchException"));
            } else {
                this.f.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, "Search"));
            }
            if (!org.telegram.messenger.t3.T(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i10 == 3) {
                this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
            }
        } else if (i10 == 1 && org.telegram.messenger.t3.V(this.n) && org.telegram.messenger.t3.N(this.n)) {
            this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.B1 = mzVar;
        mzVar.setViewType(6);
        org.telegram.ui.Components.mz mzVar2 = this.B1;
        mzVar2.x = false;
        mzVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.mz mzVar3 = this.B1;
        int i13 = org.telegram.ui.ActionBar.k6.G8;
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        mzVar3.e(i13, i14, i14);
        frameLayout2.addView(this.B1, c8.ha.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        frameLayout2.addView(radialProgressView, c8.ha.e(-2, -2, 17));
        this.B1.setVisibility(8);
        this.C1.setVisibility(8);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, frameLayout2, 1, null);
        this.b = av0Var;
        av0Var.d.setText(org.telegram.messenger.id.M0(2131748168, null));
        this.b.e.setText(org.telegram.messenger.id.M0(2131745810, null));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        bi.q1 q1Var = new bi.q1(12, context, this);
        this.c = q1Var;
        q1Var.r1();
        this.c.setSectionsDrawBackground(true);
        bi.q1 q1Var2 = this.c;
        jg.i0 i0Var = new jg.i0(r2, this, z9);
        this.d = i0Var;
        q1Var2.setLayoutManager(i0Var);
        bq bqVar = new bq(this);
        bqVar.n(420L);
        bqVar.o(org.telegram.ui.Components.xq.h);
        bqVar.C = false;
        bqVar.m = false;
        this.c.setItemAnimator(bqVar);
        bi.q1 q1Var3 = this.c;
        q1Var3.W1 = true;
        q1Var3.X1 = 0;
        kq kqVar = new kq(this, context);
        this.a = kqVar;
        q1Var3.setAdapter(kqVar);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        frameLayout.addView(this.c, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        this.c.setOnItemClickListener(new np(this, i11));
        this.c.setOnItemLongClickListener(new np(this, 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new g3(this, i12));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        G0();
        this.c.setEmptyView(this.b);
        bi.q1 q1Var4 = this.c;
        q1Var4.W1 = false;
        q1Var4.X1 = 0;
        if (this.m1) {
            this.f.F(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.T) {
            if (i7 == org.telegram.messenger.qs.y1 && ((Long) objArr[0]).longValue() == (-this.M)) {
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
        if (chatFull.id == this.M) {
            if (booleanValue && org.telegram.messenger.t3.T(this.n)) {
                return;
            }
            boolean z9 = this.r != null;
            this.r = chatFull;
            if (!z9) {
                int p02 = p0();
                this.p1 = p02;
                this.o1 = p02;
                int i11 = this.r.boosts_unrestrict;
                this.q1 = i11 > 0;
                this.r1 = i11;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
                long j3 = M0 == null ? 0L : M0.send_paid_messages_stars;
                boolean z10 = j3 > 0;
                this.x1 = z10;
                this.w1 = z10;
                if (j3 <= 0) {
                    j3 = 10;
                }
                long k10 = Utilities.k(j3, getMessagesController().I6, 1L);
                this.z1 = k10;
                this.y1 = k10;
            }
            org.telegram.messenger.g0.h3(new lp(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Components.vt0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V6));
        int i7 = org.telegram.ui.ActionBar.k6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r0 && r5.v1) != r5.t1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l0(boolean z9) {
        int i7 = 1;
        if (!this.O) {
            if (org.telegram.messenger.t3.D(this.D).equals(this.y) && this.p1 == this.o1 && !t0() && (r0 = this.u1) == this.s1) {
            }
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131743729, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                if (this.s) {
                    u1Var.T = org.telegram.messenger.id.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    u1Var.T = org.telegram.messenger.id.M0(2131749402, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, "ApplyTheme"), new np(this, i7));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747581, "PassportDiscard"), new np(this, 2));
                showDialog(u1Var);
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
    public final boolean m0(TLObject tLObject, boolean z9, View view) {
        int i7;
        long j3;
        String str;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10;
        final long j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j11;
        String str2;
        int i11;
        final oq oqVar;
        final int i12;
        String str3;
        int i13;
        boolean z11;
        boolean z12;
        String str4;
        int i14;
        String str5;
        int i15;
        if (tLObject != null && (i7 = this.d1) == 0) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                j11 = org.telegram.messenger.ij.C1(channelParticipant.peer);
                z10 = channelParticipant.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
                tL_chatAdminRights = channelParticipant.admin_rights;
                i10 = channelParticipant.date;
                str2 = channelParticipant.rank;
                j3 = 0;
                tL_chatBannedRights = tL_chatBannedRights2;
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j11 = chatParticipant.user_id;
                i10 = chatParticipant.date;
                z10 = org.telegram.messenger.t3.w(4, this.n);
                str2 = "";
                j3 = 0;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j3 = 0;
                str = null;
                z10 = false;
                tL_chatAdminRights = null;
                i10 = 0;
                j10 = 0;
                tL_chatBannedRights = null;
                if (j10 != j3 && j10 != getUserConfig().e()) {
                    boolean z13 = this.s;
                    i11 = this.N;
                    if (i11 == 2) {
                        String str6 = str;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                        final int i16 = 1;
                        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
                        if (i11 == 3 && org.telegram.messenger.t3.w(2, this.n)) {
                            String M0 = org.telegram.messenger.id.M0(2131752414, null);
                            oqVar = this;
                            bi.i0 i0Var = new bi.i0(oqVar, j10, tL_chatBannedRights, str6, tLObject, 9);
                            final int i17 = 0;
                            H.c(R.drawable.msg_permissions, M0, i0Var, false);
                            H.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131752420, "ChannelDeleteFromList"), new Runnable(oqVar) { // from class: org.telegram.ui.mp
                                public final /* synthetic */ oq b;

                                {
                                    this.b = oqVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            this.b.n0(j10);
                                            break;
                                        case 1:
                                            oq oqVar2 = this.b;
                                            long j12 = j10;
                                            oqVar2.n0(j12);
                                            oqVar2.getMessagesController().n(oqVar2.M, oqVar2.getMessagesController().a2(Long.valueOf(j12)), null, oqVar2, null);
                                            break;
                                        case 2:
                                            this.b.n0(j10);
                                            break;
                                        default:
                                            oq oqVar3 = this.b;
                                            org.telegram.messenger.qp messagesController = oqVar3.getMessagesController();
                                            long j13 = oqVar3.M;
                                            org.telegram.messenger.qp messagesController2 = oqVar3.getMessagesController();
                                            long j14 = j10;
                                            messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !oqVar3.s, oqVar3, false, false, null, null, null);
                                            oqVar3.A0(j14);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            oqVar = this;
                            if (i11 == 0 && org.telegram.messenger.t3.w(2, oqVar.n)) {
                                if (org.telegram.messenger.t3.w(3, oqVar.n) && j10 > j3 && !org.telegram.messenger.t3.Y(oqVar.n)) {
                                    if (z13) {
                                        i13 = 2131752524;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i13 = 2131752523;
                                    }
                                    H.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(i13, str3), new Runnable(oqVar) { // from class: org.telegram.ui.mp
                                        public final /* synthetic */ oq b;

                                        {
                                            this.b = oqVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    this.b.n0(j10);
                                                    break;
                                                case 1:
                                                    oq oqVar2 = this.b;
                                                    long j12 = j10;
                                                    oqVar2.n0(j12);
                                                    oqVar2.getMessagesController().n(oqVar2.M, oqVar2.getMessagesController().a2(Long.valueOf(j12)), null, oqVar2, null);
                                                    break;
                                                case 2:
                                                    this.b.n0(j10);
                                                    break;
                                                default:
                                                    oq oqVar3 = this.b;
                                                    org.telegram.messenger.qp messagesController = oqVar3.getMessagesController();
                                                    long j13 = oqVar3.M;
                                                    org.telegram.messenger.qp messagesController2 = oqVar3.getMessagesController();
                                                    long j14 = j10;
                                                    messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !oqVar3.s, oqVar3, false, false, null, null, null);
                                                    oqVar3.A0(j14);
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                final int i18 = 2;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131752420, "ChannelDeleteFromList"), new Runnable(oqVar) { // from class: org.telegram.ui.mp
                                    public final /* synthetic */ oq b;

                                    {
                                        this.b = oqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                this.b.n0(j10);
                                                break;
                                            case 1:
                                                oq oqVar2 = this.b;
                                                long j12 = j10;
                                                oqVar2.n0(j12);
                                                oqVar2.getMessagesController().n(oqVar2.M, oqVar2.getMessagesController().a2(Long.valueOf(j12)), null, oqVar2, null);
                                                break;
                                            case 2:
                                                this.b.n0(j10);
                                                break;
                                            default:
                                                oq oqVar3 = this.b;
                                                org.telegram.messenger.qp messagesController = oqVar3.getMessagesController();
                                                long j13 = oqVar3.M;
                                                org.telegram.messenger.qp messagesController2 = oqVar3.getMessagesController();
                                                long j14 = j10;
                                                messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !oqVar3.s, oqVar3, false, false, null, null, null);
                                                oqVar3.A0(j14);
                                                break;
                                        }
                                    }
                                }, true);
                            } else if (i11 == 1 && org.telegram.messenger.t3.w(4, oqVar.n) && z10) {
                                if (oqVar.n.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                                    i12 = 3;
                                    H.c(R.drawable.msg_admins, org.telegram.messenger.id.M0(2131751305, "EditAdminRights"), new bi.i0(oqVar, j10, tL_chatAdminRights2, str6, tLObject, 10), false);
                                } else {
                                    i12 = 3;
                                }
                                H.c(R.drawable.msg_remove, org.telegram.messenger.id.M0(2131752313, "ChannelRemoveUserAdmin"), new Runnable(oqVar) { // from class: org.telegram.ui.mp
                                    public final /* synthetic */ oq b;

                                    {
                                        this.b = oqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                this.b.n0(j10);
                                                break;
                                            case 1:
                                                oq oqVar2 = this.b;
                                                long j12 = j10;
                                                oqVar2.n0(j12);
                                                oqVar2.getMessagesController().n(oqVar2.M, oqVar2.getMessagesController().a2(Long.valueOf(j12)), null, oqVar2, null);
                                                break;
                                            case 2:
                                                this.b.n0(j10);
                                                break;
                                            default:
                                                oq oqVar3 = this.b;
                                                org.telegram.messenger.qp messagesController = oqVar3.getMessagesController();
                                                long j13 = oqVar3.M;
                                                org.telegram.messenger.qp messagesController2 = oqVar3.getMessagesController();
                                                long j14 = j10;
                                                messagesController.P4(j13, messagesController2.a2(Long.valueOf(j14)), new TLRPC.TL_chatAdminRights(), "", !oqVar3.s, oqVar3, false, false, null, null, null);
                                                oqVar3.A0(j14);
                                                break;
                                        }
                                    }
                                }, true);
                            }
                        }
                        H.W(oqVar.c.U0(view, false));
                        H.S = org.telegram.messenger.qs.U2;
                        boolean z14 = H.x() > 0;
                        if (z9 || !z14) {
                            return z14;
                        }
                        H.Z();
                        return true;
                    }
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
                    boolean z15 = org.telegram.messenger.t3.w(4, this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z10);
                    boolean z16 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
                    boolean z17 = !(z16 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z10;
                    boolean z18 = z16 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                    boolean z19 = org.telegram.messenger.t3.w(2, this.n) && z17 && !z13 && org.telegram.messenger.t3.T(this.n) && !this.n.gigagroup;
                    if (i7 == 0) {
                        z15 &= !org.telegram.messenger.t10.x(a22);
                    }
                    if (z15) {
                        z11 = z19;
                    } else {
                        z11 = z19;
                        if (!org.telegram.messenger.t3.w(2, this.n) || !z17) {
                            z12 = false;
                            if (!z9 || !z12) {
                                return z12;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                            int i19 = i10;
                            boolean z20 = z15;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
                            boolean z21 = z11;
                            boolean z22 = z18;
                            tp tpVar = new tp(this, j10, i19, tLObject, tL_chatAdminRights3, tL_chatBannedRights3, str, z17);
                            long j12 = j10;
                            org.telegram.ui.Components.k60 H2 = org.telegram.ui.Components.k60.H(this, view);
                            H2.W(this.c.U0(view, false));
                            if (z22) {
                                i14 = 2131751305;
                                str4 = null;
                            } else {
                                str4 = null;
                                i14 = 2131745550;
                            }
                            H2.l(R.drawable.msg_admins, org.telegram.messenger.id.M0(i14, str4), new bh(tpVar, 12), z20);
                            H2.l(R.drawable.msg_permissions, org.telegram.messenger.id.M0(2131752540, "ChangePermissions"), new m6(this, tLObject, a22, tpVar, 12), z21);
                            boolean z23 = org.telegram.messenger.t3.w(2, this.n) && z17;
                            if (z13) {
                                str5 = "ChannelRemoveUser";
                                i15 = 2131752314;
                            } else {
                                str5 = "KickFromGroup";
                                i15 = 2131749056;
                            }
                            H2.m(R.drawable.msg_remove, new bi.d3(this, a22, j12, 18), org.telegram.messenger.id.M0(i15, str5), z23, true);
                            H2.S = org.telegram.messenger.qs.U2;
                            H2.Z();
                            return true;
                        }
                    }
                    z12 = true;
                    if (!z9) {
                    }
                    return z12;
                }
            }
            str = str2;
            j10 = j11;
            if (j10 != j3) {
                boolean z132 = this.s;
                i11 = this.N;
                if (i11 == 2) {
                }
            }
        }
        return false;
    }

    public final void n0(long j3) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().j1(j3);
            tL_communities_toggleParticipantBanned.community = getMessagesController().h1(this.M);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new a5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().j1(j3);
        tL_channels_editBanned.channel = getMessagesController().h1(this.M);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        return l0(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        w0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        kq kqVar = this.a;
        if (kqVar != null) {
            kqVar.f();
        }
        org.telegram.ui.Components.av0 av0Var = this.b;
        if (av0Var != null) {
            av0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            H0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            this.A1 = true;
        }
        if (z9 && !z10 && this.m1) {
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
        int i7 = chatFull.slowmode_seconds;
        if (i7 == 5) {
            return 1;
        }
        if (i7 == 10) {
            return 2;
        }
        if (i7 == 30) {
            return 3;
        }
        if (i7 == 60) {
            return 4;
        }
        if (i7 == 300) {
            return 5;
        }
        if (i7 == 900) {
            return 6;
        }
        return i7 == 3600 ? 7 : 0;
    }

    public final int q0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i7 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i7 : Math.max(i7, arrayList.size());
    }

    public final boolean t0() {
        boolean z9 = this.q1 && v0();
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull != null) {
            int i7 = chatFull.boosts_unrestrict;
            int i10 = this.r1;
            if (i7 != i10 || ((z9 && i10 == 0) || (!z9 && i10 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean u0(int i7) {
        return i7 == this.U || i7 == this.V || i7 == this.W || i7 == this.X || i7 == this.Y || i7 == this.Z || i7 == this.j0 || i7 == this.a0 || i7 == this.b0 || i7 == this.c0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.Chat chat = this.n;
        if (!chat.megagroup || chat.gigagroup || !org.telegram.messenger.t3.y(13, chat)) {
            return false;
        }
        if (this.o1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.D;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void w0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.P) {
            return;
        }
        int i7 = 0;
        this.I = false;
        this.H = false;
        boolean z9 = this.w;
        int i10 = this.N;
        a0.h hVar = this.K;
        ArrayList arrayList = this.F;
        a0.h hVar2 = this.L;
        ArrayList arrayList2 = this.G;
        a0.h hVar3 = this.J;
        ArrayList arrayList3 = this.E;
        if (z9 && i10 == 2) {
            this.P = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            hVar3.b();
            hVar2.b();
            hVar.b();
            HashMap hashMap = org.telegram.messenger.g5.r(this.currentAccount).g0;
            ArrayList arrayList4 = org.telegram.messenger.g5.r(this.currentAccount).h0;
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
            kq kqVar = this.a;
            if (kqVar != null) {
                kqVar.f();
                return;
            }
            return;
        }
        if (org.telegram.messenger.t3.T(this.n)) {
            this.P = true;
            org.telegram.ui.Components.av0 av0Var = this.b;
            if (av0Var != null) {
                av0Var.e(true, false);
            }
            kq kqVar2 = this.a;
            if (kqVar2 != null) {
                kqVar2.f();
            }
            ArrayList x02 = x0();
            ArrayList arrayList6 = new ArrayList();
            rp rpVar = new rp(this, x02, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i13 = 0; i13 < x02.size(); i13++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) x02.get(i13), new bg.k0(arrayList6, i13, atomicInteger, x02, rpVar, 6)), this.classGuid);
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
        if (i10 == 1) {
            TLRPC.ChatFull chatFull2 = this.r;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i7 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.r.participants.participants.get(i7);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    hVar3.k(chatParticipant, chatParticipant.user_id);
                    i7++;
                }
            }
        } else if (i10 == 2 && (chatFull = this.r) != null && chatFull.participants != null) {
            long j3 = getUserConfig().n;
            int size4 = this.r.participants.participants.size();
            while (i7 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.r.participants.participants.get(i7);
                int i14 = this.d1;
                if (i14 == 0 || chatParticipant2.user_id != j3) {
                    if (i14 == 1) {
                        if (getContactsController().x(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            hVar2.k(chatParticipant2, chatParticipant2.user_id);
                        } else if (!org.telegram.messenger.t10.x(getMessagesController().a2(Long.valueOf(chatParticipant2.user_id)))) {
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
                i7++;
            }
        }
        kq kqVar3 = this.a;
        if (kqVar3 != null) {
            kqVar3.f();
        }
        G0();
        kq kqVar4 = this.a;
        if (kqVar4 != null) {
            kqVar4.f();
        }
    }

    public final ArrayList x0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().h1(this.M);
        int i7 = this.N;
        if (i7 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i7 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i7 == 2) {
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
                    arrayList.addAll(x0());
                }
            } else if (!this.I) {
                this.j1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.I = true;
                arrayList.addAll(x0());
            } else if (this.H) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.H = true;
                arrayList.addAll(x0());
            }
        } else if (i7 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.qs.e3;
        return arrayList;
    }

    public final void y0(long j3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, int i7, boolean z10) {
        kp kpVar = new kp(j3, this.M, tL_chatAdminRights, this.D, tL_chatBannedRights, str, i7, z9, tLObject == null, null);
        kpVar.X0 = new yp(this, tLObject, j3, z10);
        presentFragment(kpVar, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if ((r0 && r15.v1) != r15.t1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        TLRPC.ChatFull chatFull;
        int i7 = 0;
        int i10 = this.N;
        if (i10 == 3) {
            TLRPC.Chat chat = this.n;
            if (chat.creator && !org.telegram.messenger.t3.T(chat) && ((this.o1 != this.p1 || this.x1) && this.r != null)) {
                org.telegram.messenger.qp.s1(this.currentAccount).T(getParentActivity(), this.M, this, new np(this, i7), null);
                return;
            }
            if (!org.telegram.messenger.t3.D(this.D).equals(this.y)) {
                getMessagesController().H4(this.M, this.D, org.telegram.messenger.t3.T(this.n), this);
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
                if (M0 != null) {
                    M0.default_banned_rights = this.D;
                }
            }
            int i11 = this.o1;
            if (i11 != this.p1 && (chatFull = this.r) != null) {
                chatFull.slowmode_seconds = r0(i11);
                this.r.flags |= 131072;
                org.telegram.messenger.qp messagesController = getMessagesController();
                long j3 = this.M;
                int i12 = this.r.slowmode_seconds;
                messagesController.getClass();
                TLRPC.TL_channels_toggleSlowMode tL_channels_toggleSlowMode = new TLRPC.TL_channels_toggleSlowMode();
                tL_channels_toggleSlowMode.seconds = i12;
                tL_channels_toggleSlowMode.channel = messagesController.h1(j3);
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleSlowMode, new org.telegram.messenger.pj(messagesController, j3, 14));
            }
            boolean z9 = this.x1;
            if (z9 != this.w1 || (z9 && this.y1 != this.z1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().h1(this.M);
                updatepaidmessagesprice.send_paid_messages_stars = this.x1 ? this.z1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new di.u5(17));
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.M));
                if (M02 != null) {
                    if (this.x1) {
                        M02.flags2 |= TLObject.FLAG_14;
                        M02.send_paid_messages_stars = this.z1;
                    } else {
                        M02.flags2 &= -16385;
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().Q3(M02, true);
                }
            }
            if (t0()) {
                boolean z10 = this.q1 && v0();
                if (z10 && this.r1 == 0) {
                    getMessagesController().D4(1, this.M);
                } else if (z10 || this.r1 == 0) {
                    getMessagesController().D4(this.r1, this.M);
                } else {
                    getMessagesController().D4(0, this.M);
                }
            }
        } else if (i10 == 1) {
            boolean z11 = this.u1;
            if (z11 == this.s1) {
            }
            org.telegram.messenger.qp messagesController2 = getMessagesController();
            long j10 = this.M;
            boolean z12 = this.u1;
            boolean z13 = z12 && this.v1;
            TLRPC.Chat M03 = messagesController2.M0(Long.valueOf(j10));
            if (M03 != null) {
                M03.signatures = z12;
                M03.signature_profiles = z13;
                messagesController2.Q3(M03, true);
            }
            TLRPC.TL_channels_toggleSignatures tL_channels_toggleSignatures = new TLRPC.TL_channels_toggleSignatures();
            tL_channels_toggleSignatures.channel = messagesController2.h1(j10);
            tL_channels_toggleSignatures.signatures_enabled = z12;
            tL_channels_toggleSignatures.profiles_enabled = z13;
            messagesController2.getConnectionsManager().sendRequest(tL_channels_toggleSignatures, new org.telegram.messenger.rj(messagesController2, 13), 64);
            messagesController2.getNotificationCenter().k(org.telegram.messenger.qs.E3, Long.valueOf(-j10));
        }
        finishFragment();
    }
}
