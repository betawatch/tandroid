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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h48 extends e implements fn7 {
    public final oz4 E;
    public final ll0 F;
    public final oz4 G;
    public final ll0 H;
    public e I;
    public ir1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public ud4 N;
    public ema O;
    public FrameLayout P;
    public FrameLayout Q;
    public c51 R;
    public a48 S;
    public boolean T;
    public b29 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public gh1 Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final axa b;
    public boolean b0;
    public final axa c;
    public mq5 c0;
    public d26 d;
    public final r89 d0;
    public i38 e;
    public final r89 e0;
    public final int f;
    public a48 h;
    public a48 n;
    public boolean r;
    public vnb s;
    public final SparseIntArray w;
    public final t37 x;
    public final t37 y;

    public h48() {
        super(null);
        this.f = hl.L(6.0f);
        this.w = new SparseIntArray();
        boolean o = aob.I.o();
        this.T = o;
        this.b0 = o;
        this.c0 = mq5.e;
        r89 r89Var = new r89(0, false);
        this.d0 = r89Var;
        r89 r89Var2 = new r89(0, false);
        this.e0 = r89Var2;
        oz4 oz4Var = new oz4();
        this.E = oz4Var;
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        this.F = ll0Var;
        oz4 oz4Var2 = new oz4();
        this.G = oz4Var2;
        ll0 ll0Var2 = new ll0(oz4Var2, oz4Var2, oz4Var2);
        this.H = ll0Var2;
        ll0Var.g = r89Var;
        ll0Var.f = r89Var2;
        ll0Var2.g = r89Var;
        ll0Var2.f = r89Var2;
        this.a = false;
        jxa.v(this.currentAccount, false).U();
        axa axaVar = new axa(this.currentAccount, 0L, false);
        this.b = axaVar;
        axaVar.g(8, false);
        axaVar.a();
        axa axaVar2 = new axa(this.currentAccount, 0L, false);
        this.c = axaVar2;
        axaVar2.g(8, false);
        axaVar2.f = true;
        axaVar2.a();
        this.resourceProvider = new gd(this, (byte) 3);
        this.x = new t37(0, false, false, this.resourceProvider);
        this.y = new t37(0, false, true, this.resourceProvider);
    }

    public static boolean E0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z && tL_emojiStatusCollectible != null && z && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static int z0(int i) {
        return aob.a(0.5f, (hl.B(i) > 0.2f ? 1 : (hl.B(i) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i);
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
    /* JADX WARN: Type inference failed for: r6v34, types: [uc7] */
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
            if (this.h.h == lbc.f(f) && this.h.n == lbc.g(f)) {
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
                a48 a48Var = this.h;
                int i2 = a48Var.h;
                tL_peerColor2.color = i2;
                TLRPC.PeerColor peerColor3 = f.color;
                int i3 = peerColor3.flags;
                int i4 = i3 | 1;
                peerColor3.flags = i4;
                peerColor3.color = i2;
                long j2 = a48Var.n;
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
            if (this.n.h == lbc.n(f) && this.n.n == lbc.m(f)) {
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
            a48 a48Var2 = this.n;
            if (a48Var2.h < 0) {
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
                a48 a48Var3 = this.n;
                int i5 = a48Var3.h;
                peerColor4.color = i5;
                TLRPC.PeerColor peerColor5 = f.profile_color;
                peerColor5.flags |= 1;
                peerColor5.color = i5;
                peerColor = peerColor5;
                a48Var2 = a48Var3;
            }
            if (a48Var2.n != 0) {
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
            if (!E0(f.emoji_status, this.n.r) && (this.n.r != null || wf3.A(f.emoji_status))) {
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
                getMessagesController().u5(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
            }
            getMessagesController().i4(f, false, false);
            getUserConfig().u(true);
            finishFragment();
            I0();
        }
        this.X = true;
        jn7 notificationCenter = getNotificationCenter();
        int i8 = uc7.s5;
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
            showDialog(new xk8((e) this, 23, true));
            return;
        }
        a48 F0 = F0();
        TL_stars.TL_starGiftUnique tL_starGiftUnique = F0.J;
        a48 a48Var = this.h;
        if (tL_starGiftUnique == null) {
            if (F0 == a48Var) {
                a48Var = this.n;
            }
            if (a48Var.J != null) {
                a48Var.c();
            }
            A0();
            finishFragment();
            I0();
            return;
        }
        if (F0 == a48Var) {
            a48Var = this.n;
        }
        a48Var.c();
        this.r = true;
        this.R.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = F0.J;
        d38 d38Var = new d38(this, b);
        long e = yac.h(this.currentAccount).e();
        pj pjVar = tL_starGiftUnique2.resale_ton_only ? pj.b : pj.a;
        jxa.u(this.currentAccount, pjVar).E(tL_starGiftUnique2, e, null, true, new f38(this, pjVar, tL_starGiftUnique2, e, d38Var));
    }

    public final void C0() {
        this.E.a(getThemedColor(aob.d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((jl0) this.P.getBackground()).updateColors();
        D0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).updateColors();
        }
    }

    public final void D0() {
        int f = ((double) hl.B(getThemedColor(aob.d6))) > 0.72d ? vm2.f(0.085f, getThemedColor(aob.a7), this.e.getColor()) : getThemedColor(aob.a7);
        this.d.setBackgroundColor(f);
        oz4 oz4Var = this.G;
        if (oz4Var.b != f) {
            oz4Var.a(f);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((jl0) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final a48 F0() {
        ir1 ir1Var = this.J;
        return (ir1Var == null || ir1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    public final void G0(pj pjVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, d38 d38Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zta ztaVar = new zta(pjVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        bua buaVar = new bua(getParentActivity(), this.resourceProvider, tL_starGiftUnique, ztaVar, this.currentAccount, j, qu6.m(tL_starGiftUnique.num, ',', sb), false, new g38(this, zArr, tL_starGiftUnique, j, d38Var, (byte) 0));
        buaVar.h.setOnDismissListener(new gf(zArr, d38Var, (byte) 13));
        buaVar.b();
    }

    public final void H0(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, d38 d38Var, zta ztaVar, l01 l01Var) {
        zArr[0] = true;
        l01Var.d();
        jxa.u(this.currentAccount, ztaVar.a).f(ztaVar.b, tL_starGiftUnique, j, null, true, new ia7(l01Var, d38Var, (byte) 6));
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
        b48 b48Var;
        if (this.I != null) {
            boolean z = this.V;
            boolean z2 = this.a;
            if (z) {
                if (this.W) {
                }
                a48 a48Var = this.h;
                if (a48Var.h >= 0) {
                    d31.b0(this.I).M(b48.a(this.currentAccount, this.h.h), ob6.M0(z2 ? 2131752410 : 2131743411, null)).j();
                } else {
                    if (a48Var.s == null) {
                        return;
                    }
                    d31 b0 = d31.b0(this.I);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i = b48.j;
                    if (!aob.I.o() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        b48Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        b48Var = new b48(intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue, tL_peerColorCollectible.gift_emoji_id);
                    }
                    b0.M(b48Var, ob6.M0(z2 ? 2131752410 : 2131743411, null)).j();
                }
                this.I = null;
            }
            if (this.W) {
                if (this.V) {
                }
                a48 a48Var2 = this.n;
                if (a48Var2.h < 0) {
                    long j = a48Var2.n;
                    e eVar = this.I;
                    if (j != 0) {
                        d31 b02 = d31.b0(eVar);
                        TLRPC.Document e = wl.e(this.currentAccount, this.n.n);
                        String M0 = ob6.M0(z2 ? 2131752295 : 2131743393, null);
                        b02.getClass();
                        c21 c21Var = new c21(b02.X(), b02.c);
                        boolean B4 = r47.B4(e);
                        e29 e29Var = c21Var.a;
                        if (B4) {
                            yob.s(e29Var, aob.yj, null, PorterDuff.Mode.SRC_IN);
                        }
                        c21Var.i(e, new String[0]);
                        e29Var.i();
                        c21Var.b.setText(M0);
                        c21Var.b.setTextSize(1, 14.0f);
                        c21Var.b.setSingleLine(false);
                        c21Var.b.setMaxLines(3);
                        b02.b(c21Var, 2750).j();
                    } else {
                        bs2.v(null, z2 ? 2131752293 : 2131743391, d31.b0(eVar), R.raw.contact_check, 36);
                    }
                } else {
                    d31.b0(this.I).M(b48.c(this.currentAccount, this.n.h), ob6.M0(z2 ? 2131752296 : 2131743394, null)).j();
                }
            }
            this.I = null;
        }
    }

    public final void J0() {
        ema emaVar = this.O;
        if (emaVar != null) {
            emaVar.setTextColor(getThemedColor(aob.A8));
        }
        this.h.g();
        this.n.g();
        i38 i38Var = this.e;
        if (i38Var != null) {
            i38Var.a = aob.v0(aob.a7, i38Var.b);
            i38Var.a();
            i38Var.invalidate();
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
                ir1 ir1Var = this.J;
                float a = ete.a(((ir1Var == null ? 0.0f : ir1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                ud4 ud4Var = this.N;
                int f = vm2.f(a, tabsViewBackgroundColor, getThemedColor(aob.d6));
                int f2 = vm2.f(a, -1, getThemedColor(aob.a7));
                int f3 = vm2.f(a, -1, getThemedColor(aob.z6));
                int f4 = vm2.f(a, tabsViewBackgroundColor, getThemedColor(aob.G6));
                ud4Var.a.setColor(f);
                ud4Var.b.setColor(f2);
                ud4Var.d = f3;
                ud4Var.e = f4;
                ud4Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        final byte b2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        d26 d26Var = new d26((byte) 6, context, this);
        this.d = d26Var;
        this.fragmentView = d26Var;
        this.h = new a48(this, context, 1);
        this.n = new a48(this, context, 0);
        i38 i38Var = new i38(this, context, this.resourceProvider);
        this.e = i38Var;
        i38Var.F = true;
        this.n.j(false);
        final byte b3 = 2;
        this.n.addView(this.e, 2, tre.e(-1, -2, 55));
        ir1 ir1Var = new ir1((byte) 5, context, this);
        this.J = ir1Var;
        ir1Var.setAdapter(new mm2(this, (byte) 4));
        d26Var.addView(this.J, tre.e(-1, -1, jn7.D1));
        c51 c51Var = new c51(getResourceProvider(), context, true);
        this.R = c51Var;
        c51Var.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: e38
            public final /* synthetic */ h48 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                h48 h48Var = this.b;
                byte b5 = 1;
                switch (b4) {
                    case 0:
                        h48Var.B0();
                        break;
                    case 1:
                        if (h48Var.onBackPressed(true)) {
                            h48Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        h48 h48Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) h48Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        h48Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        h48Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        h48Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gh1 gh1Var = new gh1(h48Var2, h48Var2.getParentActivity(), canvas, (h48Var2.L.getMeasuredWidth() / 2.0f) + f, (h48Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        h48Var2.Y = gh1Var;
                        gh1Var.setOnTouchListener(new b02((byte) 17));
                        h48Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        h48Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(h48Var2, b5));
                        h48Var2.a0.addListener(new ad5(h48Var2, (byte) 26));
                        h48Var2.a0.setDuration(400L);
                        h48Var2.a0.setInterpolator(dt3.e);
                        h48Var2.a0.start();
                        frameLayout2.addView(h48Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new ge7(h48Var2, (byte) 29));
                        break;
                }
            }
        });
        this.P.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.P.addView(this.R, tre.c(-1.0f, -1));
        View view = this.P;
        jl0 c = this.F.c(view, null, false);
        c.p(dtd.j(this.resourceProvider));
        c.r(hl.L(28.0f));
        c.q(hl.L(5.0f));
        view.setBackground(c);
        iye.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.addView(this.P, tre.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        rl0 rl0Var = new rl0(this.H.c(this.Q, null, false));
        rl0Var.b(hl.L(40.0f), true);
        rl0Var.H = jn7.w3;
        this.Q.setBackground(rl0Var);
        a48 F0 = F0();
        c51 c51Var2 = this.R;
        if (c51Var2 != null && F0 != null && F0 != this.S) {
            this.S = F0;
            ym4 ym4Var = F0.e;
            c51Var2.i((CharSequence) ym4Var.b, false, true);
            this.R.g((SpannableStringBuilder) ym4Var.c, false);
        }
        d26Var.addView(this.Q, tre.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        d26Var.addView(frameLayout3, tre.e(-1, -2, 55));
        boolean z = this.a;
        if (z) {
            ema emaVar = new ema(context);
            this.O = emaVar;
            emaVar.l(ob6.M0(2131752401, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            yob.W(this.O, aob.A8, getResourceProvider());
            this.O.setTypeface(hl.o());
            this.M.addView(this.O, tre.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            ud4 ud4Var = new ud4(context);
            this.N = ud4Var;
            ud4Var.setTabs(ob6.M0(z ? 2131752402 : 2131743401, null), ob6.M0(z ? 2131752403 : 2131743402, null));
            this.N.r = new d38(this, b2);
            K0();
            this.M.addView(this.N, tre.e(-1, 40, 17));
        }
        i38 i38Var2 = this.e;
        if (i38Var2 != null) {
            i38Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                hl.k3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i = aob.u8;
        yob.R(imageView2, aob.f0(getThemedColor(i), 1, -1), null, yob.M(i), getResourceProvider());
        this.K.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: e38
            public final /* synthetic */ h48 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b;
                h48 h48Var = this.b;
                byte b5 = 1;
                switch (b4) {
                    case 0:
                        h48Var.B0();
                        break;
                    case 1:
                        if (h48Var.onBackPressed(true)) {
                            h48Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        h48 h48Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) h48Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        h48Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        h48Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        h48Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gh1 gh1Var = new gh1(h48Var2, h48Var2.getParentActivity(), canvas, (h48Var2.L.getMeasuredWidth() / 2.0f) + f, (h48Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        h48Var2.Y = gh1Var;
                        gh1Var.setOnTouchListener(new b02((byte) 17));
                        h48Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        h48Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(h48Var2, b5));
                        h48Var2.a0.addListener(new ad5(h48Var2, (byte) 26));
                        h48Var2.a0.setDuration(400L);
                        h48Var2.a0.setInterpolator(dt3.e);
                        h48Var2.a0.start();
                        frameLayout22.addView(h48Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new ge7(h48Var2, (byte) 29));
                        break;
                }
            }
        });
        iye.a(this.K);
        this.M.addView(this.K, tre.e(54, 54, 19));
        b29 b29Var = new b29(R.raw.sun_outline, hl.L(28.0f), hl.L(28.0f), true, null);
        this.U = b29Var;
        b29Var.h = true;
        if (this.T) {
            b29Var.H(35);
            this.U.K(36);
        } else {
            b29Var.K(0);
            this.U.H(0);
        }
        this.U.a0 = true;
        int w0 = aob.w0(null, aob.J9, false);
        this.U.L(w0, "Sunny");
        this.U.L(w0, "Path 6");
        this.U.L(w0, "Path");
        this.U.L(w0, "Path 5");
        this.U.j();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        yob.R(this.L, aob.f0(getThemedColor(i), 1, -1), null, yob.M(i), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: e38
            public final /* synthetic */ h48 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b3;
                h48 h48Var = this.b;
                byte b5 = 1;
                switch (b4) {
                    case 0:
                        h48Var.B0();
                        break;
                    case 1:
                        if (h48Var.onBackPressed(true)) {
                            h48Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        h48 h48Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) h48Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        h48Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        h48Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        h48Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gh1 gh1Var = new gh1(h48Var2, h48Var2.getParentActivity(), canvas, (h48Var2.L.getMeasuredWidth() / 2.0f) + f, (h48Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        h48Var2.Y = gh1Var;
                        gh1Var.setOnTouchListener(new b02((byte) 17));
                        h48Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        h48Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(h48Var2, b5));
                        h48Var2.a0.addListener(new ad5(h48Var2, (byte) 26));
                        h48Var2.a0.setDuration(400L);
                        h48Var2.a0.setInterpolator(dt3.e);
                        h48Var2.a0.start();
                        frameLayout22.addView(h48Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new ge7(h48Var2, (byte) 29));
                        break;
                }
            }
        });
        this.M.addView(this.L, tre.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        i38 i38Var3 = this.e;
        i38Var3.getClass();
        i38Var3.a = aob.v0(aob.a7, i38Var3.b);
        i38Var3.a();
        i38Var3.invalidate();
        C0();
        D0();
        View view2 = this.fragmentView;
        h38 h38Var = new h38(this, b2);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view2, h38Var);
        return this.d;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == jn7.i5) {
                this.h.f(true);
                this.n.f(true);
            } else if (i == jn7.I3) {
                this.h.d();
                this.n.d();
            } else if (i == jn7.H3) {
                this.h.d();
                this.n.d();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final jt3 getEdgeToEdgeSupportMode() {
        return jt3.c;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 12), aob.d6, aob.G6, aob.z6, aob.i6, aob.a7, aob.B6, aob.p7, aob.f6, aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        i38 i38Var = this.e;
        return i38Var == null ? super.isLightStatusBar() : vm2.h(i38Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.a() || this.n.a()) && getUserConfig().p())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.a;
        if (z2 || !((this.h.a() || this.n.a()) && getUserConfig().p())) {
            return super.onBackPressed(z);
        }
        if (z && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = ob6.M0(z2 ? 2131752400 : 2131743400, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(z2 ? 2131752399 : 2131743399, null);
            alertDialog$Builder.g(ob6.M0(2131751334, null), new h38(this, (byte) 1));
            alertDialog$Builder.j(ob6.M0(2131754209, null), new h38(this, (byte) 2));
            showDialog(idVar);
            yob.X((TextView) idVar.c(-2), aob.q7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        getNotificationCenter().b(this, jn7.i5);
        getNotificationCenter().b(this, jn7.I3);
        getNotificationCenter().b(this, jn7.H3);
        setBulletinDelegate(new py((byte) 9));
        ls6 mediaDataController = getMediaDataController();
        mediaDataController.getClass();
        SharedPreferences k = bp1.k(new StringBuilder("replyicons_"), mediaDataController.currentAccount, a.b, 0);
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
                    cc4.g(th, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    mediaDataController.getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new hp6(mediaDataController, k, (byte) 2));
                    if (uc7.s1(this.currentAccount).F3 == null) {
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
            mediaDataController.getConnectionsManager().sendRequest(getdefaultbackgroundemojis2, new hp6(mediaDataController, k, (byte) 2));
        } else {
            boolean z = f11.a;
        }
        if (uc7.s1(this.currentAccount).F3 == null) {
            boolean z2 = f11.a;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.I3);
        getNotificationCenter().n(this, jn7.H3);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            if (this.h == null || this.n == null) {
                return;
            }
            J0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setResourceProvider(vnb vnbVar) {
        this.s = vnbVar;
    }
}
