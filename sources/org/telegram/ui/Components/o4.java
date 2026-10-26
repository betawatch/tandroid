package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o4 extends x61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Object obj, int i10) {
        super("@stickers", (y11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.x61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.r2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                cz0 cz0Var = (cz0) this.f;
                i10 = ((org.telegram.ui.ActionBar.k3) cz0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), cz0Var.L, 1);
                cz0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                wc.b0((jg.w) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.f70 f70Var = ((org.telegram.ui.d70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.r2) f70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", f70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.qm0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i12 = ((org.telegram.ui.ActionBar.r2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, int i10, Object obj) {
        super(str, (y11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, y11 y11Var) {
        super(str, y11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        super(str, (y11) null);
        this.e = 0;
        this.f = r2Var;
    }
}
