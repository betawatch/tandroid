package di;

import org.telegram.messenger.r10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.r10
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((c6) this.b).k();
            default:
                return ((org.telegram.ui.ActionBar.e2) this.b).getSimpleMenuOverlay();
        }
    }
}
