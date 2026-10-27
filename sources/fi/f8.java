package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public b8 X;
    public final org.telegram.ui.Cells.g3 Y;
    public final org.telegram.ui.Cells.g3 Z;
    public final FrameLayout a0;
    public final d b0;
    public boolean c0;
    public boolean d0;
    public ai.n1 e0;
    public long f0;
    public TLRPC.WebPage g0;
    public boolean h0;
    public int i0;
    public String j0;
    public final y7 k0;
    public Pattern l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public f8(Context context, s5 s5Var, o6 o6Var, ai.n1 n1Var) {
        super(context, null, true, true, 2, s5Var);
        this.k0 = new y7(this, 0);
        this.e0 = n1Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, s5Var);
        this.Y = g3Var;
        g3Var.d(new y7(this, 1));
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setHandlesColor(-12476440);
        e3Var.setCursorColor(-11230757);
        e3Var.setText("https://");
        e3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        ic.a.o(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.d3.h(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.y6.o6;
        int themedColor = getThemedColor(i10);
        org.telegram.ui.ActionBar.f7.V(textView, i10, s5Var);
        int dp = AndroidUtilities.dp(6.0f);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.12f, themedColor);
        int o13 = org.telegram.ui.ActionBar.y6.o1(0.15f, themedColor);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o12, o13, o13);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i10);
        org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.15f, i10);
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView, j02, L, L2, s5Var);
        kb1.c(textView, 0.1f, 1.5f);
        g3Var.addView(textView, kb1.h(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        e2.q0 q0Var = new e2.q0(19, this, textView);
        textView.setOnClickListener(new bi.q(15, this, q0Var));
        q0Var.run();
        e3Var.addTextChangedListener(new z7(this, q0Var));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, s5Var);
        this.Z = g3Var2;
        g3Var2.d(new y7(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        d dVar = new d(context, s5Var, true);
        this.b0 = dVar;
        dVar.i(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new x7(this, 1));
        dVar.setEnabled(V(g3Var.getText().toString()));
        frameLayout.addView(dVar, kb1.h(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        a8 a8Var = new a8(this);
        a8Var.m = false;
        a8Var.C = false;
        a8Var.o(ds.h);
        a8Var.n(350L);
        this.d.setItemAnimator(a8Var);
        nm0 nm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new di.g0(this, context, o6Var, 2));
        b8 b8Var = this.X;
        if (b8Var != null) {
            b8Var.O(false);
        }
    }

    public static void P(f8 f8Var, Context context, o6 o6Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.g3 g3Var = f8Var.Z;
        org.telegram.ui.Cells.g3 g3Var2 = f8Var.Y;
        u61 G = f8Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.H(d8.class) || (webPage = f8Var.g0) == null || W(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.a9)) {
                boolean z10 = !f8Var.m0;
                f8Var.m0 = z10;
                ((org.telegram.ui.Cells.a9) view).setChecked(z10);
                f8Var.X.O(true);
                if (f8Var.m0) {
                    g3Var.requestFocus();
                    return;
                } else {
                    g3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        sg.u2 u2Var = new sg.u2(context, f8Var.currentAccount);
        sg.n0 n0Var = new sg.n0();
        n0Var.c = g3Var2.d.getText().toString();
        n0Var.b = f8Var.m0 ? g3Var.d.getText().toString() : null;
        TLRPC.WebPage webPage2 = f8Var.g0;
        n0Var.d = webPage2;
        n0Var.e = f8Var.o0;
        n0Var.f = f8Var.n0;
        ai.i iVar = new ai.i(f8Var, 25);
        u2Var.G = n0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        nc0 nc0Var = u2Var.x;
        nc0Var.setVisibility(i11);
        u2Var.f.b(u2Var.a, n0Var, false);
        u2Var.w.a(!n0Var.f, false);
        nc0Var.a(!n0Var.e, false);
        u2Var.H = iVar;
        u2Var.e.setImageDrawable(new u3(o6Var, 8));
        u2Var.show();
    }

    public static /* synthetic */ void Q(f8 f8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = f8Var.Y.d.getText().toString();
        f8Var.i0 = ConnectionsManager.getInstance(f8Var.currentAccount).sendRequest(getwebpagepreview, new bi.i0(f8Var, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void R(f8 f8Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        b8 b8Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(f8Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(f8Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    f8Var.g0 = webPage;
                    if (W(webPage)) {
                        TLRPC.WebPage webPage2 = f8Var.g0;
                        f8Var.f0 = webPage2 == null ? 0L : webPage2.id;
                        f8Var.g0 = null;
                    } else {
                        f8Var.f0 = 0L;
                    }
                } else {
                    f8Var.g0 = null;
                    f8Var.f0 = 0L;
                }
                f8Var.h0 = f8Var.f0 != 0;
                b8Var = f8Var.X;
                if (b8Var == null) {
                    b8Var.O(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        f8Var.h0 = f8Var.f0 != 0;
        b8Var = f8Var.X;
        if (b8Var == null) {
        }
    }

    public static void S(f8 f8Var, String str) {
        y7 y7Var = f8Var.k0;
        if (str == null || TextUtils.equals(str, f8Var.j0)) {
            return;
        }
        f8Var.j0 = str;
        boolean V = f8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(y7Var);
        if (V) {
            if (!f8Var.h0 || f8Var.g0 != null) {
                f8Var.h0 = true;
                f8Var.g0 = null;
                b8 b8Var = f8Var.X;
                if (b8Var != null) {
                    b8Var.O(true);
                }
            }
            AndroidUtilities.runOnUIThread(y7Var, 700L);
        } else if (f8Var.h0 || f8Var.g0 != null) {
            f8Var.h0 = false;
            f8Var.g0 = null;
            if (f8Var.i0 != 0) {
                ConnectionsManager.getInstance(f8Var.currentAccount).cancelRequest(f8Var.i0, true);
                f8Var.i0 = 0;
            }
            b8 b8Var2 = f8Var.X;
            if (b8Var2 != null) {
                b8Var2.O(true);
            }
        }
        f8Var.b0.setEnabled(V);
    }

    public static boolean W(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    public final void U() {
        this.h0 = false;
        this.g0 = null;
        if (this.i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.i0, true);
            this.i0 = 0;
        }
        b8 b8Var = this.X;
        if (b8Var != null) {
            b8Var.O(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.l0 == null) {
            this.l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.l0.matcher(str).find();
    }

    public final void X() {
        if (this.b0.c0) {
            if (this.e0 != null) {
                sg.n0 n0Var = new sg.n0();
                n0Var.c = this.Y.d.getText().toString();
                n0Var.b = this.m0 ? this.Z.d.getText().toString() : null;
                n0Var.d = this.g0;
                n0Var.e = this.o0;
                n0Var.f = this.n0;
                this.e0.run(n0Var);
                this.e0 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates || this.f0 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i12 = 0; i12 < hVar.m(); i12++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
            if (webPage != null && this.f0 == webPage.id) {
                if (W(webPage)) {
                    webPage = null;
                }
                this.g0 = webPage;
                this.h0 = false;
                this.f0 = 0L;
                b8 b8Var = this.X;
                if (b8Var != null) {
                    b8Var.O(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.d);
        AndroidUtilities.hideKeyboard(this.Z.d);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new y7(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        b8 b8Var = new b8(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 21), this.resourcesProvider);
        this.X = b8Var;
        return b8Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
