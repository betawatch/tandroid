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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nm {
    public long i;
    public hm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public k01 u;
    public long v;
    public final org.telegram.ui.ActionBar.h5 x;
    public final m.e3 y;
    public final /* synthetic */ om z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final pr j = pr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public nm(om omVar) {
        this.z = omVar;
        org.telegram.ui.ActionBar.g6 g6Var = omVar.M.n;
        Drawable drawable = g6Var != null ? g6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.h5) (drawable == null ? org.telegram.ui.ActionBar.k6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.e3();
    }

    public static void a(nm nmVar, hm hmVar, boolean z4) {
        ArrayList arrayList = nmVar.h;
        nmVar.k = hmVar;
        if (hmVar == null) {
            return;
        }
        HashMap hashMap = hmVar.b;
        hmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - nmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = j10 / 200.0f;
            nmVar.g = AndroidUtilities.lerp(nmVar.g, nmVar.e, f10);
            nmVar.f = AndroidUtilities.lerp(nmVar.f, nmVar.d, f10);
        } else {
            nmVar.g = nmVar.e;
            nmVar.f = nmVar.d;
        }
        nmVar.d = hmVar.c / 1000.0f;
        nmVar.e = hmVar.f;
        nmVar.c = z4 ? elapsedRealtime : 0L;
        nmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            mm mmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            nmVar.i = Math.max(nmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                mm mmVar2 = (mm) arrayList.get(i12);
                if (mmVar2.b == photoEntry) {
                    mmVar = mmVar2;
                    break;
                }
                i12++;
            }
            if (mmVar == null) {
                mm mmVar3 = new mm(nmVar);
                mm.a(mmVar3, photoEntry);
                mm.b(mmVar3, hmVar, groupedMessagePosition, z4);
                arrayList.add(mmVar3);
            } else {
                mm.b(mmVar, hmVar, groupedMessagePosition, z4);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            mm mmVar4 = (mm) arrayList.get(i13);
            if (!hashMap.containsKey(mmVar4.b)) {
                if (mmVar4.k > 0.0f || mmVar4.h + j13 > elapsedRealtime) {
                    mm.b(mmVar4, null, null, z4);
                } else {
                    jh.j jVar = mmVar4.s;
                    if (jVar != null) {
                        jVar.b(mmVar4.O.z);
                        mmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        nmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.M.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
