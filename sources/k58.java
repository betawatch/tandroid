// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class k58 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ qac d;

    public /* synthetic */ k58(String[] strArr, Activity activity, qac qacVar, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = activity;
        this.d = qacVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        qac qacVar = this.d;
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
                qacVar.a(Boolean.valueOf(z));
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
                qacVar.a(Boolean.valueOf(z));
                break;
        }
    }
}
