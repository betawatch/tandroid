package bi;

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
import android.graphics.RectF;
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
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class sb implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.i2, tf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public t1 A0;
    public kb B0;
    public SurfaceView C0;
    public di.j4 D0;
    public boolean E;
    public di.j4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public p5 G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public boolean I0;
    public int J;
    public final AnimationNotificationsLocker J0;
    public float K;
    public boolean K0;
    public float L;
    public boolean L0;
    public d9 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public o8 O0;
    public float P;
    public int P0;
    public float Q;
    public TL_stories.PeerStories Q0;
    public float R;
    public boolean R0;
    public float S;
    public boolean S0;
    public TL_stories.StoryItem T0;
    public float U;
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
    public boolean a0;
    public boolean a1;
    public float b0;
    public final r4 b1;
    public boolean c0;
    public boolean c1;
    public float d0;
    public y9 d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final org.telegram.ui.ActionBar.m2 f;
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
    public boolean m1;
    public WindowManager n;
    public ib n0;
    public la n1;
    public r4 o1;
    public int p0;
    public boolean p1;
    public boolean q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public gb s;
    public final pb s0;
    public boolean s1;
    public ob t0;
    public long t1;
    public Dialog u0;
    public b9 u1;
    public hb v;
    public org.telegram.ui.ActionBar.i2 v0;
    public ValueAnimator v1;
    public e7 w;
    public boolean w0;
    public boolean w1;
    public boolean x;
    public final ArrayList x0;
    public org.telegram.ui.n4 y0;
    public rb z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = SharedConfig.useSurfaceInStories;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b y = new b();
    public final RectF T = new RectF();
    public final float[] o0 = new float[2];

    public sb(org.telegram.ui.ActionBar.m2 m2Var) {
        pb pbVar = new pb();
        pbVar.k = 1.0f;
        this.s0 = pbVar;
        this.x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new r4(this, 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = m2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        E1.put(j10 + (j10 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean i(sb sbVar, gb gbVar, float f7, float f10, boolean z10) {
        q3 q3Var;
        q3 q3Var2;
        if (gbVar == null) {
            return false;
        }
        if (sbVar.X0) {
            return true;
        }
        if (sbVar.w != null && sbVar.e0 != 0.0f) {
            return true;
        }
        q5 currentPeerView = sbVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f7 - sbVar.v.getX()) - sbVar.n0.getX()) - currentPeerView.getX(), ((f10 - sbVar.v.getY()) - sbVar.n0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.v2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (q3Var2 = currentPeerView.b2) != null && q3Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.b2.getY() + currentPeerView.getY() + sbVar.n0.getY() + sbVar.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (q3Var = currentPeerView.b2) == null || !q3Var.u0()) && sbVar.u1 == null) {
            return AndroidUtilities.findClickableView(gbVar, f7, f10, currentPeerView);
        }
        return true;
    }

    public static void j(sb sbVar) {
        f4 f4Var;
        nu editField;
        q5 currentPeerView = sbVar.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.b2 == null || (((f4Var = currentPeerView.b3) != null && f4Var.getVisibility() == 0) || (editField = currentPeerView.b2.getEditField()) == null)) {
            sbVar.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new r4(sbVar, 6), 200L);
    }

    public static void k(sb sbVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(sbVar.X, sbVar.W) / AndroidUtilities.dp(80.0f)));
        if (sbVar.V != clamp01) {
            sbVar.V = clamp01;
            sbVar.o();
            q5 currentPeerView = sbVar.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.x2) {
                currentPeerView.invalidate();
            }
            t1 t1Var = sbVar.A0;
            if (t1Var != null) {
                t1Var.v((1.0f - sbVar.V) * sbVar.U);
            }
        }
        gb gbVar = sbVar.s;
        if (gbVar != null) {
            gbVar.invalidate();
        }
    }

    public static CharSequence u(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j10 + (j10 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        return z1 != null && (messageObject.type == 23 || messageObject.isWebpage()) && !A1 && z1.messageId == messageObject.getId() && z1.messageType != 3;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ob obVar) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, obVar, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, o8 o8Var, TL_stories.PeerStories peerStories, ob obVar, boolean z10) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.x0;
        if (!isContextSafe) {
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
        B1 = 1.0f;
        rb rbVar = this.z0;
        if (rbVar != null) {
            rbVar.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.r1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && o8Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = o8Var;
        this.Q0 = peerStories;
        this.t0 = obVar;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        ib ibVar = this.n0;
        if (ibVar != null) {
            ibVar.setHorizontalProgressToDismiss(0.0f);
            this.n0.F0 = 0;
        }
        this.d0 = 0.0f;
        this.Z = 0.0f;
        this.l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.a1 = false;
        this.Z0 = false;
        this.e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.b1);
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
        this.H0 = false;
        this.c1 = false;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (this.s == null) {
            this.i0 = new GestureDetector(new cb(this));
            this.s = new gb(this, context, R);
        }
        if (this.v == null) {
            this.v = new hb(context, this);
            ib ibVar2 = new ib(this, this.h, context, this, this.y);
            this.n0 = ibVar2;
            ibVar2.setDelegate(new jb(this, o8Var, arrayList, context));
            this.v.addView(this.n0, w7.a6.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.n4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                kb kbVar = new kb(context, this);
                this.B0 = kbVar;
                this.y0.addView(kbVar);
            }
            di.j4 j4Var = new di.j4(context, this.h);
            this.D0 = j4Var;
            j4Var.setVisibility(8);
            this.y0.addView(this.D0);
            y9 y9Var = new y9(context);
            Paint paint = new Paint(1);
            y9Var.a = paint;
            y9Var.c = new androidx.activity.i(y9Var, 10);
            y9Var.d = new org.telegram.ui.Components.g6(y9Var);
            y9Var.e = new org.telegram.ui.Components.g6(y9Var);
            paint.setColor(-1);
            this.d1 = y9Var;
            this.v.addView(y9Var, w7.a6.a(-1.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 0));
        }
        di.j4 j4Var2 = this.D0;
        if (j4Var2 != null) {
            j4Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.y0);
        this.s.addView(this.y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.s.addView(this.v);
        this.s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (o8Var != null) {
            this.n0.D(this.h, o8Var.d, o8Var.h());
        } else {
            ib ibVar3 = this.n0;
            int i12 = this.h;
            ibVar3.A0 = arrayList;
            ibVar3.y0 = i12;
            ibVar3.setAdapter(null);
            ibVar3.setAdapter(ibVar3.z0);
            ibVar3.setCurrentItem(i11);
            ibVar3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        hb hbVar = this.v;
        a1.c cVar = new a1.c(this, 11);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.i(hbVar, cVar);
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
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 1));
            }
        }
        this.s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        x1 = true;
        if (C1) {
            C1 = false;
            D1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            z(true);
        }
        if (!this.b) {
            y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void C(Context context, int i10, o8 o8Var, g9 g9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(o8Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, o8Var, null, g9Var, false);
    }

    public final void D(Context context, long j10, ob obVar) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        x8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y3 = storiesController.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (s9.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, obVar, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, ob obVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, obVar, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, g9 g9Var) {
        A(UserConfig.selectedAccount, context, storyItem, g9Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, o8 o8Var, TL_stories.PeerStories peerStories, ob obVar, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, o8Var, peerStories, obVar, z10);
    }

    public final void H(org.telegram.ui.ActionBar.m2 m2Var) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.b) {
            R.presentFragment(m2Var);
        } else {
            R.presentFragment(m2Var);
            q(false);
        }
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        rb rbVar = this.z0;
        if (rbVar != null) {
            rbVar.release(null);
            this.z0 = null;
        }
        di.j4 j4Var = this.D0;
        if (j4Var != null) {
            j4Var.d(0L, null);
        }
        t1 t1Var = this.A0;
        if (t1Var != null) {
            b2 b2Var = b2.Z;
            if (!b2Var.S || b2Var.v != t1Var) {
                if (t1Var.n) {
                    t1Var.s(null);
                } else {
                    t1Var.e();
                }
            }
        }
        this.A0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((rb) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((bc) hVar.n(i11)).b(false);
        }
        if (this.b) {
            z(false);
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f;
        if (m2Var != null) {
            m2Var.removeSheet(this);
        }
        y1.remove(this);
        this.x0.clear();
        this.e0 = 0.0f;
        z1 = null;
    }

    public final void K(boolean z10) {
        this.q0 = z10;
        if (z10) {
            androidx.activity.i iVar = this.d1.c;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            iVar.run();
        }
        P();
    }

    public final void L(boolean z10) {
        q5 currentPeerView;
        q5 currentPeerView2;
        o5 o5Var;
        rb rbVar;
        p5 p5Var;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (o5Var = currentPeerView2.O1) != null && !o5Var.f && o5Var.b == null) {
                if (!this.k0 && !this.j0 && (p5Var = this.G0) != null && ((rb) p5Var.c) != null) {
                    currentPeerView2.c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                p5 p5Var2 = this.G0;
                if (p5Var2 != null && (rbVar = (rb) p5Var2.c) != null && !this.k0) {
                    rbVar.setSeeking(true);
                }
                this.k0 = true;
            }
            P();
            ib ibVar = this.n0;
            if (ibVar == null || (currentPeerView = ibVar.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.a1);
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z10) {
            this.w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
        }
        if (this.w0) {
            AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.m2 m2Var;
        if (this.A0 == null || (m2Var = this.f) == null || this.D0 == null) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(m2Var.getContext());
        if (uf.b.a(findActivity) > 0) {
            t1 t1Var = this.A0;
            b2 b2Var = b2.Z;
            int i10 = 1;
            if (t1Var != null && !b2Var.S) {
                b2Var.S = true;
                b2Var.v = t1Var;
                int i11 = t1Var.e;
                b2Var.w = i11;
                NotificationCenter.getInstance(i11).addObserver(b2Var, NotificationCenter.liveStoryUpdated);
                b2Var.J = b2Var.n();
                b2Var.K = b2Var.m();
                b2Var.M = 1.0f;
                int i12 = 0;
                b2Var.H = false;
                o1.k kVar = new o1.k(b2Var, b2.X);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                b2Var.P = kVar;
                o1.k kVar2 = new o1.k(b2Var, b2.Y);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                b2Var.Q = kVar2;
                Context context = findActivity != null ? findActivity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new w1());
                b2Var.x = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                b2Var.x.setStylusScaleEnabled(false);
                b2Var.y = new ji.d4(context, new x1(scaledTouchSlop));
                y1 y1Var = new y1(context, 0);
                y1Var.b = new Path();
                b2Var.e = y1Var;
                z1 z1Var = new z1(context);
                b2Var.d = z1Var;
                z1Var.addView(b2Var.e, w7.a6.d(-1.0f, -1));
                b2Var.e.setOutlineProvider(new a2(i12));
                b2Var.e.setClipToOutline(true);
                b2Var.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.gg, false));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                b2Var.n = z9Var;
                b2Var.e.addView(z9Var, w7.a6.d(-1.0f, -1));
                di.j4 j4Var = new di.j4(context, b2Var.w);
                b2Var.f = j4Var;
                j4Var.setAlpha(0.0f);
                b2Var.e.addView(b2Var.f, w7.a6.d(-1.0f, -1));
                xn xnVar = new xn(context, i10);
                b2Var.r = xnVar;
                b2Var.e.addView(xnVar, w7.a6.d(-1.0f, -1));
                FrameLayout frameLayout = new FrameLayout(context);
                b2Var.h = frameLayout;
                frameLayout.setAlpha(0.0f);
                View view = new View(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{1140850688, 0});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                b2Var.h.addView(view, w7.a6.d(-1.0f, -1));
                int dp = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i13 = org.telegram.ui.ActionBar.g6.hg;
                imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                int i14 = org.telegram.ui.ActionBar.g6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 1, -1));
                imageView.setPadding(dp, dp, dp, dp);
                imageView.setOnClickListener(new ah.f(i10));
                float f7 = 38;
                float f10 = 4;
                b2Var.h.addView(imageView, w7.a6.a(f7, 0.0f, f10, f10, 0.0f, 38, 5));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 1, -1));
                imageView2.setPadding(dp, dp, dp, dp);
                imageView2.setOnClickListener(new u1(i12, t1Var, context));
                b2Var.h.addView(imageView2, w7.a6.a(f7, 0.0f, f10, 48, 0.0f, 38, 5));
                b2Var.e.addView(b2Var.h, w7.a6.d(-1.0f, -1));
                b2Var.b = (WindowManager) context.getSystemService("window");
                WindowManager.LayoutParams b10 = uf.b.b(context, false);
                b2Var.c = b10;
                int i15 = b2Var.J;
                b10.width = i15;
                b10.height = b2Var.K;
                float dp2 = (AndroidUtilities.displaySize.x - i15) - AndroidUtilities.dp(16.0f);
                b2Var.N = dp2;
                b10.x = (int) dp2;
                WindowManager.LayoutParams layoutParams = b2Var.c;
                float dp3 = (AndroidUtilities.displaySize.y - b2Var.K) - AndroidUtilities.dp(16.0f);
                b2Var.O = dp3;
                layoutParams.y = (int) dp3;
                WindowManager.LayoutParams layoutParams2 = b2Var.c;
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags = 520;
                b2Var.d.setAlpha(0.0f);
                b2Var.d.setScaleX(0.1f);
                b2Var.d.setScaleY(0.1f);
                AndroidUtilities.setPreferredMaxRefreshRate(b2Var.b, b2Var.d, b2Var.c);
                b2Var.b.addView(b2Var.d, b2Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(es.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(b2Var.d, (Property<z1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(b2Var.d, (Property<z1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(b2Var.d, (Property<z1, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new ah.z(i10));
                animatorSet.start();
                b2Var.i();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                rf.d dVar = b2Var.L;
                if (dVar != null) {
                    dVar.c();
                    b2Var.L = null;
                }
                if (findActivity != null && uf.b.a(findActivity) == 1) {
                    rf.c cVar = new rf.c(findActivity, b2Var);
                    cVar.c = "pip-live-story";
                    cVar.e = 1;
                    cVar.d = AndroidUtilities.dp(10.0f);
                    cVar.j = b2Var.d;
                    cVar.k = b2Var.f.getPlaceholderView();
                    b2Var.L = cVar.a();
                }
            }
            q(true);
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        rb rbVar = this.z0;
        int i10 = 0;
        if (rbVar != null) {
            rbVar.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((rb) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        q5 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.x1.a(D1, true);
        }
        if (D1) {
            return;
        }
        this.d1.b();
    }

    public final void P() {
        if (this.n0 == null) {
            return;
        }
        boolean w9 = w();
        if (this.b) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f;
            if (m2Var.isPaused() || !m2Var.isLastFragment()) {
                w9 = true;
            }
        }
        if (org.telegram.ui.k4.x().V) {
            w9 = true;
        }
        this.n0.setPaused(w9);
        rb rbVar = this.z0;
        if (rbVar != null) {
            if (w9) {
                rbVar.pause();
            } else {
                rbVar.play(B1);
            }
        }
        this.n0.D0 = (this.x || this.H0 || this.I0 || this.a1 || this.f1 || this.e0 != 0.0f || this.j1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int i10;
        TL_stories.StoryItem storyItem;
        o8 o8Var;
        long j10;
        int i11;
        if (this.t0 == null) {
            this.V0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        pb pbVar = this.s0;
        ImageReceiver imageReceiver = pbVar.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = pbVar.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            pbVar.c.setVisible(true, true);
        }
        q5 currentPeerView = this.n0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.v1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i10 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.v1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.N0) {
                            storyItem = this.T0;
                        }
                        long currentDialogId = this.n0.getCurrentDialogId();
                        o8Var = this.O0;
                        if (!(o8Var instanceof g8) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(o8Var instanceof r8) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (o8Var != null) {
                            i10 = this.P0;
                        }
                        j10 = currentDialogId;
                        i11 = i10;
                        pbVar.a = null;
                        pbVar.m = null;
                        pbVar.b = null;
                        pbVar.c = null;
                        pbVar.e = null;
                        pbVar.f = null;
                        pbVar.g = null;
                        pbVar.d = null;
                        pbVar.l = null;
                        pbVar.h = 0.0f;
                        pbVar.i = 0.0f;
                        pbVar.o = 0;
                        pbVar.j = null;
                        pbVar.k = 1.0f;
                        if (!this.t0.H0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, pbVar)) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        pbVar.o = i11;
                        View view = pbVar.a;
                        if (view == null) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = pbVar.a;
                        if (view2 instanceof org.telegram.ui.Cells.u1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f7 = iArr[0];
                        this.K = f7;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = pbVar.a;
                        if (callback instanceof d9) {
                            this.M = (d9) callback;
                        } else {
                            this.M = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = pbVar.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.getCenterX() + f7;
                            this.O = pbVar.b.getCenterY() + iArr[1];
                            this.R = pbVar.b.getImageWidth();
                            this.S = pbVar.b.getImageHeight();
                            m9 m9Var = pbVar.m;
                            if (m9Var != null) {
                                this.R = m9Var.b() * this.R;
                                this.S = pbVar.m.b() * this.S;
                            }
                            if (pbVar.a.getParent() instanceof View) {
                                View view3 = (View) pbVar.a.getParent();
                                this.N = (view3.getScaleX() * pbVar.b.getCenterX()) + iArr[0];
                                this.O = (view3.getScaleY() * pbVar.b.getCenterY()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = pbVar.c;
                            if (imageReceiver4 != null) {
                                this.N = imageReceiver4.getCenterX() + f7;
                                this.O = pbVar.c.getCenterY() + iArr[1];
                                this.R = pbVar.c.getImageWidth();
                                this.S = pbVar.c.getImageHeight();
                                this.W0 = pbVar.c.getRoundRadius();
                            }
                        }
                        pbVar.g.getLocationOnScreen(iArr);
                        float f10 = pbVar.h;
                        if (f10 == 0.0f && pbVar.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f11 = iArr[1];
                            this.P = f10 + f11;
                            this.Q = f11 + pbVar.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                o8Var = this.O0;
                if (!(o8Var instanceof g8)) {
                }
                if (!(o8Var instanceof r8)) {
                }
                if (o8Var != null) {
                }
                j10 = currentDialogId2;
                i11 = i10;
                pbVar.a = null;
                pbVar.m = null;
                pbVar.b = null;
                pbVar.c = null;
                pbVar.e = null;
                pbVar.f = null;
                pbVar.g = null;
                pbVar.d = null;
                pbVar.l = null;
                pbVar.h = 0.0f;
                pbVar.i = 0.0f;
                pbVar.o = 0;
                pbVar.j = null;
                pbVar.k = 1.0f;
                if (!this.t0.H0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, pbVar)) {
                }
            }
        }
        i10 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.n0.getCurrentDialogId();
        o8Var = this.O0;
        if (!(o8Var instanceof g8)) {
        }
        if (!(o8Var instanceof r8)) {
        }
        if (o8Var != null) {
        }
        j10 = currentDialogId22;
        i11 = i10;
        pbVar.a = null;
        pbVar.m = null;
        pbVar.b = null;
        pbVar.c = null;
        pbVar.e = null;
        pbVar.f = null;
        pbVar.g = null;
        pbVar.d = null;
        pbVar.l = null;
        pbVar.h = 0.0f;
        pbVar.i = 0.0f;
        pbVar.o = 0;
        pbVar.j = null;
        pbVar.k = 1.0f;
        if (!this.t0.H0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, pbVar)) {
        }
    }

    @Override // tf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        di.j4 j4Var = this.E0;
        if (j4Var != null) {
            j4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean attachedToParent() {
        return this.b && this.s != null;
    }

    @Override // tf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        di.j4 j4Var = this.E0;
        if (j4Var != null) {
            j4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        di.j4 j4Var2 = this.E0;
        if (j4Var2 != null) {
            j4Var2.b();
            this.E0 = null;
        }
        this.s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override // tf.a
    public final Bitmap c() {
        di.j4 j4Var = this.E0;
        if (j4Var == null || !j4Var.a()) {
            return null;
        }
        return this.E0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((o8) objArr[0])) {
                t();
                ib ibVar = this.n0;
                o8 o8Var = this.O0;
                ibVar.D(this.h, o8Var.d, o8Var.h());
                e7 e7Var = this.w;
                if (e7Var != null) {
                    TL_stories.StoryItem selectedStory = e7Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((MessageObject) this.O0.i.get(i12)).storyItem.id) {
                            i13 = i12;
                        }
                        arrayList.add(((MessageObject) this.O0.i.get(i12)).storyItem);
                        i12++;
                    }
                    this.w.b(i13, this.O0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            ob obVar = this.t0;
            if (obVar instanceof g9) {
                g9 g9Var = (g9) obVar;
                if (!g9Var.r || g9Var.n) {
                    return;
                }
                x8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = g9Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!g9Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.n0.getAdapter().g();
                }
            }
            e7 e7Var2 = this.w;
            if (e7Var2 != null) {
                ArrayList arrayList3 = e7Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((x5) arrayList3.get(i12)).b();
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
                TL_stories.StoryItem storyItem = this.T0;
                if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                    this.S0 = true;
                    return;
                }
                return;
            }
            return;
        }
        P();
        if (i10 != i15) {
            if (this.s1 || t() == null) {
                return;
            }
            t().f1(false);
            return;
        }
        rb rbVar = this.z0;
        if (rbVar == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = rbVar.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        q(true);
    }

    @Override // tf.a
    public final Bitmap e() {
        di.j4 j4Var = this.D0;
        if (j4Var == null || !j4Var.a()) {
            return null;
        }
        return this.D0.getBitmap();
    }

    @Override // tf.a
    public final boolean g() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f;
        return (m2Var == null || t() == null || AndroidUtilities.findActivity(m2Var.getContext()) == null || this.A0 == null || this.D0 == null || this.H0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final /* synthetic */ zc getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final View getWindowView() {
        return this.s;
    }

    @Override // tf.a
    public final View h() {
        di.j4 j4Var = new di.j4(this.D0.getContext(), this.h);
        this.E0 = j4Var;
        return j4Var;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean isFullyVisible() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean isShown() {
        return !this.H0;
    }

    public final void l(boolean z10) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        boolean z11 = !this.m0 || z10;
        if (this.e != z11) {
            this.e = z11;
            SurfaceView surfaceView = this.C0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            di.j4 j4Var = this.D0;
            if (j4Var != null) {
                j4Var.setSecure(!z11);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.m2 m2Var = this.f;
                if (m2Var.getParentActivity() != null) {
                    if (z11) {
                        m2Var.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        m2Var.getParentActivity().getWindow().addFlags(8192);
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.j0 = false;
            this.l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new ab(this, 2));
            this.H.addListener(new bb(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.o1.w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.v1 != null) {
            return;
        }
        if (this.p0 != 0) {
            AndroidUtilities.hideKeyboard(this.w);
            return;
        }
        if (this.c0 || this.e0 != 0.0f) {
            this.J0.lock();
            if (!z10) {
                float f7 = this.e0;
                e7 e7Var = this.w;
                float f10 = e7Var.c;
                if (f7 == f10) {
                    float f11 = f10 - 1.0f;
                    this.e0 = f11;
                    e7Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? this.w.c : 0.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new ab(this, 3));
            this.v1.addListener(new ah.p0(4, this, z10));
            if (z10) {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(es.h);
            } else {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(es.f);
            }
            this.v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.G1) == null) {
            return;
        }
        launchActivity.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean onAttachedBackPressed() {
        q5 currentPeerView;
        boolean z10 = false;
        if (this.e0 == 0.0f) {
            ib ibVar = this.n0;
            if (ibVar != null && (currentPeerView = ibVar.getCurrentPeerView()) != null) {
                z10 = currentPeerView.s0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        e7 e7Var = this.w;
        if (e7Var.x > 0) {
            AndroidUtilities.hideKeyboard(e7Var);
            return true;
        }
        w6 currentPage = e7Var.getCurrentPage();
        if (currentPage != null) {
            a6 a6Var = currentPage.r;
            j6 j6Var = currentPage.f;
            if (j6Var != null && j6Var.b) {
                j6Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - a6Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                a6Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                a6Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            e7 e7Var = new e7(this.v.getContext(), this);
            this.w = e7Var;
            this.v.addView(e7Var, 0);
        }
        q5 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 == null) {
                this.w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.O0.i.size(); i10++) {
                arrayList.add(((MessageObject) this.O0.i.get(i10)).storyItem);
            }
            this.w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.s);
        this.H0 = true;
        this.h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ab(this, 0));
        if (z10) {
            y();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            pb pbVar = this.s0;
            ImageReceiver imageReceiver = pbVar.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = pbVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            pbVar.c = null;
            pbVar.b = null;
        }
        AndroidUtilities.runOnUIThread(new r4(this, 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        q5 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            o5 o5Var = currentPeerView.O1;
            if (!o5Var.j() && o5Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.x0.add(runnable);
        }
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.p0 != i10) {
            this.p0 = i10;
            this.n0.setKeyboardHeight(i10);
            this.n0.requestLayout();
            e7 e7Var = this.w;
            if (e7Var != null) {
                e7Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new t4(this, 1));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.u0 = null;
            return false;
        }
    }

    public final q5 t() {
        ib ibVar = this.n0;
        if (ibVar == null) {
            return null;
        }
        return ibVar.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            pb pbVar = this.s0;
            ImageReceiver imageReceiver = pbVar.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = pbVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            pbVar.c = null;
            pbVar.b = null;
            hb hbVar = this.v;
            if (hbVar != null) {
                hbVar.a(true);
            }
            this.J0.unlock();
            p5 p5Var = this.G0;
            if (p5Var != null) {
                p5Var.b();
            }
            I();
            if (this.b) {
                AndroidUtilities.removeFromParent(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            this.m0 = false;
            this.d = false;
            o();
            r4 r4Var = this.o1;
            if (r4Var != null) {
                r4Var.run();
                this.o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.m2 m2Var;
        if (this.X0 || this.Z0 || this.Y0 || this.L0 || this.q0 || this.x || this.u0 != null || this.v0 != null || this.H0 || this.I0 || this.U != 1.0f || this.e0 != 0.0f || this.i1) {
            return true;
        }
        if ((this.l1 && this.a) || this.k1 || this.j1 || this.p1 || this.V != 0.0f || this.u1 != null) {
            return true;
        }
        return (!this.b || (m2Var = this.f) == null || m2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        TL_stories.StoryItem storyItem;
        q5 currentPeerView;
        int selectedPosition;
        this.d = true;
        pb pbVar = this.s0;
        ImageReceiver imageReceiver = pbVar.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = pbVar.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            pbVar.c.setVisible(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((MessageObject) this.O0.i.get(selectedPosition)).getId();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i10 = this.U0;
            if (this.O0 instanceof r8) {
                q5 currentPeerView2 = this.n0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.v1;
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
            this.t0.p(currentDialogId, i10, new r4(this, 5));
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

    @Override // org.telegram.ui.ActionBar.i2
    public final void dismiss(boolean z10) {
        q(true);
    }

    @Override // tf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
