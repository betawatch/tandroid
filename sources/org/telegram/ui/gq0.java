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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gq0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final bh.b E;
    public final gh.c F;
    public final bh.b G;
    public org.telegram.ui.ActionBar.m2 H;
    public di.h1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.c00 M;
    public org.telegram.ui.ActionBar.h5 N;
    public FrameLayout O;
    public FrameLayout P;
    public di.d Q;
    public aq0 R;
    public boolean S;
    public org.telegram.ui.Components.yj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public rc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean a;
    public boolean a0;
    public final zh.f5 b;
    public i0.b b0;
    public final zh.f5 c;
    public zf.c0 c0;
    public l0 d;
    public final re.b d0;
    public jp0 e;
    public final re.b e0;
    public final int f;
    public final bh.f f0;
    public final gh.d g0;
    public aq0 h;
    public final bh.b h0;
    public final ab i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public aq0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.c6 s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.d5 w;
    public final org.telegram.ui.ActionBar.d5 x;
    public final gh.c y;

    public gq0() {
        super(null);
        this.f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.S = q6;
        this.a0 = q6;
        this.b0 = i0.b.e;
        re.b bVar = new re.b();
        this.d0 = bVar;
        re.b bVar2 = new re.b();
        this.e0 = bVar2;
        this.i0 = new ab(this, 1);
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
            dVar.v = new fp0(this, 1);
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
        zh.n5.y(this.currentAccount, false).V();
        zh.f5 f5Var = new zh.f5(this.currentAccount, 0L, false);
        this.b = f5Var;
        f5Var.f(8, false);
        f5Var.a();
        zh.f5 f5Var2 = new zh.f5(this.currentAccount, 0L, false);
        this.c = f5Var2;
        f5Var2.f(8, false);
        f5Var2.f = true;
        f5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.w = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.x = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void U(gq0 gq0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ep0 ep0Var, zh.v2 v2Var, pf.c cVar) {
        zArr[0] = true;
        cVar.d();
        zh.n5.x(gq0Var.currentAccount, v2Var.a).h(v2Var.b, tL_starGiftUnique, j10, null, true, new bi.f0(17, cVar, ep0Var));
    }

    public static void V(gq0 gq0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ep0 ep0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zh.v2 v2Var = new zh.v2(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        zh.x2 x2Var = new zh.x2(gq0Var.getParentActivity(), gq0Var.resourceProvider, tL_starGiftUnique, v2Var, gq0Var.currentAccount, j10, org.telegram.messenger.q.i(tL_starGiftUnique.num, ',', sb2), false, new ip0(gq0Var, zArr, tL_starGiftUnique, j10, ep0Var, 0));
        x2Var.h.setOnDismissListener(new fi.d0(10, zArr, ep0Var));
        x2Var.b();
    }

    public static int w0(int i10) {
        return org.telegram.ui.ActionBar.g6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public final void A0() {
        int d = ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.g6.d6))) > 0.72d ? i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.g6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.g6.a7);
        this.d.setBackgroundColor(d);
        gh.c cVar = this.F;
        if (cVar.a.getColor() != d) {
            cVar.a(d);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).v();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final aq0 C0() {
        di.h1 h1Var = this.I;
        return (h1Var == null || h1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.f0 == null) {
            return;
        }
        zf.c0 c0Var = this.c0;
        if (c0Var.c == 0) {
            c0Var.invalidate();
        }
        c0Var.c = i10 | c0Var.c;
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
        bq0 bq0Var;
        if (this.H != null) {
            boolean z10 = this.U;
            boolean z11 = this.a;
            if (z10) {
                if (this.V) {
                }
                aq0 aq0Var = this.h;
                if (aq0Var.h >= 0) {
                    org.telegram.ui.Components.zc.a0(this.H).L(bq0.a(this.currentAccount, this.h.h), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (aq0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(this.H);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i10 = bq0.j;
                    if (!org.telegram.ui.ActionBar.g6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        bq0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        bq0Var = new bq0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(bq0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.H = null;
            }
            if (this.V) {
                if (this.U) {
                }
                aq0 aq0Var2 = this.n;
                if (aq0Var2.h >= 0) {
                    org.telegram.ui.Components.zc.a0(this.H).L(bq0.c(this.currentAccount, this.n.h), LocaleController.getString(z11 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (aq0Var2.n != 0) {
                    org.telegram.ui.Components.zc a03 = org.telegram.ui.Components.zc.a0(this.H);
                    TLRPC.Document f7 = org.telegram.ui.Components.s5.f(this.currentAccount, this.n.n);
                    String string = LocaleController.getString(z11 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f7);
                    org.telegram.ui.Components.bk0 bk0Var = acVar.a;
                    if (isTextColorEmoji) {
                        bk0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
                    }
                    acVar.e(f7, new String[0]);
                    bk0Var.i();
                    acVar.b.setText(string);
                    acVar.b.setTextSize(1, 14.0f);
                    acVar.b.setSingleLine(false);
                    acVar.b.setMaxLines(3);
                    a03.b(acVar, 2750).j();
                } else {
                    org.telegram.messenger.q.r(z11 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.zc.a0(this.H), R.raw.contact_check, 36);
                }
            }
            this.H = null;
        }
    }

    public final void F0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.N;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
        }
        this.h.g();
        this.n.g();
        jp0 jp0Var = this.e;
        if (jp0Var != null) {
            jp0Var.a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, jp0Var.b);
            jp0Var.a();
            jp0Var.invalidate();
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
            di.h1 h1Var = this.I;
            float a2 = w7.s.a(((h1Var == null ? 0.0f : h1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.c00 c00Var = this.M;
            int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.g6.a7));
            int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.g6.z6));
            int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            c00Var.a.setColor(d);
            c00Var.b.setColor(d10);
            c00Var.d = d11;
            c00Var.e = d12;
            c00Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        this.c0 = new zf.c0(context, new dp0(this, i11));
        ih.j jVar = new ih.j(this.d);
        l0 l0Var2 = this.d;
        bh.b bVar = this.h0;
        bVar.f = jVar;
        bVar.g = l0Var2;
        this.h = new aq0(this, context, 1);
        this.n = new aq0(this, context, 0);
        jp0 jp0Var = new jp0(this, context, this.resourceProvider);
        this.e = jp0Var;
        jp0Var.E = true;
        this.n.j(false);
        final int i12 = 2;
        this.n.addView(this.e, 2, w7.a6.e(-1, -2, 55));
        di.h1 h1Var = new di.h1(this, context, 4);
        this.I = h1Var;
        h1Var.setAdapter(new kp0(this, i11));
        l0Var.addView(this.I, w7.a6.e(-1, -1, 119));
        di.d dVar = new di.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gp0
            public final /* synthetic */ gq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i11;
                gq0 gq0Var = this.b;
                switch (i13) {
                    case 0:
                        gq0Var.y0();
                        break;
                    case 1:
                        if (gq0Var.onBackPressed(true)) {
                            gq0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        gq0 gq0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) gq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gq0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        gq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        rc rcVar = new rc(gq0Var2, gq0Var2.getParentActivity(), canvas, (gq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (gq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        gq0Var2.X = rcVar;
                        rcVar.setOnTouchListener(new ci.d(2));
                        gq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(gq0Var2, 2));
                        gq0Var2.Z.addListener(new lj0(gq0Var2, 3));
                        gq0Var2.Z.setDuration(400L);
                        gq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        gq0Var2.Z.start();
                        frameLayout2.addView(gq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new fp0(gq0Var2, 0));
                        break;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.a6.d(-1.0f, -1));
        View view = this.O;
        dh.d c10 = this.E.c(view, null, false);
        c10.o(fh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.c6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.addView(this.O, w7.a6.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        bh.c cVar = new bh.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.q = 220;
        this.P.setBackground(cVar);
        aq0 C0 = C0();
        di.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n6.o oVar = C0.e;
            dVar2.g((CharSequence) oVar.b, false, true);
            this.Q.f((SpannableStringBuilder) oVar.c, false);
        }
        l0Var.addView(this.P, w7.a6.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.L = frameLayout3;
        l0Var.addView(frameLayout3, w7.a6.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.N = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.a6.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -2, 19));
        } else {
            org.telegram.ui.Components.c00 c00Var = new org.telegram.ui.Components.c00(context);
            this.M = c00Var;
            c00Var.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            this.M.r = new ep0(this, i10);
            G0();
            this.L.addView(this.M, w7.a6.e(-1, 40, 17));
        }
        jp0 jp0Var2 = this.e;
        if (jp0Var2 != null) {
            jp0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i13 = org.telegram.ui.ActionBar.g6.u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i13), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gp0
            public final /* synthetic */ gq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i10;
                gq0 gq0Var = this.b;
                switch (i132) {
                    case 0:
                        gq0Var.y0();
                        break;
                    case 1:
                        if (gq0Var.onBackPressed(true)) {
                            gq0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        gq0 gq0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) gq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        gq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        rc rcVar = new rc(gq0Var2, gq0Var2.getParentActivity(), canvas, (gq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (gq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        gq0Var2.X = rcVar;
                        rcVar.setOnTouchListener(new ci.d(2));
                        gq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(gq0Var2, 2));
                        gq0Var2.Z.addListener(new lj0(gq0Var2, 3));
                        gq0Var2.Z.setDuration(400L);
                        gq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        gq0Var2.Z.start();
                        frameLayout22.addView(gq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new fp0(gq0Var2, 0));
                        break;
                }
            }
        });
        w7.c6.a(this.J);
        this.L.addView(this.J, w7.a6.e(54, 54, 19));
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
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i13), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gp0
            public final /* synthetic */ gq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i12;
                gq0 gq0Var = this.b;
                switch (i132) {
                    case 0:
                        gq0Var.y0();
                        break;
                    case 1:
                        if (gq0Var.onBackPressed(true)) {
                            gq0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        gq0 gq0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) gq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        gq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        rc rcVar = new rc(gq0Var2, gq0Var2.getParentActivity(), canvas, (gq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (gq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        gq0Var2.X = rcVar;
                        rcVar.setOnTouchListener(new ci.d(2));
                        gq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(gq0Var2, 2));
                        gq0Var2.Z.addListener(new lj0(gq0Var2, 3));
                        gq0Var2.Z.setDuration(400L);
                        gq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        gq0Var2.Z.start();
                        frameLayout22.addView(gq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new fp0(gq0Var2, 0));
                        break;
                }
            }
        });
        this.L.addView(this.K, w7.a6.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        jp0 jp0Var3 = this.e;
        jp0Var3.getClass();
        jp0Var3.a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, jp0Var3.b);
        jp0Var3.a();
        jp0Var3.invalidate();
        z0();
        this.d.addView(this.c0);
        A0();
        View view2 = this.fragmentView;
        dp0 dp0Var = new dp0(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.i(view2, dp0Var);
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

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new e(this, 27), org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.z6, org.telegram.ui.ActionBar.g6.i6, org.telegram.ui.ActionBar.g6.a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.p7, org.telegram.ui.ActionBar.g6.f6, org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        jp0 jp0Var = this.e;
        return jp0Var == null ? super.isLightStatusBar() : i0.a.f(jp0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new dp0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new dp0(this, 3));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            showDialog(a2Var);
            ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new di.z8(11));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.s = c6Var;
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
                    aq0 aq0Var = this.h;
                    int i10 = aq0Var.h;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j11 = aq0Var.n;
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
            showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) this, 23, true));
            return;
        }
        aq0 C0 = C0();
        if (C0.I == null) {
            aq0 aq0Var = this.h;
            if (C0 == aq0Var) {
                aq0Var = this.n;
            }
            if (aq0Var.I != null) {
                aq0Var.d();
            }
            x0();
            finishFragment();
            E0();
            return;
        }
        aq0 aq0Var2 = this.h;
        if (C0 == aq0Var2) {
            aq0Var2 = this.n;
        }
        aq0Var2.d();
        this.r = true;
        this.Q.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
        ep0 ep0Var = new ep0(this, 0);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        ag.b bVar = tL_starGiftUnique.resale_ton_only ? ag.b.b : ag.b.a;
        zh.n5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new hp0(this, bVar, tL_starGiftUnique, clientUserId, ep0Var));
    }

    public final void z0() {
        this.y.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.w.invalidate();
        this.h.x.invalidate();
        this.n.w.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((dh.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).v();
        }
    }
}
