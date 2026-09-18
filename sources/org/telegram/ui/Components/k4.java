package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k4 extends n51 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Object obj, int i10) {
        super("@stickers", (p01) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                wx0 wx0Var = (wx0) this.f;
                i10 = ((org.telegram.ui.ActionBar.g3) wx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), wx0Var.L, 1);
                wx0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                vc.a0((hg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.v70 v70Var = ((org.telegram.ui.t70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.o2) v70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", v70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.ym0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i12 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(String str, int i10, Object obj) {
        super(str, (p01) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(String str, p01 p01Var) {
        super(str, p01Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (p01) null);
        this.e = 0;
        this.f = o2Var;
    }
}
