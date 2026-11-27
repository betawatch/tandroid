// default package

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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bg2 extends e implements fn7 {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public tk4 C1;
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
    public final zh6 K;
    public int K0;
    public final zh6 L;
    public int L0;
    public final zh6 M;
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
    public xf2 a;
    public int a0;
    public int a1;
    public z2b b;
    public int b0;
    public int b1;
    public gu c;
    public int c0;
    public int c1;
    public of2 d;
    public int d0;
    public int d1;
    public ag2 e;
    public int e0;
    public final int e1;
    public sla f;
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
    public uf2 m1;
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

    public bg2(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new zh6();
        this.L = new zh6();
        this.M = new zh6();
        this.z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt(TeXSymbolParser.TYPE_ATTR);
        this.P = this.arguments.getBoolean("transfer");
        this.n1 = this.arguments.getBoolean("open_search");
        this.e1 = this.arguments.getInt("selectType");
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
        this.n = M0;
        boolean z = false;
        if (M0 != null && (tL_chatBannedRights = M0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z2 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z2;
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
            boolean z3 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z3;
            boolean z4 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z4;
            boolean z5 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z5;
            boolean z6 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z6;
            boolean z7 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z7;
            boolean z8 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z8;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z2 && z8 && z7 && z6 && z5 && z4 && z3) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.y = xc2.D(this.E);
        boolean Y = xc2.Y(this.n);
        this.w = Y;
        if (xc2.T(this.n) && !this.n.megagroup && !Y) {
            z = true;
        }
        this.s = z;
        this.x = xc2.c0(this.n);
        TLRPC.Chat chat = this.n;
        if (chat != null) {
            boolean z9 = chat.signatures;
            this.v1 = z9;
            this.t1 = z9;
            boolean z10 = chat.signature_profiles;
            this.w1 = z10;
            this.u1 = z10;
        }
    }

    public static int j0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int m0(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 30;
        }
        if (i == 4) {
            return 60;
        }
        if (i == 5) {
            return jn7.W4;
        }
        if (i == 6) {
            return 900;
        }
        return i == 7 ? 3600 : 0;
    }

    public static int n0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i++;
        }
        return !tL_chatBannedRights.send_reactions ? i + 1 : i;
    }

    public final vf2 A0() {
        vf2 vf2Var = new vf2(this);
        vf2Var.a = this.d1;
        vf2Var.h = this.X0;
        vf2Var.i = this.Y0;
        vf2Var.k.clear();
        vf2Var.k.addAll(this.G);
        vf2Var.g = this.V0;
        vf2Var.f = this.U0;
        vf2Var.l.clear();
        vf2Var.l.addAll(this.H);
        vf2Var.d = this.E0;
        vf2Var.e = this.F0;
        vf2Var.j.clear();
        vf2Var.j.addAll(this.F);
        vf2Var.e(vf2Var.b);
        return vf2Var;
    }

    public final void B0(TLRPC.ChatFull chatFull) {
        this.r = chatFull;
        if (chatFull != null) {
            int k0 = k0();
            this.q1 = k0;
            this.p1 = k0;
            int i = this.r.boosts_unrestrict;
            this.r1 = i > 0;
            this.s1 = i;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
            long j = M0 == null ? 0L : M0.send_paid_messages_stars;
            boolean z = j > 0;
            this.y1 = z;
            this.x1 = z;
            if (j <= 0) {
                j = 10;
            }
            long k = Utilities.k(j, getMessagesController().k4.P1.f(), 1L);
            this.A1 = k;
            this.z1 = k;
        }
    }

    public final void C0(int i) {
        if (this.isPaused || !this.B1) {
            return;
        }
        if (this.c.getAdapter() == this.a && this.R) {
            return;
        }
        View view = null;
        for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
            View childAt = this.c.getChildAt(i2);
            if (childAt instanceof tk4) {
                view = childAt;
            }
        }
        if (view != null) {
            this.c.removeView(view);
            i--;
        }
        this.c.getViewTreeObserver().addOnPreDrawListener(new r32(this, (tk4) view, i, (byte) 1));
    }

    public final void D0(vf2 vf2Var) {
        View view;
        if (this.a == null) {
            F0();
            return;
        }
        F0();
        vf2Var.e(vf2Var.c);
        cy7.a(vf2Var, true).c(this.a);
        gu guVar = this.c;
        if (guVar == null || this.d == null || guVar.getChildCount() <= 0) {
            return;
        }
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= this.c.getChildCount()) {
                view = null;
                break;
            }
            i2 = RecyclerView.S(this.c.getChildAt(i));
            if (i2 != -1) {
                view = this.c.getChildAt(i);
                break;
            }
            i++;
        }
        if (view != null) {
            this.d.g1(i2, view.getTop() - this.c.getPaddingTop());
        }
    }

    public final void E0(TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i = 0;
        while (i < 3) {
            TLObject tLObject = (TLObject) (i == 0 ? this.M : i == 1 ? this.L : this.K).f(r47.B1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b7, code lost:
    
        if (xc2.w(2, r1) != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0() {
        boolean z;
        boolean z2;
        TLRPC.ChatFull chatFull;
        boolean z3;
        TLRPC.ChatFull chatFull2;
        boolean z4;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
        this.n = M0;
        if (M0 != null) {
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
            boolean z5 = this.w;
            int i = 1;
            int i2 = this.O;
            if (i2 == 3) {
                int i3 = this.d1;
                int i4 = i3 + 1;
                this.d1 = i4;
                this.S = i3;
                if (!z5) {
                    this.T = i4;
                    int i5 = i3 + 3;
                    this.d1 = i5;
                    this.U = i3 + 2;
                    if (this.l1) {
                        this.V = i5;
                        this.W = i3 + 4;
                        this.X = i3 + 5;
                        this.Y = i3 + 6;
                        this.Z = i3 + 7;
                        this.a0 = i3 + 8;
                        this.b0 = i3 + 9;
                        this.c0 = i3 + 10;
                        this.d0 = i3 + 11;
                        i5 = i3 + 13;
                        this.d1 = i5;
                        this.k0 = i3 + 12;
                    }
                    this.h0 = i5;
                    int i6 = i5 + 2;
                    this.i0 = i5 + 1;
                    i4 = i5 + 3;
                    this.d1 = i4;
                    this.j0 = i6;
                }
                int i7 = i4 + 1;
                this.d1 = i7;
                this.g0 = i4;
                if (z5) {
                    this.d1 = i4 + 2;
                    this.m0 = i7;
                } else if (this.x) {
                    this.d1 = i4 + 2;
                    this.l0 = i7;
                }
                if (xc2.T(this.n)) {
                    TLRPC.Chat chat2 = this.n;
                    if (chat2.creator && chat2.megagroup && !chat2.gigagroup && !z5) {
                        int i8 = chat2.participants_count;
                        TLRPC.ChatFull chatFull4 = this.r;
                        if (Math.max(i8, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().Q2 - 1000) {
                            int i9 = this.d1;
                            this.H0 = i9;
                            this.s0 = i9 + 1;
                            this.t0 = i9 + 2;
                            this.d1 = i9 + 4;
                            this.u0 = i9 + 3;
                        }
                    }
                }
                TLRPC.ChatFull chatFull5 = this.r;
                if (chatFull5 != null && chatFull5.paid_messages_available && !z5 && xc2.w(2, this.n) && (xc2.T(this.n) || ((chat = this.n) != null && chat.creator))) {
                    if (this.H0 == -1) {
                        int i10 = this.d1;
                        this.d1 = i10 + 1;
                        this.H0 = i10;
                    }
                    int i11 = this.d1;
                    this.n0 = i11;
                    int i12 = i11 + 2;
                    this.d1 = i12;
                    this.o0 = i11 + 1;
                    if (this.y1) {
                        this.p0 = i12;
                        this.q0 = i11 + 3;
                        this.d1 = i11 + 5;
                        this.r0 = i11 + 4;
                    }
                }
                if (!z5) {
                    if (xc2.T(this.n) || !this.n.creator) {
                        TLRPC.Chat chat3 = this.n;
                        if (chat3.megagroup) {
                            if (!chat3.gigagroup) {
                            }
                        }
                    }
                    if (this.H0 == -1) {
                        int i13 = this.d1;
                        this.d1 = i13 + 1;
                        this.H0 = i13;
                    }
                    int i14 = this.d1;
                    this.N0 = i14;
                    this.O0 = i14 + 1;
                    this.d1 = i14 + 3;
                    this.P0 = i14 + 2;
                }
                if (q0() && !z5) {
                    if (this.H0 == -1) {
                        int i15 = this.d1;
                        this.d1 = i15 + 1;
                        this.H0 = i15;
                    }
                    int i16 = this.d1;
                    int i17 = i16 + 1;
                    this.d1 = i17;
                    this.Q0 = i16;
                    if (this.r1) {
                        int i18 = i16 + 2;
                        this.d1 = i18;
                        this.S0 = i17;
                        i17 = i18;
                    }
                    this.d1 = i17 + 1;
                    this.R0 = i17;
                }
                if (xc2.T(this.n) && !z5) {
                    if (this.H0 == -1) {
                        int i19 = this.d1;
                        this.d1 = i19 + 1;
                        this.H0 = i19;
                    }
                    int i20 = this.d1;
                    this.d1 = i20 + 1;
                    this.B0 = i20;
                }
                if ((this.P0 == -1 && this.s0 == -1) || this.B0 != -1) {
                    int i21 = this.d1;
                    this.d1 = i21 + 1;
                    this.G0 = i21;
                }
                if (xc2.w(2, this.n) && !z5 && l0() > 1 && (xc2.T(this.n) || this.n.creator)) {
                    int i22 = this.d1;
                    this.d1 = i22 + 1;
                    this.z0 = i22;
                }
                if (this.Q && !(z4 = this.R)) {
                    if (z4 || (chatFull3 = this.r) == null || chatFull3.banned_count <= 0) {
                        return;
                    }
                    int i23 = this.d1;
                    this.d1 = i23 + 1;
                    this.f1 = i23;
                    return;
                }
                if (!arrayList.isEmpty()) {
                    int i24 = this.d1;
                    this.E0 = i24;
                    int size = arrayList.size() + i24;
                    this.d1 = size;
                    this.F0 = size;
                }
                if (this.z0 == -1 && this.E0 == -1) {
                    return;
                }
                int i25 = this.d1;
                this.d1 = i25 + 1;
                this.C0 = i25;
                return;
            }
            if (i2 == 0) {
                if (xc2.w(2, this.n)) {
                    int i26 = this.d1;
                    this.d1 = i26 + 1;
                    this.z0 = i26;
                    if (!arrayList.isEmpty() || (this.Q && !this.R && (chatFull2 = this.r) != null && chatFull2.kicked_count > 0)) {
                        int i27 = this.d1;
                        this.d1 = i27 + 1;
                        this.b1 = i27;
                    }
                }
                if (this.Q && !(z3 = this.R)) {
                    if (z3) {
                        return;
                    }
                    int i28 = this.d1;
                    this.D0 = i28;
                    this.d1 = i28 + 2;
                    this.f1 = i28 + 1;
                    return;
                }
                if (!arrayList.isEmpty()) {
                    int i29 = this.d1;
                    int i30 = i29 + 1;
                    this.d1 = i30;
                    this.D0 = i29;
                    this.E0 = i30;
                    int size2 = arrayList.size() + i30;
                    this.d1 = size2;
                    this.F0 = size2;
                }
                if (this.E0 == -1) {
                    int i31 = this.d1;
                    this.d1 = i31 + 1;
                    this.c1 = i31;
                    return;
                }
                int i32 = this.b1;
                int i33 = this.d1;
                if (i32 == -1) {
                    this.d1 = i33 + 1;
                    this.b1 = i33;
                    return;
                } else {
                    this.d1 = i33 + 1;
                    this.C0 = i33;
                    return;
                }
            }
            if (i2 == 1) {
                boolean z6 = this.P;
                if (!z6 && xc2.T(this.n)) {
                    TLRPC.Chat chat4 = this.n;
                    if (chat4.megagroup && !chat4.gigagroup && ((chatFull = this.r) == null || chatFull.participants_count <= 200 || (!this.s && chatFull.can_set_stickers))) {
                        boolean N = xc2.N(chat4);
                        int i34 = this.d1;
                        if (N) {
                            this.x0 = i34;
                            this.d1 = i34 + 2;
                            this.y0 = i34 + 1;
                        } else {
                            this.d1 = i34 + 1;
                            this.C0 = i34;
                        }
                    }
                }
                if (xc2.w(4, this.n)) {
                    int i35 = this.d1;
                    this.d1 = i35 + 1;
                    this.z0 = i35;
                }
                if (!this.Q || (z2 = this.R)) {
                    if (!arrayList.isEmpty()) {
                        int i36 = this.d1;
                        this.E0 = i36;
                        int size3 = arrayList.size() + i36;
                        this.d1 = size3;
                        this.F0 = size3;
                    }
                    if (!z5) {
                        int i37 = this.d1;
                        this.d1 = i37 + 1;
                        this.b1 = i37;
                    }
                } else if (!z2) {
                    int i38 = this.d1;
                    this.d1 = i38 + 1;
                    this.f1 = i38;
                }
                if (z6 || !xc2.V(this.n) || !xc2.N(this.n) || z5) {
                    return;
                }
                int i39 = this.d1;
                int i40 = i39 + 1;
                this.d1 = i40;
                this.h1 = i39;
                if (!this.v1) {
                    this.d1 = i39 + 2;
                    this.j1 = i40;
                    return;
                } else {
                    this.i1 = i40;
                    this.d1 = i39 + 3;
                    this.j1 = i39 + 2;
                    return;
                }
            }
            if (i2 == 2) {
                if (xc2.T(this.n) && !xc2.V(this.n) && !this.n1) {
                    int i41 = this.d1;
                    this.J0 = i41;
                    this.d1 = i41 + 2;
                    this.K0 = i41 + 1;
                }
                int i42 = this.e1;
                if (i42 == 0 && xc2.w(3, this.n)) {
                    int i43 = this.d1;
                    this.d1 = i43 + 1;
                    this.z0 = i43;
                }
                if (i42 == 0 && xc2.y(3, this.n)) {
                    int i44 = this.d1;
                    this.d1 = i44 + 1;
                    this.A0 = i44;
                }
                if (this.Q && !(z = this.R)) {
                    if (z) {
                        return;
                    }
                    if (i42 == 0) {
                        int i45 = this.d1;
                        this.d1 = i45 + 1;
                        this.g1 = i45;
                    }
                    int i46 = this.d1;
                    this.d1 = i46 + 1;
                    this.f1 = i46;
                    return;
                }
                ArrayList arrayList2 = this.H;
                if (!arrayList2.isEmpty()) {
                    int i47 = this.d1;
                    int i48 = i47 + 1;
                    this.d1 = i48;
                    this.T0 = i47;
                    this.U0 = i48;
                    int size4 = arrayList2.size() + i48;
                    this.d1 = size4;
                    this.V0 = size4;
                    r1 = 1;
                }
                ArrayList arrayList3 = this.G;
                if (arrayList3.isEmpty()) {
                    i = r1;
                } else {
                    int i49 = this.d1;
                    int i50 = i49 + 1;
                    this.d1 = i50;
                    this.W0 = i49;
                    this.X0 = i50;
                    int size5 = arrayList3.size() + i50;
                    this.d1 = size5;
                    this.Y0 = size5;
                }
                if (!arrayList.isEmpty()) {
                    if (i != 0) {
                        int i51 = this.d1;
                        this.d1 = i51 + 1;
                        this.Z0 = i51;
                    }
                    int i52 = this.d1;
                    this.E0 = i52;
                    int size6 = arrayList.size() + i52;
                    this.d1 = size6;
                    this.F0 = size6;
                }
                int i53 = this.d1;
                if (i53 != 0) {
                    this.d1 = i53 + 1;
                    this.b1 = i53;
                }
            }
        }
    }

    public final void G0() {
        int hiddenChildCount;
        View X;
        try {
            if (this.c != null) {
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.n6, false);
                if (w0 == this.E1 && w02 == this.F1) {
                    return;
                }
                this.E1 = w0;
                this.F1 = w02;
                int i = 1;
                while (i < 4) {
                    if (i == 0) {
                        hiddenChildCount = this.c.getChildCount();
                    } else {
                        gu guVar = this.c;
                        hiddenChildCount = i == 1 ? guVar.getHiddenChildCount() : i == 2 ? guVar.getCachedChildCount() : guVar.getAttachedScrapChildCount();
                    }
                    for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                        if (i == 0) {
                            X = this.c.getChildAt(i2);
                        } else {
                            gu guVar2 = this.c;
                            X = i == 1 ? guVar2.X(i2) : i == 2 ? guVar2.Q(i2) : guVar2.P(i2);
                        }
                        if (X instanceof lj6) {
                            ((lj6) X).updateColors();
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.v6));
        hashSet.add(Integer.valueOf(aob.u6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        byte b = 0;
        this.o1 = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = this.e1;
        int i2 = this.O;
        byte b2 = 3;
        if (i2 == 3) {
            this.simpleActionBar.setTitle(ob6.M0(2131752303, "ChannelPermissions"));
        } else if (i2 == 0) {
            this.simpleActionBar.setTitle(ob6.M0(2131752427, "ChannelBlacklist"));
        } else if (i2 == 1) {
            this.simpleActionBar.setTitle(ob6.M0(2131752492, null));
        } else if (i2 == 2) {
            if (i == 0) {
                jla jlaVar = this.simpleActionBar;
                if (this.s) {
                    jlaVar.setTitle(ob6.M0(2131752255, null));
                } else {
                    jlaVar.setTitle(ob6.M0(2131752349, "ChannelMembers"));
                }
            } else if (i == 1) {
                this.simpleActionBar.setTitle(ob6.M0(2131752509, "ChannelAddAdmin"));
            } else if (i == 2) {
                this.simpleActionBar.setTitle(ob6.M0(2131752426, "ChannelBlockUser"));
            } else if (i == 3) {
                this.simpleActionBar.setTitle(ob6.M0(2131752508, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 29));
        if (i != 0 || i2 == 2 || i2 == 0 || i2 == 3) {
            this.e = new ag2(this, context);
            sla a = this.simpleActionBar.v().a(0, R.drawable.outline_header_search);
            a.N();
            a.C0 = new r10(this, (byte) 5);
            this.f = a;
            if (i2 == 0 && !this.R) {
                a.setVisibility(8);
            }
            sla slaVar = this.f;
            if (i2 == 3) {
                slaVar.setSearchFieldHint(ob6.M0(2131752273, "ChannelSearchException"));
            } else {
                slaVar.setSearchFieldHint(ob6.M0(2131745564, "Search"));
            }
            if (!xc2.T(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i2 == 3) {
                this.simpleActionBar.u(ob6.M0(2131745674, null));
            }
        } else if (i2 == 1 && xc2.V(this.n) && xc2.N(this.n)) {
            this.simpleActionBar.u(ob6.M0(2131745674, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        tk4 tk4Var = new tk4(context, null);
        this.C1 = tk4Var;
        tk4Var.setViewType(6);
        tk4 tk4Var2 = this.C1;
        tk4Var2.x = false;
        tk4Var2.setUseHeaderOffset(false);
        tk4 tk4Var3 = this.C1;
        int i3 = aob.G8;
        int i4 = aob.i6;
        tk4Var3.e(i3, i4, i4);
        frameLayout2.addView(this.C1, tre.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout2.addView(radialProgressView, tre.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        z2b z2bVar = new z2b(context, frameLayout2, 1, null);
        this.b = z2bVar;
        z2bVar.d.setText(ob6.M0(2131747898, null));
        this.b.e.setText(ob6.M0(2131745535, null));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        gu guVar = new gu((byte) 13, context, (Object) this);
        this.c = guVar;
        guVar.s1();
        this.c.setSectionsDrawBackground(true);
        gu guVar2 = this.c;
        of2 of2Var = new of2(this, b);
        this.d = of2Var;
        guVar2.setLayoutManager(of2Var);
        pf2 pf2Var = new pf2(this);
        pf2Var.n(420L);
        pf2Var.o(k43.h);
        pf2Var.C = false;
        pf2Var.m = false;
        this.c.setItemAnimator(pf2Var);
        gu guVar3 = this.c;
        guVar3.X1 = true;
        guVar3.Y1 = false;
        xf2 xf2Var = new xf2(this, context);
        this.a = xf2Var;
        guVar3.setAdapter(xf2Var);
        this.c.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        frameLayout.addView(this.c, tre.c(-1.0f, -1));
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.c.setOnItemClickListener(new ef2(this, b2));
        this.c.setOnItemLongClickListener(new ef2(this, (byte) 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new y(this, (byte) 27));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        F0();
        this.c.setEmptyView(this.b);
        gu guVar4 = this.c;
        guVar4.X1 = false;
        guVar4.Y1 = false;
        if (this.n1) {
            this.f.G(false);
        }
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = 0;
        if (i != jn7.T) {
            if (i == jn7.y1 && ((Long) objArr[0]).longValue() == (-this.N)) {
                wk5 wk5Var = this.parentLayout;
                if (wk5Var == null || wk5Var.getLastFragment() != this) {
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
            if (booleanValue && xc2.T(this.n)) {
                return;
            }
            boolean z = this.r != null;
            this.r = chatFull;
            if (!z) {
                int k0 = k0();
                this.q1 = k0;
                this.p1 = k0;
                int i3 = this.r.boosts_unrestrict;
                this.r1 = i3 > 0;
                this.s1 = i3;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
                long j = M0 == null ? 0L : M0.send_paid_messages_stars;
                boolean z2 = j > 0;
                this.y1 = z2;
                this.x1 = z2;
                if (j <= 0) {
                    j = 10;
                }
                long k = Utilities.k(j, getMessagesController().k4.P1.f(), 1L);
                this.A1 = k;
                this.z1 = k;
            }
            hl.c3(new cf2(this, b));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if ((r0 && r5.w1) == r5.u1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0(boolean z) {
        byte b = 1;
        if (!this.P) {
            if (xc2.D(this.E).equals(this.y) && this.q1 == this.p1 && !o0() && (r0 = this.v1) == this.t1) {
            }
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131743381, "UserRestrictionsApplyChanges");
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                if (this.s) {
                    idVar.U = ob6.M0(2131752271, "ChannelSettingsChangedAlert");
                } else {
                    idVar.U = ob6.M0(2131749155, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder.j(ob6.M0(2131754209, "ApplyTheme"), new ef2(this, b));
                alertDialog$Builder.g(ob6.M0(2131747307, "PassportDiscard"), new ef2(this, (byte) 2));
                showDialog(idVar);
            }
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 2);
        arrayList.add(new apb(this.c, 16, new Class[]{mf5.class, lj6.class, ij6.class, vkb.class, qmb.class, zma.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.c, 0, new Class[]{vkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.U6));
        arrayList.add(new apb(this.c, 0, new Class[]{vkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.V6));
        int i = aob.y6;
        arrayList.add(new apb(this.c, 0, new Class[]{lj6.class}, new String[]{"statusColor"}, (Drawable[]) null, da2Var, i));
        arrayList.add(new apb(this.c, 0, new Class[]{lj6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        arrayList.add(new apb(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z, View view) {
        int i;
        long j;
        String str;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i2;
        final long j2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j3;
        String str2;
        final byte b;
        String str3;
        int i3;
        boolean z3;
        boolean z4;
        String str4;
        int i4;
        String str5;
        int i5;
        if (tLObject == null || (i = this.e1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j3 = r47.B1(channelParticipant.peer);
            z2 = channelParticipant.can_edit;
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i2 = channelParticipant.date;
            str2 = channelParticipant.rank;
            j = 0;
            tL_chatBannedRights = tL_chatBannedRights2;
        } else {
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                j = 0;
                str = null;
                z2 = false;
                tL_chatAdminRights = null;
                i2 = 0;
                j2 = 0;
                tL_chatBannedRights = null;
                if (j2 == j && j2 != getUserConfig().e()) {
                    boolean z5 = this.s;
                    int i6 = this.O;
                    if (i6 != 2) {
                        String str6 = str;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                        final byte b2 = 1;
                        fu5 I = fu5.I(this, view);
                        if (i6 == 3 && xc2.w(2, this.n)) {
                            String M0 = ob6.M0(2131752386, null);
                            da7 da7Var = new da7((Object) this, j2, (Object) tL_chatBannedRights, (Object) str6, (Object) tLObject, (byte) 2);
                            final byte b3 = 0;
                            I.b(R.drawable.msg_permissions, M0, da7Var, false);
                            I.b(R.drawable.msg_delete, ob6.M0(2131752394, "ChannelDeleteFromList"), new Runnable(this) { // from class: df2
                                public final /* synthetic */ bg2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b4 = b3;
                                    bg2 bg2Var = this.b;
                                    long j4 = j2;
                                    switch (b4) {
                                        case 0:
                                            bg2Var.i0(j4);
                                            break;
                                        case 1:
                                            bg2 bg2Var2 = this.b;
                                            bg2Var2.i0(j4);
                                            bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j4)), null, bg2Var2, false, null, null);
                                            break;
                                        case 2:
                                            bg2Var.i0(j4);
                                            break;
                                        default:
                                            bg2 bg2Var3 = this.b;
                                            bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j4)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                            bg2Var3.z0(j4);
                                            break;
                                    }
                                }
                            }, true);
                        } else if (i6 == 0 && xc2.w(2, this.n)) {
                            if (xc2.w(3, this.n) && j2 > j && !xc2.Y(this.n)) {
                                if (z5) {
                                    i3 = 2131752505;
                                    str3 = null;
                                } else {
                                    str3 = null;
                                    i3 = 2131752503;
                                }
                                I.b(R.drawable.msg_contact_add, ob6.M0(i3, str3), new Runnable(this) { // from class: df2
                                    public final /* synthetic */ bg2 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b2;
                                        bg2 bg2Var = this.b;
                                        long j4 = j2;
                                        switch (b4) {
                                            case 0:
                                                bg2Var.i0(j4);
                                                break;
                                            case 1:
                                                bg2 bg2Var2 = this.b;
                                                bg2Var2.i0(j4);
                                                bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j4)), null, bg2Var2, false, null, null);
                                                break;
                                            case 2:
                                                bg2Var.i0(j4);
                                                break;
                                            default:
                                                bg2 bg2Var3 = this.b;
                                                bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j4)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                                bg2Var3.z0(j4);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            final byte b4 = 2;
                            I.b(R.drawable.msg_delete, ob6.M0(2131752394, "ChannelDeleteFromList"), new Runnable(this) { // from class: df2
                                public final /* synthetic */ bg2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b42 = b4;
                                    bg2 bg2Var = this.b;
                                    long j4 = j2;
                                    switch (b42) {
                                        case 0:
                                            bg2Var.i0(j4);
                                            break;
                                        case 1:
                                            bg2 bg2Var2 = this.b;
                                            bg2Var2.i0(j4);
                                            bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j4)), null, bg2Var2, false, null, null);
                                            break;
                                        case 2:
                                            bg2Var.i0(j4);
                                            break;
                                        default:
                                            bg2 bg2Var3 = this.b;
                                            bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j4)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                            bg2Var3.z0(j4);
                                            break;
                                    }
                                }
                            }, true);
                        } else if (i6 == 1 && xc2.w(4, this.n) && z2) {
                            if (this.n.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                                b = 3;
                                I.b(R.drawable.msg_admins, ob6.M0(2131751269, "EditAdminRights"), new da7((Object) this, j2, (Object) tL_chatAdminRights2, (Object) str6, (Object) tLObject, (byte) 3), false);
                            } else {
                                b = 3;
                            }
                            I.b(R.drawable.msg_remove, ob6.M0(2131752281, "ChannelRemoveUserAdmin"), new Runnable(this) { // from class: df2
                                public final /* synthetic */ bg2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b42 = b;
                                    bg2 bg2Var = this.b;
                                    long j4 = j2;
                                    switch (b42) {
                                        case 0:
                                            bg2Var.i0(j4);
                                            break;
                                        case 1:
                                            bg2 bg2Var2 = this.b;
                                            bg2Var2.i0(j4);
                                            bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j4)), null, bg2Var2, false, null, null);
                                            break;
                                        case 2:
                                            bg2Var.i0(j4);
                                            break;
                                        default:
                                            bg2 bg2Var3 = this.b;
                                            bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j4)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                            bg2Var3.z0(j4);
                                            break;
                                    }
                                }
                            }, true);
                        }
                        I.X(this.c.W0(view, false));
                        I.Y = jn7.T2;
                        boolean z6 = I.y() > 0;
                        if (z || !z6) {
                            return z6;
                        }
                        I.a0();
                        return true;
                    }
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
                    byte b5 = 1;
                    boolean z7 = xc2.w(4, this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z2);
                    boolean z8 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
                    boolean z9 = !(z8 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z2;
                    boolean z10 = z8 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                    boolean z11 = xc2.w(2, this.n) && z9 && !z5 && xc2.T(this.n) && !this.n.gigagroup;
                    if (i == 0) {
                        z7 &= !lbc.z(X1);
                    }
                    if (z7) {
                        z3 = z11;
                    } else {
                        z3 = z11;
                        if (!xc2.w(2, this.n) || !z9) {
                            z4 = false;
                            if (!z || !z4) {
                                return z4;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                            int i7 = i2;
                            boolean z12 = z7;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
                            boolean z13 = z3;
                            boolean z14 = z10;
                            le leVar = new le(this, j2, i7, tLObject, tL_chatAdminRights3, tL_chatBannedRights3, str, z9);
                            long j4 = j2;
                            fu5 I2 = fu5.I(this, view);
                            I2.X(this.c.W0(view, false));
                            if (z14) {
                                i4 = 2131751269;
                                str4 = null;
                            } else {
                                str4 = null;
                                i4 = 2131745275;
                            }
                            I2.k(R.drawable.msg_admins, ob6.M0(i4, str4), new vd2(leVar, b5), z12);
                            I2.k(R.drawable.msg_permissions, ob6.M0(2131752521, "ChangePermissions"), new ao1(this, tLObject, X1, leVar, (byte) 10), z13);
                            boolean z15 = xc2.w(2, this.n) && z9;
                            if (z5) {
                                str5 = "ChannelRemoveUser";
                                i5 = 2131752282;
                            } else {
                                str5 = "KickFromGroup";
                                i5 = 2131748809;
                            }
                            I2.l(R.drawable.msg_remove, new ue2((Object) this, (Object) X1, j4, (byte) 19), ob6.M0(i5, str5), z15, true);
                            I2.Y = jn7.T2;
                            I2.a0();
                            return true;
                        }
                    }
                    z4 = true;
                    if (!z) {
                    }
                    return z4;
                }
            }
            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
            j3 = chatParticipant.user_id;
            i2 = chatParticipant.date;
            z2 = xc2.w(4, this.n);
            str2 = "";
            j = 0;
            tL_chatBannedRights = null;
            tL_chatAdminRights = null;
        }
        str = str2;
        j2 = j3;
        return j2 == j ? false : false;
    }

    public final void i0(long j) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().j1(j);
            tL_communities_toggleParticipantBanned.community = getMessagesController().h1(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new ic((byte) 0), new n82(this, (byte) 3));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().j1(j);
        tL_channels_editBanned.channel = getMessagesController().h1(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new ye(this, (byte) 14));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.slowmode_seconds;
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 30) {
            return 3;
        }
        if (i == 60) {
            return 4;
        }
        if (i == 300) {
            return 5;
        }
        if (i == 900) {
            return 6;
        }
        return i == 3600 ? 7 : 0;
    }

    public final int l0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i : Math.max(i, arrayList.size());
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z = this.r1 && q0();
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull != null) {
            int i = chatFull.boosts_unrestrict;
            int i2 = this.s1;
            if (i != i2 || (!z ? i2 != 0 : i2 == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        return g0(z);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, jn7.T);
        getNotificationCenter().b(this, jn7.y1);
        t0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.T);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        xf2 xf2Var = this.a;
        if (xf2Var != null) {
            xf2Var.f();
        }
        z2b z2bVar = this.b;
        if (z2bVar != null) {
            z2bVar.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            G0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.B1 = true;
            if (z2 || !this.n1) {
                return;
            }
            this.f.getSearchField().requestFocus();
            hl.E3(this.f.getSearchField());
            this.f.setVisibility(8);
        }
    }

    public final boolean p0(int i) {
        return i == this.V || i == this.W || i == this.X || i == this.Y || i == this.Z || i == this.a0 || i == this.k0 || i == this.b0 || i == this.c0 || i == this.d0;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.n;
        if (!chat.megagroup || chat.gigagroup || !xc2.y(13, chat)) {
            return false;
        }
        if (this.p1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.E;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(int i, View view) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View m;
        TLObject tLObject;
        long j;
        long j2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        String str;
        boolean z;
        TLObject tLObject2;
        int i2;
        boolean w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        final byte b = 0;
        final byte b2 = 1;
        boolean z2 = this.c.getAdapter() == this.a;
        int i3 = this.h1;
        zh6 zh6Var = this.K;
        zh6 zh6Var2 = this.M;
        boolean z3 = this.s;
        int i4 = this.O;
        if (i == i3) {
            boolean z4 = !this.v1;
            this.v1 = z4;
            ((wkb) view).setChecked(z4);
            hl.V3(this.c);
            vf2 A0 = A0();
            F0();
            D0(A0);
            this.a.g(this.j1);
        } else if (i == this.i1) {
            boolean z5 = !this.w1;
            this.w1 = z5;
            ((wkb) view).setChecked(z5);
            hl.V3(this.c);
            vf2 A02 = A0();
            F0();
            D0(A02);
            this.a.g(this.j1);
        } else if (i == this.n0) {
            boolean z6 = !this.y1;
            this.y1 = z6;
            ((wkb) view).setChecked(z6);
            hl.V3(this.c);
            vf2 A03 = A0();
            F0();
            D0(A03);
            this.a.g(this.n0);
        } else if (z2) {
            if (p0(i)) {
                sg2 sg2Var = (sg2) view;
                if (i == this.V) {
                    this.E.send_photos = !r14.send_photos;
                } else if (i == this.W) {
                    this.E.send_videos = !r14.send_videos;
                } else if (i == this.X) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
                    boolean z7 = !tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights2.send_inline = z7;
                    tL_chatBannedRights2.send_gifs = z7;
                    tL_chatBannedRights2.send_games = z7;
                    tL_chatBannedRights2.send_stickers = z7;
                } else if (i == this.Y) {
                    this.E.send_audios = !r14.send_audios;
                } else if (i == this.Z) {
                    this.E.send_docs = !r14.send_docs;
                } else if (i == this.a0) {
                    this.E.send_voices = !r14.send_voices;
                } else if (i == this.b0) {
                    this.E.send_roundvideos = !r14.send_roundvideos;
                } else if (i == this.c0) {
                    if (this.E.send_plain && (m = this.d.m(this.T)) != null) {
                        hl.B3(m);
                        yw0.E.a();
                        return;
                    } else {
                        this.E.embed_links = !r14.embed_links;
                    }
                } else if (i == this.d0) {
                    this.E.send_polls = !r14.send_polls;
                } else if (i == this.k0) {
                    this.E.send_reactions = !r14.send_reactions;
                }
                sg2Var.c(!sg2Var.b(), true);
                hl.V3(this.c);
                vf2 A04 = A0();
                F0();
                D0(A04);
            } else if (i == this.Q0) {
                vkb vkbVar = (vkb) view;
                boolean z8 = !vkbVar.d.h;
                this.r1 = z8;
                vkbVar.setChecked(z8);
                hl.V3(this.c);
                vf2 A05 = A0();
                F0();
                D0(A05);
            } else {
                if (i == this.z0) {
                    if (i4 == 0 || i4 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.N);
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle.putInt("selectType", i4 == 0 ? 2 : 3);
                        bg2 bg2Var = new bg2(bundle);
                        bg2Var.B0(this.r);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.E;
                        if (tL_chatBannedRights3 != null) {
                            bg2Var.E = tL_chatBannedRights3;
                        }
                        bg2Var.m1 = new qf2(this);
                        presentFragment(bg2Var);
                        return;
                    }
                    if (i4 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", this.N);
                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle2.putInt("selectType", 1);
                        bg2 bg2Var2 = new bg2(bundle2);
                        bg2Var2.m1 = new rf2(this);
                        bg2Var2.B0(this.r);
                        presentFragment(bg2Var2);
                        return;
                    }
                    if (i4 == 2) {
                        Bundle l = bs2.l("addToGroup", true);
                        l.putLong(z3 ? "channelId" : "chatId", this.n.id);
                        rc5 rc5Var = new rc5(l);
                        rc5Var.J = this.r;
                        if (zh6Var2 != null && zh6Var2.m() != 0) {
                            zh6Var = zh6Var2;
                        }
                        rc5Var.K = zh6Var;
                        rc5Var.y = new sf2(this, rc5Var);
                        presentFragment(rc5Var);
                        return;
                    }
                    return;
                }
                if (i == this.v0) {
                    presentFragment(new wf1(this.n));
                    return;
                }
                if (i == this.x0) {
                    final skb skbVar = (skb) view;
                    TLRPC.ChatFull chatFull3 = this.r;
                    if (chatFull3 != null && !chatFull3.antispam && l0() < getMessagesController().k4.y1.f()) {
                        c00.v(ob6.G(getMessagesController().k4.y1.f(), "ChannelAntiSpamForbidden", new Object[0]), d31.b0(this), R.raw.msg_antispam, 36);
                        return;
                    }
                    if (this.r == null || !xc2.y(13, this.n) || this.w0) {
                        return;
                    }
                    this.w0 = true;
                    final boolean z9 = this.r.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = getMessagesController().h1(this.N);
                    TLRPC.ChatFull chatFull4 = this.r;
                    boolean z10 = !chatFull4.antispam;
                    chatFull4.antispam = z10;
                    tL_channels_toggleAntiSpam.enabled = z10;
                    skbVar.setChecked(z10);
                    skbVar.getCheckBox().setIcon((xc2.y(13, this.n) && ((chatFull2 = this.r) == null || chatFull2.antispam || l0() >= getMessagesController().k4.y1.f())) ? 0 : R.drawable.permission_locked);
                    getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(this) { // from class: ff2
                        public final /* synthetic */ bg2 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            byte b3 = b;
                            final boolean z11 = z9;
                            final skb skbVar2 = skbVar;
                            final bg2 bg2Var3 = this.b;
                            final byte b4 = 0;
                            switch (b3) {
                                case 0:
                                    if (tLObject3 != null) {
                                        bg2Var3.getMessagesController().Y3((TLRPC.Updates) tLObject3, false);
                                        bg2Var3.getMessagesController().b4(bg2Var3.r);
                                    }
                                    if (tL_error != null) {
                                        bg2Var3.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            hl.c3(new Runnable() { // from class: gf2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull5;
                                                    TLRPC.ChatFull chatFull6;
                                                    byte b5 = b4;
                                                    int i5 = R.drawable.permission_locked;
                                                    boolean z12 = z11;
                                                    skb skbVar3 = skbVar2;
                                                    bg2 bg2Var4 = bg2Var3;
                                                    switch (b5) {
                                                        case 0:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.antispam = z12;
                                                                skbVar3.setChecked(z12);
                                                                Switch checkBox = skbVar3.getCheckBox();
                                                                if (xc2.y(13, bg2Var4.n) && ((chatFull5 = bg2Var4.r) == null || !chatFull5.antispam || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.y1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.participants_hidden = z12;
                                                                skbVar3.setChecked(z12);
                                                                Switch checkBox2 = skbVar3.getCheckBox();
                                                                if (xc2.y(2, bg2Var4.n) && ((chatFull6 = bg2Var4.r) == null || !chatFull6.participants_hidden || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.z1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox2.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    bg2Var3.w0 = false;
                                    break;
                                default:
                                    if (tLObject3 != null) {
                                        bg2Var3.getMessagesController().Y3((TLRPC.Updates) tLObject3, false);
                                        bg2Var3.getMessagesController().b4(bg2Var3.r);
                                    }
                                    if (tL_error != null) {
                                        bg2Var3.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            final byte b5 = 1;
                                            hl.c3(new Runnable() { // from class: gf2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull5;
                                                    TLRPC.ChatFull chatFull6;
                                                    byte b52 = b5;
                                                    int i5 = R.drawable.permission_locked;
                                                    boolean z12 = z11;
                                                    skb skbVar3 = skbVar2;
                                                    bg2 bg2Var4 = bg2Var3;
                                                    switch (b52) {
                                                        case 0:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.antispam = z12;
                                                                skbVar3.setChecked(z12);
                                                                Switch checkBox = skbVar3.getCheckBox();
                                                                if (xc2.y(13, bg2Var4.n) && ((chatFull5 = bg2Var4.r) == null || !chatFull5.antispam || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.y1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.participants_hidden = z12;
                                                                skbVar3.setChecked(z12);
                                                                Switch checkBox2 = skbVar3.getCheckBox();
                                                                if (xc2.y(2, bg2Var4.n) && ((chatFull6 = bg2Var4.r) == null || !chatFull6.participants_hidden || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.z1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox2.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    bg2Var3.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i == this.J0) {
                    final skb skbVar2 = (skb) view;
                    if (l0() < getMessagesController().k4.z1.f()) {
                        c00.v(ob6.G(getMessagesController().k4.z1.f(), "ChannelHiddenMembersForbidden", new Object[0]), d31.b0(this), R.raw.contacts_sync_off, 36);
                        return;
                    }
                    if (this.r == null || !xc2.y(2, this.n) || this.I0) {
                        return;
                    }
                    this.I0 = true;
                    final boolean z11 = this.r.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = getMessagesController().h1(this.N);
                    TLRPC.ChatFull chatFull5 = this.r;
                    boolean z12 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z12;
                    tL_channels_toggleParticipantsHidden.enabled = z12;
                    skbVar2.setChecked(z12);
                    Switch checkBox = skbVar2.getCheckBox();
                    if (!xc2.y(2, this.n) || ((chatFull = this.r) != null && !chatFull.participants_hidden && l0() < getMessagesController().k4.z1.f())) {
                        b = 2131232529;
                    }
                    checkBox.setIcon(b);
                    getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(this) { // from class: ff2
                        public final /* synthetic */ bg2 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            byte b3 = b2;
                            final boolean z112 = z11;
                            final skb skbVar22 = skbVar2;
                            final bg2 bg2Var3 = this.b;
                            final byte b4 = 0;
                            switch (b3) {
                                case 0:
                                    if (tLObject3 != null) {
                                        bg2Var3.getMessagesController().Y3((TLRPC.Updates) tLObject3, false);
                                        bg2Var3.getMessagesController().b4(bg2Var3.r);
                                    }
                                    if (tL_error != null) {
                                        bg2Var3.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            hl.c3(new Runnable() { // from class: gf2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull52;
                                                    TLRPC.ChatFull chatFull6;
                                                    byte b52 = b4;
                                                    int i5 = R.drawable.permission_locked;
                                                    boolean z122 = z112;
                                                    skb skbVar3 = skbVar22;
                                                    bg2 bg2Var4 = bg2Var3;
                                                    switch (b52) {
                                                        case 0:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.antispam = z122;
                                                                skbVar3.setChecked(z122);
                                                                Switch checkBox2 = skbVar3.getCheckBox();
                                                                if (xc2.y(13, bg2Var4.n) && ((chatFull52 = bg2Var4.r) == null || !chatFull52.antispam || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.y1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox2.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.participants_hidden = z122;
                                                                skbVar3.setChecked(z122);
                                                                Switch checkBox22 = skbVar3.getCheckBox();
                                                                if (xc2.y(2, bg2Var4.n) && ((chatFull6 = bg2Var4.r) == null || !chatFull6.participants_hidden || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.z1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox22.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    bg2Var3.w0 = false;
                                    break;
                                default:
                                    if (tLObject3 != null) {
                                        bg2Var3.getMessagesController().Y3((TLRPC.Updates) tLObject3, false);
                                        bg2Var3.getMessagesController().b4(bg2Var3.r);
                                    }
                                    if (tL_error != null) {
                                        bg2Var3.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            final byte b5 = 1;
                                            hl.c3(new Runnable() { // from class: gf2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull52;
                                                    TLRPC.ChatFull chatFull6;
                                                    byte b52 = b5;
                                                    int i5 = R.drawable.permission_locked;
                                                    boolean z122 = z112;
                                                    skb skbVar3 = skbVar22;
                                                    bg2 bg2Var4 = bg2Var3;
                                                    switch (b52) {
                                                        case 0:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.antispam = z122;
                                                                skbVar3.setChecked(z122);
                                                                Switch checkBox2 = skbVar3.getCheckBox();
                                                                if (xc2.y(13, bg2Var4.n) && ((chatFull52 = bg2Var4.r) == null || !chatFull52.antispam || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.y1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox2.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            if (bg2Var4.getParentActivity() != null) {
                                                                bg2Var4.r.participants_hidden = z122;
                                                                skbVar3.setChecked(z122);
                                                                Switch checkBox22 = skbVar3.getCheckBox();
                                                                if (xc2.y(2, bg2Var4.n) && ((chatFull6 = bg2Var4.r) == null || !chatFull6.participants_hidden || bg2Var4.l0() >= bg2Var4.getMessagesController().k4.z1.f())) {
                                                                    i5 = 0;
                                                                }
                                                                checkBox22.setIcon(i5);
                                                                bs2.v("UnknownError", 2131743534, d31.b0(bg2Var4), R.raw.error, 36);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    bg2Var3.I0 = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i == this.L0) {
                    if (this.n == null) {
                        return;
                    }
                    skb skbVar3 = (skb) view;
                    boolean d = skbVar3.d();
                    skbVar3.setChecked(!skbVar3.d());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = uc7.l1(this.n);
                    TLRPC.Chat chat = this.n;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.n.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !skbVar3.d();
                    getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new ic(b), new se2(this, skbVar3, d, b2));
                } else {
                    if (i == this.B0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", this.N);
                        bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bg2 bg2Var3 = new bg2(bundle3);
                        bg2Var3.B0(this.r);
                        presentFragment(bg2Var3);
                        return;
                    }
                    if (i == this.t0) {
                        showDialog(new tf2(this, getParentActivity(), this));
                    } else {
                        if (i == this.A0) {
                            if (this.r != null) {
                                ck6 ck6Var = new ck6(this.N, 0, 0L);
                                TLRPC.ChatFull chatFull6 = this.r;
                                ck6Var.l0(chatFull6, chatFull6.exported_invite);
                                presentFragment(ck6Var);
                                return;
                            }
                            return;
                        }
                        if ((i > this.S && i <= Math.max(this.l0, this.g0)) || i == this.m0) {
                            vkb vkbVar2 = (vkb) view;
                            boolean isEnabled = vkbVar2.isEnabled();
                            Switch r4 = vkbVar2.d;
                            if (isEnabled) {
                                if (r4.G != null) {
                                    if (xc2.t0(this.n) && (i == this.i0 || i == this.g0)) {
                                        xnb.x(null, 2131751250, d31.b0(this), null);
                                        return;
                                    } else if (xc2.Z(this.currentAccount, this.N) && (i == this.i0 || i == this.g0)) {
                                        xnb.x(null, 2131751251, d31.b0(this), null);
                                        return;
                                    } else {
                                        xnb.x("EditCantEditPermissions", 2131751252, d31.b0(this), null);
                                        return;
                                    }
                                }
                                if (i == this.U) {
                                    vf2 A06 = A0();
                                    this.l1 = !this.l1;
                                    hl.V3(this.c);
                                    D0(A06);
                                    return;
                                }
                                vkbVar2.setChecked(!r4.h);
                                if (i == this.g0) {
                                    this.E.change_info = !r0.change_info;
                                    return;
                                }
                                if (i == this.m0) {
                                    this.E.manage_linked_peers = !r0.manage_linked_peers;
                                    return;
                                }
                                if (i == this.h0) {
                                    this.E.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i == this.l0) {
                                    this.E.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i == this.i0) {
                                    this.E.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i == this.j0) {
                                    this.E.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i == this.T) {
                                    this.E.send_plain = !r1.send_plain;
                                    int i5 = this.c0;
                                    if (i5 >= 0) {
                                        this.a.g(i5);
                                    }
                                    int i6 = this.U;
                                    if (i6 >= 0) {
                                        this.a.g(i6);
                                    }
                                    vf2 A07 = A0();
                                    F0();
                                    D0(A07);
                                    return;
                                }
                                if (i == this.U) {
                                    vf2 A08 = A0();
                                    this.l1 = !this.l1;
                                    hl.V3(this.c);
                                    D0(A08);
                                    return;
                                }
                                if (i == this.e0) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.E;
                                    boolean z13 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z13;
                                    tL_chatBannedRights5.send_gifs = z13;
                                    tL_chatBannedRights5.send_games = z13;
                                    tL_chatBannedRights5.send_stickers = z13;
                                    return;
                                }
                                if (i == this.f0) {
                                    this.E.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i == this.d0) {
                                        this.E.send_polls = !r0.send_polls;
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
        if (z2) {
            TLObject E = this.a.E(i);
            if (E instanceof TLRPC.User) {
                tLObject2 = E;
                j2 = ((TLRPC.User) E).id;
                str = "";
                z = true;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                if (j2 == 0) {
                    return;
                }
                int i7 = this.e1;
                if (i7 != 0) {
                    if (i7 != 3 && i7 != 1) {
                        if (xc2.T(this.n)) {
                            getMessagesController().d0(this.N, getMessagesController().X1(Long.valueOf(j2)));
                            uf2 uf2Var = this.m1;
                            if (uf2Var != null) {
                                uf2Var.d(j2);
                            }
                            finishFragment();
                            return;
                        }
                        return;
                    }
                    if (i7 == 1 || !z || (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin))) {
                        x0(j2, tLObject2, tL_chatAdminRights, tL_chatBannedRights, str, z, i7 == 1 ? 0 : 1, i7 == 1 || i7 == 3);
                        return;
                    }
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(R.string.AppName, "AppName");
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.a0("AdminWillBeRemoved", null, 2131754343, lbc.r(X1));
                    alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new ny1(this, X1, tLObject2, tL_chatAdminRights, tL_chatBannedRights, str, z));
                    alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                    showDialog(idVar);
                    return;
                }
                if (i4 == 1) {
                    w = j2 != getUserConfig().e() && (this.n.creator || z);
                } else {
                    if (i4 == 0 || i4 == 3) {
                        i2 = 2;
                        w = xc2.w(2, this.n);
                        if (i4 != 0 || ((i4 != 1 && z3) || (i4 == i2 && i7 == 0))) {
                            if (j2 == getUserConfig().e()) {
                                Bundle bundle4 = new Bundle();
                                if (j2 > 0) {
                                    bundle4.putLong("user_id", j2);
                                } else {
                                    bundle4.putLong("chat_id", -j2);
                                }
                                presentFragment(new ProfileActivity(bundle4, null));
                                return;
                            }
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
                        pd2 pd2Var = new pd2(j2, this.N, tL_chatAdminRights, this.E, tL_chatBannedRights, str, i4 == 1 ? 0 : 1, w, tLObject2 == null, null);
                        pd2Var.Y0 = new if2(this, tLObject2);
                        presentFragment(pd2Var);
                        return;
                    }
                    w = false;
                }
                i2 = 2;
                if (i4 != 0) {
                }
                if (j2 == getUserConfig().e()) {
                }
            } else {
                if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    long B1 = r47.B1(channelParticipant.peer);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                    String str2 = channelParticipant.rank;
                    boolean z14 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
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
                        if (!z3) {
                            tL_chatAdminRights3.manage_call = true;
                        }
                    }
                    tL_chatAdminRights = tL_chatAdminRights3;
                    tL_chatBannedRights = tL_chatBannedRights6;
                    tLObject2 = E;
                    z = z14;
                    j2 = B1;
                    str = str2;
                } else if (E instanceof TLRPC.ChatParticipant) {
                    long j3 = ((TLRPC.ChatParticipant) E).user_id;
                    boolean z15 = this.n.creator;
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
                        if (!z3) {
                            tL_chatAdminRights2.manage_call = true;
                        }
                    } else {
                        tL_chatAdminRights2 = null;
                    }
                    tL_chatAdminRights = tL_chatAdminRights2;
                    tL_chatBannedRights = null;
                    tLObject2 = E;
                    z = z15;
                    str = "";
                    j2 = j3;
                } else {
                    str = "";
                    z = false;
                    tL_chatBannedRights = null;
                    tL_chatAdminRights = null;
                    tLObject2 = E;
                    j2 = 0;
                }
                if (j2 == 0) {
                }
            }
        } else {
            TLObject E2 = this.e.E(i);
            if (E2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E2;
                getMessagesController().i4(user, false, false);
                long j4 = user.id;
                int i8 = 0;
                while (true) {
                    if (i8 >= 3) {
                        tLObject = null;
                        break;
                    }
                    tLObject = (TLObject) (i8 == 0 ? zh6Var2 : i8 == 1 ? this.L : zh6Var).f(j4);
                    if (tLObject != null) {
                        break;
                    } else {
                        i8++;
                    }
                }
                j = j4;
            } else if ((E2 instanceof TLRPC.ChannelParticipant) || (E2 instanceof TLRPC.ChatParticipant)) {
                tLObject = E2;
                j = 0;
            } else {
                j = 0;
                tLObject = null;
            }
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                long B12 = r47.B1(channelParticipant2.peer);
                boolean z16 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                tL_chatAdminRights = channelParticipant2.admin_rights;
                tL_chatBannedRights = tL_chatBannedRights7;
                tLObject2 = tLObject;
                str = channelParticipant2.rank;
                z = z16;
                j2 = B12;
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                long j5 = ((TLRPC.ChatParticipant) tLObject).user_id;
                z = this.n.creator;
                j2 = j5;
                str = "";
                tLObject2 = tLObject;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j2 = j;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                str = "";
                z = tLObject == null;
                tLObject2 = tLObject;
            }
            if (j2 == 0) {
            }
        }
    }

    public final /* synthetic */ void s0(long j) {
        if (j != 0) {
            this.N = j;
            this.n = uc7.s1(this.currentAccount).M0(Long.valueOf(j));
            y0();
        }
    }

    public final void t0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.Q) {
            return;
        }
        int i = 0;
        this.J = false;
        this.I = false;
        boolean z = this.w;
        int i2 = this.O;
        zh6 zh6Var = this.L;
        ArrayList arrayList = this.G;
        zh6 zh6Var2 = this.M;
        ArrayList arrayList2 = this.H;
        zh6 zh6Var3 = this.K;
        ArrayList arrayList3 = this.F;
        if (z && i2 == 2) {
            this.Q = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            zh6Var3.b();
            zh6Var2.b();
            zh6Var.b();
            HashMap hashMap = lv2.r(this.currentAccount).h0;
            ArrayList arrayList4 = lv2.r(this.currentAccount).i0;
            int size = arrayList4.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList4.get(i3);
                i3++;
                ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                int size2 = arrayList5.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList5.get(i4);
                    i4++;
                    arrayList3.add(getMessagesController().X1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                }
            }
            F0();
            xf2 xf2Var = this.a;
            if (xf2Var != null) {
                xf2Var.f();
                return;
            }
            return;
        }
        if (xc2.T(this.n)) {
            this.Q = true;
            z2b z2bVar = this.b;
            if (z2bVar != null) {
                z2bVar.e(true, false);
            }
            xf2 xf2Var2 = this.a;
            if (xf2Var2 != null) {
                xf2Var2.f();
            }
            ArrayList u0 = u0();
            ArrayList arrayList6 = new ArrayList();
            on1 on1Var = new on1(this, u0, arrayList6, (byte) 23);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i5 = 0; i5 < u0.size(); i5++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) u0.get(i5), new eu0((Object) arrayList6, i5, (Object) atomicInteger, (Object) u0, (Object) on1Var, (byte) 3)), this.classGuid);
            }
            return;
        }
        this.Q = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        zh6Var3.b();
        zh6Var2.b();
        zh6Var.b();
        if (i2 == 1) {
            TLRPC.ChatFull chatFull2 = this.r;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.r.participants.participants.get(i);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    zh6Var3.k(chatParticipant.user_id, chatParticipant);
                    i++;
                }
            }
        } else if (i2 == 2 && (chatFull = this.r) != null && chatFull.participants != null) {
            long j = getUserConfig().n;
            int size4 = this.r.participants.participants.size();
            while (i < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.r.participants.participants.get(i);
                int i6 = this.e1;
                if (i6 == 0 || chatParticipant2.user_id != j) {
                    if (i6 == 1) {
                        if (getContactsController().x(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            zh6Var2.k(chatParticipant2.user_id, chatParticipant2);
                        } else if (!lbc.z(getMessagesController().X1(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            zh6Var3.k(chatParticipant2.user_id, chatParticipant2);
                        }
                    } else if (getContactsController().x(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        zh6Var2.k(chatParticipant2.user_id, chatParticipant2);
                    } else {
                        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(chatParticipant2.user_id));
                        if (X1 == null || !X1.bot) {
                            arrayList3.add(chatParticipant2);
                            zh6Var3.k(chatParticipant2.user_id, chatParticipant2);
                        } else {
                            arrayList.add(chatParticipant2);
                            zh6Var.k(chatParticipant2.user_id, chatParticipant2);
                        }
                    }
                }
                i++;
            }
        }
        xf2 xf2Var3 = this.a;
        if (xf2Var3 != null) {
            xf2Var3.f();
        }
        F0();
        xf2 xf2Var4 = this.a;
        if (xf2Var4 != null) {
            xf2Var4.f();
        }
    }

    public final ArrayList u0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().h1(this.N);
        int i = this.O;
        if (i == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i == 2) {
            TLRPC.ChatFull chatFull = this.r;
            if (chatFull == null || chatFull.participants_count > 200 || (chat = this.n) == null || !chat.megagroup) {
                boolean z = this.J;
                if (this.e1 == 1) {
                    if (z) {
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                    } else {
                        this.k1 = 2;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                        this.J = true;
                        arrayList.addAll(u0());
                    }
                } else if (!z) {
                    this.k1 = 3;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(u0());
                } else if (this.I) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                    this.I = true;
                    arrayList.addAll(u0());
                }
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = jn7.d3;
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(TLRPC.User user) {
        zh6 zh6Var;
        ArrayList arrayList;
        boolean z;
        UndoView undoView = this.h;
        long j = -this.N;
        boolean z2 = this.s;
        undoView.m(j, user, z2 ? 9 : 10);
        this.n.creator = false;
        int i = 0;
        boolean z3 = false;
        while (true) {
            zh6Var = this.K;
            arrayList = this.F;
            if (i >= 3) {
                break;
            }
            boolean z4 = true;
            if (i == 0) {
                zh6Var = this.M;
                arrayList = this.H;
            } else if (i == 1) {
                zh6Var = this.L;
                arrayList = this.G;
            }
            TLObject tLObject = (TLObject) zh6Var.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j2 = user.id;
                tL_peerUser.user_id = j2;
                zh6Var.k(j2, tL_channelParticipantCreator);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z3 = true;
                z = true;
            } else {
                z = false;
            }
            long e = getUserConfig().e();
            TLObject tLObject2 = (TLObject) zh6Var.f(e);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e;
                tL_channelParticipantAdmin.promoted_by = e;
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
                if (!z2) {
                    tL_chatAdminRights.manage_call = true;
                }
                zh6Var.k(e, tL_channelParticipantAdmin);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z4 = z;
            }
            if (z4) {
                Collections.sort(arrayList, new ta((byte) 27));
            }
            i++;
        }
        if (!z3) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j3 = user.id;
            tL_peerUser3.user_id = j3;
            zh6Var.k(j3, tL_channelParticipantCreator2);
            arrayList.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList, new ta((byte) 26));
            F0();
        }
        this.a.f();
        uf2 uf2Var = this.m1;
        if (uf2Var != null) {
            uf2Var.a(user);
        }
    }

    public final void x0(long j, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, int i, boolean z2) {
        pd2 pd2Var = new pd2(j, this.N, tL_chatAdminRights, this.E, tL_chatBannedRights, str, i, z, tLObject == null, null);
        pd2Var.Y0 = new lf2(this, tLObject, j, z2);
        presentFragment(pd2Var, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if ((r15 && r6.w1) != r6.u1) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0() {
        bg2 bg2Var;
        TLRPC.ChatFull chatFull;
        byte b = 0;
        byte b2 = 1;
        int i = this.O;
        if (i == 3) {
            TLRPC.Chat chat = this.n;
            if (chat.creator && !xc2.T(chat) && ((this.p1 != this.q1 || this.y1) && this.r != null)) {
                uc7.s1(this.currentAccount).R(getParentActivity(), this.N, this, new ef2(this, b), null);
                return;
            }
            bg2Var = this;
            if (!xc2.D(bg2Var.E).equals(bg2Var.y)) {
                bg2Var.getMessagesController().U4(bg2Var.N, bg2Var.E, xc2.T(bg2Var.n), bg2Var);
                TLRPC.Chat M0 = bg2Var.getMessagesController().M0(Long.valueOf(bg2Var.N));
                if (M0 != null) {
                    M0.default_banned_rights = bg2Var.E;
                }
            }
            int i2 = bg2Var.p1;
            if (i2 != bg2Var.q1 && (chatFull = bg2Var.r) != null) {
                chatFull.slowmode_seconds = m0(i2);
                bg2Var.r.flags |= 131072;
                uc7 messagesController = bg2Var.getMessagesController();
                long j = bg2Var.N;
                int i3 = bg2Var.r.slowmode_seconds;
                messagesController.getClass();
                TLRPC.TL_channels_toggleSlowMode tL_channels_toggleSlowMode = new TLRPC.TL_channels_toggleSlowMode();
                tL_channels_toggleSlowMode.seconds = i3;
                tL_channels_toggleSlowMode.channel = messagesController.h1(j);
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleSlowMode, new e77(messagesController, j, (byte) 13));
            }
            boolean z = bg2Var.y1;
            if (z != bg2Var.x1 || (z && bg2Var.z1 != bg2Var.A1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = bg2Var.getMessagesController().h1(bg2Var.N);
                updatepaidmessagesprice.send_paid_messages_stars = bg2Var.y1 ? bg2Var.A1 : 0L;
                bg2Var.getConnectionsManager().sendRequest(updatepaidmessagesprice, new xe2(b2));
                TLRPC.Chat M02 = bg2Var.getMessagesController().M0(Long.valueOf(bg2Var.N));
                if (M02 != null) {
                    boolean z2 = bg2Var.y1;
                    int i4 = M02.flags2;
                    if (z2) {
                        M02.flags2 = i4 | TLObject.FLAG_14;
                        M02.send_paid_messages_stars = bg2Var.A1;
                    } else {
                        M02.flags2 = i4 & (-16385);
                        M02.send_paid_messages_stars = 0L;
                    }
                    bg2Var.getMessagesController().a4(M02, true);
                }
            }
            if (bg2Var.o0()) {
                boolean z3 = bg2Var.r1 && bg2Var.q0();
                int i5 = bg2Var.s1;
                if (z3) {
                    if (i5 == 0) {
                        bg2Var.getMessagesController().Q4(1, bg2Var.N);
                    }
                    bg2Var.getMessagesController().Q4(bg2Var.s1, bg2Var.N);
                } else {
                    if (i5 != 0) {
                        bg2Var.getMessagesController().Q4(0, bg2Var.N);
                    }
                    bg2Var.getMessagesController().Q4(bg2Var.s1, bg2Var.N);
                }
            }
        } else {
            bg2Var = this;
            if (i == 1) {
                boolean z4 = bg2Var.v1;
                if (z4 == bg2Var.t1) {
                }
                uc7 messagesController2 = bg2Var.getMessagesController();
                long j2 = bg2Var.N;
                boolean z5 = bg2Var.v1;
                boolean z6 = z5 && bg2Var.w1;
                TLRPC.Chat M03 = messagesController2.M0(Long.valueOf(j2));
                if (M03 != null) {
                    M03.signatures = z5;
                    M03.signature_profiles = z6;
                    messagesController2.a4(M03, true);
                }
                TLRPC.TL_channels_toggleSignatures tL_channels_toggleSignatures = new TLRPC.TL_channels_toggleSignatures();
                tL_channels_toggleSignatures.channel = messagesController2.h1(j2);
                tL_channels_toggleSignatures.signatures_enabled = z5;
                tL_channels_toggleSignatures.profiles_enabled = z6;
                messagesController2.getConnectionsManager().sendRequest(tL_channels_toggleSignatures, new h77(messagesController2, (byte) 11), 64);
                messagesController2.getNotificationCenter().k(jn7.G3, Long.valueOf(-j2));
            }
        }
        bg2Var.finishFragment();
    }

    public final void z0(long j) {
        zh6 zh6Var;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        vf2 A0 = A0();
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                zh6Var = this.M;
                arrayList = this.H;
            } else if (i == 1) {
                zh6Var = this.L;
                arrayList = this.G;
            } else {
                zh6Var = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) zh6Var.f(j);
            if (tLObject != null) {
                zh6Var.l(j);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.r) != null) {
                    chatFull.kicked_count--;
                }
                z = true;
            }
        }
        if (z) {
            D0(A0);
        }
        j79 adapter = this.c.getAdapter();
        ag2 ag2Var = this.e;
        if (adapter == ag2Var) {
            sv9 sv9Var = ag2Var.h;
            Object f = sv9Var.f.f(j);
            if (f != null) {
                sv9Var.e.remove(f);
            }
            Object f2 = sv9Var.h.f(j);
            if (f2 != null) {
                sv9Var.g.remove(f2);
            }
            Object f3 = ag2Var.e.f(j);
            if (f3 != null) {
                ag2Var.d.remove(f3);
            }
            ag2Var.f();
        }
    }
}
