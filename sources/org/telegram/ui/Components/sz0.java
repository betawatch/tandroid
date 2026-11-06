package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sz0 extends EditTextBoldCursor {
    public final /* synthetic */ uz0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(uz0 uz0Var, Context context) {
        super(context);
        this.G1 = uz0Var;
    }

    @Override // org.telegram.ui.Components.ct, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.G1.c;
        int i7 = ThemeEditorView.EditorAlert.D1;
        obtain.setLocation(rawX, rawY - editorAlert.b.getTranslationY());
        editorAlert.j1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
