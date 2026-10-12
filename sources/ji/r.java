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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.hj0;
import org.telegram.ui.sk;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class r extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public h1 F;
    public int G;
    public m80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public hj0 O;
    public final d P;
    public final int n;
    public final x3 r;
    public final c4 s;
    public m.q3 v;
    public wz w;
    public boolean x;
    public boolean y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var, viVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        x3 x3Var = new x3(context, i10, c6Var, new qf.b(this, c6Var, false, 28));
        this.r = x3Var;
        x3Var.setAdaptiveLinkDialogs(false);
        x3Var.setAllowTapAboveContent(false);
        addView(x3Var, w7.a6.e(-1, -1, 119));
        addView(x3Var.getOverlayView(), w7.a6.e(-1, -1, 119));
        x3Var.A4();
        h2 h2Var = x3Var.H3;
        if (h2Var != null) {
            h2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        c4 c4Var = new c4(context, mVar);
        this.s = c4Var;
        c4Var.setBackVisible(false);
        c4Var.setTopGradientVisible(false);
        b0();
        addView(c4Var, w7.a6.e(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(r rVar) {
        int i10 = 0;
        if (!(rVar.r.l3() || rVar.x)) {
            vi viVar = rVar.b;
            if (!viVar.R && viVar.V0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (rVar.K != i10) {
            rVar.K = i10;
            rVar.V();
        }
    }

    public static void O(r rVar) {
        x3 x3Var = rVar.r;
        if (rVar.x) {
            h1 Q2 = x3Var.Q2();
            if (Q2 != null) {
                Q2.r();
                AndroidUtilities.showKeyboard(Q2);
            }
            rVar.U(true);
            return;
        }
        vi viVar = rVar.b;
        if (rVar.w == null) {
            wz wzVar = new wz(viVar.f0, true, false, false, rVar.getContext(), true, null, viVar.u1, true, rVar.a, false, false);
            rVar.w = wzVar;
            wzVar.setVisibility(8);
            wz wzVar2 = rVar.w;
            wzVar2.w2 = false;
            wzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.w.setDelegate(new p(rVar));
            rVar.addView(rVar.w, w7.a6.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.w.setLayoutParams(layoutParams);
        rVar.w.setTranslationY(0.0f);
        rVar.w.setVisibility(0);
        rVar.x = true;
        rVar.E = emojiPanelHeight;
        h1 Q22 = x3Var.Q2();
        if (Q22 != null) {
            AndroidUtilities.hideKeyboard(Q22);
        }
        c4 c4Var = rVar.s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(true);
        }
        rVar.Y(false);
        rVar.requestLayout();
    }

    public static h1 P(r rVar) {
        x3 x3Var = rVar.r;
        h1 focusedEditTextOrNull = x3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            h1 h1Var = rVar.F;
            return h1Var != null ? h1Var : x3Var.Q2();
        }
        rVar.F = focusedEditTextOrNull;
        rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int Q(r rVar, h1 h1Var) {
        return (h1Var != rVar.F || rVar.r.getFocusedEditTextOrNull() == h1Var) ? Math.max(0, h1Var.getSelectionEnd()) : Math.min(rVar.G, h1Var.length());
    }

    public static void R(r rVar, int i10, int i11) {
        vi viVar = rVar.b;
        if (viVar.f0 == null) {
            return;
        }
        vi viVar2 = new vi(rVar.getContext(), viVar.f0, false, false, true, rVar.a);
        viVar2.c2 = new n(rVar, viVar2);
        viVar2.j0.f0();
        viVar2.N1(1, true);
        viVar2.j1(i10);
        viVar2.w2 = new e(rVar, viVar2);
        viVar2.Y = new e(rVar, viVar2);
        viVar2.X = new o(rVar, viVar2);
        viVar2.t1();
        if (i11 != 0) {
            viVar2.D1(i11);
        }
        viVar2.setFocusable(true);
        viVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 i10 = yh.i(1, context, c6Var, true);
        LinearLayout e = yh.e(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.m1(0.05f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e.addView(horizontalScrollView, w7.a6.t(-1, -2, 49, 12, 2, 12, 0));
        di.d f7 = yh.f(24, context, c6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, f7, zArr2, new ii.a(strArr, 2), imageView, c6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, c6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new q(strArr, kVar));
        e.addView(j3Var, w7.a6.t(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        e.addView(f7, w7.a6.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i10.customView = e;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: ji.l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.h3 h3Var2 = org.telegram.ui.Cells.j3.this.b;
                h3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(h3Var2);
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
        int i11 = org.telegram.ui.ActionBar.g6.a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        f7.setOnClickListener(new bi.l0(f7, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new ig.t0(j3Var, 6), 200L);
    }

    private int getEmojiPanelHeight() {
        int R = this.b.u1.R();
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int dp;
        int i12;
        m80 m80Var;
        boolean z10 = this.L;
        vi viVar = this.b;
        boolean z11 = viVar.u1.R() > AndroidUtilities.dp(20.0f);
        this.L = z11;
        if (!z11 && z10 && (m80Var = this.H) != null) {
            m80Var.u();
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
        x3 x3Var = this.r;
        int c10 = yh.c(110.0f, (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight, (x3Var.l3() || this.x || !viVar.V0) ? 0 : AndroidUtilities.dp(62.0f)) + this.E;
        if (x3Var.getPaddingTop() != currentActionBarHeight || x3Var.getPaddingBottom() != c10) {
            this.N = true;
            x3Var.o1(0, currentActionBarHeight, 0, c10);
            this.N = false;
        }
        d0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void G(ni niVar) {
        this.b.a1.setTitle("");
        this.r.W2.N(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.ni
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        sk skVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        x3 x3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && g5.f(x3Var.j3, x3Var.k3)) {
            d2.p0(getContext(), new b(x3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (x3Var.l3() && !x3Var.n3()) {
            if (x3Var.N3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                vi viVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList a32 = x3Var.a3();
                    if (!a32.isEmpty()) {
                        ArrayList C2 = x3Var.C2();
                        ArrayList z22 = x3Var.z2();
                        ArrayList a2 = f5.a(i12, a32);
                        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
                        if (m2Var instanceof fo) {
                            fo foVar = (fo) m2Var;
                            MessageObject messageObject3 = foVar.n5;
                            MessageObject messageObject4 = foVar.X3;
                            j11 = foVar.S8();
                            sendMessageChatArguments = foVar.H8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(viVar.M1), a32, C2, z22, a2, false, viVar.p1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        viVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f0;
                    if ((m2Var2 instanceof fo) && (skVar = ((fo) m2Var2).Y) != null) {
                        skVar.P0(g5.k(x3Var.j3), z10, i10, i11);
                        viVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                c4 c4Var = this.s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(x3Var.N3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean L() {
        return !this.r.l3();
    }

    public final void S(m80 m80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, m80 m80Var2) {
        m80Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new androidx.car.app.utils.b(this, aVar, pageBlock, m80Var2, 18));
        m80Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        m80Var.y().a.setTextSize(1, i11);
    }

    public final boolean T() {
        x3 x3Var = this.r;
        if (x3Var == null || !x3Var.l3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) { // from class: ji.j
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        r rVar = this.b;
                        rVar.W();
                        rVar.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.z1(this) { // from class: ji.j
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        r rVar = this.b;
                        rVar.W();
                        rVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void U(boolean z10) {
        if (this.y) {
            this.y = false;
            wz wzVar = this.w;
            if (wzVar != null) {
                wzVar.u(false);
                if (!z10) {
                    this.w.B();
                }
            }
        }
        this.F = null;
        wz wzVar2 = this.w;
        if (wzVar2 != null) {
            wzVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.E = 0;
        c4 c4Var = this.s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void V() {
        float f7;
        float f10;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.E;
        wz wzVar = this.w;
        vi viVar = this.b;
        if (wzVar != null) {
            if (this.x) {
                f10 = (this.E - dp) + (this.y ? -viVar.o2 : 0.0f);
            } else {
                f10 = 0.0f;
            }
            wzVar.setTranslationY(f10);
        }
        c4 c4Var = this.s;
        if (c4Var != null) {
            boolean z10 = this.x;
            if (z10) {
                f7 = dp;
            } else {
                f7 = (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z10 || this.y) {
                f7 += viVar.o2;
            }
            c4Var.getBottomContainer().animate().cancel();
            c4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.x;
            float f11 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f11 += viVar.o2;
            }
            c4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = c4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(es.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.m2 m2Var = this.b.f0;
        if (!(m2Var instanceof fo)) {
            return false;
        }
        fo foVar = (fo) m2Var;
        x3 x3Var = this.r;
        if (!x3Var.s2()) {
            return false;
        }
        TL_iv.RichMessage k22 = x3Var.k2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(foVar.a(), foVar.E7(foVar.n5), "", null, null, null, null, 0L, false, false, k22);
        sk skVar = foVar.Y;
        if (skVar == null) {
            return true;
        }
        skVar.setRichDraftPreview(k22);
        return true;
    }

    public final void Y(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.l3() || this.x;
        vi viVar = this.b;
        xh xhVar = viVar.A1;
        if (viVar.x2 != z11) {
            viVar.x2 = z11;
            if (viVar.V0) {
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
        if (!z11 && !viVar.R && viVar.V0) {
            i10 = AndroidUtilities.dp(62.0f);
        }
        this.K = i10;
        V();
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
    public final void Z() {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        x3 x3Var = this.r;
        o9 textSelectionHelper = x3Var.getTextSelectionHelper();
        c4 c4Var = this.s;
        if (c4Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] C4 = x3Var.C4();
        c4Var.setQuoteState(C4 != null && x3Var.I3(C4[0], C4[1]));
        boolean M3 = x3Var.M3();
        int[] iArr = Q;
        if (M3) {
            o9 textSelectionHelper2 = x3Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.p0;
            int i13 = textSelectionHelper2.q0;
            int i14 = textSelectionHelper2.t0;
            int i15 = textSelectionHelper2.r0;
            int i16 = textSelectionHelper2.u0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.r.L3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z12 = i13 == i14;
            h1 O4 = z12 ? x3Var.O4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = O4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), O4.length()));
            this.s.c(i17, O4 != null && max < max2 && k6.h(O4.getText(), max, max2), O4 != null && max < max2 && k6.g(O4.getText(), max, max2), z12, x3Var.m2(), true);
            return;
        }
        if (x3Var.x3()) {
            o9 textSelectionHelper3 = x3Var.getTextSelectionHelper();
            h1 t22 = x3Var.t2(textSelectionHelper3.p0);
            int i20 = textSelectionHelper3.r0;
            int i21 = textSelectionHelper3.u0;
            int max3 = t22 == null ? 0 : Math.max(0, Math.min(Math.min(i20, i21), t22.length()));
            int max4 = t22 == null ? 0 : Math.max(0, Math.min(Math.max(i20, i21), t22.length()));
            if (t22 == null || max3 >= max4) {
                i11 = 0;
            } else {
                int i22 = 0;
                for (int i23 = 0; i23 < 8; i23++) {
                    int i24 = iArr[i23];
                    if ((t22.getCurrentStyle(max3, max4) & i24) != 0) {
                        i22 |= i24;
                    }
                }
                i11 = i22;
            }
            this.s.c(i11, t22 != null && max3 < max4 && k6.h(t22.getText(), max3, max4), t22 != null && max3 < max4 && k6.g(t22.getText(), max3, max4), true, x3Var.m2(), true);
            return;
        }
        int i25 = textSelectionHelper.p0;
        int i26 = textSelectionHelper.s0;
        int i27 = textSelectionHelper.r0;
        int i28 = textSelectionHelper.u0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < x3Var.n4.size();
        if (z13) {
            int i29 = 0;
            int i30 = 0;
            while (i29 < 8) {
                int i31 = iArr[i29];
                int i32 = i28;
                if (this.r.K3(i31, i25, i27, i26, i32)) {
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
            Editable I4 = x3Var.I4(i25, i27, i26, i33);
            if (I4 == null ? false : k6.h(I4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable I42 = x3Var.I4(i25, i27, i26, i33);
                    if (I42 == null ? false : k6.g(I42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z11 = true;
                        this.s.c(i10, z10, z11, !z13 && i25 == i26, x3Var.m2(), !x3Var.J3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i10, z10, z11, !z13 && i25 == i26, x3Var.m2(), !x3Var.J3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i10, z10, z11, !z13 && i25 == i26, x3Var.m2(), !x3Var.J3());
    }

    public final void a0() {
        c4 c4Var = this.s;
        if (c4Var != null) {
            x3 x3Var = this.r;
            boolean s22 = x3Var.s2();
            h2 h2Var = x3Var.H3;
            boolean z10 = (h2Var == null || h2Var.c.isEmpty()) ? false : true;
            ImageView imageView = c4Var.r;
            ImageView imageView2 = c4Var.n;
            imageView2.setEnabled(s22);
            imageView2.setAlpha(s22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void b0() {
        c4 c4Var = this.s;
        if (c4Var != null) {
            int i10 = this.n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            wg sendButton = c4Var.getSendButton();
            if (z11) {
                x3 x3Var = this.r;
                if (g5.f(x3Var.j3, x3Var.k3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            c4Var.setPremiumLocked(z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        a R2;
        c4 c4Var = this.s;
        if (c4Var == null) {
            return;
        }
        x3 x3Var = this.r;
        o9 textSelectionHelper = x3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            R2 = x3Var.R2();
        } else {
            int i10 = textSelectionHelper.p0;
            R2 = i10 == textSelectionHelper.s0 ? x3Var.z4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (x3Var.S2() == null) {
            if (R2 != null) {
                if (!R2.a() && !R2.b() && !R2.c()) {
                    TL_iv.PageBlock pageBlock = R2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!x3.D3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = R2.b;
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
        if (R2 != null) {
            if (i11 == 1) {
                TL_iv.PageBlock pageBlock3 = R2.b;
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
                if (R2.a()) {
                    i12 = R.drawable.iv_todo;
                } else if (R2.c()) {
                    i12 = R.drawable.iv_ordered_list;
                }
            }
        }
        c4Var.d(i11, i12);
    }

    public final void d0() {
        int paddingTop;
        c4 c4Var = this.s;
        if (c4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        x3 x3Var = this.r;
        if (x3Var.getChildCount() <= 0) {
            paddingTop = x3Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < x3Var.getChildCount(); i11++) {
                View childAt = x3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            paddingTop = i10 == Integer.MAX_VALUE ? x3Var.getPaddingTop() : i10;
        }
        c4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            b0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        x3 x3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.f0 instanceof fo) && x3Var.s2() && W()) {
                org.telegram.messenger.q.r(R.string.RichEditorDraftSaved, new zc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x3Var.i3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wz wzVar;
        x3 x3Var = this.r;
        k3 k3Var = x3Var.l3;
        aa aaVar = x3Var.m3;
        if (k3Var.x() && aaVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (wzVar = this.w) == null) ? getHeight() - this.E : (int) wzVar.getY()) - AndroidUtilities.dp(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            U(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && aaVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !x3Var.j3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        x3 x3Var = this.r;
        if (x3Var.getChildCount() <= 0) {
            int paddingTop = x3Var.getPaddingTop();
            this.I = paddingTop;
            x3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < x3Var.getChildCount(); i11++) {
            View childAt = x3Var.getChildAt(i11);
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
        x3Var.setTopGlowOffset(Math.max(0, i10));
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

    public o9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.ni
    public final int i() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean j() {
        boolean z10 = this.y;
        if (z10) {
            if (z10) {
                this.y = false;
                wz wzVar = this.w;
                if (wzVar != null) {
                    wzVar.u(false);
                    this.w.B();
                }
                V();
                return false;
            }
        } else {
            if (this.x) {
                U(false);
                return false;
            }
            if (!this.r.G2() && !T()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ni
    public final void l(float f7) {
        V();
    }

    @Override // org.telegram.ui.Components.ni
    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        hj0 hj0Var = this.O;
        if (hj0Var != null) {
            hj0Var.i();
            this.O = null;
        }
        m.q3 q3Var = this.v;
        if (q3Var != null) {
            q3Var.a();
        }
        x3 x3Var = this.r;
        if (x3Var != null) {
            x3Var.w2();
        }
        wz wzVar = this.w;
        if (wzVar == null || (observersGroup = wzVar.I2) == null) {
            return;
        }
        observersGroup.removeAllObservers();
        wzVar.I2 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean q() {
        x3 x3Var = this.r;
        if (x3Var == null) {
            return false;
        }
        x3Var.w2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean s() {
        return T();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ni
    public final void u() {
        m.q3 q3Var = this.v;
        if (q3Var != null) {
            q3Var.a();
        }
        if (this.x) {
            U(false);
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void y() {
        this.L = this.b.u1.R() > AndroidUtilities.dp(20.0f);
        V();
        d0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void z(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.x && !this.y) {
            U(false);
        }
        d0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void t() {
    }
}
