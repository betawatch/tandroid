package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vz0 extends EditTextBoldCursor {
    public final /* synthetic */ xz0 M1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(xz0 xz0Var, Context context) {
        super(context);
        this.M1 = xz0Var;
    }

    @Override // org.telegram.ui.Components.kt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.M1.c;
        int i7 = ThemeEditorView.EditorAlert.H1;
        obtain.setLocation(rawX, rawY - editorAlert.b.getTranslationY());
        editorAlert.n1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
