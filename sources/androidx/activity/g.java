package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                    rVar2.M0(rVar3, i12);
                }
                return;
            case 3:
                r0 r0Var = (r0) this.d;
                u1 u1Var = (u1) this.c;
                int i13 = this.b;
                t1 n10 = u1.n(u1Var);
                String str2 = r0Var.d;
                n10.c();
                u1.v((u1) n10.b, str2);
                n10.c();
                u1.w((u1) n10.b, str2);
                Long l4 = r0Var.e;
                if (l4 != null) {
                    int longValue = (int) l4.longValue();
                    n10.c();
                    u1.x((u1) n10.b, longValue);
                }
                u1 u1Var2 = (u1) n10.a();
                int i14 = r0Var.h;
                int i15 = i14 - 1;
                i5.a aVar2 = null;
                if (i14 == 0) {
                    throw null;
                }
                if (i15 != 0) {
                    if (i15 == 1) {
                        aVar = new i5.a(Integer.valueOf(i13 - 1), u1Var2, i5.d.a, null);
                    }
                    r0.i.b("analytics event: %s", aVar2);
                    n6.l.h(aVar2);
                    rVar = r0Var.g;
                    if (rVar == null) {
                        rVar.a(aVar2, new j2.e(17));
                        return;
                    }
                    return;
                }
                aVar = new i5.a(Integer.valueOf(i13 - 1), u1Var2, i5.d.b, null);
                aVar2 = aVar;
                r0.i.b("analytics event: %s", aVar2);
                n6.l.h(aVar2);
                rVar = r0Var.g;
                if (rVar == null) {
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
                ((TextView) this.d).setTypeface((Typeface) this.c, this.b);
                return;
            case 6:
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
            case 7:
                long currentTimeMillis = System.currentTimeMillis();
                Utilities.stackBlurBitmap(((kv0) this.d).c, this.b);
                ((kv0) this.d).getClass();
                ov0 ov0Var = (ov0) this.c;
                ov0Var.j0 = (int) ((System.currentTimeMillis() - currentTimeMillis) + ov0Var.j0);
                int i16 = ov0Var.i0 + 1;
                ov0Var.i0 = i16;
                if (i16 > 1000) {
                    FileLog.d("chat blur generating average time" + (ov0Var.j0 / ov0Var.i0));
                    ov0Var.i0 = 0;
                    ov0Var.j0 = 0;
                }
                AndroidUtilities.runOnUIThread(new jv0(this, i10));
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

    public g(ov0 ov0Var) {
        this.a = 7;
        this.c = ov0Var;
    }
}
