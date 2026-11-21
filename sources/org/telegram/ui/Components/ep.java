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
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ep implements si {
    public final /* synthetic */ ui a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ org.telegram.ui.f d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.vb f;
    public final /* synthetic */ org.telegram.ui.qc h;

    public ep(ui uiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.vb vbVar, org.telegram.ui.qc qcVar) {
        this.a = uiVar;
        this.b = tL_premium_boostsStatus;
        this.c = h6Var;
        this.d = fVar;
        this.e = j3;
        this.f = vbVar;
        this.h = qcVar;
    }

    @Override // org.telegram.ui.Components.si
    public final void R0(Object obj) {
        dp dpVar = new dp(obj, null, true, 1);
        dpVar.X1 = this.b;
        dpVar.a.a = this.c;
        dpVar.r1 = this.d;
        dpVar.h1(this.e);
        dpVar.K1 = new cp(this.a, this.f, 1);
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
        e2Var.a = true;
        e2Var.e = true;
        this.h.showAsSheet(dpVar, e2Var);
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
        ui uiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = uiVar.e2.getSelectedPhotos();
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
                dp dpVar = new dp(new sc1(file, file, ""), K, false, 0);
                dpVar.X1 = this.b;
                dpVar.a.a = this.c;
                dpVar.r1 = this.d;
                dpVar.H1 = false;
                dpVar.G1 = false;
                dpVar.p1 = 0.2f;
                dpVar.h1(this.e);
                dpVar.K1 = new cp(uiVar, this.f, 0);
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                e2Var.e = true;
                this.h.showAsSheet(dpVar, e2Var);
                uiVar.dismiss();
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
