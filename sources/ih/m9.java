package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.k2, ze.a {
    public static boolean t1;
    public static TL_stories.StoryItem v1;
    public static boolean w1;
    public static boolean z1;
    public boolean A;
    public kh.d4 A0;
    public ValueAnimator B;
    public Uri B0;
    public ValueAnimator C;
    public h4 C0;
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
    public b7 I;
    public final ArrayList I0;
    public float J;
    public boolean J0;
    public float K;
    public n6 K0;
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
    public final n3 X0;
    public boolean Y;
    public boolean Y0;
    public float Z;
    public v7 Z0;
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
    public c9 j0;
    public g j1;
    public n3 k1;
    public int l0;
    public boolean l1;
    public boolean m0;
    public float m1;
    public WindowManager n;
    public float n0;
    public boolean n1;
    public final j9 o0;
    public boolean o1;
    public i9 p0;
    public long p1;
    public Dialog q0;
    public z6 q1;
    public WindowManager.LayoutParams r;
    public org.telegram.ui.ActionBar.k2 r0;
    public ValueAnimator r1;
    public a9 s;
    public boolean s0;
    public boolean s1;
    public final ArrayList t0;
    public c5.c u0;
    public b9 v;
    public l9 v0;
    public o5 w;
    public f1 w0;
    public boolean x;
    public e9 x0;
    public SurfaceView y0;
    public kh.d4 z0;
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

    public m9(org.telegram.ui.ActionBar.o2 o2Var) {
        j9 j9Var = new j9();
        j9Var.k = 1.0f;
        this.o0 = j9Var;
        this.t0 = new ArrayList();
        this.D0 = true;
        this.F0 = new AnimationNotificationsLocker();
        this.I0 = new ArrayList();
        this.V0 = false;
        this.X0 = new n3(this, 4);
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

    public static boolean i(m9 m9Var, a9 a9Var, float f10, float f11, boolean z10) {
        p2 p2Var;
        p2 p2Var2;
        if (a9Var == null) {
            return false;
        }
        if (m9Var.T0) {
            return true;
        }
        if (m9Var.w != null && m9Var.a0 != 0.0f) {
            return true;
        }
        i4 currentPeerView = m9Var.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f10 - m9Var.v.getX()) - m9Var.j0.getX()) - currentPeerView.getX(), ((f11 - m9Var.v.getY()) - m9Var.j0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.r2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (p2Var2 = currentPeerView.X1) != null && p2Var2.getVisibility() == 0) {
            if (f11 > currentPeerView.X1.getY() + currentPeerView.getY() + m9Var.j0.getY() + m9Var.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (p2Var = currentPeerView.X1) == null || !p2Var.v0()) && m9Var.q1 == null) {
            return AndroidUtilities.findClickableView(a9Var, f10, f11, currentPeerView);
        }
        return true;
    }

    public static void j(m9 m9Var) {
        bg.t tVar;
        mt editField;
        i4 currentPeerView = m9Var.j0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.X1 == null || (((tVar = currentPeerView.X2) != null && tVar.getVisibility() == 0) || (editField = currentPeerView.X1.getEditField()) == null)) {
            m9Var.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new n3(m9Var, 6), 200L);
    }

    public static void k(m9 m9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(m9Var.T, m9Var.S) / AndroidUtilities.dp(80.0f)));
        if (m9Var.R != clamp01) {
            m9Var.R = clamp01;
            m9Var.o();
            i4 currentPeerView = m9Var.j0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.t2) {
                currentPeerView.invalidate();
            }
            f1 f1Var = m9Var.w0;
            if (f1Var != null) {
                f1Var.v((1.0f - m9Var.R) * m9Var.Q);
            }
        }
        a9 a9Var = m9Var.s;
        if (a9Var != null) {
            a9Var.invalidate();
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

    public final void A(int i9, Context context, TL_stories.StoryItem storyItem, i9 i9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i9;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i9).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i9, context, storyItem, arrayList, 0, null, null, i9Var, false);
            }
        }
    }

    public final void B(int i9, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, n6 n6Var, TL_stories.PeerStories peerStories, i9 i9Var, boolean z10) {
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
        l9 l9Var = this.v0;
        if (l9Var != null) {
            l9Var.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.n1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.Q0 = storyItem == null ? 0 : storyItem.messageId;
        this.J0 = storyItem != null && n6Var == null && peerStories == null;
        this.O0 = false;
        if (storyItem != null) {
            this.P0 = storyItem;
            v1 = storyItem;
        }
        this.K0 = n6Var;
        this.M0 = peerStories;
        this.p0 = i9Var;
        this.N0 = z10;
        this.h = i9;
        this.S = 0.0f;
        this.T = 0.0f;
        c9 c9Var = this.j0;
        if (c9Var != null) {
            c9Var.setHorizontalProgressToDismiss(0.0f);
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
            this.e0 = new GestureDetector(new w8(this));
            this.s = new a9(this, context, R);
        }
        int i11 = 26;
        if (this.v == null) {
            this.v = new b9(context, this);
            c9 c9Var2 = new c9(this, this.h, context, this, this.y);
            this.j0 = c9Var2;
            c9Var2.setDelegate(new d9(this, n6Var, arrayList, context));
            this.v.addView(this.j0, g7.e6.e(-1, -1, 1));
            this.u0 = new c5.c(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.y0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.y0.setZOrderOnTop(false);
                this.u0.addView(this.y0);
            } else {
                e9 e9Var = new e9(context, this);
                this.x0 = e9Var;
                this.u0.addView(e9Var);
            }
            kh.d4 d4Var = new kh.d4(context, this.h);
            this.z0 = d4Var;
            d4Var.setVisibility(8);
            this.u0.addView(this.z0);
            v7 v7Var = new v7(context);
            Paint paint = new Paint(1);
            v7Var.a = paint;
            v7Var.c = new androidx.activity.i(v7Var, i11);
            v7Var.d = new org.telegram.ui.Components.y5(v7Var);
            v7Var.e = new org.telegram.ui.Components.y5(v7Var);
            paint.setColor(-1);
            this.Z0 = v7Var;
            this.v.addView(v7Var, g7.e6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        kh.d4 d4Var2 = this.z0;
        if (d4Var2 != null) {
            d4Var2.setAccount(this.h);
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
        if (n6Var != null) {
            this.j0.D(this.h, n6Var.d, n6Var.h());
        } else {
            c9 c9Var3 = this.j0;
            int i12 = this.h;
            c9Var3.w0 = arrayList;
            c9Var3.u0 = i12;
            c9Var3.setAdapter(null);
            c9Var3.setAdapter(c9Var3.v0);
            c9Var3.setCurrentItem(i10);
            c9Var3.y0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        b9 b9Var = this.v;
        gh.i3 i3Var = new gh.i3(this, i11);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(b9Var, i3Var);
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
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 2));
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

    public final void C(Context context, int i9, n6 n6Var, e7 e7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(n6Var.d));
        this.L0 = i9;
        G(context, null, arrayList, 0, n6Var, null, e7Var, false);
    }

    public final void D(Context context, long j10, i9 i9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        v6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i9 = storiesController.a;
        TL_stories.PeerStories y10 = storiesController.y(j10);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (p7.w(i9, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.g.remove(y10);
                storiesController.h.remove(y10);
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, i9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, i9 i9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.t0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, i9Var, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, e7 e7Var) {
        A(UserConfig.selectedAccount, context, storyItem, e7Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i9, n6 n6Var, TL_stories.PeerStories peerStories, i9 i9Var, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i9, n6Var, peerStories, i9Var, z10);
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
        l9 l9Var = this.v0;
        if (l9Var != null) {
            l9Var.release(null);
            this.v0 = null;
        }
        kh.d4 d4Var = this.z0;
        if (d4Var != null) {
            d4Var.d(0L, null);
        }
        f1 f1Var = this.w0;
        if (f1Var != null) {
            k1 k1Var = k1.V;
            if (!k1Var.O || k1Var.v != f1Var) {
                if (f1Var.n) {
                    f1Var.s(null);
                } else {
                    f1Var.e();
                }
            }
        }
        this.w0 = null;
        int i9 = 0;
        while (true) {
            arrayList = this.I0;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((l9) arrayList.get(i9)).release(null);
            i9++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((v9) hVar.n(i10)).b(false);
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
            androidx.activity.i iVar = this.Z0.c;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            iVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        i4 currentPeerView;
        i4 currentPeerView2;
        g4 g4Var;
        l9 l9Var;
        h4 h4Var;
        if (this.W0 != z10) {
            this.W0 = z10;
            if (z10 && !this.b1 && (currentPeerView2 = this.j0.getCurrentPeerView()) != null && (g4Var = currentPeerView2.K1) != null && !g4Var.f && g4Var.b == null) {
                if (!this.g0 && !this.f0 && (h4Var = this.C0) != null && h4Var.b != null) {
                    currentPeerView2.Y0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                h4 h4Var2 = this.C0;
                if (h4Var2 != null && (l9Var = h4Var2.b) != null && !this.g0) {
                    l9Var.setSeeking(true);
                }
                this.g0 = true;
            }
            P();
            c9 c9Var = this.j0;
            if (c9Var == null || (currentPeerView = c9Var.getCurrentPeerView()) == null) {
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
        if (af.d.a(findActivity) > 0) {
            k1.o(findActivity, this.w0);
            q(true);
        }
    }

    public final void O() {
        boolean z10 = z1;
        z1 = !z10;
        l9 l9Var = this.v0;
        int i9 = 0;
        if (l9Var != null) {
            l9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.I0;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((l9) arrayList.get(i9)).setAudioEnabled(!z1, true);
            i9++;
        }
        i4 currentPeerView = this.j0.getCurrentPeerView();
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
        boolean w8 = w();
        if (this.b) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f;
            if (o2Var.isPaused() || !o2Var.isLastFragment()) {
                w8 = true;
            }
        }
        if (org.telegram.ui.l4.x().R) {
            w8 = true;
        }
        this.j0.setPaused(w8);
        l9 l9Var = this.v0;
        if (l9Var != null) {
            if (w8) {
                l9Var.pause();
            } else {
                l9Var.play(x1);
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
        int i9;
        TL_stories.StoryItem storyItem;
        n6 n6Var;
        long j10;
        int i10;
        if (this.p0 == null) {
            this.R0 = false;
            this.K = 0.0f;
            this.J = 0.0f;
            return;
        }
        j9 j9Var = this.o0;
        ImageReceiver imageReceiver = j9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = j9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            j9Var.c.setVisible(true, true);
        }
        i4 currentPeerView = this.j0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.r1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i9 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.r1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.J0) {
                            storyItem = this.P0;
                        }
                        long currentDialogId = this.j0.getCurrentDialogId();
                        n6Var = this.K0;
                        if (!(n6Var instanceof h6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i9 = storyItem.messageId;
                        } else if (!(n6Var instanceof q6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i9 = storyItem.id;
                        } else if (n6Var != null) {
                            i9 = this.L0;
                        }
                        j10 = currentDialogId;
                        i10 = i9;
                        j9Var.a = null;
                        j9Var.m = null;
                        j9Var.b = null;
                        j9Var.c = null;
                        j9Var.e = null;
                        j9Var.f = null;
                        j9Var.g = null;
                        j9Var.d = null;
                        j9Var.l = null;
                        j9Var.h = 0.0f;
                        j9Var.i = 0.0f;
                        j9Var.o = 0;
                        j9Var.j = null;
                        j9Var.k = 1.0f;
                        if (!this.p0.y0(j10, this.Q0, i10, storyItem == null ? -1 : storyItem.messageType, j9Var)) {
                            this.R0 = false;
                            this.K = 0.0f;
                            this.J = 0.0f;
                            return;
                        }
                        j9Var.o = i10;
                        View view = j9Var.a;
                        if (view == null) {
                            this.R0 = false;
                            this.K = 0.0f;
                            this.J = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = j9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.t1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f10 = iArr[0];
                        this.G = f10;
                        this.H = iArr[1];
                        KeyEvent.Callback callback = j9Var.a;
                        if (callback instanceof b7) {
                            this.I = (b7) callback;
                        } else {
                            this.I = null;
                        }
                        this.R0 = false;
                        ImageReceiver imageReceiver3 = j9Var.b;
                        if (imageReceiver3 != null) {
                            this.J = imageReceiver3.getCenterX() + f10;
                            this.K = j9Var.b.getCenterY() + iArr[1];
                            this.N = j9Var.b.getImageWidth();
                            this.O = j9Var.b.getImageHeight();
                            l7 l7Var = j9Var.m;
                            if (l7Var != null) {
                                this.N = l7Var.b() * this.N;
                                this.O = j9Var.m.b() * this.O;
                            }
                            if (j9Var.a.getParent() instanceof View) {
                                View view3 = (View) j9Var.a.getParent();
                                this.J = (view3.getScaleX() * j9Var.b.getCenterX()) + iArr[0];
                                this.K = (view3.getScaleY() * j9Var.b.getCenterY()) + iArr[1];
                                this.N = view3.getScaleX() * this.N;
                                this.O = view3.getScaleY() * this.O;
                            }
                            this.R0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = j9Var.c;
                            if (imageReceiver4 != null) {
                                this.J = imageReceiver4.getCenterX() + f10;
                                this.K = j9Var.c.getCenterY() + iArr[1];
                                this.N = j9Var.c.getImageWidth();
                                this.O = j9Var.c.getImageHeight();
                                this.S0 = j9Var.c.getRoundRadius();
                            }
                        }
                        j9Var.g.getLocationOnScreen(iArr);
                        float f11 = j9Var.h;
                        if (f11 == 0.0f && j9Var.i == 0.0f) {
                            this.L = 0.0f;
                            this.M = 0.0f;
                            return;
                        } else {
                            float f12 = iArr[1];
                            this.L = f11 + f12;
                            this.M = f12 + j9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.P0;
                }
                long currentDialogId2 = this.j0.getCurrentDialogId();
                n6Var = this.K0;
                if (!(n6Var instanceof h6)) {
                }
                if (!(n6Var instanceof q6)) {
                }
                if (n6Var != null) {
                }
                j10 = currentDialogId2;
                i10 = i9;
                j9Var.a = null;
                j9Var.m = null;
                j9Var.b = null;
                j9Var.c = null;
                j9Var.e = null;
                j9Var.f = null;
                j9Var.g = null;
                j9Var.d = null;
                j9Var.l = null;
                j9Var.h = 0.0f;
                j9Var.i = 0.0f;
                j9Var.o = 0;
                j9Var.j = null;
                j9Var.k = 1.0f;
                if (!this.p0.y0(j10, this.Q0, i10, storyItem == null ? -1 : storyItem.messageType, j9Var)) {
                }
            }
        }
        i9 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.j0.getCurrentDialogId();
        n6Var = this.K0;
        if (!(n6Var instanceof h6)) {
        }
        if (!(n6Var instanceof q6)) {
        }
        if (n6Var != null) {
        }
        j10 = currentDialogId22;
        i10 = i9;
        j9Var.a = null;
        j9Var.m = null;
        j9Var.b = null;
        j9Var.c = null;
        j9Var.e = null;
        j9Var.f = null;
        j9Var.g = null;
        j9Var.d = null;
        j9Var.l = null;
        j9Var.h = 0.0f;
        j9Var.i = 0.0f;
        j9Var.o = 0;
        j9Var.j = null;
        j9Var.k = 1.0f;
        if (!this.p0.y0(j10, this.Q0, i10, storyItem == null ? -1 : storyItem.messageType, j9Var)) {
        }
    }

    @Override // ze.a
    public final Bitmap a() {
        kh.d4 d4Var = this.A0;
        if (d4Var == null || !d4Var.a()) {
            return null;
        }
        return this.A0.getBitmap();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean attachedToParent() {
        return this.b && this.s != null;
    }

    @Override // ze.a
    public final Bitmap c() {
        kh.d4 d4Var = this.z0;
        if (d4Var == null || !d4Var.a()) {
            return null;
        }
        return this.z0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = 0;
        if (i9 == NotificationCenter.storiesListUpdated) {
            if (this.K0 == ((n6) objArr[0])) {
                t();
                c9 c9Var = this.j0;
                n6 n6Var = this.K0;
                c9Var.D(this.h, n6Var.d, n6Var.h());
                o5 o5Var = this.w;
                if (o5Var != null) {
                    TL_stories.StoryItem selectedStory = o5Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.K0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((MessageObject) this.K0.i.get(i11)).storyItem.id) {
                            i12 = i11;
                        }
                        arrayList.add(((MessageObject) this.K0.i.get(i11)).storyItem);
                        i11++;
                    }
                    this.w.b(i12, this.K0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.storiesUpdated) {
            i9 i9Var = this.p0;
            if (i9Var instanceof e7) {
                e7 e7Var = (e7) i9Var;
                if (!e7Var.r || e7Var.n) {
                    return;
                }
                v6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = e7Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.j0.getDialogIds();
                boolean z10 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i13)).peer);
                    if ((!e7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.j0.getAdapter().g();
                }
            }
            o5 o5Var2 = this.w;
            if (o5Var2 != null) {
                ArrayList arrayList3 = o5Var2.h.C;
                while (i11 < arrayList3.size()) {
                    ((l4) arrayList3.get(i11)).b();
                    i11++;
                }
                return;
            }
            return;
        }
        int i14 = NotificationCenter.openArticle;
        if (i9 != i14 && i9 != NotificationCenter.articleClosed) {
            if (i9 == NotificationCenter.storyDeleted) {
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
        if (i9 != i14) {
            if (this.o1 || t() == null) {
                return;
            }
            t().f1(false);
            return;
        }
        l9 l9Var = this.v0;
        if (l9Var == null) {
            this.p1 = 0L;
            return;
        }
        this.p1 = l9Var.currentPosition;
        this.v0.release(null);
        this.v0 = null;
    }

    @Override // org.telegram.ui.ActionBar.k2, android.content.DialogInterface
    public final void dismiss() {
        q(true);
    }

    @Override // ze.a
    public final void e(af.f fVar) {
        kh.d4 d4Var = this.A0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(fVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        kh.d4 d4Var2 = this.A0;
        if (d4Var2 != null) {
            d4Var2.b();
            this.A0 = null;
        }
        this.s.invalidate();
        this.w0.s(this.z0.getSink());
    }

    @Override // ze.a
    public final boolean f() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f;
        return (o2Var == null || t() == null || AndroidUtilities.findActivity(o2Var.getContext()) == null || this.w0 == null || this.z0 == null || this.D0) ? false : true;
    }

    @Override // ze.a
    public final void g(af.f fVar) {
        kh.d4 d4Var = this.A0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(fVar);
            this.w0.s(this.A0.getSink());
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final /* synthetic */ oc getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor(int i9) {
        return i0.a.d((((1.0f - this.R) * 0.5f) + 0.5f) * this.Q, i9, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View getWindowView() {
        return this.s;
    }

    @Override // ze.a
    public final View h() {
        kh.d4 d4Var = new kh.d4(this.z0.getContext(), this.h);
        this.A0 = d4Var;
        return d4Var;
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
            kh.d4 d4Var = this.z0;
            if (d4Var != null) {
                d4Var.setSecure(!z11);
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
            ofFloat.addUpdateListener(new u8(this, 2));
            this.D.addListener(new v8(this, 1));
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
                float f10 = this.a0;
                o5 o5Var = this.w;
                float f11 = o5Var.c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.a0 = f12;
                    o5Var.setOffset(f12);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? this.w.c : 0.0f);
            this.r1 = ofFloat;
            ofFloat.addUpdateListener(new u8(this, 3));
            this.r1.addListener(new hg.b0(4, this, z10));
            if (z10) {
                this.r1.setDuration(350L);
                this.r1.setInterpolator(gr.h);
            } else {
                this.r1.setDuration(350L);
                this.r1.setInterpolator(gr.f);
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
        i4 currentPeerView;
        boolean z10 = false;
        if (this.a0 == 0.0f) {
            c9 c9Var = this.j0;
            if (c9Var != null && (currentPeerView = c9Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.s0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        o5 o5Var = this.w;
        if (o5Var.x > 0) {
            AndroidUtilities.hideKeyboard(o5Var);
            return true;
        }
        g5 currentPage = o5Var.getCurrentPage();
        if (currentPage != null) {
            n4 n4Var = currentPage.r;
            v4 v4Var = currentPage.f;
            if (v4Var != null && v4Var.b) {
                v4Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - n4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                n4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                n4Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            o5 o5Var = new o5(this.v.getContext(), this);
            this.w = o5Var;
            this.v.addView(o5Var, 0);
        }
        i4 currentPeerView = this.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.K0 == null) {
                this.w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < this.K0.i.size(); i9++) {
                arrayList.add(((MessageObject) this.K0.i.get(i9)).storyItem);
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
        ofFloat.addUpdateListener(new u8(this, 0));
        if (z10) {
            y();
        } else {
            this.K = 0.0f;
            this.J = 0.0f;
            j9 j9Var = this.o0;
            ImageReceiver imageReceiver = j9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = j9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            j9Var.c = null;
            j9Var.b = null;
        }
        AndroidUtilities.runOnUIThread(new n3(this, 2), 16L);
        if (this.Y0) {
            this.Y0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (z1) {
            O();
            return;
        }
        i4 currentPeerView = this.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            g4 g4Var = currentPeerView.K1;
            if (!g4Var.j() && g4Var.e) {
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
    public final void setKeyboardHeightFromParent(int i9) {
        if (this.l0 != i9) {
            this.l0 = i9;
            this.j0.setKeyboardHeight(i9);
            this.j0.requestLayout();
            o5 o5Var = this.w;
            if (o5Var != null) {
                o5Var.setKeyboardHeight(i9);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.q0 = dialog;
            dialog.setOnDismissListener(new eh.l(this, 5));
            dialog.show();
            P();
            return true;
        } catch (Throwable th) {
            FileLog.e(th);
            this.q0 = null;
            return false;
        }
    }

    public final i4 t() {
        c9 c9Var = this.j0;
        if (c9Var == null) {
            return null;
        }
        return c9Var.getCurrentPeerView();
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
            j9 j9Var = this.o0;
            ImageReceiver imageReceiver = j9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = j9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            j9Var.c = null;
            j9Var.b = null;
            b9 b9Var = this.v;
            if (b9Var != null) {
                b9Var.a(true);
            }
            this.F0.unlock();
            h4 h4Var = this.C0;
            if (h4Var != null) {
                h4Var.a();
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
            n3 n3Var = this.k1;
            if (n3Var != null) {
                n3Var.run();
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
        i4 currentPeerView;
        int selectedPosition;
        this.d = true;
        j9 j9Var = this.o0;
        ImageReceiver imageReceiver = j9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = j9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            j9Var.c.setVisible(true, true);
        }
        if (this.K0 != null && (currentPeerView = this.j0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.K0.i.size()) {
            this.Q0 = ((MessageObject) this.K0.i.get(selectedPosition)).getId();
        }
        if (this.p0 != null) {
            long currentDialogId = this.j0.getCurrentDialogId();
            int i9 = this.Q0;
            if (this.K0 instanceof q6) {
                i4 currentPeerView2 = this.j0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.r1;
                    if (selectedPosition2 >= 0 && selectedPosition2 < arrayList.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList.get(selectedPosition2);
                        if (storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i9 = storyItem.id;
                        }
                    }
                }
                storyItem = null;
                if (storyItem != null) {
                }
            }
            this.p0.T(currentDialogId, i9, new n3(this, 5));
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

    @Override // ze.a
    public final /* synthetic */ void b(Canvas canvas) {
    }

    @Override // ze.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
