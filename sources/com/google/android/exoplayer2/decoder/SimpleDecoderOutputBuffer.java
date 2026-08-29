package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import m3.j;
import m3.k;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class SimpleDecoderOutputBuffer extends k {
    public ByteBuffer data;
    private final j owner;

    public SimpleDecoderOutputBuffer(j jVar) {
        this.owner = jVar;
    }

    @Override // m3.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j10, int i10) {
        this.timeUs = j10;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.data = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i10);
        return this.data;
    }

    @Override // m3.k
    public void release() {
        this.owner.a(this);
    }
}
