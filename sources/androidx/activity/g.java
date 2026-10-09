package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.sw0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;

    public /* synthetic */ g(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        i5.a aVar;
        l5.r rVar;
        VisionClearcutLogger visionClearcutLogger;
        int i10 = 0;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                int i11 = this.b;
                Object obj = ((e.a) this.d).a;
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
                        bVar.j(obj);
                        return;
                    }
                    return;
                }
            case 1:
                ((h) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                com.google.android.gms.internal.cast.r rVar2 = (com.google.android.gms.internal.cast.r) this.d;
                p4.r rVar3 = (p4.r) this.c;
                int i12 = this.b;
                synchronized (rVar2.e) {
                    rVar2.L0(rVar3, i12);
                }
                return;
            case 3:
                p0 p0Var = (p0) this.d;
                s1 s1Var = (s1) this.c;
                int i13 = this.b;
                r1 n10 = s1.n(s1Var);
                String str2 = p0Var.d;
                n10.c();
                s1.v((s1) n10.b, str2);
                n10.c();
                s1.w((s1) n10.b, str2);
                Long l4 = p0Var.e;
                if (l4 != null) {
                    int longValue = (int) l4.longValue();
                    n10.c();
                    s1.x((s1) n10.b, longValue);
                }
                s1 s1Var2 = (s1) n10.a();
                int i14 = p0Var.h;
                int i15 = i14 - 1;
                i5.a aVar2 = null;
                if (i14 == 0) {
                    throw null;
                }
                if (i15 != 0) {
                    if (i15 == 1) {
                        aVar = new i5.a(Integer.valueOf(i13 - 1), s1Var2, i5.d.a, null);
                    }
                    p0.i.b("analytics event: %s", aVar2);
                    n6.l.h(aVar2);
                    rVar = p0Var.g;
                    if (rVar == null) {
                        rVar.a(aVar2, new j2.e(16));
                        return;
                    }
                    return;
                }
                aVar = new i5.a(Integer.valueOf(i13 - 1), s1Var2, i5.d.b, null);
                aVar2 = aVar;
                p0.i.b("analytics event: %s", aVar2);
                n6.l.h(aVar2);
                rVar = p0Var.g;
                if (rVar == null) {
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
            case 6:
                long currentTimeMillis = System.currentTimeMillis();
                Utilities.stackBlurBitmap(((ow0) this.d).c, this.b);
                ((ow0) this.d).getClass();
                sw0 sw0Var = (sw0) this.c;
                sw0Var.j0 = (int) ((System.currentTimeMillis() - currentTimeMillis) + sw0Var.j0);
                int i16 = sw0Var.i0 + 1;
                sw0Var.i0 = i16;
                if (i16 > 1000) {
                    FileLog.d("chat blur generating average time" + (sw0Var.j0 / sw0Var.i0));
                    sw0Var.i0 = 0;
                    sw0Var.j0 = 0;
                }
                AndroidUtilities.runOnUIThread(new nw0(this, i10));
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

    public g(sw0 sw0Var) {
        this.a = 6;
        this.c = sw0Var;
    }
}
