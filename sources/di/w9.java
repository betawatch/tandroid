package di;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] c;

    public /* synthetic */ w9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
        this.c = w2VarArr;
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

    public /* synthetic */ w9(org.telegram.ui.ActionBar.w2[] w2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = w2VarArr;
        this.b = editTextBoldCursor;
    }
}
