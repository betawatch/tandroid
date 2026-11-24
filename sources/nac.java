// default package

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class nac extends TLObject {
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
    public ek2 r;
    public FloatBuffer s;
    public FloatBuffer t;
    public km u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(f4b f4bVar) {
        if (f4bVar == null || f4bVar.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f4bVar.T.size(); i++) {
            f4b f4bVar2 = (f4b) f4bVar.T.get(i);
            nac nacVar = new nac();
            nacVar.e = 1.0f;
            nacVar.f = 0L;
            nacVar.i = true;
            nacVar.b = f4bVar2.K;
            nacVar.c = f4bVar2.Y;
            nacVar.d = f4bVar2.L.getAbsolutePath();
            nacVar.e = f4bVar2.P;
            nacVar.i = f4bVar2.U;
            nacVar.f = f4bVar2.X;
            nacVar.j = f4bVar2.V;
            nacVar.k = f4bVar2.W;
            nacVar.l = f4bVar2.k0;
            nacVar.m = f4bVar2.l0;
            nacVar.o = f4bVar2.h0;
            nacVar.r = (ek2) f4bVar.S.e.get(i);
            arrayList.add(nacVar);
        }
        return arrayList;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        this.a = readInt32;
        this.b = (readInt32 & 1) != 0;
        this.i = (readInt32 & 2) != 0;
        this.c = (readInt32 & 4) != 0;
        this.d = inputSerializedData.readString(z);
        this.e = inputSerializedData.readFloat(z);
        this.f = inputSerializedData.readInt64(z);
        this.j = inputSerializedData.readFloat(z);
        this.k = inputSerializedData.readFloat(z);
        this.l = inputSerializedData.readInt32(z);
        this.m = inputSerializedData.readInt32(z);
        this.o = inputSerializedData.readInt64(z);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z = this.b;
        int i = this.a;
        int i2 = z ? i | 1 : i & (-2);
        this.a = i2;
        int i3 = this.i ? i2 | 2 : i2 & (-3);
        this.a = i3;
        int i4 = this.c ? i3 | 4 : i3 & (-5);
        this.a = i4;
        outputSerializedData.writeInt32(i4);
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
