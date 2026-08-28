package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g4 extends p41 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Object obj, int i9) {
        super("@stickers", (vz0) null);
        this.e = i9;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i9;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                cx0 cx0Var = (cx0) this.f;
                i9 = ((org.telegram.ui.ActionBar.f3) cx0Var).currentAccount;
                MessagesController.getInstance(i9).openByUserName(getURL(), cx0Var.H, 1);
                cx0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                oc.a0((pf.r) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.z60 z60Var = ((org.telegram.ui.x60) this.f).d;
                i10 = ((org.telegram.ui.ActionBar.o2) z60Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName("stickers", z60Var, 1);
                break;
            case 4:
                ((org.telegram.ui.fm0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i11 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", stickersActivity, 3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(String str, int i9, Object obj) {
        super(str, (vz0) null);
        this.e = i9;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(String str, vz0 vz0Var) {
        super(str, vz0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (vz0) null);
        this.e = 0;
        this.f = o2Var;
    }
}
