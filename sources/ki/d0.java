package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.t81;
import org.telegram.ui.jk;
import org.telegram.ui.re;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ d0(s0 s0Var, long j3, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        b2.d0 d0Var;
        ?? r32;
        char c10;
        b2.f0 f0Var;
        File file;
        jk jkVar;
        t81 t81Var;
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                long j10 = this.c;
                if (s0Var.W == 6) {
                    s0Var.E = j10;
                    s0Var.K = 0L;
                    s0Var.G = 0L;
                    s0Var.H = j10;
                    s0Var.v(2);
                    s0Var.l.C(s0Var.Q, s0Var.E * 1000, s0Var.p);
                    break;
                }
                break;
            default:
                s0 s0Var2 = this.b;
                long j11 = this.c;
                if (s0Var2.W == 4) {
                    s0Var2.K = j11;
                    long min = Math.min(s0Var2.o, j11);
                    s0Var2.E = min;
                    s0Var2.G = 0L;
                    s0Var2.H = min;
                    s0Var2.b.setSurfaceTextureListener(null);
                    s0Var2.b.setTransform(s0Var2.h);
                    i2.f0 a2 = new i2.p(s0Var2.a).a();
                    s0Var2.S = a2;
                    a2.v1(s0Var2.b);
                    i2.f0 f0Var2 = s0Var2.S;
                    Uri fromFile = Uri.fromFile(s0Var2.R);
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
                        c10 = 2;
                        f0Var = new b2.f0(fromFile, null, b0Var.a != null ? new b2.c0(b0Var) : null, null, list, null, a1Var, -9223372036854775807L);
                    } else {
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        c10 = 2;
                        f0Var = null;
                    }
                    b2.k0 k0Var = new b2.k0("", new b2.a0(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
                    f0Var2.getClass();
                    f0Var2.I0(e9.i0.z(k0Var));
                    s0Var2.S.j(r32);
                    s0Var2.S.U(1.0f);
                    s0Var2.S.n0(s0Var2.V);
                    s0Var2.S.b();
                    s0Var2.S.W0(5, s0Var2.G);
                    s0Var2.m.b("preview player prepared: durationMs=" + s0Var2.E + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.v(5);
                    l2.g gVar = s0Var2.d;
                    long j12 = s0Var2.E;
                    long j13 = s0Var2.G;
                    long j14 = s0Var2.H;
                    ((e60) gVar.b).w.setProgress(((float) j12) / 60000.0f);
                    e60 e60Var = (e60) gVar.b;
                    e60Var.h0 = r32;
                    e60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((e60) gVar.b).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.t();
                        file = s0Var3.R;
                    }
                    if (file != null) {
                        e60 e60Var2 = (e60) gVar.b;
                        e60Var2.U = e60Var2.p(file, j12, null);
                        e60 e60Var3 = (e60) gVar.b;
                        VideoEditedInfo videoEditedInfo = e60Var3.U;
                        videoEditedInfo.startTime = j13 > j3 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(e60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((e60) gVar.b).n);
                        VideoEditedInfo videoEditedInfo2 = ((e60) gVar.b).U;
                        String absolutePath = file.getAbsolutePath();
                        ArrayList arrayList = new ArrayList();
                        Object[] objArr = new Object[4];
                        objArr[0] = valueOf;
                        objArr[1] = videoEditedInfo2;
                        objArr[c10] = absolutePath;
                        objArr[3] = arrayList;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, objArr);
                        float max = Math.max(1L, j12);
                        float f7 = j13 / max;
                        float f10 = j14 / max;
                        j60 j60Var = ((e60) gVar.b).b;
                        if (j60Var != null && (jkVar = ((re) j60Var).b.W) != null && (t81Var = jkVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            t81Var.b = max2;
                            t81Var.c = Math.max(max2, Math.min(1.0f, f10));
                            t81Var.invalidate();
                        }
                    }
                    s0Var2.q();
                    break;
                }
                break;
        }
    }
}
