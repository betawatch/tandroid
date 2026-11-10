package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k5 implements t4 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object h;

    public k5(j5 j5Var, oi.a aVar, h6 h6Var) {
        this.b = 0;
        this.c = j5Var;
        this.d = aVar;
        this.e = h6Var;
        this.f = c8.g0.l(h6Var);
    }

    public static void c(k5 k5Var) {
        f3.m mVar = (f3.m) k5Var.c;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public boolean b(r0 r0Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.h).getWidth(), ((View) this.h).getHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public fh.g f(j5 j5Var) {
        fh.g c10 = ((oi.a) this.d).d.c(j5Var, null, false);
        c10.p((gh.e) this.f);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void g(j5 j5Var, r0 r0Var) {
        boolean z9 = j5Var != null;
        if (this.a == z9) {
            return;
        }
        this.a = z9;
        if (z9) {
            this.b = ((View) this.h).getVisibility();
            ((View) this.h).setVisibility(4);
        } else if (((View) this.h).getVisibility() == 4) {
            ((View) this.h).setVisibility(this.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.f;
        return eVar.a(eVar.e);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.f;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public gh.a getMenuGlassColorProvider() {
        return (gh.e) this.f;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuHostView() {
        return (View) this.h;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public h6 getMenuResourcesProvider() {
        return (h6) this.e;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public View getMenuView() {
        return (View) this.h;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public j5 getOpenMenuOverlay() {
        if (this.a) {
            return (j5) this.c;
        }
        return null;
    }

    public x2.e0 h(int i7) {
        g9.u uVar;
        g9.u mVar;
        HashMap hashMap = (HashMap) this.e;
        x2.e0 e0Var = (x2.e0) hashMap.get(Integer.valueOf(i7));
        if (e0Var != null) {
            return e0Var;
        }
        HashMap hashMap2 = (HashMap) this.d;
        g9.u uVar2 = (g9.u) hashMap2.get(Integer.valueOf(i7));
        if (uVar2 == null) {
            final j2.n nVar = (j2.n) this.f;
            nVar.getClass();
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
                                throw new IllegalArgumentException(jg.g.j(i7, "Unrecognized contentType: "));
                            }
                            mVar = new g9.u() { // from class: x2.o
                                @Override // g9.u
                                public final Object get() {
                                    switch (i12) {
                                        case 0:
                                            return p.e((Class) this, nVar);
                                        case 1:
                                            return p.e((Class) this, nVar);
                                        case 2:
                                            return p.e((Class) this, nVar);
                                        default:
                                            return new w0(nVar, (f3.m) ((k5) this).c);
                                    }
                                }
                            };
                        }
                        uVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(x2.e0.class);
                        uVar = new g9.u() { // from class: x2.o
                            @Override // g9.u
                            public final Object get() {
                                switch (i11) {
                                    case 0:
                                        return p.e((Class) asSubclass, nVar);
                                    case 1:
                                        return p.e((Class) asSubclass, nVar);
                                    case 2:
                                        return p.e((Class) asSubclass, nVar);
                                    default:
                                        return new w0(nVar, (f3.m) ((k5) asSubclass).c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(x2.e0.class);
                    uVar = new g9.u() { // from class: x2.o
                        @Override // g9.u
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return p.e((Class) asSubclass2, nVar);
                                case 1:
                                    return p.e((Class) asSubclass2, nVar);
                                case 2:
                                    return p.e((Class) asSubclass2, nVar);
                                default:
                                    return new w0(nVar, (f3.m) ((k5) asSubclass2).c);
                            }
                        }
                    };
                }
                uVar2 = uVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(x2.e0.class);
                final int i13 = 0;
                uVar2 = new g9.u() { // from class: x2.o
                    @Override // g9.u
                    public final Object get() {
                        switch (i13) {
                            case 0:
                                return p.e((Class) asSubclass3, nVar);
                            case 1:
                                return p.e((Class) asSubclass3, nVar);
                            case 2:
                                return p.e((Class) asSubclass3, nVar);
                            default:
                                return new w0(nVar, (f3.m) ((k5) asSubclass3).c);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i7), uVar2);
        }
        x2.e0 e0Var2 = (x2.e0) uVar2.get();
        e0Var2.a((w7.s) this.h);
        e0Var2.c(this.a);
        e0Var2.d(this.b);
        hashMap.put(Integer.valueOf(i7), e0Var2);
        return e0Var2;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = ((oi.a) this.d).e;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    public k5(f3.m mVar, w7.s sVar) {
        this.c = mVar;
        this.h = sVar;
        this.d = new HashMap();
        this.e = new HashMap();
        this.a = true;
        this.b = 3;
    }
}
