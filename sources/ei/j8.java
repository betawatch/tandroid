package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.nc0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class j8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public f8 X;
    public final org.telegram.ui.Cells.i3 Y;
    public final org.telegram.ui.Cells.i3 Z;
    public final FrameLayout a0;
    public final d b0;
    public boolean c0;
    public boolean d0;
    public ai.n2 e0;
    public long f0;
    public TLRPC.WebPage g0;
    public boolean h0;
    public int i0;
    public String j0;
    public final c8 k0;
    public Pattern l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public j8(Context context, t5 t5Var, r6 r6Var, ai.n2 n2Var) {
        super(context, null, true, true, 2, t5Var);
        this.k0 = new c8(this, 0);
        this.e0 = n2Var;
        fixNavigationBar();
        L();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, t5Var);
        this.Y = i3Var;
        c8 c8Var = new c8(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.t2(c8Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, themedColor);
        int m13 = org.telegram.ui.ActionBar.h6.m1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
        w7.b6.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, w7.z5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        p6 p6Var = new p6(8, this, textView);
        textView.setOnClickListener(new ai.p(15, this, p6Var));
        p6Var.run();
        g3Var.addTextChangedListener(new d8(this, p6Var));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, t5Var);
        this.Z = i3Var2;
        c8 c8Var2 = new c8(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.t2(c8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        d dVar = new d(context, t5Var, true);
        this.b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new b8(this, 1));
        dVar.setEnabled(W(i3Var.getText().toString()));
        frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        e8 e8Var = new e8(this);
        e8Var.m = false;
        e8Var.C = false;
        e8Var.o(bs.h);
        e8Var.n(350L);
        this.d.setItemAnimator(e8Var);
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ci.g0(this, context, r6Var, 2));
        f8 f8Var = this.X;
        if (f8Var != null) {
            f8Var.N(false);
        }
    }

    public static void Q(j8 j8Var, Context context, r6 r6Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.i3 i3Var = j8Var.Z;
        org.telegram.ui.Cells.i3 i3Var2 = j8Var.Y;
        f61 G = j8Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(h8.class) || (webPage = j8Var.g0) == null || X(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.v8)) {
                boolean z10 = !j8Var.m0;
                j8Var.m0 = z10;
                ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                j8Var.X.N(true);
                if (j8Var.m0) {
                    i3Var.requestFocus();
                    return;
                } else {
                    i3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        rg.s2 s2Var = new rg.s2(context, j8Var.currentAccount);
        rg.n0 n0Var = new rg.n0();
        n0Var.c = i3Var2.b.getText().toString();
        n0Var.b = j8Var.m0 ? i3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = j8Var.g0;
        n0Var.d = webPage2;
        n0Var.e = j8Var.o0;
        n0Var.f = j8Var.n0;
        ai.r0 r0Var = new ai.r0(j8Var, 21);
        s2Var.G = n0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        nc0 nc0Var = s2Var.x;
        nc0Var.setVisibility(i11);
        s2Var.f.b(s2Var.a, n0Var, false);
        s2Var.w.a(!n0Var.f, false);
        nc0Var.a(!n0Var.e, false);
        s2Var.H = r0Var;
        s2Var.e.setImageDrawable(new w3(r6Var, 7));
        s2Var.show();
    }

    public static /* synthetic */ void R(j8 j8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = j8Var.Y.b.getText().toString();
        j8Var.i0 = ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(getwebpagepreview, new ai.h(j8Var, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void S(j8 j8Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        f8 f8Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(j8Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(j8Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    j8Var.g0 = webPage;
                    if (X(webPage)) {
                        TLRPC.WebPage webPage2 = j8Var.g0;
                        j8Var.f0 = webPage2 == null ? 0L : webPage2.id;
                        j8Var.g0 = null;
                    } else {
                        j8Var.f0 = 0L;
                    }
                } else {
                    j8Var.g0 = null;
                    j8Var.f0 = 0L;
                }
                j8Var.h0 = j8Var.f0 != 0;
                f8Var = j8Var.X;
                if (f8Var == null) {
                    f8Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        j8Var.h0 = j8Var.f0 != 0;
        f8Var = j8Var.X;
        if (f8Var == null) {
        }
    }

    public static void T(j8 j8Var, String str) {
        c8 c8Var = j8Var.k0;
        if (str == null || TextUtils.equals(str, j8Var.j0)) {
            return;
        }
        j8Var.j0 = str;
        boolean W = j8Var.W(str);
        AndroidUtilities.cancelRunOnUIThread(c8Var);
        if (W) {
            if (!j8Var.h0 || j8Var.g0 != null) {
                j8Var.h0 = true;
                j8Var.g0 = null;
                f8 f8Var = j8Var.X;
                if (f8Var != null) {
                    f8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(c8Var, 700L);
        } else if (j8Var.h0 || j8Var.g0 != null) {
            j8Var.h0 = false;
            j8Var.g0 = null;
            if (j8Var.i0 != 0) {
                ConnectionsManager.getInstance(j8Var.currentAccount).cancelRequest(j8Var.i0, true);
                j8Var.i0 = 0;
            }
            f8 f8Var2 = j8Var.X;
            if (f8Var2 != null) {
                f8Var2.N(true);
            }
        }
        j8Var.b0.setEnabled(W);
    }

    public static boolean X(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }

    public final void V() {
        this.h0 = false;
        this.g0 = null;
        if (this.i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.i0, true);
            this.i0 = 0;
        }
        f8 f8Var = this.X;
        if (f8Var != null) {
            f8Var.N(true);
        }
    }

    public final boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.l0 == null) {
            this.l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.l0.matcher(str).find();
    }

    public final void Y() {
        if (this.b0.W) {
            if (this.e0 != null) {
                rg.n0 n0Var = new rg.n0();
                n0Var.c = this.Y.b.getText().toString();
                n0Var.b = this.m0 ? this.Z.b.getText().toString() : null;
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
                if (X(webPage)) {
                    webPage = null;
                }
                this.g0 = webPage;
                this.h0 = false;
                this.f0 = 0L;
                f8 f8Var = this.X;
                if (f8Var != null) {
                    f8Var.N(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.b);
        AndroidUtilities.hideKeyboard(this.Z.b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new c8(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        f8 f8Var = new f8(this.d, getContext(), this.currentAccount, 0, true, new ai.q(this, 18), this.resourcesProvider);
        this.X = f8Var;
        return f8Var;
    }
}
