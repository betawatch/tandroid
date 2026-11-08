package org.telegram.SQLite;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class SQLiteException extends Exception {
    private static final long serialVersionUID = -2398298479089615621L;
    public final int errorCode;

    public SQLiteException(int i7, String str) {
        super(str);
        this.errorCode = i7;
    }

    public SQLiteException(String str) {
        this(0, str);
    }

    public SQLiteException() {
        this.errorCode = 0;
    }
}
