package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class sq0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final dq0 D0;
    public final vl0 E;
    public ArrayList E0;
    public final tp0 F;
    public TL_stories.StoryItem F0;
    public final tp0 G;
    public i0.c G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final vz J;
    public org.telegram.ui.ActionBar.p1 J0;
    public final kq0 K;
    public int K0;
    public final pq0 L;
    public boolean L0;
    public final oq0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final zg.e O0;
    public final int P;
    public final eh.d P0;
    public final jx0 Q;
    public final eh.d Q0;
    public final Drawable R;
    public final zg.a R0;
    public final View[] S;
    public final zg.a S0;
    public final AnimatorSet[] T;
    public final zg.a T0;
    public final a0.i U;
    public final zg.k U0;
    public final HashMap V;
    public final bh.d V0;
    public final eq0 W;
    public final zg.b W0;
    public int X;
    public final bh.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean a0;
    public final FrameLayout b;
    public final int b0;
    public final vp0 c;
    public final FrameLayout c0;
    public final wp0 d;
    public final LinearLayout d0;
    public final hi.b2 e;
    public final tp e0;
    public final vp0 f;
    public final org.telegram.ui.eo f0;
    public final Activity g0;
    public final FrameLayout h;
    public final boolean h0;
    public boolean i0;
    public final TextPaint j0;
    public TLRPC.TL_exportedMessageLink k0;
    public boolean l0;
    public boolean m0;
    public final bi.nc n;
    public final boolean n0;
    public final String[] o0;
    public int p0;
    public int q0;
    public final FrameLayout r;
    public boolean r0;
    public final org.telegram.ui.ActionBar.l5 s;
    public hq0 s0;
    public float t0;
    public float u0;
    public final FrameLayout v;
    public float v0;
    public final FrameLayout w;
    public ValueAnimator w0;
    public final LinearLayout x;
    public final zk0 x0;
    public AnimatorSet y;
    public final k20 y0;
    public final org.telegram.ui.ActionBar.l z0;

    public sq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, f6Var);
    }

    public static void A0(sq0 sq0Var) {
        RectF rectF = sq0Var.Z0;
        zg.e eVar = sq0Var.O0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, sq0Var.containerView.getMeasuredWidth(), sq0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(1, sq0Var.Y0);
        eVar.e(sq0Var.U0, sq0Var.containerView.getMeasuredWidth(), sq0Var.containerView.getMeasuredHeight());
    }

    public static int F0(sq0 sq0Var) {
        tp0 tp0Var = sq0Var.F;
        if (tp0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = tp0Var.getChildAt(0);
        fl0 fl0Var = (fl0) tp0Var.G(childAt);
        if (fl0Var == null) {
            return -1000;
        }
        int paddingTop = tp0Var.getPaddingTop();
        if (fl0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static sq0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new sq0(context, messageObject != null ? org.telegram.messenger.a2.l(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static /* synthetic */ void m(sq0 sq0Var, AtomicReference atomicReference, yp0 yp0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        yp0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, sq0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean n(final sq0 sq0Var) {
        org.telegram.ui.eo eoVar;
        hi.b2 b2Var = sq0Var.e;
        boolean z10 = sq0Var.h0;
        Activity activity = sq0Var.g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(sq0Var.getContext());
        linearLayout.setOrientation(1);
        if (sq0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, sq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new zp0(sq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new mp0(sq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, sq0Var.getContext(), sq0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, w7.a6.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            sq0Var.I0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, sq0Var.getContext(), sq0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, w7.a6.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!sq0Var.I0);
            final int i10 = 0;
            g1Var.setOnClickListener(new View.OnClickListener(sq0Var) { // from class: org.telegram.ui.Components.pp0
                public final /* synthetic */ sq0 b;

                {
                    this.b = sq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.I0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(sq0Var) { // from class: org.telegram.ui.Components.pp0
                public final /* synthetic */ sq0 b;

                {
                    this.b = sq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.I0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.a6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, sq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new zp0(sq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new mp0(sq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, sq0Var.getContext(), sq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            g1Var3.setIconColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, w7.a6.n(-1, 48));
        g1Var3.setOnClickListener(new lp0(sq0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, sq0Var.getContext(), sq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            g1Var4.setIconColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, w7.a6.n(-1, 48));
        g1Var4.setOnClickListener(new lp0(sq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.a6.n(-1, -2));
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        sq0Var.J0 = p1Var;
        p1Var.b = false;
        p1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        sq0Var.J0.setOutsideTouchable(true);
        sq0Var.J0.setClippingEnabled(true);
        sq0Var.J0.setInputMethodMode(2);
        sq0Var.J0.setSoftInputMode(0);
        sq0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        sq0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        b2Var.getLocationInWindow(iArr);
        sq0Var.J0.showAtLocation(b2Var, 51, AndroidUtilities.dp(8.0f) + ((b2Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!sq0Var.keyboardVisible || (eoVar = sq0Var.f0) == null || eoVar.X0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : b2Var.getMeasuredHeight() + iArr[1]);
        sq0Var.J0.b();
        try {
            b2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(sq0 sq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        boolean z11;
        char c10;
        MessageObject messageObject;
        long j3;
        int i12;
        long j10;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        vp0 vp0Var;
        long j11;
        long j12;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = sq0Var.O;
        wp0 wp0Var = sq0Var.d;
        vp0 vp0Var2 = sq0Var.c;
        HashMap hashMap2 = sq0Var.V;
        Long l10 = 0L;
        a0.i iVar = sq0Var.U;
        ArrayList arrayList3 = sq0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i13 = 0;
            boolean z12 = false;
            while (true) {
                if (i13 >= iVar.m()) {
                    arrayList2 = arrayList3;
                    tL_forumTopic = null;
                    break;
                }
                long j13 = iVar.j(i13);
                boolean isMonoForum = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j13);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j13));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j13));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    vp0Var = vp0Var2;
                    j11 = j13;
                    j12 = 0;
                } else {
                    vp0Var = vp0Var2;
                    j11 = j13;
                    j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(sq0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (vp0Var.getTag() == null || wp0Var.a.length() <= 0) {
                    messageObject4 = messageObject3;
                    arrayList2 = arrayList3;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    MessageObject messageObject5 = messageObject3;
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), j11, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    messageObject4 = messageObject5;
                    if (l11 == null) {
                        arrayList2 = arrayList3;
                        longValue = 0;
                    } else {
                        arrayList2 = arrayList3;
                        longValue = l11.longValue();
                    }
                    of3.payStars = longValue;
                    of3.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of3);
                }
                long j14 = j11;
                int sendMessage = SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(sq0Var.N, j14, !sq0Var.I0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j12, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j14));
                }
                if (iVar.m() == 1) {
                    tL_forumTopic = null;
                    d5.t0(sendMessage, sq0Var.f0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                vp0Var2 = vp0Var;
                l10 = l4;
            }
            int size = arrayList4.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList4.get(i14);
                i14++;
                long longValue2 = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) iVar.f(longValue2);
                iVar.l(longValue2);
                if (dialog != null) {
                    hashMap2.remove(dialog);
                }
            }
            if (!iVar.i()) {
                sq0Var.R0(iVar, arrayList2.size(), iVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            eq0 eq0Var = sq0Var.W;
            int i15 = eq0Var != null ? eq0Var.d : 0;
            if (sq0Var.F0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < iVar.m()) {
                    long j15 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j15);
                    Long l12 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j15));
                    if (l12 != null && l12.longValue() > 0) {
                        z13 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j15));
                    if (tL_forumTopic3 == null || !isMonoForum2) {
                        i12 = i15;
                        j10 = 0;
                    } else {
                        i12 = i15;
                        j10 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    }
                    if (tL_forumTopic3 == null || isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = null;
                    } else {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(sq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (sq0Var.F0 != null) {
                        if (vp0Var2.getTag() != null && wp0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j15, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = sq0Var.F0;
                    } else if (vp0Var2.getTag() == null || wp0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j15, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j10;
                    SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i15 = i12;
                    strArr2 = strArr;
                }
                z11 = z13;
            } else {
                int i17 = i15;
                if (strArr2[i17] != null) {
                    boolean z14 = false;
                    for (int i18 = 0; i18 < iVar.m(); i18++) {
                        long j16 = iVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j16);
                        Long l13 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j16));
                        if (l13 != null && l13.longValue() > 0) {
                            z14 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j16));
                        long peerDialogId = (tL_forumTopic4 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || isMonoForum3) {
                            c10 = 0;
                            messageObject = null;
                        } else {
                            c10 = 0;
                            messageObject = new MessageObject(sq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (vp0Var2.getTag() == null || wp0Var.a.length() <= 0) {
                            j3 = j16;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j16, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j3 = j16;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j3, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(sq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    sq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            sq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
        }
        hq0 hq0Var = sq0Var.s0;
        if (hq0Var != null) {
            hq0Var.T();
        }
        sq0Var.dismiss();
    }

    public static void p(sq0 sq0Var, int i10) {
        TLRPC.Dialog dialog;
        k20 k20Var = sq0Var.y0;
        HashMap hashMap = sq0Var.V;
        a0.i iVar = sq0Var.U;
        kq0 kq0Var = sq0Var.K;
        pq0 pq0Var = sq0Var.L;
        if (pq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = sq0Var.C0;
            if (dialog2 == null) {
                return;
            }
            iVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            sq0Var.a1(2);
            if (sq0Var.L0 || sq0Var.M0) {
                if (((TLRPC.Dialog) kq0Var.e.f(dialog2.id)) == null) {
                    kq0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = kq0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                kq0Var.l();
                sq0Var.A0 = false;
                k20Var.r.setText("");
                sq0Var.K0(false);
            }
            for (int i11 = 0; i11 < sq0Var.P0().getChildCount(); i11++) {
                View childAt = sq0Var.P0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getCurrentDialog() == sq0Var.C0.id) {
                        h7Var.d(null, false, true);
                        h7Var.b(true, true);
                    }
                }
            }
            sq0Var.L0();
            return;
        }
        TLRPC.TL_forumTopic E = pq0Var.E(i10);
        if (E == null || (dialog = sq0Var.C0) == null) {
            return;
        }
        long j3 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(sq0Var.currentAccount).isMonoForum(j3);
        TLRPC.Dialog dialog3 = sq0Var.C0;
        iVar.k(dialog3, j3);
        hashMap.put(dialog3, E);
        sq0Var.a1(2);
        if (sq0Var.L0 || sq0Var.M0) {
            if (((TLRPC.Dialog) kq0Var.e.f(dialog3.id)) == null) {
                kq0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = kq0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            kq0Var.l();
            sq0Var.A0 = false;
            k20Var.r.setText("");
            sq0Var.K0(false);
        }
        for (int i12 = 0; i12 < sq0Var.P0().getChildCount(); i12++) {
            View childAt2 = sq0Var.P0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                if (h7Var2.getCurrentDialog() == sq0Var.C0.id) {
                    h7Var2.d(E, isMonoForum, true);
                    h7Var2.b(true, true);
                }
            }
        }
        sq0Var.L0();
    }

    public static void s0(sq0 sq0Var) {
        tp0 tp0Var = sq0Var.F;
        tp0 tp0Var2 = sq0Var.G;
        vl0 vl0Var = sq0Var.E;
        if (sq0Var.r0) {
            return;
        }
        tp0 tp0Var3 = sq0Var.L0 ? tp0Var2 : tp0Var;
        if (tp0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = tp0Var3.getChildAt(0);
        for (int i10 = 0; i10 < tp0Var3.getChildCount(); i10++) {
            if (tp0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = tp0Var3.getChildAt(i10);
            }
        }
        fl0 fl0Var = (fl0) tp0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || fl0Var == null || fl0Var.b() != 0) ? 0 : top;
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            sq0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            sq0Var.T0(true);
            top = i11;
        } else {
            sq0Var.K0 = childAt.getTop();
            sq0Var.T0(false);
        }
        if (vl0Var.getVisibility() == 0) {
            if (vl0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = vl0Var.getChildAt(0);
            for (int i12 = 0; i12 < vl0Var.getChildCount(); i12++) {
                if (vl0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = vl0Var.getChildAt(i12);
                }
            }
            fl0 fl0Var2 = (fl0) vl0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || fl0Var2 == null || fl0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || fl0Var2 == null || fl0Var2.b() != 0) {
                sq0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                sq0Var.T0(true);
                top2 = i13;
            } else {
                sq0Var.K0 = childAt2.getTop();
                sq0Var.T0(false);
            }
            top = AndroidUtilities.lerp(top, top2, vl0Var.getAlpha());
        }
        int i14 = sq0Var.p0;
        if (i14 != top) {
            sq0Var.q0 = i14;
            float f7 = top;
            int i15 = (int) (sq0Var.t0 + f7);
            sq0Var.p0 = i15;
            tp0Var.setTopGlowOffset(i15);
            int i16 = (int) (sq0Var.t0 + f7);
            sq0Var.p0 = i16;
            tp0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + sq0Var.t0);
            sq0Var.p0 = i17;
            vl0Var.setTopGlowOffset(i17);
            sq0Var.b.setTranslationY(sq0Var.p0 + sq0Var.t0);
            sq0Var.Q.setTranslationY(sq0Var.p0 + sq0Var.t0);
            sq0Var.containerView.invalidate();
        }
    }

    public final void K0(boolean z10) {
        k20 k20Var = this.y0;
        bi.t2 t2Var = k20Var.r;
        bi.t2 t2Var2 = k20Var.r;
        boolean isEmpty = TextUtils.isEmpty(t2Var.getText());
        tp0 tp0Var = this.F;
        tp0 tp0Var2 = this.G;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && t2Var2.hasFocus()) || this.M0)) {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var2, true);
            }
        } else {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(tp0Var2, false);
            }
            z11 = false;
        }
        if (this.L0 != z11 || z10) {
            this.L0 = z11;
            oq0 oq0Var = this.M;
            oq0Var.l();
            this.K.l();
            if (this.L0) {
                if (this.K0 == Integer.MAX_VALUE) {
                    ((s4.c0) tp0Var2.getLayoutManager()).h1(0, -tp0Var2.getPaddingTop());
                } else {
                    ((s4.c0) tp0Var2.getLayoutManager()).h1(0, this.K0 - tp0Var2.getPaddingTop());
                }
                oq0Var.E(t2Var2.getText().toString());
                return;
            }
            int i10 = this.K0;
            s4.s sVar = this.H;
            if (i10 == Integer.MAX_VALUE) {
                sVar.h1(0, 0);
            } else {
                sVar.h1(0, 0);
            }
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.C0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.C0 = null;
        for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
            View childAt = P0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.k kVar = this.B0;
        if (kVar != null) {
            kVar.c();
        }
        P0().setVisibility(0);
        k20 k20Var = this.y0;
        k20Var.setVisibility(0);
        bi.t2 t2Var = k20Var.r;
        if (this.L0 || this.M0) {
            this.D0.H.v = true;
            t2Var.requestFocus();
            AndroidUtilities.showKeyboard(t2Var);
        }
        int[] iArr = new int[2];
        o1.k kVar2 = new o1.k(new o1.j(1000.0f));
        o1.l lVar = new o1.l(0.0f);
        org.telegram.ui.eo eoVar = this.f0;
        lVar.b((eoVar == null || !eoVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.B0 = kVar2;
        kVar2.b(new kp0(this, (org.telegram.ui.Cells.h7) view, iArr, 0));
        this.B0.a(new gb(this, 4));
        this.B0.f();
    }

    public final void M0() {
        boolean z10 = false;
        if (this.k0 == null && this.o0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            hq0 hq0Var = this.s0;
            if (hq0Var != null) {
                hq0Var.s0();
                return;
            }
            if (this.g0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.g0).D0(new i2.x(2, z10));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.o0;
        eq0 eq0Var = this.W;
        if (eq0Var != null) {
            str = strArr[eq0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        tp tpVar = this.e0;
        if (tpVar != null && tpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.b0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str == null ? "" : str;
    }

    public final vl0 P0() {
        return (this.L0 || this.M0) ? this.G : this.F;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        vl0 vl0Var = this.E;
        vl0Var.setPivotX(width);
        vl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        vl0Var.setScaleX(f11);
        vl0Var.setScaleY(f11);
        vl0Var.setAlpha(f7);
        vl0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        k20 k20Var = this.y0;
        k20Var.setPivotX(k20Var.getWidth() / 2.0f);
        k20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        k20Var.setScaleX(f14);
        k20Var.setScaleY(f14);
        k20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.l lVar = this.z0;
        lVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        lVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.setAlpha(f7);
        vl0Var.getLocationInWindow(iArr);
        float interpolation = wr.g.getInterpolation(f7);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
            View childAt2 = vl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((vl0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z10) {
        View[] viewArr = this.S;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.T;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new aq0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        sq0 sq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        nq0 nq0Var;
        if (dialog instanceof jq0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) view).F) || ((view instanceof org.telegram.ui.Cells.j6) && ((org.telegram.ui.Cells.j6) view).n0)) {
            X0(dialog.id, view);
            return;
        }
        vl0 vl0Var = this.E;
        if (vl0Var.getVisibility() != 8 || (activity = this.g0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.P;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    d2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.n0) {
                    d2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    d2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                hc.b.s(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.R = string2;
            if (i10 == 3) {
                d2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                d2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                d2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            hc.b.s(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j3 = dialog.id;
        a0.i iVar = this.U;
        if (iVar.h(j3) >= 0) {
            iVar.l(dialog.id);
            this.V.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.j6) {
                ((org.telegram.ui.Cells.j6) view).s(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).b(false, true);
            }
            a1(1);
            sq0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.C0 = dialog;
                this.I.h1(0, this.p0 - vl0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                yp0 yp0Var = new yp0(this, dialog, atomicReference, view);
                atomicReference.set(new org.telegram.ui.da(this, atomicReference, yp0Var, dialog, 27));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(yp0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    yp0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            sq0Var = this;
            iVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.j6) {
                ((org.telegram.ui.Cells.j6) view).s(true, true);
            } else if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).b(true, true);
            }
            a1(2);
            long j10 = UserConfig.getInstance(sq0Var.currentAccount).clientUserId;
            if (sq0Var.L0) {
                kq0 kq0Var = sq0Var.K;
                a0.i iVar2 = kq0Var.e;
                ArrayList arrayList = kq0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.id);
                if (dialog2 == null) {
                    kq0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                kq0Var.l();
                sq0Var.A0 = false;
                k20 k20Var = sq0Var.y0;
                k20Var.r.setText("");
                K0(false);
                AndroidUtilities.hideKeyboard(k20Var.r);
            }
        }
        oq0 oq0Var = sq0Var.M;
        if (oq0Var == null || (nq0Var = oq0Var.H) == null) {
            return;
        }
        nq0Var.q(0, nq0Var.h());
    }

    public final void V0(final boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            a0.i iVar = this.U;
            int m10 = iVar.m();
            vp0 vp0Var = this.c;
            wp0 wp0Var = this.d;
            if (i11 >= m10) {
                Editable text = wp0Var.getText();
                iu iuVar = wp0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                tp tpVar = this.e0;
                int i12 = (tpVar == null || !tpVar.a.q) ? -1 : this.b0;
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i10 = 0;
                    for (int i13 = 0; i13 < iVar.m(); i13++) {
                        long j3 = iVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j3);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j3));
                        }
                        if (vp0Var.getTag() != null && iuVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                } else {
                    eq0 eq0Var = this.W;
                    int i14 = eq0Var != null ? eq0Var.d : 0;
                    if (this.F0 != null) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < iVar.m(); i16++) {
                            long j10 = iVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                            }
                            if (this.F0 != null && vp0Var.getTag() != null && iuVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                                i15++;
                            }
                            if (sendPaidMessagesStars2 > 0) {
                                i15++;
                            }
                            if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                        i10 = i15;
                    } else {
                        int i17 = 0;
                        if (this.O[i14] != null) {
                            for (int i18 = 0; i18 < iVar.m(); i18++) {
                                long j11 = iVar.j(i18);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                                }
                                if (vp0Var.getTag() != null && iuVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i17++;
                                }
                                if (sendPaidMessagesStars3 > 0) {
                                    i17++;
                                }
                                if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                    arrayList.add(Long.valueOf(j11));
                                }
                            }
                            i10 = i17;
                        } else {
                            i10 = 0;
                        }
                    }
                }
                final int i19 = i12;
                d5.c0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.qp0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        sq0.o(sq0.this, charSequenceArr, entities, z10, i19, (HashMap) obj);
                    }
                });
                return;
            }
            if (d5.h(getContext(), this.currentAccount, iVar.j(i11), vp0Var.getTag() != null && wp0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void W0(boolean z10) {
        vp0 vp0Var = this.c;
        if (z10 == (vp0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        vp0Var.setTag(z10 ? 1 : null);
        wp0 wp0Var = this.d;
        if (wp0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(wp0Var.getEditText());
        }
        wp0Var.k(true);
        FrameLayout frameLayout = this.c0;
        vp0 vp0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            vp0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            vp0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            int i11 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f7 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(vp0Var, (Property<vp0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(vp0Var2, (Property<vp0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(vp0Var2, (Property<vp0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(vp0Var2, (Property<vp0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.S[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.r;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.h0 && z10) {
                f7 = AndroidUtilities.dp(this.d0 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f7));
        }
        this.y.playTogether(arrayList);
        this.y.setInterpolator(new DecelerateInterpolator());
        this.y.setDuration(180L);
        this.y.addListener(new aq0(this, z10, 1));
        this.y.start();
    }

    public final void X0(long j3, View view) {
        int i10 = -this.H0;
        this.H0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.v;
        (premiumFeaturesBlocked ? new wc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new wc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new np0(this, i11))).j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.r1 r1Var;
        vp0 vp0Var = this.c;
        if (vp0Var == null) {
            return;
        }
        wp0 wp0Var = this.d;
        if (wp0Var == null || !wp0Var.m()) {
            dq0 dq0Var = this.D0;
            if (dq0Var != null && (r1Var = dq0Var.H) != null && !r1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            wp0Var.getEmojiPaddingShown();
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        vp0Var.setTranslationY(f11);
        this.f.setTranslationY(f11);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.l5 l5Var = this.s;
        if (l5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            l5Var.k(O0);
        }
    }

    public final void a1(int i10) {
        a0.i iVar = this.U;
        if (iVar.m() == 0) {
            W0(false);
            return;
        }
        ArrayList arrayList = this.N;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        wp0 wp0Var = this.d;
        if (tag != null && wp0Var.a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
            }
            j3 += sendPaidMessagesStars;
        }
        int max = Math.max(1, iVar.m());
        boolean z10 = i10 != 0;
        hi.b2 b2Var = this.e;
        b2Var.g(max, z10);
        b2Var.i(size, j3, i10 != 0);
        W0(true);
        wp0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), b2Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            kq0 kq0Var = this.K;
            if (kq0Var != null) {
                kq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        wp0 wp0Var = this.d;
        if (wp0Var != null) {
            AndroidUtilities.hideKeyboard(wp0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void dismissInternal() {
        super.dismissInternal();
        wp0 wp0Var = this.d;
        if (wp0Var != null) {
            wp0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (this.C0 != null) {
            L0();
            return;
        }
        wp0 wp0Var = this.d;
        if (wp0Var == null || !wp0Var.e) {
            super.onBackPressed();
        } else {
            wp0Var.k(true);
        }
    }

    public sq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0825  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sq0(Context context, org.telegram.ui.eo eoVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        int i10;
        float f7;
        float f10;
        tp0 tp0Var;
        tp0 tp0Var2;
        LinearLayout linearLayout;
        int i11;
        String[] strArr = new String[2];
        this.O = strArr;
        this.S = new View[2];
        this.T = new AnimatorSet[2];
        this.U = new a0.i();
        this.V = new HashMap();
        this.X = -1;
        final int i12 = 0;
        this.Y = false;
        new RectF();
        new Paint(1);
        this.j0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.o0 = strArr2;
        this.E0 = new ArrayList();
        int i13 = 4;
        while (true) {
            if (i13 >= 32) {
                i10 = 80;
                break;
            }
            i10 = (1 << i13) - 12;
            if (80 <= i10) {
                break;
            } else {
                i13++;
            }
        }
        int i14 = i10 / 8;
        long[] jArr = new long[i14];
        Object[] objArr = new Object[i14];
        this.G0 = i0.c.e;
        this.H0 = 4;
        this.I0 = true;
        this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.Y0 = arrayList2;
        RectF rectF = new RectF();
        this.Z0 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        eh.c cVar = new eh.c();
        int i15 = org.telegram.ui.ActionBar.j6.d6;
        cVar.a(getThemedColor(i15));
        int i16 = 10;
        int i17 = 11;
        if (Build.VERSION.SDK_INT >= 31) {
            this.O0 = new zg.e(false);
            eh.d dVar = new eh.d(null);
            this.Q0 = dVar;
            dVar.j(new l2.h(this, i17));
            eh.d dVar2 = new eh.d(null);
            this.P0 = dVar2;
            dVar2.j(new m.g3(this, i16));
            zg.a aVar = new zg.a(dVar);
            this.R0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            zg.a aVar2 = new zg.a(dVar2);
            this.S0 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.O0 = null;
            this.P0 = null;
            this.Q0 = null;
            this.R0 = new zg.a(cVar);
            this.S0 = new zg.a(cVar);
        }
        this.T0 = new zg.a(cVar);
        this.resourcesProvider = f6Var;
        this.Z = z13;
        this.g0 = AndroidUtilities.findActivity(context);
        this.h0 = z12;
        if (z12) {
            this.resourcesProvider = new bq0(i12);
        }
        cVar.a(getThemedColor(i15));
        this.f0 = eoVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.R = mutate;
        int i18 = org.telegram.ui.ActionBar.j6.h5;
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
                a4.a.z(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a4.a.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.N = arrayList;
        this.M = new oq0(this, context);
        this.n0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.h0(this, 1));
        int i19 = 3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                MessageObject messageObject2 = (MessageObject) this.N.get(i20);
                if (messageObject2.isTodo()) {
                    this.P = 3;
                } else if (messageObject2.isPoll()) {
                    int i21 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.P = i21;
                    if (i21 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z10) {
            this.l0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new th(8, this, context));
        }
        dq0 dq0Var = new dq0(this, context);
        this.D0 = dq0Var;
        this.containerView = dq0Var;
        zg.a aVar3 = this.R0;
        gh.k kVar = new gh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar3.d = kVar;
        aVar3.e = viewGroup;
        zg.a aVar4 = this.S0;
        gh.k kVar2 = new gh.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = kVar2;
        aVar4.e = viewGroup2;
        zg.a aVar5 = this.T0;
        gh.k kVar3 = new gh.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = kVar3;
        aVar5.e = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i22 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i22, 0, i22, this.G0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int i23 = org.telegram.ui.ActionBar.j6.h5;
        frameLayout.setBackgroundColor(getThemedColor(i23));
        if (this.h0 && this.o0[1] != null) {
            eq0 eq0Var = new eq0(this, context);
            this.W = eq0Var;
            frameLayout.addView(eq0Var, w7.a6.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        k20 k20Var = new k20(context, this.resourcesProvider);
        this.y0 = k20Var;
        fq0 fq0Var = new fq0(this);
        bi.t2 t2Var = k20Var.r;
        t2Var.addTextChangedListener(fq0Var);
        t2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        int i24 = 6;
        t2Var.setOnEditorActionListener(new g1(this, i24));
        k20Var.setCloseButtonOnClickListener(new np0(this, i12));
        frameLayout.addView(k20Var, w7.a6.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.z0 = lVar;
        lVar.setOccupyStatusBar(false);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i25 = org.telegram.ui.ActionBar.j6.j5;
        lVar.setTitleColor(getThemedColor(i25));
        lVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.q5));
        lVar.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), false);
        lVar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 12));
        lVar.setVisibility(8);
        frameLayout.addView(lVar, w7.a6.e(-1, 58, 83));
        vl0 vl0Var = new vl0(context, this.resourcesProvider);
        this.E = vl0Var;
        s4.s sVar = new s4.s(4);
        this.I = sVar;
        vl0Var.setLayoutManager(sVar);
        sVar.O = new up0(this, 2);
        vl0Var.setOnScrollListener(new sp0(this, i12));
        pq0 pq0Var = new pq0(this, context);
        this.L = pq0Var;
        vl0Var.setAdapter(pq0Var);
        int i26 = org.telegram.ui.ActionBar.j6.A5;
        vl0Var.setGlowColor(getThemedColor(i26));
        vl0Var.setVerticalScrollBarEnabled(false);
        vl0Var.setHorizontalScrollBarEnabled(false);
        vl0Var.setOverScrollMode(2);
        vl0Var.setSelectorDrawableColor(0);
        vl0Var.setItemSelectorColorProvider(new gp0(2));
        vl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        vl0Var.setClipToPadding(false);
        vl0Var.i(new fg.j0(4));
        vl0Var.setOnItemClickListener(new jl0(this) { // from class: org.telegram.ui.Components.op0
            public final /* synthetic */ sq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.jl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i27, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i12) {
                    case 0:
                        sq0.p(this.b, i27);
                        break;
                    case 1:
                        if (i27 >= 0) {
                            sq0 sq0Var = this.b;
                            ArrayList arrayList3 = sq0Var.K.d;
                            int i28 = i27 - 1;
                            TLRPC.Dialog dialog = (i28 < 0 || i28 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i28);
                            if (dialog != null) {
                                sq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i27 >= 0) {
                            sq0 sq0Var2 = this.b;
                            oq0 oq0Var = sq0Var2.M;
                            sq0 sq0Var3 = oq0Var.K;
                            int i29 = oq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i27 < i29 || i29 < 0) {
                                int i30 = i27 - 1;
                                if (i30 >= 0) {
                                    if (i30 < oq0Var.d.size()) {
                                        tL_dialog2 = ((gq0) oq0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - oq0Var.d.size();
                                        ArrayList arrayList4 = oq0Var.e.d;
                                        if (size2 < arrayList4.size()) {
                                            TLObject tLObject = (TLObject) arrayList4.get(size2);
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
                                    sq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i31 = i27 - i29;
                                if (i31 >= 0 && i31 < sq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((fg.g0) sq0Var3.E0.get(i31)).a;
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
        vl0Var.setVisibility(8);
        this.containerView.addView(vl0Var, w7.a6.e(-1, -1, 51));
        tp0 tp0Var3 = new tp0(this, context, this.resourcesProvider, i12);
        this.F = tp0Var3;
        tp0Var3.setSelectorDrawableColor(0);
        tp0Var3.setItemSelectorColorProvider(new gp0(2));
        tp0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        tp0Var3.setClipToPadding(false);
        getContext();
        s4.s sVar2 = new s4.s(4);
        this.H = sVar2;
        tp0Var3.setLayoutManager(sVar2);
        this.U0 = new zg.k(tp0Var3, this.containerView, new iw(tp0Var3, i19));
        sVar2.O = new up0(this, i12);
        tp0Var3.setHorizontalScrollBarEnabled(false);
        tp0Var3.setVerticalScrollBarEnabled(false);
        tp0Var3.setOverScrollMode(2);
        tp0Var3.i(new fg.j0(5));
        this.containerView.addView(tp0Var3, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        kq0 kq0Var = new kq0(this, context);
        this.K = kq0Var;
        tp0Var3.setAdapter(kq0Var);
        tp0Var3.setGlowColor(getThemedColor(i26));
        final int i27 = 1;
        tp0Var3.setOnItemClickListener(new jl0(this) { // from class: org.telegram.ui.Components.op0
            public final /* synthetic */ sq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.jl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i272, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i27) {
                    case 0:
                        sq0.p(this.b, i272);
                        break;
                    case 1:
                        if (i272 >= 0) {
                            sq0 sq0Var = this.b;
                            ArrayList arrayList3 = sq0Var.K.d;
                            int i28 = i272 - 1;
                            TLRPC.Dialog dialog = (i28 < 0 || i28 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i28);
                            if (dialog != null) {
                                sq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i272 >= 0) {
                            sq0 sq0Var2 = this.b;
                            oq0 oq0Var = sq0Var2.M;
                            sq0 sq0Var3 = oq0Var.K;
                            int i29 = oq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i272 < i29 || i29 < 0) {
                                int i30 = i272 - 1;
                                if (i30 >= 0) {
                                    if (i30 < oq0Var.d.size()) {
                                        tL_dialog2 = ((gq0) oq0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - oq0Var.d.size();
                                        ArrayList arrayList4 = oq0Var.e.d;
                                        if (size2 < arrayList4.size()) {
                                            TLObject tLObject = (TLObject) arrayList4.get(size2);
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
                                    sq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i31 = i272 - i29;
                                if (i31 >= 0 && i31 < sq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((fg.g0) sq0Var3.E0.get(i31)).a;
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
        tp0Var3.setOnScrollListener(new sp0(this, i27));
        tp0 tp0Var4 = new tp0(this, context, this.resourcesProvider, i27);
        this.G = tp0Var4;
        tp0Var4.setItemSelectorColorProvider(new gp0(2));
        tp0Var4.setSelectorDrawableColor(0);
        tp0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        tp0Var4.setClipToPadding(false);
        getContext();
        vz vzVar = new vz(4, 0, tp0Var4);
        this.J = vzVar;
        tp0Var4.setLayoutManager(vzVar);
        vzVar.O = new up0(this, 1);
        final int i28 = 2;
        tp0Var4.setOnItemClickListener(new jl0(this) { // from class: org.telegram.ui.Components.op0
            public final /* synthetic */ sq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.jl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i272, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i28) {
                    case 0:
                        sq0.p(this.b, i272);
                        break;
                    case 1:
                        if (i272 >= 0) {
                            sq0 sq0Var = this.b;
                            ArrayList arrayList3 = sq0Var.K.d;
                            int i282 = i272 - 1;
                            TLRPC.Dialog dialog = (i282 < 0 || i282 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i282);
                            if (dialog != null) {
                                sq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i272 >= 0) {
                            sq0 sq0Var2 = this.b;
                            oq0 oq0Var = sq0Var2.M;
                            sq0 sq0Var3 = oq0Var.K;
                            int i29 = oq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i272 < i29 || i29 < 0) {
                                int i30 = i272 - 1;
                                if (i30 >= 0) {
                                    if (i30 < oq0Var.d.size()) {
                                        tL_dialog2 = ((gq0) oq0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - oq0Var.d.size();
                                        ArrayList arrayList4 = oq0Var.e.d;
                                        if (size2 < arrayList4.size()) {
                                            TLObject tLObject = (TLObject) arrayList4.get(size2);
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
                                    sq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i31 = i272 - i29;
                                if (i31 >= 0 && i31 < sq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((fg.g0) sq0Var3.E0.get(i31)).a;
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
        tp0Var4.setHasFixedSize(true);
        tp0Var4.setItemAnimator(null);
        tp0Var4.setHorizontalScrollBarEnabled(false);
        tp0Var4.setVerticalScrollBarEnabled(false);
        tp0Var4.setOnScrollListener(new sp0(this, i28));
        tp0Var4.i(new fg.j0(i24));
        tp0Var4.setAdapter(this.M);
        tp0Var4.setGlowColor(getThemedColor(i26));
        this.x0 = new zk0(tp0Var4, true);
        a10 a10Var = new a10(context, this.resourcesProvider);
        a10Var.setViewType(12);
        jx0 jx0Var = new jx0(context, a10Var, 1, this.resourcesProvider);
        this.Q = jx0Var;
        jx0Var.addView(a10Var, 0);
        jx0Var.setAnimateLayoutChange(true);
        jx0Var.e(false, false);
        boolean z14 = this.h0;
        uh.o oVar = jx0Var.d;
        if (z14) {
            oVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.ng));
        }
        oVar.setText(LocaleController.getString(R.string.NoResult));
        tp0Var4.setEmptyView(jx0Var);
        tp0Var4.setHideIfEmpty(false);
        tp0Var4.Y1 = true;
        tp0Var4.Z1 = 0;
        this.containerView.addView(jx0Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(tp0Var4, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.nc ncVar = new bi.nc(this, context, 21);
        this.n = ncVar;
        this.containerView.addView(ncVar, w7.a6.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.h0 || this.o0[1] == null) ? 58.0f : 111.0f);
        this.S[0] = new View(context);
        View view = this.S[0];
        int i29 = org.telegram.ui.ActionBar.j6.V5;
        view.setBackgroundColor(getThemedColor(i29));
        this.S[0].setAlpha(0.0f);
        this.S[0].setTag(1);
        this.containerView.addView(this.S[0], layoutParams);
        this.containerView.addView(frameLayout, w7.a6.e(-1, (!this.h0 || this.o0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.S[1] = new View(context);
        this.S[1].setBackgroundColor(getThemedColor(i29));
        this.S[1].setLayoutParams(layoutParams2);
        if (!this.n0 && this.o0[0] == null) {
            this.S[1].setAlpha(0.0f);
            tp0Var = tp0Var3;
            tp0Var2 = tp0Var4;
            f7 = 4.0f;
            f10 = 22.0f;
        } else {
            f7 = 4.0f;
            f10 = 22.0f;
            if (this.h0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.r = frameLayout3;
                frameLayout2.addView(frameLayout3, w7.a6.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, w7.a6.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                w7.c6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new lp0(this, 3));
                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
                this.s = l5Var;
                l5Var.setTextSize(15);
                l5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Tk));
                l5Var.setEllipsizeByGradient(true);
                Z0();
                linearLayout3.addView(l5Var, w7.a6.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i30 = org.telegram.ui.ActionBar.j6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i30), 4, 4));
                linearLayout3.addView(textView, w7.a6.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new lp0(this, 4));
                w7.c6.a(textView);
                tp0Var = tp0Var3;
                tp0Var2 = tp0Var4;
                this.containerView.addView(frameLayout2, w7.a6.e(-1, 58, 83));
                ArrayList arrayList3 = this.N;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i31 = 0;
                        linearLayout = org.telegram.messenger.em.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rp0
                            public final /* synthetic */ sq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i31) {
                                    case 0:
                                        sq0 sq0Var = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var = sq0Var.f0;
                                        if (p2Var == null) {
                                            p2Var = LaunchActivity.U();
                                        }
                                        if (p2Var != null) {
                                            sq0Var.dismiss();
                                            p2Var.presentFragment(new org.telegram.ui.kj0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        sq0 sq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var2 = sq0Var2.f0;
                                        if (p2Var2 == null) {
                                            p2Var2 = LaunchActivity.U();
                                        }
                                        if (p2Var2 != null) {
                                            sq0Var2.dismiss();
                                            p2Var2.presentFragment(new org.telegram.ui.kj0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i30), 6, 6));
                        w7.c6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i32 = org.telegram.ui.ActionBar.j6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i32), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, w7.a6.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i32));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, w7.a6.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i11 = 8;
                        linearLayout2.addView(linearLayout3, w7.a6.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, w7.a6.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i11 = 11;
                linearLayout2.addView(linearLayout3, w7.a6.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                if (linearLayout != null) {
                }
            } else {
                tp0Var = tp0Var3;
                tp0Var2 = tp0Var4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.a6.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i33 = org.telegram.ui.ActionBar.j6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i33), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.h0 && this.o0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new lp0(this, 5));
                frameLayout5.addView(textView3, w7.a6.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, w7.a6.e(-1, 58, 87));
                ArrayList arrayList4 = this.N;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.eg : i33), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, w7.a6.d(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        final int i34 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rp0
                            public final /* synthetic */ sq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i34) {
                                    case 0:
                                        sq0 sq0Var = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var = sq0Var.f0;
                                        if (p2Var == null) {
                                            p2Var = LaunchActivity.U();
                                        }
                                        if (p2Var != null) {
                                            sq0Var.dismiss();
                                            p2Var.presentFragment(new org.telegram.ui.kj0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        sq0 sq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var2 = sq0Var2.f0;
                                        if (p2Var2 == null) {
                                            p2Var2 = LaunchActivity.U();
                                        }
                                        if (p2Var2 != null) {
                                            sq0Var2.dismiss();
                                            p2Var2.presentFragment(new org.telegram.ui.kj0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, w7.a6.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, w7.a6.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, w7.a6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        vp0 vp0Var = new vp0(this, context, 0);
        this.c = vp0Var;
        vp0Var.setWillNotDraw(false);
        vp0Var.setAlpha(0.0f);
        vp0Var.setVisibility(4);
        this.containerView.addView(vp0Var, w7.a6.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        vp0Var.setOnTouchListener(new ai.h(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i23)) > 0.721f);
        wp0 wp0Var = new wp0(this, context, dq0Var, this.resourcesProvider);
        this.d = wp0Var;
        wp0Var.J = true;
        if (this.h0) {
            fu editText = wp0Var.getEditText();
            int i35 = org.telegram.ui.ActionBar.j6.ng;
            editText.setTextColor(getThemedColor(i35));
            wp0Var.getEditText().setCursorColor(getThemedColor(i35));
        }
        wp0Var.setHint(LocaleController.getString(R.string.ShareComment));
        wp0Var.s();
        wp0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        vp0Var.addView(wp0Var, w7.a6.e(-1, -2, 51));
        vp0Var.setClipChildren(false);
        vp0Var.setClipToPadding(false);
        wp0Var.setClipChildren(false);
        wp0Var.getEditText().addTextChangedListener(new bi.u2(this, 12));
        vp0 vp0Var2 = new vp0(this, context, 1);
        this.f = vp0Var2;
        vp0Var2.setFocusable(true);
        vp0Var2.setFocusableInTouchMode(true);
        vp0Var2.setVisibility(4);
        vp0Var2.setScaleX(0.2f);
        vp0Var2.setScaleY(0.2f);
        vp0Var2.setAlpha(0.0f);
        this.containerView.addView(vp0Var2, w7.a6.e(110, 50, 85));
        hi.b2 b2Var = new hi.b2((NotificationCenter.NotificationCenterDelegate) this, context, R.drawable.send_plane_24, this.resourcesProvider, 2);
        this.e = b2Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        b2Var.I = dp;
        b2Var.J = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        b2Var.M = dp3;
        b2Var.N = dp4;
        b2Var.h0 = true;
        vp0Var2.addView(b2Var, w7.a6.g());
        b2Var.setOnClickListener(new lp0(this, 6));
        b2Var.setOnLongClickListener(new v10(this, 2));
        this.j0.setTextSize(AndroidUtilities.dp(12.0f));
        this.j0.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.b0 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.c0 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.d0 = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            linearLayout5.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 6, 6));
            tp tpVar = new tp(context, 24, this.resourcesProvider);
            this.e0 = tpVar;
            tpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
            tpVar.setDrawUnchecked(true);
            tpVar.a(false, false);
            tpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(tpVar, w7.a6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i25));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, w7.a6.t(-2, -2, 16, 9, 0, 0, 0));
            w7.c6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new lp0(this, 0));
            frameLayout8.addView(linearLayout5, w7.a6.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d7));
                frameLayout8.addView(view2, w7.a6.a(-1.0f, this.h0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, w7.a6.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        zg.b bVar = new zg.b(this.T0.c(ncVar, null, false));
        this.W0 = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        bh.d c10 = this.S0.c(this.D0, dh.c.e(this.resourcesProvider), false);
        this.V0 = c10;
        c10.k = true;
        c10.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.t(AndroidUtilities.dp(32.0f));
        c10.h.g = 0.4f;
        c10.j();
        bh.d c11 = this.R0.c(vp0Var, dh.c.e(this.resourcesProvider), false);
        this.X0 = c11;
        c11.p(AndroidUtilities.dp(f10));
        c11.o(AndroidUtilities.dp(9.0f));
        vp0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            bh.d c12 = this.R0.c(frameLayout9, dh.c.e(this.resourcesProvider), false);
            c12.o(AndroidUtilities.dp(9.0f));
            c12.p(AndroidUtilities.dp(f10));
            this.r.setBackground(c12);
            this.r.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.c0;
        if (frameLayout10 != null) {
            bh.d c13 = this.R0.c(frameLayout10, dh.c.e(this.resourcesProvider), false);
            c13.o(AndroidUtilities.dp(9.0f));
            c13.p(AndroidUtilities.dp(f10));
            this.c0.setBackground(c13);
            this.c0.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        a1(0);
        org.telegram.ui.wy.i4(AccountInstance.getInstance(this.currentAccount));
        if (kq0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i36 = this.currentAccount;
        int i37 = 0;
        MessagesStorage.getInstance(i36).getStorageQueue().postRunnable(new fg.n(i36, i37, new xp0(this), i37));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(tp0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(tp0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.f3 container = getContainer();
        mp0 mp0Var = new mp0(this, i37);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(container, mp0Var);
    }

    public void S0(View view) {
    }

    public void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
