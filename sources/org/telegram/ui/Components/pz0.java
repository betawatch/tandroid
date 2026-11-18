package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ pz0(ThemeEditorView themeEditorView, int i7) {
        this.a = i7;
        this.b = themeEditorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ThemeEditorView themeEditorView = this.b;
                nz0 nz0Var = themeEditorView.c;
                if (nz0Var != null) {
                    nz0Var.setBackground(null);
                    themeEditorView.j.removeView(themeEditorView.c);
                    break;
                }
                break;
            default:
                ThemeEditorView themeEditorView2 = this.b;
                org.telegram.ui.ActionBar.n6.x1(themeEditorView2.o, true, false, false);
                themeEditorView2.b();
                break;
        }
    }
}
