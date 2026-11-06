package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ee(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                lj ljVar = this.b.l2;
                if (ljVar != null) {
                    ljVar.c(false);
                    break;
                }
                break;
            case 1:
                an.c1(this.b);
                break;
            case 2:
                this.b.v8(false, true, 0.0f);
                break;
            case 3:
                this.b.v8(false, true, 0.0f);
                break;
            case 4:
                this.b.v8(false, true, 0.0f);
                break;
            case 5:
                this.b.v8(false, true, 0.0f);
                break;
            case 6:
                this.b.v8(false, true, 0.0f);
                break;
            case 7:
                this.b.v8(false, true, 0.0f);
                break;
            default:
                this.b.gc = null;
                break;
        }
    }
}
