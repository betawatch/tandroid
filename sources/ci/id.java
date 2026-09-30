package ci;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class id implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ id(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                try {
                    this.b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
