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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xh;
import org.telegram.ui.cj0;
import org.telegram.ui.lk;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class r extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public i1 F;
    public int G;
    public w70 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public cj0 O;
    public final d P;
    public final int n;
    public final w3 r;
    public final b4 s;
    public m.p3 v;
    public kz w;
    public boolean x;
    public boolean y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, vi viVar) {
        super(context, e6Var, viVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        w3 w3Var = new w3(context, i10, e6Var, new of.b(22, this, e6Var));
        this.r = w3Var;
        w3Var.setAdaptiveLinkDialogs(false);
        w3Var.setAllowTapAboveContent(false);
        addView(w3Var, w7.y5.e(-1, -1, 119));
        addView(w3Var.getOverlayView(), w7.y5.e(-1, -1, 119));
        w3Var.A4();
        h2 h2Var = w3Var.J3;
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
        b4 b4Var = new b4(context, mVar);
        this.s = b4Var;
        b4Var.setBackVisible(false);
        b4Var.setTopGradientVisible(false);
        Y();
        addView(b4Var, w7.y5.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void K(r rVar) {
        int i10 = 0;
        if (!(rVar.r.l3() || rVar.x)) {
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
        w3 w3Var = rVar.r;
        if (rVar.x) {
            i1 Q2 = w3Var.Q2();
            if (Q2 != null) {
                Q2.r();
                AndroidUtilities.showKeyboard(Q2);
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
            kzVar2.w2 = false;
            kzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.w.setDelegate(new p(rVar));
            rVar.addView(rVar.w, w7.y5.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.w.setLayoutParams(layoutParams);
        rVar.w.setTranslationY(0.0f);
        rVar.w.setVisibility(0);
        rVar.x = true;
        rVar.E = emojiPanelHeight;
        i1 Q22 = w3Var.Q2();
        if (Q22 != null) {
            AndroidUtilities.hideKeyboard(Q22);
        }
        b4 b4Var = rVar.s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(true);
        }
        rVar.V(false);
        rVar.requestLayout();
    }

    public static i1 M(r rVar) {
        w3 w3Var = rVar.r;
        i1 focusedEditTextOrNull = w3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            i1 i1Var = rVar.F;
            return i1Var != null ? i1Var : w3Var.Q2();
        }
        rVar.F = focusedEditTextOrNull;
        rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int N(r rVar, i1 i1Var) {
        return (i1Var != rVar.F || rVar.r.getFocusedEditTextOrNull() == i1Var) ? Math.max(0, i1Var.getSelectionEnd()) : Math.min(rVar.G, i1Var.length());
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

    public static void U(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.f3 i11 = wh.i(1, context, e6Var, true);
        LinearLayout e = wh.e(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(j6.b0(AndroidUtilities.dp(8.0f), j6.l1(0.05f, j6.v0(j6.G6, e6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e.addView(horizontalScrollView, w7.y5.t(-1, -2, 49, 12, 2, 12, 0));
        ci.d f7 = wh.f(24, context, e6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, f7, zArr2, new hi.a(strArr, 2), imageView, e6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, e6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(j6.b0(AndroidUtilities.dp(24.0f), j6.v0(j6.d6, e6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new q(strArr, kVar));
        e.addView(j3Var, w7.y5.t(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        e.addView(f7, w7.y5.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i11.customView = e;
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
        int i12 = j6.a7;
        i11.setBackgroundColor(j6.v0(i12, e6Var));
        i11.fixNavigationBar(j6.v0(i12, e6Var));
        f7.setOnClickListener(new ai.s0(f7, zArr, callback, strArr, i11, 4));
        AndroidUtilities.runOnUIThread(new i2.g0(j3Var, i10), 200L);
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
    public final void E(ni niVar) {
        this.b.X0.setTitle("");
        this.r.Y2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.ni
    public final void G() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        lk lkVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        w3 w3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && c5.f(w3Var.l3, w3Var.m3)) {
            d2.p0(getContext(), new b(w3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (w3Var.l3() && !w3Var.n3()) {
            if (w3Var.N3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                vi viVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList a32 = w3Var.a3();
                    if (!a32.isEmpty()) {
                        ArrayList C2 = w3Var.C2();
                        ArrayList z22 = w3Var.z2();
                        ArrayList a2 = b5.a(i12, a32);
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                        if (n2Var instanceof zn) {
                            zn znVar = (zn) n2Var;
                            MessageObject messageObject3 = znVar.n5;
                            MessageObject messageObject4 = znVar.X3;
                            j10 = znVar.N8();
                            sendMessageChatArguments = znVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(viVar.J1), a32, C2, z22, a2, false, viVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        viVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f0;
                    if ((n2Var2 instanceof zn) && (lkVar = ((zn) n2Var2).Y) != null) {
                        lkVar.R0(c5.k(w3Var.l3), z10, i10, i11);
                        viVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                b4 b4Var = this.s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(w3Var.N3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean J() {
        return !this.r.l3();
    }

    public final void P(w70 w70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, w70 w70Var2) {
        w70Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new ai.i5(this, aVar, pageBlock, w70Var2, 18));
        w70Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        w70Var.y().a.setTextSize(1, i11);
    }

    public final boolean Q() {
        w3 w3Var = this.r;
        if (w3Var == null || !w3Var.l3()) {
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
                        rVar.T();
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
                    this.w.A();
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
        b4 b4Var = this.s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(false);
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
        b4 b4Var = this.s;
        if (b4Var != null) {
            boolean z10 = this.x;
            if (z10) {
                f7 = dp;
            } else {
                f7 = (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z10 || this.y) {
                f7 += viVar.l2;
            }
            b4Var.getBottomContainer().animate().cancel();
            b4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.x;
            float f11 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f11 += viVar.l2;
            }
            b4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = b4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(qr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.f0;
        if (!(n2Var instanceof zn)) {
            return false;
        }
        zn znVar = (zn) n2Var;
        w3 w3Var = this.r;
        if (!w3Var.s2()) {
            return false;
        }
        TL_iv.RichMessage k22 = w3Var.k2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(znVar.a(), znVar.B7(znVar.n5), "", null, null, null, null, 0L, false, false, k22);
        lk lkVar = znVar.Y;
        if (lkVar == null) {
            return true;
        }
        lkVar.setRichDraftPreview(k22);
        return true;
    }

    public final void V(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.l3() || this.x;
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
                    xhVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new ph(viVar, z11, 3)).start();
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
        w3 w3Var = this.r;
        q9 textSelectionHelper = w3Var.getTextSelectionHelper();
        b4 b4Var = this.s;
        if (b4Var == null || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        int[] C4 = w3Var.C4();
        b4Var.setQuoteState(C4 != null && w3Var.I3(C4[0], C4[1]));
        boolean M3 = w3Var.M3();
        int[] iArr = Q;
        if (M3) {
            q9 textSelectionHelper2 = w3Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.u0;
            int i13 = textSelectionHelper2.v0;
            int i14 = textSelectionHelper2.y0;
            int i15 = textSelectionHelper2.w0;
            int i16 = textSelectionHelper2.z0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.r.L3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z12 = i13 == i14;
            i1 O4 = z12 ? w3Var.O4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = O4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), O4.length()));
            this.s.c(i17, O4 != null && max < max2 && f6.h(O4.getText(), max, max2), O4 != null && max < max2 && f6.g(O4.getText(), max, max2), z12, w3Var.m2(), true);
            return;
        }
        if (w3Var.x3()) {
            q9 textSelectionHelper3 = w3Var.getTextSelectionHelper();
            i1 t22 = w3Var.t2(textSelectionHelper3.u0);
            int i20 = textSelectionHelper3.w0;
            int i21 = textSelectionHelper3.z0;
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
            this.s.c(i11, t22 != null && max3 < max4 && f6.h(t22.getText(), max3, max4), t22 != null && max3 < max4 && f6.g(t22.getText(), max3, max4), true, w3Var.m2(), true);
            return;
        }
        int i25 = textSelectionHelper.u0;
        int i26 = textSelectionHelper.x0;
        int i27 = textSelectionHelper.w0;
        int i28 = textSelectionHelper.z0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < w3Var.p4.size();
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
            Editable I4 = w3Var.I4(i25, i27, i26, i33);
            if (I4 == null ? false : f6.h(I4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable I42 = w3Var.I4(i25, i27, i26, i33);
                    if (I42 == null ? false : f6.g(I42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z11 = true;
                        this.s.c(i10, z10, z11, !z13 && i25 == i26, w3Var.m2(), !w3Var.J3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i10, z10, z11, !z13 && i25 == i26, w3Var.m2(), !w3Var.J3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i10, z10, z11, !z13 && i25 == i26, w3Var.m2(), !w3Var.J3());
    }

    public final void X() {
        b4 b4Var = this.s;
        if (b4Var != null) {
            w3 w3Var = this.r;
            boolean s22 = w3Var.s2();
            h2 h2Var = w3Var.J3;
            boolean z10 = (h2Var == null || h2Var.c.isEmpty()) ? false : true;
            ImageView imageView = b4Var.r;
            ImageView imageView2 = b4Var.n;
            imageView2.setEnabled(s22);
            imageView2.setAlpha(s22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void Y() {
        b4 b4Var = this.s;
        if (b4Var != null) {
            int i10 = this.n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            ug sendButton = b4Var.getSendButton();
            if (z11) {
                w3 w3Var = this.r;
                if (c5.f(w3Var.l3, w3Var.m3)) {
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
    public final void Z() {
        a R2;
        b4 b4Var = this.s;
        if (b4Var == null) {
            return;
        }
        w3 w3Var = this.r;
        q9 textSelectionHelper = w3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            R2 = w3Var.R2();
        } else {
            int i10 = textSelectionHelper.u0;
            R2 = i10 == textSelectionHelper.x0 ? w3Var.z4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (w3Var.S2() == null) {
            if (R2 != null) {
                if (!R2.a() && !R2.b() && !R2.c()) {
                    TL_iv.PageBlock pageBlock = R2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!w3.D3(pageBlock)) {
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
        b4Var.d(i11, i12);
    }

    public final void a0() {
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
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
                View childAt = w3Var.getChildAt(i11);
                if (RecyclerView.S(childAt) >= 0 && childAt.getTop() < i10) {
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
            Y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        w3 w3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.f0 instanceof zn) && w3Var.s2() && T()) {
                org.telegram.messenger.q.q(R.string.RichEditorDraftSaved, new xc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!w3Var.i3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kz kzVar;
        w3 w3Var = this.r;
        j3 j3Var = w3Var.n3;
        ca caVar = w3Var.o3;
        if (j3Var.y() && caVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (kzVar = this.w) == null) ? getHeight() - this.E : (int) kzVar.getY()) - AndroidUtilities.dp(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            R(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && caVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !w3Var.j3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        w3 w3Var = this.r;
        if (w3Var.getChildCount() <= 0) {
            int paddingTop = w3Var.getPaddingTop();
            this.I = paddingTop;
            w3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
            View childAt = w3Var.getChildAt(i11);
            int S = RecyclerView.S(childAt);
            if (S == 0) {
                z10 = true;
            }
            if (S >= 0 && childAt.getTop() < i10) {
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
                    this.w.A();
                }
                S();
                return false;
            }
        } else {
            if (this.x) {
                R(false);
                return false;
            }
            if (!this.r.G2() && !Q()) {
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
        NotificationCenter.ObserversGroup observersGroup;
        cj0 cj0Var = this.O;
        if (cj0Var != null) {
            cj0Var.i();
            this.O = null;
        }
        m.p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.a();
        }
        w3 w3Var = this.r;
        if (w3Var != null) {
            w3Var.w2();
        }
        kz kzVar = this.w;
        if (kzVar == null || (observersGroup = kzVar.I2) == null) {
            return;
        }
        observersGroup.removeAllObservers();
        kzVar.I2 = null;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean n() {
        w3 w3Var = this.r;
        if (w3Var == null) {
            return false;
        }
        w3Var.w2();
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
        w70 w70Var;
        boolean z10 = this.L;
        vi viVar = this.b;
        boolean z11 = viVar.r1.R() > AndroidUtilities.dp(20.0f);
        this.L = z11;
        if (!z11 && z10 && (w70Var = this.H) != null) {
            w70Var.u();
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
        w3 w3Var = this.r;
        int D = org.telegram.messenger.q.D(110.0f, (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight, (w3Var.l3() || this.x || !viVar.S0) ? 0 : AndroidUtilities.dp(62.0f)) + this.E;
        if (w3Var.getPaddingTop() != currentActionBarHeight || w3Var.getPaddingBottom() != D) {
            this.N = true;
            w3Var.p1(0, currentActionBarHeight, 0, D);
            this.N = false;
        }
        a0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void q() {
    }
}
