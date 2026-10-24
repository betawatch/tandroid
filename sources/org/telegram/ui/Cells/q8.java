package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageReceiver b;

    public /* synthetic */ q8(ImageReceiver imageReceiver, int i10) {
        this.a = i10;
        this.b = imageReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.onAttachedToWindow();
                break;
            default:
                this.b.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.onDetachedFromWindow();
                break;
            default:
                this.b.onDetachedFromWindow();
                break;
        }
    }
}
