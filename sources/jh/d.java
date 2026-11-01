package jh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ff;
import org.telegram.messenger.i0;
import org.telegram.messenger.jc;
import org.telegram.messenger.qz;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d extends ih.f {
    public final ff b;
    public final qz c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(qz qzVar) {
        jc jcVar;
        jc jcVar2;
        this.c = qzVar;
        ff ffVar = qzVar.y;
        this.b = ffVar;
        this.a.J0(i0.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.G0(0, 0, true);
        String str = ffVar.g;
        int i10 = ffVar.C;
        String str2 = ffVar.I;
        if (str != null) {
            jcVar = jc.g(str);
        } else {
            String str3 = ffVar.c;
            if (str3 != null) {
                jcVar = jc.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                jcVar = null;
            } else {
                if (!ffVar.b || ffVar.d()) {
                    jc g10 = jc.g("thumb://" + i10 + ":" + str2);
                    imageReceiver.G0(ffVar.J, ffVar.K, true);
                    jcVar2 = g10;
                    if (jcVar2 == null) {
                        imageReceiver.q0(jcVar2, null, null, null, null, 0);
                        return;
                    } else {
                        imageReceiver.f();
                        return;
                    }
                }
                jcVar = jc.g("vthumb://" + i10 + ":" + str2);
            }
        }
        jcVar2 = jcVar;
        if (jcVar2 == null) {
        }
    }

    @Override // ih.f
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i10, i11);
        imageReceiver.h(canvas, null);
    }
}
