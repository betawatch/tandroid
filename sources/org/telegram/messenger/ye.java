package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ye extends TLObject {
    public Matrix B;
    public boolean C;
    public float a;
    public float b;
    public float d;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public float m;
    public float o;
    public Matrix r;
    public int s;
    public int t;
    public boolean u;
    public float v;
    public int z;
    public float c = 1.0f;
    public float e = 1.0f;
    public float f = 1.0f;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ye clone() {
        ye yeVar = new ye();
        yeVar.a = this.a;
        yeVar.b = this.b;
        yeVar.c = this.c;
        yeVar.d = this.d;
        yeVar.e = this.e;
        yeVar.f = this.f;
        yeVar.i = this.i;
        yeVar.j = this.j;
        yeVar.k = this.k;
        yeVar.l = this.l;
        yeVar.m = this.m;
        yeVar.o = this.o;
        yeVar.r = this.r;
        yeVar.s = this.s;
        yeVar.t = this.t;
        yeVar.u = this.u;
        yeVar.v = this.v;
        yeVar.z = this.z;
        yeVar.C = this.C;
        yeVar.B = this.B;
        return yeVar;
    }

    public final boolean b() {
        Matrix matrix = this.r;
        if (matrix != null && !matrix.isIdentity()) {
            return false;
        }
        Matrix matrix2 = this.B;
        return (matrix2 == null || matrix2.isIdentity()) && this.e == 1.0f && this.f == 1.0f && this.c == 1.0f && this.d == 0.0f && this.i == 0 && this.j == 0 && this.k == 0 && !this.l && this.m == 0.0f && this.o == 0.0f && this.s == 0 && this.t == 0 && !this.u && this.v == 0.0f;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.a = inputSerializedData.readFloat(z10);
        this.b = inputSerializedData.readFloat(z10);
        this.c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.e = inputSerializedData.readFloat(z10);
        this.f = inputSerializedData.readFloat(z10);
        this.i = inputSerializedData.readInt32(z10);
        this.j = inputSerializedData.readInt32(z10);
        this.k = inputSerializedData.readInt32(z10);
        this.l = inputSerializedData.readBool(z10);
        this.m = inputSerializedData.readFloat(z10);
        this.o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            fArr[i10] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.r = matrix;
        matrix.setValues(fArr);
        this.s = inputSerializedData.readInt32(z10);
        this.t = inputSerializedData.readInt32(z10);
        this.u = inputSerializedData.readBool(z10);
        this.v = inputSerializedData.readFloat(z10);
        if (inputSerializedData.readInt32(z10) == 178403937) {
            for (int i11 = 0; i11 < 9; i11++) {
                fArr[i11] = inputSerializedData.readFloat(z10);
            }
            Matrix matrix2 = new Matrix();
            this.B = matrix2;
            matrix2.setValues(fArr);
        }
        this.C = inputSerializedData.readBool(z10);
        this.z = inputSerializedData.readInt32(z10);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.a);
        outputSerializedData.writeFloat(this.b);
        outputSerializedData.writeFloat(this.c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeFloat(this.f);
        outputSerializedData.writeInt32(this.i);
        outputSerializedData.writeInt32(this.j);
        outputSerializedData.writeInt32(this.k);
        outputSerializedData.writeBool(this.l);
        outputSerializedData.writeFloat(this.m);
        outputSerializedData.writeFloat(this.o);
        float[] fArr = new float[9];
        Matrix matrix = this.r;
        if (matrix != null) {
            matrix.getValues(fArr);
        } else {
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = 0.0f;
            }
        }
        for (int i11 = 0; i11 < 9; i11++) {
            outputSerializedData.writeFloat(fArr[i11]);
        }
        outputSerializedData.writeInt32(this.s);
        outputSerializedData.writeInt32(this.t);
        outputSerializedData.writeBool(this.u);
        outputSerializedData.writeFloat(this.v);
        if (this.B == null) {
            outputSerializedData.writeInt32(TLRPC.TL_null.constructor);
        } else {
            outputSerializedData.writeInt32(178403937);
            this.B.getValues(fArr);
            for (int i12 = 0; i12 < 9; i12++) {
                outputSerializedData.writeFloat(fArr[i12]);
            }
        }
        outputSerializedData.writeBool(this.C);
        outputSerializedData.writeInt32(this.z);
    }
}
