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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class gb implements h5 {
    public final /* synthetic */ l8 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ pb d;

    public gb(pb pbVar, l8 l8Var, ArrayList arrayList, Context context) {
        this.d = pbVar;
        this.a = l8Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j3) {
        pb pbVar = this.d;
        if (pbVar.J == i10 && pbVar.I == j3) {
            return;
        }
        pbVar.I = j3;
        pbVar.J = i10;
    }

    public final void b(boolean z10) {
        pb pbVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = pbVar.f;
        if (pbVar.b) {
            if (pbVar.c) {
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
        WindowManager.LayoutParams layoutParams = pbVar.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            pbVar.n.updateViewLayout(pbVar.s, layoutParams);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, n5 n5Var) {
        long j10;
        ob obVar;
        pb pbVar = this.d;
        ArrayList arrayList = pbVar.M0;
        if (pbVar.H0 || pbVar.U < 0.9f) {
            di.l4 l4Var = pbVar.D0;
            if (l4Var != null) {
                l4Var.d(0L, null);
            }
            t1 t1Var = pbVar.A0;
            if (t1Var != null) {
                if (t1Var.n) {
                    t1Var.s(null);
                } else {
                    t1Var.e();
                }
                pbVar.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + pbVar.H0 + ", " + pbVar.U);
            n5Var.a = false;
            n5Var.c = null;
            n5Var.b = null;
            return;
        }
        Uri uri2 = pbVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (obVar = pbVar.z0) == null) {
            pbVar.F0 = uri;
            di.l4 l4Var2 = pbVar.D0;
            if (l4Var2 != null) {
                l4Var2.d(0L, null);
            }
            t1 t1Var2 = pbVar.A0;
            if (t1Var2 != null) {
                if (t1Var2.n) {
                    t1Var2.s(null);
                } else {
                    t1Var2.e();
                }
                pbVar.A0 = null;
            }
            ob obVar2 = pbVar.z0;
            if (obVar2 != null) {
                obVar2.release(null);
                pbVar.z0 = null;
            }
            n5 n5Var2 = pbVar.G0;
            if (n5Var2 != null) {
                n5Var2.c = null;
                n5Var2.b = null;
                n5Var2.a = false;
                n5Var2.e = null;
                n5Var2.f = null;
                n5Var2.d = null;
                n5Var2.b();
                pbVar.G0 = null;
            }
            if (uri != null) {
                pbVar.G0 = n5Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((ob) arrayList.get(i10)).uri.equals(uri)) {
                        pbVar.z0 = (ob) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (pbVar.z0 == null) {
                    ob obVar3 = new ob(pbVar, pbVar.C0, pbVar.B0);
                    pbVar.z0 = obVar3;
                    obVar3.document = document;
                }
                ob obVar4 = pbVar.z0;
                obVar4.uri = uri;
                obVar4.setSpeed(pb.B1);
                n5 n5Var3 = pbVar.G0;
                ob obVar5 = pbVar.z0;
                n5Var3.c = obVar5;
                n5Var3.a = false;
                n5Var3.e = pbVar.y0;
                n5Var3.f = pbVar.B0;
                n5Var3.d = pbVar.C0;
                n5Var3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(obVar5.document, 3);
                FileLoader.getInstance(pbVar.h).changePriority(3, pbVar.z0.document, null, null, null, null, null);
                if (j3 == 0) {
                    long j11 = pbVar.t1;
                    if (j11 != 0) {
                        pbVar.G0.a = true;
                        j10 = j11;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((ob) pbVar.G0.c).start(false, pbVar.w(), uri, j10, pb.D1, pb.B1);
                        pbVar.G0.b();
                    }
                }
                j10 = j3;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((ob) pbVar.G0.c).start(false, pbVar.w(), uri, j10, pb.D1, pb.B1);
                pbVar.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            pbVar.G0 = n5Var;
            n5Var.c = obVar;
            n5Var.b = null;
            obVar.setSpeed(pb.B1);
            n5 n5Var4 = pbVar.G0;
            n5Var4.a = pbVar.z0.firstFrameRendered;
            n5Var4.e = pbVar.y0;
            n5Var4.f = pbVar.B0;
            n5Var4.d = pbVar.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        pbVar.t1 = 0L;
        pbVar.P();
    }

    public final void d(float f7) {
        pb pbVar = this.d;
        if (pbVar.r0 != f7) {
            pbVar.r0 = f7;
            pbVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        ob obVar;
        pb pbVar = this.d;
        if (!pbVar.f1 && z10 && pbVar.k0) {
            pbVar.k0 = false;
            n5 n5Var = pbVar.G0;
            if (n5Var != null && (obVar = (ob) n5Var.c) != null) {
                obVar.setSeeking(false);
            }
            o5 t10 = pbVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        pbVar.f1 = z10;
        pbVar.P();
    }

    public final void g(boolean z10) {
        pb pbVar = this.d;
        pbVar.X0 = z10;
        pbVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        pb pbVar = this.d;
        di.l4 l4Var = pbVar.D0;
        if (l4Var != null) {
            l4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = pbVar.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        hb hbVar = pbVar.B0;
        if (hbVar != null) {
            hbVar.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        pb pbVar = this.d;
        l8 l8Var = this.a;
        if (l8Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(pbVar.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                pbVar.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (pbVar.n0.E(true)) {
                pbVar.n0.G0 = new ah.p(this, arrayList, indexOf, 3);
                return;
            } else {
                pbVar.q(false);
                return;
            }
        }
        if (pbVar.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(pbVar.n0.x0);
        int indexOf2 = pbVar.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(pbVar.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            pbVar.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (pbVar.n0.E(true)) {
            pbVar.n0.G0 = new a3.j0(this, l8Var, arrayList2, 10);
        } else {
            pbVar.q(false);
        }
    }
}
