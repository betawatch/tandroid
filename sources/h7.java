// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class h7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ s7 c;

    public /* synthetic */ h7(s7 s7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = s7Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = 0;
        s7 s7Var = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                s7Var.G.setAlpha(0.0f);
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setAlpha(1.0f);
                    i++;
                }
                s7Var.G.setVisibility(8);
                break;
            default:
                s7Var.G.setAlpha(1.0f);
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setAlpha(0.0f);
                    i++;
                }
                break;
        }
    }
}
