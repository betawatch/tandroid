package jh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z8 implements y3 {
    public final /* synthetic */ j6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ i9 d;

    public z8(i9 i9Var, j6 j6Var, ArrayList arrayList, Context context) {
        this.d = i9Var;
        this.a = j6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j10) {
        i9 i9Var = this.d;
        if (i9Var.F == i10 && i9Var.E == j10) {
            return;
        }
        i9Var.E = j10;
        i9Var.F = i10;
    }

    public final void b(boolean z10) {
        i9 i9Var = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = i9Var.f;
        if (i9Var.b) {
            if (i9Var.c) {
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
        WindowManager.LayoutParams layoutParams = i9Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            i9Var.n.updateViewLayout(i9Var.s, layoutParams);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, d4 d4Var) {
        long j11;
        h9 h9Var;
        i9 i9Var = this.d;
        ArrayList arrayList = i9Var.I0;
        if (i9Var.D0 || i9Var.Q < 0.9f) {
            lh.c4 c4Var = i9Var.z0;
            if (c4Var != null) {
                c4Var.d(0L, null);
            }
            d1 d1Var = i9Var.w0;
            if (d1Var != null) {
                if (d1Var.n) {
                    d1Var.s(null);
                } else {
                    d1Var.e();
                }
                i9Var.w0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + i9Var.D0 + ", " + i9Var.Q);
            d4Var.f = false;
            d4Var.b = null;
            d4Var.a = null;
            return;
        }
        Uri uri2 = i9Var.B0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (h9Var = i9Var.v0) == null) {
            i9Var.B0 = uri;
            lh.c4 c4Var2 = i9Var.z0;
            if (c4Var2 != null) {
                c4Var2.d(0L, null);
            }
            d1 d1Var2 = i9Var.w0;
            if (d1Var2 != null) {
                if (d1Var2.n) {
                    d1Var2.s(null);
                } else {
                    d1Var2.e();
                }
                i9Var.w0 = null;
            }
            h9 h9Var2 = i9Var.v0;
            if (h9Var2 != null) {
                h9Var2.release(null);
                i9Var.v0 = null;
            }
            d4 d4Var2 = i9Var.C0;
            if (d4Var2 != null) {
                d4Var2.b = null;
                d4Var2.a = null;
                d4Var2.f = false;
                d4Var2.d = null;
                d4Var2.e = null;
                d4Var2.c = null;
                d4Var2.a();
                i9Var.C0 = null;
            }
            if (uri != null) {
                i9Var.C0 = d4Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((h9) arrayList.get(i10)).uri.equals(uri)) {
                        i9Var.v0 = (h9) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (i9Var.v0 == null) {
                    h9 h9Var3 = new h9(i9Var, i9Var.y0, i9Var.x0);
                    i9Var.v0 = h9Var3;
                    h9Var3.document = document;
                }
                h9 h9Var4 = i9Var.v0;
                h9Var4.uri = uri;
                h9Var4.setSpeed(i9.x1);
                d4 d4Var3 = i9Var.C0;
                h9 h9Var5 = i9Var.v0;
                d4Var3.b = h9Var5;
                d4Var3.f = false;
                d4Var3.d = i9Var.u0;
                d4Var3.e = i9Var.x0;
                d4Var3.c = i9Var.y0;
                d4Var3.a = null;
                FileStreamLoadOperation.setPriorityForDocument(h9Var5.document, 3);
                FileLoader.getInstance(i9Var.h).changePriority(3, i9Var.v0.document, null, null, null, null, null);
                if (j10 == 0) {
                    long j12 = i9Var.p1;
                    if (j12 != 0) {
                        i9Var.C0.f = true;
                        j11 = j12;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        i9Var.C0.b.start(false, i9Var.w(), uri, j11, i9.z1, i9.x1);
                        i9Var.C0.a();
                    }
                }
                j11 = j10;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                i9Var.C0.b.start(false, i9Var.w(), uri, j11, i9.z1, i9.x1);
                i9Var.C0.a();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            i9Var.C0 = d4Var;
            d4Var.b = h9Var;
            d4Var.a = null;
            h9Var.setSpeed(i9.x1);
            d4 d4Var4 = i9Var.C0;
            d4Var4.f = i9Var.v0.firstFrameRendered;
            d4Var4.d = i9Var.u0;
            d4Var4.e = i9Var.x0;
            d4Var4.c = i9Var.y0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        i9Var.p1 = 0L;
        i9Var.P();
    }

    public final void d(float f10) {
        i9 i9Var = this.d;
        if (i9Var.n0 != f10) {
            i9Var.n0 = f10;
            i9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.i1 = false;
    }

    public final void f(boolean z10) {
        h9 h9Var;
        i9 i9Var = this.d;
        if (!i9Var.b1 && z10 && i9Var.g0) {
            i9Var.g0 = false;
            d4 d4Var = i9Var.C0;
            if (d4Var != null && (h9Var = d4Var.b) != null) {
                h9Var.setSeeking(false);
            }
            e4 t10 = i9Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        i9Var.b1 = z10;
        i9Var.P();
    }

    public final void g(boolean z10) {
        i9 i9Var = this.d;
        i9Var.T0 = z10;
        i9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        i9 i9Var = this.d;
        lh.c4 c4Var = i9Var.z0;
        if (c4Var != null) {
            c4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = i9Var.y0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        a9 a9Var = i9Var.x0;
        if (a9Var != null) {
            a9Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        i9 i9Var = this.d;
        j6 j6Var = this.a;
        if (j6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(i9Var.j0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                i9Var.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (i9Var.j0.E(true)) {
                i9Var.j0.C0 = new d5.i(this, arrayList, indexOf, 10);
                return;
            } else {
                i9Var.q(false);
                return;
            }
        }
        if (i9Var.j0.t0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(i9Var.j0.t0);
        int indexOf2 = i9Var.j0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(i9Var.j0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            i9Var.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (i9Var.j0.E(true)) {
            i9Var.j0.C0 = new j3.m(this, j6Var, arrayList2, 8);
        } else {
            i9Var.q(false);
        }
    }
}
