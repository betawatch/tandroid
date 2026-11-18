package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ b4(k4 k4Var, int i7) {
        this.a = i7;
        this.b = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
