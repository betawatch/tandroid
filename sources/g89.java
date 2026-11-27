// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g89 extends r4 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public g89(h89 h89Var) {
        this.e = h89Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r1.b() <= 1) goto L10;
     */
    @Override // r4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        vu7 vu7Var;
        switch (this.d) {
            case 1:
                fic ficVar = (fic) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(fic.class.getName());
                vu7 vu7Var2 = ficVar.e;
                if (vu7Var2 != null) {
                    z = true;
                    break;
                }
                z = false;
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (vu7Var = ficVar.e) != null) {
                    accessibilityEvent.setItemCount(vu7Var.b());
                    accessibilityEvent.setFromIndex(ficVar.f);
                    accessibilityEvent.setToIndex(ficVar.f);
                    break;
                }
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override // r4
    public final void c(View view, v4 v4Var) {
        byte b = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v4Var.a);
                h89 h89Var = (h89) obj;
                boolean e = h89Var.e();
                RecyclerView recyclerView = h89Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, v4Var);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                v4Var.i(fic.class.getName());
                fic ficVar = (fic) obj;
                vu7 vu7Var = ficVar.e;
                accessibilityNodeInfo.setScrollable(vu7Var != null && vu7Var.b() > 1);
                if (ficVar.canScrollHorizontally(1)) {
                    v4Var.a(TLObject.FLAG_12);
                }
                if (ficVar.canScrollHorizontally(-1)) {
                    v4Var.a(TLObject.FLAG_13);
                    break;
                }
                break;
        }
    }

    @Override // r4
    public final boolean d(View view, int i, Bundle bundle) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                h89 h89Var = (h89) obj;
                if (!super.d(view, i, bundle)) {
                    boolean e = h89Var.e();
                    RecyclerView recyclerView = h89Var.d;
                    if (!e && recyclerView.getLayoutManager() != null) {
                        oh2 oh2Var = recyclerView.getLayoutManager().b.b;
                    }
                    break;
                }
                break;
            default:
                fic ficVar = (fic) obj;
                if (!super.d(view, i, bundle)) {
                    if (i == 4096) {
                        if (ficVar.canScrollHorizontally(1)) {
                            ficVar.setCurrentItem(ficVar.f + 1);
                            break;
                        }
                    } else if (i == 8192 && ficVar.canScrollHorizontally(-1)) {
                        ficVar.setCurrentItem(ficVar.f - 1);
                        break;
                    }
                    break;
                }
                break;
        }
        return false;
    }

    public g89(fic ficVar) {
        this.e = ficVar;
    }
}
