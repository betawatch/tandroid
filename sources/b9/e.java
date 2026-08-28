package b9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.messaging.t;
import g9.t0;
import g9.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import pc.g;
import pc.o;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public static final e a = new e();

    public static ArrayList a(Context context) {
        i.e(context, "context");
        int i9 = context.getApplicationInfo().uid;
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
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = f10.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i9) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pc.i.d(arrayList));
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            t tVar = new t(8, false);
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            tVar.b = str2;
            tVar.d = Integer.valueOf(runningAppProcessInfo.pid);
            tVar.e = Integer.valueOf(runningAppProcessInfo.importance);
            tVar.c = Boolean.valueOf(i.a(runningAppProcessInfo.processName, str));
            arrayList2.add(tVar.k());
        }
        return arrayList2;
    }

    public final t1 b(Context context) {
        Object obj;
        String processName;
        i.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = a2.get(i9);
            i9++;
            if (((t0) ((t1) obj)).b == myPid) {
                break;
            }
        }
        t1 t1Var = (t1) obj;
        if (t1Var != null) {
            return t1Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            processName = Process.myProcessName();
            i.d(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i10 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        i.e(processName, "processName");
        t tVar = new t(8, false);
        tVar.b = processName;
        tVar.d = Integer.valueOf(myPid);
        tVar.e = 0;
        tVar.c = false;
        return tVar.k();
    }
}
