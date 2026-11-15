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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z8 implements u3 {
    public final /* synthetic */ k6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ i9 d;

    public z8(i9 i9Var, k6 k6Var, ArrayList arrayList, Context context) {
        this.d = i9Var;
        this.a = k6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i7, long j3) {
        i9 i9Var = this.d;
        if (i9Var.K == i7 && i9Var.J == j3) {
            return;
        }
        i9Var.J = j3;
        i9Var.K = i7;
    }

    public final void b(boolean z10) {
        i9 i9Var = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = i9Var.f;
        if (i9Var.b) {
            if (i9Var.c) {
                return;
            }
            if (z10) {
                org.telegram.messenger.g0.Z2(e2Var.getParentActivity(), e2Var.getClassGuid());
                return;
            } else {
                org.telegram.messenger.g0.a3(e2Var.getParentActivity(), e2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = i9Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            i9Var.n.updateViewLayout(i9Var.s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, a4 a4Var) {
        long j10;
        h9 h9Var;
        i9 i9Var = this.d;
        ArrayList arrayList = i9Var.M0;
        if (i9Var.H0 || i9Var.V < 0.9f) {
            hi.r3 r3Var = i9Var.E0;
            if (r3Var != null) {
                r3Var.b(0L, null);
            }
            e1 e1Var = i9Var.B0;
            if (e1Var != null) {
                if (e1Var.n) {
                    e1Var.s(null);
                } else {
                    e1Var.e();
                }
                i9Var.B0 = null;
            }
            org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + i9Var.H0 + ", " + i9Var.V);
            a4Var.a = false;
            a4Var.c = null;
            a4Var.b = null;
            return;
        }
        Uri uri2 = i9Var.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (h9Var = i9Var.A0) == null) {
            i9Var.F0 = uri;
            hi.r3 r3Var2 = i9Var.E0;
            if (r3Var2 != null) {
                r3Var2.b(0L, null);
            }
            e1 e1Var2 = i9Var.B0;
            if (e1Var2 != null) {
                if (e1Var2.n) {
                    e1Var2.s(null);
                } else {
                    e1Var2.e();
                }
                i9Var.B0 = null;
            }
            h9 h9Var2 = i9Var.A0;
            if (h9Var2 != null) {
                h9Var2.release(null);
                i9Var.A0 = null;
            }
            a4 a4Var2 = i9Var.G0;
            if (a4Var2 != null) {
                a4Var2.c = null;
                a4Var2.b = null;
                a4Var2.a = false;
                a4Var2.e = null;
                a4Var2.f = null;
                a4Var2.d = null;
                a4Var2.b();
                i9Var.G0 = null;
            }
            if (uri != null) {
                i9Var.G0 = a4Var;
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    if (((h9) arrayList.get(i7)).uri.equals(uri)) {
                        i9Var.A0 = (h9) arrayList.remove(i7);
                        break;
                    }
                    i7++;
                }
                if (i9Var.A0 == null) {
                    h9 h9Var3 = new h9(i9Var, i9Var.D0, i9Var.C0);
                    i9Var.A0 = h9Var3;
                    h9Var3.document = document;
                }
                h9 h9Var4 = i9Var.A0;
                h9Var4.uri = uri;
                h9Var4.setSpeed(i9.B1);
                a4 a4Var3 = i9Var.G0;
                h9 h9Var5 = i9Var.A0;
                a4Var3.c = h9Var5;
                a4Var3.a = false;
                a4Var3.e = i9Var.z0;
                a4Var3.f = i9Var.C0;
                a4Var3.d = i9Var.D0;
                a4Var3.b = null;
                TLRPC.Document document2 = h9Var5.document;
                if (document2 != null) {
                    org.telegram.messenger.s8.J.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                }
                org.telegram.messenger.w7.G(i9Var.h).h(3, i9Var.A0.document, null, null, null, null);
                if (j3 == 0) {
                    long j11 = i9Var.t1;
                    if (j11 != 0) {
                        i9Var.G0.a = true;
                        j10 = j11;
                        org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((h9) i9Var.G0.c).start(false, i9Var.C(), uri, j10, i9.D1, i9.B1);
                        i9Var.G0.b();
                    }
                }
                j10 = j3;
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((h9) i9Var.G0.c).start(false, i9Var.C(), uri, j10, i9.D1, i9.B1);
                i9Var.G0.b();
            } else {
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            i9Var.G0 = a4Var;
            a4Var.c = h9Var;
            a4Var.b = null;
            h9Var.setSpeed(i9.B1);
            a4 a4Var4 = i9Var.G0;
            a4Var4.a = i9Var.A0.firstFrameRendered;
            a4Var4.e = i9Var.z0;
            a4Var4.f = i9Var.C0;
            a4Var4.d = i9Var.D0;
            org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        i9Var.t1 = 0L;
        i9Var.V();
    }

    public final void d(float f10) {
        i9 i9Var = this.d;
        if (i9Var.s0 != f10) {
            i9Var.s0 = f10;
            i9Var.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        h9 h9Var;
        i9 i9Var = this.d;
        if (!i9Var.f1 && z10 && i9Var.l0) {
            i9Var.l0 = false;
            a4 a4Var = i9Var.G0;
            if (a4Var != null && (h9Var = (h9) a4Var.c) != null) {
                h9Var.setSeeking(false);
            }
            b4 z11 = i9Var.z();
            if (z11 != null) {
                z11.invalidate();
            }
        }
        i9Var.f1 = z10;
        i9Var.V();
    }

    public final void g(boolean z10) {
        i9 i9Var = this.d;
        i9Var.X0 = z10;
        i9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        i9 i9Var = this.d;
        hi.r3 r3Var = i9Var.E0;
        if (r3Var != null) {
            r3Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = i9Var.D0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        a9 a9Var = i9Var.C0;
        if (a9Var != null) {
            a9Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        i9 i9Var = this.d;
        k6 k6Var = this.a;
        if (k6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(i9Var.o0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                i9Var.u(false);
                return;
            }
            arrayList.remove(indexOf);
            if (i9Var.o0.E(true)) {
                i9Var.o0.H0 = new ai.a1(this, arrayList, indexOf, 11);
                return;
            } else {
                i9Var.u(false);
                return;
            }
        }
        if (i9Var.o0.y0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(i9Var.o0.y0);
        int indexOf2 = i9Var.o0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(i9Var.o0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            i9Var.u(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (i9Var.o0.E(true)) {
            i9Var.o0.H0 = new s5(this, k6Var, arrayList2, 3);
        } else {
            i9Var.u(false);
        }
    }
}
