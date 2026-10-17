package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class n4 extends j61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(Object obj, int i10) {
        super("@stickers", (l11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.j61, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                oy0 oy0Var = (oy0) this.f;
                i10 = ((org.telegram.ui.ActionBar.f3) oy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), oy0Var.L, 1);
                oy0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((ig.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.c70 c70Var = ((org.telegram.ui.a70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) c70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", c70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.gm0) this.f).a.dismissCurrentDialog();
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
        super(str, (l11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(String str, l11 l11Var) {
        super(str, l11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (l11) null);
        this.e = 0;
        this.f = n2Var;
    }
}
