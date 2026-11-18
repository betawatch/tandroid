package bi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ u3(boolean[] zArr, long j3, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = j3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                if (!this.b[0]) {
                    f4.f(this.c);
                    break;
                }
                break;
            default:
                if (!this.b[0]) {
                    f4.f(this.c);
                    break;
                }
                break;
        }
    }
}
