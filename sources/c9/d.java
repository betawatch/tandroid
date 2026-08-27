package c9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.messaging.t;
import h9.t0;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import qc.g;
import qc.i;
import qc.o;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public static ArrayList a(Context context) {
        j.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = o.a;
        }
        ArrayList f10 = g.f(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = f10.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = f10.get(i12);
            i12++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.d(arrayList));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            t tVar = new t(9, false);
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            tVar.b = str2;
            tVar.d = Integer.valueOf(runningAppProcessInfo.pid);
            tVar.e = Integer.valueOf(runningAppProcessInfo.importance);
            tVar.c = Boolean.valueOf(j.a(runningAppProcessInfo.processName, str));
            arrayList2.add(tVar.k());
        }
        return arrayList2;
    }

    public final t1 b(Context context) {
        Object obj;
        String processName;
        j.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = a2.get(i10);
            i10++;
            if (((t0) ((t1) obj)).b == myPid) {
                break;
            }
        }
        t1 t1Var = (t1) obj;
        if (t1Var != null) {
            return t1Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            processName = Process.myProcessName();
            j.d(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        j.e(processName, "processName");
        t tVar = new t(9, false);
        tVar.b = processName;
        tVar.d = Integer.valueOf(myPid);
        tVar.e = 0;
        tVar.c = false;
        return tVar.k();
    }
}
