package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g4 extends f41 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Object obj, int i7) {
        super("@stickers", (wy0) null);
        this.e = i7;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.f41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.e2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                bw0 bw0Var = (bw0) this.f;
                org.telegram.messenger.np.s1(bw0Var.a).y3(getURL(), bw0Var.G1, 1, null);
                bw0Var.dismiss();
                break;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                cc.a0((kg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.l50 l50Var = ((org.telegram.ui.j50) this.f).d;
                i7 = ((org.telegram.ui.ActionBar.e2) l50Var).currentAccount;
                org.telegram.messenger.np.s1(i7).y3("stickers", l50Var, 1, null);
                break;
            case 4:
                ((org.telegram.ui.nj0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i10 = ((org.telegram.ui.ActionBar.e2) stickersActivity).currentAccount;
                org.telegram.messenger.np.s1(i10).y3("stickers", stickersActivity, 3, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(String str, int i7, Object obj) {
        super(str, (wy0) null);
        this.e = i7;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(String str, wy0 wy0Var) {
        super(str, wy0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(String str, org.telegram.ui.ActionBar.e2 e2Var) {
        super(str, (wy0) null);
        this.e = 0;
        this.f = e2Var;
    }
}
