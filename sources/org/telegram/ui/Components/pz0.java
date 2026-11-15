package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public pz0(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        if (editorAlert.n1.getAdapter() == editorAlert.t1) {
            vz0 vz0Var = editorAlert.q1.b;
            vz0Var.requestFocus();
            org.telegram.messenger.g0.J3(vz0Var);
        }
        editorAlert.m1.setVisibility(8);
        editorAlert.v1.setVisibility(8);
        editorAlert.C1 = false;
    }
}
