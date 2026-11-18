package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
    public hi.t r;
    public FloatBuffer s;
    public FloatBuffer t;
    public org.telegram.ui.Components.b6 u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(hi.d7 d7Var) {
        if (d7Var == null || d7Var.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < d7Var.T.size(); i7++) {
            hi.d7 d7Var2 = (hi.d7) d7Var.T.get(i7);
            d20 d20Var = new d20();
            d20Var.e = 1.0f;
            d20Var.f = 0L;
            d20Var.i = true;
            d20Var.b = d7Var2.K;
            d20Var.c = d7Var2.Y;
            d20Var.d = d7Var2.L.getAbsolutePath();
            d20Var.e = d7Var2.P;
            d20Var.i = d7Var2.U;
            d20Var.f = d7Var2.X;
            d20Var.j = d7Var2.V;
            d20Var.k = d7Var2.W;
            d20Var.l = d7Var2.k0;
            d20Var.m = d7Var2.l0;
            d20Var.o = d7Var2.h0;
            d20Var.r = (hi.t) d7Var.S.e.get(i7);
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
