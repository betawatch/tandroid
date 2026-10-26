package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kd1 extends org.telegram.ui.ActionBar.s0 {
    public boolean a = false;
    public final /* synthetic */ pd1 b;

    public kd1(pd1 pd1Var) {
        this.b = pd1Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        pd1 pd1Var = this.b;
        if (pd1Var.a.getVisibility() != 0) {
            pd1Var.a.setVisibility(0);
            pd1Var.a.setAlpha(0.0f);
        }
        pd1Var.r.setVisibility(8);
        pd1Var.d.l();
        pd1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        pd1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new jd1(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        od1 od1Var = this.b.e;
        if (od1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(od1Var.e);
            od1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            od1Var.c.clear();
            od1Var.d.clear();
            od1Var.l();
            od1Var.h.r.setVisibility(8);
        } else {
            int i10 = od1Var.f + 1;
            od1Var.f = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            nd1 nd1Var = new nd1(od1Var, obj, i10, 0);
            od1Var.e = nd1Var;
            dispatchQueue2.postRunnable(nd1Var, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new jd1(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.l();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
