package i2;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements e2.o, m4.h1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ a0(int i10, f9.s1 s1Var) {
        this.a = i10;
        this.b = s1Var;
    }

    @Override // m4.h1
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.a) {
        }
        return f0Var.l(wVar, this.b);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.e1) obj).onCues(this.b);
                break;
            default:
                ((j2.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ a0(j2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
