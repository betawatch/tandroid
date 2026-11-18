package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class nm {
    public long i;
    public jm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public vy0 u;
    public long v;
    public final org.telegram.ui.ActionBar.v4 x;
    public final m.b3 y;
    public final /* synthetic */ om z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final lr j = lr.j;
    public final int l = org.telegram.messenger.g0.L(4.0f);
    public final int m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public nm(om omVar) {
        this.z = omVar;
        org.telegram.ui.ActionBar.i6 i6Var = omVar.Q.n;
        Drawable drawable = i6Var != null ? i6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.v4) (drawable == null ? org.telegram.ui.ActionBar.n6.R0("drawableMsgOutMedia") : drawable);
        this.y = new m.b3();
    }

    public static void a(nm nmVar, jm jmVar, boolean z10) {
        ArrayList arrayList = nmVar.h;
        nmVar.k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) jmVar.g;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - nmVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f10 = j3 / 200.0f;
            nmVar.g = org.telegram.messenger.g0.T1(nmVar.g, nmVar.e, f10);
            nmVar.f = org.telegram.messenger.g0.T1(nmVar.f, nmVar.d, f10);
        } else {
            nmVar.g = nmVar.e;
            nmVar.f = nmVar.d;
        }
        nmVar.d = jmVar.b / 1000.0f;
        nmVar.e = jmVar.a;
        nmVar.c = z10 ? elapsedRealtime : 0L;
        nmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            mm mmVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i7);
            org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) hashMap.get(efVar);
            long j11 = j10;
            int i10 = i7;
            nmVar.i = Math.max(nmVar.i, efVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                mm mmVar2 = (mm) arrayList.get(i11);
                if (mmVar2.b == efVar) {
                    mmVar = mmVar2;
                    break;
                }
                i11++;
            }
            if (mmVar == null) {
                mm mmVar3 = new mm(nmVar);
                mm.a(mmVar3, efVar);
                mm.b(mmVar3, jmVar, xiVar, z10);
                arrayList.add(mmVar3);
            } else {
                mm.b(mmVar, jmVar, xiVar, z10);
            }
            i7 = i10 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            mm mmVar4 = (mm) arrayList.get(i12);
            if (!hashMap.containsKey(mmVar4.b)) {
                if (mmVar4.k > 0.0f || mmVar4.h + j12 > elapsedRealtime) {
                    mm.b(mmVar4, null, null, z10);
                } else {
                    xh.e eVar = mmVar4.s;
                    if (eVar != null) {
                        eVar.b(mmVar4.O.z);
                        mmVar4.s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                }
            }
            i12++;
        }
        nmVar.z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.q;
        return this.z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
