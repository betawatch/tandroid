package di;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g9 implements b4 {
    public final /* synthetic */ q6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ p9 d;

    public g9(p9 p9Var, q6 q6Var, ArrayList arrayList, Context context) {
        this.d = p9Var;
        this.a = q6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i7, long j3) {
        p9 p9Var = this.d;
        if (p9Var.J == i7 && p9Var.I == j3) {
            return;
        }
        p9Var.I = j3;
        p9Var.J = i7;
    }

    public final void b(boolean z9) {
        p9 p9Var = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = p9Var.f;
        if (p9Var.b) {
            if (p9Var.c) {
                return;
            }
            if (z9) {
                org.telegram.messenger.g0.Z2(f2Var.getParentActivity(), f2Var.getClassGuid());
                return;
            } else {
                org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = p9Var.r;
        layoutParams.softInputMode = z9 ? 48 : 16;
        try {
            p9Var.n.updateViewLayout(p9Var.s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, h4 h4Var) {
        long j10;
        o9 o9Var;
        p9 p9Var = this.d;
        ArrayList arrayList = p9Var.L0;
        if (p9Var.G0 || p9Var.U < 0.9f) {
            fi.s3 s3Var = p9Var.D0;
            if (s3Var != null) {
                s3Var.b(0L, null);
            }
            g1 g1Var = p9Var.A0;
            if (g1Var != null) {
                if (g1Var.n) {
                    g1Var.s(null);
                } else {
                    g1Var.e();
                }
                p9Var.A0 = null;
            }
            org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + p9Var.G0 + ", " + p9Var.U);
            h4Var.a = false;
            h4Var.c = null;
            h4Var.b = null;
            return;
        }
        Uri uri2 = p9Var.E0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (o9Var = p9Var.z0) == null) {
            p9Var.E0 = uri;
            fi.s3 s3Var2 = p9Var.D0;
            if (s3Var2 != null) {
                s3Var2.b(0L, null);
            }
            g1 g1Var2 = p9Var.A0;
            if (g1Var2 != null) {
                if (g1Var2.n) {
                    g1Var2.s(null);
                } else {
                    g1Var2.e();
                }
                p9Var.A0 = null;
            }
            o9 o9Var2 = p9Var.z0;
            if (o9Var2 != null) {
                o9Var2.release(null);
                p9Var.z0 = null;
            }
            h4 h4Var2 = p9Var.F0;
            if (h4Var2 != null) {
                h4Var2.c = null;
                h4Var2.b = null;
                h4Var2.a = false;
                h4Var2.e = null;
                h4Var2.f = null;
                h4Var2.d = null;
                h4Var2.b();
                p9Var.F0 = null;
            }
            if (uri != null) {
                p9Var.F0 = h4Var;
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    if (((o9) arrayList.get(i7)).uri.equals(uri)) {
                        p9Var.z0 = (o9) arrayList.remove(i7);
                        break;
                    }
                    i7++;
                }
                if (p9Var.z0 == null) {
                    o9 o9Var3 = new o9(p9Var, p9Var.C0, p9Var.B0);
                    p9Var.z0 = o9Var3;
                    o9Var3.document = document;
                }
                o9 o9Var4 = p9Var.z0;
                o9Var4.uri = uri;
                o9Var4.setSpeed(p9.A1);
                h4 h4Var3 = p9Var.F0;
                o9 o9Var5 = p9Var.z0;
                h4Var3.c = o9Var5;
                h4Var3.a = false;
                h4Var3.e = p9Var.y0;
                h4Var3.f = p9Var.B0;
                h4Var3.d = p9Var.C0;
                h4Var3.b = null;
                TLRPC.Document document2 = o9Var5.document;
                if (document2 != null) {
                    org.telegram.messenger.s8.I.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.H;
                }
                org.telegram.messenger.w7.G(p9Var.h).h(3, p9Var.z0.document, null, null, null, null);
                if (j3 == 0) {
                    long j11 = p9Var.s1;
                    if (j11 != 0) {
                        p9Var.F0.a = true;
                        j10 = j11;
                        org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((o9) p9Var.F0.c).start(false, p9Var.C(), uri, j10, p9.C1, p9.A1);
                        p9Var.F0.b();
                    }
                }
                j10 = j3;
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((o9) p9Var.F0.c).start(false, p9Var.C(), uri, j10, p9.C1, p9.A1);
                p9Var.F0.b();
            } else {
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            p9Var.F0 = h4Var;
            h4Var.c = o9Var;
            h4Var.b = null;
            o9Var.setSpeed(p9.A1);
            h4 h4Var4 = p9Var.F0;
            h4Var4.a = p9Var.z0.firstFrameRendered;
            h4Var4.e = p9Var.y0;
            h4Var4.f = p9Var.B0;
            h4Var4.d = p9Var.C0;
            org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        p9Var.s1 = 0L;
        p9Var.V();
    }

    public final void d(float f10) {
        p9 p9Var = this.d;
        if (p9Var.r0 != f10) {
            p9Var.r0 = f10;
            p9Var.w.invalidate();
        }
    }

    public final void e() {
        this.d.l1 = false;
    }

    public final void f(boolean z9) {
        o9 o9Var;
        p9 p9Var = this.d;
        if (!p9Var.e1 && z9 && p9Var.k0) {
            p9Var.k0 = false;
            h4 h4Var = p9Var.F0;
            if (h4Var != null && (o9Var = (o9) h4Var.c) != null) {
                o9Var.setSeeking(false);
            }
            i4 z10 = p9Var.z();
            if (z10 != null) {
                z10.invalidate();
            }
        }
        p9Var.e1 = z9;
        p9Var.V();
    }

    public final void g(boolean z9) {
        p9 p9Var = this.d;
        p9Var.W0 = z9;
        p9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z9, boolean z10) {
        p9 p9Var = this.d;
        fi.s3 s3Var = p9Var.D0;
        if (s3Var != null) {
            s3Var.setVisibility(z9 ? 0 : 8);
        }
        SurfaceView surfaceView = p9Var.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z9 ? 8 : z10 ? 0 : 4);
        }
        h9 h9Var = p9Var.B0;
        if (h9Var != null) {
            h9Var.setVisibility(z9 ? 8 : 0);
        }
    }

    public final void j() {
        p9 p9Var = this.d;
        q6 q6Var = this.a;
        if (q6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(p9Var.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                p9Var.u(false);
                return;
            }
            arrayList.remove(indexOf);
            if (p9Var.n0.E(true)) {
                p9Var.n0.G0 = new ai.e0(this, arrayList, indexOf, 8);
                return;
            } else {
                p9Var.u(false);
                return;
            }
        }
        if (p9Var.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(p9Var.n0.x0);
        int indexOf2 = p9Var.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(p9Var.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            p9Var.u(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (p9Var.n0.E(true)) {
            p9Var.n0.G0 = new aa.s(this, q6Var, arrayList2, 28);
        } else {
            p9Var.u(false);
        }
    }
}
