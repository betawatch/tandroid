package g7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.q3.a(view, charSequence);
            return;
        }
        m.s3 s3Var = m.s3.v;
        if (s3Var != null && s3Var.a == view) {
            m.s3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.s3(view, charSequence);
            return;
        }
        m.s3 s3Var2 = m.s3.w;
        if (s3Var2 != null && s3Var2.a == view) {
            s3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
