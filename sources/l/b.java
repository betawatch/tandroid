package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.u1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
    public final b0 b() {
        m.d dVar;
        switch (this.s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.w).y;
                if (cVar == null || (dVar = ((m.e) cVar).a.K) == null) {
                    return null;
                }
                return dVar.a();
            default:
                m.d dVar2 = ((m.g) this.w).d.J;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.a();
        }
    }

    @Override // m.u1
    public final boolean c() {
        b0 b10;
        switch (this.s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.w;
                j jVar = actionMenuItemView.w;
                return jVar != null && jVar.a(actionMenuItemView.n) && (b10 = b()) != null && b10.a();
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
                if (hVar.L != null) {
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
