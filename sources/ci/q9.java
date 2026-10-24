package ci;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class q9 implements i4 {
    public final /* synthetic */ z6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ z9 d;

    public q9(z9 z9Var, z6 z6Var, ArrayList arrayList, Context context) {
        this.d = z9Var;
        this.a = z6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j10) {
        z9 z9Var = this.d;
        if (z9Var.J == i10 && z9Var.I == j10) {
            return;
        }
        z9Var.I = j10;
        z9Var.J = i10;
    }

    public final void b(boolean z10) {
        z9 z9Var = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = z9Var.f;
        if (z9Var.b) {
            if (z9Var.c) {
                return;
            }
            if (z10) {
                AndroidUtilities.requestAdjustNothing(o2Var.getParentActivity(), o2Var.getClassGuid());
                return;
            } else {
                AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = z9Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            z9Var.n.updateViewLayout(z9Var.s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, o4 o4Var) {
        long j11;
        y9 y9Var;
        z9 z9Var = this.d;
        ArrayList arrayList = z9Var.M0;
        if (z9Var.H0 || z9Var.U < 0.9f) {
            ei.d4 d4Var = z9Var.D0;
            if (d4Var != null) {
                d4Var.d(0L, null);
            }
            h1 h1Var = z9Var.A0;
            if (h1Var != null) {
                if (h1Var.n) {
                    h1Var.s(null);
                } else {
                    h1Var.e();
                }
                z9Var.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + z9Var.H0 + ", " + z9Var.U);
            o4Var.a = false;
            o4Var.c = null;
            o4Var.b = null;
            return;
        }
        Uri uri2 = z9Var.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (y9Var = z9Var.z0) == null) {
            z9Var.F0 = uri;
            ei.d4 d4Var2 = z9Var.D0;
            if (d4Var2 != null) {
                d4Var2.d(0L, null);
            }
            h1 h1Var2 = z9Var.A0;
            if (h1Var2 != null) {
                if (h1Var2.n) {
                    h1Var2.s(null);
                } else {
                    h1Var2.e();
                }
                z9Var.A0 = null;
            }
            y9 y9Var2 = z9Var.z0;
            if (y9Var2 != null) {
                y9Var2.release(null);
                z9Var.z0 = null;
            }
            o4 o4Var2 = z9Var.G0;
            if (o4Var2 != null) {
                o4Var2.c = null;
                o4Var2.b = null;
                o4Var2.a = false;
                o4Var2.e = null;
                o4Var2.f = null;
                o4Var2.d = null;
                o4Var2.b();
                z9Var.G0 = null;
            }
            if (uri != null) {
                z9Var.G0 = o4Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((y9) arrayList.get(i10)).uri.equals(uri)) {
                        z9Var.z0 = (y9) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (z9Var.z0 == null) {
                    y9 y9Var3 = new y9(z9Var, z9Var.C0, z9Var.B0);
                    z9Var.z0 = y9Var3;
                    y9Var3.document = document;
                }
                y9 y9Var4 = z9Var.z0;
                y9Var4.uri = uri;
                y9Var4.setSpeed(z9.B1);
                o4 o4Var3 = z9Var.G0;
                y9 y9Var5 = z9Var.z0;
                o4Var3.c = y9Var5;
                o4Var3.a = false;
                o4Var3.e = z9Var.y0;
                o4Var3.f = z9Var.B0;
                o4Var3.d = z9Var.C0;
                o4Var3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(y9Var5.document, 3);
                FileLoader.getInstance(z9Var.h).changePriority(3, z9Var.z0.document, null, null, null, null, null);
                if (j10 == 0) {
                    long j12 = z9Var.t1;
                    if (j12 != 0) {
                        z9Var.G0.a = true;
                        j11 = j12;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((y9) z9Var.G0.c).start(false, z9Var.w(), uri, j11, z9.D1, z9.B1);
                        z9Var.G0.b();
                    }
                }
                j11 = j10;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((y9) z9Var.G0.c).start(false, z9Var.w(), uri, j11, z9.D1, z9.B1);
                z9Var.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            z9Var.G0 = o4Var;
            o4Var.c = y9Var;
            o4Var.b = null;
            y9Var.setSpeed(z9.B1);
            o4 o4Var4 = z9Var.G0;
            o4Var4.a = z9Var.z0.firstFrameRendered;
            o4Var4.e = z9Var.y0;
            o4Var4.f = z9Var.B0;
            o4Var4.d = z9Var.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        z9Var.t1 = 0L;
        z9Var.P();
    }

    public final void d(float f7) {
        z9 z9Var = this.d;
        if (z9Var.r0 != f7) {
            z9Var.r0 = f7;
            z9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        y9 y9Var;
        z9 z9Var = this.d;
        if (!z9Var.f1 && z10 && z9Var.k0) {
            z9Var.k0 = false;
            o4 o4Var = z9Var.G0;
            if (o4Var != null && (y9Var = (y9) o4Var.c) != null) {
                y9Var.setSeeking(false);
            }
            p4 t10 = z9Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        z9Var.f1 = z10;
        z9Var.P();
    }

    public final void g(boolean z10) {
        z9 z9Var = this.d;
        z9Var.X0 = z10;
        z9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        z9 z9Var = this.d;
        ei.d4 d4Var = z9Var.D0;
        if (d4Var != null) {
            d4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = z9Var.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        r9 r9Var = z9Var.B0;
        if (r9Var != null) {
            r9Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        z9 z9Var = this.d;
        z6 z6Var = this.a;
        if (z6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(z9Var.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                z9Var.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (z9Var.n0.E(true)) {
                z9Var.n0.G0 = new ah.o(this, arrayList, indexOf, 7);
                return;
            } else {
                z9Var.q(false);
                return;
            }
        }
        if (z9Var.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(z9Var.n0.x0);
        int indexOf2 = z9Var.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(z9Var.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            z9Var.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (z9Var.n0.E(true)) {
            z9Var.n0.G0 = new a3.l0(this, z6Var, arrayList2, 25);
        } else {
            z9Var.q(false);
        }
    }
}
