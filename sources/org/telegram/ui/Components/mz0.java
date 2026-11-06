package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class mz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public mz0(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        if (editorAlert.j1.getAdapter() == editorAlert.p1) {
            sz0 sz0Var = editorAlert.m1.b;
            sz0Var.requestFocus();
            org.telegram.messenger.g0.K3(sz0Var);
        }
        editorAlert.i1.setVisibility(8);
        editorAlert.r1.setVisibility(8);
        editorAlert.y1 = false;
    }
}
