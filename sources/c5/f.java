package c5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;
import v4.e1;
import v4.v0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends r0.b {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public f(e1 e1Var) {
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
        boolean z9;
        a aVar;
        switch (this.d) {
            case 0:
                k kVar = (k) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(k.class.getName());
                a aVar2 = kVar.e;
                if (aVar2 != null) {
                    z9 = true;
                    break;
                }
                z9 = false;
                accessibilityEvent.setScrollable(z9);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = kVar.e) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(kVar.f);
                    accessibilityEvent.setToIndex(kVar.f);
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
                dVar.i(k.class.getName());
                k kVar = (k) this.e;
                a aVar = kVar.e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (kVar.canScrollHorizontally(1)) {
                    dVar.a(TLObject.FLAG_12);
                }
                if (kVar.canScrollHorizontally(-1)) {
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
    public final boolean d(View view, int i7, Bundle bundle) {
        switch (this.d) {
            case 0:
                k kVar = (k) this.e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                if (i7 != 4096) {
                    if (i7 == 8192 && kVar.canScrollHorizontally(-1)) {
                        kVar.setCurrentItem(kVar.f - 1);
                        return true;
                    }
                } else if (kVar.canScrollHorizontally(1)) {
                    kVar.setCurrentItem(kVar.f + 1);
                    return true;
                }
                return false;
            default:
                e1 e1Var = (e1) this.e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                boolean e10 = e1Var.e();
                RecyclerView recyclerView = e1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    v0 v0Var = recyclerView.getLayoutManager().b.b;
                }
                return false;
        }
    }

    public f(k kVar) {
        this.e = kVar;
    }
}
