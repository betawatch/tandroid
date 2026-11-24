// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ljc extends AnimatorListenerAdapter {
    public final /* synthetic */ gb2 a;
    public final /* synthetic */ w02 b;
    public final /* synthetic */ mjc c;

    public ljc(mjc mjcVar, gb2 gb2Var, w02 w02Var) {
        this.c = mjcVar;
        this.a = gb2Var;
        this.b = w02Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        w02 w02Var = this.b;
        ArrayList arrayList = (ArrayList) w02Var.c;
        mjc mjcVar = this.c;
        arrayList.remove(mjcVar);
        w02Var.a();
        ((ViewGroup) w02Var.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mjcVar.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
