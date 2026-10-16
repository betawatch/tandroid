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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cn {
    public long i;
    public xm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public i11 u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 x;
    public final m.f3 y;
    public final /* synthetic */ dn z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final es j = es.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public cn(dn dnVar) {
        this.z = dnVar;
        org.telegram.ui.ActionBar.c6 c6Var = dnVar.P.n;
        Drawable drawable = c6Var != null ? c6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.g6.P0("drawableMsgOutMedia") : drawable);
        this.y = new m.f3();
    }

    public static void a(cn cnVar, xm xmVar, boolean z10) {
        ArrayList arrayList = cnVar.h;
        cnVar.k = xmVar;
        if (xmVar == null) {
            return;
        }
        HashMap hashMap = xmVar.b;
        xmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - cnVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = j10 / 200.0f;
            cnVar.g = AndroidUtilities.lerp(cnVar.g, cnVar.e, f7);
            cnVar.f = AndroidUtilities.lerp(cnVar.f, cnVar.d, f7);
        } else {
            cnVar.g = cnVar.e;
            cnVar.f = cnVar.d;
        }
        cnVar.d = xmVar.c / 1000.0f;
        cnVar.e = xmVar.f;
        cnVar.c = z10 ? elapsedRealtime : 0L;
        cnVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            bn bnVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            cnVar.i = Math.max(cnVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                bn bnVar2 = (bn) arrayList.get(i12);
                if (bnVar2.b == photoEntry) {
                    bnVar = bnVar2;
                    break;
                }
                i12++;
            }
            if (bnVar == null) {
                bn bnVar3 = new bn(cnVar);
                bn.a(bnVar3, photoEntry);
                bn.b(bnVar3, xmVar, groupedMessagePosition, z10);
                arrayList.add(bnVar3);
            } else {
                bn.b(bnVar, xmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            bn bnVar4 = (bn) arrayList.get(i13);
            if (!hashMap.containsKey(bnVar4.b)) {
                if (bnVar4.k > 0.0f || bnVar4.h + j13 > elapsedRealtime) {
                    bn.b(bnVar4, null, null, z10);
                } else {
                    wh.f fVar = bnVar4.s;
                    if (fVar != null) {
                        fVar.b(bnVar4.O.z);
                        bnVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        cnVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
