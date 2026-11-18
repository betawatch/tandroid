package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x10 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ fe(x10 x10Var, Uri uri, int i7) {
        this.a = i7;
        this.b = x10Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Uri uri = this.c;
        x10 x10Var = this.b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                x10Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                x10Var.a(uri);
                break;
        }
    }
}
