package ai;

import android.media.AudioRecord;
import java.util.Arrays;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z {
    public final Object a = new Object();
    public byte[] b = new byte[320000];
    public int c;
    public boolean d;
    public AudioRecord e;
    public Thread f;
    public volatile w1 g;
    public double h;
    public int i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.a) {
            try {
                int i10 = this.c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.b;
                if (i10 > bArr2.length) {
                    this.b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.b, this.c, i7);
                this.c += i7;
                this.a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.a) {
            int max = Math.max(0, Math.min(i7, this.c));
            copyOfRange = Arrays.copyOfRange(this.b, max, Math.max(max, Math.min(i10, this.c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.a) {
            i7 = this.c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.a) {
            this.d = true;
            this.a.notifyAll();
        }
        AudioRecord audioRecord = this.e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.e.release();
            this.e = null;
        }
    }
}
