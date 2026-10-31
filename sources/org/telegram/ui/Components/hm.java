package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hm {
    public long i;
    public dm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public qz0 u;
    public long v;
    public final org.telegram.ui.ActionBar.c5 x;
    public final m.c3 y;
    public final /* synthetic */ im z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final gr j = gr.j;
    public final int l = org.telegram.messenger.i0.L(4.0f);
    public final int m = org.telegram.messenger.i0.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public hm(im imVar) {
        this.z = imVar;
        org.telegram.ui.ActionBar.p6 p6Var = imVar.P.n;
        Drawable drawable = p6Var != null ? p6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.c5) (drawable == null ? org.telegram.ui.ActionBar.t6.R0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(hm hmVar, dm dmVar, boolean z10) {
        ArrayList arrayList = hmVar.h;
        hmVar.k = dmVar;
        if (dmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) dmVar.g;
        dmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - hmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = j10 / 200.0f;
            hmVar.g = org.telegram.messenger.i0.T1(hmVar.g, hmVar.e, f7);
            hmVar.f = org.telegram.messenger.i0.T1(hmVar.f, hmVar.d, f7);
        } else {
            hmVar.g = hmVar.e;
            hmVar.f = hmVar.d;
        }
        hmVar.d = dmVar.b / 1000.0f;
        hmVar.e = dmVar.a;
        hmVar.c = z10 ? elapsedRealtime : 0L;
        hmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            gm gmVar = null;
            if (i10 >= size) {
                break;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i10);
            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) hashMap.get(efVar);
            long j12 = j11;
            int i11 = i10;
            hmVar.i = Math.max(hmVar.i, efVar.N);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                gm gmVar2 = (gm) arrayList.get(i12);
                if (gmVar2.b == efVar) {
                    gmVar = gmVar2;
                    break;
                }
                i12++;
            }
            if (gmVar == null) {
                gm gmVar3 = new gm(hmVar);
                gm.a(gmVar3, efVar);
                gm.b(gmVar3, dmVar, bjVar, z10);
                arrayList.add(gmVar3);
            } else {
                gm.b(gmVar, dmVar, bjVar, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            gm gmVar4 = (gm) arrayList.get(i13);
            if (!hashMap.containsKey(gmVar4.b)) {
                if (gmVar4.k > 0.0f || gmVar4.h + j13 > elapsedRealtime) {
                    gm.b(gmVar4, null, null, z10);
                } else {
                    nh.h hVar = gmVar4.s;
                    if (hVar != null) {
                        hVar.b(gmVar4.O.z);
                        gmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        hmVar.z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.i0.q;
        return this.z.P.getPreviewScale() * org.telegram.messenger.i0.T1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
