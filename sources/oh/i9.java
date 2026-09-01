package oh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class i9 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.l2, ef.a {
    public static boolean A1;
    public static boolean u1;
    public static TL_stories.StoryItem w1;
    public static boolean x1;
    public qh.k3 A0;
    public boolean B;
    public qh.k3 B0;
    public ValueAnimator C;
    public Uri C0;
    public ValueAnimator D;
    public e4 D0;
    public ValueAnimator E;
    public boolean E0;
    public long F;
    public boolean F0;
    public int G;
    public final AnimationNotificationsLocker G0;
    public float H;
    public boolean H0;
    public float I;
    public boolean I0;
    public z6 J;
    public final ArrayList J0;
    public float K;
    public boolean K0;
    public float L;
    public l6 L0;
    public float M;
    public int M0;
    public float N;
    public TL_stories.PeerStories N0;
    public float O;
    public boolean O0;
    public float P;
    public boolean P0;
    public TL_stories.StoryItem Q0;
    public float R;
    public int R0;
    public float S;
    public boolean S0;
    public float T;
    public int[] T0;
    public float U;
    public boolean U0;
    public float V;
    public boolean V0;
    public float W;
    public boolean W0;
    public boolean X;
    public boolean X0;
    public float Y;
    public final l3 Y0;
    public boolean Z;
    public boolean Z0;
    public float a0;
    public s7 a1;
    public float b0;
    public final LongSparseIntArray b1;
    public boolean c0;
    public boolean c1;
    public boolean d0;
    public boolean d1;
    public boolean e0;
    public boolean e1;
    public final org.telegram.ui.ActionBar.p2 f;
    public GestureDetector f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public int h;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public y8 k0;
    public t3 k1;
    public l3 l1;
    public int m0;
    public boolean m1;
    public WindowManager n;
    public boolean n0;
    public float n1;
    public float o0;
    public boolean o1;
    public final f9 p0;
    public boolean p1;
    public e9 q0;
    public long q1;
    public WindowManager.LayoutParams r;
    public Dialog r0;
    public x6 r1;
    public w8 s;
    public org.telegram.ui.ActionBar.l2 s0;
    public ValueAnimator s1;
    public boolean t0;
    public boolean t1;
    public final ArrayList u0;
    public x8 v;
    public org.telegram.ui.o4 v0;
    public n5 w;
    public h9 w0;
    public boolean x;
    public e1 x0;
    public a9 y0;
    public SurfaceView z0;
    public static final ArrayList v1 = new ArrayList();
    public static float y1 = 1.0f;
    public static boolean z1 = true;
    public static final LongSparseArray B1 = new LongSparseArray();
    public boolean a = SharedConfig.useSurfaceInStories;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b y = new b();
    public final RectF Q = new RectF();
    public final float[] l0 = new float[2];

    public i9(org.telegram.ui.ActionBar.p2 p2Var) {
        f9 f9Var = new f9();
        f9Var.k = 1.0f;
        this.p0 = f9Var;
        this.u0 = new ArrayList();
        this.E0 = true;
        this.G0 = new AnimationNotificationsLocker();
        this.J0 = new ArrayList();
        this.W0 = false;
        this.Y0 = new l3(this, 4);
        this.b1 = new LongSparseIntArray();
        new Paint(1);
        this.f = p2Var;
    }

    public static void J(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        B1.put(j10 + (j10 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean i(i9 i9Var, w8 w8Var, float f10, float f11, boolean z4) {
        p2 p2Var;
        p2 p2Var2;
        if (w8Var == null) {
            return false;
        }
        if (i9Var.U0) {
            return true;
        }
        if (i9Var.w != null && i9Var.b0 != 0.0f) {
            return true;
        }
        f4 currentPeerView = i9Var.k0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f10 - i9Var.v.getX()) - i9Var.k0.getX()) - currentPeerView.getX(), ((f11 - i9Var.v.getY()) - i9Var.k0.getY()) - currentPeerView.getY(), z4)) {
                return true;
            }
            if (currentPeerView.s2) {
                return false;
            }
        }
        if (z4) {
            return false;
        }
        if (currentPeerView != null && (p2Var2 = currentPeerView.Y1) != null && p2Var2.getVisibility() == 0) {
            if (f11 > currentPeerView.Y1.getY() + currentPeerView.getY() + i9Var.k0.getY() + i9Var.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (p2Var = currentPeerView.Y1) == null || !p2Var.w0()) && i9Var.r1 == null) {
            return AndroidUtilities.findClickableView(w8Var, f10, f11, currentPeerView);
        }
        return true;
    }

    public static void j(i9 i9Var) {
        hg.q qVar;
        xt editField;
        f4 currentPeerView = i9Var.k0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.Y1 == null || (((qVar = currentPeerView.Y2) != null && qVar.getVisibility() == 0) || (editField = currentPeerView.Y1.getEditField()) == null)) {
            i9Var.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new l3(i9Var, 6), 200L);
    }

    public static void k(i9 i9Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(i9Var.U, i9Var.T) / AndroidUtilities.dp(80.0f)));
        if (i9Var.S != clamp01) {
            i9Var.S = clamp01;
            i9Var.o();
            f4 currentPeerView = i9Var.k0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.u2) {
                currentPeerView.invalidate();
            }
            e1 e1Var = i9Var.x0;
            if (e1Var != null) {
                e1Var.v((1.0f - i9Var.S) * i9Var.R);
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
        return (CharSequence) B1.get(j10 + (j10 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        return w1 != null && (messageObject.type == 23 || messageObject.isWebpage()) && !x1 && w1.messageId == messageObject.getId() && w1.messageType != 3;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, l6 l6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z4) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.u0;
        if (!isContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C = null;
        }
        if (this.j0) {
            arrayList2.clear();
            return;
        }
        y1 = 1.0f;
        h9 h9Var = this.w0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        boolean z10 = (AndroidUtilities.isTablet() || this.o1) ? false : true;
        this.b = z10;
        this.a = SharedConfig.useSurfaceInStories && z10;
        this.R0 = storyItem == null ? 0 : storyItem.messageId;
        this.K0 = storyItem != null && l6Var == null && peerStories == null;
        this.P0 = false;
        if (storyItem != null) {
            this.Q0 = storyItem;
            w1 = storyItem;
        }
        this.L0 = l6Var;
        this.N0 = peerStories;
        this.q0 = e9Var;
        this.O0 = z4;
        this.h = i10;
        this.T = 0.0f;
        this.U = 0.0f;
        y8 y8Var = this.k0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.k0.C0 = 0;
        }
        this.a0 = 0.0f;
        this.W = 0.0f;
        this.i0 = false;
        this.S = 0.0f;
        this.j0 = true;
        this.X0 = false;
        this.W0 = false;
        this.b1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.Y0);
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
        this.E0 = false;
        this.Z0 = false;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (this.s == null) {
            this.f0 = new GestureDetector(new s8(this));
            this.s = new w8(this, context, R);
        }
        if (this.v == null) {
            this.v = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.y);
            this.k0 = y8Var2;
            y8Var2.setDelegate(new z8(this, l6Var, arrayList, context));
            this.v.addView(this.k0, k7.c6.e(-1, -1, 1));
            this.v0 = new org.telegram.ui.o4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.z0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.z0.setZOrderOnTop(false);
                this.v0.addView(this.z0);
            } else {
                a9 a9Var = new a9(context, this);
                this.y0 = a9Var;
                this.v0.addView(a9Var);
            }
            qh.k3 k3Var = new qh.k3(context, this.h);
            this.A0 = k3Var;
            k3Var.setVisibility(8);
            this.v0.addView(this.A0);
            s7 s7Var = new s7(context);
            Paint paint = new Paint(1);
            s7Var.a = paint;
            s7Var.c = new m2.b(s7Var, 5);
            s7Var.d = new org.telegram.ui.Components.z5(s7Var);
            s7Var.e = new org.telegram.ui.Components.z5(s7Var);
            paint.setColor(-1);
            this.a1 = s7Var;
            this.v.addView(s7Var, k7.c6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        qh.k3 k3Var2 = this.A0;
        if (k3Var2 != null) {
            k3Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.v0);
        this.s.addView(this.v0);
        SurfaceView surfaceView2 = this.z0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.s.addView(this.v);
        this.s.setClipChildren(false);
        if (this.K0) {
            Q();
        }
        if (l6Var != null) {
            this.k0.D(this.h, l6Var.d, l6Var.h());
        } else {
            y8 y8Var3 = this.k0;
            int i12 = this.h;
            y8Var3.x0 = arrayList;
            y8Var3.v0 = i12;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.w0);
            y8Var3.setCurrentItem(i11);
            y8Var3.z0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        x8 x8Var = this.v;
        mh.m5 m5Var = new mh.m5(this, 14);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(x8Var, m5Var);
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
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 3));
            }
        }
        this.s.requestLayout();
        x1 = true;
        Q();
        this.R = 0.0f;
        o();
        u1 = true;
        if (z1) {
            z1 = false;
            A1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            z(true);
        }
        if (!this.b) {
            v1.add(this);
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

    public final void C(Context context, int i10, l6 l6Var, c7 c7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(l6Var.d));
        this.M0 = i10;
        F(context, null, arrayList, 0, l6Var, null, c7Var, false);
    }

    public final void D(Context context, long j10, e9 e9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        t6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y10 = storiesController.y(j10);
        if (y10 != null) {
            int i11 = 0;
            while (i11 < y10.stories.size()) {
                if (m7.w(i10, y10.stories.get(i11))) {
                    y10.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y10.stories.isEmpty() && !storiesController.J(j10)) {
                storiesController.g.remove(y10);
                storiesController.h.remove(y10);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        F(context, null, arrayList, 0, null, null, e9Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, e9 e9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.u0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        F(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, e9Var, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, l6 l6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z4) {
        A(UserConfig.selectedAccount, context, storyItem, arrayList, i10, l6Var, peerStories, e9Var, z4);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, c7 c7Var) {
        B(UserConfig.selectedAccount, context, storyItem, c7Var);
    }

    public final void H(org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.b) {
            R.presentFragment(p2Var);
        } else {
            R.presentFragment(p2Var);
            q(false);
        }
    }

    public final void I() {
        ArrayList arrayList;
        this.C0 = null;
        K(false);
        l(true);
        h9 h9Var = this.w0;
        if (h9Var != null) {
            h9Var.release(null);
            this.w0 = null;
        }
        qh.k3 k3Var = this.A0;
        if (k3Var != null) {
            k3Var.d(0L, null);
        }
        e1 e1Var = this.x0;
        if (e1Var != null) {
            j1 j1Var = j1.W;
            if (!j1Var.P || j1Var.v != e1Var) {
                if (e1Var.n) {
                    e1Var.s(null);
                } else {
                    e1Var.e();
                }
            }
        }
        this.x0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.J0;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f;
        if (p2Var != null) {
            p2Var.removeSheet(this);
        }
        v1.remove(this);
        this.u0.clear();
        this.b0 = 0.0f;
        w1 = null;
    }

    public final void K(boolean z4) {
        this.n0 = z4;
        if (z4) {
            m2.b bVar = this.a1.c;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
        P();
    }

    public final void L(boolean z4) {
        f4 currentPeerView;
        f4 currentPeerView2;
        d4 d4Var;
        h9 h9Var;
        e4 e4Var;
        if (this.X0 != z4) {
            this.X0 = z4;
            if (z4 && !this.c1 && (currentPeerView2 = this.k0.getCurrentPeerView()) != null && (d4Var = currentPeerView2.L1) != null && !d4Var.f && d4Var.b == null) {
                if (!this.h0 && !this.g0 && (e4Var = this.D0) != null && e4Var.b != null) {
                    currentPeerView2.Z0.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                e4 e4Var2 = this.D0;
                if (e4Var2 != null && (h9Var = e4Var2.b) != null && !this.h0) {
                    h9Var.setSeeking(true);
                }
                this.h0 = true;
            }
            P();
            y8 y8Var = this.k0;
            if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.X0);
        }
    }

    public final void M(boolean z4) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z4) {
            this.t0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
        }
        if (this.t0) {
            AndroidUtilities.setLightNavigationBar(launchActivity, !z4);
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (this.x0 == null || (p2Var = this.f) == null || this.A0 == null) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(p2Var.getContext());
        if (ff.d.a(findActivity) > 0) {
            j1.o(findActivity, this.x0);
            q(true);
        }
    }

    public final void O() {
        boolean z4 = A1;
        A1 = !z4;
        h9 h9Var = this.w0;
        int i10 = 0;
        if (h9Var != null) {
            h9Var.setAudioEnabled(z4, false);
        }
        while (true) {
            ArrayList arrayList = this.J0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i10)).setAudioEnabled(!A1, true);
            i10++;
        }
        f4 currentPeerView = this.k0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.u1.a(A1, true);
        }
        if (A1) {
            return;
        }
        this.a1.b();
    }

    public final void P() {
        if (this.k0 == null) {
            return;
        }
        boolean w10 = w();
        if (this.b) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f;
            if (p2Var.isPaused() || !p2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.l4.x().S) {
            w10 = true;
        }
        this.k0.setPaused(w10);
        h9 h9Var = this.w0;
        if (h9Var != null) {
            if (w10) {
                h9Var.pause();
            } else {
                h9Var.play(y1);
            }
        }
        this.k0.A0 = (this.x || this.E0 || this.F0 || this.X0 || this.c1 || this.b0 != 0.0f || this.g1) ? false : true;
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
        l6 l6Var;
        long j10;
        int i11;
        if (this.q0 == null) {
            this.S0 = false;
            this.L = 0.0f;
            this.K = 0.0f;
            return;
        }
        f9 f9Var = this.p0;
        ImageReceiver imageReceiver = f9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.c.setVisible(true, true);
        }
        f4 currentPeerView = this.k0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.s1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i10 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.s1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.K0) {
                            storyItem = this.Q0;
                        }
                        long currentDialogId = this.k0.getCurrentDialogId();
                        l6Var = this.L0;
                        if (!(l6Var instanceof f6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(l6Var instanceof o6) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (l6Var != null) {
                            i10 = this.M0;
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
                        if (!this.q0.k1(j10, this.R0, i11, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
                            this.S0 = false;
                            this.L = 0.0f;
                            this.K = 0.0f;
                            return;
                        }
                        f9Var.o = i11;
                        View view = f9Var.a;
                        if (view == null) {
                            this.S0 = false;
                            this.L = 0.0f;
                            this.K = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = f9Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.t1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f10 = iArr[0];
                        this.H = f10;
                        this.I = iArr[1];
                        KeyEvent.Callback callback = f9Var.a;
                        if (callback instanceof z6) {
                            this.J = (z6) callback;
                        } else {
                            this.J = null;
                        }
                        this.S0 = false;
                        ImageReceiver imageReceiver3 = f9Var.b;
                        if (imageReceiver3 != null) {
                            this.K = imageReceiver3.getCenterX() + f10;
                            this.L = f9Var.b.getCenterY() + iArr[1];
                            this.O = f9Var.b.getImageWidth();
                            this.P = f9Var.b.getImageHeight();
                            i7 i7Var = f9Var.m;
                            if (i7Var != null) {
                                this.O = i7Var.b() * this.O;
                                this.P = f9Var.m.b() * this.P;
                            }
                            if (f9Var.a.getParent() instanceof View) {
                                View view3 = (View) f9Var.a.getParent();
                                this.K = (view3.getScaleX() * f9Var.b.getCenterX()) + iArr[0];
                                this.L = (view3.getScaleY() * f9Var.b.getCenterY()) + iArr[1];
                                this.O = view3.getScaleX() * this.O;
                                this.P = view3.getScaleY() * this.P;
                            }
                            this.S0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = f9Var.c;
                            if (imageReceiver4 != null) {
                                this.K = imageReceiver4.getCenterX() + f10;
                                this.L = f9Var.c.getCenterY() + iArr[1];
                                this.O = f9Var.c.getImageWidth();
                                this.P = f9Var.c.getImageHeight();
                                this.T0 = f9Var.c.getRoundRadius();
                            }
                        }
                        f9Var.g.getLocationOnScreen(iArr);
                        float f11 = f9Var.h;
                        if (f11 == 0.0f && f9Var.i == 0.0f) {
                            this.M = 0.0f;
                            this.N = 0.0f;
                            return;
                        } else {
                            float f12 = iArr[1];
                            this.M = f11 + f12;
                            this.N = f12 + f9Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.Q0;
                }
                long currentDialogId2 = this.k0.getCurrentDialogId();
                l6Var = this.L0;
                if (!(l6Var instanceof f6)) {
                }
                if (!(l6Var instanceof o6)) {
                }
                if (l6Var != null) {
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
                if (!this.q0.k1(j10, this.R0, i11, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
                }
            }
        }
        i10 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.k0.getCurrentDialogId();
        l6Var = this.L0;
        if (!(l6Var instanceof f6)) {
        }
        if (!(l6Var instanceof o6)) {
        }
        if (l6Var != null) {
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
        if (!this.q0.k1(j10, this.R0, i11, storyItem == null ? -1 : storyItem.messageType, f9Var)) {
        }
    }

    @Override // ef.a
    public final void a(c2.p pVar) {
        qh.k3 k3Var = this.B0;
        if (k3Var != null) {
            k3Var.setOnFirstFrameCallback(pVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        qh.k3 k3Var2 = this.B0;
        if (k3Var2 != null) {
            k3Var2.b();
            this.B0 = null;
        }
        this.s.invalidate();
        this.x0.s(this.A0.getSink());
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean attachedToParent() {
        return this.b && this.s != null;
    }

    @Override // ef.a
    public final Bitmap b() {
        qh.k3 k3Var = this.B0;
        if (k3Var == null || !k3Var.a()) {
            return null;
        }
        return this.B0.getBitmap();
    }

    @Override // ef.a
    public final Bitmap d() {
        qh.k3 k3Var = this.A0;
        if (k3Var == null || !k3Var.a()) {
            return null;
        }
        return this.A0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.L0 == ((l6) objArr[0])) {
                t();
                y8 y8Var = this.k0;
                l6 l6Var = this.L0;
                y8Var.D(this.h, l6Var.d, l6Var.h());
                n5 n5Var = this.w;
                if (n5Var != null) {
                    TL_stories.StoryItem selectedStory = n5Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.L0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((MessageObject) this.L0.i.get(i12)).storyItem.id) {
                            i13 = i12;
                        }
                        arrayList.add(((MessageObject) this.L0.i.get(i12)).storyItem);
                        i12++;
                    }
                    this.w.b(i13, this.L0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            e9 e9Var = this.q0;
            if (e9Var instanceof c7) {
                c7 c7Var = (c7) e9Var;
                if (!c7Var.r || c7Var.n) {
                    return;
                }
                t6 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = c7Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.k0.getDialogIds();
                boolean z4 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!c7Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z4 = true;
                    }
                }
                if (z4) {
                    this.k0.getAdapter().g();
                }
            }
            n5 n5Var2 = this.w;
            if (n5Var2 != null) {
                ArrayList arrayList3 = n5Var2.h.D;
                while (i12 < arrayList3.size()) {
                    ((j4) arrayList3.get(i12)).b();
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
                TL_stories.StoryItem storyItem = this.Q0;
                if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                    this.P0 = true;
                    return;
                }
                return;
            }
            return;
        }
        P();
        if (i10 != i15) {
            if (this.p1 || t() == null) {
                return;
            }
            t().f1(false);
            return;
        }
        h9 h9Var = this.w0;
        if (h9Var == null) {
            this.q1 = 0L;
            return;
        }
        this.q1 = h9Var.currentPosition;
        this.w0.release(null);
        this.w0 = null;
    }

    @Override // org.telegram.ui.ActionBar.l2, android.content.DialogInterface
    public final void dismiss() {
        q(true);
    }

    @Override // ef.a
    public final void e(c2.p pVar) {
        qh.k3 k3Var = this.B0;
        if (k3Var != null) {
            k3Var.setOnFirstFrameCallback(pVar);
            this.x0.s(this.B0.getSink());
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    @Override // ef.a
    public final boolean g() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f;
        return (p2Var == null || t() == null || AndroidUtilities.findActivity(p2Var.getContext()) == null || this.x0 == null || this.A0 == null || this.E0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final /* synthetic */ qc getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.S) * 0.5f) + 0.5f) * this.R, i10, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final View getWindowView() {
        return this.s;
    }

    @Override // ef.a
    public final View h() {
        qh.k3 k3Var = new qh.k3(this.A0.getContext(), this.h);
        this.B0 = k3Var;
        return k3Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isFullyVisible() {
        return this.H0;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isShown() {
        return !this.E0;
    }

    public final void l(boolean z4) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        boolean z10 = !this.j0 || z4;
        if (this.e != z10) {
            this.e = z10;
            SurfaceView surfaceView = this.z0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z10);
            }
            qh.k3 k3Var = this.A0;
            if (k3Var != null) {
                k3Var.setSecure(!z10);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.p2 p2Var = this.f;
                if (p2Var.getParentActivity() != null) {
                    if (z10) {
                        p2Var.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        p2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                }
                return;
            }
            if (z10) {
                this.r.flags &= -8193;
                AndroidUtilities.logFlagSecure();
            } else {
                this.r.flags |= 8192;
                AndroidUtilities.logFlagSecure();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void m() {
        if (this.E == null) {
            this.g0 = false;
            this.i0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 2));
            this.E.addListener(new r8(this, 1));
            this.E.setDuration(250L);
            this.E.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            this.E.start();
        }
    }

    public final void n(boolean z4) {
        if (this.s1 != null) {
            return;
        }
        if (this.m0 != 0) {
            AndroidUtilities.hideKeyboard(this.w);
            return;
        }
        if (this.Z || this.b0 != 0.0f) {
            this.G0.lock();
            if (!z4) {
                float f10 = this.b0;
                n5 n5Var = this.w;
                float f11 = n5Var.c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.b0 = f12;
                    n5Var.setOffset(f12);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z4 ? this.w.c : 0.0f);
            this.s1 = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 3));
            this.s1.addListener(new eg.u2(7, this, z4));
            if (z4) {
                this.s1.setDuration(350L);
                this.s1.setInterpolator(pr.h);
            } else {
                this.s1.setDuration(350L);
                this.s1.setInterpolator(pr.f);
            }
            this.s1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.D1) == null) {
            return;
        }
        launchActivity.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean onAttachedBackPressed() {
        f4 currentPeerView;
        boolean z4 = false;
        if (this.b0 == 0.0f) {
            y8 y8Var = this.k0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                z4 = currentPeerView.s0();
            }
            if (z4) {
                return true;
            }
            q(true);
            return true;
        }
        n5 n5Var = this.w;
        if (n5Var.x > 0) {
            AndroidUtilities.hideKeyboard(n5Var);
            return true;
        }
        e5 currentPage = n5Var.getCurrentPage();
        if (currentPage != null) {
            l4 l4Var = currentPage.r;
            t4 t4Var = currentPage.f;
            if (t4Var != null && t4Var.b) {
                t4Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - l4Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                l4Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                l4Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            n5 n5Var = new n5(this.v.getContext(), this);
            this.w = n5Var;
            this.v.addView(n5Var, 0);
        }
        f4 currentPeerView = this.k0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.L0 == null) {
                this.w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.L0.i.size(); i10++) {
                arrayList.add(((MessageObject) this.L0.i.get(i10)).storyItem);
            }
            this.w.b(currentPeerView.getListPosition(), this.L0.d, arrayList);
        }
    }

    public final void q(boolean z4) {
        AndroidUtilities.hideKeyboard(this.s);
        this.E0 = true;
        this.e1 = true;
        P();
        M(false);
        Q();
        this.G0.lock();
        this.Y = this.T;
        this.B = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, 0.0f);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new q8(this, 0));
        if (z4) {
            y();
        } else {
            this.L = 0.0f;
            this.K = 0.0f;
            f9 f9Var = this.p0;
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
        AndroidUtilities.runOnUIThread(new l3(this, 2), 16L);
        if (this.Z0) {
            this.Z0 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (A1) {
            O();
            return;
        }
        f4 currentPeerView = this.k0.getCurrentPeerView();
        if (currentPeerView != null) {
            d4 d4Var = currentPeerView.L1;
            if (!d4Var.j() && d4Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.a1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.u0.add(runnable);
        }
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.m0 != i10) {
            this.m0 = i10;
            this.k0.setKeyboardHeight(i10);
            this.k0.requestLayout();
            n5 n5Var = this.w;
            if (n5Var != null) {
                n5Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.r0 = dialog;
            dialog.setOnDismissListener(new fg.d0(this, 7));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.r0 = null;
            return false;
        }
    }

    public final f4 t() {
        y8 y8Var = this.k0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.j0) {
            AndroidUtilities.hideKeyboard(this.s);
            this.E0 = true;
            this.H0 = false;
            this.R = 0.0f;
            this.S = 0.0f;
            P();
            this.L = 0.0f;
            this.K = 0.0f;
            f9 f9Var = this.p0;
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
            this.G0.unlock();
            e4 e4Var = this.D0;
            if (e4Var != null) {
                e4Var.a();
            }
            I();
            if (this.b) {
                AndroidUtilities.removeFromParent(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            this.j0 = false;
            this.d = false;
            o();
            l3 l3Var = this.l1;
            if (l3Var != null) {
                l3Var.run();
                this.l1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (this.U0 || this.W0 || this.V0 || this.I0 || this.n0 || this.x || this.r0 != null || this.s0 != null || this.E0 || this.F0 || this.R != 1.0f || this.b0 != 0.0f || this.f1) {
            return true;
        }
        if ((this.i1 && this.a) || this.h1 || this.g1 || this.m1 || this.S != 0.0f || this.r1 != null) {
            return true;
        }
        return (!this.b || (p2Var = this.f) == null || p2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        TL_stories.StoryItem storyItem;
        f4 currentPeerView;
        int selectedPosition;
        this.d = true;
        f9 f9Var = this.p0;
        ImageReceiver imageReceiver = f9Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = f9Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            f9Var.c.setVisible(true, true);
        }
        if (this.L0 != null && (currentPeerView = this.k0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.L0.i.size()) {
            this.R0 = ((MessageObject) this.L0.i.get(selectedPosition)).getId();
        }
        if (this.q0 != null) {
            long currentDialogId = this.k0.getCurrentDialogId();
            int i10 = this.R0;
            if (this.L0 instanceof o6) {
                f4 currentPeerView2 = this.k0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.s1;
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
            this.q0.b0(currentDialogId, i10, new l3(this, 5));
        }
    }

    public final void z(boolean z4) {
        Activity findActivity = AndroidUtilities.findActivity(this.f.getContext());
        if (findActivity != null) {
            try {
                findActivity.setRequestedOrientation(z4 ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z4) {
                findActivity.getWindow().addFlags(128);
            } else {
                findActivity.getWindow().clearFlags(128);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void dismiss(boolean z4) {
        q(true);
    }

    @Override // ef.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // ef.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final /* synthetic */ void setLastVisible(boolean z4) {
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
