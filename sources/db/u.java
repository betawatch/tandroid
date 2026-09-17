package db;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new lb.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            gb.l lVar = new gb.l(gb.l.I);
            lVar.E = new Object[32];
            lVar.F = 0;
            lVar.G = new String[32];
            lVar.H = new int[32];
            lVar.L(iVar);
            return read(lVar);
        } catch (IOException e7) {
            throw new j(e7);
        }
    }

    public final u nullSafe() {
        return new e(this, 2);
    }

    public abstract Object read(lb.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new lb.b(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            gb.n nVar = new gb.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e7) {
            throw new j(e7);
        }
    }

    public abstract void write(lb.b bVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new j(e7);
        }
    }
}
