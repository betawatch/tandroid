package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import n5.e0;
import org.telegram.tgnet.TLObject;
import r0.j0;
import s0.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends e0 {
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(21);
        this.c = bVar;
    }

    @Override // n5.e0
    public final d P0(int i9) {
        return new d(AccessibilityNodeInfo.obtain(this.c.j(i9).a));
    }

    @Override // n5.e0
    public final d X0(int i9) {
        b bVar = this.c;
        int i10 = i9 == 2 ? bVar.k : bVar.l;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return P0(i10);
    }

    @Override // n5.e0
    public final boolean c1(int i9, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.c;
        View view = bVar.i;
        if (i9 == -1) {
            WeakHashMap weakHashMap = j0.a;
            return view.performAccessibilityAction(i10, bundle);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                if (bVar.l != i9) {
                    return false;
                }
                bVar.l = TLObject.FLAG_31;
                bVar.m(i9, 8);
                return true;
            }
            if (i10 != 64) {
                if (i10 != 128) {
                    return bVar.k(i9, i10);
                }
                if (bVar.k != i9) {
                    return false;
                }
                bVar.k = TLObject.FLAG_31;
                view.invalidate();
                bVar.m(i9, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.k) != i9) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.k = TLObject.FLAG_31;
                    view.invalidate();
                    bVar.m(i12, 65536);
                }
                bVar.k = i9;
                view.invalidate();
                bVar.m(i9, 32768);
                return true;
            }
        } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.l) != i9) {
            if (i11 != Integer.MIN_VALUE) {
                bVar.l = TLObject.FLAG_31;
                bVar.m(i11, 8);
            }
            bVar.l = i9;
            bVar.m(i9, 8);
            return true;
        }
        return false;
    }
}
