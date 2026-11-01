package eg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.voip.t0;
import w7.u;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 1:
                jf0 jf0Var = (jf0) this.b;
                WindowManager.LayoutParams layoutParams = jf0Var.c;
                int t10 = (int) (jf0Var.t() * jf0Var.J);
                layoutParams.width = t10;
                jf0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = jf0Var.c;
                int p5 = (int) (jf0Var.p() * jf0Var.J);
                layoutParams2.height = p5;
                jf0Var.I = p5;
                try {
                    i0.S3(jf0Var.b, jf0Var.d, jf0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                t0 t0Var = (t0) this.b;
                WindowManager.LayoutParams layoutParams3 = t0Var.c;
                int f7 = (int) (t0Var.f() * t0Var.P);
                layoutParams3.width = f7;
                t0Var.M = f7;
                WindowManager.LayoutParams layoutParams4 = t0Var.c;
                int e = (int) (t0Var.e() * t0Var.P);
                layoutParams4.height = e;
                t0Var.N = e;
                i0.S3(t0Var.b, t0Var.d, t0Var.c);
                break;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    q qVar = ((c) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = qVar.a;
                    ImageView imageView = qVar.b;
                    if (!qVar.F) {
                        float f7 = qVar.L.e;
                        if (f7 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f7;
                        }
                        o.g(qVar.L, scaleFactor, o.a(qVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), o.b(qVar.L) * (m5.y((imageView.getHeight() - qVar.D) - (!qVar.r ? i0.m : 0), qVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        qVar.r(false);
                        break;
                    }
                }
                break;
            case 1:
                jf0 jf0Var = (jf0) this.b;
                jf0Var.J = u.a(scaleGestureDetector.getScaleFactor() * jf0Var.J, 0.75f, jf0Var.a);
                jf0Var.H = (int) (jf0Var.t() * jf0Var.J);
                jf0Var.I = (int) (jf0Var.p() * jf0Var.J);
                i0.g3(new eb0(this, 12));
                float L = scaleGestureDetector.getFocusX() >= ((float) i0.q.x) / 2.0f ? (r3 - jf0Var.H) - i0.L(16.0f) : i0.L(16.0f);
                o1.j jVar = jf0Var.M;
                if (jVar.f) {
                    jVar.m.i = L;
                } else {
                    jVar.b = jf0Var.K;
                    jVar.c = true;
                    jVar.m.i = L;
                }
                jVar.h();
                float a2 = u.a(scaleGestureDetector.getFocusY() - (jf0Var.I / 2.0f), i0.L(16.0f), (r2.y - jf0Var.I) - i0.L(16.0f));
                o1.j jVar2 = jf0Var.N;
                if (jVar2.f) {
                    jVar2.m.i = a2;
                } else {
                    jVar2.b = jf0Var.L;
                    jVar2.c = true;
                    jVar2.m.i = a2;
                }
                jVar2.h();
                break;
            default:
                t0 t0Var = (t0) this.b;
                t0Var.P = u.a(scaleGestureDetector.getScaleFactor() * t0Var.P, 0.6f, t0Var.a);
                t0Var.M = (int) (t0Var.f() * t0Var.P);
                t0Var.N = (int) (t0Var.e() * t0Var.P);
                i0.g3(new w5(this, 5));
                o1.j jVar3 = t0Var.S;
                jVar3.b = t0Var.Q;
                jVar3.c = true;
                jVar3.m.i = scaleGestureDetector.getFocusX() >= ((float) i0.q.x) / 2.0f ? (r5 - t0Var.M) - i0.L(16.0f) : i0.L(16.0f);
                o1.j jVar4 = t0Var.S;
                if (!jVar4.f) {
                    jVar4.h();
                }
                o1.j jVar5 = t0Var.T;
                jVar5.b = t0Var.R;
                jVar5.c = true;
                jVar5.m.i = u.a(scaleGestureDetector.getFocusY() - (t0Var.N / 2.0f), i0.L(16.0f), (r4.y - t0Var.N) - i0.L(16.0f));
                o1.j jVar6 = t0Var.T;
                if (!jVar6.f) {
                    jVar6.h();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                jf0 jf0Var = (jf0) this.b;
                if (jf0Var.x) {
                    jf0Var.x = false;
                    jf0Var.f0 = false;
                    jf0Var.a();
                    i0.r(jf0Var.h0);
                }
                jf0Var.y = true;
                jf0Var.c.width = (int) (jf0Var.t() * jf0Var.a);
                jf0Var.c.height = (int) (jf0Var.p() * jf0Var.a);
                i0.S3(jf0Var.b, jf0Var.d, jf0Var.c);
                break;
            default:
                t0 t0Var = (t0) this.b;
                if (t0Var.H) {
                    t0Var.H = false;
                }
                t0Var.I = true;
                t0Var.c.width = (int) (t0Var.f() * t0Var.a);
                t0Var.c.height = (int) (t0Var.e() * t0Var.a);
                i0.S3(t0Var.b, t0Var.d, t0Var.c);
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                jf0 jf0Var = (jf0) this.b;
                if (!jf0Var.M.f && !jf0Var.N.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ff0 ff0Var = new ff0(this, arrayList, 0);
                    o1.j jVar = jf0Var.M;
                    if (jVar.f) {
                        jVar.a(ff0Var);
                    } else {
                        arrayList.add(jVar);
                    }
                    o1.j jVar2 = jf0Var.N;
                    if (!jVar2.f) {
                        arrayList.add(jVar2);
                        break;
                    } else {
                        jVar2.a(ff0Var);
                        break;
                    }
                }
            default:
                t0 t0Var = (t0) this.b;
                if (!t0Var.S.f && !t0Var.T.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ff0 ff0Var2 = new ff0(this, arrayList2, 1);
                    o1.j jVar3 = t0Var.S;
                    if (jVar3.f) {
                        jVar3.a(ff0Var2);
                    } else {
                        arrayList2.add(jVar3);
                    }
                    o1.j jVar4 = t0Var.T;
                    if (!jVar4.f) {
                        arrayList2.add(jVar4);
                        break;
                    } else {
                        jVar4.a(ff0Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
