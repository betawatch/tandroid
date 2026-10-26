package a8;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class de {
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
