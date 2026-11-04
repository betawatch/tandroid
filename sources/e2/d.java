package e2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import b8.bc;
import g2.i0;
import g2.j0;
import k2.r0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final f9.t a;
    public final Handler b;
    public r0 c;
    public d2.f d;
    public int f;
    public g h;
    public float g = 1.0f;
    public int e = 0;

    public d(Context context, Looper looper, r0 r0Var) {
        this.a = bc.a(new c(context, 0));
        this.c = r0Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i3 = this.e;
        if (i3 == 1 || i3 == 0 || this.h == null) {
            return;
        }
        h.a((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i3) {
        r0 r0Var = this.c;
        if (r0Var != null) {
            j0 j0Var = r0Var.n;
            j0Var.getClass();
            i0 c2 = j0.c();
            c2.a = j0Var.a.obtainMessage(33, i3, 0);
            c2.b();
        }
    }

    public final void c(int i3) {
        if (this.e == i3) {
            return;
        }
        this.e = i3;
        float f10 = i3 == 4 ? 0.2f : 1.0f;
        if (this.g == f10) {
            return;
        }
        this.g = f10;
        r0 r0Var = this.c;
        if (r0Var != null) {
            r0Var.n.f(34);
        }
    }

    public final int d(int i3, boolean z10) {
        int i10;
        e eVar;
        boolean z11 = false;
        if (i3 == 1 || (i10 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z10) {
            int i11 = this.e;
            if (i11 == 1) {
                return -1;
            }
            if (i11 == 3) {
                return 0;
            }
        } else if (this.e != 2) {
            g gVar = this.h;
            if (gVar == null) {
                if (gVar == null) {
                    eVar = new e();
                    eVar.b = d2.f.i;
                    eVar.a = i10;
                } else {
                    e eVar2 = new e();
                    eVar2.a = gVar.a;
                    eVar2.b = gVar.d;
                    eVar2.c = gVar.e;
                    eVar = eVar2;
                }
                d2.f fVar = this.d;
                if (fVar != null && fVar.a == 1) {
                    z11 = true;
                }
                fVar.getClass();
                eVar.b = fVar;
                eVar.c = z11;
                eVar.d = true;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: e2.b
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i12) {
                        d2.f fVar2;
                        d dVar = d.this;
                        dVar.getClass();
                        if (i12 == -3 || i12 == -2) {
                            if (i12 != -2 && ((fVar2 = dVar.d) == null || fVar2.a != 1)) {
                                dVar.c(4);
                                return;
                            } else {
                                dVar.b(0);
                                dVar.c(3);
                                return;
                            }
                        }
                        if (i12 == -1) {
                            dVar.b(-1);
                            dVar.a();
                            dVar.c(1);
                        } else if (i12 != 1) {
                            com.google.android.recaptcha.internal.a.o(i12, "Unknown focus change type: ", "AudioFocusManager");
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
            int f10 = h.f((AudioManager) this.a.get(), this.h);
            if (f10 == 1 || f10 == 2) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
