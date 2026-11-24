// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ r7 c;

    public /* synthetic */ g7(r7 r7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = r7Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = 0;
        r7 r7Var = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                r7Var.G.setAlpha(0.0f);
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setAlpha(1.0f);
                    i++;
                }
                r7Var.G.setVisibility(8);
                break;
            default:
                r7Var.G.setAlpha(1.0f);
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setAlpha(0.0f);
                    i++;
                }
                break;
        }
    }
}
