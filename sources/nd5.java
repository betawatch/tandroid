// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nd5 extends e implements fn7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public sla M;
    public boolean N;
    public final boolean O;
    public kd5 P;
    public FrameLayout a;
    public z2b b;
    public tk4 c;
    public d79 d;
    public ld5 e;
    public md5 f;
    public x46 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull w;
    public final long x;
    public int y;

    public nd5(long j, int i) {
        super(null);
        this.n = -1;
        this.x = j;
        this.O = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Li));
        hashSet.add(Integer.valueOf(aob.Mi));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final TLRPC.StickerSet c0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.O ? chatFull.emojiset : chatFull.stickerset;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(this.O ? 2131749197 : 2131749151, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 27));
        sla a = this.simpleActionBar.v().a(0, R.drawable.outline_header_search);
        this.M = a;
        a.N();
        a.C0 = new r10(this, (byte) 12);
        this.M.setSearchFieldHint(ob6.M0(2131745564, null));
        this.e = new ld5(this, context);
        this.f = new md5(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.d = d79Var;
        d79Var.s1();
        this.d.setSectionsDrawBackground(true);
        zb3 zb3Var = new zb3();
        zb3Var.n(200L);
        zb3Var.m = true;
        this.d.setItemAnimator(zb3Var);
        x46 x46Var = new x46();
        this.h = x46Var;
        x46Var.i1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        yob.h(aob.d6, null, frameLayout2);
        tk4 tk4Var = new tk4(context, getResourceProvider());
        this.c = tk4Var;
        tk4Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(hl.q.y / hl.N(58.0f)));
        this.a.addView(this.c, tre.c(-1.0f, -1));
        z2b z2bVar = new z2b(context, this.c, 1, null);
        this.b = z2bVar;
        ko9.e(z2bVar);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, tre.c(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new zg4(this, (byte) 4));
        this.d.setOnScrollListener(new to2(this, (byte) 19));
        return this.fragmentView;
    }

    public final int d0() {
        return this.O ? 5 : 0;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.x0) {
            if (((Integer) objArr[0]).intValue() == d0()) {
                k0(true);
                return;
            }
            return;
        }
        if (i != jn7.T) {
            if (i == jn7.B0) {
                long longValue = ((Long) objArr[0]).longValue();
                if (c0(this.w) == null || c0(this.w).id != longValue) {
                    return;
                }
                k0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.x) {
            if (this.w == null && c0(chatFull) != null) {
                this.r = ls6.d0(this.currentAccount).a0(c0(chatFull));
            }
            this.w = chatFull;
            k0(true);
        }
    }

    public final /* synthetic */ void e0(int i, View view) {
        if (getParentActivity() != null) {
            if (!this.N) {
                if (i >= this.F && i < this.G) {
                    g0((TLRPC.TL_messages_stickerSet) ls6.d0(this.currentAccount).t0(d0()).get(i - this.F), ((p3b) view).a(), false);
                }
                if (i == this.K) {
                    g0(this.r, true, false);
                    return;
                }
                return;
            }
            if (i > this.f.d.size()) {
                boolean a = ((p3b) view).a();
                md5 md5Var = this.f;
                g0((TLRPC.TL_messages_stickerSet) md5Var.e.get((i - md5Var.d.size()) - 1), a, false);
            } else if (i != this.f.d.size()) {
                g0((TLRPC.TL_messages_stickerSet) this.f.d.get(i), ((p3b) view).a(), true);
            }
        }
    }

    public final void f0(TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (getParentActivity() != null) {
                Toast.makeText(getParentActivity(), ob6.M0(2131751070, null) + "\n" + tL_error.text, 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
        boolean z = this.O;
        if (tL_messages_stickerSet == null) {
            TLRPC.ChatFull chatFull = this.w;
            if (z) {
                chatFull.emojiset = null;
            } else {
                chatFull.stickerset = null;
            }
        } else {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            TLRPC.ChatFull chatFull2 = this.w;
            if (z) {
                chatFull2.emojiset = stickerSet;
            } else {
                chatFull2.stickerset = stickerSet;
            }
            ls6 d0 = ls6.d0(this.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.r;
            d0.N.k(tL_messages_stickerSet2.set.id, tL_messages_stickerSet2);
        }
        l0();
        TLRPC.ChatFull chatFull3 = this.w;
        if (z) {
            TLRPC.StickerSet stickerSet2 = chatFull3.emojiset;
            int i = chatFull3.flags2;
            if (stickerSet2 != null) {
                chatFull3.flags2 = i | 1024;
            } else {
                chatFull3.flags2 = i & (-1025);
            }
        } else {
            TLRPC.StickerSet stickerSet3 = chatFull3.stickerset;
            int i2 = chatFull3.flags;
            if (stickerSet3 == null) {
                chatFull3.flags = i2 | 256;
            } else {
                chatFull3.flags = i2 & (-257);
            }
        }
        jf7.Y(this.currentAccount).K1(this.w, false);
        jn7.f(this.currentAccount).k(jn7.T, this.w, 0, Boolean.TRUE, Boolean.FALSE);
        jn7.f(this.currentAccount).k(jn7.s3, Long.valueOf(this.w.id), Boolean.valueOf(z));
        finishFragment();
    }

    public final void g0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z2) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        s4b s4bVar = new s4b(getParentActivity(), this, tL_inputStickerSetShortName, !z2 ? tL_messages_stickerSet : null, null, null);
        s4bVar.X1 = new id5(this, z, tL_messages_stickerSet);
        s4bVar.U0();
        hl.t1(getParentActivity().getCurrentFocus());
        s4bVar.show();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i = this.n;
        if (tL_messages_stickerSet == null) {
            if (this.r != null) {
                bs2.v(null, 2131749132, d31.b0(this), R.raw.done, 36);
            }
            this.r = null;
            this.s = true;
        } else {
            this.r = tL_messages_stickerSet;
            this.s = false;
            bs2.v(null, 2131749132, d31.b0(this), R.raw.done, 36);
        }
        l0();
        j0(this.r, false);
        if (i != -1) {
            if (!this.N) {
                for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                    View childAt = this.d.getChildAt(i2);
                    if (this.d.U(childAt).b() == this.F + i) {
                        ((p3b) childAt).b(false, true);
                        break;
                    }
                }
            }
            this.e.g(this.F + i);
        }
        if (this.n != -1) {
            if (!this.N) {
                for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                    View childAt2 = this.d.getChildAt(i3);
                    if (this.d.U(childAt2).b() == this.F + this.n) {
                        ((p3b) childAt2).b(true, true);
                        return;
                    }
                }
            }
            this.e.g(this.F + this.n);
        }
    }

    public final void i0(TLRPC.ChatFull chatFull) {
        this.w = chatFull;
        if (c0(chatFull) != null) {
            this.r = ls6.d0(this.currentAccount).a0(c0(this.w));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        if (this.O) {
            int i = this.K;
            if (tL_messages_stickerSet == null) {
                boolean z2 = i > 0;
                this.r = null;
                if (z2) {
                    this.e.s(i);
                    if (z) {
                        this.e.g(this.J);
                    }
                }
                k0(false);
                kd5 kd5Var = this.P;
                kd5Var.b = false;
                kd5Var.invalidate();
                return;
            }
            boolean z3 = i == -1;
            this.r = tL_messages_stickerSet;
            k0(false);
            ld5 ld5Var = this.e;
            int i2 = this.K;
            if (z3) {
                ld5Var.i(i2);
            } else {
                ld5Var.g(i2);
            }
            if (z) {
                this.e.g(this.J);
            }
            kd5 kd5Var2 = this.P;
            kd5Var2.b = true;
            kd5Var2.invalidate();
        }
    }

    public final void k0(boolean z) {
        ld5 ld5Var;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.H = 0;
        if (this.O) {
            this.I = 0;
            int i = 2;
            this.H = 2;
            this.J = 1;
            if (this.r != null) {
                this.H = 3;
                this.K = 2;
                i = 3;
            }
            this.H = i + 1;
            this.L = i;
        }
        ArrayList t0 = ls6.d0(this.currentAccount).t0(d0());
        if (t0.isEmpty()) {
            this.E = -1;
            this.F = -1;
            this.G = -1;
        } else {
            int i2 = this.H;
            int i3 = i2 + 1;
            this.H = i3;
            this.E = i2;
            this.F = i3;
            this.G = t0.size() + i3;
            this.H = t0.size() + this.H;
        }
        int i4 = this.H;
        this.H = i4 + 1;
        this.y = i4;
        l0();
        if (!z || (ld5Var = this.e) == null) {
            return;
        }
        ld5Var.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0() {
        long j;
        ArrayList t0 = ls6.d0(this.currentAccount).t0(d0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j = tL_messages_stickerSet.set.id;
            } else if (c0(this.w) != null) {
                j = c0(this.w).id;
            }
            if (j == 0) {
                for (int i = 0; i < t0.size(); i++) {
                    if (((TLRPC.TL_messages_stickerSet) t0.get(i)).set.id == j) {
                        this.n = i;
                        return;
                    }
                }
                return;
            }
            return;
        }
        j = 0;
        if (j == 0) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        ls6.d0(this.currentAccount).D(d0());
        jn7.f(this.currentAccount).b(this, jn7.x0);
        jn7.f(this.currentAccount).b(this, jn7.T);
        jn7.f(this.currentAccount).b(this, jn7.B0);
        k0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.x0);
        jn7.f(this.currentAccount).n(this, jn7.T);
        jn7.f(this.currentAccount).n(this, jn7.B0);
        if ((this.r != null || this.s) && (chatFull = this.w) != null) {
            if (c0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != c0(this.w).id) {
                if (c0(this.w) == null && this.r == null) {
                    return;
                }
                boolean z = this.O;
                long j = this.x;
                if (z) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = uc7.s1(this.currentAccount).h1(j);
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
                    tL_channels_setStickers2.channel = uc7.s1(this.currentAccount).h1(j);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        uc7.s1(this.currentAccount).Y3.edit().remove("group_hide_stickers_" + this.w.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.r.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tL_channels_setStickers = tL_channels_setStickers2;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new w15(this, (byte) 3));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public nd5(long j) {
        super(null);
        this.n = -1;
        this.x = j;
    }
}
