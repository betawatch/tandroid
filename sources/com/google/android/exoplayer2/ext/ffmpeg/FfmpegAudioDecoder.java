package com.google.android.exoplayer2.ext.ffmpeg;

import h5.d0;
import h5.w;
import j3.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import n3.g;
import n3.i;
import n3.j;
import n3.l;
import n3.m;
import org.telegram.tgnet.TLObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
@Deprecated
/* loaded from: classes.dex */
public final class FfmpegAudioDecoder extends l {
    public final String n;
    public final byte[] o;
    public final int p;
    public final int q;
    public long r;
    public boolean s;
    public volatile int t;
    public volatile int u;

    public FfmpegAudioDecoder(int i10, n0 n0Var, boolean z4) {
        super(new i[16], new m[16]);
        List list;
        byte[] bArr;
        byte[] bArr2;
        String str = FfmpegLibrary.a;
        n0Var.C.getClass();
        String str2 = n0Var.C;
        String a2 = FfmpegLibrary.a(str2);
        a2.getClass();
        this.n = a2;
        list = n0Var.E;
        switch (str2) {
            case "audio/vorbis":
                byte[] bArr3 = (byte[]) list.get(0);
                byte[] bArr4 = (byte[]) list.get(1);
                byte[] bArr5 = new byte[bArr3.length + bArr4.length + 6];
                bArr5[0] = (byte) (bArr3.length >> 8);
                bArr5[1] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr5, 2, bArr3.length);
                bArr5[bArr3.length + 2] = 0;
                bArr5[bArr3.length + 3] = 0;
                bArr5[bArr3.length + 4] = (byte) (bArr4.length >> 8);
                bArr5[bArr3.length + 5] = (byte) (bArr4.length & 255);
                System.arraycopy(bArr4, 0, bArr5, bArr3.length + 6, bArr4.length);
                bArr = bArr5;
                break;
            case "audio/mp4a-latm":
            case "audio/opus":
                bArr2 = (byte[]) list.get(0);
                bArr = bArr2;
                break;
            case "audio/alac":
                byte[] bArr6 = (byte[]) list.get(0);
                int length = bArr6.length + 12;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.putInt(length);
                allocate.putInt(1634492771);
                allocate.putInt(0);
                allocate.put(bArr6, 0, bArr6.length);
                bArr2 = allocate.array();
                bArr = bArr2;
                break;
            default:
                bArr2 = null;
                bArr = bArr2;
                break;
        }
        this.o = bArr;
        this.p = z4 ? 4 : 2;
        this.q = z4 ? 131072 : 65536;
        long ffmpegInitialize = ffmpegInitialize(a2, bArr, z4, n0Var.Q, n0Var.P);
        this.r = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new p3.a("Initialization failed.");
        }
        int i11 = this.g;
        i[] iVarArr = this.e;
        h5.a.i(i11 == iVarArr.length);
        for (i iVar : iVarArr) {
            iVar.k(i10);
        }
    }

    private native int ffmpegDecode(long j10, ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11);

    private native int ffmpegGetChannelCount(long j10);

    private native int ffmpegGetSampleRate(long j10);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z4, int i10, int i11);

    private native void ffmpegRelease(long j10);

    private native long ffmpegReset(long j10, byte[] bArr);

    @Override // n3.l
    public final i e() {
        return new i(2, FfmpegLibrary.b());
    }

    @Override // n3.l
    public final j f() {
        return new m(new a(this));
    }

    @Override // n3.l
    public final g g(Throwable th2) {
        return new p3.a("Unexpected decode error", th2);
    }

    @Override // n3.l
    public final g h(i iVar, j jVar, boolean z4) {
        m mVar = (m) jVar;
        if (z4) {
            long ffmpegReset = ffmpegReset(this.r, this.o);
            this.r = ffmpegReset;
            if (ffmpegReset == 0) {
                return new p3.a("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = iVar.d;
        int i10 = d0.a;
        int limit = byteBuffer.limit();
        long j10 = iVar.f;
        int i11 = this.q;
        mVar.c = j10;
        ByteBuffer byteBuffer2 = mVar.f;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i11) {
            mVar.f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        }
        mVar.f.position(0);
        mVar.f.limit(i11);
        ByteBuffer byteBuffer3 = mVar.f;
        int ffmpegDecode = ffmpegDecode(this.r, byteBuffer, limit, byteBuffer3, this.q);
        if (ffmpegDecode == -2) {
            return new p3.a("Error decoding (see logcat).");
        }
        if (ffmpegDecode == -1) {
            mVar.b = TLObject.FLAG_31;
            return null;
        }
        if (ffmpegDecode == 0) {
            mVar.b = TLObject.FLAG_31;
            return null;
        }
        if (!this.s) {
            this.t = ffmpegGetChannelCount(this.r);
            this.u = ffmpegGetSampleRate(this.r);
            if (this.u == 0 && "alac".equals(this.n)) {
                this.o.getClass();
                w wVar = new w(this.o);
                wVar.F(this.o.length - 4);
                this.u = wVar.x();
            }
            this.s = true;
        }
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }

    public final String k() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.n;
    }

    @Override // n3.l, n3.e
    public final void release() {
        super.release();
        ffmpegRelease(this.r);
        this.r = 0L;
    }
}
