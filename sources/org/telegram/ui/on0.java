package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ on0(qo0 qo0Var, int[] iArr, int[] iArr2, boolean z9, boolean z10, boolean z11) {
        this.e = qo0Var;
        this.f = iArr;
        this.h = iArr2;
        this.b = z9;
        this.c = z10;
        this.d = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.U3;
                photoViewer.U3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z9 = this.b;
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(i10, absolutePath, z9 ? 0 : ((Integer) L0.first).intValue(), z9, 0, 0);
                gfVar.n(L0);
                photoViewer.c2 = 2;
                photoViewer.u2 = false;
                photoViewer.d = new yp0(photoViewer, photoViewer.d, ijVar, gfVar, this.c, this.d);
                photoViewer.p1.f();
                if (photoViewer.T6 == null) {
                    photoViewer.T6 = VelocityTracker.obtain();
                }
                photoViewer.A7 = 3;
                photoViewer.m3(false, false);
                photoViewer.g3(true, false);
                an anVar = photoViewer.k4;
                if (anVar == null || anVar.Z == null || !anVar.T9()) {
                    photoViewer.Q1();
                } else {
                    photoViewer.k4.Z.L();
                }
                photoViewer.L0.setAlpha(org.telegram.messenger.qs.e4);
                photoViewer.e0.setAlpha(1.0f);
                photoViewer.X1(null, null, null, null, null, null, Collections.singletonList(gfVar), 0, null);
                photoViewer.P0.setTranslationY(org.telegram.messenger.g0.L(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.S0.setTranslationY(org.telegram.messenger.g0.L(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.F.setTranslationY(-r0.getHeight());
                photoViewer.Q1.setTranslationY(org.telegram.messenger.g0.L(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.E0();
                photoViewer.d3();
                photoViewer.A7 = 0;
                break;
            default:
                qo0 qo0Var = (qo0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    pq0 pq0Var = qo0Var.b.e0;
                    boolean z10 = this.b;
                    int i13 = (this.c ? 1 : 0) + (z10 ? 1 : 0);
                    boolean z11 = this.d;
                    new org.telegram.ui.Components.hc(pq0Var, null).m(i13 + (z11 ? 1 : 0) > 1 ? org.telegram.ui.Components.gc.w : z11 ? i12 > 1 ? org.telegram.ui.Components.gc.s : org.telegram.ui.Components.gc.r : z10 ? i12 > 1 ? org.telegram.ui.Components.gc.n : org.telegram.ui.Components.gc.h : i12 > 1 ? org.telegram.ui.Components.gc.f : org.telegram.ui.Components.gc.e, i12, -115203550, -1, null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ on0(PhotoViewer photoViewer, File file, boolean z9, org.telegram.messenger.ij ijVar, boolean z10, boolean z11) {
        this.e = photoViewer;
        this.f = file;
        this.b = z9;
        this.h = ijVar;
        this.c = z10;
        this.d = z11;
    }
}
