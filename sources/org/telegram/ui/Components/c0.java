package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r20 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c0(int i10, int i11, org.telegram.messenger.r20 r20Var) {
        this.a = i11;
        this.b = r20Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.a(Integer.valueOf(this.c));
                break;
            default:
                org.telegram.messenger.r20 r20Var = this.b;
                if (r20Var != null) {
                    r20Var.a(Integer.valueOf(this.c));
                    break;
                }
                break;
        }
    }
}
