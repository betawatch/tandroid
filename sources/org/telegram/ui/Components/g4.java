package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g4 extends r41 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Object obj, int i10) {
        super("@stickers", (xz0) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.r41, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                ex0 ex0Var = (ex0) this.f;
                i10 = ((org.telegram.ui.ActionBar.e3) ex0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ex0Var.H, 1);
                ex0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                mc.a0((qf.s) this.f).k(false).j();
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
    public /* synthetic */ g4(String str, int i10, Object obj) {
        super(str, (xz0) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(String str, xz0 xz0Var) {
        super(str, xz0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (xz0) null);
        this.e = 0;
        this.f = n2Var;
    }
}
