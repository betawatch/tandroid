// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cn8 extends ma8 {
    public final /* synthetic */ ProfileActivity T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn8(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override // ma8
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        a aVar;
        a aVar2;
        a aVar3;
        if (f > 0.0f) {
            RectF rectF = gl.P;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.o0.getMeasuredWidth(), gl.L(30.0f) + profileActivity.o0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f), 31);
            profileActivity.Z.draw(canvas);
            canvas.save();
            aVar = ((d) profileActivity).actionBar;
            float x = aVar.getX();
            aVar2 = ((d) profileActivity).actionBar;
            canvas.translate(x, aVar2.getY());
            aVar3 = ((d) profileActivity).actionBar;
            aVar3.draw(canvas);
            canvas.restore();
            ry8 ry8Var = profileActivity.s;
            if (ry8Var != null && ry8Var.getVisibility() == 0 && profileActivity.s.getAlpha() > 0.0f) {
                canvas.save();
                float f6 = (f * 0.5f) + 0.5f;
                canvas.scale(f6, f6, (profileActivity.s.getMeasuredWidth() / 2.0f) + profileActivity.s.getX(), (profileActivity.s.getMeasuredHeight() / 2.0f) + profileActivity.s.getY());
                canvas.translate(profileActivity.s.getX(), profileActivity.s.getY());
                profileActivity.s.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // ma8
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i = 0; i < profileActivity.o0.getChildCount(); i++) {
            profileActivity.o0.getChildAt(i).invalidate();
        }
        ry8 ry8Var = profileActivity.s;
        if (ry8Var != null) {
            ry8Var.invalidate();
        }
    }

    @Override // ma8
    public final boolean i(ViewGroup viewGroup, ImageReceiver imageReceiver) {
        return super.i(viewGroup, imageReceiver) && this.T.a.getScrollState() != 1;
    }
}
