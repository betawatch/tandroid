// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mt implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ bw b;
    public final /* synthetic */ View c;

    public /* synthetic */ mt(bw bwVar, View view) {
        this.b = bwVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.c;
        bw bwVar = this.b;
        switch (b) {
            case 0:
                view.post(new mt(bwVar, view));
                break;
            default:
                bwVar.J.clear();
                bwVar.L.set(null);
                view.invalidate();
                break;
        }
    }

    public /* synthetic */ mt(View view, bw bwVar) {
        this.c = view;
        this.b = bwVar;
    }
}
