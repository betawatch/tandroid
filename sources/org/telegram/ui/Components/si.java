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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class si extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.r2, te.b {
    public static final /* synthetic */ int I4 = 0;
    public boolean A1;
    public final kg.j A2;
    public final RadialProgressView A3;
    public boolean A4;
    public boolean B1;
    public final sh B2;
    public boolean B3;
    public boolean B4;
    public boolean C1;
    public final vh C2;
    public final n6 C3;
    public hi.i C4;
    public int D1;
    public final ImageView D2;
    public float D3;
    public final dh.g D4;
    public org.telegram.messenger.q10 E1;
    public final int[] E2;
    public int E3;
    public final ui.c E4;
    public int F1;
    public final sh F2;
    public org.telegram.messenger.fj F3;
    public final dh.c F4;
    public int G1;
    public final ai G2;
    public boolean G3;
    public final dh.c G4;
    public boolean H1;
    public final TextPaint H2;
    public final int H3;
    public final ih H4;
    public boolean I1;
    public final RectF I2;
    public boolean I3;
    public boolean J1;
    public final Paint J2;
    public boolean J3;
    public boolean K1;
    public AnimatorSet K2;
    public boolean K3;
    public s30 L1;
    public long L2;
    public boolean L3;
    public boolean M1;
    public final ai.k0 M2;
    public boolean M3;
    public final pc0 N1;
    public final xh N2;
    public boolean N3;
    public sn O1;
    public int O2;
    public boolean O3;
    public u30 P1;
    public dt P2;
    public boolean P3;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public ak S1;
    public boolean S2;
    public boolean S3;
    public zi T1;
    public final float T2;
    public float T3;
    public long U1;
    public long U2;
    public float U3;
    public boolean V1;
    public final v7 V2;
    public ValueAnimator V3;
    public final dh.d W1;
    public AnimatorSet W2;
    public int W3;
    public boolean X1;
    public AnimatorSet X2;
    public qi X3;
    public float Y1;
    public final org.telegram.ui.ActionBar.r0 Y2;
    public dn Y3;
    public final di Z1;
    public final hi.v Z2;
    public final int[] Z3;
    public final org.telegram.ui.ActionBar.h2 a2;
    public final org.telegram.ui.ActionBar.r0 a3;
    public int a4;
    public final boolean b2;
    public hi.m3 b3;
    public float b4;
    public df c2;
    public final org.telegram.ui.ActionBar.r0 c3;
    public float c4;
    public boolean d2;
    public final gi.j d3;
    public boolean d4;
    public final ChatAttachAlertPhotoLayout e2;
    public float e3;
    public float e4;
    public tj f2;
    public float f3;
    public final boolean f4;
    public cj g2;
    public final sh g3;
    public boolean g4;
    public rn h2;
    public final TextView h3;
    public final ArrayList h4;
    public rn i2;
    public final org.telegram.ui.ActionBar.r0 i3;
    public final Rect i4;
    public kl j2;
    public final LinearLayout j3;
    public float j4;
    public kk k2;
    public final ImageView k3;
    public boolean k4;
    public pm l2;
    public final LinearLayout l3;
    public int l4;
    public final te.a m1;
    public fj m2;
    public final TextView m3;
    public final di m4;
    public final te.a n1;
    public kg.g0 n2;
    public float n3;
    public r1.g n4;
    public final te.a o1;
    public lk o2;
    public boolean o3;
    public AnimatorSet o4;
    public final te.a p1;
    public lk p2;
    public final fi p3;
    public int p4;
    public final te.a q1;
    public oi.o q2;
    public boolean q3;
    public int q4;
    public final te.a r1;
    public xk r2;
    public Object r3;
    public boolean r4;
    public final te.j s1;
    public boolean s2;
    public boolean s3;
    public boolean s4;
    public org.telegram.ui.zm t1;
    public float t2;
    public final lh.f t3;
    public boolean t4;
    public final n6 u1;
    public final ki[] u2;
    public final uh u3;
    public jl u4;
    public final n6 v1;
    public final LongSparseArray v2;
    public final sh v3;
    public boolean v4;
    public final ImageView w1;
    public ki w2;
    public final th w3;
    public boolean w4;
    public final org.telegram.ui.ActionBar.w2 x1;
    public ki x2;
    public final v4.c0 x3;
    public File x4;
    public final ImageView y1;
    public final fh.g y2;
    public final pi y3;
    public double[] y4;
    public final org.telegram.ui.ActionBar.w2 z1;
    public final fh.g z2;
    public boolean z3;
    public boolean z4;

    public si(Activity activity, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11) {
        this(activity, h2Var, z10, z11, true, null);
    }

    public static void J0(si siVar) {
        v7 v7Var = siVar.V2;
        lh.f fVar = siVar.t3;
        if (fVar == null || v7Var == null) {
            return;
        }
        ki kiVar = siVar.x2;
        if (kiVar == null) {
            kiVar = siVar.w2;
        }
        int i7 = 0;
        boolean z10 = kiVar != null && kiVar.f();
        org.telegram.ui.ActionBar.i6 i6Var = siVar.J0;
        boolean d = i6Var != null ? i6Var.d() : org.telegram.ui.ActionBar.n6.I.q();
        if (!z10 && v7Var.getVisibility() == 0) {
            i7 = (int) (v7Var.getAlpha() * (d ? org.telegram.messenger.ks.e4 : org.telegram.messenger.ks.q2));
        }
        fVar.setFadeTopAlpha(i7);
    }

    public static void L0(si siVar) {
        hi.i iVar = new hi.i(siVar, siVar.getContext(), siVar.U1, LaunchActivity.Q(), siVar.J0, 1);
        siVar.C4 = iVar;
        iVar.p(new of(siVar, 1));
        ViewGroup viewGroup = siVar.b;
        viewGroup.addView(siVar.C4, viewGroup.indexOfChild(siVar.B2), c8.ma.e(-1, -1, 83));
        hi.i iVar2 = siVar.C4;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            iVar2.getAdapter().n0 = false;
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            jg.h1 adapter = iVar2.getAdapter();
            bnVar.j();
            TLRPC.Chat chat = bnVar.e;
            adapter.getClass();
            adapter.m0 = chat;
            iVar2.getAdapter().W(bnVar.r8);
            iVar2.getAdapter().f0 = bnVar.e != null;
        } else {
            iVar2.getAdapter().n0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f0 = false;
        }
        iVar2.getAdapter().g0 = false;
        siVar.K1();
    }

    public static int M0(si siVar) {
        ki kiVar = siVar.w2;
        rn rnVar = siVar.h2;
        if (kiVar == rnVar && rnVar.F != null) {
            return rnVar.getEmojiPadding();
        }
        rn rnVar2 = siVar.i2;
        return (kiVar != rnVar2 || rnVar2.F == null) ? siVar.X1 ? siVar.N2.getEmojiPadding() : siVar.C2.getEmojiPadding() : rnVar2.getEmojiPadding();
    }

    public static boolean h1(TLRPC.User user) {
        return (user == null || org.telegram.messenger.o10.C(user) || org.telegram.messenger.o10.u(user) || org.telegram.messenger.o10.y(user) || org.telegram.messenger.o10.B(user.id) || org.telegram.messenger.o10.A(user) || org.telegram.messenger.o10.t(user) || user.id == 489000 || org.telegram.messenger.mp.L2(user)) ? false : true;
    }

    public static void t1(ki kiVar) {
        if (kiVar == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.u6.b;
        Object tag = kiVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
            return;
        }
        kiVar.setTag(R.id.theme_generation, Integer.valueOf(i7));
        try {
            org.telegram.ui.ActionBar.u6.c0(kiVar, true);
            kiVar.d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A1(float f10) {
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0), Math.min(org.telegram.messenger.ks.e4, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o4;
        org.telegram.messenger.g0.s3(this, o4, false, null);
        org.telegram.messenger.g0.m3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        this.c.invalidate();
    }

    public final void B1(String str) {
        this.O2 = 1;
        this.A1 = true;
        this.Q2 = false;
        this.K3 = false;
        this.v3.setVisibility(8);
        this.h3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout != null) {
            si siVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.h1 = (siVar.O2 == 0 || siVar.A1) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.h2 h2Var = this.a2;
            if ((h2Var instanceof org.telegram.ui.bn) && !((org.telegram.ui.bn) h2Var).z()) {
                z11 = true;
                if (this.z4 != z11) {
                    return;
                }
                if (z11) {
                    org.telegram.messenger.mp.u1(this.H3).T1().b();
                }
                this.z4 = z11;
                ImageView imageView = this.w1;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y1;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                lr lrVar = lr.h;
                scaleY.setInterpolator(lrVar).setDuration(420L).withEndAction(new nh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(lrVar).setDuration(420L).withEndAction(new nh(this, z11, 2)).start();
                if (z11) {
                    org.telegram.ui.ActionBar.w2 w2Var = this.x1;
                    Objects.requireNonNull(w2Var);
                    imageView.postDelayed(new s0(w2Var, 1), 220L);
                    org.telegram.ui.ActionBar.w2 w2Var2 = this.z1;
                    Objects.requireNonNull(w2Var2);
                    imageView2.postDelayed(new s0(w2Var2, 1), 220L);
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
    public final void D1(long j3, String str, boolean z10, boolean z11) {
        boolean z12;
        long j10;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.v2;
        int i7 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((ki.t3) longSparseArray.get(j3)).getStartCommand())) {
            ki.t3 t3Var = (ki.t3) longSparseArray.get(j3);
            if (t3Var.I) {
                t3Var.I = false;
            }
            z12 = true;
            if (longSparseArray.get(j3) != null) {
                ((ki.t3) longSparseArray.get(j3)).K.setSwipeOffsetAnimationDisallowed(z12);
                H1((ki) longSparseArray.get(j3), -j3, z11);
                if (z10) {
                    ki.t3 t3Var2 = (ki.t3) longSparseArray.get(j3);
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(t3Var2.G).c2(Long.valueOf(t3Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ri.d0(t3Var2.G).b.bots;
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
                        if (tL_attachMenuBot.bot_id == t3Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    org.telegram.messenger.g0.h3(new kg.h0(13, t3Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.gd.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753136, c22.first_name) : z13 ? org.telegram.messenger.gd.a0("BotAttachMenuShortcatAddedSide", null, 2131753135, c22.first_name) : org.telegram.messenger.gd.a0("BotAttachMenuShortcatAddedAttach", null, 2131753137, c22.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.i6 i6Var = this.J0;
            ki.t3 t3Var3 = new ki.t3(context, i6Var, this);
            t3Var3.V = new ki.k3(t3Var3, 2);
            org.telegram.ui.ActionBar.r0 a10 = t3Var3.b.V2.t().a(0, R.drawable.ic_ab_other);
            t3Var3.L = a10;
            a10.e(R.id.menu_open_bot, R.drawable.msg_bot, org.telegram.messenger.gd.M0(2131752901, null));
            org.telegram.ui.ActionBar.z0 e10 = a10.e(R.id.menu_settings, R.drawable.msg_settings, org.telegram.messenger.gd.M0(2131752886, null));
            t3Var3.M = e10;
            e10.setVisibility(8);
            a10.e(R.id.menu_reload_page, R.drawable.msg_retry, org.telegram.messenger.gd.M0(2131752900, null));
            org.telegram.ui.ActionBar.z0 e11 = a10.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, org.telegram.messenger.gd.M0(2131754388, null));
            t3Var3.N = e11;
            e11.setVisibility(8);
            a10.e(R.id.menu_tos_bot, R.drawable.menu_intro, org.telegram.messenger.gd.M0(2131752883, null));
            a10.e(R.id.menu_report_bot, R.drawable.msg_report, org.telegram.messenger.gd.M0(2131752899, null));
            a10.e(R.id.menu_delete_bot, R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131752904, null));
            ki.l2 l2Var = new ki.l2(t3Var3, context, i6Var, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, t3Var3.a), 1);
            t3Var3.n = l2Var;
            ki.k2 k2Var = new ki.k2(i7, context, t3Var3);
            t3Var3.K = k2Var;
            k2Var.addView(l2Var, c8.ma.c(-1.0f, -1));
            k2Var.setScrollListener(new ki.k3(t3Var3, 3));
            k2Var.setScrollEndListener(new ki.k3(t3Var3, 4));
            k2Var.setDelegate(new ki.m3(t3Var3));
            k2Var.setIsKeyboardVisible(new ki.m3(t3Var3));
            t3Var3.addView(k2Var, c8.ma.c(-1.0f, -1));
            ki.o3 o3Var = new ki.o3(context, i6Var);
            t3Var3.J = o3Var;
            t3Var3.addView(o3Var, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            int i11 = 5;
            l2Var.setWebViewProgressListener(new bi.p8(t3Var3, i11));
            org.telegram.messenger.ks.e().c(t3Var3, org.telegram.messenger.ks.p4);
            longSparseArray.put(j3, t3Var3);
            ((ki.t3) longSparseArray.get(j3)).setDelegate(new yh(this, t3Var3, str, j3));
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            org.telegram.messenger.fj replyingMessageObject = bnVar.a0.getReplyingMessageObject();
            ki.t3 t3Var4 = (ki.t3) longSparseArray.get(j3);
            long a11 = bnVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long j92 = bnVar.j9();
            ki.l2 l2Var2 = t3Var4.n;
            int i13 = this.H3;
            t3Var4.G = i13;
            t3Var4.x = a11;
            t3Var4.w = j3;
            t3Var4.E = i12;
            t3Var4.F = j92;
            t3Var4.H = str;
            org.telegram.ui.ActionBar.z0 z0Var = t3Var4.N;
            if (z0Var != null) {
                org.telegram.messenger.ri.d0(i13);
                z12 = true;
                z0Var.setVisibility(0);
            } else {
                z12 = true;
            }
            l2Var2.setBotUser(org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(j3)));
            l2Var2.s(i13, j3);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = org.telegram.messenger.mp.u1(i13).l1(a11);
            tL_messages_requestWebView.bot = org.telegram.messenger.mp.u1(i13).q1(j3);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a11 < 0) {
                j10 = 0;
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i13).P0(-a11);
                if (P0 != null && (peer = P0.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = org.telegram.messenger.mp.u1(i13).o1(peer);
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
                org.telegram.messenger.zy.C(i13);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i12;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (j92 != j10) {
                    tL_inputReplyToMessage.monoforum_peer_id = org.telegram.messenger.mp.u1(i13).l1(j92);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (j92 != j10) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = org.telegram.messenger.mp.u1(i13).l1(j92);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u10 = ki.t2.u(t3Var4.a, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new di.w1(t3Var4, i13, i11));
            org.telegram.messenger.ks.f(i13).c(t3Var4, org.telegram.messenger.ks.z1);
            if (longSparseArray.get(j3) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void E1(org.telegram.ui.ActionBar.h2 h2Var) {
        if ((h2Var instanceof org.telegram.ui.bn) && org.telegram.messenger.v3.V(((org.telegram.ui.bn) h2Var).e)) {
            new lc(this.p3, this.J0).f(org.telegram.messenger.mp.u1(this.H3).X4, new mg(2, this, h2Var)).j();
        }
    }

    public final boolean F1(boolean z10, boolean z11) {
        float f10;
        int i7;
        ki kiVar;
        v7 v7Var;
        this.n1.a(z10, true);
        sh shVar = this.B2;
        if (z10 == (shVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.K2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        shVar.setTag(z10 ? 1 : null);
        vh vhVar = this.C2;
        if (vhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(vhVar.getEditText());
        }
        vhVar.k(true);
        this.N2.k(true);
        sh shVar2 = this.v3;
        sh shVar3 = this.F2;
        if (z10) {
            if (!this.I1) {
                shVar.setVisibility(0);
            }
            shVar3.setVisibility(0);
        } else if (this.Q2) {
            shVar2.setVisibility(0);
        }
        ki kiVar2 = this.w2;
        boolean z12 = (kiVar2 == this.e2 || kiVar2 == this.l2) && this.X1;
        v7 v7Var2 = this.V2;
        ai.k0 k0Var = this.M2;
        kg.j jVar = this.A2;
        ai aiVar = this.G2;
        if (z11) {
            this.K2 = new AnimatorSet();
            if (z12) {
                k0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(shVar, (Property<sh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                v7Var = v7Var2;
            } else {
                jVar.setVisibility(0);
                v7Var = v7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<ai.k0, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(shVar3, (Property<sh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(shVar3, (Property<sh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(shVar3, (Property<sh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) property3, z10 ? 1.0f : 0.2f));
            if (v7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(shVar, (Property<sh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
            } else if (this.Q2) {
                arrayList.add(ObjectAnimator.ofFloat(shVar2, (Property<sh, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.g0.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(shVar2, (Property<sh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ch(this, 5));
                arrayList.add(ofFloat);
            }
            this.K2.playTogether(arrayList);
            this.K2.setInterpolator(new DecelerateInterpolator());
            this.K2.setDuration(180L);
            this.K2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.K2.start();
            i7 = 0;
        } else {
            shVar.setAlpha(z10 ? 1.0f : 0.0f);
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
            shVar3.setScaleX(z10 ? 1.0f : 0.2f);
            shVar3.setScaleY(z10 ? 1.0f : 0.2f);
            shVar3.setAlpha(z10 ? 1.0f : f10);
            k0Var.setVisibility((z10 && z12) ? i7 : 8);
            k0Var.setAlpha((z10 && z12) ? 1.0f : f10);
            aiVar.setScaleX(z10 ? 1.0f : 0.2f);
            aiVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (v7Var2.getTag() != null) {
                shVar.setTranslationY(z10 ? f10 : org.telegram.messenger.g0.L(48.0f));
            } else if (this.Q2 && ((kiVar = this.w2) == null || kiVar.N())) {
                shVar2.setTranslationY(z10 ? org.telegram.messenger.g0.L(84.0f) : f10);
            }
            if (!z10) {
                shVar.setVisibility(4);
                shVar3.setVisibility(4);
            }
            if (z12) {
                R1();
            }
        }
        if (z10) {
            i7 = Math.max(1, this.w2.getSelectedItemsCount());
        }
        aiVar.e(i7, z11);
        aiVar.i(Y0() + this.w2.getSelectedItemsCount(), this.F3 != null ? 0L : org.telegram.messenger.mp.u1(this.H3).P1(c1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), aiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            vhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    public final void G1(ki kiVar) {
        long j3 = this.U2;
        sn snVar = this.O1;
        if (kiVar == snVar) {
            j3 = snVar.s;
        } else if (kiVar == this.e2) {
            j3 = 1;
        } else if (kiVar == this.g2) {
            j3 = 3;
        } else if (kiVar == this.k2) {
            j3 = 4;
        } else if (kiVar == this.f2) {
            j3 = 5;
        } else if (kiVar == this.j2) {
            j3 = 6;
        } else if (kiVar == this.h2) {
            j3 = 9;
        } else if (kiVar == this.m2) {
            j3 = 10;
        } else if (kiVar == this.n2) {
            j3 = 11;
        } else if (kiVar == this.i2) {
            j3 = 12;
        } else if (kiVar == this.o2) {
            j3 = 14;
        } else if (kiVar == this.p2) {
            j3 = 13;
        } else if (kiVar == this.q2) {
            j3 = 16;
        } else if (kiVar == this.r2) {
            j3 = 17;
        }
        H1(kiVar, j3, true);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ki kiVar;
        if (i7 == 0) {
            V0();
            S0();
            return;
        }
        if (i7 == 2) {
            S0();
            rn rnVar = this.h2;
            if (rnVar != null && ((kiVar = this.x2) == rnVar || this.w2 == rnVar)) {
                Q1(kiVar == rnVar ? 1 : 0);
            }
            rn rnVar2 = this.i2;
            if (rnVar2 != null) {
                ki kiVar2 = this.x2;
                if (kiVar2 == rnVar2 || this.w2 == rnVar2) {
                    Q1(kiVar2 != rnVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 1) {
            S0();
            return;
        }
        if (i7 == 3) {
            U0();
            return;
        }
        if (i7 == 4) {
            U0();
            return;
        }
        if (i7 == 5) {
            U0();
            ai aiVar = this.G2;
            if (aiVar != null) {
                aiVar.setEphemeralFactor(f10);
                aiVar.setSameWidthFactor(f10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean H0() {
        ki kiVar = this.w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        return kiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1;
    }

    public final void H1(ki kiVar, long j3, boolean z10) {
        em emVar;
        em emVar2;
        int i7;
        Float f10;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.r3 == null && this.K2 == null) {
            ki kiVar2 = this.w2;
            if (kiVar2 == kiVar) {
                kiVar2.K();
                return;
            }
            if (kiVar == this.i2 && !org.telegram.messenger.j10.i(this.H3).q()) {
                new ug.z0(this.a2, 39, false).show();
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
            sh shVar = this.v3;
            shVar.setAlpha(1.0f);
            shVar.setTranslationY(this.D3);
            int i12 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.v2;
                if (i12 >= longSparseArray.size()) {
                    break;
                }
                ((ki.t3) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                i12++;
            }
            this.U2 = j3;
            th thVar = this.w3;
            int childCount = thVar.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = thVar.getChildAt(i13);
                if (childAt instanceof mi) {
                    mi miVar = (mi) childAt;
                    i10 = childCount;
                    f10 = valueOf;
                    miVar.a.f(((long) miVar.b) == miVar.c.U2, true);
                } else {
                    f10 = valueOf;
                    i10 = childCount;
                    if (childAt instanceof li) {
                        ((li) childAt).a(true);
                    }
                }
                i13++;
                childCount = i10;
                valueOf = f10;
            }
            Float f11 = valueOf;
            int firstOffset = (this.w2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Z3[0];
            this.x2 = kiVar;
            T0(kiVar);
            int i14 = this.x2.j() != 0 ? 0 : 4;
            v7 v7Var = this.V2;
            v7Var.setVisibility(i14);
            if (v7Var.o0) {
                v7Var.o(true);
            }
            this.w2.u();
            ki kiVar3 = this.x2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
            if (kiVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.x2.I(this.w2);
            this.x2.setVisibility(0);
            if (kiVar.getParent() != null) {
                this.b.removeView(this.x2);
            }
            int indexOfChild = this.b.indexOfChild(this.w2);
            if (this.x2.getParent() != this.b) {
                t1(this.x2);
                ViewGroup viewGroup = this.b;
                ki kiVar4 = this.x2;
                if (kiVar4 != this.j2) {
                    indexOfChild++;
                }
                viewGroup.addView(kiVar4, indexOfChild, c8.ma.c(-1.0f, -1));
            }
            int i15 = 5;
            eh ehVar = new eh(this, i15);
            ki kiVar5 = this.w2;
            boolean z11 = kiVar5 instanceof pm;
            di diVar = this.Z1;
            if (z11 || (this.x2 instanceof pm)) {
                int max = Math.max(this.x2.getWidth(), this.w2.getWidth());
                ki kiVar6 = this.x2;
                if (kiVar6 instanceof pm) {
                    kiVar6.setTranslationX(max);
                    ki kiVar7 = this.w2;
                    if ((kiVar7 instanceof ChatAttachAlertPhotoLayout) && (emVar2 = ((ChatAttachAlertPhotoLayout) kiVar7).Q) != null) {
                        emVar2.setVisibility(4);
                    }
                } else {
                    this.w2.setTranslationX(-max);
                    ki kiVar8 = this.x2;
                    if (kiVar8 == chatAttachAlertPhotoLayout && (emVar = ((ChatAttachAlertPhotoLayout) kiVar8).Q) != null) {
                        emVar.setVisibility(0);
                    }
                }
                this.x2.setAlpha(1.0f);
                this.w2.setAlpha(1.0f);
                if (z10) {
                    ki kiVar9 = this.w2;
                    diVar.getClass();
                    diVar.a(kiVar9, f11);
                    org.telegram.messenger.g0.g3(new k7(this, kiVar, ehVar, i15));
                } else {
                    boolean z12 = this.x2.getCurrentItemTop() <= kiVar.getButtonsHideOffset();
                    this.w2.v(1.0f);
                    this.x2.v(1.0f);
                    this.w2.m(this.j4);
                    this.x2.m(this.j4);
                    this.b.invalidate();
                    this.Y0.g();
                    ki kiVar10 = this.w2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    diVar.getClass();
                    diVar.a(kiVar10, valueOf2);
                    v7Var.setTag(z12 ? 1 : null);
                    ehVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.x2.setAlpha(0.0f);
                this.x2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.w2, (Property<ki, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.w2, diVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(v7Var, (Property<v7, Float>) View.ALPHA, v7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(lr.f);
                animatorSet.addListener(new di.a4(this, firstOffset, ehVar, i11));
                this.r3 = animatorSet;
                ki kiVar11 = this.w2;
                diVar.getClass();
                diVar.a(kiVar11, f11);
                animatorSet.start();
            } else {
                kiVar5.setAlpha(0.0f);
                ehVar.run();
                Q1(0);
                this.b.invalidate();
            }
            if (!this.k4 || (kiVar instanceof ki.t3)) {
                i7 = 0;
            } else {
                i7 = 0;
                this.k4 = false;
                v7Var.updateColors();
                v7Var.invalidate();
                j1();
            }
            v7Var.setForcedMenuWidth((j3 == 1 || j3 == 6 || j3 == 17 || (kiVar instanceof ki.t3)) ? org.telegram.messenger.g0.L(46.0f) : j3 == 4 ? org.telegram.messenger.g0.L(84.0f) : i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean I() {
        return this.w2.b();
    }

    public final void I1(boolean z10, Boolean bool) {
        si siVar;
        if (this.h2 == null) {
            siVar = this;
            rn rnVar = new rn(siVar, getContext(), false, this.J0, bool);
            siVar.h2 = rnVar;
            siVar.u2[1] = rnVar;
            rnVar.setDelegate(new bh(this, 17));
        } else {
            siVar = this;
        }
        H1(siVar.h2, 9L, z10);
    }

    public final void J1(boolean z10, boolean z11) {
        ki kiVar;
        this.o1.a(z10, z11);
        v7 v7Var = this.V2;
        if (!(z10 && v7Var.getTag() == null) && (z10 || v7Var.getTag() == null)) {
            return;
        }
        v7Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.W2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.W2 = null;
        }
        boolean z12 = (this.A1 || this.R2 || (this.O2 == 0 && this.o3) || this.w2 != this.e2 || (!this.J3 && !this.K3)) ? false : true;
        if (this.w2 == this.O1) {
            z12 = false;
        }
        sh shVar = this.v3;
        org.telegram.ui.ActionBar.r0 r0Var = this.Y2;
        if (z10) {
            if (z12) {
                r0Var.setVisibility(0);
                r0Var.setClickable(true);
            }
        } else if (this.Q2 && this.B2.getTag() == null) {
            shVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var != null) {
            if (z10) {
                org.telegram.messenger.g0.p3(this, i0.a.h(org.telegram.ui.ActionBar.n6.w0(this.f4 ? org.telegram.ui.ActionBar.n6.kh : org.telegram.ui.ActionBar.n6.h5, this.J0)) > 0.699999988079071d);
            } else {
                org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
            }
        }
        int i7 = 4;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.W2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - v7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v7Var, (Property<v7, Float>) property, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ch(this, i7));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.W2.playTogether(arrayList);
            this.W2.addListener(new org.telegram.ui.on(3, this, z10));
            this.W2.setInterpolator(lr.h);
            this.W2.setDuration(380L);
            this.W2.start();
            return;
        }
        if (z10 && this.Q2 && ((kiVar = this.w2) == null || kiVar.N())) {
            shVar.setVisibility(4);
        }
        v7Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            r0Var.setAlpha(z10 ? 1.0f : 0.0f);
            r0Var.setScaleX(z10 ? 1.0f : 0.6f);
            r0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.c3;
        if (r0Var2 != null) {
            r0Var2.setVisibility(4);
        }
        if (this.O2 == 0 && this.o3) {
            return;
        }
        r0Var.setVisibility(4);
    }

    @Override // org.telegram.ui.ActionBar.x2
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

    public final void K1() {
        float alpha;
        int[] iArr = this.E2;
        vh vhVar = this.C2;
        vhVar.getLocationOnScreen(iArr);
        if (this.C4 != null) {
            ki kiVar = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
            if ((kiVar == chatAttachAlertPhotoLayout || kiVar == this.l2) && this.X1) {
                ai.k0 k0Var = this.M2;
                alpha = (k0Var.getAlpha() * k0Var.getMeasuredHeight()) + (k0Var.getY() - this.C4.getTop());
            } else {
                alpha = -vhVar.getHeight();
            }
            if (Math.abs(this.C4.getTranslationY() - alpha) > 0.5f) {
                this.C4.setTranslationY(alpha);
                this.C4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                }
            }
        }
        V0();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public void L() {
        qi qiVar = this.X3;
        if (qiVar != null) {
            qiVar.f0(new eh(this, 4));
        } else {
            u1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(int i7) {
        org.telegram.ui.ActionBar.h2 h2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.r3 != null) {
            return;
        }
        int selectedItemsCount = this.w2.getSelectedItemsCount();
        ai aiVar = this.G2;
        if (selectedItemsCount == 0) {
            aiVar.e(0, i7 != 0);
            F1(false, i7 != 0);
        } else {
            if (F1(true, i7 != 0) || i7 == 0) {
                aiVar.e(selectedItemsCount, i7 != 0);
                aiVar.a();
            } else {
                aiVar.e(selectedItemsCount, true);
                aiVar.a();
            }
        }
        this.w2.E(selectedItemsCount);
        R0(i7 != 0);
        if (this.w2 == this.e2 && ((((z10 = (h2Var = this.a2) instanceof org.telegram.ui.bn)) || this.O2 != 0 || this.R2) && ((selectedItemsCount == 0 && this.o3) || ((selectedItemsCount != 0 || this.O2 != 0 || this.R2) && !this.o3)))) {
            this.o3 = (selectedItemsCount == 0 && this.O2 == 0 && !this.R2) ? false : true;
            AnimatorSet animatorSet = this.X2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.X2 = null;
            }
            int i10 = this.O2;
            v7 v7Var = this.V2;
            org.telegram.ui.ActionBar.r0 r0Var = this.c3;
            if (i10 != 0 && r0Var != null && v7Var.getTag() != null && z10) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
                if (!org.telegram.messenger.v3.T(bnVar.e) || (tL_chatBannedRights = bnVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.o3;
                    sh shVar = this.g3;
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.Y2;
                    if (!z12) {
                        if (this.O2 == 0 && !this.R2) {
                            r0Var2.setVisibility(0);
                            r0Var2.setClickable(true);
                        }
                        shVar.setVisibility(0);
                    } else if (v7Var.getTag() != null && r0Var != null) {
                        r0Var.setVisibility(0);
                    }
                    if (i7 != 0) {
                        if (v7Var.getTag() == null && this.O2 == 0 && !this.R2) {
                            r0Var2.setAlpha(this.o3 ? 1.0f : 0.0f);
                            r0Var2.setScaleX(this.o3 ? 1.0f : 0.6f);
                            r0Var2.setScaleY(this.o3 ? 1.0f : 0.6f);
                        }
                        shVar.setAlpha(this.o3 ? 1.0f : 0.0f);
                        if (z11) {
                            r0Var.setAlpha(this.o3 ? 0.0f : 1.0f);
                        }
                        if (this.o3 && r0Var != null) {
                            r0Var.setVisibility(4);
                        }
                    } else {
                        this.X2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (v7Var.getTag() == null && this.O2 == 0 && !this.R2) {
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.ALPHA, this.o3 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_X, this.o3 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_Y, this.o3 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(shVar, (Property<sh, Float>) property, this.o3 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property, this.o3 ? 0.0f : 1.0f));
                        }
                        this.X2.playTogether(arrayList);
                        this.X2.addListener(new x(this, 11));
                        this.X2.setDuration(180L);
                        this.X2.start();
                    }
                }
            }
            z11 = false;
            z12 = this.o3;
            sh shVar2 = this.g3;
            org.telegram.ui.ActionBar.r0 r0Var22 = this.Y2;
            if (!z12) {
            }
            if (i7 != 0) {
            }
        }
        O1(i7 != 0);
        org.telegram.messenger.fj fjVar = this.F3;
        long P1 = (fjVar == null || fjVar.p5()) ? org.telegram.messenger.mp.u1(this.H3).P1(c1()) : 0L;
        ki kiVar = this.w2;
        aiVar.i(Y0() + (kiVar != null ? kiVar.getSelectedItemsCount() : 0), P1, true);
        vh vhVar = this.C2;
        if (vhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vhVar.getLayoutParams();
            int max = Math.max(org.telegram.messenger.g0.L(48.0f), aiVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                vhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void M(int i7) {
        super.M(i7);
        this.w2.r(i7);
    }

    public final void M1() {
        float f10;
        ki kiVar = this.w2;
        boolean i7 = kiVar == null ? false : kiVar.i();
        gi.j jVar = this.d3;
        jVar.setEnabled(i7);
        ki kiVar2 = this.w2;
        if (kiVar2 != null) {
            f10 = ((kiVar2.i() ? 1.0f : 0.5f) * (this.x2 == null ? 1.0f : this.Y1)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        ki kiVar3 = this.x2;
        if (kiVar3 != null) {
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.Y1, kiVar3.i() ? 1.0f : 0.5f, f10);
        }
        this.e3 = f10;
        if (jVar != null) {
            float f11 = f10 * this.f3;
            jVar.setAlpha(f11);
            jVar.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    public final void N0() {
        if (b1().a.length() <= 0) {
            return;
        }
        this.w2.a(b1().getText());
    }

    public final void N1(ki kiVar, int i7) {
        if (kiVar == null) {
            return;
        }
        dh.g gVar = this.D4;
        if (gVar != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(0.0f, i7);
        }
        int currentItemTop = kiVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = kiVar == this.w2 && currentItemTop <= kiVar.getButtonsHideOffset();
        this.M1 = z11;
        if (kiVar == this.w2) {
            J1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kiVar.getLayoutParams();
        int i10 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        ki kiVar2 = this.w2;
        int i11 = kiVar2 == kiVar ? 0 : 1;
        if ((kiVar2 instanceof pm) || (this.x2 instanceof pm)) {
            Object obj = this.r3;
            if ((obj instanceof r1.g) && ((r1.g) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.Z3;
        int i12 = iArr[i11];
        if (i12 == i10 && !z10) {
            if (i7 != 0) {
                this.a4 = i12;
            }
        } else {
            this.a4 = i12;
            iArr[i11] = i10;
            Q1(i11);
            this.b.invalidate();
        }
    }

    public final boolean O0() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        return (h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).Z6();
    }

    public final void O1(boolean z10) {
        hi.v vVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout == null || (vVar = this.Z2) == null) {
            return;
        }
        boolean z11 = this.o3 && this.d2 && this.w2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0();
        boolean z12 = !ChatAttachAlertPhotoLayout.V();
        vVar.f = z12;
        if (!z10) {
            ((c6) vVar.g).a(z12);
        }
        vVar.invalidateSelf();
        org.telegram.ui.ActionBar.r0 r0Var = this.a3;
        if (z10 && this.o3) {
            r0Var.setVisibility(0);
            r0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(lr.h).withEndAction(new nh(this, z11, 0)).start();
        } else {
            r0Var.setVisibility(z11 ? 0 : 8);
            r0Var.setAlpha(z11 ? 1.0f : 0.0f);
            r0Var.setScaleX(z11 ? 1.0f : 0.6f);
            r0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    public final boolean P0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (!(h2Var instanceof org.telegram.ui.bn)) {
            return false;
        }
        return ChatActivityEnterView.N(this.H3, ((org.telegram.ui.bn) h2Var).a(), h2Var, charSequence);
    }

    public final void P1(boolean z10) {
        ki kiVar = this.e2;
        if (!z10) {
            G1(kiVar);
            return;
        }
        if (this.H1) {
            if (this.l2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.i6 i6Var = this.t1;
                if (i6Var == null) {
                    i6Var = this.J0;
                }
                pm pmVar = new pm(context, i6Var, this);
                pmVar.E = 0.0f;
                pmVar.F = 0.0f;
                pmVar.G = 0.0f;
                pmVar.H = 0.0f;
                pmVar.I = 0.0f;
                pmVar.J = 0.0f;
                pmVar.K = null;
                pmVar.L = false;
                pmVar.N = 0.0f;
                pmVar.R = false;
                pmVar.T = false;
                Point point = org.telegram.messenger.g0.q;
                pmVar.U = point.y > point.x;
                pmVar.n = i6Var;
                pmVar.f = true;
                pmVar.setWillNotDraw(false);
                si siVar = pmVar.b;
                org.telegram.ui.ActionBar.z t6 = siVar.V2.t();
                TextView textView = new TextView(context);
                pmVar.y = textView;
                org.telegram.ui.ActionBar.i6 i6Var2 = pmVar.a;
                hi.v2 v2Var = new hi.v2(pmVar, context, t6, i6Var2, 2);
                siVar.V2.addView(v2Var, 0, c8.ma.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var2);
                textView.setText(org.telegram.messenger.gd.M0(2131753956, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                v2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                di.b1 b1Var = new di.b1(pmVar, context, i6Var2, 17);
                pmVar.r = b1Var;
                b1Var.setAdapter(new org.telegram.ui.y7(pmVar, 3));
                v4.c0 c0Var = new v4.c0(1, false);
                pmVar.s = c0Var;
                b1Var.setLayoutManager(c0Var);
                b1Var.setClipChildren(false);
                b1Var.setClipToPadding(false);
                b1Var.setOverScrollMode(2);
                b1Var.setVerticalScrollBarEnabled(false);
                om omVar = new om(pmVar, context);
                pmVar.w = omVar;
                omVar.setClipToPadding(true);
                omVar.setClipChildren(true);
                pmVar.addView(b1Var, c8.ma.c(-1.0f, -1));
                pmVar.Q = siVar.e2;
                omVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = pmVar.Q;
                omVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                omVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                omVar.c();
                UndoView undoView = new UndoView(context, null, false, siVar.t1);
                pmVar.x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                pmVar.addView(undoView, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                pmVar.O = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.l2 = pmVar;
                pmVar.bringToFront();
            }
            ki kiVar2 = this.w2;
            pm pmVar2 = this.l2;
            if (kiVar2 != pmVar2) {
                kiVar = pmVar2;
            }
            G1(kiVar);
        }
    }

    public final void Q0() {
        th thVar = this.w3;
        if (thVar == null) {
            return;
        }
        int childCount = thVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            thVar.getChildAt(i7);
        }
        boolean z10 = this.f4;
        org.telegram.ui.ActionBar.u6.U(this.h3, z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.j5, this.J0);
        org.telegram.ui.ActionBar.u6.U(this.m3, z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.j5, this.J0);
        org.telegram.ui.ActionBar.u6.U(this.d3, org.telegram.ui.ActionBar.n6.Ji, this.J0);
        int w02 = org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.j5, this.J0);
        boolean z11 = (this.r4 && w02 == this.q4) ? false : true;
        this.r4 = true;
        this.q4 = w02;
        org.telegram.ui.ActionBar.r0 r0Var = this.Y2;
        if (z11) {
            r0Var.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.Zg : org.telegram.ui.ActionBar.n6.I5, this.J0), r0Var.getBackground());
        int i10 = org.telegram.ui.ActionBar.n6.E8;
        r0Var.P(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), false);
        r0Var.P(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), true);
        r0Var.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.J0));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.a3;
        if (r0Var2 != null && z11) {
            r0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.c3;
        if (r0Var3 != null) {
            if (z11) {
                r0Var3.setIconColor(w02);
            }
            org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.Zg : org.telegram.ui.ActionBar.n6.I5, this.J0), r0Var3.getBackground());
        }
        vh vhVar = this.C2;
        org.telegram.ui.ActionBar.i6 i6Var = vhVar.N;
        rt rtVar = vhVar.a;
        int i11 = vhVar.M;
        if (i11 == 0) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, i6Var));
            int i12 = org.telegram.ui.ActionBar.n6.G6;
            rtVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        } else if (i11 == 2 || i11 == 3) {
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.E = -1;
        } else {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.t5, i6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var));
        }
        vhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Oe, i6Var), PorterDuff.Mode.MULTIPLY));
        st stVar = vhVar.d;
        if (stVar != null) {
            stVar.updateColors();
        }
        org.telegram.ui.ActionBar.u6.l(thVar, 21, org.telegram.ui.ActionBar.n6.A5, this.J0);
        int i13 = z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
        v7 v7Var = this.V2;
        org.telegram.ui.ActionBar.u6.l(v7Var, 1, i13, i6Var2);
        org.telegram.ui.ActionBar.u6.l(v7Var, 3, z10 ? org.telegram.ui.ActionBar.n6.Zg : org.telegram.ui.ActionBar.n6.I5, this.J0);
        org.telegram.ui.ActionBar.u6.l(v7Var, 5, z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.j5, this.J0);
        int e12 = e1(false);
        org.telegram.ui.ActionBar.n6.C1(e12, this.s0);
        ui.c cVar = this.E4;
        if (cVar.b != e12) {
            cVar.a(e12);
            lh.f fVar = this.t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            uh uhVar = this.u3;
            if (uhVar != null) {
                uhVar.invalidate();
            }
        }
        this.b.invalidate();
        int i14 = 0;
        while (true) {
            ki[] kiVarArr = this.u2;
            if (i14 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i14];
            if (kiVar != null) {
                kiVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Q(org.telegram.ui.ActionBar.n6.h5);
            return;
        }
        this.G0 = -1;
        this.H0 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i5, this.J0);
        org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0), false, null);
        org.telegram.messenger.g0.m3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
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
    public final void Q1(int i7) {
        int i10;
        float f10;
        org.telegram.ui.ActionBar.r0 r0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        gi.j jVar;
        float max;
        int i11;
        float f15 = this.o1.e;
        ki kiVar = i7 == 0 ? this.w2 : this.x2;
        if (kiVar == null || kiVar.getVisibility() != 0) {
            return;
        }
        int d12 = d1(i7);
        if (kiVar == this.h2 || kiVar == this.i2) {
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
        sh shVar = this.g3;
        float L = alpha != 0.0f ? 0.0f : org.telegram.messenger.g0.L((1.0f - shVar.getAlpha()) * 26.0f);
        boolean z10 = this.o3;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.Y2;
        ai.k0 k0Var = this.M2;
        if (z10 && this.O2 == 0 && !this.R2) {
            r0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37), ((d12 - org.telegram.messenger.g0.L((i10 * f15) + 37.0f)) + L) - (k0Var.getAlpha() * k0Var.getMeasuredHeight())) + this.j4);
        } else {
            r0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.j4);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.a3;
        if (r0Var3 != null) {
            r0Var3.setTranslationY(r0Var2.getTranslationY());
        }
        hi.m3 m3Var = this.b3;
        if (m3Var != null) {
            m3Var.setTranslationY(r0Var2.getTranslationY());
        }
        if (this.A1 && this.q3) {
            ki kiVar2 = this.x2;
            if (kiVar2 != null && this.w2 != null) {
                f10 = Math.min(kiVar2.getTranslationY(), this.w2.getTranslationY());
            } else if (kiVar2 != null) {
                f10 = kiVar2.getTranslationY();
            }
            r0Var = this.c3;
            if (r0Var != null) {
                r0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.j4);
            }
            float L2 = ((((d12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.j4) + f10) - (k0Var.getAlpha() * k0Var.getMeasuredHeight());
            this.n3 = L2;
            shVar.setTranslationY(Math.max(this.j4, L2));
            k0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.j4, (shVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.n3 + org.telegram.messenger.g0.L(8.0f)));
            if (this.X1) {
                K1();
            }
            V0();
            int i12 = 59;
            if (this.h2 != null) {
                if (org.telegram.messenger.g0.Q1()) {
                    i11 = 63;
                } else {
                    Point point2 = org.telegram.messenger.g0.q;
                    i11 = point2.x > point2.y ? 53 : 59;
                }
                rn rnVar = this.h2;
                if (rnVar == this.x2) {
                    f12 = (rnVar.getTranslationY() + d1(1)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.Y1;
                } else if (rnVar == this.w2) {
                    f12 = (rnVar.getTranslationY() + d1(0)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
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
                    rn rnVar2 = this.i2;
                    if (rnVar2 == this.x2) {
                        f14 = (rnVar2.getTranslationY() + d1(1)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.Y1;
                    } else if (rnVar2 == this.w2) {
                        f14 = (rnVar2.getTranslationY() + d1(0)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.x2 == null ? 1.0f : 1.0f - this.Y1;
                    }
                    jVar = this.d3;
                    if (jVar != null) {
                        int measuredWidth = org.telegram.messenger.gd.a0 ? (this.b.getMeasuredWidth() - jVar.getMeasuredWidth()) - org.telegram.messenger.g0.L(62.0f) : 0;
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
        r0Var = this.c3;
        if (r0Var != null) {
        }
        float L22 = ((((d12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.j4) + f10) - (k0Var.getAlpha() * k0Var.getMeasuredHeight());
        this.n3 = L22;
        shVar.setTranslationY(Math.max(this.j4, L22));
        k0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.j4, (shVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.n3 + org.telegram.messenger.g0.L(8.0f)));
        if (this.X1) {
        }
        V0();
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
    
        if (org.telegram.messenger.fj.c3(r0.k) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var == null || !(h2Var instanceof org.telegram.ui.bn)) {
            return;
        }
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
        wt wtVar = this.X1 ? this.N2 : this.C2;
        String obj = wtVar != null ? wtVar.getText().toString() : null;
        if (this.F3 == null) {
            ki kiVar = this.w2;
            z11 = true;
            if (kiVar != null) {
            }
            if (bg.x.g(this.H3).e(obj, bnVar.v8) <= 0) {
                org.telegram.messenger.fj fjVar = bnVar.F5;
                if (fjVar != null) {
                }
            }
            this.r1.a(z11, z10);
            if (z11 || !g1()) {
            }
            w1(false, z10);
            return;
        }
        z11 = false;
        this.r1.a(z11, z10);
        if (z11) {
        }
    }

    public final void R1() {
        int i7 = 0;
        Q1(0);
        this.p3.invalidate();
        ai.k0 k0Var = this.M2;
        k0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout != null) {
            xl xlVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.Y();
            if (xlVar != null && xlVar.getFastScroll() != null) {
                hj0 fastScroll = xlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.X1) {
                    i7 = (int) (k0Var.getAlpha() * k0Var.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i7;
                xlVar.getFastScroll().invalidate();
            }
        }
        K1();
        V0();
    }

    public final void S0() {
        float f10 = this.n1.e;
        this.u3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.o1.e))), 1.0f - ((1.0f - this.m1.e) * f10)));
    }

    public final void T0(ki kiVar) {
        boolean e10 = kiVar.e();
        lh.f fVar = this.t3;
        if (fVar != null) {
            fVar.setFadeHeightBottom(e10 ? 0 : org.telegram.messenger.g0.L(48.0f));
        }
        uh uhVar = this.u3;
        if (uhVar != null) {
            uhVar.setVisibility(e10 ? 4 : 0);
        }
    }

    public final void U0() {
        a10.d(this.D2, com.google.android.gms.internal.vision.e2.D(this.p1.e, this.q1.e, a8.m7.a(this.r1.e), this.P3 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.w6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            ki[] kiVarArr = this.u2;
            if (i7 >= kiVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i5));
                return arrayList;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null && (themeDescriptions = kiVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i7++;
        }
    }

    public final void V0() {
        ai aiVar = this.G2;
        sh shVar = this.F2;
        ai.k0 k0Var = this.M2;
        if (k0Var == null || k0Var.getVisibility() != 0 || k0Var.getAlpha() == 0.0f) {
            shVar.setTranslationY(this.e4);
            aiVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.m1.e;
        float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
        aiVar.setAlpha(abs * abs * abs * abs);
        shVar.setTranslationY(org.telegram.messenger.g0.T1(this.e4, ((k0Var.getTranslationY() + k0Var.getTop()) - shVar.getTop()) + org.telegram.messenger.g0.L(8.0f), lr.j.getInterpolation(f10)));
    }

    public final void W0(int i7) {
        this.Q2 = true;
        this.v3.setVisibility(0);
        this.C1 = true;
        this.D1 = i7;
        this.O2 = 0;
        this.A1 = false;
        this.B1 = false;
        this.E1 = null;
        org.telegram.ui.ActionBar.r0 r0Var = this.i3;
        if (r0Var != null) {
            this.h3.setTranslationY(0.0f);
            r0Var.setVisibility(8);
        }
    }

    public final void X0(hi.e7 e7Var) {
        String M0 = org.telegram.messenger.gd.M0(2131752111, null);
        TextView textView = this.h3;
        textView.setText(M0);
        this.Q2 = false;
        this.v3.setVisibility(8);
        this.O2 = 1;
        this.A1 = true;
        this.B1 = true;
        this.d2 = false;
        this.E1 = e7Var;
        org.telegram.ui.ActionBar.r0 r0Var = this.i3;
        if (r0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            r0Var.setVisibility(0);
            r0Var.setClickable(true);
            r0Var.setAlpha(1.0f);
            r0Var.setScaleX(1.0f);
            r0Var.setScaleY(1.0f);
        }
    }

    public final int Y0() {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.hj hjVar;
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (!(h2Var instanceof org.telegram.ui.bn) || (jjVar = ((org.telegram.ui.bn) h2Var).x5) == null || (hjVar = jjVar.b) == null) {
            return 0;
        }
        return hjVar.g.size();
    }

    public final TLRPC.Chat Z0() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        return h2Var instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) h2Var).e : org.telegram.messenger.mp.u1(this.H3).O0(Long.valueOf(-this.U1));
    }

    @Override // org.telegram.ui.ActionBar.x2, org.telegram.ui.ActionBar.d2
    public final void a(boolean z10) {
        if (z10) {
            this.B4 = z10;
        }
        dismiss();
    }

    public final float a1() {
        return r0.getMeasuredHeight() - ((1.0f - this.B2.getAlpha()) * (r0.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    public final wt b1() {
        ki kiVar;
        return (this.X1 && ((kiVar = this.w2) == this.e2 || kiVar == this.l2)) ? this.N2 : this.C2;
    }

    public final long c1() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        return h2Var instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) h2Var).a() : this.U1;
    }

    public final int d1(int i7) {
        ki kiVar = this.x2;
        int[] iArr = this.Z3;
        if (kiVar == null || !((this.w2 instanceof pm) || (kiVar instanceof pm))) {
            return iArr[i7];
        }
        return org.telegram.messenger.g0.W1(this.Y1, iArr[0], iArr[1]);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.T0 && i7 != org.telegram.messenger.ks.Y4 && i7 != org.telegram.messenger.ks.F1) {
            if (i7 == org.telegram.messenger.ks.h5) {
                this.F1 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).J0();
            }
        } else {
            pi piVar = this.y3;
            if (piVar != null) {
                piVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        xh xhVar;
        vh vhVar;
        if (this.w2.q() || this.J) {
            return;
        }
        ki kiVar = this.w2;
        xk xkVar = this.r2;
        int i7 = 1;
        int i10 = 0;
        boolean z10 = (kiVar != xkVar || xkVar == null || xkVar.L || xkVar.Q0 == null) ? false : true;
        this.s2 = z10;
        if (!z10 && (vhVar = this.C2) != null) {
            org.telegram.messenger.g0.v1(vhVar.getEditText());
        }
        if (!this.s2 && (xhVar = this.N2) != null) {
            org.telegram.messenger.g0.v1(xhVar.getEditText());
        }
        this.v2.clear();
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var == null) {
            h2Var = LaunchActivity.Q();
        }
        if (this.B4 || h2Var == null || this.w2.getSelectedItemsCount() <= 0 || this.A1) {
            int i11 = 0;
            while (true) {
                ki[] kiVarArr = this.u2;
                if (i11 >= kiVarArr.length) {
                    break;
                }
                ki kiVar2 = kiVarArr[i11];
                if (kiVar2 != null && this.w2 != kiVar2) {
                    kiVar2.q();
                }
                i11++;
            }
            org.telegram.messenger.g0.s3(this, i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0), 0), true, new bh(this, 11));
            if (h2Var != null) {
                org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), this.J0);
        String M0 = org.telegram.messenger.gd.M0(2131751388, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131751389, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751395, null), new bh(this, i7));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        u1Var.setOnCancelListener(new hh(this, i10));
        u1Var.O = new y0(this, 3);
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, this.J0);
        }
    }

    public final int e1(boolean z10) {
        v7 v7Var;
        if (this.f4) {
            return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.kh, this.J0);
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        boolean d = i6Var != null ? i6Var.d() : org.telegram.ui.ActionBar.n6.I.q();
        Iterator it = this.s1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = c8.l9.a(f10, 0.0f, 1.0f);
        if (z10 && (v7Var = this.V2) != null && v7Var.getVisibility() == 0) {
            a10 *= 1.0f - v7Var.getAlpha();
        }
        return i0.a.f(a10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0), org.telegram.ui.ActionBar.n6.w0(d ? org.telegram.ui.ActionBar.n6.a7 : org.telegram.ui.ActionBar.n6.i5, this.J0));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean f0(MotionEvent motionEvent) {
        return this.w2.o(motionEvent);
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
    public final void f1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        si siVar;
        em emVar;
        org.telegram.messenger.ue ueVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        ki kiVar;
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
        sh shVar = this.v3;
        shVar.setAlpha(1.0f);
        shVar.setTranslationY(0.0f);
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.v2;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((ki.t3) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
            i10++;
        }
        int i11 = this.O2;
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (i11 != 2) {
            if (h2Var instanceof org.telegram.ui.bn) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
                chat = bnVar.e;
                user = bnVar.j();
            } else {
                long j3 = this.U1;
                int i12 = this.H3;
                if (j3 >= 0) {
                    user = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(this.U1));
                    chat = null;
                } else if (j3 < 0) {
                    chat = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(-this.U1));
                    user = null;
                }
            }
            z10 = h2Var instanceof org.telegram.ui.bn;
            if ((z10 && this.O2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.J3 = org.telegram.messenger.v3.p(chat);
                    this.K3 = org.telegram.messenger.v3.u(chat);
                    this.L3 = org.telegram.messenger.v3.o(chat);
                    this.M3 = org.telegram.messenger.v3.r(chat);
                    this.N3 = !org.telegram.messenger.v3.V(chat) && org.telegram.messenger.v3.r(chat);
                    this.O3 = org.telegram.messenger.v3.q(chat);
                    this.I3 = org.telegram.messenger.v3.l(chat);
                } else {
                    this.M3 = org.telegram.messenger.o10.u(user) || org.telegram.messenger.o10.C(user);
                    this.N3 = !z10 || ((org.telegram.ui.bn) h2Var).h == null;
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
            vh vhVar = this.C2;
            if (z10 || this.O2 == 2) {
                vhVar.setVisibility(this.R1 ? 0 : 4);
            }
            boolean z11 = this.K3;
            boolean z12 = this.J3;
            boolean z13 = this.I3;
            chatAttachAlertPhotoLayout = this.e2;
            siVar = chatAttachAlertPhotoLayout.b;
            ty tyVar = chatAttachAlertPhotoLayout.I;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z11;
            chatAttachAlertPhotoLayout.y0 = z12;
            chatAttachAlertPhotoLayout.A0 = z13;
            emVar = chatAttachAlertPhotoLayout.Q;
            if (emVar != null) {
                emVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.Q.setEnabled(chatAttachAlertPhotoLayout.w0);
            }
            if (!((siVar.a2 instanceof org.telegram.ui.bn) && siVar.Z0() == null) && siVar.O2 == 0) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
                if (chatAttachAlertPhotoLayout.w0) {
                    tyVar.setText(org.telegram.messenger.gd.M0(2131747988, null));
                    tyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat Z0 = siVar.Z0();
                    tyVar.a(R.raw.media_forbidden, org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2);
                    if (org.telegram.messenger.v3.P(7, Z0)) {
                        tyVar.setText(org.telegram.messenger.gd.M0(2131749368, null));
                    } else if (org.telegram.messenger.g0.D1(Z0.banned_rights)) {
                        tyVar.setText(org.telegram.messenger.gd.a0("AttachMediaRestrictedForever", null, 2131753953, new Object[0]));
                    } else {
                        tyVar.setText(org.telegram.messenger.gd.a0("AttachMediaRestricted", null, 2131753954, org.telegram.messenger.gd.v(Z0.banned_rights.until_date)));
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
                    ((org.telegram.messenger.ef) chatAttachAlertPhotoLayout.V0.e.get(i13)).e();
                }
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.G.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.gd.M0(2131752227, null));
            ueVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = ueVar;
            if (ueVar != null) {
                chatAttachAlertPhotoLayout.Y0 = false;
                if (tyVar != null) {
                    tyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            vhVar.k(true);
            this.N2.k(true);
            this.s3 = false;
            A0(false);
            if (!this.J1 || this.K1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.j2 == null) {
                    kl klVar = new kl(this, getContext(), this.J0, (this.C1 || this.K1 || this.P3) ? false : true);
                    this.j2 = klVar;
                    this.u2[5] = klVar;
                    jl jlVar = this.u4;
                    if (jlVar != null) {
                        klVar.setDelegate(jlVar);
                    } else {
                        klVar.setDelegate(new bh(this, i7));
                    }
                }
                this.U2 = 5L;
                kiVar = this.j2;
            } else if (this.I1) {
                s1(false);
                kiVar = this.k2;
                this.U2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                org.telegram.messenger.fj fjVar = this.F3;
                if (fjVar != null) {
                    int i14 = this.E3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i14 == -1) {
                        this.Q2 = true;
                        if (fjVar.I3()) {
                            q1(false);
                            kiVar = this.g2;
                            this.U2 = 3L;
                        } else if (this.F3.U2()) {
                            s1(false);
                            kiVar = this.k2;
                            this.U2 = 4L;
                        } else {
                            this.U2 = 1L;
                        }
                    } else {
                        if (i14 == 2) {
                            q1(false);
                            kiVar = this.g2;
                            this.U2 = 3L;
                        } else if (i14 == 1) {
                            s1(false);
                            kiVar = this.k2;
                            this.U2 = 4L;
                        } else {
                            this.U2 = 1L;
                            kiVar = chatAttachAlertPhotoLayout2;
                        }
                        this.Q2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.Q2 = this.O2 == 0 && !this.R2;
                    this.U2 = 1L;
                }
                kiVar = chatAttachAlertPhotoLayout2;
            }
            shVar.setVisibility(this.Q2 ? 0 : 8);
            if (this.w2 != kiVar) {
                v7 v7Var = this.V2;
                if (v7Var.o0) {
                    v7Var.o(true);
                }
                this.b.removeView(this.w2);
                this.w2.u();
                this.w2.setVisibility(8);
                this.w2.t();
                this.w2 = kiVar;
                this.r0 = true;
                if (kiVar.getParent() == null) {
                    t1(this.w2);
                    this.b.addView(this.w2, 0, c8.ma.c(-1.0f, -1));
                }
                kiVar.setAlpha(1.0f);
                kiVar.setVisibility(0);
                kiVar.I(null);
                kiVar.J();
                T0(kiVar);
                v7Var.setVisibility(kiVar.j() != 0 ? 0 : 4);
                w1(this.X1, false);
                M1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.w2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            L1(0);
            this.y3.f();
            b1().setText("");
            this.x3.h1(0, 1000000);
        }
        user = null;
        chat = null;
        z10 = h2Var instanceof org.telegram.ui.bn;
        if (z10) {
            if (chat != null) {
            }
            if (this.B1) {
            }
            if (this.P3) {
            }
            vh vhVar2 = this.C2;
            if (z10) {
            }
            vhVar2.setVisibility(this.R1 ? 0 : 4);
            boolean z112 = this.K3;
            boolean z122 = this.J3;
            boolean z132 = this.I3;
            chatAttachAlertPhotoLayout = this.e2;
            siVar = chatAttachAlertPhotoLayout.b;
            ty tyVar2 = chatAttachAlertPhotoLayout.I;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z112;
            chatAttachAlertPhotoLayout.y0 = z122;
            chatAttachAlertPhotoLayout.A0 = z132;
            emVar = chatAttachAlertPhotoLayout.Q;
            if (emVar != null) {
            }
            if (siVar.a2 instanceof org.telegram.ui.bn) {
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
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.gd.M0(2131752227, null));
            ueVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = ueVar;
            if (ueVar != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            vhVar2.k(true);
            this.N2.k(true);
            this.s3 = false;
            A0(false);
            if (this.J1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.j2 == null) {
            }
            this.U2 = 5L;
            kiVar = this.j2;
            shVar.setVisibility(this.Q2 ? 0 : 8);
            if (this.w2 != kiVar) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.w2 != chatAttachAlertPhotoLayout3) {
            }
            L1(0);
            this.y3.f();
            b1().setText("");
            this.x3.h1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.B1) {
        }
        if (this.P3) {
        }
        vh vhVar22 = this.C2;
        if (z10) {
        }
        vhVar22.setVisibility(this.R1 ? 0 : 4);
        boolean z1122 = this.K3;
        boolean z1222 = this.J3;
        boolean z1322 = this.I3;
        chatAttachAlertPhotoLayout = this.e2;
        siVar = chatAttachAlertPhotoLayout.b;
        ty tyVar22 = chatAttachAlertPhotoLayout.I;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.w0 = z14;
        chatAttachAlertPhotoLayout.x0 = z1122;
        chatAttachAlertPhotoLayout.y0 = z1222;
        chatAttachAlertPhotoLayout.A0 = z1322;
        emVar = chatAttachAlertPhotoLayout.Q;
        if (emVar != null) {
        }
        if (siVar.a2 instanceof org.telegram.ui.bn) {
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
        chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.gd.M0(2131752227, null));
        ueVar = chatAttachAlertPhotoLayout.V0;
        chatAttachAlertPhotoLayout.U0 = ueVar;
        if (ueVar != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        vhVar22.k(true);
        this.N2.k(true);
        this.s3 = false;
        A0(false);
        if (this.J1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.j2 == null) {
        }
        this.U2 = 5L;
        kiVar = this.j2;
        shVar.setVisibility(this.Q2 ? 0 : 8);
        if (this.w2 != kiVar) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.w2 != chatAttachAlertPhotoLayout3) {
        }
        L1(0);
        this.y3.f();
        b1().setText("");
        this.x3.h1(0, 1000000);
    }

    public final boolean g1() {
        if (!this.X1) {
            return false;
        }
        ki kiVar = this.w2;
        return kiVar == this.e2 || kiVar == this.l2;
    }

    public final void i1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        qi qiVar = this.X3;
        if (qiVar == null || this.s3) {
            return;
        }
        boolean g02 = qiVar.g0();
        this.s3 = true;
        org.telegram.messenger.g0.h3(new di.p6(this, editTextBoldCursor, z10, 19), g02 ? 200L : 0L);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final xk xkVar = this.r2;
        if (xkVar != null && this.w2 == xkVar) {
            final eh ehVar = new eh(this, 1);
            int i7 = xkVar.n;
            org.telegram.ui.Wallet.ca caVar = xkVar.S;
            si siVar = xkVar.b;
            AnimatorSet animatorSet = null;
            if (!xkVar.L && (wallettransaction = xkVar.Q0) != null && xkVar.R0 == null && xkVar.S0 == null) {
                if (xkVar.T0) {
                    org.telegram.ui.Wallet.n6 n6Var = new org.telegram.ui.Wallet.n6();
                    n6Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
                    if (h2Var != null && h2Var.presentFragment(n6Var, false, true)) {
                        final int i10 = 0;
                        org.telegram.ui.Wallet.ra raVar = new org.telegram.ui.Wallet.ra(siVar.c, siVar.b, caVar.getDiamondView(), n6Var, xkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.pk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        if (!xkVar.L) {
                                            ehVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!xkVar.L) {
                                            ehVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, siVar);
                        xkVar.S0 = raVar;
                        animatorSet = raVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.m7 diamondView = caVar.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar.a2;
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var2;
                            if (bnVar.getCurrentAccount() == i7 && bnVar.a() == xkVar.r.id && bnVar.g4 == 0 && bnVar.getFragmentView() != null && bnVar.getFragmentView().isAttachedToWindow()) {
                                final int i11 = 1;
                                org.telegram.ui.Wallet.e7 e7Var = new org.telegram.ui.Wallet.e7(siVar.c, siVar.b, caVar.getDiamondView(), bnVar, xkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.pk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                if (!xkVar.L) {
                                                    ehVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!xkVar.L) {
                                                    ehVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, siVar);
                                xkVar.R0 = e7Var;
                                animatorSet = e7Var.m;
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
        if (this.s0 == null || this.b == null) {
            return;
        }
        int e12 = e1(false);
        org.telegram.ui.ActionBar.n6.C1(e12, this.s0);
        ui.c cVar = this.E4;
        if (cVar.b != e12) {
            cVar.a(e12);
            lh.f fVar = this.t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            uh uhVar = this.u3;
            if (uhVar != null) {
                uhVar.invalidate();
            }
        }
        M1();
        this.b.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        c81 c81Var = chatAttachAlertPhotoLayout.m0;
        bi.a3 a3Var = chatAttachAlertPhotoLayout.k0;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        xl xlVar = chatAttachAlertPhotoLayout.r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        boolean z10 = i13 < i14;
        int i15 = org.telegram.messenger.g0.n;
        if (view == a3Var) {
            if (z10) {
                if (xlVar.getVisibility() == 0) {
                    a3Var.layout(0, org.telegram.messenger.f3.z(222.0f, i12, i15), i13, org.telegram.messenger.f3.z(96.0f, i12, i15));
                    return true;
                }
                a3Var.layout(0, org.telegram.messenger.f3.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            }
            if (xlVar.getVisibility() == 0) {
                a3Var.layout(org.telegram.messenger.f3.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            }
            a3Var.layout(org.telegram.messenger.f3.z(126.0f, i11, i15), 0, i11, i14 - i15);
            return true;
        }
        if (view == c81Var) {
            if (z10) {
                if (xlVar.getVisibility() == 0) {
                    c81Var.layout(0, org.telegram.messenger.f3.z(310.0f, i12, i15), i13, org.telegram.messenger.f3.z(260.0f, i12, i15));
                    return true;
                }
                c81Var.layout(0, org.telegram.messenger.f3.z(176.0f, i12, i15), i13, org.telegram.messenger.f3.z(126.0f, i12, i15));
                return true;
            }
            if (xlVar.getVisibility() == 0) {
                c81Var.layout(org.telegram.messenger.f3.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            }
            c81Var.layout(org.telegram.messenger.f3.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
            return true;
        }
        if (view != textView) {
            if (view != xlVar) {
                return false;
            }
            if (z10) {
                int z11 = org.telegram.messenger.f3.z(88.0f, i14, i15);
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
            if (xlVar.getVisibility() == 0) {
                L3 -= org.telegram.messenger.g0.L(96.0f);
            }
            measuredWidth = L3 - i15;
        } else {
            L = i11 - org.telegram.messenger.g0.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
            textView.setRotation(-90.0f);
            if (xlVar.getVisibility() == 0) {
                L -= org.telegram.messenger.g0.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void k1() {
        int i7 = 0;
        while (true) {
            ki[] kiVarArr = this.u2;
            if (i7 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null) {
                kiVar.p();
            }
            i7++;
        }
        int i10 = this.H3;
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.T0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.Y4);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.h5);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.F1);
        this.Q1 = true;
        vh vhVar = this.C2;
        if (vhVar != null) {
            vhVar.o();
        }
        xh xhVar = this.N2;
        if (xhVar != null) {
            xhVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean l0(View view, int i7, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        hm hmVar = chatAttachAlertPhotoLayout.w;
        si siVar = chatAttachAlertPhotoLayout.b;
        xl xlVar = chatAttachAlertPhotoLayout.r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i7 < i10;
        if (view != chatAttachAlertPhotoLayout.Q) {
            bi.a3 a3Var = chatAttachAlertPhotoLayout.k0;
            if (view == a3Var) {
                if (z10) {
                    a3Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                a3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            c81 c81Var = chatAttachAlertPhotoLayout.m0;
            if (view == c81Var) {
                if (z10) {
                    c81Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                c81Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            if (view == xlVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    xlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
                    if (b0Var.o != 0) {
                        xlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        hmVar.f();
                    }
                } else {
                    xlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                    if (b0Var.o != 1) {
                        xlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        hmVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
            chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(siVar.U() + siVar.T() + i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void l1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String q10 = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : org.telegram.messenger.o10.q(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ri.d0(this.H3).b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.gd.a0("BotRemoveFromMenu", null, 2131752991, q10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.gd.M0(2131752990, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.gd.a0("BotRemoveInlineFromMenu", null, 2131752989, q10);
        }
        u1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, "OK"), new a3.h(this, tL_attachMenuBot, user, 25));
        i5.c.y("Cancel", 2131752578, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean m0() {
        this.e2.setTranslationX(0.0f);
        this.l3.setAlpha(0.0f);
        this.j3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.o4 = animatorSet;
        int i7 = 2;
        di diVar = this.m4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, diVar, 0.0f, 400.0f));
        this.o4.setDuration(400L);
        this.o4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        diVar.getClass();
        diVar.a(this, valueOf);
        this.o4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new ch(this, i7));
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
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, q6.d, this.p0 ? this.q0 : 0));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        h2.f fVar = new h2.f((int[]) null);
        k7 k7Var = new k7(this, fVar, this.z0, 6);
        int i10 = 3;
        this.n4.a(new bi.v0(i10, this, k7Var));
        this.A0.addListener(new ah.l(25, this, k7Var));
        fVar.d();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        A1(0.0f);
        ofFloat2.addUpdateListener(new ch(this, i10));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(lr.f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        while (true) {
            ki[] kiVarArr = this.u2;
            if (i7 >= kiVarArr.length) {
                this.d4 = true;
                return;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null) {
                kiVar.A();
            }
            i7++;
        }
    }

    public final void n1() {
        int i7 = 0;
        this.d4 = false;
        while (true) {
            ki[] kiVarArr = this.u2;
            if (i7 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null) {
                kiVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.X3.g0();
        }
        pi piVar = this.y3;
        if (piVar != null) {
            piVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void o0() {
        if (this.w2.s()) {
            dismiss();
        }
    }

    public final void o1() {
        org.telegram.messenger.fj fjVar = this.F3;
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        int i7 = this.H3;
        if (fjVar != null && fjVar.p5() && !org.telegram.messenger.v3.z(i7, 24, org.telegram.messenger.fj.B0(this.F3.k)) && (h2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            org.telegram.messenger.kj kjVar = bnVar.y5;
            if (kjVar == null) {
                kjVar = org.telegram.messenger.kj.b(this.F3.k.suggested_post);
            }
            if (!di.x8.S(i7, kjVar.a)) {
                bnVar.Ac(kjVar);
                return;
            }
        }
        if (this.F1 - this.G1 < 0) {
            org.telegram.messenger.g0.D3(this.u1);
            org.telegram.messenger.g0.D3(this.v1);
            try {
                this.G2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (org.telegram.messenger.mp.u1(i7).K3() || org.telegram.messenger.mp.u1(i7).X4 <= this.G1) {
                return;
            }
            E1(h2Var);
            return;
        }
        if (this.F3 == null && (h2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) h2Var;
            if (bnVar2.c()) {
                b5.J(getContext(), bnVar2.a(), new bh(this, 14), this.J0);
                return;
            }
        }
        ki kiVar = this.w2;
        if (kiVar == this.e2 || kiVar == this.l2) {
            v1(true, 0, 0, this.L2, g1());
        } else {
            if (kiVar.M(true, 0, 0, this.L2, g1())) {
                return;
            }
            this.B4 = true;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        if (this.N1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        v7 v7Var = this.V2;
        if (v7Var.o0) {
            v7Var.o(true);
            return;
        }
        if (this.w2.k()) {
            return;
        }
        if (b1() == null || !b1().e) {
            super.onBackPressed();
        } else {
            b1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var != null) {
            org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.w2.G(i7)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
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

    public final void p1(int i7) {
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (i7 == 3) {
            if (this.L3 || !O0()) {
                Activity parentActivity = h2Var != null ? h2Var.getParentActivity() : null;
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
                q1(true);
                return;
            }
            return;
        }
        if (i7 == 6 && org.telegram.messenger.g0.J1(h2Var)) {
            if (this.j2 == null) {
                kl klVar = new kl(this, getContext(), this.J0, (this.C1 || this.P3) ? false : true);
                this.j2 = klVar;
                this.u2[5] = klVar;
                jl jlVar = this.u4;
                if (jlVar != null) {
                    klVar.setDelegate(jlVar);
                } else if (h2Var instanceof org.telegram.ui.bn) {
                    klVar.setDelegate(new bh(this, 18));
                }
            }
            G1(this.j2);
        }
    }

    public final void q1(boolean z10) {
        if (!this.L3 && z10) {
            sn snVar = new sn(3, getContext(), this.J0, this);
            this.O1 = snVar;
            G1(snVar);
        }
        int i7 = 1;
        if (this.g2 == null) {
            cj cjVar = new cj(getContext(), this.J0, this);
            this.g2 = cjVar;
            this.u2[3] = cjVar;
            cjVar.setupBlurredSearchField(this.F4);
            this.g2.setDelegate(new bh(this, 15));
            if (this.C1) {
                this.g2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) h2Var).e;
            cj cjVar2 = this.g2;
            if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                i7 = -1;
            }
            cjVar2.setMaxSelectedFiles(i7);
        }
        if (z10) {
            G1(this.g2);
        }
    }

    public final void r1() {
        if (!this.O3) {
            sn snVar = new sn(5, getContext(), this.J0, this);
            this.O1 = snVar;
            G1(snVar);
        }
        if (this.f2 == null) {
            tj tjVar = new tj(getContext(), this.J0, this);
            this.f2 = tjVar;
            this.u2[2] = tjVar;
            tjVar.setupBlurredSearchField(this.F4);
            this.f2.setDelegate(new bi(this));
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) h2Var).e;
            this.f2.setMultipleSelectionAllowed(chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled);
        }
        G1(this.f2);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        super.s0();
        try {
            Q0();
            dh.d dVar = this.W1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, this.J0);
            org.telegram.ui.ActionBar.r0 r0Var = this.i3;
            if (r0Var == null || w02 == this.p4) {
                return;
            }
            this.p4 = w02;
            r0Var.setIconColor(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(boolean z10) {
        if (!this.I3 && z10) {
            sn snVar = new sn(4, getContext(), this.J0, this);
            this.O1 = snVar;
            G1(snVar);
        }
        boolean z11 = false;
        if (this.k2 == null) {
            kk kkVar = new kk(this.I1 ? 2 : 0, getContext(), this.J0, this);
            this.k2 = kkVar;
            this.u2[4] = kkVar;
            kkVar.setDelegate(new ci(this));
        }
        int i7 = 1;
        if (this.C1) {
            this.k2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.h2 h2Var = this.a2;
            if (h2Var instanceof org.telegram.ui.bn) {
                TLRPC.Chat chat = ((org.telegram.ui.bn) h2Var).e;
                kk kkVar2 = this.k2;
                if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                    i7 = -1;
                }
                kkVar2.setMaxSelectedFiles(i7);
            } else {
                this.k2.setMaxSelectedFiles(this.Q3);
                kk kkVar3 = this.k2;
                if (!this.I1 && !this.R1) {
                    z11 = true;
                }
                kkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        kk kkVar4 = this.k2;
        kkVar4.e0 = this.I1;
        if (z10) {
            G1(kkVar4);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        this.G3 = false;
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            this.i0 = ((org.telegram.ui.bn) h2Var).V9();
        }
        M1();
        this.q3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0), 0);
            this.H0 = o4;
            org.telegram.messenger.g0.s3(this, o4, false, null);
            org.telegram.messenger.g0.m3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        }
        if (this.k4) {
            this.k4 = false;
            v7 v7Var = this.V2;
            v7Var.updateColors();
            v7Var.invalidate();
            j1();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void u0(boolean z10) {
        this.r0 = true;
    }

    public final void u1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        v7 v7Var = this.V2;
        int i7 = 1;
        if (v7Var.o0) {
            v7Var.o(true);
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
            ki[] kiVarArr = this.u2;
            if (i7 >= kiVarArr.length) {
                break;
            }
            ki kiVar = kiVarArr[i7];
            if (kiVar != null) {
                kiVar.p();
                this.b.removeView(kiVarArr[i7]);
                kiVarArr[i7] = null;
            }
            i7++;
        }
        J1(false, false);
        super.L();
        if (this.s2) {
            this.s2 = false;
            this.t2 = 0.0f;
            org.telegram.ui.ActionBar.h2 h2Var = this.a2;
            if (h2Var == null || h2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = h2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void v() {
        if (this.a2 instanceof org.telegram.ui.bn) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.w2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.gd.M0(2131754921, "AccDescrAttachButton"));
        this.q3 = true;
        if (this.K3 || this.J3) {
            return;
        }
        O0();
    }

    public final boolean v1(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        if (this.G3) {
            return false;
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            TLRPC.Chat chat = bnVar.e;
            if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat) && chat.megagroup) || !org.telegram.messenger.v3.T(chat))) {
                org.telegram.messenger.mp.u1(this.H3).g7.edit().putBoolean("silent_" + bnVar.a(), !z10).commit();
            }
        }
        if (P0(b1().getText())) {
            return true;
        }
        N0();
        if (this.r1.f) {
            this.G3 = true;
            this.X3.y1(7, true, z10, i7, i10, j3, z11, false, 0L);
            return true;
        }
        long c12 = c1();
        ki kiVar = this.w2;
        return b5.Y(this.H3, c12, Y0() + (kiVar != null ? kiVar.getSelectedItemsCount() : 1), new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.oh
            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                si siVar = si.this;
                siVar.G3 = true;
                siVar.X3.y1(7, true, z10, i7, i10, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void w1(boolean z10, boolean z11) {
        this.m1.a(z10, z11);
        wt b12 = b1();
        this.X1 = z10;
        wt b13 = b1();
        final boolean z12 = this.B2.getTag() != null;
        ki kiVar = this.w2;
        final boolean z13 = this.X1 && (kiVar == this.e2 || kiVar == this.l2);
        ai.k0 k0Var = this.M2;
        kg.j jVar = this.A2;
        if (z11) {
            k0Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = k0Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            lr lrVar = lr.h;
            final int i7 = 0;
            duration.setInterpolator(lrVar).setUpdateListener(new ch(this, i7)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.dh
                public final /* synthetic */ si b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            si siVar = this.b;
                            if (!z13 || !z12) {
                                siVar.M2.setVisibility(8);
                            }
                            siVar.R1();
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
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(lrVar);
            final int i10 = 1;
            interpolator.setUpdateListener(new ch(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.dh
                public final /* synthetic */ si b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            si siVar = this.b;
                            if (!z13 || !z12) {
                                siVar.M2.setVisibility(8);
                            }
                            siVar.R1();
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
            R1();
            jVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            jVar.setTranslationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (b12 != b13) {
            b12.k(true);
            b13.setText(x5.cloneSpans(b12.getText()));
            b13.getEditText().setAllowTextEntitiesIntersection(b12.getEditText().getAllowTextEntitiesIntersection());
            if (b12.getEditText().isFocused()) {
                b13.getEditText().requestFocus();
                b13.getEditText().setSelection(b12.getEditText().getSelectionStart(), b12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.g3(new eh(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean x() {
        return true;
    }

    public final void x1(int i7, org.telegram.messenger.fj fjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (fjVar != null && (chatAttachAlertPhotoLayout = this.e2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.F3 == fjVar && this.E3 == i7) {
            return;
        }
        this.F3 = fjVar;
        if (fjVar != null && fjVar.z2()) {
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
        L1(0);
    }

    public final void y1(float f10) {
        int i7;
        float translationY = this.b.getTranslationY() - this.t2;
        this.t2 = this.b.getHeight() * f10;
        this.b.setTranslationY(translationY);
        xk xkVar = this.r2;
        if (xkVar != null) {
            xkVar.setSendTransitionProgress(f10);
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

    public final void z1(int i7, boolean z10) {
        if (this.F3 != null) {
            return;
        }
        this.Q3 = i7;
        this.R3 = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(Context context, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        float f10;
        TextPaint textPaint;
        te.j jVar;
        boolean z13;
        org.telegram.ui.ActionBar.r0 r0Var;
        gi.j jVar2;
        int i7 = 0;
        lr lrVar = lr.h;
        this.m1 = new te.a(0, this, lrVar, 380L, false);
        this.n1 = new te.a(1, this, lrVar, 380L, false);
        this.o1 = new te.a(2, this, lrVar, 380L, false);
        this.p1 = new te.a(3, this, lrVar, 380L, false);
        this.q1 = new te.a(4, this, lrVar, 380L, true);
        this.r1 = new te.a(5, this, lrVar, 320L, false);
        te.j jVar3 = new te.j(new bh(this, 2), lrVar, 380L);
        this.s1 = jVar3;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Y1 = 0.0f;
        this.Z1 = new di(this, 0);
        this.d2 = false;
        ki[] kiVarArr = new ki[12];
        this.u2 = kiVarArr;
        this.v2 = new LongSparseArray();
        this.E2 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.H2 = textPaint2;
        this.I2 = new RectF();
        this.J2 = new Paint(1);
        this.S2 = true;
        this.T2 = 1.0f;
        this.z3 = false;
        this.B3 = false;
        int i10 = org.telegram.messenger.j10.t0;
        this.H3 = i10;
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
        this.m4 = new di(this, 1);
        this.s4 = true;
        this.t4 = false;
        this.A4 = false;
        this.B4 = false;
        this.y = true;
        ui.c cVar = new ui.c();
        this.E4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
        this.Y0.E.add(new ri.o(cVar, new bh(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.bz.f()) {
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
            int L = org.telegram.messenger.pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
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
        this.H4 = new ih(this, i7);
        this.f4 = z10;
        this.b2 = (h2Var instanceof org.telegram.ui.bn) && h2Var.isInBubbleMode();
        this.l0 = new OvershootInterpolator(0.7f);
        this.a2 = h2Var;
        this.G = true;
        this.z0 = this;
        org.telegram.messenger.ks.f(i10).c(this, org.telegram.messenger.ks.T0);
        org.telegram.messenger.ks.f(i10).c(this, org.telegram.messenger.ks.Y4);
        org.telegram.messenger.ks.f(i10).c(this, org.telegram.messenger.ks.h5);
        org.telegram.messenger.ks.f(i10).c(this, org.telegram.messenger.ks.F1);
        arrayList.add(rect);
        fi fiVar = new fi(this, context);
        this.p3 = fiVar;
        fiVar.setDelegate(new gi(this));
        this.b = fiVar;
        fiVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        v7 v7Var = new v7(this, context, i6Var, 1);
        this.V2 = v7Var;
        v7Var.d1 = true;
        v7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        v7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i12 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.l(v7Var, 1, i12, i6Var);
        int i13 = org.telegram.ui.ActionBar.n6.I5;
        org.telegram.ui.ActionBar.u6.l(v7Var, 3, i13, i6Var);
        org.telegram.ui.ActionBar.u6.l(v7Var, 5, i12, i6Var);
        v7Var.setOccupyStatusBar(true);
        v7Var.setAlpha(0.0f);
        v7Var.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 15));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i12, this.J0), false, i6Var);
        this.Y2 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(R.drawable.ic_ab_other);
        r0Var2.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        r0Var2.setVisibility(4);
        r0Var2.setAlpha(0.0f);
        r0Var2.setScaleX(0.6f);
        r0Var2.setScaleY(0.6f);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setDelegate(new bh(this, 10));
        r0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(r0Var2, h02, null, M, i6Var);
        final int i14 = 5;
        r0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i14) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var3 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var3.getWidth() / 2.0f) + r0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i12, this.J0), false, i6Var);
        this.a3 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        hi.v vVar = new hi.v();
        this.Z2 = vVar;
        r0Var3.setIcon(vVar);
        r0Var3.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        r0Var3.setVisibility(8);
        r0Var3.setAlpha(0.0f);
        r0Var3.setScaleX(0.6f);
        r0Var3.setScaleY(0.6f);
        r0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        final int i15 = 6;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i13);
        r0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(r0Var3, h03, null, M2, i6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i15) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
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
        org.telegram.ui.ActionBar.u6.U(jVar4, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        jVar4.setText(org.telegram.messenger.gd.M0(2131751742, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        final int i16 = 7;
        jVar4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i16) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        c8.ra.a(jVar4);
        this.d3 = jVar4;
        M1();
        if (h2Var != null) {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            r0Var = r0Var3;
            jVar2 = jVar4;
            org.telegram.ui.ActionBar.r0 r0Var4 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i12, this.J0), false, i6Var);
            this.c3 = r0Var4;
            r0Var4.setLongClickEnabled(false);
            r0Var4.setIcon(R.drawable.outline_header_search);
            r0Var4.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
            r0Var4.setVisibility(4);
            z13 = false;
            r0Var4.setAlpha(0.0f);
            r0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, this.J0), 6, -1);
            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i13);
            r0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.u6.j(r0Var4, h04, null, M3, i6Var);
            r0Var4.setOnClickListener(new fi.v1(5, this, z11));
        } else {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            z13 = false;
            r0Var = r0Var3;
            jVar2 = jVar4;
        }
        org.telegram.ui.ActionBar.r0 r0Var5 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i12, this.J0), false, i6Var);
        this.i3 = r0Var5;
        r0Var5.setLongClickEnabled(false);
        r0Var5.setIcon(R.drawable.ic_ab_other);
        r0Var5.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        final int i17 = 8;
        r0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, this.J0), 3, -1);
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i13);
        r0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(r0Var5, h05, null, M4, i6Var);
        final int i18 = 2;
        r0Var5.e(1, R.drawable.msg_addbot, org.telegram.messenger.gd.M0(2131744642, null)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        final si siVar = this.b;
                        vh vhVar = siVar.C2;
                        if (vhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(siVar.getContext(), i6Var);
                            m0Var.x1(vhVar.getText());
                            final int i19 = 0;
                            m0Var.f2 = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.jh
                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i19) {
                                        case 0:
                                            vh vhVar2 = siVar.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            xh xhVar = siVar.N2;
                                            xhVar.setText(charSequence);
                                            xhVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            m0Var.v1(siVar.U1, siVar.F3 != null, new kh(siVar, 0));
                            m0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final si siVar2 = this.b;
                        xh xhVar = siVar2.N2;
                        if (xhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(siVar2.getContext(), i6Var);
                            m0Var2.x1(xhVar.getText());
                            final int i20 = 1;
                            m0Var2.f2 = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.jh
                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            vh vhVar2 = siVar2.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            xh xhVar2 = siVar2.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            m0Var2.v1(siVar2.U1, siVar2.F3 != null, new kh(siVar2, 1));
                            m0Var2.show();
                            break;
                        }
                        break;
                    default:
                        si siVar3 = this.b;
                        siVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar3.a2;
                        p12.I2(null, h2Var2, i6Var);
                        PhotoViewer.p1().J2(siVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i21 = siVar3.Q3;
                        boolean z14 = siVar3.R3;
                        p13.h = i21;
                        p13.n = z14;
                        if (!siVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(h2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(siVar3.c.findFocus());
                        }
                        File w10 = hi.d7.w(siVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i22 = point.x;
                        int i23 = point.y;
                        if (i22 > 1080 || i23 > 1080) {
                            float min = Math.min(i22, i23) / 1080.0f;
                            i22 = (int) (i22 * min);
                            i23 = (int) (i23 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i22, i23, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new ji(siVar3, efVar), h2Var2 instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) h2Var2 : null);
                        if (siVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, siVar3.E1);
                            break;
                        }
                        break;
                }
            }
        });
        r0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        r0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        r0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i17) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        final int i19 = 0;
        sh shVar = new sh(this, context, i19);
        this.g3 = shVar;
        shVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i19) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        shVar.setAlpha(0.0f);
        shVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.h3 = textView;
        org.telegram.messenger.f3.l(textView, i12, i6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.k3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.x(imageView, mutate, i12, i6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ma.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        shVar.addView(linearLayout, c8.ma.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.l3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.u6.x(imageView2, mutate2, i12, i6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ma.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.m3 = textView2;
        org.telegram.messenger.f3.l(textView2, i12, i6Var, 1, 16.0f);
        org.telegram.messenger.f3.k(textView2, 19, "AttachMediaPreview", 2131753956);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ma.r(-2, -2, 16));
        shVar.addView(linearLayout2, c8.ma.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, i6Var);
        this.e2 = chatAttachAlertPhotoLayout;
        kiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.w2 = chatAttachAlertPhotoLayout;
        this.U2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, c8.ma.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.t3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.b.addView(fVar3, c8.ma.g());
        this.b.addView(shVar, c8.ma.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.k0 k0Var = new ai.k0(context, 15);
        this.M2 = k0Var;
        this.b.addView(k0Var, c8.ma.e(-1, -2, 55));
        this.b.addView(v7Var, c8.ma.c(-2.0f, -1));
        this.b.addView(r0Var2, c8.ma.e(48, 48, 53));
        this.b.addView(r0Var, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var6 = this.c3;
        if (r0Var6 != null) {
            this.b.addView(r0Var6, c8.ma.e(48, 48, 53));
        }
        shVar.addView(r0Var5, c8.ma.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(jVar2, c8.ma.e(-2, 48, 53));
        sh shVar2 = new sh(this, context, 1);
        this.v3 = shVar2;
        th thVar = new th(context, 0);
        this.w3 = thVar;
        thVar.setClipChildren(true);
        thVar.setClipToPadding(false);
        pi piVar = new pi(this, context);
        this.y3 = piVar;
        thVar.setAdapter(piVar);
        v4.c0 c0Var = new v4.c0(0, false);
        this.x3 = c0Var;
        thVar.setLayoutManager(c0Var);
        thVar.setVerticalScrollBarEnabled(false);
        thVar.setHorizontalScrollBarEnabled(false);
        thVar.setItemAnimator(null);
        thVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.u6.l(thVar, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        thVar.z2 = true;
        thVar.setOverScrollMode(2);
        dh.c cVar5 = this.F4;
        ri.q qVar = this.Y0;
        cVar5.j = qVar;
        this.G4.j = qVar;
        cVar4.j = qVar;
        uh uhVar = new uh(this, context, 0);
        this.u3 = uhVar;
        dh.d dVar = new dh.d(cVar4.c(uhVar, null, false));
        this.W1 = dVar;
        if (org.telegram.messenger.bz.f()) {
            org.telegram.messenger.pc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.b.addView(uhVar, c8.ma.g());
        fh.g c10 = this.F4.c(shVar2, c8.i0.g(i6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        shVar2.setBackground(c10);
        thVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        thVar.setClipToOutline(true);
        int L3 = org.telegram.messenger.g0.L(11.0f);
        float L4 = org.telegram.messenger.g0.L(28.0f);
        bg.q0 q0Var = bg.u0.a;
        thVar.setOutlineProvider(new bg.s0(L3, L4));
        thVar.setImportantForAccessibility(1);
        shVar2.addView(thVar, c8.ma.g());
        this.b.addView(shVar2, c8.ma.e(-1, 70, 81));
        thVar.setOnItemClickListener(new fi.g4(9, this, i6Var));
        thVar.setOnItemLongClickListener(new bh(this, 3));
        n6 n6Var = new n6(context, true, false, true);
        this.C3 = n6Var;
        n6Var.setVisibility(8);
        n6Var.setAlpha(0.0f);
        n6Var.setGravity(17);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int L5 = org.telegram.messenger.g0.L(16.0f);
        n6Var.setPadding(L5, 0, L5, 0);
        n6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        final int i20 = 1;
        n6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i20) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        this.b.addView(n6Var, c8.ma.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, c8.ma.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.D2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i21 = org.telegram.ui.ActionBar.n6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView3, i21, i6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i22 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i22) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        sh shVar3 = new sh(this, context, i22);
        this.B2 = shVar3;
        kg.j jVar5 = new kg.j(this, context);
        this.A2 = jVar5;
        shVar3.addView(jVar5, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        fh.g c11 = this.G4.c(fiVar, c8.i0.o(i6Var), false);
        this.y2 = c11;
        c11.T = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.R.g = 0.4f;
        c11.n();
        fh.g c12 = this.F4.c(jVar5, c8.i0.o(i6Var), false);
        this.z2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        shVar3.setWillNotDraw(false);
        shVar3.setVisibility(4);
        shVar3.setAlpha(0.0f);
        this.b.addView(shVar3, c8.ma.e(-1, -2, 83));
        shVar3.setOnTouchListener(new gi.a(14));
        n6 n6Var2 = new n6(context, false, false, false);
        this.u1 = n6Var2;
        n6Var2.setAllowCancel(true);
        n6Var2.setScaleProperty(0.6f);
        n6Var2.setVisibility(8);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i23 = org.telegram.ui.ActionBar.n6.y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i23, i6Var);
        n6Var2.setTypeface(org.telegram.messenger.g0.o());
        n6Var2.setGravity(17);
        jVar5.addView(n6Var2, c8.ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w1 = imageView4;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(context);
        this.x1 = w2Var;
        imageView4.setImageDrawable(w2Var);
        imageView4.setScaleType(scaleType);
        int i24 = org.telegram.ui.ActionBar.n6.Nl;
        org.telegram.ui.ActionBar.u6.s(imageView4, i24, i6Var, mode);
        int i25 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i25, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i25);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(imageView4, h06, null, M5, i6Var);
        jVar5.addView(imageView4, c8.ma.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.gd.M0(2131755006, null));
        c8.ra.a(imageView4);
        final int i26 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        final si siVar = this.b;
                        vh vhVar = siVar.C2;
                        if (vhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(siVar.getContext(), i6Var);
                            m0Var.x1(vhVar.getText());
                            final int i192 = 0;
                            m0Var.f2 = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.jh
                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            vh vhVar2 = siVar.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            xh xhVar2 = siVar.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            m0Var.v1(siVar.U1, siVar.F3 != null, new kh(siVar, 0));
                            m0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final si siVar2 = this.b;
                        xh xhVar = siVar2.N2;
                        if (xhVar != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(siVar2.getContext(), i6Var);
                            m0Var2.x1(xhVar.getText());
                            final int i202 = 1;
                            m0Var2.f2 = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.jh
                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            vh vhVar2 = siVar2.C2;
                                            vhVar2.setText(charSequence);
                                            vhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            xh xhVar2 = siVar2.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            m0Var2.v1(siVar2.U1, siVar2.F3 != null, new kh(siVar2, 1));
                            m0Var2.show();
                            break;
                        }
                        break;
                    default:
                        si siVar3 = this.b;
                        siVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar3.a2;
                        p12.I2(null, h2Var2, i6Var);
                        PhotoViewer.p1().J2(siVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i212 = siVar3.Q3;
                        boolean z14 = siVar3.R3;
                        p13.h = i212;
                        p13.n = z14;
                        if (!siVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(h2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(siVar3.c.findFocus());
                        }
                        File w10 = hi.d7.w(siVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i222 = point.x;
                        int i232 = point.y;
                        if (i222 > 1080 || i232 > 1080) {
                            float min = Math.min(i222, i232) / 1080.0f;
                            i222 = (int) (i222 * min);
                            i232 = (int) (i232 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i222, i232, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new ji(siVar3, efVar), h2Var2 instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) h2Var2 : null);
                        if (siVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, siVar3.E1);
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
        this.F1 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).J0();
        vh vhVar = new vh(this, context, fiVar, i6Var);
        this.C2 = vhVar;
        vhVar.K = true;
        vhVar.setHint(org.telegram.messenger.gd.M0(2131754452, "AddCaption"));
        vhVar.s();
        vhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        vhVar.getEditText().addTextChangedListener(new wh(this, 0));
        jVar5.addView(vhVar, c8.ma.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        shVar3.setClipChildren(false);
        vhVar.setClipChildren(false);
        k0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        k0Var.setWillNotDraw(false);
        xh xhVar = new xh(this, context, fiVar, i6Var);
        this.N2 = xhVar;
        xhVar.K = true;
        xhVar.getEditText().addTextChangedListener(new zh(this, h2Var));
        xhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        xhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        xhVar.getEditText().setTextSize(1, 17.0f);
        xhVar.getEmojiButton().setLayoutParams(c8.ma.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        xhVar.setHint(org.telegram.messenger.gd.M0(2131754452, "AddCaption"));
        k0Var.addView(xhVar, c8.ma.e(-1, -2, org.telegram.messenger.ks.E1));
        k0Var.setAlpha(0.0f);
        k0Var.setVisibility(8);
        vhVar.addView(imageView3, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.F4.c(k0Var, c8.i0.o(i6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        k0Var.setBackground(c13);
        k0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        n6 n6Var3 = new n6(context, false, false, false);
        this.v1 = n6Var3;
        n6Var3.setScaleProperty(0.6f);
        n6Var3.setVisibility(8);
        n6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var3, i23, i6Var);
        n6Var3.setTypeface(org.telegram.messenger.g0.o());
        n6Var3.setGravity(17);
        n6Var3.setAllowCancel(true);
        k0Var.addView(n6Var3, c8.ma.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.u6.s(imageView5, org.telegram.ui.ActionBar.n6.Oe, i6Var, mode2);
        xhVar.addView(imageView5, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i27 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i27) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
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
        org.telegram.ui.ActionBar.w2 w2Var2 = new org.telegram.ui.ActionBar.w2(context);
        this.z1 = w2Var2;
        imageView6.setImageDrawable(w2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView6, i24, i6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i25, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M6 = org.telegram.ui.ActionBar.u6.M(i25);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.u6.j(imageView6, h07, null, M6, i6Var);
        k0Var.addView(imageView6, c8.ma.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.gd.M0(2131755006, null));
        c8.ra.a(imageView6);
        final int i28 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final si siVar = this.b;
                        vh vhVar2 = siVar.C2;
                        if (vhVar2 != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var = new m0(siVar.getContext(), i6Var);
                            m0Var.x1(vhVar2.getText());
                            final int i192 = 0;
                            m0Var.f2 = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.jh
                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            vh vhVar22 = siVar.C2;
                                            vhVar22.setText(charSequence);
                                            vhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            xh xhVar2 = siVar.N2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            m0Var.v1(siVar.U1, siVar.F3 != null, new kh(siVar, 0));
                            m0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final si siVar2 = this.b;
                        xh xhVar2 = siVar2.N2;
                        if (xhVar2 != null) {
                            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                            m0 m0Var2 = new m0(siVar2.getContext(), i6Var);
                            m0Var2.x1(xhVar2.getText());
                            final int i202 = 1;
                            m0Var2.f2 = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.jh
                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            vh vhVar22 = siVar2.C2;
                                            vhVar22.setText(charSequence);
                                            vhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            xh xhVar22 = siVar2.N2;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            m0Var2.v1(siVar2.U1, siVar2.F3 != null, new kh(siVar2, 1));
                            m0Var2.show();
                            break;
                        }
                        break;
                    default:
                        si siVar3 = this.b;
                        siVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar3.a2;
                        p12.I2(null, h2Var2, i6Var);
                        PhotoViewer.p1().J2(siVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i212 = siVar3.Q3;
                        boolean z14 = siVar3.R3;
                        p13.h = i212;
                        p13.n = z14;
                        if (!siVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(h2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(siVar3.c.findFocus());
                        }
                        File w10 = hi.d7.w(siVar3.H3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i222 = point.x;
                        int i232 = point.y;
                        if (i222 > 1080 || i232 > 1080) {
                            float min = Math.min(i222, i232) / 1080.0f;
                            i222 = (int) (i222 * min);
                            i232 = (int) (i232 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i222, i232, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new ji(siVar3, efVar), h2Var2 instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) h2Var2 : null);
                        if (siVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, siVar3.E1);
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
        sh shVar4 = new sh(this, context, 3);
        this.F2 = shVar4;
        shVar4.setFocusable(true);
        shVar4.setFocusableInTouchMode(true);
        shVar4.setVisibility(4);
        shVar4.setScaleX(0.2f);
        shVar4.setScaleY(0.2f);
        shVar4.setAlpha(0.0f);
        shVar4.setClipChildren(false);
        shVar4.setClipToPadding(false);
        this.b.addView(shVar4, c8.ma.e(org.telegram.messenger.ks.v1, 50, 85));
        ai aiVar = new ai(context, i6Var, this);
        this.G2 = aiVar;
        aiVar.setImportantForAccessibility(2);
        shVar4.addView(aiVar, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        aiVar.setTranslationX(this.u0);
        int L6 = org.telegram.messenger.g0.L(52.0f);
        int L7 = org.telegram.messenger.g0.L(38.0f);
        aiVar.L = L6;
        aiVar.M = L7;
        float L8 = org.telegram.messenger.g0.L(7.0f);
        float L9 = org.telegram.messenger.g0.L(6.0f);
        aiVar.P = L8;
        aiVar.Q = L9;
        aiVar.s0 = true;
        final int i29 = 4;
        aiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fh
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.t3 t3Var;
                switch (i29) {
                    case 0:
                        si siVar = this.b;
                        siVar.P1(siVar.w2 != siVar.l2);
                        break;
                    case 1:
                        si siVar2 = this.b;
                        long j3 = siVar2.U2;
                        if (j3 < 0 && (t3Var = (ki.t3) siVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = t3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        si siVar3 = this.b;
                        boolean z14 = siVar3.X1;
                        if (!z14) {
                            siVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        si siVar4 = this.b;
                        boolean z15 = siVar4.X1;
                        if (z15) {
                            siVar4.w1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.o1();
                        break;
                    case 5:
                        this.b.Y2.V(null, null);
                        break;
                    case 6:
                        si siVar5 = this.b;
                        if (siVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = siVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.r5) {
                                                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                                    if (r5Var.getPhotoEntry() == efVar) {
                                                        r5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.bz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            siVar5.O1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = siVar5.a3;
                            hi.m3 m3Var = siVar5.b3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            hi.m3 m3Var2 = new hi.m3(siVar5.getContext(), 1);
                            siVar5.b3 = m3Var2;
                            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(!V ? 2131748640 : 2131748641, null)));
                            siVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            siVar5.b3.p(1.0f, -((siVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            siVar5.b3.setTranslationY(siVar5.Y2.getTranslationY());
                            hi.m3 m3Var3 = siVar5.b3;
                            m3Var3.r0 = new mg(1, siVar5, m3Var2);
                            siVar5.b.addView(m3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            siVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        ki kiVar = this.b.w2;
                        if (kiVar != null) {
                            kiVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        aiVar.setOnLongClickListener(new org.telegram.ui.of(this, context, i6Var, h2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        uh uhVar2 = new uh(this, context, 1);
        uhVar2.setAlpha(0.0f);
        uhVar2.setScaleX(0.2f);
        uhVar2.setScaleY(0.2f);
        if (z10) {
            Q0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.F4, c8.i0.o(i6Var));
        pc0 pc0Var = new pc0(context);
        this.N1 = pc0Var;
        this.b.addView(pc0Var, c8.ma.c(-1.0f, -1));
        gh.e eVar = new gh.e(i6Var);
        eVar.e = new bh(this, 5);
        eVar.c = new bh(this, 6);
        eVar.d = new bh(this, 7);
        eVar.b = new bh(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.n = N;
        eVar.r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f = N3;
        eVar.h = N4;
        v7Var.Q(this.F4, eVar, false);
        jVar.f(1L, false);
        this.Y0.i(this.b);
        ri.q qVar2 = this.Y0;
        qVar2.a = new bh(this, 9);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
