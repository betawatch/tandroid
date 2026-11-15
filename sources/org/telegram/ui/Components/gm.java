package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gm {
    public long i;
    public cm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public oy0 u;
    public long v;
    public final org.telegram.ui.ActionBar.r4 x;
    public final m.b3 y;
    public final /* synthetic */ hm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final er j = er.j;
    public final int l = org.telegram.messenger.g0.L(4.0f);
    public final int m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public gm(hm hmVar) {
        this.z = hmVar;
        org.telegram.ui.ActionBar.e6 e6Var = hmVar.Q.n;
        Drawable drawable = e6Var != null ? e6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.r4) (drawable == null ? org.telegram.ui.ActionBar.j6.R0("drawableMsgOutMedia") : drawable);
        this.y = new m.b3();
    }

    public static void a(gm gmVar, cm cmVar, boolean z10) {
        ArrayList arrayList = gmVar.h;
        gmVar.k = cmVar;
        if (cmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) cmVar.g;
        cmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - gmVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f10 = j3 / 200.0f;
            gmVar.g = org.telegram.messenger.g0.T1(gmVar.g, gmVar.e, f10);
            gmVar.f = org.telegram.messenger.g0.T1(gmVar.f, gmVar.d, f10);
        } else {
            gmVar.g = gmVar.e;
            gmVar.f = gmVar.d;
        }
        gmVar.d = cmVar.b / 1000.0f;
        gmVar.e = cmVar.a;
        gmVar.c = z10 ? elapsedRealtime : 0L;
        gmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            fm fmVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i7);
            org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) hashMap.get(ffVar);
            long j11 = j10;
            int i10 = i7;
            gmVar.i = Math.max(gmVar.i, ffVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                fm fmVar2 = (fm) arrayList.get(i11);
                if (fmVar2.b == ffVar) {
                    fmVar = fmVar2;
                    break;
                }
                i11++;
            }
            if (fmVar == null) {
                fm fmVar3 = new fm(gmVar);
                fm.a(fmVar3, ffVar);
                fm.b(fmVar3, cmVar, yiVar, z10);
                arrayList.add(fmVar3);
            } else {
                fm.b(fmVar, cmVar, yiVar, z10);
            }
            i7 = i10 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            fm fmVar4 = (fm) arrayList.get(i12);
            if (!hashMap.containsKey(fmVar4.b)) {
                if (fmVar4.k > 0.0f || fmVar4.h + j12 > elapsedRealtime) {
                    fm.b(fmVar4, null, null, z10);
                } else {
                    xh.e eVar = fmVar4.s;
                    if (eVar != null) {
                        eVar.b(fmVar4.O.z);
                        fmVar4.s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                }
            }
            i12++;
        }
        gmVar.z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.q;
        return this.z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
