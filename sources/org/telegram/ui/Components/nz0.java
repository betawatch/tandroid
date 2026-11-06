package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class nz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public nz0(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        if (editorAlert.j1.getAdapter() == editorAlert.p1) {
            tz0 tz0Var = editorAlert.m1.b;
            tz0Var.requestFocus();
            org.telegram.messenger.g0.K3(tz0Var);
        }
        editorAlert.i1.setVisibility(8);
        editorAlert.r1.setVisibility(8);
        editorAlert.y1 = false;
    }
}
