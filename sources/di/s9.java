package di;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] c;

    public /* synthetic */ s9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
        this.c = u2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new ch.w(editTextBoldCursor, 22));
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

    public /* synthetic */ s9(org.telegram.ui.ActionBar.u2[] u2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = u2VarArr;
        this.b = editTextBoldCursor;
    }
}
