package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r2 {
    public final int a;
    public int c;
    public x d;
    public long e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public String m;
    public int n;
    public int o;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public final /* synthetic */ s2 x;
    public final byte[] b = new byte[androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE];
    public String j = "";
    public final ByteArrayOutputStream p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream q = new ByteArrayOutputStream();

    public r2(s2 s2Var, int i7) {
        this.x = s2Var;
        this.a = i7;
    }

    public final void a() {
        if (this.s < 0 || this.u || this.d == null || !DictationLid.f()) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.p;
        int size = byteArrayOutputStream.size();
        if (size - this.t < 16000) {
            return;
        }
        this.t = size;
        this.u = true;
        int i7 = this.r;
        DictationLid.j(DictationLid.k[this.s], new v1(this, i7, 2), null, byteArrayOutputStream.toByteArray());
    }

    public final void b() {
        r2 r2Var;
        if (this.j.isEmpty()) {
            r2Var = this;
        } else {
            r2Var = this;
            org.telegram.messenger.g0.g3(new o2((Object) r2Var, this.f, (Serializable) this.j, true, 0));
            r2Var.j = "";
        }
        s2 s2Var = r2Var.x;
        long j3 = s2Var.f;
        s2Var.f = 1 + j3;
        r2Var.f = j3;
        r2Var.q.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        if (this.s < 0 || !DictationLid.f()) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.p;
        int size = byteArrayOutputStream.size();
        ByteArrayOutputStream byteArrayOutputStream2 = this.q;
        if (size <= 1920000) {
            byteArrayOutputStream.write(bArr, i7, i10);
            byteArrayOutputStream2.write(bArr, i7, i10);
        } else {
            this.s = -1;
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
        this.r++;
        this.p.reset();
        this.q.reset();
        this.s = this.x.c ? 0 : -1;
        this.t = 0;
        this.o = 0;
        this.v = false;
    }
}
