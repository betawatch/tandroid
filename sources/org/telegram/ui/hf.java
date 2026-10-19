package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ hf(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Rb(false);
                break;
            default:
                this.b.Rb(false);
                break;
        }
    }
}
