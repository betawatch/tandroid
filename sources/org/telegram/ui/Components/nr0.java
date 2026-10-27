package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class nr0 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int Z0 = 0;
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public o1.j C0;
    public TLRPC.Dialog D0;
    public AnimatorSet E;
    public final yq0 E0;
    public final nm0 F;
    public ArrayList F0;
    public final oq0 G;
    public TL_stories.StoryItem G0;
    public final oq0 H;
    public i0.b H0;
    public final s4.t I;
    public int I0;
    public final s4.t J;
    public boolean J0;
    public final xz K;
    public org.telegram.ui.ActionBar.o1 K0;
    public final fr0 L;
    public int L0;
    public final kr0 M;
    public boolean M0;
    public final jr0 N;
    public boolean N0;
    public final ArrayList O;
    public int O0;
    public final String[] P;
    public final ch.f P0;
    public final int Q;
    public final hh.c Q0;
    public final fy0 R;
    public final ch.b R0;
    public final Drawable S;
    public final ch.b S0;
    public final View[] T;
    public final ch.b T0;
    public final AnimatorSet[] U;
    public final kh U0;
    public final a0.h V;
    public final eh.d V0;
    public final HashMap W;
    public final ch.c W0;
    public final zq0 X;
    public final eh.d X0;
    public int Y;
    public boolean Y0;
    public boolean Z;
    public final boolean a0;
    public final FrameLayout b;
    public boolean b0;
    public final rq0 c;
    public final int c0;
    public final sq0 d;
    public final FrameLayout d0;
    public final li.w1 e;
    public final LinearLayout e0;
    public final rq0 f;
    public final aq f0;
    public final org.telegram.ui.wn g0;
    public final FrameLayout h;
    public final Activity h0;
    public final boolean i0;
    public boolean j0;
    public final TextPaint k0;
    public TLRPC.TL_exportedMessageLink l0;
    public boolean m0;
    public float n;
    public boolean n0;
    public final boolean o0;
    public final String[] p0;
    public int q0;
    public final bi.cc r;
    public int r0;
    public final FrameLayout s;
    public boolean s0;
    public cr0 t0;
    public float u0;
    public final org.telegram.ui.ActionBar.b6 v;
    public float v0;
    public final FrameLayout w;
    public float w0;
    public final FrameLayout x;
    public ValueAnimator x0;
    public final LinearLayout y;
    public final rl0 y0;
    public final m20 z0;

    public nr0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, u6Var);
    }

    public static int C0(nr0 nr0Var) {
        oq0 oq0Var = nr0Var.G;
        if (oq0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = oq0Var.getChildAt(0);
        wl0 wl0Var = (wl0) oq0Var.G(childAt);
        if (wl0Var == null) {
            return -1000;
        }
        int paddingTop = oq0Var.getPaddingTop();
        if (wl0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static nr0 P0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new nr0(context, messageObject != null ? org.telegram.messenger.t.l(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static void Y0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i11 = 0;
        while (i11 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
            int i12 = 6;
            int i13 = i11 == 0 ? 6 : 0;
            if (i11 != itemsCount - 1) {
                i12 = 0;
            }
            org.telegram.ui.ActionBar.f7.R(childAt, org.telegram.ui.ActionBar.y6.Z(w02, i13, i12), null, org.telegram.ui.ActionBar.f7.N(i10), u6Var);
            i11++;
        }
    }

    public static void m(nr0 nr0Var, int i10) {
        ch.f fVar = nr0Var.P0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (a8.pf.a(i10, 4)) {
            fVar.h(nr0Var.glassEngine.e());
        }
        fVar.e(nr0Var.U0, nr0Var.containerView.getWidth(), nr0Var.containerView.getHeight());
    }

    public static /* synthetic */ void n(nr0 nr0Var, Canvas canvas, RectF rectF) {
        oq0 oq0Var = nr0Var.G;
        ih.d.a(oq0Var, canvas, rectF, oq0Var, nr0Var.containerView);
    }

    public static void o(nr0 nr0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        boolean z11;
        char c10;
        MessageObject messageObject;
        long j10;
        int i12;
        long j11;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        rq0 rq0Var;
        long j12;
        long j13;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = nr0Var.P;
        sq0 sq0Var = nr0Var.d;
        rq0 rq0Var2 = nr0Var.c;
        HashMap hashMap2 = nr0Var.W;
        Long l10 = 0L;
        a0.h hVar = nr0Var.V;
        ArrayList arrayList3 = nr0Var.O;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i13 = 0;
            boolean z12 = false;
            while (true) {
                if (i13 >= hVar.m()) {
                    arrayList2 = arrayList3;
                    tL_forumTopic = null;
                    break;
                }
                long j14 = hVar.j(i13);
                boolean isMonoForum = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j14);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j14));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j14));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    rq0Var = rq0Var2;
                    j12 = j14;
                    j13 = 0;
                } else {
                    rq0Var = rq0Var2;
                    j12 = j14;
                    j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(nr0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (rq0Var.getTag() == null || sq0Var.a.length() <= 0) {
                    messageObject4 = messageObject3;
                    arrayList2 = arrayList3;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    MessageObject messageObject5 = messageObject3;
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), j12, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    messageObject4 = messageObject5;
                    if (l11 == null) {
                        arrayList2 = arrayList3;
                        longValue = 0;
                    } else {
                        arrayList2 = arrayList3;
                        longValue = l11.longValue();
                    }
                    of3.payStars = longValue;
                    of3.monoForumPeer = j13;
                    SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of3);
                }
                long j15 = j12;
                int sendMessage = SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(nr0Var.O, j15, !nr0Var.J0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j13, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j15));
                }
                if (hVar.m() == 1) {
                    tL_forumTopic = null;
                    g5.s0(sendMessage, nr0Var.g0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                rq0Var2 = rq0Var;
                l10 = l4;
            }
            int size = arrayList4.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList4.get(i14);
                i14++;
                long longValue2 = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(longValue2);
                hVar.l(longValue2);
                if (dialog != null) {
                    hashMap2.remove(dialog);
                }
            }
            if (!hVar.i()) {
                nr0Var.T0(hVar, arrayList2.size(), hVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            zq0 zq0Var = nr0Var.X;
            int i15 = zq0Var != null ? zq0Var.e : 0;
            if (nr0Var.G0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < hVar.m()) {
                    long j16 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j16);
                    Long l12 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j16));
                    if (l12 != null && l12.longValue() > 0) {
                        z13 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j16));
                    if (tL_forumTopic3 == null || !isMonoForum2) {
                        i12 = i15;
                        j11 = 0;
                    } else {
                        i12 = i15;
                        j11 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    }
                    if (tL_forumTopic3 == null || isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = null;
                    } else {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(nr0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (nr0Var.G0 != null) {
                        if (rq0Var2.getTag() != null && sq0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = nr0Var.G0;
                    } else if (rq0Var2.getTag() == null || sq0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j16, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i15 = i12;
                    strArr2 = strArr;
                }
                z11 = z13;
            } else {
                int i17 = i15;
                if (strArr2[i17] != null) {
                    boolean z14 = false;
                    for (int i18 = 0; i18 < hVar.m(); i18++) {
                        long j17 = hVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j17);
                        Long l13 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j17));
                        if (l13 != null && l13.longValue() > 0) {
                            z14 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j17));
                        long peerDialogId = (tL_forumTopic4 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || isMonoForum3) {
                            c10 = 0;
                            messageObject = null;
                        } else {
                            c10 = 0;
                            messageObject = new MessageObject(nr0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (rq0Var2.getTag() == null || sq0Var.a.length() <= 0) {
                            j10 = j17;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j17, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j10 = j17;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(nr0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    nr0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            nr0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
        }
        cr0 cr0Var = nr0Var.t0;
        if (cr0Var != null) {
            cr0Var.R();
        }
        nr0Var.dismiss();
    }

    public static void p(nr0 nr0Var, int i10) {
        TLRPC.Dialog dialog;
        m20 m20Var = nr0Var.z0;
        HashMap hashMap = nr0Var.W;
        a0.h hVar = nr0Var.V;
        fr0 fr0Var = nr0Var.L;
        kr0 kr0Var = nr0Var.M;
        if (kr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = nr0Var.D0;
            if (dialog2 == null) {
                return;
            }
            hVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            nr0Var.d1(2);
            if (nr0Var.M0 || nr0Var.N0) {
                if (((TLRPC.Dialog) fr0Var.e.f(dialog2.id)) == null) {
                    fr0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = fr0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                fr0Var.l();
                nr0Var.B0 = false;
                m20Var.r.setText("");
                nr0Var.M0(false);
            }
            for (int i11 = 0; i11 < nr0Var.R0().getChildCount(); i11++) {
                View childAt = nr0Var.R0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getCurrentDialog() == nr0Var.D0.id) {
                        k7Var.d(null, false, true);
                        k7Var.b(true, true);
                    }
                }
            }
            nr0Var.N0();
            return;
        }
        TLRPC.TL_forumTopic E = kr0Var.E(i10);
        if (E == null || (dialog = nr0Var.D0) == null) {
            return;
        }
        long j10 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(nr0Var.currentAccount).isMonoForum(j10);
        TLRPC.Dialog dialog3 = nr0Var.D0;
        hVar.k(dialog3, j10);
        hashMap.put(dialog3, E);
        nr0Var.d1(2);
        if (nr0Var.M0 || nr0Var.N0) {
            if (((TLRPC.Dialog) fr0Var.e.f(dialog3.id)) == null) {
                fr0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = fr0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            fr0Var.l();
            nr0Var.B0 = false;
            m20Var.r.setText("");
            nr0Var.M0(false);
        }
        for (int i12 = 0; i12 < nr0Var.R0().getChildCount(); i12++) {
            View childAt2 = nr0Var.R0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) childAt2;
                if (k7Var2.getCurrentDialog() == nr0Var.D0.id) {
                    k7Var2.d(E, isMonoForum, true);
                    k7Var2.b(true, true);
                }
            }
        }
        nr0Var.N0();
    }

    public static boolean q(final nr0 nr0Var) {
        org.telegram.ui.wn wnVar;
        li.w1 w1Var = nr0Var.e;
        boolean z10 = nr0Var.i0;
        Activity activity = nr0Var.h0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(nr0Var.getContext());
        linearLayout.setOrientation(1);
        if (nr0Var.O != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, nr0Var.resourcesProvider);
            if (z10) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout, nr0Var.resourcesProvider);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new vq0(nr0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new iq0(nr0Var, 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, nr0Var.getContext(), nr0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, kb1.r(-1, 48));
            g1Var.j(LocaleController.getString(R.string.ShowSendersName), 0, null);
            nr0Var.J0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, nr0Var.getContext(), nr0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, kb1.r(-1, 48));
            g1Var2.j(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!nr0Var.J0);
            final int i10 = 0;
            g1Var.setOnClickListener(new View.OnClickListener(nr0Var) { // from class: org.telegram.ui.Components.lq0
                public final /* synthetic */ nr0 b;

                {
                    this.b = nr0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.J0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.J0);
                            break;
                        default:
                            this.b.J0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.J0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(nr0Var) { // from class: org.telegram.ui.Components.lq0
                public final /* synthetic */ nr0 b;

                {
                    this.b = nr0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.J0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.J0);
                            break;
                        default:
                            this.b.J0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.J0);
                            break;
                    }
                }
            });
            Y0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.y6.I5, nr0Var.resourcesProvider);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, kb1.o(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, nr0Var.resourcesProvider);
        if (z10) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new vq0(nr0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new iq0(nr0Var, 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, nr0Var.getContext(), nr0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.ng));
            g1Var3.setIconColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.H6));
        }
        g1Var3.j(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, kb1.r(-1, 48));
        g1Var3.setOnClickListener(new hq0(nr0Var, 2));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, nr0Var.getContext(), nr0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.ng));
            g1Var4.setIconColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.H6));
        }
        g1Var4.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, kb1.r(-1, 48));
        g1Var4.setOnClickListener(new hq0(nr0Var, 3));
        Y0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.y6.I5, nr0Var.resourcesProvider);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, kb1.r(-1, -2));
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        nr0Var.K0 = o1Var;
        o1Var.b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        nr0Var.K0.setOutsideTouchable(true);
        nr0Var.K0.setClippingEnabled(true);
        nr0Var.K0.setInputMethodMode(2);
        nr0Var.K0.setSoftInputMode(0);
        nr0Var.K0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        nr0Var.K0.setFocusable(true);
        int[] iArr = new int[2];
        w1Var.getLocationInWindow(iArr);
        nr0Var.K0.showAtLocation(w1Var, 51, AndroidUtilities.dp(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!nr0Var.keyboardVisible || (wnVar = nr0Var.g0) == null || wnVar.j1.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : w1Var.getMeasuredHeight() + iArr[1]);
        nr0Var.K0.b();
        try {
            w1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void r(nr0 nr0Var, AtomicReference atomicReference, uq0 uq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        uq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, nr0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static void r0(nr0 nr0Var) {
        oq0 oq0Var = nr0Var.G;
        oq0 oq0Var2 = nr0Var.H;
        nm0 nm0Var = nr0Var.F;
        if (nr0Var.s0) {
            return;
        }
        oq0 oq0Var3 = nr0Var.M0 ? oq0Var2 : oq0Var;
        if (oq0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = oq0Var3.getChildAt(0);
        for (int i10 = 0; i10 < oq0Var3.getChildCount(); i10++) {
            if (oq0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = oq0Var3.getChildAt(i10);
            }
        }
        wl0 wl0Var = (wl0) oq0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || wl0Var == null || wl0Var.b() != 0) ? 0 : top;
        if (top < 0 || wl0Var == null || wl0Var.b() != 0) {
            nr0Var.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            nr0Var.V0(true);
            top = i11;
        } else {
            nr0Var.L0 = childAt.getTop();
            nr0Var.V0(false);
        }
        if (nm0Var.getVisibility() == 0) {
            if (nm0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = nm0Var.getChildAt(0);
            for (int i12 = 0; i12 < nm0Var.getChildCount(); i12++) {
                if (nm0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = nm0Var.getChildAt(i12);
                }
            }
            wl0 wl0Var2 = (wl0) nm0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || wl0Var2 == null || wl0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || wl0Var2 == null || wl0Var2.b() != 0) {
                nr0Var.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                nr0Var.V0(true);
                top2 = i13;
            } else {
                nr0Var.L0 = childAt2.getTop();
                nr0Var.V0(false);
            }
            top = AndroidUtilities.lerp(top, top2, nm0Var.getAlpha());
        }
        int i14 = nr0Var.q0;
        if (i14 != top) {
            nr0Var.r0 = i14;
            float f7 = top;
            int i15 = (int) (nr0Var.u0 + f7);
            nr0Var.q0 = i15;
            oq0Var.setTopGlowOffset(i15);
            int i16 = (int) (nr0Var.u0 + f7);
            nr0Var.q0 = i16;
            oq0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + nr0Var.u0);
            nr0Var.q0 = i17;
            nm0Var.setTopGlowOffset(i17);
            nr0Var.b.setTranslationY(nr0Var.q0 + nr0Var.u0);
            nr0Var.R.setTranslationY(nr0Var.q0 + nr0Var.u0);
            nr0Var.containerView.invalidate();
        }
    }

    public final void M0(boolean z10) {
        m20 m20Var = this.z0;
        fi.c2 c2Var = m20Var.r;
        fi.c2 c2Var2 = m20Var.r;
        boolean isEmpty = TextUtils.isEmpty(c2Var.getText());
        oq0 oq0Var = this.G;
        oq0 oq0Var2 = this.H;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && c2Var2.hasFocus()) || this.N0)) {
            this.B0 = true;
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var2, true);
            }
        } else {
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var2, false);
            }
            z11 = false;
        }
        if (this.M0 != z11 || z10) {
            this.M0 = z11;
            jr0 jr0Var = this.N;
            jr0Var.l();
            this.L.l();
            if (this.M0) {
                if (this.L0 == Integer.MAX_VALUE) {
                    ((s4.c0) oq0Var2.getLayoutManager()).h1(0, -oq0Var2.getPaddingTop());
                } else {
                    ((s4.c0) oq0Var2.getLayoutManager()).h1(0, this.L0 - oq0Var2.getPaddingTop());
                }
                jr0Var.E(c2Var2.getText().toString());
                return;
            }
            int i10 = this.L0;
            s4.t tVar = this.I;
            if (i10 == Integer.MAX_VALUE) {
                tVar.h1(0, 0);
            } else {
                tVar.h1(0, 0);
            }
        }
    }

    public final void N0() {
        TLRPC.Dialog dialog = this.D0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.D0 = null;
        for (int i10 = 0; i10 < R0().getChildCount(); i10++) {
            View childAt = R0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.k7) && ((org.telegram.ui.Cells.k7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.j jVar = this.C0;
        if (jVar != null) {
            jVar.c();
        }
        R0().setVisibility(0);
        m20 m20Var = this.z0;
        m20Var.setVisibility(0);
        fi.c2 c2Var = m20Var.r;
        if (this.M0 || this.N0) {
            this.E0.H.v = true;
            c2Var.requestFocus();
            AndroidUtilities.showKeyboard(c2Var);
        }
        int[] iArr = new int[2];
        o1.j jVar2 = new o1.j(new ac.a(1000.0f));
        o1.k kVar = new o1.k(0.0f);
        org.telegram.ui.wn wnVar = this.g0;
        kVar.b((wnVar == null || !wnVar.b) ? 800.0f : 10.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.C0 = jVar2;
        jVar2.b(new gq0(this, (org.telegram.ui.Cells.k7) view, iArr, 0));
        this.C0.a(new hb(this, 5));
        this.C0.h();
    }

    public final void O0() {
        boolean z10 = false;
        if (this.l0 == null && this.p0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", Q0()));
            cr0 cr0Var = this.t0;
            if (cr0Var != null) {
                cr0Var.v0();
                return;
            }
            if (this.h0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.l0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.h0).I0(new i2.y(5, z10));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final String Q0() {
        String str;
        String[] strArr = this.p0;
        zq0 zq0Var = this.X;
        if (zq0Var != null) {
            str = strArr[zq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.l0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        aq aqVar = this.f0;
        if (aqVar != null && aqVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.c0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str == null ? "" : str;
    }

    public final nm0 R0() {
        return (this.M0 || this.N0) ? this.H : this.G;
    }

    public final void S0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        nm0 nm0Var = this.F;
        nm0Var.setPivotX(width);
        nm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        nm0Var.setScaleX(f11);
        nm0Var.setScaleY(f11);
        nm0Var.setAlpha(f7);
        nm0 R0 = R0();
        R0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        R0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        R0.setScaleX(f12);
        R0.setScaleY(f12);
        float f13 = 1.0f - f7;
        R0.setAlpha(f13);
        m20 m20Var = this.z0;
        m20Var.setPivotX(m20Var.getWidth() / 2.0f);
        m20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        m20Var.setScaleX(f14);
        m20Var.setScaleY(f14);
        m20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.A0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        nm0Var.getLocationInWindow(iArr);
        float interpolation = ds.g.getInterpolation(f7);
        for (int i10 = 0; i10 < R0.getChildCount(); i10++) {
            View childAt = R0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
            View childAt2 = nm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.l7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((nm0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        R0.invalidate();
    }

    public final void V0(boolean z10) {
        View[] viewArr = this.T;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.U;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new wq0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void W0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        nr0 nr0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        ir0 ir0Var;
        if (dialog instanceof er0) {
            U0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.k7) && ((org.telegram.ui.Cells.k7) view).F) || ((view instanceof org.telegram.ui.Cells.m6) && ((org.telegram.ui.Cells.m6) view).n0)) {
            a1(dialog.id, view);
            return;
        }
        nm0 nm0Var = this.F;
        if (nm0Var.getVisibility() != 8 || (activity = this.h0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.Q;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    e2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.o0) {
                    e2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    e2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                ic.a.r(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
            e2Var2.R = string2;
            if (i10 == 3) {
                e2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                e2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                e2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            ic.a.r(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.V;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.W.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.m6) {
                ((org.telegram.ui.Cells.m6) view).r(false, true);
            } else if (view instanceof org.telegram.ui.Cells.k7) {
                ((org.telegram.ui.Cells.k7) view).b(false, true);
            }
            d1(1);
            nr0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.D0 = dialog;
                this.J.h1(0, this.q0 - nm0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                uq0 uq0Var = new uq0(this, dialog, atomicReference, view);
                atomicReference.set(new e10(this, atomicReference, uq0Var, dialog, 8));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(uq0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    uq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            nr0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.m6) {
                ((org.telegram.ui.Cells.m6) view).r(true, true);
            } else if (view instanceof org.telegram.ui.Cells.k7) {
                ((org.telegram.ui.Cells.k7) view).b(true, true);
            }
            d1(2);
            long j11 = UserConfig.getInstance(nr0Var.currentAccount).clientUserId;
            if (nr0Var.M0) {
                fr0 fr0Var = nr0Var.L;
                a0.h hVar2 = fr0Var.e;
                ArrayList arrayList = fr0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    fr0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                fr0Var.l();
                nr0Var.B0 = false;
                m20 m20Var = nr0Var.z0;
                m20Var.r.setText("");
                M0(false);
                AndroidUtilities.hideKeyboard(m20Var.r);
            }
        }
        jr0 jr0Var = nr0Var.N;
        if (jr0Var == null || (ir0Var = jr0Var.H) == null) {
            return;
        }
        ir0Var.q(0, ir0Var.h());
    }

    public final void X0(final boolean z10) {
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            a0.h hVar = this.V;
            int m10 = hVar.m();
            rq0 rq0Var = this.c;
            sq0 sq0Var = this.d;
            if (i12 >= m10) {
                Editable text = sq0Var.getText();
                mu muVar = sq0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                aq aqVar = this.f0;
                int i13 = (aqVar == null || !aqVar.a.q) ? -1 : this.c0;
                ArrayList arrayList = new ArrayList();
                if (this.O != null) {
                    i10 = 0;
                    while (i11 < hVar.m()) {
                        long j10 = hVar.j(i11);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (rq0Var.getTag() != null && muVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        i11++;
                    }
                } else {
                    zq0 zq0Var = this.X;
                    int i14 = zq0Var != null ? zq0Var.e : 0;
                    if (this.G0 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j11 = hVar.j(i15);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            int i17 = i11;
                            if (this.G0 != null && rq0Var.getTag() != null && muVar.length() > 0 && charSequenceArr[i17] != null && sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            if (sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                            i15++;
                            i11 = i17;
                        }
                        i10 = i16;
                    } else {
                        int i18 = 0;
                        if (this.P[i14] != null) {
                            for (int i19 = 0; i19 < hVar.m(); i19++) {
                                long j12 = hVar.j(i19);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (rq0Var.getTag() != null && muVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i18++;
                                }
                                if (sendPaidMessagesStars3 > 0) {
                                    i18++;
                                }
                                if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                        }
                        i10 = i18;
                    }
                }
                final int i20 = i13;
                g5.b0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.mq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        nr0.o(nr0.this, charSequenceArr, entities, z10, i20, (HashMap) obj);
                    }
                });
                return;
            }
            if (g5.h(getContext(), this.currentAccount, hVar.j(i12), rq0Var.getTag() != null && sq0Var.a.length() > 0)) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void Z0(boolean z10) {
        rq0 rq0Var = this.c;
        if (z10 == (rq0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        rq0Var.setTag(z10 ? 1 : null);
        sq0 sq0Var = this.d;
        if (sq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(sq0Var.getEditText());
        }
        sq0Var.k(true);
        FrameLayout frameLayout = this.d0;
        rq0 rq0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            rq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            rq0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            int i11 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.E = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f7 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(rq0Var, (Property<rq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(rq0Var2, (Property<rq0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(rq0Var2, (Property<rq0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(rq0Var2, (Property<rq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.T[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.s;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.i0 && z10) {
                f7 = AndroidUtilities.dp(this.e0 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f7));
        }
        this.E.playTogether(arrayList);
        this.E.setInterpolator(new DecelerateInterpolator());
        this.E.setDuration(180L);
        this.E.addListener(new wq0(this, z10, 1));
        this.E.start();
    }

    public final void a1(long j10, View view) {
        int i10 = -this.I0;
        this.I0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.w;
        (premiumFeaturesBlocked ? new wc(frameLayout, this.resourcesProvider).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new wc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new jq0(this, i11))).j();
    }

    public final void b1() {
        org.telegram.ui.ActionBar.q1 q1Var;
        rq0 rq0Var = this.c;
        if (rq0Var == null) {
            return;
        }
        sq0 sq0Var = this.d;
        if (sq0Var == null || !sq0Var.m()) {
            yq0 yq0Var = this.E0;
            if (yq0Var != null && (q1Var = yq0Var.H) != null && !q1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            sq0Var.getEmojiPaddingShown();
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.d0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        rq0Var.setTranslationY(f10);
        this.f.setTranslationY(f10);
    }

    public final void c1() {
        org.telegram.ui.ActionBar.b6 b6Var = this.v;
        if (b6Var != null) {
            String Q0 = Q0();
            if (Q0.startsWith("https://")) {
                Q0 = Q0.substring(8);
            } else if (Q0.startsWith("http://")) {
                Q0 = Q0.substring(7);
            }
            b6Var.l(Q0, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void d1(int i10) {
        a0.h hVar = this.V;
        if (hVar.m() == 0) {
            Z0(false);
            return;
        }
        ArrayList arrayList = this.O;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        sq0 sq0Var = this.d;
        if (tag != null && sq0Var.a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
            }
            j10 += sendPaidMessagesStars;
        }
        int max = Math.max(1, hVar.m());
        boolean z10 = i10 != 0;
        li.w1 w1Var = this.e;
        w1Var.g(max, z10);
        w1Var.i(size, j10, i10 != 0);
        Z0(true);
        sq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), w1Var.l()), 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            fr0 fr0Var = this.L;
            if (fr0Var != null) {
                fr0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        sq0 sq0Var = this.d;
        if (sq0Var != null) {
            AndroidUtilities.hideKeyboard(sq0Var.getEditText());
        }
        this.Z = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public void dismissInternal() {
        super.dismissInternal();
        sq0 sq0Var = this.d;
        if (sq0Var != null) {
            sq0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.Y;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        if (this.D0 != null) {
            N0();
            return;
        }
        sq0 sq0Var = this.d;
        if (sq0Var == null || !sq0Var.e) {
            super.onBackPressed();
        } else {
            sq0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            hh.c cVar = this.Q0;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            }
            if (this.container != null) {
                boolean z10 = AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.721f;
                if (z10 != this.Y0) {
                    this.Y0 = z10;
                    AndroidUtilities.setLightNavigationBar(this.container, z10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public nr0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nr0(Context context, org.telegram.ui.wn wnVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, true);
        int i10;
        float f7;
        oq0 oq0Var;
        float f10;
        int i11;
        LinearLayout linearLayout;
        int i12 = 1;
        final int i13 = 2;
        String[] strArr = new String[2];
        this.P = strArr;
        this.T = new View[2];
        this.U = new AnimatorSet[2];
        this.V = new a0.h();
        this.W = new HashMap();
        this.Y = -1;
        final int i14 = 0;
        this.Z = false;
        new RectF();
        new Paint(1);
        this.k0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.p0 = strArr2;
        this.F0 = new ArrayList();
        int i15 = 4;
        int i16 = 4;
        while (true) {
            if (i16 >= 32) {
                i10 = 80;
                break;
            }
            i10 = (1 << i16) - 12;
            if (80 <= i10) {
                break;
            } else {
                i16++;
            }
        }
        int i17 = i10 / 8;
        long[] jArr = new long[i17];
        Object[] objArr = new Object[i17];
        this.H0 = i0.b.e;
        this.I0 = 4;
        this.J0 = true;
        this.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        hh.c d = this.glassEngine.d(new iq0(this, i15));
        this.Q0 = d;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ch.f fVar = new ch.f();
            this.P0 = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(d);
            dVar.f = d;
            dVar.d = fVar;
            dVar.e = -2;
            hh.d dVar2 = new hh.d(d);
            dVar2.f = d;
            dVar2.d = fVar;
            dVar2.e = -3;
            ch.b bVar = new ch.b(dVar);
            this.R0 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            bVar.b = dp;
            bVar.c = dp;
            bVar.h = this.glassEngine;
            ch.b bVar2 = new ch.b(dVar2);
            this.S0 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            bVar2.b = dp2;
            bVar2.c = dp2;
            oi.q qVar = this.glassEngine;
            bVar2.h = qVar;
            ch.b bVar3 = new ch.b(d);
            this.T0 = bVar3;
            bVar3.h = qVar;
        } else {
            this.P0 = null;
            ch.b bVar4 = new ch.b(d);
            bVar4.h = this.glassEngine;
            this.S0 = bVar4;
            this.R0 = bVar4;
            this.T0 = bVar4;
        }
        this.resourcesProvider = u6Var;
        this.a0 = z13;
        this.h0 = AndroidUtilities.findActivity(context);
        this.i0 = z12;
        if (z12) {
            this.resourcesProvider = new di.k0(i12);
        }
        d.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        this.g0 = wnVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.S = mutate;
        int i18 = org.telegram.ui.ActionBar.y6.h5;
        this.behindKeyboardColorKey = i18;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z11;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                c3.h0.r(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a1.g.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.O = arrayList;
        this.N = new jr0(this, context);
        this.o0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.h0(this, i12));
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                MessageObject messageObject2 = (MessageObject) this.O.get(i19);
                if (messageObject2.isTodo()) {
                    this.Q = 3;
                } else if (messageObject2.isPoll()) {
                    int i20 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.Q = i20;
                    if (i20 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        int i21 = 21;
        if (z10) {
            this.m0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.z7(i21, this, context));
        }
        yq0 yq0Var = new yq0(this, context);
        this.E0 = yq0Var;
        this.containerView = yq0Var;
        yq0Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i22 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i22, 0, i22, this.H0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.Cells.l0(this));
        if (this.i0 && this.p0[1] != null) {
            zq0 zq0Var = new zq0(this, context);
            this.X = zq0Var;
            frameLayout.addView(zq0Var, kb1.h(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        m20 m20Var = new m20(context, this.resourcesProvider);
        this.z0 = m20Var;
        ar0 ar0Var = new ar0(this);
        fi.c2 c2Var = m20Var.r;
        c2Var.addTextChangedListener(ar0Var);
        c2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        c2Var.setOnEditorActionListener(new d1(this, 7));
        m20Var.setCloseButtonOnClickListener(new jq0(this, i14));
        frameLayout.addView(m20Var, kb1.h(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.A0 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i23 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.m(kVar, 5, i23, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.m(kVar, 6, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.m(kVar, 1, org.telegram.ui.ActionBar.y6.z6, null);
        org.telegram.ui.ActionBar.f7.m(kVar, 3, org.telegram.ui.ActionBar.y6.u8, null);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 16));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, kb1.i(-1, 58, 83));
        nm0 nm0Var = new nm0(context, this.resourcesProvider);
        this.F = nm0Var;
        s4.t tVar = new s4.t(4);
        this.J = tVar;
        nm0Var.setLayoutManager(tVar);
        tVar.O = new pq0(this, i13);
        nm0Var.setOnScrollListener(new qq0(this, i13));
        kr0 kr0Var = new kr0(this, context);
        this.M = kr0Var;
        nm0Var.setAdapter(kr0Var);
        int i24 = org.telegram.ui.ActionBar.y6.A5;
        org.telegram.ui.ActionBar.f7.m(nm0Var, 21, i24, this.resourcesProvider);
        nm0Var.setVerticalScrollBarEnabled(false);
        nm0Var.setHorizontalScrollBarEnabled(false);
        nm0Var.setOverScrollMode(2);
        nm0Var.setSelectorDrawableColor(0);
        int i25 = 18;
        nm0Var.setItemSelectorColorProvider(new rd0(i25));
        nm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        nm0Var.setClipToPadding(false);
        nm0Var.i(new di.l(5));
        nm0Var.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.kq0
            public final /* synthetic */ nr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i14) {
                    case 0:
                        nr0.p(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            nr0 nr0Var = this.b;
                            ArrayList arrayList2 = nr0Var.L.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList2.size()) ? null : (TLRPC.Dialog) arrayList2.get(i27);
                            if (dialog != null) {
                                nr0Var.W0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            nr0 nr0Var2 = this.b;
                            jr0 jr0Var = nr0Var2.N;
                            nr0 nr0Var3 = jr0Var.K;
                            int i28 = jr0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < jr0Var.d.size()) {
                                        tL_dialog2 = ((br0) jr0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - jr0Var.d.size();
                                        ArrayList arrayList3 = jr0Var.e.d;
                                        if (size2 < arrayList3.size()) {
                                            TLObject tLObject = (TLObject) arrayList3.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            tL_dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (tL_dialog2 == null) {
                                    nr0Var2.W0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < nr0Var3.F0.size()) {
                                    TLObject tLObject2 = ((ig.h0) nr0Var3.F0.get(i30)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    tL_dialog2 = tL_dialog;
                                }
                                if (tL_dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        nm0Var.setVisibility(8);
        this.containerView.addView(nm0Var, kb1.i(-1, -1, 51));
        oq0 oq0Var2 = new oq0(this, context, this.resourcesProvider, i14);
        this.G = oq0Var2;
        oq0Var2.setSelectorDrawableColor(0);
        oq0Var2.setItemSelectorColorProvider(new rd0(i25));
        oq0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        oq0Var2.setClipToPadding(false);
        getContext();
        s4.t tVar2 = new s4.t(4);
        this.I = tVar2;
        oq0Var2.setLayoutManager(tVar2);
        this.U0 = new kh(this, i13);
        tVar2.O = new pq0(this, i14);
        oq0Var2.setHorizontalScrollBarEnabled(false);
        oq0Var2.setVerticalScrollBarEnabled(false);
        oq0Var2.setOverScrollMode(2);
        oq0Var2.i(new di.l(6));
        this.containerView.addView(oq0Var2, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        fr0 fr0Var = new fr0(this, context);
        this.L = fr0Var;
        oq0Var2.setAdapter(fr0Var);
        org.telegram.ui.ActionBar.f7.m(oq0Var2, 21, i24, this.resourcesProvider);
        final int i26 = 1;
        oq0Var2.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.kq0
            public final /* synthetic */ nr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i262, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i26) {
                    case 0:
                        nr0.p(this.b, i262);
                        break;
                    case 1:
                        if (i262 >= 0) {
                            nr0 nr0Var = this.b;
                            ArrayList arrayList2 = nr0Var.L.d;
                            int i27 = i262 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList2.size()) ? null : (TLRPC.Dialog) arrayList2.get(i27);
                            if (dialog != null) {
                                nr0Var.W0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i262 >= 0) {
                            nr0 nr0Var2 = this.b;
                            jr0 jr0Var = nr0Var2.N;
                            nr0 nr0Var3 = jr0Var.K;
                            int i28 = jr0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i262 < i28 || i28 < 0) {
                                int i29 = i262 - 1;
                                if (i29 >= 0) {
                                    if (i29 < jr0Var.d.size()) {
                                        tL_dialog2 = ((br0) jr0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - jr0Var.d.size();
                                        ArrayList arrayList3 = jr0Var.e.d;
                                        if (size2 < arrayList3.size()) {
                                            TLObject tLObject = (TLObject) arrayList3.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            tL_dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (tL_dialog2 == null) {
                                    nr0Var2.W0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i262 - i28;
                                if (i30 >= 0 && i30 < nr0Var3.F0.size()) {
                                    TLObject tLObject2 = ((ig.h0) nr0Var3.F0.get(i30)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    tL_dialog2 = tL_dialog;
                                }
                                if (tL_dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        oq0Var2.setOnScrollListener(new qq0(this, i14));
        this.glassEngine.b(oq0Var2);
        oq0 oq0Var3 = new oq0(this, context, this.resourcesProvider, i26);
        this.H = oq0Var3;
        oq0Var3.setItemSelectorColorProvider(new rd0(i25));
        oq0Var3.setSelectorDrawableColor(0);
        oq0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        oq0Var3.setClipToPadding(false);
        getContext();
        xz xzVar = new xz(4, 0, oq0Var3);
        this.K = xzVar;
        oq0Var3.setLayoutManager(xzVar);
        int i27 = 1;
        xzVar.O = new pq0(this, i27);
        oq0Var3.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.kq0
            public final /* synthetic */ nr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i262, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        nr0.p(this.b, i262);
                        break;
                    case 1:
                        if (i262 >= 0) {
                            nr0 nr0Var = this.b;
                            ArrayList arrayList2 = nr0Var.L.d;
                            int i272 = i262 - 1;
                            TLRPC.Dialog dialog = (i272 < 0 || i272 >= arrayList2.size()) ? null : (TLRPC.Dialog) arrayList2.get(i272);
                            if (dialog != null) {
                                nr0Var.W0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i262 >= 0) {
                            nr0 nr0Var2 = this.b;
                            jr0 jr0Var = nr0Var2.N;
                            nr0 nr0Var3 = jr0Var.K;
                            int i28 = jr0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i262 < i28 || i28 < 0) {
                                int i29 = i262 - 1;
                                if (i29 >= 0) {
                                    if (i29 < jr0Var.d.size()) {
                                        tL_dialog2 = ((br0) jr0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - jr0Var.d.size();
                                        ArrayList arrayList3 = jr0Var.e.d;
                                        if (size2 < arrayList3.size()) {
                                            TLObject tLObject = (TLObject) arrayList3.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            tL_dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (tL_dialog2 == null) {
                                    nr0Var2.W0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i262 - i28;
                                if (i30 >= 0 && i30 < nr0Var3.F0.size()) {
                                    TLObject tLObject2 = ((ig.h0) nr0Var3.F0.get(i30)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    tL_dialog2 = tL_dialog;
                                }
                                if (tL_dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        oq0Var3.setHasFixedSize(true);
        oq0Var3.setItemAnimator(null);
        oq0Var3.setHorizontalScrollBarEnabled(false);
        oq0Var3.setVerticalScrollBarEnabled(false);
        oq0Var3.setOnScrollListener(new qq0(this, i27));
        oq0Var3.i(new di.l(7));
        oq0Var3.setAdapter(this.N);
        org.telegram.ui.ActionBar.f7.m(oq0Var3, 21, i24, this.resourcesProvider);
        this.y0 = new rl0(oq0Var3, true);
        c10 c10Var = new c10(context, this.resourcesProvider);
        c10Var.setViewType(12);
        fy0 fy0Var = new fy0(context, c10Var, 1, this.resourcesProvider);
        this.R = fy0Var;
        fy0Var.addView(c10Var, 0);
        fy0Var.setAnimateLayoutChange(true);
        fy0Var.e(false, false);
        boolean z14 = this.i0;
        xh.n nVar = fy0Var.d;
        if (z14) {
            org.telegram.ui.ActionBar.f7.V(nVar, org.telegram.ui.ActionBar.y6.ng, this.resourcesProvider);
        }
        nVar.setText(LocaleController.getString(R.string.NoResult));
        oq0Var3.setEmptyView(fy0Var);
        oq0Var3.setHideIfEmpty(false);
        oq0Var3.W1 = true;
        oq0Var3.X1 = 0;
        this.containerView.addView(fy0Var, kb1.h(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(oq0Var3, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.cc ccVar = new bi.cc(this, context, i21);
        this.r = ccVar;
        this.containerView.addView(ccVar, kb1.i(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.i0 || this.p0[1] == null) ? 58.0f : 111.0f);
        this.T[0] = new View(context);
        View view = this.T[0];
        int i28 = org.telegram.ui.ActionBar.y6.V5;
        org.telegram.ui.ActionBar.f7.i(i28, view, this.resourcesProvider);
        this.T[0].setAlpha(0.0f);
        this.T[0].setTag(1);
        this.containerView.addView(this.T[0], layoutParams);
        this.containerView.addView(frameLayout, kb1.i(-1, (!this.i0 || this.p0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.T[1] = new View(context);
        org.telegram.ui.ActionBar.f7.i(i28, this.T[1], this.resourcesProvider);
        this.T[1].setLayoutParams(layoutParams2);
        if (!this.o0 && this.p0[0] == null) {
            this.T[1].setAlpha(0.0f);
            oq0Var = oq0Var3;
            f7 = 4.0f;
            f10 = 9.0f;
        } else {
            f7 = 4.0f;
            if (this.i0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                f10 = 9.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.s = frameLayout3;
                frameLayout2.addView(frameLayout3, kb1.h(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, kb1.i(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                kb1.c(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new hq0(this, 4));
                org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
                this.v = b6Var;
                b6Var.setTextSize(15);
                org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.Tk, this.resourcesProvider);
                b6Var.setEllipsizeByGradient(true);
                c1();
                linearLayout3.addView(b6Var, kb1.t(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, this.resourcesProvider);
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i29 = org.telegram.ui.ActionBar.y6.i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i29), 4, 4);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i29);
                org.telegram.ui.ActionBar.u6 u6Var2 = this.resourcesProvider;
                textView.setBackground(Z);
                oq0Var = oq0Var3;
                org.telegram.ui.ActionBar.f7.k(textView, Z, null, N, u6Var2);
                linearLayout3.addView(textView, kb1.t(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new hq0(this, 5));
                kb1.b(textView);
                this.containerView.addView(frameLayout2, kb1.i(-1, 58, 83));
                ArrayList arrayList2 = this.O;
                if (arrayList2 != null && arrayList2.size() > 0 && ((MessageObject) this.O.get(0)).messageOwner != null && ((MessageObject) this.O.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.O.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i30 = 0;
                        linearLayout = org.telegram.messenger.wh.d(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nq0
                            public final /* synthetic */ nr0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i30) {
                                    case 0:
                                        nr0 nr0Var = this.b;
                                        org.telegram.ui.ActionBar.r2 r2Var = nr0Var.g0;
                                        if (r2Var == null) {
                                            r2Var = LaunchActivity.U();
                                        }
                                        if (r2Var != null) {
                                            nr0Var.dismiss();
                                            r2Var.presentFragment(new org.telegram.ui.xi0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        nr0 nr0Var2 = this.b;
                                        org.telegram.ui.ActionBar.r2 r2Var2 = nr0Var2.g0;
                                        if (r2Var2 == null) {
                                            r2Var2 = LaunchActivity.U();
                                        }
                                        if (r2Var2 != null) {
                                            nr0Var2.dismiss();
                                            r2Var2.presentFragment(new org.telegram.ui.xi0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i29), 6, 6);
                        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i29);
                        org.telegram.ui.ActionBar.u6 u6Var3 = this.resourcesProvider;
                        linearLayout.setBackground(Z2);
                        org.telegram.ui.ActionBar.f7.k(linearLayout, Z2, null, N2, u6Var3);
                        kb1.b(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i31 = org.telegram.ui.ActionBar.y6.Vk;
                        org.telegram.ui.ActionBar.f7.t(imageView, i31, this.resourcesProvider, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, kb1.s(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.f7.V(textView2, i31, this.resourcesProvider);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, kb1.t(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i11 = 8;
                        linearLayout2.addView(linearLayout3, kb1.t(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, kb1.t(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                i11 = 11;
                linearLayout = null;
                linearLayout2.addView(linearLayout3, kb1.t(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                if (linearLayout != null) {
                }
            } else {
                oq0Var = oq0Var3;
                f10 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.s = frameLayout5;
                frameLayout4.addView(frameLayout5, kb1.h(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i32 = org.telegram.ui.ActionBar.y6.i6;
                org.telegram.ui.Cells.y Z3 = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i32), 20, 20);
                org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i32);
                org.telegram.ui.ActionBar.u6 u6Var4 = this.resourcesProvider;
                textView3.setBackground(Z3);
                org.telegram.ui.ActionBar.f7.k(textView3, Z3, null, N3, u6Var4);
                org.telegram.ui.ActionBar.f7.V(textView3, this.i0 ? org.telegram.ui.ActionBar.y6.pg : org.telegram.ui.ActionBar.y6.n5, this.resourcesProvider);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.i0 && this.p0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new hq0(this, 6));
                frameLayout5.addView(textView3, kb1.i(-1, -1, 119));
                this.containerView.addView(frameLayout4, kb1.i(-1, 58, 87));
                ArrayList arrayList3 = this.O;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.O.get(0)).messageOwner != null && ((MessageObject) this.O.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.O.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.y = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.Cells.y Z4 = org.telegram.ui.ActionBar.y6.Z(getThemedColor(this.i0 ? org.telegram.ui.ActionBar.y6.eg : i32), 20, 20);
                        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(this.i0 ? org.telegram.ui.ActionBar.y6.eg : i32);
                        org.telegram.ui.ActionBar.u6 u6Var5 = this.resourcesProvider;
                        linearLayout4.setBackground(Z4);
                        org.telegram.ui.ActionBar.f7.k(linearLayout4, Z4, null, N4, u6Var5);
                        frameLayout5.addView(linearLayout4, kb1.i(-2, -1, 21));
                        final int i33 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nq0
                            public final /* synthetic */ nr0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i33) {
                                    case 0:
                                        nr0 nr0Var = this.b;
                                        org.telegram.ui.ActionBar.r2 r2Var = nr0Var.g0;
                                        if (r2Var == null) {
                                            r2Var = LaunchActivity.U();
                                        }
                                        if (r2Var != null) {
                                            nr0Var.dismiss();
                                            r2Var.presentFragment(new org.telegram.ui.xi0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        nr0 nr0Var2 = this.b;
                                        org.telegram.ui.ActionBar.r2 r2Var2 = nr0Var2.g0;
                                        if (r2Var2 == null) {
                                            r2Var2 = LaunchActivity.U();
                                        }
                                        if (r2Var2 != null) {
                                            nr0Var2.dismiss();
                                            r2Var2.presentFragment(new org.telegram.ui.xi0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.f7.t(imageView2, this.i0 ? org.telegram.ui.ActionBar.y6.pg : org.telegram.ui.ActionBar.y6.n5, this.resourcesProvider, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, kb1.x(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.f7.V(textView4, this.i0 ? org.telegram.ui.ActionBar.y6.pg : org.telegram.ui.ActionBar.y6.n5, this.resourcesProvider);
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, kb1.x(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.w = frameLayout6;
        this.containerView.addView(frameLayout6, kb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.s != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.x = frameLayout7;
        this.containerView.addView(frameLayout7, kb1.h(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        rq0 rq0Var = new rq0(this, context, 0);
        this.c = rq0Var;
        rq0Var.setWillNotDraw(false);
        rq0Var.setAlpha(0.0f);
        rq0Var.setVisibility(4);
        this.containerView.addView(rq0Var, kb1.h(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        rq0Var.setOnTouchListener(new ei.d(22));
        org.telegram.ui.ActionBar.h3 h3Var = this.container;
        boolean z15 = AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.721f;
        this.Y0 = z15;
        AndroidUtilities.setLightNavigationBar(h3Var, z15);
        sq0 sq0Var = new sq0(this, context, yq0Var, this.resourcesProvider);
        this.d = sq0Var;
        sq0Var.J = true;
        if (this.i0) {
            ju editText = sq0Var.getEditText();
            int i34 = org.telegram.ui.ActionBar.y6.ng;
            editText.setTextColor(getThemedColor(i34));
            sq0Var.getEditText().setCursorColor(getThemedColor(i34));
        }
        sq0Var.setHint(LocaleController.getString(R.string.ShareComment));
        sq0Var.s();
        sq0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        rq0Var.addView(sq0Var, kb1.i(-1, -2, 51));
        rq0Var.setClipChildren(false);
        rq0Var.setClipToPadding(false);
        sq0Var.setClipChildren(false);
        sq0Var.getEditText().addTextChangedListener(new bi.u(this, 13));
        rq0 rq0Var2 = new rq0(this, context, 1);
        this.f = rq0Var2;
        rq0Var2.setFocusable(true);
        rq0Var2.setFocusableInTouchMode(true);
        rq0Var2.setVisibility(4);
        rq0Var2.setScaleX(0.2f);
        rq0Var2.setScaleY(0.2f);
        rq0Var2.setAlpha(0.0f);
        this.containerView.addView(rq0Var2, kb1.i(110, 50, 85));
        li.w1 w1Var = new li.w1(this, context, R.drawable.send_plane_24, this.resourcesProvider, 2);
        this.e = w1Var;
        int dp3 = AndroidUtilities.dp(52.0f);
        int dp4 = AndroidUtilities.dp(38.0f);
        w1Var.I = dp3;
        w1Var.J = dp4;
        float dp5 = AndroidUtilities.dp(1.0f);
        float dp6 = AndroidUtilities.dp(6.0f);
        w1Var.M = dp5;
        w1Var.N = dp6;
        w1Var.h0 = true;
        rq0Var2.addView(w1Var, kb1.k());
        w1Var.setOnClickListener(new hq0(this, 0));
        w1Var.setOnLongClickListener(new w10(this, 2));
        this.k0.setTextSize(AndroidUtilities.dp(12.0f));
        this.k0.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.c0 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.d0 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.e0 = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i35 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.Cells.y Z5 = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i35), 6, 6);
            org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i35);
            org.telegram.ui.ActionBar.u6 u6Var6 = this.resourcesProvider;
            linearLayout5.setBackground(Z5);
            org.telegram.ui.ActionBar.f7.k(linearLayout5, Z5, null, N5, u6Var6);
            aq aqVar = new aq(context, 24, this.resourcesProvider);
            this.f0 = aqVar;
            aqVar.b(org.telegram.ui.ActionBar.y6.h7, org.telegram.ui.ActionBar.y6.j7, org.telegram.ui.ActionBar.y6.k7);
            aqVar.setDrawUnchecked(true);
            aqVar.a(false, false);
            aqVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(aqVar, kb1.x(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.f7.V(textView5, i23, this.resourcesProvider);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, kb1.x(-2, -2, 16, 9, 0, 0, 0));
            kb1.c(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new hq0(this, 1));
            frameLayout8.addView(linearLayout5, kb1.i(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view2, this.resourcesProvider);
                frameLayout8.addView(view2, kb1.e(-1.0f, this.i0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, kb1.i(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        ch.c cVar = new ch.c(this.T0.c(ccVar, null, false));
        this.W0 = cVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar.b(AndroidUtilities.dp(72.0f), true);
        eh.d c10 = this.S0.c(this.E0, gh.c.e(this.resourcesProvider), false);
        this.V0 = c10;
        c10.E = true;
        c10.y(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.A(AndroidUtilities.dp(32.0f));
        c10.x.g = 0.4f;
        c10.t();
        eh.d c11 = this.R0.c(rq0Var, gh.c.e(this.resourcesProvider), false);
        this.X0 = c11;
        c11.x(AndroidUtilities.dp(22.0f));
        c11.w(AndroidUtilities.dp(f10));
        rq0Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.s;
        if (frameLayout9 != null) {
            eh.d c12 = this.R0.c(frameLayout9, gh.c.e(this.resourcesProvider), false);
            c12.w(AndroidUtilities.dp(f10));
            c12.x(AndroidUtilities.dp(22.0f));
            this.s.setBackground(c12);
            this.s.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        }
        FrameLayout frameLayout10 = this.d0;
        if (frameLayout10 != null) {
            eh.d c13 = this.R0.c(frameLayout10, gh.c.e(this.resourcesProvider), false);
            c13.w(AndroidUtilities.dp(f10));
            c13.x(AndroidUtilities.dp(22.0f));
            this.d0.setBackground(c13);
            this.d0.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        }
        d1(0);
        org.telegram.ui.ey.q4(AccountInstance.getInstance(this.currentAccount));
        if (fr0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i36 = this.currentAccount;
        int i37 = 0;
        MessagesStorage.getInstance(i36).getStorageQueue().postRunnable(new i2.v(i36, i37, new tq0(this), 2));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        this.glassEngine.i(this.containerView);
        oi.q qVar2 = this.glassEngine;
        qVar2.a = new iq0(this, i37);
        qVar2.d = new qi.b(AndroidUtilities.dp(48.0f));
        AndroidUtilities.updateViewVisibilityAnimated(oq0Var2, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(oq0Var, false, 1.0f, false);
        r0.i0.m(getContainer(), new iq0(this, 1));
    }

    public void U0(View view) {
    }

    public void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
