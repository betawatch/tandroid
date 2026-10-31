package c2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.h0;
import e2.i0;
import i2.s0;
import v7.v6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
    public final d9.t a;
    public final Handler b;
    public s0 c;
    public b2.f d;
    public int f;
    public g h;
    public float g = 1.0f;
    public int e = 0;

    public d(Context context, Looper looper, s0 s0Var) {
        this.a = v6.a(new c(context, 0));
        this.c = s0Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 == 1 || i10 == 0 || this.h == null) {
            return;
        }
        h.a((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i10) {
        s0 s0Var = this.c;
        if (s0Var != null) {
            i0 i0Var = s0Var.n;
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
        s0 s0Var = this.c;
        if (s0Var != null) {
            s0Var.n.f(34);
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        e eVar;
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
            g gVar = this.h;
            if (gVar == null) {
                if (gVar == null) {
                    eVar = new e();
                    eVar.b = b2.f.i;
                    eVar.a = i11;
                } else {
                    e eVar2 = new e();
                    eVar2.a = gVar.a;
                    eVar2.b = gVar.d;
                    eVar2.c = gVar.e;
                    eVar = eVar2;
                }
                b2.f fVar = this.d;
                if (fVar != null && fVar.a == 1) {
                    z11 = true;
                }
                fVar.getClass();
                eVar.b = fVar;
                eVar.c = z11;
                eVar.d = true;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: c2.b
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i13) {
                        b2.f fVar2;
                        d dVar = d.this;
                        dVar.getClass();
                        if (i13 == -3 || i13 == -2) {
                            if (i13 != -2 && ((fVar2 = dVar.d) == null || fVar2.a != 1)) {
                                dVar.c(4);
                                return;
                            } else {
                                dVar.b(0);
                                dVar.c(3);
                                return;
                            }
                        }
                        if (i13 == -1) {
                            dVar.b(-1);
                            dVar.a();
                            dVar.c(1);
                        } else if (i13 != 1) {
                            a1.g.w(i13, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            dVar.c(2);
                            dVar.b(1);
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new g(eVar.a, onAudioFocusChangeListener, handler, eVar.b, eVar.c, eVar.d);
            }
            int h = h.h((AudioManager) this.a.get(), this.h);
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
