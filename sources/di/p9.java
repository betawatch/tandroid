package di;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p9 implements j4 {
    public final /* synthetic */ z6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ y9 d;

    public p9(y9 y9Var, z6 z6Var, ArrayList arrayList, Context context) {
        this.d = y9Var;
        this.a = z6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j10) {
        y9 y9Var = this.d;
        if (y9Var.J == i10 && y9Var.I == j10) {
            return;
        }
        y9Var.I = j10;
        y9Var.J = i10;
    }

    public final void b(boolean z10) {
        y9 y9Var = this.d;
        org.telegram.ui.ActionBar.r2 r2Var = y9Var.f;
        if (y9Var.b) {
            if (y9Var.c) {
                return;
            }
            if (z10) {
                AndroidUtilities.requestAdjustNothing(r2Var.getParentActivity(), r2Var.getClassGuid());
                return;
            } else {
                AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = y9Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            y9Var.n.updateViewLayout(y9Var.s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, p4 p4Var) {
        long j11;
        x9 x9Var;
        y9 y9Var = this.d;
        ArrayList arrayList = y9Var.M0;
        if (y9Var.H0 || y9Var.U < 0.9f) {
            fi.b4 b4Var = y9Var.D0;
            if (b4Var != null) {
                b4Var.d(0L, null);
            }
            h1 h1Var = y9Var.A0;
            if (h1Var != null) {
                if (h1Var.n) {
                    h1Var.s(null);
                } else {
                    h1Var.e();
                }
                y9Var.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + y9Var.H0 + ", " + y9Var.U);
            p4Var.a = false;
            p4Var.c = null;
            p4Var.b = null;
            return;
        }
        Uri uri2 = y9Var.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (x9Var = y9Var.z0) == null) {
            y9Var.F0 = uri;
            fi.b4 b4Var2 = y9Var.D0;
            if (b4Var2 != null) {
                b4Var2.d(0L, null);
            }
            h1 h1Var2 = y9Var.A0;
            if (h1Var2 != null) {
                if (h1Var2.n) {
                    h1Var2.s(null);
                } else {
                    h1Var2.e();
                }
                y9Var.A0 = null;
            }
            x9 x9Var2 = y9Var.z0;
            if (x9Var2 != null) {
                x9Var2.release(null);
                y9Var.z0 = null;
            }
            p4 p4Var2 = y9Var.G0;
            if (p4Var2 != null) {
                p4Var2.c = null;
                p4Var2.b = null;
                p4Var2.a = false;
                p4Var2.e = null;
                p4Var2.f = null;
                p4Var2.d = null;
                p4Var2.b();
                y9Var.G0 = null;
            }
            if (uri != null) {
                y9Var.G0 = p4Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((x9) arrayList.get(i10)).uri.equals(uri)) {
                        y9Var.z0 = (x9) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (y9Var.z0 == null) {
                    x9 x9Var3 = new x9(y9Var, y9Var.C0, y9Var.B0);
                    y9Var.z0 = x9Var3;
                    x9Var3.document = document;
                }
                x9 x9Var4 = y9Var.z0;
                x9Var4.uri = uri;
                x9Var4.setSpeed(y9.B1);
                p4 p4Var3 = y9Var.G0;
                x9 x9Var5 = y9Var.z0;
                p4Var3.c = x9Var5;
                p4Var3.a = false;
                p4Var3.e = y9Var.y0;
                p4Var3.f = y9Var.B0;
                p4Var3.d = y9Var.C0;
                p4Var3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(x9Var5.document, 3);
                FileLoader.getInstance(y9Var.h).changePriority(3, y9Var.z0.document, null, null, null, null, null);
                if (j10 == 0) {
                    long j12 = y9Var.t1;
                    if (j12 != 0) {
                        y9Var.G0.a = true;
                        j11 = j12;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((x9) y9Var.G0.c).start(false, y9Var.x(), uri, j11, y9.D1, y9.B1);
                        y9Var.G0.b();
                    }
                }
                j11 = j10;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((x9) y9Var.G0.c).start(false, y9Var.x(), uri, j11, y9.D1, y9.B1);
                y9Var.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            y9Var.G0 = p4Var;
            p4Var.c = x9Var;
            p4Var.b = null;
            x9Var.setSpeed(y9.B1);
            p4 p4Var4 = y9Var.G0;
            p4Var4.a = y9Var.z0.firstFrameRendered;
            p4Var4.e = y9Var.y0;
            p4Var4.f = y9Var.B0;
            p4Var4.d = y9Var.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        y9Var.t1 = 0L;
        y9Var.Q();
    }

    public final void d(float f7) {
        y9 y9Var = this.d;
        if (y9Var.r0 != f7) {
            y9Var.r0 = f7;
            y9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        x9 x9Var;
        y9 y9Var = this.d;
        if (!y9Var.f1 && z10 && y9Var.k0) {
            y9Var.k0 = false;
            p4 p4Var = y9Var.G0;
            if (p4Var != null && (x9Var = (x9) p4Var.c) != null) {
                x9Var.setSeeking(false);
            }
            q4 u10 = y9Var.u();
            if (u10 != null) {
                u10.invalidate();
            }
        }
        y9Var.f1 = z10;
        y9Var.Q();
    }

    public final void g(boolean z10) {
        y9 y9Var = this.d;
        y9Var.X0 = z10;
        y9Var.Q();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        y9 y9Var = this.d;
        fi.b4 b4Var = y9Var.D0;
        if (b4Var != null) {
            b4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = y9Var.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        q9 q9Var = y9Var.B0;
        if (q9Var != null) {
            q9Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        y9 y9Var = this.d;
        z6 z6Var = this.a;
        if (z6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(y9Var.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                y9Var.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (y9Var.n0.E(true)) {
                y9Var.n0.G0 = new ai.h0(this, arrayList, indexOf, 8);
                return;
            } else {
                y9Var.q(false);
                return;
            }
        }
        if (y9Var.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(y9Var.n0.x0);
        int indexOf2 = y9Var.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(y9Var.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            y9Var.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (y9Var.n0.E(true)) {
            y9Var.n0.G0 = new a3.l0(this, z6Var, arrayList2, 27);
        } else {
            y9Var.q(false);
        }
    }
}
