package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ow0 extends qs0 {
    public final /* synthetic */ ProfileActivity T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override // org.telegram.ui.qs0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        if (f7 > 0.0f) {
            RectF rectF = org.telegram.messenger.i0.P;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.n0.getMeasuredWidth(), org.telegram.messenger.i0.L(30.0f) + profileActivity.n0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f7), 31);
            profileActivity.Y.draw(canvas);
            canvas.save();
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            float x10 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            canvas.translate(x10, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            lVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.ei0 ei0Var = profileActivity.s;
            if (ei0Var != null && ei0Var.getVisibility() == 0 && profileActivity.s.getAlpha() > 0.0f) {
                canvas.save();
                float f14 = (f7 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (profileActivity.s.getMeasuredWidth() / 2.0f) + profileActivity.s.getX(), (profileActivity.s.getMeasuredHeight() / 2.0f) + profileActivity.s.getY());
                canvas.translate(profileActivity.s.getX(), profileActivity.s.getY());
                profileActivity.s.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.qs0
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i10 = 0; i10 < profileActivity.n0.getChildCount(); i10++) {
            profileActivity.n0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.ei0 ei0Var = profileActivity.s;
        if (ei0Var != null) {
            ei0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.qs0
    public final boolean j(View view, ImageReceiver imageReceiver) {
        return super.j(view, imageReceiver) && this.T.a.getScrollState() != 1;
    }
}
