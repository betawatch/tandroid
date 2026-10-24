package ki;

import ai.m8;
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
import ei.bc;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.xc;
import org.telegram.ui.gk;
import org.telegram.ui.qi0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class q extends li implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public h1 F;
    public int G;
    public j80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public qi0 O;
    public final d P;
    public final int n;
    public final w3 r;
    public final b4 s;
    public m.s3 v;
    public tz w;
    public boolean x;
    public boolean y;

    public q(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, ti tiVar) {
        super(context, g6Var, tiVar);
        l lVar = new l(this);
        this.J = true;
        this.P = new d(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        w3 w3Var = new w3(context, i10, g6Var, new n4.s(this, g6Var, false, 27));
        this.r = w3Var;
        w3Var.setAdaptiveLinkDialogs(false);
        w3Var.setAllowTapAboveContent(false);
        addView(w3Var, w7.z5.e(-1, -1, 119));
        addView(w3Var.getOverlayView(), w7.z5.e(-1, -1, 119));
        w3Var.F4();
        h2 h2Var = w3Var.K3;
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
        b4 b4Var = new b4(context, lVar);
        this.s = b4Var;
        b4Var.setBackVisible(false);
        b4Var.setTopGradientVisible(false);
        b0();
        addView(b4Var, w7.z5.e(-1, -1, 119));
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
        w3 w3Var = qVar.r;
        if (qVar.x) {
            h1 V2 = w3Var.V2();
            if (V2 != null) {
                V2.r();
                AndroidUtilities.showKeyboard(V2);
            }
            qVar.U(true);
            return;
        }
        ti tiVar = qVar.b;
        if (qVar.w == null) {
            tz tzVar = new tz(tiVar.f0, true, false, false, qVar.getContext(), true, null, tiVar.u1, true, qVar.a, false, false);
            qVar.w = tzVar;
            tzVar.setVisibility(8);
            tz tzVar2 = qVar.w;
            tzVar2.x2 = false;
            tzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.w.setDelegate(new o(qVar));
            qVar.addView(qVar.w, w7.z5.e(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.w.setLayoutParams(layoutParams);
        qVar.w.setTranslationY(0.0f);
        qVar.w.setVisibility(0);
        qVar.x = true;
        qVar.E = emojiPanelHeight;
        h1 V22 = w3Var.V2();
        if (V22 != null) {
            AndroidUtilities.hideKeyboard(V22);
        }
        b4 b4Var = qVar.s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(true);
        }
        qVar.Y(false);
        qVar.requestLayout();
    }

    public static h1 P(q qVar) {
        w3 w3Var = qVar.r;
        h1 focusedEditTextOrNull = w3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            h1 h1Var = qVar.F;
            return h1Var != null ? h1Var : w3Var.V2();
        }
        qVar.F = focusedEditTextOrNull;
        qVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int Q(q qVar, h1 h1Var) {
        return (h1Var != qVar.F || qVar.r.getFocusedEditTextOrNull() == h1Var) ? Math.max(0, h1Var.getSelectionEnd()) : Math.min(qVar.G, h1Var.length());
    }

    public static void R(q qVar, int i10, int i11) {
        ti tiVar = qVar.b;
        if (tiVar.f0 == null) {
            return;
        }
        ti tiVar2 = new ti(qVar.getContext(), tiVar.f0, false, false, true, qVar.a);
        tiVar2.c2 = new m(qVar, tiVar2);
        tiVar2.j0.f0();
        tiVar2.R1(1, true);
        tiVar2.m1(i10);
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

    public static void X(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.h3 j10 = sl.j(1, context, g6Var, true);
        LinearLayout e = sl.e(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = k6.G6;
        ShapeDrawable c02 = k6.c0(dp, k6.o1(0.05f, k6.w0(i10, g6Var)));
        n6 M = r6.M(0.05f, i10);
        imageView.setBackground(c02);
        r6.k(imageView, c02, M, null, g6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e.addView(horizontalScrollView, w7.z5.t(-1, -2, 49, 12, 2, 12, 0));
        ei.d g10 = sl.g(24, context, g6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        m8 m8Var = new m8(strArr, horizontalScrollView, g10, zArr2, new hg.o(strArr, 13), imageView, g6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, g6Var);
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        int dp2 = AndroidUtilities.dp(24.0f);
        int i11 = k6.d6;
        ShapeDrawable c03 = k6.c0(dp2, k6.w0(i11, g6Var));
        n6 O = r6.O(i11);
        h3Var.setBackground(c03);
        r6.k(h3Var, c03, O, null, g6Var);
        h3Var.setText(strArr[0]);
        f3Var.addTextChangedListener(new p(strArr, m8Var));
        e.addView(h3Var, w7.z5.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(LocaleController.getString(R.string.Done));
        e.addView(g10, w7.z5.t(-1, 48, 55, 12, 12, 12, 12));
        m8Var.run();
        j10.customView = e;
        j10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: ki.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.f3 f3Var2 = org.telegram.ui.Cells.h3.this.d;
                f3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(f3Var2);
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
        j10.show();
        int i12 = k6.a7;
        j10.setBackgroundColorKey(i12);
        j10.fixNavigationBarKey(i12);
        g10.setOnClickListener(new ci.e0(g10, zArr, callback, strArr, j10, 4));
        AndroidUtilities.runOnUIThread(new bc(h3Var, 29), 200L);
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
        j80 j80Var;
        boolean z10 = this.L;
        ti tiVar = this.b;
        boolean z11 = tiVar.u1.Q() > AndroidUtilities.dp(20.0f);
        this.L = z11;
        if (!z11 && z10 && (j80Var = this.H) != null) {
            j80Var.u();
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
        w3 w3Var = this.r;
        int C = org.telegram.messenger.v0.C(110.0f, (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight, (w3Var.q3() || this.x || !tiVar.V0) ? 0 : AndroidUtilities.dp(62.0f)) + this.E;
        if (w3Var.getPaddingTop() != currentActionBarHeight || w3Var.getPaddingBottom() != C) {
            this.N = true;
            w3Var.s1(0, currentActionBarHeight, 0, C);
            this.N = false;
        }
        d0();
    }

    @Override // org.telegram.ui.Components.li
    public final void F(li liVar) {
        this.b.a1.setTitle("");
        this.r.Z2.N(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        gk gkVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        w3 w3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && c5.f(w3Var.m3, w3Var.n3)) {
            d2.p0(getContext(), new b(w3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (w3Var.q3() && !w3Var.s3()) {
            if (w3Var.S3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                ti tiVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList f32 = w3Var.f3();
                    if (!f32.isEmpty()) {
                        ArrayList H2 = w3Var.H2();
                        ArrayList E2 = w3Var.E2();
                        ArrayList a2 = b5.a(i12, f32);
                        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
                        if (o2Var instanceof sn) {
                            sn snVar = (sn) o2Var;
                            MessageObject messageObject3 = snVar.z5;
                            MessageObject messageObject4 = snVar.j4;
                            j11 = snVar.S8();
                            sendMessageChatArguments = snVar.H8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(tiVar.M1), f32, H2, E2, a2, false, tiVar.s1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        tiVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f0;
                    if ((o2Var2 instanceof sn) && (gkVar = ((sn) o2Var2).Y) != null) {
                        gkVar.P0(c5.k(w3Var.m3), z10, i10, i11);
                        tiVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                b4 b4Var = this.s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(w3Var.S3());
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

    public final void S(j80 j80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, j80 j80Var2) {
        j80Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new ai.y0(this, aVar, pageBlock, j80Var2, 24));
        j80Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        j80Var.y().a.setTextSize(1, i11);
    }

    public final boolean T() {
        w3 w3Var = this.r;
        if (w3Var == null || !w3Var.q3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) { // from class: ki.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.z1(this) { // from class: ki.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
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
            tz tzVar = this.w;
            if (tzVar != null) {
                tzVar.u(false);
                if (!z10) {
                    this.w.B();
                }
            }
        }
        this.F = null;
        tz tzVar2 = this.w;
        if (tzVar2 != null) {
            tzVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.E = 0;
        b4 b4Var = this.s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void V() {
        float f7;
        float f10;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.E;
        tz tzVar = this.w;
        ti tiVar = this.b;
        if (tzVar != null) {
            if (this.x) {
                f10 = (this.E - dp) + (this.y ? -tiVar.o2 : 0.0f);
            } else {
                f10 = 0.0f;
            }
            tzVar.setTranslationY(f10);
        }
        b4 b4Var = this.s;
        if (b4Var != null) {
            boolean z10 = this.x;
            if (z10) {
                f7 = dp;
            } else {
                f7 = (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z10 || this.y) {
                f7 += tiVar.o2;
            }
            b4Var.getBottomContainer().animate().cancel();
            b4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.x;
            float f11 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f11 += tiVar.o2;
            }
            b4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = b4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(bs.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.f0;
        if (!(o2Var instanceof sn)) {
            return false;
        }
        sn snVar = (sn) o2Var;
        w3 w3Var = this.r;
        if (!w3Var.x2()) {
            return false;
        }
        TL_iv.RichMessage p22 = w3Var.p2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(snVar.a(), snVar.E7(snVar.z5), "", null, null, null, null, 0L, false, false, p22);
        gk gkVar = snVar.Y;
        if (gkVar == null) {
            return true;
        }
        gkVar.setRichDraftPreview(p22);
        return true;
    }

    public final void Y(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.q3() || this.x;
        ti tiVar = this.b;
        wh whVar = tiVar.A1;
        if (tiVar.A2 != z11) {
            tiVar.A2 = z11;
            if (tiVar.V0) {
                whVar.animate().cancel();
                if (!z11) {
                    whVar.setVisibility(0);
                }
                if (z10) {
                    whVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new ph(tiVar, z11, 3)).start();
                } else {
                    whVar.setAlpha(z11 ? 0.0f : 1.0f);
                    whVar.setTranslationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    whVar.setVisibility(z11 ? 4 : 0);
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
        w3 w3Var = this.r;
        o9 textSelectionHelper = w3Var.getTextSelectionHelper();
        b4 b4Var = this.s;
        if (b4Var == null || textSelectionHelper == null || !textSelectionHelper.x()) {
            return;
        }
        int[] H4 = w3Var.H4();
        b4Var.setQuoteState(H4 != null && w3Var.N3(H4[0], H4[1]));
        boolean R3 = w3Var.R3();
        int[] iArr = Q;
        if (R3) {
            o9 textSelectionHelper2 = w3Var.getTextSelectionHelper();
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
            h1 T4 = z12 ? w3Var.T4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = T4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), T4.length()));
            this.s.c(i17, T4 != null && max < max2 && e6.h(T4.getText(), max, max2), T4 != null && max < max2 && e6.g(T4.getText(), max, max2), z12, w3Var.r2(), true);
            return;
        }
        if (w3Var.C3()) {
            o9 textSelectionHelper3 = w3Var.getTextSelectionHelper();
            h1 y22 = w3Var.y2(textSelectionHelper3.p0);
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
            this.s.c(i11, y22 != null && max3 < max4 && e6.h(y22.getText(), max3, max4), y22 != null && max3 < max4 && e6.g(y22.getText(), max3, max4), true, w3Var.r2(), true);
            return;
        }
        int i25 = textSelectionHelper.p0;
        int i26 = textSelectionHelper.s0;
        int i27 = textSelectionHelper.r0;
        int i28 = textSelectionHelper.u0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < w3Var.q4.size();
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
            Editable N4 = w3Var.N4(i25, i27, i26, i33);
            if (N4 == null ? false : e6.h(N4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable N42 = w3Var.N4(i25, i27, i26, i33);
                    if (N42 == null ? false : e6.g(N42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z11 = true;
                        this.s.c(i10, z10, z11, !z13 && i25 == i26, w3Var.r2(), !w3Var.O3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i10, z10, z11, !z13 && i25 == i26, w3Var.r2(), !w3Var.O3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i10, z10, z11, !z13 && i25 == i26, w3Var.r2(), !w3Var.O3());
    }

    public final void a0() {
        b4 b4Var = this.s;
        if (b4Var != null) {
            w3 w3Var = this.r;
            boolean x22 = w3Var.x2();
            h2 h2Var = w3Var.K3;
            boolean z10 = (h2Var == null || h2Var.c.isEmpty()) ? false : true;
            ImageView imageView = b4Var.r;
            ImageView imageView2 = b4Var.n;
            imageView2.setEnabled(x22);
            imageView2.setAlpha(x22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void b0() {
        b4 b4Var = this.s;
        if (b4Var != null) {
            int i10 = this.n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            vg sendButton = b4Var.getSendButton();
            if (z11) {
                w3 w3Var = this.r;
                if (c5.f(w3Var.m3, w3Var.n3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            b4Var.setPremiumLocked(z11);
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
        b4 b4Var = this.s;
        if (b4Var == null) {
            return;
        }
        w3 w3Var = this.r;
        o9 textSelectionHelper = w3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.x()) {
            W2 = w3Var.W2();
        } else {
            int i10 = textSelectionHelper.p0;
            W2 = i10 == textSelectionHelper.s0 ? w3Var.E4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (w3Var.X2() == null) {
            if (W2 != null) {
                if (!W2.a() && !W2.b() && !W2.c()) {
                    TL_iv.PageBlock pageBlock = W2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!w3.I3(pageBlock)) {
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
        b4Var.d(i11, i12);
    }

    public final void d0() {
        int paddingTop;
        b4 b4Var = this.s;
        if (b4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        w3 w3Var = this.r;
        if (w3Var.getChildCount() <= 0) {
            paddingTop = w3Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
                View childAt = w3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            paddingTop = i10 == Integer.MAX_VALUE ? w3Var.getPaddingTop() : i10;
        }
        b4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
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
        w3 w3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.f0 instanceof sn) && w3Var.x2() && W()) {
                org.telegram.messenger.v0.p(R.string.RichEditorDraftSaved, new xc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!w3Var.n3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        tz tzVar;
        w3 w3Var = this.r;
        j3 j3Var = w3Var.o3;
        aa aaVar = w3Var.p3;
        if (j3Var.x() && aaVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (tzVar = this.w) == null) ? getHeight() - this.E : (int) tzVar.getY()) - AndroidUtilities.dp(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            U(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && aaVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !w3Var.o3(motionEvent)) {
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
        w3 w3Var = this.r;
        if (w3Var.getChildCount() <= 0) {
            int paddingTop = w3Var.getPaddingTop();
            this.I = paddingTop;
            w3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
            View childAt = w3Var.getChildAt(i11);
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
        w3Var.setTopGlowOffset(Math.max(0, i10));
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

    public o9 getTextSelectionHelper() {
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
                tz tzVar = this.w;
                if (tzVar != null) {
                    tzVar.u(false);
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

    @Override // org.telegram.ui.Components.li
    public final void p() {
        NotificationCenter.ObserversGroup observersGroup;
        qi0 qi0Var = this.O;
        if (qi0Var != null) {
            qi0Var.h();
            this.O = null;
        }
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.a();
        }
        w3 w3Var = this.r;
        if (w3Var != null) {
            w3Var.B2();
        }
        tz tzVar = this.w;
        if (tzVar == null || (observersGroup = tzVar.O2) == null) {
            return;
        }
        observersGroup.removeAllObservers();
        tzVar.O2 = null;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean q() {
        w3 w3Var = this.r;
        if (w3Var == null) {
            return false;
        }
        w3Var.B2();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.li
    public final boolean s() {
        return T();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.li
    public final void u() {
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.a();
        }
        if (this.x) {
            U(false);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void y() {
        this.L = this.b.u1.Q() > AndroidUtilities.dp(20.0f);
        V();
        d0();
    }

    @Override // org.telegram.ui.Components.li
    public final void z(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.x && !this.y) {
            U(false);
        }
        d0();
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
    }
}
