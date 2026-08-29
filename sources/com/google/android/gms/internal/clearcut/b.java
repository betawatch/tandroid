package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b {
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public static final String[] i = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public volatile HashMap e;
    public final Object d = new Object();
    public final Object f = new Object();
    public final ArrayList g = new ArrayList();
    public final c c = new c(this);

    public b(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
    }

    public static void a(b bVar) {
        synchronized (bVar.f) {
            try {
                Iterator it = bVar.g.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final HashMap b() {
        try {
            HashMap hashMap = new HashMap();
            Cursor query = this.a.query(this.b, i, null, null, null);
            if (query == null) {
                return hashMap;
            }
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }
}
