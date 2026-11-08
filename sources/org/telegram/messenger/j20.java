package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qd0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j20 {
    public hf A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public ye H;
    public boolean I;
    public boolean J;
    public fi.d7 K;
    public fi.t L;
    public ArrayList M;
    public boolean N;
    public Bitmap O;
    public boolean P;
    public Integer Q;
    public Integer R;
    public int S;
    public boolean T;
    public boolean V;
    public boolean W;
    public boolean X;
    public long a;
    public boolean a0;
    public long b;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public String o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public boolean t;
    public long v;
    public TLRPC.InputFile w;
    public TLRPC.InputEncryptedFile x;
    public byte[] y;
    public byte[] z;
    public long c = -1;
    public int n = 24;
    public float u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList b0 = new ArrayList();

    public final boolean a() {
        return this.s;
    }

    public final String b() {
        byte[] bArr;
        String f10;
        ArrayList arrayList;
        if (this.c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
            f10 = "";
        } else {
            int i7 = this.A != null ? qs.A2 : 10;
            String str = this.B;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i7 += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.C;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i7 += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i7);
            serializedData.writeInt32(11);
            serializedData.writeInt64(this.c);
            serializedData.writeInt32(this.j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.a);
                serializedData.writeFloat(this.A.b);
                serializedData.writeFloat(this.A.c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.e);
                serializedData.writeFloat(this.A.f);
                serializedData.writeFloat(this.A.g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.i);
                serializedData.writeFloat(this.A.j);
                serializedData.writeFloat(this.A.k);
                serializedData.writeFloat(this.A.l);
                serializedData.writeFloat(this.A.m);
                serializedData.writeInt32(this.A.n);
                serializedData.writeFloat(this.A.o);
                serializedData.writeFloat(this.A.q);
                PointF pointF = this.A.r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.s);
                serializedData.writeFloat(this.A.t);
                int i10 = 0;
                while (i10 < 4) {
                    qd0 qd0Var = (qd0) (i10 == 0 ? this.A.p.b : i10 == 1 ? this.A.p.c : i10 == 2 ? this.A.p.d : this.A.p.e);
                    serializedData.writeFloat(qd0Var.a);
                    serializedData.writeFloat(qd0Var.b);
                    serializedData.writeFloat(qd0Var.c);
                    serializedData.writeFloat(qd0Var.d);
                    serializedData.writeFloat(qd0Var.e);
                    i10++;
                }
            } else {
                serializedData.writeByte(0);
            }
            if (bArr != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr);
            } else {
                serializedData.writeByte(0);
            }
            ArrayList arrayList2 = this.G;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                serializedData.writeByte(0);
            } else {
                serializedData.writeByte(1);
                serializedData.writeInt32(this.G.size());
                int size = this.G.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((h20) this.G.get(i11)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.a);
                serializedData.writeFloat(this.H.b);
                serializedData.writeFloat(this.H.e);
                serializedData.writeFloat(this.H.f);
                serializedData.writeFloat(this.H.c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.i);
                serializedData.writeInt32(this.H.j);
                serializedData.writeInt32(this.H.k);
                serializedData.writeBool(this.H.l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.u);
            serializedData.writeBool(this.N);
            fi.t tVar = this.L;
            if (tVar == null || this.M == null || tVar.e.size() <= 1 || this.M.isEmpty()) {
                serializedData.writeInt32(TLRPC.TL_null.constructor);
            } else {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.a);
                for (int i12 = 0; i12 < this.M.size(); i12++) {
                    ((i20) this.M.get(i12)).serializeToStream(serializedData);
                }
            }
            f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j3 = this.a;
        long j10 = this.b;
        int i13 = this.g;
        int i14 = this.h;
        int i15 = this.i;
        int i16 = this.m;
        int i17 = this.k;
        int i18 = this.l;
        long j11 = this.v;
        int i19 = this.n;
        long j12 = this.p;
        String str3 = f10;
        String str4 = this.o;
        StringBuilder t6 = a8.p0.t(j3, "-1_", "_");
        t6.append(j10);
        t6.append("_");
        t6.append(i13);
        t6.append("_");
        t6.append(i14);
        t6.append("_");
        t6.append(i15);
        t6.append("_");
        t6.append(i16);
        t6.append("_");
        t6.append(i17);
        t6.append("_");
        t6.append(i18);
        t6.append("_");
        t6.append(j11);
        t6.append("_");
        t6.append(i19);
        t6.append("_");
        t6.append(j12);
        t6.append("_-");
        return org.telegram.ui.Cells.f1.n(str3, "_", str4, t6);
    }

    public final boolean c() {
        ye yeVar;
        boolean z9 = this.J;
        ArrayList arrayList = this.b0;
        if (!z9) {
            if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.s && this.a <= 0) {
                long j3 = this.b;
                if (j3 == -1 || j3 == this.r) {
                    return false;
                }
            }
            return true;
        }
        if (this.a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((yeVar = this.H) == null || yeVar.b()) && this.a <= 0)) {
            long j10 = this.b;
            if ((j10 == -1 || j10 == this.r) && this.i == this.l && this.h == this.k) {
                return false;
            }
        }
        return true;
    }
}
