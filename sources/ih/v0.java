package ih;

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
import i7.h6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.od;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v0 extends org.telegram.ui.ActionBar.f3 {
    public final int A;
    public int B;
    public boolean C;
    public final t0 D;
    public final TL_stars.TL_starGiftUnique E;
    public final long F;
    public jh.b3 G;
    public boolean H;
    public final f6 b;
    public final sg.k c;
    public final qg.e d;
    public final lg.a e;
    public final sg.f f;
    public final ah.i h;
    public final r0 n;
    public final FrameLayout r;
    public final hp s;
    public final TextView v;
    public final o6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, null, true, true);
        tn tnVar;
        final int i10 = 1;
        this.c = new sg.k();
        final int i11 = 0;
        ah.i iVar = new ah.i(new o0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.E = tL_starGiftUnique;
        this.F = j10;
        this.A = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        qg.e eVar = new qg.e();
        this.d = eVar;
        lg.a aVar = new lg.a(eVar);
        this.e = aVar;
        q0 q0Var = new q0(this, context);
        this.containerView = q0Var;
        int i12 = this.backgroundPaddingLeft;
        q0Var.setPadding(i12, 0, i12, 0);
        sg.i iVar2 = new sg.i(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar.d = iVar2;
        aVar.e = viewGroup;
        ah.e eVar2 = new ah.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.A = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e10 = nh.f6.e(null, this.currentAccount, j10, g6.I.q());
        this.y = e10;
        q0Var.V(e10);
        f6 f6Var = new f6(context, this.currentAccount, c6Var);
        this.b = f6Var;
        f6Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        f6Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        f6Var.setLayoutBackground(new org.telegram.ui.ActionBar.t5(f6Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        q0Var.addView(f6Var, i7.f6.e(-2, -2, 48));
        sg.f fVar = new sg.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(aVar.c(fVar, pg.a.b(c6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(aVar.c(fVar, pg.a.b(c6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        r0 r0Var = new r0(this, AndroidUtilities.getActivity(), q0Var);
        this.n = r0Var;
        r0Var.setInAppInsetsController(iVar);
        r0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        r0Var.t4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        r0Var.s4 = false;
        r0Var.d2 = !AndroidUtilities.isInMultiwindow && ((tnVar = r0Var.K2) == null || !tnVar.isInBubbleMode());
        r0Var.V0(false, false, false);
        r0Var.g1(true, false);
        r0Var.u1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        r0Var.getSendButton().setAlpha(0.0f);
        r0Var.getEditField().setMaxLines(3);
        r0Var.setCustomWindowView(this.container);
        r0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(r0Var, i7.f6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), i7.f6.c(-1.0f, -1));
        this.containerView.addView(fVar, i7.f6.c(-1.0f, -1));
        r0Var.setDelegate(new s0(this, tL_starGiftUnique));
        jf jfVar = r0Var.A0;
        od odVar = new od();
        InputFilter[] filters = jfVar.getFilters();
        if (filters == null) {
            jfVar.setFilters(new InputFilter[]{odVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = odVar;
            jfVar.setFilters(inputFilterArr);
        }
        o6 o6Var = new o6(context, false, false, false);
        this.w = o6Var;
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        o6Var.setVisibility(8);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(getThemedColor(g6.y6));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(17);
        this.containerView.addView(o6Var, i7.f6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        t0 t0Var = new t0(R.drawable.send_plane_24, context, c6Var, false);
        this.D = t0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        t0Var.E = dp;
        t0Var.F = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        t0Var.I = dp3;
        t0Var.J = dp4;
        t0Var.d0 = true;
        this.containerView.addView(t0Var, i7.f6.e(110, 50, 85));
        t0Var.setScrimViewBackgroundColor(getThemedColor(g6.d6));
        t0Var.setOnClickListener(new View.OnClickListener(this) { // from class: ih.p0
            public final /* synthetic */ v0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        v0 v0Var = this.b;
                        if (v0Var.A - v0Var.B >= 0) {
                            jh.b3 b3Var = v0Var.G;
                            if (b3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = v0Var.n.getTextWithEntities();
                                boolean z10 = v0Var.C;
                                jh.h5 h5Var = (jh.h5) b3Var.c;
                                v0 v0Var2 = (v0) b3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                                long j11 = b3Var.b;
                                kf.b bVar = (kf.b) b3Var.f;
                                if (!v0Var2.H) {
                                    h5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, v0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(v0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        v0 v0Var3 = this.b;
                        boolean z11 = v0Var3.C;
                        v0Var3.C = !z11;
                        v0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i13 = g6.ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.t5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, i7.f6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        hp hpVar = new hp(context, 18, c6Var);
        this.s = hpVar;
        hpVar.getCheckBoxBase().j(true);
        hpVar.getCheckBoxBase().e = 0.9f;
        hpVar.b(i13, i13, g6.k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(!this.C, false);
        f6Var.getLayout().R = new o0(this, i10);
        hpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(hpVar, i7.f6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.t5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ih.p0
            public final /* synthetic */ v0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        v0 v0Var = this.b;
                        if (v0Var.A - v0Var.B >= 0) {
                            jh.b3 b3Var = v0Var.G;
                            if (b3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = v0Var.n.getTextWithEntities();
                                boolean z10 = v0Var.C;
                                jh.h5 h5Var = (jh.h5) b3Var.c;
                                v0 v0Var2 = (v0) b3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                                long j11 = b3Var.b;
                                kf.b bVar = (kf.b) b3Var.f;
                                if (!v0Var2.H) {
                                    h5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, v0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(v0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        v0 v0Var3 = this.b;
                        boolean z11 = v0Var3.C;
                        v0Var3.C = !z11;
                        v0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, i7.f6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.t5 t5Var = new org.telegram.ui.ActionBar.t5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = rg.c.a;
        imageView.setBackground(new org.telegram.ui.ActionBar.s5(dp5, dp6, t5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ih.p0
            public final /* synthetic */ v0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        v0 v0Var = this.b;
                        if (v0Var.A - v0Var.B >= 0) {
                            jh.b3 b3Var = v0Var.G;
                            if (b3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = v0Var.n.getTextWithEntities();
                                boolean z10 = v0Var.C;
                                jh.h5 h5Var = (jh.h5) b3Var.c;
                                v0 v0Var2 = (v0) b3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                                long j11 = b3Var.b;
                                kf.b bVar = (kf.b) b3Var.f;
                                if (!v0Var2.H) {
                                    h5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, v0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(v0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        v0 v0Var3 = this.b;
                        boolean z11 = v0Var3.C;
                        v0Var3.C = !z11;
                        v0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, i7.f6.e(56, 56, 53));
        h6.b(frameLayout, 0.05f, 1.2f);
        h6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        eg.n nVar = new eg.n(this, 8);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(viewGroup3, nVar);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ah.i iVar = this.h;
        int i10 = iVar.e(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        f6 f6Var = this.b;
        FrameLayout frameLayout = this.r;
        f6Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - f6Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - f6Var.getHeight()));
        f6Var.invalidate();
        float y8 = f6Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y8);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f9 = i10;
        ImageView imageView = this.x;
        imageView.setTranslationY(f9);
        imageView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        r0 r0Var = this.n;
        if (r0Var == null || !r0Var.t0()) {
            super.onBackPressed();
        } else {
            r0Var.m0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        mc.a(this.container, new u0(this, 0));
        h40 h40Var = h40.s;
        if (h40Var.c()) {
            h40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.F);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.E.title);
            sb2.append(" #");
            new tc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), j7.l1.m(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        Paint G = c6Var != null ? c6Var.G("paintChatActionBackground") : null;
        return G != null ? G : g6.S0("paintChatActionBackground");
    }
}
