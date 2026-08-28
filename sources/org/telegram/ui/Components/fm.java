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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fm {
    public long i;
    public am k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public nz0 u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 x;
    public final m.f3 y;
    public final /* synthetic */ gm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final gr j = gr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public fm(gm gmVar) {
        this.z = gmVar;
        org.telegram.ui.ActionBar.b6 b6Var = gmVar.L.n;
        Drawable drawable = b6Var != null ? b6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.f6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.f3();
    }

    public static void a(fm fmVar, am amVar, boolean z10) {
        ArrayList arrayList = fmVar.h;
        fmVar.k = amVar;
        if (amVar == null) {
            return;
        }
        HashMap hashMap = amVar.b;
        amVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - fmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = j10 / 200.0f;
            fmVar.g = AndroidUtilities.lerp(fmVar.g, fmVar.e, f10);
            fmVar.f = AndroidUtilities.lerp(fmVar.f, fmVar.d, f10);
        } else {
            fmVar.g = fmVar.e;
            fmVar.f = fmVar.d;
        }
        fmVar.d = amVar.c / 1000.0f;
        fmVar.e = amVar.f;
        fmVar.c = z10 ? elapsedRealtime : 0L;
        fmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i9 = 0;
        while (true) {
            em emVar = null;
            if (i9 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i9);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i10 = i9;
            fmVar.i = Math.max(fmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                em emVar2 = (em) arrayList.get(i11);
                if (emVar2.b == photoEntry) {
                    emVar = emVar2;
                    break;
                }
                i11++;
            }
            if (emVar == null) {
                em emVar3 = new em(fmVar);
                em.a(emVar3, photoEntry);
                em.b(emVar3, amVar, groupedMessagePosition, z10);
                arrayList.add(emVar3);
            } else {
                em.b(emVar, amVar, groupedMessagePosition, z10);
            }
            i9 = i10 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            em emVar4 = (em) arrayList.get(i12);
            if (!hashMap.containsKey(emVar4.b)) {
                if (emVar4.k > 0.0f || emVar4.h + j13 > elapsedRealtime) {
                    em.b(emVar4, null, null, z10);
                } else {
                    dh.k kVar = emVar4.s;
                    if (kVar != null) {
                        kVar.b(emVar4.O.z);
                        emVar4.s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                }
            }
            i12++;
        }
        fmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.L.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
