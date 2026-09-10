package bi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c0 extends FrameLayout {
    public final z a;
    public x b;
    public Utilities.Callback c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public c0(Activity activity, m3 m3Var) {
        super(activity);
        z zVar = new z(this, activity);
        this.a = zVar;
        zVar.setAdapter(new a0(this, activity, m3Var));
        zVar.setLayoutManager(new s4.c0(0, false));
        zVar.setClipToPadding(false);
        zVar.setVisibility(8);
        zVar.setWillNotDraw(false);
        zVar.setOnItemClickListener(new ai.g(this, 1));
        addView(zVar, w7.a6.c(56.0f, -1));
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
        z zVar = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            zVar.invalidate();
            zVar.setVisibility(z10 ? 0 : 8);
            return;
        }
        zVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 2));
        this.f.addListener(new ai.e(4, this, z10));
        this.f.setInterpolator(wr.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(Utilities.Callback<x> callback) {
        this.c = callback;
    }

    public void setSelected(x xVar) {
        this.b = xVar;
        AndroidUtilities.updateVisibleRows(this.a);
    }
}
