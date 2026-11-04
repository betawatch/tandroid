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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kb extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static int R0 = 10;
    public static final int[] S0 = {org.telegram.messenger.hs.T, org.telegram.messenger.hs.s, org.telegram.messenger.hs.t, org.telegram.messenger.hs.D, org.telegram.messenger.hs.G0};
    public HashMap A0;
    public boolean B0;
    public final ya C0;
    public bb D0;
    public org.telegram.ui.Components.vi0 E;
    public final ArrayList E0;
    public hb F;
    public final a0.h F0;
    public TextView G;
    public wa G0;
    public mh.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.jn J;
    public pa J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.q1 K0;
    public ImageView L;
    public int L0;
    public ci.ec M;
    public final jb M0;
    public org.telegram.ui.Cells.t0 N;
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
    public mh.f X;
    public ib Y;
    public org.telegram.messenger.zi Z;
    public final si.g a;
    public TLRPC.ChannelParticipant a0;
    public final eh.c b;
    public FrameLayout b0;
    public final eh.c c;
    public ImageView c0;
    public final eh.g d;
    public org.telegram.ui.ActionBar.k5 d0;
    public final int e;
    public l0 e0;
    public final TLRPC.Chat f;
    public l4 f0;
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
    public ci.j1 w;
    public String w0;
    public UndoView x;
    public a0.h x0;
    public kg.y y;
    public final g2.g y0;
    public final HashMap z0;

    public kb(TLRPC.Chat chat) {
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
        this.y0 = new g2.g(S0);
        this.z0 = new HashMap();
        this.C0 = new ya(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.I0 = -1;
        this.M0 = new jb(this);
        this.O0 = -1;
        this.Q0 = new RectF();
        pi.q qVar = this.glassEngine;
        qVar.a = new qa(this);
        qVar.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
        si.g gVar = new si.g();
        this.a = gVar;
        eh.c cVar = new eh.c(gVar, gVar, gVar);
        this.b = cVar;
        cVar.j = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.az.f()) {
            this.d = null;
            this.e = 0;
            eh.c cVar2 = new eh.c(gVar, gVar, gVar);
            this.c = cVar2;
            cVar2.j = this.glassEngine;
        } else {
            eh.g gVar2 = new eh.g(false);
            this.d = gVar2;
            this.glassEngine.a(gVar2);
            si.f fVar = new si.f(gVar);
            fVar.d = gVar2;
            fVar.e = -3;
            fVar.f = gVar;
            if (org.telegram.messenger.lc.e(262144)) {
                si.f fVar2 = new si.f(gVar);
                fVar2.d = gVar2;
                fVar2.e = -2;
                fVar2.f = gVar;
                eh.c cVar3 = new eh.c(fVar2, fVar2, fVar2);
                this.c = cVar3;
                cVar3.j = this.glassEngine;
                int L = org.telegram.messenger.lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
                cVar3.d = L;
                cVar3.e = L;
                cVar3.k = true;
                this.e = 0;
            } else {
                eh.c cVar4 = new eh.c(fVar, fVar, fVar);
                this.c = cVar4;
                cVar4.j = this.glassEngine;
                int L2 = org.telegram.messenger.lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
                cVar4.d = L2;
                cVar4.e = L2;
                this.e = org.telegram.messenger.g0.L(48.0f);
            }
        }
        this.f = chat;
    }

    public static void A0(kb kbVar, org.telegram.messenger.zi ziVar) {
        if (kbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        if (ziVar.D == 3) {
            s1Var.U = org.telegram.messenger.bd.M0(2131748186, null);
        } else {
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131748213, ziVar.F0().mime_type);
        }
        kbVar.showDialog(s1Var);
    }

    public static void F0(kb kbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.hp messagesController = kbVar.getMessagesController();
        TLRPC.Chat chat = kbVar.f;
        TLRPC.ChatFull N0 = messagesController.N0(chat.id);
        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(kbVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, N0, hashMap, kbVar, N0.id, false, org.telegram.messenger.t3.T(chat));
        i50Var.b2 = new za(kbVar);
        i50Var.show();
    }

    public static void P0(kb kbVar) {
        if (kbVar.w == null || kbVar.o0.isEmpty()) {
            return;
        }
        kbVar.y.h1(kbVar.p0.size() - 1, (-100000) - kbVar.w.getPaddingTop());
    }

    public static mw0 X0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.wp wpVar : (org.telegram.ui.Components.wp[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.wp.class)) {
            if (wpVar != null) {
                Drawable drawable = wpVar.c;
                if (drawable instanceof mw0) {
                    return (mw0) drawable;
                }
            }
        }
        return null;
    }

    public static void Z(kb kbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.zi ziVar;
        a0.h hVar = kbVar.l0;
        int i3 = 0;
        kbVar.D0.N = false;
        kbVar.b1(false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = kbVar.o0;
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
                kbVar.P = Math.min(kbVar.P, tL_channelAdminLogEvent.id);
                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(kbVar.currentAccount, tL_channelAdminLogEvent, arrayList, kbVar.n0, kbVar.f, kbVar.U, false);
                if (ziVar2.U >= 0) {
                    hVar.k(ziVar2, tL_channelAdminLogEvent.id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(size);
            if (ziVar3 != null && ziVar3.U != 0 && ziVar3.M1() >= 0) {
                kbVar.m0.k(ziVar3, ziVar3.M1());
            }
            if (ziVar3 != null && (message = ziVar3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            ziVar = null;
                            break;
                        }
                        if (size != i11) {
                            ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
                            if (ziVar.U != 1 && ziVar.M1() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i11++;
                    }
                    if (ziVar != null) {
                        ziVar3.C = ziVar;
                    }
                }
                arrayList2.add(ziVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.li.b0(kbVar.currentAccount).X0(arrayList2, -kbVar.f.id, 0, 0L, new pa(kbVar, 1), kbVar.getClassGuid(), null);
        }
        kbVar.W0();
        kbVar.s0 = false;
        if (!z10) {
            kbVar.r0 = true;
        }
        org.telegram.messenger.g0.Z3(kbVar.n, false, 0.3f, true, true);
        kbVar.w.setEmptyView(kbVar.I);
        hb hbVar = kbVar.F;
        if (hbVar != null) {
            hbVar.f();
        }
        org.telegram.ui.ActionBar.q0 q0Var = kbVar.O;
        if (q0Var != null) {
            if (kbVar.p0.isEmpty() && TextUtils.isEmpty(kbVar.w0)) {
                i3 = 8;
            }
            q0Var.setVisibility(i3);
        }
    }

    public static void a0(kb kbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || kbVar.getParentActivity() == null) {
            return;
        }
        int i3 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, kbVar.getParentActivity(), kbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
        Rect rect = new Rect();
        kbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, kbVar.getResourceProvider());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            if (arrayList4.get(i10) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.c1(kbVar.getParentActivity(), kbVar.getResourceProvider()), b8.mf.o(-1, 8));
            } else {
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, kbVar.getParentActivity(), kbVar.getResourceProvider(), i10 == 0, i10 == size + (-1));
                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                y0Var.j((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                    y0Var.d(kbVar.getThemedColor(org.telegram.ui.ActionBar.k6.q7), kbVar.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                }
                Integer num = (Integer) arrayList4.get(i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                y0Var.setOnClickListener(new ei.t5(kbVar, i10, arrayList4, num, 1));
            }
            i10++;
            arrayList4 = arrayList;
        }
        va vaVar = new va(0, kbVar.Y.getContext(), kbVar);
        vaVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        vaVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        wa waVar = new wa(kbVar, vaVar);
        kbVar.G0 = waVar;
        waVar.e = true;
        waVar.c = org.telegram.messenger.hs.x3;
        waVar.setOutsideTouchable(true);
        kbVar.G0.setClippingEnabled(true);
        kbVar.G0.setAnimationStyle(R.style.PopupContextAnimation);
        kbVar.G0.setFocusable(true);
        vaVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        kbVar.G0.setInputMethodMode(2);
        kbVar.G0.setSoftInputMode(48);
        kbVar.G0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f10)) - vaVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.g0.L(28.0f);
        if (left < org.telegram.messenger.g0.L(6.0f)) {
            left = org.telegram.messenger.g0.L(6.0f);
        } else if (left > (kbVar.w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - vaVar.getMeasuredWidth()) {
            left = (kbVar.w.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f)) - vaVar.getMeasuredWidth();
        }
        if (org.telegram.messenger.g0.Q1()) {
            int[] iArr = new int[2];
            kbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = kbVar.Y.getHeight();
        int L = org.telegram.messenger.g0.L(48.0f) + vaVar.getMeasuredHeight();
        int Q = kbVar.Y.Q();
        if (Q > org.telegram.messenger.g0.L(20.0f)) {
            height += Q;
        }
        if (L < height) {
            int y9 = (int) (kbVar.w.getY() + view.getTop() + f11);
            i3 = (L - rect.top) - rect.bottom > org.telegram.messenger.g0.L(240.0f) ? (org.telegram.messenger.g0.L(240.0f) - L) + y9 : y9;
            if (i3 < kbVar.w.getY() + org.telegram.messenger.g0.L(24.0f)) {
                i3 = (int) (kbVar.w.getY() + org.telegram.messenger.g0.L(24.0f));
            } else {
                int i11 = height - L;
                if (i3 > i11 - org.telegram.messenger.g0.L(8.0f)) {
                    i3 = i11 - org.telegram.messenger.g0.L(8.0f);
                }
            }
        } else if (!kbVar.inBubbleMode) {
            i3 = org.telegram.messenger.g0.m;
        }
        vaVar.setMaxHeight(height - i3);
        kbVar.G0.showAtLocation(kbVar.w, 51, left, i3);
        kbVar.G0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x036d, code lost:
    
        if (r0.exists() != false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(kb kbVar, int i3, ArrayList arrayList, Integer num) {
        TLRPC.Chat M0;
        File file;
        TLRPC.User a22;
        if (kbVar.Z == null || i3 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat = kbVar.f;
        wa waVar = kbVar.G0;
        if (waVar != null) {
            waVar.dismiss();
        }
        org.telegram.messenger.zi ziVar = kbVar.Z;
        if (ziVar == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long Z0 = ziVar.Z0();
            if (0 != Z0) {
                if (Z0 > 0) {
                    TLRPC.User a23 = org.telegram.messenger.hp.s1(kbVar.currentAccount).a2(Long.valueOf(Z0));
                    if (a23 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name)).append((CharSequence) ":\n");
                    }
                } else if (Z0 < 0 && (M0 = org.telegram.messenger.hp.s1(kbVar.currentAccount).M0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) M0.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(ziVar.v)) {
                spannableStringBuilder.append((CharSequence) ziVar.k.message);
            } else {
                spannableStringBuilder.append(ziVar.v);
            }
            org.telegram.messenger.g0.g(spannableStringBuilder);
            org.telegram.messenger.camera.q.r(null, 2131748597, org.telegram.ui.Components.fc.a0(kbVar));
        } else if (intValue == 4) {
            String str = ziVar.k.attachPath;
            if (str != null && str.length() > 0 && !t4.c.p(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                org.telegram.messenger.w7 fileLoader = kbVar.getFileLoader();
                TLRPC.Message message = kbVar.Z.k;
                fileLoader.getClass();
                str = org.telegram.messenger.w7.N(message, false, true).toString();
            }
            int i10 = kbVar.Z.D;
            if (i10 == 3 || i10 == 1) {
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && kbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    kbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    kbVar.Z = null;
                    kbVar.a0 = null;
                    return;
                }
                MediaController.d0(str, kbVar.getParentActivity(), kbVar.Z.D == 3 ? 1 : 0, null, null, null);
            }
        } else if (intValue != 5) {
            int i11 = 24;
            if (intValue == 6) {
                String str2 = ziVar.k.attachPath;
                if (str2 != null && str2.length() > 0 && !t4.c.p(str2)) {
                    str2 = null;
                }
                if (str2 == null || str2.length() == 0) {
                    org.telegram.messenger.w7 fileLoader2 = kbVar.getFileLoader();
                    TLRPC.Message message2 = kbVar.Z.k;
                    fileLoader2.getClass();
                    str2 = org.telegram.messenger.w7.N(message2, false, true).toString();
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType(kbVar.Z.F0().mime_type);
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity parentActivity = kbVar.getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", new File(str2)));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str2)));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str2)));
                }
                try {
                    kbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131745469, null)), 500);
                } catch (Exception unused2) {
                }
            } else if (intValue != 7) {
                int i12 = 2;
                switch (intValue) {
                    case 9:
                        kbVar.showDialog(new org.telegram.ui.Components.xv0(kbVar.getParentActivity(), kbVar, org.telegram.messenger.zi.k1(kbVar.Z.k), null, null, null));
                        break;
                    case 10:
                        if ((Build.VERSION.SDK_INT > 28 && !org.telegram.messenger.r2.b) || kbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                            String B = org.telegram.messenger.w7.B(kbVar.Z.F0());
                            if (TextUtils.isEmpty(B)) {
                                B = kbVar.Z.S0();
                            }
                            String str3 = B;
                            String str4 = kbVar.Z.k.attachPath;
                            if (str4 != null && str4.length() > 0 && !t4.c.p(str4)) {
                                str4 = null;
                            }
                            if (str4 == null || str4.length() == 0) {
                                org.telegram.messenger.w7 fileLoader3 = kbVar.getFileLoader();
                                TLRPC.Message message3 = kbVar.Z.k;
                                fileLoader3.getClass();
                                str4 = org.telegram.messenger.w7.N(message3, false, true).toString();
                            }
                            MediaController.d0(str4, kbVar.getParentActivity(), kbVar.Z.J3() ? 3 : 2, str3, kbVar.Z.F0() != null ? kbVar.Z.F0().mime_type : "", null);
                            break;
                        } else {
                            kbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                            kbVar.Z = null;
                            kbVar.a0 = null;
                            return;
                        }
                        break;
                    case 11:
                        org.telegram.messenger.hp.s1(kbVar.currentAccount).t4(kbVar.Z, ziVar.F0());
                        break;
                    default:
                        switch (intValue) {
                            case 15:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", kbVar.Z.k.media.user_id);
                                bundle.putString("phone", kbVar.Z.k.media.phone_number);
                                bundle.putBoolean("addContact", true);
                                kbVar.presentFragment(new lr(bundle));
                                break;
                            case 16:
                                org.telegram.messenger.g0.g(ziVar.k.media.phone_number);
                                org.telegram.messenger.camera.q.r(null, 2131747303, org.telegram.ui.Components.fc.a0(kbVar));
                                break;
                            case 17:
                                try {
                                    Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + kbVar.Z.k.media.phone_number));
                                    intent2.addFlags(TLObject.FLAG_28);
                                    kbVar.getParentActivity().startActivityForResult(intent2, 500);
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    break;
                                }
                            default:
                                switch (intValue) {
                                    case 33:
                                        if (kbVar.a0 != null) {
                                            TLRPC.User a24 = kbVar.getMessagesController().a2(Long.valueOf(org.telegram.messenger.m5.o(kbVar.a0.peer)));
                                            TLRPC.ChannelParticipant channelParticipant = kbVar.a0;
                                            if (channelParticipant.banned_rights == null) {
                                                channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                            }
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights = kbVar.a0.banned_rights;
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
                                            kbVar.getMessagesController().M4(chat.id, a24, null, kbVar.a0.banned_rights, true, kbVar.getFragmentForAlert(1), new org.telegram.messenger.voip.l0(i11, kbVar, a24));
                                            break;
                                        }
                                        break;
                                    case 34:
                                        TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                        tL_channels_reportAntiSpamFalsePositive.channel = kbVar.getMessagesController().h1(chat.id);
                                        tL_channels_reportAntiSpamFalsePositive.msg_id = kbVar.Z.M1();
                                        kbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new oa(kbVar, i12));
                                        break;
                                    case 35:
                                        kbVar.getMessagesController().e0(chat.id, kbVar.getMessagesController().m1(kbVar.Z.k.from_id), false, new pa(kbVar, i12));
                                        if ((kbVar.Z.k.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.fc.a(kbVar) && (a22 = kbVar.getMessagesController().a2(Long.valueOf(kbVar.Z.k.from_id.user_id))) != null) {
                                            org.telegram.ui.Components.fc.D(kbVar, a22, chat.title).j();
                                            break;
                                        }
                                        break;
                                }
                        }
                }
            } else {
                String str5 = ziVar.k.attachPath;
                if (str5 != null && str5.length() > 0 && !t4.c.p(str5)) {
                    str5 = null;
                }
                if (str5 == null || str5.length() == 0) {
                    org.telegram.messenger.w7 fileLoader4 = kbVar.getFileLoader();
                    TLRPC.Message message4 = kbVar.Z.k;
                    fileLoader4.getClass();
                    str5 = org.telegram.messenger.w7.N(message4, false, true).toString();
                }
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && kbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    kbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    kbVar.Z = null;
                    kbVar.a0 = null;
                    return;
                }
                MediaController.d0(str5, kbVar.getParentActivity(), 0, null, null, null);
            }
        } else {
            String str6 = ziVar.k.attachPath;
            if (str6 != null && str6.length() != 0) {
                file = new File(kbVar.Z.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7 fileLoader5 = kbVar.getFileLoader();
                TLRPC.Message message5 = kbVar.Z.k;
                fileLoader5.getClass();
                File N = org.telegram.messenger.w7.N(message5, false, true);
                if (N.exists()) {
                    file = N;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    kg.y yVar = kbVar.y;
                    if (yVar != null) {
                        if (yVar.N0() < kbVar.y.B() - 1) {
                            int L0 = kbVar.y.L0();
                            kbVar.h0 = L0;
                            org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) kbVar.w.K(L0);
                            if (bj0Var != null) {
                                kbVar.i0 = bj0Var.a.getTop();
                            } else {
                                kbVar.h0 = -1;
                            }
                        } else {
                            kbVar.h0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, kbVar.Z.I0(), null, true);
                    if (v != null) {
                        kbVar.presentFragment(new l71(v));
                    } else {
                        kbVar.h0 = -1;
                        if (kbVar.getParentActivity() == null) {
                            kbVar.Z = null;
                            kbVar.a0 = null;
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        String M02 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M02;
                        s1Var.U = org.telegram.messenger.bd.M0(2131749208, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        kbVar.showDialog(s1Var);
                    }
                } else if (org.telegram.messenger.bd.E0().e(file, kbVar.currentAccount)) {
                    kbVar.presentFragment(new LanguageSelectActivity());
                } else {
                    if (kbVar.getParentActivity() == null) {
                        kbVar.Z = null;
                        kbVar.a0 = null;
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kbVar.getParentActivity());
                    String M03 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                    s1Var2.S = M03;
                    s1Var2.U = org.telegram.messenger.bd.M0(2131749209, null);
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    kbVar.showDialog(s1Var2);
                }
            }
        }
        kbVar.Z = null;
        kbVar.a0 = null;
    }

    public static void c0(kb kbVar, int i3) {
        eh.g gVar = kbVar.d;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (x7.u.a(i3, 4)) {
            ri.a e10 = kbVar.glassEngine.e();
            e10.b(kbVar.w.getY(), kbVar.Y.getWidth(), kbVar.w.getY() + kbVar.w.getHeight());
            gVar.h(e10);
        }
        ib ibVar = kbVar.Y;
        Objects.requireNonNull(ibVar);
        gVar.e(new na(ibVar, 0), kbVar.Y.getWidth(), kbVar.Y.getHeight());
    }

    public static void d0(kb kbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = kbVar.l0;
        kbVar.t0 = false;
        kbVar.D0.N = false;
        kbVar.b1(false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).Y3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.hp.s1(kbVar.currentAccount).S3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i3 = 0; i3 < tL_channels_adminLogResults.events.size(); i3++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i3);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                kbVar.P = Math.min(kbVar.P, tL_channelAdminLogEvent2.id);
                org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(kbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, kbVar.f, kbVar.U, false);
                if (ziVar.U >= 0 && (((tL_channelAdminLogEvent = ziVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    kbVar.o0.add(0, ziVar);
                    hVar.k(ziVar, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (kbVar.F == null || !z10) {
            return;
        }
        kbVar.W0();
        kbVar.F.f();
    }

    public static void e0(kb kbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull N0;
        TLRPC.Chat chat = kbVar.f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            kbVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
            kbVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
            kbVar.u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (N0 = kbVar.getMessagesController().N0(chat.id)) != null && N0.antispam) {
                xa xaVar = new xa();
                xaVar.user_id = kbVar.getMessagesController().e5;
                xaVar.peer = kbVar.getMessagesController().z1(xaVar.user_id);
                long j10 = kbVar.getMessagesController().e5;
                if (kbVar.getMessagesController().a2(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(kbVar.currentAccount).sendRequest(tL_users_getUsers, new oa(kbVar, 1));
                }
                kbVar.u0.add(0, xaVar);
            }
            Dialog dialog = kbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).e1(kbVar.u0);
            }
        }
    }

    public static void e1(int i3, org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return;
        }
        if (i3 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = ziVar.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = ziVar.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            ziVar.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.bd.G(i3, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        ziVar.j5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t10 = org.telegram.messenger.g0.t(spannableStringBuilder, "\n\n");
        if (t10 >= 0 && Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(8.0f)), t10 + 1, t10 + 2, 33);
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
    public static void u0(kb kbVar, Bundle bundle, long j10) {
        TLRPC.Chat chat = kbVar.f;
        if (!chat.megagroup || kbVar.u0 == null || !org.telegram.messenger.t3.w(2, chat)) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= kbVar.u0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) kbVar.u0.get(i3);
            if (org.telegram.messenger.zi.C1(channelParticipant.peer) != j10) {
                i3++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public final org.telegram.messenger.zi S0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.messenger.zi ziVar;
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            if (i3 >= arrayList2.size()) {
                ziVar = null;
                break;
            }
            ziVar = (org.telegram.messenger.zi) arrayList2.get(i3);
            if (ziVar != null && ziVar.U == 1 && ziVar.H0 == j10) {
                break;
            }
            i3++;
        }
        if (ziVar == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.zi) arrayList.get(0)).k.date;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ziVar = new org.telegram.messenger.zi(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j11));
        ziVar.U = 1;
        if (!z11 || arrayList.size() <= 1) {
            ziVar.H0 = -1L;
        } else {
            ziVar.H0 = j10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.zi.F5(org.telegram.messenger.bd.G(arrayList.size(), z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new fa.b(8)).distinct().map(new Function() { // from class: org.telegram.ui.ra
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                kb kbVar = kb.this;
                kbVar.getClass();
                if (l10.longValue() >= 0) {
                    return org.telegram.messenger.l10.k(kbVar.getMessagesController().a2(l10));
                }
                TLRPC.Chat M0 = kbVar.getMessagesController().M0(Long.valueOf(-l10.longValue()));
                if (M0 == null) {
                    return null;
                }
                return M0.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new ai.t1(2)).limit(4L).toArray())), "un1", a22));
        if (z11 && arrayList.size() > 1) {
            mw0 X0 = X0(ziVar.v);
            if (X0 == null) {
                X0 = new mw0(org.telegram.messenger.bd.M0(z10 ? 2131751037 : 2131751036, null));
                Typeface o10 = org.telegram.messenger.g0.o();
                org.telegram.ui.Components.g6 g6Var = X0.a;
                g6Var.x(o10);
                g6Var.w(org.telegram.messenger.g0.L(10.0f));
                if (X0.c != -1) {
                    X0.c = -1;
                    X0.invalidateSelf();
                }
                X0.a(503316480);
            } else {
                X0.a.t(org.telegram.messenger.bd.M0(z10 ? 2131751037 : 2131751036, null), false, true);
            }
            X0.setBounds(0, 0, X0.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(0, X0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ziVar.v = spannableStringBuilder;
        org.telegram.messenger.zi ziVar2 = arrayList.size() > 0 ? (org.telegram.messenger.zi) k2.p1.h(1, arrayList) : null;
        if (ziVar2 != null) {
            long j12 = ziVar2.T;
            a0.h hVar = this.F0;
            if (!hVar.d(j12)) {
                long j13 = ziVar2.T;
                int i10 = R0;
                R0 = i10 + 1;
                hVar.k(Integer.valueOf(i10), j13);
            }
            ziVar.k1 = ((Integer) hVar.f(ziVar2.T)).intValue();
        }
        return ziVar;
    }

    public final void T0(boolean z10) {
        kg.y yVar = this.y;
        if (yVar == null || this.j0) {
            return;
        }
        int L0 = yVar.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.y.N0() - L0) + 1) > 0) {
            this.F.getClass();
            if (L0 > (z10 ? 4 : 1) || this.s0 || this.r0) {
                return;
            }
            Z0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x0196, code lost:
    
        if (org.telegram.messenger.li.b0(r1.currentAccount).B0(r10.id, true) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0198, code lost:
    
        r10 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01af, code lost:
    
        if (org.telegram.messenger.li.b0(r1.currentAccount).O.containsKey(r10.short_name) == false) goto L88;
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
        char c2;
        boolean z10;
        String str;
        Integer num3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        Integer num4;
        String str2;
        boolean z11;
        TLRPC.Message message;
        TLRPC.User a22;
        kb kbVar = this;
        Integer valueOf = Integer.valueOf(R.drawable.msg_gif);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_copy);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_gallery);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_download);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_share);
        org.telegram.messenger.zi messageObject = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view).getMessageObject() : null;
        if (messageObject == null) {
            return false;
        }
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = messageObject.J1;
        int i3 = messageObject.D;
        if (i3 == 6) {
            num = 5;
            num2 = 10;
        } else {
            if (i3 == 10 || i3 == 11 || i3 == 16) {
                num = 5;
                num2 = 10;
                if (messageObject.f1() != 0) {
                    c2 = 1;
                }
            } else {
                if (org.telegram.messenger.zi.S4(messageObject.k)) {
                    num = 5;
                } else if (messageObject.u4() || messageObject.K2()) {
                    num = 5;
                    TLRPC.InputStickerSet k1 = org.telegram.messenger.zi.k1(messageObject.k);
                    if (k1 instanceof TLRPC.TL_inputStickerSetID) {
                        num2 = 10;
                    } else {
                        num2 = 10;
                        if (k1 instanceof TLRPC.TL_inputStickerSetShortName) {
                        }
                        c2 = 2;
                    }
                } else {
                    if (messageObject.i4()) {
                        if (messageObject.i4()) {
                            boolean z12 = org.telegram.messenger.r2.a;
                        }
                        if (messageObject.D != 12) {
                            num = 5;
                            num2 = 10;
                            c2 = '\b';
                        } else {
                            num = 5;
                            num2 = 10;
                            if (messageObject.G3()) {
                                c2 = 3;
                            }
                            c2 = 2;
                        }
                    }
                    if ((messageObject.k.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.F0() != null || messageObject.J3() || org.telegram.messenger.zi.M4(messageObject.k)) {
                        String str3 = messageObject.k.attachPath;
                        boolean z13 = (str3 == null || str3.length() == 0 || !new File(messageObject.k.attachPath).exists()) ? false : true;
                        if (z13) {
                            num = 5;
                            z10 = z13;
                        } else {
                            org.telegram.messenger.w7 fileLoader = kbVar.getFileLoader();
                            z10 = z13;
                            TLRPC.Message message2 = messageObject.k;
                            fileLoader.getClass();
                            num = 5;
                            if (org.telegram.messenger.w7.N(message2, false, true).exists()) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            if (messageObject.F0() != null && (str = messageObject.F0().mime_type) != null) {
                                if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                                    num2 = 10;
                                    c2 = '\n';
                                } else if (str.endsWith("/xml")) {
                                    num2 = 10;
                                    c2 = 5;
                                } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                    num2 = 10;
                                    c2 = 6;
                                }
                            }
                            num2 = 10;
                            c2 = 4;
                        }
                    }
                    if (messageObject.D != 12) {
                    }
                }
                num2 = 10;
                c2 = 2;
            }
            kbVar.Z = messageObject;
            if (kbVar.getParentActivity() != null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.messenger.zi ziVar = messageObject;
            TLRPC.Chat chat = kbVar.f;
            if (chat == null || tL_channelAdminLogEvent2 == null) {
                num3 = valueOf4;
            } else {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                num3 = valueOf4;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                    TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().N0(chat.id), null, this, chat.id, false, org.telegram.messenger.t3.V(chat));
                        i50Var.c2 = false;
                        i50Var.show();
                        return true;
                    }
                }
                kbVar = this;
            }
            if (tL_channelAdminLogEvent2 != null) {
                num4 = 4;
                if ((!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent2.user_id != kbVar.getMessagesController().e5) && !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam)) {
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                } else {
                    if (view instanceof org.telegram.ui.Cells.t0) {
                        SpannableString spannableString = new SpannableString(">");
                        Drawable mutate = kbVar.getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(kbVar.getThemedColor(org.telegram.ui.ActionBar.k6.uj), PorterDuff.Mode.MULTIPLY));
                        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                        spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131750996, null)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) org.telegram.messenger.bd.M0(2131752517, null));
                        spannableStringBuilder.setSpan(new gi.ka(kbVar, 3), 0, spannableStringBuilder.length(), 33);
                        org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(kbVar).I(R.raw.msg_antispam, org.telegram.messenger.bd.M0(2131752460, null), org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131752461, null), spannableStringBuilder, "%s"));
                        I.j = 5000;
                        I.j();
                        return true;
                    }
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                    org.telegram.ui.Cells.f1.x(null, 2131746229, arrayList, R.drawable.msg_notspam, arrayList3);
                    arrayList2.add(34);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
            } else {
                tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                num4 = 4;
            }
            org.telegram.messenger.zi ziVar2 = kbVar.Z;
            if (ziVar2.D == 0 || ziVar2.z != null) {
                arrayList.add(org.telegram.messenger.bd.M0(2131751767, null));
                arrayList3.add(valueOf2);
                arrayList2.add(3);
            }
            if (c2 == 1) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = kbVar.Z.J1;
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
                            showDialog(new org.telegram.ui.Components.xv0(getParentActivity(), this, inputStickerSet2, null, null, null));
                            return true;
                        }
                    }
                }
                if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                    g50 g50Var = new g50(chat.id, 0);
                    TLRPC.ChatFull N0 = kbVar.getMessagesController().N0(chat.id);
                    if (N0 != null) {
                        g50Var.j0(N0);
                        kbVar.presentFragment(g50Var);
                    }
                } else if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && org.telegram.messenger.t3.y(13, chat)) {
                    org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(kbVar.getParentActivity(), chat);
                    lpVar.t1 = new ua(kbVar);
                    kbVar.showDialog(lpVar);
                }
            } else if (c2 == 3) {
                TLRPC.MessageMedia messageMedia = kbVar.Z.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.N3(messageMedia.webpage.document)) {
                    arrayList.add(org.telegram.messenger.bd.M0(2131745940, null));
                    arrayList3.add(valueOf);
                    arrayList2.add(11);
                }
            } else if (c2 != 4) {
                Integer num5 = num2;
                Integer num6 = num3;
                if (c2 == 5) {
                    org.telegram.ui.Cells.f1.x(null, 2131754217, arrayList, R.drawable.msg_language, arrayList3);
                    arrayList2.add(num);
                    arrayList.add(org.telegram.messenger.bd.M0(2131745941, null));
                    arrayList3.add(num6);
                    arrayList2.add(num5);
                    arrayList.add(org.telegram.messenger.bd.M0(2131745469, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num7 = num;
                    if (c2 == '\n') {
                        org.telegram.ui.Cells.f1.x(null, 2131754215, arrayList, R.drawable.msg_theme, arrayList3);
                        arrayList2.add(num7);
                        arrayList.add(org.telegram.messenger.bd.M0(2131745941, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.bd.M0(2131745469, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c2 == 6) {
                        arrayList.add(org.telegram.messenger.bd.M0(2131745939, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(7);
                        arrayList.add(org.telegram.messenger.bd.M0(2131745941, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.bd.M0(2131745469, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c2 == 7) {
                        TLRPC.Message message3 = kbVar.Z.k;
                        if (org.telegram.messenger.zi.o1(message3) != null && org.telegram.messenger.zi.F3(org.telegram.messenger.zi.o1(message3).document)) {
                            arrayList.add(org.telegram.messenger.bd.M0(2131754371, null));
                        } else {
                            arrayList.add(org.telegram.messenger.bd.M0(2131754369, null));
                        }
                        arrayList3.add(Integer.valueOf(R.drawable.msg_sticker));
                        arrayList2.add(9);
                    } else if (c2 == '\b') {
                        long j10 = kbVar.Z.k.media.user_id;
                        TLRPC.User a23 = j10 != 0 ? org.telegram.messenger.hp.s1(kbVar.currentAccount).a2(Long.valueOf(j10)) : null;
                        if (a23 != null && a23.id != org.telegram.messenger.h10.i(kbVar.currentAccount).e() && org.telegram.messenger.g5.r(kbVar.currentAccount).g0.get(Long.valueOf(a23.id)) == null) {
                            org.telegram.ui.Cells.f1.x(null, 2131754444, arrayList, R.drawable.msg_addcontact, arrayList3);
                            arrayList2.add(15);
                        }
                        if (!TextUtils.isEmpty(kbVar.Z.k.media.phone_number)) {
                            arrayList.add(org.telegram.messenger.bd.M0(2131751767, null));
                            arrayList3.add(valueOf2);
                            arrayList2.add(16);
                            arrayList.add(org.telegram.messenger.bd.M0(2131752634, null));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                            arrayList2.add(17);
                        }
                    }
                }
            } else if (org.telegram.messenger.zi.M4(kbVar.Z.k)) {
                arrayList.add(org.telegram.messenger.bd.M0(2131745939, null));
                arrayList3.add(valueOf3);
                arrayList2.add(num4);
                arrayList.add(org.telegram.messenger.bd.M0(2131745469, null));
                arrayList3.add(valueOf5);
                arrayList2.add(6);
            } else {
                Integer num8 = num4;
                if (kbVar.Z.J3()) {
                    arrayList.add(org.telegram.messenger.bd.M0(2131745921, null));
                    arrayList3.add(num3);
                    arrayList2.add(num2);
                    arrayList.add(org.telegram.messenger.bd.M0(2131745469, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num9 = num2;
                    Integer num10 = num3;
                    if (kbVar.Z.F0() != null) {
                        if (org.telegram.messenger.zi.N3(kbVar.Z.F0())) {
                            str2 = null;
                            arrayList.add(org.telegram.messenger.bd.M0(2131745940, null));
                            arrayList3.add(valueOf);
                            arrayList2.add(11);
                        } else {
                            str2 = null;
                        }
                        arrayList.add(org.telegram.messenger.bd.M0(2131745941, str2));
                        arrayList3.add(num10);
                        arrayList2.add(num9);
                        arrayList.add(org.telegram.messenger.bd.M0(2131745469, str2));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else {
                        arrayList.add(org.telegram.messenger.bd.M0(2131745939, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(num8);
                    }
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = tL_channelAdminLogEvent;
            ta taVar = new ta(kbVar, arrayList2, arrayList, arrayList3, view, f10, f11);
            if (org.telegram.messenger.t3.w(2, chat) && tL_channelAdminLogEvent4 != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                if (((channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = ziVar.k) != null && message.from_id != null && (a22 = kbVar.getMessagesController().a2(Long.valueOf(kbVar.Z.k.from_id.user_id))) != null && !org.telegram.messenger.l10.B(a22)) {
                    org.telegram.messenger.hp messagesController = kbVar.getMessagesController();
                    ci.o2 o2Var = new ci.o2(kbVar, arrayList, arrayList3, arrayList2, taVar, 1);
                    taVar = taVar;
                    messagesController.K0(chat, a22, o2Var);
                    z11 = true;
                    if (!z11) {
                        return true;
                    }
                    taVar.run();
                    return true;
                }
            }
            z11 = false;
            if (!z11) {
            }
        }
        c2 = 65535;
        kbVar.Z = messageObject;
        if (kbVar.getParentActivity() != null) {
        }
    }

    public final TextureView V0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            l0 l0Var = new l0(4, getParentActivity(), this);
            this.e0 = l0Var;
            l0Var.setOutlineProvider(new cg.p0(10));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            l4 l4Var = new l4(getParentActivity());
            this.f0 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.e0.addView(this.f0, b8.mf.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, b8.mf.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            ib ibVar = this.Y;
            l0 l0Var2 = this.e0;
            int i3 = org.telegram.messenger.g0.u;
            ibVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i3, i3));
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList4 = this.o0;
            if (i3 >= arrayList4.size()) {
                ArrayList arrayList5 = this.p0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList4.get(i3);
            long j10 = (ziVar == null || (tL_channelAdminLogEvent2 = ziVar.J1) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (ziVar.k1 <= 0) {
                int i10 = R0;
                R0 = i10 + 1;
                ziVar.k1 = i10;
            }
            int i11 = i3 + 1;
            org.telegram.messenger.zi ziVar2 = i11 < arrayList4.size() ? (org.telegram.messenger.zi) arrayList4.get(i11) : null;
            long j11 = (ziVar2 == null || (tL_channelAdminLogEvent = ziVar2.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j10 != 0) {
                arrayList3.add(ziVar);
            } else {
                arrayList2.add(ziVar);
            }
            if (j10 == j11 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = ziVar.k.reply_markup;
                boolean z10 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.zi) arrayList3.get(size2)).U == 1; size2--) {
                    arrayList6.add((org.telegram.messenger.zi) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) k2.p1.h(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.w0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(ziVar3.T);
                    HashSet hashSet = this.q0;
                    if (hashSet.contains(valueOf) || !z11) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            e1(0, (org.telegram.messenger.zi) arrayList3.get(i12));
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        e1(arrayList3.size() - 1, ziVar3);
                        arrayList2.add(ziVar3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = ziVar3.k.reply_markup;
                    if (z10 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        ziVar3.K1 = true;
                        this.F.g((z10 ? arrayList3.size() - 1 : 0) + size);
                        this.F.g(size + (z10 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j12 = ziVar.T;
                    org.telegram.messenger.zi S02 = S0(j12, ziVar.J1.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11);
                    arrayList = arrayList3;
                    arrayList2.add(S02);
                }
                if (!arrayList6.isEmpty()) {
                    org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) k2.p1.h(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(S0(ziVar4.T, ziVar4.J1.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i3 = i11;
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
            this.S.addListener(new org.telegram.ui.Cells.w9(this, 2));
            this.S.setStartDelay(500L);
            this.S.start();
        }
    }

    public final void Z0(boolean z10) {
        hb hbVar;
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.o0;
        if (z10) {
            this.P = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                org.telegram.messenger.g0.Z3(frameLayout, true, 0.3f, true, true);
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
        tL_channels_getAdminLog.channel = org.telegram.messenger.hp.i1(this.f);
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
            for (int i3 = 0; i3 < this.x0.m(); i3++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.hp.s1(this.currentAccount).q1((TLRPC.User) this.x0.n(i3)));
            }
        }
        g1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new oa(this, 3));
        if (!z10 || (hbVar = this.F) == null) {
            return;
        }
        hbVar.f();
    }

    public final void a1() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.hp.i1(this.f);
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
            for (int i3 = 0; i3 < this.x0.m(); i3++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.hp.s1(this.currentAccount).q1((TLRPC.User) this.x0.n(i3)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new oa(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    public final void b1(boolean z10) {
        ci.j1 j1Var = this.w;
        if (j1Var == null || this.y == null || j1Var.getChildCount() <= 0) {
            return;
        }
        int i3 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < this.w.getChildCount(); i11++) {
            View childAt = this.w.getChildAt(i11);
            this.w.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z10) {
                    if (top >= i3) {
                    }
                    i3 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                } else {
                    if (top <= i3) {
                    }
                    i3 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                }
            }
        }
        if (view != null) {
            this.N0 = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject().T : view instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view).getMessageObject().T : 0L;
            this.O0 = i10;
            this.P0 = (this.w.getMeasuredHeight() - view.getBottom()) - this.w.getPaddingBottom();
        }
    }

    public final int c1(org.telegram.messenger.zi ziVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i3;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.xi xiVar;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.q1 q1Var2 = this.K0;
            if (q1Var2 != null) {
                q1Var2.Sc = 0;
                q1Var2.Tc = null;
            }
        } else {
            if (TextUtils.isEmpty(ziVar.z) || (q1Var = this.K0) == null || (xiVar = q1Var.l3) == null) {
                CharSequence charSequence2 = ziVar.v;
                arrayList = ziVar.z2;
                org.telegram.ui.Cells.q1 q1Var3 = this.K0;
                if (q1Var3 == null || !q1Var3.u1) {
                    charSequence = charSequence2;
                    i3 = 0;
                } else {
                    i3 = q1Var3.V1 + org.telegram.messenger.g0.L(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i3 = (int) q1Var.s3;
                charSequence = ziVar.z;
                arrayList = xiVar.e;
            }
            org.telegram.ui.Cells.q1 q1Var4 = this.K0;
            if (q1Var4 != null) {
                q1Var4.Sc = 0;
                q1Var4.Tc = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.zi.Y(this.I0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) arrayList.get(i10);
                        String charSequence3 = wiVar.e.getText().toString();
                        int i11 = wiVar.n;
                        if (Y > i11) {
                            float o10 = Y - i11 > charSequence3.length() + (-1) ? i3 + ((int) (wiVar.o(arrayList) + wiVar.f + wiVar.w)) : r5.getLineTop(r5.getLineForOffset(Y - wiVar.n)) + wiVar.o(arrayList) + i3 + wiVar.f;
                            Point point = org.telegram.messenger.g0.q;
                            if (o10 > point.y * (this.Y.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) ? 0.7f : 0.5f)) {
                                return (int) (o10 - (point.y * (this.Y.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) ? 0.7f : 0.5f)));
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

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        final int i3 = 0;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.q1(context, this.currentAccount));
            }
        }
        this.V = false;
        final int i11 = 1;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.k6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 3));
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, null, false, null);
        this.J = jnVar;
        kk kkVar = jnVar.h;
        if (kkVar != null) {
            kkVar.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        }
        kk kkVar2 = jnVar.r;
        if (kkVar2 != null) {
            kkVar2.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        }
        jnVar.m0 = true;
        this.J.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.actionBar.addView(this.J, 0, b8.mf.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new lg.w1(this, i11);
        this.O = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        int i12 = 7;
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.jn jnVar2 = this.J;
        TLRPC.Chat chat = this.f;
        jnVar2.setTitle(chat.title);
        this.J.setSubtitle(org.telegram.messenger.bd.M0(2131751075, null));
        this.J.setChatAvatar(chat);
        ab abVar = new ab(this, context);
        this.fragmentView = abVar;
        this.Y = abVar;
        abVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        this.Y.U(org.telegram.ui.ActionBar.k6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        ih.b p10 = b8.cd.p(this.resourceProvider);
        eh.c cVar = this.c;
        kVar.M(cVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, b8.mf.e(-1, -2, 17));
        this.I.setOnTouchListener(new fi.a(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.v5(this.M, this.Y, org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, b8.mf.t(54, 54, 17, 16, 20, 16, -4));
        ci.ec ecVar = new ci.ec(context, 10);
        this.M = ecVar;
        ecVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        ci.ec ecVar2 = this.M;
        int i13 = org.telegram.ui.ActionBar.k6.Wc;
        org.telegram.ui.ActionBar.r6.V(ecVar2, i13, null);
        this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        this.K.addView(this.M, b8.mf.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, b8.mf.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        ci.j1 j1Var = new ci.j1(9, context, this);
        this.w = j1Var;
        j1Var.setOnItemClickListener(new f(this, i12));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        ci.j1 j1Var2 = this.w;
        hb hbVar = new hb(this, context);
        this.F = hbVar;
        j1Var2.setAdapter(hbVar);
        this.w.setClipToPadding(false);
        ci.j1 j1Var3 = this.w;
        int i14 = org.telegram.messenger.g0.m;
        int i15 = this.e;
        j1Var3.setPadding(0, org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14 + i15, 0, org.telegram.messenger.g0.L(60.0f) + i15 + org.telegram.messenger.g0.n);
        ci.j1 j1Var4 = this.w;
        bb bbVar = new bb(this, this.w, this.resourceProvider);
        this.D0 = bbVar;
        j1Var4.setItemAnimator(bbVar);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        kg.y yVar = new kg.y(this);
        this.y = yVar;
        yVar.j1(1);
        this.y.l1(true);
        this.w.setLayoutManager(this.y);
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(this.w, this.y);
        this.E = vi0Var;
        vi0Var.h = new qa(this);
        vi0Var.i = this.M0;
        this.Y.addView(this.w, b8.mf.c(-1.0f, -1));
        this.w.setOnScrollListener(new h3(this));
        this.glassEngine.b(this.w);
        int i16 = this.h0;
        if (i16 != -1) {
            this.y.h1(i16, this.i0);
            this.h0 = -1;
        }
        mh.f fVar = new mh.f(context);
        this.X = fVar;
        fVar.setup(this.b);
        this.X.setFadeZoneTop(org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.X.setFadeHeightTop(org.telegram.messenger.g0.L(60.0f));
        this.X.setFadeZoneBottom(org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(44.0f) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.n);
        this.X.setFadeHeightBottom(org.telegram.messenger.g0.L(60.0f));
        this.Y.addView(this.X, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, b8.mf.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new org.telegram.ui.ActionBar.v5(this.r, this.Y, org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.f2));
        this.n.addView(this.r, b8.mf.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        this.s.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        this.n.addView(this.s, b8.mf.e(32, 32, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        this.N = t0Var;
        t0Var.setAlpha(0.0f);
        final int i17 = 2;
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, b8.mf.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        mh.e eVar = new mh.e(context, cVar, b8.cd.b(e6Var), e6Var);
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-org.telegram.messenger.g0.n);
        this.H.c(4, true, false);
        mh.e eVar2 = this.H;
        gh.g c2 = eVar2.n.c(eVar2, null, false);
        c2.p(eVar2.r);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(22.0f), 6.0f);
        eVar2.s = c2;
        this.Y.addView(this.H, b8.mf.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sa
            public final /* synthetic */ kb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i3;
                kb kbVar = this.b;
                switch (i18) {
                    case 0:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(kbVar, kbVar.v0, kbVar.x0, kbVar.f.megagroup);
                            g0Var.e1(kbVar.u0);
                            g0Var.Z1 = new qa(kbVar);
                            kbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        boolean z10 = kbVar.f.megagroup;
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        if (z10) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750978, null));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131750976, null);
                        kbVar.showDialog(s1Var);
                        break;
                    default:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(kbVar.O.getSearchField());
                            kbVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(kbVar.getParentActivity(), new ma(kbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(this.G, org.telegram.ui.ActionBar.k6.pf, null);
        this.G.setText(org.telegram.messenger.bd.M0(2131745993, null));
        this.G.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        this.H.getContainer().addView(this.G, b8.mf.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.sa
            public final /* synthetic */ kb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i11;
                kb kbVar = this.b;
                switch (i18) {
                    case 0:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(kbVar, kbVar.v0, kbVar.x0, kbVar.f.megagroup);
                            g0Var.e1(kbVar.u0);
                            g0Var.Z1 = new qa(kbVar);
                            kbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        boolean z10 = kbVar.f.megagroup;
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        if (z10) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750978, null));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131750976, null);
                        kbVar.showDialog(s1Var);
                        break;
                    default:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(kbVar.O.getSearchField());
                            kbVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(kbVar.getParentActivity(), new ma(kbVar, 0), null).b);
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
        this.Y.addView(this.b0, b8.mf.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(R.drawable.msg_calendar);
        org.telegram.ui.ActionBar.r6.t(this.c0, org.telegram.ui.ActionBar.k6.mf, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, b8.mf.e(48, 48, 53));
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sa
            public final /* synthetic */ kb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                kb kbVar = this.b;
                switch (i18) {
                    case 0:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(kbVar, kbVar.v0, kbVar.x0, kbVar.f.megagroup);
                            g0Var.e1(kbVar.u0);
                            g0Var.Z1 = new qa(kbVar);
                            kbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        boolean z10 = kbVar.f.megagroup;
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        if (z10) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750978, null));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131750976, null);
                        kbVar.showDialog(s1Var);
                        break;
                    default:
                        if (kbVar.getParentActivity() != null) {
                            org.telegram.messenger.g0.v1(kbVar.O.getSearchField());
                            kbVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(kbVar.getParentActivity(), new ma(kbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d0 = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.nf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(org.telegram.messenger.g0.o());
        this.b0.addView(this.d0, b8.mf.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            org.telegram.messenger.g0.Z3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            org.telegram.messenger.g0.Z3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        ci.j1 j1Var5 = this.w;
        j1Var5.X1 = true;
        j1Var5.Y1 = 1;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.Y.addView(this.x, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
    public final void d1(org.telegram.messenger.zi ziVar) {
        int i3;
        int i10;
        int indexOf;
        boolean z10;
        float f10;
        int q02;
        org.telegram.messenger.zi messageObject;
        ArrayList arrayList = this.p0;
        boolean z11 = true;
        if (arrayList.size() > 0) {
            int N0 = this.y.N0();
            for (int L0 = this.y.L0(); L0 <= N0; L0++) {
                hb hbVar = this.F;
                int i11 = hbVar.f;
                if (L0 >= i11 && L0 < hbVar.h) {
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(L0 - i11);
                    if (ziVar2.U != 1 && ziVar2.M1() != 0 && !ziVar2.s4()) {
                        i10 = L0 - this.F.f;
                        i3 = (ziVar2.M1() < ziVar.M1() ? 1 : 0) ^ 1;
                        this.E.b = i3;
                        indexOf = arrayList.indexOf(ziVar);
                        if (indexOf == -1) {
                            if (i10 > 0) {
                                i3 = i10 > indexOf ? 0 : 1;
                                this.E.b = i3;
                            }
                            pa paVar = this.J0;
                            if (paVar != null) {
                                org.telegram.messenger.g0.r(paVar);
                                this.J0 = null;
                            }
                            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.H0 = ziVar.M1();
                            int indexOf2 = arrayList.indexOf(ziVar) + this.F.f;
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
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.messenger.zi messageObject2 = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                                    z10 = z11;
                                    if (messageObject2 != null) {
                                        f10 = 2.0f;
                                        if (messageObject2.M1() == ziVar.M1()) {
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
                                    if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null && messageObject.M1() == ziVar.M1()) {
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
                                q02 = 0;
                            } else {
                                if (this.K0 == null) {
                                    this.K0 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.q1 q1Var = this.K0;
                                TLRPC.Chat chat = this.f;
                                q1Var.e6 = chat != null ? z10 : false;
                                q1Var.j6 = (org.telegram.messenger.t3.T(chat) && chat.megagroup) ? z10 : false;
                                q02 = this.K0.q0(ziVar, null, z13);
                            }
                            int max = Math.max(-org.telegram.messenger.g0.L(f10), (this.w.getMeasuredHeight() - q02) / 2) - c1(ziVar);
                            jb jbVar = this.M0;
                            jbVar.a = ziVar;
                            jbVar.e = max;
                            org.telegram.ui.Components.vi0 vi0Var = this.E;
                            vi0Var.b = i3;
                            jbVar.b = indexOf2;
                            jbVar.d = max;
                            jbVar.c = false;
                            vi0Var.d(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i3 = -1;
        i10 = 0;
        this.E.b = i3;
        indexOf = arrayList.indexOf(ziVar);
        if (indexOf == -1) {
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.zi messageObject2;
        org.telegram.ui.Cells.q1 q1Var3;
        org.telegram.messenger.zi messageObject3;
        boolean z10;
        if (i3 == org.telegram.messenger.hs.i4) {
            ci.j1 j1Var = this.w;
            if (j1Var != null) {
                j1Var.g1();
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.h2) {
            if (i3 == org.telegram.messenger.hs.f2 || i3 == org.telegram.messenger.hs.g2) {
                ci.j1 j1Var2 = this.w;
                if (j1Var2 != null) {
                    int childCount = j1Var2.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.w.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null) {
                            if (org.telegram.messenger.zi.S4(messageObject.k) || messageObject.J3()) {
                                q1Var.M3(false, true, false);
                            } else if (messageObject.i4() && !MediaController.B().I(messageObject)) {
                                q1Var.o0(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i3 != org.telegram.messenger.hs.e2) {
                if (i3 != org.telegram.messenger.hs.z4 || this.fragmentView == null) {
                    return;
                }
                this.Y.U(org.telegram.ui.ActionBar.k6.s0());
                this.r.invalidate();
                ci.ec ecVar = this.M;
                if (ecVar != null) {
                    ecVar.invalidate();
                }
                this.w.g1();
                return;
            }
            Integer num = (Integer) objArr[0];
            ci.j1 j1Var3 = this.w;
            if (j1Var3 != null) {
                int childCount2 = j1Var3.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.w.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = (q1Var2 = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject2.f1() == num.intValue()) {
                        org.telegram.messenger.zi ziVar = MediaController.B().v0;
                        if (ziVar != null) {
                            messageObject2.b0 = ziVar.b0;
                            messageObject2.g0 = ziVar.g0;
                            messageObject2.h0 = ziVar.h0;
                            q1Var2.Q3();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((org.telegram.messenger.zi) objArr[0]).i4()) {
            MediaController.B().p0(V0(true), this.f0, this.e0, true);
            int childCount3 = this.w.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.w.getChildAt(i13);
                if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt3;
                    org.telegram.messenger.zi messageObject4 = q1Var4.getMessageObject();
                    if (this.e0 != null && messageObject4.i4() && MediaController.B().I(messageObject4)) {
                        ImageReceiver photoImage = q1Var4.getPhotoImage();
                        this.e0.setTranslationX(photoImage.L0);
                        this.e0.setTranslationY(q1Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                        this.fragmentView.invalidate();
                        this.e0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i13++;
            }
            if (this.e0 != null) {
                org.telegram.messenger.zi ziVar2 = MediaController.B().v0;
                if (z10) {
                    MediaController.B().k0(true);
                } else {
                    this.e0.setTranslationY((-org.telegram.messenger.g0.u) - 100);
                    this.fragmentView.invalidate();
                    if (ziVar2 != null && ziVar2.i4() && (this.W || PipRoundVideoView.G != null)) {
                        MediaController.B().k0(false);
                    }
                }
            }
        }
        ci.j1 j1Var4 = this.w;
        if (j1Var4 != null) {
            int childCount4 = j1Var4.getChildCount();
            for (int i14 = 0; i14 < childCount4; i14++) {
                View childAt4 = this.w.getChildAt(i14);
                if ((childAt4 instanceof org.telegram.ui.Cells.q1) && (messageObject3 = (q1Var3 = (org.telegram.ui.Cells.q1) childAt4).getMessageObject()) != null) {
                    if (org.telegram.messenger.zi.S4(messageObject3.k) || messageObject3.J3()) {
                        q1Var3.M3(false, true, false);
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

    @Override // org.telegram.ui.ActionBar.d2
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
            this.M.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748209, null)));
            return;
        }
        if (this.x0 != null || this.v0 != null) {
            this.L.setVisibility(8);
            this.M.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(3.0f));
            this.M.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748208, null)));
            return;
        }
        this.L.setVisibility(0);
        this.M.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        if (this.f.megagroup) {
            ci.ec ecVar = this.M;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751013, null));
            f1(X2);
            ecVar.setText(X2);
            return;
        }
        ci.ec ecVar2 = this.M;
        SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751012, null));
        f1(X22);
        ecVar2.setText(X22);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
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
        int i3 = org.telegram.ui.ActionBar.k6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.M, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    public final void h1() {
        ci.j1 j1Var = this.w;
        if (j1Var == null) {
            return;
        }
        int childCount = j1Var.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.w.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) childAt;
                float y9 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                y1Var.f = y9;
                y1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                int top = q1Var.getTop();
                q1Var.getBottom();
                int i12 = top >= 0 ? 0 : -top;
                int measuredHeight2 = q1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i12 + measuredHeight;
                }
                q1Var.y3(i12, measuredHeight2 - i12, (this.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                if (this.e0 != null && messageObject.i4() && MediaController.B().I(messageObject)) {
                    ImageReceiver photoImage = q1Var.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                t0Var.h0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (t0Var.Q()) {
                    t0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i3) {
                    if ((childAt instanceof org.telegram.ui.Cells.q1) || (childAt instanceof org.telegram.ui.Cells.t0)) {
                        view = childAt;
                    }
                    i3 = bottom;
                    view3 = childAt;
                }
                bb bbVar = this.D0;
                if ((bbVar == null || (!bbVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.t0) && ((org.telegram.ui.Cells.t0) childAt).getMessageObject().j0) {
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
        l0 l0Var = this.e0;
        if (l0Var != null) {
            if (z11) {
                MediaController.B().k0(true);
            } else {
                l0Var.setTranslationY((-org.telegram.messenger.g0.u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.zi ziVar = MediaController.B().v0;
                if (ziVar != null && ziVar.i4() && this.W) {
                    MediaController.B().k0(false);
                }
            }
        }
        if (view != null) {
            this.N.e0((view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject() : ((org.telegram.ui.Cells.t0) view).getMessageObject()).k.date, false, true);
        }
        this.Q = false;
        if (!(view3 instanceof org.telegram.ui.Cells.q1) && !(view3 instanceof org.telegram.ui.Cells.t0)) {
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
        ci.j1 j1Var = this.w;
        if (j1Var == null) {
            return;
        }
        int childCount = j1Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.w.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.v()) {
                        q1Var.setDrawSelectionBackground(false);
                        q1Var.h3(false, true);
                        q1Var.j3(false, false, true);
                    }
                    q1Var.setHighlighted(this.H0 != Integer.MAX_VALUE && messageObject.M1() == this.H0);
                    if (this.H0 != Integer.MAX_VALUE) {
                        pa paVar = this.J0;
                        if (paVar != null) {
                            org.telegram.messenger.g0.r(paVar);
                        }
                        pa paVar2 = new pa(this, 0);
                        this.J0 = paVar2;
                        org.telegram.messenger.g0.i3(paVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.w0)) {
                        q1Var.q3(null);
                    } else {
                        q1Var.q3(this.w0);
                    }
                    q1Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                t0Var.setMessageObject(t0Var.getMessageObject());
                t0Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.h2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.g2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.z4);
        Z0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.hp.i1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.hs.e3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new oa(this, 4)), this.classGuid);
        setBulletinDelegate(new ai.y(8));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.h2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.g2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.z4);
        this.y0.e();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        ib ibVar = this.Y;
        if (ibVar != null) {
            org.telegram.ui.Components.q61 q61Var = ibVar.w;
            if (q61Var != null) {
                q61Var.c(false);
            }
            ibVar.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        b4.n nVar = b4.n.e;
        if (nVar == null || !nVar.a) {
            return;
        }
        b4.n p10 = b4.n.p();
        if (p10.a) {
            t4 t4Var = (t4) p10.d;
            int i3 = d5.G;
            t4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        ib ibVar = this.Y;
        if (ibVar != null) {
            org.telegram.ui.Components.q61 q61Var = ibVar.w;
            if (q61Var != null) {
                q61Var.c(true);
            }
            ibVar.G = false;
        }
        this.j0 = false;
        T0(false);
        if (this.k0) {
            this.k0 = false;
            hb hbVar = this.F;
            if (hbVar != null) {
                hbVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.y0.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.y0.d();
        }
    }
}
