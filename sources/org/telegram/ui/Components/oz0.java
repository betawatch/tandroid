package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ThemeEditorView.EditorAlert a;

    public oz0(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.a;
        editorAlert.n1.setVisibility(4);
        editorAlert.q1.setVisibility(4);
        editorAlert.u1.setVisibility(4);
        editorAlert.C1 = false;
    }
}
