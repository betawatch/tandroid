package ch;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.b11;
import org.telegram.ui.bn;
import org.telegram.ui.r11;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x extends r11 {
    public final /* synthetic */ vi0 f2;
    public final /* synthetic */ h2 g2;
    public final /* synthetic */ b0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, h2 h2Var, Context context, int i7, boolean z10, i6 i6Var, vi0 vi0Var, h2 h2Var2) {
        super(h2Var, context, false, null, i7, z10, i6Var, 16);
        this.h2 = b0Var;
        this.f2 = vi0Var;
        this.g2 = h2Var2;
    }

    @Override // org.telegram.ui.r11
    public final void m() {
        this.h2.a.invalidate();
    }

    @Override // org.telegram.ui.r11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ai.k0 k0Var = this.h2.c;
        vi0 vi0Var = this.f2;
        h2 h2Var = this.g2;
        if (h2Var != null && !vi0Var.B0 && vi0Var.getWindowType() != 13 && !j10.i(h2Var.getCurrentAccount()).q()) {
            try {
                k0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new lc(k0Var, null).r(document, org.telegram.messenger.g0.W2(gd.M0(2131743624, null)), gd.M0(2131746840, null), new ca.r(this, 4)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            o5.g(j10.t0).e(document);
        }
        long longValue = l10 == null ? document.id : l10.longValue();
        p0 p0Var = new p0();
        p0Var.g = longValue;
        p0Var.h = longValue;
        vi0Var.l(view, p0Var, false);
        org.telegram.messenger.g0.v1(k0Var);
    }

    @Override // org.telegram.ui.r11
    public final void q() {
        b0 b0Var = this.h2;
        if (b0Var.v) {
            return;
        }
        b0Var.v = true;
        if (!b0Var.d) {
            b0Var.b.updateViewLayout(b0Var.c, b0Var.b(true));
        }
        h2 h2Var = this.g2;
        if (h2Var instanceof bn) {
            ((bn) h2Var).sa();
        }
        vi0 vi0Var = this.f2;
        if (vi0Var.getDelegate() != null) {
            vi0Var.getDelegate().q();
        }
    }

    @Override // org.telegram.ui.r11
    public final void r(b11 b11Var, p0 p0Var) {
        this.f2.l(b11Var, p0Var, false);
        org.telegram.messenger.g0.v1(this.h2.c);
    }

    @Override // org.telegram.ui.r11
    public final boolean u() {
        vi0 vi0Var = this.f2;
        if (vi0Var.getDelegate() != null) {
            return vi0Var.getDelegate().q();
        }
        return false;
    }
}
