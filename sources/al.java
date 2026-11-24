// default package

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class al {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final ux6 b;
    public final Executor c;
    public final zk d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public al(Context context, ux6 ux6Var) {
        this.a = context.getApplicationContext();
        this.b = ux6Var;
        Executor a = pe0.a();
        this.c = a;
        this.d = new zk(this, (byte) 0);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        a.execute(new yk(this, (byte) 1));
    }

    public final /* synthetic */ void a() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        zk zkVar = this.d;
        Context context = this.a;
        if (i >= 33) {
            context.registerReceiver(zkVar, intentFilter, 2);
        } else {
            rs.n(context, zkVar, intentFilter);
        }
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Cursor query;
        AtomicBoolean atomicBoolean = this.e;
        boolean z = atomicBoolean.get();
        boolean z2 = false;
        try {
            query = this.a.getContentResolver().query(g, new String[]{"CarConnectionState"}, null, null, null);
        } catch (Exception unused) {
        }
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("CarConnectionState");
                if (columnIndex != -1 && query.moveToNext()) {
                    boolean z3 = query.getInt(columnIndex) != 0;
                    query.close();
                    z2 = z3;
                    atomicBoolean.set(z2);
                    if (z != z2 || this.f.get()) {
                    }
                    this.b.run();
                    return;
                }
            } finally {
            }
        }
        query.close();
        atomicBoolean.set(z2);
        if (z != z2) {
        }
    }
}
