// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.r;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class clb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeEditorView b;

    public /* synthetic */ clb(ThemeEditorView themeEditorView, byte b) {
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
                bkb.v1(themeEditorView.o, true, false, false);
                themeEditorView.a();
                break;
        }
    }
}
