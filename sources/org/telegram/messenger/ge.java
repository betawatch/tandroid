package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ ge(z10 z10Var, Uri uri, int i7) {
        this.a = i7;
        this.b = z10Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Uri uri = this.c;
        z10 z10Var = this.b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                z10Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                z10Var.a(uri);
                break;
        }
    }
}
