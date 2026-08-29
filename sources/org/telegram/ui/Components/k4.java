package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k4 extends a51 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Object obj, int i10) {
        super("@stickers", (h01) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.a51, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                nx0 nx0Var = (nx0) this.f;
                i10 = ((org.telegram.ui.ActionBar.f3) nx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), nx0Var.H, 1);
                nx0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                tc.a0((sf.r) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.c70 c70Var = ((org.telegram.ui.a70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.o2) c70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", c70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.dm0) this.f).a.dismissCurrentDialog();
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
        super(str, (h01) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(String str, h01 h01Var) {
        super(str, h01Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (h01) null);
        this.e = 0;
        this.f = o2Var;
    }
}
