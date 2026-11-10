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
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lo implements ai {
    public final /* synthetic */ ci a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ org.telegram.ui.f d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.wb f;
    public final /* synthetic */ org.telegram.ui.rc h;

    public lo(ci ciVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.wb wbVar, org.telegram.ui.rc rcVar) {
        this.a = ciVar;
        this.b = tL_premium_boostsStatus;
        this.c = h6Var;
        this.d = fVar;
        this.e = j3;
        this.f = wbVar;
        this.h = rcVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ai
    public final void M0(Object obj) {
        ko koVar = new ko(obj, null, true, 1);
        koVar.W1 = this.b;
        koVar.a.a = this.c;
        koVar.q1 = this.d;
        koVar.h1(this.e);
        koVar.J1 = new jo(this.a, this.f, 1);
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        d2Var.e = true;
        this.h.showAsSheet(koVar, d2Var);
    }

    @Override // org.telegram.ui.Components.ai
    public final void c0(pg pgVar) {
        pgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        ci ciVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = ciVar.d2.getSelectedPhotos();
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
                ko koVar = new ko(new uc1(file, file, ""), K, false, 0);
                koVar.W1 = this.b;
                koVar.a.a = this.c;
                koVar.q1 = this.d;
                koVar.G1 = false;
                koVar.F1 = false;
                koVar.o1 = 0.2f;
                koVar.h1(this.e);
                koVar.J1 = new jo(ciVar, this.f, 0);
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                d2Var.e = true;
                this.h.showAsSheet(koVar, d2Var);
                ciVar.dismiss();
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
