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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.f5 L;
    public boolean M;
    public final boolean N;
    public j50 O;
    public FrameLayout a;
    public org.telegram.ui.Components.av0 b;
    public org.telegram.ui.Components.lz c;
    public org.telegram.ui.Components.pj0 d;
    public k50 e;
    public l50 f;
    public v4.b0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull w;
    public final long x;
    public int y;

    public m50(long j3) {
        super(null);
        this.n = -1;
        this.x = j3;
    }

    public static /* synthetic */ void Z(m50 m50Var, View view, int i7) {
        if (m50Var.getParentActivity() == null) {
            return;
        }
        if (!m50Var.M) {
            if (i7 >= m50Var.E && i7 < m50Var.F) {
                m50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.ui.b0(m50Var.currentAccount).s0(m50Var.h0()).get(i7 - m50Var.E), ((org.telegram.ui.Cells.g8) view).a(), false);
            }
            if (i7 == m50Var.J) {
                m50Var.i0(m50Var.r, true, false);
                return;
            }
            return;
        }
        if (i7 > m50Var.f.d.size()) {
            boolean a10 = ((org.telegram.ui.Cells.g8) view).a();
            l50 l50Var = m50Var.f;
            m50Var.i0((TLRPC.TL_messages_stickerSet) l50Var.e.get((i7 - l50Var.d.size()) - 1), a10, false);
        } else if (i7 != m50Var.f.d.size()) {
            m50Var.i0((TLRPC.TL_messages_stickerSet) m50Var.f.d.get(i7), ((org.telegram.ui.Cells.g8) view).a(), true);
        }
    }

    public static void a0(m50 m50Var, TLRPC.TL_error tL_error) {
        boolean z9 = m50Var.N;
        if (tL_error != null) {
            if (m50Var.getParentActivity() != null) {
                Activity parentActivity = m50Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m50Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z9) {
                m50Var.w.emojiset = stickerSet;
            } else {
                m50Var.w.stickerset = stickerSet;
            }
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(m50Var.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m50Var.r;
            b02.M.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.id);
        } else if (z9) {
            m50Var.w.emojiset = null;
        } else {
            m50Var.w.stickerset = null;
        }
        m50Var.m0();
        if (z9) {
            TLRPC.ChatFull chatFull = m50Var.w;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = m50Var.w;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        org.telegram.messenger.yr.a0(m50Var.currentAccount).N1(m50Var.w, false);
        org.telegram.messenger.qs.f(m50Var.currentAccount).k(org.telegram.messenger.qs.T, m50Var.w, 0, Boolean.TRUE, Boolean.FALSE);
        org.telegram.messenger.qs.f(m50Var.currentAccount).k(org.telegram.messenger.qs.q3, Long.valueOf(m50Var.w.id), Boolean.valueOf(z9));
        m50Var.finishFragment();
    }

    public static void f0(m50 m50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7 = m50Var.n;
        if (tL_messages_stickerSet == null) {
            if (m50Var.r != null) {
                org.telegram.messenger.k5.o(null, 2131749377, org.telegram.ui.Components.hc.a0(m50Var), R.raw.done, 36);
            }
            m50Var.r = null;
            m50Var.s = true;
        } else {
            m50Var.r = tL_messages_stickerSet;
            m50Var.s = false;
            org.telegram.messenger.k5.o(null, 2131749377, org.telegram.ui.Components.hc.a0(m50Var), R.raw.done, 36);
        }
        m50Var.m0();
        m50Var.k0(m50Var.r, false);
        if (i7 != -1) {
            if (!m50Var.M) {
                for (int i10 = 0; i10 < m50Var.d.getChildCount(); i10++) {
                    View childAt = m50Var.d.getChildAt(i10);
                    if (m50Var.d.T(childAt).b() == m50Var.E + i7) {
                        ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                        break;
                    }
                }
            }
            m50Var.e.g(m50Var.E + i7);
        }
        if (m50Var.n != -1) {
            if (!m50Var.M) {
                for (int i11 = 0; i11 < m50Var.d.getChildCount(); i11++) {
                    View childAt2 = m50Var.d.getChildAt(i11);
                    if (m50Var.d.T(childAt2).b() == m50Var.E + m50Var.n) {
                        ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            m50Var.e.g(m50Var.E + m50Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(this.N ? 2131749442 : 2131749396, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 7));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        this.L = b10;
        b10.N();
        b10.B0 = new kg.v1(this, 12);
        this.L.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        this.e = new k50(this, context);
        this.f = new l50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.d = pj0Var;
        pj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(200L);
        kVar.m = true;
        this.d.setItemAnimator(kVar);
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout2, null);
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, getResourceProvider());
        this.c = lzVar;
        lzVar.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.q.y / org.telegram.messenger.g0.N(58.0f)));
        this.a.addView(this.c, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, this.c, 1, null);
        this.b = av0Var;
        h6.m.g(av0Var);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new g3(this, 16));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.T) {
            if (i7 == org.telegram.messenger.qs.B0) {
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
                this.r = org.telegram.messenger.ui.b0(this.currentAccount).Y(g0(chatFull));
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

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h0() {
        return this.N ? 5 : 0;
    }

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z9, boolean z10) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z10) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(getParentActivity(), this, tL_inputStickerSetShortName, !z10 ? tL_messages_stickerSet : null, null, null);
        yv0Var.U1 = new g50(this, z9, tL_messages_stickerSet);
        yv0Var.Z0();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        yv0Var.show();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.w = chatFull;
        if (g0(chatFull) != null) {
            this.r = org.telegram.messenger.ui.b0(this.currentAccount).Y(g0(this.w));
        }
    }

    public final void k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z9) {
        if (this.N) {
            if (tL_messages_stickerSet != null) {
                boolean z10 = this.J == -1;
                this.r = tL_messages_stickerSet;
                l0(false);
                if (z10) {
                    this.e.i(this.J);
                } else {
                    this.e.g(this.J);
                }
                if (z9) {
                    this.e.g(this.I);
                }
                j50 j50Var = this.O;
                j50Var.b = true;
                j50Var.invalidate();
                return;
            }
            int i7 = this.J;
            boolean z11 = i7 > 0;
            this.r = null;
            if (z11) {
                this.e.s(i7);
                if (z9) {
                    this.e.g(this.I);
                }
            }
            l0(false);
            j50 j50Var2 = this.O;
            j50Var2.b = false;
            j50Var2.invalidate();
        }
    }

    public final void l0(boolean z9) {
        k50 k50Var;
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
            int i7 = this.G;
            this.G = i7 + 1;
            this.K = i7;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(this.currentAccount).s0(h0());
        if (s02.isEmpty()) {
            this.D = -1;
            this.E = -1;
            this.F = -1;
        } else {
            int i10 = this.G;
            int i11 = i10 + 1;
            this.G = i11;
            this.D = i10;
            this.E = i11;
            this.F = s02.size() + i11;
            this.G = s02.size() + this.G;
        }
        int i12 = this.G;
        this.G = i12 + 1;
        this.y = i12;
        m0();
        if (!z9 || (k50Var = this.e) == null) {
            return;
        }
        k50Var.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0() {
        long j3;
        ArrayList s02 = org.telegram.messenger.ui.b0(this.currentAccount).s0(h0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j3 = tL_messages_stickerSet.set.id;
            } else if (g0(this.w) != null) {
                j3 = g0(this.w).id;
            }
            if (j3 == 0) {
                for (int i7 = 0; i7 < s02.size(); i7++) {
                    if (((TLRPC.TL_messages_stickerSet) s02.get(i7)).set.id == j3) {
                        this.n = i7;
                        return;
                    }
                }
                return;
            }
            return;
        }
        j3 = 0;
        if (j3 == 0) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ui.b0(this.currentAccount).B(h0());
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.x0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.B0);
        l0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.x0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.B0);
        if ((this.r != null || this.s) && (chatFull = this.w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != g0(this.w).id) {
                if (g0(this.w) == null && this.r == null) {
                    return;
                }
                boolean z9 = this.N;
                long j3 = this.x;
                if (z9) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
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
                    tL_channels_setStickers2.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        org.telegram.messenger.qp.s1(this.currentAccount).f7.edit().remove("group_hide_stickers_" + this.w.id).apply();
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public m50(long j3, int i7) {
        super(null);
        this.n = -1;
        this.x = j3;
        this.N = true;
    }
}
