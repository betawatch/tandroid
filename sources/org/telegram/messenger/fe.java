package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w10 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ fe(w10 w10Var, Uri uri, int i7) {
        this.a = i7;
        this.b = w10Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Uri uri = this.c;
        w10 w10Var = this.b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                w10Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                w10Var.a(uri);
                break;
        }
    }
}
