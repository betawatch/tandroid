package kh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z extends FrameLayout {
    public final w a;
    public u b;
    public Utilities.Callback c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public z(Activity activity, s2 s2Var) {
        super(activity);
        w wVar = new w(this, activity);
        this.a = wVar;
        wVar.setAdapter(new x(this, activity, s2Var));
        wVar.setLayoutManager(new f2.m0(0, false));
        wVar.setClipToPadding(false);
        wVar.setVisibility(8);
        wVar.setWillNotDraw(false);
        wVar.setOnItemClickListener(new eh.j(this, 9));
        addView(wVar, g7.e6.c(56.0f, -1));
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
        ofFloat.addUpdateListener(new bg.b(this, 26));
        this.f.addListener(new hg.b0(9, this, z10));
        this.f.setInterpolator(gr.h);
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
