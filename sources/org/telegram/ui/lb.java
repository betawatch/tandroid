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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lb extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public static int R0 = 10;
    public static final int[] S0 = {org.telegram.messenger.ks.T, org.telegram.messenger.ks.s, org.telegram.messenger.ks.t, org.telegram.messenger.ks.D, org.telegram.messenger.ks.G0};
    public HashMap A0;
    public boolean B0;
    public final za C0;
    public cb D0;
    public org.telegram.ui.ActionBar.l5 E;
    public final ArrayList E0;
    public ib F;
    public final a0.h F0;
    public TextView G;
    public xa G0;
    public lh.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.zn J;
    public qa J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.r1 K0;
    public ImageView L;
    public int L0;
    public di.xb M;
    public final kb M0;
    public org.telegram.ui.Cells.v0 N;
    public long N0;
    public org.telegram.ui.ActionBar.q0 O;
    public int O0;
    public long P;
    public int P0;
    public boolean Q;
    public final RectF Q0;
    public boolean R;
    public AnimatorSet S;
    public boolean T;
    public final int[] U;
    public boolean V;
    public boolean W;
    public lh.f X;
    public jb Y;
    public org.telegram.messenger.fj Z;
    public final ui.g a;
    public TLRPC.ChannelParticipant a0;
    public final dh.c b;
    public FrameLayout b0;
    public final dh.c c;
    public ImageView c0;
    public final dh.g d;
    public org.telegram.ui.ActionBar.n5 d0;
    public final int e;
    public k0 e0;
    public final TLRPC.Chat f;
    public j4 f0;
    public TextureView g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final a0.h l0;
    public final a0.h m0;
    public FrameLayout n;
    public final HashMap n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final HashSet q0;
    public View r;
    public boolean r0;
    public RadialProgressView s;
    public boolean s0;
    public boolean t0;
    public ArrayList u0;
    public TLRPC.TL_channelAdminLogEventsFilter v0;
    public di.b1 w;
    public String w0;
    public UndoView x;
    public a0.h x0;
    public jg.b0 y;
    public final h2.f y0;
    public final HashMap z0;

    public lb(TLRPC.Chat chat) {
        super(null);
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new a0.h();
        this.m0 = new a0.h();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new h2.f(S0);
        this.z0 = new HashMap();
        this.C0 = new za(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.I0 = -1;
        this.M0 = new kb(this);
        this.O0 = -1;
        this.Q0 = new RectF();
        ri.q qVar = this.glassEngine;
        qVar.a = new ra(this);
        qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        ui.g gVar = new ui.g();
        this.a = gVar;
        dh.c cVar = new dh.c(gVar, gVar, gVar);
        this.b = cVar;
        cVar.j = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.bz.f()) {
            this.d = null;
            this.e = 0;
            dh.c cVar2 = new dh.c(gVar, gVar, gVar);
            this.c = cVar2;
            cVar2.j = this.glassEngine;
        } else {
            dh.g gVar2 = new dh.g(false);
            this.d = gVar2;
            this.glassEngine.a(gVar2);
            ui.f fVar = new ui.f(gVar);
            fVar.d = gVar2;
            fVar.e = -3;
            fVar.f = gVar;
            if (org.telegram.messenger.pc.e(262144)) {
                ui.f fVar2 = new ui.f(gVar);
                fVar2.d = gVar2;
                fVar2.e = -2;
                fVar2.f = gVar;
                dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
                this.c = cVar3;
                cVar3.j = this.glassEngine;
                int L = org.telegram.messenger.pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
                cVar3.d = L;
                cVar3.e = L;
                cVar3.k = true;
                this.e = 0;
            } else {
                dh.c cVar4 = new dh.c(fVar, fVar, fVar);
                this.c = cVar4;
                cVar4.j = this.glassEngine;
                int L2 = org.telegram.messenger.pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
                cVar4.d = L2;
                cVar4.e = L2;
                this.e = org.telegram.messenger.g0.L(48.0f);
            }
        }
        this.f = chat;
    }

    public static void A0(lb lbVar, org.telegram.messenger.fj fjVar) {
        if (lbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        if (fjVar.D == 3) {
            t1Var.U = org.telegram.messenger.gd.N0(2131747985, null);
        } else {
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131748012, fjVar.F0().mime_type);
        }
        lbVar.showDialog(t1Var);
    }

    public static void F0(lb lbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.mp messagesController = lbVar.getMessagesController();
        TLRPC.Chat chat = lbVar.f;
        TLRPC.ChatFull P0 = messagesController.P0(chat.id);
        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(lbVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, P0, hashMap, lbVar, P0.id, false, org.telegram.messenger.v3.T(chat));
        x50Var.e2 = new ab(lbVar);
        x50Var.show();
    }

    public static void P0(lb lbVar) {
        if (lbVar.w == null || lbVar.o0.isEmpty()) {
            return;
        }
        lbVar.y.h1(lbVar.p0.size() - 1, (-100000) - lbVar.w.getPaddingTop());
    }

    public static vw0 X0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.kq kqVar : (org.telegram.ui.Components.kq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.kq.class)) {
            if (kqVar != null) {
                Drawable drawable = kqVar.c;
                if (drawable instanceof vw0) {
                    return (vw0) drawable;
                }
            }
        }
        return null;
    }

    public static void Z(lb lbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.fj fjVar;
        a0.h hVar = lbVar.l0;
        int i7 = 0;
        lbVar.D0.N = false;
        lbVar.b1(false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).f4(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).Z3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = lbVar.o0;
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                lbVar.P = Math.min(lbVar.P, tL_channelAdminLogEvent.id);
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(lbVar.currentAccount, tL_channelAdminLogEvent, arrayList, lbVar.n0, lbVar.f, lbVar.U, false);
                if (fjVar2.U >= 0) {
                    hVar.k(fjVar2, tL_channelAdminLogEvent.id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(size);
            if (fjVar3 != null && fjVar3.U != 0 && fjVar3.L1() >= 0) {
                lbVar.m0.k(fjVar3, fjVar3.L1());
            }
            if (fjVar3 != null && (message = fjVar3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            fjVar = null;
                            break;
                        }
                        if (size != i11) {
                            fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
                            if (fjVar.U != 1 && fjVar.L1() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i11++;
                    }
                    if (fjVar != null) {
                        fjVar3.C = fjVar;
                    }
                }
                arrayList2.add(fjVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.ri.d0(lbVar.currentAccount).a1(arrayList2, -lbVar.f.id, 0, 0L, new qa(lbVar, 1), lbVar.getClassGuid(), null);
        }
        lbVar.W0();
        lbVar.s0 = false;
        if (!z10) {
            lbVar.r0 = true;
        }
        org.telegram.messenger.g0.X3(lbVar.n, false, 0.3f, true, true);
        lbVar.w.setEmptyView(lbVar.I);
        ib ibVar = lbVar.F;
        if (ibVar != null) {
            ibVar.f();
        }
        org.telegram.ui.ActionBar.q0 q0Var = lbVar.O;
        if (q0Var != null) {
            if (lbVar.p0.isEmpty() && TextUtils.isEmpty(lbVar.w0)) {
                i7 = 8;
            }
            q0Var.setVisibility(i7);
        }
    }

    public static void a0(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || lbVar.getParentActivity() == null) {
            return;
        }
        int i7 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, lbVar.getParentActivity(), lbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
        Rect rect = new Rect();
        lbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, lbVar.getResourceProvider());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            if (arrayList4.get(i10) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(lbVar.getParentActivity(), lbVar.getResourceProvider()), c8.na.o(-1, 8));
            } else {
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, lbVar.getParentActivity(), lbVar.getResourceProvider(), i10 == 0, i10 == size + (-1));
                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                y0Var.j((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                    y0Var.d(lbVar.getThemedColor(org.telegram.ui.ActionBar.n6.q7), lbVar.getThemedColor(org.telegram.ui.ActionBar.n6.p7));
                }
                Integer num = (Integer) arrayList4.get(i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                y0Var.setOnClickListener(new fi.k5(lbVar, i10, arrayList4, num, 1));
            }
            i10++;
            arrayList4 = arrayList;
        }
        wa waVar = new wa(0, lbVar.Y.getContext(), lbVar);
        waVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.na.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        waVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        xa xaVar = new xa(lbVar, waVar);
        lbVar.G0 = xaVar;
        xaVar.e = true;
        xaVar.c = org.telegram.messenger.ks.x3;
        xaVar.setOutsideTouchable(true);
        lbVar.G0.setClippingEnabled(true);
        lbVar.G0.setAnimationStyle(R.style.PopupContextAnimation);
        lbVar.G0.setFocusable(true);
        waVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        lbVar.G0.setInputMethodMode(2);
        lbVar.G0.setSoftInputMode(48);
        lbVar.G0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f10)) - waVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.g0.L(28.0f);
        if (left < org.telegram.messenger.g0.L(6.0f)) {
            left = org.telegram.messenger.g0.L(6.0f);
        } else if (left > (lbVar.w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - waVar.getMeasuredWidth()) {
            left = (lbVar.w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - waVar.getMeasuredWidth();
        }
        if (org.telegram.messenger.g0.Q1()) {
            int[] iArr = new int[2];
            lbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = lbVar.Y.getHeight();
        int L = org.telegram.messenger.g0.L(48.0f) + waVar.getMeasuredHeight();
        int Q = lbVar.Y.Q();
        if (Q > org.telegram.messenger.g0.L(20.0f)) {
            height += Q;
        }
        if (L < height) {
            int y10 = (int) (lbVar.w.getY() + view.getTop() + f11);
            i7 = (L - rect.top) - rect.bottom > org.telegram.messenger.g0.L(240.0f) ? (org.telegram.messenger.g0.L(240.0f) - L) + y10 : y10;
            if (i7 < lbVar.w.getY() + org.telegram.messenger.g0.L(24.0f)) {
                i7 = (int) (lbVar.w.getY() + org.telegram.messenger.g0.L(24.0f));
            } else {
                int i11 = height - L;
                if (i7 > i11 - org.telegram.messenger.g0.L(8.0f)) {
                    i7 = i11 - org.telegram.messenger.g0.L(8.0f);
                }
            }
        } else if (!lbVar.inBubbleMode) {
            i7 = org.telegram.messenger.g0.m;
        }
        waVar.setMaxHeight(height - i7);
        lbVar.G0.showAtLocation(lbVar.w, 51, left, i7);
        lbVar.G0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x036d, code lost:
    
        if (r0.exists() != false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(lb lbVar, int i7, ArrayList arrayList, Integer num) {
        TLRPC.Chat O0;
        File file;
        TLRPC.User c22;
        if (lbVar.Z == null || i7 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat = lbVar.f;
        xa xaVar = lbVar.G0;
        if (xaVar != null) {
            xaVar.dismiss();
        }
        org.telegram.messenger.fj fjVar = lbVar.Z;
        if (fjVar == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long Z0 = fjVar.Z0();
            if (0 != Z0) {
                if (Z0 > 0) {
                    TLRPC.User c23 = org.telegram.messenger.mp.u1(lbVar.currentAccount).c2(Long.valueOf(Z0));
                    if (c23 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i5.m(0, c23.first_name, c23.last_name)).append((CharSequence) ":\n");
                    }
                } else if (Z0 < 0 && (O0 = org.telegram.messenger.mp.u1(lbVar.currentAccount).O0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) O0.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(fjVar.v)) {
                spannableStringBuilder.append((CharSequence) fjVar.k.message);
            } else {
                spannableStringBuilder.append(fjVar.v);
            }
            org.telegram.messenger.g0.g(spannableStringBuilder);
            org.telegram.messenger.m10.t(null, 2131748396, org.telegram.ui.Components.kc.b0(lbVar));
        } else if (intValue == 4) {
            String str = fjVar.k.attachPath;
            if (str != null && str.length() > 0 && !a8.p0.B(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                org.telegram.messenger.w7 fileLoader = lbVar.getFileLoader();
                TLRPC.Message message = lbVar.Z.k;
                fileLoader.getClass();
                str = org.telegram.messenger.w7.M(message, false, true).toString();
            }
            int i10 = lbVar.Z.D;
            if (i10 == 3 || i10 == 1) {
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.b) && lbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    lbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    lbVar.Z = null;
                    lbVar.a0 = null;
                    return;
                }
                MediaController.d0(str, lbVar.getParentActivity(), lbVar.Z.D == 3 ? 1 : 0, null, null, null);
            }
        } else if (intValue == 5) {
            String str2 = fjVar.k.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(lbVar.Z.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7 fileLoader2 = lbVar.getFileLoader();
                TLRPC.Message message2 = lbVar.Z.k;
                fileLoader2.getClass();
                File M = org.telegram.messenger.w7.M(message2, false, true);
                if (M.exists()) {
                    file = M;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    jg.b0 b0Var = lbVar.y;
                    if (b0Var != null) {
                        if (b0Var.N0() < lbVar.y.B() - 1) {
                            int L0 = lbVar.y.L0();
                            lbVar.h0 = L0;
                            org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) lbVar.w.K(L0);
                            if (mj0Var != null) {
                                lbVar.i0 = mj0Var.a.getTop();
                            } else {
                                lbVar.h0 = -1;
                            }
                        } else {
                            lbVar.h0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.m6 v = org.telegram.ui.ActionBar.n6.v(file, lbVar.Z.I0(), null, true);
                    if (v != null) {
                        lbVar.presentFragment(new v71(v));
                    } else {
                        lbVar.h0 = -1;
                        if (lbVar.getParentActivity() == null) {
                            lbVar.Z = null;
                            lbVar.a0 = null;
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131749007, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        lbVar.showDialog(t1Var);
                    }
                } else if (org.telegram.messenger.gd.E0().e(file, lbVar.currentAccount)) {
                    lbVar.presentFragment(new LanguageSelectActivity());
                } else {
                    if (lbVar.getParentActivity() == null) {
                        lbVar.Z = null;
                        lbVar.a0 = null;
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(lbVar.getParentActivity());
                    String N02 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                    t1Var2.S = N02;
                    t1Var2.U = org.telegram.messenger.gd.N0(2131749008, null);
                    alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                    lbVar.showDialog(t1Var2);
                }
            }
        } else if (intValue == 6) {
            String str3 = fjVar.k.attachPath;
            if (str3 != null && str3.length() > 0 && !a8.p0.B(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                org.telegram.messenger.w7 fileLoader3 = lbVar.getFileLoader();
                TLRPC.Message message3 = lbVar.Z.k;
                fileLoader3.getClass();
                str3 = org.telegram.messenger.w7.M(message3, false, true).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(lbVar.Z.F0().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Activity parentActivity = lbVar.getParentActivity();
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
                lbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.N0(2131745263, null)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            int i11 = 2;
            switch (intValue) {
                case 9:
                    lbVar.showDialog(new org.telegram.ui.Components.jw0(lbVar.getParentActivity(), lbVar, org.telegram.messenger.fj.j1(lbVar.Z.k), null, null, null));
                    break;
                case 10:
                    if ((Build.VERSION.SDK_INT > 28 && !org.telegram.messenger.s2.b) || lbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        String B = org.telegram.messenger.w7.B(lbVar.Z.F0());
                        if (TextUtils.isEmpty(B)) {
                            B = lbVar.Z.S0();
                        }
                        String str4 = B;
                        String str5 = lbVar.Z.k.attachPath;
                        if (str5 != null && str5.length() > 0 && !a8.p0.B(str5)) {
                            str5 = null;
                        }
                        if (str5 == null || str5.length() == 0) {
                            org.telegram.messenger.w7 fileLoader4 = lbVar.getFileLoader();
                            TLRPC.Message message4 = lbVar.Z.k;
                            fileLoader4.getClass();
                            str5 = org.telegram.messenger.w7.M(message4, false, true).toString();
                        }
                        MediaController.d0(str5, lbVar.getParentActivity(), lbVar.Z.I3() ? 3 : 2, str4, lbVar.Z.F0() != null ? lbVar.Z.F0().mime_type : "", null);
                        break;
                    } else {
                        lbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        lbVar.Z = null;
                        lbVar.a0 = null;
                        return;
                    }
                    break;
                case 11:
                    org.telegram.messenger.mp.u1(lbVar.currentAccount).C4(lbVar.Z, fjVar.F0());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", lbVar.Z.k.media.user_id);
                            bundle.putString("phone", lbVar.Z.k.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            lbVar.presentFragment(new qr(bundle));
                            break;
                        case 16:
                            org.telegram.messenger.g0.g(fjVar.k.media.phone_number);
                            org.telegram.messenger.m10.t(null, 2131747101, org.telegram.ui.Components.kc.b0(lbVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + lbVar.Z.k.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                lbVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (lbVar.a0 != null) {
                                        TLRPC.User c24 = lbVar.getMessagesController().c2(Long.valueOf(org.telegram.messenger.n5.o(lbVar.a0.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = lbVar.a0;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = lbVar.a0.banned_rights;
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
                                        lbVar.getMessagesController().Y4(chat.id, c24, null, lbVar.a0.banned_rights, true, lbVar.getFragmentForAlert(1), new u5(8, lbVar, c24));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = lbVar.getMessagesController().j1(chat.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = lbVar.Z.L1();
                                    lbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new pa(lbVar, i11));
                                    break;
                                case 35:
                                    lbVar.getMessagesController().e0(chat.id, lbVar.getMessagesController().o1(lbVar.Z.k.from_id), false, new qa(lbVar, i11));
                                    if ((lbVar.Z.k.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.kc.a(lbVar) && (c22 = lbVar.getMessagesController().c2(Long.valueOf(lbVar.Z.k.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.kc.D(lbVar, c22, chat.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str6 = fjVar.k.attachPath;
            if (str6 != null && str6.length() > 0 && !a8.p0.B(str6)) {
                str6 = null;
            }
            if (str6 == null || str6.length() == 0) {
                org.telegram.messenger.w7 fileLoader5 = lbVar.getFileLoader();
                TLRPC.Message message5 = lbVar.Z.k;
                fileLoader5.getClass();
                str6 = org.telegram.messenger.w7.M(message5, false, true).toString();
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.b) && lbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                lbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                lbVar.Z = null;
                lbVar.a0 = null;
                return;
            }
            MediaController.d0(str6, lbVar.getParentActivity(), 0, null, null, null);
        }
        lbVar.Z = null;
        lbVar.a0 = null;
    }

    public static void c0(lb lbVar, int i7) {
        dh.g gVar = lbVar.d;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.ed.a(i7, 4)) {
            ti.a e10 = lbVar.glassEngine.e();
            e10.b(lbVar.w.getY(), lbVar.Y.getWidth(), lbVar.w.getY() + lbVar.w.getHeight());
            gVar.h(e10);
        }
        jb jbVar = lbVar.Y;
        Objects.requireNonNull(jbVar);
        gVar.e(new oa(jbVar, 0), lbVar.Y.getWidth(), lbVar.Y.getHeight());
    }

    public static void d0(lb lbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = lbVar.l0;
        lbVar.t0 = false;
        lbVar.D0.N = false;
        lbVar.b1(false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).f4(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.mp.u1(lbVar.currentAccount).Z3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i7 = 0; i7 < tL_channels_adminLogResults.events.size(); i7++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i7);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                lbVar.P = Math.min(lbVar.P, tL_channelAdminLogEvent2.id);
                org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(lbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, lbVar.f, lbVar.U, false);
                if (fjVar.U >= 0 && (((tL_channelAdminLogEvent = fjVar.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    lbVar.o0.add(0, fjVar);
                    hVar.k(fjVar, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (lbVar.F == null || !z10) {
            return;
        }
        lbVar.W0();
        lbVar.F.f();
    }

    public static void e0(lb lbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull P0;
        TLRPC.Chat chat = lbVar.f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            lbVar.getMessagesController().f4(tL_channels_channelParticipants.users, false);
            lbVar.getMessagesController().Z3(tL_channels_channelParticipants.chats, false);
            lbVar.u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (P0 = lbVar.getMessagesController().P0(chat.id)) != null && P0.antispam) {
                ya yaVar = new ya();
                yaVar.user_id = lbVar.getMessagesController().h5;
                yaVar.peer = lbVar.getMessagesController().B1(yaVar.user_id);
                long j3 = lbVar.getMessagesController().h5;
                if (lbVar.getMessagesController().c2(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(lbVar.currentAccount).sendRequest(tL_users_getUsers, new pa(lbVar, 1));
                }
                lbVar.u0.add(0, yaVar);
            }
            Dialog dialog = lbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.o0) {
                ((org.telegram.ui.Components.o0) dialog).f1(lbVar.u0);
            }
        }
    }

    public static void e1(int i7, org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return;
        }
        if (i7 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = fjVar.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = fjVar.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            fjVar.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.gd.G(i7, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        fjVar.i5();
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
    public static void u0(lb lbVar, Bundle bundle, long j3) {
        TLRPC.Chat chat = lbVar.f;
        if (!chat.megagroup || lbVar.u0 == null || !org.telegram.messenger.v3.w(2, chat)) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= lbVar.u0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) lbVar.u0.get(i7);
            if (org.telegram.messenger.fj.B1(channelParticipant.peer) != j3) {
                i7++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public final org.telegram.messenger.fj S0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.messenger.fj fjVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            if (i7 >= arrayList2.size()) {
                fjVar = null;
                break;
            }
            fjVar = (org.telegram.messenger.fj) arrayList2.get(i7);
            if (fjVar != null && fjVar.U == 1 && fjVar.J0 == j3) {
                break;
            }
            i7++;
        }
        if (fjVar == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.fj) arrayList.get(0)).k.date;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            fjVar = new org.telegram.messenger.fj(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j10));
        fjVar.U = 1;
        if (!z11 || arrayList.size() <= 1) {
            fjVar.J0 = -1L;
        } else {
            fjVar.J0 = j3;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.fj.E5(org.telegram.messenger.gd.G(arrayList.size(), z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new aa.l(9)).distinct().map(new Function() { // from class: org.telegram.ui.sa
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                lb lbVar = lb.this;
                lbVar.getClass();
                if (l10.longValue() >= 0) {
                    return org.telegram.messenger.n10.l(lbVar.getMessagesController().c2(l10));
                }
                TLRPC.Chat O0 = lbVar.getMessagesController().O0(Long.valueOf(-l10.longValue()));
                if (O0 == null) {
                    return null;
                }
                return O0.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new aa.m(5)).limit(4L).toArray())), "un1", c22));
        if (z11 && arrayList.size() > 1) {
            vw0 X0 = X0(fjVar.v);
            if (X0 == null) {
                X0 = new vw0(org.telegram.messenger.gd.N0(z10 ? 2131751024 : 2131751023, null));
                Typeface o4 = org.telegram.messenger.g0.o();
                org.telegram.ui.Components.m6 m6Var = X0.a;
                m6Var.x(o4);
                m6Var.w(org.telegram.messenger.g0.L(10.0f));
                if (X0.c != -1) {
                    X0.c = -1;
                    X0.invalidateSelf();
                }
                X0.a(503316480);
            } else {
                X0.a.t(org.telegram.messenger.gd.N0(z10 ? 2131751024 : 2131751023, null), false, true);
            }
            X0.setBounds(0, 0, X0.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(0, X0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fjVar.v = spannableStringBuilder;
        org.telegram.messenger.fj fjVar2 = arrayList.size() > 0 ? (org.telegram.messenger.fj) i5.c.h(1, arrayList) : null;
        if (fjVar2 != null) {
            long j11 = fjVar2.T;
            a0.h hVar = this.F0;
            if (!hVar.d(j11)) {
                long j12 = fjVar2.T;
                int i10 = R0;
                R0 = i10 + 1;
                hVar.k(Integer.valueOf(i10), j12);
            }
            fjVar.m1 = ((Integer) hVar.f(fjVar2.T)).intValue();
        }
        return fjVar;
    }

    public final void T0(boolean z10) {
        jg.b0 b0Var = this.y;
        if (b0Var == null || this.j0) {
            return;
        }
        int L0 = b0Var.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.y.N0() - L0) + 1) > 0) {
            this.F.getClass();
            if (L0 > (z10 ? 4 : 1) || this.s0 || this.r0) {
                return;
            }
            Z0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x0196, code lost:
    
        if (org.telegram.messenger.ri.d0(r1.currentAccount).E0(r10.id, true) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0198, code lost:
    
        r10 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01af, code lost:
    
        if (org.telegram.messenger.ri.d0(r1.currentAccount).O.containsKey(r10.short_name) == false) goto L88;
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
        boolean z10;
        String str;
        Integer num3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        Integer num4;
        String str2;
        boolean z11;
        TLRPC.Message message;
        TLRPC.User c22;
        lb lbVar = this;
        Integer valueOf = Integer.valueOf(R.drawable.msg_gif);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_copy);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_gallery);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_download);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_share);
        org.telegram.messenger.fj messageObject = view instanceof org.telegram.ui.Cells.r1 ? ((org.telegram.ui.Cells.r1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject() : null;
        if (messageObject == null) {
            return false;
        }
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = messageObject.L1;
        int i7 = messageObject.D;
        if (i7 == 6) {
            num = 5;
            num2 = 10;
        } else {
            if (i7 == 10 || i7 == 11 || i7 == 16) {
                num = 5;
                num2 = 10;
                if (messageObject.e1() != 0) {
                    c10 = 1;
                }
            } else {
                if (org.telegram.messenger.fj.R4(messageObject.k)) {
                    num = 5;
                } else if (messageObject.t4() || messageObject.J2()) {
                    num = 5;
                    TLRPC.InputStickerSet j12 = org.telegram.messenger.fj.j1(messageObject.k);
                    if (j12 instanceof TLRPC.TL_inputStickerSetID) {
                        num2 = 10;
                    } else {
                        num2 = 10;
                        if (j12 instanceof TLRPC.TL_inputStickerSetShortName) {
                        }
                        c10 = 2;
                    }
                } else {
                    if (messageObject.h4()) {
                        if (messageObject.h4()) {
                            boolean z12 = org.telegram.messenger.s2.a;
                        }
                        if (messageObject.D != 12) {
                            num = 5;
                            num2 = 10;
                            c10 = '\b';
                        } else {
                            num = 5;
                            num2 = 10;
                            if (messageObject.F3()) {
                                c10 = 3;
                            }
                            c10 = 2;
                        }
                    }
                    if ((messageObject.k.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.F0() != null || messageObject.I3() || org.telegram.messenger.fj.L4(messageObject.k)) {
                        String str3 = messageObject.k.attachPath;
                        boolean z13 = (str3 == null || str3.length() == 0 || !new File(messageObject.k.attachPath).exists()) ? false : true;
                        if (z13) {
                            num = 5;
                            z10 = z13;
                        } else {
                            org.telegram.messenger.w7 fileLoader = lbVar.getFileLoader();
                            z10 = z13;
                            TLRPC.Message message2 = messageObject.k;
                            fileLoader.getClass();
                            num = 5;
                            if (org.telegram.messenger.w7.M(message2, false, true).exists()) {
                                z10 = true;
                            }
                        }
                        if (z10) {
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
            lbVar.Z = messageObject;
            if (lbVar.getParentActivity() != null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.messenger.fj fjVar = messageObject;
            TLRPC.Chat chat = lbVar.f;
            if (chat == null || tL_channelAdminLogEvent2 == null) {
                num3 = valueOf4;
            } else {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                num3 = valueOf4;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                    TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().P0(chat.id), null, this, chat.id, false, org.telegram.messenger.v3.V(chat));
                        x50Var.f2 = false;
                        x50Var.show();
                        return true;
                    }
                }
                lbVar = this;
            }
            if (tL_channelAdminLogEvent2 != null) {
                num4 = 4;
                if ((!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent2.user_id != lbVar.getMessagesController().h5) && !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam)) {
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                } else {
                    if (view instanceof org.telegram.ui.Cells.v0) {
                        SpannableString spannableString = new SpannableString(">");
                        Drawable mutate = lbVar.getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(lbVar.getThemedColor(org.telegram.ui.ActionBar.n6.xj), PorterDuff.Mode.MULTIPLY));
                        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                        spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131750983, null)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) org.telegram.messenger.gd.N0(2131752505, null));
                        spannableStringBuilder.setSpan(new hi.cb(lbVar, 3), 0, spannableStringBuilder.length(), 33);
                        org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0(lbVar).I(R.raw.msg_antispam, org.telegram.messenger.gd.N0(2131752448, null), org.telegram.messenger.g0.K2(org.telegram.messenger.gd.N0(2131752449, null), spannableStringBuilder, "%s"));
                        I.j = 5000;
                        I.j();
                        return true;
                    }
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                    org.telegram.ui.Cells.c0.v(null, 2131746023, arrayList, R.drawable.msg_notspam, arrayList3);
                    arrayList2.add(34);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
            } else {
                tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                num4 = 4;
            }
            org.telegram.messenger.fj fjVar2 = lbVar.Z;
            if (fjVar2.D == 0 || fjVar2.z != null) {
                arrayList.add(org.telegram.messenger.gd.N0(2131751755, null));
                arrayList3.add(valueOf2);
                arrayList2.add(3);
            }
            if (c10 == 1) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = lbVar.Z.L1;
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
                            showDialog(new org.telegram.ui.Components.jw0(getParentActivity(), this, inputStickerSet2, null, null, null));
                            return true;
                        }
                    }
                }
                if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                    n50 n50Var = new n50(chat.id, 0);
                    TLRPC.ChatFull P0 = lbVar.getMessagesController().P0(chat.id);
                    if (P0 != null) {
                        n50Var.j0(P0);
                        lbVar.presentFragment(n50Var);
                    }
                } else if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && org.telegram.messenger.v3.y(13, chat)) {
                    org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(lbVar.getParentActivity(), chat);
                    zpVar.w1 = new va(lbVar);
                    lbVar.showDialog(zpVar);
                }
            } else if (c10 == 3) {
                TLRPC.MessageMedia messageMedia = lbVar.Z.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.M3(messageMedia.webpage.document)) {
                    arrayList.add(org.telegram.messenger.gd.N0(2131745734, null));
                    arrayList3.add(valueOf);
                    arrayList2.add(11);
                }
            } else if (c10 != 4) {
                Integer num5 = num2;
                Integer num6 = num3;
                if (c10 == 5) {
                    org.telegram.ui.Cells.c0.v(null, 2131754214, arrayList, R.drawable.msg_language, arrayList3);
                    arrayList2.add(num);
                    arrayList.add(org.telegram.messenger.gd.N0(2131745735, null));
                    arrayList3.add(num6);
                    arrayList2.add(num5);
                    arrayList.add(org.telegram.messenger.gd.N0(2131745263, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num7 = num;
                    if (c10 == '\n') {
                        org.telegram.ui.Cells.c0.v(null, 2131754212, arrayList, R.drawable.msg_theme, arrayList3);
                        arrayList2.add(num7);
                        arrayList.add(org.telegram.messenger.gd.N0(2131745735, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.gd.N0(2131745263, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c10 == 6) {
                        arrayList.add(org.telegram.messenger.gd.N0(2131745733, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(7);
                        arrayList.add(org.telegram.messenger.gd.N0(2131745735, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.gd.N0(2131745263, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c10 == 7) {
                        TLRPC.Message message3 = lbVar.Z.k;
                        if (org.telegram.messenger.fj.n1(message3) != null && org.telegram.messenger.fj.E3(org.telegram.messenger.fj.n1(message3).document)) {
                            arrayList.add(org.telegram.messenger.gd.N0(2131754368, null));
                        } else {
                            arrayList.add(org.telegram.messenger.gd.N0(2131754366, null));
                        }
                        arrayList3.add(Integer.valueOf(R.drawable.msg_sticker));
                        arrayList2.add(9);
                    } else if (c10 == '\b') {
                        long j3 = lbVar.Z.k.media.user_id;
                        TLRPC.User c23 = j3 != 0 ? org.telegram.messenger.mp.u1(lbVar.currentAccount).c2(Long.valueOf(j3)) : null;
                        if (c23 != null && c23.id != org.telegram.messenger.i10.i(lbVar.currentAccount).e() && org.telegram.messenger.i5.r(lbVar.currentAccount).g0.get(Long.valueOf(c23.id)) == null) {
                            org.telegram.ui.Cells.c0.v(null, 2131754441, arrayList, R.drawable.msg_addcontact, arrayList3);
                            arrayList2.add(15);
                        }
                        if (!TextUtils.isEmpty(lbVar.Z.k.media.phone_number)) {
                            arrayList.add(org.telegram.messenger.gd.N0(2131751755, null));
                            arrayList3.add(valueOf2);
                            arrayList2.add(16);
                            arrayList.add(org.telegram.messenger.gd.N0(2131752622, null));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                            arrayList2.add(17);
                        }
                    }
                }
            } else if (org.telegram.messenger.fj.L4(lbVar.Z.k)) {
                arrayList.add(org.telegram.messenger.gd.N0(2131745733, null));
                arrayList3.add(valueOf3);
                arrayList2.add(num4);
                arrayList.add(org.telegram.messenger.gd.N0(2131745263, null));
                arrayList3.add(valueOf5);
                arrayList2.add(6);
            } else {
                Integer num8 = num4;
                if (lbVar.Z.I3()) {
                    arrayList.add(org.telegram.messenger.gd.N0(2131745715, null));
                    arrayList3.add(num3);
                    arrayList2.add(num2);
                    arrayList.add(org.telegram.messenger.gd.N0(2131745263, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num9 = num2;
                    Integer num10 = num3;
                    if (lbVar.Z.F0() != null) {
                        if (org.telegram.messenger.fj.M3(lbVar.Z.F0())) {
                            str2 = null;
                            arrayList.add(org.telegram.messenger.gd.N0(2131745734, null));
                            arrayList3.add(valueOf);
                            arrayList2.add(11);
                        } else {
                            str2 = null;
                        }
                        arrayList.add(org.telegram.messenger.gd.N0(2131745735, str2));
                        arrayList3.add(num10);
                        arrayList2.add(num9);
                        arrayList.add(org.telegram.messenger.gd.N0(2131745263, str2));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else {
                        arrayList.add(org.telegram.messenger.gd.N0(2131745733, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(num8);
                    }
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = tL_channelAdminLogEvent;
            ua uaVar = new ua(lbVar, arrayList2, arrayList, arrayList3, view, f10, f11);
            if (org.telegram.messenger.v3.w(2, chat) && tL_channelAdminLogEvent4 != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                if (((channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = fjVar.k) != null && message.from_id != null && (c22 = lbVar.getMessagesController().c2(Long.valueOf(lbVar.Z.k.from_id.user_id))) != null && !org.telegram.messenger.n10.C(c22)) {
                    org.telegram.messenger.mp messagesController = lbVar.getMessagesController();
                    di.n2 n2Var = new di.n2(lbVar, arrayList, arrayList3, arrayList2, uaVar, 1);
                    uaVar = uaVar;
                    messagesController.M0(chat, c22, n2Var);
                    z11 = true;
                    if (!z11) {
                        return true;
                    }
                    uaVar.run();
                    return true;
                }
            }
            z11 = false;
            if (!z11) {
            }
        }
        c10 = 65535;
        lbVar.Z = messageObject;
        if (lbVar.getParentActivity() != null) {
        }
    }

    public final TextureView V0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            k0 k0Var = new k0(4, getParentActivity(), this);
            this.e0 = k0Var;
            k0Var.setOutlineProvider(new bg.q0(9));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            j4 j4Var = new j4(getParentActivity());
            this.f0 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z10) {
                this.e0.addView(this.f0, c8.na.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, c8.na.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            jb jbVar = this.Y;
            k0 k0Var2 = this.e0;
            int i7 = org.telegram.messenger.g0.u;
            jbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i7, i7));
        }
        this.e0.setVisibility(4);
        this.f0.setDrawingReady(false);
        return this.g0;
    }

    public final void W0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList4 = this.o0;
            if (i7 >= arrayList4.size()) {
                ArrayList arrayList5 = this.p0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(i7);
            long j3 = (fjVar == null || (tL_channelAdminLogEvent2 = fjVar.L1) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (fjVar.m1 <= 0) {
                int i10 = R0;
                R0 = i10 + 1;
                fjVar.m1 = i10;
            }
            int i11 = i7 + 1;
            org.telegram.messenger.fj fjVar2 = i11 < arrayList4.size() ? (org.telegram.messenger.fj) arrayList4.get(i11) : null;
            long j10 = (fjVar2 == null || (tL_channelAdminLogEvent = fjVar2.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j3 != 0) {
                arrayList3.add(fjVar);
            } else {
                arrayList2.add(fjVar);
            }
            if (j3 == j10 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = fjVar.k.reply_markup;
                boolean z10 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.fj) arrayList3.get(size2)).U == 1; size2--) {
                    arrayList6.add((org.telegram.messenger.fj) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) i5.c.h(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.w0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(fjVar3.T);
                    HashSet hashSet = this.q0;
                    if (hashSet.contains(valueOf) || !z11) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            e1(0, (org.telegram.messenger.fj) arrayList3.get(i12));
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        e1(arrayList3.size() - 1, fjVar3);
                        arrayList2.add(fjVar3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = fjVar3.k.reply_markup;
                    if (z10 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        fjVar3.M1 = true;
                        this.F.g((z10 ? arrayList3.size() - 1 : 0) + size);
                        this.F.g(size + (z10 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j11 = fjVar.T;
                    org.telegram.messenger.fj S02 = S0(j11, fjVar.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z11);
                    arrayList = arrayList3;
                    arrayList2.add(S02);
                }
                if (!arrayList6.isEmpty()) {
                    org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) i5.c.h(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(S0(fjVar4.T, fjVar4.L1.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i7 = i11;
            arrayList3 = arrayList;
        }
    }

    public final void Y0(boolean z10) {
        if (this.N.getTag() == null || this.Q) {
            return;
        }
        if (!this.T || this.R) {
            this.N.setTag(null);
            if (!z10) {
                AnimatorSet animatorSet = this.S;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.S = null;
                }
                this.N.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            animatorSet2.setDuration(150L);
            this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
            this.S.addListener(new org.telegram.ui.Cells.x9(this, 2));
            this.S.setStartDelay(500L);
            this.S.start();
        }
    }

    public final void Z0(boolean z10) {
        ib ibVar;
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.o0;
        if (z10) {
            this.P = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                org.telegram.messenger.g0.X3(frameLayout, true, 0.3f, true, true);
                this.I.setVisibility(4);
                this.w.setEmptyView(null);
            }
            this.l0.b();
            arrayList.clear();
            this.n0.clear();
            W0();
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.mp.k1(this.f);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 50;
        if (z10 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.P;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i7 = 0; i7 < this.x0.m(); i7++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.mp.u1(this.currentAccount).s1((TLRPC.User) this.x0.n(i7)));
            }
        }
        g1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 3));
        if (!z10 || (ibVar = this.F) == null) {
            return;
        }
        ibVar.f();
    }

    public final void a1() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.mp.k1(this.f);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i7 = 0; i7 < this.x0.m(); i7++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.mp.u1(this.currentAccount).s1((TLRPC.User) this.x0.n(i7)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new pa(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    public final void b1(boolean z10) {
        di.b1 b1Var = this.w;
        if (b1Var == null || this.y == null || b1Var.getChildCount() <= 0) {
            return;
        }
        int i7 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < this.w.getChildCount(); i11++) {
            View childAt = this.w.getChildAt(i11);
            this.w.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z10) {
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
            this.N0 = view instanceof org.telegram.ui.Cells.r1 ? ((org.telegram.ui.Cells.r1) view).getMessageObject().T : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject().T : 0L;
            this.O0 = i10;
            this.P0 = (this.w.getMeasuredHeight() - view.getBottom()) - this.w.getPaddingBottom();
        }
    }

    public final int c1(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i7;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.dj djVar;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.r1 r1Var2 = this.K0;
            if (r1Var2 != null) {
                r1Var2.hd = 0;
                r1Var2.id = null;
            }
        } else {
            if (TextUtils.isEmpty(fjVar.z) || (r1Var = this.K0) == null || (djVar = r1Var.m3) == null) {
                CharSequence charSequence2 = fjVar.v;
                arrayList = fjVar.B2;
                org.telegram.ui.Cells.r1 r1Var3 = this.K0;
                if (r1Var3 == null || !r1Var3.v1) {
                    charSequence = charSequence2;
                    i7 = 0;
                } else {
                    i7 = r1Var3.W1 + org.telegram.messenger.g0.L(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i7 = (int) r1Var.t3;
                charSequence = fjVar.z;
                arrayList = djVar.e;
            }
            org.telegram.ui.Cells.r1 r1Var4 = this.K0;
            if (r1Var4 != null) {
                r1Var4.hd = 0;
                r1Var4.id = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.fj.Y(this.I0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) arrayList.get(i10);
                        String charSequence3 = cjVar.e.getText().toString();
                        int i11 = cjVar.n;
                        if (Y > i11) {
                            float o4 = Y - i11 > charSequence3.length() + (-1) ? i7 + ((int) (cjVar.o(arrayList) + cjVar.f + cjVar.w)) : r5.getLineTop(r5.getLineForOffset(Y - cjVar.n)) + cjVar.o(arrayList) + i7 + cjVar.f;
                            Point point = org.telegram.messenger.g0.q;
                            if (o4 > point.y * (this.Y.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) ? 0.7f : 0.5f)) {
                                return (int) (o4 - (point.y * (this.Y.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) ? 0.7f : 0.5f)));
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

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        final int i7 = 0;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.r1(context, this.currentAccount));
            }
        }
        this.V = false;
        final int i11 = 1;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.n6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new y7(this, 5));
        org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, null, false, null);
        this.J = znVar;
        pk pkVar = znVar.h;
        if (pkVar != null) {
            pkVar.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        }
        pk pkVar2 = znVar.r;
        if (pkVar2 != null) {
            pkVar2.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        }
        znVar.m0 = true;
        this.J.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.addView(this.J, 0, c8.na.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new bi.x1(this, 2);
        this.O = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        int i12 = 7;
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.zn znVar2 = this.J;
        TLRPC.Chat chat = this.f;
        znVar2.setTitle(chat.title);
        this.J.setSubtitle(org.telegram.messenger.gd.N0(2131751062, null));
        this.J.setChatAvatar(chat);
        bb bbVar = new bb(this, context);
        this.fragmentView = bbVar;
        this.Y = bbVar;
        bbVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.Y.U(org.telegram.ui.ActionBar.n6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        hh.b p10 = c8.j0.p(this.resourceProvider);
        dh.c cVar = this.c;
        kVar.P(cVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, c8.na.e(-1, -2, 17));
        this.I.setOnTouchListener(new gi.a(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.y5(this.M, this.Y, org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.n6.f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, c8.na.t(54, 54, 17, 16, 20, 16, -4));
        di.xb xbVar = new di.xb(context, 10);
        this.M = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        di.xb xbVar2 = this.M;
        int i13 = org.telegram.ui.ActionBar.n6.Zc;
        org.telegram.ui.ActionBar.u6.U(xbVar2, i13, null);
        this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        this.K.addView(this.M, c8.na.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, c8.na.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        di.b1 b1Var = new di.b1(9, context, this);
        this.w = b1Var;
        b1Var.setOnItemClickListener(new f(this, i12));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        di.b1 b1Var2 = this.w;
        ib ibVar = new ib(this, context);
        this.F = ibVar;
        b1Var2.setAdapter(ibVar);
        this.w.setClipToPadding(false);
        di.b1 b1Var3 = this.w;
        int i14 = org.telegram.messenger.g0.m;
        int i15 = this.e;
        b1Var3.setPadding(0, org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14 + i15, 0, org.telegram.messenger.g0.L(60.0f) + i15 + org.telegram.messenger.g0.n);
        di.b1 b1Var4 = this.w;
        cb cbVar = new cb(this, this.w, this.resourceProvider);
        this.D0 = cbVar;
        b1Var4.setItemAnimator(cbVar);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(this);
        this.y = b0Var;
        b0Var.j1(1);
        this.y.l1(true);
        this.w.setLayoutManager(this.y);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(this.w, this.y);
        this.E = l5Var;
        l5Var.n = new ra(this);
        l5Var.r = this.M0;
        this.Y.addView(this.w, c8.na.c(-1.0f, -1));
        this.w.setOnScrollListener(new g3(this));
        this.glassEngine.b(this.w);
        int i16 = this.h0;
        if (i16 != -1) {
            this.y.h1(i16, this.i0);
            this.h0 = -1;
        }
        lh.f fVar = new lh.f(context);
        this.X = fVar;
        fVar.setup(this.b);
        this.X.setFadeZoneTop(org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.X.setFadeHeightTop(org.telegram.messenger.g0.L(60.0f));
        this.X.setFadeZoneBottom(org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(44.0f) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.n);
        this.X.setFadeHeightBottom(org.telegram.messenger.g0.L(60.0f));
        this.Y.addView(this.X, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, c8.na.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new org.telegram.ui.ActionBar.y5(this.r, this.Y, org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.f2));
        this.n.addView(this.r, c8.na.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        this.s.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
        this.n.addView(this.s, c8.na.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.N = v0Var;
        v0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, c8.na.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        lh.e eVar = new lh.e(context, cVar, c8.j0.b(i6Var), i6Var);
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-org.telegram.messenger.g0.n);
        this.H.c(4, true, false);
        lh.e eVar2 = this.H;
        fh.g c10 = eVar2.n.c(eVar2, null, false);
        c10.p(eVar2.r);
        org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        eVar2.s = c10;
        this.Y.addView(this.H, c8.na.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ta
            public final /* synthetic */ lb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i7;
                lb lbVar = this.b;
                switch (i17) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.o0 o0Var = new org.telegram.ui.Components.o0(lbVar, lbVar.v0, lbVar.x0, lbVar.f.megagroup);
                            o0Var.f1(lbVar.u0);
                            o0Var.c2 = new ra(lbVar);
                            lbVar.showDialog(o0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750965, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750964, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131750963, null);
                        lbVar.showDialog(t1Var);
                        break;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.o(lbVar.getParentActivity(), new na(lbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(this.G, org.telegram.ui.ActionBar.n6.sf, null);
        this.G.setText(org.telegram.messenger.gd.N0(2131745787, null));
        this.G.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        this.H.getContainer().addView(this.G, c8.na.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.ta
            public final /* synthetic */ lb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i11;
                lb lbVar = this.b;
                switch (i17) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.o0 o0Var = new org.telegram.ui.Components.o0(lbVar, lbVar.v0, lbVar.x0, lbVar.f.megagroup);
                            o0Var.f1(lbVar.u0);
                            o0Var.c2 = new ra(lbVar);
                            lbVar.showDialog(o0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750965, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750964, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131750963, null);
                        lbVar.showDialog(t1Var);
                        break;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.o(lbVar.getParentActivity(), new na(lbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.b0.setVisibility(4);
        this.b0.setFocusable(true);
        this.b0.setFocusableInTouchMode(true);
        this.b0.setClickable(true);
        this.b0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.Y.addView(this.b0, c8.na.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(R.drawable.msg_calendar);
        org.telegram.ui.ActionBar.u6.s(this.c0, org.telegram.ui.ActionBar.n6.pf, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, c8.na.e(48, 48, 53));
        final int i17 = 2;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ta
            public final /* synthetic */ lb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i17;
                lb lbVar = this.b;
                switch (i172) {
                    case 0:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.o0 o0Var = new org.telegram.ui.Components.o0(lbVar, lbVar.v0, lbVar.x0, lbVar.f.megagroup);
                            o0Var.f1(lbVar.u0);
                            o0Var.c2 = new ra(lbVar);
                            lbVar.showDialog(o0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        boolean z10 = lbVar.f.megagroup;
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        if (z10) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750965, null));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750964, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131750963, null);
                        lbVar.showDialog(t1Var);
                        break;
                    default:
                        if (lbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(lbVar.O.getSearchField());
                            lbVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.o(lbVar.getParentActivity(), new na(lbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d0 = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.qf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(org.telegram.messenger.g0.o());
        this.b0.addView(this.d0, c8.na.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            org.telegram.messenger.g0.X3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            org.telegram.messenger.g0.X3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        di.b1 b1Var5 = this.w;
        b1Var5.X1 = true;
        b1Var5.Y1 = 1;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.Y.addView(this.x, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
    public final void d1(org.telegram.messenger.fj fjVar) {
        int i7;
        int i10;
        int indexOf;
        boolean z10;
        float f10;
        int r02;
        org.telegram.messenger.fj messageObject;
        ArrayList arrayList = this.p0;
        boolean z11 = true;
        if (arrayList.size() > 0) {
            int N0 = this.y.N0();
            for (int L0 = this.y.L0(); L0 <= N0; L0++) {
                ib ibVar = this.F;
                int i11 = ibVar.f;
                if (L0 >= i11 && L0 < ibVar.h) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(L0 - i11);
                    if (fjVar2.U != 1 && fjVar2.L1() != 0 && !fjVar2.r4()) {
                        i10 = L0 - this.F.f;
                        i7 = (fjVar2.L1() < fjVar.L1() ? 1 : 0) ^ 1;
                        this.E.b = i7;
                        indexOf = arrayList.indexOf(fjVar);
                        if (indexOf == -1) {
                            if (i10 > 0) {
                                i7 = i10 > indexOf ? 0 : 1;
                                this.E.b = i7;
                            }
                            qa qaVar = this.J0;
                            if (qaVar != null) {
                                org.telegram.messenger.g0.r(qaVar);
                                this.J0 = null;
                            }
                            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.H0 = fjVar.L1();
                            int indexOf2 = arrayList.indexOf(fjVar) + this.F.f;
                            i1();
                            int childCount = this.w.getChildCount();
                            int i12 = 0;
                            boolean z12 = false;
                            int i13 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    z10 = z11;
                                    f10 = 2.0f;
                                    break;
                                }
                                View childAt = this.w.getChildAt(i12);
                                if (childAt instanceof org.telegram.ui.Cells.r1) {
                                    org.telegram.messenger.fj messageObject2 = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                                    z10 = z11;
                                    if (messageObject2 != null) {
                                        f10 = 2.0f;
                                        if (messageObject2.L1() == fjVar.L1()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i13 = c1(messageObject2);
                                            z12 = z10;
                                        }
                                    } else {
                                        f10 = 2.0f;
                                    }
                                    if (z12) {
                                        i12++;
                                        z11 = z10;
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
                                    z10 = z11;
                                    f10 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null && messageObject.L1() == fjVar.L1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z12 = z10;
                                    }
                                    if (z12) {
                                    }
                                }
                            }
                            if (z12) {
                                return;
                            }
                            boolean z13 = !TextUtils.isEmpty(null);
                            if (getParentActivity() == null) {
                                r02 = 0;
                            } else {
                                if (this.K0 == null) {
                                    this.K0 = new org.telegram.ui.Cells.r1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.r1 r1Var = this.K0;
                                TLRPC.Chat chat = this.f;
                                r1Var.f6 = chat != null ? z10 : false;
                                r1Var.k6 = (org.telegram.messenger.v3.T(chat) && chat.megagroup) ? z10 : false;
                                r02 = this.K0.r0(fjVar, null, z13);
                            }
                            int max = Math.max(-org.telegram.messenger.g0.L(f10), (this.w.getMeasuredHeight() - r02) / 2) - c1(fjVar);
                            kb kbVar = this.M0;
                            kbVar.a = fjVar;
                            kbVar.e = max;
                            org.telegram.ui.ActionBar.l5 l5Var = this.E;
                            l5Var.b = i7;
                            kbVar.b = indexOf2;
                            kbVar.d = max;
                            kbVar.c = false;
                            l5Var.k(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        this.E.b = i7;
        indexOf = arrayList.indexOf(fjVar);
        if (indexOf == -1) {
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Cells.r1 r1Var2;
        org.telegram.messenger.fj messageObject2;
        org.telegram.ui.Cells.r1 r1Var3;
        org.telegram.messenger.fj messageObject3;
        boolean z10;
        if (i7 == org.telegram.messenger.ks.l4) {
            di.b1 b1Var = this.w;
            if (b1Var != null) {
                b1Var.g1();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.h2) {
            if (i7 == org.telegram.messenger.ks.f2 || i7 == org.telegram.messenger.ks.g2) {
                di.b1 b1Var2 = this.w;
                if (b1Var2 != null) {
                    int childCount = b1Var2.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.w.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null) {
                            if (org.telegram.messenger.fj.R4(messageObject.k) || messageObject.I3()) {
                                r1Var.Q3(false, true, false);
                            } else if (messageObject.h4() && !MediaController.B().I(messageObject)) {
                                r1Var.p0(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i7 != org.telegram.messenger.ks.e2) {
                if (i7 != org.telegram.messenger.ks.C4 || this.fragmentView == null) {
                    return;
                }
                this.Y.U(org.telegram.ui.ActionBar.n6.s0());
                this.r.invalidate();
                di.xb xbVar = this.M;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                this.w.g1();
                return;
            }
            Integer num = (Integer) objArr[0];
            di.b1 b1Var3 = this.w;
            if (b1Var3 != null) {
                int childCount2 = b1Var3.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.w.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.r1) && (messageObject2 = (r1Var2 = (org.telegram.ui.Cells.r1) childAt2).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                        org.telegram.messenger.fj fjVar = MediaController.B().v0;
                        if (fjVar != null) {
                            messageObject2.b0 = fjVar.b0;
                            messageObject2.i0 = fjVar.i0;
                            messageObject2.j0 = fjVar.j0;
                            r1Var2.U3();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((org.telegram.messenger.fj) objArr[0]).h4()) {
            MediaController.B().p0(V0(true), this.f0, this.e0, true);
            int childCount3 = this.w.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.w.getChildAt(i13);
                if (childAt3 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var4 = (org.telegram.ui.Cells.r1) childAt3;
                    org.telegram.messenger.fj messageObject4 = r1Var4.getMessageObject();
                    if (this.e0 != null && messageObject4.h4() && MediaController.B().I(messageObject4)) {
                        ImageReceiver photoImage = r1Var4.getPhotoImage();
                        this.e0.setTranslationX(photoImage.L0);
                        this.e0.setTranslationY(r1Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                        this.fragmentView.invalidate();
                        this.e0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i13++;
            }
            if (this.e0 != null) {
                org.telegram.messenger.fj fjVar2 = MediaController.B().v0;
                if (z10) {
                    MediaController.B().k0(true);
                } else {
                    this.e0.setTranslationY((-org.telegram.messenger.g0.u) - 100);
                    this.fragmentView.invalidate();
                    if (fjVar2 != null && fjVar2.h4() && (this.W || PipRoundVideoView.G != null)) {
                        MediaController.B().k0(false);
                    }
                }
            }
        }
        di.b1 b1Var4 = this.w;
        if (b1Var4 != null) {
            int childCount4 = b1Var4.getChildCount();
            for (int i14 = 0; i14 < childCount4; i14++) {
                View childAt4 = this.w.getChildAt(i14);
                if ((childAt4 instanceof org.telegram.ui.Cells.r1) && (messageObject3 = (r1Var3 = (org.telegram.ui.Cells.r1) childAt4).getMessageObject()) != null) {
                    if (org.telegram.messenger.fj.R4(messageObject3.k) || messageObject3.I3()) {
                        r1Var3.Q3(false, true, false);
                    } else if (messageObject3.h4()) {
                        r1Var3.p0(null, false);
                        if (!MediaController.B().I(messageObject3) && messageObject3.b0 != 0.0f) {
                            messageObject3.G5();
                            r1Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void g1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748008, null)));
            return;
        }
        if (this.x0 != null || this.v0 != null) {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748007, null)));
            return;
        }
        this.L.setVisibility(0);
        this.M.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        if (this.f.megagroup) {
            di.xb xbVar = this.M;
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131751000, null));
            f1(W2);
            xbVar.setText(W2);
            return;
        }
        di.xb xbVar2 = this.M;
        SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131750999, null));
        f1(W22);
        xbVar2.setText(W22);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ac));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.nc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.pc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.oc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.gf));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 131072, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.xf));
        View view = this.r;
        int i7 = org.telegram.ui.ActionBar.n6.cd;
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.M, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    public final void h1() {
        di.b1 b1Var = this.w;
        if (b1Var == null) {
            return;
        }
        int childCount = b1Var.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.w.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                z1Var.f = y10;
                z1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                int top = r1Var.getTop();
                r1Var.getBottom();
                int i12 = top >= 0 ? 0 : -top;
                int measuredHeight2 = r1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i12 + measuredHeight;
                }
                r1Var.C3(i12, measuredHeight2 - i12, (this.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                if (this.e0 != null && messageObject.h4() && MediaController.B().I(messageObject)) {
                    ImageReceiver photoImage = r1Var.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.m0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (v0Var.U()) {
                    v0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i7) {
                    if ((childAt instanceof org.telegram.ui.Cells.r1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        view = childAt;
                    }
                    i7 = bottom;
                    view3 = childAt;
                }
                cb cbVar = this.D0;
                if ((cbVar == null || (!cbVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().l0) {
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
        k0 k0Var = this.e0;
        if (k0Var != null) {
            if (z11) {
                MediaController.B().k0(true);
            } else {
                k0Var.setTranslationY((-org.telegram.messenger.g0.u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.fj fjVar = MediaController.B().v0;
                if (fjVar != null && fjVar.h4() && this.W) {
                    MediaController.B().k0(false);
                }
            }
        }
        if (view != null) {
            this.N.j0((view instanceof org.telegram.ui.Cells.r1 ? ((org.telegram.ui.Cells.r1) view).getMessageObject() : ((org.telegram.ui.Cells.v0) view).getMessageObject()).k.date, false, true);
        }
        this.Q = false;
        if (!(view3 instanceof org.telegram.ui.Cells.r1) && !(view3 instanceof org.telegram.ui.Cells.v0)) {
            z10 = true;
        }
        this.R = z10;
        if (view2 == null) {
            Y0(true);
            this.N.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.w.getPaddingTop() || this.R) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            Y0(true ^ this.R);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.S;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S = null;
            }
            if (this.N.getTag() == null) {
                this.N.setTag(1);
            }
            if (this.N.getAlpha() != 1.0f) {
                this.N.setAlpha(1.0f);
            }
            this.Q = true;
        }
        int bottom2 = view2.getBottom() - this.w.getPaddingTop();
        if (bottom2 <= this.N.getMeasuredHeight() || bottom2 >= this.N.getMeasuredHeight() * 2) {
            this.N.setTranslationY(0.0f);
        } else {
            this.N.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
        }
    }

    public final void i1() {
        di.b1 b1Var = this.w;
        if (b1Var == null) {
            return;
        }
        int childCount = b1Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.w.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.x()) {
                        r1Var.setDrawSelectionBackground(false);
                        r1Var.l3(false, true);
                        r1Var.n3(false, false, true);
                    }
                    r1Var.setHighlighted(this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0);
                    if (this.H0 != Integer.MAX_VALUE) {
                        qa qaVar = this.J0;
                        if (qaVar != null) {
                            org.telegram.messenger.g0.r(qaVar);
                        }
                        qa qaVar2 = new qa(this, 0);
                        this.J0 = qaVar2;
                        org.telegram.messenger.g0.h3(qaVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.w0)) {
                        r1Var.u3(null);
                    } else {
                        r1Var.u3(this.w0);
                    }
                    r1Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.setMessageObject(v0Var.getMessageObject());
                v0Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.C4);
        Z0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.mp.k1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.ks.e3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new pa(this, 4)), this.classGuid);
        setBulletinDelegate(new bi.t(8));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.C4);
        this.y0.e();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        jb jbVar = this.Y;
        if (jbVar != null) {
            org.telegram.ui.Components.n71 n71Var = jbVar.w;
            if (n71Var != null) {
                n71Var.c(false);
            }
            jbVar.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        ab.q qVar = ab.q.e;
        if (qVar == null || !qVar.a) {
            return;
        }
        ab.q p10 = ab.q.p();
        if (p10.a) {
            r4 r4Var = (r4) p10.d;
            int i7 = b5.G;
            r4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        jb jbVar = this.Y;
        if (jbVar != null) {
            org.telegram.ui.Components.n71 n71Var = jbVar.w;
            if (n71Var != null) {
                n71Var.c(true);
            }
            jbVar.G = false;
        }
        this.j0 = false;
        T0(false);
        if (this.k0) {
            this.k0 = false;
            ib ibVar = this.F;
            if (ibVar != null) {
                ibVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zc, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.y0.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.y0.d();
        }
    }
}
