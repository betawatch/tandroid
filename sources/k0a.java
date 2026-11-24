// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class k0a extends pr7 {
    public final /* synthetic */ m8b c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ n0a e;

    public k0a(n0a n0aVar, m8b m8bVar, Context context) {
        this.e = n0aVar;
        this.c = m8bVar;
        this.d = context;
    }

    @Override // pr7
    public final void a(gec gecVar, Object obj) {
        gecVar.removeView((View) obj);
        this.e.H.remove(obj);
    }

    @Override // pr7
    public final int b() {
        return this.e.G.size();
    }

    @Override // pr7
    public final Object e(gec gecVar, int i) {
        n0a n0aVar = this.e;
        j0a j0aVar = new j0a(this, this.c, this.d, n0aVar.I, new ae9(this, (byte) 5));
        j0aVar.setTag(Integer.valueOf(i));
        j0aVar.setShadowDrawable(n0aVar.s);
        j0aVar.setPadding(0, gl.L(16.0f), 0, 0);
        j0aVar.f(n0aVar.E, (m0a) n0aVar.G.get(i));
        j0aVar.setListBottomPadding(n0aVar.d);
        gecVar.addView(j0aVar);
        n0aVar.H.add(j0aVar);
        return j0aVar;
    }

    @Override // pr7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
