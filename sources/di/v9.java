package di;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2[] c;

    public /* synthetic */ v9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.x2[] x2VarArr, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
        this.c = x2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new ca.r(editTextBoldCursor, 26));
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

    public /* synthetic */ v9(org.telegram.ui.ActionBar.x2[] x2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = x2VarArr;
        this.b = editTextBoldCursor;
    }
}
