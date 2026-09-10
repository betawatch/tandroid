package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ThemeEditorView.EditorAlert b;

    public s11(ThemeEditorView.EditorAlert editorAlert, boolean z10) {
        this.b = editorAlert;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.b.x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[0] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThemeEditorView.EditorAlert editorAlert = this.b;
        AnimatorSet[] animatorSetArr = editorAlert.x;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.a) {
            editorAlert.w[0].setVisibility(4);
        }
        animatorSetArr[0] = null;
    }
}
