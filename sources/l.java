// default package

import java.util.ArrayList;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ l(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                gm.t1(editTextBoldCursor);
                break;
            case 1:
                editTextBoldCursor.y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.a;
                if (!arrayList.isEmpty()) {
                    ((rna) arrayList.get(0)).q = new l(editTextBoldCursor, (byte) 2);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((rna) obj).j(editTextBoldCursor.w, editTextBoldCursor.x, sqrt, true);
                    }
                    break;
                }
                break;
            case 2:
                editTextBoldCursor.post(new l(editTextBoldCursor, (byte) 3));
                break;
            case 3:
                editTextBoldCursor.j(false, true);
                break;
            case 4:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            case 5:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            case 6:
                gm.E3(editTextBoldCursor);
                break;
            case 7:
                gm.E3(editTextBoldCursor);
                break;
            case 8:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            case 9:
                gm.E3(editTextBoldCursor);
                break;
            case 10:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            default:
                editTextBoldCursor.requestFocus();
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                gm.E3(editTextBoldCursor);
                break;
        }
    }
}
