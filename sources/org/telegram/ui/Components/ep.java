package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ep implements qi {
    public final /* synthetic */ lp a;

    public ep(lp lpVar) {
        this.a = lpVar;
    }

    @Override // org.telegram.ui.Components.qi
    public final void R0(Object obj) {
        bp bpVar = new bp(obj, null, true, 3);
        lp lpVar = this.a;
        bpVar.X1 = lpVar.Z1;
        bpVar.h1(lpVar.v1.a());
        bpVar.K1 = new dp(this, 1);
        lp.J0(lpVar, bpVar);
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.qi
    public final void f0(eh ehVar) {
        ehVar.run();
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        lp lpVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = lpVar.S1.e2.getSelectedPhotos();
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
                bp bpVar = new bp(new sc1(file, file, ""), K, false, 2);
                bpVar.X1 = lpVar.Z1;
                bpVar.H1 = false;
                bpVar.G1 = false;
                bpVar.p1 = 0.2f;
                bpVar.h1(lpVar.v1.a());
                bpVar.K1 = new dp(this, 0);
                lp.J0(lpVar, bpVar);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
