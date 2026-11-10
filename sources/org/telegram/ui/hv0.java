package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hv0 extends ir0 {
    public final /* synthetic */ ProfileActivity T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override // org.telegram.ui.ir0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        if (f10 > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.n0.getMeasuredWidth(), org.telegram.messenger.g0.L(30.0f) + profileActivity.n0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
            profileActivity.Y.draw(canvas);
            canvas.save();
            lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            float x10 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            canvas.translate(x10, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            lVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.ch0 ch0Var = profileActivity.s;
            if (ch0Var != null && ch0Var.getVisibility() == 0 && profileActivity.s.getAlpha() > 0.0f) {
                canvas.save();
                float f15 = (f10 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (profileActivity.s.getMeasuredWidth() / 2.0f) + profileActivity.s.getX(), (profileActivity.s.getMeasuredHeight() / 2.0f) + profileActivity.s.getY());
                canvas.translate(profileActivity.s.getX(), profileActivity.s.getY());
                profileActivity.s.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ir0
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i7 = 0; i7 < profileActivity.n0.getChildCount(); i7++) {
            profileActivity.n0.getChildAt(i7).invalidate();
        }
        org.telegram.ui.Components.ch0 ch0Var = profileActivity.s;
        if (ch0Var != null) {
            ch0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ir0
    public final boolean j(View view, ImageReceiver imageReceiver) {
        return super.j(view, imageReceiver) && this.T.a.getScrollState() != 1;
    }
}
