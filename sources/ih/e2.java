package ih;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ int c;

    public /* synthetic */ e2(int i10, int i11, Utilities.Callback callback) {
        this.a = i11;
        this.b = callback;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = this.b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.c));
                    break;
                }
                break;
            default:
                this.b.run(Integer.valueOf(this.c));
                break;
        }
    }
}
