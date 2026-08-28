package fh;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.t30;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z0 extends org.telegram.ui.ActionBar.f3 {
    public final int A;
    public int B;
    public boolean C;
    public final x0 D;
    public final TL_stars.TL_starGiftUnique E;
    public final long F;
    public gh.c3 G;
    public boolean H;
    public final v6 b;
    public final pg.j c;
    public final ng.e d;
    public final ig.a e;
    public final pg.f f;
    public final xg.i h;
    public final v0 n;
    public final FrameLayout r;
    public final dp s;
    public final TextView v;
    public final org.telegram.ui.Components.j6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, org.telegram.ui.ActionBar.b6 b6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, null, true, true);
        qn qnVar;
        final int i9 = 1;
        this.c = new pg.j();
        final int i10 = 0;
        xg.i iVar = new xg.i(new s0(this, i10));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.E = tL_starGiftUnique;
        this.F = j10;
        this.A = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ng.e eVar = new ng.e();
        this.d = eVar;
        ig.a aVar = new ig.a(eVar);
        this.e = aVar;
        u0 u0Var = new u0(this, context);
        this.containerView = u0Var;
        int i11 = this.backgroundPaddingLeft;
        u0Var.setPadding(i11, 0, i11, 0);
        pg.i iVar2 = new pg.i(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar.d = iVar2;
        aVar.e = viewGroup;
        xg.e eVar2 = new xg.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.A = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e10 = kh.r6.e(null, this.currentAccount, j10, org.telegram.ui.ActionBar.f6.I.q());
        this.y = e10;
        u0Var.V(e10);
        v6 v6Var = new v6(context, this.currentAccount, b6Var);
        this.b = v6Var;
        v6Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        v6Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        v6Var.setLayoutBackground(new org.telegram.ui.ActionBar.s5(v6Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        u0Var.addView(v6Var, g7.e6.e(-2, -2, 48));
        pg.f fVar = new pg.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(aVar.c(fVar, mg.c.b(b6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(aVar.c(fVar, mg.c.b(b6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        v0 v0Var = new v0(this, AndroidUtilities.getActivity(), u0Var);
        this.n = v0Var;
        v0Var.setInAppInsetsController(iVar);
        v0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        v0Var.t4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        v0Var.s4 = false;
        v0Var.d2 = !AndroidUtilities.isInMultiwindow && ((qnVar = v0Var.K2) == null || !qnVar.isInBubbleMode());
        v0Var.V0(false, false, false);
        v0Var.g1(true, false);
        v0Var.u1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        v0Var.getSendButton().setAlpha(0.0f);
        v0Var.getEditField().setMaxLines(3);
        v0Var.setCustomWindowView(this.container);
        v0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(v0Var, g7.e6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), g7.e6.c(-1.0f, -1));
        this.containerView.addView(fVar, g7.e6.c(-1.0f, -1));
        v0Var.setDelegate(new w0(this, tL_starGiftUnique));
        ff ffVar = v0Var.A0;
        kd kdVar = new kd();
        InputFilter[] filters = ffVar.getFilters();
        if (filters == null) {
            ffVar.setFilters(new InputFilter[]{kdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = kdVar;
            ffVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.w = j6Var;
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        j6Var.setVisibility(8);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y6));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(17);
        this.containerView.addView(j6Var, g7.e6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        x0 x0Var = new x0(R.drawable.send_plane_24, context, b6Var, false);
        this.D = x0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        x0Var.E = dp;
        x0Var.F = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        x0Var.I = dp3;
        x0Var.J = dp4;
        x0Var.d0 = true;
        this.containerView.addView(x0Var, g7.e6.e(110, 50, 85));
        x0Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        x0Var.setOnClickListener(new View.OnClickListener(this) { // from class: fh.t0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        z0 z0Var = this.b;
                        if (z0Var.A - z0Var.B >= 0) {
                            gh.c3 c3Var = z0Var.G;
                            if (c3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = z0Var.n.getTextWithEntities();
                                boolean z10 = z0Var.C;
                                gh.k5 k5Var = (gh.k5) c3Var.c;
                                z0 z0Var2 = (z0) c3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) c3Var.e;
                                long j11 = c3Var.b;
                                gf.b bVar = (gf.b) c3Var.f;
                                if (!z0Var2.H) {
                                    k5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, z0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(z0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        z0 z0Var3 = this.b;
                        boolean z11 = z0Var3.C;
                        z0Var3.C = !z11;
                        z0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i12 = org.telegram.ui.ActionBar.f6.ic;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i13 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.s5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, g7.e6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        dp dpVar = new dp(context, 18, b6Var);
        this.s = dpVar;
        dpVar.getCheckBoxBase().j(true);
        dpVar.getCheckBoxBase().e = 0.9f;
        dpVar.b(i12, i12, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(!this.C, false);
        v6Var.getLayout().R = new s0(this, i9);
        dpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(dpVar, g7.e6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.s5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: fh.t0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        z0 z0Var = this.b;
                        if (z0Var.A - z0Var.B >= 0) {
                            gh.c3 c3Var = z0Var.G;
                            if (c3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = z0Var.n.getTextWithEntities();
                                boolean z10 = z0Var.C;
                                gh.k5 k5Var = (gh.k5) c3Var.c;
                                z0 z0Var2 = (z0) c3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) c3Var.e;
                                long j11 = c3Var.b;
                                gf.b bVar = (gf.b) c3Var.f;
                                if (!z0Var2.H) {
                                    k5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, z0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(z0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        z0 z0Var3 = this.b;
                        boolean z11 = z0Var3.C;
                        z0Var3.C = !z11;
                        z0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, g7.e6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = og.d.a;
        imageView.setBackground(new og.c(dp5, dp6, s5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fh.t0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        z0 z0Var = this.b;
                        if (z0Var.A - z0Var.B >= 0) {
                            gh.c3 c3Var = z0Var.G;
                            if (c3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = z0Var.n.getTextWithEntities();
                                boolean z10 = z0Var.C;
                                gh.k5 k5Var = (gh.k5) c3Var.c;
                                z0 z0Var2 = (z0) c3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) c3Var.e;
                                long j11 = c3Var.b;
                                gf.b bVar = (gf.b) c3Var.f;
                                if (!z0Var2.H) {
                                    k5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, z0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(z0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        z0 z0Var3 = this.b;
                        boolean z11 = z0Var3.C;
                        z0Var3.C = !z11;
                        z0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, g7.e6.e(56, 56, 53));
        g7.g6.b(frameLayout, 0.05f, 1.2f);
        g7.g6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        a1.c cVar = new a1.c(this, 27);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(viewGroup3, cVar);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        xg.i iVar = this.h;
        int i9 = iVar.e(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i9;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        v6 v6Var = this.b;
        FrameLayout frameLayout = this.r;
        v6Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - v6Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - v6Var.getHeight()));
        v6Var.invalidate();
        float y10 = v6Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f10 = i9;
        ImageView imageView = this.x;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        v0 v0Var = this.n;
        if (v0Var == null || !v0Var.s0()) {
            super.onBackPressed();
        } else {
            v0Var.l0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        gc.a(this.container, new y0(this, 0));
        t30 t30Var = t30.s;
        if (t30Var.c()) {
            t30Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.F);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.E.title);
            sb2.append(" #");
            new oc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), j3.r0.n(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
        Paint O = b6Var != null ? b6Var.O("paintChatActionBackground") : null;
        return O != null ? O : org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground");
    }
}
