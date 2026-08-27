package h7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
