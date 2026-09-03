package ne;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import k7.h0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class p {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public p() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public abstract void a(h0 h0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 == null) {
            this.c = pVar;
            this.d = pVar;
        } else {
            pVar2.f = pVar;
            pVar.e = pVar2;
            this.d = pVar;
        }
    }

    public xe.b c() {
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        xe.b bVar = (xe.b) this.f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ze.a) ((com.google.firebase.messaging.d) bVar.b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        xe.b bVar2 = new xe.b(readInt == 1 ? new ze.a(dVar, 16L, dataInputStream.readLong() - 16) : new ze.a(dVar, 8L, readInt - 8), this, new String(bArr, "ISO8859_1"), 0);
        this.f = bVar2;
        return bVar2;
    }

    public xe.b d(String str) {
        xe.b c3 = c();
        String str2 = (String) c3.d;
        if (str2.matches(str)) {
            return c3;
        }
        throw new IOException(e2.c.k("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.e;
        if (pVar != null) {
            pVar.f = (p) this.f;
        } else {
            p pVar2 = (p) this.b;
            if (pVar2 != null) {
                pVar2.c = (p) this.f;
            }
        }
        p pVar3 = (p) this.f;
        if (pVar3 != null) {
            pVar3.e = pVar;
        } else {
            p pVar4 = (p) this.b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.a = 1;
        this.b = dVar;
        this.c = pVar;
        this.d = str;
        this.e = new DataInputStream(dVar);
    }
}
