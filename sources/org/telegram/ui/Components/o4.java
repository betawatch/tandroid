package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o4 extends r41 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Object obj, int i7) {
        super("@stickers", (ez0) null);
        this.e = i7;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.r41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.g2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                jw0 jw0Var = (jw0) this.f;
                org.telegram.messenger.mp.u1(jw0Var.a).F3(getURL(), jw0Var.G1, 1, null);
                jw0Var.dismiss();
                break;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                kc.b0((kg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.n50 n50Var = ((org.telegram.ui.l50) this.f).d;
                i7 = ((org.telegram.ui.ActionBar.g2) n50Var).currentAccount;
                org.telegram.messenger.mp.u1(i7).F3("stickers", n50Var, 1, null);
                break;
            case 4:
                ((org.telegram.ui.oj0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i10 = ((org.telegram.ui.ActionBar.g2) stickersActivity).currentAccount;
                org.telegram.messenger.mp.u1(i10).F3("stickers", stickersActivity, 3, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, int i7, Object obj) {
        super(str, (ez0) null);
        this.e = i7;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(String str, ez0 ez0Var) {
        super(str, ez0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        super(str, (ez0) null);
        this.e = 0;
        this.f = g2Var;
    }
}
