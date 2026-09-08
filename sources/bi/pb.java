package bi;

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
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class pb implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.j2, sf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public t1 A0;
    public hb B0;
    public SurfaceView C0;
    public di.l4 D0;
    public boolean E;
    public di.l4 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public n5 G0;
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
    public a9 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public l8 O0;
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
    public final p4 b1;
    public boolean c0;
    public boolean c1;
    public float d0;
    public v9 d1;
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
    public fb n0;
    public oa n1;
    public p4 o1;
    public int p0;
    public boolean p1;
    public boolean q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public db s;
    public final mb s0;
    public boolean s1;
    public lb t0;
    public long t1;
    public Dialog u0;
    public y8 u1;
    public eb v;
    public org.telegram.ui.ActionBar.j2 v0;
    public ValueAnimator v1;
    public a7 w;
    public boolean w0;
    public boolean w1;
    public boolean x;
    public final ArrayList x0;
    public org.telegram.ui.l4 y0;
    public ob z0;
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

    public pb(org.telegram.ui.ActionBar.n2 n2Var) {
        mb mbVar = new mb();
        mbVar.k = 1.0f;
        this.s0 = mbVar;
        this.x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new p4(this, 4);
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

    public static boolean i(pb pbVar, db dbVar, float f7, float f10, boolean z10) {
        n3 n3Var;
        n3 n3Var2;
        if (dbVar == null) {
            return false;
        }
        if (pbVar.X0) {
            return true;
        }
        if (pbVar.w != null && pbVar.e0 != 0.0f) {
            return true;
        }
        o5 currentPeerView = pbVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f7 - pbVar.v.getX()) - pbVar.n0.getX()) - currentPeerView.getX(), ((f10 - pbVar.v.getY()) - pbVar.n0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.v2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (n3Var2 = currentPeerView.b2) != null && n3Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.b2.getY() + currentPeerView.getY() + pbVar.n0.getY() + pbVar.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (n3Var = currentPeerView.b2) == null || !n3Var.w0()) && pbVar.u1 == null) {
            return AndroidUtilities.findClickableView(dbVar, f7, f10, currentPeerView);
        }
        return true;
    }

    public static void j(pb pbVar) {
        c4 c4Var;
        zt editField;
        o5 currentPeerView = pbVar.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.b2 == null || (((c4Var = currentPeerView.b3) != null && c4Var.getVisibility() == 0) || (editField = currentPeerView.b2.getEditField()) == null)) {
            pbVar.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new p4(pbVar, 6), 200L);
    }

    public static void k(pb pbVar) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(pbVar.X, pbVar.W) / AndroidUtilities.dp(80.0f)));
        if (pbVar.V != clamp01) {
            pbVar.V = clamp01;
            pbVar.o();
            o5 currentPeerView = pbVar.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.x2) {
                currentPeerView.invalidate();
            }
            t1 t1Var = pbVar.A0;
            if (t1Var != null) {
                t1Var.v((1.0f - pbVar.V) * pbVar.U);
            }
        }
        db dbVar = pbVar.s;
        if (dbVar != null) {
            dbVar.invalidate();
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

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, lb lbVar) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                B(i10, context, storyItem, arrayList, 0, null, null, lbVar, false);
            }
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, l8 l8Var, TL_stories.PeerStories peerStories, lb lbVar, boolean z10) {
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
        ob obVar = this.z0;
        if (obVar != null) {
            obVar.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.r1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && l8Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = l8Var;
        this.Q0 = peerStories;
        this.t0 = lbVar;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        fb fbVar = this.n0;
        if (fbVar != null) {
            fbVar.setHorizontalProgressToDismiss(0.0f);
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
            this.i0 = new GestureDetector(new za(this));
            this.s = new db(this, context, R);
        }
        int i12 = 10;
        if (this.v == null) {
            this.v = new eb(context, this);
            fb fbVar2 = new fb(this, this.h, context, this, this.y);
            this.n0 = fbVar2;
            fbVar2.setDelegate(new gb(this, l8Var, arrayList, context));
            this.v.addView(this.n0, w7.x5.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.l4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                hb hbVar = new hb(context, this);
                this.B0 = hbVar;
                this.y0.addView(hbVar);
            }
            di.l4 l4Var = new di.l4(context, this.h);
            this.D0 = l4Var;
            l4Var.setVisibility(8);
            this.y0.addView(this.D0);
            v9 v9Var = new v9(context);
            Paint paint = new Paint(1);
            v9Var.a = paint;
            v9Var.c = new androidx.activity.i(v9Var, i12);
            v9Var.d = new org.telegram.ui.Components.e6(v9Var);
            v9Var.e = new org.telegram.ui.Components.e6(v9Var);
            paint.setColor(-1);
            this.d1 = v9Var;
            this.v.addView(v9Var, w7.x5.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        di.l4 l4Var2 = this.D0;
        if (l4Var2 != null) {
            l4Var2.setAccount(this.h);
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
        if (l8Var != null) {
            this.n0.D(this.h, l8Var.d, l8Var.h());
        } else {
            fb fbVar3 = this.n0;
            int i13 = this.h;
            fbVar3.A0 = arrayList;
            fbVar3.y0 = i13;
            fbVar3.setAdapter(null);
            fbVar3.setAdapter(fbVar3.z0);
            fbVar3.setCurrentItem(i11);
            fbVar3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        eb ebVar = this.v;
        a1.c cVar = new a1.c(this, i12);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(ebVar, cVar);
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

    public final void C(Context context, int i10, l8 l8Var, d9 d9Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(l8Var.d));
        this.P0 = i10;
        G(context, null, arrayList, 0, l8Var, null, d9Var, false);
    }

    public final void D(Context context, long j3, lb lbVar) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        u8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y3 = storiesController.y(j3);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (p9.w(i10, y3.stories.get(i11))) {
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
        G(context, null, arrayList, 0, null, null, lbVar, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, lb lbVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        G(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, lbVar, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, d9 d9Var) {
        A(UserConfig.selectedAccount, context, storyItem, d9Var);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, l8 l8Var, TL_stories.PeerStories peerStories, lb lbVar, boolean z10) {
        B(UserConfig.selectedAccount, context, storyItem, arrayList, i10, l8Var, peerStories, lbVar, z10);
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
        ob obVar = this.z0;
        if (obVar != null) {
            obVar.release(null);
            this.z0 = null;
        }
        di.l4 l4Var = this.D0;
        if (l4Var != null) {
            l4Var.d(0L, null);
        }
        t1 t1Var = this.A0;
        if (t1Var != null) {
            a2 a2Var = a2.Z;
            if (!a2Var.S || a2Var.v != t1Var) {
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
            ((ob) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.i iVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            ((yb) iVar.n(i11)).b(false);
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
        o5 currentPeerView;
        o5 currentPeerView2;
        m5 m5Var;
        ob obVar;
        n5 n5Var;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (m5Var = currentPeerView2.O1) != null && !m5Var.f && m5Var.b == null) {
                if (!this.k0 && !this.j0 && (n5Var = this.G0) != null && ((ob) n5Var.c) != null) {
                    currentPeerView2.c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                n5 n5Var2 = this.G0;
                if (n5Var2 != null && (obVar = (ob) n5Var2.c) != null && !this.k0) {
                    obVar.setSeeking(true);
                }
                this.k0 = true;
            }
            P();
            fb fbVar = this.n0;
            if (fbVar == null || (currentPeerView = fbVar.getCurrentPeerView()) == null) {
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
            a2.o(findActivity, this.A0);
            q(true);
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        ob obVar = this.z0;
        int i10 = 0;
        if (obVar != null) {
            obVar.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ob) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        o5 currentPeerView = this.n0.getCurrentPeerView();
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
        ob obVar = this.z0;
        if (obVar != null) {
            if (w10) {
                obVar.pause();
            } else {
                obVar.play(B1);
            }
        }
        this.n0.D0 = (this.x || this.H0 || this.I0 || this.a1 || this.f1 || this.e0 != 0.0f || this.j1) ? false : true;
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
        l8 l8Var;
        long j3;
        int i11;
        if (this.t0 == null) {
            this.V0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        mb mbVar = this.s0;
        ImageReceiver imageReceiver = mbVar.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = mbVar.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            mbVar.c.setVisible(true, true);
        }
        o5 currentPeerView = this.n0.getCurrentPeerView();
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
                        l8Var = this.O0;
                        if (!(l8Var instanceof d8) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(l8Var instanceof o8) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (l8Var != null) {
                            i10 = this.P0;
                        }
                        j3 = currentDialogId;
                        i11 = i10;
                        mbVar.a = null;
                        mbVar.m = null;
                        mbVar.b = null;
                        mbVar.c = null;
                        mbVar.e = null;
                        mbVar.f = null;
                        mbVar.g = null;
                        mbVar.d = null;
                        mbVar.l = null;
                        mbVar.h = 0.0f;
                        mbVar.i = 0.0f;
                        mbVar.o = 0;
                        mbVar.j = null;
                        mbVar.k = 1.0f;
                        if (!this.t0.H0(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, mbVar)) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        mbVar.o = i11;
                        View view = mbVar.a;
                        if (view == null) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = mbVar.a;
                        if (view2 instanceof org.telegram.ui.Cells.t1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f7 = iArr[0];
                        this.K = f7;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = mbVar.a;
                        if (callback instanceof a9) {
                            this.M = (a9) callback;
                        } else {
                            this.M = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = mbVar.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.getCenterX() + f7;
                            this.O = mbVar.b.getCenterY() + iArr[1];
                            this.R = mbVar.b.getImageWidth();
                            this.S = mbVar.b.getImageHeight();
                            j9 j9Var = mbVar.m;
                            if (j9Var != null) {
                                this.R = j9Var.b() * this.R;
                                this.S = mbVar.m.b() * this.S;
                            }
                            if (mbVar.a.getParent() instanceof View) {
                                View view3 = (View) mbVar.a.getParent();
                                this.N = (view3.getScaleX() * mbVar.b.getCenterX()) + iArr[0];
                                this.O = (view3.getScaleY() * mbVar.b.getCenterY()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = mbVar.c;
                            if (imageReceiver4 != null) {
                                this.N = imageReceiver4.getCenterX() + f7;
                                this.O = mbVar.c.getCenterY() + iArr[1];
                                this.R = mbVar.c.getImageWidth();
                                this.S = mbVar.c.getImageHeight();
                                this.W0 = mbVar.c.getRoundRadius();
                            }
                        }
                        mbVar.g.getLocationOnScreen(iArr);
                        float f10 = mbVar.h;
                        if (f10 == 0.0f && mbVar.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f11 = iArr[1];
                            this.P = f10 + f11;
                            this.Q = f11 + mbVar.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                l8Var = this.O0;
                if (!(l8Var instanceof d8)) {
                }
                if (!(l8Var instanceof o8)) {
                }
                if (l8Var != null) {
                }
                j3 = currentDialogId2;
                i11 = i10;
                mbVar.a = null;
                mbVar.m = null;
                mbVar.b = null;
                mbVar.c = null;
                mbVar.e = null;
                mbVar.f = null;
                mbVar.g = null;
                mbVar.d = null;
                mbVar.l = null;
                mbVar.h = 0.0f;
                mbVar.i = 0.0f;
                mbVar.o = 0;
                mbVar.j = null;
                mbVar.k = 1.0f;
                if (!this.t0.H0(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, mbVar)) {
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
        l8Var = this.O0;
        if (!(l8Var instanceof d8)) {
        }
        if (!(l8Var instanceof o8)) {
        }
        if (l8Var != null) {
        }
        j3 = currentDialogId22;
        i11 = i10;
        mbVar.a = null;
        mbVar.m = null;
        mbVar.b = null;
        mbVar.c = null;
        mbVar.e = null;
        mbVar.f = null;
        mbVar.g = null;
        mbVar.d = null;
        mbVar.l = null;
        mbVar.h = 0.0f;
        mbVar.i = 0.0f;
        mbVar.o = 0;
        mbVar.j = null;
        mbVar.k = 1.0f;
        if (!this.t0.H0(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, mbVar)) {
        }
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        di.l4 l4Var = this.E0;
        if (l4Var != null) {
            l4Var.setOnFirstFrameCallback(pVar);
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
        di.l4 l4Var = this.E0;
        if (l4Var != null) {
            l4Var.setOnFirstFrameCallback(pVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        di.l4 l4Var2 = this.E0;
        if (l4Var2 != null) {
            l4Var2.b();
            this.E0 = null;
        }
        this.s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override // sf.a
    public final Bitmap c() {
        di.l4 l4Var = this.E0;
        if (l4Var == null || !l4Var.a()) {
            return null;
        }
        return this.E0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((l8) objArr[0])) {
                t();
                fb fbVar = this.n0;
                l8 l8Var = this.O0;
                fbVar.D(this.h, l8Var.d, l8Var.h());
                a7 a7Var = this.w;
                if (a7Var != null) {
                    TL_stories.StoryItem selectedStory = a7Var.getSelectedStory();
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
            lb lbVar = this.t0;
            if (lbVar instanceof d9) {
                d9 d9Var = (d9) lbVar;
                if (!d9Var.r || d9Var.n) {
                    return;
                }
                u8 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = d9Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!d9Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.n0.getAdapter().g();
                }
            }
            a7 a7Var2 = this.w;
            if (a7Var2 != null) {
                ArrayList arrayList3 = a7Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((v5) arrayList3.get(i12)).b();
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
        ob obVar = this.z0;
        if (obVar == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = obVar.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        q(true);
    }

    @Override // sf.a
    public final Bitmap e() {
        di.l4 l4Var = this.D0;
        if (l4Var == null || !l4Var.a()) {
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
    public final /* synthetic */ yc getBulletinFactory() {
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
        di.l4 l4Var = new di.l4(this.D0.getContext(), this.h);
        this.E0 = l4Var;
        return l4Var;
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
            di.l4 l4Var = this.D0;
            if (l4Var != null) {
                l4Var.setSecure(!z11);
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
            ofFloat.addUpdateListener(new xa(this, 2));
            this.H.addListener(new ya(this, 1));
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
                a7 a7Var = this.w;
                float f10 = a7Var.c;
                if (f7 == f10) {
                    float f11 = f10 - 1.0f;
                    this.e0 = f11;
                    a7Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? this.w.c : 0.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new xa(this, 3));
            this.v1.addListener(new ah.q0(4, this, z10));
            if (z10) {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(pr.h);
            } else {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(pr.f);
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
        o5 currentPeerView;
        boolean z10 = false;
        if (this.e0 == 0.0f) {
            fb fbVar = this.n0;
            if (fbVar != null && (currentPeerView = fbVar.getCurrentPeerView()) != null) {
                z10 = currentPeerView.s0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        a7 a7Var = this.w;
        if (a7Var.x > 0) {
            AndroidUtilities.hideKeyboard(a7Var);
            return true;
        }
        s6 currentPage = a7Var.getCurrentPage();
        if (currentPage != null) {
            y5 y5Var = currentPage.r;
            g6 g6Var = currentPage.f;
            if (g6Var != null && g6Var.b) {
                g6Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - y5Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                y5Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                y5Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            a7 a7Var = new a7(this.v.getContext(), this);
            this.w = a7Var;
            this.v.addView(a7Var, 0);
        }
        o5 currentPeerView = this.n0.getCurrentPeerView();
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
        ofFloat.addUpdateListener(new xa(this, 0));
        if (z10) {
            y();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            mb mbVar = this.s0;
            ImageReceiver imageReceiver = mbVar.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = mbVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            mbVar.c = null;
            mbVar.b = null;
        }
        AndroidUtilities.runOnUIThread(new p4(this, 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        o5 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            m5 m5Var = currentPeerView.O1;
            if (!m5Var.j() && m5Var.e) {
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
            a7 a7Var = this.w;
            if (a7Var != null) {
                a7Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new r4(this, 1));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.u0 = null;
            return false;
        }
    }

    public final o5 t() {
        fb fbVar = this.n0;
        if (fbVar == null) {
            return null;
        }
        return fbVar.getCurrentPeerView();
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
            mb mbVar = this.s0;
            ImageReceiver imageReceiver = mbVar.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = mbVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            mbVar.c = null;
            mbVar.b = null;
            eb ebVar = this.v;
            if (ebVar != null) {
                ebVar.a(true);
            }
            this.J0.unlock();
            n5 n5Var = this.G0;
            if (n5Var != null) {
                n5Var.b();
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
            p4 p4Var = this.o1;
            if (p4Var != null) {
                p4Var.run();
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
        o5 currentPeerView;
        int selectedPosition;
        this.d = true;
        mb mbVar = this.s0;
        ImageReceiver imageReceiver = mbVar.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = mbVar.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            mbVar.c.setVisible(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((MessageObject) this.O0.i.get(selectedPosition)).getId();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i10 = this.U0;
            if (this.O0 instanceof o8) {
                o5 currentPeerView2 = this.n0.getCurrentPeerView();
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
            this.t0.p(currentDialogId, i10, new p4(this, 5));
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
