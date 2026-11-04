package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nh;
import r0.i0;
import s0.d;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends nh {
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(17);
        this.c = bVar;
    }

    @Override // org.telegram.ui.Components.nh
    public final d A(int i3) {
        b bVar = this.c;
        int i10 = i3 == 2 ? bVar.k : bVar.l;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return y(i10);
    }

    @Override // org.telegram.ui.Components.nh
    public final boolean D(int i3, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.c;
        View view = bVar.i;
        if (i3 == -1) {
            WeakHashMap weakHashMap = i0.a;
            return view.performAccessibilityAction(i10, bundle);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                if (bVar.l != i3) {
                    return false;
                }
                bVar.l = TLObject.FLAG_31;
                bVar.m(i3, 8);
                return true;
            }
            if (i10 != 64) {
                if (i10 != 128) {
                    return bVar.k(i3, i10);
                }
                if (bVar.k != i3) {
                    return false;
                }
                bVar.k = TLObject.FLAG_31;
                view.invalidate();
                bVar.m(i3, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.k) != i3) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.k = TLObject.FLAG_31;
                    view.invalidate();
                    bVar.m(i12, 65536);
                }
                bVar.k = i3;
                view.invalidate();
                bVar.m(i3, 32768);
                return true;
            }
        } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.l) != i3) {
            if (i11 != Integer.MIN_VALUE) {
                bVar.l = TLObject.FLAG_31;
                bVar.m(i11, 8);
            }
            bVar.l = i3;
            bVar.m(i3, 8);
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nh
    public final d y(int i3) {
        return new d(AccessibilityNodeInfo.obtain(this.c.j(i3).a));
    }
}
