package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.u1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends u1 {
    public final /* synthetic */ int s = 0;
    public final /* synthetic */ View v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v = actionMenuItemView;
    }

    @Override // m.u1
    public final c0 b() {
        m.d dVar;
        switch (this.s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.v).x;
                if (cVar == null || (dVar = ((m.e) cVar).a.G) == null) {
                    return null;
                }
                return dVar.a();
            default:
                m.d dVar2 = ((m.g) this.v).d.F;
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
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                k kVar = actionMenuItemView.v;
                return kVar != null && kVar.a(actionMenuItemView.n) && (b10 = b()) != null && b10.a();
            default:
                ((m.g) this.v).d.l();
                return true;
        }
    }

    @Override // m.u1
    public boolean d() {
        switch (this.s) {
            case 1:
                m.h hVar = ((m.g) this.v).d;
                if (hVar.H != null) {
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
        this.v = gVar;
    }
}
