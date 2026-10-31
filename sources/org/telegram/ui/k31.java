package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k31 extends EditTextBoldCursor {
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
