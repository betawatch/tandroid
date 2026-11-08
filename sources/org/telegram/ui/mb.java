package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mb extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static int Q0 = 10;
    public static final int[] R0 = {org.telegram.messenger.qs.T, org.telegram.messenger.qs.s, org.telegram.messenger.qs.t, org.telegram.messenger.qs.D, org.telegram.messenger.qs.G0};
    public boolean A0;
    public final ab B0;
    public db C0;
    public org.telegram.ui.Components.ri0 D;
    public final ArrayList D0;
    public jb E;
    public final a0.h E0;
    public TextView F;
    public ya F0;
    public lh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.kn I;
    public qa I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.q1 J0;
    public ImageView K;
    public int K0;
    public bi.md L;
    public final lb L0;
    public org.telegram.ui.Cells.t0 M;
    public long M0;
    public org.telegram.ui.ActionBar.r0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public final RectF P0;
    public boolean Q;
    public AnimatorSet R;
    public boolean S;
    public final int[] T;
    public boolean U;
    public boolean V;
    public lh.f W;
    public kb X;
    public org.telegram.messenger.ij Y;
    public TLRPC.ChannelParticipant Z;
    public final ri.g a;
    public FrameLayout a0;
    public final dh.c b;
    public ImageView b0;
    public final dh.c c;
    public org.telegram.ui.ActionBar.k5 c0;
    public final dh.g d;
    public k0 d0;
    public final int e;
    public j4 e0;
    public final TLRPC.Chat f;
    public TextureView f0;
    public int g0;
    public final ArrayList h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final a0.h k0;
    public final a0.h l0;
    public final HashMap m0;
    public FrameLayout n;
    public final ArrayList n0;
    public final ArrayList o0;
    public final HashSet p0;
    public boolean q0;
    public View r;
    public boolean r0;
    public RadialProgressView s;
    public boolean s0;
    public ArrayList t0;
    public TLRPC.TL_channelAdminLogEventsFilter u0;
    public String v0;
    public bi.q1 w;
    public a0.h w0;
    public UndoView x;
    public final h2.f x0;
    public jg.b0 y;
    public final HashMap y0;
    public HashMap z0;

    public mb(TLRPC.Chat chat) {
        super(null);
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = true;
        this.j0 = false;
        this.k0 = new a0.h();
        this.l0 = new a0.h();
        this.m0 = new HashMap();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new HashSet();
        this.u0 = null;
        this.v0 = "";
        this.x0 = new h2.f(R0);
        this.y0 = new HashMap();
        this.B0 = new ab(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1;
        this.L0 = new lb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        oi.q qVar = this.glassEngine;
        qVar.a = new ra(this);
        qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
        ri.g gVar = new ri.g();
        this.a = gVar;
        dh.c cVar = new dh.c(gVar, gVar, gVar);
        this.b = cVar;
        cVar.j = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.iz.f()) {
            this.d = null;
            this.e = 0;
            dh.c cVar2 = new dh.c(gVar, gVar, gVar);
            this.c = cVar2;
            cVar2.j = this.glassEngine;
        } else {
            dh.g gVar2 = new dh.g(false);
            this.d = gVar2;
            this.glassEngine.a(gVar2);
            ri.f fVar = new ri.f(gVar);
            fVar.d = gVar2;
            fVar.e = -3;
            fVar.f = gVar;
            if (org.telegram.messenger.sc.e(262144)) {
                ri.f fVar2 = new ri.f(gVar);
                fVar2.d = gVar2;
                fVar2.e = -2;
                fVar2.f = gVar;
                dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
                this.c = cVar3;
                cVar3.j = this.glassEngine;
                int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
                cVar3.d = L;
                cVar3.e = L;
                cVar3.k = true;
                this.e = 0;
            } else {
                dh.c cVar4 = new dh.c(fVar, fVar, fVar);
                this.c = cVar4;
                cVar4.j = this.glassEngine;
                int L2 = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
                cVar4.d = L2;
                cVar4.e = L2;
                this.e = org.telegram.messenger.g0.L(48.0f);
            }
        }
        this.f = chat;
    }

    public static void A0(mb mbVar, org.telegram.messenger.ij ijVar) {
        if (mbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
        if (ijVar.D == 3) {
            u1Var.T = org.telegram.messenger.id.M0(2131748179, null);
        } else {
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131748206, ijVar.F0().mime_type);
        }
        mbVar.showDialog(u1Var);
    }

    public static void F0(mb mbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.qp messagesController = mbVar.getMessagesController();
        TLRPC.Chat chat = mbVar.f;
        TLRPC.ChatFull N0 = messagesController.N0(chat.id);
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(mbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, N0, hashMap, mbVar, N0.id, false, org.telegram.messenger.t3.T(chat));
        m50Var.a2 = new bb(mbVar);
        m50Var.show();
    }

    public static void P0(mb mbVar) {
        if (mbVar.w == null || mbVar.n0.isEmpty()) {
            return;
        }
        mbVar.y.h1(mbVar.o0.size() - 1, (-100000) - mbVar.w.getPaddingTop());
    }

    public static uw0 X0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.wp wpVar : (org.telegram.ui.Components.wp[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.wp.class)) {
            if (wpVar != null) {
                Drawable drawable = wpVar.c;
                if (drawable instanceof uw0) {
                    return (uw0) drawable;
                }
            }
        }
        return null;
    }

    public static void Z(mb mbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.ij ijVar;
        a0.h hVar = mbVar.k0;
        int i7 = 0;
        mbVar.C0.N = false;
        mbVar.b1(false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = mbVar.n0;
        boolean z9 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                mbVar.O = Math.min(mbVar.O, tL_channelAdminLogEvent.id);
                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(mbVar.currentAccount, tL_channelAdminLogEvent, arrayList, mbVar.m0, mbVar.f, mbVar.T, false);
                if (ijVar2.U >= 0) {
                    hVar.k(ijVar2, tL_channelAdminLogEvent.id);
                }
                z9 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(size);
            if (ijVar3 != null && ijVar3.U != 0 && ijVar3.M1() >= 0) {
                mbVar.l0.k(ijVar3, ijVar3.M1());
            }
            if (ijVar3 != null && (message = ijVar3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            ijVar = null;
                            break;
                        }
                        if (size != i11) {
                            ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
                            if (ijVar.U != 1 && ijVar.M1() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i11++;
                    }
                    if (ijVar != null) {
                        ijVar3.C = ijVar;
                    }
                }
                arrayList2.add(ijVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.ui.b0(mbVar.currentAccount).X0(arrayList2, -mbVar.f.id, 0, 0L, new qa(mbVar, 1), mbVar.getClassGuid(), null);
        }
        mbVar.W0();
        mbVar.r0 = false;
        if (!z9) {
            mbVar.q0 = true;
        }
        org.telegram.messenger.g0.Z3(mbVar.n, false, 0.3f, true, true);
        mbVar.w.setEmptyView(mbVar.H);
        jb jbVar = mbVar.E;
        if (jbVar != null) {
            jbVar.f();
        }
        org.telegram.ui.ActionBar.r0 r0Var = mbVar.N;
        if (r0Var != null) {
            if (mbVar.o0.isEmpty() && TextUtils.isEmpty(mbVar.v0)) {
                i7 = 8;
            }
            r0Var.setVisibility(i7);
        }
    }

    public static void a0(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || mbVar.getParentActivity() == null) {
            return;
        }
        int i7 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, mbVar.getParentActivity(), mbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
        Rect rect = new Rect();
        mbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, mbVar.getResourceProvider());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            if (arrayList4.get(i10) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(mbVar.getParentActivity(), mbVar.getResourceProvider()), c8.ha.o(-1, 8));
            } else {
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, mbVar.getParentActivity(), mbVar.getResourceProvider(), i10 == 0, i10 == size + (-1));
                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                z0Var.j((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                    z0Var.d(mbVar.getThemedColor(org.telegram.ui.ActionBar.k6.q7), mbVar.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                }
                Integer num = (Integer) arrayList4.get(i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                z0Var.setOnClickListener(new di.t5(mbVar, i10, arrayList4, num, 1));
            }
            i10++;
            arrayList4 = arrayList;
        }
        xa xaVar = new xa(0, mbVar.X.getContext(), mbVar);
        xaVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        xaVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ya yaVar = new ya(mbVar, xaVar);
        mbVar.F0 = yaVar;
        yaVar.e = true;
        yaVar.c = org.telegram.messenger.qs.x3;
        yaVar.setOutsideTouchable(true);
        mbVar.F0.setClippingEnabled(true);
        mbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
        mbVar.F0.setFocusable(true);
        xaVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        mbVar.F0.setInputMethodMode(2);
        mbVar.F0.setSoftInputMode(48);
        mbVar.F0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f10)) - xaVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.g0.L(28.0f);
        if (left < org.telegram.messenger.g0.L(6.0f)) {
            left = org.telegram.messenger.g0.L(6.0f);
        } else if (left > (mbVar.w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - xaVar.getMeasuredWidth()) {
            left = (mbVar.w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - xaVar.getMeasuredWidth();
        }
        if (org.telegram.messenger.g0.Q1()) {
            int[] iArr = new int[2];
            mbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = mbVar.X.getHeight();
        int L = org.telegram.messenger.g0.L(48.0f) + xaVar.getMeasuredHeight();
        int Q = mbVar.X.Q();
        if (Q > org.telegram.messenger.g0.L(20.0f)) {
            height += Q;
        }
        if (L < height) {
            int y10 = (int) (mbVar.w.getY() + view.getTop() + f11);
            i7 = (L - rect.top) - rect.bottom > org.telegram.messenger.g0.L(240.0f) ? (org.telegram.messenger.g0.L(240.0f) - L) + y10 : y10;
            if (i7 < mbVar.w.getY() + org.telegram.messenger.g0.L(24.0f)) {
                i7 = (int) (mbVar.w.getY() + org.telegram.messenger.g0.L(24.0f));
            } else {
                int i11 = height - L;
                if (i7 > i11 - org.telegram.messenger.g0.L(8.0f)) {
                    i7 = i11 - org.telegram.messenger.g0.L(8.0f);
                }
            }
        } else if (!mbVar.inBubbleMode) {
            i7 = org.telegram.messenger.g0.m;
        }
        xaVar.setMaxHeight(height - i7);
        mbVar.F0.showAtLocation(mbVar.w, 51, left, i7);
        mbVar.F0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x036d, code lost:
    
        if (r0.exists() != false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(mb mbVar, int i7, ArrayList arrayList, Integer num) {
        TLRPC.Chat M0;
        File file;
        TLRPC.User a22;
        if (mbVar.Y == null || i7 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat = mbVar.f;
        ya yaVar = mbVar.F0;
        if (yaVar != null) {
            yaVar.dismiss();
        }
        org.telegram.messenger.ij ijVar = mbVar.Y;
        if (ijVar == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long Z0 = ijVar.Z0();
            if (0 != Z0) {
                if (Z0 > 0) {
                    TLRPC.User a23 = org.telegram.messenger.qp.s1(mbVar.currentAccount).a2(Long.valueOf(Z0));
                    if (a23 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name)).append((CharSequence) ":\n");
                    }
                } else if (Z0 < 0 && (M0 = org.telegram.messenger.qp.s1(mbVar.currentAccount).M0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) M0.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(ijVar.v)) {
                spannableStringBuilder.append((CharSequence) ijVar.k.message);
            } else {
                spannableStringBuilder.append(ijVar.v);
            }
            org.telegram.messenger.g0.g(spannableStringBuilder);
            org.telegram.messenger.camera.q.r(null, 2131748590, org.telegram.ui.Components.hc.a0(mbVar));
        } else if (intValue == 4) {
            String str = ijVar.k.attachPath;
            if (str != null && str.length() > 0 && !a8.p0.B(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                org.telegram.messenger.w7 fileLoader = mbVar.getFileLoader();
                TLRPC.Message message = mbVar.Y.k;
                fileLoader.getClass();
                str = org.telegram.messenger.w7.M(message, false, true).toString();
            }
            int i10 = mbVar.Y.D;
            if (i10 == 3 || i10 == 1) {
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && mbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    mbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    mbVar.Y = null;
                    mbVar.Z = null;
                    return;
                }
                MediaController.d0(str, mbVar.getParentActivity(), mbVar.Y.D == 3 ? 1 : 0, null, null, null);
            }
        } else if (intValue == 5) {
            String str2 = ijVar.k.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(mbVar.Y.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7 fileLoader2 = mbVar.getFileLoader();
                TLRPC.Message message2 = mbVar.Y.k;
                fileLoader2.getClass();
                File M = org.telegram.messenger.w7.M(message2, false, true);
                if (M.exists()) {
                    file = M;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    jg.b0 b0Var = mbVar.y;
                    if (b0Var != null) {
                        if (b0Var.N0() < mbVar.y.B() - 1) {
                            int L0 = mbVar.y.L0();
                            mbVar.g0 = L0;
                            org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) mbVar.w.K(L0);
                            if (xi0Var != null) {
                                mbVar.h0 = xi0Var.a.getTop();
                            } else {
                                mbVar.g0 = -1;
                            }
                        } else {
                            mbVar.g0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, mbVar.Y.I0(), null, true);
                    if (v != null) {
                        mbVar.presentFragment(new v71(v));
                    } else {
                        mbVar.g0 = -1;
                        if (mbVar.getParentActivity() == null) {
                            mbVar.Y = null;
                            mbVar.Z = null;
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        String M02 = org.telegram.messenger.id.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M02;
                        u1Var.T = org.telegram.messenger.id.M0(2131749201, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        mbVar.showDialog(u1Var);
                    }
                } else if (org.telegram.messenger.id.E0().e(file, mbVar.currentAccount)) {
                    mbVar.presentFragment(new LanguageSelectActivity());
                } else {
                    if (mbVar.getParentActivity() == null) {
                        mbVar.Y = null;
                        mbVar.Z = null;
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mbVar.getParentActivity());
                    String M03 = org.telegram.messenger.id.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                    u1Var2.R = M03;
                    u1Var2.T = org.telegram.messenger.id.M0(2131749202, null);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
                    mbVar.showDialog(u1Var2);
                }
            }
        } else if (intValue == 6) {
            String str3 = ijVar.k.attachPath;
            if (str3 != null && str3.length() > 0 && !a8.p0.B(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                org.telegram.messenger.w7 fileLoader3 = mbVar.getFileLoader();
                TLRPC.Message message3 = mbVar.Y.k;
                fileLoader3.getClass();
                str3 = org.telegram.messenger.w7.M(message3, false, true).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(mbVar.Y.F0().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Activity parentActivity = mbVar.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", new File(str3)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
            }
            try {
                mbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131745462, null)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            int i11 = 2;
            switch (intValue) {
                case 9:
                    mbVar.showDialog(new org.telegram.ui.Components.yv0(mbVar.getParentActivity(), mbVar, org.telegram.messenger.ij.k1(mbVar.Y.k), null, null, null));
                    break;
                case 10:
                    if ((Build.VERSION.SDK_INT > 28 && !org.telegram.messenger.r2.b) || mbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        String B = org.telegram.messenger.w7.B(mbVar.Y.F0());
                        if (TextUtils.isEmpty(B)) {
                            B = mbVar.Y.S0();
                        }
                        String str4 = B;
                        String str5 = mbVar.Y.k.attachPath;
                        if (str5 != null && str5.length() > 0 && !a8.p0.B(str5)) {
                            str5 = null;
                        }
                        if (str5 == null || str5.length() == 0) {
                            org.telegram.messenger.w7 fileLoader4 = mbVar.getFileLoader();
                            TLRPC.Message message4 = mbVar.Y.k;
                            fileLoader4.getClass();
                            str5 = org.telegram.messenger.w7.M(message4, false, true).toString();
                        }
                        MediaController.d0(str5, mbVar.getParentActivity(), mbVar.Y.J3() ? 3 : 2, str4, mbVar.Y.F0() != null ? mbVar.Y.F0().mime_type : "", null);
                        break;
                    } else {
                        mbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        mbVar.Y = null;
                        mbVar.Z = null;
                        return;
                    }
                    break;
                case 11:
                    org.telegram.messenger.qp.s1(mbVar.currentAccount).t4(mbVar.Y, ijVar.F0());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", mbVar.Y.k.media.user_id);
                            bundle.putString("phone", mbVar.Y.k.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            mbVar.presentFragment(new nr(bundle));
                            break;
                        case 16:
                            org.telegram.messenger.g0.g(ijVar.k.media.phone_number);
                            org.telegram.messenger.camera.q.r(null, 2131747296, org.telegram.ui.Components.hc.a0(mbVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + mbVar.Y.k.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                mbVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (mbVar.Z != null) {
                                        TLRPC.User a24 = mbVar.getMessagesController().a2(Long.valueOf(org.telegram.messenger.m5.o(mbVar.Z.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = mbVar.Z;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = mbVar.Z.banned_rights;
                                        tL_chatBannedRights.send_plain = true;
                                        tL_chatBannedRights.send_messages = true;
                                        tL_chatBannedRights.send_media = true;
                                        tL_chatBannedRights.send_stickers = true;
                                        tL_chatBannedRights.send_gifs = true;
                                        tL_chatBannedRights.send_games = true;
                                        tL_chatBannedRights.send_inline = true;
                                        tL_chatBannedRights.send_polls = true;
                                        tL_chatBannedRights.send_photos = true;
                                        tL_chatBannedRights.send_videos = true;
                                        tL_chatBannedRights.send_roundvideos = true;
                                        tL_chatBannedRights.send_audios = true;
                                        tL_chatBannedRights.send_voices = true;
                                        tL_chatBannedRights.send_docs = true;
                                        tL_chatBannedRights.send_reactions = true;
                                        mbVar.getMessagesController().M4(chat.id, a24, null, mbVar.Z.banned_rights, true, mbVar.getFragmentForAlert(1), new org.telegram.ui.ActionBar.p(19, mbVar, a24));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = mbVar.getMessagesController().h1(chat.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = mbVar.Y.M1();
                                    mbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new pa(mbVar, i11));
                                    break;
                                case 35:
                                    mbVar.getMessagesController().e0(chat.id, mbVar.getMessagesController().m1(mbVar.Y.k.from_id), false, new qa(mbVar, i11));
                                    if ((mbVar.Y.k.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.hc.a(mbVar) && (a22 = mbVar.getMessagesController().a2(Long.valueOf(mbVar.Y.k.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.hc.D(mbVar, a22, chat.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str6 = ijVar.k.attachPath;
            if (str6 != null && str6.length() > 0 && !a8.p0.B(str6)) {
                str6 = null;
            }
            if (str6 == null || str6.length() == 0) {
                org.telegram.messenger.w7 fileLoader5 = mbVar.getFileLoader();
                TLRPC.Message message5 = mbVar.Y.k;
                fileLoader5.getClass();
                str6 = org.telegram.messenger.w7.M(message5, false, true).toString();
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && mbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                mbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                mbVar.Y = null;
                mbVar.Z = null;
                return;
            }
            MediaController.d0(str6, mbVar.getParentActivity(), 0, null, null, null);
        }
        mbVar.Y = null;
        mbVar.Z = null;
    }

    public static void c0(mb mbVar, int i7) {
        dh.g gVar = mbVar.d;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            qi.a e10 = mbVar.glassEngine.e();
            e10.b(mbVar.w.getY(), mbVar.X.getWidth(), mbVar.w.getY() + mbVar.w.getHeight());
            gVar.h(e10);
        }
        kb kbVar = mbVar.X;
        Objects.requireNonNull(kbVar);
        gVar.e(new oa(kbVar, 0), mbVar.X.getWidth(), mbVar.X.getHeight());
    }

    public static void d0(mb mbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = mbVar.k0;
        mbVar.s0 = false;
        mbVar.C0.N = false;
        mbVar.b1(false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.qp.s1(mbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z9 = false;
        for (int i7 = 0; i7 < tL_channels_adminLogResults.events.size(); i7++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i7);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                mbVar.O = Math.min(mbVar.O, tL_channelAdminLogEvent2.id);
                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(mbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, mbVar.f, mbVar.T, false);
                if (ijVar.U >= 0 && (((tL_channelAdminLogEvent = ijVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    mbVar.n0.add(0, ijVar);
                    hVar.k(ijVar, tL_channelAdminLogEvent2.id);
                    z9 = true;
                }
            }
        }
        if (mbVar.E == null || !z9) {
            return;
        }
        mbVar.W0();
        mbVar.E.f();
    }

    public static void e0(mb mbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull N0;
        TLRPC.Chat chat = mbVar.f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            mbVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
            mbVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
            mbVar.t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (N0 = mbVar.getMessagesController().N0(chat.id)) != null && N0.antispam) {
                za zaVar = new za();
                zaVar.user_id = mbVar.getMessagesController().e5;
                zaVar.peer = mbVar.getMessagesController().z1(zaVar.user_id);
                long j3 = mbVar.getMessagesController().e5;
                if (mbVar.getMessagesController().a2(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(mbVar.currentAccount).sendRequest(tL_users_getUsers, new pa(mbVar, 1));
                }
                mbVar.t0.add(0, zaVar);
            }
            Dialog dialog = mbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.i0) {
                ((org.telegram.ui.Components.i0) dialog).e1(mbVar.t0);
            }
        }
    }

    public static void e1(int i7, org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return;
        }
        if (i7 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = ijVar.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = ijVar.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            ijVar.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.id.G(i7, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        ijVar.j5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t6 = org.telegram.messenger.g0.t(spannableStringBuilder, "\n\n");
        if (t6 >= 0 && Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(8.0f)), t6 + 1, t6 + 2, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r6.putLong("ban_chat_id", r0.id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void u0(mb mbVar, Bundle bundle, long j3) {
        TLRPC.Chat chat = mbVar.f;
        if (!chat.megagroup || mbVar.t0 == null || !org.telegram.messenger.t3.w(2, chat)) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= mbVar.t0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) mbVar.t0.get(i7);
            if (org.telegram.messenger.ij.C1(channelParticipant.peer) != j3) {
                i7++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public final org.telegram.messenger.ij S0(long j3, long j10, ArrayList arrayList, boolean z9, boolean z10) {
        org.telegram.messenger.ij ijVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.o0;
            if (i7 >= arrayList2.size()) {
                ijVar = null;
                break;
            }
            ijVar = (org.telegram.messenger.ij) arrayList2.get(i7);
            if (ijVar != null && ijVar.U == 1 && ijVar.H0 == j3) {
                break;
            }
            i7++;
        }
        if (ijVar == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.ij) arrayList.get(0)).k.date;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ijVar = new org.telegram.messenger.ij(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        ijVar.U = 1;
        if (!z10 || arrayList.size() <= 1) {
            ijVar.H0 = -1L;
        } else {
            ijVar.H0 = j3;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.ij.F5(org.telegram.messenger.id.G(arrayList.size(), z10 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new aa.l(9)).distinct().map(new Function() { // from class: org.telegram.ui.sa
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                mb mbVar = mb.this;
                mbVar.getClass();
                if (l10.longValue() >= 0) {
                    return org.telegram.messenger.t10.k(mbVar.getMessagesController().a2(l10));
                }
                TLRPC.Chat M0 = mbVar.getMessagesController().M0(Long.valueOf(-l10.longValue()));
                if (M0 == null) {
                    return null;
                }
                return M0.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new aa.m(4)).limit(4L).toArray())), "un1", a22));
        if (z10 && arrayList.size() > 1) {
            uw0 X0 = X0(ijVar.v);
            if (X0 == null) {
                X0 = new uw0(org.telegram.messenger.id.M0(z9 ? 2131751037 : 2131751036, null));
                Typeface o4 = org.telegram.messenger.g0.o();
                org.telegram.ui.Components.i6 i6Var = X0.a;
                i6Var.x(o4);
                i6Var.w(org.telegram.messenger.g0.L(10.0f));
                if (X0.c != -1) {
                    X0.c = -1;
                    X0.invalidateSelf();
                }
                X0.a(503316480);
            } else {
                X0.a.t(org.telegram.messenger.id.M0(z9 ? 2131751037 : 2131751036, null), false, true);
            }
            X0.setBounds(0, 0, X0.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(0, X0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ijVar.v = spannableStringBuilder;
        org.telegram.messenger.ij ijVar2 = arrayList.size() > 0 ? (org.telegram.messenger.ij) jg.g.i(1, arrayList) : null;
        if (ijVar2 != null) {
            long j11 = ijVar2.T;
            a0.h hVar = this.E0;
            if (!hVar.d(j11)) {
                long j12 = ijVar2.T;
                int i10 = Q0;
                Q0 = i10 + 1;
                hVar.k(Integer.valueOf(i10), j12);
            }
            ijVar.k1 = ((Integer) hVar.f(ijVar2.T)).intValue();
        }
        return ijVar;
    }

    public final void T0(boolean z9) {
        jg.b0 b0Var = this.y;
        if (b0Var == null || this.i0) {
            return;
        }
        int L0 = b0Var.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.y.N0() - L0) + 1) > 0) {
            this.E.getClass();
            if (L0 > (z9 ? 4 : 1) || this.r0 || this.q0) {
                return;
            }
            Z0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x0196, code lost:
    
        if (org.telegram.messenger.ui.b0(r1.currentAccount).B0(r10.id, true) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0198, code lost:
    
        r10 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01af, code lost:
    
        if (org.telegram.messenger.ui.b0(r1.currentAccount).N.containsKey(r10.short_name) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x069c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U0(View view, float f10, float f11) {
        Integer num;
        Integer num2;
        char c10;
        boolean z9;
        String str;
        Integer num3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        Integer num4;
        String str2;
        boolean z10;
        TLRPC.Message message;
        TLRPC.User a22;
        mb mbVar = this;
        Integer valueOf = Integer.valueOf(R.drawable.msg_gif);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_copy);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_gallery);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_download);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_share);
        org.telegram.messenger.ij messageObject = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view).getMessageObject() : null;
        if (messageObject == null) {
            return false;
        }
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = messageObject.J1;
        int i7 = messageObject.D;
        if (i7 == 6) {
            num = 5;
            num2 = 10;
        } else {
            if (i7 == 10 || i7 == 11 || i7 == 16) {
                num = 5;
                num2 = 10;
                if (messageObject.f1() != 0) {
                    c10 = 1;
                }
            } else {
                if (org.telegram.messenger.ij.S4(messageObject.k)) {
                    num = 5;
                } else if (messageObject.u4() || messageObject.K2()) {
                    num = 5;
                    TLRPC.InputStickerSet k12 = org.telegram.messenger.ij.k1(messageObject.k);
                    if (k12 instanceof TLRPC.TL_inputStickerSetID) {
                        num2 = 10;
                    } else {
                        num2 = 10;
                        if (k12 instanceof TLRPC.TL_inputStickerSetShortName) {
                        }
                        c10 = 2;
                    }
                } else {
                    if (messageObject.i4()) {
                        if (messageObject.i4()) {
                            boolean z11 = org.telegram.messenger.r2.a;
                        }
                        if (messageObject.D != 12) {
                            num = 5;
                            num2 = 10;
                            c10 = '\b';
                        } else {
                            num = 5;
                            num2 = 10;
                            if (messageObject.G3()) {
                                c10 = 3;
                            }
                            c10 = 2;
                        }
                    }
                    if ((messageObject.k.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.F0() != null || messageObject.J3() || org.telegram.messenger.ij.M4(messageObject.k)) {
                        String str3 = messageObject.k.attachPath;
                        boolean z12 = (str3 == null || str3.length() == 0 || !new File(messageObject.k.attachPath).exists()) ? false : true;
                        if (z12) {
                            num = 5;
                            z9 = z12;
                        } else {
                            org.telegram.messenger.w7 fileLoader = mbVar.getFileLoader();
                            z9 = z12;
                            TLRPC.Message message2 = messageObject.k;
                            fileLoader.getClass();
                            num = 5;
                            if (org.telegram.messenger.w7.M(message2, false, true).exists()) {
                                z9 = true;
                            }
                        }
                        if (z9) {
                            if (messageObject.F0() != null && (str = messageObject.F0().mime_type) != null) {
                                if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                                    num2 = 10;
                                    c10 = '\n';
                                } else if (str.endsWith("/xml")) {
                                    num2 = 10;
                                    c10 = 5;
                                } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                    num2 = 10;
                                    c10 = 6;
                                }
                            }
                            num2 = 10;
                            c10 = 4;
                        }
                    }
                    if (messageObject.D != 12) {
                    }
                }
                num2 = 10;
                c10 = 2;
            }
            mbVar.Y = messageObject;
            if (mbVar.getParentActivity() != null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.messenger.ij ijVar = messageObject;
            TLRPC.Chat chat = mbVar.f;
            if (chat == null || tL_channelAdminLogEvent2 == null) {
                num3 = valueOf4;
            } else {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                num3 = valueOf4;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                    TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().N0(chat.id), null, this, chat.id, false, org.telegram.messenger.t3.V(chat));
                        m50Var.b2 = false;
                        m50Var.show();
                        return true;
                    }
                }
                mbVar = this;
            }
            if (tL_channelAdminLogEvent2 != null) {
                num4 = 4;
                if ((!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent2.user_id != mbVar.getMessagesController().e5) && !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam)) {
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                } else {
                    if (view instanceof org.telegram.ui.Cells.t0) {
                        SpannableString spannableString = new SpannableString(">");
                        Drawable mutate = mbVar.getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(mbVar.getThemedColor(org.telegram.ui.ActionBar.k6.uj), PorterDuff.Mode.MULTIPLY));
                        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                        spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131750996, null)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) org.telegram.messenger.id.M0(2131752517, null));
                        spannableStringBuilder.setSpan(new fi.ka(mbVar, 3), 0, spannableStringBuilder.length(), 33);
                        org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(mbVar).I(R.raw.msg_antispam, org.telegram.messenger.id.M0(2131752460, null), org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131752461, null), spannableStringBuilder, "%s"));
                        I.j = 5000;
                        I.j();
                        return true;
                    }
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                    org.telegram.ui.Cells.f1.t(null, 2131746222, arrayList, R.drawable.msg_notspam, arrayList3);
                    arrayList2.add(34);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
            } else {
                tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                num4 = 4;
            }
            org.telegram.messenger.ij ijVar2 = mbVar.Y;
            if (ijVar2.D == 0 || ijVar2.z != null) {
                arrayList.add(org.telegram.messenger.id.M0(2131751767, null));
                arrayList3.add(valueOf2);
                arrayList2.add(3);
            }
            if (c10 == 1) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = mbVar.Y.J1;
                if (tL_channelAdminLogEvent3 != null) {
                    TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                    if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                        TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                        TLRPC.InputStickerSet inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                        if (inputStickerSet == null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                        }
                        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
                        if (inputStickerSet2 != null) {
                            showDialog(new org.telegram.ui.Components.yv0(getParentActivity(), this, inputStickerSet2, null, null, null));
                            return true;
                        }
                    }
                }
                if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                    m50 m50Var2 = new m50(chat.id, 0);
                    TLRPC.ChatFull N0 = mbVar.getMessagesController().N0(chat.id);
                    if (N0 != null) {
                        m50Var2.j0(N0);
                        mbVar.presentFragment(m50Var2);
                    }
                } else if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && org.telegram.messenger.t3.y(13, chat)) {
                    org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(mbVar.getParentActivity(), chat);
                    lpVar.s1 = new wa(mbVar);
                    mbVar.showDialog(lpVar);
                }
            } else if (c10 == 3) {
                TLRPC.MessageMedia messageMedia = mbVar.Y.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.N3(messageMedia.webpage.document)) {
                    arrayList.add(org.telegram.messenger.id.M0(2131745933, null));
                    arrayList3.add(valueOf);
                    arrayList2.add(11);
                }
            } else if (c10 != 4) {
                Integer num5 = num2;
                Integer num6 = num3;
                if (c10 == 5) {
                    org.telegram.ui.Cells.f1.t(null, 2131754217, arrayList, R.drawable.msg_language, arrayList3);
                    arrayList2.add(num);
                    arrayList.add(org.telegram.messenger.id.M0(2131745934, null));
                    arrayList3.add(num6);
                    arrayList2.add(num5);
                    arrayList.add(org.telegram.messenger.id.M0(2131745462, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num7 = num;
                    if (c10 == '\n') {
                        org.telegram.ui.Cells.f1.t(null, 2131754215, arrayList, R.drawable.msg_theme, arrayList3);
                        arrayList2.add(num7);
                        arrayList.add(org.telegram.messenger.id.M0(2131745934, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.id.M0(2131745462, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c10 == 6) {
                        arrayList.add(org.telegram.messenger.id.M0(2131745932, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(7);
                        arrayList.add(org.telegram.messenger.id.M0(2131745934, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.id.M0(2131745462, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c10 == 7) {
                        TLRPC.Message message3 = mbVar.Y.k;
                        if (org.telegram.messenger.ij.o1(message3) != null && org.telegram.messenger.ij.F3(org.telegram.messenger.ij.o1(message3).document)) {
                            arrayList.add(org.telegram.messenger.id.M0(2131754371, null));
                        } else {
                            arrayList.add(org.telegram.messenger.id.M0(2131754369, null));
                        }
                        arrayList3.add(Integer.valueOf(R.drawable.msg_sticker));
                        arrayList2.add(9);
                    } else if (c10 == '\b') {
                        long j3 = mbVar.Y.k.media.user_id;
                        TLRPC.User a23 = j3 != 0 ? org.telegram.messenger.qp.s1(mbVar.currentAccount).a2(Long.valueOf(j3)) : null;
                        if (a23 != null && a23.id != org.telegram.messenger.p10.i(mbVar.currentAccount).e() && org.telegram.messenger.g5.r(mbVar.currentAccount).f0.get(Long.valueOf(a23.id)) == null) {
                            org.telegram.ui.Cells.f1.t(null, 2131754444, arrayList, R.drawable.msg_addcontact, arrayList3);
                            arrayList2.add(15);
                        }
                        if (!TextUtils.isEmpty(mbVar.Y.k.media.phone_number)) {
                            arrayList.add(org.telegram.messenger.id.M0(2131751767, null));
                            arrayList3.add(valueOf2);
                            arrayList2.add(16);
                            arrayList.add(org.telegram.messenger.id.M0(2131752634, null));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                            arrayList2.add(17);
                        }
                    }
                }
            } else if (org.telegram.messenger.ij.M4(mbVar.Y.k)) {
                arrayList.add(org.telegram.messenger.id.M0(2131745932, null));
                arrayList3.add(valueOf3);
                arrayList2.add(num4);
                arrayList.add(org.telegram.messenger.id.M0(2131745462, null));
                arrayList3.add(valueOf5);
                arrayList2.add(6);
            } else {
                Integer num8 = num4;
                if (mbVar.Y.J3()) {
                    arrayList.add(org.telegram.messenger.id.M0(2131745914, null));
                    arrayList3.add(num3);
                    arrayList2.add(num2);
                    arrayList.add(org.telegram.messenger.id.M0(2131745462, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num9 = num2;
                    Integer num10 = num3;
                    if (mbVar.Y.F0() != null) {
                        if (org.telegram.messenger.ij.N3(mbVar.Y.F0())) {
                            str2 = null;
                            arrayList.add(org.telegram.messenger.id.M0(2131745933, null));
                            arrayList3.add(valueOf);
                            arrayList2.add(11);
                        } else {
                            str2 = null;
                        }
                        arrayList.add(org.telegram.messenger.id.M0(2131745934, str2));
                        arrayList3.add(num10);
                        arrayList2.add(num9);
                        arrayList.add(org.telegram.messenger.id.M0(2131745462, str2));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else {
                        arrayList.add(org.telegram.messenger.id.M0(2131745932, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(num8);
                    }
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = tL_channelAdminLogEvent;
            ua uaVar = new ua(mbVar, arrayList2, arrayList, arrayList3, view, f10, f11);
            if (org.telegram.messenger.t3.w(2, chat) && tL_channelAdminLogEvent4 != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                if (((channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = ijVar.k) != null && message.from_id != null && (a22 = mbVar.getMessagesController().a2(Long.valueOf(mbVar.Y.k.from_id.user_id))) != null && !org.telegram.messenger.t10.B(a22)) {
                    org.telegram.messenger.qp messagesController = mbVar.getMessagesController();
                    bi.z2 z2Var = new bi.z2(mbVar, arrayList, arrayList3, arrayList2, uaVar, 1);
                    uaVar = uaVar;
                    messagesController.K0(chat, a22, z2Var);
                    z10 = true;
                    if (!z10) {
                        return true;
                    }
                    uaVar.run();
                    return true;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        c10 = 65535;
        mbVar.Y = messageObject;
        if (mbVar.getParentActivity() != null) {
        }
    }

    public final TextureView V0(boolean z9) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.d0 == null) {
            k0 k0Var = new k0(4, getParentActivity(), this);
            this.d0 = k0Var;
            k0Var.setOutlineProvider(new bg.q0(9));
            this.d0.setClipToOutline(true);
            this.d0.setWillNotDraw(false);
            this.d0.setVisibility(4);
            j4 j4Var = new j4(getParentActivity());
            this.e0 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z9) {
                this.d0.addView(this.e0, c8.ha.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f0 = textureView;
            textureView.setOpaque(false);
            this.e0.addView(this.f0, c8.ha.c(-1.0f, -1));
        }
        if (this.d0.getParent() == null) {
            kb kbVar = this.X;
            k0 k0Var2 = this.d0;
            int i7 = org.telegram.messenger.g0.u;
            kbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i7, i7));
        }
        this.d0.setVisibility(4);
        this.e0.setDrawingReady(false);
        return this.f0;
    }

    public final void W0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList4 = this.n0;
            if (i7 >= arrayList4.size()) {
                ArrayList arrayList5 = this.o0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i7);
            long j3 = (ijVar == null || (tL_channelAdminLogEvent2 = ijVar.J1) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (ijVar.k1 <= 0) {
                int i10 = Q0;
                Q0 = i10 + 1;
                ijVar.k1 = i10;
            }
            int i11 = i7 + 1;
            org.telegram.messenger.ij ijVar2 = i11 < arrayList4.size() ? (org.telegram.messenger.ij) arrayList4.get(i11) : null;
            long j10 = (ijVar2 == null || (tL_channelAdminLogEvent = ijVar2.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j3 != 0) {
                arrayList3.add(ijVar);
            } else {
                arrayList2.add(ijVar);
            }
            if (j3 == j10 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = ijVar.k.reply_markup;
                boolean z9 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.ij) arrayList3.get(size2)).U == 1; size2--) {
                    arrayList6.add((org.telegram.messenger.ij) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) jg.g.i(1, arrayList3);
                    boolean z10 = TextUtils.isEmpty(this.v0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(ijVar3.T);
                    HashSet hashSet = this.p0;
                    if (hashSet.contains(valueOf) || !z10) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            e1(0, (org.telegram.messenger.ij) arrayList3.get(i12));
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        e1(arrayList3.size() - 1, ijVar3);
                        arrayList2.add(ijVar3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = ijVar3.k.reply_markup;
                    if (z9 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        ijVar3.K1 = true;
                        this.E.g((z9 ? arrayList3.size() - 1 : 0) + size);
                        this.E.g(size + (z9 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j11 = ijVar.T;
                    org.telegram.messenger.ij S0 = S0(j11, ijVar.J1.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z10);
                    arrayList = arrayList3;
                    arrayList2.add(S0);
                }
                if (!arrayList6.isEmpty()) {
                    org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) jg.g.i(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(S0(ijVar4.T, ijVar4.J1.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i7 = i11;
            arrayList3 = arrayList;
        }
    }

    public final void Y0(boolean z9) {
        if (this.M.getTag() == null || this.P) {
            return;
        }
        if (!this.S || this.Q) {
            this.M.setTag(null);
            if (!z9) {
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                this.M.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R = animatorSet2;
            animatorSet2.setDuration(150L);
            this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
            this.R.addListener(new va(this, 1));
            this.R.setStartDelay(500L);
            this.R.start();
        }
    }

    public final void Z0(boolean z9) {
        jb jbVar;
        if (this.r0) {
            return;
        }
        ArrayList arrayList = this.n0;
        if (z9) {
            this.O = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                org.telegram.messenger.g0.Z3(frameLayout, true, 0.3f, true, true);
                this.H.setVisibility(4);
                this.w.setEmptyView(null);
            }
            this.k0.b();
            arrayList.clear();
            this.m0.clear();
            W0();
        }
        this.r0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.qp.i1(this.f);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 50;
        if (z9 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.O;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i7 = 0; i7 < this.w0.m(); i7++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.qp.s1(this.currentAccount).q1((TLRPC.User) this.w0.n(i7)));
            }
        }
        g1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 3));
        if (!z9 || (jbVar = this.E) == null) {
            return;
        }
        jbVar.f();
    }

    public final void a1() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.qp.i1(this.f);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i7 = 0; i7 < this.w0.m(); i7++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.qp.s1(this.currentAccount).q1((TLRPC.User) this.w0.n(i7)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    public final void b1(boolean z9) {
        bi.q1 q1Var = this.w;
        if (q1Var == null || this.y == null || q1Var.getChildCount() <= 0) {
            return;
        }
        int i7 = z9 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < this.w.getChildCount(); i11++) {
            View childAt = this.w.getChildAt(i11);
            this.w.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z9) {
                    if (top >= i7) {
                    }
                    i7 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                } else {
                    if (top <= i7) {
                    }
                    i7 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject().T : view instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view).getMessageObject().T : 0L;
            this.N0 = i10;
            this.O0 = (this.w.getMeasuredHeight() - view.getBottom()) - this.w.getPaddingBottom();
        }
    }

    public final int c1(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i7;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj gjVar;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.q1 q1Var2 = this.J0;
            if (q1Var2 != null) {
                q1Var2.Tc = 0;
                q1Var2.Uc = null;
            }
        } else {
            if (TextUtils.isEmpty(ijVar.z) || (q1Var = this.J0) == null || (gjVar = q1Var.l3) == null) {
                CharSequence charSequence2 = ijVar.v;
                arrayList = ijVar.z2;
                org.telegram.ui.Cells.q1 q1Var3 = this.J0;
                if (q1Var3 == null || !q1Var3.u1) {
                    charSequence = charSequence2;
                    i7 = 0;
                } else {
                    i7 = q1Var3.V1 + org.telegram.messenger.g0.L(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i7 = (int) q1Var.s3;
                charSequence = ijVar.z;
                arrayList = gjVar.e;
            }
            org.telegram.ui.Cells.q1 q1Var4 = this.J0;
            if (q1Var4 != null) {
                q1Var4.Tc = 0;
                q1Var4.Uc = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.ij.Y(this.H0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
                        String charSequence3 = fjVar.e.getText().toString();
                        int i11 = fjVar.n;
                        if (Y > i11) {
                            float o4 = Y - i11 > charSequence3.length() + (-1) ? i7 + ((int) (fjVar.o(arrayList) + fjVar.f + fjVar.w)) : r5.getLineTop(r5.getLineForOffset(Y - fjVar.n)) + fjVar.o(arrayList) + i7 + fjVar.f;
                            Point point = org.telegram.messenger.g0.q;
                            if (o4 > point.y * (this.X.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) ? 0.7f : 0.5f)) {
                                return (int) (o4 - (point.y * (this.X.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) ? 0.7f : 0.5f)));
                            }
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        final int i7 = 0;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.q1(context, this.currentAccount));
            }
        }
        this.U = false;
        final int i11 = 1;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.k6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 2));
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, null, false, null);
        this.I = knVar;
        ok okVar = knVar.h;
        if (okVar != null) {
            okVar.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        }
        ok okVar2 = knVar.r;
        if (okVar2 != null) {
            okVar2.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        }
        knVar.l0 = true;
        this.I.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.addView(this.I, 0, c8.ha.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new kg.v1(this, i11);
        this.N = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        int i12 = 7;
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.kn knVar2 = this.I;
        TLRPC.Chat chat = this.f;
        knVar2.setTitle(chat.title);
        this.I.setSubtitle(org.telegram.messenger.id.M0(2131751075, null));
        this.I.setChatAvatar(chat);
        cb cbVar = new cb(this, context);
        this.fragmentView = cbVar;
        this.X = cbVar;
        cbVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.X.U(org.telegram.ui.ActionBar.k6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        hh.b p10 = c8.g0.p(this.resourceProvider);
        dh.c cVar = this.c;
        kVar.M(cVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, c8.ha.e(-1, -2, 17));
        this.H.setOnTouchListener(new ei.b(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.w5(this.L, this.X, org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, c8.ha.t(54, 54, 17, 16, 20, 16, -4));
        bi.md mdVar = new bi.md(context, 10);
        this.L = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        bi.md mdVar2 = this.L;
        int i13 = org.telegram.ui.ActionBar.k6.Wc;
        org.telegram.ui.ActionBar.r6.V(mdVar2, i13, null);
        this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        this.J.addView(this.L, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, c8.ha.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(9, context, this);
        this.w = q1Var;
        q1Var.setOnItemClickListener(new f(this, i12));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        bi.q1 q1Var2 = this.w;
        jb jbVar = new jb(this, context);
        this.E = jbVar;
        q1Var2.setAdapter(jbVar);
        this.w.setClipToPadding(false);
        bi.q1 q1Var3 = this.w;
        int i14 = org.telegram.messenger.g0.m;
        int i15 = this.e;
        q1Var3.setPadding(0, org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14 + i15, 0, org.telegram.messenger.g0.L(60.0f) + i15 + org.telegram.messenger.g0.n);
        bi.q1 q1Var4 = this.w;
        db dbVar = new db(this, this.w, this.resourceProvider);
        this.C0 = dbVar;
        q1Var4.setItemAnimator(dbVar);
        this.C0.Q = true;
        this.w.setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(this);
        this.y = b0Var;
        b0Var.j1(1);
        this.y.l1(true);
        this.w.setLayoutManager(this.y);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(this.w, this.y);
        this.D = ri0Var;
        ri0Var.h = new ra(this);
        ri0Var.i = this.L0;
        this.X.addView(this.w, c8.ha.c(-1.0f, -1));
        this.w.setOnScrollListener(new g3(this));
        this.glassEngine.b(this.w);
        int i16 = this.g0;
        if (i16 != -1) {
            this.y.h1(i16, this.h0);
            this.g0 = -1;
        }
        lh.f fVar = new lh.f(context);
        this.W = fVar;
        fVar.setup(this.b);
        this.W.setFadeZoneTop(org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.W.setFadeHeightTop(org.telegram.messenger.g0.L(60.0f));
        this.W.setFadeZoneBottom(org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(44.0f) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.n);
        this.W.setFadeHeightBottom(org.telegram.messenger.g0.L(60.0f));
        this.X.addView(this.W, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.n, c8.ha.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new org.telegram.ui.ActionBar.w5(this.r, this.X, org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.f2));
        this.n.addView(this.r, c8.ha.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        this.s.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        this.n.addView(this.s, c8.ha.e(32, 32, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        this.M = t0Var;
        t0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, c8.ha.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        lh.e eVar = new lh.e(context, cVar, c8.g0.b(f6Var), f6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-org.telegram.messenger.g0.n);
        this.G.c(4, true, false);
        lh.e eVar2 = this.G;
        fh.g c10 = eVar2.n.c(eVar2, null, false);
        c10.p(eVar2.r);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        eVar2.s = c10;
        this.X.addView(this.G, c8.ha.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ta
            public final /* synthetic */ mb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i7;
                mb mbVar = this.b;
                switch (i17) {
                    case 0:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(mbVar, mbVar.u0, mbVar.w0, mbVar.f.megagroup);
                            i0Var.e1(mbVar.t0);
                            i0Var.Y1 = new ra(mbVar);
                            mbVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        boolean z9 = mbVar.f.megagroup;
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        if (z9) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750978, null));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.R = org.telegram.messenger.id.M0(2131750976, null);
                        mbVar.showDialog(u1Var);
                        break;
                    default:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(mbVar.N.getSearchField());
                            mbVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(mbVar.getParentActivity(), new na(mbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(this.F, org.telegram.ui.ActionBar.k6.pf, null);
        this.F.setText(org.telegram.messenger.id.M0(2131745986, null));
        this.F.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        this.G.getContainer().addView(this.F, c8.ha.e(-2, -2, 17));
        this.G.f.add(this.F);
        this.G.d(false);
        this.G.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.ta
            public final /* synthetic */ mb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i11;
                mb mbVar = this.b;
                switch (i17) {
                    case 0:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(mbVar, mbVar.u0, mbVar.w0, mbVar.f.megagroup);
                            i0Var.e1(mbVar.t0);
                            i0Var.Y1 = new ra(mbVar);
                            mbVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        boolean z9 = mbVar.f.megagroup;
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        if (z9) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750978, null));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.R = org.telegram.messenger.id.M0(2131750976, null);
                        mbVar.showDialog(u1Var);
                        break;
                    default:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(mbVar.N.getSearchField());
                            mbVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(mbVar.getParentActivity(), new na(mbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.a0.setVisibility(4);
        this.a0.setFocusable(true);
        this.a0.setFocusableInTouchMode(true);
        this.a0.setClickable(true);
        this.a0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.X.addView(this.a0, c8.ha.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.b0.setImageResource(R.drawable.msg_calendar);
        org.telegram.ui.ActionBar.r6.t(this.b0, org.telegram.ui.ActionBar.k6.mf, null, PorterDuff.Mode.MULTIPLY);
        this.a0.addView(this.b0, c8.ha.e(48, 48, 53));
        final int i17 = 2;
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ta
            public final /* synthetic */ mb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i17;
                mb mbVar = this.b;
                switch (i172) {
                    case 0:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(mbVar, mbVar.u0, mbVar.w0, mbVar.f.megagroup);
                            i0Var.e1(mbVar.t0);
                            i0Var.Y1 = new ra(mbVar);
                            mbVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        boolean z9 = mbVar.f.megagroup;
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        if (z9) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750978, null));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.R = org.telegram.messenger.id.M0(2131750976, null);
                        mbVar.showDialog(u1Var);
                        break;
                    default:
                        if (mbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(mbVar.N.getSearchField());
                            mbVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(mbVar.getParentActivity(), new na(mbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c0 = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.nf, null);
        this.c0.setTextSize(15);
        this.c0.setTypeface(org.telegram.messenger.g0.o());
        this.a0.addView(this.c0, c8.ha.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.r0 && this.n0.isEmpty()) {
            org.telegram.messenger.g0.Z3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            org.telegram.messenger.g0.Z3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.H);
        }
        bi.q1 q1Var5 = this.w;
        q1Var5.W1 = true;
        q1Var5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.X.addView(this.x, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e A[LOOP:1: B:31:0x0098->B:42:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(org.telegram.messenger.ij ijVar) {
        int i7;
        int i10;
        int indexOf;
        boolean z9;
        float f10;
        int q02;
        org.telegram.messenger.ij messageObject;
        ArrayList arrayList = this.o0;
        boolean z10 = true;
        if (arrayList.size() > 0) {
            int N0 = this.y.N0();
            for (int L0 = this.y.L0(); L0 <= N0; L0++) {
                jb jbVar = this.E;
                int i11 = jbVar.f;
                if (L0 >= i11 && L0 < jbVar.h) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(L0 - i11);
                    if (ijVar2.U != 1 && ijVar2.M1() != 0 && !ijVar2.s4()) {
                        i10 = L0 - this.E.f;
                        i7 = (ijVar2.M1() < ijVar.M1() ? 1 : 0) ^ 1;
                        this.D.b = i7;
                        indexOf = arrayList.indexOf(ijVar);
                        if (indexOf == -1) {
                            if (i10 > 0) {
                                i7 = i10 > indexOf ? 0 : 1;
                                this.D.b = i7;
                            }
                            qa qaVar = this.I0;
                            if (qaVar != null) {
                                org.telegram.messenger.g0.r(qaVar);
                                this.I0 = null;
                            }
                            this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.G0 = ijVar.M1();
                            int indexOf2 = arrayList.indexOf(ijVar) + this.E.f;
                            i1();
                            int childCount = this.w.getChildCount();
                            int i12 = 0;
                            boolean z11 = false;
                            int i13 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    z9 = z10;
                                    f10 = 2.0f;
                                    break;
                                }
                                View childAt = this.w.getChildAt(i12);
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.messenger.ij messageObject2 = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                                    z9 = z10;
                                    if (messageObject2 != null) {
                                        f10 = 2.0f;
                                        if (messageObject2.M1() == ijVar.M1()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i13 = c1(messageObject2);
                                            z11 = z9;
                                        }
                                    } else {
                                        f10 = 2.0f;
                                    }
                                    if (z11) {
                                        i12++;
                                        z10 = z9;
                                    } else {
                                        int top = childAt.getTop() - (Math.max(-org.telegram.messenger.g0.L(f10), (this.w.getMeasuredHeight() - childAt.getHeight()) / 2) - i13);
                                        int computeVerticalScrollRange = (this.w.computeVerticalScrollRange() - this.w.computeVerticalScrollOffset()) - this.w.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.w.w0(0, top, null);
                                            this.w.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    z9 = z10;
                                    f10 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null && messageObject.M1() == ijVar.M1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z11 = z9;
                                    }
                                    if (z11) {
                                    }
                                }
                            }
                            if (z11) {
                                return;
                            }
                            boolean z12 = !TextUtils.isEmpty(null);
                            if (getParentActivity() == null) {
                                q02 = 0;
                            } else {
                                if (this.J0 == null) {
                                    this.J0 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.q1 q1Var = this.J0;
                                TLRPC.Chat chat = this.f;
                                q1Var.e6 = chat != null ? z9 : false;
                                q1Var.j6 = (org.telegram.messenger.t3.T(chat) && chat.megagroup) ? z9 : false;
                                q02 = this.J0.q0(ijVar, null, z12);
                            }
                            int max = Math.max(-org.telegram.messenger.g0.L(f10), (this.w.getMeasuredHeight() - q02) / 2) - c1(ijVar);
                            lb lbVar = this.L0;
                            lbVar.a = ijVar;
                            lbVar.e = max;
                            org.telegram.ui.Components.ri0 ri0Var = this.D;
                            ri0Var.b = i7;
                            lbVar.b = indexOf2;
                            lbVar.d = max;
                            lbVar.c = false;
                            ri0Var.d(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        this.D.b = i7;
        indexOf = arrayList.indexOf(ijVar);
        if (indexOf == -1) {
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.ij messageObject2;
        org.telegram.ui.Cells.q1 q1Var3;
        org.telegram.messenger.ij messageObject3;
        boolean z9;
        if (i7 == org.telegram.messenger.qs.i4) {
            bi.q1 q1Var4 = this.w;
            if (q1Var4 != null) {
                q1Var4.g1();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.h2) {
            if (i7 == org.telegram.messenger.qs.f2 || i7 == org.telegram.messenger.qs.g2) {
                bi.q1 q1Var5 = this.w;
                if (q1Var5 != null) {
                    int childCount = q1Var5.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.w.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null) {
                            if (org.telegram.messenger.ij.S4(messageObject.k) || messageObject.J3()) {
                                q1Var.O3(false, true, false);
                            } else if (messageObject.i4() && !MediaController.B().I(messageObject)) {
                                q1Var.o0(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i7 != org.telegram.messenger.qs.e2) {
                if (i7 != org.telegram.messenger.qs.z4 || this.fragmentView == null) {
                    return;
                }
                this.X.U(org.telegram.ui.ActionBar.k6.s0());
                this.r.invalidate();
                bi.md mdVar = this.L;
                if (mdVar != null) {
                    mdVar.invalidate();
                }
                this.w.g1();
                return;
            }
            Integer num = (Integer) objArr[0];
            bi.q1 q1Var6 = this.w;
            if (q1Var6 != null) {
                int childCount2 = q1Var6.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.w.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = (q1Var2 = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject2.f1() == num.intValue()) {
                        org.telegram.messenger.ij ijVar = MediaController.B().u0;
                        if (ijVar != null) {
                            messageObject2.b0 = ijVar.b0;
                            messageObject2.g0 = ijVar.g0;
                            messageObject2.h0 = ijVar.h0;
                            q1Var2.S3();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((org.telegram.messenger.ij) objArr[0]).i4()) {
            MediaController.B().p0(V0(true), this.e0, this.d0, true);
            int childCount3 = this.w.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount3) {
                    z9 = false;
                    break;
                }
                View childAt3 = this.w.getChildAt(i13);
                if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var7 = (org.telegram.ui.Cells.q1) childAt3;
                    org.telegram.messenger.ij messageObject4 = q1Var7.getMessageObject();
                    if (this.d0 != null && messageObject4.i4() && MediaController.B().I(messageObject4)) {
                        ImageReceiver photoImage = q1Var7.getPhotoImage();
                        this.d0.setTranslationX(photoImage.K0);
                        this.d0.setTranslationY(q1Var7.getTop() + this.fragmentView.getPaddingTop() + photoImage.L0);
                        this.fragmentView.invalidate();
                        this.d0.invalidate();
                        z9 = true;
                        break;
                    }
                }
                i13++;
            }
            if (this.d0 != null) {
                org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                if (z9) {
                    MediaController.B().k0(true);
                } else {
                    this.d0.setTranslationY((-org.telegram.messenger.g0.u) - 100);
                    this.fragmentView.invalidate();
                    if (ijVar2 != null && ijVar2.i4() && (this.V || PipRoundVideoView.F != null)) {
                        MediaController.B().k0(false);
                    }
                }
            }
        }
        bi.q1 q1Var8 = this.w;
        if (q1Var8 != null) {
            int childCount4 = q1Var8.getChildCount();
            for (int i14 = 0; i14 < childCount4; i14++) {
                View childAt4 = this.w.getChildAt(i14);
                if ((childAt4 instanceof org.telegram.ui.Cells.q1) && (messageObject3 = (q1Var3 = (org.telegram.ui.Cells.q1) childAt4).getMessageObject()) != null) {
                    if (org.telegram.messenger.ij.S4(messageObject3.k) || messageObject3.J3()) {
                        q1Var3.O3(false, true, false);
                    } else if (messageObject3.i4()) {
                        q1Var3.o0(null, false);
                        if (!MediaController.B().I(messageObject3) && messageObject3.b0 != 0.0f) {
                            messageObject3.H5();
                            q1Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void g1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.L.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748202, null)));
            return;
        }
        if (this.w0 != null || this.u0 != null) {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.L.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748201, null)));
            return;
        }
        this.K.setVisibility(0);
        this.L.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        if (this.f.megagroup) {
            bi.md mdVar = this.L;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751013, null));
            f1(X2);
            mdVar.setText(X2);
            return;
        }
        bi.md mdVar2 = this.L;
        SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751012, null));
        f1(X22);
        mdVar2.setText(X22);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.kc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.lc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.df));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.uf));
        View view = this.r;
        int i7 = org.telegram.ui.ActionBar.k6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    public final void h1() {
        bi.q1 q1Var = this.w;
        if (q1Var == null) {
            return;
        }
        int childCount = q1Var.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z9 = false;
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.w.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                y1Var.f = y10;
                y1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int top = q1Var2.getTop();
                q1Var2.getBottom();
                int i12 = top >= 0 ? 0 : -top;
                int measuredHeight2 = q1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i12 + measuredHeight;
                }
                q1Var2.A3(i12, measuredHeight2 - i12, (this.X.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.ij messageObject = q1Var2.getMessageObject();
                if (this.d0 != null && messageObject.i4() && MediaController.B().I(messageObject)) {
                    ImageReceiver photoImage = q1Var2.getPhotoImage();
                    this.d0.setTranslationX(photoImage.K0);
                    this.d0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.L0);
                    this.fragmentView.invalidate();
                    this.d0.invalidate();
                    z10 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                t0Var.i0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (t0Var.Q()) {
                    t0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i7) {
                    if ((childAt instanceof org.telegram.ui.Cells.q1) || (childAt instanceof org.telegram.ui.Cells.t0)) {
                        view = childAt;
                    }
                    i7 = bottom;
                    view3 = childAt;
                }
                db dbVar = this.C0;
                if ((dbVar == null || (!dbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.t0) && ((org.telegram.ui.Cells.t0) childAt).getMessageObject().j0) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i10) {
                        i10 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        k0 k0Var = this.d0;
        if (k0Var != null) {
            if (z10) {
                MediaController.B().k0(true);
            } else {
                k0Var.setTranslationY((-org.telegram.messenger.g0.u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.ij ijVar = MediaController.B().u0;
                if (ijVar != null && ijVar.i4() && this.V) {
                    MediaController.B().k0(false);
                }
            }
        }
        if (view != null) {
            this.M.e0((view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject() : ((org.telegram.ui.Cells.t0) view).getMessageObject()).k.date, false, true);
        }
        this.P = false;
        if (!(view3 instanceof org.telegram.ui.Cells.q1) && !(view3 instanceof org.telegram.ui.Cells.t0)) {
            z9 = true;
        }
        this.Q = z9;
        if (view2 == null) {
            Y0(true);
            this.M.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.w.getPaddingTop() || this.Q) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            Y0(true ^ this.Q);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.R;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.R = null;
            }
            if (this.M.getTag() == null) {
                this.M.setTag(1);
            }
            if (this.M.getAlpha() != 1.0f) {
                this.M.setAlpha(1.0f);
            }
            this.P = true;
        }
        int bottom2 = view2.getBottom() - this.w.getPaddingTop();
        if (bottom2 <= this.M.getMeasuredHeight() || bottom2 >= this.M.getMeasuredHeight() * 2) {
            this.M.setTranslationY(0.0f);
        } else {
            this.M.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
        }
    }

    public final void i1() {
        bi.q1 q1Var = this.w;
        if (q1Var == null) {
            return;
        }
        int childCount = q1Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.w.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                org.telegram.messenger.ij messageObject = q1Var2.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.v()) {
                        q1Var2.setDrawSelectionBackground(false);
                        q1Var2.j3(false, true);
                        q1Var2.l3(false, false, true);
                    }
                    q1Var2.setHighlighted(this.G0 != Integer.MAX_VALUE && messageObject.M1() == this.G0);
                    if (this.G0 != Integer.MAX_VALUE) {
                        qa qaVar = this.I0;
                        if (qaVar != null) {
                            org.telegram.messenger.g0.r(qaVar);
                        }
                        qa qaVar2 = new qa(this, 0);
                        this.I0 = qaVar2;
                        org.telegram.messenger.g0.i3(qaVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.v0)) {
                        q1Var2.s3(null);
                    } else {
                        q1Var2.s3(this.v0);
                    }
                    q1Var2.setSpoilersSuppressed(this.w.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                t0Var.setMessageObject(t0Var.getMessageObject());
                t0Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.e2);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.z4);
        Z0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.qs.e3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new pa(this, 4)), this.classGuid);
        setBulletinDelegate(new fi.r7(7));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.e2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.z4);
        this.x0.e();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        kb kbVar = this.X;
        if (kbVar != null) {
            org.telegram.ui.Components.y61 y61Var = kbVar.w;
            if (y61Var != null) {
                y61Var.c(false);
            }
            kbVar.F = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.i0 = true;
        this.j0 = true;
        ab.q qVar = ab.q.e;
        if (qVar == null || !qVar.a) {
            return;
        }
        ab.q o4 = ab.q.o();
        if (o4.a) {
            r4 r4Var = (r4) o4.d;
            int i7 = b5.F;
            r4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        kb kbVar = this.X;
        if (kbVar != null) {
            org.telegram.ui.Components.y61 y61Var = kbVar.w;
            if (y61Var != null) {
                y61Var.c(true);
            }
            kbVar.F = false;
        }
        this.i0 = false;
        T0(false);
        if (this.j0) {
            this.j0 = false;
            jb jbVar = this.E;
            if (jbVar != null) {
                jbVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            this.x0.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        if (z9) {
            this.x0.d();
        }
    }
}
