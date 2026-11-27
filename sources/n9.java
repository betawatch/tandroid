// default package

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Method;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ n9(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    Handler handler = q9.g;
                    Method method = q9.f;
                    int i = Build.VERSION.SDK_INT;
                    if (i < 28) {
                        if (((i != 26 && i != 27) || method != null) && (q9.e != null || q9.d != null)) {
                            try {
                                Object obj2 = q9.c.get(activity);
                                if (obj2 != null && (obj = q9.b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    p9 p9Var = new p9(activity);
                                    application.registerActivityLifecycleCallbacks(p9Var);
                                    handler.post(new iqd(p9Var, obj2, (byte) 1));
                                    try {
                                        if (i == 26 || i == 27) {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new xs4(application, p9Var, (byte) 2));
                                        break;
                                    } catch (Throwable th) {
                                        handler.post(new xs4(application, p9Var, (byte) 2));
                                        throw th;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        activity.recreate();
                        break;
                    } else {
                        activity.recreate();
                        break;
                    }
                }
                break;
            case 1:
                int i2 = ChatActivityEnterView.X7;
                hl.K3(activity);
                break;
            case 2:
                m01.u(activity, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                m01.u(activity, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                m01.u(activity, "https://promote.telegram.org/guidelines");
                break;
            default:
                m01.u(activity, ob6.M0(2131744623, null));
                break;
        }
    }
}
