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
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final bh.b E;
    public final gh.c F;
    public final bh.b G;
    public org.telegram.ui.ActionBar.o2 H;
    public ei.h1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.zz M;
    public org.telegram.ui.ActionBar.n5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ei.d Q;
    public fp0 R;
    public boolean S;
    public org.telegram.ui.Components.yj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public lc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean a;
    public boolean a0;
    public final ai.y9 b;
    public i0.b b0;
    public final ai.y9 c;
    public zf.b0 c0;
    public l0 d;
    public final re.b d0;
    public oo0 e;
    public final re.b e0;
    public final int f;
    public final bh.f f0;
    public final gh.d g0;
    public fp0 h;
    public final bh.b h0;
    public final wa i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public fp0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.g6 s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.j5 w;
    public final org.telegram.ui.ActionBar.j5 x;
    public final gh.c y;

    public lp0() {
        super(null);
        this.f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
        this.S = q6;
        this.a0 = q6;
        this.b0 = i0.b.e;
        re.b bVar = new re.b();
        this.d0 = bVar;
        re.b bVar2 = new re.b();
        this.e0 = bVar2;
        this.i0 = new wa(this, 1);
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        gh.c cVar = new gh.c();
        this.y = cVar;
        bh.b bVar3 = new bh.b(cVar);
        this.E = bVar3;
        gh.c cVar2 = new gh.c();
        this.F = cVar2;
        bh.b bVar4 = new bh.b(cVar2);
        this.G = bVar4;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.f0 = null;
            this.g0 = null;
            this.h0 = new bh.b(cVar);
        } else {
            bh.f fVar = new bh.f(false);
            this.f0 = fVar;
            gh.d dVar = new gh.d(cVar);
            this.g0 = dVar;
            dVar.v = new lo0(this, 1);
            dVar.d = fVar;
            dVar.e = -2;
            dVar.f = cVar;
            bh.b bVar5 = new bh.b(dVar);
            this.h0 = bVar5;
            bVar5.i = LiteMode.isEnabled(262144);
        }
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        bh.b bVar6 = this.h0;
        bVar6.e = bVar;
        bVar6.d = bVar2;
        this.a = false;
        ai.ha.y(this.currentAccount, false).V();
        ai.y9 y9Var = new ai.y9(this.currentAccount, 0L, false);
        this.b = y9Var;
        y9Var.g(8, false);
        y9Var.a();
        ai.y9 y9Var2 = new ai.y9(this.currentAccount, 0L, false);
        this.c = y9Var2;
        y9Var2.g(8, false);
        y9Var2.f = true;
        y9Var2.a();
        this.resourceProvider = new wj(this, 1);
        this.w = new org.telegram.ui.ActionBar.j5(0, false, false, this.resourceProvider);
        this.x = new org.telegram.ui.ActionBar.j5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void U(lp0 lp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ko0 ko0Var, ai.i6 i6Var, pf.c cVar) {
        zArr[0] = true;
        cVar.d();
        ai.ha.x(lp0Var.currentAccount, i6Var.a).h(i6Var.b, tL_starGiftUnique, j10, null, true, new ai.r5(21, cVar, ko0Var));
    }

    public static void V(lp0 lp0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ko0 ko0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ai.i6 i6Var = new ai.i6(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        ai.l6 l6Var = new ai.l6(lp0Var.getParentActivity(), lp0Var.resourceProvider, tL_starGiftUnique, i6Var, lp0Var.currentAccount, j10, i2.o1.m(tL_starGiftUnique.num, ',', sb2), false, new ai.b4(lp0Var, zArr, tL_starGiftUnique, j10, ko0Var, 1));
        l6Var.h.setOnDismissListener(new ai.z3(12, zArr, ko0Var));
        l6Var.b();
    }

    public static int w0(int i10) {
        return org.telegram.ui.ActionBar.k6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public final void A0() {
        int f7 = ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.d6))) > 0.72d ? i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.k6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        this.d.setBackgroundColor(f7);
        gh.c cVar = this.F;
        if (cVar.a.getColor() != f7) {
            cVar.a(f7);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final fp0 C0() {
        ei.h1 h1Var = this.I;
        return (h1Var == null || h1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.f0 == null) {
            return;
        }
        zf.b0 b0Var = this.c0;
        if (b0Var.c == 0) {
            b0Var.invalidate();
        }
        b0Var.c = i10 | b0Var.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r15.I.getCurrentPosition() == 0 ? r15.n : r15.h) == r15.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        if ((r15.I.getCurrentPosition() == 0 ? r15.n : r15.h) == r15.n) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0() {
        ArrayList<Integer> arrayList;
        gp0 gp0Var;
        if (this.H != null) {
            boolean z10 = this.U;
            boolean z11 = this.a;
            if (z10) {
                if (this.V) {
                }
                fp0 fp0Var = this.h;
                if (fp0Var.h >= 0) {
                    org.telegram.ui.Components.xc.a0(this.H).L(gp0.a(this.currentAccount, this.h.h), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (fp0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(this.H);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i10 = gp0.j;
                    if (!org.telegram.ui.ActionBar.k6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        gp0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        gp0Var = new gp0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(gp0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.H = null;
            }
            if (this.V) {
                if (this.U) {
                }
                fp0 fp0Var2 = this.n;
                if (fp0Var2.h >= 0) {
                    org.telegram.ui.Components.xc.a0(this.H).L(gp0.c(this.currentAccount, this.n.h), LocaleController.getString(z11 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (fp0Var2.n != 0) {
                    org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(this.H);
                    TLRPC.Document f7 = org.telegram.ui.Components.r5.f(this.currentAccount, this.n.n);
                    String string = LocaleController.getString(z11 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f7);
                    org.telegram.ui.Components.bk0 bk0Var = ybVar.a;
                    if (isTextColorEmoji) {
                        org.telegram.ui.ActionBar.r6.t(bk0Var, org.telegram.ui.ActionBar.k6.Hi, null, PorterDuff.Mode.SRC_IN);
                    }
                    ybVar.e(f7, new String[0]);
                    bk0Var.i();
                    ybVar.b.setText(string);
                    ybVar.b.setTextSize(1, 14.0f);
                    ybVar.b.setSingleLine(false);
                    ybVar.b.setMaxLines(3);
                    a03.b(ybVar, 2750).j();
                } else {
                    org.telegram.messenger.v0.p(z11 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.xc.a0(this.H), R.raw.contact_check, 36);
                }
            }
            this.H = null;
        }
    }

    public final void F0() {
        org.telegram.ui.ActionBar.n5 n5Var = this.N;
        if (n5Var != null) {
            n5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.h.g();
        this.n.g();
        oo0 oo0Var = this.e;
        if (oo0Var != null) {
            oo0Var.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, oo0Var.b);
            oo0Var.a();
            oo0Var.invalidate();
        }
        G0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        if (this.e == null) {
            return;
        }
        A0();
        int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
        if (this.M != null) {
            ei.h1 h1Var = this.I;
            float a2 = w7.r.a(((h1Var == null ? 0.0f : h1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.zz zzVar = this.M;
            int f7 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            int f10 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.k6.a7));
            int f11 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.k6.z6));
            int f12 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            zzVar.a.setColor(f7);
            zzVar.b.setColor(f10);
            zzVar.d = f11;
            zzVar.e = f12;
            zzVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        final int i10 = 1;
        setHasOwnBackground(true);
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        l0 l0Var = new l0(this, context, 15);
        this.d = l0Var;
        this.fragmentView = l0Var;
        this.c0 = new zf.b0(context, new jo0(this, i11));
        ih.k kVar = new ih.k(this.d);
        l0 l0Var2 = this.d;
        bh.b bVar = this.h0;
        bVar.f = kVar;
        bVar.g = l0Var2;
        this.h = new fp0(this, context, 1);
        this.n = new fp0(this, context, 0);
        oo0 oo0Var = new oo0(this, context, this.resourceProvider);
        this.e = oo0Var;
        oo0Var.E = true;
        this.n.j(false);
        final int i12 = 2;
        this.n.addView(this.e, 2, w7.z5.e(-1, -2, 55));
        ei.h1 h1Var = new ei.h1(this, context, 4);
        this.I = h1Var;
        h1Var.setAdapter(new po0(this, i11));
        l0Var.addView(this.I, w7.z5.e(-1, -1, 119));
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.f();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mo0
            public final /* synthetic */ lp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i11;
                lp0 lp0Var = this.b;
                switch (i13) {
                    case 0:
                        lp0Var.y0();
                        break;
                    case 1:
                        if (lp0Var.onBackPressed(true)) {
                            lp0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        lp0 lp0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) lp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        lp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        lc lcVar = new lc(lp0Var2, lp0Var2.getParentActivity(), canvas, (lp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (lp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        lp0Var2.X = lcVar;
                        lcVar.setOnTouchListener(new di.d(2));
                        lp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(lp0Var2, 2));
                        lp0Var2.Z.addListener(new v70(lp0Var2, 6));
                        lp0Var2.Z.setDuration(400L);
                        lp0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        lp0Var2.Z.start();
                        frameLayout2.addView(lp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lo0(lp0Var2, 0));
                        break;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.z5.c(-1.0f, -1));
        View view = this.O;
        dh.d c10 = this.E.c(view, null, false);
        c10.o(fh.c.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.b6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.addView(this.O, w7.z5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        bh.c cVar = new bh.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.G = 220;
        this.P.setBackground(cVar);
        fp0 C0 = C0();
        ei.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            mi.q qVar = C0.e;
            dVar2.i((CharSequence) qVar.b, false, true);
            this.Q.g((SpannableStringBuilder) qVar.c, false);
        }
        l0Var.addView(this.P, w7.z5.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.L = frameLayout3;
        l0Var.addView(frameLayout3, w7.z5.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
            this.N = n5Var;
            n5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.r6.Z(this.N, org.telegram.ui.ActionBar.k6.A8, getResourceProvider());
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.z5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context);
            this.M = zzVar;
            zzVar.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            this.M.r = new ko0(this, i10);
            G0();
            this.L.addView(this.M, w7.z5.e(-1, 40, 17));
        }
        oo0 oo0Var2 = this.e;
        if (oo0Var2 != null) {
            oo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i13 = org.telegram.ui.ActionBar.k6.u8;
        org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i13), getResourceProvider());
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mo0
            public final /* synthetic */ lp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i10;
                lp0 lp0Var = this.b;
                switch (i132) {
                    case 0:
                        lp0Var.y0();
                        break;
                    case 1:
                        if (lp0Var.onBackPressed(true)) {
                            lp0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        lp0 lp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) lp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        lp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        lc lcVar = new lc(lp0Var2, lp0Var2.getParentActivity(), canvas, (lp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (lp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        lp0Var2.X = lcVar;
                        lcVar.setOnTouchListener(new di.d(2));
                        lp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(lp0Var2, 2));
                        lp0Var2.Z.addListener(new v70(lp0Var2, 6));
                        lp0Var2.Z.setDuration(400L);
                        lp0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        lp0Var2.Z.start();
                        frameLayout22.addView(lp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lo0(lp0Var2, 0));
                        break;
                }
            }
        });
        w7.b6.a(this.J);
        this.L.addView(this.J, w7.z5.e(54, 54, 19));
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = yj0Var;
        yj0Var.h = true;
        if (this.S) {
            yj0Var.M(35);
            this.T.P(36);
        } else {
            yj0Var.P(0);
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
        org.telegram.ui.ActionBar.r6.S(this.K, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i13), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mo0
            public final /* synthetic */ lp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i12;
                lp0 lp0Var = this.b;
                switch (i132) {
                    case 0:
                        lp0Var.y0();
                        break;
                    case 1:
                        if (lp0Var.onBackPressed(true)) {
                            lp0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        lp0 lp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) lp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        lp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        lc lcVar = new lc(lp0Var2, lp0Var2.getParentActivity(), canvas, (lp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (lp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        lp0Var2.X = lcVar;
                        lcVar.setOnTouchListener(new di.d(2));
                        lp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(lp0Var2, 2));
                        lp0Var2.Z.addListener(new v70(lp0Var2, 6));
                        lp0Var2.Z.setDuration(400L);
                        lp0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        lp0Var2.Z.start();
                        frameLayout22.addView(lp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lo0(lp0Var2, 0));
                        break;
                }
            }
        });
        this.L.addView(this.K, w7.z5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        oo0 oo0Var3 = this.e;
        oo0Var3.getClass();
        oo0Var3.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, oo0Var3.b);
        oo0Var3.a();
        oo0Var3.invalidate();
        z0();
        this.d.addView(this.c0);
        A0();
        View view2 = this.fragmentView;
        jo0 jo0Var = new jo0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, jo0Var);
        return this.d;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            this.h.f(true);
            this.n.f(true);
        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
            this.h.e();
            this.n.e();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            this.h.e();
            this.n.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.c;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new i6(16, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        oo0 oo0Var = this.e;
        return oo0Var == null ? super.isLightStatusBar() : i0.a.h(oo0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new jo0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new jo0(this, 3));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            showDialog(c2Var);
            org.telegram.ui.ActionBar.r6.W((TextView) c2Var.d(-2), org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new ei.o8(11));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            if (this.h == null || this.n == null) {
                return;
            }
            F0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.s = g6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r3 != (r8 instanceof org.telegram.tgnet.TLRPC.TL_peerColorCollectible ? r8.collectible_id : 0)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if ((r3 == null ? 0 : r3.collectible_id) != org.telegram.messenger.UserObject.getProfileCollectibleId(r0)) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty] */
    /* JADX WARN: Type inference failed for: r3v15, types: [org.telegram.tgnet.TLRPC$EmojiStatus] */
    /* JADX WARN: Type inference failed for: r3v16, types: [org.telegram.tgnet.TLRPC$TL_inputEmojiStatusCollectible] */
    /* JADX WARN: Type inference failed for: r4v38, types: [org.telegram.messenger.MessagesController] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0() {
        if (this.W) {
            return;
        }
        boolean z10 = this.a;
        if (z10 || getUserConfig().isPremium()) {
            if (z10) {
                finishFragment();
            } else {
                TLRPC.User currentUser = getUserConfig().getCurrentUser();
                if (currentUser.color == null) {
                    TLRPC.TL_peerColor tL_peerColor = new TLRPC.TL_peerColor();
                    currentUser.color = tL_peerColor;
                    tL_peerColor.flags |= 1;
                    tL_peerColor.color = (int) (currentUser.id % 7);
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
                if (this.h.h == UserObject.getColorId(currentUser) && this.h.n == UserObject.getEmojiId(currentUser)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    long j10 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = currentUser.color;
                }
                this.U = true;
                TL_account.updateColor updatecolor = new TL_account.updateColor();
                currentUser.flags2 |= 256;
                currentUser.color.flags |= 1;
                if (this.h.s != null) {
                    updatecolor.flags |= 4;
                    TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                    updatecolor.color = tL_inputPeerColorCollectible;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.h.s;
                    tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                    currentUser.color = tL_peerColorCollectible2;
                } else {
                    updatecolor.flags |= 4;
                    TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                    updatecolor.color = tL_peerColor2;
                    tL_peerColor2.flags |= 1;
                    fp0 fp0Var = this.h;
                    int i10 = fp0Var.h;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j11 = fp0Var.n;
                    if (j11 != 0) {
                        updatecolor.flags |= 1;
                        peerColor2.flags = i11 | 3;
                        tL_peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                        tL_peerColor2.background_emoji_id = j11;
                    } else {
                        peerColor2.flags = i12 & (-3);
                        peerColor2.background_emoji_id = 0L;
                    }
                }
                getConnectionsManager().sendRequest(updatecolor, null);
                if (this.n.h == UserObject.getProfileColorId(currentUser) && this.n.n == UserObject.getOnlyProfileEmojiId(currentUser)) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.n.r;
                }
                this.V = true;
                if (currentUser.profile_color == null) {
                    currentUser.profile_color = new TLRPC.TL_peerColor();
                }
                TL_account.updateColor updatecolor2 = new TL_account.updateColor();
                updatecolor2.for_profile = true;
                currentUser.flags2 |= 512;
                if (this.n.h < 0) {
                    currentUser.profile_color.flags &= -2;
                } else {
                    if (updatecolor2.color == null) {
                        updatecolor2.flags |= 4;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor3 = updatecolor2.color;
                    peerColor3.flags |= 1;
                    int i13 = this.n.h;
                    peerColor3.color = i13;
                    TLRPC.PeerColor peerColor4 = currentUser.profile_color;
                    peerColor4.flags |= 1;
                    peerColor4.color = i13;
                }
                if (this.n.n != 0) {
                    int i14 = updatecolor2.flags;
                    updatecolor2.flags = i14 | 1;
                    currentUser.profile_color.flags |= 2;
                    if (updatecolor2.color == null) {
                        updatecolor2.flags = i14 | 5;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor5 = updatecolor2.color;
                    peerColor5.flags |= 2;
                    TLRPC.PeerColor peerColor6 = currentUser.profile_color;
                    long j12 = this.n.n;
                    peerColor6.background_emoji_id = j12;
                    peerColor5.background_emoji_id = j12;
                } else {
                    TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                    peerColor7.flags &= -3;
                    peerColor7.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!B0(currentUser.emoji_status, this.n.r) && (this.n.r != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.n.r;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j13 = tL_emojiStatusCollectible2.collectible_id;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= this.n.l0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.l0.get(i15);
                            if (tL_starGiftUnique2.id == j13) {
                                tL_starGiftUnique = tL_starGiftUnique2;
                                break;
                            }
                            i15++;
                        }
                    }
                    if (tL_starGiftUnique != null) {
                        tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
                    }
                    getMessagesController().updateEmojiStatus(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
                }
                getMessagesController().putUser(currentUser, false);
                getUserConfig().saveConfig(true);
                finishFragment();
                E0();
            }
            this.W = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public final void y0() {
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) this, 23, true));
            return;
        }
        fp0 C0 = C0();
        if (C0.I == null) {
            fp0 fp0Var = this.h;
            if (C0 == fp0Var) {
                fp0Var = this.n;
            }
            if (fp0Var.I != null) {
                fp0Var.d();
            }
            x0();
            finishFragment();
            E0();
            return;
        }
        fp0 fp0Var2 = this.h;
        if (C0 == fp0Var2) {
            fp0Var2 = this.n;
        }
        fp0Var2.d();
        this.r = true;
        this.Q.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
        ko0 ko0Var = new ko0(this, 0);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        ag.b bVar = tL_starGiftUnique.resale_ton_only ? ag.b.b : ag.b.a;
        ai.ha.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new no0(this, bVar, tL_starGiftUnique, clientUserId, ko0Var));
    }

    public final void z0() {
        this.y.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.w.invalidate();
        this.h.x.invalidate();
        this.n.w.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((dh.d) this.O.getBackground()).updateColors();
        A0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).updateColors();
        }
    }
}
