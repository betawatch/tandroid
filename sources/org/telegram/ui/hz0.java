package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hz0 extends cv0 {
    public final /* synthetic */ ProfileActivity T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override // org.telegram.ui.cv0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        if (f10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.k0.getMeasuredWidth(), AndroidUtilities.dp(30.0f) + profileActivity.k0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
            profileActivity.W.draw(canvas);
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            float x10 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            canvas.translate(x10, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            kVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.kj0 kj0Var = profileActivity.v;
            if (kj0Var != null && kj0Var.getVisibility() == 0 && profileActivity.v.getAlpha() > 0.0f) {
                canvas.save();
                float f15 = (f10 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (profileActivity.v.getMeasuredWidth() / 2.0f) + profileActivity.v.getX(), (profileActivity.v.getMeasuredHeight() / 2.0f) + profileActivity.v.getY());
                canvas.translate(profileActivity.v.getX(), profileActivity.v.getY());
                profileActivity.v.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.cv0
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i10 = 0; i10 < profileActivity.k0.getChildCount(); i10++) {
            profileActivity.k0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.kj0 kj0Var = profileActivity.v;
        if (kj0Var != null) {
            kj0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.cv0
    public final boolean j(View view, ImageReceiver imageReceiver) {
        return super.j(view, imageReceiver) && this.T.a.getScrollState() != 1;
    }
}
