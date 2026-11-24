// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ma2 extends FrameLayout implements tjb {
    public final st a;
    public final RadialProgressView b;
    public final wjb c;
    public float d;
    public int e;

    public ma2(Context context, wjb wjbVar) {
        super(context);
        this.c = wjbVar;
        st stVar = new st(this, context);
        this.a = stVar;
        stVar.setWillNotDraw(false);
        addView(stVar, nme.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, wjbVar);
        this.b = radialProgressView;
        radialProgressView.setSize(gl.L(28.0f));
        radialProgressView.setProgressColor(bkb.v0(bkb.g1(wjbVar) ? bkb.Ja : bkb.Yc, wjbVar));
        stVar.addView(radialProgressView, nme.e(32, 32, 17));
    }

    public final void a(float f, int i) {
        if (this.d != f) {
            invalidate();
        }
        this.d = f;
        this.e = i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z) {
        this.a.setVisibility(z ? 0 : 4);
    }

    @Override // tjb
    public final void updateColors() {
        wjb wjbVar = this.c;
        try {
            this.b.setProgressColor(bkb.v0(bkb.g1(wjbVar) ? bkb.Ja : bkb.Yc, wjbVar));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
