package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class fy extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, xf.b, vd.b, mg0 {
    public static boolean t4;
    public static final boolean[] u4 = new boolean[4];
    public static final org.telegram.ui.Components.cr0 v4 = new org.telegram.ui.Components.cr0(3);
    public static float w4;
    public boolean A;
    public xw A0;
    public final TextPaint A1;
    public String A2;
    public org.telegram.ui.Cells.o A3;
    public boolean B;
    public org.telegram.ui.Components.ds B0;
    public pw B1;
    public CharSequence B2;
    public ax B3;
    public TLRPC.RequestPeerType C;
    public boolean C0;
    public FrameLayout C1;
    public org.telegram.ui.Components.iq0 C2;
    public final ow C3;
    public long D;
    public float D0;
    public pw D1;
    public org.telegram.ui.Components.voip.o D2;
    public final ow D3;
    public ValueAnimator E;
    public float E0;
    public FrameLayout E1;
    public final ArrayList E2;
    public kg0 E3;
    public ValueAnimator F;
    public float F0;
    public org.telegram.ui.Components.fs F1;
    public boolean F2;
    public NotificationCenter.ObserversGroup F3;
    public boolean G;
    public cg.h0 G0;
    public org.telegram.ui.Components.es G1;
    public int G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public org.telegram.ui.Components.j70 H0;
    public org.telegram.ui.Cells.m H1;
    public int H2;
    public Drawable H3;
    public boolean I;
    public cx I0;
    public org.telegram.ui.Cells.x2 I1;
    public int I2;
    public int I3;
    public float J;
    public boolean J0;
    public org.telegram.ui.Cells.pa J1;
    public int J2;
    public boolean J3;
    public boolean K;
    public boolean K0;
    public Long K1;
    public int K2;
    public boolean K3;
    public int L;
    public long L0;
    public Long L1;
    public int L2;
    public AnimatorSet L3;
    public boolean M;
    public long M0;
    public rh.i M1;
    public int M2;
    public boolean M3;
    public boolean N;
    public int N0;
    public ArrayList N1;
    public int N2;
    public ru N3;
    public org.telegram.ui.Components.mc O;
    public int O0;
    public boolean O1;
    public int O2;
    public String O3;
    public float P;
    public int P0;
    public org.telegram.ui.ActionBar.c2 P1;
    public int P2;
    public ArrayList P3;
    public boolean Q;
    public boolean Q0;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean R;
    public org.telegram.ui.Components.wc0 R0;
    public boolean R1;
    public int R2;
    public CharSequence R3;
    public boolean S;
    public org.telegram.ui.Cells.p2 S0;
    public long S1;
    public fy S2;
    public boolean S3;
    public ux T;
    public org.telegram.ui.Cells.p2 T0;
    public TLObject T1;
    public long T2;
    public float T3;
    public jf.n0 U;
    public boolean U0;
    public int U1;
    public TLRPC.Chat U2;
    public boolean U3;
    public p31 V;
    public boolean V0;
    public int V1;
    public TLRPC.ChatFull V2;
    public boolean V3;
    public org.telegram.ui.Components.y71 W;
    public final ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.t9 W2;
    public ValueAnimator W3;
    public rf.h0 X;
    public boolean X0;
    public boolean X1;
    public org.telegram.ui.Components.e9 X2;
    public org.telegram.ui.Components.s40 X3;
    public float Y;
    public boolean Y0;
    public boolean Y1;
    public long Y2;
    public TLRPC.FileLocation Y3;
    public ValueAnimator Z;
    public boolean Z0;
    public int Z1;
    public boolean Z2;
    public TLRPC.FileLocation Z3;
    public final int a;
    public ey[] a0;
    public org.telegram.ui.ActionBar.h2 a1;
    public boolean a2;
    public boolean a3;
    public org.telegram.ui.Components.mc a4;
    public final vd.a b;
    public org.telegram.ui.ActionBar.w0 b0;
    public final Paint b1;
    public String b2;
    public AnimatorSet b3;
    public int b4;
    public final vd.a c;
    public org.telegram.ui.ActionBar.w0 c0;
    public ImageView c1;
    public String c2;
    public boolean c3;
    public int c4;
    public final vd.a d;
    public hy d0;
    public NumberTextView d1;
    public String d2;
    public boolean d3;
    public int d4;
    public final vd.a e;
    public boolean e0;
    public final ArrayList e1;
    public boolean e2;
    public float e3;
    public int e4;
    public final vd.a f;
    public org.telegram.ui.ActionBar.w0 f0;
    public org.telegram.ui.ActionBar.w0 f1;
    public boolean f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.w0 g0;
    public org.telegram.ui.ActionBar.w0 g1;
    public boolean g2;
    public int g3;
    public sg.i g4;
    public final vd.a h;
    public org.telegram.ui.ActionBar.w0 h0;
    public org.telegram.ui.ActionBar.w0 h1;
    public boolean h2;
    public boolean h3;
    public final lg.e h4;
    public org.telegram.ui.ActionBar.w0 i0;
    public org.telegram.ui.ActionBar.w0 i1;
    public boolean i2;
    public boolean i3;
    public final qg.d i4;
    public org.telegram.ui.Components.bi0 j0;
    public org.telegram.ui.ActionBar.g1 j1;
    public String j2;
    public org.telegram.ui.Components.mc j3;
    public final qg.d j4;
    public org.telegram.ui.ActionBar.g1 k0;
    public org.telegram.ui.ActionBar.g1 k1;
    public String k2;
    public final AnimationNotificationsLocker k3;
    public final qg.c k4;
    public nh.t3 l0;
    public org.telegram.ui.ActionBar.g1 l1;
    public final MessagesStorage.TopicKey l2;
    public boolean l3;
    public final lg.a l4;
    public nh.t3 m0;
    public org.telegram.ui.ActionBar.g1 m1;
    public boolean m2;
    public boolean m3;
    public final lg.a m4;
    public final vd.a n;
    public boolean n0;
    public org.telegram.ui.ActionBar.g1 n1;
    public boolean n2;
    public boolean n3;
    public final lg.a n4;
    public boolean o0;
    public org.telegram.ui.ActionBar.g1 o1;
    public boolean o2;
    public boolean o3;
    public final lg.a o4;
    public org.telegram.ui.Components.u10 p0;
    public org.telegram.ui.ActionBar.g1 p1;
    public boolean p2;
    public float p3;
    public wv p4;
    public org.telegram.ui.Components.u10 q0;
    public float q1;
    public boolean q2;
    public ValueAnimator q3;
    public final ArrayList q4;
    public final vd.a r;
    public nh.d r0;
    public float r1;
    public boolean r2;
    public float r3;
    public final RectF r4;
    public final vd.a s;
    public ug.f s0;
    public AnimatorSet s1;
    public boolean s2;
    public float s3;
    public final RectF s4;
    public int t0;
    public float t1;
    public boolean t2;
    public float t3;
    public final UndoView[] u0;
    public sg.f u1;
    public boolean u2;
    public int u3;
    public final ah.i v;
    public ew v0;
    public FrameLayout v1;
    public boolean v2;
    public boolean v3;
    public boolean w;
    public boolean w0;
    public FrameLayout w1;
    public boolean w2;
    public boolean w3;
    public int x;
    public int x0;
    public qw x1;
    public boolean x2;
    public Long x3;
    public boolean y;
    public ox y0;
    public org.telegram.ui.Components.hp0 y1;
    public yx y2;
    public Drawable y3;
    public org.telegram.ui.Components.iu0 z0;
    public org.telegram.ui.ActionBar.w0 z1;
    public ArrayList z2;
    public org.telegram.ui.Components.n5 z3;

    public fy(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.b = new vd.a(1, this, jrVar, 350L, false);
        this.c = new vd.a(2, this, jrVar, 350L, false);
        this.d = new vd.a(3, this, jrVar, 350L, false);
        this.e = new vd.a(4, this, jrVar, 350L, false);
        this.f = new vd.a(5, this, jrVar, 350L, false);
        this.h = new vd.a(6, this, jrVar, 350L, false);
        this.n = new vd.a(7, this, jrVar, 350L, false);
        this.r = new vd.a(8, this, jrVar, 350L, false);
        this.s = new vd.a(9, this, jrVar, 350L, false);
        this.v = new ah.i(new vv(this, 1));
        this.x = -1;
        this.B = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.M = true;
        this.Y = 1.0f;
        this.u0 = new UndoView[2];
        this.W0 = new ArrayList();
        this.b1 = new Paint();
        this.e1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.A1 = new TextPaint(1);
        this.Q1 = true;
        this.Y1 = true;
        this.e2 = true;
        this.l2 = new MessagesStorage.TopicKey();
        this.E2 = new ArrayList();
        this.F2 = true;
        this.k3 = new AnimationNotificationsLocker();
        this.u3 = -1;
        this.C3 = new ow(this, 0);
        this.D3 = new ow(this, 1);
        this.I3 = -4;
        this.J3 = true;
        this.K3 = true;
        this.T3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.q4 = arrayList;
        RectF rectF = new RectF();
        this.r4 = rectF;
        RectF rectF2 = new RectF();
        this.s4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        qg.c cVar = new qg.c();
        this.k4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (i10 >= 31) {
            this.h4 = new lg.e(false);
            qg.d dVar = new qg.d(null);
            this.i4 = dVar;
            dVar.i(new kx(this, 0));
            qg.d dVar2 = new qg.d(null);
            this.j4 = dVar2;
            dVar2.i(new kx(this, 3));
            lg.a aVar = new lg.a(dVar);
            this.l4 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            lg.a aVar2 = new lg.a(dVar2);
            this.n4 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            this.m4 = new lg.a(dVar);
        } else {
            this.h4 = null;
            this.i4 = null;
            this.j4 = null;
            this.l4 = new lg.a(cVar);
            this.n4 = new lg.a(cVar);
            this.m4 = new lg.a(cVar);
        }
        this.o4 = new lg.a(cVar);
    }

    public static /* synthetic */ void A0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.yd0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.yd0.h();
            }
        }
    }

    public static /* synthetic */ void B0(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(fyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(fyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new x9(fyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void C0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        fyVar.U4();
        org.telegram.ui.Components.mc J = org.telegram.ui.Components.tc.a0(fyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new ev(fyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void D0(fy fyVar) {
        try {
            ((org.telegram.ui.Components.xi0) ((org.telegram.ui.Components.e9) fyVar.I1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (fyVar.X3 == null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(0, true, true);
            fyVar.X3 = s40Var;
            s40Var.D = true;
            s40Var.a = fyVar;
            s40Var.b = new sx(fyVar);
            fyVar.getMediaDataController().checkFeaturedStickers();
            fyVar.getMessagesController().loadSuggestedFilters();
            fyVar.getMessagesController().loadUserInfo(fyVar.getUserConfig().getCurrentUser(), true, fyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(fyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(fyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(fyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.ni niVar = fyVar.X3.c;
        if (niVar != null) {
            niVar.c1();
        }
        org.telegram.ui.Components.s40 s40Var2 = fyVar.X3;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        s40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new ev(fyVar, 0), new fv(fyVar, 0), 0);
    }

    public static /* synthetic */ void E0(fy fyVar, float f9, ValueAnimator valueAnimator) {
        fyVar.a0[0].setTranslationY((1.0f - fyVar.p3) * f9);
        fyVar.p3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < fyVar.actionBar.getChildCount(); i10++) {
            if (fyVar.actionBar.getChildAt(i10).getVisibility() == 0 && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getActionMode() && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getBackButton()) {
                fyVar.actionBar.getChildAt(i10).setAlpha(1.0f - fyVar.p3);
            }
        }
        fyVar.E3();
        fyVar.w3();
        View view = fyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(fy fyVar) {
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(fyVar.getParentActivity(), fyVar.resourceProvider);
        ubVar.d(R.raw.email_check_inbox, new String[0]);
        ubVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.mc.g(fyVar, ubVar, 2750).j();
        try {
            fyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G0(fy fyVar) {
        org.telegram.ui.Components.mn0 mn0Var;
        wa1 wa1Var;
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            if (i10 == 2) {
                ox oxVar = fyVar.y0;
                if (oxVar == null) {
                    i10++;
                } else {
                    viewGroup = oxVar.R;
                    if (viewGroup == null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = viewGroup.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.f6) {
                                ((org.telegram.ui.Cells.f6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                                ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                                ((org.telegram.ui.Cells.sa) childAt).j(0);
                            }
                        }
                    }
                    i10++;
                }
            } else {
                ey[] eyVarArr = fyVar.a0;
                if (eyVarArr == null) {
                    i10++;
                } else {
                    viewGroup = i10 < eyVarArr.length ? eyVarArr[i10].a : null;
                    if (viewGroup == null) {
                    }
                    i10++;
                }
            }
        }
        ox oxVar2 = fyVar.y0;
        if (oxVar2 != null && (mn0Var = oxVar2.U) != null && (wa1Var = mn0Var.g0) != null) {
            int childCount2 = wa1Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = wa1Var.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.l4) {
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) childAt2;
                    org.telegram.ui.Components.e9 e9Var = l4Var.c;
                    int i13 = l4Var.h;
                    if (DialogObject.isUserDialog(l4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(l4Var.f));
                        l4Var.e = user;
                        e9Var.m(i13, user);
                    } else {
                        e9Var.k(i13, MessagesController.getInstance(i13).getChat(Long.valueOf(-l4Var.f)));
                        l4Var.e = null;
                    }
                    l4Var.c(true);
                }
            }
        }
        if (fyVar.a0 != null) {
            int i14 = 0;
            while (true) {
                ey[] eyVarArr2 = fyVar.a0;
                if (i14 >= eyVarArr2.length) {
                    break;
                }
                mw mwVar = eyVarArr2[i14].n;
                if (mwVar != null) {
                    mwVar.i();
                }
                i14++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = fyVar.actionBar;
        if (lVar != null) {
            lVar.D(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), true);
            fyVar.actionBar.E(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false, true);
            fyVar.actionBar.E(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true, true);
            fyVar.actionBar.F(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5), true);
            fyVar.actionBar.e();
        }
        if (fyVar.z3 != null) {
            fyVar.d5(UserConfig.getInstance(fyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.x2 x2Var = fyVar.I1;
        if (x2Var != null) {
            x2Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        }
        org.telegram.ui.ActionBar.w0 w0Var = fyVar.i0;
        if (w0Var != null) {
            w0Var.setIconColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.v8));
        }
        qw qwVar = fyVar.x1;
        if (qwVar != null) {
            qwVar.e();
        }
        ew ewVar = fyVar.v0;
        if (ewVar != null) {
            ng.d dVar = ewVar.u0;
            if (dVar != null) {
                dVar.u();
            }
            ewVar.invalidate();
        }
        rf.h0 h0Var = fyVar.X;
        if (h0Var != null) {
            h0Var.B1();
        }
        ox oxVar3 = fyVar.y0;
        if (oxVar3 != null) {
            SparseArray sparseArray = oxVar3.h;
            for (int i15 = 0; i15 < oxVar3.getChildCount(); i15++) {
                if (oxVar3.getChildAt(i15) instanceof h10) {
                    jh.e1 e1Var = ((h10) oxVar3.getChildAt(i15)).b;
                    int childCount3 = e1Var.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt3 = e1Var.getChildAt(i16);
                        if (childAt3 instanceof org.telegram.ui.Cells.p2) {
                            ((org.telegram.ui.Cells.p2) childAt3).b0(0, true);
                        }
                    }
                }
            }
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                View view = (View) sparseArray.valueAt(i17);
                if (view instanceof h10) {
                    jh.e1 e1Var2 = ((h10) view).b;
                    int childCount4 = e1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = e1Var2.getChildAt(i18);
                        if (childAt4 instanceof org.telegram.ui.Cells.p2) {
                            ((org.telegram.ui.Cells.p2) childAt4).b0(0, true);
                        }
                    }
                }
            }
            h10 h10Var = oxVar3.I0;
            if (h10Var != null) {
                jh.e1 e1Var3 = h10Var.b;
                int childCount5 = e1Var3.getChildCount();
                for (int i19 = 0; i19 < childCount5; i19++) {
                    View childAt5 = e1Var3.getChildAt(i19);
                    if (childAt5 instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt5).b0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.ug0 ug0Var = oxVar3.l0;
            if (ug0Var != null) {
                ug0Var.c();
            }
        }
        org.telegram.ui.Components.y71 y71Var = fyVar.W;
        if (y71Var != null) {
            jh.e1 e1Var4 = y71Var.v;
            ng.d dVar2 = y71Var.n0;
            if (dVar2 != null) {
                dVar2.u();
            }
            y71Var.K.setColor(org.telegram.ui.ActionBar.g6.v0(y71Var.L, y71Var.f0));
            e1Var4.f1();
            e1Var4.invalidate();
            y71Var.invalidate();
        }
        p31 p31Var = fyVar.V;
        if (p31Var != null) {
            p31Var.e();
        }
        cg.h0 h0Var2 = fyVar.G0;
        if (h0Var2 != null && Build.VERSION.SDK_INT >= 23) {
            h0Var2.setForeground(new ColorDrawable(i0.a.k(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), 100)));
        }
        org.telegram.ui.Components.u10 u10Var = fyVar.p0;
        if (u10Var != null) {
            u10Var.g();
        }
        org.telegram.ui.Components.u10 u10Var2 = fyVar.q0;
        if (u10Var2 != null) {
            u10Var2.g();
        }
        qg.c cVar = fyVar.k4;
        int i20 = org.telegram.ui.ActionBar.g6.d6;
        cVar.a(fyVar.getThemedColor(i20));
        org.telegram.ui.Components.fs fsVar = fyVar.F1;
        if (fsVar != null) {
            ng.d dVar3 = fsVar.s;
            if (dVar3 != null) {
                dVar3.u();
            }
            fsVar.invalidate();
        }
        org.telegram.ui.Components.es esVar = fyVar.G1;
        if (esVar != null) {
            esVar.setColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
        }
        pw pwVar = fyVar.D1;
        if (pwVar != null) {
            pwVar.p();
        }
        pw pwVar2 = fyVar.B1;
        if (pwVar2 != null) {
            pwVar2.p();
        }
        fyVar.D4(fyVar.t1);
        xw xwVar = fyVar.A0;
        if (xwVar != null) {
            xwVar.o();
        }
        Drawable drawable = fyVar.y3;
        if (drawable != null) {
            drawable.setColorFilter(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = fyVar.c1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            fyVar.c1.setBackground(org.telegram.ui.ActionBar.g6.f0(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
        }
        ux uxVar = fyVar.T;
        if (uxVar != null) {
            uxVar.e();
        }
    }

    public static void H0(fy fyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            eg.w2.e0(0, birthdayState);
            return;
        }
        ih.h2 h2Var = new ih.h2(fyVar.getParentActivity(), fyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        h2Var.V(true);
        fyVar.showDialog(h2Var);
    }

    public static void I0(fy fyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(fyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.j = 5000;
            M.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            fyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            j7.l1.v(R.string.UnknownError, org.telegram.ui.Components.tc.a0(fyVar), R.raw.error, 36);
            return;
        }
        if (fyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity(), 0, fyVar.resourceProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            fyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void J0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        fyVar.U4();
    }

    public static void N2(fy fyVar, float f9) {
        float f10;
        float f11;
        float clamp = Utilities.clamp(fyVar.t1 * 2.0f, 1.0f, 0.0f);
        xw xwVar = fyVar.A0;
        float f12 = (1.0f - fyVar.p3) * f9 * fyVar.D0;
        float f13 = 1.0f - clamp;
        xwVar.setAlpha(f12 * f13);
        if (fyVar.G || fyVar.I) {
            float clamp2 = Utilities.clamp((-fyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (fyVar.p3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            fyVar.A0.setClipTop(0);
            if (fyVar.G || !fyVar.I) {
                fyVar.A0.setTranslationY(((fyVar.P / 2.0f) + (Math.max(fyVar.J, -fyVar.U3()) + fyVar.r3)) - AndroidUtilities.dp(8.0f));
                fyVar.A0.l(clamp2, !fyVar.B3.c());
                if (fyVar.I) {
                    f10 = 1.0f - clamp3;
                    fyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = fyVar.D0;
                }
            } else {
                fyVar.A0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                fyVar.A0.setProgressToCollapse(1.0f);
                f11 = fyVar.D0;
            }
            f10 = 1.0f - f11;
            fyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (fyVar.H) {
                fyVar.A0.setTranslationY((Math.max(fyVar.J, -fyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                fyVar.A0.setProgressToCollapse(1.0f);
                xw xwVar2 = fyVar.A0;
                xwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - xwVar2.getY()));
            }
            f10 = 1.0f - fyVar.D0;
            fyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            fyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            fyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - fyVar.p3;
            fyVar.actionBar.getTitlesContainer().setAlpha(f15);
            fyVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        fyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        fyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        fyVar.actionBar.getTitlesContainer().setScaleY(f16);
        fyVar.actionBar.getTitlesContainer().setScaleX(f16);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - fyVar.p3) * f14;
        fyVar.actionBar.getTitlesContainer().setAlpha(f17);
        fyVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void O2(fy fyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (fyVar.parentLayout == null || fyVar.actionBar == null) {
            return;
        }
        float max = Math.max(fyVar.e.e, fyVar.V3());
        float f9 = 1.0f;
        float f10 = 1.0f - fyVar.t1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            i10 = -1;
            f9 = 0.0f;
        }
        if (f9 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (b5Var = fyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) b5Var).p(canvas, (int) (f9 * 255.0f * f11), i10);
    }

    public static org.telegram.ui.Cells.p2 Q3(ey eyVar) {
        ay ayVar = eyVar.a;
        for (int i10 = 0; i10 < ayVar.getChildCount(); i10++) {
            View childAt = ayVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var.P()) {
                    return p2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void U(fy fyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        fyVar.U4();
    }

    public static /* synthetic */ void V(fy fyVar, float f9, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fyVar.p3 = floatValue;
        fyVar.a0[0].setTranslationY((-f9) * floatValue);
        for (int i10 = 0; i10 < fyVar.actionBar.getChildCount(); i10++) {
            if (fyVar.actionBar.getChildAt(i10).getVisibility() == 0 && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getActionMode() && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getBackButton()) {
                fyVar.actionBar.getChildAt(i10).setAlpha(1.0f - fyVar.p3);
            }
        }
        View view = fyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        fyVar.E3();
        fyVar.w3();
    }

    public static void X(fy fyVar) {
        ArrayList arrayList = fyVar.E2;
        org.telegram.ui.ActionBar.b5 b5Var = fyVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            fyVar.finishPreviewFragment();
            return;
        }
        if (fyVar.N0 != 10) {
            if (MessagesController.getInstance(fyVar.currentAccount).isFrozen()) {
                c.b(fyVar.currentAccount);
                return;
            } else {
                fyVar.presentFragment(new ContactsActivity(a4.w.i("destroyAfterSelect", true)));
                return;
            }
        }
        if (fyVar.y2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        fyVar.y2.v(fyVar, arrayList2, null, false, fyVar.F2, fyVar.G2, fyVar.H2, null);
    }

    public static /* synthetic */ void Y(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        fyVar.U4();
    }

    public static void Z(fy fyVar) {
        PasskeysActivity.a0(fyVar.currentAccount, fyVar.getParentActivity(), fyVar.resourceProvider, true);
    }

    public static void a0(fy fyVar, int i10, org.telegram.ui.Components.j70 j70Var) {
        if (fyVar.currentAccount == i10) {
            return;
        }
        j70Var.u();
        if (fyVar.getParentActivity() == null) {
            return;
        }
        yx yxVar = fyVar.y2;
        LaunchActivity launchActivity = (LaunchActivity) fyVar.getParentActivity();
        ArrayList arrayList = fyVar.z2;
        String str = fyVar.A2;
        CharSequence charSequence = fyVar.B2;
        qw qwVar = fyVar.x1;
        CharSequence fieldText = qwVar != null ? qwVar.getFieldText() : null;
        launchActivity.K0(i10);
        fy fyVar2 = new fy(fyVar.arguments);
        fyVar2.y2 = yxVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                fyVar2.E4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    fyVar2.B2 = null;
                } else {
                    fyVar2.B2 = charSequence;
                    fyVar2.A2 = null;
                    fyVar2.z2 = null;
                    if (fyVar2.x1 != null) {
                        fyVar2.l3(fieldText);
                    } else {
                        fyVar2.R3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            fyVar2.z2 = null;
        } else {
            fyVar2.z2 = arrayList;
            fyVar2.A2 = null;
            if (fyVar2.x1 != null) {
                fyVar2.l3(fieldText);
            } else {
                fyVar2.R3 = fieldText;
            }
        }
        launchActivity.q0(fyVar2, false, true);
    }

    public static /* synthetic */ void b0(fy fyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(fyVar.currentAccount).getClientUserId());
        fyVar.presentFragment(new tn(bundle));
    }

    public static /* synthetic */ void c0(fy fyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = fyVar.getMessagesController().getUserFull(fyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        fyVar.getMessagesController().invalidateContentSettings();
        fyVar.getConnectionsManager().sendRequest(updatebirthday, new x9(fyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        fyVar.U4();
    }

    public static /* synthetic */ void d0(fy fyVar, String str) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, str);
        fyVar.U4();
    }

    public static void d4(tn tnVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.a10[] a10VarArr = (org.telegram.ui.Components.a10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.a10.class);
                if (a10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(a10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(a10VarArr[0]);
                    for (int i10 = 1; i10 < a10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(a10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(a10VarArr[i10]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                for (int i11 = spanEnd; i11 <= spanStart2; i11++) {
                                    if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                        break;
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    tnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void e0(fy fyVar, ey eyVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.s3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.p2;
        if (z10) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.j2) {
                fyVar.N4(p2Var.getDialogId(), view);
                return;
            }
        }
        if (fyVar.I3()) {
            fyVar.o4(view, i10, 0.0f, eyVar.d);
            return;
        }
        int i12 = fyVar.N0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            eyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a4.w.i("forImport", true);
            i14.putLongArray("result", new long[]{fyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = fyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            t60 t60Var = new t60(i14);
            t60Var.U = new kw(fyVar);
            fyVar.presentFragment(t60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.x2) && ((i11 = eyVar.s) == 7 || i11 == 8)) {
            rf.j jVar = (rf.j) eyVar.d.I.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (jVar == null || jVar.a != 17) ? null : jVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = fyVar.getMessagesController().selectedDialogFilter[eyVar.s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.id;
                    org.telegram.ui.Components.y00 y00Var = new org.telegram.ui.Components.y00(fyVar, false);
                    y00Var.U = -1;
                    y00Var.Y = "";
                    y00Var.Z = new ArrayList();
                    y00Var.b0 = "";
                    y00Var.d0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    y00Var.e0 = arrayList;
                    y00Var.v0 = -1;
                    y00Var.y0 = -5;
                    y00Var.U = i15;
                    y00Var.W = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    y00Var.c0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = fyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i15) {
                                y00Var.Y = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    y00Var.S();
                    fyVar.showDialog(y00Var);
                    return;
                }
                return;
            }
        } else if (z10 && !fyVar.actionBar.s() && !fyVar.B3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.p2) view).U1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        fyVar.n4(view, i10, eyVar.d);
    }

    public static /* synthetic */ void f0(fy fyVar) {
        fyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(fyVar.parentLayout, "newChatsRow");
    }

    public static void f1(fy fyVar, boolean z10) {
        if (fyVar.a0 == null || fyVar.J3 == z10) {
            return;
        }
        fyVar.J3 = z10;
        int i10 = 0;
        while (true) {
            ey[] eyVarArr = fyVar.a0;
            if (i10 >= eyVarArr.length) {
                return;
            }
            if (z10) {
                eyVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            fyVar.a0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                fyVar.a0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static void h0(fy fyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (fyVar.getParentActivity() == null) {
            return;
        }
        fyVar.p2 = false;
        if (z10 || z11 || z12) {
            fyVar.w0 = true;
            if (z10 && nj0.n(activity)) {
                org.telegram.ui.Components.yd0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.ym(1, new tm(20, fyVar, activity)));
                return;
            }
            if (z11 && fyVar.Q1 && fyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.w(activity, new nv(fyVar, 0)).a;
                fyVar.P1 = c2Var;
                fyVar.showDialog(c2Var);
            } else if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                fyVar.k3(true);
            } else if (activity instanceof h5) {
                org.telegram.ui.ActionBar.c2 w10 = ((h5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                fyVar.P1 = w10;
                fyVar.showDialog(w10);
            }
        }
    }

    public static /* synthetic */ void i0(fy fyVar) {
        if (fyVar.X3.h()) {
            MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            fyVar.U4();
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = u4;
        if (zArr[currentAccount]) {
            return;
        }
        MessagesController messagesController = accountInstance.getMessagesController();
        messagesController.loadGlobalNotificationsSettings();
        messagesController.loadDialogs(0, 0, 100, true);
        messagesController.loadHintDialogs();
        messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
        accountInstance.getContactsController().checkInviteText();
        accountInstance.getMediaDataController().checkAllMedia(false);
        AndroidUtilities.runOnUIThread(new ui(accountInstance, 18), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void k0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        fyVar.U4();
    }

    public static /* synthetic */ void l0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        fyVar.U4();
    }

    public static void m0(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        eg.z1 z1Var;
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.c5.f0(fyVar.currentAccount, tL_error, fyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        fyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        eg.z1 z1Var2 = new eg.z1(fyVar, j10, 23);
        Pattern pattern = org.telegram.ui.Components.c5.a;
        if (fyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = fyVar.getCurrentAccount();
            Activity parentActivity = fyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(parentActivity);
            t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(t9Var, i7.f6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, i7.f6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                z1Var = z1Var2;
                e9Var.k(currentAccount, chat);
                t9Var.e(chat, e9Var);
            } else if (UserObject.isReplyUser(user)) {
                e9Var.p = 0.8f;
                e9Var.g(12);
                t9Var.h(null, null, e9Var, user);
                z1Var = z1Var2;
            } else {
                z1Var = z1Var2;
                if (user.id == clientUserId) {
                    e9Var.p = 0.8f;
                    e9Var.g(1);
                    t9Var.h(null, null, e9Var, user);
                } else {
                    e9Var.p = 1.0f;
                    e9Var.m(currentAccount, user);
                    t9Var.e(user, e9Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.u(z1Var, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            fyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void n0(fy fyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.hn0 hn0Var = fyVar.y0.k0;
        if (i10 < hn0Var.T || i10 >= hn0Var.U) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.w41 G = hn0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity(), 0, fyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new xr(5, fyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void o0(fy fyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            fyVar.r4(arrayList, i10, false, false, null);
            return;
        }
        fyVar.getMessagesController().setDialogsInTransaction(true);
        fyVar.r4(arrayList, i10, false, false, z10 ? hashSet : null);
        fyVar.getMessagesController().setDialogsInTransaction(false);
        fyVar.getMessagesController().checkIfFolderEmpty(fyVar.R2);
        int i11 = fyVar.R2;
        if (i11 == 0 || fyVar.R3(fyVar.currentAccount, fyVar.a0[0].s, i11, false).size() != 0) {
            return;
        }
        fyVar.a0[0].a.setEmptyView(null);
        fyVar.a0[0].w.setVisibility(4);
        fyVar.finishFragment();
    }

    public static /* synthetic */ void q0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, fyVar.w3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        fyVar.U4();
    }

    public static void q1(fy fyVar, ey eyVar, float f9) {
        if (fyVar.P == f9) {
            return;
        }
        fyVar.P = f9;
        if (f9 == 0.0f) {
            fyVar.Q = false;
        }
        fyVar.A0.setOverscroll(f9);
        eyVar.a.setViewsOffset(f9);
        eyVar.a.setOverScrollMode(f9 != 0.0f ? 2 : 0);
        fyVar.fragmentView.invalidate();
        if (f9 <= AndroidUtilities.dp(90.0f) || fyVar.Q) {
            return;
        }
        xw xwVar = fyVar.A0;
        ValueAnimator valueAnimator = xwVar.D0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            xwVar.i(xwVar.l0, true);
            fyVar.Q = true;
            fyVar.getOrCreateStoryViewer().s(new ev(fyVar, 18));
        }
    }

    public static /* synthetic */ void r0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.yd0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.yd0.h();
            }
        }
    }

    public static boolean r1(fy fyVar, ey eyVar) {
        if (fyVar.B3.c()) {
            return false;
        }
        int i10 = (int) (-fyVar.J);
        int T3 = fyVar.T3();
        int U3 = fyVar.U3();
        if (i10 == 0 || i10 == T3 || i10 == U3 || !eyVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (U3 >= i10 || i10 >= T3) {
            if ((fyVar.p3 != 1.0f ? Utilities.clamp((-fyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < fyVar.A0.x0) {
                eyVar.b.m(-i10);
                return true;
            }
            eyVar.b.m(U3 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - U3;
        if (i11 < dp / 2) {
            eyVar.b.m(-i11);
            return true;
        }
        eyVar.b.m(dp - i11);
        return true;
    }

    public static void s0(fy fyVar) {
        c.c(fyVar.getParentActivity(), fyVar.currentAccount, fyVar.getResourceProvider());
    }

    public static String s2(fy fyVar) {
        ArrayList arrayList = fyVar.E2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == fyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(fyVar.currentAccount, longValue) : DialogObject.getShortName(fyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final fy fyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        fyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                fyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = fyVar.R2) != 0 && fyVar.R3(fyVar.currentAccount, fyVar.a0[0].s, i13, false).size() == 1) {
            fyVar.a0[0].w.setVisibility(4);
        }
        fyVar.u3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            fyVar.A4(true, true);
            if (fyVar.N1 != null) {
                i12 = 0;
                while (i12 < fyVar.N1.size()) {
                    if (((TLRPC.Dialog) fyVar.N1.get(i12)).id == j10) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            fyVar.o3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView Y3 = fyVar.Y3();
        if (Y3 != null) {
            Y3.j(i10 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.qv
                @Override // java.lang.Runnable
                public final void run() {
                    fyVar.q4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(fyVar.R3(fyVar.currentAccount, fyVar.a0[0].s, fyVar.R2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i15)).id == j10) {
                i14 = i15;
                break;
            }
            i15++;
        }
        if (i10 == 102) {
            if (i11 < 0 || i14 >= 0 || (arrayList = fyVar.N1) == null) {
                fyVar.A4(false, true);
                return;
            }
            arrayList.remove(i11);
            fyVar.a0[0].x.D();
            fyVar.a0[0].q(true);
        }
    }

    public static void u0(fy fyVar) {
        BirthdayController.getInstance(fyVar.currentAccount).hide();
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        fyVar.U4();
        org.telegram.ui.Components.mc G = org.telegram.ui.Components.tc.a0(fyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static void v0(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            gi1.a(fyVar.getParentActivity(), new eh(fyVar, tL_attachMenuBot, launchActivity), null);
        } else {
            LaunchActivity.C0(launchActivity, fyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static /* synthetic */ void w0(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, fyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(fyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void x0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        fyVar.U4();
    }

    public static void y0(fy fyVar) {
        if (fyVar.K3) {
            nh.t3 t3Var = fyVar.l0;
            if (t3Var != null) {
                t3Var.e(true);
            }
            lh.m6 o10 = MessagesController.getInstance(fyVar.currentAccount).getStoriesController().o();
            if (o10 != null && o10.a(fyVar.currentAccount, 1)) {
                fyVar.showDialog(new cg.v0(o10.b(), fyVar.currentAccount, fyVar.getParentActivity(), fyVar, null));
                return;
            } else {
                nh.gb E = nh.gb.E(fyVar.getParentActivity(), fyVar.currentAccount);
                E.x = new kx(fyVar, 4);
                E.R(null);
                return;
            }
        }
        nh.t3 t3Var2 = fyVar.m0;
        if (t3Var2 != null) {
            if (t3Var2.R) {
                return;
            } else {
                AndroidUtilities.removeFromParent(t3Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new vv(fyVar, 7));
        nh.t3 t3Var3 = new nh.t3(fyVar.getParentActivity(), 2);
        t3Var3.r(8.0f);
        t3Var3.d = 8000L;
        t3Var3.i();
        t3Var3.q(true);
        t3Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        t3Var3.t(replaceSingleTag);
        t3Var3.m(1.0f, -40.0f);
        t3Var3.h(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        fyVar.m0 = t3Var3;
        t3Var3.setTranslationY((-fyVar.c4) - fyVar.e4);
        ((ViewGroup) fyVar.fragmentView).addView(fyVar.m0, i7.f6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        fyVar.m0.v();
    }

    public static void z0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        fyVar.U4();
        org.telegram.ui.Components.mc G = org.telegram.ui.Components.tc.a0(fyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public final void A3() {
        org.telegram.ui.Components.u10.d(this.h0, com.google.android.recaptcha.internal.a.C(this.b.e, 1.0f - V3(), 1.0f - this.c.e, this.d.e));
    }

    public final void A4(boolean z10, boolean z11) {
        if (this.a0 == null || this.O1 == z10) {
            return;
        }
        if (z10) {
            this.N1 = new ArrayList(R3(this.currentAccount, this.a0[0].s, this.R2, false));
        } else {
            this.N1 = null;
        }
        this.O1 = z10;
        ey eyVar = this.a0[0];
        eyVar.d.C = z10;
        if (z10 || !z11) {
            return;
        }
        if (eyVar.a.b0()) {
            this.a0[0].a.post(new vv(this, 8));
        } else {
            this.a0[0].d.l();
        }
    }

    @Override // xf.b
    public final List B() {
        return Arrays.asList(new xf.a(LocaleController.getString(R.string.DebugDialogsActivity)), new xf.a(LocaleController.getString(R.string.ClearLocalDatabase), new ev(this, 27)), new xf.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new ev(this, 28)));
    }

    public final void B3() {
        cg.h0 h0Var;
        boolean z10 = !this.f2 && ((h0Var = this.G0) == null || h0Var.getBackground() == null || this.G0.getAlpha() < 0.01f || this.G0.getVisibility() == 8);
        kg0 kg0Var = this.E3;
        if (kg0Var != null) {
            kg0Var.a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        ey eyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            ey[] eyVarArr = this.a0;
            if (eyVarArr != null && (eyVar = eyVarArr[0]) != null) {
                eyVar.setLayerType(2, null);
                this.a0[0].setClipChildren(false);
                this.a0[0].setClipToPadding(false);
                this.a0[0].a.setClipChildren(false);
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view != null) {
                ((ViewGroup) view).setClipChildren(false);
                this.fragmentView.requestLayout();
                return;
            }
            return;
        }
        if (this.a0 != null) {
            int i10 = 0;
            while (true) {
                ey[] eyVarArr2 = this.a0;
                if (i10 >= eyVarArr2.length) {
                    break;
                }
                ey eyVar2 = eyVarArr2[i10];
                if (eyVar2 != null) {
                    eyVar2.setLayerType(0, null);
                    eyVar2.setClipChildren(true);
                    eyVar2.setClipToPadding(true);
                    eyVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            lVar2.setLayerType(0, null);
        }
        xw xwVar = this.A0;
        if (xwVar != null) {
            xwVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.u10.d(this.g0, (1.0f - this.b.e) * (1.0f - V3()) * (1.0f - this.c.e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f9) {
        ey[] eyVarArr = this.a0;
        if (eyVarArr != null) {
            int paddingTop = eyVarArr[0].a.getPaddingTop() + ((int) f9);
            int i10 = 0;
            while (true) {
                ey[] eyVarArr2 = this.a0;
                if (i10 >= eyVarArr2.length) {
                    break;
                }
                eyVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f9 == this.J) {
            return;
        }
        this.J = f9;
        org.telegram.ui.Components.mc mcVar = this.j3;
        if (mcVar != null) {
            mcVar.l();
        }
        if (this.A3 != null) {
            float currentActionBarHeight = 1.0f - ((-f9) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.A3;
            float f10 = (int) f9;
            float f11 = oVar.f;
            oVar.h = f10;
            oVar.setTranslationY(f11 + f10);
            this.A3.setAlpha(i7.w.a(currentActionBarHeight, 0.0f, 1.0f));
            this.A3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        E3();
        this.fragmentView.invalidate();
    }

    public final void D3() {
        String string = LocaleController.getString(V3() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.T.r.setContentDescription(string);
        this.T.r.setHint(string);
    }

    public final void D4(float f9) {
        this.t1 = f9;
        if (this.n3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.R2 == 0 && this.T2 == 0) ? org.telegram.ui.ActionBar.g6.v8 : org.telegram.ui.ActionBar.g6.O8);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.g6.y8;
            lVar.C(i0.a.d(this.t1, themedColor, getThemedColor(i10)), false);
            this.actionBar.C(i0.a.d(this.t1, getThemedColor(i10), getThemedColor(i10)), true);
            this.actionBar.B(i0.a.d(this.t1, getThemedColor((this.R2 == 0 && this.T2 == 0) ? org.telegram.ui.ActionBar.g6.t8 : org.telegram.ui.ActionBar.g6.N8), getThemedColor(org.telegram.ui.ActionBar.g6.z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        S4();
    }

    public final void E3() {
        if (this.T == null) {
            return;
        }
        float a2 = 1.0f - i7.w.a(((-this.J) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = (this.N0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.p3, this.h.e)) * Math.max(this.b.e, (1.0f - V3()) * a2);
        this.T.setAlpha(max);
        this.T.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.A2 = null;
            this.B2 = null;
            return;
        }
        this.A2 = str;
        this.B2 = null;
        this.z2 = null;
        if (this.x1 != null) {
            l3(charSequence);
        } else {
            this.R3 = charSequence;
        }
    }

    public final void F3() {
        if (this.V != null) {
            float f9 = (this.W != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f9);
            this.V.setScaleX(lerp);
            this.V.setScaleY(lerp);
            this.V.setAlpha(f9);
            this.V.setVisibility(f9 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.y71 y71Var = this.W;
        vd.a aVar = this.s;
        if (y71Var != null) {
            float f10 = 1.0f - aVar.e;
            y71Var.setAlpha(f10);
            this.W.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        rf.h0 h0Var = this.X;
        if (h0Var != null) {
            float f11 = aVar.e;
            h0Var.setAlpha(f11);
            this.X.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void F4(float f9) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.T3 != f9) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.U3 = z10;
            this.T3 = f9;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.U3) {
                float f10 = (1.0f - this.T3) * (-AndroidUtilities.dp(40.0f));
                xw xwVar = this.A0;
                if (xwVar != null) {
                    xwVar.setTranslationX(f10);
                }
                ux uxVar = this.T;
                if (uxVar != null) {
                    uxVar.setTranslationX(f10);
                }
                ax axVar = this.B3;
                if (axVar == null || axVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.B3.getFragmentView().setTranslationX(f10);
                return;
            }
            float f11 = -AndroidUtilities.dp(4.0f);
            float f12 = 1.0f - this.T3;
            float f13 = f11 * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            xw xwVar2 = this.A0;
            if (xwVar2 != null) {
                xwVar2.setScaleX(f14);
                this.A0.setScaleY(f14);
                this.A0.setTranslationX(f13);
                this.A0.setPivotX(0.0f);
                this.A0.setPivotY(0.0f);
            }
            ux uxVar2 = this.T;
            if (uxVar2 != null) {
                uxVar2.setTranslationX(f13);
                this.T.setScaleX(f14);
                this.T.setScaleY(f14);
            }
            ax axVar2 = this.B3;
            if (axVar2 == null || axVar2.getFragmentView() == null) {
                return;
            }
            if (!this.y) {
                this.B3.getFragmentView().setScaleX(f14);
                this.B3.getFragmentView().setScaleY(f14);
                this.B3.getFragmentView().setTranslationX(f13);
            }
            this.B3.getFragmentView().setPivotX(0.0f);
            this.B3.getFragmentView().setPivotY(0.0f);
        }
    }

    public final void G3(boolean z10) {
        if (this.y0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.W != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.fs fsVar = this.F1;
        int c3 = measuredHeight + (fsVar != null ? (int) fsVar.c(AndroidUtilities.dp(7.0f)) : 0);
        ox oxVar = this.y0;
        SparseArray sparseArray = oxVar.h;
        oxVar.Q0 = c3;
        oxVar.R0 = i10;
        jh.e1 e1Var = oxVar.R;
        if (z10) {
            e1Var.o1(0, c3, 0, i10);
        } else {
            e1Var.setPadding(0, c3, 0, i10);
        }
        oxVar.I0.j(oxVar.Q0, oxVar.R0, z10);
        org.telegram.ui.Components.gn0 gn0Var = oxVar.S;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gn0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = oxVar.Q0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != oxVar.R0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = oxVar.R0;
            gn0Var.requestLayout();
        }
        org.telegram.ui.Components.tn0.P(oxVar.b0, oxVar.e0, oxVar.Q0, oxVar.R0, z10);
        org.telegram.ui.Components.tn0.P(oxVar.g0, oxVar.j0, oxVar.Q0, oxVar.R0, z10);
        org.telegram.ui.Components.tn0.P(oxVar.n0, oxVar.q0, oxVar.Q0, oxVar.R0, z10);
        org.telegram.ui.Components.ug0 ug0Var = oxVar.l0;
        int i13 = oxVar.Q0;
        int i14 = oxVar.R0;
        ug0Var.setClipToPadding(false);
        org.telegram.ui.Components.u51 u51Var = ug0Var.c;
        ug0Var.F = z10;
        ug0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            u51Var.o1(0, i13, 0, i14);
        } else {
            u51Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) u51Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        ug0Var.F = false;
        org.telegram.ui.Components.tm0 tm0Var = oxVar.C0;
        if (tm0Var != null) {
            tm0Var.b(oxVar.Q0, oxVar.R0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof h10) {
                ((h10) view).j(oxVar.Q0, oxVar.R0, z10);
            }
        }
        for (int i16 = 0; i16 < oxVar.getChildCount(); i16++) {
            if (oxVar.getChildAt(i16) instanceof h10) {
                ((h10) oxVar.getChildAt(i16)).j(oxVar.Q0, oxVar.R0, z10);
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.o(8, this, r0), new ui(r0, 17));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(u6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
    }

    public final void H3() {
        if (this.F1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.F1.setAlpha(1.0f);
            this.F1.setScaleX(lerp);
            this.F1.setScaleY(lerp);
            this.F1.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        if ((r3.size() + r2.alwaysShow.size()) > 100) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H4(org.telegram.ui.Cells.p2 p2Var) {
        long j10;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j11;
        int i10;
        LinearLayout linearLayout;
        fy fyVar;
        char c3;
        boolean[] zArr;
        MessagesController.DialogFilter dialogFilter;
        boolean[] zArr2;
        long j12;
        ?? r42;
        long j13;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        int i15;
        int i16;
        final long j14;
        int i17;
        org.telegram.ui.ActionBar.g1 g1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        final fy fyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(p2Var.c2);
        boolean z11 = false;
        if (p2Var.O()) {
            if (p2Var.getCurrentDialogFolderId() != 1) {
                return false;
            }
            m4(p2Var);
            return false;
        }
        long dialogId = p2Var.getDialogId();
        Bundle bundle = new Bundle();
        int messageId = p2Var.getMessageId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            return false;
        }
        if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            if (fyVar2.T2 != 0 && ((b10 = qh.p0.b(fyVar2.currentAccount, dialogId)) == 4 || b10 == 3)) {
                return false;
            }
            TLRPC.Chat chat = fyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (messageId == 0 || chat == null || chat.migrated_to == null) {
                j10 = dialogId;
            } else {
                bundle.putLong("migrated_to", dialogId);
                j10 = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -j10);
        }
        if (messageId != 0) {
            bundle.putInt("message_id", messageId);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(dialogId));
        boolean z12 = fyVar2.T2 == 0 && fyVar2.getMessagesController().filtersEnabled && fyVar2.getMessagesController().dialogFiltersLoaded && fyVar2.getMessagesController().dialogFilters != null && fyVar2.getMessagesController().dialogFilters.size() > 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
        if (z12) {
            LinearLayout linearLayout2 = new LinearLayout(fyVar2.getParentActivity());
            linearLayout2.setOrientation(1);
            ih.k3 k3Var = new ih.k3(fyVar2.getParentActivity(), 1);
            LinearLayout linearLayout3 = new LinearLayout(fyVar2.getParentActivity());
            linearLayout3.setOrientation(1);
            k3Var.addView(linearLayout3);
            int size = fyVar2.getMessagesController().dialogFilters.size();
            int i18 = 0;
            org.telegram.ui.ActionBar.g1 g1Var2 = null;
            while (i18 < size) {
                final MessagesController.DialogFilter dialogFilter2 = fyVar2.getMessagesController().dialogFilters.get(i18);
                if (dialogFilter2.isDefault()) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j14 = dialogId;
                } else {
                    final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(fyVar2.currentAccount), dialogId);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j14 = dialogId;
                    final ArrayList H = org.telegram.ui.Components.j00.H(fyVar2, dialogFilter2, arrayList, true, z11);
                    if (!includesDialog) {
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, fyVar2.getParentActivity(), null, false, false);
                    g1Var3.setChecked(includesDialog);
                    i17 = i16;
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, g1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, g1Var3.getTextView().getPaint().getFontMetricsInt());
                    g1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                    g1Var3.g(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.z00(fyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                    g1Var3.getTextView().setEmojiColor(fyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                    g1Var3.setMinimumWidth(160);
                    g1Var = g1Var3;
                    j14 = j14;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                    g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yv
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArrayList arrayList2;
                            long j15;
                            MessagesController.DialogFilter dialogFilter3;
                            fy fyVar3 = fy.this;
                            fyVar3.getClass();
                            boolean z13 = includesDialog;
                            ArrayList arrayList3 = H;
                            MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                            long j16 = j14;
                            if (z13) {
                                dialogFilter4.alwaysShow.remove(Long.valueOf(j16));
                                dialogFilter4.neverShow.add(Long.valueOf(j16));
                                p00.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, fyVar3, null);
                                fyVar3.Y3().k(j16, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
                            } else {
                                if (arrayList3.isEmpty()) {
                                    arrayList2 = arrayList3;
                                    j15 = j16;
                                    dialogFilter3 = dialogFilter4;
                                } else {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        dialogFilter4.neverShow.remove(arrayList3.get(i19));
                                    }
                                    dialogFilter4.alwaysShow.addAll(arrayList3);
                                    arrayList2 = arrayList3;
                                    dialogFilter3 = dialogFilter4;
                                    j15 = j16;
                                    p00.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, fyVar3, null);
                                }
                                fyVar3.Y3().k(j15, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                            }
                            fyVar3.b4(true);
                            fyVar3.finishPreviewFragment();
                        }
                    });
                    linearLayout3.addView(g1Var);
                    fyVar2 = this;
                    dialogId = j14;
                    size = i17;
                    i18 = i15 + 1;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                    g1Var2 = g1Var;
                    z11 = false;
                }
                g1Var = g1Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                i17 = i16;
                fyVar2 = this;
                dialogId = j14;
                size = i17;
                i18 = i15 + 1;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                g1Var2 = g1Var;
                z11 = false;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j11 = dialogId;
            org.telegram.ui.ActionBar.g1 g1Var4 = g1Var2;
            i10 = 160;
            if (g1Var4 != null) {
                g1Var4.j(false, true);
            }
            if (linearLayout3.getChildCount() <= 0) {
                z12 = false;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            } else {
                View l1Var = new org.telegram.ui.ActionBar.l1(getParentActivity(), org.telegram.ui.ActionBar.g6.H8, getResourceProvider());
                l1Var.setTag(R.id.fit_width_tag, 1);
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
                g1Var5.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var5.setMinimumWidth(160);
                g1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                linearLayout2.addView(g1Var5);
                linearLayout2.addView(l1Var, i7.f6.n(-1, 8));
                linearLayout2.addView(k3Var);
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            }
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j11 = dialogId;
            i10 = 160;
            linearLayout = null;
        }
        org.telegram.ui.ActionBar.o2[] o2VarArr = new org.telegram.ui.ActionBar.o2[1];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (z12) {
            int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
            org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            g1Var6.g(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
            g1Var6.setMinimumWidth(i10);
            g1Var6.setOnClickListener(new org.telegram.ui.Components.fi0(20, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var6);
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new xt(o2VarArr, 3));
        }
        if (isCommunity) {
            fyVar = this;
            c3 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (p2Var.getHasUnread()) {
                g1Var7.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            } else {
                g1Var7.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
            }
            g1Var7.setMinimumWidth(i10);
            long j15 = j11;
            fy fyVar3 = this;
            j11 = j15;
            g1Var7.setOnClickListener(new jh.q2(fyVar3, p2Var, j15, 5));
            c3 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var7);
            fyVar = fyVar3;
        }
        boolean[] zArr3 = new boolean[1];
        zArr3[c3] = true;
        TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(j11);
        int i19 = fyVar.a0[c3].s;
        boolean z13 = (i19 == 7 || i19 == 8) && (!fyVar.actionBar.s() || fyVar.actionBar.t(null));
        if (z13) {
            zArr = zArr3;
            dialogFilter = fyVar.getMessagesController().selectedDialogFilter[fyVar.a0[0].s == 8 ? (char) 1 : (char) 0];
        } else {
            zArr = zArr3;
            dialogFilter = null;
        }
        if (fyVar.g4(dialog)) {
            zArr2 = zArr;
            j12 = j11;
            r42 = 0;
        } else {
            ArrayList<TLRPC.Dialog> dialogs = fyVar.getMessagesController().getDialogs(fyVar.R2);
            int size2 = dialogs.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i20 >= size2) {
                    z10 = z13;
                    zArr2 = zArr;
                    j12 = j11;
                    break;
                }
                TLRPC.Dialog dialog2 = dialogs.get(i20);
                z10 = z13;
                if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                    zArr2 = zArr;
                    j12 = j11;
                } else if (fyVar.g4(dialog2)) {
                    zArr2 = zArr;
                    j12 = j11;
                    if (DialogObject.isEncryptedDialog(dialog2.id)) {
                        i22++;
                    } else {
                        i21++;
                    }
                } else {
                    zArr2 = zArr;
                    j12 = j11;
                    if (!fyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                        break;
                    }
                }
                i20++;
                zArr = zArr2;
                j11 = j12;
                z13 = z10;
            }
            if (dialog == null || fyVar.g4(dialog)) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j12);
                int i23 = !isEncryptedDialog ? 1 : 0;
                if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(j12))) {
                    i14 = i23;
                    i13 = isEncryptedDialog ? 1 : 0;
                    i12 = 0;
                } else {
                    i14 = i23;
                    i13 = isEncryptedDialog ? 1 : 0;
                    i12 = 1;
                }
            }
            int size3 = (!z10 || dialogFilter == null) ? (fyVar.R2 == 0 && dialogFilter == null) ? fyVar.getUserConfig().isPremium() ? fyVar.getMessagesController().maxPinnedDialogsCountPremium : fyVar.getMessagesController().maxPinnedDialogsCountDefault : fyVar.getUserConfig().isPremium() ? fyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : fyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
            boolean z14 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
            r42 = 0;
            zArr2[0] = z14;
        }
        if (zArr2[r42]) {
            org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(fyVar.getParentActivity(), r42, r42);
            if (fyVar.g4(dialog)) {
                g1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
            }
            g1Var8.setMinimumWidth(160);
            long j16 = j12;
            j13 = j16;
            g1Var8.setOnClickListener(new eg.a1(fyVar, dialogFilter, dialog, j16, 2));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var8);
        } else {
            j13 = j12;
        }
        if (DialogObject.isUserDialog(j13) && UserObject.isUserSelf(fyVar.getMessagesController().getUser(Long.valueOf(j13)))) {
            i11 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(fyVar.getParentActivity(), false, false);
            if (fyVar.getMessagesController().isDialogMuted(j13, 0L)) {
                g1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
            } else {
                g1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
            }
            g1Var9.setMinimumWidth(160);
            g1Var9.setOnClickListener(new bh.s(fyVar, j13, 5));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var9);
        }
        if (!isCommunity) {
            org.telegram.ui.ActionBar.g1 g1Var10 = new org.telegram.ui.ActionBar.g1(fyVar.getParentActivity(), i11, true);
            g1Var10.setIconColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
            int i24 = org.telegram.ui.ActionBar.g6.q7;
            g1Var10.setTextColor(fyVar.getThemedColor(i24));
            g1Var10.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, fyVar.getThemedColor(i24)));
            g1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
            g1Var10.setMinimumWidth(160);
            g1Var10.setOnClickListener(new org.telegram.ui.Components.fi0(21, fyVar, arrayList));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var10);
        }
        if (isCommunity) {
            if (fyVar.j2 != null) {
                fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
            }
            fyVar.t4();
            fyVar.parentLayout.setHighlightActionButtons(true);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("community_id", -j13);
            fy fyVar4 = new fy(bundle2);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2VarArr[0] = fyVar4;
                fyVar.presentFragmentAsPreview(fyVar4);
                return false;
            }
            o2VarArr[0] = fyVar4;
            fyVar.presentFragmentAsPreviewWithMenu(fyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
            return false;
        }
        if (!fyVar.getMessagesController().checkCanOpenChat(bundle, fyVar)) {
            return false;
        }
        if (fyVar.j2 != null) {
            fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
        }
        fyVar.t4();
        fyVar.parentLayout.setHighlightActionButtons(true);
        tn tnVar = new tn(bundle);
        Point point2 = AndroidUtilities.displaySize;
        if (point2.x > point2.y) {
            o2VarArr[0] = tnVar;
            fyVar.presentFragmentAsPreview(tnVar);
            return true;
        }
        o2VarArr[0] = tnVar;
        fyVar.presentFragmentAsPreviewWithMenu(tnVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
        tnVar.F9 = true;
        try {
            tnVar.W0.getAvatarImageView().performAccessibilityAction(64, null);
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean I3() {
        return this.N0 == 10;
    }

    public final void I4(boolean z10) {
        int i10 = 1;
        this.c.a(z10, true);
        if (this.i0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.L3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.i0.setVisibility(0);
        } else {
            this.i0.setSelected(false);
            Drawable background = this.i0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.i0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.L3.playTogether(arrayList);
        this.L3.addListener(new gx(this, z10, i10));
        this.L3.start();
    }

    public final void J3() {
        if (!AndroidUtilities.isTablet()) {
            this.R1 = true;
            return;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.h(true);
        }
        TLObject tLObject = this.T1;
        if (tLObject != null) {
            ox oxVar = this.y0;
            if (oxVar != null) {
                oxVar.U.R(this.S1, tLObject);
            }
            this.T1 = null;
        }
    }

    public final void J4() {
        if (this.w0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.v0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new vv(this, 9), 1000L);
    }

    public final void K3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null || !lVar.j0) {
            return;
        }
        lVar.h(true);
        this.l3 = false;
        V4(true, true);
    }

    public final void K4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        org.telegram.ui.Components.voip.o oVar;
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, this.g0);
        int i12 = org.telegram.ui.ActionBar.g6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 0;
        if (this.T2 != 0) {
            if (ChatObject.hasAdminRights(this.U2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new ev(this, 4), false);
                H.k();
            }
            H.i(new ev(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.U2.collapsed_in_dialogs);
            H.i(new ev(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.U2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new ev(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new ev(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var2 = this.resourceProvider;
        boolean a2 = c6Var2 != null ? c6Var2.a() : org.telegram.ui.ActionBar.g6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new ev(this, 11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new ev(this, 12), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new ev(this, 13), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(H);
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (launchActivity2 != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i14);
                i14++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu) {
                    hv hvVar = new hv(this, tL_attachMenuBot2, launchActivity2, 0);
                    org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(7, this, tL_attachMenuBot2);
                    org.telegram.ui.ActionBar.c6 c6Var3 = H.d;
                    if (H.e != null) {
                        int i15 = org.telegram.ui.ActionBar.g6.F8;
                        int i16 = org.telegram.ui.ActionBar.g6.E8;
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                        g1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                        CharSequence a10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.m8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                        TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                        if (sideAttachMenuBotIcon != null) {
                            launchActivity = launchActivity2;
                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.g6.c7, 1.0f);
                            if (svgThumb != null) {
                                Integer num = H.k0;
                                charSequence = a10;
                                svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i15, c6Var3), PorterDuff.Mode.SRC_IN));
                            } else {
                                charSequence = a10;
                            }
                            i10 = i16;
                            oVar = oVar2;
                            i11 = i15;
                            g1Var = g1Var2;
                            c6Var = c6Var3;
                            g1Var.h(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                            org.telegram.ui.Components.t9 t9Var = g1Var.h;
                            if (t9Var != null) {
                                t9Var.setLayoutParams(i7.f6.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                            }
                        } else {
                            launchActivity = launchActivity2;
                            oVar = oVar2;
                            i10 = i16;
                            g1Var = g1Var2;
                            c6Var = c6Var3;
                            CharSequence charSequence2 = a10;
                            i11 = i15;
                            g1Var.g(charSequence2, R.drawable.msg_bot, null);
                        }
                        Integer num2 = H.j0;
                        int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                        Integer num3 = H.k0;
                        g1Var.c(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                        Integer num4 = H.k0;
                        g1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                        Integer num5 = H.l0;
                        g1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                        g1Var.setOnClickListener(new org.telegram.ui.Components.t2(26, H, hvVar));
                        g1Var.setOnLongClickListener(new lh.e2(3, H, oVar));
                        int i17 = H.S;
                        if (i17 > 0) {
                            g1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                            H.r(g1Var, i7.f6.n(H.S, -2));
                        } else {
                            H.r(g1Var, i7.f6.n(-1, -2));
                        }
                        launchActivity2 = launchActivity;
                        i13 = 0;
                    }
                }
                launchActivity = launchActivity2;
                launchActivity2 = launchActivity;
                i13 = 0;
            }
        }
        if (getUserConfig().showCallsTab) {
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new ev(this, 6), false);
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.k0;
        if (g1Var3 != null) {
            g1Var3.b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ai));
            this.k0.setOnClickListener(new org.telegram.ui.Components.fi0(18, this, H));
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                H.k();
                H.d(this.k0);
            }
        }
        H.Z();
        H.X(-AndroidUtilities.dp(64.0f));
    }

    public final void L3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(str);
        boolean z10 = this.S;
        ArrayList arrayList = this.e1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.c1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.c1.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.c1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            this.c1.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
            this.c1.setOnClickListener(new jv(this, 6));
            j10.addView(this.c1, i7.f6.q(54, 54, 16));
            arrayList.add(this.c1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d1 = numberTextView;
        numberTextView.setTextSize(18);
        this.d1.setTypeface(AndroidUtilities.bold());
        this.d1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y8));
        j10.addView(this.d1, i7.f6.m(1.0f, 0, -1, this.S ? 18 : 72, 0, 0));
        this.d1.setOnTouchListener(new mh.d(2));
        this.g1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.h1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.i1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), i7.f6.n(5, -1));
        this.m1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.j1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.k1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.l1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.o1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.n1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.p1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.h1.setOnLongClickListener(new rv(this, 0));
        arrayList.add(this.g1);
        arrayList.add(this.i1);
        arrayList.add(this.h1);
        arrayList.add(this.f1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.O3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new kv(this, 6));
                showDialog(alertDialog$Builder.a, new fv(this, 1));
                this.O3 = str;
                return;
            }
        }
    }

    public final void M3() {
        ox oxVar = this.y0;
        if ((oxVar != null && oxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        ox oxVar2 = new ox(this, getParentActivity(), this, this.j2 != null ? 2 : !this.h2 ? 1 : 0, this.N0, this.R2, this.T2, new kx(this, 1));
        this.y0 = oxVar2;
        ((xx) this.fragmentView).addView(oxVar2, this.x0);
        ox oxVar3 = this.y0;
        oxVar3.U.Q = new qx(this);
        oxVar3.e0.setOnItemClickListener(new kv(this, 1));
        this.y0.j0.setOnItemClickListener(new kv(this, 2));
        this.y0.q0.setOnItemClickListener(new ov(this, 0));
        this.y0.j0.setOnItemLongClickListener(new kv(this, 3));
        this.y0.R.setOnItemClickListener(new kv(this, 4));
        this.y0.R.setOnItemLongClickListener(new kx(this, 2));
        this.y0.setFilteredSearchViewDelegate(new kv(this, 5));
        this.y0.setAlpha(0.0f);
        this.y0.setScaleX(1.05f);
        this.y0.setScaleY(1.05f);
        this.y0.setVisibility(8);
        this.y0.setBlurredBackgroundDrawableFactory(this.m4);
    }

    public final void M4(long j10, View view) {
        i3(j10, view);
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.E2;
        boolean z10 = true;
        char c3 = 1;
        int i10 = 0;
        if (!s10) {
            if (this.l3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    th.y(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            this.actionBar.O(null, null);
            int i11 = this.a0[0].s;
            ArrayList<TLRPC.Dialog> R3 = ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) ? R3(this.currentAccount, this.a0[0].s, this.R2, this.O1) : getMessagesController().getDialogs(this.R2);
            int size = R3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = R3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!g4(dialog)) {
                        if (!getMessagesController().isPromoDialog(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i12++;
                    }
                }
            }
            if (i12 > 1) {
                if (this.a0 != null) {
                    int i14 = 0;
                    while (true) {
                        ey[] eyVarArr = this.a0;
                        if (i14 >= eyVarArr.length) {
                            break;
                        }
                        eyVarArr[i14].d.D = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.l3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.e1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.q3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.q3 = ValueAnimator.ofFloat(this.p3, 1.0f);
            int i16 = 0;
            while (true) {
                ey[] eyVarArr2 = this.a0;
                if (i16 >= eyVarArr2.length) {
                    break;
                }
                ey eyVar = eyVarArr2[i16];
                if (eyVar != null) {
                    eyVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.G ? 81 : 0) + 48) + this.J);
            if (max != 0.0f) {
                this.L = (int) max;
                this.fragmentView.requestLayout();
            }
            this.q3.addUpdateListener(new lv(this, max, i10));
            this.q3.addListener(new ix(this, max, c3 == true ? 1 : 0));
            this.q3.setInterpolator(org.telegram.ui.Components.jr.f);
            this.q3.setDuration(200L);
            this.q3.start();
            ew ewVar = this.v0;
            if (ewVar != null) {
                ewVar.b(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.Fh, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.w8);
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.a1;
            if (h2Var != null) {
                h2Var.c(1.0f, true);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            b4(true);
            return;
        }
        T4(false);
        this.d1.a(arrayList.size(), z10);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            ux uxVar = this.T;
            vd.a aVar = this.b;
            uxVar.setBlurredBackgroundVisibility(aVar.e);
            float b10 = jf.l0.b(aVar.e);
            org.telegram.ui.Components.t9 t9Var = this.W2;
            if (t9Var != null) {
                t9Var.setScaleX(b10);
                this.W2.setScaleY(b10);
                this.W2.setAlpha(b10);
                this.W2.setVisibility(b10 > 0.0f ? 0 : 8);
            }
            if (this.r0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.r0.setScaleX(lerp);
                this.r0.setScaleY(lerp);
                this.r0.setAlpha(b10);
                this.r0.setVisibility(b10 > 0.0f ? 0 : 8);
                this.s0.setAlpha(b10);
                this.s0.setVisibility(b10 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            C3();
            E3();
            return;
        }
        if (i10 == 3) {
            A3();
            return;
        }
        if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i10 == 5) {
            z3();
            return;
        }
        if (i10 == 6) {
            C3();
            E3();
        } else {
            if (i10 == 7) {
                v3();
                return;
            }
            if (i10 == 8) {
                u3();
                F3();
            } else if (i10 == 9) {
                F3();
            }
        }
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.u0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new jx(this, parentActivity);
                FrameLayout.LayoutParams d = i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.c4 + this.e4 + d.bottomMargin;
                xx xxVar = (xx) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.t0 + 1;
                this.t0 = i11;
                xxVar.addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j10, View view) {
        int i10 = -this.I3;
        this.I3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.tc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.tc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ev(this, 22))).j();
    }

    public final void O3(final long j10, final long j11, boolean z10, final ze1 ze1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j10)) {
            int i10 = this.N0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j10)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j10));
                    if (!user2.mutual_contact) {
                        UndoView Y3 = Y3();
                        if (Y3 != null) {
                            Y3.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView Y32 = Y3();
                        if (Y32 != null) {
                            Y32.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = chat2;
                    user = null;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new jh.x2(this, c2Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    c2Var.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            int i11 = 1;
            if (!z10 || ((this.b2 == null || this.c2 == null) && this.d2 == null)) {
                if (i10 != 15) {
                    if (this.y2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.y2.v(this, arrayList, null, false, this.F2, this.G2, this.H2, ze1Var) && this.e2) {
                        this.y2 = null;
                        return;
                    }
                    return;
                }
                Runnable vVar = new g5.v(this, j10, new g5.x(this, j10, j11, ze1Var, 13), 26);
                if (j10 < 0) {
                    Q4(getMessagesController().getChat(Long.valueOf(-j10)), vVar, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.D));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                c2Var2.N = formatString;
                c2Var2.P = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new xt(vVar, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.xo0(14));
                showDialog(c2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.x3.p(getMessagesController(), j10).user_id));
                if (user5 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.b2, UserObject.getUserName(user5));
                string2 = LocaleController.getString(R.string.Send);
            } else if (!DialogObject.isUserDialog(j10)) {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat3 == null) {
                    return;
                }
                String str3 = chat3.title;
                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat3.id, j11)) != null) {
                    str3 = ((Object) str3) + " " + findTopic.title;
                }
                if (this.d2 != null) {
                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.d2, str3);
                    string2 = LocaleController.getString(R.string.Add);
                } else {
                    string = LocaleController.getString(R.string.SendMessageTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.c2, str3);
                    string2 = LocaleController.getString(R.string.Send);
                }
                String str4 = formatStringSimple;
                str = string;
                str2 = str4;
            } else if (j10 == getUserConfig().getClientUserId()) {
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.c2, LocaleController.getString(R.string.SavedMessages));
                string2 = LocaleController.getString(R.string.Send);
            } else {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (user6 == null || this.b2 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.b2, UserObject.getUserName(user6));
                string2 = LocaleController.getString(R.string.Send);
            }
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
            c2Var3.N = str;
            c2Var3.P = AndroidUtilities.replaceTags(str2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.dw
                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i12) {
                    fy.this.O3(j10, j11, false, ze1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(c2Var3) == null) {
                c2Var3.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O4(boolean z10, boolean z11, boolean z12, boolean z13) {
        ox oxVar;
        ox oxVar2;
        xw xwVar;
        ox oxVar3;
        boolean z14;
        ox oxVar4;
        boolean z15;
        org.telegram.ui.Components.y71 y71Var;
        TLRPC.Chat chat;
        ax axVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            M3();
        } else {
            c5(false);
        }
        int i11 = this.N0;
        if (i11 != 0 && i11 != 3) {
            z16 = false;
        }
        AnimatorSet animatorSet = this.s1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s1 = null;
        }
        this.l3 = z10;
        m3();
        if (z10) {
            if (!this.o3 && !z13) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.h2 || (totalDialogsCount <= 10 && !this.G)) {
                    z14 = true;
                    oxVar4 = this.y0;
                    if (oxVar4 != null) {
                        oxVar4.K0 = z14;
                    }
                    z15 = z14 || this.G;
                    this.n3 = z15;
                    if (z15) {
                        this.o3 = true;
                    }
                    y71Var = this.W;
                    if (y71Var != null && oxVar4 != null && !z14 && this.T2 == 0) {
                        org.telegram.ui.Components.y71 n10 = oxVar4.n(-2, false);
                        this.W = n10;
                        this.V.addView(n10, 0, i7.f6.e(-1, -1, 119));
                    } else if (this.V != null && z14 && this.T2 == 0) {
                        AndroidUtilities.removeFromParent(y71Var);
                        this.W = null;
                    }
                    if (this.y0 != null) {
                        G3(false);
                        this.y0.setKeyboardHeight(((xx) this.fragmentView).getKeyboardHeight());
                        ox oxVar5 = this.y0;
                        oxVar5.w0.clear();
                        oxVar5.J();
                    }
                    chat = this.U2;
                    if (chat == null) {
                        rf.f0 f0Var = new rf.f0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        f0Var.f = this.U2;
                        j3(f0Var);
                    } else if (this.R2 != 0 && ((axVar = this.B3) == null || !axVar.c())) {
                        j3(new rf.f0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z14 = false;
            oxVar4 = this.y0;
            if (oxVar4 != null) {
            }
            if (z14) {
            }
            this.n3 = z15;
            if (z15) {
            }
            y71Var = this.W;
            if (y71Var != null) {
            }
            if (this.V != null) {
                AndroidUtilities.removeFromParent(y71Var);
                this.W = null;
            }
            if (this.y0 != null) {
            }
            chat = this.U2;
            if (chat == null) {
            }
        }
        if (z16 && (oxVar3 = this.y0) != null && oxVar3.U.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (xwVar = this.A0) != null && this.C0) {
            xwVar.setVisibility(0);
        }
        boolean z17 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                ox oxVar6 = this.y0;
                if (oxVar6 != null) {
                    oxVar6.setVisibility(0);
                    ox oxVar7 = this.y0;
                    oxVar7.setPosition(0);
                    if (oxVar7.U.h() > 0) {
                        oxVar7.V.h1(0, 0);
                    }
                    f2.j0 j0Var = oxVar7.d0;
                    if (j0Var != null) {
                        j0Var.h1(0, 0);
                    }
                    f2.j0 j0Var2 = oxVar7.i0;
                    if (j0Var2 != null) {
                        j0Var2.h1(0, 0);
                    }
                    f2.j0 j0Var3 = oxVar7.p0;
                    if (j0Var3 != null) {
                        j0Var3.h1(0, 0);
                    }
                    oxVar7.h.clear();
                }
                W4(true, null, null, false, false);
                org.telegram.ui.Components.y71 y71Var2 = this.W;
                if (y71Var2 != null) {
                    y71Var2.b(false, false);
                }
            } else {
                this.a0[0].a.setVisibility(0);
                this.a0[0].setVisibility(0);
            }
            A4(true, true);
            this.a0[0].a.setVerticalScrollBarEnabled(false);
            ox oxVar8 = this.y0;
            if (oxVar8 != null) {
                oxVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            }
            this.s1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ey eyVar = this.a0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(eyVar, (Property<ey, Float>) property, z10 ? 0.0f : 1.0f));
            if (z17) {
                this.a0[0].setScaleX(1.0f);
                this.a0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.a0[0], (Property<ey, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.a0[0], (Property<ey, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            ax axVar2 = this.B3;
            if (axVar2 != null) {
                axVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.B3, (Property<ax, Float>) property, z10 ? 0.0f : 1.0f));
            }
            ox oxVar9 = this.y0;
            if (oxVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(oxVar9, (Property<ox, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.G) {
                    float dp = AndroidUtilities.dp(81.0f) + this.J + AndroidUtilities.dp(48.0f);
                    ox oxVar10 = this.y0;
                    float f9 = z10 ? dp : 0.0f;
                    if (z10) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(oxVar10, this.D3, f9, dp));
                }
                if (z17) {
                    this.y0.setScaleX(1.0f);
                    this.y0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.y0, (Property<ox, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.y0, (Property<ox, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.c0 != null) {
                Z4(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new gv(this, 1));
            arrayList.add(ofFloat);
            this.s1.playTogether(arrayList);
            this.s1.setDuration(z10 ? 200L : 180L);
            this.s1.setInterpolator(org.telegram.ui.Components.jr.g);
            if (!z10) {
                this.s1.setStartDelay(20L);
            }
            this.s1.addListener(new gx(this, z10, i10));
            this.k3.lock();
            this.s1.start();
        } else {
            A4(false, true);
            if (z10) {
                this.a0[0].a.c1();
            } else {
                ay ayVar = this.a0[0].a;
                if (ayVar.e1) {
                    ayVar.e1 = false;
                    ayVar.J0(false);
                }
            }
            this.a0[0].setAlpha(z10 ? 0.0f : 1.0f);
            if (z17) {
                this.a0[0].setScaleX(1.0f);
                this.a0[0].setScaleY(1.0f);
            } else {
                this.a0[0].setScaleX(z10 ? 0.95f : 1.0f);
                this.a0[0].setScaleY(z10 ? 0.95f : 1.0f);
            }
            ox oxVar11 = this.y0;
            if (oxVar11 != null) {
                oxVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (z17) {
                    this.y0.setScaleX(1.0f);
                    this.y0.setScaleY(1.0f);
                } else {
                    this.y0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.y0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.y0.setVisibility(z10 ? 0 : 8);
            }
            ux uxVar = this.T;
            if (uxVar != null) {
                uxVar.setTranslationY(W3() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.A0 != null) {
                if (!this.C0 || isInPreviewMode() || z10) {
                    this.A0.setVisibility(8);
                } else {
                    this.A0.setVisibility(0);
                }
            }
            D4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.x;
        if (i12 >= 0 && (oxVar2 = this.y0) != null) {
            oxVar2.setPosition(oxVar2.L(i12));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (oxVar = this.y0) != null) {
            oxVar.setPosition((oxVar.m0 ? 1 : 0) + 5);
            c5(true);
        }
        F3();
        U4();
    }

    public final void P3(long j10, boolean z10) {
        if (this.a0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ey[] eyVarArr = this.a0;
            if (i10 >= eyVarArr.length) {
                return;
            }
            int childCount = eyVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.a0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.p2) {
                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                        if (p2Var.getDialogId() == j10) {
                            p2Var.V(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void P4() {
        int i10;
        int i11;
        if (this.I0 != null || SharedConfig.appLocked || (this.G && !this.A0.g())) {
            return;
        }
        u51[] u51VarArr = new u51[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            this.z3.f();
            Drawable drawable = this.z3.f[0];
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
            org.telegram.ui.Cells.o oVar = this.A3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i11 = dp;
        }
        bx bxVar = new bx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), u51VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            bxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l10 = this.x3;
        if (l10 != null) {
            bxVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.z3.f[0];
            bxVar.setSelected(drawable2 instanceof org.telegram.ui.Components.p5 ? Long.valueOf(((org.telegram.ui.Components.p5) drawable2).i()) : null);
        }
        bxVar.setSaveState(1);
        bxVar.y(this.z3, titleTextView);
        cx cxVar = new cx(this, bxVar);
        this.I0 = cxVar;
        u51VarArr[0] = cxVar;
        cxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        u51VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.C.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.o2, org.telegram.ui.fy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String formatString;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 2;
        int i11 = 1;
        String formatString2 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = formatString2;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.C.bot_participant;
        ?? r9 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().isInChatCached(chat, user)) {
            charSequence = r9;
        }
        if (this.C.bot_admin_rights == null) {
            formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
        } else {
            int i12 = R.string.AreYouSureSendChatToBotAddRights;
            String firstName = UserObject.getFirstName(user);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.C.bot_admin_rights;
            int i13 = org.telegram.ui.Cells.o6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                b.s(isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                b.s(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                b.s(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                b.s(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                b.s(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                b.s(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                b.s(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                b.s(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                b.s(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                b.s(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                b.s(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
            }
            if (arrayList.size() == 1) {
                r9 = ((org.telegram.ui.Cells.p6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r9 = new SpannableStringBuilder();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 > 0) {
                        r9.append(", ");
                    }
                    r9.append(((org.telegram.ui.Cells.p6) arrayList.get(i14)).b.toString().toLowerCase());
                }
            }
            formatString = LocaleController.formatString(i12, new Object[]{firstName, str, r9});
        }
        charSequence = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(formatString));
        c2Var.P = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new ze(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new ze(i10, runnable2));
        showDialog(c2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList R3(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.N1) != null) {
            return arrayList;
        }
        MessagesController messagesController = AccountInstance.getInstance(i10).getMessagesController();
        if (i11 == 0) {
            return messagesController.getDialogs(i12);
        }
        if (i11 == 10 || i11 == 13) {
            return messagesController.dialogsServerOnly;
        }
        if (i11 == 2) {
            ArrayList arrayList2 = new ArrayList(messagesController.dialogsMyGroups.size() + messagesController.dialogsMyChannels.size() + messagesController.dialogsCanAddUsers.size() + 2);
            if (messagesController.dialogsMyChannels.size() > 0 && this.u2) {
                arrayList2.add(new zx(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.r2) {
                arrayList2.add(new zx(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.u2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.r2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new zx(2));
                            r2 = false;
                        }
                        arrayList2.add(dialog);
                    }
                }
            }
            return arrayList2;
        }
        if (i11 == 3) {
            return messagesController.dialogsForward;
        }
        if (i11 == 4 || i11 == 12) {
            return messagesController.dialogsUsersOnly;
        }
        if (i11 == 5) {
            return messagesController.dialogsChannelsOnly;
        }
        if (i11 == 6 || i11 == 11) {
            return messagesController.dialogsGroupsOnly;
        }
        if (i11 == 7 || i11 == 8) {
            MessagesController.DialogFilter dialogFilter = messagesController.selectedDialogFilter[i11 != 7 ? 1 : 0];
            return dialogFilter == null ? messagesController.getDialogs(i12) : this.N0 == 3 ? dialogFilter.dialogsForward : dialogFilter.dialogs;
        }
        if (i11 == 9) {
            return messagesController.dialogsForBlock;
        }
        if (i11 != 1 && i11 != 16 && i11 != 14) {
            if (i11 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            TLRPC.User user = messagesController.getUser(Long.valueOf(this.D));
            TLRPC.RequestPeerType requestPeerType = this.C;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap<Long, TLRPC.User> users = messagesController.getUsers();
                ArrayList<TLRPC.Dialog> arrayList4 = messagesController.dialogsUsersOnly;
                int size2 = arrayList4.size();
                while (r1 < size2) {
                    TLRPC.Dialog dialog2 = arrayList4.get(r1);
                    r1++;
                    TLRPC.Dialog dialog3 = dialog2;
                    if (l4(getMessagesController().getUser(Long.valueOf(dialog3.id)))) {
                        arrayList3.add(dialog3);
                    }
                }
                for (TLRPC.User user2 : users.values()) {
                    if (user2 != null && !messagesController.dialogs_dict.d(user2.id) && l4(user2)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j10 = user2.id;
                        tL_peerUser.user_id = j10;
                        tL_dialog.id = j10;
                        arrayList3.add(tL_dialog);
                    }
                }
            } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                ConcurrentHashMap<Long, TLRPC.Chat> chats = messagesController.getChats();
                ArrayList<TLRPC.Dialog> arrayList5 = this.C instanceof TLRPC.TL_requestPeerTypeChat ? messagesController.dialogsGroupsOnly : messagesController.dialogsChannelsOnly;
                int size3 = arrayList5.size();
                while (r1 < size3) {
                    TLRPC.Dialog dialog4 = arrayList5.get(r1);
                    r1++;
                    TLRPC.Dialog dialog5 = dialog4;
                    if (k4(getMessagesController().getChat(Long.valueOf(-dialog5.id)), user)) {
                        arrayList3.add(dialog5);
                    }
                }
                for (TLRPC.Chat chat : chats.values()) {
                    if (chat != null && !messagesController.dialogs_dict.d(-chat.id) && k4(chat, user)) {
                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_dialog2.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = chat.id;
                        } else {
                            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                            tL_dialog2.peer = tL_peerChat;
                            tL_peerChat.chat_id = chat.id;
                        }
                        tL_dialog2.id = -chat.id;
                        arrayList3.add(tL_dialog2);
                    }
                }
            }
            return arrayList3;
        }
        ArrayList arrayList6 = this.P3;
        if (arrayList6 != null) {
            return arrayList6;
        }
        this.P3 = new ArrayList();
        r2 = i11 == 16;
        if (this.v2 || this.w2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList7 = messagesController.dialogsUsersOnly;
            int size4 = arrayList7.size();
            int i14 = 0;
            while (i14 < size4) {
                TLRPC.Dialog dialog6 = arrayList7.get(i14);
                i14++;
                TLRPC.Dialog dialog7 = dialog6;
                TLRPC.User user3 = messagesController.getUser(Long.valueOf(dialog7.id));
                if (user3 != null && !UserObject.isDeleted(user3)) {
                    if (!r2) {
                        if (user3.bot) {
                            if (this.w2) {
                                if (UserObject.isUserSelf(user3)) {
                                }
                            }
                        } else if (this.v2) {
                            if (UserObject.isUserSelf(user3)) {
                            }
                        }
                        this.P3.add(dialog7);
                    } else if (!UserObject.isService(user3.id) && !MessagesController.isSupportUser(user3)) {
                        this.P3.add(dialog7);
                    }
                }
            }
        }
        if (this.r2 || (((z11 = this.t2) && this.s2) || r2)) {
            ArrayList<TLRPC.Dialog> arrayList8 = messagesController.dialogsGroupsOnly;
            int size5 = arrayList8.size();
            int i15 = 0;
            while (i15 < size5) {
                TLRPC.Dialog dialog8 = arrayList8.get(i15);
                i15++;
                TLRPC.Dialog dialog9 = dialog8;
                TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-dialog9.id));
                if (chat2 != null && !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    if (r2) {
                        if (ChatObject.isMegagroup(chat2)) {
                            this.P3.add(dialog9);
                        }
                    } else if (messagesController.canAddToForward(dialog9)) {
                        this.P3.add(dialog9);
                    }
                }
            }
        } else if (z11 || this.s2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList9 = messagesController.dialogsGroupsOnly;
            int size6 = arrayList9.size();
            int i16 = 0;
            while (i16 < size6) {
                TLRPC.Dialog dialog10 = arrayList9.get(i16);
                i16++;
                TLRPC.Dialog dialog11 = dialog10;
                TLRPC.Chat chat3 = messagesController.getChat(Long.valueOf(-dialog11.id));
                if (chat3 != null && !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                    if (r2) {
                        if (ChatObject.isMegagroup(chat3)) {
                            this.P3.add(dialog11);
                        }
                    } else if (messagesController.canAddToForward(dialog11)) {
                        if (this.t2) {
                            if (!ChatObject.isMegagroup(chat3)) {
                                this.P3.add(dialog11);
                            }
                        }
                        if (this.s2 && ChatObject.isMegagroup(chat3)) {
                            this.P3.add(dialog11);
                        }
                    }
                }
            }
        }
        if (this.u2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList10 = messagesController.dialogsChannelsOnly;
            int size7 = arrayList10.size();
            while (r1 < size7) {
                TLRPC.Dialog dialog12 = arrayList10.get(r1);
                r1++;
                TLRPC.Dialog dialog13 = dialog12;
                TLRPC.Chat chat4 = messagesController.getChat(Long.valueOf(-dialog13.id));
                if (r2) {
                    if (chat4 instanceof TLRPC.TL_channel) {
                        this.P3.add(dialog13);
                    }
                } else if (messagesController.canAddToForward(dialog13)) {
                    this.P3.add(dialog13);
                }
            }
        }
        getMessagesController().sortDialogsList(this.P3);
        return this.P3;
    }

    public final void R4(boolean z10) {
        ey[] eyVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            eyVarArr = this.a0;
            if (i11 >= eyVarArr.length) {
                break;
            }
            eyVarArr[i11].a.B0();
            i11++;
        }
        char c3 = (!z10 || eyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = eyVarArr[c3].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.a0[c3].h);
        if (dialogFilter.isDefault()) {
            ey eyVar = this.a0[c3];
            eyVar.s = this.N0;
            ay ayVar = eyVar.a;
            int i13 = ay.r3;
            ayVar.A1();
        } else {
            ey[] eyVarArr2 = this.a0;
            if (eyVarArr2[c3 ^ 1].s == 7) {
                eyVarArr2[c3].s = 8;
            } else {
                eyVarArr2[c3].s = 7;
            }
            eyVarArr2[c3].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.a0[c3].s == 8 ? 1 : 0);
        }
        ey[] eyVarArr3 = this.a0;
        if (eyVarArr3.length > 1) {
            eyVarArr3[1].A = dialogFilter.locked;
        }
        ey eyVar2 = eyVarArr3[c3];
        nw nwVar = eyVar2.d;
        nwVar.h = eyVar2.s;
        nwVar.l();
        ey eyVar3 = this.a0[c3];
        jw jwVar = eyVar3.c;
        if (eyVar3.s == 0 && Z3() && this.a0[c3].v == 2) {
            i10 = 1;
        }
        jwVar.h1(i10, (int) this.J);
        r3(this.a0[c3]);
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.mg0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        ax axVar;
        cg.h0 h0Var;
        ew ewVar;
        if (!this.l3 && (((axVar = this.B3) == null || !axVar.c()) && (((h0Var = this.G0) == null || h0Var.getVisibility() != 0) && ((ewVar = this.v0) == null || !ewVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ew ewVar2 = this.v0;
                boolean z11 = ewVar2 == null || ewVar2.getTabsCount() < 2 || this.v0.getCurrentTabId() == this.v0.getFirstTabId();
                ew ewVar3 = this.v0;
                boolean z12 = ewVar3 == null || ewVar3.getTabsCount() < 2 || this.v0.getCurrentTabId() == this.v0.getLastTabId();
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (!z10) {
                    return z11;
                }
                if (!z12 || z11) {
                }
            }
            return true;
        }
        return false;
    }

    public final float S3(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - V3()) * this.r.e;
    }

    public final void S4() {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        p31 p31Var = this.V;
        float measuredHeight = (p31Var == null || p31Var.getVisibility() == 8) ? 0.0f : this.V.getMeasuredHeight();
        float dp = this.G ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.G) {
            float f16 = this.J;
            float f17 = this.t1;
            f9 = (measuredHeight * f17) + com.google.android.recaptcha.internal.a.z(1.0f, f17, dp, f16);
            f10 = this.s3;
        } else {
            f9 = (measuredHeight * this.t1) + this.J;
            f10 = this.s3;
        }
        float f18 = f9 + f10 + this.P;
        ux uxVar = this.T;
        float dp2 = AndroidUtilities.dp(4.0f) * ((uxVar == null || uxVar.getVisibility() != 0) ? 0.0f : this.T.getAlpha());
        ew ewVar = this.v0;
        if (ewVar != null) {
            ewVar.setTranslationY(f18 - dp2);
            f12 = this.v0.getAlpha();
            f13 = AndroidUtilities.dp(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.fs fsVar = this.F1;
        if (fsVar != null) {
            fsVar.setTranslationY(AndroidUtilities.lerp(f11 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.W == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f14 = this.F1.getMetadata().c.a;
            f15 = this.F1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.es esVar = this.G1;
        if (esVar != null) {
            esVar.setTranslationY(f18 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f14, f12));
            org.telegram.ui.Components.es esVar2 = this.G1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f15 + f13) - lerp);
            Matrix matrix = esVar2.b;
            if (esVar2.e != lerp || esVar2.f != min) {
                esVar2.e = lerp;
                esVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = esVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                esVar2.invalidate();
            }
            this.G1.setAlpha(Math.max(f12, f14));
        }
    }

    public final int T3() {
        if (!this.G) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03de, code lost:
    
        if (r1.isEmpty() == false) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T4(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        ew ewVar;
        org.telegram.ui.Components.c00 d;
        long j10;
        TLRPC.User user;
        this.Q2 = false;
        this.O2 = 0;
        this.L2 = 0;
        this.K2 = 0;
        this.J2 = 0;
        this.I2 = 0;
        this.P2 = 0;
        this.M2 = 0;
        this.N2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.E2;
        int size = arrayList.size();
        long clientUserId = getUserConfig().getClientUserId();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i10 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(((Long) arrayList.get(i10)).longValue());
            if (dialog == null) {
                j10 = clientUserId;
            } else {
                long j11 = dialog.id;
                boolean g42 = g4(dialog);
                j10 = clientUserId;
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().isForum(j11)) {
                    this.P2++;
                }
                int i17 = i14;
                int i18 = i15;
                if (getMessagesController().isDialogMuted(j11, 0L)) {
                    this.L2++;
                } else {
                    this.K2++;
                }
                if (z12) {
                    this.I2++;
                }
                if (this.R2 == 1 || dialog.folder_id == 1) {
                    this.O2++;
                } else if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().isPromoDialog(j11, false)) {
                    i14 = i17 + 1;
                    if (dialog.community_id != 0) {
                        i12++;
                    }
                    if (DialogObject.isUserDialog(j11) || j11 == j10 || j11 == UserObject.VERIFY || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j11)))) {
                        i16++;
                    } else if (org.telegram.messenger.x3.v("dialog_bar_report", j11, notificationsSettings, true)) {
                        this.N2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(getMessagesController(), dialog.id);
                            user = p10 != null ? getMessagesController().getUser(Long.valueOf(p10.user_id)) : new TLRPC.TL_userEmpty();
                        } else {
                            user = (isChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                        }
                        if (user != null && user.bot) {
                            MessagesController.isSupportUser(user);
                        }
                        if (g42) {
                            i15 = i18 + 1;
                        } else {
                            this.J2++;
                            i15 = i18;
                        }
                    } else {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j11));
                        if (getMessagesController().isPromoDialog(dialog.id, true)) {
                            this.M2++;
                            if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                i11++;
                                this.Q2 = true;
                            }
                            i15 = i18;
                        } else {
                            if (g42) {
                                i15 = i18 + 1;
                            } else {
                                this.J2++;
                                i15 = i18;
                            }
                            if (chat == null || !chat.megagroup) {
                                this.M2++;
                            } else if (ChatObject.isPublic(chat)) {
                                this.M2++;
                            }
                            i11++;
                        }
                    }
                    i13++;
                    i11++;
                }
                i14 = i17;
                if (dialog.community_id != 0) {
                }
                if (DialogObject.isUserDialog(j11)) {
                }
                i16++;
                if (DialogObject.isChannel(dialog)) {
                }
                i13++;
                i11++;
            }
            i10++;
            clientUserId = j10;
        }
        int i19 = i14;
        int i20 = i15;
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f1;
        if (w0Var3 != null) {
            if (i11 != size || i12 > 0) {
                w0Var3.setVisibility(8);
            } else {
                w0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = this.n1;
        if (g1Var2 != null) {
            int i21 = this.M2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                g1Var2.setVisibility(0);
                if (this.M2 != 0) {
                    this.n1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.n1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                g1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.m1;
        if (g1Var3 != null && this.i1 != null) {
            if (this.O2 != 0 && i12 == 0 && this.T2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.m1.g(string, R.drawable.msg_unarchive, null);
                this.i1.setIcon(R.drawable.msg_unarchive);
                this.i1.setContentDescription(string);
                ew ewVar2 = this.v0;
                if (ewVar2 == null || ewVar2.getVisibility() != 0) {
                    this.m1.setVisibility(0);
                    this.i1.setVisibility(8);
                } else {
                    this.i1.setVisibility(0);
                    this.m1.setVisibility(8);
                }
            } else if (i19 != 0 && i12 == 0 && this.T2 == 0) {
                String string2 = LocaleController.getString(R.string.Archive);
                this.m1.g(string2, R.drawable.msg_archive, null);
                this.i1.setIcon(R.drawable.msg_archive);
                this.i1.setContentDescription(string2);
                ew ewVar3 = this.v0;
                if (ewVar3 == null || ewVar3.getVisibility() != 0) {
                    this.m1.setVisibility(0);
                    this.i1.setVisibility(8);
                } else {
                    this.i1.setVisibility(0);
                    this.m1.setVisibility(8);
                }
            } else {
                g1Var3.setVisibility(8);
                this.i1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var4 = this.g1;
        if (w0Var4 != null && this.j1 != null) {
            if (this.J2 + i20 == size && this.T2 == 0) {
                ew ewVar4 = this.v0;
                if (ewVar4 == null || ewVar4.getVisibility() != 0) {
                    this.g1.setVisibility(0);
                    this.j1.setVisibility(8);
                } else {
                    this.j1.setVisibility(0);
                    this.g1.setVisibility(8);
                }
            } else {
                w0Var4.setVisibility(8);
                this.j1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.p1;
        if (g1Var4 != null) {
            if (i16 != 0) {
                g1Var4.setVisibility(8);
            } else {
                g1Var4.setVisibility(0);
            }
        }
        if (this.l1 != null) {
            ew ewVar5 = this.v0;
            boolean z13 = ewVar5 == null || ewVar5.getVisibility() != 0 || ((d = (ewVar = this.v0).d()) != null && d.a == ewVar.H);
            if (!z13) {
                try {
                    z13 = size >= R3(this.currentAccount, this.a0[0].d.h, this.R2, this.O1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z11 = false;
                this.l1.setVisibility(0);
                if (this.k1 != null) {
                    if (this.R2 != 1) {
                        if (this.v0 != null && S3(z11) > 0.5f) {
                            ew ewVar6 = this.v0;
                            org.telegram.ui.Components.c00 d10 = ewVar6.d();
                            if (d10 != null && d10.a == ewVar6.H) {
                                int i22 = org.telegram.ui.Components.j00.w;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i23 = 0; i23 < size2; i23++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                                    if (!org.telegram.ui.Components.j00.H(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                                        arrayList2.add(dialogFilter);
                                    }
                                }
                            }
                        }
                        this.k1.setVisibility(8);
                    }
                    this.k1.setVisibility(0);
                }
                w0Var = this.h1;
                if (w0Var != null) {
                    if (this.L2 != 0) {
                        w0Var.setIcon(R.drawable.msg_unmute);
                        this.h1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    } else {
                        w0Var.setIcon(R.drawable.msg_mute);
                        this.h1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                    }
                }
                g1Var = this.o1;
                if (g1Var != null) {
                    if (this.I2 != 0) {
                        g1Var.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                        this.o1.setVisibility(0);
                    } else if (this.P2 == 0 && i12 == 0) {
                        g1Var.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                        this.o1.setVisibility(0);
                    } else {
                        g1Var.setVisibility(8);
                    }
                }
                w0Var2 = this.g1;
                if (w0Var2 != null || this.j1 == null) {
                }
                if (this.J2 != 0) {
                    w0Var2.setIcon(R.drawable.msg_pin);
                    this.g1.setContentDescription(LocaleController.getString(R.string.PinToTop));
                    this.j1.setText(LocaleController.getString(R.string.DialogPin));
                    return;
                } else {
                    w0Var2.setIcon(R.drawable.msg_unpin);
                    this.g1.setContentDescription(LocaleController.getString(R.string.UnpinFromTop));
                    this.j1.setText(LocaleController.getString(R.string.DialogUnpin));
                    return;
                }
            }
            this.l1.setVisibility(8);
        }
        z11 = false;
        if (this.k1 != null) {
        }
        w0Var = this.h1;
        if (w0Var != null) {
        }
        g1Var = this.o1;
        if (g1Var != null) {
        }
        w0Var2 = this.g1;
        if (w0Var2 != null) {
        }
    }

    public final int U3() {
        if (this.G) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4() {
        long j10;
        boolean z10;
        boolean z11;
        String str;
        ApplicationLoader applicationLoader;
        boolean z12;
        String next;
        boolean z13;
        StringBuilder sb2;
        final long j11;
        final long j12;
        ax axVar;
        vd.a aVar;
        vd.a aVar2;
        ax axVar2;
        boolean z14;
        ax axVar3;
        if (this.F1 == null || this.I1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.x2 x2Var = this.I1;
        final int i10 = 0;
        if (x2Var != null) {
            try {
                ((org.telegram.ui.Components.xi0) ((org.telegram.ui.Components.e9) x2Var.h.getImageReceiver().getStaticThumb()).B).r0 = null;
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.x2 x2Var2 = this.I1;
            x2Var2.setCompact(false);
            x2Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.t9 t9Var = x2Var2.h;
            t9Var.setVisibility(8);
            t9Var.b();
        }
        int i11 = 4;
        long j13 = 0;
        final int i12 = 1;
        if (isInPreviewMode()) {
            str = null;
        } else {
            if (getMessagesController().isFrozen()) {
                this.I1.setOnClickListener(new jv(this, 12));
                this.I1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else if (this.R2 == 0 && this.T2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                this.I1.setOnClickListener(new jv(this, 19));
                this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.I1.c, new vv(this, i11)), LocaleController.getString(R.string.PasskeyPopupText));
                this.I1.setOnCloseListener(new jv(this, 24));
            } else if (this.R2 == 0 && this.T2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                this.I1.setOnClickListener(new jv(this, 25));
                this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.I1.c, new vv(this, i11)), LocaleController.getString(R.string.GraceMessage));
                this.I1.setOnCloseListener(new jv(this, 26));
            } else if (this.R2 == 0 && this.T2 == 0 && getMessagesController().customPendingSuggestion != null) {
                final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.I1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.I1.c.getPaint().getFontMetricsInt());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                this.I1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.I1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.I1.d.getPaint().getFontMetricsInt()));
                this.I1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zv
                    public final /* synthetic */ fy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                ye.d.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                break;
                            default:
                                fy.U(this.b, tL_pendingSuggestion);
                                break;
                        }
                    }
                });
                this.I1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zv
                    public final /* synthetic */ fy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                ye.d.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                break;
                            default:
                                fy.U(this.b, tL_pendingSuggestion);
                                break;
                        }
                    }
                });
            } else {
                if (this.R2 == 0 && this.T2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                    jh.s7 y8 = jh.s7.y(this.currentAccount, false);
                    ArrayList arrayList = y8.z;
                    if (!arrayList.isEmpty()) {
                        long j14 = -y8.f.amount;
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i13);
                            long j15 = j13;
                            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
                            if (peerDialogId >= j15) {
                                if (getMessagesController().getUser(Long.valueOf(peerDialogId)) == null) {
                                    i13++;
                                    j13 = j15;
                                }
                                j14 += starsSubscription.pricing.amount;
                                i13++;
                                j13 = j15;
                            } else {
                                if (getMessagesController().getChat(Long.valueOf(-peerDialogId)) == null) {
                                    i13++;
                                    j13 = j15;
                                }
                                j14 += starsSubscription.pricing.amount;
                                i13++;
                                j13 = j15;
                            }
                        }
                        j10 = j13;
                        if (j14 > j10) {
                            jh.s7 y10 = jh.s7.y(this.currentAccount, false);
                            ArrayList arrayList2 = y10.z;
                            StringBuilder sb3 = new StringBuilder();
                            if (arrayList2.isEmpty()) {
                                sb2 = sb3;
                                j11 = j10;
                                j12 = j11;
                            } else {
                                long j16 = j10;
                                j12 = j16;
                                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                    TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i14);
                                    long peerDialogId2 = DialogObject.getPeerDialogId(starsSubscription2.peer);
                                    if (j12 == j10) {
                                        j12 = peerDialogId2;
                                    }
                                    if (peerDialogId2 >= j10) {
                                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerDialogId2));
                                        if (user != null) {
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(UserObject.getUserName(user));
                                            j16 += starsSubscription2.pricing.amount;
                                        }
                                    } else {
                                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-peerDialogId2));
                                        if (chat != null) {
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(chat.title);
                                            j16 += starsSubscription2.pricing.amount;
                                        }
                                    }
                                }
                                sb2 = sb3;
                                j11 = j16;
                            }
                            final String sb4 = sb2.toString();
                            this.I1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.aw
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    fy fyVar = fy.this;
                                    new jh.y9(fyVar.getParentActivity(), fyVar.getResourceProvider(), j11, 2, sb4, new ev(fyVar, 16), j12).show();
                                }
                            });
                            org.telegram.ui.Cells.x2 x2Var3 = this.I1;
                            long j17 = j11 - y10.f.amount;
                            if (j17 > j10) {
                                j11 = j17;
                            }
                            x2Var3.b(jh.ia.X0(false, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j11, sb4), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                            this.I1.setOnCloseListener(new jv(this, 13));
                            z13 = true;
                            str = null;
                            axVar = this.B3;
                            aVar = this.b;
                            if ((axVar != null && axVar.c()) || aVar.f) {
                                z13 = false;
                            }
                            this.F1.i(this.I1, z13, true);
                            q3(true);
                            if (this.fragmentView != null || this.F1 == null) {
                                aVar2 = aVar;
                            } else {
                                boolean z15 = !isInPreviewMode() && this.R2 == 0 && this.T2 == 0 && this.N0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((axVar3 = this.B3) == null || !axVar3.c()) && !aVar.f;
                                if (z15) {
                                    if (this.J1 == null) {
                                        org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(getParentActivity());
                                        this.J1 = paVar;
                                        this.F1.addView(paVar);
                                    }
                                    org.telegram.ui.Cells.pa paVar2 = this.J1;
                                    int i15 = this.currentAccount;
                                    TextView textView = paVar2.b;
                                    TextView textView2 = paVar2.c;
                                    ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList3 = MessagesController.getInstance(i15).getUnconfirmedAuthController().auths;
                                    org.telegram.ui.Cells.oa oaVar = paVar2.d;
                                    oaVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                                    oaVar.a(false, false);
                                    org.telegram.ui.Cells.oa oaVar2 = paVar2.e;
                                    oaVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                                    oaVar2.a(false, false);
                                    if (arrayList3 == null || arrayList3.size() != 1) {
                                        aVar2 = aVar;
                                        if (arrayList3 != null && arrayList3.size() > 1) {
                                            textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
                                            String str2 = arrayList3.get(0).location;
                                            int i16 = 1;
                                            while (true) {
                                                if (i16 >= arrayList3.size()) {
                                                    break;
                                                }
                                                if (!TextUtils.equals(str2, arrayList3.get(i16).location)) {
                                                    str2 = str;
                                                    break;
                                                }
                                                i16++;
                                            }
                                            if (str2 == null) {
                                                textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultiple", arrayList3.size(), new Object[0]));
                                            } else {
                                                textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultipleFrom", arrayList3.size(), str2));
                                            }
                                        }
                                        z14 = false;
                                    } else {
                                        UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList3.get(0);
                                        textView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
                                        String str3 = "" + unconfirmedAuth.device;
                                        if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str3.isEmpty()) {
                                            str3 = str3.concat(", ");
                                        }
                                        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str3);
                                        n10.append(unconfirmedAuth.location);
                                        String sb5 = n10.toString();
                                        if (unconfirmedAuth.bot) {
                                            int i17 = R.string.UnconfirmedAuthSingleBot;
                                            StringBuilder sb6 = new StringBuilder("@");
                                            aVar2 = aVar;
                                            sb6.append(DialogObject.getShortName(unconfirmedAuth.bot_id));
                                            textView2.setText(LocaleController.formatString(i17, sb6.toString(), sb5));
                                            z14 = true;
                                        } else {
                                            aVar2 = aVar;
                                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, sb5));
                                            z14 = false;
                                        }
                                    }
                                    oaVar.setOnClickListener(new org.telegram.ui.Cells.na(this, z14, i15, arrayList3));
                                    oaVar2.setOnClickListener(new bg.p2(paVar2, i15, arrayList3, 4));
                                } else {
                                    aVar2 = aVar;
                                }
                                org.telegram.ui.Cells.pa paVar3 = this.J1;
                                if (paVar3 != null) {
                                    this.F1.i(paVar3, z15, true);
                                }
                            }
                            if (this.fragmentView == null || this.F1 == null) {
                                return;
                            }
                            boolean z16 = !isInPreviewMode() && this.R2 == 0 && this.T2 == 0 && this.N0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((axVar2 = this.B3) == null || !axVar2.c()) && !aVar2.f;
                            if (z16 && this.H1 == null) {
                                org.telegram.ui.Cells.m mVar = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                                this.H1 = mVar;
                                this.F1.addView(mVar);
                            }
                            org.telegram.ui.Cells.m mVar2 = this.H1;
                            if (mVar2 != null) {
                                this.F1.i(mVar2, z16, true);
                                return;
                            }
                            return;
                        }
                        int i18 = 22;
                        if (this.R2 != 0 && this.T2 == j10 && !getMessagesController().premiumPurchaseBlocked() && BirthdayController.getInstance(this.currentAccount).contains() && !getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                            BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                            ArrayList<TLRPC.User> arrayList4 = state.today;
                            this.I1.setOnClickListener(new org.telegram.ui.Components.fi0(i18, this, state));
                            this.I1.a(this.currentAccount, arrayList4);
                            this.I1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList4.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList4.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList4.size(), new Object[0]), org.telegram.ui.ActionBar.g6.I6, 2, null), this.I1.c, new vv(this, 4)), LocaleController.formatString(arrayList4.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                            this.I1.setOnCloseListener(new jv(this, 14));
                            jh.s7.y(this.currentAccount, false).V();
                        } else if (this.R2 != 0 && this.T2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                            this.I1.setOnClickListener(new jv(this, 15));
                            this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.I1.c, new vv(this, 4)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                            this.I1.setOnCloseListener(new jv(this, 16));
                        } else {
                            int i19 = 20;
                            if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.R2 == 0 && this.T2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                                this.I1.setOnClickListener(new bg.n(i19));
                                this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                this.I1.setOnCloseListener(new jv(this, 17));
                            } else if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.R2 == 0 && this.T2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                this.I1.setOnClickListener(new jv(this, 18));
                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                            } else {
                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.R2 != 0 || this.T2 != j10 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) == null : BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null))) {
                                    z10 = false;
                                } else {
                                    this.w3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                    z10 = true;
                                }
                                if (z10) {
                                    this.I1.setOnClickListener(new jv(this, i19));
                                    this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.w3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(this.w3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                } else {
                                    if (this.K1 != null && this.L1 != null) {
                                        if (r0.longValue() / this.L1.longValue() < 0.3f) {
                                            MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                        } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j10)) {
                                            z11 = true;
                                            int i20 = 21;
                                            if (z11) {
                                                int i21 = 23;
                                                if (this.R2 == 0 && this.T2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                    this.I1.setOnClickListener(new jv(this, i18));
                                                    this.I1.h.setVisibility(0);
                                                    org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                                                    e9Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                    long clientUserId = getUserConfig().getClientUserId();
                                                    e9Var.A = true;
                                                    e9Var.b = true;
                                                    e9Var.c = false;
                                                    int i22 = org.telegram.ui.ActionBar.g6.p8[org.telegram.ui.Components.e9.e(clientUserId)];
                                                    org.telegram.ui.ActionBar.c6 c6Var = e9Var.z;
                                                    e9Var.d = org.telegram.ui.ActionBar.g6.v0(i22, c6Var);
                                                    e9Var.e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q8[org.telegram.ui.Components.e9.e(clientUserId)], c6Var);
                                                    e9Var.n = 0;
                                                    e9Var.m = false;
                                                    org.telegram.ui.Components.e9.a("", "", "", e9Var.q);
                                                    e9Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.I1.h.setImageDrawable(e9Var);
                                                    this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.I1.c, new vv(this, 4)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                    this.I1.setOnCloseListener(new jv(this, i21));
                                                } else {
                                                    if (this.R2 == 0 && this.T2 == 0 && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null) {
                                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                                        boolean[] zArr = new boolean[1];
                                                        if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                            z12 = true;
                                                        } else {
                                                            Iterator<String> it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                            while (it.hasNext()) {
                                                                next = it.next();
                                                                if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                    z12 = true;
                                                                    break;
                                                                }
                                                            }
                                                            z12 = false;
                                                        }
                                                        next = null;
                                                        if (z12) {
                                                            this.I1.setOnClickListener(new a(next, i20));
                                                            org.telegram.ui.Cells.x2 x2Var4 = this.I1;
                                                            CharSequence charSequence = charSequenceArr[0];
                                                            if (charSequence instanceof String) {
                                                                str = null;
                                                                charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                            } else {
                                                                str = null;
                                                            }
                                                            CharSequence charSequence2 = charSequenceArr[1];
                                                            if (charSequence2 instanceof String) {
                                                                charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                            }
                                                            x2Var4.b(charSequence, charSequence2);
                                                            if (zArr[0] && next != null) {
                                                                this.I1.setOnCloseListener(new org.telegram.ui.Components.fi0(i21, this, next));
                                                            }
                                                            z13 = true;
                                                            axVar = this.B3;
                                                            aVar = this.b;
                                                            if (axVar != null) {
                                                                z13 = false;
                                                                this.F1.i(this.I1, z13, true);
                                                                q3(true);
                                                                if (this.fragmentView != null) {
                                                                }
                                                                aVar2 = aVar;
                                                                if (this.fragmentView == null) {
                                                                    return;
                                                                } else {
                                                                    return;
                                                                }
                                                            }
                                                            z13 = false;
                                                            this.F1.i(this.I1, z13, true);
                                                            q3(true);
                                                            if (this.fragmentView != null) {
                                                            }
                                                            aVar2 = aVar;
                                                            if (this.fragmentView == null) {
                                                            }
                                                        }
                                                    }
                                                    str = null;
                                                }
                                            } else {
                                                this.I1.setOnClickListener(new jv(this, i20));
                                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                            }
                                        }
                                    }
                                    z11 = false;
                                    int i202 = 21;
                                    if (z11) {
                                    }
                                }
                            }
                        }
                        z13 = true;
                        str = null;
                        axVar = this.B3;
                        aVar = this.b;
                        if (axVar != null) {
                        }
                        z13 = false;
                        this.F1.i(this.I1, z13, true);
                        q3(true);
                        if (this.fragmentView != null) {
                        }
                        aVar2 = aVar;
                        if (this.fragmentView == null) {
                        }
                    } else if (!y8.A) {
                        y8.A = true;
                        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                        tL_getStarsSubscriptions.missing_balance = true;
                        tL_getStarsSubscriptions.offset = "";
                        ConnectionsManager.getInstance(y8.a).sendRequest(tL_getStarsSubscriptions, new jh.j6(y8, i10));
                    }
                }
                j10 = 0;
                int i182 = 22;
                if (this.R2 != 0) {
                }
                if (this.R2 != 0) {
                }
                int i192 = 20;
                if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.R2 == 0 && this.T2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                }
                z13 = true;
                str = null;
                axVar = this.B3;
                aVar = this.b;
                if (axVar != null) {
                }
                z13 = false;
                this.F1.i(this.I1, z13, true);
                q3(true);
                if (this.fragmentView != null) {
                }
                aVar2 = aVar;
                if (this.fragmentView == null) {
                }
            }
            str = null;
            z13 = true;
            axVar = this.B3;
            aVar = this.b;
            if (axVar != null) {
            }
            z13 = false;
            this.F1.i(this.I1, z13, true);
            q3(true);
            if (this.fragmentView != null) {
            }
            aVar2 = aVar;
            if (this.fragmentView == null) {
            }
        }
        z13 = false;
        axVar = this.B3;
        aVar = this.b;
        if (axVar != null) {
        }
        z13 = false;
        this.F1.i(this.I1, z13, true);
        q3(true);
        if (this.fragmentView != null) {
        }
        aVar2 = aVar;
        if (this.fragmentView == null) {
        }
    }

    public final float V3() {
        ax axVar = this.B3;
        if (axVar == null || !axVar.c()) {
            return 0.0f;
        }
        return this.B3.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        int i10;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        boolean z12;
        boolean z13;
        if (this.v0 == null || this.inPreviewMode || this.l3) {
            return;
        }
        ax axVar = this.B3;
        if (axVar != null && axVar.c()) {
            return;
        }
        org.telegram.ui.Components.j70 j70Var = this.H0;
        if (j70Var != null) {
            j70Var.u();
            this.H0 = null;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int size = dialogFilters.size();
        vd.a aVar = this.r;
        boolean z14 = true;
        if (size > 1) {
            if (z10 || this.v0.getVisibility() != 0) {
                boolean z15 = this.v0.getVisibility() != 0 ? false : z11;
                this.w = true;
                boolean isEmpty = this.v0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z16 = (this.isPaused || this.N3 != null) ? false : z11;
                    if (!this.l3) {
                        aVar.a(this.w, z16);
                    }
                }
                int currentTabId = this.v0.getCurrentTabId();
                int currentTabStableId = this.v0.getCurrentTabStableId();
                if (currentTabId == this.v0.getDefaultTabId() || currentTabId < dialogFilters.size()) {
                    z12 = false;
                } else {
                    this.v0.H = -1;
                    z12 = true;
                }
                ew ewVar = this.v0;
                ewVar.h.clear();
                ewVar.f0.clear();
                ewVar.h0.clear();
                ewVar.i0.clear();
                ewVar.j0.clear();
                ewVar.k0.clear();
                ewVar.I = 0;
                int size2 = dialogFilters.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (dialogFilters.get(i12).isDefault()) {
                        this.v0.a(i12, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i12).locked);
                    } else {
                        MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i12);
                        this.v0.a(i12, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i12).locked);
                    }
                }
                if (currentTabStableId >= 0) {
                    if (z12 && !this.v0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            ew ewVar2 = this.v0;
                            if (ewVar2.h(ewVar2.g0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = 0;
                        }
                    }
                    if (this.v0.g0.get(this.a0[0].h, -1) != currentTabStableId) {
                        this.a0[0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i13 = 0;
                while (true) {
                    ey[] eyVarArr = this.a0;
                    if (i13 >= eyVarArr.length) {
                        break;
                    }
                    if (eyVarArr[i13].h >= dialogFilters.size()) {
                        this.a0[i13].h = dialogFilters.size() - 1;
                    }
                    this.a0[i13].a.setScrollingTouchSlop(1);
                    i13++;
                }
                ew ewVar3 = this.v0;
                ewVar3.B.setItemAnimator(z15 ? ewVar3.o0 : null);
                ewVar3.E.l();
                if (isEmpty) {
                    R4(false);
                }
                ew ewVar4 = this.v0;
                int currentTabId2 = ewVar4.getCurrentTabId();
                ArrayList arrayList = ewVar4.h;
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        z13 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.c00) arrayList.get(i14)).a == currentTabId2) {
                            z13 = ((org.telegram.ui.Components.c00) arrayList.get(i14)).f;
                            break;
                        }
                        i14++;
                    }
                }
                if (z13) {
                    ew ewVar5 = this.v0;
                    ArrayList arrayList2 = ewVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        ewVar5.f((org.telegram.ui.Components.c00) arrayList2.get(0), 0);
                        T4(r52);
                        i10 = this.a0[r52].s;
                        if ((i10 != 7 || i10 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i10 - 7]) != null) {
                            i11 = 0;
                            while (true) {
                                if (i11 >= dialogFilters.size()) {
                                    z14 = false;
                                    break;
                                }
                                MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i11);
                                if (dialogFilter3 != null && dialogFilter3.id == dialogFilter.id) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            if (z14) {
                                return;
                            }
                            R4(false);
                            return;
                        }
                        return;
                    }
                }
            }
            r52 = 0;
            T4(r52);
            i10 = this.a0[r52].s;
            if (i10 != 7) {
            }
            i11 = 0;
            while (true) {
                if (i11 >= dialogFilters.size()) {
                }
                i11++;
            }
            if (z14) {
            }
        } else {
            r52 = 0;
            if (this.v0.getVisibility() != 8) {
                this.v0.setIsEditing(false);
                I4(false);
                this.i3 = false;
                if (this.h3) {
                    this.h3 = false;
                    this.a0[0].setTranslationX(0.0f);
                    this.a0[1].setTranslationX(r2[0].getMeasuredWidth());
                }
                if (this.a0[0].h != this.v0.getDefaultTabId()) {
                    this.a0[0].h = this.v0.getDefaultTabId();
                    nw nwVar = this.a0[0].d;
                    nwVar.h = 0;
                    nwVar.l();
                    ey eyVar = this.a0[0];
                    eyVar.s = this.N0;
                    eyVar.d.l();
                }
                this.a0[1].setVisibility(8);
                ey eyVar2 = this.a0[1];
                eyVar2.h = 0;
                nw nwVar2 = eyVar2.d;
                nwVar2.h = 0;
                nwVar2.l();
                ey eyVar3 = this.a0[1];
                eyVar3.s = this.N0;
                eyVar3.d.l();
                this.w = false;
                if (this.fragmentView != null) {
                    boolean z17 = (this.isPaused || this.N3 != null) ? false : z11;
                    if (!this.l3) {
                        aVar.a(false, z17);
                    }
                }
                int i15 = 0;
                while (true) {
                    ey[] eyVarArr2 = this.a0;
                    if (i15 >= eyVarArr2.length) {
                        break;
                    }
                    ey eyVar4 = eyVarArr2[i15];
                    if (eyVar4.s == 0 && eyVar4.v == 2 && Z3() && ((L0 = this.a0[i15].c.L0()) == 0 || L0 == 1)) {
                        this.a0[i15].c.h1(1, (int) this.J);
                    }
                    this.a0[i15].a.setScrollingTouchSlop(0);
                    this.a0[i15].a.requestLayout();
                    this.a0[i15].requestLayout();
                    i15++;
                }
                this.v0.H = -1;
                r52 = 0;
            }
            T4(r52);
            i10 = this.a0[r52].s;
            if (i10 != 7) {
            }
            i11 = 0;
            while (true) {
                if (i11 >= dialogFilters.size()) {
                }
                i11++;
            }
            if (z14) {
            }
        }
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.b.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W4(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        ox oxVar;
        boolean z13;
        org.telegram.ui.Components.y71 y71Var;
        if (!this.l3 || this.h2 || (oxVar = this.y0) == null) {
            return;
        }
        ArrayList<rf.f0> currentSearchFilters = oxVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i10 = 0; i10 < currentSearchFilters.size(); i10++) {
            if (currentSearchFilters.get(i10).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i10).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i10).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i10).d == 7) {
                z14 = true;
            }
        }
        if (z14) {
            z11 = false;
        }
        boolean z18 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z11;
        if ((z15 || z18 || !z10) && z18) {
            if (arrayList == null || arrayList.isEmpty() || z16) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z17) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z11) {
                this.X.A1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.X.A1(null, null, false);
                }
                if (!z12) {
                    this.X.getAdapter().l();
                }
                y71Var = this.W;
                if (y71Var != null) {
                    y71Var.b(z13, true);
                }
                this.X.setEnabled(z13);
                this.s.a(z13, true);
            }
        }
        z13 = false;
        if (!z13) {
        }
        if (!z12) {
        }
        y71Var = this.W;
        if (y71Var != null) {
        }
        this.X.setEnabled(z13);
        this.s.a(z13, true);
    }

    public final lh.s6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f9 = (((-this.c4) - this.f4) - this.q1) - this.r1;
        org.telegram.ui.Components.u10 u10Var = this.p0;
        if (u10Var != null) {
            u10Var.setTranslationY(f9);
        }
        org.telegram.ui.Components.u10 u10Var2 = this.q0;
        if (u10Var2 != null) {
            u10Var2.setTranslationY(f9 - AndroidUtilities.dp(52.0f));
            nh.t3 t3Var = this.l0;
            if (t3Var != null) {
                t3Var.setTranslationY(f9 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.u0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            xx xxVar = (xx) this.fragmentView;
            xxVar.removeView(undoViewArr[0]);
            xxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11 = this.h2;
        boolean z12 = (!z11 || this.N0 == 10) && this.R2 == 0 && this.T2 == 0 && !this.inPreviewMode && (!this.f2 || z11) && !this.Q3;
        org.telegram.ui.Components.u10 u10Var = this.p0;
        if (u10Var != null) {
            u10Var.e(z12, z10);
        }
        org.telegram.ui.Components.u10 u10Var2 = this.q0;
        if (u10Var2 != null) {
            u10Var2.e(z12, z10);
        }
    }

    public final boolean Z3() {
        return !this.h2 && this.N0 == 0 && this.T2 == 0 && this.R2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void Z4(boolean z10, boolean z11) {
        boolean z12;
        if (this.j0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.i0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= getDownloadController().downloadingFiles.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i10).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (getDownloadController().hasUnviewedDownloads() || z12 || (this.c0.getVisibility() == 0 && this.c0.getAlpha() == 1.0f && !z11)) {
                    this.e0 = true;
                } else {
                    this.e0 = false;
                }
                x3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.Z1;
                boolean z14 = i11 == 3 || i11 == 5;
                this.k0.setSubtext(LocaleController.getString(z13 ? z14 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.j0.b(z13, z14, z10);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.z2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void a5() {
        org.telegram.ui.Components.iq0 iq0Var;
        qw qwVar = this.x1;
        ArrayList arrayList = this.E2;
        if (qwVar == null) {
            if (this.N0 == 10) {
                c4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        b5();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.N0 == 3 && this.b2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.M3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.jr.h);
            }
            if (this.x1.getTag() != null) {
                this.x1.n0(false, false, false);
                this.x1.P();
                this.x1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.x1.getTag() == null) {
                if (!a4() && this.A2 == null) {
                    this.x1.setFieldText("");
                }
                this.x1.setTag(1);
                if (!this.S3 && (iq0Var = this.C2) != null) {
                    this.S3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    iq0Var.j();
                    iq0Var.B = string2;
                    org.telegram.ui.Components.gq0 gq0Var = iq0Var.a[0];
                    if (string2 != null) {
                        gq0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.xb0 xb0Var = new org.telegram.ui.Components.xb0(iq0Var, 29);
                    iq0Var.C = xb0Var;
                    AndroidUtilities.runOnUIThread(xb0Var, 1000L);
                }
            }
            this.y1.g(Math.max(1, arrayList.size()), true);
            int i10 = this.O0 + (!TextUtils.isEmpty(this.x1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            long j10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long longValue = ((Long) obj).longValue();
                long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                if (sendPaidMessagesStars <= 0 && longValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                }
                j10 += sendPaidMessagesStars;
            }
            this.y1.i(i10, j10, true);
            this.x1.R1();
            if (this.M3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.jr.h);
            }
        }
        this.M3 = arrayList.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b4(boolean z10) {
        boolean z11;
        this.actionBar.r();
        this.E2.clear();
        org.telegram.ui.ActionBar.h2 h2Var = this.a1;
        int i10 = 1;
        if (h2Var != null) {
            h2Var.c(0.0f, true);
        }
        ew ewVar = this.v0;
        if (ewVar != null) {
            ewVar.b(org.telegram.ui.ActionBar.g6.K8, org.telegram.ui.ActionBar.g6.I8, org.telegram.ui.ActionBar.g6.J8, org.telegram.ui.ActionBar.g6.L8, org.telegram.ui.ActionBar.g6.d6);
        }
        ValueAnimator valueAnimator = this.q3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q3 = null;
        }
        if (this.p3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ey[] eyVarArr = this.a0;
            if (i12 >= eyVarArr.length) {
                break;
            }
            ey eyVar = eyVarArr[i12];
            if (eyVar != null) {
                eyVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.G ? 81 : 0) + 48) + this.J);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p3, 0.0f);
        this.q3 = ofFloat;
        ofFloat.addUpdateListener(new lv(this, max, i10));
        this.q3.addListener(new ix(this, max, i11));
        this.q3.setInterpolator(org.telegram.ui.Components.jr.f);
        this.q3.setDuration(200L);
        this.q3.start();
        this.U0 = false;
        ArrayList arrayList = this.W0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                p00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i13++;
                arrayList = arrayList;
                size = size;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.V0) {
            getMessagesController().reorderPinnedDialogs(this.R2, null, 0L);
            z11 = 0;
            this.V0 = false;
        } else {
            z11 = 0;
        }
        T4(true);
        if (this.a0 != null) {
            int i14 = 0;
            while (true) {
                ey[] eyVarArr2 = this.a0;
                if (i14 >= eyVarArr2.length) {
                    break;
                }
                eyVarArr2[i14].d.D = z11;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i16 = z11;
        if (z10) {
            i16 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i16 | i15, true);
    }

    public final void b5() {
        org.telegram.ui.Components.iq0 iq0Var = this.C2;
        if (iq0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        iq0Var.h(i10);
        iq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = iq0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.E2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.gq0 gq0Var = iq0Var.a[0];
        if (iq0Var.b == 1) {
            gq0Var.d.l(iq0Var.c(gq0Var), false);
        }
    }

    public final void c4(boolean z10) {
        if (this.B3.c()) {
            z10 = true;
        }
        if (z10 && this.X1) {
            return;
        }
        this.Q3 = z10;
        Y4(true);
        if (z10) {
            nh.t3 t3Var = this.l0;
            if (t3Var != null) {
                t3Var.e(true);
            }
            nh.t3 t3Var2 = this.m0;
            if (t3Var2 != null) {
                t3Var2.e(true);
            }
        }
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.h0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z11 = false;
                break;
            }
            MessageObject messageObject = arrayList.get(i10);
            i10++;
            MessageObject messageObject2 = messageObject;
            if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject4 = messageObject3;
            if (messageObject4.getDocument() != null && messageObject4.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        ew ewVar;
        if (this.B3.c()) {
            return false;
        }
        return this.N0 != 3 || (ewVar = this.v0) == null || ewVar.getVisibility() != 0 || this.v0.G <= 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean closeLastFragment() {
        if (!this.B3.c()) {
            return super.closeLastFragment();
        }
        this.B3.a();
        ox oxVar = this.y0;
        if (oxVar == null) {
            return true;
        }
        oxVar.R();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        cg.m1 m1Var = new cg.m1(this, context, this.resourceProvider, 4);
        m1Var.setAllowOverlayTitle(true);
        m1Var.K();
        m1Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.t8), false);
        m1Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.z8), true);
        m1Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.v8), false);
        m1Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.y8), true);
        m1Var.k();
        m1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        m1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.R2 == 0 || e4())) {
            return m1Var;
        }
        m1Var.setOccupyStatusBar(false);
        return m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e0c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0cd6  */
    /* JADX WARN: Type inference failed for: r0v101, types: [org.telegram.ui.ActionBar.l] */
    /* JADX WARN: Type inference failed for: r0v181, types: [org.telegram.ui.Components.jl0, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r0v28, types: [sg.f] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v19, types: [ig.f, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v205, types: [org.telegram.ui.Components.jl0, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r3v206, types: [org.telegram.ui.Components.jl0, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r3v207, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r3v211, types: [org.telegram.ui.Components.jl0, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r3v212, types: [org.telegram.ui.Components.jl0, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r3v214, types: [f2.j0, org.telegram.ui.jw] */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.telegram.ui.ActionBar.l] */
    /* JADX WARN: Type inference failed for: r3v321, types: [android.view.ViewGroup, org.telegram.ui.ActionBar.w0] */
    /* JADX WARN: Type inference failed for: r3v60, types: [lg.a] */
    /* JADX WARN: Type inference failed for: r4v69, types: [org.telegram.ui.Components.jl0, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.ui.wv] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v23, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f9;
        int i10;
        tn tnVar;
        ew ewVar;
        ux uxVar;
        ux uxVar2;
        org.telegram.ui.Components.fs fsVar;
        dy dyVar;
        f2.e0 e0Var;
        rf.l lVar;
        rf.l lVar2;
        long j10;
        rf.l lVar3;
        rf.l lVar4;
        rf.l lVar5;
        rf.l lVar6;
        yx yxVar;
        int i11;
        int i12;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r9;
        Context context2 = context;
        ?? r11 = 0;
        this.f2 = false;
        this.g2 = false;
        this.R = false;
        this.R0 = null;
        this.v0 = null;
        ArrayList arrayList = this.E2;
        arrayList.clear();
        this.g3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        AndroidUtilities.runOnUIThread(new dv(context2, 0));
        this.J1 = null;
        this.H1 = null;
        this.I1 = null;
        this.M1 = null;
        this.F1 = null;
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        this.f0 = a2;
        a2.setOnClickListener(new jv(this, 1));
        int i13 = 8;
        if (this.N0 == 2 || (e4() && R3(this.currentAccount, this.N0, this.R2, false).isEmpty())) {
            this.f0.setVisibility(8);
        }
        this.f0.setVisibility(8);
        ?? r82 = 1;
        if (!this.h2 && this.j2 == null && this.R2 == 0 && this.T2 == 0) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context2, getThemedColor(org.telegram.ui.ActionBar.g6.t8), getThemedColor(org.telegram.ui.ActionBar.g6.v8), true);
            this.i0 = w0Var;
            w0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.i0, i7.f6.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.i0.setOnClickListener(new jv(this, 8));
            this.i0.setAlpha(0.0f);
            this.i0.setVisibility(8);
            this.j0 = new org.telegram.ui.Components.bi0(context2);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(context2, this.resourceProvider, false, true);
            this.k0 = g1Var;
            g1Var.setItemHeight(56);
            this.k0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.j0);
            this.k0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, R.drawable.outline_header_lock_24);
            this.b0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            ?? d = n10.d(3, new ColorDrawable(0));
            this.c0 = d;
            hy hyVar = new hy(context2, this.currentAccount);
            this.d0 = hyVar;
            d.addView(hyVar);
            this.c0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.c0.setVisibility(8);
            Z4(false, false);
        }
        ux uxVar3 = new ux(context2, this.resourceProvider);
        this.T = uxVar3;
        long j11 = 0;
        uxVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.T.setPivotX(0.0f);
        this.T.setPivotY(0.0f);
        if (this.N0 == 0) {
            org.telegram.ui.ActionBar.w0 a11 = n10.a(-47, R.drawable.avd_speed);
            this.h0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.h0.setOnClickListener(new jv(this, 9));
            this.T.a(this.h0);
            this.T.e();
        }
        this.T.setCloseButtonOnClickListener(new ev(this, 29));
        this.T.r.setOnFocusChangeListener(new kd(this, 1));
        ?? r32 = this.T.r;
        jf.n0 n0Var = new jf.n0(r32, new vx(this));
        this.U = n0Var;
        r32.addTextChangedListener(n0Var);
        this.T.setSearchFiltersListener(new kx(this, 5));
        this.U.a();
        if (this.N0 == 0) {
            org.telegram.ui.ActionBar.w0 a12 = n10.a(4, R.drawable.ic_ab_other);
            this.g0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.g0.setOnClickListener(new jv(this, 10));
            this.g0.setOnLongClickListener(new rv(this, 3));
        }
        this.f0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.h2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i14 = this.N0;
            if (i14 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.J0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.K0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i14 == 3 && this.b2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i14 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i14 == 14) {
                boolean z10 = this.w2;
                if (!z10 || this.v2 || this.r2 || this.u2) {
                    boolean z11 = this.v2;
                    if (!z11 || z10 || this.r2 || this.u2) {
                        boolean z12 = this.r2;
                        if (z12 && !z11 && !z10 && !this.u2) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                        } else if (!this.u2 || z11 || z10 || z12) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                        } else {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                        }
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    }
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.C;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                }
            }
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        } else {
            if (this.j2 != null || this.R2 != 0 || this.T2 != 0) {
                ?? r33 = this.actionBar;
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
                this.a1 = h2Var;
                r33.setBackButtonDrawable(h2Var);
            }
            if (this.R2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.T2 != 0) {
                this.actionBar.setTitle(DialogObject.getName(this.U2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.X2 = new org.telegram.ui.Components.e9(this.U2);
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getContext());
                this.W2 = t9Var;
                t9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.W2.e(this.U2, this.X2);
                this.actionBar.addView(this.W2, i7.f6.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(26.0f), null);
                this.z3 = n5Var;
                n5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.y3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.y3.getIntrinsicWidth(), this.y3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.y3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.gl), PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.y3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.H(spannableStringBuilder, this.z3);
                d5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.R2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new vv(this, 0));
        int i15 = this.N0;
        if (((i15 == 0 && !this.h2) || i15 == 3) && this.R2 == 0 && this.T2 == 0 && TextUtils.isEmpty(this.j2)) {
            ew ewVar2 = new ew(this, context2, this.resourceProvider);
            this.v0 = ewVar2;
            ewVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.v0.setDelegate(new fw(context2, this));
        }
        int i16 = 17;
        if (this.n2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.z1 = n10.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9();
            e9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context2);
            t9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.z1.addView(t9Var2, i7.f6.e(36, 36, 17));
            this.z1.setOnClickListener(new jv(this, 11));
            this.z1.setOnLongClickListener(new rv(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            e9Var.m(this.currentAccount, currentUser);
            t9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            t9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r9 = userProfilePhoto.strippedBitmap) == null) ? e9Var : r9, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new gw(this));
        final xx xxVar = new xx(context2, this);
        this.fragmentView = xxVar;
        sg.i iVar = new sg.i(xxVar);
        this.g4 = iVar;
        lg.a aVar = this.l4;
        aVar.f(iVar, xxVar);
        sg.i iVar2 = this.g4;
        lg.a aVar2 = this.n4;
        aVar2.f(iVar2, xxVar);
        sg.i iVar3 = this.g4;
        lg.a aVar3 = this.o4;
        aVar3.f(iVar3, xxVar);
        this.m4.f(this.g4, xxVar);
        final PointF pointF = new PointF();
        this.p4 = new mg.a() { // from class: org.telegram.ui.wv
            @Override // mg.a
            public final void e(Canvas canvas, RectF rectF) {
                fy fyVar = fy.this;
                ox oxVar = fyVar.y0;
                int alpha = oxVar != null ? (int) (oxVar.getAlpha() * 255.0f) : 0;
                ey[] eyVarArr = fyVar.a0;
                int length = eyVarArr.length;
                int i17 = 0;
                while (true) {
                    xx xxVar2 = xxVar;
                    if (i17 >= length) {
                        ox oxVar2 = fyVar.y0;
                        if (oxVar2 == null || oxVar2.getVisibility() != 0 || fyVar.y0.getAlpha() <= 0.0f) {
                            return;
                        }
                        ox oxVar3 = fyVar.y0;
                        rg.c.a(oxVar3, canvas, rectF, oxVar3, xxVar2, alpha);
                        return;
                    }
                    ey eyVar = eyVarArr[i17];
                    if (eyVar != null && eyVar.getVisibility() == 0 && eyVar.getAlpha() > 0.0f) {
                        float V3 = fyVar.V3();
                        if (eyVar.B == null || V3 <= 0.0f) {
                            ay ayVar = eyVar.a;
                            rg.c.a(ayVar, canvas, rectF, ayVar, xxVar2, 255 - alpha);
                        } else {
                            ay ayVar2 = eyVar.a;
                            PointF pointF2 = pointF;
                            if (!sg.i.b(ayVar2, xxVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            eyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i17++;
                }
            }

            @Override // mg.a
            public final void g(g.x xVar, RectF rectF) {
                xVar.b = true;
            }
        };
        int i17 = (this.R2 == 0 && this.T2 == 0 && (((i12 = this.N0) == 0 && !this.h2) || i12 == 3)) ? 2 : 1;
        this.a0 = new ey[i17];
        int i18 = 0;
        while (i18 < i17) {
            lg.a aVar4 = aVar3;
            ey eyVar = new ey(context2, this);
            xxVar.addView(eyVar, i7.f6.c(-1.0f, -1));
            eyVar.s = this.N0;
            this.a0[i18] = eyVar;
            eyVar.w = new org.telegram.ui.Components.p00(context2);
            eyVar.w.setViewType(7);
            eyVar.w.setVisibility(i13);
            eyVar.addView(eyVar.w, i7.f6.e(-2, -2, i16));
            ay ayVar = new ay(this, context2, eyVar);
            eyVar.a = ayVar;
            ayVar.C0(new org.telegram.ui.Components.voip.o(9, this, eyVar));
            ?? r42 = eyVar.a;
            eyVar.b = new ag.j2((org.telegram.ui.Components.jl0) r42);
            r42.setAllowStopHeaveOperations(r82);
            eyVar.a.setAccessibilityEnabled(r11);
            eyVar.a.m1(r11, r82);
            eyVar.a.setClipToPadding(r11);
            eyVar.a.setPivotY(0.0f);
            if (this.N0 == 15) {
                eyVar.a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
            }
            eyVar.x = new hw(eyVar.a, eyVar);
            eyVar.a.setVerticalScrollBarEnabled(r82);
            eyVar.a.setInstantClick(r82);
            eyVar.c = new jw(this, eyVar);
            eyVar.c.j1(r82);
            eyVar.a.setLayoutManager(eyVar.c);
            eyVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            eyVar.addView(eyVar.a, i7.f6.c(-1.0f, -1));
            eyVar.a.setOnItemClickListener(new xr(6, this, eyVar));
            eyVar.a.setOnItemLongClickListener(new oc.i(this, eyVar, false, 9));
            eyVar.f = new dy(this, eyVar);
            eyVar.y = new org.telegram.ui.Components.pk0(eyVar.a, r11);
            dyVar = eyVar.f;
            eyVar.e = new f2.e0(dyVar);
            e0Var = eyVar.e;
            e0Var.d(eyVar.a);
            eyVar.a.setOnScrollListener(new lw(this, eyVar, xxVar));
            eyVar.v = SharedConfig.archiveHidden ? 2 : 0;
            if (eyVar.n == null && this.R2 == 0 && this.T2 == j11) {
                eyVar.n = new mw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), eyVar);
                if (Z3()) {
                    eyVar.n.h();
                } else {
                    eyVar.n.b();
                }
                mw mwVar = eyVar.n;
                i11 = eyVar.v;
                mwVar.g(i11 != 0);
            }
            xx xxVar2 = xxVar;
            lg.a aVar5 = aVar;
            lg.a aVar6 = aVar2;
            context2 = context;
            eyVar.d = new nw(this, this, context, eyVar.s, this.R2, this.h2, arrayList, this.currentAccount, this.C, eyVar);
            lVar = eyVar.d;
            lVar.R(eyVar.a);
            lVar2 = eyVar.d;
            lVar2.P(this.p2);
            if (eyVar.s == 3) {
                lVar6 = eyVar.d;
                lVar6.M(getMessagesController().storiesEnabled() && (yxVar = this.y2) != null && yxVar.C());
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.l2;
                j10 = 0;
                if (topicKey.dialogId != 0) {
                    lVar5 = eyVar.d;
                    lVar5.Q(topicKey.dialogId);
                }
            } else {
                j10 = 0;
            }
            lVar3 = eyVar.d;
            lVar3.N(eyVar.n);
            ay ayVar2 = eyVar.a;
            lVar4 = eyVar.d;
            ayVar2.setAdapter(lVar4);
            eyVar.a.setEmptyView((this.R2 == 0 && this.T2 == j10) ? eyVar.w : null);
            eyVar.r = new c2.z(eyVar.a, eyVar.c);
            c2.z zVar = eyVar.r;
            zVar.c = true;
            zVar.d = true;
            zVar.h = new kv(this, 10);
            if (i18 != 0) {
                this.a0[i18].setVisibility(8);
            }
            i18++;
            j11 = j10;
            xxVar = xxVar2;
            aVar3 = aVar4;
            aVar = aVar5;
            aVar2 = aVar6;
            r82 = 1;
            r11 = 0;
            i16 = 17;
            i13 = 8;
        }
        xx xxVar3 = xxVar;
        lg.a aVar7 = aVar;
        lg.a aVar8 = aVar2;
        lg.a aVar9 = aVar3;
        long j12 = j11;
        org.telegram.ui.Components.es esVar = new org.telegram.ui.Components.es(context2);
        this.G1 = esVar;
        int i19 = org.telegram.ui.ActionBar.g6.d6;
        esVar.setColor(org.telegram.ui.ActionBar.g6.u0(i19));
        xxVar3.addView(this.G1, i7.f6.e(-1, 100, 48));
        this.x0 = xxVar3.getChildCount();
        p31 p31Var = new p31((Activity) getContext());
        this.V = p31Var;
        p31Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        xxVar3.addView(this.V, i7.f6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        ng.d b10 = aVar8.b(this.V, pg.a.m(this.resourceProvider));
        b10.p(AndroidUtilities.dp(18.0f));
        b10.o(AndroidUtilities.dp(6.666f));
        this.V.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.V.setBlurredBackground(b10);
        rf.h0 h0Var = new rf.h0(getParentActivity(), null);
        this.X = h0Var;
        h0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        rf.h0 h0Var2 = this.X;
        h0Var2.W2 = false;
        h0Var2.setOnItemClickListener(new ov(this, 1));
        this.V.addView(this.X, i7.f6.e(-1, -1, 48));
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context2, this.resourceProvider, true);
        this.q0 = u10Var;
        u10Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.q0.setImageResource(R.drawable.outline_fab_story_24);
        this.q0.setOnClickListener(new jv(this, 27));
        xxVar3.addView(this.q0, org.telegram.ui.Components.u10.c());
        org.telegram.ui.Components.u10 u10Var2 = new org.telegram.ui.Components.u10(context2, this.resourceProvider);
        this.p0 = u10Var2;
        xxVar3.addView(u10Var2, org.telegram.ui.Components.u10.b());
        this.p0.setOnClickListener(new jv(this, 28));
        if (!e4() && this.N0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", true)) {
            nh.t3 t3Var = new nh.t3(context2, 2);
            t3Var.r(8.0f);
            t3Var.d = 8000L;
            t3Var.i();
            t3Var.o();
            t3Var.q(true);
            t3Var.t(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), nh.gb.n(context2)));
            t3Var.m(1.0f, -40.0f);
            t3Var.h(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
            t3Var.h0 = new vv(this, 11);
            this.l0 = t3Var;
            xxVar3.addView(t3Var, i7.f6.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        e5();
        this.W = null;
        if (this.h2 || this.N0 != 0) {
            f9 = 72.0f;
            if (this.N0 == 3 || I3()) {
                sg.f fVar = new sg.f(context2);
                this.u1 = fVar;
                fVar.setClipChildren(false);
                ?? r02 = this.u1;
                ah.i iVar4 = this.v;
                r02.setWindowInsetsProvider(iVar4);
                sg.f fVar2 = this.u1;
                fVar2.setInputIslandBubbleDrawable(aVar8.b(fVar2, pg.a.m(this.resourceProvider)));
                sg.f fVar3 = this.u1;
                fVar3.setUnderKeyboardBackgroundDrawable(aVar7.b(fVar3, pg.a.m(this.resourceProvider)));
                lg.b bVar = new lg.b(aVar9.b(this.u1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    bVar.b(AndroidUtilities.dp(72.0f), true);
                }
                this.u1.setBackgroundWithFadeDrawable(bVar);
                FrameLayout inputIslandBubbleContainer = this.u1.getInputIslandBubbleContainer();
                this.v1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.w1 = this.u1.getInAppKeyboardBubbleContainer();
                qw qwVar = this.x1;
                if (qwVar != null) {
                    qwVar.B0();
                }
                qw qwVar2 = new qw(this, getParentActivity(), xxVar3);
                this.x1 = qwVar2;
                qwVar2.setInAppInsetsController(iVar4);
                this.x1.t4 = false;
                xxVar3.setClipChildren(false);
                xxVar3.setClipToPadding(false);
                qw qwVar3 = this.x1;
                qwVar3.s4 = false;
                qwVar3.d2 = !AndroidUtilities.isInMultiwindow && ((tnVar = qwVar3.K2) == null || !tnVar.isInBubbleMode());
                this.x1.U0(false, false);
                this.x1.g1(true, false);
                this.x1.u1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.x1.getSendButton().setAlpha(0.0f);
                this.x1.setViewParentForEmoji(this.w1);
                this.v1.addView(this.x1, i7.f6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                xxVar3.addView(this.u1.getFadeView(), i7.f6.c(-1.0f, -1));
                xxVar3.addView(this.u1, i7.f6.c(-1.0f, -1));
                if (a4() || this.A2 != null || this.B2 != null) {
                    l3(this.R3);
                    this.R3 = null;
                }
                this.x1.setDelegate(new rw(this));
                i10 = -1;
                org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0((NotificationCenter.NotificationCenterDelegate) this, context2, R.drawable.send_plane_24, this.resourceProvider, 1);
                this.y1 = hp0Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                hp0Var.E = dp;
                hp0Var.F = dp2;
                org.telegram.ui.Components.hp0 hp0Var2 = this.y1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                hp0Var2.I = dp3;
                hp0Var2.J = dp4;
                org.telegram.ui.Components.hp0 hp0Var3 = this.y1;
                hp0Var3.d0 = true;
                xxVar3.addView(hp0Var3, i7.f6.e(110, 50, 85));
                this.y1.setScrimViewBackgroundColor(getThemedColor(i19));
                this.y1.setOnClickListener(new jv(this, 5));
                this.y1.setOnLongClickListener(new rv(this, 1));
                this.y1.setVisibility(8);
                this.y1.setScaleX(0.2f);
                this.y1.setScaleY(0.2f);
                this.y1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.A1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                ewVar = this.v0;
                if (ewVar != null) {
                    ng.d b11 = aVar8.b(ewVar, pg.a.m(this.resourceProvider));
                    b11.p(AndroidUtilities.dp(18.0f));
                    b11.o(AndroidUtilities.dp(6.666f));
                    this.v0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.v0.setBlurredBackground(b11);
                    xxVar3.addView(this.v0, i7.f6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                uxVar = this.T;
                if (uxVar != null) {
                    uxVar.setupBlurredBackground(aVar8.b(uxVar, pg.a.m(this.resourceProvider)));
                }
                xw xwVar = new xw(this, context, this, this.currentAccount, e4() ? 1 : 0);
                this.A0 = xwVar;
                xwVar.setActionBar(this.actionBar);
                this.A0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                xw xwVar2 = this.A0;
                xwVar2.h0 = false;
                xwVar2.setVisibility(8);
                this.I = false;
                this.H = false;
                this.G = false;
                if (this.h2 && this.N0 == 3) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
                }
                xxVar3.addView(this.actionBar, i7.f6.c(-2.0f, i10));
                if (!this.h2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.A3 = oVar;
                    xxVar3.addView(oVar, i7.f6.e(20, 20, 51));
                }
                uxVar2 = this.T;
                if (uxVar2 != null) {
                    xxVar3.addView(uxVar2, i7.f6.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.t0 = xxVar3.getChildCount();
                UndoView[] undoViewArr = this.u0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.S) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.gl));
                }
                if (this.R2 == 0 || this.T2 != j12) {
                    this.a0[0].a.setGlowColor(getThemedColor(i19));
                    this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.O8), false);
                    this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.N8), false);
                    this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.g6.Q8), false);
                    this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.g6.R8), true);
                }
                if (!this.h2 && this.N0 == 0) {
                    cg.h0 h0Var3 = new cg.h0(this, context, 25);
                    this.G0 = h0Var3;
                    if (Build.VERSION.SDK_INT >= 23) {
                        h0Var3.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i19), 100)));
                    }
                    this.G0.setFocusable(false);
                    this.G0.setImportantForAccessibility(2);
                    this.G0.setOnClickListener(new jv(this, 7));
                    this.G0.setVisibility(8);
                    xxVar3.addView(this.G0, i7.f6.c(-1.0f, i10));
                }
                this.b1.setColor(getThemedColor(i19));
                this.l3 = false;
                if (this.j2 == null) {
                    O4(true, false, false, false);
                    this.T.r.setText(this.j2);
                    this.T.r.setSelection(this.j2.length());
                } else if (this.k2 != null) {
                    O4(true, false, false, true);
                    this.T.r.setText(this.k2);
                    this.T.r.setSelection(this.k2.length());
                    this.k2 = null;
                    ux uxVar4 = this.T;
                    if (uxVar4 != null) {
                        uxVar4.setTranslationY(W3() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    O4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(xxVar3);
                this.B3 = new ax(this, context, xxVar3, context);
                V4(true, false);
                this.B3.setOpenProgress(0.0f);
                xxVar3.addView(this.A0, i7.f6.c(81.0f, i10));
                xxVar3.addView(this.B3, i7.f6.c(-1.0f, i10));
                this.B0 = new org.telegram.ui.Components.ds(context);
                fsVar = this.F1;
                if (fsVar != null) {
                    xxVar3.addView(fsVar, i7.f6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.T2 != j12 && this.N0 != 3 && ChatObject.canAddChatToCommunity(this.U2)) {
                    org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(iqVar, 0, 1, 33);
                    nh.d dVar = new nh.d(context, this.resourceProvider);
                    this.r0 = dVar;
                    dVar.e();
                    this.r0.setText(spannableStringBuilder2);
                    this.r0.setOnClickListener(new org.telegram.ui.Components.fi0(19, this, new org.telegram.ui.ActionBar.c2[1]));
                    ug.f fVar4 = new ug.f(getContext());
                    this.s0 = fVar4;
                    fVar4.setupColorKey(org.telegram.ui.ActionBar.g6.a7);
                    this.s0.setFadeZoneBottom(AndroidUtilities.dp(f9) + AndroidUtilities.navigationBarHeight);
                    this.s0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    xxVar3.addView(this.s0, i7.f6.g());
                    xxVar3.addView(this.r0, i7.f6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
                }
                f5(false);
                Y4(false);
                F3();
                C3();
                E3();
                D3();
                B3();
                v3();
                this.T.setBlurredBackgroundVisibility(this.b.e);
                r0.j0.m(this.fragmentView, new kv(this, 7));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.fs fsVar2 = new org.telegram.ui.Components.fs(context2);
            this.F1 = fsVar2;
            fsVar2.setOnAnimatedHeightChangedListener(new ev(this, 5));
            ng.d a13 = aVar8.a(this.F1);
            a13.n(pg.a.m(this.resourceProvider));
            a13.o(AndroidUtilities.dp(7.0f));
            f9 = 72.0f;
            this.F1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            this.F1.setBlurredBackground(a13);
            this.F1.setDefaultRadiusDp(this.T2 != j12 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.C1 = frameLayout;
            this.F1.addView(frameLayout);
            this.F1.h(5, this.C1);
            this.F1.g(this.C1);
            this.F1.i(this.C1, true, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.E1 = frameLayout2;
            this.F1.addView(frameLayout2);
            this.F1.h(4, this.E1);
            this.F1.g(this.E1);
            this.F1.i(this.E1, true, false);
            pw pwVar = new pw(this, context2, this, 0);
            this.B1 = pwVar;
            this.C1.addView(pwVar);
            pw pwVar2 = new pw(this, context2, this, 1);
            this.D1 = pwVar2;
            this.E1.addView(pwVar2);
            this.F1.setCallFragmentContextView(this.D1);
            org.telegram.ui.Cells.x2 x2Var = new org.telegram.ui.Cells.x2(context2);
            this.I1 = x2Var;
            x2Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            U4();
            x6.j0(new mv(this, 0));
            x6.p0(new b5(this, 11));
            this.F1.addView(this.I1);
            if (this.T2 != j12) {
                rh.i iVar5 = new rh.i(context2, this.resourceProvider, true);
                this.M1 = iVar5;
                iVar5.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.M1.setUnreadMode(true);
                this.M1.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                this.M1.setOnClickListener(new jv(this, 4));
                this.F1.addView(this.M1);
                q3(false);
            }
        }
        i10 = -1;
        ewVar = this.v0;
        if (ewVar != null) {
        }
        uxVar = this.T;
        if (uxVar != null) {
        }
        xw xwVar3 = new xw(this, context, this, this.currentAccount, e4() ? 1 : 0);
        this.A0 = xwVar3;
        xwVar3.setActionBar(this.actionBar);
        this.A0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        xw xwVar22 = this.A0;
        xwVar22.h0 = false;
        xwVar22.setVisibility(8);
        this.I = false;
        this.H = false;
        this.G = false;
        if (this.h2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
        }
        xxVar3.addView(this.actionBar, i7.f6.c(-2.0f, i10));
        if (!this.h2) {
        }
        uxVar2 = this.T;
        if (uxVar2 != null) {
        }
        this.t0 = xxVar3.getChildCount();
        UndoView[] undoViewArr2 = this.u0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.S) {
        }
        if (this.R2 == 0) {
        }
        this.a0[0].a.setGlowColor(getThemedColor(i19));
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.O8), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.N8), false);
        this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.g6.Q8), false);
        this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.g6.R8), true);
        if (!this.h2) {
            cg.h0 h0Var32 = new cg.h0(this, context, 25);
            this.G0 = h0Var32;
            if (Build.VERSION.SDK_INT >= 23) {
            }
            this.G0.setFocusable(false);
            this.G0.setImportantForAccessibility(2);
            this.G0.setOnClickListener(new jv(this, 7));
            this.G0.setVisibility(8);
            xxVar3.addView(this.G0, i7.f6.c(-1.0f, i10));
        }
        this.b1.setColor(getThemedColor(i19));
        this.l3 = false;
        if (this.j2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(xxVar3);
        this.B3 = new ax(this, context, xxVar3, context);
        V4(true, false);
        this.B3.setOpenProgress(0.0f);
        xxVar3.addView(this.A0, i7.f6.c(81.0f, i10));
        xxVar3.addView(this.B3, i7.f6.c(-1.0f, i10));
        this.B0 = new org.telegram.ui.Components.ds(context);
        fsVar = this.F1;
        if (fsVar != null) {
        }
        if (this.T2 != j12) {
            org.telegram.ui.Components.iq iqVar2 = new org.telegram.ui.Components.iq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(iqVar2, 0, 1, 33);
            nh.d dVar2 = new nh.d(context, this.resourceProvider);
            this.r0 = dVar2;
            dVar2.e();
            this.r0.setText(spannableStringBuilder22);
            this.r0.setOnClickListener(new org.telegram.ui.Components.fi0(19, this, new org.telegram.ui.ActionBar.c2[1]));
            ug.f fVar42 = new ug.f(getContext());
            this.s0 = fVar42;
            fVar42.setupColorKey(org.telegram.ui.ActionBar.g6.a7);
            this.s0.setFadeZoneBottom(AndroidUtilities.dp(f9) + AndroidUtilities.navigationBarHeight);
            this.s0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            xxVar3.addView(this.s0, i7.f6.g());
            xxVar3.addView(this.r0, i7.f6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        f5(false);
        Y4(false);
        F3();
        C3();
        E3();
        D3();
        B3();
        v3();
        this.T.setBlurredBackgroundVisibility(this.b.e);
        r0.j0.m(this.fragmentView, new kv(this, 7));
        return this.fragmentView;
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.n5 n5Var;
        xw xwVar = this.A0;
        org.telegram.ui.Components.n5 n5Var2 = null;
        if (xwVar != null && (n5Var = xwVar.T) != null && xwVar.m0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                n5Var.j(emojiStatusDocumentId.longValue(), z10);
                n5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(xwVar.f).isPremiumUser(user)) {
                n5Var.g(null, z10);
                n5Var.m(false, z10);
            } else {
                if (xwVar.J0 == null) {
                    xwVar.J0 = xwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    xwVar.J0 = new lh.g(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xwVar.J0);
                }
                xwVar.J0.setColorFilter(new PorterDuffColorFilter(xwVar.f(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
                n5Var.g(xwVar.J0, z10);
                n5Var.m(false, z10);
            }
            n5Var.k(Integer.valueOf(xwVar.f(org.telegram.ui.ActionBar.g6.zh)));
            xwVar.S.invalidate();
        }
        if (this.z3 == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
        this.x3 = null;
        if (emojiStatusDocumentId2 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.z3.j(emojiStatusDocumentId2.longValue(), z10);
            this.z3.m(z12, z10);
            if (z12) {
                this.x3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new jv(this, 2));
            d61.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.z3.g(null, z10);
            this.z3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.H3 == null) {
                this.H3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.H3 = new tx(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.H3);
            }
            this.H3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
            this.z3.g(this.H3, z10);
            this.z3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new jv(this, 3));
            d61.t(this.currentAccount);
        }
        org.telegram.ui.Components.n5 n5Var3 = this.z3;
        int i10 = org.telegram.ui.ActionBar.g6.zh;
        n5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.A3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        cx cxVar = this.I0;
        if (cxVar == null || !(cxVar.getContentView() instanceof d61)) {
            return;
        }
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
        d61 d61Var = (d61) this.I0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.n5 n5Var4 = this.z3;
            if (rightDrawable == n5Var4) {
                n5Var2 = n5Var4;
            }
        }
        d61Var.y(n5Var2, titleTextView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x056b, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r14, r4.D0) != false) goto L367;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        MessagesController.DialogFilter dialogFilter;
        int i13;
        int i14;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.mn0 mn0Var;
        org.telegram.ui.Components.mn0 mn0Var2;
        int i15;
        boolean z11;
        int i16 = 2;
        int i17 = 7;
        ArrayList arrayList = null;
        int i18 = 0;
        if (i10 == NotificationCenter.dialogsNeedReload) {
            if (this.a0 == null || this.O1) {
                return;
            }
            int i19 = 0;
            while (true) {
                ey[] eyVarArr = this.a0;
                if (i19 >= eyVarArr.length) {
                    break;
                }
                ey eyVar = eyVarArr[i19];
                int i20 = eyVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i20 == 7 || i20 == 8) ? getMessagesController().selectedDialogFilter[this.a0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.v3 && z12) {
                    AndroidUtilities.runOnUIThread(new lq(this, eyVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    u4(eyVar);
                }
                i19++;
            }
            ew ewVar = this.v0;
            if (ewVar != null && ewVar.getVisibility() == 0) {
                this.v0.c();
            }
            this.v3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            g5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.T2 != chatFull.id) {
                return;
            }
            this.V2 = chatFull;
            q3(false);
            if (this.a0 == null || this.O1) {
                return;
            }
            while (true) {
                ey[] eyVarArr2 = this.a0;
                if (i18 >= eyVarArr2.length) {
                    return;
                }
                u4(eyVarArr2[i18]);
                i18++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                ew ewVar2 = this.v0;
                if (ewVar2 == null || ewVar2.getVisibility() != 0) {
                    return;
                }
                ew ewVar3 = this.v0;
                int defaultTabId = ewVar3.getDefaultTabId();
                jh.e1 e1Var = ewVar3.B;
                ArrayList arrayList2 = ewVar3.h;
                int i21 = ewVar3.h0.get(defaultTabId, -1);
                if (i21 < 0 || i21 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.c00 c00Var = (org.telegram.ui.Components.c00) arrayList2.get(i21);
                if (c00Var.d == ((fw) ewVar3.F).a(c00Var.a) || ((fw) ewVar3.F).a(c00Var.a) < 0) {
                    return;
                }
                e1Var.f1();
                if (ewVar3.i0.get(i21) != c00Var.a(true) || ewVar3.d0) {
                    ewVar3.d0 = true;
                    ewVar3.requestLayout();
                    e1Var.setItemAnimator(ewVar3.o0);
                    org.telegram.ui.Components.b00 b00Var = ewVar3.E;
                    if (b00Var != null) {
                        b00Var.l();
                    }
                    ewVar3.I = 0;
                    org.telegram.ui.Components.c00 d = ewVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i22 = 0; i22 < size; i22++) {
                        ewVar3.I = org.telegram.messenger.x3.C(24.0f, ((org.telegram.ui.Components.c00) arrayList2.get(i22)).a(true), ewVar3.I);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.emojiLoaded) {
                if (this.a0 != null) {
                    int i23 = 0;
                    while (true) {
                        ey[] eyVarArr3 = this.a0;
                        if (i23 >= eyVarArr3.length) {
                            break;
                        }
                        ay ayVar = eyVarArr3[i23].a;
                        if (ayVar != null) {
                            for (int i24 = 0; i24 < ayVar.getChildCount(); i24++) {
                                View childAt = ayVar.getChildAt(i24);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i23++;
                    }
                }
                ew ewVar4 = this.v0;
                if (ewVar4 != null) {
                    ewVar4.getTabsContainer().f1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.closeSearchByActiveAction) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.h(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.proxySettingsChanged) {
                Z4(false, false);
                return;
            }
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                g5(num.intValue(), true);
                ew ewVar5 = this.v0;
                if (ewVar5 != null && ewVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.v0.c();
                }
                if (this.T2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.T2));
                    this.U2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.W2.e(this.U2, this.X2);
                }
                if (this.a0 != null) {
                    for (int i25 = 0; i25 < this.a0.length; i25++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.a0[i25].d.T(true);
                        }
                    }
                }
                d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i26 = NotificationCenter.appDidLogout;
            boolean[] zArr = u4;
            if (i10 == i26) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.a0 == null || this.O1) {
                    return;
                }
                org.telegram.ui.Components.u10 u10Var = this.p0;
                if (u10Var != null) {
                    z11 = u10Var.getProgressVisible();
                    this.p0.f(false, true);
                } else {
                    z11 = false;
                }
                for (ey eyVar2 : this.a0) {
                    eyVar2.d.e = false;
                }
                if (z11) {
                    z4(0.0f);
                    ValueAnimator valueAnimator = this.Z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.Y, 1.0f).setDuration(250L);
                    this.Z = duration;
                    duration.setInterpolator(org.telegram.ui.Components.jr.f);
                    this.Z.addUpdateListener(new gv(this, 0));
                    this.Z.start();
                }
                int i27 = 0;
                boolean z13 = false;
                while (true) {
                    ey[] eyVarArr4 = this.a0;
                    if (i27 >= eyVarArr4.length) {
                        break;
                    }
                    if (!eyVarArr4[i27].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z13 = true;
                    } else {
                        this.a0[i27].d.l();
                    }
                    i27++;
                }
                if (z13) {
                    g5(0, true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.openedChatChanged) {
                if (this.a0 == null) {
                    return;
                }
                int i28 = 0;
                while (true) {
                    ey[] eyVarArr5 = this.a0;
                    if (i28 >= eyVarArr5.length) {
                        g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (eyVarArr5[i28].p() && AndroidUtilities.isTablet()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[0]).longValue();
                        long longValue2 = ((Long) objArr[1]).longValue();
                        MessagesStorage.TopicKey topicKey = this.l2;
                        if (!booleanValue2) {
                            topicKey.dialogId = longValue;
                            topicKey.topicId = longValue2;
                        } else if (longValue == topicKey.dialogId && longValue2 == topicKey.topicId) {
                            topicKey.dialogId = 0L;
                            topicKey.topicId = 0L;
                        }
                        this.a0[i28].d.s = topicKey.dialogId;
                    }
                    i28++;
                }
            } else {
                if (i10 == NotificationCenter.notificationsSettingsUpdated) {
                    g5(0, true);
                    return;
                }
                if (i10 == NotificationCenter.messageReceivedByAck || i10 == NotificationCenter.messageReceivedByServer || i10 == NotificationCenter.messageSendError) {
                    g5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i10 == NotificationCenter.didSetPasscode) {
                    y3();
                    return;
                }
                if (i10 == NotificationCenter.needReloadRecentDialogsSearch) {
                    ox oxVar = this.y0;
                    if (oxVar == null || (mn0Var2 = oxVar.U) == null || (i15 = mn0Var2.d0) == 15) {
                        return;
                    }
                    int i29 = mn0Var2.o0;
                    MessagesStorage.getInstance(i29).getStorageQueue().postRunnable(new j3.y(i29, i15, new rf.s(mn0Var2), 14));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    g5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    ox oxVar2 = this.y0;
                    if (oxVar2 == null || (mn0Var = oxVar2.U) == null) {
                        return;
                    }
                    mn0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.Z1 != connectionState) {
                        this.Z1 = connectionState;
                        Z4(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    Z4(true, false);
                    ox oxVar3 = this.y0;
                    if (oxVar3 != null) {
                        int currentPosition = oxVar3.getCurrentPosition();
                        org.telegram.ui.Components.sn0 sn0Var = oxVar3.P;
                        c5(sn0Var != null && sn0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.needDeleteDialog) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat2 = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z10 = false;
                    } else {
                        z10 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    boolean z14 = booleanValue;
                    Runnable t9Var = new nh.t9(this, chat2, longValue3, z14, user, z10);
                    N3();
                    if (this.u0[0] == null) {
                        t9Var.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        t9Var.run();
                        return;
                    }
                    UndoView Y3 = Y3();
                    if (Y3 != null) {
                        Y3.j(z14 ? 1 : 95, longValue3, t9Var);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.folderBecomeEmpty) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int i30 = this.R2;
                    if (i30 != intValue || i30 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == NotificationCenter.dialogFiltersUpdated) {
                    V4(true, true);
                    return;
                }
                if (i10 == NotificationCenter.filterSettingsUpdated) {
                    J4();
                    return;
                }
                if (i10 == NotificationCenter.newSuggestionsAvailable) {
                    L4();
                    U4();
                    int checkEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (checkEmailSuggestion != 0) {
                        fg0 fg0Var = new fg0();
                        vv vvVar = new vv(this, 5);
                        vv vvVar2 = new vv(this, 6);
                        boolean z15 = checkEmailSuggestion == 2;
                        fg0Var.B = 3;
                        fg0Var.a = 12;
                        fg0Var.Z = vvVar;
                        fg0Var.a0 = vvVar2;
                        fg0Var.c0 = z15;
                        fg0Var.d0 = true;
                        presentFragment(fg0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.u10 u10Var2 = this.p0;
                    if (u10Var2 != null) {
                        u10Var2.f(true, true);
                    }
                    ey[] eyVarArr6 = this.a0;
                    if (eyVarArr6 != null) {
                        for (ey eyVar3 : eyVarArr6) {
                            nw nwVar = eyVar3.d;
                            nwVar.M = false;
                            nwVar.e = true;
                            nwVar.l();
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.messagesDeleted) {
                    if (!this.l3 || this.y0 == null) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    long longValue4 = ((Long) objArr[1]).longValue();
                    ox oxVar4 = this.y0;
                    HashMap hashMap = oxVar4.v0;
                    SparseArray sparseArray = oxVar4.h;
                    int size2 = sparseArray.size();
                    for (int i31 = 0; i31 < size2; i31++) {
                        View view = (View) sparseArray.valueAt(i31);
                        if (view instanceof h10) {
                            ((h10) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i32 = 0; i32 < oxVar4.getChildCount(); i32++) {
                        if (oxVar4.getChildAt(i32) instanceof h10) {
                            ((h10) oxVar4.getChildAt(i32)).e(longValue4, arrayList3);
                        }
                    }
                    oxVar4.I0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    for (int i33 = 0; i33 < arrayList4.size(); i33 = i13 + 1) {
                        z00 z00Var = (z00) arrayList4.get(i33);
                        MessageObject messageObject = (MessageObject) hashMap.get(z00Var);
                        if (messageObject != null) {
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < 0) {
                                i14 = (int) (-dialogId);
                                i13 = i33;
                            } else {
                                i13 = i33;
                            }
                            i14 = 0;
                            if (i14 == longValue4) {
                                for (int i34 = 0; i34 < arrayList3.size(); i34++) {
                                    if (messageObject.getId() == ((Integer) arrayList3.get(i34)).intValue()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(z00Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i33;
                        }
                    }
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i35 = 0; i35 < size3; i35++) {
                            hashMap.remove(arrayList.get(i35));
                        }
                        oxVar4.t0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.w0 w0Var = oxVar4.y0;
                        if (w0Var != null) {
                            w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.a0 != null) {
                        int i36 = 0;
                        while (true) {
                            ey[] eyVarArr7 = this.a0;
                            if (i36 >= eyVarArr7.length) {
                                break;
                            }
                            rf.i iVar = eyVarArr7[i36].d.L;
                            if (iVar != null) {
                                iVar.a.clear();
                                iVar.b.clear();
                                iVar.c.clear();
                                iVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(iVar.e);
                            }
                            i36++;
                        }
                    }
                    ba1 ba1Var = ba1.b;
                    if (ba1Var != null) {
                        ba1Var.dismiss();
                        ba1.b = null;
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.communitySwitchedCollapsed) {
                    long longValue5 = ((Long) objArr[0]).longValue();
                    boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                    if (this.T2 != longValue5 || booleanValue3) {
                        return;
                    }
                    org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                    if (b5Var == null || b5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.T2 == ((Long) objArr[0]).longValue()) {
                        q3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            ru ruVar = this.N3;
                            if (ruVar == null || ruVar.getTag() == null) {
                                return;
                            }
                            ru ruVar2 = this.N3;
                            ruVar2.animate().setListener(null).cancel();
                            ruVar2.animate().setListener(new org.telegram.ui.Components.ok0(i17, this, ruVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.N3.setTag(null);
                            return;
                        }
                        if (this.N3 == null) {
                            Context context = this.fragmentView.getContext();
                            ru ruVar3 = new ru(context);
                            LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
                            aj0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            aj0Var.getAnimatedDrawable().I(1);
                            aj0Var.d();
                            g10.addView(aj0Var, i7.f6.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i37 = org.telegram.ui.ActionBar.g6.G6;
                            th.s(i37, null, false, textView, 1);
                            TextView i38 = th.i(g10, textView, i7.f6.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            i38.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            i38.setTextSize(1, 14.0f);
                            i38.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            i38.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i37, false));
                            i38.setGravity(1);
                            TextView i39 = th.i(g10, i38, i7.f6.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            i39.setTextSize(1, 14.0f);
                            i39.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            i39.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i37, false));
                            i39.setGravity(1);
                            g10.addView(i39, i7.f6.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            ruVar3.addView(g10, i7.f6.e(-1, -2, 16));
                            ruVar3.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                            ruVar3.setOnTouchListener(new qu());
                            this.N3 = ruVar3;
                            ruVar3.setAlpha(0.0f);
                            ((xx) this.fragmentView).addView(this.N3);
                            this.N3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                        }
                        this.N3.setTag(1);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseOpened) {
                    if (getMessagesStorage().showClearDatabaseAlert) {
                        getMessagesStorage().showClearDatabaseAlert = false;
                        ba1.n(this);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.userEmojiStatusUpdated) {
                    d5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                    e5();
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    i4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i40 = 0;
                    while (true) {
                        ey[] eyVarArr8 = this.a0;
                        if (i40 >= eyVarArr8.length) {
                            return;
                        }
                        ey eyVar4 = eyVarArr8[i40];
                        if (eyVar4 != null && (((i12 = eyVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[eyVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            eyVar4.q(true);
                            return;
                        }
                        i40++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            f5(this.R);
                            g5(0, true);
                            return;
                        }
                        if (i10 == NotificationCenter.storiesEnabledUpdate) {
                            e5();
                            return;
                        }
                        if (i10 == NotificationCenter.unconfirmedAuthUpdate) {
                            U4();
                            return;
                        }
                        if (i10 == NotificationCenter.premiumPromoUpdated) {
                            U4();
                            return;
                        }
                        if (i10 == NotificationCenter.starBalanceUpdated || i10 == NotificationCenter.starSubscriptionsLoaded) {
                            U4();
                            return;
                        } else if (i10 == NotificationCenter.appConfigUpdated) {
                            U4();
                            return;
                        } else {
                            if (i10 == NotificationCenter.activeAuctionsUpdated) {
                                U4();
                                return;
                            }
                            return;
                        }
                    }
                    long longValue6 = ((Long) objArr[0]).longValue();
                    int i41 = 0;
                    while (true) {
                        ey[] eyVarArr9 = this.a0;
                        if (i41 >= eyVarArr9.length) {
                            return;
                        }
                        ey eyVar5 = eyVarArr9[i41];
                        if (eyVar5.a != null) {
                            int i42 = 0;
                            while (true) {
                                if (i42 < eyVar5.a.getChildCount()) {
                                    View childAt2 = eyVar5.a.getChildAt(i42);
                                    if (childAt2 instanceof org.telegram.ui.Cells.p2) {
                                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt2;
                                        if (longValue6 == p2Var.getDialogId()) {
                                            p2Var.t();
                                            break;
                                        }
                                    }
                                    i42++;
                                }
                            }
                        }
                        i41++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof ph.p2) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        return this.R2 == 1;
    }

    public final void e5() {
        nh.t3 t3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.K3 != storiesEnabled) {
            X4();
            if (!this.K3 && storiesEnabled && (t3Var = this.l0) != null) {
                t3Var.v();
            }
            this.K3 = storiesEnabled;
        }
        org.telegram.ui.Components.u10 u10Var = this.p0;
        if (u10Var == null) {
            return;
        }
        if (this.N0 == 10) {
            u10Var.setImageResource(R.drawable.floating_check);
            this.p0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            u10Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.p0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public final boolean f4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return (topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id);
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        lh.s6 X3;
        ArrayList arrayList;
        if (this.A0 == null || this.E != null) {
            return;
        }
        ax axVar = this.B3;
        if ((axVar != null && axVar.c()) || this.l3 || (lVar = this.actionBar) == null || lVar.s() || this.h2) {
            return;
        }
        nh.gb gbVar = nh.gb.B2;
        int i10 = 0;
        if ((gbVar != null && gbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().G0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !e4() && X3().G();
        if (this.T2 != 0) {
            z11 = false;
        } else if (e4()) {
            z11 = !X3().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (X3 = X3()).g) != null && arrayList.size() > 0) || X3.H());
            z12 = X3().G();
        }
        this.H = z12;
        boolean z13 = this.C0;
        boolean z14 = z12 || z11;
        this.C0 = z14;
        if (z11 || z14) {
            this.A0.p(z10, z14 != z13);
        }
        boolean z15 = this.C0;
        int i12 = 2;
        int i13 = 8;
        if (z15 != z13) {
            if (z10) {
                ValueAnimator valueAnimator = this.F;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.C0 && !isInPreviewMode()) {
                    this.A0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, this.C0 ? 1.0f : 0.0f);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new ti(i11, this));
                this.F.addListener(new org.telegram.ui.Components.p11(this, 25));
                this.F.setDuration(200L);
                this.F.setInterpolator(org.telegram.ui.Components.jr.f);
                this.F.start();
            } else {
                this.A0.setVisibility((!z15 || isInPreviewMode()) ? 8 : 0);
                this.D0 = this.C0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z11 == this.I) {
            return;
        }
        this.I = z11;
        if (z11) {
            this.A0.l(1.0f, false);
        }
        if (z10 && !isInPreviewMode()) {
            this.A0.setVisibility(0);
            float f9 = -this.J;
            float T3 = z11 ? 0.0f : T3();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat2;
            ofFloat2.addUpdateListener(new nx(this, f9, z11, T3));
            this.E.addListener(new gx(this, z11, i12));
            this.E.setDuration(200L);
            this.E.setInterpolator(org.telegram.ui.Components.jr.f);
            this.E.start();
            return;
        }
        this.G = z11;
        xw xwVar = this.A0;
        if ((z11 || this.H) && !isInPreviewMode()) {
            i13 = 0;
        }
        xwVar.setVisibility(i13);
        if (z11) {
            this.t3 = -AndroidUtilities.dp(81.0f);
            C4(-T3());
        } else {
            C4(0.0f);
        }
        while (true) {
            ey[] eyVarArr = this.a0;
            if (i10 >= eyVarArr.length) {
                break;
            }
            ey eyVar = eyVarArr[i10];
            if (eyVar != null) {
                eyVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.j70 j70Var = this.H0;
        if (j70Var != null) {
            j70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.a0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.a0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return dialogFilter != null ? dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g5(int i10, boolean z10) {
        RecyclerView recyclerView;
        int i11;
        int childCount;
        int i12;
        if ((this.O1 && (MessagesController.UPDATE_MASK_REORDER & i10) == 0) || this.isPaused) {
            return;
        }
        int i13 = 0;
        while (i13 < 3) {
            if (i13 == 2) {
                ox oxVar = this.y0;
                recyclerView = oxVar != null ? oxVar.R : null;
            } else {
                ey[] eyVarArr = this.a0;
                if (eyVarArr != null) {
                    ay ayVar = i13 < eyVarArr.length ? eyVarArr[i13].a : null;
                    if (ayVar == null || eyVarArr[i13].getVisibility() == 0) {
                        r5 = ayVar != null ? this.a0[i13] : null;
                        recyclerView = ayVar;
                    }
                }
                i13++;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                if (((MessagesController.UPDATE_MASK_NEW_MESSAGE & i10) != 0 || i10 == 0) && r5 != null) {
                    r5.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    while (i11 < childCount2) {
                        View childAt = recyclerView.getChildAt(i11);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.p2;
                        ArrayList arrayList = this.E2;
                        if (z11 && (this.y0 == null || recyclerView.getAdapter() != this.y0.U)) {
                            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                p2Var.T(this.actionBar.s(), true);
                                i11 = this.O1 ? i11 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                p2Var.V(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
                            } else {
                                if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i10) == 0) {
                                    if (p2Var.b0(i10, z10)) {
                                        r5.q(false);
                                        break;
                                    }
                                } else if (this.a0[i13].p() && AndroidUtilities.isTablet()) {
                                    p2Var.setDialogSelected(p2Var.getDialogId() == this.l2.dialogId);
                                }
                                if (arrayList != null) {
                                    p2Var.V(arrayList.contains(Long.valueOf(p2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.sa)) {
                                    ((org.telegram.ui.Cells.sa) childAt).j(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                                    f6Var.u(i10);
                                    if (arrayList != null) {
                                        f6Var.s(arrayList.contains(Long.valueOf(f6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.O1 && (childAt instanceof org.telegram.ui.Components.jl0)) {
                                    org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) childAt;
                                    childCount = jl0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = jl0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.l4) {
                                            ((org.telegram.ui.Cells.l4) childAt2).b(i10);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.sa)) {
                        }
                        if (!this.O1) {
                            org.telegram.ui.Components.jl0 jl0Var2 = (org.telegram.ui.Components.jl0) childAt;
                            childCount = jl0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                    }
                }
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return (e4() || this.B3.f) ? org.telegram.ui.ActionBar.x4.a : org.telegram.ui.ActionBar.x4.b;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f9) {
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T3, 1.0f);
            this.W3 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f9, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.T3, 1.0f);
        this.W3 = ofFloat2;
        ofFloat2.addUpdateListener(new gv(this, 2));
        this.W3.setInterpolator(org.telegram.ui.Components.jr.g);
        this.W3.setDuration(clamp);
        this.W3.start();
        return this.W3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x03a6  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        rf.l lVar;
        org.telegram.ui.Components.jl0 jl0Var;
        final int i10 = 0;
        org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6(this) { // from class: org.telegram.ui.bw
            public final /* synthetic */ fy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final /* synthetic */ void a(float f9) {
                int i11 = i10;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final void b() {
                switch (i10) {
                    case 0:
                        fy.G0(this.b);
                        break;
                    default:
                        fy fyVar = this.b;
                        ox oxVar = fyVar.y0;
                        if (oxVar != null) {
                            org.telegram.ui.ActionBar.a0 actionMode = oxVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = fyVar.y0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.SRC_IN));
                                break;
                            }
                        }
                        break;
                }
            }

            private final /* synthetic */ void c(float f9) {
            }

            private final /* synthetic */ void d(float f9) {
            }
        };
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i11));
        org.telegram.ui.Cells.p2 p2Var = this.T0;
        if (p2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(p2Var, 1, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.i0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        }
        int i12 = this.R2;
        Paint paint = this.b1;
        final int i13 = 1;
        if (i12 == 0) {
            if (this.h2) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, paint, null, null, i11));
            ox oxVar = this.y0;
            if (oxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(oxVar.R, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.s1}, null, !this.S ? org.telegram.ui.ActionBar.g6.A8 : org.telegram.ui.ActionBar.g6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, paint, null, null, i11));
            ox oxVar2 = this.y0;
            if (oxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(oxVar2.R, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.s1}, null, !this.S ? org.telegram.ui.ActionBar.g6.P8 : org.telegram.ui.ActionBar.g6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.R8));
        }
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.g6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar2, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.g6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.g6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d1, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.I5));
        if (this.v0 != null) {
            org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
            if (lVar3 == null || !lVar3.s()) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0, 0, new Class[]{org.telegram.ui.Components.f00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0, 0, new Class[]{org.telegram.ui.Components.f00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.g6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, org.telegram.ui.ActionBar.g6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.v0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, org.telegram.ui.ActionBar.g6.U9));
        }
        arrayList.addAll(i7.i6.a(new org.telegram.ui.ActionBar.h6(this) { // from class: org.telegram.ui.bw
            public final /* synthetic */ fy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final /* synthetic */ void a(float f9) {
                int i112 = i13;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final void b() {
                switch (i13) {
                    case 0:
                        fy.G0(this.b);
                        break;
                    default:
                        fy fyVar = this.b;
                        ox oxVar3 = fyVar.y0;
                        if (oxVar3 != null) {
                            org.telegram.ui.ActionBar.a0 actionMode = oxVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = fyVar.y0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.SRC_IN));
                                break;
                            }
                        }
                        break;
                }
            }

            private final /* synthetic */ void c(float f9) {
            }

            private final /* synthetic */ void d(float f9) {
            }
        }, org.telegram.ui.ActionBar.g6.w8, i14));
        int i15 = 0;
        while (true) {
            if (i15 >= 3) {
                break;
            }
            if (i15 == 2) {
                ox oxVar3 = this.y0;
                if (oxVar3 != null) {
                    jl0Var = oxVar3.R;
                    if (jl0Var != null) {
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i10] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr2[1] = org.telegram.ui.Cells.f6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i10] = org.telegram.ui.Cells.p2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.g6.w0;
                        int i16 = org.telegram.ui.ActionBar.g6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr3, paint2, null, null, i16));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i10] = org.telegram.ui.Cells.p2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.g6.y0;
                        int i17 = org.telegram.ui.ActionBar.g6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr4, paint3, null, null, i17));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i10] = org.telegram.ui.Cells.p2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr5, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr6[1] = org.telegram.ui.Cells.f6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i10] = org.telegram.ui.ActionBar.g6.a1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.g6.a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr7[1] = org.telegram.ui.Cells.f6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i10] = org.telegram.ui.ActionBar.g6.g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.g6.h1;
                        int i18 = org.telegram.ui.ActionBar.g6.j9;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr7, null, drawableArr2, null, i18));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i10] = org.telegram.ui.Cells.p2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i10] = org.telegram.ui.ActionBar.g6.j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.g6.k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.g6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.g6.b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i10] = org.telegram.ui.Cells.p2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i10] = org.telegram.ui.ActionBar.g6.l1;
                        int i19 = org.telegram.ui.ActionBar.g6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr9, null, drawableArr4, null, i19));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr10[1] = org.telegram.ui.Cells.f6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, clsArr10, null, new Paint[]{textPaintArr[i10], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, null, org.telegram.ui.ActionBar.g6.X8));
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, null, org.telegram.ui.ActionBar.g6.Z8));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.i9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.g9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.m9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i18));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, null, org.telegram.ui.ActionBar.g6.p9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.J0, null, null, org.telegram.ui.ActionBar.g6.r9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.K0, null, null, i19));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.v0, null, null, org.telegram.ui.ActionBar.g6.s9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.u0, null, null, org.telegram.ui.ActionBar.g6.t9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.u9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.v9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.w9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.x0, null, null, org.telegram.ui.ActionBar.g6.x9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.y9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i1}, null, org.telegram.ui.ActionBar.g6.A9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f1}, null, org.telegram.ui.ActionBar.g6.z9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.c1}, null, org.telegram.ui.ActionBar.g6.B9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.m1}, null, i16));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.n1}, null, org.telegram.ui.ActionBar.g6.Z5));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o1}, null, org.telegram.ui.ActionBar.g6.zj));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.p1, org.telegram.ui.ActionBar.g6.q1, org.telegram.ui.ActionBar.g6.r1}, null, i17));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.d9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.c9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
                        int i20 = org.telegram.ui.ActionBar.g6.d6;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 8192, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 16384, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.g6.k7));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.g6.h6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.f6.class}, org.telegram.ui.ActionBar.g6.Q0, null, null, org.telegram.ui.ActionBar.g6.A6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.f6.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.p6));
                        org.telegram.ui.Cells.s3.a(arrayList, jl0Var);
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 4, new Class[]{org.telegram.ui.Cells.j4.class}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                        int i21 = org.telegram.ui.ActionBar.g6.b7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i21));
                        int i22 = org.telegram.ui.ActionBar.g6.a7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i21));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 48, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.B6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.o6));
                        i15++;
                        i10 = 0;
                    }
                }
                i15++;
                i10 = 0;
            } else {
                ey[] eyVarArr = this.a0;
                if (eyVarArr != null) {
                    jl0Var = i15 < eyVarArr.length ? eyVarArr[i15].a : null;
                    if (jl0Var != null) {
                    }
                }
                i15++;
                i10 = 0;
            }
        }
        int i23 = org.telegram.ui.ActionBar.g6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.V7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.W7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.X7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Y7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Z7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.a8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.b8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.L7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.M7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.N7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.k9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.j9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.o9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Y8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.l9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.n9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.h9));
        if (this.a0 != null) {
            int i24 = 0;
            while (true) {
                ey[] eyVarArr2 = this.a0;
                if (i24 >= eyVarArr2.length) {
                    break;
                }
                if (this.R2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.i6(eyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.i6(eyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                }
                int i25 = org.telegram.ui.ActionBar.g6.m9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, 4, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"emptyTextView1"}, null, null, null, i25));
                int i26 = org.telegram.ui.ActionBar.g6.g9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, 4, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"emptyTextView2"}, null, null, null, i26));
                if (SharedConfig.archiveHidden) {
                    org.telegram.ui.Components.xi0[] xi0VarArr = {org.telegram.ui.ActionBar.g6.u1};
                    int i27 = org.telegram.ui.ActionBar.g6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, xi0VarArr, "Arrow1", i27));
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.u1}, "Arrow2", i27));
                } else {
                    org.telegram.ui.Components.xi0[] xi0VarArr2 = {org.telegram.ui.ActionBar.g6.u1};
                    int i28 = org.telegram.ui.ActionBar.g6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, xi0VarArr2, "Arrow1", i28));
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.u1}, "Arrow2", i28));
                }
                org.telegram.ui.Components.xi0[] xi0VarArr3 = {org.telegram.ui.ActionBar.g6.u1};
                int i29 = org.telegram.ui.ActionBar.g6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, xi0VarArr3, "Box2", i29));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.u1}, "Box1", i29));
                org.telegram.ui.Components.xi0[] xi0VarArr4 = {org.telegram.ui.ActionBar.g6.x1};
                int i30 = org.telegram.ui.ActionBar.g6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, xi0VarArr4, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.x1}, "Line", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.y1}, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.y1}, "Line", i30));
                org.telegram.ui.Components.xi0[] xi0VarArr5 = {org.telegram.ui.ActionBar.g6.v1};
                int i31 = org.telegram.ui.ActionBar.g6.c9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, xi0VarArr5, "Arrow", i31));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.v1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.v1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.z1}, "Line 1", i31));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.z1}, "Line 2", i31));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.z1}, "Line 3", i31));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.z1}, "Cup Red", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.z1}, "Box", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.w1}, "Arrow1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.w1}, "Arrow2", org.telegram.ui.ActionBar.g6.d9));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.w1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.xi0[]{org.telegram.ui.ActionBar.g6.w1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i24].a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                int i32 = i24;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i32].a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, h6Var2, org.telegram.ui.ActionBar.g6.y6));
                h6Var = h6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i32].a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, h6Var2, org.telegram.ui.ActionBar.g6.il));
                int i33 = org.telegram.ui.ActionBar.g6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i32].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i32].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0[i32].w, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.h6));
                lVar = this.a0[i32].d;
                lVar.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.g6.U8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"headerTextView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"messageTextView"}, null, null, null, i26));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                i24 = i32 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S9));
        ox oxVar4 = this.y0;
        if (oxVar4 != null) {
            org.telegram.ui.Components.mn0 mn0Var = oxVar4.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(mn0Var != null ? mn0Var.I() : null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, org.telegram.ui.ActionBar.g6.w0, null, null, org.telegram.ui.ActionBar.g6.U8));
            org.telegram.ui.Components.mn0 mn0Var2 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(mn0Var2 != null ? mn0Var2.I() : null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, org.telegram.ui.ActionBar.g6.y0, null, null, org.telegram.ui.ActionBar.g6.V8));
            org.telegram.ui.Components.mn0 mn0Var3 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(mn0Var3 != null ? mn0Var3.I() : null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
            org.telegram.ui.Components.mn0 mn0Var4 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(mn0Var4 != null ? mn0Var4.I() : null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, org.telegram.ui.ActionBar.g6.N0, null, null, org.telegram.ui.ActionBar.g6.f9));
            org.telegram.ui.Components.mn0 mn0Var5 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(mn0Var5 != null ? mn0Var5.I() : null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            org.telegram.ui.Components.mn0 mn0Var6 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(mn0Var6 != null ? mn0Var6.I() : null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        }
        int i34 = 0;
        while (true) {
            UndoView[] undoViewArr = this.u0;
            if (i34 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i34];
            int i35 = org.telegram.ui.ActionBar.g6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView, 32, null, null, null, null, i35));
            int i36 = org.telegram.ui.ActionBar.g6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i36));
            int i37 = org.telegram.ui.ActionBar.g6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", i35));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", i35));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", i37));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", i37));
            i34++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.o5));
        int i38 = org.telegram.ui.ActionBar.g6.q7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ri));
        int i39 = org.telegram.ui.ActionBar.g6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xi));
        if (this.x1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.x1, 0, null, org.telegram.ui.ActionBar.g6.j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.x1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i3}, null, org.telegram.ui.ActionBar.g6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.x1, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Ud));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.x1, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Wd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.x1, TLObject.FLAG_23, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        }
        int i40 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i40));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i39));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.g8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.hh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.jk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.kk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.lk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.mk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.hk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.ik));
        rf.h0 h0Var = this.X;
        if (h0Var != null) {
            arrayList.addAll(h0Var.getThemeDescriptions());
            this.X.B1();
        }
        hy hyVar = this.d0;
        if (hyVar != null) {
            hyVar.a();
            this.d0.invalidate();
        }
        ox oxVar5 = this.y0;
        if (oxVar5 != null) {
            oxVar5.M(arrayList);
        }
        org.telegram.ui.Cells.x2 x2Var = this.I1;
        int i41 = 8;
        if (x2Var != null) {
            arrayList.addAll(i7.i6.a(new org.telegram.ui.Components.x6(new ui(x2Var, 19), i41), org.telegram.ui.ActionBar.g6.d6, i40, org.telegram.ui.ActionBar.g6.y6));
        }
        org.telegram.ui.Cells.pa paVar = this.J1;
        if (paVar != null) {
            arrayList.addAll(i7.i6.a(new org.telegram.ui.Components.x6(new ui(paVar, 20), i41), org.telegram.ui.ActionBar.g6.d6, i40, org.telegram.ui.ActionBar.g6.y6, org.telegram.ui.ActionBar.g6.I6, i38));
        }
        org.telegram.ui.Cells.m mVar = this.H1;
        if (mVar != null) {
            arrayList.addAll(i7.i6.a(new org.telegram.ui.Components.x6(new ui(mVar, 21), i41), org.telegram.ui.ActionBar.g6.d6, i40, org.telegram.ui.ActionBar.g6.y6, org.telegram.ui.ActionBar.g6.I6, i38));
        }
        return arrayList;
    }

    public final boolean h4() {
        return this.y2 == null && this.j2 == null;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        qw qwVar;
        if ((this.O0 <= 1 && ((qwVar = this.x1) == null || qwVar.getVisibility() != 0 || TextUtils.isEmpty(this.x1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j10, View view) {
        if (this.h2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.E2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.f6) {
            ((org.telegram.ui.Cells.f6) view).s(true, true);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        ax axVar;
        return (this.f2 || (axVar = this.B3) == null || axVar.getFragment() == null) ? i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.d6)) > 0.699999988079071d : this.B3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(rf.f0 f0Var) {
        ox oxVar;
        if (!this.l3 || (oxVar = this.y0) == null) {
            return;
        }
        ArrayList arrayList = oxVar.w0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (f0Var.b((rf.f0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(f0Var);
        ux uxVar = this.T;
        uxVar.B.add(f0Var);
        uxVar.E = r1.size() - 1;
        uxVar.f();
        this.T.r.getText().clear();
        W4(true, null, null, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j4(long j10) {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i11 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i11 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i11);
                    i11++;
                    j4(dialog2.id);
                }
                return;
            }
            return;
        }
        int i12 = this.a0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i12 == 7 || i12 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.a0[0].s == 8 ? (char) 1 : (char) 0];
        }
        this.u3 = 2;
        int i13 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            A4(true, true);
            o3();
            if (this.N1 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.N1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.N1.get(i14)).id == j10) {
                        i13 = i14;
                        break;
                    }
                    i14++;
                }
                if (i13 < 0) {
                    A4(false, false);
                }
                i10 = i13;
                if (!getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
                    getMessagesController().markAllTopicsAsRead(j10);
                }
                getMessagesController().markMentionsAsRead(j10, 0L);
                MessagesController messagesController = getMessagesController();
                int i15 = dialog.top_message;
                messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                if (i10 < 0) {
                    this.N1.remove(i10);
                    this.a0[0].x.D();
                    this.a0[0].q(true);
                    return;
                }
                return;
            }
        }
        i10 = -1;
        if (!getMessagesController().isForum(j10)) {
        }
        getMessagesController().markAllTopicsAsRead(j10);
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController2 = getMessagesController();
        int i152 = dialog.top_message;
        messagesController2.markDialogAsRead(j10, i152, i152, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i10 < 0) {
        }
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.R2 == 0 && this.T2 == 0 && Build.VERSION.SDK_INT >= 33 && nj0.n(parentActivity)) {
            if (z10) {
                showDialog(new nj0(parentActivity, !org.telegram.ui.Components.yd0.c(), new tv(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.Q1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.w(parentActivity, new nv(this, 1)).a;
                this.P1 = c2Var;
                showDialog(c2Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!arrayList.isEmpty()) {
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        } else if (this.w0) {
            this.w0 = false;
            J4();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.ChatObject.getPublicUsername(r6) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            TLRPC.RequestPeerType requestPeerType = this.C;
            if (isChannelAndNotMegaGroup == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.C.bot_participant) == null || !bool2.booleanValue() || getMessagesController().isInChatCached(chat, user) || ChatObject.canAddBotsToChat(chat)))) {
                Boolean bool3 = this.C.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.C.forum;
                if ((bool4 == null || bool4.booleanValue() == ChatObject.isForum(chat)) && ((this.C.user_admin_rights == null || getMessagesController().matchesAdminRights(chat, getUserConfig().getCurrentUser(), this.C.user_admin_rights)) && (this.C.bot_admin_rights == null || getMessagesController().matchesAdminRights(chat, user, this.C.bot_admin_rights) || ChatObject.canAddAdmins(chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l3(CharSequence charSequence) {
        if (this.x1 == null) {
            return;
        }
        if (this.z2 == null && this.A2 == null && this.B2 == null) {
            return;
        }
        if (this.C2 == null) {
            org.telegram.ui.Components.iq0 iq0Var = new org.telegram.ui.Components.iq0(getParentActivity(), getResourceProvider());
            this.C2 = iq0Var;
            int i10 = 0;
            iq0Var.setLayoutClickListener(new jv(this, i10));
            this.C2.setOnModeChangeListener(new kv(this, i10));
            qw qwVar = this.x1;
            org.telegram.ui.Components.iq0 iq0Var2 = this.C2;
            if (iq0Var2 == null) {
                qwVar.getClass();
            } else {
                qwVar.B1 = iq0Var2;
                qwVar.addView(iq0Var2, 0, i7.f6.e(-1, 48, 51));
                qwVar.b3 = false;
                qwVar.M();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C2.getLayoutParams();
            layoutParams.rightMargin = -this.x1.getPaddingRight();
            this.C2.setLayoutParams(layoutParams);
        }
        if (a4()) {
            this.C2.i(this.currentAccount, this.z2);
        } else {
            String str = this.A2;
            if (str != null) {
                org.telegram.ui.Components.iq0 iq0Var3 = this.C2;
                iq0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    iq0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.B2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.iq0 iq0Var4 = this.C2;
                    iq0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        iq0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.x1.setFieldText(charSequence);
        }
        this.x1.setOverrideHint(LocaleController.getString(a4() ? R.string.AddCaption : R.string.ShareComment));
        v3();
        if (this.C2.getMode() != 0) {
            this.x1.x1(false, false);
        }
        b5();
    }

    public final boolean l4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.C;
        if (user == null || UserObject.isReplyUser(user) || UserObject.isDeleted(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3() {
        lg.e eVar;
        qg.d dVar;
        qg.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.h4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.c4) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int dp3 = AndroidUtilities.dp(this.G ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        ew ewVar = this.v0;
        boolean z10 = false;
        int measuredHeight2 = dp3 + ((ewVar == null || ewVar.getVisibility() != 0) ? 0 : this.v0.getMeasuredHeight());
        org.telegram.ui.Components.fs fsVar = this.F1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((fsVar == null || fsVar.getVisibility() != 0) ? 0 : this.F1.getSumHeightOfAllVisibleChild()) + ((int) this.J);
        int measuredHeight3 = this.actionBar.getMeasuredHeight();
        this.r4.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (this.V != null ? r9.getMeasuredHeight() : 0), this.b.e) + dp);
        boolean z11 = this.S;
        RectF rectF = this.s4;
        if (!z11) {
            if (this.x1 != null && this.u1 != null) {
                rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - n3(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            }
            eVar.g(z10 ? 2 : 1, this.q4);
            eVar.e(this.p4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar = this.i4;
            if (dVar != null) {
                dVar.h(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar.j();
            }
            dVar2 = this.j4;
            if (dVar2 == null) {
                dVar2.h(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar2.j();
                return;
            }
            return;
        }
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        z10 = true;
        eVar.g(z10 ? 2 : 1, this.q4);
        eVar.e(this.p4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar = this.i4;
        if (dVar != null) {
        }
        dVar2 = this.j4;
        if (dVar2 == null) {
        }
    }

    public final void m4(View view) {
        int i10 = 0;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        iv ivVar = new iv(this, i10);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = ivVar;
        showDialog(f3Var);
    }

    public final int n3() {
        if (this.x1 != null) {
            return (int) (this.u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.T2 == 0) {
            return this.c4 + this.e4;
        }
        return AndroidUtilities.dp(72.0f) + this.c4;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0416  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n4(View view, int i10, f2.p0 p0Var) {
        f2.p0 p0Var2;
        long j10;
        MessageObject messageObject;
        long j11;
        long j12;
        boolean z10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Components.mn0 mn0Var;
        ax axVar;
        long j13;
        long j14;
        MessageObject messageObject2;
        int i14;
        long makeEncryptedDialogId;
        long j15;
        long j16;
        ox oxVar;
        TLRPC.Document greetingsSticker;
        boolean z11;
        ox oxVar2;
        int i15;
        Object I;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = p0Var instanceof rf.l;
        if (z12) {
            rf.l lVar = (rf.l) p0Var;
            int i17 = lVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    I = lVar.I(i10);
                    if (this.y2 == null && lVar.n && p0Var.j(i10) == 21) {
                        this.y2.J(this);
                        return;
                    }
                    if (I instanceof TLRPC.User) {
                        if (I instanceof TLRPC.Chat) {
                            j18 = ((TLRPC.Chat) I).id;
                        } else if (I instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.t(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new fy(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.t(null)) {
                                M4(j17, view);
                                return;
                            }
                            p0Var2 = p0Var;
                            i11 = i16;
                            messageObject = null;
                            i13 = i15;
                            j12 = j17;
                            z10 = false;
                            i12 = 0;
                            j11 = 0;
                            j10 = 0;
                        } else if (I instanceof TLRPC.TL_recentMeUrlChat) {
                            j18 = ((TLRPC.TL_recentMeUrlChat) I).chat_id;
                        } else if (I instanceof TLRPC.TL_recentMeUrlUser) {
                            j17 = ((TLRPC.TL_recentMeUrlUser) I).user_id;
                        } else {
                            if (!(I instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (I instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) I).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSet.id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.nx0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) I;
                            p0Var2 = p0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.c80(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j17 = -chat2.id;
                            i16 = 0;
                            i11 = i16;
                            messageObject = null;
                            i13 = i15;
                            j12 = j17;
                            z10 = false;
                            i12 = 0;
                            j11 = 0;
                            j10 = 0;
                        }
                        j17 = -j18;
                    } else {
                        j17 = ((TLRPC.User) I).id;
                    }
                    p0Var2 = p0Var;
                    i16 = 0;
                    i11 = i16;
                    messageObject = null;
                    i13 = i15;
                    j12 = j17;
                    z10 = false;
                    i12 = 0;
                    j11 = 0;
                    j10 = 0;
                }
            }
            i15 = 0;
            I = lVar.I(i10);
            if (this.y2 == null) {
            }
            if (I instanceof TLRPC.User) {
            }
            p0Var2 = p0Var;
            i16 = 0;
            i11 = i16;
            messageObject = null;
            i13 = i15;
            j12 = j17;
            z10 = false;
            i12 = 0;
            j11 = 0;
            j10 = 0;
        } else {
            p0Var2 = p0Var;
            ox oxVar3 = this.y0;
            if (oxVar3 == null || p0Var2 != (mn0Var = oxVar3.U)) {
                j10 = 0;
                messageObject = null;
                j11 = 0;
                j12 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            } else {
                Object J = mn0Var.J(i10);
                z10 = this.y0.U.O(i10);
                if (J instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) J;
                    makeEncryptedDialogId = user.id;
                    if (!this.h2) {
                        this.S1 = makeEncryptedDialogId;
                        this.T1 = user;
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) J;
                    makeEncryptedDialogId = -chat3.id;
                    if (!this.h2) {
                        this.S1 = makeEncryptedDialogId;
                        this.T1 = chat3;
                    }
                } else if (J instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) J;
                    makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
                    if (!this.h2) {
                        this.S1 = makeEncryptedDialogId;
                        this.T1 = encryptedChat;
                    }
                } else {
                    if (J instanceof MessageObject) {
                        messageObject2 = (MessageObject) J;
                        long dialogId = messageObject2.getDialogId();
                        int id2 = messageObject2.getId();
                        j10 = 0;
                        j14 = ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-dialogId))) ? MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true) : 0L;
                        ox oxVar4 = this.y0;
                        if (oxVar4 != null) {
                            org.telegram.ui.Components.mn0 mn0Var2 = oxVar4.U;
                            mn0Var2.f0.a(mn0Var2.V);
                        }
                        i14 = id2;
                        j13 = dialogId;
                    } else {
                        j10 = 0;
                        if (J instanceof String) {
                            String str2 = (String) J;
                            ox oxVar5 = this.y0;
                            if (oxVar5 != null && !oxVar5.U.F.isEmpty()) {
                                this.T.r.setText(str2);
                                this.T.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                kj0 kj0Var = new kj0(getParentActivity(), this);
                                kj0Var.v(str2, true);
                                kj0Var.show();
                            }
                        } else if (J instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) J;
                            org.telegram.ui.Components.c5.v(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((J instanceof TLRPC.TL_forumTopic) && (axVar = this.B3) != null && (axVar.getFragment() instanceof ze1)) {
                            j13 = -((ze1) this.B3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) J).id;
                            messageObject2 = null;
                            i14 = 0;
                        }
                        messageObject2 = null;
                        j14 = 0;
                        j13 = 0;
                        i14 = 0;
                    }
                    if (j13 == j10 && this.actionBar.s()) {
                        if (this.actionBar.t("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            M4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = j14;
                    i13 = 0;
                    i12 = i14;
                    messageObject = messageObject2;
                    i11 = 0;
                }
                messageObject2 = null;
                j13 = makeEncryptedDialogId;
                i14 = 0;
                j14 = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = j14;
                i13 = 0;
                i12 = i14;
                messageObject = messageObject2;
                i11 = 0;
            }
        }
        if (j12 == j10) {
            return;
        }
        if (this.h2) {
            if (h5(j12)) {
                if ((!getMessagesController().isForum(j12) && !getMessagesController().isCommunity(j12)) || f4(j12)) {
                    ArrayList arrayList = this.E2;
                    if (!arrayList.isEmpty() || (this.N0 == 3 && this.b2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || p3(j12)) {
                            boolean i32 = i3(j12, view);
                            ox oxVar6 = this.y0;
                            if (oxVar6 != null && p0Var2 == oxVar6.U) {
                                this.actionBar.h(true);
                                P3(j12, i32);
                            }
                            a5();
                            return;
                        }
                        return;
                    }
                }
                if (this.i2 && getMessagesController().isCommunity(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    fy fyVar = new fy(bundle2);
                    fyVar.S2 = this;
                    fyVar.y2 = this.y2;
                    presentFragment(fyVar);
                    return;
                }
                if (!this.i2 || ((!getMessagesController().isForum(j12) || f4(j12)) && !getMessagesController().isMonoForumWithManageRights(j12))) {
                    O3(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.N0 == 1);
                bundle3.putBoolean("quote", this.K0);
                bundle3.putBoolean("reply_to", this.J0);
                ze1 ze1Var = new ze1(bundle3);
                ze1Var.H0 = this;
                presentFragment(ze1Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (DialogObject.isEncryptedDialog(j12)) {
            bundle4.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else if (DialogObject.isUserDialog(j12)) {
            bundle4.putLong("user_id", j12);
        } else {
            if (i12 != 0) {
                j15 = j11;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(-j12));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle4.putLong("migrated_to", j12);
                    j16 = -chat4.migrated_to.channel_id;
                    bundle4.putLong("chat_id", -j16);
                    if (i12 != 0) {
                        bundle4.putInt("message_id", i12);
                    } else if (z10) {
                        TLObject tLObject = this.T1;
                        if (tLObject != null) {
                            ox oxVar7 = this.y0;
                            if (oxVar7 != null) {
                                oxVar7.U.R(this.S1, tLObject);
                            }
                            this.T1 = null;
                        }
                    } else {
                        J3();
                    }
                    boolean z13 = LocaleController.isRTL && !this.f2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.T2 == j10;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j12) || !z13) && this.l2.dialogId == j12 && ((oxVar2 = this.y0) == null || p0Var2 != oxVar2.U))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.o0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (j7.l1.j(1, fragmentStack) instanceof tn)) {
                                ((tn) j7.l1.j(1, fragmentStack)).U9();
                                return;
                            }
                            if (fragmentStack.size() == 2) {
                                launchActivity.o0.l(true, false);
                                return;
                            } else {
                                if (getParentActivity() instanceof LaunchActivity) {
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(0);
                                    fragmentStack.clear();
                                    fragmentStack.add(o2Var);
                                    launchActivity.o0.U(true, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    oxVar = this.y0;
                    if (oxVar != null && oxVar.u0) {
                        oxVar.Q(false);
                    }
                    if (j12 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.z0 == null) {
                            this.z0 = new org.telegram.ui.Components.iu0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.y90(bundle5, this.z0));
                        return;
                    }
                    if (this.j2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            tn tnVar = new tn(bundle4);
                            d4(tnVar, messageObject);
                            presentFragment(tnVar);
                            return;
                        }
                        return;
                    }
                    this.v3 = true;
                    if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j12));
                        TLRPC.Dialog dialog2 = getMessagesController().getDialog(j12);
                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                        boolean z14 = dialog2 != null && dialog2.view_forum_as_messages;
                        int b10 = (this.T2 == j10 || chat5 == null) ? 0 : qh.p0.b(this.currentAccount, -chat5.id);
                        if (b10 == 3) {
                            showDialog(new org.telegram.ui.Components.c80(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (b10 == 4) {
                            j7.l1.v(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.tc.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z11 = chat5.monoforum) || chat5.forum) && j15 == j10)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new fy(bundle6));
                                return;
                            }
                            tn tnVar2 = new tn(bundle4);
                            if (j15 != j10) {
                                yf.d.a(tnVar2, MessagesStorage.TopicKey.of(j12, j15));
                            }
                            if (z12 && DialogObject.isUserDialog(j12) && getMessagesController().dialogs_dict.f(j12) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                tnVar2.x9 = greetingsSticker;
                                tnVar2.y9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                ax axVar2 = this.B3;
                                if (axVar2.a != null) {
                                    axVar2.a();
                                }
                            }
                            d4(tnVar2, messageObject);
                            presentFragment(tnVar2);
                            return;
                        }
                        if (z11) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            tn tnVar3 = new tn(bundle4);
                            d4(tnVar3, messageObject);
                            presentFragment(tnVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            tn tnVar4 = new tn(bundle4);
                            yf.d.a(tnVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(tnVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.T2 != j10) {
                            if (!z14) {
                                presentFragment(new ze1(bundle4));
                                return;
                            }
                            tn tnVar5 = new tn(bundle4);
                            d4(tnVar5, messageObject);
                            presentFragment(tnVar5);
                            return;
                        }
                        if (!z13) {
                            if (!z14) {
                                presentFragment(new ze1(bundle4));
                                return;
                            }
                            tn tnVar6 = new tn(bundle4);
                            d4(tnVar6, messageObject);
                            presentFragment(tnVar6);
                            return;
                        }
                        if (this.f2) {
                            return;
                        }
                        if (z14) {
                            tn tnVar7 = new tn(bundle4);
                            d4(tnVar7, messageObject);
                            presentFragment(tnVar7);
                            return;
                        }
                        ax axVar3 = this.B3;
                        hx hxVar = axVar3.a;
                        if (hxVar == null || (-hxVar.a) != j12) {
                            ay ayVar = this.a0[0].a;
                            ayVar.l3 = 0.0f;
                            ayVar.m3 = ayVar.k3;
                            ayVar.n3 = ayVar.e3 != 0.0f;
                            hx hxVar2 = new hx(bundle4);
                            hxVar2.I0 = this;
                            final ax axVar4 = this.B3;
                            org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = axVar4.n;
                            if (!axVar4.r) {
                                axVar4.w = parentLayout;
                                hxVar2.onFragmentCreate();
                                hxVar2.setInPreviewMode(true);
                                hxVar2.setParentLayout(parentLayout);
                                View performCreateView = hxVar2.performCreateView(axVar4.getContext());
                                hxVar2.onResume();
                                axVar4.b = performCreateView;
                                axVar4.addView(performCreateView);
                                final hx hxVar3 = axVar4.a;
                                n0 n0Var = hxVar2.e;
                                axVar4.c = n0Var;
                                axVar4.addView(n0Var);
                                axVar4.a = hxVar2;
                                h31.M = j10;
                                h31.M = -hxVar2.a;
                                if (hxVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.l actionBar = hxVar2.getActionBar();
                                    axVar4.d = actionBar;
                                    axVar4.addView(actionBar);
                                    axVar4.d.Q0 = new ky0(axVar4, 10);
                                }
                                if (hxVar3 != null) {
                                    final hx hxVar4 = axVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.k kVar = axVar4.x;
                                        if (kVar != null) {
                                            kVar.c();
                                        }
                                        hxVar4.onTransitionAnimationStart(true, false);
                                        axVar4.A = hxVar3;
                                        axVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.k kVar2 = new o1.k(new ib.a(0.0f));
                                        axVar4.x = kVar2;
                                        kVar2.u = th.l(1000.0f, 400.0f, 1.0f);
                                        h31.f(hxVar3, hxVar4, 0.0f);
                                        axVar4.x.b(new cd0(axVar4, i18));
                                        axVar4.x.a(new o1.g() { // from class: org.telegram.ui.f31
                                            @Override // o1.g
                                            public final void a(o1.i iVar, boolean z15, float f9, float f10) {
                                                h31 h31Var = axVar4;
                                                if (h31Var.x == null) {
                                                    return;
                                                }
                                                h31Var.x = null;
                                                org.telegram.ui.ActionBar.o2 o2Var2 = hxVar4;
                                                o2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.o2 o2Var3 = hxVar3;
                                                h31.f(o2Var3, o2Var2, 1.0f);
                                                h31Var.v = false;
                                                h31Var.A = null;
                                                o2Var3.onPause();
                                                o2Var3.onFragmentDestroy();
                                                h31Var.removeView(o2Var3.getFragmentView());
                                                h31Var.removeView(o2Var3.getActionBar());
                                                h31Var.n.unlock();
                                            }
                                        });
                                        axVar4.x.f();
                                    } else {
                                        hxVar4.onTransitionAnimationStart(true, false);
                                        hxVar4.onTransitionAnimationEnd(true, false);
                                        h31.f(hxVar3, hxVar4, 1.0f);
                                        axVar4.v = false;
                                        axVar4.A = null;
                                        hxVar3.onPause();
                                        hxVar3.onFragmentDestroy();
                                        axVar4.removeView(hxVar3.getFragmentView());
                                        axVar4.removeView(hxVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!axVar4.f) {
                                    axVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        axVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        axVar4.e = 0.0f;
                                        axVar4.e(true);
                                        axVar4.g();
                                        hxVar2.onTransitionAnimationStart(true, false);
                                        axVar4.h.addUpdateListener(new e31(axVar4, 1));
                                        axVar4.h.addListener(new org.telegram.ui.Components.ok0(14, axVar4, hxVar2));
                                        axVar4.h.setDuration(250L);
                                        axVar4.h.setInterpolator(org.telegram.ui.Components.jr.f);
                                        axVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        axVar4.h.start();
                                    } else {
                                        axVar4.e(true);
                                        hxVar2.onTransitionAnimationStart(true, false);
                                        hxVar2.onTransitionAnimationEnd(true, false);
                                        axVar4.e = 1.0f;
                                        axVar4.g();
                                        axVar4.d(false);
                                    }
                                }
                                hxVar2.setPreviewDelegate(new zk0(axVar4, 16));
                                WeakHashMap weakHashMap = r0.j0.a;
                                r0.z.c(axVar4);
                            }
                        } else {
                            axVar3.a();
                        }
                        ox oxVar8 = this.y0;
                        if (oxVar8 != null) {
                            oxVar8.R();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                j15 = j11;
            }
            j16 = j12;
            bundle4.putLong("chat_id", -j16);
            if (i12 != 0) {
            }
            if (LocaleController.isRTL) {
            }
            bundle4.putInt("dialog_folder_id", i11);
            bundle4.putInt("dialog_filter_id", i13);
            if (!AndroidUtilities.isTablet()) {
            }
            oxVar = this.y0;
            if (oxVar != null) {
                oxVar.Q(false);
            }
            if (j12 != getUserConfig().getClientUserId()) {
            }
            if (this.j2 != null) {
            }
        }
        j15 = j11;
        if (i12 != 0) {
        }
        if (LocaleController.isRTL) {
        }
        bundle4.putInt("dialog_folder_id", i11);
        bundle4.putInt("dialog_filter_id", i13);
        if (!AndroidUtilities.isTablet()) {
        }
        oxVar = this.y0;
        if (oxVar != null) {
        }
        if (j12 != getUserConfig().getClientUserId()) {
        }
        if (this.j2 != null) {
        }
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new ev(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f9, org.telegram.ui.Components.il0 il0Var) {
        org.telegram.ui.Components.mn0 mn0Var;
        org.telegram.ui.Components.mn0 mn0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.x2) && il0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.h2 && (view instanceof org.telegram.ui.Cells.p2)) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (!getMessagesController().isForum(p2Var.getDialogId()) && !this.B3.c() && p2Var.S(f9)) {
                    return H4(p2Var);
                }
            }
            ax axVar = this.B3;
            if (axVar == null || !axVar.c()) {
                ox oxVar = this.y0;
                if (oxVar != null && il0Var == (mn0Var2 = oxVar.U)) {
                    Object J = mn0Var2.J(i10);
                    if (!this.y0.U.J) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, yf.d.i(chat, this.currentAccount, false));
                            } else {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.id == getUserConfig().clientUserId) {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            c2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r11.id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new f3.e(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                        }
                        return true;
                    }
                }
                ox oxVar2 = this.y0;
                if (oxVar2 == null || il0Var != (mn0Var = oxVar2.U)) {
                    Object I = ((rf.l) il0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.h2) {
                            if ((this.N0 == 3 || I3()) && h5(dialog.id)) {
                                if (this.N0 != 1 || !I3() || !this.i2 || !getMessagesController().isForum(dialog.id)) {
                                    i3(dialog.id, view);
                                    a5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.N0 == 1);
                                bundle.putBoolean("quote", this.K0);
                                bundle.putBoolean("reply_to", this.J0);
                                ze1 ze1Var = new ze1(bundle);
                                ze1Var.H0 = this;
                                presentFragment(ze1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                m4(view);
                                return false;
                            }
                            if (!this.actionBar.s() || !g4(dialog)) {
                                M4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.h2) {
                        n4(view, i10, il0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.f6) || mn0Var.O(i10)) ? 0L : ((org.telegram.ui.Cells.f6) view).getDialogId();
                    if (dialogId != 0) {
                        M4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.B3.c() || !this.B3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.j70 j70Var = this.H0;
            if (j70Var == null) {
                ew ewVar = this.v0;
                if (ewVar == null || !ewVar.n) {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar == null || !lVar.s()) {
                        if (!this.b.f) {
                            ew ewVar2 = this.v0;
                            if (ewVar2 != null && ewVar2.getVisibility() == 0 && !this.c3) {
                                ew ewVar3 = this.v0;
                                if (!ewVar3.K && !this.h3) {
                                    ArrayList arrayList = ewVar3.h;
                                    if (!arrayList.isEmpty() && ewVar3.H != ((org.telegram.ui.Components.c00) arrayList.get(0)).a) {
                                        if (z10) {
                                            ew ewVar4 = this.v0;
                                            ArrayList arrayList2 = ewVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                ewVar4.f((org.telegram.ui.Components.c00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            qw qwVar = this.x1;
                            if (qwVar == null || !qwVar.t0()) {
                                xw xwVar = this.A0;
                                if (xwVar.K != 0 || xwVar.O.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                xwVar.h.x0(0);
                                return false;
                            }
                            if (z10) {
                                this.x1.m0(true);
                            }
                        } else if (z10) {
                            this.T.r.getText().clear();
                            this.U.b(false);
                            this.T.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        ox oxVar = this.y0;
                        if (oxVar != null && oxVar.getVisibility() == 0) {
                            this.y0.Q(false);
                        }
                        b4(true);
                        return false;
                    }
                } else if (z10) {
                    ewVar.setIsEditing(false);
                    I4(false);
                    return false;
                }
            } else if (z10) {
                j70Var.u();
                this.H0 = null;
                return false;
            }
        } else if (z10) {
            this.B3.a();
            ox oxVar2 = this.y0;
            if (oxVar2 != null) {
                oxVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        cg.h0 h0Var;
        ew ewVar;
        if (this.R1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.h(true);
            }
            TLObject tLObject = this.T1;
            if (tLObject != null) {
                ox oxVar = this.y0;
                if (oxVar != null) {
                    oxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
            }
            this.R1 = false;
        }
        if (!this.G && (ewVar = this.v0) != null && ewVar.getVisibility() == 0 && this.r.f) {
            int i10 = (int) (-this.J);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.a0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (h0Var = this.G0) != null && h0Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.n0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        nh.t3 t3Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = R3(this.currentAccount, this.N0, this.R2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.n0 && !this.o0 && (t3Var = this.l0) != null && this.K3) {
            this.o0 = true;
            this.n0 = false;
            t3Var.v();
        }
        AndroidUtilities.runOnUIThread(new vv(this, 3), 200L);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.j70 j70Var = this.H0;
        if (j70Var != null) {
            j70Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.c2 c2Var;
        super.onDialogDismiss(dialog);
        if (this.R2 == 0 && this.T2 == 0 && (c2Var = this.P1) != null && dialog == c2Var && getParentActivity() != null) {
            k3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.h2 = bundle.getBoolean("onlySelect", false);
            this.i2 = this.arguments.getBoolean("canSelectTopics", false);
            this.m2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.N0 = this.arguments.getInt("dialogsType", 0);
            this.K0 = this.arguments.getBoolean("quote", false);
            this.J0 = this.arguments.getBoolean("reply_to", false);
            this.L0 = this.arguments.getLong("reply_to_author", 0L);
            this.M0 = this.arguments.getLong("forward_into_channel", 0L);
            this.b2 = this.arguments.getString("selectAlertString");
            this.c2 = this.arguments.getString("selectAlertStringGroup");
            this.d2 = this.arguments.getString("addToGroupAlertString");
            this.n2 = this.arguments.getBoolean("allowSwitchAccount");
            this.o2 = this.arguments.getBoolean("checkCanWrite", true);
            this.p2 = this.arguments.getBoolean("afterSignup", false);
            this.R2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.T2 = j10;
            if (j10 != 0) {
                this.U2 = getMessagesController().getChat(Long.valueOf(this.T2));
                this.V2 = getMessagesController().getChatFull(this.T2);
            }
            this.e2 = this.arguments.getBoolean("resetDelegate", true);
            this.O0 = this.arguments.getInt("messagesCount", 0);
            this.P0 = this.arguments.getInt("hasPoll", 0);
            this.Q0 = this.arguments.getBoolean("hasInvoice", false);
            this.q2 = this.arguments.getBoolean("showSetPasswordConfirm", this.q2);
            this.arguments.getInt("otherwiseRelogin");
            this.r2 = this.arguments.getBoolean("allowGroups", true);
            this.s2 = this.arguments.getBoolean("allowMegagroups", true);
            this.t2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.u2 = this.arguments.getBoolean("allowChannels", true);
            this.v2 = this.arguments.getBoolean("allowUsers", true);
            this.w2 = this.arguments.getBoolean("allowBots", true);
            this.x2 = this.arguments.getBoolean("closeFragment", true);
            this.B = this.arguments.getBoolean("allowGlobalSearch", true);
            this.S = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.C = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.D = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.N0 == 0) {
            this.Q1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.F3 = getNotificationCenter().createObserversGroup(this);
        this.G3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.j2 == null) {
            this.Z1 = getConnectionsManager().getConnectionState();
            this.G3.add(NotificationCenter.emojiLoaded);
            if (!this.h2) {
                this.G3.add(NotificationCenter.closeSearchByActiveAction);
                this.G3.add(NotificationCenter.proxySettingsChanged);
                this.F3.add(NotificationCenter.filterSettingsUpdated);
                this.F3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.F3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.G3.add(NotificationCenter.didSetPasscode);
        }
        this.F3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.N0 == 0) {
            this.F3.add(NotificationCenter.chatlistFolderUpdate);
            this.F3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        lh.s6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new lh.r5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
        if (this.N3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            ru ruVar = this.N3;
            if (ruVar.getParent() != null) {
                ((ViewGroup) ruVar.getParent()).removeView(ruVar);
            }
            this.N3 = null;
        }
        if (e4()) {
            lh.s6 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.T2 != 0) {
            getMessagesController().loadFullChat(this.T2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        this.e4 = this.S ? AndroidUtilities.dp(72.0f) : 0;
        this.f4 = this.S ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.F3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F3 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.G3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.G3 = null;
        }
        qw qwVar = this.x1;
        if (qwVar != null) {
            qwVar.B0();
        }
        org.telegram.ui.Components.iq0 iq0Var = this.C2;
        if (iq0Var != null) {
            iq0Var.j();
        }
        org.telegram.ui.Components.voip.o oVar = this.D2;
        if (oVar != null) {
            AndroidUtilities.cancelRunOnUIThread(oVar);
            this.D2 = null;
        }
        UndoView undoView = this.u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.k3.unlock();
        this.y2 = null;
        ba1 ba1Var = ba1.b;
        if (ba1Var != null) {
            ba1Var.dismiss();
            ba1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPanTranslationUpdate(float f9) {
        if (this.a0 == null) {
            return;
        }
        this.F0 = f9;
        qw qwVar = this.x1;
        int i10 = 0;
        if (qwVar == null || !qwVar.t0()) {
            while (true) {
                ey[] eyVarArr = this.a0;
                if (i10 >= eyVarArr.length) {
                    break;
                }
                eyVarArr[i10].setTranslationY(f9);
                i10++;
            }
            if (!this.h2) {
                this.actionBar.setTranslationY(f9);
                org.telegram.ui.Components.mc mcVar = this.j3;
                if (mcVar != null) {
                    mcVar.l();
                }
            }
            ox oxVar = this.y0;
            if (oxVar != null) {
                oxVar.setTranslationY(this.F0 + this.E0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f9);
        while (true) {
            ey[] eyVarArr2 = this.a0;
            if (i10 >= eyVarArr2.length) {
                break;
            }
            eyVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.h2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.mc mcVar2 = this.j3;
            if (mcVar2 != null) {
                mcVar2.l();
            }
        }
        ox oxVar2 = this.y0;
        if (oxVar2 != null) {
            oxVar2.setTranslationY(this.E0);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.mc mcVar = this.O;
        if (mcVar != null) {
            mcVar.b();
            this.O = null;
        }
        ax axVar = this.B3;
        if (axVar != null) {
            axVar.r = true;
            hx hxVar = axVar.a;
            if (hxVar != null) {
                hxVar.onPause();
            }
        }
        org.telegram.ui.Components.j70 j70Var = this.H0;
        if (j70Var != null) {
            j70Var.u();
        }
        qw qwVar = this.x1;
        if (qwVar != null) {
            qwVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.a0 == null) {
            return;
        }
        while (true) {
            ey[] eyVarArr = this.a0;
            if (i10 >= eyVarArr.length) {
                return;
            }
            eyVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        int i11;
        if (i10 != 1) {
            if (i10 == 4) {
                for (int i12 : iArr) {
                    if (i12 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                    return;
                }
                filesMigrationBottomSheet.migrateOldFolder();
                return;
            }
            return;
        }
        for (int i13 = 0; i13 < strArr.length; i13++) {
            if (iArr.length > i13) {
                String str = strArr[i13];
                str.getClass();
                i11 = 2;
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i13] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            nj0.m();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i13] == 0) {
                            ImageLoader.getInstance().checkMediaPaths();
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i13] == 0) {
                            AndroidUtilities.runOnUIThread(new vv(this, i11));
                            getContactsController().forceImportContacts();
                            break;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                            this.Q1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.w0) {
            this.w0 = false;
            J4();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        fy fyVar;
        ey eyVar;
        nw nwVar;
        int i10;
        org.telegram.ui.Components.mn0 mn0Var;
        cg.h0 h0Var;
        super.onResume();
        xw xwVar = this.A0;
        if (xwVar != null) {
            ArrayList arrayList = xwVar.x;
            lh.s6 s6Var = xwVar.s;
            s6Var.l(s6Var.g);
            s6Var.l(s6Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y8 = s6Var.y(((lh.m) arrayList.get(i11)).c);
                if (y8 != null) {
                    s6Var.X(y8);
                }
            }
        }
        ax axVar = this.B3;
        if (axVar != null) {
            axVar.r = false;
            hx hxVar = axVar.a;
            if (hxVar != null) {
                hxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (h0Var = this.G0) != null && h0Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        if (this.a0 != null) {
            int i12 = 0;
            while (true) {
                ey[] eyVarArr = this.a0;
                if (i12 >= eyVarArr.length) {
                    break;
                }
                eyVarArr[i12].d.l();
                i12++;
            }
        }
        qw qwVar = this.x1;
        if (qwVar != null) {
            qwVar.E0();
        }
        long j10 = 0;
        if (!this.h2 && this.R2 == 0 && this.T2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        ox oxVar = this.y0;
        if (oxVar != null && (mn0Var = oxVar.U) != null) {
            mn0Var.l();
        }
        boolean z10 = this.p2 || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.R2 == 0 && this.T2 == 0 && this.Y1 && !this.h2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Y1 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                fyVar = this;
                org.telegram.messenger.m1 m1Var = new org.telegram.messenger.m1(fyVar, z13, z11, z12, parentActivity);
                if (fyVar.p2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(m1Var, j10);
            } else {
                fyVar = this;
            }
        } else {
            fyVar = this;
            if (!fyVar.h2 && fyVar.R2 == 0 && fyVar.T2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new kv(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.xo0(15));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (fyVar.R2 == 0 && fyVar.T2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new kv(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.xo0(16));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        J4();
        if (fyVar.a0 != null) {
            int i13 = 0;
            while (true) {
                ey[] eyVarArr2 = fyVar.a0;
                if (i13 >= eyVarArr2.length) {
                    break;
                }
                ey eyVar2 = eyVarArr2[i13];
                if (eyVar2.s == 0 && eyVar2.v == 2 && eyVar2.c.L0() == 0 && Z3()) {
                    fyVar.a0[i13].c.h1(1, (int) fyVar.J);
                }
                if (i13 == 0) {
                    fyVar.a0[i13].d.getClass();
                } else {
                    fyVar.a0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new w8(this, 4));
        if (fyVar.l3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), fyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ba1.n(this);
        }
        B3();
        if (fyVar.v0 == null || (eyVar = fyVar.a0[0]) == null || (nwVar = eyVar.d) == null) {
            return;
        }
        int i14 = nwVar.h;
        if (i14 == 7 || i14 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i14 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                fyVar.v0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onSlideProgress(boolean z10, float f9) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.V3 && this.W3 == null) {
            F4(f9);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        cg.h0 h0Var;
        fy fyVar;
        ax axVar = this.B3;
        if (axVar == null || !axVar.c()) {
            if (z10 && (h0Var = this.G0) != null && h0Var.getVisibility() == 0) {
                this.G0.setVisibility(8);
                this.G0.setBackground(null);
            }
            if (z10 && this.p2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).t0.c(false);
                }
            }
        } else {
            this.B3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (fyVar = this.S2) != null) {
            fyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        ax axVar = this.B3;
        if (axVar == null || !axVar.c()) {
            cg.h0 h0Var = this.G0;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                if (z10) {
                    this.G0.setAlpha(1.0f - f9);
                } else {
                    this.G0.setAlpha(f9);
                }
            }
        } else {
            this.B3.getFragment().onTransitionAnimationProgress(z10, f9);
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i10;
        int i11 = this.N0;
        if (i11 == 15 || i11 == 16 || this.d2 != null || !this.o2) {
            return true;
        }
        if (!DialogObject.isChatDialog(j10)) {
            if (!DialogObject.isEncryptedDialog(j10)) {
                return true;
            }
            if (this.P0 == 0 && !this.Q0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.SendMessageTitle);
            int i12 = this.P0;
            if (i12 == 3) {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i12 != 0) {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            showDialog(alertDialog$Builder.a);
            return false;
        }
        long j11 = -j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            return true;
        }
        if (!this.m2 && ChatObject.isCanWriteToChannel(j11, this.currentAccount) && (i10 = this.P0) != 2 && i10 != 3) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.a.N = LocaleController.getString(R.string.SendMessageTitle);
        int i13 = this.P0;
        if (i13 == 3) {
            alertDialog$Builder2.a.P = LocaleController.getString(R.string.TodoCantForward);
        } else if (i13 == 2) {
            alertDialog$Builder2.a.P = LocaleController.getString(R.string.PublicPollCantForward);
        } else {
            alertDialog$Builder2.a.P = LocaleController.getString(R.string.ChannelCantSendMessage);
        }
        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder2.a);
        return false;
    }

    public final void p4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(5));
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                e9Var.r(currentUser);
                cg.y yVar = new cg.y(this, getParentActivity(), z10);
                linearLayout.addView(yVar, i7.f6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getParentActivity());
                if (z10) {
                    t9Var.setScaleX(0.833f);
                    t9Var.setScaleY(0.833f);
                }
                t9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                t9Var.getImageReceiver().setCurrentAccount(intValue);
                t9Var.e(currentUser, e9Var);
                yVar.addView(t9Var, i7.f6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, i7.f6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bg.p2(this, intValue, H, 15));
                H.r(linearLayout, i7.f6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.V3 = true;
            B4(true);
        } else {
            this.W3 = null;
            this.V3 = false;
            B4(false);
            F4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        boolean presentFragment = super.presentFragment(o2Var);
        if (presentFragment && this.a0 != null) {
            int i10 = 0;
            while (true) {
                ey[] eyVarArr = this.a0;
                if (i10 >= eyVarArr.length) {
                    break;
                }
                eyVarArr[i10].d.getClass();
                i10++;
            }
        }
        nh.t3 t3Var = this.l0;
        if (t3Var != null) {
            t3Var.e(true);
        }
        nh.t3 t3Var2 = this.m0;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        org.telegram.ui.Components.mc.e();
        return presentFragment;
    }

    public final void q3(boolean z10) {
        rh.i iVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.fs fsVar = this.F1;
        if (fsVar == null || (iVar = this.M1) == null || (chatFull = this.V2) == null) {
            return;
        }
        fsVar.i(iVar, (this.T2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.M1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.V2.requests_pending, new Object[0]));
    }

    public final void q4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().deleteDialog(j10, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j10);
            }
        } else if (ChatObject.isNotInChat(chat)) {
            getMessagesController().deleteDialog(j10, 0, z11);
        } else {
            getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.R2);
    }

    public final void r3(ey eyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = eyVar.c.L0();
        int N0 = eyVar.c.N0();
        if (this.c3 || this.h3) {
            return;
        }
        ew ewVar = this.v0;
        if (ewVar != null && ewVar.getVisibility() == 0 && this.v0.K) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            f2.n1 K = eyVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.X1 = z14;
            if (z14) {
                c4(false);
            }
        } else {
            this.X1 = false;
        }
        int i11 = eyVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = eyVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(eyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, eyVar.s, 1, this.O1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                    z10 = z15;
                    z11 = false;
                } else {
                    z10 = z15;
                    z11 = true;
                }
                if ((abs > 0 || N0 < R3(this.currentAccount, eyVar.s, this.R2, this.O1).size() - 10) && (abs != 0 || (!((i10 = eyVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.R2)))) {
                    z12 = false;
                    z13 = false;
                } else {
                    boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.R2);
                    boolean z16 = !isDialogsEndReached2;
                    if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.R2)) {
                        z13 = z16;
                        z12 = false;
                    } else {
                        z13 = z16;
                        z12 = true;
                    }
                }
                if (!z12 || z11) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xv
                        @Override // java.lang.Runnable
                        public final void run() {
                            fy fyVar = fy.this;
                            if (z12) {
                                fyVar.getMessagesController().loadDialogs(fyVar.R2, -1, 100, z13);
                            }
                            if (z11) {
                                fyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                            } else {
                                fyVar.getClass();
                            }
                        }
                    });
                }
                return;
            }
        }
        z11 = false;
        z10 = false;
        if (abs > 0) {
        }
        z12 = false;
        z13 = false;
        if (z12) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xv
            @Override // java.lang.Runnable
            public final void run() {
                fy fyVar = fy.this;
                if (z12) {
                    fyVar.getMessagesController().loadDialogs(fyVar.R2, -1, 100, z13);
                }
                if (z11) {
                    fyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                } else {
                    fyVar.getClass();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    public final void r4(ArrayList arrayList, int i10, boolean z10, boolean z11, HashSet hashSet) {
        boolean z12;
        int i11;
        int i12;
        HashSet hashSet2;
        ArrayList arrayList2;
        int i13;
        long j10;
        int i14;
        int i15;
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        int i16;
        int i17;
        MessagesController.DialogFilter dialogFilter2;
        MessagesController.DialogFilter dialogFilter3;
        fy fyVar;
        int i18;
        boolean z13;
        boolean z14;
        org.telegram.ui.ActionBar.f3 f3Var;
        TLRPC.User tL_userEmpty;
        boolean z15;
        TLRPC.User user2;
        TLRPC.User user3;
        CharSequence string;
        fy fyVar2 = this;
        int i19 = i10;
        if (fyVar2.getParentActivity() == null) {
            return;
        }
        ?? r72 = 0;
        int i20 = fyVar2.a0[0].s;
        int i21 = 7;
        boolean z16 = (i20 == 7 || i20 == 8) && (!fyVar2.actionBar.s() || fyVar2.actionBar.t(null));
        MessagesController.DialogFilter dialogFilter4 = z16 ? fyVar2.getMessagesController().selectedDialogFilter[fyVar2.a0[0].s == 8 ? (char) 1 : (char) 0] : null;
        int size = arrayList.size();
        if (i19 == 105 || i19 == 107) {
            ArrayList<Long> arrayList3 = new ArrayList<>(arrayList);
            fyVar2.getMessagesController().addDialogToFolder(arrayList3, fyVar2.O2 == 0 ? 1 : 0, -1, null, 0L);
            if (fyVar2.O2 == 0) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                z12 = false;
                boolean z17 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                if (z17) {
                    i11 = 1;
                } else {
                    i11 = 1;
                    globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                }
                int i22 = z17 ? arrayList3.size() > i11 ? 4 : 2 : arrayList3.size() > i11 ? 5 : 3;
                UndoView Y3 = fyVar2.Y3();
                if (Y3 != null) {
                    Y3.l(0L, i22, null, new org.telegram.ui.Components.voip.o(10, fyVar2, arrayList3));
                }
            } else {
                z12 = false;
                ArrayList<TLRPC.Dialog> dialogs = fyVar2.getMessagesController().getDialogs(fyVar2.R2);
                if (fyVar2.a0 != null && dialogs.isEmpty() && !fyVar2.G) {
                    fyVar2.a0[0].a.setEmptyView(null);
                    fyVar2.a0[0].w.setVisibility(4);
                    fyVar2.finishFragment();
                }
            }
            fyVar2.b4(z12);
            return;
        }
        if ((i19 == 100 || i19 == 108) && fyVar2.J2 != 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = fyVar2.getMessagesController().getDialogs(fyVar2.R2);
            int size2 = dialogs2.size();
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i23 < size2) {
                TLRPC.Dialog dialog = dialogs2.get(i23);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!fyVar2.g4(dialog)) {
                        i13 = size2;
                        if (!fyVar2.getMessagesController().isPromoDialog(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i13 = size2;
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            i25++;
                        } else {
                            i24++;
                        }
                    }
                } else {
                    i13 = size2;
                }
                i23++;
                size2 = i13;
            }
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                Long l10 = (Long) arrayList.get(i29);
                long longValue = l10.longValue();
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) fyVar2.getMessagesController().dialogs_dict.f(longValue);
                if (dialog2 != null && !fyVar2.g4(dialog2)) {
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        i27++;
                    } else {
                        i26++;
                    }
                    if (dialogFilter4 != null && dialogFilter4.alwaysShow.contains(l10)) {
                        i28++;
                    }
                }
            }
            if (z16) {
                i12 = 100 - dialogFilter4.alwaysShow.size();
            } else if (fyVar2.R2 == 0 && dialogFilter4 == null) {
                i12 = fyVar2.getUserConfig().isPremium() ? fyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : fyVar2.getMessagesController().dialogFiltersPinnedLimitDefault;
            } else {
                i12 = UserConfig.getInstance(fyVar2.currentAccount).isPremium() ? fyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium : fyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
            }
            if (i27 + i25 > i12 || (i26 + i24) - i28 > i12) {
                if (fyVar2.R2 == 0 && dialogFilter4 == null) {
                    showDialog(new cg.v0(0, fyVar2.currentAccount, fyVar2.getParentActivity(), this, null));
                    return;
                } else {
                    org.telegram.ui.Components.c5.u0(fyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", i12, new Object[0])), null);
                    return;
                }
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
        } else if (i19 != 111) {
            hashSet2 = hashSet;
            arrayList2 = arrayList;
            if ((i19 == 102 || i19 == 103) && size > 1 && z10) {
                HashSet hashSet3 = new HashSet();
                boolean z18 = MessagesController.getInstance(fyVar2.currentAccount).canRevokePmInbox;
                long j11 = MessagesController.getInstance(fyVar2.currentAccount).revokeTimePmLimit;
                if (i19 == 102 && z18 && j11 == 2147483647L) {
                    int size3 = arrayList2.size();
                    z15 = false;
                    int i30 = 0;
                    while (i30 < size3) {
                        Object obj = arrayList2.get(i30);
                        i30++;
                        Long l11 = (Long) obj;
                        if (DialogObject.isUserDialog(l11.longValue()) || DialogObject.isEncryptedDialog(l11.longValue())) {
                            if (DialogObject.isEncryptedDialog(l11.longValue())) {
                                TLRPC.EncryptedChat encryptedChat2 = fyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                user2 = encryptedChat2 != null ? fyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                            } else {
                                user2 = fyVar2.getMessagesController().getUser(l11);
                            }
                            if (user2 != null) {
                                ArrayList arrayList4 = (ArrayList) MessagesController.getInstance(fyVar2.currentAccount).dialogMessage.f(user2.id);
                                boolean z19 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((MessageObject) arrayList4.get(0)).messageOwner == null || (!(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (!user2.bot && !UserObject.isDeleted(user2) && user2.id != fyVar2.getUserConfig().getClientUserId() && !z19) {
                                    hashSet3.add(l11);
                                    z15 = true;
                                }
                            }
                        }
                    }
                } else {
                    z15 = false;
                }
                boolean z20 = i19 == 102;
                int i31 = fyVar2.M2;
                eg.b0 b0Var = new eg.b0(fyVar2, arrayList2, i19, hashSet3);
                org.telegram.ui.ActionBar.c6 c6Var = fyVar2.resourceProvider;
                Pattern pattern = org.telegram.ui.Components.c5.a;
                int currentAccount = fyVar2.getCurrentAccount();
                Activity parentActivity = fyVar2.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
                UserConfig.getInstance(currentAccount).getClientUserId();
                org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                boolean[] zArr = new boolean[1];
                TextView textView = new TextView(parentActivity);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                org.telegram.ui.Components.j3 j3Var = new org.telegram.ui.Components.j3(parentActivity, y1VarArr);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.C = 6;
                alertDialog$Builder.n(j3Var);
                TextView textView2 = new TextView(parentActivity);
                boolean z21 = z20;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setLines(1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                if (z21) {
                    if (z15) {
                        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                        y1VarArr[0] = y1Var;
                        y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                        y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                        y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        j3Var.addView(y1VarArr[0], i7.f6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        y1VarArr[0].setOnClickListener(new org.telegram.ui.Components.v0(2, zArr));
                    }
                    textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", size, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
                } else if (i31 != 0) {
                    textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", size, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
                } else {
                    textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", size, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
                }
                j3Var.addView(textView2, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                j3Var.addView(textView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                alertDialog$Builder.k(z21 ? LocaleController.getString("Delete", R.string.Delete) : i31 != 0 ? LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache) : LocaleController.getString("ClearHistory", R.string.ClearHistory), new org.telegram.ui.Components.j1(5, b0Var, zArr));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                fyVar2.showDialog(c2Var);
                TextView textView3 = (TextView) c2Var.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
            if (i19 == 106 && z10) {
                if (size == 1) {
                    Long l12 = (Long) arrayList2.get(0);
                    l12.getClass();
                    user3 = fyVar2.getMessagesController().getUser(l12);
                } else {
                    user3 = null;
                }
                boolean z22 = fyVar2.N2 != 0;
                xr xrVar = new xr(i21, fyVar2, arrayList2);
                Pattern pattern2 = org.telegram.ui.Components.c5.a;
                if (fyVar2.getParentActivity() != null) {
                    if (size == 1 && user3 == null) {
                        return;
                    }
                    Activity parentActivity2 = fyVar2.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                    org.telegram.ui.Cells.y1[] y1VarArr2 = new org.telegram.ui.Cells.y1[2];
                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                    if (size == 1) {
                        String formatName = ContactsController.formatName(user3.first_name, user3.last_name);
                        c2Var2.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, formatName);
                        string = LocaleController.getString(R.string.BlockUser);
                        c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, formatName));
                    } else {
                        c2Var2.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", size, new Object[0]));
                        string = LocaleController.getString(R.string.BlockUsers);
                        c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", size, new Object[0])));
                    }
                    int i32 = 2;
                    boolean[] zArr2 = {true, true};
                    int i33 = 0;
                    while (i33 < i32) {
                        if (i33 != 0 || z22) {
                            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(parentActivity2, 1);
                            y1VarArr2[i33] = y1Var2;
                            y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(r72));
                            if (i33 == 0) {
                                y1VarArr2[i33].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                            } else {
                                y1VarArr2[i33].e(LocaleController.getString(size == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                            }
                            y1VarArr2[i33].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r72, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r72);
                            linearLayout.addView(y1VarArr2[i33], i7.f6.n(-1, 48));
                            y1VarArr2[i33].setOnClickListener(new jh.y0(zArr2, i33, 6));
                        }
                        i33++;
                        i32 = 2;
                        r72 = 0;
                    }
                    alertDialog$Builder2.k(string, new org.telegram.ui.Components.j1(9, xrVar, zArr2));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    fyVar2.showDialog(c2Var2);
                    TextView textView4 = (TextView) c2Var2.d(-1);
                    if (textView4 != null) {
                        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            if (z10) {
                org.telegram.ui.Components.c5.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new sv(fyVar2, arrayList, i19, z11, hashSet));
                return;
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
            int size4 = arrayList2.size();
            int i34 = 0;
            while (i34 < size4) {
                Object obj2 = arrayList2.get(i34);
                i34++;
                fyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
            }
        }
        int i35 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (dialogFilter4 != null && ((i19 == 100 || i19 == 108) && fyVar2.J2 != 0)) {
            int size5 = dialogFilter4.pinnedDialogs.size();
            for (int i36 = 0; i36 < size5; i36++) {
                i35 = Math.min(i35, dialogFilter4.pinnedDialogs.valueAt(i36));
            }
            i35 -= fyVar2.J2;
        }
        int i37 = i35;
        int i38 = 0;
        int i39 = 0;
        while (i38 < size) {
            Long l13 = (Long) arrayList2.get(i38);
            long longValue2 = l13.longValue();
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) fyVar2.getMessagesController().dialogs_dict.f(longValue2);
            if (dialog3 == null) {
                i16 = i19;
                i17 = i37;
                i15 = i38;
                dialogFilter2 = dialogFilter4;
            } else {
                if (DialogObject.isEncryptedDialog(longValue2)) {
                    encryptedChat = org.telegram.messenger.x3.p(fyVar2.getMessagesController(), longValue2);
                    if (encryptedChat != null) {
                        i15 = i38;
                        dialogFilter = dialogFilter4;
                        tL_userEmpty = fyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                    } else {
                        i15 = i38;
                        dialogFilter = dialogFilter4;
                        tL_userEmpty = new TLRPC.TL_userEmpty();
                    }
                    user = tL_userEmpty;
                    chat = null;
                } else {
                    i15 = i38;
                    dialogFilter = dialogFilter4;
                    if (DialogObject.isUserDialog(longValue2)) {
                        user = fyVar2.getMessagesController().getUser(l13);
                        chat = null;
                    } else {
                        chat = fyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                        user = null;
                    }
                    encryptedChat = null;
                }
                if (chat != null || user != null) {
                    boolean z23 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                    if (i19 == 100 || i19 == 108) {
                        i16 = i19;
                        if (fyVar2.J2 != 0) {
                            if (!fyVar2.g4(dialog3)) {
                                i39++;
                                i17 = i37;
                                dialogFilter2 = dialogFilter;
                                fyVar2.s4(longValue2, true, dialogFilter2, i17, size == 1);
                                if (dialogFilter2 != null) {
                                    int i40 = i17 + 1;
                                    if (encryptedChat != null) {
                                        if (!dialogFilter2.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                            dialogFilter2.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                        }
                                    } else if (!dialogFilter2.alwaysShow.contains(Long.valueOf(dialog3.id))) {
                                        dialogFilter2.alwaysShow.add(Long.valueOf(dialog3.id));
                                    }
                                    i17 = i40;
                                }
                            }
                            i17 = i37;
                            dialogFilter2 = dialogFilter;
                        } else {
                            i17 = i37;
                            dialogFilter2 = dialogFilter;
                            if (fyVar2.g4(dialog3)) {
                                i39++;
                                fyVar2.s4(longValue2, false, dialogFilter2, i17, size == 1);
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                i38 = i15 + 1;
                                i37 = i17;
                                i19 = i16;
                                r16 = 3;
                            }
                        }
                        dialogFilter3 = dialogFilter2;
                        dialogFilter4 = dialogFilter3;
                        i38 = i15 + 1;
                        i37 = i17;
                        i19 = i16;
                        r16 = 3;
                    } else if (i19 != 101) {
                        if (i19 == 102) {
                            fyVar = fyVar2;
                            i18 = 1;
                        } else if (i19 == 103) {
                            fyVar = fyVar2;
                            i18 = 1;
                        } else if (i19 != 104) {
                            i16 = i19;
                            i17 = i37;
                            dialogFilter2 = dialogFilter;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i15 + 1;
                            i37 = i17;
                            i19 = i16;
                            r16 = 3;
                        } else {
                            if (size == 1 && fyVar2.K2 == 1) {
                                fy fyVar3 = fyVar2;
                                fyVar3.showDialog(org.telegram.ui.Components.c5.F(longValue2, 0L, fyVar3, null), new fv(fyVar3, 2));
                                return;
                            }
                            fyVar = fyVar2;
                            if (fyVar.L2 != 0) {
                                if (fyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                    fyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                }
                                i17 = i37;
                                fyVar2 = fyVar;
                                dialogFilter2 = dialogFilter;
                                i16 = i19;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                i38 = i15 + 1;
                                i37 = i17;
                                i19 = i16;
                                r16 = 3;
                            } else {
                                if (z11) {
                                    Pattern pattern3 = org.telegram.ui.Components.c5.a;
                                    if (fyVar.getParentActivity() == null) {
                                        f3Var = null;
                                    } else {
                                        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(fyVar.getParentActivity(), null, false, false);
                                        f3Var2.fixNavigationBar();
                                        f3Var2.title = LocaleController.getString(R.string.Notifications);
                                        f3Var2.bigTitle = true;
                                        String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                        String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                        String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                        String string2 = LocaleController.getString(R.string.MuteDisable);
                                        CharSequence[] charSequenceArr = new CharSequence[4];
                                        charSequenceArr[0] = formatString;
                                        charSequenceArr[1] = formatString2;
                                        charSequenceArr[2] = formatString3;
                                        charSequenceArr[r16] = string2;
                                        ag.y1 y1Var3 = new ag.y1(arrayList2, fyVar);
                                        f3Var2.items = charSequenceArr;
                                        f3Var2.onClickListener = y1Var3;
                                        f3Var = f3Var2;
                                    }
                                    fyVar.showDialog(f3Var, new fv(fyVar, 3));
                                    return;
                                }
                                if (!fyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                    fyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                }
                                i17 = i37;
                                fyVar2 = fyVar;
                                dialogFilter2 = dialogFilter;
                                i16 = i19;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                i38 = i15 + 1;
                                i37 = i17;
                                i19 = i16;
                                r16 = 3;
                            }
                        }
                        if (size == i18) {
                            if (i19 != 102 || !fyVar.Q2) {
                                org.telegram.ui.Components.c5.s(this, i19 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.id), i19 == 102, false, false, new cw(fyVar, i19, chat, longValue2, z23));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fyVar.getParentActivity());
                            String string3 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                            c2Var3.N = string3;
                            c2Var3.P = LocaleController.getString(R.string.PsaHideChatAlertText);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new kv(fyVar, 11));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            fyVar.showDialog(c2Var3);
                            return;
                        }
                        boolean z24 = z23;
                        TLRPC.Chat chat2 = chat;
                        if (fyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                            fyVar.getMessagesController().hidePromoDialog();
                            i17 = i37;
                            fyVar2 = fyVar;
                            dialogFilter2 = dialogFilter;
                            i16 = i19;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i15 + 1;
                            i37 = i17;
                            i19 = i16;
                            r16 = 3;
                        } else if (i19 != 103 || fyVar.M2 == 0) {
                            if (hashSet2 == null || !hashSet2.contains(l13)) {
                                z13 = z24;
                                z14 = false;
                            } else {
                                z13 = z24;
                                z14 = true;
                            }
                            fyVar2 = fyVar;
                            fyVar2.q4(i19, longValue2, chat2, z13, z14);
                            i16 = i19;
                            i17 = i37;
                            dialogFilter2 = dialogFilter;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i15 + 1;
                            i37 = i17;
                            i19 = i16;
                            r16 = 3;
                        } else {
                            fyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                            i17 = i37;
                            fyVar2 = fyVar;
                            dialogFilter2 = dialogFilter;
                            i16 = i19;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i15 + 1;
                            i37 = i17;
                            i19 = i16;
                            r16 = 3;
                        }
                    } else if (fyVar2.I2 != 0) {
                        fyVar2.j4(longValue2);
                    } else {
                        fyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                    }
                }
                i16 = i19;
                i17 = i37;
                dialogFilter2 = dialogFilter;
            }
            dialogFilter3 = dialogFilter2;
            dialogFilter4 = dialogFilter3;
            i38 = i15 + 1;
            i37 = i17;
            i19 = i16;
            r16 = 3;
        }
        int i41 = i19;
        MessagesController.DialogFilter dialogFilter5 = dialogFilter4;
        if (i41 == 104 && (size != 1 || fyVar2.K2 != 1)) {
            org.telegram.ui.Components.tc.A(fyVar2, fyVar2.L2 == 0, null).j();
        }
        int i42 = 108;
        if (i41 == 100 || i41 == 108) {
            if (dialogFilter5 != null) {
                fy fyVar4 = fyVar2;
                p00.t0(dialogFilter5, dialogFilter5.flags, dialogFilter5.name, dialogFilter5.entities, dialogFilter5.title_noanimate, dialogFilter5.color, dialogFilter5.alwaysShow, dialogFilter5.neverShow, dialogFilter5.pinnedDialogs, false, false, true, true, false, fyVar4, null);
                fyVar2 = fyVar4;
                j10 = 0;
            } else {
                j10 = 0;
                fyVar2.getMessagesController().reorderPinnedDialogs(fyVar2.R2, null, 0L);
            }
            UndoView Y32 = fyVar2.Y3();
            if (fyVar2.l3 && Y32 != null) {
                Y32.m(j10, Integer.valueOf(i39), fyVar2.J2 != 0 ? 78 : 79);
            }
            i14 = i10;
            i42 = 108;
        } else {
            i14 = i41;
        }
        fyVar2.b4((i14 == i42 || i14 == 100 || i14 == 102) ? false : true);
    }

    @Override // org.telegram.ui.mg0
    public final void s() {
        x4(true, true);
    }

    public final void s3() {
        if (this.a0 == null) {
            return;
        }
        int n32 = n3();
        int i10 = 0;
        while (true) {
            ey[] eyVarArr = this.a0;
            if (i10 >= eyVarArr.length) {
                return;
            }
            ey eyVar = eyVarArr[i10];
            if (eyVar != null) {
                ay ayVar = eyVar.a;
                ayVar.setPadding(0, ayVar.U2, 0, n32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s4(long j10, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        int i11;
        boolean z12;
        boolean pinDialog;
        boolean z13;
        int i12 = (this.a0[0].s == 0 && Z3() && this.a0[0].v == 2) ? 1 : 0;
        int L0 = this.a0[0].c.L0();
        if (dialogFilter != null) {
            int i13 = dialogFilter.pinnedDialogs.get(j10, TLObject.FLAG_31);
            if (!z10 && i13 == Integer.MIN_VALUE) {
                return;
            }
        }
        this.u3 = z10 ? 4 : 5;
        int i14 = -1;
        if (L0 > i12 || !z11) {
            i11 = -1;
            z12 = true;
        } else {
            A4(true, true);
            o3();
            if (this.N1 != null) {
                for (int i15 = 0; i15 < this.N1.size(); i15++) {
                    if (((TLRPC.Dialog) this.N1.get(i15)).id == j10) {
                        i11 = i15;
                        break;
                    }
                }
            }
            i11 = -1;
            z12 = false;
        }
        if (dialogFilter != null) {
            if (z10) {
                dialogFilter.pinnedDialogs.put(j10, i10);
            } else {
                dialogFilter.pinnedDialogs.delete(j10);
            }
            if (z11) {
                getMessagesController().onFilterUpdate(dialogFilter);
            }
            pinDialog = true;
        } else {
            pinDialog = getMessagesController().pinDialog(j10, z10, null, -1L);
        }
        if (pinDialog) {
            if (z12) {
                if (this.N0 != 10) {
                    c4(false);
                }
                x4(true, false);
            } else {
                ArrayList R3 = R3(this.currentAccount, this.a0[0].s, this.R2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= R3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) R3.get(i16)).id == j10) {
                        i14 = i16;
                        break;
                    }
                    i16++;
                }
            }
        }
        if (z12) {
            return;
        }
        if (i11 >= 0) {
            ArrayList arrayList = this.N1;
            if (arrayList != null && i14 >= 0 && i11 != i14) {
                arrayList.add(i14, (TLRPC.Dialog) arrayList.remove(i11));
                this.a0[0].x.D();
                this.a0[0].q(true);
                ey eyVar = this.a0[0];
                eyVar.c.h1((eyVar.s == 0 && Z3() && this.a0[0].v == 2) ? 1 : 0, (int) this.J);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new ev(this, 23), 200L);
            }
            z13 = true;
            if (z13) {
                A4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        xw xwVar = this.A0;
        if (xwVar != null) {
            if (!this.C0 || z10) {
                xwVar.setVisibility(8);
            } else {
                xwVar.setVisibility(0);
            }
        }
        Y4(true);
        U4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        cx cxVar;
        org.telegram.ui.Components.n5 n5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (cxVar = this.I0) != null && (cxVar.getContentView() instanceof d61)) {
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            d61 d61Var = (d61) this.I0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                n5Var = this.z3;
            }
            n5Var = null;
            d61Var.y(n5Var, titleTextView);
        }
        xw xwVar = this.A0;
        if (xwVar != null) {
            org.telegram.ui.Components.o6 o6Var = xwVar.P;
            xwVar.Q.c(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                xwVar.c0 = true;
                if (xwVar.d0 != i10) {
                    xwVar.d0 = i10;
                    o6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                xwVar.c0 = false;
                xwVar.d0 = 0;
                o6Var.c(xwVar.b0, !LocaleController.isRTL, true);
            }
            xwVar.a.a(xwVar.c0, true);
            xwVar.H0.q(o6Var);
        }
    }

    public final void t3() {
        sg.f fVar = this.u1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.G0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.G0.setBackground(new BitmapDrawable(createBitmap));
        this.G0.setAlpha(0.0f);
        this.G0.setVisibility(0);
        B3();
    }

    public final void u3() {
        ey eyVar;
        float S3 = S3(true);
        ew ewVar = this.v0;
        if (ewVar != null) {
            boolean z10 = ewVar.getAlpha() != S3;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.v0.setAlpha(S3);
            this.v0.setScaleX(lerp);
            this.v0.setScaleY(lerp);
            this.v0.setVisibility(S3 > 0.0f ? 0 : 8);
            if (z10 && (eyVar = this.a0[0]) != null) {
                eyVar.a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(ey eyVar) {
        int i10;
        if (eyVar.getVisibility() != 0) {
            return;
        }
        int i11 = eyVar.d.v;
        if (eyVar.s == 0 && Z3() && eyVar.a.getChildCount() == 0 && eyVar.v == 2) {
            ((f2.j0) eyVar.a.getLayoutManager()).h1(1, (int) this.J);
        }
        eyVar.d.getClass();
        eyVar.d.U();
        int h = eyVar.d.h();
        if (h == 1 && i11 == 1 && eyVar.d.j(0) == 5) {
            eyVar.q(true);
        } else {
            eyVar.q(false);
            if (h > i11 && (i10 = this.N0) != 11 && i10 != 12 && i10 != 13) {
                eyVar.y.b(i11);
            }
        }
        try {
            eyVar.a.setEmptyView((this.R2 == 0 && this.T2 == 0) ? eyVar.w : null);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        r3(eyVar);
    }

    public final void v3() {
        float f9 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f9);
        org.telegram.ui.Components.hp0 hp0Var = this.y1;
        if (hp0Var != null) {
            hp0Var.setScaleX(lerp);
            this.y1.setScaleY(lerp);
            this.y1.setAlpha(f9);
            this.y1.setVisibility(f9 > 0.0f ? 0 : 8);
        }
        sg.f fVar = this.u1;
        if (fVar != null) {
            fVar.setAlpha(f9);
            this.u1.setVisibility(f9 > 0.0f ? 0 : 8);
            this.u1.getFadeView().setAlpha(f9);
            this.u1.getFadeView().setVisibility(f9 > 0.0f ? 0 : 8);
        }
    }

    public final void v4() {
        boolean z10;
        if (this.J == 0.0f || (z10 = this.G)) {
            return;
        }
        float f9 = z10 ? -U3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.C3, f9));
        animatorSet.setInterpolator(org.telegram.ui.Components.jr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        float f9 = 1.0f - this.b.e;
        float V3 = 1.0f - V3();
        org.telegram.ui.Components.u10.d(this.actionBar.getBackButton(), Math.max(this.p3, f9 * V3 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w4(int i10) {
        org.telegram.ui.Components.c00 c00Var;
        if (this.v0 == null) {
            V4(true, true);
            if (this.v0 == null) {
                return;
            }
        }
        int tabsCount = this.v0.getTabsCount() - 1;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i11 = 0;
        while (true) {
            if (i11 >= dialogFilters.size()) {
                break;
            }
            if (dialogFilters.get(i11).id == i10) {
                tabsCount = i11;
                break;
            }
            i11++;
        }
        ew ewVar = this.v0;
        if (tabsCount < 0) {
            ewVar.getClass();
        } else if (tabsCount < ewVar.getTabsCount()) {
            c00Var = (org.telegram.ui.Components.c00) ewVar.h.get(tabsCount);
            if (c00Var != null) {
                ew ewVar2 = this.v0;
                ArrayList arrayList = ewVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                ewVar2.f((org.telegram.ui.Components.c00) j7.l1.i(1, arrayList), arrayList.size() - 1);
                return;
            }
            ey[] eyVarArr = this.a0;
            if (eyVarArr == null || eyVarArr.length <= 0 || eyVarArr[0].h != c00Var.a) {
                this.v0.f(c00Var, tabsCount);
                return;
            }
            return;
        }
        c00Var = null;
        if (c00Var != null) {
        }
    }

    public final void x3() {
        org.telegram.ui.Components.u10.d(this.c0, com.google.android.recaptcha.internal.a.C(this.e0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void x4(boolean z10, boolean z11) {
        ax axVar = this.B3;
        if (axVar == null || !axVar.c()) {
            int i10 = (this.a0[0].s == 0 && Z3() && this.a0[0].v == 2) ? 1 : 0;
            int i11 = (!this.G || z11 || this.A0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.a0[0].c.h1(i10, i11);
                v4();
            } else {
                c2.z zVar = this.a0[0].r;
                zVar.b = 1;
                zVar.c(i10, i11, false, false);
                v4();
            }
        }
    }

    @Override // org.telegram.ui.mg0
    public final qg.d y() {
        return this.j4;
    }

    public final void y3() {
        org.telegram.ui.Components.u10.d(this.b0, com.google.android.recaptcha.internal.a.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        ux uxVar = this.T;
        if (uxVar != null) {
            uxVar.r.setText(str);
            this.T.r.setSelection(str.length());
        }
    }

    @Override // vd.b
    public final void z(float f9, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 != 3 || (w0Var = this.h0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
        if (!this.d.f) {
            if (Build.VERSION.SDK_INT >= 23) {
                animatedVectorDrawable.reset();
                return;
            } else {
                animatedVectorDrawable.setVisible(false, true);
                return;
            }
        }
        animatedVectorDrawable.start();
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
            String l02 = PremiumPreviewFragment.l0(2);
            if (premiumPromo != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= premiumPromo.video_sections.size()) {
                        i11 = -1;
                        break;
                    } else if (premiumPromo.video_sections.get(i11).equals(l02)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i11), premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void z3() {
        org.telegram.ui.Components.u10.d(this.f0, com.google.android.recaptcha.internal.a.C(this.N0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - V3(), 1.0f - this.c.e));
        xw xwVar = this.A0;
        if (xwVar != null) {
            xwVar.invalidate();
        }
    }

    public final void z4(float f9) {
        this.Y = f9;
        for (ey eyVar : this.a0) {
            ay ayVar = eyVar.a;
            for (int i10 = 0; i10 < ayVar.getChildCount(); i10++) {
                View childAt = ayVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= eyVar.d.f + 1) {
                    childAt.setAlpha(f9);
                }
            }
        }
    }
}
