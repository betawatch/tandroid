package ai;

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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class ac implements y5 {
    public final /* synthetic */ d9 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ jc d;

    public ac(jc jcVar, d9 d9Var, ArrayList arrayList, Context context) {
        this.d = jcVar;
        this.a = d9Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j3) {
        jc jcVar = this.d;
        if (jcVar.J == i10 && jcVar.I == j3) {
            return;
        }
        jcVar.I = j3;
        jcVar.J = i10;
    }

    public final void b(boolean z10) {
        jc jcVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = jcVar.f;
        if (jcVar.b) {
            if (jcVar.c) {
                return;
            }
            if (z10) {
                AndroidUtilities.requestAdjustNothing(n2Var.getParentActivity(), n2Var.getClassGuid());
                return;
            } else {
                AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = jcVar.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            jcVar.n.updateViewLayout(jcVar.s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, e6 e6Var) {
        long j10;
        ic icVar;
        jc jcVar = this.d;
        ArrayList arrayList = jcVar.M0;
        if (jcVar.H0 || jcVar.U < 0.9f) {
            ci.l4 l4Var = jcVar.D0;
            if (l4Var != null) {
                l4Var.d(0L, null);
            }
            d2 d2Var = jcVar.A0;
            if (d2Var != null) {
                if (d2Var.n) {
                    d2Var.s(null);
                } else {
                    d2Var.e();
                }
                jcVar.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + jcVar.H0 + ", " + jcVar.U);
            e6Var.a = false;
            e6Var.c = null;
            e6Var.b = null;
            return;
        }
        Uri uri2 = jcVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (icVar = jcVar.z0) == null) {
            jcVar.F0 = uri;
            ci.l4 l4Var2 = jcVar.D0;
            if (l4Var2 != null) {
                l4Var2.d(0L, null);
            }
            d2 d2Var2 = jcVar.A0;
            if (d2Var2 != null) {
                if (d2Var2.n) {
                    d2Var2.s(null);
                } else {
                    d2Var2.e();
                }
                jcVar.A0 = null;
            }
            ic icVar2 = jcVar.z0;
            if (icVar2 != null) {
                icVar2.release(null);
                jcVar.z0 = null;
            }
            e6 e6Var2 = jcVar.G0;
            if (e6Var2 != null) {
                e6Var2.c = null;
                e6Var2.b = null;
                e6Var2.a = false;
                e6Var2.e = null;
                e6Var2.f = null;
                e6Var2.d = null;
                e6Var2.b();
                jcVar.G0 = null;
            }
            if (uri != null) {
                jcVar.G0 = e6Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((ic) arrayList.get(i10)).uri.equals(uri)) {
                        jcVar.z0 = (ic) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (jcVar.z0 == null) {
                    ic icVar3 = new ic(jcVar, jcVar.C0, jcVar.B0);
                    jcVar.z0 = icVar3;
                    icVar3.document = document;
                }
                ic icVar4 = jcVar.z0;
                icVar4.uri = uri;
                icVar4.setSpeed(jc.B1);
                e6 e6Var3 = jcVar.G0;
                ic icVar5 = jcVar.z0;
                e6Var3.c = icVar5;
                e6Var3.a = false;
                e6Var3.e = jcVar.y0;
                e6Var3.f = jcVar.B0;
                e6Var3.d = jcVar.C0;
                e6Var3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(icVar5.document, 3);
                FileLoader.getInstance(jcVar.h).changePriority(3, jcVar.z0.document, null, null, null, null, null);
                if (j3 == 0) {
                    long j11 = jcVar.t1;
                    if (j11 != 0) {
                        jcVar.G0.a = true;
                        j10 = j11;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((ic) jcVar.G0.c).start(false, jcVar.w(), uri, j10, jc.D1, jc.B1);
                        jcVar.G0.b();
                    }
                }
                j10 = j3;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((ic) jcVar.G0.c).start(false, jcVar.w(), uri, j10, jc.D1, jc.B1);
                jcVar.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            jcVar.G0 = e6Var;
            e6Var.c = icVar;
            e6Var.b = null;
            icVar.setSpeed(jc.B1);
            e6 e6Var4 = jcVar.G0;
            e6Var4.a = jcVar.z0.firstFrameRendered;
            e6Var4.e = jcVar.y0;
            e6Var4.f = jcVar.B0;
            e6Var4.d = jcVar.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        jcVar.t1 = 0L;
        jcVar.P();
    }

    public final void d(float f7) {
        jc jcVar = this.d;
        if (jcVar.r0 != f7) {
            jcVar.r0 = f7;
            jcVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        ic icVar;
        jc jcVar = this.d;
        if (!jcVar.f1 && z10 && jcVar.k0) {
            jcVar.k0 = false;
            e6 e6Var = jcVar.G0;
            if (e6Var != null && (icVar = (ic) e6Var.c) != null) {
                icVar.setSeeking(false);
            }
            f6 t10 = jcVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        jcVar.f1 = z10;
        jcVar.P();
    }

    public final void g(boolean z10) {
        jc jcVar = this.d;
        jcVar.X0 = z10;
        jcVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        jc jcVar = this.d;
        ci.l4 l4Var = jcVar.D0;
        if (l4Var != null) {
            l4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = jcVar.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        bc bcVar = jcVar.B0;
        if (bcVar != null) {
            bcVar.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        jc jcVar = this.d;
        d9 d9Var = this.a;
        if (d9Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(jcVar.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                jcVar.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (jcVar.n0.E(true)) {
                jcVar.n0.G0 = new s1(this, arrayList, indexOf, 2);
                return;
            } else {
                jcVar.q(false);
                return;
            }
        }
        if (jcVar.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(jcVar.n0.x0);
        int indexOf2 = jcVar.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(jcVar.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            jcVar.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (jcVar.n0.E(true)) {
            jcVar.n0.G0 = new a3.k0(this, d9Var, arrayList2, 7);
        } else {
            jcVar.q(false);
        }
    }
}
