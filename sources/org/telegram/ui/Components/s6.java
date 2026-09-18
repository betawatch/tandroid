package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ s6(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.b.run();
                break;
        }
    }
}
