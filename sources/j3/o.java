package j3;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                return new ab.a(this.b, new r3.i());
            case 2:
                return new f5.p(this.b, new db.a(6));
            default:
                return g5.s.b(this.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
