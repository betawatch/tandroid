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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class oy extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, zf.b, xd.b, ug0 {
    public static boolean u4;
    public static final boolean[] v4 = new boolean[4];
    public static final org.telegram.ui.Components.kr0 w4 = new org.telegram.ui.Components.kr0(3);
    public static float x4;
    public org.telegram.ui.Components.qu0 A0;
    public org.telegram.ui.ActionBar.w0 A1;
    public ArrayList A2;
    public org.telegram.ui.Components.j5 A3;
    public boolean B;
    public gx B0;
    public final TextPaint B1;
    public String B2;
    public org.telegram.ui.Cells.o B3;
    public boolean C;
    public org.telegram.ui.Components.hs C0;
    public yw C1;
    public CharSequence C2;
    public jx C3;
    public TLRPC.RequestPeerType D;
    public boolean D0;
    public FrameLayout D1;
    public org.telegram.ui.Components.qq0 D2;
    public final xw D3;
    public long E;
    public float E0;
    public yw E1;
    public org.telegram.ui.Components.k41 E2;
    public final xw E3;
    public ValueAnimator F;
    public float F0;
    public FrameLayout F1;
    public final ArrayList F2;
    public sg0 F3;
    public ValueAnimator G;
    public float G0;
    public org.telegram.ui.Components.js G1;
    public boolean G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public eg.h0 H0;
    public org.telegram.ui.Components.is H1;
    public int H2;
    public NotificationCenter.ObserversGroup H3;
    public boolean I;
    public org.telegram.ui.Components.o70 I0;
    public org.telegram.ui.Cells.m I1;
    public int I2;
    public Drawable I3;
    public boolean J;
    public lx J0;
    public org.telegram.ui.Cells.z2 J1;
    public int J2;
    public int J3;
    public float K;
    public boolean K0;
    public org.telegram.ui.Cells.sa K1;
    public int K2;
    public boolean K3;
    public boolean L;
    public boolean L0;
    public Long L1;
    public int L2;
    public boolean L3;
    public int M;
    public long M0;
    public Long M1;
    public int M2;
    public AnimatorSet M3;
    public boolean N;
    public long N0;
    public th.i N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public int O0;
    public ArrayList O1;
    public int O2;
    public zu O3;
    public org.telegram.ui.Components.ic P;
    public int P0;
    public boolean P1;
    public int P2;
    public String P3;
    public float Q;
    public int Q0;
    public org.telegram.ui.ActionBar.d2 Q1;
    public int Q2;
    public ArrayList Q3;
    public boolean R;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public boolean S;
    public org.telegram.ui.Components.cd0 S0;
    public boolean S1;
    public int S2;
    public CharSequence S3;
    public boolean T;
    public org.telegram.ui.Cells.r2 T0;
    public long T1;
    public oy T2;
    public boolean T3;
    public ey U;
    public org.telegram.ui.Cells.r2 U0;
    public TLObject U1;
    public long U2;
    public float U3;
    public lf.n0 V;
    public boolean V0;
    public int V1;
    public TLRPC.Chat V2;
    public boolean V3;
    public a41 W;
    public boolean W0;
    public int W1;
    public TLRPC.ChatFull W2;
    public boolean W3;
    public org.telegram.ui.Components.k81 X;
    public final ArrayList X0;
    public boolean X1;
    public org.telegram.ui.Components.p9 X2;
    public ValueAnimator X3;
    public tf.g0 Y;
    public boolean Y0;
    public boolean Y1;
    public org.telegram.ui.Components.z8 Y2;
    public org.telegram.ui.Components.w40 Y3;
    public float Z;
    public boolean Z0;
    public boolean Z1;
    public long Z2;
    public TLRPC.FileLocation Z3;
    public final int a;
    public ValueAnimator a0;
    public boolean a1;
    public int a2;
    public boolean a3;
    public TLRPC.FileLocation a4;
    public final xd.a b;
    public ny[] b0;
    public org.telegram.ui.ActionBar.i2 b1;
    public boolean b2;
    public boolean b3;
    public org.telegram.ui.Components.ic b4;
    public final xd.a c;
    public org.telegram.ui.ActionBar.w0 c0;
    public final Paint c1;
    public String c2;
    public AnimatorSet c3;
    public int c4;
    public final xd.a d;
    public org.telegram.ui.ActionBar.w0 d0;
    public ImageView d1;
    public String d2;
    public boolean d3;
    public int d4;
    public final xd.a e;
    public qy e0;
    public NumberTextView e1;
    public String e2;
    public boolean e3;
    public int e4;
    public final xd.a f;
    public boolean f0;
    public final ArrayList f1;
    public boolean f2;
    public float f3;
    public int f4;
    public org.telegram.ui.ActionBar.w0 g0;
    public org.telegram.ui.ActionBar.w0 g1;
    public boolean g2;
    public boolean g3;
    public int g4;
    public final xd.a h;
    public org.telegram.ui.ActionBar.w0 h0;
    public org.telegram.ui.ActionBar.w0 h1;
    public boolean h2;
    public int h3;
    public ug.i h4;
    public org.telegram.ui.ActionBar.w0 i0;
    public org.telegram.ui.ActionBar.w0 i1;
    public boolean i2;
    public boolean i3;
    public final ng.e i4;
    public org.telegram.ui.ActionBar.w0 j0;
    public org.telegram.ui.ActionBar.w0 j1;
    public boolean j2;
    public boolean j3;
    public final sg.d j4;
    public org.telegram.ui.Components.mi0 k0;
    public org.telegram.ui.ActionBar.g1 k1;
    public String k2;
    public org.telegram.ui.Components.ic k3;
    public final sg.d k4;
    public org.telegram.ui.ActionBar.g1 l0;
    public org.telegram.ui.ActionBar.g1 l1;
    public String l2;
    public final AnimationNotificationsLocker l3;
    public final sg.c l4;
    public ph.f3 m0;
    public org.telegram.ui.ActionBar.g1 m1;
    public final MessagesStorage.TopicKey m2;
    public boolean m3;
    public final ng.a m4;
    public final xd.a n;
    public ph.f3 n0;
    public org.telegram.ui.ActionBar.g1 n1;
    public boolean n2;
    public boolean n3;
    public final ng.a n4;
    public boolean o0;
    public org.telegram.ui.ActionBar.g1 o1;
    public boolean o2;
    public boolean o3;
    public final ng.a o4;
    public boolean p0;
    public org.telegram.ui.ActionBar.g1 p1;
    public boolean p2;
    public boolean p3;
    public final ng.a p4;
    public org.telegram.ui.Components.z10 q0;
    public org.telegram.ui.ActionBar.g1 q1;
    public boolean q2;
    public float q3;
    public ew q4;
    public final xd.a r;
    public org.telegram.ui.Components.z10 r0;
    public float r1;
    public boolean r2;
    public ValueAnimator r3;
    public final ArrayList r4;
    public final xd.a s;
    public ph.d s0;
    public float s1;
    public boolean s2;
    public float s3;
    public final RectF s4;
    public wg.f t0;
    public AnimatorSet t1;
    public boolean t2;
    public float t3;
    public final RectF t4;
    public int u0;
    public float u1;
    public boolean u2;
    public float u3;
    public final ch.i v;
    public final UndoView[] v0;
    public ug.f v1;
    public boolean v2;
    public int v3;
    public boolean w;
    public nw w0;
    public FrameLayout w1;
    public boolean w2;
    public boolean w3;
    public int x;
    public boolean x0;
    public FrameLayout x1;
    public boolean x2;
    public boolean x3;
    public boolean y;
    public int y0;
    public zw y1;
    public boolean y2;
    public Long y3;
    public xx z0;
    public org.telegram.ui.Components.qp0 z1;
    public iy z2;
    public Drawable z3;

    public oy(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.b = new xd.a(1, this, nrVar, 350L, false);
        this.c = new xd.a(2, this, nrVar, 350L, false);
        this.d = new xd.a(3, this, nrVar, 350L, false);
        this.e = new xd.a(4, this, nrVar, 350L, false);
        this.f = new xd.a(5, this, nrVar, 350L, false);
        this.h = new xd.a(6, this, nrVar, 350L, false);
        this.n = new xd.a(7, this, nrVar, 350L, false);
        this.r = new xd.a(8, this, nrVar, 350L, false);
        this.s = new xd.a(9, this, nrVar, 350L, false);
        this.v = new ch.i(new dw(this, 1));
        this.x = -1;
        this.C = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Z = 1.0f;
        this.v0 = new UndoView[2];
        this.X0 = new ArrayList();
        this.c1 = new Paint();
        this.f1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.B1 = new TextPaint(1);
        this.R1 = true;
        this.Z1 = true;
        this.f2 = true;
        this.m2 = new MessagesStorage.TopicKey();
        this.F2 = new ArrayList();
        this.G2 = true;
        this.l3 = new AnimationNotificationsLocker();
        this.v3 = -1;
        this.D3 = new xw(this, 0);
        this.E3 = new xw(this, 1);
        this.J3 = -4;
        this.K3 = true;
        this.L3 = true;
        this.U3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.r4 = arrayList;
        RectF rectF = new RectF();
        this.s4 = rectF;
        RectF rectF2 = new RectF();
        this.t4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        sg.c cVar = new sg.c();
        this.l4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        if (i10 >= 31) {
            this.i4 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.j4 = dVar;
            dVar.j(new tx(this, 0));
            sg.d dVar2 = new sg.d(null);
            this.k4 = dVar2;
            dVar2.j(new tx(this, 3));
            ng.a aVar = new ng.a(dVar);
            this.m4 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            ng.a aVar2 = new ng.a(dVar2);
            this.o4 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            this.n4 = new ng.a(dVar);
        } else {
            this.i4 = null;
            this.j4 = null;
            this.k4 = null;
            this.m4 = new ng.a(cVar);
            this.o4 = new ng.a(cVar);
            this.n4 = new ng.a(cVar);
        }
        this.p4 = new ng.a(cVar);
    }

    public static /* synthetic */ void A0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.ge0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.ge0.h();
            }
        }
    }

    public static /* synthetic */ void B0(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(oyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(oyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ba(oyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void C0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        oyVar.U4();
        org.telegram.ui.Components.ic J = org.telegram.ui.Components.qc.a0(oyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new mv(oyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void D0(oy oyVar) {
        try {
            ((org.telegram.ui.Components.gj0) ((org.telegram.ui.Components.z8) oyVar.J1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (oyVar.Y3 == null) {
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
            oyVar.Y3 = w40Var;
            w40Var.E = true;
            w40Var.a = oyVar;
            w40Var.b = new cy(oyVar);
            oyVar.getMediaDataController().checkFeaturedStickers();
            oyVar.getMessagesController().loadSuggestedFilters();
            oyVar.getMessagesController().loadUserInfo(oyVar.getUserConfig().getCurrentUser(), true, oyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(oyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(oyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(oyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.li liVar = oyVar.Y3.c;
        if (liVar != null) {
            liVar.c1();
        }
        org.telegram.ui.Components.w40 w40Var2 = oyVar.Y3;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        w40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new mv(oyVar, 0), new nv(oyVar, 0), 0);
    }

    public static /* synthetic */ void E0(oy oyVar, float f10, ValueAnimator valueAnimator) {
        oyVar.b0[0].setTranslationY((1.0f - oyVar.q3) * f10);
        oyVar.q3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < oyVar.actionBar.getChildCount(); i10++) {
            if (oyVar.actionBar.getChildAt(i10).getVisibility() == 0 && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getActionMode() && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getBackButton()) {
                oyVar.actionBar.getChildAt(i10).setAlpha(1.0f - oyVar.q3);
            }
        }
        oyVar.E3();
        oyVar.w3();
        View view = oyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(oy oyVar) {
        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(oyVar.getParentActivity(), oyVar.resourceProvider);
        qbVar.d(R.raw.email_check_inbox, new String[0]);
        qbVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.ic.g(oyVar, qbVar, 2750).j();
        try {
            oyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G0(oy oyVar) {
        org.telegram.ui.Components.wn0 wn0Var;
        jb1 jb1Var;
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            if (i10 == 2) {
                xx xxVar = oyVar.z0;
                if (xxVar == null) {
                    i10++;
                } else {
                    viewGroup = xxVar.S;
                    if (viewGroup == null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = viewGroup.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                                ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.va) {
                                ((org.telegram.ui.Cells.va) childAt).j(0);
                            }
                        }
                    }
                    i10++;
                }
            } else {
                ny[] nyVarArr = oyVar.b0;
                if (nyVarArr == null) {
                    i10++;
                } else {
                    viewGroup = i10 < nyVarArr.length ? nyVarArr[i10].a : null;
                    if (viewGroup == null) {
                    }
                    i10++;
                }
            }
        }
        xx xxVar2 = oyVar.z0;
        if (xxVar2 != null && (wn0Var = xxVar2.V) != null && (jb1Var = wn0Var.h0) != null) {
            int childCount2 = jb1Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = jb1Var.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt2;
                    org.telegram.ui.Components.z8 z8Var = n4Var.c;
                    int i13 = n4Var.h;
                    if (DialogObject.isUserDialog(n4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(n4Var.f));
                        n4Var.e = user;
                        z8Var.m(i13, user);
                    } else {
                        z8Var.k(i13, MessagesController.getInstance(i13).getChat(Long.valueOf(-n4Var.f)));
                        n4Var.e = null;
                    }
                    n4Var.c(true);
                }
            }
        }
        if (oyVar.b0 != null) {
            int i14 = 0;
            while (true) {
                ny[] nyVarArr2 = oyVar.b0;
                if (i14 >= nyVarArr2.length) {
                    break;
                }
                vw vwVar = nyVarArr2[i14].n;
                if (vwVar != null) {
                    vwVar.i();
                }
                i14++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = oyVar.actionBar;
        if (kVar != null) {
            kVar.D(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            oyVar.actionBar.E(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            oyVar.actionBar.E(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            oyVar.actionBar.F(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
            oyVar.actionBar.e();
        }
        if (oyVar.A3 != null) {
            oyVar.d5(UserConfig.getInstance(oyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.z2 z2Var = oyVar.J1;
        if (z2Var != null) {
            z2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        }
        org.telegram.ui.ActionBar.w0 w0Var = oyVar.j0;
        if (w0Var != null) {
            w0Var.setIconColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.v8));
        }
        zw zwVar = oyVar.y1;
        if (zwVar != null) {
            zwVar.e();
        }
        nw nwVar = oyVar.w0;
        if (nwVar != null) {
            pg.b bVar = nwVar.v0;
            if (bVar != null) {
                bVar.u();
            }
            nwVar.invalidate();
        }
        tf.g0 g0Var = oyVar.Y;
        if (g0Var != null) {
            g0Var.B1();
        }
        xx xxVar3 = oyVar.z0;
        if (xxVar3 != null) {
            SparseArray sparseArray = xxVar3.h;
            for (int i15 = 0; i15 < xxVar3.getChildCount(); i15++) {
                if (xxVar3.getChildAt(i15) instanceof t10) {
                    lh.e1 e1Var = ((t10) xxVar3.getChildAt(i15)).b;
                    int childCount3 = e1Var.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt3 = e1Var.getChildAt(i16);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
            }
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                View view = (View) sparseArray.valueAt(i17);
                if (view instanceof t10) {
                    lh.e1 e1Var2 = ((t10) view).b;
                    int childCount4 = e1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = e1Var2.getChildAt(i18);
                        if (childAt4 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt4).b0(0, true);
                        }
                    }
                }
            }
            t10 t10Var = xxVar3.J0;
            if (t10Var != null) {
                lh.e1 e1Var3 = t10Var.b;
                int childCount5 = e1Var3.getChildCount();
                for (int i19 = 0; i19 < childCount5; i19++) {
                    View childAt5 = e1Var3.getChildAt(i19);
                    if (childAt5 instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt5).b0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.eh0 eh0Var = xxVar3.m0;
            if (eh0Var != null) {
                eh0Var.c();
            }
        }
        org.telegram.ui.Components.k81 k81Var = oyVar.X;
        if (k81Var != null) {
            lh.e1 e1Var4 = k81Var.v;
            pg.b bVar2 = k81Var.o0;
            if (bVar2 != null) {
                bVar2.u();
            }
            k81Var.L.setColor(org.telegram.ui.ActionBar.j6.v0(k81Var.M, k81Var.g0));
            e1Var4.f1();
            e1Var4.invalidate();
            k81Var.invalidate();
        }
        a41 a41Var = oyVar.W;
        if (a41Var != null) {
            a41Var.e();
        }
        eg.h0 h0Var = oyVar.H0;
        if (h0Var != null && Build.VERSION.SDK_INT >= 23) {
            h0Var.setForeground(new ColorDrawable(i0.a.k(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100)));
        }
        org.telegram.ui.Components.z10 z10Var = oyVar.q0;
        if (z10Var != null) {
            z10Var.g();
        }
        org.telegram.ui.Components.z10 z10Var2 = oyVar.r0;
        if (z10Var2 != null) {
            z10Var2.g();
        }
        sg.c cVar = oyVar.l4;
        int i20 = org.telegram.ui.ActionBar.j6.d6;
        cVar.a(oyVar.getThemedColor(i20));
        org.telegram.ui.Components.js jsVar = oyVar.G1;
        if (jsVar != null) {
            pg.b bVar3 = jsVar.s;
            if (bVar3 != null) {
                bVar3.u();
            }
            jsVar.invalidate();
        }
        org.telegram.ui.Components.is isVar = oyVar.H1;
        if (isVar != null) {
            isVar.setColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        }
        yw ywVar = oyVar.E1;
        if (ywVar != null) {
            ywVar.p();
        }
        yw ywVar2 = oyVar.C1;
        if (ywVar2 != null) {
            ywVar2.p();
        }
        oyVar.D4(oyVar.u1);
        gx gxVar = oyVar.B0;
        if (gxVar != null) {
            gxVar.o();
        }
        Drawable drawable = oyVar.z3;
        if (drawable != null) {
            drawable.setColorFilter(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = oyVar.d1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            oyVar.d1.setBackground(org.telegram.ui.ActionBar.j6.f0(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
        }
        ey eyVar = oyVar.U;
        if (eyVar != null) {
            eyVar.e();
        }
    }

    public static void H0(oy oyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            gg.v2.e0(0, birthdayState);
            return;
        }
        kh.h2 h2Var = new kh.h2(oyVar.getParentActivity(), oyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        h2Var.V(true);
        oyVar.showDialog(h2Var);
    }

    public static void I0(oy oyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(oyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
            oyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            kh.a2.v(R.string.UnknownError, org.telegram.ui.Components.qc.a0(oyVar), R.raw.error, 36);
            return;
        }
        if (oyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity(), 0, oyVar.resourceProvider);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            oyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void J0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        oyVar.U4();
    }

    public static void N2(oy oyVar, float f10) {
        float f11;
        float f12;
        float clamp = Utilities.clamp(oyVar.u1 * 2.0f, 1.0f, 0.0f);
        gx gxVar = oyVar.B0;
        float f13 = (1.0f - oyVar.q3) * f10 * oyVar.E0;
        float f14 = 1.0f - clamp;
        gxVar.setAlpha(f13 * f14);
        if (oyVar.H || oyVar.J) {
            float clamp2 = Utilities.clamp((-oyVar.K) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (oyVar.q3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            oyVar.B0.setClipTop(0);
            if (oyVar.H || !oyVar.J) {
                oyVar.B0.setTranslationY(((oyVar.Q / 2.0f) + (Math.max(oyVar.K, -oyVar.U3()) + oyVar.s3)) - AndroidUtilities.dp(8.0f));
                oyVar.B0.l(clamp2, !oyVar.C3.c());
                if (oyVar.J) {
                    f11 = 1.0f - clamp3;
                    oyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f12 = oyVar.E0;
                }
            } else {
                oyVar.B0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                oyVar.B0.setProgressToCollapse(1.0f);
                f12 = oyVar.E0;
            }
            f11 = 1.0f - f12;
            oyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (oyVar.I) {
                oyVar.B0.setTranslationY((Math.max(oyVar.K, -oyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                oyVar.B0.setProgressToCollapse(1.0f);
                gx gxVar2 = oyVar.B0;
                gxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - gxVar2.getY()));
            }
            f11 = 1.0f - oyVar.E0;
            oyVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            oyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            oyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - oyVar.q3;
            oyVar.actionBar.getTitlesContainer().setAlpha(f16);
            oyVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        oyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        oyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        oyVar.actionBar.getTitlesContainer().setScaleY(f17);
        oyVar.actionBar.getTitlesContainer().setScaleX(f17);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - oyVar.q3) * f15;
        oyVar.actionBar.getTitlesContainer().setAlpha(f18);
        oyVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void O2(oy oyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        if (oyVar.parentLayout == null || oyVar.actionBar == null) {
            return;
        }
        float max = Math.max(oyVar.e.e, oyVar.V3());
        float f10 = 1.0f;
        float f11 = 1.0f - oyVar.u1;
        float f12 = max * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            i10 = -1;
            f10 = 0.0f;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i10 <= 0 || (e5Var = oyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) e5Var).p(canvas, (int) (f10 * 255.0f * f12), i10);
    }

    public static org.telegram.ui.Cells.r2 Q3(ny nyVar) {
        ky kyVar = nyVar.a;
        for (int i10 = 0; i10 < kyVar.getChildCount(); i10++) {
            View childAt = kyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.P()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void U(oy oyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        oyVar.U4();
    }

    public static /* synthetic */ void V(oy oyVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        oyVar.q3 = floatValue;
        oyVar.b0[0].setTranslationY((-f10) * floatValue);
        for (int i10 = 0; i10 < oyVar.actionBar.getChildCount(); i10++) {
            if (oyVar.actionBar.getChildAt(i10).getVisibility() == 0 && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getActionMode() && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getBackButton()) {
                oyVar.actionBar.getChildAt(i10).setAlpha(1.0f - oyVar.q3);
            }
        }
        View view = oyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        oyVar.E3();
        oyVar.w3();
    }

    public static void X(oy oyVar) {
        ArrayList arrayList = oyVar.F2;
        org.telegram.ui.ActionBar.e5 e5Var = oyVar.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).y()) {
            oyVar.finishPreviewFragment();
            return;
        }
        if (oyVar.O0 != 10) {
            if (MessagesController.getInstance(oyVar.currentAccount).isFrozen()) {
                c.b(oyVar.currentAccount);
                return;
            } else {
                oyVar.presentFragment(new ContactsActivity(android.support.v4.media.a.i("destroyAfterSelect", true)));
                return;
            }
        }
        if (oyVar.z2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        oyVar.z2.w(oyVar, arrayList2, null, false, oyVar.G2, oyVar.H2, oyVar.I2, null);
    }

    public static /* synthetic */ void Y(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        oyVar.U4();
    }

    public static void Z(oy oyVar) {
        PasskeysActivity.a0(oyVar.currentAccount, oyVar.getParentActivity(), oyVar.resourceProvider, true);
    }

    public static void a0(oy oyVar, int i10, org.telegram.ui.Components.o70 o70Var) {
        if (oyVar.currentAccount == i10) {
            return;
        }
        o70Var.u();
        if (oyVar.getParentActivity() == null) {
            return;
        }
        iy iyVar = oyVar.z2;
        LaunchActivity launchActivity = (LaunchActivity) oyVar.getParentActivity();
        ArrayList arrayList = oyVar.A2;
        String str = oyVar.B2;
        CharSequence charSequence = oyVar.C2;
        zw zwVar = oyVar.y1;
        CharSequence fieldText = zwVar != null ? zwVar.getFieldText() : null;
        launchActivity.K0(i10);
        oy oyVar2 = new oy(oyVar.arguments);
        oyVar2.z2 = iyVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                oyVar2.E4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    oyVar2.C2 = null;
                } else {
                    oyVar2.C2 = charSequence;
                    oyVar2.B2 = null;
                    oyVar2.A2 = null;
                    if (oyVar2.y1 != null) {
                        oyVar2.l3(fieldText);
                    } else {
                        oyVar2.S3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            oyVar2.A2 = null;
        } else {
            oyVar2.A2 = arrayList;
            oyVar2.B2 = null;
            if (oyVar2.y1 != null) {
                oyVar2.l3(fieldText);
            } else {
                oyVar2.S3 = fieldText;
            }
        }
        launchActivity.q0(oyVar2, false, true);
    }

    public static /* synthetic */ void b0(oy oyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(oyVar.currentAccount).getClientUserId());
        oyVar.presentFragment(new xn(bundle));
    }

    public static /* synthetic */ void c0(oy oyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = oyVar.getMessagesController().getUserFull(oyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        oyVar.getMessagesController().invalidateContentSettings();
        oyVar.getConnectionsManager().sendRequest(updatebirthday, new ba(oyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        oyVar.U4();
    }

    public static /* synthetic */ void d0(oy oyVar, String str) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, str);
        oyVar.U4();
    }

    public static void d4(xn xnVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.e10[] e10VarArr = (org.telegram.ui.Components.e10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.e10.class);
                if (e10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(e10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(e10VarArr[0]);
                    for (int i10 = 1; i10 < e10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(e10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(e10VarArr[i10]);
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
                    xnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void e0(oy oyVar, ny nyVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z4 = view instanceof org.telegram.ui.Cells.r2;
        if (z4) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.k2) {
                oyVar.N4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (oyVar.I3()) {
            oyVar.o4(view, i10, 0.0f, nyVar.d);
            return;
        }
        int i12 = oyVar.O0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.o8)) {
            nyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = android.support.v4.media.a.i("forImport", true);
            i14.putLongArray("result", new long[]{oyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = oyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            e70 e70Var = new e70(i14);
            e70Var.V = new tw(oyVar);
            oyVar.presentFragment(e70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i11 = nyVar.s) == 7 || i11 == 8)) {
            tf.i iVar = (tf.i) nyVar.d.J.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (iVar == null || iVar.a != 17) ? null : iVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = oyVar.getMessagesController().selectedDialogFilter[nyVar.s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.id;
                    org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(oyVar, false);
                    c10Var.V = -1;
                    c10Var.Z = "";
                    c10Var.a0 = new ArrayList();
                    c10Var.c0 = "";
                    c10Var.e0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    c10Var.f0 = arrayList;
                    c10Var.w0 = -1;
                    c10Var.z0 = -5;
                    c10Var.V = i15;
                    c10Var.X = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    c10Var.d0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = oyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i15) {
                                c10Var.Z = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    c10Var.S();
                    oyVar.showDialog(c10Var);
                    return;
                }
                return;
            }
        } else if (z4 && !oyVar.actionBar.s() && !oyVar.C3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).V1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        oyVar.n4(view, i10, nyVar.d);
    }

    public static /* synthetic */ void f0(oy oyVar) {
        oyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(oyVar.parentLayout, "newChatsRow");
    }

    public static void f1(oy oyVar, boolean z4) {
        if (oyVar.b0 == null || oyVar.K3 == z4) {
            return;
        }
        oyVar.K3 = z4;
        int i10 = 0;
        while (true) {
            ny[] nyVarArr = oyVar.b0;
            if (i10 >= nyVarArr.length) {
                return;
            }
            if (z4) {
                nyVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            oyVar.b0[i10].a.setVerticalScrollBarEnabled(z4);
            if (z4) {
                oyVar.b0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static void h0(oy oyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        if (oyVar.getParentActivity() == null) {
            return;
        }
        oyVar.q2 = false;
        if (z4 || z10 || z11) {
            oyVar.x0 = true;
            if (z4 && vj0.n(activity)) {
                org.telegram.ui.Components.ge0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.an(1, new org.telegram.ui.Components.vk(12, oyVar, activity)));
                return;
            }
            if (z10 && oyVar.R1 && oyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(activity, new vv(oyVar, 0)).a;
                oyVar.Q1 = d2Var;
                oyVar.showDialog(d2Var);
            } else if (!z11 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                oyVar.k3(true);
            } else if (activity instanceof j5) {
                org.telegram.ui.ActionBar.d2 v = ((j5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                oyVar.Q1 = v;
                oyVar.showDialog(v);
            }
        }
    }

    public static /* synthetic */ void i0(oy oyVar) {
        if (oyVar.Y3.h()) {
            MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            oyVar.U4();
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = v4;
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
        AndroidUtilities.runOnUIThread(new zi(accountInstance, 18), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void k0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        oyVar.U4();
    }

    public static /* synthetic */ void l0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        oyVar.U4();
    }

    public static void m0(oy oyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        gg.y1 y1Var;
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.z4.f0(oyVar.currentAccount, tL_error, oyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            oyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        oyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        gg.y1 y1Var2 = new gg.y1(oyVar, j10, 20);
        Pattern pattern = org.telegram.ui.Components.z4.a;
        if (oyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = oyVar.getCurrentAccount();
            Activity parentActivity = oyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
            p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(p9Var, k7.b6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z4 = LocaleController.isRTL;
            frameLayout.addView(textView2, k7.b6.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 21 : 76, 11.0f, z4 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                y1Var = y1Var2;
                z8Var.k(currentAccount, chat);
                p9Var.e(chat, z8Var);
            } else if (UserObject.isReplyUser(user)) {
                z8Var.p = 0.8f;
                z8Var.g(12);
                p9Var.h(null, null, z8Var, user);
                y1Var = y1Var2;
            } else {
                y1Var = y1Var2;
                if (user.id == clientUserId) {
                    z8Var.p = 0.8f;
                    z8Var.g(1);
                    p9Var.h(null, null, z8Var, user);
                } else {
                    z8Var.p = 1.0f;
                    z8Var.m(currentAccount, user);
                    p9Var.e(user, z8Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.t(y1Var, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            oyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void n0(oy oyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.rn0 rn0Var = oyVar.z0.l0;
        if (i10 < rn0Var.U || i10 >= rn0Var.V) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.i51 G = rn0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity(), 0, oyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new qs(4, oyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void o0(oy oyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        if (i10 != 102) {
            oyVar.r4(arrayList, i10, false, false, null);
            return;
        }
        oyVar.getMessagesController().setDialogsInTransaction(true);
        oyVar.r4(arrayList, i10, false, false, z4 ? hashSet : null);
        oyVar.getMessagesController().setDialogsInTransaction(false);
        oyVar.getMessagesController().checkIfFolderEmpty(oyVar.S2);
        int i11 = oyVar.S2;
        if (i11 == 0 || oyVar.R3(oyVar.currentAccount, oyVar.b0[0].s, i11, false).size() != 0) {
            return;
        }
        oyVar.b0[0].a.setEmptyView(null);
        oyVar.b0[0].w.setVisibility(4);
        oyVar.finishFragment();
    }

    public static /* synthetic */ void q0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, oyVar.x3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        oyVar.U4();
    }

    public static void q1(oy oyVar, ny nyVar, float f10) {
        if (oyVar.Q == f10) {
            return;
        }
        oyVar.Q = f10;
        if (f10 == 0.0f) {
            oyVar.R = false;
        }
        oyVar.B0.setOverscroll(f10);
        nyVar.a.setViewsOffset(f10);
        nyVar.a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        oyVar.fragmentView.invalidate();
        if (f10 <= AndroidUtilities.dp(90.0f) || oyVar.R) {
            return;
        }
        gx gxVar = oyVar.B0;
        ValueAnimator valueAnimator = gxVar.E0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            gxVar.i(gxVar.m0, true);
            oyVar.R = true;
            oyVar.getOrCreateStoryViewer().s(new mv(oyVar, 18));
        }
    }

    public static /* synthetic */ void r0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.ge0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.ge0.h();
            }
        }
    }

    public static boolean r1(oy oyVar, ny nyVar) {
        if (oyVar.C3.c()) {
            return false;
        }
        int i10 = (int) (-oyVar.K);
        int T3 = oyVar.T3();
        int U3 = oyVar.U3();
        if (i10 == 0 || i10 == T3 || i10 == U3 || !nyVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (U3 >= i10 || i10 >= T3) {
            if ((oyVar.q3 != 1.0f ? Utilities.clamp((-oyVar.K) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < oyVar.B0.y0) {
                nyVar.b.x(-i10);
                return true;
            }
            nyVar.b.x(U3 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - U3;
        if (i11 < dp / 2) {
            nyVar.b.x(-i11);
            return true;
        }
        nyVar.b.x(dp - i11);
        return true;
    }

    public static void s0(oy oyVar) {
        c.c(oyVar.getParentActivity(), oyVar.currentAccount, oyVar.getResourceProvider());
    }

    public static String s2(oy oyVar) {
        ArrayList arrayList = oyVar.F2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == oyVar.getUserConfig().getClientUserId()) {
                sb.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb.append(arrayList.size() == 1 ? DialogObject.getName(oyVar.currentAccount, longValue) : DialogObject.getShortName(oyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final oy oyVar, final boolean z4, final boolean z10) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        oyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                oyVar.getMessagesController().deleteDialog(j10, 2, z10);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = oyVar.S2) != 0 && oyVar.R3(oyVar.currentAccount, oyVar.b0[0].s, i13, false).size() == 1) {
            oyVar.b0[0].w.setVisibility(4);
        }
        oyVar.v3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            oyVar.A4(true, true);
            if (oyVar.O1 != null) {
                i12 = 0;
                while (i12 < oyVar.O1.size()) {
                    if (((TLRPC.Dialog) oyVar.O1.get(i12)).id == j10) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            oyVar.o3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView Y3 = oyVar.Y3();
        if (Y3 != null) {
            Y3.j(i10 == 103 ? 0 : z10 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.yv
                @Override // java.lang.Runnable
                public final void run() {
                    oyVar.q4(i10, j10, chat2, z4, z10);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(oyVar.R3(oyVar.currentAccount, oyVar.b0[0].s, oyVar.S2, false));
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
            if (i11 < 0 || i14 >= 0 || (arrayList = oyVar.O1) == null) {
                oyVar.A4(false, true);
                return;
            }
            arrayList.remove(i11);
            oyVar.b0[0].x.D();
            oyVar.b0[0].q(true);
        }
    }

    public static void u0(oy oyVar) {
        BirthdayController.getInstance(oyVar.currentAccount).hide();
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        oyVar.U4();
        org.telegram.ui.Components.ic G = org.telegram.ui.Components.qc.a0(oyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static void v0(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            si1.a(oyVar.getParentActivity(), new jh(oyVar, tL_attachMenuBot, launchActivity), null);
        } else {
            LaunchActivity.C0(launchActivity, oyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static /* synthetic */ void w0(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, oyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(oyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void x0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        oyVar.U4();
    }

    public static void y0(oy oyVar) {
        if (oyVar.L3) {
            ph.f3 f3Var = oyVar.m0;
            if (f3Var != null) {
                f3Var.e(true);
            }
            nh.n6 o10 = MessagesController.getInstance(oyVar.currentAccount).getStoriesController().o();
            if (o10 != null && o10.a(oyVar.currentAccount, 1)) {
                oyVar.showDialog(new eg.v0(o10.b(), oyVar.currentAccount, oyVar.getParentActivity(), oyVar, null));
                return;
            } else {
                ph.da E = ph.da.E(oyVar.getParentActivity(), oyVar.currentAccount);
                E.x = new tx(oyVar, 4);
                E.R(null);
                return;
            }
        }
        ph.f3 f3Var2 = oyVar.n0;
        if (f3Var2 != null) {
            if (f3Var2.S) {
                return;
            } else {
                AndroidUtilities.removeFromParent(f3Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new dw(oyVar, 7));
        ph.f3 f3Var3 = new ph.f3(oyVar.getParentActivity(), 2);
        f3Var3.r(8.0f);
        f3Var3.d = 8000L;
        f3Var3.i();
        f3Var3.q(true);
        f3Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        f3Var3.t(replaceSingleTag);
        f3Var3.m(1.0f, -40.0f);
        f3Var3.h(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        oyVar.n0 = f3Var3;
        f3Var3.setTranslationY((-oyVar.d4) - oyVar.f4);
        ((ViewGroup) oyVar.fragmentView).addView(oyVar.n0, k7.b6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        oyVar.n0.v();
    }

    public static void z0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        oyVar.U4();
        org.telegram.ui.Components.ic G = org.telegram.ui.Components.qc.a0(oyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public final void A3() {
        org.telegram.ui.Components.z10.d(this.i0, e2.c.z(this.b.e, 1.0f - V3(), 1.0f - this.c.e, this.d.e));
    }

    public final void A4(boolean z4, boolean z10) {
        if (this.b0 == null || this.P1 == z4) {
            return;
        }
        if (z4) {
            this.O1 = new ArrayList(R3(this.currentAccount, this.b0[0].s, this.S2, false));
        } else {
            this.O1 = null;
        }
        this.P1 = z4;
        ny nyVar = this.b0[0];
        nyVar.d.D = z4;
        if (z4 || !z10) {
            return;
        }
        if (nyVar.a.b0()) {
            this.b0[0].a.post(new dw(this, 8));
        } else {
            this.b0[0].d.l();
        }
    }

    @Override // zf.b
    public final List B() {
        return Arrays.asList(new zf.a(LocaleController.getString(R.string.DebugDialogsActivity)), new zf.a(LocaleController.getString(R.string.ClearLocalDatabase), new mv(this, 27)), new zf.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new mv(this, 28)));
    }

    public final void B3() {
        eg.h0 h0Var;
        boolean z4 = !this.g2 && ((h0Var = this.H0) == null || h0Var.getBackground() == null || this.H0.getAlpha() < 0.01f || this.H0.getVisibility() == 8);
        sg0 sg0Var = this.F3;
        if (sg0Var != null) {
            sg0Var.a.v.a(z4, true);
        }
    }

    public final void B4(boolean z4) {
        ny nyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z4) {
            ny[] nyVarArr = this.b0;
            if (nyVarArr != null && (nyVar = nyVarArr[0]) != null) {
                nyVar.setLayerType(2, null);
                this.b0[0].setClipChildren(false);
                this.b0[0].setClipToPadding(false);
                this.b0[0].a.setClipChildren(false);
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
        if (this.b0 != null) {
            int i10 = 0;
            while (true) {
                ny[] nyVarArr2 = this.b0;
                if (i10 >= nyVarArr2.length) {
                    break;
                }
                ny nyVar2 = nyVarArr2[i10];
                if (nyVar2 != null) {
                    nyVar2.setLayerType(0, null);
                    nyVar2.setClipChildren(true);
                    nyVar2.setClipToPadding(true);
                    nyVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        gx gxVar = this.B0;
        if (gxVar != null) {
            gxVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.z10.d(this.h0, (1.0f - this.b.e) * (1.0f - V3()) * (1.0f - this.c.e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f10) {
        ny[] nyVarArr = this.b0;
        if (nyVarArr != null) {
            int paddingTop = nyVarArr[0].a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                ny[] nyVarArr2 = this.b0;
                if (i10 >= nyVarArr2.length) {
                    break;
                }
                nyVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f10 == this.K) {
            return;
        }
        this.K = f10;
        org.telegram.ui.Components.ic icVar = this.k3;
        if (icVar != null) {
            icVar.l();
        }
        if (this.B3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.B3;
            float f11 = (int) f10;
            float f12 = oVar.f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.B3.setAlpha(k7.n.a(currentActionBarHeight, 0.0f, 1.0f));
            this.B3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        E3();
        this.fragmentView.invalidate();
    }

    public final void D3() {
        String string = LocaleController.getString(V3() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.U.r.setContentDescription(string);
        this.U.r.setHint(string);
    }

    public final void D4(float f10) {
        this.u1 = f10;
        if (this.o3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.S2 == 0 && this.U2 == 0) ? org.telegram.ui.ActionBar.j6.v8 : org.telegram.ui.ActionBar.j6.O8);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.j6.y8;
            kVar.C(i0.a.d(this.u1, themedColor, getThemedColor(i10)), false);
            this.actionBar.C(i0.a.d(this.u1, getThemedColor(i10), getThemedColor(i10)), true);
            this.actionBar.B(i0.a.d(this.u1, getThemedColor((this.S2 == 0 && this.U2 == 0) ? org.telegram.ui.ActionBar.j6.t8 : org.telegram.ui.ActionBar.j6.N8), getThemedColor(org.telegram.ui.ActionBar.j6.z8)), false);
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
        if (this.U == null) {
            return;
        }
        float a2 = 1.0f - k7.n.a(((-this.K) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = (this.O0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.q3, this.h.e)) * Math.max(this.b.e, (1.0f - V3()) * a2);
        this.U.setAlpha(max);
        this.U.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.B2 = null;
            this.C2 = null;
            return;
        }
        this.B2 = str;
        this.C2 = null;
        this.A2 = null;
        if (this.y1 != null) {
            l3(charSequence);
        } else {
            this.S3 = charSequence;
        }
    }

    public final void F3() {
        if (this.W != null) {
            float f10 = (this.X != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.W.setScaleX(lerp);
            this.W.setScaleY(lerp);
            this.W.setAlpha(f10);
            this.W.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.k81 k81Var = this.X;
        xd.a aVar = this.s;
        if (k81Var != null) {
            float f11 = 1.0f - aVar.e;
            k81Var.setAlpha(f11);
            this.X.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        tf.g0 g0Var = this.Y;
        if (g0Var != null) {
            float f12 = aVar.e;
            g0Var.setAlpha(f12);
            this.Y.setVisibility(f12 > 0.0f ? 0 : 8);
        }
    }

    public final void F4(float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.U3 != f10) {
            boolean z4 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z4 = false;
            }
            this.V3 = z4;
            this.U3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.V3) {
                float f11 = (1.0f - this.U3) * (-AndroidUtilities.dp(40.0f));
                gx gxVar = this.B0;
                if (gxVar != null) {
                    gxVar.setTranslationX(f11);
                }
                ey eyVar = this.U;
                if (eyVar != null) {
                    eyVar.setTranslationX(f11);
                }
                jx jxVar = this.C3;
                if (jxVar == null || jxVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.C3.getFragmentView().setTranslationX(f11);
                return;
            }
            float f12 = -AndroidUtilities.dp(4.0f);
            float f13 = 1.0f - this.U3;
            float f14 = f12 * f13;
            float f15 = 1.0f - (f13 * 0.05f);
            gx gxVar2 = this.B0;
            if (gxVar2 != null) {
                gxVar2.setScaleX(f15);
                this.B0.setScaleY(f15);
                this.B0.setTranslationX(f14);
                this.B0.setPivotX(0.0f);
                this.B0.setPivotY(0.0f);
            }
            ey eyVar2 = this.U;
            if (eyVar2 != null) {
                eyVar2.setTranslationX(f14);
                this.U.setScaleX(f15);
                this.U.setScaleY(f15);
            }
            jx jxVar2 = this.C3;
            if (jxVar2 == null || jxVar2.getFragmentView() == null) {
                return;
            }
            if (!this.y) {
                this.C3.getFragmentView().setScaleX(f15);
                this.C3.getFragmentView().setScaleY(f15);
                this.C3.getFragmentView().setTranslationX(f14);
            }
            this.C3.getFragmentView().setPivotX(0.0f);
            this.C3.getFragmentView().setPivotY(0.0f);
        }
    }

    public final void G3(boolean z4) {
        if (this.z0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.X != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.js jsVar = this.G1;
        int c3 = measuredHeight + (jsVar != null ? (int) jsVar.c(AndroidUtilities.dp(7.0f)) : 0);
        xx xxVar = this.z0;
        SparseArray sparseArray = xxVar.h;
        xxVar.R0 = c3;
        xxVar.S0 = i10;
        lh.e1 e1Var = xxVar.S;
        if (z4) {
            e1Var.o1(0, c3, 0, i10);
        } else {
            e1Var.setPadding(0, c3, 0, i10);
        }
        xxVar.J0.j(xxVar.R0, xxVar.S0, z4);
        org.telegram.ui.Components.qn0 qn0Var = xxVar.T;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qn0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = xxVar.R0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != xxVar.S0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = xxVar.S0;
            qn0Var.requestLayout();
        }
        org.telegram.ui.Components.do0.P(xxVar.c0, xxVar.f0, xxVar.R0, xxVar.S0, z4);
        org.telegram.ui.Components.do0.P(xxVar.h0, xxVar.k0, xxVar.R0, xxVar.S0, z4);
        org.telegram.ui.Components.do0.P(xxVar.o0, xxVar.r0, xxVar.R0, xxVar.S0, z4);
        org.telegram.ui.Components.eh0 eh0Var = xxVar.m0;
        int i13 = xxVar.R0;
        int i14 = xxVar.S0;
        eh0Var.setClipToPadding(false);
        org.telegram.ui.Components.g61 g61Var = eh0Var.c;
        eh0Var.G = z4;
        eh0Var.setPadding(0, i13, 0, i14);
        if (z4) {
            g61Var.o1(0, i13, 0, i14);
        } else {
            g61Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g61Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        eh0Var.G = false;
        org.telegram.ui.Components.dn0 dn0Var = xxVar.D0;
        if (dn0Var != null) {
            dn0Var.b(xxVar.R0, xxVar.S0, z4);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof t10) {
                ((t10) view).j(xxVar.R0, xxVar.S0, z4);
            }
        }
        for (int i16 = 0; i16 < xxVar.getChildCount(); i16++) {
            if (xxVar.getChildAt(i16) instanceof t10) {
                ((t10) xxVar.getChildAt(i16)).j(xxVar.R0, xxVar.S0, z4);
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.k41(17, this, r0), new zi(r0, 17));
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(getParentActivity(), getResourceProvider());
        b3Var.c(q6Var);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.a;
        g3Var.show();
        org.telegram.ui.ActionBar.g3[] g3VarArr = {g3Var};
        g3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
    }

    public final void H3() {
        if (this.G1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.G1.setAlpha(1.0f);
            this.G1.setScaleX(lerp);
            this.G1.setScaleY(lerp);
            this.G1.setVisibility(0);
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
        int i10;
        LinearLayout linearLayout;
        oy oyVar;
        char c3;
        boolean[] zArr;
        MessagesController.DialogFilter dialogFilter;
        boolean[] zArr2;
        long j12;
        ?? r42;
        long j13;
        int i11;
        boolean z4;
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
        final oy oyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(r2Var.d2);
        boolean z10 = false;
        if (r2Var.O()) {
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
            if (oyVar2.U2 != 0 && ((b10 = sh.p0.b(oyVar2.currentAccount, dialogId)) == 4 || b10 == 3)) {
                return false;
            }
            TLRPC.Chat chat = oyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
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
        boolean z11 = oyVar2.U2 == 0 && oyVar2.getMessagesController().filtersEnabled && oyVar2.getMessagesController().dialogFiltersLoaded && oyVar2.getMessagesController().dialogFilters != null && oyVar2.getMessagesController().dialogFilters.size() > 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
        if (z11) {
            LinearLayout linearLayout2 = new LinearLayout(oyVar2.getParentActivity());
            linearLayout2.setOrientation(1);
            kh.k3 k3Var = new kh.k3(oyVar2.getParentActivity(), 1);
            LinearLayout linearLayout3 = new LinearLayout(oyVar2.getParentActivity());
            linearLayout3.setOrientation(1);
            k3Var.addView(linearLayout3);
            int size = oyVar2.getMessagesController().dialogFilters.size();
            int i18 = 0;
            org.telegram.ui.ActionBar.g1 g1Var2 = null;
            while (i18 < size) {
                final MessagesController.DialogFilter dialogFilter2 = oyVar2.getMessagesController().dialogFilters.get(i18);
                if (dialogFilter2.isDefault()) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j14 = dialogId;
                } else {
                    final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(oyVar2.currentAccount), dialogId);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j14 = dialogId;
                    final ArrayList H = org.telegram.ui.Components.n00.H(oyVar2, dialogFilter2, arrayList, true, z10);
                    if (!includesDialog) {
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, oyVar2.getParentActivity(), null, false, false);
                    g1Var3.setChecked(includesDialog);
                    i17 = i16;
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, g1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, g1Var3.getTextView().getPaint().getFontMetricsInt());
                    g1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                    g1Var3.g(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.d10(oyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                    g1Var3.getTextView().setEmojiColor(oyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    g1Var3.setMinimumWidth(160);
                    g1Var = g1Var3;
                    j14 = j14;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                    g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.gw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArrayList arrayList2;
                            long j15;
                            MessagesController.DialogFilter dialogFilter3;
                            oy oyVar3 = oy.this;
                            oyVar3.getClass();
                            boolean z12 = includesDialog;
                            ArrayList arrayList3 = H;
                            MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                            long j16 = j14;
                            if (z12) {
                                dialogFilter4.alwaysShow.remove(Long.valueOf(j16));
                                dialogFilter4.neverShow.add(Long.valueOf(j16));
                                b10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, oyVar3, null);
                                oyVar3.Y3().k(j16, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
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
                                    b10.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, oyVar3, null);
                                }
                                oyVar3.Y3().k(j15, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                            }
                            oyVar3.b4(true);
                            oyVar3.finishPreviewFragment();
                        }
                    });
                    linearLayout3.addView(g1Var);
                    oyVar2 = this;
                    dialogId = j14;
                    size = i17;
                    i18 = i15 + 1;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                    g1Var2 = g1Var;
                    z10 = false;
                }
                g1Var = g1Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                i17 = i16;
                oyVar2 = this;
                dialogId = j14;
                size = i17;
                i18 = i15 + 1;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                g1Var2 = g1Var;
                z10 = false;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j11 = dialogId;
            org.telegram.ui.ActionBar.g1 g1Var4 = g1Var2;
            i10 = 160;
            if (g1Var4 != null) {
                g1Var4.j(false, true);
            }
            if (linearLayout3.getChildCount() <= 0) {
                z11 = false;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            } else {
                View m1Var = new org.telegram.ui.ActionBar.m1(getParentActivity(), org.telegram.ui.ActionBar.j6.H8, getResourceProvider());
                m1Var.setTag(R.id.fit_width_tag, 1);
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
                g1Var5.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var5.setMinimumWidth(160);
                g1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                linearLayout2.addView(g1Var5);
                linearLayout2.addView(m1Var, k7.b6.n(-1, 8));
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
        org.telegram.ui.ActionBar.p2[] p2VarArr = new org.telegram.ui.ActionBar.p2[1];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z11 ? 3 : 2, getParentActivity(), getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (z11) {
            int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
            org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            g1Var6.g(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
            g1Var6.setMinimumWidth(i10);
            g1Var6.setOnClickListener(new org.telegram.ui.Components.rx0(17, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var6);
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new fu(p2VarArr, 3));
        }
        if (isCommunity) {
            oyVar = this;
            c3 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (r2Var.getHasUnread()) {
                g1Var7.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            } else {
                g1Var7.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
            }
            g1Var7.setMinimumWidth(i10);
            long j15 = j11;
            oy oyVar3 = this;
            j11 = j15;
            g1Var7.setOnClickListener(new lh.r2(oyVar3, r2Var, j15, 5));
            c3 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var7);
            oyVar = oyVar3;
        }
        boolean[] zArr3 = new boolean[1];
        zArr3[c3] = true;
        TLRPC.Dialog dialog = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(j11);
        int i19 = oyVar.b0[c3].s;
        boolean z12 = (i19 == 7 || i19 == 8) && (!oyVar.actionBar.s() || oyVar.actionBar.t(null));
        if (z12) {
            zArr = zArr3;
            dialogFilter = oyVar.getMessagesController().selectedDialogFilter[oyVar.b0[0].s == 8 ? (char) 1 : (char) 0];
        } else {
            zArr = zArr3;
            dialogFilter = null;
        }
        if (oyVar.g4(dialog)) {
            zArr2 = zArr;
            j12 = j11;
            r42 = 0;
        } else {
            ArrayList<TLRPC.Dialog> dialogs = oyVar.getMessagesController().getDialogs(oyVar.S2);
            int size2 = dialogs.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i20 >= size2) {
                    z4 = z12;
                    zArr2 = zArr;
                    j12 = j11;
                    break;
                }
                TLRPC.Dialog dialog2 = dialogs.get(i20);
                z4 = z12;
                if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                    zArr2 = zArr;
                    j12 = j11;
                } else if (oyVar.g4(dialog2)) {
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
                    if (!oyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                        break;
                    }
                }
                i20++;
                zArr = zArr2;
                j11 = j12;
                z12 = z4;
            }
            if (dialog == null || oyVar.g4(dialog)) {
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
            int size3 = (!z4 || dialogFilter == null) ? (oyVar.S2 == 0 && dialogFilter == null) ? oyVar.getUserConfig().isPremium() ? oyVar.getMessagesController().maxPinnedDialogsCountPremium : oyVar.getMessagesController().maxPinnedDialogsCountDefault : oyVar.getUserConfig().isPremium() ? oyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : oyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
            boolean z13 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
            r42 = 0;
            zArr2[0] = z13;
        }
        if (zArr2[r42]) {
            org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(oyVar.getParentActivity(), r42, r42);
            if (oyVar.g4(dialog)) {
                g1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
            }
            g1Var8.setMinimumWidth(160);
            long j16 = j12;
            j13 = j16;
            g1Var8.setOnClickListener(new gg.z0(oyVar, dialogFilter, dialog, j16, 2));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var8);
        } else {
            j13 = j12;
        }
        if (DialogObject.isUserDialog(j13) && UserObject.isUserSelf(oyVar.getMessagesController().getUser(Long.valueOf(j13)))) {
            i11 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(oyVar.getParentActivity(), false, false);
            if (oyVar.getMessagesController().isDialogMuted(j13, 0L)) {
                g1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
            } else {
                g1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
            }
            g1Var9.setMinimumWidth(160);
            g1Var9.setOnClickListener(new dh.s(oyVar, j13, 5));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var9);
        }
        if (!isCommunity) {
            org.telegram.ui.ActionBar.g1 g1Var10 = new org.telegram.ui.ActionBar.g1(oyVar.getParentActivity(), i11, true);
            g1Var10.setIconColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            int i24 = org.telegram.ui.ActionBar.j6.q7;
            g1Var10.setTextColor(oyVar.getThemedColor(i24));
            g1Var10.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, oyVar.getThemedColor(i24)));
            g1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
            g1Var10.setMinimumWidth(160);
            g1Var10.setOnClickListener(new org.telegram.ui.Components.rx0(18, oyVar, arrayList));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var10);
        }
        if (isCommunity) {
            if (oyVar.k2 != null) {
                oyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
            }
            oyVar.t4();
            oyVar.parentLayout.setHighlightActionButtons(true);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("community_id", -j13);
            oy oyVar4 = new oy(bundle2);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2VarArr[0] = oyVar4;
                oyVar.presentFragmentAsPreview(oyVar4);
                return false;
            }
            p2VarArr[0] = oyVar4;
            oyVar.presentFragmentAsPreviewWithMenu(oyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
            return false;
        }
        if (!oyVar.getMessagesController().checkCanOpenChat(bundle, oyVar)) {
            return false;
        }
        if (oyVar.k2 != null) {
            oyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
        }
        oyVar.t4();
        oyVar.parentLayout.setHighlightActionButtons(true);
        xn xnVar = new xn(bundle);
        Point point2 = AndroidUtilities.displaySize;
        if (point2.x > point2.y) {
            p2VarArr[0] = xnVar;
            oyVar.presentFragmentAsPreview(xnVar);
            return true;
        }
        p2VarArr[0] = xnVar;
        oyVar.presentFragmentAsPreviewWithMenu(xnVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
        xnVar.G9 = true;
        try {
            xnVar.X0.getAvatarImageView().performAccessibilityAction(64, null);
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean I3() {
        return this.O0 == 10;
    }

    public final void I4(boolean z4) {
        int i10 = 1;
        this.c.a(z4, true);
        if (this.j0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.M3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.M3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z4) {
            this.j0.setVisibility(0);
        } else {
            this.j0.setSelected(false);
            Drawable background = this.j0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.j0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        this.M3.playTogether(arrayList);
        this.M3.addListener(new px(this, z4, i10));
        this.M3.start();
    }

    public final void J3() {
        if (!AndroidUtilities.isTablet()) {
            this.S1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
        TLObject tLObject = this.U1;
        if (tLObject != null) {
            xx xxVar = this.z0;
            if (xxVar != null) {
                xxVar.V.R(this.T1, tLObject);
            }
            this.U1 = null;
        }
    }

    public final void J4() {
        if (this.x0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.w0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new dw(this, 9), 1000L);
    }

    public final void K3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.k0) {
            return;
        }
        kVar.h(true);
        this.m3 = false;
        V4(true, true);
    }

    public final void K4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        org.telegram.ui.Components.k41 k41Var;
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, this.h0);
        int i12 = org.telegram.ui.ActionBar.j6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 0;
        if (this.U2 != 0) {
            if (ChatObject.hasAdminRights(this.V2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new mv(this, 4), false);
                H.k();
            }
            H.i(new mv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.V2.collapsed_in_dialogs);
            H.i(new mv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.V2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new mv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new mv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var2 = this.resourceProvider;
        boolean a2 = f6Var2 != null ? f6Var2.a() : org.telegram.ui.ActionBar.j6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new mv(this, 11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new mv(this, 12), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new mv(this, 13), false);
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
                    pv pvVar = new pv(this, tL_attachMenuBot2, launchActivity2, 0);
                    org.telegram.ui.Components.k41 k41Var2 = new org.telegram.ui.Components.k41(16, this, tL_attachMenuBot2);
                    org.telegram.ui.ActionBar.f6 f6Var3 = H.d;
                    if (H.e != null) {
                        int i15 = org.telegram.ui.ActionBar.j6.F8;
                        int i16 = org.telegram.ui.ActionBar.j6.E8;
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                        g1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                        CharSequence a10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.o8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                        TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                        if (sideAttachMenuBotIcon != null) {
                            launchActivity = launchActivity2;
                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.c7, 1.0f);
                            if (svgThumb != null) {
                                Integer num = H.k0;
                                charSequence = a10;
                                svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(i15, f6Var3), PorterDuff.Mode.SRC_IN));
                            } else {
                                charSequence = a10;
                            }
                            i10 = i16;
                            k41Var = k41Var2;
                            i11 = i15;
                            g1Var = g1Var2;
                            f6Var = f6Var3;
                            g1Var.h(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                            org.telegram.ui.Components.p9 p9Var = g1Var.h;
                            if (p9Var != null) {
                                p9Var.setLayoutParams(k7.b6.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                            }
                        } else {
                            launchActivity = launchActivity2;
                            k41Var = k41Var2;
                            i10 = i16;
                            g1Var = g1Var2;
                            f6Var = f6Var3;
                            CharSequence charSequence2 = a10;
                            i11 = i15;
                            g1Var.g(charSequence2, R.drawable.msg_bot, null);
                        }
                        Integer num2 = H.j0;
                        int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                        Integer num3 = H.k0;
                        g1Var.c(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                        Integer num4 = H.k0;
                        g1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                        Integer num5 = H.l0;
                        g1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                        g1Var.setOnClickListener(new org.telegram.ui.Components.w2(23, H, pvVar));
                        g1Var.setOnLongClickListener(new nh.f2(3, H, k41Var));
                        int i17 = H.S;
                        if (i17 > 0) {
                            g1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                            H.r(g1Var, k7.b6.n(H.S, -2));
                        } else {
                            H.r(g1Var, k7.b6.n(-1, -2));
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
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new mv(this, 6), false);
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.l0;
        if (g1Var3 != null) {
            g1Var3.b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.ai));
            this.l0.setOnClickListener(new org.telegram.ui.Components.rx0(15, this, H));
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                H.k();
                H.d(this.l0);
            }
        }
        H.Z();
        H.X(-AndroidUtilities.dp(64.0f));
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            ey eyVar = this.U;
            xd.a aVar = this.b;
            eyVar.setBlurredBackgroundVisibility(aVar.e);
            float b10 = lf.l0.b(aVar.e);
            org.telegram.ui.Components.p9 p9Var = this.X2;
            if (p9Var != null) {
                p9Var.setScaleX(b10);
                this.X2.setScaleY(b10);
                this.X2.setAlpha(b10);
                this.X2.setVisibility(b10 > 0.0f ? 0 : 8);
            }
            if (this.s0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.s0.setScaleX(lerp);
                this.s0.setScaleY(lerp);
                this.s0.setAlpha(b10);
                this.s0.setVisibility(b10 > 0.0f ? 0 : 8);
                this.t0.setAlpha(b10);
                this.t0.setVisibility(b10 > 0.0f ? 0 : 8);
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

    public final void L3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(str);
        boolean z4 = this.T;
        ArrayList arrayList = this.f1;
        if (z4) {
            ImageView imageView = new ImageView(getParentActivity());
            this.d1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.d1.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.d1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            this.d1.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
            this.d1.setOnClickListener(new rv(this, 6));
            j10.addView(this.d1, k7.b6.q(54, 54, 16));
            arrayList.add(this.d1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.e1 = numberTextView;
        numberTextView.setTextSize(18);
        this.e1.setTypeface(AndroidUtilities.bold());
        this.e1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
        j10.addView(this.e1, k7.b6.m(1.0f, 0, -1, this.T ? 18 : 72, 0, 0));
        this.e1.setOnTouchListener(new oh.d(2));
        this.h1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.i1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.j1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.g1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), k7.b6.n(5, -1));
        this.n1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.k1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.l1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.m1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.p1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.o1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.q1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.i1.setOnLongClickListener(new zv(this, 0));
        arrayList.add(this.h1);
        arrayList.add(this.j1);
        arrayList.add(this.i1);
        arrayList.add(this.g1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.P3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new sv(this, 6));
                showDialog(alertDialog$Builder.a, new nv(this, 1));
                this.P3 = str;
                return;
            }
        }
    }

    public final void M3() {
        xx xxVar = this.z0;
        if ((xxVar != null && xxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        xx xxVar2 = new xx(this, getParentActivity(), this, this.k2 != null ? 2 : !this.i2 ? 1 : 0, this.O0, this.S2, this.U2, new tx(this, 1));
        this.z0 = xxVar2;
        ((hy) this.fragmentView).addView(xxVar2, this.y0);
        xx xxVar3 = this.z0;
        xxVar3.V.R = new zx(this);
        xxVar3.f0.setOnItemClickListener(new sv(this, 1));
        this.z0.k0.setOnItemClickListener(new sv(this, 2));
        this.z0.r0.setOnItemClickListener(new wv(this, 0));
        this.z0.k0.setOnItemLongClickListener(new sv(this, 3));
        this.z0.S.setOnItemClickListener(new sv(this, 4));
        this.z0.S.setOnItemLongClickListener(new tx(this, 2));
        this.z0.setFilteredSearchViewDelegate(new sv(this, 5));
        this.z0.setAlpha(0.0f);
        this.z0.setScaleX(1.05f);
        this.z0.setScaleY(1.05f);
        this.z0.setVisibility(8);
        this.z0.setBlurredBackgroundDrawableFactory(this.n4);
    }

    public final void M4(long j10, View view) {
        i3(j10, view);
        boolean s6 = this.actionBar.s();
        ArrayList arrayList = this.F2;
        boolean z4 = true;
        char c3 = 1;
        int i10 = 0;
        if (!s6) {
            if (this.m3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.f5)) {
                    yh.z(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            this.actionBar.O(null, null);
            int i11 = this.b0[0].s;
            ArrayList<TLRPC.Dialog> R3 = ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) ? R3(this.currentAccount, this.b0[0].s, this.S2, this.P1) : getMessagesController().getDialogs(this.S2);
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
                if (this.b0 != null) {
                    int i14 = 0;
                    while (true) {
                        ny[] nyVarArr = this.b0;
                        if (i14 >= nyVarArr.length) {
                            break;
                        }
                        nyVarArr[i14].d.E = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.m3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.r3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.r3 = ValueAnimator.ofFloat(this.q3, 1.0f);
            int i16 = 0;
            while (true) {
                ny[] nyVarArr2 = this.b0;
                if (i16 >= nyVarArr2.length) {
                    break;
                }
                ny nyVar = nyVarArr2[i16];
                if (nyVar != null) {
                    nyVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.H ? 81 : 0) + 48) + this.K);
            if (max != 0.0f) {
                this.M = (int) max;
                this.fragmentView.requestLayout();
            }
            this.r3.addUpdateListener(new tv(this, max, i10));
            this.r3.addListener(new rx(this, max, c3 == true ? 1 : 0));
            this.r3.setInterpolator(org.telegram.ui.Components.nr.f);
            this.r3.setDuration(200L);
            this.r3.start();
            nw nwVar = this.w0;
            if (nwVar != null) {
                nwVar.b(org.telegram.ui.ActionBar.j6.Gh, org.telegram.ui.ActionBar.j6.Fh, org.telegram.ui.ActionBar.j6.Eh, org.telegram.ui.ActionBar.j6.Hh, org.telegram.ui.ActionBar.j6.w8);
            }
            org.telegram.ui.ActionBar.i2 i2Var = this.b1;
            if (i2Var != null) {
                i2Var.c(1.0f, true);
            }
            z4 = false;
        } else if (arrayList.isEmpty()) {
            b4(true);
            return;
        }
        T4(false);
        this.e1.a(arrayList.size(), z4);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.v0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new sx(this, parentActivity);
                FrameLayout.LayoutParams d = k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.d4 + this.f4 + d.bottomMargin;
                hy hyVar = (hy) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.u0 + 1;
                this.u0 = i11;
                hyVar.addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j10, View view) {
        int i10 = -this.J3;
        this.J3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.qc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.qc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new mv(this, 22))).j();
    }

    public final void O3(final long j10, final long j11, boolean z4, final kf1 kf1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j10)) {
            int i10 = this.O0;
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new lh.x2(this, d2Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    d2Var.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            int i11 = 1;
            if (!z4 || ((this.c2 == null || this.d2 == null) && this.e2 == null)) {
                if (i10 != 15) {
                    if (this.z2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.z2.w(this, arrayList, null, false, this.G2, this.H2, this.I2, kf1Var) && this.f2) {
                        this.z2 = null;
                        return;
                    }
                    return;
                }
                Runnable vVar = new i5.v(this, j10, new i5.x(this, j10, j11, kf1Var, 13), 25);
                if (j10 < 0) {
                    Q4(getMessagesController().getChat(Long.valueOf(-j10)), vVar, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.E));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                d2Var2.O = formatString;
                d2Var2.Q = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new fu(vVar, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.kh0(19));
                showDialog(d2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.y3.n(getMessagesController(), j10).user_id));
                if (user5 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.c2, UserObject.getUserName(user5));
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
                if (this.e2 != null) {
                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.e2, str3);
                    string2 = LocaleController.getString(R.string.Add);
                } else {
                    string = LocaleController.getString(R.string.SendMessageTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.d2, str3);
                    string2 = LocaleController.getString(R.string.Send);
                }
                String str4 = formatStringSimple;
                str = string;
                str2 = str4;
            } else if (j10 == getUserConfig().getClientUserId()) {
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.d2, LocaleController.getString(R.string.SavedMessages));
                string2 = LocaleController.getString(R.string.Send);
            } else {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (user6 == null || this.c2 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.c2, UserObject.getUserName(user6));
                string2 = LocaleController.getString(R.string.Send);
            }
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.a;
            d2Var3.O = str;
            d2Var3.Q = AndroidUtilities.replaceTags(str2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mw
                @Override // org.telegram.ui.ActionBar.c2
                public final void i(org.telegram.ui.ActionBar.d2 d2Var4, int i12) {
                    oy.this.O3(j10, j11, false, kf1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(d2Var3) == null) {
                d2Var3.show();
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
    public final void O4(boolean z4, boolean z10, boolean z11, boolean z12) {
        xx xxVar;
        xx xxVar2;
        gx gxVar;
        xx xxVar3;
        boolean z13;
        xx xxVar4;
        boolean z14;
        org.telegram.ui.Components.k81 k81Var;
        TLRPC.Chat chat;
        jx jxVar;
        boolean z15 = z11;
        this.b.a(z4, z15);
        int i10 = 0;
        if (z4) {
            M3();
        } else {
            c5(false);
        }
        int i11 = this.O0;
        if (i11 != 0 && i11 != 3) {
            z15 = false;
        }
        AnimatorSet animatorSet = this.t1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.t1 = null;
        }
        this.m3 = z4;
        m3();
        if (z4) {
            if (!this.p3 && !z12) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.i2 || (totalDialogsCount <= 10 && !this.H)) {
                    z13 = true;
                    xxVar4 = this.z0;
                    if (xxVar4 != null) {
                        xxVar4.L0 = z13;
                    }
                    z14 = z13 || this.H;
                    this.o3 = z14;
                    if (z14) {
                        this.p3 = true;
                    }
                    k81Var = this.X;
                    if (k81Var != null && xxVar4 != null && !z13 && this.U2 == 0) {
                        org.telegram.ui.Components.k81 n10 = xxVar4.n(-2, false);
                        this.X = n10;
                        this.W.addView(n10, 0, k7.b6.e(-1, -1, 119));
                    } else if (this.W != null && z13 && this.U2 == 0) {
                        AndroidUtilities.removeFromParent(k81Var);
                        this.X = null;
                    }
                    if (this.z0 != null) {
                        G3(false);
                        this.z0.setKeyboardHeight(((hy) this.fragmentView).getKeyboardHeight());
                        xx xxVar5 = this.z0;
                        xxVar5.x0.clear();
                        xxVar5.J();
                    }
                    chat = this.V2;
                    if (chat == null) {
                        tf.e0 e0Var = new tf.e0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        e0Var.f = this.V2;
                        j3(e0Var);
                    } else if (this.S2 != 0 && ((jxVar = this.C3) == null || !jxVar.c())) {
                        j3(new tf.e0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z13 = false;
            xxVar4 = this.z0;
            if (xxVar4 != null) {
            }
            if (z13) {
            }
            this.o3 = z14;
            if (z14) {
            }
            k81Var = this.X;
            if (k81Var != null) {
            }
            if (this.W != null) {
                AndroidUtilities.removeFromParent(k81Var);
                this.X = null;
            }
            if (this.z0 != null) {
            }
            chat = this.V2;
            if (chat == null) {
            }
        }
        if (z15 && (xxVar3 = this.z0) != null && xxVar3.V.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z4 && (gxVar = this.B0) != null && this.D0) {
            gxVar.setVisibility(0);
        }
        boolean z16 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z15) {
            if (z4) {
                xx xxVar6 = this.z0;
                if (xxVar6 != null) {
                    xxVar6.setVisibility(0);
                    xx xxVar7 = this.z0;
                    xxVar7.setPosition(0);
                    if (xxVar7.V.h() > 0) {
                        xxVar7.W.h1(0, 0);
                    }
                    f2.i0 i0Var = xxVar7.e0;
                    if (i0Var != null) {
                        i0Var.h1(0, 0);
                    }
                    f2.i0 i0Var2 = xxVar7.j0;
                    if (i0Var2 != null) {
                        i0Var2.h1(0, 0);
                    }
                    f2.i0 i0Var3 = xxVar7.q0;
                    if (i0Var3 != null) {
                        i0Var3.h1(0, 0);
                    }
                    xxVar7.h.clear();
                }
                W4(true, null, null, false, false);
                org.telegram.ui.Components.k81 k81Var2 = this.X;
                if (k81Var2 != null) {
                    k81Var2.b(false, false);
                }
            } else {
                this.b0[0].a.setVisibility(0);
                this.b0[0].setVisibility(0);
            }
            A4(true, true);
            this.b0[0].a.setVerticalScrollBarEnabled(false);
            xx xxVar8 = this.z0;
            if (xxVar8 != null) {
                xxVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
            this.t1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ny nyVar = this.b0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(nyVar, (Property<ny, Float>) property, z4 ? 0.0f : 1.0f));
            if (z16) {
                this.b0[0].setScaleX(1.0f);
                this.b0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.b0[0], (Property<ny, Float>) View.SCALE_X, z4 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0[0], (Property<ny, Float>) View.SCALE_Y, z4 ? 0.95f : 1.0f));
            }
            jx jxVar2 = this.C3;
            if (jxVar2 != null) {
                jxVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.C3, (Property<jx, Float>) property, z4 ? 0.0f : 1.0f));
            }
            xx xxVar9 = this.z0;
            if (xxVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(xxVar9, (Property<xx, Float>) property, z4 ? 1.0f : 0.0f));
                if (this.H) {
                    float dp = AndroidUtilities.dp(81.0f) + this.K + AndroidUtilities.dp(48.0f);
                    xx xxVar10 = this.z0;
                    float f10 = z4 ? dp : 0.0f;
                    if (z4) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(xxVar10, this.E3, f10, dp));
                }
                if (z16) {
                    this.z0.setScaleX(1.0f);
                    this.z0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.z0, (Property<xx, Float>) View.SCALE_X, z4 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.z0, (Property<xx, Float>) View.SCALE_Y, z4 ? 1.0f : 1.05f));
                }
            }
            if (this.d0 != null) {
                Z4(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u1, z4 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ov(this, 1));
            arrayList.add(ofFloat);
            this.t1.playTogether(arrayList);
            this.t1.setDuration(z4 ? 200L : 180L);
            this.t1.setInterpolator(org.telegram.ui.Components.nr.g);
            if (!z4) {
                this.t1.setStartDelay(20L);
            }
            this.t1.addListener(new px(this, z4, i10));
            this.l3.lock();
            this.t1.start();
        } else {
            A4(false, true);
            if (z4) {
                this.b0[0].a.c1();
            } else {
                ky kyVar = this.b0[0].a;
                if (kyVar.f1) {
                    kyVar.f1 = false;
                    kyVar.J0(false);
                }
            }
            this.b0[0].setAlpha(z4 ? 0.0f : 1.0f);
            if (z16) {
                this.b0[0].setScaleX(1.0f);
                this.b0[0].setScaleY(1.0f);
            } else {
                this.b0[0].setScaleX(z4 ? 0.95f : 1.0f);
                this.b0[0].setScaleY(z4 ? 0.95f : 1.0f);
            }
            xx xxVar11 = this.z0;
            if (xxVar11 != null) {
                xxVar11.setAlpha(z4 ? 1.0f : 0.0f);
                if (z16) {
                    this.z0.setScaleX(1.0f);
                    this.z0.setScaleY(1.0f);
                } else {
                    this.z0.setScaleX(z4 ? 1.0f : 1.1f);
                    this.z0.setScaleY(z4 ? 1.0f : 1.1f);
                }
                this.z0.setVisibility(z4 ? 0 : 8);
            }
            ey eyVar = this.U;
            if (eyVar != null) {
                eyVar.setTranslationY(W3() + (z4 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.B0 != null) {
                if (!this.D0 || isInPreviewMode() || z4) {
                    this.B0.setVisibility(8);
                } else {
                    this.B0.setVisibility(0);
                }
            }
            D4(z4 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.x;
        if (i12 >= 0 && (xxVar2 = this.z0) != null) {
            xxVar2.setPosition(xxVar2.L(i12));
        }
        if (!z4) {
            this.x = -1;
        }
        if (z4 && z10 && (xxVar = this.z0) != null) {
            xxVar.setPosition((xxVar.n0 ? 1 : 0) + 5);
            c5(true);
        }
        F3();
        U4();
    }

    public final void P3(long j10, boolean z4) {
        if (this.b0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ny[] nyVarArr = this.b0;
            if (i10 >= nyVarArr.length) {
                return;
            }
            int childCount = nyVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.b0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                        if (r2Var.getDialogId() == j10) {
                            r2Var.V(z4, true);
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
        if (this.J0 != null || SharedConfig.appLocked || (this.H && !this.B0.g())) {
            return;
        }
        g61[] g61VarArr = new g61[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            this.A3.f();
            Drawable drawable = this.A3.f[0];
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
            org.telegram.ui.Cells.o oVar = this.B3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i11 = dp;
        }
        kx kxVar = new kx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), g61VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            kxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l10 = this.y3;
        if (l10 != null) {
            kxVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.A3.f[0];
            kxVar.setSelected(drawable2 instanceof org.telegram.ui.Components.l5 ? Long.valueOf(((org.telegram.ui.Components.l5) drawable2).i()) : null);
        }
        kxVar.setSaveState(1);
        kxVar.y(this.A3, titleTextView);
        lx lxVar = new lx(this, kxVar);
        this.J0 = lxVar;
        g61VarArr[0] = lxVar;
        lxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        g61VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.D.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.p2, org.telegram.ui.oy] */
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
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 2;
        int i11 = 1;
        String formatString2 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = formatString2;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.D.bot_participant;
        ?? r92 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().isInChatCached(chat, user)) {
            charSequence = r92;
        }
        if (this.D.bot_admin_rights == null) {
            formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
        } else {
            int i12 = R.string.AreYouSureSendChatToBotAddRights;
            String firstName = UserObject.getFirstName(user);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.D.bot_admin_rights;
            int i13 = org.telegram.ui.Cells.q6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                b.r(isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                b.r(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                b.r(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                b.r(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                b.r(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                b.r(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                b.r(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                b.r(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                b.r(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                b.r(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                b.r(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
            }
            if (arrayList.size() == 1) {
                r92 = ((org.telegram.ui.Cells.r6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r92 = new SpannableStringBuilder();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 > 0) {
                        r92.append(", ");
                    }
                    r92.append(((org.telegram.ui.Cells.r6) arrayList.get(i14)).b.toString().toLowerCase());
                }
            }
            formatString = LocaleController.formatString(i12, new Object[]{firstName, str, r92});
        }
        charSequence = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(formatString));
        d2Var.Q = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new gf(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new gf(i10, runnable2));
        showDialog(d2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList R3(int i10, int i11, int i12, boolean z4) {
        boolean z10;
        ArrayList arrayList;
        if (z4 && (arrayList = this.O1) != null) {
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
            if (messagesController.dialogsMyChannels.size() > 0 && this.v2) {
                arrayList2.add(new jy(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.s2) {
                arrayList2.add(new jy(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.v2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.s2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new jy(2));
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
            return dialogFilter == null ? messagesController.getDialogs(i12) : this.O0 == 3 ? dialogFilter.dialogsForward : dialogFilter.dialogs;
        }
        if (i11 == 9) {
            return messagesController.dialogsForBlock;
        }
        if (i11 != 1 && i11 != 16 && i11 != 14) {
            if (i11 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            TLRPC.User user = messagesController.getUser(Long.valueOf(this.E));
            TLRPC.RequestPeerType requestPeerType = this.D;
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
                ArrayList<TLRPC.Dialog> arrayList5 = this.D instanceof TLRPC.TL_requestPeerTypeChat ? messagesController.dialogsGroupsOnly : messagesController.dialogsChannelsOnly;
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
        ArrayList arrayList6 = this.Q3;
        if (arrayList6 != null) {
            return arrayList6;
        }
        this.Q3 = new ArrayList();
        r2 = i11 == 16;
        if (this.w2 || this.x2 || r2) {
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
                            if (this.x2) {
                                if (UserObject.isUserSelf(user3)) {
                                }
                            }
                        } else if (this.w2) {
                            if (UserObject.isUserSelf(user3)) {
                            }
                        }
                        this.Q3.add(dialog7);
                    } else if (!UserObject.isService(user3.id) && !MessagesController.isSupportUser(user3)) {
                        this.Q3.add(dialog7);
                    }
                }
            }
        }
        if (this.s2 || (((z10 = this.u2) && this.t2) || r2)) {
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
                            this.Q3.add(dialog9);
                        }
                    } else if (messagesController.canAddToForward(dialog9)) {
                        this.Q3.add(dialog9);
                    }
                }
            }
        } else if (z10 || this.t2 || r2) {
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
                            this.Q3.add(dialog11);
                        }
                    } else if (messagesController.canAddToForward(dialog11)) {
                        if (this.u2) {
                            if (!ChatObject.isMegagroup(chat3)) {
                                this.Q3.add(dialog11);
                            }
                        }
                        if (this.t2 && ChatObject.isMegagroup(chat3)) {
                            this.Q3.add(dialog11);
                        }
                    }
                }
            }
        }
        if (this.v2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList10 = messagesController.dialogsChannelsOnly;
            int size7 = arrayList10.size();
            while (r1 < size7) {
                TLRPC.Dialog dialog12 = arrayList10.get(r1);
                r1++;
                TLRPC.Dialog dialog13 = dialog12;
                TLRPC.Chat chat4 = messagesController.getChat(Long.valueOf(-dialog13.id));
                if (r2) {
                    if (chat4 instanceof TLRPC.TL_channel) {
                        this.Q3.add(dialog13);
                    }
                } else if (messagesController.canAddToForward(dialog13)) {
                    this.Q3.add(dialog13);
                }
            }
        }
        getMessagesController().sortDialogsList(this.Q3);
        return this.Q3;
    }

    public final void R4(boolean z4) {
        ny[] nyVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            nyVarArr = this.b0;
            if (i11 >= nyVarArr.length) {
                break;
            }
            nyVarArr[i11].a.B0();
            i11++;
        }
        char c3 = (!z4 || nyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = nyVarArr[c3].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.b0[c3].h);
        if (dialogFilter.isDefault()) {
            ny nyVar = this.b0[c3];
            nyVar.s = this.O0;
            ky kyVar = nyVar.a;
            int i13 = ky.s3;
            kyVar.A1();
        } else {
            ny[] nyVarArr2 = this.b0;
            if (nyVarArr2[c3 ^ 1].s == 7) {
                nyVarArr2[c3].s = 8;
            } else {
                nyVarArr2[c3].s = 7;
            }
            nyVarArr2[c3].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.b0[c3].s == 8 ? 1 : 0);
        }
        ny[] nyVarArr3 = this.b0;
        if (nyVarArr3.length > 1) {
            nyVarArr3[1].B = dialogFilter.locked;
        }
        ny nyVar2 = nyVarArr3[c3];
        ww wwVar = nyVar2.d;
        wwVar.h = nyVar2.s;
        wwVar.l();
        ny nyVar3 = this.b0[c3];
        sw swVar = nyVar3.c;
        if (nyVar3.s == 0 && Z3() && this.b0[c3].v == 2) {
            i10 = 1;
        }
        swVar.h1(i10, (int) this.K);
        r3(this.b0[c3]);
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.ug0
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        jx jxVar;
        eg.h0 h0Var;
        nw nwVar;
        if (!this.m3 && (((jxVar = this.C3) == null || !jxVar.c()) && (((h0Var = this.H0) == null || h0Var.getVisibility() != 0) && ((nwVar = this.w0) == null || !nwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                nw nwVar2 = this.w0;
                boolean z10 = nwVar2 == null || nwVar2.getTabsCount() < 2 || this.w0.getCurrentTabId() == this.w0.getFirstTabId();
                nw nwVar3 = this.w0;
                boolean z11 = nwVar3 == null || nwVar3.getTabsCount() < 2 || this.w0.getCurrentTabId() == this.w0.getLastTabId();
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (!z4) {
                    return z10;
                }
                if (!z11 || z10) {
                }
            }
            return true;
        }
        return false;
    }

    public final float S3(boolean z4) {
        return (z4 ? 1.0f - this.b.e : 1.0f) * (1.0f - V3()) * this.r.e;
    }

    public final void S4() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        a41 a41Var = this.W;
        float measuredHeight = (a41Var == null || a41Var.getVisibility() == 8) ? 0.0f : this.W.getMeasuredHeight();
        float dp = this.H ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.H) {
            float f17 = this.K;
            float f18 = this.u1;
            f10 = (measuredHeight * f18) + e2.c.w(1.0f, f18, dp, f17);
            f11 = this.t3;
        } else {
            f10 = (measuredHeight * this.u1) + this.K;
            f11 = this.t3;
        }
        float f19 = f10 + f11 + this.Q;
        ey eyVar = this.U;
        float dp2 = AndroidUtilities.dp(4.0f) * ((eyVar == null || eyVar.getVisibility() != 0) ? 0.0f : this.U.getAlpha());
        nw nwVar = this.w0;
        if (nwVar != null) {
            nwVar.setTranslationY(f19 - dp2);
            f13 = this.w0.getAlpha();
            f14 = AndroidUtilities.dp(43.0f) * f13;
            f12 = f19 + f14;
        } else {
            f12 = f19;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        org.telegram.ui.Components.js jsVar = this.G1;
        if (jsVar != null) {
            jsVar.setTranslationY(AndroidUtilities.lerp(f12 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.X == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f15 = this.G1.getMetadata().c.a;
            f16 = this.G1.c(0.0f);
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.is isVar = this.H1;
        if (isVar != null) {
            isVar.setTranslationY(f19 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f15, f13));
            org.telegram.ui.Components.is isVar2 = this.H1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f16 + f14) - lerp);
            Matrix matrix = isVar2.b;
            if (isVar2.e != lerp || isVar2.f != min) {
                isVar2.e = lerp;
                isVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = isVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                isVar2.invalidate();
            }
            this.H1.setAlpha(Math.max(f13, f15));
        }
    }

    public final int T3() {
        if (!this.H) {
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
    public final void T4(boolean z4) {
        boolean z10;
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        nw nwVar;
        org.telegram.ui.Components.g00 d;
        long j10;
        TLRPC.User user;
        this.R2 = false;
        this.P2 = 0;
        this.M2 = 0;
        this.L2 = 0;
        this.K2 = 0;
        this.J2 = 0;
        this.Q2 = 0;
        this.N2 = 0;
        this.O2 = 0;
        if (z4) {
            return;
        }
        ArrayList arrayList = this.F2;
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
                boolean z11 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().isForum(j11)) {
                    this.Q2++;
                }
                int i17 = i14;
                int i18 = i15;
                if (getMessagesController().isDialogMuted(j11, 0L)) {
                    this.M2++;
                } else {
                    this.L2++;
                }
                if (z11) {
                    this.J2++;
                }
                if (this.S2 == 1 || dialog.folder_id == 1) {
                    this.P2++;
                } else if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().isPromoDialog(j11, false)) {
                    i14 = i17 + 1;
                    if (dialog.community_id != 0) {
                        i12++;
                    }
                    if (DialogObject.isUserDialog(j11) || j11 == j10 || j11 == UserObject.VERIFY || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j11)))) {
                        i16++;
                    } else if (org.telegram.messenger.y3.v("dialog_bar_report", j11, notificationsSettings, true)) {
                        this.O2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(getMessagesController(), dialog.id);
                            user = n10 != null ? getMessagesController().getUser(Long.valueOf(n10.user_id)) : new TLRPC.TL_userEmpty();
                        } else {
                            user = (isChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                        }
                        if (user != null && user.bot) {
                            MessagesController.isSupportUser(user);
                        }
                        if (g42) {
                            i15 = i18 + 1;
                        } else {
                            this.K2++;
                            i15 = i18;
                        }
                    } else {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j11));
                        if (getMessagesController().isPromoDialog(dialog.id, true)) {
                            this.N2++;
                            if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                i11++;
                                this.R2 = true;
                            }
                            i15 = i18;
                        } else {
                            if (g42) {
                                i15 = i18 + 1;
                            } else {
                                this.K2++;
                                i15 = i18;
                            }
                            if (chat == null || !chat.megagroup) {
                                this.N2++;
                            } else if (ChatObject.isPublic(chat)) {
                                this.N2++;
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
        org.telegram.ui.ActionBar.w0 w0Var3 = this.g1;
        if (w0Var3 != null) {
            if (i11 != size || i12 > 0) {
                w0Var3.setVisibility(8);
            } else {
                w0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = this.o1;
        if (g1Var2 != null) {
            int i21 = this.N2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                g1Var2.setVisibility(0);
                if (this.N2 != 0) {
                    this.o1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.o1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                g1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.n1;
        if (g1Var3 != null && this.j1 != null) {
            if (this.P2 != 0 && i12 == 0 && this.U2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.n1.g(string, R.drawable.msg_unarchive, null);
                this.j1.setIcon(R.drawable.msg_unarchive);
                this.j1.setContentDescription(string);
                nw nwVar2 = this.w0;
                if (nwVar2 == null || nwVar2.getVisibility() != 0) {
                    this.n1.setVisibility(0);
                    this.j1.setVisibility(8);
                } else {
                    this.j1.setVisibility(0);
                    this.n1.setVisibility(8);
                }
            } else if (i19 != 0 && i12 == 0 && this.U2 == 0) {
                String string2 = LocaleController.getString(R.string.Archive);
                this.n1.g(string2, R.drawable.msg_archive, null);
                this.j1.setIcon(R.drawable.msg_archive);
                this.j1.setContentDescription(string2);
                nw nwVar3 = this.w0;
                if (nwVar3 == null || nwVar3.getVisibility() != 0) {
                    this.n1.setVisibility(0);
                    this.j1.setVisibility(8);
                } else {
                    this.j1.setVisibility(0);
                    this.n1.setVisibility(8);
                }
            } else {
                g1Var3.setVisibility(8);
                this.j1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var4 = this.h1;
        if (w0Var4 != null && this.k1 != null) {
            if (this.K2 + i20 == size && this.U2 == 0) {
                nw nwVar4 = this.w0;
                if (nwVar4 == null || nwVar4.getVisibility() != 0) {
                    this.h1.setVisibility(0);
                    this.k1.setVisibility(8);
                } else {
                    this.k1.setVisibility(0);
                    this.h1.setVisibility(8);
                }
            } else {
                w0Var4.setVisibility(8);
                this.k1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.q1;
        if (g1Var4 != null) {
            if (i16 != 0) {
                g1Var4.setVisibility(8);
            } else {
                g1Var4.setVisibility(0);
            }
        }
        if (this.m1 != null) {
            nw nwVar5 = this.w0;
            boolean z12 = nwVar5 == null || nwVar5.getVisibility() != 0 || ((d = (nwVar = this.w0).d()) != null && d.a == nwVar.I);
            if (!z12) {
                try {
                    z12 = size >= R3(this.currentAccount, this.b0[0].d.h, this.S2, this.P1).size();
                } catch (Exception unused) {
                }
            }
            if (!z12) {
                z10 = false;
                this.m1.setVisibility(0);
                if (this.l1 != null) {
                    if (this.S2 != 1) {
                        if (this.w0 != null && S3(z10) > 0.5f) {
                            nw nwVar6 = this.w0;
                            org.telegram.ui.Components.g00 d10 = nwVar6.d();
                            if (d10 != null && d10.a == nwVar6.I) {
                                int i22 = org.telegram.ui.Components.n00.w;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i23 = 0; i23 < size2; i23++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                                    if (!org.telegram.ui.Components.n00.H(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                                        arrayList2.add(dialogFilter);
                                    }
                                }
                            }
                        }
                        this.l1.setVisibility(8);
                    }
                    this.l1.setVisibility(0);
                }
                w0Var = this.i1;
                if (w0Var != null) {
                    if (this.M2 != 0) {
                        w0Var.setIcon(R.drawable.msg_unmute);
                        this.i1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    } else {
                        w0Var.setIcon(R.drawable.msg_mute);
                        this.i1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                    }
                }
                g1Var = this.p1;
                if (g1Var != null) {
                    if (this.J2 != 0) {
                        g1Var.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                        this.p1.setVisibility(0);
                    } else if (this.Q2 == 0 && i12 == 0) {
                        g1Var.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                        this.p1.setVisibility(0);
                    } else {
                        g1Var.setVisibility(8);
                    }
                }
                w0Var2 = this.h1;
                if (w0Var2 != null || this.k1 == null) {
                }
                if (this.K2 != 0) {
                    w0Var2.setIcon(R.drawable.msg_pin);
                    this.h1.setContentDescription(LocaleController.getString(R.string.PinToTop));
                    this.k1.setText(LocaleController.getString(R.string.DialogPin));
                    return;
                } else {
                    w0Var2.setIcon(R.drawable.msg_unpin);
                    this.h1.setContentDescription(LocaleController.getString(R.string.UnpinFromTop));
                    this.k1.setText(LocaleController.getString(R.string.DialogUnpin));
                    return;
                }
            }
            this.m1.setVisibility(8);
        }
        z10 = false;
        if (this.l1 != null) {
        }
        w0Var = this.i1;
        if (w0Var != null) {
        }
        g1Var = this.p1;
        if (g1Var != null) {
        }
        w0Var2 = this.h1;
        if (w0Var2 != null) {
        }
    }

    public final int U3() {
        if (this.H) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4() {
        long j10;
        boolean z4;
        boolean z10;
        String str;
        ApplicationLoader applicationLoader;
        boolean z11;
        String next;
        boolean z12;
        StringBuilder sb;
        final long j11;
        final long j12;
        jx jxVar;
        xd.a aVar;
        xd.a aVar2;
        jx jxVar2;
        boolean z13;
        jx jxVar3;
        if (this.G1 == null || this.J1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.z2 z2Var = this.J1;
        final int i10 = 0;
        if (z2Var != null) {
            try {
                ((org.telegram.ui.Components.gj0) ((org.telegram.ui.Components.z8) z2Var.h.getImageReceiver().getStaticThumb()).B).s0 = null;
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.z2 z2Var2 = this.J1;
            z2Var2.setCompact(false);
            z2Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.p9 p9Var = z2Var2.h;
            p9Var.setVisibility(8);
            p9Var.b();
        }
        int i11 = 4;
        long j13 = 0;
        final int i12 = 1;
        if (isInPreviewMode()) {
            str = null;
        } else {
            if (getMessagesController().isFrozen()) {
                this.J1.setOnClickListener(new rv(this, 12));
                this.J1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i13 = 19;
                if (this.S2 == 0 && this.U2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.J1.setOnClickListener(new rv(this, i13));
                    this.J1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.J1.c, new dw(this, i11)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.J1.setOnCloseListener(new rv(this, 24));
                } else if (this.S2 == 0 && this.U2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.J1.setOnClickListener(new rv(this, 25));
                    this.J1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.J1.c, new dw(this, i11)), LocaleController.getString(R.string.GraceMessage));
                    this.J1.setOnCloseListener(new rv(this, 26));
                } else if (this.S2 == 0 && this.U2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.J1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.J1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.J1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.J1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.J1.d.getPaint().getFontMetricsInt()));
                    this.J1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.iw
                        public final /* synthetic */ oy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    af.g.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    oy.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.J1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.iw
                        public final /* synthetic */ oy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    af.g.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    oy.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.S2 == 0 && this.U2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        lh.t7 y10 = lh.t7.y(this.currentAccount, false);
                        ArrayList arrayList = y10.z;
                        if (!arrayList.isEmpty()) {
                            long j14 = -y10.f.amount;
                            int i14 = 0;
                            while (i14 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i14);
                                long j15 = j13;
                                long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
                                if (peerDialogId >= j15) {
                                    if (getMessagesController().getUser(Long.valueOf(peerDialogId)) == null) {
                                        i14++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i14++;
                                    j13 = j15;
                                } else {
                                    if (getMessagesController().getChat(Long.valueOf(-peerDialogId)) == null) {
                                        i14++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i14++;
                                    j13 = j15;
                                }
                            }
                            j10 = j13;
                            if (j14 > j10) {
                                lh.t7 y11 = lh.t7.y(this.currentAccount, false);
                                ArrayList arrayList2 = y11.z;
                                StringBuilder sb2 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb = sb2;
                                    j11 = j10;
                                    j12 = j11;
                                } else {
                                    long j16 = j10;
                                    j12 = j16;
                                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i15);
                                        long peerDialogId2 = DialogObject.getPeerDialogId(starsSubscription2.peer);
                                        if (j12 == j10) {
                                            j12 = peerDialogId2;
                                        }
                                        if (peerDialogId2 >= j10) {
                                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerDialogId2));
                                            if (user != null) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(UserObject.getUserName(user));
                                                j16 += starsSubscription2.pricing.amount;
                                            }
                                        } else {
                                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-peerDialogId2));
                                            if (chat != null) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(chat.title);
                                                j16 += starsSubscription2.pricing.amount;
                                            }
                                        }
                                    }
                                    sb = sb2;
                                    j11 = j16;
                                }
                                final String sb3 = sb.toString();
                                this.J1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        oy oyVar = oy.this;
                                        new lh.z9(oyVar.getParentActivity(), oyVar.getResourceProvider(), j11, 2, sb3, new mv(oyVar, 16), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.z2 z2Var3 = this.J1;
                                long j17 = j11 - y11.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                z2Var3.b(lh.ja.X0(false, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j11, sb3), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.J1.setOnCloseListener(new rv(this, 13));
                                z12 = true;
                                str = null;
                                jxVar = this.C3;
                                aVar = this.b;
                                if ((jxVar != null && jxVar.c()) || aVar.f) {
                                    z12 = false;
                                }
                                this.G1.i(this.J1, z12, true);
                                q3(true);
                                if (this.fragmentView != null || this.G1 == null) {
                                    aVar2 = aVar;
                                } else {
                                    boolean z14 = !isInPreviewMode() && this.S2 == 0 && this.U2 == 0 && this.O0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((jxVar3 = this.C3) == null || !jxVar3.c()) && !aVar.f;
                                    if (z14) {
                                        if (this.K1 == null) {
                                            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(getParentActivity());
                                            this.K1 = saVar;
                                            this.G1.addView(saVar);
                                        }
                                        org.telegram.ui.Cells.sa saVar2 = this.K1;
                                        int i16 = this.currentAccount;
                                        TextView textView = saVar2.b;
                                        TextView textView2 = saVar2.c;
                                        ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList3 = MessagesController.getInstance(i16).getUnconfirmedAuthController().auths;
                                        org.telegram.ui.Cells.ra raVar = saVar2.d;
                                        raVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                                        raVar.a(false, false);
                                        org.telegram.ui.Cells.ra raVar2 = saVar2.e;
                                        raVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                                        raVar2.a(false, false);
                                        if (arrayList3 == null || arrayList3.size() != 1) {
                                            aVar2 = aVar;
                                            if (arrayList3 != null && arrayList3.size() > 1) {
                                                textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
                                                String str2 = arrayList3.get(0).location;
                                                int i17 = 1;
                                                while (true) {
                                                    if (i17 >= arrayList3.size()) {
                                                        break;
                                                    }
                                                    if (!TextUtils.equals(str2, arrayList3.get(i17).location)) {
                                                        str2 = str;
                                                        break;
                                                    }
                                                    i17++;
                                                }
                                                if (str2 == null) {
                                                    textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultiple", arrayList3.size(), new Object[0]));
                                                } else {
                                                    textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultipleFrom", arrayList3.size(), str2));
                                                }
                                            }
                                            z13 = false;
                                        } else {
                                            UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList3.get(0);
                                            textView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
                                            String str3 = "" + unconfirmedAuth.device;
                                            if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str3.isEmpty()) {
                                                str3 = str3.concat(", ");
                                            }
                                            StringBuilder l10 = e2.c.l(str3);
                                            l10.append(unconfirmedAuth.location);
                                            String sb4 = l10.toString();
                                            if (unconfirmedAuth.bot) {
                                                int i18 = R.string.UnconfirmedAuthSingleBot;
                                                StringBuilder sb5 = new StringBuilder("@");
                                                aVar2 = aVar;
                                                sb5.append(DialogObject.getShortName(unconfirmedAuth.bot_id));
                                                textView2.setText(LocaleController.formatString(i18, sb5.toString(), sb4));
                                                z13 = true;
                                            } else {
                                                aVar2 = aVar;
                                                textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, sb4));
                                                z13 = false;
                                            }
                                        }
                                        raVar.setOnClickListener(new org.telegram.ui.Cells.pa(this, z13, i16, arrayList3));
                                        raVar2.setOnClickListener(new dg.m2(saVar2, i16, arrayList3, 4));
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    org.telegram.ui.Cells.sa saVar3 = this.K1;
                                    if (saVar3 != null) {
                                        this.G1.i(saVar3, z14, true);
                                    }
                                }
                                if (this.fragmentView == null || this.G1 == null) {
                                    return;
                                }
                                boolean z15 = !isInPreviewMode() && this.S2 == 0 && this.U2 == 0 && this.O0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((jxVar2 = this.C3) == null || !jxVar2.c()) && !aVar2.f;
                                if (z15 && this.I1 == null) {
                                    org.telegram.ui.Cells.m mVar = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                                    this.I1 = mVar;
                                    this.G1.addView(mVar);
                                }
                                org.telegram.ui.Cells.m mVar2 = this.I1;
                                if (mVar2 != null) {
                                    this.G1.i(mVar2, z15, true);
                                    return;
                                }
                                return;
                            }
                            if (this.S2 != 0 && this.U2 == j10 && !getMessagesController().premiumPurchaseBlocked() && BirthdayController.getInstance(this.currentAccount).contains() && !getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                ArrayList<TLRPC.User> arrayList4 = state.today;
                                this.J1.setOnClickListener(new org.telegram.ui.Components.rx0(i13, this, state));
                                this.J1.a(this.currentAccount, arrayList4);
                                this.J1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList4.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList4.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList4.size(), new Object[0]), org.telegram.ui.ActionBar.j6.I6, 2, null), this.J1.c, new dw(this, 4)), LocaleController.formatString(arrayList4.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.J1.setOnCloseListener(new rv(this, 14));
                                lh.t7.y(this.currentAccount, false).V();
                            } else if (this.S2 != 0 && this.U2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                this.J1.setOnClickListener(new rv(this, 15));
                                this.J1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.J1.c, new dw(this, 4)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                this.J1.setOnCloseListener(new rv(this, 16));
                            } else {
                                int i19 = 18;
                                if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.S2 == 0 && this.U2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                                    this.J1.setOnClickListener(new dg.m(i19));
                                    this.J1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.j6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                    this.J1.setOnCloseListener(new rv(this, 17));
                                } else if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.S2 == 0 && this.U2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                    this.J1.setOnClickListener(new rv(this, i19));
                                    this.J1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.j6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                } else {
                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.S2 != 0 || this.U2 != j10 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) == null : BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null))) {
                                        z4 = false;
                                    } else {
                                        this.x3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                        z4 = true;
                                    }
                                    int i20 = 20;
                                    if (z4) {
                                        this.J1.setOnClickListener(new rv(this, i20));
                                        this.J1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.x3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.j6.I6, 2, null), LocaleController.getString(this.x3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                    } else {
                                        if (this.L1 != null && this.M1 != null) {
                                            if (r0.longValue() / this.M1.longValue() < 0.3f) {
                                                MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                            } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j10)) {
                                                z10 = true;
                                                int i21 = 21;
                                                if (!z10) {
                                                    this.J1.setOnClickListener(new rv(this, i21));
                                                    this.J1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.L1.longValue())), org.telegram.ui.ActionBar.j6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                } else if (this.S2 == 0 && this.U2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                    this.J1.setOnClickListener(new rv(this, 22));
                                                    this.J1.h.setVisibility(0);
                                                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                                                    z8Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                    long clientUserId = getUserConfig().getClientUserId();
                                                    z8Var.A = true;
                                                    z8Var.b = true;
                                                    z8Var.c = false;
                                                    int i22 = org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.z8.e(clientUserId)];
                                                    org.telegram.ui.ActionBar.f6 f6Var = z8Var.z;
                                                    z8Var.d = org.telegram.ui.ActionBar.j6.v0(i22, f6Var);
                                                    z8Var.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.z8.e(clientUserId)], f6Var);
                                                    z8Var.n = 0;
                                                    z8Var.m = false;
                                                    org.telegram.ui.Components.z8.a("", "", "", z8Var.q);
                                                    z8Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.J1.h.setImageDrawable(z8Var);
                                                    this.J1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.J1.c, new dw(this, 4)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                    this.J1.setOnCloseListener(new rv(this, 23));
                                                } else {
                                                    if (this.S2 == 0 && this.U2 == 0 && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null) {
                                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                                        boolean[] zArr = new boolean[1];
                                                        if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                            z11 = true;
                                                        } else {
                                                            Iterator<String> it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                            while (it.hasNext()) {
                                                                next = it.next();
                                                                if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                    z11 = true;
                                                                    break;
                                                                }
                                                            }
                                                            z11 = false;
                                                        }
                                                        next = null;
                                                        if (z11) {
                                                            this.J1.setOnClickListener(new a(next, i21));
                                                            org.telegram.ui.Cells.z2 z2Var4 = this.J1;
                                                            CharSequence charSequence = charSequenceArr[0];
                                                            if (charSequence instanceof String) {
                                                                str = null;
                                                                charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.j6.I6, 2, null);
                                                            } else {
                                                                str = null;
                                                            }
                                                            CharSequence charSequence2 = charSequenceArr[1];
                                                            if (charSequence2 instanceof String) {
                                                                charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                            }
                                                            z2Var4.b(charSequence, charSequence2);
                                                            if (zArr[0] && next != null) {
                                                                this.J1.setOnCloseListener(new org.telegram.ui.Components.rx0(i20, this, next));
                                                            }
                                                            z12 = true;
                                                            jxVar = this.C3;
                                                            aVar = this.b;
                                                            if (jxVar != null) {
                                                                z12 = false;
                                                                this.G1.i(this.J1, z12, true);
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
                                                            z12 = false;
                                                            this.G1.i(this.J1, z12, true);
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
                                            }
                                        }
                                        z10 = false;
                                        int i212 = 21;
                                        if (!z10) {
                                        }
                                    }
                                }
                            }
                            z12 = true;
                            str = null;
                            jxVar = this.C3;
                            aVar = this.b;
                            if (jxVar != null) {
                            }
                            z12 = false;
                            this.G1.i(this.J1, z12, true);
                            q3(true);
                            if (this.fragmentView != null) {
                            }
                            aVar2 = aVar;
                            if (this.fragmentView == null) {
                            }
                        } else if (!y10.A) {
                            y10.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y10.a).sendRequest(tL_getStarsSubscriptions, new lh.j6(y10, i10));
                        }
                    }
                    j10 = 0;
                    if (this.S2 != 0) {
                    }
                    if (this.S2 != 0) {
                    }
                    int i192 = 18;
                    if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.S2 == 0 && this.U2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                    z12 = true;
                    str = null;
                    jxVar = this.C3;
                    aVar = this.b;
                    if (jxVar != null) {
                    }
                    z12 = false;
                    this.G1.i(this.J1, z12, true);
                    q3(true);
                    if (this.fragmentView != null) {
                    }
                    aVar2 = aVar;
                    if (this.fragmentView == null) {
                    }
                }
            }
            str = null;
            z12 = true;
            jxVar = this.C3;
            aVar = this.b;
            if (jxVar != null) {
            }
            z12 = false;
            this.G1.i(this.J1, z12, true);
            q3(true);
            if (this.fragmentView != null) {
            }
            aVar2 = aVar;
            if (this.fragmentView == null) {
            }
        }
        z12 = false;
        jxVar = this.C3;
        aVar = this.b;
        if (jxVar != null) {
        }
        z12 = false;
        this.G1.i(this.J1, z12, true);
        q3(true);
        if (this.fragmentView != null) {
        }
        aVar2 = aVar;
        if (this.fragmentView == null) {
        }
    }

    public final float V3() {
        jx jxVar = this.C3;
        if (jxVar == null || !jxVar.c()) {
            return 0.0f;
        }
        return this.C3.e;
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
    public final void V4(boolean z4, boolean z10) {
        ?? r52;
        int L0;
        int i10;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        boolean z11;
        boolean z12;
        if (this.w0 == null || this.inPreviewMode || this.m3) {
            return;
        }
        jx jxVar = this.C3;
        if (jxVar != null && jxVar.c()) {
            return;
        }
        org.telegram.ui.Components.o70 o70Var = this.I0;
        if (o70Var != null) {
            o70Var.u();
            this.I0 = null;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int size = dialogFilters.size();
        xd.a aVar = this.r;
        boolean z13 = true;
        if (size > 1) {
            if (z4 || this.w0.getVisibility() != 0) {
                boolean z14 = this.w0.getVisibility() != 0 ? false : z10;
                this.w = true;
                boolean isEmpty = this.w0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z15 = (this.isPaused || this.O3 != null) ? false : z10;
                    if (!this.m3) {
                        aVar.a(this.w, z15);
                    }
                }
                int currentTabId = this.w0.getCurrentTabId();
                int currentTabStableId = this.w0.getCurrentTabStableId();
                if (currentTabId == this.w0.getDefaultTabId() || currentTabId < dialogFilters.size()) {
                    z11 = false;
                } else {
                    this.w0.I = -1;
                    z11 = true;
                }
                nw nwVar = this.w0;
                nwVar.h.clear();
                nwVar.g0.clear();
                nwVar.i0.clear();
                nwVar.j0.clear();
                nwVar.k0.clear();
                nwVar.l0.clear();
                nwVar.J = 0;
                int size2 = dialogFilters.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (dialogFilters.get(i12).isDefault()) {
                        this.w0.a(i12, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i12).locked);
                    } else {
                        MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i12);
                        this.w0.a(i12, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i12).locked);
                    }
                }
                if (currentTabStableId >= 0) {
                    if (z11 && !this.w0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            nw nwVar2 = this.w0;
                            if (nwVar2.h(nwVar2.h0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = 0;
                        }
                    }
                    if (this.w0.h0.get(this.b0[0].h, -1) != currentTabStableId) {
                        this.b0[0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i13 = 0;
                while (true) {
                    ny[] nyVarArr = this.b0;
                    if (i13 >= nyVarArr.length) {
                        break;
                    }
                    if (nyVarArr[i13].h >= dialogFilters.size()) {
                        this.b0[i13].h = dialogFilters.size() - 1;
                    }
                    this.b0[i13].a.setScrollingTouchSlop(1);
                    i13++;
                }
                nw nwVar3 = this.w0;
                nwVar3.C.setItemAnimator(z14 ? nwVar3.p0 : null);
                nwVar3.F.l();
                if (isEmpty) {
                    R4(false);
                }
                nw nwVar4 = this.w0;
                int currentTabId2 = nwVar4.getCurrentTabId();
                ArrayList arrayList = nwVar4.h;
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.g00) arrayList.get(i14)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.g00) arrayList.get(i14)).f;
                            break;
                        }
                        i14++;
                    }
                }
                if (z12) {
                    nw nwVar5 = this.w0;
                    ArrayList arrayList2 = nwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        nwVar5.f((org.telegram.ui.Components.g00) arrayList2.get(0), 0);
                        T4(r52);
                        i10 = this.b0[r52].s;
                        if ((i10 != 7 || i10 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i10 - 7]) != null) {
                            i11 = 0;
                            while (true) {
                                if (i11 >= dialogFilters.size()) {
                                    z13 = false;
                                    break;
                                }
                                MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i11);
                                if (dialogFilter3 != null && dialogFilter3.id == dialogFilter.id) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            if (z13) {
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
            i10 = this.b0[r52].s;
            if (i10 != 7) {
            }
            i11 = 0;
            while (true) {
                if (i11 >= dialogFilters.size()) {
                }
                i11++;
            }
            if (z13) {
            }
        } else {
            r52 = 0;
            if (this.w0.getVisibility() != 8) {
                this.w0.setIsEditing(false);
                I4(false);
                this.j3 = false;
                if (this.i3) {
                    this.i3 = false;
                    this.b0[0].setTranslationX(0.0f);
                    this.b0[1].setTranslationX(r2[0].getMeasuredWidth());
                }
                if (this.b0[0].h != this.w0.getDefaultTabId()) {
                    this.b0[0].h = this.w0.getDefaultTabId();
                    ww wwVar = this.b0[0].d;
                    wwVar.h = 0;
                    wwVar.l();
                    ny nyVar = this.b0[0];
                    nyVar.s = this.O0;
                    nyVar.d.l();
                }
                this.b0[1].setVisibility(8);
                ny nyVar2 = this.b0[1];
                nyVar2.h = 0;
                ww wwVar2 = nyVar2.d;
                wwVar2.h = 0;
                wwVar2.l();
                ny nyVar3 = this.b0[1];
                nyVar3.s = this.O0;
                nyVar3.d.l();
                this.w = false;
                if (this.fragmentView != null) {
                    boolean z16 = (this.isPaused || this.O3 != null) ? false : z10;
                    if (!this.m3) {
                        aVar.a(false, z16);
                    }
                }
                int i15 = 0;
                while (true) {
                    ny[] nyVarArr2 = this.b0;
                    if (i15 >= nyVarArr2.length) {
                        break;
                    }
                    ny nyVar4 = nyVarArr2[i15];
                    if (nyVar4.s == 0 && nyVar4.v == 2 && Z3() && ((L0 = this.b0[i15].c.L0()) == 0 || L0 == 1)) {
                        this.b0[i15].c.h1(1, (int) this.K);
                    }
                    this.b0[i15].a.setScrollingTouchSlop(0);
                    this.b0[i15].a.requestLayout();
                    this.b0[i15].requestLayout();
                    i15++;
                }
                this.w0.I = -1;
                r52 = 0;
            }
            T4(r52);
            i10 = this.b0[r52].s;
            if (i10 != 7) {
            }
            i11 = 0;
            while (true) {
                if (i11 >= dialogFilters.size()) {
                }
                i11++;
            }
            if (z13) {
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
    public final void W4(boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11) {
        xx xxVar;
        boolean z12;
        org.telegram.ui.Components.k81 k81Var;
        if (!this.m3 || this.i2 || (xxVar = this.z0) == null) {
            return;
        }
        ArrayList<tf.e0> currentSearchFilters = xxVar.getCurrentSearchFilters();
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        for (int i10 = 0; i10 < currentSearchFilters.size(); i10++) {
            if (currentSearchFilters.get(i10).a()) {
                z14 = true;
            } else if (currentSearchFilters.get(i10).d == 4) {
                z15 = true;
            } else if (currentSearchFilters.get(i10).d == 6) {
                z16 = true;
            } else if (currentSearchFilters.get(i10).d == 7) {
                z13 = true;
            }
        }
        if (z13) {
            z10 = false;
        }
        boolean z17 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z10;
        if ((z14 || z17 || !z4) && z17) {
            if (arrayList == null || arrayList.isEmpty() || z15) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z16) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z10) {
                this.Y.A1(arrayList, arrayList2, z10);
                z12 = true;
                if (!z12) {
                    this.Y.A1(null, null, false);
                }
                if (!z11) {
                    this.Y.getAdapter().l();
                }
                k81Var = this.X;
                if (k81Var != null) {
                    k81Var.b(z12, true);
                }
                this.Y.setEnabled(z12);
                this.s.a(z12, true);
            }
        }
        z12 = false;
        if (!z12) {
        }
        if (!z11) {
        }
        k81Var = this.X;
        if (k81Var != null) {
        }
        this.Y.setEnabled(z12);
        this.s.a(z12, true);
    }

    public final nh.t6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f10 = (((-this.d4) - this.g4) - this.r1) - this.s1;
        org.telegram.ui.Components.z10 z10Var = this.q0;
        if (z10Var != null) {
            z10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.z10 z10Var2 = this.r0;
        if (z10Var2 != null) {
            z10Var2.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            ph.f3 f3Var = this.m0;
            if (f3Var != null) {
                f3Var.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.v0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            hy hyVar = (hy) this.fragmentView;
            hyVar.removeView(undoViewArr[0]);
            hyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z4) {
        boolean z10 = this.i2;
        boolean z11 = (!z10 || this.O0 == 10) && this.S2 == 0 && this.U2 == 0 && !this.inPreviewMode && (!this.g2 || z10) && !this.R3;
        org.telegram.ui.Components.z10 z10Var = this.q0;
        if (z10Var != null) {
            z10Var.e(z11, z4);
        }
        org.telegram.ui.Components.z10 z10Var2 = this.r0;
        if (z10Var2 != null) {
            z10Var2.e(z11, z4);
        }
    }

    public final boolean Z3() {
        return !this.i2 && this.O0 == 0 && this.U2 == 0 && this.S2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void Z4(boolean z4, boolean z10) {
        boolean z11;
        if (this.k0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.j0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= getDownloadController().downloadingFiles.size()) {
                        z11 = false;
                        break;
                    } else {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i10).getFileName())) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (getDownloadController().hasUnviewedDownloads() || z11 || (this.d0.getVisibility() == 0 && this.d0.getAlpha() == 1.0f && !z10)) {
                    this.f0 = true;
                } else {
                    this.f0 = false;
                }
                x3();
                boolean z12 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.a2;
                boolean z13 = i11 == 3 || i11 == 5;
                this.l0.setSubtext(LocaleController.getString(z12 ? z13 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.k0.b(z12, z13, z4);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.A2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void a5() {
        org.telegram.ui.Components.qq0 qq0Var;
        zw zwVar = this.y1;
        ArrayList arrayList = this.F2;
        if (zwVar == null) {
            if (this.O0 == 10) {
                c4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        b5();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.O0 == 3 && this.c2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.N3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.nr.h);
            }
            if (this.y1.getTag() != null) {
                this.y1.n0(false, false, false);
                this.y1.P();
                this.y1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.y1.getTag() == null) {
                if (!a4() && this.B2 == null) {
                    this.y1.setFieldText("");
                }
                this.y1.setTag(1);
                if (!this.T3 && (qq0Var = this.D2) != null) {
                    this.T3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    qq0Var.j();
                    qq0Var.C = string2;
                    org.telegram.ui.Components.oq0 oq0Var = qq0Var.a[0];
                    if (string2 != null) {
                        oq0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(qq0Var, 29);
                    qq0Var.D = cc0Var;
                    AndroidUtilities.runOnUIThread(cc0Var, 1000L);
                }
            }
            this.z1.g(Math.max(1, arrayList.size()), true);
            int i10 = this.P0 + (!TextUtils.isEmpty(this.y1.getFieldText()) ? 1 : 0);
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
            this.z1.i(i10, j10, true);
            this.y1.R1();
            if (this.N3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.nr.h);
            }
        }
        this.N3 = arrayList.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b4(boolean z4) {
        boolean z10;
        this.actionBar.r();
        this.F2.clear();
        org.telegram.ui.ActionBar.i2 i2Var = this.b1;
        int i10 = 1;
        if (i2Var != null) {
            i2Var.c(0.0f, true);
        }
        nw nwVar = this.w0;
        if (nwVar != null) {
            nwVar.b(org.telegram.ui.ActionBar.j6.K8, org.telegram.ui.ActionBar.j6.I8, org.telegram.ui.ActionBar.j6.J8, org.telegram.ui.ActionBar.j6.L8, org.telegram.ui.ActionBar.j6.d6);
        }
        ValueAnimator valueAnimator = this.r3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r3 = null;
        }
        if (this.q3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ny[] nyVarArr = this.b0;
            if (i12 >= nyVarArr.length) {
                break;
            }
            ny nyVar = nyVarArr[i12];
            if (nyVar != null) {
                nyVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.H ? 81 : 0) + 48) + this.K);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q3, 0.0f);
        this.r3 = ofFloat;
        ofFloat.addUpdateListener(new tv(this, max, i10));
        this.r3.addListener(new rx(this, max, i11));
        this.r3.setInterpolator(org.telegram.ui.Components.nr.f);
        this.r3.setDuration(200L);
        this.r3.start();
        this.V0 = false;
        ArrayList arrayList = this.X0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i13++;
                arrayList = arrayList;
                size = size;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.W0) {
            getMessagesController().reorderPinnedDialogs(this.S2, null, 0L);
            z10 = 0;
            this.W0 = false;
        } else {
            z10 = 0;
        }
        T4(true);
        if (this.b0 != null) {
            int i14 = 0;
            while (true) {
                ny[] nyVarArr2 = this.b0;
                if (i14 >= nyVarArr2.length) {
                    break;
                }
                nyVarArr2[i14].d.E = z10;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i16 = z10;
        if (z4) {
            i16 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i16 | i15, true);
    }

    public final void b5() {
        org.telegram.ui.Components.qq0 qq0Var = this.D2;
        if (qq0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        qq0Var.h(i10);
        qq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = qq0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.F2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.oq0 oq0Var = qq0Var.a[0];
        if (qq0Var.b == 1) {
            oq0Var.d.l(qq0Var.c(oq0Var), false);
        }
    }

    public final void c4(boolean z4) {
        if (this.C3.c()) {
            z4 = true;
        }
        if (z4 && this.Y1) {
            return;
        }
        this.R3 = z4;
        Y4(true);
        if (z4) {
            ph.f3 f3Var = this.m0;
            if (f3Var != null) {
                f3Var.e(true);
            }
            ph.f3 f3Var2 = this.n0;
            if (f3Var2 != null) {
                f3Var2.e(true);
            }
        }
    }

    public final void c5(boolean z4) {
        boolean z10;
        if (this.i0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            MessageObject messageObject = arrayList.get(i10);
            i10++;
            MessageObject messageObject2 = messageObject;
            if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                z10 = true;
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
                z10 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z10 && z4) {
            z11 = true;
        }
        this.d.a(z11, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        nw nwVar;
        if (this.C3.c()) {
            return false;
        }
        return this.O0 != 3 || (nwVar = this.w0) == null || nwVar.getVisibility() != 0 || this.w0.H <= 0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean closeLastFragment() {
        if (!this.C3.c()) {
            return super.closeLastFragment();
        }
        this.C3.a();
        xx xxVar = this.z0;
        if (xxVar == null) {
            return true;
        }
        xxVar.R();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        eg.l1 l1Var = new eg.l1(this, context, this.resourceProvider, 4);
        l1Var.setAllowOverlayTitle(true);
        l1Var.K();
        l1Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.t8), false);
        l1Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.z8), true);
        l1Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.v8), false);
        l1Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.y8), true);
        l1Var.k();
        l1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        l1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.S2 == 0 || e4())) {
            return l1Var;
        }
        l1Var.setOccupyStatusBar(false);
        return l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e0b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e65  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0cd5  */
    /* JADX WARN: Type inference failed for: r0v101, types: [org.telegram.ui.ActionBar.k] */
    /* JADX WARN: Type inference failed for: r0v181, types: [org.telegram.ui.Components.sl0, org.telegram.ui.ky] */
    /* JADX WARN: Type inference failed for: r0v28, types: [ug.f] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v19, types: [kg.f, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v205, types: [org.telegram.ui.Components.sl0, org.telegram.ui.ky] */
    /* JADX WARN: Type inference failed for: r3v206, types: [org.telegram.ui.Components.sl0, org.telegram.ui.ky] */
    /* JADX WARN: Type inference failed for: r3v207, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.ky] */
    /* JADX WARN: Type inference failed for: r3v211, types: [org.telegram.ui.Components.sl0, org.telegram.ui.ky] */
    /* JADX WARN: Type inference failed for: r3v212, types: [org.telegram.ui.Components.sl0, org.telegram.ui.ky] */
    /* JADX WARN: Type inference failed for: r3v214, types: [f2.i0, org.telegram.ui.sw] */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.telegram.ui.ActionBar.k] */
    /* JADX WARN: Type inference failed for: r3v321, types: [android.view.ViewGroup, org.telegram.ui.ActionBar.w0] */
    /* JADX WARN: Type inference failed for: r3v60, types: [ng.a] */
    /* JADX WARN: Type inference failed for: r4v69, types: [org.telegram.ui.Components.sl0, org.telegram.ui.ky] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.ui.ew] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v23, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f10;
        int i10;
        xn xnVar;
        nw nwVar;
        ey eyVar;
        ey eyVar2;
        org.telegram.ui.Components.js jsVar;
        my myVar;
        f2.e0 e0Var;
        tf.k kVar;
        tf.k kVar2;
        long j10;
        tf.k kVar3;
        tf.k kVar4;
        tf.k kVar5;
        tf.k kVar6;
        iy iyVar;
        int i11;
        int i12;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        Context context2 = context;
        ?? r11 = 0;
        this.g2 = false;
        this.h2 = false;
        this.S = false;
        this.S0 = null;
        this.w0 = null;
        ArrayList arrayList = this.F2;
        arrayList.clear();
        this.h3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        AndroidUtilities.runOnUIThread(new lv(context2, 0));
        this.K1 = null;
        this.I1 = null;
        this.J1 = null;
        this.N1 = null;
        this.G1 = null;
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        this.g0 = a2;
        a2.setOnClickListener(new rv(this, 1));
        int i13 = 8;
        if (this.O0 == 2 || (e4() && R3(this.currentAccount, this.O0, this.S2, false).isEmpty())) {
            this.g0.setVisibility(8);
        }
        this.g0.setVisibility(8);
        ?? r82 = 1;
        if (!this.i2 && this.k2 == null && this.S2 == 0 && this.U2 == 0) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context2, getThemedColor(org.telegram.ui.ActionBar.j6.t8), getThemedColor(org.telegram.ui.ActionBar.j6.v8), true);
            this.j0 = w0Var;
            w0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.j0, k7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.j0.setOnClickListener(new rv(this, 8));
            this.j0.setAlpha(0.0f);
            this.j0.setVisibility(8);
            this.k0 = new org.telegram.ui.Components.mi0(context2);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(context2, this.resourceProvider, false, true);
            this.l0 = g1Var;
            g1Var.setItemHeight(56);
            this.l0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.k0);
            this.l0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, R.drawable.outline_header_lock_24);
            this.c0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            ?? d = n10.d(3, new ColorDrawable(0));
            this.d0 = d;
            qy qyVar = new qy(context2, this.currentAccount);
            this.e0 = qyVar;
            d.addView(qyVar);
            this.d0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.d0.setVisibility(8);
            Z4(false, false);
        }
        ey eyVar3 = new ey(context2, this.resourceProvider);
        this.U = eyVar3;
        long j11 = 0;
        eyVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.U.setPivotX(0.0f);
        this.U.setPivotY(0.0f);
        if (this.O0 == 0) {
            org.telegram.ui.ActionBar.w0 a11 = n10.a(-47, R.drawable.avd_speed);
            this.i0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.i0.setOnClickListener(new rv(this, 9));
            this.U.a(this.i0);
            this.U.e();
        }
        this.U.setCloseButtonOnClickListener(new mv(this, 29));
        this.U.r.setOnFocusChangeListener(new qd(this, 1));
        ?? r32 = this.U.r;
        lf.n0 n0Var = new lf.n0(r32, new fy(this));
        this.V = n0Var;
        r32.addTextChangedListener(n0Var);
        this.U.setSearchFiltersListener(new tx(this, 5));
        this.V.a();
        if (this.O0 == 0) {
            org.telegram.ui.ActionBar.w0 a12 = n10.a(4, R.drawable.ic_ab_other);
            this.h0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.h0.setOnClickListener(new rv(this, 10));
            this.h0.setOnLongClickListener(new zv(this, 3));
        }
        this.g0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.g0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.i2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i14 = this.O0;
            if (i14 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.K0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.L0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i14 == 3 && this.c2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i14 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i14 == 14) {
                boolean z4 = this.x2;
                if (!z4 || this.w2 || this.s2 || this.v2) {
                    boolean z10 = this.w2;
                    if (!z10 || z4 || this.s2 || this.v2) {
                        boolean z11 = this.s2;
                        if (z11 && !z10 && !z4 && !this.v2) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                        } else if (!this.v2 || z10 || z4 || z11) {
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
                TLRPC.RequestPeerType requestPeerType = this.D;
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
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        } else {
            if (this.k2 != null || this.S2 != 0 || this.U2 != 0) {
                ?? r33 = this.actionBar;
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
                this.b1 = i2Var;
                r33.setBackButtonDrawable(i2Var);
            }
            if (this.S2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.U2 != 0) {
                this.actionBar.setTitle(DialogObject.getName(this.V2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.Y2 = new org.telegram.ui.Components.z8(this.V2);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
                this.X2 = p9Var;
                p9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.X2.e(this.V2, this.Y2);
                this.actionBar.addView(this.X2, k7.b6.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(26.0f), null);
                this.A3 = j5Var;
                j5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.z3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.z3.getIntrinsicWidth(), this.z3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.z3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.gl), PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.z3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.H(spannableStringBuilder, this.A3);
                d5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.S2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new dw(this, 0));
        int i15 = this.O0;
        if (((i15 == 0 && !this.i2) || i15 == 3) && this.S2 == 0 && this.U2 == 0 && TextUtils.isEmpty(this.k2)) {
            nw nwVar2 = new nw(this, context2, this.resourceProvider);
            this.w0 = nwVar2;
            nwVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.w0.setDelegate(new ow(context2, this));
        }
        int i16 = 17;
        if (this.o2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.A1 = n10.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8();
            z8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context2);
            p9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.A1.addView(p9Var2, k7.b6.e(36, 36, 17));
            this.A1.setOnClickListener(new rv(this, 11));
            this.A1.setOnLongClickListener(new zv(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            z8Var.m(this.currentAccount, currentUser);
            p9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            p9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? z8Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new pw(this));
        final hy hyVar = new hy(context2, this);
        this.fragmentView = hyVar;
        ug.i iVar = new ug.i(hyVar);
        this.h4 = iVar;
        ng.a aVar = this.m4;
        aVar.f(iVar, hyVar);
        ug.i iVar2 = this.h4;
        ng.a aVar2 = this.o4;
        aVar2.f(iVar2, hyVar);
        ug.i iVar3 = this.h4;
        ng.a aVar3 = this.p4;
        aVar3.f(iVar3, hyVar);
        this.n4.f(this.h4, hyVar);
        final PointF pointF = new PointF();
        this.q4 = new og.a() { // from class: org.telegram.ui.ew
            @Override // og.a
            public final void e(Canvas canvas, RectF rectF) {
                oy oyVar = oy.this;
                xx xxVar = oyVar.z0;
                int alpha = xxVar != null ? (int) (xxVar.getAlpha() * 255.0f) : 0;
                ny[] nyVarArr = oyVar.b0;
                int length = nyVarArr.length;
                int i17 = 0;
                while (true) {
                    hy hyVar2 = hyVar;
                    if (i17 >= length) {
                        xx xxVar2 = oyVar.z0;
                        if (xxVar2 == null || xxVar2.getVisibility() != 0 || oyVar.z0.getAlpha() <= 0.0f) {
                            return;
                        }
                        xx xxVar3 = oyVar.z0;
                        tg.c.a(xxVar3, canvas, rectF, xxVar3, hyVar2, alpha);
                        return;
                    }
                    ny nyVar = nyVarArr[i17];
                    if (nyVar != null && nyVar.getVisibility() == 0 && nyVar.getAlpha() > 0.0f) {
                        float V3 = oyVar.V3();
                        if (nyVar.C == null || V3 <= 0.0f) {
                            ky kyVar = nyVar.a;
                            tg.c.a(kyVar, canvas, rectF, kyVar, hyVar2, 255 - alpha);
                        } else {
                            ky kyVar2 = nyVar.a;
                            PointF pointF2 = pointF;
                            if (!ug.i.b(kyVar2, hyVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            nyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i17++;
                }
            }

            @Override // og.a
            public final void g(g.x xVar, RectF rectF) {
                xVar.b = true;
            }
        };
        int i17 = (this.S2 == 0 && this.U2 == 0 && (((i12 = this.O0) == 0 && !this.i2) || i12 == 3)) ? 2 : 1;
        this.b0 = new ny[i17];
        int i18 = 0;
        while (i18 < i17) {
            ng.a aVar4 = aVar3;
            ny nyVar = new ny(context2, this);
            hyVar.addView(nyVar, k7.b6.c(-1.0f, -1));
            nyVar.s = this.O0;
            this.b0[i18] = nyVar;
            nyVar.w = new org.telegram.ui.Components.t00(context2);
            nyVar.w.setViewType(7);
            nyVar.w.setVisibility(i13);
            nyVar.addView(nyVar.w, k7.b6.e(-2, -2, i16));
            ky kyVar = new ky(this, context2, nyVar);
            nyVar.a = kyVar;
            kyVar.C0(new org.telegram.ui.Components.k41(18, this, nyVar));
            ?? r42 = nyVar.a;
            nyVar.b = new b4.e0((org.telegram.ui.Components.sl0) r42);
            r42.setAllowStopHeaveOperations(r82);
            nyVar.a.setAccessibilityEnabled(r11);
            nyVar.a.m1(r11, r82);
            nyVar.a.setClipToPadding(r11);
            nyVar.a.setPivotY(0.0f);
            if (this.O0 == 15) {
                nyVar.a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
            }
            nyVar.x = new qw(nyVar.a, nyVar);
            nyVar.a.setVerticalScrollBarEnabled(r82);
            nyVar.a.setInstantClick(r82);
            nyVar.c = new sw(this, nyVar);
            nyVar.c.j1(r82);
            nyVar.a.setLayoutManager(nyVar.c);
            nyVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            nyVar.addView(nyVar.a, k7.b6.c(-1.0f, -1));
            nyVar.a.setOnItemClickListener(new qs(5, this, nyVar));
            nyVar.a.setOnItemLongClickListener(new n7.qa(16, this, nyVar));
            nyVar.f = new my(this, nyVar);
            nyVar.y = new org.telegram.ui.Components.zk0(nyVar.a, r11);
            myVar = nyVar.f;
            nyVar.e = new f2.e0(myVar);
            e0Var = nyVar.e;
            e0Var.d(nyVar.a);
            nyVar.a.setOnScrollListener(new uw(this, nyVar, hyVar));
            nyVar.v = SharedConfig.archiveHidden ? 2 : 0;
            if (nyVar.n == null && this.S2 == 0 && this.U2 == j11) {
                nyVar.n = new vw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), nyVar);
                if (Z3()) {
                    nyVar.n.h();
                } else {
                    nyVar.n.b();
                }
                vw vwVar = nyVar.n;
                i11 = nyVar.v;
                vwVar.g(i11 != 0);
            }
            hy hyVar2 = hyVar;
            ng.a aVar5 = aVar;
            ng.a aVar6 = aVar2;
            context2 = context;
            nyVar.d = new ww(this, this, context, nyVar.s, this.S2, this.i2, arrayList, this.currentAccount, this.D, nyVar);
            kVar = nyVar.d;
            kVar.R(nyVar.a);
            kVar2 = nyVar.d;
            kVar2.P(this.q2);
            if (nyVar.s == 3) {
                kVar6 = nyVar.d;
                kVar6.M(getMessagesController().storiesEnabled() && (iyVar = this.z2) != null && iyVar.C());
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.m2;
                j10 = 0;
                if (topicKey.dialogId != 0) {
                    kVar5 = nyVar.d;
                    kVar5.Q(topicKey.dialogId);
                }
            } else {
                j10 = 0;
            }
            kVar3 = nyVar.d;
            kVar3.N(nyVar.n);
            ky kyVar2 = nyVar.a;
            kVar4 = nyVar.d;
            kyVar2.setAdapter(kVar4);
            nyVar.a.setEmptyView((this.S2 == 0 && this.U2 == j10) ? nyVar.w : null);
            nyVar.r = new c2.y(nyVar.a, nyVar.c);
            c2.y yVar = nyVar.r;
            yVar.c = true;
            yVar.d = true;
            yVar.h = new sv(this, 10);
            if (i18 != 0) {
                this.b0[i18].setVisibility(8);
            }
            i18++;
            j11 = j10;
            hyVar = hyVar2;
            aVar3 = aVar4;
            aVar = aVar5;
            aVar2 = aVar6;
            r82 = 1;
            r11 = 0;
            i16 = 17;
            i13 = 8;
        }
        hy hyVar3 = hyVar;
        ng.a aVar7 = aVar;
        ng.a aVar8 = aVar2;
        ng.a aVar9 = aVar3;
        long j12 = j11;
        org.telegram.ui.Components.is isVar = new org.telegram.ui.Components.is(context2);
        this.H1 = isVar;
        int i19 = org.telegram.ui.ActionBar.j6.d6;
        isVar.setColor(org.telegram.ui.ActionBar.j6.u0(i19));
        hyVar3.addView(this.H1, k7.b6.e(-1, 100, 48));
        this.y0 = hyVar3.getChildCount();
        a41 a41Var = new a41((Activity) getContext());
        this.W = a41Var;
        a41Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        hyVar3.addView(this.W, k7.b6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        pg.b b10 = aVar8.b(this.W, rg.b.m(this.resourceProvider));
        b10.p(AndroidUtilities.dp(18.0f));
        b10.o(AndroidUtilities.dp(6.666f));
        this.W.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.W.setBlurredBackground(b10);
        tf.g0 g0Var = new tf.g0(getParentActivity(), null);
        this.Y = g0Var;
        g0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        tf.g0 g0Var2 = this.Y;
        g0Var2.X2 = false;
        g0Var2.setOnItemClickListener(new wv(this, 1));
        this.W.addView(this.Y, k7.b6.e(-1, -1, 48));
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context2, this.resourceProvider, true);
        this.r0 = z10Var;
        z10Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.r0.setImageResource(R.drawable.outline_fab_story_24);
        this.r0.setOnClickListener(new rv(this, 27));
        hyVar3.addView(this.r0, org.telegram.ui.Components.z10.c());
        org.telegram.ui.Components.z10 z10Var2 = new org.telegram.ui.Components.z10(context2, this.resourceProvider);
        this.q0 = z10Var2;
        hyVar3.addView(z10Var2, org.telegram.ui.Components.z10.b());
        this.q0.setOnClickListener(new rv(this, 28));
        if (!e4() && this.O0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", true)) {
            ph.f3 f3Var = new ph.f3(context2, 2);
            f3Var.r(8.0f);
            f3Var.d = 8000L;
            f3Var.i();
            f3Var.o();
            f3Var.q(true);
            f3Var.t(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), ph.da.n(context2)));
            f3Var.m(1.0f, -40.0f);
            f3Var.h(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            f3Var.i0 = new dw(this, 11);
            this.m0 = f3Var;
            hyVar3.addView(f3Var, k7.b6.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        e5();
        this.X = null;
        if (this.i2 || this.O0 != 0) {
            f10 = 72.0f;
            if (this.O0 == 3 || I3()) {
                ug.f fVar = new ug.f(context2);
                this.v1 = fVar;
                fVar.setClipChildren(false);
                ?? r02 = this.v1;
                ch.i iVar4 = this.v;
                r02.setWindowInsetsProvider(iVar4);
                ug.f fVar2 = this.v1;
                fVar2.setInputIslandBubbleDrawable(aVar8.b(fVar2, rg.b.m(this.resourceProvider)));
                ug.f fVar3 = this.v1;
                fVar3.setUnderKeyboardBackgroundDrawable(aVar7.b(fVar3, rg.b.m(this.resourceProvider)));
                ng.b bVar = new ng.b(aVar9.b(this.v1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    bVar.b(AndroidUtilities.dp(72.0f), true);
                }
                this.v1.setBackgroundWithFadeDrawable(bVar);
                FrameLayout inputIslandBubbleContainer = this.v1.getInputIslandBubbleContainer();
                this.w1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.x1 = this.v1.getInAppKeyboardBubbleContainer();
                zw zwVar = this.y1;
                if (zwVar != null) {
                    zwVar.B0();
                }
                zw zwVar2 = new zw(this, getParentActivity(), hyVar3);
                this.y1 = zwVar2;
                zwVar2.setInAppInsetsController(iVar4);
                this.y1.u4 = false;
                hyVar3.setClipChildren(false);
                hyVar3.setClipToPadding(false);
                zw zwVar3 = this.y1;
                zwVar3.t4 = false;
                zwVar3.e2 = !AndroidUtilities.isInMultiwindow && ((xnVar = zwVar3.L2) == null || !xnVar.isInBubbleMode());
                this.y1.U0(false, false);
                this.y1.g1(true, false);
                this.y1.v1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.y1.getSendButton().setAlpha(0.0f);
                this.y1.setViewParentForEmoji(this.x1);
                this.w1.addView(this.y1, k7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                hyVar3.addView(this.v1.getFadeView(), k7.b6.c(-1.0f, -1));
                hyVar3.addView(this.v1, k7.b6.c(-1.0f, -1));
                if (a4() || this.B2 != null || this.C2 != null) {
                    l3(this.S3);
                    this.S3 = null;
                }
                this.y1.setDelegate(new ax(this));
                i10 = -1;
                org.telegram.ui.Components.qp0 qp0Var = new org.telegram.ui.Components.qp0((NotificationCenter.NotificationCenterDelegate) this, context2, R.drawable.send_plane_24, this.resourceProvider, 1);
                this.z1 = qp0Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                qp0Var.F = dp;
                qp0Var.G = dp2;
                org.telegram.ui.Components.qp0 qp0Var2 = this.z1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                qp0Var2.J = dp3;
                qp0Var2.K = dp4;
                org.telegram.ui.Components.qp0 qp0Var3 = this.z1;
                qp0Var3.e0 = true;
                hyVar3.addView(qp0Var3, k7.b6.e(110, 50, 85));
                this.z1.setScrimViewBackgroundColor(getThemedColor(i19));
                this.z1.setOnClickListener(new rv(this, 5));
                this.z1.setOnLongClickListener(new zv(this, 1));
                this.z1.setVisibility(8);
                this.z1.setScaleX(0.2f);
                this.z1.setScaleY(0.2f);
                this.z1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.B1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                nwVar = this.w0;
                if (nwVar != null) {
                    pg.b b11 = aVar8.b(nwVar, rg.b.m(this.resourceProvider));
                    b11.p(AndroidUtilities.dp(18.0f));
                    b11.o(AndroidUtilities.dp(6.666f));
                    this.w0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.w0.setBlurredBackground(b11);
                    hyVar3.addView(this.w0, k7.b6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                eyVar = this.U;
                if (eyVar != null) {
                    eyVar.setupBlurredBackground(aVar8.b(eyVar, rg.b.m(this.resourceProvider)));
                }
                gx gxVar = new gx(this, context, this, this.currentAccount, e4() ? 1 : 0);
                this.B0 = gxVar;
                gxVar.setActionBar(this.actionBar);
                this.B0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                gx gxVar2 = this.B0;
                gxVar2.i0 = false;
                gxVar2.setVisibility(8);
                this.J = false;
                this.I = false;
                this.H = false;
                if (this.i2 && this.O0 == 3) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
                }
                hyVar3.addView(this.actionBar, k7.b6.c(-2.0f, i10));
                if (!this.i2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.B3 = oVar;
                    hyVar3.addView(oVar, k7.b6.e(20, 20, 51));
                }
                eyVar2 = this.U;
                if (eyVar2 != null) {
                    hyVar3.addView(eyVar2, k7.b6.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.u0 = hyVar3.getChildCount();
                UndoView[] undoViewArr = this.v0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.T) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.gl));
                }
                if (this.S2 == 0 || this.U2 != j12) {
                    this.b0[0].a.setGlowColor(getThemedColor(i19));
                    this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.j6.O8), false);
                    this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.N8), false);
                    this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
                    this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.j6.R8), true);
                }
                if (!this.i2 && this.O0 == 0) {
                    eg.h0 h0Var = new eg.h0(this, context, 23);
                    this.H0 = h0Var;
                    if (Build.VERSION.SDK_INT >= 23) {
                        h0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i19), 100)));
                    }
                    this.H0.setFocusable(false);
                    this.H0.setImportantForAccessibility(2);
                    this.H0.setOnClickListener(new rv(this, 7));
                    this.H0.setVisibility(8);
                    hyVar3.addView(this.H0, k7.b6.c(-1.0f, i10));
                }
                this.c1.setColor(getThemedColor(i19));
                this.m3 = false;
                if (this.k2 == null) {
                    O4(true, false, false, false);
                    this.U.r.setText(this.k2);
                    this.U.r.setSelection(this.k2.length());
                } else if (this.l2 != null) {
                    O4(true, false, false, true);
                    this.U.r.setText(this.l2);
                    this.U.r.setSelection(this.l2.length());
                    this.l2 = null;
                    ey eyVar4 = this.U;
                    if (eyVar4 != null) {
                        eyVar4.setTranslationY(W3() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    O4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(hyVar3);
                this.C3 = new jx(this, context, hyVar3, context);
                V4(true, false);
                this.C3.setOpenProgress(0.0f);
                hyVar3.addView(this.B0, k7.b6.c(81.0f, i10));
                hyVar3.addView(this.C3, k7.b6.c(-1.0f, i10));
                this.C0 = new org.telegram.ui.Components.hs(context);
                jsVar = this.G1;
                if (jsVar != null) {
                    hyVar3.addView(jsVar, k7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.U2 != j12 && this.O0 != 3 && ChatObject.canAddChatToCommunity(this.V2)) {
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(mqVar, 0, 1, 33);
                    ph.d dVar = new ph.d(context, this.resourceProvider);
                    this.s0 = dVar;
                    dVar.e();
                    this.s0.setText(spannableStringBuilder2);
                    this.s0.setOnClickListener(new org.telegram.ui.Components.rx0(16, this, new org.telegram.ui.ActionBar.d2[1]));
                    wg.f fVar4 = new wg.f(getContext());
                    this.t0 = fVar4;
                    fVar4.setupColorKey(org.telegram.ui.ActionBar.j6.a7);
                    this.t0.setFadeZoneBottom(AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
                    this.t0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    hyVar3.addView(this.t0, k7.b6.g());
                    hyVar3.addView(this.s0, k7.b6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
                }
                f5(false);
                Y4(false);
                F3();
                C3();
                E3();
                D3();
                B3();
                v3();
                this.U.setBlurredBackgroundVisibility(this.b.e);
                r0.j0.m(this.fragmentView, new sv(this, 7));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.js jsVar2 = new org.telegram.ui.Components.js(context2);
            this.G1 = jsVar2;
            jsVar2.setOnAnimatedHeightChangedListener(new mv(this, 5));
            pg.b a13 = aVar8.a(this.G1);
            a13.n(rg.b.m(this.resourceProvider));
            a13.o(AndroidUtilities.dp(7.0f));
            f10 = 72.0f;
            this.G1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            this.G1.setBlurredBackground(a13);
            this.G1.setDefaultRadiusDp(this.U2 != j12 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.D1 = frameLayout;
            this.G1.addView(frameLayout);
            this.G1.h(5, this.D1);
            this.G1.g(this.D1);
            this.G1.i(this.D1, true, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.F1 = frameLayout2;
            this.G1.addView(frameLayout2);
            this.G1.h(4, this.F1);
            this.G1.g(this.F1);
            this.G1.i(this.F1, true, false);
            yw ywVar = new yw(this, context2, this, 0);
            this.C1 = ywVar;
            this.D1.addView(ywVar);
            yw ywVar2 = new yw(this, context2, this, 1);
            this.E1 = ywVar2;
            this.F1.addView(ywVar2);
            this.G1.setCallFragmentContextView(this.E1);
            org.telegram.ui.Cells.z2 z2Var = new org.telegram.ui.Cells.z2(context2);
            this.J1 = z2Var;
            z2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            U4();
            b7.j0(new uv(this, 0));
            b7.p0(new d5(this, 11));
            this.G1.addView(this.J1);
            if (this.U2 != j12) {
                th.i iVar5 = new th.i(context2, this.resourceProvider, true);
                this.N1 = iVar5;
                iVar5.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.N1.setUnreadMode(true);
                this.N1.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.N1.setOnClickListener(new rv(this, 4));
                this.G1.addView(this.N1);
                q3(false);
            }
        }
        i10 = -1;
        nwVar = this.w0;
        if (nwVar != null) {
        }
        eyVar = this.U;
        if (eyVar != null) {
        }
        gx gxVar3 = new gx(this, context, this, this.currentAccount, e4() ? 1 : 0);
        this.B0 = gxVar3;
        gxVar3.setActionBar(this.actionBar);
        this.B0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        gx gxVar22 = this.B0;
        gxVar22.i0 = false;
        gxVar22.setVisibility(8);
        this.J = false;
        this.I = false;
        this.H = false;
        if (this.i2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
        }
        hyVar3.addView(this.actionBar, k7.b6.c(-2.0f, i10));
        if (!this.i2) {
        }
        eyVar2 = this.U;
        if (eyVar2 != null) {
        }
        this.u0 = hyVar3.getChildCount();
        UndoView[] undoViewArr2 = this.v0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.T) {
        }
        if (this.S2 == 0) {
        }
        this.b0[0].a.setGlowColor(getThemedColor(i19));
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.j6.O8), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.N8), false);
        this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
        this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.j6.R8), true);
        if (!this.i2) {
            eg.h0 h0Var2 = new eg.h0(this, context, 23);
            this.H0 = h0Var2;
            if (Build.VERSION.SDK_INT >= 23) {
            }
            this.H0.setFocusable(false);
            this.H0.setImportantForAccessibility(2);
            this.H0.setOnClickListener(new rv(this, 7));
            this.H0.setVisibility(8);
            hyVar3.addView(this.H0, k7.b6.c(-1.0f, i10));
        }
        this.c1.setColor(getThemedColor(i19));
        this.m3 = false;
        if (this.k2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(hyVar3);
        this.C3 = new jx(this, context, hyVar3, context);
        V4(true, false);
        this.C3.setOpenProgress(0.0f);
        hyVar3.addView(this.B0, k7.b6.c(81.0f, i10));
        hyVar3.addView(this.C3, k7.b6.c(-1.0f, i10));
        this.C0 = new org.telegram.ui.Components.hs(context);
        jsVar = this.G1;
        if (jsVar != null) {
        }
        if (this.U2 != j12) {
            org.telegram.ui.Components.mq mqVar2 = new org.telegram.ui.Components.mq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(mqVar2, 0, 1, 33);
            ph.d dVar2 = new ph.d(context, this.resourceProvider);
            this.s0 = dVar2;
            dVar2.e();
            this.s0.setText(spannableStringBuilder22);
            this.s0.setOnClickListener(new org.telegram.ui.Components.rx0(16, this, new org.telegram.ui.ActionBar.d2[1]));
            wg.f fVar42 = new wg.f(getContext());
            this.t0 = fVar42;
            fVar42.setupColorKey(org.telegram.ui.ActionBar.j6.a7);
            this.t0.setFadeZoneBottom(AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
            this.t0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            hyVar3.addView(this.t0, k7.b6.g());
            hyVar3.addView(this.s0, k7.b6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        f5(false);
        Y4(false);
        F3();
        C3();
        E3();
        D3();
        B3();
        v3();
        this.U.setBlurredBackgroundVisibility(this.b.e);
        r0.j0.m(this.fragmentView, new sv(this, 7));
        return this.fragmentView;
    }

    public final void d5(TLRPC.User user, boolean z4) {
        org.telegram.ui.Components.j5 j5Var;
        gx gxVar = this.B0;
        org.telegram.ui.Components.j5 j5Var2 = null;
        if (gxVar != null && (j5Var = gxVar.U) != null && gxVar.n0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z10 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                j5Var.j(emojiStatusDocumentId.longValue(), z4);
                j5Var.m(z10, z4);
            } else if (user == null || !MessagesController.getInstance(gxVar.f).isPremiumUser(user)) {
                j5Var.g(null, z4);
                j5Var.m(false, z4);
            } else {
                if (gxVar.K0 == null) {
                    gxVar.K0 = gxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    gxVar.K0 = new nh.h(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), gxVar.K0);
                }
                gxVar.K0.setColorFilter(new PorterDuffColorFilter(gxVar.f(org.telegram.ui.ActionBar.j6.zh), PorterDuff.Mode.MULTIPLY));
                j5Var.g(gxVar.K0, z4);
                j5Var.m(false, z4);
            }
            j5Var.k(Integer.valueOf(gxVar.f(org.telegram.ui.ActionBar.j6.zh)));
            gxVar.T.invalidate();
        }
        if (this.A3 == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
        this.y3 = null;
        if (emojiStatusDocumentId2 != null) {
            boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.A3.j(emojiStatusDocumentId2.longValue(), z4);
            this.A3.m(z11, z4);
            if (z11) {
                this.y3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new rv(this, 2));
            q61.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.A3.g(null, z4);
            this.A3.m(false, z4);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.I3 == null) {
                this.I3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.I3 = new dy(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.I3);
            }
            this.I3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.zh), PorterDuff.Mode.MULTIPLY));
            this.A3.g(this.I3, z4);
            this.A3.m(false, z4);
            this.actionBar.setRightDrawableOnClick(new rv(this, 3));
            q61.t(this.currentAccount);
        }
        org.telegram.ui.Components.j5 j5Var3 = this.A3;
        int i10 = org.telegram.ui.ActionBar.j6.zh;
        j5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.B3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        lx lxVar = this.J0;
        if (lxVar == null || !(lxVar.getContentView() instanceof q61)) {
            return;
        }
        org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
        q61 q61Var = (q61) this.J0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.j5 j5Var4 = this.A3;
            if (rightDrawable == j5Var4) {
                j5Var2 = j5Var4;
            }
        }
        q61Var.y(j5Var2, titleTextView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x056b, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r13, r4.E0) != false) goto L367;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        MessagesController.DialogFilter dialogFilter;
        int i13;
        long j10;
        int i14;
        boolean booleanValue;
        boolean z4;
        org.telegram.ui.Components.wn0 wn0Var;
        org.telegram.ui.Components.wn0 wn0Var2;
        int i15;
        boolean z10;
        int i16 = 2;
        ArrayList arrayList = null;
        int i17 = 0;
        if (i10 == NotificationCenter.dialogsNeedReload) {
            if (this.b0 == null || this.P1) {
                return;
            }
            int i18 = 0;
            while (true) {
                ny[] nyVarArr = this.b0;
                if (i18 >= nyVarArr.length) {
                    break;
                }
                ny nyVar = nyVarArr[i18];
                int i19 = nyVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i19 == 7 || i19 == 8) ? getMessagesController().selectedDialogFilter[this.b0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z11 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.w3 && z11) {
                    AndroidUtilities.runOnUIThread(new rq(this, nyVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    u4(nyVar);
                }
                i18++;
            }
            nw nwVar = this.w0;
            if (nwVar != null && nwVar.getVisibility() == 0) {
                this.w0.c();
            }
            this.w3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            g5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.U2 != chatFull.id) {
                return;
            }
            this.W2 = chatFull;
            q3(false);
            if (this.b0 == null || this.P1) {
                return;
            }
            while (true) {
                ny[] nyVarArr2 = this.b0;
                if (i17 >= nyVarArr2.length) {
                    return;
                }
                u4(nyVarArr2[i17]);
                i17++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                nw nwVar2 = this.w0;
                if (nwVar2 == null || nwVar2.getVisibility() != 0) {
                    return;
                }
                nw nwVar3 = this.w0;
                int defaultTabId = nwVar3.getDefaultTabId();
                lh.e1 e1Var = nwVar3.C;
                ArrayList arrayList2 = nwVar3.h;
                int i20 = nwVar3.i0.get(defaultTabId, -1);
                if (i20 < 0 || i20 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.g00 g00Var = (org.telegram.ui.Components.g00) arrayList2.get(i20);
                if (g00Var.d == ((ow) nwVar3.G).a(g00Var.a) || ((ow) nwVar3.G).a(g00Var.a) < 0) {
                    return;
                }
                e1Var.f1();
                if (nwVar3.j0.get(i20) != g00Var.a(true) || nwVar3.e0) {
                    nwVar3.e0 = true;
                    nwVar3.requestLayout();
                    e1Var.setItemAnimator(nwVar3.p0);
                    org.telegram.ui.Components.f00 f00Var = nwVar3.F;
                    if (f00Var != null) {
                        f00Var.l();
                    }
                    nwVar3.J = 0;
                    org.telegram.ui.Components.g00 d = nwVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        nwVar3.J = org.telegram.messenger.y3.C(24.0f, ((org.telegram.ui.Components.g00) arrayList2.get(i21)).a(true), nwVar3.J);
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
                if (this.b0 != null) {
                    int i22 = 0;
                    while (true) {
                        ny[] nyVarArr3 = this.b0;
                        if (i22 >= nyVarArr3.length) {
                            break;
                        }
                        ky kyVar = nyVarArr3[i22].a;
                        if (kyVar != null) {
                            for (int i23 = 0; i23 < kyVar.getChildCount(); i23++) {
                                View childAt = kyVar.getChildAt(i23);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i22++;
                    }
                }
                nw nwVar4 = this.w0;
                if (nwVar4 != null) {
                    nwVar4.getTabsContainer().f1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.closeSearchByActiveAction) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.h(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.proxySettingsChanged) {
                Z4(false, false);
                return;
            }
            long j11 = 0;
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                g5(num.intValue(), true);
                nw nwVar5 = this.w0;
                if (nwVar5 != null && nwVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.w0.c();
                }
                if (this.U2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.U2));
                    this.V2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.X2.e(this.V2, this.Y2);
                }
                if (this.b0 != null) {
                    for (int i24 = 0; i24 < this.b0.length; i24++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.b0[i24].d.T(true);
                        }
                    }
                }
                d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i25 = NotificationCenter.appDidLogout;
            boolean[] zArr = v4;
            if (i10 == i25) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.b0 == null || this.P1) {
                    return;
                }
                org.telegram.ui.Components.z10 z10Var = this.q0;
                if (z10Var != null) {
                    z10 = z10Var.getProgressVisible();
                    this.q0.f(false, true);
                } else {
                    z10 = false;
                }
                for (ny nyVar2 : this.b0) {
                    nyVar2.d.e = false;
                }
                if (z10) {
                    z4(0.0f);
                    ValueAnimator valueAnimator = this.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.Z, 1.0f).setDuration(250L);
                    this.a0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.nr.f);
                    this.a0.addUpdateListener(new ov(this, 0));
                    this.a0.start();
                }
                int i26 = 0;
                boolean z12 = false;
                while (true) {
                    ny[] nyVarArr4 = this.b0;
                    if (i26 >= nyVarArr4.length) {
                        break;
                    }
                    if (!nyVarArr4[i26].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z12 = true;
                    } else {
                        this.b0[i26].d.l();
                    }
                    i26++;
                }
                if (z12) {
                    g5(0, true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.openedChatChanged) {
                if (this.b0 == null) {
                    return;
                }
                int i27 = 0;
                while (true) {
                    ny[] nyVarArr5 = this.b0;
                    if (i27 >= nyVarArr5.length) {
                        g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (nyVarArr5[i27].p() && AndroidUtilities.isTablet()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[0]).longValue();
                        long longValue2 = ((Long) objArr[1]).longValue();
                        MessagesStorage.TopicKey topicKey = this.m2;
                        if (!booleanValue2) {
                            topicKey.dialogId = longValue;
                            topicKey.topicId = longValue2;
                        } else if (longValue == topicKey.dialogId && longValue2 == topicKey.topicId) {
                            topicKey.dialogId = 0L;
                            topicKey.topicId = 0L;
                        }
                        this.b0[i27].d.s = topicKey.dialogId;
                    }
                    i27++;
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
                    xx xxVar = this.z0;
                    if (xxVar == null || (wn0Var2 = xxVar.V) == null || (i15 = wn0Var2.e0) == 15) {
                        return;
                    }
                    int i28 = wn0Var2.p0;
                    MessagesStorage.getInstance(i28).getStorageQueue().postRunnable(new j3.v(i28, i15, new tf.r(wn0Var2), 14));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    g5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    xx xxVar2 = this.z0;
                    if (xxVar2 == null || (wn0Var = xxVar2.V) == null) {
                        return;
                    }
                    wn0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.a2 != connectionState) {
                        this.a2 = connectionState;
                        Z4(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    Z4(true, false);
                    xx xxVar3 = this.z0;
                    if (xxVar3 != null) {
                        int currentPosition = xxVar3.getCurrentPosition();
                        org.telegram.ui.Components.co0 co0Var = xxVar3.Q;
                        c5(co0Var != null && co0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                int i29 = 3;
                if (i10 == NotificationCenter.needDeleteDialog) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat2 = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z4 = false;
                    } else {
                        z4 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    Runnable hwVar = new hw(this, chat2, longValue3, booleanValue, user, z4);
                    N3();
                    if (this.v0[0] == null) {
                        hwVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        hwVar.run();
                        return;
                    }
                    UndoView Y3 = Y3();
                    if (Y3 != null) {
                        Y3.j(booleanValue ? 1 : 95, longValue3, hwVar);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.folderBecomeEmpty) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int i30 = this.S2;
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
                        ng0 ng0Var = new ng0();
                        dw dwVar = new dw(this, 5);
                        dw dwVar2 = new dw(this, 6);
                        boolean z13 = checkEmailSuggestion == 2;
                        ng0Var.C = 3;
                        ng0Var.a = 12;
                        ng0Var.a0 = dwVar;
                        ng0Var.b0 = dwVar2;
                        ng0Var.d0 = z13;
                        ng0Var.e0 = true;
                        presentFragment(ng0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.z10 z10Var2 = this.q0;
                    if (z10Var2 != null) {
                        z10Var2.f(true, true);
                    }
                    ny[] nyVarArr6 = this.b0;
                    if (nyVarArr6 != null) {
                        for (ny nyVar3 : nyVarArr6) {
                            ww wwVar = nyVar3.d;
                            wwVar.N = false;
                            wwVar.e = true;
                            wwVar.l();
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.messagesDeleted) {
                    if (!this.m3 || this.z0 == null) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    long longValue4 = ((Long) objArr[1]).longValue();
                    xx xxVar4 = this.z0;
                    HashMap hashMap = xxVar4.w0;
                    SparseArray sparseArray = xxVar4.h;
                    int size2 = sparseArray.size();
                    for (int i31 = 0; i31 < size2; i31++) {
                        View view = (View) sparseArray.valueAt(i31);
                        if (view instanceof t10) {
                            ((t10) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i32 = 0; i32 < xxVar4.getChildCount(); i32++) {
                        if (xxVar4.getChildAt(i32) instanceof t10) {
                            ((t10) xxVar4.getChildAt(i32)).e(longValue4, arrayList3);
                        }
                    }
                    xxVar4.J0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    int i33 = 0;
                    while (i33 < arrayList4.size()) {
                        l10 l10Var = (l10) arrayList4.get(i33);
                        MessageObject messageObject = (MessageObject) hashMap.get(l10Var);
                        if (messageObject != null) {
                            j10 = j11;
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < j10) {
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
                                        arrayList.add(l10Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i33;
                            j10 = j11;
                        }
                        i33 = i13 + 1;
                        j11 = j10;
                    }
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i35 = 0; i35 < size3; i35++) {
                            hashMap.remove(arrayList.get(i35));
                        }
                        xxVar4.u0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.w0 w0Var = xxVar4.z0;
                        if (w0Var != null) {
                            w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.b0 != null) {
                        int i36 = 0;
                        while (true) {
                            ny[] nyVarArr7 = this.b0;
                            if (i36 >= nyVarArr7.length) {
                                break;
                            }
                            tf.h hVar = nyVarArr7[i36].d.M;
                            if (hVar != null) {
                                hVar.a.clear();
                                hVar.b.clear();
                                hVar.c.clear();
                                hVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(hVar.e);
                            }
                            i36++;
                        }
                    }
                    oa1 oa1Var = oa1.b;
                    if (oa1Var != null) {
                        oa1Var.dismiss();
                        oa1.b = null;
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.communitySwitchedCollapsed) {
                    long longValue5 = ((Long) objArr[0]).longValue();
                    boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                    if (this.U2 != longValue5 || booleanValue3) {
                        return;
                    }
                    org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                    if (e5Var == null || e5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.U2 == ((Long) objArr[0]).longValue()) {
                        q3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            zu zuVar = this.O3;
                            if (zuVar == null || zuVar.getTag() == null) {
                                return;
                            }
                            zu zuVar2 = this.O3;
                            zuVar2.animate().setListener(null).cancel();
                            zuVar2.animate().setListener(new org.telegram.ui.Components.ex0(i29, this, zuVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.O3.setTag(null);
                            return;
                        }
                        if (this.O3 == null) {
                            Context context = this.fragmentView.getContext();
                            zu zuVar3 = new zu(context);
                            LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                            org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
                            jj0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            jj0Var.getAnimatedDrawable().I(1);
                            jj0Var.d();
                            f10.addView(jj0Var, k7.b6.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i37 = org.telegram.ui.ActionBar.j6.G6;
                            yh.t(i37, null, false, textView, 1);
                            TextView j12 = yh.j(f10, textView, k7.b6.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            j12.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            j12.setTextSize(1, 14.0f);
                            j12.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            j12.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i37, false));
                            j12.setGravity(1);
                            TextView j13 = yh.j(f10, j12, k7.b6.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            j13.setTextSize(1, 14.0f);
                            j13.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            j13.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i37, false));
                            j13.setGravity(1);
                            f10.addView(j13, k7.b6.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            zuVar3.addView(f10, k7.b6.e(-1, -2, 16));
                            zuVar3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                            zuVar3.setOnTouchListener(new yu());
                            this.O3 = zuVar3;
                            zuVar3.setAlpha(0.0f);
                            ((hy) this.fragmentView).addView(this.O3);
                            this.O3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                        }
                        this.O3.setTag(1);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseOpened) {
                    if (getMessagesStorage().showClearDatabaseAlert) {
                        getMessagesStorage().showClearDatabaseAlert = false;
                        oa1.n(this);
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
                    getMessagesController().loadPinnedDialogs(this.S2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i38 = 0;
                    while (true) {
                        ny[] nyVarArr8 = this.b0;
                        if (i38 >= nyVarArr8.length) {
                            return;
                        }
                        ny nyVar4 = nyVarArr8[i38];
                        if (nyVar4 != null && (((i12 = nyVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[nyVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            nyVar4.q(true);
                            return;
                        }
                        i38++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            f5(this.S);
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
                    int i39 = 0;
                    while (true) {
                        ny[] nyVarArr9 = this.b0;
                        if (i39 >= nyVarArr9.length) {
                            return;
                        }
                        ny nyVar5 = nyVarArr9[i39];
                        if (nyVar5.a != null) {
                            int i40 = 0;
                            while (true) {
                                if (i40 < nyVar5.a.getChildCount()) {
                                    View childAt2 = nyVar5.a.getChildAt(i40);
                                    if (childAt2 instanceof org.telegram.ui.Cells.r2) {
                                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt2;
                                        if (longValue6 == r2Var.getDialogId()) {
                                            r2Var.t();
                                            break;
                                        }
                                    }
                                    i40++;
                                }
                            }
                        }
                        i39++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof rh.q2) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        return this.S2 == 1;
    }

    public final void e5() {
        ph.f3 f3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.L3 != storiesEnabled) {
            X4();
            if (!this.L3 && storiesEnabled && (f3Var = this.m0) != null) {
                f3Var.v();
            }
            this.L3 = storiesEnabled;
        }
        org.telegram.ui.Components.z10 z10Var = this.q0;
        if (z10Var == null) {
            return;
        }
        if (this.O0 == 10) {
            z10Var.setImageResource(R.drawable.floating_check);
            this.q0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            z10Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.q0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
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

    public final void f5(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        nh.t6 X3;
        ArrayList arrayList;
        if (this.B0 == null || this.F != null) {
            return;
        }
        jx jxVar = this.C3;
        if ((jxVar != null && jxVar.c()) || this.m3 || (kVar = this.actionBar) == null || kVar.s() || this.i2) {
            return;
        }
        ph.da daVar = ph.da.C2;
        int i10 = 0;
        if ((daVar != null && daVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().H0)) {
            z4 = false;
        }
        int i11 = 1;
        boolean z11 = !e4() && X3().G();
        if (this.U2 != 0) {
            z10 = false;
        } else if (e4()) {
            z10 = !X3().h.isEmpty();
        } else {
            z10 = !z11 && (((arrayList = (X3 = X3()).g) != null && arrayList.size() > 0) || X3.H());
            z11 = X3().G();
        }
        this.I = z11;
        boolean z12 = this.D0;
        boolean z13 = z11 || z10;
        this.D0 = z13;
        if (z10 || z13) {
            this.B0.p(z4, z13 != z12);
        }
        boolean z14 = this.D0;
        int i12 = 2;
        int i13 = 8;
        if (z14 != z12) {
            if (z4) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.D0 && !isInPreviewMode()) {
                    this.B0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E0, this.D0 ? 1.0f : 0.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new yi(i11, this));
                this.G.addListener(new org.telegram.ui.Components.f91(this, 16));
                this.G.setDuration(200L);
                this.G.setInterpolator(org.telegram.ui.Components.nr.f);
                this.G.start();
            } else {
                this.B0.setVisibility((!z14 || isInPreviewMode()) ? 8 : 0);
                this.E0 = this.D0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        if (z10) {
            this.B0.l(1.0f, false);
        }
        if (z4 && !isInPreviewMode()) {
            this.B0.setVisibility(0);
            float f10 = -this.K;
            float T3 = z10 ? 0.0f : T3();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat2;
            ofFloat2.addUpdateListener(new wx(this, f10, z10, T3));
            this.F.addListener(new px(this, z10, i12));
            this.F.setDuration(200L);
            this.F.setInterpolator(org.telegram.ui.Components.nr.f);
            this.F.start();
            return;
        }
        this.H = z10;
        gx gxVar = this.B0;
        if ((z10 || this.I) && !isInPreviewMode()) {
            i13 = 0;
        }
        gxVar.setVisibility(i13);
        if (z10) {
            this.u3 = -AndroidUtilities.dp(81.0f);
            C4(-T3());
        } else {
            C4(0.0f);
        }
        while (true) {
            ny[] nyVarArr = this.b0;
            if (i10 >= nyVarArr.length) {
                break;
            }
            ny nyVar = nyVarArr[i10];
            if (nyVar != null) {
                nyVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.o70 o70Var = this.I0;
        if (o70Var != null) {
            o70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.b0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.b0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return dialogFilter != null ? dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g5(int i10, boolean z4) {
        RecyclerView recyclerView;
        int i11;
        int childCount;
        int i12;
        if ((this.P1 && (MessagesController.UPDATE_MASK_REORDER & i10) == 0) || this.isPaused) {
            return;
        }
        int i13 = 0;
        while (i13 < 3) {
            if (i13 == 2) {
                xx xxVar = this.z0;
                recyclerView = xxVar != null ? xxVar.S : null;
            } else {
                ny[] nyVarArr = this.b0;
                if (nyVarArr != null) {
                    ky kyVar = i13 < nyVarArr.length ? nyVarArr[i13].a : null;
                    if (kyVar == null || nyVarArr[i13].getVisibility() == 0) {
                        r5 = kyVar != null ? this.b0[i13] : null;
                        recyclerView = kyVar;
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
                        boolean z10 = childAt instanceof org.telegram.ui.Cells.r2;
                        ArrayList arrayList = this.F2;
                        if (z10 && (this.z0 == null || recyclerView.getAdapter() != this.z0.V)) {
                            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                r2Var.T(this.actionBar.s(), true);
                                i11 = this.P1 ? i11 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                r2Var.V(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
                            } else {
                                if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i10) == 0) {
                                    if (r2Var.b0(i10, z4)) {
                                        r5.q(false);
                                        break;
                                    }
                                } else if (this.b0[i13].p() && AndroidUtilities.isTablet()) {
                                    r2Var.setDialogSelected(r2Var.getDialogId() == this.m2.dialogId);
                                }
                                if (arrayList != null) {
                                    r2Var.V(arrayList.contains(Long.valueOf(r2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.va)) {
                                    ((org.telegram.ui.Cells.va) childAt).j(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                                    h6Var.u(i10);
                                    if (arrayList != null) {
                                        h6Var.s(arrayList.contains(Long.valueOf(h6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.P1 && (childAt instanceof org.telegram.ui.Components.sl0)) {
                                    org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) childAt;
                                    childCount = sl0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = sl0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                                            ((org.telegram.ui.Cells.n4) childAt2).b(i10);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.va)) {
                        }
                        if (!this.P1) {
                            org.telegram.ui.Components.sl0 sl0Var2 = (org.telegram.ui.Components.sl0) childAt;
                            childCount = sl0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                    }
                }
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.a5 getBackButtonState() {
        return (e4() || this.C3.f) ? org.telegram.ui.ActionBar.a5.a : org.telegram.ui.ActionBar.a5.b;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Animator getCustomSlideTransition(boolean z4, boolean z10, float f10) {
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U3, 1.0f);
            this.X3 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.U3, 1.0f);
        this.X3 = ofFloat2;
        ofFloat2.addUpdateListener(new ov(this, 2));
        this.X3.setInterpolator(org.telegram.ui.Components.nr.g);
        this.X3.setDuration(clamp);
        this.X3.start();
        return this.X3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x03a6  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        tf.k kVar;
        org.telegram.ui.Components.sl0 sl0Var;
        final int i10 = 0;
        org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6(this) { // from class: org.telegram.ui.kw
            public final /* synthetic */ oy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final /* synthetic */ void a(float f10) {
                int i11 = i10;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final void b() {
                switch (i10) {
                    case 0:
                        oy.G0(this.b);
                        break;
                    default:
                        oy oyVar = this.b;
                        xx xxVar = oyVar.z0;
                        if (xxVar != null) {
                            org.telegram.ui.ActionBar.z actionMode = xxVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = oyVar.z0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
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
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i11));
        org.telegram.ui.Cells.r2 r2Var = this.U0;
        if (r2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(r2Var, 1, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.j0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        }
        int i12 = this.S2;
        Paint paint = this.c1;
        final int i13 = 1;
        if (i12 == 0) {
            if (this.i2) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, paint, null, null, i11));
            xx xxVar = this.z0;
            if (xxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(xxVar.S, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.s1}, null, !this.T ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, paint, null, null, i11));
            xx xxVar2 = this.z0;
            if (xxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(xxVar2.S, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.s1}, null, !this.T ? org.telegram.ui.ActionBar.j6.P8 : org.telegram.ui.ActionBar.j6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.R8));
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.j6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e1, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.I5));
        if (this.w0 != null) {
            org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
            if (kVar3 == null || !kVar3.s()) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0, 0, new Class[]{org.telegram.ui.Components.j00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.j6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.h00.class}, null, null, null, org.telegram.ui.ActionBar.j6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.h00.class}, null, null, null, org.telegram.ui.ActionBar.j6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0, 0, new Class[]{org.telegram.ui.Components.j00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.j6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.h00.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.h00.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.h00.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.h00.class}, null, null, null, org.telegram.ui.ActionBar.j6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.w0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.h00.class}, null, null, null, org.telegram.ui.ActionBar.j6.U9));
        }
        arrayList.addAll(k7.e6.a(new org.telegram.ui.ActionBar.k6(this) { // from class: org.telegram.ui.kw
            public final /* synthetic */ oy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final /* synthetic */ void a(float f10) {
                int i112 = i13;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final void b() {
                switch (i13) {
                    case 0:
                        oy.G0(this.b);
                        break;
                    default:
                        oy oyVar = this.b;
                        xx xxVar3 = oyVar.z0;
                        if (xxVar3 != null) {
                            org.telegram.ui.ActionBar.z actionMode = xxVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = oyVar.z0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
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
        }, org.telegram.ui.ActionBar.j6.w8, i14));
        int i15 = 0;
        while (true) {
            if (i15 >= 3) {
                break;
            }
            if (i15 == 2) {
                xx xxVar3 = this.z0;
                if (xxVar3 != null) {
                    sl0Var = xxVar3.S;
                    if (sl0Var != null) {
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i10] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr2[1] = org.telegram.ui.Cells.h6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i10] = org.telegram.ui.Cells.r2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.j6.w0;
                        int i16 = org.telegram.ui.ActionBar.j6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr3, paint2, null, null, i16));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i10] = org.telegram.ui.Cells.r2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.j6.y0;
                        int i17 = org.telegram.ui.ActionBar.j6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr4, paint3, null, null, i17));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i10] = org.telegram.ui.Cells.r2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr5, org.telegram.ui.ActionBar.j6.L0, null, null, org.telegram.ui.ActionBar.j6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr6[1] = org.telegram.ui.Cells.h6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i10] = org.telegram.ui.ActionBar.j6.a1;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.j6.a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr7[1] = org.telegram.ui.Cells.h6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i10] = org.telegram.ui.ActionBar.j6.g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.j6.h1;
                        int i18 = org.telegram.ui.ActionBar.j6.j9;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr7, null, drawableArr2, null, i18));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i10] = org.telegram.ui.Cells.r2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i10] = org.telegram.ui.ActionBar.j6.j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.j6.k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.j6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.j6.b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i10] = org.telegram.ui.Cells.r2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i10] = org.telegram.ui.ActionBar.j6.l1;
                        int i19 = org.telegram.ui.ActionBar.j6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr9, null, drawableArr4, null, i19));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr10[1] = org.telegram.ui.Cells.h6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, clsArr10, null, new Paint[]{textPaintArr[i10], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, null, org.telegram.ui.ActionBar.j6.X8));
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, null, org.telegram.ui.ActionBar.j6.Z8));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[1], null, null, org.telegram.ui.ActionBar.j6.i9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[0], null, null, org.telegram.ui.ActionBar.j6.g9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.G0, null, null, org.telegram.ui.ActionBar.j6.m9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i18));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.j6.H0, null, null, org.telegram.ui.ActionBar.j6.p9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.I0, null, null, org.telegram.ui.ActionBar.j6.q9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.J0, null, null, org.telegram.ui.ActionBar.j6.r9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.K0, null, null, i19));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.v0, null, null, org.telegram.ui.ActionBar.j6.s9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.u0, null, null, org.telegram.ui.ActionBar.j6.t9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.T0}, null, org.telegram.ui.ActionBar.j6.u9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.V0, org.telegram.ui.ActionBar.j6.W0}, null, org.telegram.ui.ActionBar.j6.v9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.X0}, null, org.telegram.ui.ActionBar.j6.w9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.x0, null, null, org.telegram.ui.ActionBar.j6.x9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Y0}, null, org.telegram.ui.ActionBar.j6.y9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i1}, null, org.telegram.ui.ActionBar.j6.A9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f1}, null, org.telegram.ui.ActionBar.j6.z9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.c1}, null, org.telegram.ui.ActionBar.j6.B9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m1}, null, i16));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n1}, null, org.telegram.ui.ActionBar.j6.Z5));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o1}, null, org.telegram.ui.ActionBar.j6.zj));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p1, org.telegram.ui.ActionBar.j6.q1, org.telegram.ui.ActionBar.j6.r1}, null, i17));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.d9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.c9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.T8));
                        int i20 = org.telegram.ui.ActionBar.j6.d6;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.j6.k7));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.j6.h6));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.j6.Q0, null, null, org.telegram.ui.ActionBar.j6.A6));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.p6));
                        org.telegram.ui.Cells.u3.a(arrayList, sl0Var);
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 4, new Class[]{org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
                        int i21 = org.telegram.ui.ActionBar.j6.b7;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i21));
                        int i22 = org.telegram.ui.ActionBar.j6.a7;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i21));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 48, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.B6));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.o6));
                        i15++;
                        i10 = 0;
                    }
                }
                i15++;
                i10 = 0;
            } else {
                ny[] nyVarArr = this.b0;
                if (nyVarArr != null) {
                    sl0Var = i15 < nyVarArr.length ? nyVarArr[i15].a : null;
                    if (sl0Var != null) {
                    }
                }
                i15++;
                i10 = 0;
            }
        }
        int i23 = org.telegram.ui.ActionBar.j6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.V7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.W7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.X7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Y7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Z7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.a8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.b8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.L7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.M7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.N7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.k9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.j9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.o9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Y8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.l9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.n9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.h9));
        if (this.b0 != null) {
            int i24 = 0;
            while (true) {
                ny[] nyVarArr2 = this.b0;
                if (i24 >= nyVarArr2.length) {
                    break;
                }
                if (this.S2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.l6(nyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.l6(nyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                }
                int i25 = org.telegram.ui.ActionBar.j6.m9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, 4, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"emptyTextView1"}, null, null, null, i25));
                int i26 = org.telegram.ui.ActionBar.j6.g9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, 4, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"emptyTextView2"}, null, null, null, i26));
                if (SharedConfig.archiveHidden) {
                    org.telegram.ui.Components.gj0[] gj0VarArr = {org.telegram.ui.ActionBar.j6.u1};
                    int i27 = org.telegram.ui.ActionBar.j6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, gj0VarArr, "Arrow1", i27));
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.u1}, "Arrow2", i27));
                } else {
                    org.telegram.ui.Components.gj0[] gj0VarArr2 = {org.telegram.ui.ActionBar.j6.u1};
                    int i28 = org.telegram.ui.ActionBar.j6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, gj0VarArr2, "Arrow1", i28));
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.u1}, "Arrow2", i28));
                }
                org.telegram.ui.Components.gj0[] gj0VarArr3 = {org.telegram.ui.ActionBar.j6.u1};
                int i29 = org.telegram.ui.ActionBar.j6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, gj0VarArr3, "Box2", i29));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.u1}, "Box1", i29));
                org.telegram.ui.Components.gj0[] gj0VarArr4 = {org.telegram.ui.ActionBar.j6.x1};
                int i30 = org.telegram.ui.ActionBar.j6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, gj0VarArr4, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.x1}, "Line", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.y1}, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.y1}, "Line", i30));
                org.telegram.ui.Components.gj0[] gj0VarArr5 = {org.telegram.ui.ActionBar.j6.v1};
                int i31 = org.telegram.ui.ActionBar.j6.c9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, gj0VarArr5, "Arrow", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.v1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.v1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.z1}, "Line 1", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.z1}, "Line 2", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.z1}, "Line 3", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.z1}, "Cup Red", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.z1}, "Box", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.w1}, "Arrow1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.w1}, "Arrow2", org.telegram.ui.ActionBar.j6.d9));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.w1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.gj0[]{org.telegram.ui.ActionBar.j6.w1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i24].a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
                int i32 = i24;
                org.telegram.ui.ActionBar.k6 k6Var2 = k6Var;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i32].a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, k6Var2, org.telegram.ui.ActionBar.j6.y6));
                k6Var = k6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i32].a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, k6Var2, org.telegram.ui.ActionBar.j6.il));
                int i33 = org.telegram.ui.ActionBar.j6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i32].a, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i32].a, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0[i32].w, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
                kVar = this.b0[i32].d;
                kVar.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.j6.U8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"headerTextView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"messageTextView"}, null, null, null, i26));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                i24 = i32 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S9));
        xx xxVar4 = this.z0;
        if (xxVar4 != null) {
            org.telegram.ui.Components.wn0 wn0Var = xxVar4.V;
            arrayList.add(new org.telegram.ui.ActionBar.l6(wn0Var != null ? wn0Var.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.w0, null, null, org.telegram.ui.ActionBar.j6.U8));
            org.telegram.ui.Components.wn0 wn0Var2 = this.z0.V;
            arrayList.add(new org.telegram.ui.ActionBar.l6(wn0Var2 != null ? wn0Var2.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.y0, null, null, org.telegram.ui.ActionBar.j6.V8));
            org.telegram.ui.Components.wn0 wn0Var3 = this.z0.V;
            arrayList.add(new org.telegram.ui.ActionBar.l6(wn0Var3 != null ? wn0Var3.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.L0, null, null, org.telegram.ui.ActionBar.j6.W8));
            org.telegram.ui.Components.wn0 wn0Var4 = this.z0.V;
            arrayList.add(new org.telegram.ui.ActionBar.l6(wn0Var4 != null ? wn0Var4.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.N0, null, null, org.telegram.ui.ActionBar.j6.f9));
            org.telegram.ui.Components.wn0 wn0Var5 = this.z0.V;
            arrayList.add(new org.telegram.ui.ActionBar.l6(wn0Var5 != null ? wn0Var5.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            org.telegram.ui.Components.wn0 wn0Var6 = this.z0.V;
            arrayList.add(new org.telegram.ui.ActionBar.l6(wn0Var6 != null ? wn0Var6.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, null, null, null, org.telegram.ui.ActionBar.j6.T8));
        }
        int i34 = 0;
        while (true) {
            UndoView[] undoViewArr = this.v0;
            if (i34 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i34];
            int i35 = org.telegram.ui.ActionBar.j6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoView, 32, null, null, null, null, i35));
            int i36 = org.telegram.ui.ActionBar.j6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i36));
            int i37 = org.telegram.ui.ActionBar.j6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", i35));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", i35));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", i37));
            i34++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.o5));
        int i38 = org.telegram.ui.ActionBar.j6.q7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ri));
        int i39 = org.telegram.ui.ActionBar.j6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xi));
        if (this.y1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.y1, 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.y1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.y1, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Ud));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.y1, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Wd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.y1, TLObject.FLAG_23, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        }
        int i40 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.g8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.hh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.jk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.kk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.lk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.mk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.hk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.ik));
        tf.g0 g0Var = this.Y;
        if (g0Var != null) {
            arrayList.addAll(g0Var.getThemeDescriptions());
            this.Y.B1();
        }
        qy qyVar = this.e0;
        if (qyVar != null) {
            qyVar.a();
            this.e0.invalidate();
        }
        xx xxVar5 = this.z0;
        if (xxVar5 != null) {
            xxVar5.M(arrayList);
        }
        org.telegram.ui.Cells.z2 z2Var = this.J1;
        int i41 = 8;
        if (z2Var != null) {
            arrayList.addAll(k7.e6.a(new org.telegram.ui.Components.t6(new zi(z2Var, 19), i41), org.telegram.ui.ActionBar.j6.d6, i40, org.telegram.ui.ActionBar.j6.y6));
        }
        org.telegram.ui.Cells.sa saVar = this.K1;
        if (saVar != null) {
            arrayList.addAll(k7.e6.a(new org.telegram.ui.Components.t6(new zi(saVar, 20), i41), org.telegram.ui.ActionBar.j6.d6, i40, org.telegram.ui.ActionBar.j6.y6, org.telegram.ui.ActionBar.j6.I6, i38));
        }
        org.telegram.ui.Cells.m mVar = this.I1;
        if (mVar != null) {
            arrayList.addAll(k7.e6.a(new org.telegram.ui.Components.t6(new zi(mVar, 21), i41), org.telegram.ui.ActionBar.j6.d6, i40, org.telegram.ui.ActionBar.j6.y6, org.telegram.ui.ActionBar.j6.I6, i38));
        }
        return arrayList;
    }

    public final boolean h4() {
        return this.z2 == null && this.k2 == null;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        zw zwVar;
        if ((this.P0 <= 1 && ((zwVar = this.y1) == null || zwVar.getVisibility() != 0 || TextUtils.isEmpty(this.y1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j10, View view) {
        if (this.i2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.F2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.h6) {
            ((org.telegram.ui.Cells.h6) view).s(true, true);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        jx jxVar;
        return (this.g2 || (jxVar = this.C3) == null || jxVar.getFragment() == null) ? i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.d6)) > 0.699999988079071d : this.C3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(tf.e0 e0Var) {
        xx xxVar;
        if (!this.m3 || (xxVar = this.z0) == null) {
            return;
        }
        ArrayList arrayList = xxVar.x0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (e0Var.b((tf.e0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(e0Var);
        ey eyVar = this.U;
        eyVar.C.add(e0Var);
        eyVar.F = r1.size() - 1;
        eyVar.f();
        this.U.r.getText().clear();
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
        int i12 = this.b0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i12 == 7 || i12 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.b0[0].s == 8 ? (char) 1 : (char) 0];
        }
        this.v3 = 2;
        int i13 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            A4(true, true);
            o3();
            if (this.O1 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.O1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.O1.get(i14)).id == j10) {
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
                    this.O1.remove(i10);
                    this.b0[0].x.D();
                    this.b0[0].q(true);
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

    public final void k3(boolean z4) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.S2 == 0 && this.U2 == 0 && Build.VERSION.SDK_INT >= 33 && vj0.n(parentActivity)) {
            if (z4) {
                showDialog(new vj0(parentActivity, !org.telegram.ui.Components.ge0.c(), new bw(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.R1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z4) {
                org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(parentActivity, new vv(this, 1)).a;
                this.Q1 = d2Var;
                showDialog(d2Var);
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
        } else if (this.x0) {
            this.x0 = false;
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
            TLRPC.RequestPeerType requestPeerType = this.D;
            if (isChannelAndNotMegaGroup == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.D.bot_participant) == null || !bool2.booleanValue() || getMessagesController().isInChatCached(chat, user) || ChatObject.canAddBotsToChat(chat)))) {
                Boolean bool3 = this.D.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.D.forum;
                if ((bool4 == null || bool4.booleanValue() == ChatObject.isForum(chat)) && ((this.D.user_admin_rights == null || getMessagesController().matchesAdminRights(chat, getUserConfig().getCurrentUser(), this.D.user_admin_rights)) && (this.D.bot_admin_rights == null || getMessagesController().matchesAdminRights(chat, user, this.D.bot_admin_rights) || ChatObject.canAddAdmins(chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l3(CharSequence charSequence) {
        if (this.y1 == null) {
            return;
        }
        if (this.A2 == null && this.B2 == null && this.C2 == null) {
            return;
        }
        if (this.D2 == null) {
            org.telegram.ui.Components.qq0 qq0Var = new org.telegram.ui.Components.qq0(getParentActivity(), getResourceProvider());
            this.D2 = qq0Var;
            int i10 = 0;
            qq0Var.setLayoutClickListener(new rv(this, i10));
            this.D2.setOnModeChangeListener(new sv(this, i10));
            zw zwVar = this.y1;
            org.telegram.ui.Components.qq0 qq0Var2 = this.D2;
            if (qq0Var2 == null) {
                zwVar.getClass();
            } else {
                zwVar.C1 = qq0Var2;
                zwVar.addView(qq0Var2, 0, k7.b6.e(-1, 48, 51));
                zwVar.c3 = false;
                zwVar.N();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D2.getLayoutParams();
            layoutParams.rightMargin = -this.y1.getPaddingRight();
            this.D2.setLayoutParams(layoutParams);
        }
        if (a4()) {
            this.D2.i(this.currentAccount, this.A2);
        } else {
            String str = this.B2;
            if (str != null) {
                org.telegram.ui.Components.qq0 qq0Var3 = this.D2;
                qq0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    qq0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.C2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.qq0 qq0Var4 = this.D2;
                    qq0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        qq0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.y1.setFieldText(charSequence);
        }
        this.y1.setOverrideHint(LocaleController.getString(a4() ? R.string.AddCaption : R.string.ShareComment));
        v3();
        if (this.D2.getMode() != 0) {
            this.y1.x1(false, false);
        }
        b5();
    }

    public final boolean l4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.D;
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
        ng.e eVar;
        sg.d dVar;
        sg.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.i4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.d4) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int dp3 = AndroidUtilities.dp(this.H ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        nw nwVar = this.w0;
        boolean z4 = false;
        int measuredHeight2 = dp3 + ((nwVar == null || nwVar.getVisibility() != 0) ? 0 : this.w0.getMeasuredHeight());
        org.telegram.ui.Components.js jsVar = this.G1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((jsVar == null || jsVar.getVisibility() != 0) ? 0 : this.G1.getSumHeightOfAllVisibleChild()) + ((int) this.K);
        int measuredHeight3 = this.actionBar.getMeasuredHeight();
        this.s4.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (this.W != null ? r9.getMeasuredHeight() : 0), this.b.e) + dp);
        boolean z10 = this.T;
        RectF rectF = this.t4;
        if (!z10) {
            if (this.y1 != null && this.v1 != null) {
                rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - n3(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            }
            eVar.g(z4 ? 2 : 1, this.r4);
            eVar.e(this.q4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar = this.j4;
            if (dVar != null) {
                dVar.i(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar.l();
            }
            dVar2 = this.k4;
            if (dVar2 == null) {
                dVar2.i(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar2.l();
                return;
            }
            return;
        }
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        z4 = true;
        eVar.g(z4 ? 2 : 1, this.r4);
        eVar.e(this.q4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar = this.j4;
        if (dVar != null) {
        }
        dVar2 = this.k4;
        if (dVar2 == null) {
        }
    }

    public final void m4(View view) {
        int i10 = 0;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(getParentActivity(), null, false, false);
        g3Var.fixNavigationBar();
        boolean z4 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z4 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z4 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        qv qvVar = new qv(this, i10);
        g3Var.items = charSequenceArr;
        g3Var.itemIcons = iArr;
        g3Var.onClickListener = qvVar;
        showDialog(g3Var);
    }

    public final int n3() {
        if (this.y1 != null) {
            return (int) (this.v1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.U2 == 0) {
            return this.d4 + this.f4;
        }
        return AndroidUtilities.dp(72.0f) + this.d4;
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
    public final void n4(View view, int i10, f2.o0 o0Var) {
        f2.o0 o0Var2;
        long j10;
        MessageObject messageObject;
        long j11;
        long j12;
        boolean z4;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Components.wn0 wn0Var;
        jx jxVar;
        long j13;
        long j14;
        MessageObject messageObject2;
        int i14;
        long makeEncryptedDialogId;
        long j15;
        long j16;
        xx xxVar;
        TLRPC.Document greetingsSticker;
        boolean z10;
        xx xxVar2;
        int i15;
        Object I;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z11 = o0Var instanceof tf.k;
        if (z11) {
            tf.k kVar = (tf.k) o0Var;
            int i17 = kVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    I = kVar.I(i10);
                    if (this.z2 == null && kVar.n && o0Var.j(i10) == 21) {
                        this.z2.K(this);
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
                                presentFragment(new oy(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.t(null)) {
                                M4(j17, view);
                                return;
                            }
                            o0Var2 = o0Var;
                            i11 = i16;
                            messageObject = null;
                            i13 = i15;
                            j12 = j17;
                            z4 = false;
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
                                    showDialog(new org.telegram.ui.Components.xx0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) I;
                            o0Var2 = o0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.h80(getParentActivity(), chatInvite, str, this, null));
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
                            z4 = false;
                            i12 = 0;
                            j11 = 0;
                            j10 = 0;
                        }
                        j17 = -j18;
                    } else {
                        j17 = ((TLRPC.User) I).id;
                    }
                    o0Var2 = o0Var;
                    i16 = 0;
                    i11 = i16;
                    messageObject = null;
                    i13 = i15;
                    j12 = j17;
                    z4 = false;
                    i12 = 0;
                    j11 = 0;
                    j10 = 0;
                }
            }
            i15 = 0;
            I = kVar.I(i10);
            if (this.z2 == null) {
            }
            if (I instanceof TLRPC.User) {
            }
            o0Var2 = o0Var;
            i16 = 0;
            i11 = i16;
            messageObject = null;
            i13 = i15;
            j12 = j17;
            z4 = false;
            i12 = 0;
            j11 = 0;
            j10 = 0;
        } else {
            o0Var2 = o0Var;
            xx xxVar3 = this.z0;
            if (xxVar3 == null || o0Var2 != (wn0Var = xxVar3.V)) {
                j10 = 0;
                messageObject = null;
                j11 = 0;
                j12 = 0;
                z4 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            } else {
                Object J = wn0Var.J(i10);
                z4 = this.z0.V.O(i10);
                if (J instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) J;
                    makeEncryptedDialogId = user.id;
                    if (!this.i2) {
                        this.T1 = makeEncryptedDialogId;
                        this.U1 = user;
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) J;
                    makeEncryptedDialogId = -chat3.id;
                    if (!this.i2) {
                        this.T1 = makeEncryptedDialogId;
                        this.U1 = chat3;
                    }
                } else if (J instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) J;
                    makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
                    if (!this.i2) {
                        this.T1 = makeEncryptedDialogId;
                        this.U1 = encryptedChat;
                    }
                } else {
                    if (J instanceof MessageObject) {
                        messageObject2 = (MessageObject) J;
                        long dialogId = messageObject2.getDialogId();
                        int id2 = messageObject2.getId();
                        j10 = 0;
                        j14 = ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-dialogId))) ? MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true) : 0L;
                        xx xxVar4 = this.z0;
                        if (xxVar4 != null) {
                            org.telegram.ui.Components.wn0 wn0Var2 = xxVar4.V;
                            wn0Var2.g0.a(wn0Var2.W);
                        }
                        i14 = id2;
                        j13 = dialogId;
                    } else {
                        j10 = 0;
                        if (J instanceof String) {
                            String str2 = (String) J;
                            xx xxVar5 = this.z0;
                            if (xxVar5 != null && !xxVar5.V.G.isEmpty()) {
                                this.U.r.setText(str2);
                                this.U.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                sj0 sj0Var = new sj0(getParentActivity(), this);
                                sj0Var.v(str2, true);
                                sj0Var.show();
                            }
                        } else if (J instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) J;
                            org.telegram.ui.Components.z4.v(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((J instanceof TLRPC.TL_forumTopic) && (jxVar = this.C3) != null && (jxVar.getFragment() instanceof kf1)) {
                            j13 = -((kf1) this.C3.getFragment()).a;
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
                        if (this.actionBar.t("search_dialogs_action_mode") && i14 == 0 && !z4) {
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
        if (this.i2) {
            if (h5(j12)) {
                if ((!getMessagesController().isForum(j12) && !getMessagesController().isCommunity(j12)) || f4(j12)) {
                    ArrayList arrayList = this.F2;
                    if (!arrayList.isEmpty() || (this.O0 == 3 && this.c2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || p3(j12)) {
                            boolean i32 = i3(j12, view);
                            xx xxVar6 = this.z0;
                            if (xxVar6 != null && o0Var2 == xxVar6.V) {
                                this.actionBar.h(true);
                                P3(j12, i32);
                            }
                            a5();
                            return;
                        }
                        return;
                    }
                }
                if (this.j2 && getMessagesController().isCommunity(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    oy oyVar = new oy(bundle2);
                    oyVar.T2 = this;
                    oyVar.z2 = this.z2;
                    presentFragment(oyVar);
                    return;
                }
                if (!this.j2 || ((!getMessagesController().isForum(j12) || f4(j12)) && !getMessagesController().isMonoForumWithManageRights(j12))) {
                    O3(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.O0 == 1);
                bundle3.putBoolean("quote", this.L0);
                bundle3.putBoolean("reply_to", this.K0);
                kf1 kf1Var = new kf1(bundle3);
                kf1Var.I0 = this;
                presentFragment(kf1Var);
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
                    } else if (z4) {
                        TLObject tLObject = this.U1;
                        if (tLObject != null) {
                            xx xxVar7 = this.z0;
                            if (xxVar7 != null) {
                                xxVar7.V.R(this.T1, tLObject);
                            }
                            this.U1 = null;
                        }
                    } else {
                        J3();
                    }
                    boolean z12 = LocaleController.isRTL && !this.g2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.U2 == j10;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j12) || !z12) && this.m2.dialogId == j12 && ((xxVar2 = this.z0) == null || o0Var2 != xxVar2.V))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.p0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (yh.k(1, fragmentStack) instanceof xn)) {
                                ((xn) yh.k(1, fragmentStack)).U9();
                                return;
                            }
                            if (fragmentStack.size() == 2) {
                                launchActivity.p0.l(true, false);
                                return;
                            } else {
                                if (getParentActivity() instanceof LaunchActivity) {
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(0);
                                    fragmentStack.clear();
                                    fragmentStack.add(p2Var);
                                    launchActivity.p0.U(true, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    xxVar = this.z0;
                    if (xxVar != null && xxVar.v0) {
                        xxVar.Q(false);
                    }
                    if (j12 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.A0 == null) {
                            this.A0 = new org.telegram.ui.Components.qu0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.da0(bundle5, this.A0));
                        return;
                    }
                    if (this.k2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            xn xnVar = new xn(bundle4);
                            d4(xnVar, messageObject);
                            presentFragment(xnVar);
                            return;
                        }
                        return;
                    }
                    this.w3 = true;
                    if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j12));
                        TLRPC.Dialog dialog2 = getMessagesController().getDialog(j12);
                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                        boolean z13 = dialog2 != null && dialog2.view_forum_as_messages;
                        int b10 = (this.U2 == j10 || chat5 == null) ? 0 : sh.p0.b(this.currentAccount, -chat5.id);
                        if (b10 == 3) {
                            showDialog(new org.telegram.ui.Components.h80(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (b10 == 4) {
                            kh.a2.v(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.qc.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z10 = chat5.monoforum) || chat5.forum) && j15 == j10)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new oy(bundle6));
                                return;
                            }
                            xn xnVar2 = new xn(bundle4);
                            if (j15 != j10) {
                                ag.f.a(xnVar2, MessagesStorage.TopicKey.of(j12, j15));
                            }
                            if (z11 && DialogObject.isUserDialog(j12) && getMessagesController().dialogs_dict.f(j12) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                xnVar2.y9 = greetingsSticker;
                                xnVar2.z9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                jx jxVar2 = this.C3;
                                if (jxVar2.a != null) {
                                    jxVar2.a();
                                }
                            }
                            d4(xnVar2, messageObject);
                            presentFragment(xnVar2);
                            return;
                        }
                        if (z10) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            xn xnVar3 = new xn(bundle4);
                            d4(xnVar3, messageObject);
                            presentFragment(xnVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            xn xnVar4 = new xn(bundle4);
                            ag.f.a(xnVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(xnVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.U2 != j10) {
                            if (!z13) {
                                presentFragment(new kf1(bundle4));
                                return;
                            }
                            xn xnVar5 = new xn(bundle4);
                            d4(xnVar5, messageObject);
                            presentFragment(xnVar5);
                            return;
                        }
                        if (!z12) {
                            if (!z13) {
                                presentFragment(new kf1(bundle4));
                                return;
                            }
                            xn xnVar6 = new xn(bundle4);
                            d4(xnVar6, messageObject);
                            presentFragment(xnVar6);
                            return;
                        }
                        if (this.g2) {
                            return;
                        }
                        if (z13) {
                            xn xnVar7 = new xn(bundle4);
                            d4(xnVar7, messageObject);
                            presentFragment(xnVar7);
                            return;
                        }
                        jx jxVar3 = this.C3;
                        qx qxVar = jxVar3.a;
                        if (qxVar == null || (-qxVar.a) != j12) {
                            ky kyVar = this.b0[0].a;
                            kyVar.m3 = 0.0f;
                            kyVar.n3 = kyVar.l3;
                            kyVar.o3 = kyVar.f3 != 0.0f;
                            qx qxVar2 = new qx(bundle4);
                            qxVar2.J0 = this;
                            final jx jxVar4 = this.C3;
                            org.telegram.ui.ActionBar.e5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = jxVar4.n;
                            if (!jxVar4.r) {
                                jxVar4.w = parentLayout;
                                qxVar2.onFragmentCreate();
                                qxVar2.setInPreviewMode(true);
                                qxVar2.setParentLayout(parentLayout);
                                View performCreateView = qxVar2.performCreateView(jxVar4.getContext());
                                qxVar2.onResume();
                                jxVar4.b = performCreateView;
                                jxVar4.addView(performCreateView);
                                final qx qxVar3 = jxVar4.a;
                                l0 l0Var = qxVar2.e;
                                jxVar4.c = l0Var;
                                jxVar4.addView(l0Var);
                                jxVar4.a = qxVar2;
                                t31.N = j10;
                                t31.N = -qxVar2.a;
                                int i19 = 10;
                                if (qxVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.k actionBar = qxVar2.getActionBar();
                                    jxVar4.d = actionBar;
                                    jxVar4.addView(actionBar);
                                    jxVar4.d.R0 = new vy0(jxVar4, i19);
                                }
                                if (qxVar3 != null) {
                                    final qx qxVar4 = jxVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.j jVar = jxVar4.x;
                                        if (jVar != null) {
                                            jVar.c();
                                        }
                                        qxVar4.onTransitionAnimationStart(true, false);
                                        jxVar4.B = qxVar3;
                                        jxVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.j jVar2 = new o1.j(new kb.a(0.0f));
                                        jxVar4.x = jVar2;
                                        jVar2.u = yh.n(1000.0f, 400.0f, 1.0f);
                                        t31.f(qxVar3, qxVar4, 0.0f);
                                        jxVar4.x.b(new ld0(jxVar4, i18));
                                        jxVar4.x.a(new o1.f() { // from class: org.telegram.ui.r31
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z14, float f10, float f11) {
                                                t31 t31Var = jxVar4;
                                                if (t31Var.x == null) {
                                                    return;
                                                }
                                                t31Var.x = null;
                                                org.telegram.ui.ActionBar.p2 p2Var2 = qxVar4;
                                                p2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.p2 p2Var3 = qxVar3;
                                                t31.f(p2Var3, p2Var2, 1.0f);
                                                t31Var.v = false;
                                                t31Var.B = null;
                                                p2Var3.onPause();
                                                p2Var3.onFragmentDestroy();
                                                t31Var.removeView(p2Var3.getFragmentView());
                                                t31Var.removeView(p2Var3.getActionBar());
                                                t31Var.n.unlock();
                                            }
                                        });
                                        jxVar4.x.f();
                                    } else {
                                        qxVar4.onTransitionAnimationStart(true, false);
                                        qxVar4.onTransitionAnimationEnd(true, false);
                                        t31.f(qxVar3, qxVar4, 1.0f);
                                        jxVar4.v = false;
                                        jxVar4.B = null;
                                        qxVar3.onPause();
                                        qxVar3.onFragmentDestroy();
                                        jxVar4.removeView(qxVar3.getFragmentView());
                                        jxVar4.removeView(qxVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!jxVar4.f) {
                                    jxVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        jxVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        jxVar4.e = 0.0f;
                                        jxVar4.e(true);
                                        jxVar4.g();
                                        qxVar2.onTransitionAnimationStart(true, false);
                                        jxVar4.h.addUpdateListener(new q31(jxVar4, 1));
                                        jxVar4.h.addListener(new org.telegram.ui.Components.ex0(i19, jxVar4, qxVar2));
                                        jxVar4.h.setDuration(250L);
                                        jxVar4.h.setInterpolator(org.telegram.ui.Components.nr.f);
                                        jxVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        jxVar4.h.start();
                                    } else {
                                        jxVar4.e(true);
                                        qxVar2.onTransitionAnimationStart(true, false);
                                        qxVar2.onTransitionAnimationEnd(true, false);
                                        jxVar4.e = 1.0f;
                                        jxVar4.g();
                                        jxVar4.d(false);
                                    }
                                }
                                qxVar2.setPreviewDelegate(new il0(jxVar4, 16));
                                WeakHashMap weakHashMap = r0.j0.a;
                                r0.z.c(jxVar4);
                            }
                        } else {
                            jxVar3.a();
                        }
                        xx xxVar8 = this.z0;
                        if (xxVar8 != null) {
                            xxVar8.R();
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
            xxVar = this.z0;
            if (xxVar != null) {
                xxVar.Q(false);
            }
            if (j12 != getUserConfig().getClientUserId()) {
            }
            if (this.k2 != null) {
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
        xxVar = this.z0;
        if (xxVar != null) {
        }
        if (j12 != getUserConfig().getClientUserId()) {
        }
        if (this.k2 != null) {
        }
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new mv(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f10, org.telegram.ui.Components.rl0 rl0Var) {
        org.telegram.ui.Components.wn0 wn0Var;
        org.telegram.ui.Components.wn0 wn0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && rl0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.i2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.C3.c() && r2Var.S(f10)) {
                    return H4(r2Var);
                }
            }
            jx jxVar = this.C3;
            if (jxVar == null || !jxVar.c()) {
                xx xxVar = this.z0;
                if (xxVar != null && rl0Var == (wn0Var2 = xxVar.V)) {
                    Object J = wn0Var2.J(i10);
                    if (!this.z0.V.K) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ag.f.i(chat, this.currentAccount, false));
                            } else {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.id == getUserConfig().clientUserId) {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            d2Var.Q = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r11.id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new f3.e(this, makeEncryptedDialogId, 7));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                        }
                        return true;
                    }
                }
                xx xxVar2 = this.z0;
                if (xxVar2 == null || rl0Var != (wn0Var = xxVar2.V)) {
                    Object I = ((tf.k) rl0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.i2) {
                            if ((this.O0 == 3 || I3()) && h5(dialog.id)) {
                                if (this.O0 != 1 || !I3() || !this.j2 || !getMessagesController().isForum(dialog.id)) {
                                    i3(dialog.id, view);
                                    a5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.O0 == 1);
                                bundle.putBoolean("quote", this.L0);
                                bundle.putBoolean("reply_to", this.K0);
                                kf1 kf1Var = new kf1(bundle);
                                kf1Var.I0 = this;
                                presentFragment(kf1Var);
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
                    if (this.i2) {
                        n4(view, i10, rl0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.h6) || wn0Var.O(i10)) ? 0L : ((org.telegram.ui.Cells.h6) view).getDialogId();
                    if (dialogId != 0) {
                        M4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
                closeSheet();
                return false;
            }
        } else if (!this.C3.c() || !this.C3.getFragment().onBackPressed(z4)) {
            org.telegram.ui.Components.o70 o70Var = this.I0;
            if (o70Var == null) {
                nw nwVar = this.w0;
                if (nwVar == null || !nwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.s()) {
                        if (!this.b.f) {
                            nw nwVar2 = this.w0;
                            if (nwVar2 != null && nwVar2.getVisibility() == 0 && !this.d3) {
                                nw nwVar3 = this.w0;
                                if (!nwVar3.L && !this.i3) {
                                    ArrayList arrayList = nwVar3.h;
                                    if (!arrayList.isEmpty() && nwVar3.I != ((org.telegram.ui.Components.g00) arrayList.get(0)).a) {
                                        if (z4) {
                                            nw nwVar4 = this.w0;
                                            ArrayList arrayList2 = nwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                nwVar4.f((org.telegram.ui.Components.g00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            zw zwVar = this.y1;
                            if (zwVar == null || !zwVar.t0()) {
                                gx gxVar = this.B0;
                                if (gxVar.L != 0 || gxVar.P.L0() == 0) {
                                    return super.onBackPressed(z4);
                                }
                                gxVar.h.x0(0);
                                return false;
                            }
                            if (z4) {
                                this.y1.m0(true);
                            }
                        } else if (z4) {
                            this.U.r.getText().clear();
                            this.V.b(false);
                            this.U.r.clearFocus();
                            return false;
                        }
                    } else if (z4) {
                        xx xxVar = this.z0;
                        if (xxVar != null && xxVar.getVisibility() == 0) {
                            this.z0.Q(false);
                        }
                        b4(true);
                        return false;
                    }
                } else if (z4) {
                    nwVar.setIsEditing(false);
                    I4(false);
                    return false;
                }
            } else if (z4) {
                o70Var.u();
                this.I0 = null;
                return false;
            }
        } else if (z4) {
            this.C3.a();
            xx xxVar2 = this.z0;
            if (xxVar2 != null) {
                xxVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        eg.h0 h0Var;
        nw nwVar;
        if (this.S1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.U1;
            if (tLObject != null) {
                xx xxVar = this.z0;
                if (xxVar != null) {
                    xxVar.V.R(this.T1, tLObject);
                }
                this.U1 = null;
            }
            this.S1 = false;
        }
        if (!this.H && (nwVar = this.w0) != null && nwVar.getVisibility() == 0 && this.r.f) {
            int i10 = (int) (-this.K);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.b0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
            this.H0.setVisibility(8);
            this.H0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.o0 = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        ph.f3 f3Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z4 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = R3(this.currentAccount, this.O0, this.S2, false).isEmpty();
            if (z4 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z4 = false;
            }
            if (z4) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.o0 && !this.p0 && (f3Var = this.m0) != null && this.L3) {
            this.p0 = true;
            this.o0 = false;
            f3Var.v();
        }
        AndroidUtilities.runOnUIThread(new dw(this, 3), 200L);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.o70 o70Var = this.I0;
        if (o70Var != null) {
            o70Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.d2 d2Var;
        super.onDialogDismiss(dialog);
        if (this.S2 == 0 && this.U2 == 0 && (d2Var = this.Q1) != null && dialog == d2Var && getParentActivity() != null) {
            k3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.i2 = bundle.getBoolean("onlySelect", false);
            this.j2 = this.arguments.getBoolean("canSelectTopics", false);
            this.n2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.O0 = this.arguments.getInt("dialogsType", 0);
            this.L0 = this.arguments.getBoolean("quote", false);
            this.K0 = this.arguments.getBoolean("reply_to", false);
            this.M0 = this.arguments.getLong("reply_to_author", 0L);
            this.N0 = this.arguments.getLong("forward_into_channel", 0L);
            this.c2 = this.arguments.getString("selectAlertString");
            this.d2 = this.arguments.getString("selectAlertStringGroup");
            this.e2 = this.arguments.getString("addToGroupAlertString");
            this.o2 = this.arguments.getBoolean("allowSwitchAccount");
            this.p2 = this.arguments.getBoolean("checkCanWrite", true);
            this.q2 = this.arguments.getBoolean("afterSignup", false);
            this.S2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.U2 = j10;
            if (j10 != 0) {
                this.V2 = getMessagesController().getChat(Long.valueOf(this.U2));
                this.W2 = getMessagesController().getChatFull(this.U2);
            }
            this.f2 = this.arguments.getBoolean("resetDelegate", true);
            this.P0 = this.arguments.getInt("messagesCount", 0);
            this.Q0 = this.arguments.getInt("hasPoll", 0);
            this.R0 = this.arguments.getBoolean("hasInvoice", false);
            this.r2 = this.arguments.getBoolean("showSetPasswordConfirm", this.r2);
            this.arguments.getInt("otherwiseRelogin");
            this.s2 = this.arguments.getBoolean("allowGroups", true);
            this.t2 = this.arguments.getBoolean("allowMegagroups", true);
            this.u2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.v2 = this.arguments.getBoolean("allowChannels", true);
            this.w2 = this.arguments.getBoolean("allowUsers", true);
            this.x2 = this.arguments.getBoolean("allowBots", true);
            this.y2 = this.arguments.getBoolean("closeFragment", true);
            this.C = this.arguments.getBoolean("allowGlobalSearch", true);
            this.T = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.D = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.E = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.O0 == 0) {
            this.R1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.G3 = getNotificationCenter().createObserversGroup(this);
        this.H3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.k2 == null) {
            this.a2 = getConnectionsManager().getConnectionState();
            this.H3.add(NotificationCenter.emojiLoaded);
            if (!this.i2) {
                this.H3.add(NotificationCenter.closeSearchByActiveAction);
                this.H3.add(NotificationCenter.proxySettingsChanged);
                this.G3.add(NotificationCenter.filterSettingsUpdated);
                this.G3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.G3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.H3.add(NotificationCenter.didSetPasscode);
        }
        this.G3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.O0 == 0) {
            this.G3.add(NotificationCenter.chatlistFolderUpdate);
            this.G3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        nh.t6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new nh.s5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.S2, 0L, null);
        if (this.O3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            zu zuVar = this.O3;
            if (zuVar.getParent() != null) {
                ((ViewGroup) zuVar.getParent()).removeView(zuVar);
            }
            this.O3 = null;
        }
        if (e4()) {
            nh.t6 storiesController2 = getMessagesController().getStoriesController();
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
        if (this.U2 != 0) {
            getMessagesController().loadFullChat(this.U2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        this.f4 = this.T ? AndroidUtilities.dp(72.0f) : 0;
        this.g4 = this.T ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.G3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.G3 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.H3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.H3 = null;
        }
        zw zwVar = this.y1;
        if (zwVar != null) {
            zwVar.B0();
        }
        org.telegram.ui.Components.qq0 qq0Var = this.D2;
        if (qq0Var != null) {
            qq0Var.j();
        }
        org.telegram.ui.Components.k41 k41Var = this.E2;
        if (k41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(k41Var);
            this.E2 = null;
        }
        UndoView undoView = this.v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.l3.unlock();
        this.z2 = null;
        oa1 oa1Var = oa1.b;
        if (oa1Var != null) {
            oa1Var.dismiss();
            oa1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPanTranslationUpdate(float f10) {
        if (this.b0 == null) {
            return;
        }
        this.G0 = f10;
        zw zwVar = this.y1;
        int i10 = 0;
        if (zwVar == null || !zwVar.t0()) {
            while (true) {
                ny[] nyVarArr = this.b0;
                if (i10 >= nyVarArr.length) {
                    break;
                }
                nyVarArr[i10].setTranslationY(f10);
                i10++;
            }
            if (!this.i2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.ic icVar = this.k3;
                if (icVar != null) {
                    icVar.l();
                }
            }
            xx xxVar = this.z0;
            if (xxVar != null) {
                xxVar.setTranslationY(this.G0 + this.F0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            ny[] nyVarArr2 = this.b0;
            if (i10 >= nyVarArr2.length) {
                break;
            }
            nyVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.i2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.ic icVar2 = this.k3;
            if (icVar2 != null) {
                icVar2.l();
            }
        }
        xx xxVar2 = this.z0;
        if (xxVar2 != null) {
            xxVar2.setTranslationY(this.F0);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ic icVar = this.P;
        if (icVar != null) {
            icVar.b();
            this.P = null;
        }
        jx jxVar = this.C3;
        if (jxVar != null) {
            jxVar.r = true;
            qx qxVar = jxVar.a;
            if (qxVar != null) {
                qxVar.onPause();
            }
        }
        org.telegram.ui.Components.o70 o70Var = this.I0;
        if (o70Var != null) {
            o70Var.u();
        }
        zw zwVar = this.y1;
        if (zwVar != null) {
            zwVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.b0 == null) {
            return;
        }
        while (true) {
            ny[] nyVarArr = this.b0;
            if (i10 >= nyVarArr.length) {
                return;
            }
            nyVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
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
                            vj0.m();
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
                            AndroidUtilities.runOnUIThread(new dw(this, i11));
                            getContactsController().forceImportContacts();
                            break;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                            this.R1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.x0) {
            this.x0 = false;
            J4();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        oy oyVar;
        ny nyVar;
        ww wwVar;
        int i10;
        org.telegram.ui.Components.wn0 wn0Var;
        eg.h0 h0Var;
        super.onResume();
        gx gxVar = this.B0;
        if (gxVar != null) {
            ArrayList arrayList = gxVar.x;
            nh.t6 t6Var = gxVar.s;
            t6Var.l(t6Var.g);
            t6Var.l(t6Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y10 = t6Var.y(((nh.n) arrayList.get(i11)).c);
                if (y10 != null) {
                    t6Var.X(y10);
                }
            }
        }
        jx jxVar = this.C3;
        if (jxVar != null) {
            jxVar.r = false;
            qx qxVar = jxVar.a;
            if (qxVar != null) {
                qxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
            this.H0.setVisibility(8);
            this.H0.setBackground(null);
        }
        if (this.b0 != null) {
            int i12 = 0;
            while (true) {
                ny[] nyVarArr = this.b0;
                if (i12 >= nyVarArr.length) {
                    break;
                }
                nyVarArr[i12].d.l();
                i12++;
            }
        }
        zw zwVar = this.y1;
        if (zwVar != null) {
            zwVar.E0();
        }
        long j10 = 0;
        if (!this.i2 && this.S2 == 0 && this.U2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        xx xxVar = this.z0;
        if (xxVar != null && (wn0Var = xxVar.V) != null) {
            wn0Var.l();
        }
        boolean z4 = this.q2 || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z4 && this.S2 == 0 && this.U2 == 0 && this.Z1 && !this.i2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Z1 = false;
                boolean z10 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z11 = (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z12 = i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                oyVar = this;
                org.telegram.messenger.n1 n1Var = new org.telegram.messenger.n1(oyVar, z12, z10, z11, parentActivity);
                if (oyVar.q2 && (z10 || z12)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(n1Var, j10);
            } else {
                oyVar = this;
            }
        } else {
            oyVar = this;
            if (!oyVar.i2 && oyVar.S2 == 0 && oyVar.U2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new sv(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.kh0(20));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (oyVar.S2 == 0 && oyVar.U2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new sv(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.kh0(21));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        J4();
        if (oyVar.b0 != null) {
            int i13 = 0;
            while (true) {
                ny[] nyVarArr2 = oyVar.b0;
                if (i13 >= nyVarArr2.length) {
                    break;
                }
                ny nyVar2 = nyVarArr2[i13];
                if (nyVar2.s == 0 && nyVar2.v == 2 && nyVar2.c.L0() == 0 && Z3()) {
                    oyVar.b0[i13].c.h1(1, (int) oyVar.K);
                }
                if (i13 == 0) {
                    oyVar.b0[i13].d.getClass();
                } else {
                    oyVar.b0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new a9(this, 4));
        if (oyVar.m3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), oyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            oa1.n(this);
        }
        B3();
        if (oyVar.w0 == null || (nyVar = oyVar.b0[0]) == null || (wwVar = nyVar.d) == null) {
            return;
        }
        int i14 = wwVar.h;
        if (i14 == 7 || i14 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i14 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                oyVar.w0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onSlideProgress(boolean z4, float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.W3 && this.X3 == null) {
            F4(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        eg.h0 h0Var;
        oy oyVar;
        jx jxVar = this.C3;
        if (jxVar == null || !jxVar.c()) {
            if (z4 && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
                this.H0.setVisibility(8);
                this.H0.setBackground(null);
            }
            if (z4 && this.q2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).u0.c(false);
                }
            }
        } else {
            this.C3.getFragment().onTransitionAnimationEnd(z4, z10);
        }
        if (!z4 && (oyVar = this.T2) != null) {
            oyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        jx jxVar = this.C3;
        if (jxVar == null || !jxVar.c()) {
            eg.h0 h0Var = this.H0;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                if (z4) {
                    this.H0.setAlpha(1.0f - f10);
                } else {
                    this.H0.setAlpha(f10);
                }
            }
        } else {
            this.C3.getFragment().onTransitionAnimationProgress(z4, f10);
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i10;
        int i11 = this.O0;
        if (i11 == 15 || i11 == 16 || this.e2 != null || !this.p2) {
            return true;
        }
        if (!DialogObject.isChatDialog(j10)) {
            if (!DialogObject.isEncryptedDialog(j10)) {
                return true;
            }
            if (this.Q0 == 0 && !this.R0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.SendMessageTitle);
            int i12 = this.Q0;
            if (i12 == 3) {
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i12 != 0) {
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
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
        if (!this.n2 && ChatObject.isCanWriteToChannel(j11, this.currentAccount) && (i10 = this.Q0) != 2 && i10 != 3) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.a.O = LocaleController.getString(R.string.SendMessageTitle);
        int i13 = this.Q0;
        if (i13 == 3) {
            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.TodoCantForward);
        } else if (i13 == 2) {
            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.PublicPollCantForward);
        } else {
            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.ChannelCantSendMessage);
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
        Collections.sort(arrayList, new cu(2));
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
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
                boolean z4 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                z8Var.r(currentUser);
                eg.y yVar = new eg.y(this, getParentActivity(), z4);
                linearLayout.addView(yVar, k7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z4) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                p9Var.getImageReceiver().setCurrentAccount(intValue);
                p9Var.e(currentUser, z8Var);
                yVar.addView(p9Var, k7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, k7.b6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new dg.m2(this, intValue, H, 15));
                H.r(linearLayout, k7.b6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        if (!z4 && z10) {
            this.W3 = true;
            B4(true);
        } else {
            this.X3 = null;
            this.W3 = false;
            B4(false);
            F4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        boolean presentFragment = super.presentFragment(p2Var);
        if (presentFragment && this.b0 != null) {
            int i10 = 0;
            while (true) {
                ny[] nyVarArr = this.b0;
                if (i10 >= nyVarArr.length) {
                    break;
                }
                nyVarArr[i10].d.getClass();
                i10++;
            }
        }
        ph.f3 f3Var = this.m0;
        if (f3Var != null) {
            f3Var.e(true);
        }
        ph.f3 f3Var2 = this.n0;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
        org.telegram.ui.Components.ic.e();
        return presentFragment;
    }

    public final void q3(boolean z4) {
        th.i iVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.js jsVar = this.G1;
        if (jsVar == null || (iVar = this.N1) == null || (chatFull = this.W2) == null) {
            return;
        }
        jsVar.i(iVar, (this.U2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z4);
        this.N1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.W2.requests_pending, new Object[0]));
    }

    public final void q4(int i10, long j10, TLRPC.Chat chat, boolean z4, boolean z10) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z10);
            return;
        }
        if (chat == null) {
            getMessagesController().deleteDialog(j10, 0, z10);
            if (z4 && z10) {
                getMessagesController().blockPeer(j10);
            }
        } else if (ChatObject.isNotInChat(chat)) {
            getMessagesController().deleteDialog(j10, 0, z10);
        } else {
            getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z10, false);
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.S2);
    }

    public final void r3(ny nyVar) {
        final boolean z4;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        int i10;
        int L0 = nyVar.c.L0();
        int N0 = nyVar.c.N0();
        if (this.d3 || this.i3) {
            return;
        }
        nw nwVar = this.w0;
        if (nwVar != null && nwVar.getVisibility() == 0 && this.w0.L) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            f2.l1 K = nyVar.a.K(N0);
            boolean z13 = K != null && K.f == 11;
            this.Y1 = z13;
            if (z13) {
                c4(false);
            }
        } else {
            this.Y1 = false;
        }
        int i11 = nyVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = nyVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(nyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, nyVar.s, 1, this.P1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z14 = !isDialogsEndReached;
                if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                    z4 = z14;
                    z10 = false;
                } else {
                    z4 = z14;
                    z10 = true;
                }
                if ((abs > 0 || N0 < R3(this.currentAccount, nyVar.s, this.S2, this.P1).size() - 10) && (abs != 0 || (!((i10 = nyVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.S2)))) {
                    z11 = false;
                    z12 = false;
                } else {
                    boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.S2);
                    boolean z15 = !isDialogsEndReached2;
                    if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.S2)) {
                        z12 = z15;
                        z11 = false;
                    } else {
                        z12 = z15;
                        z11 = true;
                    }
                }
                if (!z11 || z10) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fw
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy oyVar = oy.this;
                            if (z11) {
                                oyVar.getMessagesController().loadDialogs(oyVar.S2, -1, 100, z12);
                            }
                            if (z10) {
                                oyVar.getMessagesController().loadDialogs(1, -1, 100, z4);
                            } else {
                                oyVar.getClass();
                            }
                        }
                    });
                }
                return;
            }
        }
        z10 = false;
        z4 = false;
        if (abs > 0) {
        }
        z11 = false;
        z12 = false;
        if (z11) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fw
            @Override // java.lang.Runnable
            public final void run() {
                oy oyVar = oy.this;
                if (z11) {
                    oyVar.getMessagesController().loadDialogs(oyVar.S2, -1, 100, z12);
                }
                if (z10) {
                    oyVar.getMessagesController().loadDialogs(1, -1, 100, z4);
                } else {
                    oyVar.getClass();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    public final void r4(ArrayList arrayList, int i10, boolean z4, boolean z10, HashSet hashSet) {
        boolean z11;
        int i11;
        int i12;
        HashSet hashSet2;
        ArrayList arrayList2;
        ArrayList<TLRPC.Dialog> arrayList3;
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
        oy oyVar;
        int i17;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.g3 g3Var;
        TLRPC.User tL_userEmpty;
        float f10;
        boolean z14;
        TLRPC.User user2;
        TLRPC.User user3;
        CharSequence string;
        oy oyVar2 = this;
        int i18 = i10;
        if (oyVar2.getParentActivity() == null) {
            return;
        }
        ?? r72 = 0;
        int i19 = oyVar2.b0[0].s;
        boolean z15 = (i19 == 7 || i19 == 8) && (!oyVar2.actionBar.s() || oyVar2.actionBar.t(null));
        MessagesController.DialogFilter dialogFilter3 = z15 ? oyVar2.getMessagesController().selectedDialogFilter[oyVar2.b0[0].s == 8 ? (char) 1 : (char) 0] : null;
        int size = arrayList.size();
        if (i18 == 105 || i18 == 107) {
            ArrayList<Long> arrayList4 = new ArrayList<>(arrayList);
            oyVar2.getMessagesController().addDialogToFolder(arrayList4, oyVar2.P2 == 0 ? 1 : 0, -1, null, 0L);
            if (oyVar2.P2 == 0) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                z11 = false;
                boolean z16 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                if (z16) {
                    i11 = 1;
                } else {
                    i11 = 1;
                    globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                }
                int i20 = z16 ? arrayList4.size() > i11 ? 4 : 2 : arrayList4.size() > i11 ? 5 : 3;
                UndoView Y3 = oyVar2.Y3();
                if (Y3 != null) {
                    Y3.l(0L, i20, null, new org.telegram.ui.Components.k41(19, oyVar2, arrayList4));
                }
            } else {
                z11 = false;
                ArrayList<TLRPC.Dialog> dialogs = oyVar2.getMessagesController().getDialogs(oyVar2.S2);
                if (oyVar2.b0 != null && dialogs.isEmpty() && !oyVar2.H) {
                    oyVar2.b0[0].a.setEmptyView(null);
                    oyVar2.b0[0].w.setVisibility(4);
                    oyVar2.finishFragment();
                }
            }
            oyVar2.b4(z11);
            return;
        }
        if ((i18 == 100 || i18 == 108) && oyVar2.K2 != 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = oyVar2.getMessagesController().getDialogs(oyVar2.S2);
            int size2 = dialogs2.size();
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i21 < size2) {
                TLRPC.Dialog dialog = dialogs2.get(i21);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!oyVar2.g4(dialog)) {
                        arrayList3 = dialogs2;
                        if (!oyVar2.getMessagesController().isPromoDialog(dialog.id, false)) {
                            break;
                        }
                    } else {
                        arrayList3 = dialogs2;
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            i23++;
                        } else {
                            i22++;
                        }
                    }
                } else {
                    arrayList3 = dialogs2;
                }
                i21++;
                dialogs2 = arrayList3;
            }
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            for (int i27 = 0; i27 < size; i27++) {
                Long l10 = (Long) arrayList.get(i27);
                long longValue = l10.longValue();
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) oyVar2.getMessagesController().dialogs_dict.f(longValue);
                if (dialog2 != null && !oyVar2.g4(dialog2)) {
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        i25++;
                    } else {
                        i24++;
                    }
                    if (dialogFilter3 != null && dialogFilter3.alwaysShow.contains(l10)) {
                        i26++;
                    }
                }
            }
            if (z15) {
                i12 = 100 - dialogFilter3.alwaysShow.size();
            } else if (oyVar2.S2 == 0 && dialogFilter3 == null) {
                i12 = oyVar2.getUserConfig().isPremium() ? oyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : oyVar2.getMessagesController().dialogFiltersPinnedLimitDefault;
            } else {
                i12 = UserConfig.getInstance(oyVar2.currentAccount).isPremium() ? oyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium : oyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
            }
            if (i25 + i23 > i12 || (i24 + i22) - i26 > i12) {
                if (oyVar2.S2 == 0 && dialogFilter3 == null) {
                    showDialog(new eg.v0(0, oyVar2.currentAccount, oyVar2.getParentActivity(), this, null));
                    return;
                } else {
                    org.telegram.ui.Components.z4.u0(oyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", i12, new Object[0])), null);
                    return;
                }
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
        } else if (i18 != 111) {
            hashSet2 = hashSet;
            arrayList2 = arrayList;
            if ((i18 == 102 || i18 == 103) && size > 1 && z4) {
                HashSet hashSet3 = new HashSet();
                boolean z17 = MessagesController.getInstance(oyVar2.currentAccount).canRevokePmInbox;
                long j11 = MessagesController.getInstance(oyVar2.currentAccount).revokeTimePmLimit;
                if (i18 == 102 && z17 && j11 == 2147483647L) {
                    int size3 = arrayList2.size();
                    z14 = false;
                    int i28 = 0;
                    while (i28 < size3) {
                        Object obj = arrayList2.get(i28);
                        i28++;
                        Long l11 = (Long) obj;
                        if (DialogObject.isUserDialog(l11.longValue()) || DialogObject.isEncryptedDialog(l11.longValue())) {
                            if (DialogObject.isEncryptedDialog(l11.longValue())) {
                                TLRPC.EncryptedChat encryptedChat2 = oyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                user2 = encryptedChat2 != null ? oyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                            } else {
                                user2 = oyVar2.getMessagesController().getUser(l11);
                            }
                            if (user2 != null) {
                                ArrayList arrayList5 = (ArrayList) MessagesController.getInstance(oyVar2.currentAccount).dialogMessage.f(user2.id);
                                boolean z18 = (arrayList5 == null || arrayList5.size() != 1 || arrayList5.get(0) == null || ((MessageObject) arrayList5.get(0)).messageOwner == null || (!(((MessageObject) arrayList5.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList5.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (!user2.bot && !UserObject.isDeleted(user2) && user2.id != oyVar2.getUserConfig().getClientUserId() && !z18) {
                                    hashSet3.add(l11);
                                    z14 = true;
                                }
                            }
                        }
                    }
                    f10 = 8.0f;
                } else {
                    f10 = 8.0f;
                    z14 = false;
                }
                boolean z19 = i18 == 102;
                int i29 = oyVar2.N2;
                gg.a0 a0Var = new gg.a0(oyVar2, arrayList2, i18, hashSet3);
                org.telegram.ui.ActionBar.f6 f6Var = oyVar2.resourceProvider;
                Pattern pattern = org.telegram.ui.Components.z4.a;
                int currentAccount = oyVar2.getCurrentAccount();
                Activity parentActivity = oyVar2.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, f6Var);
                UserConfig.getInstance(currentAccount).getClientUserId();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                boolean[] zArr = new boolean[1];
                TextView textView = new TextView(parentActivity);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                org.telegram.ui.Components.g3 g3Var2 = new org.telegram.ui.Components.g3(parentActivity, z1VarArr);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.D = 6;
                alertDialog$Builder.n(g3Var2);
                TextView textView2 = new TextView(parentActivity);
                boolean z20 = z19;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setLines(1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                if (z20) {
                    if (z14) {
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, f6Var);
                        z1VarArr[0] = z1Var;
                        z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                        z1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                        z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f10), 0, LocaleController.isRTL ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(16.0f), 0);
                        g3Var2.addView(z1VarArr[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        z1VarArr[0].setOnClickListener(new org.telegram.ui.Components.t0(2, zArr));
                    }
                    textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", size, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
                } else if (i29 != 0) {
                    textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", size, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
                } else {
                    textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", size, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
                }
                g3Var2.addView(textView2, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                g3Var2.addView(textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                alertDialog$Builder.k(z20 ? LocaleController.getString("Delete", R.string.Delete) : i29 != 0 ? LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache) : LocaleController.getString("ClearHistory", R.string.ClearHistory), new org.telegram.ui.Components.o1(4, a0Var, zArr));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                oyVar2.showDialog(d2Var);
                TextView textView3 = (TextView) d2Var.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i18 == 106 && z4) {
                if (size == 1) {
                    Long l12 = (Long) arrayList2.get(0);
                    l12.getClass();
                    user3 = oyVar2.getMessagesController().getUser(l12);
                } else {
                    user3 = null;
                }
                boolean z21 = oyVar2.O2 != 0;
                qs qsVar = new qs(6, oyVar2, arrayList2);
                Pattern pattern2 = org.telegram.ui.Components.z4.a;
                if (oyVar2.getParentActivity() != null) {
                    if (size == 1 && user3 == null) {
                        return;
                    }
                    Activity parentActivity2 = oyVar2.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                    org.telegram.ui.Cells.z1[] z1VarArr2 = new org.telegram.ui.Cells.z1[2];
                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                    if (size == 1) {
                        String formatName = ContactsController.formatName(user3.first_name, user3.last_name);
                        d2Var2.O = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, formatName);
                        string = LocaleController.getString(R.string.BlockUser);
                        d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, formatName));
                    } else {
                        d2Var2.O = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", size, new Object[0]));
                        string = LocaleController.getString(R.string.BlockUsers);
                        d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", size, new Object[0])));
                    }
                    int i30 = 2;
                    boolean[] zArr2 = {true, true};
                    int i31 = 0;
                    while (i31 < i30) {
                        if (i31 != 0 || z21) {
                            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(parentActivity2, 1);
                            z1VarArr2[i31] = z1Var2;
                            z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(r72));
                            if (i31 == 0) {
                                z1VarArr2[i31].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                            } else {
                                z1VarArr2[i31].e(LocaleController.getString(size == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                            }
                            z1VarArr2[i31].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r72, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r72);
                            linearLayout.addView(z1VarArr2[i31], k7.b6.n(-1, 48));
                            z1VarArr2[i31].setOnClickListener(new lh.y0(zArr2, i31, 4));
                        }
                        i31++;
                        i30 = 2;
                        r72 = 0;
                    }
                    alertDialog$Builder2.k(string, new org.telegram.ui.Components.o1(8, qsVar, zArr2));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    oyVar2.showDialog(d2Var2);
                    TextView textView4 = (TextView) d2Var2.d(-1);
                    if (textView4 != null) {
                        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            if (z4) {
                org.telegram.ui.Components.z4.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new aw(oyVar2, arrayList, i18, z10, hashSet));
                return;
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
            int size4 = arrayList2.size();
            int i32 = 0;
            while (i32 < size4) {
                Object obj2 = arrayList2.get(i32);
                i32++;
                oyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
            }
        }
        int i33 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (dialogFilter3 != null && ((i18 == 100 || i18 == 108) && oyVar2.K2 != 0)) {
            int size5 = dialogFilter3.pinnedDialogs.size();
            for (int i34 = 0; i34 < size5; i34++) {
                i33 = Math.min(i33, dialogFilter3.pinnedDialogs.valueAt(i34));
            }
            i33 -= oyVar2.K2;
        }
        int i35 = i33;
        int i36 = 0;
        int i37 = 0;
        while (i36 < size) {
            Long l13 = (Long) arrayList2.get(i36);
            long longValue2 = l13.longValue();
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) oyVar2.getMessagesController().dialogs_dict.f(longValue2);
            if (dialog3 == null) {
                i15 = i18;
                i16 = i35;
                i14 = i36;
                dialogFilter2 = dialogFilter3;
            } else {
                if (DialogObject.isEncryptedDialog(longValue2)) {
                    encryptedChat = org.telegram.messenger.y3.n(oyVar2.getMessagesController(), longValue2);
                    if (encryptedChat != null) {
                        i14 = i36;
                        dialogFilter = dialogFilter3;
                        tL_userEmpty = oyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                    } else {
                        i14 = i36;
                        dialogFilter = dialogFilter3;
                        tL_userEmpty = new TLRPC.TL_userEmpty();
                    }
                    user = tL_userEmpty;
                    chat = null;
                } else {
                    i14 = i36;
                    dialogFilter = dialogFilter3;
                    if (DialogObject.isUserDialog(longValue2)) {
                        user = oyVar2.getMessagesController().getUser(l13);
                        chat = null;
                    } else {
                        chat = oyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                        user = null;
                    }
                    encryptedChat = null;
                }
                if (chat == null && user == null) {
                    i15 = i18;
                    i16 = i35;
                    dialogFilter2 = dialogFilter;
                } else {
                    boolean z22 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                    if (i18 != 100 && i18 != 108) {
                        if (i18 == 101) {
                            if (oyVar2.J2 != 0) {
                                oyVar2.j4(longValue2);
                            } else {
                                oyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                            }
                            i15 = i18;
                            i16 = i35;
                            dialogFilter2 = dialogFilter;
                            i36 = i14 + 1;
                            dialogFilter3 = dialogFilter2;
                            i35 = i16;
                            i18 = i15;
                        } else {
                            if (i18 == 102) {
                                oyVar = oyVar2;
                                i17 = 1;
                            } else if (i18 == 103) {
                                oyVar = oyVar2;
                                i17 = 1;
                            } else if (i18 != 104) {
                                i15 = i18;
                                i16 = i35;
                                dialogFilter2 = dialogFilter;
                                i36 = i14 + 1;
                                dialogFilter3 = dialogFilter2;
                                i35 = i16;
                                i18 = i15;
                            } else {
                                if (size == 1 && oyVar2.L2 == 1) {
                                    oy oyVar3 = oyVar2;
                                    oyVar3.showDialog(org.telegram.ui.Components.z4.F(longValue2, 0L, oyVar3, null), new nv(oyVar3, 2));
                                    return;
                                }
                                oy oyVar4 = oyVar2;
                                if (oyVar4.M2 != 0) {
                                    if (oyVar4.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                        oyVar4.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                    }
                                    i16 = i35;
                                    oyVar2 = oyVar4;
                                    dialogFilter2 = dialogFilter;
                                } else {
                                    if (z10) {
                                        Pattern pattern3 = org.telegram.ui.Components.z4.a;
                                        if (oyVar4.getParentActivity() == null) {
                                            g3Var = null;
                                        } else {
                                            org.telegram.ui.ActionBar.g3 g3Var3 = new org.telegram.ui.ActionBar.g3(oyVar4.getParentActivity(), null, false, false);
                                            g3Var3.fixNavigationBar();
                                            g3Var3.title = LocaleController.getString(R.string.Notifications);
                                            g3Var3.bigTitle = true;
                                            String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                            String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                            String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                            String string2 = LocaleController.getString(R.string.MuteDisable);
                                            CharSequence[] charSequenceArr = new CharSequence[4];
                                            charSequenceArr[0] = formatString;
                                            charSequenceArr[1] = formatString2;
                                            charSequenceArr[2] = formatString3;
                                            charSequenceArr[r16] = string2;
                                            cg.u1 u1Var = new cg.u1(arrayList2, oyVar4);
                                            g3Var3.items = charSequenceArr;
                                            g3Var3.onClickListener = u1Var;
                                            g3Var = g3Var3;
                                        }
                                        oyVar4.showDialog(g3Var, new nv(oyVar4, 3));
                                        return;
                                    }
                                    if (!oyVar4.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                        oyVar4.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                    }
                                    i16 = i35;
                                    oyVar2 = oyVar4;
                                    dialogFilter2 = dialogFilter;
                                    r16 = 3;
                                }
                                i15 = i18;
                                i36 = i14 + 1;
                                dialogFilter3 = dialogFilter2;
                                i35 = i16;
                                i18 = i15;
                            }
                            if (size == i17) {
                                if (i18 != 102 || !oyVar.R2) {
                                    org.telegram.ui.Components.z4.s(this, i18 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.id), i18 == 102, false, false, new lw(oyVar, i18, chat, longValue2, z22));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(oyVar.getParentActivity());
                                String string3 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                                d2Var3.O = string3;
                                d2Var3.Q = LocaleController.getString(R.string.PsaHideChatAlertText);
                                alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new sv(oyVar, 11));
                                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                                oyVar.showDialog(d2Var3);
                                return;
                            }
                            boolean z23 = z22;
                            TLRPC.Chat chat2 = chat;
                            if (oyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                                oyVar.getMessagesController().hidePromoDialog();
                                i16 = i35;
                                oyVar2 = oyVar;
                                dialogFilter2 = dialogFilter;
                            } else if (i18 != 103 || oyVar.N2 == 0) {
                                if (hashSet2 == null || !hashSet2.contains(l13)) {
                                    z12 = z23;
                                    z13 = false;
                                } else {
                                    z12 = z23;
                                    z13 = true;
                                }
                                oyVar2 = oyVar;
                                oyVar2.q4(i18, longValue2, chat2, z12, z13);
                                i15 = i18;
                                i16 = i35;
                                dialogFilter2 = dialogFilter;
                                i36 = i14 + 1;
                                dialogFilter3 = dialogFilter2;
                                i35 = i16;
                                i18 = i15;
                            } else {
                                oyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                                i16 = i35;
                                oyVar2 = oyVar;
                                dialogFilter2 = dialogFilter;
                            }
                            i15 = i18;
                            i36 = i14 + 1;
                            dialogFilter3 = dialogFilter2;
                            i35 = i16;
                            i18 = i15;
                        }
                    }
                    i15 = i18;
                    if (oyVar2.K2 != 0) {
                        if (!oyVar2.g4(dialog3)) {
                            i37++;
                            i16 = i35;
                            dialogFilter2 = dialogFilter;
                            oyVar2.s4(longValue2, true, dialogFilter2, i16, size == 1);
                            if (dialogFilter2 != null) {
                                int i38 = i16 + 1;
                                if (encryptedChat != null) {
                                    if (!dialogFilter2.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                        dialogFilter2.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                    }
                                } else if (!dialogFilter2.alwaysShow.contains(Long.valueOf(dialog3.id))) {
                                    dialogFilter2.alwaysShow.add(Long.valueOf(dialog3.id));
                                }
                                i16 = i38;
                            }
                        }
                        i16 = i35;
                        dialogFilter2 = dialogFilter;
                    } else {
                        i16 = i35;
                        dialogFilter2 = dialogFilter;
                        if (oyVar2.g4(dialog3)) {
                            i37++;
                            oyVar2.s4(longValue2, false, dialogFilter2, i16, size == 1);
                            i36 = i14 + 1;
                            dialogFilter3 = dialogFilter2;
                            i35 = i16;
                            i18 = i15;
                        }
                    }
                    i36 = i14 + 1;
                    dialogFilter3 = dialogFilter2;
                    i35 = i16;
                    i18 = i15;
                }
            }
            i36 = i14 + 1;
            dialogFilter3 = dialogFilter2;
            i35 = i16;
            i18 = i15;
        }
        int i39 = i18;
        MessagesController.DialogFilter dialogFilter4 = dialogFilter3;
        int i40 = 108;
        if (i39 == 104 && (size != 1 || oyVar2.L2 != 1)) {
            org.telegram.ui.Components.qc.A(oyVar2, oyVar2.M2 == 0, null).j();
        }
        if (i39 == 100 || i39 == 108) {
            if (dialogFilter4 != null) {
                oy oyVar5 = oyVar2;
                b10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, oyVar5, null);
                oyVar2 = oyVar5;
                j10 = 0;
            } else {
                j10 = 0;
                oyVar2.getMessagesController().reorderPinnedDialogs(oyVar2.S2, null, 0L);
            }
            UndoView Y32 = oyVar2.Y3();
            if (oyVar2.m3 && Y32 != null) {
                Y32.m(j10, Integer.valueOf(i37), oyVar2.K2 != 0 ? 78 : 79);
            }
            i13 = i10;
            i40 = 108;
        } else {
            i13 = i39;
        }
        oyVar2.b4((i13 == i40 || i13 == 100 || i13 == 102) ? false : true);
    }

    @Override // org.telegram.ui.ug0
    public final void s() {
        x4(true, true);
    }

    public final void s3() {
        if (this.b0 == null) {
            return;
        }
        int n32 = n3();
        int i10 = 0;
        while (true) {
            ny[] nyVarArr = this.b0;
            if (i10 >= nyVarArr.length) {
                return;
            }
            ny nyVar = nyVarArr[i10];
            if (nyVar != null) {
                ky kyVar = nyVar.a;
                kyVar.setPadding(0, kyVar.V2, 0, n32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s4(long j10, boolean z4, MessagesController.DialogFilter dialogFilter, int i10, boolean z10) {
        int i11;
        boolean z11;
        boolean pinDialog;
        boolean z12;
        int i12 = (this.b0[0].s == 0 && Z3() && this.b0[0].v == 2) ? 1 : 0;
        int L0 = this.b0[0].c.L0();
        if (dialogFilter != null) {
            int i13 = dialogFilter.pinnedDialogs.get(j10, TLObject.FLAG_31);
            if (!z4 && i13 == Integer.MIN_VALUE) {
                return;
            }
        }
        this.v3 = z4 ? 4 : 5;
        int i14 = -1;
        if (L0 > i12 || !z10) {
            i11 = -1;
            z11 = true;
        } else {
            A4(true, true);
            o3();
            if (this.O1 != null) {
                for (int i15 = 0; i15 < this.O1.size(); i15++) {
                    if (((TLRPC.Dialog) this.O1.get(i15)).id == j10) {
                        i11 = i15;
                        break;
                    }
                }
            }
            i11 = -1;
            z11 = false;
        }
        if (dialogFilter != null) {
            if (z4) {
                dialogFilter.pinnedDialogs.put(j10, i10);
            } else {
                dialogFilter.pinnedDialogs.delete(j10);
            }
            if (z10) {
                getMessagesController().onFilterUpdate(dialogFilter);
            }
            pinDialog = true;
        } else {
            pinDialog = getMessagesController().pinDialog(j10, z4, null, -1L);
        }
        if (pinDialog) {
            if (z11) {
                if (this.O0 != 10) {
                    c4(false);
                }
                x4(true, false);
            } else {
                ArrayList R3 = R3(this.currentAccount, this.b0[0].s, this.S2, false);
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
        if (z11) {
            return;
        }
        if (i11 >= 0) {
            ArrayList arrayList = this.O1;
            if (arrayList != null && i14 >= 0 && i11 != i14) {
                arrayList.add(i14, (TLRPC.Dialog) arrayList.remove(i11));
                this.b0[0].x.D();
                this.b0[0].q(true);
                ny nyVar = this.b0[0];
                nyVar.c.h1((nyVar.s == 0 && Z3() && this.b0[0].v == 2) ? 1 : 0, (int) this.K);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new mv(this, 23), 200L);
            }
            z12 = true;
            if (z12) {
                A4(false, true);
                return;
            }
            return;
        }
        z12 = false;
        if (z12) {
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setInPreviewMode(boolean z4) {
        super.setInPreviewMode(z4);
        gx gxVar = this.B0;
        if (gxVar != null) {
            if (!this.D0 || z4) {
                gxVar.setVisibility(8);
            } else {
                gxVar.setVisibility(0);
            }
        }
        Y4(true);
        U4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        lx lxVar;
        org.telegram.ui.Components.j5 j5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (lxVar = this.J0) != null && (lxVar.getContentView() instanceof q61)) {
            org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
            q61 q61Var = (q61) this.J0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                j5Var = this.A3;
            }
            j5Var = null;
            q61Var.y(j5Var, titleTextView);
        }
        gx gxVar = this.B0;
        if (gxVar != null) {
            org.telegram.ui.Components.k6 k6Var = gxVar.Q;
            gxVar.R.b(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                gxVar.d0 = true;
                if (gxVar.e0 != i10) {
                    gxVar.e0 = i10;
                    k6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                gxVar.d0 = false;
                gxVar.e0 = 0;
                k6Var.c(gxVar.c0, !LocaleController.isRTL, true);
            }
            gxVar.a.a(gxVar.d0, true);
            gxVar.I0.t(k6Var);
        }
    }

    public final void t3() {
        ug.f fVar = this.v1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.v1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.H0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.H0.setBackground(new BitmapDrawable(createBitmap));
        this.H0.setAlpha(0.0f);
        this.H0.setVisibility(0);
        B3();
    }

    public final void u3() {
        ny nyVar;
        float S3 = S3(true);
        nw nwVar = this.w0;
        if (nwVar != null) {
            boolean z4 = nwVar.getAlpha() != S3;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.w0.setAlpha(S3);
            this.w0.setScaleX(lerp);
            this.w0.setScaleY(lerp);
            this.w0.setVisibility(S3 > 0.0f ? 0 : 8);
            if (z4 && (nyVar = this.b0[0]) != null) {
                nyVar.a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(ny nyVar) {
        int i10;
        if (nyVar.getVisibility() != 0) {
            return;
        }
        int i11 = nyVar.d.v;
        if (nyVar.s == 0 && Z3() && nyVar.a.getChildCount() == 0 && nyVar.v == 2) {
            ((f2.i0) nyVar.a.getLayoutManager()).h1(1, (int) this.K);
        }
        nyVar.d.getClass();
        nyVar.d.U();
        int h = nyVar.d.h();
        if (h == 1 && i11 == 1 && nyVar.d.j(0) == 5) {
            nyVar.q(true);
        } else {
            nyVar.q(false);
            if (h > i11 && (i10 = this.O0) != 11 && i10 != 12 && i10 != 13) {
                nyVar.y.b(i11);
            }
        }
        try {
            nyVar.a.setEmptyView((this.S2 == 0 && this.U2 == 0) ? nyVar.w : null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        r3(nyVar);
    }

    public final void v3() {
        float f10 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f10);
        org.telegram.ui.Components.qp0 qp0Var = this.z1;
        if (qp0Var != null) {
            qp0Var.setScaleX(lerp);
            this.z1.setScaleY(lerp);
            this.z1.setAlpha(f10);
            this.z1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        ug.f fVar = this.v1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            this.v1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.v1.getFadeView().setAlpha(f10);
            this.v1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void v4() {
        boolean z4;
        if (this.K == 0.0f || (z4 = this.H)) {
            return;
        }
        float f10 = z4 ? -U3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.D3, f10));
        animatorSet.setInterpolator(org.telegram.ui.Components.nr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        float f10 = 1.0f - this.b.e;
        float V3 = 1.0f - V3();
        org.telegram.ui.Components.z10.d(this.actionBar.getBackButton(), Math.max(this.q3, f10 * V3 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w4(int i10) {
        org.telegram.ui.Components.g00 g00Var;
        if (this.w0 == null) {
            V4(true, true);
            if (this.w0 == null) {
                return;
            }
        }
        int tabsCount = this.w0.getTabsCount() - 1;
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
        nw nwVar = this.w0;
        if (tabsCount < 0) {
            nwVar.getClass();
        } else if (tabsCount < nwVar.getTabsCount()) {
            g00Var = (org.telegram.ui.Components.g00) nwVar.h.get(tabsCount);
            if (g00Var != null) {
                nw nwVar2 = this.w0;
                ArrayList arrayList = nwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                nwVar2.f((org.telegram.ui.Components.g00) kh.a2.i(1, arrayList), arrayList.size() - 1);
                return;
            }
            ny[] nyVarArr = this.b0;
            if (nyVarArr == null || nyVarArr.length <= 0 || nyVarArr[0].h != g00Var.a) {
                this.w0.f(g00Var, tabsCount);
                return;
            }
            return;
        }
        g00Var = null;
        if (g00Var != null) {
        }
    }

    public final void x3() {
        org.telegram.ui.Components.z10.d(this.d0, e2.c.z(this.f0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void x4(boolean z4, boolean z10) {
        jx jxVar = this.C3;
        if (jxVar == null || !jxVar.c()) {
            int i10 = (this.b0[0].s == 0 && Z3() && this.b0[0].v == 2) ? 1 : 0;
            int i11 = (!this.H || z10 || this.B0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z4) {
                this.b0[0].c.h1(i10, i11);
                v4();
            } else {
                c2.y yVar = this.b0[0].r;
                yVar.b = 1;
                yVar.c(i10, i11, false, false);
                v4();
            }
        }
    }

    @Override // org.telegram.ui.ug0
    public final sg.d y() {
        return this.k4;
    }

    public final void y3() {
        org.telegram.ui.Components.z10.d(this.c0, e2.c.z(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void y4(String str, boolean z4) {
        O4(true, false, true, false);
        ey eyVar = this.U;
        if (eyVar != null) {
            eyVar.r.setText(str);
            this.U.r.setSelection(str.length());
        }
    }

    @Override // xd.b
    public final void z(float f10, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 != 3 || (w0Var = this.i0) == null) {
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
        org.telegram.ui.Components.z10.d(this.g0, e2.c.z(this.O0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - V3(), 1.0f - this.c.e));
        gx gxVar = this.B0;
        if (gxVar != null) {
            gxVar.invalidate();
        }
    }

    public final void z4(float f10) {
        this.Z = f10;
        for (ny nyVar : this.b0) {
            ky kyVar = nyVar.a;
            for (int i10 = 0; i10 < kyVar.getChildCount(); i10++) {
                View childAt = kyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= nyVar.d.f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }
}
