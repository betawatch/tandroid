// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ifa extends yp {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ifa(ViewGroup viewGroup, Object obj, byte b) {
        this.c = b;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // yp
    public final int i(int i) {
        int i2;
        int i3;
        byte b = this.c;
        ViewGroup viewGroup = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                iga igaVar = (iga) obj;
                y59 adapter = igaVar.n.getAdapter();
                nha nhaVar = (nha) viewGroup;
                hha hhaVar = nhaVar.L;
                if (adapter == hhaVar) {
                    if (hhaVar.d(i) == 2) {
                        return igaVar.r.J;
                    }
                    return 1;
                }
                if (nhaVar.y1(adapter) == -1) {
                    return 1;
                }
                ((kha) adapter).getClass();
                return 1;
            case 1:
                o7c o7cVar = (o7c) obj;
                l7c l7cVar = ((q7c) viewGroup).g3;
                if (l7cVar == null) {
                    return o7cVar.J;
                }
                c6c G = l7cVar.G(i);
                return (G == null || (i2 = G.v) == -1) ? o7cVar.J : i2;
            default:
                o7c o7cVar2 = (o7c) obj;
                l7c l7cVar2 = ((q7c) viewGroup).g3;
                if (l7cVar2 == null) {
                    return o7cVar2.J;
                }
                c6c G2 = l7cVar2.G(i);
                return (G2 == null || (i3 = G2.v) == -1) ? o7cVar2.J : i3;
        }
    }
}
