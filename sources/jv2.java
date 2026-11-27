// default package

import android.database.ContentObserver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jv2 extends ContentObserver {
    public final kc a;
    public final /* synthetic */ lv2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv2(lv2 lv2Var) {
        super(null);
        this.b = lv2Var;
        this.a = new kc((byte) 26);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        synchronized (this.b.f) {
            if (this.b.d) {
                return;
            }
            Utilities.e.a(this.a);
            Utilities.e.d(this.a, 500L);
        }
    }
}
