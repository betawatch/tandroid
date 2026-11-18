package bi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                    e4.g(this.c);
                    break;
                }
                break;
            default:
                if (!this.b[0]) {
                    e4.g(this.c);
                    break;
                }
                break;
        }
    }
}
