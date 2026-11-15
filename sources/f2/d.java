package f2;

import a8.la;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import g9.t;
import h2.h0;
import h2.i0;
import l2.o0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d {
    public final t a;
    public final Handler b;
    public o0 c;
    public e2.e d;
    public int f;
    public g h;
    public float g = 1.0f;
    public int e = 0;

    public d(Context context, Looper looper, o0 o0Var) {
        this.a = la.a(new c(context, 0));
        this.c = o0Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i7 = this.e;
        if (i7 == 1 || i7 == 0 || this.h == null) {
            return;
        }
        h.a((AudioManager) this.a.get(), this.h);
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
        e eVar;
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
            g gVar = this.h;
            if (gVar == null) {
                if (gVar == null) {
                    eVar = new e();
                    eVar.b = e2.e.i;
                    eVar.a = i10;
                } else {
                    e eVar2 = new e();
                    eVar2.a = gVar.a;
                    eVar2.b = gVar.d;
                    eVar2.c = gVar.e;
                    eVar = eVar2;
                }
                e2.e eVar3 = this.d;
                if (eVar3 != null && eVar3.a == 1) {
                    z11 = true;
                }
                eVar3.getClass();
                eVar.b = eVar3;
                eVar.c = z11;
                eVar.d = true;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: f2.b
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i12) {
                        e2.e eVar4;
                        d dVar = d.this;
                        dVar.getClass();
                        if (i12 == -3 || i12 == -2) {
                            if (i12 != -2 && ((eVar4 = dVar.d) == null || eVar4.a != 1)) {
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
                            e2.o(i12, "Unknown focus change type: ", "AudioFocusManager");
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
            int e10 = h.e((AudioManager) this.a.get(), this.h);
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
