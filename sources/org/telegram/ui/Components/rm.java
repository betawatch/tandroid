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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class rm {
    public long i;
    public mm k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public e11 u;
    public long v;
    public final org.telegram.ui.ActionBar.e5 x;
    public final m.c3 y;
    public final /* synthetic */ sm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final tr j = tr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public rm(sm smVar) {
        this.z = smVar;
        org.telegram.ui.ActionBar.d6 d6Var = smVar.P.n;
        Drawable drawable = d6Var != null ? d6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.e5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.c3();
    }

    public static void a(rm rmVar, mm mmVar, boolean z10) {
        ArrayList arrayList = rmVar.h;
        rmVar.k = mmVar;
        if (mmVar == null) {
            return;
        }
        HashMap hashMap = mmVar.b;
        mmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - rmVar.c;
        long j10 = 200;
        if (j3 < 200) {
            float f7 = j3 / 200.0f;
            rmVar.g = AndroidUtilities.lerp(rmVar.g, rmVar.e, f7);
            rmVar.f = AndroidUtilities.lerp(rmVar.f, rmVar.d, f7);
        } else {
            rmVar.g = rmVar.e;
            rmVar.f = rmVar.d;
        }
        rmVar.d = mmVar.c / 1000.0f;
        rmVar.e = mmVar.f;
        rmVar.c = z10 ? elapsedRealtime : 0L;
        rmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            qm qmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j11 = j10;
            int i11 = i10;
            rmVar.i = Math.max(rmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                qm qmVar2 = (qm) arrayList.get(i12);
                if (qmVar2.b == photoEntry) {
                    qmVar = qmVar2;
                    break;
                }
                i12++;
            }
            if (qmVar == null) {
                qm qmVar3 = new qm(rmVar);
                qm.a(qmVar3, photoEntry);
                qm.b(qmVar3, mmVar, groupedMessagePosition, z10);
                arrayList.add(qmVar3);
            } else {
                qm.b(qmVar, mmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j10 = j11;
        }
        long j12 = j10;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            qm qmVar4 = (qm) arrayList.get(i13);
            if (!hashMap.containsKey(qmVar4.b)) {
                if (qmVar4.k > 0.0f || qmVar4.h + j12 > elapsedRealtime) {
                    qm.b(qmVar4, null, null, z10);
                } else {
                    vh.f fVar = qmVar4.s;
                    if (fVar != null) {
                        fVar.b(qmVar4.O.z);
                        qmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        rmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.P.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
