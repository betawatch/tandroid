package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ap0(aq0 aq0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = aq0Var;
        this.f = iArr;
        this.h = iArr2;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Pair L0 = org.telegram.messenger.i0.L0(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.b;
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(i11, absolutePath, z10 ? 0 : ((Integer) L0.first).intValue(), z10, 0, 0);
                efVar.k(L0);
                photoViewer.c2 = 2;
                photoViewer.u2 = false;
                photoViewer.d = new ir0(photoViewer, photoViewer.d, jjVar, efVar, this.c, this.d);
                photoViewer.p1.f();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.s3(false, false);
                photoViewer.m3(true, false);
                un unVar = photoViewer.l4;
                if (unVar == null || unVar.Z == null || !unVar.J9()) {
                    photoViewer.V1();
                } else {
                    photoViewer.l4.Z.L();
                }
                photoViewer.L0.setAlpha(org.telegram.messenger.zs.e4);
                photoViewer.e0.setAlpha(1.0f);
                photoViewer.c2(null, null, null, null, null, null, Collections.singletonList(efVar), 0, null);
                photoViewer.P0.setTranslationY(org.telegram.messenger.i0.L(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.S0.setTranslationY(org.telegram.messenger.i0.L(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.F.setTranslationY(-r0.getHeight());
                photoViewer.Q1.setTranslationY(org.telegram.messenger.i0.L(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.L0();
                photoViewer.j3();
                photoViewer.B7 = 0;
                break;
            default:
                aq0 aq0Var = (aq0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    as0 as0Var = aq0Var.b.e0;
                    boolean z11 = this.b;
                    int i14 = (this.c ? 1 : 0) + (z11 ? 1 : 0);
                    boolean z12 = this.d;
                    new org.telegram.ui.Components.cc(as0Var, null).m(i14 + (z12 ? 1 : 0) > 1 ? org.telegram.ui.Components.bc.w : z12 ? i13 > 1 ? org.telegram.ui.Components.bc.s : org.telegram.ui.Components.bc.r : z11 ? i13 > 1 ? org.telegram.ui.Components.bc.n : org.telegram.ui.Components.bc.h : i13 > 1 ? org.telegram.ui.Components.bc.f : org.telegram.ui.Components.bc.e, i13, -115203550, -1, null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ap0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.jj jjVar, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f = file;
        this.b = z10;
        this.h = jjVar;
        this.c = z11;
        this.d = z12;
    }
}
