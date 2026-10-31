package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.q1;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.ArrayList;
import k2.k0;
import org.telegram.messenger.b8;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.oi;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.cp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        i5.a aVar;
        l5.r rVar;
        VisionClearcutLogger visionClearcutLogger;
        int i10 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                int i12 = this.b;
                Object obj = ((a9.r) this.d).a;
                String str = (String) hVar.a.get(Integer.valueOf(i12));
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
                        bVar.m(obj);
                        return;
                    }
                    return;
                }
            case 1:
                ((h) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.d;
                p4.s sVar = (p4.s) this.c;
                int i13 = this.b;
                synchronized (qVar.e) {
                    qVar.N0(sVar, i13);
                }
                return;
            case 3:
                o0 o0Var = (o0) this.d;
                r1 r1Var = (r1) this.c;
                int i14 = this.b;
                q1 n10 = r1.n(r1Var);
                String str2 = o0Var.d;
                n10.c();
                r1.v((r1) n10.b, str2);
                n10.c();
                r1.w((r1) n10.b, str2);
                Long l4 = o0Var.e;
                if (l4 != null) {
                    int longValue = (int) l4.longValue();
                    n10.c();
                    r1.x((r1) n10.b, longValue);
                }
                r1 r1Var2 = (r1) n10.a();
                int i15 = o0Var.h;
                int i16 = i15 - 1;
                i5.a aVar2 = null;
                if (i15 == 0) {
                    throw null;
                }
                if (i16 != 0) {
                    if (i16 == 1) {
                        aVar = new i5.a(Integer.valueOf(i14 - 1), r1Var2, i5.d.a, null);
                    }
                    o0.i.b("analytics event: %s", aVar2);
                    n6.l.g(aVar2);
                    rVar = o0Var.g;
                    if (rVar == null) {
                        rVar.a(aVar2, new k0(5));
                        return;
                    }
                    return;
                }
                aVar = new i5.a(Integer.valueOf(i14 - 1), r1Var2, i5.d.b, null);
                aVar2 = aVar;
                o0.i.b("analytics event: %s", aVar2);
                n6.l.g(aVar2);
                rVar = o0Var.g;
                if (rVar == null) {
                }
            case 4:
                ((TextView) this.d).setTypeface((Typeface) this.c, this.b);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.d;
                while (i10 < arrayList.size()) {
                    ((cp) arrayList.get(i10)).a.m(this.b);
                    i10++;
                }
                i0.g3(new oi(i11, this, arrayList));
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.d;
                while (i10 < arrayList2.size()) {
                    if (!((String) this.c).equals(((jj) arrayList2.get(i10)).S0())) {
                        arrayList2.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                if (arrayList2.size() > 0) {
                    b8.G(this.b).l(arrayList2);
                    return;
                }
                return;
            default:
                visionClearcutLogger = ((DynamiteClearcutLogger) this.c).zzc;
                visionClearcutLogger.zza(this.b, (f0) this.d);
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
    }

    public g(ui uiVar, ArrayList arrayList, int i10) {
        this.a = 5;
        this.c = uiVar;
        this.d = arrayList;
        this.b = i10;
    }
}
