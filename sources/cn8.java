// default package

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cn8 {
    public static final cn8 a = new cn8();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = n34.a;
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
        ArrayList arrayList3 = new ArrayList(mm2.c(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            xd5 xd5Var = new xd5();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                gxc.d("Null processName");
                return null;
            }
            xd5Var.e = str2;
            xd5Var.a = runningAppProcessInfo.pid;
            byte b = (byte) (xd5Var.d | 1);
            xd5Var.b = runningAppProcessInfo.importance;
            xd5Var.d = (byte) (b | 2);
            xd5Var.c = rr5.a(str2, str);
            xd5Var.d = (byte) (xd5Var.d | 4);
            arrayList3.add(xd5Var.a());
        }
        return arrayList3;
    }

    public final h03 b(Context context) {
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
            if (((ba0) ((h03) obj)).b == myPid) {
                break;
            }
        }
        h03 h03Var = (h03) obj;
        if (h03Var != null) {
            return h03Var;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            str = Process.myProcessName();
            str.getClass();
        } else if (i2 < 28 || (str = Application.getProcessName()) == null) {
            str = "";
        }
        xd5 xd5Var = new xd5();
        xd5Var.e = str;
        xd5Var.a = myPid;
        byte b = (byte) (xd5Var.d | 1);
        xd5Var.b = 0;
        xd5Var.c = false;
        xd5Var.d = (byte) (((byte) (b | 2)) | 4);
        return xd5Var.a();
    }
}
