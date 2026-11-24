// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class na5 extends zya {
    public final /* synthetic */ byte L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na5(Context context, View view, int i, wjb wjbVar, byte b) {
        super(context, view, i, wjbVar);
        this.L = b;
    }

    @Override // zya, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.L) {
            case 0:
                super.onAttachedToWindow();
                this.b.getImageReceiver().w0(false);
                break;
            case 1:
                super.onAttachedToWindow();
                this.b.getImageReceiver().w0(false);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // zya, android.view.View
    public final void setVisibility(int i) {
        switch (this.L) {
            case 2:
                super.setVisibility(i);
                if (i != 0) {
                    e(false, false);
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
