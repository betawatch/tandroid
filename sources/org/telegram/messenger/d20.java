package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class d20 extends TLObject {
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
            d20 d20Var = new d20();
            d20Var.e = 1.0f;
            d20Var.f = 0L;
            d20Var.i = true;
            d20Var.b = c7Var2.K;
            d20Var.c = c7Var2.Y;
            d20Var.d = c7Var2.L.getAbsolutePath();
            d20Var.e = c7Var2.P;
            d20Var.i = c7Var2.U;
            d20Var.f = c7Var2.X;
            d20Var.j = c7Var2.V;
            d20Var.k = c7Var2.W;
            d20Var.l = c7Var2.k0;
            d20Var.m = c7Var2.l0;
            d20Var.o = c7Var2.h0;
            d20Var.r = (hi.u) c7Var.S.e.get(i7);
            arrayList.add(d20Var);
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
