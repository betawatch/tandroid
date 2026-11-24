// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mn8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ProfileActivity c;

    public /* synthetic */ mn8(ProfileActivity profileActivity, boolean z, byte b) {
        this.a = b;
        this.c = profileActivity;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.g0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        u95 u95Var;
        byte b = this.a;
        boolean z = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.f4(z);
                profileActivity.Y.setClickable(true);
                if (z) {
                    xha xhaVar = profileActivity.U0;
                    if (xhaVar.G.getWidth() != 0 && !xhaVar.e.isFocused()) {
                        xhaVar.e.requestFocus();
                        gl.E3(xhaVar.e);
                    }
                }
                profileActivity.N2(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z) {
                    profileActivity.Y4 = true;
                    profileActivity.i3();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i = ((d) profileActivity).classGuid;
                    gl.V2(parentActivity, i);
                    profileActivity.P.setPreventMoving(false);
                    break;
                }
                break;
            default:
                if (profileActivity.g0 != null && (u95Var = profileActivity.h0) != null) {
                    if (!z) {
                        u95Var.setVisibility(4);
                    }
                    profileActivity.g0 = null;
                    break;
                }
                break;
        }
    }
}
