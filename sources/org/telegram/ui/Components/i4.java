package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i4 extends c41 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Object obj, int i7) {
        super("@stickers", (vy0) null);
        this.e = i7;
        this.f = obj;
    }

    @Override // org.telegram.ui.Components.c41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                zv0 zv0Var = (zv0) this.f;
                org.telegram.messenger.qp.s1(zv0Var.a).y3(getURL(), zv0Var.C1, 1, null);
                zv0Var.dismiss();
                break;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                hc.a0((kg.v) this.f).k(false).j();
                break;
            case 3:
                org.telegram.ui.o50 o50Var = ((org.telegram.ui.m50) this.f).d;
                i7 = ((org.telegram.ui.ActionBar.f2) o50Var).currentAccount;
                org.telegram.messenger.qp.s1(i7).y3("stickers", o50Var, 1, null);
                break;
            case 4:
                ((org.telegram.ui.mj0) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i10 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
                org.telegram.messenger.qp.s1(i10).y3("stickers", stickersActivity, 3, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(String str, int i7, Object obj) {
        super(str, (vy0) null);
        this.e = i7;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(String str, vy0 vy0Var) {
        super(str, vy0Var);
        this.e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        super(str, (vy0) null);
        this.e = 0;
        this.f = f2Var;
    }
}
