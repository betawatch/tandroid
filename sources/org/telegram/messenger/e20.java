package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e20 extends TLObject {
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
    public hi.u r;
    public FloatBuffer s;
    public FloatBuffer t;
    public org.telegram.ui.Components.c6 u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(hi.c7 c7Var) {
        if (c7Var == null || c7Var.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c7Var.T.size(); i7++) {
            hi.c7 c7Var2 = (hi.c7) c7Var.T.get(i7);
            e20 e20Var = new e20();
            e20Var.e = 1.0f;
            e20Var.f = 0L;
            e20Var.i = true;
            e20Var.b = c7Var2.K;
            e20Var.c = c7Var2.Y;
            e20Var.d = c7Var2.L.getAbsolutePath();
            e20Var.e = c7Var2.P;
            e20Var.i = c7Var2.U;
            e20Var.f = c7Var2.X;
            e20Var.j = c7Var2.V;
            e20Var.k = c7Var2.W;
            e20Var.l = c7Var2.k0;
            e20Var.m = c7Var2.l0;
            e20Var.o = c7Var2.h0;
            e20Var.r = (hi.u) c7Var.S.e.get(i7);
            arrayList.add(e20Var);
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
        int i7 = this.b ? this.a | 1 : this.a & (-2);
        this.a = i7;
        int i10 = this.i ? i7 | 2 : i7 & (-3);
        this.a = i10;
        int i11 = this.c ? i10 | 4 : i10 & (-5);
        this.a = i11;
        outputSerializedData.writeInt32(i11);
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
