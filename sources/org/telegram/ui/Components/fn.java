package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fn {
    public long i;
    public an k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public l11 u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 x;
    public final m.c3 y;
    public final /* synthetic */ gn z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final hs j = hs.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public fn(gn gnVar) {
        this.z = gnVar;
        org.telegram.ui.ActionBar.e6 e6Var = gnVar.P.n;
        Drawable drawable = e6Var != null ? e6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.i6.P0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(fn fnVar, an anVar, boolean z10) {
        ArrayList arrayList = fnVar.h;
        fnVar.k = anVar;
        if (anVar == null) {
            return;
        }
        HashMap hashMap = anVar.b;
        anVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - fnVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f7 = j3 / 200.0f;
            fnVar.g = AndroidUtilities.lerp(fnVar.g, fnVar.e, f7);
            fnVar.f = AndroidUtilities.lerp(fnVar.f, fnVar.d, f7);
        } else {
            fnVar.g = fnVar.e;
            fnVar.f = fnVar.d;
        }
        fnVar.d = anVar.c / 1000.0f;
        fnVar.e = anVar.f;
        fnVar.c = z10 ? elapsedRealtime : 0L;
        fnVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            en enVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j11 = j10;
            int i11 = i10;
            fnVar.i = Math.max(fnVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                en enVar2 = (en) arrayList.get(i12);
                if (enVar2.b == photoEntry) {
                    enVar = enVar2;
                    break;
                }
                i12++;
            }
            if (enVar == null) {
                en enVar3 = new en(fnVar);
                en.a(enVar3, photoEntry);
                en.b(enVar3, anVar, groupedMessagePosition, z10);
                arrayList.add(enVar3);
            } else {
                en.b(enVar, anVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            en enVar4 = (en) arrayList.get(i13);
            if (!hashMap.containsKey(enVar4.b)) {
                if (enVar4.k > 0.0f || enVar4.h + j12 > elapsedRealtime) {
                    en.b(enVar4, null, null, z10);
                } else {
                    vh.f fVar = enVar4.s;
                    if (fVar != null) {
                        fVar.b(enVar4.O.z);
                        enVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        fnVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
