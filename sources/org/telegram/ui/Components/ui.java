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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class ui extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.q2, te.b {
    public static final /* synthetic */ int I4 = 0;
    public boolean A1;
    public final kg.j A2;
    public final RadialProgressView A3;
    public boolean A4;
    public boolean B1;
    public final uh B2;
    public boolean B3;
    public boolean B4;
    public boolean C1;
    public final xh C2;
    public final o6 C3;
    public hi.j C4;
    public int D1;
    public final ImageView D2;
    public float D3;
    public final dh.g D4;
    public org.telegram.messenger.r10 E1;
    public final int[] E2;
    public int E3;
    public final ui.c E4;
    public int F1;
    public final uh F2;
    public org.telegram.messenger.gj F3;
    public final dh.c F4;
    public int G1;
    public final ci G2;
    public boolean G3;
    public final dh.c G4;
    public boolean H1;
    public final TextPaint H2;
    public final int H3;
    public final kh H4;
    public boolean I1;
    public final RectF I2;
    public boolean I3;
    public boolean J1;
    public final Paint J2;
    public boolean J3;
    public boolean K1;
    public AnimatorSet K2;
    public boolean K3;
    public v30 L1;
    public long L2;
    public boolean L3;
    public boolean M1;
    public final ai.l0 M2;
    public boolean M3;
    public final qc0 N1;
    public final zh N2;
    public boolean N3;
    public un O1;
    public int O2;
    public boolean O3;
    public x30 P1;
    public ft P2;
    public boolean P3;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public ck S1;
    public boolean S2;
    public boolean S3;
    public bj T1;
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
    public si X3;
    public float Y1;
    public final org.telegram.ui.ActionBar.q0 Y2;
    public fn Y3;
    public final fi Z1;
    public final hi.w Z2;
    public final int[] Z3;
    public final org.telegram.ui.ActionBar.g2 a2;
    public final org.telegram.ui.ActionBar.q0 a3;
    public int a4;
    public final boolean b2;
    public hi.l3 b3;
    public float b4;
    public df c2;
    public final org.telegram.ui.ActionBar.q0 c3;
    public float c4;
    public boolean d2;
    public final gi.j d3;
    public boolean d4;
    public final ChatAttachAlertPhotoLayout e2;
    public float e3;
    public float e4;
    public vj f2;
    public float f3;
    public final boolean f4;
    public ej g2;
    public final uh g3;
    public boolean g4;
    public tn h2;
    public final TextView h3;
    public final ArrayList h4;
    public tn i2;
    public final org.telegram.ui.ActionBar.q0 i3;
    public final Rect i4;
    public ml j2;
    public final LinearLayout j3;
    public float j4;
    public mk k2;
    public final ImageView k3;
    public boolean k4;
    public rm l2;
    public final LinearLayout l3;
    public int l4;
    public final te.a m1;
    public hj m2;
    public final TextView m3;
    public final fi m4;
    public final te.a n1;
    public kg.h0 n2;
    public float n3;
    public r1.g n4;
    public final te.a o1;
    public nk o2;
    public boolean o3;
    public AnimatorSet o4;
    public final te.a p1;
    public nk p2;
    public final hi p3;
    public int p4;
    public final te.a q1;
    public oi.o q2;
    public boolean q3;
    public int q4;
    public final te.a r1;
    public zk r2;
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
    public final o6 u1;
    public final mi[] u2;
    public final wh u3;
    public ll u4;
    public final o6 v1;
    public final LongSparseArray v2;
    public final uh v3;
    public boolean v4;
    public final ImageView w1;
    public mi w2;
    public final vh w3;
    public boolean w4;
    public final org.telegram.ui.ActionBar.v2 x1;
    public mi x2;
    public final v4.c0 x3;
    public File x4;
    public final ImageView y1;
    public final fh.g y2;
    public final ri y3;
    public double[] y4;
    public final org.telegram.ui.ActionBar.v2 z1;
    public final fh.g z2;
    public boolean z3;
    public boolean z4;

    public ui(Activity activity, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11) {
        this(activity, g2Var, z10, z11, true, null);
    }

    public static void J0(ui uiVar) {
        v7 v7Var = uiVar.V2;
        lh.f fVar = uiVar.t3;
        if (fVar == null || v7Var == null) {
            return;
        }
        mi miVar = uiVar.x2;
        if (miVar == null) {
            miVar = uiVar.w2;
        }
        int i7 = 0;
        boolean z10 = miVar != null && miVar.f();
        org.telegram.ui.ActionBar.h6 h6Var = uiVar.J0;
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        if (!z10 && v7Var.getVisibility() == 0) {
            i7 = (int) (v7Var.getAlpha() * (d ? org.telegram.messenger.ls.e4 : org.telegram.messenger.ls.q2));
        }
        fVar.setFadeTopAlpha(i7);
    }

    public static void L0(ui uiVar) {
        hi.j jVar = new hi.j(uiVar, uiVar.getContext(), uiVar.U1, LaunchActivity.Q(), uiVar.J0, 1);
        uiVar.C4 = jVar;
        jVar.p(new qf(uiVar, 1));
        ViewGroup viewGroup = uiVar.b;
        viewGroup.addView(uiVar.C4, viewGroup.indexOfChild(uiVar.B2), c8.ma.e(-1, -1, 83));
        hi.j jVar2 = uiVar.C4;
        jVar2.getAdapter().c = false;
        jVar2.getAdapter().d = false;
        jVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            jVar2.getAdapter().n0 = false;
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            jg.h1 adapter = jVar2.getAdapter();
            bnVar.j();
            TLRPC.Chat chat = bnVar.e;
            adapter.getClass();
            adapter.m0 = chat;
            jVar2.getAdapter().W(bnVar.r8);
            jVar2.getAdapter().f0 = bnVar.e != null;
        } else {
            jVar2.getAdapter().n0 = true;
            jVar2.getAdapter().W(null);
            jVar2.getAdapter().f0 = false;
        }
        jVar2.getAdapter().g0 = false;
        uiVar.K1();
    }

    public static int M0(ui uiVar) {
        mi miVar = uiVar.w2;
        tn tnVar = uiVar.h2;
        if (miVar == tnVar && tnVar.F != null) {
            return tnVar.getEmojiPadding();
        }
        tn tnVar2 = uiVar.i2;
        return (miVar != tnVar2 || tnVar2.F == null) ? uiVar.X1 ? uiVar.N2.getEmojiPadding() : uiVar.C2.getEmojiPadding() : tnVar2.getEmojiPadding();
    }

    public static boolean h1(TLRPC.User user) {
        return (user == null || org.telegram.messenger.p10.C(user) || org.telegram.messenger.p10.u(user) || org.telegram.messenger.p10.y(user) || org.telegram.messenger.p10.B(user.id) || org.telegram.messenger.p10.A(user) || org.telegram.messenger.p10.t(user) || user.id == 489000 || org.telegram.messenger.np.L2(user)) ? false : true;
    }

    public static void t1(mi miVar) {
        if (miVar == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.t6.b;
        Object tag = miVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
            return;
        }
        miVar.setTag(R.id.theme_generation, Integer.valueOf(i7));
        try {
            org.telegram.ui.ActionBar.t6.c0(miVar, true);
            miVar.d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A1(float f10) {
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0), Math.min(org.telegram.messenger.ls.e4, Math.max(0, (int) (f10 * 255.0f))));
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
            ui uiVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.h1 = (uiVar.O2 == 0 || uiVar.A1) ? false : true;
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
            org.telegram.ui.ActionBar.g2 g2Var = this.a2;
            if ((g2Var instanceof org.telegram.ui.bn) && !((org.telegram.ui.bn) g2Var).z()) {
                z11 = true;
                if (this.z4 != z11) {
                    return;
                }
                if (z11) {
                    org.telegram.messenger.np.u1(this.H3).T1().b();
                }
                this.z4 = z11;
                ImageView imageView = this.w1;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y1;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                nr nrVar = nr.h;
                scaleY.setInterpolator(nrVar).setDuration(420L).withEndAction(new ph(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(nrVar).setDuration(420L).withEndAction(new ph(this, z11, 2)).start();
                if (z11) {
                    org.telegram.ui.ActionBar.v2 v2Var = this.x1;
                    Objects.requireNonNull(v2Var);
                    imageView.postDelayed(new t0(v2Var, 1), 220L);
                    org.telegram.ui.ActionBar.v2 v2Var2 = this.z1;
                    Objects.requireNonNull(v2Var2);
                    imageView2.postDelayed(new t0(v2Var2, 1), 220L);
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
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((ki.s3) longSparseArray.get(j3)).getStartCommand())) {
            ki.s3 s3Var = (ki.s3) longSparseArray.get(j3);
            if (s3Var.I) {
                s3Var.I = false;
            }
            z12 = true;
            if (longSparseArray.get(j3) != null) {
                ((ki.s3) longSparseArray.get(j3)).K.setSwipeOffsetAnimationDisallowed(z12);
                H1((mi) longSparseArray.get(j3), -j3, z11);
                if (z10) {
                    ki.s3 s3Var2 = (ki.s3) longSparseArray.get(j3);
                    TLRPC.User c22 = org.telegram.messenger.np.u1(s3Var2.G).c2(Long.valueOf(s3Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.d0(s3Var2.G).b.bots;
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
                        if (tL_attachMenuBot.bot_id == s3Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    org.telegram.messenger.g0.h3(new ji.i(15, s3Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.hd.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753135, c22.first_name) : z13 ? org.telegram.messenger.hd.a0("BotAttachMenuShortcatAddedSide", null, 2131753134, c22.first_name) : org.telegram.messenger.hd.a0("BotAttachMenuShortcatAddedAttach", null, 2131753136, c22.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.h6 h6Var = this.J0;
            ki.s3 s3Var3 = new ki.s3(context, h6Var, this);
            s3Var3.V = new ki.j3(s3Var3, 2);
            org.telegram.ui.ActionBar.q0 a10 = s3Var3.b.V2.s().a(0, R.drawable.ic_ab_other);
            s3Var3.L = a10;
            a10.e(R.id.menu_open_bot, R.drawable.msg_bot, org.telegram.messenger.hd.N0(2131752900, null));
            org.telegram.ui.ActionBar.y0 e10 = a10.e(R.id.menu_settings, R.drawable.msg_settings, org.telegram.messenger.hd.N0(2131752885, null));
            s3Var3.M = e10;
            e10.setVisibility(8);
            a10.e(R.id.menu_reload_page, R.drawable.msg_retry, org.telegram.messenger.hd.N0(2131752899, null));
            org.telegram.ui.ActionBar.y0 e11 = a10.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
            s3Var3.N = e11;
            e11.setVisibility(8);
            a10.e(R.id.menu_tos_bot, R.drawable.menu_intro, org.telegram.messenger.hd.N0(2131752882, null));
            a10.e(R.id.menu_report_bot, R.drawable.msg_report, org.telegram.messenger.hd.N0(2131752898, null));
            a10.e(R.id.menu_delete_bot, R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131752903, null));
            ki.k2 k2Var = new ki.k2(s3Var3, context, h6Var, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, s3Var3.a), 1);
            s3Var3.n = k2Var;
            ki.j2 j2Var = new ki.j2(i7, context, s3Var3);
            s3Var3.K = j2Var;
            j2Var.addView(k2Var, c8.ma.c(-1.0f, -1));
            j2Var.setScrollListener(new ki.j3(s3Var3, 3));
            j2Var.setScrollEndListener(new ki.j3(s3Var3, 4));
            j2Var.setDelegate(new ki.l3(s3Var3));
            j2Var.setIsKeyboardVisible(new ki.l3(s3Var3));
            s3Var3.addView(j2Var, c8.ma.c(-1.0f, -1));
            ki.n3 n3Var = new ki.n3(context, h6Var);
            s3Var3.J = n3Var;
            s3Var3.addView(n3Var, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            int i11 = 5;
            k2Var.setWebViewProgressListener(new bi.r8(s3Var3, i11));
            org.telegram.messenger.ls.e().c(s3Var3, org.telegram.messenger.ls.q4);
            longSparseArray.put(j3, s3Var3);
            ((ki.s3) longSparseArray.get(j3)).setDelegate(new ai(this, s3Var3, str, j3));
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            org.telegram.messenger.gj replyingMessageObject = bnVar.a0.getReplyingMessageObject();
            ki.s3 s3Var4 = (ki.s3) longSparseArray.get(j3);
            long a11 = bnVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long j92 = bnVar.j9();
            ki.k2 k2Var2 = s3Var4.n;
            int i13 = this.H3;
            s3Var4.G = i13;
            s3Var4.x = a11;
            s3Var4.w = j3;
            s3Var4.E = i12;
            s3Var4.F = j92;
            s3Var4.H = str;
            org.telegram.ui.ActionBar.y0 y0Var = s3Var4.N;
            if (y0Var != null) {
                org.telegram.messenger.si.d0(i13);
                z12 = true;
                y0Var.setVisibility(0);
            } else {
                z12 = true;
            }
            k2Var2.setBotUser(org.telegram.messenger.np.u1(i13).c2(Long.valueOf(j3)));
            k2Var2.s(i13, j3);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = org.telegram.messenger.np.u1(i13).l1(a11);
            tL_messages_requestWebView.bot = org.telegram.messenger.np.u1(i13).q1(j3);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a11 < 0) {
                j10 = 0;
                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i13).P0(-a11);
                if (P0 != null && (peer = P0.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = org.telegram.messenger.np.u1(i13).o1(peer);
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
                org.telegram.messenger.az.C(i13);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i12;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (j92 != j10) {
                    tL_inputReplyToMessage.monoforum_peer_id = org.telegram.messenger.np.u1(i13).l1(j92);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (j92 != j10) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = org.telegram.messenger.np.u1(i13).l1(j92);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u10 = ki.s2.u(s3Var4.a, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new di.w1(s3Var4, i13, i11));
            org.telegram.messenger.ls.f(i13).c(s3Var4, org.telegram.messenger.ls.z1);
            if (longSparseArray.get(j3) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void E1(org.telegram.ui.ActionBar.g2 g2Var) {
        if ((g2Var instanceof org.telegram.ui.bn) && org.telegram.messenger.v3.V(((org.telegram.ui.bn) g2Var).e)) {
            new lc(this.p3, this.J0).f(org.telegram.messenger.np.u1(this.H3).X4, new mf(4, this, g2Var)).j();
        }
    }

    public final boolean F1(boolean z10, boolean z11) {
        float f10;
        int i7;
        mi miVar;
        v7 v7Var;
        this.n1.a(z10, true);
        uh uhVar = this.B2;
        if (z10 == (uhVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.K2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        uhVar.setTag(z10 ? 1 : null);
        xh xhVar = this.C2;
        if (xhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(xhVar.getEditText());
        }
        xhVar.k(true);
        this.N2.k(true);
        uh uhVar2 = this.v3;
        uh uhVar3 = this.F2;
        if (z10) {
            if (!this.I1) {
                uhVar.setVisibility(0);
            }
            uhVar3.setVisibility(0);
        } else if (this.Q2) {
            uhVar2.setVisibility(0);
        }
        mi miVar2 = this.w2;
        boolean z12 = (miVar2 == this.e2 || miVar2 == this.l2) && this.X1;
        v7 v7Var2 = this.V2;
        ai.l0 l0Var = this.M2;
        kg.j jVar = this.A2;
        ci ciVar = this.G2;
        if (z11) {
            this.K2 = new AnimatorSet();
            if (z12) {
                l0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(uhVar, (Property<uh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                v7Var = v7Var2;
            } else {
                jVar.setVisibility(0);
                v7Var = v7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<ai.l0, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, (Property<uh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, (Property<uh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, (Property<uh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(ciVar, (Property<ci, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(ciVar, (Property<ci, Float>) property3, z10 ? 1.0f : 0.2f));
            if (v7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(uhVar, (Property<uh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
            } else if (this.Q2) {
                arrayList.add(ObjectAnimator.ofFloat(uhVar2, (Property<uh, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.g0.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(uhVar2, (Property<uh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eh(this, 5));
                arrayList.add(ofFloat);
            }
            this.K2.playTogether(arrayList);
            this.K2.setInterpolator(new DecelerateInterpolator());
            this.K2.setDuration(180L);
            this.K2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.K2.start();
            i7 = 0;
        } else {
            uhVar.setAlpha(z10 ? 1.0f : 0.0f);
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
            uhVar3.setScaleX(z10 ? 1.0f : 0.2f);
            uhVar3.setScaleY(z10 ? 1.0f : 0.2f);
            uhVar3.setAlpha(z10 ? 1.0f : f10);
            l0Var.setVisibility((z10 && z12) ? i7 : 8);
            l0Var.setAlpha((z10 && z12) ? 1.0f : f10);
            ciVar.setScaleX(z10 ? 1.0f : 0.2f);
            ciVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (v7Var2.getTag() != null) {
                uhVar.setTranslationY(z10 ? f10 : org.telegram.messenger.g0.L(48.0f));
            } else if (this.Q2 && ((miVar = this.w2) == null || miVar.N())) {
                uhVar2.setTranslationY(z10 ? org.telegram.messenger.g0.L(84.0f) : f10);
            }
            if (!z10) {
                uhVar.setVisibility(4);
                uhVar3.setVisibility(4);
            }
            if (z12) {
                R1();
            }
        }
        if (z10) {
            i7 = Math.max(1, this.w2.getSelectedItemsCount());
        }
        ciVar.e(i7, z11);
        ciVar.i(Y0() + this.w2.getSelectedItemsCount(), this.F3 != null ? 0L : org.telegram.messenger.np.u1(this.H3).P1(c1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), ciVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            xhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void G1(mi miVar) {
        long j3 = this.U2;
        un unVar = this.O1;
        if (miVar == unVar) {
            j3 = unVar.s;
        } else if (miVar == this.e2) {
            j3 = 1;
        } else if (miVar == this.g2) {
            j3 = 3;
        } else if (miVar == this.k2) {
            j3 = 4;
        } else if (miVar == this.f2) {
            j3 = 5;
        } else if (miVar == this.j2) {
            j3 = 6;
        } else if (miVar == this.h2) {
            j3 = 9;
        } else if (miVar == this.m2) {
            j3 = 10;
        } else if (miVar == this.n2) {
            j3 = 11;
        } else if (miVar == this.i2) {
            j3 = 12;
        } else if (miVar == this.o2) {
            j3 = 14;
        } else if (miVar == this.p2) {
            j3 = 13;
        } else if (miVar == this.q2) {
            j3 = 16;
        } else if (miVar == this.r2) {
            j3 = 17;
        }
        H1(miVar, j3, true);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        mi miVar;
        if (i7 == 0) {
            V0();
            S0();
            return;
        }
        if (i7 == 2) {
            S0();
            tn tnVar = this.h2;
            if (tnVar != null && ((miVar = this.x2) == tnVar || this.w2 == tnVar)) {
                Q1(miVar == tnVar ? 1 : 0);
            }
            tn tnVar2 = this.i2;
            if (tnVar2 != null) {
                mi miVar2 = this.x2;
                if (miVar2 == tnVar2 || this.w2 == tnVar2) {
                    Q1(miVar2 != tnVar2 ? 0 : 1);
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
            ci ciVar = this.G2;
            if (ciVar != null) {
                ciVar.setEphemeralFactor(f10);
                ciVar.setSameWidthFactor(f10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean H0() {
        mi miVar = this.w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        return miVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1;
    }

    public final void H1(mi miVar, long j3, boolean z10) {
        gm gmVar;
        gm gmVar2;
        int i7;
        Float f10;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.r3 == null && this.K2 == null) {
            mi miVar2 = this.w2;
            if (miVar2 == miVar) {
                miVar2.K();
                return;
            }
            if (miVar == this.i2 && !org.telegram.messenger.k10.i(this.H3).q()) {
                new ug.y0(this.a2, 39, false).show();
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
            uh uhVar = this.v3;
            uhVar.setAlpha(1.0f);
            uhVar.setTranslationY(this.D3);
            int i12 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.v2;
                if (i12 >= longSparseArray.size()) {
                    break;
                }
                ((ki.s3) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                i12++;
            }
            this.U2 = j3;
            vh vhVar = this.w3;
            int childCount = vhVar.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = vhVar.getChildAt(i13);
                if (childAt instanceof oi) {
                    oi oiVar = (oi) childAt;
                    i10 = childCount;
                    f10 = valueOf;
                    oiVar.a.f(((long) oiVar.b) == oiVar.c.U2, true);
                } else {
                    f10 = valueOf;
                    i10 = childCount;
                    if (childAt instanceof ni) {
                        ((ni) childAt).a(true);
                    }
                }
                i13++;
                childCount = i10;
                valueOf = f10;
            }
            Float f11 = valueOf;
            int firstOffset = (this.w2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Z3[0];
            this.x2 = miVar;
            T0(miVar);
            int i14 = this.x2.j() != 0 ? 0 : 4;
            v7 v7Var = this.V2;
            v7Var.setVisibility(i14);
            if (v7Var.o0) {
                v7Var.n(true);
            }
            this.w2.u();
            mi miVar3 = this.x2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
            if (miVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.x2.I(this.w2);
            this.x2.setVisibility(0);
            if (miVar.getParent() != null) {
                this.b.removeView(this.x2);
            }
            int indexOfChild = this.b.indexOfChild(this.w2);
            if (this.x2.getParent() != this.b) {
                t1(this.x2);
                ViewGroup viewGroup = this.b;
                mi miVar4 = this.x2;
                if (miVar4 != this.j2) {
                    indexOfChild++;
                }
                viewGroup.addView(miVar4, indexOfChild, c8.ma.c(-1.0f, -1));
            }
            gh ghVar = new gh(this, 5);
            mi miVar5 = this.w2;
            boolean z11 = miVar5 instanceof rm;
            fi fiVar = this.Z1;
            if (z11 || (this.x2 instanceof rm)) {
                int max = Math.max(this.x2.getWidth(), this.w2.getWidth());
                mi miVar6 = this.x2;
                if (miVar6 instanceof rm) {
                    miVar6.setTranslationX(max);
                    mi miVar7 = this.w2;
                    if ((miVar7 instanceof ChatAttachAlertPhotoLayout) && (gmVar2 = ((ChatAttachAlertPhotoLayout) miVar7).Q) != null) {
                        gmVar2.setVisibility(4);
                    }
                } else {
                    this.w2.setTranslationX(-max);
                    mi miVar8 = this.x2;
                    if (miVar8 == chatAttachAlertPhotoLayout && (gmVar = ((ChatAttachAlertPhotoLayout) miVar8).Q) != null) {
                        gmVar.setVisibility(0);
                    }
                }
                this.x2.setAlpha(1.0f);
                this.w2.setAlpha(1.0f);
                if (z10) {
                    mi miVar9 = this.w2;
                    fiVar.getClass();
                    fiVar.a(miVar9, f11);
                    org.telegram.messenger.g0.g3(new g(this, miVar, ghVar, 6));
                } else {
                    boolean z12 = this.x2.getCurrentItemTop() <= miVar.getButtonsHideOffset();
                    this.w2.v(1.0f);
                    this.x2.v(1.0f);
                    this.w2.m(this.j4);
                    this.x2.m(this.j4);
                    this.b.invalidate();
                    this.Y0.g();
                    mi miVar10 = this.w2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    fiVar.getClass();
                    fiVar.a(miVar10, valueOf2);
                    v7Var.setTag(z12 ? 1 : null);
                    ghVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.x2.setAlpha(0.0f);
                this.x2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.w2, (Property<mi, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.w2, fiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(v7Var, (Property<v7, Float>) View.ALPHA, v7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(nr.f);
                animatorSet.addListener(new di.a4(this, firstOffset, ghVar, i11));
                this.r3 = animatorSet;
                mi miVar11 = this.w2;
                fiVar.getClass();
                fiVar.a(miVar11, f11);
                animatorSet.start();
            } else {
                miVar5.setAlpha(0.0f);
                ghVar.run();
                Q1(0);
                this.b.invalidate();
            }
            if (!this.k4 || (miVar instanceof ki.s3)) {
                i7 = 0;
            } else {
                i7 = 0;
                this.k4 = false;
                v7Var.updateColors();
                v7Var.invalidate();
                j1();
            }
            v7Var.setForcedMenuWidth((j3 == 1 || j3 == 6 || j3 == 17 || (miVar instanceof ki.s3)) ? org.telegram.messenger.g0.L(46.0f) : j3 == 4 ? org.telegram.messenger.g0.L(84.0f) : i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I() {
        return this.w2.b();
    }

    public final void I1(boolean z10, Boolean bool) {
        ui uiVar;
        if (this.h2 == null) {
            uiVar = this;
            tn tnVar = new tn(uiVar, getContext(), false, this.J0, bool);
            uiVar.h2 = tnVar;
            uiVar.u2[1] = tnVar;
            tnVar.setDelegate(new dh(this, 17));
        } else {
            uiVar = this;
        }
        H1(uiVar.h2, 9L, z10);
    }

    public final void J1(boolean z10, boolean z11) {
        mi miVar;
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
        uh uhVar = this.v3;
        org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
        if (z10) {
            if (z12) {
                q0Var.setVisibility(0);
                q0Var.setClickable(true);
            }
        } else if (this.Q2 && this.B2.getTag() == null) {
            uhVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var != null) {
            if (z10) {
                org.telegram.messenger.g0.p3(this, i0.a.h(org.telegram.ui.ActionBar.m6.w0(this.f4 ? org.telegram.ui.ActionBar.m6.kh : org.telegram.ui.ActionBar.m6.h5, this.J0)) > 0.699999988079071d);
            } else {
                org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
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
            ofFloat.addUpdateListener(new eh(this, i7));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.W2.playTogether(arrayList);
            this.W2.addListener(new org.telegram.ui.on(3, this, z10));
            this.W2.setInterpolator(nr.h);
            this.W2.setDuration(380L);
            this.W2.start();
            return;
        }
        if (z10 && this.Q2 && ((miVar = this.w2) == null || miVar.N())) {
            uhVar.setVisibility(4);
        }
        v7Var.setAlpha(z10 ? 1.0f : 0.0f);
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

    @Override // org.telegram.ui.ActionBar.w2
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
        xh xhVar = this.C2;
        xhVar.getLocationOnScreen(iArr);
        if (this.C4 != null) {
            mi miVar = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
            if ((miVar == chatAttachAlertPhotoLayout || miVar == this.l2) && this.X1) {
                ai.l0 l0Var = this.M2;
                alpha = (l0Var.getAlpha() * l0Var.getMeasuredHeight()) + (l0Var.getY() - this.C4.getTop());
            } else {
                alpha = -xhVar.getHeight();
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

    @Override // org.telegram.ui.ActionBar.w2
    public void L() {
        si siVar = this.X3;
        if (siVar != null) {
            siVar.f0(new gh(this, 4));
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
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.r3 != null) {
            return;
        }
        int selectedItemsCount = this.w2.getSelectedItemsCount();
        ci ciVar = this.G2;
        if (selectedItemsCount == 0) {
            ciVar.e(0, i7 != 0);
            F1(false, i7 != 0);
        } else {
            if (F1(true, i7 != 0) || i7 == 0) {
                ciVar.e(selectedItemsCount, i7 != 0);
                ciVar.a();
            } else {
                ciVar.e(selectedItemsCount, true);
                ciVar.a();
            }
        }
        this.w2.E(selectedItemsCount);
        R0(i7 != 0);
        if (this.w2 == this.e2 && ((((z10 = (g2Var = this.a2) instanceof org.telegram.ui.bn)) || this.O2 != 0 || this.R2) && ((selectedItemsCount == 0 && this.o3) || ((selectedItemsCount != 0 || this.O2 != 0 || this.R2) && !this.o3)))) {
            this.o3 = (selectedItemsCount == 0 && this.O2 == 0 && !this.R2) ? false : true;
            AnimatorSet animatorSet = this.X2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.X2 = null;
            }
            int i10 = this.O2;
            v7 v7Var = this.V2;
            org.telegram.ui.ActionBar.q0 q0Var = this.c3;
            if (i10 != 0 && q0Var != null && v7Var.getTag() != null && z10) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
                if (!org.telegram.messenger.v3.T(bnVar.e) || (tL_chatBannedRights = bnVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.o3;
                    uh uhVar = this.g3;
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.Y2;
                    if (!z12) {
                        if (this.O2 == 0 && !this.R2) {
                            q0Var2.setVisibility(0);
                            q0Var2.setClickable(true);
                        }
                        uhVar.setVisibility(0);
                    } else if (v7Var.getTag() != null && q0Var != null) {
                        q0Var.setVisibility(0);
                    }
                    if (i7 != 0) {
                        if (v7Var.getTag() == null && this.O2 == 0 && !this.R2) {
                            q0Var2.setAlpha(this.o3 ? 1.0f : 0.0f);
                            q0Var2.setScaleX(this.o3 ? 1.0f : 0.6f);
                            q0Var2.setScaleY(this.o3 ? 1.0f : 0.6f);
                        }
                        uhVar.setAlpha(this.o3 ? 1.0f : 0.0f);
                        if (z11) {
                            q0Var.setAlpha(this.o3 ? 0.0f : 1.0f);
                        }
                        if (this.o3 && q0Var != null) {
                            q0Var.setVisibility(4);
                        }
                    } else {
                        this.X2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (v7Var.getTag() == null && this.O2 == 0 && !this.R2) {
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.ALPHA, this.o3 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_X, this.o3 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_Y, this.o3 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(uhVar, (Property<uh, Float>) property, this.o3 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, this.o3 ? 0.0f : 1.0f));
                        }
                        this.X2.playTogether(arrayList);
                        this.X2.addListener(new y(this, 11));
                        this.X2.setDuration(180L);
                        this.X2.start();
                    }
                }
            }
            z11 = false;
            z12 = this.o3;
            uh uhVar2 = this.g3;
            org.telegram.ui.ActionBar.q0 q0Var22 = this.Y2;
            if (!z12) {
            }
            if (i7 != 0) {
            }
        }
        O1(i7 != 0);
        org.telegram.messenger.gj gjVar = this.F3;
        long P1 = (gjVar == null || gjVar.p5()) ? org.telegram.messenger.np.u1(this.H3).P1(c1()) : 0L;
        mi miVar = this.w2;
        ciVar.i(Y0() + (miVar != null ? miVar.getSelectedItemsCount() : 0), P1, true);
        xh xhVar = this.C2;
        if (xhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xhVar.getLayoutParams();
            int max = Math.max(org.telegram.messenger.g0.L(48.0f), ciVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                xhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void M(int i7) {
        super.M(i7);
        this.w2.r(i7);
    }

    public final void M1() {
        float f10;
        mi miVar = this.w2;
        boolean i7 = miVar == null ? false : miVar.i();
        gi.j jVar = this.d3;
        jVar.setEnabled(i7);
        mi miVar2 = this.w2;
        if (miVar2 != null) {
            f10 = ((miVar2.i() ? 1.0f : 0.5f) * (this.x2 == null ? 1.0f : this.Y1)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        mi miVar3 = this.x2;
        if (miVar3 != null) {
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.Y1, miVar3.i() ? 1.0f : 0.5f, f10);
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

    public final void N1(mi miVar, int i7) {
        if (miVar == null) {
            return;
        }
        dh.g gVar = this.D4;
        if (gVar != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(0.0f, i7);
        }
        int currentItemTop = miVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = miVar == this.w2 && currentItemTop <= miVar.getButtonsHideOffset();
        this.M1 = z11;
        if (miVar == this.w2) {
            J1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) miVar.getLayoutParams();
        int i10 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        mi miVar2 = this.w2;
        int i11 = miVar2 == miVar ? 0 : 1;
        if ((miVar2 instanceof rm) || (this.x2 instanceof rm)) {
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
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        return (g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).Z6();
    }

    public final void O1(boolean z10) {
        hi.w wVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout == null || (wVar = this.Z2) == null) {
            return;
        }
        boolean z11 = this.o3 && this.d2 && this.w2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0();
        boolean z12 = !ChatAttachAlertPhotoLayout.V();
        wVar.f = z12;
        if (!z10) {
            ((d6) wVar.g).a(z12);
        }
        wVar.invalidateSelf();
        org.telegram.ui.ActionBar.q0 q0Var = this.a3;
        if (z10 && this.o3) {
            q0Var.setVisibility(0);
            q0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(nr.h).withEndAction(new ph(this, z11, 0)).start();
        } else {
            q0Var.setVisibility(z11 ? 0 : 8);
            q0Var.setAlpha(z11 ? 1.0f : 0.0f);
            q0Var.setScaleX(z11 ? 1.0f : 0.6f);
            q0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    public final boolean P0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (!(g2Var instanceof org.telegram.ui.bn)) {
            return false;
        }
        return ChatActivityEnterView.N(this.H3, ((org.telegram.ui.bn) g2Var).a(), g2Var, charSequence);
    }

    public final void P1(boolean z10) {
        mi miVar = this.e2;
        if (!z10) {
            G1(miVar);
            return;
        }
        if (this.H1) {
            if (this.l2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.t1;
                if (h6Var == null) {
                    h6Var = this.J0;
                }
                rm rmVar = new rm(context, h6Var, this);
                rmVar.E = 0.0f;
                rmVar.F = 0.0f;
                rmVar.G = 0.0f;
                rmVar.H = 0.0f;
                rmVar.I = 0.0f;
                rmVar.J = 0.0f;
                rmVar.K = null;
                rmVar.L = false;
                rmVar.N = 0.0f;
                rmVar.R = false;
                rmVar.T = false;
                Point point = org.telegram.messenger.g0.q;
                rmVar.U = point.y > point.x;
                rmVar.n = h6Var;
                rmVar.f = true;
                rmVar.setWillNotDraw(false);
                ui uiVar = rmVar.b;
                org.telegram.ui.ActionBar.y s5 = uiVar.V2.s();
                TextView textView = new TextView(context);
                rmVar.y = textView;
                org.telegram.ui.ActionBar.h6 h6Var2 = rmVar.a;
                hi.u2 u2Var = new hi.u2(rmVar, context, s5, h6Var2, 2);
                uiVar.V2.addView(u2Var, 0, c8.ma.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var2);
                textView.setText(org.telegram.messenger.hd.N0(2131753955, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                u2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                di.b1 b1Var = new di.b1(rmVar, context, h6Var2, 17);
                rmVar.r = b1Var;
                b1Var.setAdapter(new org.telegram.ui.y7(rmVar, 3));
                v4.c0 c0Var = new v4.c0(1, false);
                rmVar.s = c0Var;
                b1Var.setLayoutManager(c0Var);
                b1Var.setClipChildren(false);
                b1Var.setClipToPadding(false);
                b1Var.setOverScrollMode(2);
                b1Var.setVerticalScrollBarEnabled(false);
                qm qmVar = new qm(rmVar, context);
                rmVar.w = qmVar;
                qmVar.setClipToPadding(true);
                qmVar.setClipChildren(true);
                rmVar.addView(b1Var, c8.ma.c(-1.0f, -1));
                rmVar.Q = uiVar.e2;
                qmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rmVar.Q;
                qmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                qmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                qmVar.c();
                UndoView undoView = new UndoView(context, null, false, uiVar.t1);
                rmVar.x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                rmVar.addView(undoView, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                rmVar.O = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.l2 = rmVar;
                rmVar.bringToFront();
            }
            mi miVar2 = this.w2;
            rm rmVar2 = this.l2;
            if (miVar2 != rmVar2) {
                miVar = rmVar2;
            }
            G1(miVar);
        }
    }

    public final void Q0() {
        vh vhVar = this.w3;
        if (vhVar == null) {
            return;
        }
        int childCount = vhVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            vhVar.getChildAt(i7);
        }
        boolean z10 = this.f4;
        org.telegram.ui.ActionBar.t6.U(this.h3, z10 ? org.telegram.ui.ActionBar.m6.Yg : org.telegram.ui.ActionBar.m6.j5, this.J0);
        org.telegram.ui.ActionBar.t6.U(this.m3, z10 ? org.telegram.ui.ActionBar.m6.Yg : org.telegram.ui.ActionBar.m6.j5, this.J0);
        org.telegram.ui.ActionBar.t6.U(this.d3, org.telegram.ui.ActionBar.m6.Ji, this.J0);
        int w02 = org.telegram.ui.ActionBar.m6.w0(z10 ? org.telegram.ui.ActionBar.m6.Yg : org.telegram.ui.ActionBar.m6.j5, this.J0);
        boolean z11 = (this.r4 && w02 == this.q4) ? false : true;
        this.r4 = true;
        this.q4 = w02;
        org.telegram.ui.ActionBar.q0 q0Var = this.Y2;
        if (z11) {
            q0Var.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(z10 ? org.telegram.ui.ActionBar.m6.Zg : org.telegram.ui.ActionBar.m6.I5, this.J0), q0Var.getBackground());
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        q0Var.P(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), false);
        q0Var.P(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), true);
        q0Var.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.J0));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.a3;
        if (q0Var2 != null && z11) {
            q0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.c3;
        if (q0Var3 != null) {
            if (z11) {
                q0Var3.setIconColor(w02);
            }
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(z10 ? org.telegram.ui.ActionBar.m6.Zg : org.telegram.ui.ActionBar.m6.I5, this.J0), q0Var3.getBackground());
        }
        xh xhVar = this.C2;
        org.telegram.ui.ActionBar.h6 h6Var = xhVar.N;
        tt ttVar = xhVar.a;
        int i11 = xhVar.M;
        if (i11 == 0) {
            ttVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, h6Var));
            int i12 = org.telegram.ui.ActionBar.m6.G6;
            ttVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
            ttVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        } else if (i11 == 2 || i11 == 3) {
            ttVar.setHintTextColor(-1929379841);
            ttVar.setTextColor(-1);
            ttVar.setCursorColor(-1);
            ttVar.setHandlesColor(-1);
            ttVar.setHighlightColor(822083583);
            ttVar.E = -1;
        } else {
            ttVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.t5, h6Var));
            ttVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j5, h6Var));
        }
        xhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Oe, h6Var), PorterDuff.Mode.MULTIPLY));
        ut utVar = xhVar.d;
        if (utVar != null) {
            utVar.updateColors();
        }
        org.telegram.ui.ActionBar.t6.l(vhVar, 21, org.telegram.ui.ActionBar.m6.A5, this.J0);
        int i13 = z10 ? org.telegram.ui.ActionBar.m6.Yg : org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.h6 h6Var2 = this.J0;
        v7 v7Var = this.V2;
        org.telegram.ui.ActionBar.t6.l(v7Var, 1, i13, h6Var2);
        org.telegram.ui.ActionBar.t6.l(v7Var, 3, z10 ? org.telegram.ui.ActionBar.m6.Zg : org.telegram.ui.ActionBar.m6.I5, this.J0);
        org.telegram.ui.ActionBar.t6.l(v7Var, 5, z10 ? org.telegram.ui.ActionBar.m6.Yg : org.telegram.ui.ActionBar.m6.j5, this.J0);
        int e12 = e1(false);
        org.telegram.ui.ActionBar.m6.C1(e12, this.s0);
        ui.c cVar = this.E4;
        if (cVar.b != e12) {
            cVar.a(e12);
            lh.f fVar = this.t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            wh whVar = this.u3;
            if (whVar != null) {
                whVar.invalidate();
            }
        }
        this.b.invalidate();
        int i14 = 0;
        while (true) {
            mi[] miVarArr = this.u2;
            if (i14 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i14];
            if (miVar != null) {
                miVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Q(org.telegram.ui.ActionBar.m6.h5);
            return;
        }
        this.G0 = -1;
        this.H0 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, this.J0);
        org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0), false, null);
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
        org.telegram.ui.ActionBar.q0 q0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        gi.j jVar;
        float max;
        int i11;
        float f15 = this.o1.e;
        mi miVar = i7 == 0 ? this.w2 : this.x2;
        if (miVar == null || miVar.getVisibility() != 0) {
            return;
        }
        int d12 = d1(i7);
        if (miVar == this.h2 || miVar == this.i2) {
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
        uh uhVar = this.g3;
        float L = alpha != 0.0f ? 0.0f : org.telegram.messenger.g0.L((1.0f - uhVar.getAlpha()) * 26.0f);
        boolean z10 = this.o3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.Y2;
        ai.l0 l0Var = this.M2;
        if (z10 && this.O2 == 0 && !this.R2) {
            q0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37), ((d12 - org.telegram.messenger.g0.L((i10 * f15) + 37.0f)) + L) - (l0Var.getAlpha() * l0Var.getMeasuredHeight())) + this.j4);
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
            mi miVar2 = this.x2;
            if (miVar2 != null && this.w2 != null) {
                f10 = Math.min(miVar2.getTranslationY(), this.w2.getTranslationY());
            } else if (miVar2 != null) {
                f10 = miVar2.getTranslationY();
            }
            q0Var = this.c3;
            if (q0Var != null) {
                q0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.j4);
            }
            float L2 = ((((d12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.j4) + f10) - (l0Var.getAlpha() * l0Var.getMeasuredHeight());
            this.n3 = L2;
            uhVar.setTranslationY(Math.max(this.j4, L2));
            l0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.j4, (uhVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.n3 + org.telegram.messenger.g0.L(8.0f)));
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
                tn tnVar = this.h2;
                if (tnVar == this.x2) {
                    f12 = (tnVar.getTranslationY() + d1(1)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.Y1;
                } else if (tnVar == this.w2) {
                    f12 = (tnVar.getTranslationY() + d1(0)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
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
                    tn tnVar2 = this.i2;
                    if (tnVar2 == this.x2) {
                        f14 = (tnVar2.getTranslationY() + d1(1)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.Y1;
                    } else if (tnVar2 == this.w2) {
                        f14 = (tnVar2.getTranslationY() + d1(0)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
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
        float L22 = ((((d12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.j4) + f10) - (l0Var.getAlpha() * l0Var.getMeasuredHeight());
        this.n3 = L22;
        uhVar.setTranslationY(Math.max(this.j4, L22));
        l0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.j4, (uhVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.n3 + org.telegram.messenger.g0.L(8.0f)));
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
    
        if (org.telegram.messenger.gj.c3(r0.k) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var == null || !(g2Var instanceof org.telegram.ui.bn)) {
            return;
        }
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
        yt ytVar = this.X1 ? this.N2 : this.C2;
        String obj = ytVar != null ? ytVar.getText().toString() : null;
        if (this.F3 == null) {
            mi miVar = this.w2;
            z11 = true;
            if (miVar != null) {
            }
            if (bg.x.g(this.H3).e(obj, bnVar.v8) <= 0) {
                org.telegram.messenger.gj gjVar = bnVar.F5;
                if (gjVar != null) {
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
        ai.l0 l0Var = this.M2;
        l0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        if (chatAttachAlertPhotoLayout != null) {
            zl zlVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.Y();
            if (zlVar != null && zlVar.getFastScroll() != null) {
                jj0 fastScroll = zlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.X1) {
                    i7 = (int) (l0Var.getAlpha() * l0Var.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i7;
                zlVar.getFastScroll().invalidate();
            }
        }
        K1();
        V0();
    }

    public final void S0() {
        float f10 = this.n1.e;
        this.u3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.o1.e))), 1.0f - ((1.0f - this.m1.e) * f10)));
    }

    public final void T0(mi miVar) {
        boolean e10 = miVar.e();
        lh.f fVar = this.t3;
        if (fVar != null) {
            fVar.setFadeHeightBottom(e10 ? 0 : org.telegram.messenger.g0.L(48.0f));
        }
        wh whVar = this.u3;
        if (whVar != null) {
            whVar.setVisibility(e10 ? 4 : 0);
        }
    }

    public final void U0() {
        c10.d(this.D2, com.google.android.gms.internal.vision.e2.D(this.p1.e, this.q1.e, a8.m7.a(this.r1.e), this.P3 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.v6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            mi[] miVarArr = this.u2;
            if (i7 >= miVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i5));
                return arrayList;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null && (themeDescriptions = miVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i7++;
        }
    }

    public final void V0() {
        ci ciVar = this.G2;
        uh uhVar = this.F2;
        ai.l0 l0Var = this.M2;
        if (l0Var == null || l0Var.getVisibility() != 0 || l0Var.getAlpha() == 0.0f) {
            uhVar.setTranslationY(this.e4);
            ciVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.m1.e;
        float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
        ciVar.setAlpha(abs * abs * abs * abs);
        uhVar.setTranslationY(org.telegram.messenger.g0.T1(this.e4, ((l0Var.getTranslationY() + l0Var.getTop()) - uhVar.getTop()) + org.telegram.messenger.g0.L(8.0f), nr.j.getInterpolation(f10)));
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
        org.telegram.ui.ActionBar.q0 q0Var = this.i3;
        if (q0Var != null) {
            this.h3.setTranslationY(0.0f);
            q0Var.setVisibility(8);
        }
    }

    public final void X0(hi.d7 d7Var) {
        String N0 = org.telegram.messenger.hd.N0(2131752110, null);
        TextView textView = this.h3;
        textView.setText(N0);
        this.Q2 = false;
        this.v3.setVisibility(8);
        this.O2 = 1;
        this.A1 = true;
        this.B1 = true;
        this.d2 = false;
        this.E1 = d7Var;
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

    public final int Y0() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (!(g2Var instanceof org.telegram.ui.bn) || (kjVar = ((org.telegram.ui.bn) g2Var).x5) == null || (ijVar = kjVar.b) == null) {
            return 0;
        }
        return ijVar.g.size();
    }

    public final TLRPC.Chat Z0() {
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        return g2Var instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) g2Var).e : org.telegram.messenger.np.u1(this.H3).O0(Long.valueOf(-this.U1));
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public final void a(boolean z10) {
        if (z10) {
            this.B4 = z10;
        }
        dismiss();
    }

    public final float a1() {
        return r0.getMeasuredHeight() - ((1.0f - this.B2.getAlpha()) * (r0.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    public final yt b1() {
        mi miVar;
        return (this.X1 && ((miVar = this.w2) == this.e2 || miVar == this.l2)) ? this.N2 : this.C2;
    }

    public final long c1() {
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        return g2Var instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) g2Var).a() : this.U1;
    }

    public final int d1(int i7) {
        mi miVar = this.x2;
        int[] iArr = this.Z3;
        if (miVar == null || !((this.w2 instanceof rm) || (miVar instanceof rm))) {
            return iArr[i7];
        }
        return org.telegram.messenger.g0.W1(this.Y1, iArr[0], iArr[1]);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ls.T0 && i7 != org.telegram.messenger.ls.Z4 && i7 != org.telegram.messenger.ls.F1) {
            if (i7 == org.telegram.messenger.ls.i5) {
                this.F1 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).J0();
            }
        } else {
            ri riVar = this.y3;
            if (riVar != null) {
                riVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        zh zhVar;
        xh xhVar;
        if (this.w2.q() || this.J) {
            return;
        }
        mi miVar = this.w2;
        zk zkVar = this.r2;
        int i7 = 1;
        int i10 = 0;
        boolean z10 = (miVar != zkVar || zkVar == null || zkVar.L || zkVar.Q0 == null) ? false : true;
        this.s2 = z10;
        if (!z10 && (xhVar = this.C2) != null) {
            org.telegram.messenger.g0.v1(xhVar.getEditText());
        }
        if (!this.s2 && (zhVar = this.N2) != null) {
            org.telegram.messenger.g0.v1(zhVar.getEditText());
        }
        this.v2.clear();
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        if (this.B4 || g2Var == null || this.w2.getSelectedItemsCount() <= 0 || this.A1) {
            int i11 = 0;
            while (true) {
                mi[] miVarArr = this.u2;
                if (i11 >= miVarArr.length) {
                    break;
                }
                mi miVar2 = miVarArr[i11];
                if (miVar2 != null && this.w2 != miVar2) {
                    miVar2.q();
                }
                i11++;
            }
            org.telegram.messenger.g0.s3(this, i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0), 0), true, new dh(this, 11));
            if (g2Var != null) {
                org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), this.J0);
        String N0 = org.telegram.messenger.hd.N0(2131751387, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131751388, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751394, null), new dh(this, i7));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        t1Var.setOnCancelListener(new jh(this, i10));
        t1Var.O = new z0(this, 3);
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, this.J0);
        }
    }

    public final int e1(boolean z10) {
        v7 v7Var;
        if (this.f4) {
            return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.kh, this.J0);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
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
        return i0.a.f(a10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0), org.telegram.ui.ActionBar.m6.w0(d ? org.telegram.ui.ActionBar.m6.a7 : org.telegram.ui.ActionBar.m6.i5, this.J0));
    }

    @Override // org.telegram.ui.ActionBar.w2
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
        ui uiVar;
        gm gmVar;
        org.telegram.messenger.ve veVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        mi miVar;
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
        uh uhVar = this.v3;
        uhVar.setAlpha(1.0f);
        uhVar.setTranslationY(0.0f);
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.v2;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((ki.s3) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
            i10++;
        }
        int i11 = this.O2;
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (i11 != 2) {
            if (g2Var instanceof org.telegram.ui.bn) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
                chat = bnVar.e;
                user = bnVar.j();
            } else {
                long j3 = this.U1;
                int i12 = this.H3;
                if (j3 >= 0) {
                    user = org.telegram.messenger.np.u1(i12).c2(Long.valueOf(this.U1));
                    chat = null;
                } else if (j3 < 0) {
                    chat = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(-this.U1));
                    user = null;
                }
            }
            z10 = g2Var instanceof org.telegram.ui.bn;
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
                    this.M3 = org.telegram.messenger.p10.u(user) || org.telegram.messenger.p10.C(user);
                    this.N3 = !z10 || ((org.telegram.ui.bn) g2Var).h == null;
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
            xh xhVar = this.C2;
            if (z10 || this.O2 == 2) {
                xhVar.setVisibility(this.R1 ? 0 : 4);
            }
            boolean z11 = this.K3;
            boolean z12 = this.J3;
            boolean z13 = this.I3;
            chatAttachAlertPhotoLayout = this.e2;
            uiVar = chatAttachAlertPhotoLayout.b;
            vy vyVar = chatAttachAlertPhotoLayout.I;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z11;
            chatAttachAlertPhotoLayout.y0 = z12;
            chatAttachAlertPhotoLayout.A0 = z13;
            gmVar = chatAttachAlertPhotoLayout.Q;
            if (gmVar != null) {
                gmVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.Q.setEnabled(chatAttachAlertPhotoLayout.w0);
            }
            if (!((uiVar.a2 instanceof org.telegram.ui.bn) && uiVar.Z0() == null) && uiVar.O2 == 0) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
                if (chatAttachAlertPhotoLayout.w0) {
                    vyVar.setText(org.telegram.messenger.hd.N0(2131747987, null));
                    vyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat Z0 = uiVar.Z0();
                    vyVar.a(R.raw.media_forbidden, org.telegram.messenger.ls.g2, org.telegram.messenger.ls.g2);
                    if (org.telegram.messenger.v3.P(7, Z0)) {
                        vyVar.setText(org.telegram.messenger.hd.N0(2131749367, null));
                    } else if (org.telegram.messenger.g0.D1(Z0.banned_rights)) {
                        vyVar.setText(org.telegram.messenger.hd.a0("AttachMediaRestrictedForever", null, 2131753952, new Object[0]));
                    } else {
                        vyVar.setText(org.telegram.messenger.hd.a0("AttachMediaRestricted", null, 2131753953, org.telegram.messenger.hd.v(Z0.banned_rights.until_date)));
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
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.hd.N0(2131752226, null));
            veVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = veVar;
            if (veVar != null) {
                chatAttachAlertPhotoLayout.Y0 = false;
                if (vyVar != null) {
                    vyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            xhVar.k(true);
            this.N2.k(true);
            this.s3 = false;
            A0(false);
            if (!this.J1 || this.K1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.j2 == null) {
                    ml mlVar = new ml(this, getContext(), this.J0, (this.C1 || this.K1 || this.P3) ? false : true);
                    this.j2 = mlVar;
                    this.u2[5] = mlVar;
                    ll llVar = this.u4;
                    if (llVar != null) {
                        mlVar.setDelegate(llVar);
                    } else {
                        mlVar.setDelegate(new dh(this, i7));
                    }
                }
                this.U2 = 5L;
                miVar = this.j2;
            } else if (this.I1) {
                s1(false);
                miVar = this.k2;
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
                            q1(false);
                            miVar = this.g2;
                            this.U2 = 3L;
                        } else if (this.F3.U2()) {
                            s1(false);
                            miVar = this.k2;
                            this.U2 = 4L;
                        } else {
                            this.U2 = 1L;
                        }
                    } else {
                        if (i14 == 2) {
                            q1(false);
                            miVar = this.g2;
                            this.U2 = 3L;
                        } else if (i14 == 1) {
                            s1(false);
                            miVar = this.k2;
                            this.U2 = 4L;
                        } else {
                            this.U2 = 1L;
                            miVar = chatAttachAlertPhotoLayout2;
                        }
                        this.Q2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.Q2 = this.O2 == 0 && !this.R2;
                    this.U2 = 1L;
                }
                miVar = chatAttachAlertPhotoLayout2;
            }
            uhVar.setVisibility(this.Q2 ? 0 : 8);
            if (this.w2 != miVar) {
                v7 v7Var = this.V2;
                if (v7Var.o0) {
                    v7Var.n(true);
                }
                this.b.removeView(this.w2);
                this.w2.u();
                this.w2.setVisibility(8);
                this.w2.t();
                this.w2 = miVar;
                this.r0 = true;
                if (miVar.getParent() == null) {
                    t1(this.w2);
                    this.b.addView(this.w2, 0, c8.ma.c(-1.0f, -1));
                }
                miVar.setAlpha(1.0f);
                miVar.setVisibility(0);
                miVar.I(null);
                miVar.J();
                T0(miVar);
                v7Var.setVisibility(miVar.j() != 0 ? 0 : 4);
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
        z10 = g2Var instanceof org.telegram.ui.bn;
        if (z10) {
            if (chat != null) {
            }
            if (this.B1) {
            }
            if (this.P3) {
            }
            xh xhVar2 = this.C2;
            if (z10) {
            }
            xhVar2.setVisibility(this.R1 ? 0 : 4);
            boolean z112 = this.K3;
            boolean z122 = this.J3;
            boolean z132 = this.I3;
            chatAttachAlertPhotoLayout = this.e2;
            uiVar = chatAttachAlertPhotoLayout.b;
            vy vyVar2 = chatAttachAlertPhotoLayout.I;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z112;
            chatAttachAlertPhotoLayout.y0 = z122;
            chatAttachAlertPhotoLayout.A0 = z132;
            gmVar = chatAttachAlertPhotoLayout.Q;
            if (gmVar != null) {
            }
            if (uiVar.a2 instanceof org.telegram.ui.bn) {
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
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.hd.N0(2131752226, null));
            veVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = veVar;
            if (veVar != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            xhVar2.k(true);
            this.N2.k(true);
            this.s3 = false;
            A0(false);
            if (this.J1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.j2 == null) {
            }
            this.U2 = 5L;
            miVar = this.j2;
            uhVar.setVisibility(this.Q2 ? 0 : 8);
            if (this.w2 != miVar) {
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
        xh xhVar22 = this.C2;
        if (z10) {
        }
        xhVar22.setVisibility(this.R1 ? 0 : 4);
        boolean z1122 = this.K3;
        boolean z1222 = this.J3;
        boolean z1322 = this.I3;
        chatAttachAlertPhotoLayout = this.e2;
        uiVar = chatAttachAlertPhotoLayout.b;
        vy vyVar22 = chatAttachAlertPhotoLayout.I;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.w0 = z14;
        chatAttachAlertPhotoLayout.x0 = z1122;
        chatAttachAlertPhotoLayout.y0 = z1222;
        chatAttachAlertPhotoLayout.A0 = z1322;
        gmVar = chatAttachAlertPhotoLayout.Q;
        if (gmVar != null) {
        }
        if (uiVar.a2 instanceof org.telegram.ui.bn) {
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
        chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.hd.N0(2131752226, null));
        veVar = chatAttachAlertPhotoLayout.V0;
        chatAttachAlertPhotoLayout.U0 = veVar;
        if (veVar != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        xhVar22.k(true);
        this.N2.k(true);
        this.s3 = false;
        A0(false);
        if (this.J1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.j2 == null) {
        }
        this.U2 = 5L;
        miVar = this.j2;
        uhVar.setVisibility(this.Q2 ? 0 : 8);
        if (this.w2 != miVar) {
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
        mi miVar = this.w2;
        return miVar == this.e2 || miVar == this.l2;
    }

    public final void i1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        si siVar = this.X3;
        if (siVar == null || this.s3) {
            return;
        }
        boolean g02 = siVar.g0();
        this.s3 = true;
        org.telegram.messenger.g0.h3(new di.p6(this, editTextBoldCursor, z10, 19), g02 ? 200L : 0L);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final zk zkVar = this.r2;
        if (zkVar != null && this.w2 == zkVar) {
            final gh ghVar = new gh(this, 1);
            int i7 = zkVar.n;
            org.telegram.ui.Wallet.ca caVar = zkVar.S;
            ui uiVar = zkVar.b;
            AnimatorSet animatorSet = null;
            if (!zkVar.L && (wallettransaction = zkVar.Q0) != null && zkVar.R0 == null && zkVar.S0 == null) {
                if (zkVar.T0) {
                    org.telegram.ui.Wallet.n6 n6Var = new org.telegram.ui.Wallet.n6();
                    n6Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
                    if (g2Var != null && g2Var.presentFragment(n6Var, false, true)) {
                        final int i10 = 0;
                        org.telegram.ui.Wallet.ra raVar = new org.telegram.ui.Wallet.ra(uiVar.c, uiVar.b, caVar.getDiamondView(), n6Var, zkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.rk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        if (!zkVar.L) {
                                            ghVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zkVar.L) {
                                            ghVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, uiVar);
                        zkVar.S0 = raVar;
                        animatorSet = raVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.m7 diamondView = caVar.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.a2;
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (bnVar.getCurrentAccount() == i7 && bnVar.a() == zkVar.r.id && bnVar.g4 == 0 && bnVar.getFragmentView() != null && bnVar.getFragmentView().isAttachedToWindow()) {
                                final int i11 = 1;
                                org.telegram.ui.Wallet.e7 e7Var = new org.telegram.ui.Wallet.e7(uiVar.c, uiVar.b, caVar.getDiamondView(), bnVar, zkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.rk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                if (!zkVar.L) {
                                                    ghVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!zkVar.L) {
                                                    ghVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, uiVar);
                                zkVar.R0 = e7Var;
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
        org.telegram.ui.ActionBar.m6.C1(e12, this.s0);
        ui.c cVar = this.E4;
        if (cVar.b != e12) {
            cVar.a(e12);
            lh.f fVar = this.t3;
            if (fVar != null) {
                fVar.invalidate();
            }
            wh whVar = this.u3;
            if (whVar != null) {
                whVar.invalidate();
            }
        }
        M1();
        this.b.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        f81 f81Var = chatAttachAlertPhotoLayout.m0;
        bi.e3 e3Var = chatAttachAlertPhotoLayout.k0;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        zl zlVar = chatAttachAlertPhotoLayout.r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        boolean z10 = i13 < i14;
        int i15 = org.telegram.messenger.g0.n;
        if (view == e3Var) {
            if (z10) {
                if (zlVar.getVisibility() == 0) {
                    e3Var.layout(0, org.telegram.messenger.f3.z(222.0f, i12, i15), i13, org.telegram.messenger.f3.z(96.0f, i12, i15));
                    return true;
                }
                e3Var.layout(0, org.telegram.messenger.f3.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            }
            if (zlVar.getVisibility() == 0) {
                e3Var.layout(org.telegram.messenger.f3.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            }
            e3Var.layout(org.telegram.messenger.f3.z(126.0f, i11, i15), 0, i11, i14 - i15);
            return true;
        }
        if (view == f81Var) {
            if (z10) {
                if (zlVar.getVisibility() == 0) {
                    f81Var.layout(0, org.telegram.messenger.f3.z(310.0f, i12, i15), i13, org.telegram.messenger.f3.z(260.0f, i12, i15));
                    return true;
                }
                f81Var.layout(0, org.telegram.messenger.f3.z(176.0f, i12, i15), i13, org.telegram.messenger.f3.z(126.0f, i12, i15));
                return true;
            }
            if (zlVar.getVisibility() == 0) {
                f81Var.layout(org.telegram.messenger.f3.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            }
            f81Var.layout(org.telegram.messenger.f3.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
            return true;
        }
        if (view != textView) {
            if (view != zlVar) {
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
            if (zlVar.getVisibility() == 0) {
                L3 -= org.telegram.messenger.g0.L(96.0f);
            }
            measuredWidth = L3 - i15;
        } else {
            L = i11 - org.telegram.messenger.g0.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
            textView.setRotation(-90.0f);
            if (zlVar.getVisibility() == 0) {
                L -= org.telegram.messenger.g0.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void k1() {
        int i7 = 0;
        while (true) {
            mi[] miVarArr = this.u2;
            if (i7 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null) {
                miVar.p();
            }
            i7++;
        }
        int i10 = this.H3;
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.T0);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.Z4);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.i5);
        org.telegram.messenger.ls.f(i10).n(this, org.telegram.messenger.ls.F1);
        this.Q1 = true;
        xh xhVar = this.C2;
        if (xhVar != null) {
            xhVar.o();
        }
        zh zhVar = this.N2;
        if (zhVar != null) {
            zhVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean l0(View view, int i7, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e2;
        jm jmVar = chatAttachAlertPhotoLayout.w;
        ui uiVar = chatAttachAlertPhotoLayout.b;
        zl zlVar = chatAttachAlertPhotoLayout.r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i7 < i10;
        if (view != chatAttachAlertPhotoLayout.Q) {
            bi.e3 e3Var = chatAttachAlertPhotoLayout.k0;
            if (view == e3Var) {
                if (z10) {
                    e3Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                e3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            f81 f81Var = chatAttachAlertPhotoLayout.m0;
            if (view == f81Var) {
                if (z10) {
                    f81Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                f81Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            if (view == zlVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    zlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
                    if (b0Var.o != 0) {
                        zlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        jmVar.f();
                    }
                } else {
                    zlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                    if (b0Var.o != 1) {
                        zlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        jmVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
            chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(uiVar.U() + uiVar.T() + i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void l1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String q10 = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : org.telegram.messenger.p10.q(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.d0(this.H3).b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.hd.a0("BotRemoveFromMenu", null, 2131752990, q10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String N0 = org.telegram.messenger.hd.N0(2131752989, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.hd.a0("BotRemoveInlineFromMenu", null, 2131752988, q10);
        }
        t1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, "OK"), new a3.h(this, tL_attachMenuBot, user, 25));
        i5.c.y("Cancel", 2131752577, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean m0() {
        this.e2.setTranslationX(0.0f);
        this.l3.setAlpha(0.0f);
        this.j3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.o4 = animatorSet;
        int i7 = 2;
        fi fiVar = this.m4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, fiVar, 0.0f, 400.0f));
        this.o4.setDuration(400L);
        this.o4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        fiVar.getClass();
        fiVar.a(this, valueOf);
        this.o4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new eh(this, i7));
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
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, r6.d, this.p0 ? this.q0 : 0));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        h2.f fVar = new h2.f((int[]) null);
        g gVar3 = new g(this, fVar, this.z0, 7);
        int i10 = 3;
        this.n4.a(new bi.y0(i10, this, gVar3));
        this.A0.addListener(new ah.l(26, this, gVar3));
        fVar.d();
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        A1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, i10));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(nr.f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        while (true) {
            mi[] miVarArr = this.u2;
            if (i7 >= miVarArr.length) {
                this.d4 = true;
                return;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null) {
                miVar.A();
            }
            i7++;
        }
    }

    public final void n1() {
        int i7 = 0;
        this.d4 = false;
        while (true) {
            mi[] miVarArr = this.u2;
            if (i7 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null) {
                miVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.X3.g0();
        }
        ri riVar = this.y3;
        if (riVar != null) {
            riVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void o0() {
        if (this.w2.s()) {
            dismiss();
        }
    }

    public final void o1() {
        org.telegram.messenger.gj gjVar = this.F3;
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        int i7 = this.H3;
        if (gjVar != null && gjVar.p5() && !org.telegram.messenger.v3.z(i7, 24, org.telegram.messenger.gj.B0(this.F3.k)) && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            org.telegram.messenger.lj ljVar = bnVar.y5;
            if (ljVar == null) {
                ljVar = org.telegram.messenger.lj.b(this.F3.k.suggested_post);
            }
            if (!di.y8.S(i7, ljVar.a)) {
                bnVar.Ac(ljVar);
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
            if (org.telegram.messenger.np.u1(i7).K3() || org.telegram.messenger.np.u1(i7).X4 <= this.G1) {
                return;
            }
            E1(g2Var);
            return;
        }
        if (this.F3 == null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) g2Var;
            if (bnVar2.c()) {
                c5.J(getContext(), bnVar2.a(), new dh(this, 14), this.J0);
                return;
            }
        }
        mi miVar = this.w2;
        if (miVar == this.e2 || miVar == this.l2) {
            v1(true, 0, 0, this.L2, g1());
        } else {
            if (miVar.M(true, 0, 0, this.L2, g1())) {
                return;
            }
            this.B4 = true;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
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
            v7Var.n(true);
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

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var != null) {
            org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.w2.G(i7)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
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
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (i7 == 3) {
            if (this.L3 || !O0()) {
                Activity parentActivity = g2Var != null ? g2Var.getParentActivity() : null;
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
        if (i7 == 6 && org.telegram.messenger.g0.J1(g2Var)) {
            if (this.j2 == null) {
                ml mlVar = new ml(this, getContext(), this.J0, (this.C1 || this.P3) ? false : true);
                this.j2 = mlVar;
                this.u2[5] = mlVar;
                ll llVar = this.u4;
                if (llVar != null) {
                    mlVar.setDelegate(llVar);
                } else if (g2Var instanceof org.telegram.ui.bn) {
                    mlVar.setDelegate(new dh(this, 18));
                }
            }
            G1(this.j2);
        }
    }

    public final void q1(boolean z10) {
        if (!this.L3 && z10) {
            un unVar = new un(3, getContext(), this.J0, this);
            this.O1 = unVar;
            G1(unVar);
        }
        int i7 = 1;
        if (this.g2 == null) {
            ej ejVar = new ej(getContext(), this.J0, this);
            this.g2 = ejVar;
            this.u2[3] = ejVar;
            ejVar.setupBlurredSearchField(this.F4);
            this.g2.setDelegate(new dh(this, 15));
            if (this.C1) {
                this.g2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).e;
            ej ejVar2 = this.g2;
            if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                i7 = -1;
            }
            ejVar2.setMaxSelectedFiles(i7);
        }
        if (z10) {
            G1(this.g2);
        }
    }

    public final void r1() {
        if (!this.O3) {
            un unVar = new un(5, getContext(), this.J0, this);
            this.O1 = unVar;
            G1(unVar);
        }
        if (this.f2 == null) {
            vj vjVar = new vj(getContext(), this.J0, this);
            this.f2 = vjVar;
            this.u2[2] = vjVar;
            vjVar.setupBlurredSearchField(this.F4);
            this.f2.setDelegate(new di(this));
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).e;
            this.f2.setMultipleSelectionAllowed(chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled);
        }
        G1(this.f2);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            Q0();
            dh.d dVar = this.W1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j5, this.J0);
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

    public final void s1(boolean z10) {
        if (!this.I3 && z10) {
            un unVar = new un(4, getContext(), this.J0, this);
            this.O1 = unVar;
            G1(unVar);
        }
        boolean z11 = false;
        if (this.k2 == null) {
            mk mkVar = new mk(this.I1 ? 2 : 0, getContext(), this.J0, this);
            this.k2 = mkVar;
            this.u2[4] = mkVar;
            mkVar.setDelegate(new ei(this));
        }
        int i7 = 1;
        if (this.C1) {
            this.k2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = this.a2;
            if (g2Var instanceof org.telegram.ui.bn) {
                TLRPC.Chat chat = ((org.telegram.ui.bn) g2Var).e;
                mk mkVar2 = this.k2;
                if ((chat == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled) && this.F3 == null) {
                    i7 = -1;
                }
                mkVar2.setMaxSelectedFiles(i7);
            } else {
                this.k2.setMaxSelectedFiles(this.Q3);
                mk mkVar3 = this.k2;
                if (!this.I1 && !this.R1) {
                    z11 = true;
                }
                mkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        mk mkVar4 = this.k2;
        mkVar4.e0 = this.I1;
        if (z10) {
            G1(mkVar4);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        this.G3 = false;
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            this.i0 = ((org.telegram.ui.bn) g2Var).V9();
        }
        M1();
        this.q3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0), 0);
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

    @Override // org.telegram.ui.ActionBar.w2
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
            v7Var.n(true);
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
            mi[] miVarArr = this.u2;
            if (i7 >= miVarArr.length) {
                break;
            }
            mi miVar = miVarArr[i7];
            if (miVar != null) {
                miVar.p();
                this.b.removeView(miVarArr[i7]);
                miVarArr[i7] = null;
            }
            i7++;
        }
        J1(false, false);
        super.L();
        if (this.s2) {
            this.s2 = false;
            this.t2 = 0.0f;
            org.telegram.ui.ActionBar.g2 g2Var = this.a2;
            if (g2Var == null || g2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = g2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        if (this.a2 instanceof org.telegram.ui.bn) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.w2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.hd.N0(2131754921, "AccDescrAttachButton"));
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
        org.telegram.ui.ActionBar.g2 g2Var = this.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            TLRPC.Chat chat = bnVar.e;
            if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat) && chat.megagroup) || !org.telegram.messenger.v3.T(chat))) {
                org.telegram.messenger.np.u1(this.H3).g7.edit().putBoolean("silent_" + bnVar.a(), !z10).commit();
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
        mi miVar = this.w2;
        return c5.Y(this.H3, c12, Y0() + (miVar != null ? miVar.getSelectedItemsCount() : 1), new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.qh
            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                ui uiVar = ui.this;
                uiVar.G3 = true;
                uiVar.X3.y1(7, true, z10, i7, i10, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void w1(boolean z10, boolean z11) {
        this.m1.a(z10, z11);
        yt b12 = b1();
        this.X1 = z10;
        yt b13 = b1();
        final boolean z12 = this.B2.getTag() != null;
        mi miVar = this.w2;
        final boolean z13 = this.X1 && (miVar == this.e2 || miVar == this.l2);
        ai.l0 l0Var = this.M2;
        kg.j jVar = this.A2;
        if (z11) {
            l0Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = l0Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            nr nrVar = nr.h;
            final int i7 = 0;
            duration.setInterpolator(nrVar).setUpdateListener(new eh(this, i7)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.fh
                public final /* synthetic */ ui b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            ui uiVar = this.b;
                            if (!z13 || !z12) {
                                uiVar.M2.setVisibility(8);
                            }
                            uiVar.R1();
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
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(nrVar);
            final int i10 = 1;
            interpolator.setUpdateListener(new eh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.fh
                public final /* synthetic */ ui b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ui uiVar = this.b;
                            if (!z13 || !z12) {
                                uiVar.M2.setVisibility(8);
                            }
                            uiVar.R1();
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
            l0Var.setVisibility((z13 && z12) ? 0 : 8);
            l0Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            R1();
            jVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            jVar.setTranslationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (b12 != b13) {
            b12.k(true);
            b13.setText(y5.cloneSpans(b12.getText()));
            b13.getEditText().setAllowTextEntitiesIntersection(b12.getEditText().getAllowTextEntitiesIntersection());
            if (b12.getEditText().isFocused()) {
                b13.getEditText().requestFocus();
                b13.getEditText().setSelection(b12.getEditText().getSelectionStart(), b12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.g3(new gh(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.q2
    public final boolean x() {
        return true;
    }

    public final void x1(int i7, org.telegram.messenger.gj gjVar) {
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
        L1(0);
    }

    public final void y1(float f10) {
        int i7;
        float translationY = this.b.getTranslationY() - this.t2;
        this.t2 = this.b.getHeight() * f10;
        this.b.setTranslationY(translationY);
        zk zkVar = this.r2;
        if (zkVar != null) {
            zkVar.setSendTransitionProgress(f10);
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
    public ui(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        float f10;
        TextPaint textPaint;
        te.j jVar;
        boolean z13;
        org.telegram.ui.ActionBar.q0 q0Var;
        gi.j jVar2;
        int i7 = 0;
        nr nrVar = nr.h;
        this.m1 = new te.a(0, this, nrVar, 380L, false);
        this.n1 = new te.a(1, this, nrVar, 380L, false);
        this.o1 = new te.a(2, this, nrVar, 380L, false);
        this.p1 = new te.a(3, this, nrVar, 380L, false);
        this.q1 = new te.a(4, this, nrVar, 380L, true);
        this.r1 = new te.a(5, this, nrVar, 320L, false);
        te.j jVar3 = new te.j(new dh(this, 2), nrVar, 380L);
        this.s1 = jVar3;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Y1 = 0.0f;
        this.Z1 = new fi(this, 0);
        this.d2 = false;
        mi[] miVarArr = new mi[12];
        this.u2 = miVarArr;
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
        int i10 = org.telegram.messenger.k10.t0;
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
        this.m4 = new fi(this, 1);
        this.s4 = true;
        this.t4 = false;
        this.A4 = false;
        this.B4 = false;
        this.y = true;
        ui.c cVar = new ui.c();
        this.E4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0));
        this.Y0.E.add(new ri.o(cVar, new dh(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.cz.f()) {
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
        this.H4 = new kh(this, i7);
        this.f4 = z10;
        this.b2 = (g2Var instanceof org.telegram.ui.bn) && g2Var.isInBubbleMode();
        this.l0 = new OvershootInterpolator(0.7f);
        this.a2 = g2Var;
        this.G = true;
        this.z0 = this;
        org.telegram.messenger.ls.f(i10).c(this, org.telegram.messenger.ls.T0);
        org.telegram.messenger.ls.f(i10).c(this, org.telegram.messenger.ls.Z4);
        org.telegram.messenger.ls.f(i10).c(this, org.telegram.messenger.ls.i5);
        org.telegram.messenger.ls.f(i10).c(this, org.telegram.messenger.ls.F1);
        arrayList.add(rect);
        hi hiVar = new hi(this, context);
        this.p3 = hiVar;
        hiVar.setDelegate(new ii(this));
        this.b = hiVar;
        hiVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        v7 v7Var = new v7(this, context, h6Var, 1);
        this.V2 = v7Var;
        v7Var.d1 = true;
        v7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        v7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        int i12 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.l(v7Var, 1, i12, h6Var);
        int i13 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.ActionBar.t6.l(v7Var, 3, i13, h6Var);
        org.telegram.ui.ActionBar.t6.l(v7Var, 5, i12, h6Var);
        v7Var.setOccupyStatusBar(true);
        v7Var.setAlpha(0.0f);
        v7Var.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 15));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i12, this.J0), false, h6Var);
        this.Y2 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(R.drawable.ic_ab_other);
        q0Var2.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        q0Var2.setVisibility(4);
        q0Var2.setAlpha(0.0f);
        q0Var2.setScaleX(0.6f);
        q0Var2.setScaleY(0.6f);
        q0Var2.setSubMenuOpenSide(2);
        q0Var2.setDelegate(new dh(this, 10));
        q0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(q0Var2, h02, null, M, h6Var);
        final int i14 = 5;
        q0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i14) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var3 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var3.getWidth() / 2.0f) + q0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i12, this.J0), false, h6Var);
        this.a3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        hi.w wVar = new hi.w();
        this.Z2 = wVar;
        q0Var3.setIcon(wVar);
        q0Var3.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        q0Var3.setVisibility(8);
        q0Var3.setAlpha(0.0f);
        q0Var3.setScaleX(0.6f);
        q0Var3.setScaleY(0.6f);
        q0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        final int i15 = 6;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i13);
        q0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(q0Var3, h03, null, M2, h6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i15) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
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
        org.telegram.ui.ActionBar.t6.U(jVar4, org.telegram.ui.ActionBar.m6.Ji, h6Var);
        jVar4.setText(org.telegram.messenger.hd.N0(2131751741, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        final int i16 = 7;
        jVar4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i16) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
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
        if (g2Var != null) {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            q0Var = q0Var3;
            jVar2 = jVar4;
            org.telegram.ui.ActionBar.q0 q0Var4 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i12, this.J0), false, h6Var);
            this.c3 = q0Var4;
            q0Var4.setLongClickEnabled(false);
            q0Var4.setIcon(R.drawable.outline_header_search);
            q0Var4.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
            q0Var4.setVisibility(4);
            z13 = false;
            q0Var4.setAlpha(0.0f);
            q0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, this.J0), 6, -1);
            org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i13);
            q0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.t6.j(q0Var4, h04, null, M3, h6Var);
            q0Var4.setOnClickListener(new fi.v1(5, this, z11));
        } else {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            z13 = false;
            q0Var = q0Var3;
            jVar2 = jVar4;
        }
        org.telegram.ui.ActionBar.q0 q0Var5 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i12, this.J0), false, h6Var);
        this.i3 = q0Var5;
        q0Var5.setLongClickEnabled(false);
        q0Var5.setIcon(R.drawable.ic_ab_other);
        q0Var5.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        final int i17 = 8;
        q0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, this.J0), 3, -1);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i13);
        q0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(q0Var5, h05, null, M4, h6Var);
        final int i18 = 2;
        q0Var5.e(1, R.drawable.msg_addbot, org.telegram.messenger.hd.N0(2131744634, null)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        final ui uiVar = this.b;
                        xh xhVar = uiVar.C2;
                        if (xhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var = new n0(uiVar.getContext(), h6Var);
                            n0Var.x1(xhVar.getText());
                            final int i19 = 0;
                            n0Var.f2 = new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i19) {
                                        case 0:
                                            xh xhVar2 = uiVar.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            zh zhVar = uiVar.N2;
                                            zhVar.setText(charSequence);
                                            zhVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            n0Var.v1(uiVar.U1, uiVar.F3 != null, new mh(uiVar, 0));
                            n0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ui uiVar2 = this.b;
                        zh zhVar = uiVar2.N2;
                        if (zhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var2 = new n0(uiVar2.getContext(), h6Var);
                            n0Var2.x1(zhVar.getText());
                            final int i20 = 1;
                            n0Var2.f2 = new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            xh xhVar2 = uiVar2.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            zh zhVar2 = uiVar2.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            n0Var2.v1(uiVar2.U1, uiVar2.F3 != null, new mh(uiVar2, 1));
                            n0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ui uiVar3 = this.b;
                        uiVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar3.a2;
                        p12.I2(null, g2Var2, h6Var);
                        PhotoViewer.p1().J2(uiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i21 = uiVar3.Q3;
                        boolean z14 = uiVar3.R3;
                        p13.h = i21;
                        p13.n = z14;
                        if (!uiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(uiVar3.c.findFocus());
                        }
                        File w10 = hi.c7.w(uiVar3.H3, "webp");
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
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new li(uiVar3, ffVar), g2Var2 instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) g2Var2 : null);
                        if (uiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, uiVar3.E1);
                            break;
                        }
                        break;
                }
            }
        });
        q0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        q0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        q0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i17) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
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
        uh uhVar = new uh(this, context, i19);
        this.g3 = uhVar;
        uhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i19) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar5.e2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        uhVar.setAlpha(0.0f);
        uhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.j3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.h3 = textView;
        org.telegram.messenger.f3.l(textView, i12, h6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.k3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.x(imageView, mutate, i12, h6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ma.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        uhVar.addView(linearLayout, c8.ma.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.l3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.t6.x(imageView2, mutate2, i12, h6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ma.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.m3 = textView2;
        org.telegram.messenger.f3.l(textView2, i12, h6Var, 1, 16.0f);
        org.telegram.messenger.f3.k(textView2, 19, "AttachMediaPreview", 2131753955);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ma.r(-2, -2, 16));
        uhVar.addView(linearLayout2, c8.ma.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, h6Var);
        this.e2 = chatAttachAlertPhotoLayout;
        miVarArr[0] = chatAttachAlertPhotoLayout;
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
        this.b.addView(uhVar, c8.ma.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.l0 l0Var = new ai.l0(context, 15);
        this.M2 = l0Var;
        this.b.addView(l0Var, c8.ma.e(-1, -2, 55));
        this.b.addView(v7Var, c8.ma.c(-2.0f, -1));
        this.b.addView(q0Var2, c8.ma.e(48, 48, 53));
        this.b.addView(q0Var, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var6 = this.c3;
        if (q0Var6 != null) {
            this.b.addView(q0Var6, c8.ma.e(48, 48, 53));
        }
        uhVar.addView(q0Var5, c8.ma.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(jVar2, c8.ma.e(-2, 48, 53));
        uh uhVar2 = new uh(this, context, 1);
        this.v3 = uhVar2;
        vh vhVar = new vh(context, 0);
        this.w3 = vhVar;
        vhVar.setClipChildren(true);
        vhVar.setClipToPadding(false);
        ri riVar = new ri(this, context);
        this.y3 = riVar;
        vhVar.setAdapter(riVar);
        v4.c0 c0Var = new v4.c0(0, false);
        this.x3 = c0Var;
        vhVar.setLayoutManager(c0Var);
        vhVar.setVerticalScrollBarEnabled(false);
        vhVar.setHorizontalScrollBarEnabled(false);
        vhVar.setItemAnimator(null);
        vhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.t6.l(vhVar, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        vhVar.z2 = true;
        vhVar.setOverScrollMode(2);
        dh.c cVar5 = this.F4;
        ri.q qVar = this.Y0;
        cVar5.j = qVar;
        this.G4.j = qVar;
        cVar4.j = qVar;
        wh whVar = new wh(this, context, 0);
        this.u3 = whVar;
        dh.d dVar = new dh.d(cVar4.c(whVar, null, false));
        this.W1 = dVar;
        if (org.telegram.messenger.cz.f()) {
            org.telegram.messenger.qc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.b.addView(whVar, c8.ma.g());
        fh.g c10 = this.F4.c(uhVar2, c8.i0.g(h6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        uhVar2.setBackground(c10);
        vhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        vhVar.setClipToOutline(true);
        int L3 = org.telegram.messenger.g0.L(11.0f);
        float L4 = org.telegram.messenger.g0.L(28.0f);
        bg.q0 q0Var7 = bg.u0.a;
        vhVar.setOutlineProvider(new bg.s0(L3, L4));
        vhVar.setImportantForAccessibility(1);
        uhVar2.addView(vhVar, c8.ma.g());
        this.b.addView(uhVar2, c8.ma.e(-1, 70, 81));
        vhVar.setOnItemClickListener(new fi.g4(9, this, h6Var));
        vhVar.setOnItemLongClickListener(new dh(this, 3));
        o6 o6Var = new o6(context, true, false, true);
        this.C3 = o6Var;
        o6Var.setVisibility(8);
        o6Var.setAlpha(0.0f);
        o6Var.setGravity(17);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        int L5 = org.telegram.messenger.g0.L(16.0f);
        o6Var.setPadding(L5, 0, L5, 0);
        o6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        final int i20 = 1;
        o6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i20) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        this.b.addView(o6Var, c8.ma.e(-1, 48, 83));
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
        int i21 = org.telegram.ui.ActionBar.m6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView3, i21, h6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i22 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i22) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        uh uhVar3 = new uh(this, context, i22);
        this.B2 = uhVar3;
        kg.j jVar5 = new kg.j(this, context);
        this.A2 = jVar5;
        uhVar3.addView(jVar5, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        fh.g c11 = this.G4.c(hiVar, c8.i0.o(h6Var), false);
        this.y2 = c11;
        c11.T = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.R.g = 0.4f;
        c11.n();
        fh.g c12 = this.F4.c(jVar5, c8.i0.o(h6Var), false);
        this.z2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        uhVar3.setWillNotDraw(false);
        uhVar3.setVisibility(4);
        uhVar3.setAlpha(0.0f);
        this.b.addView(uhVar3, c8.ma.e(-1, -2, 83));
        uhVar3.setOnTouchListener(new gi.a(14));
        o6 o6Var2 = new o6(context, false, false, false);
        this.u1 = o6Var2;
        o6Var2.setAllowCancel(true);
        o6Var2.setScaleProperty(0.6f);
        o6Var2.setVisibility(8);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i23 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i23, h6Var);
        o6Var2.setTypeface(org.telegram.messenger.g0.o());
        o6Var2.setGravity(17);
        jVar5.addView(o6Var2, c8.ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w1 = imageView4;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
        this.x1 = v2Var;
        imageView4.setImageDrawable(v2Var);
        imageView4.setScaleType(scaleType);
        int i24 = org.telegram.ui.ActionBar.m6.Nl;
        org.telegram.ui.ActionBar.t6.s(imageView4, i24, h6Var, mode);
        int i25 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i25, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i25);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(imageView4, h06, null, M5, h6Var);
        jVar5.addView(imageView4, c8.ma.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.N0(2131755006, null));
        c8.ra.a(imageView4);
        final int i26 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        final ui uiVar = this.b;
                        xh xhVar = uiVar.C2;
                        if (xhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var = new n0(uiVar.getContext(), h6Var);
                            n0Var.x1(xhVar.getText());
                            final int i192 = 0;
                            n0Var.f2 = new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            xh xhVar2 = uiVar.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            zh zhVar2 = uiVar.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            n0Var.v1(uiVar.U1, uiVar.F3 != null, new mh(uiVar, 0));
                            n0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ui uiVar2 = this.b;
                        zh zhVar = uiVar2.N2;
                        if (zhVar != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var2 = new n0(uiVar2.getContext(), h6Var);
                            n0Var2.x1(zhVar.getText());
                            final int i202 = 1;
                            n0Var2.f2 = new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            xh xhVar2 = uiVar2.C2;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            zh zhVar2 = uiVar2.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            n0Var2.v1(uiVar2.U1, uiVar2.F3 != null, new mh(uiVar2, 1));
                            n0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ui uiVar3 = this.b;
                        uiVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar3.a2;
                        p12.I2(null, g2Var2, h6Var);
                        PhotoViewer.p1().J2(uiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i212 = uiVar3.Q3;
                        boolean z14 = uiVar3.R3;
                        p13.h = i212;
                        p13.n = z14;
                        if (!uiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(uiVar3.c.findFocus());
                        }
                        File w10 = hi.c7.w(uiVar3.H3, "webp");
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
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new li(uiVar3, ffVar), g2Var2 instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) g2Var2 : null);
                        if (uiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, uiVar3.E1);
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
        this.F1 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).J0();
        xh xhVar = new xh(this, context, hiVar, h6Var);
        this.C2 = xhVar;
        xhVar.K = true;
        xhVar.setHint(org.telegram.messenger.hd.N0(2131754451, "AddCaption"));
        xhVar.s();
        xhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        xhVar.getEditText().addTextChangedListener(new yh(this, 0));
        jVar5.addView(xhVar, c8.ma.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        uhVar3.setClipChildren(false);
        xhVar.setClipChildren(false);
        l0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        l0Var.setWillNotDraw(false);
        zh zhVar = new zh(this, context, hiVar, h6Var);
        this.N2 = zhVar;
        zhVar.K = true;
        zhVar.getEditText().addTextChangedListener(new bi(this, g2Var));
        zhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        zhVar.getEditText().setLayoutParams(c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        zhVar.getEditText().setTextSize(1, 17.0f);
        zhVar.getEmojiButton().setLayoutParams(c8.ma.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        zhVar.setHint(org.telegram.messenger.hd.N0(2131754451, "AddCaption"));
        l0Var.addView(zhVar, c8.ma.e(-1, -2, org.telegram.messenger.ls.E1));
        l0Var.setAlpha(0.0f);
        l0Var.setVisibility(8);
        xhVar.addView(imageView3, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.F4.c(l0Var, c8.i0.o(h6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        l0Var.setBackground(c13);
        l0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        o6 o6Var3 = new o6(context, false, false, false);
        this.v1 = o6Var3;
        o6Var3.setScaleProperty(0.6f);
        o6Var3.setVisibility(8);
        o6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var3, i23, h6Var);
        o6Var3.setTypeface(org.telegram.messenger.g0.o());
        o6Var3.setGravity(17);
        o6Var3.setAllowCancel(true);
        l0Var.addView(o6Var3, c8.ma.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.t6.s(imageView5, org.telegram.ui.ActionBar.m6.Oe, h6Var, mode2);
        zhVar.addView(imageView5, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i27 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i27) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
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
        org.telegram.ui.ActionBar.v2 v2Var2 = new org.telegram.ui.ActionBar.v2(context);
        this.z1 = v2Var2;
        imageView6.setImageDrawable(v2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView6, i24, h6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i25, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M6 = org.telegram.ui.ActionBar.t6.M(i25);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.t6.j(imageView6, h07, null, M6, h6Var);
        l0Var.addView(imageView6, c8.ma.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.hd.N0(2131755006, null));
        c8.ra.a(imageView6);
        final int i28 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final ui uiVar = this.b;
                        xh xhVar2 = uiVar.C2;
                        if (xhVar2 != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var = new n0(uiVar.getContext(), h6Var);
                            n0Var.x1(xhVar2.getText());
                            final int i192 = 0;
                            n0Var.f2 = new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            xh xhVar22 = uiVar.C2;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            zh zhVar2 = uiVar.N2;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            n0Var.v1(uiVar.U1, uiVar.F3 != null, new mh(uiVar, 0));
                            n0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ui uiVar2 = this.b;
                        zh zhVar2 = uiVar2.N2;
                        if (zhVar2 != null) {
                            org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                            n0 n0Var2 = new n0(uiVar2.getContext(), h6Var);
                            n0Var2.x1(zhVar2.getText());
                            final int i202 = 1;
                            n0Var2.f2 = new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            xh xhVar22 = uiVar2.C2;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            zh zhVar22 = uiVar2.N2;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            n0Var2.v1(uiVar2.U1, uiVar2.F3 != null, new mh(uiVar2, 1));
                            n0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ui uiVar3 = this.b;
                        uiVar3.i3.V(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar3.a2;
                        p12.I2(null, g2Var2, h6Var);
                        PhotoViewer.p1().J2(uiVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i212 = uiVar3.Q3;
                        boolean z14 = uiVar3.R3;
                        p13.h = i212;
                        p13.n = z14;
                        if (!uiVar3.X3.g0()) {
                            org.telegram.messenger.g0.v1(g2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(uiVar3.c.findFocus());
                        }
                        File w10 = hi.c7.w(uiVar3.H3, "webp");
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
                        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(ffVar);
                        PhotoViewer.p1().f2(arrayList2, 0, 11, false, new li(uiVar3, ffVar), g2Var2 instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) g2Var2 : null);
                        if (uiVar3.B1) {
                            PhotoViewer.p1().S0(null, null, true, uiVar3.E1);
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
        uh uhVar4 = new uh(this, context, 3);
        this.F2 = uhVar4;
        uhVar4.setFocusable(true);
        uhVar4.setFocusableInTouchMode(true);
        uhVar4.setVisibility(4);
        uhVar4.setScaleX(0.2f);
        uhVar4.setScaleY(0.2f);
        uhVar4.setAlpha(0.0f);
        uhVar4.setClipChildren(false);
        uhVar4.setClipToPadding(false);
        this.b.addView(uhVar4, c8.ma.e(org.telegram.messenger.ls.v1, 50, 85));
        ci ciVar = new ci(context, h6Var, this);
        this.G2 = ciVar;
        ciVar.setImportantForAccessibility(2);
        uhVar4.addView(ciVar, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        ciVar.setTranslationX(this.u0);
        int L6 = org.telegram.messenger.g0.L(52.0f);
        int L7 = org.telegram.messenger.g0.L(38.0f);
        ciVar.L = L6;
        ciVar.M = L7;
        float L8 = org.telegram.messenger.g0.L(7.0f);
        float L9 = org.telegram.messenger.g0.L(6.0f);
        ciVar.P = L8;
        ciVar.Q = L9;
        ciVar.s0 = true;
        final int i29 = 4;
        ciVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ui b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s3 s3Var;
                switch (i29) {
                    case 0:
                        ui uiVar = this.b;
                        uiVar.P1(uiVar.w2 != uiVar.l2);
                        break;
                    case 1:
                        ui uiVar2 = this.b;
                        long j3 = uiVar2.U2;
                        if (j3 < 0 && (s3Var = (ki.s3) uiVar2.v2.get(-j3)) != null) {
                            org.telegram.ui.web.v0 webViewContainer = s3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ui uiVar3 = this.b;
                        boolean z14 = uiVar3.X1;
                        if (!z14) {
                            uiVar3.w1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        ui uiVar4 = this.b;
                        boolean z15 = uiVar4.X1;
                        if (z15) {
                            uiVar4.w1(!z15, true);
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
                        ui uiVar5 = this.b;
                        if (uiVar5.e2 != null) {
                            boolean V = ChatAttachAlertPhotoLayout.V();
                            boolean z16 = !V;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = uiVar5.e2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ff) {
                                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                                        if (ffVar.d()) {
                                            ffVar.O = Boolean.valueOf(V);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.s5) {
                                                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                                    if (s5Var.getPhotoEntry() == ffVar) {
                                                        s5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.cz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            uiVar5.O1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = uiVar5.a3;
                            hi.l3 l3Var = uiVar5.b3;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            hi.l3 l3Var2 = new hi.l3(uiVar5.getContext(), 1);
                            uiVar5.b3 = l3Var2;
                            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(!V ? 2131748639 : 2131748640, null)));
                            uiVar5.b3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            uiVar5.b3.p(1.0f, -((uiVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            uiVar5.b3.setTranslationY(uiVar5.Y2.getTranslationY());
                            hi.l3 l3Var3 = uiVar5.b3;
                            l3Var3.r0 = new mf(3, uiVar5, l3Var2);
                            uiVar5.b.addView(l3Var3, c8.ma.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            uiVar5.b3.x();
                            break;
                        }
                        break;
                    case 7:
                        mi miVar = this.b.w2;
                        if (miVar != null) {
                            miVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.i3.V(null, null);
                        break;
                }
            }
        });
        ciVar.setOnLongClickListener(new org.telegram.ui.of(this, context, h6Var, g2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        wh whVar2 = new wh(this, context, 1);
        whVar2.setAlpha(0.0f);
        whVar2.setScaleX(0.2f);
        whVar2.setScaleY(0.2f);
        if (z10) {
            Q0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.F4, c8.i0.o(h6Var));
        qc0 qc0Var = new qc0(context);
        this.N1 = qc0Var;
        this.b.addView(qc0Var, c8.ma.c(-1.0f, -1));
        gh.e eVar = new gh.e(h6Var);
        eVar.e = new dh(this, 5);
        eVar.c = new dh(this, 6);
        eVar.d = new dh(this, 7);
        eVar.b = new dh(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.n = N;
        eVar.r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f = N3;
        eVar.h = N4;
        v7Var.P(this.F4, eVar, false);
        jVar.f(1L, false);
        this.Y0.i(this.b);
        ri.q qVar2 = this.Y0;
        qVar2.a = new dh(this, 9);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
