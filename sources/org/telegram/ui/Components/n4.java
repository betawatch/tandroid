package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class n4 extends l61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(Object obj, int i10) {
        super("@stickers", (n11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.l61, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                qy0 qy0Var = (qy0) this.f;
                i10 = ((org.telegram.ui.ActionBar.f3) qy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), qy0Var.L, 1);
                qy0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((ig.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.a70 a70Var = ((org.telegram.ui.y60) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) a70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", a70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.em0) this.f).a.dismissCurrentDialog();
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
    public /* synthetic */ n4(String str, int i10, Object obj) {
        super(str, (n11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(String str, n11 n11Var) {
        super(str, n11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (n11) null);
        this.e = 0;
        this.f = n2Var;
    }
}
