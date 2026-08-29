package lh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.k2, cf.a {
    public static boolean t1;
    public static TL_stories.StoryItem v1;
    public static boolean w1;
    public static boolean z1;
    public boolean A;
    public nh.y3 A0;
    public ValueAnimator B;
    public Uri B0;
    public ValueAnimator C;
    public c4 C0;
    public ValueAnimator D;
    public boolean D0;
    public long E;
    public boolean E0;
    public int F;
    public final AnimationNotificationsLocker F0;
    public float G;
    public boolean G0;
    public float H;
    public boolean H0;
    public y6 I;
    public final ArrayList I0;
    public float J;
    public boolean J0;
    public float K;
    public k6 K0;
    public float L;
    public int L0;
    public float M;
    public TL_stories.PeerStories M0;
    public float N;
    public boolean N0;
    public float O;
    public boolean O0;
    public TL_stories.StoryItem P0;
    public float Q;
    public int Q0;
    public float R;
    public boolean R0;
    public float S;
    public int[] S0;
    public float T;
    public boolean T0;
    public float U;
    public boolean U0;
    public float V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public float X;
    public final j3 X0;
    public boolean Y;
    public boolean Y0;
    public float Z;
    public s7 Z0;
    public float a0;
    public final LongSparseIntArray a1;
    public boolean b0;
    public boolean b1;
    public boolean c0;
    public boolean c1;
    public boolean d0;
    public boolean d1;
    public GestureDetector e0;
    public boolean e1;
    public final org.telegram.ui.ActionBar.o2 f;
    public boolean f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public int h;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public y8 j0;
    public m5 j1;
    public j3 k1;
    public int l0;
    public boolean l1;
    public boolean m0;
    public float m1;
    public WindowManager n;
    public float n0;
    public boolean n1;
    public final f9 o0;
    public boolean o1;
    public e9 p0;
    public long p1;
    public Dialog q0;
    public w6 q1;
    public WindowManager.LayoutParams r;
    public org.telegram.ui.ActionBar.k2 r0;
    public ValueAnimator r1;
    public w8 s;
    public boolean s0;
    public boolean s1;
    public final ArrayList t0;
    public e5.c u0;
    public x8 v;
    public h9 v0;
    public l5 w;
    public d1 w0;
    public boolean x;
    public a9 x0;
    public SurfaceView y0;
    public nh.y3 z0;
    public static final ArrayList u1 = new ArrayList();
    public static float x1 = 1.0f;
    public static boolean y1 = true;
    public static final LongSparseArray A1 = new LongSparseArray();
    public boolean a = SharedConfig.useSurfaceInStories;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b y = new b();
    public final RectF P = new RectF();
    public final float[] k0 = new float[2];

    public i9(org.telegram.ui.ActionBar.o2 o2Var) {
        f9 f9Var = new f9();
        f9Var.k = 1.0f;
        this.o0 = f9Var;
        this.t0 = new ArrayList();
        this.D0 = true;
        this.F0 = new AnimationNotificationsLocker();
        this.I0 = new ArrayList();
        this.V0 = false;
        this.X0 = new j3(this, 4);
        this.a1 = new LongSparseIntArray();
        new Paint(1);
        this.f = o2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        A1.put(j10 + (j10 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean i(i9 i9Var, w8 w8Var, float f9, float f10, boolean z10) {
        n2 n2Var;
        n2 n2Var2;
        if (w8Var == null) {
            return false;
        }
        if (i9Var.T0) {
            return true;
        }
        if (i9Var.w != null && i9Var.a0 != 0.0f) {
            return true;
        }
        d4 currentPeerView = i9Var.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f9 - i9Var.v.getX()) - i9Var.j0.getX()) - currentPeerView.getX(), ((f10 - i9Var.v.getY()) - i9Var.j0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.r2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (n2Var2 = currentPeerView.X1) != null && n2Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.X1.getY() + currentPeerView.getY() + i9Var.j0.getY() + i9Var.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (n2Var = currentPeerView.X1) == null || !n2Var.w0()) && i9Var.q1 == null) {
            return AndroidUtilities.findClickableView(w8Var, f9, f10, currentPeerView);
        }
        return true;
    }

    public static void j(i9 i9Var) {
        eg.r rVar;
        st editField;
        d4 currentPeerView = i9Var.j0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.X1 == null || (((rVar = currentPeerView.X2) != null && rVar.getVisibility() == 0) || (editField = currentPeerView.X1.getEditField()) == null)) {
            i9Var.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new j3(i9Var, 6), 200L);
    }

    public static void k(i9 i9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(i9Var.T, i9Var.S) / AndroidUtilities.dp(80.0f)));
        if (i9Var.R != clamp01) {
            i9Var.R = clamp01;
            i9Var.o();
            d4 currentPeerView = i9Var.j0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.t2) {
                currentPeerView.invalidate();
            }
            d1 d1Var = i9Var.w0;
            if (d1Var != null) {
                d1Var.v((1.0f - i9Var.R) * i9Var.Q);
            }
        }
        w8 w8Var = i9Var.s;
        if (w8Var != null) {
            w8Var.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) A1.get(j10 + (j10 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        return v1 != null && (messageObject.type == 23 || messageObject.isWebpage()) && !w1 && v1.messageId == messageObject.getId() && v1.messageType != 3;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.t0;
        if (!isContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (this.i0) {
            arrayList2.clear();
            return;
        }
        x1 = 1.0f;
        h9 h9Var = this.v0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        int i12 = 1;
        boolean z11 = (AndroidUtilities.isTablet() || this.n1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.Q0 = storyItem == null ? 0 : storyItem.messageId;
        this.J0 = storyItem != null && k6Var == null && peerStories == null;
        this.O0 = false;
        if (storyItem != null) {
            this.P0 = storyItem;
            v1 = storyItem;
        }
        this.K0 = k6Var;
        this.M0 = peerStories;
        this.p0 = e9Var;
        this.N0 = z10;
        this.h = i10;
        this.S = 0.0f;
        this.T = 0.0f;
        y8 y8Var = this.j0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.j0.B0 = 0;
        }
        this.Z = 0.0f;
        this.V = 0.0f;
        this.h0 = false;
        this.R = 0.0f;
        this.i0 = true;
        this.W0 = false;
        this.V0 = false;
        this.a1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.X0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.r.flags = -2147417728;
        this.D0 = false;
        this.Y0 = false;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (this.s == null) {
            this.e0 = new GestureDetector(new s8(this));
            this.s = new w8(this, context, R);
        }
        if (this.v == null) {
            this.v = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.y);
            this.j0 = y8Var2;
            y8Var2.setDelegate(new z8(this, k6Var, arrayList, context));
            this.v.addView(this.j0, i7.f6.e(-1, -1, 1));
            this.u0 = new e5.c(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.y0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.y0.setZOrderOnTop(false);
                this.u0.addView(this.y0);
            } else {
                a9 a9Var = new a9(context, this);
                this.x0 = a9Var;
                this.u0.addView(a9Var);
            }
            nh.y3 y3Var = new nh.y3(context, this.h);
            this.z0 = y3Var;
            y3Var.setVisibility(8);
            this.u0.addView(this.z0);
            s7 s7Var = new s7(context);
            Paint paint = new Paint(1);
            s7Var.a = paint;
            s7Var.c = new m7(s7Var, i12);
            s7Var.d = new org.telegram.ui.Components.d6(s7Var);
            s7Var.e = new org.telegram.ui.Components.d6(s7Var);
            paint.setColor(-1);
            this.Z0 = s7Var;
            this.v.addView(s7Var, i7.f6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        nh.y3 y3Var2 = this.z0;
        if (y3Var2 != null) {
            y3Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.u0);
        this.s.addView(this.u0);
        SurfaceView surfaceView2 = this.y0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.s.addView(this.v);
        this.s.setClipChildren(false);
        if (this.J0) {
            Q();
        }
        if (k6Var != null) {
            this.j0.D(this.h, k6Var.d, k6Var.h());
        } else {
            y8 y8Var3 = this.j0;
            int i13 = this.h;
            y8Var3.w0 = arrayList;
            y8Var3.u0 = i13;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.v0);
            y8Var3.setCurrentItem(i11);
            y8Var3.y0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        x8 x8Var = this.v;
        l4.s0 s0Var = new l4.s0(this, 9);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(x8Var, s0Var);
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.s);
            if (!this.c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 2));
            }
        }
        this.s.requestLayout();
        w1 = true;
        Q();
        this.Q = 0.0f;
        o();
        t1 = true;
        if (y1) {
            y1 = false;
            z1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            z(true);
        }
        if (!this.b) {
            u1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, e9 e9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                A(i10, context, storyItem, arrayList, 0, null, null, e9Var, false);
            }
        }
    }

    public final void C(Context context, int i10, k6 k6Var, b7 b7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(k6Var.d));
        this.L0 = i10;
        F(context, null, arrayList, 0, k6Var, null, b7Var, false);
    }

    public final void D(Context context, long j10, e9 e9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        s6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y8 = storiesController.y(j10);
        if (y8 != null) {
            int i11 = 0;
            while (i11 < y8.stories.size()) {
                if (l7.w(i10, y8.stories.get(i11))) {
                    y8.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y8.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.g.remove(y8);
                storiesController.h.remove(y8);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        F(context, null, arrayList, 0, null, null, e9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, e9 e9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.t0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        F(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, e9Var, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        A(UserConfig.selectedAccount, context, storyItem, arrayList, i10, k6Var, peerStories, e9Var, z10);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, b7 b7Var) {
        B(UserConfig.selectedAccount, context, storyItem, b7Var);
    }

    public final void H(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.b) {
            R.presentFragment(o2Var);
        } else {
            R.presentFragment(o2Var);
            q(false);
        }
    }

    public final void I() {
        ArrayList arrayList;
        this.B0 = null;
        K(false);
        l(true);
        h9 h9Var = this.v0;
        if (h9Var != null) {
            h9Var.release(null);
            this.v0 = null;
        }
        nh.y3 y3Var = this.z0;
        if (y3Var != null) {
            y3Var.d(0L, null);
        }
        d1 d1Var = this.w0;
        if (d1Var != null) {
            i1 i1Var = i1.V;
            if (!i1Var.O || i1Var.v != d1Var) {
                if (d1Var.n) {
                    d1Var.s(null);
                } else {
                    d1Var.e();
                }
            }
        }
        this.w0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.I0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((r9) hVar.n(i11)).b(false);
        }
        if (this.b) {
            z(false);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f;
        if (o2Var != null) {
            o2Var.removeSheet(this);
        }
        u1.remove(this);
        this.t0.clear();
        this.a0 = 0.0f;
        v1 = null;
    }

    public final void K(boolean z10) {
        this.m0 = z10;
        if (z10) {
            m7 m7Var = this.Z0.c;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            m7Var.run();
        }
        P();
    }

    public final void L(boolean z10) {
        d4 currentPeerView;
        d4 currentPeerView2;
        b4 b4Var;
        h9 h9Var;
        c4 c4Var;
        if (this.W0 != z10) {
            this.W0 = z10;
            if (z10 && !this.b1 && (currentPeerView2 = this.j0.getCurrentPeerView()) != null && (b4Var = currentPeerView2.K1) != null && !b4Var.f && b4Var.b == null) {
                if (!this.g0 && !this.f0 && (c4Var = this.C0) != null && c4Var.b != null) {
                    currentPeerView2.Y0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                c4 c4Var2 = this.C0;
                if (c4Var2 != null && (h9Var = c4Var2.b) != null && !this.g0) {
                    h9Var.setSeeking(true);
                }
                this.g0 = true;
            }
            P();
            y8 y8Var = this.j0;
            if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.W0);
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z10) {
            this.s0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
        }
        if (this.s0) {
            AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.w0 == null || (o2Var = this.f) == null || this.z0 == null) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(o2Var.getContext());
        if (df.d.a(findActivity) > 0) {
            i1.o(findActivity, this.w0);
            q(true);
        }
    }

    public final void O() {
        boolean z10 = z1;
        z1 = !z10;
        h9 h9Var = this.v0;
        int i10 = 0;
        if (h9Var != null) {
            h9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.I0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).setAudioEnabled(!z1, true);
            i10++;
        }
        d4 currentPeerView = this.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.t1.a(z1, true);
        }
        if (z1) {
            return;
        }
        this.Z0.b();
    }

    public final void P() {
        if (this.j0 == null) {
            return;
        }
        boolean w10 = w();
        if (this.b) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f;
            if (o2Var.isPaused() || !o2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.m4.x().R) {
            w10 = true;
        }
        this.j0.setPaused(w10);
        h9 h9Var = this.v0;
        if (h9Var != null) {
            if (w10) {
                h9Var.pause();
            } else {
                h9Var.play(x1);
            }
        }
        this.j0.z0 = (this.x || this.D0 || this.E0 || this.W0 || this.b1 || this.a0 != 0.0f || this.f1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int i10;
        TL_stories.StoryItem storyItem;
        k6 k6Var;
        long j10;
        int i11;
        if (this.p0 == null) {
            this.R0 = false;
            this.K = 0.0f;
            this.J = 0.0f;
            return;
        }
        f9 f9Var = this.o0;
        ImageReceiver imageReceiver = f9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.c.setVisible(true, true);
        }
        d4 currentPeerView = this.j0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.r1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i10 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.r1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.J0) {
                            storyItem = this.P0;
                        }
                        long currentDialogId = this.j0.getCurrentDialogId();
                        k6Var = this.K0;
                        if (!(k6Var instanceof e6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(k6Var instanceof n6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (k6Var != null) {
                            i10 = this.L0;
                        }
                        j10 = currentDialogId;
                        i11 = i10;
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
                        if (!this.p0.K0(j10, this.Q0, i11, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
                            this.R0 = false;
                            this.K = 0.0f;
                            this.J = 0.0f;
                            return;
                        }
                        f9Var.o = i11;
                        View view = f9Var.a;
                        if (view == null) {
                            this.R0 = false;
                            this.K = 0.0f;
                            this.J = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = f9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.s1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f9 = iArr[0];
                        this.G = f9;
                        this.H = iArr[1];
                        KeyEvent.Callback callback = f9Var.a;
                        if (callback instanceof y6) {
                            this.I = (y6) callback;
                        } else {
                            this.I = null;
                        }
                        this.R0 = false;
                        ImageReceiver imageReceiver3 = f9Var.b;
                        if (imageReceiver3 != null) {
                            this.J = imageReceiver3.getCenterX() + f9;
                            this.K = f9Var.b.getCenterY() + iArr[1];
                            this.N = f9Var.b.getImageWidth();
                            this.O = f9Var.b.getImageHeight();
                            h7 h7Var = f9Var.m;
                            if (h7Var != null) {
                                this.N = h7Var.b() * this.N;
                                this.O = f9Var.m.b() * this.O;
                            }
                            if (f9Var.a.getParent() instanceof View) {
                                View view3 = (View) f9Var.a.getParent();
                                this.J = (view3.getScaleX() * f9Var.b.getCenterX()) + iArr[0];
                                this.K = (view3.getScaleY() * f9Var.b.getCenterY()) + iArr[1];
                                this.N = view3.getScaleX() * this.N;
                                this.O = view3.getScaleY() * this.O;
                            }
                            this.R0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = f9Var.c;
                            if (imageReceiver4 != null) {
                                this.J = imageReceiver4.getCenterX() + f9;
                                this.K = f9Var.c.getCenterY() + iArr[1];
                                this.N = f9Var.c.getImageWidth();
                                this.O = f9Var.c.getImageHeight();
                                this.S0 = f9Var.c.getRoundRadius();
                            }
                        }
                        f9Var.g.getLocationOnScreen(iArr);
                        float f10 = f9Var.h;
                        if (f10 == 0.0f && f9Var.i == 0.0f) {
                            this.L = 0.0f;
                            this.M = 0.0f;
                            return;
                        } else {
                            float f11 = iArr[1];
                            this.L = f10 + f11;
                            this.M = f11 + f9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.P0;
                }
                long currentDialogId2 = this.j0.getCurrentDialogId();
                k6Var = this.K0;
                if (!(k6Var instanceof e6)) {
                }
                if (!(k6Var instanceof n6)) {
                }
                if (k6Var != null) {
                }
                j10 = currentDialogId2;
                i11 = i10;
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
                if (!this.p0.K0(j10, this.Q0, i11, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
                }
            }
        }
        i10 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.j0.getCurrentDialogId();
        k6Var = this.K0;
        if (!(k6Var instanceof e6)) {
        }
        if (!(k6Var instanceof n6)) {
        }
        if (k6Var != null) {
        }
        j10 = currentDialogId22;
        i11 = i10;
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
        if (!this.p0.K0(j10, this.Q0, i11, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
        }
    }

    @Override // cf.a
    public final void a(c2.p pVar) {
        nh.y3 y3Var = this.A0;
        if (y3Var != null) {
            y3Var.setOnFirstFrameCallback(pVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        nh.y3 y3Var2 = this.A0;
        if (y3Var2 != null) {
            y3Var2.b();
            this.A0 = null;
        }
        this.s.invalidate();
        this.w0.s(this.z0.getSink());
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean attachedToParent() {
        return this.b && this.s != null;
    }

    @Override // cf.a
    public final Bitmap b() {
        nh.y3 y3Var = this.A0;
        if (y3Var == null || !y3Var.a()) {
            return null;
        }
        return this.A0.getBitmap();
    }

    @Override // cf.a
    public final Bitmap d() {
        nh.y3 y3Var = this.z0;
        if (y3Var == null || !y3Var.a()) {
            return null;
        }
        return this.z0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.K0 == ((k6) objArr[0])) {
                t();
                y8 y8Var = this.j0;
                k6 k6Var = this.K0;
                y8Var.D(this.h, k6Var.d, k6Var.h());
                l5 l5Var = this.w;
                if (l5Var != null) {
                    TL_stories.StoryItem selectedStory = l5Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.K0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((MessageObject) this.K0.i.get(i12)).storyItem.id) {
                            i13 = i12;
                        }
                        arrayList.add(((MessageObject) this.K0.i.get(i12)).storyItem);
                        i12++;
                    }
                    this.w.b(i13, this.K0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            e9 e9Var = this.p0;
            if (e9Var instanceof b7) {
                b7 b7Var = (b7) e9Var;
                if (!b7Var.r || b7Var.n) {
                    return;
                }
                s6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = b7Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.j0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!b7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.j0.getAdapter().g();
                }
            }
            l5 l5Var2 = this.w;
            if (l5Var2 != null) {
                ArrayList arrayList3 = l5Var2.h.C;
                while (i12 < arrayList3.size()) {
                    ((h4) arrayList3.get(i12)).b();
                    i12++;
                }
                return;
            }
            return;
        }
        int i15 = NotificationCenter.openArticle;
        if (i10 != i15 && i10 != NotificationCenter.articleClosed) {
            if (i10 == NotificationCenter.storyDeleted) {
                long longValue = ((Long) objArr[0]).longValue();
                int intValue = ((Integer) objArr[1]).intValue();
                TL_stories.StoryItem storyItem = this.P0;
                if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                    this.O0 = true;
                    return;
                }
                return;
            }
            return;
        }
        P();
        if (i10 != i15) {
            if (this.o1 || t() == null) {
                return;
            }
            t().f1(false);
            return;
        }
        h9 h9Var = this.v0;
        if (h9Var == null) {
            this.p1 = 0L;
            return;
        }
        this.p1 = h9Var.currentPosition;
        this.v0.release(null);
        this.v0 = null;
    }

    @Override // org.telegram.ui.ActionBar.k2, android.content.DialogInterface
    public final void dismiss() {
        q(true);
    }

    @Override // cf.a
    public final void e(c2.p pVar) {
        nh.y3 y3Var = this.A0;
        if (y3Var != null) {
            y3Var.setOnFirstFrameCallback(pVar);
            this.w0.s(this.A0.getSink());
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    @Override // cf.a
    public final boolean g() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f;
        return (o2Var == null || t() == null || AndroidUtilities.findActivity(o2Var.getContext()) == null || this.w0 == null || this.z0 == null || this.D0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final /* synthetic */ tc getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.R) * 0.5f) + 0.5f) * this.Q, i10, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View getWindowView() {
        return this.s;
    }

    @Override // cf.a
    public final View h() {
        nh.y3 y3Var = new nh.y3(this.z0.getContext(), this.h);
        this.A0 = y3Var;
        return y3Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isFullyVisible() {
        return this.G0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isShown() {
        return !this.D0;
    }

    public final void l(boolean z10) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        boolean z11 = !this.i0 || z10;
        if (this.e != z11) {
            this.e = z11;
            SurfaceView surfaceView = this.y0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            nh.y3 y3Var = this.z0;
            if (y3Var != null) {
                y3Var.setSecure(!z11);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.o2 o2Var = this.f;
                if (o2Var.getParentActivity() != null) {
                    if (z11) {
                        o2Var.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        o2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                }
                return;
            }
            if (z11) {
                this.r.flags &= -8193;
                AndroidUtilities.logFlagSecure();
            } else {
                this.r.flags |= 8192;
                AndroidUtilities.logFlagSecure();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void m() {
        if (this.D == null) {
            this.f0 = false;
            this.h0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 2));
            this.D.addListener(new r8(this, 1));
            this.D.setDuration(250L);
            this.D.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            this.D.start();
        }
    }

    public final void n(boolean z10) {
        if (this.r1 != null) {
            return;
        }
        if (this.l0 != 0) {
            AndroidUtilities.hideKeyboard(this.w);
            return;
        }
        if (this.Y || this.a0 != 0.0f) {
            this.F0.lock();
            if (!z10) {
                float f9 = this.a0;
                l5 l5Var = this.w;
                float f10 = l5Var.c;
                if (f9 == f10) {
                    float f11 = f10 - 1.0f;
                    this.a0 = f11;
                    l5Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? this.w.c : 0.0f);
            this.r1 = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 3));
            this.r1.addListener(new bg.z2(7, this, z10));
            if (z10) {
                this.r1.setDuration(350L);
                this.r1.setInterpolator(jr.h);
            } else {
                this.r1.setDuration(350L);
                this.r1.setInterpolator(jr.f);
            }
            this.r1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.C1) == null) {
            return;
        }
        launchActivity.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onAttachedBackPressed() {
        d4 currentPeerView;
        boolean z10 = false;
        if (this.a0 == 0.0f) {
            y8 y8Var = this.j0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.s0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        l5 l5Var = this.w;
        if (l5Var.x > 0) {
            AndroidUtilities.hideKeyboard(l5Var);
            return true;
        }
        c5 currentPage = l5Var.getCurrentPage();
        if (currentPage != null) {
            j4 j4Var = currentPage.r;
            r4 r4Var = currentPage.f;
            if (r4Var != null && r4Var.b) {
                r4Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - j4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                j4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                j4Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            l5 l5Var = new l5(this.v.getContext(), this);
            this.w = l5Var;
            this.v.addView(l5Var, 0);
        }
        d4 currentPeerView = this.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.K0 == null) {
                this.w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.K0.i.size(); i10++) {
                arrayList.add(((MessageObject) this.K0.i.get(i10)).storyItem);
            }
            this.w.b(currentPeerView.getListPosition(), this.K0.d, arrayList);
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.s);
        this.D0 = true;
        this.d1 = true;
        P();
        M(false);
        Q();
        this.F0.lock();
        this.X = this.S;
        this.A = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q, 0.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new q8(this, 0));
        if (z10) {
            y();
        } else {
            this.K = 0.0f;
            this.J = 0.0f;
            f9 f9Var = this.o0;
            ImageReceiver imageReceiver = f9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.c = null;
            f9Var.b = null;
        }
        AndroidUtilities.runOnUIThread(new j3(this, 2), 16L);
        if (this.Y0) {
            this.Y0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (z1) {
            O();
            return;
        }
        d4 currentPeerView = this.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            b4 b4Var = currentPeerView.K1;
            if (!b4Var.j() && b4Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.Z0.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.t0.add(runnable);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.l0 != i10) {
            this.l0 = i10;
            this.j0.setKeyboardHeight(i10);
            this.j0.requestLayout();
            l5 l5Var = this.w;
            if (l5Var != null) {
                l5Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.q0 = dialog;
            dialog.setOnDismissListener(new cg.d0(this, 7));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.q0 = null;
            return false;
        }
    }

    public final d4 t() {
        y8 y8Var = this.j0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.i0) {
            AndroidUtilities.hideKeyboard(this.s);
            this.D0 = true;
            this.G0 = false;
            this.Q = 0.0f;
            this.R = 0.0f;
            P();
            this.K = 0.0f;
            this.J = 0.0f;
            f9 f9Var = this.o0;
            ImageReceiver imageReceiver = f9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            f9Var.c = null;
            f9Var.b = null;
            x8 x8Var = this.v;
            if (x8Var != null) {
                x8Var.a(true);
            }
            this.F0.unlock();
            c4 c4Var = this.C0;
            if (c4Var != null) {
                c4Var.a();
            }
            I();
            if (this.b) {
                AndroidUtilities.removeFromParent(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            this.i0 = false;
            this.d = false;
            o();
            j3 j3Var = this.k1;
            if (j3Var != null) {
                j3Var.run();
                this.k1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.T0 || this.V0 || this.U0 || this.H0 || this.m0 || this.x || this.q0 != null || this.r0 != null || this.D0 || this.E0 || this.Q != 1.0f || this.a0 != 0.0f || this.e1) {
            return true;
        }
        if ((this.h1 && this.a) || this.g1 || this.f1 || this.l1 || this.R != 0.0f || this.q1 != null) {
            return true;
        }
        return (!this.b || (o2Var = this.f) == null || o2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        TL_stories.StoryItem storyItem;
        d4 currentPeerView;
        int selectedPosition;
        this.d = true;
        f9 f9Var = this.o0;
        ImageReceiver imageReceiver = f9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.c.setVisible(true, true);
        }
        if (this.K0 != null && (currentPeerView = this.j0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.K0.i.size()) {
            this.Q0 = ((MessageObject) this.K0.i.get(selectedPosition)).getId();
        }
        if (this.p0 != null) {
            long currentDialogId = this.j0.getCurrentDialogId();
            int i10 = this.Q0;
            if (this.K0 instanceof n6) {
                d4 currentPeerView2 = this.j0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.r1;
                    if (selectedPosition2 >= 0 && selectedPosition2 < arrayList.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList.get(selectedPosition2);
                        if (storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        }
                    }
                }
                storyItem = null;
                if (storyItem != null) {
                }
            }
            this.p0.l1(currentDialogId, i10, new j3(this, 5));
        }
    }

    public final void z(boolean z10) {
        Activity findActivity = AndroidUtilities.findActivity(this.f.getContext());
        if (findActivity != null) {
            try {
                findActivity.setRequestedOrientation(z10 ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z10) {
                findActivity.getWindow().addFlags(128);
            } else {
                findActivity.getWindow().clearFlags(128);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void dismiss(boolean z10) {
        q(true);
    }

    @Override // cf.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // cf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
