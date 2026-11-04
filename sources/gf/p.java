package gf;

import b8.lc;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public abstract void a(lc lcVar);

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

    public pf.b c() {
        rf.a aVar = (rf.a) this.b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        pf.b bVar = (pf.b) this.f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((rf.b) ((rf.a) bVar.b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        pf.b bVar2 = new pf.b(readInt == 1 ? new rf.b(aVar, 16L, dataInputStream.readLong() - 16) : new rf.b(aVar, 8L, readInt - 8), this, new String(bArr, "ISO8859_1"), 0);
        this.f = bVar2;
        return bVar2;
    }

    public pf.b d(String str) {
        pf.b c2 = c();
        String str2 = (String) c2.d;
        if (str2.matches(str)) {
            return c2;
        }
        throw new IOException(com.google.android.recaptcha.internal.a.k("atom type mismatch, expected ", str, ", got ", str2));
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

    public p(rf.a aVar, p pVar, String str) {
        this.a = 1;
        this.b = aVar;
        this.c = pVar;
        this.d = str;
        this.e = new DataInputStream(aVar);
    }
}
