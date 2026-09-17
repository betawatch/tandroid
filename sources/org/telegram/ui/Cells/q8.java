package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
