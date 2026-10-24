package androidx.emoji2.text;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.o0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.z;
import w7.k6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ j(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                if (this.b == 1) {
                    while (i10 < size) {
                        ((i) arrayList.get(i10)).a();
                        i10++;
                    }
                    break;
                } else {
                    while (i10 < size) {
                        ((i) arrayList.get(i10)).getClass();
                        i10++;
                    }
                    break;
                }
            case 1:
                ((o0) this.c).g(this.b);
                break;
            case 2:
                ((g6.v) this.c).W.b(this.b);
                break;
            case 3:
                z zVar = (z) this.c;
                if (zVar.a && zVar.getParent() != null && this.b == zVar.c) {
                    zVar.a = false;
                    if (zVar.l()) {
                        try {
                            zVar.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        zVar.onTouchEvent(obtain);
                        obtain.recycle();
                        break;
                    }
                }
                break;
            default:
                n7 n7Var = (n7) this.c;
                if (n7Var.a && n7Var.getParent() != null && this.b == n7Var.c) {
                    n7Var.a = false;
                    try {
                        n7Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i11 = n7Var.h;
                    if (i11 >= 0) {
                        n7Var.x.a(((CharSequence) n7Var.E.get(i11)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    n7Var.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public j(List list, int i10, Throwable th2) {
        this.a = 0;
        k6.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i10;
    }
}
