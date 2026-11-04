package ei;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import b8.cg;
import b8.mf;
import ci.ba;
import ci.ec;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r9 implements cs, org.telegram.ui.ActionBar.z1, wf.a {
    public static TL_stories.StoryItem A1;
    public static boolean B1;
    public static boolean E1;
    public static boolean y1;
    public q9 A0;
    public g1 B0;
    public j9 C0;
    public SurfaceView D0;
    public gi.r3 E0;
    public boolean F;
    public gi.r3 F0;
    public ValueAnimator G;
    public Uri G0;
    public ValueAnimator H;
    public i4 H0;
    public ValueAnimator I;
    public boolean I0;
    public long J;
    public boolean J0;
    public int K;
    public final g2.g K0;
    public float L;
    public boolean L0;
    public float M;
    public boolean M0;
    public f7 N;
    public final ArrayList N0;
    public float O;
    public boolean O0;
    public float P;
    public r6 P0;
    public float Q;
    public int Q0;
    public float R;
    public TL_stories.PeerStories R0;
    public float S;
    public boolean S0;
    public float T;
    public boolean T0;
    public TL_stories.StoryItem U0;
    public float V;
    public int V0;
    public float W;
    public boolean W0;
    public float X;
    public int[] X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public float a0;
    public boolean a1;
    public boolean b0;
    public boolean b1;
    public float c0;
    public final o3 c1;
    public boolean d0;
    public boolean d1;
    public float e0;
    public y7 e1;
    public final org.telegram.ui.ActionBar.d2 f;
    public float f0;
    public final LongSparseIntArray f1;
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
    public boolean n1;
    public g9 o0;
    public z5 o1;
    public o3 p1;
    public int q0;
    public boolean q1;
    public WindowManager.LayoutParams r;
    public boolean r0;
    public float r1;
    public e9 s;
    public float s0;
    public boolean s1;
    public final o9 t0;
    public boolean t1;
    public n9 u0;
    public long u1;
    public Dialog v0;
    public d7 v1;
    public f9 w;
    public org.telegram.ui.ActionBar.z1 w0;
    public ValueAnimator w1;
    public s5 x;
    public boolean x0;
    public boolean x1;
    public boolean y;
    public final ArrayList y0;
    public org.telegram.ui.l4 z0;
    public static final ArrayList z1 = new ArrayList();
    public static float C1 = 1.0f;
    public static boolean D1 = true;
    public static final LongSparseArray F1 = new LongSparseArray();
    public boolean a = az.b0;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b E = new b();
    public final RectF U = new RectF();
    public final float[] p0 = new float[2];

    public r9(org.telegram.ui.ActionBar.d2 d2Var) {
        o9 o9Var = new o9();
        o9Var.k = 1.0f;
        this.t0 = o9Var;
        this.y0 = new ArrayList();
        this.I0 = true;
        this.K0 = new g2.g((int[]) null);
        this.N0 = new ArrayList();
        this.a1 = false;
        this.c1 = new o3(this, 4);
        this.f1 = new LongSparseIntArray();
        new Paint(1);
        this.f = d2Var;
    }

    public static CharSequence I(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) F1.get(j10 + (j10 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean L(zi ziVar) {
        return A1 != null && (ziVar.D == 23 || ziVar.a5()) && !B1 && A1.messageId == ziVar.f1() && A1.messageType != 3;
    }

    public static void X(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        F1.put(j10 + (j10 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean u(r9 r9Var, e9 e9Var, float f10, float f11, boolean z10) {
        s2 s2Var;
        s2 s2Var2;
        if (e9Var == null) {
            return false;
        }
        if (r9Var.Y0) {
            return true;
        }
        if (r9Var.x != null && r9Var.f0 != 0.0f) {
            return true;
        }
        j4 currentPeerView = r9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.E0(currentPeerView, ((f10 - r9Var.w.getX()) - r9Var.o0.getX()) - currentPeerView.getX(), ((f11 - r9Var.w.getY()) - r9Var.o0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.f2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (s2Var2 = currentPeerView.L1) != null && s2Var2.getVisibility() == 0) {
            if (f11 > currentPeerView.L1.getY() + currentPeerView.getY() + r9Var.o0.getY() + r9Var.w.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (s2Var = currentPeerView.L1) == null || !s2Var.u0()) && r9Var.v1 == null) {
            return org.telegram.messenger.g0.Y(e9Var, f10, f11, currentPeerView);
        }
        return true;
    }

    public static void v(r9 r9Var) {
        ec ecVar;
        xs editField;
        j4 currentPeerView = r9Var.o0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.L1 == null || (((ecVar = currentPeerView.L2) != null && ecVar.getVisibility() == 0) || (editField = currentPeerView.L1.getEditField()) == null)) {
            r9Var.z();
            return;
        }
        editField.requestFocus();
        org.telegram.messenger.g0.K3(editField);
        org.telegram.messenger.g0.i3(new o3(r9Var, 6), 200L);
    }

    public static void w(r9 r9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(r9Var.Y, r9Var.X) / org.telegram.messenger.g0.L(80.0f)));
        if (r9Var.W != l10) {
            r9Var.W = l10;
            r9Var.B();
            j4 currentPeerView = r9Var.o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.h2) {
                currentPeerView.invalidate();
            }
            g1 g1Var = r9Var.B0;
            if (g1Var != null) {
                g1Var.v((1.0f - r9Var.W) * r9Var.V);
            }
        }
        e9 e9Var = r9Var.s;
        if (e9Var != null) {
            e9Var.invalidate();
        }
    }

    public final void A(boolean z10) {
        if (this.w1 != null) {
            return;
        }
        if (this.q0 != 0) {
            org.telegram.messenger.g0.v1(this.x);
            return;
        }
        if (this.d0 || this.f0 != 0.0f) {
            this.K0.d();
            if (!z10) {
                float f10 = this.f0;
                s5 s5Var = this.x;
                float f11 = s5Var.c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f0 = f12;
                    s5Var.setOffset(f12);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f0, z10 ? this.x.c : 0.0f);
            this.w1 = ofFloat;
            ofFloat.addUpdateListener(new x8(this, 3));
            this.w1.addListener(new dh.x(4, this, z10));
            if (z10) {
                this.w1.setDuration(350L);
                this.w1.setInterpolator(xq.h);
            } else {
                this.w1.setDuration(350L);
                this.w1.setInterpolator(xq.f);
            }
            this.w1.start();
        }
    }

    public final void B() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.K1) == null) {
            return;
        }
        launchActivity.F(true, true, true);
    }

    public final void C() {
        if (this.x == null) {
            s5 s5Var = new s5(this.w.getContext(), this);
            this.x = s5Var;
            this.w.addView(s5Var, 0);
        }
        j4 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.P0 == null) {
                this.x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < this.P0.i.size(); i3++) {
                arrayList.add(((zi) this.P0.i.get(i3)).l);
            }
            this.x.b(currentPeerView.getListPosition(), this.P0.d, arrayList);
        }
    }

    public final void D(boolean z10) {
        org.telegram.messenger.g0.v1(this.s);
        this.I0 = true;
        this.i1 = true;
        d0();
        a0(false);
        e0();
        this.K0.d();
        this.c0 = this.X;
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new x8(this, 0));
        if (z10) {
            M();
        } else {
            this.P = 0.0f;
            this.O = 0.0f;
            o9 o9Var = this.t0;
            ImageReceiver imageReceiver = o9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = o9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            o9Var.c = null;
            o9Var.b = null;
        }
        org.telegram.messenger.g0.i3(new o3(this, 2), 16L);
        if (this.d1) {
            this.d1 = false;
        }
    }

    public final void E() {
        j4 j4Var;
        g9 g9Var = this.o0;
        if (g9Var != null) {
            ArrayList arrayList = g9Var.Q0;
            for (int i3 = 0; i3 < g9Var.getChildCount(); i3++) {
                View childAt = g9Var.getChildAt(i3);
                if ((childAt instanceof w7) && (j4Var = ((w7) childAt).a) != null && !j4Var.F3) {
                    j4Var.F3 = true;
                    s2 s2Var = j4Var.L1;
                    if (s2Var != null) {
                        s2Var.A0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j4 j4Var2 = (j4) arrayList.get(i10);
                if (!j4Var2.F3) {
                    j4Var2.F3 = true;
                    s2 s2Var2 = j4Var2.L1;
                    if (s2Var2 != null) {
                        s2Var2.A0();
                    }
                }
            }
        }
    }

    public final void F(KeyEvent keyEvent) {
        if (E1) {
            c0();
            return;
        }
        j4 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            h4 h4Var = currentPeerView.y1;
            if (!h4Var.j() && h4Var.e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.e1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void G(Runnable runnable) {
        if (runnable != null) {
            this.y0.add(runnable);
        }
    }

    public final j4 H() {
        g9 g9Var = this.o0;
        if (g9Var == null) {
            return null;
        }
        return g9Var.getCurrentPeerView();
    }

    public final void J() {
        if (this.n0) {
            org.telegram.messenger.g0.v1(this.s);
            this.I0 = true;
            this.L0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            d0();
            this.P = 0.0f;
            this.O = 0.0f;
            o9 o9Var = this.t0;
            ImageReceiver imageReceiver = o9Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = o9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            o9Var.c = null;
            o9Var.b = null;
            f9 f9Var = this.w;
            if (f9Var != null) {
                f9Var.a(true);
            }
            this.K0.e();
            i4 i4Var = this.H0;
            if (i4Var != null) {
                i4Var.b();
            }
            W();
            if (this.b) {
                org.telegram.messenger.g0.E2(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            E();
            this.n0 = false;
            this.d = false;
            B();
            o3 o3Var = this.p1;
            if (o3Var != null) {
                o3Var.run();
                this.p1 = null;
            }
        }
    }

    public final boolean K() {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (this.Y0 || this.a1 || this.Z0 || this.M0 || this.r0 || this.y || this.v0 != null || this.w0 != null || this.I0 || this.J0 || this.V != 1.0f || this.f0 != 0.0f || this.j1) {
            return true;
        }
        if ((this.m1 && this.a) || this.l1 || this.k1 || this.q1 || this.W != 0.0f || this.v1 != null) {
            return true;
        }
        return (!this.b || (d2Var = this.f) == null || d2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        TL_stories.StoryItem storyItem;
        j4 currentPeerView;
        int selectedPosition;
        this.d = true;
        o9 o9Var = this.t0;
        ImageReceiver imageReceiver = o9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = o9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            o9Var.c.O0(true, true);
        }
        if (this.P0 != null && (currentPeerView = this.o0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.P0.i.size()) {
            this.V0 = ((zi) this.P0.i.get(selectedPosition)).f1();
        }
        if (this.u0 != null) {
            long currentDialogId = this.o0.getCurrentDialogId();
            int i3 = this.V0;
            if (this.P0 instanceof u6) {
                j4 currentPeerView2 = this.o0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.f1;
                    if (selectedPosition2 >= 0 && selectedPosition2 < arrayList.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList.get(selectedPosition2);
                        if (storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i3 = storyItem.id;
                        }
                    }
                }
                storyItem = null;
                if (storyItem != null) {
                }
            }
            this.u0.r(currentDialogId, i3, new o3(this, 5));
        }
    }

    public final void N(boolean z10) {
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

    public final void O(int i3, Context context, TL_stories.StoryItem storyItem, n9 n9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i3;
        if (storyItem.dialogId <= 0 || hp.s1(i3).a2(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || hp.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                P(i3, context, storyItem, arrayList, 0, null, null, n9Var, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i3, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, r6 r6Var, TL_stories.PeerStories peerStories, n9 n9Var, boolean z10) {
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
        C1 = 1.0f;
        q9 q9Var = this.A0;
        if (q9Var != null) {
            q9Var.setSpeed(1.0f);
        }
        Object[] objArr = 0;
        boolean z11 = (org.telegram.messenger.g0.Q1() || this.s1) ? false : true;
        this.b = z11;
        this.a = az.b0 && z11;
        this.V0 = storyItem == null ? 0 : storyItem.messageId;
        this.O0 = storyItem != null && r6Var == null && peerStories == null;
        this.T0 = false;
        if (storyItem != null) {
            this.U0 = storyItem;
            A1 = storyItem;
        }
        this.P0 = r6Var;
        this.R0 = peerStories;
        this.u0 = n9Var;
        this.S0 = z10;
        this.h = i3;
        this.X = 0.0f;
        this.Y = 0.0f;
        g9 g9Var = this.o0;
        if (g9Var != null) {
            g9Var.setHorizontalProgressToDismiss(0.0f);
            this.o0.G0 = 0;
        }
        this.e0 = 0.0f;
        this.a0 = 0.0f;
        this.m0 = false;
        this.W = 0.0f;
        this.n0 = true;
        this.b1 = false;
        this.a1 = false;
        this.f1.clear();
        org.telegram.messenger.g0.r(this.c1);
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
        this.I0 = false;
        this.d1 = false;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (this.s == null) {
            this.j0 = new GestureDetector(new a9(this));
            this.s = new e9(this, context, Q);
        }
        if (this.w == null) {
            this.w = new f9(context, this);
            g9 g9Var2 = new g9(this, this.h, context, this, this.E);
            this.o0 = g9Var2;
            g9Var2.setDelegate(new i9(this, r6Var, arrayList, context));
            this.w.addView(this.o0, mf.e(-1, -1, 1));
            this.z0 = new org.telegram.ui.l4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.z0.addView(this.D0);
            } else {
                j9 j9Var = new j9(context, this);
                this.C0 = j9Var;
                this.z0.addView(j9Var);
            }
            gi.r3 r3Var = new gi.r3(context, this.h);
            this.E0 = r3Var;
            r3Var.setVisibility(8);
            this.z0.addView(this.E0);
            y7 y7Var = new y7(context);
            Paint paint = new Paint(1);
            y7Var.a = paint;
            y7Var.c = new a3.o(y7Var, 22);
            y7Var.d = new org.telegram.ui.Components.u5(y7Var);
            y7Var.e = new org.telegram.ui.Components.u5(y7Var);
            paint.setColor(-1);
            this.e1 = y7Var;
            this.w.addView(y7Var, mf.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        gi.r3 r3Var2 = this.E0;
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
        if (this.O0) {
            e0();
        }
        if (r6Var != null) {
            this.o0.D(this.h, r6Var.d, r6Var.h());
        } else {
            g9 g9Var3 = this.o0;
            int i11 = this.h;
            g9Var3.B0 = arrayList;
            g9Var3.z0 = i11;
            g9Var3.setAdapter(null);
            g9Var3.setAdapter(g9Var3.A0);
            g9Var3.setCurrentItem(i10);
            g9Var3.D0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && Q != null && Q.isSupportEdgeToEdge();
        f9 f9Var = this.w;
        y8 y8Var = new y8(this, objArr == true ? 1 : 0);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(f9Var, y8Var);
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
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.s.requestLayout();
        B1 = true;
        e0();
        this.V = 0.0f;
        B();
        y1 = true;
        if (D1) {
            D1 = false;
            E1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            N(true);
        }
        if (!this.b) {
            z1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void Q(Context context, int i3, r6 r6Var, i7 i7Var) {
        this.h = h10.t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(r6Var.d));
        this.Q0 = i3;
        U(context, null, arrayList, 0, r6Var, null, i7Var, false);
    }

    public final void R(Context context, long j10, n9 n9Var) {
        this.h = h10.t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        z6 P1 = hp.s1(this.h).P1();
        int i3 = P1.a;
        TL_stories.PeerStories y9 = P1.y(j10);
        if (y9 != null) {
            int i10 = 0;
            while (i10 < y9.stories.size()) {
                if (s7.w(i3, y9.stories.get(i10))) {
                    y9.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y9.stories.isEmpty() && !P1.L(j10)) {
                P1.g.remove(y9);
                P1.h.remove(y9);
                hs.f(i3).k(hs.v5, new Object[0]);
            }
        }
        U(context, null, arrayList, 0, null, null, n9Var, false);
    }

    public final void S(Context context, TL_stories.PeerStories peerStories, n9 n9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.y0.clear();
            return;
        }
        this.h = h10.t0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
        U(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, n9Var, false);
    }

    public final void T(Context context, TL_stories.StoryItem storyItem, i7 i7Var) {
        O(h10.t0, context, storyItem, i7Var);
    }

    public final void U(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i3, r6 r6Var, TL_stories.PeerStories peerStories, n9 n9Var, boolean z10) {
        P(h10.t0, context, storyItem, arrayList, i3, r6Var, peerStories, n9Var, z10);
    }

    public final void V(org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.b) {
            Q.presentFragment(d2Var);
        } else {
            Q.presentFragment(d2Var);
            D(false);
        }
    }

    public final void W() {
        ArrayList arrayList;
        this.G0 = null;
        Y(false);
        x(true);
        q9 q9Var = this.A0;
        if (q9Var != null) {
            q9Var.release(null);
            this.A0 = null;
        }
        gi.r3 r3Var = this.E0;
        if (r3Var != null) {
            r3Var.d(0L, null);
        }
        g1 g1Var = this.B0;
        if (g1Var != null) {
            n1 n1Var = n1.a0;
            if (!n1Var.T || n1Var.w != g1Var) {
                if (g1Var.n) {
                    g1Var.s(null);
                } else {
                    g1Var.e();
                }
            }
        }
        this.B0 = null;
        int i3 = 0;
        while (true) {
            arrayList = this.N0;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((q9) arrayList.get(i3)).release(null);
            i3++;
        }
        arrayList.clear();
        a0.h hVar = hp.s1(this.h).P1().m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((aa) hVar.n(i10)).b(false);
        }
        if (this.b) {
            N(false);
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f;
        if (d2Var != null) {
            d2Var.removeSheet(this);
        }
        z1.remove(this);
        this.y0.clear();
        this.f0 = 0.0f;
        A1 = null;
    }

    public final void Y(boolean z10) {
        this.r0 = z10;
        if (z10) {
            a3.o oVar = this.e1.c;
            org.telegram.messenger.g0.r(oVar);
            oVar.run();
        }
        d0();
    }

    public final void Z(boolean z10) {
        j4 currentPeerView;
        j4 currentPeerView2;
        h4 h4Var;
        q9 q9Var;
        i4 i4Var;
        if (this.b1 != z10) {
            this.b1 = z10;
            if (z10 && !this.g1 && (currentPeerView2 = this.o0.getCurrentPeerView()) != null && (h4Var = currentPeerView2.y1) != null && !h4Var.f && h4Var.b == null) {
                if (!this.l0 && !this.k0 && (i4Var = this.H0) != null && ((q9) i4Var.c) != null) {
                    currentPeerView2.M0.invalidate();
                    org.telegram.messenger.p2.e.a();
                }
                i4 i4Var2 = this.H0;
                if (i4Var2 != null && (q9Var = (q9) i4Var2.c) != null && !this.l0) {
                    q9Var.setSeeking(true);
                }
                this.l0 = true;
            }
            d0();
            g9 g9Var = this.o0;
            if (g9Var == null || (currentPeerView = g9Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.b1);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void a(boolean z10) {
        D(true);
    }

    public final void a0(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z10) {
            Window window = launchActivity.getWindow();
            Typeface typeface = org.telegram.messenger.g0.a;
            this.x0 = Build.VERSION.SDK_INT >= 26 ? x7.u.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        }
        if (this.x0) {
            org.telegram.messenger.g0.m3(launchActivity, !z10);
        }
    }

    public final void b0() {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (this.B0 == null || (d2Var = this.f) == null || this.E0 == null) {
            return;
        }
        Activity W = org.telegram.messenger.g0.W(d2Var.getContext());
        if (xf.b.a(W) > 0) {
            g1 g1Var = this.B0;
            n1 n1Var = n1.a0;
            if (g1Var != null && !n1Var.T) {
                n1Var.T = true;
                n1Var.w = g1Var;
                int i3 = g1Var.e;
                n1Var.x = i3;
                hs.f(i3).b(n1Var, hs.G2);
                n1Var.K = n1Var.h();
                n1Var.L = n1Var.f();
                n1Var.N = 1.0f;
                int i10 = 0;
                n1Var.I = false;
                q1.g gVar = new q1.g(n1Var, n1.Y);
                q1.h hVar = new q1.h();
                hVar.a(0.75f);
                hVar.b(650.0f);
                gVar.m = hVar;
                n1Var.Q = gVar;
                q1.g gVar2 = new q1.g(n1Var, n1.Z);
                q1.h hVar2 = new q1.h();
                hVar2.a(0.75f);
                hVar2.b(650.0f);
                gVar2.m = hVar2;
                n1Var.R = gVar2;
                Context context = W != null ? W : org.telegram.messenger.t0.b;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new i1());
                n1Var.y = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                n1Var.y.setStylusScaleEnabled(false);
                n1Var.E = new y00(context, new j1(scaledTouchSlop));
                k1 k1Var = new k1(context, 0);
                k1Var.b = new Path();
                n1Var.e = k1Var;
                l1 l1Var = new l1(context);
                n1Var.d = l1Var;
                l1Var.addView(n1Var.e, mf.c(-1.0f, -1));
                n1Var.e.setOutlineProvider(new cg.p0(2));
                n1Var.e.setClipToOutline(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Ug, n1Var.e, null);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                n1Var.n = k9Var;
                n1Var.e.addView(k9Var, mf.c(-1.0f, -1));
                gi.r3 r3Var = new gi.r3(context, n1Var.x);
                n1Var.f = r3Var;
                r3Var.setAlpha(0.0f);
                n1Var.e.addView(n1Var.f, mf.c(-1.0f, -1));
                sm smVar = new sm(context, 1);
                n1Var.r = smVar;
                n1Var.e.addView(smVar, mf.c(-1.0f, -1));
                FrameLayout frameLayout = new FrameLayout(context);
                n1Var.h = frameLayout;
                frameLayout.setAlpha(0.0f);
                View view = new View(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{1140850688, 0});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                n1Var.h.addView(view, mf.c(-1.0f, -1));
                int L = org.telegram.messenger.g0.L(8.0f);
                ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.pip_video_close);
                int i11 = org.telegram.ui.ActionBar.k6.Vg;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                org.telegram.ui.ActionBar.r6.t(e10, i11, null, mode);
                int i12 = org.telegram.ui.ActionBar.k6.i6;
                e10.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1));
                e10.setPadding(L, L, L, L);
                e10.setOnClickListener(new ai.t(5));
                float f10 = 38;
                float f11 = 4;
                n1Var.h.addView(e10, mf.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_expand);
                org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1));
                imageView.setPadding(L, L, L, L);
                imageView.setOnClickListener(new ai.d(15, g1Var, context));
                n1Var.h.addView(imageView, mf.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
                n1Var.e.addView(n1Var.h, mf.c(-1.0f, -1));
                n1Var.b = (WindowManager) context.getSystemService("window");
                WindowManager.LayoutParams b10 = xf.b.b(context, false);
                n1Var.c = b10;
                int i13 = n1Var.K;
                b10.width = i13;
                b10.height = n1Var.L;
                Point point = org.telegram.messenger.g0.q;
                float L2 = (point.x - i13) - org.telegram.messenger.g0.L(16.0f);
                n1Var.O = L2;
                b10.x = (int) L2;
                WindowManager.LayoutParams layoutParams = n1Var.c;
                float L3 = (point.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f);
                n1Var.P = L3;
                layoutParams.y = (int) L3;
                WindowManager.LayoutParams layoutParams2 = n1Var.c;
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags = 520;
                n1Var.d.setAlpha(0.0f);
                n1Var.d.setScaleX(0.1f);
                n1Var.d.setScaleY(0.1f);
                org.telegram.messenger.g0.y3(n1Var.b, n1Var.d, n1Var.c);
                n1Var.b.addView(n1Var.d, n1Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(xq.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(n1Var.d, (Property<l1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(n1Var.d, (Property<l1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(n1Var.d, (Property<l1, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new m1(i10));
                animatorSet.start();
                n1Var.a();
                hs.e().k(hs.F2, new Object[0]);
                uf.d dVar = n1Var.M;
                if (dVar != null) {
                    dVar.c();
                    n1Var.M = null;
                }
                if (W != null && xf.b.a(W) == 1) {
                    uf.c cVar = new uf.c(W, n1Var);
                    cVar.c = "pip-live-story";
                    cVar.e = 1;
                    cVar.d = org.telegram.messenger.g0.L(10.0f);
                    cVar.j = n1Var.d;
                    cVar.k = n1Var.f.getPlaceholderView();
                    n1Var.M = cVar.a();
                }
            }
            D(true);
        }
    }

    @Override // wf.a
    public final void c(cg cgVar) {
        gi.r3 r3Var = this.F0;
        if (r3Var != null) {
            r3Var.setOnFirstFrameCallback(cgVar);
            this.B0.s(this.F0.getSink());
        }
        if (this.b) {
            org.telegram.messenger.g0.E2(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    public final void c0() {
        boolean z10 = E1;
        E1 = !z10;
        q9 q9Var = this.A0;
        int i3 = 0;
        if (q9Var != null) {
            q9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.N0;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((q9) arrayList.get(i3)).setAudioEnabled(!E1, true);
            i3++;
        }
        j4 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.h1.a(E1, true);
        }
        if (E1) {
            return;
        }
        this.e1.b();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final View d() {
        return this.s;
    }

    public final void d0() {
        if (this.o0 == null) {
            return;
        }
        boolean K = K();
        if (this.b) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f;
            if (d2Var.isPaused() || !d2Var.isLastFragment()) {
                K = true;
            }
        }
        if (org.telegram.ui.i4.v().W) {
            K = true;
        }
        this.o0.setPaused(K);
        q9 q9Var = this.A0;
        if (q9Var != null) {
            if (K) {
                q9Var.pause();
            } else {
                q9Var.play(C1);
            }
        }
        this.o0.E0 = (this.y || this.I0 || this.J0 || this.b1 || this.g1 || this.f0 != 0.0f || this.k1) ? false : true;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = 0;
        if (i3 == hs.x5) {
            if (this.P0 == ((r6) objArr[0])) {
                H();
                g9 g9Var = this.o0;
                r6 r6Var = this.P0;
                g9Var.D(this.h, r6Var.d, r6Var.h());
                s5 s5Var = this.x;
                if (s5Var != null) {
                    TL_stories.StoryItem selectedStory = s5Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.P0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((zi) this.P0.i.get(i11)).l.id) {
                            i12 = i11;
                        }
                        arrayList.add(((zi) this.P0.i.get(i11)).l);
                        i11++;
                    }
                    this.x.b(i12, this.P0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == hs.v5) {
            n9 n9Var = this.u0;
            if (n9Var instanceof i7) {
                i7 i7Var = (i7) n9Var;
                if (!i7Var.r || i7Var.n) {
                    return;
                }
                z6 P1 = hp.s1(this.h).P1();
                ArrayList arrayList2 = i7Var.f ? P1.h : P1.g;
                ArrayList<Long> dialogIds = this.o0.getDialogIds();
                boolean z10 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i13)).peer);
                    if ((!i7Var.h || P1.L(o10)) && !dialogIds.contains(Long.valueOf(o10))) {
                        dialogIds.add(Long.valueOf(o10));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.o0.getAdapter().g();
                }
            }
            s5 s5Var2 = this.x;
            if (s5Var2 != null) {
                ArrayList arrayList3 = s5Var2.h.H;
                while (i11 < arrayList3.size()) {
                    ((o4) arrayList3.get(i11)).b();
                    i11++;
                }
                return;
            }
            return;
        }
        int i14 = hs.c1;
        if (i3 != i14 && i3 != hs.d1) {
            if (i3 == hs.w5) {
                long longValue = ((Long) objArr[0]).longValue();
                int intValue = ((Integer) objArr[1]).intValue();
                TL_stories.StoryItem storyItem = this.U0;
                if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                    this.T0 = true;
                    return;
                }
                return;
            }
            return;
        }
        d0();
        if (i3 != i14) {
            if (this.t1 || H() == null) {
                return;
            }
            H().d1(false);
            return;
        }
        q9 q9Var = this.A0;
        if (q9Var == null) {
            this.u1 = 0L;
            return;
        }
        this.u1 = q9Var.currentPosition;
        this.A0.release(null);
        this.A0 = null;
    }

    @Override // org.telegram.ui.ActionBar.z1, android.content.DialogInterface
    public final void dismiss() {
        D(true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final int e(int i3) {
        return i0.a.f((((1.0f - this.W) * 0.5f) + 0.5f) * this.V, i3, -16777216);
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
    public final void e0() {
        int i3;
        TL_stories.StoryItem storyItem;
        r6 r6Var;
        long j10;
        int i10;
        if (this.u0 == null) {
            this.W0 = false;
            this.P = 0.0f;
            this.O = 0.0f;
            return;
        }
        o9 o9Var = this.t0;
        ImageReceiver imageReceiver = o9Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = o9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            o9Var.c.O0(true, true);
        }
        j4 currentPeerView = this.o0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.f1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i3 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.f1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.O0) {
                            storyItem = this.U0;
                        }
                        long currentDialogId = this.o0.getCurrentDialogId();
                        r6Var = this.P0;
                        if (!(r6Var instanceof l6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i3 = storyItem.messageId;
                        } else if (!(r6Var instanceof u6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i3 = storyItem.id;
                        } else if (r6Var != null) {
                            i3 = this.Q0;
                        }
                        j10 = currentDialogId;
                        i10 = i3;
                        o9Var.a = null;
                        o9Var.m = null;
                        o9Var.b = null;
                        o9Var.c = null;
                        o9Var.e = null;
                        o9Var.f = null;
                        o9Var.g = null;
                        o9Var.d = null;
                        o9Var.l = null;
                        o9Var.h = 0.0f;
                        o9Var.i = 0.0f;
                        o9Var.o = 0;
                        o9Var.j = null;
                        o9Var.k = 1.0f;
                        if (!this.u0.j(j10, this.V0, i10, storyItem == null ? -1 : storyItem.messageType, o9Var)) {
                            this.W0 = false;
                            this.P = 0.0f;
                            this.O = 0.0f;
                            return;
                        }
                        o9Var.o = i10;
                        View view = o9Var.a;
                        if (view == null) {
                            this.W0 = false;
                            this.P = 0.0f;
                            this.O = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = o9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f10 = iArr[0];
                        this.L = f10;
                        this.M = iArr[1];
                        KeyEvent.Callback callback = o9Var.a;
                        if (callback instanceof f7) {
                            this.N = (f7) callback;
                        } else {
                            this.N = null;
                        }
                        this.W0 = false;
                        ImageReceiver imageReceiver3 = o9Var.b;
                        if (imageReceiver3 != null) {
                            this.O = imageReceiver3.r() + f10;
                            this.P = o9Var.b.s() + iArr[1];
                            ImageReceiver imageReceiver4 = o9Var.b;
                            float f11 = imageReceiver4.N0;
                            this.S = f11;
                            this.T = imageReceiver4.O0;
                            o7 o7Var = o9Var.m;
                            if (o7Var != null) {
                                this.S = o7Var.b() * f11;
                                this.T = o9Var.m.b() * this.T;
                            }
                            if (o9Var.a.getParent() instanceof View) {
                                View view3 = (View) o9Var.a.getParent();
                                this.O = (view3.getScaleX() * o9Var.b.r()) + iArr[0];
                                this.P = (view3.getScaleY() * o9Var.b.s()) + iArr[1];
                                this.S = view3.getScaleX() * this.S;
                                this.T = view3.getScaleY() * this.T;
                            }
                            this.W0 = true;
                        } else {
                            ImageReceiver imageReceiver5 = o9Var.c;
                            if (imageReceiver5 != null) {
                                this.O = imageReceiver5.r() + f10;
                                this.P = o9Var.c.s() + iArr[1];
                                ImageReceiver imageReceiver6 = o9Var.c;
                                this.S = imageReceiver6.N0;
                                this.T = imageReceiver6.O0;
                                this.X0 = imageReceiver6.X0;
                            }
                        }
                        o9Var.g.getLocationOnScreen(iArr);
                        float f12 = o9Var.h;
                        if (f12 == 0.0f && o9Var.i == 0.0f) {
                            this.Q = 0.0f;
                            this.R = 0.0f;
                            return;
                        } else {
                            float f13 = iArr[1];
                            this.Q = f12 + f13;
                            this.R = f13 + o9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.U0;
                }
                long currentDialogId2 = this.o0.getCurrentDialogId();
                r6Var = this.P0;
                if (!(r6Var instanceof l6)) {
                }
                if (!(r6Var instanceof u6)) {
                }
                if (r6Var != null) {
                }
                j10 = currentDialogId2;
                i10 = i3;
                o9Var.a = null;
                o9Var.m = null;
                o9Var.b = null;
                o9Var.c = null;
                o9Var.e = null;
                o9Var.f = null;
                o9Var.g = null;
                o9Var.d = null;
                o9Var.l = null;
                o9Var.h = 0.0f;
                o9Var.i = 0.0f;
                o9Var.o = 0;
                o9Var.j = null;
                o9Var.k = 1.0f;
                if (!this.u0.j(j10, this.V0, i10, storyItem == null ? -1 : storyItem.messageType, o9Var)) {
                }
            }
        }
        i3 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.o0.getCurrentDialogId();
        r6Var = this.P0;
        if (!(r6Var instanceof l6)) {
        }
        if (!(r6Var instanceof u6)) {
        }
        if (r6Var != null) {
        }
        j10 = currentDialogId22;
        i10 = i3;
        o9Var.a = null;
        o9Var.m = null;
        o9Var.b = null;
        o9Var.c = null;
        o9Var.e = null;
        o9Var.f = null;
        o9Var.g = null;
        o9Var.d = null;
        o9Var.l = null;
        o9Var.h = 0.0f;
        o9Var.i = 0.0f;
        o9Var.o = 0;
        o9Var.j = null;
        o9Var.k = 1.0f;
        if (!this.u0.j(j10, this.V0, i10, storyItem == null ? -1 : storyItem.messageType, o9Var)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean f() {
        return false;
    }

    @Override // wf.a
    public final Bitmap g() {
        gi.r3 r3Var = this.F0;
        if (r3Var == null || !r3Var.a()) {
            return null;
        }
        return this.F0.getBitmap();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void h(int i3) {
        if (this.q0 != i3) {
            this.q0 = i3;
            this.o0.setKeyboardHeight(i3);
            this.o0.requestLayout();
            s5 s5Var = this.x;
            if (s5Var != null) {
                s5Var.setKeyboardHeight(i3);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean j() {
        return this.L0;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final /* synthetic */ fc k() {
        return null;
    }

    @Override // wf.a
    public final Bitmap l() {
        gi.r3 r3Var = this.E0;
        if (r3Var == null || !r3Var.a()) {
            return null;
        }
        return this.E0.getBitmap();
    }

    @Override // wf.a
    public final boolean o() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f;
        return (d2Var == null || H() == null || org.telegram.messenger.g0.W(d2Var.getContext()) == null || this.B0 == null || this.E0 == null || this.I0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void p() {
        j4 currentPeerView;
        boolean z10 = false;
        if (this.f0 == 0.0f) {
            g9 g9Var = this.o0;
            if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.q0();
            }
            if (z10) {
                return;
            }
            D(true);
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
        A(false);
    }

    @Override // wf.a
    public final View q() {
        gi.r3 r3Var = new gi.r3(this.E0.getContext(), this.h);
        this.F0 = r3Var;
        return r3Var;
    }

    @Override // wf.a
    public final void r(cg cgVar) {
        gi.r3 r3Var = this.F0;
        if (r3Var != null) {
            r3Var.setOnFirstFrameCallback(cgVar);
        }
        if (this.b) {
            org.telegram.messenger.g0.E2(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        gi.r3 r3Var2 = this.F0;
        if (r3Var2 != null) {
            r3Var2.b();
            this.F0 = null;
        }
        this.s.invalidate();
        this.B0.s(this.E0.getSink());
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean s() {
        return !this.I0;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean t(Dialog dialog) {
        try {
            this.v0 = dialog;
            dialog.setOnDismissListener(new ba(this, 4));
            dialog.show();
            d0();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.v0 = null;
            return false;
        }
    }

    public final void x(boolean z10) {
        boolean z11 = org.telegram.messenger.r2.a;
        boolean z12 = !this.n0 || z10;
        if (this.e != z12) {
            this.e = z12;
            SurfaceView surfaceView = this.D0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z12);
            }
            gi.r3 r3Var = this.E0;
            if (r3Var != null) {
                r3Var.setSecure(!z12);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.d2 d2Var = this.f;
                if (d2Var.getParentActivity() != null) {
                    if (z12) {
                        d2Var.getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                        org.telegram.messenger.g0.h2();
                        return;
                    } else {
                        d2Var.getParentActivity().getWindow().addFlags(TLObject.FLAG_13);
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

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean y() {
        return this.b && this.s != null;
    }

    public final void z() {
        if (this.I == null) {
            this.k0 = false;
            this.m0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new x8(this, 2));
            this.I.addListener(new z8(this, 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(org.telegram.ui.ActionBar.h1.w);
            this.I.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final /* synthetic */ void b(boolean z10) {
    }

    @Override // wf.a
    public final /* synthetic */ void i(Canvas canvas) {
    }

    @Override // wf.a
    public final /* synthetic */ void m(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void n(Runnable runnable) {
    }
}
