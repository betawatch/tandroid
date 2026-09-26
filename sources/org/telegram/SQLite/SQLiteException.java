package org.telegram.SQLite;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
