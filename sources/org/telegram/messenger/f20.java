package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f20 extends TLObject {
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
    public hi.s r;
    public FloatBuffer s;
    public FloatBuffer t;
    public org.telegram.ui.Components.t5 u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(hi.d7 d7Var) {
        if (d7Var == null || d7Var.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < d7Var.T.size(); i7++) {
            hi.d7 d7Var2 = (hi.d7) d7Var.T.get(i7);
            f20 f20Var = new f20();
            f20Var.e = 1.0f;
            f20Var.f = 0L;
            f20Var.i = true;
            f20Var.b = d7Var2.K;
            f20Var.c = d7Var2.Y;
            f20Var.d = d7Var2.L.getAbsolutePath();
            f20Var.e = d7Var2.P;
            f20Var.i = d7Var2.U;
            f20Var.f = d7Var2.X;
            f20Var.j = d7Var2.V;
            f20Var.k = d7Var2.W;
            f20Var.l = d7Var2.k0;
            f20Var.m = d7Var2.l0;
            f20Var.o = d7Var2.h0;
            f20Var.r = (hi.s) d7Var.S.e.get(i7);
            arrayList.add(f20Var);
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
