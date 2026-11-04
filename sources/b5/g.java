package b5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;
import u4.e1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends r0.b {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public g(e1 e1Var) {
        this.e = e1Var;
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
    public final void c(View view, s0.d dVar) {
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(l.class.getName());
                l lVar = (l) this.e;
                a aVar = lVar.e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (lVar.canScrollHorizontally(1)) {
                    dVar.a(TLObject.FLAG_12);
                }
                if (lVar.canScrollHorizontally(-1)) {
                    dVar.a(TLObject.FLAG_13);
                    break;
                }
                break;
            default:
                this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
                e1 e1Var = (e1) this.e;
                boolean e10 = e1Var.e();
                RecyclerView recyclerView = e1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, dVar);
                    break;
                }
                break;
        }
    }

    @Override // r0.b
    public final boolean d(View view, int i3, Bundle bundle) {
        switch (this.d) {
            case 0:
                l lVar = (l) this.e;
                if (super.d(view, i3, bundle)) {
                    return true;
                }
                if (i3 != 4096) {
                    if (i3 == 8192 && lVar.canScrollHorizontally(-1)) {
                        lVar.setCurrentItem(lVar.f - 1);
                        return true;
                    }
                } else if (lVar.canScrollHorizontally(1)) {
                    lVar.setCurrentItem(lVar.f + 1);
                    return true;
                }
                return false;
            default:
                e1 e1Var = (e1) this.e;
                if (super.d(view, i3, bundle)) {
                    return true;
                }
                boolean e10 = e1Var.e();
                RecyclerView recyclerView = e1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    tf.e eVar = recyclerView.getLayoutManager().b.b;
                }
                return false;
        }
    }

    public g(l lVar) {
        this.e = lVar;
    }
}
