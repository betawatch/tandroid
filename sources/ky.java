// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ky implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ wjb c;

    public /* synthetic */ ky(Context context, wjb wjbVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = wjbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new ava(this.b, this.c).show();
                break;
            case 1:
                new ava(this.b, this.c).show();
                break;
            case 2:
                new ava(this.b, this.c).show();
                break;
            default:
                new ava(this.b, this.c).show();
                break;
        }
    }
}
