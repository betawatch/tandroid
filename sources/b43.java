// default package

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b43 extends ContentObserver {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(kbb kbbVar) {
        super(new Handler());
        this.b = kbbVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                kbb kbbVar = (kbb) this.b;
                if (!kbbVar.b || (cursor = kbbVar.c) == null || cursor.isClosed()) {
                    return;
                }
                kbbVar.a = kbbVar.c.requery();
                return;
            default:
                p5d p5dVar = (p5d) this.b;
                synchronized (p5dVar.d) {
                    p5dVar.e = null;
                }
                ((p5d) this.b).b();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(p5d p5dVar) {
        super(null);
        this.b = p5dVar;
    }
}
