package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class nb0 extends EditText {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
            default:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
