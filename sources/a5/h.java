package a5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import s4.f1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h extends r0.b {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public h(f1 f1Var) {
        this.e = f1Var;
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
                m mVar = (m) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(m.class.getName());
                a aVar2 = mVar.e;
                if (aVar2 != null) {
                    z10 = true;
                    break;
                }
                z10 = false;
                accessibilityEvent.setScrollable(z10);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = mVar.e) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(mVar.f);
                    accessibilityEvent.setToIndex(mVar.f);
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
                dVar.i(m.class.getName());
                m mVar = (m) this.e;
                a aVar = mVar.e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (mVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (mVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    break;
                }
                break;
            default:
                this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
                f1 f1Var = (f1) this.e;
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    break;
                }
                break;
        }
    }

    @Override // r0.b
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                m mVar = (m) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && mVar.canScrollHorizontally(-1)) {
                        mVar.setCurrentItem(mVar.f - 1);
                        return true;
                    }
                } else if (mVar.canScrollHorizontally(1)) {
                    mVar.setCurrentItem(mVar.f + 1);
                    return true;
                }
                return false;
            default:
                f1 f1Var = (f1) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    rf.e eVar = recyclerView2.getLayoutManager().b.b;
                }
                return false;
        }
    }

    public h(m mVar) {
        this.e = mVar;
    }
}
