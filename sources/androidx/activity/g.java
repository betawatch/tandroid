package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.q1;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                        bVar.k(obj);
                        return;
                    }
                    return;
                }
            case 1:
                ((h) this.c).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                com.google.android.gms.internal.cast.o oVar = (com.google.android.gms.internal.cast.o) this.d;
                c2.v vVar = (c2.v) this.c;
                int i12 = this.b;
                synchronized (oVar.e) {
                    oVar.K0(vVar, i12);
                }
                return;
            case 3:
                n0 n0Var = (n0) this.d;
                r1 r1Var = (r1) this.c;
                int i13 = this.b;
                q1 n10 = r1.n(r1Var);
                String str2 = n0Var.d;
                n10.c();
                r1.v((r1) n10.b, str2);
                n10.c();
                r1.w((r1) n10.b, str2);
                Long l10 = n0Var.e;
                if (l10 != null) {
                    int longValue = (int) l10.longValue();
                    n10.c();
                    r1.x((r1) n10.b, longValue);
                }
                r1 r1Var2 = (r1) n10.a();
                int i14 = n0Var.h;
                int i15 = i14 - 1;
                v2.a aVar2 = null;
                if (i14 == 0) {
                    throw null;
                }
                if (i15 != 0) {
                    if (i15 == 1) {
                        aVar = new v2.a(Integer.valueOf(i13 - 1), r1Var2, v2.d.a, null);
                    }
                    n0.i.b("analytics event: %s", aVar2);
                    b6.m.h(aVar2);
                    pVar = n0Var.g;
                    if (pVar == null) {
                        pVar.a(aVar2, new sg.a(28));
                        return;
                    }
                    return;
                }
                aVar = new v2.a(Integer.valueOf(i13 - 1), r1Var2, v2.d.b, null);
                aVar2 = aVar;
                n0.i.b("analytics event: %s", aVar2);
                b6.m.h(aVar2);
                pVar = n0Var.g;
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
                Utilities.stackBlurBitmap(((mv0) this.d).c, this.b);
                ((mv0) this.d).getClass();
                qv0 qv0Var = (qv0) this.c;
                qv0Var.g0 = (int) ((System.currentTimeMillis() - currentTimeMillis) + qv0Var.g0);
                int i16 = qv0Var.f0 + 1;
                qv0Var.f0 = i16;
                if (i16 > 1000) {
                    FileLog.d("chat blur generating average time" + (qv0Var.g0 / qv0Var.f0));
                    qv0Var.f0 = 0;
                    qv0Var.g0 = 0;
                }
                AndroidUtilities.runOnUIThread(new lv0(this, i10));
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
    }

    public g(qv0 qv0Var) {
        this.a = 8;
        this.c = qv0Var;
    }
}
