package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x10 b;

    public /* synthetic */ c2(x10 x10Var, int i7) {
        this.a = i7;
        this.b = x10Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                x10 x10Var = this.b;
                if (x10Var != null) {
                    x10Var.a(bool);
                    break;
                }
                break;
        }
    }
}
