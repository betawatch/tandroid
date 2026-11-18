package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o4 extends p41 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Object obj, int i7) {
        super("@stickers", (dz0) null);
        this.e = i7;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.h2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                iw0 iw0Var = (iw0) this.f;
                org.telegram.messenger.mp.u1(iw0Var.a).F3(getURL(), iw0Var.G1, 1, null);
                iw0Var.dismiss();
                break;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                lc.b0((kg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.n50 n50Var = ((org.telegram.ui.l50) this.f).d;
                i7 = ((org.telegram.ui.ActionBar.h2) n50Var).currentAccount;
                org.telegram.messenger.mp.u1(i7).F3("stickers", n50Var, 1, null);
                break;
            case 4:
                ((org.telegram.ui.qj0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i10 = ((org.telegram.ui.ActionBar.h2) stickersActivity).currentAccount;
                org.telegram.messenger.mp.u1(i10).F3("stickers", stickersActivity, 3, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, int i7, Object obj) {
        super(str, (dz0) null);
        this.e = i7;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, dz0 dz0Var) {
        super(str, dz0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(String str, org.telegram.ui.ActionBar.h2 h2Var) {
        super(str, (dz0) null);
        this.e = 0;
        this.f = h2Var;
    }
}
