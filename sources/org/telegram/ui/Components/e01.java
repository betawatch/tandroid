package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e01 extends EditTextBoldCursor {
    public final /* synthetic */ g01 M1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(g01 g01Var, Context context) {
        super(context);
        this.M1 = g01Var;
    }

    @Override // org.telegram.ui.Components.rt, android.view.View
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
