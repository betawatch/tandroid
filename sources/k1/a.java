package k1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cf;
import r0.i0;
import s0.c;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a extends cf {
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(15);
        this.b = bVar;
    }

    @Override // org.telegram.ui.Components.cf
    public final c m(int i7) {
        return new c(AccessibilityNodeInfo.obtain(this.b.j(i7).a));
    }

    @Override // org.telegram.ui.Components.cf
    public final c p(int i7) {
        b bVar = this.b;
        int i10 = i7 == 2 ? bVar.k : bVar.l;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return m(i10);
    }

    @Override // org.telegram.ui.Components.cf
    public final boolean r(int i7, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.b;
        View view = bVar.i;
        if (i7 == -1) {
            WeakHashMap weakHashMap = i0.a;
            return view.performAccessibilityAction(i10, bundle);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                if (bVar.l != i7) {
                    return false;
                }
                bVar.l = TLObject.FLAG_31;
                bVar.m(i7, 8);
                return true;
            }
            if (i10 != 64) {
                if (i10 != 128) {
                    return bVar.k(i7, i10);
                }
                if (bVar.k != i7) {
                    return false;
                }
                bVar.k = TLObject.FLAG_31;
                view.invalidate();
                bVar.m(i7, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.k) != i7) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.k = TLObject.FLAG_31;
                    view.invalidate();
                    bVar.m(i12, 65536);
                }
                bVar.k = i7;
                view.invalidate();
                bVar.m(i7, 32768);
                return true;
            }
        } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.l) != i7) {
            if (i11 != Integer.MIN_VALUE) {
                bVar.l = TLObject.FLAG_31;
                bVar.m(i11, 8);
            }
            bVar.l = i7;
            bVar.m(i7, 8);
            return true;
        }
        return false;
    }
}
