package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ zs(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.a = i3;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.b;
                int i3 = 0;
                editTextBoldCursor.y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.a;
                if (!arrayList.isEmpty()) {
                    ((yh.f) arrayList.get(0)).q = new zs(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((yh.f) obj).j(editTextBoldCursor.w, editTextBoldCursor.x, sqrt, true);
                    }
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.b;
                editTextBoldCursor2.post(new zs(editTextBoldCursor2, 2));
                break;
            case 2:
                this.b.j(false, true);
                break;
            case 3:
                org.telegram.messenger.g0.K3(this.b);
                break;
            case 4:
                org.telegram.messenger.g0.K3(this.b);
                break;
            case 5:
                org.telegram.messenger.g0.K3(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.K3(this.b);
                break;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.g0.K3(editTextBoldCursor4);
                break;
        }
    }
}
