package d4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.a1;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final a1 d = new a1();
    public final a1 e = new a1();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        a1 a1Var = this.d;
        a1Var.a = 0;
        a1Var.b = -1;
        a1Var.c = 0;
        a1 a1Var2 = this.e;
        a1Var2.a = 0;
        a1Var2.b = -1;
        a1Var2.c = 0;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        h5.a.i(this.c == null);
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.a) {
            this.d.d(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.d(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.d(i10);
                this.f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.d(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
