package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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

    public /* synthetic */ zzgo(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(CollectionsKt.joinToString$default(list, ", ", "(", ")", 0, null, new Function1() { // from class: com.google.android.recaptcha.internal.zzgm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                zzgn zzgnVar = zzgo.zza;
                return String.valueOf(((zzgp) obj).zza());
            }
        }, 24, null))), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i = -1;
        try {
            if (rawQuery.moveToNext()) {
                i = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i;
    }

    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i = query.getInt(query.getColumnIndexOrThrow("id"));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j = query.getLong(query.getColumnIndexOrThrow("ts"));
                    Intrinsics.checkNotNull(string);
                    arrayList.add(new zzgp(string, j, i));
                } catch (Exception unused) {
                    arrayList = CollectionsKt.emptyList();
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzgp zzgpVar) {
        return zza(CollectionsKt.listOf(zzgpVar)) == 1;
    }
}
