package hi;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ y(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.s2(((Long) obj).longValue());
                break;
            case 1:
                this.b.w(((Boolean) obj).booleanValue());
                break;
            case 2:
                this.b.s2(((Long) obj).longValue());
                break;
            case 3:
                this.b.w(((Boolean) obj).booleanValue());
                break;
            default:
                this.b.s2(((Long) obj).longValue());
                break;
        }
    }
}
