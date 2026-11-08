package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class oo implements bi {
    public final /* synthetic */ vo a;

    public oo(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.Components.bi
    public final boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.bi
    public final void M0(Object obj) {
        lo loVar = new lo(obj, null, true, 3);
        vo voVar = this.a;
        loVar.W1 = voVar.V1;
        loVar.h1(voVar.r1.a());
        loVar.J1 = new no(this, 1);
        vo.I0(voVar, loVar);
    }

    @Override // org.telegram.ui.Components.bi
    public final void c0(qg qgVar) {
        qgVar.run();
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        vo voVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = voVar.O1.a2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.values().iterator().next();
            String str = gfVar.h;
            if (str == null) {
                str = gfVar.I;
            }
            if (str != null) {
                File file = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.g0.c1();
                Bitmap K = org.telegram.messenger.gc.K(str, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                lo loVar = new lo(new qc1(file, file, ""), K, false, 2);
                loVar.W1 = voVar.V1;
                loVar.G1 = false;
                loVar.F1 = false;
                loVar.o1 = 0.2f;
                loVar.h1(voVar.r1.a());
                loVar.J1 = new no(this, 0);
                vo.I0(voVar, loVar);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
