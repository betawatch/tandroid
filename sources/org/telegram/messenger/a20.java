package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a20 extends TLObject {
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
    public gi.s r;
    public FloatBuffer s;
    public FloatBuffer t;
    public org.telegram.ui.Components.t5 u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(gi.f7 f7Var) {
        if (f7Var == null || f7Var.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < f7Var.T.size(); i3++) {
            gi.f7 f7Var2 = (gi.f7) f7Var.T.get(i3);
            a20 a20Var = new a20();
            a20Var.e = 1.0f;
            a20Var.f = 0L;
            a20Var.i = true;
            a20Var.b = f7Var2.K;
            a20Var.c = f7Var2.Y;
            a20Var.d = f7Var2.L.getAbsolutePath();
            a20Var.e = f7Var2.P;
            a20Var.i = f7Var2.U;
            a20Var.f = f7Var2.X;
            a20Var.j = f7Var2.V;
            a20Var.k = f7Var2.W;
            a20Var.l = f7Var2.k0;
            a20Var.m = f7Var2.l0;
            a20Var.o = f7Var2.h0;
            a20Var.r = (gi.s) f7Var.S.e.get(i3);
            arrayList.add(a20Var);
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
        int i3 = this.b ? this.a | 1 : this.a & (-2);
        this.a = i3;
        int i10 = this.i ? i3 | 2 : i3 & (-3);
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
