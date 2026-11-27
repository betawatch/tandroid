// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l74 extends ri6 {
    public final /* synthetic */ m74 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l74(m74 m74Var) {
        super((byte) 2);
        this.f = m74Var;
    }

    @Override // ri6
    public final boolean E(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        m74 m74Var = this.f;
        View view = m74Var.i;
        if (i == -1) {
            WeakHashMap weakHashMap = ihc.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (m74Var.l != i) {
                    return false;
                }
                m74Var.l = TLObject.FLAG_31;
                m74Var.m(i, 8);
                return true;
            }
            if (i2 != 64) {
                if (i2 != 128) {
                    return m74Var.k(i, i2);
                }
                if (m74Var.k != i) {
                    return false;
                }
                m74Var.k = TLObject.FLAG_31;
                view.invalidate();
                m74Var.m(i, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = m74Var.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = m74Var.k) != i) {
                if (i4 != Integer.MIN_VALUE) {
                    m74Var.k = TLObject.FLAG_31;
                    view.invalidate();
                    m74Var.m(i4, 65536);
                }
                m74Var.k = i;
                view.invalidate();
                m74Var.m(i, 32768);
                return true;
            }
        } else if ((view.isFocused() || view.requestFocus()) && (i3 = m74Var.l) != i) {
            if (i3 != Integer.MIN_VALUE) {
                m74Var.l = TLObject.FLAG_31;
                m74Var.m(i3, 8);
            }
            m74Var.l = i;
            m74Var.m(i, 8);
            return true;
        }
        return false;
    }

    @Override // ri6
    public final v4 h(int i) {
        return new v4(AccessibilityNodeInfo.obtain(this.f.j(i).a));
    }

    @Override // ri6
    public final v4 l(int i) {
        m74 m74Var = this.f;
        int i2 = i == 2 ? m74Var.k : m74Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return h(i2);
    }
}
