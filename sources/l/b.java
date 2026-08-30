package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b extends v1 {
    public final /* synthetic */ int s = 0;
    public final /* synthetic */ View v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v = actionMenuItemView;
    }

    @Override // m.v1
    public final b0 b() {
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

    @Override // m.v1
    public final boolean c() {
        b0 b10;
        switch (this.s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                j jVar = actionMenuItemView.v;
                return jVar != null && jVar.a(actionMenuItemView.n) && (b10 = b()) != null && b10.a();
            default:
                ((m.g) this.v).d.l();
                return true;
        }
    }

    @Override // m.v1
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
