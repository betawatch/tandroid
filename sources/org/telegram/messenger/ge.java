package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
