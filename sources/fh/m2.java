package fh;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ int c;

    public /* synthetic */ m2(int i9, int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
        this.c = i9;
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
