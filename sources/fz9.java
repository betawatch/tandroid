// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fz9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ gz9 c;

    public /* synthetic */ fz9(gz9 gz9Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = gz9Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gz9 gz9Var = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    gz9Var.removeView((View) arrayList.get(i));
                }
                gz9Var.getClass();
                gz9Var.h.clear();
                gz9Var.b = null;
                gz9Var.c = false;
                ((hz9) gz9Var.n).b.setAllowDrawCursor(true);
                break;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    gz9Var.removeView((View) arrayList.get(i2));
                }
                gz9Var.h.clear();
                gz9Var.b = null;
                gz9Var.c = false;
                ((hz9) gz9Var.n).b.setAllowDrawCursor(true);
                break;
        }
    }
}
