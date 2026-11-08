package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class mz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public mz0(ThemeEditorView.EditorAlert editorAlert) {
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
