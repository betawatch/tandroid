package ji;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yc;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class r extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public h1 F;
    public int G;
    public n70 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public cj0 O;
    public final d P;
    public final int n;
    public final v3 r;
    public final a4 s;
    public m.p3 v;
    public kz w;
    public boolean x;
    public boolean y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        v3 v3Var = new v3(context, i10, f6Var, new n4.y(this, f6Var, false, 21));
        this.r = v3Var;
        v3Var.setAdaptiveLinkDialogs(false);
        v3Var.setAllowTapAboveContent(false);
        addView(v3Var, w7.x5.e(-1, -1, 119));
        addView(v3Var.getOverlayView(), w7.x5.e(-1, -1, 119));
        v3Var.y4();
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        a4 a4Var = new a4(context, mVar);
        this.s = a4Var;
        a4Var.setBackVisible(false);
        a4Var.setTopGradientVisible(false);
        Y();
        addView(a4Var, w7.x5.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void K(r rVar) {
        int i10 = 0;
        if (!(rVar.r.j3() || rVar.x)) {
            vi viVar = rVar.b;
            if (!viVar.R && viVar.S0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (rVar.K != i10) {
            rVar.K = i10;
            rVar.S();
        }
    }

    public static void L(r rVar) {
        v3 v3Var = rVar.r;
        if (rVar.x) {
            h1 O2 = v3Var.O2();
            if (O2 != null) {
                O2.r();
                AndroidUtilities.showKeyboard(O2);
            }
            rVar.R(true);
            return;
        }
        vi viVar = rVar.b;
        if (rVar.w == null) {
            kz kzVar = new kz(viVar.f0, true, false, false, rVar.getContext(), true, null, viVar.r1, true, rVar.a, false, false);
            rVar.w = kzVar;
            kzVar.setVisibility(8);
            kz kzVar2 = rVar.w;
            kzVar2.x2 = false;
            kzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.w.setDelegate(new p(rVar));
            rVar.addView(rVar.w, w7.x5.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.w.setLayoutParams(layoutParams);
        rVar.w.setTranslationY(0.0f);
        rVar.w.setVisibility(0);
        rVar.x = true;
        rVar.E = emojiPanelHeight;
        h1 O22 = v3Var.O2();
        if (O22 != null) {
            AndroidUtilities.hideKeyboard(O22);
        }
        a4 a4Var = rVar.s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(true);
        }
        rVar.V(false);
        rVar.requestLayout();
    }

    public static h1 M(r rVar) {
        v3 v3Var = rVar.r;
        h1 focusedEditTextOrNull = v3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            h1 h1Var = rVar.F;
            return h1Var != null ? h1Var : v3Var.O2();
        }
        rVar.F = focusedEditTextOrNull;
        rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int N(r rVar, h1 h1Var) {
        return (h1Var != rVar.F || rVar.r.getFocusedEditTextOrNull() == h1Var) ? Math.max(0, h1Var.getSelectionEnd()) : Math.min(rVar.G, h1Var.length());
    }

    public static void O(r rVar, int i10, int i11) {
        vi viVar = rVar.b;
        if (viVar.f0 == null) {
            return;
        }
        vi viVar2 = new vi(rVar.getContext(), viVar.f0, false, false, true, rVar.a);
        viVar2.Z1 = new n(rVar, viVar2);
        viVar2.j0.f0();
        viVar2.J1(1, true);
        viVar2.h1(i10);
        viVar2.t2 = new e(rVar, viVar2);
        viVar2.Y = new e(rVar, viVar2);
        viVar2.X = new o(rVar, viVar2);
        viVar2.r1();
        if (i11 != 0) {
            viVar2.A1(i11);
        }
        viVar2.setFocusable(true);
        viVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.f3 i10 = wl.i(1, context, f6Var, true);
        LinearLayout f7 = wl.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f7.addView(horizontalScrollView, w7.x5.t(-1, -2, 49, 12, 2, 12, 0));
        di.d g10 = wl.g(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, g10, zArr2, new ii.a(strArr, 2), imageView, f6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        i3Var.setText(strArr[0]);
        g3Var.addTextChangedListener(new q(strArr, kVar));
        f7.addView(i3Var, w7.x5.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(LocaleController.getString(R.string.Done));
        f7.addView(g10, w7.x5.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i10.customView = f7;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: ji.l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.g3 g3Var2 = org.telegram.ui.Cells.i3.this.b;
                g3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(g3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                callback.run(strArr2[0]);
            }
        });
        i10.show();
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        g10.setOnClickListener(new bi.l0(g10, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new ig.t0(i3Var, 6), 200L);
    }

    private int getEmojiPanelHeight() {
        int R = this.b.r1.R();
        if (R <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            R = globalEmojiSettings.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", AndroidUtilities.dp(200.0f));
        }
        if (R <= 0) {
            R = AndroidUtilities.dp(200.0f);
        }
        return R + AndroidUtilities.navigationBarHeight;
    }

    @Override // org.telegram.ui.Components.ni
    public final void D(ni niVar) {
        this.b.X0.setTitle("");
        this.r.Y2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.ni
    public final void G() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        mk mkVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        v3 v3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && f5.f(v3Var.l3, v3Var.m3)) {
            c2.p0(getContext(), new b(v3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (v3Var.j3() && !v3Var.l3()) {
            if (v3Var.L3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                vi viVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList Y2 = v3Var.Y2();
                    if (!Y2.isEmpty()) {
                        ArrayList A2 = v3Var.A2();
                        ArrayList x22 = v3Var.x2();
                        ArrayList a2 = e5.a(i12, Y2);
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                        if (n2Var instanceof co) {
                            co coVar = (co) n2Var;
                            MessageObject messageObject3 = coVar.n5;
                            MessageObject messageObject4 = coVar.X3;
                            j10 = coVar.N8();
                            sendMessageChatArguments = coVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(viVar.J1), Y2, A2, x22, a2, false, viVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        viVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f0;
                    if ((n2Var2 instanceof co) && (mkVar = ((co) n2Var2).Y) != null) {
                        mkVar.R0(f5.k(v3Var.l3), z10, i10, i11);
                        viVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                a4 a4Var = this.s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(v3Var.L3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean J() {
        return !this.r.j3();
    }

    public final void P(n70 n70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, n70 n70Var2) {
        n70Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new androidx.car.app.utils.b(this, aVar, pageBlock, n70Var2, 19));
        n70Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        n70Var.y().a.setTextSize(1, i11);
    }

    public final boolean Q() {
        v3 v3Var = this.r;
        if (v3Var == null || !v3Var.j3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: ji.j
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        r rVar = this.b;
                        rVar.T();
                        rVar.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.a2(this) { // from class: ji.j
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        r rVar = this.b;
                        rVar.T();
                        rVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void R(boolean z10) {
        if (this.y) {
            this.y = false;
            kz kzVar = this.w;
            if (kzVar != null) {
                kzVar.t(false);
                if (!z10) {
                    this.w.B();
                }
            }
        }
        this.F = null;
        kz kzVar2 = this.w;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.E = 0;
        a4 a4Var = this.s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        float f7;
        float f10;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.E;
        kz kzVar = this.w;
        vi viVar = this.b;
        if (kzVar != null) {
            if (this.x) {
                f10 = (this.E - dp) + (this.y ? -viVar.l2 : 0.0f);
            } else {
                f10 = 0.0f;
            }
            kzVar.setTranslationY(f10);
        }
        a4 a4Var = this.s;
        if (a4Var != null) {
            boolean z10 = this.x;
            if (z10) {
                f7 = dp;
            } else {
                f7 = (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z10 || this.y) {
                f7 += viVar.l2;
            }
            a4Var.getBottomContainer().animate().cancel();
            a4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.x;
            float f11 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f11 += viVar.l2;
            }
            a4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = a4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(pr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.f0;
        if (!(n2Var instanceof co)) {
            return false;
        }
        co coVar = (co) n2Var;
        v3 v3Var = this.r;
        if (!v3Var.q2()) {
            return false;
        }
        TL_iv.RichMessage i22 = v3Var.i2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(coVar.a(), coVar.B7(coVar.n5), "", null, null, null, null, 0L, false, false, i22);
        mk mkVar = coVar.Y;
        if (mkVar == null) {
            return true;
        }
        mkVar.setRichDraftPreview(i22);
        return true;
    }

    public final void V(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.j3() || this.x;
        vi viVar = this.b;
        xh xhVar = viVar.x1;
        if (viVar.u2 != z11) {
            viVar.u2 = z11;
            if (viVar.S0) {
                xhVar.animate().cancel();
                if (!z11) {
                    xhVar.setVisibility(0);
                }
                if (z10) {
                    xhVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new qh(viVar, z11, 3)).start();
                } else {
                    xhVar.setAlpha(z11 ? 0.0f : 1.0f);
                    xhVar.setTranslationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    xhVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !viVar.R && viVar.S0) {
            i10 = AndroidUtilities.dp(62.0f);
        }
        this.K = i10;
        S();
        if (this.J == z11) {
            this.J = !z11;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        v3 v3Var = this.r;
        q9 textSelectionHelper = v3Var.getTextSelectionHelper();
        a4 a4Var = this.s;
        if (a4Var == null || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        int[] A4 = v3Var.A4();
        a4Var.setQuoteState(A4 != null && v3Var.G3(A4[0], A4[1]));
        boolean K3 = v3Var.K3();
        int[] iArr = Q;
        if (K3) {
            q9 textSelectionHelper2 = v3Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.u0;
            int i13 = textSelectionHelper2.v0;
            int i14 = textSelectionHelper2.y0;
            int i15 = textSelectionHelper2.w0;
            int i16 = textSelectionHelper2.z0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.r.J3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z12 = i13 == i14;
            h1 M4 = z12 ? v3Var.M4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = M4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), M4.length()));
            this.s.c(i17, M4 != null && max < max2 && i6.h(M4.getText(), max, max2), M4 != null && max < max2 && i6.g(M4.getText(), max, max2), z12, v3Var.k2(), true);
            return;
        }
        if (v3Var.v3()) {
            q9 textSelectionHelper3 = v3Var.getTextSelectionHelper();
            h1 r22 = v3Var.r2(textSelectionHelper3.u0);
            int i20 = textSelectionHelper3.w0;
            int i21 = textSelectionHelper3.z0;
            int max3 = r22 == null ? 0 : Math.max(0, Math.min(Math.min(i20, i21), r22.length()));
            int max4 = r22 == null ? 0 : Math.max(0, Math.min(Math.max(i20, i21), r22.length()));
            if (r22 == null || max3 >= max4) {
                i11 = 0;
            } else {
                int i22 = 0;
                for (int i23 = 0; i23 < 8; i23++) {
                    int i24 = iArr[i23];
                    if ((r22.getCurrentStyle(max3, max4) & i24) != 0) {
                        i22 |= i24;
                    }
                }
                i11 = i22;
            }
            this.s.c(i11, r22 != null && max3 < max4 && i6.h(r22.getText(), max3, max4), r22 != null && max3 < max4 && i6.g(r22.getText(), max3, max4), true, v3Var.k2(), true);
            return;
        }
        int i25 = textSelectionHelper.u0;
        int i26 = textSelectionHelper.x0;
        int i27 = textSelectionHelper.w0;
        int i28 = textSelectionHelper.z0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < v3Var.p4.size();
        if (z13) {
            int i29 = 0;
            int i30 = 0;
            while (i29 < 8) {
                int i31 = iArr[i29];
                int i32 = i28;
                if (this.r.I3(i31, i25, i27, i26, i32)) {
                    i30 |= i31;
                }
                i29++;
                i28 = i32;
            }
            i10 = i30;
        } else {
            i10 = 0;
        }
        int i33 = i28;
        if (z13) {
            Editable G4 = v3Var.G4(i25, i27, i26, i33);
            if (G4 == null ? false : i6.h(G4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable G42 = v3Var.G4(i25, i27, i26, i33);
                    if (G42 == null ? false : i6.g(G42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z11 = true;
                        this.s.c(i10, z10, z11, !z13 && i25 == i26, v3Var.k2(), !v3Var.H3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i10, z10, z11, !z13 && i25 == i26, v3Var.k2(), !v3Var.H3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i10, z10, z11, !z13 && i25 == i26, v3Var.k2(), !v3Var.H3());
    }

    public final void X() {
        a4 a4Var = this.s;
        if (a4Var != null) {
            v3 v3Var = this.r;
            boolean q22 = v3Var.q2();
            g2 g2Var = v3Var.J3;
            boolean z10 = (g2Var == null || g2Var.c.isEmpty()) ? false : true;
            ImageView imageView = a4Var.r;
            ImageView imageView2 = a4Var.n;
            imageView2.setEnabled(q22);
            imageView2.setAlpha(q22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void Y() {
        a4 a4Var = this.s;
        if (a4Var != null) {
            int i10 = this.n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            vg sendButton = a4Var.getSendButton();
            if (z11) {
                v3 v3Var = this.r;
                if (f5.f(v3Var.l3, v3Var.m3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            a4Var.setPremiumLocked(z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        a P2;
        a4 a4Var = this.s;
        if (a4Var == null) {
            return;
        }
        v3 v3Var = this.r;
        q9 textSelectionHelper = v3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            P2 = v3Var.P2();
        } else {
            int i10 = textSelectionHelper.u0;
            P2 = i10 == textSelectionHelper.x0 ? v3Var.x4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (v3Var.Q2() == null) {
            if (P2 != null) {
                if (!P2.a() && !P2.b() && !P2.c()) {
                    TL_iv.PageBlock pageBlock = P2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!v3.B3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = P2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i11 = 1;
                            }
                        }
                    }
                }
                i11 = 2;
            }
            i11 = 0;
        }
        if (P2 != null) {
            if (i11 == 1) {
                TL_iv.PageBlock pageBlock3 = P2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i12 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i12 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i12 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i12 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i12 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i12 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i12 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i12 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i12 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i12 = R.drawable.iv_footer;
                }
            } else if (i11 == 2) {
                if (P2.a()) {
                    i12 = R.drawable.iv_todo;
                } else if (P2.c()) {
                    i12 = R.drawable.iv_ordered_list;
                }
            }
        }
        a4Var.d(i11, i12);
    }

    public final void a0() {
        int paddingTop;
        a4 a4Var = this.s;
        if (a4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        v3 v3Var = this.r;
        if (v3Var.getChildCount() <= 0) {
            paddingTop = v3Var.getPaddingTop();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < v3Var.getChildCount(); i11++) {
                View childAt = v3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            paddingTop = i10 == Integer.MAX_VALUE ? v3Var.getPaddingTop() : i10;
        }
        a4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            Y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        v3 v3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.f0 instanceof co) && v3Var.q2() && T()) {
                org.telegram.messenger.w1.o(R.string.RichEditorDraftSaved, new yc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!v3Var.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kz kzVar;
        v3 v3Var = this.r;
        i3 i3Var = v3Var.n3;
        ca caVar = v3Var.o3;
        if (i3Var.y() && caVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (kzVar = this.w) == null) ? getHeight() - this.E : (int) kzVar.getY()) - AndroidUtilities.dp(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            R(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && caVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !v3Var.h3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        v3 v3Var = this.r;
        if (v3Var.getChildCount() <= 0) {
            int paddingTop = v3Var.getPaddingTop();
            this.I = paddingTop;
            v3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        for (int i11 = 0; i11 < v3Var.getChildCount(); i11++) {
            View childAt = v3Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z10 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        v3Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i12 < AndroidUtilities.dp(7.0f) || !z10) {
            i12 = dp;
        }
        this.I = i12;
        return i12;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public q9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.ni
    public final int h() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean i() {
        boolean z10 = this.y;
        if (z10) {
            if (z10) {
                this.y = false;
                kz kzVar = this.w;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.w.B();
                }
                S();
                return false;
            }
        } else {
            if (this.x) {
                R(false);
                return false;
            }
            if (!this.r.E2() && !Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ni
    public final void k(float f7) {
        S();
    }

    @Override // org.telegram.ui.Components.ni
    public final void m() {
        cj0 cj0Var = this.O;
        if (cj0Var != null) {
            cj0Var.i();
            this.O = null;
        }
        m.p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.a();
        }
        v3 v3Var = this.r;
        if (v3Var != null) {
            v3Var.u2();
        }
        kz kzVar = this.w;
        if (kzVar != null) {
            kzVar.D();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean n() {
        v3 v3Var = this.r;
        if (v3Var == null) {
            return false;
        }
        v3Var.u2();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean p() {
        return Q();
    }

    @Override // org.telegram.ui.Components.ni
    public final void r() {
        m.p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.a();
        }
        if (this.x) {
            R(false);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ni
    public final void v() {
        this.L = this.b.r1.R() > AndroidUtilities.dp(20.0f);
        S();
        a0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void w(int i10, boolean z10) {
        this.L = z10;
        S();
        if (z10 && this.x && !this.y) {
            R(false);
        }
        a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        n70 n70Var;
        boolean z10 = this.L;
        vi viVar = this.b;
        boolean z11 = viVar.r1.R() > AndroidUtilities.dp(20.0f);
        this.L = z11;
        if (!z11 && z10 && (n70Var = this.H) != null) {
            n70Var.u();
            this.H = null;
        }
        if (this.L || this.E > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(52.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(52.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    viVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(52.0f);
            if (dp < 0) {
            }
            viVar.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + dp;
        v3 v3Var = this.r;
        int C = org.telegram.messenger.w1.C(110.0f, (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight, (v3Var.j3() || this.x || !viVar.S0) ? 0 : AndroidUtilities.dp(62.0f)) + this.E;
        if (v3Var.getPaddingTop() != currentActionBarHeight || v3Var.getPaddingBottom() != C) {
            this.N = true;
            v3Var.n1(0, currentActionBarHeight, 0, C);
            this.N = false;
        }
        a0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void q() {
    }
}
