package ci;

import ai.bb;
import ai.vd;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class aa implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.j2, tf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public h1 A0;
    public s9 B0;
    public SurfaceView C0;
    public ei.d4 D0;
    public boolean E;
    public ei.d4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public p4 G0;
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
    public o7 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public a7 O0;
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
    public final t3 b1;
    public boolean c0;
    public boolean c1;
    public float d0;
    public j8 d1;
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
    public q9 n0;
    public androidx.fragment.app.d n1;
    public t3 o1;
    public int p0;
    public boolean p1;
    public boolean q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public o9 s;
    public final x9 s0;
    public boolean s1;
    public w9 t0;
    public long t1;
    public Dialog u0;
    public m7 u1;
    public p9 v;
    public org.telegram.ui.ActionBar.j2 v0;
    public ValueAnimator v1;
    public c6 w;
    public boolean w0;
    public boolean w1;
    public boolean x;
    public final ArrayList x0;
    public org.telegram.ui.o4 y0;
    public z9 z0;
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

    public aa(org.telegram.ui.ActionBar.n2 n2Var) {
        x9 x9Var = new x9();
        x9Var.k = 1.0f;
        this.s0 = x9Var;
        this.x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new t3(this, 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = n2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        E1.put(j10 + (j10 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean i(aa aaVar, o9 o9Var, float f7, float f10, boolean z10) {
        v2 v2Var;
        v2 v2Var2;
        if (o9Var == null) {
            return false;
        }
        if (aaVar.X0) {
            return true;
        }
        if (aaVar.w != null && aaVar.e0 != 0.0f) {
            return true;
        }
        q4 currentPeerView = aaVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f7 - aaVar.v.getX()) - aaVar.n0.getX()) - currentPeerView.getX(), ((f10 - aaVar.v.getY()) - aaVar.n0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.v2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (v2Var2 = currentPeerView.b2) != null && v2Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.b2.getY() + currentPeerView.getY() + aaVar.n0.getY() + aaVar.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (v2Var = currentPeerView.b2) == null || !v2Var.u0()) && aaVar.u1 == null) {
            return AndroidUtilities.findClickableView(o9Var, f7, f10, currentPeerView);
        }
        return true;
    }

    public static void j(aa aaVar) {
        vd vdVar;
        iu editField;
        q4 currentPeerView = aaVar.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.b2 == null || (((vdVar = currentPeerView.b3) != null && vdVar.getVisibility() == 0) || (editField = currentPeerView.b2.getEditField()) == null)) {
            aaVar.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new t3(aaVar, 6), 200L);
    }

    public static void k(aa aaVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(aaVar.X, aaVar.W) / AndroidUtilities.dp(80.0f)));
        if (aaVar.V != clamp01) {
            aaVar.V = clamp01;
            aaVar.o();
            q4 currentPeerView = aaVar.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.x2) {
                currentPeerView.invalidate();
            }
            h1 h1Var = aaVar.A0;
            if (h1Var != null) {
                h1Var.v((1.0f - aaVar.V) * aaVar.U);
            }
        }
        o9 o9Var = aaVar.s;
        if (o9Var != null) {
            o9Var.invalidate();
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

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, w9 w9Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, w9Var, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, a7 a7Var, TL_stories.PeerStories peerStories, w9 w9Var, boolean z10) {
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
        z9 z9Var = this.z0;
        if (z9Var != null) {
            z9Var.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.r1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && a7Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = a7Var;
        this.Q0 = peerStories;
        this.t0 = w9Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        q9 q9Var = this.n0;
        if (q9Var != null) {
            q9Var.setHorizontalProgressToDismiss(0.0f);
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
            this.i0 = new GestureDetector(new k9(this));
            this.s = new o9(this, context, R);
        }
        if (this.v == null) {
            this.v = new p9(context, this);
            q9 q9Var2 = new q9(this, this.h, context, this, this.y);
            this.n0 = q9Var2;
            q9Var2.setDelegate(new r9(this, a7Var, arrayList, context));
            this.v.addView(this.n0, w7.z5.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.o4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                s9 s9Var = new s9(context, this);
                this.B0 = s9Var;
                this.y0.addView(s9Var);
            }
            ei.d4 d4Var = new ei.d4(context, this.h);
            this.D0 = d4Var;
            d4Var.setVisibility(8);
            this.y0.addView(this.D0);
            j8 j8Var = new j8(context);
            Paint paint = new Paint(1);
            j8Var.a = paint;
            j8Var.c = new androidx.activity.i(j8Var, 11);
            j8Var.d = new org.telegram.ui.Components.f6(j8Var);
            j8Var.e = new org.telegram.ui.Components.f6(j8Var);
            paint.setColor(-1);
            this.d1 = j8Var;
            this.v.addView(j8Var, w7.z5.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
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
        if (a7Var != null) {
            this.n0.D(this.h, a7Var.d, a7Var.h());
        } else {
            q9 q9Var3 = this.n0;
            int i12 = this.h;
            q9Var3.A0 = arrayList;
            q9Var3.y0 = i12;
            q9Var3.setAdapter(null);
            q9Var3.setAdapter(q9Var3.z0);
            q9Var3.setCurrentItem(i11);
            q9Var3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        p9 p9Var = this.v;
        a1.c cVar = new a1.c(this, 21);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(p9Var, cVar);
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

    public final void C(Context context, int i10, a7 a7Var, r7 r7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(a7Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, a7Var, null, r7Var, false);
    }

    public final void D(Context context, long j10, w9 w9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        i7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y3 = storiesController.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (d8.w(i10, y3.stories.get(i11))) {
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
        G(context, null, arrayList, 0, null, null, w9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, w9 w9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, w9Var, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, r7 r7Var) {
        A(UserConfig.selectedAccount, context, storyItem, r7Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, a7 a7Var, TL_stories.PeerStories peerStories, w9 w9Var, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, a7Var, peerStories, w9Var, z10);
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
        z9 z9Var = this.z0;
        if (z9Var != null) {
            z9Var.release(null);
            this.z0 = null;
        }
        ei.d4 d4Var = this.D0;
        if (d4Var != null) {
            d4Var.d(0L, null);
        }
        h1 h1Var = this.A0;
        if (h1Var != null) {
            p1 p1Var = p1.Z;
            if (!p1Var.S || p1Var.v != h1Var) {
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
            ((z9) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((ja) hVar.n(i11)).b(false);
        }
        if (this.b) {
            z(false);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f;
        if (n2Var != null) {
            n2Var.removeSheet(this);
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
        q4 currentPeerView;
        q4 currentPeerView2;
        o4 o4Var;
        z9 z9Var;
        p4 p4Var;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (o4Var = currentPeerView2.O1) != null && !o4Var.f && o4Var.b == null) {
                if (!this.k0 && !this.j0 && (p4Var = this.G0) != null && ((z9) p4Var.c) != null) {
                    currentPeerView2.c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                p4 p4Var2 = this.G0;
                if (p4Var2 != null && (z9Var = (z9) p4Var2.c) != null && !this.k0) {
                    z9Var.setSeeking(true);
                }
                this.k0 = true;
            }
            P();
            q9 q9Var = this.n0;
            if (q9Var == null || (currentPeerView = q9Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.a1);
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
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
        if (uf.b.a(findActivity) > 0) {
            h1 h1Var = this.A0;
            p1 p1Var = p1.Z;
            int i10 = 1;
            if (h1Var != null && !p1Var.S) {
                p1Var.S = true;
                p1Var.v = h1Var;
                int i11 = h1Var.e;
                p1Var.w = i11;
                NotificationCenter.getInstance(i11).addObserver(p1Var, NotificationCenter.liveStoryUpdated);
                p1Var.J = p1Var.n();
                p1Var.K = p1Var.m();
                p1Var.M = 1.0f;
                int i12 = 0;
                p1Var.H = false;
                o1.k kVar = new o1.k(p1Var, p1.X);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                p1Var.P = kVar;
                o1.k kVar2 = new o1.k(p1Var, p1.Y);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                p1Var.Q = kVar2;
                Context context = findActivity != null ? findActivity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new k1());
                p1Var.x = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                p1Var.x.setStylusScaleEnabled(false);
                p1Var.y = new le.b(context, new l1(scaledTouchSlop));
                m1 m1Var = new m1(context, 0);
                m1Var.b = new Path();
                p1Var.e = m1Var;
                n1 n1Var = new n1(context);
                p1Var.d = n1Var;
                n1Var.addView(p1Var.e, w7.z5.c(-1.0f, -1));
                p1Var.e.setOutlineProvider(new o1(i12));
                p1Var.e.setClipToOutline(true);
                p1Var.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                p1Var.n = w9Var;
                p1Var.e.addView(w9Var, w7.z5.c(-1.0f, -1));
                ei.d4 d4Var = new ei.d4(context, p1Var.w);
                p1Var.f = d4Var;
                d4Var.setAlpha(0.0f);
                p1Var.e.addView(p1Var.f, w7.z5.c(-1.0f, -1));
                un unVar = new un(context, i10);
                p1Var.r = unVar;
                p1Var.e.addView(unVar, w7.z5.c(-1.0f, -1));
                FrameLayout frameLayout = new FrameLayout(context);
                p1Var.h = frameLayout;
                frameLayout.setAlpha(0.0f);
                View view = new View(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{1140850688, 0});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                p1Var.h.addView(view, w7.z5.c(-1.0f, -1));
                int dp = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i13 = org.telegram.ui.ActionBar.h6.hg;
                imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                int i14 = org.telegram.ui.ActionBar.h6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 1, -1));
                imageView.setPadding(dp, dp, dp, dp);
                imageView.setOnClickListener(new ah.f(2));
                float f7 = 38;
                float f10 = 4;
                p1Var.h.addView(imageView, w7.z5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 1, -1));
                imageView2.setPadding(dp, dp, dp, dp);
                imageView2.setOnClickListener(new ai.p(10, h1Var, context));
                p1Var.h.addView(imageView2, w7.z5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
                p1Var.e.addView(p1Var.h, w7.z5.c(-1.0f, -1));
                p1Var.b = (WindowManager) context.getSystemService("window");
                WindowManager.LayoutParams b10 = uf.b.b(context, false);
                p1Var.c = b10;
                int i15 = p1Var.J;
                b10.width = i15;
                b10.height = p1Var.K;
                float dp2 = (AndroidUtilities.displaySize.x - i15) - AndroidUtilities.dp(16.0f);
                p1Var.N = dp2;
                b10.x = (int) dp2;
                WindowManager.LayoutParams layoutParams = p1Var.c;
                float dp3 = (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f);
                p1Var.O = dp3;
                layoutParams.y = (int) dp3;
                WindowManager.LayoutParams layoutParams2 = p1Var.c;
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags = 520;
                p1Var.d.setAlpha(0.0f);
                p1Var.d.setScaleX(0.1f);
                p1Var.d.setScaleY(0.1f);
                AndroidUtilities.setPreferredMaxRefreshRate(p1Var.b, p1Var.d, p1Var.c);
                p1Var.b.addView(p1Var.d, p1Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(bs.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(p1Var.d, (Property<n1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(p1Var.d, (Property<n1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(p1Var.d, (Property<n1, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new ah.z(i10));
                animatorSet.start();
                p1Var.i();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                rf.d dVar = p1Var.L;
                if (dVar != null) {
                    dVar.c();
                    p1Var.L = null;
                }
                if (findActivity != null && uf.b.a(findActivity) == 1) {
                    rf.c cVar = new rf.c(findActivity, p1Var);
                    cVar.c = "pip-live-story";
                    cVar.e = 1;
                    cVar.d = AndroidUtilities.dp(10.0f);
                    cVar.j = p1Var.d;
                    cVar.k = p1Var.f.getPlaceholderView();
                    p1Var.L = cVar.a();
                }
            }
            q(true);
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        z9 z9Var = this.z0;
        int i10 = 0;
        if (z9Var != null) {
            z9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((z9) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        q4 currentPeerView = this.n0.getCurrentPeerView();
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
            org.telegram.ui.ActionBar.n2 n2Var = this.f;
            if (n2Var.isPaused() || !n2Var.isLastFragment()) {
                w9 = true;
            }
        }
        if (org.telegram.ui.l4.x().V) {
            w9 = true;
        }
        this.n0.setPaused(w9);
        z9 z9Var = this.z0;
        if (z9Var != null) {
            if (w9) {
                z9Var.pause();
            } else {
                z9Var.play(B1);
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
        a7 a7Var;
        long j10;
        int i11;
        if (this.t0 == null) {
            this.V0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        x9 x9Var = this.s0;
        ImageReceiver imageReceiver = x9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = x9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            x9Var.c.setVisible(true, true);
        }
        q4 currentPeerView = this.n0.getCurrentPeerView();
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
                        a7Var = this.O0;
                        if (!(a7Var instanceof u6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(a7Var instanceof d7) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (a7Var != null) {
                            i10 = this.P0;
                        }
                        j10 = currentDialogId;
                        i11 = i10;
                        x9Var.a = null;
                        x9Var.m = null;
                        x9Var.b = null;
                        x9Var.c = null;
                        x9Var.e = null;
                        x9Var.f = null;
                        x9Var.g = null;
                        x9Var.d = null;
                        x9Var.l = null;
                        x9Var.h = 0.0f;
                        x9Var.i = 0.0f;
                        x9Var.o = 0;
                        x9Var.j = null;
                        x9Var.k = 1.0f;
                        if (!this.t0.Q0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, x9Var)) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        x9Var.o = i11;
                        View view = x9Var.a;
                        if (view == null) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = x9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.u1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f7 = iArr[0];
                        this.K = f7;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = x9Var.a;
                        if (callback instanceof o7) {
                            this.M = (o7) callback;
                        } else {
                            this.M = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = x9Var.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.getCenterX() + f7;
                            this.O = x9Var.b.getCenterY() + iArr[1];
                            this.R = x9Var.b.getImageWidth();
                            this.S = x9Var.b.getImageHeight();
                            y7 y7Var = x9Var.m;
                            if (y7Var != null) {
                                this.R = y7Var.b() * this.R;
                                this.S = x9Var.m.b() * this.S;
                            }
                            if (x9Var.a.getParent() instanceof View) {
                                View view3 = (View) x9Var.a.getParent();
                                this.N = (view3.getScaleX() * x9Var.b.getCenterX()) + iArr[0];
                                this.O = (view3.getScaleY() * x9Var.b.getCenterY()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = x9Var.c;
                            if (imageReceiver4 != null) {
                                this.N = imageReceiver4.getCenterX() + f7;
                                this.O = x9Var.c.getCenterY() + iArr[1];
                                this.R = x9Var.c.getImageWidth();
                                this.S = x9Var.c.getImageHeight();
                                this.W0 = x9Var.c.getRoundRadius();
                            }
                        }
                        x9Var.g.getLocationOnScreen(iArr);
                        float f10 = x9Var.h;
                        if (f10 == 0.0f && x9Var.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f11 = iArr[1];
                            this.P = f10 + f11;
                            this.Q = f11 + x9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                a7Var = this.O0;
                if (!(a7Var instanceof u6)) {
                }
                if (!(a7Var instanceof d7)) {
                }
                if (a7Var != null) {
                }
                j10 = currentDialogId2;
                i11 = i10;
                x9Var.a = null;
                x9Var.m = null;
                x9Var.b = null;
                x9Var.c = null;
                x9Var.e = null;
                x9Var.f = null;
                x9Var.g = null;
                x9Var.d = null;
                x9Var.l = null;
                x9Var.h = 0.0f;
                x9Var.i = 0.0f;
                x9Var.o = 0;
                x9Var.j = null;
                x9Var.k = 1.0f;
                if (!this.t0.Q0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, x9Var)) {
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
        a7Var = this.O0;
        if (!(a7Var instanceof u6)) {
        }
        if (!(a7Var instanceof d7)) {
        }
        if (a7Var != null) {
        }
        j10 = currentDialogId22;
        i11 = i10;
        x9Var.a = null;
        x9Var.m = null;
        x9Var.b = null;
        x9Var.c = null;
        x9Var.e = null;
        x9Var.f = null;
        x9Var.g = null;
        x9Var.d = null;
        x9Var.l = null;
        x9Var.h = 0.0f;
        x9Var.i = 0.0f;
        x9Var.o = 0;
        x9Var.j = null;
        x9Var.k = 1.0f;
        if (!this.t0.Q0(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, x9Var)) {
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

    @Override // org.telegram.ui.ActionBar.j2
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
            if (this.O0 == ((a7) objArr[0])) {
                t();
                q9 q9Var = this.n0;
                a7 a7Var = this.O0;
                q9Var.D(this.h, a7Var.d, a7Var.h());
                c6 c6Var = this.w;
                if (c6Var != null) {
                    TL_stories.StoryItem selectedStory = c6Var.getSelectedStory();
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
            w9 w9Var = this.t0;
            if (w9Var instanceof r7) {
                r7 r7Var = (r7) w9Var;
                if (!r7Var.r || r7Var.n) {
                    return;
                }
                i7 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = r7Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!r7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.n0.getAdapter().g();
                }
            }
            c6 c6Var2 = this.w;
            if (c6Var2 != null) {
                ArrayList arrayList3 = c6Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((w4) arrayList3.get(i12)).b();
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
        z9 z9Var = this.z0;
        if (z9Var == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = z9Var.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.j2, android.content.DialogInterface
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f;
        return (n2Var == null || t() == null || AndroidUtilities.findActivity(n2Var.getContext()) == null || this.A0 == null || this.D0 == null || this.H0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final /* synthetic */ xc getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final int getNavigationBarColor(int i10) {
        return i0.a.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final View getWindowView() {
        return this.s;
    }

    @Override // tf.a
    public final View h() {
        ei.d4 d4Var = new ei.d4(this.D0.getContext(), this.h);
        this.E0 = d4Var;
        return d4Var;
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
            ei.d4 d4Var = this.D0;
            if (d4Var != null) {
                d4Var.setSecure(!z11);
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
            ofFloat.addUpdateListener(new i9(this, 2));
            this.H.addListener(new j9(this, 1));
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
                c6 c6Var = this.w;
                float f10 = c6Var.c;
                if (f7 == f10) {
                    float f11 = f10 - 1.0f;
                    this.e0 = f11;
                    c6Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? this.w.c : 0.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new i9(this, 3));
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
        if (!this.b || (launchActivity = LaunchActivity.H1) == null) {
            return;
        }
        launchActivity.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean onAttachedBackPressed() {
        q4 currentPeerView;
        boolean z10 = false;
        if (this.e0 == 0.0f) {
            q9 q9Var = this.n0;
            if (q9Var != null && (currentPeerView = q9Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.s0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        c6 c6Var = this.w;
        if (c6Var.x > 0) {
            AndroidUtilities.hideKeyboard(c6Var);
            return true;
        }
        u5 currentPage = c6Var.getCurrentPage();
        if (currentPage != null) {
            z4 z4Var = currentPage.r;
            i5 i5Var = currentPage.f;
            if (i5Var != null && i5Var.b) {
                i5Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - z4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                z4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                z4Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            c6 c6Var = new c6(this.v.getContext(), this);
            this.w = c6Var;
            this.v.addView(c6Var, 0);
        }
        q4 currentPeerView = this.n0.getCurrentPeerView();
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
        ofFloat.addUpdateListener(new i9(this, 0));
        if (z10) {
            y();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            x9 x9Var = this.s0;
            ImageReceiver imageReceiver = x9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = x9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            x9Var.c = null;
            x9Var.b = null;
        }
        AndroidUtilities.runOnUIThread(new t3(this, 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        q4 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            o4 o4Var = currentPeerView.O1;
            if (!o4Var.j() && o4Var.e) {
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
            c6 c6Var = this.w;
            if (c6Var != null) {
                c6Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new bb(this, 4));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.u0 = null;
            return false;
        }
    }

    public final q4 t() {
        q9 q9Var = this.n0;
        if (q9Var == null) {
            return null;
        }
        return q9Var.getCurrentPeerView();
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
            x9 x9Var = this.s0;
            ImageReceiver imageReceiver = x9Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = x9Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            x9Var.c = null;
            x9Var.b = null;
            p9 p9Var = this.v;
            if (p9Var != null) {
                p9Var.a(true);
            }
            this.J0.unlock();
            p4 p4Var = this.G0;
            if (p4Var != null) {
                p4Var.b();
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
            t3 t3Var = this.o1;
            if (t3Var != null) {
                t3Var.run();
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
        q4 currentPeerView;
        int selectedPosition;
        this.d = true;
        x9 x9Var = this.s0;
        ImageReceiver imageReceiver = x9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = x9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            x9Var.c.setVisible(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((MessageObject) this.O0.i.get(selectedPosition)).getId();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i10 = this.U0;
            if (this.O0 instanceof d7) {
                q4 currentPeerView2 = this.n0.getCurrentPeerView();
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
            this.t0.X0(currentDialogId, i10, new t3(this, 5));
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

    @Override // tf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
