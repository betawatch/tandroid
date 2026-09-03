package f3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h implements d, g3.c, c {
    public static final v2.c f = new v2.c("proto");
    public final j a;
    public final h3.a b;
    public final h3.a c;
    public final a d;
    public final rc.a e;

    public h(h3.a aVar, h3.a aVar2, a aVar3, j jVar, rc.a aVar4) {
        this.a = jVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, y2.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.a, String.valueOf(i3.a.a(iVar.c))));
        byte[] bArr = iVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.a;
        Objects.requireNonNull(jVar);
        h3.a aVar = this.c;
        long W = aVar.W();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar.W() >= this.d.c + W) {
                    throw new g3.a("Timed out while trying to open db.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(f fVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            Object apply = fVar.apply(a2);
            a2.setTransactionSuccessful();
            return apply;
        } finally {
            a2.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, y2.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i10)), new androidx.car.app.utils.a(this, arrayList, iVar, 5));
        return arrayList;
    }

    public final void e(long j10, b3.c cVar, String str) {
        c(new e3.f(str, cVar, j10, 1));
    }

    public final Object f(g3.b bVar) {
        SQLiteDatabase a2 = a();
        h3.a aVar = this.c;
        long W = aVar.W();
        while (true) {
            try {
                a2.beginTransaction();
                try {
                    Object g10 = bVar.g();
                    a2.setTransactionSuccessful();
                    return g10;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar.W() >= this.d.c + W) {
                    throw new g3.a("Timed out while trying to acquire the lock.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
