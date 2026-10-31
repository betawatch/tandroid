package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ k01(ThemeEditorView themeEditorView, int i10) {
        this.a = i10;
        this.b = themeEditorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ThemeEditorView themeEditorView = this.b;
                i01 i01Var = themeEditorView.c;
                if (i01Var != null) {
                    i01Var.setBackground(null);
                    themeEditorView.j.removeView(themeEditorView.c);
                    break;
                }
                break;
            default:
                ThemeEditorView themeEditorView2 = this.b;
                org.telegram.ui.ActionBar.t6.x1(themeEditorView2.o, true, false, false);
                themeEditorView2.b();
                break;
        }
    }
}
