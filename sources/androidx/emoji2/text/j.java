package androidx.emoji2.text;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.internal.play_billing.s1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Cells.j7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ j(ViewGroup viewGroup, int i3) {
        this.a = i3;
        this.c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i3 = 0;
                if (this.b == 1) {
                    while (i3 < size) {
                        ((i) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((i) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            case 1:
                ((j0) this.c).b(this.b);
                break;
            case 2:
                ((i6.v) this.c).H.b(this.b);
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
                j7 j7Var = (j7) this.c;
                if (j7Var.a && j7Var.getParent() != null && this.b == j7Var.c) {
                    j7Var.a = false;
                    try {
                        j7Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i10 = j7Var.h;
                    if (i10 >= 0) {
                        j7Var.y.a(((CharSequence) j7Var.F.get(i10)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    j7Var.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i3, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
    }

    public j(MediaController mediaController) {
        this.a = 3;
        this.c = mediaController;
        this.b = 0;
    }

    public j(List list, int i3, Throwable th2) {
        this.a = 0;
        s1.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i3;
    }
}
