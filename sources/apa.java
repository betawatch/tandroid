// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class apa extends mz0 {
    public gl3 S1;

    public apa(Context context) {
        super(context, null, true, false, null);
        J();
        this.y1 = true;
        this.x1 = true;
        T0();
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, 0);
        this.n1.j(new so7(this, (byte) 24));
        this.n1.setOnItemClickListener(new s19(this, (byte) 11));
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        gl3 gl3Var = new gl3(r59Var, getContext(), this.a, 0, true, this.J0);
        this.S1 = gl3Var;
        gl3Var.r = false;
        return gl3Var;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(2131745555, null);
    }
}
