// default package

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class no8 {
    public static final no8 a = new no8();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = x24.a;
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
        ArrayList arrayList3 = new ArrayList(ul2.c(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            ae5 ae5Var = new ae5();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                p3d.h("Null processName");
                return null;
            }
            ae5Var.e = str2;
            ae5Var.a = runningAppProcessInfo.pid;
            byte b = (byte) (ae5Var.d | 1);
            ae5Var.b = runningAppProcessInfo.importance;
            ae5Var.d = (byte) (b | 2);
            ae5Var.c = ur5.a(str2, str);
            ae5Var.d = (byte) (ae5Var.d | 4);
            arrayList3.add(ae5Var.a());
        }
        return arrayList3;
    }

    public final rz2 b(Context context) {
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
            if (((d90) ((rz2) obj)).b == myPid) {
                break;
            }
        }
        rz2 rz2Var = (rz2) obj;
        if (rz2Var != null) {
            return rz2Var;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            str = Process.myProcessName();
            str.getClass();
        } else if (i2 < 28 || (str = Application.getProcessName()) == null) {
            str = "";
        }
        ae5 ae5Var = new ae5();
        ae5Var.e = str;
        ae5Var.a = myPid;
        byte b = (byte) (ae5Var.d | 1);
        ae5Var.b = 0;
        ae5Var.c = false;
        ae5Var.d = (byte) (((byte) (b | 2)) | 4);
        return ae5Var.a();
    }
}
