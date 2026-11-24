// default package

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ak {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final uv6 b;
    public final Executor c;
    public final zj d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public ak(Context context, uv6 uv6Var) {
        this.a = context.getApplicationContext();
        this.b = uv6Var;
        Executor a = pd0.a();
        this.c = a;
        this.d = new zj(this, (byte) 0);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        a.execute(new yj(this, (byte) 1));
    }

    public final /* synthetic */ void a() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        zj zjVar = this.d;
        Context context = this.a;
        if (i >= 33) {
            context.registerReceiver(zjVar, intentFilter, 2);
        } else {
            rr.n(context, zjVar, intentFilter);
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
