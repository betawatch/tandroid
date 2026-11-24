// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
