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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ci extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.q2, te.b {
    public static final /* synthetic */ int H4 = 0;
    public boolean A1;
    public final ch A2;
    public boolean A3;
    public boolean A4;
    public boolean B1;
    public final fh B2;
    public final i6 B3;
    public fi.i B4;
    public int C1;
    public final ImageView C2;
    public float C3;
    public final dh.g C4;
    public org.telegram.messenger.v10 D1;
    public final int[] D2;
    public int D3;
    public final ri.c D4;
    public int E1;
    public final ch E2;
    public org.telegram.messenger.ij E3;
    public final dh.c E4;
    public int F1;
    public final kh F2;
    public boolean F3;
    public final dh.c F4;
    public boolean G1;
    public final TextPaint G2;
    public final int G3;
    public final tg G4;
    public boolean H1;
    public final RectF H2;
    public boolean H3;
    public boolean I1;
    public final Paint I2;
    public boolean I3;
    public boolean J1;
    public AnimatorSet J2;
    public boolean J3;
    public h30 K1;
    public long K2;
    public boolean K3;
    public boolean L1;
    public final bi.x5 L2;
    public boolean L3;
    public final ec0 M1;
    public final hh M2;
    public boolean M3;
    public bn N1;
    public int N2;
    public boolean N3;
    public j30 O1;
    public ps O2;
    public boolean O3;
    public boolean P1;
    public boolean P2;
    public int P3;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public lj R1;
    public boolean R2;
    public boolean R3;
    public ji S1;
    public final float S2;
    public float S3;
    public long T1;
    public long T2;
    public float T3;
    public boolean U1;
    public final q7 U2;
    public ValueAnimator U3;
    public final dh.d V1;
    public AnimatorSet V2;
    public int V3;
    public boolean W1;
    public AnimatorSet W2;
    public ai W3;
    public float X1;
    public final org.telegram.ui.ActionBar.r0 X2;
    public nm X3;
    public final nh Y1;
    public final fi.u Y2;
    public final int[] Y3;
    public final org.telegram.ui.ActionBar.f2 Z1;
    public final org.telegram.ui.ActionBar.r0 Z2;
    public int Z3;
    public final boolean a2;
    public fi.m3 a3;
    public float a4;
    public te b2;
    public final org.telegram.ui.ActionBar.r0 b3;
    public float b4;
    public boolean c2;
    public final ei.k c3;
    public boolean c4;
    public final ChatAttachAlertPhotoLayout d2;
    public float d3;
    public float d4;
    public ej e2;
    public float e3;
    public final boolean e4;
    public mi f2;
    public final ch f3;
    public boolean f4;
    public an g2;
    public final TextView g3;
    public final ArrayList g4;
    public an h2;
    public final org.telegram.ui.ActionBar.r0 h3;
    public final Rect h4;
    public vk i2;
    public final LinearLayout i3;
    public float i4;
    public uj j2;
    public final ImageView j3;
    public boolean j4;
    public am k2;
    public final LinearLayout k3;
    public int k4;
    public final te.a l1;
    public pi l2;
    public final TextView l3;
    public final nh l4;
    public final te.a m1;
    public kg.g0 m2;
    public float m3;
    public r1.g m4;
    public final te.a n1;
    public vj n2;
    public boolean n3;
    public AnimatorSet n4;
    public final te.a o1;
    public vj o2;
    public final ph o3;
    public int o4;
    public final te.a p1;
    public li.p p2;
    public boolean p3;
    public int p4;
    public final te.a q1;
    public hk q2;
    public Object q3;
    public boolean q4;
    public final te.j r1;
    public boolean r2;
    public boolean r3;
    public boolean r4;
    public org.telegram.ui.an s1;
    public float s2;
    public final lh.f s3;
    public boolean s4;
    public final i6 t1;
    public final uh[] t2;
    public final eh t3;
    public uk t4;
    public final i6 u1;
    public final LongSparseArray u2;
    public final ch u3;
    public boolean u4;
    public final ImageView v1;
    public uh v2;
    public final dh v3;
    public boolean v4;
    public final org.telegram.ui.ActionBar.v2 w1;
    public uh w2;
    public final v4.b0 w3;
    public File w4;
    public final ImageView x1;
    public final fh.g x2;
    public final zh x3;
    public double[] x4;
    public final org.telegram.ui.ActionBar.v2 y1;
    public final fh.g y2;
    public boolean y3;
    public boolean y4;
    public boolean z1;
    public final kg.j z2;
    public final RadialProgressView z3;
    public boolean z4;

    public ci(Activity activity, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10) {
        this(activity, f2Var, z9, z10, true, null);
    }

    public static void I0(ci ciVar) {
        q7 q7Var = ciVar.U2;
        lh.f fVar = ciVar.s3;
        if (fVar == null || q7Var == null) {
            return;
        }
        uh uhVar = ciVar.w2;
        if (uhVar == null) {
            uhVar = ciVar.v2;
        }
        int i7 = 0;
        boolean z9 = uhVar != null && uhVar.f();
        org.telegram.ui.ActionBar.h6 h6Var = ciVar.I0;
        boolean a10 = h6Var != null ? h6Var.a() : org.telegram.ui.ActionBar.m6.I.q();
        if (!z9 && q7Var.getVisibility() == 0) {
            i7 = (int) (q7Var.getAlpha() * (a10 ? org.telegram.messenger.qs.e4 : org.telegram.messenger.qs.q2));
        }
        fVar.setFadeTopAlpha(i7);
    }

    public static void K0(ci ciVar) {
        fi.i iVar = new fi.i(ciVar, ciVar.getContext(), ciVar.T1, LaunchActivity.Q(), ciVar.I0, 1);
        ciVar.B4 = iVar;
        iVar.p(new h9.f1(ciVar, 29));
        ViewGroup viewGroup = ciVar.b;
        viewGroup.addView(ciVar.B4, viewGroup.indexOfChild(ciVar.A2), c8.ha.e(-1, -1, 83));
        fi.i iVar2 = ciVar.B4;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            jg.i1 adapter = iVar2.getAdapter();
            cnVar.j();
            TLRPC.Chat chat = cnVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            iVar2.getAdapter().W(cnVar.p8);
            iVar2.getAdapter().e0 = cnVar.e != null;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().e0 = false;
        }
        iVar2.getAdapter().f0 = false;
        ciVar.J1();
    }

    public static int L0(ci ciVar) {
        uh uhVar = ciVar.v2;
        an anVar = ciVar.g2;
        if (uhVar == anVar && anVar.E != null) {
            return anVar.getEmojiPadding();
        }
        an anVar2 = ciVar.h2;
        return (uhVar != anVar2 || anVar2.E == null) ? ciVar.W1 ? ciVar.M2.getEmojiPadding() : ciVar.B2.getEmojiPadding() : anVar2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        return (user == null || org.telegram.messenger.t10.B(user) || org.telegram.messenger.t10.t(user) || org.telegram.messenger.t10.x(user) || org.telegram.messenger.t10.A(user.id) || org.telegram.messenger.t10.z(user) || org.telegram.messenger.t10.s(user) || user.id == 489000 || org.telegram.messenger.qp.F2(user)) ? false : true;
    }

    public static void s1(uh uhVar) {
        if (uhVar == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.t6.b;
        Object tag = uhVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
            return;
        }
        uhVar.setTag(R.id.theme_generation, Integer.valueOf(i7));
        try {
            org.telegram.ui.ActionBar.t6.c0(uhVar, true);
            uhVar.d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A1(String str) {
        this.N2 = 1;
        this.z1 = true;
        this.P2 = false;
        this.J3 = false;
        this.u3.setVisibility(8);
        this.g3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            ci ciVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (ciVar.N2 == 0 || ciVar.z1) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z9) {
        boolean z10;
        if (z9) {
            org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
            if ((f2Var instanceof org.telegram.ui.cn) && !((org.telegram.ui.cn) f2Var).z()) {
                z10 = true;
                if (this.y4 != z10) {
                    return;
                }
                if (z10) {
                    org.telegram.messenger.qp.s1(this.G3).R1().b();
                }
                this.y4 = z10;
                ImageView imageView = this.v1;
                imageView.setVisibility(0);
                ImageView imageView2 = this.x1;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f);
                wq wqVar = wq.h;
                scaleY.setInterpolator(wqVar).setDuration(420L).withEndAction(new yg(this, z10, 1)).start();
                imageView2.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(wqVar).setDuration(420L).withEndAction(new yg(this, z10, 2)).start();
                if (z10) {
                    org.telegram.ui.ActionBar.v2 v2Var = this.w1;
                    Objects.requireNonNull(v2Var);
                    imageView.postDelayed(new i0(v2Var, 1), 220L);
                    org.telegram.ui.ActionBar.v2 v2Var2 = this.y1;
                    Objects.requireNonNull(v2Var2);
                    imageView2.postDelayed(new i0(v2Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.y4 != z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0202, code lost:
    
        r12.start_param = r30;
        r12.flags |= 8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(long j3, String str, boolean z9, boolean z10) {
        int i7;
        boolean z11;
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.u2;
        int i10 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((hi.c4) longSparseArray.get(j3)).getStartCommand())) {
            hi.c4 c4Var = (hi.c4) longSparseArray.get(j3);
            if (c4Var.H) {
                c4Var.H = false;
            }
            i7 = 8;
            z11 = true;
            if (longSparseArray.get(j3) != null) {
                ((hi.c4) longSparseArray.get(j3)).J.setSwipeOffsetAnimationDisallowed(z11);
                G1((uh) longSparseArray.get(j3), -j3, z10);
                if (z9) {
                    hi.c4 c4Var2 = (hi.c4) longSparseArray.get(j3);
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(c4Var2.F).a2(Long.valueOf(c4Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(c4Var2.F).b.bots;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                        i11++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == c4Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    org.telegram.messenger.g0.i3(new ha.b(i7, c4Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.id.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753138, a22.first_name) : z12 ? org.telegram.messenger.id.a0("BotAttachMenuShortcatAddedSide", null, 2131753137, a22.first_name) : org.telegram.messenger.id.a0("BotAttachMenuShortcatAddedAttach", null, 2131753139, a22.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.h6 h6Var = this.I0;
            hi.c4 c4Var3 = new hi.c4(context, h6Var, this);
            c4Var3.U = new hi.s3(c4Var3, 2);
            org.telegram.ui.ActionBar.r0 a10 = c4Var3.b.U2.s().a(0, R.drawable.ic_ab_other);
            c4Var3.K = a10;
            a10.e(R.id.menu_open_bot, R.drawable.msg_bot, org.telegram.messenger.id.M0(2131752912, null));
            org.telegram.ui.ActionBar.z0 e10 = a10.e(R.id.menu_settings, R.drawable.msg_settings, org.telegram.messenger.id.M0(2131752897, null));
            c4Var3.L = e10;
            e10.setVisibility(8);
            a10.e(R.id.menu_reload_page, R.drawable.msg_retry, org.telegram.messenger.id.M0(2131752911, null));
            org.telegram.ui.ActionBar.z0 e11 = a10.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, org.telegram.messenger.id.M0(2131754390, null));
            c4Var3.M = e11;
            e11.setVisibility(8);
            a10.e(R.id.menu_tos_bot, R.drawable.menu_intro, org.telegram.messenger.id.M0(2131752894, null));
            a10.e(R.id.menu_report_bot, R.drawable.msg_report, org.telegram.messenger.id.M0(2131752910, null));
            a10.e(R.id.menu_delete_bot, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131752915, null));
            hi.s2 s2Var = new hi.s2(c4Var3, context, h6Var, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, c4Var3.a), 1);
            c4Var3.n = s2Var;
            hi.r2 r2Var = new hi.r2(i10, context, c4Var3);
            c4Var3.J = r2Var;
            i7 = 8;
            r2Var.addView(s2Var, c8.ha.c(-1.0f, -1));
            int i12 = 3;
            r2Var.setScrollListener(new hi.s3(c4Var3, i12));
            z11 = true;
            r2Var.setScrollEndListener(new hi.s3(c4Var3, 4));
            r2Var.setDelegate(new hi.u3(c4Var3));
            r2Var.setIsKeyboardVisible(new hi.u3(c4Var3));
            c4Var3.addView(r2Var, c8.ha.c(-1.0f, -1));
            hi.v3 v3Var = new hi.v3(context, h6Var);
            c4Var3.I = v3Var;
            c4Var3.addView(v3Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            s2Var.setWebViewProgressListener(new bi.q9(c4Var3, i12));
            org.telegram.messenger.qs.e().c(c4Var3, org.telegram.messenger.qs.n4);
            longSparseArray.put(j3, c4Var3);
            ((hi.c4) longSparseArray.get(j3)).setDelegate(new ih(this, c4Var3, str, j3));
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            org.telegram.messenger.ij replyingMessageObject = cnVar.Z.getReplyingMessageObject();
            hi.c4 c4Var4 = (hi.c4) longSparseArray.get(j3);
            long a11 = cnVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long i92 = cnVar.i9();
            hi.s2 s2Var2 = c4Var4.n;
            int i14 = this.G3;
            c4Var4.F = i14;
            c4Var4.x = a11;
            c4Var4.w = j3;
            c4Var4.D = i13;
            c4Var4.E = i92;
            c4Var4.G = str;
            org.telegram.ui.ActionBar.z0 z0Var = c4Var4.M;
            if (z0Var != null) {
                org.telegram.messenger.ui.b0(i14);
                z0Var.setVisibility(0);
            }
            s2Var2.setBotUser(org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j3)));
            s2Var2.s(i14, j3);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = org.telegram.messenger.qp.s1(i14).j1(a11);
            tL_messages_requestWebView.bot = org.telegram.messenger.qp.s1(i14).o1(j3);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a11 < 0 && (N0 = org.telegram.messenger.qp.s1(i14).N0(-a11)) != null && (peer = N0.default_send_as) != null) {
                tL_messages_requestWebView.send_as = org.telegram.messenger.qp.s1(i14).m1(peer);
                tL_messages_requestWebView.flags |= TLObject.FLAG_13;
            }
            if (i13 != 0) {
                org.telegram.messenger.gz.C(i14);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i13;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (i92 != 0) {
                    tL_inputReplyToMessage.monoforum_peer_id = org.telegram.messenger.qp.s1(i14).j1(i92);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (i92 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = org.telegram.messenger.qp.s1(i14).j1(i92);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u10 = hi.a3.u(c4Var4.a, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new bi.j2(c4Var4, i14, 5));
            org.telegram.messenger.qs.f(i14).c(c4Var4, org.telegram.messenger.qs.z1);
            if (longSparseArray.get(j3) != null) {
            }
        }
        i7 = 8;
        z11 = true;
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void D1(org.telegram.ui.ActionBar.f2 f2Var) {
        if ((f2Var instanceof org.telegram.ui.cn) && org.telegram.messenger.t3.V(((org.telegram.ui.cn) f2Var).e)) {
            new gc(this.o3, this.I0).f(org.telegram.messenger.qp.s1(this.G3).U4, new org.telegram.ui.fq(13, this, f2Var)).j();
        }
    }

    public final boolean E1(boolean z9, boolean z10) {
        float f10;
        int i7;
        uh uhVar;
        q7 q7Var;
        this.m1.a(z9, true);
        ch chVar = this.A2;
        if (z9 == (chVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        chVar.setTag(z9 ? 1 : null);
        fh fhVar = this.B2;
        if (fhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(fhVar.getEditText());
        }
        fhVar.k(true);
        this.M2.k(true);
        ch chVar2 = this.u3;
        ch chVar3 = this.E2;
        if (z9) {
            if (!this.H1) {
                chVar.setVisibility(0);
            }
            chVar3.setVisibility(0);
        } else if (this.P2) {
            chVar2.setVisibility(0);
        }
        uh uhVar2 = this.v2;
        boolean z11 = (uhVar2 == this.d2 || uhVar2 == this.k2) && this.W1;
        q7 q7Var2 = this.U2;
        bi.x5 x5Var = this.L2;
        kg.j jVar = this.z2;
        kh khVar = this.F2;
        if (z10) {
            this.J2 = new AnimatorSet();
            if (z11) {
                x5Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(chVar, (Property<ch, Float>) property, z9 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) property, (!z9 || z11) ? 0.0f : 1.0f));
            if (!z9 || z11) {
                q7Var = q7Var2;
            } else {
                jVar.setVisibility(0);
                q7Var = q7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(x5Var, (Property<bi.x5, Float>) property, (z9 && z11) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(chVar3, (Property<ch, Float>) property2, z9 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(chVar3, (Property<ch, Float>) property3, z9 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(chVar3, (Property<ch, Float>) property, z9 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(khVar, (Property<kh, Float>) property2, z9 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(khVar, (Property<kh, Float>) property3, z9 ? 1.0f : 0.2f));
            if (q7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(chVar, (Property<ch, Float>) View.TRANSLATION_Y, z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
            } else if (this.P2) {
                arrayList.add(ObjectAnimator.ofFloat(chVar2, (Property<ch, Float>) View.TRANSLATION_Y, z9 ? org.telegram.messenger.g0.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(chVar2, (Property<ch, Float>) property, z9 ? 0.0f : 1.0f));
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ng(this, 5));
                arrayList.add(ofFloat);
            }
            this.J2.playTogether(arrayList);
            this.J2.setInterpolator(new DecelerateInterpolator());
            this.J2.setDuration(180L);
            this.J2.addListener(new org.telegram.ui.ActionBar.h(this, z9, z11, 3));
            this.J2.start();
            i7 = 0;
        } else {
            chVar.setAlpha(z9 ? 1.0f : 0.0f);
            jVar.setAlpha((z9 && z11) ? 1.0f : 0.0f);
            if (!z9 || z11) {
                f10 = 0.0f;
                i7 = 0;
            } else {
                i7 = 0;
                jVar.setVisibility(0);
                f10 = 0.0f;
                jVar.setTranslationY(0.0f);
            }
            chVar3.setScaleX(z9 ? 1.0f : 0.2f);
            chVar3.setScaleY(z9 ? 1.0f : 0.2f);
            chVar3.setAlpha(z9 ? 1.0f : f10);
            x5Var.setVisibility((z9 && z11) ? i7 : 8);
            x5Var.setAlpha((z9 && z11) ? 1.0f : f10);
            khVar.setScaleX(z9 ? 1.0f : 0.2f);
            khVar.setScaleY(z9 ? 1.0f : 0.2f);
            if (q7Var2.getTag() != null) {
                chVar.setTranslationY(z9 ? f10 : org.telegram.messenger.g0.L(48.0f));
            } else if (this.P2 && ((uhVar = this.v2) == null || uhVar.M())) {
                chVar2.setTranslationY(z9 ? org.telegram.messenger.g0.L(84.0f) : f10);
            }
            if (!z9) {
                chVar.setVisibility(4);
                chVar3.setVisibility(4);
            }
            if (z11) {
                Q1();
            }
        }
        if (z9) {
            i7 = Math.max(1, this.v2.getSelectedItemsCount());
        }
        khVar.e(i7, z10);
        khVar.i(X0() + this.v2.getSelectedItemsCount(), this.E3 != null ? 0L : org.telegram.messenger.qp.s1(this.G3).N1(b1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), khVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            fhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(uh uhVar) {
        long j3 = this.T2;
        bn bnVar = this.N1;
        if (uhVar == bnVar) {
            j3 = bnVar.s;
        } else if (uhVar == this.d2) {
            j3 = 1;
        } else if (uhVar == this.f2) {
            j3 = 3;
        } else if (uhVar == this.j2) {
            j3 = 4;
        } else if (uhVar == this.e2) {
            j3 = 5;
        } else if (uhVar == this.i2) {
            j3 = 6;
        } else if (uhVar == this.g2) {
            j3 = 9;
        } else if (uhVar == this.l2) {
            j3 = 10;
        } else if (uhVar == this.m2) {
            j3 = 11;
        } else if (uhVar == this.h2) {
            j3 = 12;
        } else if (uhVar == this.n2) {
            j3 = 14;
        } else if (uhVar == this.o2) {
            j3 = 13;
        } else if (uhVar == this.p2) {
            j3 = 16;
        } else if (uhVar == this.q2) {
            j3 = 17;
        }
        G1(uhVar, j3, true);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void G1(uh uhVar, long j3, boolean z9) {
        pl plVar;
        pl plVar2;
        int i7;
        Float f10;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.q3 == null && this.J2 == null) {
            uh uhVar2 = this.v2;
            if (uhVar2 == uhVar) {
                uhVar2.J();
                return;
            }
            if (uhVar == this.h2 && !org.telegram.messenger.p10.i(this.G3).q()) {
                new ug.w0(this.Z1, 39, false).show();
                return;
            }
            int i11 = 1;
            this.p1.a(j3 == 1, z9);
            this.r1.f(Long.valueOf(j3), z9);
            this.A3 = false;
            this.y3 = false;
            this.C3 = 0.0f;
            this.B3.setVisibility(8);
            RadialProgressView radialProgressView = this.z3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ch chVar = this.u3;
            chVar.setAlpha(1.0f);
            chVar.setTranslationY(this.C3);
            int i12 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.u2;
                if (i12 >= longSparseArray.size()) {
                    break;
                }
                ((hi.c4) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                i12++;
            }
            this.T2 = j3;
            dh dhVar = this.v3;
            int childCount = dhVar.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = dhVar.getChildAt(i13);
                if (childAt instanceof wh) {
                    wh whVar = (wh) childAt;
                    i10 = childCount;
                    f10 = valueOf;
                    whVar.a.f(((long) whVar.b) == whVar.c.T2, true);
                } else {
                    f10 = valueOf;
                    i10 = childCount;
                    if (childAt instanceof vh) {
                        ((vh) childAt).a(true);
                    }
                }
                i13++;
                childCount = i10;
                valueOf = f10;
            }
            Float f11 = valueOf;
            int firstOffset = (this.v2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.Y3[0];
            this.w2 = uhVar;
            S0(uhVar);
            int i14 = this.w2.j() != 0 ? 0 : 4;
            q7 q7Var = this.U2;
            q7Var.setVisibility(i14);
            if (q7Var.n0) {
                q7Var.n(true);
            }
            this.v2.u();
            uh uhVar3 = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if (uhVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.w2.H(this.v2);
            this.w2.setVisibility(0);
            if (uhVar.getParent() != null) {
                this.b.removeView(this.w2);
            }
            int indexOfChild = this.b.indexOfChild(this.v2);
            if (this.w2.getParent() != this.b) {
                s1(this.w2);
                ViewGroup viewGroup = this.b;
                uh uhVar4 = this.w2;
                if (uhVar4 != this.i2) {
                    indexOfChild++;
                }
                viewGroup.addView(uhVar4, indexOfChild, c8.ha.c(-1.0f, -1));
            }
            pg pgVar = new pg(this, 5);
            uh uhVar5 = this.v2;
            boolean z10 = uhVar5 instanceof am;
            nh nhVar = this.Y1;
            if (z10 || (this.w2 instanceof am)) {
                int max = Math.max(this.w2.getWidth(), this.v2.getWidth());
                uh uhVar6 = this.w2;
                if (uhVar6 instanceof am) {
                    uhVar6.setTranslationX(max);
                    uh uhVar7 = this.v2;
                    if ((uhVar7 instanceof ChatAttachAlertPhotoLayout) && (plVar2 = ((ChatAttachAlertPhotoLayout) uhVar7).P) != null) {
                        plVar2.setVisibility(4);
                    }
                } else {
                    this.v2.setTranslationX(-max);
                    uh uhVar8 = this.w2;
                    if (uhVar8 == chatAttachAlertPhotoLayout && (plVar = ((ChatAttachAlertPhotoLayout) uhVar8).P) != null) {
                        plVar.setVisibility(0);
                    }
                }
                this.w2.setAlpha(1.0f);
                this.v2.setAlpha(1.0f);
                if (z9) {
                    uh uhVar9 = this.v2;
                    nhVar.getClass();
                    nhVar.a(uhVar9, f11);
                    org.telegram.messenger.g0.h3(new mg(this, uhVar, pgVar, 0));
                } else {
                    boolean z11 = this.w2.getCurrentItemTop() <= uhVar.getButtonsHideOffset();
                    this.v2.v(1.0f);
                    this.w2.v(1.0f);
                    this.v2.m(this.i4);
                    this.w2.m(this.i4);
                    this.b.invalidate();
                    this.X0.g();
                    uh uhVar10 = this.v2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    nhVar.getClass();
                    nhVar.a(uhVar10, valueOf2);
                    q7Var.setTag(z11 ? 1 : null);
                    pgVar.run();
                }
            } else if (z9) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.w2.setAlpha(0.0f);
                this.w2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.v2, (Property<uh, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.v2, nhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(q7Var, (Property<q7, Float>) View.ALPHA, q7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(wq.f);
                animatorSet.addListener(new bi.y4(this, firstOffset, pgVar, i11));
                this.q3 = animatorSet;
                uh uhVar11 = this.v2;
                nhVar.getClass();
                nhVar.a(uhVar11, f11);
                animatorSet.start();
            } else {
                uhVar5.setAlpha(0.0f);
                pgVar.run();
                P1(0);
                this.b.invalidate();
            }
            if (!this.j4 || (uhVar instanceof hi.c4)) {
                i7 = 0;
            } else {
                i7 = 0;
                this.j4 = false;
                q7Var.updateColors();
                q7Var.invalidate();
                i1();
            }
            q7Var.setForcedMenuWidth((j3 == 1 || j3 == 6 || j3 == 17 || (uhVar instanceof hi.c4)) ? org.telegram.messenger.g0.L(46.0f) : j3 == 4 ? org.telegram.messenger.g0.L(84.0f) : i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean H() {
        return this.v2.b();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean H0() {
        uh uhVar = this.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        return uhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    public final void H1(boolean z9, Boolean bool) {
        ci ciVar;
        if (this.g2 == null) {
            ciVar = this;
            an anVar = new an(ciVar, getContext(), false, this.I0, bool);
            ciVar.g2 = anVar;
            ciVar.t2[1] = anVar;
            anVar.setDelegate(new lg(this, 17));
        } else {
            ciVar = this;
        }
        G1(ciVar.g2, 9L, z9);
    }

    public final void I1(boolean z9, boolean z10) {
        uh uhVar;
        this.n1.a(z9, z10);
        q7 q7Var = this.U2;
        if (!(z9 && q7Var.getTag() == null) && (z9 || q7Var.getTag() == null)) {
            return;
        }
        q7Var.setTag(z9 ? 1 : null);
        AnimatorSet animatorSet = this.V2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V2 = null;
        }
        boolean z11 = (this.z1 || this.Q2 || (this.N2 == 0 && this.n3) || this.v2 != this.d2 || (!this.I3 && !this.J3)) ? false : true;
        if (this.v2 == this.N1) {
            z11 = false;
        }
        ch chVar = this.u3;
        org.telegram.ui.ActionBar.r0 r0Var = this.X2;
        if (z9) {
            if (z11) {
                r0Var.setVisibility(0);
                r0Var.setClickable(true);
            }
        } else if (this.P2 && this.A2.getTag() == null) {
            chVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var != null) {
            if (z9) {
                org.telegram.messenger.g0.q3(this, i0.a.h(org.telegram.ui.ActionBar.m6.w0(this.e4 ? org.telegram.ui.ActionBar.m6.hh : org.telegram.ui.ActionBar.m6.h5, this.I0)) > 0.699999988079071d);
            } else {
                org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
            }
        }
        int i7 = 4;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z9 ? 1.0f : 0.0f) - q7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q7Var, (Property<q7, Float>) property, z9 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ng(this, i7));
            arrayList.add(ofFloat);
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property, z9 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_X, z9 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_Y, z9 ? 1.0f : 0.6f));
            }
            this.V2.playTogether(arrayList);
            this.V2.addListener(new s9(2, this, z9));
            this.V2.setInterpolator(wq.h);
            this.V2.setDuration(380L);
            this.V2.start();
            return;
        }
        if (z9 && this.P2 && ((uhVar = this.v2) == null || uhVar.M())) {
            chVar.setVisibility(4);
        }
        q7Var.setAlpha(z9 ? 1.0f : 0.0f);
        if (z11) {
            r0Var.setAlpha(z9 ? 1.0f : 0.0f);
            r0Var.setScaleX(z9 ? 1.0f : 0.6f);
            r0Var.setScaleY(z9 ? 1.0f : 0.6f);
        }
        if (z9) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.b3;
        if (r0Var2 != null) {
            r0Var2.setVisibility(4);
        }
        if (this.N2 == 0 && this.n3) {
            return;
        }
        r0Var.setVisibility(4);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void J() {
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.m4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.n4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.z0 = null;
            this.A0 = 0;
        }
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.D2;
        fh fhVar = this.B2;
        fhVar.getLocationOnScreen(iArr);
        if (this.B4 != null) {
            uh uhVar = this.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if ((uhVar == chatAttachAlertPhotoLayout || uhVar == this.k2) && this.W1) {
                bi.x5 x5Var = this.L2;
                alpha = (x5Var.getAlpha() * x5Var.getMeasuredHeight()) + (x5Var.getY() - this.B4.getTop());
            } else {
                alpha = -fhVar.getHeight();
            }
            if (Math.abs(this.B4.getTranslationY() - alpha) > 0.5f) {
                this.B4.setTranslationY(alpha);
                this.B4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                }
            }
        }
        U0();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public void K() {
        ai aiVar = this.W3;
        if (aiVar != null) {
            aiVar.c0(new pg(this, 4));
        } else {
            t1();
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
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9;
        boolean z10;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.q3 != null) {
            return;
        }
        int selectedItemsCount = this.v2.getSelectedItemsCount();
        kh khVar = this.F2;
        if (selectedItemsCount == 0) {
            khVar.e(0, i7 != 0);
            E1(false, i7 != 0);
        } else {
            if (E1(true, i7 != 0) || i7 == 0) {
                khVar.e(selectedItemsCount, i7 != 0);
                khVar.a();
            } else {
                khVar.e(selectedItemsCount, true);
                khVar.a();
            }
        }
        this.v2.D(selectedItemsCount);
        Q0(i7 != 0);
        if (this.v2 == this.d2 && ((((z9 = (f2Var = this.Z1) instanceof org.telegram.ui.cn)) || this.N2 != 0 || this.Q2) && ((selectedItemsCount == 0 && this.n3) || ((selectedItemsCount != 0 || this.N2 != 0 || this.Q2) && !this.n3)))) {
            this.n3 = (selectedItemsCount == 0 && this.N2 == 0 && !this.Q2) ? false : true;
            AnimatorSet animatorSet = this.W2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W2 = null;
            }
            int i10 = this.N2;
            q7 q7Var = this.U2;
            org.telegram.ui.ActionBar.r0 r0Var = this.b3;
            if (i10 != 0 && r0Var != null && q7Var.getTag() != null && z9) {
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
                if (!org.telegram.messenger.t3.T(cnVar.e) || (tL_chatBannedRights = cnVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z10 = true;
                    z11 = this.n3;
                    ch chVar = this.f3;
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.X2;
                    if (!z11) {
                        if (this.N2 == 0 && !this.Q2) {
                            r0Var2.setVisibility(0);
                            r0Var2.setClickable(true);
                        }
                        chVar.setVisibility(0);
                    } else if (q7Var.getTag() != null && r0Var != null) {
                        r0Var.setVisibility(0);
                    }
                    if (i7 != 0) {
                        if (q7Var.getTag() == null && this.N2 == 0 && !this.Q2) {
                            r0Var2.setAlpha(this.n3 ? 1.0f : 0.0f);
                            r0Var2.setScaleX(this.n3 ? 1.0f : 0.6f);
                            r0Var2.setScaleY(this.n3 ? 1.0f : 0.6f);
                        }
                        chVar.setAlpha(this.n3 ? 1.0f : 0.0f);
                        if (z10) {
                            r0Var.setAlpha(this.n3 ? 0.0f : 1.0f);
                        }
                        if (this.n3 && r0Var != null) {
                            r0Var.setVisibility(4);
                        }
                    } else {
                        this.W2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (q7Var.getTag() == null && this.N2 == 0 && !this.Q2) {
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.ALPHA, this.n3 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_X, this.n3 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_Y, this.n3 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(chVar, (Property<ch, Float>) property, this.n3 ? 1.0f : 0.0f));
                        if (z10) {
                            arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property, this.n3 ? 0.0f : 1.0f));
                        }
                        this.W2.playTogether(arrayList);
                        this.W2.addListener(new y5(this, 10));
                        this.W2.setDuration(180L);
                        this.W2.start();
                    }
                }
            }
            z10 = false;
            z11 = this.n3;
            ch chVar2 = this.f3;
            org.telegram.ui.ActionBar.r0 r0Var22 = this.X2;
            if (!z11) {
            }
            if (i7 != 0) {
            }
        }
        N1(i7 != 0);
        org.telegram.messenger.ij ijVar = this.E3;
        long N1 = (ijVar == null || ijVar.p5()) ? org.telegram.messenger.qp.s1(this.G3).N1(b1()) : 0L;
        uh uhVar = this.v2;
        khVar.i(X0() + (uhVar != null ? uhVar.getSelectedItemsCount() : 0), N1, true);
        fh fhVar = this.B2;
        if (fhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fhVar.getLayoutParams();
            int max = Math.max(org.telegram.messenger.g0.L(48.0f), khVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                fhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L(int i7) {
        super.L(i7);
        this.v2.r(i7);
    }

    public final void L1() {
        float f10;
        uh uhVar = this.v2;
        boolean i7 = uhVar == null ? false : uhVar.i();
        ei.k kVar = this.c3;
        kVar.setEnabled(i7);
        uh uhVar2 = this.v2;
        if (uhVar2 != null) {
            f10 = ((uhVar2.i() ? 1.0f : 0.5f) * (this.w2 == null ? 1.0f : this.X1)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        uh uhVar3 = this.w2;
        if (uhVar3 != null) {
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.X1, uhVar3.i() ? 1.0f : 0.5f, f10);
        }
        this.d3 = f10;
        if (kVar != null) {
            float f11 = f10 * this.e3;
            kVar.setAlpha(f11);
            kVar.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    public final void M0() {
        if (a1().a.length() <= 0) {
            return;
        }
        this.v2.a(a1().getText());
    }

    public final void M1(uh uhVar, int i7) {
        if (uhVar == null) {
            return;
        }
        dh.g gVar = this.C4;
        if (gVar != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(0.0f, i7);
        }
        int currentItemTop = uhVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z9 = false;
        boolean z10 = uhVar == this.v2 && currentItemTop <= uhVar.getButtonsHideOffset();
        this.L1 = z10;
        if (uhVar == this.v2) {
            I1(z10, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uhVar.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        uh uhVar2 = this.v2;
        int i10 = uhVar2 == uhVar ? 0 : 1;
        if ((uhVar2 instanceof am) || (this.w2 instanceof am)) {
            Object obj = this.q3;
            if ((obj instanceof r1.g) && ((r1.g) obj).f) {
                z9 = true;
            }
        }
        int[] iArr = this.Y3;
        int i11 = iArr[i10];
        if (i11 == D && !z9) {
            if (i7 != 0) {
                this.Z3 = i11;
            }
        } else {
            this.Z3 = i11;
            iArr[i10] = D;
            P1(i10);
            this.b.invalidate();
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        return (f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).Z6();
    }

    public final void N1(boolean z9) {
        fi.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.Y2) == null) {
            return;
        }
        boolean z10 = this.n3 && this.c2 && this.v2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0();
        boolean z11 = !ChatAttachAlertPhotoLayout.U();
        uVar.f = z11;
        if (!z9) {
            ((v5) uVar.g).a(z11);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.r0 r0Var = this.Z2;
        if (z9 && this.n3) {
            r0Var.setVisibility(0);
            r0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(wq.h).withEndAction(new yg(this, z10, 0)).start();
        } else {
            r0Var.setVisibility(z10 ? 0 : 8);
            r0Var.setAlpha(z10 ? 1.0f : 0.0f);
            r0Var.setScaleX(z10 ? 1.0f : 0.6f);
            r0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (!(f2Var instanceof org.telegram.ui.cn)) {
            return false;
        }
        return ChatActivityEnterView.C(this.G3, ((org.telegram.ui.cn) f2Var).a(), f2Var, charSequence);
    }

    public final void O1(boolean z9) {
        uh uhVar = this.d2;
        if (!z9) {
            F1(uhVar);
            return;
        }
        if (this.G1) {
            if (this.k2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.s1;
                if (h6Var == null) {
                    h6Var = this.I0;
                }
                am amVar = new am(context, h6Var, this);
                amVar.D = 0.0f;
                amVar.E = 0.0f;
                amVar.F = 0.0f;
                amVar.G = 0.0f;
                amVar.H = 0.0f;
                amVar.I = 0.0f;
                amVar.J = null;
                amVar.K = false;
                amVar.M = 0.0f;
                amVar.Q = false;
                amVar.S = false;
                Point point = org.telegram.messenger.g0.q;
                amVar.T = point.y > point.x;
                amVar.n = h6Var;
                amVar.f = true;
                amVar.setWillNotDraw(false);
                ci ciVar = amVar.b;
                org.telegram.ui.ActionBar.y s5 = ciVar.U2.s();
                TextView textView = new TextView(context);
                amVar.y = textView;
                org.telegram.ui.ActionBar.h6 h6Var2 = amVar.a;
                fi.w2 w2Var = new fi.w2(amVar, context, s5, h6Var2, 2);
                ciVar.U2.addView(w2Var, 0, c8.ha.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var2);
                textView.setText(org.telegram.messenger.id.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.q1 q1Var = new bi.q1(amVar, context, h6Var2, 17);
                amVar.r = q1Var;
                q1Var.setAdapter(new org.telegram.ui.x7(amVar, 3));
                v4.b0 b0Var = new v4.b0(1, false);
                amVar.s = b0Var;
                q1Var.setLayoutManager(b0Var);
                q1Var.setClipChildren(false);
                q1Var.setClipToPadding(false);
                q1Var.setOverScrollMode(2);
                q1Var.setVerticalScrollBarEnabled(false);
                zl zlVar = new zl(amVar, context);
                amVar.w = zlVar;
                zlVar.setClipToPadding(true);
                zlVar.setClipChildren(true);
                amVar.addView(q1Var, c8.ha.c(-1.0f, -1));
                amVar.P = ciVar.d2;
                zlVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.P;
                zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                zlVar.c();
                UndoView undoView = new UndoView(context, null, false, ciVar.s1);
                amVar.x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                amVar.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                amVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.k2 = amVar;
                amVar.bringToFront();
            }
            uh uhVar2 = this.v2;
            am amVar2 = this.k2;
            if (uhVar2 != amVar2) {
                uhVar = amVar2;
            }
            F1(uhVar);
        }
    }

    public final void P0() {
        dh dhVar = this.v3;
        if (dhVar == null) {
            return;
        }
        int childCount = dhVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            dhVar.getChildAt(i7);
        }
        boolean z9 = this.e4;
        org.telegram.ui.ActionBar.t6.U(this.g3, z9 ? org.telegram.ui.ActionBar.m6.Vg : org.telegram.ui.ActionBar.m6.j5, this.I0);
        org.telegram.ui.ActionBar.t6.U(this.l3, z9 ? org.telegram.ui.ActionBar.m6.Vg : org.telegram.ui.ActionBar.m6.j5, this.I0);
        org.telegram.ui.ActionBar.t6.U(this.c3, org.telegram.ui.ActionBar.m6.Gi, this.I0);
        int w02 = org.telegram.ui.ActionBar.m6.w0(z9 ? org.telegram.ui.ActionBar.m6.Vg : org.telegram.ui.ActionBar.m6.j5, this.I0);
        boolean z10 = (this.q4 && w02 == this.p4) ? false : true;
        this.q4 = true;
        this.p4 = w02;
        org.telegram.ui.ActionBar.r0 r0Var = this.X2;
        if (z10) {
            r0Var.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(z9 ? org.telegram.ui.ActionBar.m6.Wg : org.telegram.ui.ActionBar.m6.I5, this.I0), r0Var.getBackground());
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        r0Var.O(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), false);
        r0Var.O(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), true);
        r0Var.H(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.I0));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.Z2;
        if (r0Var2 != null && z10) {
            r0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.b3;
        if (r0Var3 != null) {
            if (z10) {
                r0Var3.setIconColor(w02);
            }
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(z9 ? org.telegram.ui.ActionBar.m6.Wg : org.telegram.ui.ActionBar.m6.I5, this.I0), r0Var3.getBackground());
        }
        fh fhVar = this.B2;
        org.telegram.ui.ActionBar.h6 h6Var = fhVar.M;
        et etVar = fhVar.a;
        int i11 = fhVar.L;
        if (i11 == 0) {
            etVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, h6Var));
            int i12 = org.telegram.ui.ActionBar.m6.G6;
            etVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
            etVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        } else if (i11 == 2 || i11 == 3) {
            etVar.setHintTextColor(-1929379841);
            etVar.setTextColor(-1);
            etVar.setCursorColor(-1);
            etVar.setHandlesColor(-1);
            etVar.setHighlightColor(822083583);
            etVar.D = -1;
        } else {
            etVar.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.t5, h6Var));
            etVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j5, h6Var));
        }
        fhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Le, h6Var), PorterDuff.Mode.MULTIPLY));
        ft ftVar = fhVar.d;
        if (ftVar != null) {
            ftVar.updateColors();
        }
        org.telegram.ui.ActionBar.t6.l(dhVar, 21, org.telegram.ui.ActionBar.m6.A5, this.I0);
        int i13 = z9 ? org.telegram.ui.ActionBar.m6.Vg : org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.h6 h6Var2 = this.I0;
        q7 q7Var = this.U2;
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i13, h6Var2);
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, z9 ? org.telegram.ui.ActionBar.m6.Wg : org.telegram.ui.ActionBar.m6.I5, this.I0);
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, z9 ? org.telegram.ui.ActionBar.m6.Vg : org.telegram.ui.ActionBar.m6.j5, this.I0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.m6.C1(d12, this.r0);
        ri.c cVar = this.D4;
        if (cVar.b != d12) {
            cVar.a(d12);
            lh.f fVar = this.s3;
            if (fVar != null) {
                fVar.invalidate();
            }
            eh ehVar = this.t3;
            if (ehVar != null) {
                ehVar.invalidate();
            }
        }
        this.b.invalidate();
        int i14 = 0;
        while (true) {
            uh[] uhVarArr = this.t2;
            if (i14 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i14];
            if (uhVar != null) {
                uhVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            P(org.telegram.ui.ActionBar.m6.h5);
            return;
        }
        this.F0 = -1;
        this.G0 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, this.I0);
        org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0), false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.G0)) > 0.721d);
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
        org.telegram.ui.ActionBar.r0 r0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        ei.k kVar;
        float max;
        int i11;
        float f15 = this.n1.e;
        uh uhVar = i7 == 0 ? this.v2 : this.w2;
        if (uhVar == null || uhVar.getVisibility() != 0) {
            return;
        }
        int c12 = c1(i7);
        if (uhVar == this.g2 || uhVar == this.h2) {
            org.telegram.messenger.g0.L(13.0f);
            org.telegram.messenger.g0.L(11.0f);
        } else {
            org.telegram.messenger.g0.L(39.0f);
            org.telegram.messenger.g0.L(43.0f);
        }
        org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (org.telegram.messenger.g0.Q1()) {
            i10 = 16;
        } else {
            Point point = org.telegram.messenger.g0.q;
            i10 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.U2.getAlpha();
        ch chVar = this.f3;
        float L = alpha != 0.0f ? 0.0f : org.telegram.messenger.g0.L((1.0f - chVar.getAlpha()) * 26.0f);
        boolean z9 = this.n3;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.X2;
        bi.x5 x5Var = this.L2;
        if (z9 && this.N2 == 0 && !this.Q2) {
            r0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37), ((c12 - org.telegram.messenger.g0.L((i10 * f15) + 37.0f)) + L) - (x5Var.getAlpha() * x5Var.getMeasuredHeight())) + this.i4);
        } else {
            r0Var2.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.i4);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.Z2;
        if (r0Var3 != null) {
            r0Var3.setTranslationY(r0Var2.getTranslationY());
        }
        fi.m3 m3Var = this.a3;
        if (m3Var != null) {
            m3Var.setTranslationY(r0Var2.getTranslationY());
        }
        if (this.z1 && this.p3) {
            uh uhVar2 = this.w2;
            if (uhVar2 != null && this.v2 != null) {
                f10 = Math.min(uhVar2.getTranslationY(), this.v2.getTranslationY());
            } else if (uhVar2 != null) {
                f10 = uhVar2.getTranslationY();
            }
            r0Var = this.b3;
            if (r0Var != null) {
                r0Var.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.i4);
            }
            float L2 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.i4) + f10) - (x5Var.getAlpha() * x5Var.getMeasuredHeight());
            this.m3 = L2;
            chVar.setTranslationY(Math.max(this.i4, L2));
            x5Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.i4, (chVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.m3 + org.telegram.messenger.g0.L(8.0f)));
            if (this.W1) {
                J1();
            }
            U0();
            int i12 = 59;
            if (this.g2 != null) {
                if (org.telegram.messenger.g0.Q1()) {
                    i11 = 63;
                } else {
                    Point point2 = org.telegram.messenger.g0.q;
                    i11 = point2.x > point2.y ? 53 : 59;
                }
                an anVar = this.g2;
                if (anVar == this.w2) {
                    f12 = (anVar.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.X1;
                } else if (anVar == this.v2) {
                    f12 = (anVar.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.w2 == null ? 1.0f : 1.0f - this.X1;
                }
                if (this.h2 != null) {
                    if (org.telegram.messenger.g0.Q1()) {
                        i12 = 63;
                    } else {
                        Point point3 = org.telegram.messenger.g0.q;
                        if (point3.x > point3.y) {
                            i12 = 53;
                        }
                    }
                    an anVar2 = this.h2;
                    if (anVar2 == this.w2) {
                        f14 = (anVar2.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.X1;
                    } else if (anVar2 == this.v2) {
                        f14 = (anVar2.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.w2 == null ? 1.0f : 1.0f - this.X1;
                    }
                    kVar = this.c3;
                    if (kVar != null) {
                        int measuredWidth = org.telegram.messenger.id.a0 ? (this.b.getMeasuredWidth() - kVar.getMeasuredWidth()) - org.telegram.messenger.g0.L(62.0f) : 0;
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
                        kVar.setTranslationY(Math.max(0.0f, max) + this.i4);
                        kVar.setTranslationX(-((measuredWidth * (1.0f - f15)) + org.telegram.messenger.g0.L((7.0f * r6) + 12.0f)));
                    }
                    float max2 = Math.max(f13, f11);
                    this.e3 = max2;
                    if (kVar == null) {
                        float f16 = this.d3 * max2;
                        kVar.setAlpha(f16);
                        kVar.setVisibility(f16 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f13 = 0.0f;
                f14 = 0.0f;
                kVar = this.c3;
                if (kVar != null) {
                }
                float max22 = Math.max(f13, f11);
                this.e3 = max22;
                if (kVar == null) {
                }
            }
            f11 = 0.0f;
            f12 = 0.0f;
            if (this.h2 != null) {
            }
            f13 = 0.0f;
            f14 = 0.0f;
            kVar = this.c3;
            if (kVar != null) {
            }
            float max222 = Math.max(f13, f11);
            this.e3 = max222;
            if (kVar == null) {
            }
        }
        f10 = 0.0f;
        r0Var = this.b3;
        if (r0Var != null) {
        }
        float L22 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.i4) + f10) - (x5Var.getAlpha() * x5Var.getMeasuredHeight());
        this.m3 = L22;
        chVar.setTranslationY(Math.max(this.i4, L22));
        x5Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.i4, (chVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.m3 + org.telegram.messenger.g0.L(8.0f)));
        if (this.W1) {
        }
        U0();
        int i122 = 59;
        if (this.g2 != null) {
        }
        f11 = 0.0f;
        f12 = 0.0f;
        if (this.h2 != null) {
        }
        f13 = 0.0f;
        f14 = 0.0f;
        kVar = this.c3;
        if (kVar != null) {
        }
        float max2222 = Math.max(f13, f11);
        this.e3 = max2222;
        if (kVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (org.telegram.messenger.ij.c3(r0.k) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z9) {
        boolean z10;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var == null || !(f2Var instanceof org.telegram.ui.cn)) {
            return;
        }
        org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
        kt ktVar = this.W1 ? this.M2 : this.B2;
        String obj = ktVar != null ? ktVar.getText().toString() : null;
        if (this.E3 == null) {
            uh uhVar = this.v2;
            z10 = true;
            if (uhVar != null) {
            }
            if (bg.w.g(this.G3).e(obj, cnVar.t8) <= 0) {
                org.telegram.messenger.ij ijVar = cnVar.D5;
                if (ijVar != null) {
                }
            }
            this.q1.a(z10, z9);
            if (z10 || !f1()) {
            }
            v1(false, z9);
            return;
        }
        z10 = false;
        this.q1.a(z10, z9);
        if (z10) {
        }
    }

    public final void Q1() {
        int i7 = 0;
        P1(0);
        this.o3.invalidate();
        bi.x5 x5Var = this.L2;
        x5Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            il ilVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.X();
            if (ilVar != null && ilVar.getFastScroll() != null) {
                ui0 fastScroll = ilVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.W1) {
                    i7 = (int) (x5Var.getAlpha() * x5Var.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i7;
                ilVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.m1.e;
        this.t3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.n1.e))), 1.0f - ((1.0f - this.l1.e) * f10)));
    }

    public final void S0(uh uhVar) {
        boolean e10 = uhVar.e();
        lh.f fVar = this.s3;
        if (fVar != null) {
            fVar.setFadeHeightBottom(e10 ? 0 : org.telegram.messenger.g0.L(48.0f));
        }
        eh ehVar = this.t3;
        if (ehVar != null) {
            ehVar.setVisibility(e10 ? 4 : 0);
        }
    }

    public final void T0() {
        p00.d(this.C2, com.google.android.recaptcha.internal.a.D(this.o1.e, this.p1.e, a8.j7.a(this.q1.e), this.O3 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList U() {
        ArrayList<org.telegram.ui.ActionBar.v6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            uh[] uhVarArr = this.t2;
            if (i7 >= uhVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i5));
                return arrayList;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null && (themeDescriptions = uhVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i7++;
        }
    }

    public final void U0() {
        kh khVar = this.F2;
        ch chVar = this.E2;
        bi.x5 x5Var = this.L2;
        if (x5Var == null || x5Var.getVisibility() != 0 || x5Var.getAlpha() == 0.0f) {
            chVar.setTranslationY(this.d4);
            khVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.l1.e;
        float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
        khVar.setAlpha(abs * abs * abs * abs);
        chVar.setTranslationY(org.telegram.messenger.g0.T1(this.d4, ((x5Var.getTranslationY() + x5Var.getTop()) - chVar.getTop()) + org.telegram.messenger.g0.L(8.0f), wq.j.getInterpolation(f10)));
    }

    public final void V0(int i7) {
        this.P2 = true;
        this.u3.setVisibility(0);
        this.B1 = true;
        this.C1 = i7;
        this.N2 = 0;
        this.z1 = false;
        this.A1 = false;
        this.D1 = null;
        org.telegram.ui.ActionBar.r0 r0Var = this.h3;
        if (r0Var != null) {
            this.g3.setTranslationY(0.0f);
            r0Var.setVisibility(8);
        }
    }

    public final void W0(hi.u1 u1Var) {
        String M0 = org.telegram.messenger.id.M0(2131752122, null);
        TextView textView = this.g3;
        textView.setText(M0);
        this.P2 = false;
        this.u3.setVisibility(8);
        this.N2 = 1;
        this.z1 = true;
        this.A1 = true;
        this.c2 = false;
        this.D1 = u1Var;
        org.telegram.ui.ActionBar.r0 r0Var = this.h3;
        if (r0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            r0Var.setVisibility(0);
            r0Var.setClickable(true);
            r0Var.setAlpha(1.0f);
            r0Var.setScaleX(1.0f);
            r0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (!(f2Var instanceof org.telegram.ui.cn) || (mjVar = ((org.telegram.ui.cn) f2Var).v5) == null || (kjVar = mjVar.b) == null) {
            return 0;
        }
        return kjVar.g.size();
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        uh uhVar;
        if (i7 == 0) {
            U0();
            R0();
            return;
        }
        if (i7 == 2) {
            R0();
            an anVar = this.g2;
            if (anVar != null && ((uhVar = this.w2) == anVar || this.v2 == anVar)) {
                P1(uhVar == anVar ? 1 : 0);
            }
            an anVar2 = this.h2;
            if (anVar2 != null) {
                uh uhVar2 = this.w2;
                if (uhVar2 == anVar2 || this.v2 == anVar2) {
                    P1(uhVar2 != anVar2 ? 0 : 1);
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
            kh khVar = this.F2;
            if (khVar != null) {
                khVar.setEphemeralFactor(f10);
                khVar.setSameWidthFactor(f10);
            }
        }
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        return f2Var instanceof org.telegram.ui.cn ? ((org.telegram.ui.cn) f2Var).e : org.telegram.messenger.qp.s1(this.G3).M0(Long.valueOf(-this.T1));
    }

    public final float Z0() {
        return r0.getMeasuredHeight() - ((1.0f - this.A2.getAlpha()) * (r0.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.b2
    public final void a(boolean z9) {
        if (z9) {
            this.A4 = z9;
        }
        dismiss();
    }

    public final kt a1() {
        uh uhVar;
        return (this.W1 && ((uhVar = this.v2) == this.d2 || uhVar == this.k2)) ? this.M2 : this.B2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        return f2Var instanceof org.telegram.ui.cn ? ((org.telegram.ui.cn) f2Var).a() : this.T1;
    }

    public final int c1(int i7) {
        uh uhVar = this.w2;
        int[] iArr = this.Y3;
        if (uhVar == null || !((this.v2 instanceof am) || (uhVar instanceof am))) {
            return iArr[i7];
        }
        return org.telegram.messenger.g0.W1(this.X1, iArr[0], iArr[1]);
    }

    public final int d1(boolean z9) {
        q7 q7Var;
        if (this.e4) {
            return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.hh, this.I0);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        boolean a10 = h6Var != null ? h6Var.a() : org.telegram.ui.ActionBar.m6.I.q();
        Iterator it = this.r1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a11 = c8.j9.a(f10, 0.0f, 1.0f);
        if (z9 && (q7Var = this.U2) != null && q7Var.getVisibility() == 0) {
            a11 *= 1.0f - q7Var.getAlpha();
        }
        return i0.a.f(a11, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0), org.telegram.ui.ActionBar.m6.w0(a10 ? org.telegram.ui.ActionBar.m6.a7 : org.telegram.ui.ActionBar.m6.i5, this.I0));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.T0 && i7 != org.telegram.messenger.qs.W4 && i7 != org.telegram.messenger.qs.F1) {
            if (i7 == org.telegram.messenger.qs.f5) {
                this.E1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).H0();
            }
        } else {
            zh zhVar = this.x3;
            if (zhVar != null) {
                zhVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        hh hhVar;
        fh fhVar;
        if (this.v2.q() || this.I) {
            return;
        }
        uh uhVar = this.v2;
        hk hkVar = this.q2;
        int i7 = 1;
        int i10 = 0;
        boolean z9 = (uhVar != hkVar || hkVar == null || hkVar.K || hkVar.P0 == null) ? false : true;
        this.r2 = z9;
        if (!z9 && (fhVar = this.B2) != null) {
            org.telegram.messenger.g0.v1(fhVar.getEditText());
        }
        if (!this.r2 && (hhVar = this.M2) != null) {
            org.telegram.messenger.g0.v1(hhVar.getEditText());
        }
        this.u2.clear();
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var == null) {
            f2Var = LaunchActivity.Q();
        }
        if (this.A4 || f2Var == null || this.v2.getSelectedItemsCount() <= 0 || this.z1) {
            int i11 = 0;
            while (true) {
                uh[] uhVarArr = this.t2;
                if (i11 >= uhVarArr.length) {
                    break;
                }
                uh uhVar2 = uhVarArr[i11];
                if (uhVar2 != null && this.v2 != uhVar2) {
                    uhVar2.q();
                }
                i11++;
            }
            org.telegram.messenger.g0.u3(this, i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.I0), 0), true, new lg(this, 11));
            if (f2Var != null) {
                org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
            }
            this.f4 = false;
            super.dismiss();
            this.A4 = false;
            return;
        }
        if (this.z4) {
            return;
        }
        this.z4 = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), this.I0);
        String M0 = org.telegram.messenger.id.M0(2131751399, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131751400, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751406, null), new lg(this, i7));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        u1Var.setOnCancelListener(new sg(this, i10));
        u1Var.N = new o0(this, 4);
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, this.I0);
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
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        ci ciVar;
        pl plVar;
        org.telegram.messenger.we weVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        uh uhVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        this.K2 = 0L;
        this.F2.setEffect(0L);
        int i7 = 0;
        this.A3 = false;
        this.y3 = false;
        this.C3 = 0.0f;
        this.B3.setVisibility(8);
        RadialProgressView radialProgressView = this.z3;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        ch chVar = this.u3;
        chVar.setAlpha(1.0f);
        chVar.setTranslationY(0.0f);
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.u2;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((hi.c4) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
            i10++;
        }
        int i11 = this.N2;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (i11 != 2) {
            if (f2Var instanceof org.telegram.ui.cn) {
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
                chat = cnVar.e;
                user = cnVar.j();
            } else {
                long j3 = this.T1;
                int i12 = this.G3;
                if (j3 >= 0) {
                    user = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(this.T1));
                    chat = null;
                } else if (j3 < 0) {
                    chat = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-this.T1));
                    user = null;
                }
            }
            z9 = f2Var instanceof org.telegram.ui.cn;
            if ((z9 && this.N2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.I3 = org.telegram.messenger.t3.p(chat);
                    this.J3 = org.telegram.messenger.t3.u(chat);
                    this.K3 = org.telegram.messenger.t3.o(chat);
                    this.L3 = org.telegram.messenger.t3.r(chat);
                    this.M3 = !org.telegram.messenger.t3.V(chat) && org.telegram.messenger.t3.r(chat);
                    this.N3 = org.telegram.messenger.t3.q(chat);
                    this.H3 = org.telegram.messenger.t3.l(chat);
                } else {
                    this.L3 = org.telegram.messenger.t10.t(user) || org.telegram.messenger.t10.B(user);
                    this.M3 = !z9 || ((org.telegram.ui.cn) f2Var).h == null;
                }
            }
            if (this.A1) {
                this.I3 = true;
                this.J3 = true;
            }
            if (this.O3) {
                this.L3 = false;
                this.M3 = false;
            }
            fh fhVar = this.B2;
            if (z9 || this.N2 == 2) {
                fhVar.setVisibility(this.Q1 ? 0 : 4);
            }
            boolean z10 = this.J3;
            boolean z11 = this.I3;
            boolean z12 = this.H3;
            chatAttachAlertPhotoLayout = this.d2;
            ciVar = chatAttachAlertPhotoLayout.b;
            iy iyVar = chatAttachAlertPhotoLayout.H;
            boolean z13 = !z10 || z11;
            chatAttachAlertPhotoLayout.v0 = z13;
            chatAttachAlertPhotoLayout.w0 = z10;
            chatAttachAlertPhotoLayout.x0 = z11;
            chatAttachAlertPhotoLayout.z0 = z12;
            plVar = chatAttachAlertPhotoLayout.P;
            if (plVar != null) {
                plVar.setAlpha(z13 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.Y0() == null) && ciVar.N2 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
                if (chatAttachAlertPhotoLayout.v0) {
                    iyVar.setText(org.telegram.messenger.id.M0(2131748180, null));
                    iyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat Y0 = ciVar.Y0();
                    iyVar.a(R.raw.media_forbidden, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2);
                    if (org.telegram.messenger.t3.P(7, Y0)) {
                        iyVar.setText(org.telegram.messenger.id.M0(2131749543, null));
                    } else if (org.telegram.messenger.g0.D1(Y0.banned_rights)) {
                        iyVar.setText(org.telegram.messenger.id.a0("AttachMediaRestrictedForever", null, 2131753955, new Object[0]));
                    } else {
                        iyVar.setText(org.telegram.messenger.id.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.id.v(Y0.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.t0()) {
                chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
            } else {
                chatAttachAlertPhotoLayout.U0 = MediaController.a2;
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
                for (int i13 = 0; i13 < Math.min(100, chatAttachAlertPhotoLayout.U0.e.size()); i13++) {
                    ((org.telegram.messenger.gf) chatAttachAlertPhotoLayout.U0.e.get(i13)).e();
                }
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.F.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.id.M0(2131752238, null));
            weVar = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = weVar;
            if (weVar != null) {
                chatAttachAlertPhotoLayout.X0 = false;
                if (iyVar != null) {
                    iyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            fhVar.k(true);
            this.M2.k(true);
            this.r3 = false;
            A0(false);
            if (!this.I1 || this.J1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.i2 == null) {
                    vk vkVar = new vk(this, getContext(), this.I0, (this.B1 || this.J1 || this.O3) ? false : true);
                    this.i2 = vkVar;
                    this.t2[5] = vkVar;
                    uk ukVar = this.t4;
                    if (ukVar != null) {
                        vkVar.setDelegate(ukVar);
                    } else {
                        vkVar.setDelegate(new lg(this, i7));
                    }
                }
                this.T2 = 5L;
                uhVar = this.i2;
            } else if (this.H1) {
                r1(false);
                uhVar = this.j2;
                this.T2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                org.telegram.messenger.ij ijVar = this.E3;
                if (ijVar != null) {
                    int i14 = this.D3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i14 == -1) {
                        this.P2 = true;
                        if (ijVar.I3()) {
                            p1(false);
                            uhVar = this.f2;
                            this.T2 = 3L;
                        } else if (this.E3.U2()) {
                            r1(false);
                            uhVar = this.j2;
                            this.T2 = 4L;
                        } else {
                            this.T2 = 1L;
                        }
                    } else {
                        if (i14 == 2) {
                            p1(false);
                            uhVar = this.f2;
                            this.T2 = 3L;
                        } else if (i14 == 1) {
                            r1(false);
                            uhVar = this.j2;
                            this.T2 = 4L;
                        } else {
                            this.T2 = 1L;
                            uhVar = chatAttachAlertPhotoLayout2;
                        }
                        this.P2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.P2 = this.N2 == 0 && !this.Q2;
                    this.T2 = 1L;
                }
                uhVar = chatAttachAlertPhotoLayout2;
            }
            chVar.setVisibility(this.P2 ? 0 : 8);
            if (this.v2 != uhVar) {
                q7 q7Var = this.U2;
                if (q7Var.n0) {
                    q7Var.n(true);
                }
                this.b.removeView(this.v2);
                this.v2.u();
                this.v2.setVisibility(8);
                this.v2.t();
                this.v2 = uhVar;
                this.q0 = true;
                if (uhVar.getParent() == null) {
                    s1(this.v2);
                    this.b.addView(this.v2, 0, c8.ha.c(-1.0f, -1));
                }
                uhVar.setAlpha(1.0f);
                uhVar.setVisibility(0);
                uhVar.H(null);
                uhVar.I();
                S0(uhVar);
                q7Var.setVisibility(uhVar.j() != 0 ? 0 : 4);
                v1(this.W1, false);
                L1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.v2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            K1(0);
            this.x3.f();
            a1().setText("");
            this.w3.h1(0, 1000000);
        }
        user = null;
        chat = null;
        z9 = f2Var instanceof org.telegram.ui.cn;
        if (z9) {
            if (chat != null) {
            }
            if (this.A1) {
            }
            if (this.O3) {
            }
            fh fhVar2 = this.B2;
            if (z9) {
            }
            fhVar2.setVisibility(this.Q1 ? 0 : 4);
            boolean z102 = this.J3;
            boolean z112 = this.I3;
            boolean z122 = this.H3;
            chatAttachAlertPhotoLayout = this.d2;
            ciVar = chatAttachAlertPhotoLayout.b;
            iy iyVar2 = chatAttachAlertPhotoLayout.H;
            if (z102) {
            }
            chatAttachAlertPhotoLayout.v0 = z13;
            chatAttachAlertPhotoLayout.w0 = z102;
            chatAttachAlertPhotoLayout.x0 = z112;
            chatAttachAlertPhotoLayout.z0 = z122;
            plVar = chatAttachAlertPhotoLayout.P;
            if (plVar != null) {
            }
            if (ciVar.Z1 instanceof org.telegram.ui.cn) {
            }
            chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
            if (chatAttachAlertPhotoLayout.v0) {
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.F.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.id.M0(2131752238, null));
            weVar = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = weVar;
            if (weVar != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            fhVar2.k(true);
            this.M2.k(true);
            this.r3 = false;
            A0(false);
            if (this.I1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.i2 == null) {
            }
            this.T2 = 5L;
            uhVar = this.i2;
            chVar.setVisibility(this.P2 ? 0 : 8);
            if (this.v2 != uhVar) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.v2 != chatAttachAlertPhotoLayout3) {
            }
            K1(0);
            this.x3.f();
            a1().setText("");
            this.w3.h1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.A1) {
        }
        if (this.O3) {
        }
        fh fhVar22 = this.B2;
        if (z9) {
        }
        fhVar22.setVisibility(this.Q1 ? 0 : 4);
        boolean z1022 = this.J3;
        boolean z1122 = this.I3;
        boolean z1222 = this.H3;
        chatAttachAlertPhotoLayout = this.d2;
        ciVar = chatAttachAlertPhotoLayout.b;
        iy iyVar22 = chatAttachAlertPhotoLayout.H;
        if (z1022) {
        }
        chatAttachAlertPhotoLayout.v0 = z13;
        chatAttachAlertPhotoLayout.w0 = z1022;
        chatAttachAlertPhotoLayout.x0 = z1122;
        chatAttachAlertPhotoLayout.z0 = z1222;
        plVar = chatAttachAlertPhotoLayout.P;
        if (plVar != null) {
        }
        if (ciVar.Z1 instanceof org.telegram.ui.cn) {
        }
        chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
        if (chatAttachAlertPhotoLayout.v0) {
        }
        chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.h0();
        if (chatAttachAlertPhotoLayout.U0 != null) {
        }
        chatAttachAlertPhotoLayout.c0();
        chatAttachAlertPhotoLayout.B0(false);
        chatAttachAlertPhotoLayout.s.h1(0, 1000000);
        chatAttachAlertPhotoLayout.F.h1(0, 1000000);
        chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.id.M0(2131752238, null));
        weVar = chatAttachAlertPhotoLayout.U0;
        chatAttachAlertPhotoLayout.T0 = weVar;
        if (weVar != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        fhVar22.k(true);
        this.M2.k(true);
        this.r3 = false;
        A0(false);
        if (this.I1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.i2 == null) {
        }
        this.T2 = 5L;
        uhVar = this.i2;
        chVar.setVisibility(this.P2 ? 0 : 8);
        if (this.v2 != uhVar) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.v2 != chatAttachAlertPhotoLayout3) {
        }
        K1(0);
        this.x3.f();
        a1().setText("");
        this.w3.h1(0, 1000000);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean f0(MotionEvent motionEvent) {
        return this.v2.o(motionEvent);
    }

    public final boolean f1() {
        if (!this.W1) {
            return false;
        }
        uh uhVar = this.v2;
        return uhVar == this.d2 || uhVar == this.k2;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z9) {
        ai aiVar = this.W3;
        if (aiVar == null || this.r3) {
            return;
        }
        boolean f02 = aiVar.f0();
        this.r3 = true;
        org.telegram.messenger.g0.i3(new bi.u7(this, editTextBoldCursor, z9, 19), f02 ? 200L : 0L);
    }

    public final void i1() {
        if (this.r0 == null || this.b == null) {
            return;
        }
        int d12 = d1(false);
        org.telegram.ui.ActionBar.m6.C1(d12, this.r0);
        ri.c cVar = this.D4;
        if (cVar.b != d12) {
            cVar.a(d12);
            lh.f fVar = this.s3;
            if (fVar != null) {
                fVar.invalidate();
            }
            eh ehVar = this.t3;
            if (ehVar != null) {
                ehVar.invalidate();
            }
        }
        L1();
        this.b.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final hk hkVar = this.q2;
        if (hkVar != null && this.v2 == hkVar) {
            final pg pgVar = new pg(this, 1);
            int i7 = hkVar.n;
            org.telegram.ui.Wallet.n9 n9Var = hkVar.R;
            ci ciVar = hkVar.b;
            AnimatorSet animatorSet = null;
            if (!hkVar.K && (wallettransaction = hkVar.P0) != null && hkVar.Q0 == null && hkVar.R0 == null) {
                if (hkVar.S0) {
                    org.telegram.ui.Wallet.z5 z5Var = new org.telegram.ui.Wallet.z5();
                    z5Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                    if (f2Var != null && f2Var.presentFragment(z5Var, false, true)) {
                        final int i10 = 0;
                        org.telegram.ui.Wallet.ca caVar = new org.telegram.ui.Wallet.ca(ciVar.c, ciVar.b, n9Var.getDiamondView(), z5Var, hkVar.P0, new Runnable() { // from class: org.telegram.ui.Components.zj
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        if (!hkVar.K) {
                                            pgVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!hkVar.K) {
                                            pgVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, ciVar);
                        hkVar.R0 = caVar;
                        animatorSet = caVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.x6 diamondView = n9Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
                        if (f2Var2 instanceof org.telegram.ui.cn) {
                            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var2;
                            if (cnVar.getCurrentAccount() == i7 && cnVar.a() == hkVar.r.id && cnVar.f4 == 0 && cnVar.getFragmentView() != null && cnVar.getFragmentView().isAttachedToWindow()) {
                                final int i11 = 1;
                                org.telegram.ui.Wallet.p6 p6Var = new org.telegram.ui.Wallet.p6(ciVar.c, ciVar.b, n9Var.getDiamondView(), cnVar, hkVar.P0, new Runnable() { // from class: org.telegram.ui.Components.zj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                if (!hkVar.K) {
                                                    pgVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!hkVar.K) {
                                                    pgVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, ciVar);
                                hkVar.Q0 = p6Var;
                                animatorSet = p6Var.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.z0 = animatorSet;
                this.A0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        int i7 = 0;
        while (true) {
            uh[] uhVarArr = this.t2;
            if (i7 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null) {
                uhVar.p();
            }
            i7++;
        }
        int i10 = this.G3;
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f5);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.F1);
        this.P1 = true;
        fh fhVar = this.B2;
        if (fhVar != null) {
            fhVar.o();
        }
        hh hhVar = this.M2;
        if (hhVar != null) {
            hhVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        r71 r71Var = chatAttachAlertPhotoLayout.l0;
        bi.e5 e5Var = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        il ilVar = chatAttachAlertPhotoLayout.r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        boolean z9 = i13 < i14;
        int i15 = org.telegram.messenger.g0.n;
        if (view == e5Var) {
            if (z9) {
                if (ilVar.getVisibility() == 0) {
                    e5Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                e5Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            }
            if (ilVar.getVisibility() == 0) {
                e5Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            }
            e5Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
            return true;
        }
        if (view == r71Var) {
            if (z9) {
                if (ilVar.getVisibility() == 0) {
                    r71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                r71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            }
            if (ilVar.getVisibility() == 0) {
                r71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            }
            r71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
            return true;
        }
        if (view != textView) {
            if (view != ilVar) {
                return false;
            }
            if (z9) {
                int z10 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z10, view.getMeasuredWidth(), view.getMeasuredHeight() + z10);
                return true;
            }
            int L2 = (i7 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L2, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight());
            return true;
        }
        if (z9) {
            L = (i13 - textView.getMeasuredWidth()) / 2;
            int L3 = i12 - org.telegram.messenger.g0.L(167.0f);
            textView.setRotation(0.0f);
            if (ilVar.getVisibility() == 0) {
                L3 -= org.telegram.messenger.g0.L(96.0f);
            }
            measuredWidth = L3 - i15;
        } else {
            L = i11 - org.telegram.messenger.g0.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
            textView.setRotation(-90.0f);
            if (ilVar.getVisibility() == 0) {
                L -= org.telegram.messenger.g0.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void k1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p10 = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : org.telegram.messenger.t10.p(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(this.G3).b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.id.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.id.M0(2131753001, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.id.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        u1Var.T = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, "OK"), new a3.h(this, tL_attachMenuBot, user, 24));
        jg.g.w("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean l0(View view, int i7, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        sl slVar = chatAttachAlertPhotoLayout.w;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        il ilVar = chatAttachAlertPhotoLayout.r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.s;
        boolean z9 = i7 < i10;
        if (view != chatAttachAlertPhotoLayout.P) {
            bi.e5 e5Var = chatAttachAlertPhotoLayout.j0;
            if (view == e5Var) {
                if (z9) {
                    e5Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                e5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            r71 r71Var = chatAttachAlertPhotoLayout.l0;
            if (view == r71Var) {
                if (z9) {
                    r71Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                r71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            if (view == ilVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z9) {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
                    if (b0Var.o != 0) {
                        ilVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        slVar.f();
                    }
                } else {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                    if (b0Var.o != 1) {
                        ilVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        slVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            chatAttachAlertPhotoLayout.P.measure(View.MeasureSpec.makeMeasureSpec(ciVar.T() + ciVar.S() + i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void l1() {
        int i7 = 0;
        while (true) {
            uh[] uhVarArr = this.t2;
            if (i7 >= uhVarArr.length) {
                this.c4 = true;
                return;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null) {
                uhVar.A();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean m0() {
        this.d2.setTranslationX(0.0f);
        this.k3.setAlpha(0.0f);
        this.i3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.n4 = animatorSet;
        int i7 = 2;
        nh nhVar = this.l4;
        int i10 = 1;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, nhVar, 0.0f, 400.0f));
        this.n4.setDuration(400L);
        this.n4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        nhVar.getClass();
        nhVar.a(this, valueOf);
        this.n4.start();
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new ng(this, i7));
        r1.g gVar = this.m4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.b, (r1.e) r1.g.p, 0.0f);
        this.m4 = gVar2;
        if (this.E3 != null) {
            gVar2.m.a(0.75f);
            this.m4.m.b(350.0f);
        } else {
            gVar2.m.a(0.75f);
            this.m4.m.b(350.0f);
        }
        this.m4.h();
        if (this.J) {
            this.c.setLayerType(2, null);
        }
        this.A0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.z0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Y, l6.d, this.o0 ? this.p0 : 0));
        this.z0.setDuration(400L);
        this.z0.setStartDelay(20L);
        this.z0.setInterpolator(this.k0);
        h2.f fVar = new h2.f((int[]) null);
        mg mgVar = new mg(this, fVar, this.y0, i10);
        this.m4.a(new hi.y3(i7, this, mgVar));
        this.z0.addListener(new ah.l(25, this, mgVar));
        fVar.d();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 512);
        this.z0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new ng(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(wq.f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        this.c4 = false;
        while (true) {
            uh[] uhVarArr = this.t2;
            if (i7 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null) {
                uhVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.W3.f0();
        }
        zh zhVar = this.x3;
        if (zhVar != null) {
            zhVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.ij ijVar = this.E3;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        int i7 = this.G3;
        if (ijVar != null && ijVar.p5() && !org.telegram.messenger.t3.z(i7, 24, org.telegram.messenger.ij.B0(this.E3.k)) && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            org.telegram.messenger.nj njVar = cnVar.w5;
            if (njVar == null) {
                njVar = org.telegram.messenger.nj.b(this.E3.k.suggested_post);
            }
            if (!bi.ea.T(i7, njVar.a)) {
                cnVar.zc(njVar);
                return;
            }
        }
        if (this.E1 - this.F1 < 0) {
            org.telegram.messenger.g0.F3(this.t1);
            org.telegram.messenger.g0.F3(this.u1);
            try {
                this.F2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (org.telegram.messenger.qp.s1(i7).D3() || org.telegram.messenger.qp.s1(i7).U4 <= this.F1) {
                return;
            }
            D1(f2Var);
            return;
        }
        if (this.E3 == null && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.ui.cn cnVar2 = (org.telegram.ui.cn) f2Var;
            if (cnVar2.c()) {
                u4.J(getContext(), cnVar2.a(), new lg(this, 14), this.I0);
                return;
            }
        }
        uh uhVar = this.v2;
        if (uhVar == this.d2 || uhVar == this.k2) {
            u1(true, 0, 0, this.K2, f1());
        } else {
            if (uhVar.L(true, 0, 0, this.K2, f1())) {
                return;
            }
            this.A4 = true;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void o0() {
        if (this.v2.s()) {
            dismiss();
        }
    }

    public final void o1(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (i7 == 3) {
            if (this.K3 || !N0()) {
                Activity parentActivity = f2Var != null ? f2Var.getParentActivity() : null;
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
        if (i7 == 6 && org.telegram.messenger.g0.J1(f2Var)) {
            if (this.i2 == null) {
                vk vkVar = new vk(this, getContext(), this.I0, (this.B1 || this.O3) ? false : true);
                this.i2 = vkVar;
                this.t2[5] = vkVar;
                uk ukVar = this.t4;
                if (ukVar != null) {
                    vkVar.setDelegate(ukVar);
                } else if (f2Var instanceof org.telegram.ui.cn) {
                    vkVar.setDelegate(new lg(this, 18));
                }
            }
            F1(this.i2);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (this.M1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        q7 q7Var = this.U2;
        if (q7Var.n0) {
            q7Var.n(true);
            return;
        }
        if (this.v2.k()) {
            return;
        }
        if (a1() == null || !a1().e) {
            super.onBackPressed();
        } else {
            a1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.v2.G(i7)) {
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
            ((LaunchActivity) context).z0.add(this.M1);
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
            ((LaunchActivity) context).z0.remove(this.M1);
        }
    }

    public final void p1(boolean z9) {
        if (!this.K3 && z9) {
            bn bnVar = new bn(3, getContext(), this.I0, this);
            this.N1 = bnVar;
            F1(bnVar);
        }
        int i7 = 1;
        if (this.f2 == null) {
            mi miVar = new mi(getContext(), this.I0, this);
            this.f2 = miVar;
            this.t2[3] = miVar;
            miVar.setupBlurredSearchField(this.E4);
            this.f2.setDelegate(new lg(this, 15));
            if (this.B1) {
                this.f2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            TLRPC.Chat chat = ((org.telegram.ui.cn) f2Var).e;
            mi miVar2 = this.f2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                i7 = -1;
            }
            miVar2.setMaxSelectedFiles(i7);
        }
        if (z9) {
            F1(this.f2);
        }
    }

    public final void q1() {
        if (!this.N3) {
            bn bnVar = new bn(5, getContext(), this.I0, this);
            this.N1 = bnVar;
            F1(bnVar);
        }
        if (this.e2 == null) {
            ej ejVar = new ej(getContext(), this.I0, this);
            this.e2 = ejVar;
            this.t2[2] = ejVar;
            ejVar.setupBlurredSearchField(this.E4);
            this.e2.setDelegate(new lh(this));
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            TLRPC.Chat chat = ((org.telegram.ui.cn) f2Var).e;
            this.e2.setMultipleSelectionAllowed(chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled);
        }
        F1(this.e2);
    }

    public final void r1(boolean z9) {
        if (!this.H3 && z9) {
            bn bnVar = new bn(4, getContext(), this.I0, this);
            this.N1 = bnVar;
            F1(bnVar);
        }
        boolean z10 = false;
        if (this.j2 == null) {
            uj ujVar = new uj(this.H1 ? 2 : 0, getContext(), this.I0, this);
            this.j2 = ujVar;
            this.t2[4] = ujVar;
            ujVar.setDelegate(new mh(this));
        }
        int i7 = 1;
        if (this.B1) {
            this.j2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
            if (f2Var instanceof org.telegram.ui.cn) {
                TLRPC.Chat chat = ((org.telegram.ui.cn) f2Var).e;
                uj ujVar2 = this.j2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                    i7 = -1;
                }
                ujVar2.setMaxSelectedFiles(i7);
            } else {
                this.j2.setMaxSelectedFiles(this.P3);
                uj ujVar3 = this.j2;
                if (!this.H1 && !this.Q1) {
                    z10 = true;
                }
                ujVar3.setCanSelectOnlyImageFiles(z10);
            }
        }
        uj ujVar4 = this.j2;
        ujVar4.d0 = this.H1;
        if (z9) {
            F1(ujVar4);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            P0();
            dh.d dVar = this.V1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j5, this.I0);
            org.telegram.ui.ActionBar.r0 r0Var = this.h3;
            if (r0Var == null || w02 == this.o4) {
                return;
            }
            this.o4 = w02;
            r0Var.setIconColor(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        this.F3 = false;
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            this.h0 = ((org.telegram.ui.cn) f2Var).U9();
        }
        L1();
        this.p3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.I0), 0);
            this.G0 = o4;
            org.telegram.messenger.g0.u3(this, o4, false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.G0)) > 0.721d);
        }
        if (this.j4) {
            this.j4 = false;
            q7 q7Var = this.U2;
            q7Var.updateColors();
            q7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        q7 q7Var = this.U2;
        int i7 = 1;
        if (q7Var.n0) {
            q7Var.n(true);
        }
        this.e2 = null;
        this.m2 = null;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = null;
        this.q2 = null;
        while (true) {
            uh[] uhVarArr = this.t2;
            if (i7 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i7];
            if (uhVar != null) {
                uhVar.p();
                this.b.removeView(uhVarArr[i7]);
                uhVarArr[i7] = null;
            }
            i7++;
        }
        I1(false, false);
        super.K();
        if (this.r2) {
            this.r2 = false;
            this.s2 = 0.0f;
            org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
            if (f2Var == null || f2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = f2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void u0(boolean z9) {
        this.q0 = true;
    }

    public final boolean u1(final boolean z9, final int i7, final int i10, final long j3, final boolean z10) {
        if (this.F3) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            TLRPC.Chat chat = cnVar.e;
            if (cnVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                org.telegram.messenger.qp.s1(this.G3).d7.edit().putBoolean("silent_" + cnVar.a(), !z9).commit();
            }
        }
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.q1.f) {
            this.F3 = true;
            this.W3.o1(7, true, z9, i7, i10, j3, z10, false, 0L);
            return true;
        }
        long b12 = b1();
        uh uhVar = this.v2;
        return u4.Y(this.G3, b12, X0() + (uhVar != null ? uhVar.getSelectedItemsCount() : 1), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.zg
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                ci ciVar = ci.this;
                ciVar.F3 = true;
                ciVar.W3.o1(7, true, z9, i7, i10, j3, z10, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        if (this.Z1 instanceof org.telegram.ui.cn) {
            String[] strArr = MediaController.V1;
        } else {
            String[] strArr2 = MediaController.V1;
        }
        this.v2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754921, "AccDescrAttachButton"));
        this.p3 = true;
        if (this.J3 || this.I3) {
            return;
        }
        N0();
    }

    public final void v1(boolean z9, boolean z10) {
        this.l1.a(z9, z10);
        kt a12 = a1();
        this.W1 = z9;
        kt a13 = a1();
        final boolean z11 = this.A2.getTag() != null;
        uh uhVar = this.v2;
        final boolean z12 = this.W1 && (uhVar == this.d2 || uhVar == this.k2);
        bi.x5 x5Var = this.L2;
        kg.j jVar = this.z2;
        if (z10) {
            x5Var.setVisibility(z11 ? 0 : 8);
            ViewPropertyAnimator duration = x5Var.animate().alpha((z12 && z11) ? 1.0f : 0.0f).setDuration(320L);
            wq wqVar = wq.h;
            final int i7 = 0;
            duration.setInterpolator(wqVar).setUpdateListener(new ng(this, i7)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.og
                public final /* synthetic */ ci b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            ci ciVar = this.b;
                            if (!z12 || !z11) {
                                ciVar.L2.setVisibility(8);
                            }
                            ciVar.Q1();
                            break;
                        default:
                            if (z12 || !z11) {
                                this.b.z2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z12 || !z11) ? jVar.getMeasuredHeight() : 0.0f).alpha((z12 || !z11) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(wqVar);
            final int i10 = 1;
            interpolator.setUpdateListener(new ng(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.og
                public final /* synthetic */ ci b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ci ciVar = this.b;
                            if (!z12 || !z11) {
                                ciVar.L2.setVisibility(8);
                            }
                            ciVar.Q1();
                            break;
                        default:
                            if (z12 || !z11) {
                                this.b.z2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            x5Var.setVisibility((z12 && z11) ? 0 : 8);
            x5Var.setAlpha((z12 && z11) ? 1.0f : 0.0f);
            Q1();
            jVar.setAlpha((z12 || !z11) ? 0.0f : 1.0f);
            jVar.setTranslationY((z12 || !z11) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z12 || !z11) ? 8 : 0);
        }
        if (a12 != a13) {
            a12.k(true);
            a13.setText(q5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new pg(this, 0));
    }

    public final void w1(int i7, org.telegram.messenger.ij ijVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (ijVar != null && (chatAttachAlertPhotoLayout = this.d2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.E3 == ijVar && this.D3 == i7) {
            return;
        }
        this.E3 = ijVar;
        if (ijVar != null && ijVar.z2()) {
            i7 = this.E3.I3() ? 2 : this.E3.U2() ? 1 : 0;
        }
        this.D3 = i7;
        if (this.E3 != null) {
            this.P3 = 1;
            this.Q3 = false;
        } else {
            this.P3 = -1;
            this.Q3 = true;
        }
        this.x3.f();
        K1(0);
    }

    @Override // org.telegram.ui.ActionBar.q2
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i7;
        float translationY = this.b.getTranslationY() - this.s2;
        this.s2 = this.b.getHeight() * f10;
        this.b.setTranslationY(translationY);
        hk hkVar = this.q2;
        if (hkVar != null) {
            hkVar.setSendTransitionProgress(f10);
        }
        if (this.o0) {
            i7 = Math.round((1.0f - f10) * this.p0);
        } else {
            i7 = 0;
        }
        this.Y.setAlpha(i7);
        this.C0 = 1.0f - f10;
        this.c.invalidate();
    }

    public final void y1(int i7, boolean z9) {
        if (this.E3 != null) {
            return;
        }
        this.P3 = i7;
        this.Q3 = z9;
    }

    public final void z1(float f10) {
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.I0), Math.min(org.telegram.messenger.qs.e4, Math.max(0, (int) (f10 * 255.0f))));
        this.G0 = o4;
        org.telegram.messenger.g0.u3(this, o4, false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.G0)) > 0.721d);
        this.c.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, boolean z11, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        org.telegram.ui.ActionBar.r0 r0Var;
        ei.k kVar;
        boolean z12;
        float f10;
        int i7 = 1;
        int i10 = 0;
        wq wqVar = wq.h;
        this.l1 = new te.a(0, this, wqVar, 380L, false);
        this.m1 = new te.a(1, this, wqVar, 380L, false);
        this.n1 = new te.a(2, this, wqVar, 380L, false);
        this.o1 = new te.a(3, this, wqVar, 380L, false);
        this.p1 = new te.a(4, this, wqVar, 380L, true);
        this.q1 = new te.a(5, this, wqVar, 320L, false);
        te.j jVar = new te.j(new lg(this, 2), wqVar, 380L);
        this.r1 = jVar;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.X1 = 0.0f;
        this.Y1 = new nh(this, 0);
        this.c2 = false;
        uh[] uhVarArr = new uh[12];
        this.t2 = uhVarArr;
        this.u2 = new LongSparseArray();
        this.D2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G2 = textPaint;
        this.H2 = new RectF();
        this.I2 = new Paint(1);
        this.R2 = true;
        this.S2 = 1.0f;
        this.y3 = false;
        this.A3 = false;
        int i11 = org.telegram.messenger.p10.s0;
        this.G3 = i11;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.M3 = true;
        this.N3 = true;
        this.P3 = -1;
        this.Q3 = true;
        this.V3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.Y3 = new int[2];
        new Paint(1);
        this.f4 = false;
        ArrayList arrayList = new ArrayList();
        this.g4 = arrayList;
        Rect rect = new Rect();
        this.h4 = rect;
        this.l4 = new nh(this, 1);
        this.r4 = true;
        this.s4 = false;
        this.z4 = false;
        this.A4 = false;
        this.y = true;
        ri.c cVar = new ri.c();
        this.D4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.I0));
        this.X0.E.add(new oi.o(cVar, new lg(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.iz.f()) {
            this.C4 = null;
            this.E4 = new dh.c(cVar, cVar, cVar);
            this.F4 = new dh.c(cVar, cVar, cVar);
        } else {
            dh.g gVar = new dh.g(false);
            this.C4 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(cVar);
            fVar.f = cVar;
            fVar.d = gVar;
            fVar.e = -2;
            ri.f fVar2 = new ri.f(null);
            fVar2.f = cVar;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.E4 = cVar2;
            cVar2.k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.F4 = cVar3;
            cVar3.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.e = L2;
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.G4 = new tg(this, i10);
        this.e4 = z9;
        this.a2 = (f2Var instanceof org.telegram.ui.cn) && f2Var.isInBubbleMode();
        this.k0 = new OvershootInterpolator(0.7f);
        this.Z1 = f2Var;
        this.F = true;
        this.y0 = this;
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.f5);
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.F1);
        arrayList.add(rect);
        ph phVar = new ph(this, context);
        this.o3 = phVar;
        phVar.setDelegate(new qh(this));
        this.b = phVar;
        phVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i12 = this.t0;
        viewGroup.setPadding(i12, 0, i12, 0);
        q7 q7Var = new q7(this, context, h6Var, i7);
        this.U2 = q7Var;
        q7Var.c1 = true;
        q7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        q7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i13 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i13, h6Var);
        int i14 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, i14, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, i13, h6Var);
        q7Var.setOccupyStatusBar(true);
        q7Var.setAlpha(0.0f);
        q7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 12));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i13, this.I0), false, h6Var);
        this.X2 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(R.drawable.ic_ab_other);
        r0Var2.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        r0Var2.setVisibility(4);
        r0Var2.setAlpha(0.0f);
        r0Var2.setScaleX(0.6f);
        r0Var2.setScaleY(0.6f);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setDelegate(new lg(this, 10));
        r0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 6, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(r0Var2, h02, null, M, h6Var);
        final int i15 = 5;
        r0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i15) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i16 = 0; i16 < chatAttachAlertPhotoLayout.E.getChildCount(); i16++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i16);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var3 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var3.getWidth() / 2.0f) + r0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i13, this.I0), false, h6Var);
        this.Z2 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        fi.u uVar = new fi.u();
        this.Y2 = uVar;
        r0Var3.setIcon(uVar);
        r0Var3.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        r0Var3.setVisibility(8);
        r0Var3.setAlpha(0.0f);
        r0Var3.setScaleX(0.6f);
        r0Var3.setScaleY(0.6f);
        r0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        final int i16 = 6;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 6, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        r0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(r0Var3, h03, null, M2, h6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i16) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        ei.k kVar2 = new ei.k(this, context);
        org.telegram.ui.ActionBar.t6.U(kVar2, org.telegram.ui.ActionBar.m6.Gi, h6Var);
        kVar2.setText(org.telegram.messenger.id.M0(2131751753, null));
        kVar2.setTypeface(org.telegram.messenger.g0.o());
        kVar2.setTextSize(1, 14.0f);
        kVar2.setVisibility(4);
        kVar2.setAlpha(0.0f);
        kVar2.setGravity(17);
        kVar2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        kVar2.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        final int i17 = 7;
        kVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i17) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        c8.ka.a(kVar2);
        this.c3 = kVar2;
        L1();
        if (f2Var != null) {
            r0Var = r0Var3;
            kVar = kVar2;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.r0 r0Var4 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i13, this.I0), false, h6Var);
            this.b3 = r0Var4;
            r0Var4.setLongClickEnabled(false);
            r0Var4.setIcon(R.drawable.outline_header_search);
            r0Var4.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
            r0Var4.setVisibility(4);
            z12 = false;
            r0Var4.setAlpha(0.0f);
            r0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 6, -1);
            org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i14);
            r0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.t6.j(r0Var4, h04, null, M3, h6Var);
            r0Var4.setOnClickListener(new di.a2(5, this, z10));
        } else {
            r0Var = r0Var3;
            kVar = kVar2;
            z12 = false;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.r0 r0Var5 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i13, this.I0), false, h6Var);
        this.h3 = r0Var5;
        r0Var5.setLongClickEnabled(false);
        r0Var5.setIcon(R.drawable.ic_ab_other);
        r0Var5.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        final int i18 = 8;
        r0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 3, -1);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i14);
        r0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(r0Var5, h05, null, M4, h6Var);
        final int i19 = 2;
        r0Var5.e(1, R.drawable.msg_addbot, org.telegram.messenger.id.M0(2131744877, null)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        final ci ciVar = this.b;
                        fh fhVar = ciVar.B2;
                        if (fhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(ciVar.getContext(), h6Var);
                            f0Var.r1(fhVar.getText());
                            final int i20 = 0;
                            f0Var.e2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ug
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            fh fhVar2 = ciVar.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            hh hhVar = ciVar.M2;
                                            hhVar.setText(charSequence);
                                            hhVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = ciVar.T1;
                            boolean z13 = ciVar.E3 != null;
                            vg vgVar = new vg(ciVar, 0);
                            f0Var.g2 = j3;
                            f0Var.h2 = z13;
                            f0Var.i2 = vgVar;
                            f0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ci ciVar2 = this.b;
                        hh hhVar = ciVar2.M2;
                        if (hhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(ciVar2.getContext(), h6Var);
                            f0Var2.r1(hhVar.getText());
                            final int i21 = 1;
                            f0Var2.e2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ug
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            fh fhVar2 = ciVar2.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            hh hhVar2 = ciVar2.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = ciVar2.T1;
                            boolean z14 = ciVar2.E3 != null;
                            vg vgVar2 = new vg(ciVar2, 1);
                            f0Var2.g2 = j10;
                            f0Var2.h2 = z14;
                            f0Var2.i2 = vgVar2;
                            f0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ci ciVar3 = this.b;
                        ciVar3.h3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar3.Z1;
                        p12.H2(null, f2Var2, h6Var);
                        PhotoViewer.p1().I2(ciVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i22 = ciVar3.P3;
                        boolean z15 = ciVar3.Q3;
                        p13.h = i22;
                        p13.n = z15;
                        if (!ciVar3.W3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(ciVar3.c.findFocus());
                        }
                        File w10 = fi.e7.w(ciVar3.G3, "webp");
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
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer.p1().e2(arrayList2, 0, 11, false, new th(ciVar3, gfVar), f2Var2 instanceof org.telegram.ui.cn ? (org.telegram.ui.cn) f2Var2 : null);
                        if (ciVar3.A1) {
                            PhotoViewer.p1().S0(null, null, true, ciVar3.D1);
                            break;
                        }
                        break;
                }
            }
        });
        r0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        r0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        r0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i18) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        final int i20 = 0;
        ch chVar = new ch(this, context, i20);
        this.f3 = chVar;
        chVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i20) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar5.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        chVar.setAlpha(0.0f);
        chVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.g3 = textView;
        org.telegram.messenger.k5.n(textView, i13, h6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.x(imageView, mutate, i13, h6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ha.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        chVar.addView(linearLayout, c8.ha.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.t6.x(imageView2, mutate2, i13, h6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ha.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l3 = textView2;
        org.telegram.messenger.k5.n(textView2, i13, h6Var, 1, 16.0f);
        org.telegram.messenger.k5.m(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ha.r(-2, -2, 16));
        chVar.addView(linearLayout2, c8.ha.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z9, z11, h6Var);
        this.d2 = chatAttachAlertPhotoLayout;
        uhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.v2 = chatAttachAlertPhotoLayout;
        this.T2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, c8.ha.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.s3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.b.addView(fVar3, c8.ha.g());
        this.b.addView(chVar, c8.ha.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bi.x5 x5Var = new bi.x5(context, 12);
        this.L2 = x5Var;
        this.b.addView(x5Var, c8.ha.e(-1, -2, 55));
        this.b.addView(q7Var, c8.ha.c(-2.0f, -1));
        this.b.addView(r0Var2, c8.ha.e(48, 48, 53));
        this.b.addView(r0Var, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var6 = this.b3;
        if (r0Var6 != null) {
            this.b.addView(r0Var6, c8.ha.e(48, 48, 53));
        }
        chVar.addView(r0Var5, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(kVar, c8.ha.e(-2, 48, 53));
        ch chVar2 = new ch(this, context, 1);
        this.u3 = chVar2;
        dh dhVar = new dh(context, 0);
        this.v3 = dhVar;
        dhVar.setClipChildren(true);
        dhVar.setClipToPadding(false);
        zh zhVar = new zh(this, context);
        this.x3 = zhVar;
        dhVar.setAdapter(zhVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.w3 = b0Var;
        dhVar.setLayoutManager(b0Var);
        dhVar.setVerticalScrollBarEnabled(false);
        dhVar.setHorizontalScrollBarEnabled(false);
        dhVar.setItemAnimator(null);
        dhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.t6.l(dhVar, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        dhVar.y2 = true;
        dhVar.setOverScrollMode(2);
        dh.c cVar5 = this.E4;
        oi.q qVar = this.X0;
        cVar5.j = qVar;
        this.F4.j = qVar;
        cVar4.j = qVar;
        eh ehVar = new eh(this, context, 0);
        this.t3 = ehVar;
        dh.d dVar = new dh.d(cVar4.c(ehVar, null, false));
        this.V1 = dVar;
        if (org.telegram.messenger.iz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.b.addView(ehVar, c8.ha.g());
        fh.g c10 = this.E4.c(chVar2, c8.g0.f(h6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        chVar2.setBackground(c10);
        dhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        dhVar.setClipToOutline(true);
        int L3 = org.telegram.messenger.g0.L(11.0f);
        float L4 = org.telegram.messenger.g0.L(28.0f);
        bg.q0 q0Var = bg.u0.a;
        dhVar.setOutlineProvider(new bg.s0(L3, L4));
        dhVar.setImportantForAccessibility(1);
        chVar2.addView(dhVar, c8.ha.g());
        this.b.addView(chVar2, c8.ha.e(-1, 70, 81));
        dhVar.setOnItemClickListener(new di.q4(9, this, h6Var));
        dhVar.setOnItemLongClickListener(new lg(this, 3));
        i6 i6Var = new i6(context, true, false, true);
        this.B3 = i6Var;
        i6Var.setVisibility(8);
        i6Var.setAlpha(0.0f);
        i6Var.setGravity(17);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        int L5 = org.telegram.messenger.g0.L(16.0f);
        i6Var.setPadding(L5, 0, L5, 0);
        i6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        final int i21 = 1;
        i6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i21) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        this.b.addView(i6Var, c8.ha.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, c8.ha.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i22 = org.telegram.ui.ActionBar.m6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView3, i22, h6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i23 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i23) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        ch chVar3 = new ch(this, context, i23);
        this.A2 = chVar3;
        kg.j jVar2 = new kg.j(this, context);
        this.z2 = jVar2;
        chVar3.addView(jVar2, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        fh.g c11 = this.F4.c(phVar, c8.g0.n(h6Var), false);
        this.x2 = c11;
        c11.S = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.Q.g = 0.4f;
        c11.n();
        fh.g c12 = this.E4.c(jVar2, c8.g0.n(h6Var), false);
        this.y2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar2.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        chVar3.setWillNotDraw(false);
        chVar3.setVisibility(4);
        chVar3.setAlpha(0.0f);
        this.b.addView(chVar3, c8.ha.e(-1, -2, 83));
        chVar3.setOnTouchListener(new ei.b(13));
        i6 i6Var2 = new i6(context, false, false, false);
        this.t1 = i6Var2;
        i6Var2.setAllowCancel(true);
        i6Var2.setScaleProperty(0.6f);
        i6Var2.setVisibility(8);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i24 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i24, h6Var);
        i6Var2.setTypeface(org.telegram.messenger.g0.o());
        i6Var2.setGravity(17);
        jVar2.addView(i6Var2, c8.ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.v1 = imageView4;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
        this.w1 = v2Var;
        imageView4.setImageDrawable(v2Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.m6.Kl;
        org.telegram.ui.ActionBar.t6.s(imageView4, i25, h6Var, mode);
        int i26 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i26, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i26);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(imageView4, h06, null, M5, h6Var);
        jVar2.addView(imageView4, c8.ha.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final ci ciVar = this.b;
                        fh fhVar = ciVar.B2;
                        if (fhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(ciVar.getContext(), h6Var);
                            f0Var.r1(fhVar.getText());
                            final int i202 = 0;
                            f0Var.e2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ug
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            fh fhVar2 = ciVar.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            hh hhVar2 = ciVar.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = ciVar.T1;
                            boolean z13 = ciVar.E3 != null;
                            vg vgVar = new vg(ciVar, 0);
                            f0Var.g2 = j3;
                            f0Var.h2 = z13;
                            f0Var.i2 = vgVar;
                            f0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ci ciVar2 = this.b;
                        hh hhVar = ciVar2.M2;
                        if (hhVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(ciVar2.getContext(), h6Var);
                            f0Var2.r1(hhVar.getText());
                            final int i212 = 1;
                            f0Var2.e2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ug
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            fh fhVar2 = ciVar2.B2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            hh hhVar2 = ciVar2.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = ciVar2.T1;
                            boolean z14 = ciVar2.E3 != null;
                            vg vgVar2 = new vg(ciVar2, 1);
                            f0Var2.g2 = j10;
                            f0Var2.h2 = z14;
                            f0Var2.i2 = vgVar2;
                            f0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ci ciVar3 = this.b;
                        ciVar3.h3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar3.Z1;
                        p12.H2(null, f2Var2, h6Var);
                        PhotoViewer.p1().I2(ciVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i222 = ciVar3.P3;
                        boolean z15 = ciVar3.Q3;
                        p13.h = i222;
                        p13.n = z15;
                        if (!ciVar3.W3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(ciVar3.c.findFocus());
                        }
                        File w10 = fi.e7.w(ciVar3.G3, "webp");
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
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer.p1().e2(arrayList2, 0, 11, false, new th(ciVar3, gfVar), f2Var2 instanceof org.telegram.ui.cn ? (org.telegram.ui.cn) f2Var2 : null);
                        if (ciVar3.A1) {
                            PhotoViewer.p1().S0(null, null, true, ciVar3.D1);
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
        this.E1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).H0();
        fh fhVar = new fh(this, context, phVar, h6Var);
        this.B2 = fhVar;
        fhVar.J = true;
        fhVar.setHint(org.telegram.messenger.id.M0(2131754454, "AddCaption"));
        fhVar.s();
        fhVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        fhVar.getEditText().addTextChangedListener(new gh(this, 0));
        jVar2.addView(fhVar, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar2.setClipChildren(false);
        chVar3.setClipChildren(false);
        fhVar.setClipChildren(false);
        x5Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        x5Var.setWillNotDraw(false);
        hh hhVar = new hh(this, context, phVar, h6Var);
        this.M2 = hhVar;
        hhVar.J = true;
        hhVar.getEditText().addTextChangedListener(new jh(this, f2Var));
        hhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        hhVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        hhVar.getEditText().setTextSize(1, 17.0f);
        hhVar.getEmojiButton().setLayoutParams(c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        hhVar.setHint(org.telegram.messenger.id.M0(2131754454, "AddCaption"));
        x5Var.addView(hhVar, c8.ha.e(-1, -2, org.telegram.messenger.qs.E1));
        x5Var.setAlpha(0.0f);
        x5Var.setVisibility(8);
        fhVar.addView(imageView3, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.E4.c(x5Var, c8.g0.n(h6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        x5Var.setBackground(c13);
        x5Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        i6 i6Var3 = new i6(context, false, false, false);
        this.u1 = i6Var3;
        i6Var3.setScaleProperty(0.6f);
        i6Var3.setVisibility(8);
        i6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(i6Var3, i24, h6Var);
        i6Var3.setTypeface(org.telegram.messenger.g0.o());
        i6Var3.setGravity(17);
        i6Var3.setAllowCancel(true);
        x5Var.addView(i6Var3, c8.ha.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.t6.s(imageView5, org.telegram.ui.ActionBar.m6.Le, h6Var, mode2);
        hhVar.addView(imageView5, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i28 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i28) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.x1 = imageView6;
        org.telegram.ui.ActionBar.v2 v2Var2 = new org.telegram.ui.ActionBar.v2(context);
        this.y1 = v2Var2;
        imageView6.setImageDrawable(v2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView6, i25, h6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i26, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M6 = org.telegram.ui.ActionBar.t6.M(i26);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.t6.j(imageView6, h07, null, M6, h6Var);
        x5Var.addView(imageView6, c8.ha.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final ci ciVar = this.b;
                        fh fhVar2 = ciVar.B2;
                        if (fhVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(ciVar.getContext(), h6Var);
                            f0Var.r1(fhVar2.getText());
                            final int i202 = 0;
                            f0Var.e2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ug
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            fh fhVar22 = ciVar.B2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            hh hhVar2 = ciVar.M2;
                                            hhVar2.setText(charSequence);
                                            hhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = ciVar.T1;
                            boolean z13 = ciVar.E3 != null;
                            vg vgVar = new vg(ciVar, 0);
                            f0Var.g2 = j3;
                            f0Var.h2 = z13;
                            f0Var.i2 = vgVar;
                            f0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ci ciVar2 = this.b;
                        hh hhVar2 = ciVar2.M2;
                        if (hhVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(ciVar2.getContext(), h6Var);
                            f0Var2.r1(hhVar2.getText());
                            final int i212 = 1;
                            f0Var2.e2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ug
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            fh fhVar22 = ciVar2.B2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            hh hhVar22 = ciVar2.M2;
                                            hhVar22.setText(charSequence);
                                            hhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = ciVar2.T1;
                            boolean z14 = ciVar2.E3 != null;
                            vg vgVar2 = new vg(ciVar2, 1);
                            f0Var2.g2 = j10;
                            f0Var2.h2 = z14;
                            f0Var2.i2 = vgVar2;
                            f0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ci ciVar3 = this.b;
                        ciVar3.h3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar3.Z1;
                        p12.H2(null, f2Var2, h6Var);
                        PhotoViewer.p1().I2(ciVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i222 = ciVar3.P3;
                        boolean z15 = ciVar3.Q3;
                        p13.h = i222;
                        p13.n = z15;
                        if (!ciVar3.W3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(ciVar3.c.findFocus());
                        }
                        File w10 = fi.e7.w(ciVar3.G3, "webp");
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
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer.p1().e2(arrayList2, 0, 11, false, new th(ciVar3, gfVar), f2Var2 instanceof org.telegram.ui.cn ? (org.telegram.ui.cn) f2Var2 : null);
                        if (ciVar3.A1) {
                            PhotoViewer.p1().S0(null, null, true, ciVar3.D1);
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
        ch chVar4 = new ch(this, context, 3);
        this.E2 = chVar4;
        chVar4.setFocusable(true);
        chVar4.setFocusableInTouchMode(true);
        chVar4.setVisibility(4);
        chVar4.setScaleX(0.2f);
        chVar4.setScaleY(0.2f);
        chVar4.setAlpha(0.0f);
        chVar4.setClipChildren(false);
        chVar4.setClipToPadding(false);
        this.b.addView(chVar4, c8.ha.e(org.telegram.messenger.qs.v1, 50, 85));
        kh khVar = new kh(context, h6Var, this);
        this.F2 = khVar;
        khVar.setImportantForAccessibility(2);
        chVar4.addView(khVar, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        khVar.setTranslationX(this.t0);
        int L6 = org.telegram.messenger.g0.L(52.0f);
        int L7 = org.telegram.messenger.g0.L(38.0f);
        khVar.I = L6;
        khVar.J = L7;
        float L8 = org.telegram.messenger.g0.L(7.0f);
        float L9 = org.telegram.messenger.g0.L(6.0f);
        khVar.M = L8;
        khVar.N = L9;
        khVar.h0 = true;
        final int i30 = 4;
        khVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qg
            public final /* synthetic */ ci b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i30) {
                    case 0:
                        ci ciVar = this.b;
                        ciVar.O1(ciVar.v2 != ciVar.k2);
                        break;
                    case 1:
                        ci ciVar2 = this.b;
                        long j3 = ciVar2.T2;
                        if (j3 < 0 && (c4Var = (hi.c4) ciVar2.u2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ci ciVar3 = this.b;
                        boolean z13 = ciVar3.W1;
                        if (!z13) {
                            ciVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ci ciVar4 = this.b;
                        boolean z14 = ciVar4.W1;
                        if (z14) {
                            ciVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.X2.U(null, null);
                        break;
                    case 6:
                        ci ciVar5 = this.b;
                        if (ciVar5.d2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ciVar5.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            ciVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = ciVar5.Z2;
                            fi.m3 m3Var = ciVar5.a3;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(ciVar5.getContext(), 1);
                            ciVar5.a3 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748832 : 2131748833, null)));
                            ciVar5.a3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            ciVar5.a3.p(1.0f, -((ciVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            ciVar5.a3.setTranslationY(ciVar5.X2.getTranslationY());
                            fi.m3 m3Var3 = ciVar5.a3;
                            m3Var3.q0 = new org.telegram.ui.fq(12, ciVar5, m3Var2);
                            ciVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            ciVar5.a3.w();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.v2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.h3.U(null, null);
                        break;
                }
            }
        });
        khVar.setOnLongClickListener(new org.telegram.ui.pf(this, context, h6Var, f2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        eh ehVar2 = new eh(this, context, 1);
        ehVar2.setAlpha(0.0f);
        ehVar2.setScaleX(0.2f);
        ehVar2.setScaleY(0.2f);
        if (z9) {
            P0();
            this.F0 = -1;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().a(this.E4, c8.g0.n(h6Var));
        ec0 ec0Var = new ec0(context);
        this.M1 = ec0Var;
        this.b.addView(ec0Var, c8.ha.c(-1.0f, -1));
        gh.e eVar = new gh.e(h6Var);
        eVar.e = new lg(this, 5);
        eVar.c = new lg(this, 6);
        eVar.d = new lg(this, 7);
        eVar.b = new lg(this, 8);
        float N = org.telegram.messenger.g0.N(3.3333333f);
        float N2 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.n = N;
        eVar.r = N2;
        float N3 = org.telegram.messenger.g0.N(1.0f);
        float N4 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f = N3;
        eVar.h = N4;
        q7Var.O(this.E4, eVar, false);
        jVar.f(1L, false);
        this.X0.i(this.b);
        oi.q qVar2 = this.X0;
        qVar2.a = new lg(this, 9);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
