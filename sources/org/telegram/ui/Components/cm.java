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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cm {
    public long i;
    public wl k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public pz0 u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 x;
    public final m.f3 y;
    public final /* synthetic */ dm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final er j = er.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public cm(dm dmVar) {
        this.z = dmVar;
        org.telegram.ui.ActionBar.c6 c6Var = dmVar.L.n;
        Drawable drawable = c6Var != null ? c6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.g6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.f3();
    }

    public static void a(cm cmVar, wl wlVar, boolean z10) {
        ArrayList arrayList = cmVar.h;
        cmVar.k = wlVar;
        if (wlVar == null) {
            return;
        }
        HashMap hashMap = wlVar.b;
        wlVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - cmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = j10 / 200.0f;
            cmVar.g = AndroidUtilities.lerp(cmVar.g, cmVar.e, f10);
            cmVar.f = AndroidUtilities.lerp(cmVar.f, cmVar.d, f10);
        } else {
            cmVar.g = cmVar.e;
            cmVar.f = cmVar.d;
        }
        cmVar.d = wlVar.c / 1000.0f;
        cmVar.e = wlVar.f;
        cmVar.c = z10 ? elapsedRealtime : 0L;
        cmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            bm bmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            cmVar.i = Math.max(cmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                bm bmVar2 = (bm) arrayList.get(i12);
                if (bmVar2.b == photoEntry) {
                    bmVar = bmVar2;
                    break;
                }
                i12++;
            }
            if (bmVar == null) {
                bm bmVar3 = new bm(cmVar);
                bm.a(bmVar3, photoEntry);
                bm.b(bmVar3, wlVar, groupedMessagePosition, z10);
                arrayList.add(bmVar3);
            } else {
                bm.b(bmVar, wlVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            bm bmVar4 = (bm) arrayList.get(i13);
            if (!hashMap.containsKey(bmVar4.b)) {
                if (bmVar4.k > 0.0f || bmVar4.h + j13 > elapsedRealtime) {
                    bm.b(bmVar4, null, null, z10);
                } else {
                    eh.j jVar = bmVar4.s;
                    if (jVar != null) {
                        jVar.b(bmVar4.O.z);
                        bmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        cmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.L.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
