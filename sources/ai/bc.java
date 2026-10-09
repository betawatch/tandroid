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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class bc implements y5 {
    public final /* synthetic */ e9 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ kc d;

    public bc(kc kcVar, e9 e9Var, ArrayList arrayList, Context context) {
        this.d = kcVar;
        this.a = e9Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j3) {
        kc kcVar = this.d;
        if (kcVar.J == i10 && kcVar.I == j3) {
            return;
        }
        kcVar.I = j3;
        kcVar.J = i10;
    }

    public final void b(boolean z10) {
        kc kcVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = kcVar.f;
        if (kcVar.b) {
            if (kcVar.c) {
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
        WindowManager.LayoutParams layoutParams = kcVar.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            kcVar.n.updateViewLayout(kcVar.s, layoutParams);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, e6 e6Var) {
        long j10;
        jc jcVar;
        kc kcVar = this.d;
        ArrayList arrayList = kcVar.M0;
        if (kcVar.H0 || kcVar.U < 0.9f) {
            ci.j4 j4Var = kcVar.D0;
            if (j4Var != null) {
                j4Var.d(0L, null);
            }
            d2 d2Var = kcVar.A0;
            if (d2Var != null) {
                if (d2Var.n) {
                    d2Var.s(null);
                } else {
                    d2Var.e();
                }
                kcVar.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + kcVar.H0 + ", " + kcVar.U);
            e6Var.a = false;
            e6Var.c = null;
            e6Var.b = null;
            return;
        }
        Uri uri2 = kcVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (jcVar = kcVar.z0) == null) {
            kcVar.F0 = uri;
            ci.j4 j4Var2 = kcVar.D0;
            if (j4Var2 != null) {
                j4Var2.d(0L, null);
            }
            d2 d2Var2 = kcVar.A0;
            if (d2Var2 != null) {
                if (d2Var2.n) {
                    d2Var2.s(null);
                } else {
                    d2Var2.e();
                }
                kcVar.A0 = null;
            }
            jc jcVar2 = kcVar.z0;
            if (jcVar2 != null) {
                jcVar2.release(null);
                kcVar.z0 = null;
            }
            e6 e6Var2 = kcVar.G0;
            if (e6Var2 != null) {
                e6Var2.c = null;
                e6Var2.b = null;
                e6Var2.a = false;
                e6Var2.e = null;
                e6Var2.f = null;
                e6Var2.d = null;
                e6Var2.b();
                kcVar.G0 = null;
            }
            if (uri != null) {
                kcVar.G0 = e6Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((jc) arrayList.get(i10)).uri.equals(uri)) {
                        kcVar.z0 = (jc) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (kcVar.z0 == null) {
                    jc jcVar3 = new jc(kcVar, kcVar.C0, kcVar.B0);
                    kcVar.z0 = jcVar3;
                    jcVar3.document = document;
                }
                jc jcVar4 = kcVar.z0;
                jcVar4.uri = uri;
                jcVar4.setSpeed(kc.B1);
                e6 e6Var3 = kcVar.G0;
                jc jcVar5 = kcVar.z0;
                e6Var3.c = jcVar5;
                e6Var3.a = false;
                e6Var3.e = kcVar.y0;
                e6Var3.f = kcVar.B0;
                e6Var3.d = kcVar.C0;
                e6Var3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(jcVar5.document, 3);
                FileLoader.getInstance(kcVar.h).changePriority(3, kcVar.z0.document, null, null, null, null, null);
                if (j3 == 0) {
                    long j11 = kcVar.t1;
                    if (j11 != 0) {
                        kcVar.G0.a = true;
                        j10 = j11;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((jc) kcVar.G0.c).start(false, kcVar.w(), uri, j10, kc.D1, kc.B1);
                        kcVar.G0.b();
                    }
                }
                j10 = j3;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((jc) kcVar.G0.c).start(false, kcVar.w(), uri, j10, kc.D1, kc.B1);
                kcVar.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            kcVar.G0 = e6Var;
            e6Var.c = jcVar;
            e6Var.b = null;
            jcVar.setSpeed(kc.B1);
            e6 e6Var4 = kcVar.G0;
            e6Var4.a = kcVar.z0.firstFrameRendered;
            e6Var4.e = kcVar.y0;
            e6Var4.f = kcVar.B0;
            e6Var4.d = kcVar.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        kcVar.t1 = 0L;
        kcVar.P();
    }

    public final void d(float f7) {
        kc kcVar = this.d;
        if (kcVar.r0 != f7) {
            kcVar.r0 = f7;
            kcVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        jc jcVar;
        kc kcVar = this.d;
        if (!kcVar.f1 && z10 && kcVar.k0) {
            kcVar.k0 = false;
            e6 e6Var = kcVar.G0;
            if (e6Var != null && (jcVar = (jc) e6Var.c) != null) {
                jcVar.setSeeking(false);
            }
            f6 t10 = kcVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        kcVar.f1 = z10;
        kcVar.P();
    }

    public final void g(boolean z10) {
        kc kcVar = this.d;
        kcVar.X0 = z10;
        kcVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        kc kcVar = this.d;
        ci.j4 j4Var = kcVar.D0;
        if (j4Var != null) {
            j4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = kcVar.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        cc ccVar = kcVar.B0;
        if (ccVar != null) {
            ccVar.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        kc kcVar = this.d;
        e9 e9Var = this.a;
        if (e9Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(kcVar.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                kcVar.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (kcVar.n0.E(true)) {
                kcVar.n0.G0 = new s1(this, arrayList, indexOf, 2);
                return;
            } else {
                kcVar.q(false);
                return;
            }
        }
        if (kcVar.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(kcVar.n0.x0);
        int indexOf2 = kcVar.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(kcVar.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            kcVar.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (kcVar.n0.E(true)) {
            kcVar.n0.G0 = new a3.k0(this, e9Var, arrayList2, 7);
        } else {
            kcVar.q(false);
        }
    }
}
