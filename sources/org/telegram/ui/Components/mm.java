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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mm {
    public long i;
    public gm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public k01 u;
    public long v;
    public final org.telegram.ui.ActionBar.g5 x;
    public final m.f3 y;
    public final /* synthetic */ nm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final nr j = nr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public mm(nm nmVar) {
        this.z = nmVar;
        org.telegram.ui.ActionBar.f6 f6Var = nmVar.M.n;
        Drawable drawable = f6Var != null ? f6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.g5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.f3();
    }

    public static void a(mm mmVar, gm gmVar, boolean z4) {
        ArrayList arrayList = mmVar.h;
        mmVar.k = gmVar;
        if (gmVar == null) {
            return;
        }
        HashMap hashMap = gmVar.b;
        gmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - mmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = j10 / 200.0f;
            mmVar.g = AndroidUtilities.lerp(mmVar.g, mmVar.e, f10);
            mmVar.f = AndroidUtilities.lerp(mmVar.f, mmVar.d, f10);
        } else {
            mmVar.g = mmVar.e;
            mmVar.f = mmVar.d;
        }
        mmVar.d = gmVar.c / 1000.0f;
        mmVar.e = gmVar.f;
        mmVar.c = z4 ? elapsedRealtime : 0L;
        mmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            lm lmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            mmVar.i = Math.max(mmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                lm lmVar2 = (lm) arrayList.get(i12);
                if (lmVar2.b == photoEntry) {
                    lmVar = lmVar2;
                    break;
                }
                i12++;
            }
            if (lmVar == null) {
                lm lmVar3 = new lm(mmVar);
                lm.a(lmVar3, photoEntry);
                lm.b(lmVar3, gmVar, groupedMessagePosition, z4);
                arrayList.add(lmVar3);
            } else {
                lm.b(lmVar, gmVar, groupedMessagePosition, z4);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            lm lmVar4 = (lm) arrayList.get(i13);
            if (!hashMap.containsKey(lmVar4.b)) {
                if (lmVar4.k > 0.0f || lmVar4.h + j13 > elapsedRealtime) {
                    lm.b(lmVar4, null, null, z4);
                } else {
                    ih.j jVar = lmVar4.s;
                    if (jVar != null) {
                        jVar.b(lmVar4.O.z);
                        lmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        mmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.M.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
