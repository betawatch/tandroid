// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i14 extends vu7 {
    public final /* synthetic */ o24 c;

    public i14(o24 o24Var) {
        this.c = o24Var;
    }

    @Override // vu7
    public final void a(fic ficVar, Object obj) {
        ficVar.removeView((View) obj);
    }

    @Override // vu7
    public final int b() {
        return this.c.e.size();
    }

    @Override // vu7
    public final CharSequence d(int i) {
        if (i == 0) {
            return ob6.M0(2131751161, null);
        }
        if (i == 1) {
            return ob6.M0(2131754875, null);
        }
        if (i != 2) {
            return null;
        }
        return ob6.M0(2131754751, null);
    }

    @Override // vu7
    public final Object e(fic ficVar, int i) {
        FrameLayout frameLayout = ((k24) this.c.e.get(i)).b;
        ficVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // vu7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
