package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class y5 extends z4.a {
    public final /* synthetic */ z9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ b6 e;

    public y5(Context context, b6 b6Var, z9 z9Var) {
        this.e = b6Var;
        this.c = z9Var;
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
        b6 b6Var = this.e;
        x5 x5Var = new x5(this, this.c, this.d, b6Var.H, new ai.r0(this, 8));
        x5Var.setTag(Integer.valueOf(i10));
        x5Var.setShadowDrawable(b6Var.s);
        x5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        x5Var.g(b6Var.y, (a6) b6Var.F.get(i10));
        x5Var.setListBottomPadding(b6Var.d);
        gVar.addView(x5Var);
        b6Var.G.add(x5Var);
        return x5Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
