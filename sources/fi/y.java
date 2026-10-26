package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y extends FrameLayout {
    public final v a;
    public t b;
    public Utilities.Callback c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public y(Activity activity, q2 q2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.a = vVar;
        vVar.setAdapter(new w(this, activity, q2Var));
        vVar.setLayoutManager(new s4.c0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.k(this, 7));
        addView(vVar, gb1.g(56.0f, -1));
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
        v vVar = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            vVar.invalidate();
            vVar.setVisibility(z10 ? 0 : 8);
            return;
        }
        vVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 26));
        this.f.addListener(new bh.f0(9, this, z10));
        this.f.setInterpolator(ds.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(Utilities.Callback<t> callback) {
        this.c = callback;
    }

    public void setSelected(t tVar) {
        this.b = tVar;
        AndroidUtilities.updateVisibleRows(this.a);
    }
}
