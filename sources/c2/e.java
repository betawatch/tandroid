package c2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.h0;
import e2.i0;
import i2.q0;
import v7.w6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class e {
    public final d9.u a;
    public final Handler b;
    public q0 c;
    public b2.f d;
    public int f;
    public h h;
    public float g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, q0 q0Var) {
        this.a = w6.a(new d(context, 0));
        this.c = q0Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 == 1 || i10 == 0 || this.h == null) {
            return;
        }
        i.a((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i10) {
        q0 q0Var = this.c;
        if (q0Var != null) {
            i0 i0Var = q0Var.n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.a = i0Var.a.obtainMessage(33, i10, 0);
            c10.b();
        }
    }

    public final void c(int i10) {
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        float f7 = i10 == 4 ? 0.2f : 1.0f;
        if (this.g == f7) {
            return;
        }
        this.g = f7;
        q0 q0Var = this.c;
        if (q0Var != null) {
            q0Var.n.f(34);
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        f fVar;
        boolean z11 = false;
        if (i10 == 1 || (i11 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z10) {
            int i12 = this.e;
            if (i12 == 1) {
                return -1;
            }
            if (i12 == 3) {
                return 0;
            }
        } else if (this.e != 2) {
            h hVar = this.h;
            if (hVar == null) {
                if (hVar == null) {
                    fVar = new f();
                    fVar.b = b2.f.i;
                    fVar.a = i11;
                } else {
                    f fVar2 = new f();
                    fVar2.a = hVar.a;
                    fVar2.b = hVar.d;
                    fVar2.c = hVar.e;
                    fVar = fVar2;
                }
                b2.f fVar3 = this.d;
                if (fVar3 != null && fVar3.a == 1) {
                    z11 = true;
                }
                fVar3.getClass();
                fVar.b = fVar3;
                fVar.c = z11;
                fVar.d = true;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: c2.c
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i13) {
                        b2.f fVar4;
                        e eVar = e.this;
                        eVar.getClass();
                        if (i13 == -3 || i13 == -2) {
                            if (i13 != -2 && ((fVar4 = eVar.d) == null || fVar4.a != 1)) {
                                eVar.c(4);
                                return;
                            } else {
                                eVar.b(0);
                                eVar.c(3);
                                return;
                            }
                        }
                        if (i13 == -1) {
                            eVar.b(-1);
                            eVar.a();
                            eVar.c(1);
                        } else if (i13 != 1) {
                            a1.g.x(i13, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            eVar.c(2);
                            eVar.b(1);
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new h(fVar.a, onAudioFocusChangeListener, handler, fVar.b, fVar.c, fVar.d);
            }
            int h = i.h((AudioManager) this.a.get(), this.h);
            if (h == 1 || h == 2) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
