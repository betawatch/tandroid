package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class im0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public final ui.c E;
    public final dh.c F;
    public final ui.c G;
    public final dh.c H;
    public org.telegram.ui.ActionBar.e2 I;
    public hi.i1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public org.telegram.ui.Components.ry N;
    public org.telegram.ui.ActionBar.j5 O;
    public FrameLayout P;
    public FrameLayout Q;
    public hi.d R;
    public cm0 S;
    public boolean T;
    public org.telegram.ui.Components.ch0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public bc Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final di.m8 b;
    public boolean b0;
    public final di.m8 c;
    public i0.c c0;
    public k0 d;
    public final xe.b d0;
    public nl0 e;
    public final xe.b e0;
    public final int f;
    public cm0 h;
    public cm0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.e6 s;
    public final SparseIntArray w;
    public final org.telegram.ui.ActionBar.r4 x;
    public final org.telegram.ui.ActionBar.r4 y;

    public im0() {
        super(null);
        this.f = org.telegram.messenger.g0.L(6.0f);
        this.w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.T = q10;
        this.b0 = q10;
        this.c0 = i0.c.e;
        xe.b bVar = new xe.b();
        this.d0 = bVar;
        xe.b bVar2 = new xe.b();
        this.e0 = bVar2;
        ui.c cVar = new ui.c();
        this.E = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.F = cVar2;
        ui.c cVar3 = new ui.c();
        this.G = cVar3;
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.H = cVar4;
        cVar2.g = bVar;
        cVar2.f = bVar2;
        cVar4.g = bVar;
        cVar4.f = bVar2;
        this.a = false;
        di.v8.y(this.currentAccount, false).U();
        di.m8 m8Var = new di.m8(this.currentAccount, 0L, false);
        this.b = m8Var;
        m8Var.g(8, false);
        m8Var.a();
        di.m8 m8Var2 = new di.m8(this.currentAccount, 0L, false);
        this.c = m8Var2;
        m8Var2.g(8, false);
        m8Var2.f = true;
        m8Var2.a();
        this.resourceProvider = new hj(this, 1);
        this.x = new org.telegram.ui.ActionBar.r4(0, false, false, this.resourceProvider);
        this.y = new org.telegram.ui.ActionBar.r4(0, false, true, this.resourceProvider);
    }

    public static int B0(int i7) {
        return org.telegram.ui.ActionBar.j6.b(0.5f, (org.telegram.messenger.g0.B(i7) > 0.2f ? 1 : (org.telegram.messenger.g0.B(i7) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i7);
    }

    public static boolean G0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void Z(im0 im0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, kl0 kl0Var, di.c5 c5Var, vf.b bVar) {
        zArr[0] = true;
        bVar.d();
        di.v8.x(im0Var.currentAccount, c5Var.a).h(c5Var.b, tL_starGiftUnique, j3, null, true, new bi.e4(21, bVar, kl0Var));
    }

    public static void a0(im0 im0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, kl0 kl0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        di.c5 c5Var = new di.c5(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        di.e5 e5Var = new di.e5(im0Var.getParentActivity(), im0Var.resourceProvider, tL_starGiftUnique, c5Var, im0Var.currentAccount, j3, i5.c.l(tL_starGiftUnique.num, ',', sb2), false, new di.b3(im0Var, zArr, tL_starGiftUnique, j3, kl0Var, 1));
        e5Var.h.setOnDismissListener(new di.a3(12, zArr, kl0Var));
        e5Var.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r3 != (r8 instanceof org.telegram.tgnet.TLRPC.TL_peerColorCollectible ? r8.collectible_id : 0)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (r3 != (r8 instanceof org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible ? ((org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible) r8).collectible_id : 0)) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty] */
    /* JADX WARN: Type inference failed for: r3v15, types: [org.telegram.tgnet.TLRPC$EmojiStatus] */
    /* JADX WARN: Type inference failed for: r3v16, types: [org.telegram.tgnet.TLRPC$TL_inputEmojiStatusCollectible] */
    /* JADX WARN: Type inference failed for: r4v38, types: [org.telegram.messenger.np] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0() {
        if (this.X) {
            return;
        }
        boolean z10 = this.a;
        if (z10 || getUserConfig().q()) {
            if (z10) {
                finishFragment();
            } else {
                TLRPC.User f10 = getUserConfig().f();
                if (f10.color == null) {
                    TLRPC.TL_peerColor tL_peerColor = new TLRPC.TL_peerColor();
                    f10.color = tL_peerColor;
                    tL_peerColor.flags |= 1;
                    tL_peerColor.color = (int) (f10.id % 7);
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
                if (this.h.h == org.telegram.messenger.q10.e(f10) && this.h.n == org.telegram.messenger.q10.f(f10)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    long j3 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = f10.color;
                }
                this.V = true;
                TL_account.updateColor updatecolor = new TL_account.updateColor();
                f10.flags2 |= 256;
                f10.color.flags |= 1;
                if (this.h.s != null) {
                    updatecolor.flags |= 4;
                    TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                    updatecolor.color = tL_inputPeerColorCollectible;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.h.s;
                    tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                    f10.color = tL_peerColorCollectible2;
                } else {
                    updatecolor.flags |= 4;
                    TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                    updatecolor.color = tL_peerColor2;
                    tL_peerColor2.flags |= 1;
                    cm0 cm0Var = this.h;
                    int i7 = cm0Var.h;
                    tL_peerColor2.color = i7;
                    TLRPC.PeerColor peerColor2 = f10.color;
                    int i10 = peerColor2.flags;
                    int i11 = i10 | 1;
                    peerColor2.flags = i11;
                    peerColor2.color = i7;
                    long j10 = cm0Var.n;
                    if (j10 != 0) {
                        updatecolor.flags |= 1;
                        peerColor2.flags = i10 | 3;
                        tL_peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j10;
                        tL_peerColor2.background_emoji_id = j10;
                    } else {
                        peerColor2.flags = i11 & (-3);
                        peerColor2.background_emoji_id = 0L;
                    }
                }
                getConnectionsManager().sendRequest(updatecolor, null);
                if (this.n.h == org.telegram.messenger.q10.l(f10)) {
                    cm0 cm0Var2 = this.n;
                    long j11 = cm0Var2.n;
                    TLRPC.PeerColor peerColor3 = f10.profile_color;
                    if (j11 == ((!(peerColor3 instanceof TLRPC.TL_peerColor) || (peerColor3.flags & 2) == 0) ? 0L : peerColor3.background_emoji_id)) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = cm0Var2.r;
                        long j12 = tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id;
                        TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                    }
                }
                this.W = true;
                if (f10.profile_color == null) {
                    f10.profile_color = new TLRPC.TL_peerColor();
                }
                TL_account.updateColor updatecolor2 = new TL_account.updateColor();
                updatecolor2.for_profile = true;
                f10.flags2 |= 512;
                if (this.n.h < 0) {
                    f10.profile_color.flags &= -2;
                } else {
                    if (updatecolor2.color == null) {
                        updatecolor2.flags |= 4;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor4 = updatecolor2.color;
                    peerColor4.flags |= 1;
                    int i12 = this.n.h;
                    peerColor4.color = i12;
                    TLRPC.PeerColor peerColor5 = f10.profile_color;
                    peerColor5.flags |= 1;
                    peerColor5.color = i12;
                }
                if (this.n.n != 0) {
                    int i13 = updatecolor2.flags;
                    updatecolor2.flags = i13 | 1;
                    f10.profile_color.flags |= 2;
                    if (updatecolor2.color == null) {
                        updatecolor2.flags = i13 | 5;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor6 = updatecolor2.color;
                    peerColor6.flags |= 2;
                    TLRPC.PeerColor peerColor7 = f10.profile_color;
                    long j13 = this.n.n;
                    peerColor7.background_emoji_id = j13;
                    peerColor6.background_emoji_id = j13;
                } else {
                    TLRPC.PeerColor peerColor8 = f10.profile_color;
                    peerColor8.flags &= -3;
                    peerColor8.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!G0(f10.emoji_status, this.n.r) && (this.n.r != null || org.telegram.messenger.m5.B(f10.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.n.r;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j14 = tL_emojiStatusCollectible2.collectible_id;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= this.n.m0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.m0.get(i14);
                            if (tL_starGiftUnique2.id == j14) {
                                tL_starGiftUnique = tL_starGiftUnique2;
                                break;
                            }
                            i14++;
                        }
                    }
                    if (tL_starGiftUnique != null) {
                        tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
                    }
                    getMessagesController().h5(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
                }
                getMessagesController().X3(f10, false, false);
                getUserConfig().v(true);
                finishFragment();
                I0();
            }
            this.X = true;
            org.telegram.messenger.ns notificationCenter = getNotificationCenter();
            int i15 = org.telegram.messenger.np.D8;
            notificationCenter.k(org.telegram.messenger.ns.r, Integer.valueOf(TLObject.FLAG_19));
        }
    }

    public final void D0() {
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) this, 23, true));
            return;
        }
        cm0 H0 = H0();
        if (H0.J == null) {
            cm0 cm0Var = this.h;
            if (H0 == cm0Var) {
                cm0Var = this.n;
            }
            if (cm0Var.J != null) {
                cm0Var.d();
            }
            C0();
            finishFragment();
            I0();
            return;
        }
        cm0 cm0Var2 = this.h;
        if (H0 == cm0Var2) {
            cm0Var2 = this.n;
        }
        cm0Var2.d();
        this.r = true;
        this.R.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.J;
        kl0 kl0Var = new kl0(this, 1);
        long e10 = org.telegram.messenger.m10.i(this.currentAccount).e();
        cg.b bVar = tL_starGiftUnique.resale_ton_only ? cg.b.b : cg.b.a;
        di.v8.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new bi.u5(this, bVar, tL_starGiftUnique, e10, kl0Var));
    }

    public final void E0() {
        this.E.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((fh.g) this.P.getBackground()).updateColors();
        F0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int f10 = ((double) org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.j6.d6))) > 0.72d ? i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.j6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        this.d.setBackgroundColor(f10);
        ui.c cVar = this.G;
        if (cVar.b != f10) {
            cVar.a(f10);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((fh.g) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final cm0 H0() {
        hi.i1 i1Var = this.J;
        return (i1Var == null || i1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r18.J.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if ((r18.J.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.n) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0() {
        ArrayList<Integer> arrayList;
        dm0 dm0Var;
        if (this.I != null) {
            boolean z10 = this.V;
            boolean z11 = this.a;
            if (z10) {
                if (this.W) {
                }
                cm0 cm0Var = this.h;
                if (cm0Var.h >= 0) {
                    org.telegram.ui.Components.cc.a0(this.I).M(dm0.a(this.currentAccount, this.h.h), org.telegram.messenger.hd.M0(z11 ? 2131752436 : 2131743756, null)).j();
                } else {
                    if (cm0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(this.I);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i7 = dm0.j;
                    if (!org.telegram.ui.ActionBar.j6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        dm0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        dm0Var = new dm0(intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue, tL_peerColorCollectible.gift_emoji_id);
                    }
                    a02.M(dm0Var, org.telegram.messenger.hd.M0(z11 ? 2131752436 : 2131743756, null)).j();
                }
                this.I = null;
            }
            if (this.W) {
                if (this.V) {
                }
                cm0 cm0Var2 = this.n;
                if (cm0Var2.h >= 0) {
                    org.telegram.ui.Components.cc.a0(this.I).M(dm0.c(this.currentAccount, this.n.h), org.telegram.messenger.hd.M0(z11 ? 2131752326 : 2131743739, null)).j();
                } else if (cm0Var2.n != 0) {
                    org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(this.I);
                    TLRPC.Document e10 = org.telegram.ui.Components.g5.e(this.currentAccount, this.n.n);
                    String M0 = org.telegram.messenger.hd.M0(z11 ? 2131752325 : 2131743738, null);
                    a03.getClass();
                    org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(a03.W(), a03.c);
                    boolean C4 = org.telegram.messenger.gj.C4(e10);
                    org.telegram.ui.Components.fh0 fh0Var = fbVar.a;
                    if (C4) {
                        org.telegram.ui.ActionBar.q6.s(fh0Var, org.telegram.ui.ActionBar.j6.yj, null, PorterDuff.Mode.SRC_IN);
                    }
                    fbVar.e(e10, new String[0]);
                    fh0Var.i();
                    fbVar.b.setText(M0);
                    fbVar.b.setTextSize(1, 14.0f);
                    fbVar.b.setSingleLine(false);
                    fbVar.b.setMaxLines(3);
                    a03.b(fbVar, 2750).j();
                } else {
                    org.telegram.messenger.k5.n(null, z11 ? 2131752323 : 2131743736, org.telegram.ui.Components.cc.a0(this.I), R.raw.contact_check, 36);
                }
            }
            this.I = null;
        }
    }

    public final void J0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.O;
        if (j5Var != null) {
            j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
        }
        this.h.g();
        this.n.g();
        nl0 nl0Var = this.e;
        if (nl0Var != null) {
            nl0Var.a = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, nl0Var.b);
            nl0Var.a();
            nl0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        if (this.e == null) {
            return;
        }
        F0();
        int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
        if (this.N != null) {
            hi.i1 i1Var = this.J;
            float a10 = c8.i9.a(((i1Var == null ? 0.0f : i1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.ry ryVar = this.N;
            int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.j6.a7));
            int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.j6.z6));
            int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            ryVar.a.setColor(f10);
            ryVar.b.setColor(f11);
            ryVar.d = f12;
            ryVar.e = f13;
            ryVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        final int i7 = 1;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        k0 k0Var = new k0(16, context, this);
        this.d = k0Var;
        this.fragmentView = k0Var;
        this.h = new cm0(this, context, 1);
        this.n = new cm0(this, context, 0);
        nl0 nl0Var = new nl0(this, context, this.resourceProvider);
        this.e = nl0Var;
        nl0Var.F = true;
        this.n.j(false);
        final int i11 = 2;
        this.n.addView(this.e, 2, c8.ja.e(-1, -2, 55));
        hi.i1 i1Var = new hi.i1(4, context, this);
        this.J = i1Var;
        i1Var.setAdapter(new li.x(this, i11));
        k0Var.addView(this.J, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        this.R = dVar;
        dVar.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ll0
            public final /* synthetic */ im0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                im0 im0Var = this.b;
                switch (i12) {
                    case 0:
                        if (im0Var.onBackPressed(true)) {
                            im0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        im0 im0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) im0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        im0Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        im0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        im0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(im0Var2, im0Var2.getParentActivity(), canvas, (im0Var2.L.getMeasuredWidth() / 2.0f) + f10, (im0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        im0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        im0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        im0Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ba(im0Var2, 2));
                        im0Var2.a0.addListener(new xx(im0Var2, 9));
                        im0Var2.a0.setDuration(400L);
                        im0Var2.a0.setInterpolator(org.telegram.ui.Components.qs.e);
                        im0Var2.a0.start();
                        frameLayout2.addView(im0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(im0Var2, 13));
                        break;
                    default:
                        im0Var.D0();
                        break;
                }
            }
        });
        this.P.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.addView(this.R, c8.ja.c(-1.0f, -1));
        View view = this.P;
        fh.g c10 = this.F.c(view, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        view.setBackground(c10);
        c8.na.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.addView(this.P, c8.ja.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(this.H.c(this.Q, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = org.telegram.messenger.ns.x3;
        this.Q.setBackground(dVar2);
        cm0 H0 = H0();
        hi.d dVar3 = this.R;
        if (dVar3 != null && H0 != null && H0 != this.S) {
            this.S = H0;
            ji.j jVar = H0.e;
            dVar3.i((CharSequence) jVar.b, false, true);
            this.R.g((SpannableStringBuilder) jVar.c, false);
        }
        k0Var.addView(this.Q, c8.ja.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        k0Var.addView(frameLayout3, c8.ja.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.O = j5Var;
            j5Var.l(org.telegram.messenger.hd.M0(2131752427, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            org.telegram.ui.ActionBar.q6.X(this.O, org.telegram.ui.ActionBar.j6.A8, getResourceProvider());
            this.O.setTypeface(org.telegram.messenger.g0.o());
            this.M.addView(this.O, c8.ja.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.ry ryVar = new org.telegram.ui.Components.ry(context);
            this.N = ryVar;
            ryVar.setTabs(org.telegram.messenger.hd.M0(z10 ? 2131752428 : 2131743746, null), org.telegram.messenger.hd.M0(z10 ? 2131752429 : 2131743747, null));
            this.N.r = new kl0(this, i10);
            K0();
            this.M.addView(this.N, c8.ja.e(-1, 40, 17));
        }
        nl0 nl0Var2 = this.e;
        if (nl0Var2 != null) {
            nl0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.p3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i12 = org.telegram.ui.ActionBar.j6.u8;
        org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i12), getResourceProvider());
        this.K.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ll0
            public final /* synthetic */ im0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i10;
                im0 im0Var = this.b;
                switch (i122) {
                    case 0:
                        if (im0Var.onBackPressed(true)) {
                            im0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        im0 im0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) im0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        im0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        im0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        im0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(im0Var2, im0Var2.getParentActivity(), canvas, (im0Var2.L.getMeasuredWidth() / 2.0f) + f10, (im0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        im0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        im0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        im0Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ba(im0Var2, 2));
                        im0Var2.a0.addListener(new xx(im0Var2, 9));
                        im0Var2.a0.setDuration(400L);
                        im0Var2.a0.setInterpolator(org.telegram.ui.Components.qs.e);
                        im0Var2.a0.start();
                        frameLayout22.addView(im0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(im0Var2, 13));
                        break;
                    default:
                        im0Var.D0();
                        break;
                }
            }
        });
        c8.na.a(this.K);
        this.M.addView(this.K, c8.ja.e(54, 54, 19));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.U = ch0Var;
        ch0Var.h = true;
        if (this.T) {
            ch0Var.M(35);
            this.U.P(36);
        } else {
            ch0Var.P(0);
            this.U.M(0);
        }
        this.U.a0 = true;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J9, false);
        this.U.Q(x02, "Sunny");
        this.U.Q(x02, "Path 6");
        this.U.Q(x02, "Path");
        this.U.Q(x02, "Path 5");
        this.U.o();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.Q(this.L, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i12), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ll0
            public final /* synthetic */ im0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i7;
                im0 im0Var = this.b;
                switch (i122) {
                    case 0:
                        if (im0Var.onBackPressed(true)) {
                            im0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        im0 im0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) im0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        im0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        im0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        im0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(im0Var2, im0Var2.getParentActivity(), canvas, (im0Var2.L.getMeasuredWidth() / 2.0f) + f10, (im0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        im0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        im0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        im0Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ba(im0Var2, 2));
                        im0Var2.a0.addListener(new xx(im0Var2, 9));
                        im0Var2.a0.setDuration(400L);
                        im0Var2.a0.setInterpolator(org.telegram.ui.Components.qs.e);
                        im0Var2.a0.start();
                        frameLayout22.addView(im0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(im0Var2, 13));
                        break;
                    default:
                        im0Var.D0();
                        break;
                }
            }
        });
        this.M.addView(this.L, c8.ja.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        nl0 nl0Var3 = this.e;
        nl0Var3.getClass();
        nl0Var3.a = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, nl0Var3.b);
        nl0Var3.a();
        nl0Var3.invalidate();
        E0();
        F0();
        View view2 = this.fragmentView;
        ml0 ml0Var = new ml0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, ml0Var);
        return this.d;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == org.telegram.messenger.ns.f5) {
            this.h.f(true);
            this.n.f(true);
        } else if (i7 == org.telegram.messenger.ns.G3) {
            this.h.e();
            this.n.e();
        } else if (i7 == org.telegram.messenger.ns.F3) {
            this.h.e();
            this.n.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.c;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(15, this), org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.z6, org.telegram.ui.ActionBar.j6.i6, org.telegram.ui.ActionBar.j6.a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.p7, org.telegram.ui.ActionBar.j6.f6, org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        nl0 nl0Var = this.e;
        return nl0Var == null ? super.isLightStatusBar() : i0.a.h(nl0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = org.telegram.messenger.hd.M0(z11 ? 2131752426 : 2131743745, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(z11 ? 2131752425 : 2131743744, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751369, null), new ml0(this, 1));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new ml0(this, 2));
            showDialog(t1Var);
            org.telegram.ui.ActionBar.q6.U((TextView) t1Var.d(-2), org.telegram.ui.ActionBar.j6.q7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.f5);
        getNotificationCenter().c(this, org.telegram.messenger.ns.G3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.F3);
        setBulletinDelegate(new bi.t(12));
        getMediaDataController().W0();
        if (org.telegram.messenger.np.s1(this.currentAccount).r4 == null) {
            boolean z10 = org.telegram.messenger.r2.a;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.G3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.F3);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            if (this.h == null || this.n == null) {
                return;
            }
            J0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.s = e6Var;
    }
}
