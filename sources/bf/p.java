package bf;

import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import v7.i0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public abstract void a(i0 i0Var);

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

    public kf.b c() {
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        kf.b bVar = (kf.b) this.f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((mf.a) ((com.google.firebase.messaging.d) bVar.b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        kf.b bVar2 = new kf.b(readInt == 1 ? new mf.a(dVar, 16L, dataInputStream.readLong() - 16) : new mf.a(dVar, 8L, readInt - 8), this, new String(bArr, "ISO8859_1"), 0);
        this.f = bVar2;
        return bVar2;
    }

    public kf.b d(String str) {
        kf.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(e2.i("atom type mismatch, expected ", str, ", got ", str2));
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
