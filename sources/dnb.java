// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.r;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dnb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ dnb(ThemeEditorView themeEditorView, byte b) {
        this.a = b;
        this.b = themeEditorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ThemeEditorView themeEditorView = this.b;
        switch (b) {
            case 0:
                r rVar = themeEditorView.c;
                if (rVar != null) {
                    rVar.setBackground(null);
                    themeEditorView.j.removeView(themeEditorView.c);
                    break;
                }
                break;
            default:
                cmb.v1(themeEditorView.o, true, false, false);
                themeEditorView.a();
                break;
        }
    }
}
