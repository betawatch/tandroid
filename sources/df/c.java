package df;

import c3.i0;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import w7.j8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public c() {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public abstract void a(j8 j8Var);

    public void b(c cVar) {
        cVar.g();
        cVar.e(this);
        c cVar2 = (c) this.d;
        if (cVar2 == null) {
            this.c = cVar;
            this.d = cVar;
        } else {
            cVar2.f = cVar;
            cVar.e = cVar2;
            this.d = cVar;
        }
    }

    public b c() {
        ff.a aVar = (ff.a) this.b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        b bVar = (b) this.f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ff.b) ((ff.a) bVar.b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        b bVar2 = new b(readInt == 1 ? new ff.b(aVar, 16L, dataInputStream.readLong() - 16) : new ff.b(aVar, 8L, readInt - 8), this, new String(bArr, "ISO8859_1"), 0);
        this.f = bVar2;
        return bVar2;
    }

    public b d(String str) {
        b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(i0.n("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(c cVar) {
        this.b = cVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        c cVar = (c) this.e;
        if (cVar != null) {
            cVar.f = (c) this.f;
        } else {
            c cVar2 = (c) this.b;
            if (cVar2 != null) {
                cVar2.c = (c) this.f;
            }
        }
        c cVar3 = (c) this.f;
        if (cVar3 != null) {
            cVar3.e = cVar;
        } else {
            c cVar4 = (c) this.b;
            if (cVar4 != null) {
                cVar4.d = cVar;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public c(ff.a aVar, c cVar, String str) {
        this.a = 0;
        this.b = aVar;
        this.c = cVar;
        this.d = str;
        this.e = new DataInputStream(aVar);
    }
}
