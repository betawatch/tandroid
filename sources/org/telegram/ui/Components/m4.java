package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class m4 extends l51 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(Object obj, int i10) {
        super("@stickers", (n01) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.l51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                ux0 ux0Var = (ux0) this.f;
                i10 = ((org.telegram.ui.ActionBar.f3) ux0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ux0Var.L, 1);
                ux0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                yc.a0((ig.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.u70 u70Var = ((org.telegram.ui.s70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) u70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", u70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.xm0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(String str, int i10, Object obj) {
        super(str, (n01) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(String str, n01 n01Var) {
        super(str, n01Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (n01) null);
        this.e = 0;
        this.f = n2Var;
    }
}
