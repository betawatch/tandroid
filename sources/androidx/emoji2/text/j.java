package androidx.emoji2.text;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.p0;
import java.util.ArrayList;
import java.util.List;
import k7.j6;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.l7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ((p0) this.c).g(this.b);
                break;
            case 2:
                a0 a0Var = (a0) this.c;
                if (a0Var.a && a0Var.getParent() != null && this.b == a0Var.c) {
                    a0Var.a = false;
                    if (a0Var.m()) {
                        try {
                            a0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        a0Var.onTouchEvent(obtain);
                        obtain.recycle();
                        break;
                    }
                }
                break;
            case 3:
                l7 l7Var = (l7) this.c;
                if (l7Var.a && l7Var.getParent() != null && this.b == l7Var.c) {
                    l7Var.a = false;
                    try {
                        l7Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i11 = l7Var.h;
                    if (i11 >= 0) {
                        l7Var.x.a(((CharSequence) l7Var.B.get(i11)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    l7Var.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
            default:
                ((u5.w) this.c).T.b(this.b);
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
        j6.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i10;
    }
}
