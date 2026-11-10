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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h9 implements c4 {
    public final /* synthetic */ r6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ q9 d;

    public h9(q9 q9Var, r6 r6Var, ArrayList arrayList, Context context) {
        this.d = q9Var;
        this.a = r6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i7, long j3) {
        q9 q9Var = this.d;
        if (q9Var.J == i7 && q9Var.I == j3) {
            return;
        }
        q9Var.I = j3;
        q9Var.J = i7;
    }

    public final void b(boolean z9) {
        q9 q9Var = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = q9Var.f;
        if (q9Var.b) {
            if (q9Var.c) {
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
        WindowManager.LayoutParams layoutParams = q9Var.r;
        layoutParams.softInputMode = z9 ? 48 : 16;
        try {
            q9Var.n.updateViewLayout(q9Var.s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, i4 i4Var) {
        long j10;
        p9 p9Var;
        q9 q9Var = this.d;
        ArrayList arrayList = q9Var.L0;
        if (q9Var.G0 || q9Var.U < 0.9f) {
            fi.s3 s3Var = q9Var.D0;
            if (s3Var != null) {
                s3Var.b(0L, null);
            }
            g1 g1Var = q9Var.A0;
            if (g1Var != null) {
                if (g1Var.n) {
                    g1Var.s(null);
                } else {
                    g1Var.e();
                }
                q9Var.A0 = null;
            }
            org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + q9Var.G0 + ", " + q9Var.U);
            i4Var.a = false;
            i4Var.c = null;
            i4Var.b = null;
            return;
        }
        Uri uri2 = q9Var.E0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (p9Var = q9Var.z0) == null) {
            q9Var.E0 = uri;
            fi.s3 s3Var2 = q9Var.D0;
            if (s3Var2 != null) {
                s3Var2.b(0L, null);
            }
            g1 g1Var2 = q9Var.A0;
            if (g1Var2 != null) {
                if (g1Var2.n) {
                    g1Var2.s(null);
                } else {
                    g1Var2.e();
                }
                q9Var.A0 = null;
            }
            p9 p9Var2 = q9Var.z0;
            if (p9Var2 != null) {
                p9Var2.release(null);
                q9Var.z0 = null;
            }
            i4 i4Var2 = q9Var.F0;
            if (i4Var2 != null) {
                i4Var2.c = null;
                i4Var2.b = null;
                i4Var2.a = false;
                i4Var2.e = null;
                i4Var2.f = null;
                i4Var2.d = null;
                i4Var2.b();
                q9Var.F0 = null;
            }
            if (uri != null) {
                q9Var.F0 = i4Var;
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    if (((p9) arrayList.get(i7)).uri.equals(uri)) {
                        q9Var.z0 = (p9) arrayList.remove(i7);
                        break;
                    }
                    i7++;
                }
                if (q9Var.z0 == null) {
                    p9 p9Var3 = new p9(q9Var, q9Var.C0, q9Var.B0);
                    q9Var.z0 = p9Var3;
                    p9Var3.document = document;
                }
                p9 p9Var4 = q9Var.z0;
                p9Var4.uri = uri;
                p9Var4.setSpeed(q9.A1);
                i4 i4Var3 = q9Var.F0;
                p9 p9Var5 = q9Var.z0;
                i4Var3.c = p9Var5;
                i4Var3.a = false;
                i4Var3.e = q9Var.y0;
                i4Var3.f = q9Var.B0;
                i4Var3.d = q9Var.C0;
                i4Var3.b = null;
                TLRPC.Document document2 = p9Var5.document;
                if (document2 != null) {
                    org.telegram.messenger.s8.I.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.H;
                }
                org.telegram.messenger.w7.G(q9Var.h).h(3, q9Var.z0.document, null, null, null, null);
                if (j3 == 0) {
                    long j11 = q9Var.s1;
                    if (j11 != 0) {
                        q9Var.F0.a = true;
                        j10 = j11;
                        org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((p9) q9Var.F0.c).start(false, q9Var.C(), uri, j10, q9.C1, q9.A1);
                        q9Var.F0.b();
                    }
                }
                j10 = j3;
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((p9) q9Var.F0.c).start(false, q9Var.C(), uri, j10, q9.C1, q9.A1);
                q9Var.F0.b();
            } else {
                org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            q9Var.F0 = i4Var;
            i4Var.c = p9Var;
            i4Var.b = null;
            p9Var.setSpeed(q9.A1);
            i4 i4Var4 = q9Var.F0;
            i4Var4.a = q9Var.z0.firstFrameRendered;
            i4Var4.e = q9Var.y0;
            i4Var4.f = q9Var.B0;
            i4Var4.d = q9Var.C0;
            org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        q9Var.s1 = 0L;
        q9Var.V();
    }

    public final void d(float f10) {
        q9 q9Var = this.d;
        if (q9Var.r0 != f10) {
            q9Var.r0 = f10;
            q9Var.w.invalidate();
        }
    }

    public final void e() {
        this.d.l1 = false;
    }

    public final void f(boolean z9) {
        p9 p9Var;
        q9 q9Var = this.d;
        if (!q9Var.e1 && z9 && q9Var.k0) {
            q9Var.k0 = false;
            i4 i4Var = q9Var.F0;
            if (i4Var != null && (p9Var = (p9) i4Var.c) != null) {
                p9Var.setSeeking(false);
            }
            j4 z10 = q9Var.z();
            if (z10 != null) {
                z10.invalidate();
            }
        }
        q9Var.e1 = z9;
        q9Var.V();
    }

    public final void g(boolean z9) {
        q9 q9Var = this.d;
        q9Var.W0 = z9;
        q9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z9, boolean z10) {
        q9 q9Var = this.d;
        fi.s3 s3Var = q9Var.D0;
        if (s3Var != null) {
            s3Var.setVisibility(z9 ? 0 : 8);
        }
        SurfaceView surfaceView = q9Var.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z9 ? 8 : z10 ? 0 : 4);
        }
        i9 i9Var = q9Var.B0;
        if (i9Var != null) {
            i9Var.setVisibility(z9 ? 8 : 0);
        }
    }

    public final void j() {
        q9 q9Var = this.d;
        r6 r6Var = this.a;
        if (r6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(q9Var.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                q9Var.u(false);
                return;
            }
            arrayList.remove(indexOf);
            if (q9Var.n0.E(true)) {
                q9Var.n0.G0 = new ai.e0(this, arrayList, indexOf, 8);
                return;
            } else {
                q9Var.u(false);
                return;
            }
        }
        if (q9Var.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(q9Var.n0.x0);
        int indexOf2 = q9Var.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(q9Var.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            q9Var.u(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (q9Var.n0.E(true)) {
            q9Var.n0.G0 = new aa.s(this, r6Var, arrayList2, 28);
        } else {
            q9Var.u(false);
        }
    }
}
