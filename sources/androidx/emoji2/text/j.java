package androidx.emoji2.text;

import android.view.MotionEvent;
import android.view.ViewGroup;
import c8.tb;
import com.google.android.gms.common.api.internal.l0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Cells.k7;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ j(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i7 = 0;
                if (this.b == 1) {
                    while (i7 < size) {
                        ((i) arrayList.get(i7)).a();
                        i7++;
                    }
                    break;
                } else {
                    while (i7 < size) {
                        ((i) arrayList.get(i7)).getClass();
                        i7++;
                    }
                    break;
                }
            case 1:
                ((l0) this.c).b(this.b);
                break;
            case 2:
                ((j6.w) this.c).H.b(this.b);
                break;
            case 3:
                break;
            case 4:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.c;
                if (zVar.a && zVar.getParent() != null && this.b == zVar.c) {
                    zVar.a = false;
                    if (zVar.q()) {
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
                k7 k7Var = (k7) this.c;
                if (k7Var.a && k7Var.getParent() != null && this.b == k7Var.c) {
                    k7Var.a = false;
                    try {
                        k7Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i10 = k7Var.h;
                    if (i10 >= 0) {
                        k7Var.y.a(((CharSequence) k7Var.F.get(i10)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    k7Var.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i7, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    public j(MediaController mediaController) {
        this.a = 3;
        this.c = mediaController;
        this.b = 0;
    }

    public j(List list, int i7, Throwable th2) {
        this.a = 0;
        tb.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i7;
    }
}
