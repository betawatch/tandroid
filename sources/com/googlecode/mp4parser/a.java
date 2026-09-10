package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import w7.s6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class a implements f5.b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static qc.c LOG = qc.c.a(a.class);
    private ByteBuffer content;
    long contentStartPosition;
    f dataSource;
    long offset;
    private f5.f parent;
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
            byteBuffer.put(e5.c.d(getType()));
        } else {
            byteBuffer.putInt((int) 1);
            byteBuffer.put(e5.c.d(getType()));
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
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // f5.b
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
        ByteBuffer allocate3 = ByteBuffer.allocate(s6.a(getSize()));
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

    @Override // f5.b
    public f5.f getParent() {
        return this.parent;
    }

    public String getPath() {
        return qc.e.a(this, "");
    }

    @Override // f5.b
    public long getSize() {
        long j3;
        if (!this.isRead) {
            j3 = this.memMapSize;
        } else if (this.isParsed) {
            j3 = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            j3 = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        return j3 + (j3 >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(getType()) ? 16 : 0) + (this.deadBytes != null ? r0.limit() : 0);
    }

    @Override // f5.b
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void parse(f fVar, ByteBuffer byteBuffer, long j3, e5.a aVar) {
        long position = fVar.position();
        this.contentStartPosition = position;
        this.offset = position - byteBuffer.remaining();
        this.memMapSize = j3;
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

    @Override // f5.b
    public void setParent(f5.f fVar) {
        this.parent = fVar;
    }
}
