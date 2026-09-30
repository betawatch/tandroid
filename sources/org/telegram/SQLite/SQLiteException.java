package org.telegram.SQLite;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public class SQLiteException extends Exception {
    private static final long serialVersionUID = -2398298479089615621L;
    public final int errorCode;

    public SQLiteException(int i10, String str) {
        super(str);
        this.errorCode = i10;
    }

    public SQLiteException(String str) {
        this(0, str);
    }

    public SQLiteException() {
        this.errorCode = 0;
    }
}
