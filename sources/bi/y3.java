package bi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ y3(boolean[] zArr, long j3, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = j3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                if (!this.b[0]) {
                    i4.g(this.c);
                    break;
                }
                break;
            default:
                if (!this.b[0]) {
                    i4.g(this.c);
                    break;
                }
                break;
        }
    }
}
