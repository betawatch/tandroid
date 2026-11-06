package fi;

import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ p0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        t0 t0Var = this.b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                s0 s0Var = t0Var.n;
                if (s0Var != null) {
                    s0Var.setProgress(f10.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (t0Var.c && t0Var.r != null) {
                    t0Var.n.b(R.raw.ic_save_to_gallery, 3500, hd.N0("VideoSavedHint"));
                    t0Var.c = false;
                    t0Var.d();
                    t0Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                t0Var.c = false;
                t0Var.d();
                s0 s0Var2 = t0Var.n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var.n = null;
                }
                s0 s0Var3 = new s0(t0Var.getContext());
                t0Var.n = s0Var3;
                s0Var3.b(R.raw.ic_save_to_gallery, 2500, hd.N0("PhotoSavedHint"));
                t0Var.b.addView(t0Var.n);
                t0Var.w = uri2;
                break;
        }
    }
}
