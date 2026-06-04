package com.google.android.gms.common.data;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class AbstractDataBuffer implements DataBuffer {
    protected final DataHolder mDataHolder;

    protected AbstractDataBuffer(DataHolder dataHolder) {
        this.mDataHolder = dataHolder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new DataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
