package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ki extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is, org.telegram.ui.ActionBar.o2, te.b {
    public static final /* synthetic */ int I4 = 0;
    public boolean A1;
    public final kg.j A2;
    public final RadialProgressView A3;
    public boolean A4;
    public boolean B1;
    public final kh B2;
    public boolean B3;
    public boolean B4;
    public boolean C1;
    public final nh C2;
    public final h6 C3;
    public hi.i C4;
    public int D1;
    public final ImageView D2;
    public float D3;
    public final dh.g D4;
    public org.telegram.messenger.s10 E1;
    public final int[] E2;
    public int E3;
    public final ui.c E4;
    public int F1;
    public final kh F2;
    public org.telegram.messenger.gj F3;
    public final dh.c F4;
    public int G1;
    public final sh G2;
    public boolean G3;
    public final dh.c G4;
    public boolean H1;
    public final TextPaint H2;
    public final int H3;
    public final zg H4;
    public boolean I1;
    public final RectF I2;
    public boolean I3;
    public boolean J1;
    public final Paint J2;
    public boolean J3;
    public boolean K1;
    public AnimatorSet K2;
    public boolean K3;
    public k30 L1;
    public long L2;
    public boolean L3;
    public boolean M1;
    public final ai.k0 M2;
    public boolean M3;
    public final fc0 N1;
    public final ph N2;
    public boolean N3;
    public kn O1;
    public int O2;
    public boolean O3;
    public m30 P1;
    public xs P2;
    public boolean P3;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public tj S1;
    public boolean S2;
    public boolean S3;
    public si T1;
    public final float T2;
    public float T3;
    public long U1;
    public long U2;
    public float U3;
    public boolean V1;
    public final o7 V2;
    public ValueAnimator V3;
    public final dh.d W1;
    public AnimatorSet W2;
    public int W3;
    public boolean X1;
    public AnimatorSet X2;
    public ii X3;
    public float Y1;
    public final org.telegram.ui.ActionBar.q0 Y2;
    public wm Y3;
    public final vh Z1;
    public final hi.u Z2;
    public final int[] Z3;
    public final org.telegram.ui.ActionBar.e2 a2;
    public final org.telegram.ui.ActionBar.q0 a3;
    public int a4;
    public final boolean b2;
    public hi.l3 b3;
    public float b4;
    public ue c2;
    public final org.telegram.ui.ActionBar.q0 c3;
    public float c4;
    public boolean d2;
    public final gi.j d3;
    public boolean d4;
    public final ChatAttachAlertPhotoLayout e2;
    public float e3;
    public float e4;
    public mj f2;
    public float f3;
    public final boolean f4;
    public vi g2;
    public final kh g3;
    public boolean g4;
    public jn h2;
    public final TextView h3;
    public final ArrayList h4;
    public jn i2;
    public final org.telegram.ui.ActionBar.q0 i3;
    public final Rect i4;
    public dl j2;
    public final LinearLayout j3;
    public float j4;
    public dk k2;
    public final ImageView k3;
    public boolean k4;
    public im l2;
    public final LinearLayout l3;
    public int l4;
    public final te.a m1;
    public yi m2;
    public final TextView m3;
    public final vh m4;
    public final te.a n1;
    public kg.g0 n2;
    public float n3;
    public r1.g n4;
    public final te.a o1;
    public ek o2;
    public boolean o3;
    public AnimatorSet o4;
    public final te.a p1;
    public ek p2;
    public final xh p3;
    public int p4;
    public final te.a q1;
    public oi.o q2;
    public boolean q3;
    public int q4;
    public final te.a r1;
    public qk r2;
    public Object r3;
    public boolean r4;
    public final te.j s1;
    public boolean s2;
    public boolean s3;
    public boolean s4;
    public org.telegram.ui.ym t1;
    public float t2;
    public final lh.f t3;
    public boolean t4;
    public final h6 u1;
    public final ci[] u2;
    public final mh u3;
    public cl u4;
    public final h6 v1;
    public final LongSparseArray v2;
    public final kh v3;
    public boolean v4;
    public final ImageView w1;
    public ci w2;
    public final lh w3;
    public boolean w4;
    public final org.telegram.ui.ActionBar.t2 x1;
    public ci x2;
    public final v4.b0 x3;
    public File x4;
    public final ImageView y1;
    public final fh.g y2;
    public final hi y3;
    public double[] y4;
    public final org.telegram.ui.ActionBar.t2 z1;
    public final fh.g z2;
    public boolean z3;
    public boolean z4;

    public ki(Activity activity, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11) {
        this(activity, e2Var, z10, z11, true, null);
    }

    public static void I0(ki kiVar) {
        o7 o7Var = kiVar.V2;
        lh.f fVar = kiVar.t3;
        if (fVar == null || o7Var == null) {
            return;
        }
        ci ciVar = kiVar.x2;
        if (ciVar == null) {
            ciVar = kiVar.w2;
        }
        int i7 = 0;
        boolean z10 = ciVar != null && ciVar.f();
        org.telegram.ui.ActionBar.e6 e6Var = kiVar.J0;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (!z10 && o7Var.getVisibility() == 0) {
            i7 = (int) (o7Var.getAlpha() * (a10 ? org.telegram.messenger.ns.e4 : org.telegram.messenger.ns.q2));
        }
        fVar.setFadeTopAlpha(i7);
    }

    public static void K0(ki kiVar) {
        hi.i iVar = new hi.i(kiVar, kiVar.getContext(), kiVar.U1, LaunchActivity.Q(), kiVar.J0, 1);
        kiVar.C4 = iVar;
        iVar.p(new ff(kiVar, 1));
        ViewGroup viewGroup = kiVar.b;
        viewGroup.addView(kiVar.C4, viewGroup.indexOfChild(kiVar.B2), c8.ja.e(-1, -1, 83));
        hi.i iVar2 = kiVar.C4;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            iVar2.getAdapter().n0 = false;
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            jg.h1 adapter = iVar2.getAdapter();
            anVar.j();
            TLRPC.Chat chat = anVar.e;
            adapter.getClass();
            adapter.m0 = chat;
            iVar2.getAdapter().W(anVar.q8);
            iVar2.getAdapter().f0 = anVar.e != null;
        } else {
            iVar2.getAdapter().n0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f0 = false;
        }
        iVar2.getAdapter().g0 = false;
        kiVar.J1();
    }

    public static int L0(ki kiVar) {
        ci ciVar = kiVar.w2;
        jn jnVar = kiVar.h2;
        if (ciVar == jnVar && jnVar.F != null) {
            return jnVar.getEmojiPadding();
        }
        jn jnVar2 = kiVar.i2;
        return (ciVar != jnVar2 || jnVar2.F == null) ? kiVar.X1 ? kiVar.N2.getEmojiPadding() : kiVar.C2.getEmojiPadding() : jnVar2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        return (user == null || org.telegram.messenger.q10.B(user) || org.telegram.messenger.q10.t(user) || org.telegram.messenger.q10.x(user) || org.telegram.messenger.q10.A(user.id) || org.telegram.messenger.q10.z(user) || org.telegram.messenger.q10.s(user) || user.id == 489000 || org.telegram.messenger.np.F2(user)) ? false : true;
    }

    public static void s1(ci ciVar) {
        if (ciVar == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.q6.b;
        Object tag = ciVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
            return;
        }
        ciVar.setTag(R.id.theme_generation, Integer.valueOf(i7));
        try {
            org.telegram.ui.ActionBar.q6.c0(ciVar, true);
            ciVar.d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A1(String str) {
        this.O2 = 1;
        this.A1 = true;
        this.Q2 = false;
        this.K3 = false;
        this.v3.setVisibility(8);
        this.h3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout != null) {
            ki kiVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.h1 = (kiVar.O2 == 0 || kiVar.A1) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.e2 e2Var = this.a2;
            if ((e2Var instanceof org.telegram.ui.an) && !((org.telegram.ui.an) e2Var).z()) {
                z11 = true;
                if (this.z4 != z11) {
                    return;
                }
                if (z11) {
                    org.telegram.messenger.np.s1(this.H3).R1().b();
                }
                this.z4 = z11;
                ImageView imageView = this.w1;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y1;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                er erVar = er.h;
                scaleY.setInterpolator(erVar).setDuration(420L).withEndAction(new eh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(erVar).setDuration(420L).withEndAction(new eh(this, z11, 2)).start();
                if (z11) {
                    org.telegram.ui.ActionBar.t2 t2Var = this.x1;
                    Objects.requireNonNull(t2Var);
                    imageView.postDelayed(new g0(t2Var, 1), 220L);
                    org.telegram.ui.ActionBar.t2 t2Var2 = this.z1;
                    Objects.requireNonNull(t2Var2);
                    imageView2.postDelayed(new g0(t2Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.z4 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(long j3, String str, boolean z10, boolean z11) {
        boolean z12;
        long j10;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.v2;
        int i7 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((ki.y3) longSparseArray.get(j3)).getStartCommand())) {
            ki.y3 y3Var = (ki.y3) longSparseArray.get(j3);
            if (y3Var.I) {
                y3Var.I = false;
            }
            z12 = true;
            if (longSparseArray.get(j3) != null) {
                ((ki.y3) longSparseArray.get(j3)).K.setSwipeOffsetAnimationDisallowed(z12);
                G1((ci) longSparseArray.get(j3), -j3, z11);
                if (z10) {
                    ki.y3 y3Var2 = (ki.y3) longSparseArray.get(j3);
                    TLRPC.User a22 = org.telegram.messenger.np.s1(y3Var2.G).a2(Long.valueOf(y3Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.b0(y3Var2.G).b.bots;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                        i10++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == y3Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    org.telegram.messenger.g0.i3(new kg.t1(10, y3Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.hd.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753138, a22.first_name) : z13 ? org.telegram.messenger.hd.a0("BotAttachMenuShortcatAddedSide", null, 2131753137, a22.first_name) : org.telegram.messenger.hd.a0("BotAttachMenuShortcatAddedAttach", null, 2131753139, a22.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            ki.y3 y3Var3 = new ki.y3(context, e6Var, this);
            y3Var3.V = new ki.p3(y3Var3, 2);
            org.telegram.ui.ActionBar.q0 a10 = y3Var3.b.V2.s().a(0, R.drawable.ic_ab_other);
            y3Var3.L = a10;
            a10.e(R.id.menu_open_bot, R.drawable.msg_bot, org.telegram.messenger.hd.M0(2131752912, null));
            org.telegram.ui.ActionBar.z0 e10 = a10.e(R.id.menu_settings, R.drawable.msg_settings, org.telegram.messenger.hd.M0(2131752897, null));
            y3Var3.M = e10;
            e10.setVisibility(8);
            a10.e(R.id.menu_reload_page, R.drawable.msg_retry, org.telegram.messenger.hd.M0(2131752911, null));
            org.telegram.ui.ActionBar.z0 e11 = a10.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
            y3Var3.N = e11;
            e11.setVisibility(8);
            a10.e(R.id.menu_tos_bot, R.drawable.menu_intro, org.telegram.messenger.hd.M0(2131752894, null));
            a10.e(R.id.menu_report_bot, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131752910, null));
            a10.e(R.id.menu_delete_bot, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131752915, null));
            ki.p2 p2Var = new ki.p2(y3Var3, context, e6Var, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, y3Var3.a), 1);
            y3Var3.n = p2Var;
            ki.o2 o2Var = new ki.o2(i7, context, y3Var3);
            y3Var3.K = o2Var;
            o2Var.addView(p2Var, c8.ja.c(-1.0f, -1));
            o2Var.setScrollListener(new ki.p3(y3Var3, 3));
            o2Var.setScrollEndListener(new ki.p3(y3Var3, 4));
            o2Var.setDelegate(new ki.r3(y3Var3));
            o2Var.setIsKeyboardVisible(new ki.r3(y3Var3));
            y3Var3.addView(o2Var, c8.ja.c(-1.0f, -1));
            ki.t3 t3Var = new ki.t3(context, e6Var);
            y3Var3.J = t3Var;
            y3Var3.addView(t3Var, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            int i11 = 5;
            p2Var.setWebViewProgressListener(new bi.i6(y3Var3, i11));
            org.telegram.messenger.ns.e().c(y3Var3, org.telegram.messenger.ns.n4);
            longSparseArray.put(j3, y3Var3);
            ((ki.y3) longSparseArray.get(j3)).setDelegate(new qh(this, y3Var3, str, j3));
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            org.telegram.messenger.gj replyingMessageObject = anVar.a0.getReplyingMessageObject();
            ki.y3 y3Var4 = (ki.y3) longSparseArray.get(j3);
            long a11 = anVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long j92 = anVar.j9();
            ki.p2 p2Var2 = y3Var4.n;
            int i13 = this.H3;
            y3Var4.G = i13;
            y3Var4.x = a11;
            y3Var4.w = j3;
            y3Var4.E = i12;
            y3Var4.F = j92;
            y3Var4.H = str;
            org.telegram.ui.ActionBar.z0 z0Var = y3Var4.N;
            if (z0Var != null) {
                org.telegram.messenger.si.b0(i13);
                z12 = true;
                z0Var.setVisibility(0);
            } else {
                z12 = true;
            }
            p2Var2.setBotUser(org.telegram.messenger.np.s1(i13).a2(Long.valueOf(j3)));
            p2Var2.s(i13, j3);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = org.telegram.messenger.np.s1(i13).j1(a11);
            tL_messages_requestWebView.bot = org.telegram.messenger.np.s1(i13).o1(j3);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a11 < 0) {
                j10 = 0;
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i13).N0(-a11);
                if (N0 != null && (peer = N0.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = org.telegram.messenger.np.s1(i13).m1(peer);
                    tL_messages_requestWebView.flags |= TLObject.FLAG_13;
                }
            } else {
                j10 = 0;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i12 != 0) {
                org.telegram.messenger.ez.C(i13);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i12;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (j92 != j10) {
                    tL_inputReplyToMessage.monoforum_peer_id = org.telegram.messenger.np.s1(i13).j1(j92);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (j92 != j10) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = org.telegram.messenger.np.s1(i13).j1(j92);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u10 = ki.x2.u(y3Var4.a, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new di.u1(y3Var4, i13, i11));
            org.telegram.messenger.ns.f(i13).c(y3Var4, org.telegram.messenger.ns.z1);
            if (longSparseArray.get(j3) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void D1(org.telegram.ui.ActionBar.e2 e2Var) {
        if ((e2Var instanceof org.telegram.ui.an) && org.telegram.messenger.t3.V(((org.telegram.ui.an) e2Var).e)) {
            new cc(this.p3, this.J0).f(org.telegram.messenger.np.s1(this.H3).V4, new od(6, this, e2Var)).j();
        }
    }

    public final boolean E1(boolean z10, boolean z11) {
        float f10;
        int i7;
        ci ciVar;
        o7 o7Var;
        this.n1.a(z10, true);
        kh khVar = this.B2;
        if (z10 == (khVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.K2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        khVar.setTag(z10 ? 1 : null);
        nh nhVar = this.C2;
        if (nhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(nhVar.getEditText());
        }
        nhVar.k(true);
        this.N2.k(true);
        kh khVar2 = this.v3;
        kh khVar3 = this.F2;
        if (z10) {
            if (!this.I1) {
                khVar.setVisibility(0);
            }
            khVar3.setVisibility(0);
        } else if (this.Q2) {
            khVar2.setVisibility(0);
        }
        ci ciVar2 = this.w2;
        boolean z12 = (ciVar2 == this.e2 || ciVar2 == this.l2) && this.X1;
        o7 o7Var2 = this.V2;
        ai.k0 k0Var = this.M2;
        kg.j jVar = this.A2;
        sh shVar = this.G2;
        if (z11) {
            this.K2 = new AnimatorSet();
            if (z12) {
                k0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(khVar, (Property<kh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                o7Var = o7Var2;
            } else {
                jVar.setVisibility(0);
                o7Var = o7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<ai.k0, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(khVar3, (Property<kh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(khVar3, (Property<kh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(khVar3, (Property<kh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(shVar, (Property<sh, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(shVar, (Property<sh, Float>) property3, z10 ? 1.0f : 0.2f));
            if (o7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(khVar, (Property<kh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
            } else if (this.Q2) {
                arrayList.add(ObjectAnimator.ofFloat(khVar2, (Property<kh, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.g0.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(khVar2, (Property<kh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new tg(this, 5));
                arrayList.add(ofFloat);
            }
            this.K2.playTogether(arrayList);
            this.K2.setInterpolator(new DecelerateInterpolator());
            this.K2.setDuration(180L);
            this.K2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.K2.start();
            i7 = 0;
        } else {
            khVar.setAlpha(z10 ? 1.0f : 0.0f);
            jVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                f10 = 0.0f;
                i7 = 0;
            } else {
                i7 = 0;
                jVar.setVisibility(0);
                f10 = 0.0f;
                jVar.setTranslationY(0.0f);
            }
            khVar3.setScaleX(z10 ? 1.0f : 0.2f);
            khVar3.setScaleY(z10 ? 1.0f : 0.2f);
            khVar3.setAlpha(z10 ? 1.0f : f10);
            k0Var.setVisibility((z10 && z12) ? i7 : 8);
            k0Var.setAlpha((z10 && z12) ? 1.0f : f10);
            shVar.setScaleX(z10 ? 1.0f : 0.2f);
            shVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (o7Var2.getTag() != null) {
                khVar.setTranslationY(z10 ? f10 : org.telegram.messenger.g0.L(48.0f));
            } else if (this.Q2 && ((ciVar = this.w2) == null || ciVar.N())) {
                khVar2.setTranslationY(z10 ? org.telegram.messenger.g0.L(84.0f) : f10);
            }
            if (!z10) {
                khVar.setVisibility(4);
                khVar3.setVisibility(4);
            }
            if (z12) {
                Q1();
            }
        }
        if (z10) {
            i7 = Math.max(1, this.w2.getSelectedItemsCount());
        }
        shVar.e(i7, z11);
        shVar.i(X0() + this.w2.getSelectedItemsCount(), this.F3 != null ? 0L : org.telegram.messenger.np.s1(this.H3).N1(b1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), shVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            nhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(ci ciVar) {
        long j3 = this.U2;
        kn knVar = this.O1;
        if (ciVar == knVar) {
            j3 = knVar.s;
        } else if (ciVar == this.e2) {
            j3 = 1;
        } else if (ciVar == this.g2) {
            j3 = 3;
        } else if (ciVar == this.k2) {
            j3 = 4;
        } else if (ciVar == this.f2) {
            j3 = 5;
        } else if (ciVar == this.j2) {
            j3 = 6;
        } else if (ciVar == this.h2) {
            j3 = 9;
        } else if (ciVar == this.m2) {
            j3 = 10;
        } else if (ciVar == this.n2) {
            j3 = 11;
        } else if (ciVar == this.i2) {
            j3 = 12;
        } else if (ciVar == this.o2) {
            j3 = 14;
        } else if (ciVar == this.p2) {
            j3 = 13;
        } else if (ciVar == this.q2) {
            j3 = 16;
        } else if (ciVar == this.r2) {
            j3 = 17;
        }
        G1(ciVar, j3, true);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ci ciVar;
        if (i7 == 0) {
            U0();
            R0();
            return;
        }
        if (i7 == 2) {
            R0();
            jn jnVar = this.h2;
            if (jnVar != null && ((ciVar = this.x2) == jnVar || this.w2 == jnVar)) {
                P1(ciVar == jnVar ? 1 : 0);
            }
            jn jnVar2 = this.i2;
            if (jnVar2 != null) {
                ci ciVar2 = this.x2;
                if (ciVar2 == jnVar2 || this.w2 == jnVar2) {
                    P1(ciVar2 != jnVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 1) {
            R0();
            return;
        }
        if (i7 == 3) {
            T0();
            return;
        }
        if (i7 == 4) {
            T0();
            return;
        }
        if (i7 == 5) {
            T0();
            sh shVar = this.G2;
            if (shVar != null) {
                shVar.setEphemeralFactor(f10);
                shVar.setSameWidthFactor(f10);
            }
        }
    }

    public final void G1(ci ciVar, long j3, boolean z10) {
        xl xlVar;
        xl xlVar2;
        int i7;
        Float f10;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.r3 == null && this.K2 == null) {
            ci ciVar2 = this.w2;
            if (ciVar2 == ciVar) {
                ciVar2.K();
                return;
            }
            if (ciVar == this.i2 && !org.telegram.messenger.m10.i(this.H3).q()) {
                new ug.x0(this.a2, 39, false).show();
                return;
            }
            int i11 = 1;
            this.q1.a(j3 == 1, z10);
            this.s1.f(Long.valueOf(j3), z10);
            this.B3 = false;
            this.z3 = false;
            this.D3 = 0.0f;
            this.C3.setVisibility(8);
            RadialProgressView radialProgressView = this.A3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            kh khVar = this.v3;
            khVar.setAlpha(1.0f);
            khVar.setTranslationY(this.D3);
            int i12 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.v2;
                if (i12 >= longSparseArray.size()) {
                    break;
                }
                ((ki.y3) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                i12++;
            }
            this.U2 = j3;
            lh lhVar = this.w3;
            int childCount = lhVar.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = lhVar.getChildAt(i13);
                if (childAt instanceof ei) {
                    ei eiVar = (ei) childAt;
                    i10 = childCount;
                    f10 = valueOf;
                    eiVar.a.f(((long) eiVar.b) == eiVar.c.U2, true);
                } else {
                    f10 = valueOf;
                    i10 = childCount;
                    if (childAt instanceof di) {
                        ((di) childAt).a(true);
                    }
                }
                i13++;
                childCount = i10;
                valueOf = f10;
            }
            Float f11 = valueOf;
            int firstOffset = (this.w2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Z3[0];
            this.x2 = ciVar;
            S0(ciVar);
            int i14 = this.x2.j() != 0 ? 0 : 4;
            o7 o7Var = this.V2;
            o7Var.setVisibility(i14);
            if (o7Var.o0) {
                o7Var.n(true);
            }
            this.w2.u();
            ci ciVar3 = this.x2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
            if (ciVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.x2.I(this.w2);
            this.x2.setVisibility(0);
            if (ciVar.getParent() != null) {
                this.b.removeView(this.x2);
            }
            int indexOfChild = this.b.indexOfChild(this.w2);
            if (this.x2.getParent() != this.b) {
                s1(this.x2);
                ViewGroup viewGroup = this.b;
                ci ciVar4 = this.x2;
                if (ciVar4 != this.j2) {
                    indexOfChild++;
                }
                viewGroup.addView(ciVar4, indexOfChild, c8.ja.c(-1.0f, -1));
            }
            vg vgVar = new vg(this, 5);
            ci ciVar5 = this.w2;
            boolean z11 = ciVar5 instanceof im;
            int i15 = 2;
            vh vhVar = this.Z1;
            if (z11 || (this.x2 instanceof im)) {
                int max = Math.max(this.x2.getWidth(), this.w2.getWidth());
                ci ciVar6 = this.x2;
                if (ciVar6 instanceof im) {
                    ciVar6.setTranslationX(max);
                    ci ciVar7 = this.w2;
                    if ((ciVar7 instanceof ChatAttachAlertPhotoLayout) && (xlVar2 = ((ChatAttachAlertPhotoLayout) ciVar7).Q) != null) {
                        xlVar2.setVisibility(4);
                    }
                } else {
                    this.w2.setTranslationX(-max);
                    ci ciVar8 = this.x2;
                    if (ciVar8 == chatAttachAlertPhotoLayout && (xlVar = ((ChatAttachAlertPhotoLayout) ciVar8).Q) != null) {
                        xlVar.setVisibility(0);
                    }
                }
                this.x2.setAlpha(1.0f);
                this.w2.setAlpha(1.0f);
                if (z10) {
                    ci ciVar9 = this.w2;
                    vhVar.getClass();
                    vhVar.a(ciVar9, f11);
                    org.telegram.messenger.g0.h3(new yf(this, ciVar, vgVar, i15));
                } else {
                    boolean z12 = this.x2.getCurrentItemTop() <= ciVar.getButtonsHideOffset();
                    this.w2.v(1.0f);
                    this.x2.v(1.0f);
                    this.w2.m(this.j4);
                    this.x2.m(this.j4);
                    this.b.invalidate();
                    this.Y0.g();
                    ci ciVar10 = this.w2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    vhVar.getClass();
                    vhVar.a(ciVar10, valueOf2);
                    o7Var.setTag(z12 ? 1 : null);
                    vgVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.x2.setAlpha(0.0f);
                this.x2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.w2, (Property<ci, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.w2, vhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(o7Var, (Property<o7, Float>) View.ALPHA, o7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(er.f);
                animatorSet.addListener(new di.y3(this, firstOffset, vgVar, i11));
                this.r3 = animatorSet;
                ci ciVar11 = this.w2;
                vhVar.getClass();
                vhVar.a(ciVar11, f11);
                animatorSet.start();
            } else {
                ciVar5.setAlpha(0.0f);
                vgVar.run();
                P1(0);
                this.b.invalidate();
            }
            if (!this.k4 || (ciVar instanceof ki.y3)) {
                i7 = 0;
            } else {
                i7 = 0;
                this.k4 = false;
                o7Var.updateColors();
                o7Var.invalidate();
                i1();
            }
            o7Var.setForcedMenuWidth((j3 == 1 || j3 == 6 || j3 == 17 || (ciVar instanceof ki.y3)) ? org.telegram.messenger.g0.L(46.0f) : j3 == 4 ? org.telegram.messenger.g0.L(84.0f) : i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H0() {
        ci ciVar = this.w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        return ciVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1;
    }

    public final void H1(boolean z10, Boolean bool) {
        ki kiVar;
        if (this.h2 == null) {
            kiVar = this;
            jn jnVar = new jn(kiVar, getContext(), false, this.J0, bool);
            kiVar.h2 = jnVar;
            kiVar.u2[1] = jnVar;
            jnVar.setDelegate(new sg(this, 17));
        } else {
            kiVar = this;
        }
        G1(kiVar.h2, 9L, z10);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean I() {
        return this.w2.b();
    }

    public final void I1(boolean z10, boolean z11) {
        ci ciVar;
        this.o1.a(z10, z11);
        o7 o7Var = this.V2;
        if (!(z10 && o7Var.getTag() == null) && (z10 || o7Var.getTag() == null)) {
            return;
        }
        o7Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.W2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.W2 = null;
        }
        boolean z12 = (this.A1 || this.R2 || (this.O2 == 0 && this.o3) || this.w2 != this.e2 || (!this.J3 && !this.K3)) ? false : true;
        if (this.w2 == this.O1) {
            z12 = false;
        }
        kh khVar = this.v3;
        org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
        if (z10) {
            if (z12) {
                q0Var.setVisibility(0);
                q0Var.setClickable(true);
            }
        } else if (this.Q2 && this.B2.getTag() == null) {
            khVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var != null) {
            if (z10) {
                org.telegram.messenger.g0.q3(this, i0.a.h(org.telegram.ui.ActionBar.j6.w0(this.f4 ? org.telegram.ui.ActionBar.j6.kh : org.telegram.ui.ActionBar.j6.h5, this.J0)) > 0.699999988079071d);
            } else {
                org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
            }
        }
        int i7 = 4;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.W2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - o7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o7Var, (Property<o7, Float>) property, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new tg(this, i7));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.W2.playTogether(arrayList);
            this.W2.addListener(new org.telegram.ui.nn(3, this, z10));
            this.W2.setInterpolator(er.h);
            this.W2.setDuration(380L);
            this.W2.start();
            return;
        }
        if (z10 && this.Q2 && ((ciVar = this.w2) == null || ciVar.N())) {
            khVar.setVisibility(4);
        }
        o7Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            q0Var.setAlpha(z10 ? 1.0f : 0.0f);
            q0Var.setScaleX(z10 ? 1.0f : 0.6f);
            q0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.c3;
        if (q0Var2 != null) {
            q0Var2.setVisibility(4);
        }
        if (this.O2 == 0 && this.o3) {
            return;
        }
        q0Var.setVisibility(4);
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.E2;
        nh nhVar = this.C2;
        nhVar.getLocationOnScreen(iArr);
        if (this.C4 != null) {
            ci ciVar = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
            if ((ciVar == chatAttachAlertPhotoLayout || ciVar == this.l2) && this.X1) {
                ai.k0 k0Var = this.M2;
                alpha = (k0Var.getAlpha() * k0Var.getMeasuredHeight()) + (k0Var.getY() - this.C4.getTop());
            } else {
                alpha = -nhVar.getHeight();
            }
            if (Math.abs(this.C4.getTranslationY() - alpha) > 0.5f) {
                this.C4.setTranslationY(alpha);
                this.C4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                }
            }
        }
        U0();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void K() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.n4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.o4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(int i7) {
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.r3 != null) {
            return;
        }
        int selectedItemsCount = this.w2.getSelectedItemsCount();
        sh shVar = this.G2;
        if (selectedItemsCount == 0) {
            shVar.e(0, i7 != 0);
            E1(false, i7 != 0);
        } else {
            if (E1(true, i7 != 0) || i7 == 0) {
                shVar.e(selectedItemsCount, i7 != 0);
                shVar.a();
            } else {
                shVar.e(selectedItemsCount, true);
                shVar.a();
            }
        }
        this.w2.D(selectedItemsCount);
        Q0(i7 != 0);
        if (this.w2 == this.e2 && ((((z10 = (e2Var = this.a2) instanceof org.telegram.ui.an)) || this.O2 != 0 || this.R2) && ((selectedItemsCount == 0 && this.o3) || ((selectedItemsCount != 0 || this.O2 != 0 || this.R2) && !this.o3)))) {
            this.o3 = (selectedItemsCount == 0 && this.O2 == 0 && !this.R2) ? false : true;
            AnimatorSet animatorSet = this.X2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.X2 = null;
            }
            int i10 = this.O2;
            o7 o7Var = this.V2;
            org.telegram.ui.ActionBar.q0 q0Var = this.c3;
            if (i10 != 0 && q0Var != null && o7Var.getTag() != null && z10) {
                org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
                if (!org.telegram.messenger.t3.T(anVar.e) || (tL_chatBannedRights = anVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.o3;
                    kh khVar = this.g3;
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.Y2;
                    if (!z12) {
                        if (this.O2 == 0 && !this.R2) {
                            q0Var2.setVisibility(0);
                            q0Var2.setClickable(true);
                        }
                        khVar.setVisibility(0);
                    } else if (o7Var.getTag() != null && q0Var != null) {
                        q0Var.setVisibility(0);
                    }
                    if (i7 != 0) {
                        if (o7Var.getTag() == null && this.O2 == 0 && !this.R2) {
                            q0Var2.setAlpha(this.o3 ? 1.0f : 0.0f);
                            q0Var2.setScaleX(this.o3 ? 1.0f : 0.6f);
                            q0Var2.setScaleY(this.o3 ? 1.0f : 0.6f);
                        }
                        khVar.setAlpha(this.o3 ? 1.0f : 0.0f);
                        if (z11) {
                            q0Var.setAlpha(this.o3 ? 0.0f : 1.0f);
                        }
                        if (this.o3 && q0Var != null) {
                            q0Var.setVisibility(4);
                        }
                    } else {
                        this.X2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (o7Var.getTag() == null && this.O2 == 0 && !this.R2) {
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.ALPHA, this.o3 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_X, this.o3 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_Y, this.o3 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(khVar, (Property<kh, Float>) property, this.o3 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, this.o3 ? 0.0f : 1.0f));
                        }
                        this.X2.playTogether(arrayList);
                        this.X2.addListener(new x5(this, 10));
                        this.X2.setDuration(180L);
                        this.X2.start();
                    }
                }
            }
            z11 = false;
            z12 = this.o3;
            kh khVar2 = this.g3;
            org.telegram.ui.ActionBar.q0 q0Var22 = this.Y2;
            if (!z12) {
            }
            if (i7 != 0) {
            }
        }
        N1(i7 != 0);
        org.telegram.messenger.gj gjVar = this.F3;
        long N1 = (gjVar == null || gjVar.p5()) ? org.telegram.messenger.np.s1(this.H3).N1(b1()) : 0L;
        ci ciVar = this.w2;
        shVar.i(X0() + (ciVar != null ? ciVar.getSelectedItemsCount() : 0), N1, true);
        nh nhVar = this.C2;
        if (nhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nhVar.getLayoutParams();
            int max = Math.max(org.telegram.messenger.g0.L(48.0f), shVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                nhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public void L() {
        ii iiVar = this.X3;
        if (iiVar != null) {
            iiVar.d0(new vg(this, 4));
        } else {
            t1();
        }
    }

    public final void L1() {
        float f10;
        ci ciVar = this.w2;
        boolean i7 = ciVar == null ? false : ciVar.i();
        gi.j jVar = this.d3;
        jVar.setEnabled(i7);
        ci ciVar2 = this.w2;
        if (ciVar2 != null) {
            f10 = ((ciVar2.i() ? 1.0f : 0.5f) * (this.x2 == null ? 1.0f : this.Y1)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        ci ciVar3 = this.x2;
        if (ciVar3 != null) {
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.Y1, ciVar3.i() ? 1.0f : 0.5f, f10);
        }
        this.e3 = f10;
        if (jVar != null) {
            float f11 = f10 * this.f3;
            jVar.setAlpha(f11);
            jVar.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void M(int i7) {
        super.M(i7);
        this.w2.r(i7);
    }

    public final void M0() {
        if (a1().a.length() <= 0) {
            return;
        }
        this.w2.a(a1().getText());
    }

    public final void M1(ci ciVar, int i7) {
        if (ciVar == null) {
            return;
        }
        dh.g gVar = this.D4;
        if (gVar != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(0.0f, i7);
        }
        int currentItemTop = ciVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = ciVar == this.w2 && currentItemTop <= ciVar.getButtonsHideOffset();
        this.M1 = z11;
        if (ciVar == this.w2) {
            I1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ciVar.getLayoutParams();
        int D = org.telegram.messenger.i20.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        ci ciVar2 = this.w2;
        int i10 = ciVar2 == ciVar ? 0 : 1;
        if ((ciVar2 instanceof im) || (this.x2 instanceof im)) {
            Object obj = this.r3;
            if ((obj instanceof r1.g) && ((r1.g) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.Z3;
        int i11 = iArr[i10];
        if (i11 == D && !z10) {
            if (i7 != 0) {
                this.a4 = i11;
            }
        } else {
            this.a4 = i11;
            iArr[i10] = D;
            P1(i10);
            this.b.invalidate();
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        return (e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).Z6();
    }

    public final void N1(boolean z10) {
        hi.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.Z2) == null) {
            return;
        }
        boolean z11 = this.o3 && this.d2 && this.w2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0();
        boolean z12 = !ChatAttachAlertPhotoLayout.V();
        uVar.f = z12;
        if (!z10) {
            ((u5) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.q0 q0Var = this.a3;
        if (z10 && this.o3) {
            q0Var.setVisibility(0);
            q0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(er.h).withEndAction(new eh(this, z11, 0)).start();
        } else {
            q0Var.setVisibility(z11 ? 0 : 8);
            q0Var.setAlpha(z11 ? 1.0f : 0.0f);
            q0Var.setScaleX(z11 ? 1.0f : 0.6f);
            q0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (!(e2Var instanceof org.telegram.ui.an)) {
            return false;
        }
        return ChatActivityEnterView.K(this.H3, ((org.telegram.ui.an) e2Var).a(), e2Var, charSequence);
    }

    public final void O1(boolean z10) {
        ci ciVar = this.e2;
        if (!z10) {
            F1(ciVar);
            return;
        }
        if (this.H1) {
            if (this.l2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.t1;
                if (e6Var == null) {
                    e6Var = this.J0;
                }
                im imVar = new im(context, e6Var, this);
                imVar.E = 0.0f;
                imVar.F = 0.0f;
                imVar.G = 0.0f;
                imVar.H = 0.0f;
                imVar.I = 0.0f;
                imVar.J = 0.0f;
                imVar.K = null;
                imVar.L = false;
                imVar.N = 0.0f;
                imVar.R = false;
                imVar.T = false;
                Point point = org.telegram.messenger.g0.q;
                imVar.U = point.y > point.x;
                imVar.n = e6Var;
                imVar.f = true;
                imVar.setWillNotDraw(false);
                ki kiVar = imVar.b;
                org.telegram.ui.ActionBar.y s5 = kiVar.V2.s();
                TextView textView = new TextView(context);
                imVar.y = textView;
                org.telegram.ui.ActionBar.e6 e6Var2 = imVar.a;
                hi.u2 u2Var = new hi.u2(imVar, context, s5, e6Var2, 2);
                kiVar.V2.addView(u2Var, 0, c8.ja.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var2);
                textView.setText(org.telegram.messenger.hd.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                u2Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                di.c1 c1Var = new di.c1(imVar, context, e6Var2, 17);
                imVar.r = c1Var;
                c1Var.setAdapter(new org.telegram.ui.y7(imVar, 3));
                v4.b0 b0Var = new v4.b0(1, false);
                imVar.s = b0Var;
                c1Var.setLayoutManager(b0Var);
                c1Var.setClipChildren(false);
                c1Var.setClipToPadding(false);
                c1Var.setOverScrollMode(2);
                c1Var.setVerticalScrollBarEnabled(false);
                hm hmVar = new hm(imVar, context);
                imVar.w = hmVar;
                hmVar.setClipToPadding(true);
                hmVar.setClipChildren(true);
                imVar.addView(c1Var, c8.ja.c(-1.0f, -1));
                imVar.Q = kiVar.e2;
                hmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.Q;
                hmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                hmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                hmVar.c();
                UndoView undoView = new UndoView(context, null, false, kiVar.t1);
                imVar.x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                imVar.addView(undoView, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                imVar.O = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.l2 = imVar;
                imVar.bringToFront();
            }
            ci ciVar2 = this.w2;
            im imVar2 = this.l2;
            if (ciVar2 != imVar2) {
                ciVar = imVar2;
            }
            F1(ciVar);
        }
    }

    public final void P0() {
        lh lhVar = this.w3;
        if (lhVar == null) {
            return;
        }
        int childCount = lhVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            lhVar.getChildAt(i7);
        }
        boolean z10 = this.f4;
        org.telegram.ui.ActionBar.q6.U(this.h3, z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.j5, this.J0);
        org.telegram.ui.ActionBar.q6.U(this.m3, z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.j5, this.J0);
        org.telegram.ui.ActionBar.q6.U(this.d3, org.telegram.ui.ActionBar.j6.Ji, this.J0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.j5, this.J0);
        boolean z11 = (this.r4 && w02 == this.q4) ? false : true;
        this.r4 = true;
        this.q4 = w02;
        org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
        if (z11) {
            q0Var.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(z10 ? org.telegram.ui.ActionBar.j6.Zg : org.telegram.ui.ActionBar.j6.I5, this.J0), q0Var.getBackground());
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        q0Var.P(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), false);
        q0Var.P(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), true);
        q0Var.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.J0));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.a3;
        if (q0Var2 != null && z11) {
            q0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.c3;
        if (q0Var3 != null) {
            if (z11) {
                q0Var3.setIconColor(w02);
            }
            org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(z10 ? org.telegram.ui.ActionBar.j6.Zg : org.telegram.ui.ActionBar.j6.I5, this.J0), q0Var3.getBackground());
        }
        nh nhVar = this.C2;
        org.telegram.ui.ActionBar.e6 e6Var = nhVar.N;
        mt mtVar = nhVar.a;
        int i11 = nhVar.M;
        if (i11 == 0) {
            mtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.H6, e6Var));
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            mtVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
            mtVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        } else if (i11 == 2 || i11 == 3) {
            mtVar.setHintTextColor(-1929379841);
            mtVar.setTextColor(-1);
            mtVar.setCursorColor(-1);
            mtVar.setHandlesColor(-1);
            mtVar.setHighlightColor(822083583);
            mtVar.E = -1;
        } else {
            mtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.t5, e6Var));
            mtVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.j5, e6Var));
        }
        nhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Oe, e6Var), PorterDuff.Mode.MULTIPLY));
        nt ntVar = nhVar.d;
        if (ntVar != null) {
            ntVar.updateColors();
        }
        org.telegram.ui.ActionBar.q6.l(lhVar, 21, org.telegram.ui.ActionBar.j6.A5, this.J0);
        int i13 = z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        o7 o7Var = this.V2;
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, i13, e6Var2);
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, z10 ? org.telegram.ui.ActionBar.j6.Zg : org.telegram.ui.ActionBar.j6.I5, this.J0);
        org.telegram.ui.ActionBar.q6.l(o7Var, 5, z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.j5, this.J0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.j6.C1(d12, this.s0);
        ui.c cVar = this.E4;
        if (cVar.b != d12) {
            cVar.a(d12);
            lh.f fVar = this.t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            mh mhVar = this.u3;
            if (mhVar != null) {
                mhVar.invalidate();
            }
        }
        this.b.invalidate();
        int i14 = 0;
        while (true) {
            ci[] ciVarArr = this.u2;
            if (i14 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i14];
            if (ciVar != null) {
                ciVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Q(org.telegram.ui.ActionBar.j6.h5);
            return;
        }
        this.G0 = -1;
        this.H0 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i5, this.J0);
        org.telegram.messenger.g0.t3(this, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0), false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(int i7) {
        int i10;
        float f10;
        org.telegram.ui.ActionBar.q0 q0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        gi.j jVar;
        float max;
        int i11;
        float f15 = this.o1.e;
        ci ciVar = i7 == 0 ? this.w2 : this.x2;
        if (ciVar == null || ciVar.getVisibility() != 0) {
            return;
        }
        int c12 = c1(i7);
        if (ciVar == this.h2 || ciVar == this.i2) {
            org.telegram.messenger.g0.L(13.0f);
            org.telegram.messenger.g0.L(11.0f);
        } else {
            org.telegram.messenger.g0.L(39.0f);
            org.telegram.messenger.g0.L(43.0f);
        }
        org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (org.telegram.messenger.g0.Q1()) {
            i10 = 16;
        } else {
            Point point = org.telegram.messenger.g0.q;
            i10 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.V2.getAlpha();
        kh khVar = this.g3;
        float L = alpha != 0.0f ? 0.0f : org.telegram.messenger.g0.L((1.0f - khVar.getAlpha()) * 26.0f);
        boolean z10 = this.o3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.Y2;
        ai.k0 k0Var = this.M2;
        if (z10 && this.O2 == 0 && !this.R2) {
            q0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37), ((c12 - org.telegram.messenger.g0.L((i10 * f15) + 37.0f)) + L) - (k0Var.getAlpha() * k0Var.getMeasuredHeight())) + this.j4);
        } else {
            q0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.j4);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.a3;
        if (q0Var3 != null) {
            q0Var3.setTranslationY(q0Var2.getTranslationY());
        }
        hi.l3 l3Var = this.b3;
        if (l3Var != null) {
            l3Var.setTranslationY(q0Var2.getTranslationY());
        }
        if (this.A1 && this.q3) {
            ci ciVar2 = this.x2;
            if (ciVar2 != null && this.w2 != null) {
                f10 = Math.min(ciVar2.getTranslationY(), this.w2.getTranslationY());
            } else if (ciVar2 != null) {
                f10 = ciVar2.getTranslationY();
            }
            q0Var = this.c3;
            if (q0Var != null) {
                q0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.j4);
            }
            float L2 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.j4) + f10) - (k0Var.getAlpha() * k0Var.getMeasuredHeight());
            this.n3 = L2;
            khVar.setTranslationY(Math.max(this.j4, L2));
            k0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.j4, (khVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.n3 + org.telegram.messenger.g0.L(8.0f)));
            if (this.X1) {
                J1();
            }
            U0();
            int i12 = 59;
            if (this.h2 != null) {
                if (org.telegram.messenger.g0.Q1()) {
                    i11 = 63;
                } else {
                    Point point2 = org.telegram.messenger.g0.q;
                    i11 = point2.x > point2.y ? 53 : 59;
                }
                jn jnVar = this.h2;
                if (jnVar == this.x2) {
                    f12 = (jnVar.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.Y1;
                } else if (jnVar == this.w2) {
                    f12 = (jnVar.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.x2 == null ? 1.0f : 1.0f - this.Y1;
                }
                if (this.i2 != null) {
                    if (org.telegram.messenger.g0.Q1()) {
                        i12 = 63;
                    } else {
                        Point point3 = org.telegram.messenger.g0.q;
                        if (point3.x > point3.y) {
                            i12 = 53;
                        }
                    }
                    jn jnVar2 = this.i2;
                    if (jnVar2 == this.x2) {
                        f14 = (jnVar2.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.Y1;
                    } else if (jnVar2 == this.w2) {
                        f14 = (jnVar2.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.x2 == null ? 1.0f : 1.0f - this.Y1;
                    }
                    jVar = this.d3;
                    if (jVar != null) {
                        int measuredWidth = org.telegram.messenger.hd.a0 ? (this.b.getMeasuredWidth() - jVar.getMeasuredWidth()) - org.telegram.messenger.g0.L(62.0f) : 0;
                        if (f11 <= 0.0f || f13 <= 0.0f) {
                            if (f11 <= 0.0f) {
                                f12 = 0.0f;
                            }
                            if (f13 <= 0.0f) {
                                f14 = 0.0f;
                            }
                            max = Math.max(f12, f14);
                        } else {
                            max = org.telegram.messenger.g0.T1(f12, f14, f13);
                        }
                        jVar.setTranslationY(Math.max(0.0f, max) + this.j4);
                        jVar.setTranslationX(-((measuredWidth * (1.0f - f15)) + org.telegram.messenger.g0.L((7.0f * r6) + 12.0f)));
                    }
                    float max2 = Math.max(f13, f11);
                    this.f3 = max2;
                    if (jVar == null) {
                        float f16 = this.e3 * max2;
                        jVar.setAlpha(f16);
                        jVar.setVisibility(f16 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f13 = 0.0f;
                f14 = 0.0f;
                jVar = this.d3;
                if (jVar != null) {
                }
                float max22 = Math.max(f13, f11);
                this.f3 = max22;
                if (jVar == null) {
                }
            }
            f11 = 0.0f;
            f12 = 0.0f;
            if (this.i2 != null) {
            }
            f13 = 0.0f;
            f14 = 0.0f;
            jVar = this.d3;
            if (jVar != null) {
            }
            float max222 = Math.max(f13, f11);
            this.f3 = max222;
            if (jVar == null) {
            }
        }
        f10 = 0.0f;
        q0Var = this.c3;
        if (q0Var != null) {
        }
        float L22 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.j4) + f10) - (k0Var.getAlpha() * k0Var.getMeasuredHeight());
        this.n3 = L22;
        khVar.setTranslationY(Math.max(this.j4, L22));
        k0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.j4, (khVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.n3 + org.telegram.messenger.g0.L(8.0f)));
        if (this.X1) {
        }
        U0();
        int i122 = 59;
        if (this.h2 != null) {
        }
        f11 = 0.0f;
        f12 = 0.0f;
        if (this.i2 != null) {
        }
        f13 = 0.0f;
        f14 = 0.0f;
        jVar = this.d3;
        if (jVar != null) {
        }
        float max2222 = Math.max(f13, f11);
        this.f3 = max2222;
        if (jVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (org.telegram.messenger.gj.c3(r0.k) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var == null || !(e2Var instanceof org.telegram.ui.an)) {
            return;
        }
        org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
        rt rtVar = this.X1 ? this.N2 : this.C2;
        String obj = rtVar != null ? rtVar.getText().toString() : null;
        if (this.F3 == null) {
            ci ciVar = this.w2;
            z11 = true;
            if (ciVar != null) {
            }
            if (bg.w.g(this.H3).e(obj, anVar.u8) <= 0) {
                org.telegram.messenger.gj gjVar = anVar.E5;
                if (gjVar != null) {
                }
            }
            this.r1.a(z11, z10);
            if (z11 || !f1()) {
            }
            v1(false, z10);
            return;
        }
        z11 = false;
        this.r1.a(z11, z10);
        if (z11) {
        }
    }

    public final void Q1() {
        int i7 = 0;
        P1(0);
        this.p3.invalidate();
        ai.k0 k0Var = this.M2;
        k0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout != null) {
            ql qlVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.Y();
            if (qlVar != null && qlVar.getFastScroll() != null) {
                zi0 fastScroll = qlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.X1) {
                    i7 = (int) (k0Var.getAlpha() * k0Var.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i7;
                qlVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.n1.e;
        this.u3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.o1.e))), 1.0f - ((1.0f - this.m1.e) * f10)));
    }

    public final void S0(ci ciVar) {
        boolean e10 = ciVar.e();
        lh.f fVar = this.t3;
        if (fVar != null) {
            fVar.setFadeHeightBottom(e10 ? 0 : org.telegram.messenger.g0.L(48.0f));
        }
        mh mhVar = this.u3;
        if (mhVar != null) {
            mhVar.setVisibility(e10 ? 4 : 0);
        }
    }

    public final void T0() {
        t00.d(this.D2, com.google.android.gms.internal.vision.e2.D(this.p1.e, this.q1.e, a8.m7.a(this.r1.e), this.P3 ? 0.0f : 1.0f));
    }

    public final void U0() {
        sh shVar = this.G2;
        kh khVar = this.F2;
        ai.k0 k0Var = this.M2;
        if (k0Var == null || k0Var.getVisibility() != 0 || k0Var.getAlpha() == 0.0f) {
            khVar.setTranslationY(this.e4);
            shVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.m1.e;
        float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
        shVar.setAlpha(abs * abs * abs * abs);
        khVar.setTranslationY(org.telegram.messenger.g0.T1(this.e4, ((k0Var.getTranslationY() + k0Var.getTop()) - khVar.getTop()) + org.telegram.messenger.g0.L(8.0f), er.j.getInterpolation(f10)));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.s6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            ci[] ciVarArr = this.u2;
            if (i7 >= ciVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i5));
                return arrayList;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null && (themeDescriptions = ciVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i7++;
        }
    }

    public final void V0(int i7) {
        this.Q2 = true;
        this.v3.setVisibility(0);
        this.C1 = true;
        this.D1 = i7;
        this.O2 = 0;
        this.A1 = false;
        this.B1 = false;
        this.E1 = null;
        org.telegram.ui.ActionBar.q0 q0Var = this.i3;
        if (q0Var != null) {
            this.h3.setTranslationY(0.0f);
            q0Var.setVisibility(8);
        }
    }

    public final void W0(hi.q4 q4Var) {
        String M0 = org.telegram.messenger.hd.M0(2131752122, null);
        TextView textView = this.h3;
        textView.setText(M0);
        this.Q2 = false;
        this.v3.setVisibility(8);
        this.O2 = 1;
        this.A1 = true;
        this.B1 = true;
        this.d2 = false;
        this.E1 = q4Var;
        org.telegram.ui.ActionBar.q0 q0Var = this.i3;
        if (q0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            q0Var.setVisibility(0);
            q0Var.setClickable(true);
            q0Var.setAlpha(1.0f);
            q0Var.setScaleX(1.0f);
            q0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (!(e2Var instanceof org.telegram.ui.an) || (kjVar = ((org.telegram.ui.an) e2Var).w5) == null || (ijVar = kjVar.b) == null) {
            return 0;
        }
        return ijVar.g.size();
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        return e2Var instanceof org.telegram.ui.an ? ((org.telegram.ui.an) e2Var).e : org.telegram.messenger.np.s1(this.H3).M0(Long.valueOf(-this.U1));
    }

    public final float Z0() {
        return r0.getMeasuredHeight() - ((1.0f - this.B2.getAlpha()) * (r0.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override // org.telegram.ui.ActionBar.u2, org.telegram.ui.ActionBar.a2
    public final void a(boolean z10) {
        if (z10) {
            this.B4 = z10;
        }
        dismiss();
    }

    public final rt a1() {
        ci ciVar;
        return (this.X1 && ((ciVar = this.w2) == this.e2 || ciVar == this.l2)) ? this.N2 : this.C2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        return e2Var instanceof org.telegram.ui.an ? ((org.telegram.ui.an) e2Var).a() : this.U1;
    }

    public final int c1(int i7) {
        ci ciVar = this.x2;
        int[] iArr = this.Z3;
        if (ciVar == null || !((this.w2 instanceof im) || (ciVar instanceof im))) {
            return iArr[i7];
        }
        return org.telegram.messenger.g0.W1(this.Y1, iArr[0], iArr[1]);
    }

    public final int d1(boolean z10) {
        o7 o7Var;
        if (this.f4) {
            return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.kh, this.J0);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        Iterator it = this.s1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a11 = c8.i9.a(f10, 0.0f, 1.0f);
        if (z10 && (o7Var = this.V2) != null && o7Var.getVisibility() == 0) {
            a11 *= 1.0f - o7Var.getAlpha();
        }
        return i0.a.f(a11, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0), org.telegram.ui.ActionBar.j6.w0(a10 ? org.telegram.ui.ActionBar.j6.a7 : org.telegram.ui.ActionBar.j6.i5, this.J0));
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.T0 && i7 != org.telegram.messenger.ns.W4 && i7 != org.telegram.messenger.ns.F1) {
            if (i7 == org.telegram.messenger.ns.f5) {
                this.F1 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).H0();
            }
        } else {
            hi hiVar = this.y3;
            if (hiVar != null) {
                hiVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        ph phVar;
        nh nhVar;
        if (this.w2.q() || this.J) {
            return;
        }
        ci ciVar = this.w2;
        qk qkVar = this.r2;
        int i7 = 1;
        int i10 = 0;
        boolean z10 = (ciVar != qkVar || qkVar == null || qkVar.L || qkVar.Q0 == null) ? false : true;
        this.s2 = z10;
        if (!z10 && (nhVar = this.C2) != null) {
            org.telegram.messenger.g0.v1(nhVar.getEditText());
        }
        if (!this.s2 && (phVar = this.N2) != null) {
            org.telegram.messenger.g0.v1(phVar.getEditText());
        }
        this.v2.clear();
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var == null) {
            e2Var = LaunchActivity.Q();
        }
        if (this.B4 || e2Var == null || this.w2.getSelectedItemsCount() <= 0 || this.A1) {
            int i11 = 0;
            while (true) {
                ci[] ciVarArr = this.u2;
                if (i11 >= ciVarArr.length) {
                    break;
                }
                ci ciVar2 = ciVarArr[i11];
                if (ciVar2 != null && this.w2 != ciVar2) {
                    ciVar2.q();
                }
                i11++;
            }
            org.telegram.messenger.g0.t3(this, i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0), 0), true, new sg(this, 11));
            if (e2Var != null) {
                org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
            }
            this.g4 = false;
            super.dismiss();
            this.B4 = false;
            return;
        }
        if (this.A4) {
            return;
        }
        this.A4 = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), this.J0);
        String M0 = org.telegram.messenger.hd.M0(2131751399, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131751400, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751406, null), new sg(this, i7));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        t1Var.setOnCancelListener(new yg(this, i10));
        t1Var.O = new m0(this, 3);
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, this.J0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        ki kiVar;
        xl xlVar;
        org.telegram.messenger.ve veVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        ci ciVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        this.L2 = 0L;
        this.G2.setEffect(0L);
        int i7 = 0;
        this.B3 = false;
        this.z3 = false;
        this.D3 = 0.0f;
        this.C3.setVisibility(8);
        RadialProgressView radialProgressView = this.A3;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        kh khVar = this.v3;
        khVar.setAlpha(1.0f);
        khVar.setTranslationY(0.0f);
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.v2;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((ki.y3) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
            i10++;
        }
        int i11 = this.O2;
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (i11 != 2) {
            if (e2Var instanceof org.telegram.ui.an) {
                org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
                chat = anVar.e;
                user = anVar.j();
            } else {
                long j3 = this.U1;
                int i12 = this.H3;
                if (j3 >= 0) {
                    user = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(this.U1));
                    chat = null;
                } else if (j3 < 0) {
                    chat = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(-this.U1));
                    user = null;
                }
            }
            z10 = e2Var instanceof org.telegram.ui.an;
            if ((z10 && this.O2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.J3 = org.telegram.messenger.t3.p(chat);
                    this.K3 = org.telegram.messenger.t3.u(chat);
                    this.L3 = org.telegram.messenger.t3.o(chat);
                    this.M3 = org.telegram.messenger.t3.r(chat);
                    this.N3 = !org.telegram.messenger.t3.V(chat) && org.telegram.messenger.t3.r(chat);
                    this.O3 = org.telegram.messenger.t3.q(chat);
                    this.I3 = org.telegram.messenger.t3.l(chat);
                } else {
                    this.M3 = org.telegram.messenger.q10.t(user) || org.telegram.messenger.q10.B(user);
                    this.N3 = !z10 || ((org.telegram.ui.an) e2Var).h == null;
                }
            }
            if (this.B1) {
                this.J3 = true;
                this.K3 = true;
            }
            if (this.P3) {
                this.M3 = false;
                this.N3 = false;
            }
            nh nhVar = this.C2;
            if (z10 || this.O2 == 2) {
                nhVar.setVisibility(this.R1 ? 0 : 4);
            }
            boolean z11 = this.K3;
            boolean z12 = this.J3;
            boolean z13 = this.I3;
            chatAttachAlertPhotoLayout = this.e2;
            kiVar = chatAttachAlertPhotoLayout.b;
            ny nyVar = chatAttachAlertPhotoLayout.I;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z11;
            chatAttachAlertPhotoLayout.y0 = z12;
            chatAttachAlertPhotoLayout.A0 = z13;
            xlVar = chatAttachAlertPhotoLayout.Q;
            if (xlVar != null) {
                xlVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.Q.setEnabled(chatAttachAlertPhotoLayout.w0);
            }
            if (!((kiVar.a2 instanceof org.telegram.ui.an) && kiVar.Y0() == null) && kiVar.O2 == 0) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
                if (chatAttachAlertPhotoLayout.w0) {
                    nyVar.setText(org.telegram.messenger.hd.M0(2131748180, null));
                    nyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat Y0 = kiVar.Y0();
                    nyVar.a(R.raw.media_forbidden, org.telegram.messenger.ns.g2, org.telegram.messenger.ns.g2);
                    if (org.telegram.messenger.t3.P(7, Y0)) {
                        nyVar.setText(org.telegram.messenger.hd.M0(2131749543, null));
                    } else if (org.telegram.messenger.g0.D1(Y0.banned_rights)) {
                        nyVar.setText(org.telegram.messenger.hd.a0("AttachMediaRestrictedForever", null, 2131753955, new Object[0]));
                    } else {
                        nyVar.setText(org.telegram.messenger.hd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.hd.v(Y0.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.t0()) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            } else {
                chatAttachAlertPhotoLayout.V0 = MediaController.b2;
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
                for (int i13 = 0; i13 < Math.min(100, chatAttachAlertPhotoLayout.V0.e.size()); i13++) {
                    ((org.telegram.messenger.ff) chatAttachAlertPhotoLayout.V0.e.get(i13)).e();
                }
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.G.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.hd.M0(2131752238, null));
            veVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = veVar;
            if (veVar != null) {
                chatAttachAlertPhotoLayout.Y0 = false;
                if (nyVar != null) {
                    nyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            nhVar.k(true);
            this.N2.k(true);
            this.s3 = false;
            A0(false);
            if (!this.J1 || this.K1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.j2 == null) {
                    dl dlVar = new dl(this, getContext(), this.J0, (this.C1 || this.K1 || this.P3) ? false : true);
                    this.j2 = dlVar;
                    this.u2[5] = dlVar;
                    cl clVar = this.u4;
                    if (clVar != null) {
                        dlVar.setDelegate(clVar);
                    } else {
                        dlVar.setDelegate(new sg(this, i7));
                    }
                }
                this.U2 = 5L;
                ciVar = this.j2;
            } else if (this.I1) {
                r1(false);
                ciVar = this.k2;
                this.U2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                org.telegram.messenger.gj gjVar = this.F3;
                if (gjVar != null) {
                    int i14 = this.E3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i14 == -1) {
                        this.Q2 = true;
                        if (gjVar.I3()) {
                            p1(false);
                            ciVar = this.g2;
                            this.U2 = 3L;
                        } else if (this.F3.U2()) {
                            r1(false);
                            ciVar = this.k2;
                            this.U2 = 4L;
                        } else {
                            this.U2 = 1L;
                        }
                    } else {
                        if (i14 == 2) {
                            p1(false);
                            ciVar = this.g2;
                            this.U2 = 3L;
                        } else if (i14 == 1) {
                            r1(false);
                            ciVar = this.k2;
                            this.U2 = 4L;
                        } else {
                            this.U2 = 1L;
                            ciVar = chatAttachAlertPhotoLayout2;
                        }
                        this.Q2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.Q2 = this.O2 == 0 && !this.R2;
                    this.U2 = 1L;
                }
                ciVar = chatAttachAlertPhotoLayout2;
            }
            khVar.setVisibility(this.Q2 ? 0 : 8);
            if (this.w2 != ciVar) {
                o7 o7Var = this.V2;
                if (o7Var.o0) {
                    o7Var.n(true);
                }
                this.b.removeView(this.w2);
                this.w2.u();
                this.w2.setVisibility(8);
                this.w2.t();
                this.w2 = ciVar;
                this.r0 = true;
                if (ciVar.getParent() == null) {
                    s1(this.w2);
                    this.b.addView(this.w2, 0, c8.ja.c(-1.0f, -1));
                }
                ciVar.setAlpha(1.0f);
                ciVar.setVisibility(0);
                ciVar.I(null);
                ciVar.J();
                S0(ciVar);
                o7Var.setVisibility(ciVar.j() != 0 ? 0 : 4);
                v1(this.X1, false);
                L1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.w2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            K1(0);
            this.y3.f();
            a1().setText("");
            this.x3.h1(0, 1000000);
        }
        user = null;
        chat = null;
        z10 = e2Var instanceof org.telegram.ui.an;
        if (z10) {
            if (chat != null) {
            }
            if (this.B1) {
            }
            if (this.P3) {
            }
            nh nhVar2 = this.C2;
            if (z10) {
            }
            nhVar2.setVisibility(this.R1 ? 0 : 4);
            boolean z112 = this.K3;
            boolean z122 = this.J3;
            boolean z132 = this.I3;
            chatAttachAlertPhotoLayout = this.e2;
            kiVar = chatAttachAlertPhotoLayout.b;
            ny nyVar2 = chatAttachAlertPhotoLayout.I;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z112;
            chatAttachAlertPhotoLayout.y0 = z122;
            chatAttachAlertPhotoLayout.A0 = z132;
            xlVar = chatAttachAlertPhotoLayout.Q;
            if (xlVar != null) {
            }
            if (kiVar.a2 instanceof org.telegram.ui.an) {
            }
            chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            if (chatAttachAlertPhotoLayout.w0) {
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.G.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.hd.M0(2131752238, null));
            veVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = veVar;
            if (veVar != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            nhVar2.k(true);
            this.N2.k(true);
            this.s3 = false;
            A0(false);
            if (this.J1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.j2 == null) {
            }
            this.U2 = 5L;
            ciVar = this.j2;
            khVar.setVisibility(this.Q2 ? 0 : 8);
            if (this.w2 != ciVar) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.w2 != chatAttachAlertPhotoLayout3) {
            }
            K1(0);
            this.y3.f();
            a1().setText("");
            this.x3.h1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.B1) {
        }
        if (this.P3) {
        }
        nh nhVar22 = this.C2;
        if (z10) {
        }
        nhVar22.setVisibility(this.R1 ? 0 : 4);
        boolean z1122 = this.K3;
        boolean z1222 = this.J3;
        boolean z1322 = this.I3;
        chatAttachAlertPhotoLayout = this.e2;
        kiVar = chatAttachAlertPhotoLayout.b;
        ny nyVar22 = chatAttachAlertPhotoLayout.I;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.w0 = z14;
        chatAttachAlertPhotoLayout.x0 = z1122;
        chatAttachAlertPhotoLayout.y0 = z1222;
        chatAttachAlertPhotoLayout.A0 = z1322;
        xlVar = chatAttachAlertPhotoLayout.Q;
        if (xlVar != null) {
        }
        if (kiVar.a2 instanceof org.telegram.ui.an) {
        }
        chatAttachAlertPhotoLayout.V0 = MediaController.a2;
        if (chatAttachAlertPhotoLayout.w0) {
        }
        chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.h0();
        if (chatAttachAlertPhotoLayout.V0 != null) {
        }
        chatAttachAlertPhotoLayout.c0();
        chatAttachAlertPhotoLayout.B0(false);
        chatAttachAlertPhotoLayout.s.h1(0, 1000000);
        chatAttachAlertPhotoLayout.G.h1(0, 1000000);
        chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.hd.M0(2131752238, null));
        veVar = chatAttachAlertPhotoLayout.V0;
        chatAttachAlertPhotoLayout.U0 = veVar;
        if (veVar != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        nhVar22.k(true);
        this.N2.k(true);
        this.s3 = false;
        A0(false);
        if (this.J1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.j2 == null) {
        }
        this.U2 = 5L;
        ciVar = this.j2;
        khVar.setVisibility(this.Q2 ? 0 : 8);
        if (this.w2 != ciVar) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.w2 != chatAttachAlertPhotoLayout3) {
        }
        K1(0);
        this.y3.f();
        a1().setText("");
        this.x3.h1(0, 1000000);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean f0(MotionEvent motionEvent) {
        return this.w2.o(motionEvent);
    }

    public final boolean f1() {
        if (!this.X1) {
            return false;
        }
        ci ciVar = this.w2;
        return ciVar == this.e2 || ciVar == this.l2;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ii iiVar = this.X3;
        if (iiVar == null || this.s3) {
            return;
        }
        boolean g02 = iiVar.g0();
        this.s3 = true;
        org.telegram.messenger.g0.i3(new di.m6(this, editTextBoldCursor, z10, 19), g02 ? 200L : 0L);
    }

    public final void i1() {
        if (this.s0 == null || this.b == null) {
            return;
        }
        int d12 = d1(false);
        org.telegram.ui.ActionBar.j6.C1(d12, this.s0);
        ui.c cVar = this.E4;
        if (cVar.b != d12) {
            cVar.a(d12);
            lh.f fVar = this.t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            mh mhVar = this.u3;
            if (mhVar != null) {
                mhVar.invalidate();
            }
        }
        L1();
        this.b.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final qk qkVar = this.r2;
        if (qkVar != null && this.w2 == qkVar) {
            final vg vgVar = new vg(this, 1);
            int i7 = qkVar.n;
            org.telegram.ui.Wallet.o9 o9Var = qkVar.S;
            ki kiVar = qkVar.b;
            AnimatorSet animatorSet = null;
            if (!qkVar.L && (wallettransaction = qkVar.Q0) != null && qkVar.R0 == null && qkVar.S0 == null) {
                if (qkVar.T0) {
                    org.telegram.ui.Wallet.y5 y5Var = new org.telegram.ui.Wallet.y5();
                    y5Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                    if (e2Var != null && e2Var.presentFragment(y5Var, false, true)) {
                        final int i10 = 0;
                        org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(kiVar.c, kiVar.b, o9Var.getDiamondView(), y5Var, qkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.ik
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        if (!qkVar.L) {
                                            vgVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!qkVar.L) {
                                            vgVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, kiVar);
                        qkVar.S0 = daVar;
                        animatorSet = daVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.w6 diamondView = o9Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (anVar.getCurrentAccount() == i7 && anVar.a() == qkVar.r.id && anVar.g4 == 0 && anVar.getFragmentView() != null && anVar.getFragmentView().isAttachedToWindow()) {
                                final int i11 = 1;
                                org.telegram.ui.Wallet.o6 o6Var = new org.telegram.ui.Wallet.o6(kiVar.c, kiVar.b, o9Var.getDiamondView(), anVar, qkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.ik
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                if (!qkVar.L) {
                                                    vgVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!qkVar.L) {
                                                    vgVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, kiVar);
                                qkVar.R0 = o6Var;
                                animatorSet = o6Var.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.A0 = animatorSet;
                this.B0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        int i7 = 0;
        while (true) {
            ci[] ciVarArr = this.u2;
            if (i7 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null) {
                ciVar.p();
            }
            i7++;
        }
        int i10 = this.H3;
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.T0);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.W4);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f5);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.F1);
        this.Q1 = true;
        nh nhVar = this.C2;
        if (nhVar != null) {
            nhVar.o();
        }
        ph phVar = this.N2;
        if (phVar != null) {
            phVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        s71 s71Var = chatAttachAlertPhotoLayout.m0;
        bi.g2 g2Var = chatAttachAlertPhotoLayout.k0;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        ql qlVar = chatAttachAlertPhotoLayout.r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        boolean z10 = i13 < i14;
        int i15 = org.telegram.messenger.g0.n;
        if (view == g2Var) {
            if (z10) {
                if (qlVar.getVisibility() == 0) {
                    g2Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                g2Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            }
            if (qlVar.getVisibility() == 0) {
                g2Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            }
            g2Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
            return true;
        }
        if (view == s71Var) {
            if (z10) {
                if (qlVar.getVisibility() == 0) {
                    s71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                s71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            }
            if (qlVar.getVisibility() == 0) {
                s71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            }
            s71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
            return true;
        }
        if (view != textView) {
            if (view != qlVar) {
                return false;
            }
            if (z10) {
                int z11 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z11, view.getMeasuredWidth(), view.getMeasuredHeight() + z11);
                return true;
            }
            int L2 = (i7 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L2, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight());
            return true;
        }
        if (z10) {
            L = (i13 - textView.getMeasuredWidth()) / 2;
            int L3 = i12 - org.telegram.messenger.g0.L(167.0f);
            textView.setRotation(0.0f);
            if (qlVar.getVisibility() == 0) {
                L3 -= org.telegram.messenger.g0.L(96.0f);
            }
            measuredWidth = L3 - i15;
        } else {
            L = i11 - org.telegram.messenger.g0.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
            textView.setRotation(-90.0f);
            if (qlVar.getVisibility() == 0) {
                L -= org.telegram.messenger.g0.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void k1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p10 = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : org.telegram.messenger.q10.p(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.b0(this.H3).b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.hd.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.hd.M0(2131753001, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.hd.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        t1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, "OK"), new a3.h(this, tL_attachMenuBot, user, 25));
        i5.c.x("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean l0(View view, int i7, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        am amVar = chatAttachAlertPhotoLayout.w;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        ql qlVar = chatAttachAlertPhotoLayout.r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i7 < i10;
        if (view != chatAttachAlertPhotoLayout.Q) {
            bi.g2 g2Var = chatAttachAlertPhotoLayout.k0;
            if (view == g2Var) {
                if (z10) {
                    g2Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                g2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            s71 s71Var = chatAttachAlertPhotoLayout.m0;
            if (view == s71Var) {
                if (z10) {
                    s71Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                s71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            if (view == qlVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    qlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
                    if (b0Var.o != 0) {
                        qlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        amVar.f();
                    }
                } else {
                    qlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                    if (b0Var.o != 1) {
                        qlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        amVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
            chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(kiVar.U() + kiVar.T() + i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void l1() {
        int i7 = 0;
        while (true) {
            ci[] ciVarArr = this.u2;
            if (i7 >= ciVarArr.length) {
                this.d4 = true;
                return;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null) {
                ciVar.A();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean m0() {
        this.e2.setTranslationX(0.0f);
        this.l3.setAlpha(0.0f);
        this.j3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.o4 = animatorSet;
        int i7 = 2;
        vh vhVar = this.m4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, vhVar, 0.0f, 400.0f));
        this.o4.setDuration(400L);
        this.o4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        vhVar.getClass();
        vhVar.a(this, valueOf);
        this.o4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new tg(this, i7));
        r1.g gVar = this.n4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.b, (r1.e) r1.g.p, 0.0f);
        this.n4 = gVar2;
        if (this.F3 != null) {
            gVar2.m.a(0.75f);
            this.n4.m.b(350.0f);
        } else {
            gVar2.m.a(0.75f);
            this.n4.m.b(350.0f);
        }
        this.n4.h();
        if (this.K) {
            this.c.setLayerType(2, null);
        }
        this.B0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, k6.d, this.p0 ? this.q0 : 0));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        h2.f fVar = new h2.f((int[]) null);
        int i10 = 3;
        yf yfVar = new yf(this, fVar, this.z0, i10);
        this.n4.a(new bi.v0(i10, this, yfVar));
        this.A0.addListener(new ah.l(25, this, yfVar));
        fVar.d();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new tg(this, i10));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(er.f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        this.d4 = false;
        while (true) {
            ci[] ciVarArr = this.u2;
            if (i7 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null) {
                ciVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.X3.g0();
        }
        hi hiVar = this.y3;
        if (hiVar != null) {
            hiVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.gj gjVar = this.F3;
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        int i7 = this.H3;
        if (gjVar != null && gjVar.p5() && !org.telegram.messenger.t3.z(i7, 24, org.telegram.messenger.gj.B0(this.F3.k)) && (e2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            org.telegram.messenger.lj ljVar = anVar.x5;
            if (ljVar == null) {
                ljVar = org.telegram.messenger.lj.b(this.F3.k.suggested_post);
            }
            if (!di.u8.T(i7, ljVar.a)) {
                anVar.Ac(ljVar);
                return;
            }
        }
        if (this.F1 - this.G1 < 0) {
            org.telegram.messenger.g0.E3(this.u1);
            org.telegram.messenger.g0.E3(this.v1);
            try {
                this.G2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (org.telegram.messenger.np.s1(i7).D3() || org.telegram.messenger.np.s1(i7).V4 <= this.G1) {
                return;
            }
            D1(e2Var);
            return;
        }
        if (this.F3 == null && (e2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar2 = (org.telegram.ui.an) e2Var;
            if (anVar2.c()) {
                t4.J(getContext(), anVar2.a(), new sg(this, 14), this.J0);
                return;
            }
        }
        ci ciVar = this.w2;
        if (ciVar == this.e2 || ciVar == this.l2) {
            u1(true, 0, 0, this.L2, f1());
        } else {
            if (ciVar.M(true, 0, 0, this.L2, f1())) {
                return;
            }
            this.B4 = true;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void o0() {
        if (this.w2.s()) {
            dismiss();
        }
    }

    public final void o1(int i7) {
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (i7 == 3) {
            if (this.L3 || !N0()) {
                Activity parentActivity = e2Var != null ? e2Var.getParentActivity() : null;
                if (parentActivity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                p1(true);
                return;
            }
            return;
        }
        if (i7 == 6 && org.telegram.messenger.g0.J1(e2Var)) {
            if (this.j2 == null) {
                dl dlVar = new dl(this, getContext(), this.J0, (this.C1 || this.P3) ? false : true);
                this.j2 = dlVar;
                this.u2[5] = dlVar;
                cl clVar = this.u4;
                if (clVar != null) {
                    dlVar.setDelegate(clVar);
                } else if (e2Var instanceof org.telegram.ui.an) {
                    dlVar.setDelegate(new sg(this, 18));
                }
            }
            F1(this.j2);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        if (this.N1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        o7 o7Var = this.V2;
        if (o7Var.o0) {
            o7Var.n(true);
            return;
        }
        if (this.w2.k()) {
            return;
        }
        if (a1() == null || !a1().e) {
            super.onBackPressed();
        } else {
            a1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var != null) {
            org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.w2.H(i7)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.N1);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.N1);
        }
    }

    public final void p1(boolean z10) {
        if (!this.L3 && z10) {
            kn knVar = new kn(3, getContext(), this.J0, this);
            this.O1 = knVar;
            F1(knVar);
        }
        int i7 = 1;
        if (this.g2 == null) {
            vi viVar = new vi(getContext(), this.J0, this);
            this.g2 = viVar;
            this.u2[3] = viVar;
            viVar.setupBlurredSearchField(this.F4);
            this.g2.setDelegate(new sg(this, 15));
            if (this.C1) {
                this.g2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) e2Var).e;
            vi viVar2 = this.g2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                i7 = -1;
            }
            viVar2.setMaxSelectedFiles(i7);
        }
        if (z10) {
            F1(this.g2);
        }
    }

    public final void q1() {
        if (!this.O3) {
            kn knVar = new kn(5, getContext(), this.J0, this);
            this.O1 = knVar;
            F1(knVar);
        }
        if (this.f2 == null) {
            mj mjVar = new mj(getContext(), this.J0, this);
            this.f2 = mjVar;
            this.u2[2] = mjVar;
            mjVar.setupBlurredSearchField(this.F4);
            this.f2.setDelegate(new th(this));
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) e2Var).e;
            this.f2.setMultipleSelectionAllowed(chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled);
        }
        F1(this.f2);
    }

    public final void r1(boolean z10) {
        if (!this.I3 && z10) {
            kn knVar = new kn(4, getContext(), this.J0, this);
            this.O1 = knVar;
            F1(knVar);
        }
        boolean z11 = false;
        if (this.k2 == null) {
            dk dkVar = new dk(this.I1 ? 2 : 0, getContext(), this.J0, this);
            this.k2 = dkVar;
            this.u2[4] = dkVar;
            dkVar.setDelegate(new uh(this));
        }
        int i7 = 1;
        if (this.C1) {
            this.k2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.e2 e2Var = this.a2;
            if (e2Var instanceof org.telegram.ui.an) {
                TLRPC.Chat chat = ((org.telegram.ui.an) e2Var).e;
                dk dkVar2 = this.k2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                    i7 = -1;
                }
                dkVar2.setMaxSelectedFiles(i7);
            } else {
                this.k2.setMaxSelectedFiles(this.Q3);
                dk dkVar3 = this.k2;
                if (!this.I1 && !this.R1) {
                    z11 = true;
                }
                dkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        dk dkVar4 = this.k2;
        dkVar4.e0 = this.I1;
        if (z10) {
            F1(dkVar4);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            P0();
            dh.d dVar = this.W1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.j5, this.J0);
            org.telegram.ui.ActionBar.q0 q0Var = this.i3;
            if (q0Var == null || w02 == this.p4) {
                return;
            }
            this.p4 = w02;
            q0Var.setIconColor(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        this.G3 = false;
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            this.i0 = ((org.telegram.ui.an) e2Var).V9();
        }
        L1();
        this.q3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0), 0);
            this.H0 = o4;
            org.telegram.messenger.g0.t3(this, o4, false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        }
        if (this.k4) {
            this.k4 = false;
            o7 o7Var = this.V2;
            o7Var.updateColors();
            o7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        o7 o7Var = this.V2;
        int i7 = 1;
        if (o7Var.o0) {
            o7Var.n(true);
        }
        this.f2 = null;
        this.n2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = null;
        this.k2 = null;
        this.r2 = null;
        while (true) {
            ci[] ciVarArr = this.u2;
            if (i7 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i7];
            if (ciVar != null) {
                ciVar.p();
                this.b.removeView(ciVarArr[i7]);
                ciVarArr[i7] = null;
            }
            i7++;
        }
        I1(false, false);
        super.L();
        if (this.s2) {
            this.s2 = false;
            this.t2 = 0.0f;
            org.telegram.ui.ActionBar.e2 e2Var = this.a2;
            if (e2Var == null || e2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = e2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void u0(boolean z10) {
        this.r0 = true;
    }

    public final boolean u1(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        if (this.G3) {
            return false;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            TLRPC.Chat chat = anVar.e;
            if (anVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                org.telegram.messenger.np.s1(this.H3).e7.edit().putBoolean("silent_" + anVar.a(), !z10).commit();
            }
        }
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.r1.f) {
            this.G3 = true;
            this.X3.y1(7, true, z10, i7, i10, j3, z11, false, 0L);
            return true;
        }
        long b12 = b1();
        ci ciVar = this.w2;
        return t4.Y(this.H3, b12, X0() + (ciVar != null ? ciVar.getSelectedItemsCount() : 1), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.fh
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                ki kiVar = ki.this;
                kiVar.G3 = true;
                kiVar.X3.y1(7, true, z10, i7, i10, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void v() {
        if (this.a2 instanceof org.telegram.ui.an) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.w2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.hd.M0(2131754921, "AccDescrAttachButton"));
        this.q3 = true;
        if (this.K3 || this.J3) {
            return;
        }
        N0();
    }

    public final void v1(boolean z10, boolean z11) {
        this.m1.a(z10, z11);
        rt a12 = a1();
        this.X1 = z10;
        rt a13 = a1();
        final boolean z12 = this.B2.getTag() != null;
        ci ciVar = this.w2;
        final boolean z13 = this.X1 && (ciVar == this.e2 || ciVar == this.l2);
        ai.k0 k0Var = this.M2;
        kg.j jVar = this.A2;
        if (z11) {
            k0Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = k0Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            er erVar = er.h;
            final int i7 = 0;
            duration.setInterpolator(erVar).setUpdateListener(new tg(this, i7)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.ug
                public final /* synthetic */ ki b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            ki kiVar = this.b;
                            if (!z13 || !z12) {
                                kiVar.M2.setVisibility(8);
                            }
                            kiVar.Q1();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.A2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar);
            final int i10 = 1;
            interpolator.setUpdateListener(new tg(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.ug
                public final /* synthetic */ ki b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ki kiVar = this.b;
                            if (!z13 || !z12) {
                                kiVar.M2.setVisibility(8);
                            }
                            kiVar.Q1();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.A2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            k0Var.setVisibility((z13 && z12) ? 0 : 8);
            k0Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            Q1();
            jVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            jVar.setTranslationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (a12 != a13) {
            a12.k(true);
            a13.setText(p5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new vg(this, 0));
    }

    public final void w1(int i7, org.telegram.messenger.gj gjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (gjVar != null && (chatAttachAlertPhotoLayout = this.e2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.F3 == gjVar && this.E3 == i7) {
            return;
        }
        this.F3 = gjVar;
        if (gjVar != null && gjVar.z2()) {
            i7 = this.F3.I3() ? 2 : this.F3.U2() ? 1 : 0;
        }
        this.E3 = i7;
        if (this.F3 != null) {
            this.Q3 = 1;
            this.R3 = false;
        } else {
            this.Q3 = -1;
            this.R3 = true;
        }
        this.y3.f();
        K1(0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i7;
        float translationY = this.b.getTranslationY() - this.t2;
        this.t2 = this.b.getHeight() * f10;
        this.b.setTranslationY(translationY);
        qk qkVar = this.r2;
        if (qkVar != null) {
            qkVar.setSendTransitionProgress(f10);
        }
        if (this.p0) {
            i7 = Math.round((1.0f - f10) * this.q0);
        } else {
            i7 = 0;
        }
        this.Z.setAlpha(i7);
        this.D0 = 1.0f - f10;
        this.c.invalidate();
    }

    public final void y1(int i7, boolean z10) {
        if (this.F3 != null) {
            return;
        }
        this.Q3 = i7;
        this.R3 = z10;
    }

    public final void z1(float f10) {
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0), Math.min(org.telegram.messenger.ns.e4, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o4;
        org.telegram.messenger.g0.t3(this, o4, false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        this.c.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        org.telegram.ui.ActionBar.q0 q0Var;
        gi.j jVar;
        int i7;
        float f10;
        te.j jVar2;
        int i10 = 0;
        er erVar = er.h;
        this.m1 = new te.a(0, this, erVar, 380L, false);
        this.n1 = new te.a(1, this, erVar, 380L, false);
        this.o1 = new te.a(2, this, erVar, 380L, false);
        this.p1 = new te.a(3, this, erVar, 380L, false);
        this.q1 = new te.a(4, this, erVar, 380L, true);
        this.r1 = new te.a(5, this, erVar, 320L, false);
        te.j jVar3 = new te.j(new sg(this, 2), erVar, 380L);
        this.s1 = jVar3;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Y1 = 0.0f;
        this.Z1 = new vh(this, 0);
        this.d2 = false;
        ci[] ciVarArr = new ci[12];
        this.u2 = ciVarArr;
        this.v2 = new LongSparseArray();
        this.E2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.H2 = textPaint;
        this.I2 = new RectF();
        this.J2 = new Paint(1);
        this.S2 = true;
        this.T2 = 1.0f;
        this.z3 = false;
        this.B3 = false;
        int i11 = org.telegram.messenger.m10.t0;
        this.H3 = i11;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.M3 = true;
        this.N3 = true;
        this.O3 = true;
        this.Q3 = -1;
        this.R3 = true;
        this.W3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.Z3 = new int[2];
        new Paint(1);
        this.g4 = false;
        ArrayList arrayList = new ArrayList();
        this.h4 = arrayList;
        Rect rect = new Rect();
        this.i4 = rect;
        this.m4 = new vh(this, 1);
        this.s4 = true;
        this.t4 = false;
        this.A4 = false;
        this.B4 = false;
        this.y = true;
        ui.c cVar = new ui.c();
        this.E4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0));
        this.Y0.E.add(new ri.o(cVar, new sg(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.gz.f()) {
            this.D4 = null;
            this.F4 = new dh.c(cVar, cVar, cVar);
            this.G4 = new dh.c(cVar, cVar, cVar);
        } else {
            dh.g gVar = new dh.g(false);
            this.D4 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(cVar);
            fVar.f = cVar;
            fVar.d = gVar;
            fVar.e = -2;
            ui.f fVar2 = new ui.f(null);
            fVar2.f = cVar;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.F4 = cVar2;
            cVar2.k = true;
            int L = org.telegram.messenger.qc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.G4 = cVar3;
            cVar3.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.e = L2;
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.H4 = new zg(this, i10);
        this.f4 = z10;
        this.b2 = (e2Var instanceof org.telegram.ui.an) && e2Var.isInBubbleMode();
        this.l0 = new OvershootInterpolator(0.7f);
        this.a2 = e2Var;
        this.G = true;
        this.z0 = this;
        org.telegram.messenger.ns.f(i11).c(this, org.telegram.messenger.ns.T0);
        org.telegram.messenger.ns.f(i11).c(this, org.telegram.messenger.ns.W4);
        org.telegram.messenger.ns.f(i11).c(this, org.telegram.messenger.ns.f5);
        org.telegram.messenger.ns.f(i11).c(this, org.telegram.messenger.ns.F1);
        arrayList.add(rect);
        xh xhVar = new xh(this, context);
        this.p3 = xhVar;
        xhVar.setDelegate(new yh(this));
        this.b = xhVar;
        xhVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i12 = this.u0;
        viewGroup.setPadding(i12, 0, i12, 0);
        o7 o7Var = new o7(this, context, e6Var, 1);
        this.V2 = o7Var;
        o7Var.d1 = true;
        o7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        o7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        int i13 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, i13, e6Var);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, i14, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 5, i13, e6Var);
        o7Var.setOccupyStatusBar(true);
        o7Var.setAlpha(0.0f);
        o7Var.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 13));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i13, this.J0), false, e6Var);
        this.Y2 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(R.drawable.ic_ab_other);
        q0Var2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        q0Var2.setVisibility(4);
        q0Var2.setAlpha(0.0f);
        q0Var2.setScaleX(0.6f);
        q0Var2.setScaleY(0.6f);
        q0Var2.setSubMenuOpenSide(2);
        q0Var2.setDelegate(new sg(this, 10));
        q0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 6, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(q0Var2, h02, null, M, e6Var);
        final int i15 = 5;
        q0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i15) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i16 = 0; i16 < chatAttachAlertPhotoLayout.F.getChildCount(); i16++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i16);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var3 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var3.getWidth() / 2.0f) + q0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i13, this.J0), false, e6Var);
        this.a3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        hi.u uVar = new hi.u();
        this.Z2 = uVar;
        q0Var3.setIcon(uVar);
        q0Var3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        q0Var3.setVisibility(8);
        q0Var3.setAlpha(0.0f);
        q0Var3.setScaleX(0.6f);
        q0Var3.setScaleY(0.6f);
        q0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        final int i16 = 6;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 6, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(q0Var3, h03, null, M2, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i16) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        gi.j jVar4 = new gi.j(this, context);
        org.telegram.ui.ActionBar.q6.U(jVar4, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        jVar4.setText(org.telegram.messenger.hd.M0(2131751753, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        final int i17 = 7;
        jVar4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i17) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        c8.na.a(jVar4);
        this.d3 = jVar4;
        L1();
        if (e2Var != null) {
            i7 = i13;
            jVar = jVar4;
            q0Var = q0Var3;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.q0 q0Var4 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i7, this.J0), false, e6Var);
            this.c3 = q0Var4;
            q0Var4.setLongClickEnabled(false);
            q0Var4.setIcon(R.drawable.outline_header_search);
            q0Var4.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
            q0Var4.setVisibility(4);
            q0Var4.setAlpha(0.0f);
            q0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 6, -1);
            org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i14);
            q0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.q6.j(q0Var4, h04, null, M3, e6Var);
            q0Var4.setOnClickListener(new fi.x1(5, this, z11));
        } else {
            q0Var = q0Var3;
            jVar = jVar4;
            i7 = i13;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.q0 q0Var5 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i7, this.J0), false, e6Var);
        this.i3 = q0Var5;
        q0Var5.setLongClickEnabled(false);
        q0Var5.setIcon(R.drawable.ic_ab_other);
        q0Var5.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        final int i18 = 8;
        q0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 3, -1);
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.q6.j(q0Var5, h05, null, M4, e6Var);
        final int i19 = 2;
        q0Var5.e(1, R.drawable.msg_addbot, org.telegram.messenger.hd.M0(2131744877, null)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        final ki kiVar = this.b;
                        nh nhVar = kiVar.C2;
                        if (nhVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var = new d0(kiVar.getContext(), e6Var);
                            d0Var.s1(nhVar.getText());
                            final int i20 = 0;
                            d0Var.f2 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.ah
                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            nh nhVar2 = kiVar.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar = kiVar.N2;
                                            phVar.setText(charSequence);
                                            phVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = kiVar.U1;
                            boolean z13 = kiVar.F3 != null;
                            bh bhVar = new bh(kiVar, 0);
                            d0Var.h2 = j3;
                            d0Var.i2 = z13;
                            d0Var.j2 = bhVar;
                            d0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ki kiVar2 = this.b;
                        ph phVar = kiVar2.N2;
                        if (phVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var2 = new d0(kiVar2.getContext(), e6Var);
                            d0Var2.s1(phVar.getText());
                            final int i21 = 1;
                            d0Var2.f2 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.ah
                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            nh nhVar2 = kiVar2.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = kiVar2.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = kiVar2.U1;
                            boolean z14 = kiVar2.F3 != null;
                            bh bhVar2 = new bh(kiVar2, 1);
                            d0Var2.h2 = j10;
                            d0Var2.i2 = z14;
                            d0Var2.j2 = bhVar2;
                            d0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ki kiVar3 = this.b;
                        kiVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar3.a2;
                        p12.I2(null, e2Var2, e6Var);
                        PhotoViewer.p1().J2(kiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i22 = kiVar3.Q3;
                        boolean z15 = kiVar3.R3;
                        p13.h = i22;
                        p13.n = z15;
                        if (!kiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(e2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(kiVar3.c.findFocus());
                        }
                        File w10 = hi.d7.w(kiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i23 = point.x;
                        int i24 = point.y;
                        if (i23 > 1080 || i24 > 1080) {
                            float min = Math.min(i23, i24) / 1080.0f;
                            i23 = (int) (i23 * min);
                            i24 = (int) (i24 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i23, i24, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new bi(kiVar3, ffVar), e2Var2 instanceof org.telegram.ui.an ? (org.telegram.ui.an) e2Var2 : null);
                        if (kiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, kiVar3.E1);
                            break;
                        }
                        break;
                }
            }
        });
        q0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        q0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        q0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i18) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        final int i20 = 0;
        kh khVar = new kh(this, context, i20);
        this.g3 = khVar;
        khVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i20) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        khVar.setAlpha(0.0f);
        khVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.h3 = textView;
        org.telegram.messenger.k5.m(textView, i7, e6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ja.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.k3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.x(imageView, mutate, i7, e6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ja.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        khVar.addView(linearLayout, c8.ja.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.l3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.q6.x(imageView2, mutate2, i7, e6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ja.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.m3 = textView2;
        org.telegram.messenger.k5.m(textView2, i7, e6Var, 1, 16.0f);
        org.telegram.messenger.k5.l(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ja.r(-2, -2, 16));
        khVar.addView(linearLayout2, c8.ja.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, e6Var);
        this.e2 = chatAttachAlertPhotoLayout;
        ciVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.w2 = chatAttachAlertPhotoLayout;
        this.U2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, c8.ja.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.t3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.b.addView(fVar3, c8.ja.g());
        this.b.addView(khVar, c8.ja.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.k0 k0Var = new ai.k0(context, 14);
        this.M2 = k0Var;
        this.b.addView(k0Var, c8.ja.e(-1, -2, 55));
        this.b.addView(o7Var, c8.ja.c(-2.0f, -1));
        this.b.addView(q0Var2, c8.ja.e(48, 48, 53));
        this.b.addView(q0Var, c8.ja.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var6 = this.c3;
        if (q0Var6 != null) {
            jVar2 = jVar3;
            this.b.addView(q0Var6, c8.ja.e(48, 48, 53));
        } else {
            jVar2 = jVar3;
        }
        khVar.addView(q0Var5, c8.ja.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(jVar, c8.ja.e(-2, 48, 53));
        kh khVar2 = new kh(this, context, 1);
        this.v3 = khVar2;
        lh lhVar = new lh(context, 0);
        this.w3 = lhVar;
        lhVar.setClipChildren(true);
        lhVar.setClipToPadding(false);
        hi hiVar = new hi(this, context);
        this.y3 = hiVar;
        lhVar.setAdapter(hiVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.x3 = b0Var;
        lhVar.setLayoutManager(b0Var);
        lhVar.setVerticalScrollBarEnabled(false);
        lhVar.setHorizontalScrollBarEnabled(false);
        lhVar.setItemAnimator(null);
        lhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.q6.l(lhVar, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        lhVar.z2 = true;
        lhVar.setOverScrollMode(2);
        dh.c cVar5 = this.F4;
        ri.q qVar = this.Y0;
        cVar5.j = qVar;
        this.G4.j = qVar;
        cVar4.j = qVar;
        mh mhVar = new mh(this, context, 0);
        this.u3 = mhVar;
        dh.d dVar = new dh.d(cVar4.c(mhVar, null, false));
        this.W1 = dVar;
        if (org.telegram.messenger.gz.f()) {
            org.telegram.messenger.qc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.b.addView(mhVar, c8.ja.g());
        fh.g c10 = this.F4.c(khVar2, c8.g0.f(e6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        khVar2.setBackground(c10);
        lhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        lhVar.setClipToOutline(true);
        int L3 = org.telegram.messenger.g0.L(11.0f);
        float L4 = org.telegram.messenger.g0.L(28.0f);
        bg.p0 p0Var = bg.t0.a;
        lhVar.setOutlineProvider(new bg.r0(L3, L4));
        lhVar.setImportantForAccessibility(1);
        khVar2.addView(lhVar, c8.ja.g());
        this.b.addView(khVar2, c8.ja.e(-1, 70, 81));
        lhVar.setOnItemClickListener(new fi.i4(9, this, e6Var));
        lhVar.setOnItemLongClickListener(new sg(this, 3));
        h6 h6Var = new h6(context, true, false, true);
        this.C3 = h6Var;
        h6Var.setVisibility(8);
        h6Var.setAlpha(0.0f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int L5 = org.telegram.messenger.g0.L(16.0f);
        h6Var.setPadding(L5, 0, L5, 0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        final int i21 = 1;
        h6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i21) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        this.b.addView(h6Var, c8.ja.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, c8.ja.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.D2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i22 = org.telegram.ui.ActionBar.j6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView3, i22, e6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i23 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i23) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        kh khVar3 = new kh(this, context, i23);
        this.B2 = khVar3;
        kg.j jVar5 = new kg.j(this, context);
        this.A2 = jVar5;
        khVar3.addView(jVar5, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        fh.g c11 = this.G4.c(xhVar, c8.g0.n(e6Var), false);
        this.y2 = c11;
        c11.T = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.R.g = 0.4f;
        c11.n();
        fh.g c12 = this.F4.c(jVar5, c8.g0.n(e6Var), false);
        this.z2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        khVar3.setWillNotDraw(false);
        khVar3.setVisibility(4);
        khVar3.setAlpha(0.0f);
        this.b.addView(khVar3, c8.ja.e(-1, -2, 83));
        khVar3.setOnTouchListener(new gi.a(14));
        h6 h6Var2 = new h6(context, false, false, false);
        this.u1 = h6Var2;
        h6Var2.setAllowCancel(true);
        h6Var2.setScaleProperty(0.6f);
        h6Var2.setVisibility(8);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i24 = org.telegram.ui.ActionBar.j6.y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i24, e6Var);
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        jVar5.addView(h6Var2, c8.ja.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w1 = imageView4;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(context);
        this.x1 = t2Var;
        imageView4.setImageDrawable(t2Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.j6.Nl;
        org.telegram.ui.ActionBar.q6.s(imageView4, i25, e6Var, mode);
        int i26 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i26, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i26);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.q6.j(imageView4, h06, null, M5, e6Var);
        jVar5.addView(imageView4, c8.ja.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.na.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final ki kiVar = this.b;
                        nh nhVar = kiVar.C2;
                        if (nhVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var = new d0(kiVar.getContext(), e6Var);
                            d0Var.s1(nhVar.getText());
                            final int i202 = 0;
                            d0Var.f2 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.ah
                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            nh nhVar2 = kiVar.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = kiVar.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = kiVar.U1;
                            boolean z13 = kiVar.F3 != null;
                            bh bhVar = new bh(kiVar, 0);
                            d0Var.h2 = j3;
                            d0Var.i2 = z13;
                            d0Var.j2 = bhVar;
                            d0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ki kiVar2 = this.b;
                        ph phVar = kiVar2.N2;
                        if (phVar != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var2 = new d0(kiVar2.getContext(), e6Var);
                            d0Var2.s1(phVar.getText());
                            final int i212 = 1;
                            d0Var2.f2 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.ah
                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            nh nhVar2 = kiVar2.C2;
                                            nhVar2.setText(charSequence);
                                            nhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = kiVar2.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = kiVar2.U1;
                            boolean z14 = kiVar2.F3 != null;
                            bh bhVar2 = new bh(kiVar2, 1);
                            d0Var2.h2 = j10;
                            d0Var2.i2 = z14;
                            d0Var2.j2 = bhVar2;
                            d0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ki kiVar3 = this.b;
                        kiVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar3.a2;
                        p12.I2(null, e2Var2, e6Var);
                        PhotoViewer.p1().J2(kiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i222 = kiVar3.Q3;
                        boolean z15 = kiVar3.R3;
                        p13.h = i222;
                        p13.n = z15;
                        if (!kiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(e2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(kiVar3.c.findFocus());
                        }
                        File w10 = hi.d7.w(kiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i232 = point.x;
                        int i242 = point.y;
                        if (i232 > 1080 || i242 > 1080) {
                            float min = Math.min(i232, i242) / 1080.0f;
                            i232 = (int) (i232 * min);
                            i242 = (int) (i242 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i232, i242, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new bi(kiVar3, ffVar), e2Var2 instanceof org.telegram.ui.an ? (org.telegram.ui.an) e2Var2 : null);
                        if (kiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, kiVar3.E1);
                            break;
                        }
                        break;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.F1 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).H0();
        nh nhVar = new nh(this, context, xhVar, e6Var);
        this.C2 = nhVar;
        nhVar.K = true;
        nhVar.setHint(org.telegram.messenger.hd.M0(2131754454, "AddCaption"));
        nhVar.s();
        nhVar.getEditText().setLayoutParams(c8.ja.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        nhVar.getEditText().addTextChangedListener(new oh(this, 0));
        jVar5.addView(nhVar, c8.ja.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        khVar3.setClipChildren(false);
        nhVar.setClipChildren(false);
        k0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        k0Var.setWillNotDraw(false);
        ph phVar = new ph(this, context, xhVar, e6Var);
        this.N2 = phVar;
        phVar.K = true;
        phVar.getEditText().addTextChangedListener(new rh(this, e2Var));
        phVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        phVar.getEditText().setLayoutParams(c8.ja.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        phVar.getEditText().setTextSize(1, 17.0f);
        phVar.getEmojiButton().setLayoutParams(c8.ja.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        phVar.setHint(org.telegram.messenger.hd.M0(2131754454, "AddCaption"));
        k0Var.addView(phVar, c8.ja.e(-1, -2, org.telegram.messenger.ns.E1));
        k0Var.setAlpha(0.0f);
        k0Var.setVisibility(8);
        nhVar.addView(imageView3, c8.ja.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.F4.c(k0Var, c8.g0.n(e6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        k0Var.setBackground(c13);
        k0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        h6 h6Var3 = new h6(context, false, false, false);
        this.v1 = h6Var3;
        h6Var3.setScaleProperty(0.6f);
        h6Var3.setVisibility(8);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var3, i24, e6Var);
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        h6Var3.setGravity(17);
        h6Var3.setAllowCancel(true);
        k0Var.addView(h6Var3, c8.ja.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.q6.s(imageView5, org.telegram.ui.ActionBar.j6.Oe, e6Var, mode2);
        phVar.addView(imageView5, c8.ja.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i28 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i28) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.y1 = imageView6;
        org.telegram.ui.ActionBar.t2 t2Var2 = new org.telegram.ui.ActionBar.t2(context);
        this.z1 = t2Var2;
        imageView6.setImageDrawable(t2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView6, i25, e6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i26, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M6 = org.telegram.ui.ActionBar.q6.M(i26);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.q6.j(imageView6, h07, null, M6, e6Var);
        k0Var.addView(imageView6, c8.ja.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.na.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final ki kiVar = this.b;
                        nh nhVar2 = kiVar.C2;
                        if (nhVar2 != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var = new d0(kiVar.getContext(), e6Var);
                            d0Var.s1(nhVar2.getText());
                            final int i202 = 0;
                            d0Var.f2 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.ah
                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            nh nhVar22 = kiVar.C2;
                                            nhVar22.setText(charSequence);
                                            nhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = kiVar.N2;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = kiVar.U1;
                            boolean z13 = kiVar.F3 != null;
                            bh bhVar = new bh(kiVar, 0);
                            d0Var.h2 = j3;
                            d0Var.i2 = z13;
                            d0Var.j2 = bhVar;
                            d0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ki kiVar2 = this.b;
                        ph phVar2 = kiVar2.N2;
                        if (phVar2 != null) {
                            org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                            d0 d0Var2 = new d0(kiVar2.getContext(), e6Var);
                            d0Var2.s1(phVar2.getText());
                            final int i212 = 1;
                            d0Var2.f2 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.ah
                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            nh nhVar22 = kiVar2.C2;
                                            nhVar22.setText(charSequence);
                                            nhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar22 = kiVar2.N2;
                                            phVar22.setText(charSequence);
                                            phVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = kiVar2.U1;
                            boolean z14 = kiVar2.F3 != null;
                            bh bhVar2 = new bh(kiVar2, 1);
                            d0Var2.h2 = j10;
                            d0Var2.i2 = z14;
                            d0Var2.j2 = bhVar2;
                            d0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ki kiVar3 = this.b;
                        kiVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar3.a2;
                        p12.I2(null, e2Var2, e6Var);
                        PhotoViewer.p1().J2(kiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i222 = kiVar3.Q3;
                        boolean z15 = kiVar3.R3;
                        p13.h = i222;
                        p13.n = z15;
                        if (!kiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(e2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(kiVar3.c.findFocus());
                        }
                        File w10 = hi.d7.w(kiVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i232 = point.x;
                        int i242 = point.y;
                        if (i232 > 1080 || i242 > 1080) {
                            float min = Math.min(i232, i242) / 1080.0f;
                            i232 = (int) (i232 * min);
                            i242 = (int) (i242 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i232, i242, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new bi(kiVar3, ffVar), e2Var2 instanceof org.telegram.ui.an ? (org.telegram.ui.an) e2Var2 : null);
                        if (kiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, kiVar3.E1);
                            break;
                        }
                        break;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        kh khVar4 = new kh(this, context, 3);
        this.F2 = khVar4;
        khVar4.setFocusable(true);
        khVar4.setFocusableInTouchMode(true);
        khVar4.setVisibility(4);
        khVar4.setScaleX(0.2f);
        khVar4.setScaleY(0.2f);
        khVar4.setAlpha(0.0f);
        khVar4.setClipChildren(false);
        khVar4.setClipToPadding(false);
        this.b.addView(khVar4, c8.ja.e(org.telegram.messenger.ns.v1, 50, 85));
        sh shVar = new sh(context, e6Var, this);
        this.G2 = shVar;
        shVar.setImportantForAccessibility(2);
        khVar4.addView(shVar, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        shVar.setTranslationX(this.u0);
        int L6 = org.telegram.messenger.g0.L(52.0f);
        int L7 = org.telegram.messenger.g0.L(38.0f);
        shVar.L = L6;
        shVar.M = L7;
        float L8 = org.telegram.messenger.g0.L(7.0f);
        float L9 = org.telegram.messenger.g0.L(6.0f);
        shVar.P = L8;
        shVar.Q = L9;
        shVar.q0 = true;
        final int i30 = 4;
        shVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.y3 y3Var;
                switch (i30) {
                    case 0:
                        ki kiVar = this.b;
                        kiVar.O1(kiVar.w2 != kiVar.l2);
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        long j3 = kiVar2.U2;
                        if (j3 < 0 && (y3Var = (ki.y3) kiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = y3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z13 = kiVar3.X1;
                        if (!z13) {
                            kiVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ki kiVar4 = this.b;
                        boolean z14 = kiVar4.X1;
                        if (z14) {
                            kiVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        ki kiVar5 = this.b;
                        if (kiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z15 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.F.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == ffVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.gz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            kiVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = kiVar5.a3;
                            hi.l3 l3Var = kiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(kiVar5.getContext(), 1);
                            kiVar5.b3 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(!V ? 2131748832 : 2131748833, null)));
                            kiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            kiVar5.b3.p(1.0f, -((kiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            kiVar5.b3.setTranslationY(kiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = kiVar5.b3;
                            l3Var3.r0 = new od(5, kiVar5, l3Var2);
                            kiVar5.b.addView(l3Var3, c8.ja.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            kiVar5.b3.w();
                            break;
                        }
                        break;
                    case 7:
                        ci ciVar = this.b.w2;
                        if (ciVar != null) {
                            ciVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        shVar.setOnLongClickListener(new org.telegram.ui.mf(this, context, e6Var, e2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        mh mhVar2 = new mh(this, context, 1);
        mhVar2.setAlpha(0.0f);
        mhVar2.setScaleX(0.2f);
        mhVar2.setScaleY(0.2f);
        if (z10) {
            P0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.F4, c8.g0.n(e6Var));
        fc0 fc0Var = new fc0(context);
        this.N1 = fc0Var;
        this.b.addView(fc0Var, c8.ja.c(-1.0f, -1));
        gh.e eVar = new gh.e(e6Var);
        eVar.e = new sg(this, 5);
        eVar.c = new sg(this, 6);
        eVar.d = new sg(this, 7);
        eVar.b = new sg(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.n = N;
        eVar.r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f = N3;
        eVar.h = N4;
        o7Var.P(this.F4, eVar, false);
        jVar2.f(1L, false);
        this.Y0.i(this.b);
        ri.q qVar2 = this.Y0;
        qVar2.a = new sg(this, 9);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
