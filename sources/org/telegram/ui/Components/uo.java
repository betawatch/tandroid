package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ne1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uo implements ai {
    public final /* synthetic */ bi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ org.telegram.ui.e d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.cc f;
    public final /* synthetic */ org.telegram.ui.zc h;

    public uo(bi biVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.e eVar, long j10, org.telegram.ui.cc ccVar, org.telegram.ui.zc zcVar) {
        this.a = biVar;
        this.b = tL_premium_boostsStatus;
        this.c = p6Var;
        this.d = eVar;
        this.e = j10;
        this.f = ccVar;
        this.h = zcVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.values().iterator().next();
            String str = efVar.h;
            if (str == null) {
                str = efVar.I;
            }
            if (str != null) {
                File file = new File(org.telegram.messenger.b8.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.i0.c1();
                Bitmap K = org.telegram.messenger.hc.K(str, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                to toVar = new to(new ne1(file, file, ""), K, false, 0);
                toVar.W1 = this.b;
                toVar.a.a = this.c;
                toVar.q1 = this.d;
                toVar.G1 = false;
                toVar.F1 = false;
                toVar.o1 = 0.2f;
                toVar.g1(this.e);
                toVar.J1 = new so(biVar, this.f, 0);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                i2Var.e = true;
                this.h.showAsSheet(toVar, i2Var);
                biVar.dismiss();
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean a1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ai
    public final void n0(Object obj) {
        to toVar = new to(obj, null, true, 1);
        toVar.W1 = this.b;
        toVar.a.a = this.c;
        toVar.q1 = this.d;
        toVar.g1(this.e);
        toVar.J1 = new so(this.a, this.f, 1);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
        i2Var.a = true;
        i2Var.e = true;
        this.h.showAsSheet(toVar, i2Var);
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
