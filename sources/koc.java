// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class koc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ koc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                moc mocVar = (moc) obj;
                mocVar.O = 0.0f;
                mocVar.P = 0.0f;
                mocVar.c0 = null;
                break;
            case 1:
                npc npcVar = (npc) obj;
                npcVar.J = null;
                npcVar.j0 = 1.0f;
                npcVar.i0 = 0.0f;
                npcVar.h0 = 0.0f;
                npcVar.b();
                break;
            case 2:
                brc brcVar = (brc) obj;
                EditTextBoldCursor editTextBoldCursor = brcVar.b;
                if (brcVar.s == animator) {
                    brcVar.s = null;
                    brcVar.a.setVisibility(brcVar.E ? 4 : 0);
                    editTextBoldCursor.setVisibility(brcVar.E ? 0 : 4);
                    if (brcVar.E && !brcVar.F) {
                        editTextBoldCursor.requestFocus();
                        gm.E3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 3:
                qrc qrcVar = (qrc) obj;
                qrcVar.n = null;
                qrcVar.d.setVisibility(qrcVar.x ? 4 : 0);
                qrcVar.f.setVisibility(qrcVar.y ? 0 : 4);
                break;
            case 4:
                ((tvc) obj).f0 = null;
                break;
            case 5:
                ((uwc) ((sv) obj).b).c.setVisibility(4);
                break;
            default:
                ((b1d) obj).L = null;
                break;
        }
    }
}
