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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.ActionBar.d5 M;
    public boolean N;
    public final boolean O;
    public i50 P;
    public FrameLayout a;
    public org.telegram.ui.Components.cv0 b;
    public org.telegram.ui.Components.pz c;
    public org.telegram.ui.Components.uj0 d;
    public j50 e;
    public k50 f;
    public v4.b0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull w;
    public final long x;
    public int y;

    public l50(long j3) {
        super(null);
        this.n = -1;
        this.x = j3;
    }

    public static /* synthetic */ void Z(l50 l50Var, View view, int i7) {
        if (l50Var.getParentActivity() == null) {
            return;
        }
        if (!l50Var.N) {
            if (i7 >= l50Var.F && i7 < l50Var.G) {
                l50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.si.b0(l50Var.currentAccount).s0(l50Var.h0()).get(i7 - l50Var.F), ((org.telegram.ui.Cells.f8) view).a(), false);
            }
            if (i7 == l50Var.K) {
                l50Var.i0(l50Var.r, true, false);
                return;
            }
            return;
        }
        if (i7 > l50Var.f.d.size()) {
            boolean a10 = ((org.telegram.ui.Cells.f8) view).a();
            k50 k50Var = l50Var.f;
            l50Var.i0((TLRPC.TL_messages_stickerSet) k50Var.e.get((i7 - k50Var.d.size()) - 1), a10, false);
        } else if (i7 != l50Var.f.d.size()) {
            l50Var.i0((TLRPC.TL_messages_stickerSet) l50Var.f.d.get(i7), ((org.telegram.ui.Cells.f8) view).a(), true);
        }
    }

    public static void a0(l50 l50Var, TLRPC.TL_error tL_error) {
        boolean z10 = l50Var.O;
        if (tL_error != null) {
            if (l50Var.getParentActivity() != null) {
                Activity parentActivity = l50Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = l50Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                l50Var.w.emojiset = stickerSet;
            } else {
                l50Var.w.stickerset = stickerSet;
            }
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(l50Var.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = l50Var.r;
            b02.N.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.id);
        } else if (z10) {
            l50Var.w.emojiset = null;
        } else {
            l50Var.w.stickerset = null;
        }
        l50Var.m0();
        if (z10) {
            TLRPC.ChatFull chatFull = l50Var.w;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = l50Var.w;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        org.telegram.messenger.vr.a0(l50Var.currentAccount).N1(l50Var.w, false);
        org.telegram.messenger.ns.f(l50Var.currentAccount).k(org.telegram.messenger.ns.T, l50Var.w, 0, Boolean.TRUE, Boolean.FALSE);
        org.telegram.messenger.ns.f(l50Var.currentAccount).k(org.telegram.messenger.ns.q3, Long.valueOf(l50Var.w.id), Boolean.valueOf(z10));
        l50Var.finishFragment();
    }

    public static void f0(l50 l50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7 = l50Var.n;
        if (tL_messages_stickerSet == null) {
            if (l50Var.r != null) {
                org.telegram.messenger.k5.n(null, 2131749378, org.telegram.ui.Components.cc.a0(l50Var), R.raw.done, 36);
            }
            l50Var.r = null;
            l50Var.s = true;
        } else {
            l50Var.r = tL_messages_stickerSet;
            l50Var.s = false;
            org.telegram.messenger.k5.n(null, 2131749378, org.telegram.ui.Components.cc.a0(l50Var), R.raw.done, 36);
        }
        l50Var.m0();
        l50Var.k0(l50Var.r, false);
        if (i7 != -1) {
            if (!l50Var.N) {
                for (int i10 = 0; i10 < l50Var.d.getChildCount(); i10++) {
                    View childAt = l50Var.d.getChildAt(i10);
                    if (l50Var.d.T(childAt).b() == l50Var.F + i7) {
                        ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                        break;
                    }
                }
            }
            l50Var.e.g(l50Var.F + i7);
        }
        if (l50Var.n != -1) {
            if (!l50Var.N) {
                for (int i11 = 0; i11 < l50Var.d.getChildCount(); i11++) {
                    View childAt2 = l50Var.d.getChildAt(i11);
                    if (l50Var.d.T(childAt2).b() == l50Var.F + l50Var.n) {
                        ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            l50Var.e.g(l50Var.F + l50Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(this.O ? 2131749443 : 2131749397, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 8));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, R.drawable.outline_header_search);
        this.M = b10;
        b10.O();
        b10.C0 = new kg.x1(this, 12);
        this.M.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.e = new j50(this, context);
        this.f = new k50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.d = uj0Var;
        uj0Var.r1();
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
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, frameLayout2, null);
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, getResourceProvider());
        this.c = pzVar;
        pzVar.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.q.y / org.telegram.messenger.g0.N(58.0f)));
        this.a.addView(this.c, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, this.c, 1, null);
        this.b = cv0Var;
        h6.m.g(cv0Var);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new g3(this, 16));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ns.T) {
            if (i7 == org.telegram.messenger.ns.B0) {
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
                this.r = org.telegram.messenger.si.b0(this.currentAccount).Y(g0(chatFull));
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

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.e2
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
        org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        bw0Var.Y1 = new f50(this, z10, tL_messages_stickerSet);
        bw0Var.Z0();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        bw0Var.show();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.w = chatFull;
        if (g0(chatFull) != null) {
            this.r = org.telegram.messenger.si.b0(this.currentAccount).Y(g0(this.w));
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
                i50 i50Var = this.P;
                i50Var.b = true;
                i50Var.invalidate();
                return;
            }
            int i7 = this.K;
            boolean z12 = i7 > 0;
            this.r = null;
            if (z12) {
                this.e.s(i7);
                if (z10) {
                    this.e.g(this.J);
                }
            }
            l0(false);
            i50 i50Var2 = this.P;
            i50Var2.b = false;
            i50Var2.invalidate();
        }
    }

    public final void l0(boolean z10) {
        j50 j50Var;
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
            int i7 = this.H;
            this.H = i7 + 1;
            this.L = i7;
        }
        ArrayList s02 = org.telegram.messenger.si.b0(this.currentAccount).s0(h0());
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
        if (!z10 || (j50Var = this.e) == null) {
            return;
        }
        j50Var.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0() {
        long j3;
        ArrayList s02 = org.telegram.messenger.si.b0(this.currentAccount).s0(h0());
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.si.b0(this.currentAccount).B(h0());
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.x0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.B0);
        l0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.x0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.B0);
        if ((this.r != null || this.s) && (chatFull = this.w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != g0(this.w).id) {
                if (g0(this.w) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.O;
                long j3 = this.x;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
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
                    tL_channels_setStickers2.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        org.telegram.messenger.np.s1(this.currentAccount).g7.edit().remove("group_hide_stickers_" + this.w.id).apply();
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public l50(long j3, int i7) {
        super(null);
        this.n = -1;
        this.x = j3;
        this.O = true;
    }
}
