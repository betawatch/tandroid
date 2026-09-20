package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class je0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ je0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
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
                le0.a(strArr, this.c, this.d);
                break;
            default:
                le0.b(strArr, this.c, this.d);
                break;
        }
    }
}
