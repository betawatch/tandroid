package k7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.p3.a(view, charSequence);
            return;
        }
        m.r3 r3Var = m.r3.v;
        if (r3Var != null && r3Var.a == view) {
            m.r3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.r3(view, charSequence);
            return;
        }
        m.r3 r3Var2 = m.r3.w;
        if (r3Var2 != null && r3Var2.a == view) {
            r3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
