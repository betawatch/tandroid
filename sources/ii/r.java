package ii;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.dj0;
import org.telegram.ui.ok;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r extends qi implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public i1 F;
    public int G;
    public p80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public dj0 O;
    public final d P;
    public final int n;
    public final x3 r;
    public final c4 s;
    public m.q3 v;
    public a00 w;
    public boolean x;
    public boolean y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        x3 x3Var = new x3(context, i10, e6Var, new pf.b(20, this, e6Var));
        this.r = x3Var;
        x3Var.setAdaptiveLinkDialogs(false);
        x3Var.setAllowTapAboveContent(false);
        addView(x3Var, w7.x5.e(-1, -1, 119));
        addView(x3Var.getOverlayView(), w7.x5.e(-1, -1, 119));
        x3Var.A4();
        i2 i2Var = x3Var.H3;
        if (i2Var != null) {
            i2Var.j();
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
        addView(c4Var, w7.x5.e(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(r rVar) {
        int i10 = 0;
        if (!(rVar.r.l3() || rVar.x)) {
            yi yiVar = rVar.b;
            if (!yiVar.R && yiVar.V0) {
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
            i1 Q2 = x3Var.Q2();
            if (Q2 != null) {
                Q2.r();
                AndroidUtilities.showKeyboard(Q2);
            }
            rVar.U(true);
            return;
        }
        yi yiVar = rVar.b;
        if (rVar.w == null) {
            a00 a00Var = new a00(yiVar.f0, true, false, false, rVar.getContext(), true, null, yiVar.u1, true, rVar.a, false, false);
            rVar.w = a00Var;
            a00Var.setVisibility(8);
            a00 a00Var2 = rVar.w;
            a00Var2.w2 = false;
            a00Var2.setBottomInset(AndroidUtilities.navigationBarHeight);
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
        i1 Q22 = x3Var.Q2();
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

    public static i1 P(r rVar) {
        x3 x3Var = rVar.r;
        i1 focusedEditTextOrNull = x3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            i1 i1Var = rVar.F;
            return i1Var != null ? i1Var : x3Var.Q2();
        }
        rVar.F = focusedEditTextOrNull;
        rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int Q(r rVar, i1 i1Var) {
        return (i1Var != rVar.F || rVar.r.getFocusedEditTextOrNull() == i1Var) ? Math.max(0, i1Var.getSelectionEnd()) : Math.min(rVar.G, i1Var.length());
    }

    public static void R(r rVar, int i10, int i11) {
        yi yiVar = rVar.b;
        if (yiVar.f0 == null) {
            return;
        }
        yi yiVar2 = new yi(rVar.getContext(), yiVar.f0, false, false, true, rVar.a);
        yiVar2.c2 = new n(rVar, yiVar2);
        yiVar2.j0.f0();
        yiVar2.N1(1, true);
        yiVar2.j1(i10);
        yiVar2.w2 = new e(rVar, yiVar2);
        yiVar2.Y = new e(rVar, yiVar2);
        yiVar2.X = new o(rVar, yiVar2);
        yiVar2.t1();
        if (i11 != 0) {
            yiVar2.D1(i11);
        }
        yiVar2.setFocusable(true);
        yiVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.f3 i11 = bi.i(1, context, e6Var, true);
        LinearLayout e7 = bi.e(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.m1(0.05f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e7.addView(horizontalScrollView, w7.x5.t(-1, -2, 49, 12, 2, 12, 0));
        ci.d f7 = bi.f(24, context, e6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, f7, zArr2, new hi.a(strArr, 2), imageView, e6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, e6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new q(strArr, kVar));
        e7.addView(j3Var, w7.x5.t(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        e7.addView(f7, w7.x5.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i11.customView = e7;
        i11.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: ii.l
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
        i11.show();
        int i12 = org.telegram.ui.ActionBar.i6.a7;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        i11.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        f7.setOnClickListener(new ai.s0(f7, zArr, callback, strArr, i11, 4));
        AndroidUtilities.runOnUIThread(new i2.h0(j3Var, i10), 200L);
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
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i10, int i11) {
        int dp;
        int i12;
        p80 p80Var;
        boolean z10 = this.L;
        yi yiVar = this.b;
        boolean z11 = yiVar.u1.R() > AndroidUtilities.dp(20.0f);
        this.L = z11;
        if (!z11 && z10 && (p80Var = this.H) != null) {
            p80Var.u();
            this.H = null;
        }
        if (this.L || this.E > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(52.0f);
            yiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(52.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    yiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(52.0f);
            if (dp < 0) {
            }
            yiVar.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + dp;
        x3 x3Var = this.r;
        int C = org.telegram.messenger.q.C(110.0f, (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight, (x3Var.l3() || this.x || !yiVar.V0) ? 0 : AndroidUtilities.dp(62.0f)) + this.E;
        if (x3Var.getPaddingTop() != currentActionBarHeight || x3Var.getPaddingBottom() != C) {
            this.N = true;
            x3Var.o1(0, currentActionBarHeight, 0, C);
            this.N = false;
        }
        d0();
    }

    @Override // org.telegram.ui.Components.qi
    public final void G(qi qiVar) {
        this.b.a1.setTitle("");
        this.r.W2.N(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.qi
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        ok okVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        x3 x3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && e5.f(x3Var.j3, x3Var.k3)) {
            e2.p0(getContext(), new b(x3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (x3Var.l3() && !x3Var.n3()) {
            if (x3Var.N3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                yi yiVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList a32 = x3Var.a3();
                    if (!a32.isEmpty()) {
                        ArrayList C2 = x3Var.C2();
                        ArrayList z22 = x3Var.z2();
                        ArrayList a2 = d5.a(i12, a32);
                        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
                        if (n2Var instanceof zn) {
                            zn znVar = (zn) n2Var;
                            MessageObject messageObject3 = znVar.n5;
                            MessageObject messageObject4 = znVar.X3;
                            j10 = znVar.S8();
                            sendMessageChatArguments = znVar.H8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(yiVar.M1), a32, C2, z22, a2, false, yiVar.p1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        yiVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f0;
                    if ((n2Var2 instanceof zn) && (okVar = ((zn) n2Var2).Y) != null) {
                        okVar.P0(e5.k(x3Var.j3), z10, i10, i11);
                        yiVar.dismiss(true);
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

    @Override // org.telegram.ui.Components.qi
    public final boolean L() {
        return !this.r.l3();
    }

    public final void S(p80 p80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, p80 p80Var2) {
        p80Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new ai.i5(this, aVar, pageBlock, p80Var2, 18));
        p80Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        p80Var.y().a.setTextSize(1, i11);
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
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: ii.j
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.a2(this) { // from class: ii.j
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
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
            a00 a00Var = this.w;
            if (a00Var != null) {
                a00Var.u(false);
                if (!z10) {
                    this.w.C();
                }
            }
        }
        this.F = null;
        a00 a00Var2 = this.w;
        if (a00Var2 != null) {
            a00Var2.setTranslationY(0.0f);
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
        a00 a00Var = this.w;
        yi yiVar = this.b;
        if (a00Var != null) {
            if (this.x) {
                f10 = (this.E - dp) + (this.y ? -yiVar.o2 : 0.0f);
            } else {
                f10 = 0.0f;
            }
            a00Var.setTranslationY(f10);
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
                f7 += yiVar.o2;
            }
            c4Var.getBottomContainer().animate().cancel();
            c4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.x;
            float f11 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f11 += yiVar.o2;
            }
            c4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = c4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(hs.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.f0;
        if (!(n2Var instanceof zn)) {
            return false;
        }
        zn znVar = (zn) n2Var;
        x3 x3Var = this.r;
        if (!x3Var.s2()) {
            return false;
        }
        TL_iv.RichMessage k22 = x3Var.k2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(znVar.a(), znVar.E7(znVar.n5), "", null, null, null, null, 0L, false, false, k22);
        ok okVar = znVar.Y;
        if (okVar == null) {
            return true;
        }
        okVar.setRichDraftPreview(k22);
        return true;
    }

    public final void Y(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.l3() || this.x;
        yi yiVar = this.b;
        ai aiVar = yiVar.A1;
        if (yiVar.x2 != z11) {
            yiVar.x2 = z11;
            if (yiVar.V0) {
                aiVar.animate().cancel();
                if (!z11) {
                    aiVar.setVisibility(0);
                }
                if (z10) {
                    aiVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new sh(yiVar, z11, 3)).start();
                } else {
                    aiVar.setAlpha(z11 ? 0.0f : 1.0f);
                    aiVar.setTranslationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    aiVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !yiVar.R && yiVar.V0) {
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
            i1 O4 = z12 ? x3Var.O4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = O4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), O4.length()));
            this.s.c(i17, O4 != null && max < max2 && h6.h(O4.getText(), max, max2), O4 != null && max < max2 && h6.g(O4.getText(), max, max2), z12, x3Var.m2(), true);
            return;
        }
        if (x3Var.x3()) {
            o9 textSelectionHelper3 = x3Var.getTextSelectionHelper();
            i1 t22 = x3Var.t2(textSelectionHelper3.p0);
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
            this.s.c(i11, t22 != null && max3 < max4 && h6.h(t22.getText(), max3, max4), t22 != null && max3 < max4 && h6.g(t22.getText(), max3, max4), true, x3Var.m2(), true);
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
            if (I4 == null ? false : h6.h(I4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable I42 = x3Var.I4(i25, i27, i26, i33);
                    if (I42 == null ? false : h6.g(I42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
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
            i2 i2Var = x3Var.H3;
            boolean z10 = (i2Var == null || i2Var.c.isEmpty()) ? false : true;
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
            xg sendButton = c4Var.getSendButton();
            if (z11) {
                x3 x3Var = this.r;
                if (e5.f(x3Var.j3, x3Var.k3)) {
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
            if ((this.b.f0 instanceof zn) && x3Var.s2() && W()) {
                org.telegram.messenger.q.q(R.string.RichEditorDraftSaved, new ad(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x3Var.i3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a00 a00Var;
        x3 x3Var = this.r;
        k3 k3Var = x3Var.l3;
        aa aaVar = x3Var.m3;
        if (k3Var.x() && aaVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (a00Var = this.w) == null) ? getHeight() - this.E : (int) a00Var.getY()) - AndroidUtilities.dp(60.0f)) - this.K;
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

    @Override // org.telegram.ui.Components.qi
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.qi
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

    @Override // org.telegram.ui.Components.qi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.qi
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public o9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.qi
    public final int i() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean j() {
        boolean z10 = this.y;
        if (z10) {
            if (z10) {
                this.y = false;
                a00 a00Var = this.w;
                if (a00Var != null) {
                    a00Var.u(false);
                    this.w.C();
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

    @Override // org.telegram.ui.Components.qi
    public final void l(float f7) {
        V();
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

    @Override // org.telegram.ui.Components.qi
    public final void p() {
        NotificationCenter.ObserversGroup observersGroup;
        dj0 dj0Var = this.O;
        if (dj0Var != null) {
            dj0Var.i();
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
        a00 a00Var = this.w;
        if (a00Var == null || (observersGroup = a00Var.I2) == null) {
            return;
        }
        observersGroup.removeAllObservers();
        a00Var.I2 = null;
    }

    @Override // org.telegram.ui.Components.qi
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

    @Override // org.telegram.ui.Components.qi
    public final boolean s() {
        return T();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.qi
    public final void u() {
        m.q3 q3Var = this.v;
        if (q3Var != null) {
            q3Var.a();
        }
        if (this.x) {
            U(false);
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final void y() {
        this.L = this.b.u1.R() > AndroidUtilities.dp(20.0f);
        V();
        d0();
    }

    @Override // org.telegram.ui.Components.qi
    public final void z(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.x && !this.y) {
            U(false);
        }
        d0();
    }

    @Override // org.telegram.ui.Components.qi
    public final void t() {
    }
}
