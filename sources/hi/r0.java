package hi;

import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ r0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        v0 v0Var = this.b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                u0 u0Var = v0Var.n;
                if (u0Var != null) {
                    u0Var.setProgress(f10.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (v0Var.c && v0Var.r != null) {
                    v0Var.n.b(R.raw.ic_save_to_gallery, 3500, gd.O0("VideoSavedHint"));
                    v0Var.c = false;
                    v0Var.d();
                    v0Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                v0Var.c = false;
                v0Var.d();
                u0 u0Var2 = v0Var.n;
                if (u0Var2 != null) {
                    u0Var2.a();
                    v0Var.n = null;
                }
                u0 u0Var3 = new u0(v0Var.getContext());
                v0Var.n = u0Var3;
                u0Var3.b(R.raw.ic_save_to_gallery, 2500, gd.O0("PhotoSavedHint"));
                v0Var.b.addView(v0Var.n);
                v0Var.w = uri2;
                break;
        }
    }
}
