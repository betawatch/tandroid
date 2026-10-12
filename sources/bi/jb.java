package bi;

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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class jb implements j5 {
    public final /* synthetic */ o8 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ sb d;

    public jb(sb sbVar, o8 o8Var, ArrayList arrayList, Context context) {
        this.d = sbVar;
        this.a = o8Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j10) {
        sb sbVar = this.d;
        if (sbVar.J == i10 && sbVar.I == j10) {
            return;
        }
        sbVar.I = j10;
        sbVar.J = i10;
    }

    public final void b(boolean z10) {
        sb sbVar = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = sbVar.f;
        if (sbVar.b) {
            if (sbVar.c) {
                return;
            }
            if (z10) {
                AndroidUtilities.requestAdjustNothing(m2Var.getParentActivity(), m2Var.getClassGuid());
                return;
            } else {
                AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = sbVar.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            sbVar.n.updateViewLayout(sbVar.s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, p5 p5Var) {
        long j11;
        rb rbVar;
        sb sbVar = this.d;
        ArrayList arrayList = sbVar.M0;
        if (sbVar.H0 || sbVar.U < 0.9f) {
            di.j4 j4Var = sbVar.D0;
            if (j4Var != null) {
                j4Var.d(0L, null);
            }
            t1 t1Var = sbVar.A0;
            if (t1Var != null) {
                if (t1Var.n) {
                    t1Var.s(null);
                } else {
                    t1Var.e();
                }
                sbVar.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + sbVar.H0 + ", " + sbVar.U);
            p5Var.a = false;
            p5Var.c = null;
            p5Var.b = null;
            return;
        }
        Uri uri2 = sbVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (rbVar = sbVar.z0) == null) {
            sbVar.F0 = uri;
            di.j4 j4Var2 = sbVar.D0;
            if (j4Var2 != null) {
                j4Var2.d(0L, null);
            }
            t1 t1Var2 = sbVar.A0;
            if (t1Var2 != null) {
                if (t1Var2.n) {
                    t1Var2.s(null);
                } else {
                    t1Var2.e();
                }
                sbVar.A0 = null;
            }
            rb rbVar2 = sbVar.z0;
            if (rbVar2 != null) {
                rbVar2.release(null);
                sbVar.z0 = null;
            }
            p5 p5Var2 = sbVar.G0;
            if (p5Var2 != null) {
                p5Var2.c = null;
                p5Var2.b = null;
                p5Var2.a = false;
                p5Var2.e = null;
                p5Var2.f = null;
                p5Var2.d = null;
                p5Var2.b();
                sbVar.G0 = null;
            }
            if (uri != null) {
                sbVar.G0 = p5Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((rb) arrayList.get(i10)).uri.equals(uri)) {
                        sbVar.z0 = (rb) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (sbVar.z0 == null) {
                    rb rbVar3 = new rb(sbVar, sbVar.C0, sbVar.B0);
                    sbVar.z0 = rbVar3;
                    rbVar3.document = document;
                }
                rb rbVar4 = sbVar.z0;
                rbVar4.uri = uri;
                rbVar4.setSpeed(sb.B1);
                p5 p5Var3 = sbVar.G0;
                rb rbVar5 = sbVar.z0;
                p5Var3.c = rbVar5;
                p5Var3.a = false;
                p5Var3.e = sbVar.y0;
                p5Var3.f = sbVar.B0;
                p5Var3.d = sbVar.C0;
                p5Var3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(rbVar5.document, 3);
                FileLoader.getInstance(sbVar.h).changePriority(3, sbVar.z0.document, null, null, null, null, null);
                if (j10 == 0) {
                    long j12 = sbVar.t1;
                    if (j12 != 0) {
                        sbVar.G0.a = true;
                        j11 = j12;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((rb) sbVar.G0.c).start(false, sbVar.w(), uri, j11, sb.D1, sb.B1);
                        sbVar.G0.b();
                    }
                }
                j11 = j10;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((rb) sbVar.G0.c).start(false, sbVar.w(), uri, j11, sb.D1, sb.B1);
                sbVar.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            sbVar.G0 = p5Var;
            p5Var.c = rbVar;
            p5Var.b = null;
            rbVar.setSpeed(sb.B1);
            p5 p5Var4 = sbVar.G0;
            p5Var4.a = sbVar.z0.firstFrameRendered;
            p5Var4.e = sbVar.y0;
            p5Var4.f = sbVar.B0;
            p5Var4.d = sbVar.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        sbVar.t1 = 0L;
        sbVar.P();
    }

    public final void d(float f7) {
        sb sbVar = this.d;
        if (sbVar.r0 != f7) {
            sbVar.r0 = f7;
            sbVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        rb rbVar;
        sb sbVar = this.d;
        if (!sbVar.f1 && z10 && sbVar.k0) {
            sbVar.k0 = false;
            p5 p5Var = sbVar.G0;
            if (p5Var != null && (rbVar = (rb) p5Var.c) != null) {
                rbVar.setSeeking(false);
            }
            q5 t10 = sbVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        sbVar.f1 = z10;
        sbVar.P();
    }

    public final void g(boolean z10) {
        sb sbVar = this.d;
        sbVar.X0 = z10;
        sbVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        sb sbVar = this.d;
        di.j4 j4Var = sbVar.D0;
        if (j4Var != null) {
            j4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = sbVar.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        kb kbVar = sbVar.B0;
        if (kbVar != null) {
            kbVar.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        sb sbVar = this.d;
        o8 o8Var = this.a;
        if (o8Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(sbVar.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                sbVar.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (sbVar.n0.E(true)) {
                sbVar.n0.G0 = new ah.o(this, arrayList, indexOf, 3);
                return;
            } else {
                sbVar.q(false);
                return;
            }
        }
        if (sbVar.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(sbVar.n0.x0);
        int indexOf2 = sbVar.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(sbVar.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            sbVar.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (sbVar.n0.E(true)) {
            sbVar.n0.G0 = new a3.l0(this, o8Var, arrayList2, 10);
        } else {
            sbVar.q(false);
        }
    }
}
