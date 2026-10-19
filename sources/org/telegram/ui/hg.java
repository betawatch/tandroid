package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                qnVar.b9 = true;
                qnVar.Z8 = 0;
                qnVar.qb = 0;
                qnVar.N4 = 0;
                qnVar.w9();
                qnVar.Rb(false);
                break;
            case 1:
                io ioVar = (io) this.b;
                ioVar.M0 = false;
                ioVar.b = null;
                ioVar.N0 = false;
                break;
            case 2:
                ((ip) this.b).n = null;
                break;
            default:
                ((ib0) this.b).b();
                break;
        }
    }
}
