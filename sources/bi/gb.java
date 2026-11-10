package bi;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] c;

    public /* synthetic */ gb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
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
                org.telegram.messenger.g0.h3(new ab(editTextBoldCursor, 1));
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

    public /* synthetic */ gb(org.telegram.ui.ActionBar.w2[] w2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = w2VarArr;
        this.b = editTextBoldCursor;
    }
}
