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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class qm {
    public long i;
    public lm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public v01 u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 x;
    public final m.c3 y;
    public final /* synthetic */ rm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final sr j = sr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public qm(rm rmVar) {
        this.z = rmVar;
        org.telegram.ui.ActionBar.d6 d6Var = rmVar.P.n;
        Drawable drawable = d6Var != null ? d6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.h6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(qm qmVar, lm lmVar, boolean z10) {
        ArrayList arrayList = qmVar.h;
        qmVar.k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = lmVar.b;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - qmVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f7 = j3 / 200.0f;
            qmVar.g = AndroidUtilities.lerp(qmVar.g, qmVar.e, f7);
            qmVar.f = AndroidUtilities.lerp(qmVar.f, qmVar.d, f7);
        } else {
            qmVar.g = qmVar.e;
            qmVar.f = qmVar.d;
        }
        qmVar.d = lmVar.c / 1000.0f;
        qmVar.e = lmVar.f;
        qmVar.c = z10 ? elapsedRealtime : 0L;
        qmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            pm pmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j11 = j10;
            int i11 = i10;
            qmVar.i = Math.max(qmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                pm pmVar2 = (pm) arrayList.get(i12);
                if (pmVar2.b == photoEntry) {
                    pmVar = pmVar2;
                    break;
                }
                i12++;
            }
            if (pmVar == null) {
                pm pmVar3 = new pm(qmVar);
                pm.a(pmVar3, photoEntry);
                pm.b(pmVar3, lmVar, groupedMessagePosition, z10);
                arrayList.add(pmVar3);
            } else {
                pm.b(pmVar, lmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            pm pmVar4 = (pm) arrayList.get(i13);
            if (!hashMap.containsKey(pmVar4.b)) {
                if (pmVar4.k > 0.0f || pmVar4.h + j12 > elapsedRealtime) {
                    pm.b(pmVar4, null, null, z10);
                } else {
                    vh.f fVar = pmVar4.s;
                    if (fVar != null) {
                        fVar.b(pmVar4.O.z);
                        pmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        qmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
