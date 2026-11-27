// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class mt implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ cw b;
    public final /* synthetic */ View c;

    public /* synthetic */ mt(cw cwVar, View view) {
        this.b = cwVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.c;
        cw cwVar = this.b;
        switch (b) {
            case 0:
                view.post(new mt(cwVar, view));
                break;
            default:
                cwVar.J.clear();
                cwVar.L.set(null);
                view.invalidate();
                break;
        }
    }

    public /* synthetic */ mt(View view, cw cwVar) {
        this.c = view;
        this.b = cwVar;
    }
}
