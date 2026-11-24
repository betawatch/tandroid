package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e0 extends EditTextBoldCursor {
    public final /* synthetic */ g0 M1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, Context context) {
        super(context);
        this.M1 = g0Var;
    }

    @Override // vu3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.M1.c;
        int i = ThemeEditorView.EditorAlert.G1;
        obtain.setLocation(rawX, rawY - editorAlert.b.getTranslationY());
        editorAlert.m1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
