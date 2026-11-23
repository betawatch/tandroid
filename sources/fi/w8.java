package fi;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class w8 implements s3 {
    public final /* synthetic */ h6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ f9 d;

    public w8(f9 f9Var, h6 h6Var, ArrayList arrayList, Context context) {
        this.d = f9Var;
        this.a = h6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i7, long j3) {
        f9 f9Var = this.d;
        if (f9Var.K == i7 && f9Var.J == j3) {
            return;
        }
        f9Var.J = j3;
        f9Var.K = i7;
    }

    public final void b(boolean z10) {
        f9 f9Var = this.d;
        org.telegram.ui.ActionBar.g2 g2Var = f9Var.f;
        if (f9Var.b) {
            if (f9Var.c) {
                return;
            }
            if (z10) {
                org.telegram.messenger.g0.Y2(g2Var.getParentActivity(), g2Var.getClassGuid());
                return;
            } else {
                org.telegram.messenger.g0.Z2(g2Var.getParentActivity(), g2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = f9Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            f9Var.n.updateViewLayout(f9Var.s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, y3 y3Var) {
        long j10;
        e9 e9Var;
        f9 f9Var = this.d;
        ArrayList arrayList = f9Var.M0;
        if (f9Var.H0 || f9Var.V < 0.9f) {
            hi.q3 q3Var = f9Var.E0;
            if (q3Var != null) {
                q3Var.b(0L, null);
            }
            c1 c1Var = f9Var.B0;
            if (c1Var != null) {
                if (c1Var.n) {
                    c1Var.s(null);
                } else {
                    c1Var.e();
                }
                f9Var.B0 = null;
            }
            org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + f9Var.H0 + ", " + f9Var.V);
            y3Var.a = false;
            y3Var.c = null;
            y3Var.b = null;
            return;
        }
        Uri uri2 = f9Var.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (e9Var = f9Var.A0) == null) {
            f9Var.F0 = uri;
            hi.q3 q3Var2 = f9Var.E0;
            if (q3Var2 != null) {
                q3Var2.b(0L, null);
            }
            c1 c1Var2 = f9Var.B0;
            if (c1Var2 != null) {
                if (c1Var2.n) {
                    c1Var2.s(null);
                } else {
                    c1Var2.e();
                }
                f9Var.B0 = null;
            }
            e9 e9Var2 = f9Var.A0;
            if (e9Var2 != null) {
                e9Var2.release(null);
                f9Var.A0 = null;
            }
            y3 y3Var2 = f9Var.G0;
            if (y3Var2 != null) {
                y3Var2.c = null;
                y3Var2.b = null;
                y3Var2.a = false;
                y3Var2.e = null;
                y3Var2.f = null;
                y3Var2.d = null;
                y3Var2.b();
                f9Var.G0 = null;
            }
            if (uri != null) {
                f9Var.G0 = y3Var;
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    if (((e9) arrayList.get(i7)).uri.equals(uri)) {
                        f9Var.A0 = (e9) arrayList.remove(i7);
                        break;
                    }
                    i7++;
                }
                if (f9Var.A0 == null) {
                    e9 e9Var3 = new e9(f9Var, f9Var.D0, f9Var.C0);
                    f9Var.A0 = e9Var3;
                    e9Var3.document = document;
                }
                e9 e9Var4 = f9Var.A0;
                e9Var4.uri = uri;
                e9Var4.setSpeed(f9.B1);
                y3 y3Var3 = f9Var.G0;
                e9 e9Var5 = f9Var.A0;
                y3Var3.c = e9Var5;
                y3Var3.a = false;
                y3Var3.e = f9Var.z0;
                y3Var3.f = f9Var.C0;
                y3Var3.d = f9Var.D0;
                y3Var3.b = null;
                TLRPC.Document document2 = e9Var5.document;
                if (document2 != null) {
                    org.telegram.messenger.s8.J.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                }
                org.telegram.messenger.w7.G(f9Var.h).h(3, f9Var.A0.document, null, null, null, null);
                if (j3 == 0) {
                    long j11 = f9Var.t1;
                    if (j11 != 0) {
                        f9Var.G0.a = true;
                        j10 = j11;
                        org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((e9) f9Var.G0.c).start(false, f9Var.C(), uri, j10, f9.D1, f9.B1);
                        f9Var.G0.b();
                    }
                }
                j10 = j3;
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((e9) f9Var.G0.c).start(false, f9Var.C(), uri, j10, f9.D1, f9.B1);
                f9Var.G0.b();
            } else {
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            f9Var.G0 = y3Var;
            y3Var.c = e9Var;
            y3Var.b = null;
            e9Var.setSpeed(f9.B1);
            y3 y3Var4 = f9Var.G0;
            y3Var4.a = f9Var.A0.firstFrameRendered;
            y3Var4.e = f9Var.z0;
            y3Var4.f = f9Var.C0;
            y3Var4.d = f9Var.D0;
            org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        f9Var.t1 = 0L;
        f9Var.V();
    }

    public final void d(float f10) {
        f9 f9Var = this.d;
        if (f9Var.s0 != f10) {
            f9Var.s0 = f10;
            f9Var.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        e9 e9Var;
        f9 f9Var = this.d;
        if (!f9Var.f1 && z10 && f9Var.l0) {
            f9Var.l0 = false;
            y3 y3Var = f9Var.G0;
            if (y3Var != null && (e9Var = (e9) y3Var.c) != null) {
                e9Var.setSeeking(false);
            }
            z3 z11 = f9Var.z();
            if (z11 != null) {
                z11.invalidate();
            }
        }
        f9Var.f1 = z10;
        f9Var.V();
    }

    public final void g(boolean z10) {
        f9 f9Var = this.d;
        f9Var.X0 = z10;
        f9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        f9 f9Var = this.d;
        hi.q3 q3Var = f9Var.E0;
        if (q3Var != null) {
            q3Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = f9Var.D0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        x8 x8Var = f9Var.C0;
        if (x8Var != null) {
            x8Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        f9 f9Var = this.d;
        h6 h6Var = this.a;
        if (h6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(f9Var.o0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                f9Var.u(false);
                return;
            }
            arrayList.remove(indexOf);
            if (f9Var.o0.E(true)) {
                f9Var.o0.H0 = new ai.j1(this, arrayList, indexOf, 11);
                return;
            } else {
                f9Var.u(false);
                return;
            }
        }
        if (f9Var.o0.y0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(f9Var.o0.y0);
        int indexOf2 = f9Var.o0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(f9Var.o0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            f9Var.u(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (f9Var.o0.E(true)) {
            f9Var.o0.H0 = new di.a8(this, h6Var, arrayList2, 8);
        } else {
            f9Var.u(false);
        }
    }
}
