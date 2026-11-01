package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.p5 L;
    public boolean M;
    public final boolean N;
    public g60 O;
    public FrameLayout a;
    public org.telegram.ui.Components.ew0 b;
    public org.telegram.ui.Components.zz c;
    public org.telegram.ui.Components.uk0 d;
    public h60 e;
    public i60 f;
    public s4.a0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull w;
    public final long x;
    public int y;

    public j60(long j10) {
        super(null);
        this.n = -1;
        this.x = j10;
    }

    public static /* synthetic */ void Z(j60 j60Var, View view, int i10) {
        if (j60Var.getParentActivity() == null) {
            return;
        }
        if (!j60Var.M) {
            if (i10 >= j60Var.E && i10 < j60Var.F) {
                j60Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.vi.b0(j60Var.currentAccount).s0(j60Var.h0()).get(i10 - j60Var.E), ((org.telegram.ui.Cells.k8) view).a(), false);
            }
            if (i10 == j60Var.J) {
                j60Var.i0(j60Var.r, true, false);
                return;
            }
            return;
        }
        if (i10 > j60Var.f.d.size()) {
            boolean a2 = ((org.telegram.ui.Cells.k8) view).a();
            i60 i60Var = j60Var.f;
            j60Var.i0((TLRPC.TL_messages_stickerSet) i60Var.e.get((i10 - i60Var.d.size()) - 1), a2, false);
        } else if (i10 != j60Var.f.d.size()) {
            j60Var.i0((TLRPC.TL_messages_stickerSet) j60Var.f.d.get(i10), ((org.telegram.ui.Cells.k8) view).a(), true);
        }
    }

    public static void a0(j60 j60Var, TLRPC.TL_error tL_error) {
        boolean z10 = j60Var.N;
        if (tL_error != null) {
            if (j60Var.getParentActivity() != null) {
                Activity parentActivity = j60Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.a30.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = j60Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                j60Var.w.emojiset = stickerSet;
            } else {
                j60Var.w.stickerset = stickerSet;
            }
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(j60Var.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = j60Var.r;
            b02.M.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.id);
        } else if (z10) {
            j60Var.w.emojiset = null;
        } else {
            j60Var.w.stickerset = null;
        }
        j60Var.m0();
        if (z10) {
            TLRPC.ChatFull chatFull = j60Var.w;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = j60Var.w;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        org.telegram.messenger.is.a0(j60Var.currentAccount).N1(j60Var.w, false);
        org.telegram.messenger.at.f(j60Var.currentAccount).k(org.telegram.messenger.at.T, j60Var.w, 0, Boolean.TRUE, Boolean.FALSE);
        org.telegram.messenger.at.f(j60Var.currentAccount).k(org.telegram.messenger.at.q3, Long.valueOf(j60Var.w.id), Boolean.valueOf(z10));
        j60Var.finishFragment();
    }

    public static void f0(j60 j60Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = j60Var.n;
        if (tL_messages_stickerSet == null) {
            if (j60Var.r != null) {
                org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(j60Var), R.raw.done, 36);
            }
            j60Var.r = null;
            j60Var.s = true;
        } else {
            j60Var.r = tL_messages_stickerSet;
            j60Var.s = false;
            org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(j60Var), R.raw.done, 36);
        }
        j60Var.m0();
        j60Var.k0(j60Var.r, false);
        if (i10 != -1) {
            if (!j60Var.M) {
                for (int i11 = 0; i11 < j60Var.d.getChildCount(); i11++) {
                    View childAt = j60Var.d.getChildAt(i11);
                    if (j60Var.d.T(childAt).b() == j60Var.E + i10) {
                        ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                        break;
                    }
                }
            }
            j60Var.e.g(j60Var.E + i10);
        }
        if (j60Var.n != -1) {
            if (!j60Var.M) {
                for (int i12 = 0; i12 < j60Var.d.getChildCount(); i12++) {
                    View childAt2 = j60Var.d.getChildAt(i12);
                    if (j60Var.d.T(childAt2).b() == j60Var.E + j60Var.n) {
                        ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            j60Var.e.g(j60Var.E + j60Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(this.N ? 2131749452 : 2131749406, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 28));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        this.L = b10;
        b10.N();
        b10.B0 = new ag.l3(this, 12);
        this.L.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.e = new h60(this, context);
        this.f = new i60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.d = uk0Var;
        uk0Var.r1();
        this.d.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(200L);
        jVar.m = true;
        this.d.setItemAnimator(jVar);
        s4.a0 a0Var = new s4.a0();
        this.h = a0Var;
        a0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, frameLayout2, null);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, getResourceProvider());
        this.c = zzVar;
        zzVar.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(org.telegram.messenger.i0.q.y / org.telegram.messenger.i0.N(58.0f)));
        this.a.addView(this.c, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, this.c, 1, null);
        this.b = ew0Var;
        li.k.i(ew0Var);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new g(this, 14));
        this.d.setOnScrollListener(new h3(this, 16));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.at.T) {
            if (i10 == org.telegram.messenger.at.B0) {
                long longValue = ((Long) objArr[0]).longValue();
                if (g0(this.w) == null || g0(this.w).id != longValue) {
                    return;
                }
                l0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.x) {
            if (this.w == null && g0(chatFull) != null) {
                this.r = org.telegram.messenger.vi.b0(this.currentAccount).Y(g0(chatFull));
            }
            this.w = chatFull;
            l0(true);
        }
    }

    public final TLRPC.StickerSet g0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.N ? chatFull.emojiset : chatFull.stickerset;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h0() {
        return this.N ? 5 : 0;
    }

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.dx0 dx0Var = new org.telegram.ui.Components.dx0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        dx0Var.U1 = new e60(this, z10, tL_messages_stickerSet);
        dx0Var.Z0();
        org.telegram.messenger.i0.v1(getParentActivity().getCurrentFocus());
        dx0Var.show();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.w = chatFull;
        if (g0(chatFull) != null) {
            this.r = org.telegram.messenger.vi.b0(this.currentAccount).Y(g0(this.w));
        }
    }

    public final void k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.N) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.J == -1;
                this.r = tL_messages_stickerSet;
                l0(false);
                if (z11) {
                    this.e.i(this.J);
                } else {
                    this.e.g(this.J);
                }
                if (z10) {
                    this.e.g(this.I);
                }
                g60 g60Var = this.O;
                g60Var.b = true;
                g60Var.invalidate();
                return;
            }
            int i10 = this.J;
            boolean z12 = i10 > 0;
            this.r = null;
            if (z12) {
                this.e.s(i10);
                if (z10) {
                    this.e.g(this.I);
                }
            }
            l0(false);
            g60 g60Var2 = this.O;
            g60Var2.b = false;
            g60Var2.invalidate();
        }
    }

    public final void l0(boolean z10) {
        h60 h60Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList s02 = org.telegram.messenger.vi.b0(this.currentAccount).s0(h0());
        if (s02.isEmpty()) {
            this.D = -1;
            this.E = -1;
            this.F = -1;
        } else {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.D = i11;
            this.E = i12;
            this.F = s02.size() + i12;
            this.G = s02.size() + this.G;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.y = i13;
        m0();
        if (!z10 || (h60Var = this.e) == null) {
            return;
        }
        h60Var.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0() {
        long j10;
        ArrayList s02 = org.telegram.messenger.vi.b0(this.currentAccount).s0(h0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j10 = tL_messages_stickerSet.set.id;
            } else if (g0(this.w) != null) {
                j10 = g0(this.w).id;
            }
            if (j10 == 0) {
                for (int i10 = 0; i10 < s02.size(); i10++) {
                    if (((TLRPC.TL_messages_stickerSet) s02.get(i10)).set.id == j10) {
                        this.n = i10;
                        return;
                    }
                }
                return;
            }
            return;
        }
        j10 = 0;
        if (j10 == 0) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.vi.b0(this.currentAccount).B(h0());
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.x0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.B0);
        l0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.x0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.B0);
        if ((this.r != null || this.s) && (chatFull = this.w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != g0(this.w).id) {
                if (g0(this.w) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.N;
                long j10 = this.x;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = org.telegram.messenger.wp.r1(this.currentAccount).g1(j10);
                    if (this.s) {
                        tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    } else {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet = this.r.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                    tL_channels_setStickers2.channel = org.telegram.messenger.wp.r1(this.currentAccount).g1(j10);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        org.telegram.messenger.wp.r1(this.currentAccount).g7.edit().remove("group_hide_stickers_" + this.w.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.r.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tL_channels_setStickers = tL_channels_setStickers2;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new k(this, 10));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public j60(long j10, int i10) {
        super(null);
        this.n = -1;
        this.x = j10;
        this.N = true;
    }
}
