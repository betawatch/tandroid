package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
