package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ l4(v4 v4Var, int i10) {
        this.a = i10;
        this.b = v4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
