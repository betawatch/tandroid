package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class md1 extends org.telegram.ui.ActionBar.s0 {
    public boolean a = false;
    public final /* synthetic */ rd1 b;

    public md1(rd1 rd1Var) {
        this.b = rd1Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        rd1 rd1Var = this.b;
        if (rd1Var.a.getVisibility() != 0) {
            rd1Var.a.setVisibility(0);
            rd1Var.a.setAlpha(0.0f);
        }
        rd1Var.r.setVisibility(8);
        rd1Var.d.l();
        rd1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        rd1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new ld1(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        qd1 qd1Var = this.b.e;
        if (qd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(qd1Var.e);
            qd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            qd1Var.c.clear();
            qd1Var.d.clear();
            qd1Var.l();
            qd1Var.h.r.setVisibility(8);
        } else {
            int i10 = qd1Var.f + 1;
            qd1Var.f = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            pd1 pd1Var = new pd1(qd1Var, obj, i10, 0);
            qd1Var.e = pd1Var;
            dispatchQueue2.postRunnable(pd1Var, 300L);
        }
        if (this.a || TextUtils.isEmpty(obj)) {
            if (this.a && TextUtils.isEmpty(obj)) {
                h();
                return;
            }
            return;
        }
        if (this.b.s.getVisibility() != 0) {
            this.b.s.setVisibility(0);
            this.b.s.setAlpha(0.0f);
        }
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new ld1(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.l();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
