// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class llc extends AnimatorListenerAdapter {
    public final /* synthetic */ rc2 a;
    public final /* synthetic */ h22 b;
    public final /* synthetic */ mlc c;

    public llc(mlc mlcVar, rc2 rc2Var, h22 h22Var) {
        this.c = mlcVar;
        this.a = rc2Var;
        this.b = h22Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        h22 h22Var = this.b;
        ArrayList arrayList = (ArrayList) h22Var.c;
        mlc mlcVar = this.c;
        arrayList.remove(mlcVar);
        h22Var.a();
        ((ViewGroup) h22Var.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mlcVar.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
