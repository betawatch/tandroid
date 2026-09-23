package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ be0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = activity;
        this.d = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        String[] strArr = this.b;
        switch (i10) {
            case 0:
                de0.a(strArr, this.c, this.d);
                break;
            default:
                de0.b(strArr, this.c, this.d);
                break;
        }
    }
}
