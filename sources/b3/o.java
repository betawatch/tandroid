package b3;

import java.io.IOException;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(Throwable th2) {
        super(r0.toString(), th2);
        String str;
        StringBuilder sb2 = new StringBuilder("Unexpected ");
        sb2.append(th2.getClass().getSimpleName());
        if (th2.getMessage() != null) {
            str = ": " + th2.getMessage();
        } else {
            str = "";
        }
        sb2.append(str);
    }
}
