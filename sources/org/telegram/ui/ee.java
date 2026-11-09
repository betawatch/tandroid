package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ ee(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                nj njVar = this.b.l2;
                if (njVar != null) {
                    njVar.c(false);
                    break;
                }
                break;
            case 1:
                cn.j1(this.b);
                break;
            case 2:
                this.b.w8(false, true, 0.0f);
                break;
            case 3:
                this.b.w8(false, true, 0.0f);
                break;
            case 4:
                this.b.w8(false, true, 0.0f);
                break;
            case 5:
                this.b.w8(false, true, 0.0f);
                break;
            case 6:
                this.b.w8(false, true, 0.0f);
                break;
            case 7:
                this.b.w8(false, true, 0.0f);
                break;
            default:
                this.b.ic = null;
                break;
        }
    }
}
