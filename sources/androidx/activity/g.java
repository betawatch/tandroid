package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.hv0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        v2.a aVar;
        y2.p pVar;
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
                        bVar.l(obj);
                        return;
                    }
                    return;
                }
            case 1:
                ((h) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.d;
                c2.w wVar = (c2.w) this.c;
                int i12 = this.b;
                synchronized (qVar.e) {
                    qVar.K0(wVar, i12);
                }
                return;
            case 3:
                p0 p0Var = (p0) this.d;
                t1 t1Var = (t1) this.c;
                int i13 = this.b;
                s1 n10 = t1.n(t1Var);
                String str2 = p0Var.d;
                n10.c();
                t1.v((t1) n10.b, str2);
                n10.c();
                t1.w((t1) n10.b, str2);
                Long l10 = p0Var.e;
                if (l10 != null) {
                    int longValue = (int) l10.longValue();
                    n10.c();
                    t1.x((t1) n10.b, longValue);
                }
                t1 t1Var2 = (t1) n10.a();
                int i14 = p0Var.h;
                int i15 = i14 - 1;
                v2.a aVar2 = null;
                if (i14 == 0) {
                    throw null;
                }
                if (i15 != 0) {
                    if (i15 == 1) {
                        aVar = new v2.a(Integer.valueOf(i13 - 1), t1Var2, v2.d.a, null);
                    }
                    p0.i.b("analytics event: %s", aVar2);
                    z5.l.h(aVar2);
                    pVar = p0Var.g;
                    if (pVar == null) {
                        pVar.a(aVar2, new sg.j(17));
                        return;
                    }
                    return;
                }
                aVar = new v2.a(Integer.valueOf(i13 - 1), t1Var2, v2.d.b, null);
                aVar2 = aVar;
                p0.i.b("analytics event: %s", aVar2);
                z5.l.h(aVar2);
                pVar = p0Var.g;
                if (pVar == null) {
                }
            case 4:
                String[] strArr = (String[]) this.d;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) this.c;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i10 < length) {
                    iArr[i10] = packageManager.checkPermission(strArr[i10], packageName);
                    i10++;
                }
                ((e0.c) activity).onRequestPermissionsResult(this.b, strArr, iArr);
                return;
            case 5:
                visionClearcutLogger = ((DynamiteClearcutLogger) this.c).zzc;
                visionClearcutLogger.zza(this.b, (f0) this.d);
                return;
            case 6:
                ((TextView) this.d).setTypeface((Typeface) this.c, this.b);
                return;
            case 7:
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
                long currentTimeMillis = System.currentTimeMillis();
                Utilities.stackBlurBitmap(((dv0) this.d).c, this.b);
                ((dv0) this.d).getClass();
                hv0 hv0Var = (hv0) this.c;
                hv0Var.f0 = (int) ((System.currentTimeMillis() - currentTimeMillis) + hv0Var.f0);
                int i16 = hv0Var.e0 + 1;
                hv0Var.e0 = i16;
                if (i16 > 1000) {
                    FileLog.d("chat blur generating average time" + (hv0Var.f0 / hv0Var.e0));
                    hv0Var.e0 = 0;
                    hv0Var.f0 = 0;
                }
                AndroidUtilities.runOnUIThread(new cv0(this, i10));
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
    }

    public g(hv0 hv0Var) {
        this.a = 8;
        this.c = hv0Var;
    }
}
