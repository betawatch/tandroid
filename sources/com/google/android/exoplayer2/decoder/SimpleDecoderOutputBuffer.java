package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import k3.j;
import k3.k;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SimpleDecoderOutputBuffer extends k {
    public ByteBuffer data;
    private final j owner;

    public SimpleDecoderOutputBuffer(j jVar) {
        this.owner = jVar;
    }

    @Override // k3.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j10, int i9) {
        this.timeUs = j10;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            this.data = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i9);
        return this.data;
    }

    @Override // k3.k
    public void release() {
        this.owner.d(this);
    }
}
