// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.r;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bpb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ bpb(ThemeEditorView themeEditorView, byte b) {
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
                aob.v1(themeEditorView.o, true, false, false);
                themeEditorView.a();
                break;
        }
    }
}
