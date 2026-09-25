package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.xc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ai.a1 e;

    public /* synthetic */ i31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = xcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.d, 2), this.e)).j();
                break;
            case 1:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.d, 5), this.e)).j();
                break;
            default:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.d, 6), this.e)).j();
                break;
        }
    }
}
