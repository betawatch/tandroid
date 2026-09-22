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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class x8 extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate {
    public t8 X;
    public final org.telegram.ui.Cells.k3 Y;
    public final org.telegram.ui.Cells.k3 Z;
    public final FrameLayout a0;
    public final d b0;
    public boolean c0;
    public boolean d0;
    public m2 e0;
    public long f0;
    public TLRPC.WebPage g0;
    public boolean h0;
    public int i0;
    public String j0;
    public final q8 k0;
    public Pattern l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public x8(Context context, e6 e6Var, d7 d7Var, m2 m2Var) {
        super(context, null, true, true, 2, e6Var);
        this.k0 = new q8(this, 0);
        this.e0 = m2Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, e6Var);
        this.Y = k3Var;
        q8 q8Var = new q8(this, 1);
        org.telegram.ui.Cells.i3 i3Var = k3Var.b;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.s2(q8Var, 2));
        i3Var.setHandlesColor(-12476440);
        i3Var.setCursorColor(-11230757);
        i3Var.setText("https://");
        i3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.a6.b(textView, 0.1f, 1.5f);
        k3Var.addView(textView, w7.y5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ai.ba baVar = new ai.ba(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, baVar));
        baVar.run();
        i3Var.addTextChangedListener(new r8(this, baVar));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, e6Var);
        this.Z = k3Var2;
        q8 q8Var2 = new q8(this, 1);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var2.b;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.s2(q8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        d dVar = new d(context, e6Var, true);
        this.b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new p8(this, 1));
        dVar.setEnabled(V(k3Var.getText().toString()));
        frameLayout.addView(dVar, w7.y5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        s8 s8Var = new s8(this);
        s8Var.m = false;
        s8Var.C = false;
        s8Var.o(qr.h);
        s8Var.n(350L);
        this.d.setItemAnimator(s8Var);
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, d7Var, 2));
        t8 t8Var = this.X;
        if (t8Var != null) {
            t8Var.N(false);
        }
    }

    public static void P(x8 x8Var, Context context, d7 d7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.k3 k3Var = x8Var.Z;
        org.telegram.ui.Cells.k3 k3Var2 = x8Var.Y;
        y51 G = x8Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(v8.class) || (webPage = x8Var.g0) == null || W(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.x8)) {
                boolean z10 = !x8Var.m0;
                x8Var.m0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                x8Var.X.N(true);
                if (x8Var.m0) {
                    k3Var.requestFocus();
                    return;
                } else {
                    k3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        qg.t2 t2Var = new qg.t2(context, x8Var.currentAccount);
        qg.o0 o0Var = new qg.o0();
        o0Var.c = k3Var2.b.getText().toString();
        o0Var.b = x8Var.m0 ? k3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = x8Var.g0;
        o0Var.d = webPage2;
        o0Var.e = x8Var.o0;
        o0Var.f = x8Var.n0;
        ai.y1 y1Var = new ai.y1(x8Var, 12);
        t2Var.G = o0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        fc0 fc0Var = t2Var.x;
        fc0Var.setVisibility(i11);
        t2Var.f.b(t2Var.a, o0Var, false);
        t2Var.w.a(!o0Var.f, false);
        fc0Var.a(!o0Var.e, false);
        t2Var.H = y1Var;
        t2Var.e.setImageDrawable(new e4(d7Var, 8));
        t2Var.show();
    }

    public static /* synthetic */ void Q(x8 x8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = x8Var.Y.b.getText().toString();
        x8Var.i0 = ConnectionsManager.getInstance(x8Var.currentAccount).sendRequest(getwebpagepreview, new ai.m8(x8Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void R(x8 x8Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        t8 t8Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(x8Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(x8Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    x8Var.g0 = webPage;
                    if (W(webPage)) {
                        TLRPC.WebPage webPage2 = x8Var.g0;
                        x8Var.f0 = webPage2 == null ? 0L : webPage2.id;
                        x8Var.g0 = null;
                    } else {
                        x8Var.f0 = 0L;
                    }
                } else {
                    x8Var.g0 = null;
                    x8Var.f0 = 0L;
                }
                x8Var.h0 = x8Var.f0 != 0;
                t8Var = x8Var.X;
                if (t8Var == null) {
                    t8Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        x8Var.h0 = x8Var.f0 != 0;
        t8Var = x8Var.X;
        if (t8Var == null) {
        }
    }

    public static void S(x8 x8Var, String str) {
        q8 q8Var = x8Var.k0;
        if (str == null || TextUtils.equals(str, x8Var.j0)) {
            return;
        }
        x8Var.j0 = str;
        boolean V = x8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(q8Var);
        if (V) {
            if (!x8Var.h0 || x8Var.g0 != null) {
                x8Var.h0 = true;
                x8Var.g0 = null;
                t8 t8Var = x8Var.X;
                if (t8Var != null) {
                    t8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(q8Var, 700L);
        } else if (x8Var.h0 || x8Var.g0 != null) {
            x8Var.h0 = false;
            x8Var.g0 = null;
            if (x8Var.i0 != 0) {
                ConnectionsManager.getInstance(x8Var.currentAccount).cancelRequest(x8Var.i0, true);
                x8Var.i0 = 0;
            }
            t8 t8Var2 = x8Var.X;
            if (t8Var2 != null) {
                t8Var2.N(true);
            }
        }
        x8Var.b0.setEnabled(V);
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
        t8 t8Var = this.X;
        if (t8Var != null) {
            t8Var.N(true);
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
        if (this.b0.W) {
            if (this.e0 != null) {
                qg.o0 o0Var = new qg.o0();
                o0Var.c = this.Y.b.getText().toString();
                o0Var.b = this.m0 ? this.Z.b.getText().toString() : null;
                o0Var.d = this.g0;
                o0Var.e = this.o0;
                o0Var.f = this.n0;
                this.e0.run(o0Var);
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
                if (W(webPage)) {
                    webPage = null;
                }
                this.g0 = webPage;
                this.h0 = false;
                this.f0 = 0L;
                t8 t8Var = this.X;
                if (t8Var != null) {
                    t8Var.N(true);
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
        AndroidUtilities.runOnUIThread(new q8(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.ab
    public final xl0 v(yl0 yl0Var) {
        t8 t8Var = new t8(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = t8Var;
        return t8Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
