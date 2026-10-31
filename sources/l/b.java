package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.u1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends u1 {
    public final /* synthetic */ int s = 0;
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.w = actionMenuItemView;
    }

    @Override // m.u1
    public final c0 b() {
        m.d dVar;
        switch (this.s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.w).y;
                if (cVar == null || (dVar = ((m.e) cVar).a.J) == null) {
                    return null;
                }
                return dVar.a();
            default:
                m.d dVar2 = ((m.g) this.w).d.I;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.a();
        }
    }

    @Override // m.u1
    public final boolean c() {
        c0 b10;
        switch (this.s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.w;
                k kVar = actionMenuItemView.w;
                return kVar != null && kVar.a(actionMenuItemView.n) && (b10 = b()) != null && b10.a();
            default:
                ((m.g) this.w).d.l();
                return true;
        }
    }

    @Override // m.u1
    public boolean d() {
        switch (this.s) {
            case 1:
                m.h hVar = ((m.g) this.w).d;
                if (hVar.K != null) {
                    return false;
                }
                hVar.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m.g gVar, m.g gVar2) {
        super(gVar2);
        this.w = gVar;
    }
}
