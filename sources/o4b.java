// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o4b implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4b b;

    public /* synthetic */ o4b(t4b t4bVar, byte b) {
        this.a = b;
        this.b = t4bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                t4bVar.Z0();
                break;
            default:
                t4bVar.c1();
                break;
        }
    }
}
