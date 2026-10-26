package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y5 extends a5.a {
    public final /* synthetic */ y9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ b6 e;

    public y5(Context context, b6 b6Var, y9 y9Var) {
        this.e = b6Var;
        this.c = y9Var;
        this.d = context;
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override // a5.a
    public final int b() {
        return this.e.F.size();
    }

    @Override // a5.a
    public final Object e(a5.m mVar, int i10) {
        b6 b6Var = this.e;
        x5 x5Var = new x5(this, this.c, this.d, b6Var.H, new ai.i(this, 12));
        x5Var.setTag(Integer.valueOf(i10));
        x5Var.setShadowDrawable(b6Var.s);
        x5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        x5Var.g(b6Var.y, (a6) b6Var.F.get(i10));
        x5Var.setListBottomPadding(b6Var.d);
        mVar.addView(x5Var);
        b6Var.G.add(x5Var);
        return x5Var;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
