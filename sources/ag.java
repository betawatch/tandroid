// default package

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ag implements ed, dn7, yc3, js4, OnSuccessListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ ag(sj sjVar) {
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

    @Override // dn7
    public final String c(int i) {
        switch (this.a) {
            case 4:
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
            case 8:
                boolean z = k96.c0;
                String format = String.format("%02d", Integer.valueOf((i % 12 != 0 || z) ? i % (z ? 24 : 12) : 12));
                if (i >= 24) {
                    break;
                }
                break;
            case 10:
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
            case 12:
                switch (i) {
                }
            case 14:
                switch (i) {
                }
        }
        return String.format("%02d", Integer.valueOf(i));
    }

    @Override // yc3
    public final void h(mt8 mt8Var) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        mt8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // js4
    public final Object m(Object obj) {
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
        boolean z = w01.a;
        fa4.b("sms listener registered");
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 0:
                hdVar.dismiss();
                break;
            case 7:
                hdVar.dismiss();
                break;
            default:
                hdVar.dismiss();
                break;
        }
    }

    public /* synthetic */ ag(byte b) {
        this.a = b;
    }
}
