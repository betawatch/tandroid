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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class t8 extends org.telegram.ui.Components.cb implements NotificationCenter.NotificationCenterDelegate {
    public p8 X;
    public final org.telegram.ui.Cells.j3 Y;
    public final org.telegram.ui.Cells.j3 Z;
    public final FrameLayout a0;
    public final d b0;
    public boolean c0;
    public boolean d0;
    public ai.g3 e0;
    public long f0;
    public TLRPC.WebPage g0;
    public boolean h0;
    public int i0;
    public String j0;
    public final m8 k0;
    public Pattern l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public t8(Context context, d6 d6Var, b7 b7Var, ai.g3 g3Var) {
        super(context, null, true, true, 2, d6Var);
        this.k0 = new m8(this, 0);
        this.e0 = g3Var;
        fixNavigationBar();
        I();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d6Var);
        this.Y = j3Var;
        m8 m8Var = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(m8Var, 2));
        h3Var.setHandlesColor(-12476440);
        h3Var.setCursorColor(-11230757);
        h3Var.setText("https://");
        h3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.d(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.i6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.b6.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, w7.z5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ai.ba baVar = new ai.ba(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, baVar));
        baVar.run();
        h3Var.addTextChangedListener(new n8(this, baVar));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d6Var);
        this.Z = j3Var2;
        m8 m8Var2 = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(m8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        d dVar = new d(context, d6Var, true);
        this.b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new l8(this, 1));
        dVar.setEnabled(T(j3Var.getText().toString()));
        frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        o8 o8Var = new o8(this);
        o8Var.m = false;
        o8Var.C = false;
        o8Var.o(tr.h);
        o8Var.n(350L);
        this.d.setItemAnimator(o8Var);
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, b7Var, 2));
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(false);
        }
    }

    public static void N(t8 t8Var, Context context, b7 b7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.j3 j3Var = t8Var.Z;
        org.telegram.ui.Cells.j3 j3Var2 = t8Var.Y;
        h61 G = t8Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.H(r8.class) || (webPage = t8Var.g0) == null || U(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.w8)) {
                boolean z10 = !t8Var.m0;
                t8Var.m0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                t8Var.X.N(true);
                if (t8Var.m0) {
                    j3Var.requestFocus();
                    return;
                } else {
                    j3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        qg.t2 t2Var = new qg.t2(context, t8Var.currentAccount);
        qg.n0 n0Var = new qg.n0();
        n0Var.c = j3Var2.b.getText().toString();
        n0Var.b = t8Var.m0 ? j3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = t8Var.g0;
        n0Var.d = webPage2;
        n0Var.e = t8Var.o0;
        n0Var.f = t8Var.n0;
        ai.y1 y1Var = new ai.y1(t8Var, 15);
        t2Var.G = n0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        hc0 hc0Var = t2Var.x;
        hc0Var.setVisibility(i11);
        t2Var.f.b(t2Var.a, n0Var, false);
        t2Var.w.a(!n0Var.f, false);
        hc0Var.a(!n0Var.e, false);
        t2Var.H = y1Var;
        t2Var.e.setImageDrawable(new d4(b7Var, 8));
        t2Var.show();
    }

    public static /* synthetic */ void O(t8 t8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = t8Var.Y.b.getText().toString();
        t8Var.i0 = ConnectionsManager.getInstance(t8Var.currentAccount).sendRequest(getwebpagepreview, new ai.n8(t8Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void P(t8 t8Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        p8 p8Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(t8Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(t8Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    t8Var.g0 = webPage;
                    if (U(webPage)) {
                        TLRPC.WebPage webPage2 = t8Var.g0;
                        t8Var.f0 = webPage2 == null ? 0L : webPage2.id;
                        t8Var.g0 = null;
                    } else {
                        t8Var.f0 = 0L;
                    }
                } else {
                    t8Var.g0 = null;
                    t8Var.f0 = 0L;
                }
                t8Var.h0 = t8Var.f0 != 0;
                p8Var = t8Var.X;
                if (p8Var == null) {
                    p8Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        t8Var.h0 = t8Var.f0 != 0;
        p8Var = t8Var.X;
        if (p8Var == null) {
        }
    }

    public static void Q(t8 t8Var, String str) {
        m8 m8Var = t8Var.k0;
        if (str == null || TextUtils.equals(str, t8Var.j0)) {
            return;
        }
        t8Var.j0 = str;
        boolean T = t8Var.T(str);
        AndroidUtilities.cancelRunOnUIThread(m8Var);
        if (T) {
            if (!t8Var.h0 || t8Var.g0 != null) {
                t8Var.h0 = true;
                t8Var.g0 = null;
                p8 p8Var = t8Var.X;
                if (p8Var != null) {
                    p8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(m8Var, 700L);
        } else if (t8Var.h0 || t8Var.g0 != null) {
            t8Var.h0 = false;
            t8Var.g0 = null;
            if (t8Var.i0 != 0) {
                ConnectionsManager.getInstance(t8Var.currentAccount).cancelRequest(t8Var.i0, true);
                t8Var.i0 = 0;
            }
            p8 p8Var2 = t8Var.X;
            if (p8Var2 != null) {
                p8Var2.N(true);
            }
        }
        t8Var.b0.setEnabled(T);
    }

    public static boolean U(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    public final void S() {
        this.h0 = false;
        this.g0 = null;
        if (this.i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.i0, true);
            this.i0 = 0;
        }
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(true);
        }
    }

    public final boolean T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.l0 == null) {
            this.l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.l0.matcher(str).find();
    }

    public final void W() {
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
                if (U(webPage)) {
                    webPage = null;
                }
                this.g0 = webPage;
                this.h0 = false;
                this.f0 = 0L;
                p8 p8Var = this.X;
                if (p8Var != null) {
                    p8Var.N(true);
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
        AndroidUtilities.runOnUIThread(new m8(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        p8 p8Var = new p8(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = p8Var;
        return p8Var;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
