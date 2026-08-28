package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l5 extends m2.a {
    public final /* synthetic */ m9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ o5 e;

    public l5(Context context, o5 o5Var, m9 m9Var) {
        this.e = o5Var;
        this.c = m9Var;
        this.d = context;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.e.C.remove(obj);
    }

    @Override // m2.a
    public final int b() {
        return this.e.B.size();
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i9) {
        o5 o5Var = this.e;
        k5 k5Var = new k5(this, this.c, this.d, o5Var.D, new hg.i(this, 2));
        k5Var.setTag(Integer.valueOf(i9));
        k5Var.setShadowDrawable(o5Var.s);
        k5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        k5Var.g(o5Var.y, (n5) o5Var.B.get(i9));
        k5Var.setListBottomPadding(o5Var.d);
        gVar.addView(k5Var);
        o5Var.C.add(k5Var);
        return k5Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
