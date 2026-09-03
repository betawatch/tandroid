package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import dd.l;
import java.util.ArrayList;
import java.util.List;
import k7.t7;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import tc.g;
import tc.o;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    public /* synthetic */ zzgo(Context context, f fVar) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(g.h(list, ", ", "(", ")", new l() { // from class: com.google.android.recaptcha.internal.zzgm
            @Override // dd.l
            public final Object invoke(Object obj) {
                zzgn zzgnVar = zzgo.zza;
                return String.valueOf(((zzgp) obj).zza());
            }
        }, 24))), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i10 = -1;
        try {
            if (rawQuery.moveToNext()) {
                i10 = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
        rawQuery.close();
        return i10;
    }

    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i10 = query.getInt(query.getColumnIndexOrThrow("id"));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j10 = query.getLong(query.getColumnIndexOrThrow("ts"));
                    j.b(string);
                    arrayList.add(new zzgp(string, j10, i10));
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
        return zza(t7.a(zzgpVar)) == 1;
    }
}
