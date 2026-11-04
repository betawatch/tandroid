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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g50 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.ActionBar.f5 M;
    public boolean N;
    public final boolean O;
    public d50 P;
    public FrameLayout a;
    public org.telegram.ui.Components.zu0 b;
    public org.telegram.ui.Components.iz c;
    public org.telegram.ui.Components.tj0 d;
    public e50 e;
    public f50 f;
    public u4.b0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull w;
    public final long x;
    public int y;

    public g50(long j10) {
        super(null);
        this.n = -1;
        this.x = j10;
    }

    public static /* synthetic */ void Z(g50 g50Var, View view, int i3) {
        if (g50Var.getParentActivity() == null) {
            return;
        }
        if (!g50Var.N) {
            if (i3 >= g50Var.F && i3 < g50Var.G) {
                g50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.li.b0(g50Var.currentAccount).s0(g50Var.h0()).get(i3 - g50Var.F), ((org.telegram.ui.Cells.f8) view).a(), false);
            }
            if (i3 == g50Var.K) {
                g50Var.i0(g50Var.r, true, false);
                return;
            }
            return;
        }
        if (i3 > g50Var.f.d.size()) {
            boolean a10 = ((org.telegram.ui.Cells.f8) view).a();
            f50 f50Var = g50Var.f;
            g50Var.i0((TLRPC.TL_messages_stickerSet) f50Var.e.get((i3 - f50Var.d.size()) - 1), a10, false);
        } else if (i3 != g50Var.f.d.size()) {
            g50Var.i0((TLRPC.TL_messages_stickerSet) g50Var.f.d.get(i3), ((org.telegram.ui.Cells.f8) view).a(), true);
        }
    }

    public static void a0(g50 g50Var, TLRPC.TL_error tL_error) {
        boolean z10 = g50Var.O;
        if (tL_error != null) {
            if (g50Var.getParentActivity() != null) {
                Activity parentActivity = g50Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = g50Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                g50Var.w.emojiset = stickerSet;
            } else {
                g50Var.w.stickerset = stickerSet;
            }
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(g50Var.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = g50Var.r;
            b02.N.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.id);
        } else if (z10) {
            g50Var.w.emojiset = null;
        } else {
            g50Var.w.stickerset = null;
        }
        g50Var.m0();
        if (z10) {
            TLRPC.ChatFull chatFull = g50Var.w;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = g50Var.w;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        org.telegram.messenger.qr.a0(g50Var.currentAccount).N1(g50Var.w, false);
        org.telegram.messenger.hs.f(g50Var.currentAccount).k(org.telegram.messenger.hs.T, g50Var.w, 0, Boolean.TRUE, Boolean.FALSE);
        org.telegram.messenger.hs.f(g50Var.currentAccount).k(org.telegram.messenger.hs.q3, Long.valueOf(g50Var.w.id), Boolean.valueOf(z10));
        g50Var.finishFragment();
    }

    public static void f0(g50 g50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i3 = g50Var.n;
        if (tL_messages_stickerSet == null) {
            if (g50Var.r != null) {
                org.telegram.messenger.k5.o(null, 2131749386, org.telegram.ui.Components.fc.a0(g50Var), R.raw.done, 36);
            }
            g50Var.r = null;
            g50Var.s = true;
        } else {
            g50Var.r = tL_messages_stickerSet;
            g50Var.s = false;
            org.telegram.messenger.k5.o(null, 2131749386, org.telegram.ui.Components.fc.a0(g50Var), R.raw.done, 36);
        }
        g50Var.m0();
        g50Var.k0(g50Var.r, false);
        if (i3 != -1) {
            if (!g50Var.N) {
                for (int i10 = 0; i10 < g50Var.d.getChildCount(); i10++) {
                    View childAt = g50Var.d.getChildAt(i10);
                    if (g50Var.d.T(childAt).b() == g50Var.F + i3) {
                        ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                        break;
                    }
                }
            }
            g50Var.e.g(g50Var.F + i3);
        }
        if (g50Var.n != -1) {
            if (!g50Var.N) {
                for (int i11 = 0; i11 < g50Var.d.getChildCount(); i11++) {
                    View childAt2 = g50Var.d.getChildAt(i11);
                    if (g50Var.d.T(childAt2).b() == g50Var.F + g50Var.n) {
                        ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            g50Var.e.g(g50Var.F + g50Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(this.O ? 2131749451 : 2131749405, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 8));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        this.M = b10;
        b10.N();
        b10.C0 = new lg.w1(this, 12);
        this.M.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.e = new e50(this, context);
        this.f = new f50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.d = tj0Var;
        tj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.n(200L);
        kVar.m = true;
        this.d.setItemAnimator(kVar);
        u4.b0 b0Var = new u4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout2, null);
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, getResourceProvider());
        this.c = izVar;
        izVar.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.q.y / org.telegram.messenger.g0.N(58.0f)));
        this.a.addView(this.c, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, this.c, 1, null);
        this.b = zu0Var;
        k4.j.k(zu0Var);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new h3(this, 16));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.T) {
            if (i3 == org.telegram.messenger.hs.B0) {
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
                this.r = org.telegram.messenger.li.b0(this.currentAccount).Y(g0(chatFull));
            }
            this.w = chatFull;
            l0(true);
        }
    }

    public final TLRPC.StickerSet g0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.O ? chatFull.emojiset : chatFull.stickerset;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h0() {
        return this.O ? 5 : 0;
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
        org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        xv0Var.V1 = new b50(this, z10, tL_messages_stickerSet);
        xv0Var.Z0();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        xv0Var.show();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.w = chatFull;
        if (g0(chatFull) != null) {
            this.r = org.telegram.messenger.li.b0(this.currentAccount).Y(g0(this.w));
        }
    }

    public final void k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.O) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.K == -1;
                this.r = tL_messages_stickerSet;
                l0(false);
                if (z11) {
                    this.e.i(this.K);
                } else {
                    this.e.g(this.K);
                }
                if (z10) {
                    this.e.g(this.J);
                }
                d50 d50Var = this.P;
                d50Var.b = true;
                d50Var.invalidate();
                return;
            }
            int i3 = this.K;
            boolean z12 = i3 > 0;
            this.r = null;
            if (z12) {
                this.e.s(i3);
                if (z10) {
                    this.e.g(this.J);
                }
            }
            l0(false);
            d50 d50Var2 = this.P;
            d50Var2.b = false;
            d50Var2.invalidate();
        }
    }

    public final void l0(boolean z10) {
        e50 e50Var;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.H = 0;
        if (this.O) {
            this.I = 0;
            this.H = 2;
            this.J = 1;
            if (this.r != null) {
                this.H = 3;
                this.K = 2;
            }
            int i3 = this.H;
            this.H = i3 + 1;
            this.L = i3;
        }
        ArrayList s02 = org.telegram.messenger.li.b0(this.currentAccount).s0(h0());
        if (s02.isEmpty()) {
            this.E = -1;
            this.F = -1;
            this.G = -1;
        } else {
            int i10 = this.H;
            int i11 = i10 + 1;
            this.H = i11;
            this.E = i10;
            this.F = i11;
            this.G = s02.size() + i11;
            this.H = s02.size() + this.H;
        }
        int i12 = this.H;
        this.H = i12 + 1;
        this.y = i12;
        m0();
        if (!z10 || (e50Var = this.e) == null) {
            return;
        }
        e50Var.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0() {
        long j10;
        ArrayList s02 = org.telegram.messenger.li.b0(this.currentAccount).s0(h0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j10 = tL_messages_stickerSet.set.id;
            } else if (g0(this.w) != null) {
                j10 = g0(this.w).id;
            }
            if (j10 == 0) {
                for (int i3 = 0; i3 < s02.size(); i3++) {
                    if (((TLRPC.TL_messages_stickerSet) s02.get(i3)).set.id == j10) {
                        this.n = i3;
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.li.b0(this.currentAccount).B(h0());
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.x0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.B0);
        l0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.x0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.B0);
        if ((this.r != null || this.s) && (chatFull = this.w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != g0(this.w).id) {
                if (g0(this.w) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.O;
                long j10 = this.x;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = org.telegram.messenger.hp.s1(this.currentAccount).h1(j10);
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
                    tL_channels_setStickers2.channel = org.telegram.messenger.hp.s1(this.currentAccount).h1(j10);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        org.telegram.messenger.hp.s1(this.currentAccount).f7.edit().remove("group_hide_stickers_" + this.w.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.r.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tL_channels_setStickers = tL_channels_setStickers2;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new l(this, 10));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public g50(long j10, int i3) {
        super(null);
        this.n = -1;
        this.x = j10;
        this.O = true;
    }
}
