// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8b implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r8b b;

    public /* synthetic */ m8b(r8b r8bVar, byte b) {
        this.a = b;
        this.b = r8bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        r8b r8bVar = this.b;
        switch (b) {
            case 0:
                r8bVar.a1();
                break;
            default:
                r8bVar.d1();
                break;
        }
    }
}
