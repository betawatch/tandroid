package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o4 extends y61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Object obj, int i10) {
        super("@stickers", (z11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.y61, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                dz0 dz0Var = (dz0) this.f;
                i10 = ((org.telegram.ui.ActionBar.k3) dz0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), dz0Var.L, 1);
                dz0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                wc.b0((jg.w) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.h70 h70Var = ((org.telegram.ui.f70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.r2) h70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", h70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.sm0) this.f).a.dismissCurrentDialog();
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
        super(str, (z11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, z11 z11Var) {
        super(str, z11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        super(str, (z11) null);
        this.e = 0;
        this.f = r2Var;
    }
}
