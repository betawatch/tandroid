package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tz0 extends EditTextBoldCursor {
    public final /* synthetic */ vz0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(vz0 vz0Var, Context context) {
        super(context);
        this.G1 = vz0Var;
    }

    @Override // org.telegram.ui.Components.dt, android.view.View
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
