package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ a11(ThemeEditorView themeEditorView, int i10) {
        this.a = i10;
        this.b = themeEditorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ThemeEditorView themeEditorView = this.b;
                y01 y01Var = themeEditorView.a;
                if (y01Var != null) {
                    y01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.a);
                    break;
                }
                break;
            default:
                ThemeEditorView themeEditorView2 = this.b;
                org.telegram.ui.ActionBar.i6.r1(themeEditorView2.m, true, false, false);
                themeEditorView2.a();
                break;
        }
    }
}
