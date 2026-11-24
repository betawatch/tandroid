// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class m2a extends qt7 {
    public final /* synthetic */ oab c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ p2a e;

    public m2a(p2a p2aVar, oab oabVar, Context context) {
        this.e = p2aVar;
        this.c = oabVar;
        this.d = context;
    }

    @Override // qt7
    public final void a(ggc ggcVar, Object obj) {
        ggcVar.removeView((View) obj);
        this.e.H.remove(obj);
    }

    @Override // qt7
    public final int b() {
        return this.e.G.size();
    }

    @Override // qt7
    public final Object e(ggc ggcVar, int i) {
        p2a p2aVar = this.e;
        l2a l2aVar = new l2a(this, this.c, this.d, p2aVar.I, new eg9(this, (byte) 5));
        l2aVar.setTag(Integer.valueOf(i));
        l2aVar.setShadowDrawable(p2aVar.s);
        l2aVar.setPadding(0, gm.L(16.0f), 0, 0);
        l2aVar.f(p2aVar.E, (o2a) p2aVar.G.get(i));
        l2aVar.setListBottomPadding(p2aVar.d);
        ggcVar.addView(l2aVar);
        p2aVar.H.add(l2aVar);
        return l2aVar;
    }

    @Override // qt7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
