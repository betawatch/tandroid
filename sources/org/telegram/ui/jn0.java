package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jn0(ho0 ho0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = ho0Var;
        this.f = iArr;
        this.h = iArr2;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i3) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.W3;
                photoViewer.W3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.b;
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(i10, absolutePath, z10 ? 0 : ((Integer) L0.first).intValue(), z10, 0, 0);
                yeVar.n(L0);
                photoViewer.d2 = 2;
                photoViewer.v2 = false;
                photoViewer.d = new pp0(photoViewer, photoViewer.d, ziVar, yeVar, this.c, this.d);
                photoViewer.q1.f();
                if (photoViewer.V6 == null) {
                    photoViewer.V6 = VelocityTracker.obtain();
                }
                photoViewer.C7 = 3;
                photoViewer.s3(false, false);
                photoViewer.m3(true, false);
                wm wmVar = photoViewer.m4;
                if (wmVar == null || wmVar.a0 == null || !wmVar.T9()) {
                    photoViewer.V1();
                } else {
                    photoViewer.m4.a0.L();
                }
                photoViewer.M0.setAlpha(org.telegram.messenger.hs.e4);
                photoViewer.f0.setAlpha(1.0f);
                photoViewer.c2(null, null, null, null, null, null, Collections.singletonList(yeVar), 0, null);
                photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(photoViewer.s1 ? 154.0f : 96.0f));
                photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(photoViewer.s1 ? 154.0f : 96.0f));
                photoViewer.G.setTranslationY(-r0.getHeight());
                photoViewer.R1.setTranslationY(org.telegram.messenger.g0.L(photoViewer.s1 ? 154.0f : 96.0f));
                photoViewer.L0();
                photoViewer.j3();
                photoViewer.C7 = 0;
                break;
            default:
                ho0 ho0Var = (ho0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    gq0 gq0Var = ho0Var.b.f0;
                    boolean z11 = this.b;
                    int i13 = (this.c ? 1 : 0) + (z11 ? 1 : 0);
                    boolean z12 = this.d;
                    new org.telegram.ui.Components.fc(gq0Var, null).m(i13 + (z12 ? 1 : 0) > 1 ? org.telegram.ui.Components.ec.w : z12 ? i12 > 1 ? org.telegram.ui.Components.ec.s : org.telegram.ui.Components.ec.r : z11 ? i12 > 1 ? org.telegram.ui.Components.ec.n : org.telegram.ui.Components.ec.h : i12 > 1 ? org.telegram.ui.Components.ec.f : org.telegram.ui.Components.ec.e, i12, -115203550, -1, null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jn0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.zi ziVar, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f = file;
        this.b = z10;
        this.h = ziVar;
        this.c = z11;
        this.d = z12;
    }
}
