// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cb2 extends FrameLayout implements snb {
    public final tt a;
    public final RadialProgressView b;
    public final vnb c;
    public float d;
    public int e;

    public cb2(Context context, vnb vnbVar) {
        super(context);
        this.c = vnbVar;
        tt ttVar = new tt(this, context);
        this.a = ttVar;
        ttVar.setWillNotDraw(false);
        addView(ttVar, tre.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, vnbVar);
        this.b = radialProgressView;
        radialProgressView.setSize(hl.L(28.0f));
        radialProgressView.setProgressColor(aob.v0(aob.g1(vnbVar) ? aob.Ka : aob.Zc, vnbVar));
        ttVar.addView(radialProgressView, tre.e(32, 32, 17));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z) {
        this.a.setVisibility(z ? 0 : 4);
    }

    @Override // snb
    public final void updateColors() {
        vnb vnbVar = this.c;
        try {
            this.b.setProgressColor(aob.v0(aob.g1(vnbVar) ? aob.Ka : aob.Zc, vnbVar));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
