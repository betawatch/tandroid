package ci;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2[] c;

    public /* synthetic */ da(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.t2[] t2VarArr, int i3) {
        this.a = i3;
        this.b = editTextBoldCursor;
        this.c = t2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new d1(editTextBoldCursor, 11));
                break;
            case 1:
                org.telegram.messenger.g0.v1(this.b);
                this.c[0].dismiss();
                break;
            default:
                org.telegram.messenger.g0.v1(this.b);
                this.c[0].dismiss();
                break;
        }
    }

    public /* synthetic */ da(org.telegram.ui.ActionBar.t2[] t2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = t2VarArr;
        this.b = editTextBoldCursor;
    }
}
