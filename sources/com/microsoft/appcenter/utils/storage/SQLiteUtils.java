package com.microsoft.appcenter.utils.storage;

import android.database.sqlite.SQLiteQueryBuilder;

/* loaded from: classes3.dex */
public abstract class SQLiteUtils {
    public static SQLiteQueryBuilder newSQLiteQueryBuilder() {
        return new SQLiteQueryBuilder();
    }
}
