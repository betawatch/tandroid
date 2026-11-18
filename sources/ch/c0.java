package ch;

import android.text.TextUtils;
import android.view.View;
import di.u0;
import oi.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.t4;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                m mVar = (m) this.b;
                if (!z10) {
                    mVar.J();
                    break;
                } else {
                    mVar.K(true);
                    Runnable runnable = mVar.g2;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                di.p pVar = ((di.t) this.b).W;
                float f10 = z10 ? 1.0f : 0.0f;
                pVar.b(f10, f10, true);
                break;
            case 2:
                ((di.r0) this.b).q1.c(z10, !TextUtils.isEmpty(r2.r1.getText()));
                break;
            case 3:
                ((u0) this.b).m1.c(z10, !TextUtils.isEmpty(r2.n1.getText()));
                break;
            case 4:
                z5.a((z5) this.b, z10);
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((t4) this.b).f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((sg.p) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
