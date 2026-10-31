package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w20 extends TLObject {
    public static final /* synthetic */ int C = 0;
    public MediaCodecPlayer B;
    public int a;
    public boolean b;
    public boolean c;
    public String d;
    public float e = 1.0f;
    public long f = 0;
    public boolean i = true;
    public float j;
    public float k;
    public int l;
    public int m;
    public long o;
    public vh.q r;
    public FloatBuffer s;
    public FloatBuffer t;
    public org.telegram.ui.Components.s5 u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(vh.n5 n5Var) {
        if (n5Var == null || n5Var.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < n5Var.T.size(); i10++) {
            vh.n5 n5Var2 = (vh.n5) n5Var.T.get(i10);
            w20 w20Var = new w20();
            w20Var.e = 1.0f;
            w20Var.f = 0L;
            w20Var.i = true;
            w20Var.b = n5Var2.K;
            w20Var.c = n5Var2.Y;
            w20Var.d = n5Var2.L.getAbsolutePath();
            w20Var.e = n5Var2.P;
            w20Var.i = n5Var2.U;
            w20Var.f = n5Var2.X;
            w20Var.j = n5Var2.V;
            w20Var.k = n5Var2.W;
            w20Var.l = n5Var2.k0;
            w20Var.m = n5Var2.l0;
            w20Var.o = n5Var2.h0;
            w20Var.r = (vh.q) n5Var.S.e.get(i10);
            arrayList.add(w20Var);
        }
        return arrayList;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        this.a = readInt32;
        this.b = (readInt32 & 1) != 0;
        this.i = (readInt32 & 2) != 0;
        this.c = (readInt32 & 4) != 0;
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readFloat(z10);
        this.f = inputSerializedData.readInt64(z10);
        this.j = inputSerializedData.readFloat(z10);
        this.k = inputSerializedData.readFloat(z10);
        this.l = inputSerializedData.readInt32(z10);
        this.m = inputSerializedData.readInt32(z10);
        this.o = inputSerializedData.readInt64(z10);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i10 = this.b ? this.a | 1 : this.a & (-2);
        this.a = i10;
        int i11 = this.i ? i10 | 2 : i10 & (-3);
        this.a = i11;
        int i12 = this.c ? i11 | 4 : i11 & (-5);
        this.a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeInt64(this.f);
        outputSerializedData.writeFloat(this.j);
        outputSerializedData.writeFloat(this.k);
        outputSerializedData.writeInt32(this.l);
        outputSerializedData.writeInt32(this.m);
        outputSerializedData.writeInt64(this.o);
    }
}
