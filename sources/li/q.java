package li;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
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
import bi.i8;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wc;
import org.telegram.ui.jk;
import org.telegram.ui.mn;
import org.telegram.ui.pi0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q extends li implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public g1 F;
    public int G;
    public l80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public pi0 O;
    public final d P;
    public final int n;
    public final v3 r;
    public final a4 s;
    public m.r3 v;
    public sz w;
    public boolean x;
    public boolean y;

    public q(int i10, Context context, u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        l lVar = new l(this);
        this.J = true;
        this.P = new d(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        v3 v3Var = new v3(context, i10, u6Var, new rf.b(this, u6Var, false, 29));
        this.r = v3Var;
        v3Var.setAdaptiveLinkDialogs(false);
        v3Var.setAllowTapAboveContent(false);
        addView(v3Var, kb1.i(-1, -1, 119));
        addView(v3Var.getOverlayView(), kb1.i(-1, -1, 119));
        v3Var.F4();
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        a4 a4Var = new a4(context, lVar);
        this.s = a4Var;
        a4Var.setBackVisible(false);
        a4Var.setTopGradientVisible(false);
        b0();
        addView(a4Var, kb1.i(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(q qVar) {
        int i10 = 0;
        if (!(qVar.r.q3() || qVar.x)) {
            ti tiVar = qVar.b;
            if (!tiVar.R && tiVar.V0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (qVar.K != i10) {
            qVar.K = i10;
            qVar.V();
        }
    }

    public static void O(q qVar) {
        v3 v3Var = qVar.r;
        if (qVar.x) {
            g1 V2 = v3Var.V2();
            if (V2 != null) {
                V2.r();
                AndroidUtilities.showKeyboard(V2);
            }
            qVar.U(true);
            return;
        }
        ti tiVar = qVar.b;
        if (qVar.w == null) {
            sz szVar = new sz(tiVar.f0, true, false, false, qVar.getContext(), true, null, tiVar.u1, true, qVar.a, false, false);
            qVar.w = szVar;
            szVar.setVisibility(8);
            sz szVar2 = qVar.w;
            szVar2.x2 = false;
            szVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.w.setDelegate(new o(qVar));
            qVar.addView(qVar.w, kb1.i(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.w.setLayoutParams(layoutParams);
        qVar.w.setTranslationY(0.0f);
        qVar.w.setVisibility(0);
        qVar.x = true;
        qVar.E = emojiPanelHeight;
        g1 V22 = v3Var.V2();
        if (V22 != null) {
            AndroidUtilities.hideKeyboard(V22);
        }
        a4 a4Var = qVar.s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(true);
        }
        qVar.Y(false);
        qVar.requestLayout();
    }

    public static g1 P(q qVar) {
        v3 v3Var = qVar.r;
        g1 focusedEditTextOrNull = v3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            g1 g1Var = qVar.F;
            return g1Var != null ? g1Var : v3Var.V2();
        }
        qVar.F = focusedEditTextOrNull;
        qVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int Q(q qVar, g1 g1Var) {
        return (g1Var != qVar.F || qVar.r.getFocusedEditTextOrNull() == g1Var) ? Math.max(0, g1Var.getSelectionEnd()) : Math.min(qVar.G, g1Var.length());
    }

    public static void R(q qVar, int i10, int i11) {
        ti tiVar = qVar.b;
        if (tiVar.f0 == null) {
            return;
        }
        ti tiVar2 = new ti(qVar.getContext(), tiVar.f0, false, false, true, qVar.a);
        tiVar2.c2 = new m(qVar, tiVar2);
        tiVar2.j0.g0();
        tiVar2.R1(1, true);
        tiVar2.n1(i10);
        tiVar2.z2 = new e(qVar, tiVar2);
        tiVar2.Y = new e(qVar, tiVar2);
        tiVar2.X = new n(qVar, tiVar2);
        tiVar2.w1();
        if (i11 != 0) {
            tiVar2.G1(i11);
        }
        tiVar2.setFocusable(true);
        tiVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, u6 u6Var) {
        org.telegram.ui.ActionBar.k3 i10 = wh.i(1, context, u6Var, true);
        LinearLayout d = wh.d(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(8.0f);
        int i11 = y6.G6;
        ShapeDrawable c02 = y6.c0(dp, y6.o1(0.05f, y6.w0(i11, u6Var)));
        b7 L = f7.L(0.05f, i11);
        imageView.setBackground(c02);
        f7.k(imageView, c02, L, null, u6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        d.addView(horizontalScrollView, kb1.x(-1, -2, 49, 12, 2, 12, 0));
        fi.d f7 = wh.f(24, context, u6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        i8 i8Var = new i8(strArr, horizontalScrollView, f7, zArr2, new hi.e2(strArr, 16), imageView, u6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, u6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        int dp2 = AndroidUtilities.dp(24.0f);
        int i12 = y6.d6;
        ShapeDrawable c03 = y6.c0(dp2, y6.w0(i12, u6Var));
        b7 N = f7.N(i12);
        g3Var.setBackground(c03);
        f7.k(g3Var, c03, N, null, u6Var);
        g3Var.setText(strArr[0]);
        e3Var.addTextChangedListener(new p(strArr, i8Var));
        d.addView(g3Var, kb1.x(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        d.addView(f7, kb1.x(-1, 48, 55, 12, 12, 12, 12));
        i8Var.run();
        i10.customView = d;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: li.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.e3 e3Var2 = org.telegram.ui.Cells.g3.this.d;
                e3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(e3Var2);
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
        int i13 = y6.a7;
        i10.setBackgroundColorKey(i13);
        i10.fixNavigationBarKey(i13);
        f7.setOnClickListener(new di.e0(f7, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new k2.c(g3Var, 3), 200L);
    }

    private int getEmojiPanelHeight() {
        int Q2 = this.b.u1.Q();
        if (Q2 <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            Q2 = globalEmojiSettings.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", AndroidUtilities.dp(200.0f));
        }
        if (Q2 <= 0) {
            Q2 = AndroidUtilities.dp(200.0f);
        }
        return Q2 + AndroidUtilities.navigationBarHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int dp;
        int i12;
        l80 l80Var;
        boolean z10 = this.L;
        ti tiVar = this.b;
        boolean z11 = tiVar.u1.Q() > AndroidUtilities.dp(20.0f);
        this.L = z11;
        if (!z11 && z10 && (l80Var = this.H) != null) {
            l80Var.u();
            this.H = null;
        }
        if (this.L || this.E > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(52.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(52.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(52.0f);
            if (dp < 0) {
            }
            tiVar.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + dp;
        v3 v3Var = this.r;
        int D = org.telegram.messenger.t.D(110.0f, (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight, (v3Var.q3() || this.x || !tiVar.V0) ? 0 : AndroidUtilities.dp(62.0f)) + this.E;
        if (v3Var.getPaddingTop() != currentActionBarHeight || v3Var.getPaddingBottom() != D) {
            this.N = true;
            v3Var.t1(0, currentActionBarHeight, 0, D);
            this.N = false;
        }
        d0();
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        this.b.a1.setTitle("");
        this.r.g3.O(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        mn mnVar;
        SendMessageChatArguments sendMessageChatArguments;
        jk jkVar;
        og ogVar;
        jk jkVar2;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        v3 v3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && c5.f(v3Var.t3, v3Var.u3)) {
            b2.q0(getContext(), new b(v3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (v3Var.q3() && !v3Var.s3()) {
            if (v3Var.S3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                ti tiVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList f32 = v3Var.f3();
                    if (!f32.isEmpty()) {
                        ArrayList H2 = v3Var.H2();
                        ArrayList E2 = v3Var.E2();
                        ArrayList a2 = b5.a(i12, f32);
                        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                        if (r2Var instanceof wn) {
                            wn wnVar = (wn) r2Var;
                            MessageObject messageObject3 = wnVar.D5;
                            MessageObject messageObject4 = wnVar.j4;
                            mn mnVar2 = wnVar.B5;
                            j11 = wnVar.a9();
                            sendMessageChatArguments = wnVar.O8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                            mnVar = mnVar2;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            mnVar = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(tiVar.M1), f32, H2, E2, a2, false, tiVar.t1(), messageObject, messageObject2, mnVar, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
                        if ((r2Var2 instanceof wn) && (jkVar = ((wn) r2Var2).Y) != null && (ogVar = jkVar.Z2) != null) {
                            ogVar.A(null, z10, i10, i11, 0L);
                        }
                        tiVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.r2 r2Var3 = tiVar.f0;
                    if ((r2Var3 instanceof wn) && (jkVar2 = ((wn) r2Var3).Y) != null) {
                        jkVar2.O0(c5.k(v3Var.t3), z10, i10, i11);
                        tiVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                a4 a4Var = this.s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(v3Var.S3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean L() {
        return !this.r.q3();
    }

    public final void S(l80 l80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, l80 l80Var2) {
        l80Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new ai.e0(this, aVar, pageBlock, l80Var2, 27));
        l80Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        l80Var.y().a.setTextSize(1, i11);
    }

    public final boolean T() {
        v3 v3Var = this.r;
        if (v3Var == null || !v3Var.q3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: li.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.W();
                        qVar.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.b2(this) { // from class: li.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.W();
                        qVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void U(boolean z10) {
        if (this.y) {
            this.y = false;
            sz szVar = this.w;
            if (szVar != null) {
                szVar.t(false);
                if (!z10) {
                    this.w.B();
                }
            }
        }
        this.F = null;
        sz szVar2 = this.w;
        if (szVar2 != null) {
            szVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.E = 0;
        a4 a4Var = this.s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void V() {
        float f7;
        float f10;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.E;
        sz szVar = this.w;
        ti tiVar = this.b;
        if (szVar != null) {
            if (this.x) {
                f10 = (this.E - dp) + (this.y ? -tiVar.o2 : 0.0f);
            } else {
                f10 = 0.0f;
            }
            szVar.setTranslationY(f10);
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
                f7 += tiVar.o2;
            }
            a4Var.getBottomContainer().animate().cancel();
            a4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.x;
            float f11 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f11 += tiVar.o2;
            }
            a4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = a4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(ds.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.r2 r2Var = this.b.f0;
        if (!(r2Var instanceof wn)) {
            return false;
        }
        wn wnVar = (wn) r2Var;
        v3 v3Var = this.r;
        if (!v3Var.x2()) {
            return false;
        }
        TL_iv.RichMessage p22 = v3Var.p2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(wnVar.a(), wnVar.K7(wnVar.D5), "", null, null, null, null, 0L, false, false, p22);
        jk jkVar = wnVar.Y;
        if (jkVar == null) {
            return true;
        }
        jkVar.setRichDraftPreview(p22);
        return true;
    }

    public final void Y(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.q3() || this.x;
        ti tiVar = this.b;
        th thVar = tiVar.A1;
        if (tiVar.A2 != z11) {
            tiVar.A2 = z11;
            if (tiVar.V0) {
                thVar.animate().cancel();
                if (!z11) {
                    thVar.setVisibility(0);
                }
                if (z10) {
                    thVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new ph(tiVar, z11, 3)).start();
                } else {
                    thVar.setAlpha(z11 ? 0.0f : 1.0f);
                    thVar.setTranslationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    thVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !tiVar.R && tiVar.V0) {
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
        v3 v3Var = this.r;
        s9 textSelectionHelper = v3Var.getTextSelectionHelper();
        a4 a4Var = this.s;
        if (a4Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] H4 = v3Var.H4();
        a4Var.setQuoteState(H4 != null && v3Var.N3(H4[0], H4[1]));
        boolean R3 = v3Var.R3();
        int[] iArr = Q;
        if (R3) {
            s9 textSelectionHelper2 = v3Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.p0;
            int i13 = textSelectionHelper2.q0;
            int i14 = textSelectionHelper2.t0;
            int i15 = textSelectionHelper2.r0;
            int i16 = textSelectionHelper2.u0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.r.Q3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z12 = i13 == i14;
            g1 T4 = z12 ? v3Var.T4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = T4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), T4.length()));
            this.s.c(i17, T4 != null && max < max2 && f6.h(T4.getText(), max, max2), T4 != null && max < max2 && f6.g(T4.getText(), max, max2), z12, v3Var.r2(), true);
            return;
        }
        if (v3Var.C3()) {
            s9 textSelectionHelper3 = v3Var.getTextSelectionHelper();
            g1 y22 = v3Var.y2(textSelectionHelper3.p0);
            int i20 = textSelectionHelper3.r0;
            int i21 = textSelectionHelper3.u0;
            int max3 = y22 == null ? 0 : Math.max(0, Math.min(Math.min(i20, i21), y22.length()));
            int max4 = y22 == null ? 0 : Math.max(0, Math.min(Math.max(i20, i21), y22.length()));
            if (y22 == null || max3 >= max4) {
                i11 = 0;
            } else {
                int i22 = 0;
                for (int i23 = 0; i23 < 8; i23++) {
                    int i24 = iArr[i23];
                    if ((y22.getCurrentStyle(max3, max4) & i24) != 0) {
                        i22 |= i24;
                    }
                }
                i11 = i22;
            }
            this.s.c(i11, y22 != null && max3 < max4 && f6.h(y22.getText(), max3, max4), y22 != null && max3 < max4 && f6.g(y22.getText(), max3, max4), true, v3Var.r2(), true);
            return;
        }
        int i25 = textSelectionHelper.p0;
        int i26 = textSelectionHelper.s0;
        int i27 = textSelectionHelper.r0;
        int i28 = textSelectionHelper.u0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < v3Var.x4.size();
        if (z13) {
            int i29 = 0;
            int i30 = 0;
            while (i29 < 8) {
                int i31 = iArr[i29];
                int i32 = i28;
                if (this.r.P3(i31, i25, i27, i26, i32)) {
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
            Editable N4 = v3Var.N4(i25, i27, i26, i33);
            if (N4 == null ? false : f6.h(N4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable N42 = v3Var.N4(i25, i27, i26, i33);
                    if (N42 == null ? false : f6.g(N42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z11 = true;
                        this.s.c(i10, z10, z11, !z13 && i25 == i26, v3Var.r2(), !v3Var.O3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i10, z10, z11, !z13 && i25 == i26, v3Var.r2(), !v3Var.O3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i10, z10, z11, !z13 && i25 == i26, v3Var.r2(), !v3Var.O3());
    }

    public final void a0() {
        a4 a4Var = this.s;
        if (a4Var != null) {
            v3 v3Var = this.r;
            boolean x22 = v3Var.x2();
            f2 f2Var = v3Var.R3;
            boolean z10 = (f2Var == null || f2Var.c.isEmpty()) ? false : true;
            ImageView imageView = a4Var.r;
            ImageView imageView2 = a4Var.n;
            imageView2.setEnabled(x22);
            imageView2.setAlpha(x22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void b0() {
        a4 a4Var = this.s;
        if (a4Var != null) {
            int i10 = this.n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            vg sendButton = a4Var.getSendButton();
            if (z11) {
                v3 v3Var = this.r;
                if (c5.f(v3Var.t3, v3Var.u3)) {
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
    public final void c0() {
        a W2;
        a4 a4Var = this.s;
        if (a4Var == null) {
            return;
        }
        v3 v3Var = this.r;
        s9 textSelectionHelper = v3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            W2 = v3Var.W2();
        } else {
            int i10 = textSelectionHelper.p0;
            W2 = i10 == textSelectionHelper.s0 ? v3Var.E4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (v3Var.X2() == null) {
            if (W2 != null) {
                if (!W2.a() && !W2.b() && !W2.c()) {
                    TL_iv.PageBlock pageBlock = W2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!v3.I3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = W2.b;
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
        if (W2 != null) {
            if (i11 == 1) {
                TL_iv.PageBlock pageBlock3 = W2.b;
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
                if (W2.a()) {
                    i12 = R.drawable.iv_todo;
                } else if (W2.c()) {
                    i12 = R.drawable.iv_ordered_list;
                }
            }
        }
        a4Var.d(i11, i12);
    }

    public final void d0() {
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
            int i10 = Integer.MAX_VALUE;
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
            b0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        v3 v3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.f0 instanceof wn) && v3Var.x2() && W()) {
                org.telegram.messenger.t.q(R.string.RichEditorDraftSaved, new wc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!v3Var.n3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sz szVar;
        v3 v3Var = this.r;
        j3 j3Var = v3Var.v3;
        ea eaVar = v3Var.w3;
        if (j3Var.x() && eaVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (szVar = this.w) == null) ? getHeight() - this.E : (int) szVar.getY()) - AndroidUtilities.dp(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            U(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && eaVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !v3Var.o3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        v3 v3Var = this.r;
        if (v3Var.getChildCount() <= 0) {
            int paddingTop = v3Var.getPaddingTop();
            this.I = paddingTop;
            v3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
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

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public s9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 0;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean j() {
        boolean z10 = this.y;
        if (z10) {
            if (z10) {
                this.y = false;
                sz szVar = this.w;
                if (szVar != null) {
                    szVar.t(false);
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
            if (!this.r.L2() && !T()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void l(float f7) {
        V();
    }

    @Override // org.telegram.ui.Components.li
    public final void o() {
        pi0 pi0Var = this.O;
        if (pi0Var != null) {
            pi0Var.h();
            this.O = null;
        }
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        v3 v3Var = this.r;
        if (v3Var != null) {
            v3Var.B2();
        }
        sz szVar = this.w;
        if (szVar != null) {
            szVar.C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.n).addWeakObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean p() {
        v3 v3Var = this.r;
        if (v3Var == null) {
            return false;
        }
        v3Var.B2();
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean r() {
        return T();
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

    @Override // org.telegram.ui.Components.li
    public final void t() {
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        if (this.x) {
            U(false);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void x() {
        this.L = this.b.u1.Q() > AndroidUtilities.dp(20.0f);
        V();
        d0();
    }

    @Override // org.telegram.ui.Components.li
    public final void y(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.x && !this.y) {
            U(false);
        }
        d0();
    }

    @Override // org.telegram.ui.Components.li
    public final void s() {
    }
}
