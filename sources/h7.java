// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
