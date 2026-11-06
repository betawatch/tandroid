package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c90 extends EditText {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c90(Context context, int i7) {
        super(context);
        this.a = i7;
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
