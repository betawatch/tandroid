package i2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import v7.v6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e {
    public final d9.i a;
    public final Handler b;
    public n0 c;
    public b2.e d;
    public int f;
    public c2.c h;
    public float g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, n0 n0Var) {
        this.a = v6.a(new d(context, 0));
        this.c = n0Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 == 1 || i10 == 0 || this.h == null) {
            return;
        }
        c2.d.a((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i10) {
        n0 n0Var = this.c;
        if (n0Var != null) {
            e2.z zVar = n0Var.n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.a = zVar.a.obtainMessage(33, i10, 0);
            b10.b();
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
        n0 n0Var = this.c;
        if (n0Var != null) {
            n0Var.n.e(34);
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        c2.a aVar;
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
            c2.c cVar = this.h;
            if (cVar == null) {
                if (cVar == null) {
                    aVar = new c2.a();
                    aVar.c = b2.e.h;
                    aVar.b = i11;
                } else {
                    c2.a aVar2 = new c2.a();
                    aVar2.b = cVar.a;
                    aVar2.c = cVar.d;
                    aVar2.a = cVar.e;
                    aVar = aVar2;
                }
                b2.e eVar = this.d;
                if (eVar != null && eVar.a == 1) {
                    z11 = true;
                }
                eVar.getClass();
                aVar.c = eVar;
                aVar.a = z11;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: i2.c
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i13) {
                        b2.e eVar2;
                        e eVar3 = e.this;
                        eVar3.getClass();
                        if (i13 == -3 || i13 == -2) {
                            if (i13 != -2 && ((eVar2 = eVar3.d) == null || eVar2.a != 1)) {
                                eVar3.c(4);
                                return;
                            } else {
                                eVar3.b(0);
                                eVar3.c(3);
                                return;
                            }
                        }
                        if (i13 == -1) {
                            eVar3.b(-1);
                            eVar3.a();
                            eVar3.c(1);
                        } else if (i13 != 1) {
                            e2.l(i13, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            eVar3.c(2);
                            eVar3.b(1);
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new c2.c(aVar.b, onAudioFocusChangeListener, handler, (b2.e) aVar.c, aVar.a);
            }
            if (c2.d.h((AudioManager) this.a.get(), this.h) == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
