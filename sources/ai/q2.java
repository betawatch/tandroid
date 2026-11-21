package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q2 {
    public final int a;
    public int c;
    public x d;
    public long e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public final /* synthetic */ r2 t;
    public final byte[] b = new byte[androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE];
    public String j = "";
    public final ByteArrayOutputStream l = new ByteArrayOutputStream();
    public final ByteArrayOutputStream m = new ByteArrayOutputStream();

    public q2(r2 r2Var, int i7) {
        this.t = r2Var;
        this.a = i7;
    }

    public final void a() {
        if (this.o < 0 || this.q || this.d == null || !DictationLid.f()) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.l;
        int size = byteArrayOutputStream.size();
        if (size - this.p < 16000) {
            return;
        }
        this.p = size;
        this.q = true;
        DictationLid.j(byteArrayOutputStream.toByteArray(), DictationLid.j[this.o], new u1(this, this.n, 2));
    }

    public final void b() {
        q2 q2Var;
        if (this.j.isEmpty()) {
            q2Var = this;
        } else {
            q2Var = this;
            org.telegram.messenger.g0.g3(new n2((Object) q2Var, this.f, (Serializable) this.j, true, 0));
            q2Var.j = "";
        }
        r2 r2Var = q2Var.t;
        long j3 = r2Var.f;
        r2Var.f = 1 + j3;
        q2Var.f = j3;
        q2Var.m.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        if (this.o < 0 || !DictationLid.f()) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.l;
        int size = byteArrayOutputStream.size();
        ByteArrayOutputStream byteArrayOutputStream2 = this.m;
        if (size <= 1920000) {
            byteArrayOutputStream.write(bArr, i7, i10);
            byteArrayOutputStream2.write(bArr, i7, i10);
        } else {
            this.o = -1;
            byteArrayOutputStream.reset();
            byteArrayOutputStream2.reset();
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, bArr2, 0, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE);
            this.c = androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE;
        } else {
            int min = Math.min(this.c, 16000 - i10);
            System.arraycopy(bArr2, this.c - min, bArr2, 0, min);
            System.arraycopy(bArr, i7, bArr2, min, i10);
            this.c = min + i10;
        }
    }

    public final void e() {
        this.n++;
        this.l.reset();
        this.m.reset();
        this.o = this.t.c ? 0 : -1;
        this.p = 0;
        this.r = false;
    }
}
