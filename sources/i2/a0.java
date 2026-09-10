package i2;

import b2.x1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements e2.m {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x1 b;

    public /* synthetic */ a0(x1 x1Var) {
        this.b = x1Var;
    }

    @Override // e2.m
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.z0) obj).onVideoSizeChanged(this.b);
                break;
            default:
                x1 x1Var = this.b;
                ((j2.b) obj).c(x1Var);
                int i10 = x1Var.a;
                break;
        }
    }
}
