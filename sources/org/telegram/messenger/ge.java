package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ ge(c20 c20Var, Uri uri, int i7) {
        this.a = i7;
        this.b = c20Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Uri uri = this.c;
        c20 c20Var = this.b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                c20Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.V1;
                c20Var.a(uri);
                break;
        }
    }
}
