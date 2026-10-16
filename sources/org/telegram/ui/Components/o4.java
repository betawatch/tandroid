package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o4 extends q61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Object obj, int i10) {
        super("@stickers", (q11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.q61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.m2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                uy0 uy0Var = (uy0) this.f;
                i10 = ((org.telegram.ui.ActionBar.e3) uy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), uy0Var.L, 1);
                uy0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                zc.a0((ig.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.y70 y70Var = ((org.telegram.ui.w70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) y70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", y70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.an0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i12 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, int i10, Object obj) {
        super(str, (q11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, q11 q11Var) {
        super(str, q11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (q11) null);
        this.e = 0;
        this.f = m2Var;
    }
}
