package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k4 extends m51 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Object obj, int i10) {
        super("@stickers", (o01) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.m51, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                vx0 vx0Var = (vx0) this.f;
                i10 = ((org.telegram.ui.ActionBar.f3) vx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), vx0Var.L, 1);
                vx0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                vc.a0((hg.x) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.t70 t70Var = ((org.telegram.ui.r70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) t70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", t70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.wm0) this.f).a.dismissCurrentDialog();
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
    public /* synthetic */ k4(String str, int i10, Object obj) {
        super(str, (o01) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(String str, o01 o01Var) {
        super(str, o01Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (o01) null);
        this.e = 0;
        this.f = n2Var;
    }
}
