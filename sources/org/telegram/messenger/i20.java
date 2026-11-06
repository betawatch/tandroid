package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i20 extends TLObject {
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
    public fi.s r;
    public FloatBuffer s;
    public FloatBuffer t;
    public org.telegram.ui.Components.v5 u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(fi.e7 e7Var) {
        if (e7Var == null || e7Var.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < e7Var.T.size(); i7++) {
            fi.e7 e7Var2 = (fi.e7) e7Var.T.get(i7);
            i20 i20Var = new i20();
            i20Var.e = 1.0f;
            i20Var.f = 0L;
            i20Var.i = true;
            i20Var.b = e7Var2.K;
            i20Var.c = e7Var2.Y;
            i20Var.d = e7Var2.L.getAbsolutePath();
            i20Var.e = e7Var2.P;
            i20Var.i = e7Var2.U;
            i20Var.f = e7Var2.X;
            i20Var.j = e7Var2.V;
            i20Var.k = e7Var2.W;
            i20Var.l = e7Var2.k0;
            i20Var.m = e7Var2.l0;
            i20Var.o = e7Var2.h0;
            i20Var.r = (fi.s) e7Var.S.e.get(i7);
            arrayList.add(i20Var);
        }
        return arrayList;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        this.a = readInt32;
        this.b = (readInt32 & 1) != 0;
        this.i = (readInt32 & 2) != 0;
        this.c = (readInt32 & 4) != 0;
        this.d = inputSerializedData.readString(z9);
        this.e = inputSerializedData.readFloat(z9);
        this.f = inputSerializedData.readInt64(z9);
        this.j = inputSerializedData.readFloat(z9);
        this.k = inputSerializedData.readFloat(z9);
        this.l = inputSerializedData.readInt32(z9);
        this.m = inputSerializedData.readInt32(z9);
        this.o = inputSerializedData.readInt64(z9);
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
