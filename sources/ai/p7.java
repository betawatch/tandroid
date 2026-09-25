package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class p7 extends z4.a {
    public final /* synthetic */ jc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ s7 e;

    public p7(s7 s7Var, jc jcVar, Context context) {
        this.e = s7Var;
        this.c = jcVar;
        this.d = context;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override // z4.a
    public final int b() {
        return this.e.F.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        s7 s7Var = this.e;
        o7 o7Var = new o7(this, this.c, this.d, s7Var.H, new y1(this, 2));
        o7Var.setTag(Integer.valueOf(i10));
        o7Var.setShadowDrawable(s7Var.s);
        o7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        o7Var.g(s7Var.y, (r7) s7Var.F.get(i10));
        o7Var.setListBottomPadding(s7Var.d);
        gVar.addView(o7Var);
        s7Var.G.add(o7Var);
        return o7Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
