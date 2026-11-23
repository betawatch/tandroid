package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w10 b;

    public /* synthetic */ c2(w10 w10Var, int i7) {
        this.a = i7;
        this.b = w10Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                w10 w10Var = this.b;
                if (w10Var != null) {
                    w10Var.a(bool);
                    break;
                }
                break;
        }
    }
}
