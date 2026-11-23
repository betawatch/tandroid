package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ThemeEditorView.EditorAlert b;

    public wz0(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.b = editorAlert;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.b.x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[0] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.b;
        AnimatorSet[] animatorSetArr = editorAlert.x1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.a) {
            editorAlert.w1[0].setVisibility(4);
        }
        animatorSetArr[0] = null;
    }
}
