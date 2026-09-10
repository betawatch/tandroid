package androidx.media3.decoder;

import b2.s;
import h2.i;
import h2.j;
import java.nio.ByteBuffer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class VideoDecoderOutputBuffer extends j {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public long decoderPrivate;
    public s format;
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

    private static boolean isSafeToMultiply(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        return i11 <= 0 || i10 < ConnectionsManager.DEFAULT_DATACENTER_ID / i11;
    }

    public void init(long j3, int i10, ByteBuffer byteBuffer) {
        this.timeUs = j3;
        this.mode = i10;
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

    public boolean initForOffsetFrames(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (this.yuvPlanes == null) {
            this.yuvPlanes = new ByteBuffer[3];
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            return false;
        }
        this.width = i11;
        this.height = i12;
        this.colorspace = i15;
        ByteBuffer[] byteBufferArr = this.yuvPlanes;
        int i17 = i13 * i12;
        int i18 = (i12 >> 1) * i14;
        int i19 = i13 * i16;
        byteBuffer.position(i10);
        ByteBuffer slice = byteBuffer.slice();
        byteBufferArr[0] = slice;
        slice.limit(i17);
        byteBuffer.position(i19 + i10);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBufferArr[1] = slice2;
        slice2.limit(i18);
        byteBuffer.position(i19 + ((i16 >> 1) * i14) + i10);
        ByteBuffer slice3 = byteBuffer.slice();
        byteBufferArr[2] = slice3;
        slice3.limit(i18);
        if (this.yuvStrides == null) {
            this.yuvStrides = new int[3];
        }
        int[] iArr = this.yuvStrides;
        iArr[0] = i13;
        iArr[1] = i14;
        iArr[2] = i14;
        return true;
    }

    public void initForPrivateFrame(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public boolean initForYuvFrame(int i10, int i11, int i12, int i13, int i14) {
        this.width = i10;
        this.height = i11;
        this.colorspace = i14;
        this.yStride = i12;
        this.uvStride = i13;
        int i15 = (int) ((i11 + 1) / 2);
        if (isSafeToMultiply(i12, i11) && isSafeToMultiply(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (isSafeToMultiply(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.data = ByteBuffer.allocateDirect(i18);
                } else {
                    this.data.position(0);
                    this.data.limit(i18);
                }
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.data;
                ByteBuffer[] byteBufferArr = this.yuvPlanes;
                ByteBuffer slice = byteBuffer2.slice();
                byteBufferArr[0] = slice;
                slice.limit(i16);
                byteBuffer2.position(i16);
                ByteBuffer slice2 = byteBuffer2.slice();
                byteBufferArr[1] = slice2;
                slice2.limit(i17);
                byteBuffer2.position(i16 + i17);
                ByteBuffer slice3 = byteBuffer2.slice();
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
        }
        return false;
    }

    @Override // h2.j
    public void release() {
        this.owner.c(this);
    }
}
