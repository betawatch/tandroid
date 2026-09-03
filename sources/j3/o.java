package j3;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements r8.i, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ o(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // r8.i
    public Object get() {
        switch (this.a) {
            case 0:
                return new l(this.b);
            case 1:
                return new z9.d(this.b, new r3.i());
            case 2:
                return new f5.p(this.b, new cb.b(6));
            default:
                return g5.s.b(this.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 4:
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
