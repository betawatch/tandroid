package na;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new va.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            qa.l lVar = new qa.l(qa.l.E);
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

    public abstract Object read(va.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new va.b(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            qa.n nVar = new qa.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e10) {
            throw new j(e10);
        }
    }

    public abstract void write(va.b bVar, Object obj);

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
