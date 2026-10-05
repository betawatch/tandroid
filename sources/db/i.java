package db;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class i {
    public final l i() {
        if (this instanceof l) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            lb.b bVar = new lb.b(stringWriter);
            bVar.n = 1;
            fb.d.l(this, bVar);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
