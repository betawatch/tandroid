package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class li extends FrameLayout {
    public final /* synthetic */ bn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(bn bnVar, Activity activity) {
        super(activity);
        this.a = bnVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.P7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(300.0f));
        if (min == 0) {
            min = org.telegram.messenger.g0.L(300.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31));
    }
}
