package nh;

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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y7 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public u7 T;
    public final org.telegram.ui.Cells.g3 U;
    public final org.telegram.ui.Cells.g3 V;
    public final FrameLayout W;
    public final d X;
    public boolean Y;
    public boolean Z;
    public ih.b1 a0;
    public long b0;
    public TLRPC.WebPage c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final q7 g0;
    public Pattern h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;

    public y7(Context context, h5 h5Var, f6 f6Var, ih.b1 b1Var) {
        super(context, null, true, false, false, false, true, 2, h5Var);
        this.g0 = new q7(this, 0);
        this.a0 = b1Var;
        fixNavigationBar();
        J();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, h5Var);
        this.U = g3Var;
        q7 q7Var = new q7(this, 1);
        org.telegram.ui.Cells.e3 e3Var = g3Var.b;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new m.u2(q7Var, 2));
        e3Var.setHandlesColor(-12476440);
        e3Var.setCursorColor(-11230757);
        e3Var.setText("https://");
        e3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        th.n(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.g6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, l1, l12, l12));
        i7.h6.b(textView, 0.1f, 1.5f);
        g3Var.addView(textView, i7.f6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        b6 b6Var = new b6(10, this, textView);
        textView.setOnClickListener(new r7(0, this, b6Var));
        b6Var.run();
        e3Var.addTextChangedListener(new s7(this, b6Var));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, h5Var);
        this.V = g3Var2;
        q7 q7Var2 = new q7(this, 1);
        org.telegram.ui.Cells.e3 e3Var2 = g3Var2.b;
        e3Var2.setImeOptions(6);
        e3Var2.setOnEditorActionListener(new m.u2(q7Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        d dVar = new d(context, h5Var, true);
        this.X = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new p7(this, 1));
        dVar.setEnabled(V(g3Var.getText().toString()));
        frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.K = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        t7 t7Var = new t7(this);
        t7Var.m = false;
        t7Var.C = false;
        t7Var.o(jr.h);
        t7Var.n(350L);
        this.d.setItemAnimator(t7Var);
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new lh.d0(this, context, f6Var, 2));
        u7 u7Var = this.T;
        if (u7Var != null) {
            u7Var.N(false);
        }
    }

    public static void P(y7 y7Var, Context context, f6 f6Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.g3 g3Var = y7Var.V;
        org.telegram.ui.Cells.g3 g3Var2 = y7Var.U;
        w41 G = y7Var.T.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(w7.class) || (webPage = y7Var.c0) == null || W(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.q8)) {
                boolean z10 = !y7Var.i0;
                y7Var.i0 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                y7Var.T.N(true);
                if (y7Var.i0) {
                    g3Var.requestFocus();
                    return;
                } else {
                    g3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        bg.c4 c4Var = new bg.c4(context, y7Var.currentAccount);
        bg.h1 h1Var = new bg.h1();
        h1Var.c = g3Var2.b.getText().toString();
        h1Var.b = y7Var.i0 ? g3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = y7Var.c0;
        h1Var.d = webPage2;
        h1Var.e = y7Var.k0;
        h1Var.f = y7Var.j0;
        b0 b0Var = new b0(y7Var, 6);
        c4Var.C = h1Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        qb0 qb0Var = c4Var.x;
        qb0Var.setVisibility(i11);
        c4Var.f.b(c4Var.a, h1Var, false);
        c4Var.w.a(!h1Var.f, false);
        qb0Var.a(!h1Var.e, false);
        c4Var.D = b0Var;
        c4Var.e.setImageDrawable(new bg.m1(f6Var, 1));
        c4Var.show();
    }

    public static /* synthetic */ void Q(y7 y7Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = y7Var.U.b.getText().toString();
        y7Var.e0 = ConnectionsManager.getInstance(y7Var.currentAccount).sendRequest(getwebpagepreview, new ef.a(y7Var, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void R(y7 y7Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        u7 u7Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(y7Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(y7Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    y7Var.c0 = webPage;
                    if (W(webPage)) {
                        TLRPC.WebPage webPage2 = y7Var.c0;
                        y7Var.b0 = webPage2 == null ? 0L : webPage2.id;
                        y7Var.c0 = null;
                    } else {
                        y7Var.b0 = 0L;
                    }
                } else {
                    y7Var.c0 = null;
                    y7Var.b0 = 0L;
                }
                y7Var.d0 = y7Var.b0 != 0;
                u7Var = y7Var.T;
                if (u7Var == null) {
                    u7Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        y7Var.d0 = y7Var.b0 != 0;
        u7Var = y7Var.T;
        if (u7Var == null) {
        }
    }

    public static void S(y7 y7Var, String str) {
        q7 q7Var = y7Var.g0;
        if (str == null || TextUtils.equals(str, y7Var.f0)) {
            return;
        }
        y7Var.f0 = str;
        boolean V = y7Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(q7Var);
        if (V) {
            if (!y7Var.d0 || y7Var.c0 != null) {
                y7Var.d0 = true;
                y7Var.c0 = null;
                u7 u7Var = y7Var.T;
                if (u7Var != null) {
                    u7Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(q7Var, 700L);
        } else if (y7Var.d0 || y7Var.c0 != null) {
            y7Var.d0 = false;
            y7Var.c0 = null;
            if (y7Var.e0 != 0) {
                ConnectionsManager.getInstance(y7Var.currentAccount).cancelRequest(y7Var.e0, true);
                y7Var.e0 = 0;
            }
            u7 u7Var2 = y7Var.T;
            if (u7Var2 != null) {
                u7Var2.N(true);
            }
        }
        y7Var.X.setEnabled(V);
    }

    public static boolean W(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    public final void U() {
        this.d0 = false;
        this.c0 = null;
        if (this.e0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e0, true);
            this.e0 = 0;
        }
        u7 u7Var = this.T;
        if (u7Var != null) {
            u7Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.h0 == null) {
            this.h0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.h0.matcher(str).find();
    }

    public final void X() {
        if (this.X.S) {
            if (this.a0 != null) {
                bg.h1 h1Var = new bg.h1();
                h1Var.c = this.U.b.getText().toString();
                h1Var.b = this.i0 ? this.V.b.getText().toString() : null;
                h1Var.d = this.c0;
                h1Var.e = this.k0;
                h1Var.f = this.j0;
                this.a0.run(h1Var);
                this.a0 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates || this.b0 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i12 = 0; i12 < hVar.m(); i12++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
            if (webPage != null && this.b0 == webPage.id) {
                if (W(webPage)) {
                    webPage = null;
                }
                this.c0 = webPage;
                this.d0 = false;
                this.b0 = 0L;
                u7 u7Var = this.T;
                if (u7Var != null) {
                    u7Var.N(true);
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
        AndroidUtilities.runOnUIThread(new q7(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        u7 u7Var = new u7(this.d, getContext(), this.currentAccount, 0, true, new t4(this, 1), this.resourcesProvider);
        this.T = u7Var;
        return u7Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
