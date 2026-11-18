package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ s6(int i7, Runnable runnable) {
        this.a = i7;
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
