package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ki extends FrameLayout {
    public final /* synthetic */ an a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(an anVar, Activity activity) {
        super(activity);
        this.a = anVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.O7(true);
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
