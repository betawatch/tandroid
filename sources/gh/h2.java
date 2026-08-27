package gh;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ int c;

    public /* synthetic */ h2(int i10, int i11, Utilities.Callback callback) {
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
