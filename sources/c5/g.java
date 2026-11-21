package c5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;
import v4.g1;
import v4.x0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g extends r0.b {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public g(g1 g1Var) {
        this.e = g1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r3.b() > 1) goto L12;
     */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        a aVar;
        switch (this.d) {
            case 0:
                l lVar = (l) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(l.class.getName());
                a aVar2 = lVar.e;
                if (aVar2 != null) {
                    z10 = true;
                    break;
                }
                z10 = false;
                accessibilityEvent.setScrollable(z10);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = lVar.e) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(lVar.f);
                    accessibilityEvent.setToIndex(lVar.f);
                    break;
                }
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override // r0.b
    public final void c(View view, s0.c cVar) {
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                cVar.i(l.class.getName());
                l lVar = (l) this.e;
                a aVar = lVar.e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (lVar.canScrollHorizontally(1)) {
                    cVar.a(TLObject.FLAG_12);
                }
                if (lVar.canScrollHorizontally(-1)) {
                    cVar.a(TLObject.FLAG_13);
                    break;
                }
                break;
            default:
                this.a.onInitializeAccessibilityNodeInfo(view, cVar.a);
                g1 g1Var = (g1) this.e;
                boolean e10 = g1Var.e();
                RecyclerView recyclerView = g1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, cVar);
                    break;
                }
                break;
        }
    }

    @Override // r0.b
    public final boolean d(View view, int i7, Bundle bundle) {
        switch (this.d) {
            case 0:
                l lVar = (l) this.e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                if (i7 != 4096) {
                    if (i7 == 8192 && lVar.canScrollHorizontally(-1)) {
                        lVar.setCurrentItem(lVar.f - 1);
                        return true;
                    }
                } else if (lVar.canScrollHorizontally(1)) {
                    lVar.setCurrentItem(lVar.f + 1);
                    return true;
                }
                return false;
            default:
                g1 g1Var = (g1) this.e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                boolean e10 = g1Var.e();
                RecyclerView recyclerView = g1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    x0 x0Var = recyclerView.getLayoutManager().b.b;
                }
                return false;
        }
    }

    public g(l lVar) {
        this.e = lVar;
    }
}
