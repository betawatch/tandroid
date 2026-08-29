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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jm {
    public long i;
    public em k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public zz0 u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 x;
    public final m.f3 y;
    public final /* synthetic */ km z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final jr j = jr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public jm(km kmVar) {
        this.z = kmVar;
        org.telegram.ui.ActionBar.c6 c6Var = kmVar.L.n;
        Drawable drawable = c6Var != null ? c6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.g6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.f3();
    }

    public static void a(jm jmVar, em emVar, boolean z10) {
        ArrayList arrayList = jmVar.h;
        jmVar.k = emVar;
        if (emVar == null) {
            return;
        }
        HashMap hashMap = emVar.b;
        emVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - jmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f9 = j10 / 200.0f;
            jmVar.g = AndroidUtilities.lerp(jmVar.g, jmVar.e, f9);
            jmVar.f = AndroidUtilities.lerp(jmVar.f, jmVar.d, f9);
        } else {
            jmVar.g = jmVar.e;
            jmVar.f = jmVar.d;
        }
        jmVar.d = emVar.c / 1000.0f;
        jmVar.e = emVar.f;
        jmVar.c = z10 ? elapsedRealtime : 0L;
        jmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            im imVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            jmVar.i = Math.max(jmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                im imVar2 = (im) arrayList.get(i12);
                if (imVar2.b == photoEntry) {
                    imVar = imVar2;
                    break;
                }
                i12++;
            }
            if (imVar == null) {
                im imVar3 = new im(jmVar);
                im.a(imVar3, photoEntry);
                im.b(imVar3, emVar, groupedMessagePosition, z10);
                arrayList.add(imVar3);
            } else {
                im.b(imVar, emVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            im imVar4 = (im) arrayList.get(i13);
            if (!hashMap.containsKey(imVar4.b)) {
                if (imVar4.k > 0.0f || imVar4.h + j13 > elapsedRealtime) {
                    im.b(imVar4, null, null, z10);
                } else {
                    gh.j jVar = imVar4.s;
                    if (jVar != null) {
                        jVar.b(imVar4.O.z);
                        imVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        jmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.L.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
