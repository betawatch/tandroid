package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c71 extends EditTextBoldCursor {
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
