package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ g01(ThemeEditorView themeEditorView, int i9) {
        this.a = i9;
        this.b = themeEditorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ThemeEditorView themeEditorView = this.b;
                e01 e01Var = themeEditorView.a;
                if (e01Var != null) {
                    e01Var.setBackground(null);
                    themeEditorView.h.removeView(themeEditorView.a);
                    break;
                }
                break;
            default:
                ThemeEditorView themeEditorView2 = this.b;
                org.telegram.ui.ActionBar.f6.r1(themeEditorView2.m, true, false, false);
                themeEditorView2.a();
                break;
        }
    }
}
