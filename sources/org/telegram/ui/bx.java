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
import android.graphics.drawable.GradientDrawable;
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
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class bx extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, pg.b, te.b, ke0 {
    public static boolean C4;
    public static final boolean[] D4 = new boolean[4];
    public static final org.telegram.ui.Components.cq0 E4 = new org.telegram.ui.Components.cq0(3);
    public static float F4;
    public qw A0;
    public jh.f A1;
    public boolean A2;
    public float A3;
    public int A4;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int B4;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public jw D0;
    public mv D1;
    public boolean D2;
    public Long D3;
    public boolean E;
    public org.telegram.ui.Components.at0 E0;
    public oi.w1 E1;
    public vw E2;
    public Drawable E3;
    public boolean F;
    public sv F0;
    public org.telegram.ui.ActionBar.q0 F1;
    public ArrayList F2;
    public org.telegram.ui.Components.m5 F3;
    public boolean G;
    public org.telegram.ui.Components.zr G0;
    public final TextPaint G1;
    public String G2;
    public org.telegram.ui.Cells.o G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public kv H1;
    public CharSequence H2;
    public wv H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public org.telegram.ui.Components.dp0 I2;
    public final lv I3;
    public ValueAnimator J;
    public float J0;
    public kv J1;
    public org.telegram.ui.Components.voip.o J2;
    public final lv J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public f K3;
    public boolean L;
    public tv L0;
    public org.telegram.ui.Components.bs L1;
    public boolean L2;
    public xi.e L3;
    public boolean M;
    public org.telegram.ui.Components.x60 M0;
    public org.telegram.ui.Components.as M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public yv N0;
    public org.telegram.ui.Cells.m N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public org.telegram.ui.Cells.c3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public org.telegram.ui.Cells.pa P1;
    public int P2;
    public boolean P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public final fu R3;
    public boolean S;
    public long S0;
    public mi.j S1;
    public int S2;
    public int S3;
    public org.telegram.ui.Components.fc T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public AnimatorSet T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public int V0;
    public org.telegram.ui.ActionBar.t1 V1;
    public int V2;
    public qt V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public String W3;
    public boolean X;
    public org.telegram.ui.Components.xb0 X0;
    public boolean X1;
    public boolean X2;
    public ArrayList X3;
    public pw Y;
    public org.telegram.ui.Cells.u2 Y0;
    public long Y1;
    public int Y2;
    public boolean Y3;
    public bg.p0 Z;
    public org.telegram.ui.Cells.u2 Z0;
    public TLObject Z1;
    public bx Z2;
    public CharSequence Z3;
    public final int a;
    public dz0 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final te.a b;
    public org.telegram.ui.Components.j71 b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public float b4;
    public final te.a c;
    public jg.q0 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public boolean c4;
    public final te.a d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public org.telegram.ui.Components.p9 d3;
    public boolean d4;
    public final te.a e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public org.telegram.ui.Components.a9 e3;
    public ValueAnimator e4;
    public final te.a f;
    public ax[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public org.telegram.ui.Components.u30 f4;
    public org.telegram.ui.ActionBar.q0 g0;
    public org.telegram.ui.ActionBar.x1 g1;
    public boolean g2;
    public boolean g3;
    public TLRPC.FileLocation g4;
    public final te.a h;
    public org.telegram.ui.ActionBar.q0 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public TLRPC.FileLocation h4;
    public dx i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public org.telegram.ui.Components.fc i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public int j4;
    public org.telegram.ui.ActionBar.q0 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public int k4;
    public org.telegram.ui.ActionBar.q0 l0;
    public org.telegram.ui.ActionBar.q0 l1;
    public boolean l2;
    public float l3;
    public int l4;
    public org.telegram.ui.ActionBar.q0 m0;
    public org.telegram.ui.ActionBar.q0 m1;
    public boolean m2;
    public boolean m3;
    public int m4;
    public final te.a n;
    public org.telegram.ui.ActionBar.q0 n0;
    public org.telegram.ui.ActionBar.q0 n1;
    public boolean n2;
    public int n3;
    public int n4;
    public org.telegram.ui.Components.wg0 o0;
    public org.telegram.ui.ActionBar.q0 o1;
    public boolean o2;
    public boolean o3;
    public final dh.g o4;
    public org.telegram.ui.ActionBar.y0 p0;
    public org.telegram.ui.ActionBar.y0 p1;
    public String p2;
    public boolean p3;
    public final ui.f p4;
    public hi.u3 q0;
    public org.telegram.ui.ActionBar.y0 q1;
    public String q2;
    public org.telegram.ui.Components.fc q3;
    public final ui.f q4;
    public final te.a r;
    public hi.u3 r0;
    public org.telegram.ui.ActionBar.y0 r1;
    public final org.telegram.messenger.sr r2;
    public final h2.f r3;
    public final ui.c r4;
    public final te.a s;
    public boolean s0;
    public org.telegram.ui.ActionBar.y0 s1;
    public boolean s2;
    public boolean s3;
    public final dh.c s4;
    public boolean t0;
    public org.telegram.ui.ActionBar.y0 t1;
    public boolean t2;
    public boolean t3;
    public final dh.c t4;
    public org.telegram.ui.Components.a10 u0;
    public org.telegram.ui.ActionBar.y0 u1;
    public boolean u2;
    public boolean u3;
    public final dh.c u4;
    public org.telegram.ui.Components.a10 v0;
    public org.telegram.ui.ActionBar.y0 v1;
    public boolean v2;
    public boolean v3;
    public final dh.c v4;
    public final rh.h w;
    public hi.e w0;
    public float w1;
    public boolean w2;
    public float w3;
    public vu w4;
    public boolean x;
    public lh.f x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public final ArrayList x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public final RectF y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;
    public final RectF z4;

    public bx(Bundle bundle) {
        super(bundle);
        int i7 = Build.VERSION.SDK_INT;
        this.a = i7 >= 31 ? 48 : 0;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.b = new te.a(1, this, krVar, 350L, false);
        this.c = new te.a(2, this, krVar, 350L, false);
        this.d = new te.a(3, this, krVar, 350L, false);
        this.e = new te.a(4, this, krVar, 350L, false);
        this.f = new te.a(5, this, krVar, 350L, false);
        this.h = new te.a(6, this, krVar, 350L, false);
        this.n = new te.a(7, this, krVar, 350L, false);
        this.r = new te.a(8, this, krVar, 350L, false);
        this.s = new te.a(9, this, krVar, 350L, false);
        this.w = new rh.h(new fu(this, 27));
        this.y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.d0 = 1.0f;
        this.z0 = new UndoView[2];
        this.c1 = new ArrayList();
        this.h1 = new Paint();
        this.k1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.e2 = true;
        this.k2 = true;
        this.r2 = new org.telegram.messenger.sr();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.r3 = new h2.f((int[]) null);
        this.I3 = new lv(this, 0);
        this.J3 = new lv(this, 1);
        this.N3 = -4;
        this.O3 = true;
        this.P3 = true;
        this.R3 = new fu(this, 28);
        this.S3 = -1;
        this.b4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.x4 = arrayList;
        RectF rectF = new RectF();
        this.y4 = rectF;
        RectF rectF2 = new RectF();
        this.z4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ui.c d = this.glassEngine.d(new iu(this, 12));
        this.r4 = d;
        if (i7 >= 31) {
            dh.g gVar = new dh.g(false);
            this.o4 = gVar;
            ui.f fVar = new ui.f(d);
            this.q4 = fVar;
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            ui.f fVar2 = new ui.f(null);
            this.p4 = fVar2;
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.u4 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.s4 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            this.t4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.o4 = null;
            this.p4 = null;
            this.q4 = null;
            this.s4 = new dh.c(d, d, d);
            this.u4 = new dh.c(d, d, d);
            this.t4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.v4 = cVar3;
        dh.c cVar4 = this.u4;
        ri.q qVar = this.glassEngine;
        cVar4.j = qVar;
        this.s4.j = qVar;
        this.t4.j = qVar;
        cVar3.j = qVar;
    }

    public static void A0(bx bxVar) {
        if (bxVar.P3) {
            hi.u3 u3Var = bxVar.q0;
            if (u3Var != null) {
                u3Var.f(true);
            }
            fi.j6 o4 = org.telegram.messenger.mp.u1(bxVar.currentAccount).R1().o();
            if (o4 != null && o4.a(bxVar.currentAccount, 1)) {
                bxVar.showDialog(new ug.k0(o4.b(), bxVar.currentAccount, bxVar.getParentActivity(), bxVar, null));
                return;
            } else {
                hi.nb D = hi.nb.D(bxVar.getParentActivity(), bxVar.currentAccount);
                D.y = new gv(bxVar);
                D.Q(null);
                return;
            }
        }
        hi.u3 u3Var2 = bxVar.r0;
        if (u3Var2 != null) {
            if (u3Var2.W) {
                return;
            } else {
                org.telegram.messenger.g0.E2(u3Var2);
            }
        }
        SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.O0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.n6.xj, 0, new yu(bxVar, 4), null);
        hi.u3 u3Var3 = new hi.u3(bxVar.getParentActivity(), 2);
        u3Var3.s(8.0f);
        u3Var3.d = 8000L;
        u3Var3.k(true);
        u3Var3.r(true);
        u3Var3.h = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(148.0f);
        u3Var3.v(R2);
        u3Var3.o(1.0f, -40.0f);
        u3Var3.j(bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        bxVar.r0 = u3Var3;
        u3Var3.setTranslationY((-bxVar.k4) - bxVar.m4);
        ((ViewGroup) bxVar.fragmentView).addView(bxVar.r0, c8.na.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        bxVar.r0.x();
    }

    public static void B0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "BIRTHDAY_SETUP");
        bxVar.o5();
        org.telegram.ui.Components.fc K = org.telegram.ui.Components.kc.b0(bxVar).K(R.raw.chats_infotip, org.telegram.messenger.gd.N0(2131753711, null), org.telegram.messenger.gd.N0(2131745299, null), new yu(bxVar, 9));
        K.j = 5000;
        K.j();
    }

    public static /* synthetic */ void C0(bx bxVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull d2 = bxVar.getMessagesController().d2(bxVar.getUserConfig().e());
        TL_account.TL_birthday tL_birthday2 = d2 != null ? d2.birthday : null;
        if (d2 != null) {
            d2.flags2 |= 32;
            d2.birthday = tL_birthday;
        }
        bxVar.getMessagesController().o2();
        bxVar.getConnectionsManager().sendRequest(updatebirthday, new z9(bxVar, d2, tL_birthday2, 8), 1024);
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "BIRTHDAY_SETUP");
        bxVar.o5();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D0(bx bxVar, int i7) {
        dh.g gVar = bxVar.o4;
        RectF rectF = bxVar.z4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.ed.a(i7, 4)) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int measuredHeight = (bxVar.fragmentView.getMeasuredHeight() - bxVar.k4) - org.telegram.messenger.g0.L(8.0f);
            int L2 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
            int L3 = org.telegram.messenger.g0.L(bxVar.L ? 81.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f) + bxVar.actionBar.getMeasuredHeight();
            qw qwVar = bxVar.A0;
            boolean z10 = false;
            int measuredHeight2 = L3 + ((qwVar == null || qwVar.getVisibility() != 0) ? 0 : bxVar.A0.getMeasuredHeight());
            org.telegram.ui.Components.bs bsVar = bxVar.L1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((bsVar == null || bsVar.getVisibility() != 0) ? 0 : bxVar.L1.getSumHeightOfAllVisibleChild()) + ((int) bxVar.O);
            int measuredHeight3 = bxVar.actionBar.getMeasuredHeight();
            bxVar.y4.set(0.0f, -L, bxVar.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.W1(bxVar.b.e, sumHeightOfAllVisibleChild, org.telegram.messenger.g0.L(30.0f) + measuredHeight3 + (bxVar.a0 != null ? r9.getMeasuredHeight() : 0)) + L);
            if (bxVar.X) {
                rectF.set(0.0f, L2, bxVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, org.telegram.messenger.pc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            } else {
                if (bxVar.D1 != null && bxVar.A1 != null) {
                    rectF.set(0.0f, bxVar.fragmentView.getMeasuredHeight() - bxVar.w3(), bxVar.fragmentView.getMeasuredWidth(), bxVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, org.telegram.messenger.pc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
                gVar.g(z10 ? 2 : 1, bxVar.x4);
            }
            z10 = true;
            gVar.g(z10 ? 2 : 1, bxVar.x4);
        }
        gVar.e(bxVar.w4, bxVar.fragmentView.getMeasuredWidth(), bxVar.fragmentView.getMeasuredHeight());
    }

    public static /* synthetic */ void E0(bx bxVar) {
        bxVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.j3(bxVar.parentLayout, "newChatsRow");
    }

    public static void F0(bx bxVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.b5.c0(bxVar.currentAccount, tL_error, bxVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            bxVar.getNotificationCenter().k(org.telegram.messenger.ks.v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        bxVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.e4 e4Var = new bi.e4(bxVar, j3, 26);
        Pattern pattern = org.telegram.ui.Components.b5.a;
        if (bxVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = bxVar.getCurrentAccount();
            Activity parentActivity = bxVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e11 = org.telegram.messenger.i10.i(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            a9Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(p9Var, c8.na.d(40, 40.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(org.telegram.messenger.gd.N0(2131749052, null));
            boolean z10 = org.telegram.messenger.gd.a0;
            frameLayout.addView(textView2, c8.na.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, c8.na.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                a9Var.q(chat);
                p9Var.f(chat, a9Var);
            } else if (org.telegram.messenger.n10.A(user)) {
                a9Var.p = 0.8f;
                a9Var.g(12);
                p9Var.j(null, null, a9Var, user);
            } else if (user.id == e11) {
                a9Var.p = 0.8f;
                a9Var.g(1);
                p9Var.j(null, null, a9Var, user);
            } else {
                a9Var.p = 1.0f;
                a9Var.r(user);
                p9Var.f(user, a9Var);
            }
            textView.setText(org.telegram.messenger.g0.W2(str));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131749072, null), new org.telegram.ui.Components.b0(e4Var, 3));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            bxVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void G0(bx bxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, bxVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(bxVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.b;
        if (tL_attachMenuBots != null) {
            long j3 = d02.a;
            d02.getMessagesStorage().a.c(new org.telegram.messenger.ek(d02.e, 2, j3, d02, tL_attachMenuBots));
        }
    }

    public static /* synthetic */ void H0(bx bxVar, float f10, ValueAnimator valueAnimator) {
        bxVar.f0[0].setTranslationY((1.0f - bxVar.w3) * f10);
        bxVar.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < bxVar.actionBar.getChildCount(); i7++) {
            if (bxVar.actionBar.getChildAt(i7).getVisibility() == 0 && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getActionMode() && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getBackButton()) {
                bxVar.actionBar.getChildAt(i7).setAlpha(1.0f - bxVar.w3);
            }
        }
        bxVar.Q3();
        bxVar.I3();
        View view = bxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ void I0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "PREMIUM_GRACE");
        bxVar.o5();
    }

    public static /* synthetic */ void J0(bx bxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(bxVar.currentAccount).q1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(bxVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(bxVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void K0(bx bxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i7 != 102) {
            bxVar.K4(arrayList, i7, false, false, null);
            return;
        }
        bxVar.getMessagesController().t0 = true;
        bxVar.K4(arrayList, i7, false, false, z10 ? hashSet : null);
        org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
        messagesController.t0 = false;
        messagesController.getNotificationCenter().k(org.telegram.messenger.ks.s, Boolean.TRUE);
        bxVar.getMessagesController().J(bxVar.Y2);
        int i10 = bxVar.Y2;
        if (i10 == 0 || bxVar.d4(bxVar.currentAccount, bxVar.f0[0].s, i10, false).size() != 0) {
            return;
        }
        bxVar.f0[0].a.setEmptyView(null);
        bxVar.f0[0].x.setVisibility(4);
        bxVar.finishFragment();
    }

    public static void L0(bx bxVar) {
        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(bxVar.getParentActivity(), bxVar.resourceProvider);
        nbVar.d(R.raw.email_check_inbox, new String[0]);
        nbVar.b.setText(org.telegram.messenger.gd.N0(2131742540, null));
        org.telegram.ui.Components.fc.g(bxVar, nbVar, 2750).j();
        try {
            bxVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void X2(bx bxVar, float f10) {
        float f11;
        float f12;
        float i7 = Utilities.i(bxVar.z1 * 2.0f, 1.0f, 0.0f);
        sv svVar = bxVar.F0;
        float f13 = (1.0f - bxVar.w3) * f10 * bxVar.I0;
        float f14 = 1.0f - i7;
        svVar.setAlpha(f13 * f14);
        if (bxVar.L || bxVar.N) {
            float i10 = Utilities.i((-bxVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (bxVar.w3 == 1.0f) {
                i10 = 1.0f;
            }
            float i11 = Utilities.i(i10 / 0.5f, 1.0f, 0.0f);
            bxVar.F0.setClipTop(0);
            if (bxVar.L || !bxVar.N) {
                bxVar.F0.setTranslationY(((bxVar.U / 2.0f) + (Math.max(bxVar.O, -bxVar.g4()) + bxVar.y3)) - org.telegram.messenger.g0.L(8.0f));
                bxVar.F0.l(!bxVar.H3.c(), i10);
                if (bxVar.N) {
                    f11 = 1.0f - i11;
                    bxVar.actionBar.setTranslationY(0.0f);
                } else {
                    f12 = bxVar.I0;
                }
            } else {
                bxVar.F0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                bxVar.F0.setProgressToCollapse(1.0f);
                f12 = bxVar.I0;
            }
            f11 = 1.0f - f12;
            bxVar.actionBar.setTranslationY(0.0f);
        } else {
            if (bxVar.M) {
                bxVar.F0.setTranslationY((Math.max(bxVar.O, -bxVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                bxVar.F0.setProgressToCollapse(1.0f);
                sv svVar2 = bxVar.F0;
                svVar2.setClipTop((int) (org.telegram.messenger.g0.m - svVar2.getY()));
            }
            f11 = 1.0f - bxVar.I0;
            bxVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            bxVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            bxVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - bxVar.w3;
            bxVar.actionBar.getTitlesContainer().setAlpha(f16);
            bxVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        bxVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.m);
        bxVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        bxVar.actionBar.getTitlesContainer().setScaleY(f17);
        bxVar.actionBar.getTitlesContainer().setScaleX(f17);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - bxVar.w3) * f15;
        bxVar.actionBar.getTitlesContainer().setAlpha(f18);
        bxVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void Y2(bx bxVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        if (bxVar.parentLayout == null || bxVar.actionBar == null) {
            return;
        }
        float max = Math.max(bxVar.e.e, bxVar.i4());
        float f10 = 1.0f;
        float f11 = 1.0f - bxVar.z1;
        float f12 = max * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i7) {
            f10 = 0.0f;
            i7 = -1;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i7 <= 0 || (r4Var = bxVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) r4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
    }

    public static void Z(bx bxVar) {
        try {
            ((org.telegram.ui.Components.nh0) ((org.telegram.ui.Components.a9) bxVar.O1.h.getImageReceiver().n0).K).H(true);
        } catch (Exception unused) {
        }
        if (bxVar.f4 == null) {
            org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
            bxVar.f4 = u30Var;
            u30Var.I = true;
            u30Var.a = bxVar;
            u30Var.b = new nw(bxVar);
            bxVar.getMediaDataController().z();
            bxVar.getMessagesController().j3();
            bxVar.getMessagesController().n3(bxVar.getUserConfig().f(), true, bxVar.classGuid);
        }
        TLRPC.User c22 = org.telegram.messenger.mp.u1(bxVar.currentAccount).c2(Long.valueOf(org.telegram.messenger.i10.i(bxVar.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.i10.i(bxVar.currentAccount).f();
        }
        if (c22 == null) {
            return;
        }
        org.telegram.ui.Components.ti tiVar = bxVar.f4.c;
        if (tiVar != null) {
            tiVar.Q0();
        }
        org.telegram.ui.Components.u30 u30Var2 = bxVar.f4;
        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
        u30Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new yu(bxVar, 11), new mu(bxVar, 3), 0);
    }

    public static /* synthetic */ void a0(bx bxVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, tL_pendingSuggestion.suggestion);
        bxVar.o5();
    }

    public static void b0(bx bxVar) {
        ArrayList arrayList = bxVar.K2;
        org.telegram.ui.ActionBar.r4 r4Var = bxVar.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).y()) {
            bxVar.finishPreviewFragment();
            return;
        }
        if (bxVar.T0 != 10) {
            if (org.telegram.messenger.mp.u1(bxVar.currentAccount).A2()) {
                b.b(bxVar.currentAccount);
                return;
            } else {
                bxVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
                return;
            }
        }
        if (bxVar.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList2.add(org.telegram.messenger.sr.a(((Long) arrayList.get(i7)).longValue(), 0L));
        }
        bxVar.E2.z(bxVar, arrayList2, null, false, bxVar.L2, bxVar.M2, bxVar.N2, null);
    }

    public static /* synthetic */ void c0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, bxVar.C3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        bxVar.o5();
    }

    public static org.telegram.ui.Cells.u2 c4(ax axVar) {
        xw xwVar = axVar.a;
        for (int i7 = 0; i7 < xwVar.getChildCount(); i7++) {
            View childAt = xwVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.u2) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                if (u2Var.Y()) {
                    return u2Var;
                }
            }
        }
        return null;
    }

    public static void d0(bx bxVar, ax axVar, View view, int i7) {
        int i10;
        if (view instanceof org.telegram.ui.Cells.y3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.u2;
        if (z10) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            if (u2Var.o2) {
                bxVar.h5(u2Var.getDialogId(), view);
                return;
            }
        }
        if (bxVar.U3()) {
            bxVar.F4(view, i7, 0.0f, axVar.d);
            return;
        }
        int i11 = bxVar.T0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            axVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{bxVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = bxVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            e50 e50Var = new e50(k10);
            e50Var.Z = new gv(bxVar);
            bxVar.presentFragment(e50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.c3) && ((i10 = axVar.s) == 7 || i10 == 8)) {
            jg.k kVar = (jg.k) axVar.d.N.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.ro roVar = bxVar.getMessagesController().N[axVar.s - 7];
                if (roVar != null) {
                    int i13 = roVar.a;
                    org.telegram.ui.Components.g00 g00Var = new org.telegram.ui.Components.g00(bxVar, false);
                    g00Var.U1 = -1;
                    g00Var.Y1 = "";
                    g00Var.Z1 = new ArrayList();
                    g00Var.b2 = "";
                    g00Var.d2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    g00Var.e2 = arrayList;
                    g00Var.v2 = -1;
                    g00Var.y2 = -5;
                    g00Var.U1 = i13;
                    g00Var.W1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    g00Var.c2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = bxVar.getMessagesController().Q0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.ro) arrayList2.get(i12)).a == i13) {
                                g00Var.Y1 = ((org.telegram.messenger.ro) arrayList2.get(i12)).b;
                                break;
                            }
                            i12++;
                        }
                    }
                    g00Var.g1();
                    bxVar.showDialog(g00Var);
                    return;
                }
                return;
            }
        } else if (z10 && !bxVar.actionBar.x() && !bxVar.H3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.u2) view).Z1;
            org.telegram.messenger.g0.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), imageReceiver.B());
        }
        bxVar.E4(view, i7, axVar.d);
    }

    public static /* synthetic */ void e0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "USERPIC_SETUP");
        bxVar.o5();
    }

    public static /* synthetic */ void h0(bx bxVar) {
        if (bxVar.f4.g()) {
            org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "USERPIC_SETUP");
            bxVar.o5();
        }
    }

    public static void i0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).h7.edit().putBoolean("storyhint", false).commit();
    }

    public static void i1(bx bxVar, boolean z10) {
        if (bxVar.f0 == null || bxVar.O3 == z10) {
            return;
        }
        bxVar.O3 = z10;
        int i7 = 0;
        while (true) {
            ax[] axVarArr = bxVar.f0;
            if (i7 >= axVarArr.length) {
                return;
            }
            if (z10) {
                axVarArr[i7].a.setScrollbarFadingEnabled(false);
            }
            bxVar.f0[i7].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                bxVar.f0[i7].a.setScrollbarFadingEnabled(true);
            }
            i7++;
        }
    }

    public static void j0(final int i7, final long j3, TLRPC.Chat chat, final bx bxVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        bxVar.p4(false);
        if (i7 == 103 && org.telegram.messenger.v3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.v3.t0(chat2)) {
                bxVar.getMessagesController().X(2, j3, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i12 = bxVar.Y2) != 0 && bxVar.d4(bxVar.currentAccount, bxVar.f0[0].s, i12, false).size() == 1) {
            bxVar.f0[0].x.setVisibility(4);
        }
        int i13 = -1;
        if (i7 == 102) {
            bxVar.U4(true, true);
            if (bxVar.T1 != null) {
                i11 = 0;
                while (i11 < bxVar.T1.size()) {
                    if (((TLRPC.Dialog) bxVar.T1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i11 = -1;
            bxVar.z3();
            i10 = i11;
        } else {
            i10 = -1;
        }
        UndoView l42 = bxVar.l4();
        if (l42 != null) {
            l42.j(i7 == 103 ? 0 : z11 ? 1 : 95, j3, new Runnable() { // from class: org.telegram.ui.tu
                @Override // java.lang.Runnable
                public final void run() {
                    bxVar.J4(i7, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(bxVar.d4(bxVar.currentAccount, bxVar.f0[0].s, bxVar.Y2, false));
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i14)).id == j3) {
                i13 = i14;
                break;
            }
            i14++;
        }
        if (i7 == 102) {
            if (i10 < 0 || i13 >= 0 || (arrayList = bxVar.T1) == null) {
                bxVar.U4(false, true);
                return;
            }
            arrayList.remove(i10);
            bxVar.f0[0].y.D();
            bxVar.f0[0].q(true);
        }
    }

    public static void k0(bx bxVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.c;
        if (arrayList.size() != 1) {
            bi.f2.l1(false, t1Var);
            return;
        }
        bi.p3 p3Var = new bi.p3(bxVar.getParentActivity(), bxVar.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        p3Var.g1(true);
        bxVar.showDialog(p3Var);
    }

    public static void l0(bx bxVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0(bxVar).I(R.raw.gift, org.telegram.messenger.gd.N0(2131746662, null), org.telegram.messenger.gd.N0(2131746661, null));
            I.j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            bxVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.f3.n(null, 2131743632, org.telegram.ui.Components.kc.b0(bxVar), R.raw.error, 36);
            return;
        }
        if (bxVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bxVar.getParentActivity(), bxVar.resourceProvider);
            String N0 = org.telegram.messenger.gd.N0(2131746658, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131746659, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
            bxVar.showDialog(t1Var);
        }
    }

    public static /* synthetic */ void m0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "SETUP_PASSKEY");
        bxVar.o5();
    }

    public static void n0(bx bxVar, int i7) {
        Object obj;
        org.telegram.ui.Components.hm0 hm0Var = bxVar.D0.r0;
        if (i7 < hm0Var.a0 || i7 >= hm0Var.b0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.n41 G = hm0Var.G(i7);
            obj = G != null ? G.H : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bxVar.getParentActivity(), bxVar.resourceProvider);
            String N0 = org.telegram.messenger.gd.N0(2131754177, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131754176, "\"" + org.telegram.messenger.n10.q(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131746125, null), new zs(3, bxVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static /* synthetic */ void o0(bx bxVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bxVar.w3 = floatValue;
        bxVar.f0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < bxVar.actionBar.getChildCount(); i7++) {
            if (bxVar.actionBar.getChildAt(i7).getVisibility() == 0 && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getActionMode() && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getBackButton()) {
                bxVar.actionBar.getChildAt(i7).setAlpha(1.0f - bxVar.w3);
            }
        }
        View view = bxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        bxVar.Q3();
        bxVar.I3();
    }

    public static /* synthetic */ void p0(bx bxVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.i10.i(bxVar.currentAccount).e());
        bxVar.presentFragment(new bn(bundle));
    }

    public static void q0(bx bxVar) {
        b.c(bxVar.currentAccount, bxVar.getParentActivity(), bxVar.getResourceProvider());
    }

    public static void r4(bn bnVar, org.telegram.messenger.fj fjVar) {
        if (fjVar == null || !fjVar.r2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(fjVar.z) ? fjVar.z : fjVar.v;
            CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, fjVar.a2, null);
            if (x12 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                org.telegram.ui.Components.i00[] i00VarArr = (org.telegram.ui.Components.i00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.i00.class);
                if (i00VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(i00VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(i00VarArr[0]);
                    for (int i7 = 1; i7 < i00VarArr.length; i7++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(i00VarArr[i7]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(i00VarArr[i7]);
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
                    bnVar.Sb(fjVar.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static /* synthetic */ void s0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "PREMIUM_RESTORE");
        bxVar.o5();
    }

    public static void t0(bx bxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            xc1.a(bxVar.getParentActivity(), new x(bxVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.G0(launchActivity, bxVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static void u0(bx bxVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(bxVar.currentAccount);
        int i7 = a10.a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.c;
        if (t1Var != null && !set.contains(t1Var.a)) {
            set.add(a10.c.a);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).h7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.ks.f(i7).k(org.telegram.messenger.ks.j5, new Object[0]);
        }
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "BIRTHDAY_CONTACTS_TODAY");
        bxVar.o5();
        org.telegram.ui.Components.fc G = org.telegram.ui.Components.kc.b0(bxVar).G(R.raw.gift, 4, org.telegram.messenger.gd.N0(2131753327, null));
        G.j = 5000;
        G.j();
    }

    public static void v0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "PREMIUM_CHRISTMAS");
        bxVar.o5();
        org.telegram.ui.Components.fc G = org.telegram.ui.Components.kc.b0(bxVar).G(R.raw.gift, 4, org.telegram.messenger.gd.N0(2131753327, null));
        G.j = 5000;
        G.j();
    }

    public static void v1(bx bxVar, ax axVar, float f10) {
        if (bxVar.U == f10) {
            return;
        }
        bxVar.U = f10;
        if (f10 == 0.0f) {
            bxVar.V = false;
        }
        bxVar.F0.setOverscroll(f10);
        axVar.a.setViewsOffset(f10);
        axVar.a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        bxVar.fragmentView.invalidate();
        if (f10 <= org.telegram.messenger.g0.L(90.0f) || bxVar.V) {
            return;
        }
        sv svVar = bxVar.F0;
        ValueAnimator valueAnimator = svVar.I0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            svVar.i(svVar.q0, true);
            bxVar.V = true;
            bxVar.getOrCreateStoryViewer().x(new fu(bxVar, 12));
        }
    }

    public static void w0(bx bxVar, int i7, org.telegram.ui.Components.x60 x60Var) {
        if (bxVar.currentAccount == i7) {
            return;
        }
        x60Var.v();
        if (bxVar.getParentActivity() == null) {
            return;
        }
        vw vwVar = bxVar.E2;
        LaunchActivity launchActivity = (LaunchActivity) bxVar.getParentActivity();
        ArrayList arrayList = bxVar.F2;
        String str = bxVar.G2;
        CharSequence charSequence = bxVar.H2;
        mv mvVar = bxVar.D1;
        CharSequence fieldText = mvVar != null ? mvVar.getFieldText() : null;
        launchActivity.O0(i7);
        bx bxVar2 = new bx(bxVar.arguments);
        bxVar2.E2 = vwVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                bxVar2.Y4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    bxVar2.H2 = null;
                } else {
                    bxVar2.H2 = charSequence;
                    bxVar2.G2 = null;
                    bxVar2.F2 = null;
                    if (bxVar2.D1 != null) {
                        bxVar2.v3(fieldText);
                    } else {
                        bxVar2.Z3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            bxVar2.F2 = null;
        } else {
            bxVar2.F2 = arrayList;
            bxVar2.G2 = null;
            bxVar2.O2 = false;
            if (bxVar2.D1 != null) {
                bxVar2.v3(fieldText);
            } else {
                bxVar2.Z3 = fieldText;
            }
        }
        launchActivity.u0(bxVar2, false, true);
    }

    public static boolean w1(bx bxVar, ax axVar) {
        if (bxVar.H3.c()) {
            return false;
        }
        int i7 = (int) (-bxVar.O);
        int f42 = bxVar.f4();
        int g42 = bxVar.g4();
        if (i7 == 0 || i7 == f42 || i7 == g42 || !axVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (g42 >= i7 || i7 >= f42) {
            if ((bxVar.w3 != 1.0f ? Utilities.i((-bxVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f) : 1.0f) < bxVar.F0.C0) {
                axVar.b.x(-i7);
                return true;
            }
            axVar.b.x(g42 - i7);
            return true;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int i10 = i7 - g42;
        if (i10 < L / 2) {
            axVar.b.x(-i10);
            return true;
        }
        axVar.b.x(L - i10);
        return true;
    }

    public static /* synthetic */ void x0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        bxVar.o5();
    }

    public static String x2(bx bxVar) {
        ArrayList arrayList = bxVar.K2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return org.telegram.messenger.gd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == bxVar.getUserConfig().e()) {
                sb2.append(org.telegram.messenger.gd.N0(2131745705, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.n5.l(bxVar.currentAccount, longValue) : org.telegram.messenger.n5.s(bxVar.currentAccount, longValue));
            }
        }
        return org.telegram.messenger.gd.a0(null, null, 2131745243, sb2.toString());
    }

    public static void y0(bx bxVar) {
        PasskeysActivity.f0(bxVar.currentAccount, bxVar.getParentActivity(), bxVar.resourceProvider, true);
    }

    public static /* synthetic */ void z0(bx bxVar) {
        if (bxVar.f0 == null) {
            return;
        }
        if (bxVar.U1 || bxVar.isPaused) {
            bxVar.Q3 = true;
            return;
        }
        bxVar.Q3 = false;
        bxVar.getMessagesController().f5(null);
        bxVar.N4(false);
    }

    public static void z4(org.telegram.messenger.c cVar) {
        int i7 = cVar.a;
        boolean[] zArr = D4;
        if (zArr[i7]) {
            return;
        }
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        u12.d3();
        u12.a3(0, 0, 100, true, null);
        if (u12.s.isEmpty() && !TextUtils.isEmpty(u12.U3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = u12.U3;
            u12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.mj(u12, 4));
        }
        u12.n3(org.telegram.messenger.i10.i(i7).f(), false, 0);
        org.telegram.messenger.i5.r(i7).f();
        org.telegram.messenger.ri.d0(i7).w(false);
        org.telegram.messenger.g0.h3(new ch(cVar, 18), 200L);
        Iterator it = u12.f4.iterator();
        while (it.hasNext()) {
            org.telegram.messenger.ri.d0(i7).f1((String) it.next(), true, true);
        }
        zArr[i7] = true;
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.T0;
        if (i10 == 15 || i10 == 16 || this.j2 != null || !this.u2) {
            return true;
        }
        if (!org.telegram.messenger.n5.z(j3)) {
            if (!org.telegram.messenger.n5.C(j3)) {
                return true;
            }
            if (this.V0 == 0 && !this.W0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131745400, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            int i11 = this.V0;
            if (i11 == 3) {
                t1Var.U = org.telegram.messenger.gd.N0(2131743845, null);
            } else if (i11 != 0) {
                t1Var.U = org.telegram.messenger.gd.N0(2131746982, null);
            } else {
                t1Var.U = org.telegram.messenger.gd.N0(2131748911, null);
            }
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747637, null), null);
            showDialog(t1Var);
            return false;
        }
        long j10 = -j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j10));
        if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
            return true;
        }
        if (!this.s2) {
            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(j10));
            if ((org.telegram.messenger.v3.n(O02) || O02.megagroup) && (i7 = this.V0) != 2 && i7 != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String N02 = org.telegram.messenger.gd.N0(2131745400, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
        t1Var2.S = N02;
        int i12 = this.V0;
        if (i12 == 3) {
            t1Var2.U = org.telegram.messenger.gd.N0(2131743846, null);
        } else if (i12 == 2) {
            t1Var2.U = org.telegram.messenger.gd.N0(2131746391, null);
        } else {
            t1Var2.U = org.telegram.messenger.gd.N0(2131752428, null);
        }
        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131747637, null), null);
        showDialog(t1Var2);
        return false;
    }

    public final void A4(long j3) {
        long j10 = j3;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j10);
        int i7 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                A4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i10 = -1;
        if ((!this.actionBar.x() || this.actionBar.y(null)) && H4(this.f0[0], dialog)) {
            U4(true, true);
            z3();
            if (this.T1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.T1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.T1.get(i11)).id == j10) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                }
                if (i10 < 0) {
                    U4(false, false);
                }
            }
        }
        int i12 = i10;
        if (getMessagesController().y2(j10) || getMessagesController().F2(j10)) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            org.telegram.messenger.tr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.kl klVar = new org.telegram.messenger.kl(messagesController, j10);
            org.telegram.messenger.q5 q5Var = messagesStorage.a;
            org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j10, klVar, 5);
            j10 = j10;
            q5Var.c(d4Var);
        }
        getMessagesController().v3(j10, 0L);
        org.telegram.messenger.mp messagesController2 = getMessagesController();
        int i13 = dialog.top_message;
        messagesController2.q3(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i12 >= 0) {
            this.T1.remove(i12);
            this.f0[0].y.D();
            this.f0[0].q(true);
        }
    }

    public final void A5() {
        hi.u3 u3Var;
        boolean i52 = getMessagesController().i5();
        if (this.P3 != i52) {
            s5();
            if (!this.P3 && i52 && (u3Var = this.q0) != null) {
                u3Var.x();
            }
            this.P3 = i52;
        }
        org.telegram.ui.Components.a10 a10Var = this.u0;
        if (a10Var == null) {
            return;
        }
        if (this.T0 == 10) {
            a10Var.setImageResource(R.drawable.floating_check);
            this.u0.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
        } else {
            a10Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.u0.setContentDescription(org.telegram.messenger.gd.N0(2131748077, null));
        }
    }

    @Override // org.telegram.ui.ke0
    public final ui.f B() {
        return this.q4;
    }

    public final void B3(boolean z10) {
        mi.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.bs bsVar = this.L1;
        if (bsVar == null || (jVar = this.S1) == null || (chatFull = this.c3) == null) {
            return;
        }
        bsVar.j(jVar, (this.a3 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.S1.setTitle(org.telegram.messenger.gd.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.v3.K(r6, false) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean V = org.telegram.messenger.v3.V(chat);
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.H.bot_participant) == null || !bool2.booleanValue() || getMessagesController().C2(chat, user) || org.telegram.messenger.v3.b(chat)))) {
                Boolean bool3 = this.H.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.H.forum;
                if ((bool4 == null || bool4.booleanValue() == org.telegram.messenger.v3.c0(chat)) && ((this.H.user_admin_rights == null || getMessagesController().B3(chat, getUserConfig().f(), this.H.user_admin_rights)) && (this.H.bot_admin_rights == null || getMessagesController().B3(chat, user, this.H.bot_admin_rights) || org.telegram.messenger.v3.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void B5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        fi.p6 k42;
        ArrayList arrayList;
        if (this.F0 == null || this.J != null) {
            return;
        }
        wv wvVar = this.H3;
        if ((wvVar != null && wvVar.c()) || this.s3 || (kVar = this.actionBar) == null || kVar.x() || this.n2) {
            return;
        }
        hi.nb nbVar = hi.nb.G2;
        int i7 = 0;
        if ((nbVar != null && nbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i10 = 1;
        boolean z12 = !t4() && k4().I();
        if (this.a3 != 0) {
            z11 = false;
        } else if (t4()) {
            z11 = !k4().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (k42 = k4()).g) != null && arrayList.size() > 0) || k42.J());
            z12 = k4().I();
        }
        this.M = z12;
        boolean z13 = this.H0;
        boolean z14 = z12 || z11;
        this.H0 = z14;
        if (z11 || z14) {
            this.F0.p(z10, z14 != z13);
        }
        boolean z15 = this.H0;
        int i11 = 2;
        int i12 = 8;
        if (z15 != z13) {
            if (z10) {
                ValueAnimator valueAnimator = this.K;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.H0 && !isInPreviewMode()) {
                    this.F0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, this.H0 ? 1.0f : 0.0f);
                this.K = ofFloat;
                ofFloat.addUpdateListener(new ji(i10, this));
                this.K.addListener(new org.telegram.ui.Cells.x9(this, 26));
                this.K.setDuration(200L);
                this.K.setInterpolator(org.telegram.ui.Components.kr.f);
                this.K.start();
            } else {
                this.F0.setVisibility((!z15 || isInPreviewMode()) ? 8 : 0);
                this.I0 = this.H0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z11 == this.N) {
            return;
        }
        this.N = z11;
        if (z11) {
            this.F0.l(false, 1.0f);
        }
        if (z10 && !isInPreviewMode()) {
            this.F0.setVisibility(0);
            float f10 = -this.O;
            float f42 = z11 ? 0.0f : f4();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat2;
            ofFloat2.addUpdateListener(new iw(this, f10, z11, f42));
            this.J.addListener(new cw(this, z11, i11));
            this.J.setDuration(200L);
            this.J.setInterpolator(org.telegram.ui.Components.kr.f);
            this.J.start();
            return;
        }
        this.L = z11;
        sv svVar = this.F0;
        if ((z11 || this.M) && !isInPreviewMode()) {
            i12 = 0;
        }
        svVar.setVisibility(i12);
        if (z11) {
            this.A3 = -org.telegram.messenger.g0.L(81.0f);
            W4(-f4());
        } else {
            W4(0.0f);
        }
        while (true) {
            ax[] axVarArr = this.f0;
            if (i7 >= axVarArr.length) {
                break;
            }
            ax axVar = axVarArr[i7];
            if (axVar != null) {
                axVar.a.requestLayout();
            }
            i7++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (getMessagesController().e2.get(r14.Y2) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C3(ax axVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i7;
        int L0 = axVar.c.L0();
        int N0 = axVar.c.N0();
        if (this.j3 || this.o3) {
            return;
        }
        qw qwVar = this.A0;
        if (qwVar != null && qwVar.getVisibility() == 0 && this.A0.P) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            v4.f1 K = axVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.d2 = z14;
            if (z14) {
                q4(false);
            }
        } else {
            this.d2 = false;
        }
        int i10 = axVar.s;
        if (i10 == 7 || i10 == 8) {
            ArrayList V0 = getMessagesController().V0();
            int i11 = axVar.h;
            if (i11 >= 0 && i11 < V0.size()) {
                int i12 = ((org.telegram.messenger.ro) V0.get(axVar.h)).g;
                int i13 = org.telegram.messenger.mp.I8;
                if ((i12 & 128) == 0 && ((abs > 0 && N0 >= d4(this.currentAccount, axVar.s, 1, this.U1).size() - 10) || (abs == 0 && !getMessagesController().e2.get(1)))) {
                    boolean z15 = getMessagesController().e2.get(1);
                    boolean z16 = !z15;
                    z10 = (z15 && getMessagesController().f2.get(1)) ? false : true;
                    z11 = z16;
                    if (abs > 0 || N0 < d4(this.currentAccount, axVar.s, this.Y2, this.U1).size() - 10) {
                        if (abs == 0 && ((i7 = axVar.s) == 7 || i7 == 8 || y4(axVar))) {
                        }
                        z12 = false;
                        z13 = false;
                        if (!z12 || z10) {
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.xu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bx bxVar = bx.this;
                                    if (z12) {
                                        bxVar.getMessagesController().a3(bxVar.Y2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        bxVar.getMessagesController().a3(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z17 = getMessagesController().e2.get(this.Y2);
                    boolean z18 = !z17;
                    if (z17) {
                        if (getMessagesController().f2.get(this.Y2)) {
                            z13 = z18;
                            z12 = false;
                            if (z12) {
                            }
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.xu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bx bxVar = bx.this;
                                    if (z12) {
                                        bxVar.getMessagesController().a3(bxVar.Y2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        bxVar.getMessagesController().a3(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                    }
                    z13 = z18;
                    z12 = true;
                    if (z12) {
                    }
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.xu
                        @Override // java.lang.Runnable
                        public final void run() {
                            bx bxVar = bx.this;
                            if (z12) {
                                bxVar.getMessagesController().a3(bxVar.Y2, -1, 100, z13, null);
                            }
                            if (z10) {
                                bxVar.getMessagesController().a3(1, -1, 100, z11, null);
                            }
                        }
                    });
                }
            }
        }
        z10 = false;
        z11 = false;
        if (abs > 0) {
        }
        if (abs == 0) {
        }
        z12 = false;
        z13 = false;
        if (z12) {
        }
        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.xu
            @Override // java.lang.Runnable
            public final void run() {
                bx bxVar = bx.this;
                if (z12) {
                    bxVar.getMessagesController().a3(bxVar.Y2, -1, 100, z13, null);
                }
                if (z10) {
                    bxVar.getMessagesController().a3(1, -1, 100, z11, null);
                }
            }
        });
    }

    public final boolean C4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user == null || org.telegram.messenger.n10.A(user) || org.telegram.messenger.n10.y(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final void C5(int i7, boolean z10) {
        if (this.A0 == null || this.T0 != 0 || this.n2) {
            return;
        }
        this.S3 = i7;
        org.telegram.messenger.ro m42 = m4();
        this.S3 = -1;
        boolean z11 = false;
        boolean z12 = m42 != null && getMessagesController().V0().size() > 1 && getMessagesController().x2(m42);
        qw qwVar = this.A0;
        if (z10 && qwVar.getVisibility() == 0) {
            z11 = true;
        }
        qwVar.k(z12, z11);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    public final void D4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i7 = 1;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(getParentActivity(), false, 1, null);
        boolean z10 = getMessagesStorage().M != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, org.telegram.messenger.bz.q1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? org.telegram.messenger.gd.N0(2131748489, null) : null, org.telegram.messenger.gd.N0(org.telegram.messenger.bz.q1 ? 2131747052 : 2131749131, null)};
        k4 k4Var = new k4(this, i7);
        j3.M = charSequenceArr;
        j3.N = iArr;
        j3.L = k4Var;
        showDialog(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D5(int i7, boolean z10) {
        RecyclerView recyclerView;
        int i10;
        int childCount;
        int i11;
        int i12 = 131072;
        if (this.U1) {
            int i13 = org.telegram.messenger.mp.I8;
            if ((i7 & 131072) == 0) {
                return;
            }
        }
        if (this.isPaused) {
            return;
        }
        int i14 = 0;
        while (i14 < 3) {
            if (i14 == 2) {
                jw jwVar = this.D0;
                recyclerView = jwVar != null ? jwVar.b0 : null;
            } else {
                ax[] axVarArr = this.f0;
                if (axVarArr != null) {
                    xw xwVar = i14 < axVarArr.length ? axVarArr[i14].a : null;
                    if (xwVar == null || axVarArr[i14].getVisibility() == 0) {
                        r6 = xwVar != null ? this.f0[i14] : null;
                        recyclerView = xwVar;
                    }
                }
                i10 = i14;
                i14 = i10 + 1;
                i12 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i15 = org.telegram.messenger.mp.I8;
                if (((i7 & 2048) != 0 || i7 == 0) && r6 != null) {
                    r6.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount2) {
                        View childAt = recyclerView.getChildAt(i16);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.u2;
                        ArrayList arrayList = this.K2;
                        if (z11 && (this.D0 == null || recyclerView.getAdapter() != this.D0.e0)) {
                            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                            int i17 = org.telegram.messenger.mp.I8;
                            if ((i7 & i12) != 0) {
                                u2Var.c0(this.actionBar.x(), true);
                                if (this.U1) {
                                    i10 = i14;
                                    i16++;
                                    i14 = i10;
                                    i12 = 131072;
                                }
                            }
                            if ((65536 & i7) != 0) {
                                u2Var.e0(false, (i7 & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i7 & 512) == 0) {
                                    i10 = i14;
                                    if (u2Var.k0(i7, z10)) {
                                        r6.q(false);
                                        break;
                                    }
                                } else if (this.f0[i14].p() && org.telegram.messenger.g0.Q1()) {
                                    i10 = i14;
                                    u2Var.setDialogSelected(u2Var.getDialogId() == this.r2.a);
                                } else {
                                    i10 = i14;
                                }
                                if (arrayList != null) {
                                    u2Var.e0(arrayList.contains(Long.valueOf(u2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.sa)) {
                                    ((org.telegram.ui.Cells.sa) childAt).i(i7);
                                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                                    g6Var.A(i7);
                                    if (arrayList != null) {
                                        g6Var.x(arrayList.contains(Long.valueOf(g6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.U1 && (childAt instanceof org.telegram.ui.Components.ek0)) {
                                    org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) childAt;
                                    childCount = ek0Var.getChildCount();
                                    for (i11 = 0; i11 < childCount; i11++) {
                                        View childAt2 = ek0Var.getChildAt(i11);
                                        if (childAt2 instanceof org.telegram.ui.Cells.p4) {
                                            ((org.telegram.ui.Cells.p4) childAt2).b(i7);
                                        }
                                    }
                                }
                                i16++;
                                i14 = i10;
                                i12 = 131072;
                            }
                        }
                        i10 = i14;
                        if (!(childAt instanceof org.telegram.ui.Cells.sa)) {
                        }
                        if (!this.U1) {
                            org.telegram.ui.Components.ek0 ek0Var2 = (org.telegram.ui.Components.ek0) childAt;
                            childCount = ek0Var2.getChildCount();
                            while (i11 < childCount) {
                            }
                        }
                        i16++;
                        i14 = i10;
                        i12 = 131072;
                    }
                }
            }
            i10 = i14;
            i14 = i10 + 1;
            i12 = 131072;
        }
    }

    @Override // pg.b
    public final List E() {
        return Arrays.asList(new pg.a(org.telegram.messenger.gd.N0(2131751636, null)), new pg.a(org.telegram.messenger.gd.N0(2131752064, null), new fu(this, 23)), new pg.a(org.telegram.messenger.gd.N0(2131751637, null), new fu(this, 24)));
    }

    public final void E3() {
        if (this.f0 == null) {
            return;
        }
        int w32 = w3();
        int i7 = 0;
        while (true) {
            ax[] axVarArr = this.f0;
            if (i7 >= axVarArr.length) {
                return;
            }
            ax axVar = axVarArr[i7];
            if (axVar != null) {
                xw xwVar = axVar.a;
                xwVar.setPadding(0, xwVar.g3, 0, w32);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E4(View view, int i7, v4.i0 i0Var) {
        v4.i0 i0Var2;
        long j3;
        boolean z10;
        int i10;
        int i11;
        int i12;
        org.telegram.messenger.fj fjVar;
        long j10;
        long j11;
        org.telegram.ui.Components.mm0 mm0Var;
        wv wvVar;
        long j12;
        long j13;
        int i13;
        org.telegram.messenger.fj fjVar2;
        long F;
        long j14;
        long j15;
        TLRPC.Chat O0;
        boolean z11;
        jw jwVar;
        int i14;
        Object J;
        long j16;
        long j17;
        int i15;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = i0Var instanceof jg.m;
        if (z12) {
            jg.m mVar = (jg.m) i0Var;
            int i16 = mVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.ro roVar = getMessagesController().N[i16 == 7 ? (char) 0 : (char) 1];
                if (roVar != null) {
                    i14 = roVar.a;
                    J = mVar.J(i7);
                    if (this.E2 == null && mVar.n && i0Var.d(i7) == 21) {
                        this.E2.O(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j17 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i15 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.y(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new bx(bundle));
                                return;
                            }
                            j16 = dialog.id;
                            if (this.actionBar.y(null)) {
                                g5(j16, view);
                                return;
                            }
                            i0Var2 = i0Var;
                            i10 = i15;
                            z10 = false;
                            i11 = 0;
                            fjVar = null;
                            i12 = i14;
                            j11 = j16;
                            j10 = 0;
                            j3 = 0;
                        } else if (J instanceof TLRPC.TL_recentMeUrlChat) {
                            j17 = ((TLRPC.TL_recentMeUrlChat) J).chat_id;
                        } else if (J instanceof TLRPC.TL_recentMeUrlUser) {
                            j16 = ((TLRPC.TL_recentMeUrlUser) J).user_id;
                        } else {
                            if (!(J instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (J instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) J).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSet.id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.jw0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                            i0Var2 = i0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!org.telegram.messenger.v3.T(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.o70(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j16 = -chat2.id;
                            i15 = 0;
                            i10 = i15;
                            z10 = false;
                            i11 = 0;
                            fjVar = null;
                            i12 = i14;
                            j11 = j16;
                            j10 = 0;
                            j3 = 0;
                        }
                        j16 = -j17;
                    } else {
                        j16 = ((TLRPC.User) J).id;
                    }
                    i0Var2 = i0Var;
                    i15 = 0;
                    i10 = i15;
                    z10 = false;
                    i11 = 0;
                    fjVar = null;
                    i12 = i14;
                    j11 = j16;
                    j10 = 0;
                    j3 = 0;
                }
            }
            i14 = 0;
            J = mVar.J(i7);
            if (this.E2 == null) {
            }
            if (J instanceof TLRPC.User) {
            }
            i0Var2 = i0Var;
            i15 = 0;
            i10 = i15;
            z10 = false;
            i11 = 0;
            fjVar = null;
            i12 = i14;
            j11 = j16;
            j10 = 0;
            j3 = 0;
        } else {
            i0Var2 = i0Var;
            jw jwVar2 = this.D0;
            if (jwVar2 == null || i0Var2 != (mm0Var = jwVar2.e0)) {
                j3 = 0;
                z10 = false;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                fjVar = null;
                j10 = 0;
                j11 = 0;
            } else {
                Object I = mm0Var.I(i7);
                z10 = this.D0.e0.N(i7);
                if (I instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) I;
                    F = user.id;
                    if (!this.n2) {
                        this.Y1 = F;
                        this.Z1 = user;
                    }
                } else if (I instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) I;
                    F = -chat3.id;
                    if (!this.n2) {
                        this.Y1 = F;
                        this.Z1 = chat3;
                    }
                } else if (I instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                    F = org.telegram.messenger.n5.F(encryptedChat.id);
                    if (!this.n2) {
                        this.Y1 = F;
                        this.Z1 = encryptedChat;
                    }
                } else {
                    if (I instanceof org.telegram.messenger.fj) {
                        fjVar2 = (org.telegram.messenger.fj) I;
                        long B0 = org.telegram.messenger.fj.B0(fjVar2.k);
                        int e12 = fjVar2.e1();
                        j3 = 0;
                        j13 = org.telegram.messenger.v3.c0(getMessagesController().O0(Long.valueOf(-B0))) ? org.telegram.messenger.fj.b2(fjVar2.K1, fjVar2.k, true, false) : 0L;
                        jw jwVar3 = this.D0;
                        if (jwVar3 != null) {
                            org.telegram.ui.Components.mm0 mm0Var2 = jwVar3.e0;
                            mm0Var2.k0.a(mm0Var2.a0);
                        }
                        i13 = e12;
                        j12 = B0;
                    } else {
                        j3 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            jw jwVar4 = this.D0;
                            if (jwVar4 != null && !jwVar4.e0.K.isEmpty()) {
                                this.Y.r.setText(str2);
                                this.Y.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                dh0 dh0Var = new dh0(getParentActivity(), this);
                                dh0Var.O0(str2, true);
                                dh0Var.show();
                            }
                        } else if (I instanceof org.telegram.messenger.f5) {
                            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) I;
                            org.telegram.ui.Components.b5.u(this, f5Var.i, f5Var.j, (String) f5Var.e.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (wvVar = this.H3) != null && (wvVar.getFragment() instanceof w91)) {
                            j12 = -((w91) this.H3.getFragment()).a;
                            j13 = ((TLRPC.TL_forumTopic) I).id;
                            i13 = 0;
                            fjVar2 = null;
                        }
                        i13 = 0;
                        fjVar2 = null;
                        j13 = 0;
                        j12 = 0;
                    }
                    if (j12 == j3 && this.actionBar.x()) {
                        if (this.actionBar.y("search_dialogs_action_mode") && i13 == 0 && !z10) {
                            g5(j12, view);
                            return;
                        }
                        return;
                    }
                    j11 = j12;
                    j10 = j13;
                    i12 = 0;
                    i11 = i13;
                    fjVar = fjVar2;
                    i10 = 0;
                }
                i13 = 0;
                fjVar2 = null;
                j12 = F;
                j13 = 0;
                j3 = 0;
                if (j12 == j3) {
                }
                j11 = j12;
                j10 = j13;
                i12 = 0;
                i11 = i13;
                fjVar = fjVar2;
                i10 = 0;
            }
        }
        if (j11 == j3) {
            return;
        }
        if (this.n2) {
            if (E5(j11)) {
                if ((!getMessagesController().y2(j11) && !getMessagesController().s2(j11)) || u4(j11)) {
                    ArrayList arrayList = this.K2;
                    if (!arrayList.isEmpty() || (this.T0 == 3 && this.h2 != null)) {
                        if (arrayList.contains(Long.valueOf(j11)) || A3(j11)) {
                            boolean s32 = s3(j11, view);
                            jw jwVar5 = this.D0;
                            if (jwVar5 != null && i0Var2 == jwVar5.e0) {
                                this.actionBar.n(true);
                                b4(j11, s32);
                            }
                            w5();
                            return;
                        }
                        return;
                    }
                }
                if (this.o2 && getMessagesController().s2(j11)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j11);
                    bx bxVar = new bx(bundle2);
                    bxVar.Z2 = this;
                    bxVar.E2 = this.E2;
                    presentFragment(bxVar);
                    return;
                }
                if (!this.o2 || ((!getMessagesController().y2(j11) || u4(j11)) && !getMessagesController().F2(j11))) {
                    a4(j11, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j11);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.T0 == 1);
                bundle3.putBoolean("quote", this.P0);
                bundle3.putBoolean("reply_to", this.O0);
                w91 w91Var = new w91(bundle3);
                w91Var.M0 = this;
                presentFragment(w91Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (org.telegram.messenger.n5.C(j11)) {
            j14 = j10;
            bundle4.putInt("enc_id", (int) (j11 & 4294967295L));
        } else {
            j14 = j10;
            if (org.telegram.messenger.n5.E(j11)) {
                bundle4.putLong("user_id", j11);
            } else {
                if (i11 == 0 || (O0 = getMessagesController().O0(Long.valueOf(-j11))) == null || O0.migrated_to == null) {
                    j15 = j11;
                } else {
                    bundle4.putLong("migrated_to", j11);
                    j15 = -O0.migrated_to.channel_id;
                }
                bundle4.putLong("chat_id", -j15);
            }
        }
        if (i11 != 0) {
            bundle4.putInt("message_id", i11);
        } else if (z10) {
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                jw jwVar6 = this.D0;
                if (jwVar6 != null) {
                    jwVar6.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
        } else {
            V3();
        }
        boolean z13 = (org.telegram.messenger.gd.a0 || this.l2 || (org.telegram.messenger.g0.Q1() && i10 != 0) || !org.telegram.messenger.pc.e(64) || this.a3 != j3) ? false : true;
        bundle4.putInt("dialog_folder_id", i10);
        bundle4.putInt("dialog_filter_id", i12);
        if (org.telegram.messenger.g0.Q1() && ((!getMessagesController().y2(j11) || !z13) && this.r2.a == j11 && ((jwVar = this.D0) == null || i0Var2 != jwVar.e0))) {
            if (getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                List fragmentStack = launchActivity.r0.getFragmentStack();
                if (fragmentStack.isEmpty()) {
                    return;
                }
                if (fragmentStack.size() == 1 && (p5.c.h(1, fragmentStack) instanceof bn)) {
                    ((bn) p5.c.h(1, fragmentStack)).xa();
                    return;
                }
                if (fragmentStack.size() == 2) {
                    launchActivity.r0.l(true, false);
                    return;
                } else {
                    if (getParentActivity() instanceof LaunchActivity) {
                        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(0);
                        fragmentStack.clear();
                        fragmentStack.add(g2Var);
                        launchActivity.r0.X(true, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        jw jwVar7 = this.D0;
        if (jwVar7 != null && jwVar7.B0) {
            jwVar7.P(false);
        }
        if (j11 == getUserConfig().e() && getMessagesController().r6) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("dialog_id", org.telegram.messenger.i10.i(this.currentAccount).e());
            bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bundle5.putInt("start_from", 11);
            if (this.E0 == null) {
                this.E0 = new org.telegram.ui.Components.at0(this);
            }
            presentFragment(new org.telegram.ui.Components.h90(bundle5, this.E0));
            return;
        }
        if (this.p2 != null) {
            if (getMessagesController().E(bundle4, this, null, null)) {
                getNotificationCenter().k(org.telegram.messenger.ks.t, new Object[0]);
                bn bnVar = new bn(bundle4);
                r4(bnVar, fjVar);
                presentFragment(bnVar);
                return;
            }
            return;
        }
        this.B3 = true;
        if (getMessagesController().E(bundle4, this, null, null)) {
            TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(-j11));
            TLRPC.Dialog U0 = getMessagesController().U0(j11);
            boolean V = org.telegram.messenger.v3.V(O02);
            boolean z14 = U0 != null && U0.view_forum_as_messages;
            int b10 = (this.a3 == j3 || O02 == null) ? 0 : li.k0.b(this.currentAccount, -O02.id);
            if (b10 == 3) {
                showDialog(new org.telegram.ui.Components.o70(getParentActivity(), O02, null, this, this.resourceProvider));
                return;
            }
            int i17 = 4;
            if (b10 == 4) {
                org.telegram.messenger.f3.n(null, V ? 2131751918 : 2131751915, org.telegram.ui.Components.kc.b0(this), R.raw.e_hand_2, 36);
                return;
            }
            if (O02 == null || !(((z11 = O02.monoforum) || O02.forum) && j14 == j3)) {
                if (org.telegram.messenger.v3.Y(O02)) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putLong("community_id", O02.id);
                    presentFragment(new bx(bundle6));
                    return;
                }
                bn bnVar2 = new bn(bundle4);
                if (j14 != j3) {
                    qg.c.a(bnVar2, org.telegram.messenger.sr.a(j11, j14));
                }
                if (z12 && org.telegram.messenger.n5.E(j11) && getMessagesController().R.f(j11) == null) {
                    org.telegram.messenger.ri mediaDataController = getMediaDataController();
                    TLRPC.Document document = mediaDataController.z0;
                    mediaDataController.q1();
                    if (document != null) {
                        bnVar2.Y9 = document;
                        bnVar2.Z9 = true;
                    }
                }
                if (org.telegram.messenger.g0.Q1()) {
                    wv wvVar2 = this.H3;
                    if (wvVar2.a != null) {
                        wvVar2.a();
                    }
                }
                r4(bnVar2, fjVar);
                presentFragment(bnVar2);
                return;
            }
            if (z11) {
                bundle4.putInt("chatMode", 8);
                bundle4.putBoolean("isSubscriberSuggestions", !org.telegram.messenger.v3.A(this.currentAccount, O02, 24));
                bn bnVar3 = new bn(bundle4);
                r4(bnVar3, fjVar);
                presentFragment(bnVar3);
                return;
            }
            if (org.telegram.messenger.v3.a(O02)) {
                bn bnVar4 = new bn(bundle4);
                qg.c.a(bnVar4, org.telegram.messenger.sr.a(-O02.id, getMessagesController().h7.getLong(a8.p0.o(O02.id, "forumlasttopic"), 1L)));
                presentFragment(bnVar4);
                return;
            }
            if (!org.telegram.messenger.pc.e(64) || this.a3 != j3) {
                if (!z14) {
                    presentFragment(new w91(bundle4));
                    return;
                }
                bn bnVar5 = new bn(bundle4);
                r4(bnVar5, fjVar);
                presentFragment(bnVar5);
                return;
            }
            if (!z13) {
                if (!z14) {
                    presentFragment(new w91(bundle4));
                    return;
                }
                bn bnVar6 = new bn(bundle4);
                r4(bnVar6, fjVar);
                presentFragment(bnVar6);
                return;
            }
            if (this.l2) {
                return;
            }
            if (z14) {
                bn bnVar7 = new bn(bundle4);
                r4(bnVar7, fjVar);
                presentFragment(bnVar7);
                return;
            }
            wv wvVar3 = this.H3;
            dw dwVar = wvVar3.a;
            if (dwVar == null || (-dwVar.a) != j11) {
                xw xwVar = this.f0[0].a;
                xwVar.w3 = 0.0f;
                xwVar.x3 = xwVar.v3;
                xwVar.y3 = xwVar.p3 != 0.0f;
                dw dwVar2 = new dw(bundle4);
                dwVar2.N0 = this;
                final wv wvVar4 = this.H3;
                org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
                h2.f fVar = wvVar4.n;
                if (!wvVar4.r) {
                    wvVar4.x = parentLayout;
                    dwVar2.onFragmentCreate();
                    dwVar2.setInPreviewMode(true);
                    dwVar2.setParentLayout(parentLayout);
                    View performCreateView = dwVar2.performCreateView(wvVar4.getContext());
                    dwVar2.onResume();
                    wvVar4.b = performCreateView;
                    wvVar4.addView(performCreateView);
                    final dw dwVar3 = wvVar4.a;
                    k0 k0Var = dwVar2.e;
                    wvVar4.c = k0Var;
                    wvVar4.addView(k0Var);
                    wvVar4.a = dwVar2;
                    xy0.R = j3;
                    xy0.R = -dwVar2.a;
                    if (dwVar2.getActionBar() != null) {
                        org.telegram.ui.ActionBar.k actionBar = dwVar2.getActionBar();
                        wvVar4.d = actionBar;
                        wvVar4.addView(actionBar);
                        wvVar4.d.f1 = new qu0(wvVar4, 10);
                    }
                    if (dwVar3 != null) {
                        final dw dwVar4 = wvVar4.a;
                        if (org.telegram.messenger.bz.c()) {
                            r1.g gVar = wvVar4.y;
                            if (gVar != null) {
                                gVar.d();
                            }
                            dwVar4.onTransitionAnimationStart(true, false);
                            wvVar4.F = dwVar3;
                            wvVar4.w = true;
                            fVar.d();
                            r1.g gVar2 = new r1.g(new r1.f(0.0f));
                            wvVar4.y = gVar2;
                            gVar2.m = org.telegram.ui.Cells.c0.p(1000.0f, 400.0f, 1.0f);
                            xy0.f(dwVar3, dwVar4, 0.0f);
                            wvVar4.y.b(new ab0(wvVar4, i17));
                            wvVar4.y.a(new r1.c() { // from class: org.telegram.ui.vy0
                                @Override // r1.c
                                public final void a(r1.g gVar3, boolean z15, float f10, float f11) {
                                    xy0 xy0Var = wvVar4;
                                    if (xy0Var.y == null) {
                                        return;
                                    }
                                    xy0Var.y = null;
                                    org.telegram.ui.ActionBar.g2 g2Var2 = dwVar4;
                                    g2Var2.onTransitionAnimationEnd(true, false);
                                    org.telegram.ui.ActionBar.g2 g2Var3 = dwVar3;
                                    xy0.f(g2Var3, g2Var2, 1.0f);
                                    xy0Var.w = false;
                                    xy0Var.F = null;
                                    g2Var3.onPause();
                                    g2Var3.onFragmentDestroy();
                                    xy0Var.removeView(g2Var3.getFragmentView());
                                    xy0Var.removeView(g2Var3.getActionBar());
                                    xy0Var.n.e();
                                }
                            });
                            wvVar4.y.h();
                        } else {
                            dwVar4.onTransitionAnimationStart(true, false);
                            dwVar4.onTransitionAnimationEnd(true, false);
                            xy0.f(dwVar3, dwVar4, 1.0f);
                            wvVar4.w = false;
                            wvVar4.F = null;
                            dwVar3.onPause();
                            dwVar3.onFragmentDestroy();
                            wvVar4.removeView(dwVar3.getFragmentView());
                            wvVar4.removeView(dwVar3.getActionBar());
                            fVar.e();
                        }
                    } else if (!wvVar4.f) {
                        int i18 = 1;
                        wvVar4.f = true;
                        if (org.telegram.messenger.bz.c()) {
                            fVar.d();
                            wvVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                            wvVar4.e = 0.0f;
                            wvVar4.e(true);
                            wvVar4.g();
                            dwVar2.onTransitionAnimationStart(true, false);
                            wvVar4.h.addUpdateListener(new uy0(wvVar4, i18));
                            wvVar4.h.addListener(new org.telegram.ui.Components.f10(14, wvVar4, dwVar2));
                            wvVar4.h.setDuration(250L);
                            wvVar4.h.setInterpolator(org.telegram.ui.Components.kr.f);
                            wvVar4.h.setStartDelay(org.telegram.messenger.bz.o() >= 2 ? 50L : 150L);
                            wvVar4.h.start();
                        } else {
                            wvVar4.e(true);
                            dwVar2.onTransitionAnimationStart(true, false);
                            dwVar2.onTransitionAnimationEnd(true, false);
                            wvVar4.e = 1.0f;
                            wvVar4.g();
                            wvVar4.d(false);
                        }
                    }
                    dwVar2.setPreviewDelegate(new oi0(wvVar4, 15));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(wvVar4);
                }
            } else {
                wvVar3.a();
            }
            jw jwVar8 = this.D0;
            if (jwVar8 != null) {
                jwVar8.Q();
            }
        }
    }

    public final boolean E5(long j3) {
        TLRPC.Chat O0;
        mv mvVar;
        if ((this.U0 <= 1 && ((mvVar = this.D1) == null || mvVar.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !org.telegram.messenger.n5.z(j3) || (O0 = getMessagesController().O0(Long.valueOf(-j3))) == null || org.telegram.messenger.v3.N(O0) || !O0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745106, null), null);
        return false;
    }

    public final void F3() {
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final boolean F4(View view, int i7, float f10, org.telegram.ui.Components.dk0 dk0Var) {
        org.telegram.ui.Components.mm0 mm0Var;
        org.telegram.ui.Components.mm0 mm0Var2;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.c3) && dk0Var.d(i7) != 21) {
            if (!this.actionBar.x() && !org.telegram.messenger.g0.Q1() && !this.n2 && (view instanceof org.telegram.ui.Cells.u2)) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                if (!getMessagesController().y2(u2Var.getDialogId()) && !this.H3.c() && u2Var.b0(f10)) {
                    return b5(u2Var);
                }
            }
            wv wvVar = this.H3;
            if (wvVar == null || !wvVar.c()) {
                jw jwVar = this.D0;
                if (jwVar != null && dk0Var == (mm0Var2 = jwVar.e0)) {
                    Object I = mm0Var2.I(i7);
                    if (!this.D0.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String N0 = org.telegram.messenger.gd.N0(2131752042, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752041, qg.c.j(this.currentAccount, chat, false));
                            } else {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752041, chat.title);
                            }
                            F = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752041, org.telegram.messenger.gd.N0(2131745705, null));
                            } else {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleUserAlertText", null, 2131752039, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            }
                            F = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleUserAlertText", null, 2131752039, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                            F = org.telegram.messenger.n5.F(r14.id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752043, null), new ai.z(this, F, 8));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                jw jwVar2 = this.D0;
                if (jwVar2 == null || dk0Var != (mm0Var = jwVar2.e0)) {
                    Object J = ((jg.m) dk0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || U3()) && E5(dialog.id)) {
                                if (this.T0 != 1 || !U3() || !this.o2 || !getMessagesController().y2(dialog.id)) {
                                    s3(dialog.id, view);
                                    w5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.T0 == 1);
                                bundle.putBoolean("quote", this.P0);
                                bundle.putBoolean("reply_to", this.O0);
                                w91 w91Var = new w91(bundle);
                                w91Var.M0 = this;
                                presentFragment(w91Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                D4(view);
                                return false;
                            }
                            if (!this.actionBar.x() || !v4(dialog)) {
                                g5(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.n2) {
                        E4(view, i7, dk0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.g6) || mm0Var.N(i7)) ? 0L : ((org.telegram.ui.Cells.g6) view).getDialogId();
                    if (dialogId != 0) {
                        g5(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // te.b
    public final void G(float f10, int i7) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i7 != 3 || (q0Var = this.m0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) q0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (org.telegram.messenger.bz.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.ri.d0(this.currentAccount).E;
            String q02 = PremiumPreviewFragment.q0(2);
            if (tL_help_premiumPromo != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_help_premiumPromo.video_sections.size()) {
                        i10 = -1;
                        break;
                    } else if (tL_help_premiumPromo.video_sections.get(i10).equals(q02)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    org.telegram.messenger.w7.G(this.currentAccount).W(tL_help_premiumPromo.videos.get(i10), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void G3() {
        ax axVar;
        float e42 = e4(true);
        qw qwVar = this.A0;
        if (qwVar != null) {
            boolean z10 = qwVar.getAlpha() != e42;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.A0.setAlpha(e42);
            this.A0.setScaleX(T1);
            this.A0.setScaleY(T1);
            this.A0.setVisibility(e42 > 0.0f ? 0 : 8);
            if (z10 && (axVar = this.f0[0]) != null) {
                axVar.a.requestLayout();
            }
        }
        m5();
    }

    public final void G4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.i10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(23));
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, view);
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.k();
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
                int i11 = org.telegram.ui.ActionBar.n6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.n6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.i10.i(intValue).f();
                org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                a9Var.r(f10);
                hi.y3 y3Var = new hi.y3(this, getParentActivity(), z10);
                linearLayout.addView(y3Var, c8.na.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z10) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                p9Var.getImageReceiver().d = intValue;
                p9Var.f(f10, a9Var);
                y3Var.addView(p9Var, c8.na.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.n10.q(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.na.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.k5(this, intValue, I, 17));
                I.r(linearLayout, c8.na.o(org.telegram.messenger.ks.G3, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
        I.z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        I.X(d02);
        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void H3() {
        float f10 = this.n.e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        oi.w1 w1Var = this.E1;
        if (w1Var != null) {
            w1Var.setScaleX(T1);
            this.E1.setScaleY(T1);
            this.E1.setAlpha(f10);
            this.E1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            this.A1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.A1.getFadeView().setAlpha(f10);
            this.A1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final boolean H4(ax axVar, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat c12;
        if (axVar != null && dialog != null) {
            if (!getMessagesController().G7.containsKey(Long.valueOf(dialog.id))) {
                if (y4(axVar)) {
                    return true;
                }
                org.telegram.messenger.ro h42 = h4(axVar);
                if (h42 != null) {
                    int i7 = h42.g;
                    int i10 = org.telegram.messenger.mp.I8;
                    if ((i7 & 64) != 0) {
                        int i11 = this.currentAccount;
                        long j3 = dialog.id;
                        if (org.telegram.messenger.n5.C(j3) && (c12 = org.telegram.messenger.mp.u1(i11).c1(Integer.valueOf((int) (4294967295L & j3)))) != null) {
                            j3 = c12.user_id;
                        }
                        if (!h42.h.contains(Long.valueOf(j3))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        float f10 = 1.0f - this.b.e;
        float i42 = 1.0f - i4();
        org.telegram.ui.Components.a10.d(this.actionBar.getBackButton(), Math.max(this.w3, f10 * i42 * (1.0f - this.c.e)));
    }

    public final boolean I4(ax axVar) {
        if (axVar == null) {
            return false;
        }
        if (y4(axVar)) {
            return true;
        }
        org.telegram.messenger.ro h42 = h4(axVar);
        if (h42 != null) {
            int i7 = h42.g;
            int i10 = org.telegram.messenger.mp.I8;
            if ((i7 & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void J3() {
        org.telegram.ui.Components.a10.d(this.h0, com.google.android.gms.internal.vision.e2.D(this.j0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - i4(), 1.0f - this.c.e));
    }

    public final void J4(int i7, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i7 == 103) {
            getMessagesController().X(1, j3, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().X(0, j3, z11);
            if (z10 && z11) {
                getMessagesController().w(j3);
            }
        } else if (org.telegram.messenger.v3.r0(chat)) {
            getMessagesController().X(0, j3, z11);
        } else {
            getMessagesController().g0(-j3, getMessagesController().c2(Long.valueOf(getUserConfig().e())), null, z11, false);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.ks.t, Long.valueOf(j3));
        }
        getMessagesController().J(this.Y2);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            pw pwVar = this.Y;
            te.a aVar = this.b;
            pwVar.setBlurredBackgroundVisibility(aVar.e);
            float a10 = a8.n7.a(aVar.e);
            org.telegram.ui.Components.p9 p9Var = this.d3;
            if (p9Var != null) {
                p9Var.setScaleX(a10);
                this.d3.setScaleY(a10);
                this.d3.setAlpha(a10);
                this.d3.setVisibility(a10 > 0.0f ? 0 : 8);
            }
            if (this.w0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.w0.setScaleX(T1);
                this.w0.setScaleY(T1);
                this.w0.setAlpha(a10);
                this.w0.setVisibility(a10 > 0.0f ? 0 : 8);
                this.x0.setAlpha(a10);
                this.x0.setVisibility(a10 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i7 == 2) {
            O3();
            Q3();
            return;
        }
        if (i7 == 3) {
            M3();
            return;
        }
        if (i7 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i7 == 5) {
            L3();
            return;
        }
        if (i7 == 6) {
            O3();
            Q3();
        } else {
            if (i7 == 7) {
                H3();
                return;
            }
            if (i7 == 8) {
                G3();
                R3();
            } else if (i7 == 9) {
                R3();
            }
        }
    }

    public final void K3() {
        org.telegram.ui.Components.a10.d(this.g0, com.google.android.gms.internal.vision.e2.D(org.telegram.messenger.bz.s.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - i4(), 1.0f - this.c.e));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void K4(java.util.ArrayList r41, int r42, boolean r43, boolean r44, java.util.HashSet r45) {
        /*
            Method dump skipped, instructions count: 2849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.K4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void L3() {
        org.telegram.ui.Components.a10.d(this.k0, com.google.android.gms.internal.vision.e2.D(this.T0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - i4(), 1.0f - this.c.e));
        sv svVar = this.F0;
        if (svVar != null) {
            svVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L4(long j3, boolean z10, org.telegram.messenger.ro roVar, int i7, boolean z11) {
        boolean z12;
        int i10;
        boolean I3;
        boolean z13;
        int i11 = (this.f0[0].s == 0 && n4() && this.f0[0].w == 2) ? 1 : 0;
        int L0 = this.f0[0].c.L0();
        if (roVar != null) {
            int i12 = roVar.j.get(j3, TLObject.FLAG_31);
            if (!z10 && i12 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i13 = -1;
        if (L0 > i11 || !z11) {
            z12 = true;
        } else {
            U4(true, true);
            z3();
            if (this.T1 != null) {
                for (int i14 = 0; i14 < this.T1.size(); i14++) {
                    if (((TLRPC.Dialog) this.T1.get(i14)).id == j3) {
                        i10 = i14;
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = false;
        }
        i10 = -1;
        if (roVar != null) {
            LongSparseIntArray longSparseIntArray = roVar.j;
            if (z10) {
                longSparseIntArray.put(j3, i7);
            } else {
                longSparseIntArray.delete(j3);
            }
            if (z11) {
                getMessagesController().D3(roVar);
            }
            I3 = true;
        } else {
            I3 = getMessagesController().I3(j3, z10, null, -1L);
        }
        if (I3) {
            if (z12) {
                if (this.T0 != 10) {
                    q4(false);
                }
                R4(true, false);
            } else {
                ArrayList d42 = d4(this.currentAccount, this.f0[0].s, this.Y2, false);
                int i15 = 0;
                while (true) {
                    if (i15 >= d42.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) d42.get(i15)).id == j3) {
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
            ArrayList arrayList = this.T1;
            if (arrayList != null && i13 >= 0 && i10 != i13) {
                arrayList.add(i13, (TLRPC.Dialog) arrayList.remove(i10));
                this.f0[0].y.D();
                this.f0[0].q(true);
                ax axVar = this.f0[0];
                axVar.c.h1((axVar.s == 0 && n4() && this.f0[0].w == 2) ? 1 : 0, (int) this.O);
            } else if (i13 >= 0 && i10 == i13) {
                org.telegram.messenger.g0.h3(new fu(this, 21), 200L);
            }
            z13 = true;
            if (z13) {
                U4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    public final void M3() {
        org.telegram.ui.Components.a10.d(this.m0, com.google.android.gms.internal.vision.e2.D(this.b.e, 1.0f - i4(), 1.0f - this.c.e, this.d.e));
    }

    public final void M4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ks.K2));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        N3();
    }

    public final void N3() {
        tv tvVar;
        boolean z10 = !this.l2 && ((tvVar = this.L0) == null || tvVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8);
        f fVar = this.K3;
        if (fVar != null) {
            ((le0) fVar.b).w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        ax[] axVarArr = this.f0;
        if (axVarArr != null && !this.U1) {
            for (ax axVar : axVarArr) {
                if (axVar.getVisibility() == 0) {
                    if (z10) {
                        dv dvVar = axVar.y;
                        dvVar.D();
                        dvVar.A = true;
                    }
                    axVar.q(z10);
                    C3(axVar);
                }
            }
        }
        qw qwVar = this.A0;
        if (qwVar == null || qwVar.getVisibility() != 0) {
            return;
        }
        this.A0.d();
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.a10.d(this.l0, (1.0f - this.b.e) * (1.0f - i4()) * (1.0f - this.c.e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(ax axVar) {
        int i7;
        if (axVar.getVisibility() != 0) {
            return;
        }
        int i10 = axVar.d.w;
        if (axVar.s == 0 && n4() && axVar.a.getChildCount() == 0 && axVar.w == 2) {
            ((v4.c0) axVar.a.getLayoutManager()).h1(1, (int) this.O);
        }
        axVar.d.getClass();
        axVar.d.V();
        int b10 = axVar.d.b();
        if (b10 == 1 && i10 == 1 && axVar.d.d(0) == 5) {
            axVar.q(true);
        } else {
            axVar.q(false);
            if (b10 > i10 && (i7 = this.T0) != 11 && i7 != 12 && i7 != 13) {
                axVar.E.b(i10);
            }
        }
        try {
            axVar.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? axVar.x : null);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(axVar);
    }

    public final void P3() {
        String N0 = org.telegram.messenger.gd.N0(i4() > 0.5f ? 2131745510 : 2131745617, null);
        this.Y.r.setContentDescription(N0);
        this.Y.r.setHint(N0);
    }

    public final void P4() {
        boolean z10;
        if (this.O == 0.0f || (z10 = this.L)) {
            return;
        }
        float f10 = z10 ? -g4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f10));
        animatorSet.setInterpolator(org.telegram.ui.Components.kr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void Q3() {
        if (this.Y == null) {
            return;
        }
        float a10 = 1.0f - c8.m9.a(((-this.O) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = (this.T0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.w3, this.h.e)) * Math.max(this.b.e, (1.0f - i4()) * a10);
        this.Y.setAlpha(max);
        this.Y.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4(int i7) {
        org.telegram.ui.Components.lz lzVar;
        if (this.A0 == null) {
            q5(true, true);
            if (this.A0 == null) {
                return;
            }
        }
        int tabsCount = this.A0.getTabsCount() - 1;
        ArrayList V0 = getMessagesController().V0();
        int i10 = 0;
        while (true) {
            if (i10 >= V0.size()) {
                break;
            }
            if (((org.telegram.messenger.ro) V0.get(i10)).a == i7) {
                tabsCount = i10;
                break;
            }
            i10++;
        }
        qw qwVar = this.A0;
        if (tabsCount < 0) {
            qwVar.getClass();
        } else if (tabsCount < qwVar.getTabsCount()) {
            lzVar = (org.telegram.ui.Components.lz) qwVar.h.get(tabsCount);
            if (lzVar != null) {
                qw qwVar2 = this.A0;
                ArrayList arrayList = qwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                qwVar2.g((org.telegram.ui.Components.lz) i5.c.h(1, arrayList), arrayList.size() - 1);
                return;
            }
            ax[] axVarArr = this.f0;
            if (axVarArr == null || axVarArr.length <= 0 || axVarArr[0].h != lzVar.a) {
                this.A0.g(lzVar, tabsCount);
                return;
            }
            return;
        }
        lzVar = null;
        if (lzVar != null) {
        }
    }

    public final void R3() {
        if (this.a0 != null) {
            float f10 = (this.b0 != null ? 1.0f : 0.0f) * this.b.e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f10);
            this.a0.setScaleX(T1);
            this.a0.setScaleY(T1);
            this.a0.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.j71 j71Var = this.b0;
        te.a aVar = this.s;
        if (j71Var != null) {
            float f11 = 1.0f - aVar.e;
            j71Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        jg.q0 q0Var = this.c0;
        if (q0Var != null) {
            float f12 = aVar.e;
            q0Var.setAlpha(f12);
            this.c0.setVisibility(f12 > 0.0f ? 0 : 8);
        }
    }

    public final void R4(boolean z10, boolean z11) {
        wv wvVar = this.H3;
        if (wvVar == null || !wvVar.c()) {
            int i7 = (this.f0[0].s == 0 && n4() && this.f0[0].w == 2) ? 1 : 0;
            int i10 = (!this.L || z11 || this.F0.g()) ? 0 : -org.telegram.messenger.g0.L(81.0f);
            if (!z10) {
                this.f0[0].c.h1(i7, i10);
                P4();
            } else {
                org.telegram.ui.ActionBar.l5 l5Var = this.f0[0].r;
                l5Var.b = 1;
                l5Var.k(i7, i10, false, false);
                P4();
            }
        }
    }

    public final void S3(boolean z10) {
        if (this.D0 == null || this.actionBar == null) {
            return;
        }
        int i7 = org.telegram.messenger.g0.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.a) + (this.b0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        org.telegram.ui.Components.bs bsVar = this.L1;
        int d = measuredHeight + (bsVar != null ? (int) bsVar.d(org.telegram.messenger.g0.L(7.0f)) : 0);
        jw jwVar = this.D0;
        SparseArray sparseArray = jwVar.h;
        jwVar.X0 = d;
        jwVar.Y0 = i7;
        di.b1 b1Var = jwVar.b0;
        if (z10) {
            b1Var.q1(0, d, 0, i7);
        } else {
            b1Var.setPadding(0, d, 0, i7);
        }
        jwVar.P0.j(jwVar.X0, jwVar.Y0, z10);
        org.telegram.ui.Components.gm0 gm0Var = jwVar.c0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gm0Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = jwVar.X0;
        if (i10 != i11 || marginLayoutParams.bottomMargin != jwVar.Y0) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = jwVar.Y0;
            gm0Var.requestLayout();
        }
        org.telegram.ui.Components.tm0.O(jwVar.i0, jwVar.l0, jwVar.X0, jwVar.Y0, z10);
        org.telegram.ui.Components.tm0.O(jwVar.n0, jwVar.q0, jwVar.X0, jwVar.Y0, z10);
        org.telegram.ui.Components.tm0.O(jwVar.u0, jwVar.x0, jwVar.X0, jwVar.Y0, z10);
        org.telegram.ui.Components.nf0 nf0Var = jwVar.s0;
        int i12 = jwVar.X0;
        int i13 = jwVar.Y0;
        nf0Var.setClipToPadding(false);
        org.telegram.ui.Components.g51 g51Var = nf0Var.c;
        nf0Var.K = z10;
        nf0Var.setPadding(0, i12, 0, i13);
        if (z10) {
            g51Var.q1(0, i12, 0, i13);
        } else {
            g51Var.setPadding(0, i12, 0, i13);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g51Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i12;
        marginLayoutParams2.bottomMargin = -i13;
        nf0Var.K = false;
        org.telegram.ui.Components.sl0 sl0Var = jwVar.J0;
        if (sl0Var != null) {
            sl0Var.b(jwVar.X0, jwVar.Y0, z10);
        }
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) sparseArray.valueAt(i14);
            if (view instanceof b00) {
                ((b00) view).j(jwVar.X0, jwVar.Y0, z10);
            }
        }
        for (int i15 = 0; i15 < jwVar.getChildCount(); i15++) {
            if (jwVar.getChildAt(i15) instanceof b00) {
                ((b00) jwVar.getChildAt(i15)).j(jwVar.X0, jwVar.Y0, z10);
            }
        }
    }

    public final void S4(String str, boolean z10) {
        i5(true, false, true, false);
        bg.p0 p0Var = this.Z;
        if (p0Var != null) {
            p0Var.b(true);
        }
        pw pwVar = this.Y;
        if (pwVar != null) {
            pwVar.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void T3() {
        if (this.L1 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(T1);
            this.L1.setScaleY(T1);
            this.L1.setVisibility(0);
        }
    }

    public final void T4(float f10) {
        this.d0 = f10;
        for (ax axVar : this.f0) {
            xw xwVar = axVar.a;
            for (int i7 = 0; i7 < xwVar.getChildCount(); i7++) {
                View childAt = xwVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= axVar.d.f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public boolean U3() {
        return this.T0 == 10;
    }

    public final void U4(boolean z10, boolean z11) {
        if (this.f0 == null || this.U1 == z10) {
            return;
        }
        if (z10) {
            this.T1 = new ArrayList(d4(this.currentAccount, this.f0[0].s, this.Y2, false));
        } else {
            this.T1 = null;
        }
        this.U1 = z10;
        ax axVar = this.f0[0];
        axVar.d.H = z10;
        if (z10 || !z11) {
            return;
        }
        if (axVar.a.c0()) {
            this.f0[0].a.post(new yu(this, 5));
        } else {
            this.f0[0].d.f();
        }
    }

    public final void V3() {
        if (!org.telegram.messenger.g0.Q1()) {
            this.X1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.n(true);
        }
        TLObject tLObject = this.Z1;
        if (tLObject != null) {
            jw jwVar = this.D0;
            if (jwVar != null) {
                jwVar.e0.Q(this.Y1, tLObject);
            }
            this.Z1 = null;
        }
    }

    public final void V4(boolean z10) {
        ax axVar;
        if (org.telegram.messenger.bz.o() <= 1 || !org.telegram.messenger.pc.e(32768)) {
            return;
        }
        if (z10) {
            ax[] axVarArr = this.f0;
            if (axVarArr != null && (axVar = axVarArr[0]) != null) {
                axVar.setLayerType(2, null);
                this.f0[0].setClipChildren(false);
                this.f0[0].setClipToPadding(false);
                this.f0[0].a.setClipChildren(false);
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
        if (this.f0 != null) {
            int i7 = 0;
            while (true) {
                ax[] axVarArr2 = this.f0;
                if (i7 >= axVarArr2.length) {
                    break;
                }
                ax axVar2 = axVarArr2[i7];
                if (axVar2 != null) {
                    axVar2.setLayerType(0, null);
                    axVar2.setClipChildren(true);
                    axVar2.setClipToPadding(true);
                    axVar2.a.setClipChildren(true);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        sv svVar = this.F0;
        if (svVar != null) {
            svVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void W3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.o0) {
            return;
        }
        kVar.n(true);
        this.s3 = false;
        q5(true, true);
    }

    public final void W4(float f10) {
        ax[] axVarArr = this.f0;
        if (axVarArr != null) {
            int paddingTop = axVarArr[0].a.getPaddingTop() + ((int) f10);
            int i7 = 0;
            while (true) {
                ax[] axVarArr2 = this.f0;
                if (i7 >= axVarArr2.length) {
                    break;
                }
                axVarArr2[i7].a.setTopGlowOffset(paddingTop);
                i7++;
            }
        }
        if (this.fragmentView == null || f10 == this.O) {
            return;
        }
        this.O = f10;
        org.telegram.ui.Components.fc fcVar = this.q3;
        if (fcVar != null) {
            fcVar.l();
        }
        if (this.G3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.G3;
            float f11 = (int) f10;
            float f12 = oVar.f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.G3.setAlpha(c8.m9.a(currentActionBarHeight, 0.0f, 1.0f));
            this.G3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        Q3();
        this.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.g2, org.telegram.ui.ke0
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        wv wvVar;
        tv tvVar;
        qw qwVar;
        if (!this.s3 && (((wvVar = this.H3) == null || !wvVar.c()) && (((tvVar = this.L0) == null || tvVar.getVisibility() != 0) && ((qwVar = this.A0) == null || !qwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qw qwVar2 = this.A0;
                boolean z11 = qwVar2 == null || qwVar2.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getFirstTabId();
                qw qwVar3 = this.A0;
                boolean z12 = qwVar3 == null || qwVar3.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getLastTabId();
                org.telegram.messenger.bz.m(this.currentAccount);
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

    public final void X3(String str) {
        if (this.actionBar.c(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(str);
        boolean z10 = this.X;
        int i7 = 1;
        ArrayList arrayList = this.k1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
            org.telegram.ui.ActionBar.u6.s(this.i1, org.telegram.ui.ActionBar.n6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i10 = org.telegram.ui.ActionBar.n6.z8;
            org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), getResourceProvider());
            this.i1.setOnClickListener(new hu(this, 6));
            p10.addView(this.i1, c8.na.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.j1 = numberTextView;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(org.telegram.messenger.g0.o());
        this.j1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.y8));
        p10.addView(this.j1, c8.na.m(1.0f, 0, -1, this.X ? 18 : 72, 0, 0));
        this.j1.setOnTouchListener(new gi.a(2));
        this.m1 = p10.g(100, R.drawable.msg_pin, org.telegram.messenger.g0.L(48.0f));
        this.n1 = p10.g(org.telegram.messenger.ks.p1, R.drawable.msg_mute, org.telegram.messenger.g0.L(48.0f));
        this.o1 = p10.g(org.telegram.messenger.ks.s1, R.drawable.msg_archive, org.telegram.messenger.g0.L(48.0f));
        this.l1 = p10.h(org.telegram.messenger.ks.n1, R.drawable.msg_delete, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.gd.N0(2131751586, null));
        org.telegram.ui.ActionBar.q0 h = p10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.gd.N0(2131754838, null));
        p10.addView(new View(getParentActivity()), c8.na.o(5, -1));
        this.s1 = h.e(org.telegram.messenger.ks.q1, R.drawable.msg_archive, org.telegram.messenger.gd.N0(2131754169, null));
        this.p1 = h.e(org.telegram.messenger.ks.t1, R.drawable.msg_pin, org.telegram.messenger.gd.N0(2131751441, null));
        this.q1 = h.e(org.telegram.messenger.ks.u1, R.drawable.msg_addfolder, org.telegram.messenger.gd.N0(2131750800, null));
        this.r1 = h.e(org.telegram.messenger.ks.v1, R.drawable.msg_removefolder, org.telegram.messenger.gd.N0(2131750698, null));
        this.u1 = h.e(101, R.drawable.msg_markread, org.telegram.messenger.gd.N0(2131748488, null));
        this.t1 = h.e(org.telegram.messenger.ks.o1, R.drawable.msg_clear, org.telegram.messenger.gd.N0(2131752077, null));
        this.v1 = h.e(org.telegram.messenger.ks.r1, R.drawable.msg_block, org.telegram.messenger.gd.N0(2131753689, null));
        this.n1.setOnLongClickListener(new pu(this, i7));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        n5(false);
    }

    public final void X4(float f10) {
        this.z1 = f10;
        v5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.bz.o() != 0) {
            org.telegram.messenger.pc.e(32768);
        }
        m5();
    }

    public final void Y3() {
        jw jwVar = this.D0;
        if ((jwVar != null && jwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        jw jwVar2 = new jw(this, getParentActivity(), this, this.p2 != null ? 2 : !this.n2 ? 1 : 0, this.T0, this.Y2, this.a3, new gv(this));
        this.D0 = jwVar2;
        this.glassEngine.c(jwVar2);
        ((uw) this.fragmentView).addView(this.D0, this.C0);
        jw jwVar3 = this.D0;
        jwVar3.e0.V = new lw(this);
        jwVar3.l0.setOnItemClickListener(new iu(this, 1));
        this.D0.q0.setOnItemClickListener(new iu(this, 2));
        this.D0.x0.setOnItemClickListener(new lu(this, 0));
        this.D0.q0.setOnItemLongClickListener(new iu(this, 3));
        this.D0.b0.setOnItemClickListener(new iu(this, 4));
        this.D0.b0.setOnItemLongClickListener(new gv(this));
        this.D0.setFilteredSearchViewDelegate(new iu(this, 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.t4);
    }

    public final void Y4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.G2 = null;
            this.H2 = null;
            return;
        }
        this.G2 = str;
        this.H2 = null;
        this.F2 = null;
        if (this.D1 != null) {
            v3(charSequence);
        } else {
            this.Z3 = charSequence;
        }
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new fw(this, parentActivity);
                FrameLayout.LayoutParams d = c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.k4 + this.m4 + d.bottomMargin;
                uw uwVar = (uw) this.fragmentView;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.y0 + 1;
                this.y0 = i10;
                uwVar.addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(float f10) {
        if (org.telegram.messenger.bz.o() <= 0) {
            boolean z10 = org.telegram.messenger.s2.a;
            return;
        }
        if (this.b4 == f10) {
            return;
        }
        boolean z11 = true;
        if (org.telegram.messenger.bz.o() > 1 && org.telegram.messenger.pc.e(32768)) {
            z11 = false;
        }
        this.c4 = z11;
        this.b4 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.c4) {
            float f11 = (1.0f - this.b4) * (-org.telegram.messenger.g0.L(40.0f));
            sv svVar = this.F0;
            if (svVar != null) {
                svVar.setTranslationX(f11);
            }
            pw pwVar = this.Y;
            if (pwVar != null) {
                pwVar.setTranslationX(f11);
            }
            wv wvVar = this.H3;
            if (wvVar == null || wvVar.getFragmentView() == null || this.E) {
                return;
            }
            this.H3.getFragmentView().setTranslationX(f11);
            return;
        }
        float f12 = -org.telegram.messenger.g0.L(4.0f);
        float f13 = 1.0f - this.b4;
        float f14 = f12 * f13;
        float f15 = 1.0f - (f13 * 0.05f);
        sv svVar2 = this.F0;
        if (svVar2 != null) {
            svVar2.setScaleX(f15);
            this.F0.setScaleY(f15);
            this.F0.setTranslationX(f14);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(0.0f);
        }
        pw pwVar2 = this.Y;
        if (pwVar2 != null) {
            pwVar2.setTranslationX(f14);
            this.Y.setScaleX(f15);
            this.Y.setScaleY(f15);
        }
        wv wvVar2 = this.H3;
        if (wvVar2 == null || wvVar2.getFragmentView() == null) {
            return;
        }
        if (!this.E) {
            this.H3.getFragmentView().setScaleX(f15);
            this.H3.getFragmentView().setScaleY(f15);
            this.H3.getFragmentView().setTranslationX(f14);
        }
        this.H3.getFragmentView().setPivotX(0.0f);
        this.H3.getFragmentView().setPivotY(0.0f);
    }

    public final void a4(final long j3, final long j10, boolean z10, final w91 w91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String N0;
        String b02;
        String N02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.T0;
            if (i7 == 11 || i7 == 12 || i7 == 13) {
                if (org.telegram.messenger.n5.E(j3)) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
                    if (!c22.mutual_contact) {
                        UndoView l42 = l4();
                        if (l42 != null) {
                            l42.j(45, j3, null);
                            return;
                        }
                        return;
                    }
                    user = c22;
                    chat = null;
                } else {
                    TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                    if (!org.telegram.messenger.v3.N(O0) || !org.telegram.messenger.v3.w(1, O0)) {
                        UndoView l43 = l4();
                        if (l43 != null) {
                            l43.j(46, j3, null);
                            return;
                        }
                        return;
                    }
                    chat = O0;
                    user = null;
                }
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().l1(j3);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new di.k3(this, t1Var, user, chat, j3, tL_messages_checkHistoryImportPeer));
                try {
                    t1Var.r(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z10 || ((this.h2 == null || this.i2 == null) && this.j2 == null)) {
                if (i7 != 15) {
                    if (this.E2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.sr.a(j3, j10));
                    if (this.E2.z(this, arrayList, null, false, this.L2, this.M2, this.N2, w91Var) && this.k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                }
                Runnable s2Var = new bi.s2(this, j3, new d3.e0(this, j3, j10, w91Var, 7), 27);
                if (j3 < 0) {
                    k5(getMessagesController().O0(Long.valueOf(-j3)), s2Var, null);
                    return;
                }
                TLRPC.User c23 = getMessagesController().c2(Long.valueOf(j3));
                TLRPC.User c24 = getMessagesController().c2(Long.valueOf(this.I));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a02 = org.telegram.messenger.gd.a0(null, null, 2131754071, org.telegram.messenger.n10.k(c23, true), org.telegram.messenger.n10.k(c24, true));
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = a02;
                t1Var2.U = TextUtils.concat(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754072, org.telegram.messenger.n10.k(c23, true), org.telegram.messenger.n10.k(c24, true))));
                alertDialog$Builder.k(org.telegram.messenger.gd.a0("Send", null, 2131745444, new Object[0]), new zr(s2Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.a0("Cancel", null, 2131752577, new Object[0]), new org.telegram.ui.Components.ub0(23));
                showDialog(t1Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (org.telegram.messenger.n5.C(j3)) {
                TLRPC.User c25 = getMessagesController().c2(Long.valueOf(getMessagesController().c1(Integer.valueOf((int) (4294967295L & j3))).user_id));
                if (c25 == null) {
                    return;
                }
                N0 = org.telegram.messenger.gd.N0(2131745400, null);
                b02 = org.telegram.messenger.gd.b0(this.h2, org.telegram.messenger.n10.q(c25));
                N02 = org.telegram.messenger.gd.N0(2131745444, null);
            } else if (!org.telegram.messenger.n5.E(j3)) {
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(-j3));
                if (O02 == null) {
                    return;
                }
                String str = O02.title;
                if (j10 != 0 && (f10 = getMessagesController().t7.f(O02.id, j10)) != null) {
                    str = ((Object) str) + " " + f10.title;
                }
                if (this.j2 != null) {
                    N0 = org.telegram.messenger.gd.N0(2131754363, null);
                    b02 = org.telegram.messenger.gd.b0(this.j2, str);
                    N02 = org.telegram.messenger.gd.N0(2131754483, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131745400, null);
                    b02 = org.telegram.messenger.gd.b0(this.i2, str);
                    N02 = org.telegram.messenger.gd.N0(2131745444, null);
                }
            } else if (j3 == getUserConfig().e()) {
                N0 = org.telegram.messenger.gd.N0(2131745400, null);
                b02 = org.telegram.messenger.gd.b0(this.i2, org.telegram.messenger.gd.N0(2131745705, null));
                N02 = org.telegram.messenger.gd.N0(2131745444, null);
            } else {
                TLRPC.User c26 = getMessagesController().c2(Long.valueOf(j3));
                if (c26 == null || this.h2 == null) {
                    return;
                }
                N0 = org.telegram.messenger.gd.N0(2131745400, null);
                b02 = org.telegram.messenger.gd.b0(this.h2, org.telegram.messenger.n10.q(c26));
                N02 = org.telegram.messenger.gd.N0(2131745444, null);
            }
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
            t1Var3.S = N0;
            t1Var3.U = org.telegram.messenger.g0.W2(b02);
            alertDialog$Builder2.k(N02, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.bv
                @Override // org.telegram.ui.ActionBar.q1
                public final void i(org.telegram.ui.ActionBar.t1 t1Var4, int i10) {
                    bx.this.a4(j3, j10, false, w91Var);
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            if (showDialog(t1Var3) == null) {
                t1Var3.show();
            }
        }
    }

    public final void a5() {
        getContactsController().B();
        org.telegram.ui.Components.t6 t6Var = new org.telegram.ui.Components.t6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.o(10, this, r1), new ch(r1, 17));
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(getParentActivity(), false, 1, getResourceProvider());
        j3.O = t6Var;
        j3.V0 = 49;
        j3.show();
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        j3.Q(org.telegram.ui.ActionBar.n6.h5);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.cl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.bl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
    }

    public final void b4(long j3, boolean z10) {
        if (this.f0 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            ax[] axVarArr = this.f0;
            if (i7 >= axVarArr.length) {
                return;
            }
            int childCount = axVarArr[i7].a.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f0[i7].a.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.u2) {
                        org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                        if (u2Var.getDialogId() == j3) {
                            u2Var.e0(z10, true);
                            break;
                        }
                    }
                    i10++;
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0132, code lost:
    
        if ((r3.size() + r9.h.size()) > 100) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b5(org.telegram.ui.Cells.u2 u2Var) {
        long j3;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        int i7;
        boolean z10;
        int i10;
        LinearLayout linearLayout;
        bx bxVar;
        char c10;
        long j10;
        org.telegram.messenger.ro roVar;
        boolean[] zArr;
        ?? r52;
        bx bxVar2;
        long j11;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        final long j12;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.y0 y0Var;
        boolean z12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        bi.m6 m6Var;
        char c11;
        final bx bxVar3 = this;
        boolean Y = org.telegram.messenger.v3.Y(u2Var.h2);
        if (!u2Var.X()) {
            long dialogId = u2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = u2Var.getMessageId();
            if (!org.telegram.messenger.n5.C(dialogId)) {
                if (org.telegram.messenger.n5.E(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (bxVar3.a3 == 0 || ((b10 = li.k0.b(bxVar3.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat O0 = bxVar3.getMessagesController().O0(Long.valueOf(-dialogId));
                    if (messageId == 0 || O0 == null || O0.migrated_to == null) {
                        j3 = dialogId;
                    } else {
                        bundle.putLong("migrated_to", dialogId);
                        j3 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -j3);
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                boolean z13 = bxVar3.a3 == 0 && bxVar3.getMessagesController().H3 && bxVar3.getMessagesController().V0 && bxVar3.getMessagesController().Q0 != null && bxVar3.getMessagesController().Q0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                int i17 = 2;
                if (z13) {
                    LinearLayout linearLayout2 = new LinearLayout(bxVar3.getParentActivity());
                    linearLayout2.setOrientation(1);
                    bi.m6 m6Var2 = new bi.m6(bxVar3.getParentActivity(), i17);
                    LinearLayout linearLayout3 = new LinearLayout(bxVar3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    m6Var2.addView(linearLayout3);
                    int size = bxVar3.getMessagesController().Q0.size();
                    int i18 = 0;
                    org.telegram.ui.ActionBar.y0 y0Var2 = null;
                    while (i18 < size) {
                        final org.telegram.messenger.ro roVar2 = (org.telegram.messenger.ro) bxVar3.getMessagesController().Q0.get(i18);
                        if (roVar2.d()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            c11 = 'd';
                        } else {
                            final boolean a10 = roVar2.a(org.telegram.messenger.c.a(bxVar3.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            final ArrayList K0 = org.telegram.ui.Components.pz.K0(bxVar3, roVar2, arrayList, true, false);
                            if (!a10) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(2, bxVar3.getParentActivity(), null, false, false);
                            y0Var3.setChecked(a10);
                            i15 = size;
                            i16 = i18;
                            Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar2.b, y0Var3.getTextView().getPaint().getFontMetricsInt(), false, null, 0), roVar2.c, y0Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            y0Var3.setEmojiCacheType(roVar2.n ? 26 : 0);
                            y0Var3.j(B5, 0, new org.telegram.ui.Components.h00(bxVar3.getParentActivity(), R.drawable.msg_folders, roVar2.m));
                            y0Var3.getTextView().setEmojiColor(bxVar3.getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                            y0Var3.setMinimumWidth(org.telegram.messenger.ks.q2);
                            y0Var = y0Var3;
                            z12 = Y;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            m6Var = m6Var2;
                            dialogId = j12;
                            y0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nu
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j13;
                                    org.telegram.messenger.ro roVar3;
                                    bx bxVar4 = bx.this;
                                    bxVar4.getClass();
                                    boolean z14 = a10;
                                    ArrayList arrayList3 = K0;
                                    org.telegram.messenger.ro roVar4 = roVar2;
                                    long j14 = j12;
                                    if (z14) {
                                        roVar4.h.remove(Long.valueOf(j14));
                                        roVar4.i.add(Long.valueOf(j14));
                                        jz.z0(roVar4, roVar4.g, roVar4.b, roVar4.c, roVar4.n, roVar4.m, roVar4.h, roVar4.i, roVar4.j, false, false, true, true, false, bxVar4, null);
                                        bxVar4.l4().k(j14, 21, Integer.valueOf(arrayList3.size()), roVar4, null, null);
                                    } else {
                                        if (arrayList3.isEmpty()) {
                                            arrayList2 = arrayList3;
                                            j13 = j14;
                                            roVar3 = roVar4;
                                        } else {
                                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                                roVar4.i.remove(arrayList3.get(i19));
                                            }
                                            roVar4.h.addAll(arrayList3);
                                            arrayList2 = arrayList3;
                                            roVar3 = roVar4;
                                            j13 = j14;
                                            jz.z0(roVar3, roVar4.g, roVar4.b, roVar4.c, roVar4.n, roVar4.m, roVar4.h, roVar4.i, roVar4.j, false, false, true, true, false, bxVar4, null);
                                        }
                                        bxVar4.l4().k(j13, 20, Integer.valueOf(arrayList2.size()), roVar3, null, null);
                                    }
                                    bxVar4.p4(true);
                                    bxVar4.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(y0Var);
                            i18 = i16 + 1;
                            bxVar3 = this;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            m6Var2 = m6Var;
                            Y = z12;
                            size = i15;
                            y0Var2 = y0Var;
                        }
                        i16 = i18;
                        m6Var = m6Var2;
                        z12 = Y;
                        y0Var = y0Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        dialogId = j12;
                        i15 = size;
                        i18 = i16 + 1;
                        bxVar3 = this;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        m6Var2 = m6Var;
                        Y = z12;
                        size = i15;
                        y0Var2 = y0Var;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    bi.m6 m6Var3 = m6Var2;
                    z10 = Y;
                    org.telegram.ui.ActionBar.y0 y0Var4 = y0Var2;
                    i10 = 8;
                    i7 = 2;
                    if (y0Var4 != null) {
                        y0Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        z13 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    } else {
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.n6.H8, getParentActivity(), getResourceProvider());
                        d1Var.setTag(R.id.fit_width_tag, 1);
                        org.telegram.ui.ActionBar.y0 y0Var5 = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
                        y0Var5.j(org.telegram.messenger.gd.N0(2131753753, null), R.drawable.ic_ab_back, null);
                        y0Var5.setMinimumWidth(org.telegram.messenger.ks.q2);
                        y0Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                        linearLayout2.addView(y0Var5);
                        linearLayout2.addView(d1Var, c8.na.o(-1, 8));
                        linearLayout2.addView(m6Var3);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i7 = 2;
                    z10 = Y;
                    i10 = 8;
                    linearLayout = null;
                }
                org.telegram.ui.ActionBar.g2[] g2VarArr = new org.telegram.ui.ActionBar.g2[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z13 ? 3 : i7, getParentActivity(), getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z13) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    org.telegram.ui.ActionBar.y0 y0Var6 = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
                    y0Var6.j(org.telegram.messenger.gd.N0(2131750800, null), R.drawable.msg_addfolder, null);
                    y0Var6.setMinimumWidth(org.telegram.messenger.ks.q2);
                    y0Var6.setOnClickListener(new org.telegram.ui.Components.p31(11, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new zr(g2VarArr, 4));
                }
                if (z10) {
                    bxVar = this;
                    c10 = 0;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var7 = new org.telegram.ui.ActionBar.y0(getParentActivity(), !z13, false);
                    if (u2Var.getHasUnread()) {
                        y0Var7.j(org.telegram.messenger.gd.N0(2131748488, null), R.drawable.msg_markread, null);
                    } else {
                        y0Var7.j(org.telegram.messenger.gd.N0(2131748487, null), R.drawable.msg_markunread, null);
                    }
                    y0Var7.setMinimumWidth(org.telegram.messenger.ks.q2);
                    bxVar = this;
                    long j13 = dialogId;
                    dialogId = j13;
                    y0Var7.setOnClickListener(new di.d3(bxVar, u2Var, j13, 5));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var7);
                }
                boolean[] zArr2 = new boolean[1];
                zArr2[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
                int i19 = bxVar.f0[c10].s;
                boolean z14 = (i19 == 7 || i19 == i10) && (!bxVar.actionBar.x() || bxVar.actionBar.y(null));
                if (z14) {
                    j10 = dialogId;
                    roVar = bxVar.getMessagesController().N[bxVar.f0[0].s == i10 ? (char) 1 : (char) 0];
                } else {
                    j10 = dialogId;
                    roVar = null;
                }
                if (bxVar.v4(dialog)) {
                    zArr = zArr2;
                    r52 = 0;
                } else {
                    ArrayList Y0 = bxVar.getMessagesController().Y0(bxVar.Y2);
                    int size2 = Y0.size();
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        if (i20 >= size2) {
                            zArr = zArr2;
                            z11 = z14;
                            break;
                        }
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) Y0.get(i20);
                        ArrayList arrayList2 = Y0;
                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            zArr = zArr2;
                        } else if (bxVar.v4(dialog2)) {
                            zArr = zArr2;
                            if (org.telegram.messenger.n5.C(dialog2.id)) {
                                i22++;
                            } else {
                                i21++;
                            }
                        } else {
                            zArr = zArr2;
                            z11 = z14;
                            if (!bxVar.getMessagesController().I2(dialog2.id, false)) {
                                break;
                            }
                            i20++;
                            Y0 = arrayList2;
                            zArr2 = zArr;
                            z14 = z11;
                        }
                        z11 = z14;
                        i20++;
                        Y0 = arrayList2;
                        zArr2 = zArr;
                        z14 = z11;
                    }
                    if (dialog == null || bxVar.v4(dialog)) {
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        boolean C = org.telegram.messenger.n5.C(j10);
                        int i23 = !C ? 1 : 0;
                        if (roVar == null || !roVar.h.contains(Long.valueOf(j10))) {
                            i14 = i23;
                            i13 = C ? 1 : 0;
                            i12 = 0;
                        } else {
                            i14 = i23;
                            i13 = C ? 1 : 0;
                            i12 = 1;
                        }
                    }
                    int size3 = (!z11 || roVar == null) ? (bxVar.Y2 == 0 && roVar == null) ? bxVar.getUserConfig().q() ? bxVar.getMessagesController().N4 : bxVar.getMessagesController().M4 : bxVar.getUserConfig().q() ? bxVar.getMessagesController().o3 : bxVar.getMessagesController().n3 : 100 - roVar.h.size();
                    boolean z15 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
                    r52 = 0;
                    zArr[0] = z15;
                }
                if (zArr[r52]) {
                    org.telegram.ui.ActionBar.y0 y0Var8 = new org.telegram.ui.ActionBar.y0(bxVar.getParentActivity(), (z13 || !z10) ? r52 : true, r52);
                    if (bxVar.v4(dialog)) {
                        y0Var8.j(org.telegram.messenger.gd.N0(2131743597, null), R.drawable.msg_unpin, null);
                    } else {
                        y0Var8.j(org.telegram.messenger.gd.N0(2131747051, null), R.drawable.msg_pin, null);
                    }
                    y0Var8.setMinimumWidth(org.telegram.messenger.ks.q2);
                    long j14 = j10;
                    org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(bxVar, roVar, dialog, j14, 1);
                    bxVar2 = bxVar;
                    j11 = j14;
                    y0Var8.setOnClickListener(erVar);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var8);
                } else {
                    bxVar2 = bxVar;
                    j11 = j10;
                }
                if (org.telegram.messenger.n5.E(j11) && org.telegram.messenger.n10.C(bxVar2.getMessagesController().c2(Long.valueOf(j11)))) {
                    i11 = 0;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var9 = new org.telegram.ui.ActionBar.y0(bxVar2.getParentActivity(), false, false);
                    if (bxVar2.getMessagesController().u2(j11, 0L, null)) {
                        y0Var9.j(org.telegram.messenger.gd.N0(2131743602, null), R.drawable.msg_unmute, null);
                    } else {
                        y0Var9.j(org.telegram.messenger.gd.N0(2131748121, null), R.drawable.msg_mute, null);
                    }
                    y0Var9.setMinimumWidth(org.telegram.messenger.ks.q2);
                    y0Var9.setOnClickListener(new bi.q(bxVar2, j11, 4));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var9);
                }
                if (!z10) {
                    org.telegram.ui.ActionBar.y0 y0Var10 = new org.telegram.ui.ActionBar.y0(bxVar2.getParentActivity(), i11, true);
                    y0Var10.setIconColor(bxVar2.getThemedColor(org.telegram.ui.ActionBar.n6.p7));
                    int i24 = org.telegram.ui.ActionBar.n6.q7;
                    y0Var10.setTextColor(bxVar2.getThemedColor(i24));
                    y0Var10.h(0.12f, i24);
                    y0Var10.j(org.telegram.messenger.gd.N0(2131751586, null), R.drawable.msg_delete, null);
                    y0Var10.setMinimumWidth(org.telegram.messenger.ks.q2);
                    y0Var10.setOnClickListener(new org.telegram.ui.Components.p31(12, bxVar2, arrayList));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var10);
                }
                int i25 = org.telegram.messenger.ks.t;
                if (z10) {
                    if (bxVar2.p2 != null) {
                        bxVar2.getNotificationCenter().k(i25, new Object[i11]);
                    }
                    bxVar2.M4();
                    bxVar2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j11);
                    bx bxVar4 = new bx(bundle2);
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        g2VarArr[0] = bxVar4;
                        bxVar2.presentFragmentAsPreview(bxVar4);
                        return false;
                    }
                    g2VarArr[0] = bxVar4;
                    bxVar2.presentFragmentAsPreviewWithMenu(bxVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!bxVar2.getMessagesController().E(bundle, bxVar2, null, null)) {
                    return i11;
                }
                if (bxVar2.p2 != null) {
                    bxVar2.getNotificationCenter().k(i25, new Object[i11]);
                }
                bxVar2.M4();
                bxVar2.parentLayout.setHighlightActionButtons(true);
                bn bnVar = new bn(bundle);
                Point point2 = org.telegram.messenger.g0.q;
                if (point2.x > point2.y) {
                    g2VarArr[0] = bnVar;
                    bxVar2.presentFragmentAsPreview(bnVar);
                    return true;
                }
                g2VarArr[0] = bnVar;
                bxVar2.presentFragmentAsPreviewWithMenu(bnVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                bnVar.ga = true;
                try {
                    bnVar.p1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (u2Var.getCurrentDialogFolderId() == 1) {
            D4(u2Var);
            return false;
        }
        return false;
    }

    public final void c5(boolean z10) {
        int i7 = 1;
        this.c.a(z10, true);
        if (this.n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.T3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.n0.setVisibility(0);
        } else {
            this.n0.setSelected(false);
            Drawable background = this.n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.n0, (Property<org.telegram.ui.ActionBar.q0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.T3.playTogether(arrayList);
        this.T3.addListener(new cw(this, z10, i7));
        this.T3.start();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        qw qwVar;
        if (this.H3.c()) {
            return false;
        }
        return this.T0 != 3 || (qwVar = this.A0) == null || qwVar.getVisibility() != 0 || this.A0.L <= 0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean closeLastFragment() {
        if (!this.H3.c()) {
            return super.closeLastFragment();
        }
        this.H3.a();
        jw jwVar = this.D0;
        if (jwVar == null) {
            return true;
        }
        jwVar.Q();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.u7 u7Var = new org.telegram.ui.Components.u7(this, context, this.resourceProvider, 3);
        u7Var.setAllowOverlayTitle(true);
        u7Var.H0 = true;
        if (u7Var.G0 == null) {
            bi.v2 v2Var = new bi.v2(u7Var.getContext(), 7);
            u7Var.G0 = v2Var;
            u7Var.addView(v2Var);
        }
        org.telegram.ui.ActionBar.u6.l(u7Var, 3, org.telegram.ui.ActionBar.n6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.a(u7Var, org.telegram.ui.ActionBar.n6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.u6.l(u7Var, 1, org.telegram.ui.ActionBar.n6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.b(u7Var, org.telegram.ui.ActionBar.n6.y8, getResourceProvider(), true);
        if (u7Var.y1 == null) {
            fi.j jVar = new fi.j(u7Var, u7Var.getContext(), u7Var.K0, u7Var.P0);
            u7Var.y1 = jVar;
            jVar.setClipChildren(false);
            u7Var.addView(u7Var.y1);
        }
        u7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        u7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.Y2 == 0 || t4())) {
            return u7Var;
        }
        u7Var.setOccupyStatusBar(false);
        return u7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c93  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e21  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e57  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c9b  */
    /* JADX WARN: Type inference failed for: r10v24, types: [org.telegram.ui.Components.ek0, org.telegram.ui.xw] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v46, types: [org.telegram.ui.Components.ek0, org.telegram.ui.xw] */
    /* JADX WARN: Type inference failed for: r4v47, types: [org.telegram.ui.Components.ek0, org.telegram.ui.xw] */
    /* JADX WARN: Type inference failed for: r4v49, types: [org.telegram.ui.fv, v4.c0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r9v50, types: [org.telegram.ui.Components.ek0, org.telegram.ui.xw] */
    /* JADX WARN: Type inference failed for: r9v78, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f10;
        float f11;
        float f12;
        bn bnVar;
        qw qwVar;
        pw pwVar;
        pw pwVar2;
        org.telegram.ui.Components.bs bsVar;
        zw zwVar;
        v4.z zVar;
        jg.m mVar;
        jg.m mVar2;
        jg.m mVar3;
        jg.m mVar4;
        jg.m mVar5;
        jg.m mVar6;
        vw vwVar;
        int i7;
        int i10;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        Context context2 = context;
        ?? r11 = 0;
        ?? r112 = 0;
        ?? r113 = 0;
        ?? r114 = 0;
        ?? r115 = 0;
        ?? r116 = 0;
        this.l2 = false;
        this.m2 = false;
        this.W = false;
        this.X0 = null;
        this.A0 = null;
        ArrayList arrayList = this.K2;
        arrayList.clear();
        this.n3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        org.telegram.messenger.g0.g3(new eu(context2, 0));
        this.P1 = null;
        this.N1 = null;
        this.O1 = null;
        this.S1 = null;
        this.L1 = null;
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        s5.setTranslationX(-org.telegram.messenger.g0.L(5.0f));
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.outline_header_search);
        a10.O();
        this.k0 = a10;
        int i11 = 3;
        a10.setOnClickListener(new hu(this, i11));
        int i12 = 8;
        int i13 = 2;
        if (this.T0 == 2 || (t4() && d4(this.currentAccount, this.T0, this.Y2, false).isEmpty())) {
            this.k0.setVisibility(8);
        }
        this.k0.setVisibility(8);
        float f13 = 0.0f;
        ?? r52 = 1;
        ?? r53 = 1;
        if (!this.n2 && this.p2 == null && this.Y2 == 0 && this.a3 == 0) {
            int i14 = org.telegram.ui.ActionBar.n6.t8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.n6.v8;
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context2, themedColor, getThemedColor(i15));
            this.n0 = q0Var;
            q0Var.setText(org.telegram.messenger.gd.M0(2131751342).toUpperCase());
            if (this.n0.getTextView() != null) {
                org.telegram.ui.ActionBar.u6.U(this.n0.getTextView(), i15, getResourceProvider());
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.n0;
            org.telegram.ui.ActionBar.u6.Q(q0Var2, q0Var2.getBackground(), null, org.telegram.ui.ActionBar.u6.M(i14), getResourceProvider());
            this.actionBar.addView(this.n0, c8.na.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.n0.setOnClickListener(new hu(this, i12));
            this.n0.setAlpha(0.0f);
            this.n0.setVisibility(8);
            this.o0 = new org.telegram.ui.Components.wg0(context2);
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(context2, this.resourceProvider, false, true);
            this.p0 = y0Var;
            y0Var.setItemHeight(56);
            this.p0.j(org.telegram.messenger.gd.M0(2131748412), 0, this.o0);
            this.p0.setContentDescription(org.telegram.messenger.gd.M0(2131746405));
            org.telegram.ui.ActionBar.q0 a11 = s5.a(1, R.drawable.outline_header_lock_24);
            this.g0 = a11;
            a11.setContentDescription(org.telegram.messenger.gd.M0(2131754812));
            org.telegram.ui.ActionBar.q0 d = s5.d(3, new ColorDrawable(0));
            this.h0 = d;
            dx dxVar = new dx(context2, this.currentAccount);
            this.i0 = dxVar;
            d.addView(dxVar);
            this.h0.setContentDescription(org.telegram.messenger.gd.M0(2131751331));
            this.h0.setVisibility(8);
            u5(false, false);
        }
        pw pwVar3 = new pw(context2, this.resourceProvider);
        this.Y = pwVar3;
        pwVar3.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        int i16 = 9;
        if (this.T0 == 0) {
            org.telegram.ui.ActionBar.q0 a12 = s5.a(-47, R.drawable.avd_speed);
            this.m0 = a12;
            org.telegram.messenger.g0.E2(a12);
            this.m0.setOnClickListener(new hu(this, i16));
            this.Y.a(this.m0);
            this.Y.updateColors();
        }
        this.Y.setCloseButtonOnClickListener(new fu(this, 25));
        this.Y.r.setOnFocusChangeListener(new ed(this, r53 == true ? 1 : 0));
        ah.i iVar = this.Y.r;
        bg.p0 p0Var = new bg.p0(iVar, new bi.x1(this, 12));
        this.Z = p0Var;
        iVar.addTextChangedListener(p0Var);
        this.Y.setSearchFiltersListener(new gv(this));
        this.Z.a();
        int i17 = 10;
        if (this.T0 == 0) {
            org.telegram.ui.ActionBar.q0 a13 = s5.a(4, R.drawable.ic_ab_other);
            this.l0 = a13;
            a13.setContentDescription(org.telegram.messenger.gd.M0(2131754838));
            this.l0.setOnClickListener(new hu(this, i17));
            this.l0.setOnLongClickListener(new pu(this, i11));
        }
        this.k0.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745640));
        this.k0.setContentDescription(org.telegram.messenger.gd.M0(2131745640));
        if (this.n2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i18 = this.T0;
            if (i18 == 16) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131753097));
            } else if (this.O0) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131746056));
            } else if (this.P0) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131746233));
            } else if (i18 == 3 && this.h2 == null) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131750558));
            } else if (i18 == 10) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131745472));
            } else if (i18 == 14) {
                boolean z10 = this.C2;
                if (!z10 || this.B2 || this.x2 || this.A2) {
                    boolean z11 = this.B2;
                    if (!z11 || z10 || this.x2 || this.A2) {
                        boolean z12 = this.x2;
                        if (z12 && !z11 && !z10 && !this.A2) {
                            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752113));
                        } else if (!this.A2 || z11 || z10 || z12) {
                            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131745473));
                        } else {
                            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752123));
                        }
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752098));
                    }
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752125));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.H;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752098));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752125));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752098));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752123));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752113));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131745473));
                }
            }
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.p2 != null || this.Y2 != 0 || this.a3 != 0) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
                this.g1 = x1Var;
                kVar.setBackButtonDrawable(x1Var);
            }
            if (this.Y2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131754133));
            } else if (this.a3 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.n5.m(this.b3));
                this.actionBar.setAdditionalTextLeft(org.telegram.messenger.g0.L(28.0f));
                this.e3 = new org.telegram.ui.Components.a9(this.b3);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
                this.d3 = p9Var;
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
                this.d3.f(this.b3, this.e3);
                this.actionBar.addView(this.d3, c8.na.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(26.0f), null);
                this.F3 = m5Var;
                m5Var.a = true;
                Drawable g10 = i5.c.g(context2, R.drawable.telegram_logo_2);
                this.E3 = g10;
                g10.setBounds(0, org.telegram.messenger.g0.L(2.0f), this.E3.getIntrinsicWidth(), this.E3.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f));
                Drawable drawable = this.E3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.Xl);
                this.A4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.M0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.E3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.M(spannableStringBuilder, this.F3);
                z5(org.telegram.messenger.i10.i(this.currentAccount).f(), false);
            }
            if (this.Y2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new fu(this, 26));
        int i19 = this.T0;
        if (((i19 == 0 && !this.n2) || i19 == 3) && this.Y2 == 0 && this.a3 == 0 && TextUtils.isEmpty(this.p2)) {
            qw qwVar2 = new qw(this, context2, this.resourceProvider);
            this.A0 = qwVar2;
            qwVar2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.A0.setDelegate(new sw(context2, this));
        }
        int i20 = 11;
        int i21 = 17;
        if (this.t2 && org.telegram.messenger.i10.c() > 1) {
            this.F1 = s5.g(11, 0, org.telegram.messenger.g0.L(56.0f));
            org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9();
            a9Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context2);
            p9Var2.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
            this.F1.addView(p9Var2, c8.na.e(36, 36, 17));
            this.F1.setOnClickListener(new hu(this, i20));
            this.F1.setOnLongClickListener(new pu(this, i13));
            TLRPC.User f14 = getUserConfig().f();
            a9Var.r(f14);
            ImageReceiver imageReceiver = p9Var2.getImageReceiver();
            int i22 = this.currentAccount;
            imageReceiver.d = i22;
            p9Var2.m(org.telegram.messenger.fc.m(i22, 1, f14), "50_50", org.telegram.messenger.fc.n(f14), "50_50", (f14 == null || (userProfilePhoto = f14.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? a9Var : r92, f14);
        }
        this.actionBar.setActionBarMenuOnItemClick(new cv(this, r116 == true ? 1 : 0));
        uw uwVar = new uw(context2, this);
        this.fragmentView = uwVar;
        this.w4 = new vu(this, uwVar, new PointF(), r115 == true ? 1 : 0);
        int i23 = (this.Y2 == 0 && this.a3 == 0 && (((i10 = this.T0) == 0 && !this.n2) || i10 == 3)) ? 2 : 1;
        this.f0 = new ax[i23];
        int i24 = 0;
        while (i24 < i23) {
            ax axVar = new ax(context2, this);
            uwVar.addView(axVar, c8.na.c(-1.0f, -1));
            axVar.s = this.T0;
            this.f0[i24] = axVar;
            axVar.x = new org.telegram.ui.Components.vz(context2);
            axVar.x.setViewType(7);
            axVar.x.setVisibility(8);
            axVar.addView(axVar.x, c8.na.e(-2, -2, i21));
            xw xwVar = new xw(this, context2, axVar);
            axVar.a = xwVar;
            this.glassEngine.b(xwVar);
            ?? r10 = axVar.a;
            axVar.b = new a8.xa((org.telegram.ui.Components.ek0) r10);
            r10.setAllowStopHeaveOperations(r52);
            axVar.a.setAccessibilityEnabled(false);
            axVar.a.o1(0, r52);
            axVar.a.setClipToPadding(false);
            axVar.a.setPivotY(f13);
            if (this.T0 == 15) {
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, axVar.a, getResourceProvider());
            }
            axVar.y = new dv(axVar.a, axVar);
            axVar.a.setVerticalScrollBarEnabled(r52);
            axVar.a.setInstantClick(r52);
            axVar.c = new fv(this, axVar);
            axVar.c.j1(r52);
            axVar.a.setLayoutManager(axVar.c);
            axVar.a.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? r52 : 2);
            axVar.addView(axVar.a, c8.na.c(-1.0f, -1));
            axVar.a.setOnItemClickListener(new zs(4, this, axVar));
            axVar.a.setOnItemLongClickListener(new jb.m(this, axVar, r114 == true ? 1 : 0, 18));
            axVar.f = new zw(this, axVar);
            axVar.E = new org.telegram.ui.Components.hj0(axVar.a, false);
            zwVar = axVar.f;
            axVar.e = new v4.z(zwVar);
            zVar = axVar.e;
            zVar.h(axVar.a);
            axVar.a.setOnScrollListener(new hv(this, axVar, uwVar));
            axVar.w = org.telegram.messenger.bz.q1 ? 2 : 0;
            if (axVar.n == null && this.Y2 == 0 && this.a3 == 0) {
                axVar.n = new iv(org.telegram.messenger.gd.M0(2131754719), org.telegram.messenger.gd.M0(2131754721), axVar);
                if (n4()) {
                    axVar.n.h();
                } else {
                    axVar.n.b();
                }
                iv ivVar = axVar.n;
                i7 = axVar.w;
                ivVar.g(i7 != 0);
            }
            uw uwVar2 = uwVar;
            int i25 = i24;
            int i26 = i23;
            int i27 = 13;
            context2 = context;
            axVar.d = new jv(this, this, context, axVar.s, this.Y2, this.n2, arrayList, this.currentAccount, this.H, axVar);
            mVar = axVar.d;
            mVar.S(axVar.a);
            mVar2 = axVar.d;
            mVar2.Q(this.v2);
            if (axVar.s == 3) {
                mVar6 = axVar.d;
                mVar6.N(getMessagesController().i5() && (vwVar = this.E2) != null && vwVar.F());
            }
            if (org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.sr srVar = this.r2;
                if (srVar.a != 0) {
                    mVar5 = axVar.d;
                    mVar5.R(srVar.a);
                }
            }
            mVar3 = axVar.d;
            mVar3.O(axVar.n);
            xw xwVar2 = axVar.a;
            mVar4 = axVar.d;
            xwVar2.setAdapter(mVar4);
            axVar.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? axVar.x : null);
            axVar.r = new org.telegram.ui.ActionBar.l5(axVar.a, axVar.c);
            org.telegram.ui.ActionBar.l5 l5Var = axVar.r;
            l5Var.c = true;
            l5Var.d = true;
            l5Var.n = new iu(this, i27);
            if (i25 != 0) {
                this.f0[i25].setVisibility(8);
            }
            i24 = i25 + 1;
            r52 = 1;
            i23 = i26;
            i21 = 17;
            uwVar = uwVar2;
            f13 = 0.0f;
        }
        uw uwVar3 = uwVar;
        int i28 = r52;
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(context2);
        this.M1 = asVar;
        int i29 = org.telegram.ui.ActionBar.n6.d6;
        asVar.setColor(org.telegram.ui.ActionBar.n6.v0(i29));
        uwVar3.addView(this.M1, c8.na.e(-1, 100, 48));
        this.C0 = uwVar3.getChildCount();
        dz0 dz0Var = new dz0((Activity) getContext());
        this.a0 = dz0Var;
        uwVar3.addView(dz0Var, c8.na.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        dz0 dz0Var2 = this.a0;
        gh.e o4 = c8.j0.o(this.resourceProvider);
        dh.c cVar = this.u4;
        fh.g b10 = cVar.b(dz0Var2, o4);
        org.telegram.messenger.m10.s(b10, org.telegram.messenger.g0.L(18.0f), 6.666f);
        this.a0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
        this.a0.setBlurredBackground(b10);
        jg.q0 q0Var3 = new jg.q0(getParentActivity(), null);
        this.c0 = q0Var3;
        q0Var3.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
        jg.q0 q0Var4 = this.c0;
        q0Var4.i3 = false;
        q0Var4.setOnItemClickListener(new lu(this, i28));
        this.a0.addView(this.c0, c8.na.e(-1, -1, 48));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context2, this.resourceProvider, i28);
        this.v0 = a10Var;
        a10Var.setContentDescription(org.telegram.messenger.gd.M0(2131744314));
        this.v0.setImageResource(R.drawable.outline_fab_story_24);
        this.v0.setOnClickListener(new hu(this, 27));
        uwVar3.addView(this.v0, org.telegram.ui.Components.a10.c());
        org.telegram.ui.Components.a10 a10Var2 = new org.telegram.ui.Components.a10(context2, this.resourceProvider);
        this.u0 = a10Var2;
        uwVar3.addView(a10Var2, org.telegram.ui.Components.a10.b());
        this.u0.setOnClickListener(new hu(this, 28));
        if (!t4() && this.T0 == 0 && org.telegram.messenger.mp.u1(this.currentAccount).v1().getBoolean("storyhint", i28)) {
            hi.u3 u3Var = new hi.u3(context2, 2);
            u3Var.s(8.0f);
            u3Var.d = 8000L;
            u3Var.k(i28);
            u3Var.h = org.telegram.messenger.g0.L(165.0f);
            u3Var.r(i28);
            f10 = 8.0f;
            u3Var.v(org.telegram.messenger.g0.K2(org.telegram.messenger.gd.M0(2131744471), hi.nb.m(context2), "%s"));
            u3Var.o(1.0f, -40.0f);
            u3Var.j(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            u3Var.r0 = new yu(this, 10);
            this.q0 = u3Var;
            uwVar3.addView(u3Var, c8.na.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f10 = 8.0f;
        }
        A5();
        this.b0 = null;
        int i30 = 5;
        if (this.n2 || this.T0 != 0) {
            f11 = 72.0f;
            if (this.T0 == 3 || U3()) {
                jh.f fVar = new jh.f(context2);
                this.A1 = fVar;
                fVar.setClipChildren(false);
                jh.f fVar2 = this.A1;
                rh.h hVar = this.w;
                fVar2.setWindowInsetsProvider(hVar);
                jh.f fVar3 = this.A1;
                fVar3.setInputIslandBubbleDrawable(cVar.b(fVar3, c8.j0.o(this.resourceProvider)));
                jh.f fVar4 = this.A1;
                fVar4.setUnderKeyboardBackgroundDrawable(this.s4.b(fVar4, c8.j0.o(this.resourceProvider)));
                dh.d dVar = new dh.d(this.v4.b(this.A1, null));
                if (!org.telegram.messenger.bz.f() || org.telegram.messenger.pc.e(262144)) {
                    dVar.b(org.telegram.messenger.g0.L(72.0f), i28);
                }
                this.A1.setBackgroundWithFadeDrawable(dVar);
                FrameLayout inputIslandBubbleContainer = this.A1.getInputIslandBubbleContainer();
                this.B1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.C1 = this.A1.getInAppKeyboardBubbleContainer();
                mv mvVar = this.D1;
                if (mvVar != null) {
                    mvVar.d1();
                }
                mv mvVar2 = new mv(this, getParentActivity(), uwVar3);
                this.D1 = mvVar2;
                mvVar2.setInAppInsetsController(hVar);
                this.D1.Y5 = false;
                uwVar3.setClipChildren(false);
                uwVar3.setClipToPadding(false);
                mv mvVar3 = this.D1;
                mvVar3.X5 = false;
                mvVar3.Y2 = (org.telegram.messenger.g0.E || ((bnVar = mvVar3.F3) != null && bnVar.isInBubbleMode())) ? false : i28;
                this.D1.y1(false, false, false);
                this.D1.J1(i28, false);
                this.D1.p2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
                f12 = 0.0f;
                this.D1.getSendButton().setAlpha(0.0f);
                this.D1.setViewParentForEmoji(this.C1);
                this.B1.addView(this.D1, c8.na.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                uwVar3.addView(this.A1.getFadeView(), c8.na.c(-1.0f, -1));
                uwVar3.addView(this.A1, c8.na.c(-1.0f, -1));
                if (o4() || this.G2 != null || this.H2 != null) {
                    v3(this.Z3);
                    this.Z3 = null;
                }
                this.D1.setDelegate(new gv(this));
                oi.w1 w1Var = new oi.w1(this, context2, this.resourceProvider);
                this.E1 = w1Var;
                int L = org.telegram.messenger.g0.L(52.0f);
                int L2 = org.telegram.messenger.g0.L(38.0f);
                w1Var.L = L;
                w1Var.M = L2;
                oi.w1 w1Var2 = this.E1;
                float L3 = org.telegram.messenger.g0.L(7.0f);
                float L4 = org.telegram.messenger.g0.L(f10);
                w1Var2.P = L3;
                w1Var2.Q = L4;
                oi.w1 w1Var3 = this.E1;
                w1Var3.s0 = i28;
                uwVar3.addView(w1Var3, c8.na.e(org.telegram.messenger.ks.v1, 50, 85));
                this.E1.setScrimViewBackgroundColor(getThemedColor(i29));
                this.E1.setOnClickListener(new hu(this, i30));
                this.E1.setOnLongClickListener(new pu(this, r11 == true ? 1 : 0));
                this.E1.setVisibility(8);
                this.E1.setScaleX(0.2f);
                this.E1.setScaleY(0.2f);
                this.E1.setAlpha(0.0f);
                float L5 = org.telegram.messenger.g0.L(12.0f);
                TextPaint textPaint = this.G1;
                textPaint.setTextSize(L5);
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                qwVar = this.A0;
                if (qwVar != null) {
                    fh.g b11 = cVar.b(qwVar, c8.j0.o(this.resourceProvider));
                    org.telegram.messenger.m10.s(b11, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    this.A0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    this.A0.setBlurredBackground(b11);
                    this.A0.j(new fu(this, 19), new fu(this, 22));
                    uwVar3.addView(this.A0, c8.na.d(-1, -2.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                pwVar = this.Y;
                if (pwVar != null) {
                    pwVar.setupBlurredBackground(cVar.b(pwVar, c8.j0.o(this.resourceProvider)));
                }
                sv svVar = new sv(this, context2, this, this.currentAccount, t4() ? 1 : 0);
                this.F0 = svVar;
                svVar.setActionBar(this.actionBar);
                this.F0.setMenuItemsOffset(!t4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
                sv svVar2 = this.F0;
                svVar2.m0 = false;
                svVar2.setVisibility(8);
                this.N = false;
                this.M = false;
                this.L = false;
                if (this.n2 && this.T0 == 3) {
                    org.telegram.messenger.mp.u1(this.currentAccount).L1();
                }
                uwVar3.addView(this.actionBar, c8.na.c(-2.0f, -1));
                if (!this.n2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context2);
                    this.G3 = oVar;
                    uwVar3.addView(oVar, c8.na.e(20, 20, 51));
                }
                pwVar2 = this.Y;
                if (pwVar2 != null) {
                    uwVar3.addView(pwVar2, c8.na.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.y0 = uwVar3.getChildCount();
                UndoView[] undoViewArr = this.z0;
                undoViewArr[0] = null;
                undoViewArr[i28] = null;
                if (this.X) {
                    this.actionBar.getTitlesContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
                    org.telegram.ui.ActionBar.u6.c(this.actionBar, org.telegram.ui.ActionBar.n6.Xl, getResourceProvider());
                }
                if (this.Y2 == 0 || this.a3 != 0) {
                    this.f0[0].a.setGlowColor(getThemedColor(i29));
                    org.telegram.ui.ActionBar.u6.b(this.actionBar, org.telegram.ui.ActionBar.n6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.u6.a(this.actionBar, org.telegram.ui.ActionBar.n6.N8, getResourceProvider(), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.Q8), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.R8), i28);
                }
                if (!this.n2 && this.T0 == 0) {
                    tv tvVar = new tv(r112 == true ? 1 : 0, context2, this);
                    this.L0 = tvVar;
                    tvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i29), 100)));
                    this.L0.setFocusable(false);
                    this.L0.setImportantForAccessibility(2);
                    this.L0.setOnClickListener(new hu(this, 7));
                    this.L0.setVisibility(8);
                    uwVar3.addView(this.L0, c8.na.c(-1.0f, -1));
                }
                this.h1.setColor(getThemedColor(i29));
                this.s3 = false;
                if (this.p2 == null) {
                    i5(i28, false, false, false);
                    this.Y.r.setText(this.p2);
                    this.Y.r.setSelection(this.p2.length());
                } else if (this.q2 != null) {
                    i5(i28, false, false, i28);
                    this.Z.b(i28);
                    this.Y.r.setText(this.q2);
                    this.Y.r.setSelection(this.q2.length());
                    this.q2 = null;
                    pw pwVar4 = this.Y;
                    if (pwVar4 != null) {
                        pwVar4.setTranslationY(j4() + (-org.telegram.messenger.g0.L(36.0f)));
                    }
                } else {
                    i5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(uwVar3);
                this.H3 = new wv(this, context2, uwVar3, context2);
                q5(i28, false);
                this.H3.setOpenProgress(f12);
                uwVar3.addView(this.F0, c8.na.c(81.0f, -1));
                uwVar3.addView(this.H3, c8.na.c(-1.0f, -1));
                this.G0 = new org.telegram.ui.Components.zr(context2);
                bsVar = this.L1;
                if (bsVar != null) {
                    uwVar3.addView(bsVar, c8.na.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.a3 != 0 && this.T0 != 3 && org.telegram.messenger.v3.c(this.b3)) {
                    org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.M0(2131751977));
                    spannableStringBuilder2.setSpan(kqVar, 0, i28, 33);
                    hi.e eVar = new hi.e(context2, this.resourceProvider);
                    this.w0 = eVar;
                    eVar.f();
                    this.w0.setText(spannableStringBuilder2);
                    this.w0.setOnClickListener(new org.telegram.ui.Components.p31(13, this, new org.telegram.ui.ActionBar.t1[i28]));
                    lh.f fVar5 = new lh.f(getContext());
                    this.x0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.n6.a7);
                    this.x0.setFadeZoneBottom(org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.n);
                    this.x0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
                    uwVar3.addView(this.x0, c8.na.g());
                    uwVar3.addView(this.w0, c8.na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
                }
                B5(false);
                t5(false);
                R3();
                O3();
                Q3();
                P3();
                N3();
                H3();
                this.Y.setBlurredBackgroundVisibility(this.b.e);
                ri.q qVar = this.glassEngine;
                qVar.a = new iu(this, 8);
                qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
                r0.i0.l(this.fragmentView, new iu(this, 9));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.bs bsVar2 = new org.telegram.ui.Components.bs(context2);
            this.L1 = bsVar2;
            bsVar2.setOnAnimatedHeightChangedListener(new yu(this, 16));
            fh.g a14 = cVar.a(this.L1);
            a14.p(c8.j0.o(this.resourceProvider));
            a14.q(org.telegram.messenger.g0.L(7.0f));
            f11 = 72.0f;
            this.L1.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
            this.L1.setBlurredBackground(a14);
            this.L1.setDefaultRadiusDp(this.a3 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.I1 = frameLayout;
            this.L1.addView(frameLayout);
            this.L1.i(5, this.I1);
            this.L1.h(this.I1);
            this.L1.j(this.I1, i28, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.K1 = frameLayout2;
            this.L1.addView(frameLayout2);
            int i31 = 4;
            this.L1.i(4, this.K1);
            this.L1.h(this.K1);
            this.L1.j(this.K1, i28, false);
            kv kvVar = new kv(this, context2, this, 0);
            this.H1 = kvVar;
            this.I1.addView(kvVar);
            kv kvVar2 = new kv(this, context2, this, i28);
            this.J1 = kvVar2;
            this.K1.addView(kvVar2);
            this.L1.setCallFragmentContextView(this.J1);
            org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context2);
            this.O1 = c3Var;
            c3Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
            o5();
            y6.m0(new gu(this, r113 == true ? 1 : 0));
            y6.r0(new a5(this, 11));
            this.L1.addView(this.O1);
            if (this.a3 != 0) {
                mi.j jVar = new mi.j(context2, this.resourceProvider, i28);
                this.S1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, org.telegram.messenger.gd.M0(2131751883), null, false);
                this.S1.setUnreadMode(i28);
                this.S1.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                this.S1.setOnClickListener(new hu(this, i31));
                this.L1.addView(this.S1);
                B3(false);
            }
        }
        f12 = 0.0f;
        qwVar = this.A0;
        if (qwVar != null) {
        }
        pwVar = this.Y;
        if (pwVar != null) {
        }
        sv svVar3 = new sv(this, context2, this, this.currentAccount, t4() ? 1 : 0);
        this.F0 = svVar3;
        svVar3.setActionBar(this.actionBar);
        this.F0.setMenuItemsOffset(!t4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
        sv svVar22 = this.F0;
        svVar22.m0 = false;
        svVar22.setVisibility(8);
        this.N = false;
        this.M = false;
        this.L = false;
        if (this.n2) {
            org.telegram.messenger.mp.u1(this.currentAccount).L1();
        }
        uwVar3.addView(this.actionBar, c8.na.c(-2.0f, -1));
        if (!this.n2) {
        }
        pwVar2 = this.Y;
        if (pwVar2 != null) {
        }
        this.y0 = uwVar3.getChildCount();
        UndoView[] undoViewArr2 = this.z0;
        undoViewArr2[0] = null;
        undoViewArr2[i28] = null;
        if (this.X) {
        }
        if (this.Y2 == 0) {
        }
        this.f0[0].a.setGlowColor(getThemedColor(i29));
        org.telegram.ui.ActionBar.u6.b(this.actionBar, org.telegram.ui.ActionBar.n6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.u6.a(this.actionBar, org.telegram.ui.ActionBar.n6.N8, getResourceProvider(), false);
        this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.Q8), false);
        this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.R8), i28);
        if (!this.n2) {
            tv tvVar2 = new tv(r112 == true ? 1 : 0, context2, this);
            this.L0 = tvVar2;
            tvVar2.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i29), 100)));
            this.L0.setFocusable(false);
            this.L0.setImportantForAccessibility(2);
            this.L0.setOnClickListener(new hu(this, 7));
            this.L0.setVisibility(8);
            uwVar3.addView(this.L0, c8.na.c(-1.0f, -1));
        }
        this.h1.setColor(getThemedColor(i29));
        this.s3 = false;
        if (this.p2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(uwVar3);
        this.H3 = new wv(this, context2, uwVar3, context2);
        q5(i28, false);
        this.H3.setOpenProgress(f12);
        uwVar3.addView(this.F0, c8.na.c(81.0f, -1));
        uwVar3.addView(this.H3, c8.na.c(-1.0f, -1));
        this.G0 = new org.telegram.ui.Components.zr(context2);
        bsVar = this.L1;
        if (bsVar != null) {
        }
        if (this.a3 != 0) {
            org.telegram.ui.Components.kq kqVar2 = new org.telegram.ui.Components.kq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) org.telegram.messenger.gd.M0(2131751977));
            spannableStringBuilder22.setSpan(kqVar2, 0, i28, 33);
            hi.e eVar2 = new hi.e(context2, this.resourceProvider);
            this.w0 = eVar2;
            eVar2.f();
            this.w0.setText(spannableStringBuilder22);
            this.w0.setOnClickListener(new org.telegram.ui.Components.p31(13, this, new org.telegram.ui.ActionBar.t1[i28]));
            lh.f fVar52 = new lh.f(getContext());
            this.x0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.n6.a7);
            this.x0.setFadeZoneBottom(org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.n);
            this.x0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            uwVar3.addView(this.x0, c8.na.g());
            uwVar3.addView(this.w0, c8.na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        }
        B5(false);
        t5(false);
        R3();
        O3();
        Q3();
        P3();
        N3();
        H3();
        this.Y.setBlurredBackgroundVisibility(this.b.e);
        ri.q qVar2 = this.glassEngine;
        qVar2.a = new iu(this, 8);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        r0.i0.l(this.fragmentView, new iu(this, 9));
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0223 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d4(int i7, int i10, int i11, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.T1) != null) {
            return arrayList;
        }
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).a);
        a0.h hVar = u12.R;
        ArrayList arrayList2 = u12.K;
        ArrayList arrayList3 = u12.J;
        ArrayList arrayList4 = u12.I;
        ArrayList arrayList5 = u12.H;
        ArrayList arrayList6 = u12.M;
        ArrayList arrayList7 = u12.G;
        if (i10 == 0) {
            return (i11 == 0 && s4()) ? u12.H7 : u12.Y0(i11);
        }
        if (i10 == 10 || i10 == 13) {
            return u12.F;
        }
        if (i10 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.A2) {
                arrayList8.add(new ww(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.x2) {
                arrayList8.add(new ww(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i12);
                    if ((this.A2 && org.telegram.messenger.v3.U(i7, -dialog.id)) || (this.x2 && (org.telegram.messenger.v3.m0(i7, -dialog.id) || !org.telegram.messenger.v3.S(i7, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new ww(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i10 == 3) {
            return u12.E;
        }
        if (i10 == 4 || i10 == 12) {
            return arrayList2;
        }
        if (i10 == 5) {
            return arrayList3;
        }
        if (i10 == 6 || i10 == 11) {
            return arrayList6;
        }
        if (i10 == 7 || i10 == 8) {
            org.telegram.messenger.ro roVar = u12.N[i10 != 7 ? 1 : 0];
            return roVar == null ? u12.Y0(i11) : this.T0 == 3 ? roVar.l : roVar.k;
        }
        if (i10 == 9) {
            return u12.L;
        }
        if (i10 != 1 && i10 != 16 && i10 != 14) {
            if (i10 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User c22 = u12.c2(Long.valueOf(this.I));
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap concurrentHashMap = u12.d;
                int size2 = arrayList2.size();
                while (r8 < size2) {
                    Object obj = arrayList2.get(r8);
                    r8++;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                    if (C4(getMessagesController().c2(Long.valueOf(dialog2.id)))) {
                        arrayList9.add(dialog2);
                    }
                }
                for (TLRPC.User user : concurrentHashMap.values()) {
                    if (user != null && !hVar.d(user.id) && C4(user)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j3 = user.id;
                        tL_peerUser.user_id = j3;
                        tL_dialog.id = j3;
                        arrayList9.add(tL_dialog);
                    }
                }
            } else {
                boolean z12 = requestPeerType instanceof TLRPC.TL_requestPeerTypeChat;
                if (z12 || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                    ConcurrentHashMap concurrentHashMap2 = u12.b;
                    if (z12) {
                        arrayList3 = arrayList6;
                    }
                    int size3 = arrayList3.size();
                    while (r8 < size3) {
                        Object obj2 = arrayList3.get(r8);
                        r8++;
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                        if (B4(getMessagesController().O0(Long.valueOf(-dialog3.id)), c22)) {
                            arrayList9.add(dialog3);
                        }
                    }
                    for (TLRPC.Chat chat : concurrentHashMap2.values()) {
                        if (chat != null && !hVar.d(-chat.id) && B4(chat, c22)) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            if (org.telegram.messenger.v3.T(chat)) {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_dialog2.peer = tL_peerChannel;
                                tL_peerChannel.channel_id = chat.id;
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_dialog2.peer = tL_peerChat;
                                tL_peerChat.chat_id = chat.id;
                            }
                            tL_dialog2.id = -chat.id;
                            arrayList9.add(tL_dialog2);
                        }
                    }
                }
            }
            return arrayList9;
        }
        ArrayList arrayList10 = this.X3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.X3 = new ArrayList();
        r9 = i10 == 16;
        if (this.B2 || this.C2 || r9) {
            int size4 = arrayList2.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj3 = arrayList2.get(i13);
                i13++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User c23 = u12.c2(Long.valueOf(dialog4.id));
                if (c23 != null && !org.telegram.messenger.n10.y(c23)) {
                    if (!r9) {
                        if (c23.bot) {
                            if (this.C2) {
                                if (org.telegram.messenger.n10.C(c23)) {
                                }
                            }
                        } else if (this.B2) {
                            if (org.telegram.messenger.n10.C(c23)) {
                            }
                        }
                        this.X3.add(dialog4);
                    } else if (!org.telegram.messenger.n10.B(c23.id) && !org.telegram.messenger.mp.L2(c23)) {
                        this.X3.add(dialog4);
                    }
                }
            }
        }
        if (this.x2 || (((z11 = this.z2) && this.y2) || r9)) {
            int size5 = arrayList6.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj4 = arrayList6.get(i14);
                i14++;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) obj4;
                TLRPC.Chat O0 = u12.O0(Long.valueOf(-dialog5.id));
                if (O0 != null && !org.telegram.messenger.v3.V(O0)) {
                    if (r9) {
                        if (org.telegram.messenger.v3.n0(O0)) {
                            this.X3.add(dialog5);
                        }
                    } else if (u12.y(dialog5)) {
                        this.X3.add(dialog5);
                    }
                }
            }
        } else if (z11 || this.y2 || r9) {
            int size6 = arrayList6.size();
            int i15 = 0;
            while (i15 < size6) {
                Object obj5 = arrayList6.get(i15);
                i15++;
                TLRPC.Dialog dialog6 = (TLRPC.Dialog) obj5;
                TLRPC.Chat O02 = u12.O0(Long.valueOf(-dialog6.id));
                if (O02 != null && !org.telegram.messenger.v3.V(O02)) {
                    if (r9) {
                        if (org.telegram.messenger.v3.n0(O02)) {
                            this.X3.add(dialog6);
                        }
                    } else if (u12.y(dialog6)) {
                        if (this.z2) {
                            if (!org.telegram.messenger.v3.n0(O02)) {
                                this.X3.add(dialog6);
                            }
                        }
                        if (this.y2 && org.telegram.messenger.v3.n0(O02)) {
                            this.X3.add(dialog6);
                        }
                    }
                }
            }
        }
        if (this.A2 || r9) {
            int size7 = arrayList3.size();
            while (r8 < size7) {
                Object obj6 = arrayList3.get(r8);
                r8++;
                TLRPC.Dialog dialog7 = (TLRPC.Dialog) obj6;
                TLRPC.Chat O03 = u12.O0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (O03 instanceof TLRPC.TL_channel) {
                        this.X3.add(dialog7);
                    }
                } else if (u12.y(dialog7)) {
                    this.X3.add(dialog7);
                }
            }
        }
        org.telegram.messenger.mp messagesController = getMessagesController();
        ArrayList arrayList11 = this.X3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.K7);
        }
        return this.X3;
    }

    public final void d5() {
        if (this.B0 || !getMessagesController().V0 || !getMessagesController().M3 || this.A0 == null || !getMessagesController().V0().isEmpty() || this.isPaused || !getUserConfig().Q || this.inPreviewMode) {
            return;
        }
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        if (g12.getBoolean("filterhint", false)) {
            return;
        }
        g12.edit().putBoolean("filterhint", true).apply();
        org.telegram.messenger.g0.h3(new yu(this, 7), 1000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:428:0x05a2, code lost:
    
        if (org.telegram.messenger.v3.S(r4.K0, r13) != false) goto L376;
     */
    /* JADX WARN: Removed duplicated region for block: B:367:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:372:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        org.telegram.messenger.ro roVar;
        int i12;
        int i13;
        char c10;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.mm0 mm0Var;
        org.telegram.ui.Components.mm0 mm0Var2;
        int i14;
        boolean z11;
        int i15 = 2;
        int i16 = 0;
        int i17 = 0;
        if (i7 == org.telegram.messenger.ks.s) {
            if (this.f0 == null || this.U1) {
                return;
            }
            int i18 = 0;
            while (true) {
                ax[] axVarArr = this.f0;
                if (i18 >= axVarArr.length) {
                    break;
                }
                ax axVar = axVarArr[i18];
                boolean I4 = I4(axVar);
                if (this.B3 && I4) {
                    org.telegram.messenger.g0.h3(new up(this, axVar, objArr, i15), 160L);
                } else {
                    O4(axVar);
                }
                i18++;
            }
            qw qwVar = this.A0;
            if (qwVar != null && qwVar.getVisibility() == 0) {
                this.A0.d();
            }
            C5(-1, true);
            this.B3 = false;
            return;
        }
        if (i7 == org.telegram.messenger.ks.t5) {
            D5(0, true);
            ax[] axVarArr2 = this.f0;
            if (axVarArr2 != null) {
                for (ax axVar2 : axVarArr2) {
                    if (axVar2.getVisibility() == 0 && I4(axVar2)) {
                        fu fuVar = this.R3;
                        org.telegram.messenger.g0.r(fuVar);
                        org.telegram.messenger.g0.h3(fuVar, 100L);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a3 != chatFull.id) {
                return;
            }
            this.c3 = chatFull;
            B3(false);
            if (this.f0 == null || this.U1) {
                return;
            }
            while (true) {
                ax[] axVarArr3 = this.f0;
                if (i17 >= axVarArr3.length) {
                    return;
                }
                O4(axVarArr3[i17]);
                i17++;
            }
        } else {
            ArrayList arrayList = null;
            if (i7 == org.telegram.messenger.ks.d2) {
                qw qwVar2 = this.A0;
                if (qwVar2 == null || qwVar2.getVisibility() != 0) {
                    return;
                }
                qw qwVar3 = this.A0;
                int defaultTabId = qwVar3.getDefaultTabId();
                di.b1 b1Var = qwVar3.G;
                ArrayList arrayList2 = qwVar3.h;
                int i19 = qwVar3.m0.get(defaultTabId, -1);
                if (i19 < 0 || i19 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.lz lzVar = (org.telegram.ui.Components.lz) arrayList2.get(i19);
                if (lzVar.d == ((sw) qwVar3.K).a(lzVar.a) || ((sw) qwVar3.K).a(lzVar.a) < 0) {
                    return;
                }
                b1Var.g1();
                if (qwVar3.n0.get(i19) != lzVar.a(true) || qwVar3.i0) {
                    qwVar3.i0 = true;
                    qwVar3.requestLayout();
                    b1Var.setItemAnimator(qwVar3.t0);
                    l4 l4Var = qwVar3.J;
                    if (l4Var != null) {
                        l4Var.f();
                    }
                    qwVar3.N = 0;
                    org.telegram.ui.Components.lz e10 = qwVar3.e();
                    if (e10 != null) {
                        e10.b(org.telegram.messenger.gd.N0(2131750795, null));
                    }
                    int size = arrayList2.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        qwVar3.N = org.telegram.messenger.f3.C(24.0f, ((org.telegram.ui.Components.lz) arrayList2.get(i20)).a(true), qwVar3.N);
                    }
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.c5) {
                D5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.ks.b5) {
                D5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.ks.l4) {
                if (this.f0 != null) {
                    int i21 = 0;
                    while (true) {
                        ax[] axVarArr4 = this.f0;
                        if (i21 >= axVarArr4.length) {
                            break;
                        }
                        xw xwVar = axVarArr4[i21].a;
                        if (xwVar != null) {
                            for (int i22 = 0; i22 < xwVar.getChildCount(); i22++) {
                                View childAt = xwVar.getChildAt(i22);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i21++;
                    }
                }
                qw qwVar4 = this.A0;
                if (qwVar4 != null) {
                    qwVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.L4) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.n(true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.D4) {
                u5(false, false);
                return;
            }
            if (i7 == org.telegram.messenger.ks.r) {
                Integer num = (Integer) objArr[0];
                D5(num.intValue(), true);
                qw qwVar5 = this.A0;
                if (qwVar5 != null && qwVar5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i23 = org.telegram.messenger.mp.I8;
                    if ((intValue & 256) != 0) {
                        this.A0.d();
                    }
                }
                if (this.a3 != 0) {
                    int intValue2 = num.intValue();
                    int i24 = org.telegram.messenger.mp.I8;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.a3));
                        this.b3 = O0;
                        this.actionBar.setTitle(org.telegram.messenger.n5.m(O0));
                        this.d3.f(this.b3, this.e3);
                    }
                }
                if (this.f0 != null) {
                    for (int i25 = 0; i25 < this.f0.length; i25++) {
                        int intValue3 = num.intValue();
                        int i26 = org.telegram.messenger.mp.I8;
                        if ((intValue3 & 4) != 0) {
                            this.f0[i25].d.U(true);
                        }
                    }
                }
                z5(org.telegram.messenger.i10.i(i10).f(), true);
                return;
            }
            int i27 = org.telegram.messenger.ks.I2;
            boolean[] zArr = D4;
            if (i7 == i27) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i7 == org.telegram.messenger.ks.Y) {
                D5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.ks.O) {
                if (this.f0 == null || this.U1) {
                    return;
                }
                org.telegram.ui.Components.a10 a10Var = this.u0;
                if (a10Var != null) {
                    z11 = a10Var.getProgressVisible();
                    this.u0.f(false, true);
                } else {
                    z11 = false;
                }
                for (ax axVar3 : this.f0) {
                    axVar3.d.e = false;
                }
                if (z11) {
                    T4(0.0f);
                    ValueAnimator valueAnimator = this.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.d0, 1.0f).setDuration(250L);
                    this.e0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.kr.f);
                    this.e0.addUpdateListener(new ku(this, i15));
                    this.e0.start();
                }
                int i28 = 0;
                boolean z12 = false;
                while (true) {
                    ax[] axVarArr5 = this.f0;
                    if (i28 >= axVarArr5.length) {
                        break;
                    }
                    if (!axVarArr5[i28].p() || getMessagesController().F0() > 10) {
                        z12 = true;
                    } else {
                        this.f0[i28].d.f();
                    }
                    i28++;
                    z12 = z12;
                }
                if (z12) {
                    D5(0, true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.h0) {
                if (this.f0 == null) {
                    return;
                }
                int i29 = 0;
                while (true) {
                    ax[] axVarArr6 = this.f0;
                    if (i29 >= axVarArr6.length) {
                        int i30 = org.telegram.messenger.mp.I8;
                        D5(512, true);
                        return;
                    }
                    if (axVarArr6[i29].p() && org.telegram.messenger.g0.Q1()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[0]).longValue();
                        long longValue2 = ((Long) objArr[1]).longValue();
                        org.telegram.messenger.sr srVar = this.r2;
                        if (!booleanValue2) {
                            srVar.a = longValue;
                            srVar.b = longValue2;
                        } else if (longValue == srVar.a && longValue2 == srVar.b) {
                            srVar.a = 0L;
                            srVar.b = 0L;
                        }
                        this.f0[i29].d.s = srVar.a;
                    }
                    i29++;
                }
            } else {
                if (i7 == org.telegram.messenger.ks.f0) {
                    D5(0, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ks.J || i7 == org.telegram.messenger.ks.K || i7 == org.telegram.messenger.ks.M) {
                    int i31 = org.telegram.messenger.mp.I8;
                    D5(TLObject.FLAG_12, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ks.n0) {
                    K3();
                    return;
                }
                if (i7 == org.telegram.messenger.ks.P0) {
                    jw jwVar = this.D0;
                    if (jwVar == null || (mm0Var2 = jwVar.e0) == null || (i14 = mm0Var2.i0) == 15) {
                        return;
                    }
                    int i32 = mm0Var2.t0;
                    org.telegram.messenger.tr.a0(i32).a.c(new jg.q(i32, i14, new jg.s(mm0Var2), i16));
                    return;
                }
                if (i7 == org.telegram.messenger.ks.s0) {
                    int i33 = org.telegram.messenger.mp.I8;
                    D5(32768, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ks.S0) {
                    jw jwVar2 = this.D0;
                    if (jwVar2 == null || (mm0Var = jwVar2.e0) == null) {
                        return;
                    }
                    mm0Var.f();
                    return;
                }
                if (i7 == org.telegram.messenger.ks.T1) {
                    int connectionState = ConnectionsManager.getInstance(org.telegram.messenger.c.a(i10).a).getConnectionState();
                    if (this.f2 != connectionState) {
                        this.f2 = connectionState;
                        u5(true, false);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.ks.e5) {
                    u5(true, false);
                    jw jwVar3 = this.D0;
                    if (jwVar3 != null) {
                        int currentPosition = jwVar3.getCurrentPosition();
                        di.i4 i4Var = jwVar3.W;
                        y5(i4Var != null && i4Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                int i34 = 3;
                if (i7 == org.telegram.messenger.ks.K2) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z10 = false;
                    } else {
                        z10 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    boolean z13 = booleanValue;
                    Runnable aaVar = new hi.aa(this, chat, longValue3, z13, user, z10);
                    Z3();
                    if (this.z0[0] == null) {
                        aaVar.run();
                        return;
                    }
                    if (org.telegram.messenger.v3.c0(chat)) {
                        aaVar.run();
                        return;
                    }
                    UndoView l42 = l4();
                    if (l42 != null) {
                        l42.j(z13 ? 1 : 95, longValue3, aaVar);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.ks.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i35 = this.Y2;
                    if (i35 != intValue4 || i35 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i7 == org.telegram.messenger.ks.O2) {
                    q5(true, true);
                    C5(-1, true);
                    return;
                }
                int i36 = org.telegram.messenger.ks.P2;
                if (i7 == i36 || i7 == org.telegram.messenger.ks.Q2) {
                    N4(i7 == i36);
                    C5(-1, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ks.R2) {
                    d5();
                    return;
                }
                if (i7 == org.telegram.messenger.ks.s1) {
                    f5();
                    o5();
                    org.telegram.messenger.mp messagesController = getMessagesController();
                    if (!messagesController.A8 && messagesController.S7 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                        boolean contains = messagesController.V3.contains("SETUP_LOGIN_EMAIL");
                        if (messagesController.V3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                            c10 = 2;
                        } else if (contains) {
                            c10 = 1;
                        }
                        if (c10 == 0) {
                            de0 de0Var = new de0();
                            yu yuVar = new yu(this, i15);
                            yu yuVar2 = new yu(this, i34);
                            boolean z14 = c10 == 2;
                            de0Var.G = 3;
                            de0Var.a = 12;
                            de0Var.e0 = yuVar;
                            de0Var.f0 = yuVar2;
                            de0Var.h0 = z14;
                            de0Var.i0 = true;
                            presentFragment(de0Var);
                            getMessagesController().A8 = true;
                            return;
                        }
                        return;
                    }
                    c10 = 0;
                    if (c10 == 0) {
                    }
                } else {
                    if (i7 == org.telegram.messenger.ks.N) {
                        org.telegram.ui.Components.a10 a10Var2 = this.u0;
                        if (a10Var2 != null) {
                            a10Var2.f(true, true);
                        }
                        ax[] axVarArr7 = this.f0;
                        if (axVarArr7 != null) {
                            for (ax axVar4 : axVarArr7) {
                                jv jvVar = axVar4.d;
                                jvVar.R = false;
                                jvVar.e = true;
                                jvVar.f();
                            }
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.w) {
                        if (!this.s3 || this.D0 == null) {
                            return;
                        }
                        ArrayList arrayList3 = (ArrayList) objArr[0];
                        long longValue4 = ((Long) objArr[1]).longValue();
                        jw jwVar4 = this.D0;
                        HashMap hashMap = jwVar4.C0;
                        SparseArray sparseArray = jwVar4.h;
                        int size2 = sparseArray.size();
                        for (int i37 = 0; i37 < size2; i37++) {
                            View view = (View) sparseArray.valueAt(i37);
                            if (view instanceof b00) {
                                ((b00) view).e(arrayList3, longValue4);
                            }
                        }
                        for (int i38 = 0; i38 < jwVar4.getChildCount(); i38++) {
                            if (jwVar4.getChildAt(i38) instanceof b00) {
                                ((b00) jwVar4.getChildAt(i38)).e(arrayList3, longValue4);
                            }
                        }
                        jwVar4.P0.e(arrayList3, longValue4);
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                        int i39 = 0;
                        while (i39 < arrayList4.size()) {
                            uz uzVar = (uz) arrayList4.get(i39);
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) hashMap.get(uzVar);
                            if (fjVar != null) {
                                long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                                if (B0 < 0) {
                                    i13 = (int) (-B0);
                                    i12 = i16;
                                } else {
                                    i12 = i16;
                                }
                                i13 = i12;
                                if (i13 == longValue4) {
                                    for (int i40 = i12; i40 < arrayList3.size(); i40++) {
                                        if (fjVar.e1() == ((Integer) arrayList3.get(i40)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(uzVar);
                                        }
                                    }
                                }
                            } else {
                                i12 = i16;
                            }
                            i39++;
                            i16 = i12;
                        }
                        int i41 = i16;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i42 = i41; i42 < size3; i42++) {
                                hashMap.remove(arrayList.get(i42));
                            }
                            jwVar4.A0.a(hashMap.size(), true);
                            org.telegram.ui.ActionBar.q0 q0Var = jwVar4.F0;
                            if (q0Var != null) {
                                q0Var.setVisibility(hashMap.size() == 1 ? i41 : 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.O4) {
                        if (this.f0 != null) {
                            int i43 = 0;
                            while (true) {
                                ax[] axVarArr8 = this.f0;
                                if (i43 >= axVarArr8.length) {
                                    break;
                                }
                                jg.j jVar = axVarArr8[i43].d.Q;
                                if (jVar != null) {
                                    jVar.a.clear();
                                    jVar.b.clear();
                                    jVar.c.clear();
                                    jVar.d.clear();
                                    org.telegram.messenger.g0.r(jVar.e);
                                }
                                i43++;
                            }
                        }
                        int i44 = org.telegram.ui.Components.p10.m1;
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.W5) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                        if (this.a3 != longValue5 || booleanValue3) {
                            return;
                        }
                        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                        if (r4Var == null || r4Var.getLastFragment() != this) {
                            removeSelfFromStack();
                            return;
                        } else {
                            finishFragment();
                            return;
                        }
                    }
                    if (i7 == org.telegram.messenger.ks.V5) {
                        if (this.a3 == ((Long) objArr[0]).longValue()) {
                            B3(true);
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.V4) {
                        boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                        if (this.fragmentView != null) {
                            if (!booleanValue4) {
                                qt qtVar = this.V3;
                                if (qtVar == null || qtVar.getTag() == null) {
                                    return;
                                }
                                qt qtVar2 = this.V3;
                                qtVar2.animate().setListener(null).cancel();
                                qtVar2.animate().setListener(new org.telegram.ui.Components.f10(9, this, qtVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                this.V3.setTag(null);
                                return;
                            }
                            if (this.V3 == null) {
                                Context context = this.fragmentView.getContext();
                                qt qtVar3 = new qt(context);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(context);
                                qh0Var.f(R.raw.db_migration_placeholder, org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2, null);
                                qh0Var.getAnimatedDrawable().K(1);
                                qh0Var.d();
                                g10.addView(qh0Var, c8.na.r(org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2, 1));
                                TextView textView = new TextView(context);
                                i5.c.r(24.0f, 1, 2131747584, textView, null);
                                int i45 = org.telegram.ui.ActionBar.n6.G6;
                                org.telegram.ui.ActionBar.u6.U(textView, i45, null);
                                textView.setGravity(1);
                                TextView f10 = org.telegram.messenger.m10.f(g10, textView, c8.na.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                f10.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                                i5.c.r(14.0f, 1, 2131747583, f10, null);
                                org.telegram.ui.ActionBar.u6.U(f10, i45, null);
                                f10.setGravity(1);
                                TextView f11 = org.telegram.messenger.m10.f(g10, f10, c8.na.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                i5.c.r(14.0f, 1, 2131747582, f11, null);
                                org.telegram.ui.ActionBar.u6.U(f11, i45, null);
                                f11.setGravity(1);
                                g10.addView(f11, c8.na.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                qtVar3.addView(g10, c8.na.e(-1, -2, 16));
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, qtVar3, null);
                                qtVar3.setOnTouchListener(new pt());
                                this.V3 = qtVar3;
                                qtVar3.setAlpha(0.0f);
                                ((uw) this.fragmentView).addView(this.V3);
                                this.V3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.V3.setTag(1);
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.d5) {
                        D3();
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.p5) {
                        z5((TLRPC.User) objArr[0], true);
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.i5) {
                        z5(org.telegram.messenger.i10.i(i10).f(), true);
                        A5();
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.w5) {
                        zArr[this.currentAccount] = false;
                        z4(getAccountInstance());
                        getMessagesController().h3(this.Y2);
                        return;
                    }
                    if (i7 == org.telegram.messenger.ks.C5) {
                        int intValue5 = ((Integer) objArr[0]).intValue();
                        int i46 = 0;
                        while (true) {
                            ax[] axVarArr9 = this.f0;
                            if (i46 >= axVarArr9.length) {
                                return;
                            }
                            ax axVar5 = axVarArr9[i46];
                            if (axVar5 != null && (((i11 = axVar5.s) == 7 || i11 == 8) && (roVar = getMessagesController().N[axVar5.s - 7]) != null && intValue5 == roVar.a)) {
                                axVar5.q(true);
                                return;
                            }
                            i46++;
                        }
                    } else {
                        if (i7 != org.telegram.messenger.ks.P1) {
                            if (i7 == org.telegram.messenger.ks.y5) {
                                B5(this.W);
                                D5(0, true);
                                return;
                            }
                            if (i7 == org.telegram.messenger.ks.b3) {
                                A5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.ks.f3) {
                                o5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.ks.j5) {
                                o5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.ks.A3 || i7 == org.telegram.messenger.ks.C3) {
                                o5();
                                return;
                            } else if (i7 == org.telegram.messenger.ks.S3) {
                                o5();
                                return;
                            } else {
                                if (i7 == org.telegram.messenger.ks.T3) {
                                    o5();
                                    return;
                                }
                                return;
                            }
                        }
                        long longValue6 = ((Long) objArr[0]).longValue();
                        int i47 = 0;
                        while (true) {
                            ax[] axVarArr10 = this.f0;
                            if (i47 >= axVarArr10.length) {
                                return;
                            }
                            ax axVar6 = axVarArr10[i47];
                            if (axVar6.a != null) {
                                int i48 = 0;
                                while (true) {
                                    if (i48 < axVar6.a.getChildCount()) {
                                        View childAt2 = axVar6.a.getChildAt(i48);
                                        if (childAt2 instanceof org.telegram.ui.Cells.u2) {
                                            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt2;
                                            if (longValue6 == u2Var.getDialogId()) {
                                                u2Var.z();
                                                break;
                                            }
                                        }
                                        i48++;
                                    }
                                }
                            }
                            i47++;
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof ki.t2) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - i4()) * this.r.e;
    }

    public final void e5() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        int i7;
        float f10;
        int i10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        uu uuVar;
        org.telegram.ui.Components.voip.o oVar;
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, this.l0);
        int i11 = org.telegram.ui.ActionBar.n6.A8;
        I.T(getThemedColor(i11), getThemedColor(i11));
        int i12 = 8;
        I.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        float f11 = 64.0f;
        int i13 = 1;
        int i14 = 0;
        if (this.a3 != 0) {
            if (org.telegram.messenger.v3.N(this.b3)) {
                I.c(R.drawable.msg_customize, org.telegram.messenger.gd.N0(2131751901, null), new yu(this, 14), false);
                I.k();
            }
            I.i(new fu(this, i13), org.telegram.messenger.gd.N0(2131751900, null), this.b3.collapsed_in_dialogs);
            I.i(new fu(this, 2), org.telegram.messenger.gd.N0(2131751899, null), !this.b3.collapsed_in_dialogs);
            I.a0();
            I.Y(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        int i15 = 3;
        if (t4()) {
            I.c(R.drawable.msg_customize, org.telegram.messenger.gd.N0(2131754140, null), new fu(this, i15), false);
            I.c(R.drawable.msg_help, org.telegram.messenger.gd.N0(2131749083, null), new fu(this, 4), false);
            I.a0();
            I.Y(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        boolean b10 = i6Var != null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q();
        I.c(b10 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, org.telegram.messenger.gd.N0(b10 ? 2131744055 : 2131744054, null), new fu(this, 5), false);
        I.k();
        I.c(R.drawable.msg_contacts, org.telegram.messenger.gd.N0(2131751768, null), new fu(this, 6), false);
        I.c(R.drawable.msg_calls, org.telegram.messenger.gd.N0(2131752584, null), new fu(this, 7), false);
        I.k();
        I.c(R.drawable.outline_groups_24, org.telegram.messenger.gd.N0(2131748080, null), new fu(this, i12), false);
        int i16 = 9;
        I.c(R.drawable.outline_saved_24, org.telegram.messenger.gd.N0(2131745705, null), new fu(this, i16), false);
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        if (((org.telegram.messenger.h0) getMessagesController().A7.p0.b).c) {
            I.c(R.drawable.ic_gram, org.telegram.messenger.gd.N0(2131742943, null), new yu(this, 15), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i17 = 0;
                while (i17 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i17);
                    i17++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        uu uuVar2 = new uu(this, tL_attachMenuBot2, launchActivity2, i13);
                        org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(i16, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.i6 i6Var2 = I.d;
                        f10 = f11;
                        if (I.e == null) {
                            arrayList2 = arrayList3;
                            launchActivity = launchActivity2;
                            i7 = size;
                        } else {
                            int i18 = org.telegram.ui.ActionBar.n6.F8;
                            int i19 = org.telegram.ui.ActionBar.n6.E8;
                            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, I.e, I.d, false, false);
                            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), i14, org.telegram.messenger.g0.L(18.0f), i14);
                            CharSequence b11 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.m8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            Pattern pattern = org.telegram.messenger.ri.U1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= size2) {
                                    launchActivity = launchActivity2;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i20);
                                int i21 = i20 + 1;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                launchActivity = launchActivity2;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    i20 = i21;
                                    launchActivity2 = launchActivity;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                i7 = size;
                                org.telegram.messenger.kz f12 = org.telegram.messenger.u5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.n6.c7, 1.0f, null);
                                if (f12 != null) {
                                    Integer num = I.n0;
                                    new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.n6.w0(i18, i6Var2), PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.fc b12 = org.telegram.messenger.fc.b(tL_attachMenuBotIcon.icon);
                                uuVar = uuVar2;
                                oVar = oVar2;
                                y0Var.k(b11, b12, "24_24", f12, tL_attachMenuBot2);
                                org.telegram.ui.Components.p9 p9Var = y0Var.h;
                                if (p9Var != null) {
                                    p9Var.setLayoutParams(c8.na.e(24, 24, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                i7 = size;
                                uuVar = uuVar2;
                                oVar = oVar2;
                                y0Var.j(b11, R.drawable.msg_bot, null);
                            }
                            Integer num2 = I.m0;
                            if (num2 == null && I.n0 == null) {
                                y0Var.c(i19, i18);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.n6.w0(i19, i6Var2);
                                Integer num3 = I.n0;
                                y0Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.n6.w0(i18, i6Var2));
                            }
                            Integer num4 = I.n0;
                            y0Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.n6.w0(i18, i6Var2));
                            Integer num5 = I.o0;
                            if (num5 != null) {
                                y0Var.setSelectorColor(num5.intValue());
                            } else {
                                y0Var.h(0.12f, i19);
                            }
                            y0Var.setOnClickListener(new org.telegram.ui.Components.l8(18, I, uuVar));
                            i10 = 3;
                            y0Var.setOnLongClickListener(new fi.z1(i10, I, oVar));
                            int i22 = I.V;
                            if (i22 > 0) {
                                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i22));
                                I.r(y0Var, c8.na.o(I.V, -2));
                            } else {
                                I.r(y0Var, c8.na.o(-1, -2));
                            }
                            i15 = i10;
                            f11 = f10;
                            arrayList3 = arrayList2;
                            launchActivity2 = launchActivity;
                            size = i7;
                            i16 = 9;
                            i13 = 1;
                            i14 = 0;
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity = launchActivity2;
                        i7 = size;
                        f10 = f11;
                    }
                    i10 = i15;
                    i15 = i10;
                    f11 = f10;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    size = i7;
                    i16 = 9;
                    i13 = 1;
                    i14 = 0;
                }
            }
        }
        float f13 = f11;
        if (getUserConfig().X) {
            I.c(R.drawable.msg_settings_old, org.telegram.messenger.gd.N0(2131745299, null), new fu(this, 0), false);
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = this.p0;
        if (y0Var2 != null) {
            org.telegram.ui.ActionBar.u6.U(y0Var2.b, org.telegram.ui.ActionBar.n6.Ri, getResourceProvider());
            this.p0.setOnClickListener(new org.telegram.ui.Components.p31(10, this, I));
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().B3 && !org.telegram.messenger.bz.z1.isEmpty())) {
                I.k();
                I.d(this.p0);
            }
        }
        I.a0();
        I.Y(-org.telegram.messenger.g0.L(f13));
    }

    public final int f4() {
        if (!this.L) {
            return org.telegram.messenger.g0.L(48.0f);
        }
        return org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(81.0f);
    }

    public final void f5() {
        if (this.W3 != null) {
            return;
        }
        for (String str : getMessagesController().V3) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131749126, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749127, null));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131749357, null), new iu(this, 6));
                showDialog(t1Var, new mu(this, 0));
                this.W3 = str;
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.x60 x60Var = this.M0;
        if (x60Var != null) {
            x60Var.v();
        }
    }

    public final int g4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g5(long j3, View view) {
        int i7;
        TLRPC.EncryptedChat c12;
        s3(j3, view);
        boolean x10 = this.actionBar.x();
        ArrayList arrayList = this.K2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!x10) {
            if (this.s3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.s4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            this.actionBar.R(null, null);
            int i11 = this.f0[0].s;
            Object[] objArr = (i11 == 7 || i11 == 8) && (!this.actionBar.x() || this.actionBar.y(null));
            if (objArr == true && y4(this.f0[0])) {
                org.telegram.messenger.ro h42 = h4(this.f0[0]);
                ArrayList arrayList2 = getMessagesController().y;
                int size = arrayList2.size();
                i7 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && h42.j.get(dialog.id, TLObject.FLAG_31) != Integer.MIN_VALUE) {
                        long j10 = dialog.id;
                        if (org.telegram.messenger.n5.C(j10) && (c12 = getMessagesController().c1(Integer.valueOf((int) (4294967295L & j10)))) != null) {
                            j10 = c12.user_id;
                        }
                        if (h42.b(getAccountInstance(), j10, dialog, false)) {
                            i7++;
                        }
                    }
                }
            } else {
                ArrayList d42 = objArr != false ? d4(this.currentAccount, this.f0[0].s, this.Y2, this.U1) : getMessagesController().Y0(this.Y2);
                int size2 = d42.size();
                i7 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(i13);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (!v4(dialog2)) {
                            if (!getMessagesController().I2(dialog2.id, false)) {
                                break;
                            }
                        } else {
                            i7++;
                        }
                    }
                }
            }
            if (i7 > 1) {
                if (this.f0 != null) {
                    int i14 = 0;
                    while (true) {
                        ax[] axVarArr = this.f0;
                        if (i14 >= axVarArr.length) {
                            break;
                        }
                        axVarArr[i14].d.I = true;
                        i14++;
                    }
                }
                int i15 = org.telegram.messenger.mp.I8;
                D5(131072, true);
            }
            if (!this.s3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList3 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList4 = this.k1;
                    if (i16 >= arrayList4.size()) {
                        break;
                    }
                    View view2 = (View) arrayList4.get(i16);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.g0.y(view2);
                    arrayList3.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i16++;
                }
                animatorSet.playTogether(arrayList3);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.x3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.x3 = ValueAnimator.ofFloat(this.w3, 1.0f);
            int i17 = 0;
            while (true) {
                ax[] axVarArr2 = this.f0;
                if (i17 >= axVarArr2.length) {
                    break;
                }
                ax axVar = axVarArr2[i17];
                if (axVar != null) {
                    axVar.a.I0(true);
                }
                i17++;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.L ? 81 : 0) + 48) + this.O);
            if (max != 0.0f) {
                this.Q = (int) max;
                this.fragmentView.requestLayout();
            }
            this.x3.addUpdateListener(new ju(this, max, i10));
            this.x3.addListener(new ew(this, max, c10 == true ? 1 : 0));
            this.x3.setInterpolator(org.telegram.ui.Components.kr.f);
            this.x3.setDuration(200L);
            this.x3.start();
            qw qwVar = this.A0;
            if (qwVar != null) {
                qwVar.c(org.telegram.ui.ActionBar.n6.xi, org.telegram.ui.ActionBar.n6.wi, org.telegram.ui.ActionBar.n6.vi, org.telegram.ui.ActionBar.n6.yi, org.telegram.ui.ActionBar.n6.w8);
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.g1;
            if (x1Var != null) {
                x1Var.c(true, 1.0f);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            p4(true);
            return;
        }
        n5(false);
        this.j1.a(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.n4 getBackButtonState() {
        return (t4() || this.H3.f) ? org.telegram.ui.ActionBar.n4.a : org.telegram.ui.ActionBar.n4.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i7 = 1;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b4, 1.0f);
            this.e4 = ofFloat;
            return ofFloat;
        }
        int i10 = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? org.telegram.messenger.ks.g2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b4, 1.0f);
        this.e4 = ofFloat2;
        ofFloat2.addUpdateListener(new ku(this, i7));
        this.e4.setInterpolator(org.telegram.ui.Components.kr.g);
        this.e4.setDuration(i10);
        this.e4.start();
        return this.e4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.q0 q0Var = this.n0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.t8));
        }
        if (this.Y2 == 0) {
            jw jwVar = this.D0;
            if (jwVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.w6(jwVar.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.n6.s1}, (org.telegram.ui.ActionBar.v6) null, !this.X ? org.telegram.ui.ActionBar.n6.A8 : org.telegram.ui.ActionBar.n6.Xl));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D8));
        } else {
            jw jwVar2 = this.D0;
            if (jwVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.w6(jwVar2.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.n6.s1}, (org.telegram.ui.ActionBar.v6) null, !this.X ? org.telegram.ui.ActionBar.n6.P8 : org.telegram.ui.ActionBar.n6.Xl));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.x8));
        NumberTextView numberTextView = this.j1;
        int i7 = org.telegram.ui.ActionBar.n6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        if (this.A0 != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar == null || !kVar.x()) {
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Components.oz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.mz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.mz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Components.oz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.xi));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.mz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.wi));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.mz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.vi));
            }
        }
        arrayList.addAll(c8.ta.a(new g6(7, this), org.telegram.ui.ActionBar.n6.w8, i7));
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 2) {
                jw jwVar3 = this.D0;
                if (jwVar3 == null) {
                    i10++;
                } else {
                    view = jwVar3.b0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.w6(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.w6(view2, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
                        int i11 = org.telegram.ui.Cells.y3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.w6(view2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.o6));
                    }
                    i10++;
                }
            } else {
                ax[] axVarArr = this.f0;
                if (axVarArr == null) {
                    i10++;
                } else {
                    view = i10 < axVarArr.length ? axVarArr[i10].a : null;
                    view2 = view;
                    if (view2 == null) {
                    }
                    i10++;
                }
            }
        }
        if (this.f0 != null) {
            int i12 = 0;
            while (true) {
                ax[] axVarArr2 = this.f0;
                if (i12 >= axVarArr2.length) {
                    break;
                }
                if (this.Y2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.w6(axVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.w6(axVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
                }
                int i13 = org.telegram.messenger.bz.a;
                int i14 = org.telegram.ui.ActionBar.n6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f0[i12].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f0[i12].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f0[i12].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
                this.f0[i12].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
                i12++;
            }
        }
        int i15 = 0;
        while (true) {
            UndoView[] undoViewArr = this.z0;
            if (i15 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(undoViewArr[i15], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.wj));
            i15++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.zj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Aj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Fj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Gj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ij));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Jj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Kj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Lj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Oj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Zh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Yh));
        jg.q0 q0Var2 = this.c0;
        if (q0Var2 != null) {
            arrayList.addAll(q0Var2.getThemeDescriptions());
            this.c0.updateColors();
        }
        dx dxVar = this.i0;
        if (dxVar != null) {
            dxVar.updateColors();
            this.i0.invalidate();
        }
        jw jwVar4 = this.D0;
        if (jwVar4 != null) {
            org.telegram.ui.Components.gm0 gm0Var = jwVar4.c0;
            SparseArray sparseArray = jwVar4.h;
            di.b1 b1Var = jwVar4.b0;
            for (int i16 = 0; i16 < b1Var.getChildCount(); i16++) {
                View childAt = b1Var.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.g6) || (childAt instanceof org.telegram.ui.Cells.u2) || (childAt instanceof org.telegram.ui.Cells.n4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.w6(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
                }
            }
            for (int i17 = 0; i17 < jwVar4.getChildCount(); i17++) {
                if (jwVar4.getChildAt(i17) instanceof b00) {
                    arrayList.addAll(((b00) jwVar4.getChildAt(i17)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view3 = (View) sparseArray.valueAt(i18);
                if (view3 instanceof b00) {
                    arrayList.addAll(((b00) view3).getThemeDescriptions());
                }
            }
            b00 b00Var = jwVar4.P0;
            if (b00Var != null) {
                arrayList.addAll(b00Var.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(gm0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.w6(gm0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.y6));
            arrayList.addAll(c8.ta.a(new org.telegram.ui.Components.w6(jwVar4, 4), org.telegram.ui.ActionBar.n6.y8));
        }
        org.telegram.ui.Cells.c3 c3Var = this.O1;
        int i19 = 5;
        if (c3Var != null) {
            arrayList.addAll(c8.ta.a(new org.telegram.ui.Components.w6(new ch(c3Var, 19), i19), org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.y6));
        }
        org.telegram.ui.Cells.pa paVar = this.P1;
        if (paVar != null) {
            arrayList.addAll(c8.ta.a(new org.telegram.ui.Components.w6(new ch(paVar, 20), i19), org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.y6, org.telegram.ui.ActionBar.n6.I6, org.telegram.ui.ActionBar.n6.q7));
        }
        org.telegram.ui.Cells.m mVar = this.N1;
        if (mVar != null) {
            arrayList.addAll(c8.ta.a(new org.telegram.ui.Components.w6(new ch(mVar, 21), i19), org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.y6, org.telegram.ui.ActionBar.n6.I6, org.telegram.ui.ActionBar.n6.q7));
        }
        return arrayList;
    }

    public final org.telegram.messenger.ro h4(ax axVar) {
        if (axVar == null) {
            return null;
        }
        int i7 = axVar.s;
        if (i7 == 7 || i7 == 8) {
            return getMessagesController().N[axVar.s == 8 ? (char) 1 : (char) 0];
        }
        return null;
    }

    public final void h5(long j3, View view) {
        int i7 = -this.N3;
        this.N3 = i7;
        org.telegram.messenger.g0.E3(i7, view, null);
        org.telegram.messenger.q2.E.a();
        String q10 = j3 >= 0 ? org.telegram.messenger.n10.q(org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(j3))) : "";
        (getMessagesController().K3() ? org.telegram.ui.Components.kc.b0(this).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743513, q10))) : org.telegram.ui.Components.kc.b0(this).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743513, q10)), org.telegram.messenger.gd.N0(2131743512, null), new fu(this, 15))).j();
    }

    public final float i4() {
        wv wvVar = this.H3;
        if (wvVar == null || !wvVar.c()) {
            return 0.0f;
        }
        return this.H3.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i5(boolean z10, boolean z11, boolean z12, boolean z13) {
        jw jwVar;
        jw jwVar2;
        sv svVar;
        jw jwVar3;
        boolean z14;
        jw jwVar4;
        boolean z15;
        org.telegram.ui.Components.j71 j71Var;
        TLRPC.Chat chat;
        wv wvVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i7 = 0;
        if (z10) {
            Y3();
        } else {
            y5(false);
        }
        int i10 = this.T0;
        if (i10 != 0 && i10 != 3) {
            z16 = false;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y1 = null;
        }
        this.s3 = z10;
        this.glassEngine.g();
        if (!z10) {
            q5(false, z16);
        }
        if (z10) {
            if (!this.v3 && !z13) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.n2 || (size <= 10 && !this.L)) {
                    z14 = true;
                    jwVar4 = this.D0;
                    if (jwVar4 != null) {
                        jwVar4.R0 = z14;
                    }
                    z15 = z14 || this.L;
                    this.u3 = z15;
                    if (z15) {
                        this.v3 = true;
                    }
                    j71Var = this.b0;
                    if (j71Var != null && jwVar4 != null && !z14 && this.a3 == 0) {
                        org.telegram.ui.Components.j71 k10 = jwVar4.k(-2, false);
                        this.b0 = k10;
                        this.a0.addView(k10, 0, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
                    } else if (this.a0 != null && z14 && this.a3 == 0) {
                        org.telegram.messenger.g0.E2(j71Var);
                        this.b0 = null;
                    }
                    if (this.D0 != null) {
                        S3(false);
                        this.D0.setKeyboardHeight(((uw) this.fragmentView).getKeyboardHeight());
                        jw jwVar5 = this.D0;
                        jwVar5.D0.clear();
                        jwVar5.J();
                    }
                    chat = this.b3;
                    if (chat == null) {
                        jg.o0 o0Var = new jg.o0(R.drawable.search_users_filled, 4, org.telegram.messenger.n5.u(chat));
                        o0Var.f = this.b3;
                        t3(o0Var);
                    } else if (this.Y2 != 0 && ((wvVar = this.H3) == null || !wvVar.c())) {
                        t3(new jg.o0(R.drawable.chats_archive, 2131754147, null, 7));
                    }
                }
            }
            z14 = false;
            jwVar4 = this.D0;
            if (jwVar4 != null) {
            }
            if (z14) {
            }
            this.u3 = z15;
            if (z15) {
            }
            j71Var = this.b0;
            if (j71Var != null) {
            }
            if (this.a0 != null) {
                org.telegram.messenger.g0.E2(j71Var);
                this.b0 = null;
            }
            if (this.D0 != null) {
            }
            chat = this.b3;
            if (chat == null) {
            }
        }
        if (z16 && (jwVar3 = this.D0) != null && jwVar3.e0.M()) {
            org.telegram.messenger.g0.k3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        }
        if (!z10 && (svVar = this.F0) != null && this.H0) {
            svVar.setVisibility(0);
        }
        Object[] objArr = org.telegram.messenger.bz.o() == 0 || !org.telegram.messenger.pc.e(32768);
        if (z16) {
            if (z10) {
                jw jwVar6 = this.D0;
                if (jwVar6 != null) {
                    jwVar6.setVisibility(0);
                    jw jwVar7 = this.D0;
                    jwVar7.setPosition(0);
                    if (jwVar7.e0.b() > 0) {
                        jwVar7.f0.h1(0, 0);
                    }
                    v4.c0 c0Var = jwVar7.k0;
                    if (c0Var != null) {
                        c0Var.h1(0, 0);
                    }
                    v4.c0 c0Var2 = jwVar7.p0;
                    if (c0Var2 != null) {
                        c0Var2.h1(0, 0);
                    }
                    v4.c0 c0Var3 = jwVar7.w0;
                    if (c0Var3 != null) {
                        c0Var3.h1(0, 0);
                    }
                    jwVar7.h.clear();
                }
                r5(true, null, null, false, false);
                org.telegram.ui.Components.j71 j71Var2 = this.b0;
                if (j71Var2 != null) {
                    j71Var2.b(false, false);
                }
            } else {
                this.f0[0].a.setVisibility(0);
                this.f0[0].setVisibility(0);
            }
            U4(true, true);
            this.f0[0].a.setVerticalScrollBarEnabled(false);
            jw jwVar8 = this.D0;
            if (jwVar8 != null) {
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, jwVar8, getResourceProvider());
            }
            this.y1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            ax axVar = this.f0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(axVar, (Property<ax, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.f0[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<ax, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<ax, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            wv wvVar2 = this.H3;
            if (wvVar2 != null) {
                wvVar2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.H3, (Property<wv, Float>) property, z10 ? 0.0f : 1.0f));
            }
            jw jwVar9 = this.D0;
            if (jwVar9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(jwVar9, (Property<jw, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.L) {
                    float L = org.telegram.messenger.g0.L(81.0f) + this.O + org.telegram.messenger.g0.L(48.0f);
                    jw jwVar10 = this.D0;
                    float f10 = z10 ? L : 0.0f;
                    if (z10) {
                        L = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(jwVar10, this.J3, f10, L));
                }
                if (objArr == true) {
                    this.D0.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<jw, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<jw, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.h0 != null) {
                u5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ku(this, i7));
            arrayList2.add(ofFloat);
            this.y1.playTogether(arrayList2);
            this.y1.setDuration(z10 ? 200L : 180L);
            this.y1.setInterpolator(org.telegram.ui.Components.kr.g);
            if (!z10) {
                this.y1.setStartDelay(20L);
            }
            this.y1.addListener(new cw(this, z10, i7));
            this.r3.d();
            this.y1.start();
        } else {
            U4(false, true);
            if (z10) {
                this.f0[0].a.c1();
            } else {
                xw xwVar = this.f0[0].a;
                if (xwVar.h1) {
                    xwVar.h1 = false;
                    xwVar.K0(false);
                }
            }
            this.f0[0].setAlpha(z10 ? 0.0f : 1.0f);
            if (objArr == true) {
                this.f0[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                this.f0[0].setScaleX(z10 ? 0.95f : 1.0f);
                this.f0[0].setScaleY(z10 ? 0.95f : 1.0f);
            }
            jw jwVar11 = this.D0;
            if (jwVar11 != null) {
                jwVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.D0.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    this.D0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.D0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.D0.setVisibility(z10 ? 0 : 8);
            }
            pw pwVar = this.Y;
            if (pwVar != null) {
                pwVar.setTranslationY(j4() + (z10 ? -org.telegram.messenger.g0.L(36.0f) : 0));
            }
            if (this.F0 != null) {
                if (!this.H0 || isInPreviewMode() || z10) {
                    this.F0.setVisibility(8);
                } else {
                    this.F0.setVisibility(0);
                }
            }
            X4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i11 = this.y;
        if (i11 >= 0 && (jwVar2 = this.D0) != null) {
            jwVar2.setPosition(jwVar2.L(i11));
        }
        if (!z10) {
            this.y = -1;
        }
        if (z10 && z11 && (jwVar = this.D0) != null) {
            jwVar.setPosition((jwVar.t0 ? 1 : 0) + 5);
            y5(true);
        }
        R3();
        o5();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        wv wvVar;
        return (this.l2 || (wvVar = this.H3) == null || wvVar.getFragment() == null) ? i0.a.h(getThemedColor(org.telegram.ui.ActionBar.n6.d6)) > 0.699999988079071d : this.H3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final float j4() {
        return -org.telegram.messenger.g0.W1(this.b.e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    public final void j5() {
        int i7;
        int i10;
        if (this.N0 != null || org.telegram.messenger.bz.x || (this.L && !this.F0.g())) {
            return;
        }
        h11[] h11VarArr = new h11[1];
        TLRPC.User f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).f();
        org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i7 = 0;
            i10 = 0;
        } else {
            this.F3.f();
            Drawable drawable = this.F3.f[0];
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
            i7 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i10 = L;
        }
        xv xvVar = new xv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), h11VarArr);
        if (f10 != null && org.telegram.messenger.n5.g(f10.emoji_status) > 0) {
            xvVar.setExpireDateHint(org.telegram.messenger.n5.g(f10.emoji_status));
        }
        Long l10 = this.D3;
        if (l10 != null) {
            xvVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.F3.f[0];
            xvVar.setSelected(drawable2 instanceof org.telegram.ui.Components.o5 ? Long.valueOf(((org.telegram.ui.Components.o5) drawable2).h()) : null);
        }
        xvVar.setSaveState(1);
        xvVar.y(this.F3, titleTextView);
        yv yvVar = new yv(this, xvVar);
        this.N0 = yvVar;
        h11VarArr[0] = yvVar;
        yvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
        h11VarArr[0].b();
    }

    @Override // org.telegram.ui.ke0
    public final ui.f k() {
        return this.p4;
    }

    public final fi.p6 k4() {
        return getMessagesController().R1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.H.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.g2, org.telegram.ui.bx] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a02;
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.I));
        boolean V = org.telegram.messenger.v3.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i7 = 1;
        int i10 = 2;
        String a03 = org.telegram.messenger.gd.a0(null, null, 2131754071, chat.title, org.telegram.messenger.n10.k(c22, true));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = a03;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754072, chat.title, org.telegram.messenger.n10.k(c22, true)));
        Boolean bool = this.H.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().C2(chat, c22)) {
            charSequence = r10;
        }
        if (this.H.bot_admin_rights == null) {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131754074, org.telegram.messenger.n10.k(c22, true), chat.title);
        } else {
            String k10 = org.telegram.messenger.n10.k(c22, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.H.bot_admin_rights;
            int i11 = org.telegram.ui.Cells.o6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.c0.r(1, V ? org.telegram.messenger.gd.N0(2131751312, null) : org.telegram.messenger.gd.N0(2131751311, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131751300, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131751307, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(V ? 2131751309 : 2131751304, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131751316, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131751318, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131751301, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131751319, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131751291, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131744660, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                org.telegram.ui.Cells.c0.r(1, org.telegram.messenger.gd.N0(2131748499, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((org.telegram.ui.Cells.p6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((org.telegram.ui.Cells.p6) arrayList.get(i12)).b.toString().toLowerCase());
                }
            }
            a02 = org.telegram.messenger.gd.a0(null, null, 2131754073, new Object[]{k10, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", org.telegram.messenger.g0.W2(a02));
        t1Var.U = TextUtils.concat(W2, charSequence);
        alertDialog$Builder.k(org.telegram.messenger.gd.a0("Send", null, 2131745444, new Object[0]), new ve(i7, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.a0("Cancel", null, 2131752577, new Object[0]), new ve(i10, runnable2));
        showDialog(t1Var);
    }

    public final UndoView l4() {
        Z3();
        UndoView[] undoViewArr = this.z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            uw uwVar = (uw) this.fragmentView;
            uwVar.removeView(undoViewArr[0]);
            uwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l5(boolean z10) {
        ax[] axVarArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            axVarArr = this.f0;
            if (i10 >= axVarArr.length) {
                break;
            }
            axVarArr[i10].a.C0();
            i10++;
        }
        char c10 = (!z10 || axVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i11 = axVarArr[c10].h;
        if (i11 < 0 || i11 >= getMessagesController().V0().size()) {
            return;
        }
        org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) getMessagesController().V0().get(this.f0[c10].h);
        if (roVar.d()) {
            ax axVar = this.f0[c10];
            axVar.s = this.T0;
            xw xwVar = axVar.a;
            int i12 = xw.C3;
            xwVar.D1();
        } else {
            ax[] axVarArr2 = this.f0;
            if (axVarArr2[c10 ^ 1].s == 7) {
                axVarArr2[c10].s = 8;
            } else {
                axVarArr2[c10].s = 7;
            }
            axVarArr2[c10].a.setScrollEnabled(true);
            org.telegram.messenger.mp messagesController = getMessagesController();
            char c11 = this.f0[c10].s == 8 ? (char) 1 : (char) 0;
            org.telegram.messenger.ro[] roVarArr = messagesController.N;
            org.telegram.messenger.ro roVar2 = roVarArr[c11];
            if (roVar2 != roVar) {
                roVarArr[c11] = roVar;
                int i13 = c11 ^ 1;
                if (roVarArr[i13] == roVar) {
                    roVarArr[i13] = null;
                }
                if (roVarArr[c11] != null) {
                    messagesController.f5(null);
                } else if (roVar2 != null) {
                    roVar2.k.clear();
                    roVar2.l.clear();
                }
            }
        }
        ax[] axVarArr3 = this.f0;
        if (axVarArr3.length > 1) {
            axVarArr3[1].F = roVar.p;
        }
        ax axVar2 = axVarArr3[c10];
        jv jvVar = axVar2.d;
        jvVar.h = axVar2.s;
        jvVar.f();
        ax axVar3 = this.f0[c10];
        fv fvVar = axVar3.c;
        if (axVar3.s == 0 && n4() && this.f0[c10].w == 2) {
            i7 = 1;
        }
        fvVar.h1(i7, (int) this.O);
        C3(this.f0[c10]);
    }

    public final org.telegram.messenger.ro m4() {
        ax[] axVarArr = this.f0;
        if (axVarArr != null && axVarArr[0] != null) {
            ArrayList V0 = getMessagesController().V0();
            int i7 = this.S3;
            if (i7 < 0) {
                i7 = this.f0[0].h;
            }
            if (i7 >= 0 && i7 < V0.size()) {
                return (org.telegram.messenger.ro) V0.get(i7);
            }
        }
        return null;
    }

    public final void m5() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        dz0 dz0Var = this.a0;
        float measuredHeight = (dz0Var == null || dz0Var.getVisibility() == 8) ? 0.0f : this.a0.getMeasuredHeight();
        float L = this.L ? org.telegram.messenger.g0.L(81.0f) : 0.0f;
        if (this.L) {
            float f17 = this.O;
            float f18 = this.z1;
            f10 = (measuredHeight * f18) + com.google.android.gms.internal.vision.e2.z(1.0f, f18, L, f17);
            f11 = this.z3;
        } else {
            f10 = (measuredHeight * this.z1) + this.O;
            f11 = this.z3;
        }
        float f19 = f10 + f11 + this.U;
        pw pwVar = this.Y;
        float L2 = org.telegram.messenger.g0.L(4.0f) * ((pwVar == null || pwVar.getVisibility() != 0) ? 0.0f : this.Y.getAlpha());
        qw qwVar = this.A0;
        if (qwVar != null) {
            qwVar.setTranslationY(f19 - L2);
            f13 = this.A0.getAlpha();
            f14 = (this.A0.getUnreadOnlyBannerHeight() + org.telegram.messenger.g0.L(43.0f)) * f13;
            f12 = f19 + f14;
        } else {
            f12 = f19;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        org.telegram.ui.Components.bs bsVar = this.L1;
        if (bsVar != null) {
            bsVar.setTranslationY(org.telegram.messenger.g0.T1(f12 - L2, (-org.telegram.messenger.g0.L(3.0f)) - (this.b0 == null ? org.telegram.messenger.g0.L(44.0f) : 0), this.b.e));
            f15 = this.L1.getMetadata().c.a;
            f16 = this.L1.d(0.0f);
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.as asVar = this.M1;
        if (asVar != null) {
            asVar.setTranslationY(f19 - L2);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f15, f13), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.as asVar2 = this.M1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f16 + f14) - W1);
            Matrix matrix = asVar2.b;
            if (asVar2.e != W1 || asVar2.f != min) {
                asVar2.e = W1;
                asVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = asVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                asVar2.invalidate();
            }
            this.M1.setAlpha(Math.max(f13, f15));
        }
    }

    public final boolean n4() {
        if (this.n2 || this.T0 != 0 || this.a3 != 0 || this.Y2 != 0) {
            return false;
        }
        org.telegram.messenger.mp messagesController = getMessagesController();
        messagesController.getClass();
        return org.telegram.messenger.bz.q1 && messagesController.R.f(2305843009213693952L | ((long) 1)) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x03e6, code lost:
    
        if (r1.isEmpty() == false) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0425  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n5(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.q0 q0Var;
        ?? r52;
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.q0 q0Var2;
        qw qwVar;
        org.telegram.ui.Components.lz e10;
        long j3;
        TLRPC.User c22;
        this.X2 = false;
        this.V2 = 0;
        this.S2 = 0;
        this.R2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.W2 = 0;
        this.T2 = 0;
        this.U2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.K2;
        int size = arrayList.size();
        long e11 = getUserConfig().e();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i7 < size) {
            ArrayList arrayList2 = arrayList;
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(((Long) arrayList.get(i7)).longValue());
            if (dialog == null) {
                j3 = e11;
            } else {
                j3 = e11;
                long j10 = dialog.id;
                boolean v42 = v4(dialog);
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().y2(j10)) {
                    this.W2++;
                }
                if (getMessagesController().u2(j10, 0L, null)) {
                    this.S2++;
                } else {
                    this.R2++;
                }
                if (z12) {
                    this.P2++;
                }
                if (this.Y2 == 1 || dialog.folder_id == 1) {
                    this.V2++;
                } else if (j10 != j3 && dialog.community_id == 0 && j10 != 777000 && !getMessagesController().I2(j10, false)) {
                    i13++;
                }
                if (dialog.community_id != 0) {
                    i11++;
                }
                if (!org.telegram.messenger.n5.E(j10) || j10 == j3 || j10 == 489000 || org.telegram.messenger.mp.L2(getMessagesController().c2(Long.valueOf(j10)))) {
                    i15++;
                } else if (org.telegram.messenger.f3.w("dialog_bar_report", j10, notificationsSettings, true)) {
                    this.U2++;
                }
                if (org.telegram.messenger.n5.y(dialog)) {
                    TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j10));
                    if (getMessagesController().I2(dialog.id, true)) {
                        this.T2++;
                        int i16 = getMessagesController().D2;
                        int i17 = org.telegram.messenger.mp.I8;
                        if (i16 == 1) {
                            i10++;
                            this.X2 = true;
                        }
                    } else {
                        if (v42) {
                            i14++;
                        } else {
                            this.Q2++;
                        }
                        if (O0 == null || !O0.megagroup) {
                            this.T2++;
                        } else if (org.telegram.messenger.v3.t0(O0)) {
                            this.T2++;
                        }
                        i10++;
                    }
                } else {
                    boolean z13 = org.telegram.messenger.n5.z(dialog.id);
                    if (z13) {
                        getMessagesController().O0(Long.valueOf(-dialog.id));
                    }
                    if (org.telegram.messenger.n5.C(dialog.id)) {
                        TLRPC.EncryptedChat c12 = getMessagesController().c1(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        c22 = c12 != null ? getMessagesController().c2(Long.valueOf(c12.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        c22 = (z13 || !org.telegram.messenger.n5.E(dialog.id)) ? null : getMessagesController().c2(Long.valueOf(dialog.id));
                    }
                    if (c22 != null && c22.bot) {
                        org.telegram.messenger.mp.L2(c22);
                    }
                    if (v42) {
                        i14++;
                    } else {
                        this.Q2++;
                    }
                }
                i12++;
                i10++;
            }
            i7++;
            arrayList = arrayList2;
            e11 = j3;
        }
        ArrayList arrayList3 = arrayList;
        org.telegram.ui.ActionBar.q0 q0Var3 = this.l1;
        if (q0Var3 != null) {
            if (i10 != size || i11 > 0) {
                q0Var3.setVisibility(8);
            } else {
                q0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = this.t1;
        if (y0Var2 != null) {
            int i18 = this.T2;
            if ((i18 == 0 || i18 == size) && ((i12 == 0 || i12 == size) && i11 <= 0)) {
                y0Var2.setVisibility(0);
                if (this.T2 != 0) {
                    this.t1.setText(org.telegram.messenger.gd.N0(2131752076, null));
                } else {
                    this.t1.setText(org.telegram.messenger.gd.N0(2131752077, null));
                }
            } else {
                y0Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.s1;
        if (y0Var3 != null && this.o1 != null) {
            if (this.V2 != 0 && i11 == 0 && this.a3 == 0) {
                String N0 = org.telegram.messenger.gd.N0(2131743668, null);
                this.s1.j(N0, R.drawable.msg_unarchive, null);
                this.o1.setIcon(R.drawable.msg_unarchive);
                this.o1.setContentDescription(N0);
                qw qwVar2 = this.A0;
                if (qwVar2 == null || qwVar2.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else if (i13 != 0 && i11 == 0 && this.a3 == 0) {
                String N02 = org.telegram.messenger.gd.N0(2131754169, null);
                this.s1.j(N02, R.drawable.msg_archive, null);
                this.o1.setIcon(R.drawable.msg_archive);
                this.o1.setContentDescription(N02);
                qw qwVar3 = this.A0;
                if (qwVar3 == null || qwVar3.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else {
                y0Var3.setVisibility(8);
                this.o1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var4 = this.m1;
        if (q0Var4 != null && this.p1 != null) {
            if (this.Q2 + i14 == size && this.a3 == 0) {
                qw qwVar4 = this.A0;
                if (qwVar4 == null || qwVar4.getVisibility() != 0) {
                    this.m1.setVisibility(0);
                    this.p1.setVisibility(8);
                } else {
                    this.p1.setVisibility(0);
                    this.m1.setVisibility(8);
                }
            } else {
                q0Var4.setVisibility(8);
                this.p1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var4 = this.v1;
        if (y0Var4 != null) {
            if (i15 != 0) {
                y0Var4.setVisibility(8);
            } else {
                y0Var4.setVisibility(0);
            }
        }
        if (this.r1 != null) {
            qw qwVar5 = this.A0;
            boolean z14 = qwVar5 == null || qwVar5.getVisibility() != 0 || ((e10 = (qwVar = this.A0).e()) != null && e10.a == qwVar.M);
            if (!z14) {
                try {
                    z14 = size >= d4(this.currentAccount, this.f0[0].d.h, this.Y2, this.U1).size();
                } catch (Exception unused) {
                }
            }
            if (!z14) {
                z11 = false;
                this.r1.setVisibility(0);
                if (this.q1 != null) {
                    if (this.Y2 != 1) {
                        if (this.A0 != null && e4(z11) > 0.5f) {
                            qw qwVar6 = this.A0;
                            org.telegram.ui.Components.lz e12 = qwVar6.e();
                            if (e12 != null && e12.a == qwVar6.M) {
                                int i19 = org.telegram.ui.Components.pz.x1;
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = getMessagesController().Q0;
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (i20 < size2) {
                                    org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) arrayList5.get(i20);
                                    ArrayList arrayList6 = arrayList3;
                                    if (!org.telegram.ui.Components.pz.K0(this, roVar, arrayList6, true, true).isEmpty() && !roVar.d()) {
                                        arrayList4.add(roVar);
                                    }
                                    i20++;
                                    arrayList3 = arrayList6;
                                }
                            }
                        }
                        this.q1.setVisibility(8);
                    }
                    this.q1.setVisibility(0);
                }
                q0Var = this.n1;
                if (q0Var != null) {
                    r52 = 0;
                } else if (this.S2 != 0) {
                    q0Var.setIcon(R.drawable.msg_unmute);
                    r52 = 0;
                    this.n1.setContentDescription(org.telegram.messenger.gd.N0(2131752153, null));
                } else {
                    r52 = 0;
                    q0Var.setIcon(R.drawable.msg_mute);
                    this.n1.setContentDescription(org.telegram.messenger.gd.N0(2131752163, null));
                }
                y0Var = this.u1;
                if (y0Var != 0) {
                    if (this.P2 != 0) {
                        y0Var.j(org.telegram.messenger.gd.N0(2131748488, r52), R.drawable.msg_markread, r52);
                        this.u1.setVisibility(0);
                    } else if (this.W2 == 0 && i11 == 0) {
                        y0Var.j(org.telegram.messenger.gd.N0(2131748487, r52), R.drawable.msg_markunread, r52);
                        this.u1.setVisibility(0);
                    } else {
                        y0Var.setVisibility(8);
                    }
                }
                q0Var2 = this.m1;
                if (q0Var2 != null || this.p1 == null) {
                }
                if (this.Q2 != 0) {
                    q0Var2.setIcon(R.drawable.msg_pin);
                    this.m1.setContentDescription(org.telegram.messenger.gd.N0(2131747043, null));
                    this.p1.setText(org.telegram.messenger.gd.N0(2131751441, null));
                    return;
                } else {
                    q0Var2.setIcon(R.drawable.msg_unpin);
                    this.m1.setContentDescription(org.telegram.messenger.gd.N0(2131743598, null));
                    this.p1.setText(org.telegram.messenger.gd.N0(2131751440, null));
                    return;
                }
            }
            this.r1.setVisibility(8);
        }
        z11 = false;
        if (this.q1 != null) {
        }
        q0Var = this.n1;
        if (q0Var != null) {
        }
        y0Var = this.u1;
        if (y0Var != 0) {
        }
        q0Var2 = this.m1;
        if (q0Var2 != null) {
        }
    }

    public final boolean o4() {
        ArrayList arrayList = this.F2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Runnable, org.telegram.ui.ActionBar.i6] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.util.LongSparseArray] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o5() {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.m mVar;
        wv wvVar;
        org.telegram.messenger.q9 q9Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i7;
        boolean z12;
        wv wvVar2;
        long j3;
        boolean z13;
        boolean z14;
        org.telegram.messenger.t1 b10;
        ?? r72;
        String G;
        long j10;
        final long j11;
        long j12;
        if (this.L1 == null || this.O1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.c3 c3Var = this.O1;
        boolean z15 = false;
        r7 = false;
        boolean z16 = false;
        if (c3Var != null) {
            try {
                ((org.telegram.ui.Components.nh0) ((org.telegram.ui.Components.a9) c3Var.h.getImageReceiver().n0).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.c3 c3Var2 = this.O1;
            c3Var2.setCompact(false);
            c3Var2.a(org.telegram.messenger.i10.t0, null);
            org.telegram.ui.Components.p9 p9Var = c3Var2.h;
            p9Var.setVisibility(8);
            p9Var.b();
        }
        long j13 = 0;
        final int i10 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().A2()) {
                this.O1.setOnClickListener(new hu(this, 12));
                this.O1.c(org.telegram.messenger.gd.N0(2131754700, null), org.telegram.messenger.gd.N0(2131754701, null), false, true);
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().V3.contains("SETUP_PASSKEY")) {
                this.O1.setOnClickListener(new hu(this, 19));
                this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.gd.N0(2131747436, null), this.O1.c, new yu(this, i10)), org.telegram.messenger.gd.N0(2131747437, null));
                this.O1.setOnCloseListener(new hu(this, 24));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().V3.contains("PREMIUM_GRACE")) {
                this.O1.setOnClickListener(new hu(this, 25));
                this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.gd.N0(2131749349, null), this.O1.c, new yu(this, i10)), org.telegram.messenger.gd.N0(2131749353, null));
                this.O1.setOnCloseListener(new hu(this, 26));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().X3 != null) {
                final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().X3;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                org.telegram.messenger.fj.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, this.O1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.O1.c.getPaint().getFontMetricsInt(), false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                org.telegram.messenger.fj.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                this.O1.b(B5, org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder2, this.O1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.O1.d.getPaint().getFontMetricsInt(), false));
                org.telegram.ui.Cells.c3 c3Var3 = this.O1;
                final int i11 = z15 ? 1 : 0;
                c3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zu
                    public final /* synthetic */ bx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                vf.c.t(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                break;
                            default:
                                bx.a0(this.b, tL_pendingSuggestion);
                                break;
                        }
                    }
                });
                this.O1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zu
                    public final /* synthetic */ bx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                vf.c.t(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                break;
                            default:
                                bx.a0(this.b, tL_pendingSuggestion);
                                break;
                        }
                    }
                });
            } else {
                if (this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                    di.y8 y10 = di.y8.y(this.currentAccount, false);
                    ArrayList arrayList = y10.z;
                    if (!arrayList.isEmpty()) {
                        long j14 = -y10.f.amount;
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i12);
                            long j15 = j13;
                            long o4 = org.telegram.messenger.n5.o(starsSubscription.peer);
                            if (o4 >= j15) {
                                if (getMessagesController().c2(Long.valueOf(o4)) == null) {
                                    i12++;
                                    j13 = j15;
                                }
                                j14 += starsSubscription.pricing.amount;
                                i12++;
                                j13 = j15;
                            } else {
                                if (getMessagesController().O0(Long.valueOf(-o4)) == null) {
                                    i12++;
                                    j13 = j15;
                                }
                                j14 += starsSubscription.pricing.amount;
                                i12++;
                                j13 = j15;
                            }
                        }
                        long j16 = j13;
                        if (j14 > j16) {
                            di.y8 y11 = di.y8.y(this.currentAccount, false);
                            ArrayList arrayList2 = y11.z;
                            StringBuilder sb2 = new StringBuilder();
                            if (arrayList2.isEmpty()) {
                                j10 = j16;
                                j11 = j10;
                                j12 = j11;
                            } else {
                                int i13 = 0;
                                long j17 = j16;
                                j11 = j17;
                                j10 = j11;
                                while (i13 < arrayList2.size()) {
                                    TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i13);
                                    TLRPC.Peer peer = starsSubscription2.peer;
                                    boolean z17 = z16 ? 1 : 0;
                                    long o10 = org.telegram.messenger.n5.o(peer);
                                    if (j11 == j10) {
                                        j11 = o10;
                                    }
                                    if (o10 >= j10) {
                                        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(o10));
                                        if (c22 != null) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(org.telegram.messenger.n10.q(c22));
                                            j17 += starsSubscription2.pricing.amount;
                                            i13++;
                                            z16 = z17 ? 1 : 0;
                                        } else {
                                            i13++;
                                            z16 = z17 ? 1 : 0;
                                        }
                                    } else {
                                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-o10));
                                        if (O0 != null) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(O0.title);
                                            j17 += starsSubscription2.pricing.amount;
                                            i13++;
                                            z16 = z17 ? 1 : 0;
                                        } else {
                                            i13++;
                                            z16 = z17 ? 1 : 0;
                                        }
                                    }
                                }
                                j12 = j17;
                            }
                            boolean z18 = z16;
                            final String sb3 = sb2.toString();
                            final long j18 = j12;
                            this.O1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.av
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    bx bxVar = bx.this;
                                    new di.fb(bxVar.getParentActivity(), bxVar.getResourceProvider(), j18, 2, sb3, new fu(bxVar, 11), j11).show();
                                }
                            });
                            org.telegram.ui.Cells.c3 c3Var4 = this.O1;
                            long j19 = j18 - y11.f.amount;
                            if (j19 > j10) {
                                j18 = j19;
                            }
                            Object[] objArr = new Object[1];
                            objArr[z18 ? 1 : 0] = sb3;
                            c3Var4.b(di.pb.b1(z18, org.telegram.messenger.gd.K("StarsSubscriptionExpiredHintTitle2", (int) j18, ',', objArr), 0.72f, null), org.telegram.messenger.gd.N0(2131744748, null));
                            this.O1.setOnCloseListener(new hu(this, 13));
                        } else {
                            j3 = j16;
                            if (this.Y2 != 0 && this.a3 == j3 && !getMessagesController().k7 && (b10 = org.telegram.messenger.v1.a(this.currentAccount).b()) != null && !b10.c.isEmpty() && !getMessagesController().W3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(this.currentAccount).b();
                                ArrayList arrayList3 = b11.c;
                                int i14 = 14;
                                this.O1.setOnClickListener(new org.telegram.ui.Components.p31(i14, this, b11));
                                this.O1.a(this.currentAccount, arrayList3);
                                org.telegram.ui.Cells.c3 c3Var5 = this.O1;
                                if (arrayList3.size() == 1) {
                                    r72 = 0;
                                    G = org.telegram.messenger.gd.a0(null, null, 2131753703, org.telegram.messenger.n10.l((TLRPC.User) arrayList3.get(0)));
                                } else {
                                    r72 = 0;
                                    G = org.telegram.messenger.gd.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                                }
                                c3Var5.b(org.telegram.messenger.j6.p(org.telegram.messenger.g0.R2(G, org.telegram.ui.ActionBar.n6.I6, 2, r72, r72), this.O1.c, new yu(this, i10)), org.telegram.messenger.gd.a0(null, null, arrayList3.size() == 1 ? 2131753704 : 2131753707, new Object[0]));
                                this.O1.setOnCloseListener(new hu(this, i14));
                                di.y8.y(this.currentAccount, false).T();
                            } else if (this.Y2 != 0 && this.a3 == j3 && org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("BIRTHDAY_SETUP") && getMessagesController().d2(getUserConfig().e()) != null && getMessagesController().d2(getUserConfig().e()).birthday == null) {
                                org.telegram.messenger.i5.r(this.currentAccount).D(false);
                                this.O1.setOnClickListener(new hu(this, 15));
                                this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.gd.N0(2131753709, null), this.O1.c, new yu(this, i10)), org.telegram.messenger.gd.a0(null, null, 2131753710, new Object[0]));
                                this.O1.setOnCloseListener(new hu(this, 16));
                            } else {
                                int i15 = 20;
                                if (!((org.telegram.messenger.mp.u1(this.currentAccount).K3() && this.Y2 == 0 && this.a3 == j3) ? org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("PREMIUM_CHRISTMAS") : false)) {
                                    this.O1.setOnClickListener(new bi.o(i15));
                                    this.O1.b(org.telegram.messenger.j6.m(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131749500, null), org.telegram.ui.ActionBar.n6.I6, 2, null, null), null, false, null, 0), org.telegram.messenger.gd.a0(null, null, 2131753328, new Object[0]));
                                    this.O1.setOnCloseListener(new hu(this, 17));
                                } else if (!org.telegram.messenger.mp.u1(this.currentAccount).K3() && this.Y2 == 0 && this.a3 == j3 && org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("PREMIUM_RESTORE") && !getUserConfig().q() && org.telegram.messenger.ri.d0(this.currentAccount).i0(false) != null) {
                                    this.O1.setOnClickListener(new hu(this, 18));
                                    this.O1.b(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131745868, org.telegram.messenger.ri.d0(this.currentAccount).i0(false)), org.telegram.ui.ActionBar.n6.I6, 2, null, null), org.telegram.messenger.gd.N0(2131745869, null));
                                } else {
                                    if (org.telegram.messenger.mp.u1(this.currentAccount).K3() || this.Y2 != 0 || this.a3 != j3 || ((!(org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("PREMIUM_UPGRADE") && getUserConfig().q()) && (!org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("PREMIUM_ANNUAL") || getUserConfig().q())) || (!org.telegram.messenger.i10.i(this.currentAccount).q() ? org.telegram.messenger.ri.d0(this.currentAccount).i0(false) == null : org.telegram.messenger.s2.b() || org.telegram.messenger.ri.d0(this.currentAccount).i0(true) == null))) {
                                        z13 = false;
                                    } else {
                                        this.C3 = org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("PREMIUM_UPGRADE");
                                        z13 = true;
                                    }
                                    if (z13) {
                                        this.O1.setOnClickListener(new hu(this, i15));
                                        this.O1.b(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, this.C3 ? 2131745738 : 2131743559, org.telegram.messenger.ri.d0(this.currentAccount).i0(false)), org.telegram.ui.ActionBar.n6.I6, 2, null, null), org.telegram.messenger.gd.N0(this.C3 ? 2131743562 : 2131745739, null));
                                    } else {
                                        if (this.Q1 != null && this.R1 != null) {
                                            if (r0.longValue() / this.R1.longValue() < 0.3f) {
                                                org.telegram.messenger.mp.g1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                            } else if (System.currentTimeMillis() > org.telegram.messenger.mp.g1().getLong("cache_hint_showafter", j3)) {
                                                z14 = true;
                                                if (!z14) {
                                                    this.O1.setOnClickListener(new hu(this, 21));
                                                    this.O1.b(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131752036, org.telegram.messenger.g0.i0(this.Q1.longValue(), false, false)), org.telegram.ui.ActionBar.n6.I6, 2, null, null), org.telegram.messenger.gd.N0(2131752037, null));
                                                } else if (this.Y2 == 0 && this.a3 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("USERPIC_SETUP"))) {
                                                    this.O1.setOnClickListener(new hu(this, 22));
                                                    this.O1.h.setVisibility(0);
                                                    org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                                                    a9Var.setBounds(0, 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
                                                    long e10 = getUserConfig().e();
                                                    a9Var.A = true;
                                                    a9Var.b = true;
                                                    a9Var.c = false;
                                                    int i16 = org.telegram.ui.ActionBar.n6.p8[org.telegram.ui.Components.a9.e(e10)];
                                                    org.telegram.ui.ActionBar.i6 i6Var = a9Var.z;
                                                    a9Var.d = org.telegram.ui.ActionBar.n6.w0(i16, i6Var);
                                                    a9Var.e = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q8[org.telegram.ui.Components.a9.e(e10)], i6Var);
                                                    a9Var.n = 0;
                                                    a9Var.m = false;
                                                    org.telegram.ui.Components.a9.a("", "", "", a9Var.q);
                                                    a9Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.O1.h.setImageDrawable(a9Var);
                                                    this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.gd.N0(2131749108, null), this.O1.c, new yu(this, i10)), org.telegram.messenger.gd.N0(2131749107, null));
                                                    this.O1.setOnCloseListener(new hu(this, 23));
                                                } else {
                                                    if (this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.t0.a != null) {
                                                        for (String str : org.telegram.messenger.mp.u1(this.currentAccount).V3) {
                                                            org.telegram.messenger.t0.a.getClass();
                                                        }
                                                    }
                                                    z15 = false;
                                                }
                                            }
                                        }
                                        z14 = false;
                                        if (!z14) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!y10.A) {
                        y10.A = true;
                        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                        tL_getStarsSubscriptions.missing_balance = true;
                        tL_getStarsSubscriptions.offset = "";
                        ConnectionsManager.getInstance(y10.a).sendRequest(tL_getStarsSubscriptions, new di.s7(y10, z15 ? 1 : 0));
                    }
                }
                j3 = 0;
                if (this.Y2 != 0) {
                }
                if (this.Y2 != 0) {
                }
                int i152 = 20;
                if (!((org.telegram.messenger.mp.u1(this.currentAccount).K3() && this.Y2 == 0 && this.a3 == j3) ? org.telegram.messenger.mp.u1(this.currentAccount).V3.contains("PREMIUM_CHRISTMAS") : false)) {
                }
            }
            z15 = true;
        }
        wv wvVar3 = this.H3;
        te.a aVar = this.b;
        if ((wvVar3 != null && wvVar3.c()) || aVar.f) {
            z15 = false;
        }
        this.L1.j(this.O1, z15, true);
        B3(true);
        if (this.fragmentView == null || this.L1 == null) {
            z10 = false;
        } else {
            boolean z19 = !isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0 && !getMessagesController().W1().b.isEmpty() && ((wvVar2 = this.H3) == null || !wvVar2.c()) && !aVar.f;
            if (z19) {
                if (this.P1 == null) {
                    org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(getParentActivity());
                    this.P1 = paVar;
                    this.L1.addView(paVar);
                }
                org.telegram.ui.Cells.pa paVar2 = this.P1;
                int i17 = this.currentAccount;
                TextView textView = paVar2.b;
                TextView textView2 = paVar2.c;
                ArrayList arrayList4 = org.telegram.messenger.mp.u1(i17).W1().b;
                org.telegram.ui.Cells.oa oaVar = paVar2.d;
                oaVar.setText(org.telegram.messenger.gd.N0(2131743663, null));
                oaVar.a(false, false);
                org.telegram.ui.Cells.oa oaVar2 = paVar2.e;
                oaVar2.setText(org.telegram.messenger.gd.N0(2131743653, null));
                oaVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z10 = false;
                    } else {
                        textView.setText(org.telegram.messenger.gd.N0(2131743644, null));
                        String str2 = ((org.telegram.messenger.e10) arrayList4.get(0)).f;
                        int i18 = 1;
                        while (true) {
                            if (i18 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str2, ((org.telegram.messenger.e10) arrayList4.get(i18)).f)) {
                                str2 = null;
                                break;
                            }
                            i18++;
                        }
                        if (str2 == null) {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.gd.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.gd.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str2));
                        }
                    }
                    z12 = z10;
                } else {
                    org.telegram.messenger.e10 e10Var = (org.telegram.messenger.e10) arrayList4.get(0);
                    boolean z20 = e10Var.a;
                    String str3 = e10Var.f;
                    boolean z21 = true;
                    textView.setText(org.telegram.messenger.gd.N0(z20 ? 2131743643 : 2131743644, null));
                    String str4 = "" + e10Var.e;
                    if (!TextUtils.isEmpty(str3) && !str4.isEmpty()) {
                        str4 = str4.concat(", ");
                    }
                    String v = p5.c.v(str4, str3);
                    if (e10Var.a) {
                        textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131743645, "@" + org.telegram.messenger.n5.t(e10Var.c), v));
                    } else {
                        textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131743646, v));
                        z21 = false;
                    }
                    z12 = z21;
                    z10 = false;
                }
                oaVar.setOnClickListener(new org.telegram.ui.Cells.na(this, z12, i17, arrayList4));
                oaVar2.setOnClickListener(new bi.k5(paVar2, i17, arrayList4, 4));
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.pa paVar3 = this.P1;
            if (paVar3 != null) {
                this.L1.j(paVar3, z19, true);
            }
        }
        if (this.fragmentView == null || this.L1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0) {
            org.telegram.messenger.u9 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().h7;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ?? arrayList5 = new ArrayList();
                    ?? r73 = giftAuctionsController.b;
                    int size = r73.size();
                    for (?? r92 = z10; r92 < size; r92++) {
                        org.telegram.messenger.r9 r9Var = (org.telegram.messenger.r9) r73.valueAt(r92);
                        org.telegram.messenger.q9 q9Var2 = r9Var.b;
                        if (q9Var2 != null && !q9Var2.f() && (tL_starGiftAuctionState = (q9Var = r9Var.b).f) != null && (i7 = q9Var.e.bid_date) > 0) {
                            arrayList5.add(Long.valueOf(tL_starGiftAuctionState.version | (i7 << 32)));
                        }
                    }
                    Collections.sort(arrayList5);
                    int size2 = arrayList5.size();
                    long j20 = 0;
                    for (?? r52 = z10; r52 < size2; r52++) {
                        Long l10 = (Long) arrayList5.get(r52);
                        j20 = org.telegram.messenger.ri.r(org.telegram.messenger.ri.r(j20, l10.longValue() & 4294967295L), l10.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j20;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new d3.b(1), new org.telegram.messenger.d(giftAuctionsController, 2));
                }
            }
            if (!giftAuctionsController.c.isEmpty() && (((wvVar = this.H3) == null || !wvVar.c()) && !aVar.f)) {
                z11 = true;
                if (z11 && this.N1 == null) {
                    org.telegram.ui.Cells.m mVar2 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                    this.N1 = mVar2;
                    this.L1.addView(mVar2);
                }
                mVar = this.N1;
                if (mVar == null) {
                    this.L1.j(mVar, z11, true);
                    return;
                }
                return;
            }
        }
        z11 = z10;
        if (z11) {
            org.telegram.ui.Cells.m mVar22 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
            this.N1 = mVar22;
            this.L1.addView(mVar22);
        }
        mVar = this.N1;
        if (mVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.H3.c() || !this.H3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.x60 x60Var = this.M0;
            if (x60Var == null) {
                qw qwVar = this.A0;
                if (qwVar == null || !qwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.x()) {
                        if (!this.b.f) {
                            qw qwVar2 = this.A0;
                            if (qwVar2 != null && qwVar2.getVisibility() == 0 && !this.j3) {
                                qw qwVar3 = this.A0;
                                if (!qwVar3.P && !this.o3) {
                                    ArrayList arrayList = qwVar3.h;
                                    if (!arrayList.isEmpty() && qwVar3.M != ((org.telegram.ui.Components.lz) arrayList.get(0)).a) {
                                        if (z10) {
                                            qw qwVar4 = this.A0;
                                            ArrayList arrayList2 = qwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                qwVar4.g((org.telegram.ui.Components.lz) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            mv mvVar = this.D1;
                            if (mvVar == null || !mvVar.T0()) {
                                sv svVar = this.F0;
                                if (svVar.P != 0 || svVar.T.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                svVar.h.y0(0);
                                return false;
                            }
                            if (z10) {
                                this.D1.L0(true);
                            }
                        } else if (z10) {
                            this.Y.r.getText().clear();
                            this.Z.b(false);
                            this.Y.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        jw jwVar = this.D0;
                        if (jwVar != null && jwVar.getVisibility() == 0) {
                            this.D0.P(false);
                        }
                        p4(true);
                        return false;
                    }
                } else if (z10) {
                    qwVar.setIsEditing(false);
                    c5(false);
                    return false;
                }
            } else if (z10) {
                x60Var.v();
                this.M0 = null;
                return false;
            }
        } else if (z10) {
            this.H3.a();
            jw jwVar2 = this.D0;
            if (jwVar2 != null) {
                jwVar2.Q();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyHidden() {
        tv tvVar;
        qw qwVar;
        if (this.X1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                jw jwVar = this.D0;
                if (jwVar != null) {
                    jwVar.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (qwVar = this.A0) != null && qwVar.getVisibility() == 0 && this.r.f) {
            int i7 = (int) (-this.O);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.f0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (tvVar = this.L0) != null && tvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.s0 = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        hi.u3 u3Var;
        super.onBecomeFullyVisible();
        if (t4()) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z10 = g12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.mp.g1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                g12.edit().putBoolean("archivehint", false).commit();
                a5();
            }
        }
        if (this.s0 && !this.t0 && (u3Var = this.q0) != null && this.P3) {
            this.t0 = true;
            this.s0 = false;
            u3Var.x();
        }
        org.telegram.messenger.g0.h3(new yu(this, 0), 200L);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.x60 x60Var = this.M0;
        if (x60Var != null) {
            x60Var.v();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.t1 t1Var;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (t1Var = this.V1) != null && dialog == t1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.n2 = bundle.getBoolean("onlySelect", false);
            this.o2 = this.arguments.getBoolean("canSelectTopics", false);
            this.s2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.T0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.S0 = this.arguments.getLong("forward_into_channel", 0L);
            this.h2 = this.arguments.getString("selectAlertString");
            this.i2 = this.arguments.getString("selectAlertStringGroup");
            this.j2 = this.arguments.getString("addToGroupAlertString");
            this.t2 = this.arguments.getBoolean("allowSwitchAccount");
            this.u2 = this.arguments.getBoolean("checkCanWrite", true);
            this.v2 = this.arguments.getBoolean("afterSignup", false);
            this.Y2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.a3 = j3;
            if (j3 != 0) {
                this.b3 = getMessagesController().O0(Long.valueOf(this.a3));
                this.c3 = getMessagesController().P0(this.a3);
            }
            this.k2 = this.arguments.getBoolean("resetDelegate", true);
            this.U0 = this.arguments.getInt("messagesCount", 0);
            this.V0 = this.arguments.getInt("hasPoll", 0);
            this.W0 = this.arguments.getBoolean("hasInvoice", false);
            this.w2 = this.arguments.getBoolean("showSetPasswordConfirm", this.w2);
            this.arguments.getInt("otherwiseRelogin");
            this.x2 = this.arguments.getBoolean("allowGroups", true);
            this.y2 = this.arguments.getBoolean("allowMegagroups", true);
            this.z2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.A2 = this.arguments.getBoolean("allowChannels", true);
            this.B2 = this.arguments.getBoolean("allowUsers", true);
            this.C2 = this.arguments.getBoolean("allowBots", true);
            this.D2 = this.arguments.getBoolean("closeFragment", true);
            this.G = this.arguments.getBoolean("allowGlobalSearch", true);
            this.X = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.H = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.I = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.T0 == 0) {
            this.W1 = org.telegram.messenger.mp.h1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.bz.u();
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new xi.e(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.f(org.telegram.messenger.ks.l4);
            if (!this.n2) {
                this.L3.f(org.telegram.messenger.ks.L4);
                this.L3.f(org.telegram.messenger.ks.D4);
                this.L3.c(org.telegram.messenger.ks.R2);
                this.L3.c(org.telegram.messenger.ks.d2);
            }
            xi.e eVar = this.L3;
            eVar.c(org.telegram.messenger.ks.s);
            eVar.c(org.telegram.messenger.ks.O2);
            eVar.c(org.telegram.messenger.ks.P2);
            eVar.c(org.telegram.messenger.ks.Q2);
            eVar.c(org.telegram.messenger.ks.r);
            eVar.c(org.telegram.messenger.ks.Y);
            eVar.c(org.telegram.messenger.ks.O);
            eVar.c(org.telegram.messenger.ks.I2);
            eVar.c(org.telegram.messenger.ks.h0);
            eVar.c(org.telegram.messenger.ks.f0);
            eVar.c(org.telegram.messenger.ks.J);
            eVar.c(org.telegram.messenger.ks.K);
            eVar.c(org.telegram.messenger.ks.M);
            eVar.c(org.telegram.messenger.ks.P0);
            eVar.c(org.telegram.messenger.ks.s0);
            eVar.c(org.telegram.messenger.ks.t5);
            eVar.c(org.telegram.messenger.ks.S0);
            eVar.c(org.telegram.messenger.ks.T1);
            eVar.c(org.telegram.messenger.ks.e5);
            eVar.c(org.telegram.messenger.ks.K2);
            eVar.c(org.telegram.messenger.ks.d0);
            eVar.c(org.telegram.messenger.ks.s1);
            eVar.c(org.telegram.messenger.ks.b5);
            eVar.c(org.telegram.messenger.ks.c5);
            eVar.c(org.telegram.messenger.ks.N);
            eVar.c(org.telegram.messenger.ks.p5);
            eVar.c(org.telegram.messenger.ks.i5);
            this.L3.f(org.telegram.messenger.ks.n0);
        }
        xi.e eVar2 = this.L3;
        eVar2.c(org.telegram.messenger.ks.w);
        eVar2.c(org.telegram.messenger.ks.V4);
        eVar2.c(org.telegram.messenger.ks.d5);
        eVar2.c(org.telegram.messenger.ks.T);
        eVar2.c(org.telegram.messenger.ks.O4);
        eVar2.c(org.telegram.messenger.ks.w5);
        eVar2.c(org.telegram.messenger.ks.y5);
        eVar2.c(org.telegram.messenger.ks.b3);
        eVar2.c(org.telegram.messenger.ks.f3);
        eVar2.c(org.telegram.messenger.ks.j5);
        eVar2.c(org.telegram.messenger.ks.A3);
        eVar2.c(org.telegram.messenger.ks.C3);
        eVar2.c(org.telegram.messenger.ks.V5);
        eVar2.c(org.telegram.messenger.ks.W5);
        eVar2.c(org.telegram.messenger.ks.S3);
        eVar2.c(org.telegram.messenger.ks.T3);
        if (this.T0 == 0) {
            this.L3.c(org.telegram.messenger.ks.C5);
            this.L3.c(org.telegram.messenger.ks.P1);
        }
        z4(getAccountInstance());
        fi.p6 R1 = getMessagesController().R1();
        if (!R1.A) {
            R1.W();
            if (!R1.s) {
                ConnectionsManager.getInstance(R1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new fi.o5(R1, r3));
            }
        }
        getMessagesController().h3(this.Y2);
        if (this.V3 != null && !getMessagesStorage().R) {
            qt qtVar = this.V3;
            if (qtVar.getParent() != null) {
                ((ViewGroup) qtVar.getParent()).removeView(qtVar);
            }
            this.V3 = null;
        }
        if (t4()) {
            fi.p6 R12 = getMessagesController().R1();
            if (R12.z) {
                R12.T(true);
            }
        } else {
            getMessagesController().R1().W();
        }
        getContactsController().B();
        if (getMessagesController().r6) {
            org.telegram.messenger.pv I1 = getMessagesController().I1();
            if (!I1.e) {
                I1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().b3(0, this.a3, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a10.b;
            boolean z10 = j10 == 0;
            if (!z10) {
                long j11 = currentTimeMillis - j10;
                boolean z11 = org.telegram.messenger.s2.a;
                z10 = j11 > ((long) 43200000);
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z10 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
            }
            if (z10) {
                a10.e = true;
                ConnectionsManager.getInstance(a10.a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, r3));
            }
        }
        this.m4 = this.X ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.n4 = this.X ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void onFragmentDestroy() {
        org.telegram.messenger.g0.r(this.R3);
        super.onFragmentDestroy();
        xi.e eVar = this.L3;
        if (eVar != null) {
            eVar.b();
            this.L3 = null;
        }
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.d1();
        }
        org.telegram.ui.Components.dp0 dp0Var = this.I2;
        if (dp0Var != null) {
            dp0Var.j();
        }
        org.telegram.ui.Components.voip.o oVar = this.J2;
        if (oVar != null) {
            org.telegram.messenger.g0.r(oVar);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i7 = org.telegram.ui.Components.p10.m1;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPanTranslationUpdate(float f10) {
        if (this.f0 == null) {
            return;
        }
        this.K0 = f10;
        mv mvVar = this.D1;
        int i7 = 0;
        if (mvVar == null || !mvVar.T0()) {
            while (true) {
                ax[] axVarArr = this.f0;
                if (i7 >= axVarArr.length) {
                    break;
                }
                axVarArr[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.fc fcVar = this.q3;
                if (fcVar != null) {
                    fcVar.l();
                }
            }
            jw jwVar = this.D0;
            if (jwVar != null) {
                jwVar.setTranslationY(this.K0 + this.J0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            ax[] axVarArr2 = this.f0;
            if (i7 >= axVarArr2.length) {
                break;
            }
            axVarArr2[i7].setTranslationY(0.0f);
            i7++;
        }
        if (!this.n2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.fc fcVar2 = this.q3;
            if (fcVar2 != null) {
                fcVar2.l();
            }
        }
        jw jwVar2 = this.D0;
        if (jwVar2 != null) {
            jwVar2.setTranslationY(this.J0);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.fc fcVar = this.T;
        if (fcVar != null) {
            fcVar.b();
            this.T = null;
        }
        wv wvVar = this.H3;
        if (wvVar != null) {
            wvVar.r = true;
            dw dwVar = wvVar.a;
            if (dwVar != null) {
                dwVar.onPause();
            }
        }
        org.telegram.ui.Components.x60 x60Var = this.M0;
        if (x60Var != null) {
            x60Var.v();
        }
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.f1();
        }
        int i7 = 0;
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f0 == null) {
            return;
        }
        while (true) {
            ax[] axVarArr = this.f0;
            if (i7 >= axVarArr.length) {
                return;
            }
            axVarArr[i7].d.getClass();
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i7 != 1) {
            if (i7 == 4) {
                for (int i10 : iArr) {
                    if (i10 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (b9Var = FilesMigrationService.e) == null) {
                    return;
                }
                b9Var.J0();
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (iArr.length > i11) {
                String str = strArr[i11];
                str.getClass();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.xs.t(this.currentAccount).Y();
                            break;
                        } else {
                            hh0.J0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.ec.D().i(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.g0.g3(new fu(this, 29));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.h1().edit();
                            this.W1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.B0) {
            this.B0 = false;
            d5();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        ax axVar;
        jv jvVar;
        org.telegram.ui.Components.mm0 mm0Var;
        tv tvVar;
        super.onResume();
        sv svVar = this.F0;
        if (svVar != null) {
            ArrayList arrayList = svVar.y;
            fi.p6 p6Var = svVar.s;
            p6Var.l(p6Var.g);
            p6Var.l(p6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = p6Var.y(((fi.n) arrayList.get(i7)).c);
                if (y10 != null) {
                    p6Var.a0(y10);
                }
            }
        }
        wv wvVar = this.H3;
        if (wvVar != null) {
            wvVar.r = false;
            dw dwVar = wvVar.a;
            if (dwVar != null) {
                dwVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (tvVar = this.L0) != null && tvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i10 = 0;
            while (true) {
                ax[] axVarArr = this.f0;
                if (i10 >= axVarArr.length) {
                    break;
                }
                axVarArr[i10].d.f();
                i10++;
            }
        }
        if (this.Q3) {
            this.Q3 = false;
            getMessagesController().f5(null);
            if (this.f0 != null) {
                int i11 = 0;
                while (true) {
                    ax[] axVarArr2 = this.f0;
                    if (i11 >= axVarArr2.length) {
                        break;
                    }
                    axVarArr2[i11].d.f();
                    i11++;
                }
            }
        }
        C5(-1, false);
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.g1();
        }
        int i12 = 4;
        long j3 = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().D(4);
        }
        jw jwVar = this.D0;
        if (jwVar != null && (mm0Var = jwVar.e0) != null) {
            mm0Var.f();
        }
        boolean z10 = this.v2 || getUserConfig().a0 == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.Y2 == 0 && this.a3 == 0 && this.e2 && !this.n2) {
            int i13 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.e2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i13 <= 28 || org.telegram.messenger.s2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i13 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                org.telegram.messenger.k4 k4Var = new org.telegram.messenger.k4(this, z13, z11, z12, parentActivity);
                if (this.v2 && (z11 || z13)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.h3(k4Var, j3);
            }
        } else if (!this.n2 && this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.c6.i() && !org.telegram.messenger.c6.g()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.mp.h1().getBoolean("askedAboutMiuiLockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                int i14 = org.telegram.ui.ActionBar.n6.L5;
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(i14), null);
                alertDialog$Builder.n(i14, getResourceProvider());
                String N0 = org.telegram.messenger.gd.N0(2131747104, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.U = N0;
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747106, null), new iu(this, 10));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751760, null), new org.telegram.ui.Components.ub0(24));
                showDialog(t1Var);
            }
        } else if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.mp.h1().getBoolean("askedAboutFSILockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                int i15 = org.telegram.ui.ActionBar.n6.L5;
                alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(i15), null);
                alertDialog$Builder2.n(i15, getResourceProvider());
                String N02 = org.telegram.messenger.gd.N0(2131747120, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.U = N02;
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747106, null), new iu(this, 11));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131751760, null), new org.telegram.ui.Components.ub0(25));
                showDialog(t1Var2);
            }
        }
        d5();
        if (this.f0 != null) {
            int i16 = 0;
            while (true) {
                ax[] axVarArr3 = this.f0;
                if (i16 >= axVarArr3.length) {
                    break;
                }
                ax axVar2 = axVarArr3[i16];
                if (axVar2.s == 0 && axVar2.w == 2 && axVar2.c.L0() == 0 && n4()) {
                    this.f0[i16].c.h1(1, (int) this.O);
                }
                if (i16 == 0) {
                    this.f0[i16].d.getClass();
                } else {
                    this.f0[i16].d.getClass();
                }
                i16++;
            }
        }
        f5();
        setBulletinDelegate(new z8(this, i12));
        if (this.s3) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        }
        D5(0, false);
        u5(false, true);
        B5(false);
        D3();
        N3();
        if (this.A0 == null || (axVar = this.f0[0]) == null || (jvVar = axVar.d) == null) {
            return;
        }
        int i17 = jvVar.h;
        if (i17 == 7 || i17 == 8) {
            org.telegram.messenger.ro roVar = getMessagesController().N[i17 != 7 ? (char) 1 : (char) 0];
            if (roVar != null) {
                this.A0.i(roVar.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.bz.o() <= 0) {
            boolean z11 = org.telegram.messenger.s2.a;
        } else if (this.d4 && this.e4 == null) {
            Z4(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            y3();
            p5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        tv tvVar;
        bx bxVar;
        wv wvVar = this.H3;
        if (wvVar == null || !wvVar.c()) {
            if (z10 && (tvVar = this.L0) != null && tvVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z10 && this.v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).w0.c(false);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (bxVar = this.Z2) != null) {
            bxVar.removeSelfFromStack();
        }
        N3();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        wv wvVar = this.H3;
        if (wvVar == null || !wvVar.c()) {
            tv tvVar = this.L0;
            if (tvVar != null && tvVar.getVisibility() == 0) {
                if (z10) {
                    this.L0.setAlpha(1.0f - f10);
                } else {
                    this.L0.setAlpha(f10);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationProgress(z10, f10);
        }
        N3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p4(boolean z10) {
        boolean z11;
        this.actionBar.w();
        this.K2.clear();
        org.telegram.ui.ActionBar.x1 x1Var = this.g1;
        int i7 = 1;
        if (x1Var != null) {
            x1Var.c(true, 0.0f);
        }
        qw qwVar = this.A0;
        if (qwVar != null) {
            qwVar.c(org.telegram.ui.ActionBar.n6.K8, org.telegram.ui.ActionBar.n6.I8, org.telegram.ui.ActionBar.n6.J8, org.telegram.ui.ActionBar.n6.L8, org.telegram.ui.ActionBar.n6.d6);
        }
        ValueAnimator valueAnimator = this.x3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (this.w3 == 0.0f) {
            return;
        }
        W4(-f4());
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ax[] axVarArr = this.f0;
            if (i11 >= axVarArr.length) {
                break;
            }
            ax axVar = axVarArr[i11];
            if (axVar != null) {
                axVar.a.I0(true);
            }
            i11++;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.L ? 81 : 0) + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new ju(this, max, i7));
        this.x3.addListener(new ew(this, max, i10));
        this.x3.setInterpolator(org.telegram.ui.Components.kr.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) arrayList.get(i12);
                jz.z0(roVar, roVar.g, roVar.b, roVar.c, roVar.n, roVar.m, roVar.h, roVar.i, roVar.j, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                i10 = 0;
                i7 = 1;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().u4(this.Y2, 0L, null);
            z11 = 0;
            this.b1 = false;
        } else {
            z11 = 0;
        }
        n5(true);
        if (this.f0 != null) {
            int i13 = z11;
            while (true) {
                ax[] axVarArr2 = this.f0;
                if (i13 >= axVarArr2.length) {
                    break;
                }
                axVarArr2[i13].d.I = z11;
                i13++;
            }
        }
        int i14 = org.telegram.messenger.mp.I8;
        int i15 = z11;
        if (z10) {
            i15 = TLObject.FLAG_13;
        }
        D5(i15 | 196608, true);
    }

    public final void p5() {
        di.b1 b1Var;
        xw xwVar;
        try {
            mv mvVar = this.D1;
            if (mvVar != null && mvVar.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ne));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.y8));
            }
            qw qwVar = this.A0;
            int i7 = 0;
            if (qwVar != null && (qwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                ((GradientDrawable) this.A0.getSelectorDrawable()).setColor(getThemedColor(kVar != null && kVar.x() ? org.telegram.ui.ActionBar.n6.xi : org.telegram.ui.ActionBar.n6.K8));
                this.A0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    kVar2.L(getThemedColor(org.telegram.ui.ActionBar.n6.Q8), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.R8), true);
                }
                if (this.actionBar.x()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                }
                v5();
            }
            if (this.f0 != null) {
                while (true) {
                    ax[] axVarArr = this.f0;
                    if (i7 >= axVarArr.length) {
                        break;
                    }
                    ax axVar = axVarArr[i7];
                    if (axVar != null && (xwVar = axVar.a) != null) {
                        xwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                    }
                    i7++;
                }
            }
            jw jwVar = this.D0;
            if (jwVar != null && (b1Var = jwVar.b0) != null) {
                b1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            }
            oi.w1 w1Var = this.E1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            }
            hi.u3 u3Var = this.q0;
            if (u3Var != null) {
                u3Var.j(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            }
            hi.u3 u3Var2 = this.r0;
            if (u3Var2 != null) {
                u3Var2.j(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.d4 = true;
            V4(true);
        } else {
            this.e4 = null;
            this.d4 = false;
            V4(false);
            Z4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        boolean presentFragment = super.presentFragment(g2Var);
        if (presentFragment && this.f0 != null) {
            int i7 = 0;
            while (true) {
                ax[] axVarArr = this.f0;
                if (i7 >= axVarArr.length) {
                    break;
                }
                axVarArr[i7].d.getClass();
                i7++;
            }
        }
        hi.u3 u3Var = this.q0;
        if (u3Var != null) {
            u3Var.f(true);
        }
        hi.u3 u3Var2 = this.r0;
        if (u3Var2 != null) {
            u3Var2.f(true);
        }
        org.telegram.ui.Components.fc.e();
        return presentFragment;
    }

    public final void q4(boolean z10) {
        if (this.H3.c()) {
            z10 = true;
        }
        if (z10 && this.d2) {
            return;
        }
        this.Y3 = z10;
        t5(true);
        if (z10) {
            hi.u3 u3Var = this.q0;
            if (u3Var != null) {
                u3Var.f(true);
            }
            hi.u3 u3Var2 = this.r0;
            if (u3Var2 != null) {
                u3Var2.f(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x031c  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        org.telegram.messenger.ro roVar;
        boolean z12;
        boolean z13;
        Object[] objArr;
        boolean z14;
        boolean z15;
        if (this.A0 == null || this.inPreviewMode || this.s3) {
            return;
        }
        wv wvVar = this.H3;
        if (wvVar == null || !wvVar.c()) {
            org.telegram.ui.Components.x60 x60Var = this.M0;
            String str = null;
            if (x60Var != null) {
                x60Var.v();
                this.M0 = null;
            }
            ArrayList V0 = getMessagesController().V0();
            int size = V0.size();
            te.a aVar = this.r;
            boolean z16 = false;
            if (size <= 1) {
                r52 = 0;
                if (this.A0.getVisibility() != 8) {
                    this.A0.setIsEditing(false);
                    c5(false);
                    this.p3 = false;
                    if (this.o3) {
                        this.o3 = false;
                        this.f0[0].setTranslationX(0.0f);
                        this.f0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.f0[0].h != this.A0.getDefaultTabId()) {
                        this.f0[0].h = this.A0.getDefaultTabId();
                        jv jvVar = this.f0[0].d;
                        jvVar.h = 0;
                        jvVar.f();
                        ax axVar = this.f0[0];
                        axVar.s = this.T0;
                        axVar.d.f();
                    }
                    this.f0[1].setVisibility(8);
                    ax axVar2 = this.f0[1];
                    axVar2.h = 0;
                    jv jvVar2 = axVar2.d;
                    jvVar2.h = 0;
                    jvVar2.f();
                    ax axVar3 = this.f0[1];
                    axVar3.s = this.T0;
                    axVar3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z17 = (this.isPaused || this.V3 != null) ? false : z11;
                        if (!this.s3) {
                            aVar.a(false, z17);
                        }
                    }
                    int i7 = 0;
                    while (true) {
                        ax[] axVarArr = this.f0;
                        if (i7 >= axVarArr.length) {
                            break;
                        }
                        ax axVar4 = axVarArr[i7];
                        if (axVar4.s == 0 && axVar4.w == 2 && n4() && ((L0 = this.f0[i7].c.L0()) == 0 || L0 == 1)) {
                            this.f0[i7].c.h1(1, (int) this.O);
                        }
                        this.f0[i7].a.setScrollingTouchSlop(0);
                        this.f0[i7].a.requestLayout();
                        this.f0[i7].requestLayout();
                        i7++;
                    }
                    this.A0.M = -1;
                    r52 = 0;
                }
            } else if (z10 || this.A0.getVisibility() != 0) {
                boolean z18 = this.A0.getVisibility() != 0 ? false : z11;
                this.x = true;
                boolean isEmpty = this.A0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z19 = (this.isPaused || this.V3 != null) ? false : z11;
                    if (!this.s3) {
                        aVar.a(this.x, z19);
                    }
                }
                int currentTabId = this.A0.getCurrentTabId();
                int currentTabStableId = this.A0.getCurrentTabStableId();
                if (currentTabId == this.A0.getDefaultTabId() || currentTabId < V0.size()) {
                    objArr = false;
                } else {
                    this.A0.M = -1;
                    objArr = true;
                }
                qw qwVar = this.A0;
                qwVar.h.clear();
                qwVar.k0.clear();
                qwVar.m0.clear();
                qwVar.n0.clear();
                qwVar.o0.clear();
                qwVar.p0.clear();
                qwVar.N = 0;
                int size2 = V0.size();
                int i10 = 0;
                while (i10 < size2) {
                    if (((org.telegram.messenger.ro) V0.get(i10)).d()) {
                        this.A0.b(i10, 0, org.telegram.messenger.gd.N0(2131750795, str), null, false, true, ((org.telegram.messenger.ro) V0.get(i10)).p);
                        z15 = z16;
                    } else {
                        org.telegram.messenger.ro roVar2 = (org.telegram.messenger.ro) V0.get(i10);
                        z15 = z16;
                        this.A0.b(i10, roVar2.o, roVar2.b, roVar2.c, roVar2.n, false, ((org.telegram.messenger.ro) V0.get(i10)).p);
                    }
                    i10++;
                    z16 = z15;
                    str = null;
                }
                boolean z20 = z16;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.A0.i(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            qw qwVar2 = this.A0;
                            if (qwVar2.i(qwVar2.l0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = z20 ? 1 : 0;
                        }
                    }
                    if (this.A0.l0.get(this.f0[z20 ? 1 : 0].h, -1) != currentTabStableId) {
                        this.f0[z20 ? 1 : 0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i11 = z20 ? 1 : 0;
                while (true) {
                    ax[] axVarArr2 = this.f0;
                    if (i11 >= axVarArr2.length) {
                        break;
                    }
                    if (axVarArr2[i11].h >= V0.size()) {
                        this.f0[i11].h = V0.size() - 1;
                    }
                    this.f0[i11].a.setScrollingTouchSlop(1);
                    i11++;
                }
                qw qwVar3 = this.A0;
                qwVar3.G.setItemAnimator(z18 ? qwVar3.t0 : null);
                qwVar3.J.f();
                if (isEmpty) {
                    l5(z20);
                }
                qw qwVar4 = this.A0;
                int currentTabId2 = qwVar4.getCurrentTabId();
                ArrayList arrayList = qwVar4.h;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        z14 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.lz) arrayList.get(i12)).a == currentTabId2) {
                            z14 = ((org.telegram.ui.Components.lz) arrayList.get(i12)).f;
                            break;
                        }
                        i12++;
                    }
                }
                if (z14) {
                    qw qwVar5 = this.A0;
                    ArrayList arrayList2 = qwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        qwVar5.g((org.telegram.ui.Components.lz) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            n5(r52);
            int i13 = this.f0[r52].s;
            if ((i13 == 7 || i13 == 8) && (roVar = getMessagesController().N[i13 - 7]) != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= V0.size()) {
                        z12 = false;
                        break;
                    }
                    org.telegram.messenger.ro roVar3 = (org.telegram.messenger.ro) V0.get(i14);
                    if (roVar3 != null && roVar3.a == roVar.a) {
                        z12 = true;
                        break;
                    }
                    i14++;
                }
                if (!z12) {
                    z13 = false;
                    l5(false);
                    C5(-1, this.A0.getVisibility() != 0 ? z13 : true);
                }
            }
            z13 = false;
            C5(-1, this.A0.getVisibility() != 0 ? z13 : true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r5(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        jw jwVar;
        boolean z13;
        org.telegram.ui.Components.j71 j71Var;
        if (!this.s3 || this.n2 || (jwVar = this.D0) == null) {
            return;
        }
        ArrayList<jg.o0> currentSearchFilters = jwVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i7 = 0; i7 < currentSearchFilters.size(); i7++) {
            if (currentSearchFilters.get(i7).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i7).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i7).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i7).d == 7) {
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
                this.c0.D1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.c0.D1(null, null, false);
                }
                if (!z12) {
                    this.c0.getAdapter().f();
                }
                j71Var = this.b0;
                if (j71Var != null) {
                    j71Var.b(z13, true);
                }
                this.c0.setEnabled(z13);
                this.s.a(z13, true);
            }
        }
        z13 = false;
        if (!z13) {
        }
        if (!z12) {
        }
        j71Var = this.b0;
        if (j71Var != null) {
        }
        this.c0.setEnabled(z13);
        this.s.a(z13, true);
    }

    public final boolean s3(long j3, View view) {
        if (this.n2 && getMessagesController().y2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).e0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).x(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view).e0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.g6) {
            ((org.telegram.ui.Cells.g6) view).x(true, true);
        }
        return true;
    }

    public final boolean s4() {
        return this.A0 != null && this.T0 == 0 && !this.n2 && this.Y2 == 0 && this.a3 == 0 && getMessagesController().q2();
    }

    public final void s5() {
        float f10 = (((-this.k4) - this.n4) - this.w1) - this.x1;
        org.telegram.ui.Components.a10 a10Var = this.u0;
        if (a10Var != null) {
            a10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.a10 a10Var2 = this.v0;
        if (a10Var2 != null) {
            a10Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            hi.u3 u3Var = this.q0;
            if (u3Var != null) {
                u3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        sv svVar = this.F0;
        if (svVar != null) {
            if (!this.H0 || z10) {
                svVar.setVisibility(8);
            } else {
                svVar.setVisibility(0);
            }
        }
        t5(true);
        o5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        yv yvVar;
        org.telegram.ui.Components.m5 m5Var;
        super.setTitleOverlayText(str, i7, runnable);
        if (this.actionBar != null && (yvVar = this.N0) != null && (yvVar.getContentView() instanceof q11)) {
            org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
            q11 q11Var = (q11) this.N0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                m5Var = this.F3;
            }
            m5Var = null;
            q11Var.y(m5Var, titleTextView);
        }
        sv svVar = this.F0;
        if (svVar != null) {
            org.telegram.ui.Components.n6 n6Var = svVar.U;
            svVar.V.b(i7 == 2131751793 ? org.telegram.messenger.g0.I2(org.telegram.messenger.gd.N0(2131743868, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            if (str != null) {
                svVar.h0 = true;
                if (svVar.i0 != i7) {
                    svVar.i0 = i7;
                    n6Var.c(org.telegram.messenger.gd.N0(i7, str), !org.telegram.messenger.gd.a0, true);
                }
            } else {
                svVar.h0 = false;
                svVar.i0 = 0;
                n6Var.c(svVar.g0, !org.telegram.messenger.gd.a0, true);
            }
            svVar.a.a(svVar.h0, true);
            svVar.M0.z(n6Var);
        }
    }

    public final void t3(jg.o0 o0Var) {
        jw jwVar;
        if (!this.s3 || (jwVar = this.D0) == null) {
            return;
        }
        ArrayList arrayList = jwVar.D0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (o0Var.b((jg.o0) arrayList.get(i7))) {
                    return;
                }
            }
        }
        arrayList.add(o0Var);
        pw pwVar = this.Y;
        pwVar.G.add(o0Var);
        pwVar.J = r1.size() - 1;
        pwVar.e();
        this.Y.r.getText().clear();
        r5(true, null, null, false, true);
    }

    public final boolean t4() {
        return this.Y2 == 1;
    }

    public final void t5(boolean z10) {
        boolean z11 = this.n2;
        boolean z12 = (!z11 || this.T0 == 10) && this.Y2 == 0 && this.a3 == 0 && !this.inPreviewMode && (!this.l2 || z11) && !this.Y3;
        org.telegram.ui.Components.a10 a10Var = this.u0;
        if (a10Var != null) {
            a10Var.e(z12, z10);
        }
        org.telegram.ui.Components.a10 a10Var2 = this.v0;
        if (a10Var2 != null) {
            a10Var2.e(z12, z10);
        }
    }

    public final void u3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && hh0.K0(parentActivity)) {
            if (z10) {
                showDialog(new hh0(parentActivity, !c8.oa.a(), new ru(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.v(parentActivity, new wu(this, 0)).a;
                this.V1 = t1Var;
                showDialog(t1Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i7 <= 28 || org.telegram.messenger.s2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!arrayList.isEmpty()) {
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        } else if (this.B0) {
            this.B0 = false;
            d5();
        }
    }

    public final boolean u4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
        if (!org.telegram.messenger.n10.v(c22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.mp.u1(this.currentAccount).t7.l(-c22.id);
        return (l10 == null || l10.isEmpty()) && org.telegram.messenger.mp.u1(this.currentAccount).t7.e(-c22.id);
    }

    public final void u5(boolean z10, boolean z11) {
        boolean z12;
        if (this.o0 != null) {
            org.telegram.ui.ActionBar.q0 q0Var = this.n0;
            if (q0Var == null || q0Var.getVisibility() != 0) {
                int i7 = 0;
                while (true) {
                    if (i7 >= getDownloadController().H.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().S(((org.telegram.messenger.fj) getDownloadController().H.get(i7)).S0())) {
                            z12 = true;
                            break;
                        }
                        i7++;
                    }
                }
                if (getDownloadController().J.size() > 0 || z12 || (this.h0.getVisibility() == 0 && this.h0.getAlpha() == 1.0f && !z11)) {
                    this.j0 = true;
                } else {
                    this.j0 = false;
                }
                J3();
                boolean z13 = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i10 = this.f2;
                boolean z14 = i10 == 3 || i10 == 5;
                this.p0.setSubtext(org.telegram.messenger.gd.N0(z13 ? z14 ? 2131748415 : 2131748414 : 2131748413, null));
                this.o0.b(z13, z14, z10);
            }
        }
    }

    @Override // org.telegram.ui.ke0
    public final void v() {
        R4(true, true);
    }

    public final void v3(CharSequence charSequence) {
        if (this.D1 == null) {
            return;
        }
        if (this.F2 == null && this.G2 == null && this.H2 == null) {
            return;
        }
        int i7 = 0;
        if (this.I2 == null) {
            org.telegram.ui.Components.dp0 dp0Var = new org.telegram.ui.Components.dp0(getParentActivity(), getResourceProvider());
            this.I2 = dp0Var;
            dp0Var.setLayoutClickListener(new hu(this, i7));
            this.I2.setOnModeChangeListener(new iu(this, i7));
            mv mvVar = this.D1;
            org.telegram.ui.Components.dp0 dp0Var2 = this.I2;
            if (dp0Var2 == null) {
                mvVar.getClass();
            } else {
                mvVar.w2 = dp0Var2;
                mvVar.addView(dp0Var2, 0, c8.na.e(-1, 48, 51));
                mvVar.W3 = false;
                mvVar.S();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
            layoutParams.rightMargin = -this.D1.getPaddingRight();
            this.I2.setLayoutParams(layoutParams);
        }
        if (o4()) {
            this.I2.i(this.currentAccount, this.F2);
        } else {
            String str = this.G2;
            if (str != null) {
                org.telegram.ui.Components.dp0 dp0Var3 = this.I2;
                dp0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    dp0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.H2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.dp0 dp0Var4 = this.I2;
                    dp0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        dp0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.D1.setFieldText(charSequence);
        }
        this.D1.setOverrideHint(org.telegram.messenger.gd.N0(o4() ? 2131754451 : 2131745266, null));
        H3();
        if (this.I2.getMode() != 0) {
            this.D1.e2(false, false);
        }
        x5();
    }

    public final boolean v4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i7 = this.f0[0].s;
        org.telegram.messenger.ro roVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            roVar = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return roVar != null ? roVar.j.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void v5() {
        if (!this.u3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.Y2 == 0 && this.a3 == 0) ? org.telegram.ui.ActionBar.n6.v8 : org.telegram.ui.ActionBar.n6.O8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.y8;
        kVar.F(i0.a.f(this.z1, themedColor, getThemedColor(i7)), false);
        this.actionBar.F(i0.a.f(this.z1, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.E(i0.a.f(this.z1, getThemedColor((this.Y2 == 0 && this.a3 == 0) ? org.telegram.ui.ActionBar.n6.t8 : org.telegram.ui.ActionBar.n6.N8), getThemedColor(org.telegram.ui.ActionBar.n6.z8)), false);
    }

    public final int w3() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        }
        if (this.a3 == 0) {
            return this.k4 + this.m4;
        }
        return org.telegram.messenger.g0.L(72.0f) + this.k4;
    }

    public final boolean w4(int i7) {
        if (i7 == 0) {
            return s4();
        }
        if ((i7 == 7 || i7 == 8) && this.T0 == 0) {
            if (getMessagesController().x2(getMessagesController().N[i7 == 8 ? (char) 1 : (char) 0])) {
                return true;
            }
        }
        return false;
    }

    public final void w5() {
        org.telegram.ui.Components.dp0 dp0Var;
        mv mvVar = this.D1;
        ArrayList arrayList = this.K2;
        if (mvVar == null) {
            if (this.T0 == 10) {
                q4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        x5();
        if (arrayList.isEmpty()) {
            String N0 = org.telegram.messenger.gd.N0((this.T0 == 3 && this.h2 == null) ? 2131750558 : 2131745473, null);
            if (this.U3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(N0);
            } else {
                this.actionBar.N(N0, true, 350L, org.telegram.ui.Components.kr.h);
            }
            if (this.D1.getTag() != null) {
                this.D1.M0(false, false, false);
                this.D1.U();
                this.D1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.D1.getTag() == null) {
                if (!o4() && this.G2 == null) {
                    this.D1.setFieldText("");
                }
                this.D1.setTag(1);
                if (!this.a4 && (dp0Var = this.I2) != null) {
                    this.a4 = true;
                    String N02 = org.telegram.messenger.gd.N0(2131745233, null);
                    dp0Var.j();
                    dp0Var.G = N02;
                    hi.s1 s1Var = dp0Var.a[0];
                    if (N02 != null) {
                        ((org.telegram.ui.ActionBar.n5) s1Var.f).l(N02, false);
                    }
                    org.telegram.ui.Components.eb0 eb0Var = new org.telegram.ui.Components.eb0(dp0Var, 29);
                    dp0Var.H = eb0Var;
                    org.telegram.messenger.g0.h3(eb0Var, 1000L);
                }
            }
            this.E1.e(Math.max(1, arrayList.size()), true);
            int i7 = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i10 = 0;
            long j3 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                long P1 = getMessagesController().P1(longValue);
                if (P1 <= 0 && longValue > 0) {
                    P1 = org.telegram.messenger.n5.k(getMessagesController().P2(longValue));
                }
                j3 += P1;
            }
            this.E1.i(i7, j3, true);
            this.D1.B2();
            if (this.U3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(org.telegram.messenger.gd.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                this.actionBar.N(org.telegram.messenger.gd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.kr.h);
            }
        }
        this.U3 = arrayList.isEmpty();
    }

    public final boolean x3() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i7 >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-((Long) arrayList.get(i7)).longValue()));
            if (O0 != null && !org.telegram.messenger.v3.l(O0)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean x4() {
        return this.E2 == null && this.p2 == null;
    }

    public final void x5() {
        org.telegram.ui.Components.dp0 dp0Var = this.I2;
        if (dp0Var == null) {
            return;
        }
        int i7 = this.currentAccount;
        dp0Var.h(i7);
        dp0Var.d = org.telegram.messenger.i10.i(org.telegram.messenger.c.a(i7).a).e();
        ArrayList arrayList = dp0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.K2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        hi.s1 s1Var = dp0Var.a[0];
        if (dp0Var.b == 1) {
            ((org.telegram.ui.ActionBar.n5) s1Var.e).l(dp0Var.c(s1Var), false);
        }
    }

    public final void y3() {
        int themedColor;
        org.telegram.ui.Components.nf0 nf0Var;
        iv ivVar;
        org.telegram.ui.Components.mm0 mm0Var;
        d61 d61Var;
        jw jwVar = this.D0;
        if (jwVar != null && (mm0Var = jwVar.e0) != null && (d61Var = mm0Var.l0) != null) {
            int childCount = d61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = d61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.p4) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) childAt;
                    org.telegram.ui.Components.a9 a9Var = p4Var.c;
                    int i10 = p4Var.h;
                    if (org.telegram.messenger.n5.E(p4Var.f)) {
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(p4Var.f));
                        p4Var.e = c22;
                        a9Var.r(c22);
                    } else {
                        a9Var.q(org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-p4Var.f)));
                        p4Var.e = null;
                    }
                    p4Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i11 = 0;
            while (true) {
                ax[] axVarArr = this.f0;
                if (i11 >= axVarArr.length) {
                    break;
                }
                ax axVar = axVarArr[i11];
                if (axVar != null && (ivVar = axVar.n) != null) {
                    ivVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.H(getThemedColor(org.telegram.ui.ActionBar.n6.G8), true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.E8), false, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.F8), true, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.n6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.qi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.B4) {
                this.B4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.m5 m5Var = this.F3;
            if (m5Var != null) {
                m5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.c3 c3Var = this.O1;
        if (c3Var != null) {
            org.telegram.ui.ActionBar.n6.H1(c3Var.getBackground(), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i6, false), true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.n0;
        if (q0Var != null) {
            q0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.n6.v8));
        }
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.updateColors();
        }
        qw qwVar = this.A0;
        if (qwVar != null) {
            fh.g gVar = qwVar.F0;
            if (gVar != null) {
                gVar.updateColors();
            }
            di.n4 n4Var = qwVar.z0;
            if (n4Var != null) {
                n4Var.g();
            }
            qwVar.invalidate();
        }
        jg.q0 q0Var2 = this.c0;
        if (q0Var2 != null) {
            q0Var2.updateColors();
        }
        jw jwVar2 = this.D0;
        if (jwVar2 != null && (nf0Var = jwVar2.s0) != null) {
            nf0Var.c();
        }
        org.telegram.ui.Components.j71 j71Var = this.b0;
        if (j71Var != null) {
            j71Var.updateColors();
        }
        dz0 dz0Var = this.a0;
        if (dz0Var != null) {
            dz0Var.updateColors();
        }
        if (this.L0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.n6.d6), 100);
            if (!(this.L0.getForeground() instanceof ColorDrawable)) {
                this.L0.setForeground(new ColorDrawable(o4));
            } else if (((ColorDrawable) this.L0.getForeground()).getColor() != o4) {
                ((ColorDrawable) this.L0.getForeground()).setColor(o4);
            }
        }
        org.telegram.ui.Components.a10 a10Var = this.u0;
        if (a10Var != null) {
            a10Var.updateColors();
        }
        org.telegram.ui.Components.a10 a10Var2 = this.v0;
        if (a10Var2 != null) {
            a10Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.n6.d6;
        this.r4.a(getThemedColor(i12));
        org.telegram.ui.Components.bs bsVar = this.L1;
        if (bsVar != null) {
            bsVar.updateColors();
        }
        org.telegram.ui.Components.as asVar = this.M1;
        if (asVar != null) {
            asVar.setColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        }
        kv kvVar = this.J1;
        if (kvVar != null) {
            kvVar.updateColors();
        }
        kv kvVar2 = this.H1;
        if (kvVar2 != null) {
            kvVar2.updateColors();
        }
        v5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        sv svVar = this.F0;
        if (svVar != null) {
            svVar.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Xl)) != this.A4) {
            this.A4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        pw pwVar = this.Y;
        if (pwVar != null) {
            pwVar.updateColors();
        }
    }

    public final boolean y4(ax axVar) {
        return axVar != null && w4(axVar.s);
    }

    public final void y5(boolean z10) {
        boolean z11;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z12 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z11 = false;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
            if (fjVar.F0() != null && fjVar.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().I;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj2;
            if (fjVar2.F0() != null && fjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().K3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final void z3() {
        org.telegram.messenger.g0.h3(new yu(this, 13), 300L);
    }

    public final void z5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.m5 m5Var;
        sv svVar = this.F0;
        org.telegram.ui.Components.m5 m5Var2 = null;
        if (svVar != null && (m5Var = svVar.b0) != null && svVar.r0 != null) {
            Long i7 = org.telegram.messenger.n10.i(user);
            if (i7 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                m5Var.j(i7.longValue(), z10);
                m5Var.m(z11, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.mp.u1(svVar.f);
                    if (org.telegram.messenger.mp.H2(user)) {
                        if (svVar.O0 == null) {
                            svVar.O0 = svVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            svVar.O0 = new fi.h(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), svVar.O0);
                        }
                        Drawable drawable = svVar.O0;
                        int i10 = org.telegram.ui.ActionBar.n6.qi;
                        bx bxVar = svVar.f0;
                        org.telegram.ui.ActionBar.u6.x(svVar, drawable, i10, bxVar != null ? bxVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        m5Var.g(svVar.O0, z10);
                        m5Var.m(false, z10);
                    }
                }
                m5Var.g(null, z10);
                m5Var.m(false, z10);
            }
            m5Var.k(Integer.valueOf(svVar.f(org.telegram.ui.ActionBar.n6.qi)));
            svVar.a0.invalidate();
        }
        if (this.F3 == null || this.actionBar == null) {
            return;
        }
        Long i11 = org.telegram.messenger.n10.i(user);
        this.D3 = null;
        if (i11 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.F3.j(i11.longValue(), z10);
            this.F3.m(z12, z10);
            if (z12) {
                this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new hu(this, 1));
            q11.t(this.currentAccount);
        } else {
            if (user != null) {
                org.telegram.messenger.mp.u1(this.currentAccount);
                if (org.telegram.messenger.mp.H2(user)) {
                    if (this.M3 == null) {
                        this.M3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.M3 = new hw(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.M3);
                    }
                    Drawable drawable2 = this.M3;
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.qi);
                    this.B4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.F3.g(this.M3, z10);
                    this.F3.m(false, z10);
                    this.actionBar.setRightDrawableOnClick(new hu(this, 2));
                    q11.t(this.currentAccount);
                }
            }
            this.F3.g(null, z10);
            this.F3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        }
        org.telegram.ui.Components.m5 m5Var3 = this.F3;
        int i12 = org.telegram.ui.ActionBar.n6.qi;
        m5Var3.k(Integer.valueOf(getThemedColor(i12)));
        org.telegram.ui.Cells.o oVar = this.G3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i12));
        }
        yv yvVar = this.N0;
        if (yvVar == null || !(yvVar.getContentView() instanceof q11)) {
            return;
        }
        org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
        q11 q11Var = (q11) this.N0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.m5 m5Var4 = this.F3;
            if (rightDrawable == m5Var4) {
                m5Var2 = m5Var4;
            }
        }
        q11Var.y(m5Var2, titleTextView);
    }
}
