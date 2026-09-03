package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h4 extends m51 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Object obj, int i10) {
        super("@stickers", (s01) null);
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
                ((org.telegram.ui.ActionBar.p2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                xx0 xx0Var = (xx0) this.f;
                i10 = ((org.telegram.ui.ActionBar.g3) xx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), xx0Var.I, 1);
                xx0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                qc.a0((uf.q) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.o70 o70Var = ((org.telegram.ui.m70) this.f).d;
                i11 = ((org.telegram.ui.ActionBar.p2) o70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", o70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.nm0) this.f).a.dismissCurrentDialog();
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
    public /* synthetic */ h4(String str, int i10, Object obj) {
        super(str, (s01) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(String str, s01 s01Var) {
        super(str, s01Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        super(str, (s01) null);
        this.e = 0;
        this.f = p2Var;
    }
}
