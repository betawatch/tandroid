package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import g7.o6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import pc.g;
import pc.o;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzgo extends SQLiteOpenHelper {
    public static final zzgn zza = new zzgn(null);
    private static final int zzb;
    private static final String zzc;
    private static zzgo zzd;

    static {
        int zzc2;
        String zzd2;
        zzc2 = zzgn.zzc("18.7.1");
        zzb = zzc2;
        zzd2 = zzgn.zzd("18.7.1");
        zzc = zzd2;
    }

    public /* synthetic */ zzgo(Context context, e eVar) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(g.h(list, ", ", "(", ")", new l() { // from class: com.google.android.recaptcha.internal.zzgm
            @Override // zc.l
            public final Object invoke(Object obj) {
                zzgn zzgnVar = zzgo.zza;
                return String.valueOf(((zzgp) obj).zza());
            }
        }, 24))), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i9 = -1;
        try {
            if (rawQuery.moveToNext()) {
                i9 = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i9;
    }

    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i9 = query.getInt(query.getColumnIndexOrThrow("id"));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j10 = query.getLong(query.getColumnIndexOrThrow("ts"));
                    i.b(string);
                    arrayList.add(new zzgp(string, j10, i9));
                } catch (Exception unused) {
                    arrayList = o.a;
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzgp zzgpVar) {
        return zza(o6.a(zzgpVar)) == 1;
    }
}
