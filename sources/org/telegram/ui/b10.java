package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b10 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ b10(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (this.b.s2 && (T instanceof bn)) {
                    ((bn) T).wa(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.D3 = null;
                break;
            default:
                this.b.m2 = null;
                break;
        }
    }
}
