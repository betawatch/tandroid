// default package

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class nec extends TLObject {
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
    public zk2 r;
    public FloatBuffer s;
    public FloatBuffer t;
    public lm u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(c8b c8bVar) {
        if (c8bVar == null || c8bVar.T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c8bVar.T.size(); i++) {
            c8b c8bVar2 = (c8b) c8bVar.T.get(i);
            nec necVar = new nec();
            necVar.e = 1.0f;
            necVar.f = 0L;
            necVar.i = true;
            necVar.b = c8bVar2.K;
            necVar.c = c8bVar2.Y;
            necVar.d = c8bVar2.L.getAbsolutePath();
            necVar.e = c8bVar2.P;
            necVar.i = c8bVar2.U;
            necVar.f = c8bVar2.X;
            necVar.j = c8bVar2.V;
            necVar.k = c8bVar2.W;
            necVar.l = c8bVar2.k0;
            necVar.m = c8bVar2.l0;
            necVar.o = c8bVar2.h0;
            necVar.r = (zk2) c8bVar.S.e.get(i);
            arrayList.add(necVar);
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
