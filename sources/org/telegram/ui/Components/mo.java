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
import org.telegram.ui.pc1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class mo implements bi {
    public final /* synthetic */ di a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.f d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.wb f;
    public final /* synthetic */ org.telegram.ui.rc h;

    public mo(di diVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.wb wbVar, org.telegram.ui.rc rcVar) {
        this.a = diVar;
        this.b = tL_premium_boostsStatus;
        this.c = f6Var;
        this.d = fVar;
        this.e = j3;
        this.f = wbVar;
        this.h = rcVar;
    }

    @Override // org.telegram.ui.Components.bi
    public final boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.bi
    public final void M0(Object obj) {
        lo loVar = new lo(obj, null, true, 1);
        loVar.W1 = this.b;
        loVar.a.a = this.c;
        loVar.q1 = this.d;
        loVar.h1(this.e);
        loVar.J1 = new ko(this.a, this.f, 1);
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        d2Var.e = true;
        this.h.showAsSheet(loVar, d2Var);
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
        di diVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = diVar.a2.getSelectedPhotos();
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
                lo loVar = new lo(new pc1(file, file, ""), K, false, 0);
                loVar.W1 = this.b;
                loVar.a.a = this.c;
                loVar.q1 = this.d;
                loVar.G1 = false;
                loVar.F1 = false;
                loVar.o1 = 0.2f;
                loVar.h1(this.e);
                loVar.J1 = new ko(diVar, this.f, 0);
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                d2Var.e = true;
                this.h.showAsSheet(loVar, d2Var);
                diVar.dismiss();
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
