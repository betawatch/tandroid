package bi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
