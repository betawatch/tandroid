// default package

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class al8 {
    public static final al8 a = new al8();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = c24.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(al2.c(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            zb5 zb5Var = new zb5();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                fvc.f("Null processName");
                return null;
            }
            zb5Var.e = str2;
            zb5Var.a = runningAppProcessInfo.pid;
            byte b = (byte) (zb5Var.d | 1);
            zb5Var.b = runningAppProcessInfo.importance;
            zb5Var.d = (byte) (b | 2);
            zb5Var.c = rp5.a(str2, str);
            zb5Var.d = (byte) (zb5Var.d | 4);
            arrayList3.add(zb5Var.a());
        }
        return arrayList3;
    }

    public final wy2 b(Context context) {
        Object obj;
        String str;
        context.getClass();
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = a2.get(i);
            i++;
            if (((b90) ((wy2) obj)).b == myPid) {
                break;
            }
        }
        wy2 wy2Var = (wy2) obj;
        if (wy2Var != null) {
            return wy2Var;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            str = Process.myProcessName();
            str.getClass();
        } else if (i2 < 28 || (str = Application.getProcessName()) == null) {
            str = "";
        }
        zb5 zb5Var = new zb5();
        zb5Var.e = str;
        zb5Var.a = myPid;
        byte b = (byte) (zb5Var.d | 1);
        zb5Var.b = 0;
        zb5Var.c = false;
        zb5Var.d = (byte) (((byte) (b | 2)) | 4);
        return zb5Var.a();
    }
}
