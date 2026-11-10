package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mi extends FrameLayout {
    public final /* synthetic */ cn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(cn cnVar, Activity activity) {
        super(activity);
        this.a = cnVar;
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
