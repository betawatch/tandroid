package org.telegram.SQLite;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class SQLiteException extends Exception {
    private static final long serialVersionUID = -2398298479089615621L;
    public final int errorCode;

    public SQLiteException() {
        this.errorCode = 0;
    }

    public SQLiteException(String str) {
        this(0, str);
    }

    public SQLiteException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
