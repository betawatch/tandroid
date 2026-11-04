package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.p1;
import com.google.android.gms.internal.cast.q1;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.li;
import org.telegram.messenger.w7;
import org.telegram.messenger.yh;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.uo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k5.a aVar;
        n5.r rVar;
        VisionClearcutLogger visionClearcutLogger;
        int i3 = 0;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                int i10 = this.b;
                Object obj = ((e.a) this.d).a;
                String str = (String) hVar.a.get(Integer.valueOf(i10));
                if (str == null) {
                    return;
                }
                androidx.activity.result.d dVar = (androidx.activity.result.d) hVar.e.get(str);
                if (dVar == null) {
                    hVar.g.remove(str);
                    hVar.f.put(str, obj);
                    return;
                } else {
                    androidx.activity.result.b bVar = dVar.a;
                    if (hVar.d.remove(str)) {
                        bVar.g(obj);
                        return;
                    }
                    return;
                }
            case 1:
                ((h) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.d;
                r4.r rVar2 = (r4.r) this.c;
                int i11 = this.b;
                synchronized (qVar.e) {
                    qVar.N0(rVar2, i11);
                }
                return;
            case 3:
                n0 n0Var = (n0) this.d;
                q1 q1Var = (q1) this.c;
                int i12 = this.b;
                p1 n4 = q1.n(q1Var);
                String str2 = n0Var.d;
                n4.c();
                q1.v((q1) n4.b, str2);
                n4.c();
                q1.w((q1) n4.b, str2);
                Long l10 = n0Var.e;
                if (l10 != null) {
                    int longValue = (int) l10.longValue();
                    n4.c();
                    q1.x((q1) n4.b, longValue);
                }
                q1 q1Var2 = (q1) n4.a();
                int i13 = n0Var.h;
                int i14 = i13 - 1;
                k5.a aVar2 = null;
                if (i13 == 0) {
                    throw null;
                }
                if (i14 != 0) {
                    if (i14 == 1) {
                        aVar = new k5.a(Integer.valueOf(i12 - 1), q1Var2, k5.d.a, null);
                    }
                    n0.i.b("analytics event: %s", aVar2);
                    p6.m.g(aVar2);
                    rVar = n0Var.g;
                    if (rVar == null) {
                        rVar.a(aVar2, new l2.d(27));
                        return;
                    }
                    return;
                }
                aVar = new k5.a(Integer.valueOf(i12 - 1), q1Var2, k5.d.b, null);
                aVar2 = aVar;
                n0.i.b("analytics event: %s", aVar2);
                p6.m.g(aVar2);
                rVar = n0Var.g;
                if (rVar == null) {
                }
            case 4:
                ((TextView) this.d).setTypeface((Typeface) this.c, this.b);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.d;
                while (i3 < arrayList.size()) {
                    ((uo) arrayList.get(i3)).a.m(this.b);
                    i3++;
                }
                g0.h3(new yh(3, this, arrayList));
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.d;
                while (i3 < arrayList2.size()) {
                    if (!((String) this.c).equals(((zi) arrayList2.get(i3)).S0())) {
                        arrayList2.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                if (arrayList2.size() > 0) {
                    w7.G(this.b).l(arrayList2);
                    return;
                }
                return;
            default:
                visionClearcutLogger = ((DynamiteClearcutLogger) this.c).zzc;
                visionClearcutLogger.zza(this.b, (f0) this.d);
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = i3;
    }

    public g(li liVar, ArrayList arrayList, int i3) {
        this.a = 5;
        this.c = liVar;
        this.d = arrayList;
        this.b = i3;
    }
}
