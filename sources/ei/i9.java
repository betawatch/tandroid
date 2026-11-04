package ei;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i9 implements c4 {
    public final /* synthetic */ r6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ r9 d;

    public i9(r9 r9Var, r6 r6Var, ArrayList arrayList, Context context) {
        this.d = r9Var;
        this.a = r6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i3, long j10) {
        r9 r9Var = this.d;
        if (r9Var.K == i3 && r9Var.J == j10) {
            return;
        }
        r9Var.J = j10;
        r9Var.K = i3;
    }

    public final void b(boolean z10) {
        r9 r9Var = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = r9Var.f;
        if (r9Var.b) {
            if (r9Var.c) {
                return;
            }
            if (z10) {
                org.telegram.messenger.g0.Z2(d2Var.getParentActivity(), d2Var.getClassGuid());
                return;
            } else {
                org.telegram.messenger.g0.a3(d2Var.getParentActivity(), d2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = r9Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            r9Var.n.updateViewLayout(r9Var.s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, i4 i4Var) {
        long j11;
        q9 q9Var;
        r9 r9Var = this.d;
        ArrayList arrayList = r9Var.N0;
        if (r9Var.I0 || r9Var.V < 0.9f) {
            gi.r3 r3Var = r9Var.E0;
            if (r3Var != null) {
                r3Var.d(0L, null);
            }
            g1 g1Var = r9Var.B0;
            if (g1Var != null) {
                if (g1Var.n) {
                    g1Var.s(null);
                } else {
                    g1Var.e();
                }
                r9Var.B0 = null;
            }
            org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + r9Var.I0 + ", " + r9Var.V);
            i4Var.a = false;
            i4Var.c = null;
            i4Var.b = null;
            return;
        }
        Uri uri2 = r9Var.G0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (q9Var = r9Var.A0) == null) {
            r9Var.G0 = uri;
            gi.r3 r3Var2 = r9Var.E0;
            if (r3Var2 != null) {
                r3Var2.d(0L, null);
            }
            g1 g1Var2 = r9Var.B0;
            if (g1Var2 != null) {
                if (g1Var2.n) {
                    g1Var2.s(null);
                } else {
                    g1Var2.e();
                }
                r9Var.B0 = null;
            }
            q9 q9Var2 = r9Var.A0;
            if (q9Var2 != null) {
                q9Var2.release(null);
                r9Var.A0 = null;
            }
            i4 i4Var2 = r9Var.H0;
            if (i4Var2 != null) {
                i4Var2.c = null;
                i4Var2.b = null;
                i4Var2.a = false;
                i4Var2.e = null;
                i4Var2.f = null;
                i4Var2.d = null;
                i4Var2.b();
                r9Var.H0 = null;
            }
            if (uri != null) {
                r9Var.H0 = i4Var;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    if (((q9) arrayList.get(i3)).uri.equals(uri)) {
                        r9Var.A0 = (q9) arrayList.remove(i3);
                        break;
                    }
                    i3++;
                }
                if (r9Var.A0 == null) {
                    q9 q9Var3 = new q9(r9Var, r9Var.D0, r9Var.C0);
                    r9Var.A0 = q9Var3;
                    q9Var3.document = document;
                }
                q9 q9Var4 = r9Var.A0;
                q9Var4.uri = uri;
                q9Var4.setSpeed(r9.C1);
                i4 i4Var3 = r9Var.H0;
                q9 q9Var5 = r9Var.A0;
                i4Var3.c = q9Var5;
                i4Var3.a = false;
                i4Var3.e = r9Var.z0;
                i4Var3.f = r9Var.C0;
                i4Var3.d = r9Var.D0;
                i4Var3.b = null;
                TLRPC.Document document2 = q9Var5.document;
                if (document2 != null) {
                    org.telegram.messenger.s8.J.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                }
                org.telegram.messenger.w7.G(r9Var.h).h(3, r9Var.A0.document, null, null, null, null);
                if (j10 == 0) {
                    long j12 = r9Var.u1;
                    if (j12 != 0) {
                        r9Var.H0.a = true;
                        j11 = j12;
                        org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((q9) r9Var.H0.c).start(false, r9Var.K(), uri, j11, r9.E1, r9.C1);
                        r9Var.H0.b();
                    }
                }
                j11 = j10;
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((q9) r9Var.H0.c).start(false, r9Var.K(), uri, j11, r9.E1, r9.C1);
                r9Var.H0.b();
            } else {
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            r9Var.H0 = i4Var;
            i4Var.c = q9Var;
            i4Var.b = null;
            q9Var.setSpeed(r9.C1);
            i4 i4Var4 = r9Var.H0;
            i4Var4.a = r9Var.A0.firstFrameRendered;
            i4Var4.e = r9Var.z0;
            i4Var4.f = r9Var.C0;
            i4Var4.d = r9Var.D0;
            org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        r9Var.u1 = 0L;
        r9Var.d0();
    }

    public final void d(float f10) {
        r9 r9Var = this.d;
        if (r9Var.s0 != f10) {
            r9Var.s0 = f10;
            r9Var.w.invalidate();
        }
    }

    public final void e() {
        this.d.n1 = false;
    }

    public final void f(boolean z10) {
        q9 q9Var;
        r9 r9Var = this.d;
        if (!r9Var.g1 && z10 && r9Var.l0) {
            r9Var.l0 = false;
            i4 i4Var = r9Var.H0;
            if (i4Var != null && (q9Var = (q9) i4Var.c) != null) {
                q9Var.setSeeking(false);
            }
            j4 H = r9Var.H();
            if (H != null) {
                H.invalidate();
            }
        }
        r9Var.g1 = z10;
        r9Var.d0();
    }

    public final void g(boolean z10) {
        r9 r9Var = this.d;
        r9Var.Y0 = z10;
        r9Var.d0();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        r9 r9Var = this.d;
        gi.r3 r3Var = r9Var.E0;
        if (r3Var != null) {
            r3Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = r9Var.D0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        j9 j9Var = r9Var.C0;
        if (j9Var != null) {
            j9Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        r9 r9Var = this.d;
        r6 r6Var = this.a;
        if (r6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(r9Var.o0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                r9Var.D(false);
                return;
            }
            arrayList.remove(indexOf);
            if (r9Var.o0.E(true)) {
                r9Var.o0.H0 = new ai.e3(this, arrayList, indexOf, 9);
                return;
            } else {
                r9Var.D(false);
                return;
            }
        }
        if (r9Var.o0.y0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(r9Var.o0.y0);
        int indexOf2 = r9Var.o0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(r9Var.o0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            r9Var.D(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (r9Var.o0.E(true)) {
            r9Var.o0.H0 = new h9(this, r6Var, arrayList2, 0);
        } else {
            r9Var.D(false);
        }
    }
}
