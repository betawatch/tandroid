package com.google.android.exoplayer2.decoder;

import org.telegram.tgnet.TLRPC;

/* loaded from: classes.dex */
public abstract class Buffer {
    private int flags;

    public final void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i) {
        this.flags = (i ^ (-1)) & this.flags;
    }

    protected final boolean getFlag(int i) {
        return (this.flags & i) == i;
    }

    public final boolean hasSupplementalData() {
        return getFlag(TLRPC.FLAG_28);
    }

    public final boolean isDecodeOnly() {
        return getFlag(TLRPC.FLAG_31);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(TLRPC.FLAG_27);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }
}
