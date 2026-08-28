package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.oc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ih.j0 e;

    public /* synthetic */ l21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.oc ocVar, Context context, ih.j0 j0Var, int i9) {
        this.a = i9;
        this.b = aVar;
        this.c = ocVar;
        this.d = context;
        this.e = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 2), this.e)).j();
                break;
            case 1:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 5), this.e)).j();
                break;
            default:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 6), this.e)).j();
                break;
        }
    }
}
