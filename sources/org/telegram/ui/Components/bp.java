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
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bp implements ri {
    public final /* synthetic */ ti a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ org.telegram.ui.f d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.vb f;
    public final /* synthetic */ org.telegram.ui.qc h;

    public bp(ti tiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.vb vbVar, org.telegram.ui.qc qcVar) {
        this.a = tiVar;
        this.b = tL_premium_boostsStatus;
        this.c = i6Var;
        this.d = fVar;
        this.e = j3;
        this.f = vbVar;
        this.h = qcVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void O0(Object obj) {
        ap apVar = new ap(obj, null, true, 1);
        apVar.X1 = this.b;
        apVar.a.a = this.c;
        apVar.r1 = this.d;
        apVar.h1(this.e);
        apVar.K1 = new zo(this.a, this.f, 1);
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
        e2Var.a = true;
        e2Var.e = true;
        this.h.showAsSheet(apVar, e2Var);
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
        ti tiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.e2.getSelectedPhotos();
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
                ap apVar = new ap(new qc1(file, file, ""), K, false, 0);
                apVar.X1 = this.b;
                apVar.a.a = this.c;
                apVar.r1 = this.d;
                apVar.H1 = false;
                apVar.G1 = false;
                apVar.p1 = 0.2f;
                apVar.h1(this.e);
                apVar.K1 = new zo(tiVar, this.f, 0);
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                e2Var.e = true;
                this.h.showAsSheet(apVar, e2Var);
                tiVar.dismiss();
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
