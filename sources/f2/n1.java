package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n1 extends r0.b {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public n1(o1 o1Var) {
        this.e = o1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r3.b() > 1) goto L12;
     */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z4;
        m2.a aVar;
        switch (this.d) {
            case 1:
                m2.h hVar = (m2.h) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(m2.h.class.getName());
                m2.a aVar2 = hVar.e;
                if (aVar2 != null) {
                    z4 = true;
                    break;
                }
                z4 = false;
                accessibilityEvent.setScrollable(z4);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = hVar.e) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(hVar.f);
                    accessibilityEvent.setToIndex(hVar.f);
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
                this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
                o1 o1Var = (o1) this.e;
                RecyclerView recyclerView = o1Var.d;
                RecyclerView recyclerView2 = o1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(m2.h.class.getName());
                m2.h hVar = (m2.h) this.e;
                m2.a aVar = hVar.e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (hVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (hVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    break;
                }
                break;
        }
    }

    @Override // r0.b
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                o1 o1Var = (o1) this.e;
                if (!super.d(view, i10, bundle)) {
                    RecyclerView recyclerView = o1Var.d;
                    RecyclerView recyclerView2 = o1Var.d;
                    if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                        bf.f fVar = recyclerView2.getLayoutManager().b.b;
                        break;
                    }
                }
                break;
            default:
                m2.h hVar = (m2.h) this.e;
                if (!super.d(view, i10, bundle)) {
                    if (i10 == 4096) {
                        if (hVar.canScrollHorizontally(1)) {
                            hVar.setCurrentItem(hVar.f + 1);
                            break;
                        }
                    } else if (i10 == 8192 && hVar.canScrollHorizontally(-1)) {
                        hVar.setCurrentItem(hVar.f - 1);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public n1(m2.h hVar) {
        this.e = hVar;
    }
}
