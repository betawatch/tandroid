// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bf implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hk b;

    public /* synthetic */ bf(hk hkVar, byte b) {
        this.a = b;
        this.b = hkVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        hk hkVar = this.b;
        switch (b) {
            case 0:
                hkVar.requestFocus();
                gm.E3(hkVar);
                break;
            case 1:
                hkVar.requestFocus();
                gm.E3(hkVar);
                break;
            default:
                gm.c3(new b1(hkVar, (byte) 12));
                break;
        }
    }
}
