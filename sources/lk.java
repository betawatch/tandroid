// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk implements xr3 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lk(float f, View view, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f;
    }

    @Override // xr3
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.d;
        float f3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) obj2;
                View view = (View) obj;
                if (runnable != null) {
                    runnable.run();
                }
                view.setTranslationX(f3);
                view.setTag(R.id.spring_tag, null);
                view.setTag(R.id.spring_was_translation_x_tag, null);
                break;
            default:
                wr4 wr4Var = (wr4) obj2;
                tr4 tr4Var = (tr4) obj;
                vr4 vr4Var = wr4Var.l1;
                if (!z) {
                    vr4Var.setTranslationY(f3);
                    vr4Var.L = false;
                    wr4Var.n1 = null;
                    wr4Var.o1 = null;
                    if (tr4Var != null) {
                        tr4Var.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ lk(wr4 wr4Var, float f, tr4 tr4Var) {
        this.c = wr4Var;
        this.b = f;
        this.d = tr4Var;
    }
}
