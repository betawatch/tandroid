package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ n(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                q.Q(this.b);
                break;
        }
    }
}
