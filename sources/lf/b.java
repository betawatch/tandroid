package lf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.o;
import j$.util.Objects;
import jh.g;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                final int i10 = 2;
                final e eVar = this.b;
                i0.g3(new Runnable() { // from class: lf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i10) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.a == 4) {
                                    eVar2.j.a.p().removeView(eVar2.f);
                                    eVar2.i = null;
                                    eVar2.f = null;
                                    eVar2.g = null;
                                    f fVar = eVar2.e;
                                    if (fVar != null) {
                                        fVar.b();
                                        eVar2.e = null;
                                    }
                                    f fVar2 = eVar2.d;
                                    if (fVar2 != null) {
                                        fVar2.b();
                                        eVar2.d = null;
                                    }
                                    bh.d dVar = eVar2.h;
                                    if (((g) dVar.e) != null) {
                                        ((View) dVar.a).setBackground(null);
                                        dVar.e = null;
                                    }
                                    if (((g) dVar.d) == null && ((g) dVar.e) == null && (bitmap2 = (Bitmap) dVar.c) != null) {
                                        bitmap2.recycle();
                                        dVar.c = null;
                                    }
                                    eVar2.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar2.n) {
                                        eVar2.g();
                                        break;
                                    }
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.L();
                                    eVar3.j.g.c(new o(w0.d, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar;
                                jf.f fVar3 = eVar4.j;
                                if (eVar4.a == 3) {
                                    fVar3.g.g(new o(w0.d, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    i0.K(fVar3.j, new o(w0.d, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final e eVar2 = this.b;
                i0.g3(new Runnable() { // from class: lf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i11) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.p().removeView(eVar22.f);
                                    eVar22.i = null;
                                    eVar22.f = null;
                                    eVar22.g = null;
                                    f fVar = eVar22.e;
                                    if (fVar != null) {
                                        fVar.b();
                                        eVar22.e = null;
                                    }
                                    f fVar2 = eVar22.d;
                                    if (fVar2 != null) {
                                        fVar2.b();
                                        eVar22.d = null;
                                    }
                                    bh.d dVar = eVar22.h;
                                    if (((g) dVar.e) != null) {
                                        ((View) dVar.a).setBackground(null);
                                        dVar.e = null;
                                    }
                                    if (((g) dVar.d) == null && ((g) dVar.e) == null && (bitmap2 = (Bitmap) dVar.c) != null) {
                                        bitmap2.recycle();
                                        dVar.c = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.L();
                                    eVar3.j.g.c(new o(w0.d, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar2;
                                jf.f fVar3 = eVar4.j;
                                if (eVar4.a == 3) {
                                    fVar3.g.g(new o(w0.d, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    i0.K(fVar3.j, new o(w0.d, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                bh.d dVar = this.b.h;
                if (((g) dVar.e) != null) {
                    ((View) dVar.a).setBackground(null);
                    dVar.e = null;
                }
                if (((g) dVar.d) == null && ((g) dVar.e) == null && (bitmap = (Bitmap) dVar.c) != null) {
                    bitmap.recycle();
                    dVar.c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                bh.d dVar2 = this.b.h;
                Objects.requireNonNull(dVar2);
                i0.g3(new gg.c(dVar2, 28));
                break;
            default:
                final int i12 = 0;
                final e eVar3 = this.b;
                i0.g3(new Runnable() { // from class: lf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i12) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.p().removeView(eVar22.f);
                                    eVar22.i = null;
                                    eVar22.f = null;
                                    eVar22.g = null;
                                    f fVar = eVar22.e;
                                    if (fVar != null) {
                                        fVar.b();
                                        eVar22.e = null;
                                    }
                                    f fVar2 = eVar22.d;
                                    if (fVar2 != null) {
                                        fVar2.b();
                                        eVar22.d = null;
                                    }
                                    bh.d dVar3 = eVar22.h;
                                    if (((g) dVar3.e) != null) {
                                        ((View) dVar3.a).setBackground(null);
                                        dVar3.e = null;
                                    }
                                    if (((g) dVar3.d) == null && ((g) dVar3.e) == null && (bitmap2 = (Bitmap) dVar3.c) != null) {
                                        bitmap2.recycle();
                                        dVar3.c = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar32.h.L();
                                    eVar32.j.g.c(new o(w0.d, new b(eVar32, 2), 400L));
                                    eVar32.a = 2;
                                    if (!eVar32.n) {
                                        eVar32.h();
                                        break;
                                    }
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar3;
                                jf.f fVar3 = eVar4.j;
                                if (eVar4.a == 3) {
                                    fVar3.g.g(new o(w0.d, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    i0.K(fVar3.j, new o(w0.d, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
