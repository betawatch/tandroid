package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x01 extends EditTextBoldCursor {
    public final /* synthetic */ z01 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(z01 z01Var, Context context) {
        super(context);
        this.G1 = z01Var;
    }

    @Override // org.telegram.ui.Components.qt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.G1.c;
        int i10 = ThemeEditorView.EditorAlert.D1;
        obtain.setLocation(rawX, rawY - editorAlert.b.getTranslationY());
        editorAlert.j1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
