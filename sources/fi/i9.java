package fi;

import a8.sa;
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
import c8.ja;
import c8.zc;
import di.ub;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i9 implements is, org.telegram.ui.ActionBar.a2 {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public h9 A0;
    public e1 B0;
    public a9 C0;
    public SurfaceView D0;
    public hi.r3 E0;
    public boolean F;
    public Uri F0;
    public ValueAnimator G;
    public a4 G0;
    public ValueAnimator H;
    public boolean H0;
    public ValueAnimator I;
    public boolean I0;
    public long J;
    public final h2.f J0;
    public int K;
    public boolean K0;
    public float L;
    public boolean L0;
    public float M;
    public final ArrayList M0;
    public y6 N;
    public boolean N0;
    public float O;
    public k6 O0;
    public float P;
    public int P0;
    public float Q;
    public TL_stories.PeerStories Q0;
    public float R;
    public boolean R0;
    public float S;
    public boolean S0;
    public float T;
    public TL_stories.StoryItem T0;
    public int U0;
    public float V;
    public boolean V0;
    public float W;
    public int[] W0;
    public float X;
    public boolean X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public float a0;
    public boolean a1;
    public boolean b0;
    public final g3 b1;
    public float c0;
    public boolean c1;
    public boolean d0;
    public r7 d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final org.telegram.ui.ActionBar.e2 f;
    public float f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public int h;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public GestureDetector j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public boolean l0;
    public boolean l1;
    public boolean m0;
    public boolean m1;
    public WindowManager n;
    public boolean n0;
    public c1 n1;
    public y8 o0;
    public g3 o1;
    public boolean p1;
    public int q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public boolean r0;
    public boolean r1;
    public w8 s;
    public float s0;
    public boolean s1;
    public final f9 t0;
    public long t1;
    public e9 u0;
    public w6 u1;
    public Dialog v0;
    public ValueAnimator v1;
    public x8 w;
    public org.telegram.ui.ActionBar.a2 w0;
    public boolean w1;
    public k5 x;
    public boolean x0;
    public boolean y;
    public final ArrayList y0;
    public org.telegram.ui.j4 z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = gz.b0;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b E = new b();
    public final RectF U = new RectF();
    public final float[] p0 = new float[2];

    public i9(org.telegram.ui.ActionBar.e2 e2Var) {
        f9 f9Var = new f9();
        f9Var.k = 1.0f;
        this.t0 = f9Var;
        this.y0 = new ArrayList();
        this.H0 = true;
        this.J0 = new h2.f((int[]) null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new g3(this, 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = e2Var;
    }

    public static CharSequence A(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean D(gj gjVar) {
        return z1 != null && (gjVar.D == 23 || gjVar.Z4()) && !A1 && z1.messageId == gjVar.e1() && z1.messageType != 3;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 == 0 || storyItem == null) {
            return;
        }
        E1.put(j3 + (j3 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean c(i9 i9Var, w8 w8Var, float f10, float f11, boolean z10) {
        k2 k2Var;
        k2 k2Var2;
        if (w8Var == null) {
            return false;
        }
        if (i9Var.X0) {
            return true;
        }
        if (i9Var.x != null && i9Var.f0 != 0.0f) {
            return true;
        }
        b4 currentPeerView = i9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.E0(currentPeerView, ((f10 - i9Var.w.getX()) - i9Var.o0.getX()) - currentPeerView.getX(), ((f11 - i9Var.w.getY()) - i9Var.o0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.f2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (k2Var2 = currentPeerView.L1) != null && k2Var2.getVisibility() == 0) {
            if (f11 > currentPeerView.L1.getY() + currentPeerView.getY() + i9Var.o0.getY() + i9Var.w.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (k2Var = currentPeerView.L1) == null || !k2Var.J0()) && i9Var.u1 == null) {
            return org.telegram.messenger.g0.Y(w8Var, f10, f11, currentPeerView);
        }
        return true;
    }

    public static void g(i9 i9Var) {
        ub ubVar;
        ft editField;
        b4 currentPeerView = i9Var.o0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.L1 == null || (((ubVar = currentPeerView.L2) != null && ubVar.getVisibility() == 0) || (editField = currentPeerView.L1.getEditField()) == null)) {
            i9Var.m();
            return;
        }
        editField.requestFocus();
        org.telegram.messenger.g0.J3(editField);
        org.telegram.messenger.g0.i3(new g3(i9Var, 6), 200L);
    }

    public static void i(i9 i9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(i9Var.Y, i9Var.X) / org.telegram.messenger.g0.L(80.0f)));
        if (i9Var.W != l10) {
            i9Var.W = l10;
            i9Var.q();
            b4 currentPeerView = i9Var.o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.h2) {
                currentPeerView.invalidate();
            }
            e1 e1Var = i9Var.B0;
            if (e1Var != null) {
                e1Var.v((1.0f - i9Var.W) * i9Var.V);
            }
        }
        w8 w8Var = i9Var.s;
        if (w8Var != null) {
            w8Var.invalidate();
        }
    }

    public final void B() {
        if (this.n0) {
            org.telegram.messenger.g0.v1(this.s);
            this.H0 = true;
            this.K0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            V();
            this.P = 0.0f;
            this.O = 0.0f;
            f9 f9Var = this.t0;
            ImageReceiver imageReceiver = f9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            f9Var.c = null;
            f9Var.b = null;
            x8 x8Var = this.w;
            if (x8Var != null) {
                x8Var.a(true);
            }
            this.J0.e();
            a4 a4Var = this.G0;
            if (a4Var != null) {
                a4Var.b();
            }
            O();
            if (this.b) {
                org.telegram.messenger.g0.E2(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            v();
            this.n0 = false;
            this.d = false;
            q();
            g3 g3Var = this.o1;
            if (g3Var != null) {
                g3Var.run();
                this.o1 = null;
            }
        }
    }

    public final boolean C() {
        org.telegram.ui.ActionBar.e2 e2Var;
        if (this.X0 || this.Z0 || this.Y0 || this.L0 || this.r0 || this.y || this.v0 != null || this.w0 != null || this.H0 || this.I0 || this.V != 1.0f || this.f0 != 0.0f || this.i1) {
            return true;
        }
        if ((this.l1 && this.a) || this.k1 || this.j1 || this.p1 || this.W != 0.0f || this.u1 != null) {
            return true;
        }
        return (!this.b || (e2Var = this.f) == null || e2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        TL_stories.StoryItem storyItem;
        b4 currentPeerView;
        int selectedPosition;
        this.d = true;
        f9 f9Var = this.t0;
        ImageReceiver imageReceiver = f9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.c.O0(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.o0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((gj) this.O0.i.get(selectedPosition)).e1();
        }
        if (this.u0 != null) {
            long currentDialogId = this.o0.getCurrentDialogId();
            int i7 = this.U0;
            if (this.O0 instanceof n6) {
                b4 currentPeerView2 = this.o0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.f1;
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
            this.u0.d(currentDialogId, i7, new g3(this, 5));
        }
    }

    public final void F(boolean z10) {
        Activity W = org.telegram.messenger.g0.W(this.f.getContext());
        if (W != null) {
            try {
                W.setRequestedOrientation(z10 ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z10) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void G(int i7, Context context, TL_stories.StoryItem storyItem, e9 e9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i7;
        if (storyItem.dialogId <= 0 || np.s1(i7).a2(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || np.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                H(i7, context, storyItem, arrayList, 0, null, null, e9Var, false);
            }
        }
    }

    public final void H(int i7, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E12 = org.telegram.messenger.g0.E1(context);
        ArrayList arrayList2 = this.y0;
        if (!E12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (this.n0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        h9 h9Var = this.A0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        int i11 = 1;
        boolean z11 = (org.telegram.messenger.g0.Q1() || this.r1) ? false : true;
        this.b = z11;
        this.a = gz.b0 && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && k6Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = k6Var;
        this.Q0 = peerStories;
        this.u0 = e9Var;
        this.R0 = z10;
        this.h = i7;
        this.X = 0.0f;
        this.Y = 0.0f;
        y8 y8Var = this.o0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.o0.G0 = 0;
        }
        this.e0 = 0.0f;
        this.a0 = 0.0f;
        this.m0 = false;
        this.W = 0.0f;
        this.n0 = true;
        this.a1 = false;
        this.Z0 = false;
        this.e1.clear();
        org.telegram.messenger.g0.r(this.b1);
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
        this.H0 = false;
        this.c1 = false;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (this.s == null) {
            this.j0 = new GestureDetector(new s8(this));
            this.s = new w8(this, context, Q);
        }
        if (this.w == null) {
            this.w = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.E);
            this.o0 = y8Var2;
            y8Var2.setDelegate(new z8(this, k6Var, arrayList, context));
            this.w.addView(this.o0, ja.e(-1, -1, 1));
            this.z0 = new org.telegram.ui.j4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.z0.addView(this.D0);
            } else {
                a9 a9Var = new a9(context, this);
                this.C0 = a9Var;
                this.z0.addView(a9Var);
            }
            hi.r3 r3Var = new hi.r3(context, this.h);
            this.E0 = r3Var;
            r3Var.setVisibility(8);
            this.z0.addView(this.E0);
            r7 r7Var = new r7(context);
            Paint paint = new Paint(1);
            r7Var.a = paint;
            r7Var.c = new sa(r7Var, 26);
            r7Var.d = new org.telegram.ui.Components.u5(r7Var);
            r7Var.e = new org.telegram.ui.Components.u5(r7Var);
            paint.setColor(-1);
            this.d1 = r7Var;
            this.w.addView(r7Var, ja.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        hi.r3 r3Var2 = this.E0;
        if (r3Var2 != null) {
            r3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.z0);
        this.s.addView(this.z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.w);
        this.s.addView(this.w);
        this.s.setClipChildren(false);
        if (this.N0) {
            W();
        }
        if (k6Var != null) {
            this.o0.D(this.h, k6Var.d, k6Var.h());
        } else {
            y8 y8Var3 = this.o0;
            int i12 = this.h;
            y8Var3.B0 = arrayList;
            y8Var3.z0 = i12;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.A0);
            y8Var3.setCurrentItem(i10);
            y8Var3.D0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && Q != null && Q.isSupportEdgeToEdge();
        x8 x8Var = this.w;
        di.z6 z6Var = new di.z6(this, 11);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(x8Var, z6Var);
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
            org.telegram.messenger.g0.x3(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, i11));
            }
        }
        this.s.requestLayout();
        A1 = true;
        W();
        this.V = 0.0f;
        q();
        x1 = true;
        if (C1) {
            C1 = false;
            D1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            F(true);
        }
        if (!this.b) {
            y1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void I(Context context, int i7, k6 k6Var, b7 b7Var) {
        this.h = m10.t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(k6Var.d));
        this.P0 = i7;
        M(context, null, arrayList, 0, k6Var, null, b7Var, false);
    }

    public final void J(Context context, long j3, e9 e9Var) {
        this.h = m10.t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        s6 P1 = np.s1(this.h).P1();
        int i7 = P1.a;
        TL_stories.PeerStories y10 = P1.y(j3);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (l7.w(i7, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !P1.L(j3)) {
                P1.g.remove(y10);
                P1.h.remove(y10);
                ns.f(i7).k(ns.v5, new Object[0]);
            }
        }
        M(context, null, arrayList, 0, null, null, e9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, e9 e9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.y0.clear();
            return;
        }
        this.h = m10.t0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
        M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, e9Var, false);
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, b7 b7Var) {
        G(m10.t0, context, storyItem, b7Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        H(m10.t0, context, storyItem, arrayList, i7, k6Var, peerStories, e9Var, z10);
    }

    public final void N(org.telegram.ui.ActionBar.e2 e2Var) {
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.b) {
            Q.presentFragment(e2Var);
        } else {
            Q.presentFragment(e2Var);
            u(false);
        }
    }

    public final void O() {
        ArrayList arrayList;
        this.F0 = null;
        Q(false);
        l(true);
        h9 h9Var = this.A0;
        if (h9Var != null) {
            h9Var.release(null);
            this.A0 = null;
        }
        hi.r3 r3Var = this.E0;
        if (r3Var != null) {
            r3Var.b(0L, null);
        }
        e1 e1Var = this.B0;
        if (e1Var != null && !g1.e(e1Var)) {
            e1 e1Var2 = this.B0;
            if (e1Var2.n) {
                e1Var2.s(null);
            } else {
                e1Var2.e();
            }
        }
        this.B0 = null;
        g1 g1Var = g1.w;
        if (g1Var != null && g1Var.c == this) {
            g1Var.c = null;
            c1 c1Var = g1Var.n;
            LaunchActivity launchActivity = g1Var.r;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.a1.remove(c1Var);
                }
                g1Var.r = null;
            }
            wi.n nVar = g1Var.a;
            if (nVar != null && nVar.d()) {
                wi.n nVar2 = g1Var.a;
                if (nVar2.c == 0) {
                    g1Var.a = null;
                    g1Var.b = null;
                    nVar2.f();
                }
            }
        }
        int i7 = 0;
        while (true) {
            arrayList = this.M0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i7)).release(null);
            i7++;
        }
        arrayList.clear();
        a0.h hVar = np.s1(this.h).P1().m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((r9) hVar.n(i10)).b(false);
        }
        if (this.b) {
            F(false);
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f;
        if (e2Var != null) {
            e2Var.removeSheet(this);
        }
        y1.remove(this);
        this.y0.clear();
        this.f0 = 0.0f;
        z1 = null;
    }

    public final void Q(boolean z10) {
        this.r0 = z10;
        if (z10) {
            sa saVar = this.d1.c;
            org.telegram.messenger.g0.r(saVar);
            saVar.run();
        }
        V();
    }

    public final void R(boolean z10) {
        b4 currentPeerView;
        b4 currentPeerView2;
        z3 z3Var;
        h9 h9Var;
        a4 a4Var;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.o0.getCurrentPeerView()) != null && (z3Var = currentPeerView2.y1) != null && !z3Var.f && z3Var.b == null) {
                if (!this.l0 && !this.k0 && (a4Var = this.G0) != null && ((h9) a4Var.c) != null) {
                    currentPeerView2.M0.invalidate();
                    org.telegram.messenger.p2.e.a();
                }
                a4 a4Var2 = this.G0;
                if (a4Var2 != null && (h9Var = (h9) a4Var2.c) != null && !this.l0) {
                    h9Var.setSeeking(true);
                }
                this.l0 = true;
            }
            V();
            y8 y8Var = this.o0;
            if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.a1);
        }
    }

    public final void S(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z10) {
            Window window = launchActivity.getWindow();
            Typeface typeface = org.telegram.messenger.g0.a;
            this.x0 = Build.VERSION.SDK_INT >= 26 ? zc.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        }
        if (this.x0) {
            org.telegram.messenger.g0.m3(launchActivity, !z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        org.telegram.ui.ActionBar.e2 e2Var;
        Activity W;
        a4 a4Var;
        if (this.B0 == null || (e2Var = this.f) == null || this.E0 == null || (W = org.telegram.messenger.g0.W(e2Var.getContext())) == null) {
            return;
        }
        e1 e1Var = this.B0;
        Bitmap bitmap = this.E0.getBitmap();
        if (g1.w == null) {
            g1.w = new g1();
        }
        g1 g1Var = g1.w;
        wi.n nVar = g1Var.a;
        if (nVar != null && nVar.d()) {
            wi.n nVar2 = g1Var.a;
            if (nVar2.c != 0) {
                if (g1Var.b != e1Var) {
                    nVar2.b();
                }
                this.B0 = null;
                a4Var = this.G0;
                if (a4Var != null) {
                    a4Var.b = null;
                }
                this.E0.b(0L, null);
                u(true);
            }
        }
        g1Var.c = this;
        g1Var.b = e1Var;
        wi.n nVar3 = g1Var.a;
        if (nVar3 == null || !nVar3.d()) {
            g1Var.a = l2.i.d().k(g1Var);
        }
        wi.o g10 = g1Var.a.g(W, bitmap, true);
        if (g10 == null) {
            return;
        }
        org.telegram.ui.Components.voip.u0 u0Var = new org.telegram.ui.Components.voip.u0(g10);
        g1Var.e = u0Var;
        g1Var.d.a = u0Var;
        e1Var.s(g1Var.d);
        e1Var.v(1.0f);
        String str = "floating, call " + e1Var.g();
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("live story pip: " + str);
        }
        this.B0 = null;
        a4Var = this.G0;
        if (a4Var != null) {
        }
        this.E0.b(0L, null);
        u(true);
    }

    public final void U() {
        boolean z10 = D1;
        D1 = !z10;
        h9 h9Var = this.A0;
        int i7 = 0;
        if (h9Var != null) {
            h9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i7)).setAudioEnabled(!D1, true);
            i7++;
        }
        b4 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.h1.a(D1, true);
        }
        if (D1) {
            return;
        }
        this.d1.b();
    }

    public final void V() {
        if (this.o0 == null) {
            return;
        }
        boolean C = C();
        if (this.b) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f;
            if (e2Var.isPaused() || !e2Var.isLastFragment()) {
                C = true;
            }
        }
        if (org.telegram.ui.g4.v().W) {
            C = true;
        }
        this.o0.setPaused(C);
        h9 h9Var = this.A0;
        if (h9Var != null) {
            if (C) {
                h9Var.pause();
            } else {
                h9Var.play(B1);
            }
        }
        this.o0.E0 = (this.y || this.H0 || this.I0 || this.a1 || this.f1 || this.f0 != 0.0f || this.j1) ? false : true;
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
        k6 k6Var;
        long j3;
        int i10;
        if (this.u0 == null) {
            this.V0 = false;
            this.P = 0.0f;
            this.O = 0.0f;
            return;
        }
        f9 f9Var = this.t0;
        ImageReceiver imageReceiver = f9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.c.O0(true, true);
        }
        b4 currentPeerView = this.o0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.f1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i7 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.f1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.N0) {
                            storyItem = this.T0;
                        }
                        long currentDialogId = this.o0.getCurrentDialogId();
                        k6Var = this.O0;
                        if (!(k6Var instanceof d6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i7 = storyItem.messageId;
                        } else if (!(k6Var instanceof n6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i7 = storyItem.id;
                        } else if (k6Var != null) {
                            i7 = this.P0;
                        }
                        j3 = currentDialogId;
                        i10 = i7;
                        f9Var.a = null;
                        f9Var.m = null;
                        f9Var.b = null;
                        f9Var.c = null;
                        f9Var.e = null;
                        f9Var.f = null;
                        f9Var.g = null;
                        f9Var.d = null;
                        f9Var.l = null;
                        f9Var.h = 0.0f;
                        f9Var.i = 0.0f;
                        f9Var.o = 0;
                        f9Var.j = null;
                        f9Var.k = 1.0f;
                        if (!this.u0.l(j3, this.U0, i10, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
                            this.V0 = false;
                            this.P = 0.0f;
                            this.O = 0.0f;
                            return;
                        }
                        f9Var.o = i10;
                        View view = f9Var.a;
                        if (view == null) {
                            this.V0 = false;
                            this.P = 0.0f;
                            this.O = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = f9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f10 = iArr[0];
                        this.L = f10;
                        this.M = iArr[1];
                        KeyEvent.Callback callback = f9Var.a;
                        if (callback instanceof y6) {
                            this.N = (y6) callback;
                        } else {
                            this.N = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = f9Var.b;
                        if (imageReceiver3 != null) {
                            this.O = imageReceiver3.r() + f10;
                            this.P = f9Var.b.s() + iArr[1];
                            ImageReceiver imageReceiver4 = f9Var.b;
                            float f11 = imageReceiver4.N0;
                            this.S = f11;
                            this.T = imageReceiver4.O0;
                            h7 h7Var = f9Var.m;
                            if (h7Var != null) {
                                this.S = h7Var.b() * f11;
                                this.T = f9Var.m.b() * this.T;
                            }
                            if (f9Var.a.getParent() instanceof View) {
                                View view3 = (View) f9Var.a.getParent();
                                this.O = (view3.getScaleX() * f9Var.b.r()) + iArr[0];
                                this.P = (view3.getScaleY() * f9Var.b.s()) + iArr[1];
                                this.S = view3.getScaleX() * this.S;
                                this.T = view3.getScaleY() * this.T;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver5 = f9Var.c;
                            if (imageReceiver5 != null) {
                                this.O = imageReceiver5.r() + f10;
                                this.P = f9Var.c.s() + iArr[1];
                                ImageReceiver imageReceiver6 = f9Var.c;
                                this.S = imageReceiver6.N0;
                                this.T = imageReceiver6.O0;
                                this.W0 = imageReceiver6.X0;
                            }
                        }
                        f9Var.g.getLocationOnScreen(iArr);
                        float f12 = f9Var.h;
                        if (f12 == 0.0f && f9Var.i == 0.0f) {
                            this.Q = 0.0f;
                            this.R = 0.0f;
                            return;
                        } else {
                            float f13 = iArr[1];
                            this.Q = f12 + f13;
                            this.R = f13 + f9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.o0.getCurrentDialogId();
                k6Var = this.O0;
                if (!(k6Var instanceof d6)) {
                }
                if (!(k6Var instanceof n6)) {
                }
                if (k6Var != null) {
                }
                j3 = currentDialogId2;
                i10 = i7;
                f9Var.a = null;
                f9Var.m = null;
                f9Var.b = null;
                f9Var.c = null;
                f9Var.e = null;
                f9Var.f = null;
                f9Var.g = null;
                f9Var.d = null;
                f9Var.l = null;
                f9Var.h = 0.0f;
                f9Var.i = 0.0f;
                f9Var.o = 0;
                f9Var.j = null;
                f9Var.k = 1.0f;
                if (!this.u0.l(j3, this.U0, i10, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
                }
            }
        }
        i7 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.o0.getCurrentDialogId();
        k6Var = this.O0;
        if (!(k6Var instanceof d6)) {
        }
        if (!(k6Var instanceof n6)) {
        }
        if (k6Var != null) {
        }
        j3 = currentDialogId22;
        i10 = i7;
        f9Var.a = null;
        f9Var.m = null;
        f9Var.b = null;
        f9Var.c = null;
        f9Var.e = null;
        f9Var.f = null;
        f9Var.g = null;
        f9Var.d = null;
        f9Var.l = null;
        f9Var.h = 0.0f;
        f9Var.i = 0.0f;
        f9Var.o = 0;
        f9Var.j = null;
        f9Var.k = 1.0f;
        if (!this.u0.l(j3, this.U0, i10, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void a(boolean z10) {
        u(true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final View d() {
        return this.s;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = 0;
        if (i7 == ns.x5) {
            if (this.O0 == ((k6) objArr[0])) {
                z();
                y8 y8Var = this.o0;
                k6 k6Var = this.O0;
                y8Var.D(this.h, k6Var.d, k6Var.h());
                k5 k5Var = this.x;
                if (k5Var != null) {
                    TL_stories.StoryItem selectedStory = k5Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.O0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((gj) this.O0.i.get(i11)).l.id) {
                            i12 = i11;
                        }
                        arrayList.add(((gj) this.O0.i.get(i11)).l);
                        i11++;
                    }
                    this.x.b(i12, this.O0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == ns.v5) {
            e9 e9Var = this.u0;
            if (e9Var instanceof b7) {
                b7 b7Var = (b7) e9Var;
                if (!b7Var.r || b7Var.n) {
                    return;
                }
                s6 P1 = np.s1(this.h).P1();
                ArrayList arrayList2 = b7Var.f ? P1.h : P1.g;
                ArrayList<Long> dialogIds = this.o0.getDialogIds();
                boolean z10 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i13)).peer);
                    if ((!b7Var.h || P1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                        dialogIds.add(Long.valueOf(o4));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.o0.getAdapter().g();
                }
            }
            k5 k5Var2 = this.x;
            if (k5Var2 != null) {
                ArrayList arrayList3 = k5Var2.h.H;
                while (i11 < arrayList3.size()) {
                    ((g4) arrayList3.get(i11)).b();
                    i11++;
                }
                return;
            }
            return;
        }
        int i14 = ns.c1;
        if (i7 != i14 && i7 != ns.d1) {
            if (i7 == ns.w5) {
                long longValue = ((Long) objArr[0]).longValue();
                int intValue = ((Integer) objArr[1]).intValue();
                TL_stories.StoryItem storyItem = this.T0;
                if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                    this.S0 = true;
                    return;
                }
                return;
            }
            return;
        }
        V();
        if (i7 != i14) {
            if (this.s1 || z() == null) {
                return;
            }
            z().d1(false);
            return;
        }
        h9 h9Var = this.A0;
        if (h9Var == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = h9Var.currentPosition;
        this.A0.release(null);
        this.A0 = null;
    }

    @Override // org.telegram.ui.ActionBar.a2, android.content.DialogInterface
    public final void dismiss() {
        u(true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final int e(int i7) {
        return i0.a.f((((1.0f - this.W) * 0.5f) + 0.5f) * this.V, i7, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void h(int i7) {
        if (this.q0 != i7) {
            this.q0 = i7;
            this.o0.setKeyboardHeight(i7);
            this.o0.requestLayout();
            k5 k5Var = this.x;
            if (k5Var != null) {
                k5Var.setKeyboardHeight(i7);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final boolean j() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final /* synthetic */ cc k() {
        return null;
    }

    public final void l(boolean z10) {
        boolean z11 = org.telegram.messenger.r2.a;
        boolean z12 = !this.n0 || z10;
        if (this.e != z12) {
            this.e = z12;
            SurfaceView surfaceView = this.D0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z12);
            }
            hi.r3 r3Var = this.E0;
            if (r3Var != null) {
                r3Var.setSecure(!z12);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.e2 e2Var = this.f;
                if (e2Var.getParentActivity() != null) {
                    if (z12) {
                        e2Var.getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                        org.telegram.messenger.g0.h2();
                        return;
                    } else {
                        e2Var.getParentActivity().getWindow().addFlags(TLObject.FLAG_13);
                        org.telegram.messenger.g0.h2();
                        return;
                    }
                }
                return;
            }
            if (z12) {
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
        if (this.I == null) {
            this.k0 = false;
            this.m0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 2));
            this.I.addListener(new r8(this, 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            this.I.start();
        }
    }

    public final void o(boolean z10) {
        if (this.v1 != null) {
            return;
        }
        if (this.q0 != 0) {
            org.telegram.messenger.g0.v1(this.x);
            return;
        }
        if (this.d0 || this.f0 != 0.0f) {
            this.J0.d();
            if (!z10) {
                float f10 = this.f0;
                k5 k5Var = this.x;
                float f11 = k5Var.c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f0 = f12;
                    k5Var.setOffset(f12);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f0, z10 ? this.x.c : 0.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 3));
            this.v1.addListener(new bi.v4(4, this, z10));
            if (z10) {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(er.h);
            } else {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(er.f);
            }
            this.v1.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void p() {
        b4 currentPeerView;
        boolean z10 = false;
        if (this.f0 == 0.0f) {
            y8 y8Var = this.o0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.q0();
            }
            if (z10) {
                return;
            }
            u(true);
            return;
        }
        k5 k5Var = this.x;
        if (k5Var.y > 0) {
            org.telegram.messenger.g0.v1(k5Var);
            return;
        }
        c5 currentPage = k5Var.getCurrentPage();
        if (currentPage != null) {
            j4 j4Var = currentPage.r;
            r4 r4Var = currentPage.f;
            if (r4Var != null && r4Var.a) {
                r4Var.a();
                return;
            } else if (Math.abs(currentPage.c.getTranslationY() - j4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                j4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                j4Var.y0(0);
                return;
            }
        }
        o(false);
    }

    public final void q() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.H1) == null) {
            return;
        }
        launchActivity.F(true, true, true);
    }

    public final void r() {
        if (this.x == null) {
            k5 k5Var = new k5(this.w.getContext(), this);
            this.x = k5Var;
            this.w.addView(k5Var, 0);
        }
        b4 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 == null) {
                this.x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < this.O0.i.size(); i7++) {
                arrayList.add(((gj) this.O0.i.get(i7)).l);
            }
            this.x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final boolean s() {
        return !this.H0;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final boolean t(Dialog dialog) {
        try {
            this.v0 = dialog;
            dialog.setOnDismissListener(new di.r9(this, 4));
            dialog.show();
            V();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.v0 = null;
            return false;
        }
    }

    public final void u(boolean z10) {
        org.telegram.messenger.g0.v1(this.s);
        this.H0 = true;
        this.h1 = true;
        V();
        S(false);
        W();
        this.J0.d();
        this.c0 = this.X;
        this.F = false;
        int i7 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new q8(this, 0));
        if (z10) {
            E();
        } else {
            this.P = 0.0f;
            this.O = 0.0f;
            f9 f9Var = this.t0;
            ImageReceiver imageReceiver = f9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            f9Var.c = null;
            f9Var.b = null;
        }
        org.telegram.messenger.g0.i3(new g3(this, i7), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void v() {
        b4 b4Var;
        y8 y8Var = this.o0;
        if (y8Var != null) {
            ArrayList arrayList = y8Var.Q0;
            for (int i7 = 0; i7 < y8Var.getChildCount(); i7++) {
                View childAt = y8Var.getChildAt(i7);
                if ((childAt instanceof p7) && (b4Var = ((p7) childAt).a) != null && !b4Var.F3) {
                    b4Var.F3 = true;
                    k2 k2Var = b4Var.L1;
                    if (k2Var != null) {
                        k2Var.Q0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                b4 b4Var2 = (b4) arrayList.get(i10);
                if (!b4Var2.F3) {
                    b4Var2.F3 = true;
                    k2 k2Var2 = b4Var2.L1;
                    if (k2Var2 != null) {
                        k2Var2.Q0();
                    }
                }
            }
        }
    }

    public final void w(KeyEvent keyEvent) {
        if (D1) {
            U();
            return;
        }
        b4 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            z3 z3Var = currentPeerView.y1;
            if (!z3Var.j() && z3Var.e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void x(Runnable runnable) {
        if (runnable != null) {
            this.y0.add(runnable);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final boolean y() {
        return this.b && this.s != null;
    }

    public final b4 z() {
        y8 y8Var = this.o0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void n(Runnable runnable) {
    }
}
