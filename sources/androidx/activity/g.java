package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
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
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;

    public /* synthetic */ g(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        VisionClearcutLogger visionClearcutLogger;
        t2.a aVar;
        w2.p pVar;
        int i9 = 0;
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
                visionClearcutLogger = ((DynamiteClearcutLogger) this.c).zzc;
                visionClearcutLogger.zza(this.b, (f0) this.d);
                return;
            case 3:
                com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.d;
                c2.v vVar = (c2.v) this.c;
                int i11 = this.b;
                synchronized (qVar.e) {
                    qVar.K0(vVar, i11);
                }
                return;
            case 4:
                p0 p0Var = (p0) this.d;
                s1 s1Var = (s1) this.c;
                int i12 = this.b;
                r1 n10 = s1.n(s1Var);
                String str2 = p0Var.d;
                n10.c();
                s1.v((s1) n10.b, str2);
                n10.c();
                s1.w((s1) n10.b, str2);
                Long l10 = p0Var.e;
                if (l10 != null) {
                    int longValue = (int) l10.longValue();
                    n10.c();
                    s1.x((s1) n10.b, longValue);
                }
                s1 s1Var2 = (s1) n10.a();
                int i13 = p0Var.h;
                int i14 = i13 - 1;
                t2.a aVar2 = null;
                if (i13 == 0) {
                    throw null;
                }
                if (i14 != 0) {
                    if (i14 == 1) {
                        aVar = new t2.a(Integer.valueOf(i12 - 1), s1Var2, t2.d.a, null);
                    }
                    p0.i.b("analytics event: %s", aVar2);
                    x5.l.h(aVar2);
                    pVar = p0Var.g;
                    if (pVar == null) {
                        pVar.a(aVar2, new v0.l(1));
                        return;
                    }
                    return;
                }
                aVar = new t2.a(Integer.valueOf(i12 - 1), s1Var2, t2.d.b, null);
                aVar2 = aVar;
                p0.i.b("analytics event: %s", aVar2);
                x5.l.h(aVar2);
                pVar = p0Var.g;
                if (pVar == null) {
                }
            case 5:
                String[] strArr = (String[]) this.d;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) this.c;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i9 < length) {
                    iArr[i9] = packageManager.checkPermission(strArr[i9], packageName);
                    i9++;
                }
                ((e0.c) activity).onRequestPermissionsResult(this.b, strArr, iArr);
                return;
            case 6:
                ((TextView) this.d).setTypeface((Typeface) this.c, this.b);
                return;
            case 7:
                ArrayList<MessageObject> arrayList = (ArrayList) this.d;
                while (i9 < arrayList.size()) {
                    if (!((String) this.c).equals(arrayList.get(i9).getFileName())) {
                        arrayList.remove(i9);
                        i9--;
                    }
                    i9++;
                }
                if (arrayList.size() > 0) {
                    FileLoader.getInstance(this.b).checkMediaExistance(arrayList);
                    return;
                }
                return;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                Utilities.stackBlurBitmap(((tu0) this.d).c, this.b);
                ((tu0) this.d).getClass();
                xu0 xu0Var = (xu0) this.c;
                xu0Var.f0 = (int) ((System.currentTimeMillis() - currentTimeMillis) + xu0Var.f0);
                int i15 = xu0Var.e0 + 1;
                xu0Var.e0 = i15;
                if (i15 > 1000) {
                    FileLog.d("chat blur generating average time" + (xu0Var.f0 / xu0Var.e0));
                    xu0Var.e0 = 0;
                    xu0Var.f0 = 0;
                }
                AndroidUtilities.runOnUIThread(new ru0(this, i9));
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i9, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = i9;
    }

    public g(xu0 xu0Var) {
        this.a = 8;
        this.c = xu0Var;
    }
}
