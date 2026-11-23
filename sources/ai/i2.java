package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i2 {
    public final int a;
    public int c;
    public u d;
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
    public final /* synthetic */ j2 x;
    public final byte[] b = new byte[androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE];
    public String j = "";
    public final ByteArrayOutputStream p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream q = new ByteArrayOutputStream();

    public i2(j2 j2Var, int i7) {
        this.x = j2Var;
        this.a = i7;
    }

    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.p;
        if (this.s < 0 || this.u || this.d == null || DictationLid.c == 0) {
            return;
        }
        int size = byteArrayOutputStream.size();
        if (size - this.t < 16000) {
            return;
        }
        this.t = size;
        this.u = true;
        int i7 = this.r;
        DictationLid.h(DictationLid.j[this.s], new n1(this, i7, 1), null, byteArrayOutputStream.toByteArray());
    }

    public final void b() {
        i2 i2Var;
        if (this.j.isEmpty()) {
            i2Var = this;
        } else {
            i2Var = this;
            org.telegram.messenger.g0.g3(new f2((Object) i2Var, this.f, (Serializable) this.j, true, 0));
            i2Var.j = "";
        }
        j2 j2Var = i2Var.x;
        long j3 = j2Var.f;
        j2Var.f = 1 + j3;
        i2Var.f = j3;
        i2Var.q.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = this.q;
        ByteArrayOutputStream byteArrayOutputStream2 = this.p;
        if (this.s < 0 || DictationLid.c == 0) {
            return;
        }
        if (byteArrayOutputStream2.size() <= 1920000) {
            byteArrayOutputStream2.write(bArr, i7, i10);
            byteArrayOutputStream.write(bArr, i7, i10);
        } else {
            this.s = -1;
            byteArrayOutputStream2.reset();
            byteArrayOutputStream.reset();
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
