package lh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z extends FrameLayout {
    public final w a;
    public u b;
    public Utilities.Callback c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public z(Activity activity, r2 r2Var) {
        super(activity);
        w wVar = new w(this, activity);
        this.a = wVar;
        wVar.setAdapter(new x(this, activity, r2Var));
        wVar.setLayoutManager(new f2.k0(0, false));
        wVar.setClipToPadding(false);
        wVar.setVisibility(8);
        wVar.setWillNotDraw(false);
        wVar.setOnItemClickListener(new ag.p0(this, 11));
        addView(wVar, h7.z5.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        w wVar = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            wVar.invalidate();
            wVar.setVisibility(z10 ? 0 : 8);
            return;
        }
        wVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ag.u(this, 29));
        this.f.addListener(new ag.x(11, this, z10));
        this.f.setInterpolator(er.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(Utilities.Callback<u> callback) {
        this.c = callback;
    }

    public void setSelected(u uVar) {
        this.b = uVar;
        AndroidUtilities.updateVisibleRows(this.a);
    }
}
