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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cm0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public final si.c E;
    public final eh.c F;
    public final si.c G;
    public final eh.c H;
    public org.telegram.ui.ActionBar.d2 I;
    public gi.g1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public org.telegram.ui.Components.ky N;
    public org.telegram.ui.ActionBar.k5 O;
    public FrameLayout P;
    public FrameLayout Q;
    public gi.d R;
    public wl0 S;
    public boolean T;
    public org.telegram.ui.Components.ch0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public ac Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final ci.v8 b;
    public boolean b0;
    public final ci.v8 c;
    public i0.b c0;
    public l0 d;
    public final ue.b d0;
    public hl0 e;
    public final ue.b e0;
    public final int f;
    public wl0 h;
    public wl0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.e6 s;
    public final SparseIntArray w;
    public final org.telegram.ui.ActionBar.t4 x;
    public final org.telegram.ui.ActionBar.t4 y;

    public cm0() {
        super(null);
        this.f = org.telegram.messenger.g0.L(6.0f);
        this.w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.T = q10;
        this.b0 = q10;
        this.c0 = i0.b.e;
        ue.b bVar = new ue.b();
        this.d0 = bVar;
        ue.b bVar2 = new ue.b();
        this.e0 = bVar2;
        si.c cVar = new si.c();
        this.E = cVar;
        eh.c cVar2 = new eh.c(cVar, cVar, cVar);
        this.F = cVar2;
        si.c cVar3 = new si.c();
        this.G = cVar3;
        eh.c cVar4 = new eh.c(cVar3, cVar3, cVar3);
        this.H = cVar4;
        cVar2.g = bVar;
        cVar2.f = bVar2;
        cVar4.g = bVar;
        cVar4.f = bVar2;
        this.a = false;
        ci.e9.y(this.currentAccount, false).U();
        ci.v8 v8Var = new ci.v8(this.currentAccount, 0L, false);
        this.b = v8Var;
        v8Var.g(8, false);
        v8Var.a();
        ci.v8 v8Var2 = new ci.v8(this.currentAccount, 0L, false);
        this.c = v8Var2;
        v8Var2.g(8, false);
        v8Var2.f = true;
        v8Var2.a();
        this.resourceProvider = new dj(this, 1);
        this.x = new org.telegram.ui.ActionBar.t4(0, false, false, this.resourceProvider);
        this.y = new org.telegram.ui.ActionBar.t4(0, false, true, this.resourceProvider);
    }

    public static int B0(int i3) {
        return org.telegram.ui.ActionBar.k6.b(0.5f, (org.telegram.messenger.g0.B(i3) > 0.2f ? 1 : (org.telegram.messenger.g0.B(i3) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i3);
    }

    public static boolean G0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void Z(cm0 cm0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, el0 el0Var, ci.l5 l5Var, sf.b bVar) {
        zArr[0] = true;
        bVar.d();
        ci.e9.x(cm0Var.currentAccount, l5Var.a).h(l5Var.b, tL_starGiftUnique, j10, null, true, new ai.q4(21, bVar, el0Var));
    }

    public static void a0(cm0 cm0Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, el0 el0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ci.l5 l5Var = new ci.l5(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        ci.n5 n5Var = new ci.n5(cm0Var.getParentActivity(), cm0Var.resourceProvider, tL_starGiftUnique, l5Var, cm0Var.currentAccount, j10, k2.p1.l(tL_starGiftUnique.num, ',', sb2), false, new ci.i3(cm0Var, zArr, tL_starGiftUnique, j10, el0Var, 1));
        n5Var.h.setOnDismissListener(new ci.h3(12, zArr, el0Var));
        n5Var.b();
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
    /* JADX WARN: Type inference failed for: r4v38, types: [org.telegram.messenger.hp] */
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
                if (this.h.h == org.telegram.messenger.l10.e(f10) && this.h.n == org.telegram.messenger.l10.f(f10)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    long j10 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
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
                    wl0 wl0Var = this.h;
                    int i3 = wl0Var.h;
                    tL_peerColor2.color = i3;
                    TLRPC.PeerColor peerColor2 = f10.color;
                    int i10 = peerColor2.flags;
                    int i11 = i10 | 1;
                    peerColor2.flags = i11;
                    peerColor2.color = i3;
                    long j11 = wl0Var.n;
                    if (j11 != 0) {
                        updatecolor.flags |= 1;
                        peerColor2.flags = i10 | 3;
                        tL_peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                        tL_peerColor2.background_emoji_id = j11;
                    } else {
                        peerColor2.flags = i11 & (-3);
                        peerColor2.background_emoji_id = 0L;
                    }
                }
                getConnectionsManager().sendRequest(updatecolor, null);
                if (this.n.h == org.telegram.messenger.l10.l(f10)) {
                    wl0 wl0Var2 = this.n;
                    long j12 = wl0Var2.n;
                    TLRPC.PeerColor peerColor3 = f10.profile_color;
                    if (j12 == ((!(peerColor3 instanceof TLRPC.TL_peerColor) || (peerColor3.flags & 2) == 0) ? 0L : peerColor3.background_emoji_id)) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wl0Var2.r;
                        long j13 = tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id;
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
                    long j14 = this.n.n;
                    peerColor7.background_emoji_id = j14;
                    peerColor6.background_emoji_id = j14;
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
                        long j15 = tL_emojiStatusCollectible2.collectible_id;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= this.n.m0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.m0.get(i14);
                            if (tL_starGiftUnique2.id == j15) {
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
            this.X = true;
            org.telegram.messenger.hs notificationCenter = getNotificationCenter();
            int i15 = org.telegram.messenger.hp.C8;
            notificationCenter.k(org.telegram.messenger.hs.r, Integer.valueOf(TLObject.FLAG_19));
        }
    }

    public final void D0() {
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) this, 23, true));
            return;
        }
        wl0 H0 = H0();
        if (H0.J == null) {
            wl0 wl0Var = this.h;
            if (H0 == wl0Var) {
                wl0Var = this.n;
            }
            if (wl0Var.J != null) {
                wl0Var.d();
            }
            C0();
            finishFragment();
            I0();
            return;
        }
        wl0 wl0Var2 = this.h;
        if (H0 == wl0Var2) {
            wl0Var2 = this.n;
        }
        wl0Var2.d();
        this.r = true;
        this.R.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.J;
        el0 el0Var = new el0(this, 1);
        long e10 = org.telegram.messenger.h10.i(this.currentAccount).e();
        dg.b bVar = tL_starGiftUnique.resale_ton_only ? dg.b.b : dg.b.a;
        ci.e9.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new ai.c6(this, bVar, tL_starGiftUnique, e10, el0Var));
    }

    public final void E0() {
        this.E.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((gh.g) this.P.getBackground()).updateColors();
        F0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((gh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int f10 = ((double) org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.d6))) > 0.72d ? i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.k6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        this.d.setBackgroundColor(f10);
        si.c cVar = this.G;
        if (cVar.b != f10) {
            cVar.a(f10);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((gh.g) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final wl0 H0() {
        gi.g1 g1Var = this.J;
        return (g1Var == null || g1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
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
        xl0 xl0Var;
        if (this.I != null) {
            boolean z10 = this.V;
            boolean z11 = this.a;
            if (z10) {
                if (this.W) {
                }
                wl0 wl0Var = this.h;
                if (wl0Var.h >= 0) {
                    org.telegram.ui.Components.fc.a0(this.I).M(xl0.a(this.currentAccount, this.h.h), org.telegram.messenger.bd.M0(z11 ? 2131752436 : 2131743766, null)).j();
                } else {
                    if (wl0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(this.I);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i3 = xl0.j;
                    if (!org.telegram.ui.ActionBar.k6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        xl0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        xl0Var = new xl0(intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue, tL_peerColorCollectible.gift_emoji_id);
                    }
                    a02.M(xl0Var, org.telegram.messenger.bd.M0(z11 ? 2131752436 : 2131743766, null)).j();
                }
                this.I = null;
            }
            if (this.W) {
                if (this.V) {
                }
                wl0 wl0Var2 = this.n;
                if (wl0Var2.h >= 0) {
                    org.telegram.ui.Components.fc.a0(this.I).M(xl0.c(this.currentAccount, this.n.h), org.telegram.messenger.bd.M0(z11 ? 2131752326 : 2131743749, null)).j();
                } else if (wl0Var2.n != 0) {
                    org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(this.I);
                    TLRPC.Document e10 = org.telegram.ui.Components.g5.e(this.currentAccount, this.n.n);
                    String M0 = org.telegram.messenger.bd.M0(z11 ? 2131752325 : 2131743748, null);
                    a03.getClass();
                    org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(a03.W(), a03.c);
                    boolean D4 = org.telegram.messenger.zi.D4(e10);
                    org.telegram.ui.Components.fh0 fh0Var = ibVar.a;
                    if (D4) {
                        org.telegram.ui.ActionBar.r6.t(fh0Var, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
                    }
                    ibVar.e(e10, new String[0]);
                    fh0Var.i();
                    ibVar.b.setText(M0);
                    ibVar.b.setTextSize(1, 14.0f);
                    ibVar.b.setSingleLine(false);
                    ibVar.b.setMaxLines(3);
                    a03.b(ibVar, 2750).j();
                } else {
                    org.telegram.messenger.k5.o(null, z11 ? 2131752323 : 2131743746, org.telegram.ui.Components.fc.a0(this.I), R.raw.contact_check, 36);
                }
            }
            this.I = null;
        }
    }

    public final void J0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.O;
        if (k5Var != null) {
            k5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.h.g();
        this.n.g();
        hl0 hl0Var = this.e;
        if (hl0Var != null) {
            hl0Var.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, hl0Var.b);
            hl0Var.a();
            hl0Var.invalidate();
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
            gi.g1 g1Var = this.J;
            float a10 = b8.be.a(((g1Var == null ? 0.0f : g1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.ky kyVar = this.N;
            int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.a7));
            int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.z6));
            int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            kyVar.a.setColor(f10);
            kyVar.b.setColor(f11);
            kyVar.d = f12;
            kyVar.e = f13;
            kyVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        final int i3 = 1;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        l0 l0Var = new l0(16, context, this);
        this.d = l0Var;
        this.fragmentView = l0Var;
        this.h = new wl0(this, context, 1);
        this.n = new wl0(this, context, 0);
        hl0 hl0Var = new hl0(this, context, this.resourceProvider);
        this.e = hl0Var;
        hl0Var.F = true;
        this.n.j(false);
        final int i11 = 2;
        this.n.addView(this.e, 2, b8.mf.e(-1, -2, 55));
        gi.g1 g1Var = new gi.g1(4, context, this);
        this.J = g1Var;
        g1Var.setAdapter(new ji.v(this, i11));
        l0Var.addView(this.J, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        gi.d dVar = new gi.d(context, getResourceProvider(), true);
        this.R = dVar;
        dVar.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fl0
            public final /* synthetic */ cm0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                cm0 cm0Var = this.b;
                switch (i12) {
                    case 0:
                        if (cm0Var.onBackPressed(true)) {
                            cm0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        cm0 cm0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) cm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cm0Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        cm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ac acVar = new ac(cm0Var2, cm0Var2.getParentActivity(), canvas, (cm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (cm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        cm0Var2.Y = acVar;
                        acVar.setOnTouchListener(new fi.a(2));
                        cm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cm0Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi.ea(cm0Var2, 2));
                        cm0Var2.a0.addListener(new y20(cm0Var2, 8));
                        cm0Var2.a0.setDuration(400L);
                        cm0Var2.a0.setInterpolator(org.telegram.ui.Components.ks.e);
                        cm0Var2.a0.start();
                        frameLayout2.addView(cm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new sg0(cm0Var2, 12));
                        break;
                    default:
                        cm0Var.D0();
                        break;
                }
            }
        });
        this.P.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.addView(this.R, b8.mf.c(-1.0f, -1));
        View view = this.P;
        gh.g c2 = this.F.c(view, null, false);
        c2.p(b8.cd.j(this.resourceProvider));
        c2.r(org.telegram.messenger.g0.L(28.0f));
        c2.q(org.telegram.messenger.g0.L(5.0f));
        view.setBackground(c2);
        b8.pf.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.addView(this.P, b8.mf.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        eh.d dVar2 = new eh.d(this.H.c(this.Q, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = org.telegram.messenger.hs.x3;
        this.Q.setBackground(dVar2);
        wl0 H0 = H0();
        gi.d dVar3 = this.R;
        if (dVar3 != null && H0 != null && H0 != this.S) {
            this.S = H0;
            mi.h0 h0Var = H0.e;
            dVar3.i((CharSequence) h0Var.b, false, true);
            this.R.g((SpannableStringBuilder) h0Var.c, false);
        }
        l0Var.addView(this.Q, b8.mf.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        l0Var.addView(frameLayout3, b8.mf.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.O = k5Var;
            k5Var.l(org.telegram.messenger.bd.M0(2131752427, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            org.telegram.ui.ActionBar.r6.Y(this.O, org.telegram.ui.ActionBar.k6.A8, getResourceProvider());
            this.O.setTypeface(org.telegram.messenger.g0.o());
            this.M.addView(this.O, b8.mf.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.ky kyVar = new org.telegram.ui.Components.ky(context);
            this.N = kyVar;
            kyVar.setTabs(org.telegram.messenger.bd.M0(z10 ? 2131752428 : 2131743756, null), org.telegram.messenger.bd.M0(z10 ? 2131752429 : 2131743757, null));
            this.N.r = new el0(this, i10);
            K0();
            this.M.addView(this.N, b8.mf.e(-1, 40, 17));
        }
        hl0 hl0Var2 = this.e;
        if (hl0Var2 != null) {
            hl0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.p3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i12 = org.telegram.ui.ActionBar.k6.u8;
        org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i12), getResourceProvider());
        this.K.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fl0
            public final /* synthetic */ cm0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i10;
                cm0 cm0Var = this.b;
                switch (i122) {
                    case 0:
                        if (cm0Var.onBackPressed(true)) {
                            cm0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        cm0 cm0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) cm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        cm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ac acVar = new ac(cm0Var2, cm0Var2.getParentActivity(), canvas, (cm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (cm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        cm0Var2.Y = acVar;
                        acVar.setOnTouchListener(new fi.a(2));
                        cm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cm0Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi.ea(cm0Var2, 2));
                        cm0Var2.a0.addListener(new y20(cm0Var2, 8));
                        cm0Var2.a0.setDuration(400L);
                        cm0Var2.a0.setInterpolator(org.telegram.ui.Components.ks.e);
                        cm0Var2.a0.start();
                        frameLayout22.addView(cm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new sg0(cm0Var2, 12));
                        break;
                    default:
                        cm0Var.D0();
                        break;
                }
            }
        });
        b8.pf.a(this.K);
        this.M.addView(this.K, b8.mf.e(54, 54, 19));
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.U.Q(x02, "Sunny");
        this.U.Q(x02, "Path 6");
        this.U.Q(x02, "Path");
        this.U.Q(x02, "Path 5");
        this.U.o();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.R(this.L, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i12), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fl0
            public final /* synthetic */ cm0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i3;
                cm0 cm0Var = this.b;
                switch (i122) {
                    case 0:
                        if (cm0Var.onBackPressed(true)) {
                            cm0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        cm0 cm0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) cm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        cm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ac acVar = new ac(cm0Var2, cm0Var2.getParentActivity(), canvas, (cm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (cm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        cm0Var2.Y = acVar;
                        acVar.setOnTouchListener(new fi.a(2));
                        cm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cm0Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi.ea(cm0Var2, 2));
                        cm0Var2.a0.addListener(new y20(cm0Var2, 8));
                        cm0Var2.a0.setDuration(400L);
                        cm0Var2.a0.setInterpolator(org.telegram.ui.Components.ks.e);
                        cm0Var2.a0.start();
                        frameLayout22.addView(cm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new sg0(cm0Var2, 12));
                        break;
                    default:
                        cm0Var.D0();
                        break;
                }
            }
        });
        this.M.addView(this.L, b8.mf.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        hl0 hl0Var3 = this.e;
        hl0Var3.getClass();
        hl0Var3.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, hl0Var3.b);
        hl0Var3.a();
        hl0Var3.invalidate();
        E0();
        F0();
        View view2 = this.fragmentView;
        gl0 gl0Var = new gl0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, gl0Var);
        return this.d;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i3 == org.telegram.messenger.hs.f5) {
            this.h.f(true);
            this.n.f(true);
        } else if (i3 == org.telegram.messenger.hs.G3) {
            this.h.e();
            this.n.e();
        } else if (i3 == org.telegram.messenger.hs.F3) {
            this.h.e();
            this.n.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.c;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(15, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        hl0 hl0Var = this.e;
        return hl0Var == null ? super.isLightStatusBar() : i0.a.h(hl0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = org.telegram.messenger.bd.M0(z11 ? 2131752426 : 2131743755, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(z11 ? 2131752425 : 2131743754, null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751370, null), new gl0(this, 1));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new gl0(this, 2));
            showDialog(s1Var);
            org.telegram.ui.ActionBar.r6.V((TextView) s1Var.d(-2), org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.hs.G3);
        getNotificationCenter().c(this, org.telegram.messenger.hs.F3);
        setBulletinDelegate(new ai.y(12));
        getMediaDataController().W0();
        if (org.telegram.messenger.hp.s1(this.currentAccount).q4 == null) {
            boolean z10 = org.telegram.messenger.r2.a;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.F3);
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.s = e6Var;
    }
}
