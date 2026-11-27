package org.telegram.SQLite;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
