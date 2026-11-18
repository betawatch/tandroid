package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
