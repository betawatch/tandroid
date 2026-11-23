package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y10 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ ge(y10 y10Var, Uri uri, int i7) {
        this.a = i7;
        this.b = y10Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Uri uri = this.c;
        y10 y10Var = this.b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                y10Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                y10Var.a(uri);
                break;
        }
    }
}
