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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class np0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final og.a B;
    public final tg.c C;
    public final og.a D;
    public org.telegram.ui.ActionBar.p2 E;
    public ek F;
    public ImageView G;
    public ImageView H;
    public FrameLayout I;
    public org.telegram.ui.Components.sz J;
    public org.telegram.ui.ActionBar.l5 K;
    public FrameLayout L;
    public FrameLayout M;
    public qh.d N;
    public hp0 O;
    public boolean P;
    public org.telegram.ui.Components.hj0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public jc U;
    public float V;
    public ValueAnimator W;
    public boolean X;
    public i0.b Y;
    public lf.e0 Z;
    public final boolean a;
    public final be.b a0;
    public final mh.l7 b;
    public final be.b b0;
    public final mh.l7 c;
    public final og.e c0;
    public l0 d;
    public final tg.d d0;
    public qo0 e;
    public final og.a e0;
    public final int f;
    public final ua f0;
    public final ArrayList g0;
    public hp0 h;
    public final ArrayList h0;
    public hp0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.g6 s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.h5 w;
    public final org.telegram.ui.ActionBar.h5 x;
    public final tg.c y;

    public np0() {
        super(null);
        this.f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.P = q10;
        this.X = q10;
        this.Y = i0.b.e;
        be.b bVar = new be.b(true);
        this.a0 = bVar;
        be.b bVar2 = new be.b(true);
        this.b0 = bVar2;
        this.f0 = new ua(this, 1);
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        tg.c cVar = new tg.c();
        this.y = cVar;
        og.a aVar = new og.a(cVar);
        this.B = aVar;
        tg.c cVar2 = new tg.c();
        this.C = cVar2;
        og.a aVar2 = new og.a(cVar2);
        this.D = aVar2;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.c0 = null;
            this.d0 = null;
            this.e0 = new og.a(cVar);
        } else {
            og.e eVar = new og.e(false);
            this.c0 = eVar;
            tg.d dVar = new tg.d(cVar);
            this.d0 = dVar;
            dVar.v = new oo0(this, 1);
            dVar.d = eVar;
            dVar.e = -2;
            dVar.f = cVar;
            og.a aVar3 = new og.a(dVar);
            this.e0 = aVar3;
            aVar3.f = LiteMode.isEnabled(262144);
        }
        aVar.c = bVar;
        aVar.b = bVar2;
        aVar2.c = bVar;
        aVar2.b = bVar2;
        og.a aVar4 = this.e0;
        aVar4.c = bVar;
        aVar4.b = bVar2;
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
        this.w = new org.telegram.ui.ActionBar.h5(0, false, false, this.resourceProvider);
        this.x = new org.telegram.ui.ActionBar.h5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z4 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z4 && tL_emojiStatusCollectible != null && z4 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void U(np0 np0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var, mh.i4 i4Var, af.f fVar) {
        zArr[0] = true;
        fVar.d();
        mh.t7.x(np0Var.currentAccount, i4Var.a).h(i4Var.b, tL_starGiftUnique, j10, null, true, new eh.w(23, fVar, no0Var));
    }

    public static void V(np0 np0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        mh.i4 i4Var = new mh.i4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        mh.k4 k4Var = new mh.k4(np0Var.getParentActivity(), np0Var.resourceProvider, tL_starGiftUnique, i4Var, np0Var.currentAccount, j10, l.d.l(tL_starGiftUnique.num, ',', sb), false, new mh.t2(np0Var, zArr, tL_starGiftUnique, j10, no0Var, 1));
        k4Var.h.setOnDismissListener(new hg.g(9, zArr, no0Var));
        k4Var.b();
    }

    public static int w0(int i10) {
        return org.telegram.ui.ActionBar.k6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public final void A0() {
        int d = ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.d6))) > 0.72d ? i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.k6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        this.d.setBackgroundColor(d);
        tg.c cVar = this.C;
        if (cVar.a.getColor() != d) {
            cVar.a(d);
            Iterator it = this.b0.iterator();
            while (it.hasNext()) {
                ((qg.b) it.next()).u();
            }
            Iterator it2 = this.a0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final hp0 C0() {
        ek ekVar = this.F;
        return (ekVar == null || ekVar.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.c0 == null) {
            return;
        }
        lf.e0 e0Var = this.Z;
        if (e0Var.c == 0) {
            e0Var.invalidate();
        }
        e0Var.c = i10 | e0Var.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r15.F.getCurrentPosition() == 0 ? r15.n : r15.h) == r15.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        if ((r15.F.getCurrentPosition() == 0 ? r15.n : r15.h) == r15.n) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0() {
        ArrayList<Integer> arrayList;
        ip0 ip0Var;
        if (this.E != null) {
            boolean z4 = this.R;
            boolean z10 = this.a;
            if (z4) {
                if (this.S) {
                }
                hp0 hp0Var = this.h;
                if (hp0Var.h >= 0) {
                    org.telegram.ui.Components.qc.a0(this.E).L(ip0.a(this.currentAccount, this.h.h), LocaleController.getString(z10 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (hp0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(this.E);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i10 = ip0.j;
                    if (!org.telegram.ui.ActionBar.k6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        ip0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        ip0Var = new ip0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(ip0Var, LocaleController.getString(z10 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.E = null;
            }
            if (this.S) {
                if (this.R) {
                }
                hp0 hp0Var2 = this.n;
                if (hp0Var2.h >= 0) {
                    org.telegram.ui.Components.qc.a0(this.E).L(ip0.c(this.currentAccount, this.n.h), LocaleController.getString(z10 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (hp0Var2.n != 0) {
                    org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(this.E);
                    TLRPC.Document f10 = org.telegram.ui.Components.l5.f(this.currentAccount, this.n.n);
                    String string = LocaleController.getString(z10 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f10);
                    org.telegram.ui.Components.kj0 kj0Var = qbVar.a;
                    if (isTextColorEmoji) {
                        kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
                    }
                    qbVar.e(f10, new String[0]);
                    kj0Var.i();
                    qbVar.b.setText(string);
                    qbVar.b.setTextSize(1, 14.0f);
                    qbVar.b.setSingleLine(false);
                    qbVar.b.setMaxLines(3);
                    a03.b(qbVar, 2750).j();
                } else {
                    l.d.v(z10 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.qc.a0(this.E), R.raw.contact_check, 36);
                }
            }
            this.E = null;
        }
    }

    public final void F0() {
        org.telegram.ui.ActionBar.l5 l5Var = this.K;
        if (l5Var != null) {
            l5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.h.g();
        this.n.g();
        qo0 qo0Var = this.e;
        if (qo0Var != null) {
            qo0Var.a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, qo0Var.b);
            qo0Var.a();
            qo0Var.invalidate();
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
        if (this.J != null) {
            ek ekVar = this.F;
            float a2 = k7.o.a(((ekVar == null ? 0.0f : ekVar.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.sz szVar = this.J;
            int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.k6.a7));
            int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.k6.z6));
            int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            szVar.a.setColor(d);
            szVar.b.setColor(d10);
            szVar.d = d11;
            szVar.e = d12;
            szVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        this.Z = new lf.e0(context, new mo0(this, i11));
        vg.i iVar = new vg.i(this.d);
        l0 l0Var2 = this.d;
        og.a aVar = this.e0;
        aVar.d = iVar;
        aVar.e = l0Var2;
        this.h = new hp0(this, context, 1);
        this.n = new hp0(this, context, 0);
        qo0 qo0Var = new qo0(this, context, this.resourceProvider);
        this.e = qo0Var;
        qo0Var.B = true;
        this.n.j(false);
        final int i12 = 2;
        this.n.addView(this.e, 2, k7.c6.e(-1, -2, 55));
        ek ekVar = new ek(this, context, i10);
        this.F = ekVar;
        ekVar.setAdapter(new ro0(this));
        l0Var.addView(this.F, k7.c6.e(-1, -1, 119));
        qh.d dVar = new qh.d(context, getResourceProvider(), true);
        this.N = dVar;
        dVar.setStateListAnimator(null);
        this.N.e();
        this.N.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.po0
            public final /* synthetic */ np0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i11;
                np0 np0Var = this.b;
                int i14 = 1;
                switch (i13) {
                    case 0:
                        np0Var.y0();
                        break;
                    case 1:
                        if (np0Var.onBackPressed(true)) {
                            np0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        np0 np0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) np0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        np0Var2.H.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        np0Var2.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        np0Var2.H.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        jc jcVar = new jc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = jcVar;
                        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new kc(np0Var2, i14));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.jt.e);
                        np0Var2.W.start();
                        frameLayout2.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        break;
                }
            }
        });
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.L.addView(this.N, k7.c6.c(-1.0f, -1));
        View view = this.L;
        qg.b c3 = this.B.c(view, null, false);
        c3.n(sg.b.j(this.resourceProvider));
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(5.0f));
        view.setBackground(c3);
        k7.e6.b(this.L, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        frameLayout2.addView(this.L, k7.c6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        og.b bVar = new og.b(this.D.c(this.M, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), true);
        bVar.q = 220;
        this.M.setBackground(bVar);
        hp0 C0 = C0();
        qh.d dVar2 = this.N;
        if (dVar2 != null && C0 != null && C0 != this.O) {
            this.O = C0;
            n7.qa qaVar = C0.e;
            dVar2.g((CharSequence) qaVar.b, false, true);
            this.N.f((SpannableStringBuilder) qaVar.c, false);
        }
        l0Var.addView(this.M, k7.c6.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.I = frameLayout3;
        l0Var.addView(frameLayout3, k7.c6.e(-1, -2, 55));
        boolean z4 = this.a;
        if (z4) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
            this.K = l5Var;
            l5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.K.setEllipsizeByGradient(true);
            this.K.setTextSize(20);
            this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
            this.K.setTypeface(AndroidUtilities.bold());
            this.I.addView(this.K, k7.c6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.sz szVar = new org.telegram.ui.Components.sz(context);
            this.J = szVar;
            szVar.setTabs(LocaleController.getString(z4 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z4 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            this.J.r = new no0(this, i10);
            G0();
            this.I.addView(this.J, k7.c6.e(-1, 40, 17));
        }
        qo0 qo0Var2 = this.e;
        if (qo0Var2 != null) {
            qo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.G;
        int i13 = org.telegram.ui.ActionBar.k6.u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13), 1, -1));
        this.G.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.G;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.po0
            public final /* synthetic */ np0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i10;
                np0 np0Var = this.b;
                int i14 = 1;
                switch (i132) {
                    case 0:
                        np0Var.y0();
                        break;
                    case 1:
                        if (np0Var.onBackPressed(true)) {
                            np0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        np0 np0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) np0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        np0Var2.H.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        np0Var2.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        np0Var2.H.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        jc jcVar = new jc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = jcVar;
                        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new kc(np0Var2, i14));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.jt.e);
                        np0Var2.W.start();
                        frameLayout22.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        break;
                }
            }
        });
        k7.e6.a(this.G);
        this.I.addView(this.G, k7.c6.e(54, 54, 19));
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.Q = hj0Var;
        hj0Var.h = true;
        if (this.P) {
            hj0Var.K(35);
            this.Q.N(36);
        } else {
            hj0Var.N(0);
            this.Q.K(0);
        }
        this.Q.X = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.Q.O(w02, "Sunny");
        this.Q.O(w02, "Path 6");
        this.Q.O(w02, "Path");
        this.Q.O(w02, "Path 5");
        this.Q.m();
        ImageView imageView4 = new ImageView(context);
        this.H = imageView4;
        imageView4.setScaleType(scaleType);
        this.H.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13), 1, -1));
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.po0
            public final /* synthetic */ np0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i12;
                np0 np0Var = this.b;
                int i14 = 1;
                switch (i132) {
                    case 0:
                        np0Var.y0();
                        break;
                    case 1:
                        if (np0Var.onBackPressed(true)) {
                            np0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        np0 np0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) np0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        np0Var2.H.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        np0Var2.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        np0Var2.H.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        jc jcVar = new jc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = jcVar;
                        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new kc(np0Var2, i14));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.jt.e);
                        np0Var2.W.start();
                        frameLayout22.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        break;
                }
            }
        });
        this.I.addView(this.H, k7.c6.e(54, 54, 21));
        this.H.setImageDrawable(this.Q);
        qo0 qo0Var3 = this.e;
        qo0Var3.getClass();
        qo0Var3.a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, qo0Var3.b);
        qo0Var3.a();
        qo0Var3.invalidate();
        z0();
        this.d.addView(this.Z);
        A0();
        View view2 = this.fragmentView;
        mo0 mo0Var = new mo0(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view2, mo0Var);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.c;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 27), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        qo0 qo0Var = this.e;
        return qo0Var == null ? super.isLightStatusBar() : i0.a.f(qo0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        boolean z10 = this.a;
        if (z10 || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z4);
        }
        if (z4 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.O = LocaleController.getString(z10 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.Q = LocaleController.getString(z10 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new mo0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new mo0(this, 3));
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
        if (this.T) {
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
                if (this.h.h == UserObject.getColorId(currentUser) && this.h.n == UserObject.getEmojiId(currentUser)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    long j10 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = currentUser.color;
                }
                this.R = true;
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
                    hp0 hp0Var = this.h;
                    int i10 = hp0Var.h;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j11 = hp0Var.n;
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
                this.S = true;
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
                            if (i15 >= this.n.i0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.i0.get(i15);
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
            this.T = true;
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
            showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) this, 23, true));
            return;
        }
        hp0 C0 = C0();
        if (C0.F == null) {
            hp0 hp0Var = this.h;
            if (C0 == hp0Var) {
                hp0Var = this.n;
            }
            if (hp0Var.F != null) {
                hp0Var.d();
            }
            x0();
            finishFragment();
            E0();
            return;
        }
        hp0 hp0Var2 = this.h;
        if (C0 == hp0Var2) {
            hp0Var2 = this.n;
        }
        hp0Var2.d();
        this.r = true;
        this.N.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.F;
        no0 no0Var = new no0(this, 0);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        mf.b bVar = tL_starGiftUnique.resale_ton_only ? mf.b.b : mf.b.a;
        mh.t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new lh.h5(this, bVar, tL_starGiftUnique, clientUserId, no0Var));
    }

    public final void z0() {
        this.y.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.L.invalidate();
        this.M.invalidate();
        this.h.w.invalidate();
        this.h.x.invalidate();
        this.n.w.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((qg.b) this.L.getBackground()).u();
        A0();
        Iterator it = this.b0.iterator();
        while (it.hasNext()) {
            ((qg.b) it.next()).u();
        }
    }
}
