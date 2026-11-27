// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class aya implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ nx0[] c;

    public /* synthetic */ aya(nx0[] nx0VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 0;
        this.c = nx0VarArr;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nx0[] nx0VarArr = this.c;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                nx0VarArr[0].w0(true);
                editTextBoldCursor.requestFocus();
                hl.c3(new l(editTextBoldCursor, (byte) 9));
                break;
            case 1:
                hl.t1(editTextBoldCursor);
                nx0VarArr[0].dismiss();
                break;
            default:
                hl.t1(editTextBoldCursor);
                nx0VarArr[0].dismiss();
                break;
        }
    }

    public /* synthetic */ aya(EditTextBoldCursor editTextBoldCursor, nx0[] nx0VarArr, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
        this.c = nx0VarArr;
    }
}
