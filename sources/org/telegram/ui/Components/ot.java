package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ ot(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.b;
                int i10 = 0;
                editTextBoldCursor.y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.a;
                if (!arrayList.isEmpty()) {
                    ((nh.i) arrayList.get(0)).q = new ot(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((nh.i) obj).j(editTextBoldCursor.w, editTextBoldCursor.x, sqrt, true);
                    }
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.b;
                editTextBoldCursor2.post(new ot(editTextBoldCursor2, 2));
                break;
            case 2:
                this.b.j(false, true);
                break;
            case 3:
                org.telegram.messenger.i0.J3(this.b);
                break;
            case 4:
                org.telegram.messenger.i0.J3(this.b);
                break;
            case 5:
                org.telegram.messenger.i0.J3(this.b);
                break;
            case 6:
                org.telegram.messenger.i0.J3(this.b);
                break;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor3);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.i0.J3(editTextBoldCursor4);
                break;
        }
    }
}
