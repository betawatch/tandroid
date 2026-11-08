package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends v1 {
    public final /* synthetic */ int s = 0;
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.w = actionMenuItemView;
    }

    @Override // m.v1
    public final b0 b() {
        m.e eVar;
        switch (this.s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.w).y;
                if (cVar == null || (eVar = ((m.f) cVar).a.J) == null) {
                    return null;
                }
                return eVar.a();
            default:
                m.e eVar2 = ((m.h) this.w).d.I;
                if (eVar2 == null) {
                    return null;
                }
                return eVar2.a();
        }
    }

    @Override // m.v1
    public final boolean c() {
        b0 b10;
        switch (this.s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.w;
                j jVar = actionMenuItemView.w;
                return jVar != null && jVar.a(actionMenuItemView.n) && (b10 = b()) != null && b10.a();
            default:
                ((m.h) this.w).d.l();
                return true;
        }
    }

    @Override // m.v1
    public boolean d() {
        switch (this.s) {
            case 1:
                m.i iVar = ((m.h) this.w).d;
                if (iVar.K != null) {
                    return false;
                }
                iVar.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m.h hVar, m.h hVar2) {
        super(hVar2);
        this.w = hVar;
    }
}
