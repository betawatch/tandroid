package com.googlecode.mp4parser;

import j7.l5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class a implements s2.b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static cc.c LOG = cc.c.a(a.class);
    private ByteBuffer content;
    long contentStartPosition;
    f dataSource;
    long offset;
    private s2.f parent;
    protected String type;
    private byte[] userType;
    long memMapSize = -1;
    private ByteBuffer deadBytes = null;
    boolean isRead = true;
    boolean isParsed = true;

    public a(String str) {
        this.type = str;
    }

    public abstract void _parseDetails(ByteBuffer byteBuffer);

    public final void a(ByteBuffer byteBuffer) {
        if (b()) {
            byteBuffer.putInt((int) getSize());
            byteBuffer.put(r2.c.d(getType()));
        } else {
            byteBuffer.putInt((int) 1);
            byteBuffer.put(r2.c.d(getType()));
            byteBuffer.putLong(getSize());
        }
        if ("uuid".equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    public final boolean b() {
        int i10 = "uuid".equals(getType()) ? 24 : 8;
        if (!this.isRead) {
            return this.memMapSize + ((long) i10) < 4294967296L;
        }
        if (!this.isParsed) {
            return ((long) (this.content.limit() + i10)) < 4294967296L;
        }
        long contentSize = getContentSize();
        ByteBuffer byteBuffer = this.deadBytes;
        return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i10) < 4294967296L;
    }

    public final synchronized void c() {
        try {
            if (!this.isRead) {
                try {
                    LOG.b("mem mapping " + getType());
                    throw null;
                } catch (IOException e6) {
                    throw new RuntimeException(e6);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // s2.b
    public void getBox(WritableByteChannel writableByteChannel) {
        if (!this.isRead) {
            ByteBuffer allocate = ByteBuffer.allocate((b() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            a(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            throw null;
        }
        if (!this.isParsed) {
            ByteBuffer allocate2 = ByteBuffer.allocate((b() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            a(allocate2);
            writableByteChannel.write((ByteBuffer) allocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        ByteBuffer allocate3 = ByteBuffer.allocate(l5.a(getSize()));
        a(allocate3);
        getContent(allocate3);
        ByteBuffer byteBuffer = this.deadBytes;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate3.put(this.deadBytes);
            }
        }
        writableByteChannel.write((ByteBuffer) allocate3.rewind());
    }

    public abstract void getContent(ByteBuffer byteBuffer);

    public abstract long getContentSize();

    public long getOffset() {
        return this.offset;
    }

    @Override // s2.b
    public s2.f getParent() {
        return this.parent;
    }

    public String getPath() {
        return cc.e.a(this, "");
    }

    @Override // s2.b
    public long getSize() {
        long j10;
        if (!this.isRead) {
            j10 = this.memMapSize;
        } else if (this.isParsed) {
            j10 = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            j10 = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        return j10 + (j10 >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(getType()) ? 16 : 0) + (this.deadBytes != null ? r0.limit() : 0);
    }

    @Override // s2.b
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void parse(f fVar, ByteBuffer byteBuffer, long j10, r2.a aVar) {
        long position = fVar.position();
        this.contentStartPosition = position;
        this.offset = position - byteBuffer.remaining();
        this.memMapSize = j10;
        fVar.position();
        fVar.position();
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        try {
            c();
            LOG.b("parsing details of " + getType());
            ByteBuffer byteBuffer = this.content;
            if (byteBuffer != null) {
                this.isParsed = true;
                byteBuffer.rewind();
                _parseDetails(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.deadBytes = byteBuffer.slice();
                }
                this.content = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setDeadBytes(ByteBuffer byteBuffer) {
        this.deadBytes = byteBuffer;
    }

    @Override // s2.b
    public void setParent(s2.f fVar) {
        this.parent = fVar;
    }
}
