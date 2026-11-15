package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.o1;
import com.google.android.gms.internal.cast.p1;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.ArrayList;
import n2.a0;
import org.telegram.messenger.fi;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.dp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l5.a aVar;
        o5.s sVar;
        VisionClearcutLogger visionClearcutLogger;
        int i7 = 0;
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
                        bVar.f(obj);
                        return;
                    }
                    return;
                }
            case 1:
                ((h) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.d;
                s4.r rVar = (s4.r) this.c;
                int i11 = this.b;
                synchronized (pVar.e) {
                    pVar.n1(rVar, i11);
                }
                return;
            case 3:
                m0 m0Var = (m0) this.d;
                p1 p1Var = (p1) this.c;
                int i12 = this.b;
                o1 n10 = p1.n(p1Var);
                String str2 = m0Var.d;
                n10.c();
                p1.v((p1) n10.b, str2);
                n10.c();
                p1.w((p1) n10.b, str2);
                Long l10 = m0Var.e;
                if (l10 != null) {
                    int longValue = (int) l10.longValue();
                    n10.c();
                    p1.x((p1) n10.b, longValue);
                }
                p1 p1Var2 = (p1) n10.a();
                int i13 = m0Var.h;
                int i14 = i13 - 1;
                l5.a aVar2 = null;
                if (i13 == 0) {
                    throw null;
                }
                if (i14 != 0) {
                    if (i14 == 1) {
                        aVar = new l5.a(Integer.valueOf(i12 - 1), p1Var2, l5.d.a, null);
                    }
                    m0.i.b("analytics event: %s", aVar2);
                    q6.m.g(aVar2);
                    sVar = m0Var.g;
                    if (sVar == null) {
                        sVar.a(aVar2, new a0(7));
                        return;
                    }
                    return;
                }
                aVar = new l5.a(Integer.valueOf(i12 - 1), p1Var2, l5.d.b, null);
                aVar2 = aVar;
                m0.i.b("analytics event: %s", aVar2);
                q6.m.g(aVar2);
                sVar = m0Var.g;
                if (sVar == null) {
                }
            case 4:
                ((TextView) this.d).setTypeface((Typeface) this.c, this.b);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.d;
                while (i7 < arrayList.size()) {
                    ((dp) arrayList.get(i7)).a.m(this.b);
                    i7++;
                }
                g0.h3(new fi(3, this, arrayList));
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.d;
                while (i7 < arrayList2.size()) {
                    if (!((String) this.c).equals(((gj) arrayList2.get(i7)).S0())) {
                        arrayList2.remove(i7);
                        i7--;
                    }
                    i7++;
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

    public /* synthetic */ g(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = i7;
    }

    public g(si siVar, ArrayList arrayList, int i7) {
        this.a = 5;
        this.c = siVar;
        this.d = arrayList;
        this.b = i7;
    }
}
