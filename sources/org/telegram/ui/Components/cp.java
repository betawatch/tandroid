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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cp implements qi {
    public final /* synthetic */ si a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ org.telegram.ui.f d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.vb f;
    public final /* synthetic */ org.telegram.ui.qc h;

    public cp(si siVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.vb vbVar, org.telegram.ui.qc qcVar) {
        this.a = siVar;
        this.b = tL_premium_boostsStatus;
        this.c = i6Var;
        this.d = fVar;
        this.e = j3;
        this.f = vbVar;
        this.h = qcVar;
    }

    @Override // org.telegram.ui.Components.qi
    public final void R0(Object obj) {
        bp bpVar = new bp(obj, null, true, 1);
        bpVar.X1 = this.b;
        bpVar.a.a = this.c;
        bpVar.r1 = this.d;
        bpVar.h1(this.e);
        bpVar.K1 = new ap(this.a, this.f, 1);
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
        f2Var.a = true;
        f2Var.e = true;
        this.h.showAsSheet(bpVar, f2Var);
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
        si siVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = siVar.e2.getSelectedPhotos();
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
                bp bpVar = new bp(new sc1(file, file, ""), K, false, 0);
                bpVar.X1 = this.b;
                bpVar.a.a = this.c;
                bpVar.r1 = this.d;
                bpVar.H1 = false;
                bpVar.G1 = false;
                bpVar.p1 = 0.2f;
                bpVar.h1(this.e);
                bpVar.K1 = new ap(siVar, this.f, 0);
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                f2Var.a = true;
                f2Var.e = true;
                this.h.showAsSheet(bpVar, f2Var);
                siVar.dismiss();
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
