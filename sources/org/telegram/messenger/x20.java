package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.me0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x20 {
    public ff A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public ye H;
    public boolean I;
    public boolean J;
    public vh.m5 K;
    public vh.r L;
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
        String f7;
        ArrayList arrayList;
        if (this.c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
            f7 = "";
        } else {
            int i10 = this.A != null ? zs.A2 : 10;
            String str = this.B;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i10 += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.C;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i10 += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i10);
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
                int i11 = 0;
                while (i11 < 4) {
                    me0 me0Var = (me0) (i11 == 0 ? this.A.p.b : i11 == 1 ? this.A.p.c : i11 == 2 ? this.A.p.d : this.A.p.e);
                    serializedData.writeFloat(me0Var.a);
                    serializedData.writeFloat(me0Var.b);
                    serializedData.writeFloat(me0Var.c);
                    serializedData.writeFloat(me0Var.d);
                    serializedData.writeFloat(me0Var.e);
                    i11++;
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
                for (int i12 = 0; i12 < size; i12++) {
                    ((v20) this.G.get(i12)).b(serializedData, false);
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
            vh.r rVar = this.L;
            if (rVar == null || this.M == null || rVar.e.size() <= 1 || this.M.isEmpty()) {
                serializedData.writeInt32(TLRPC.TL_null.constructor);
            } else {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.a);
                for (int i13 = 0; i13 < this.M.size(); i13++) {
                    ((w20) this.M.get(i13)).serializeToStream(serializedData);
                }
            }
            f7 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j10 = this.a;
        long j11 = this.b;
        int i14 = this.g;
        int i15 = this.h;
        int i16 = this.i;
        int i17 = this.m;
        int i18 = this.k;
        int i19 = this.l;
        long j12 = this.v;
        int i20 = this.n;
        long j13 = this.p;
        String str3 = f7;
        String str4 = this.o;
        StringBuilder s10 = a1.g.s(j10, "-1_", "_");
        s10.append(j11);
        s10.append("_");
        s10.append(i14);
        s10.append("_");
        s10.append(i15);
        s10.append("_");
        s10.append(i16);
        s10.append("_");
        s10.append(i17);
        s10.append("_");
        s10.append(i18);
        s10.append("_");
        s10.append(i19);
        s10.append("_");
        s10.append(j12);
        s10.append("_");
        s10.append(i20);
        s10.append("_");
        s10.append(j13);
        s10.append("_-");
        return a1.g.o(str3, "_", str4, s10);
    }

    public final boolean c() {
        ye yeVar;
        boolean z10 = this.J;
        ArrayList arrayList = this.b0;
        if (!z10) {
            if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.s && this.a <= 0) {
                long j10 = this.b;
                if (j10 == -1 || j10 == this.r) {
                    return false;
                }
            }
            return true;
        }
        if (this.a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((yeVar = this.H) == null || yeVar.b()) && this.a <= 0)) {
            long j11 = this.b;
            if ((j11 == -1 || j11 == this.r) && this.i == this.l && this.h == this.k) {
                return false;
            }
        }
        return true;
    }
}
