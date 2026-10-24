package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m4 extends q61 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(Object obj, int i10) {
        super("@stickers", (q11) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.q61, android.text.style.URLSpan, android.text.style.ClickableSpan
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
                ty0 ty0Var = (ty0) this.f;
                i10 = ((org.telegram.ui.ActionBar.h3) ty0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ty0Var.L, 1);
                ty0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((ig.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.e70 e70Var = ((org.telegram.ui.c70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.o2) e70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", e70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.im0) this.f).a.dismissCurrentDialog();
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
    public /* synthetic */ m4(String str, int i10, Object obj) {
        super(str, (q11) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(String str, q11 q11Var) {
        super(str, q11Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (q11) null);
        this.e = 0;
        this.f = o2Var;
    }
}
