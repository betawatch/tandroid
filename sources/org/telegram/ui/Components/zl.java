package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zl {
    public long i;
    public vl k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public ny0 u;
    public long v;
    public final org.telegram.ui.ActionBar.t4 x;
    public final m.c3 y;
    public final /* synthetic */ am z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final xq j = xq.j;
    public final int l = org.telegram.messenger.g0.L(4.0f);
    public final int m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public zl(am amVar) {
        this.z = amVar;
        org.telegram.ui.ActionBar.g6 g6Var = amVar.P.n;
        Drawable drawable = g6Var != null ? g6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.t4) (drawable == null ? org.telegram.ui.ActionBar.l6.R0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(zl zlVar, vl vlVar, boolean z9) {
        ArrayList arrayList = zlVar.h;
        zlVar.k = vlVar;
        if (vlVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) vlVar.g;
        vlVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - zlVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f10 = j3 / 200.0f;
            zlVar.g = org.telegram.messenger.g0.T1(zlVar.g, zlVar.e, f10);
            zlVar.f = org.telegram.messenger.g0.T1(zlVar.f, zlVar.d, f10);
        } else {
            zlVar.g = zlVar.e;
            zlVar.f = zlVar.d;
        }
        zlVar.d = vlVar.b / 1000.0f;
        zlVar.e = vlVar.a;
        zlVar.c = z9 ? elapsedRealtime : 0L;
        zlVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            yl ylVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList2.get(i7);
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) hashMap.get(gfVar);
            long j11 = j10;
            int i10 = i7;
            zlVar.i = Math.max(zlVar.i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                yl ylVar2 = (yl) arrayList.get(i11);
                if (ylVar2.b == gfVar) {
                    ylVar = ylVar2;
                    break;
                }
                i11++;
            }
            if (ylVar == null) {
                yl ylVar3 = new yl(zlVar);
                yl.a(ylVar3, gfVar);
                yl.b(ylVar3, vlVar, ajVar, z9);
                arrayList.add(ylVar3);
            } else {
                yl.b(ylVar, vlVar, ajVar, z9);
            }
            i7 = i10 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            yl ylVar4 = (yl) arrayList.get(i12);
            if (!hashMap.containsKey(ylVar4.b)) {
                if (ylVar4.k > 0.0f || ylVar4.h + j12 > elapsedRealtime) {
                    yl.b(ylVar4, null, null, z9);
                } else {
                    xh.e eVar = ylVar4.s;
                    if (eVar != null) {
                        eVar.b(ylVar4.O.z);
                        ylVar4.s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                }
            }
            i12++;
        }
        zlVar.z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.q;
        return this.z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
