package fb;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new nb.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            ib.l lVar = new ib.l(ib.l.I);
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

    public abstract Object read(nb.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new nb.b(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            ib.n nVar = new ib.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e) {
            throw new j(e);
        }
    }

    public abstract void write(nb.b bVar, Object obj);

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
