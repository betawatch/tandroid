package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class no implements ai {
    public final /* synthetic */ vo a;

    public no(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ai
    public final void M0(Object obj) {
        ko koVar = new ko(obj, null, true, 3);
        vo voVar = this.a;
        koVar.W1 = voVar.Y1;
        koVar.h1(voVar.u1.a());
        koVar.J1 = new mo(this, 1);
        vo.I0(voVar, koVar);
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
        vo voVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = voVar.R1.d2.getSelectedPhotos();
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
                ko koVar = new ko(new uc1(file, file, ""), K, false, 2);
                koVar.W1 = voVar.Y1;
                koVar.G1 = false;
                koVar.F1 = false;
                koVar.o1 = 0.2f;
                koVar.h1(voVar.u1.a());
                koVar.J1 = new mo(this, 0);
                vo.I0(voVar, koVar);
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
