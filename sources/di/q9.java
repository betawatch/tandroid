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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q9 implements ls, org.telegram.ui.ActionBar.b2 {
    public static boolean C1;
    public static boolean w1;
    public static TL_stories.StoryItem y1;
    public static boolean z1;
    public g1 A0;
    public i9 B0;
    public SurfaceView C0;
    public fi.s3 D0;
    public boolean E;
    public Uri E0;
    public ValueAnimator F;
    public i4 F0;
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
    public f7 M;
    public boolean M0;
    public float N;
    public r6 N0;
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
    public f8 m1;
    public WindowManager n;
    public g9 n0;
    public l3 n1;
    public boolean o1;
    public int p0;
    public float p1;
    public boolean q0;
    public boolean q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public e9 s;
    public final n9 s0;
    public long s1;
    public m9 t0;
    public d7 t1;
    public Dialog u0;
    public ValueAnimator u1;
    public org.telegram.ui.ActionBar.b2 v0;
    public boolean v1;
    public f9 w;
    public boolean w0;
    public t5 x;
    public final ArrayList x0;
    public boolean y;
    public org.telegram.ui.j4 y0;
    public p9 z0;
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

    public q9(org.telegram.ui.ActionBar.f2 f2Var) {
        n9 n9Var = new n9();
        n9Var.k = 1.0f;
        this.s0 = n9Var;
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
        return y1 != null && (ijVar.D == 23 || ijVar.Z4()) && !z1 && y1.messageId == ijVar.e1() && y1.messageType != 3;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 == 0 || storyItem == null) {
            return;
        }
        D1.put(j3 + (j3 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean c(q9 q9Var, e9 e9Var, float f10, float f11, boolean z9) {
        o2 o2Var;
        o2 o2Var2;
        if (e9Var == null) {
            return false;
        }
        if (q9Var.W0) {
            return true;
        }
        if (q9Var.x != null && q9Var.e0 != 0.0f) {
            return true;
        }
        j4 currentPeerView = q9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.E0(currentPeerView, ((f10 - q9Var.w.getX()) - q9Var.n0.getX()) - currentPeerView.getX(), ((f11 - q9Var.w.getY()) - q9Var.n0.getY()) - currentPeerView.getY(), z9)) {
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
            if (f11 > currentPeerView.K1.getY() + currentPeerView.getY() + q9Var.n0.getY() + q9Var.w.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (o2Var = currentPeerView.K1) == null || !o2Var.v0()) && q9Var.t1 == null) {
            return org.telegram.messenger.g0.Y(e9Var, f10, f11, currentPeerView);
        }
        return true;
    }

    public static void g(q9 q9Var) {
        md mdVar;
        zs editField;
        j4 currentPeerView = q9Var.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.K1 == null || (((mdVar = currentPeerView.K2) != null && mdVar.getVisibility() == 0) || (editField = currentPeerView.K1.getEditField()) == null)) {
            q9Var.m();
            return;
        }
        editField.requestFocus();
        org.telegram.messenger.g0.K3(editField);
        org.telegram.messenger.g0.i3(new l3(q9Var, 6), 200L);
    }

    public static void i(q9 q9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(q9Var.X, q9Var.W) / org.telegram.messenger.g0.L(80.0f)));
        if (q9Var.V != l10) {
            q9Var.V = l10;
            q9Var.q();
            j4 currentPeerView = q9Var.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.g2) {
                currentPeerView.invalidate();
            }
            g1 g1Var = q9Var.A0;
            if (g1Var != null) {
                g1Var.v((1.0f - q9Var.V) * q9Var.U);
            }
        }
        e9 e9Var = q9Var.s;
        if (e9Var != null) {
            e9Var.invalidate();
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
            n9 n9Var = this.s0;
            ImageReceiver imageReceiver = n9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = n9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            n9Var.c = null;
            n9Var.b = null;
            f9 f9Var = this.w;
            if (f9Var != null) {
                f9Var.a(true);
            }
            this.I0.e();
            i4 i4Var = this.F0;
            if (i4Var != null) {
                i4Var.b();
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
        j4 currentPeerView;
        int selectedPosition;
        this.d = true;
        n9 n9Var = this.s0;
        ImageReceiver imageReceiver = n9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = n9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            n9Var.c.O0(true, true);
        }
        if (this.N0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.N0.i.size()) {
            this.T0 = ((ij) this.N0.i.get(selectedPosition)).e1();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i7 = this.T0;
            if (this.N0 instanceof u6) {
                j4 currentPeerView2 = this.n0.getCurrentPeerView();
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

    public final void G(int i7, Context context, TL_stories.StoryItem storyItem, m9 m9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i7;
        if (storyItem.dialogId <= 0 || qp.s1(i7).a2(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || qp.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                H(i7, context, storyItem, arrayList, 0, null, null, m9Var, false);
            }
        }
    }

    public final void H(int i7, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, r6 r6Var, TL_stories.PeerStories peerStories, m9 m9Var, boolean z9) {
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
        p9 p9Var = this.z0;
        if (p9Var != null) {
            p9Var.setSpeed(1.0f);
        }
        int i11 = 1;
        boolean z10 = (org.telegram.messenger.g0.Q1() || this.q1) ? false : true;
        this.b = z10;
        this.a = iz.b0 && z10;
        this.T0 = storyItem == null ? 0 : storyItem.messageId;
        this.M0 = storyItem != null && r6Var == null && peerStories == null;
        this.R0 = false;
        if (storyItem != null) {
            this.S0 = storyItem;
            y1 = storyItem;
        }
        this.N0 = r6Var;
        this.P0 = peerStories;
        this.t0 = m9Var;
        this.Q0 = z9;
        this.h = i7;
        this.W = 0.0f;
        this.X = 0.0f;
        g9 g9Var = this.n0;
        if (g9Var != null) {
            g9Var.setHorizontalProgressToDismiss(0.0f);
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
            this.i0 = new GestureDetector(new a9(this));
            this.s = new e9(this, context, Q);
        }
        if (this.w == null) {
            this.w = new f9(context, this);
            g9 g9Var2 = new g9(this, this.h, context, this, this.D);
            this.n0 = g9Var2;
            g9Var2.setDelegate(new h9(this, r6Var, arrayList, context));
            this.w.addView(this.n0, ha.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.j4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                i9 i9Var = new i9(context, this);
                this.B0 = i9Var;
                this.y0.addView(i9Var);
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
        if (r6Var != null) {
            this.n0.D(this.h, r6Var.d, r6Var.h());
        } else {
            g9 g9Var3 = this.n0;
            int i13 = this.h;
            g9Var3.A0 = arrayList;
            g9Var3.y0 = i13;
            g9Var3.setAdapter(null);
            g9Var3.setAdapter(g9Var3.z0);
            g9Var3.setCurrentItem(i10);
            g9Var3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && Q != null && Q.isSupportEdgeToEdge();
        f9 f9Var = this.w;
        r4 r4Var = new r4(this, i12);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(f9Var, r4Var);
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

    public final void I(Context context, int i7, r6 r6Var, i7 i7Var) {
        this.h = p10.s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(r6Var.d));
        this.O0 = i7;
        M(context, null, arrayList, 0, r6Var, null, i7Var, false);
    }

    public final void J(Context context, long j3, m9 m9Var) {
        this.h = p10.s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        z6 P1 = qp.s1(this.h).P1();
        int i7 = P1.a;
        TL_stories.PeerStories y10 = P1.y(j3);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (s7.w(i7, y10.stories.get(i10))) {
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
        M(context, null, arrayList, 0, null, null, m9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, m9 m9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = p10.s0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
        M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, m9Var, false);
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, i7 i7Var) {
        G(p10.s0, context, storyItem, i7Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, r6 r6Var, TL_stories.PeerStories peerStories, m9 m9Var, boolean z9) {
        H(p10.s0, context, storyItem, arrayList, i7, r6Var, peerStories, m9Var, z9);
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
        p9 p9Var = this.z0;
        if (p9Var != null) {
            p9Var.release(null);
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
            ((p9) arrayList.get(i7)).release(null);
            i7++;
        }
        arrayList.clear();
        a0.h hVar = qp.s1(this.h).P1().m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((z9) hVar.n(i10)).b(false);
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
        j4 currentPeerView;
        j4 currentPeerView2;
        h4 h4Var;
        p9 p9Var;
        i4 i4Var;
        if (this.Z0 != z9) {
            this.Z0 = z9;
            if (z9 && !this.e1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (h4Var = currentPeerView2.x1) != null && !h4Var.f && h4Var.b == null) {
                if (!this.k0 && !this.j0 && (i4Var = this.F0) != null && ((p9) i4Var.c) != null) {
                    currentPeerView2.L0.invalidate();
                    org.telegram.messenger.p2.e.a();
                }
                i4 i4Var2 = this.F0;
                if (i4Var2 != null && (p9Var = (p9) i4Var2.c) != null && !this.k0) {
                    p9Var.setSeeking(true);
                }
                this.k0 = true;
            }
            V();
            g9 g9Var = this.n0;
            if (g9Var == null || (currentPeerView = g9Var.getCurrentPeerView()) == null) {
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
        i4 i4Var;
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
                i4Var = this.F0;
                if (i4Var != null) {
                    i4Var.b = null;
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
        i4Var = this.F0;
        if (i4Var != null) {
        }
        this.D0.b(0L, null);
        u(true);
    }

    public final void U() {
        boolean z9 = C1;
        C1 = !z9;
        p9 p9Var = this.z0;
        int i7 = 0;
        if (p9Var != null) {
            p9Var.setAudioEnabled(z9, false);
        }
        while (true) {
            ArrayList arrayList = this.L0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((p9) arrayList.get(i7)).setAudioEnabled(!C1, true);
            i7++;
        }
        j4 currentPeerView = this.n0.getCurrentPeerView();
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
        p9 p9Var = this.z0;
        if (p9Var != null) {
            if (C) {
                p9Var.pause();
            } else {
                p9Var.play(A1);
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
        r6 r6Var;
        long j3;
        int i10;
        if (this.t0 == null) {
            this.U0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        n9 n9Var = this.s0;
        ImageReceiver imageReceiver = n9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = n9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            n9Var.c.O0(true, true);
        }
        j4 currentPeerView = this.n0.getCurrentPeerView();
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
                        r6Var = this.N0;
                        if (!(r6Var instanceof l6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i7 = storyItem.messageId;
                        } else if (!(r6Var instanceof u6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i7 = storyItem.id;
                        } else if (r6Var != null) {
                            i7 = this.O0;
                        }
                        j3 = currentDialogId;
                        i10 = i7;
                        n9Var.a = null;
                        n9Var.m = null;
                        n9Var.b = null;
                        n9Var.c = null;
                        n9Var.e = null;
                        n9Var.f = null;
                        n9Var.g = null;
                        n9Var.d = null;
                        n9Var.l = null;
                        n9Var.h = 0.0f;
                        n9Var.i = 0.0f;
                        n9Var.o = 0;
                        n9Var.j = null;
                        n9Var.k = 1.0f;
                        if (!this.t0.o(j3, this.T0, i10, storyItem == null ? -1 : storyItem.messageType, n9Var)) {
                            this.U0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        n9Var.o = i10;
                        View view = n9Var.a;
                        if (view == null) {
                            this.U0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = n9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f10 = iArr[0];
                        this.K = f10;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = n9Var.a;
                        if (callback instanceof f7) {
                            this.M = (f7) callback;
                        } else {
                            this.M = null;
                        }
                        this.U0 = false;
                        ImageReceiver imageReceiver3 = n9Var.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.r() + f10;
                            this.O = n9Var.b.s() + iArr[1];
                            ImageReceiver imageReceiver4 = n9Var.b;
                            float f11 = imageReceiver4.M0;
                            this.R = f11;
                            this.S = imageReceiver4.N0;
                            o7 o7Var = n9Var.m;
                            if (o7Var != null) {
                                this.R = o7Var.b() * f11;
                                this.S = n9Var.m.b() * this.S;
                            }
                            if (n9Var.a.getParent() instanceof View) {
                                View view3 = (View) n9Var.a.getParent();
                                this.N = (view3.getScaleX() * n9Var.b.r()) + iArr[0];
                                this.O = (view3.getScaleY() * n9Var.b.s()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.U0 = true;
                        } else {
                            ImageReceiver imageReceiver5 = n9Var.c;
                            if (imageReceiver5 != null) {
                                this.N = imageReceiver5.r() + f10;
                                this.O = n9Var.c.s() + iArr[1];
                                ImageReceiver imageReceiver6 = n9Var.c;
                                this.R = imageReceiver6.M0;
                                this.S = imageReceiver6.N0;
                                this.V0 = imageReceiver6.W0;
                            }
                        }
                        n9Var.g.getLocationOnScreen(iArr);
                        float f12 = n9Var.h;
                        if (f12 == 0.0f && n9Var.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f13 = iArr[1];
                            this.P = f12 + f13;
                            this.Q = f13 + n9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.S0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                r6Var = this.N0;
                if (!(r6Var instanceof l6)) {
                }
                if (!(r6Var instanceof u6)) {
                }
                if (r6Var != null) {
                }
                j3 = currentDialogId2;
                i10 = i7;
                n9Var.a = null;
                n9Var.m = null;
                n9Var.b = null;
                n9Var.c = null;
                n9Var.e = null;
                n9Var.f = null;
                n9Var.g = null;
                n9Var.d = null;
                n9Var.l = null;
                n9Var.h = 0.0f;
                n9Var.i = 0.0f;
                n9Var.o = 0;
                n9Var.j = null;
                n9Var.k = 1.0f;
                if (!this.t0.o(j3, this.T0, i10, storyItem == null ? -1 : storyItem.messageType, n9Var)) {
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
        r6Var = this.N0;
        if (!(r6Var instanceof l6)) {
        }
        if (!(r6Var instanceof u6)) {
        }
        if (r6Var != null) {
        }
        j3 = currentDialogId22;
        i10 = i7;
        n9Var.a = null;
        n9Var.m = null;
        n9Var.b = null;
        n9Var.c = null;
        n9Var.e = null;
        n9Var.f = null;
        n9Var.g = null;
        n9Var.d = null;
        n9Var.l = null;
        n9Var.h = 0.0f;
        n9Var.i = 0.0f;
        n9Var.o = 0;
        n9Var.j = null;
        n9Var.k = 1.0f;
        if (!this.t0.o(j3, this.T0, i10, storyItem == null ? -1 : storyItem.messageType, n9Var)) {
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
            if (this.N0 == ((r6) objArr[0])) {
                z();
                g9 g9Var = this.n0;
                r6 r6Var = this.N0;
                g9Var.D(this.h, r6Var.d, r6Var.h());
                t5 t5Var = this.x;
                if (t5Var != null) {
                    TL_stories.StoryItem selectedStory = t5Var.getSelectedStory();
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
            m9 m9Var = this.t0;
            if (m9Var instanceof i7) {
                i7 i7Var = (i7) m9Var;
                if (!i7Var.r || i7Var.n) {
                    return;
                }
                z6 P1 = qp.s1(this.h).P1();
                ArrayList arrayList2 = i7Var.f ? P1.h : P1.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z9 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i13)).peer);
                    if ((!i7Var.h || P1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                        dialogIds.add(Long.valueOf(o4));
                        z9 = true;
                    }
                }
                if (z9) {
                    this.n0.getAdapter().g();
                }
            }
            t5 t5Var2 = this.x;
            if (t5Var2 != null) {
                ArrayList arrayList3 = t5Var2.h.G;
                while (i11 < arrayList3.size()) {
                    ((o4) arrayList3.get(i11)).b();
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
        p9 p9Var = this.z0;
        if (p9Var == null) {
            this.s1 = 0L;
            return;
        }
        this.s1 = p9Var.currentPosition;
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
            t5 t5Var = this.x;
            if (t5Var != null) {
                t5Var.setKeyboardHeight(i7);
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
            ofFloat.addUpdateListener(new y8(this, 2));
            this.H.addListener(new z8(this, 1));
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
                t5 t5Var = this.x;
                float f11 = t5Var.c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.e0 = f12;
                    t5Var.setOffset(f12);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z9 ? this.x.c : 0.0f);
            this.u1 = ofFloat;
            int i7 = 3;
            ofFloat.addUpdateListener(new y8(this, i7));
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
        j4 currentPeerView;
        boolean z9 = false;
        if (this.e0 == 0.0f) {
            g9 g9Var = this.n0;
            if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
                z9 = currentPeerView.q0();
            }
            if (z9) {
                return;
            }
            u(true);
            return;
        }
        t5 t5Var = this.x;
        if (t5Var.y > 0) {
            org.telegram.messenger.g0.v1(t5Var);
            return;
        }
        l5 currentPage = t5Var.getCurrentPage();
        if (currentPage != null) {
            s4 s4Var = currentPage.r;
            a5 a5Var = currentPage.f;
            if (a5Var != null && a5Var.a) {
                a5Var.a();
                return;
            } else if (Math.abs(currentPage.c.getTranslationY() - s4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                s4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                s4Var.y0(0);
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
            t5 t5Var = new t5(this.w.getContext(), this);
            this.x = t5Var;
            this.w.addView(t5Var, 0);
        }
        j4 currentPeerView = this.n0.getCurrentPeerView();
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
        ofFloat.addUpdateListener(new y8(this, 0));
        if (z9) {
            E();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            n9 n9Var = this.s0;
            ImageReceiver imageReceiver = n9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = n9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            n9Var.c = null;
            n9Var.b = null;
        }
        org.telegram.messenger.g0.i3(new l3(this, i7), 16L);
        if (this.b1) {
            this.b1 = false;
        }
    }

    public final void v() {
        j4 j4Var;
        g9 g9Var = this.n0;
        if (g9Var != null) {
            ArrayList arrayList = g9Var.P0;
            for (int i7 = 0; i7 < g9Var.getChildCount(); i7++) {
                View childAt = g9Var.getChildAt(i7);
                if ((childAt instanceof w7) && (j4Var = ((w7) childAt).a) != null && !j4Var.E3) {
                    j4Var.E3 = true;
                    o2 o2Var = j4Var.K1;
                    if (o2Var != null) {
                        o2Var.B0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j4 j4Var2 = (j4) arrayList.get(i10);
                if (!j4Var2.E3) {
                    j4Var2.E3 = true;
                    o2 o2Var2 = j4Var2.K1;
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
        j4 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            h4 h4Var = currentPeerView.x1;
            if (!h4Var.j() && h4Var.e) {
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

    public final j4 z() {
        g9 g9Var = this.n0;
        if (g9Var == null) {
            return null;
        }
        return g9Var.getCurrentPeerView();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final /* synthetic */ void b(boolean z9) {
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void n(Runnable runnable) {
    }
}
