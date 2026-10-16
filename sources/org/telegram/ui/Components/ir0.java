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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class ir0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final tq0 D0;
    public final mm0 E;
    public ArrayList E0;
    public final kq0 F;
    public TL_stories.StoryItem F0;
    public final kq0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final a00 J;
    public org.telegram.ui.ActionBar.m1 J0;
    public final ar0 K;
    public int K0;
    public final fr0 L;
    public boolean L0;
    public final er0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final bh.f O0;
    public final int P;
    public final gh.d P0;
    public final wx0 Q;
    public final gh.d Q0;
    public final Drawable R;
    public final bh.b R0;
    public final View[] S;
    public final bh.b S0;
    public final AnimatorSet[] T;
    public final bh.b T0;
    public final a0.h U;
    public final bh.l U0;
    public final HashMap V;
    public final dh.d V0;
    public final uq0 W;
    public final bh.c W0;
    public int X;
    public final dh.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean a0;
    public final FrameLayout b;
    public final int b0;
    public final mq0 c;
    public final FrameLayout c0;
    public final nq0 d;
    public final LinearLayout d0;
    public final ji.y1 e;
    public final aq e0;
    public final mq0 f;
    public final org.telegram.ui.fo f0;
    public final Activity g0;
    public final FrameLayout h;
    public final boolean h0;
    public boolean i0;
    public final TextPaint j0;
    public TLRPC.TL_exportedMessageLink k0;
    public boolean l0;
    public boolean m0;
    public final di.ab n;
    public final boolean n0;
    public final String[] o0;
    public int p0;
    public int q0;
    public final FrameLayout r;
    public boolean r0;
    public final org.telegram.ui.ActionBar.h5 s;
    public xq0 s0;
    public float t0;
    public float u0;
    public final FrameLayout v;
    public float v0;
    public final FrameLayout w;
    public ValueAnimator w0;
    public final LinearLayout x;
    public final rl0 x0;
    public AnimatorSet y;
    public final o20 y0;
    public final org.telegram.ui.ActionBar.k z0;

    public ir0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, c6Var);
    }

    public static void B0(ir0 ir0Var) {
        RectF rectF = ir0Var.Z0;
        bh.f fVar = ir0Var.O0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, ir0Var.containerView.getMeasuredWidth(), ir0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(1, ir0Var.Y0);
        fVar.e(ir0Var.U0, ir0Var.containerView.getMeasuredWidth(), ir0Var.containerView.getMeasuredHeight());
    }

    public static int G0(ir0 ir0Var) {
        kq0 kq0Var = ir0Var.F;
        if (kq0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = kq0Var.getChildAt(0);
        wl0 wl0Var = (wl0) kq0Var.G(childAt);
        if (wl0Var == null) {
            return -1000;
        }
        int paddingTop = kq0Var.getPaddingTop();
        if (wl0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static ir0 O0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new ir0(context, messageObject != null ? org.telegram.messenger.g0.k(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static /* synthetic */ void n(ir0 ir0Var, AtomicReference atomicReference, pq0 pq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        pq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, ir0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean o(final ir0 ir0Var) {
        org.telegram.ui.fo foVar;
        ji.y1 y1Var = ir0Var.e;
        boolean z10 = ir0Var.h0;
        Activity activity = ir0Var.g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(ir0Var.getContext());
        linearLayout.setOrientation(1);
        if (ir0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ir0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new qq0(ir0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new cq0(ir0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, ir0Var.getContext(), ir0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
            e1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            ir0Var.I0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, ir0Var.getContext(), ir0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
            e1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!ir0Var.I0);
            final int i10 = 0;
            e1Var.setOnClickListener(new View.OnClickListener(ir0Var) { // from class: org.telegram.ui.Components.gq0
                public final /* synthetic */ ir0 b;

                {
                    this.b = ir0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.I0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            e1Var2.setOnClickListener(new View.OnClickListener(ir0Var) { // from class: org.telegram.ui.Components.gq0
                public final /* synthetic */ ir0 b;

                {
                    this.b = ir0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.I0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ir0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new qq0(ir0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new cq0(ir0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, ir0Var.getContext(), ir0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            e1Var3.setIconColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        e1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.z5.n(-1, 48));
        e1Var3.setOnClickListener(new bq0(ir0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, ir0Var.getContext(), ir0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            e1Var4.setIconColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        e1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.z5.n(-1, 48));
        e1Var4.setOnClickListener(new bq0(ir0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        ir0Var.J0 = m1Var;
        m1Var.b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        ir0Var.J0.setOutsideTouchable(true);
        ir0Var.J0.setClippingEnabled(true);
        ir0Var.J0.setInputMethodMode(2);
        ir0Var.J0.setSoftInputMode(0);
        ir0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        ir0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        ir0Var.J0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!ir0Var.keyboardVisible || (foVar = ir0Var.f0) == null || foVar.X0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : y1Var.getMeasuredHeight() + iArr[1]);
        ir0Var.J0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void q(ir0 ir0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        mq0 mq0Var;
        long j12;
        long j13;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = ir0Var.O;
        nq0 nq0Var = ir0Var.d;
        mq0 mq0Var2 = ir0Var.c;
        HashMap hashMap2 = ir0Var.V;
        Long l10 = 0L;
        a0.h hVar = ir0Var.U;
        ArrayList arrayList3 = ir0Var.N;
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
                boolean isMonoForum = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j14);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j14));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j14));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    mq0Var = mq0Var2;
                    j12 = j14;
                    j13 = 0;
                } else {
                    mq0Var = mq0Var2;
                    j12 = j14;
                    j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(ir0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (mq0Var.getTag() == null || nq0Var.a.length() <= 0) {
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
                    SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of3);
                }
                long j15 = j12;
                int sendMessage = SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(ir0Var.N, j15, !ir0Var.I0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j13, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j15));
                }
                if (hVar.m() == 1) {
                    tL_forumTopic = null;
                    g5.s0(sendMessage, ir0Var.f0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                mq0Var2 = mq0Var;
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
                ir0Var.S0(hVar, arrayList2.size(), hVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            uq0 uq0Var = ir0Var.W;
            int i15 = uq0Var != null ? uq0Var.e : 0;
            if (ir0Var.F0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < hVar.m()) {
                    long j16 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(ir0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (ir0Var.F0 != null) {
                        if (mq0Var2.getTag() != null && nq0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = ir0Var.F0;
                    } else if (mq0Var2.getTag() == null || nq0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j16, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j17);
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
                            messageObject = new MessageObject(ir0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (mq0Var2.getTag() == null || nq0Var.a.length() <= 0) {
                            j10 = j17;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j17, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j10 = j17;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    ir0Var.S0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            ir0Var.S0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
        }
        xq0 xq0Var = ir0Var.s0;
        if (xq0Var != null) {
            xq0Var.U();
        }
        ir0Var.dismiss();
    }

    public static void r(ir0 ir0Var, int i10) {
        TLRPC.Dialog dialog;
        o20 o20Var = ir0Var.y0;
        HashMap hashMap = ir0Var.V;
        a0.h hVar = ir0Var.U;
        ar0 ar0Var = ir0Var.K;
        fr0 fr0Var = ir0Var.L;
        if (fr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = ir0Var.C0;
            if (dialog2 == null) {
                return;
            }
            hVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            ir0Var.b1(2);
            if (ir0Var.L0 || ir0Var.M0) {
                if (((TLRPC.Dialog) ar0Var.e.f(dialog2.id)) == null) {
                    ar0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = ar0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                ar0Var.l();
                ir0Var.A0 = false;
                o20Var.r.setText("");
                ir0Var.L0(false);
            }
            for (int i11 = 0; i11 < ir0Var.Q0().getChildCount(); i11++) {
                View childAt = ir0Var.Q0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                    if (f7Var.getCurrentDialog() == ir0Var.C0.id) {
                        f7Var.d(null, false, true);
                        f7Var.b(true, true);
                    }
                }
            }
            ir0Var.M0();
            return;
        }
        TLRPC.TL_forumTopic E = fr0Var.E(i10);
        if (E == null || (dialog = ir0Var.C0) == null) {
            return;
        }
        long j10 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j10);
        TLRPC.Dialog dialog3 = ir0Var.C0;
        hVar.k(dialog3, j10);
        hashMap.put(dialog3, E);
        ir0Var.b1(2);
        if (ir0Var.L0 || ir0Var.M0) {
            if (((TLRPC.Dialog) ar0Var.e.f(dialog3.id)) == null) {
                ar0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = ar0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            ar0Var.l();
            ir0Var.A0 = false;
            o20Var.r.setText("");
            ir0Var.L0(false);
        }
        for (int i12 = 0; i12 < ir0Var.Q0().getChildCount(); i12++) {
            View childAt2 = ir0Var.Q0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                if (f7Var2.getCurrentDialog() == ir0Var.C0.id) {
                    f7Var2.d(E, isMonoForum, true);
                    f7Var2.b(true, true);
                }
            }
        }
        ir0Var.M0();
    }

    public static void t0(ir0 ir0Var) {
        kq0 kq0Var = ir0Var.F;
        kq0 kq0Var2 = ir0Var.G;
        mm0 mm0Var = ir0Var.E;
        if (ir0Var.r0) {
            return;
        }
        kq0 kq0Var3 = ir0Var.L0 ? kq0Var2 : kq0Var;
        if (kq0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = kq0Var3.getChildAt(0);
        for (int i10 = 0; i10 < kq0Var3.getChildCount(); i10++) {
            if (kq0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = kq0Var3.getChildAt(i10);
            }
        }
        wl0 wl0Var = (wl0) kq0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || wl0Var == null || wl0Var.b() != 0) ? 0 : top;
        if (top < 0 || wl0Var == null || wl0Var.b() != 0) {
            ir0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            ir0Var.U0(true);
            top = i11;
        } else {
            ir0Var.K0 = childAt.getTop();
            ir0Var.U0(false);
        }
        if (mm0Var.getVisibility() == 0) {
            if (mm0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = mm0Var.getChildAt(0);
            for (int i12 = 0; i12 < mm0Var.getChildCount(); i12++) {
                if (mm0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = mm0Var.getChildAt(i12);
                }
            }
            wl0 wl0Var2 = (wl0) mm0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || wl0Var2 == null || wl0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || wl0Var2 == null || wl0Var2.b() != 0) {
                ir0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                ir0Var.U0(true);
                top2 = i13;
            } else {
                ir0Var.K0 = childAt2.getTop();
                ir0Var.U0(false);
            }
            top = AndroidUtilities.lerp(top, top2, mm0Var.getAlpha());
        }
        int i14 = ir0Var.p0;
        if (i14 != top) {
            ir0Var.q0 = i14;
            float f7 = top;
            int i15 = (int) (ir0Var.t0 + f7);
            ir0Var.p0 = i15;
            kq0Var.setTopGlowOffset(i15);
            int i16 = (int) (ir0Var.t0 + f7);
            ir0Var.p0 = i16;
            kq0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + ir0Var.t0);
            ir0Var.p0 = i17;
            mm0Var.setTopGlowOffset(i17);
            ir0Var.b.setTranslationY(ir0Var.p0 + ir0Var.t0);
            ir0Var.Q.setTranslationY(ir0Var.p0 + ir0Var.t0);
            ir0Var.containerView.invalidate();
        }
    }

    public final void L0(boolean z10) {
        o20 o20Var = this.y0;
        di.g2 g2Var = o20Var.r;
        di.g2 g2Var2 = o20Var.r;
        boolean isEmpty = TextUtils.isEmpty(g2Var.getText());
        kq0 kq0Var = this.F;
        kq0 kq0Var2 = this.G;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && g2Var2.hasFocus()) || this.M0)) {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var2, true);
            }
        } else {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(kq0Var2, false);
            }
            z11 = false;
        }
        if (this.L0 != z11 || z10) {
            this.L0 = z11;
            er0 er0Var = this.M;
            er0Var.l();
            this.K.l();
            if (this.L0) {
                if (this.K0 == Integer.MAX_VALUE) {
                    ((s4.b0) kq0Var2.getLayoutManager()).h1(0, -kq0Var2.getPaddingTop());
                } else {
                    ((s4.b0) kq0Var2.getLayoutManager()).h1(0, this.K0 - kq0Var2.getPaddingTop());
                }
                er0Var.E(g2Var2.getText().toString());
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

    public final void M0() {
        TLRPC.Dialog dialog = this.C0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.C0 = null;
        for (int i10 = 0; i10 < Q0().getChildCount(); i10++) {
            View childAt = Q0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) childAt).getCurrentDialog() == dialog.id) {
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
        Q0().setVisibility(0);
        o20 o20Var = this.y0;
        o20Var.setVisibility(0);
        di.g2 g2Var = o20Var.r;
        if (this.L0 || this.M0) {
            this.D0.H.v = true;
            g2Var.requestFocus();
            AndroidUtilities.showKeyboard(g2Var);
        }
        int[] iArr = new int[2];
        o1.k kVar2 = new o1.k(new o1.j(1000.0f));
        o1.l lVar = new o1.l(0.0f);
        org.telegram.ui.fo foVar = this.f0;
        lVar.b((foVar == null || !foVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.B0 = kVar2;
        kVar2.b(new aq0(this, (org.telegram.ui.Cells.f7) view, iArr, 0));
        this.B0.a(new jb(this, 5));
        this.B0.h();
    }

    public final void N0() {
        boolean z10 = false;
        if (this.k0 == null && this.o0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", P0()));
            xq0 xq0Var = this.s0;
            if (xq0Var != null) {
                xq0Var.s0();
                return;
            }
            if (this.g0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.g0).D0(new i2.x(5, z10));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final String P0() {
        String str;
        String[] strArr = this.o0;
        uq0 uq0Var = this.W;
        if (uq0Var != null) {
            str = strArr[uq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        aq aqVar = this.e0;
        if (aqVar != null && aqVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.b0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str == null ? "" : str;
    }

    public final mm0 Q0() {
        return (this.L0 || this.M0) ? this.G : this.F;
    }

    public final void R0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        mm0 mm0Var = this.E;
        mm0Var.setPivotX(width);
        mm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        mm0Var.setScaleX(f11);
        mm0Var.setScaleY(f11);
        mm0Var.setAlpha(f7);
        mm0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        Q0.setScaleX(f12);
        Q0.setScaleY(f12);
        float f13 = 1.0f - f7;
        Q0.setAlpha(f13);
        o20 o20Var = this.y0;
        o20Var.setPivotX(o20Var.getWidth() / 2.0f);
        o20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        o20Var.setScaleX(f14);
        o20Var.setScaleY(f14);
        o20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        mm0Var.getLocationInWindow(iArr);
        float interpolation = es.g.getInterpolation(f7);
        for (int i10 = 0; i10 < Q0.getChildCount(); i10++) {
            View childAt = Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
            View childAt2 = mm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((mm0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        Q0.invalidate();
    }

    public final void U0(boolean z10) {
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
        animatorSetArr[0].addListener(new rq0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ir0 ir0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        dr0 dr0Var;
        if (dialog instanceof zq0) {
            T0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).n0)) {
            Y0(dialog.id, view);
            return;
        }
        mm0 mm0Var = this.E;
        if (mm0Var.getVisibility() != 8 || (activity = this.g0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.P;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    a2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.n0) {
                    a2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    a2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                i2.d.r(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
            a2Var2.R = string2;
            if (i10 == 3) {
                a2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                a2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                a2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            i2.d.r(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.U;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.V.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f7) {
                ((org.telegram.ui.Cells.f7) view).b(false, true);
            }
            b1(1);
            ir0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.C0 = dialog;
                this.I.h1(0, this.p0 - mm0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                pq0 pq0Var = new pq0(this, dialog, atomicReference, view);
                atomicReference.set(new org.telegram.ui.p6(this, atomicReference, pq0Var, dialog, 29));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(pq0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    pq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            ir0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(true, true);
            } else if (view instanceof org.telegram.ui.Cells.f7) {
                ((org.telegram.ui.Cells.f7) view).b(true, true);
            }
            b1(2);
            long j11 = UserConfig.getInstance(ir0Var.currentAccount).clientUserId;
            if (ir0Var.L0) {
                ar0 ar0Var = ir0Var.K;
                a0.h hVar2 = ar0Var.e;
                ArrayList arrayList = ar0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    ar0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                ar0Var.l();
                ir0Var.A0 = false;
                o20 o20Var = ir0Var.y0;
                o20Var.r.setText("");
                L0(false);
                AndroidUtilities.hideKeyboard(o20Var.r);
            }
        }
        er0 er0Var = ir0Var.M;
        if (er0Var == null || (dr0Var = er0Var.H) == null) {
            return;
        }
        dr0Var.q(0, dr0Var.h());
    }

    public final void W0(final boolean z10) {
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            a0.h hVar = this.U;
            int m10 = hVar.m();
            mq0 mq0Var = this.c;
            nq0 nq0Var = this.d;
            if (i12 >= m10) {
                Editable text = nq0Var.getText();
                qu quVar = nq0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                aq aqVar = this.e0;
                int i13 = (aqVar == null || !aqVar.a.q) ? -1 : this.b0;
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i10 = 0;
                    while (i11 < hVar.m()) {
                        long j10 = hVar.j(i11);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (mq0Var.getTag() != null && quVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    uq0 uq0Var = this.W;
                    int i14 = uq0Var != null ? uq0Var.e : 0;
                    if (this.F0 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j11 = hVar.j(i15);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            int i17 = i11;
                            if (this.F0 != null && mq0Var.getTag() != null && quVar.length() > 0 && charSequenceArr[i17] != null && sendPaidMessagesStars2 > 0) {
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
                        if (this.O[i14] != null) {
                            for (int i19 = 0; i19 < hVar.m(); i19++) {
                                long j12 = hVar.j(i19);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (mq0Var.getTag() != null && quVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                g5.b0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.hq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        ir0.q(ir0.this, charSequenceArr, entities, z10, i20, (HashMap) obj);
                    }
                });
                return;
            }
            if (g5.g(getContext(), this.currentAccount, hVar.j(i12), mq0Var.getTag() != null && nq0Var.a.length() > 0)) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void X0(boolean z10) {
        mq0 mq0Var = this.c;
        if (z10 == (mq0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        mq0Var.setTag(z10 ? 1 : null);
        nq0 nq0Var = this.d;
        if (nq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(nq0Var.getEditText());
        }
        nq0Var.k(true);
        FrameLayout frameLayout = this.c0;
        mq0 mq0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            mq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            mq0Var2.setVisibility(0);
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
        arrayList.add(ObjectAnimator.ofFloat(mq0Var, (Property<mq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, (Property<mq0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, (Property<mq0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, (Property<mq0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.y.addListener(new rq0(this, z10, 1));
        this.y.start();
    }

    public final void Y0(long j10, View view) {
        int i10 = -this.H0;
        this.H0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.v;
        (premiumFeaturesBlocked ? new zc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new zc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dq0(this, i11))).j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.o1 o1Var;
        mq0 mq0Var = this.c;
        if (mq0Var == null) {
            return;
        }
        nq0 nq0Var = this.d;
        if (nq0Var == null || !nq0Var.m()) {
            tq0 tq0Var = this.D0;
            if (tq0Var != null && (o1Var = tq0Var.H) != null && !o1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            nq0Var.getEmojiPaddingShown();
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
        mq0Var.setTranslationY(f11);
        this.f.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.h5 h5Var = this.s;
        if (h5Var != null) {
            String P0 = P0();
            if (P0.startsWith("https://")) {
                P0 = P0.substring(8);
            } else if (P0.startsWith("http://")) {
                P0 = P0.substring(7);
            }
            h5Var.k(P0);
        }
    }

    public final void b1(int i10) {
        a0.h hVar = this.U;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.N;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        nq0 nq0Var = this.d;
        if (tag != null && nq0Var.a.length() > 0) {
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
        ji.y1 y1Var = this.e;
        y1Var.g(max, z10);
        y1Var.i(size, j10, i10 != 0);
        X0(true);
        nq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            ar0 ar0Var = this.K;
            if (ar0Var != null) {
                ar0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        nq0 nq0Var = this.d;
        if (nq0Var != null) {
            AndroidUtilities.hideKeyboard(nq0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public void dismissInternal() {
        super.dismissInternal();
        nq0 nq0Var = this.d;
        if (nq0Var != null) {
            nq0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        if (this.C0 != null) {
            M0();
            return;
        }
        nq0 nq0Var = this.d;
        if (nq0Var == null || !nq0Var.e) {
            super.onBackPressed();
        } else {
            nq0Var.k(true);
        }
    }

    public ir0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0816  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir0(Context context, org.telegram.ui.fo foVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, true);
        int i10;
        float f7;
        float f10;
        kq0 kq0Var;
        kq0 kq0Var2;
        int i11;
        LinearLayout linearLayout;
        final int i12 = 1;
        String[] strArr = new String[2];
        this.O = strArr;
        this.S = new View[2];
        this.T = new AnimatorSet[2];
        this.U = new a0.h();
        this.V = new HashMap();
        this.X = -1;
        final int i13 = 0;
        this.Y = false;
        new RectF();
        new Paint(1);
        this.j0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.o0 = strArr2;
        this.E0 = new ArrayList();
        int i14 = 4;
        while (true) {
            if (i14 >= 32) {
                i10 = 80;
                break;
            }
            i10 = (1 << i14) - 12;
            if (80 <= i10) {
                break;
            } else {
                i14++;
            }
        }
        int i15 = i10 / 8;
        long[] jArr = new long[i15];
        Object[] objArr = new Object[i15];
        this.G0 = i0.b.e;
        this.H0 = 4;
        this.I0 = true;
        this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.Y0 = arrayList2;
        RectF rectF = new RectF();
        this.Z0 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        gh.c cVar = new gh.c();
        int i16 = org.telegram.ui.ActionBar.g6.d6;
        cVar.a(getThemedColor(i16));
        int i17 = 10;
        if (Build.VERSION.SDK_INT >= 31) {
            this.O0 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.Q0 = dVar;
            dVar.k(new m.h(this, i17));
            gh.d dVar2 = new gh.d(null);
            this.P0 = dVar2;
            dVar2.k(new m.l(this));
            bh.b bVar = new bh.b(dVar);
            this.R0 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.S0 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
        } else {
            this.O0 = null;
            this.P0 = null;
            this.Q0 = null;
            this.R0 = new bh.b(cVar);
            this.S0 = new bh.b(cVar);
        }
        this.T0 = new bh.b(cVar);
        this.resourcesProvider = c6Var;
        this.Z = z13;
        this.g0 = AndroidUtilities.findActivity(context);
        this.h0 = z12;
        if (z12) {
            this.resourcesProvider = new bi.s0(i12);
        }
        cVar.a(getThemedColor(i16));
        this.f0 = foVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.R = mutate;
        int i18 = org.telegram.ui.ActionBar.g6.h5;
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
                a1.g.A(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a1.g.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.N = arrayList;
        this.M = new er0(this, context);
        this.n0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.i0(this, i12));
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                MessageObject messageObject2 = (MessageObject) this.N.get(i19);
                if (messageObject2.isTodo()) {
                    this.P = 3;
                } else if (messageObject2.isPoll()) {
                    int i20 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.P = i20;
                    if (i20 == 2) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.to(13, this, context));
        }
        tq0 tq0Var = new tq0(this, context);
        this.D0 = tq0Var;
        this.containerView = tq0Var;
        bh.b bVar3 = this.R0;
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar3.f = jVar;
        bVar3.g = viewGroup;
        bh.b bVar4 = this.S0;
        ih.j jVar2 = new ih.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.f = jVar2;
        bVar4.g = viewGroup2;
        bh.b bVar5 = this.T0;
        ih.j jVar3 = new ih.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.f = jVar3;
        bVar5.g = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i21 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i21, 0, i21, this.G0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int i22 = org.telegram.ui.ActionBar.g6.h5;
        frameLayout.setBackgroundColor(getThemedColor(i22));
        if (this.h0 && this.o0[1] != null) {
            uq0 uq0Var = new uq0(this, context);
            this.W = uq0Var;
            frameLayout.addView(uq0Var, w7.z5.a(36.0f, 0.0f, 11.0f, 0.0f, 0.0f, -1, 51));
        }
        o20 o20Var = new o20(context, this.resourcesProvider);
        this.y0 = o20Var;
        vq0 vq0Var = new vq0(this);
        di.g2 g2Var = o20Var.r;
        g2Var.addTextChangedListener(vq0Var);
        g2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        int i23 = 7;
        g2Var.setOnEditorActionListener(new e1(this, i23));
        o20Var.setCloseButtonOnClickListener(new dq0(this, i13));
        frameLayout.addView(o20Var, w7.z5.a(40.0f, 11.0f, 7.0f, 11.0f, 11.0f, -1, 83));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.z0 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i24 = org.telegram.ui.ActionBar.g6.j5;
        kVar.setTitleColor(getThemedColor(i24));
        kVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.q5));
        kVar.D(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.z6, false), false);
        kVar.C(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 14));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, w7.z5.e(-1, 58, 83));
        mm0 mm0Var = new mm0(context, this.resourcesProvider);
        this.E = mm0Var;
        s4.s sVar = new s4.s(4);
        this.I = sVar;
        mm0Var.setLayoutManager(sVar);
        sVar.O = new lq0(this, 2);
        mm0Var.setOnScrollListener(new jq0(this, i13));
        fr0 fr0Var = new fr0(this, context);
        this.L = fr0Var;
        mm0Var.setAdapter(fr0Var);
        int i25 = org.telegram.ui.ActionBar.g6.A5;
        mm0Var.setGlowColor(getThemedColor(i25));
        mm0Var.setVerticalScrollBarEnabled(false);
        mm0Var.setHorizontalScrollBarEnabled(false);
        mm0Var.setOverScrollMode(2);
        mm0Var.setSelectorDrawableColor(0);
        mm0Var.setItemSelectorColorProvider(new co0(4));
        mm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        mm0Var.setClipToPadding(false);
        mm0Var.i(new bi.o(5));
        mm0Var.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.eq0
            public final /* synthetic */ ir0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        ir0.r(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            ir0 ir0Var = this.b;
                            ArrayList arrayList3 = ir0Var.K.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                ir0Var.V0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            ir0 ir0Var2 = this.b;
                            er0 er0Var = ir0Var2.M;
                            ir0 ir0Var3 = er0Var.K;
                            int i28 = er0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < er0Var.d.size()) {
                                        tL_dialog2 = ((wq0) er0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - er0Var.d.size();
                                        ArrayList arrayList4 = er0Var.e.d;
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
                                    ir0Var2.V0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < ir0Var3.E0.size()) {
                                    TLObject tLObject2 = ((hg.g0) ir0Var3.E0.get(i30)).a;
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
        mm0Var.setVisibility(8);
        this.containerView.addView(mm0Var, w7.z5.e(-1, -1, 51));
        kq0 kq0Var3 = new kq0(this, context, this.resourcesProvider, i13);
        this.F = kq0Var3;
        kq0Var3.setSelectorDrawableColor(0);
        kq0Var3.setItemSelectorColorProvider(new co0(4));
        kq0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        kq0Var3.setClipToPadding(false);
        getContext();
        s4.s sVar2 = new s4.s(4);
        this.H = sVar2;
        kq0Var3.setLayoutManager(sVar2);
        this.U0 = new bh.l(kq0Var3, this.containerView, new fq0(kq0Var3, i13));
        sVar2.O = new lq0(this, i13);
        kq0Var3.setHorizontalScrollBarEnabled(false);
        kq0Var3.setVerticalScrollBarEnabled(false);
        kq0Var3.setOverScrollMode(2);
        kq0Var3.i(new bi.o(6));
        this.containerView.addView(kq0Var3, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ar0 ar0Var = new ar0(this, context);
        this.K = ar0Var;
        kq0Var3.setAdapter(ar0Var);
        kq0Var3.setGlowColor(getThemedColor(i25));
        kq0Var3.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.eq0
            public final /* synthetic */ ir0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i12) {
                    case 0:
                        ir0.r(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            ir0 ir0Var = this.b;
                            ArrayList arrayList3 = ir0Var.K.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                ir0Var.V0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            ir0 ir0Var2 = this.b;
                            er0 er0Var = ir0Var2.M;
                            ir0 ir0Var3 = er0Var.K;
                            int i28 = er0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < er0Var.d.size()) {
                                        tL_dialog2 = ((wq0) er0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - er0Var.d.size();
                                        ArrayList arrayList4 = er0Var.e.d;
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
                                    ir0Var2.V0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < ir0Var3.E0.size()) {
                                    TLObject tLObject2 = ((hg.g0) ir0Var3.E0.get(i30)).a;
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
        kq0Var3.setOnScrollListener(new jq0(this, i12));
        kq0 kq0Var4 = new kq0(this, context, this.resourcesProvider, i12);
        this.G = kq0Var4;
        kq0Var4.setItemSelectorColorProvider(new co0(4));
        kq0Var4.setSelectorDrawableColor(0);
        kq0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        kq0Var4.setClipToPadding(false);
        getContext();
        a00 a00Var = new a00(4, 0, kq0Var4);
        this.J = a00Var;
        kq0Var4.setLayoutManager(a00Var);
        a00Var.O = new lq0(this, i12);
        final int i26 = 2;
        kq0Var4.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.eq0
            public final /* synthetic */ ir0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i262, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i26) {
                    case 0:
                        ir0.r(this.b, i262);
                        break;
                    case 1:
                        if (i262 >= 0) {
                            ir0 ir0Var = this.b;
                            ArrayList arrayList3 = ir0Var.K.d;
                            int i27 = i262 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                ir0Var.V0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i262 >= 0) {
                            ir0 ir0Var2 = this.b;
                            er0 er0Var = ir0Var2.M;
                            ir0 ir0Var3 = er0Var.K;
                            int i28 = er0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i262 < i28 || i28 < 0) {
                                int i29 = i262 - 1;
                                if (i29 >= 0) {
                                    if (i29 < er0Var.d.size()) {
                                        tL_dialog2 = ((wq0) er0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - er0Var.d.size();
                                        ArrayList arrayList4 = er0Var.e.d;
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
                                    ir0Var2.V0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i262 - i28;
                                if (i30 >= 0 && i30 < ir0Var3.E0.size()) {
                                    TLObject tLObject2 = ((hg.g0) ir0Var3.E0.get(i30)).a;
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
        kq0Var4.setHasFixedSize(true);
        kq0Var4.setItemAnimator(null);
        kq0Var4.setHorizontalScrollBarEnabled(false);
        kq0Var4.setVerticalScrollBarEnabled(false);
        kq0Var4.setOnScrollListener(new jq0(this, i26));
        kq0Var4.i(new bi.o(i23));
        kq0Var4.setAdapter(this.M);
        kq0Var4.setGlowColor(getThemedColor(i25));
        this.x0 = new rl0(kq0Var4, true);
        f10 f10Var = new f10(context, this.resourcesProvider);
        f10Var.setViewType(12);
        wx0 wx0Var = new wx0(context, f10Var, 1, this.resourcesProvider);
        this.Q = wx0Var;
        wx0Var.addView(f10Var, 0);
        wx0Var.setAnimateLayoutChange(true);
        wx0Var.e(false, false);
        boolean z14 = this.h0;
        wh.n nVar = wx0Var.d;
        if (z14) {
            nVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ng));
        }
        nVar.setText(LocaleController.getString(R.string.NoResult));
        kq0Var4.setEmptyView(wx0Var);
        kq0Var4.setHideIfEmpty(false);
        kq0Var4.W1 = true;
        kq0Var4.X1 = 0;
        this.containerView.addView(wx0Var, w7.z5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(kq0Var4, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        di.ab abVar = new di.ab(this, context, 21);
        this.n = abVar;
        this.containerView.addView(abVar, w7.z5.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.h0 || this.o0[1] == null) ? 58.0f : 111.0f);
        this.S[0] = new View(context);
        View view = this.S[0];
        int i27 = org.telegram.ui.ActionBar.g6.V5;
        view.setBackgroundColor(getThemedColor(i27));
        this.S[0].setAlpha(0.0f);
        this.S[0].setTag(1);
        this.containerView.addView(this.S[0], layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, (!this.h0 || this.o0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.S[1] = new View(context);
        this.S[1].setBackgroundColor(getThemedColor(i27));
        this.S[1].setLayoutParams(layoutParams2);
        if (!this.n0 && this.o0[0] == null) {
            this.S[1].setAlpha(0.0f);
            kq0Var = kq0Var3;
            kq0Var2 = kq0Var4;
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
                frameLayout2.addView(frameLayout3, w7.z5.a(-1.0f, -2.0f, 0.0f, -2.0f, 0.0f, -1, 119));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, w7.z5.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                w7.b6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new bq0(this, 3));
                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                this.s = h5Var;
                h5Var.setTextSize(15);
                h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Tk));
                h5Var.setEllipsizeByGradient(true);
                a1();
                linearLayout3.addView(h5Var, w7.z5.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i28 = org.telegram.ui.ActionBar.g6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i28), 4, 4));
                linearLayout3.addView(textView, w7.z5.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new bq0(this, 4));
                w7.b6.a(textView);
                kq0Var = kq0Var3;
                kq0Var2 = kq0Var4;
                this.containerView.addView(frameLayout2, w7.z5.e(-1, 58, 83));
                ArrayList arrayList3 = this.N;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i29 = 0;
                        linearLayout = org.telegram.messenger.sk.e(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iq0
                            public final /* synthetic */ ir0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i29) {
                                    case 0:
                                        ir0 ir0Var = this.b;
                                        org.telegram.ui.ActionBar.m2 m2Var = ir0Var.f0;
                                        if (m2Var == null) {
                                            m2Var = LaunchActivity.U();
                                        }
                                        if (m2Var != null) {
                                            ir0Var.dismiss();
                                            m2Var.presentFragment(new org.telegram.ui.pj0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        ir0 ir0Var2 = this.b;
                                        org.telegram.ui.ActionBar.m2 m2Var2 = ir0Var2.f0;
                                        if (m2Var2 == null) {
                                            m2Var2 = LaunchActivity.U();
                                        }
                                        if (m2Var2 != null) {
                                            ir0Var2.dismiss();
                                            m2Var2.presentFragment(new org.telegram.ui.pj0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i28), 6, 6));
                        w7.b6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i30 = org.telegram.ui.ActionBar.g6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i30), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, w7.z5.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i30));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, w7.z5.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i11 = 8;
                        linearLayout2.addView(linearLayout3, w7.z5.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, w7.z5.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                i11 = 11;
                linearLayout = null;
                linearLayout2.addView(linearLayout3, w7.z5.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                if (linearLayout != null) {
                }
            } else {
                kq0Var = kq0Var3;
                kq0Var2 = kq0Var4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.z5.a(-1.0f, -2.0f, 0.0f, -2.0f, 0.0f, -1, 119));
                TextView textView3 = new TextView(context);
                int i31 = org.telegram.ui.ActionBar.g6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i31), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.h0 && this.o0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new bq0(this, 5));
                frameLayout5.addView(textView3, w7.z5.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, w7.z5.e(-1, 58, 87));
                ArrayList arrayList4 = this.N;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.g6.eg : i31), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, w7.z5.a(48.0f, 6.0f, 0.0f, -6.0f, 0.0f, -2, 85));
                        final int i32 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iq0
                            public final /* synthetic */ ir0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i32) {
                                    case 0:
                                        ir0 ir0Var = this.b;
                                        org.telegram.ui.ActionBar.m2 m2Var = ir0Var.f0;
                                        if (m2Var == null) {
                                            m2Var = LaunchActivity.U();
                                        }
                                        if (m2Var != null) {
                                            ir0Var.dismiss();
                                            m2Var.presentFragment(new org.telegram.ui.pj0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        ir0 ir0Var2 = this.b;
                                        org.telegram.ui.ActionBar.m2 m2Var2 = ir0Var2.f0;
                                        if (m2Var2 == null) {
                                            m2Var2 = LaunchActivity.U();
                                        }
                                        if (m2Var2 != null) {
                                            ir0Var2.dismiss();
                                            m2Var2.presentFragment(new org.telegram.ui.pj0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, w7.z5.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, w7.z5.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f, -1, 87));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        mq0 mq0Var = new mq0(this, context, 0);
        this.c = mq0Var;
        mq0Var.setWillNotDraw(false);
        mq0Var.setAlpha(0.0f);
        mq0Var.setVisibility(4);
        this.containerView.addView(mq0Var, w7.z5.a(-2.0f, -2.0f, 0.0f, -2.0f, 0.0f, -1, 83));
        mq0Var.setOnTouchListener(new ci.d(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i22)) > 0.721f);
        nq0 nq0Var = new nq0(this, context, tq0Var, this.resourcesProvider);
        this.d = nq0Var;
        nq0Var.J = true;
        if (this.h0) {
            nu editText = nq0Var.getEditText();
            int i33 = org.telegram.ui.ActionBar.g6.ng;
            editText.setTextColor(getThemedColor(i33));
            nq0Var.getEditText().setCursorColor(getThemedColor(i33));
        }
        nq0Var.setHint(LocaleController.getString(R.string.ShareComment));
        nq0Var.s();
        nq0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        mq0Var.addView(nq0Var, w7.z5.e(-1, -2, 51));
        mq0Var.setClipChildren(false);
        mq0Var.setClipToPadding(false);
        nq0Var.setClipChildren(false);
        nq0Var.getEditText().addTextChangedListener(new di.h2(this, 12));
        mq0 mq0Var2 = new mq0(this, context, 1);
        this.f = mq0Var2;
        mq0Var2.setFocusable(true);
        mq0Var2.setFocusableInTouchMode(true);
        mq0Var2.setVisibility(4);
        mq0Var2.setScaleX(0.2f);
        mq0Var2.setScaleY(0.2f);
        mq0Var2.setAlpha(0.0f);
        this.containerView.addView(mq0Var2, w7.z5.e(110, 50, 85));
        ji.y1 y1Var = new ji.y1(this, context, R.drawable.send_plane_24, this.resourcesProvider, 2);
        this.e = y1Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        y1Var.I = dp;
        y1Var.J = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        y1Var.M = dp3;
        y1Var.N = dp4;
        y1Var.h0 = true;
        mq0Var2.addView(y1Var, w7.z5.g());
        y1Var.setOnClickListener(new bq0(this, 6));
        y1Var.setOnLongClickListener(new y10(this, 2));
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
            linearLayout5.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 6, 6));
            aq aqVar = new aq(context, 24, this.resourcesProvider);
            this.e0 = aqVar;
            aqVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
            aqVar.setDrawUnchecked(true);
            aqVar.a(false, false);
            aqVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(aqVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i24));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
            w7.b6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new bq0(this, 0));
            frameLayout8.addView(linearLayout5, w7.z5.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d7));
                frameLayout8.addView(view2, w7.z5.b(-1.0f, this.h0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, w7.z5.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        bh.c cVar2 = new bh.c(this.T0.c(abVar, null, false));
        this.W0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        dh.d c10 = this.S0.c(this.D0, fh.b.e(this.resourcesProvider), false);
        this.V0 = c10;
        c10.m = true;
        c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.u(AndroidUtilities.dp(32.0f));
        c10.j.g = 0.4f;
        c10.k();
        dh.d c11 = this.R0.c(mq0Var, fh.b.e(this.resourcesProvider), false);
        this.X0 = c11;
        c11.q(AndroidUtilities.dp(f10));
        c11.p(AndroidUtilities.dp(9.0f));
        mq0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            dh.d c12 = this.R0.c(frameLayout9, fh.b.e(this.resourcesProvider), false);
            c12.p(AndroidUtilities.dp(9.0f));
            c12.q(AndroidUtilities.dp(f10));
            this.r.setBackground(c12);
            this.r.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.c0;
        if (frameLayout10 != null) {
            dh.d c13 = this.R0.c(frameLayout10, fh.b.e(this.resourcesProvider), false);
            c13.p(AndroidUtilities.dp(9.0f));
            c13.q(AndroidUtilities.dp(f10));
            this.c0.setBackground(c13);
            this.c0.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        b1(0);
        org.telegram.ui.yy.g4(AccountInstance.getInstance(this.currentAccount));
        if (ar0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i34 = this.currentAccount;
        int i35 = 0;
        MessagesStorage.getInstance(i34).getStorageQueue().postRunnable(new hg.n(i34, i35, new oq0(this), i35));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(kq0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(kq0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.c3 container = getContainer();
        cq0 cq0Var = new cq0(this, i35);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(container, cq0Var);
    }

    public void T0(View view) {
    }

    public void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
