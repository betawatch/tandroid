package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class xe extends TLObject {
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
    public final xe clone() {
        xe xeVar = new xe();
        xeVar.a = this.a;
        xeVar.b = this.b;
        xeVar.c = this.c;
        xeVar.d = this.d;
        xeVar.e = this.e;
        xeVar.f = this.f;
        xeVar.i = this.i;
        xeVar.j = this.j;
        xeVar.k = this.k;
        xeVar.l = this.l;
        xeVar.m = this.m;
        xeVar.o = this.o;
        xeVar.r = this.r;
        xeVar.s = this.s;
        xeVar.t = this.t;
        xeVar.u = this.u;
        xeVar.v = this.v;
        xeVar.z = this.z;
        xeVar.C = this.C;
        xeVar.B = this.B;
        return xeVar;
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
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.r = matrix;
        matrix.setValues(fArr);
        this.s = inputSerializedData.readInt32(z10);
        this.t = inputSerializedData.readInt32(z10);
        this.u = inputSerializedData.readBool(z10);
        this.v = inputSerializedData.readFloat(z10);
        if (inputSerializedData.readInt32(z10) == 178403937) {
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = inputSerializedData.readFloat(z10);
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
            for (int i7 = 0; i7 < 9; i7++) {
                fArr[i7] = 0.0f;
            }
        }
        for (int i10 = 0; i10 < 9; i10++) {
            outputSerializedData.writeFloat(fArr[i10]);
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
            for (int i11 = 0; i11 < 9; i11++) {
                outputSerializedData.writeFloat(fArr[i11]);
            }
        }
        outputSerializedData.writeBool(this.C);
        outputSerializedData.writeInt32(this.z);
    }
}
