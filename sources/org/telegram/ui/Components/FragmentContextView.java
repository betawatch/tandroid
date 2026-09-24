package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener {
    public static final float[] O0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public org.telegram.ui.fj A0;
    public long B0;
    public final NotificationCenter.ObserversGroup[] C0;
    public NotificationCenter.ObserversGroup D0;
    public ImageView E;
    public float E0;
    public org.telegram.ui.ActionBar.u0 F;
    public float F0;
    public fd G;
    public boolean G0;
    public org.telegram.ui.ActionBar.a1 H;
    public boolean H0;
    public final org.telegram.ui.ActionBar.s0[] I;
    public final Paint I0;
    public FrameLayout J;
    public boolean J0;
    public ImageView K;
    public int K0;
    public org.telegram.ui.pk L;
    public float L0;
    public int M;
    public final le.m M0;
    public org.telegram.ui.Components.voip.h N;
    public int N0;
    public boolean O;
    public int P;
    public MessageObject Q;
    public float R;
    public boolean S;
    public int T;
    public String U;
    public boolean V;
    public boolean W;
    public final jd a;
    public k9 a0;
    public ImageView b;
    public Paint b0;
    public pg0 c;
    public LinearGradient c0;
    public s10 d;
    public Matrix d0;
    public s10 e;
    public int e0;
    public AnimatorSet f;
    public TextPaint f0;
    public boolean g0;
    public final org.telegram.ui.ActionBar.m2 h;
    public boolean h0;
    public final o6 i0;
    public zc j0;
    public boolean k0;
    public final q10 l0;
    public final int m0;
    public final ch n;
    public final boolean n0;
    public w10 o0;
    public final org.telegram.ui.ActionBar.d6 p0;
    public boolean q0;
    public r10 r;
    public int r0;
    public ai.w5 s;
    public final org.telegram.ui.Cells.t6 s0;
    public final AnimationNotificationsLocker t0;
    public final AnimationNotificationsLocker u0;
    public View v;
    public boolean v0;
    public lj0 w;
    public boolean w0;
    public u10 x;
    public boolean x0;
    public ij0 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.qy qyVar, boolean z10) {
        this(context, qyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.T;
        org.telegram.ui.ActionBar.d6 d6Var = this.p0;
        return i10 == 4 ? org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t7, d6Var) : (i10 == 1 || i10 == 3) ? org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var) : org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.u7, d6Var);
    }

    public static boolean i(float f7, float f10) {
        return Math.abs(f7 - f10) < 0.05f;
    }

    public static boolean j() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        return playingMessageObject != null && playingMessageObject.isVoice();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        ChatObject.Call groupCall;
        boolean z12;
        ChatObject.Call call;
        int i10;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.S && this.T == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.h;
        View fragmentView = m2Var.getFragmentView();
        boolean z13 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean c10 = a30.c();
        ch chVar = this.n;
        if (c10) {
            z11 = false;
        } else {
            z11 = (org.telegram.ui.d60.E3 || !this.W || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (!j() && !org.telegram.ui.d60.E3 && this.W && !z11 && chVar != null && (groupCall = chVar.getGroupCall()) != null && groupCall.shouldShowPanel()) {
                z11 = true;
                z12 = true;
                AnimationNotificationsLocker animationNotificationsLocker = this.t0;
                if (z11) {
                    boolean z14 = this.S;
                    if (z14 && ((z13 && this.T == -1) || (i11 = this.T) == 4 || i11 == 3 || i11 == 1)) {
                        this.S = false;
                        if (z13) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                        } else {
                            AnimatorSet animatorSet = this.f;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                this.f = null;
                            }
                            animationNotificationsLocker.lock();
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                            this.f.setDuration(220L);
                            this.f.setInterpolator(rr.f);
                            this.f.addListener(new p10(this, 9));
                            this.f.start();
                        }
                    } else if (z14 && ((i10 = this.T) == -1 || i10 == 4 || i10 == 3 || i10 == 1)) {
                        this.S = false;
                        setVisibility(8);
                    }
                    if (!z13 || chVar == null || !chVar.G() || a30.c()) {
                        return;
                    }
                    org.telegram.messenger.f0.p(R.string.InviteExpired, yc.a0(m2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z12 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.T;
                if (i12 != i13 && this.f != null && !z13) {
                    this.v0 = true;
                    return;
                }
                if (i12 != i13 && this.S && !z13) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(rr.f);
                    this.f.addListener(new p10(this, 10));
                    this.f.start();
                    return;
                }
                if (z12) {
                    boolean z15 = i13 == 4 && this.S;
                    s(4);
                    ChatObject.Call groupCall2 = chVar.getGroupCall();
                    TLRPC.Chat g10 = chVar.g();
                    if (groupCall2.isScheduled()) {
                        if (this.b0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.f0 = textPaint;
                            textPaint.setColor(-1);
                            this.f0.setTextSize(AndroidUtilities.dp(14.0f));
                            this.f0.setTypeface(AndroidUtilities.bold());
                            Paint paint = new Paint(1);
                            this.b0 = paint;
                            paint.setColor(-1);
                            this.d0 = new Matrix();
                        }
                        this.g0 = true;
                        LocaleController.getString(R.string.VoipChatNotify);
                        TLRPC.GroupCall groupCall3 = groupCall2.call;
                        this.h0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.L.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (ChatObject.isChannelOrGiga(g10)) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                        } else {
                            this.d.b(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                        }
                        this.e.b(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                        if (!this.k0) {
                            this.k0 = true;
                            this.l0.run();
                        }
                    } else {
                        this.g0 = false;
                        this.L.setVisibility(0);
                        this.L.setText(LocaleController.getString(R.string.VoipChatJoin));
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (groupCall2.call.rtmp_stream) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                        } else if (ChatObject.isChannelOrGiga(g10)) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                        } else {
                            this.d.b(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.call;
                        int i14 = groupCall4.participants_count;
                        if (i14 == 0) {
                            this.e.b(LocaleController.getString(groupCall4.rtmp_stream ? R.string.ViewersWatchingNobody : R.string.MembersTalkingNobody), false);
                        } else {
                            this.e.b(LocaleController.formatPluralString(groupCall4.rtmp_stream ? "ViewersWatching" : "Participants", i14, new Object[0]), false);
                        }
                        this.r.invalidate();
                    }
                    o(this.a0.a.d && z15);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    o(i13 == 1);
                    s(1);
                } else {
                    o(i13 == 3);
                    s(3);
                }
                if (this.S) {
                    return;
                }
                if (z13) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.u0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(rr.f);
                    this.f.addListener(new p10(this, 11));
                    this.f.start();
                }
                this.S = true;
                setVisibility(0);
                return;
            }
        }
        z12 = false;
        AnimationNotificationsLocker animationNotificationsLocker2 = this.t0;
        if (z11) {
        }
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        r10 r10Var = new r10(this, context);
        this.r = r10Var;
        this.j0 = new zc(r10Var);
        int i10 = AndroidUtilities.displaySize.x;
        o6 o6Var = this.i0;
        o6Var.G = i10;
        o6Var.v = 0.4f;
        o6Var.setCallback(r10Var);
        o6Var.r(-1);
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        addView(this.r, w7.y5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.r.addView(view, w7.y5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i11 = org.telegram.ui.ActionBar.h6.w7;
        org.telegram.ui.ActionBar.d6 d6Var = this.p0;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.b;
        pg0 pg0Var = new pg0(16);
        this.c = pg0Var;
        imageView3.setImageDrawable(pg0Var);
        this.b.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i11, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.b, w7.y5.e(36, 36, 51));
        final int i12 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i13;
                long j3;
                TL_stories.StoryItem u10;
                int i14 = i12;
                FragmentContextView fragmentContextView = this.b;
                switch (i14) {
                    case 0:
                        ch chVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.qy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i15 = chVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, d6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ch chVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        int i17 = 6;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.b;
                                int i18 = d2Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d2Var.c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i18).A(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, d6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (chVar2 != null ? chVar2.a() : 0L)) {
                                    fragmentContextView.n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    m2Var2.presentFragment(new org.telegram.ui.wn(bundle), m2Var2 instanceof org.telegram.ui.wn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i13 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j11 = sharingLocationInfo.did;
                                            i13 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j11;
                                        }
                                    }
                                }
                                i13 = i19;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i13).getSharingLocationInfo(j3));
                                break;
                            } else {
                                m2Var2.showDialog(new nv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (m2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var2;
                                if (m2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                    x40 x40Var = new x40(fragmentContextView.getContext(), null, wnVar, d6Var3);
                                    x40Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    m2Var2.showDialog(x40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.T == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.O = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.P(fragmentContextView.O ? 15 : 29)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.y.M(0);
                                } else {
                                    fragmentContextView.y.M(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        lj0 lj0Var = new lj0(context);
        this.w = lj0Var;
        lj0Var.setScaleType(scaleType);
        this.w.setAutoRepeat(true);
        this.w.f(R.raw.import_progress, 30, 30, null);
        this.w.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        addView(this.w, w7.y5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        s10 s10Var = new s10(this, context, context, 0);
        this.d = s10Var;
        addView(s10Var, w7.y5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        s10 s10Var2 = new s10(this, context, context, 1);
        this.e = s10Var2;
        addView(s10Var2, w7.y5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.N = hVar;
        hVar.g = 1.0f;
        hVar.j = false;
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 1);
        this.L = pkVar;
        pkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.L.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
        org.telegram.ui.pk pkVar2 = this.L;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
        pkVar2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.L.setTextSize(1, 14.0f);
        this.L.setTypeface(AndroidUtilities.bold());
        this.L.setGravity(17);
        this.L.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.L, w7.y5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i13 = 3;
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i14 = i13;
                FragmentContextView fragmentContextView = this.b;
                switch (i14) {
                    case 0:
                        ch chVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.qy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i15 = chVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, d6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ch chVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        int i17 = 6;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.b;
                                int i18 = d2Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d2Var.c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i18).A(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, d6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (chVar2 != null ? chVar2.a() : 0L)) {
                                    fragmentContextView.n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    m2Var2.presentFragment(new org.telegram.ui.wn(bundle), m2Var2 instanceof org.telegram.ui.wn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i132 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j11 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j11;
                                        }
                                    }
                                }
                                i132 = i19;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j3));
                                break;
                            } else {
                                m2Var2.showDialog(new nv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (m2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var2;
                                if (m2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                    x40 x40Var = new x40(fragmentContextView.getContext(), null, wnVar, d6Var3);
                                    x40Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    m2Var2.showDialog(x40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.T == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.O = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.P(fragmentContextView.O ? 15 : 29)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.y.M(0);
                                } else {
                                    fragmentContextView.y.M(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        if (this.G0) {
            n();
        }
        this.J = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.K;
        int i14 = org.telegram.ui.ActionBar.h6.x7;
        imageView5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), mode));
        this.J.addView(this.K, w7.y5.e(20, 20, 17));
        this.J.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i14, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.J.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.J.setOnClickListener(new ai.e2(11));
        this.J.setVisibility(8);
        addView(this.J, w7.y5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.n0) {
            h();
        }
        k9 k9Var = new k9(context, false);
        this.a0 = k9Var;
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.a0.setDelegate(new o10(this, 1));
        this.a0.setVisibility(8);
        addView(this.a0, w7.y5.e(108, 36, 51));
        this.y = new ij0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        u10 u10Var = new u10(this, context);
        this.x = u10Var;
        u10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var), PorterDuff.Mode.SRC_IN));
        this.x.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i14, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.x.setAnimation(this.y);
        this.x.setScaleType(scaleType);
        this.x.setVisibility(8);
        addView(this.x, w7.y5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i15 = 4;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i142 = i15;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        ch chVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.qy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i152 = chVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, d6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ch chVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        int i17 = 6;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.b;
                                int i18 = d2Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d2Var.c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i18).A(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, d6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (chVar2 != null ? chVar2.a() : 0L)) {
                                    fragmentContextView.n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    m2Var2.presentFragment(new org.telegram.ui.wn(bundle), m2Var2 instanceof org.telegram.ui.wn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i132 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j11 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j11;
                                        }
                                    }
                                }
                                i132 = i19;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j3));
                                break;
                            } else {
                                m2Var2.showDialog(new nv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (m2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var2;
                                if (m2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                    x40 x40Var = new x40(fragmentContextView.getContext(), null, wnVar, d6Var3);
                                    x40Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    m2Var2.showDialog(x40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.T == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.O = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.P(fragmentContextView.O ? 15 : 29)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.y.M(0);
                                } else {
                                    fragmentContextView.y.M(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.E = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), mode));
        this.E.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i14, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.E.setScaleType(scaleType);
        addView(this.E, w7.y5.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 0;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i142 = i16;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        ch chVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.qy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i152 = chVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, d6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ch chVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.T;
                        int i17 = 6;
                        if (i162 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.b;
                                int i18 = d2Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d2Var.c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i18).A(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, d6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (chVar2 != null ? chVar2.a() : 0L)) {
                                    fragmentContextView.n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    m2Var2.presentFragment(new org.telegram.ui.wn(bundle), m2Var2 instanceof org.telegram.ui.wn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i132 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j11 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j11;
                                        }
                                    }
                                }
                                i132 = i19;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j3));
                                break;
                            } else {
                                m2Var2.showDialog(new nv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (m2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var2;
                                if (m2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                    x40 x40Var = new x40(fragmentContextView.getContext(), null, wnVar, d6Var3);
                                    x40Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    m2Var2.showDialog(x40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.T == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.O = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.P(fragmentContextView.O ? 15 : 29)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.y.M(0);
                                } else {
                                    fragmentContextView.y.M(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        ai.w5 w5Var = new ai.w5(getContext(), 15);
        this.s = w5Var;
        addView(w5Var, w7.y5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i17 = 1;
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i142 = i17;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        ch chVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.qy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i152 = chVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, d6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ch chVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.p0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.T;
                        int i172 = 6;
                        if (i162 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.b;
                                int i18 = d2Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d2Var.c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i18).A(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, d6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (chVar2 != null ? chVar2.a() : 0L)) {
                                    fragmentContextView.n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    m2Var2.presentFragment(new org.telegram.ui.wn(bundle), m2Var2 instanceof org.telegram.ui.wn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i132 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j11 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j11;
                                        }
                                    }
                                }
                                i132 = i19;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j3));
                                break;
                            } else {
                                m2Var2.showDialog(new nv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (m2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var2;
                                if (m2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                    x40 x40Var = new x40(fragmentContextView.getContext(), null, wnVar, d6Var3);
                                    x40Var.setOnHideListener(new b1(fragmentContextView, i172));
                                    m2Var2.showDialog(x40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.T == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.O = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.P(fragmentContextView.O ? 15 : 29)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.y.M(0);
                                } else {
                                    fragmentContextView.y.M(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        setLeftMargin(this.L0);
    }

    public final void c(boolean z10) {
        int i10;
        ch chVar = this.n;
        if (chVar != null) {
            if (this.S && ((i10 = this.T) == 1 || i10 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.m2 m2Var = this.h;
            SendMessagesHelper.ImportingHistory importingHistory = m2Var.getSendMessagesHelper().getImportingHistory(chVar.a());
            View fragmentView = m2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = m2Var.getVisibleDialog();
            if ((j() || chVar.m() || ((visibleDialog instanceof x40) && !((x40) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.t0;
            if (importingHistory == null) {
                if (!this.S || ((!z10 || this.T != -1) && this.T != 5)) {
                    int i11 = this.T;
                    if (i11 == -1 || i11 == 5) {
                        this.S = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.S = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(rr.f);
                this.f.addListener(new p10(this, 4));
                this.f.start();
                return;
            }
            if (this.T != 5 && this.f != null && !z10) {
                this.y0 = true;
                return;
            }
            s(5);
            if (z10 && this.R == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                w10 w10Var = this.o0;
                if (w10Var != null) {
                    ((er0) w10Var).a(true);
                    ((er0) this.o0).a(false);
                }
            }
            if (!this.S) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f = new AnimatorSet();
                    w10 w10Var2 = this.o0;
                    if (w10Var2 != null) {
                        ((er0) w10Var2).a(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new p10(this, 5));
                    this.f.start();
                }
                this.S = true;
                setVisibility(0);
            }
            int i12 = this.P;
            int i13 = importingHistory.uploadProgress;
            if (i12 != i13) {
                this.P = i13;
                this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z10) {
        String formatPluralString;
        String string;
        org.telegram.ui.ActionBar.m2 m2Var = this.h;
        View fragmentView = m2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = m2Var instanceof org.telegram.ui.qy;
        boolean isSharingLocation = z11 ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(m2Var.getCurrentAccount()).isSharingLocation(this.n.a());
        org.telegram.ui.Cells.t6 t6Var = this.s0;
        if (!isSharingLocation) {
            this.r0 = -1;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            if (this.S) {
                this.S = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(200L);
                this.f.addListener(new p10(this, 0));
                this.f.start();
                return;
            }
            return;
        }
        b();
        s(2);
        this.b.setImageDrawable(new vq0(getContext(), 1));
        if (z10 && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.S) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new p10(this, 1));
                this.f.start();
            }
            this.S = true;
            setVisibility(0);
        }
        if (!z11) {
            t6Var.run();
            f();
            return;
        }
        String string2 = LocaleController.getString(R.string.LiveLocationContext);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.addAll(LocationController.getInstance(i10).sharingLocationsUI);
        }
        if (arrayList.size() == 1) {
            LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) arrayList.get(0);
            long dialogId = sharingLocationInfo.messageObject.getDialogId();
            if (DialogObject.isUserDialog(dialogId)) {
                formatPluralString = UserObject.getFirstName(MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                formatPluralString = chat != null ? chat.title : "";
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
            }
        } else {
            formatPluralString = LocaleController.formatPluralString("Chats", arrayList.size(), new Object[0]);
            string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
        }
        String format = String.format(string, string2, formatPluralString);
        int indexOf = format.indexOf(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i11 = 0;
        while (i11 < 2) {
            s10 s10Var = this.d;
            TextView textView = i11 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i11++;
        }
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t7, this.p0)), indexOf, string2.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i10 == NotificationCenter.liveLocationsChanged) {
            d(false);
            return;
        }
        if (i10 == NotificationCenter.liveStoryUpdated) {
            e(false);
            return;
        }
        int i12 = NotificationCenter.liveLocationsCacheChanged;
        ch chVar = this.n;
        if (i10 == i12) {
            if (chVar != null) {
                if (chVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.didEndCall) {
            int i13 = this.T;
            if (i13 == 1 || i13 == 3 || i13 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i14 = NotificationCenter.didStartedCall;
        if (i10 == i14 || i10 == NotificationCenter.groupCallUpdated || i10 == NotificationCenter.groupCallVisibilityChanged) {
            a(false);
            if (this.T != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i10 == i14) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.x == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i10 == NotificationCenter.groupCallTypingsUpdated) {
            b();
            if (this.S && this.T == 4) {
                ChatObject.Call groupCall = chVar.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.isScheduled()) {
                        this.e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        int i15 = groupCall2.participants_count;
                        if (i15 == 0) {
                            this.e.b(LocaleController.getString(groupCall2.rtmp_stream ? R.string.ViewersWatchingNobody : R.string.MembersTalkingNobody), false);
                        } else {
                            this.e.b(LocaleController.formatPluralString(groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", i15, new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.historyImportProgressChanged) {
            int i16 = this.T;
            if (i16 == 1 || i16 == 3 || i16 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
            r(true);
            return;
        }
        int i17 = NotificationCenter.webRtcMicAmplitudeEvent;
        jd jdVar = this.a;
        if (i10 == i17) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.F0 = 0.0f;
            } else {
                this.F0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.h6.D0().a(Math.max(this.E0, this.F0));
                jdVar.d(Math.max(this.E0, this.F0));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.T == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.E0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.F0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.ui.ActionBar.h6.D0().a(Math.max(this.E0, this.F0));
            jdVar.d(Math.max(this.E0, this.F0));
        }
        this.a0.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        float f7;
        float f10;
        long j3;
        int i10;
        float f11;
        boolean z12;
        float f12;
        float f13;
        long j10;
        x10 x10Var;
        float f14;
        MessageObject playingMessageObject;
        if (this.r == null) {
            return;
        }
        if (!this.J0 || getVisibility() == 0) {
            int i11 = this.T;
            float f15 = 1.0f;
            if (i11 == 3 || i11 == 1) {
                org.telegram.ui.ActionBar.h6.D0().c(this.H0);
                this.a.f(this.H0);
                AndroidUtilities.dp(getStyleHeight());
                y10 D0 = org.telegram.ui.ActionBar.h6.D0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path = D0.n;
                Paint paint = D0.m;
                int i12 = 0;
                while (true) {
                    x10[] x10VarArr = D0.a;
                    if (i12 >= x10VarArr.length) {
                        break;
                    }
                    x10 x10Var2 = x10VarArr[i12];
                    int i13 = x10Var2.i;
                    if (i13 == 0) {
                        if (x10Var2.j != org.telegram.ui.ActionBar.h6.w0(null, x10Var2.m, false) || x10Var2.k != org.telegram.ui.ActionBar.h6.w0(null, x10Var2.n, false)) {
                            x10Var2.a();
                        }
                    } else if (i13 == 1) {
                        if (x10Var2.j != org.telegram.ui.ActionBar.h6.w0(null, x10Var2.o, false) || x10Var2.k != org.telegram.ui.ActionBar.h6.w0(null, x10Var2.p, false)) {
                            x10Var2.a();
                        }
                    } else if (i13 == 3 && (x10Var2.j != org.telegram.ui.ActionBar.h6.w0(null, x10Var2.q, false) || x10Var2.k != org.telegram.ui.ActionBar.h6.w0(null, x10Var2.r, false))) {
                        x10Var2.a();
                    }
                    i12++;
                }
                boolean z13 = D0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    x10 x10Var3 = D0.b;
                    if (x10Var3 != null && (x10Var = D0.c) != null) {
                        int i14 = x10Var.i;
                        int i15 = x10Var3.i;
                        if ((i15 == 1 && i14 == 0) || (i14 == 1 && i15 == 0)) {
                            z10 = true;
                            z11 = z13;
                            if (z13) {
                                f7 = measuredWidth;
                                f10 = 0.0f;
                                j3 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f7 = measuredWidth;
                                f10 = 0.0f;
                                long j11 = elapsedRealtime - D0.j;
                                D0.j = elapsedRealtime;
                                if (j11 > 20) {
                                    j11 = 17;
                                }
                                j3 = j11;
                                if (j11 < 3) {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                float f16 = D0.g;
                                float f17 = D0.e;
                                if (f16 != f17) {
                                    float f18 = D0.h;
                                    float f19 = (j3 * f18) + f17;
                                    D0.e = f19;
                                    if (f18 > 0.0f) {
                                        if (f19 > f16) {
                                            D0.e = f16;
                                        }
                                    } else if (f19 < f16) {
                                        D0.e = f16;
                                    }
                                    invalidate();
                                }
                                float f20 = D0.g;
                                float f21 = D0.f;
                                if (f20 != f21) {
                                    float f22 = D0.i;
                                    float f23 = (j3 * f22) + f21;
                                    D0.f = f23;
                                    if (f22 > 0.0f) {
                                        if (f23 > f20) {
                                            D0.f = f20;
                                        }
                                    } else if (f23 < f20) {
                                        D0.f = f20;
                                    }
                                    invalidate();
                                }
                                if (D0.c != null) {
                                    float f24 = (j3 / 250.0f) + D0.k;
                                    D0.k = f24;
                                    if (f24 > 1.0f) {
                                        D0.k = 1.0f;
                                        D0.c = null;
                                    }
                                    invalidate();
                                }
                            }
                            i10 = 0;
                            while (i10 < 2) {
                                if (i10 == 0 && D0.c == null) {
                                    z12 = z10;
                                    f13 = f7;
                                    j10 = j3;
                                } else {
                                    if (i10 == 0) {
                                        f12 = f15 - D0.k;
                                        D0.c.b(paint);
                                        z12 = z10;
                                    } else {
                                        x10 x10Var4 = D0.b;
                                        if (x10Var4 == null) {
                                            break;
                                        }
                                        float f25 = D0.c != null ? D0.k : 1.0f;
                                        if (z11) {
                                            int i16 = (int) (measuredHeight - f10);
                                            int i17 = (int) (f7 - 0.0f);
                                            float f26 = D0.e;
                                            Matrix matrix = x10Var4.h;
                                            int i18 = x10Var4.i;
                                            if (i18 == 2) {
                                                f11 = f25;
                                                z12 = z10;
                                            } else {
                                                float f27 = x10Var4.e;
                                                if (f27 == 0.0f || x10Var4.f >= f27) {
                                                    f11 = f25;
                                                    x10Var4.e = Utilities.random.nextInt(700) + 500;
                                                    x10Var4.f = 0.0f;
                                                    if (x10Var4.a != -1.0f) {
                                                        z12 = z10;
                                                    } else if (i18 == 3) {
                                                        z12 = z10;
                                                        x10Var4.a = a4.a.B(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        x10Var4.b = a4.a.B(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else {
                                                        z12 = z10;
                                                        if (i18 == 0) {
                                                            x10Var4.a = a4.a.B(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                            x10Var4.b = a4.a.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                        } else {
                                                            x10Var4.a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                            x10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                        }
                                                    }
                                                    x10Var4.c = x10Var4.a;
                                                    x10Var4.d = x10Var4.b;
                                                    if (i18 == 3) {
                                                        x10Var4.a = a4.a.B(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        x10Var4.b = a4.a.B(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else if (i18 == 0) {
                                                        x10Var4.a = a4.a.B(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                        x10Var4.b = a4.a.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                    } else {
                                                        x10Var4.a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                        x10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                    }
                                                } else {
                                                    f11 = f25;
                                                    z12 = z10;
                                                }
                                                float f28 = j3;
                                                float f29 = (f28 * 0.02f * f26) + (f28 * 1.0f) + x10Var4.f;
                                                x10Var4.f = f29;
                                                float f30 = x10Var4.e;
                                                if (f29 > f30) {
                                                    x10Var4.f = f30;
                                                }
                                                float interpolation = rr.g.getInterpolation(x10Var4.f / f30);
                                                float f31 = i17;
                                                float f32 = x10Var4.c;
                                                float f33 = ((((x10Var4.a - f32) * interpolation) + f32) * f31) - 200.0f;
                                                float f34 = x10Var4.d;
                                                float f35 = ((((x10Var4.b - f34) * interpolation) + f34) * i16) - 200.0f;
                                                float f36 = (f31 / 400.0f) * ((i18 == 0 || i18 == 3) ? 3.0f : 1.5f);
                                                matrix.reset();
                                                matrix.postTranslate(f33, f35);
                                                matrix.postScale(f36, f36, f33 + 200.0f, f35 + 200.0f);
                                                x10Var4.g.setLocalMatrix(matrix);
                                            }
                                        } else {
                                            f11 = f25;
                                            z12 = z10;
                                        }
                                        D0.b.b(paint);
                                        f12 = f11;
                                    }
                                    if (i10 == 1 && z12) {
                                        paint.setAlpha(255);
                                    } else if (i10 == 1) {
                                        paint.setAlpha((int) (255.0f * f12));
                                    } else {
                                        paint.setAlpha(255);
                                    }
                                    if (i10 == 1 && z12) {
                                        path.rewind();
                                        float f37 = f7;
                                        j10 = j3;
                                        path.addCircle(f7 - AndroidUtilities.dp(18.0f), com.google.android.gms.internal.vision.e2.A(measuredHeight, 0.0f, 2.0f, 0.0f), org.telegram.messenger.f0.z(f37, 0.0f, 1.1f, f12), Path.Direction.CW);
                                        canvas.save();
                                        canvas.clipPath(path);
                                        f13 = f37;
                                        canvas.drawRoundRect(0.0f, 0.0f, f13, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                        canvas.restore();
                                    } else {
                                        f13 = f7;
                                        j10 = j3;
                                        canvas.drawRoundRect(0.0f, 0.0f, f13, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                    }
                                }
                                i10++;
                                j3 = j10;
                                z10 = z12;
                                f15 = 1.0f;
                                f10 = 0.0f;
                                f7 = f13;
                            }
                        }
                    }
                    z10 = false;
                    z11 = z13;
                    if (z13) {
                    }
                    if (z11) {
                    }
                    i10 = 0;
                    while (i10 < 2) {
                    }
                }
                f14 = 1.0f;
                invalidate();
            } else {
                f14 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.T == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f38 = -AndroidUtilities.dpf2(f14);
                float lerp = AndroidUtilities.lerp(f38, AndroidUtilities.dpf2(f14) + getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight2 = getMeasuredHeight();
                float dpf2 = measuredHeight2 - AndroidUtilities.dpf2(2.0f);
                int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.hl, this.p0);
                Paint paint2 = this.I0;
                paint2.setColor(v02);
                canvas.drawRoundRect(f38, dpf2, lerp, measuredHeight2, AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(f14), paint2);
            }
            this.H0 = true;
        }
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        ai.d2 d2Var = ai.d2.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.t0;
        if (d2Var != null) {
            b();
            int i10 = this.T;
            if (6 != i10 && this.f != null && !z10) {
                this.w0 = true;
                return;
            }
            if (6 != i10 && this.S && !z10) {
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(rr.f);
                this.f.addListener(new p10(this, 7));
                this.f.start();
                return;
            }
            s(6);
            if (this.S) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z10) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.u0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(rr.f);
                    this.f.addListener(new p10(this, 8));
                    this.f.start();
                }
                this.S = true;
                setVisibility(0);
            }
        } else {
            boolean z11 = this.S;
            if (z11 && ((z10 && this.T == -1) || this.T == 6)) {
                this.S = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(rr.f);
                    this.f.addListener(new p10(this, 6));
                    this.f.start();
                }
            } else if (z11 && this.T == -1) {
                this.S = false;
                setVisibility(8);
            }
        }
        ai.d2 d2Var2 = ai.d2.W;
        if (d2Var2 == null || this.T != 6) {
            return;
        }
        s10 s10Var = this.d;
        TLRPC.GroupCall groupCall = d2Var2.v;
        s10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i10;
        String format;
        ch chVar = this.n;
        if (chVar == null || this.d == null) {
            return;
        }
        b();
        long a2 = chVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
        if (!this.q0) {
            LocationController.getInstance(currentAccount).loadLiveLocations(a2);
            this.q0 = true;
        }
        TLRPC.User user = null;
        if (arrayList != null) {
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (user == null && fromChatId != clientUserId) {
                        user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(fromChatId));
                    }
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        if (this.r0 == i10) {
            return;
        }
        this.r0 = i10;
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i10 == 0) {
            format = string;
        } else {
            int i12 = i10 - 1;
            format = LocationController.getInstance(currentAccount).isSharingLocation(a2) ? i12 != 0 ? (i12 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user))) : String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName)) : i12 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
        }
        if (format.equals(this.U)) {
            return;
        }
        this.U = format;
        int indexOf = format.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i13 = 0;
        while (i13 < 2) {
            s10 s10Var = this.d;
            TextView textView = i13 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i13++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t7, this.p0)), indexOf, string.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        ch chVar;
        SpannableStringBuilder spannableStringBuilder;
        if (this.S) {
            int i10 = this.T;
            if (i10 == 1 || i10 == 3) {
                return;
            }
            if ((i10 == 4 || i10 == 5) && !j()) {
                return;
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = this.S;
        AnimationNotificationsLocker animationNotificationsLocker = this.t0;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.Q = null;
            boolean z12 = (!this.W || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || a30.c()) ? false : true;
            if (!j() && !z12 && (chVar = this.n) != null && !a30.c()) {
                ChatObject.Call groupCall = chVar.getGroupCall();
                z12 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z12) {
                a(false);
                return;
            }
            if (!this.S) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.F;
            if (u0Var != null && u0Var.t()) {
                this.F.M(null, null);
            }
            this.S = false;
            if (z10) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            w10 w10Var = this.o0;
            if (w10Var != null) {
                ((er0) w10Var).a(true);
            }
            this.f.addListener(new p10(this, 2));
            this.f.start();
            return;
        }
        b();
        int i11 = this.T;
        if (i11 != 0 && this.f != null && !z10) {
            this.x0 = true;
            return;
        }
        s(0);
        if (z10 && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            w10 w10Var2 = this.o0;
            if (w10Var2 != null) {
                ((er0) w10Var2).a(true);
                ((er0) this.o0).a(false);
            }
        }
        if (!this.S) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                this.f = new AnimatorSet();
                w10 w10Var3 = this.o0;
                if (w10Var3 != null) {
                    ((er0) w10Var3).a(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new p10(this, 3));
                this.f.start();
            }
            this.S = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.c.a(false, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.c.a(true, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        if (this.Q == playingMessageObject && i11 == 0) {
            return;
        }
        this.Q = playingMessageObject;
        if (playingMessageObject.isVoice() || this.Q.isRoundVideo()) {
            this.V = false;
            org.telegram.ui.ActionBar.u0 u0Var2 = this.F;
            if (u0Var2 != null) {
                u0Var2.setAlpha(1.0f);
                this.F.setEnabled(true);
            }
            this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.M, 0);
            spannableStringBuilder = new SpannableStringBuilder(a4.a.D(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i12 = 0;
            while (i12 < 2) {
                s10 s10Var = this.d;
                TextView textView = i12 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            r(false);
        } else {
            this.V = true;
            if (this.F == null) {
                this.d.setPadding(0, 0, this.M, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.F.setAlpha(1.0f);
                this.F.setEnabled(true);
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.M, 0);
                r(false);
            } else {
                this.F.setAlpha(0.0f);
                this.F.setEnabled(false);
                this.d.setPadding(0, 0, this.M, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a4.a.D(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i13 = 0;
            while (i13 < 2) {
                s10 s10Var2 = this.d;
                TextView textView2 = i13 == 0 ? s10Var2.getTextView() : s10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t7, this.p0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        this.d.b(spannableStringBuilder, !z10 && z11 && this.V);
    }

    public jd getCapsuleBlobDrawable() {
        return this.a;
    }

    public int getCurrentStyle() {
        return this.T;
    }

    public int getStyleHeight() {
        return this.T == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.R;
    }

    public final void h() {
        if (this.F != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.h6.j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.p0;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), false, this.p0);
        this.F = u0Var;
        u0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        int i11 = 0;
        this.F.setLongClickEnabled(false);
        this.F.setVisibility(8);
        this.F.setTag(null);
        this.F.setShowSubmenuByMove(false);
        this.F.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.F.setDelegate(new k10(this));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.F;
        fd fdVar = new fd();
        this.G = fdVar;
        u0Var2.setIcon(fdVar);
        int i12 = 3;
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(getContext(), d6Var);
        this.H = a1Var;
        a1Var.setRoundRadiusDp(6.0f);
        this.H.setDrawShadow(true);
        this.H.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.s0 u10 = this.F.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.s0[] s0VarArr = this.I;
        s0VarArr[0] = u10;
        s0VarArr[1] = this.F.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        s0VarArr[2] = this.F.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        s0VarArr[3] = this.F.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        s0VarArr[4] = this.F.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        s0VarArr[5] = this.F.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.F.setPadding(0, 1, 0, 0);
        }
        this.F.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.F, w7.y5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.F.setOnClickListener(new et(i12, this, fArr));
        this.F.setOnLongClickListener(new n10(this, i11));
        r(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i10 = this.T;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.m2 m2Var = this.h;
            if (m2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) m2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.cd0 cd0Var = new org.telegram.ui.cd0(2);
                cd0Var.u0(sharingLocationInfo.messageObject);
                cd0Var.F0 = new ai.z1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(cd0Var);
            }
        }
    }

    public final void l(float f7, float f10, boolean z10) {
        String formatString;
        int i10;
        if (i(f7, f10)) {
            return;
        }
        if (Math.abs(f10 - 1.0f) < 0.05f) {
            if (f7 < f10) {
                return;
            }
            formatString = LocaleController.getString(R.string.AudioSpeedNormal);
            i10 = Math.abs(f7 - 2.0f) < 0.05f ? R.raw.speed_2to1 : f10 < f7 ? R.raw.speed_slow : R.raw.speed_fast;
        } else if (z10 && i(f10, 1.5f) && i(f7, 1.0f)) {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, fd.a(f10));
            i10 = R.raw.speed_1to15;
        } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
            formatString = LocaleController.getString(R.string.AudioSpeedFast);
            i10 = R.raw.speed_15to2;
        } else {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, fd.a(f10));
            i10 = f10 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        yc.a0(this.h).Q(i10, 36, formatString).j();
    }

    public final void m() {
        NotificationCenter.ObserversGroup observersGroup = this.D0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.D0 = null;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.ObserversGroup[] observersGroupArr = this.C0;
            NotificationCenter.ObserversGroup observersGroup2 = observersGroupArr[i10];
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                observersGroupArr[i10] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.h hVar = this.N;
        if (hVar == null || hVar.g < 1.0f) {
            this.G0 = true;
        } else {
            this.G0 = false;
            AndroidUtilities.runOnUIThread(new o10(this, 0), 150L);
        }
    }

    public final void o(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.a0.a.f) != null) {
            valueAnimator.cancel();
            this.a0.a.f = null;
        }
        j9 j9Var = this.a0.a;
        if (j9Var.f != null) {
            j9Var.g = true;
            return;
        }
        int i11 = this.T;
        int i12 = this.m0;
        ch chVar = this.n;
        if (i11 == 4) {
            if (chVar != null) {
                call = chVar.getGroupCall();
                i12 = this.h.getCurrentAccount();
            } else {
                call = null;
            }
            i10 = i12;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            call = VoIPService.getSharedInstance().groupCall;
            user = chVar != null ? null : VoIPService.getSharedInstance().getUser();
            i10 = VoIPService.getSharedInstance().getAccount();
        } else {
            call = null;
            i10 = i12;
            user = null;
        }
        if (call != null) {
            int size = call.sortedParticipants.size();
            for (int i13 = 0; i13 < 3; i13++) {
                if (i13 < size) {
                    this.a0.b(i13, call.sortedParticipants.get(i13), i10);
                } else {
                    this.a0.b(i13, null, i10);
                }
            }
        } else if (user != null) {
            this.a0.b(0, user, i10);
            for (int i14 = 1; i14 < 3; i14++) {
                this.a0.b(i14, null, i10);
            }
        } else {
            for (int i15 = 0; i15 < 3; i15++) {
                this.a0.b(i15, null, i10);
            }
        }
        this.a0.a(z10);
        if (this.T != 4 || call == null) {
            return;
        }
        int min = call.call.rtmp_stream ? 0 : Math.min(3, call.sortedParticipants.size());
        int f7 = (min == 0 ? 10 : hg.c.f(min, 1, 24, 52)) + 3;
        if (z10) {
            int i16 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (AndroidUtilities.dp(f7) != i16) {
                float translationX = (this.d.getTranslationX() + i16) - AndroidUtilities.dp(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                rr rrVar = rr.f;
                duration.setInterpolator(rrVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(rrVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f10 = f7;
        this.d.setLayoutParams(w7.y5.d(-1, 20.0f, 51, f10, 5.0f, call.isScheduled() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(w7.y5.d(-1, 20.0f, 51, f10, 25.0f, call.isScheduled() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.n0) {
            this.D0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.liveLocationsChanged).add(NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                this.C0[i10] = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.groupCallTypingsUpdated).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.liveStoryUpdated).add(NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            this.D0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.messagePlayingSpeedChanged).add(NotificationCenter.didStartedCall).add(NotificationCenter.didEndCall).add(NotificationCenter.webRtcSpeakerAmplitudeEvent).add(NotificationCenter.webRtcMicAmplitudeEvent).add(NotificationCenter.groupCallVisibilityChanged);
            if (ai.d2.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || a30.c()) {
                ch chVar = this.n;
                if (chVar != null && this.h.getSendMessagesHelper().getImportingHistory(chVar.a()) != null && !j()) {
                    c(true);
                } else if (chVar == null || chVar.getGroupCall() == null || !chVar.getGroupCall().shouldShowPanel() || a30.c() || j()) {
                    a(true);
                    g(true);
                    r(false);
                } else {
                    a(true);
                }
            } else {
                a(true);
            }
        }
        int i11 = this.T;
        if (i11 == 3 || i11 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.h6.D0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            jd jdVar = this.a;
            if (!jdVar.u) {
                jdVar.u = true;
                jdVar.t = SystemClock.elapsedRealtime();
                yf.h.d().a(60, jdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.O != z10 && this.x != null) {
                this.O = z10;
                this.y.P(z10 ? 15 : 29);
                ij0 ij0Var = this.y;
                ij0Var.N(ij0Var.f - 1, false, true);
                this.x.invalidate();
            }
        } else if (i11 == 4 && !this.k0) {
            this.k0 = true;
            this.l0.run();
        }
        if (this.S && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.E0 = 0.0f;
        this.F0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z11 = this.O;
        jd jdVar = this.a;
        if (z11 != z10) {
            this.O = z10;
            this.y.P(z10 ? 15 : 29);
            ij0 ij0Var = this.y;
            ij0Var.N(ij0Var.f - 1, false, true);
            this.x.invalidate();
            org.telegram.ui.ActionBar.h6.D0().c(this.S);
            jdVar.f(this.S);
        }
        if (this.O) {
            this.F0 = 0.0f;
            org.telegram.ui.ActionBar.h6.D0().a(0.0f);
            jdVar.d(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.u0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (this.k0) {
            AndroidUtilities.cancelRunOnUIThread(this.l0);
            this.k0 = false;
        }
        this.S = false;
        this.t0.unlock();
        this.R = 0.0f;
        m();
        if (!this.n0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.T;
        if (i11 == 3 || i11 == 1) {
            y10 D0 = org.telegram.ui.ActionBar.h6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            jd jdVar = this.a;
            if (jdVar.u) {
                jdVar.u = false;
                yf.h.d().f(jdVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.H0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.s == null) {
            return;
        }
        int i10 = this.T;
        if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
            this.N0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.M0.i(new v10(this.s, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i10 = this.N0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.N0 = i11;
            if (i11 == 0) {
                this.M0.i(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        p();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final void p() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.T;
            if (i10 == 1 || i10 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(LocaleController.getString(R.string.VoipGroupConnecting), false);
                    return;
                }
                if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                    if (call.sortedParticipants.size() <= 1) {
                        this.d.b(LocaleController.getString(R.string.ConferenceChat), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb2.append(" ");
                        sb2.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                ch chVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (chVar == null || chVar.i() == null || chVar.i().id != user.id) {
                            this.d.setText(ContactsController.formatName(user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(LocaleController.getString(R.string.ReturnToCall));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                    this.d.b(sharedInstance.groupCall.call.title, false);
                    return;
                }
                if (chVar == null || chVar.g() == null || chVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g10 = chVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else if (ChatObject.isChannelOrGiga(g10)) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else {
                    this.d.b(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                }
            }
        }
    }

    public final void q() {
        s51[] s51VarArr;
        int i10 = !i(MediaController.getInstance().getPlaybackSpeed(this.V), 1.0f) ? org.telegram.ui.ActionBar.h6.Qh : org.telegram.ui.ActionBar.h6.x7;
        org.telegram.ui.ActionBar.d6 d6Var = this.p0;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        fd fdVar = this.G;
        if (fdVar != null) {
            ((o6) fdVar.c).r(v02);
            Paint paint = (Paint) fdVar.b;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var != null) {
            u0Var.setBackground(org.telegram.ui.ActionBar.h6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.w7, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.x7, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            int i11 = 0;
            while (i11 < 2) {
                s10 s10Var = this.e;
                TextView textView = i11 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.x7, d6Var));
                }
                i11++;
            }
        }
        s10 s10Var2 = this.d;
        if (s10Var2 != null) {
            Object tag = s10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    s10 s10Var3 = this.d;
                    TextView textView2 = i12 == 0 ? s10Var3.getTextView() : s10Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(intValue, d6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (s51VarArr = (s51[]) ((Spanned) text).getSpans(0, text.length(), s51.class)) != null) {
                            for (s51 s51Var : s51VarArr) {
                                s51Var.b = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t7, d6Var);
                            }
                        }
                    }
                    i12++;
                }
            }
        }
    }

    public final void r(boolean z10) {
        if (this.G == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.V);
        this.G.l(playbackSpeed, z10);
        q();
        boolean z11 = this.z0;
        int i10 = 0;
        this.z0 = false;
        while (true) {
            org.telegram.ui.ActionBar.s0[] s0VarArr = this.I;
            if (i10 >= s0VarArr.length) {
                this.H.d(playbackSpeed, z10);
                return;
            }
            org.telegram.ui.ActionBar.d6 d6Var = this.p0;
            if (z11 || Math.abs(playbackSpeed - O0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.s0 s0Var = s0VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.h6.E8;
                s0Var.a(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            } else {
                org.telegram.ui.ActionBar.s0 s0Var2 = s0VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.h6.Qh;
                s0Var2.a(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
            }
            i10++;
        }
    }

    public final void s(int i10) {
        if (this.T == i10) {
            return;
        }
        b();
        int i11 = this.T;
        jd jdVar = this.a;
        if (i11 == 3 || i11 == 1) {
            y10 D0 = org.telegram.ui.ActionBar.h6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            if (jdVar.u) {
                jdVar.u = false;
                yf.h.d().f(jdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            le.m mVar = this.M0;
            if (mVar != null) {
                mVar.i(null, true);
            }
        }
        this.T = i10;
        this.r.setWillNotDraw(i10 != 4);
        if (i10 != 4) {
            this.g0 = false;
        }
        k9 k9Var = this.a0;
        if (k9Var != null) {
            k9Var.setStyle(this.T);
            this.a0.setLayoutParams(w7.y5.e(108, getStyleHeight(), 51));
        }
        this.r.setLayoutParams(w7.y5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f7 = this.R;
        if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.p0;
        if (i10 == 6) {
            this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.nk, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ok, d6Var)}));
            this.r.setTag(null);
            this.e.setVisibility(8);
            this.L.setVisibility(8);
            this.E.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.a0.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.A7));
            int i12 = 0;
            while (i12 < 2) {
                s10 s10Var = this.d;
                TextView textView = i12 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setLayoutParams(w7.y5.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i10 == 5) {
            this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.v7));
            int i13 = 0;
            while (i13 < 2) {
                s10 s10Var2 = this.d;
                TextView textView2 = i13 == 0 ? s10Var2.getTextView() : s10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.u7, d6Var));
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.u7));
            this.e.setVisibility(8);
            this.L.setVisibility(8);
            this.E.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.a0.setVisibility(8);
            this.w.setVisibility(0);
            this.w.d();
            this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
            org.telegram.ui.ActionBar.u0 u0Var = this.F;
            if (u0Var != null) {
                u0Var.setVisibility(8);
                this.F.setTag(null);
            }
            this.d.setLayoutParams(w7.y5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i10 == 0 || i10 == 2) {
            this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.v7));
            this.e.setVisibility(8);
            this.L.setVisibility(8);
            this.E.setVisibility(0);
            this.b.setVisibility(0);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.a0.setVisibility(8);
            int i14 = 0;
            while (i14 < 2) {
                s10 s10Var3 = this.d;
                TextView textView3 = i14 == 0 ? s10Var3.getTextView() : s10Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.u7, d6Var));
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.u7));
            if (i10 == 6) {
                this.b.setLayoutParams(w7.y5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(w7.y5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.E.setVisibility(8);
                return;
            } else {
                if (i10 != 0) {
                    this.b.setLayoutParams(w7.y5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.y5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                    return;
                }
                this.b.setLayoutParams(w7.y5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(w7.y5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.u0 u0Var2 = this.F;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(0);
                    this.F.setTag(1);
                }
                this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                return;
            }
        }
        if (i10 == 4) {
            this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.v7));
            this.x.setVisibility(8);
            this.e.setVisibility(0);
            int i15 = 0;
            while (i15 < 2) {
                s10 s10Var4 = this.d;
                TextView textView4 = i15 == 0 ? s10Var4.getTextView() : s10Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t7, d6Var));
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setTextSize(1, 15.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.t7));
            this.d.setPadding(0, 0, this.M, 0);
            this.w.setVisibility(8);
            this.w.i();
            ch chVar = this.n;
            this.a0.setVisibility(!((chVar == null || chVar.getGroupCall() == null || chVar.getGroupCall().call == null || !chVar.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.a0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
            }
            this.E.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.u0 u0Var3 = this.F;
            if (u0Var3 != null) {
                u0Var3.setVisibility(8);
                this.F.setTag(null);
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.v.setBackground(null);
            p();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.a0.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.a0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.x.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.O = z10;
            this.y.P(z10 ? 15 : 29);
            ij0 ij0Var = this.y;
            ij0Var.N(ij0Var.f - 1, false, true);
            this.x.invalidate();
            this.r.setBackground(null);
            this.r.setBackgroundColor(0);
            this.w.setVisibility(8);
            this.w.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.h6.D0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!jdVar.u) {
                jdVar.u = true;
                jdVar.t = SystemClock.elapsedRealtime();
                yf.h.d().a(60, jdVar.F);
            }
            invalidate();
            int i16 = 0;
            while (i16 < 2) {
                s10 s10Var5 = this.d;
                TextView textView5 = i16 == 0 ? s10Var5.getTextView() : s10Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var));
                    textView5.setTypeface(AndroidUtilities.bold());
                    textView5.setTextSize(1, 14.0f);
                }
                i16++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.A7));
            this.E.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.L.setVisibility(8);
            this.d.setLayoutParams(w7.y5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.M, 0);
            org.telegram.ui.ActionBar.u0 u0Var4 = this.F;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
                this.F.setTag(null);
            }
        }
    }

    public void setDelegate(w10 w10Var) {
        this.o0 = w10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.J0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.r == null) {
            this.L0 = f7;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        lj0 lj0Var = this.w;
        if (lj0Var != null) {
            lj0Var.setTranslationX(f7);
        }
        s10 s10Var = this.d;
        if (s10Var != null) {
            s10Var.setTranslationX(f7);
        }
        s10 s10Var2 = this.e;
        if (s10Var2 != null) {
            s10Var2.setTranslationX(f7);
        }
        k9 k9Var = this.a0;
        if (k9Var != null) {
            k9Var.setTranslationX(f7);
        }
    }

    public void setSupportsCalls(boolean z10) {
        this.W = z10;
    }

    public void setTopPadding(float f7) {
        this.R = f7;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.R);
        if (i10 == 8) {
            this.H0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.m2 m2Var, View view, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = new jd();
        this.I = new org.telegram.ui.ActionBar.s0[6];
        this.P = -1;
        this.T = -1;
        this.W = true;
        this.i0 = new o6(false, true, true, false);
        this.l0 = new q10(this);
        this.m0 = UserConfig.selectedAccount;
        this.r0 = -1;
        this.s0 = new org.telegram.ui.Cells.t6(this, 14);
        this.t0 = new AnimationNotificationsLocker();
        this.u0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new NotificationCenter.ObserversGroup[4];
        this.I0 = new Paint(1);
        this.K0 = 0;
        this.M0 = new le.m(new k10(this), rr.h, 450L);
        this.N0 = 0;
        this.p0 = d6Var;
        this.h = m2Var;
        if (m2Var instanceof ch) {
            this.n = (ch) m2Var;
        }
        this.S = true;
        this.n0 = z10;
        if (view == null) {
            ((ViewGroup) m2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
