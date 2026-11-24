package org.telegram.SQLite;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
