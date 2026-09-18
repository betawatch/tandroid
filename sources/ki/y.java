package ki;

import android.net.Uri;
import b2.k0;
import b2.n0;
import e9.a1;
import e9.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ y(h0 h0Var, long j3, int i10) {
        this.a = i10;
        this.b = h0Var;
        this.c = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        b2.d0 d0Var;
        ?? r32;
        boolean z10;
        char c10;
        b2.f0 f0Var;
        File file;
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                long j10 = this.c;
                if (h0Var.Q == 6) {
                    h0Var.y = j10;
                    h0Var.A = 0L;
                    h0Var.B = j10;
                    h0Var.u(2);
                    h0Var.k.p(h0Var.J, h0Var.y * 1000, h0Var.R);
                    break;
                }
                break;
            default:
                h0 h0Var2 = this.b;
                long j11 = this.c;
                if (h0Var2.Q == 4) {
                    long min = Math.min(h0Var2.m, j11);
                    h0Var2.y = min;
                    h0Var2.A = 0L;
                    h0Var2.B = min;
                    h0Var2.b.setSurfaceTextureListener(null);
                    h0Var2.b.setTransform(h0Var2.g);
                    i2.e0 a2 = new i2.p(h0Var2.a).a();
                    h0Var2.L = a2;
                    a2.v1(h0Var2.b);
                    i2.e0 e0Var = h0Var2.L;
                    Uri fromFile = Uri.fromFile(h0Var2.K);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.e;
                    b2.d0 d0Var2 = new b2.d0();
                    b2.g0 g0Var = b2.g0.d;
                    e2.d.g(b0Var.b == null || b0Var.a != null);
                    if (fromFile != null) {
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        z10 = true;
                        c10 = 2;
                        f0Var = new b2.f0(fromFile, null, b0Var.a != null ? new b2.c0(b0Var) : null, null, list, null, a1Var, -9223372036854775807L);
                    } else {
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        z10 = true;
                        c10 = 2;
                        f0Var = null;
                    }
                    k0 k0Var = new k0("", new b2.a0(yVar), f0Var, new b2.e0(d0Var), n0.K, g0Var);
                    e0Var.getClass();
                    e0Var.I0(i0.z(k0Var));
                    h0Var2.L.j(r32);
                    h0Var2.L.U(1.0f);
                    h0Var2.L.n0(h0Var2.O);
                    h0Var2.L.b();
                    h0Var2.L.W0(5, h0Var2.A);
                    h0Var2.l.b("preview player prepared: durationMs=" + h0Var2.y + ", trim=" + h0Var2.A + ".." + h0Var2.B);
                    h0Var2.u(5);
                    l.d dVar = h0Var2.c;
                    long j12 = h0Var2.y;
                    long j13 = h0Var2.A;
                    long j14 = h0Var2.B;
                    ((a60) dVar.a).s.setProgress(((float) j12) / 60000.0f);
                    ((a60) dVar.a).s.setTrimEnabled(z10);
                    float f7 = j13;
                    float f10 = j14;
                    ((a60) dVar.a).s.g(f7 / 60000.0f, f10 / 60000.0f);
                    ((a60) dVar.a).s.setLoading(r32);
                    a60 a60Var = (a60) dVar.a;
                    a60Var.a0 = r32;
                    a60Var.F.setAlpha(0.0f);
                    h0 h0Var3 = ((a60) dVar.a).J;
                    if (h0Var3 == null) {
                        file = null;
                    } else {
                        h0.r();
                        file = h0Var3.K;
                    }
                    if (file != null) {
                        ((a60) dVar.a).N = a60.o(file, j12, null);
                        a60 a60Var2 = (a60) dVar.a;
                        VideoEditedInfo videoEditedInfo = a60Var2.N;
                        if (j13 <= j3) {
                            j13 = -1;
                        }
                        videoEditedInfo.startTime = j13;
                        if (j14 >= j12) {
                            j14 = -1;
                        }
                        videoEditedInfo.endTime = j14;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(a60Var2.e);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((a60) dVar.a).f);
                        VideoEditedInfo videoEditedInfo2 = ((a60) dVar.a).N;
                        String absolutePath = file.getAbsolutePath();
                        ArrayList arrayList = new ArrayList();
                        Object[] objArr = new Object[4];
                        objArr[r32] = valueOf;
                        objArr[1] = videoEditedInfo2;
                        objArr[c10] = absolutePath;
                        objArr[3] = arrayList;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, objArr);
                        float max = Math.max(1L, j12);
                        ((a60) dVar.a).c(f7 / max, f10 / max);
                    }
                    h0Var2.o();
                    break;
                }
                break;
        }
    }
}
