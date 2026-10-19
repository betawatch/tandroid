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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class r9 implements j4 {
    public final /* synthetic */ a7 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ aa d;

    public r9(aa aaVar, a7 a7Var, ArrayList arrayList, Context context) {
        this.d = aaVar;
        this.a = a7Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j10) {
        aa aaVar = this.d;
        if (aaVar.J == i10 && aaVar.I == j10) {
            return;
        }
        aaVar.I = j10;
        aaVar.J = i10;
    }

    public final void b(boolean z10) {
        aa aaVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = aaVar.f;
        if (aaVar.b) {
            if (aaVar.c) {
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
        WindowManager.LayoutParams layoutParams = aaVar.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            aaVar.n.updateViewLayout(aaVar.s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, p4 p4Var) {
        long j11;
        z9 z9Var;
        aa aaVar = this.d;
        ArrayList arrayList = aaVar.M0;
        if (aaVar.H0 || aaVar.U < 0.9f) {
            ei.d4 d4Var = aaVar.D0;
            if (d4Var != null) {
                d4Var.d(0L, null);
            }
            h1 h1Var = aaVar.A0;
            if (h1Var != null) {
                if (h1Var.n) {
                    h1Var.s(null);
                } else {
                    h1Var.e();
                }
                aaVar.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + aaVar.H0 + ", " + aaVar.U);
            p4Var.a = false;
            p4Var.c = null;
            p4Var.b = null;
            return;
        }
        Uri uri2 = aaVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (z9Var = aaVar.z0) == null) {
            aaVar.F0 = uri;
            ei.d4 d4Var2 = aaVar.D0;
            if (d4Var2 != null) {
                d4Var2.d(0L, null);
            }
            h1 h1Var2 = aaVar.A0;
            if (h1Var2 != null) {
                if (h1Var2.n) {
                    h1Var2.s(null);
                } else {
                    h1Var2.e();
                }
                aaVar.A0 = null;
            }
            z9 z9Var2 = aaVar.z0;
            if (z9Var2 != null) {
                z9Var2.release(null);
                aaVar.z0 = null;
            }
            p4 p4Var2 = aaVar.G0;
            if (p4Var2 != null) {
                p4Var2.c = null;
                p4Var2.b = null;
                p4Var2.a = false;
                p4Var2.e = null;
                p4Var2.f = null;
                p4Var2.d = null;
                p4Var2.b();
                aaVar.G0 = null;
            }
            if (uri != null) {
                aaVar.G0 = p4Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((z9) arrayList.get(i10)).uri.equals(uri)) {
                        aaVar.z0 = (z9) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (aaVar.z0 == null) {
                    z9 z9Var3 = new z9(aaVar, aaVar.C0, aaVar.B0);
                    aaVar.z0 = z9Var3;
                    z9Var3.document = document;
                }
                z9 z9Var4 = aaVar.z0;
                z9Var4.uri = uri;
                z9Var4.setSpeed(aa.B1);
                p4 p4Var3 = aaVar.G0;
                z9 z9Var5 = aaVar.z0;
                p4Var3.c = z9Var5;
                p4Var3.a = false;
                p4Var3.e = aaVar.y0;
                p4Var3.f = aaVar.B0;
                p4Var3.d = aaVar.C0;
                p4Var3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(z9Var5.document, 3);
                FileLoader.getInstance(aaVar.h).changePriority(3, aaVar.z0.document, null, null, null, null, null);
                if (j10 == 0) {
                    long j12 = aaVar.t1;
                    if (j12 != 0) {
                        aaVar.G0.a = true;
                        j11 = j12;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((z9) aaVar.G0.c).start(false, aaVar.w(), uri, j11, aa.D1, aa.B1);
                        aaVar.G0.b();
                    }
                }
                j11 = j10;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((z9) aaVar.G0.c).start(false, aaVar.w(), uri, j11, aa.D1, aa.B1);
                aaVar.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            aaVar.G0 = p4Var;
            p4Var.c = z9Var;
            p4Var.b = null;
            z9Var.setSpeed(aa.B1);
            p4 p4Var4 = aaVar.G0;
            p4Var4.a = aaVar.z0.firstFrameRendered;
            p4Var4.e = aaVar.y0;
            p4Var4.f = aaVar.B0;
            p4Var4.d = aaVar.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        aaVar.t1 = 0L;
        aaVar.P();
    }

    public final void d(float f7) {
        aa aaVar = this.d;
        if (aaVar.r0 != f7) {
            aaVar.r0 = f7;
            aaVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        z9 z9Var;
        aa aaVar = this.d;
        if (!aaVar.f1 && z10 && aaVar.k0) {
            aaVar.k0 = false;
            p4 p4Var = aaVar.G0;
            if (p4Var != null && (z9Var = (z9) p4Var.c) != null) {
                z9Var.setSeeking(false);
            }
            q4 t10 = aaVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        aaVar.f1 = z10;
        aaVar.P();
    }

    public final void g(boolean z10) {
        aa aaVar = this.d;
        aaVar.X0 = z10;
        aaVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        aa aaVar = this.d;
        ei.d4 d4Var = aaVar.D0;
        if (d4Var != null) {
            d4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = aaVar.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        s9 s9Var = aaVar.B0;
        if (s9Var != null) {
            s9Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        aa aaVar = this.d;
        a7 a7Var = this.a;
        if (a7Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(aaVar.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                aaVar.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (aaVar.n0.E(true)) {
                aaVar.n0.G0 = new ah.o(this, arrayList, indexOf, 7);
                return;
            } else {
                aaVar.q(false);
                return;
            }
        }
        if (aaVar.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(aaVar.n0.x0);
        int indexOf2 = aaVar.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(aaVar.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            aaVar.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (aaVar.n0.E(true)) {
            aaVar.n0.G0 = new a3.l0(this, a7Var, arrayList2, 25);
        } else {
            aaVar.q(false);
        }
    }
}
