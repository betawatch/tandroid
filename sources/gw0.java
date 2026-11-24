// default package

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ gw0(boolean[] zArr, JsResult jsResult, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        JsResult jsResult = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.cancel();
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.cancel();
                    break;
                }
                break;
        }
    }
}
