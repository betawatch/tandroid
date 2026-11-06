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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class hm0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final ri.c D;
    public final dh.c E;
    public final ri.c F;
    public final dh.c G;
    public org.telegram.ui.ActionBar.f2 H;
    public fi.g1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.my M;
    public org.telegram.ui.ActionBar.k5 N;
    public FrameLayout O;
    public FrameLayout P;
    public fi.d Q;
    public bm0 R;
    public boolean S;
    public org.telegram.ui.Components.zg0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public cc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean a;
    public boolean a0;
    public final bi.v9 b;
    public i0.b b0;
    public final bi.v9 c;
    public final xe.b c0;
    public k0 d;
    public final xe.b d0;
    public ml0 e;
    public final int f;
    public bm0 h;
    public bm0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.f6 s;
    public final SparseIntArray w;
    public final org.telegram.ui.ActionBar.t4 x;
    public final org.telegram.ui.ActionBar.t4 y;

    public hm0() {
        super(null);
        this.f = org.telegram.messenger.g0.L(6.0f);
        this.w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.S = q10;
        this.a0 = q10;
        this.b0 = i0.b.e;
        xe.b bVar = new xe.b();
        this.c0 = bVar;
        xe.b bVar2 = new xe.b();
        this.d0 = bVar2;
        ri.c cVar = new ri.c();
        this.D = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.E = cVar2;
        ri.c cVar3 = new ri.c();
        this.F = cVar3;
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.G = cVar4;
        cVar2.g = bVar;
        cVar2.f = bVar2;
        cVar4.g = bVar;
        cVar4.f = bVar2;
        this.a = false;
        bi.ea.y(this.currentAccount, false).U();
        bi.v9 v9Var = new bi.v9(this.currentAccount, 0L, false);
        this.b = v9Var;
        v9Var.g(8, false);
        v9Var.a();
        bi.v9 v9Var2 = new bi.v9(this.currentAccount, 0L, false);
        this.c = v9Var2;
        v9Var2.g(8, false);
        v9Var2.f = true;
        v9Var2.a();
        this.resourceProvider = new hj(this, 1);
        this.x = new org.telegram.ui.ActionBar.t4(0, false, false, this.resourceProvider);
        this.y = new org.telegram.ui.ActionBar.t4(0, false, true, this.resourceProvider);
    }

    public static int B0(int i7) {
        return org.telegram.ui.ActionBar.k6.b(0.5f, (org.telegram.messenger.g0.B(i7) > 0.2f ? 1 : (org.telegram.messenger.g0.B(i7) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i7);
    }

    public static boolean G0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z9 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z9 && tL_emojiStatusCollectible != null && z9 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void Z(hm0 hm0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, il0 il0Var, bi.h6 h6Var, vf.b bVar) {
        zArr[0] = true;
        bVar.d();
        bi.ea.x(hm0Var.currentAccount, h6Var.a).h(h6Var.b, tL_starGiftUnique, j3, null, true, new bi.p5(20, bVar, il0Var));
    }

    public static void a0(hm0 hm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, il0 il0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        bi.h6 h6Var = new bi.h6(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        bi.k6 k6Var = new bi.k6(hm0Var.getParentActivity(), hm0Var.resourceProvider, tL_starGiftUnique, h6Var, hm0Var.currentAccount, j3, jg.g.m(tL_starGiftUnique.num, ',', sb2), false, new bi.w3(hm0Var, zArr, tL_starGiftUnique, j3, il0Var, 1));
        k6Var.h.setOnDismissListener(new bi.u3(12, zArr, il0Var));
        k6Var.b();
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
    /* JADX WARN: Type inference failed for: r4v38, types: [org.telegram.messenger.qp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0() {
        if (this.W) {
            return;
        }
        boolean z9 = this.a;
        if (z9 || getUserConfig().q()) {
            if (z9) {
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
                if (this.h.h == org.telegram.messenger.t10.e(f10) && this.h.n == org.telegram.messenger.t10.f(f10)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    long j3 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = f10.color;
                }
                this.U = true;
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
                    bm0 bm0Var = this.h;
                    int i7 = bm0Var.h;
                    tL_peerColor2.color = i7;
                    TLRPC.PeerColor peerColor2 = f10.color;
                    int i10 = peerColor2.flags;
                    int i11 = i10 | 1;
                    peerColor2.flags = i11;
                    peerColor2.color = i7;
                    long j10 = bm0Var.n;
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
                if (this.n.h == org.telegram.messenger.t10.l(f10)) {
                    bm0 bm0Var2 = this.n;
                    long j11 = bm0Var2.n;
                    TLRPC.PeerColor peerColor3 = f10.profile_color;
                    if (j11 == ((!(peerColor3 instanceof TLRPC.TL_peerColor) || (peerColor3.flags & 2) == 0) ? 0L : peerColor3.background_emoji_id)) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bm0Var2.r;
                        long j12 = tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id;
                        TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                    }
                }
                this.V = true;
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
                            if (i14 >= this.n.l0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.l0.get(i14);
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
                    getMessagesController().g5(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
                }
                getMessagesController().X3(f10, false, false);
                getUserConfig().v(true);
                finishFragment();
                I0();
            }
            this.W = true;
            org.telegram.messenger.qs notificationCenter = getNotificationCenter();
            int i15 = org.telegram.messenger.qp.C8;
            notificationCenter.k(org.telegram.messenger.qs.r, Integer.valueOf(TLObject.FLAG_19));
        }
    }

    public final void D0() {
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 23, true));
            return;
        }
        bm0 H0 = H0();
        if (H0.I == null) {
            bm0 bm0Var = this.h;
            if (H0 == bm0Var) {
                bm0Var = this.n;
            }
            if (bm0Var.I != null) {
                bm0Var.d();
            }
            C0();
            finishFragment();
            I0();
            return;
        }
        bm0 bm0Var2 = this.h;
        if (H0 == bm0Var2) {
            bm0Var2 = this.n;
        }
        bm0Var2.d();
        this.r = true;
        this.Q.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.I;
        il0 il0Var = new il0(this, 1);
        long e10 = org.telegram.messenger.p10.i(this.currentAccount).e();
        cg.b bVar = tL_starGiftUnique.resale_ton_only ? cg.b.b : cg.b.a;
        bi.ea.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new jl0(this, bVar, tL_starGiftUnique, e10, il0Var));
    }

    public final void E0() {
        this.D.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((fh.g) this.O.getBackground()).updateColors();
        F0();
        Iterator it = this.d0.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int f10 = ((double) org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.d6))) > 0.72d ? i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.k6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        this.d.setBackgroundColor(f10);
        ri.c cVar = this.F;
        if (cVar.b != f10) {
            cVar.a(f10);
            Iterator it = this.d0.iterator();
            while (it.hasNext()) {
                ((fh.g) it.next()).updateColors();
            }
            Iterator it2 = this.c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final bm0 H0() {
        fi.g1 g1Var = this.I;
        return (g1Var == null || g1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r18.I.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if ((r18.I.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.n) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0() {
        ArrayList<Integer> arrayList;
        cm0 cm0Var;
        if (this.H != null) {
            boolean z9 = this.U;
            boolean z10 = this.a;
            if (z9) {
                if (this.V) {
                }
                bm0 bm0Var = this.h;
                if (bm0Var.h >= 0) {
                    org.telegram.ui.Components.hc.a0(this.H).M(cm0.a(this.currentAccount, this.h.h), org.telegram.messenger.hd.M0(z10 ? 2131752436 : 2131743757, null)).j();
                } else {
                    if (bm0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(this.H);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i7 = cm0.j;
                    if (!org.telegram.ui.ActionBar.k6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        cm0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        cm0Var = new cm0(intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue, tL_peerColorCollectible.gift_emoji_id);
                    }
                    a02.M(cm0Var, org.telegram.messenger.hd.M0(z10 ? 2131752436 : 2131743757, null)).j();
                }
                this.H = null;
            }
            if (this.V) {
                if (this.U) {
                }
                bm0 bm0Var2 = this.n;
                if (bm0Var2.h >= 0) {
                    org.telegram.ui.Components.hc.a0(this.H).M(cm0.c(this.currentAccount, this.n.h), org.telegram.messenger.hd.M0(z10 ? 2131752326 : 2131743740, null)).j();
                } else if (bm0Var2.n != 0) {
                    org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(this.H);
                    TLRPC.Document e10 = org.telegram.ui.Components.i5.e(this.currentAccount, this.n.n);
                    String M0 = org.telegram.messenger.hd.M0(z10 ? 2131752325 : 2131743739, null);
                    a03.getClass();
                    org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(a03.W(), a03.c);
                    boolean D4 = org.telegram.messenger.ij.D4(e10);
                    org.telegram.ui.Components.ch0 ch0Var = kbVar.a;
                    if (D4) {
                        org.telegram.ui.ActionBar.r6.t(ch0Var, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
                    }
                    kbVar.e(e10, new String[0]);
                    ch0Var.i();
                    kbVar.b.setText(M0);
                    kbVar.b.setTextSize(1, 14.0f);
                    kbVar.b.setSingleLine(false);
                    kbVar.b.setMaxLines(3);
                    a03.b(kbVar, 2750).j();
                } else {
                    org.telegram.messenger.k5.o(null, z10 ? 2131752323 : 2131743737, org.telegram.ui.Components.hc.a0(this.H), R.raw.contact_check, 36);
                }
            }
            this.H = null;
        }
    }

    public final void J0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.N;
        if (k5Var != null) {
            k5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.h.g();
        this.n.g();
        ml0 ml0Var = this.e;
        if (ml0Var != null) {
            ml0Var.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, ml0Var.b);
            ml0Var.a();
            ml0Var.invalidate();
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
        if (this.M != null) {
            fi.g1 g1Var = this.I;
            float a10 = c8.j9.a(((g1Var == null ? 0.0f : g1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.my myVar = this.M;
            int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.a7));
            int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.z6));
            int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            myVar.a.setColor(f10);
            myVar.b.setColor(f11);
            myVar.d = f12;
            myVar.e = f13;
            myVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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
        this.h = new bm0(this, context, 1);
        this.n = new bm0(this, context, 0);
        ml0 ml0Var = new ml0(this, context, this.resourceProvider);
        this.e = ml0Var;
        ml0Var.E = true;
        this.n.j(false);
        final int i11 = 2;
        this.n.addView(this.e, 2, c8.ha.e(-1, -2, 55));
        fi.g1 g1Var = new fi.g1(4, context, this);
        this.I = g1Var;
        g1Var.setAdapter(new ii.x(this, i11));
        k0Var.addView(this.I, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.f();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kl0
            public final /* synthetic */ hm0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                hm0 hm0Var = this.b;
                switch (i12) {
                    case 0:
                        if (hm0Var.onBackPressed(true)) {
                            hm0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        hm0 hm0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) hm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        hm0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        hm0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        hm0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(hm0Var2, hm0Var2.getParentActivity(), canvas, (hm0Var2.K.getMeasuredWidth() / 2.0f) + f10, (hm0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        hm0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        hm0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        hm0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(hm0Var2, 2));
                        hm0Var2.Z.addListener(new d30(hm0Var2, 8));
                        hm0Var2.Z.setDuration(400L);
                        hm0Var2.Z.setInterpolator(org.telegram.ui.Components.ks.e);
                        hm0Var2.Z.start();
                        frameLayout2.addView(hm0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(hm0Var2, 13));
                        break;
                    default:
                        hm0Var.D0();
                        break;
                }
            }
        });
        this.O.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.O.addView(this.Q, c8.ha.c(-1.0f, -1));
        View view = this.O;
        fh.g c10 = this.E.c(view, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        view.setBackground(c10);
        c8.ka.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.addView(this.O, c8.ha.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(this.G.c(this.P, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.G = org.telegram.messenger.qs.x3;
        this.P.setBackground(dVar2);
        bm0 H0 = H0();
        fi.d dVar3 = this.Q;
        if (dVar3 != null && H0 != null && H0 != this.R) {
            this.R = H0;
            j2.n nVar = H0.e;
            dVar3.i((CharSequence) nVar.b, false, true);
            this.Q.g((SpannableStringBuilder) nVar.c, false);
        }
        k0Var.addView(this.P, c8.ha.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.L = frameLayout3;
        k0Var.addView(frameLayout3, c8.ha.e(-1, -2, 55));
        boolean z9 = this.a;
        if (z9) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.N = k5Var;
            k5Var.l(org.telegram.messenger.hd.M0(2131752427, null), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.r6.Y(this.N, org.telegram.ui.ActionBar.k6.A8, getResourceProvider());
            this.N.setTypeface(org.telegram.messenger.g0.o());
            this.L.addView(this.N, c8.ha.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.my myVar = new org.telegram.ui.Components.my(context);
            this.M = myVar;
            myVar.setTabs(org.telegram.messenger.hd.M0(z9 ? 2131752428 : 2131743747, null), org.telegram.messenger.hd.M0(z9 ? 2131752429 : 2131743748, null));
            this.M.r = new il0(this, i10);
            K0();
            this.L.addView(this.M, c8.ha.e(-1, 40, 17));
        }
        ml0 ml0Var2 = this.e;
        if (ml0Var2 != null) {
            ml0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.p3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.k6.u8;
        org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i12), getResourceProvider());
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kl0
            public final /* synthetic */ hm0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i10;
                hm0 hm0Var = this.b;
                switch (i122) {
                    case 0:
                        if (hm0Var.onBackPressed(true)) {
                            hm0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        hm0 hm0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) hm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        hm0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        hm0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        hm0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(hm0Var2, hm0Var2.getParentActivity(), canvas, (hm0Var2.K.getMeasuredWidth() / 2.0f) + f10, (hm0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        hm0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        hm0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        hm0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(hm0Var2, 2));
                        hm0Var2.Z.addListener(new d30(hm0Var2, 8));
                        hm0Var2.Z.setDuration(400L);
                        hm0Var2.Z.setInterpolator(org.telegram.ui.Components.ks.e);
                        hm0Var2.Z.start();
                        frameLayout22.addView(hm0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(hm0Var2, 13));
                        break;
                    default:
                        hm0Var.D0();
                        break;
                }
            }
        });
        c8.ka.a(this.J);
        this.L.addView(this.J, c8.ha.e(54, 54, 19));
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.T = zg0Var;
        zg0Var.h = true;
        if (this.S) {
            zg0Var.M(35);
            this.T.P(36);
        } else {
            zg0Var.P(0);
            this.T.M(0);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.R(this.K, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i12), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kl0
            public final /* synthetic */ hm0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i7;
                hm0 hm0Var = this.b;
                switch (i122) {
                    case 0:
                        if (hm0Var.onBackPressed(true)) {
                            hm0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        hm0 hm0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) hm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        hm0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        hm0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        hm0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(hm0Var2, hm0Var2.getParentActivity(), canvas, (hm0Var2.K.getMeasuredWidth() / 2.0f) + f10, (hm0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        hm0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        hm0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        hm0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(hm0Var2, 2));
                        hm0Var2.Z.addListener(new d30(hm0Var2, 8));
                        hm0Var2.Z.setDuration(400L);
                        hm0Var2.Z.setInterpolator(org.telegram.ui.Components.ks.e);
                        hm0Var2.Z.start();
                        frameLayout22.addView(hm0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(hm0Var2, 13));
                        break;
                    default:
                        hm0Var.D0();
                        break;
                }
            }
        });
        this.L.addView(this.K, c8.ha.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        ml0 ml0Var3 = this.e;
        ml0Var3.getClass();
        ml0Var3.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, ml0Var3.b);
        ml0Var3.a();
        ml0Var3.invalidate();
        E0();
        F0();
        View view2 = this.fragmentView;
        ll0 ll0Var = new ll0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, ll0Var);
        return this.d;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == org.telegram.messenger.qs.f5) {
            this.h.f(true);
            this.n.f(true);
        } else if (i7 == org.telegram.messenger.qs.G3) {
            this.h.e();
            this.n.e();
        } else if (i7 == org.telegram.messenger.qs.F3) {
            this.h.e();
            this.n.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.o3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.o3.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(15, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        ml0 ml0Var = this.e;
        return ml0Var == null ? super.isLightStatusBar() : i0.a.h(ml0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        boolean z10 = this.a;
        if (z10 || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.onBackPressed(z9);
        }
        if (z9 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = org.telegram.messenger.hd.M0(z10 ? 2131752426 : 2131743746, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(z10 ? 2131752425 : 2131743745, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751370, null), new ll0(this, 1));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new ll0(this, 2));
            showDialog(u1Var);
            org.telegram.ui.ActionBar.r6.V((TextView) u1Var.d(-2), org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.F3);
        setBulletinDelegate(new fi.r7(11));
        getMediaDataController().W0();
        if (org.telegram.messenger.qp.s1(this.currentAccount).q4 == null) {
            boolean z9 = org.telegram.messenger.r2.a;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.F3);
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.s = f6Var;
    }
}
