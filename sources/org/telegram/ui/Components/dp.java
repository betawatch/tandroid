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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dp implements ri {
    public final /* synthetic */ kp a;

    public dp(kp kpVar) {
        this.a = kpVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void O0(Object obj) {
        ap apVar = new ap(obj, null, true, 3);
        kp kpVar = this.a;
        apVar.X1 = kpVar.Z1;
        apVar.h1(kpVar.v1.a());
        apVar.K1 = new cp(this, 1);
        kp.J0(kpVar, apVar);
    }

    @Override // org.telegram.ui.Components.ri
    public final void S(fh fhVar) {
        fhVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ri
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        kp kpVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = kpVar.S1.e2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.values().iterator().next();
            String str = efVar.h;
            if (str == null) {
                str = efVar.I;
            }
            if (str != null) {
                File file = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.g0.c1();
                Bitmap K = org.telegram.messenger.ec.K(str, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                ap apVar = new ap(new qc1(file, file, ""), K, false, 2);
                apVar.X1 = kpVar.Z1;
                apVar.H1 = false;
                apVar.G1 = false;
                apVar.p1 = 0.2f;
                apVar.h1(kpVar.v1.a());
                apVar.K1 = new cp(this, 0);
                kp.J0(kpVar, apVar);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
