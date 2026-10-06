package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ ne0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
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
                pe0.a(strArr, this.c, this.d);
                break;
            default:
                pe0.b(strArr, this.c, this.d);
                break;
        }
    }
}
