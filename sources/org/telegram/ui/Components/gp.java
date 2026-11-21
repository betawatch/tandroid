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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gp implements si {
    public final /* synthetic */ np a;

    public gp(np npVar) {
        this.a = npVar;
    }

    @Override // org.telegram.ui.Components.si
    public final void R0(Object obj) {
        dp dpVar = new dp(obj, null, true, 3);
        np npVar = this.a;
        dpVar.X1 = npVar.Z1;
        dpVar.h1(npVar.v1.a());
        dpVar.K1 = new fp(this, 1);
        np.J0(npVar, dpVar);
    }

    @Override // org.telegram.ui.Components.si
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.si
    public final void f0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        np npVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = npVar.S1.e2.getSelectedPhotos();
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
                dp dpVar = new dp(new sc1(file, file, ""), K, false, 2);
                dpVar.X1 = npVar.Z1;
                dpVar.H1 = false;
                dpVar.G1 = false;
                dpVar.p1 = 0.2f;
                dpVar.h1(npVar.v1.a());
                dpVar.K1 = new fp(this, 0);
                np.J0(npVar, dpVar);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
