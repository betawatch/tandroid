// default package

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m53 extends ContentObserver {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(mdb mdbVar) {
        super(new Handler());
        this.b = mdbVar;
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
                mdb mdbVar = (mdb) this.b;
                if (!mdbVar.b || (cursor = mdbVar.c) == null || cursor.isClosed()) {
                    return;
                }
                mdbVar.a = mdbVar.c.requery();
                return;
            default:
                r7d r7dVar = (r7d) this.b;
                synchronized (r7dVar.d) {
                    r7dVar.e = null;
                }
                ((r7d) this.b).b();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(r7d r7dVar) {
        super(null);
        this.b = r7dVar;
    }
}
