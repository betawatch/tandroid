package ci;

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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.uc0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class u8 extends org.telegram.ui.Components.eb implements NotificationCenter.NotificationCenterDelegate {
    public q8 X;
    public final org.telegram.ui.Cells.j3 Y;
    public final org.telegram.ui.Cells.j3 Z;
    public final FrameLayout a0;
    public final d b0;
    public boolean c0;
    public boolean d0;
    public ai.h3 e0;
    public long f0;
    public TLRPC.WebPage g0;
    public boolean h0;
    public int i0;
    public String j0;
    public final n8 k0;
    public Pattern l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public u8(Context context, d6 d6Var, b7 b7Var, ai.h3 h3Var) {
        super(context, null, true, true, 2, d6Var);
        this.k0 = new n8(this, 0);
        this.e0 = h3Var;
        fixNavigationBar();
        L();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d6Var);
        this.Y = j3Var;
        n8 n8Var = new n8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(n8Var, 2));
        h3Var2.setHandlesColor(-12476440);
        h3Var2.setCursorColor(-11230757);
        h3Var2.setText("https://");
        h3Var2.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.12f, themedColor);
        int m13 = org.telegram.ui.ActionBar.i6.m1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, m12, m13, m13));
        w7.z5.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, w7.x5.a(26.0f, 0.0f, 4.0f, 24.0f, 3.0f, -2, 21));
        ai.ca caVar = new ai.ca(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, caVar));
        caVar.run();
        h3Var2.addTextChangedListener(new o8(this, caVar));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d6Var);
        this.Z = j3Var2;
        n8 n8Var2 = new n8(this, 1);
        org.telegram.ui.Cells.h3 h3Var3 = j3Var2.b;
        h3Var3.setImeOptions(6);
        h3Var3.setOnEditorActionListener(new m.s2(n8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        d dVar = new d(context, d6Var, true);
        this.b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new m8(this, 1));
        dVar.setEnabled(W(j3Var.getText().toString()));
        frameLayout.addView(dVar, w7.x5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 119));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        p8 p8Var = new p8(this);
        p8Var.m = false;
        p8Var.C = false;
        p8Var.o(hs.h);
        p8Var.n(350L);
        this.d.setItemAnimator(p8Var);
        qm0 qm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, b7Var, 2));
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(false);
        }
    }

    public static void Q(u8 u8Var, Context context, b7 b7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.j3 j3Var = u8Var.Z;
        org.telegram.ui.Cells.j3 j3Var2 = u8Var.Y;
        p61 G = u8Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(s8.class) || (webPage = u8Var.g0) == null || X(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.w8)) {
                boolean z10 = !u8Var.m0;
                u8Var.m0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                u8Var.X.N(true);
                if (u8Var.m0) {
                    j3Var.requestFocus();
                    return;
                } else {
                    j3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        qg.u2 u2Var = new qg.u2(context, u8Var.currentAccount);
        qg.n0 n0Var = new qg.n0();
        n0Var.c = j3Var2.b.getText().toString();
        n0Var.b = u8Var.m0 ? j3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = u8Var.g0;
        n0Var.d = webPage2;
        n0Var.e = u8Var.o0;
        n0Var.f = u8Var.n0;
        ai.y1 y1Var = new ai.y1(u8Var, 15);
        u2Var.G = n0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        uc0 uc0Var = u2Var.x;
        uc0Var.setVisibility(i11);
        u2Var.f.b(u2Var.a, n0Var, false);
        u2Var.w.a(!n0Var.f, false);
        uc0Var.a(!n0Var.e, false);
        u2Var.H = y1Var;
        u2Var.e.setImageDrawable(new c4(b7Var, 7));
        u2Var.show();
    }

    public static /* synthetic */ void R(u8 u8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = u8Var.Y.b.getText().toString();
        u8Var.i0 = ConnectionsManager.getInstance(u8Var.currentAccount).sendRequest(getwebpagepreview, new ai.o8(u8Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void S(u8 u8Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        q8 q8Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(u8Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(u8Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    u8Var.g0 = webPage;
                    if (X(webPage)) {
                        TLRPC.WebPage webPage2 = u8Var.g0;
                        u8Var.f0 = webPage2 == null ? 0L : webPage2.id;
                        u8Var.g0 = null;
                    } else {
                        u8Var.f0 = 0L;
                    }
                } else {
                    u8Var.g0 = null;
                    u8Var.f0 = 0L;
                }
                u8Var.h0 = u8Var.f0 != 0;
                q8Var = u8Var.X;
                if (q8Var == null) {
                    q8Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        u8Var.h0 = u8Var.f0 != 0;
        q8Var = u8Var.X;
        if (q8Var == null) {
        }
    }

    public static void T(u8 u8Var, String str) {
        n8 n8Var = u8Var.k0;
        if (str == null || TextUtils.equals(str, u8Var.j0)) {
            return;
        }
        u8Var.j0 = str;
        boolean W = u8Var.W(str);
        AndroidUtilities.cancelRunOnUIThread(n8Var);
        if (W) {
            if (!u8Var.h0 || u8Var.g0 != null) {
                u8Var.h0 = true;
                u8Var.g0 = null;
                q8 q8Var = u8Var.X;
                if (q8Var != null) {
                    q8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(n8Var, 700L);
        } else if (u8Var.h0 || u8Var.g0 != null) {
            u8Var.h0 = false;
            u8Var.g0 = null;
            if (u8Var.i0 != 0) {
                ConnectionsManager.getInstance(u8Var.currentAccount).cancelRequest(u8Var.i0, true);
                u8Var.i0 = 0;
            }
            q8 q8Var2 = u8Var.X;
            if (q8Var2 != null) {
                q8Var2.N(true);
            }
        }
        u8Var.b0.setEnabled(W);
    }

    public static boolean X(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }

    public final void V() {
        this.h0 = false;
        this.g0 = null;
        if (this.i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.i0, true);
            this.i0 = 0;
        }
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(true);
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
                qg.n0 n0Var = new qg.n0();
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
        a0.i iVar = (a0.i) objArr[0];
        for (int i12 = 0; i12 < iVar.m(); i12++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
            if (webPage != null && this.f0 == webPage.id) {
                if (X(webPage)) {
                    webPage = null;
                }
                this.g0 = webPage;
                this.h0 = false;
                this.f0 = 0L;
                q8 q8Var = this.X;
                if (q8Var != null) {
                    q8Var.N(true);
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
        AndroidUtilities.runOnUIThread(new n8(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.eb
    public final pm0 x(qm0 qm0Var) {
        q8 q8Var = new q8(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = q8Var;
        return q8Var;
    }
}
