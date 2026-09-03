package dg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import wh.v5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((c0) this.b).c;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = ((d0) this.b).d;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 2:
                mh.l lVar = ((mh.p) this.b).J;
                float f10 = z4 ? 1.0f : 0.0f;
                lVar.b(f10, f10, true);
                break;
            case 3:
                ((mh.m0) this.b).Z.c(z4, !TextUtils.isEmpty(r2.a0.getText()));
                break;
            case 4:
                ((mh.r0) this.b).f.c(z4, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 5:
                ((mh.v0) this.b).b.c(z4, !TextUtils.isEmpty(r2.c.getText()));
                break;
            case 6:
                ng.p pVar = (ng.p) this.b;
                if (!z4) {
                    pVar.m();
                    break;
                } else {
                    pVar.n(true);
                    Runnable runnable = pVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                v5.a((v5) this.b, z4);
                break;
        }
    }
}
