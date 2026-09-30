package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class m4 extends b61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(Object obj, int i10) {
        super("@stickers", (d11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.b61, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                hy0 hy0Var = (hy0) this.f;
                i10 = ((org.telegram.ui.ActionBar.e3) hy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), hy0Var.L, 1);
                hy0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                yc.a0((hg.x) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.o70 o70Var = ((org.telegram.ui.m70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) o70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", o70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.om0) this.f).a.dismissCurrentDialog();
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
    public /* synthetic */ m4(String str, int i10, Object obj) {
        super(str, (d11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(String str, d11 d11Var) {
        super(str, d11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (d11) null);
        this.e = 0;
        this.f = m2Var;
    }
}
