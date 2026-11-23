package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p4 extends s41 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(Object obj, int i7) {
        super("@stickers", (fz0) null);
        this.e = i7;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.s41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.g2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                kw0 kw0Var = (kw0) this.f;
                org.telegram.messenger.np.u1(kw0Var.a).F3(getURL(), kw0Var.G1, 1, null);
                kw0Var.dismiss();
                break;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                lc.b0((kg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.n50 n50Var = ((org.telegram.ui.l50) this.f).d;
                i7 = ((org.telegram.ui.ActionBar.g2) n50Var).currentAccount;
                org.telegram.messenger.np.u1(i7).F3("stickers", n50Var, 1, null);
                break;
            case 4:
                ((org.telegram.ui.qj0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i10 = ((org.telegram.ui.ActionBar.g2) stickersActivity).currentAccount;
                org.telegram.messenger.np.u1(i10).F3("stickers", stickersActivity, 3, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(String str, int i7, Object obj) {
        super(str, (fz0) null);
        this.e = i7;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(String str, fz0 fz0Var) {
        super(str, fz0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        super(str, (fz0) null);
        this.e = 0;
        this.f = g2Var;
    }
}
