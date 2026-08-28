package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ id0(String[] strArr, Activity activity, Utilities.Callback callback, int i9) {
        this.a = i9;
        this.b = strArr;
        this.c = activity;
        this.d = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9 = this.a;
        String[] strArr = this.b;
        switch (i9) {
            case 0:
                kd0.a(strArr, this.c, this.d);
                break;
            default:
                kd0.b(strArr, this.c, this.d);
                break;
        }
    }
}
