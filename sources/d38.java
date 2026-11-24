// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d38 extends d implements jm7 {
    public final kz4 E;
    public final km0 F;
    public final kz4 G;
    public final km0 H;
    public d I;
    public hs1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public xd4 N;
    public lka O;
    public FrameLayout P;
    public FrameLayout Q;
    public b61 R;
    public w28 S;
    public boolean T;
    public p09 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public fi1 Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final ava b;
    public boolean b0;
    public final ava c;
    public iq5 c0;
    public ne6 d;
    public final g79 d0;
    public f28 e;
    public final g79 e0;
    public final int f;
    public w28 h;
    public w28 n;
    public boolean r;
    public ylb s;
    public final SparseIntArray w;
    public final m37 x;
    public final m37 y;

    public d38() {
        super(null);
        this.f = gm.L(6.0f);
        this.w = new SparseIntArray();
        boolean o = cmb.I.o();
        this.T = o;
        this.b0 = o;
        this.c0 = iq5.e;
        g79 g79Var = new g79(0, false);
        this.d0 = g79Var;
        g79 g79Var2 = new g79(0, false);
        this.e0 = g79Var2;
        kz4 kz4Var = new kz4();
        this.E = kz4Var;
        km0 km0Var = new km0(kz4Var, kz4Var, kz4Var);
        this.F = km0Var;
        kz4 kz4Var2 = new kz4();
        this.G = kz4Var2;
        km0 km0Var2 = new km0(kz4Var2, kz4Var2, kz4Var2);
        this.H = km0Var2;
        km0Var.g = g79Var;
        km0Var.f = g79Var2;
        km0Var2.g = g79Var;
        km0Var2.f = g79Var2;
        this.a = false;
        jva.v(this.currentAccount, false).T();
        ava avaVar = new ava(this.currentAccount, 0L, false);
        this.b = avaVar;
        avaVar.g(8, false);
        avaVar.a();
        ava avaVar2 = new ava(this.currentAccount, 0L, false);
        this.c = avaVar2;
        avaVar2.g(8, false);
        avaVar2.f = true;
        avaVar2.a();
        this.resourceProvider = new fe(this, (byte) 3);
        this.x = new m37(0, false, false, this.resourceProvider);
        this.y = new m37(0, false, true, this.resourceProvider);
    }

    public static boolean E0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z && tL_emojiStatusCollectible != null && z && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static int z0(int i) {
        return cmb.a(0.5f, (gm.B(i) > 0.2f ? 1 : (gm.B(i) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r5 != (r10 instanceof org.telegram.tgnet.TLRPC.TL_peerColorCollectible ? r10.collectible_id : 0)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        if (r5 != (r10 instanceof org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible ? ((org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible) r10).collectible_id : 0)) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty] */
    /* JADX WARN: Type inference failed for: r5v15, types: [org.telegram.tgnet.TLRPC$EmojiStatus] */
    /* JADX WARN: Type inference failed for: r5v16, types: [org.telegram.tgnet.TLRPC$TL_inputEmojiStatusCollectible] */
    /* JADX WARN: Type inference failed for: r6v34, types: [oc7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        TLRPC.PeerColor peerColor;
        if (this.X) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else {
            if (!getUserConfig().p()) {
                return;
            }
            TLRPC.User f = getUserConfig().f();
            if (f.color == null) {
                TLRPC.TL_peerColor tL_peerColor = new TLRPC.TL_peerColor();
                f.color = tL_peerColor;
                tL_peerColor.flags |= 1;
                tL_peerColor.color = (int) (f.id % 7);
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
            if (this.h.h == m9c.f(f) && this.h.n == m9c.g(f)) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                long j = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                TLRPC.PeerColor peerColor2 = f.color;
            }
            this.V = true;
            TL_account.updateColor updatecolor = new TL_account.updateColor();
            f.flags2 |= 256;
            f.color.flags |= 1;
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.h.s;
            int i = updatecolor.flags | 4;
            if (tL_peerColorCollectible2 != null) {
                updatecolor.flags = i;
                TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                updatecolor.color = tL_inputPeerColorCollectible;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.h.s;
                tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible3.collectible_id;
                f.color = tL_peerColorCollectible3;
            } else {
                updatecolor.flags = i;
                TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                updatecolor.color = tL_peerColor2;
                tL_peerColor2.flags |= 1;
                w28 w28Var = this.h;
                int i2 = w28Var.h;
                tL_peerColor2.color = i2;
                TLRPC.PeerColor peerColor3 = f.color;
                int i3 = peerColor3.flags;
                int i4 = i3 | 1;
                peerColor3.flags = i4;
                peerColor3.color = i2;
                long j2 = w28Var.n;
                if (j2 != 0) {
                    updatecolor.flags |= 1;
                    peerColor3.flags = i3 | 3;
                    tL_peerColor2.flags |= 2;
                    peerColor3.background_emoji_id = j2;
                    tL_peerColor2.background_emoji_id = j2;
                } else {
                    peerColor3.flags = i4 & (-3);
                    peerColor3.background_emoji_id = 0L;
                }
            }
            getConnectionsManager().sendRequest(updatecolor, null);
            if (this.n.h == m9c.n(f) && this.n.n == m9c.m(f)) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.n.r;
                long j3 = tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id;
                TLRPC.EmojiStatus emojiStatus = f.emoji_status;
            }
            this.W = true;
            if (f.profile_color == null) {
                f.profile_color = new TLRPC.TL_peerColor();
            }
            TL_account.updateColor updatecolor2 = new TL_account.updateColor();
            updatecolor2.for_profile = true;
            f.flags2 |= 512;
            w28 w28Var2 = this.n;
            if (w28Var2.h < 0) {
                peerColor = f.profile_color;
                peerColor.flags &= -2;
            } else {
                TLRPC.PeerColor peerColor4 = updatecolor2.color;
                if (peerColor4 == null) {
                    updatecolor2.flags |= 4;
                    peerColor4 = new TLRPC.TL_peerColor();
                    updatecolor2.color = peerColor4;
                }
                peerColor4.flags |= 1;
                w28 w28Var3 = this.n;
                int i5 = w28Var3.h;
                peerColor4.color = i5;
                TLRPC.PeerColor peerColor5 = f.profile_color;
                peerColor5.flags |= 1;
                peerColor5.color = i5;
                peerColor = peerColor5;
                w28Var2 = w28Var3;
            }
            if (w28Var2.n != 0) {
                int i6 = updatecolor2.flags;
                updatecolor2.flags = i6 | 1;
                peerColor.flags |= 2;
                TLRPC.PeerColor peerColor6 = updatecolor2.color;
                if (peerColor6 == null) {
                    updatecolor2.flags = i6 | 5;
                    peerColor6 = new TLRPC.TL_peerColor();
                    updatecolor2.color = peerColor6;
                }
                peerColor6.flags |= 2;
                TLRPC.PeerColor peerColor7 = f.profile_color;
                long j4 = this.n.n;
                peerColor7.background_emoji_id = j4;
                peerColor6.background_emoji_id = j4;
            } else {
                peerColor.flags &= -3;
                peerColor.background_emoji_id = 0L;
            }
            getConnectionsManager().sendRequest(updatecolor2, null);
            if (!E0(f.emoji_status, this.n.r) && (this.n.r != null || pg3.A(f.emoji_status))) {
                ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.n.r;
                if (tL_emojiStatusCollectible2 != null) {
                    long j5 = tL_emojiStatusCollectible2.collectible_id;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= this.n.m0.size()) {
                            break;
                        }
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.m0.get(i7);
                        if (tL_starGiftUnique2.id == j5) {
                            tL_starGiftUnique = tL_starGiftUnique2;
                            break;
                        }
                        i7++;
                    }
                }
                if (tL_starGiftUnique != null) {
                    tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                    tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
                }
                getMessagesController().o5(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
            }
            getMessagesController().c4(f, false, false);
            getUserConfig().u(true);
            finishFragment();
            I0();
        }
        this.X = true;
        nm7 notificationCenter = getNotificationCenter();
        int i8 = oc7.s5;
        notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_19));
    }

    public final void B0() {
        if (this.r) {
            return;
        }
        byte b = 1;
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().p()) {
            showDialog(new kj8((d) this, 23, true));
            return;
        }
        w28 F0 = F0();
        TL_stars.TL_starGiftUnique tL_starGiftUnique = F0.J;
        w28 w28Var = this.h;
        if (tL_starGiftUnique == null) {
            if (F0 == w28Var) {
                w28Var = this.n;
            }
            if (w28Var.J != null) {
                w28Var.c();
            }
            A0();
            finishFragment();
            I0();
            return;
        }
        if (F0 == w28Var) {
            w28Var = this.n;
        }
        w28Var.c();
        this.r = true;
        this.R.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = F0.J;
        a28 a28Var = new a28(this, b);
        long e = z8c.h(this.currentAccount).e();
        ok okVar = tL_starGiftUnique2.resale_ton_only ? ok.b : ok.a;
        jva.u(this.currentAccount, okVar).E(tL_starGiftUnique2, e, null, true, new c28(this, okVar, tL_starGiftUnique2, e, a28Var));
    }

    public final void C0() {
        this.E.a(getThemedColor(cmb.c6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((im0) this.P.getBackground()).updateColors();
        D0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((im0) it.next()).updateColors();
        }
    }

    public final void D0() {
        int f = ((double) gm.B(getThemedColor(cmb.c6))) > 0.72d ? on2.f(0.085f, getThemedColor(cmb.Z6), this.e.getColor()) : getThemedColor(cmb.Z6);
        this.d.setBackgroundColor(f);
        kz4 kz4Var = this.G;
        if (kz4Var.b != f) {
            kz4Var.a(f);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((im0) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final w28 F0() {
        hs1 hs1Var = this.J;
        return (hs1Var == null || hs1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    public final void G0(ok okVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, a28 a28Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yra yraVar = new yra(okVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        asa asaVar = new asa(getParentActivity(), this.resourceProvider, tL_starGiftUnique, yraVar, this.currentAccount, j, kt6.m(tL_starGiftUnique.num, ',', sb), false, new d28(this, zArr, tL_starGiftUnique, j, a28Var, (byte) 0));
        asaVar.h.setOnDismissListener(new dg(zArr, a28Var, (byte) 13));
        asaVar.b();
    }

    public final void H0(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, a28 a28Var, yra yraVar, k11 k11Var) {
        zArr[0] = true;
        k11Var.d();
        jva.u(this.currentAccount, yraVar.a).f(yraVar.b, tL_starGiftUnique, j, null, true, new s87(k11Var, a28Var, (byte) 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r18.J.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        if ((r18.J.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.n) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0() {
        ArrayList<Integer> arrayList;
        x28 x28Var;
        if (this.I != null) {
            boolean z = this.V;
            boolean z2 = this.a;
            if (z) {
                if (this.W) {
                }
                w28 w28Var = this.h;
                if (w28Var.h >= 0) {
                    c41.b0(this.I).M(x28.a(this.currentAccount, this.h.h), jb6.M0(z2 ? 2131752382 : 2131743443, null)).j();
                } else {
                    if (w28Var.s == null) {
                        return;
                    }
                    c41 b0 = c41.b0(this.I);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i = x28.j;
                    if (!cmb.I.o() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        x28Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        x28Var = new x28(intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue, tL_peerColorCollectible.gift_emoji_id);
                    }
                    b0.M(x28Var, jb6.M0(z2 ? 2131752382 : 2131743443, null)).j();
                }
                this.I = null;
            }
            if (this.W) {
                if (this.V) {
                }
                w28 w28Var2 = this.n;
                if (w28Var2.h < 0) {
                    long j = w28Var2.n;
                    d dVar = this.I;
                    if (j != 0) {
                        c41 b02 = c41.b0(dVar);
                        TLRPC.Document e = vm.e(this.currentAccount, this.n.n);
                        String M0 = jb6.M0(z2 ? 2131752267 : 2131743425, null);
                        b02.getClass();
                        b31 b31Var = new b31(b02.X(), b02.c);
                        boolean B4 = k47.B4(e);
                        s09 s09Var = b31Var.a;
                        if (B4) {
                            anb.s(s09Var, cmb.xj, null, PorterDuff.Mode.SRC_IN);
                        }
                        b31Var.e(e, new String[0]);
                        s09Var.i();
                        b31Var.b.setText(M0);
                        b31Var.b.setTextSize(1, 14.0f);
                        b31Var.b.setSingleLine(false);
                        b31Var.b.setMaxLines(3);
                        b02.b(b31Var, 2750).j();
                    } else {
                        ts2.u(null, z2 ? 2131752265 : 2131743423, c41.b0(dVar), R.raw.contact_check, 36);
                    }
                } else {
                    c41.b0(this.I).M(x28.c(this.currentAccount, this.n.h), jb6.M0(z2 ? 2131752268 : 2131743426, null)).j();
                }
            }
            this.I = null;
        }
    }

    public final void J0() {
        lka lkaVar = this.O;
        if (lkaVar != null) {
            lkaVar.setTextColor(getThemedColor(cmb.z8));
        }
        this.h.g();
        this.n.g();
        f28 f28Var = this.e;
        if (f28Var != null) {
            f28Var.a = cmb.v0(cmb.Z6, f28Var.b);
            f28Var.a();
            f28Var.invalidate();
        }
        K0();
        C0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        if (this.e != null) {
            D0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.N != null) {
                hs1 hs1Var = this.J;
                float a = pqe.a(((hs1Var == null ? 0.0f : hs1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                xd4 xd4Var = this.N;
                int f = on2.f(a, tabsViewBackgroundColor, getThemedColor(cmb.c6));
                int f2 = on2.f(a, -1, getThemedColor(cmb.Z6));
                int f3 = on2.f(a, -1, getThemedColor(cmb.y6));
                int f4 = on2.f(a, tabsViewBackgroundColor, getThemedColor(cmb.F6));
                xd4Var.a.setColor(f);
                xd4Var.b.setColor(f2);
                xd4Var.d = f3;
                xd4Var.e = f4;
                xd4Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        final byte b2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        byte b3 = 4;
        ne6 ne6Var = new ne6(b3, context, this);
        this.d = ne6Var;
        this.fragmentView = ne6Var;
        this.h = new w28(this, context, 1);
        this.n = new w28(this, context, 0);
        f28 f28Var = new f28(this, context, this.resourceProvider);
        this.e = f28Var;
        f28Var.F = true;
        this.n.j(false);
        final byte b4 = 2;
        this.n.addView(this.e, 2, qoe.e(-1, -2, 55));
        hs1 hs1Var = new hs1(b3, context, this);
        this.J = hs1Var;
        hs1Var.setAdapter(new fn2(this, b3));
        ne6Var.addView(this.J, qoe.e(-1, -1, nm7.D1));
        b61 b61Var = new b61(getResourceProvider(), context, true);
        this.R = b61Var;
        b61Var.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: b28
            public final /* synthetic */ d38 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b2;
                d38 d38Var = this.b;
                byte b6 = 1;
                switch (b5) {
                    case 0:
                        d38Var.B0();
                        break;
                    case 1:
                        if (d38Var.onBackPressed(true)) {
                            d38Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        d38 d38Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) d38Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        d38Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        d38Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        d38Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fi1 fi1Var = new fi1(d38Var2, d38Var2.getParentActivity(), canvas, (d38Var2.L.getMeasuredWidth() / 2.0f) + f, (d38Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        d38Var2.Y = fi1Var;
                        fi1Var.setOnTouchListener(new w02((byte) 17));
                        d38Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        d38Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(d38Var2, b6));
                        d38Var2.a0.addListener(new v85(d38Var2, (byte) 29));
                        d38Var2.a0.setDuration(400L);
                        d38Var2.a0.setInterpolator(vt3.e);
                        d38Var2.a0.start();
                        frameLayout2.addView(d38Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new kl7(d38Var2, (byte) 21));
                        break;
                }
            }
        });
        this.P.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.P.addView(this.R, qoe.c(-1.0f, -1));
        View view = this.P;
        im0 c = this.F.c(view, null, false);
        c.p(qqd.j(this.resourceProvider));
        c.r(gm.L(28.0f));
        c.q(gm.L(5.0f));
        view.setBackground(c);
        rve.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.addView(this.P, qoe.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        qm0 qm0Var = new qm0(this.H.c(this.Q, null, false));
        qm0Var.b(gm.L(40.0f), true);
        qm0Var.H = nm7.w3;
        this.Q.setBackground(qm0Var);
        w28 F0 = F0();
        b61 b61Var2 = this.R;
        if (b61Var2 != null && F0 != null && F0 != this.S) {
            this.S = F0;
            mj4 mj4Var = F0.e;
            b61Var2.i((CharSequence) mj4Var.b, false, true);
            this.R.g((SpannableStringBuilder) mj4Var.c, false);
        }
        ne6Var.addView(this.Q, qoe.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        ne6Var.addView(frameLayout3, qoe.e(-1, -2, 55));
        boolean z = this.a;
        if (z) {
            lka lkaVar = new lka(context);
            this.O = lkaVar;
            lkaVar.l(jb6.M0(2131752373, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            anb.W(this.O, cmb.z8, getResourceProvider());
            this.O.setTypeface(gm.o());
            this.M.addView(this.O, qoe.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            xd4 xd4Var = new xd4(context);
            this.N = xd4Var;
            xd4Var.setTabs(jb6.M0(z ? 2131752374 : 2131743433, null), jb6.M0(z ? 2131752375 : 2131743434, null));
            this.N.r = new a28(this, b2);
            K0();
            this.M.addView(this.N, qoe.e(-1, 40, 17));
        }
        f28 f28Var2 = this.e;
        if (f28Var2 != null) {
            f28Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                gm.k3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i = cmb.t8;
        anb.R(imageView2, cmb.f0(getThemedColor(i), 1, -1), null, anb.M(i), getResourceProvider());
        this.K.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: b28
            public final /* synthetic */ d38 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b;
                d38 d38Var = this.b;
                byte b6 = 1;
                switch (b5) {
                    case 0:
                        d38Var.B0();
                        break;
                    case 1:
                        if (d38Var.onBackPressed(true)) {
                            d38Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        d38 d38Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) d38Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        d38Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        d38Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        d38Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fi1 fi1Var = new fi1(d38Var2, d38Var2.getParentActivity(), canvas, (d38Var2.L.getMeasuredWidth() / 2.0f) + f, (d38Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        d38Var2.Y = fi1Var;
                        fi1Var.setOnTouchListener(new w02((byte) 17));
                        d38Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        d38Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(d38Var2, b6));
                        d38Var2.a0.addListener(new v85(d38Var2, (byte) 29));
                        d38Var2.a0.setDuration(400L);
                        d38Var2.a0.setInterpolator(vt3.e);
                        d38Var2.a0.start();
                        frameLayout22.addView(d38Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new kl7(d38Var2, (byte) 21));
                        break;
                }
            }
        });
        rve.a(this.K);
        this.M.addView(this.K, qoe.e(54, 54, 19));
        p09 p09Var = new p09(R.raw.sun_outline, gm.L(28.0f), gm.L(28.0f), true, null);
        this.U = p09Var;
        p09Var.h = true;
        if (this.T) {
            p09Var.H(35);
            this.U.K(36);
        } else {
            p09Var.K(0);
            this.U.H(0);
        }
        this.U.a0 = true;
        int w0 = cmb.w0(null, cmb.I9, false);
        this.U.L(w0, "Sunny");
        this.U.L(w0, "Path 6");
        this.U.L(w0, "Path");
        this.U.L(w0, "Path 5");
        this.U.j();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        anb.R(this.L, cmb.f0(getThemedColor(i), 1, -1), null, anb.M(i), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: b28
            public final /* synthetic */ d38 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b4;
                d38 d38Var = this.b;
                byte b6 = 1;
                switch (b5) {
                    case 0:
                        d38Var.B0();
                        break;
                    case 1:
                        if (d38Var.onBackPressed(true)) {
                            d38Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        d38 d38Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) d38Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        d38Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        d38Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        d38Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fi1 fi1Var = new fi1(d38Var2, d38Var2.getParentActivity(), canvas, (d38Var2.L.getMeasuredWidth() / 2.0f) + f, (d38Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        d38Var2.Y = fi1Var;
                        fi1Var.setOnTouchListener(new w02((byte) 17));
                        d38Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        d38Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(d38Var2, b6));
                        d38Var2.a0.addListener(new v85(d38Var2, (byte) 29));
                        d38Var2.a0.setDuration(400L);
                        d38Var2.a0.setInterpolator(vt3.e);
                        d38Var2.a0.start();
                        frameLayout22.addView(d38Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new kl7(d38Var2, (byte) 21));
                        break;
                }
            }
        });
        this.M.addView(this.L, qoe.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        f28 f28Var3 = this.e;
        f28Var3.getClass();
        f28Var3.a = cmb.v0(cmb.Z6, f28Var3.b);
        f28Var3.a();
        f28Var3.invalidate();
        C0();
        D0();
        View view2 = this.fragmentView;
        e28 e28Var = new e28(this, b2);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(view2, e28Var);
        return this.d;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == nm7.j5) {
                this.h.f(true);
                this.n.f(true);
            } else if (i == nm7.I3) {
                this.h.d();
                this.n.d();
            } else if (i == nm7.H3) {
                this.h.d();
                this.n.d();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final bu3 getEdgeToEdgeSupportMode() {
        return bu3.c;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 12), cmb.c6, cmb.F6, cmb.y6, cmb.h6, cmb.Z6, cmb.A6, cmb.o7, cmb.e6, cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        f28 f28Var = this.e;
        return f28Var == null ? super.isLightStatusBar() : on2.h(f28Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.a() || this.n.a()) && getUserConfig().p())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.a;
        if (z2 || !((this.h.a() || this.n.a()) && getUserConfig().p())) {
            return super.onBackPressed(z);
        }
        if (z && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = jb6.M0(z2 ? 2131752372 : 2131743432, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(z2 ? 2131752371 : 2131743431, null);
            alertDialog$Builder.g(jb6.M0(2131751306, null), new e28(this, (byte) 1));
            alertDialog$Builder.j(jb6.M0(2131754181, null), new e28(this, (byte) 2));
            showDialog(heVar);
            anb.X((TextView) heVar.c(-2), cmb.p7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        getNotificationCenter().b(this, nm7.j5);
        getNotificationCenter().b(this, nm7.I3);
        getNotificationCenter().b(this, nm7.H3);
        setBulletinDelegate(new oz((byte) 9));
        hs6 mediaDataController = getMediaDataController();
        mediaDataController.getClass();
        byte b = 0;
        SharedPreferences k = aq1.k(new StringBuilder("replyicons_"), mediaDataController.currentAccount, a.b, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = k.getString("replyicons", null);
        long j = k.getLong("replyicons_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    mediaDataController.O1 = tL_emojiList;
                } catch (Throwable th2) {
                    th = th2;
                    fc4.g(th, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    mediaDataController.getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new bp6(mediaDataController, k, b));
                    if (oc7.r1(this.currentAccount).E3 == null) {
                    }
                    return super.onFragmentCreate();
                }
            } catch (Throwable th3) {
                tL_emojiList = null;
                th = th3;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j > 86400000) {
            TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis2 = new TL_account.getDefaultBackgroundEmojis();
            if (tL_emojiList2 != null) {
                getdefaultbackgroundemojis2.hash = tL_emojiList2.hash;
            }
            mediaDataController.getConnectionsManager().sendRequest(getdefaultbackgroundemojis2, new bp6(mediaDataController, k, b));
        } else {
            boolean z = e21.a;
        }
        if (oc7.r1(this.currentAccount).E3 == null) {
            boolean z2 = e21.a;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.j5);
        getNotificationCenter().n(this, nm7.I3);
        getNotificationCenter().n(this, nm7.H3);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            if (this.h == null || this.n == null) {
                return;
            }
            J0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setResourceProvider(ylb ylbVar) {
        this.s = ylbVar;
    }
}
