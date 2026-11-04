package androidx.media3.decoder;

import d2.v;
import j2.i;
import j2.j;
import java.nio.ByteBuffer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class VideoDecoderOutputBuffer extends j {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public long decoderPrivate;
    public v format;
    public int height;
    public int mode;
    private final i owner;
    public ByteBuffer supplementalData;
    public int uvStride;
    public int width;
    public int yStride;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(i iVar) {
        this.owner = iVar;
    }

    private static boolean isSafeToMultiply(int i3, int i10) {
        if (i3 < 0 || i10 < 0) {
            return false;
        }
        return i10 <= 0 || i3 < ConnectionsManager.DEFAULT_DATACENTER_ID / i10;
    }

    public void init(long j10, int i3, ByteBuffer byteBuffer) {
        this.timeUs = j10;
        this.mode = i3;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.supplementalData = null;
            return;
        }
        addFlag(TLObject.FLAG_28);
        int limit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 == null || byteBuffer2.capacity() < limit) {
            this.supplementalData = ByteBuffer.allocate(limit);
        } else {
            this.supplementalData.clear();
        }
        this.supplementalData.put(byteBuffer);
        this.supplementalData.flip();
        byteBuffer.position(0);
    }

    public boolean initForOffsetFrames(int i3, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (this.yuvPlanes == null) {
            this.yuvPlanes = new ByteBuffer[3];
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            return false;
        }
        this.width = i10;
        this.height = i11;
        this.colorspace = i14;
        ByteBuffer[] byteBufferArr = this.yuvPlanes;
        int i16 = i12 * i11;
        int i17 = (i11 >> 1) * i13;
        int i18 = i12 * i15;
        byteBuffer.position(i3);
        ByteBuffer slice = byteBuffer.slice();
        byteBufferArr[0] = slice;
        slice.limit(i16);
        byteBuffer.position(i18 + i3);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBufferArr[1] = slice2;
        slice2.limit(i17);
        byteBuffer.position(i18 + ((i15 >> 1) * i13) + i3);
        ByteBuffer slice3 = byteBuffer.slice();
        byteBufferArr[2] = slice3;
        slice3.limit(i17);
        if (this.yuvStrides == null) {
            this.yuvStrides = new int[3];
        }
        int[] iArr = this.yuvStrides;
        iArr[0] = i12;
        iArr[1] = i13;
        iArr[2] = i13;
        return true;
    }

    public void initForPrivateFrame(int i3, int i10) {
        this.width = i3;
        this.height = i10;
    }

    public boolean initForYuvFrame(int i3, int i10, int i11, int i12, int i13) {
        this.width = i3;
        this.height = i10;
        this.colorspace = i13;
        this.yStride = i11;
        this.uvStride = i12;
        int i14 = (int) ((i10 + 1) / 2);
        if (isSafeToMultiply(i11, i10) && isSafeToMultiply(i12, i14)) {
            int i15 = i10 * i11;
            int i16 = i14 * i12;
            int i17 = (i16 * 2) + i15;
            if (isSafeToMultiply(i16, 2) && i17 >= i15) {
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i17) {
                    this.data = ByteBuffer.allocateDirect(i17);
                } else {
                    this.data.position(0);
                    this.data.limit(i17);
                }
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.data;
                ByteBuffer[] byteBufferArr = this.yuvPlanes;
                ByteBuffer slice = byteBuffer2.slice();
                byteBufferArr[0] = slice;
                slice.limit(i15);
                byteBuffer2.position(i15);
                ByteBuffer slice2 = byteBuffer2.slice();
                byteBufferArr[1] = slice2;
                slice2.limit(i16);
                byteBuffer2.position(i15 + i16);
                ByteBuffer slice3 = byteBuffer2.slice();
                byteBufferArr[2] = slice3;
                slice3.limit(i16);
                if (this.yuvStrides == null) {
                    this.yuvStrides = new int[3];
                }
                int[] iArr = this.yuvStrides;
                iArr[0] = i11;
                iArr[1] = i12;
                iArr[2] = i12;
                return true;
            }
        }
        return false;
    }

    @Override // j2.j
    public void release() {
        this.owner.a(this);
    }
}
