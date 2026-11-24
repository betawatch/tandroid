// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class i38 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ p8c d;

    public /* synthetic */ i38(String[] strArr, Activity activity, p8c p8cVar, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = activity;
        this.d = p8cVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        p8c p8cVar = this.d;
        Activity activity = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (activity.checkSelfPermission(strArr[i]) == 0) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
                p8cVar.a(Boolean.valueOf(z));
                break;
            default:
                int length2 = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        z = true;
                    } else if (activity.checkSelfPermission(strArr[i2]) == 0) {
                        i2++;
                    }
                }
                p8cVar.a(Boolean.valueOf(z));
                break;
        }
    }
}
