package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ a4(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
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
