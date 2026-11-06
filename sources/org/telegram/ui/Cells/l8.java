package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageReceiver b;

    public /* synthetic */ l8(ImageReceiver imageReceiver, int i7) {
        this.a = i7;
        this.b = imageReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            default:
                this.b.P();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.R();
                break;
            default:
                this.b.R();
                break;
        }
    }
}
