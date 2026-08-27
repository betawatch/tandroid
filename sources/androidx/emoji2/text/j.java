package androidx.emoji2.text;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.p0;
import h7.m6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.i7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                i7 i7Var = (i7) this.c;
                if (i7Var.a && i7Var.getParent() != null && this.b == i7Var.c) {
                    i7Var.a = false;
                    try {
                        i7Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i11 = i7Var.h;
                    if (i11 >= 0) {
                        i7Var.x.a(((CharSequence) i7Var.A.get(i11)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    i7Var.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
            default:
                ((r5.w) this.c).S.b(this.b);
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public j(List list, int i10, Throwable th) {
        this.a = 0;
        m6.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i10;
    }
}
