// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oc5 extends z2b {
    public final /* synthetic */ byte L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc5(Context context, View view, int i, vnb vnbVar, byte b) {
        super(context, view, i, vnbVar);
        this.L = b;
    }

    @Override // z2b, android.view.ViewGroup, android.view.View
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

    @Override // z2b, android.view.View
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
