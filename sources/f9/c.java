package f9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import k9.t0;
import k9.t1;
import kotlin.jvm.internal.j;
import sf.f;
import tc.g;
import tc.i;
import tc.o;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

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
            f fVar = new f(6, false);
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            fVar.b = str2;
            fVar.c = Integer.valueOf(runningAppProcessInfo.pid);
            fVar.d = Integer.valueOf(runningAppProcessInfo.importance);
            fVar.e = Boolean.valueOf(j.a(runningAppProcessInfo.processName, str));
            arrayList2.add(fVar.n());
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
        f fVar = new f(6, false);
        fVar.b = processName;
        fVar.c = Integer.valueOf(myPid);
        fVar.d = 0;
        fVar.e = false;
        return fVar.n();
    }
}
