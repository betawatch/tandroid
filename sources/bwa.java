// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ my0[] c;

    public /* synthetic */ bwa(my0[] my0VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 0;
        this.c = my0VarArr;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        my0[] my0VarArr = this.c;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                my0VarArr[0].v0(true);
                editTextBoldCursor.requestFocus();
                gm.c3(new l(editTextBoldCursor, (byte) 9));
                break;
            case 1:
                gm.t1(editTextBoldCursor);
                my0VarArr[0].dismiss();
                break;
            default:
                gm.t1(editTextBoldCursor);
                my0VarArr[0].dismiss();
                break;
        }
    }

    public /* synthetic */ bwa(EditTextBoldCursor editTextBoldCursor, my0[] my0VarArr, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
        this.c = my0VarArr;
    }
}
