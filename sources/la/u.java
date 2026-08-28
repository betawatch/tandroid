package la;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new ta.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            oa.l lVar = new oa.l(oa.l.E);
            lVar.A = new Object[32];
            lVar.B = 0;
            lVar.C = new String[32];
            lVar.D = new int[32];
            lVar.L(iVar);
            return read(lVar);
        } catch (IOException e10) {
            throw new j(e10);
        }
    }

    public final u nullSafe() {
        return new e(this, 2);
    }

    public abstract Object read(ta.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new ta.c(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            oa.n nVar = new oa.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e10) {
            throw new j(e10);
        }
    }

    public abstract void write(ta.c cVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new j(e10);
        }
    }
}
