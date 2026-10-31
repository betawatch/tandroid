package androidx.emoji2.text;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.q0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.z;
import w7.q6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                ((q0) this.c).g(this.b);
                break;
            case 2:
                ((g6.v) this.c).W.b(this.b);
                break;
            case 3:
                break;
            case 4:
                z zVar = (z) this.c;
                if (zVar.a && zVar.getParent() != null && this.b == zVar.c) {
                    zVar.a = false;
                    if (zVar.r()) {
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
                o7 o7Var = (o7) this.c;
                if (o7Var.a && o7Var.getParent() != null && this.b == o7Var.c) {
                    o7Var.a = false;
                    try {
                        o7Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i11 = o7Var.h;
                    if (i11 >= 0) {
                        o7Var.y.a(((CharSequence) o7Var.E.get(i11)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    o7Var.onTouchEvent(obtain2);
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

    public j(MediaController mediaController) {
        this.a = 3;
        this.c = mediaController;
        this.b = 0;
    }

    public j(List list, int i10, Throwable th2) {
        this.a = 0;
        q6.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i10;
    }
}
