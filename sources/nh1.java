// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class nh1 extends d implements gk7 {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public oy8 L;
    public r7 M;
    public o39 N;
    public ah1 O;
    public FrameLayout P;
    public u41 Q;
    public wg1 R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public boolean b0;
    public TL_stories.TL_premium_boostsStatus c;
    public int c0;
    public boolean d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public long h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public d m0;
    public long n;
    public xg1 n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public wjb r0;
    public int s;
    public final SparseIntArray s0;
    public final m17 t0;
    public final m17 u0;
    public final m17 v0;
    public long w;
    public final m17 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public nh1(long j) {
        super(null);
        boolean o = bkb.I.o();
        this.K = o;
        this.S = 0;
        this.q0 = o;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(bkb.v0(bkb.c7, this.resourceProvider));
        this.x0 = a.b.getDrawable(R.drawable.msg_check_s).mutate();
        this.y0 = a.b.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j;
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
        if (K0 != null) {
            this.b = K0.level;
        }
        na7.q1(this.currentAccount).E0().a(j, new x0(this, K0, (byte) 14));
        this.resourceProvider = new mh1(this);
        this.t0 = new m17(0, false, false, this.resourceProvider);
        this.u0 = new m17(0, false, true, this.resourceProvider);
        this.v0 = new m17(0, true, false, this.resourceProvider);
        this.w0 = new m17(0, true, true, this.resourceProvider);
    }

    public static void e1(View view) {
        if (view instanceof bh1) {
            ((bh1) view).updateColors();
            return;
        }
        if (view instanceof wgb) {
            ((wgb) view).updateColors();
        } else if (view instanceof eh1) {
            ((eh1) view).updateColors();
        } else if (view instanceof lh1) {
            ((lh1) view).updateColors();
        }
    }

    public void A0() {
        o39 o39Var = new o39(getParentActivity(), this.resourceProvider);
        this.N = o39Var;
        o39Var.setSections(false);
    }

    public final View B0(int i) {
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            View childAt = this.N.getChildAt(i2);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public int C0() {
        return getMessagesController().k4.g2.f();
    }

    public int D0() {
        return 0;
    }

    public int E0() {
        return 0;
    }

    public final TLRPC.Document F0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet a0 = getMediaDataController().a0(stickerSet);
            if (!a0.documents.isEmpty()) {
                return a0.documents.get(0);
            }
        }
        return null;
    }

    public final long G0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j = stickerSet.thumb_document_id;
        if (j == 0) {
            TLRPC.TL_messages_stickerSet a0 = getMediaDataController().a0(stickerSet);
            if (!a0.documents.isEmpty()) {
                return a0.documents.get(0).id;
            }
        }
        return j;
    }

    public int H0() {
        return 2131752400;
    }

    public int I0() {
        return getMessagesController().k4.X1.f();
    }

    public int J0() {
        return 2131752401;
    }

    public int K0() {
        return 0;
    }

    public int L0() {
        return 3;
    }

    public int M0() {
        return getMessagesController().k4.W1.f();
    }

    public int N0() {
        return 2131752308;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return 2131752251;
    }

    public int R0() {
        return getMessagesController().k4.f2.f();
    }

    public int S0() {
        return 2131752252;
    }

    public final boolean T0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && cf3.a(this.y, this.E) && je2.t(this.F, this.G)) ? false : true;
    }

    public boolean U0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(TLRPC.ChatFull chatFull, View view, int i) {
        long j;
        long f;
        byte b = 0;
        if (!(view instanceof bh1)) {
            if (i == this.f0) {
                this.s = -1;
                this.x = 0L;
                if (this.E instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.E = null;
                }
                h1();
                d1(true);
                i1();
                f1(true);
                return;
            }
            if (i == this.Y) {
                Activity parentActivity = getParentActivity();
                wjb wjbVar = this.resourceProvider;
                rg1 rg1Var = new rg1(this, b);
                qx4 qx4Var = new qx4(this);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
                int i2 = xd2.f2;
                x02 x02Var = new x02(parentActivity, this, false, false, false, wjbVar);
                x02Var.n = true;
                x02Var.v1(k96.M0(2131752127, null));
                x02Var.W3 = new od2(x02Var, tL_premium_boostsStatus, wjbVar, qx4Var, this.a, rg1Var, this);
                x02Var.t1(1, false);
                x02Var.Z0();
                x02Var.d2.h0();
                x02Var.show();
                return;
            }
            return;
        }
        int i3 = this.k0;
        long j2 = this.a;
        if (i == i3) {
            if (chatFull != null) {
                mb5 mb5Var = new mb5(-j2);
                mb5Var.i0(chatFull);
                presentFragment(mb5Var);
                return;
            }
            return;
        }
        if (i == this.V) {
            f = this.n;
        } else if (i == this.d0) {
            f = this.x;
        } else {
            if (i != this.g0) {
                j = 0;
                if (i != this.i0) {
                    int K0 = K0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < K0) {
                        Z0(29);
                        return;
                    }
                    mb5 mb5Var2 = new mb5(-j2, 0);
                    mb5Var2.i0(chatFull);
                    presentFragment(mb5Var2);
                    return;
                }
                bh1 bh1Var = (bh1) view;
                boolean z = i == this.g0;
                qg1 qg1Var = new qg1(this, i, view);
                int v0 = this.E instanceof TLRPC.TL_emojiStatusCollectible ? bkb.v0(bkb.u6, this.resourceProvider) : bh1Var.f;
                if (this.R == null) {
                    tl tlVar = bh1Var.c;
                    kx9[] kx9VarArr = new kx9[1];
                    boolean z2 = ((float) (bh1Var.getHeight() + bh1Var.getTop())) > ((float) this.N.getMeasuredHeight()) / 2.0f;
                    float L = gl.L(330.0f);
                    Point point = gl.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(gl.L(324.0f), point.x * 0.95f);
                    Drawable[] drawableArr = tlVar.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        if (drawable instanceof vl) {
                            ((vl) drawable).n(tlVar);
                        }
                        drawableArr[1] = null;
                    }
                    tlVar.f();
                    bh1Var.f();
                    Rect rect = gl.Q;
                    rect.set(tlVar.getBounds());
                    int L2 = z2 ? (gl.L(12.0f) + (-rect.centerY())) - min : (-(bh1Var.getHeight() - rect.centerY())) - gl.L(16.0f);
                    vg1 vg1Var = new vg1(this, this, getParentActivity(), Integer.valueOf(rect.centerX() - (point.x - min2)), z ? z2 ? 10 : 9 : z2 ? 5 : 7, getResourceProvider(), z2 ? 24 : 16, v0, qg1Var, kx9VarArr);
                    vg1Var.h1 = true;
                    vg1Var.setSelected(j == 0 ? null : Long.valueOf(j));
                    vg1Var.setSaveState(3);
                    vg1Var.y(tlVar, bh1Var);
                    wg1 wg1Var = new wg1(this, vg1Var);
                    this.R = wg1Var;
                    kx9VarArr[0] = wg1Var;
                    wg1Var.showAsDropDown(bh1Var, 0, L2, 53);
                    kx9VarArr[0].a();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = this.E;
            f = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : cf3.f(emojiStatus);
        }
        j = f;
        if (i != this.i0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(ng1 ng1Var) {
        int i;
        int i2;
        int i3;
        if (this.e != this.f) {
            ea7 ea7Var = getMessagesController().E3;
            da7 d = ea7Var == null ? null : ea7Var.d(this.f);
            if (d != null && d.l(this.d) > this.b) {
                i = d.l(this.d);
                if (this.r != this.s) {
                    ea7 ea7Var2 = getMessagesController().F3;
                    da7 d2 = ea7Var2 != null ? ea7Var2.d(this.s) : null;
                    if (d2 != null && d2.l(this.d) > this.b) {
                        i = d2.l(this.d);
                        i2 = 24;
                        int i4 = i;
                        if (this.h != this.n && getMessagesController().k4.V1.f() > this.b) {
                            i2 = 27;
                        }
                        if (this.w != this.x && M0() > this.b) {
                            i2 = 28;
                        }
                        if (!cf3.a(this.y, this.E) && I0() > this.b) {
                            i2 = !(this.E instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        byte b = 23;
                        if (!je2.t(this.F, this.G)) {
                            if (TextUtils.isEmpty(je2.h(this.G))) {
                                i3 = 23;
                                if (getParentActivity() != null || getParentActivity() == null) {
                                    return;
                                }
                                ug1 ug1Var = new ug1(this, getParentActivity(), i3, this.currentAccount, getResourceProvider(), i4);
                                ug1Var.r1(ng1Var);
                                ug1Var.q1(this.c, true);
                                long j = this.a;
                                ug1Var.s1(j);
                                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
                                if (K0 != null) {
                                    ug1Var.L2 = new q21(this, K0, b);
                                }
                                showDialog(ug1Var);
                                this.Q.setLoading(false);
                                return;
                            }
                            i2 = 22;
                        }
                        i3 = i2;
                        if (getParentActivity() != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                i2 = 20;
                int i42 = i;
                if (this.h != this.n) {
                    i2 = 27;
                }
                if (this.w != this.x) {
                    i2 = 28;
                }
                if (!cf3.a(this.y, this.E)) {
                    if (!(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                byte b2 = 23;
                if (!je2.t(this.F, this.G)) {
                }
                i3 = i2;
                if (getParentActivity() != null) {
                }
            }
        }
        i = 0;
        if (this.r != this.s) {
        }
        i2 = 20;
        int i422 = i;
        if (this.h != this.n) {
        }
        if (this.w != this.x) {
        }
        if (!cf3.a(this.y, this.E)) {
        }
        byte b22 = 23;
        if (!je2.t(this.F, this.G)) {
        }
        i3 = i2;
        if (getParentActivity() != null) {
        }
    }

    public final void X0() {
        wjb wjbVar = this.resourceProvider;
        if (wjbVar instanceof mh1) {
            nh1 nh1Var = ((mh1) wjbVar).a;
            nh1Var.K = !nh1Var.K;
            nh1Var.j1();
            nh1Var.f1(false);
        } else {
            this.K = !this.K;
            j1();
        }
        a1(this.K, true);
        f1(false);
        bkb.Dm++;
    }

    public final int Y0() {
        int i = 0;
        if (this.e != this.f) {
            ea7 ea7Var = getMessagesController().E3;
            da7 d = ea7Var == null ? null : ea7Var.d(this.f);
            if (d != null) {
                i = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i = Math.max(i, getMessagesController().k4.V1.f());
        }
        if (this.r != this.s) {
            ea7 ea7Var2 = getMessagesController().F3;
            da7 d2 = ea7Var2 != null ? ea7Var2.d(this.s) : null;
            if (d2 != null) {
                i = Math.max(i, d2.l(this.d));
            }
        }
        if (this.w != this.x) {
            i = Math.max(i, M0());
        }
        if (!cf3.a(this.y, this.E)) {
            i = Math.max(i, I0());
        }
        return !je2.t(this.F, this.G) ? Math.max(i, R0()) : i;
    }

    public final void a1(boolean z, boolean z2) {
        if (this.q0 != z) {
            this.q0 = z;
            if (z2) {
                oy8 oy8Var = this.L;
                oy8Var.K(z ? oy8Var.e[0] : 0);
                oy8 oy8Var2 = this.L;
                if (oy8Var2 != null) {
                    oy8Var2.start();
                    return;
                }
                return;
            }
            int i = z ? this.L.e[0] - 1 : 0;
            this.L.I(i, false, true);
            this.L.K(i);
            r7 r7Var = this.M;
            if (r7Var != null) {
                r7Var.invalidate();
            }
        }
    }

    public final void b1() {
        if (getVisibleDialog() != null) {
            return;
        }
        final byte b = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = k96.M0(2131752414, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752413, null);
        alertDialog$Builder.g(k96.M0(2131751357, null), new ed(this) { // from class: tg1
            public final /* synthetic */ nh1 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i) {
                byte b2 = b;
                nh1 nh1Var = this.b;
                switch (b2) {
                    case 0:
                        nh1Var.finishFragment();
                        break;
                    default:
                        nh1Var.z0();
                        break;
                }
            }
        });
        final byte b2 = 1;
        alertDialog$Builder.j(k96.M0(2131754213, null), new ed(this) { // from class: tg1
            public final /* synthetic */ nh1 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i) {
                byte b22 = b2;
                nh1 nh1Var = this.b;
                switch (b22) {
                    case 0:
                        nh1Var.finishFragment();
                        break;
                    default:
                        nh1Var.z0();
                        break;
                }
            }
        });
        showDialog(hdVar);
        zkb.X((TextView) hdVar.c(-2), bkb.p7, getResourceProvider());
    }

    public final void c1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i = tL_premium_boostsStatus.level;
            this.b = i;
            if (K0 != null) {
                K0.level = i;
            }
            ah1 ah1Var = this.O;
            if (ah1Var != null) {
                ah1Var.f();
            }
            d1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public View createView(Context context) {
        r7 d;
        na7 messagesController = getMessagesController();
        long j = -this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        if (K0 != null) {
            int F = hc2.F(K0);
            this.f = F;
            this.e = F;
            long G = hc2.G(K0);
            this.n = G;
            this.h = G;
            int I = hc2.I(K0);
            this.s = I;
            this.r = I;
            long J = hc2.J(K0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = K0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull L0 = getMessagesController().L0(j);
        if (L0 != null) {
            TLRPC.WallPaper wallPaper = L0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String h = je2.h(wallPaper);
            if (h != null && h.length() == 0) {
                this.H = this.F;
            }
        }
        r8 r8Var = new r8(this, (byte) 20);
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(k96.M0(2131752415, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(r8Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(k96.M0(2131752415, null));
            this.actionBar.setActionBarMenuOnItemClick(r8Var);
        }
        oy8 oy8Var = new oy8(R.raw.sun_outline, gl.L(28.0f), gl.L(28.0f), true, null);
        this.L = oy8Var;
        oy8Var.h = true;
        if (this.K) {
            oy8Var.H(35);
            this.L.K(36);
        } else {
            oy8Var.K(0);
            this.L.H(0);
        }
        this.L.a0 = true;
        int v0 = bkb.v0(bkb.I9, this.resourceProvider);
        this.L.L(v0, "Sunny");
        this.L.L(v0, "Path 6");
        this.L.L(v0, "Path");
        this.L.L(v0, "Path 5");
        pha phaVar2 = this.simpleActionBar;
        if (phaVar2 != null) {
            wha t = phaVar2.t();
            oy8 oy8Var2 = this.L;
            t.getClass();
            d = t.b(1, 0, null, oy8Var2, gl.L(48.0f), null);
        } else {
            d = this.actionBar.t().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        i1();
        A0();
        if (this.d) {
            this.N.setBackgroundColor(getThemedColor(bkb.Z6));
        } else {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        }
        o39 o39Var = this.N;
        ah1 ah1Var = new ah1(this);
        this.O = ah1Var;
        o39Var.setAdapter(ah1Var);
        new r35(3);
        this.N.setLayoutManager(new t26());
        frameLayout.addView(this.N, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        byte b = 5;
        this.N.setOnItemClickListener(new k0(this, L0, b));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.N.setItemAnimator(gb3Var);
        u41 u41Var = new u41(this.resourceProvider, context, true);
        u41Var.setRoundRadius(24);
        this.Q = u41Var;
        u41Var.i(k96.M0(2131754215, null), false, true);
        this.Q.setOnClickListener(new x91(this, b));
        d1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            zkb.h(bkb.Z6, getResourceProvider(), frameLayout2);
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, nme.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, nme.e(-1, 68, 80));
        setBulletinDelegate(new s10(this, (byte) 4));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void d1(boolean z) {
        if (this.Q == null || this.c == null) {
            return;
        }
        int Y0 = Y0();
        if (this.b >= Y0) {
            this.Q.g(null, z);
            return;
        }
        if (this.J == null) {
            this.J = new SpannableStringBuilder("l");
            cm2 cm2Var = new cm2(R.drawable.mini_switch_lock, 0);
            cm2Var.n = 1;
            this.J.setSpan(cm2Var, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) k96.G(Y0, "BoostLevelRequired", new Object[0]));
        this.Q.g(spannableStringBuilder, z);
    }

    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.q3;
        byte b = 2;
        long j = this.a;
        if (i == i3) {
            if (j == ((Long) objArr[2]).longValue()) {
                c1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i == kk7.W2) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().E0().a(j, new rg1(this, b));
        } else if (i == kk7.x1 && j == ((Long) objArr[0]).longValue()) {
            ui5 ui5Var = this.parentLayout;
            if (ui5Var == null || ui5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void f1(boolean z) {
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(bkb.z8) : -1);
            this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(bkb.u8) : -1, false);
            this.actionBar.G(getThemedColor(bkb.s8), false);
        }
        if (z) {
            return;
        }
        this.O.f();
        gl.d0(this.N, new bm0(this));
        if (this.d) {
            this.P.setBackgroundColor(getThemedColor(bkb.Z6));
        }
        this.Q.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void g1(boolean z) {
        k27 messageObject;
        View B0 = B0(this.T);
        View B02 = B0(this.U ? 1 : 0);
        View B03 = B0(this.V);
        View B04 = B0(this.X);
        if (B0 instanceof tmb) {
            tmb tmbVar = (tmb) B0;
            gb2[] cells = tmbVar.getCells();
            for (int i = 0; i < cells.length; i++) {
                gb2 gb2Var = cells[i];
                if (gb2Var != null && (messageObject = gb2Var.getMessageObject()) != null) {
                    messageObject.e1 = this.f;
                    messageObject.f1 = this.n;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
            Drawable e = zi8.e(this.I, this.currentAccount, this.G, this.K);
            this.I = e;
            tmbVar.setOverrideBackground(e);
        }
        if (B02 instanceof w08) {
            ((w08) B02).a(this.f, z);
        } else if (B02 instanceof eh1) {
            ((eh1) B02).a(this.f, z);
        }
        if (B03 instanceof bh1) {
            bh1 bh1Var = (bh1) B03;
            bh1Var.a(this.currentAccount, this.f, true);
            bh1Var.c(this.n, false, z);
        }
        if (B04 instanceof lh1) {
            lh1 lh1Var = (lh1) B04;
            String h = je2.h(this.G);
            if (h == null && this.G == null && this.H != null) {
                h = "❌";
            }
            lh1Var.a(h, z);
            lh1Var.setGalleryWallpaper(this.H);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.N;
    }

    public final void h1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View B0 = B0(this.a0);
        View B02 = B0(this.c0);
        View B03 = B0(this.d0);
        View B04 = B0(this.g0);
        View B05 = B0(this.i0);
        View B06 = B0(this.k0);
        if (B0 instanceof gh1) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                gh1 gh1Var = (gh1) B0;
                fh1 fh1Var = gh1Var.b;
                da7 a = da7.a(emojiStatus);
                fh1Var.c(a, true);
                gh1Var.a.c(a, true);
                fh1Var.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                gh1 gh1Var2 = (gh1) B0;
                fh1 fh1Var2 = gh1Var2.b;
                int i = this.s;
                fh1Var2.b(i, true);
                gh1Var2.a.b(gh1Var2.h.currentAccount, i, true);
                fh1Var2.d(this.x, false, true);
            }
            gh1 gh1Var3 = (gh1) B0;
            fh1 fh1Var3 = gh1Var3.b;
            fh1Var3.e(cf3.f(this.E), false, true);
            fh1Var3.a(this.f);
            gh1Var3.updateColors();
        }
        if (B02 instanceof w08) {
            ((w08) B02).a(this.s, true);
        } else if (B02 instanceof eh1) {
            ((eh1) B02).a(this.f, true);
        }
        if (B03 instanceof bh1) {
            bh1 bh1Var = (bh1) B03;
            bh1Var.a(this.currentAccount, this.s, false);
            bh1Var.c(this.x, false, true);
        }
        if (B04 instanceof bh1) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((bh1) B04).b(da7.a(emojiStatus2));
            } else {
                ((bh1) B04).a(this.currentAccount, this.s, false);
            }
            ((bh1) B04).c(cf3.f(this.E), cf3.A(this.E), true);
        }
        boolean z = B05 instanceof bh1;
        long j = this.a;
        if (z) {
            bh1 bh1Var2 = (bh1) B05;
            bh1Var2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull L0 = getMessagesController().L0(-j);
            if (L0 == null || (stickerSet2 = L0.emojiset) == null) {
                bh1Var2.c(0L, false, false);
            } else {
                bh1Var2.c(G0(stickerSet2), false, false);
            }
        }
        if (B06 instanceof bh1) {
            TLRPC.ChatFull L02 = getMessagesController().L0(-j);
            if (L02 == null || (stickerSet = L02.stickerset) == null) {
                ((bh1) B06).c(0L, false, false);
            } else {
                ((bh1) B06).d(F0(stickerSet));
            }
        }
        i1();
    }

    public void i1() {
        ah1 ah1Var;
        ah1 ah1Var2;
        this.T = 0;
        this.U = true;
        this.V = 2;
        this.W = 3;
        this.X = 4;
        this.Y = 5;
        this.Z = 6;
        this.a0 = 7;
        this.c0 = 8;
        this.S = 10;
        this.d0 = 9;
        if (this.x != 0 || this.s >= 0 || (this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z = this.f0 >= 0;
            this.S = 11;
            this.f0 = 10;
            if (!z && (ah1Var = this.O) != null) {
                ah1Var.i(10);
                this.O.g(this.d0);
            }
        } else {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (ah1Var2 = this.O) != null) {
                ah1Var2.r(i);
                this.O.g(this.d0);
            }
        }
        int i2 = this.S;
        this.e0 = i2;
        this.g0 = i2 + 1;
        this.S = i2 + 3;
        this.h0 = i2 + 2;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !T0() || this.b < Y0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[LOOP:1: B:32:0x009a->B:34:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1() {
        SparseIntArray R0;
        int[] iArr;
        int i;
        zjb i2;
        View B0;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (bkb.O0(string) == null || bkb.O0(string).o()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (bkb.O0(string2) == null || !bkb.O0(string2).o()) {
            string2 = "Dark Blue";
        }
        akb akbVar = bkb.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (akbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            akb O0 = !this.K ? bkb.O0(str2) : bkb.O0(str);
            this.s0.clear();
            String[] strArr = new String[1];
            String str3 = O0.d;
            R0 = str3 == null ? bkb.R0(null, str3, strArr) : bkb.R0(new File(O0.b), null, strArr);
            iArr = bkb.gm;
            if (iArr != null) {
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    this.s0.put(i3, iArr[i3]);
                }
            }
            for (i = 0; i < R0.size(); i++) {
                this.s0.put(R0.keyAt(i), R0.valueAt(i));
            }
            i2 = O0.i(false);
            if (i2 != null) {
                i2.d(R0, this.s0);
            }
            this.z0.setColor(bkb.v0(bkb.c7, this.resourceProvider));
            this.I = zi8.e(this.I, this.currentAccount, this.G, this.K);
            B0 = B0(this.T);
            if (B0 instanceof tmb) {
                return;
            }
            ((tmb) B0).setOverrideBackground(this.I);
            return;
        }
        str = string;
        if (!this.K) {
        }
        this.s0.clear();
        String[] strArr2 = new String[1];
        String str32 = O0.d;
        if (str32 == null) {
        }
        iArr = bkb.gm;
        if (iArr != null) {
        }
        while (i < R0.size()) {
        }
        i2 = O0.i(false);
        if (i2 != null) {
        }
        this.z0.setColor(bkb.v0(bkb.c7, this.resourceProvider));
        this.I = zi8.e(this.I, this.currentAccount, this.G, this.K);
        B0 = B0(this.T);
        if (B0 instanceof tmb) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.b < Y0() || !T0()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        b1();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public boolean onFragmentCreate() {
        getMediaDataController().Z0();
        getNotificationCenter().b(this, kk7.W2);
        getNotificationCenter().b(this, kk7.q3);
        getNotificationCenter().b(this, kk7.x1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.W2);
        getNotificationCenter().n(this, kk7.q3);
        getNotificationCenter().n(this, kk7.x1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (this.d || this.P == null) {
            return;
        }
        int L = gl.L(68.0f) + i4;
        ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.P.setLayoutParams(layoutParams);
        }
        if (this.P.getPaddingLeft() != i || this.P.getPaddingRight() != i3 || this.P.getPaddingBottom() != i4) {
            this.P.setPadding(i, 0, i3, i4);
        }
        dg0.e(this.N, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), gl.L(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            y0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        io5 io5Var = this.mSystemInsets;
        onInsets(io5Var.a, io5Var.b, io5Var.c, io5Var.d);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setResourceProvider(wjb wjbVar) {
        this.r0 = wjbVar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public final void x0() {
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null) {
            return;
        }
        aVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(bkb.z8) : -1);
        this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(bkb.u8) : -1, false);
    }

    public void y0() {
        x0();
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setBackgroundColor(getThemedColor(bkb.r8));
        }
        o39 o39Var = this.N;
        if (o39Var != null && this.d) {
            o39Var.setBackgroundColor(getThemedColor(bkb.Z6));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(bkb.Z6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        byte b;
        byte b2;
        byte b3;
        boolean z;
        TLRPC.PeerColor peerColor;
        int i;
        int i2;
        long j;
        ?? r13;
        if (this.c == null || this.Q.R) {
            return;
        }
        int i3 = this.b;
        int Y0 = Y0();
        long j2 = this.a;
        byte b4 = 1;
        if (i3 < Y0) {
            this.Q.setLoading(true);
            getMessagesController().E0().b(j2, this.c, new rg1(this, b4));
            return;
        }
        int[] iArr = {0};
        final au0 au0Var = new au0((Object) this, (Object) new boolean[]{false}, (Object) new int[]{0}, (Object) iArr, (byte) 2);
        long j3 = -j2;
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j3));
        if (K0 == null) {
            fa4.d("channel is null in ChannelColorAcitivity");
            ir2.v(null, 2131743640, u21.b0(this), R.raw.error, 36);
            return;
        }
        this.Q.setLoading(true);
        if (this.e == this.f) {
            b = 3;
            if (this.h == this.n) {
                b2 = 3;
                z = true;
                b3 = 0;
                if (this.r == this.s || this.w != this.x) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    tL_channels_updateColor.channel = getMessagesController().f1(j3);
                    tL_channels_updateColor.for_profile = z;
                    peerColor = K0.profile_color;
                    if (peerColor == null) {
                        peerColor = new TLRPC.TL_peerColor();
                        K0.profile_color = peerColor;
                        K0.flags2 |= 256;
                    }
                    i = this.s;
                    if (i < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i;
                        i2 = peerColor.flags | 1;
                        peerColor.flags = i2;
                        peerColor.color = i;
                    } else {
                        i2 = peerColor.flags & (-2);
                        peerColor.flags = i2;
                    }
                    j = this.x;
                    if (j == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j;
                        peerColor.flags = i2 | 2;
                        peerColor.background_emoji_id = j;
                    } else {
                        peerColor.flags = i2 & (-3);
                        peerColor.background_emoji_id = 0L;
                    }
                    iArr[b3] = iArr[b3] + 1;
                    final byte b5 = b2;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: pg1
                        public final /* synthetic */ nh1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b6 = b5;
                            au0 au0Var2 = au0Var;
                            nh1 nh1Var = this.b;
                            switch (b6) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (!je2.t(this.F, this.G)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    tL_messages_setChatWallPaper.peer = getMessagesController().h1(j2);
                    TLRPC.WallPaper wallPaper = this.G;
                    if (wallPaper != null) {
                        boolean isEmpty = TextUtils.isEmpty(je2.h(wallPaper));
                        int i4 = tL_messages_setChatWallPaper.flags | 1;
                        if (isEmpty) {
                            tL_messages_setChatWallPaper.flags = i4;
                            TLRPC.WallPaper wallPaper2 = this.G;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.G;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.G.id;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                            }
                        } else {
                            tL_messages_setChatWallPaper.flags = i4;
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                            tL_inputWallPaperNoFile2.id = 0L;
                            tL_messages_setChatWallPaper.flags |= 4;
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.flags |= 128;
                            tL_wallPaperSettings.emoticon = je2.h(this.G);
                        }
                    }
                    iArr[b3] = iArr[b3] + 1;
                    final byte b6 = b3;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: pg1
                        public final /* synthetic */ nh1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b62 = b6;
                            au0 au0Var2 = au0Var;
                            nh1 nh1Var = this.b;
                            switch (b62) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull L0 = getMessagesController().L0(j3);
                    je2.e(this.currentAccount).p(j2, this.G);
                    if (L0 != null) {
                        TLRPC.WallPaper wallPaper4 = this.G;
                        int i5 = L0.flags2;
                        if (wallPaper4 == null) {
                            L0.flags2 = i5 & (-129);
                            L0.wallpaper = null;
                        } else {
                            L0.flags2 = i5 | 128;
                            L0.wallpaper = wallPaper4;
                        }
                        getMessagesController().T3(L0);
                        kk7 notificationCenter = getNotificationCenter();
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.k(kk7.S, L0, 0, bool, bool);
                    }
                }
                if (cf3.a(this.y, this.E)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().f1(j3);
                    TLRPC.EmojiStatus emojiStatus = this.E;
                    if (emojiStatus == null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                        tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        K0.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        K0.flags2 &= -513;
                    } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                        tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                        tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                        tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                        K0.emoji_status = this.E;
                        K0.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        K0.emoji_status = emojiStatus;
                        K0.flags |= 512;
                    }
                    getMessagesController().o5(j2, this.E);
                    r13 = 0;
                    final byte b7 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: pg1
                        public final /* synthetic */ nh1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b62 = b7;
                            au0 au0Var2 = au0Var;
                            nh1 nh1Var = this.b;
                            switch (b62) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        nh1Var.getClass();
                                    }
                                    au0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r13 = 0;
                }
                if (iArr[r13] != 0) {
                    finishFragment();
                    this.Q.setLoading(r13);
                    return;
                }
                getMessagesController().S3(K0, r13);
                kk7 notificationCenter2 = getNotificationCenter();
                int i6 = na7.q5;
                Object[] objArr = new Object[1];
                objArr[r13] = Integer.valueOf(TLObject.FLAG_19);
                notificationCenter2.k(2, objArr);
                return;
            }
        } else {
            b = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().f1(j3);
        tL_channels_updateColor2.for_profile = false;
        TLRPC.PeerColor peerColor2 = K0.color;
        if (peerColor2 == null) {
            peerColor2 = new TLRPC.TL_peerColor();
            K0.color = peerColor2;
            K0.flags2 |= 128;
        }
        int i7 = tL_channels_updateColor2.flags;
        b2 = b;
        tL_channels_updateColor2.flags = i7 | 4;
        int i8 = this.f;
        tL_channels_updateColor2.color = i8;
        int i9 = peerColor2.flags;
        b3 = 0;
        int i10 = i9 | 1;
        peerColor2.flags = i10;
        peerColor2.color = i8;
        z = true;
        long j4 = this.n;
        if (j4 != 0) {
            tL_channels_updateColor2.flags = i7 | 5;
            tL_channels_updateColor2.background_emoji_id = j4;
            peerColor2.flags = i9 | 3;
            peerColor2.background_emoji_id = j4;
        } else {
            peerColor2.flags = i10 & (-3);
            peerColor2.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final byte b8 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: pg1
            public final /* synthetic */ nh1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                byte b62 = b8;
                au0 au0Var2 = au0Var;
                nh1 nh1Var = this.b;
                switch (b62) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().f1(j3);
        tL_channels_updateColor3.for_profile = z;
        peerColor = K0.profile_color;
        if (peerColor == null) {
        }
        i = this.s;
        if (i < 0) {
        }
        j = this.x;
        if (j == 0) {
        }
        iArr[b3] = iArr[b3] + 1;
        final byte b52 = b2;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: pg1
            public final /* synthetic */ nh1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                byte b62 = b52;
                au0 au0Var2 = au0Var;
                nh1 nh1Var = this.b;
                switch (b62) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            nh1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                        } else {
                            nh1Var.getClass();
                        }
                        au0Var2.a(tL_error);
                        break;
                }
            }
        });
        if (!je2.t(this.F, this.G)) {
        }
        if (cf3.a(this.y, this.E)) {
        }
        if (iArr[r13] != 0) {
        }
    }

    public void Z0(int i) {
    }
}
