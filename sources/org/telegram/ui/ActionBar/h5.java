package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.h5;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h5 implements q4 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object h;

    public h5(g5 g5Var, ri.a aVar, e6 e6Var) {
        this.b = 0;
        this.c = g5Var;
        this.d = aVar;
        this.e = e6Var;
        this.f = c8.g0.l(e6Var);
    }

    public static void c(h5 h5Var) {
        f3.m mVar = (f3.m) h5Var.c;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public boolean b(q0 q0Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.h).getWidth(), ((View) this.h).getHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public fh.g g(g5 g5Var) {
        fh.g c10 = ((ri.a) this.d).d.c(g5Var, null, false);
        c10.p((gh.e) this.f);
        i20.r(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.f;
        return eVar.a(eVar.e);
    }

    @Override // org.telegram.ui.ActionBar.q4
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.f;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* synthetic */ int getMenuDimAlpha() {
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* synthetic */ int getMenuExtraBelow() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public gh.a getMenuGlassColorProvider() {
        return (gh.e) this.f;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public View getMenuHostView() {
        return (View) this.h;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* synthetic */ int getMenuMaxHeight() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public e6 getMenuResourcesProvider() {
        return (e6) this.e;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public View getMenuView() {
        return (View) this.h;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public g5 getOpenMenuOverlay() {
        if (this.a) {
            return (g5) this.c;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void h(g5 g5Var, q0 q0Var) {
        boolean z10 = g5Var != null;
        if (this.a == z10) {
            return;
        }
        this.a = z10;
        if (z10) {
            this.b = ((View) this.h).getVisibility();
            ((View) this.h).setVisibility(4);
        } else if (((View) this.h).getVisibility() == 4) {
            ((View) this.h).setVisibility(this.b);
        }
    }

    public x2.e0 i(int i7) {
        g9.t tVar;
        g9.t mVar;
        HashMap hashMap = (HashMap) this.e;
        x2.e0 e0Var = (x2.e0) hashMap.get(Integer.valueOf(i7));
        if (e0Var != null) {
            return e0Var;
        }
        HashMap hashMap2 = (HashMap) this.d;
        g9.t tVar2 = (g9.t) hashMap2.get(Integer.valueOf(i7));
        if (tVar2 == null) {
            final wf.b bVar = (wf.b) this.f;
            bVar.getClass();
            if (i7 != 0) {
                final int i10 = 1;
                if (i7 != 1) {
                    final int i11 = 2;
                    if (i7 != 2) {
                        final int i12 = 3;
                        if (i7 == 3) {
                            mVar = new l2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(x2.e0.class), 3);
                        } else {
                            if (i7 != 4) {
                                throw new IllegalArgumentException(i5.c.i(i7, "Unrecognized contentType: "));
                            }
                            mVar = new g9.t() { // from class: x2.o
                                @Override // g9.t
                                public final Object get() {
                                    switch (i12) {
                                        case 0:
                                            return p.e((Class) this, bVar);
                                        case 1:
                                            return p.e((Class) this, bVar);
                                        case 2:
                                            return p.e((Class) this, bVar);
                                        default:
                                            return new w0(bVar, (f3.m) ((h5) this).c);
                                    }
                                }
                            };
                        }
                        tVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(x2.e0.class);
                        tVar = new g9.t() { // from class: x2.o
                            @Override // g9.t
                            public final Object get() {
                                switch (i11) {
                                    case 0:
                                        return p.e((Class) asSubclass, bVar);
                                    case 1:
                                        return p.e((Class) asSubclass, bVar);
                                    case 2:
                                        return p.e((Class) asSubclass, bVar);
                                    default:
                                        return new w0(bVar, (f3.m) ((h5) asSubclass).c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(x2.e0.class);
                    tVar = new g9.t() { // from class: x2.o
                        @Override // g9.t
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return p.e((Class) asSubclass2, bVar);
                                case 1:
                                    return p.e((Class) asSubclass2, bVar);
                                case 2:
                                    return p.e((Class) asSubclass2, bVar);
                                default:
                                    return new w0(bVar, (f3.m) ((h5) asSubclass2).c);
                            }
                        }
                    };
                }
                tVar2 = tVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(x2.e0.class);
                final int i13 = 0;
                tVar2 = new g9.t() { // from class: x2.o
                    @Override // g9.t
                    public final Object get() {
                        switch (i13) {
                            case 0:
                                return p.e((Class) asSubclass3, bVar);
                            case 1:
                                return p.e((Class) asSubclass3, bVar);
                            case 2:
                                return p.e((Class) asSubclass3, bVar);
                            default:
                                return new w0(bVar, (f3.m) ((h5) asSubclass3).c);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i7), tVar2);
        }
        x2.e0 e0Var2 = (x2.e0) tVar2.get();
        e0Var2.a((nb.a) this.h);
        e0Var2.c(this.a);
        e0Var2.d(this.b);
        hashMap.put(Integer.valueOf(i7), e0Var2);
        return e0Var2;
    }

    @Override // org.telegram.ui.ActionBar.q4
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((ri.a) this.d).e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public h5(f3.m mVar, nb.a aVar) {
        this.c = mVar;
        this.h = aVar;
        this.d = new HashMap();
        this.e = new HashMap();
        this.a = true;
        this.b = 3;
    }
}
