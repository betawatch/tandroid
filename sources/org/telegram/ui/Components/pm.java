package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pm {
    public long i;
    public lm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public xy0 u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 x;
    public final m.b3 y;
    public final /* synthetic */ qm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final nr j = nr.j;
    public final int l = org.telegram.messenger.g0.L(4.0f);
    public final int m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public pm(qm qmVar) {
        this.z = qmVar;
        org.telegram.ui.ActionBar.h6 h6Var = qmVar.Q.n;
        Drawable drawable = h6Var != null ? h6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMedia") : drawable);
        this.y = new m.b3();
    }

    public static void a(pm pmVar, lm lmVar, boolean z10) {
        ArrayList arrayList = pmVar.h;
        pmVar.k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) lmVar.g;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - pmVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f10 = j3 / 200.0f;
            pmVar.g = org.telegram.messenger.g0.T1(pmVar.g, pmVar.e, f10);
            pmVar.f = org.telegram.messenger.g0.T1(pmVar.f, pmVar.d, f10);
        } else {
            pmVar.g = pmVar.e;
            pmVar.f = pmVar.d;
        }
        pmVar.d = lmVar.b / 1000.0f;
        pmVar.e = lmVar.a;
        pmVar.c = z10 ? elapsedRealtime : 0L;
        pmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            om omVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i7);
            org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) hashMap.get(ffVar);
            long j11 = j10;
            int i10 = i7;
            pmVar.i = Math.max(pmVar.i, ffVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i11);
                if (omVar2.b == ffVar) {
                    omVar = omVar2;
                    break;
                }
                i11++;
            }
            if (omVar == null) {
                om omVar3 = new om(pmVar);
                om.a(omVar3, ffVar);
                om.b(omVar3, lmVar, yiVar, z10);
                arrayList.add(omVar3);
            } else {
                om.b(omVar, lmVar, yiVar, z10);
            }
            i7 = i10 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            om omVar4 = (om) arrayList.get(i12);
            if (!hashMap.containsKey(omVar4.b)) {
                if (omVar4.k > 0.0f || omVar4.h + j12 > elapsedRealtime) {
                    om.b(omVar4, null, null, z10);
                } else {
                    xh.e eVar = omVar4.s;
                    if (eVar != null) {
                        eVar.b(omVar4.O.z);
                        omVar4.s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                }
            }
            i12++;
        }
        pmVar.z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.q;
        return this.z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
