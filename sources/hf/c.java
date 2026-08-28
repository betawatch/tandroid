package hf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends a {
    public final AudioDecoder b;
    public final AudioBufferConverter c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ShortBuffer i;
    public boolean j;

    public c(String str) {
        this.b = new AudioDecoder(str);
    }

    @Override // hf.a
    public final short a() {
        if (!this.j) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        int i9 = this.f;
        if (i9 < this.e) {
            this.f = i9 + 1;
            return (short) 0;
        }
        f();
        ShortBuffer shortBuffer = this.i;
        short s10 = (shortBuffer == null || shortBuffer.remaining() <= 0) ? (short) 0 : this.i.get();
        f();
        ShortBuffer shortBuffer2 = this.i;
        if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
            return s10;
        }
        this.j = false;
        return s10;
    }

    @Override // hf.a
    public final int b() {
        return this.b.getSampleRate();
    }

    @Override // hf.a
    public final boolean c() {
        return this.j;
    }

    @Override // hf.a
    public final void d() {
        this.i = null;
        this.j = false;
        AudioDecoder audioDecoder = this.b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override // hf.a
    public final void e(int i9, int i10) {
        this.g = i9;
        this.h = i10;
        this.j = true;
        this.b.start();
        this.e = AudioConversions.usToShorts(this.d, this.g, this.h);
        this.f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.i;
        if (shortBuffer == null || shortBuffer.remaining() <= 0) {
            AudioDecoder audioDecoder = this.b;
            AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
            if (decode.index < 0) {
                this.i = null;
                return;
            }
            this.i = this.c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
        }
    }

    public c(String str, int i9) {
        this.b = new AudioDecoder(str, i9);
    }
}
