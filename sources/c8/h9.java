package c8;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class h9 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.l3.a(view, charSequence);
            return;
        }
        m.n3 n3Var = m.n3.w;
        if (n3Var != null && n3Var.a == view) {
            m.n3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.n3(view, charSequence);
            return;
        }
        m.n3 n3Var2 = m.n3.x;
        if (n3Var2 != null && n3Var2.a == view) {
            n3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
