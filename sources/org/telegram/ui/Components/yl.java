package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yl {
    public long i;
    public ul k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public my0 u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 x;
    public final m.c3 y;
    public final /* synthetic */ zl z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final wq j = wq.j;
    public final int l = org.telegram.messenger.g0.L(4.0f);
    public final int m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public yl(zl zlVar) {
        this.z = zlVar;
        org.telegram.ui.ActionBar.h6 h6Var = zlVar.P.n;
        Drawable drawable = h6Var != null ? h6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(yl ylVar, ul ulVar, boolean z9) {
        ArrayList arrayList = ylVar.h;
        ylVar.k = ulVar;
        if (ulVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) ulVar.g;
        ulVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - ylVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f10 = j3 / 200.0f;
            ylVar.g = org.telegram.messenger.g0.T1(ylVar.g, ylVar.e, f10);
            ylVar.f = org.telegram.messenger.g0.T1(ylVar.f, ylVar.d, f10);
        } else {
            ylVar.g = ylVar.e;
            ylVar.f = ylVar.d;
        }
        ylVar.d = ulVar.b / 1000.0f;
        ylVar.e = ulVar.a;
        ylVar.c = z9 ? elapsedRealtime : 0L;
        ylVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            xl xlVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList2.get(i7);
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) hashMap.get(gfVar);
            long j11 = j10;
            int i10 = i7;
            ylVar.i = Math.max(ylVar.i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                xl xlVar2 = (xl) arrayList.get(i11);
                if (xlVar2.b == gfVar) {
                    xlVar = xlVar2;
                    break;
                }
                i11++;
            }
            if (xlVar == null) {
                xl xlVar3 = new xl(ylVar);
                xl.a(xlVar3, gfVar);
                xl.b(xlVar3, ulVar, ajVar, z9);
                arrayList.add(xlVar3);
            } else {
                xl.b(xlVar, ulVar, ajVar, z9);
            }
            i7 = i10 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            xl xlVar4 = (xl) arrayList.get(i12);
            if (!hashMap.containsKey(xlVar4.b)) {
                if (xlVar4.k > 0.0f || xlVar4.h + j12 > elapsedRealtime) {
                    xl.b(xlVar4, null, null, z9);
                } else {
                    xh.e eVar = xlVar4.s;
                    if (eVar != null) {
                        eVar.b(xlVar4.O.z);
                        xlVar4.s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                }
            }
            i12++;
        }
        ylVar.z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.q;
        return this.z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
