package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l4 extends z51 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Object obj, int i10) {
        super("@stickers", (b11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.z51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.p2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                hy0 hy0Var = (hy0) this.f;
                i10 = ((org.telegram.ui.ActionBar.h3) hy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), hy0Var.L, 1);
                hy0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                wc.a0((gg.x) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.p2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.wm0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i12 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(String str, int i10, Object obj) {
        super(str, (b11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(String str, b11 b11Var) {
        super(str, b11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        super(str, (b11) null);
        this.e = 0;
        this.f = p2Var;
    }
}
