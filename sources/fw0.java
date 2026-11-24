// default package

import android.webkit.JsResult;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw0 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ fw0(boolean[] zArr, JsResult jsResult, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // ee
    public final void r(he heVar, int i) {
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
            case 1:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.confirm();
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.confirm();
                    break;
                }
                break;
        }
    }
}
