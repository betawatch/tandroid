package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class cj extends FrameLayout {
    public final /* synthetic */ wn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(wn wnVar, Activity activity) {
        super(activity);
        this.a = wnVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.A7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(300.0f));
        if (min == 0) {
            min = AndroidUtilities.dp(300.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31));
    }
}
