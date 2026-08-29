package ja;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class r {
    public static ArrayList a(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = rc.o.a;
        }
        ArrayList f9 = rc.g.f(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = f9.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = f9.get(i12);
            i12++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(rc.i.d(arrayList));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.j.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new q(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.j.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static q b(Context context) {
        Object obj;
        kotlin.jvm.internal.j.e(context, "context");
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
            if (((q) obj).b == myPid) {
                break;
            }
        }
        q qVar = (q) obj;
        return qVar == null ? new q(c(), myPid, 0, false) : qVar;
    }

    public static String c() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String myProcessName = Process.myProcessName();
            kotlin.jvm.internal.j.d(myProcessName, "myProcessName()");
            return myProcessName;
        }
        if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String a2 = g6.d.a();
        return a2 != null ? a2 : "";
    }
}
