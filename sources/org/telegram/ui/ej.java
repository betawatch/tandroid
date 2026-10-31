package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ej extends FrameLayout {
    public final /* synthetic */ un a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(un unVar, Activity activity) {
        super(activity);
        this.a = unVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.I7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(300.0f));
        if (min == 0) {
            min = org.telegram.messenger.i0.L(300.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31));
    }
}
