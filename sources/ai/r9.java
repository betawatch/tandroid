package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ r9(Utilities.Callback callback, boolean[] zArr) {
        this.c = callback;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = this.c;
                if (callback != null && !this.b[0]) {
                    callback.run(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    this.c.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r9(boolean[] zArr, Utilities.Callback callback) {
        this.b = zArr;
        this.c = callback;
    }
}
