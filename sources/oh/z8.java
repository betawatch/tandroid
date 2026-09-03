package oh;

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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z8 implements z3 {
    public final /* synthetic */ l6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ i9 d;

    public z8(i9 i9Var, l6 l6Var, ArrayList arrayList, Context context) {
        this.d = i9Var;
        this.a = l6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j10) {
        i9 i9Var = this.d;
        if (i9Var.G == i10 && i9Var.F == j10) {
            return;
        }
        i9Var.F = j10;
        i9Var.G = i10;
    }

    public final void b(boolean z4) {
        i9 i9Var = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = i9Var.f;
        if (i9Var.b) {
            if (i9Var.c) {
                return;
            }
            if (z4) {
                AndroidUtilities.requestAdjustNothing(p2Var.getParentActivity(), p2Var.getClassGuid());
                return;
            } else {
                AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = i9Var.r;
        layoutParams.softInputMode = z4 ? 48 : 16;
        try {
            i9Var.n.updateViewLayout(i9Var.s, layoutParams);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, e4 e4Var) {
        long j11;
        h9 h9Var;
        i9 i9Var = this.d;
        ArrayList arrayList = i9Var.J0;
        if (i9Var.E0 || i9Var.R < 0.9f) {
            qh.j3 j3Var = i9Var.A0;
            if (j3Var != null) {
                j3Var.d(0L, null);
            }
            e1 e1Var = i9Var.x0;
            if (e1Var != null) {
                if (e1Var.n) {
                    e1Var.s(null);
                } else {
                    e1Var.e();
                }
                i9Var.x0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + i9Var.E0 + ", " + i9Var.R);
            e4Var.f = false;
            e4Var.b = null;
            e4Var.a = null;
            return;
        }
        Uri uri2 = i9Var.C0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (h9Var = i9Var.w0) == null) {
            i9Var.C0 = uri;
            qh.j3 j3Var2 = i9Var.A0;
            if (j3Var2 != null) {
                j3Var2.d(0L, null);
            }
            e1 e1Var2 = i9Var.x0;
            if (e1Var2 != null) {
                if (e1Var2.n) {
                    e1Var2.s(null);
                } else {
                    e1Var2.e();
                }
                i9Var.x0 = null;
            }
            h9 h9Var2 = i9Var.w0;
            if (h9Var2 != null) {
                h9Var2.release(null);
                i9Var.w0 = null;
            }
            e4 e4Var2 = i9Var.D0;
            if (e4Var2 != null) {
                e4Var2.b = null;
                e4Var2.a = null;
                e4Var2.f = false;
                e4Var2.d = null;
                e4Var2.e = null;
                e4Var2.c = null;
                e4Var2.a();
                i9Var.D0 = null;
            }
            if (uri != null) {
                i9Var.D0 = e4Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((h9) arrayList.get(i10)).uri.equals(uri)) {
                        i9Var.w0 = (h9) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (i9Var.w0 == null) {
                    h9 h9Var3 = new h9(i9Var, i9Var.z0, i9Var.y0);
                    i9Var.w0 = h9Var3;
                    h9Var3.document = document;
                }
                h9 h9Var4 = i9Var.w0;
                h9Var4.uri = uri;
                h9Var4.setSpeed(i9.y1);
                e4 e4Var3 = i9Var.D0;
                h9 h9Var5 = i9Var.w0;
                e4Var3.b = h9Var5;
                e4Var3.f = false;
                e4Var3.d = i9Var.v0;
                e4Var3.e = i9Var.y0;
                e4Var3.c = i9Var.z0;
                e4Var3.a = null;
                FileStreamLoadOperation.setPriorityForDocument(h9Var5.document, 3);
                FileLoader.getInstance(i9Var.h).changePriority(3, i9Var.w0.document, null, null, null, null, null);
                if (j10 == 0) {
                    long j12 = i9Var.q1;
                    if (j12 != 0) {
                        i9Var.D0.f = true;
                        j11 = j12;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        i9Var.D0.b.start(false, i9Var.w(), uri, j11, i9.A1, i9.y1);
                        i9Var.D0.a();
                    }
                }
                j11 = j10;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                i9Var.D0.b.start(false, i9Var.w(), uri, j11, i9.A1, i9.y1);
                i9Var.D0.a();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            i9Var.D0 = e4Var;
            e4Var.b = h9Var;
            e4Var.a = null;
            h9Var.setSpeed(i9.y1);
            e4 e4Var4 = i9Var.D0;
            e4Var4.f = i9Var.w0.firstFrameRendered;
            e4Var4.d = i9Var.v0;
            e4Var4.e = i9Var.y0;
            e4Var4.c = i9Var.z0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        i9Var.q1 = 0L;
        i9Var.P();
    }

    public final void d(float f10) {
        i9 i9Var = this.d;
        if (i9Var.o0 != f10) {
            i9Var.o0 = f10;
            i9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.j1 = false;
    }

    public final void f(boolean z4) {
        h9 h9Var;
        i9 i9Var = this.d;
        if (!i9Var.c1 && z4 && i9Var.h0) {
            i9Var.h0 = false;
            e4 e4Var = i9Var.D0;
            if (e4Var != null && (h9Var = e4Var.b) != null) {
                h9Var.setSeeking(false);
            }
            f4 t6 = i9Var.t();
            if (t6 != null) {
                t6.invalidate();
            }
        }
        i9Var.c1 = z4;
        i9Var.P();
    }

    public final void g(boolean z4) {
        i9 i9Var = this.d;
        i9Var.U0 = z4;
        i9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z4, boolean z10) {
        i9 i9Var = this.d;
        qh.j3 j3Var = i9Var.A0;
        if (j3Var != null) {
            j3Var.setVisibility(z4 ? 0 : 8);
        }
        SurfaceView surfaceView = i9Var.z0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z4 ? 8 : z10 ? 0 : 4);
        }
        a9 a9Var = i9Var.y0;
        if (a9Var != null) {
            a9Var.setVisibility(z4 ? 8 : 0);
        }
    }

    public final void j() {
        i9 i9Var = this.d;
        l6 l6Var = this.a;
        if (l6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(i9Var.k0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                i9Var.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (i9Var.k0.E(true)) {
                i9Var.k0.D0 = new bh.a(this, arrayList, indexOf, 15);
                return;
            } else {
                i9Var.q(false);
                return;
            }
        }
        if (i9Var.k0.u0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(i9Var.k0.u0);
        int indexOf2 = i9Var.k0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(i9Var.k0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            i9Var.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (i9Var.k0.E(true)) {
            i9Var.k0.D0 = new mh.p6(this, l6Var, arrayList2, 10);
        } else {
            i9Var.q(false);
        }
    }
}
