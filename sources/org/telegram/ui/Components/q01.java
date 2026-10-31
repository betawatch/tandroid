package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q01 extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public q01(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        editorAlert.j1.setVisibility(4);
        editorAlert.m1.setVisibility(4);
        editorAlert.q1.setVisibility(4);
        editorAlert.y1 = false;
    }
}
