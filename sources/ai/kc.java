package ai;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ru;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class kc implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.j2, sf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public d2 A0;
    public cc B0;
    public SurfaceView C0;
    public ci.j4 D0;
    public boolean E;
    public ci.j4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public e6 G0;
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
    public s9 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public e9 O0;
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
    public final e5 b1;
    public boolean c0;
    public boolean c1;
    public float d0;
    public pa d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final org.telegram.ui.ActionBar.n2 f;
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
    public ac n0;
    public a3.d n1;
    public e5 o1;
    public int p0;
    public boolean p1;
    public boolean q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public yb s;
    public final hc s0;
    public boolean s1;
    public gc t0;
    public long t1;
    public Dialog u0;
    public q9 u1;
    public zb v;
    public org.telegram.ui.ActionBar.j2 v0;
    public ValueAnimator v1;
    public t7 w;
    public boolean w0;
    public boolean w1;
    public boolean x;
    public final ArrayList x0;
    public org.telegram.ui.l4 y0;
    public jc z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = SharedConfig.useSurfaceInStories;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final d y = new d();
    public final RectF T = new RectF();
    public final float[] o0 = new float[2];

    public kc(org.telegram.ui.ActionBar.n2 n2Var) {
        hc hcVar = new hc();
        hcVar.k = 1.0f;
        this.s0 = hcVar;
        this.x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new e5(this, 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = n2Var;
    }

    public static void J(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 == 0 || storyItem == null) {
            return;
        }
        E1.put(j3 + (j3 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean i(kc kcVar, yb ybVar, float f7, float f10, boolean z10) {
        b4 b4Var;
        b4 b4Var2;
        if (ybVar == null) {
            return false;
        }
        if (kcVar.X0) {
            return true;
        }
        if (kcVar.w != null && kcVar.e0 != 0.0f) {
            return true;
        }
        f6 currentPeerView = kcVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f7 - kcVar.v.getX()) - kcVar.n0.getX()) - currentPeerView.getX(), ((f10 - kcVar.v.getY()) - kcVar.n0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.v2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (b4Var2 = currentPeerView.b2) != null && b4Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.b2.getY() + currentPeerView.getY() + kcVar.n0.getY() + kcVar.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (b4Var = currentPeerView.b2) == null || !b4Var.u0()) && kcVar.u1 == null) {
            return AndroidUtilities.findClickableView(ybVar, f7, f10, currentPeerView);
        }
        return true;
    }

    public static void j(kc kcVar) {
        q4 q4Var;
        ru editField;
        f6 currentPeerView = kcVar.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.b2 == null || (((q4Var = currentPeerView.b3) != null && q4Var.getVisibility() == 0) || (editField = currentPeerView.b2.getEditField()) == null)) {
            kcVar.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new e5(kcVar, 6), 200L);
    }

    public static void k(kc kcVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(kcVar.X, kcVar.W) / AndroidUtilities.dp(80.0f)));
        if (kcVar.V != clamp01) {
            kcVar.V = clamp01;
            kcVar.o();
            f6 currentPeerView = kcVar.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.x2) {
                currentPeerView.invalidate();
            }
            d2 d2Var = kcVar.A0;
            if (d2Var != null) {
                d2Var.v((1.0f - kcVar.V) * kcVar.U);
            }
        }
        yb ybVar = kcVar.s;
        if (ybVar != null) {
            ybVar.invalidate();
        }
    }

    public static CharSequence u(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        return z1 != null && (messageObject.type == 23 || messageObject.isWebpage()) && !A1 && z1.messageId == messageObject.getId() && z1.messageType != 3;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, gc gcVar) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, gcVar, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, e9 e9Var, TL_stories.PeerStories peerStories, gc gcVar, boolean z10) {
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
        jc jcVar = this.z0;
        if (jcVar != null) {
            jcVar.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.r1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && e9Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = e9Var;
        this.Q0 = peerStories;
        this.t0 = gcVar;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        ac acVar = this.n0;
        if (acVar != null) {
            acVar.setHorizontalProgressToDismiss(0.0f);
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
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (this.s == null) {
            this.i0 = new GestureDetector(new ub(this));
            this.s = new yb(this, context, R);
        }
        int i12 = 2;
        if (this.v == null) {
            this.v = new zb(this, context);
            ac acVar2 = new ac(this, this.h, context, this, this.y);
            this.n0 = acVar2;
            acVar2.setDelegate(new bc(this, e9Var, arrayList, context));
            this.v.addView(this.n0, w7.x5.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.l4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                cc ccVar = new cc(this, context);
                this.B0 = ccVar;
                this.y0.addView(ccVar);
            }
            ci.j4 j4Var = new ci.j4(context, this.h);
            this.D0 = j4Var;
            j4Var.setVisibility(8);
            this.y0.addView(this.D0);
            pa paVar = new pa(context);
            Paint paint = new Paint(1);
            paVar.a = paint;
            paVar.c = new r4(paVar, i12);
            paVar.d = new org.telegram.ui.Components.g6(paVar);
            paVar.e = new org.telegram.ui.Components.g6(paVar);
            paint.setColor(-1);
            this.d1 = paVar;
            this.v.addView(paVar, w7.x5.a(-1.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 0));
        }
        ci.j4 j4Var2 = this.D0;
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
        if (e9Var != null) {
            this.n0.D(this.h, e9Var.d, e9Var.h());
        } else {
            ac acVar3 = this.n0;
            int i13 = this.h;
            acVar3.A0 = arrayList;
            acVar3.y0 = i13;
            acVar3.setAdapter(null);
            acVar3.setAdapter(acVar3.z0);
            acVar3.setCurrentItem(i11);
            acVar3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        zb zbVar = this.v;
        a1.c cVar = new a1.c(this, 10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(zbVar, cVar);
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
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new sb(this, 0));
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

    public final void C(Context context, int i10, e9 e9Var, v9 v9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(e9Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, e9Var, null, v9Var, false);
    }

    public final void D(Context context, long j3, gc gcVar) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        m9 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y3 = storiesController.y(j3);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (ja.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j3)) {
                storiesController.g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        G(context, null, arrayList, 0, null, null, gcVar, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, gc gcVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, gcVar, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, v9 v9Var) {
        A(UserConfig.selectedAccount, context, storyItem, v9Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, e9 e9Var, TL_stories.PeerStories peerStories, gc gcVar, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, e9Var, peerStories, gcVar, z10);
    }

    public final void H(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.b) {
            R.presentFragment(n2Var);
        } else {
            R.presentFragment(n2Var);
            q(false);
        }
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        jc jcVar = this.z0;
        if (jcVar != null) {
            jcVar.release(null);
            this.z0 = null;
        }
        ci.j4 j4Var = this.D0;
        if (j4Var != null) {
            j4Var.d(0L, null);
        }
        d2 d2Var = this.A0;
        if (d2Var != null) {
            n2 n2Var = n2.Z;
            if (!n2Var.S || n2Var.v != d2Var) {
                if (d2Var.n) {
                    d2Var.s(null);
                } else {
                    d2Var.e();
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
            ((jc) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.i iVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            ((tc) iVar.n(i11)).b(false);
        }
        if (this.b) {
            z(false);
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f;
        if (n2Var2 != null) {
            n2Var2.removeSheet(this);
        }
        y1.remove(this);
        this.x0.clear();
        this.e0 = 0.0f;
        z1 = null;
    }

    public final void K(boolean z10) {
        this.q0 = z10;
        if (z10) {
            r4 r4Var = this.d1.c;
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            r4Var.run();
        }
        P();
    }

    public final void L(boolean z10) {
        f6 currentPeerView;
        f6 currentPeerView2;
        d6 d6Var;
        jc jcVar;
        e6 e6Var;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (d6Var = currentPeerView2.O1) != null && !d6Var.f && d6Var.b == null) {
                if (!this.k0 && !this.j0 && (e6Var = this.G0) != null && ((jc) e6Var.c) != null) {
                    currentPeerView2.c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                e6 e6Var2 = this.G0;
                if (e6Var2 != null && (jcVar = (jc) e6Var2.c) != null && !this.k0) {
                    jcVar.setSeeking(true);
                }
                this.k0 = true;
            }
            P();
            ac acVar = this.n0;
            if (acVar == null || (currentPeerView = acVar.getCurrentPeerView()) == null) {
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
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.A0 == null || (n2Var = this.f) == null || this.D0 == null) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(n2Var.getContext());
        if (tf.c.a(findActivity) > 0) {
            d2 d2Var = this.A0;
            n2 n2Var2 = n2.Z;
            int i10 = 1;
            if (d2Var != null && !n2Var2.S) {
                n2Var2.S = true;
                n2Var2.v = d2Var;
                int i11 = d2Var.e;
                n2Var2.w = i11;
                NotificationCenter.getInstance(i11).addObserver(n2Var2, NotificationCenter.liveStoryUpdated);
                n2Var2.J = n2Var2.n();
                n2Var2.K = n2Var2.m();
                n2Var2.M = 1.0f;
                int i12 = 0;
                n2Var2.H = false;
                o1.k kVar = new o1.k(n2Var2, n2.X);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                n2Var2.P = kVar;
                o1.k kVar2 = new o1.k(n2Var2, n2.Y);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                n2Var2.Q = kVar2;
                Context context = findActivity != null ? findActivity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new h2());
                n2Var2.x = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                n2Var2.x.setStylusScaleEnabled(false);
                n2Var2.y = new m.f3(context, new i2(scaledTouchSlop));
                j2 j2Var = new j2(context, 0);
                j2Var.b = new Path();
                n2Var2.e = j2Var;
                k2 k2Var = new k2(context);
                n2Var2.d = k2Var;
                k2Var.addView(n2Var2.e, w7.x5.d(-1.0f, -1));
                n2Var2.e.setOutlineProvider(new l2(i12));
                n2Var2.e.setClipToOutline(true);
                n2Var2.e.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gg, false));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                n2Var2.n = y9Var;
                n2Var2.e.addView(y9Var, w7.x5.d(-1.0f, -1));
                ci.j4 j4Var = new ci.j4(context, n2Var2.w);
                n2Var2.f = j4Var;
                j4Var.setAlpha(0.0f);
                n2Var2.e.addView(n2Var2.f, w7.x5.d(-1.0f, -1));
                ao aoVar = new ao(context, i10);
                n2Var2.r = aoVar;
                n2Var2.e.addView(aoVar, w7.x5.d(-1.0f, -1));
                FrameLayout frameLayout = new FrameLayout(context);
                n2Var2.h = frameLayout;
                frameLayout.setAlpha(0.0f);
                View view = new View(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{1140850688, 0});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                n2Var2.h.addView(view, w7.x5.d(-1.0f, -1));
                int dp = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i13 = org.telegram.ui.ActionBar.i6.hg;
                imageView.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
                int i14 = org.telegram.ui.ActionBar.i6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 1, -1));
                imageView.setPadding(dp, dp, dp, dp);
                imageView.setOnClickListener(new e2(i12));
                float f7 = 38;
                float f10 = 4;
                n2Var2.h.addView(imageView, w7.x5.a(f7, 0.0f, f10, f10, 0.0f, 38, 5));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
                imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 1, -1));
                imageView2.setPadding(dp, dp, dp, dp);
                imageView2.setOnClickListener(new f2(i12, d2Var, context));
                n2Var2.h.addView(imageView2, w7.x5.a(f7, 0.0f, f10, 48, 0.0f, 38, 5));
                n2Var2.e.addView(n2Var2.h, w7.x5.d(-1.0f, -1));
                n2Var2.b = (WindowManager) context.getSystemService("window");
                WindowManager.LayoutParams b10 = tf.c.b(context, false);
                n2Var2.c = b10;
                int i15 = n2Var2.J;
                b10.width = i15;
                b10.height = n2Var2.K;
                float dp2 = (AndroidUtilities.displaySize.x - i15) - AndroidUtilities.dp(16.0f);
                n2Var2.N = dp2;
                b10.x = (int) dp2;
                WindowManager.LayoutParams layoutParams = n2Var2.c;
                float dp3 = (AndroidUtilities.displaySize.y - n2Var2.K) - AndroidUtilities.dp(16.0f);
                n2Var2.O = dp3;
                layoutParams.y = (int) dp3;
                WindowManager.LayoutParams layoutParams2 = n2Var2.c;
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags = 520;
                n2Var2.d.setAlpha(0.0f);
                n2Var2.d.setScaleX(0.1f);
                n2Var2.d.setScaleY(0.1f);
                AndroidUtilities.setPreferredMaxRefreshRate(n2Var2.b, n2Var2.d, n2Var2.c);
                n2Var2.b.addView(n2Var2.d, n2Var2.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(hs.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(n2Var2.d, (Property<k2, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(n2Var2.d, (Property<k2, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(n2Var2.d, (Property<k2, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new m2(i12));
                animatorSet.start();
                n2Var2.i();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                qf.e eVar = n2Var2.L;
                if (eVar != null) {
                    eVar.c();
                    n2Var2.L = null;
                }
                if (findActivity != null && tf.c.a(findActivity) == 1) {
                    qf.d dVar = new qf.d(findActivity, n2Var2);
                    dVar.c = "pip-live-story";
                    dVar.e = 1;
                    dVar.d = AndroidUtilities.dp(10.0f);
                    dVar.j = n2Var2.d;
                    dVar.k = n2Var2.f.getPlaceholderView();
                    n2Var2.L = dVar.a();
                }
            }
            q(true);
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        jc jcVar = this.z0;
        int i10 = 0;
        if (jcVar != null) {
            jcVar.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((jc) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        f6 currentPeerView = this.n0.getCurrentPeerView();
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
        boolean w10 = w();
        if (this.b) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f;
            if (n2Var.isPaused() || !n2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.i4.x().V) {
            w10 = true;
        }
        this.n0.setPaused(w10);
        jc jcVar = this.z0;
        if (jcVar != null) {
            if (w10) {
                jcVar.pause();
            } else {
                jcVar.play(B1);
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
        e9 e9Var;
        long j3;
        int i11;
        if (this.t0 == null) {
            this.V0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        hc hcVar = this.s0;
        ImageReceiver imageReceiver = hcVar.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = hcVar.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            hcVar.c.setVisible(true, true);
        }
        f6 currentPeerView = this.n0.getCurrentPeerView();
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
                        e9Var = this.O0;
                        if (!(e9Var instanceof w8) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(e9Var instanceof h9) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (e9Var != null) {
                            i10 = this.P0;
                        }
                        j3 = currentDialogId;
                        i11 = i10;
                        hcVar.a = null;
                        hcVar.m = null;
                        hcVar.b = null;
                        hcVar.c = null;
                        hcVar.e = null;
                        hcVar.f = null;
                        hcVar.g = null;
                        hcVar.d = null;
                        hcVar.l = null;
                        hcVar.h = 0.0f;
                        hcVar.i = 0.0f;
                        hcVar.o = 0;
                        hcVar.j = null;
                        hcVar.k = 1.0f;
                        if (!this.t0.e1(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, hcVar)) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        hcVar.o = i11;
                        View view = hcVar.a;
                        if (view == null) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = hcVar.a;
                        if (view2 instanceof org.telegram.ui.Cells.u1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f7 = iArr[0];
                        this.K = f7;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = hcVar.a;
                        if (callback instanceof s9) {
                            this.M = (s9) callback;
                        } else {
                            this.M = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = hcVar.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.getCenterX() + f7;
                            this.O = hcVar.b.getCenterY() + iArr[1];
                            this.R = hcVar.b.getImageWidth();
                            this.S = hcVar.b.getImageHeight();
                            da daVar = hcVar.m;
                            if (daVar != null) {
                                this.R = daVar.b() * this.R;
                                this.S = hcVar.m.b() * this.S;
                            }
                            if (hcVar.a.getParent() instanceof View) {
                                View view3 = (View) hcVar.a.getParent();
                                this.N = (view3.getScaleX() * hcVar.b.getCenterX()) + iArr[0];
                                this.O = (view3.getScaleY() * hcVar.b.getCenterY()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = hcVar.c;
                            if (imageReceiver4 != null) {
                                this.N = imageReceiver4.getCenterX() + f7;
                                this.O = hcVar.c.getCenterY() + iArr[1];
                                this.R = hcVar.c.getImageWidth();
                                this.S = hcVar.c.getImageHeight();
                                this.W0 = hcVar.c.getRoundRadius();
                            }
                        }
                        hcVar.g.getLocationOnScreen(iArr);
                        float f10 = hcVar.h;
                        if (f10 == 0.0f && hcVar.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f11 = iArr[1];
                            this.P = f10 + f11;
                            this.Q = f11 + hcVar.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                e9Var = this.O0;
                if (!(e9Var instanceof w8)) {
                }
                if (!(e9Var instanceof h9)) {
                }
                if (e9Var != null) {
                }
                j3 = currentDialogId2;
                i11 = i10;
                hcVar.a = null;
                hcVar.m = null;
                hcVar.b = null;
                hcVar.c = null;
                hcVar.e = null;
                hcVar.f = null;
                hcVar.g = null;
                hcVar.d = null;
                hcVar.l = null;
                hcVar.h = 0.0f;
                hcVar.i = 0.0f;
                hcVar.o = 0;
                hcVar.j = null;
                hcVar.k = 1.0f;
                if (!this.t0.e1(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, hcVar)) {
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
        e9Var = this.O0;
        if (!(e9Var instanceof w8)) {
        }
        if (!(e9Var instanceof h9)) {
        }
        if (e9Var != null) {
        }
        j3 = currentDialogId22;
        i11 = i10;
        hcVar.a = null;
        hcVar.m = null;
        hcVar.b = null;
        hcVar.c = null;
        hcVar.e = null;
        hcVar.f = null;
        hcVar.g = null;
        hcVar.d = null;
        hcVar.l = null;
        hcVar.h = 0.0f;
        hcVar.i = 0.0f;
        hcVar.o = 0;
        hcVar.j = null;
        hcVar.k = 1.0f;
        if (!this.t0.e1(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, hcVar)) {
        }
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        ci.j4 j4Var = this.E0;
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

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean attachedToParent() {
        return this.b && this.s != null;
    }

    @Override // sf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        ci.j4 j4Var = this.E0;
        if (j4Var != null) {
            j4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        ci.j4 j4Var2 = this.E0;
        if (j4Var2 != null) {
            j4Var2.b();
            this.E0 = null;
        }
        this.s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override // sf.a
    public final Bitmap c() {
        ci.j4 j4Var = this.E0;
        if (j4Var == null || !j4Var.a()) {
            return null;
        }
        return this.E0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((e9) objArr[0])) {
                t();
                ac acVar = this.n0;
                e9 e9Var = this.O0;
                acVar.D(this.h, e9Var.d, e9Var.h());
                t7 t7Var = this.w;
                if (t7Var != null) {
                    TL_stories.StoryItem selectedStory = t7Var.getSelectedStory();
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
            gc gcVar = this.t0;
            if (gcVar instanceof v9) {
                v9 v9Var = (v9) gcVar;
                if (!v9Var.r || v9Var.n) {
                    return;
                }
                m9 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = v9Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!v9Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.n0.getAdapter().g();
                }
            }
            t7 t7Var2 = this.w;
            if (t7Var2 != null) {
                ArrayList arrayList3 = t7Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((m6) arrayList3.get(i12)).b();
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
        jc jcVar = this.z0;
        if (jcVar == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = jcVar.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        q(true);
    }

    @Override // sf.a
    public final Bitmap e() {
        ci.j4 j4Var = this.D0;
        if (j4Var == null || !j4Var.a()) {
            return null;
        }
        return this.D0.getBitmap();
    }

    @Override // sf.a
    public final boolean g() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f;
        return (n2Var == null || t() == null || AndroidUtilities.findActivity(n2Var.getContext()) == null || this.A0 == null || this.D0 == null || this.H0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final /* synthetic */ ad getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final View getWindowView() {
        return this.s;
    }

    @Override // sf.a
    public final View h() {
        ci.j4 j4Var = new ci.j4(this.D0.getContext(), this.h);
        this.E0 = j4Var;
        return j4Var;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean isFullyVisible() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.j2
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
            ci.j4 j4Var = this.D0;
            if (j4Var != null) {
                j4Var.setSecure(!z11);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.n2 n2Var = this.f;
                if (n2Var.getParentActivity() != null) {
                    if (z11) {
                        n2Var.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        n2Var.getParentActivity().getWindow().addFlags(8192);
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.j0 = false;
            this.l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new rb(this, 2));
            this.H.addListener(new tb(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.p1.w);
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
                t7 t7Var = this.w;
                float f10 = t7Var.c;
                if (f7 == f10) {
                    float f11 = f10 - 1.0f;
                    this.e0 = f11;
                    t7Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? this.w.c : 0.0f);
            this.v1 = ofFloat;
            int i10 = 3;
            ofFloat.addUpdateListener(new rb(this, i10));
            this.v1.addListener(new n(i10, this, z10));
            if (z10) {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(hs.h);
            } else {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(hs.f);
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

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean onAttachedBackPressed() {
        f6 currentPeerView;
        boolean z10 = false;
        if (this.e0 == 0.0f) {
            ac acVar = this.n0;
            if (acVar != null && (currentPeerView = acVar.getCurrentPeerView()) != null) {
                z10 = currentPeerView.s0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        t7 t7Var = this.w;
        if (t7Var.x > 0) {
            AndroidUtilities.hideKeyboard(t7Var);
            return true;
        }
        l7 currentPage = t7Var.getCurrentPage();
        if (currentPage != null) {
            p6 p6Var = currentPage.r;
            y6 y6Var = currentPage.f;
            if (y6Var != null && y6Var.b) {
                y6Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - p6Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                p6Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                p6Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            t7 t7Var = new t7(this, this.v.getContext());
            this.w = t7Var;
            this.v.addView(t7Var, 0);
        }
        f6 currentPeerView = this.n0.getCurrentPeerView();
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
        ofFloat.addUpdateListener(new rb(this, 0));
        if (z10) {
            y();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            hc hcVar = this.s0;
            ImageReceiver imageReceiver = hcVar.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = hcVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            hcVar.c = null;
            hcVar.b = null;
        }
        AndroidUtilities.runOnUIThread(new e5(this, 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        f6 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            d6 d6Var = currentPeerView.O1;
            if (!d6Var.j() && d6Var.e) {
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

    @Override // org.telegram.ui.ActionBar.j2
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.p0 != i10) {
            this.p0 = i10;
            this.n0.setKeyboardHeight(i10);
            this.n0.requestLayout();
            t7 t7Var = this.w;
            if (t7Var != null) {
                t7Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new g5(this, 1));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.u0 = null;
            return false;
        }
    }

    public final f6 t() {
        ac acVar = this.n0;
        if (acVar == null) {
            return null;
        }
        return acVar.getCurrentPeerView();
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
            hc hcVar = this.s0;
            ImageReceiver imageReceiver = hcVar.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = hcVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            hcVar.c = null;
            hcVar.b = null;
            zb zbVar = this.v;
            if (zbVar != null) {
                zbVar.a(true);
            }
            this.J0.unlock();
            e6 e6Var = this.G0;
            if (e6Var != null) {
                e6Var.b();
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
            e5 e5Var = this.o1;
            if (e5Var != null) {
                e5Var.run();
                this.o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.X0 || this.Z0 || this.Y0 || this.L0 || this.q0 || this.x || this.u0 != null || this.v0 != null || this.H0 || this.I0 || this.U != 1.0f || this.e0 != 0.0f || this.i1) {
            return true;
        }
        if ((this.l1 && this.a) || this.k1 || this.j1 || this.p1 || this.V != 0.0f || this.u1 != null) {
            return true;
        }
        return (!this.b || (n2Var = this.f) == null || n2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        TL_stories.StoryItem storyItem;
        f6 currentPeerView;
        int selectedPosition;
        this.d = true;
        hc hcVar = this.s0;
        ImageReceiver imageReceiver = hcVar.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = hcVar.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            hcVar.c.setVisible(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((MessageObject) this.O0.i.get(selectedPosition)).getId();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i10 = this.U0;
            if (this.O0 instanceof h9) {
                f6 currentPeerView2 = this.n0.getCurrentPeerView();
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
            this.t0.Z(currentDialogId, i10, new e5(this, 5));
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

    @Override // org.telegram.ui.ActionBar.j2
    public final void dismiss(boolean z10) {
        q(true);
    }

    @Override // sf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
