package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y10 b;

    public /* synthetic */ c2(y10 y10Var, int i7) {
        this.a = i7;
        this.b = y10Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                y10 y10Var = this.b;
                if (y10Var != null) {
                    y10Var.a(bool);
                    break;
                }
                break;
        }
    }
}
