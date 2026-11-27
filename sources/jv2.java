// default package

import android.database.ContentObserver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
