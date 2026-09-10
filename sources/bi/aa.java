package bi;

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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class aa extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate {
    public w9 X;
    public final org.telegram.ui.Cells.i3 Y;
    public final org.telegram.ui.Cells.i3 Z;
    public final FrameLayout a0;
    public final d b0;
    public boolean c0;
    public boolean d0;
    public y2 e0;
    public long f0;
    public TLRPC.WebPage g0;
    public boolean h0;
    public int i0;
    public String j0;
    public final t9 k0;
    public Pattern l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public aa(Context context, d7 d7Var, e8 e8Var, y2 y2Var) {
        super(context, null, true, true, 2, d7Var);
        this.k0 = new t9(this, 0);
        this.e0 = y2Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d7Var);
        this.Y = i3Var;
        t9 t9Var = new t9(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.s2(t9Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.k(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.r6.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.c6.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, w7.a6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        a1.e eVar = new a1.e(25, this, textView);
        textView.setOnClickListener(new n3(1, this, eVar));
        eVar.run();
        g3Var.addTextChangedListener(new u9(this, eVar));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d7Var);
        this.Z = i3Var2;
        t9 t9Var2 = new t9(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.s2(t9Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        d dVar = new d(context, d7Var, true);
        this.b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new s9(this, 1));
        dVar.setEnabled(V(i3Var.getText().toString()));
        frameLayout.addView(dVar, w7.a6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        v9 v9Var = new v9(this);
        v9Var.m = false;
        v9Var.C = false;
        v9Var.o(wr.h);
        v9Var.n(350L);
        this.d.setItemAnimator(v9Var);
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new b9(this, context, e8Var, 1));
        w9 w9Var = this.X;
        if (w9Var != null) {
            w9Var.N(false);
        }
    }

    public static void P(aa aaVar, Context context, e8 e8Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.i3 i3Var = aaVar.Z;
        org.telegram.ui.Cells.i3 i3Var2 = aaVar.Y;
        v51 G = aaVar.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(y9.class) || (webPage = aaVar.g0) == null || W(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.x8)) {
                boolean z10 = !aaVar.m0;
                aaVar.m0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                aaVar.X.N(true);
                if (aaVar.m0) {
                    i3Var.requestFocus();
                    return;
                } else {
                    i3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        pg.t2 t2Var = new pg.t2(context, aaVar.currentAccount);
        pg.n0 n0Var = new pg.n0();
        n0Var.c = i3Var2.b.getText().toString();
        n0Var.b = aaVar.m0 ? i3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = aaVar.g0;
        n0Var.d = webPage2;
        n0Var.e = aaVar.o0;
        n0Var.f = aaVar.n0;
        ai.b bVar = new ai.b(aaVar, 8);
        t2Var.G = n0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        dc0 dc0Var = t2Var.x;
        dc0Var.setVisibility(i11);
        t2Var.f.b(t2Var.a, n0Var, false);
        t2Var.w.a(!n0Var.f, false);
        dc0Var.a(!n0Var.e, false);
        t2Var.H = bVar;
        t2Var.e.setImageDrawable(new w4(e8Var, 8));
        t2Var.show();
    }

    public static /* synthetic */ void Q(aa aaVar) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = aaVar.Y.b.getText().toString();
        aaVar.i0 = ConnectionsManager.getInstance(aaVar.currentAccount).sendRequest(getwebpagepreview, new c2(aaVar, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void R(aa aaVar, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        w9 w9Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(aaVar.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(aaVar.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    aaVar.g0 = webPage;
                    if (W(webPage)) {
                        TLRPC.WebPage webPage2 = aaVar.g0;
                        aaVar.f0 = webPage2 == null ? 0L : webPage2.id;
                        aaVar.g0 = null;
                    } else {
                        aaVar.f0 = 0L;
                    }
                } else {
                    aaVar.g0 = null;
                    aaVar.f0 = 0L;
                }
                aaVar.h0 = aaVar.f0 != 0;
                w9Var = aaVar.X;
                if (w9Var == null) {
                    w9Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        aaVar.h0 = aaVar.f0 != 0;
        w9Var = aaVar.X;
        if (w9Var == null) {
        }
    }

    public static void S(aa aaVar, String str) {
        t9 t9Var = aaVar.k0;
        if (str == null || TextUtils.equals(str, aaVar.j0)) {
            return;
        }
        aaVar.j0 = str;
        boolean V = aaVar.V(str);
        AndroidUtilities.cancelRunOnUIThread(t9Var);
        if (V) {
            if (!aaVar.h0 || aaVar.g0 != null) {
                aaVar.h0 = true;
                aaVar.g0 = null;
                w9 w9Var = aaVar.X;
                if (w9Var != null) {
                    w9Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(t9Var, 700L);
        } else if (aaVar.h0 || aaVar.g0 != null) {
            aaVar.h0 = false;
            aaVar.g0 = null;
            if (aaVar.i0 != 0) {
                ConnectionsManager.getInstance(aaVar.currentAccount).cancelRequest(aaVar.i0, true);
                aaVar.i0 = 0;
            }
            w9 w9Var2 = aaVar.X;
            if (w9Var2 != null) {
                w9Var2.N(true);
            }
        }
        aaVar.b0.setEnabled(V);
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
        w9 w9Var = this.X;
        if (w9Var != null) {
            w9Var.N(true);
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
                pg.n0 n0Var = new pg.n0();
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
                if (W(webPage)) {
                    webPage = null;
                }
                this.g0 = webPage;
                this.h0 = false;
                this.f0 = 0L;
                w9 w9Var = this.X;
                if (w9Var != null) {
                    w9Var.N(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.b);
        AndroidUtilities.hideKeyboard(this.Z.b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new t9(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        w9 w9Var = new w9(this.d, getContext(), this.currentAccount, 0, true, new ai.c0(this, 7), this.resourcesProvider);
        this.X = w9Var;
        return w9Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
