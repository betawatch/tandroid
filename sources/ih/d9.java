package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d9 implements c4 {
    public final /* synthetic */ n6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ m9 d;

    public d9(m9 m9Var, n6 n6Var, ArrayList arrayList, Context context) {
        this.d = m9Var;
        this.a = n6Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i9, long j10) {
        m9 m9Var = this.d;
        if (m9Var.F == i9 && m9Var.E == j10) {
            return;
        }
        m9Var.E = j10;
        m9Var.F = i9;
    }

    public final void b(boolean z10) {
        m9 m9Var = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = m9Var.f;
        if (m9Var.b) {
            if (m9Var.c) {
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
        WindowManager.LayoutParams layoutParams = m9Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            m9Var.n.updateViewLayout(m9Var.s, layoutParams);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, h4 h4Var) {
        long j11;
        l9 l9Var;
        m9 m9Var = this.d;
        ArrayList arrayList = m9Var.I0;
        if (m9Var.D0 || m9Var.Q < 0.9f) {
            kh.d4 d4Var = m9Var.z0;
            if (d4Var != null) {
                d4Var.d(0L, null);
            }
            f1 f1Var = m9Var.w0;
            if (f1Var != null) {
                if (f1Var.n) {
                    f1Var.s(null);
                } else {
                    f1Var.e();
                }
                m9Var.w0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + m9Var.D0 + ", " + m9Var.Q);
            h4Var.f = false;
            h4Var.b = null;
            h4Var.a = null;
            return;
        }
        Uri uri2 = m9Var.B0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (l9Var = m9Var.v0) == null) {
            m9Var.B0 = uri;
            kh.d4 d4Var2 = m9Var.z0;
            if (d4Var2 != null) {
                d4Var2.d(0L, null);
            }
            f1 f1Var2 = m9Var.w0;
            if (f1Var2 != null) {
                if (f1Var2.n) {
                    f1Var2.s(null);
                } else {
                    f1Var2.e();
                }
                m9Var.w0 = null;
            }
            l9 l9Var2 = m9Var.v0;
            if (l9Var2 != null) {
                l9Var2.release(null);
                m9Var.v0 = null;
            }
            h4 h4Var2 = m9Var.C0;
            if (h4Var2 != null) {
                h4Var2.b = null;
                h4Var2.a = null;
                h4Var2.f = false;
                h4Var2.d = null;
                h4Var2.e = null;
                h4Var2.c = null;
                h4Var2.a();
                m9Var.C0 = null;
            }
            if (uri != null) {
                m9Var.C0 = h4Var;
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList.size()) {
                        break;
                    }
                    if (((l9) arrayList.get(i9)).uri.equals(uri)) {
                        m9Var.v0 = (l9) arrayList.remove(i9);
                        break;
                    }
                    i9++;
                }
                if (m9Var.v0 == null) {
                    l9 l9Var3 = new l9(m9Var, m9Var.y0, m9Var.x0);
                    m9Var.v0 = l9Var3;
                    l9Var3.document = document;
                }
                l9 l9Var4 = m9Var.v0;
                l9Var4.uri = uri;
                l9Var4.setSpeed(m9.x1);
                h4 h4Var3 = m9Var.C0;
                l9 l9Var5 = m9Var.v0;
                h4Var3.b = l9Var5;
                h4Var3.f = false;
                h4Var3.d = m9Var.u0;
                h4Var3.e = m9Var.x0;
                h4Var3.c = m9Var.y0;
                h4Var3.a = null;
                FileStreamLoadOperation.setPriorityForDocument(l9Var5.document, 3);
                FileLoader.getInstance(m9Var.h).changePriority(3, m9Var.v0.document, null, null, null, null, null);
                if (j10 == 0) {
                    long j12 = m9Var.p1;
                    if (j12 != 0) {
                        m9Var.C0.f = true;
                        j11 = j12;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        m9Var.C0.b.start(false, m9Var.w(), uri, j11, m9.z1, m9.x1);
                        m9Var.C0.a();
                    }
                }
                j11 = j10;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                m9Var.C0.b.start(false, m9Var.w(), uri, j11, m9.z1, m9.x1);
                m9Var.C0.a();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            m9Var.C0 = h4Var;
            h4Var.b = l9Var;
            h4Var.a = null;
            l9Var.setSpeed(m9.x1);
            h4 h4Var4 = m9Var.C0;
            h4Var4.f = m9Var.v0.firstFrameRendered;
            h4Var4.d = m9Var.u0;
            h4Var4.e = m9Var.x0;
            h4Var4.c = m9Var.y0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        m9Var.p1 = 0L;
        m9Var.P();
    }

    public final void d(float f10) {
        m9 m9Var = this.d;
        if (m9Var.n0 != f10) {
            m9Var.n0 = f10;
            m9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.i1 = false;
    }

    public final void f(boolean z10) {
        l9 l9Var;
        m9 m9Var = this.d;
        if (!m9Var.b1 && z10 && m9Var.g0) {
            m9Var.g0 = false;
            h4 h4Var = m9Var.C0;
            if (h4Var != null && (l9Var = h4Var.b) != null) {
                l9Var.setSeeking(false);
            }
            i4 t10 = m9Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        m9Var.b1 = z10;
        m9Var.P();
    }

    public final void g(boolean z10) {
        m9 m9Var = this.d;
        m9Var.T0 = z10;
        m9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        m9 m9Var = this.d;
        kh.d4 d4Var = m9Var.z0;
        if (d4Var != null) {
            d4Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = m9Var.y0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        e9 e9Var = m9Var.x0;
        if (e9Var != null) {
            e9Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        m9 m9Var = this.d;
        n6 n6Var = this.a;
        if (n6Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(m9Var.j0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                m9Var.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (m9Var.j0.E(true)) {
                m9Var.j0.C0 = new d5.i(this, arrayList, indexOf, 10);
                return;
            } else {
                m9Var.q(false);
                return;
            }
        }
        if (m9Var.j0.t0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(m9Var.j0.t0);
        int indexOf2 = m9Var.j0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(m9Var.j0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            m9Var.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (m9Var.j0.E(true)) {
            m9Var.j0.C0 = new h3(this, n6Var, arrayList2, 6);
        } else {
            m9Var.q(false);
        }
    }
}
