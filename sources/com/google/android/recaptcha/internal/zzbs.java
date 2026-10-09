package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class zzbs {
    public static final String zza(ContentResolver contentResolver) {
        Cursor query = contentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        String str = "";
        if (query != null && query.moveToFirst() && query.getColumnCount() >= 2) {
            try {
                str = String.valueOf(Long.parseLong(query.getString(1)));
            } catch (Exception unused) {
            }
            query.close();
        }
        return str;
    }
}
