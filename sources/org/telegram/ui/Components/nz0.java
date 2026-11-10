package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public nz0(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        if (editorAlert.m1.getAdapter() == editorAlert.s1) {
            tz0 tz0Var = editorAlert.p1.b;
            tz0Var.requestFocus();
            org.telegram.messenger.g0.K3(tz0Var);
        }
        editorAlert.l1.setVisibility(8);
        editorAlert.u1.setVisibility(8);
        editorAlert.B1 = false;
    }
}
