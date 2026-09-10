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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vm {
    public long i;
    public pm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public t01 u;
    public long v;
    public final org.telegram.ui.ActionBar.h5 x;
    public final m.c3 y;
    public final /* synthetic */ wm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final wr j = wr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public vm(wm wmVar) {
        this.z = wmVar;
        org.telegram.ui.ActionBar.f6 f6Var = wmVar.P.n;
        Drawable drawable = f6Var != null ? f6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.h5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(vm vmVar, pm pmVar, boolean z10) {
        ArrayList arrayList = vmVar.h;
        vmVar.k = pmVar;
        if (pmVar == null) {
            return;
        }
        HashMap hashMap = pmVar.b;
        pmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - vmVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f7 = j3 / 200.0f;
            vmVar.g = AndroidUtilities.lerp(vmVar.g, vmVar.e, f7);
            vmVar.f = AndroidUtilities.lerp(vmVar.f, vmVar.d, f7);
        } else {
            vmVar.g = vmVar.e;
            vmVar.f = vmVar.d;
        }
        vmVar.d = pmVar.c / 1000.0f;
        vmVar.e = pmVar.f;
        vmVar.c = z10 ? elapsedRealtime : 0L;
        vmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            um umVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j11 = j10;
            int i11 = i10;
            vmVar.i = Math.max(vmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                um umVar2 = (um) arrayList.get(i12);
                if (umVar2.b == photoEntry) {
                    umVar = umVar2;
                    break;
                }
                i12++;
            }
            if (umVar == null) {
                um umVar3 = new um(vmVar);
                um.a(umVar3, photoEntry);
                um.b(umVar3, pmVar, groupedMessagePosition, z10);
                arrayList.add(umVar3);
            } else {
                um.b(umVar, pmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            um umVar4 = (um) arrayList.get(i13);
            if (!hashMap.containsKey(umVar4.b)) {
                if (umVar4.k > 0.0f || umVar4.h + j12 > elapsedRealtime) {
                    um.b(umVar4, null, null, z10);
                } else {
                    uh.g gVar = umVar4.s;
                    if (gVar != null) {
                        gVar.b(umVar4.O.z);
                        umVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        vmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
