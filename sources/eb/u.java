package eb;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new mb.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            hb.l lVar = new hb.l(hb.l.I);
            lVar.E = new Object[32];
            lVar.F = 0;
            lVar.G = new String[32];
            lVar.H = new int[32];
            lVar.L(iVar);
            return read(lVar);
        } catch (IOException e) {
            throw new j(e);
        }
    }

    public final u nullSafe() {
        return new e(this, 2);
    }

    public abstract Object read(mb.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new mb.b(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            hb.n nVar = new hb.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e) {
            throw new j(e);
        }
    }

    public abstract void write(mb.b bVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new j(e);
        }
    }
}
