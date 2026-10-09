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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class mr0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final xq0 D0;
    public final qm0 E;
    public ArrayList E0;
    public final oq0 F;
    public TL_stories.StoryItem F0;
    public final oq0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final e00 J;
    public org.telegram.ui.ActionBar.n1 J0;
    public final er0 K;
    public int K0;
    public final jr0 L;
    public boolean L0;
    public final ir0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final ah.h O0;
    public final int P;
    public final fh.d P0;
    public final ay0 Q;
    public final fh.d Q0;
    public final Drawable R;
    public final ah.c R0;
    public final View[] S;
    public final ah.c S0;
    public final AnimatorSet[] T;
    public final ah.c T0;
    public final a0.i U;
    public final ah.n U0;
    public final HashMap V;
    public final ch.d V0;
    public final yq0 W;
    public final ah.d W0;
    public int X;
    public final ch.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean a0;
    public final FrameLayout b;
    public final int b0;
    public final qq0 c;
    public final FrameLayout c0;
    public final rq0 d;
    public final LinearLayout d0;
    public final ii.z1 e;
    public final dq e0;
    public final qq0 f;
    public final org.telegram.ui.zn f0;
    public final Activity g0;
    public final FrameLayout h;
    public final boolean h0;
    public boolean i0;
    public final TextPaint j0;
    public TLRPC.TL_exportedMessageLink k0;
    public boolean l0;
    public boolean m0;
    public final ci.bb n;
    public final boolean n0;
    public final String[] o0;
    public int p0;
    public int q0;
    public final FrameLayout r;
    public boolean r0;
    public final org.telegram.ui.ActionBar.j5 s;
    public br0 s0;
    public float t0;
    public float u0;
    public final FrameLayout v;
    public float v0;
    public final FrameLayout w;
    public ValueAnimator w0;
    public final LinearLayout x;
    public final vl0 x0;
    public AnimatorSet y;
    public final s20 y0;
    public final org.telegram.ui.ActionBar.k z0;

    public mr0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, e6Var);
    }

    public static void B0(mr0 mr0Var) {
        RectF rectF = mr0Var.Z0;
        ah.h hVar = mr0Var.O0;
        if (Build.VERSION.SDK_INT < 31 || hVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, mr0Var.containerView.getMeasuredWidth(), mr0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        hVar.g(1, mr0Var.Y0);
        hVar.e(mr0Var.U0, mr0Var.containerView.getMeasuredWidth(), mr0Var.containerView.getMeasuredHeight());
    }

    public static int G0(mr0 mr0Var) {
        oq0 oq0Var = mr0Var.F;
        if (oq0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = oq0Var.getChildAt(0);
        am0 am0Var = (am0) oq0Var.G(childAt);
        if (am0Var == null) {
            return -1000;
        }
        int paddingTop = oq0Var.getPaddingTop();
        if (am0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static mr0 O0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new mr0(context, messageObject != null ? org.telegram.messenger.q.k(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static /* synthetic */ void o(mr0 mr0Var, AtomicReference atomicReference, tq0 tq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        tq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, mr0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean p(final mr0 mr0Var) {
        org.telegram.ui.zn znVar;
        ii.z1 z1Var = mr0Var.e;
        boolean z10 = mr0Var.h0;
        Activity activity = mr0Var.g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(mr0Var.getContext());
        linearLayout.setOrientation(1);
        if (mr0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, mr0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new uq0(mr0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new gq0(mr0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, mr0Var.getContext(), mr0Var.resourcesProvider, true, false);
            if (z10) {
                f1Var.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
            f1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            mr0Var.I0 = true;
            f1Var.setChecked(true);
            final org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, mr0Var.getContext(), mr0Var.resourcesProvider, false, true);
            if (z10) {
                f1Var2.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
            f1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            f1Var2.setChecked(!mr0Var.I0);
            final int i10 = 0;
            f1Var.setOnClickListener(new View.OnClickListener(mr0Var) { // from class: org.telegram.ui.Components.kq0
                public final /* synthetic */ mr0 b;

                {
                    this.b = mr0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            f1Var2.setOnClickListener(new View.OnClickListener(mr0Var) { // from class: org.telegram.ui.Components.kq0
                public final /* synthetic */ mr0 b;

                {
                    this.b = mr0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, mr0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new uq0(mr0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new gq0(mr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, mr0Var.getContext(), mr0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var3.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            f1Var3.setIconColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        f1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var3, w7.x5.n(-1, 48));
        f1Var3.setOnClickListener(new fq0(mr0Var, 1));
        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, mr0Var.getContext(), mr0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var4.setTextColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            f1Var4.setIconColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        f1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var4, w7.x5.n(-1, 48));
        f1Var4.setOnClickListener(new fq0(mr0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.n(-1, -2));
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        mr0Var.J0 = n1Var;
        n1Var.b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        mr0Var.J0.setOutsideTouchable(true);
        mr0Var.J0.setClippingEnabled(true);
        mr0Var.J0.setInputMethodMode(2);
        mr0Var.J0.setSoftInputMode(0);
        mr0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        mr0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        z1Var.getLocationInWindow(iArr);
        mr0Var.J0.showAtLocation(z1Var, 51, AndroidUtilities.dp(8.0f) + ((z1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!mr0Var.keyboardVisible || (znVar = mr0Var.f0) == null || znVar.X0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : z1Var.getMeasuredHeight() + iArr[1]);
        mr0Var.J0.b();
        try {
            z1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void q(mr0 mr0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        qq0 qq0Var;
        long j11;
        long j12;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = mr0Var.O;
        rq0 rq0Var = mr0Var.d;
        qq0 qq0Var2 = mr0Var.c;
        HashMap hashMap2 = mr0Var.V;
        Long l10 = 0L;
        a0.i iVar = mr0Var.U;
        ArrayList arrayList3 = mr0Var.N;
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
                boolean isMonoForum = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j13);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j13));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j13));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    qq0Var = qq0Var2;
                    j11 = j13;
                    j12 = 0;
                } else {
                    qq0Var = qq0Var2;
                    j11 = j13;
                    j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(mr0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (qq0Var.getTag() == null || rq0Var.a.length() <= 0) {
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
                    SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of3);
                }
                long j14 = j11;
                int sendMessage = SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(mr0Var.N, j14, !mr0Var.I0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j12, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j14));
                }
                if (iVar.m() == 1) {
                    tL_forumTopic = null;
                    g5.s0(sendMessage, mr0Var.f0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                qq0Var2 = qq0Var;
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
                mr0Var.S0(iVar, arrayList2.size(), iVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            yq0 yq0Var = mr0Var.W;
            int i15 = yq0Var != null ? yq0Var.e : 0;
            if (mr0Var.F0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < iVar.m()) {
                    long j15 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j15);
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
                        messageObject2 = new MessageObject(mr0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (mr0Var.F0 != null) {
                        if (qq0Var2.getTag() != null && rq0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j15, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = mr0Var.F0;
                    } else if (qq0Var2.getTag() == null || rq0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j15, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j10;
                    SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j16);
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
                            messageObject = new MessageObject(mr0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (qq0Var2.getTag() == null || rq0Var.a.length() <= 0) {
                            j3 = j16;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j16, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j3 = j16;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j3, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(mr0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    mr0Var.S0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            mr0Var.S0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
        }
        br0 br0Var = mr0Var.s0;
        if (br0Var != null) {
            br0Var.P();
        }
        mr0Var.dismiss();
    }

    public static void r(mr0 mr0Var, int i10) {
        TLRPC.Dialog dialog;
        s20 s20Var = mr0Var.y0;
        HashMap hashMap = mr0Var.V;
        a0.i iVar = mr0Var.U;
        er0 er0Var = mr0Var.K;
        jr0 jr0Var = mr0Var.L;
        if (jr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = mr0Var.C0;
            if (dialog2 == null) {
                return;
            }
            iVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            mr0Var.b1(2);
            if (mr0Var.L0 || mr0Var.M0) {
                if (((TLRPC.Dialog) er0Var.e.f(dialog2.id)) == null) {
                    er0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = er0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                er0Var.l();
                mr0Var.A0 = false;
                s20Var.r.setText("");
                mr0Var.L0(false);
            }
            for (int i11 = 0; i11 < mr0Var.Q0().getChildCount(); i11++) {
                View childAt = mr0Var.Q0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getCurrentDialog() == mr0Var.C0.id) {
                        g7Var.d(null, false, true);
                        g7Var.b(true, true);
                    }
                }
            }
            mr0Var.M0();
            return;
        }
        TLRPC.TL_forumTopic E = jr0Var.E(i10);
        if (E == null || (dialog = mr0Var.C0) == null) {
            return;
        }
        long j3 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(mr0Var.currentAccount).isMonoForum(j3);
        TLRPC.Dialog dialog3 = mr0Var.C0;
        iVar.k(dialog3, j3);
        hashMap.put(dialog3, E);
        mr0Var.b1(2);
        if (mr0Var.L0 || mr0Var.M0) {
            if (((TLRPC.Dialog) er0Var.e.f(dialog3.id)) == null) {
                er0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = er0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            er0Var.l();
            mr0Var.A0 = false;
            s20Var.r.setText("");
            mr0Var.L0(false);
        }
        for (int i12 = 0; i12 < mr0Var.Q0().getChildCount(); i12++) {
            View childAt2 = mr0Var.Q0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                if (g7Var2.getCurrentDialog() == mr0Var.C0.id) {
                    g7Var2.d(E, isMonoForum, true);
                    g7Var2.b(true, true);
                }
            }
        }
        mr0Var.M0();
    }

    public static void t0(mr0 mr0Var) {
        oq0 oq0Var = mr0Var.F;
        oq0 oq0Var2 = mr0Var.G;
        qm0 qm0Var = mr0Var.E;
        if (mr0Var.r0) {
            return;
        }
        oq0 oq0Var3 = mr0Var.L0 ? oq0Var2 : oq0Var;
        if (oq0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = oq0Var3.getChildAt(0);
        for (int i10 = 0; i10 < oq0Var3.getChildCount(); i10++) {
            if (oq0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = oq0Var3.getChildAt(i10);
            }
        }
        am0 am0Var = (am0) oq0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || am0Var == null || am0Var.b() != 0) ? 0 : top;
        if (top < 0 || am0Var == null || am0Var.b() != 0) {
            mr0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            mr0Var.U0(true);
            top = i11;
        } else {
            mr0Var.K0 = childAt.getTop();
            mr0Var.U0(false);
        }
        if (qm0Var.getVisibility() == 0) {
            if (qm0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = qm0Var.getChildAt(0);
            for (int i12 = 0; i12 < qm0Var.getChildCount(); i12++) {
                if (qm0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = qm0Var.getChildAt(i12);
                }
            }
            am0 am0Var2 = (am0) qm0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || am0Var2 == null || am0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || am0Var2 == null || am0Var2.b() != 0) {
                mr0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                mr0Var.U0(true);
                top2 = i13;
            } else {
                mr0Var.K0 = childAt2.getTop();
                mr0Var.U0(false);
            }
            top = AndroidUtilities.lerp(top, top2, qm0Var.getAlpha());
        }
        int i14 = mr0Var.p0;
        if (i14 != top) {
            mr0Var.q0 = i14;
            float f7 = top;
            int i15 = (int) (mr0Var.t0 + f7);
            mr0Var.p0 = i15;
            oq0Var.setTopGlowOffset(i15);
            int i16 = (int) (mr0Var.t0 + f7);
            mr0Var.p0 = i16;
            oq0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + mr0Var.t0);
            mr0Var.p0 = i17;
            qm0Var.setTopGlowOffset(i17);
            mr0Var.b.setTranslationY(mr0Var.p0 + mr0Var.t0);
            mr0Var.Q.setTranslationY(mr0Var.p0 + mr0Var.t0);
            mr0Var.containerView.invalidate();
        }
    }

    public final void L0(boolean z10) {
        s20 s20Var = this.y0;
        ci.g2 g2Var = s20Var.r;
        ci.g2 g2Var2 = s20Var.r;
        boolean isEmpty = TextUtils.isEmpty(g2Var.getText());
        oq0 oq0Var = this.F;
        oq0 oq0Var2 = this.G;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && g2Var2.hasFocus()) || this.M0)) {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var2, true);
            }
        } else {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(oq0Var2, false);
            }
            z11 = false;
        }
        if (this.L0 != z11 || z10) {
            this.L0 = z11;
            ir0 ir0Var = this.M;
            ir0Var.l();
            this.K.l();
            if (this.L0) {
                if (this.K0 == Integer.MAX_VALUE) {
                    ((s4.d0) oq0Var2.getLayoutManager()).h1(0, -oq0Var2.getPaddingTop());
                } else {
                    ((s4.d0) oq0Var2.getLayoutManager()).h1(0, this.K0 - oq0Var2.getPaddingTop());
                }
                ir0Var.E(g2Var2.getText().toString());
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
            if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.id) {
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
        s20 s20Var = this.y0;
        s20Var.setVisibility(0);
        ci.g2 g2Var = s20Var.r;
        if (this.L0 || this.M0) {
            this.D0.H.v = true;
            g2Var.requestFocus();
            AndroidUtilities.showKeyboard(g2Var);
        }
        int[] iArr = new int[2];
        o1.k kVar2 = new o1.k(new o1.j(1000.0f));
        o1.l lVar = new o1.l(0.0f);
        org.telegram.ui.zn znVar = this.f0;
        lVar.b((znVar == null || !znVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.B0 = kVar2;
        kVar2.b(new eq0(this, (org.telegram.ui.Cells.g7) view, iArr, 0));
        this.B0.a(new kb(this, 5));
        this.B0.h();
    }

    public final void N0() {
        boolean z10 = false;
        if (this.k0 == null && this.o0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", P0()));
            br0 br0Var = this.s0;
            if (br0Var != null) {
                br0Var.q0();
                return;
            }
            if (this.g0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.g0).D0(new i2.y(5, z10));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final String P0() {
        String str;
        String[] strArr = this.o0;
        yq0 yq0Var = this.W;
        if (yq0Var != null) {
            str = strArr[yq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        dq dqVar = this.e0;
        if (dqVar != null && dqVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.b0)).build().toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return str == null ? "" : str;
    }

    public final qm0 Q0() {
        return (this.L0 || this.M0) ? this.G : this.F;
    }

    public final void R0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        qm0 qm0Var = this.E;
        qm0Var.setPivotX(width);
        qm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        qm0Var.setScaleX(f11);
        qm0Var.setScaleY(f11);
        qm0Var.setAlpha(f7);
        qm0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        Q0.setScaleX(f12);
        Q0.setScaleY(f12);
        float f13 = 1.0f - f7;
        Q0.setAlpha(f13);
        s20 s20Var = this.y0;
        s20Var.setPivotX(s20Var.getWidth() / 2.0f);
        s20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        s20Var.setScaleX(f14);
        s20Var.setScaleY(f14);
        s20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        qm0Var.getLocationInWindow(iArr);
        float interpolation = hs.g.getInterpolation(f7);
        for (int i10 = 0; i10 < Q0.getChildCount(); i10++) {
            View childAt = Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
            View childAt2 = qm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((qm0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
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
        animatorSetArr[0].addListener(new vq0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        mr0 mr0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        hr0 hr0Var;
        if (dialog instanceof dr0) {
            T0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).n0)) {
            Y0(dialog.id, view);
            return;
        }
        qm0 qm0Var = this.E;
        if (qm0Var.getVisibility() != 8 || (activity = this.g0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.P;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    b2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.n0) {
                    b2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                hg.c.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            if (i10 == 3) {
                b2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                b2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                b2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            hg.c.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j3 = dialog.id;
        a0.i iVar = this.U;
        if (iVar.h(j3) >= 0) {
            iVar.l(dialog.id);
            this.V.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(false, true);
            } else if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).b(false, true);
            }
            b1(1);
            mr0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.C0 = dialog;
                this.I.h1(0, this.p0 - qm0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                tq0 tq0Var = new tq0(this, dialog, atomicReference, view);
                atomicReference.set(new oo0(this, atomicReference, tq0Var, dialog, 2));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(tq0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    tq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            mr0Var = this;
            iVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(true, true);
            } else if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).b(true, true);
            }
            b1(2);
            long j10 = UserConfig.getInstance(mr0Var.currentAccount).clientUserId;
            if (mr0Var.L0) {
                er0 er0Var = mr0Var.K;
                a0.i iVar2 = er0Var.e;
                ArrayList arrayList = er0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.id);
                if (dialog2 == null) {
                    er0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                er0Var.l();
                mr0Var.A0 = false;
                s20 s20Var = mr0Var.y0;
                s20Var.r.setText("");
                L0(false);
                AndroidUtilities.hideKeyboard(s20Var.r);
            }
        }
        ir0 ir0Var = mr0Var.M;
        if (ir0Var == null || (hr0Var = ir0Var.H) == null) {
            return;
        }
        hr0Var.q(0, hr0Var.h());
    }

    public final void W0(final boolean z10) {
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            a0.i iVar = this.U;
            int m10 = iVar.m();
            qq0 qq0Var = this.c;
            rq0 rq0Var = this.d;
            if (i12 >= m10) {
                Editable text = rq0Var.getText();
                uu uuVar = rq0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                dq dqVar = this.e0;
                int i13 = (dqVar == null || !dqVar.a.q) ? -1 : this.b0;
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i10 = 0;
                    while (i11 < iVar.m()) {
                        long j3 = iVar.j(i11);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j3);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j3));
                        }
                        if (qq0Var.getTag() != null && uuVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                        i11++;
                    }
                } else {
                    yq0 yq0Var = this.W;
                    int i14 = yq0Var != null ? yq0Var.e : 0;
                    if (this.F0 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < iVar.m()) {
                            long j10 = iVar.j(i15);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                            }
                            int i17 = i11;
                            if (this.F0 != null && qq0Var.getTag() != null && uuVar.length() > 0 && charSequenceArr[i17] != null && sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            if (sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                                arrayList.add(Long.valueOf(j10));
                            }
                            i15++;
                            i11 = i17;
                        }
                        i10 = i16;
                    } else {
                        int i18 = 0;
                        if (this.O[i14] != null) {
                            for (int i19 = 0; i19 < iVar.m(); i19++) {
                                long j11 = iVar.j(i19);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                                }
                                if (qq0Var.getTag() != null && uuVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i18++;
                                }
                                if (sendPaidMessagesStars3 > 0) {
                                    i18++;
                                }
                                if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                    arrayList.add(Long.valueOf(j11));
                                }
                            }
                        }
                        i10 = i18;
                    }
                }
                final int i20 = i13;
                g5.b0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.lq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        mr0.q(mr0.this, charSequenceArr, entities, z10, i20, (HashMap) obj);
                    }
                });
                return;
            }
            if (g5.g(getContext(), this.currentAccount, iVar.j(i12), qq0Var.getTag() != null && rq0Var.a.length() > 0)) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void X0(boolean z10) {
        qq0 qq0Var = this.c;
        if (z10 == (qq0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        qq0Var.setTag(z10 ? 1 : null);
        rq0 rq0Var = this.d;
        if (rq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(rq0Var.getEditText());
        }
        rq0Var.k(true);
        FrameLayout frameLayout = this.c0;
        qq0 qq0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            qq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            qq0Var2.setVisibility(0);
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
        arrayList.add(ObjectAnimator.ofFloat(qq0Var, (Property<qq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(qq0Var2, (Property<qq0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(qq0Var2, (Property<qq0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(qq0Var2, (Property<qq0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.y.addListener(new vq0(this, z10, 1));
        this.y.start();
    }

    public final void Y0(long j3, View view) {
        int i10 = -this.H0;
        this.H0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.v;
        (premiumFeaturesBlocked ? new ad(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new ad(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new hq0(this, i11))).j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.p1 p1Var;
        qq0 qq0Var = this.c;
        if (qq0Var == null) {
            return;
        }
        rq0 rq0Var = this.d;
        if (rq0Var == null || !rq0Var.m()) {
            xq0 xq0Var = this.D0;
            if (xq0Var != null && (p1Var = xq0Var.H) != null && !p1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            rq0Var.getEmojiPaddingShown();
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
        qq0Var.setTranslationY(f11);
        this.f.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.j5 j5Var = this.s;
        if (j5Var != null) {
            String P0 = P0();
            if (P0.startsWith("https://")) {
                P0 = P0.substring(8);
            } else if (P0.startsWith("http://")) {
                P0 = P0.substring(7);
            }
            j5Var.k(P0);
        }
    }

    public final void b1(int i10) {
        a0.i iVar = this.U;
        if (iVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.N;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        rq0 rq0Var = this.d;
        if (tag != null && rq0Var.a.length() > 0) {
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
        ii.z1 z1Var = this.e;
        z1Var.g(max, z10);
        z1Var.i(size, j3, i10 != 0);
        X0(true);
        rq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), z1Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            er0 er0Var = this.K;
            if (er0Var != null) {
                er0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        rq0 rq0Var = this.d;
        if (rq0Var != null) {
            AndroidUtilities.hideKeyboard(rq0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        super.dismissInternal();
        rq0 rq0Var = this.d;
        if (rq0Var != null) {
            rq0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.C0 != null) {
            M0();
            return;
        }
        rq0 rq0Var = this.d;
        if (rq0Var == null || !rq0Var.e) {
            super.onBackPressed();
        } else {
            rq0Var.k(true);
        }
    }

    public mr0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0828  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mr0(Context context, org.telegram.ui.zn znVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        int i10;
        int i11;
        float f7;
        float f10;
        oq0 oq0Var;
        oq0 oq0Var2;
        LinearLayout linearLayout;
        int i12;
        final int i13 = 1;
        String[] strArr = new String[2];
        this.O = strArr;
        this.S = new View[2];
        this.T = new AnimatorSet[2];
        this.U = new a0.i();
        this.V = new HashMap();
        this.X = -1;
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
        fh.c cVar = new fh.c();
        int i16 = org.telegram.ui.ActionBar.i6.d6;
        cVar.a(getThemedColor(i16));
        if (Build.VERSION.SDK_INT >= 31) {
            this.O0 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.Q0 = dVar;
            dVar.j(new m2.t(this, 9));
            fh.d dVar2 = new fh.d(null);
            this.P0 = dVar2;
            i11 = 0;
            dVar2.j(new l2.f(this, 14));
            ah.c cVar2 = new ah.c(dVar);
            this.R0 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.S0 = cVar3;
            cVar3.i = LiteMode.isEnabled(262144);
        } else {
            i11 = 0;
            this.O0 = null;
            this.P0 = null;
            this.Q0 = null;
            this.R0 = new ah.c(cVar);
            this.S0 = new ah.c(cVar);
        }
        this.T0 = new ah.c(cVar);
        this.resourcesProvider = e6Var;
        this.Z = z13;
        this.g0 = AndroidUtilities.findActivity(context);
        this.h0 = z12;
        if (z12) {
            this.resourcesProvider = new ai.a1(i13);
        }
        cVar.a(getThemedColor(i16));
        this.f0 = znVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.R = mutate;
        int i17 = org.telegram.ui.ActionBar.i6.h5;
        this.behindKeyboardColorKey = i17;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z11;
        strArr2[i11] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                a1.g.A(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a1.g.t(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.N = arrayList;
        this.M = new ir0(this, context);
        this.n0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.h0(this, i13));
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                MessageObject messageObject2 = (MessageObject) this.N.get(i18);
                if (messageObject2.isTodo()) {
                    this.P = 3;
                } else if (messageObject2.isPoll()) {
                    int i19 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.P = i19;
                    if (i19 == 2) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.oo(13, this, context));
        }
        xq0 xq0Var = new xq0(this, context);
        this.D0 = xq0Var;
        this.containerView = xq0Var;
        ah.c cVar4 = this.R0;
        hh.j jVar = new hh.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        cVar4.f = jVar;
        cVar4.g = viewGroup;
        ah.c cVar5 = this.S0;
        hh.j jVar2 = new hh.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        cVar5.f = jVar2;
        cVar5.g = viewGroup2;
        ah.c cVar6 = this.T0;
        hh.j jVar3 = new hh.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        cVar6.f = jVar3;
        cVar6.g = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i20 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i20, 0, i20, this.G0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int i21 = org.telegram.ui.ActionBar.i6.h5;
        frameLayout.setBackgroundColor(getThemedColor(i21));
        if (this.h0 && this.o0[1] != null) {
            yq0 yq0Var = new yq0(this, context);
            this.W = yq0Var;
            frameLayout.addView(yq0Var, w7.x5.a(36.0f, 0.0f, 11.0f, 0.0f, 0.0f, -1, 51));
        }
        s20 s20Var = new s20(context, this.resourcesProvider);
        this.y0 = s20Var;
        zq0 zq0Var = new zq0(this);
        ci.g2 g2Var = s20Var.r;
        g2Var.addTextChangedListener(zq0Var);
        g2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        g2Var.setOnEditorActionListener(new e1(this, 7));
        s20Var.setCloseButtonOnClickListener(new hq0(this, 0));
        frameLayout.addView(s20Var, w7.x5.a(40.0f, 11.0f, 7.0f, 11.0f, 11.0f, -1, 83));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.z0 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i22 = org.telegram.ui.ActionBar.i6.j5;
        kVar.setTitleColor(getThemedColor(i22));
        kVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.q5));
        kVar.D(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.z6, false), false);
        kVar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.u8, false), false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 12));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, w7.x5.e(-1, 58, 83));
        qm0 qm0Var = new qm0(context, this.resourcesProvider);
        this.E = qm0Var;
        s4.s sVar = new s4.s(4);
        this.I = sVar;
        qm0Var.setLayoutManager(sVar);
        sVar.O = new pq0(this, 2);
        final int i23 = 0;
        qm0Var.setOnScrollListener(new nq0(this, i23));
        jr0 jr0Var = new jr0(this, context);
        this.L = jr0Var;
        qm0Var.setAdapter(jr0Var);
        int i24 = org.telegram.ui.ActionBar.i6.A5;
        qm0Var.setGlowColor(getThemedColor(i24));
        qm0Var.setVerticalScrollBarEnabled(false);
        qm0Var.setHorizontalScrollBarEnabled(false);
        qm0Var.setOverScrollMode(2);
        qm0Var.setSelectorDrawableColor(0);
        int i25 = 11;
        qm0Var.setItemSelectorColorProvider(new fe0(i25));
        qm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        qm0Var.setClipToPadding(false);
        qm0Var.i(new ai.t(5));
        qm0Var.setOnItemClickListener(new em0(this) { // from class: org.telegram.ui.Components.iq0
            public final /* synthetic */ mr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.em0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i23) {
                    case 0:
                        mr0.r(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            mr0 mr0Var = this.b;
                            ArrayList arrayList3 = mr0Var.K.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                mr0Var.V0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            mr0 mr0Var2 = this.b;
                            ir0 ir0Var = mr0Var2.M;
                            mr0 mr0Var3 = ir0Var.K;
                            int i28 = ir0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < ir0Var.d.size()) {
                                        tL_dialog2 = ((ar0) ir0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - ir0Var.d.size();
                                        ArrayList arrayList4 = ir0Var.e.d;
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
                                    mr0Var2.V0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < mr0Var3.E0.size()) {
                                    TLObject tLObject2 = ((gg.g0) mr0Var3.E0.get(i30)).a;
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
        qm0Var.setVisibility(8);
        this.containerView.addView(qm0Var, w7.x5.e(-1, -1, 51));
        oq0 oq0Var3 = new oq0(this, context, this.resourcesProvider, i23);
        this.F = oq0Var3;
        oq0Var3.setSelectorDrawableColor(0);
        oq0Var3.setItemSelectorColorProvider(new fe0(i25));
        oq0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        oq0Var3.setClipToPadding(false);
        getContext();
        s4.s sVar2 = new s4.s(4);
        this.H = sVar2;
        oq0Var3.setLayoutManager(sVar2);
        this.U0 = new ah.n(oq0Var3, this.containerView, new jq0(oq0Var3, i23));
        sVar2.O = new pq0(this, i23);
        oq0Var3.setHorizontalScrollBarEnabled(false);
        oq0Var3.setVerticalScrollBarEnabled(false);
        oq0Var3.setOverScrollMode(2);
        oq0Var3.i(new ai.t(6));
        this.containerView.addView(oq0Var3, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        er0 er0Var = new er0(this, context);
        this.K = er0Var;
        oq0Var3.setAdapter(er0Var);
        oq0Var3.setGlowColor(getThemedColor(i24));
        oq0Var3.setOnItemClickListener(new em0(this) { // from class: org.telegram.ui.Components.iq0
            public final /* synthetic */ mr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.em0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        mr0.r(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            mr0 mr0Var = this.b;
                            ArrayList arrayList3 = mr0Var.K.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                mr0Var.V0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            mr0 mr0Var2 = this.b;
                            ir0 ir0Var = mr0Var2.M;
                            mr0 mr0Var3 = ir0Var.K;
                            int i28 = ir0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < ir0Var.d.size()) {
                                        tL_dialog2 = ((ar0) ir0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - ir0Var.d.size();
                                        ArrayList arrayList4 = ir0Var.e.d;
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
                                    mr0Var2.V0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < mr0Var3.E0.size()) {
                                    TLObject tLObject2 = ((gg.g0) mr0Var3.E0.get(i30)).a;
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
        oq0Var3.setOnScrollListener(new nq0(this, i13));
        oq0 oq0Var4 = new oq0(this, context, this.resourcesProvider, i13);
        this.G = oq0Var4;
        oq0Var4.setItemSelectorColorProvider(new fe0(i25));
        oq0Var4.setSelectorDrawableColor(0);
        oq0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        oq0Var4.setClipToPadding(false);
        getContext();
        e00 e00Var = new e00(4, 0, oq0Var4);
        this.J = e00Var;
        oq0Var4.setLayoutManager(e00Var);
        e00Var.O = new pq0(this, i13);
        final int i26 = 2;
        oq0Var4.setOnItemClickListener(new em0(this) { // from class: org.telegram.ui.Components.iq0
            public final /* synthetic */ mr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.em0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i262, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i26) {
                    case 0:
                        mr0.r(this.b, i262);
                        break;
                    case 1:
                        if (i262 >= 0) {
                            mr0 mr0Var = this.b;
                            ArrayList arrayList3 = mr0Var.K.d;
                            int i27 = i262 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                mr0Var.V0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i262 >= 0) {
                            mr0 mr0Var2 = this.b;
                            ir0 ir0Var = mr0Var2.M;
                            mr0 mr0Var3 = ir0Var.K;
                            int i28 = ir0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i262 < i28 || i28 < 0) {
                                int i29 = i262 - 1;
                                if (i29 >= 0) {
                                    if (i29 < ir0Var.d.size()) {
                                        tL_dialog2 = ((ar0) ir0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - ir0Var.d.size();
                                        ArrayList arrayList4 = ir0Var.e.d;
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
                                    mr0Var2.V0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i262 - i28;
                                if (i30 >= 0 && i30 < mr0Var3.E0.size()) {
                                    TLObject tLObject2 = ((gg.g0) mr0Var3.E0.get(i30)).a;
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
        oq0Var4.setHasFixedSize(true);
        oq0Var4.setItemAnimator(null);
        oq0Var4.setHorizontalScrollBarEnabled(false);
        oq0Var4.setVerticalScrollBarEnabled(false);
        oq0Var4.setOnScrollListener(new nq0(this, i26));
        oq0Var4.i(new ai.t(7));
        oq0Var4.setAdapter(this.M);
        oq0Var4.setGlowColor(getThemedColor(i24));
        this.x0 = new vl0(oq0Var4, true);
        j10 j10Var = new j10(context, this.resourcesProvider);
        j10Var.setViewType(12);
        ay0 ay0Var = new ay0(context, j10Var, 1, this.resourcesProvider);
        this.Q = ay0Var;
        ay0Var.addView(j10Var, 0);
        ay0Var.setAnimateLayoutChange(true);
        ay0Var.e(false, false);
        boolean z14 = this.h0;
        vh.n nVar = ay0Var.d;
        if (z14) {
            nVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.ng));
        }
        nVar.setText(LocaleController.getString(R.string.NoResult));
        oq0Var4.setEmptyView(ay0Var);
        oq0Var4.setHideIfEmpty(false);
        oq0Var4.W1 = true;
        oq0Var4.X1 = 0;
        this.containerView.addView(ay0Var, w7.x5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(oq0Var4, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ci.bb bbVar = new ci.bb(this, context, 21);
        this.n = bbVar;
        this.containerView.addView(bbVar, w7.x5.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.h0 || this.o0[1] == null) ? 58.0f : 111.0f);
        this.S[0] = new View(context);
        View view = this.S[0];
        int i27 = org.telegram.ui.ActionBar.i6.V5;
        view.setBackgroundColor(getThemedColor(i27));
        this.S[0].setAlpha(0.0f);
        this.S[0].setTag(1);
        this.containerView.addView(this.S[0], layoutParams);
        this.containerView.addView(frameLayout, w7.x5.e(-1, (!this.h0 || this.o0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.S[1] = new View(context);
        this.S[1].setBackgroundColor(getThemedColor(i27));
        this.S[1].setLayoutParams(layoutParams2);
        if (!this.n0 && this.o0[0] == null) {
            this.S[1].setAlpha(0.0f);
            oq0Var = oq0Var3;
            oq0Var2 = oq0Var4;
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
                frameLayout2.addView(frameLayout3, w7.x5.a(-1.0f, -2.0f, 0.0f, -2.0f, 0.0f, -1, 119));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, w7.x5.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                w7.z5.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new fq0(this, 3));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                this.s = j5Var;
                j5Var.setTextSize(15);
                j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Tk));
                j5Var.setEllipsizeByGradient(true);
                a1();
                linearLayout3.addView(j5Var, w7.x5.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i28 = org.telegram.ui.ActionBar.i6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(i28), 4, 4));
                linearLayout3.addView(textView, w7.x5.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new fq0(this, 4));
                w7.z5.a(textView);
                oq0Var = oq0Var3;
                oq0Var2 = oq0Var4;
                this.containerView.addView(frameLayout2, w7.x5.e(-1, 58, 83));
                ArrayList arrayList3 = this.N;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i29 = 0;
                        linearLayout = org.telegram.messenger.bi.e(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mq0
                            public final /* synthetic */ mr0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i29) {
                                    case 0:
                                        mr0 mr0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = mr0Var.f0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            mr0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.lj0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        mr0 mr0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = mr0Var2.f0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            mr0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.lj0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(i28), 6, 6));
                        w7.z5.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i30 = org.telegram.ui.ActionBar.i6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i30), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, w7.x5.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i30));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, w7.x5.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i12 = 8;
                        linearLayout2.addView(linearLayout3, w7.x5.p(-1, 42, 1.0f, 23, 11, 0, i12, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, w7.x5.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i12 = 11;
                linearLayout2.addView(linearLayout3, w7.x5.p(-1, 42, 1.0f, 23, 11, 0, i12, 0));
                if (linearLayout != null) {
                }
            } else {
                oq0Var = oq0Var3;
                oq0Var2 = oq0Var4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.x5.a(-1.0f, -2.0f, 0.0f, -2.0f, 0.0f, -1, 119));
                TextView textView3 = new TextView(context);
                int i31 = org.telegram.ui.ActionBar.i6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i31), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.pg : org.telegram.ui.ActionBar.i6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.h0 && this.o0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new fq0(this, 5));
                frameLayout5.addView(textView3, w7.x5.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, w7.x5.e(-1, 58, 87));
                ArrayList arrayList4 = this.N;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.eg : i31), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, w7.x5.a(48.0f, 6.0f, 0.0f, -6.0f, 0.0f, -2, 85));
                        final int i32 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mq0
                            public final /* synthetic */ mr0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i32) {
                                    case 0:
                                        mr0 mr0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = mr0Var.f0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            mr0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.lj0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        mr0 mr0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = mr0Var2.f0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            mr0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.lj0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.pg : org.telegram.ui.ActionBar.i6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, w7.x5.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.pg : org.telegram.ui.ActionBar.i6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, w7.x5.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f, -1, 87));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        qq0 qq0Var = new qq0(this, context, 0);
        this.c = qq0Var;
        qq0Var.setWillNotDraw(false);
        qq0Var.setAlpha(0.0f);
        qq0Var.setVisibility(4);
        this.containerView.addView(qq0Var, w7.x5.a(-2.0f, -2.0f, 0.0f, -2.0f, 0.0f, -1, 83));
        qq0Var.setOnTouchListener(new bi.d(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i21)) > 0.721f);
        rq0 rq0Var = new rq0(this, context, xq0Var, this.resourcesProvider);
        this.d = rq0Var;
        rq0Var.J = true;
        if (this.h0) {
            ru editText = rq0Var.getEditText();
            int i33 = org.telegram.ui.ActionBar.i6.ng;
            editText.setTextColor(getThemedColor(i33));
            rq0Var.getEditText().setCursorColor(getThemedColor(i33));
        }
        rq0Var.setHint(LocaleController.getString(R.string.ShareComment));
        rq0Var.s();
        rq0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        qq0Var.addView(rq0Var, w7.x5.e(-1, -2, 51));
        qq0Var.setClipChildren(false);
        qq0Var.setClipToPadding(false);
        rq0Var.setClipChildren(false);
        rq0Var.getEditText().addTextChangedListener(new ci.h2(this, 12));
        qq0 qq0Var2 = new qq0(this, context, 1);
        this.f = qq0Var2;
        qq0Var2.setFocusable(true);
        qq0Var2.setFocusableInTouchMode(true);
        qq0Var2.setVisibility(4);
        qq0Var2.setScaleX(0.2f);
        qq0Var2.setScaleY(0.2f);
        qq0Var2.setAlpha(0.0f);
        this.containerView.addView(qq0Var2, w7.x5.e(110, 50, 85));
        ii.z1 z1Var = new ii.z1(this, context, R.drawable.send_plane_24, this.resourcesProvider, 2);
        this.e = z1Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        z1Var.I = dp;
        z1Var.J = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        z1Var.M = dp3;
        z1Var.N = dp4;
        z1Var.h0 = true;
        qq0Var2.addView(z1Var, w7.x5.g());
        z1Var.setOnClickListener(new fq0(this, 6));
        z1Var.setOnLongClickListener(new c20(this, 2));
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
            linearLayout5.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 6, 6));
            dq dqVar = new dq(context, 24, this.resourcesProvider);
            this.e0 = dqVar;
            dqVar.b(org.telegram.ui.ActionBar.i6.h7, org.telegram.ui.ActionBar.i6.j7, org.telegram.ui.ActionBar.i6.k7);
            dqVar.setDrawUnchecked(true);
            dqVar.a(false, false);
            dqVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(dqVar, w7.x5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i22));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, w7.x5.t(-2, -2, 16, 9, 0, 0, 0));
            w7.z5.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new fq0(this, 0));
            frameLayout8.addView(linearLayout5, w7.x5.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d7));
                frameLayout8.addView(view2, w7.x5.b(-1.0f, this.h0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, w7.x5.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        ah.d dVar3 = new ah.d(this.T0.c(bbVar, null, false));
        this.W0 = dVar3;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        dVar3.b(AndroidUtilities.dp(72.0f), true);
        ch.d c10 = this.S0.c(this.D0, eh.b.e(this.resourcesProvider), false);
        this.V0 = c10;
        c10.m = true;
        c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.u(AndroidUtilities.dp(32.0f));
        c10.j.g = 0.4f;
        c10.k();
        ch.d c11 = this.R0.c(qq0Var, eh.b.e(this.resourcesProvider), false);
        this.X0 = c11;
        c11.q(AndroidUtilities.dp(f10));
        c11.p(AndroidUtilities.dp(9.0f));
        qq0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            ch.d c12 = this.R0.c(frameLayout9, eh.b.e(this.resourcesProvider), false);
            c12.p(AndroidUtilities.dp(9.0f));
            c12.q(AndroidUtilities.dp(f10));
            this.r.setBackground(c12);
            this.r.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.c0;
        if (frameLayout10 != null) {
            ch.d c13 = this.R0.c(frameLayout10, eh.b.e(this.resourcesProvider), false);
            c13.p(AndroidUtilities.dp(9.0f));
            c13.q(AndroidUtilities.dp(f10));
            this.c0.setBackground(c13);
            this.c0.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        b1(0);
        org.telegram.ui.ty.f4(AccountInstance.getInstance(this.currentAccount));
        if (er0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i34 = this.currentAccount;
        int i35 = 0;
        MessagesStorage.getInstance(i34).getStorageQueue().postRunnable(new gg.n(i34, i35, new sq0(this), i35));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(oq0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(oq0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.d3 container = getContainer();
        gq0 gq0Var = new gq0(this, i35);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(container, gq0Var);
    }

    public void T0(View view) {
    }

    public void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
