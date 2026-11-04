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
import org.telegram.ui.lc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mo implements zh {
    public final /* synthetic */ bi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ org.telegram.ui.f d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.ub f;
    public final /* synthetic */ org.telegram.ui.pc h;

    public mo(bi biVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.f fVar, long j10, org.telegram.ui.ub ubVar, org.telegram.ui.pc pcVar) {
        this.a = biVar;
        this.b = tL_premium_boostsStatus;
        this.c = e6Var;
        this.d = fVar;
        this.e = j10;
        this.f = ubVar;
        this.h = pcVar;
    }

    @Override // org.telegram.ui.Components.zh
    public final void I0(Object obj) {
        lo loVar = new lo(obj, null, true, 1);
        loVar.X1 = this.b;
        loVar.a.a = this.c;
        loVar.r1 = this.d;
        loVar.h1(this.e);
        loVar.K1 = new ko(this.a, this.f, 1);
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
        b2Var.a = true;
        b2Var.e = true;
        this.h.showAsSheet(loVar, b2Var);
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
        bi biVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.b2.getSelectedPhotos();
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
                lo loVar = new lo(new lc1(file, file, ""), K, false, 0);
                loVar.X1 = this.b;
                loVar.a.a = this.c;
                loVar.r1 = this.d;
                loVar.H1 = false;
                loVar.G1 = false;
                loVar.p1 = 0.2f;
                loVar.h1(this.e);
                loVar.K1 = new ko(biVar, this.f, 0);
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                b2Var.a = true;
                b2Var.e = true;
                this.h.showAsSheet(loVar, b2Var);
                biVar.dismiss();
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
