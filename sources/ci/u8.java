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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.tb0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class u8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public q8 X;
    public final org.telegram.ui.Cells.i3 Y;
    public final org.telegram.ui.Cells.i3 Z;
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
    public final n8 k0;
    public Pattern l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public u8(Context context, d6 d6Var, b7 b7Var, ai.g3 g3Var) {
        super(context, null, true, true, 2, d6Var);
        this.k0 = new n8(this, 0);
        this.e0 = g3Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d6Var);
        this.Y = i3Var;
        n8 n8Var = new n8(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var.b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.s2(n8Var, 2));
        g3Var2.setHandlesColor(-12476440);
        g3Var2.setCursorColor(-11230757);
        g3Var2.setText("https://");
        g3Var2.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.q3.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.h6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.z5.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, w7.x5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ai.ba baVar = new ai.ba(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, baVar));
        baVar.run();
        g3Var2.addTextChangedListener(new o8(this, baVar));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d6Var);
        this.Z = i3Var2;
        n8 n8Var2 = new n8(this, 1);
        org.telegram.ui.Cells.g3 g3Var3 = i3Var2.b;
        g3Var3.setImeOptions(6);
        g3Var3.setOnEditorActionListener(new m.s2(n8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        d dVar = new d(context, d6Var, true);
        this.b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new m8(this, 1));
        dVar.setEnabled(V(i3Var.getText().toString()));
        frameLayout.addView(dVar, w7.x5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        p8 p8Var = new p8(this);
        p8Var.m = false;
        p8Var.C = false;
        p8Var.o(rr.h);
        p8Var.n(350L);
        this.d.setItemAnimator(p8Var);
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, b7Var, 2));
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(false);
        }
    }

    public static void P(u8 u8Var, Context context, b7 b7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.i3 i3Var = u8Var.Z;
        org.telegram.ui.Cells.i3 i3Var2 = u8Var.Y;
        h51 G = u8Var.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(s8.class) || (webPage = u8Var.g0) == null || W(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.x8)) {
                boolean z10 = !u8Var.m0;
                u8Var.m0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                u8Var.X.N(true);
                if (u8Var.m0) {
                    i3Var.requestFocus();
                    return;
                } else {
                    i3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        qg.v2 v2Var = new qg.v2(context, u8Var.currentAccount);
        qg.q0 q0Var = new qg.q0();
        q0Var.c = i3Var2.b.getText().toString();
        q0Var.b = u8Var.m0 ? i3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = u8Var.g0;
        q0Var.d = webPage2;
        q0Var.e = u8Var.o0;
        q0Var.f = u8Var.n0;
        ai.y1 y1Var = new ai.y1(u8Var, 15);
        v2Var.G = q0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        tb0 tb0Var = v2Var.x;
        tb0Var.setVisibility(i11);
        v2Var.f.b(v2Var.a, q0Var, false);
        v2Var.w.a(!q0Var.f, false);
        tb0Var.a(!q0Var.e, false);
        v2Var.H = y1Var;
        v2Var.e.setImageDrawable(new d4(b7Var, 8));
        v2Var.show();
    }

    public static /* synthetic */ void Q(u8 u8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = u8Var.Y.b.getText().toString();
        u8Var.i0 = ConnectionsManager.getInstance(u8Var.currentAccount).sendRequest(getwebpagepreview, new ai.n8(u8Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void R(u8 u8Var, TLObject tLObject) {
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
                    if (W(webPage)) {
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

    public static void S(u8 u8Var, String str) {
        n8 n8Var = u8Var.k0;
        if (str == null || TextUtils.equals(str, u8Var.j0)) {
            return;
        }
        u8Var.j0 = str;
        boolean V = u8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(n8Var);
        if (V) {
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
        u8Var.b0.setEnabled(V);
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
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(true);
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
                qg.q0 q0Var = new qg.q0();
                q0Var.c = this.Y.b.getText().toString();
                q0Var.b = this.m0 ? this.Z.b.getText().toString() : null;
                q0Var.d = this.g0;
                q0Var.e = this.o0;
                q0Var.f = this.n0;
                this.e0.run(q0Var);
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

    @Override // org.telegram.ui.Components.bb
    public final ll0 v(ml0 ml0Var) {
        q8 q8Var = new q8(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = q8Var;
        return q8Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
