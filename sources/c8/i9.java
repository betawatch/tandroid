package c8;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class i9 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.n3.a(view, charSequence);
            return;
        }
        m.p3 p3Var = m.p3.w;
        if (p3Var != null && p3Var.a == view) {
            m.p3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.p3(view, charSequence);
            return;
        }
        m.p3 p3Var2 = m.p3.x;
        if (p3Var2 != null && p3Var2.a == view) {
            p3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
