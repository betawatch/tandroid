// default package

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class as4 extends h00 {
    public final AudioDecoder b;
    public final AudioBufferConverter c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ShortBuffer i;
    public boolean j;

    public as4(String str) {
        this.b = new AudioDecoder(str);
    }

    @Override // h00
    public final short a() {
        if (!this.j) {
            wn4.j("Audio input has no remaining value.");
            return (short) 0;
        }
        int i = this.f;
        if (i < this.e) {
            this.f = i + 1;
            return (short) 0;
        }
        f();
        ShortBuffer shortBuffer = this.i;
        short s = (shortBuffer == null || shortBuffer.remaining() <= 0) ? (short) 0 : this.i.get();
        f();
        ShortBuffer shortBuffer2 = this.i;
        if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
            return s;
        }
        this.j = false;
        return s;
    }

    @Override // h00
    public final int b() {
        return this.b.getSampleRate();
    }

    @Override // h00
    public final boolean c() {
        return this.j;
    }

    @Override // h00
    public final void d() {
        this.i = null;
        this.j = false;
        AudioDecoder audioDecoder = this.b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override // h00
    public final void e(int i, int i2) {
        this.g = i;
        this.h = i2;
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

    public as4(String str, int i) {
        this.b = new AudioDecoder(str, i);
    }
}
