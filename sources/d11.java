// default package

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d11 implements View.OnLayoutChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ m21 b;

    public d11(m21 m21Var, boolean z) {
        this.b = m21Var;
        this.a = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i11 i11Var;
        m21 m21Var = this.b;
        q11 q11Var = m21Var.e;
        q11Var.removeOnLayoutChangeListener(this);
        if (m21Var.l) {
            q11Var.onShow();
            d dVar = m21Var.g;
            boolean z = this.a;
            if (z && (dVar instanceof jec)) {
                dVar = ((jec) dVar).b0();
            }
            FrameLayout frameLayout = m21Var.h;
            if (dVar == null || (i11Var = dVar.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof i11) {
                        i11Var = (i11) tag;
                    }
                }
                i11Var = null;
            }
            m21Var.p = i11Var;
            byte b = 1;
            if (i11Var == null && dVar != null) {
                i11Var = new xf0(dVar, b);
                m21Var.p = i11Var;
            }
            yla ylaVar = m21Var.d;
            if (ylaVar == null || !ylaVar.f) {
                m21Var.o = i11Var != null ? i11Var.e(m21Var.a) : 0;
            }
            i11 i11Var2 = m21Var.p;
            if (i11Var2 != null) {
                i11Var2.g(m21Var);
            }
            if (dVar != null) {
                dVar.setupBulletinGlass(m21Var);
            }
            if (na7.c1().getBoolean("view_animations", true) && !m21Var.s) {
                if (q11Var != null && m21Var.q == null) {
                    m21Var.q = q11Var.createTransition();
                }
                q11Var.transitionRunningEnter = true;
                q11Var.delegate = m21Var.p;
                q11Var.invalidate();
                p11 p11Var = m21Var.q;
                Objects.requireNonNull(q11Var);
                p11Var.f(q11Var, new b11(q11Var, (byte) 1), new nv0(this, (byte) 7), new i42((byte) 2, this, z));
                return;
            }
            i11 i11Var3 = m21Var.p;
            q11Var.delegate = i11Var3;
            if (i11Var3 != null && !z) {
                i11Var3.b(q11Var.getHeight());
            }
            m21Var.l();
            q11Var.onEnterTransitionStart();
            q11Var.onEnterTransitionEnd();
            if (m21Var.u) {
                m21Var.i(true);
            }
        }
    }
}
