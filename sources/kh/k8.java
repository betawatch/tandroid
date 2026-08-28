package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k8 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public g8 T;
    public final org.telegram.ui.Cells.j3 U;
    public final org.telegram.ui.Cells.j3 V;
    public final FrameLayout W;
    public final d X;
    public boolean Y;
    public boolean Z;
    public fh.f1 a0;
    public long b0;
    public TLRPC.WebPage c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final d8 g0;
    public Pattern h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;

    public k8(Context context, u5 u5Var, r6 r6Var, fh.f1 f1Var) {
        super(context, null, true, false, false, false, true, 2, u5Var);
        this.g0 = new d8(this, 0);
        this.a0 = f1Var;
        fixNavigationBar();
        J();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, u5Var);
        this.U = j3Var;
        d8 d8Var = new d8(this, 1);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.u2(d8Var, 2));
        h3Var.setHandlesColor(-12476440);
        h3Var.setCursorColor(-11230757);
        h3Var.setText("https://");
        h3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        j3.r0.u(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.j2.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.f6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, l1, l12, l12));
        g7.g6.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, g7.e6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ih.j7 j7Var = new ih.j7(27, this, textView);
        textView.setOnClickListener(new bg.u1(26, this, j7Var));
        j7Var.run();
        h3Var.addTextChangedListener(new e8(this, j7Var));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, u5Var);
        this.V = j3Var2;
        d8 d8Var2 = new d8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.u2(d8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        d dVar = new d(context, u5Var, true);
        this.X = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new c8(this, 1));
        dVar.setEnabled(U(j3Var.getText().toString()));
        frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.K = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        f8 f8Var = new f8(this);
        f8Var.m = false;
        f8Var.C = false;
        f8Var.o(gr.h);
        f8Var.n(350L);
        this.d.setItemAnimator(f8Var);
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.setOnItemClickListener(new ih.f0(this, context, r6Var, 2));
        g8 g8Var = this.T;
        if (g8Var != null) {
            g8Var.N(false);
        }
    }

    public static void O(k8 k8Var, Context context, r6 r6Var, View view, int i9) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.j3 j3Var = k8Var.V;
        org.telegram.ui.Cells.j3 j3Var2 = k8Var.U;
        l41 G = k8Var.T.G(i9 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(i8.class) || (webPage = k8Var.c0) == null || V(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.t8)) {
                boolean z10 = !k8Var.i0;
                k8Var.i0 = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                k8Var.T.N(true);
                if (k8Var.i0) {
                    j3Var.requestFocus();
                    return;
                } else {
                    j3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        yf.t2 t2Var = new yf.t2(context, k8Var.currentAccount);
        yf.m0 m0Var = new yf.m0();
        m0Var.c = j3Var2.b.getText().toString();
        m0Var.b = k8Var.i0 ? j3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = k8Var.c0;
        m0Var.d = webPage2;
        m0Var.e = k8Var.k0;
        m0Var.f = k8Var.j0;
        bg.i iVar = new bg.i(k8Var, 29);
        t2Var.C = m0Var;
        int i10 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        bb0 bb0Var = t2Var.x;
        bb0Var.setVisibility(i10);
        t2Var.f.b(t2Var.a, m0Var, false);
        t2Var.w.a(!m0Var.f, false);
        bb0Var.a(!m0Var.e, false);
        t2Var.D = iVar;
        t2Var.e.setImageDrawable(new w3(r6Var, 8));
        t2Var.show();
    }

    public static /* synthetic */ void P(k8 k8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = k8Var.U.b.getText().toString();
        k8Var.e0 = ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(getwebpagepreview, new bf.a(k8Var, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void Q(k8 k8Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        g8 g8Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(k8Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(k8Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    k8Var.c0 = webPage;
                    if (V(webPage)) {
                        TLRPC.WebPage webPage2 = k8Var.c0;
                        k8Var.b0 = webPage2 == null ? 0L : webPage2.id;
                        k8Var.c0 = null;
                    } else {
                        k8Var.b0 = 0L;
                    }
                } else {
                    k8Var.c0 = null;
                    k8Var.b0 = 0L;
                }
                k8Var.d0 = k8Var.b0 != 0;
                g8Var = k8Var.T;
                if (g8Var == null) {
                    g8Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        k8Var.d0 = k8Var.b0 != 0;
        g8Var = k8Var.T;
        if (g8Var == null) {
        }
    }

    public static void R(k8 k8Var, String str) {
        d8 d8Var = k8Var.g0;
        if (str == null || TextUtils.equals(str, k8Var.f0)) {
            return;
        }
        k8Var.f0 = str;
        boolean U = k8Var.U(str);
        AndroidUtilities.cancelRunOnUIThread(d8Var);
        if (U) {
            if (!k8Var.d0 || k8Var.c0 != null) {
                k8Var.d0 = true;
                k8Var.c0 = null;
                g8 g8Var = k8Var.T;
                if (g8Var != null) {
                    g8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(d8Var, 700L);
        } else if (k8Var.d0 || k8Var.c0 != null) {
            k8Var.d0 = false;
            k8Var.c0 = null;
            if (k8Var.e0 != 0) {
                ConnectionsManager.getInstance(k8Var.currentAccount).cancelRequest(k8Var.e0, true);
                k8Var.e0 = 0;
            }
            g8 g8Var2 = k8Var.T;
            if (g8Var2 != null) {
                g8Var2.N(true);
            }
        }
        k8Var.X.setEnabled(U);
    }

    public static boolean V(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    public final void T() {
        this.d0 = false;
        this.c0 = null;
        if (this.e0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e0, true);
            this.e0 = 0;
        }
        g8 g8Var = this.T;
        if (g8Var != null) {
            g8Var.N(true);
        }
    }

    public final boolean U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.h0 == null) {
            this.h0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.h0.matcher(str).find();
    }

    public final void W() {
        if (this.X.S) {
            if (this.a0 != null) {
                yf.m0 m0Var = new yf.m0();
                m0Var.c = this.U.b.getText().toString();
                m0Var.b = this.i0 ? this.V.b.getText().toString() : null;
                m0Var.d = this.c0;
                m0Var.e = this.k0;
                m0Var.f = this.j0;
                this.a0.run(m0Var);
                this.a0 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.didReceivedWebpagesInUpdates || this.b0 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
            if (webPage != null && this.b0 == webPage.id) {
                if (V(webPage)) {
                    webPage = null;
                }
                this.c0 = webPage;
                this.d0 = false;
                this.b0 = 0L;
                g8 g8Var = this.T;
                if (g8Var != null) {
                    g8Var.N(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.U.b);
        AndroidUtilities.hideKeyboard(this.V.b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new d8(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        g8 g8Var = new g8(this.d, getContext(), this.currentAccount, 0, true, new b8(this, 0), this.resourcesProvider);
        this.T = g8Var;
        return g8Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
