package ci;

import ai.cb;
import ai.wd;
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
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class z9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.k2, tf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public h1 A0;
    public r9 B0;
    public SurfaceView C0;
    public ei.d4 D0;
    public boolean E;
    public ei.d4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public o4 G0;
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
    public n7 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public z6 O0;
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
    public final s3 b1;
    public boolean c0;
    public boolean c1;
    public float d0;
    public i8 d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final org.telegram.ui.ActionBar.o2 f;
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
    public p9 n0;
    public androidx.fragment.app.d n1;
    public s3 o1;
    public int p0;
    public boolean p1;
    public boolean q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public n9 s;
    public final w9 s0;
    public boolean s1;
    public v9 t0;
    public long t1;
    public Dialog u0;
    public l7 u1;
    public o9 v;
    public org.telegram.ui.ActionBar.k2 v0;
    public ValueAnimator v1;
    public b6 w;
    public boolean w0;
    public boolean w1;
    public boolean x;
    public final ArrayList x0;
    public org.telegram.ui.n4 y0;
    public y9 z0;
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

    public z9(org.telegram.ui.ActionBar.o2 o2Var) {
        w9 w9Var = new w9();
        w9Var.k = 1.0f;
        this.s0 = w9Var;
        this.x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new s3(this, 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = o2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        E1.put(j10 + (j10 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean i(z9 z9Var, n9 n9Var, float f7, float f10, boolean z10) {
        u2 u2Var;
        u2 u2Var2;
        if (n9Var == null) {
            return false;
        }
        if (z9Var.X0) {
            return true;
        }
        if (z9Var.w != null && z9Var.e0 != 0.0f) {
            return true;
        }
        p4 currentPeerView = z9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.F0(currentPeerView, ((f7 - z9Var.v.getX()) - z9Var.n0.getX()) - currentPeerView.getX(), ((f10 - z9Var.v.getY()) - z9Var.n0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.v2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (u2Var2 = currentPeerView.b2) != null && u2Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.b2.getY() + currentPeerView.getY() + z9Var.n0.getY() + z9Var.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (u2Var = currentPeerView.b2) == null || !u2Var.t0()) && z9Var.u1 == null) {
            return AndroidUtilities.findClickableView(n9Var, f7, f10, currentPeerView);
        }
        return true;
    }

    public static void j(z9 z9Var) {
        wd wdVar;
        iu editField;
        p4 currentPeerView = z9Var.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.b2 == null || (((wdVar = currentPeerView.b3) != null && wdVar.getVisibility() == 0) || (editField = currentPeerView.b2.getEditField()) == null)) {
            z9Var.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new s3(z9Var, 6), 200L);
    }

    public static void k(z9 z9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(z9Var.X, z9Var.W) / AndroidUtilities.dp(80.0f)));
        if (z9Var.V != clamp01) {
            z9Var.V = clamp01;
            z9Var.o();
            p4 currentPeerView = z9Var.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.x2) {
                currentPeerView.invalidate();
            }
            h1 h1Var = z9Var.A0;
            if (h1Var != null) {
                h1Var.v((1.0f - z9Var.V) * z9Var.U);
            }
        }
        n9 n9Var = z9Var.s;
        if (n9Var != null) {
            n9Var.invalidate();
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

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, v9 v9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, v9Var, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, z6 z6Var, TL_stories.PeerStories peerStories, v9 v9Var, boolean z10) {
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
        y9 y9Var = this.z0;
        if (y9Var != null) {
            y9Var.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.r1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && z6Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = z6Var;
        this.Q0 = peerStories;
        this.t0 = v9Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        p9 p9Var = this.n0;
        if (p9Var != null) {
            p9Var.setHorizontalProgressToDismiss(0.0f);
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
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (this.s == null) {
            this.i0 = new GestureDetector(new j9(this));
            this.s = new n9(this, context, R);
        }
        if (this.v == null) {
            this.v = new o9(context, this);
            p9 p9Var2 = new p9(this, this.h, context, this, this.y);
            this.n0 = p9Var2;
            p9Var2.setDelegate(new q9(this, z6Var, arrayList, context));
            this.v.addView(this.n0, w7.z5.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.n4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                r9 r9Var = new r9(context, this);
                this.B0 = r9Var;
                this.y0.addView(r9Var);
            }
            ei.d4 d4Var = new ei.d4(context, this.h);
            this.D0 = d4Var;
            d4Var.setVisibility(8);
            this.y0.addView(this.D0);
            i8 i8Var = new i8(context);
            Paint paint = new Paint(1);
            i8Var.a = paint;
            i8Var.c = new androidx.activity.i(i8Var, 11);
            i8Var.d = new org.telegram.ui.Components.f6(i8Var);
            i8Var.e = new org.telegram.ui.Components.f6(i8Var);
            paint.setColor(-1);
            this.d1 = i8Var;
            this.v.addView(i8Var, w7.z5.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        ei.d4 d4Var2 = this.D0;
        if (d4Var2 != null) {
            d4Var2.setAccount(this.h);
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
        if (z6Var != null) {
            this.n0.D(this.h, z6Var.d, z6Var.h());
        } else {
            p9 p9Var3 = this.n0;
            int i12 = this.h;
            p9Var3.A0 = arrayList;
            p9Var3.y0 = i12;
            p9Var3.setAdapter(null);
            p9Var3.setAdapter(p9Var3.z0);
            p9Var3.setCurrentItem(i11);
            p9Var3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        o9 o9Var = this.v;
        a1.c cVar = new a1.c(this, 21);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(o9Var, cVar);
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

    public final void C(Context context, int i10, z6 z6Var, q7 q7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(z6Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, z6Var, null, q7Var, false);
    }

    public final void D(Context context, long j10, v9 v9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        h7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y3 = storiesController.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (c8.w(i10, y3.stories.get(i11))) {
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
        G(context, null, arrayList, 0, null, null, v9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, v9 v9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, v9Var, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, q7 q7Var) {
        A(UserConfig.selectedAccount, context, storyItem, q7Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, z6 z6Var, TL_stories.PeerStories peerStories, v9 v9Var, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, z6Var, peerStories, v9Var, z10);
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
        this.F0 = null;
        K(false);
        l(true);
        y9 y9Var = this.z0;
        if (y9Var != null) {
            y9Var.release(null);
            this.z0 = null;
        }
        ei.d4 d4Var = this.D0;
        if (d4Var != null) {
            d4Var.d(0L, null);
        }
        h1 h1Var = this.A0;
        if (h1Var != null) {
            o1 o1Var = o1.Z;
            if (!o1Var.S || o1Var.v != h1Var) {
                if (h1Var.n) {
                    h1Var.s(null);
                } else {
                    h1Var.e();
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
            ((y9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((ia) hVar.n(i11)).b(false);
        }
        if (this.b) {
            z(false);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f;
        if (o2Var != null) {
            o2Var.removeSheet(this);
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
        p4 currentPeerView;
        p4 currentPeerView2;
        n4 n4Var;
        y9 y9Var;
        o4 o4Var;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (n4Var = currentPeerView2.O1) != null && !n4Var.f && n4Var.b == null) {
                if (!this.k0 && !this.j0 && (o4Var = this.G0) != null && ((y9) o4Var.c) != null) {
                    currentPeerView2.c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                o4 o4Var2 = this.G0;
                if (o4Var2 != null && (y9Var = (y9) o4Var2.c) != null && !this.k0) {
                    y9Var.setSeeking(true);
                }
                this.k0 = true;
            }
            P();
            p9 p9Var = this.n0;
            if (p9Var == null || (currentPeerView = p9Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.a1);
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.J1;
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
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.A0 == null || (o2Var = this.f) == null || this.D0 == null) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(o2Var.getContext());
        if (uf.b.a(findActivity) > 0) {
            h1 h1Var = this.A0;
            o1 o1Var = o1.Z;
            int i10 = 1;
            if (h1Var != null && !o1Var.S) {
                o1Var.S = true;
                o1Var.v = h1Var;
                int i11 = h1Var.e;
                o1Var.w = i11;
                NotificationCenter.getInstance(i11).addObserver(o1Var, NotificationCenter.liveStoryUpdated);
                o1Var.J = o1Var.n();
                o1Var.K = o1Var.m();
                o1Var.M = 1.0f;
                int i12 = 0;
                o1Var.H = false;
                o1.k kVar = new o1.k(o1Var, o1.X);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                o1Var.P = kVar;
                o1.k kVar2 = new o1.k(o1Var, o1.Y);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                o1Var.Q = kVar2;
                Context context = findActivity != null ? findActivity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new j1());
                o1Var.x = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                o1Var.x.setStylusScaleEnabled(false);
                o1Var.y = new le.b(context, new k1(scaledTouchSlop));
                l1 l1Var = new l1(context, 0);
                l1Var.b = new Path();
                o1Var.e = l1Var;
                m1 m1Var = new m1(context);
                o1Var.d = m1Var;
                m1Var.addView(o1Var.e, w7.z5.c(-1.0f, -1));
                o1Var.e.setOutlineProvider(new n1(i12));
                o1Var.e.setClipToOutline(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.gg, o1Var.e, null);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                o1Var.n = w9Var;
                o1Var.e.addView(w9Var, w7.z5.c(-1.0f, -1));
                ei.d4 d4Var = new ei.d4(context, o1Var.w);
                o1Var.f = d4Var;
                d4Var.setAlpha(0.0f);
                o1Var.e.addView(o1Var.f, w7.z5.c(-1.0f, -1));
                un unVar = new un(context, i10);
                o1Var.r = unVar;
                o1Var.e.addView(unVar, w7.z5.c(-1.0f, -1));
                FrameLayout frameLayout = new FrameLayout(context);
                o1Var.h = frameLayout;
                frameLayout.setAlpha(0.0f);
                View view = new View(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{1140850688, 0});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                o1Var.h.addView(view, w7.z5.c(-1.0f, -1));
                int dp = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i13 = org.telegram.ui.ActionBar.k6.hg;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                org.telegram.ui.ActionBar.r6.t(imageView, i13, null, mode);
                int i14 = org.telegram.ui.ActionBar.k6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1));
                imageView.setPadding(dp, dp, dp, dp);
                imageView.setOnClickListener(new ah.f(2));
                float f7 = 38;
                float f10 = 4;
                o1Var.h.addView(imageView, w7.z5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                org.telegram.ui.ActionBar.r6.t(imageView2, i13, null, mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1));
                imageView2.setPadding(dp, dp, dp, dp);
                imageView2.setOnClickListener(new ai.p(10, h1Var, context));
                o1Var.h.addView(imageView2, w7.z5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
                o1Var.e.addView(o1Var.h, w7.z5.c(-1.0f, -1));
                o1Var.b = (WindowManager) context.getSystemService("window");
                WindowManager.LayoutParams b10 = uf.b.b(context, false);
                o1Var.c = b10;
                int i15 = o1Var.J;
                b10.width = i15;
                b10.height = o1Var.K;
                float dp2 = (AndroidUtilities.displaySize.x - i15) - AndroidUtilities.dp(16.0f);
                o1Var.N = dp2;
                b10.x = (int) dp2;
                WindowManager.LayoutParams layoutParams = o1Var.c;
                float dp3 = (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f);
                o1Var.O = dp3;
                layoutParams.y = (int) dp3;
                WindowManager.LayoutParams layoutParams2 = o1Var.c;
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags = 520;
                o1Var.d.setAlpha(0.0f);
                o1Var.d.setScaleX(0.1f);
                o1Var.d.setScaleY(0.1f);
                AndroidUtilities.setPreferredMaxRefreshRate(o1Var.b, o1Var.d, o1Var.c);
                o1Var.b.addView(o1Var.d, o1Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(bs.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(o1Var.d, (Property<m1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(o1Var.d, (Property<m1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(o1Var.d, (Property<m1, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new ah.z(1));
                animatorSet.start();
                o1Var.i();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                rf.d dVar = o1Var.L;
                if (dVar != null) {
                    dVar.c();
                    o1Var.L = null;
                }
                if (findActivity != null && uf.b.a(findActivity) == 1) {
                    rf.c cVar = new rf.c(findActivity, o1Var);
                    cVar.c = "pip-live-story";
                    cVar.e = 1;
                    cVar.d = AndroidUtilities.dp(10.0f);
                    cVar.j = o1Var.d;
                    cVar.k = o1Var.f.getPlaceholderView();
                    o1Var.L = cVar.a();
                }
            }
            q(true);
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        y9 y9Var = this.z0;
        int i10 = 0;
        if (y9Var != null) {
            y9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((y9) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        p4 currentPeerView = this.n0.getCurrentPeerView();
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
            org.telegram.ui.ActionBar.o2 o2Var = this.f;
            if (o2Var.isPaused() || !o2Var.isLastFragment()) {
                w9 = true;
            }
        }
        if (org.telegram.ui.k4.x().V) {
            w9 = true;
        }
        this.n0.setPaused(w9);
        y9 y9Var = this.z0;
        if (y9Var != null) {
            if (w9) {
                y9Var.pause();
            } else {
                y9Var.play(B1);
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
        z6 z6Var;
        long j10;
        int i11;
        if (this.t0 == null) {
            this.V0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        w9 w9Var = this.s0;
        ImageReceiver imageReceiver = w9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = w9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            w9Var.c.setVisible(true, true);
        }
        p4 currentPeerView = this.n0.getCurrentPeerView();
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
                        z6Var = this.O0;
                        if (!(z6Var instanceof t6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(z6Var instanceof c7) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (z6Var != null) {
                            i10 = this.P0;
                        }
                        j10 = currentDialogId;
                        i11 = i10;
                        w9Var.a = null;
                        w9Var.m = null;
                        w9Var.b = null;
                        w9Var.c = null;
                        w9Var.e = null;
                        w9Var.f = null;
                        w9Var.g = null;
                        w9Var.d = null;
                        w9Var.l = null;
                        w9Var.h = 0.0f;
                        w9Var.i = 0.0f;
                        w9Var.o = 0;
                        w9Var.j = null;
                        w9Var.k = 1.0f;
                        if (!this.t0.Q0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, w9Var)) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        w9Var.o = i11;
                        View view = w9Var.a;
                        if (view == null) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = w9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.t1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f7 = iArr[0];
                        this.K = f7;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = w9Var.a;
                        if (callback instanceof n7) {
                            this.M = (n7) callback;
                        } else {
                            this.M = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = w9Var.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.getCenterX() + f7;
                            this.O = w9Var.b.getCenterY() + iArr[1];
                            this.R = w9Var.b.getImageWidth();
                            this.S = w9Var.b.getImageHeight();
                            x7 x7Var = w9Var.m;
                            if (x7Var != null) {
                                this.R = x7Var.b() * this.R;
                                this.S = w9Var.m.b() * this.S;
                            }
                            if (w9Var.a.getParent() instanceof View) {
                                View view3 = (View) w9Var.a.getParent();
                                this.N = (view3.getScaleX() * w9Var.b.getCenterX()) + iArr[0];
                                this.O = (view3.getScaleY() * w9Var.b.getCenterY()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = w9Var.c;
                            if (imageReceiver4 != null) {
                                this.N = imageReceiver4.getCenterX() + f7;
                                this.O = w9Var.c.getCenterY() + iArr[1];
                                this.R = w9Var.c.getImageWidth();
                                this.S = w9Var.c.getImageHeight();
                                this.W0 = w9Var.c.getRoundRadius();
                            }
                        }
                        w9Var.g.getLocationOnScreen(iArr);
                        float f10 = w9Var.h;
                        if (f10 == 0.0f && w9Var.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f11 = iArr[1];
                            this.P = f10 + f11;
                            this.Q = f11 + w9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                z6Var = this.O0;
                if (!(z6Var instanceof t6)) {
                }
                if (!(z6Var instanceof c7)) {
                }
                if (z6Var != null) {
                }
                j10 = currentDialogId2;
                i11 = i10;
                w9Var.a = null;
                w9Var.m = null;
                w9Var.b = null;
                w9Var.c = null;
                w9Var.e = null;
                w9Var.f = null;
                w9Var.g = null;
                w9Var.d = null;
                w9Var.l = null;
                w9Var.h = 0.0f;
                w9Var.i = 0.0f;
                w9Var.o = 0;
                w9Var.j = null;
                w9Var.k = 1.0f;
                if (!this.t0.Q0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, w9Var)) {
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
        z6Var = this.O0;
        if (!(z6Var instanceof t6)) {
        }
        if (!(z6Var instanceof c7)) {
        }
        if (z6Var != null) {
        }
        j10 = currentDialogId22;
        i11 = i10;
        w9Var.a = null;
        w9Var.m = null;
        w9Var.b = null;
        w9Var.c = null;
        w9Var.e = null;
        w9Var.f = null;
        w9Var.g = null;
        w9Var.d = null;
        w9Var.l = null;
        w9Var.h = 0.0f;
        w9Var.i = 0.0f;
        w9Var.o = 0;
        w9Var.j = null;
        w9Var.k = 1.0f;
        if (!this.t0.Q0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, w9Var)) {
        }
    }

    @Override // tf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        ei.d4 d4Var = this.E0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean attachedToParent() {
        return this.b && this.s != null;
    }

    @Override // tf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        ei.d4 d4Var = this.E0;
        if (d4Var != null) {
            d4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        ei.d4 d4Var2 = this.E0;
        if (d4Var2 != null) {
            d4Var2.b();
            this.E0 = null;
        }
        this.s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override // tf.a
    public final Bitmap c() {
        ei.d4 d4Var = this.E0;
        if (d4Var == null || !d4Var.a()) {
            return null;
        }
        return this.E0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((z6) objArr[0])) {
                t();
                p9 p9Var = this.n0;
                z6 z6Var = this.O0;
                p9Var.D(this.h, z6Var.d, z6Var.h());
                b6 b6Var = this.w;
                if (b6Var != null) {
                    TL_stories.StoryItem selectedStory = b6Var.getSelectedStory();
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
            v9 v9Var = this.t0;
            if (v9Var instanceof q7) {
                q7 q7Var = (q7) v9Var;
                if (!q7Var.r || q7Var.n) {
                    return;
                }
                h7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = q7Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!q7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.n0.getAdapter().g();
                }
            }
            b6 b6Var2 = this.w;
            if (b6Var2 != null) {
                ArrayList arrayList3 = b6Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((v4) arrayList3.get(i12)).b();
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
            t().e1(false);
            return;
        }
        y9 y9Var = this.z0;
        if (y9Var == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = y9Var.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.k2, android.content.DialogInterface
    public final void dismiss() {
        q(true);
    }

    @Override // tf.a
    public final Bitmap e() {
        ei.d4 d4Var = this.D0;
        if (d4Var == null || !d4Var.a()) {
            return null;
        }
        return this.D0.getBitmap();
    }

    @Override // tf.a
    public final boolean g() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f;
        return (o2Var == null || t() == null || AndroidUtilities.findActivity(o2Var.getContext()) == null || this.A0 == null || this.D0 == null || this.H0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final /* synthetic */ xc getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor(int i10) {
        return i0.a.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View getWindowView() {
        return this.s;
    }

    @Override // tf.a
    public final View h() {
        ei.d4 d4Var = new ei.d4(this.D0.getContext(), this.h);
        this.E0 = d4Var;
        return d4Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isFullyVisible() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.k2
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
            ei.d4 d4Var = this.D0;
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
            ofFloat.addUpdateListener(new h9(this, 2));
            this.H.addListener(new i9(this, 1));
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
                b6 b6Var = this.w;
                float f10 = b6Var.c;
                if (f7 == f10) {
                    float f11 = f10 - 1.0f;
                    this.e0 = f11;
                    b6Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? this.w.c : 0.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new h9(this, 3));
            this.v1.addListener(new ah.p0(4, this, z10));
            if (z10) {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(bs.h);
            } else {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(bs.f);
            }
            this.v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.J1) == null) {
            return;
        }
        launchActivity.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onAttachedBackPressed() {
        p4 currentPeerView;
        boolean z10 = false;
        if (this.e0 == 0.0f) {
            p9 p9Var = this.n0;
            if (p9Var != null && (currentPeerView = p9Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.r0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        b6 b6Var = this.w;
        if (b6Var.x > 0) {
            AndroidUtilities.hideKeyboard(b6Var);
            return true;
        }
        t5 currentPage = b6Var.getCurrentPage();
        if (currentPage != null) {
            y4 y4Var = currentPage.r;
            h5 h5Var = currentPage.f;
            if (h5Var != null && h5Var.b) {
                h5Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - y4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                y4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                y4Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            b6 b6Var = new b6(this.v.getContext(), this);
            this.w = b6Var;
            this.v.addView(b6Var, 0);
        }
        p4 currentPeerView = this.n0.getCurrentPeerView();
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
        ofFloat.addUpdateListener(new h9(this, 0));
        if (z10) {
            y();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            w9 w9Var = this.s0;
            ImageReceiver imageReceiver = w9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = w9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            w9Var.c = null;
            w9Var.b = null;
        }
        AndroidUtilities.runOnUIThread(new s3(this, 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        p4 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            n4 n4Var = currentPeerView.O1;
            if (!n4Var.j() && n4Var.e) {
                currentPeerView.b1(true);
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

    @Override // org.telegram.ui.ActionBar.k2
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.p0 != i10) {
            this.p0 = i10;
            this.n0.setKeyboardHeight(i10);
            this.n0.requestLayout();
            b6 b6Var = this.w;
            if (b6Var != null) {
                b6Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new cb(this, 4));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.u0 = null;
            return false;
        }
    }

    public final p4 t() {
        p9 p9Var = this.n0;
        if (p9Var == null) {
            return null;
        }
        return p9Var.getCurrentPeerView();
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
            w9 w9Var = this.s0;
            ImageReceiver imageReceiver = w9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = w9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            w9Var.c = null;
            w9Var.b = null;
            o9 o9Var = this.v;
            if (o9Var != null) {
                o9Var.a(true);
            }
            this.J0.unlock();
            o4 o4Var = this.G0;
            if (o4Var != null) {
                o4Var.b();
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
            s3 s3Var = this.o1;
            if (s3Var != null) {
                s3Var.run();
                this.o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.X0 || this.Z0 || this.Y0 || this.L0 || this.q0 || this.x || this.u0 != null || this.v0 != null || this.H0 || this.I0 || this.U != 1.0f || this.e0 != 0.0f || this.i1) {
            return true;
        }
        if ((this.l1 && this.a) || this.k1 || this.j1 || this.p1 || this.V != 0.0f || this.u1 != null) {
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
        p4 currentPeerView;
        int selectedPosition;
        this.d = true;
        w9 w9Var = this.s0;
        ImageReceiver imageReceiver = w9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = w9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            w9Var.c.setVisible(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((MessageObject) this.O0.i.get(selectedPosition)).getId();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i10 = this.U0;
            if (this.O0 instanceof c7) {
                p4 currentPeerView2 = this.n0.getCurrentPeerView();
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
            this.t0.X0(currentDialogId, i10, new s3(this, 5));
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

    @Override // tf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
