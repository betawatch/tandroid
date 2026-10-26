package androidx.emoji2.text;

import a8.mf;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.o0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.z;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((h6.v) this.c).W.b(this.b);
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
                r7 r7Var = (r7) this.c;
                if (r7Var.a && r7Var.getParent() != null && this.b == r7Var.c) {
                    r7Var.a = false;
                    try {
                        r7Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i11 = r7Var.h;
                    if (i11 >= 0) {
                        r7Var.x.a(((CharSequence) r7Var.E.get(i11)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    r7Var.onTouchEvent(obtain2);
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
        mf.a(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i10;
    }
}
