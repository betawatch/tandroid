package di;

import a8.ra;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import bi.ab;
import bi.eb;
import bi.md;
import c8.ha;
import c8.zc;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zs;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p9 implements ls, org.telegram.ui.ActionBar.b2 {
    public static boolean C1;
    public static boolean w1;
    public static TL_stories.StoryItem y1;
    public static boolean z1;
    public g1 A0;
    public h9 B0;
    public SurfaceView C0;
    public fi.s3 D0;
    public boolean E;
    public Uri E0;
    public ValueAnimator F;
    public h4 F0;
    public ValueAnimator G;
    public boolean G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public final h2.f I0;
    public int J;
    public boolean J0;
    public float K;
    public boolean K0;
    public float L;
    public final ArrayList L0;
    public e7 M;
    public boolean M0;
    public float N;
    public q6 N0;
    public float O;
    public int O0;
    public float P;
    public TL_stories.PeerStories P0;
    public float Q;
    public boolean Q0;
    public float R;
    public boolean R0;
    public float S;
    public TL_stories.StoryItem S0;
    public int T0;
    public float U;
    public boolean U0;
    public float V;
    public int[] V0;
    public float W;
    public boolean W0;
    public float X;
    public boolean X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public boolean a0;
    public final l3 a1;
    public float b0;
    public boolean b1;
    public boolean c0;
    public y7 c1;
    public float d0;
    public final LongSparseIntArray d1;
    public float e0;
    public boolean e1;
    public final org.telegram.ui.ActionBar.f2 f;
    public boolean f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public int h;
    public boolean h0;
    public boolean h1;
    public GestureDetector i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public boolean l0;
    public boolean l1;
    public boolean m0;
    public s7 m1;
    public WindowManager n;
    public f9 n0;
    public l3 n1;
    public boolean o1;
    public int p0;
    public float p1;
    public boolean q0;
    public boolean q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public d9 s;
    public final m9 s0;
    public long s1;
    public l9 t0;
    public c7 t1;
    public Dialog u0;
    public ValueAnimator u1;
    public org.telegram.ui.ActionBar.b2 v0;
    public boolean v1;
    public e9 w;
    public boolean w0;
    public s5 x;
    public final ArrayList x0;
    public boolean y;
    public org.telegram.ui.j4 y0;
    public o9 z0;
    public static final ArrayList x1 = new ArrayList();
    public static float A1 = 1.0f;
    public static boolean B1 = true;
    public static final LongSparseArray D1 = new LongSparseArray();
    public boolean a = iz.b0;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b D = new b();
    public final RectF T = new RectF();
    public final float[] o0 = new float[2];

    public p9(org.telegram.ui.ActionBar.f2 f2Var) {
        m9 m9Var = new m9();
        m9Var.k = 1.0f;
        this.s0 = m9Var;
        this.x0 = new ArrayList();
        this.G0 = true;
        this.I0 = new h2.f((int[]) null);
        this.L0 = new ArrayList();
        this.Y0 = false;
        this.a1 = new l3(this, 4);
        this.d1 = new LongSparseIntArray();
        new Paint(1);
        this.f = f2Var;
    }

    public static CharSequence A(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) D1.get(j3 + (j3 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean D(ij ijVar) {
        return y1 != null && (ijVar.D == 23 || ijVar.a5()) && !z1 && y1.messageId == ijVar.f1() && y1.messageType != 3;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 == 0 || storyItem == null) {
            return;
        }
        D1.put(j3 + (j3 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean c(p9 p9Var, d9 d9Var, float f10, float f11, boolean z9) {
        o2 o2Var;
        o2 o2Var2;
        if (d9Var == null) {
            return false;
        }
        if (p9Var.W0) {
            return true;
        }
        if (p9Var.x != null && p9Var.e0 != 0.0f) {
            return true;
        }
        i4 currentPeerView = p9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.E0(currentPeerView, ((f10 - p9Var.w.getX()) - p9Var.n0.getX()) - currentPeerView.getX(), ((f11 - p9Var.w.getY()) - p9Var.n0.getY()) - currentPeerView.getY(), z9)) {
                return true;
            }
            if (currentPeerView.e2) {
                return false;
            }
        }
        if (z9) {
            return false;
        }
        if (currentPeerView != null && (o2Var2 = currentPeerView.K1) != null && o2Var2.getVisibility() == 0) {
            if (f11 > currentPeerView.K1.getY() + currentPeerView.getY() + p9Var.n0.getY() + p9Var.w.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (o2Var = currentPeerView.K1) == null || !o2Var.v0()) && p9Var.t1 == null) {
            return org.telegram.messenger.g0.Y(d9Var, f10, f11, currentPeerView);
        }
        return true;
    }

    public static void g(p9 p9Var) {
        md mdVar;
        zs editField;
        i4 currentPeerView = p9Var.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.K1 == null || (((mdVar = currentPeerView.K2) != null && mdVar.getVisibility() == 0) || (editField = currentPeerView.K1.getEditField()) == null)) {
            p9Var.m();
            return;
        }
        editField.requestFocus();
        org.telegram.messenger.g0.K3(editField);
        org.telegram.messenger.g0.i3(new l3(p9Var, 6), 200L);
    }

    public static void i(p9 p9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(p9Var.X, p9Var.W) / org.telegram.messenger.g0.L(80.0f)));
        if (p9Var.V != l10) {
            p9Var.V = l10;
            p9Var.q();
            i4 currentPeerView = p9Var.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.g2) {
                currentPeerView.invalidate();
            }
            g1 g1Var = p9Var.A0;
            if (g1Var != null) {
                g1Var.v((1.0f - p9Var.V) * p9Var.U);
            }
        }
        d9 d9Var = p9Var.s;
        if (d9Var != null) {
            d9Var.invalidate();
        }
    }

    public final void B() {
        if (this.m0) {
            org.telegram.messenger.g0.v1(this.s);
            this.G0 = true;
            this.J0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            V();
            this.O = 0.0f;
            this.N = 0.0f;
            m9 m9Var = this.s0;
            ImageReceiver imageReceiver = m9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = m9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            m9Var.c = null;
            m9Var.b = null;
            e9 e9Var = this.w;
            if (e9Var != null) {
                e9Var.a(true);
            }
            this.I0.e();
            h4 h4Var = this.F0;
            if (h4Var != null) {
                h4Var.b();
            }
            O();
            if (this.b) {
                org.telegram.messenger.g0.E2(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            v();
            this.m0 = false;
            this.d = false;
            q();
            l3 l3Var = this.n1;
            if (l3Var != null) {
                l3Var.run();
                this.n1 = null;
            }
        }
    }

    public final boolean C() {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (this.W0 || this.Y0 || this.X0 || this.K0 || this.q0 || this.y || this.u0 != null || this.v0 != null || this.G0 || this.H0 || this.U != 1.0f || this.e0 != 0.0f || this.h1) {
            return true;
        }
        if ((this.k1 && this.a) || this.j1 || this.i1 || this.o1 || this.V != 0.0f || this.t1 != null) {
            return true;
        }
        return (!this.b || (f2Var = this.f) == null || f2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        TL_stories.StoryItem storyItem;
        i4 currentPeerView;
        int selectedPosition;
        this.d = true;
        m9 m9Var = this.s0;
        ImageReceiver imageReceiver = m9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = m9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            m9Var.c.O0(true, true);
        }
        if (this.N0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.N0.i.size()) {
            this.T0 = ((ij) this.N0.i.get(selectedPosition)).f1();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i7 = this.T0;
            if (this.N0 instanceof t6) {
                i4 currentPeerView2 = this.n0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.e1;
                    if (selectedPosition2 >= 0 && selectedPosition2 < arrayList.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList.get(selectedPosition2);
                        if (storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i7 = storyItem.id;
                        }
                    }
                }
                storyItem = null;
                if (storyItem != null) {
                }
            }
            this.t0.e(currentDialogId, i7, new l3(this, 5));
        }
    }

    public final void F(boolean z9) {
        Activity W = org.telegram.messenger.g0.W(this.f.getContext());
        if (W != null) {
            try {
                W.setRequestedOrientation(z9 ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z9) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void G(int i7, Context context, TL_stories.StoryItem storyItem, l9 l9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i7;
        if (storyItem.dialogId <= 0 || qp.s1(i7).a2(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || qp.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                H(i7, context, storyItem, arrayList, 0, null, null, l9Var, false);
            }
        }
    }

    public final void H(int i7, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, q6 q6Var, TL_stories.PeerStories peerStories, l9 l9Var, boolean z9) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E1 = org.telegram.messenger.g0.E1(context);
        ArrayList arrayList2 = this.x0;
        if (!E1) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (this.m0) {
            arrayList2.clear();
            return;
        }
        A1 = 1.0f;
        o9 o9Var = this.z0;
        if (o9Var != null) {
            o9Var.setSpeed(1.0f);
        }
        int i11 = 1;
        boolean z10 = (org.telegram.messenger.g0.Q1() || this.q1) ? false : true;
        this.b = z10;
        this.a = iz.b0 && z10;
        this.T0 = storyItem == null ? 0 : storyItem.messageId;
        this.M0 = storyItem != null && q6Var == null && peerStories == null;
        this.R0 = false;
        if (storyItem != null) {
            this.S0 = storyItem;
            y1 = storyItem;
        }
        this.N0 = q6Var;
        this.P0 = peerStories;
        this.t0 = l9Var;
        this.Q0 = z9;
        this.h = i7;
        this.W = 0.0f;
        this.X = 0.0f;
        f9 f9Var = this.n0;
        if (f9Var != null) {
            f9Var.setHorizontalProgressToDismiss(0.0f);
            this.n0.F0 = 0;
        }
        this.d0 = 0.0f;
        this.Z = 0.0f;
        this.l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.Z0 = false;
        this.Y0 = false;
        this.d1.clear();
        org.telegram.messenger.g0.r(this.a1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.g0.m(layoutParams);
        this.r.flags = -2147417728;
        this.G0 = false;
        this.b1 = false;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (this.s == null) {
            this.i0 = new GestureDetector(new z8(this));
            this.s = new d9(this, context, Q);
        }
        if (this.w == null) {
            this.w = new e9(context, this);
            f9 f9Var2 = new f9(this, this.h, context, this, this.D);
            this.n0 = f9Var2;
            f9Var2.setDelegate(new g9(this, q6Var, arrayList, context));
            this.w.addView(this.n0, ha.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.j4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                h9 h9Var = new h9(context, this);
                this.B0 = h9Var;
                this.y0.addView(h9Var);
            }
            fi.s3 s3Var = new fi.s3(context, this.h);
            this.D0 = s3Var;
            s3Var.setVisibility(8);
            this.y0.addView(this.D0);
            y7 y7Var = new y7(context);
            Paint paint = new Paint(1);
            y7Var.a = paint;
            y7Var.c = new ra(y7Var, 22);
            y7Var.d = new org.telegram.ui.Components.w5(y7Var);
            y7Var.e = new org.telegram.ui.Components.w5(y7Var);
            paint.setColor(-1);
            this.c1 = y7Var;
            this.w.addView(y7Var, ha.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        fi.s3 s3Var2 = this.D0;
        if (s3Var2 != null) {
            s3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.y0);
        this.s.addView(this.y0);
        SurfaceView surfaceView2 = this.C0;
        int i12 = 4;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.w);
        this.s.addView(this.w);
        this.s.setClipChildren(false);
        if (this.M0) {
            W();
        }
        if (q6Var != null) {
            this.n0.D(this.h, q6Var.d, q6Var.h());
        } else {
            f9 f9Var3 = this.n0;
            int i13 = this.h;
            f9Var3.A0 = arrayList;
            f9Var3.y0 = i13;
            f9Var3.setAdapter(null);
            f9Var3.setAdapter(f9Var3.z0);
            f9Var3.setCurrentItem(i10);
            f9Var3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && Q != null && Q.isSupportEdgeToEdge();
        e9 e9Var = this.w;
        q4 q4Var = new q4(this, i12);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(e9Var, q4Var);
        if (this.b) {
            org.telegram.messenger.g0.E2(this.s);
            this.s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            Q.getLayoutContainer().addView(this.s);
            if (!this.c) {
                org.telegram.messenger.g0.a3(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.s.setFocusable(false);
            this.w.setFocusable(false);
            this.w.setSystemUiVisibility(1792);
            org.telegram.messenger.g0.y3(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, i11));
            }
        }
        this.s.requestLayout();
        z1 = true;
        W();
        this.U = 0.0f;
        q();
        w1 = true;
        if (B1) {
            B1 = false;
            C1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            F(true);
        }
        if (!this.b) {
            x1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void I(Context context, int i7, q6 q6Var, h7 h7Var) {
        this.h = p10.s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(q6Var.d));
        this.O0 = i7;
        M(context, null, arrayList, 0, q6Var, null, h7Var, false);
    }

    public final void J(Context context, long j3, l9 l9Var) {
        this.h = p10.s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        y6 P1 = qp.s1(this.h).P1();
        int i7 = P1.a;
        TL_stories.PeerStories y10 = P1.y(j3);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (r7.w(i7, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !P1.L(j3)) {
                P1.g.remove(y10);
                P1.h.remove(y10);
                qs.f(i7).k(qs.v5, new Object[0]);
            }
        }
        M(context, null, arrayList, 0, null, null, l9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, l9 l9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = p10.s0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
        M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, l9Var, false);
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, h7 h7Var) {
        G(p10.s0, context, storyItem, h7Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, q6 q6Var, TL_stories.PeerStories peerStories, l9 l9Var, boolean z9) {
        H(p10.s0, context, storyItem, arrayList, i7, q6Var, peerStories, l9Var, z9);
    }

    public final void N(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.b) {
            Q.presentFragment(f2Var);
        } else {
            Q.presentFragment(f2Var);
            u(false);
        }
    }

    public final void O() {
        ArrayList arrayList;
        this.E0 = null;
        Q(false);
        l(true);
        o9 o9Var = this.z0;
        if (o9Var != null) {
            o9Var.release(null);
            this.z0 = null;
        }
        fi.s3 s3Var = this.D0;
        if (s3Var != null) {
            s3Var.b(0L, null);
        }
        g1 g1Var = this.A0;
        if (g1Var != null && !i1.a(g1Var)) {
            g1 g1Var2 = this.A0;
            if (g1Var2.n) {
                g1Var2.s(null);
            } else {
                g1Var2.e();
            }
        }
        this.A0 = null;
        i1 i1Var = i1.w;
        if (i1Var != null && i1Var.c == this) {
            i1Var.c = null;
            ab abVar = i1Var.n;
            LaunchActivity launchActivity = i1Var.r;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.Z0.remove(abVar);
                }
                i1Var.r = null;
            }
            ti.o oVar = i1Var.a;
            if (oVar != null && oVar.d()) {
                ti.o oVar2 = i1Var.a;
                if (oVar2.c == 0) {
                    i1Var.a = null;
                    i1Var.b = null;
                    oVar2.f();
                }
            }
        }
        int i7 = 0;
        while (true) {
            arrayList = this.L0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((o9) arrayList.get(i7)).release(null);
            i7++;
        }
        arrayList.clear();
        a0.h hVar = qp.s1(this.h).P1().m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((y9) hVar.n(i10)).b(false);
        }
        if (this.b) {
            F(false);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.removeSheet(this);
        }
        x1.remove(this);
        this.x0.clear();
        this.e0 = 0.0f;
        y1 = null;
    }

    public final void Q(boolean z9) {
        this.q0 = z9;
        if (z9) {
            ra raVar = this.c1.c;
            org.telegram.messenger.g0.r(raVar);
            raVar.run();
        }
        V();
    }

    public final void R(boolean z9) {
        i4 currentPeerView;
        i4 currentPeerView2;
        g4 g4Var;
        o9 o9Var;
        h4 h4Var;
        if (this.Z0 != z9) {
            this.Z0 = z9;
            if (z9 && !this.e1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (g4Var = currentPeerView2.x1) != null && !g4Var.f && g4Var.b == null) {
                if (!this.k0 && !this.j0 && (h4Var = this.F0) != null && ((o9) h4Var.c) != null) {
                    currentPeerView2.L0.invalidate();
                    org.telegram.messenger.p2.e.a();
                }
                h4 h4Var2 = this.F0;
                if (h4Var2 != null && (o9Var = (o9) h4Var2.c) != null && !this.k0) {
                    o9Var.setSeeking(true);
                }
                this.k0 = true;
            }
            V();
            f9 f9Var = this.n0;
            if (f9Var == null || (currentPeerView = f9Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.Z0);
        }
    }

    public final void S(boolean z9) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z9) {
            Window window = launchActivity.getWindow();
            Typeface typeface = org.telegram.messenger.g0.a;
            this.w0 = Build.VERSION.SDK_INT >= 26 ? zc.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        }
        if (this.w0) {
            org.telegram.messenger.g0.m3(launchActivity, !z9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        org.telegram.ui.ActionBar.f2 f2Var;
        Activity W;
        h4 h4Var;
        if (this.A0 == null || (f2Var = this.f) == null || this.D0 == null || (W = org.telegram.messenger.g0.W(f2Var.getContext())) == null) {
            return;
        }
        g1 g1Var = this.A0;
        Bitmap bitmap = this.D0.getBitmap();
        if (i1.w == null) {
            i1.w = new i1();
        }
        i1 i1Var = i1.w;
        ti.o oVar = i1Var.a;
        if (oVar != null && oVar.d()) {
            ti.o oVar2 = i1Var.a;
            if (oVar2.c != 0) {
                if (i1Var.b != g1Var) {
                    oVar2.b();
                }
                this.A0 = null;
                h4Var = this.F0;
                if (h4Var != null) {
                    h4Var.b = null;
                }
                this.D0.b(0L, null);
                u(true);
            }
        }
        i1Var.c = this;
        i1Var.b = g1Var;
        ti.o oVar3 = i1Var.a;
        if (oVar3 == null || !oVar3.d()) {
            i1Var.a = l2.i.d().k(i1Var);
        }
        ti.p g10 = i1Var.a.g(W, bitmap, true);
        if (g10 == null) {
            return;
        }
        org.telegram.ui.Components.voip.q0 q0Var = new org.telegram.ui.Components.voip.q0(g10);
        i1Var.e = q0Var;
        i1Var.d.a = q0Var;
        g1Var.s(i1Var.d);
        g1Var.v(1.0f);
        String str = "floating, call " + g1Var.g();
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("live story pip: " + str);
        }
        this.A0 = null;
        h4Var = this.F0;
        if (h4Var != null) {
        }
        this.D0.b(0L, null);
        u(true);
    }

    public final void U() {
        boolean z9 = C1;
        C1 = !z9;
        o9 o9Var = this.z0;
        int i7 = 0;
        if (o9Var != null) {
            o9Var.setAudioEnabled(z9, false);
        }
        while (true) {
            ArrayList arrayList = this.L0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((o9) arrayList.get(i7)).setAudioEnabled(!C1, true);
            i7++;
        }
        i4 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.g1.a(C1, true);
        }
        if (C1) {
            return;
        }
        this.c1.b();
    }

    public final void V() {
        if (this.n0 == null) {
            return;
        }
        boolean C = C();
        if (this.b) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f;
            if (f2Var.isPaused() || !f2Var.isLastFragment()) {
                C = true;
            }
        }
        if (org.telegram.ui.g4.v().V) {
            C = true;
        }
        this.n0.setPaused(C);
        o9 o9Var = this.z0;
        if (o9Var != null) {
            if (C) {
                o9Var.pause();
            } else {
                o9Var.play(A1);
            }
        }
        this.n0.D0 = (this.y || this.G0 || this.H0 || this.Z0 || this.e1 || this.e0 != 0.0f || this.i1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        int i7;
        TL_stories.StoryItem storyItem;
        q6 q6Var;
        long j3;
        int i10;
        if (this.t0 == null) {
            this.U0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        m9 m9Var = this.s0;
        ImageReceiver imageReceiver = m9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = m9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            m9Var.c.O0(true, true);
        }
        i4 currentPeerView = this.n0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.e1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i7 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.e1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.M0) {
                            storyItem = this.S0;
                        }
                        long currentDialogId = this.n0.getCurrentDialogId();
                        q6Var = this.N0;
                        if (!(q6Var instanceof k6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i7 = storyItem.messageId;
                        } else if (!(q6Var instanceof t6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i7 = storyItem.id;
                        } else if (q6Var != null) {
                            i7 = this.O0;
                        }
                        j3 = currentDialogId;
                        i10 = i7;
                        m9Var.a = null;
                        m9Var.m = null;
                        m9Var.b = null;
                        m9Var.c = null;
                        m9Var.e = null;
                        m9Var.f = null;
                        m9Var.g = null;
                        m9Var.d = null;
                        m9Var.l = null;
                        m9Var.h = 0.0f;
                        m9Var.i = 0.0f;
                        m9Var.o = 0;
                        m9Var.j = null;
                        m9Var.k = 1.0f;
                        if (!this.t0.o(j3, this.T0, i10, storyItem == null ? -1 : storyItem.messageType, m9Var)) {
                            this.U0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        m9Var.o = i10;
                        View view = m9Var.a;
                        if (view == null) {
                            this.U0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = m9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f10 = iArr[0];
                        this.K = f10;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = m9Var.a;
                        if (callback instanceof e7) {
                            this.M = (e7) callback;
                        } else {
                            this.M = null;
                        }
                        this.U0 = false;
                        ImageReceiver imageReceiver3 = m9Var.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.r() + f10;
                            this.O = m9Var.b.s() + iArr[1];
                            ImageReceiver imageReceiver4 = m9Var.b;
                            float f11 = imageReceiver4.M0;
                            this.R = f11;
                            this.S = imageReceiver4.N0;
                            n7 n7Var = m9Var.m;
                            if (n7Var != null) {
                                this.R = n7Var.b() * f11;
                                this.S = m9Var.m.b() * this.S;
                            }
                            if (m9Var.a.getParent() instanceof View) {
                                View view3 = (View) m9Var.a.getParent();
                                this.N = (view3.getScaleX() * m9Var.b.r()) + iArr[0];
                                this.O = (view3.getScaleY() * m9Var.b.s()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.U0 = true;
                        } else {
                            ImageReceiver imageReceiver5 = m9Var.c;
                            if (imageReceiver5 != null) {
                                this.N = imageReceiver5.r() + f10;
                                this.O = m9Var.c.s() + iArr[1];
                                ImageReceiver imageReceiver6 = m9Var.c;
                                this.R = imageReceiver6.M0;
                                this.S = imageReceiver6.N0;
                                this.V0 = imageReceiver6.W0;
                            }
                        }
                        m9Var.g.getLocationOnScreen(iArr);
                        float f12 = m9Var.h;
                        if (f12 == 0.0f && m9Var.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f13 = iArr[1];
                            this.P = f12 + f13;
                            this.Q = f13 + m9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.S0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                q6Var = this.N0;
                if (!(q6Var instanceof k6)) {
                }
                if (!(q6Var instanceof t6)) {
                }
                if (q6Var != null) {
                }
                j3 = currentDialogId2;
                i10 = i7;
                m9Var.a = null;
                m9Var.m = null;
                m9Var.b = null;
                m9Var.c = null;
                m9Var.e = null;
                m9Var.f = null;
                m9Var.g = null;
                m9Var.d = null;
                m9Var.l = null;
                m9Var.h = 0.0f;
                m9Var.i = 0.0f;
                m9Var.o = 0;
                m9Var.j = null;
                m9Var.k = 1.0f;
                if (!this.t0.o(j3, this.T0, i10, storyItem == null ? -1 : storyItem.messageType, m9Var)) {
                }
            }
        }
        i7 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.n0.getCurrentDialogId();
        q6Var = this.N0;
        if (!(q6Var instanceof k6)) {
        }
        if (!(q6Var instanceof t6)) {
        }
        if (q6Var != null) {
        }
        j3 = currentDialogId22;
        i10 = i7;
        m9Var.a = null;
        m9Var.m = null;
        m9Var.b = null;
        m9Var.c = null;
        m9Var.e = null;
        m9Var.f = null;
        m9Var.g = null;
        m9Var.d = null;
        m9Var.l = null;
        m9Var.h = 0.0f;
        m9Var.i = 0.0f;
        m9Var.o = 0;
        m9Var.j = null;
        m9Var.k = 1.0f;
        if (!this.t0.o(j3, this.T0, i10, storyItem == null ? -1 : storyItem.messageType, m9Var)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void a(boolean z9) {
        u(true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final View d() {
        return this.s;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = 0;
        if (i7 == qs.x5) {
            if (this.N0 == ((q6) objArr[0])) {
                z();
                f9 f9Var = this.n0;
                q6 q6Var = this.N0;
                f9Var.D(this.h, q6Var.d, q6Var.h());
                s5 s5Var = this.x;
                if (s5Var != null) {
                    TL_stories.StoryItem selectedStory = s5Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.N0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((ij) this.N0.i.get(i11)).l.id) {
                            i12 = i11;
                        }
                        arrayList.add(((ij) this.N0.i.get(i11)).l);
                        i11++;
                    }
                    this.x.b(i12, this.N0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == qs.v5) {
            l9 l9Var = this.t0;
            if (l9Var instanceof h7) {
                h7 h7Var = (h7) l9Var;
                if (!h7Var.r || h7Var.n) {
                    return;
                }
                y6 P1 = qp.s1(this.h).P1();
                ArrayList arrayList2 = h7Var.f ? P1.h : P1.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z9 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i13)).peer);
                    if ((!h7Var.h || P1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                        dialogIds.add(Long.valueOf(o4));
                        z9 = true;
                    }
                }
                if (z9) {
                    this.n0.getAdapter().g();
                }
            }
            s5 s5Var2 = this.x;
            if (s5Var2 != null) {
                ArrayList arrayList3 = s5Var2.h.G;
                while (i11 < arrayList3.size()) {
                    ((n4) arrayList3.get(i11)).b();
                    i11++;
                }
                return;
            }
            return;
        }
        int i14 = qs.c1;
        if (i7 != i14 && i7 != qs.d1) {
            if (i7 == qs.w5) {
                long longValue = ((Long) objArr[0]).longValue();
                int intValue = ((Integer) objArr[1]).intValue();
                TL_stories.StoryItem storyItem = this.S0;
                if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                    this.R0 = true;
                    return;
                }
                return;
            }
            return;
        }
        V();
        if (i7 != i14) {
            if (this.r1 || z() == null) {
                return;
            }
            z().d1(false);
            return;
        }
        o9 o9Var = this.z0;
        if (o9Var == null) {
            this.s1 = 0L;
            return;
        }
        this.s1 = o9Var.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.b2, android.content.DialogInterface
    public final void dismiss() {
        u(true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final int e(int i7) {
        return i0.a.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i7, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(int i7) {
        if (this.p0 != i7) {
            this.p0 = i7;
            this.n0.setKeyboardHeight(i7);
            this.n0.requestLayout();
            s5 s5Var = this.x;
            if (s5Var != null) {
                s5Var.setKeyboardHeight(i7);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean j() {
        return this.J0;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final /* synthetic */ hc k() {
        return null;
    }

    public final void l(boolean z9) {
        boolean z10 = org.telegram.messenger.r2.a;
        boolean z11 = !this.m0 || z9;
        if (this.e != z11) {
            this.e = z11;
            SurfaceView surfaceView = this.C0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            fi.s3 s3Var = this.D0;
            if (s3Var != null) {
                s3Var.setSecure(!z11);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.f2 f2Var = this.f;
                if (f2Var.getParentActivity() != null) {
                    if (z11) {
                        f2Var.getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                        org.telegram.messenger.g0.h2();
                        return;
                    } else {
                        f2Var.getParentActivity().getWindow().addFlags(TLObject.FLAG_13);
                        org.telegram.messenger.g0.h2();
                        return;
                    }
                }
                return;
            }
            if (z11) {
                this.r.flags &= -8193;
                org.telegram.messenger.g0.h2();
            } else {
                this.r.flags |= TLObject.FLAG_13;
                org.telegram.messenger.g0.h2();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.j0 = false;
            this.l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new x8(this, 2));
            this.H.addListener(new y8(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            this.H.start();
        }
    }

    public final void o(boolean z9) {
        if (this.u1 != null) {
            return;
        }
        if (this.p0 != 0) {
            org.telegram.messenger.g0.v1(this.x);
            return;
        }
        if (this.c0 || this.e0 != 0.0f) {
            this.I0.d();
            if (!z9) {
                float f10 = this.e0;
                s5 s5Var = this.x;
                float f11 = s5Var.c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.e0 = f12;
                    s5Var.setOffset(f12);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z9 ? this.x.c : 0.0f);
            this.u1 = ofFloat;
            int i7 = 3;
            ofFloat.addUpdateListener(new x8(this, i7));
            this.u1.addListener(new ch.y(i7, this, z9));
            if (z9) {
                this.u1.setDuration(350L);
                this.u1.setInterpolator(xq.h);
            } else {
                this.u1.setDuration(350L);
                this.u1.setInterpolator(xq.f);
            }
            this.u1.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void p() {
        i4 currentPeerView;
        boolean z9 = false;
        if (this.e0 == 0.0f) {
            f9 f9Var = this.n0;
            if (f9Var != null && (currentPeerView = f9Var.getCurrentPeerView()) != null) {
                z9 = currentPeerView.q0();
            }
            if (z9) {
                return;
            }
            u(true);
            return;
        }
        s5 s5Var = this.x;
        if (s5Var.y > 0) {
            org.telegram.messenger.g0.v1(s5Var);
            return;
        }
        k5 currentPage = s5Var.getCurrentPage();
        if (currentPage != null) {
            r4 r4Var = currentPage.r;
            z4 z4Var = currentPage.f;
            if (z4Var != null && z4Var.a) {
                z4Var.a();
                return;
            } else if (Math.abs(currentPage.c.getTranslationY() - r4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                r4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                r4Var.y0(0);
                return;
            }
        }
        o(false);
    }

    public final void q() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.G1) == null) {
            return;
        }
        launchActivity.F(true, true, true);
    }

    public final void r() {
        if (this.x == null) {
            s5 s5Var = new s5(this.w.getContext(), this);
            this.x = s5Var;
            this.w.addView(s5Var, 0);
        }
        i4 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.N0 == null) {
                this.x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < this.N0.i.size(); i7++) {
                arrayList.add(((ij) this.N0.i.get(i7)).l);
            }
            this.x.b(currentPeerView.getListPosition(), this.N0.d, arrayList);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean s() {
        return !this.G0;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean t(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new eb(this, 4));
            dialog.show();
            V();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.u0 = null;
            return false;
        }
    }

    public final void u(boolean z9) {
        org.telegram.messenger.g0.v1(this.s);
        this.G0 = true;
        this.g1 = true;
        V();
        S(false);
        W();
        this.I0.d();
        this.b0 = this.W;
        this.E = false;
        int i7 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x8(this, 0));
        if (z9) {
            E();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            m9 m9Var = this.s0;
            ImageReceiver imageReceiver = m9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = m9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            m9Var.c = null;
            m9Var.b = null;
        }
        org.telegram.messenger.g0.i3(new l3(this, i7), 16L);
        if (this.b1) {
            this.b1 = false;
        }
    }

    public final void v() {
        i4 i4Var;
        f9 f9Var = this.n0;
        if (f9Var != null) {
            ArrayList arrayList = f9Var.P0;
            for (int i7 = 0; i7 < f9Var.getChildCount(); i7++) {
                View childAt = f9Var.getChildAt(i7);
                if ((childAt instanceof w7) && (i4Var = ((w7) childAt).a) != null && !i4Var.E3) {
                    i4Var.E3 = true;
                    o2 o2Var = i4Var.K1;
                    if (o2Var != null) {
                        o2Var.B0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                i4 i4Var2 = (i4) arrayList.get(i10);
                if (!i4Var2.E3) {
                    i4Var2.E3 = true;
                    o2 o2Var2 = i4Var2.K1;
                    if (o2Var2 != null) {
                        o2Var2.B0();
                    }
                }
            }
        }
    }

    public final void w(KeyEvent keyEvent) {
        if (C1) {
            U();
            return;
        }
        i4 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            g4 g4Var = currentPeerView.x1;
            if (!g4Var.j() && g4Var.e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.c1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void x(Runnable runnable) {
        if (runnable != null) {
            this.x0.add(runnable);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean y() {
        return this.b && this.s != null;
    }

    public final i4 z() {
        f9 f9Var = this.n0;
        if (f9Var == null) {
            return null;
        }
        return f9Var.getCurrentPeerView();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final /* synthetic */ void b(boolean z9) {
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void n(Runnable runnable) {
    }
}
