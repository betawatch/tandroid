package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sz0 extends EditTextBoldCursor {
    public final /* synthetic */ uz0 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(uz0 uz0Var, Context context) {
        super(context);
        this.H1 = uz0Var;
    }

    @Override // org.telegram.ui.Components.bt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.H1.c;
        int i3 = ThemeEditorView.EditorAlert.E1;
        obtain.setLocation(rawX, rawY - editorAlert.b.getTranslationY());
        editorAlert.k1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
