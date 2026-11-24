// default package

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gn1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ gn1(boolean[] zArr, byte b) {
        this.a = b;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                break;
            case 1:
                String str = LaunchActivity.C1;
                zArr[0] = true;
                break;
            case 2:
                String[] strArr = MediaController.W1;
                zArr[0] = true;
                break;
            case 3:
                String[] strArr2 = MediaController.W1;
                zArr[0] = true;
                break;
            default:
                zArr[0] = true;
                break;
        }
    }
}
