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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class om {
    public long i;
    public jm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public f01 u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 x;
    public final m.c3 y;
    public final /* synthetic */ pm z;
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

    public om(pm pmVar) {
        this.z = pmVar;
        org.telegram.ui.ActionBar.f6 f6Var = pmVar.P.n;
        Drawable drawable = f6Var != null ? f6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        ArrayList arrayList = omVar.h;
        omVar.k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - omVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f7 = j3 / 200.0f;
            omVar.g = AndroidUtilities.lerp(omVar.g, omVar.e, f7);
            omVar.f = AndroidUtilities.lerp(omVar.f, omVar.d, f7);
        } else {
            omVar.g = omVar.e;
            omVar.f = omVar.d;
        }
        omVar.d = jmVar.c / 1000.0f;
        omVar.e = jmVar.f;
        omVar.c = z10 ? elapsedRealtime : 0L;
        omVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            nm nmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j11 = j10;
            int i11 = i10;
            omVar.i = Math.max(omVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.b == photoEntry) {
                    nmVar = nmVar2;
                    break;
                }
                i12++;
            }
            if (nmVar == null) {
                nm nmVar3 = new nm(omVar);
                nm.a(nmVar3, photoEntry);
                nm.b(nmVar3, jmVar, groupedMessagePosition, z10);
                arrayList.add(nmVar3);
            } else {
                nm.b(nmVar, jmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            nm nmVar4 = (nm) arrayList.get(i13);
            if (!hashMap.containsKey(nmVar4.b)) {
                if (nmVar4.k > 0.0f || nmVar4.h + j12 > elapsedRealtime) {
                    nm.b(nmVar4, null, null, z10);
                } else {
                    wh.g gVar = nmVar4.s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.z);
                        nmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        omVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
