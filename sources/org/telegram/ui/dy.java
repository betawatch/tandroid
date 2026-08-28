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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class dy extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, uf.b, td.b, mg0 {
    public static boolean t4;
    public static final boolean[] u4 = new boolean[4];
    public static final org.telegram.ui.Components.rq0 v4 = new org.telegram.ui.Components.rq0(3);
    public static float w4;
    public boolean A;
    public vw A0;
    public final TextPaint A1;
    public String A2;
    public org.telegram.ui.Cells.o A3;
    public boolean B;
    public org.telegram.ui.Components.zr B0;
    public nw B1;
    public CharSequence B2;
    public yw B3;
    public TLRPC.RequestPeerType C;
    public boolean C0;
    public FrameLayout C1;
    public org.telegram.ui.Components.wp0 C2;
    public final mw C3;
    public long D;
    public float D0;
    public nw D1;
    public org.telegram.ui.Components.p61 D2;
    public final mw D3;
    public ValueAnimator E;
    public float E0;
    public FrameLayout E1;
    public final ArrayList E2;
    public kg0 E3;
    public ValueAnimator F;
    public float F0;
    public org.telegram.ui.Components.bs F1;
    public boolean F2;
    public NotificationCenter.ObserversGroup F3;
    public boolean G;
    public fh.l2 G0;
    public org.telegram.ui.Components.as G1;
    public int G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public org.telegram.ui.Components.x60 H0;
    public org.telegram.ui.Cells.m H1;
    public int H2;
    public Drawable H3;
    public boolean I;
    public ax I0;
    public org.telegram.ui.Cells.z2 I1;
    public int I2;
    public int I3;
    public float J;
    public boolean J0;
    public org.telegram.ui.Cells.sa J1;
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
    public oh.i M1;
    public int M2;
    public boolean M3;
    public boolean N;
    public int N0;
    public ArrayList N1;
    public int N2;
    public qu N3;
    public org.telegram.ui.Components.gc O;
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
    public org.telegram.ui.Components.hc0 R0;
    public boolean R1;
    public int R2;
    public CharSequence R3;
    public boolean S;
    public org.telegram.ui.Cells.r2 S0;
    public long S1;
    public dy S2;
    public boolean S3;
    public sx T;
    public org.telegram.ui.Cells.r2 T0;
    public TLObject T1;
    public long T2;
    public float T3;
    public ff.o0 U;
    public boolean U0;
    public int U1;
    public TLRPC.Chat U2;
    public boolean U3;
    public o31 V;
    public boolean V0;
    public int V1;
    public TLRPC.ChatFull V2;
    public boolean V3;
    public org.telegram.ui.Components.m71 W;
    public final ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.o9 W2;
    public ValueAnimator W3;
    public of.o0 X;
    public boolean X0;
    public boolean X1;
    public org.telegram.ui.Components.z8 X2;
    public org.telegram.ui.Components.e40 X3;
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
    public cy[] a0;
    public org.telegram.ui.ActionBar.h2 a1;
    public boolean a2;
    public boolean a3;
    public org.telegram.ui.Components.gc a4;
    public final td.a b;
    public org.telegram.ui.ActionBar.w0 b0;
    public final Paint b1;
    public String b2;
    public AnimatorSet b3;
    public int b4;
    public final td.a c;
    public org.telegram.ui.ActionBar.w0 c0;
    public ImageView c1;
    public String c2;
    public boolean c3;
    public int c4;
    public final td.a d;
    public fy d0;
    public NumberTextView d1;
    public String d2;
    public boolean d3;
    public int d4;
    public final td.a e;
    public boolean e0;
    public final ArrayList e1;
    public boolean e2;
    public float e3;
    public int e4;
    public final td.a f;
    public org.telegram.ui.ActionBar.w0 f0;
    public org.telegram.ui.ActionBar.w0 f1;
    public boolean f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.w0 g0;
    public org.telegram.ui.ActionBar.w0 g1;
    public boolean g2;
    public int g3;
    public pg.i g4;
    public final td.a h;
    public org.telegram.ui.ActionBar.w0 h0;
    public org.telegram.ui.ActionBar.w0 h1;
    public boolean h2;
    public boolean h3;
    public final ig.e h4;
    public org.telegram.ui.ActionBar.w0 i0;
    public org.telegram.ui.ActionBar.w0 i1;
    public boolean i2;
    public boolean i3;
    public final ng.d i4;
    public org.telegram.ui.Components.rh0 j0;
    public org.telegram.ui.ActionBar.g1 j1;
    public String j2;
    public org.telegram.ui.Components.gc j3;
    public final ng.d j4;
    public org.telegram.ui.ActionBar.g1 k0;
    public org.telegram.ui.ActionBar.g1 k1;
    public String k2;
    public final AnimationNotificationsLocker k3;
    public final ng.c k4;
    public kh.x3 l0;
    public org.telegram.ui.ActionBar.g1 l1;
    public final MessagesStorage.TopicKey l2;
    public boolean l3;
    public final ig.a l4;
    public kh.x3 m0;
    public org.telegram.ui.ActionBar.g1 m1;
    public boolean m2;
    public boolean m3;
    public final ig.a m4;
    public final td.a n;
    public boolean n0;
    public org.telegram.ui.ActionBar.g1 n1;
    public boolean n2;
    public boolean n3;
    public final ig.a n4;
    public boolean o0;
    public org.telegram.ui.ActionBar.g1 o1;
    public boolean o2;
    public boolean o3;
    public final ig.a o4;
    public org.telegram.ui.Components.j10 p0;
    public org.telegram.ui.ActionBar.g1 p1;
    public boolean p2;
    public float p3;
    public vv p4;
    public org.telegram.ui.Components.j10 q0;
    public float q1;
    public boolean q2;
    public ValueAnimator q3;
    public final ArrayList q4;
    public final td.a r;
    public kh.d r0;
    public float r1;
    public boolean r2;
    public float r3;
    public final RectF r4;
    public final td.a s;
    public rg.f s0;
    public AnimatorSet s1;
    public boolean s2;
    public float s3;
    public final RectF s4;
    public int t0;
    public float t1;
    public boolean t2;
    public float t3;
    public final UndoView[] u0;
    public pg.f u1;
    public boolean u2;
    public int u3;
    public final xg.i v;
    public cw v0;
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
    public ow x1;
    public boolean x2;
    public Long x3;
    public boolean y;
    public mx y0;
    public org.telegram.ui.Components.wo0 y1;
    public wx y2;
    public Drawable y3;
    public org.telegram.ui.Components.wt0 z0;
    public org.telegram.ui.ActionBar.w0 z1;
    public ArrayList z2;
    public org.telegram.ui.Components.i5 z3;

    public dy(Bundle bundle) {
        super(bundle);
        int i9 = Build.VERSION.SDK_INT;
        this.a = i9 >= 31 ? 48 : 0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.b = new td.a(1, this, grVar, 350L, false);
        this.c = new td.a(2, this, grVar, 350L, false);
        this.d = new td.a(3, this, grVar, 350L, false);
        this.e = new td.a(4, this, grVar, 350L, false);
        this.f = new td.a(5, this, grVar, 350L, false);
        this.h = new td.a(6, this, grVar, 350L, false);
        this.n = new td.a(7, this, grVar, 350L, false);
        this.r = new td.a(8, this, grVar, 350L, false);
        this.s = new td.a(9, this, grVar, 350L, false);
        this.v = new xg.i(new uv(this, 1));
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
        this.C3 = new mw(this, 0);
        this.D3 = new mw(this, 1);
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
        ng.c cVar = new ng.c();
        this.k4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        if (i9 >= 31) {
            this.h4 = new ig.e(false);
            ng.d dVar = new ng.d(null);
            this.i4 = dVar;
            dVar.i(new ix(this, 0));
            ng.d dVar2 = new ng.d(null);
            this.j4 = dVar2;
            dVar2.i(new ix(this, 3));
            ig.a aVar = new ig.a(dVar);
            this.l4 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            ig.a aVar2 = new ig.a(dVar2);
            this.n4 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            this.m4 = new ig.a(dVar);
        } else {
            this.h4 = null;
            this.i4 = null;
            this.j4 = null;
            this.l4 = new ig.a(cVar);
            this.n4 = new ig.a(cVar);
            this.m4 = new ig.a(cVar);
        }
        this.o4 = new ig.a(cVar);
    }

    public static /* synthetic */ void A0(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(dyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(dyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new y9(dyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void B0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        dyVar.U4();
        org.telegram.ui.Components.gc J = org.telegram.ui.Components.oc.a0(dyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new dv(dyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void C0(dy dyVar) {
        try {
            ((org.telegram.ui.Components.mi0) ((org.telegram.ui.Components.z8) dyVar.I1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (dyVar.X3 == null) {
            org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
            dyVar.X3 = e40Var;
            e40Var.D = true;
            e40Var.a = dyVar;
            e40Var.b = new qx(dyVar);
            dyVar.getMediaDataController().checkFeaturedStickers();
            dyVar.getMessagesController().loadSuggestedFilters();
            dyVar.getMessagesController().loadUserInfo(dyVar.getUserConfig().getCurrentUser(), true, dyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(dyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(dyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(dyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.ki kiVar = dyVar.X3.c;
        if (kiVar != null) {
            kiVar.c1();
        }
        org.telegram.ui.Components.e40 e40Var2 = dyVar.X3;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        e40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new dv(dyVar, 0), new ev(dyVar, 0), 0);
    }

    public static /* synthetic */ void D0(dy dyVar, float f10, ValueAnimator valueAnimator) {
        dyVar.a0[0].setTranslationY((1.0f - dyVar.p3) * f10);
        dyVar.p3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i9 = 0; i9 < dyVar.actionBar.getChildCount(); i9++) {
            if (dyVar.actionBar.getChildAt(i9).getVisibility() == 0 && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getActionMode() && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getBackButton()) {
                dyVar.actionBar.getChildAt(i9).setAlpha(1.0f - dyVar.p3);
            }
        }
        dyVar.E3();
        dyVar.w3();
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void E0(dy dyVar) {
        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(dyVar.getParentActivity(), dyVar.resourceProvider);
        obVar.d(R.raw.email_check_inbox, new String[0]);
        obVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.gc.g(dyVar, obVar, 2750).j();
        try {
            dyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void F0(dy dyVar) {
        org.telegram.ui.Components.an0 an0Var;
        va1 va1Var;
        ViewGroup viewGroup;
        int i9 = 0;
        while (true) {
            if (i9 >= 3) {
                break;
            }
            if (i9 == 2) {
                mx mxVar = dyVar.y0;
                if (mxVar == null) {
                    i9++;
                } else {
                    viewGroup = mxVar.R;
                    if (viewGroup == null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = viewGroup.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                                ((org.telegram.ui.Cells.r2) childAt).a0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.va) {
                                ((org.telegram.ui.Cells.va) childAt).j(0);
                            }
                        }
                    }
                    i9++;
                }
            } else {
                cy[] cyVarArr = dyVar.a0;
                if (cyVarArr == null) {
                    i9++;
                } else {
                    viewGroup = i9 < cyVarArr.length ? cyVarArr[i9].a : null;
                    if (viewGroup == null) {
                    }
                    i9++;
                }
            }
        }
        mx mxVar2 = dyVar.y0;
        if (mxVar2 != null && (an0Var = mxVar2.U) != null && (va1Var = an0Var.g0) != null) {
            int childCount2 = va1Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = va1Var.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt2;
                    org.telegram.ui.Components.z8 z8Var = n4Var.c;
                    int i12 = n4Var.h;
                    if (DialogObject.isUserDialog(n4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(n4Var.f));
                        n4Var.e = user;
                        z8Var.m(i12, user);
                    } else {
                        z8Var.k(i12, MessagesController.getInstance(i12).getChat(Long.valueOf(-n4Var.f)));
                        n4Var.e = null;
                    }
                    n4Var.c(true);
                }
            }
        }
        if (dyVar.a0 != null) {
            int i13 = 0;
            while (true) {
                cy[] cyVarArr2 = dyVar.a0;
                if (i13 >= cyVarArr2.length) {
                    break;
                }
                kw kwVar = cyVarArr2[i13].n;
                if (kwVar != null) {
                    kwVar.i();
                }
                i13++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = dyVar.actionBar;
        if (kVar != null) {
            kVar.D(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8), true);
            dyVar.actionBar.E(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.E8), false, true);
            dyVar.actionBar.E(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.F8), true, true);
            dyVar.actionBar.F(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.I5), true);
            dyVar.actionBar.d();
        }
        if (dyVar.z3 != null) {
            dyVar.d5(UserConfig.getInstance(dyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.z2 z2Var = dyVar.I1;
        if (z2Var != null) {
            z2Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
        }
        org.telegram.ui.ActionBar.w0 w0Var = dyVar.i0;
        if (w0Var != null) {
            w0Var.setIconColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.v8));
        }
        ow owVar = dyVar.x1;
        if (owVar != null) {
            owVar.d();
        }
        cw cwVar = dyVar.v0;
        if (cwVar != null) {
            kg.d dVar = cwVar.u0;
            if (dVar != null) {
                dVar.u();
            }
            cwVar.invalidate();
        }
        of.o0 o0Var = dyVar.X;
        if (o0Var != null) {
            o0Var.B1();
        }
        mx mxVar3 = dyVar.y0;
        if (mxVar3 != null) {
            SparseArray sparseArray = mxVar3.h;
            for (int i14 = 0; i14 < mxVar3.getChildCount(); i14++) {
                if (mxVar3.getChildAt(i14) instanceof f10) {
                    gh.f1 f1Var = ((f10) mxVar3.getChildAt(i14)).b;
                    int childCount3 = f1Var.getChildCount();
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt3 = f1Var.getChildAt(i15);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).a0(0, true);
                        }
                    }
                }
            }
            int size = sparseArray.size();
            for (int i16 = 0; i16 < size; i16++) {
                View view = (View) sparseArray.valueAt(i16);
                if (view instanceof f10) {
                    gh.f1 f1Var2 = ((f10) view).b;
                    int childCount4 = f1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        View childAt4 = f1Var2.getChildAt(i17);
                        if (childAt4 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt4).a0(0, true);
                        }
                    }
                }
            }
            f10 f10Var = mxVar3.I0;
            if (f10Var != null) {
                gh.f1 f1Var3 = f10Var.b;
                int childCount5 = f1Var3.getChildCount();
                for (int i18 = 0; i18 < childCount5; i18++) {
                    View childAt5 = f1Var3.getChildAt(i18);
                    if (childAt5 instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt5).a0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.kg0 kg0Var = mxVar3.l0;
            if (kg0Var != null) {
                kg0Var.c();
            }
        }
        org.telegram.ui.Components.m71 m71Var = dyVar.W;
        if (m71Var != null) {
            gh.f1 f1Var4 = m71Var.v;
            kg.d dVar2 = m71Var.n0;
            if (dVar2 != null) {
                dVar2.u();
            }
            m71Var.K.setColor(org.telegram.ui.ActionBar.f6.v0(m71Var.L, m71Var.f0));
            f1Var4.f1();
            f1Var4.invalidate();
            m71Var.invalidate();
        }
        o31 o31Var = dyVar.V;
        if (o31Var != null) {
            o31Var.d();
        }
        fh.l2 l2Var = dyVar.G0;
        if (l2Var != null && Build.VERSION.SDK_INT >= 23) {
            l2Var.setForeground(new ColorDrawable(i0.a.k(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6), 100)));
        }
        org.telegram.ui.Components.j10 j10Var = dyVar.p0;
        if (j10Var != null) {
            j10Var.g();
        }
        org.telegram.ui.Components.j10 j10Var2 = dyVar.q0;
        if (j10Var2 != null) {
            j10Var2.g();
        }
        ng.c cVar = dyVar.k4;
        int i19 = org.telegram.ui.ActionBar.f6.d6;
        cVar.a(dyVar.getThemedColor(i19));
        org.telegram.ui.Components.bs bsVar = dyVar.F1;
        if (bsVar != null) {
            kg.d dVar3 = bsVar.s;
            if (dVar3 != null) {
                dVar3.u();
            }
            bsVar.invalidate();
        }
        org.telegram.ui.Components.as asVar = dyVar.G1;
        if (asVar != null) {
            asVar.setColor(org.telegram.ui.ActionBar.f6.w0(null, i19, false));
        }
        nw nwVar = dyVar.D1;
        if (nwVar != null) {
            nwVar.p();
        }
        nw nwVar2 = dyVar.B1;
        if (nwVar2 != null) {
            nwVar2.p();
        }
        dyVar.D4(dyVar.t1);
        vw vwVar = dyVar.A0;
        if (vwVar != null) {
            vwVar.o();
        }
        Drawable drawable = dyVar.y3;
        if (drawable != null) {
            drawable.setColorFilter(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = dyVar.c1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.y8), PorterDuff.Mode.MULTIPLY));
            dyVar.c1.setBackground(org.telegram.ui.ActionBar.f6.f0(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.z8), 1, -1));
        }
        sx sxVar = dyVar.T;
        if (sxVar != null) {
            sxVar.d();
        }
    }

    public static void G0(dy dyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            bg.g3.d0(0, birthdayState);
            return;
        }
        fh.p2 p2Var = new fh.p2(dyVar.getParentActivity(), dyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        p2Var.U(true);
        dyVar.showDialog(p2Var);
    }

    public static void H0(dy dyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(dyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
            dyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.l0.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(dyVar), R.raw.error, 36);
            return;
        }
        if (dyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity(), 0, dyVar.resourceProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            dyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void I0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        dyVar.U4();
    }

    public static void N2(dy dyVar, float f10) {
        float f11;
        float f12;
        float clamp = Utilities.clamp(dyVar.t1 * 2.0f, 1.0f, 0.0f);
        vw vwVar = dyVar.A0;
        float f13 = (1.0f - dyVar.p3) * f10 * dyVar.D0;
        float f14 = 1.0f - clamp;
        vwVar.setAlpha(f13 * f14);
        if (dyVar.G || dyVar.I) {
            float clamp2 = Utilities.clamp((-dyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (dyVar.p3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            dyVar.A0.setClipTop(0);
            if (dyVar.G || !dyVar.I) {
                dyVar.A0.setTranslationY(((dyVar.P / 2.0f) + (Math.max(dyVar.J, -dyVar.U3()) + dyVar.r3)) - AndroidUtilities.dp(8.0f));
                dyVar.A0.l(clamp2, !dyVar.B3.c());
                if (dyVar.I) {
                    f11 = 1.0f - clamp3;
                    dyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f12 = dyVar.D0;
                }
            } else {
                dyVar.A0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                dyVar.A0.setProgressToCollapse(1.0f);
                f12 = dyVar.D0;
            }
            f11 = 1.0f - f12;
            dyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (dyVar.H) {
                dyVar.A0.setTranslationY((Math.max(dyVar.J, -dyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                dyVar.A0.setProgressToCollapse(1.0f);
                vw vwVar2 = dyVar.A0;
                vwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - vwVar2.getY()));
            }
            f11 = 1.0f - dyVar.D0;
            dyVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            dyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            dyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - dyVar.p3;
            dyVar.actionBar.getTitlesContainer().setAlpha(f16);
            dyVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        dyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        dyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        dyVar.actionBar.getTitlesContainer().setScaleY(f17);
        dyVar.actionBar.getTitlesContainer().setScaleX(f17);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - dyVar.p3) * f15;
        dyVar.actionBar.getTitlesContainer().setAlpha(f18);
        dyVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void O2(dy dyVar, Canvas canvas, int i9) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (dyVar.parentLayout == null || dyVar.actionBar == null) {
            return;
        }
        float max = Math.max(dyVar.e.e, dyVar.V3());
        float f10 = 1.0f;
        float f11 = 1.0f - dyVar.t1;
        float f12 = max * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i9) {
            i9 = -1;
            f10 = 0.0f;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i9 <= 0 || (b5Var = dyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) b5Var).p(canvas, (int) (f10 * 255.0f * f12), i9);
    }

    public static org.telegram.ui.Cells.r2 Q3(cy cyVar) {
        yx yxVar = cyVar.a;
        for (int i9 = 0; i9 < yxVar.getChildCount(); i9++) {
            View childAt = yxVar.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.O()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void T(dy dyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        dyVar.U4();
    }

    public static /* synthetic */ void U(dy dyVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dyVar.p3 = floatValue;
        dyVar.a0[0].setTranslationY((-f10) * floatValue);
        for (int i9 = 0; i9 < dyVar.actionBar.getChildCount(); i9++) {
            if (dyVar.actionBar.getChildAt(i9).getVisibility() == 0 && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getActionMode() && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getBackButton()) {
                dyVar.actionBar.getChildAt(i9).setAlpha(1.0f - dyVar.p3);
            }
        }
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        dyVar.E3();
        dyVar.w3();
    }

    public static void W(dy dyVar) {
        ArrayList arrayList = dyVar.E2;
        org.telegram.ui.ActionBar.b5 b5Var = dyVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            dyVar.finishPreviewFragment();
            return;
        }
        if (dyVar.N0 != 10) {
            if (MessagesController.getInstance(dyVar.currentAccount).isFrozen()) {
                b.b(dyVar.currentAccount);
                return;
            } else {
                dyVar.presentFragment(new ContactsActivity(aa.d.i("destroyAfterSelect", true)));
                return;
            }
        }
        if (dyVar.y2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i9)).longValue(), 0L));
        }
        dyVar.y2.v(dyVar, arrayList2, null, false, dyVar.F2, dyVar.G2, dyVar.H2, null);
    }

    public static /* synthetic */ void X(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        dyVar.U4();
    }

    public static void Y(dy dyVar) {
        PasskeysActivity.Z(dyVar.currentAccount, dyVar.getParentActivity(), dyVar.resourceProvider, true);
    }

    public static void Z(dy dyVar, int i9, org.telegram.ui.Components.x60 x60Var) {
        if (dyVar.currentAccount == i9) {
            return;
        }
        x60Var.u();
        if (dyVar.getParentActivity() == null) {
            return;
        }
        wx wxVar = dyVar.y2;
        LaunchActivity launchActivity = (LaunchActivity) dyVar.getParentActivity();
        ArrayList arrayList = dyVar.z2;
        String str = dyVar.A2;
        CharSequence charSequence = dyVar.B2;
        ow owVar = dyVar.x1;
        CharSequence fieldText = owVar != null ? owVar.getFieldText() : null;
        launchActivity.K0(i9);
        dy dyVar2 = new dy(dyVar.arguments);
        dyVar2.y2 = wxVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                dyVar2.E4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    dyVar2.B2 = null;
                } else {
                    dyVar2.B2 = charSequence;
                    dyVar2.A2 = null;
                    dyVar2.z2 = null;
                    if (dyVar2.x1 != null) {
                        dyVar2.l3(fieldText);
                    } else {
                        dyVar2.R3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            dyVar2.z2 = null;
        } else {
            dyVar2.z2 = arrayList;
            dyVar2.A2 = null;
            if (dyVar2.x1 != null) {
                dyVar2.l3(fieldText);
            } else {
                dyVar2.R3 = fieldText;
            }
        }
        launchActivity.q0(dyVar2, false, true);
    }

    public static /* synthetic */ void a0(dy dyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(dyVar.currentAccount).getClientUserId());
        dyVar.presentFragment(new qn(bundle));
    }

    public static /* synthetic */ void b0(dy dyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = dyVar.getMessagesController().getUserFull(dyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        dyVar.getMessagesController().invalidateContentSettings();
        dyVar.getConnectionsManager().sendRequest(updatebirthday, new y9(dyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        dyVar.U4();
    }

    public static /* synthetic */ void c0(dy dyVar, String str) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, str);
        dyVar.U4();
    }

    public static void d0(dy dyVar, cy cyVar, View view, int i9) {
        int i10;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.r2;
        if (z10) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.j2) {
                dyVar.N4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (dyVar.I3()) {
            dyVar.o4(view, i9, 0.0f, cyVar.d);
            return;
        }
        int i11 = dyVar.N0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.p8)) {
            cyVar.d.K();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i9 == 1) {
            Bundle i13 = aa.d.i("forImport", true);
            i13.putLongArray("result", new long[]{dyVar.getUserConfig().getClientUserId()});
            i13.putInt("chatType", 4);
            String string = dyVar.arguments.getString("importTitle");
            if (string != null) {
                i13.putString("title", string);
            }
            r60 r60Var = new r60(i13);
            r60Var.U = new iw(dyVar);
            dyVar.presentFragment(r60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i10 = cyVar.s) == 7 || i10 == 8)) {
            of.k kVar = (of.k) cyVar.d.I.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = dyVar.getMessagesController().selectedDialogFilter[cyVar.s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.id;
                    org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(dyVar, false);
                    n00Var.U = -1;
                    n00Var.Y = "";
                    n00Var.Z = new ArrayList();
                    n00Var.b0 = "";
                    n00Var.d0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    n00Var.e0 = arrayList;
                    n00Var.v0 = -1;
                    n00Var.y0 = -5;
                    n00Var.U = i14;
                    n00Var.W = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    n00Var.c0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = dyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i12).id == i14) {
                                n00Var.Y = arrayList2.get(i12).name;
                                break;
                            }
                            i12++;
                        }
                    }
                    n00Var.R();
                    dyVar.showDialog(n00Var);
                    return;
                }
                return;
            }
        } else if (z10 && !dyVar.actionBar.s() && !dyVar.B3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).U1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        dyVar.n4(view, i9, cyVar.d);
    }

    public static void d4(qn qnVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.b6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.p00[] p00VarArr = (org.telegram.ui.Components.p00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p00.class);
                if (p00VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(p00VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(p00VarArr[0]);
                    for (int i9 = 1; i9 < p00VarArr.length; i9++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(p00VarArr[i9]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(p00VarArr[i9]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                for (int i10 = spanEnd; i10 <= spanStart2; i10++) {
                                    if (!Character.isWhitespace(spannableStringBuilder.charAt(i10))) {
                                        break;
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    qnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static /* synthetic */ void e0(dy dyVar) {
        dyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(dyVar.parentLayout, "newChatsRow");
    }

    public static void f1(dy dyVar, boolean z10) {
        if (dyVar.a0 == null || dyVar.J3 == z10) {
            return;
        }
        dyVar.J3 = z10;
        int i9 = 0;
        while (true) {
            cy[] cyVarArr = dyVar.a0;
            if (i9 >= cyVarArr.length) {
                return;
            }
            if (z10) {
                cyVarArr[i9].a.setScrollbarFadingEnabled(false);
            }
            dyVar.a0[i9].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                dyVar.a0[i9].a.setScrollbarFadingEnabled(true);
            }
            i9++;
        }
    }

    public static void g0(dy dyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (dyVar.getParentActivity() == null) {
            return;
        }
        dyVar.p2 = false;
        if (z10 || z11 || z12) {
            dyVar.w0 = true;
            if (z10 && qj0.n(activity)) {
                org.telegram.ui.Components.kd0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.tm(1, new df(27, dyVar, activity)));
                return;
            }
            if (z11 && dyVar.Q1 && dyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.w(activity, new mv(dyVar, 0)).a;
                dyVar.P1 = c2Var;
                dyVar.showDialog(c2Var);
            } else if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                dyVar.k3(true);
            } else if (activity instanceof g5) {
                org.telegram.ui.ActionBar.c2 w8 = ((g5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                dyVar.P1 = w8;
                dyVar.showDialog(w8);
            }
        }
    }

    public static /* synthetic */ void h0(dy dyVar) {
        if (dyVar.X3.h()) {
            MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            dyVar.U4();
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
        AndroidUtilities.runOnUIThread(new ri(accountInstance, 18), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void j0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        dyVar.U4();
    }

    public static /* synthetic */ void k0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        dyVar.U4();
    }

    public static void l0(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        bg.i2 i2Var;
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.y4.f0(dyVar.currentAccount, tL_error, dyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        dyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bg.i2 i2Var2 = new bg.i2(dyVar, j10, 25);
        Pattern pattern = org.telegram.ui.Components.y4.a;
        if (dyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = dyVar.getCurrentAccount();
            Activity parentActivity = dyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(parentActivity);
            o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(o9Var, g7.e6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, g7.e6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                i2Var = i2Var2;
                z8Var.k(currentAccount, chat);
                o9Var.e(chat, z8Var);
            } else if (UserObject.isReplyUser(user)) {
                z8Var.p = 0.8f;
                z8Var.g(12);
                o9Var.h(null, null, z8Var, user);
                i2Var = i2Var2;
            } else {
                i2Var = i2Var2;
                if (user.id == clientUserId) {
                    z8Var.p = 0.8f;
                    z8Var.g(1);
                    o9Var.h(null, null, z8Var, user);
                } else {
                    z8Var.p = 1.0f;
                    z8Var.m(currentAccount, user);
                    o9Var.e(user, z8Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(i2Var, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            dyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void m0(dy dyVar, int i9) {
        Object obj;
        org.telegram.ui.Components.vm0 vm0Var = dyVar.y0.k0;
        if (i9 < vm0Var.T || i9 >= vm0Var.U) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.l41 G = vm0Var.G(i9);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity(), 0, dyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new yr(5, dyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void n0(dy dyVar, int i9, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i9 != 102) {
            dyVar.r4(arrayList, i9, false, false, null);
            return;
        }
        dyVar.getMessagesController().setDialogsInTransaction(true);
        dyVar.r4(arrayList, i9, false, false, z10 ? hashSet : null);
        dyVar.getMessagesController().setDialogsInTransaction(false);
        dyVar.getMessagesController().checkIfFolderEmpty(dyVar.R2);
        int i10 = dyVar.R2;
        if (i10 == 0 || dyVar.R3(dyVar.currentAccount, dyVar.a0[0].s, i10, false).size() != 0) {
            return;
        }
        dyVar.a0[0].a.setEmptyView(null);
        dyVar.a0[0].w.setVisibility(4);
        dyVar.finishFragment();
    }

    public static /* synthetic */ void p0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, dyVar.w3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        dyVar.U4();
    }

    public static /* synthetic */ void q0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.kd0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.kd0.h();
            }
        }
    }

    public static void q1(dy dyVar, cy cyVar, float f10) {
        if (dyVar.P == f10) {
            return;
        }
        dyVar.P = f10;
        if (f10 == 0.0f) {
            dyVar.Q = false;
        }
        dyVar.A0.setOverscroll(f10);
        cyVar.a.setViewsOffset(f10);
        cyVar.a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        dyVar.fragmentView.invalidate();
        if (f10 <= AndroidUtilities.dp(90.0f) || dyVar.Q) {
            return;
        }
        vw vwVar = dyVar.A0;
        ValueAnimator valueAnimator = vwVar.D0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            vwVar.i(vwVar.l0, true);
            dyVar.Q = true;
            dyVar.getOrCreateStoryViewer().s(new dv(dyVar, 18));
        }
    }

    public static void r0(dy dyVar) {
        b.c(dyVar.getParentActivity(), dyVar.currentAccount, dyVar.getResourceProvider());
    }

    public static boolean r1(dy dyVar, cy cyVar) {
        if (dyVar.B3.c()) {
            return false;
        }
        int i9 = (int) (-dyVar.J);
        int T3 = dyVar.T3();
        int U3 = dyVar.U3();
        if (i9 == 0 || i9 == T3 || i9 == U3 || !cyVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (U3 >= i9 || i9 >= T3) {
            if ((dyVar.p3 != 1.0f ? Utilities.clamp((-dyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < dyVar.A0.x0) {
                cyVar.b.k(-i9);
                return true;
            }
            cyVar.b.k(U3 - i9);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = i9 - U3;
        if (i10 < dp / 2) {
            cyVar.b.k(-i10);
            return true;
        }
        cyVar.b.k(dp - i10);
        return true;
    }

    public static void s0(final int i9, final long j10, TLRPC.Chat chat, final dy dyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        dyVar.b4(false);
        if (i9 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                dyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i9 == 102 && (i12 = dyVar.R2) != 0 && dyVar.R3(dyVar.currentAccount, dyVar.a0[0].s, i12, false).size() == 1) {
            dyVar.a0[0].w.setVisibility(4);
        }
        dyVar.u3 = 3;
        int i13 = -1;
        if (i9 == 102) {
            dyVar.A4(true, true);
            if (dyVar.N1 != null) {
                i11 = 0;
                while (i11 < dyVar.N1.size()) {
                    if (((TLRPC.Dialog) dyVar.N1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i11 = -1;
            dyVar.o3();
            i10 = i11;
        } else {
            i10 = -1;
        }
        UndoView Y3 = dyVar.Y3();
        if (Y3 != null) {
            Y3.j(i9 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.pv
                @Override // java.lang.Runnable
                public final void run() {
                    dyVar.q4(i9, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(dyVar.R3(dyVar.currentAccount, dyVar.a0[0].s, dyVar.R2, false));
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i14)).id == j10) {
                i13 = i14;
                break;
            }
            i14++;
        }
        if (i9 == 102) {
            if (i10 < 0 || i13 >= 0 || (arrayList = dyVar.N1) == null) {
                dyVar.A4(false, true);
                return;
            }
            arrayList.remove(i10);
            dyVar.a0[0].x.D();
            dyVar.a0[0].q(true);
        }
    }

    public static String s2(dy dyVar) {
        ArrayList arrayList = dyVar.E2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == dyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(dyVar.currentAccount, longValue) : DialogObject.getShortName(dyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static void t0(dy dyVar) {
        BirthdayController.getInstance(dyVar.currentAccount).hide();
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        dyVar.U4();
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.oc.a0(dyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static void u0(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            fi1.a(dyVar.getParentActivity(), new eh(dyVar, tL_attachMenuBot, launchActivity), null);
        } else {
            LaunchActivity.C0(launchActivity, dyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static /* synthetic */ void v0(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, dyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(dyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void w0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        dyVar.U4();
    }

    public static void x0(dy dyVar) {
        if (dyVar.K3) {
            kh.x3 x3Var = dyVar.l0;
            if (x3Var != null) {
                x3Var.e(true);
            }
            ih.p6 o6 = MessagesController.getInstance(dyVar.currentAccount).getStoriesController().o();
            if (o6 != null && o6.a(dyVar.currentAccount, 1)) {
                dyVar.showDialog(new zf.j0(o6.b(), dyVar.currentAccount, dyVar.getParentActivity(), dyVar, null));
                return;
            } else {
                kh.wb E = kh.wb.E(dyVar.getParentActivity(), dyVar.currentAccount);
                E.x = new ix(dyVar, 4);
                E.R(null);
                return;
            }
        }
        kh.x3 x3Var2 = dyVar.m0;
        if (x3Var2 != null) {
            if (x3Var2.R) {
                return;
            } else {
                AndroidUtilities.removeFromParent(x3Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.f6.Gi, 0, new uv(dyVar, 7));
        kh.x3 x3Var3 = new kh.x3(dyVar.getParentActivity(), 2);
        x3Var3.r(8.0f);
        x3Var3.d = 8000L;
        x3Var3.i();
        x3Var3.q(true);
        x3Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        x3Var3.t(replaceSingleTag);
        x3Var3.m(1.0f, -40.0f);
        x3Var3.h(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        dyVar.m0 = x3Var3;
        x3Var3.setTranslationY((-dyVar.c4) - dyVar.e4);
        ((ViewGroup) dyVar.fragmentView).addView(dyVar.m0, g7.e6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        dyVar.m0.v();
    }

    public static void y0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        dyVar.U4();
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.oc.a0(dyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void z0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.kd0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.kd0.h();
            }
        }
    }

    @Override // uf.b
    public final List A() {
        return Arrays.asList(new uf.a(LocaleController.getString(R.string.DebugDialogsActivity)), new uf.a(LocaleController.getString(R.string.ClearLocalDatabase), new dv(this, 27)), new uf.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new dv(this, 28)));
    }

    public final void A3() {
        org.telegram.ui.Components.j10.d(this.h0, e2.c.C(this.b.e, 1.0f - V3(), 1.0f - this.c.e, this.d.e));
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
        cy cyVar = this.a0[0];
        cyVar.d.C = z10;
        if (z10 || !z11) {
            return;
        }
        if (cyVar.a.b0()) {
            this.a0[0].a.post(new uv(this, 8));
        } else {
            this.a0[0].d.l();
        }
    }

    @Override // td.b
    public final void B(float f10, int i9) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i9 != 3 || (w0Var = this.h0) == null) {
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
            String k02 = PremiumPreviewFragment.k0(2);
            if (premiumPromo != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= premiumPromo.video_sections.size()) {
                        i10 = -1;
                        break;
                    } else if (premiumPromo.video_sections.get(i10).equals(k02)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i10), premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void B3() {
        fh.l2 l2Var;
        boolean z10 = !this.f2 && ((l2Var = this.G0) == null || l2Var.getBackground() == null || this.G0.getAlpha() < 0.01f || this.G0.getVisibility() == 8);
        kg0 kg0Var = this.E3;
        if (kg0Var != null) {
            kg0Var.a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        cy cyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            cy[] cyVarArr = this.a0;
            if (cyVarArr != null && (cyVar = cyVarArr[0]) != null) {
                cyVar.setLayerType(2, null);
                this.a0[0].setClipChildren(false);
                this.a0[0].setClipToPadding(false);
                this.a0[0].a.setClipChildren(false);
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setLayerType(2, null);
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
            int i9 = 0;
            while (true) {
                cy[] cyVarArr2 = this.a0;
                if (i9 >= cyVarArr2.length) {
                    break;
                }
                cy cyVar2 = cyVarArr2[i9];
                if (cyVar2 != null) {
                    cyVar2.setLayerType(0, null);
                    cyVar2.setClipChildren(true);
                    cyVar2.setClipToPadding(true);
                    cyVar2.a.setClipChildren(true);
                }
                i9++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        vw vwVar = this.A0;
        if (vwVar != null) {
            vwVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.j10.d(this.g0, (1.0f - this.b.e) * (1.0f - V3()) * (1.0f - this.c.e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f10) {
        cy[] cyVarArr = this.a0;
        if (cyVarArr != null) {
            int paddingTop = cyVarArr[0].a.getPaddingTop() + ((int) f10);
            int i9 = 0;
            while (true) {
                cy[] cyVarArr2 = this.a0;
                if (i9 >= cyVarArr2.length) {
                    break;
                }
                cyVarArr2[i9].a.setTopGlowOffset(paddingTop);
                i9++;
            }
        }
        if (this.fragmentView == null || f10 == this.J) {
            return;
        }
        this.J = f10;
        org.telegram.ui.Components.gc gcVar = this.j3;
        if (gcVar != null) {
            gcVar.l();
        }
        if (this.A3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.A3;
            float f11 = (int) f10;
            float f12 = oVar.f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.A3.setAlpha(g7.n.a(currentActionBarHeight, 0.0f, 1.0f));
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

    public final void D4(float f10) {
        this.t1 = f10;
        if (this.n3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.R2 == 0 && this.T2 == 0) ? org.telegram.ui.ActionBar.f6.v8 : org.telegram.ui.ActionBar.f6.O8);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i9 = org.telegram.ui.ActionBar.f6.y8;
            kVar.C(i0.a.d(this.t1, themedColor, getThemedColor(i9)), false);
            this.actionBar.C(i0.a.d(this.t1, getThemedColor(i9), getThemedColor(i9)), true);
            this.actionBar.A(i0.a.d(this.t1, getThemedColor((this.R2 == 0 && this.T2 == 0) ? org.telegram.ui.ActionBar.f6.t8 : org.telegram.ui.ActionBar.f6.N8), getThemedColor(org.telegram.ui.ActionBar.f6.z8)), false);
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
        float a2 = 1.0f - g7.n.a(((-this.J) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
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
            float f10 = (this.W != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.V.setScaleX(lerp);
            this.V.setScaleY(lerp);
            this.V.setAlpha(f10);
            this.V.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.m71 m71Var = this.W;
        td.a aVar = this.s;
        if (m71Var != null) {
            float f11 = 1.0f - aVar.e;
            m71Var.setAlpha(f11);
            this.W.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        of.o0 o0Var = this.X;
        if (o0Var != null) {
            float f12 = aVar.e;
            o0Var.setAlpha(f12);
            this.X.setVisibility(f12 > 0.0f ? 0 : 8);
        }
    }

    public final void F4(float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.T3 != f10) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.U3 = z10;
            this.T3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.U3) {
                float f11 = (1.0f - this.T3) * (-AndroidUtilities.dp(40.0f));
                vw vwVar = this.A0;
                if (vwVar != null) {
                    vwVar.setTranslationX(f11);
                }
                sx sxVar = this.T;
                if (sxVar != null) {
                    sxVar.setTranslationX(f11);
                }
                yw ywVar = this.B3;
                if (ywVar == null || ywVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.B3.getFragmentView().setTranslationX(f11);
                return;
            }
            float f12 = -AndroidUtilities.dp(4.0f);
            float f13 = 1.0f - this.T3;
            float f14 = f12 * f13;
            float f15 = 1.0f - (f13 * 0.05f);
            vw vwVar2 = this.A0;
            if (vwVar2 != null) {
                vwVar2.setScaleX(f15);
                this.A0.setScaleY(f15);
                this.A0.setTranslationX(f14);
                this.A0.setPivotX(0.0f);
                this.A0.setPivotY(0.0f);
            }
            sx sxVar2 = this.T;
            if (sxVar2 != null) {
                sxVar2.setTranslationX(f14);
                this.T.setScaleX(f15);
                this.T.setScaleY(f15);
            }
            yw ywVar2 = this.B3;
            if (ywVar2 == null || ywVar2.getFragmentView() == null) {
                return;
            }
            if (!this.y) {
                this.B3.getFragmentView().setScaleX(f15);
                this.B3.getFragmentView().setScaleY(f15);
                this.B3.getFragmentView().setTranslationX(f14);
            }
            this.B3.getFragmentView().setPivotX(0.0f);
            this.B3.getFragmentView().setPivotY(0.0f);
        }
    }

    public final void G3(boolean z10) {
        if (this.y0 == null || this.actionBar == null) {
            return;
        }
        int i9 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.W != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.bs bsVar = this.F1;
        int c10 = measuredHeight + (bsVar != null ? (int) bsVar.c(AndroidUtilities.dp(7.0f)) : 0);
        mx mxVar = this.y0;
        SparseArray sparseArray = mxVar.h;
        mxVar.Q0 = c10;
        mxVar.R0 = i9;
        gh.f1 f1Var = mxVar.R;
        if (z10) {
            f1Var.o1(0, c10, 0, i9);
        } else {
            f1Var.setPadding(0, c10, 0, i9);
        }
        mxVar.I0.j(mxVar.Q0, mxVar.R0, z10);
        org.telegram.ui.Components.um0 um0Var = mxVar.S;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) um0Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = mxVar.Q0;
        if (i10 != i11 || marginLayoutParams.bottomMargin != mxVar.R0) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = mxVar.R0;
            um0Var.requestLayout();
        }
        org.telegram.ui.Components.hn0.P(mxVar.b0, mxVar.e0, mxVar.Q0, mxVar.R0, z10);
        org.telegram.ui.Components.hn0.P(mxVar.g0, mxVar.j0, mxVar.Q0, mxVar.R0, z10);
        org.telegram.ui.Components.hn0.P(mxVar.n0, mxVar.q0, mxVar.Q0, mxVar.R0, z10);
        org.telegram.ui.Components.kg0 kg0Var = mxVar.l0;
        int i12 = mxVar.Q0;
        int i13 = mxVar.R0;
        kg0Var.setClipToPadding(false);
        org.telegram.ui.Components.i51 i51Var = kg0Var.c;
        kg0Var.F = z10;
        kg0Var.setPadding(0, i12, 0, i13);
        if (z10) {
            i51Var.o1(0, i12, 0, i13);
        } else {
            i51Var.setPadding(0, i12, 0, i13);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i51Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i12;
        marginLayoutParams2.bottomMargin = -i13;
        kg0Var.F = false;
        org.telegram.ui.Components.gm0 gm0Var = mxVar.C0;
        if (gm0Var != null) {
            gm0Var.b(mxVar.Q0, mxVar.R0, z10);
        }
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) sparseArray.valueAt(i14);
            if (view instanceof f10) {
                ((f10) view).j(mxVar.Q0, mxVar.R0, z10);
            }
        }
        for (int i15 = 0; i15 < mxVar.getChildCount(); i15++) {
            if (mxVar.getChildAt(i15) instanceof f10) {
                ((f10) mxVar.getChildAt(i15)).j(mxVar.Q0, mxVar.R0, z10);
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.p61(11, this, r0), new ri(r0, 17));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(p6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
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
    public final boolean H4(org.telegram.ui.Cells.r2 r2Var) {
        long j10;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j11;
        int i9;
        LinearLayout linearLayout;
        dy dyVar;
        char c10;
        boolean[] zArr;
        MessagesController.DialogFilter dialogFilter;
        boolean[] zArr2;
        long j12;
        ?? r42;
        long j13;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        int i14;
        int i15;
        final long j14;
        int i16;
        org.telegram.ui.ActionBar.g1 g1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        final dy dyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(r2Var.c2);
        boolean z11 = false;
        if (r2Var.N()) {
            if (r2Var.getCurrentDialogFolderId() != 1) {
                return false;
            }
            m4(r2Var);
            return false;
        }
        long dialogId = r2Var.getDialogId();
        Bundle bundle = new Bundle();
        int messageId = r2Var.getMessageId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            return false;
        }
        if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            if (dyVar2.T2 != 0 && ((b10 = nh.r0.b(dyVar2.currentAccount, dialogId)) == 4 || b10 == 3)) {
                return false;
            }
            TLRPC.Chat chat = dyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
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
        boolean z12 = dyVar2.T2 == 0 && dyVar2.getMessagesController().filtersEnabled && dyVar2.getMessagesController().dialogFiltersLoaded && dyVar2.getMessagesController().dialogFilters != null && dyVar2.getMessagesController().dialogFilters.size() > 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
        if (z12) {
            LinearLayout linearLayout2 = new LinearLayout(dyVar2.getParentActivity());
            linearLayout2.setOrientation(1);
            fh.v3 v3Var = new fh.v3(dyVar2.getParentActivity(), 1);
            LinearLayout linearLayout3 = new LinearLayout(dyVar2.getParentActivity());
            linearLayout3.setOrientation(1);
            v3Var.addView(linearLayout3);
            int size = dyVar2.getMessagesController().dialogFilters.size();
            int i17 = 0;
            org.telegram.ui.ActionBar.g1 g1Var2 = null;
            while (i17 < size) {
                final MessagesController.DialogFilter dialogFilter2 = dyVar2.getMessagesController().dialogFilters.get(i17);
                if (dialogFilter2.isDefault()) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i14 = i17;
                    i15 = size;
                    j14 = dialogId;
                } else {
                    final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(dyVar2.currentAccount), dialogId);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i14 = i17;
                    i15 = size;
                    j14 = dialogId;
                    final ArrayList H = org.telegram.ui.Components.yz.H(dyVar2, dialogFilter2, arrayList, true, z11);
                    if (!includesDialog) {
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, dyVar2.getParentActivity(), null, false, false);
                    g1Var3.setChecked(includesDialog);
                    i16 = i15;
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, g1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, g1Var3.getTextView().getPaint().getFontMetricsInt());
                    g1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                    g1Var3.g(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.o00(dyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                    g1Var3.getTextView().setEmojiColor(dyVar2.getThemedColor(org.telegram.ui.ActionBar.f6.Oh));
                    g1Var3.setMinimumWidth(160);
                    g1Var = g1Var3;
                    j14 = j14;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                    g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xv
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArrayList arrayList2;
                            long j15;
                            MessagesController.DialogFilter dialogFilter3;
                            dy dyVar3 = dy.this;
                            dyVar3.getClass();
                            boolean z13 = includesDialog;
                            ArrayList arrayList3 = H;
                            MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                            long j16 = j14;
                            if (z13) {
                                dialogFilter4.alwaysShow.remove(Long.valueOf(j16));
                                dialogFilter4.neverShow.add(Long.valueOf(j16));
                                n00.s0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, dyVar3, null);
                                dyVar3.Y3().k(j16, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
                            } else {
                                if (arrayList3.isEmpty()) {
                                    arrayList2 = arrayList3;
                                    j15 = j16;
                                    dialogFilter3 = dialogFilter4;
                                } else {
                                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                        dialogFilter4.neverShow.remove(arrayList3.get(i18));
                                    }
                                    dialogFilter4.alwaysShow.addAll(arrayList3);
                                    arrayList2 = arrayList3;
                                    dialogFilter3 = dialogFilter4;
                                    j15 = j16;
                                    n00.s0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, dyVar3, null);
                                }
                                dyVar3.Y3().k(j15, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                            }
                            dyVar3.b4(true);
                            dyVar3.finishPreviewFragment();
                        }
                    });
                    linearLayout3.addView(g1Var);
                    dyVar2 = this;
                    dialogId = j14;
                    size = i16;
                    i17 = i14 + 1;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                    g1Var2 = g1Var;
                    z11 = false;
                }
                g1Var = g1Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                i16 = i15;
                dyVar2 = this;
                dialogId = j14;
                size = i16;
                i17 = i14 + 1;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                g1Var2 = g1Var;
                z11 = false;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j11 = dialogId;
            org.telegram.ui.ActionBar.g1 g1Var4 = g1Var2;
            i9 = 160;
            if (g1Var4 != null) {
                g1Var4.j(false, true);
            }
            if (linearLayout3.getChildCount() <= 0) {
                z12 = false;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            } else {
                View l1Var = new org.telegram.ui.ActionBar.l1(getParentActivity(), org.telegram.ui.ActionBar.f6.H8, getResourceProvider());
                l1Var.setTag(R.id.fit_width_tag, 1);
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
                g1Var5.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var5.setMinimumWidth(160);
                g1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                linearLayout2.addView(g1Var5);
                linearLayout2.addView(l1Var, g7.e6.n(-1, 8));
                linearLayout2.addView(v3Var);
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            }
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j11 = dialogId;
            i9 = 160;
            linearLayout = null;
        }
        org.telegram.ui.ActionBar.o2[] o2VarArr = new org.telegram.ui.ActionBar.o2[1];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (z12) {
            int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
            org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            g1Var6.g(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
            g1Var6.setMinimumWidth(i9);
            g1Var6.setOnClickListener(new org.telegram.ui.Components.vh0(19, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var6);
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new wt(o2VarArr, 3));
        }
        if (isCommunity) {
            dyVar = this;
            c10 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (r2Var.getHasUnread()) {
                g1Var7.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            } else {
                g1Var7.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
            }
            g1Var7.setMinimumWidth(i9);
            long j15 = j11;
            dy dyVar3 = this;
            j11 = j15;
            g1Var7.setOnClickListener(new gh.s2(dyVar3, r2Var, j15, 5));
            c10 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var7);
            dyVar = dyVar3;
        }
        boolean[] zArr3 = new boolean[1];
        zArr3[c10] = true;
        TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(j11);
        int i18 = dyVar.a0[c10].s;
        boolean z13 = (i18 == 7 || i18 == 8) && (!dyVar.actionBar.s() || dyVar.actionBar.t(null));
        if (z13) {
            zArr = zArr3;
            dialogFilter = dyVar.getMessagesController().selectedDialogFilter[dyVar.a0[0].s == 8 ? (char) 1 : (char) 0];
        } else {
            zArr = zArr3;
            dialogFilter = null;
        }
        if (dyVar.g4(dialog)) {
            zArr2 = zArr;
            j12 = j11;
            r42 = 0;
        } else {
            ArrayList<TLRPC.Dialog> dialogs = dyVar.getMessagesController().getDialogs(dyVar.R2);
            int size2 = dialogs.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (i19 >= size2) {
                    z10 = z13;
                    zArr2 = zArr;
                    j12 = j11;
                    break;
                }
                TLRPC.Dialog dialog2 = dialogs.get(i19);
                z10 = z13;
                if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                    zArr2 = zArr;
                    j12 = j11;
                } else if (dyVar.g4(dialog2)) {
                    zArr2 = zArr;
                    j12 = j11;
                    if (DialogObject.isEncryptedDialog(dialog2.id)) {
                        i21++;
                    } else {
                        i20++;
                    }
                } else {
                    zArr2 = zArr;
                    j12 = j11;
                    if (!dyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                        break;
                    }
                }
                i19++;
                zArr = zArr2;
                j11 = j12;
                z13 = z10;
            }
            if (dialog == null || dyVar.g4(dialog)) {
                i11 = 0;
                i12 = 0;
                i13 = 0;
            } else {
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j12);
                int i22 = !isEncryptedDialog ? 1 : 0;
                if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(j12))) {
                    i13 = i22;
                    i12 = isEncryptedDialog ? 1 : 0;
                    i11 = 0;
                } else {
                    i13 = i22;
                    i12 = isEncryptedDialog ? 1 : 0;
                    i11 = 1;
                }
            }
            int size3 = (!z10 || dialogFilter == null) ? (dyVar.R2 == 0 && dialogFilter == null) ? dyVar.getUserConfig().isPremium() ? dyVar.getMessagesController().maxPinnedDialogsCountPremium : dyVar.getMessagesController().maxPinnedDialogsCountDefault : dyVar.getUserConfig().isPremium() ? dyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : dyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
            boolean z14 = i12 + i21 <= size3 && (i13 + i20) - i11 <= size3;
            r42 = 0;
            zArr2[0] = z14;
        }
        if (zArr2[r42]) {
            org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(dyVar.getParentActivity(), r42, r42);
            if (dyVar.g4(dialog)) {
                g1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
            }
            g1Var8.setMinimumWidth(160);
            long j16 = j12;
            j13 = j16;
            g1Var8.setOnClickListener(new bg.f1(dyVar, dialogFilter, dialog, j16, 2));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var8);
        } else {
            j13 = j12;
        }
        if (DialogObject.isUserDialog(j13) && UserObject.isUserSelf(dyVar.getMessagesController().getUser(Long.valueOf(j13)))) {
            i10 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(dyVar.getParentActivity(), false, false);
            if (dyVar.getMessagesController().isDialogMuted(j13, 0L)) {
                g1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
            } else {
                g1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
            }
            g1Var9.setMinimumWidth(160);
            g1Var9.setOnClickListener(new fh.p(dyVar, j13, 4));
            i10 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var9);
        }
        if (!isCommunity) {
            org.telegram.ui.ActionBar.g1 g1Var10 = new org.telegram.ui.ActionBar.g1(dyVar.getParentActivity(), i10, true);
            g1Var10.setIconColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
            int i23 = org.telegram.ui.ActionBar.f6.q7;
            g1Var10.setTextColor(dyVar.getThemedColor(i23));
            g1Var10.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, dyVar.getThemedColor(i23)));
            g1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
            g1Var10.setMinimumWidth(160);
            g1Var10.setOnClickListener(new org.telegram.ui.Components.vh0(20, dyVar, arrayList));
            i10 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var10);
        }
        if (isCommunity) {
            if (dyVar.j2 != null) {
                dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i10]);
            }
            dyVar.t4();
            dyVar.parentLayout.setHighlightActionButtons(true);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("community_id", -j13);
            dy dyVar4 = new dy(bundle2);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2VarArr[0] = dyVar4;
                dyVar.presentFragmentAsPreview(dyVar4);
                return false;
            }
            o2VarArr[0] = dyVar4;
            dyVar.presentFragmentAsPreviewWithMenu(dyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
            return false;
        }
        if (!dyVar.getMessagesController().checkCanOpenChat(bundle, dyVar)) {
            return false;
        }
        if (dyVar.j2 != null) {
            dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i10]);
        }
        dyVar.t4();
        dyVar.parentLayout.setHighlightActionButtons(true);
        qn qnVar = new qn(bundle);
        Point point2 = AndroidUtilities.displaySize;
        if (point2.x > point2.y) {
            o2VarArr[0] = qnVar;
            dyVar.presentFragmentAsPreview(qnVar);
            return true;
        }
        o2VarArr[0] = qnVar;
        dyVar.presentFragmentAsPreviewWithMenu(qnVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
        qnVar.F9 = true;
        try {
            qnVar.W0.getAvatarImageView().performAccessibilityAction(64, null);
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean I3() {
        return this.N0 == 10;
    }

    public final void I4(boolean z10) {
        int i9 = 1;
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
        this.L3.addListener(new ex(this, z10, i9));
        this.L3.start();
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            sx sxVar = this.T;
            td.a aVar = this.b;
            sxVar.setBlurredBackgroundVisibility(aVar.e);
            float b10 = ff.m0.b(aVar.e);
            org.telegram.ui.Components.o9 o9Var = this.W2;
            if (o9Var != null) {
                o9Var.setScaleX(b10);
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
        if (i9 == 2) {
            C3();
            E3();
            return;
        }
        if (i9 == 3) {
            A3();
            return;
        }
        if (i9 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i9 == 5) {
            z3();
            return;
        }
        if (i9 == 6) {
            C3();
            E3();
        } else {
            if (i9 == 7) {
                v3();
                return;
            }
            if (i9 == 8) {
                u3();
                F3();
            } else if (i9 == 9) {
                F3();
            }
        }
    }

    public final void J3() {
        if (!AndroidUtilities.isTablet()) {
            this.R1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
        TLObject tLObject = this.T1;
        if (tLObject != null) {
            mx mxVar = this.y0;
            if (mxVar != null) {
                mxVar.U.R(this.S1, tLObject);
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
        AndroidUtilities.runOnUIThread(new uv(this, 9), 1000L);
    }

    public final void K3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.j0) {
            return;
        }
        kVar.h(true);
        this.l3 = false;
        V4(true, true);
    }

    public final void K4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        org.telegram.ui.Components.p61 p61Var;
        int i9;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        CharSequence charSequence;
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, this.g0);
        int i11 = org.telegram.ui.ActionBar.f6.A8;
        H.S(getThemedColor(i11), getThemedColor(i11));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i12 = 0;
        if (this.T2 != 0) {
            if (ChatObject.hasAdminRights(this.U2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new dv(this, 4), false);
                H.k();
            }
            H.i(new dv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.U2.collapsed_in_dialogs);
            H.i(new dv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.U2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new dv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new dv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.b6 b6Var2 = this.resourceProvider;
        boolean a2 = b6Var2 != null ? b6Var2.a() : org.telegram.ui.ActionBar.f6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new dv(this, 11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new dv(this, 12), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new dv(this, 13), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(H);
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (launchActivity2 != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i13);
                i13++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu) {
                    gv gvVar = new gv(this, tL_attachMenuBot2, launchActivity2, 0);
                    org.telegram.ui.Components.p61 p61Var2 = new org.telegram.ui.Components.p61(10, this, tL_attachMenuBot2);
                    org.telegram.ui.ActionBar.b6 b6Var3 = H.d;
                    if (H.e != null) {
                        int i14 = org.telegram.ui.ActionBar.f6.F8;
                        int i15 = org.telegram.ui.ActionBar.f6.E8;
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                        g1Var2.setPadding(AndroidUtilities.dp(18.0f), i12, AndroidUtilities.dp(18.0f), i12);
                        CharSequence a3 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.p8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                        TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                        if (sideAttachMenuBotIcon != null) {
                            launchActivity = launchActivity2;
                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.f6.c7, 1.0f);
                            if (svgThumb != null) {
                                Integer num = H.k0;
                                charSequence = a3;
                                svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.f6.v0(i14, b6Var3), PorterDuff.Mode.SRC_IN));
                            } else {
                                charSequence = a3;
                            }
                            i9 = i15;
                            p61Var = p61Var2;
                            i10 = i14;
                            g1Var = g1Var2;
                            b6Var = b6Var3;
                            g1Var.h(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                            org.telegram.ui.Components.o9 o9Var = g1Var.h;
                            if (o9Var != null) {
                                o9Var.setLayoutParams(g7.e6.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                            }
                        } else {
                            launchActivity = launchActivity2;
                            p61Var = p61Var2;
                            i9 = i15;
                            g1Var = g1Var2;
                            b6Var = b6Var3;
                            CharSequence charSequence2 = a3;
                            i10 = i14;
                            g1Var.g(charSequence2, R.drawable.msg_bot, null);
                        }
                        Integer num2 = H.j0;
                        int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                        Integer num3 = H.k0;
                        g1Var.c(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                        Integer num4 = H.k0;
                        g1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                        Integer num5 = H.l0;
                        g1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
                        g1Var.setOnClickListener(new org.telegram.ui.Components.s2(25, H, gvVar));
                        g1Var.setOnLongClickListener(new ih.g2(3, H, p61Var));
                        int i16 = H.S;
                        if (i16 > 0) {
                            g1Var.setMinimumWidth(AndroidUtilities.dp(i16));
                            H.r(g1Var, g7.e6.n(H.S, -2));
                        } else {
                            H.r(g1Var, g7.e6.n(-1, -2));
                        }
                        launchActivity2 = launchActivity;
                        i12 = 0;
                    }
                }
                launchActivity = launchActivity2;
                launchActivity2 = launchActivity;
                i12 = 0;
            }
        }
        if (getUserConfig().showCallsTab) {
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new dv(this, 6), false);
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.k0;
        if (g1Var3 != null) {
            g1Var3.b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.ai));
            this.k0.setOnClickListener(new org.telegram.ui.Components.vh0(17, this, H));
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
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(str);
        boolean z10 = this.S;
        ArrayList arrayList = this.e1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.c1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.c1.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.c1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.y8), PorterDuff.Mode.MULTIPLY));
            this.c1.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.z8), 1, -1));
            this.c1.setOnClickListener(new iv(this, 6));
            j10.addView(this.c1, g7.e6.q(54, 54, 16));
            arrayList.add(this.c1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d1 = numberTextView;
        numberTextView.setTextSize(18);
        this.d1.setTypeface(AndroidUtilities.bold());
        this.d1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y8));
        j10.addView(this.d1, g7.e6.m(1.0f, 0, -1, this.S ? 18 : 72, 0, 0));
        this.d1.setOnTouchListener(new jh.d(2));
        this.g1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.h1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.i1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), g7.e6.n(5, -1));
        this.m1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.j1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.k1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.l1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.o1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.n1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.p1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.h1.setOnLongClickListener(new qv(this, 0));
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
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new jv(this, 6));
                showDialog(alertDialog$Builder.a, new ev(this, 1));
                this.O3 = str;
                return;
            }
        }
    }

    public final void M3() {
        mx mxVar = this.y0;
        if ((mxVar != null && mxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        mx mxVar2 = new mx(this, getParentActivity(), this, this.j2 != null ? 2 : !this.h2 ? 1 : 0, this.N0, this.R2, this.T2, new ix(this, 1));
        this.y0 = mxVar2;
        ((vx) this.fragmentView).addView(mxVar2, this.x0);
        mx mxVar3 = this.y0;
        mxVar3.U.Q = new ox(this);
        mxVar3.e0.setOnItemClickListener(new jv(this, 1));
        this.y0.j0.setOnItemClickListener(new jv(this, 2));
        this.y0.q0.setOnItemClickListener(new nv(this, 0));
        this.y0.j0.setOnItemLongClickListener(new jv(this, 3));
        this.y0.R.setOnItemClickListener(new jv(this, 4));
        this.y0.R.setOnItemLongClickListener(new ix(this, 2));
        this.y0.setFilteredSearchViewDelegate(new jv(this, 5));
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
        char c10 = 1;
        int i9 = 0;
        if (!s10) {
            if (this.l3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.Cells.j2.v(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            this.actionBar.N(null, null);
            int i10 = this.a0[0].s;
            ArrayList<TLRPC.Dialog> R3 = ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) ? R3(this.currentAccount, this.a0[0].s, this.R2, this.O1) : getMessagesController().getDialogs(this.R2);
            int size = R3.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = R3.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!g4(dialog)) {
                        if (!getMessagesController().isPromoDialog(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i11++;
                    }
                }
            }
            if (i11 > 1) {
                if (this.a0 != null) {
                    int i13 = 0;
                    while (true) {
                        cy[] cyVarArr = this.a0;
                        if (i13 >= cyVarArr.length) {
                            break;
                        }
                        cyVarArr[i13].d.D = true;
                        i13++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.l3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = this.e1;
                    if (i14 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i14);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i14++;
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
            int i15 = 0;
            while (true) {
                cy[] cyVarArr2 = this.a0;
                if (i15 >= cyVarArr2.length) {
                    break;
                }
                cy cyVar = cyVarArr2[i15];
                if (cyVar != null) {
                    cyVar.a.I0(true);
                }
                i15++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.G ? 81 : 0) + 48) + this.J);
            if (max != 0.0f) {
                this.L = (int) max;
                this.fragmentView.requestLayout();
            }
            this.q3.addUpdateListener(new kv(this, max, i9));
            this.q3.addListener(new gx(this, max, c10 == true ? 1 : 0));
            this.q3.setInterpolator(org.telegram.ui.Components.gr.f);
            this.q3.setDuration(200L);
            this.q3.start();
            cw cwVar = this.v0;
            if (cwVar != null) {
                cwVar.b(org.telegram.ui.ActionBar.f6.Gh, org.telegram.ui.ActionBar.f6.Fh, org.telegram.ui.ActionBar.f6.Eh, org.telegram.ui.ActionBar.f6.Hh, org.telegram.ui.ActionBar.f6.w8);
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

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.u0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i9 = 0; i9 < 2; i9++) {
                undoViewArr[i9] = new hx(this, parentActivity);
                FrameLayout.LayoutParams d = g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.c4 + this.e4 + d.bottomMargin;
                vx vxVar = (vx) this.fragmentView;
                UndoView undoView = undoViewArr[i9];
                int i10 = this.t0 + 1;
                this.t0 = i10;
                vxVar.addView(undoView, i10, d);
            }
        }
    }

    public final void N4(long j10, View view) {
        int i9 = -this.I3;
        this.I3 = i9;
        AndroidUtilities.shakeViewSpring(view, i9);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.oc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.oc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dv(this, 22))).j();
    }

    public final void O3(final long j10, final long j11, boolean z10, final we1 we1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j10)) {
            int i9 = this.N0;
            if (i9 == 11 || i9 == 12 || i9 == 13) {
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
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new gh.y2(this, c2Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    c2Var.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            int i10 = 1;
            if (!z10 || ((this.b2 == null || this.c2 == null) && this.d2 == null)) {
                if (i9 != 15) {
                    if (this.y2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.y2.v(this, arrayList, null, false, this.F2, this.G2, this.H2, we1Var) && this.e2) {
                        this.y2 = null;
                        return;
                    }
                    return;
                }
                Runnable wVar = new e5.w(this, j10, new e5.y(this, j10, j11, we1Var, 13), 27);
                if (j10 < 0) {
                    Q4(getMessagesController().getChat(Long.valueOf(-j10)), wVar, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.D));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                c2Var2.N = formatString;
                c2Var2.P = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new wt(wVar, i10));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.if0(20));
                showDialog(c2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.l0.l(getMessagesController(), j10).user_id));
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
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.bw
                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i11) {
                    dy.this.O3(j10, j11, false, we1Var);
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
        mx mxVar;
        mx mxVar2;
        vw vwVar;
        mx mxVar3;
        boolean z14;
        mx mxVar4;
        boolean z15;
        org.telegram.ui.Components.m71 m71Var;
        TLRPC.Chat chat;
        yw ywVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i9 = 0;
        if (z10) {
            M3();
        } else {
            c5(false);
        }
        int i10 = this.N0;
        if (i10 != 0 && i10 != 3) {
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
                    mxVar4 = this.y0;
                    if (mxVar4 != null) {
                        mxVar4.K0 = z14;
                    }
                    z15 = z14 || this.G;
                    this.n3 = z15;
                    if (z15) {
                        this.o3 = true;
                    }
                    m71Var = this.W;
                    if (m71Var != null && mxVar4 != null && !z14 && this.T2 == 0) {
                        org.telegram.ui.Components.m71 n10 = mxVar4.n(-2, false);
                        this.W = n10;
                        this.V.addView(n10, 0, g7.e6.e(-1, -1, 119));
                    } else if (this.V != null && z14 && this.T2 == 0) {
                        AndroidUtilities.removeFromParent(m71Var);
                        this.W = null;
                    }
                    if (this.y0 != null) {
                        G3(false);
                        this.y0.setKeyboardHeight(((vx) this.fragmentView).getKeyboardHeight());
                        mx mxVar5 = this.y0;
                        mxVar5.w0.clear();
                        mxVar5.J();
                    }
                    chat = this.U2;
                    if (chat == null) {
                        of.m0 m0Var = new of.m0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        m0Var.f = this.U2;
                        j3(m0Var);
                    } else if (this.R2 != 0 && ((ywVar = this.B3) == null || !ywVar.c())) {
                        j3(new of.m0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z14 = false;
            mxVar4 = this.y0;
            if (mxVar4 != null) {
            }
            if (z14) {
            }
            this.n3 = z15;
            if (z15) {
            }
            m71Var = this.W;
            if (m71Var != null) {
            }
            if (this.V != null) {
                AndroidUtilities.removeFromParent(m71Var);
                this.W = null;
            }
            if (this.y0 != null) {
            }
            chat = this.U2;
            if (chat == null) {
            }
        }
        if (z16 && (mxVar3 = this.y0) != null && mxVar3.U.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (vwVar = this.A0) != null && this.C0) {
            vwVar.setVisibility(0);
        }
        boolean z17 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                mx mxVar6 = this.y0;
                if (mxVar6 != null) {
                    mxVar6.setVisibility(0);
                    mx mxVar7 = this.y0;
                    mxVar7.setPosition(0);
                    if (mxVar7.U.h() > 0) {
                        mxVar7.V.h1(0, 0);
                    }
                    f2.m0 m0Var2 = mxVar7.d0;
                    if (m0Var2 != null) {
                        m0Var2.h1(0, 0);
                    }
                    f2.m0 m0Var3 = mxVar7.i0;
                    if (m0Var3 != null) {
                        m0Var3.h1(0, 0);
                    }
                    f2.m0 m0Var4 = mxVar7.p0;
                    if (m0Var4 != null) {
                        m0Var4.h1(0, 0);
                    }
                    mxVar7.h.clear();
                }
                W4(true, null, null, false, false);
                org.telegram.ui.Components.m71 m71Var2 = this.W;
                if (m71Var2 != null) {
                    m71Var2.b(false, false);
                }
            } else {
                this.a0[0].a.setVisibility(0);
                this.a0[0].setVisibility(0);
            }
            A4(true, true);
            this.a0[0].a.setVerticalScrollBarEnabled(false);
            mx mxVar8 = this.y0;
            if (mxVar8 != null) {
                mxVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            }
            this.s1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            cy cyVar = this.a0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(cyVar, (Property<cy, Float>) property, z10 ? 0.0f : 1.0f));
            if (z17) {
                this.a0[0].setScaleX(1.0f);
                this.a0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.a0[0], (Property<cy, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.a0[0], (Property<cy, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            yw ywVar2 = this.B3;
            if (ywVar2 != null) {
                ywVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.B3, (Property<yw, Float>) property, z10 ? 0.0f : 1.0f));
            }
            mx mxVar9 = this.y0;
            if (mxVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(mxVar9, (Property<mx, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.G) {
                    float dp = AndroidUtilities.dp(81.0f) + this.J + AndroidUtilities.dp(48.0f);
                    mx mxVar10 = this.y0;
                    float f10 = z10 ? dp : 0.0f;
                    if (z10) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(mxVar10, this.D3, f10, dp));
                }
                if (z17) {
                    this.y0.setScaleX(1.0f);
                    this.y0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.y0, (Property<mx, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.y0, (Property<mx, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.c0 != null) {
                Z4(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new fv(this, 1));
            arrayList.add(ofFloat);
            this.s1.playTogether(arrayList);
            this.s1.setDuration(z10 ? 200L : 180L);
            this.s1.setInterpolator(org.telegram.ui.Components.gr.g);
            if (!z10) {
                this.s1.setStartDelay(20L);
            }
            this.s1.addListener(new ex(this, z10, i9));
            this.k3.lock();
            this.s1.start();
        } else {
            A4(false, true);
            if (z10) {
                this.a0[0].a.c1();
            } else {
                yx yxVar = this.a0[0].a;
                if (yxVar.e1) {
                    yxVar.e1 = false;
                    yxVar.J0(false);
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
            mx mxVar11 = this.y0;
            if (mxVar11 != null) {
                mxVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (z17) {
                    this.y0.setScaleX(1.0f);
                    this.y0.setScaleY(1.0f);
                } else {
                    this.y0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.y0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.y0.setVisibility(z10 ? 0 : 8);
            }
            sx sxVar = this.T;
            if (sxVar != null) {
                sxVar.setTranslationY(W3() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
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
        int i11 = this.x;
        if (i11 >= 0 && (mxVar2 = this.y0) != null) {
            mxVar2.setPosition(mxVar2.L(i11));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (mxVar = this.y0) != null) {
            mxVar.setPosition((mxVar.m0 ? 1 : 0) + 5);
            c5(true);
        }
        F3();
        U4();
    }

    public final void P3(long j10, boolean z10) {
        if (this.a0 == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            cy[] cyVarArr = this.a0;
            if (i9 >= cyVarArr.length) {
                return;
            }
            int childCount = cyVarArr[i9].a.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.a0[i9].a.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                        if (r2Var.getDialogId() == j10) {
                            r2Var.U(z10, true);
                            break;
                        }
                    }
                    i10++;
                }
            }
            i9++;
        }
    }

    public final void P4() {
        int i9;
        int i10;
        if (this.I0 != null || SharedConfig.appLocked || (this.G && !this.A0.g())) {
            return;
        }
        s51[] s51VarArr = new s51[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i9 = 0;
            i10 = 0;
        } else {
            this.z3.f();
            Drawable drawable = this.z3.f[0];
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            i9 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
            org.telegram.ui.Cells.o oVar = this.A3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i10 = dp;
        }
        zw zwVar = new zw(this, this, getParentActivity(), Integer.valueOf(i9), getResourceProvider(), s51VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            zwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l10 = this.x3;
        if (l10 != null) {
            zwVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.z3.f[0];
            zwVar.setSelected(drawable2 instanceof org.telegram.ui.Components.k5 ? Long.valueOf(((org.telegram.ui.Components.k5) drawable2).i()) : null);
        }
        zwVar.setSaveState(1);
        zwVar.y(this.z3, titleTextView);
        ax axVar = new ax(this, zwVar);
        this.I0 = axVar;
        s51VarArr[0] = axVar;
        axVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i10, 48);
        s51VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.C.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.o2, org.telegram.ui.dy] */
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
        int i9 = 2;
        int i10 = 1;
        String formatString2 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = formatString2;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.C.bot_participant;
        ?? r92 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().isInChatCached(chat, user)) {
            charSequence = r92;
        }
        if (this.C.bot_admin_rights == null) {
            formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
        } else {
            int i11 = R.string.AreYouSureSendChatToBotAddRights;
            String firstName = UserObject.getFirstName(user);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.C.bot_admin_rights;
            int i12 = org.telegram.ui.Cells.q6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.j2.u(isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.j2.u(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
            }
            if (arrayList.size() == 1) {
                r92 = ((org.telegram.ui.Cells.r6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r92 = new SpannableStringBuilder();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        r92.append(", ");
                    }
                    r92.append(((org.telegram.ui.Cells.r6) arrayList.get(i13)).b.toString().toLowerCase());
                }
            }
            formatString = LocaleController.formatString(i11, new Object[]{firstName, str, r92});
        }
        charSequence = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(formatString));
        c2Var.P = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new bf(i10, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new bf(i9, runnable2));
        showDialog(c2Var);
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.mg0
    public final boolean R(MotionEvent motionEvent, boolean z10) {
        yw ywVar;
        fh.l2 l2Var;
        cw cwVar;
        if (!this.l3 && (((ywVar = this.B3) == null || !ywVar.c()) && (((l2Var = this.G0) == null || l2Var.getVisibility() != 0) && ((cwVar = this.v0) == null || !cwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                cw cwVar2 = this.v0;
                boolean z11 = cwVar2 == null || cwVar2.getTabsCount() < 2 || this.v0.getCurrentTabId() == this.v0.getFirstTabId();
                cw cwVar3 = this.v0;
                boolean z12 = cwVar3 == null || cwVar3.getTabsCount() < 2 || this.v0.getCurrentTabId() == this.v0.getLastTabId();
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

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList R3(int i9, int i10, int i11, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.N1) != null) {
            return arrayList;
        }
        MessagesController messagesController = AccountInstance.getInstance(i9).getMessagesController();
        if (i10 == 0) {
            return messagesController.getDialogs(i11);
        }
        if (i10 == 10 || i10 == 13) {
            return messagesController.dialogsServerOnly;
        }
        if (i10 == 2) {
            ArrayList arrayList2 = new ArrayList(messagesController.dialogsMyGroups.size() + messagesController.dialogsMyChannels.size() + messagesController.dialogsCanAddUsers.size() + 2);
            if (messagesController.dialogsMyChannels.size() > 0 && this.u2) {
                arrayList2.add(new xx(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.r2) {
                arrayList2.add(new xx(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i12);
                    if ((this.u2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i9)) || (this.r2 && (ChatObject.isMegagroup(i9, -dialog.id) || !ChatObject.isChannel(-dialog.id, i9)))) {
                        if (r2) {
                            arrayList2.add(new xx(2));
                            r2 = false;
                        }
                        arrayList2.add(dialog);
                    }
                }
            }
            return arrayList2;
        }
        if (i10 == 3) {
            return messagesController.dialogsForward;
        }
        if (i10 == 4 || i10 == 12) {
            return messagesController.dialogsUsersOnly;
        }
        if (i10 == 5) {
            return messagesController.dialogsChannelsOnly;
        }
        if (i10 == 6 || i10 == 11) {
            return messagesController.dialogsGroupsOnly;
        }
        if (i10 == 7 || i10 == 8) {
            MessagesController.DialogFilter dialogFilter = messagesController.selectedDialogFilter[i10 != 7 ? 1 : 0];
            return dialogFilter == null ? messagesController.getDialogs(i11) : this.N0 == 3 ? dialogFilter.dialogsForward : dialogFilter.dialogs;
        }
        if (i10 == 9) {
            return messagesController.dialogsForBlock;
        }
        if (i10 != 1 && i10 != 16 && i10 != 14) {
            if (i10 != 15) {
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
        r2 = i10 == 16;
        if (this.v2 || this.w2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList7 = messagesController.dialogsUsersOnly;
            int size4 = arrayList7.size();
            int i13 = 0;
            while (i13 < size4) {
                TLRPC.Dialog dialog6 = arrayList7.get(i13);
                i13++;
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
            int i14 = 0;
            while (i14 < size5) {
                TLRPC.Dialog dialog8 = arrayList8.get(i14);
                i14++;
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
            int i15 = 0;
            while (i15 < size6) {
                TLRPC.Dialog dialog10 = arrayList9.get(i15);
                i15++;
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
        cy[] cyVarArr;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            cyVarArr = this.a0;
            if (i10 >= cyVarArr.length) {
                break;
            }
            cyVarArr[i10].a.B0();
            i10++;
        }
        char c10 = (!z10 || cyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i11 = cyVarArr[c10].h;
        if (i11 < 0 || i11 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.a0[c10].h);
        if (dialogFilter.isDefault()) {
            cy cyVar = this.a0[c10];
            cyVar.s = this.N0;
            yx yxVar = cyVar.a;
            int i12 = yx.r3;
            yxVar.A1();
        } else {
            cy[] cyVarArr2 = this.a0;
            if (cyVarArr2[c10 ^ 1].s == 7) {
                cyVarArr2[c10].s = 8;
            } else {
                cyVarArr2[c10].s = 7;
            }
            cyVarArr2[c10].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.a0[c10].s == 8 ? 1 : 0);
        }
        cy[] cyVarArr3 = this.a0;
        if (cyVarArr3.length > 1) {
            cyVarArr3[1].A = dialogFilter.locked;
        }
        cy cyVar2 = cyVarArr3[c10];
        lw lwVar = cyVar2.d;
        lwVar.h = cyVar2.s;
        lwVar.l();
        cy cyVar3 = this.a0[c10];
        hw hwVar = cyVar3.c;
        if (cyVar3.s == 0 && Z3() && this.a0[c10].v == 2) {
            i9 = 1;
        }
        hwVar.h1(i9, (int) this.J);
        r3(this.a0[c10]);
    }

    public final float S3(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - V3()) * this.r.e;
    }

    public final void S4() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        o31 o31Var = this.V;
        float measuredHeight = (o31Var == null || o31Var.getVisibility() == 8) ? 0.0f : this.V.getMeasuredHeight();
        float dp = this.G ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.G) {
            float f17 = this.J;
            float f18 = this.t1;
            f10 = (measuredHeight * f18) + e2.c.z(1.0f, f18, dp, f17);
            f11 = this.s3;
        } else {
            f10 = (measuredHeight * this.t1) + this.J;
            f11 = this.s3;
        }
        float f19 = f10 + f11 + this.P;
        sx sxVar = this.T;
        float dp2 = AndroidUtilities.dp(4.0f) * ((sxVar == null || sxVar.getVisibility() != 0) ? 0.0f : this.T.getAlpha());
        cw cwVar = this.v0;
        if (cwVar != null) {
            cwVar.setTranslationY(f19 - dp2);
            f13 = this.v0.getAlpha();
            f14 = AndroidUtilities.dp(43.0f) * f13;
            f12 = f19 + f14;
        } else {
            f12 = f19;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        org.telegram.ui.Components.bs bsVar = this.F1;
        if (bsVar != null) {
            bsVar.setTranslationY(AndroidUtilities.lerp(f12 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.W == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f15 = this.F1.getMetadata().c.a;
            f16 = this.F1.c(0.0f);
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.as asVar = this.G1;
        if (asVar != null) {
            asVar.setTranslationY(f19 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f15, f13));
            org.telegram.ui.Components.as asVar2 = this.G1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f16 + f14) - lerp);
            Matrix matrix = asVar2.b;
            if (asVar2.e != lerp || asVar2.f != min) {
                asVar2.e = lerp;
                asVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = asVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                asVar2.invalidate();
            }
            this.G1.setAlpha(Math.max(f13, f15));
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
        cw cwVar;
        org.telegram.ui.Components.sz d;
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
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i9 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(((Long) arrayList.get(i9)).longValue());
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
                int i16 = i13;
                int i17 = i14;
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
                    i13 = i16 + 1;
                    if (dialog.community_id != 0) {
                        i11++;
                    }
                    if (DialogObject.isUserDialog(j11) || j11 == j10 || j11 == UserObject.VERIFY || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j11)))) {
                        i15++;
                    } else if (org.telegram.messenger.l0.v("dialog_bar_report", j11, notificationsSettings, true)) {
                        this.N2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(getMessagesController(), dialog.id);
                            user = l10 != null ? getMessagesController().getUser(Long.valueOf(l10.user_id)) : new TLRPC.TL_userEmpty();
                        } else {
                            user = (isChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                        }
                        if (user != null && user.bot) {
                            MessagesController.isSupportUser(user);
                        }
                        if (g42) {
                            i14 = i17 + 1;
                        } else {
                            this.J2++;
                            i14 = i17;
                        }
                    } else {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j11));
                        if (getMessagesController().isPromoDialog(dialog.id, true)) {
                            this.M2++;
                            if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                i10++;
                                this.Q2 = true;
                            }
                            i14 = i17;
                        } else {
                            if (g42) {
                                i14 = i17 + 1;
                            } else {
                                this.J2++;
                                i14 = i17;
                            }
                            if (chat == null || !chat.megagroup) {
                                this.M2++;
                            } else if (ChatObject.isPublic(chat)) {
                                this.M2++;
                            }
                            i10++;
                        }
                    }
                    i12++;
                    i10++;
                }
                i13 = i16;
                if (dialog.community_id != 0) {
                }
                if (DialogObject.isUserDialog(j11)) {
                }
                i15++;
                if (DialogObject.isChannel(dialog)) {
                }
                i12++;
                i10++;
            }
            i9++;
            clientUserId = j10;
        }
        int i18 = i13;
        int i19 = i14;
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f1;
        if (w0Var3 != null) {
            if (i10 != size || i11 > 0) {
                w0Var3.setVisibility(8);
            } else {
                w0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = this.n1;
        if (g1Var2 != null) {
            int i20 = this.M2;
            if ((i20 == 0 || i20 == size) && ((i12 == 0 || i12 == size) && i11 <= 0)) {
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
            if (this.O2 != 0 && i11 == 0 && this.T2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.m1.g(string, R.drawable.msg_unarchive, null);
                this.i1.setIcon(R.drawable.msg_unarchive);
                this.i1.setContentDescription(string);
                cw cwVar2 = this.v0;
                if (cwVar2 == null || cwVar2.getVisibility() != 0) {
                    this.m1.setVisibility(0);
                    this.i1.setVisibility(8);
                } else {
                    this.i1.setVisibility(0);
                    this.m1.setVisibility(8);
                }
            } else if (i18 != 0 && i11 == 0 && this.T2 == 0) {
                String string2 = LocaleController.getString(R.string.Archive);
                this.m1.g(string2, R.drawable.msg_archive, null);
                this.i1.setIcon(R.drawable.msg_archive);
                this.i1.setContentDescription(string2);
                cw cwVar3 = this.v0;
                if (cwVar3 == null || cwVar3.getVisibility() != 0) {
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
            if (this.J2 + i19 == size && this.T2 == 0) {
                cw cwVar4 = this.v0;
                if (cwVar4 == null || cwVar4.getVisibility() != 0) {
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
            if (i15 != 0) {
                g1Var4.setVisibility(8);
            } else {
                g1Var4.setVisibility(0);
            }
        }
        if (this.l1 != null) {
            cw cwVar5 = this.v0;
            boolean z13 = cwVar5 == null || cwVar5.getVisibility() != 0 || ((d = (cwVar = this.v0).d()) != null && d.a == cwVar.H);
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
                            cw cwVar6 = this.v0;
                            org.telegram.ui.Components.sz d9 = cwVar6.d();
                            if (d9 != null && d9.a == cwVar6.H) {
                                int i21 = org.telegram.ui.Components.yz.w;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i22 = 0; i22 < size2; i22++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i22);
                                    if (!org.telegram.ui.Components.yz.H(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
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
                    } else if (this.P2 == 0 && i11 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x09b3  */
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
        yw ywVar;
        yw ywVar2;
        boolean z14;
        yw ywVar3;
        if (this.F1 == null || this.I1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.z2 z2Var = this.I1;
        final int i9 = 0;
        if (z2Var != null) {
            try {
                ((org.telegram.ui.Components.mi0) ((org.telegram.ui.Components.z8) z2Var.h.getImageReceiver().getStaticThumb()).B).r0 = null;
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.z2 z2Var2 = this.I1;
            z2Var2.setCompact(false);
            z2Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.o9 o9Var = z2Var2.h;
            o9Var.setVisibility(8);
            o9Var.b();
        }
        long j13 = 0;
        final int i10 = 1;
        if (isInPreviewMode()) {
            str = null;
        } else {
            if (getMessagesController().isFrozen()) {
                this.I1.setOnClickListener(new iv(this, 12));
                this.I1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i11 = 19;
                int i12 = 4;
                if (this.R2 == 0 && this.T2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.I1.setOnClickListener(new iv(this, i11));
                    this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.I1.c, new uv(this, i12)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.I1.setOnCloseListener(new iv(this, 24));
                } else if (this.R2 == 0 && this.T2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.I1.setOnClickListener(new iv(this, 25));
                    this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.I1.c, new uv(this, i12)), LocaleController.getString(R.string.GraceMessage));
                    this.I1.setOnCloseListener(new iv(this, 26));
                } else if (this.R2 == 0 && this.T2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.I1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.I1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.I1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.I1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.I1.d.getPaint().getFontMetricsInt()));
                    this.I1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yv
                        public final /* synthetic */ dy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i9) {
                                case 0:
                                    ve.e.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    dy.T(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.I1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yv
                        public final /* synthetic */ dy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    ve.e.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    dy.T(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.R2 == 0 && this.T2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        gh.v7 y10 = gh.v7.y(this.currentAccount, false);
                        ArrayList arrayList = y10.z;
                        if (!arrayList.isEmpty()) {
                            long j14 = -y10.f.amount;
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
                                gh.v7 y11 = gh.v7.y(this.currentAccount, false);
                                ArrayList arrayList2 = y11.z;
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
                                this.I1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.zv
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        dy dyVar = dy.this;
                                        new gh.ea(dyVar.getParentActivity(), dyVar.getResourceProvider(), j11, 2, sb4, new dv(dyVar, 16), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.z2 z2Var3 = this.I1;
                                long j17 = j11 - y11.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                z2Var3.b(gh.oa.X0(false, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j11, sb4), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.I1.setOnCloseListener(new iv(this, 13));
                                z13 = true;
                                str = null;
                                ywVar = this.B3;
                                td.a aVar = this.b;
                                if ((ywVar != null && ywVar.c()) || aVar.f) {
                                    z13 = false;
                                }
                                this.F1.i(this.I1, z13, true);
                                q3(true);
                                if (this.fragmentView == null && this.F1 != null) {
                                    boolean z15 = !isInPreviewMode() && this.R2 == 0 && this.T2 == 0 && this.N0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((ywVar3 = this.B3) == null || !ywVar3.c()) && !aVar.f;
                                    if (z15) {
                                        if (this.J1 == null) {
                                            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(getParentActivity());
                                            this.J1 = saVar;
                                            this.F1.addView(saVar);
                                        }
                                        org.telegram.ui.Cells.sa saVar2 = this.J1;
                                        int i15 = this.currentAccount;
                                        TextView textView = saVar2.b;
                                        TextView textView2 = saVar2.c;
                                        ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList3 = MessagesController.getInstance(i15).getUnconfirmedAuthController().auths;
                                        org.telegram.ui.Cells.ra raVar = saVar2.d;
                                        raVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                                        raVar.a(false, false);
                                        org.telegram.ui.Cells.ra raVar2 = saVar2.e;
                                        raVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                                        raVar2.a(false, false);
                                        if (arrayList3 == null || arrayList3.size() != 1) {
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
                                            StringBuilder n10 = e2.c.n(str3);
                                            n10.append(unconfirmedAuth.location);
                                            String sb5 = n10.toString();
                                            if (unconfirmedAuth.bot) {
                                                textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingleBot, "@" + DialogObject.getShortName(unconfirmedAuth.bot_id), sb5));
                                                z14 = true;
                                            } else {
                                                textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, sb5));
                                                z14 = false;
                                            }
                                        }
                                        raVar.setOnClickListener(new org.telegram.ui.Cells.qa(this, z14, i15, arrayList3));
                                        raVar2.setOnClickListener(new fh.a3(saVar2, i15, arrayList3, 3));
                                    }
                                    org.telegram.ui.Cells.sa saVar3 = this.J1;
                                    if (saVar3 != null) {
                                        this.F1.i(saVar3, z15, true);
                                    }
                                }
                                if (this.fragmentView == null || this.F1 == null) {
                                    return;
                                }
                                boolean z16 = !isInPreviewMode() && this.R2 == 0 && this.T2 == 0 && this.N0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((ywVar2 = this.B3) == null || !ywVar2.c()) && !aVar.f;
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
                            int i17 = 21;
                            if (this.R2 != 0 && this.T2 == j10 && !getMessagesController().premiumPurchaseBlocked() && BirthdayController.getInstance(this.currentAccount).contains() && !getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                ArrayList<TLRPC.User> arrayList4 = state.today;
                                this.I1.setOnClickListener(new org.telegram.ui.Components.vh0(i17, this, state));
                                this.I1.a(this.currentAccount, arrayList4);
                                this.I1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList4.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList4.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList4.size(), new Object[0]), org.telegram.ui.ActionBar.f6.I6, 2, null), this.I1.c, new uv(this, i12)), LocaleController.formatString(arrayList4.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.I1.setOnCloseListener(new iv(this, 14));
                                gh.v7.y(this.currentAccount, false).V();
                            } else if (this.R2 != 0 && this.T2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                this.I1.setOnClickListener(new iv(this, 15));
                                this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.I1.c, new uv(this, i12)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                this.I1.setOnCloseListener(new iv(this, 16));
                            } else if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.R2 == 0 && this.T2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                                this.I1.setOnClickListener(new fh.n(19));
                                this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.f6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                this.I1.setOnCloseListener(new iv(this, 17));
                            } else if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.R2 == 0 && this.T2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                this.I1.setOnClickListener(new iv(this, 18));
                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.f6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                            } else {
                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.R2 != 0 || this.T2 != j10 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) == null : BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null))) {
                                    z10 = false;
                                } else {
                                    this.w3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                    z10 = true;
                                }
                                if (z10) {
                                    this.I1.setOnClickListener(new iv(this, 20));
                                    this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.w3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.f6.I6, 2, null), LocaleController.getString(this.w3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                } else {
                                    if (this.K1 != null && this.L1 != null) {
                                        if (r0.longValue() / this.L1.longValue() < 0.3f) {
                                            MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                        } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j10)) {
                                            z11 = true;
                                            if (z11) {
                                                int i18 = 22;
                                                if (this.R2 == 0 && this.T2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                    this.I1.setOnClickListener(new iv(this, i18));
                                                    this.I1.h.setVisibility(0);
                                                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                                                    z8Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                    long clientUserId = getUserConfig().getClientUserId();
                                                    z8Var.A = true;
                                                    z8Var.b = true;
                                                    z8Var.c = false;
                                                    int i19 = org.telegram.ui.ActionBar.f6.p8[org.telegram.ui.Components.z8.e(clientUserId)];
                                                    org.telegram.ui.ActionBar.b6 b6Var = z8Var.z;
                                                    z8Var.d = org.telegram.ui.ActionBar.f6.v0(i19, b6Var);
                                                    z8Var.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[org.telegram.ui.Components.z8.e(clientUserId)], b6Var);
                                                    z8Var.n = 0;
                                                    z8Var.m = false;
                                                    org.telegram.ui.Components.z8.a("", "", "", z8Var.q);
                                                    z8Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.I1.h.setImageDrawable(z8Var);
                                                    this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.I1.c, new uv(this, i12)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                    this.I1.setOnCloseListener(new iv(this, 23));
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
                                                            this.I1.setOnClickListener(new a(next, i17));
                                                            org.telegram.ui.Cells.z2 z2Var4 = this.I1;
                                                            CharSequence charSequence = charSequenceArr[0];
                                                            if (charSequence instanceof String) {
                                                                str = null;
                                                                charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.f6.I6, 2, null);
                                                            } else {
                                                                str = null;
                                                            }
                                                            CharSequence charSequence2 = charSequenceArr[1];
                                                            if (charSequence2 instanceof String) {
                                                                charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                            }
                                                            z2Var4.b(charSequence, charSequence2);
                                                            boolean z17 = false;
                                                            if (zArr[0] && next != null) {
                                                                this.I1.setOnCloseListener(new org.telegram.ui.Components.vh0(this, next, z17, i18));
                                                            }
                                                            z13 = true;
                                                            ywVar = this.B3;
                                                            td.a aVar2 = this.b;
                                                            if (ywVar != null) {
                                                                z13 = false;
                                                                this.F1.i(this.I1, z13, true);
                                                                q3(true);
                                                                if (this.fragmentView == null) {
                                                                }
                                                                if (this.fragmentView == null) {
                                                                    return;
                                                                } else {
                                                                    return;
                                                                }
                                                            }
                                                            z13 = false;
                                                            this.F1.i(this.I1, z13, true);
                                                            q3(true);
                                                            if (this.fragmentView == null) {
                                                            }
                                                            if (this.fragmentView == null) {
                                                            }
                                                        }
                                                    }
                                                    str = null;
                                                }
                                            } else {
                                                this.I1.setOnClickListener(new iv(this, i17));
                                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.f6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                            }
                                        }
                                    }
                                    z11 = false;
                                    if (z11) {
                                    }
                                }
                            }
                            z13 = true;
                            str = null;
                            ywVar = this.B3;
                            td.a aVar22 = this.b;
                            if (ywVar != null) {
                            }
                            z13 = false;
                            this.F1.i(this.I1, z13, true);
                            q3(true);
                            if (this.fragmentView == null) {
                            }
                            if (this.fragmentView == null) {
                            }
                        } else if (!y10.A) {
                            y10.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y10.a).sendRequest(tL_getStarsSubscriptions, new gh.m6(y10, i9));
                        }
                    }
                    j10 = 0;
                    int i172 = 21;
                    if (this.R2 != 0) {
                    }
                    if (this.R2 != 0) {
                    }
                    if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.R2 == 0 && this.T2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                    z13 = true;
                    str = null;
                    ywVar = this.B3;
                    td.a aVar222 = this.b;
                    if (ywVar != null) {
                    }
                    z13 = false;
                    this.F1.i(this.I1, z13, true);
                    q3(true);
                    if (this.fragmentView == null) {
                    }
                    if (this.fragmentView == null) {
                    }
                }
            }
            str = null;
            z13 = true;
            ywVar = this.B3;
            td.a aVar2222 = this.b;
            if (ywVar != null) {
            }
            z13 = false;
            this.F1.i(this.I1, z13, true);
            q3(true);
            if (this.fragmentView == null) {
            }
            if (this.fragmentView == null) {
            }
        }
        z13 = false;
        ywVar = this.B3;
        td.a aVar22222 = this.b;
        if (ywVar != null) {
        }
        z13 = false;
        this.F1.i(this.I1, z13, true);
        q3(true);
        if (this.fragmentView == null) {
        }
        if (this.fragmentView == null) {
        }
    }

    public final float V3() {
        yw ywVar = this.B3;
        if (ywVar == null || !ywVar.c()) {
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
        int i9;
        MessagesController.DialogFilter dialogFilter;
        int i10;
        boolean z12;
        boolean z13;
        if (this.v0 == null || this.inPreviewMode || this.l3) {
            return;
        }
        yw ywVar = this.B3;
        if (ywVar != null && ywVar.c()) {
            return;
        }
        org.telegram.ui.Components.x60 x60Var = this.H0;
        if (x60Var != null) {
            x60Var.u();
            this.H0 = null;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int size = dialogFilters.size();
        td.a aVar = this.r;
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
                cw cwVar = this.v0;
                cwVar.h.clear();
                cwVar.f0.clear();
                cwVar.h0.clear();
                cwVar.i0.clear();
                cwVar.j0.clear();
                cwVar.k0.clear();
                cwVar.I = 0;
                int size2 = dialogFilters.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (dialogFilters.get(i11).isDefault()) {
                        this.v0.a(i11, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i11).locked);
                    } else {
                        MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i11);
                        this.v0.a(i11, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i11).locked);
                    }
                }
                if (currentTabStableId >= 0) {
                    if (z12 && !this.v0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            cw cwVar2 = this.v0;
                            if (cwVar2.h(cwVar2.g0.get(currentTabId, -1))) {
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
                int i12 = 0;
                while (true) {
                    cy[] cyVarArr = this.a0;
                    if (i12 >= cyVarArr.length) {
                        break;
                    }
                    if (cyVarArr[i12].h >= dialogFilters.size()) {
                        this.a0[i12].h = dialogFilters.size() - 1;
                    }
                    this.a0[i12].a.setScrollingTouchSlop(1);
                    i12++;
                }
                cw cwVar3 = this.v0;
                cwVar3.B.setItemAnimator(z15 ? cwVar3.o0 : null);
                cwVar3.E.l();
                if (isEmpty) {
                    R4(false);
                }
                cw cwVar4 = this.v0;
                int currentTabId2 = cwVar4.getCurrentTabId();
                ArrayList arrayList = cwVar4.h;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z13 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.sz) arrayList.get(i13)).a == currentTabId2) {
                            z13 = ((org.telegram.ui.Components.sz) arrayList.get(i13)).f;
                            break;
                        }
                        i13++;
                    }
                }
                if (z13) {
                    cw cwVar5 = this.v0;
                    ArrayList arrayList2 = cwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        cwVar5.f((org.telegram.ui.Components.sz) arrayList2.get(0), 0);
                        T4(r52);
                        i9 = this.a0[r52].s;
                        if ((i9 != 7 || i9 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i9 - 7]) != null) {
                            i10 = 0;
                            while (true) {
                                if (i10 >= dialogFilters.size()) {
                                    z14 = false;
                                    break;
                                }
                                MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i10);
                                if (dialogFilter3 != null && dialogFilter3.id == dialogFilter.id) {
                                    break;
                                } else {
                                    i10++;
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
            i9 = this.a0[r52].s;
            if (i9 != 7) {
            }
            i10 = 0;
            while (true) {
                if (i10 >= dialogFilters.size()) {
                }
                i10++;
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
                    lw lwVar = this.a0[0].d;
                    lwVar.h = 0;
                    lwVar.l();
                    cy cyVar = this.a0[0];
                    cyVar.s = this.N0;
                    cyVar.d.l();
                }
                this.a0[1].setVisibility(8);
                cy cyVar2 = this.a0[1];
                cyVar2.h = 0;
                lw lwVar2 = cyVar2.d;
                lwVar2.h = 0;
                lwVar2.l();
                cy cyVar3 = this.a0[1];
                cyVar3.s = this.N0;
                cyVar3.d.l();
                this.w = false;
                if (this.fragmentView != null) {
                    boolean z17 = (this.isPaused || this.N3 != null) ? false : z11;
                    if (!this.l3) {
                        aVar.a(false, z17);
                    }
                }
                int i14 = 0;
                while (true) {
                    cy[] cyVarArr2 = this.a0;
                    if (i14 >= cyVarArr2.length) {
                        break;
                    }
                    cy cyVar4 = cyVarArr2[i14];
                    if (cyVar4.s == 0 && cyVar4.v == 2 && Z3() && ((L0 = this.a0[i14].c.L0()) == 0 || L0 == 1)) {
                        this.a0[i14].c.h1(1, (int) this.J);
                    }
                    this.a0[i14].a.setScrollingTouchSlop(0);
                    this.a0[i14].a.requestLayout();
                    this.a0[i14].requestLayout();
                    i14++;
                }
                this.v0.H = -1;
                r52 = 0;
            }
            T4(r52);
            i9 = this.a0[r52].s;
            if (i9 != 7) {
            }
            i10 = 0;
            while (true) {
                if (i10 >= dialogFilters.size()) {
                }
                i10++;
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
        mx mxVar;
        boolean z13;
        org.telegram.ui.Components.m71 m71Var;
        if (!this.l3 || this.h2 || (mxVar = this.y0) == null) {
            return;
        }
        ArrayList<of.m0> currentSearchFilters = mxVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i9 = 0; i9 < currentSearchFilters.size(); i9++) {
            if (currentSearchFilters.get(i9).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i9).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i9).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i9).d == 7) {
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
                m71Var = this.W;
                if (m71Var != null) {
                    m71Var.b(z13, true);
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
        m71Var = this.W;
        if (m71Var != null) {
        }
        this.X.setEnabled(z13);
        this.s.a(z13, true);
    }

    public final ih.v6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f10 = (((-this.c4) - this.f4) - this.q1) - this.r1;
        org.telegram.ui.Components.j10 j10Var = this.p0;
        if (j10Var != null) {
            j10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.j10 j10Var2 = this.q0;
        if (j10Var2 != null) {
            j10Var2.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            kh.x3 x3Var = this.l0;
            if (x3Var != null) {
                x3Var.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
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
            vx vxVar = (vx) this.fragmentView;
            vxVar.removeView(undoViewArr[0]);
            vxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11 = this.h2;
        boolean z12 = (!z11 || this.N0 == 10) && this.R2 == 0 && this.T2 == 0 && !this.inPreviewMode && (!this.f2 || z11) && !this.Q3;
        org.telegram.ui.Components.j10 j10Var = this.p0;
        if (j10Var != null) {
            j10Var.e(z12, z10);
        }
        org.telegram.ui.Components.j10 j10Var2 = this.q0;
        if (j10Var2 != null) {
            j10Var2.e(z12, z10);
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
                int i9 = 0;
                while (true) {
                    if (i9 >= getDownloadController().downloadingFiles.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i9).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i9++;
                    }
                }
                if (getDownloadController().hasUnviewedDownloads() || z12 || (this.c0.getVisibility() == 0 && this.c0.getAlpha() == 1.0f && !z11)) {
                    this.e0 = true;
                } else {
                    this.e0 = false;
                }
                x3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i10 = this.Z1;
                boolean z14 = i10 == 3 || i10 == 5;
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
        org.telegram.ui.Components.wp0 wp0Var;
        ow owVar = this.x1;
        ArrayList arrayList = this.E2;
        if (owVar == null) {
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
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.gr.h);
            }
            if (this.x1.getTag() != null) {
                this.x1.m0(false, false, false);
                this.x1.O();
                this.x1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.x1.getTag() == null) {
                if (!a4() && this.A2 == null) {
                    this.x1.setFieldText("");
                }
                this.x1.setTag(1);
                if (!this.S3 && (wp0Var = this.C2) != null) {
                    this.S3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    wp0Var.j();
                    wp0Var.B = string2;
                    org.telegram.ui.Components.up0 up0Var = wp0Var.a[0];
                    if (string2 != null) {
                        up0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(wp0Var, 29);
                    wp0Var.C = ib0Var;
                    AndroidUtilities.runOnUIThread(ib0Var, 1000L);
                }
            }
            this.y1.g(Math.max(1, arrayList.size()), true);
            int i9 = this.O0 + (!TextUtils.isEmpty(this.x1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                if (sendPaidMessagesStars <= 0 && longValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                }
                j10 += sendPaidMessagesStars;
            }
            this.y1.i(i9, j10, true);
            this.x1.R1();
            if (this.M3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.gr.h);
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
        int i9 = 1;
        if (h2Var != null) {
            h2Var.c(0.0f, true);
        }
        cw cwVar = this.v0;
        if (cwVar != null) {
            cwVar.b(org.telegram.ui.ActionBar.f6.K8, org.telegram.ui.ActionBar.f6.I8, org.telegram.ui.ActionBar.f6.J8, org.telegram.ui.ActionBar.f6.L8, org.telegram.ui.ActionBar.f6.d6);
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
        int i10 = 0;
        int i11 = 0;
        while (true) {
            cy[] cyVarArr = this.a0;
            if (i11 >= cyVarArr.length) {
                break;
            }
            cy cyVar = cyVarArr[i11];
            if (cyVar != null) {
                cyVar.a.I0(true);
            }
            i11++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.G ? 81 : 0) + 48) + this.J);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p3, 0.0f);
        this.q3 = ofFloat;
        ofFloat.addUpdateListener(new kv(this, max, i9));
        this.q3.addListener(new gx(this, max, i10));
        this.q3.setInterpolator(org.telegram.ui.Components.gr.f);
        this.q3.setDuration(200L);
        this.q3.start();
        this.U0 = false;
        ArrayList arrayList = this.W0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                n00.s0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i12++;
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
            int i13 = 0;
            while (true) {
                cy[] cyVarArr2 = this.a0;
                if (i13 >= cyVarArr2.length) {
                    break;
                }
                cyVarArr2[i13].d.D = z11;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z11;
        if (z10) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i15 | i14, true);
    }

    public final void b5() {
        org.telegram.ui.Components.wp0 wp0Var = this.C2;
        if (wp0Var == null) {
            return;
        }
        int i9 = this.currentAccount;
        wp0Var.h(i9);
        wp0Var.d = AccountInstance.getInstance(i9).getUserConfig().getClientUserId();
        ArrayList arrayList = wp0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.E2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.up0 up0Var = wp0Var.a[0];
        if (wp0Var.b == 1) {
            up0Var.d.l(wp0Var.c(up0Var), false);
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
            kh.x3 x3Var = this.l0;
            if (x3Var != null) {
                x3Var.e(true);
            }
            kh.x3 x3Var2 = this.m0;
            if (x3Var2 != null) {
                x3Var2.e(true);
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
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                z11 = false;
                break;
            }
            MessageObject messageObject = arrayList.get(i9);
            i9++;
            MessageObject messageObject2 = messageObject;
            if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i10);
            i10++;
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
        cw cwVar;
        if (this.B3.c()) {
            return false;
        }
        return this.N0 != 3 || (cwVar = this.v0) == null || cwVar.getVisibility() != 0 || this.v0.G <= 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean closeLastFragment() {
        if (!this.B3.c()) {
            return super.closeLastFragment();
        }
        this.B3.a();
        mx mxVar = this.y0;
        if (mxVar == null) {
            return true;
        }
        mxVar.R();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, context, this.resourceProvider, 3);
        r7Var.setAllowOverlayTitle(true);
        r7Var.K();
        r7Var.A(getThemedColor(org.telegram.ui.ActionBar.f6.t8), false);
        r7Var.A(getThemedColor(org.telegram.ui.ActionBar.f6.z8), true);
        r7Var.C(getThemedColor(org.telegram.ui.ActionBar.f6.v8), false);
        r7Var.C(getThemedColor(org.telegram.ui.ActionBar.f6.y8), true);
        r7Var.k();
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.R2 == 0 || e4())) {
            return r7Var;
        }
        r7Var.setOccupyStatusBar(false);
        return r7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e09  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e63  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0e9b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e23  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0cd3  */
    /* JADX WARN: Type inference failed for: r0v101, types: [org.telegram.ui.ActionBar.k] */
    /* JADX WARN: Type inference failed for: r0v181, types: [org.telegram.ui.Components.wk0, org.telegram.ui.yx] */
    /* JADX WARN: Type inference failed for: r0v28, types: [pg.f] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v19, types: [fg.g, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v205, types: [org.telegram.ui.Components.wk0, org.telegram.ui.yx] */
    /* JADX WARN: Type inference failed for: r3v206, types: [org.telegram.ui.Components.wk0, org.telegram.ui.yx] */
    /* JADX WARN: Type inference failed for: r3v207, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.yx] */
    /* JADX WARN: Type inference failed for: r3v211, types: [org.telegram.ui.Components.wk0, org.telegram.ui.yx] */
    /* JADX WARN: Type inference failed for: r3v212, types: [org.telegram.ui.Components.wk0, org.telegram.ui.yx] */
    /* JADX WARN: Type inference failed for: r3v214, types: [f2.m0, org.telegram.ui.hw] */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.telegram.ui.ActionBar.k] */
    /* JADX WARN: Type inference failed for: r3v321, types: [android.view.ViewGroup, org.telegram.ui.ActionBar.w0] */
    /* JADX WARN: Type inference failed for: r3v60, types: [ig.a] */
    /* JADX WARN: Type inference failed for: r4v69, types: [org.telegram.ui.Components.wk0, org.telegram.ui.yx] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.ui.vv] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v23, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f10;
        int i9;
        qn qnVar;
        cw cwVar;
        sx sxVar;
        sx sxVar2;
        org.telegram.ui.Components.bs bsVar;
        ay ayVar;
        f2.h0 h0Var;
        of.m mVar;
        of.m mVar2;
        long j10;
        of.m mVar3;
        of.m mVar4;
        of.m mVar5;
        of.m mVar6;
        wx wxVar;
        int i10;
        int i11;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
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
        AndroidUtilities.runOnUIThread(new cv(context2, 0));
        this.J1 = null;
        this.H1 = null;
        this.I1 = null;
        this.M1 = null;
        this.F1 = null;
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        this.f0 = a2;
        a2.setOnClickListener(new iv(this, 1));
        int i12 = 8;
        if (this.N0 == 2 || (e4() && R3(this.currentAccount, this.N0, this.R2, false).isEmpty())) {
            this.f0.setVisibility(8);
        }
        this.f0.setVisibility(8);
        ?? r82 = 1;
        if (!this.h2 && this.j2 == null && this.R2 == 0 && this.T2 == 0) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context2, getThemedColor(org.telegram.ui.ActionBar.f6.t8), getThemedColor(org.telegram.ui.ActionBar.f6.v8), true);
            this.i0 = w0Var;
            w0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.i0, g7.e6.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.i0.setOnClickListener(new iv(this, 8));
            this.i0.setAlpha(0.0f);
            this.i0.setVisibility(8);
            this.j0 = new org.telegram.ui.Components.rh0(context2);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(context2, this.resourceProvider, false, true);
            this.k0 = g1Var;
            g1Var.setItemHeight(56);
            this.k0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.j0);
            this.k0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.w0 a3 = n10.a(1, R.drawable.outline_header_lock_24);
            this.b0 = a3;
            a3.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            ?? d = n10.d(3, new ColorDrawable(0));
            this.c0 = d;
            fy fyVar = new fy(context2, this.currentAccount);
            this.d0 = fyVar;
            d.addView(fyVar);
            this.c0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.c0.setVisibility(8);
            Z4(false, false);
        }
        sx sxVar3 = new sx(context2, this.resourceProvider);
        this.T = sxVar3;
        long j11 = 0;
        sxVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.T.setPivotX(0.0f);
        this.T.setPivotY(0.0f);
        if (this.N0 == 0) {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(-47, R.drawable.avd_speed);
            this.h0 = a10;
            AndroidUtilities.removeFromParent(a10);
            this.h0.setOnClickListener(new iv(this, 9));
            this.T.a(this.h0);
            this.T.d();
        }
        this.T.setCloseButtonOnClickListener(new dv(this, 29));
        this.T.r.setOnFocusChangeListener(new ld(this, 1));
        ?? r32 = this.T.r;
        ff.o0 o0Var = new ff.o0(r32, new tx(this));
        this.U = o0Var;
        r32.addTextChangedListener(o0Var);
        this.T.setSearchFiltersListener(new ix(this, 5));
        this.U.a();
        if (this.N0 == 0) {
            org.telegram.ui.ActionBar.w0 a11 = n10.a(4, R.drawable.ic_ab_other);
            this.g0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.g0.setOnClickListener(new iv(this, 10));
            this.g0.setOnLongClickListener(new qv(this, 3));
        }
        this.f0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.h2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i13 = this.N0;
            if (i13 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.J0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.K0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i13 == 3 && this.b2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i13 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i13 == 14) {
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
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
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
                this.X2 = new org.telegram.ui.Components.z8(this.U2);
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getContext());
                this.W2 = o9Var;
                o9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.W2.e(this.U2, this.X2);
                this.actionBar.addView(this.W2, g7.e6.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(26.0f), null);
                this.z3 = i5Var;
                i5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.y3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.y3.getIntrinsicWidth(), this.y3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.y3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.gl), PorterDuff.Mode.MULTIPLY);
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
        this.actionBar.setTitleActionRunnable(new uv(this, 0));
        int i14 = this.N0;
        if (((i14 == 0 && !this.h2) || i14 == 3) && this.R2 == 0 && this.T2 == 0 && TextUtils.isEmpty(this.j2)) {
            cw cwVar2 = new cw(this, context2, this.resourceProvider);
            this.v0 = cwVar2;
            cwVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.v0.setDelegate(new dw(context2, this));
        }
        int i15 = 17;
        if (this.n2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.z1 = n10.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8();
            z8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context2);
            o9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.z1.addView(o9Var2, g7.e6.e(36, 36, 17));
            this.z1.setOnClickListener(new iv(this, 11));
            this.z1.setOnLongClickListener(new qv(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            z8Var.m(this.currentAccount, currentUser);
            o9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            o9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? z8Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ew(this));
        final vx vxVar = new vx(context2, this);
        this.fragmentView = vxVar;
        pg.i iVar = new pg.i(vxVar);
        this.g4 = iVar;
        ig.a aVar = this.l4;
        aVar.f(iVar, vxVar);
        pg.i iVar2 = this.g4;
        ig.a aVar2 = this.n4;
        aVar2.f(iVar2, vxVar);
        pg.i iVar3 = this.g4;
        ig.a aVar3 = this.o4;
        aVar3.f(iVar3, vxVar);
        this.m4.f(this.g4, vxVar);
        final PointF pointF = new PointF();
        this.p4 = new jg.a() { // from class: org.telegram.ui.vv
            @Override // jg.a
            public final void e(Canvas canvas, RectF rectF) {
                dy dyVar = dy.this;
                mx mxVar = dyVar.y0;
                int alpha = mxVar != null ? (int) (mxVar.getAlpha() * 255.0f) : 0;
                cy[] cyVarArr = dyVar.a0;
                int length = cyVarArr.length;
                int i16 = 0;
                while (true) {
                    vx vxVar2 = vxVar;
                    if (i16 >= length) {
                        mx mxVar2 = dyVar.y0;
                        if (mxVar2 == null || mxVar2.getVisibility() != 0 || dyVar.y0.getAlpha() <= 0.0f) {
                            return;
                        }
                        mx mxVar3 = dyVar.y0;
                        og.d.a(mxVar3, canvas, rectF, mxVar3, vxVar2, alpha);
                        return;
                    }
                    cy cyVar = cyVarArr[i16];
                    if (cyVar != null && cyVar.getVisibility() == 0 && cyVar.getAlpha() > 0.0f) {
                        float V3 = dyVar.V3();
                        if (cyVar.B == null || V3 <= 0.0f) {
                            yx yxVar = cyVar.a;
                            og.d.a(yxVar, canvas, rectF, yxVar, vxVar2, 255 - alpha);
                        } else {
                            yx yxVar2 = cyVar.a;
                            PointF pointF2 = pointF;
                            if (!pg.i.b(yxVar2, vxVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            cyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i16++;
                }
            }

            @Override // jg.a
            public final void g(g.x xVar, RectF rectF) {
                xVar.b = true;
            }
        };
        int i16 = (this.R2 == 0 && this.T2 == 0 && (((i11 = this.N0) == 0 && !this.h2) || i11 == 3)) ? 2 : 1;
        this.a0 = new cy[i16];
        int i17 = 0;
        while (i17 < i16) {
            ig.a aVar4 = aVar3;
            cy cyVar = new cy(context2, this);
            vxVar.addView(cyVar, g7.e6.c(-1.0f, -1));
            cyVar.s = this.N0;
            this.a0[i17] = cyVar;
            cyVar.w = new org.telegram.ui.Components.e00(context2);
            cyVar.w.setViewType(7);
            cyVar.w.setVisibility(i12);
            cyVar.addView(cyVar.w, g7.e6.e(-2, -2, i15));
            yx yxVar = new yx(this, context2, cyVar);
            cyVar.a = yxVar;
            yxVar.C0(new org.telegram.ui.Components.p61(12, this, cyVar));
            ?? r42 = cyVar.a;
            cyVar.b = new a6.a((org.telegram.ui.Components.wk0) r42);
            r42.setAllowStopHeaveOperations(r82);
            cyVar.a.setAccessibilityEnabled(r11);
            cyVar.a.m1(r11, r82);
            cyVar.a.setClipToPadding(r11);
            cyVar.a.setPivotY(0.0f);
            if (this.N0 == 15) {
                cyVar.a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
            }
            cyVar.x = new fw(cyVar.a, cyVar);
            cyVar.a.setVerticalScrollBarEnabled(r82);
            cyVar.a.setInstantClick(r82);
            cyVar.c = new hw(this, cyVar);
            cyVar.c.j1(r82);
            cyVar.a.setLayoutManager(cyVar.c);
            cyVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            cyVar.addView(cyVar.a, g7.e6.c(-1.0f, -1));
            int i18 = 6;
            cyVar.a.setOnItemClickListener(new yr(i18, this, cyVar));
            cyVar.a.setOnItemLongClickListener(new org.telegram.ui.Cells.e3(i18, this, cyVar));
            cyVar.f = new ay(this, cyVar);
            cyVar.y = new org.telegram.ui.Components.dk0(cyVar.a, r11);
            ayVar = cyVar.f;
            cyVar.e = new f2.h0(ayVar);
            h0Var = cyVar.e;
            h0Var.d(cyVar.a);
            cyVar.a.setOnScrollListener(new jw(this, cyVar, vxVar));
            cyVar.v = SharedConfig.archiveHidden ? 2 : 0;
            if (cyVar.n == null && this.R2 == 0 && this.T2 == j11) {
                cyVar.n = new kw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), cyVar);
                if (Z3()) {
                    cyVar.n.h();
                } else {
                    cyVar.n.b();
                }
                kw kwVar = cyVar.n;
                i10 = cyVar.v;
                kwVar.g(i10 != 0);
            }
            vx vxVar2 = vxVar;
            ig.a aVar5 = aVar;
            ig.a aVar6 = aVar2;
            context2 = context;
            cyVar.d = new lw(this, this, context, cyVar.s, this.R2, this.h2, arrayList, this.currentAccount, this.C, cyVar);
            mVar = cyVar.d;
            mVar.R(cyVar.a);
            mVar2 = cyVar.d;
            mVar2.P(this.p2);
            if (cyVar.s == 3) {
                mVar6 = cyVar.d;
                mVar6.M(getMessagesController().storiesEnabled() && (wxVar = this.y2) != null && wxVar.C());
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.l2;
                j10 = 0;
                if (topicKey.dialogId != 0) {
                    mVar5 = cyVar.d;
                    mVar5.Q(topicKey.dialogId);
                }
            } else {
                j10 = 0;
            }
            mVar3 = cyVar.d;
            mVar3.N(cyVar.n);
            yx yxVar2 = cyVar.a;
            mVar4 = cyVar.d;
            yxVar2.setAdapter(mVar4);
            cyVar.a.setEmptyView((this.R2 == 0 && this.T2 == j10) ? cyVar.w : null);
            cyVar.r = new c2.y(cyVar.a, cyVar.c);
            c2.y yVar = cyVar.r;
            yVar.c = true;
            yVar.d = true;
            yVar.h = new jv(this, 10);
            if (i17 != 0) {
                this.a0[i17].setVisibility(8);
            }
            i17++;
            j11 = j10;
            vxVar = vxVar2;
            aVar3 = aVar4;
            aVar = aVar5;
            aVar2 = aVar6;
            r82 = 1;
            r11 = 0;
            i15 = 17;
            i12 = 8;
        }
        vx vxVar3 = vxVar;
        ig.a aVar7 = aVar;
        ig.a aVar8 = aVar2;
        ig.a aVar9 = aVar3;
        long j12 = j11;
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(context2);
        this.G1 = asVar;
        int i19 = org.telegram.ui.ActionBar.f6.d6;
        asVar.setColor(org.telegram.ui.ActionBar.f6.u0(i19));
        vxVar3.addView(this.G1, g7.e6.e(-1, 100, 48));
        this.x0 = vxVar3.getChildCount();
        o31 o31Var = new o31((Activity) getContext());
        this.V = o31Var;
        o31Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        vxVar3.addView(this.V, g7.e6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        kg.d b10 = aVar8.b(this.V, mg.c.m(this.resourceProvider));
        b10.p(AndroidUtilities.dp(18.0f));
        b10.o(AndroidUtilities.dp(6.666f));
        this.V.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.V.setBlurredBackground(b10);
        of.o0 o0Var2 = new of.o0(getParentActivity(), null);
        this.X = o0Var2;
        o0Var2.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        of.o0 o0Var3 = this.X;
        o0Var3.W2 = false;
        o0Var3.setOnItemClickListener(new nv(this, 1));
        this.V.addView(this.X, g7.e6.e(-1, -1, 48));
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context2, this.resourceProvider, true);
        this.q0 = j10Var;
        j10Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.q0.setImageResource(R.drawable.outline_fab_story_24);
        this.q0.setOnClickListener(new iv(this, 27));
        vxVar3.addView(this.q0, org.telegram.ui.Components.j10.c());
        org.telegram.ui.Components.j10 j10Var2 = new org.telegram.ui.Components.j10(context2, this.resourceProvider);
        this.p0 = j10Var2;
        vxVar3.addView(j10Var2, org.telegram.ui.Components.j10.b());
        this.p0.setOnClickListener(new iv(this, 28));
        if (!e4() && this.N0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", true)) {
            kh.x3 x3Var = new kh.x3(context2, 2);
            x3Var.r(8.0f);
            x3Var.d = 8000L;
            x3Var.i();
            x3Var.o();
            x3Var.q(true);
            x3Var.t(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), kh.wb.n(context2)));
            x3Var.m(1.0f, -40.0f);
            x3Var.h(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
            x3Var.h0 = new uv(this, 11);
            this.l0 = x3Var;
            vxVar3.addView(x3Var, g7.e6.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        e5();
        this.W = null;
        if (this.h2 || this.N0 != 0) {
            f10 = 72.0f;
            if (this.N0 == 3 || I3()) {
                pg.f fVar = new pg.f(context2);
                this.u1 = fVar;
                fVar.setClipChildren(false);
                ?? r02 = this.u1;
                xg.i iVar4 = this.v;
                r02.setWindowInsetsProvider(iVar4);
                pg.f fVar2 = this.u1;
                fVar2.setInputIslandBubbleDrawable(aVar8.b(fVar2, mg.c.m(this.resourceProvider)));
                pg.f fVar3 = this.u1;
                fVar3.setUnderKeyboardBackgroundDrawable(aVar7.b(fVar3, mg.c.m(this.resourceProvider)));
                ig.b bVar = new ig.b(aVar9.b(this.u1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    bVar.b(AndroidUtilities.dp(72.0f), true);
                }
                this.u1.setBackgroundWithFadeDrawable(bVar);
                FrameLayout inputIslandBubbleContainer = this.u1.getInputIslandBubbleContainer();
                this.v1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.w1 = this.u1.getInAppKeyboardBubbleContainer();
                ow owVar = this.x1;
                if (owVar != null) {
                    owVar.A0();
                }
                ow owVar2 = new ow(this, getParentActivity(), vxVar3);
                this.x1 = owVar2;
                owVar2.setInAppInsetsController(iVar4);
                this.x1.t4 = false;
                vxVar3.setClipChildren(false);
                vxVar3.setClipToPadding(false);
                ow owVar3 = this.x1;
                owVar3.s4 = false;
                owVar3.d2 = !AndroidUtilities.isInMultiwindow && ((qnVar = owVar3.K2) == null || !qnVar.isInBubbleMode());
                this.x1.U0(false, false);
                this.x1.g1(true, false);
                this.x1.u1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.x1.getSendButton().setAlpha(0.0f);
                this.x1.setViewParentForEmoji(this.w1);
                this.v1.addView(this.x1, g7.e6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                vxVar3.addView(this.u1.getFadeView(), g7.e6.c(-1.0f, -1));
                vxVar3.addView(this.u1, g7.e6.c(-1.0f, -1));
                if (a4() || this.A2 != null || this.B2 != null) {
                    l3(this.R3);
                    this.R3 = null;
                }
                this.x1.setDelegate(new pw(this));
                i9 = -1;
                org.telegram.ui.Components.wo0 wo0Var = new org.telegram.ui.Components.wo0((NotificationCenter.NotificationCenterDelegate) this, context2, R.drawable.send_plane_24, this.resourceProvider, 1);
                this.y1 = wo0Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                wo0Var.E = dp;
                wo0Var.F = dp2;
                org.telegram.ui.Components.wo0 wo0Var2 = this.y1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                wo0Var2.I = dp3;
                wo0Var2.J = dp4;
                org.telegram.ui.Components.wo0 wo0Var3 = this.y1;
                wo0Var3.d0 = true;
                vxVar3.addView(wo0Var3, g7.e6.e(110, 50, 85));
                this.y1.setScrimViewBackgroundColor(getThemedColor(i19));
                this.y1.setOnClickListener(new iv(this, 5));
                this.y1.setOnLongClickListener(new qv(this, 1));
                this.y1.setVisibility(8);
                this.y1.setScaleX(0.2f);
                this.y1.setScaleY(0.2f);
                this.y1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.A1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                cwVar = this.v0;
                if (cwVar != null) {
                    kg.d b11 = aVar8.b(cwVar, mg.c.m(this.resourceProvider));
                    b11.p(AndroidUtilities.dp(18.0f));
                    b11.o(AndroidUtilities.dp(6.666f));
                    this.v0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.v0.setBlurredBackground(b11);
                    vxVar3.addView(this.v0, g7.e6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                sxVar = this.T;
                if (sxVar != null) {
                    sxVar.setupBlurredBackground(aVar8.b(sxVar, mg.c.m(this.resourceProvider)));
                }
                vw vwVar = new vw(this, context, this, this.currentAccount, e4() ? 1 : 0);
                this.A0 = vwVar;
                vwVar.setActionBar(this.actionBar);
                this.A0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                vw vwVar2 = this.A0;
                vwVar2.h0 = false;
                vwVar2.setVisibility(8);
                this.I = false;
                this.H = false;
                this.G = false;
                if (this.h2 && this.N0 == 3) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
                }
                vxVar3.addView(this.actionBar, g7.e6.c(-2.0f, i9));
                if (!this.h2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.A3 = oVar;
                    vxVar3.addView(oVar, g7.e6.e(20, 20, 51));
                }
                sxVar2 = this.T;
                if (sxVar2 != null) {
                    vxVar3.addView(sxVar2, g7.e6.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.t0 = vxVar3.getChildCount();
                UndoView[] undoViewArr = this.u0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.S) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.f6.gl));
                }
                if (this.R2 == 0 || this.T2 != j12) {
                    this.a0[0].a.setGlowColor(getThemedColor(i19));
                    this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.f6.O8), false);
                    this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.N8), false);
                    this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.f6.Q8), false);
                    this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.f6.R8), true);
                }
                if (!this.h2 && this.N0 == 0) {
                    fh.l2 l2Var = new fh.l2(this, context, 27);
                    this.G0 = l2Var;
                    if (Build.VERSION.SDK_INT >= 23) {
                        l2Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i19), 100)));
                    }
                    this.G0.setFocusable(false);
                    this.G0.setImportantForAccessibility(2);
                    this.G0.setOnClickListener(new iv(this, 7));
                    this.G0.setVisibility(8);
                    vxVar3.addView(this.G0, g7.e6.c(-1.0f, i9));
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
                    sx sxVar4 = this.T;
                    if (sxVar4 != null) {
                        sxVar4.setTranslationY(W3() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    O4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(vxVar3);
                this.B3 = new yw(this, context, vxVar3, context);
                V4(true, false);
                this.B3.setOpenProgress(0.0f);
                vxVar3.addView(this.A0, g7.e6.c(81.0f, i9));
                vxVar3.addView(this.B3, g7.e6.c(-1.0f, i9));
                this.B0 = new org.telegram.ui.Components.zr(context);
                bsVar = this.F1;
                if (bsVar != null) {
                    vxVar3.addView(bsVar, g7.e6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.T2 != j12 && this.N0 != 3 && ChatObject.canAddChatToCommunity(this.U2)) {
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(eqVar, 0, 1, 33);
                    kh.d dVar = new kh.d(context, this.resourceProvider);
                    this.r0 = dVar;
                    dVar.e();
                    this.r0.setText(spannableStringBuilder2);
                    this.r0.setOnClickListener(new org.telegram.ui.Components.vh0(18, this, new org.telegram.ui.ActionBar.c2[1]));
                    rg.f fVar4 = new rg.f(getContext());
                    this.s0 = fVar4;
                    fVar4.setupColorKey(org.telegram.ui.ActionBar.f6.a7);
                    this.s0.setFadeZoneBottom(AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
                    this.s0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    vxVar3.addView(this.s0, g7.e6.g());
                    vxVar3.addView(this.r0, g7.e6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
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
                r0.j0.m(this.fragmentView, new jv(this, 7));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.bs bsVar2 = new org.telegram.ui.Components.bs(context2);
            this.F1 = bsVar2;
            bsVar2.setOnAnimatedHeightChangedListener(new dv(this, 5));
            kg.d a12 = aVar8.a(this.F1);
            a12.n(mg.c.m(this.resourceProvider));
            a12.o(AndroidUtilities.dp(7.0f));
            f10 = 72.0f;
            this.F1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            this.F1.setBlurredBackground(a12);
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
            nw nwVar = new nw(this, context2, this, 0);
            this.B1 = nwVar;
            this.C1.addView(nwVar);
            nw nwVar2 = new nw(this, context2, this, 1);
            this.D1 = nwVar2;
            this.E1.addView(nwVar2);
            this.F1.setCallFragmentContextView(this.D1);
            org.telegram.ui.Cells.z2 z2Var = new org.telegram.ui.Cells.z2(context2);
            this.I1 = z2Var;
            z2Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            U4();
            y6.i0(new lv(this, 0));
            y6.o0(new a5(this, 11));
            this.F1.addView(this.I1);
            if (this.T2 != j12) {
                oh.i iVar5 = new oh.i(context2, this.resourceProvider, true);
                this.M1 = iVar5;
                iVar5.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.M1.setUnreadMode(true);
                this.M1.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                this.M1.setOnClickListener(new iv(this, 4));
                this.F1.addView(this.M1);
                q3(false);
            }
        }
        i9 = -1;
        cwVar = this.v0;
        if (cwVar != null) {
        }
        sxVar = this.T;
        if (sxVar != null) {
        }
        vw vwVar3 = new vw(this, context, this, this.currentAccount, e4() ? 1 : 0);
        this.A0 = vwVar3;
        vwVar3.setActionBar(this.actionBar);
        this.A0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        vw vwVar22 = this.A0;
        vwVar22.h0 = false;
        vwVar22.setVisibility(8);
        this.I = false;
        this.H = false;
        this.G = false;
        if (this.h2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
        }
        vxVar3.addView(this.actionBar, g7.e6.c(-2.0f, i9));
        if (!this.h2) {
        }
        sxVar2 = this.T;
        if (sxVar2 != null) {
        }
        this.t0 = vxVar3.getChildCount();
        UndoView[] undoViewArr2 = this.u0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.S) {
        }
        if (this.R2 == 0) {
        }
        this.a0[0].a.setGlowColor(getThemedColor(i19));
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.f6.O8), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.N8), false);
        this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.f6.Q8), false);
        this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.f6.R8), true);
        if (!this.h2) {
            fh.l2 l2Var2 = new fh.l2(this, context, 27);
            this.G0 = l2Var2;
            if (Build.VERSION.SDK_INT >= 23) {
            }
            this.G0.setFocusable(false);
            this.G0.setImportantForAccessibility(2);
            this.G0.setOnClickListener(new iv(this, 7));
            this.G0.setVisibility(8);
            vxVar3.addView(this.G0, g7.e6.c(-1.0f, i9));
        }
        this.b1.setColor(getThemedColor(i19));
        this.l3 = false;
        if (this.j2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(vxVar3);
        this.B3 = new yw(this, context, vxVar3, context);
        V4(true, false);
        this.B3.setOpenProgress(0.0f);
        vxVar3.addView(this.A0, g7.e6.c(81.0f, i9));
        vxVar3.addView(this.B3, g7.e6.c(-1.0f, i9));
        this.B0 = new org.telegram.ui.Components.zr(context);
        bsVar = this.F1;
        if (bsVar != null) {
        }
        if (this.T2 != j12) {
            org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(eqVar2, 0, 1, 33);
            kh.d dVar2 = new kh.d(context, this.resourceProvider);
            this.r0 = dVar2;
            dVar2.e();
            this.r0.setText(spannableStringBuilder22);
            this.r0.setOnClickListener(new org.telegram.ui.Components.vh0(18, this, new org.telegram.ui.ActionBar.c2[1]));
            rg.f fVar42 = new rg.f(getContext());
            this.s0 = fVar42;
            fVar42.setupColorKey(org.telegram.ui.ActionBar.f6.a7);
            this.s0.setFadeZoneBottom(AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
            this.s0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            vxVar3.addView(this.s0, g7.e6.g());
            vxVar3.addView(this.r0, g7.e6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
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
        r0.j0.m(this.fragmentView, new jv(this, 7));
        return this.fragmentView;
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.i5 i5Var;
        vw vwVar = this.A0;
        org.telegram.ui.Components.i5 i5Var2 = null;
        if (vwVar != null && (i5Var = vwVar.T) != null && vwVar.m0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                i5Var.j(emojiStatusDocumentId.longValue(), z10);
                i5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(vwVar.f).isPremiumUser(user)) {
                i5Var.g(null, z10);
                i5Var.m(false, z10);
            } else {
                if (vwVar.J0 == null) {
                    vwVar.J0 = vwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    vwVar.J0 = new ih.i(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), vwVar.J0);
                }
                vwVar.J0.setColorFilter(new PorterDuffColorFilter(vwVar.f(org.telegram.ui.ActionBar.f6.zh), PorterDuff.Mode.MULTIPLY));
                i5Var.g(vwVar.J0, z10);
                i5Var.m(false, z10);
            }
            i5Var.k(Integer.valueOf(vwVar.f(org.telegram.ui.ActionBar.f6.zh)));
            vwVar.S.invalidate();
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
            this.actionBar.setRightDrawableOnClick(new iv(this, 2));
            b61.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.z3.g(null, z10);
            this.z3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.H3 == null) {
                this.H3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.H3 = new rx(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.H3);
            }
            this.H3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.zh), PorterDuff.Mode.MULTIPLY));
            this.z3.g(this.H3, z10);
            this.z3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new iv(this, 3));
            b61.t(this.currentAccount);
        }
        org.telegram.ui.Components.i5 i5Var3 = this.z3;
        int i9 = org.telegram.ui.ActionBar.f6.zh;
        i5Var3.k(Integer.valueOf(getThemedColor(i9)));
        org.telegram.ui.Cells.o oVar = this.A3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i9));
        }
        ax axVar = this.I0;
        if (axVar == null || !(axVar.getContentView() instanceof b61)) {
            return;
        }
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
        b61 b61Var = (b61) this.I0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.i5 i5Var4 = this.z3;
            if (rightDrawable == i5Var4) {
                i5Var2 = i5Var4;
            }
        }
        b61Var.y(i5Var2, titleTextView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x0569, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r13, r4.D0) != false) goto L367;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        long j10;
        int i13;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.an0 an0Var;
        org.telegram.ui.Components.an0 an0Var2;
        int i14;
        boolean z11;
        int i15 = 2;
        ArrayList arrayList = null;
        int i16 = 0;
        if (i9 == NotificationCenter.dialogsNeedReload) {
            if (this.a0 == null || this.O1) {
                return;
            }
            int i17 = 0;
            while (true) {
                cy[] cyVarArr = this.a0;
                if (i17 >= cyVarArr.length) {
                    break;
                }
                cy cyVar = cyVarArr[i17];
                int i18 = cyVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i18 == 7 || i18 == 8) ? getMessagesController().selectedDialogFilter[this.a0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.v3 && z12) {
                    AndroidUtilities.runOnUIThread(new jq(this, cyVar, objArr, i15), 160L);
                } else {
                    int length = objArr.length;
                    u4(cyVar);
                }
                i17++;
            }
            cw cwVar = this.v0;
            if (cwVar != null && cwVar.getVisibility() == 0) {
                this.v0.c();
            }
            this.v3 = false;
            return;
        }
        if (i9 == NotificationCenter.topicsDidLoaded) {
            g5(0, true);
            return;
        }
        if (i9 == NotificationCenter.chatInfoDidLoad) {
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
                cy[] cyVarArr2 = this.a0;
                if (i16 >= cyVarArr2.length) {
                    return;
                }
                u4(cyVarArr2[i16]);
                i16++;
            }
        } else {
            if (i9 == NotificationCenter.dialogsUnreadCounterChanged) {
                cw cwVar2 = this.v0;
                if (cwVar2 == null || cwVar2.getVisibility() != 0) {
                    return;
                }
                cw cwVar3 = this.v0;
                int defaultTabId = cwVar3.getDefaultTabId();
                gh.f1 f1Var = cwVar3.B;
                ArrayList arrayList2 = cwVar3.h;
                int i19 = cwVar3.h0.get(defaultTabId, -1);
                if (i19 < 0 || i19 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) arrayList2.get(i19);
                if (szVar.d == ((dw) cwVar3.F).a(szVar.a) || ((dw) cwVar3.F).a(szVar.a) < 0) {
                    return;
                }
                f1Var.f1();
                if (cwVar3.i0.get(i19) != szVar.a(true) || cwVar3.d0) {
                    cwVar3.d0 = true;
                    cwVar3.requestLayout();
                    f1Var.setItemAnimator(cwVar3.o0);
                    org.telegram.ui.Components.rz rzVar = cwVar3.E;
                    if (rzVar != null) {
                        rzVar.l();
                    }
                    cwVar3.I = 0;
                    org.telegram.ui.Components.sz d = cwVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        cwVar3.I = org.telegram.messenger.l0.C(24.0f, ((org.telegram.ui.Components.sz) arrayList2.get(i20)).a(true), cwVar3.I);
                    }
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                g5(0, true);
                return;
            }
            if (i9 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                g5(0, true);
                return;
            }
            if (i9 == NotificationCenter.emojiLoaded) {
                if (this.a0 != null) {
                    int i21 = 0;
                    while (true) {
                        cy[] cyVarArr3 = this.a0;
                        if (i21 >= cyVarArr3.length) {
                            break;
                        }
                        yx yxVar = cyVarArr3[i21].a;
                        if (yxVar != null) {
                            for (int i22 = 0; i22 < yxVar.getChildCount(); i22++) {
                                View childAt = yxVar.getChildAt(i22);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i21++;
                    }
                }
                cw cwVar4 = this.v0;
                if (cwVar4 != null) {
                    cwVar4.getTabsContainer().f1();
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.closeSearchByActiveAction) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.h(true);
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.proxySettingsChanged) {
                Z4(false, false);
                return;
            }
            long j11 = 0;
            if (i9 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                g5(num.intValue(), true);
                cw cwVar5 = this.v0;
                if (cwVar5 != null && cwVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.v0.c();
                }
                if (this.T2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.T2));
                    this.U2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.W2.e(this.U2, this.X2);
                }
                if (this.a0 != null) {
                    for (int i23 = 0; i23 < this.a0.length; i23++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.a0[i23].d.T(true);
                        }
                    }
                }
                d5(UserConfig.getInstance(i10).getCurrentUser(), true);
                return;
            }
            int i24 = NotificationCenter.appDidLogout;
            boolean[] zArr = u4;
            if (i9 == i24) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i9 == NotificationCenter.encryptedChatUpdated) {
                g5(0, true);
                return;
            }
            if (i9 == NotificationCenter.contactsDidLoad) {
                if (this.a0 == null || this.O1) {
                    return;
                }
                org.telegram.ui.Components.j10 j10Var = this.p0;
                if (j10Var != null) {
                    z11 = j10Var.getProgressVisible();
                    this.p0.f(false, true);
                } else {
                    z11 = false;
                }
                for (cy cyVar2 : this.a0) {
                    cyVar2.d.e = false;
                }
                if (z11) {
                    z4(0.0f);
                    ValueAnimator valueAnimator = this.Z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.Y, 1.0f).setDuration(250L);
                    this.Z = duration;
                    duration.setInterpolator(org.telegram.ui.Components.gr.f);
                    this.Z.addUpdateListener(new fv(this, 0));
                    this.Z.start();
                }
                int i25 = 0;
                boolean z13 = false;
                while (true) {
                    cy[] cyVarArr4 = this.a0;
                    if (i25 >= cyVarArr4.length) {
                        break;
                    }
                    if (!cyVarArr4[i25].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z13 = true;
                    } else {
                        this.a0[i25].d.l();
                    }
                    i25++;
                }
                if (z13) {
                    g5(0, true);
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.openedChatChanged) {
                if (this.a0 == null) {
                    return;
                }
                int i26 = 0;
                while (true) {
                    cy[] cyVarArr5 = this.a0;
                    if (i26 >= cyVarArr5.length) {
                        g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (cyVarArr5[i26].p() && AndroidUtilities.isTablet()) {
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
                        this.a0[i26].d.s = topicKey.dialogId;
                    }
                    i26++;
                }
            } else {
                if (i9 == NotificationCenter.notificationsSettingsUpdated) {
                    g5(0, true);
                    return;
                }
                if (i9 == NotificationCenter.messageReceivedByAck || i9 == NotificationCenter.messageReceivedByServer || i9 == NotificationCenter.messageSendError) {
                    g5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i9 == NotificationCenter.didSetPasscode) {
                    y3();
                    return;
                }
                if (i9 == NotificationCenter.needReloadRecentDialogsSearch) {
                    mx mxVar = this.y0;
                    if (mxVar == null || (an0Var2 = mxVar.U) == null || (i14 = an0Var2.d0) == 15) {
                        return;
                    }
                    int i27 = an0Var2.o0;
                    MessagesStorage.getInstance(i27).getStorageQueue().postRunnable(new h3.y(i27, i14, new of.v(an0Var2), i15));
                    return;
                }
                if (i9 == NotificationCenter.replyMessagesDidLoad) {
                    g5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i9 == NotificationCenter.reloadHints) {
                    mx mxVar2 = this.y0;
                    if (mxVar2 == null || (an0Var = mxVar2.U) == null) {
                        return;
                    }
                    an0Var.l();
                    return;
                }
                if (i9 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i10).getConnectionsManager().getConnectionState();
                    if (this.Z1 != connectionState) {
                        this.Z1 = connectionState;
                        Z4(true, false);
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.onDownloadingFilesChanged) {
                    Z4(true, false);
                    mx mxVar3 = this.y0;
                    if (mxVar3 != null) {
                        int currentPosition = mxVar3.getCurrentPosition();
                        org.telegram.ui.Components.gn0 gn0Var = mxVar3.P;
                        c5(gn0Var != null && gn0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.needDeleteDialog) {
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
                    Runnable iaVar = new kh.ia(this, chat2, longValue3, booleanValue, user, z10);
                    N3();
                    if (this.u0[0] == null) {
                        iaVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        iaVar.run();
                        return;
                    }
                    UndoView Y3 = Y3();
                    if (Y3 != null) {
                        Y3.j(booleanValue ? 1 : 95, longValue3, iaVar);
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.folderBecomeEmpty) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int i28 = this.R2;
                    if (i28 != intValue || i28 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i9 == NotificationCenter.dialogFiltersUpdated) {
                    V4(true, true);
                    return;
                }
                if (i9 == NotificationCenter.filterSettingsUpdated) {
                    J4();
                    return;
                }
                if (i9 == NotificationCenter.newSuggestionsAvailable) {
                    L4();
                    U4();
                    int checkEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (checkEmailSuggestion != 0) {
                        fg0 fg0Var = new fg0();
                        uv uvVar = new uv(this, 5);
                        uv uvVar2 = new uv(this, 6);
                        boolean z14 = checkEmailSuggestion == 2;
                        fg0Var.B = 3;
                        fg0Var.a = 12;
                        fg0Var.Z = uvVar;
                        fg0Var.a0 = uvVar2;
                        fg0Var.c0 = z14;
                        fg0Var.d0 = true;
                        presentFragment(fg0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.j10 j10Var2 = this.p0;
                    if (j10Var2 != null) {
                        j10Var2.f(true, true);
                    }
                    cy[] cyVarArr6 = this.a0;
                    if (cyVarArr6 != null) {
                        for (cy cyVar3 : cyVarArr6) {
                            lw lwVar = cyVar3.d;
                            lwVar.M = false;
                            lwVar.e = true;
                            lwVar.l();
                        }
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.messagesDeleted) {
                    if (!this.l3 || this.y0 == null) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    long longValue4 = ((Long) objArr[1]).longValue();
                    mx mxVar4 = this.y0;
                    HashMap hashMap = mxVar4.v0;
                    SparseArray sparseArray = mxVar4.h;
                    int size2 = sparseArray.size();
                    for (int i29 = 0; i29 < size2; i29++) {
                        View view = (View) sparseArray.valueAt(i29);
                        if (view instanceof f10) {
                            ((f10) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i30 = 0; i30 < mxVar4.getChildCount(); i30++) {
                        if (mxVar4.getChildAt(i30) instanceof f10) {
                            ((f10) mxVar4.getChildAt(i30)).e(longValue4, arrayList3);
                        }
                    }
                    mxVar4.I0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    int i31 = 0;
                    while (i31 < arrayList4.size()) {
                        x00 x00Var = (x00) arrayList4.get(i31);
                        MessageObject messageObject = (MessageObject) hashMap.get(x00Var);
                        if (messageObject != null) {
                            j10 = j11;
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < j10) {
                                i13 = (int) (-dialogId);
                                i12 = i31;
                            } else {
                                i12 = i31;
                            }
                            i13 = 0;
                            if (i13 == longValue4) {
                                for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                                    if (messageObject.getId() == ((Integer) arrayList3.get(i32)).intValue()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(x00Var);
                                    }
                                }
                            }
                        } else {
                            i12 = i31;
                            j10 = j11;
                        }
                        i31 = i12 + 1;
                        j11 = j10;
                    }
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i33 = 0; i33 < size3; i33++) {
                            hashMap.remove(arrayList.get(i33));
                        }
                        mxVar4.t0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.w0 w0Var = mxVar4.y0;
                        if (w0Var != null) {
                            w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.didClearDatabase) {
                    if (this.a0 != null) {
                        int i34 = 0;
                        while (true) {
                            cy[] cyVarArr7 = this.a0;
                            if (i34 >= cyVarArr7.length) {
                                break;
                            }
                            of.j jVar = cyVarArr7[i34].d.L;
                            if (jVar != null) {
                                jVar.a.clear();
                                jVar.b.clear();
                                jVar.c.clear();
                                jVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(jVar.e);
                            }
                            i34++;
                        }
                    }
                    aa1 aa1Var = aa1.b;
                    if (aa1Var != null) {
                        aa1Var.dismiss();
                        aa1.b = null;
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.communitySwitchedCollapsed) {
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
                if (i9 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.T2 == ((Long) objArr[0]).longValue()) {
                        q3(true);
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            qu quVar = this.N3;
                            if (quVar == null || quVar.getTag() == null) {
                                return;
                            }
                            qu quVar2 = this.N3;
                            quVar2.animate().setListener(null).cancel();
                            quVar2.animate().setListener(new org.telegram.ui.Components.su0(4, this, quVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.N3.setTag(null);
                            return;
                        }
                        if (this.N3 == null) {
                            Context context = this.fragmentView.getContext();
                            qu quVar3 = new qu(context);
                            LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
                            org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
                            pi0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            pi0Var.getAnimatedDrawable().I(1);
                            pi0Var.d();
                            f10.addView(pi0Var, g7.e6.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i35 = org.telegram.ui.ActionBar.f6.G6;
                            j3.r0.w(i35, null, false, textView, 1);
                            TextView h = j3.r0.h(f10, textView, g7.e6.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            h.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            h.setTextSize(1, 14.0f);
                            h.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i35, false));
                            h.setGravity(1);
                            TextView h10 = j3.r0.h(f10, h, g7.e6.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            h10.setTextSize(1, 14.0f);
                            h10.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            h10.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i35, false));
                            h10.setGravity(1);
                            f10.addView(h10, g7.e6.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            quVar3.addView(f10, g7.e6.e(-1, -2, 16));
                            quVar3.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                            quVar3.setOnTouchListener(new pu());
                            this.N3 = quVar3;
                            quVar3.setAlpha(0.0f);
                            ((vx) this.fragmentView).addView(this.N3);
                            this.N3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                        }
                        this.N3.setTag(1);
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.onDatabaseOpened) {
                    if (getMessagesStorage().showClearDatabaseAlert) {
                        getMessagesStorage().showClearDatabaseAlert = false;
                        aa1.n(this);
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.userEmojiStatusUpdated) {
                    d5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
                    d5(UserConfig.getInstance(i10).getCurrentUser(), true);
                    e5();
                    return;
                }
                if (i9 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    i4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
                    return;
                }
                if (i9 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i36 = 0;
                    while (true) {
                        cy[] cyVarArr8 = this.a0;
                        if (i36 >= cyVarArr8.length) {
                            return;
                        }
                        cy cyVar4 = cyVarArr8[i36];
                        if (cyVar4 != null && (((i11 = cyVar4.s) == 7 || i11 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[cyVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            cyVar4.q(true);
                            return;
                        }
                        i36++;
                    }
                } else {
                    if (i9 != NotificationCenter.dialogTranslate) {
                        if (i9 == NotificationCenter.storiesUpdated) {
                            f5(this.R);
                            g5(0, true);
                            return;
                        }
                        if (i9 == NotificationCenter.storiesEnabledUpdate) {
                            e5();
                            return;
                        }
                        if (i9 == NotificationCenter.unconfirmedAuthUpdate) {
                            U4();
                            return;
                        }
                        if (i9 == NotificationCenter.premiumPromoUpdated) {
                            U4();
                            return;
                        }
                        if (i9 == NotificationCenter.starBalanceUpdated || i9 == NotificationCenter.starSubscriptionsLoaded) {
                            U4();
                            return;
                        } else if (i9 == NotificationCenter.appConfigUpdated) {
                            U4();
                            return;
                        } else {
                            if (i9 == NotificationCenter.activeAuctionsUpdated) {
                                U4();
                                return;
                            }
                            return;
                        }
                    }
                    long longValue6 = ((Long) objArr[0]).longValue();
                    int i37 = 0;
                    while (true) {
                        cy[] cyVarArr9 = this.a0;
                        if (i37 >= cyVarArr9.length) {
                            return;
                        }
                        cy cyVar5 = cyVarArr9[i37];
                        if (cyVar5.a != null) {
                            int i38 = 0;
                            while (true) {
                                if (i38 < cyVar5.a.getChildCount()) {
                                    View childAt2 = cyVar5.a.getChildAt(i38);
                                    if (childAt2 instanceof org.telegram.ui.Cells.r2) {
                                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt2;
                                        if (longValue6 == r2Var.getDialogId()) {
                                            r2Var.t();
                                            break;
                                        }
                                    }
                                    i38++;
                                }
                            }
                        }
                        i37++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof mh.c3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        return this.R2 == 1;
    }

    public final void e5() {
        kh.x3 x3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.K3 != storiesEnabled) {
            X4();
            if (!this.K3 && storiesEnabled && (x3Var = this.l0) != null) {
                x3Var.v();
            }
            this.K3 = storiesEnabled;
        }
        org.telegram.ui.Components.j10 j10Var = this.p0;
        if (j10Var == null) {
            return;
        }
        if (this.N0 == 10) {
            j10Var.setImageResource(R.drawable.floating_check);
            this.p0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            j10Var.setImageResource(R.drawable.filled_fab_compose_32);
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
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        ih.v6 X3;
        ArrayList arrayList;
        if (this.A0 == null || this.E != null) {
            return;
        }
        yw ywVar = this.B3;
        if ((ywVar != null && ywVar.c()) || this.l3 || (kVar = this.actionBar) == null || kVar.s() || this.h2) {
            return;
        }
        kh.wb wbVar = kh.wb.B2;
        int i9 = 0;
        if ((wbVar != null && wbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().G0)) {
            z10 = false;
        }
        int i10 = 1;
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
        int i11 = 2;
        int i12 = 8;
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
                ofFloat.addUpdateListener(new qi(i10, this));
                this.F.addListener(new org.telegram.ui.Components.y11(this, 23));
                this.F.setDuration(200L);
                this.F.setInterpolator(org.telegram.ui.Components.gr.f);
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
            float f10 = -this.J;
            float T3 = z11 ? 0.0f : T3();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat2;
            ofFloat2.addUpdateListener(new lx(this, f10, z11, T3));
            this.E.addListener(new ex(this, z11, i11));
            this.E.setDuration(200L);
            this.E.setInterpolator(org.telegram.ui.Components.gr.f);
            this.E.start();
            return;
        }
        this.G = z11;
        vw vwVar = this.A0;
        if ((z11 || this.H) && !isInPreviewMode()) {
            i12 = 0;
        }
        vwVar.setVisibility(i12);
        if (z11) {
            this.t3 = -AndroidUtilities.dp(81.0f);
            C4(-T3());
        } else {
            C4(0.0f);
        }
        while (true) {
            cy[] cyVarArr = this.a0;
            if (i9 >= cyVarArr.length) {
                break;
            }
            cy cyVar = cyVarArr[i9];
            if (cyVar != null) {
                cyVar.a.requestLayout();
            }
            i9++;
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
        org.telegram.ui.Components.x60 x60Var = this.H0;
        if (x60Var != null) {
            x60Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i9 = this.a0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i9 == 7 || i9 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
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
    public final void g5(int i9, boolean z10) {
        RecyclerView recyclerView;
        int i10;
        int childCount;
        int i11;
        if ((this.O1 && (MessagesController.UPDATE_MASK_REORDER & i9) == 0) || this.isPaused) {
            return;
        }
        int i12 = 0;
        while (i12 < 3) {
            if (i12 == 2) {
                mx mxVar = this.y0;
                recyclerView = mxVar != null ? mxVar.R : null;
            } else {
                cy[] cyVarArr = this.a0;
                if (cyVarArr != null) {
                    yx yxVar = i12 < cyVarArr.length ? cyVarArr[i12].a : null;
                    if (yxVar == null || cyVarArr[i12].getVisibility() == 0) {
                        r5 = yxVar != null ? this.a0[i12] : null;
                        recyclerView = yxVar;
                    }
                }
                i12++;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                if (((MessagesController.UPDATE_MASK_NEW_MESSAGE & i9) != 0 || i9 == 0) && r5 != null) {
                    r5.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    while (i10 < childCount2) {
                        View childAt = recyclerView.getChildAt(i10);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.r2;
                        ArrayList arrayList = this.E2;
                        if (z11 && (this.y0 == null || recyclerView.getAdapter() != this.y0.U)) {
                            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i9) != 0) {
                                r2Var.S(this.actionBar.s(), true);
                                i10 = this.O1 ? i10 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i9) != 0) {
                                r2Var.U(false, (MessagesController.UPDATE_MASK_CHAT & i9) != 0);
                            } else {
                                if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i9) == 0) {
                                    if (r2Var.a0(i9, z10)) {
                                        r5.q(false);
                                        break;
                                    }
                                } else if (this.a0[i12].p() && AndroidUtilities.isTablet()) {
                                    r2Var.setDialogSelected(r2Var.getDialogId() == this.l2.dialogId);
                                }
                                if (arrayList != null) {
                                    r2Var.U(arrayList.contains(Long.valueOf(r2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.va)) {
                                    ((org.telegram.ui.Cells.va) childAt).j(i9);
                                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                                    h6Var.u(i9);
                                    if (arrayList != null) {
                                        h6Var.s(arrayList.contains(Long.valueOf(h6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.O1 && (childAt instanceof org.telegram.ui.Components.wk0)) {
                                    org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) childAt;
                                    childCount = wk0Var.getChildCount();
                                    for (i11 = 0; i11 < childCount; i11++) {
                                        View childAt2 = wk0Var.getChildAt(i11);
                                        if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                                            ((org.telegram.ui.Cells.n4) childAt2).b(i9);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.va)) {
                        }
                        if (!this.O1) {
                            org.telegram.ui.Components.wk0 wk0Var2 = (org.telegram.ui.Components.wk0) childAt;
                            childCount = wk0Var2.getChildCount();
                            while (i11 < childCount) {
                            }
                        }
                    }
                }
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return (e4() || this.B3.f) ? org.telegram.ui.ActionBar.x4.a : org.telegram.ui.ActionBar.x4.b;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T3, 1.0f);
            this.W3 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.T3, 1.0f);
        this.W3 = ofFloat2;
        ofFloat2.addUpdateListener(new fv(this, 2));
        this.W3.setInterpolator(org.telegram.ui.Components.gr.g);
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
        of.m mVar;
        org.telegram.ui.Components.wk0 wk0Var;
        final int i9 = 0;
        org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6(this) { // from class: org.telegram.ui.aw
            public final /* synthetic */ dy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.g6
            public final /* synthetic */ void a(float f10) {
                int i10 = i9;
            }

            @Override // org.telegram.ui.ActionBar.g6
            public final void b() {
                switch (i9) {
                    case 0:
                        dy.F0(this.b);
                        break;
                    default:
                        dy dyVar = this.b;
                        mx mxVar = dyVar.y0;
                        if (mxVar != null) {
                            org.telegram.ui.ActionBar.z actionMode = mxVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = dyVar.y0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.y8), PorterDuff.Mode.SRC_IN));
                                break;
                            }
                        }
                        break;
                }
            }

            private final /* synthetic */ void c(float f10) {
            }

            private final /* synthetic */ void d(float f10) {
            }
        };
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.r2 r2Var = this.T0;
        if (r2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(r2Var, 1, null, null, null, null, i10));
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.i0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        }
        int i11 = this.R2;
        Paint paint = this.b1;
        final int i12 = 1;
        if (i11 == 0) {
            if (this.h2) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i10));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, paint, null, null, i10));
            mx mxVar = this.y0;
            if (mxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(mxVar.R, 32768, null, null, null, null, i10));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.s1}, null, !this.S ? org.telegram.ui.ActionBar.f6.A8 : org.telegram.ui.ActionBar.f6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, paint, null, null, i10));
            mx mxVar2 = this.y0;
            if (mxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(mxVar2.R, 32768, null, null, null, null, i10));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.s1}, null, !this.S ? org.telegram.ui.ActionBar.f6.P8 : org.telegram.ui.ActionBar.f6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.R8));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.f6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 512, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.f6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.f6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d1, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.I5));
        if (this.v0 != null) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 == null || !kVar2.s()) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0, 0, new Class[]{org.telegram.ui.Components.vz.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.f6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, org.telegram.ui.ActionBar.f6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, org.telegram.ui.ActionBar.f6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0, 0, new Class[]{org.telegram.ui.Components.vz.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.f6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, org.telegram.ui.ActionBar.f6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, org.telegram.ui.ActionBar.f6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.v0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, org.telegram.ui.ActionBar.f6.U9));
        }
        arrayList.addAll(g7.h6.a(new org.telegram.ui.ActionBar.g6(this) { // from class: org.telegram.ui.aw
            public final /* synthetic */ dy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.g6
            public final /* synthetic */ void a(float f10) {
                int i102 = i12;
            }

            @Override // org.telegram.ui.ActionBar.g6
            public final void b() {
                switch (i12) {
                    case 0:
                        dy.F0(this.b);
                        break;
                    default:
                        dy dyVar = this.b;
                        mx mxVar3 = dyVar.y0;
                        if (mxVar3 != null) {
                            org.telegram.ui.ActionBar.z actionMode = mxVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = dyVar.y0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.y8), PorterDuff.Mode.SRC_IN));
                                break;
                            }
                        }
                        break;
                }
            }

            private final /* synthetic */ void c(float f10) {
            }

            private final /* synthetic */ void d(float f10) {
            }
        }, org.telegram.ui.ActionBar.f6.w8, i13));
        int i14 = 0;
        while (true) {
            if (i14 >= 3) {
                break;
            }
            if (i14 == 2) {
                mx mxVar3 = this.y0;
                if (mxVar3 != null) {
                    wk0Var = mxVar3.R;
                    if (wk0Var != null) {
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i9] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i9] = org.telegram.ui.Cells.r2.class;
                        clsArr2[1] = org.telegram.ui.Cells.h6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i9] = org.telegram.ui.Cells.r2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.f6.w0;
                        int i15 = org.telegram.ui.ActionBar.f6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr3, paint2, null, null, i15));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i9] = org.telegram.ui.Cells.r2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.f6.y0;
                        int i16 = org.telegram.ui.ActionBar.f6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr4, paint3, null, null, i16));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i9] = org.telegram.ui.Cells.r2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr5, org.telegram.ui.ActionBar.f6.L0, null, null, org.telegram.ui.ActionBar.f6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i9] = org.telegram.ui.Cells.r2.class;
                        clsArr6[1] = org.telegram.ui.Cells.h6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i9] = org.telegram.ui.ActionBar.f6.a1;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.f6.a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i9] = org.telegram.ui.Cells.r2.class;
                        clsArr7[1] = org.telegram.ui.Cells.h6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i9] = org.telegram.ui.ActionBar.f6.g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.f6.h1;
                        int i17 = org.telegram.ui.ActionBar.f6.j9;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr7, null, drawableArr2, null, i17));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i9] = org.telegram.ui.Cells.r2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i9] = org.telegram.ui.ActionBar.f6.j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.f6.k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.f6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.f6.b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i9] = org.telegram.ui.Cells.r2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i9] = org.telegram.ui.ActionBar.f6.l1;
                        int i18 = org.telegram.ui.ActionBar.f6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr9, null, drawableArr4, null, i18));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i9] = org.telegram.ui.Cells.r2.class;
                        clsArr10[1] = org.telegram.ui.Cells.h6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, clsArr10, null, new Paint[]{textPaintArr[i9], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, null, org.telegram.ui.ActionBar.f6.X8));
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, null, org.telegram.ui.ActionBar.f6.Z8));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.F0[1], null, null, org.telegram.ui.ActionBar.f6.i9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.F0[0], null, null, org.telegram.ui.ActionBar.f6.g9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.G0, null, null, org.telegram.ui.ActionBar.f6.m9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i17));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.f6.H0, null, null, org.telegram.ui.ActionBar.f6.p9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.I0, null, null, org.telegram.ui.ActionBar.f6.q9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.J0, null, null, org.telegram.ui.ActionBar.f6.r9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.K0, null, null, i18));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.v0, null, null, org.telegram.ui.ActionBar.f6.s9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.u0, null, null, org.telegram.ui.ActionBar.f6.t9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.T0}, null, org.telegram.ui.ActionBar.f6.u9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.V0, org.telegram.ui.ActionBar.f6.W0}, null, org.telegram.ui.ActionBar.f6.v9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.X0}, null, org.telegram.ui.ActionBar.f6.w9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.x0, null, null, org.telegram.ui.ActionBar.f6.x9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.Y0}, null, org.telegram.ui.ActionBar.f6.y9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.i1}, null, org.telegram.ui.ActionBar.f6.A9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f1}, null, org.telegram.ui.ActionBar.f6.z9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.c1}, null, org.telegram.ui.ActionBar.f6.B9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m1}, null, i15));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.n1}, null, org.telegram.ui.ActionBar.f6.Z5));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o1}, null, org.telegram.ui.ActionBar.f6.zj));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.p1, org.telegram.ui.ActionBar.f6.q1, org.telegram.ui.ActionBar.f6.r1}, null, i16));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.d9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.c9));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.T8));
                        int i19 = org.telegram.ui.ActionBar.f6.d6;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i19));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, null, i19));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.f6.k7));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.f6.h6));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.f6.Q0, null, null, org.telegram.ui.ActionBar.f6.A6));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.f6.P0, null, null, org.telegram.ui.ActionBar.f6.p6));
                        org.telegram.ui.Cells.v3.a(arrayList, wk0Var);
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 4, new Class[]{org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.f6.G6));
                        int i20 = org.telegram.ui.ActionBar.f6.b7;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i20));
                        int i21 = org.telegram.ui.ActionBar.f6.a7;
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i21));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 48, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i21));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.f6.B6));
                        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.f6.o6));
                        i14++;
                        i9 = 0;
                    }
                }
                i14++;
                i9 = 0;
            } else {
                cy[] cyVarArr = this.a0;
                if (cyVarArr != null) {
                    wk0Var = i14 < cyVarArr.length ? cyVarArr[i14].a : null;
                    if (wk0Var != null) {
                    }
                }
                i14++;
                i9 = 0;
            }
        }
        int i22 = org.telegram.ui.ActionBar.f6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.V7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.W7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.X7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Y7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Z7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.a8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.b8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.L7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.M7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.N7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.k9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.j9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.o9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Y8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.l9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.n9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.h9));
        if (this.a0 != null) {
            int i23 = 0;
            while (true) {
                cy[] cyVarArr2 = this.a0;
                if (i23 >= cyVarArr2.length) {
                    break;
                }
                if (this.R2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.h6(cyVarArr2[i23].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.h6(cyVarArr2[i23].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
                }
                int i24 = org.telegram.ui.ActionBar.f6.m9;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, 4, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"emptyTextView1"}, null, null, null, i24));
                int i25 = org.telegram.ui.ActionBar.f6.g9;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, 4, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"emptyTextView2"}, null, null, null, i25));
                if (SharedConfig.archiveHidden) {
                    org.telegram.ui.Components.mi0[] mi0VarArr = {org.telegram.ui.ActionBar.f6.u1};
                    int i26 = org.telegram.ui.ActionBar.f6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, mi0VarArr, "Arrow1", i26));
                    arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.u1}, "Arrow2", i26));
                } else {
                    org.telegram.ui.Components.mi0[] mi0VarArr2 = {org.telegram.ui.ActionBar.f6.u1};
                    int i27 = org.telegram.ui.ActionBar.f6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, mi0VarArr2, "Arrow1", i27));
                    arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.u1}, "Arrow2", i27));
                }
                org.telegram.ui.Components.mi0[] mi0VarArr3 = {org.telegram.ui.ActionBar.f6.u1};
                int i28 = org.telegram.ui.ActionBar.f6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, mi0VarArr3, "Box2", i28));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.u1}, "Box1", i28));
                org.telegram.ui.Components.mi0[] mi0VarArr4 = {org.telegram.ui.ActionBar.f6.x1};
                int i29 = org.telegram.ui.ActionBar.f6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, mi0VarArr4, "Arrow", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.x1}, "Line", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.y1}, "Arrow", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.y1}, "Line", i29));
                org.telegram.ui.Components.mi0[] mi0VarArr5 = {org.telegram.ui.ActionBar.f6.v1};
                int i30 = org.telegram.ui.ActionBar.f6.c9;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, mi0VarArr5, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.v1}, "Box2", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.v1}, "Box1", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.z1}, "Line 1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.z1}, "Line 2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.z1}, "Line 3", i30));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.z1}, "Cup Red", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.z1}, "Box", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.w1}, "Arrow1", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.w1}, "Arrow2", org.telegram.ui.ActionBar.f6.d9));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.w1}, "Box2", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.mi0[]{org.telegram.ui.ActionBar.f6.w1}, "Box1", i29));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i23].a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.f6.G6));
                int i31 = i23;
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i31].a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, g6Var2, org.telegram.ui.ActionBar.f6.y6));
                g6Var = g6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i31].a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, g6Var2, org.telegram.ui.ActionBar.f6.il));
                int i32 = org.telegram.ui.ActionBar.f6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i31].a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, null, i32));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i31].a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, null, i32));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0[i31].w, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
                mVar = this.a0[i31].d;
                mVar.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView"}, null, null, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.f6.U8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"headerTextView"}, null, null, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"messageTextView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
                i23 = i31 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.S9));
        mx mxVar4 = this.y0;
        if (mxVar4 != null) {
            org.telegram.ui.Components.an0 an0Var = mxVar4.U;
            arrayList.add(new org.telegram.ui.ActionBar.h6(an0Var != null ? an0Var.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.f6.w0, null, null, org.telegram.ui.ActionBar.f6.U8));
            org.telegram.ui.Components.an0 an0Var2 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.h6(an0Var2 != null ? an0Var2.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.f6.y0, null, null, org.telegram.ui.ActionBar.f6.V8));
            org.telegram.ui.Components.an0 an0Var3 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.h6(an0Var3 != null ? an0Var3.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.f6.L0, null, null, org.telegram.ui.ActionBar.f6.W8));
            org.telegram.ui.Components.an0 an0Var4 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.h6(an0Var4 != null ? an0Var4.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.f6.N0, null, null, org.telegram.ui.ActionBar.f6.f9));
            org.telegram.ui.Components.an0 an0Var5 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.h6(an0Var5 != null ? an0Var5.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.f6.G6));
            org.telegram.ui.Components.an0 an0Var6 = this.y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.h6(an0Var6 != null ? an0Var6.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, null, null, null, org.telegram.ui.ActionBar.f6.T8));
        }
        int i33 = 0;
        while (true) {
            UndoView[] undoViewArr = this.u0;
            if (i33 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i33];
            int i34 = org.telegram.ui.ActionBar.f6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoView, 32, null, null, null, null, i34));
            int i35 = org.telegram.ui.ActionBar.f6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i35));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i35));
            int i36 = org.telegram.ui.ActionBar.f6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", i34));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", i34));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", i36));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i33], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", i36));
            i33++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.o5));
        int i37 = org.telegram.ui.ActionBar.f6.q7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ri));
        int i38 = org.telegram.ui.ActionBar.f6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Xi));
        if (this.x1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.x1, 0, null, org.telegram.ui.ActionBar.f6.j2, null, null, org.telegram.ui.ActionBar.f6.Sd));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.x1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.i3}, null, org.telegram.ui.ActionBar.f6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.x1, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.f6.Ud));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.x1, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.f6.Wd));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.x1, TLObject.FLAG_23, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.f6.Vd));
        }
        int i39 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, i39));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, i38));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.g8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.hh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.jk));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.kk));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.lk));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.mk));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.hk));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.ik));
        of.o0 o0Var = this.X;
        if (o0Var != null) {
            arrayList.addAll(o0Var.getThemeDescriptions());
            this.X.B1();
        }
        fy fyVar = this.d0;
        if (fyVar != null) {
            fyVar.a();
            this.d0.invalidate();
        }
        mx mxVar5 = this.y0;
        if (mxVar5 != null) {
            mxVar5.M(arrayList);
        }
        org.telegram.ui.Cells.z2 z2Var = this.I1;
        int i40 = 8;
        if (z2Var != null) {
            arrayList.addAll(g7.h6.a(new org.telegram.ui.Components.s6(new ri(z2Var, 19), i40), org.telegram.ui.ActionBar.f6.d6, i39, org.telegram.ui.ActionBar.f6.y6));
        }
        org.telegram.ui.Cells.sa saVar = this.J1;
        if (saVar != null) {
            arrayList.addAll(g7.h6.a(new org.telegram.ui.Components.s6(new ri(saVar, 20), i40), org.telegram.ui.ActionBar.f6.d6, i39, org.telegram.ui.ActionBar.f6.y6, org.telegram.ui.ActionBar.f6.I6, i37));
        }
        org.telegram.ui.Cells.m mVar2 = this.H1;
        if (mVar2 != null) {
            arrayList.addAll(g7.h6.a(new org.telegram.ui.Components.s6(new ri(mVar2, 21), i40), org.telegram.ui.ActionBar.f6.d6, i39, org.telegram.ui.ActionBar.f6.y6, org.telegram.ui.ActionBar.f6.I6, i37));
        }
        return arrayList;
    }

    public final boolean h4() {
        return this.y2 == null && this.j2 == null;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        ow owVar;
        if ((this.O0 <= 1 && ((owVar = this.x1) == null || owVar.getVisibility() != 0 || TextUtils.isEmpty(this.x1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
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
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).U(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).U(true, true);
        } else if (view instanceof org.telegram.ui.Cells.h6) {
            ((org.telegram.ui.Cells.h6) view).s(true, true);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        yw ywVar;
        return (this.f2 || (ywVar = this.B3) == null || ywVar.getFragment() == null) ? i0.a.f(getThemedColor(org.telegram.ui.ActionBar.f6.d6)) > 0.699999988079071d : this.B3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(of.m0 m0Var) {
        mx mxVar;
        if (!this.l3 || (mxVar = this.y0) == null) {
            return;
        }
        ArrayList arrayList = mxVar.w0;
        if (!arrayList.isEmpty()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (m0Var.b((of.m0) arrayList.get(i9))) {
                    return;
                }
            }
        }
        arrayList.add(m0Var);
        sx sxVar = this.T;
        sxVar.B.add(m0Var);
        sxVar.E = r1.size() - 1;
        sxVar.f();
        this.T.r.getText().clear();
        W4(true, null, null, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j4(long j10) {
        int i9;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    j4(dialog2.id);
                }
                return;
            }
            return;
        }
        int i11 = this.a0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.a0[0].s == 8 ? (char) 1 : (char) 0];
        }
        this.u3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            A4(true, true);
            o3();
            if (this.N1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.N1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.N1.get(i13)).id == j10) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
                if (i12 < 0) {
                    A4(false, false);
                }
                i9 = i12;
                if (!getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
                    getMessagesController().markAllTopicsAsRead(j10);
                }
                getMessagesController().markMentionsAsRead(j10, 0L);
                MessagesController messagesController = getMessagesController();
                int i14 = dialog.top_message;
                messagesController.markDialogAsRead(j10, i14, i14, dialog.last_message_date, false, 0L, 0, true, 0);
                if (i9 < 0) {
                    this.N1.remove(i9);
                    this.a0[0].x.D();
                    this.a0[0].q(true);
                    return;
                }
                return;
            }
        }
        i9 = -1;
        if (!getMessagesController().isForum(j10)) {
        }
        getMessagesController().markAllTopicsAsRead(j10);
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController2 = getMessagesController();
        int i142 = dialog.top_message;
        messagesController2.markDialogAsRead(j10, i142, i142, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i9 < 0) {
        }
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.R2 == 0 && this.T2 == 0 && Build.VERSION.SDK_INT >= 33 && qj0.n(parentActivity)) {
            if (z10) {
                showDialog(new qj0(parentActivity, !org.telegram.ui.Components.kd0.c(), new sv(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.Q1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.w(parentActivity, new mv(this, 1)).a;
                this.P1 = c2Var;
                showDialog(c2Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i9 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
            org.telegram.ui.Components.wp0 wp0Var = new org.telegram.ui.Components.wp0(getParentActivity(), getResourceProvider());
            this.C2 = wp0Var;
            int i9 = 0;
            wp0Var.setLayoutClickListener(new iv(this, i9));
            this.C2.setOnModeChangeListener(new jv(this, i9));
            ow owVar = this.x1;
            org.telegram.ui.Components.wp0 wp0Var2 = this.C2;
            if (wp0Var2 == null) {
                owVar.getClass();
            } else {
                owVar.B1 = wp0Var2;
                owVar.addView(wp0Var2, 0, g7.e6.e(-1, 48, 51));
                owVar.b3 = false;
                owVar.M();
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
                org.telegram.ui.Components.wp0 wp0Var3 = this.C2;
                wp0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    wp0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.B2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.wp0 wp0Var4 = this.C2;
                    wp0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        wp0Var4.e(charSequence2, true);
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
        ig.e eVar;
        ng.d dVar;
        ng.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.h4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.c4) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int dp3 = AndroidUtilities.dp(this.G ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        cw cwVar = this.v0;
        boolean z10 = false;
        int measuredHeight2 = dp3 + ((cwVar == null || cwVar.getVisibility() != 0) ? 0 : this.v0.getMeasuredHeight());
        org.telegram.ui.Components.bs bsVar = this.F1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((bsVar == null || bsVar.getVisibility() != 0) ? 0 : this.F1.getSumHeightOfAllVisibleChild()) + ((int) this.J);
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
        int i9 = 0;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        hv hvVar = new hv(this, i9);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = hvVar;
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
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a7  */
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
    public final void n4(View view, int i9, f2.r0 r0Var) {
        f2.r0 r0Var2;
        long j10;
        MessageObject messageObject;
        long j11;
        long j12;
        boolean z10;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Components.an0 an0Var;
        yw ywVar;
        long j13;
        long j14;
        MessageObject messageObject2;
        int i13;
        long makeEncryptedDialogId;
        long j15;
        long j16;
        mx mxVar;
        boolean z11;
        int i14;
        TLRPC.Document greetingsSticker;
        boolean z12;
        mx mxVar2;
        int i15;
        Object I;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z13 = r0Var instanceof of.m;
        if (z13) {
            of.m mVar = (of.m) r0Var;
            int i17 = mVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    I = mVar.I(i9);
                    if (this.y2 == null && mVar.n && r0Var.j(i9) == 21) {
                        this.y2.I(this);
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
                                presentFragment(new dy(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.t(null)) {
                                M4(j17, view);
                                return;
                            }
                            r0Var2 = r0Var;
                            i10 = i16;
                            messageObject = null;
                            i12 = i15;
                            j12 = j17;
                            z10 = false;
                            i11 = 0;
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
                                    showDialog(new org.telegram.ui.Components.cx0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) I;
                            r0Var2 = r0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.p70(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j17 = -chat2.id;
                            i16 = 0;
                            i10 = i16;
                            messageObject = null;
                            i12 = i15;
                            j12 = j17;
                            z10 = false;
                            i11 = 0;
                            j11 = 0;
                            j10 = 0;
                        }
                        j17 = -j18;
                    } else {
                        j17 = ((TLRPC.User) I).id;
                    }
                    r0Var2 = r0Var;
                    i16 = 0;
                    i10 = i16;
                    messageObject = null;
                    i12 = i15;
                    j12 = j17;
                    z10 = false;
                    i11 = 0;
                    j11 = 0;
                    j10 = 0;
                }
            }
            i15 = 0;
            I = mVar.I(i9);
            if (this.y2 == null) {
            }
            if (I instanceof TLRPC.User) {
            }
            r0Var2 = r0Var;
            i16 = 0;
            i10 = i16;
            messageObject = null;
            i12 = i15;
            j12 = j17;
            z10 = false;
            i11 = 0;
            j11 = 0;
            j10 = 0;
        } else {
            r0Var2 = r0Var;
            mx mxVar3 = this.y0;
            if (mxVar3 == null || r0Var2 != (an0Var = mxVar3.U)) {
                j10 = 0;
                messageObject = null;
                j11 = 0;
                j12 = 0;
                z10 = false;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                Object J = an0Var.J(i9);
                z10 = this.y0.U.O(i9);
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
                        mx mxVar4 = this.y0;
                        if (mxVar4 != null) {
                            org.telegram.ui.Components.an0 an0Var2 = mxVar4.U;
                            an0Var2.f0.a(an0Var2.V);
                        }
                        i13 = id2;
                        j13 = dialogId;
                    } else {
                        j10 = 0;
                        if (J instanceof String) {
                            String str2 = (String) J;
                            mx mxVar5 = this.y0;
                            if (mxVar5 != null && !mxVar5.U.F.isEmpty()) {
                                this.T.r.setText(str2);
                                this.T.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                nj0 nj0Var = new nj0(getParentActivity(), this);
                                nj0Var.v(str2, true);
                                nj0Var.show();
                            }
                        } else if (J instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) J;
                            org.telegram.ui.Components.y4.v(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((J instanceof TLRPC.TL_forumTopic) && (ywVar = this.B3) != null && (ywVar.getFragment() instanceof we1)) {
                            j13 = -((we1) this.B3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) J).id;
                            messageObject2 = null;
                            i13 = 0;
                        }
                        messageObject2 = null;
                        j14 = 0;
                        j13 = 0;
                        i13 = 0;
                    }
                    if (j13 == j10 && this.actionBar.s()) {
                        if (this.actionBar.t("search_dialogs_action_mode") && i13 == 0 && !z10) {
                            M4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = j14;
                    i12 = 0;
                    i11 = i13;
                    messageObject = messageObject2;
                    i10 = 0;
                }
                messageObject2 = null;
                j13 = makeEncryptedDialogId;
                i13 = 0;
                j14 = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = j14;
                i12 = 0;
                i11 = i13;
                messageObject = messageObject2;
                i10 = 0;
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
                            mx mxVar6 = this.y0;
                            if (mxVar6 != null && r0Var2 == mxVar6.U) {
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
                    dy dyVar = new dy(bundle2);
                    dyVar.S2 = this;
                    dyVar.y2 = this.y2;
                    presentFragment(dyVar);
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
                we1 we1Var = new we1(bundle3);
                we1Var.H0 = this;
                presentFragment(we1Var);
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
            if (i11 != 0) {
                j15 = j11;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(-j12));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle4.putLong("migrated_to", j12);
                    j16 = -chat4.migrated_to.channel_id;
                    bundle4.putLong("chat_id", -j16);
                    if (i11 != 0) {
                        bundle4.putInt("message_id", i11);
                    } else if (z10) {
                        TLObject tLObject = this.T1;
                        if (tLObject != null) {
                            mx mxVar7 = this.y0;
                            if (mxVar7 != null) {
                                mxVar7.U.R(this.S1, tLObject);
                            }
                            this.T1 = null;
                        }
                    } else {
                        J3();
                    }
                    boolean z14 = LocaleController.isRTL && !this.f2 && (!AndroidUtilities.isTablet() || i10 == 0) && LiteMode.isEnabled(64) && this.T2 == j10;
                    bundle4.putInt("dialog_folder_id", i10);
                    bundle4.putInt("dialog_filter_id", i12);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j12) || !z14) && this.l2.dialogId == j12 && ((mxVar2 = this.y0) == null || r0Var2 != mxVar2.U))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.o0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (j3.r0.k(1, fragmentStack) instanceof qn)) {
                                ((qn) j3.r0.k(1, fragmentStack)).U9();
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
                    mxVar = this.y0;
                    if (mxVar != null && mxVar.u0) {
                        mxVar.Q(false);
                    }
                    if (j12 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.z0 == null) {
                            this.z0 = new org.telegram.ui.Components.wt0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.k90(bundle5, this.z0));
                        return;
                    }
                    if (this.j2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            qn qnVar = new qn(bundle4);
                            d4(qnVar, messageObject);
                            presentFragment(qnVar);
                            return;
                        }
                        return;
                    }
                    this.v3 = true;
                    if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j12));
                        TLRPC.Dialog dialog2 = getMessagesController().getDialog(j12);
                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                        boolean z15 = dialog2 != null && dialog2.view_forum_as_messages;
                        if (this.T2 == j10 || chat5 == null) {
                            z11 = z13;
                            i14 = 0;
                        } else {
                            z11 = z13;
                            i14 = nh.r0.b(this.currentAccount, -chat5.id);
                        }
                        if (i14 == 3) {
                            showDialog(new org.telegram.ui.Components.p70(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (i14 == 4) {
                            org.telegram.messenger.l0.p(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.oc.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z12 = chat5.monoforum) || chat5.forum) && j15 == j10)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new dy(bundle6));
                                return;
                            }
                            qn qnVar2 = new qn(bundle4);
                            if (j15 != j10) {
                                vf.c.a(qnVar2, MessagesStorage.TopicKey.of(j12, j15));
                            }
                            if (z11 && DialogObject.isUserDialog(j12) && getMessagesController().dialogs_dict.f(j12) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                qnVar2.x9 = greetingsSticker;
                                qnVar2.y9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                yw ywVar2 = this.B3;
                                if (ywVar2.a != null) {
                                    ywVar2.a();
                                }
                            }
                            d4(qnVar2, messageObject);
                            presentFragment(qnVar2);
                            return;
                        }
                        if (z12) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            qn qnVar3 = new qn(bundle4);
                            d4(qnVar3, messageObject);
                            presentFragment(qnVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            qn qnVar4 = new qn(bundle4);
                            vf.c.a(qnVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(qnVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.T2 != j10) {
                            if (!z15) {
                                presentFragment(new we1(bundle4));
                                return;
                            }
                            qn qnVar5 = new qn(bundle4);
                            d4(qnVar5, messageObject);
                            presentFragment(qnVar5);
                            return;
                        }
                        if (!z14) {
                            if (!z15) {
                                presentFragment(new we1(bundle4));
                                return;
                            }
                            qn qnVar6 = new qn(bundle4);
                            d4(qnVar6, messageObject);
                            presentFragment(qnVar6);
                            return;
                        }
                        if (this.f2) {
                            return;
                        }
                        if (z15) {
                            qn qnVar7 = new qn(bundle4);
                            d4(qnVar7, messageObject);
                            presentFragment(qnVar7);
                            return;
                        }
                        yw ywVar3 = this.B3;
                        fx fxVar = ywVar3.a;
                        if (fxVar == null || (-fxVar.a) != j12) {
                            yx yxVar = this.a0[0].a;
                            yxVar.l3 = 0.0f;
                            yxVar.m3 = yxVar.k3;
                            yxVar.n3 = yxVar.e3 != 0.0f;
                            fx fxVar2 = new fx(bundle4);
                            fxVar2.I0 = this;
                            final yw ywVar4 = this.B3;
                            org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = ywVar4.n;
                            if (!ywVar4.r) {
                                ywVar4.w = parentLayout;
                                fxVar2.onFragmentCreate();
                                fxVar2.setInPreviewMode(true);
                                fxVar2.setParentLayout(parentLayout);
                                View performCreateView = fxVar2.performCreateView(ywVar4.getContext());
                                fxVar2.onResume();
                                ywVar4.b = performCreateView;
                                ywVar4.addView(performCreateView);
                                final fx fxVar3 = ywVar4.a;
                                m0 m0Var = fxVar2.e;
                                ywVar4.c = m0Var;
                                ywVar4.addView(m0Var);
                                ywVar4.a = fxVar2;
                                h31.M = j10;
                                h31.M = -fxVar2.a;
                                if (fxVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.k actionBar = fxVar2.getActionBar();
                                    ywVar4.d = actionBar;
                                    ywVar4.addView(actionBar);
                                    ywVar4.d.Q0 = new ky0(ywVar4, 10);
                                }
                                if (fxVar3 != null) {
                                    final fx fxVar4 = ywVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.j jVar = ywVar4.x;
                                        if (jVar != null) {
                                            jVar.c();
                                        }
                                        fxVar4.onTransitionAnimationStart(true, false);
                                        ywVar4.A = fxVar3;
                                        ywVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.j jVar2 = new o1.j(new gb.a(0.0f));
                                        ywVar4.x = jVar2;
                                        jVar2.u = org.telegram.ui.Cells.j2.i(1000.0f, 400.0f, 1.0f);
                                        h31.f(fxVar3, fxVar4, 0.0f);
                                        ywVar4.x.b(new ad0(ywVar4, i18));
                                        ywVar4.x.a(new o1.f() { // from class: org.telegram.ui.f31
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z16, float f10, float f11) {
                                                h31 h31Var = ywVar4;
                                                if (h31Var.x == null) {
                                                    return;
                                                }
                                                h31Var.x = null;
                                                org.telegram.ui.ActionBar.o2 o2Var2 = fxVar4;
                                                o2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.o2 o2Var3 = fxVar3;
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
                                        ywVar4.x.f();
                                    } else {
                                        fxVar4.onTransitionAnimationStart(true, false);
                                        fxVar4.onTransitionAnimationEnd(true, false);
                                        h31.f(fxVar3, fxVar4, 1.0f);
                                        ywVar4.v = false;
                                        ywVar4.A = null;
                                        fxVar3.onPause();
                                        fxVar3.onFragmentDestroy();
                                        ywVar4.removeView(fxVar3.getFragmentView());
                                        ywVar4.removeView(fxVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!ywVar4.f) {
                                    ywVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        ywVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        ywVar4.e = 0.0f;
                                        ywVar4.e(true);
                                        ywVar4.g();
                                        fxVar2.onTransitionAnimationStart(true, false);
                                        ywVar4.h.addUpdateListener(new e31(ywVar4, 1));
                                        ywVar4.h.addListener(new org.telegram.ui.Components.su0(11, ywVar4, fxVar2));
                                        ywVar4.h.setDuration(250L);
                                        ywVar4.h.setInterpolator(org.telegram.ui.Components.gr.f);
                                        ywVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        ywVar4.h.start();
                                    } else {
                                        ywVar4.e(true);
                                        fxVar2.onTransitionAnimationStart(true, false);
                                        fxVar2.onTransitionAnimationEnd(true, false);
                                        ywVar4.e = 1.0f;
                                        ywVar4.g();
                                        ywVar4.d(false);
                                    }
                                }
                                fxVar2.setPreviewDelegate(new dl0(ywVar4, 16));
                                WeakHashMap weakHashMap = r0.j0.a;
                                r0.z.c(ywVar4);
                            }
                        } else {
                            ywVar3.a();
                        }
                        mx mxVar8 = this.y0;
                        if (mxVar8 != null) {
                            mxVar8.R();
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
            if (i11 != 0) {
            }
            if (LocaleController.isRTL) {
            }
            bundle4.putInt("dialog_folder_id", i10);
            bundle4.putInt("dialog_filter_id", i12);
            if (!AndroidUtilities.isTablet()) {
            }
            mxVar = this.y0;
            if (mxVar != null) {
                mxVar.Q(false);
            }
            if (j12 != getUserConfig().getClientUserId()) {
            }
            if (this.j2 != null) {
            }
        }
        j15 = j11;
        if (i11 != 0) {
        }
        if (LocaleController.isRTL) {
        }
        bundle4.putInt("dialog_folder_id", i10);
        bundle4.putInt("dialog_filter_id", i12);
        if (!AndroidUtilities.isTablet()) {
        }
        mxVar = this.y0;
        if (mxVar != null) {
        }
        if (j12 != getUserConfig().getClientUserId()) {
        }
        if (this.j2 != null) {
        }
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new dv(this, 2), 300L);
    }

    public final boolean o4(View view, int i9, float f10, org.telegram.ui.Components.vk0 vk0Var) {
        org.telegram.ui.Components.an0 an0Var;
        org.telegram.ui.Components.an0 an0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && vk0Var.j(i9) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.h2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.B3.c() && r2Var.R(f10)) {
                    return H4(r2Var);
                }
            }
            yw ywVar = this.B3;
            if (ywVar == null || !ywVar.c()) {
                mx mxVar = this.y0;
                if (mxVar != null && vk0Var == (an0Var2 = mxVar.U)) {
                    Object J = an0Var2.J(i9);
                    if (!this.y0.U.J) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, vf.c.i(chat, this.currentAccount, false));
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
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new d3.e(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.q7));
                        }
                        return true;
                    }
                }
                mx mxVar2 = this.y0;
                if (mxVar2 == null || vk0Var != (an0Var = mxVar2.U)) {
                    Object I = ((of.m) vk0Var).I(i9);
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
                                we1 we1Var = new we1(bundle);
                                we1Var.H0 = this;
                                presentFragment(we1Var);
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
                        n4(view, i9, vk0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.h6) || an0Var.O(i9)) ? 0L : ((org.telegram.ui.Cells.h6) view).getDialogId();
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
            org.telegram.ui.Components.x60 x60Var = this.H0;
            if (x60Var == null) {
                cw cwVar = this.v0;
                if (cwVar == null || !cwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.s()) {
                        if (!this.b.f) {
                            cw cwVar2 = this.v0;
                            if (cwVar2 != null && cwVar2.getVisibility() == 0 && !this.c3) {
                                cw cwVar3 = this.v0;
                                if (!cwVar3.K && !this.h3) {
                                    ArrayList arrayList = cwVar3.h;
                                    if (!arrayList.isEmpty() && cwVar3.H != ((org.telegram.ui.Components.sz) arrayList.get(0)).a) {
                                        if (z10) {
                                            cw cwVar4 = this.v0;
                                            ArrayList arrayList2 = cwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                cwVar4.f((org.telegram.ui.Components.sz) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            ow owVar = this.x1;
                            if (owVar == null || !owVar.s0()) {
                                vw vwVar = this.A0;
                                if (vwVar.K != 0 || vwVar.O.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                vwVar.h.x0(0);
                                return false;
                            }
                            if (z10) {
                                this.x1.l0(true);
                            }
                        } else if (z10) {
                            this.T.r.getText().clear();
                            this.U.b(false);
                            this.T.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        mx mxVar = this.y0;
                        if (mxVar != null && mxVar.getVisibility() == 0) {
                            this.y0.Q(false);
                        }
                        b4(true);
                        return false;
                    }
                } else if (z10) {
                    cwVar.setIsEditing(false);
                    I4(false);
                    return false;
                }
            } else if (z10) {
                x60Var.u();
                this.H0 = null;
                return false;
            }
        } else if (z10) {
            this.B3.a();
            mx mxVar2 = this.y0;
            if (mxVar2 != null) {
                mxVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        fh.l2 l2Var;
        cw cwVar;
        if (this.R1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.T1;
            if (tLObject != null) {
                mx mxVar = this.y0;
                if (mxVar != null) {
                    mxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
            }
            this.R1 = false;
        }
        if (!this.G && (cwVar = this.v0) != null && cwVar.getVisibility() == 0 && this.r.f) {
            int i9 = (int) (-this.J);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i9 != 0 && i9 != currentActionBarHeight && i9 >= currentActionBarHeight / 2) {
                this.a0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (l2Var = this.G0) != null && l2Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.n0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        kh.x3 x3Var;
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
        if (this.n0 && !this.o0 && (x3Var = this.l0) != null && this.K3) {
            this.o0 = true;
            this.n0 = false;
            x3Var.v();
        }
        AndroidUtilities.runOnUIThread(new uv(this, 3), 200L);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.x60 x60Var = this.H0;
        if (x60Var != null) {
            x60Var.u();
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
        ih.v6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ih.t5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
        if (this.N3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            qu quVar = this.N3;
            if (quVar.getParent() != null) {
                ((ViewGroup) quVar.getParent()).removeView(quVar);
            }
            this.N3 = null;
        }
        if (e4()) {
            ih.v6 storiesController2 = getMessagesController().getStoriesController();
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
        ow owVar = this.x1;
        if (owVar != null) {
            owVar.A0();
        }
        org.telegram.ui.Components.wp0 wp0Var = this.C2;
        if (wp0Var != null) {
            wp0Var.j();
        }
        org.telegram.ui.Components.p61 p61Var = this.D2;
        if (p61Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p61Var);
            this.D2 = null;
        }
        UndoView undoView = this.u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.k3.unlock();
        this.y2 = null;
        aa1 aa1Var = aa1.b;
        if (aa1Var != null) {
            aa1Var.dismiss();
            aa1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPanTranslationUpdate(float f10) {
        if (this.a0 == null) {
            return;
        }
        this.F0 = f10;
        ow owVar = this.x1;
        int i9 = 0;
        if (owVar == null || !owVar.s0()) {
            while (true) {
                cy[] cyVarArr = this.a0;
                if (i9 >= cyVarArr.length) {
                    break;
                }
                cyVarArr[i9].setTranslationY(f10);
                i9++;
            }
            if (!this.h2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.gc gcVar = this.j3;
                if (gcVar != null) {
                    gcVar.l();
                }
            }
            mx mxVar = this.y0;
            if (mxVar != null) {
                mxVar.setTranslationY(this.F0 + this.E0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            cy[] cyVarArr2 = this.a0;
            if (i9 >= cyVarArr2.length) {
                break;
            }
            cyVarArr2[i9].setTranslationY(0.0f);
            i9++;
        }
        if (!this.h2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.gc gcVar2 = this.j3;
            if (gcVar2 != null) {
                gcVar2.l();
            }
        }
        mx mxVar2 = this.y0;
        if (mxVar2 != null) {
            mxVar2.setTranslationY(this.E0);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.gc gcVar = this.O;
        if (gcVar != null) {
            gcVar.b();
            this.O = null;
        }
        yw ywVar = this.B3;
        if (ywVar != null) {
            ywVar.r = true;
            fx fxVar = ywVar.a;
            if (fxVar != null) {
                fxVar.onPause();
            }
        }
        org.telegram.ui.Components.x60 x60Var = this.H0;
        if (x60Var != null) {
            x60Var.u();
        }
        ow owVar = this.x1;
        if (owVar != null) {
            owVar.C0();
        }
        int i9 = 0;
        UndoView undoView = this.u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.a0 == null) {
            return;
        }
        while (true) {
            cy[] cyVarArr = this.a0;
            if (i9 >= cyVarArr.length) {
                return;
            }
            cyVarArr[i9].d.getClass();
            i9++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        int i10;
        if (i9 != 1) {
            if (i9 == 4) {
                for (int i11 : iArr) {
                    if (i11 != 0) {
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
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (iArr.length > i12) {
                String str = strArr[i12];
                str.getClass();
                i10 = 2;
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i12] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            qj0.m();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i12] == 0) {
                            ImageLoader.getInstance().checkMediaPaths();
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i12] == 0) {
                            AndroidUtilities.runOnUIThread(new uv(this, i10));
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
        dy dyVar;
        cy cyVar;
        lw lwVar;
        int i9;
        org.telegram.ui.Components.an0 an0Var;
        fh.l2 l2Var;
        super.onResume();
        vw vwVar = this.A0;
        if (vwVar != null) {
            ArrayList arrayList = vwVar.x;
            ih.v6 v6Var = vwVar.s;
            v6Var.l(v6Var.g);
            v6Var.l(v6Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y10 = v6Var.y(((ih.o) arrayList.get(i10)).c);
                if (y10 != null) {
                    v6Var.X(y10);
                }
            }
        }
        yw ywVar = this.B3;
        if (ywVar != null) {
            ywVar.r = false;
            fx fxVar = ywVar.a;
            if (fxVar != null) {
                fxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (l2Var = this.G0) != null && l2Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        if (this.a0 != null) {
            int i11 = 0;
            while (true) {
                cy[] cyVarArr = this.a0;
                if (i11 >= cyVarArr.length) {
                    break;
                }
                cyVarArr[i11].d.l();
                i11++;
            }
        }
        ow owVar = this.x1;
        if (owVar != null) {
            owVar.D0();
        }
        long j10 = 0;
        if (!this.h2 && this.R2 == 0 && this.T2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        mx mxVar = this.y0;
        if (mxVar != null && (an0Var = mxVar.U) != null) {
            an0Var.l();
        }
        boolean z10 = this.p2 || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.R2 == 0 && this.T2 == 0 && this.Y1 && !this.h2 && (i9 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Y1 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i9 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i9 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                dyVar = this;
                org.telegram.messenger.n1 n1Var = new org.telegram.messenger.n1(dyVar, z13, z11, z12, parentActivity);
                if (dyVar.p2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(n1Var, j10);
            } else {
                dyVar = this;
            }
        } else {
            dyVar = this;
            if (!dyVar.h2 && dyVar.R2 == 0 && dyVar.T2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.f6.L5), null);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.if0(21));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (dyVar.R2 == 0 && dyVar.T2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.f6.L5), null);
                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.if0(22));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        J4();
        if (dyVar.a0 != null) {
            int i12 = 0;
            while (true) {
                cy[] cyVarArr2 = dyVar.a0;
                if (i12 >= cyVarArr2.length) {
                    break;
                }
                cy cyVar2 = cyVarArr2[i12];
                if (cyVar2.s == 0 && cyVar2.v == 2 && cyVar2.c.L0() == 0 && Z3()) {
                    dyVar.a0[i12].c.h1(1, (int) dyVar.J);
                }
                if (i12 == 0) {
                    dyVar.a0[i12].d.getClass();
                } else {
                    dyVar.a0[i12].d.getClass();
                }
                i12++;
            }
        }
        L4();
        setBulletinDelegate(new x8(this, 4));
        if (dyVar.l3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), dyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            aa1.n(this);
        }
        B3();
        if (dyVar.v0 == null || (cyVar = dyVar.a0[0]) == null || (lwVar = cyVar.d) == null) {
            return;
        }
        int i13 = lwVar.h;
        if (i13 == 7 || i13 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i13 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                dyVar.v0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onSlideProgress(boolean z10, float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.V3 && this.W3 == null) {
            F4(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        fh.l2 l2Var;
        dy dyVar;
        yw ywVar = this.B3;
        if (ywVar == null || !ywVar.c()) {
            if (z10 && (l2Var = this.G0) != null && l2Var.getVisibility() == 0) {
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
        if (!z10 && (dyVar = this.S2) != null) {
            dyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        yw ywVar = this.B3;
        if (ywVar == null || !ywVar.c()) {
            fh.l2 l2Var = this.G0;
            if (l2Var != null && l2Var.getVisibility() == 0) {
                if (z10) {
                    this.G0.setAlpha(1.0f - f10);
                } else {
                    this.G0.setAlpha(f10);
                }
            }
        } else {
            this.B3.getFragment().onTransitionAnimationProgress(z10, f10);
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i9;
        int i10 = this.N0;
        if (i10 == 15 || i10 == 16 || this.d2 != null || !this.o2) {
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
            int i11 = this.P0;
            if (i11 == 3) {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i11 != 0) {
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
        if (!this.m2 && ChatObject.isCanWriteToChannel(j11, this.currentAccount) && (i9 = this.P0) != 2 && i9 != 3) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.a.N = LocaleController.getString(R.string.SendMessageTitle);
        int i12 = this.P0;
        if (i12 == 3) {
            alertDialog$Builder2.a.P = LocaleController.getString(R.string.TodoCantForward);
        } else if (i12 == 2) {
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
        for (int i9 = 0; i9 < 4; i9++) {
            if (UserConfig.getInstance(i9).isClientActivated()) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(7));
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(getThemedColor(org.telegram.ui.ActionBar.f6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                z8Var.r(currentUser);
                org.telegram.ui.Components.tf0 tf0Var = new org.telegram.ui.Components.tf0(this, getParentActivity(), z10);
                linearLayout.addView(tf0Var, g7.e6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getParentActivity());
                if (z10) {
                    o9Var.setScaleX(0.833f);
                    o9Var.setScaleY(0.833f);
                }
                o9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                o9Var.getImageReceiver().setCurrentAccount(intValue);
                o9Var.e(currentUser, z8Var);
                tf0Var.addView(o9Var, g7.e6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, g7.e6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new fh.a3(this, intValue, H, 14));
                H.r(linearLayout, g7.e6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
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
            int i9 = 0;
            while (true) {
                cy[] cyVarArr = this.a0;
                if (i9 >= cyVarArr.length) {
                    break;
                }
                cyVarArr[i9].d.getClass();
                i9++;
            }
        }
        kh.x3 x3Var = this.l0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        kh.x3 x3Var2 = this.m0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.gc.e();
        return presentFragment;
    }

    public final void q3(boolean z10) {
        oh.i iVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.bs bsVar = this.F1;
        if (bsVar == null || (iVar = this.M1) == null || (chatFull = this.V2) == null) {
            return;
        }
        bsVar.i(iVar, (this.T2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.M1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.V2.requests_pending, new Object[0]));
    }

    public final void q4(int i9, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i9 == 103) {
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

    public final void r3(cy cyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i9;
        int L0 = cyVar.c.L0();
        int N0 = cyVar.c.N0();
        if (this.c3 || this.h3) {
            return;
        }
        cw cwVar = this.v0;
        if (cwVar != null && cwVar.getVisibility() == 0 && this.v0.K) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            f2.q1 K = cyVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.X1 = z14;
            if (z14) {
                c4(false);
            }
        } else {
            this.X1 = false;
        }
        int i10 = cyVar.s;
        if (i10 == 7 || i10 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i11 = cyVar.h;
            if (i11 >= 0 && i11 < dialogFilters.size() && (dialogFilters.get(cyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, cyVar.s, 1, this.O1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                    z10 = z15;
                    z11 = false;
                } else {
                    z10 = z15;
                    z11 = true;
                }
                if ((abs > 0 || N0 < R3(this.currentAccount, cyVar.s, this.R2, this.O1).size() - 10) && (abs != 0 || (!((i9 = cyVar.s) == 7 || i9 == 8) || getMessagesController().isDialogsEndReached(this.R2)))) {
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
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wv
                        @Override // java.lang.Runnable
                        public final void run() {
                            dy dyVar = dy.this;
                            if (z12) {
                                dyVar.getMessagesController().loadDialogs(dyVar.R2, -1, 100, z13);
                            }
                            if (z11) {
                                dyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                            } else {
                                dyVar.getClass();
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wv
            @Override // java.lang.Runnable
            public final void run() {
                dy dyVar = dy.this;
                if (z12) {
                    dyVar.getMessagesController().loadDialogs(dyVar.R2, -1, 100, z13);
                }
                if (z11) {
                    dyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                } else {
                    dyVar.getClass();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    public final void r4(ArrayList arrayList, int i9, boolean z10, boolean z11, HashSet hashSet) {
        boolean z12;
        int i10;
        int i11;
        HashSet hashSet2;
        ArrayList arrayList2;
        int i12;
        long j10;
        int i13;
        int i14;
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        int i15;
        int i16;
        MessagesController.DialogFilter dialogFilter2;
        MessagesController.DialogFilter dialogFilter3;
        dy dyVar;
        int i17;
        boolean z13;
        boolean z14;
        int i18;
        org.telegram.ui.ActionBar.f3 f3Var;
        TLRPC.User tL_userEmpty;
        boolean z15;
        TLRPC.User user2;
        TLRPC.User user3;
        CharSequence string;
        dy dyVar2 = this;
        int i19 = i9;
        if (dyVar2.getParentActivity() == null) {
            return;
        }
        ?? r72 = 0;
        int i20 = dyVar2.a0[0].s;
        int i21 = 7;
        boolean z16 = (i20 == 7 || i20 == 8) && (!dyVar2.actionBar.s() || dyVar2.actionBar.t(null));
        MessagesController.DialogFilter dialogFilter4 = z16 ? dyVar2.getMessagesController().selectedDialogFilter[dyVar2.a0[0].s == 8 ? (char) 1 : (char) 0] : null;
        int size = arrayList.size();
        if (i19 == 105 || i19 == 107) {
            ArrayList<Long> arrayList3 = new ArrayList<>(arrayList);
            dyVar2.getMessagesController().addDialogToFolder(arrayList3, dyVar2.O2 == 0 ? 1 : 0, -1, null, 0L);
            if (dyVar2.O2 == 0) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                z12 = false;
                boolean z17 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                if (z17) {
                    i10 = 1;
                } else {
                    i10 = 1;
                    globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                }
                int i22 = z17 ? arrayList3.size() > i10 ? 4 : 2 : arrayList3.size() > i10 ? 5 : 3;
                UndoView Y3 = dyVar2.Y3();
                if (Y3 != null) {
                    Y3.l(0L, i22, null, new org.telegram.ui.Components.p61(13, dyVar2, arrayList3));
                }
            } else {
                z12 = false;
                ArrayList<TLRPC.Dialog> dialogs = dyVar2.getMessagesController().getDialogs(dyVar2.R2);
                if (dyVar2.a0 != null && dialogs.isEmpty() && !dyVar2.G) {
                    dyVar2.a0[0].a.setEmptyView(null);
                    dyVar2.a0[0].w.setVisibility(4);
                    dyVar2.finishFragment();
                }
            }
            dyVar2.b4(z12);
            return;
        }
        if ((i19 == 100 || i19 == 108) && dyVar2.J2 != 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = dyVar2.getMessagesController().getDialogs(dyVar2.R2);
            int size2 = dialogs2.size();
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i23 < size2) {
                TLRPC.Dialog dialog = dialogs2.get(i23);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!dyVar2.g4(dialog)) {
                        i12 = size2;
                        if (!dyVar2.getMessagesController().isPromoDialog(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i12 = size2;
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            i25++;
                        } else {
                            i24++;
                        }
                    }
                } else {
                    i12 = size2;
                }
                i23++;
                size2 = i12;
            }
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                Long l10 = (Long) arrayList.get(i29);
                long longValue = l10.longValue();
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) dyVar2.getMessagesController().dialogs_dict.f(longValue);
                if (dialog2 != null && !dyVar2.g4(dialog2)) {
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
                i11 = 100 - dialogFilter4.alwaysShow.size();
            } else if (dyVar2.R2 == 0 && dialogFilter4 == null) {
                i11 = dyVar2.getUserConfig().isPremium() ? dyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : dyVar2.getMessagesController().dialogFiltersPinnedLimitDefault;
            } else {
                i11 = UserConfig.getInstance(dyVar2.currentAccount).isPremium() ? dyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium : dyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
            }
            if (i27 + i25 > i11 || (i26 + i24) - i28 > i11) {
                if (dyVar2.R2 == 0 && dialogFilter4 == null) {
                    showDialog(new zf.j0(0, dyVar2.currentAccount, dyVar2.getParentActivity(), this, null));
                    return;
                } else {
                    org.telegram.ui.Components.y4.u0(dyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", i11, new Object[0])), null);
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
                boolean z18 = MessagesController.getInstance(dyVar2.currentAccount).canRevokePmInbox;
                long j11 = MessagesController.getInstance(dyVar2.currentAccount).revokeTimePmLimit;
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
                                TLRPC.EncryptedChat encryptedChat2 = dyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                user2 = encryptedChat2 != null ? dyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                            } else {
                                user2 = dyVar2.getMessagesController().getUser(l11);
                            }
                            if (user2 != null) {
                                ArrayList arrayList4 = (ArrayList) MessagesController.getInstance(dyVar2.currentAccount).dialogMessage.f(user2.id);
                                boolean z19 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((MessageObject) arrayList4.get(0)).messageOwner == null || (!(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (!user2.bot && !UserObject.isDeleted(user2) && user2.id != dyVar2.getUserConfig().getClientUserId() && !z19) {
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
                int i31 = dyVar2.M2;
                bg.d0 d0Var = new bg.d0(dyVar2, arrayList2, i19, hashSet3);
                org.telegram.ui.ActionBar.b6 b6Var = dyVar2.resourceProvider;
                Pattern pattern = org.telegram.ui.Components.y4.a;
                int currentAccount = dyVar2.getCurrentAccount();
                Activity parentActivity = dyVar2.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, b6Var);
                UserConfig.getInstance(currentAccount).getClientUserId();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                boolean[] zArr = new boolean[1];
                TextView textView = new TextView(parentActivity);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                org.telegram.ui.Components.f3 f3Var2 = new org.telegram.ui.Components.f3(parentActivity, z1VarArr);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.C = 6;
                alertDialog$Builder.n(f3Var2);
                TextView textView2 = new TextView(parentActivity);
                boolean z21 = z20;
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setLines(1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                if (z21) {
                    if (z15) {
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, b6Var);
                        z1VarArr[0] = z1Var;
                        z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                        z1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                        z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        f3Var2.addView(z1VarArr[0], g7.e6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        z1VarArr[0].setOnClickListener(new org.telegram.ui.Components.s0(2, zArr));
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
                f3Var2.addView(textView2, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                f3Var2.addView(textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                alertDialog$Builder.k(z21 ? LocaleController.getString("Delete", R.string.Delete) : i31 != 0 ? LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache) : LocaleController.getString("ClearHistory", R.string.ClearHistory), new org.telegram.ui.Components.g1(5, d0Var, zArr));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                dyVar2.showDialog(c2Var);
                TextView textView3 = (TextView) c2Var.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                return;
            }
            if (i19 == 106 && z10) {
                if (size == 1) {
                    Long l12 = (Long) arrayList2.get(0);
                    l12.getClass();
                    user3 = dyVar2.getMessagesController().getUser(l12);
                } else {
                    user3 = null;
                }
                boolean z22 = dyVar2.N2 != 0;
                yr yrVar = new yr(i21, dyVar2, arrayList2);
                Pattern pattern2 = org.telegram.ui.Components.y4.a;
                if (dyVar2.getParentActivity() != null) {
                    if (size == 1 && user3 == null) {
                        return;
                    }
                    Activity parentActivity2 = dyVar2.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                    org.telegram.ui.Cells.z1[] z1VarArr2 = new org.telegram.ui.Cells.z1[2];
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
                            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(parentActivity2, 1);
                            z1VarArr2[i33] = z1Var2;
                            z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(r72));
                            if (i33 == 0) {
                                z1VarArr2[i33].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                            } else {
                                z1VarArr2[i33].e(LocaleController.getString(size == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                            }
                            z1VarArr2[i33].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r72, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r72);
                            linearLayout.addView(z1VarArr2[i33], g7.e6.n(-1, 48));
                            z1VarArr2[i33].setOnClickListener(new gh.z0(zArr2, i33, 6));
                        }
                        i33++;
                        i32 = 2;
                        r72 = 0;
                    }
                    alertDialog$Builder2.k(string, new org.telegram.ui.Components.g1(9, yrVar, zArr2));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    dyVar2.showDialog(c2Var2);
                    TextView textView4 = (TextView) c2Var2.d(-1);
                    if (textView4 != null) {
                        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            if (z10) {
                org.telegram.ui.Components.y4.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new rv(dyVar2, arrayList, i19, z11, hashSet));
                return;
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
            int size4 = arrayList2.size();
            int i34 = 0;
            while (i34 < size4) {
                Object obj2 = arrayList2.get(i34);
                i34++;
                dyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
            }
        }
        int i35 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (dialogFilter4 != null && ((i19 == 100 || i19 == 108) && dyVar2.J2 != 0)) {
            int size5 = dialogFilter4.pinnedDialogs.size();
            for (int i36 = 0; i36 < size5; i36++) {
                i35 = Math.min(i35, dialogFilter4.pinnedDialogs.valueAt(i36));
            }
            i35 -= dyVar2.J2;
        }
        int i37 = i35;
        int i38 = 0;
        int i39 = 0;
        while (i38 < size) {
            Long l13 = (Long) arrayList2.get(i38);
            long longValue2 = l13.longValue();
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) dyVar2.getMessagesController().dialogs_dict.f(longValue2);
            if (dialog3 == null) {
                i15 = i19;
                i16 = i37;
                i14 = i38;
                dialogFilter2 = dialogFilter4;
            } else {
                if (DialogObject.isEncryptedDialog(longValue2)) {
                    encryptedChat = org.telegram.messenger.l0.l(dyVar2.getMessagesController(), longValue2);
                    if (encryptedChat != null) {
                        i14 = i38;
                        dialogFilter = dialogFilter4;
                        tL_userEmpty = dyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                    } else {
                        i14 = i38;
                        dialogFilter = dialogFilter4;
                        tL_userEmpty = new TLRPC.TL_userEmpty();
                    }
                    user = tL_userEmpty;
                    chat = null;
                } else {
                    i14 = i38;
                    dialogFilter = dialogFilter4;
                    if (DialogObject.isUserDialog(longValue2)) {
                        user = dyVar2.getMessagesController().getUser(l13);
                        chat = null;
                    } else {
                        chat = dyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                        user = null;
                    }
                    encryptedChat = null;
                }
                if (chat != null || user != null) {
                    boolean z23 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                    if (i19 == 100 || i19 == 108) {
                        i15 = i19;
                        if (dyVar2.J2 != 0) {
                            if (!dyVar2.g4(dialog3)) {
                                i39++;
                                i16 = i37;
                                dialogFilter2 = dialogFilter;
                                dyVar2.s4(longValue2, true, dialogFilter2, i16, size == 1);
                                if (dialogFilter2 != null) {
                                    int i40 = i16 + 1;
                                    if (encryptedChat != null) {
                                        if (!dialogFilter2.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                            dialogFilter2.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                        }
                                    } else if (!dialogFilter2.alwaysShow.contains(Long.valueOf(dialog3.id))) {
                                        dialogFilter2.alwaysShow.add(Long.valueOf(dialog3.id));
                                    }
                                    i16 = i40;
                                }
                            }
                            i16 = i37;
                            dialogFilter2 = dialogFilter;
                        } else {
                            i16 = i37;
                            dialogFilter2 = dialogFilter;
                            if (dyVar2.g4(dialog3)) {
                                i39++;
                                dyVar2.s4(longValue2, false, dialogFilter2, i16, size == 1);
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                i38 = i14 + 1;
                                i37 = i16;
                                i19 = i15;
                                r16 = 3;
                            }
                        }
                        dialogFilter3 = dialogFilter2;
                        dialogFilter4 = dialogFilter3;
                        i38 = i14 + 1;
                        i37 = i16;
                        i19 = i15;
                        r16 = 3;
                    } else if (i19 != 101) {
                        if (i19 == 102) {
                            dyVar = dyVar2;
                            i17 = 1;
                        } else if (i19 == 103) {
                            dyVar = dyVar2;
                            i17 = 1;
                        } else if (i19 != 104) {
                            i15 = i19;
                            i16 = i37;
                            dialogFilter2 = dialogFilter;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i14 + 1;
                            i37 = i16;
                            i19 = i15;
                            r16 = 3;
                        } else {
                            if (size == 1 && dyVar2.K2 == 1) {
                                dy dyVar3 = dyVar2;
                                dyVar3.showDialog(org.telegram.ui.Components.y4.F(longValue2, 0L, dyVar3, null), new ev(dyVar3, 2));
                                return;
                            }
                            dyVar = dyVar2;
                            if (dyVar.L2 != 0) {
                                if (dyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                    dyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                }
                                i16 = i37;
                                dyVar2 = dyVar;
                                dialogFilter2 = dialogFilter;
                                i15 = i19;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                i38 = i14 + 1;
                                i37 = i16;
                                i19 = i15;
                                r16 = 3;
                            } else {
                                if (z11) {
                                    Pattern pattern3 = org.telegram.ui.Components.y4.a;
                                    if (dyVar.getParentActivity() == null) {
                                        f3Var = null;
                                        i18 = 3;
                                    } else {
                                        org.telegram.ui.ActionBar.f3 f3Var3 = new org.telegram.ui.ActionBar.f3(dyVar.getParentActivity(), null, false, false);
                                        f3Var3.fixNavigationBar();
                                        f3Var3.title = LocaleController.getString(R.string.Notifications);
                                        f3Var3.bigTitle = true;
                                        String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                        String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                        String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                        String string2 = LocaleController.getString(R.string.MuteDisable);
                                        CharSequence[] charSequenceArr = new CharSequence[4];
                                        charSequenceArr[0] = formatString;
                                        charSequenceArr[1] = formatString2;
                                        charSequenceArr[2] = formatString3;
                                        charSequenceArr[r16] = string2;
                                        i18 = 3;
                                        v vVar = new v(i18, arrayList2, dyVar);
                                        f3Var3.items = charSequenceArr;
                                        f3Var3.onClickListener = vVar;
                                        f3Var = f3Var3;
                                    }
                                    dyVar.showDialog(f3Var, new ev(dyVar, i18));
                                    return;
                                }
                                if (!dyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                    dyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                }
                                i16 = i37;
                                dyVar2 = dyVar;
                                dialogFilter2 = dialogFilter;
                                i15 = i19;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                i38 = i14 + 1;
                                i37 = i16;
                                i19 = i15;
                                r16 = 3;
                            }
                        }
                        if (size == i17) {
                            if (i19 != 102 || !dyVar.Q2) {
                                org.telegram.ui.Components.y4.s(this, i19 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.id), i19 == 102, false, false, new nh.l0(dyVar, i19, chat, longValue2, z23));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dyVar.getParentActivity());
                            String string3 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                            c2Var3.N = string3;
                            c2Var3.P = LocaleController.getString(R.string.PsaHideChatAlertText);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new jv(dyVar, 11));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            dyVar.showDialog(c2Var3);
                            return;
                        }
                        boolean z24 = z23;
                        TLRPC.Chat chat2 = chat;
                        if (dyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                            dyVar.getMessagesController().hidePromoDialog();
                            i16 = i37;
                            dyVar2 = dyVar;
                            dialogFilter2 = dialogFilter;
                            i15 = i19;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i14 + 1;
                            i37 = i16;
                            i19 = i15;
                            r16 = 3;
                        } else if (i19 != 103 || dyVar.M2 == 0) {
                            if (hashSet2 == null || !hashSet2.contains(l13)) {
                                z13 = z24;
                                z14 = false;
                            } else {
                                z13 = z24;
                                z14 = true;
                            }
                            dyVar2 = dyVar;
                            dyVar2.q4(i19, longValue2, chat2, z13, z14);
                            i15 = i19;
                            i16 = i37;
                            dialogFilter2 = dialogFilter;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i14 + 1;
                            i37 = i16;
                            i19 = i15;
                            r16 = 3;
                        } else {
                            dyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                            i16 = i37;
                            dyVar2 = dyVar;
                            dialogFilter2 = dialogFilter;
                            i15 = i19;
                            dialogFilter3 = dialogFilter2;
                            dialogFilter4 = dialogFilter3;
                            i38 = i14 + 1;
                            i37 = i16;
                            i19 = i15;
                            r16 = 3;
                        }
                    } else if (dyVar2.I2 != 0) {
                        dyVar2.j4(longValue2);
                    } else {
                        dyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                    }
                }
                i15 = i19;
                i16 = i37;
                dialogFilter2 = dialogFilter;
            }
            dialogFilter3 = dialogFilter2;
            dialogFilter4 = dialogFilter3;
            i38 = i14 + 1;
            i37 = i16;
            i19 = i15;
            r16 = 3;
        }
        int i41 = i19;
        MessagesController.DialogFilter dialogFilter5 = dialogFilter4;
        if (i41 == 104 && (size != 1 || dyVar2.K2 != 1)) {
            org.telegram.ui.Components.oc.A(dyVar2, dyVar2.L2 == 0, null).j();
        }
        int i42 = 108;
        if (i41 == 100 || i41 == 108) {
            if (dialogFilter5 != null) {
                dy dyVar4 = dyVar2;
                n00.s0(dialogFilter5, dialogFilter5.flags, dialogFilter5.name, dialogFilter5.entities, dialogFilter5.title_noanimate, dialogFilter5.color, dialogFilter5.alwaysShow, dialogFilter5.neverShow, dialogFilter5.pinnedDialogs, false, false, true, true, false, dyVar4, null);
                dyVar2 = dyVar4;
                j10 = 0;
            } else {
                j10 = 0;
                dyVar2.getMessagesController().reorderPinnedDialogs(dyVar2.R2, null, 0L);
            }
            UndoView Y32 = dyVar2.Y3();
            if (dyVar2.l3 && Y32 != null) {
                Y32.m(j10, Integer.valueOf(i39), dyVar2.J2 != 0 ? 78 : 79);
            }
            i13 = i9;
            i42 = 108;
        } else {
            i13 = i41;
        }
        dyVar2.b4((i13 == i42 || i13 == 100 || i13 == 102) ? false : true);
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
        int i9 = 0;
        while (true) {
            cy[] cyVarArr = this.a0;
            if (i9 >= cyVarArr.length) {
                return;
            }
            cy cyVar = cyVarArr[i9];
            if (cyVar != null) {
                yx yxVar = cyVar.a;
                yxVar.setPadding(0, yxVar.U2, 0, n32);
            }
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s4(long j10, boolean z10, MessagesController.DialogFilter dialogFilter, int i9, boolean z11) {
        int i10;
        boolean z12;
        boolean pinDialog;
        boolean z13;
        int i11 = (this.a0[0].s == 0 && Z3() && this.a0[0].v == 2) ? 1 : 0;
        int L0 = this.a0[0].c.L0();
        if (dialogFilter != null) {
            int i12 = dialogFilter.pinnedDialogs.get(j10, TLObject.FLAG_31);
            if (!z10 && i12 == Integer.MIN_VALUE) {
                return;
            }
        }
        this.u3 = z10 ? 4 : 5;
        int i13 = -1;
        if (L0 > i11 || !z11) {
            i10 = -1;
            z12 = true;
        } else {
            A4(true, true);
            o3();
            if (this.N1 != null) {
                for (int i14 = 0; i14 < this.N1.size(); i14++) {
                    if (((TLRPC.Dialog) this.N1.get(i14)).id == j10) {
                        i10 = i14;
                        break;
                    }
                }
            }
            i10 = -1;
            z12 = false;
        }
        if (dialogFilter != null) {
            if (z10) {
                dialogFilter.pinnedDialogs.put(j10, i9);
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
                int i15 = 0;
                while (true) {
                    if (i15 >= R3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) R3.get(i15)).id == j10) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
        }
        if (z12) {
            return;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.N1;
            if (arrayList != null && i13 >= 0 && i10 != i13) {
                arrayList.add(i13, (TLRPC.Dialog) arrayList.remove(i10));
                this.a0[0].x.D();
                this.a0[0].q(true);
                cy cyVar = this.a0[0];
                cyVar.c.h1((cyVar.s == 0 && Z3() && this.a0[0].v == 2) ? 1 : 0, (int) this.J);
            } else if (i13 >= 0 && i10 == i13) {
                AndroidUtilities.runOnUIThread(new dv(this, 23), 200L);
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
        vw vwVar = this.A0;
        if (vwVar != null) {
            if (!this.C0 || z10) {
                vwVar.setVisibility(8);
            } else {
                vwVar.setVisibility(0);
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
    public final void setTitleOverlayText(String str, int i9, Runnable runnable) {
        ax axVar;
        org.telegram.ui.Components.i5 i5Var;
        super.setTitleOverlayText(str, i9, runnable);
        if (this.actionBar != null && (axVar = this.I0) != null && (axVar.getContentView() instanceof b61)) {
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            b61 b61Var = (b61) this.I0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                i5Var = this.z3;
            }
            i5Var = null;
            b61Var.y(i5Var, titleTextView);
        }
        vw vwVar = this.A0;
        if (vwVar != null) {
            org.telegram.ui.Components.j6 j6Var = vwVar.P;
            vwVar.Q.a(i9 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                vwVar.c0 = true;
                if (vwVar.d0 != i9) {
                    vwVar.d0 = i9;
                    j6Var.c(LocaleController.getString(str, i9), !LocaleController.isRTL, true);
                }
            } else {
                vwVar.c0 = false;
                vwVar.d0 = 0;
                j6Var.c(vwVar.b0, !LocaleController.isRTL, true);
            }
            vwVar.a.a(vwVar.c0, true);
            vwVar.H0.q(j6Var);
        }
    }

    public final void t3() {
        pg.f fVar = this.u1;
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
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
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
        cy cyVar;
        float S3 = S3(true);
        cw cwVar = this.v0;
        if (cwVar != null) {
            boolean z10 = cwVar.getAlpha() != S3;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.v0.setAlpha(S3);
            this.v0.setScaleX(lerp);
            this.v0.setScaleY(lerp);
            this.v0.setVisibility(S3 > 0.0f ? 0 : 8);
            if (z10 && (cyVar = this.a0[0]) != null) {
                cyVar.a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(cy cyVar) {
        int i9;
        if (cyVar.getVisibility() != 0) {
            return;
        }
        int i10 = cyVar.d.v;
        if (cyVar.s == 0 && Z3() && cyVar.a.getChildCount() == 0 && cyVar.v == 2) {
            ((f2.m0) cyVar.a.getLayoutManager()).h1(1, (int) this.J);
        }
        cyVar.d.getClass();
        cyVar.d.U();
        int h = cyVar.d.h();
        if (h == 1 && i10 == 1 && cyVar.d.j(0) == 5) {
            cyVar.q(true);
        } else {
            cyVar.q(false);
            if (h > i10 && (i9 = this.N0) != 11 && i9 != 12 && i9 != 13) {
                cyVar.y.b(i10);
            }
        }
        try {
            cyVar.a.setEmptyView((this.R2 == 0 && this.T2 == 0) ? cyVar.w : null);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        r3(cyVar);
    }

    public final void v3() {
        float f10 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f10);
        org.telegram.ui.Components.wo0 wo0Var = this.y1;
        if (wo0Var != null) {
            wo0Var.setScaleX(lerp);
            this.y1.setScaleY(lerp);
            this.y1.setAlpha(f10);
            this.y1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        pg.f fVar = this.u1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            this.u1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.u1.getFadeView().setAlpha(f10);
            this.u1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void v4() {
        boolean z10;
        if (this.J == 0.0f || (z10 = this.G)) {
            return;
        }
        float f10 = z10 ? -U3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.C3, f10));
        animatorSet.setInterpolator(org.telegram.ui.Components.gr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        float f10 = 1.0f - this.b.e;
        float V3 = 1.0f - V3();
        org.telegram.ui.Components.j10.d(this.actionBar.getBackButton(), Math.max(this.p3, f10 * V3 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w4(int i9) {
        org.telegram.ui.Components.sz szVar;
        if (this.v0 == null) {
            V4(true, true);
            if (this.v0 == null) {
                return;
            }
        }
        int tabsCount = this.v0.getTabsCount() - 1;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 0;
        while (true) {
            if (i10 >= dialogFilters.size()) {
                break;
            }
            if (dialogFilters.get(i10).id == i9) {
                tabsCount = i10;
                break;
            }
            i10++;
        }
        cw cwVar = this.v0;
        if (tabsCount < 0) {
            cwVar.getClass();
        } else if (tabsCount < cwVar.getTabsCount()) {
            szVar = (org.telegram.ui.Components.sz) cwVar.h.get(tabsCount);
            if (szVar != null) {
                cw cwVar2 = this.v0;
                ArrayList arrayList = cwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                cwVar2.f((org.telegram.ui.Components.sz) j3.r0.j(1, arrayList), arrayList.size() - 1);
                return;
            }
            cy[] cyVarArr = this.a0;
            if (cyVarArr == null || cyVarArr.length <= 0 || cyVarArr[0].h != szVar.a) {
                this.v0.f(szVar, tabsCount);
                return;
            }
            return;
        }
        szVar = null;
        if (szVar != null) {
        }
    }

    public final void x3() {
        org.telegram.ui.Components.j10.d(this.c0, e2.c.C(this.e0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void x4(boolean z10, boolean z11) {
        yw ywVar = this.B3;
        if (ywVar == null || !ywVar.c()) {
            int i9 = (this.a0[0].s == 0 && Z3() && this.a0[0].v == 2) ? 1 : 0;
            int i10 = (!this.G || z11 || this.A0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.a0[0].c.h1(i9, i10);
                v4();
            } else {
                c2.y yVar = this.a0[0].r;
                yVar.b = 1;
                yVar.c(i9, i10, false, false);
                v4();
            }
        }
    }

    @Override // org.telegram.ui.mg0
    public final ng.d y() {
        return this.j4;
    }

    public final void y3() {
        org.telegram.ui.Components.j10.d(this.b0, e2.c.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        sx sxVar = this.T;
        if (sxVar != null) {
            sxVar.r.setText(str);
            this.T.r.setSelection(str.length());
        }
    }

    public final void z3() {
        org.telegram.ui.Components.j10.d(this.f0, e2.c.C(this.N0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - V3(), 1.0f - this.c.e));
        vw vwVar = this.A0;
        if (vwVar != null) {
            vwVar.invalidate();
        }
    }

    public final void z4(float f10) {
        this.Y = f10;
        for (cy cyVar : this.a0) {
            yx yxVar = cyVar.a;
            for (int i9 = 0; i9 < yxVar.getChildCount(); i9++) {
                View childAt = yxVar.getChildAt(i9);
                if (childAt != null && RecyclerView.R(childAt) >= cyVar.d.f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }
}
