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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zm {
    public long i;
    public um k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public f11 u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 x;
    public final m.e3 y;
    public final /* synthetic */ an z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final bs j = bs.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public zm(an anVar) {
        this.z = anVar;
        org.telegram.ui.ActionBar.d6 d6Var = anVar.P.n;
        Drawable drawable = d6Var != null ? d6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.h6.P0("drawableMsgOutMedia") : drawable);
        this.y = new m.e3();
    }

    public static void a(zm zmVar, um umVar, boolean z10) {
        ArrayList arrayList = zmVar.h;
        zmVar.k = umVar;
        if (umVar == null) {
            return;
        }
        HashMap hashMap = umVar.b;
        umVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - zmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = j10 / 200.0f;
            zmVar.g = AndroidUtilities.lerp(zmVar.g, zmVar.e, f7);
            zmVar.f = AndroidUtilities.lerp(zmVar.f, zmVar.d, f7);
        } else {
            zmVar.g = zmVar.e;
            zmVar.f = zmVar.d;
        }
        zmVar.d = umVar.c / 1000.0f;
        zmVar.e = umVar.f;
        zmVar.c = z10 ? elapsedRealtime : 0L;
        zmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            ym ymVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            zmVar.i = Math.max(zmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                ym ymVar2 = (ym) arrayList.get(i12);
                if (ymVar2.b == photoEntry) {
                    ymVar = ymVar2;
                    break;
                }
                i12++;
            }
            if (ymVar == null) {
                ym ymVar3 = new ym(zmVar);
                ym.a(ymVar3, photoEntry);
                ym.b(ymVar3, umVar, groupedMessagePosition, z10);
                arrayList.add(ymVar3);
            } else {
                ym.b(ymVar, umVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            ym ymVar4 = (ym) arrayList.get(i13);
            if (!hashMap.containsKey(ymVar4.b)) {
                if (ymVar4.k > 0.0f || ymVar4.h + j13 > elapsedRealtime) {
                    ym.b(ymVar4, null, null, z10);
                } else {
                    wh.f fVar = ymVar4.s;
                    if (fVar != null) {
                        fVar.b(ymVar4.O.z);
                        ymVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        zmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
