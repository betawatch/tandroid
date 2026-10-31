package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ ge(q20 q20Var, Uri uri, int i10) {
        this.a = i10;
        this.b = q20Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Uri uri = this.c;
        q20 q20Var = this.b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                q20Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.U1;
                q20Var.a(uri);
                break;
        }
    }
}
