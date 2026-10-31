package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p01 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ThemeEditorView.EditorAlert b;

    public p01(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.b = editorAlert;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.b.t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[0] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.b;
        AnimatorSet[] animatorSetArr = editorAlert.t1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.a) {
            editorAlert.s1[0].setVisibility(4);
        }
        animatorSetArr[0] = null;
    }
}
