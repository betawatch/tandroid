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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lm {
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
    public final /* synthetic */ mm z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final mr j = mr.j;
    public final int l = AndroidUtilities.dp(4.0f);
    public final int m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public lm(mm mmVar) {
        this.z = mmVar;
        org.telegram.ui.ActionBar.f6 f6Var = mmVar.M.n;
        Drawable drawable = f6Var != null ? f6Var.getDrawable("drawableMsgOutMedia") : null;
        this.x = (org.telegram.ui.ActionBar.g5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.y = new m.f3();
    }

    public static void a(lm lmVar, gm gmVar, boolean z4) {
        ArrayList arrayList = lmVar.h;
        lmVar.k = gmVar;
        if (gmVar == null) {
            return;
        }
        HashMap hashMap = gmVar.b;
        gmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - lmVar.c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = j10 / 200.0f;
            lmVar.g = AndroidUtilities.lerp(lmVar.g, lmVar.e, f10);
            lmVar.f = AndroidUtilities.lerp(lmVar.f, lmVar.d, f10);
        } else {
            lmVar.g = lmVar.e;
            lmVar.f = lmVar.d;
        }
        lmVar.d = gmVar.c / 1000.0f;
        lmVar.e = gmVar.f;
        lmVar.c = z4 ? elapsedRealtime : 0L;
        lmVar.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            km kmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            lmVar.i = Math.max(lmVar.i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                km kmVar2 = (km) arrayList.get(i12);
                if (kmVar2.b == photoEntry) {
                    kmVar = kmVar2;
                    break;
                }
                i12++;
            }
            if (kmVar == null) {
                km kmVar3 = new km(lmVar);
                km.a(kmVar3, photoEntry);
                km.b(kmVar3, gmVar, groupedMessagePosition, z4);
                arrayList.add(kmVar3);
            } else {
                km.b(kmVar, gmVar, groupedMessagePosition, z4);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            km kmVar4 = (km) arrayList.get(i13);
            if (!hashMap.containsKey(kmVar4.b)) {
                if (kmVar4.k > 0.0f || kmVar4.h + j13 > elapsedRealtime) {
                    km.b(kmVar4, null, null, z4);
                } else {
                    ih.j jVar = kmVar4.s;
                    if (jVar != null) {
                        jVar.b(kmVar4.O.z);
                        kmVar4.s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        lmVar.z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.z.M.getPreviewScale() * AndroidUtilities.lerp(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
