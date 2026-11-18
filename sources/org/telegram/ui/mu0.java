package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ mu0(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        Runnable runnable = this.b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                runnable.run();
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
