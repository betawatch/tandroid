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
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ip0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView B;
    public ImageView C;
    public FrameLayout D;
    public org.telegram.ui.Components.sz E;
    public org.telegram.ui.ActionBar.l5 F;
    public boolean G;
    public org.telegram.ui.Components.ij0 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public kc L;
    public float M;
    public ValueAnimator N;
    public boolean O;
    public final boolean a;
    public final mh.l7 b;
    public final mh.l7 c;
    public l0 d;
    public oo0 e;
    public dp0 f;
    public dp0 h;
    public boolean n;
    public org.telegram.ui.ActionBar.g6 r;
    public final SparseIntArray s;
    public final org.telegram.ui.ActionBar.h5 v;
    public final org.telegram.ui.ActionBar.h5 w;
    public org.telegram.ui.ActionBar.p2 x;
    public ek y;

    public ip0() {
        super(null);
        this.s = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.G = q10;
        this.O = q10;
        this.a = false;
        mh.t7.y(this.currentAccount, false).V();
        mh.l7 l7Var = new mh.l7(this.currentAccount, 0L, false);
        this.b = l7Var;
        l7Var.f(8, false);
        l7Var.a();
        mh.l7 l7Var2 = new mh.l7(this.currentAccount, 0L, false);
        this.c = l7Var2;
        l7Var2.f(8, false);
        l7Var2.f = true;
        l7Var2.a();
        this.resourceProvider = new h(this, 29);
        this.v = new org.telegram.ui.ActionBar.h5(0, false, false, this.resourceProvider);
        this.w = new org.telegram.ui.ActionBar.h5(0, false, true, this.resourceProvider);
    }

    public static void U(ip0 ip0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, org.telegram.ui.Components.xk xkVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        mh.i4 i4Var = new mh.i4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        mh.k4 k4Var = new mh.k4(ip0Var.getParentActivity(), ip0Var.resourceProvider, tL_starGiftUnique, i4Var, ip0Var.currentAccount, j10, l.d.l(tL_starGiftUnique.num, ',', sb), false, new mh.t2(ip0Var, zArr, tL_starGiftUnique, j10, xkVar, 1));
        k4Var.h.setOnDismissListener(new hg.g(9, zArr, xkVar));
        k4Var.b();
    }

    public static void V(ip0 ip0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, org.telegram.ui.Components.xk xkVar, mh.i4 i4Var, af.f fVar) {
        zArr[0] = true;
        fVar.d();
        mh.t7.x(ip0Var.currentAccount, i4Var.a).h(i4Var.b, tL_starGiftUnique, j10, null, true, new eh.w(23, fVar, xkVar));
    }

    public static int u0(int i10) {
        return org.telegram.ui.ActionBar.k6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public static boolean x0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z4 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z4 && tL_emojiStatusCollectible != null && z4 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        final int i10 = 1;
        this.f = new dp0(this, context, 1);
        final int i11 = 0;
        this.h = new dp0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        l0 l0Var = new l0(this, context, 15);
        l0Var.setFitsSystemWindows(true);
        this.e = new oo0(this, context, this.resourceProvider);
        this.h.i(false);
        l0Var.addView(this.e, k7.c6.e(-1, -2, 55));
        ek ekVar = new ek(this, context, i10);
        this.y = ekVar;
        ekVar.setAdapter(new po0(this));
        l0Var.addView(this.y, k7.c6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        l0Var.addView(frameLayout, k7.c6.e(-1, -2, 55));
        boolean z4 = this.a;
        if (z4) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
            this.F = l5Var;
            l5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.F.setEllipsizeByGradient(true);
            this.F.setTextSize(20);
            this.F.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
            this.F.setTypeface(AndroidUtilities.bold());
            this.D.addView(this.F, k7.c6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.sz szVar = new org.telegram.ui.Components.sz(context);
            this.E = szVar;
            szVar.setTabs(LocaleController.getString(z4 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z4 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            org.telegram.ui.Components.sz szVar2 = this.E;
            szVar2.f = new w3(this, 12);
            this.D.addView(szVar2, k7.c6.e(-1, 40, 17));
        }
        oo0 oo0Var = this.e;
        if (oo0Var != null) {
            oo0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.B = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.B;
        int i12 = org.telegram.ui.ActionBar.k6.u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i12), 1, -1));
        this.B.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.B;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mo0
            public final /* synthetic */ ip0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = 1;
                switch (i11) {
                    case 0:
                        ip0 ip0Var = this.b;
                        if (ip0Var.onBackPressed(true)) {
                            ip0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        ip0 ip0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) ip0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ip0Var2.C.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        ip0Var2.C.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ip0Var2.C.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(ip0Var2, ip0Var2.getParentActivity(), canvas, (ip0Var2.C.getMeasuredWidth() / 2.0f) + f10, (ip0Var2.C.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        ip0Var2.L = kcVar;
                        kcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        ip0Var2.M = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ip0Var2.N = ofFloat;
                        ofFloat.addUpdateListener(new lc(ip0Var2, i13));
                        ip0Var2.N.addListener(new org.telegram.ui.Components.g91(ip0Var2, 28));
                        ip0Var2.N.setDuration(400L);
                        ip0Var2.N.setInterpolator(org.telegram.ui.Components.jt.e);
                        ip0Var2.N.start();
                        frameLayout2.addView(ip0Var2.L, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new gl0(ip0Var2, 10));
                        break;
                }
            }
        });
        this.D.addView(this.B, k7.c6.e(54, 54, 19));
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.H = ij0Var;
        ij0Var.h = true;
        if (this.G) {
            ij0Var.K(35);
            this.H.N(36);
        } else {
            ij0Var.N(0);
            this.H.K(0);
        }
        this.H.X = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.H.O(w02, "Sunny");
        this.H.O(w02, "Path 6");
        this.H.O(w02, "Path");
        this.H.O(w02, "Path 5");
        this.H.m();
        ImageView imageView4 = new ImageView(context);
        this.C = imageView4;
        imageView4.setScaleType(scaleType);
        this.C.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i12), 1, -1));
        this.C.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mo0
            public final /* synthetic */ ip0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = 1;
                switch (i10) {
                    case 0:
                        ip0 ip0Var = this.b;
                        if (ip0Var.onBackPressed(true)) {
                            ip0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        ip0 ip0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) ip0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ip0Var2.C.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        ip0Var2.C.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ip0Var2.C.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(ip0Var2, ip0Var2.getParentActivity(), canvas, (ip0Var2.C.getMeasuredWidth() / 2.0f) + f10, (ip0Var2.C.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        ip0Var2.L = kcVar;
                        kcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        ip0Var2.M = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ip0Var2.N = ofFloat;
                        ofFloat.addUpdateListener(new lc(ip0Var2, i13));
                        ip0Var2.N.addListener(new org.telegram.ui.Components.g91(ip0Var2, 28));
                        ip0Var2.N.setDuration(400L);
                        ip0Var2.N.setInterpolator(org.telegram.ui.Components.jt.e);
                        ip0Var2.N.start();
                        frameLayout2.addView(ip0Var2.L, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new gl0(ip0Var2, 10));
                        break;
                }
            }
        });
        this.D.addView(this.C, k7.c6.e(54, 54, 21));
        this.C.setImageDrawable(this.H);
        oo0 oo0Var2 = this.e;
        oo0Var2.getClass();
        oo0Var2.a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s8, oo0Var2.b);
        oo0Var2.a();
        oo0Var2.invalidate();
        this.d = l0Var;
        this.fragmentView = l0Var;
        return l0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            this.f.f();
            this.h.f();
        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
            this.f.e();
            this.h.e();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            this.f.e();
            this.h.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 27), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        oo0 oo0Var = this.e;
        return oo0Var == null ? super.isLightStatusBar() : i0.a.f(oo0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        boolean z10 = this.a;
        if (z10 || !((this.f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z4);
        }
        if (z4 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.O = LocaleController.getString(z10 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.Q = LocaleController.getString(z10 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            final int i10 = 0;
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.no0
                public final /* synthetic */ ip0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        default:
                            this.b.w0();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.no0
                public final /* synthetic */ ip0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        default:
                            this.b.w0();
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            showDialog(d2Var);
            ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.q7));
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new hg.w(10));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.r = g6Var;
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
    public final void v0() {
        if (this.K) {
            return;
        }
        boolean z4 = this.a;
        if (z4 || getUserConfig().isPremium()) {
            if (z4) {
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
                if (this.f.n == UserObject.getColorId(currentUser) && this.f.r == UserObject.getEmojiId(currentUser)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.f.v;
                    long j10 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = currentUser.color;
                }
                this.I = true;
                TL_account.updateColor updatecolor = new TL_account.updateColor();
                currentUser.flags2 |= 256;
                currentUser.color.flags |= 1;
                if (this.f.v != null) {
                    updatecolor.flags |= 4;
                    TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                    updatecolor.color = tL_inputPeerColorCollectible;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.f.v;
                    tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                    currentUser.color = tL_peerColorCollectible2;
                } else {
                    updatecolor.flags |= 4;
                    TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                    updatecolor.color = tL_peerColor2;
                    tL_peerColor2.flags |= 1;
                    dp0 dp0Var = this.f;
                    int i10 = dp0Var.n;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j11 = dp0Var.r;
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
                if (this.h.n == UserObject.getProfileColorId(currentUser) && this.h.r == UserObject.getOnlyProfileEmojiId(currentUser)) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.h.s;
                }
                this.J = true;
                if (currentUser.profile_color == null) {
                    currentUser.profile_color = new TLRPC.TL_peerColor();
                }
                TL_account.updateColor updatecolor2 = new TL_account.updateColor();
                updatecolor2.for_profile = true;
                currentUser.flags2 |= 512;
                if (this.h.n < 0) {
                    currentUser.profile_color.flags &= -2;
                } else {
                    if (updatecolor2.color == null) {
                        updatecolor2.flags |= 4;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor3 = updatecolor2.color;
                    peerColor3.flags |= 1;
                    int i13 = this.h.n;
                    peerColor3.color = i13;
                    TLRPC.PeerColor peerColor4 = currentUser.profile_color;
                    peerColor4.flags |= 1;
                    peerColor4.color = i13;
                }
                if (this.h.r != 0) {
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
                    long j12 = this.h.r;
                    peerColor6.background_emoji_id = j12;
                    peerColor5.background_emoji_id = j12;
                } else {
                    TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                    peerColor7.flags &= -3;
                    peerColor7.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!x0(currentUser.emoji_status, this.h.s) && (this.h.s != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.h.s;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j13 = tL_emojiStatusCollectible2.collectible_id;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= this.h.c0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.h.c0.get(i15);
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
                y0();
            }
            this.K = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public final void w0() {
        if (this.n) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) this, 23, true));
            return;
        }
        dp0 dp0Var = this.y.getCurrentPosition() == 1 ? this.f : this.h;
        if (dp0Var.y == null) {
            dp0 dp0Var2 = this.y.getCurrentPosition() == 1 ? this.h : this.f;
            if (dp0Var2.y != null) {
                dp0Var2.d();
            }
            v0();
            finishFragment();
            y0();
            return;
        }
        (this.y.getCurrentPosition() == 1 ? this.h : this.f).d();
        this.n = true;
        dp0Var.f.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = dp0Var.y;
        org.telegram.ui.Components.xk xkVar = new org.telegram.ui.Components.xk(21, this, dp0Var);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        mf.b bVar = tL_starGiftUnique.resale_ton_only ? mf.b.b : mf.b.a;
        mh.t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new lh.h5(this, bVar, tL_starGiftUnique, clientUserId, xkVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r15.y.getCurrentPosition() == 0 ? r15.h : r15.f) == r15.f) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        if ((r15.y.getCurrentPosition() == 0 ? r15.h : r15.f) == r15.h) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0() {
        ArrayList<Integer> arrayList;
        ep0 ep0Var;
        if (this.x != null) {
            boolean z4 = this.I;
            boolean z10 = this.a;
            if (z4) {
                if (this.J) {
                }
                dp0 dp0Var = this.f;
                if (dp0Var.n >= 0) {
                    org.telegram.ui.Components.qc.a0(this.x).L(ep0.a(this.currentAccount, this.f.n), LocaleController.getString(z10 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (dp0Var.v == null) {
                        return;
                    }
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(this.x);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.f.v;
                    int i10 = ep0.j;
                    if (!org.telegram.ui.ActionBar.k6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        ep0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        ep0Var = new ep0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(ep0Var, LocaleController.getString(z10 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.x = null;
            }
            if (this.J) {
                if (this.I) {
                }
                dp0 dp0Var2 = this.h;
                if (dp0Var2.n >= 0) {
                    org.telegram.ui.Components.qc.a0(this.x).L(ep0.c(this.currentAccount, this.h.n), LocaleController.getString(z10 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (dp0Var2.r != 0) {
                    org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(this.x);
                    TLRPC.Document f10 = org.telegram.ui.Components.l5.f(this.currentAccount, this.h.r);
                    String string = LocaleController.getString(z10 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f10);
                    org.telegram.ui.Components.lj0 lj0Var = qbVar.a;
                    if (isTextColorEmoji) {
                        lj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
                    }
                    qbVar.e(f10, new String[0]);
                    lj0Var.i();
                    qbVar.b.setText(string);
                    qbVar.b.setTextSize(1, 14.0f);
                    qbVar.b.setSingleLine(false);
                    qbVar.b.setMaxLines(3);
                    a03.b(qbVar, 2750).j();
                } else {
                    l.d.v(z10 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.qc.a0(this.x), R.raw.contact_check, 36);
                }
            }
            this.x = null;
        }
    }

    public final void z0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        org.telegram.ui.ActionBar.l5 l5Var = this.F;
        if (l5Var != null) {
            l5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.f.g();
        this.h.g();
        oo0 oo0Var = this.e;
        if (oo0Var != null) {
            oo0Var.a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s8, oo0Var.b);
            oo0Var.a();
            oo0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}
