// default package

import java.util.ArrayList;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.t1(editTextBoldCursor);
                break;
            case 1:
                editTextBoldCursor.y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.a;
                if (!arrayList.isEmpty()) {
                    ((qla) arrayList.get(0)).q = new l(editTextBoldCursor, (byte) 2);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((qla) obj).j(editTextBoldCursor.w, editTextBoldCursor.x, sqrt, true);
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
                gl.F3(editTextBoldCursor);
                break;
            case 5:
                editTextBoldCursor.requestFocus();
                gl.F3(editTextBoldCursor);
                break;
            case 6:
                gl.F3(editTextBoldCursor);
                break;
            case 7:
                gl.F3(editTextBoldCursor);
                break;
            case 8:
                editTextBoldCursor.requestFocus();
                gl.F3(editTextBoldCursor);
                break;
            case 9:
                gl.F3(editTextBoldCursor);
                break;
            case 10:
                editTextBoldCursor.requestFocus();
                gl.F3(editTextBoldCursor);
                break;
            default:
                editTextBoldCursor.requestFocus();
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                gl.F3(editTextBoldCursor);
                break;
        }
    }
}
