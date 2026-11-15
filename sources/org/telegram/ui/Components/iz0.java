package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class iz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ iz0(ThemeEditorView themeEditorView, int i7) {
        this.a = i7;
        this.b = themeEditorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ThemeEditorView themeEditorView = this.b;
                gz0 gz0Var = themeEditorView.c;
                if (gz0Var != null) {
                    gz0Var.setBackground(null);
                    themeEditorView.j.removeView(themeEditorView.c);
                    break;
                }
                break;
            default:
                ThemeEditorView themeEditorView2 = this.b;
                org.telegram.ui.ActionBar.j6.x1(themeEditorView2.o, true, false, false);
                themeEditorView2.b();
                break;
        }
    }
}
