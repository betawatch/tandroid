package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        m.e eVar;
        switch (this.s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.v).x;
                if (cVar == null || (eVar = ((m.f) cVar).a.F) == null) {
                    return null;
                }
                return eVar.a();
            default:
                m.e eVar2 = ((m.h) this.v).d.E;
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
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                j jVar = actionMenuItemView.v;
                return jVar != null && jVar.a(actionMenuItemView.n) && (b10 = b()) != null && b10.a();
            default:
                ((m.h) this.v).d.l();
                return true;
        }
    }

    @Override // m.v1
    public boolean d() {
        switch (this.s) {
            case 1:
                m.i iVar = ((m.h) this.v).d;
                if (iVar.G != null) {
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
        this.v = hVar;
    }
}
