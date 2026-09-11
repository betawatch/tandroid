package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import ji.u4;
import org.telegram.tgnet.TLObject;
import r0.i0;
import s0.c;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a extends u4 {
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(22);
        this.c = bVar;
    }

    @Override // ji.u4
    public final boolean N(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.c;
        View view = bVar.i;
        if (i10 == -1) {
            WeakHashMap weakHashMap = i0.a;
            return view.performAccessibilityAction(i11, bundle);
        }
        if (i11 != 1) {
            if (i11 == 2) {
                if (bVar.l != i10) {
                    return false;
                }
                bVar.l = TLObject.FLAG_31;
                bVar.m(i10, 8);
                return true;
            }
            if (i11 != 64) {
                if (i11 != 128) {
                    return bVar.k(i10, i11);
                }
                if (bVar.k != i10) {
                    return false;
                }
                bVar.k = TLObject.FLAG_31;
                view.invalidate();
                bVar.m(i10, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.k) != i10) {
                if (i13 != Integer.MIN_VALUE) {
                    bVar.k = TLObject.FLAG_31;
                    view.invalidate();
                    bVar.m(i13, 65536);
                }
                bVar.k = i10;
                view.invalidate();
                bVar.m(i10, 32768);
                return true;
            }
        } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.l) != i10) {
            if (i12 != Integer.MIN_VALUE) {
                bVar.l = TLObject.FLAG_31;
                bVar.m(i12, 8);
            }
            bVar.l = i10;
            bVar.m(i10, 8);
            return true;
        }
        return false;
    }

    @Override // ji.u4
    public final c o(int i10) {
        return new c(AccessibilityNodeInfo.obtain(this.c.j(i10).a));
    }

    @Override // ji.u4
    public final c z(int i10) {
        b bVar = this.c;
        int i11 = i10 == 2 ? bVar.k : bVar.l;
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return o(i11);
    }
}
