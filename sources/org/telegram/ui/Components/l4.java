package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class l4 extends a61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Object obj, int i10) {
        super("@stickers", (c11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.a61, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                gy0 gy0Var = (gy0) this.f;
                i10 = ((org.telegram.ui.ActionBar.f3) gy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), gy0Var.L, 1);
                gy0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((hg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.t70 t70Var = ((org.telegram.ui.r70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) t70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", t70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.xm0) this.f).a.dismissCurrentDialog();
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
    public /* synthetic */ l4(String str, int i10, Object obj) {
        super(str, (c11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(String str, c11 c11Var) {
        super(str, c11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (c11) null);
        this.e = 0;
        this.f = n2Var;
    }
}
