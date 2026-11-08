package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e4 extends ImageButton {
    public final /* synthetic */ i4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(i4 i4Var, Context context) {
        super(context);
        this.a = i4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
