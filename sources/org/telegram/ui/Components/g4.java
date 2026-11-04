package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g4 extends v31 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Object obj, int i3) {
        super("@stickers", (ty0) null);
        this.e = i3;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.v31, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i3;
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.d2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                xv0 xv0Var = (xv0) this.f;
                org.telegram.messenger.hp.s1(xv0Var.a).y3(getURL(), xv0Var.D1, 1, null);
                xv0Var.dismiss();
                break;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                fc.a0((lg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.g50 g50Var = ((org.telegram.ui.e50) this.f).d;
                i3 = ((org.telegram.ui.ActionBar.d2) g50Var).currentAccount;
                org.telegram.messenger.hp.s1(i3).y3("stickers", g50Var, 1, null);
                break;
            case 4:
                ((org.telegram.ui.hj0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i10 = ((org.telegram.ui.ActionBar.d2) stickersActivity).currentAccount;
                org.telegram.messenger.hp.s1(i10).y3("stickers", stickersActivity, 3, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(String str, int i3, Object obj) {
        super(str, (ty0) null);
        this.e = i3;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(String str, ty0 ty0Var) {
        super(str, ty0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(String str, org.telegram.ui.ActionBar.d2 d2Var) {
        super(str, (ty0) null);
        this.e = 0;
        this.f = d2Var;
    }
}
