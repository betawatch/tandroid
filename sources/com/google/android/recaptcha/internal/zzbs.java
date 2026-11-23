package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
