package androidx.media3.decoder;

import java.nio.ByteBuffer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class VideoDecoderOutputBuffer extends u93 {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public long decoderPrivate;
    public ko4 format;
    public int height;
    public int mode;
    private final t93 owner;
    public ByteBuffer supplementalData;
    public int uvStride;
    public int width;
    public int yStride;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(t93 t93Var) {
        this.owner = t93Var;
    }

    private static boolean isSafeToMultiply(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return false;
        }
        return i2 <= 0 || i < ConnectionsManager.DEFAULT_DATACENTER_ID / i2;
    }

    public void init(long j, int i, ByteBuffer byteBuffer) {
        this.timeUs = j;
        this.mode = i;
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

    public boolean initForOffsetFrames(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ByteBuffer[] byteBufferArr = this.yuvPlanes;
        if (byteBufferArr == null) {
            byteBufferArr = new ByteBuffer[3];
            this.yuvPlanes = byteBufferArr;
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            return false;
        }
        this.width = i2;
        this.height = i3;
        this.colorspace = i6;
        int i8 = i4 * i3;
        int i9 = (i3 >> 1) * i5;
        int i10 = i4 * i7;
        byteBuffer.position(i);
        ByteBuffer slice = byteBuffer.slice();
        byteBufferArr[0] = slice;
        slice.limit(i8);
        byteBuffer.position(i10 + i);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBufferArr[1] = slice2;
        slice2.limit(i9);
        byteBuffer.position(i10 + ((i7 >> 1) * i5) + i);
        ByteBuffer slice3 = byteBuffer.slice();
        byteBufferArr[2] = slice3;
        slice3.limit(i9);
        int[] iArr = this.yuvStrides;
        if (iArr == null) {
            iArr = new int[3];
            this.yuvStrides = iArr;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i5;
        return true;
    }

    public void initForPrivateFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        this.yStride = i3;
        this.uvStride = i4;
        int i6 = (int) ((i2 + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i6)) {
            int i7 = i2 * i3;
            int i8 = i6 * i4;
            int i9 = (i8 << 1) + i7;
            if (isSafeToMultiply(i8, 2) && i9 >= i7) {
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i9) {
                    this.data = ByteBuffer.allocateDirect(i9);
                } else {
                    this.data.position(0);
                    this.data.limit(i9);
                }
                ByteBuffer[] byteBufferArr = this.yuvPlanes;
                if (byteBufferArr == null) {
                    byteBufferArr = new ByteBuffer[3];
                    this.yuvPlanes = byteBufferArr;
                }
                ByteBuffer byteBuffer2 = this.data;
                ByteBuffer slice = byteBuffer2.slice();
                byteBufferArr[0] = slice;
                slice.limit(i7);
                byteBuffer2.position(i7);
                ByteBuffer slice2 = byteBuffer2.slice();
                byteBufferArr[1] = slice2;
                slice2.limit(i8);
                byteBuffer2.position(i7 + i8);
                ByteBuffer slice3 = byteBuffer2.slice();
                byteBufferArr[2] = slice3;
                slice3.limit(i8);
                int[] iArr = this.yuvStrides;
                if (iArr == null) {
                    iArr = new int[3];
                    this.yuvStrides = iArr;
                }
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    @Override // u93
    public void release() {
        this.owner.b(this);
    }
}
