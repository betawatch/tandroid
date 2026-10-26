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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class an {
    public long i;
    public vm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public q11 u;
    public long v;
    public final org.telegram.ui.ActionBar.l5 x;
    public final m.d3 y;
    public final /* synthetic */ bn z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final ds j = ds.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public an(bn bnVar) {
        this.z = bnVar;
        org.telegram.ui.ActionBar.u6 u6Var = bnVar.P.n;
        Drawable drawable = u6Var != null ? u6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.l5) (drawable == null ? org.telegram.ui.ActionBar.y6.Q0("drawableMsgOutMedia") : drawable);
        this.y = new m.d3();
    }

    public static void a(an anVar, vm vmVar, boolean z10) {
        ArrayList arrayList = anVar.h;
        anVar.k = vmVar;
        if (vmVar == null) {
            return;
        }
        HashMap hashMap = vmVar.b;
        vmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - anVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = j10 / 200.0f;
            anVar.g = AndroidUtilities.lerp(anVar.g, anVar.e, f7);
            anVar.f = AndroidUtilities.lerp(anVar.f, anVar.d, f7);
        } else {
            anVar.g = anVar.e;
            anVar.f = anVar.d;
        }
        anVar.d = vmVar.c / 1000.0f;
        anVar.e = vmVar.f;
        anVar.c = z10 ? elapsedRealtime : 0L;
        anVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            zm zmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            anVar.i = Math.max(anVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                zm zmVar2 = (zm) arrayList.get(i12);
                if (zmVar2.b == photoEntry) {
                    zmVar = zmVar2;
                    break;
                }
                i12++;
            }
            if (zmVar == null) {
                zm zmVar3 = new zm(anVar);
                zm.a(zmVar3, photoEntry);
                zm.b(zmVar3, vmVar, groupedMessagePosition, z10);
                arrayList.add(zmVar3);
            } else {
                zm.b(zmVar, vmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            zm zmVar4 = (zm) arrayList.get(i13);
            if (!hashMap.containsKey(zmVar4.b)) {
                if (zmVar4.k > 0.0f || zmVar4.h + j13 > elapsedRealtime) {
                    zm.b(zmVar4, null, null, z10);
                } else {
                    xh.f fVar = zmVar4.s;
                    if (fVar != null) {
                        fVar.b(zmVar4.O.z);
                        zmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        anVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
