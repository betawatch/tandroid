package k7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.o3.a(view, charSequence);
            return;
        }
        m.q3 q3Var = m.q3.v;
        if (q3Var != null && q3Var.a == view) {
            m.q3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.q3(view, charSequence);
            return;
        }
        m.q3 q3Var2 = m.q3.w;
        if (q3Var2 != null && q3Var2.a == view) {
            q3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
