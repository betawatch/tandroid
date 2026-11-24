// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class nw5 implements cq7 {
    public final /* synthetic */ byte a;

    @Override // b44
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new e44("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                dq7 dq7Var = (dq7) obj2;
                dq7Var.a(iv8.f, entry.getKey());
                dq7Var.a(iv8.g, entry.getValue());
                return;
            default:
                throw new e44("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
