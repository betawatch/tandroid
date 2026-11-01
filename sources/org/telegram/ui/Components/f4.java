package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f4 extends f51 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(Object obj, int i10) {
        super("@stickers", (zz0) null);
        this.e = i10;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.f51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.k2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                dx0 dx0Var = (dx0) this.f;
                org.telegram.messenger.wp.r1(dx0Var.a).v3(getURL(), dx0Var.C1, 1, null);
                dx0Var.dismiss();
                break;
            case 2:
                org.telegram.messenger.i0.g(getURL());
                cc.a0((ag.i0) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.j60 j60Var = ((org.telegram.ui.h60) this.f).d;
                i10 = ((org.telegram.ui.ActionBar.k2) j60Var).currentAccount;
                org.telegram.messenger.wp.r1(i10).v3("stickers", j60Var, 1, null);
                break;
            case 4:
                ((org.telegram.ui.rk0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i11 = ((org.telegram.ui.ActionBar.k2) stickersActivity).currentAccount;
                org.telegram.messenger.wp.r1(i11).v3("stickers", stickersActivity, 3, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(String str, int i10, Object obj) {
        super(str, (zz0) null);
        this.e = i10;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(String str, zz0 zz0Var) {
        super(str, zz0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        super(str, (zz0) null);
        this.e = 0;
        this.f = k2Var;
    }
}
