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
import m4.x0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        j5.a aVar;
        m5.s sVar;
        VisionClearcutLogger visionClearcutLogger;
        int i10 = 0;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                int i11 = this.b;
                Object obj = ((za.c) this.d).b;
                String str = (String) hVar.a.get(Integer.valueOf(i11));
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
                        bVar.d(obj);
                        return;
                    }
                    return;
                }
            case 1:
                ((h) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.d;
                p4.r rVar = (p4.r) this.c;
                int i12 = this.b;
                synchronized (pVar.e) {
                    pVar.L0(rVar, i12);
                }
                return;
            case 3:
                m0 m0Var = (m0) this.d;
                p1 p1Var = (p1) this.c;
                int i13 = this.b;
                o1 n10 = p1.n(p1Var);
                String str2 = m0Var.d;
                n10.c();
                p1.v((p1) n10.b, str2);
                n10.c();
                p1.w((p1) n10.b, str2);
                Long l4 = m0Var.e;
                if (l4 != null) {
                    int longValue = (int) l4.longValue();
                    n10.c();
                    p1.x((p1) n10.b, longValue);
                }
                p1 p1Var2 = (p1) n10.a();
                int i14 = m0Var.h;
                int i15 = i14 - 1;
                j5.a aVar2 = null;
                if (i14 == 0) {
                    throw null;
                }
                if (i15 != 0) {
                    if (i15 == 1) {
                        aVar = new j5.a(Integer.valueOf(i13 - 1), p1Var2, j5.d.a, null);
                    }
                    m0.i.b("analytics event: %s", aVar2);
                    o6.l.h(aVar2);
                    sVar = m0Var.g;
                    if (sVar == null) {
                        sVar.a(aVar2, new x0(11));
                        return;
                    }
                    return;
                }
                aVar = new j5.a(Integer.valueOf(i13 - 1), p1Var2, j5.d.b, null);
                aVar2 = aVar;
                m0.i.b("analytics event: %s", aVar2);
                o6.l.h(aVar2);
                sVar = m0Var.g;
                if (sVar == null) {
                }
            case 4:
                ((TextView) this.d).setTypeface((Typeface) this.c, this.b);
                return;
            case 5:
                ArrayList<MessageObject> arrayList = (ArrayList) this.d;
                while (i10 < arrayList.size()) {
                    if (!((String) this.c).equals(arrayList.get(i10).getFileName())) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                if (arrayList.size() > 0) {
                    FileLoader.getInstance(this.b).checkMediaExistance(arrayList);
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
}
