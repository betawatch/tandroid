package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class am implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ am(c1 c1Var, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((mp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                ((mp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                ((xv) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
