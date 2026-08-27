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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener {
    public static final float[] I0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public ImageView A;
    public boolean A0;
    public org.telegram.ui.ActionBar.v0 B;
    public boolean B0;
    public af.g C;
    public final Paint C0;
    public org.telegram.ui.ActionBar.b1 D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.t0[] E;
    public int E0;
    public FrameLayout F;
    public float F0;
    public ImageView G;
    public final ud.j G0;
    public org.telegram.ui.ik H;
    public int H0;
    public int I;
    public org.telegram.ui.Components.voip.h J;
    public boolean K;
    public int L;
    public MessageObject M;
    public float N;
    public boolean O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public b9 T;
    public Paint U;
    public LinearGradient V;
    public Matrix W;
    public final vc a;
    public int a0;
    public ImageView b;
    public TextPaint b0;
    public tf0 c;
    public boolean c0;
    public f10 d;
    public boolean d0;
    public f10 e;
    public final i6 e0;
    public AnimatorSet f;
    public nc f0;
    public boolean g0;
    public final org.telegram.ui.ActionBar.n2 h;
    public final d10 h0;
    public final int i0;
    public final boolean j0;
    public j10 k0;
    public final org.telegram.ui.ActionBar.c6 l0;
    public boolean m0;
    public final ng n;
    public int n0;
    public final m.i3 o0;
    public final AnimationNotificationsLocker p0;
    public final AnimationNotificationsLocker q0;
    public e10 r;
    public boolean r0;
    public ag.d s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public View v;
    public boolean v0;
    public ri0 w;
    public org.telegram.ui.yi w0;
    public h10 x;
    public long x0;
    public oi0 y;
    public float y0;
    public float z0;

    public FragmentContextView(Context context, org.telegram.ui.gy gyVar, boolean z10) {
        this(context, gyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.P;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        return i10 == 4 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, c6Var) : (i10 == 1 || i10 == 3) ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.u7, c6Var);
    }

    public static boolean i(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
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
        if (this.O && this.P == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        View fragmentView = n2Var.getFragmentView();
        boolean z13 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean c10 = n20.c();
        ng ngVar = this.n;
        if (c10) {
            z11 = false;
        } else {
            z11 = (org.telegram.ui.s50.A3 || !this.S || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (!j() && !org.telegram.ui.s50.A3 && this.S && !z11 && ngVar != null && (groupCall = ngVar.getGroupCall()) != null && groupCall.shouldShowPanel()) {
                z11 = true;
                z12 = true;
                AnimationNotificationsLocker animationNotificationsLocker = this.p0;
                if (z11) {
                    boolean z14 = this.O;
                    if (z14 && ((z13 && this.P == -1) || (i11 = this.P) == 4 || i11 == 3 || i11 == 1)) {
                        this.O = false;
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
                            this.f.setInterpolator(er.f);
                            this.f.addListener(new c10(this, 9));
                            this.f.start();
                        }
                    } else if (z14 && ((i10 = this.P) == -1 || i10 == 4 || i10 == 3 || i10 == 1)) {
                        this.O = false;
                        setVisibility(8);
                    }
                    if (!z13 || ngVar == null || !ngVar.G() || n20.c()) {
                        return;
                    }
                    org.telegram.messenger.y1.q(R.string.InviteExpired, mc.a0(n2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z12 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.P;
                if (i12 != i13 && this.f != null && !z13) {
                    this.r0 = true;
                    return;
                }
                if (i12 != i13 && this.O && !z13) {
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
                    this.f.setInterpolator(er.f);
                    this.f.addListener(new c10(this, 10));
                    this.f.start();
                    return;
                }
                if (z12) {
                    boolean z15 = i13 == 4 && this.O;
                    r(4);
                    ChatObject.Call groupCall2 = ngVar.getGroupCall();
                    TLRPC.Chat g10 = ngVar.g();
                    if (groupCall2.isScheduled()) {
                        if (this.U == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.b0 = textPaint;
                            textPaint.setColor(-1);
                            this.b0.setTextSize(AndroidUtilities.dp(14.0f));
                            this.b0.setTypeface(AndroidUtilities.bold());
                            Paint paint = new Paint(1);
                            this.U = paint;
                            paint.setColor(-1);
                            this.W = new Matrix();
                        }
                        this.c0 = true;
                        LocaleController.getString(R.string.VoipChatNotify);
                        TLRPC.GroupCall groupCall3 = groupCall2.call;
                        this.d0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.H.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (ChatObject.isChannelOrGiga(g10)) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                        } else {
                            this.d.b(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                        }
                        this.e.b(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                        if (!this.g0) {
                            this.g0 = true;
                            this.h0.run();
                        }
                    } else {
                        this.c0 = false;
                        this.H.setVisibility(0);
                        this.H.setText(LocaleController.getString(R.string.VoipChatJoin));
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
                    n(this.T.a.d && z15);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    n(i13 == 1);
                    r(1);
                } else {
                    n(i13 == 3);
                    r(3);
                }
                if (this.O) {
                    return;
                }
                if (z13) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    m();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.q0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(er.f);
                    this.f.addListener(new c10(this, 11));
                    this.f.start();
                }
                this.O = true;
                setVisibility(0);
                return;
            }
        }
        z12 = false;
        AnimationNotificationsLocker animationNotificationsLocker2 = this.p0;
        if (z11) {
        }
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        e10 e10Var = new e10(this, context);
        this.r = e10Var;
        this.f0 = new nc(e10Var);
        int i10 = AndroidUtilities.displaySize.x;
        i6 i6Var = this.e0;
        i6Var.G = i10;
        i6Var.v = 0.4f;
        i6Var.setCallback(e10Var);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        addView(this.r, h7.z5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.r.addView(view, h7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i11 = org.telegram.ui.ActionBar.g6.w7;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.b;
        tf0 tf0Var = new tf0(16);
        this.c = tf0Var;
        imageView3.setImageDrawable(tf0Var);
        this.b.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i11, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.b, h7.z5.e(36, 36, 51));
        final int i12 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i13;
                long j10;
                TL_stories.StoryItem u10;
                int i14 = i12;
                FragmentContextView fragmentContextView = this.b;
                switch (i14) {
                    case 0:
                        ng ngVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ngVar.g();
                                TLRPC.User i15 = ngVar.i();
                                if (g10 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        int i17 = 6;
                        if (i16 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new b8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ngVar2 != null ? ngVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                j10 = ngVar2.a();
                                i13 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i13 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i13 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i13).getSharingLocationInfo(j10));
                                break;
                            } else {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i17));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        ri0 ri0Var = new ri0(context);
        this.w = ri0Var;
        ri0Var.setScaleType(scaleType);
        this.w.setAutoRepeat(true);
        this.w.f(R.raw.import_progress, 30, 30, null);
        this.w.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        addView(this.w, h7.z5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        f10 f10Var = new f10(this, context, context, 0);
        this.d = f10Var;
        addView(f10Var, h7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        f10 f10Var2 = new f10(this, context, context, 1);
        this.e = f10Var2;
        addView(f10Var2, h7.z5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.J = hVar;
        hVar.g = 1.0f;
        hVar.j = false;
        org.telegram.ui.ik ikVar = new org.telegram.ui.ik(this, context, 1);
        this.H = ikVar;
        ikVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.H.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        org.telegram.ui.ik ikVar2 = this.H;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        ikVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.H.setTextSize(1, 14.0f);
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setGravity(17);
        this.H.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.H, h7.z5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i13 = 3;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i14 = i13;
                FragmentContextView fragmentContextView = this.b;
                switch (i14) {
                    case 0:
                        ng ngVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ngVar.g();
                                TLRPC.User i15 = ngVar.i();
                                if (g10 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        int i17 = 6;
                        if (i16 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new b8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ngVar2 != null ? ngVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                j10 = ngVar2.a();
                                i132 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i17));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        if (this.A0) {
            m();
        }
        this.F = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.G = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.G;
        int i14 = org.telegram.ui.ActionBar.g6.x7;
        imageView5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        this.F.addView(this.G, h7.z5.e(20, 20, 17));
        this.F.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.F.setOnClickListener(new ag.l2(15));
        this.F.setVisibility(8);
        addView(this.F, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.j0) {
            h();
        }
        b9 b9Var = new b9(context, false);
        this.T = b9Var;
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.T.setDelegate(new b10(this, 1));
        this.T.setVisibility(8);
        addView(this.T, h7.z5.e(108, 36, 51));
        this.y = new oi0(R.raw.voice_muted, "" + R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        h10 h10Var = new h10(this, context);
        this.x = h10Var;
        h10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var), PorterDuff.Mode.SRC_IN));
        this.x.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.x.setAnimation(this.y);
        this.x.setScaleType(scaleType);
        this.x.setVisibility(8);
        addView(this.x, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i15 = 4;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i142 = i15;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        ng ngVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ngVar.g();
                                TLRPC.User i152 = ngVar.i();
                                if (g10 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        int i17 = 6;
                        if (i16 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new b8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ngVar2 != null ? ngVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                j10 = ngVar2.a();
                                i132 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i17));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        this.A = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        this.A.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.A.setScaleType(scaleType);
        addView(this.A, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 0;
        this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i142 = i16;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        ng ngVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ngVar.g();
                                TLRPC.User i152 = ngVar.i();
                                if (g10 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.P;
                        int i17 = 6;
                        if (i162 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new b8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ngVar2 != null ? ngVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                j10 = ngVar2.a();
                                i132 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i17));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        ag.d dVar = new ag.d(getContext(), 14);
        this.s = dVar;
        addView(dVar, h7.z5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i17 = 1;
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i142 = i17;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        ng ngVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ngVar.g();
                                TLRPC.User i152 = ngVar.i();
                                if (g10 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.P;
                        int i172 = 6;
                        if (i162 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new b8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ngVar2 != null ? ngVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                j10 = ngVar2.a();
                                i132 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i172));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        setLeftMargin(this.F0);
    }

    public final void c(boolean z10) {
        int i10;
        ng ngVar = this.n;
        if (ngVar != null) {
            if (this.O && ((i10 = this.P) == 1 || i10 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.n2 n2Var = this.h;
            SendMessagesHelper.ImportingHistory importingHistory = n2Var.getSendMessagesHelper().getImportingHistory(ngVar.a());
            View fragmentView = n2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = n2Var.getVisibleDialog();
            if ((j() || ngVar.n() || ((visibleDialog instanceof l40) && !((l40) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.p0;
            if (importingHistory == null) {
                if (!this.O || ((!z10 || this.P != -1) && this.P != 5)) {
                    int i11 = this.P;
                    if (i11 == -1 || i11 == 5) {
                        this.O = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.O = false;
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
                this.f.setInterpolator(er.f);
                this.f.addListener(new c10(this, 4));
                this.f.start();
                return;
            }
            if (this.P != 5 && this.f != null && !z10) {
                this.u0 = true;
                return;
            }
            r(5);
            if (z10 && this.N == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                j10 j10Var = this.k0;
                if (j10Var != null) {
                    ((cq0) j10Var).a(true);
                    ((cq0) this.k0).a(false);
                }
            }
            if (!this.O) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f = new AnimatorSet();
                    j10 j10Var2 = this.k0;
                    if (j10Var2 != null) {
                        ((cq0) j10Var2).a(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new c10(this, 5));
                    this.f.start();
                }
                this.O = true;
                setVisibility(0);
            }
            int i12 = this.L;
            int i13 = importingHistory.uploadProgress;
            if (i12 != i13) {
                this.L = i13;
                this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z10) {
        String formatPluralString;
        String string;
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        View fragmentView = n2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = n2Var instanceof org.telegram.ui.gy;
        boolean isSharingLocation = z11 ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(n2Var.getCurrentAccount()).isSharingLocation(this.n.a());
        m.i3 i3Var = this.o0;
        if (!isSharingLocation) {
            this.n0 = -1;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            if (this.O) {
                this.O = false;
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
                this.f.addListener(new c10(this, 0));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new tp0(getContext(), 1));
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.O) {
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
                this.f.addListener(new c10(this, 1));
                this.f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        if (!z11) {
            i3Var.run();
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
            f10 f10Var = this.d;
            TextView textView = i11 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i11++;
        }
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, this.l0)), indexOf, string2.length() + indexOf, 18);
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
        ng ngVar = this.n;
        if (i10 == i12) {
            if (ngVar != null) {
                if (ngVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.didEndCall) {
            int i13 = this.P;
            if (i13 == 1 || i13 == 3 || i13 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i14 = NotificationCenter.didStartedCall;
        if (i10 == i14 || i10 == NotificationCenter.groupCallUpdated || i10 == NotificationCenter.groupCallVisibilityChanged) {
            a(false);
            if (this.P != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
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
            if (this.O && this.P == 4) {
                ChatObject.Call groupCall = ngVar.getGroupCall();
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
                n(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.historyImportProgressChanged) {
            int i16 = this.P;
            if (i16 == 1 || i16 == 3 || i16 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
            q(true);
            return;
        }
        int i17 = NotificationCenter.webRtcMicAmplitudeEvent;
        vc vcVar = this.a;
        if (i10 == i17) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.z0 = 0.0f;
            } else {
                this.z0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.y0, this.z0));
                vcVar.d(Math.max(this.y0, this.z0));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.P == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.y0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.z0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.y0, this.z0));
            vcVar.d(Math.max(this.y0, this.z0));
        }
        this.T.invalidate();
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
        float f10;
        float f11;
        long j10;
        int i10;
        float f12;
        boolean z12;
        float f13;
        float f14;
        long j11;
        k10 k10Var;
        float f15;
        MessageObject playingMessageObject;
        if (this.r == null) {
            return;
        }
        if (!this.D0 || getVisibility() == 0) {
            int i11 = this.P;
            float f16 = 1.0f;
            if (i11 == 3 || i11 == 1) {
                org.telegram.ui.ActionBar.g6.D0().c(this.B0);
                this.a.f(this.B0);
                AndroidUtilities.dp(getStyleHeight());
                l10 D0 = org.telegram.ui.ActionBar.g6.D0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path = D0.n;
                Paint paint = D0.m;
                int i12 = 0;
                while (true) {
                    k10[] k10VarArr = D0.a;
                    if (i12 >= k10VarArr.length) {
                        break;
                    }
                    k10 k10Var2 = k10VarArr[i12];
                    int i13 = k10Var2.i;
                    if (i13 == 0) {
                        if (k10Var2.j != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.m, false) || k10Var2.k != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.n, false)) {
                            k10Var2.a();
                        }
                    } else if (i13 == 1) {
                        if (k10Var2.j != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.o, false) || k10Var2.k != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.p, false)) {
                            k10Var2.a();
                        }
                    } else if (i13 == 3 && (k10Var2.j != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.q, false) || k10Var2.k != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.r, false))) {
                        k10Var2.a();
                    }
                    i12++;
                }
                boolean z13 = D0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    k10 k10Var3 = D0.b;
                    if (k10Var3 != null && (k10Var = D0.c) != null) {
                        int i14 = k10Var.i;
                        int i15 = k10Var3.i;
                        if ((i15 == 1 && i14 == 0) || (i14 == 1 && i15 == 0)) {
                            z10 = true;
                            z11 = z13;
                            if (z13) {
                                f10 = measuredWidth;
                                f11 = 0.0f;
                                j10 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f10 = measuredWidth;
                                f11 = 0.0f;
                                long j12 = elapsedRealtime - D0.j;
                                D0.j = elapsedRealtime;
                                if (j12 > 20) {
                                    j12 = 17;
                                }
                                j10 = j12;
                                if (j12 < 3) {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                float f17 = D0.g;
                                float f18 = D0.e;
                                if (f17 != f18) {
                                    float f19 = D0.h;
                                    float f20 = (j10 * f19) + f18;
                                    D0.e = f20;
                                    if (f19 > 0.0f) {
                                        if (f20 > f17) {
                                            D0.e = f17;
                                        }
                                    } else if (f20 < f17) {
                                        D0.e = f17;
                                    }
                                    invalidate();
                                }
                                float f21 = D0.g;
                                float f22 = D0.f;
                                if (f21 != f22) {
                                    float f23 = D0.i;
                                    float f24 = (j10 * f23) + f22;
                                    D0.f = f24;
                                    if (f23 > 0.0f) {
                                        if (f24 > f21) {
                                            D0.f = f21;
                                        }
                                    } else if (f24 < f21) {
                                        D0.f = f21;
                                    }
                                    invalidate();
                                }
                                if (D0.c != null) {
                                    float f25 = (j10 / 250.0f) + D0.k;
                                    D0.k = f25;
                                    if (f25 > 1.0f) {
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
                                    f14 = f10;
                                    j11 = j10;
                                } else {
                                    if (i10 == 0) {
                                        f13 = f16 - D0.k;
                                        D0.c.b(paint);
                                        z12 = z10;
                                    } else {
                                        k10 k10Var4 = D0.b;
                                        if (k10Var4 == null) {
                                            break;
                                        }
                                        float f26 = D0.c != null ? D0.k : 1.0f;
                                        if (z11) {
                                            int i16 = (int) (measuredHeight - f11);
                                            int i17 = (int) (f10 - 0.0f);
                                            float f27 = D0.e;
                                            Matrix matrix = k10Var4.h;
                                            int i18 = k10Var4.i;
                                            if (i18 == 2) {
                                                f12 = f26;
                                                z12 = z10;
                                            } else {
                                                float f28 = k10Var4.e;
                                                if (f28 == 0.0f || k10Var4.f >= f28) {
                                                    f12 = f26;
                                                    k10Var4.e = Utilities.random.nextInt(700) + 500;
                                                    k10Var4.f = 0.0f;
                                                    if (k10Var4.a != -1.0f) {
                                                        z12 = z10;
                                                    } else if (i18 == 3) {
                                                        z12 = z10;
                                                        k10Var4.a = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        k10Var4.b = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else {
                                                        z12 = z10;
                                                        if (i18 == 0) {
                                                            k10Var4.a = a9.p.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                            k10Var4.b = a9.p.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                        } else {
                                                            k10Var4.a = s3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                            k10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                        }
                                                    }
                                                    k10Var4.c = k10Var4.a;
                                                    k10Var4.d = k10Var4.b;
                                                    if (i18 == 3) {
                                                        k10Var4.a = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        k10Var4.b = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else if (i18 == 0) {
                                                        k10Var4.a = a9.p.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                        k10Var4.b = a9.p.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                    } else {
                                                        k10Var4.a = s3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                        k10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                    }
                                                } else {
                                                    f12 = f26;
                                                    z12 = z10;
                                                }
                                                float f29 = j10;
                                                float f30 = (f29 * 0.02f * f27) + (f29 * 1.0f) + k10Var4.f;
                                                k10Var4.f = f30;
                                                float f31 = k10Var4.e;
                                                if (f30 > f31) {
                                                    k10Var4.f = f31;
                                                }
                                                float interpolation = er.g.getInterpolation(k10Var4.f / f31);
                                                float f32 = i17;
                                                float f33 = k10Var4.c;
                                                float f34 = ((((k10Var4.a - f33) * interpolation) + f33) * f32) - 200.0f;
                                                float f35 = k10Var4.d;
                                                float f36 = ((((k10Var4.b - f35) * interpolation) + f35) * i16) - 200.0f;
                                                float f37 = (f32 / 400.0f) * ((i18 == 0 || i18 == 3) ? 3.0f : 1.5f);
                                                matrix.reset();
                                                matrix.postTranslate(f34, f36);
                                                matrix.postScale(f37, f37, f34 + 200.0f, f36 + 200.0f);
                                                k10Var4.g.setLocalMatrix(matrix);
                                            }
                                        } else {
                                            f12 = f26;
                                            z12 = z10;
                                        }
                                        D0.b.b(paint);
                                        f13 = f12;
                                    }
                                    if (i10 == 1 && z12) {
                                        paint.setAlpha(255);
                                    } else if (i10 == 1) {
                                        paint.setAlpha((int) (255.0f * f13));
                                    } else {
                                        paint.setAlpha(255);
                                    }
                                    if (i10 == 1 && z12) {
                                        path.rewind();
                                        float f38 = f10;
                                        j11 = j10;
                                        path.addCircle(f10 - AndroidUtilities.dp(18.0f), com.google.android.recaptcha.internal.a.A(measuredHeight, 0.0f, 2.0f, 0.0f), org.telegram.messenger.y1.z(f38, 0.0f, 1.1f, f13), Path.Direction.CW);
                                        canvas.save();
                                        canvas.clipPath(path);
                                        f14 = f38;
                                        canvas.drawRoundRect(0.0f, 0.0f, f14, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                        canvas.restore();
                                    } else {
                                        f14 = f10;
                                        j11 = j10;
                                        canvas.drawRoundRect(0.0f, 0.0f, f14, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                    }
                                }
                                i10++;
                                j10 = j11;
                                z10 = z12;
                                f16 = 1.0f;
                                f11 = 0.0f;
                                f10 = f14;
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
                f15 = 1.0f;
                invalidate();
            } else {
                f15 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.P == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f39 = -AndroidUtilities.dpf2(f15);
                float lerp = AndroidUtilities.lerp(f39, AndroidUtilities.dpf2(f15) + getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight2 = getMeasuredHeight();
                float dpf2 = measuredHeight2 - AndroidUtilities.dpf2(2.0f);
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hl, this.l0);
                Paint paint2 = this.C0;
                paint2.setColor(v02);
                canvas.drawRoundRect(f39, dpf2, lerp, measuredHeight2, AndroidUtilities.dpf2(f15), AndroidUtilities.dpf2(f15), paint2);
            }
            this.B0 = true;
        }
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        jh.d1 d1Var = jh.d1.S;
        AnimationNotificationsLocker animationNotificationsLocker = this.p0;
        if (d1Var != null) {
            b();
            int i10 = this.P;
            if (6 != i10 && this.f != null && !z10) {
                this.s0 = true;
                return;
            }
            if (6 != i10 && this.O && !z10) {
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
                this.f.setInterpolator(er.f);
                this.f.addListener(new c10(this, 7));
                this.f.start();
                return;
            }
            r(6);
            if (this.O) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z10) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    m();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.q0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(er.f);
                    this.f.addListener(new c10(this, 8));
                    this.f.start();
                }
                this.O = true;
                setVisibility(0);
            }
        } else {
            boolean z11 = this.O;
            if (z11 && ((z10 && this.P == -1) || this.P == 6)) {
                this.O = false;
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
                    this.f.setInterpolator(er.f);
                    this.f.addListener(new c10(this, 6));
                    this.f.start();
                }
            } else if (z11 && this.P == -1) {
                this.O = false;
                setVisibility(8);
            }
        }
        jh.d1 d1Var2 = jh.d1.S;
        if (d1Var2 == null || this.P != 6) {
            return;
        }
        f10 f10Var = this.d;
        TLRPC.GroupCall groupCall = d1Var2.v;
        f10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i10;
        String format;
        ng ngVar = this.n;
        if (ngVar == null || this.d == null) {
            return;
        }
        b();
        long a2 = ngVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
        if (!this.m0) {
            LocationController.getInstance(currentAccount).loadLiveLocations(a2);
            this.m0 = true;
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
        if (this.n0 == i10) {
            return;
        }
        this.n0 = i10;
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i10 == 0) {
            format = string;
        } else {
            int i12 = i10 - 1;
            format = LocationController.getInstance(currentAccount).isSharingLocation(a2) ? i12 != 0 ? (i12 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user))) : String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName)) : i12 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
        }
        if (format.equals(this.Q)) {
            return;
        }
        this.Q = format;
        int indexOf = format.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i13 = 0;
        while (i13 < 2) {
            f10 f10Var = this.d;
            TextView textView = i13 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i13++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, this.l0)), indexOf, string.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        ng ngVar;
        SpannableStringBuilder spannableStringBuilder;
        if (this.O) {
            int i10 = this.P;
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
        boolean z11 = this.O;
        AnimationNotificationsLocker animationNotificationsLocker = this.p0;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.M = null;
            boolean z12 = (!this.S || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || n20.c()) ? false : true;
            if (!j() && !z12 && (ngVar = this.n) != null && !n20.c()) {
                ChatObject.Call groupCall = ngVar.getGroupCall();
                z12 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z12) {
                a(false);
                return;
            }
            if (!this.O) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.B;
            if (v0Var != null && v0Var.t()) {
                this.B.M(null, null);
            }
            this.O = false;
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
            j10 j10Var = this.k0;
            if (j10Var != null) {
                ((cq0) j10Var).a(true);
            }
            this.f.addListener(new c10(this, 2));
            this.f.start();
            return;
        }
        b();
        int i11 = this.P;
        if (i11 != 0 && this.f != null && !z10) {
            this.t0 = true;
            return;
        }
        r(0);
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            j10 j10Var2 = this.k0;
            if (j10Var2 != null) {
                ((cq0) j10Var2).a(true);
                ((cq0) this.k0).a(false);
            }
        }
        if (!this.O) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                this.f = new AnimatorSet();
                j10 j10Var3 = this.k0;
                if (j10Var3 != null) {
                    ((cq0) j10Var3).a(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new c10(this, 3));
                this.f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.c.a(false, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.c.a(true, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        if (this.M == playingMessageObject && i11 == 0) {
            return;
        }
        this.M = playingMessageObject;
        if (playingMessageObject.isVoice() || this.M.isRoundVideo()) {
            this.R = false;
            org.telegram.ui.ActionBar.v0 v0Var2 = this.B;
            if (v0Var2 != null) {
                v0Var2.setAlpha(1.0f);
                this.B.setEnabled(true);
            }
            this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
            spannableStringBuilder = new SpannableStringBuilder(a9.p.w(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i12 = 0;
            while (i12 < 2) {
                f10 f10Var = this.d;
                TextView textView = i12 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            q(false);
        } else {
            this.R = true;
            if (this.B == null) {
                this.d.setPadding(0, 0, this.I, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.B.setAlpha(1.0f);
                this.B.setEnabled(true);
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
                q(false);
            } else {
                this.B.setAlpha(0.0f);
                this.B.setEnabled(false);
                this.d.setPadding(0, 0, this.I, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a9.p.w(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i13 = 0;
            while (i13 < 2) {
                f10 f10Var2 = this.d;
                TextView textView2 = i13 == 0 ? f10Var2.getTextView() : f10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, this.l0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        this.d.b(spannableStringBuilder, !z10 && z11 && this.R);
    }

    public vc getCapsuleBlobDrawable() {
        return this.a;
    }

    public int getCurrentStyle() {
        return this.P;
    }

    public int getStyleHeight() {
        return this.P == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.N;
    }

    public final void h() {
        if (this.B != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false, this.l0);
        this.B = v0Var;
        v0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        int i11 = 0;
        this.B.setLongClickEnabled(false);
        this.B.setVisibility(8);
        this.B.setTag(null);
        this.B.setShowSubmenuByMove(false);
        this.B.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.B.setDelegate(new x00(this));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.B;
        af.g gVar = new af.g();
        this.C = gVar;
        v0Var2.setIcon(gVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), c6Var);
        this.D = b1Var;
        b1Var.setRoundRadiusDp(6.0f);
        this.D.setDrawShadow(true);
        this.D.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.t0 u10 = this.B.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.t0[] t0VarArr = this.E;
        t0VarArr[0] = u10;
        t0VarArr[1] = this.B.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        t0VarArr[2] = this.B.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        t0VarArr[3] = this.B.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        t0VarArr[4] = this.B.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        t0VarArr[5] = this.B.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.B.setPadding(0, 1, 0, 0);
        }
        this.B.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.B, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.B.setOnClickListener(new q2(21, this, fArr));
        this.B.setOnLongClickListener(new a10(this, i11));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i10 = this.P;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.n2 n2Var = this.h;
            if (n2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) n2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.tc0 tc0Var = new org.telegram.ui.tc0(2);
                tc0Var.u0(sharingLocationInfo.messageObject);
                tc0Var.B0 = new d3.e(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(tc0Var);
            }
        }
    }

    public final void l(float f10, float f11, boolean z10) {
        String formatString;
        int i10;
        if (i(f10, f11)) {
            return;
        }
        if (Math.abs(f11 - 1.0f) < 0.05f) {
            if (f10 < f11) {
                return;
            }
            formatString = LocaleController.getString(R.string.AudioSpeedNormal);
            i10 = Math.abs(f10 - 2.0f) < 0.05f ? R.raw.speed_2to1 : f11 < f10 ? R.raw.speed_slow : R.raw.speed_fast;
        } else if (z10 && i(f11, 1.5f) && i(f10, 1.0f)) {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, af.g.a(f11));
            i10 = R.raw.speed_1to15;
        } else if (z10 && i(f11, 2.0f) && i(f10, 1.5f)) {
            formatString = LocaleController.getString(R.string.AudioSpeedFast);
            i10 = R.raw.speed_15to2;
        } else {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, af.g.a(f11));
            i10 = f11 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        mc.a0(this.h).Q(i10, 36, formatString).j();
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.J;
        if (hVar == null || hVar.g < 1.0f) {
            this.A0 = true;
        } else {
            this.A0 = false;
            AndroidUtilities.runOnUIThread(new b10(this, 0), 150L);
        }
    }

    public final void n(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.T.a.f) != null) {
            valueAnimator.cancel();
            this.T.a.f = null;
        }
        a9 a9Var = this.T.a;
        if (a9Var.f != null) {
            a9Var.g = true;
            return;
        }
        int i11 = this.P;
        int i12 = this.i0;
        ng ngVar = this.n;
        if (i11 == 4) {
            if (ngVar != null) {
                call = ngVar.getGroupCall();
                i12 = this.h.getCurrentAccount();
            } else {
                call = null;
            }
            i10 = i12;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            call = VoIPService.getSharedInstance().groupCall;
            user = ngVar != null ? null : VoIPService.getSharedInstance().getUser();
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
                    this.T.b(i13, call.sortedParticipants.get(i13), i10);
                } else {
                    this.T.b(i13, null, i10);
                }
            }
        } else if (user != null) {
            this.T.b(0, user, i10);
            for (int i14 = 1; i14 < 3; i14++) {
                this.T.b(i14, null, i10);
            }
        } else {
            for (int i15 = 0; i15 < 3; i15++) {
                this.T.b(i15, null, i10);
            }
        }
        this.T.a(z10);
        if (this.P != 4 || call == null) {
            return;
        }
        int min = call.call.rtmp_stream ? 0 : Math.min(3, call.sortedParticipants.size());
        int e9 = (min == 0 ? 10 : i0.a.e(min, 1, 24, 52)) + 3;
        if (z10) {
            int i16 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (AndroidUtilities.dp(e9) != i16) {
                float translationX = (this.d.getTranslationX() + i16) - AndroidUtilities.dp(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                er erVar = er.f;
                duration.setInterpolator(erVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(erVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f10 = e9;
        this.d.setLayoutParams(h7.z5.d(-1, 20.0f, 51, f10, 5.0f, call.isScheduled() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(h7.z5.d(-1, 20.0f, 51, f10, 25.0f, call.isScheduled() ? 90 : 36, 0.0f));
    }

    public final void o() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.P;
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
                ng ngVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (ngVar == null || ngVar.i() == null || ngVar.i().id != user.id) {
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
                if (ngVar == null || ngVar.g() == null || ngVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g10 = ngVar.g();
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            if (jh.d1.S != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || n20.c()) {
                ng ngVar = this.n;
                if (ngVar != null && this.h.getSendMessagesHelper().getImportingHistory(ngVar.a()) != null && !j()) {
                    c(true);
                } else if (ngVar == null || ngVar.getGroupCall() == null || !ngVar.getGroupCall().shouldShowPanel() || n20.c() || j()) {
                    a(true);
                    g(true);
                    q(false);
                } else {
                    a(true);
                }
            } else {
                a(true);
            }
        }
        int i11 = this.P;
        if (i11 == 3 || i11 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.g6.D0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            vc vcVar = this.a;
            if (!vcVar.u) {
                vcVar.u = true;
                vcVar.t = SystemClock.elapsedRealtime();
                gf.k.d().a(60, vcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.K != z10 && this.x != null) {
                this.K = z10;
                this.y.N(z10 ? 15 : 29);
                oi0 oi0Var = this.y;
                oi0Var.L(oi0Var.f - 1, false, true);
                this.x.invalidate();
            }
        } else if (i11 == 4 && !this.g0) {
            this.g0 = true;
            this.h0.run();
        }
        if (this.O && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.y0 = 0.0f;
        this.z0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z11 = this.K;
        vc vcVar = this.a;
        if (z11 != z10) {
            this.K = z10;
            this.y.N(z10 ? 15 : 29);
            oi0 oi0Var = this.y;
            oi0Var.L(oi0Var.f - 1, false, true);
            this.x.invalidate();
            org.telegram.ui.ActionBar.g6.D0().c(this.O);
            vcVar.f(this.O);
        }
        if (this.K) {
            this.z0 = 0.0f;
            org.telegram.ui.ActionBar.g6.D0().a(0.0f);
            vcVar.d(0.0f);
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
        if (this.g0) {
            AndroidUtilities.cancelRunOnUIThread(this.h0);
            this.g0 = false;
        }
        this.O = false;
        this.p0.unlock();
        this.N = 0.0f;
        if (this.j0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsCacheChanged);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        }
        int i11 = this.P;
        if (i11 == 3 || i11 == 1) {
            l10 D0 = org.telegram.ui.ActionBar.g6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            vc vcVar = this.a;
            if (vcVar.u) {
                vcVar.u = false;
                gf.k.d().g(vcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.B0 = false;
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
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.s == null) {
            return;
        }
        int i10 = this.P;
        if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
            this.H0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.G0.i(new i10(this.s, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i10 = this.H0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.H0 = i11;
            if (i11 == 0) {
                this.G0.i(null, true);
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
        o();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final void p() {
        k41[] k41VarArr;
        int i10 = !i(MediaController.getInstance().getPlaybackSpeed(this.R), 1.0f) ? org.telegram.ui.ActionBar.g6.Qh : org.telegram.ui.ActionBar.g6.x7;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        af.g gVar = this.C;
        if (gVar != null) {
            ((i6) gVar.b).r(v02);
            Paint paint = (Paint) gVar.c;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.w7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.x7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            int i11 = 0;
            while (i11 < 2) {
                f10 f10Var = this.e;
                TextView textView = i11 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.x7, c6Var));
                }
                i11++;
            }
        }
        f10 f10Var2 = this.d;
        if (f10Var2 != null) {
            Object tag = f10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    f10 f10Var3 = this.d;
                    TextView textView2 = i12 == 0 ? f10Var3.getTextView() : f10Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(intValue, c6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (k41VarArr = (k41[]) ((Spanned) text).getSpans(0, text.length(), k41.class)) != null) {
                            for (k41 k41Var : k41VarArr) {
                                k41Var.b = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, c6Var);
                            }
                        }
                    }
                    i12++;
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.C == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.R);
        this.C.l(playbackSpeed, z10);
        p();
        boolean z11 = this.v0;
        int i10 = 0;
        this.v0 = false;
        while (true) {
            org.telegram.ui.ActionBar.t0[] t0VarArr = this.E;
            if (i10 >= t0VarArr.length) {
                this.D.d(playbackSpeed, z10);
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.l0;
            if (z11 || Math.abs(playbackSpeed - I0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.t0 t0Var = t0VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.E8;
                t0Var.a(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            } else {
                org.telegram.ui.ActionBar.t0 t0Var2 = t0VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.g6.Qh;
                t0Var2.a(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            }
            i10++;
        }
    }

    public final void r(int i10) {
        if (this.P == i10) {
            return;
        }
        b();
        int i11 = this.P;
        vc vcVar = this.a;
        if (i11 == 3 || i11 == 1) {
            l10 D0 = org.telegram.ui.ActionBar.g6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            if (vcVar.u) {
                vcVar.u = false;
                gf.k.d().g(vcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            ud.j jVar = this.G0;
            if (jVar != null) {
                jVar.i(null, true);
            }
        }
        this.P = i10;
        this.r.setWillNotDraw(i10 != 4);
        if (i10 != 4) {
            this.c0 = false;
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.setStyle(this.P);
            this.T.setLayoutParams(h7.z5.e(108, getStyleHeight(), 51));
        }
        this.r.setLayoutParams(h7.z5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f10 = this.N;
        if (f10 > 0.0f && f10 != AndroidUtilities.dp2(getStyleHeight())) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        if (i10 == 6) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.nk, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ok, c6Var)}));
            this.r.setTag(null);
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.T.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
            int i12 = 0;
            while (i12 < 2) {
                f10 f10Var = this.d;
                TextView textView = i12 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setLayoutParams(h7.z5.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i10 == 5) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v7));
            int i13 = 0;
            while (i13 < 2) {
                f10 f10Var2 = this.d;
                TextView textView2 = i13 == 0 ? f10Var2.getTextView() : f10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.u7, c6Var));
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.u7));
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.T.setVisibility(8);
            this.w.setVisibility(0);
            this.w.d();
            this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
            org.telegram.ui.ActionBar.v0 v0Var = this.B;
            if (v0Var != null) {
                v0Var.setVisibility(8);
                this.B.setTag(null);
            }
            this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i10 == 0 || i10 == 2) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v7));
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(0);
            this.b.setVisibility(0);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.T.setVisibility(8);
            int i14 = 0;
            while (i14 < 2) {
                f10 f10Var3 = this.d;
                TextView textView3 = i14 == 0 ? f10Var3.getTextView() : f10Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.u7, c6Var));
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.u7));
            if (i10 == 6) {
                this.b.setLayoutParams(h7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.A.setVisibility(8);
                return;
            } else {
                if (i10 != 0) {
                    this.b.setLayoutParams(h7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.A.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                    return;
                }
                this.b.setLayoutParams(h7.z5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.v0 v0Var2 = this.B;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(0);
                    this.B.setTag(1);
                }
                this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                return;
            }
        }
        if (i10 == 4) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v7));
            this.x.setVisibility(8);
            this.e.setVisibility(0);
            int i15 = 0;
            while (i15 < 2) {
                f10 f10Var4 = this.d;
                TextView textView4 = i15 == 0 ? f10Var4.getTextView() : f10Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, c6Var));
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setTextSize(1, 15.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.t7));
            this.d.setPadding(0, 0, this.I, 0);
            this.w.setVisibility(8);
            this.w.i();
            ng ngVar = this.n;
            this.T.setVisibility(!((ngVar == null || ngVar.getGroupCall() == null || ngVar.getGroupCall().call == null || !ngVar.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.T.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
            }
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var3 = this.B;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
                this.B.setTag(null);
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.v.setBackground(null);
            o();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.T.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.T.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.x.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.K = z10;
            this.y.N(z10 ? 15 : 29);
            oi0 oi0Var = this.y;
            oi0Var.L(oi0Var.f - 1, false, true);
            this.x.invalidate();
            this.r.setBackground(null);
            this.r.setBackgroundColor(0);
            this.w.setVisibility(8);
            this.w.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.g6.D0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!vcVar.u) {
                vcVar.u = true;
                vcVar.t = SystemClock.elapsedRealtime();
                gf.k.d().a(60, vcVar.F);
            }
            invalidate();
            int i16 = 0;
            while (i16 < 2) {
                f10 f10Var5 = this.d;
                TextView textView5 = i16 == 0 ? f10Var5.getTextView() : f10Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                    textView5.setTypeface(AndroidUtilities.bold());
                    textView5.setTextSize(1, 14.0f);
                }
                i16++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.d.setLayoutParams(h7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.I, 0);
            org.telegram.ui.ActionBar.v0 v0Var4 = this.B;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
                this.B.setTag(null);
            }
        }
    }

    public void setDelegate(j10 j10Var) {
        this.k0 = j10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.D0 = z10;
    }

    public void setLeftMargin(float f10) {
        if (this.r == null) {
            this.F0 = f10;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        ri0 ri0Var = this.w;
        if (ri0Var != null) {
            ri0Var.setTranslationX(f10);
        }
        f10 f10Var = this.d;
        if (f10Var != null) {
            f10Var.setTranslationX(f10);
        }
        f10 f10Var2 = this.e;
        if (f10Var2 != null) {
            f10Var2.setTranslationX(f10);
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.setTranslationX(f10);
        }
    }

    public void setSupportsCalls(boolean z10) {
        this.S = z10;
    }

    public void setTopPadding(float f10) {
        this.N = f10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.N);
        if (i10 == 8) {
            this.B0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = new vc();
        this.E = new org.telegram.ui.ActionBar.t0[6];
        this.L = -1;
        this.P = -1;
        this.S = true;
        this.e0 = new i6(false, true, true, false);
        this.h0 = new d10(this);
        this.i0 = UserConfig.selectedAccount;
        this.n0 = -1;
        this.o0 = new m.i3(this, 20);
        this.p0 = new AnimationNotificationsLocker();
        this.q0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new Paint(1);
        this.E0 = 0;
        this.G0 = new ud.j(new x00(this), er.h, 450L);
        this.H0 = 0;
        this.l0 = c6Var;
        this.h = n2Var;
        if (n2Var instanceof ng) {
            this.n = (ng) n2Var;
        }
        this.O = true;
        this.j0 = z10;
        if (view == null) {
            ((ViewGroup) n2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
