package kh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u0 extends org.telegram.ui.ActionBar.g3 {
    public final int B;
    public int C;
    public boolean D;
    public final s0 E;
    public final TL_stars.TL_starGiftUnique F;
    public final long G;
    public lh.b3 H;
    public boolean I;
    public final f6 b;
    public final ug.j c;
    public final sg.e d;
    public final ng.a e;
    public final ug.f f;
    public final ch.i h;
    public final q0 n;
    public final FrameLayout r;
    public final lp s;
    public final TextView v;
    public final k6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, null, true, true);
        xn xnVar;
        final int i10 = 1;
        this.c = new ug.j();
        final int i11 = 0;
        ch.i iVar = new ch.i(new n0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.F = tL_starGiftUnique;
        this.G = j10;
        this.B = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        sg.e eVar = new sg.e();
        this.d = eVar;
        ng.a aVar = new ng.a(eVar);
        this.e = aVar;
        p0 p0Var = new p0(this, context);
        this.containerView = p0Var;
        int i12 = this.backgroundPaddingLeft;
        p0Var.setPadding(i12, 0, i12, 0);
        ug.i iVar2 = new ug.i(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar.d = iVar2;
        aVar.e = viewGroup;
        ch.e eVar2 = new ch.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.B = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e = ph.l5.e(null, this.currentAccount, j10, j6.I.q());
        this.y = e;
        p0Var.V(e);
        f6 f6Var2 = new f6(context, this.currentAccount, f6Var);
        this.b = f6Var2;
        f6Var2.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        f6Var2.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        f6Var2.setLayoutBackground(new org.telegram.ui.ActionBar.w5(f6Var2, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        p0Var.addView(f6Var2, k7.b6.e(-2, -2, 48));
        ug.f fVar = new ug.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(aVar.c(fVar, rg.b.b(f6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(aVar.c(fVar, rg.b.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        q0 q0Var = new q0(this, AndroidUtilities.getActivity(), p0Var);
        this.n = q0Var;
        q0Var.setInAppInsetsController(iVar);
        q0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        q0Var.u4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        q0Var.t4 = false;
        q0Var.e2 = !AndroidUtilities.isInMultiwindow && ((xnVar = q0Var.L2) == null || !xnVar.isInBubbleMode());
        q0Var.V0(false, false, false);
        q0Var.g1(true, false);
        q0Var.v1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        q0Var.getSendButton().setAlpha(0.0f);
        q0Var.getEditField().setMaxLines(3);
        q0Var.setCustomWindowView(this.container);
        q0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(q0Var, k7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), k7.b6.c(-1.0f, -1));
        this.containerView.addView(fVar, k7.b6.c(-1.0f, -1));
        q0Var.setDelegate(new r0(this, tL_starGiftUnique));
        ff ffVar = q0Var.B0;
        ld ldVar = new ld();
        InputFilter[] filters = ffVar.getFilters();
        if (filters == null) {
            ffVar.setFilters(new InputFilter[]{ldVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = ldVar;
            ffVar.setFilters(inputFilterArr);
        }
        k6 k6Var = new k6(context, false, false, false);
        this.w = k6Var;
        k6Var.setAllowCancel(true);
        k6Var.setScaleProperty(0.6f);
        k6Var.setVisibility(8);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTextColor(getThemedColor(j6.y6));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(17);
        this.containerView.addView(k6Var, k7.b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        s0 s0Var = new s0(R.drawable.send_plane_24, context, f6Var, false);
        this.E = s0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        s0Var.F = dp;
        s0Var.G = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        s0Var.J = dp3;
        s0Var.K = dp4;
        s0Var.e0 = true;
        this.containerView.addView(s0Var, k7.b6.e(110, 50, 85));
        s0Var.setScrimViewBackgroundColor(getThemedColor(j6.d6));
        s0Var.setOnClickListener(new View.OnClickListener(this) { // from class: kh.o0
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        u0 u0Var = this.b;
                        if (u0Var.B - u0Var.C >= 0) {
                            lh.b3 b3Var = u0Var.H;
                            if (b3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = u0Var.n.getTextWithEntities();
                                boolean z4 = u0Var.D;
                                lh.g5 g5Var = (lh.g5) b3Var.c;
                                u0 u0Var2 = (u0) b3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                                long j11 = b3Var.b;
                                mf.b bVar = (mf.b) b3Var.f;
                                if (!u0Var2.I) {
                                    g5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z4, u0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(u0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        u0 u0Var3 = this.b;
                        boolean z10 = u0Var3.D;
                        u0Var3.D = !z10;
                        u0Var3.s.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i13 = j6.ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.w5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, k7.b6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        lp lpVar = new lp(context, 18, f6Var);
        this.s = lpVar;
        lpVar.getCheckBoxBase().j(true);
        lpVar.getCheckBoxBase().e = 0.9f;
        lpVar.b(i13, i13, j6.k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(!this.D, false);
        f6Var2.getLayout().R = new n0(this, i10);
        lpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(lpVar, k7.b6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.w5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: kh.o0
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        u0 u0Var = this.b;
                        if (u0Var.B - u0Var.C >= 0) {
                            lh.b3 b3Var = u0Var.H;
                            if (b3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = u0Var.n.getTextWithEntities();
                                boolean z4 = u0Var.D;
                                lh.g5 g5Var = (lh.g5) b3Var.c;
                                u0 u0Var2 = (u0) b3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                                long j11 = b3Var.b;
                                mf.b bVar = (mf.b) b3Var.f;
                                if (!u0Var2.I) {
                                    g5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z4, u0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(u0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        u0 u0Var3 = this.b;
                        boolean z10 = u0Var3.D;
                        u0Var3.D = !z10;
                        u0Var3.s.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, k7.b6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.w5 w5Var = new org.telegram.ui.ActionBar.w5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = tg.c.a;
        imageView.setBackground(new org.telegram.ui.ActionBar.v5(dp5, dp6, w5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: kh.o0
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        u0 u0Var = this.b;
                        if (u0Var.B - u0Var.C >= 0) {
                            lh.b3 b3Var = u0Var.H;
                            if (b3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = u0Var.n.getTextWithEntities();
                                boolean z4 = u0Var.D;
                                lh.g5 g5Var = (lh.g5) b3Var.c;
                                u0 u0Var2 = (u0) b3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                                long j11 = b3Var.b;
                                mf.b bVar = (mf.b) b3Var.f;
                                if (!u0Var2.I) {
                                    g5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z4, u0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(u0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        u0 u0Var3 = this.b;
                        boolean z10 = u0Var3.D;
                        u0Var3.D = !z10;
                        u0Var3.s.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, k7.b6.e(56, 56, 53));
        k7.d6.b(frameLayout, 0.05f, 1.2f);
        k7.d6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        gg.f fVar2 = new gg.f(this, 21);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(viewGroup3, fVar2);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ch.i iVar = this.h;
        int i10 = iVar.e(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        f6 f6Var = this.b;
        FrameLayout frameLayout = this.r;
        f6Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - f6Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - f6Var.getHeight()));
        f6Var.invalidate();
        float y10 = f6Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f10 = i10;
        ImageView imageView = this.x;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        q0 q0Var = this.n;
        if (q0Var == null || !q0Var.t0()) {
            super.onBackPressed();
        } else {
            q0Var.m0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        ic.a(this.container, new t0(this, 0));
        l40 l40Var = l40.s;
        if (l40Var.c()) {
            l40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.G);
            StringBuilder sb = new StringBuilder();
            sb.append(this.F.title);
            sb.append(" #");
            new qc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), a2.l(r3.num, ',', sb))), null).k(true);
        }
    }

    public final Paint p(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        Paint G = f6Var != null ? f6Var.G("paintChatActionBackground") : null;
        return G != null ? G : j6.S0("paintChatActionBackground");
    }
}
