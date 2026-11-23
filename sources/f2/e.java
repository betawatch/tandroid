package f2;

import a8.bb;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import h2.h0;
import h2.i0;
import l2.o0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e {
    public final g9.t a;
    public final Handler b;
    public o0 c;
    public e2.e d;
    public int f;
    public h h;
    public float g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, o0 o0Var) {
        this.a = bb.a(new d(context, 0));
        this.c = o0Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i7 = this.e;
        if (i7 == 1 || i7 == 0 || this.h == null) {
            return;
        }
        i.a((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i7) {
        o0 o0Var = this.c;
        if (o0Var != null) {
            i0 i0Var = o0Var.n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.a = i0Var.a.obtainMessage(33, i7, 0);
            c10.b();
        }
    }

    public final void c(int i7) {
        if (this.e == i7) {
            return;
        }
        this.e = i7;
        float f10 = i7 == 4 ? 0.2f : 1.0f;
        if (this.g == f10) {
            return;
        }
        this.g = f10;
        o0 o0Var = this.c;
        if (o0Var != null) {
            o0Var.n.f(34);
        }
    }

    public final int d(int i7, boolean z10) {
        int i10;
        f fVar;
        boolean z11 = false;
        if (i7 == 1 || (i10 = this.f) != 1) {
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
            h hVar = this.h;
            if (hVar == null) {
                if (hVar == null) {
                    fVar = new f();
                    fVar.b = e2.e.i;
                    fVar.a = i10;
                } else {
                    f fVar2 = new f();
                    fVar2.a = hVar.a;
                    fVar2.b = hVar.d;
                    fVar2.c = hVar.e;
                    fVar = fVar2;
                }
                e2.e eVar = this.d;
                if (eVar != null && eVar.a == 1) {
                    z11 = true;
                }
                eVar.getClass();
                fVar.b = eVar;
                fVar.c = z11;
                fVar.d = true;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: f2.c
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i12) {
                        e2.e eVar2;
                        e eVar3 = e.this;
                        eVar3.getClass();
                        if (i12 == -3 || i12 == -2) {
                            if (i12 != -2 && ((eVar2 = eVar3.d) == null || eVar2.a != 1)) {
                                eVar3.c(4);
                                return;
                            } else {
                                eVar3.b(0);
                                eVar3.c(3);
                                return;
                            }
                        }
                        if (i12 == -1) {
                            eVar3.b(-1);
                            eVar3.a();
                            eVar3.c(1);
                        } else if (i12 != 1) {
                            e2.o(i12, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            eVar3.c(2);
                            eVar3.b(1);
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new h(fVar.a, onAudioFocusChangeListener, handler, fVar.b, fVar.c, fVar.d);
            }
            int e10 = i.e((AudioManager) this.a.get(), this.h);
            if (e10 == 1 || e10 == 2) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
