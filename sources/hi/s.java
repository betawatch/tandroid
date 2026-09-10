package hi;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.cj0;
import org.telegram.ui.eo;
import org.telegram.ui.ok;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s extends qi implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public k1 F;
    public int G;
    public w70 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public cj0 O;
    public final e P;
    public final int n;
    public final z3 r;
    public final e4 s;
    public m.r3 v;
    public rz w;
    public boolean x;
    public boolean y;

    public s(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        n nVar = new n(this);
        this.J = true;
        this.P = new e(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        z3 z3Var = new z3(context, i10, f6Var, new of.b(16, this, f6Var));
        this.r = z3Var;
        z3Var.setAdaptiveLinkDialogs(false);
        z3Var.setAllowTapAboveContent(false);
        addView(z3Var, w7.a6.e(-1, -1, 119));
        addView(z3Var.getOverlayView(), w7.a6.e(-1, -1, 119));
        z3Var.y4();
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        e4 e4Var = new e4(context, nVar);
        this.s = e4Var;
        e4Var.setBackVisible(false);
        e4Var.setTopGradientVisible(false);
        Y();
        addView(e4Var, w7.a6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new j(this, 0));
    }

    public static void K(s sVar) {
        int i10 = 0;
        if (!(sVar.r.j3() || sVar.x)) {
            yi yiVar = sVar.b;
            if (!yiVar.R && yiVar.S0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (sVar.K != i10) {
            sVar.K = i10;
            sVar.S();
        }
    }

    public static void L(s sVar) {
        z3 z3Var = sVar.r;
        if (sVar.x) {
            k1 O2 = z3Var.O2();
            if (O2 != null) {
                O2.r();
                AndroidUtilities.showKeyboard(O2);
            }
            sVar.R(true);
            return;
        }
        yi yiVar = sVar.b;
        if (sVar.w == null) {
            rz rzVar = new rz(yiVar.f0, true, false, false, sVar.getContext(), true, null, yiVar.r1, true, sVar.a, false, false);
            sVar.w = rzVar;
            rzVar.setVisibility(8);
            rz rzVar2 = sVar.w;
            rzVar2.x2 = false;
            rzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = sVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            sVar.w.setDelegate(new q(sVar));
            sVar.addView(sVar.w, w7.a6.e(-1, sVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = sVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        sVar.w.setLayoutParams(layoutParams);
        sVar.w.setTranslationY(0.0f);
        sVar.w.setVisibility(0);
        sVar.x = true;
        sVar.E = emojiPanelHeight;
        k1 O22 = z3Var.O2();
        if (O22 != null) {
            AndroidUtilities.hideKeyboard(O22);
        }
        e4 e4Var = sVar.s;
        if (e4Var != null) {
            e4Var.setEmojiOpened(true);
        }
        sVar.V(false);
        sVar.requestLayout();
    }

    public static k1 M(s sVar) {
        z3 z3Var = sVar.r;
        k1 focusedEditTextOrNull = z3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            k1 k1Var = sVar.F;
            return k1Var != null ? k1Var : z3Var.O2();
        }
        sVar.F = focusedEditTextOrNull;
        sVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int N(s sVar, k1 k1Var) {
        return (k1Var != sVar.F || sVar.r.getFocusedEditTextOrNull() == k1Var) ? Math.max(0, k1Var.getSelectionEnd()) : Math.min(sVar.G, k1Var.length());
    }

    public static void O(s sVar, int i10, int i11) {
        yi yiVar = sVar.b;
        if (yiVar.f0 == null) {
            return;
        }
        yi yiVar2 = new yi(sVar.getContext(), yiVar.f0, false, false, true, sVar.a);
        yiVar2.Z1 = new o(sVar, yiVar2);
        yiVar2.j0.f0();
        yiVar2.J1(1, true);
        yiVar2.h1(i10);
        yiVar2.t2 = new f(sVar, yiVar2);
        yiVar2.Y = new f(sVar, yiVar2);
        yiVar2.X = new p(sVar, yiVar2);
        yiVar2.r1();
        if (i11 != 0) {
            yiVar2.A1(i11);
        }
        yiVar2.setFocusable(true);
        yiVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.h3 i10 = em.i(1, context, f6Var, true);
        LinearLayout f7 = em.f(context, 1);
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
        f7.addView(horizontalScrollView, w7.a6.t(-1, -2, 49, 12, 2, 12, 0));
        bi.d g10 = em.g(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        l lVar = new l(strArr, horizontalScrollView, g10, zArr2, new gi.a(strArr, 2), imageView, f6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        i3Var.setText(strArr[0]);
        g3Var.addTextChangedListener(new r(strArr, lVar));
        f7.addView(i3Var, w7.a6.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(LocaleController.getString(R.string.Done));
        f7.addView(g10, w7.a6.t(-1, 48, 55, 12, 12, 12, 12));
        lVar.run();
        i10.customView = f7;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: hi.m
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
        g10.setOnClickListener(new c(g10, zArr, callback, strArr, i10, 0));
        AndroidUtilities.runOnUIThread(new gg.v1(i3Var, 3), 200L);
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

    @Override // org.telegram.ui.Components.qi
    public final void D(qi qiVar) {
        this.b.X0.setTitle("");
        this.r.Y2.N(false);
        V(false);
        post(new e(this, 4));
    }

    @Override // org.telegram.ui.Components.qi
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        ok okVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        z3 z3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && f5.f(z3Var.l3, z3Var.m3)) {
            g2.p0(getContext(), new b(z3Var, 0), new e(this, 2), this.a);
            return false;
        }
        if (z3Var.j3() && !z3Var.l3()) {
            if (z3Var.L3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                yi yiVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList Y2 = z3Var.Y2();
                    if (!Y2.isEmpty()) {
                        ArrayList A2 = z3Var.A2();
                        ArrayList x22 = z3Var.x2();
                        ArrayList a2 = e5.a(i12, Y2);
                        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
                        if (p2Var instanceof eo) {
                            eo eoVar = (eo) p2Var;
                            MessageObject messageObject3 = eoVar.n5;
                            MessageObject messageObject4 = eoVar.X3;
                            j10 = eoVar.N8();
                            sendMessageChatArguments = eoVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(yiVar.J1), Y2, A2, x22, a2, false, yiVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        yiVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f0;
                    if ((p2Var2 instanceof eo) && (okVar = ((eo) p2Var2).Y) != null) {
                        okVar.R0(f5.k(z3Var.l3), z10, i10, i11);
                        yiVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                e4 e4Var = this.s;
                if (e4Var != null) {
                    e4Var.setSendEnabled(z3Var.L3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean J() {
        return !this.r.j3();
    }

    public final void P(w70 w70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, w70 w70Var2) {
        w70Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new androidx.car.app.utils.b(this, aVar, pageBlock, w70Var2, 14));
        w70Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        w70Var.y().a.setTextSize(1, i11);
    }

    public final boolean Q() {
        z3 z3Var = this.r;
        if (z3Var == null || !z3Var.j3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: hi.k
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        s sVar = this.b;
                        sVar.T();
                        sVar.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.c2(this) { // from class: hi.k
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        s sVar = this.b;
                        sVar.T();
                        sVar.b.dismiss();
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
            rz rzVar = this.w;
            if (rzVar != null) {
                rzVar.t(false);
                if (!z10) {
                    this.w.A();
                }
            }
        }
        this.F = null;
        rz rzVar2 = this.w;
        if (rzVar2 != null) {
            rzVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.E = 0;
        e4 e4Var = this.s;
        if (e4Var != null) {
            e4Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        float f7;
        float f10;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.E;
        rz rzVar = this.w;
        yi yiVar = this.b;
        if (rzVar != null) {
            if (this.x) {
                f10 = (this.E - dp) + (this.y ? -yiVar.l2 : 0.0f);
            } else {
                f10 = 0.0f;
            }
            rzVar.setTranslationY(f10);
        }
        e4 e4Var = this.s;
        if (e4Var != null) {
            boolean z10 = this.x;
            if (z10) {
                f7 = dp;
            } else {
                f7 = (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z10 || this.y) {
                f7 += yiVar.l2;
            }
            e4Var.getBottomContainer().animate().cancel();
            e4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.x;
            float f11 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f11 += yiVar.l2;
            }
            e4Var.setBottomGradientTranslationY(-f11);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = e4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-r1).setDuration(320L).setInterpolator(wr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.f0;
        if (!(p2Var instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) p2Var;
        z3 z3Var = this.r;
        if (!z3Var.q2()) {
            return false;
        }
        TL_iv.RichMessage i22 = z3Var.i2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(eoVar.a(), eoVar.B7(eoVar.n5), "", null, null, null, null, 0L, false, false, i22);
        ok okVar = eoVar.Y;
        if (okVar == null) {
            return true;
        }
        okVar.setRichDraftPreview(i22);
        return true;
    }

    public final void V(boolean z10) {
        int i10 = 0;
        boolean z11 = this.r.j3() || this.x;
        yi yiVar = this.b;
        ai aiVar = yiVar.x1;
        if (yiVar.u2 != z11) {
            yiVar.u2 = z11;
            if (yiVar.S0) {
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
        if (!z11 && !yiVar.R && yiVar.S0) {
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
        z3 z3Var = this.r;
        s9 textSelectionHelper = z3Var.getTextSelectionHelper();
        e4 e4Var = this.s;
        if (e4Var == null || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        int[] A4 = z3Var.A4();
        e4Var.setQuoteState(A4 != null && z3Var.G3(A4[0], A4[1]));
        boolean K3 = z3Var.K3();
        int[] iArr = Q;
        if (K3) {
            s9 textSelectionHelper2 = z3Var.getTextSelectionHelper();
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
            k1 M4 = z12 ? z3Var.M4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = M4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), M4.length()));
            this.s.c(i17, M4 != null && max < max2 && i6.h(M4.getText(), max, max2), M4 != null && max < max2 && i6.g(M4.getText(), max, max2), z12, z3Var.k2(), true);
            return;
        }
        if (z3Var.v3()) {
            s9 textSelectionHelper3 = z3Var.getTextSelectionHelper();
            k1 r22 = z3Var.r2(textSelectionHelper3.u0);
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
            this.s.c(i11, r22 != null && max3 < max4 && i6.h(r22.getText(), max3, max4), r22 != null && max3 < max4 && i6.g(r22.getText(), max3, max4), true, z3Var.k2(), true);
            return;
        }
        int i25 = textSelectionHelper.u0;
        int i26 = textSelectionHelper.x0;
        int i27 = textSelectionHelper.w0;
        int i28 = textSelectionHelper.z0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < z3Var.p4.size();
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
            Editable G4 = z3Var.G4(i25, i27, i26, i33);
            if (G4 == null ? false : i6.h(G4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
                if (z13) {
                    Editable G42 = z3Var.G4(i25, i27, i26, i33);
                    if (G42 == null ? false : i6.g(G42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z11 = true;
                        this.s.c(i10, z10, z11, !z13 && i25 == i26, z3Var.k2(), !z3Var.H3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i10, z10, z11, !z13 && i25 == i26, z3Var.k2(), !z3Var.H3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i10, z10, z11, !z13 && i25 == i26, z3Var.k2(), !z3Var.H3());
    }

    public final void X() {
        e4 e4Var = this.s;
        if (e4Var != null) {
            z3 z3Var = this.r;
            boolean q22 = z3Var.q2();
            k2 k2Var = z3Var.J3;
            boolean z10 = (k2Var == null || k2Var.c.isEmpty()) ? false : true;
            ImageView imageView = e4Var.r;
            ImageView imageView2 = e4Var.n;
            imageView2.setEnabled(q22);
            imageView2.setAlpha(q22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void Y() {
        e4 e4Var = this.s;
        if (e4Var != null) {
            int i10 = this.n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            xg sendButton = e4Var.getSendButton();
            if (z11) {
                z3 z3Var = this.r;
                if (f5.f(z3Var.l3, z3Var.m3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            e4Var.setPremiumLocked(z11);
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
        e4 e4Var = this.s;
        if (e4Var == null) {
            return;
        }
        z3 z3Var = this.r;
        s9 textSelectionHelper = z3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            P2 = z3Var.P2();
        } else {
            int i10 = textSelectionHelper.u0;
            P2 = i10 == textSelectionHelper.x0 ? z3Var.x4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (z3Var.Q2() == null) {
            if (P2 != null) {
                if (!P2.a() && !P2.b() && !P2.c()) {
                    TL_iv.PageBlock pageBlock = P2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!z3.B3(pageBlock)) {
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
        e4Var.d(i11, i12);
    }

    public final void a0() {
        int paddingTop;
        e4 e4Var = this.s;
        if (e4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        z3 z3Var = this.r;
        if (z3Var.getChildCount() <= 0) {
            paddingTop = z3Var.getPaddingTop();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < z3Var.getChildCount(); i11++) {
                View childAt = z3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            paddingTop = i10 == Integer.MAX_VALUE ? z3Var.getPaddingTop() : i10;
        }
        e4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
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
        z3 z3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.f0 instanceof eo) && z3Var.q2() && T()) {
                org.telegram.messenger.a2.o(R.string.RichEditorDraftSaved, new wc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!z3Var.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rz rzVar;
        z3 z3Var = this.r;
        m3 m3Var = z3Var.n3;
        ea eaVar = z3Var.o3;
        if (m3Var.y() && eaVar.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (rzVar = this.w) == null) ? getHeight() - this.E : (int) rzVar.getY()) - AndroidUtilities.dp(60.0f)) - this.K;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            R(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && eaVar.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !z3Var.h3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        z3 z3Var = this.r;
        if (z3Var.getChildCount() <= 0) {
            int paddingTop = z3Var.getPaddingTop();
            this.I = paddingTop;
            z3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        for (int i11 = 0; i11 < z3Var.getChildCount(); i11++) {
            View childAt = z3Var.getChildAt(i11);
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
        z3Var.setTopGlowOffset(Math.max(0, i10));
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
        return (this.r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }

    public s9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.qi
    public final int h() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean i() {
        boolean z10 = this.y;
        if (z10) {
            if (z10) {
                this.y = false;
                rz rzVar = this.w;
                if (rzVar != null) {
                    rzVar.t(false);
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
            if (!this.r.E2() && !Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final void k(float f7) {
        S();
    }

    @Override // org.telegram.ui.Components.qi
    public final void m() {
        cj0 cj0Var = this.O;
        if (cj0Var != null) {
            cj0Var.i();
            this.O = null;
        }
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        z3 z3Var = this.r;
        if (z3Var != null) {
            z3Var.u2();
        }
        rz rzVar = this.w;
        if (rzVar != null) {
            rzVar.D();
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean n() {
        z3 z3Var = this.r;
        if (z3Var == null) {
            return false;
        }
        z3Var.u2();
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

    @Override // org.telegram.ui.Components.qi
    public final boolean p() {
        return Q();
    }

    @Override // org.telegram.ui.Components.qi
    public final void r() {
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
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

    @Override // org.telegram.ui.Components.qi
    public final void v() {
        this.L = this.b.r1.R() > AndroidUtilities.dp(20.0f);
        S();
        a0();
    }

    @Override // org.telegram.ui.Components.qi
    public final void w(int i10, boolean z10) {
        this.L = z10;
        S();
        if (z10 && this.x && !this.y) {
            R(false);
        }
        a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        w70 w70Var;
        boolean z10 = this.L;
        yi yiVar = this.b;
        boolean z11 = yiVar.r1.R() > AndroidUtilities.dp(20.0f);
        this.L = z11;
        if (!z11 && z10 && (w70Var = this.H) != null) {
            w70Var.u();
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + dp;
        z3 z3Var = this.r;
        int C = org.telegram.messenger.a2.C(110.0f, (this.L || this.E > 0) ? 0 : AndroidUtilities.navigationBarHeight, (z3Var.j3() || this.x || !yiVar.S0) ? 0 : AndroidUtilities.dp(62.0f)) + this.E;
        if (z3Var.getPaddingTop() != currentActionBarHeight || z3Var.getPaddingBottom() != C) {
            this.N = true;
            z3Var.n1(0, currentActionBarHeight, 0, C);
            this.N = false;
        }
        a0();
    }

    @Override // org.telegram.ui.Components.qi
    public final void q() {
    }
}
