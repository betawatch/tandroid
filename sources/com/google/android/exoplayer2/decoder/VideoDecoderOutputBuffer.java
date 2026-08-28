package com.google.android.exoplayer2.decoder;

import h3.t0;
import java.nio.ByteBuffer;
import k3.j;
import k3.k;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class VideoDecoderOutputBuffer extends k {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public t0 format;
    public int height;
    public int mode;
    private final j owner;
    public ByteBuffer supplementalData;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(j jVar) {
        this.owner = jVar;
    }

    private static boolean isSafeToMultiply(int i9, int i10) {
        if (i9 < 0 || i10 < 0) {
            return false;
        }
        return i10 <= 0 || i9 < ConnectionsManager.DEFAULT_DATACENTER_ID / i10;
    }

    public void init(long j10, int i9, ByteBuffer byteBuffer) {
        this.timeUs = j10;
        this.mode = i9;
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

    public void initForPrivateFrame(int i9, int i10) {
        this.width = i9;
        this.height = i10;
    }

    public boolean initForYuvFrame(int i9, int i10, int i11, int i12, int i13) {
        this.width = i9;
        this.height = i10;
        this.colorspace = i13;
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

    @Override // k3.k
    public void release() {
        this.owner.d(this);
    }
}
