package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ td1 b;

    public /* synthetic */ od1(td1 td1Var, int i10) {
        this.a = i10;
        this.b = td1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                td1 td1Var = this.b;
                td1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.o2) td1Var, 11, false).show();
                break;
            default:
                td1 td1Var2 = this.b;
                td1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(td1Var2.e);
                break;
        }
    }
}
