package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] b;

    public /* synthetic */ j2(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.a = i10;
        this.b = g3VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                break;
            case 1:
                this.b[0].dismiss();
                break;
            case 2:
                this.b[0].dismiss();
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
