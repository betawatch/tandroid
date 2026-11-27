package org.telegram.SQLite;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
