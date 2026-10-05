package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class m4 extends l61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(Object obj, int i10) {
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
                ry0 ry0Var = (ry0) this.f;
                i10 = ((org.telegram.ui.ActionBar.f3) ry0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ry0Var.L, 1);
                ry0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                yc.a0((hg.w) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.sm0) this.f).a.dismissCurrentDialog();
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
        super(str, (n11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(String str, n11 n11Var) {
        super(str, n11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (n11) null);
        this.e = 0;
        this.f = n2Var;
    }
}
