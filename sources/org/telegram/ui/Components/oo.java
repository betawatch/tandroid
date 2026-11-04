package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oo implements zh {
    public final /* synthetic */ vo a;

    public oo(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.Components.zh
    public final void I0(Object obj) {
        lo loVar = new lo(obj, null, true, 3);
        vo voVar = this.a;
        loVar.X1 = voVar.W1;
        loVar.h1(voVar.s1.a());
        loVar.K1 = new no(this, 1);
        vo.I0(voVar, loVar);
    }

    @Override // org.telegram.ui.Components.zh
    public final boolean L1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.zh
    public final void Y(ng ngVar) {
        ngVar.run();
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        vo voVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = voVar.P1.b2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) selectedPhotos.values().iterator().next();
            String str = yeVar.h;
            if (str == null) {
                str = yeVar.I;
            }
            if (str != null) {
                File file = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.g0.c1();
                Bitmap K = org.telegram.messenger.zb.K(str, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                lo loVar = new lo(new lc1(file, file, ""), K, false, 2);
                loVar.X1 = voVar.W1;
                loVar.H1 = false;
                loVar.G1 = false;
                loVar.p1 = 0.2f;
                loVar.h1(voVar.s1.a());
                loVar.K1 = new no(this, 0);
                vo.I0(voVar, loVar);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
