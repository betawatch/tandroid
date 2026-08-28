package androidx.emoji2.text;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.p0;
import g7.p6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.l7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ i(ViewGroup viewGroup, int i9) {
        this.a = i9;
        this.c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i9 = 0;
                if (this.b == 1) {
                    while (i9 < size) {
                        ((h) arrayList.get(i9)).a();
                        i9++;
                    }
                    break;
                } else {
                    while (i9 < size) {
                        ((h) arrayList.get(i9)).getClass();
                        i9++;
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
                    int i10 = l7Var.h;
                    if (i10 >= 0) {
                        l7Var.x.a(((CharSequence) l7Var.A.get(i10)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    l7Var.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
            default:
                ((q5.w) this.c).S.b(this.b);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    public i(List list, int i9, Throwable th) {
        this.a = 0;
        p6.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i9;
    }
}
