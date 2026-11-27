// default package

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg implements dq7, fd, fq7, qd3, nu4, OnSuccessListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ bg(tj tjVar) {
        this.a = (byte) 19;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher a(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void b() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // dq7
    public final String c(int i) {
        switch (this.a) {
            case 1:
                if (i != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i2 = calendar.get(1);
                    calendar.add(6, i);
                    long timeInMillis = calendar.getTimeInMillis();
                    if (calendar.get(1) != i2) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 4:
                if (i != 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    int i3 = calendar2.get(1);
                    calendar2.add(6, i);
                    long timeInMillis2 = calendar2.getTimeInMillis();
                    if (calendar2.get(1) != i3) {
                        break;
                    } else if (i >= 7) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 8:
                if (i != 0) {
                    if (i >= 1 && i < 16) {
                        break;
                    } else if (i != 16) {
                        if (i != 17) {
                            if (i != 18) {
                                if (i != 19) {
                                    if (i == 20) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 9:
                boolean z = ob6.c0;
                String format = String.format("%02d", Integer.valueOf((i % 12 != 0 || z) ? i % (z ? 24 : 12) : 12));
                if (i >= 24) {
                    break;
                }
                break;
            case 12:
                switch (i) {
                }
        }
        return String.format("%02d", Integer.valueOf(i));
    }

    @Override // qd3
    public final void f(vw8 vw8Var) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        vw8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // nu4
    public final Object h(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 22:
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z = f11.a;
        cc4.b("sms listener registered");
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 7:
                idVar.dismiss();
                break;
            case 17:
                idVar.dismiss();
                break;
            default:
                idVar.dismiss();
                break;
        }
    }

    public /* synthetic */ bg(byte b) {
        this.a = b;
    }

    @Override // fq7
    public final void i(hq7 hq7Var, int i) {
    }
}
