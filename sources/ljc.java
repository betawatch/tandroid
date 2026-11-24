// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
