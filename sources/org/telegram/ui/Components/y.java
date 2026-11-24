package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public y(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        if (editorAlert.m1.getAdapter() == editorAlert.s1) {
            e0 e0Var = editorAlert.p1.b;
            e0Var.requestFocus();
            gm.E3(e0Var);
        }
        editorAlert.l1.setVisibility(8);
        editorAlert.u1.setVisibility(8);
        editorAlert.B1 = false;
    }
}
