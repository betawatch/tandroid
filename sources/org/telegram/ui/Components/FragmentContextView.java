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
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.p6 {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public e20 B0;
    public ViewGroup C0;
    public long D0;
    public xj0 E;
    public org.telegram.ui.Cells.y E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public org.telegram.ui.ActionBar.w0 G;
    public PorterDuffColorFilter G0;
    public dd H;
    public int H0;
    public org.telegram.ui.ActionBar.c1 I;
    public int I0;
    public final org.telegram.ui.ActionBar.u0[] J;
    public int J0;
    public FrameLayout K;
    public final NotificationCenter.ObserversGroup[] K0;
    public ImageView L;
    public NotificationCenter.ObserversGroup L0;
    public org.telegram.ui.mk M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.h O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public MessageObject R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final oe.l U0;
    public String V;
    public int V0;
    public boolean W;
    public final hd a;
    public boolean a0;
    public ImageView b;
    public m9 b0;
    public dh0 c;
    public Paint c0;
    public b20 d;
    public LinearGradient d0;
    public b20 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.r2 h;
    public boolean h0;
    public boolean i0;
    public final r6 j0;
    public xc k0;
    public boolean l0;
    public final z10 m0;
    public final bh n;
    public final int n0;
    public final boolean o0;
    public g20 p0;
    public final org.telegram.ui.ActionBar.u6 q0;
    public final View r;
    public boolean r0;
    public a20 s;
    public int s0;
    public final m.g3 t0;
    public final AnimationNotificationsLocker u0;
    public di.i4 v;
    public final AnimationNotificationsLocker v0;
    public View w;
    public boolean w0;
    public ak0 x;
    public boolean x0;
    public d20 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.cy cyVar, boolean z10) {
        this(context, cyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.U;
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        return i10 == 4 ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.t7, u6Var) : (i10 == 1 || i10 == 3) ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A7, u6Var) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.u7, u6Var);
    }

    public static boolean i(float f7, float f10) {
        return Math.abs(f7 - f10) < 0.05f;
    }

    public static boolean j() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        return playingMessageObject != null && playingMessageObject.isVoice();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        boolean z12;
        ChatObject.Call groupCall;
        ChatObject.Call call;
        int i10;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.T && this.U == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.h;
        View fragmentView = r2Var.getFragmentView();
        boolean z13 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean c10 = k30.c();
        bh bhVar = this.n;
        if (c10) {
            z11 = false;
        } else {
            z11 = (org.telegram.ui.v50.E3 || !this.a0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (j() || org.telegram.ui.v50.E3 || !this.a0 || z11 || bhVar == null || (groupCall = bhVar.getGroupCall()) == null || !groupCall.shouldShowPanel()) {
                z12 = false;
                AnimationNotificationsLocker animationNotificationsLocker = this.u0;
                if (z11) {
                    boolean z14 = this.T;
                    if (z14 && ((z13 && this.U == -1) || (i11 = this.U) == 4 || i11 == 3 || i11 == 1)) {
                        this.T = false;
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
                            this.f.setInterpolator(ds.f);
                            this.f.addListener(new y10(this, 9));
                            this.f.start();
                        }
                    } else if (z14 && ((i10 = this.U) == -1 || i10 == 4 || i10 == 3 || i10 == 1)) {
                        this.T = false;
                        setVisibility(8);
                    }
                    if (!z13 || bhVar == null || !bhVar.H() || k30.c()) {
                        return;
                    }
                    org.telegram.messenger.t.q(R.string.InviteExpired, wc.b0(r2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z12 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.U;
                if (i12 != i13 && this.f != null && !z13) {
                    this.w0 = true;
                    return;
                }
                if (i12 != i13 && this.T && !z13) {
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
                    this.f.setInterpolator(ds.f);
                    this.f.addListener(new y10(this, 10));
                    this.f.start();
                    return;
                }
                if (z12) {
                    boolean z15 = i13 == 4 && this.T;
                    r(4);
                    ChatObject.Call groupCall2 = bhVar.getGroupCall();
                    TLRPC.Chat g7 = bhVar.g();
                    if (groupCall2.isScheduled()) {
                        if (this.c0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.g0 = textPaint;
                            textPaint.setColor(-1);
                            this.g0.setTextSize(AndroidUtilities.dp(14.0f));
                            this.g0.setTypeface(AndroidUtilities.bold());
                            Paint paint = new Paint(1);
                            this.c0 = paint;
                            paint.setColor(-1);
                            this.e0 = new Matrix();
                        }
                        this.h0 = true;
                        LocaleController.getString(R.string.VoipChatNotify);
                        TLRPC.GroupCall groupCall3 = groupCall2.call;
                        this.i0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.M.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (ChatObject.isChannelOrGiga(g7)) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                        } else {
                            this.d.b(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                        }
                        this.e.b(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                        if (!this.l0) {
                            this.l0 = true;
                            this.m0.run();
                        }
                    } else {
                        this.h0 = false;
                        this.M.setVisibility(0);
                        this.M.setText(LocaleController.getString(R.string.VoipChatJoin));
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (groupCall2.call.rtmp_stream) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                        } else if (ChatObject.isChannelOrGiga(g7)) {
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
                        this.s.invalidate();
                    }
                    o(this.b0.a.d && z15);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    o(i13 == 1);
                    r(1);
                } else {
                    o(i13 == 3);
                    r(3);
                }
                if (this.T) {
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
                    this.v0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(ds.f);
                    this.f.addListener(new y10(this, 11));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
                return;
            }
            z11 = true;
        }
        z12 = z11;
        AnimationNotificationsLocker animationNotificationsLocker2 = this.u0;
        if (z11) {
        }
    }

    public final void b() {
        if (this.s != null) {
            return;
        }
        Context context = getContext();
        a20 a20Var = new a20(this, context);
        this.s = a20Var;
        this.k0 = new xc(a20Var);
        int i10 = AndroidUtilities.displaySize.x;
        r6 r6Var = this.j0;
        r6Var.M = i10;
        r6Var.A = 0.4f;
        r6Var.setCallback(a20Var);
        r6Var.u(-1);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        addView(this.s, gb1.h(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w = view;
        this.s.addView(view, gb1.g(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i11 = org.telegram.ui.ActionBar.y6.w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, u6Var, mode);
        ImageView imageView3 = this.b;
        dh0 dh0Var = new dh0(16);
        this.c = dh0Var;
        imageView3.setImageDrawable(dh0Var);
        this.b.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i11, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.b, gb1.i(36, 36, 51));
        final int i12 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u10
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
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.cy) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i15 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var2);
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (bhVar2 != null ? bhVar2.a() : 0L)) {
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
                                    r2Var2.presentFragment(new org.telegram.ui.un(bundle), r2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i13 = r2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i13 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i13 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i13).getSharingLocationInfo(j10));
                                break;
                            } else {
                                r2Var2.showDialog(new ew0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var2;
                                if (r2Var2.getSendMessagesHelper().getImportingHistory(unVar.a()) != null) {
                                    i50 i50Var = new i50(fragmentContextView.getContext(), null, unVar, u6Var3);
                                    i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                    r2Var2.showDialog(i50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.v50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        ak0 ak0Var = new ak0(context);
        this.x = ak0Var;
        ak0Var.setScaleType(scaleType);
        this.x.setAutoRepeat(true);
        this.x.f(R.raw.import_progress, 30, 30, null);
        org.telegram.ui.ActionBar.f7.C(this.x, org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.w0(i11, u6Var)), org.telegram.ui.ActionBar.f7.N(i11), u6Var);
        addView(this.x, gb1.h(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        b20 b20Var = new b20(this, context, context, 0);
        this.d = b20Var;
        addView(b20Var, gb1.h(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        b20 b20Var2 = new b20(this, context, context, 1);
        this.e = b20Var2;
        addView(b20Var2, gb1.h(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.O = hVar;
        hVar.g = 1.0f;
        hVar.j = false;
        org.telegram.ui.mk mkVar = new org.telegram.ui.mk(this, context, 1);
        this.M = mkVar;
        mkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        org.telegram.ui.ActionBar.f7.V(this.M, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        org.telegram.ui.mk mkVar2 = this.M;
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        int i14 = org.telegram.ui.ActionBar.y6.Qh;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
        org.telegram.ui.ActionBar.f7.R(mkVar2, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03), org.telegram.ui.ActionBar.f7.N(i13), org.telegram.ui.ActionBar.f7.N(i14), u6Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setGravity(17);
        this.M.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.M, gb1.h(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i15 = 3;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u10
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
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.cy) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i152 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i152 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var2);
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (bhVar2 != null ? bhVar2.a() : 0L)) {
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
                                    r2Var2.presentFragment(new org.telegram.ui.un(bundle), r2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i132 = r2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                r2Var2.showDialog(new ew0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var2;
                                if (r2Var2.getSendMessagesHelper().getImportingHistory(unVar.a()) != null) {
                                    i50 i50Var = new i50(fragmentContextView.getContext(), null, unVar, u6Var3);
                                    i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                    r2Var2.showDialog(i50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.v50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        if (this.O0) {
            n();
        }
        this.K = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.L;
        int i16 = org.telegram.ui.ActionBar.y6.x7;
        org.telegram.ui.ActionBar.f7.t(imageView5, i16, u6Var, mode);
        this.K.addView(this.L, gb1.i(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.K.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.K.setOnClickListener(new bh.f(13));
        this.K.setVisibility(8);
        addView(this.K, gb1.h(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        m9 m9Var = new m9(context, false);
        this.b0 = m9Var;
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.b0.setDelegate(new x10(this, 1));
        this.b0.setVisibility(8);
        addView(this.b0, gb1.i(108, 36, 51));
        this.E = new xj0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        d20 d20Var = new d20(this, context);
        this.y = d20Var;
        org.telegram.ui.ActionBar.f7.t(d20Var, org.telegram.ui.ActionBar.y6.A7, u6Var, PorterDuff.Mode.SRC_IN);
        this.y.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.y.setAnimation(this.E);
        this.y.setScaleType(scaleType);
        this.y.setVisibility(8);
        addView(this.y, gb1.h(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i17 = 4;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u10
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
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.cy) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i152 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i152 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var2);
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.U;
                        if (i162 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.b;
                                int i172 = h1Var.e;
                                if (i172 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i172).getStoriesController().u(h1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i172).A(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (bhVar2 != null ? bhVar2.a() : 0L)) {
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
                                    r2Var2.presentFragment(new org.telegram.ui.un(bundle), r2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i132 = r2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                r2Var2.showDialog(new ew0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var2;
                                if (r2Var2.getSendMessagesHelper().getImportingHistory(unVar.a()) != null) {
                                    i50 i50Var = new i50(fragmentContextView.getContext(), null, unVar, u6Var3);
                                    i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                    r2Var2.showDialog(i50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.v50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
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
        this.F = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        org.telegram.ui.ActionBar.f7.t(this.F, i16, u6Var, mode);
        this.F.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, gb1.h(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i18 = 0;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u10
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
                int i142 = i18;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.cy) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i152 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i152 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var2);
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.U;
                        if (i162 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.b;
                                int i172 = h1Var.e;
                                if (i172 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i172).getStoriesController().u(h1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i172).A(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (bhVar2 != null ? bhVar2.a() : 0L)) {
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
                                    r2Var2.presentFragment(new org.telegram.ui.un(bundle), r2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i132 = r2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                r2Var2.showDialog(new ew0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var2;
                                if (r2Var2.getSendMessagesHelper().getImportingHistory(unVar.a()) != null) {
                                    i50 i50Var = new i50(fragmentContextView.getContext(), null, unVar, u6Var3);
                                    i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                    r2Var2.showDialog(i50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.v50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        di.i4 i4Var = new di.i4(getContext(), 14);
        this.v = i4Var;
        addView(i4Var, gb1.h(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i19 = 1;
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u10
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
                int i142 = i19;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.cy) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i152 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i152 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var2);
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.U;
                        if (i162 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.b;
                                int i172 = h1Var.e;
                                if (i172 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i172).getStoriesController().u(h1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i172).A(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (bhVar2 != null ? bhVar2.a() : 0L)) {
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
                                    r2Var2.presentFragment(new org.telegram.ui.un(bundle), r2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i132 = r2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i192 = 0; i192 < 4; i192++) {
                                        if (!LocationController.getInstance(i192).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i192).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                r2Var2.showDialog(new ew0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var2;
                                if (r2Var2.getSendMessagesHelper().getImportingHistory(unVar.a()) != null) {
                                    i50 i50Var = new i50(fragmentContextView.getContext(), null, unVar, u6Var3);
                                    i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                    r2Var2.showDialog(i50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.v50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        setLeftMargin(this.T0);
    }

    public final void c(boolean z10) {
        int i10;
        bh bhVar = this.n;
        if (bhVar != null) {
            if (this.T && ((i10 = this.U) == 1 || i10 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.r2 r2Var = this.h;
            SendMessagesHelper.ImportingHistory importingHistory = r2Var.getSendMessagesHelper().getImportingHistory(bhVar.a());
            View fragmentView = r2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = r2Var.getVisibleDialog();
            if ((j() || bhVar.n() || ((visibleDialog instanceof i50) && !((i50) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.u0;
            if (importingHistory == null) {
                if (!this.T || ((!z10 || this.U != -1) && this.U != 5)) {
                    int i11 = this.U;
                    if (i11 == -1 || i11 == 5) {
                        this.T = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.T = false;
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
                this.f.setInterpolator(ds.f);
                this.f.addListener(new y10(this, 4));
                this.f.start();
                return;
            }
            if (this.U != 5 && this.f != null && !z10) {
                this.z0 = true;
                return;
            }
            r(5);
            if (z10 && this.S == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                g20 g20Var = this.p0;
                if (g20Var != null) {
                    ((wr0) g20Var).a(true);
                    ((wr0) this.p0).a(false);
                }
            }
            if (!this.T) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f = new AnimatorSet();
                    g20 g20Var2 = this.p0;
                    if (g20Var2 != null) {
                        ((wr0) g20Var2).a(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new y10(this, 5));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            int i12 = this.Q;
            int i13 = importingHistory.uploadProgress;
            if (i12 != i13) {
                this.Q = i13;
                this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z10) {
        String formatPluralString;
        String string;
        org.telegram.ui.ActionBar.r2 r2Var = this.h;
        View fragmentView = r2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = r2Var instanceof org.telegram.ui.cy;
        boolean isSharingLocation = z11 ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(r2Var.getCurrentAccount()).isSharingLocation(this.n.a());
        m.g3 g3Var = this.t0;
        if (!isSharingLocation) {
            this.s0 = -1;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            if (this.T) {
                this.T = false;
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
                this.f.addListener(new y10(this, 0));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new nr0(getContext(), 1));
        if (z10 && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.T) {
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
                this.f.addListener(new y10(this, 1));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (!z11) {
            g3Var.run();
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
            b20 b20Var = this.d;
            TextView textView = i11 == 0 ? b20Var.getTextView() : b20Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i11++;
        }
        spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.t7, this.q0)), indexOf, string2.length() + indexOf, 18);
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
        bh bhVar = this.n;
        if (i10 == i12) {
            if (bhVar != null) {
                if (bhVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.didEndCall) {
            int i13 = this.U;
            if (i13 == 1 || i13 == 3 || i13 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i14 = NotificationCenter.didStartedCall;
        if (i10 == i14 || i10 == NotificationCenter.groupCallUpdated || i10 == NotificationCenter.groupCallVisibilityChanged) {
            a(false);
            if (this.U != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i10 == i14) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.y == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i10 == NotificationCenter.groupCallTypingsUpdated) {
            b();
            if (this.T && this.U == 4) {
                ChatObject.Call groupCall = bhVar.getGroupCall();
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
            int i16 = this.U;
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
        hd hdVar = this.a;
        if (i10 == i17) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.N0 = 0.0f;
            } else {
                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.y6.F0().a(Math.max(this.M0, this.N0));
                hdVar.f(Math.max(this.M0, this.N0));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.U == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.N0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.ui.ActionBar.y6.F0().a(Math.max(this.M0, this.N0));
            hdVar.f(Math.max(this.M0, this.N0));
        }
        this.b0.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        float f7;
        float f10;
        long j10;
        long j11;
        int i10;
        float f11;
        char c10;
        float f12;
        boolean z12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        long j12;
        h20 h20Var;
        float f18;
        MessageObject playingMessageObject;
        if (this.s == null) {
            return;
        }
        if (!this.R0 || getVisibility() == 0) {
            int i11 = this.U;
            char c11 = 3;
            float f19 = 1.0f;
            if (i11 == 3 || i11 == 1) {
                org.telegram.ui.ActionBar.y6.F0().c(this.P0);
                this.a.h(this.P0);
                AndroidUtilities.dp(getStyleHeight());
                i20 F0 = org.telegram.ui.ActionBar.y6.F0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path = F0.n;
                Paint paint = F0.m;
                int i12 = 0;
                while (true) {
                    h20[] h20VarArr = F0.a;
                    if (i12 >= h20VarArr.length) {
                        break;
                    }
                    h20 h20Var2 = h20VarArr[i12];
                    int i13 = h20Var2.i;
                    if (i13 == 0) {
                        if (h20Var2.j != org.telegram.ui.ActionBar.y6.x0(null, h20Var2.m, false) || h20Var2.k != org.telegram.ui.ActionBar.y6.x0(null, h20Var2.n, false)) {
                            h20Var2.a();
                        }
                    } else if (i13 == 1) {
                        if (h20Var2.j != org.telegram.ui.ActionBar.y6.x0(null, h20Var2.o, false) || h20Var2.k != org.telegram.ui.ActionBar.y6.x0(null, h20Var2.p, false)) {
                            h20Var2.a();
                        }
                    } else if (i13 == 3 && (h20Var2.j != org.telegram.ui.ActionBar.y6.x0(null, h20Var2.q, false) || h20Var2.k != org.telegram.ui.ActionBar.y6.x0(null, h20Var2.r, false))) {
                        h20Var2.a();
                    }
                    i12++;
                }
                boolean z13 = F0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    h20 h20Var3 = F0.b;
                    if (h20Var3 != null && (h20Var = F0.c) != null) {
                        int i14 = h20Var.i;
                        int i15 = h20Var3.i;
                        if ((i15 == 1 && i14 == 0) || (i14 == 1 && i15 == 0)) {
                            z10 = true;
                            z11 = z13;
                            if (z13) {
                                f7 = 0.0f;
                                f10 = measuredWidth;
                                j10 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f7 = 0.0f;
                                f10 = measuredWidth;
                                j10 = elapsedRealtime - F0.j;
                                F0.j = elapsedRealtime;
                                if (j10 > 20) {
                                    j10 = 17;
                                }
                                if (j10 < 3) {
                                    j11 = j10;
                                    z11 = false;
                                    float f20 = 0.0f;
                                    if (z11) {
                                        float f21 = F0.g;
                                        float f22 = F0.e;
                                        if (f21 != f22) {
                                            float f23 = F0.h;
                                            float f24 = (j11 * f23) + f22;
                                            F0.e = f24;
                                            if (f23 > 0.0f) {
                                                if (f24 > f21) {
                                                    F0.e = f21;
                                                }
                                            } else if (f24 < f21) {
                                                F0.e = f21;
                                            }
                                            invalidate();
                                        }
                                        float f25 = F0.g;
                                        float f26 = F0.f;
                                        if (f25 != f26) {
                                            float f27 = F0.i;
                                            float f28 = (j11 * f27) + f26;
                                            F0.f = f28;
                                            if (f27 > 0.0f) {
                                                if (f28 > f25) {
                                                    F0.f = f25;
                                                }
                                            } else if (f28 < f25) {
                                                F0.f = f25;
                                            }
                                            invalidate();
                                        }
                                        if (F0.c != null) {
                                            float f29 = (j11 / 250.0f) + F0.k;
                                            F0.k = f29;
                                            if (f29 > 1.0f) {
                                                F0.k = 1.0f;
                                                F0.c = null;
                                            }
                                            invalidate();
                                        }
                                    }
                                    i10 = 0;
                                    while (i10 < 2) {
                                        if (i10 == 0 && F0.c == null) {
                                            c10 = c11;
                                            f11 = f19;
                                            f17 = f20;
                                            z12 = z10;
                                            f15 = f10;
                                            f16 = f7;
                                            j12 = j11;
                                        } else {
                                            if (i10 == 0) {
                                                f14 = f19 - F0.k;
                                                F0.c.b(paint);
                                                c10 = c11;
                                                f11 = f19;
                                                z12 = z10;
                                                f13 = 0.0f;
                                            } else {
                                                h20 h20Var4 = F0.b;
                                                if (h20Var4 == null) {
                                                    break;
                                                }
                                                f11 = f19;
                                                float f30 = F0.c != null ? F0.k : f11;
                                                if (z11) {
                                                    f13 = 0.0f;
                                                    int i16 = (int) (measuredHeight - f7);
                                                    int i17 = (int) (f10 - 0.0f);
                                                    float f31 = F0.e;
                                                    float f32 = f20;
                                                    Matrix matrix = h20Var4.h;
                                                    int i18 = h20Var4.i;
                                                    if (i18 == 2) {
                                                        f12 = f30;
                                                        z12 = z10;
                                                        c10 = 3;
                                                    } else {
                                                        float f33 = h20Var4.e;
                                                        if (f33 == f32 || h20Var4.f >= f33) {
                                                            f12 = f30;
                                                            h20Var4.e = Utilities.random.nextInt(700) + 500;
                                                            h20Var4.f = f32;
                                                            if (h20Var4.a != -1.0f) {
                                                                z12 = z10;
                                                            } else if (i18 == 3) {
                                                                z12 = z10;
                                                                h20Var4.a = a1.g.C(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                h20Var4.b = a1.g.C(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                            } else {
                                                                z12 = z10;
                                                                if (i18 == 0) {
                                                                    h20Var4.a = a1.g.C(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                    h20Var4.b = a1.g.C(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                } else {
                                                                    h20Var4.a = a1.g.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                    h20Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                                }
                                                            }
                                                            h20Var4.c = h20Var4.a;
                                                            h20Var4.d = h20Var4.b;
                                                            if (i18 == 3) {
                                                                h20Var4.a = a1.g.C(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                h20Var4.b = a1.g.C(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                            } else if (i18 == 0) {
                                                                h20Var4.a = a1.g.C(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                h20Var4.b = a1.g.C(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                            } else {
                                                                h20Var4.a = a1.g.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                h20Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                            }
                                                        } else {
                                                            f12 = f30;
                                                            z12 = z10;
                                                        }
                                                        float f34 = j11;
                                                        float f35 = (f34 * 0.02f * f31) + (f34 * f11) + h20Var4.f;
                                                        h20Var4.f = f35;
                                                        float f36 = h20Var4.e;
                                                        if (f35 > f36) {
                                                            h20Var4.f = f36;
                                                        }
                                                        float interpolation = ds.g.getInterpolation(h20Var4.f / f36);
                                                        float f37 = i17;
                                                        float f38 = h20Var4.c;
                                                        float f39 = ((((h20Var4.a - f38) * interpolation) + f38) * f37) - 200.0f;
                                                        float f40 = h20Var4.d;
                                                        float f41 = ((((h20Var4.b - f40) * interpolation) + f40) * i16) - 200.0f;
                                                        c10 = 3;
                                                        float f42 = (f37 / 400.0f) * ((i18 == 0 || i18 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f39, f41);
                                                        matrix.postScale(f42, f42, f39 + 200.0f, f41 + 200.0f);
                                                        h20Var4.g.setLocalMatrix(matrix);
                                                    }
                                                } else {
                                                    c10 = c11;
                                                    f12 = f30;
                                                    z12 = z10;
                                                    f13 = 0.0f;
                                                }
                                                F0.b.b(paint);
                                                f14 = f12;
                                            }
                                            if (i10 == 1 && z12) {
                                                paint.setAlpha(255);
                                            } else if (i10 == 1) {
                                                paint.setAlpha((int) (255.0f * f14));
                                            } else {
                                                paint.setAlpha(255);
                                            }
                                            if (i10 == 1 && z12) {
                                                path.rewind();
                                                f16 = f7;
                                                float f43 = f10;
                                                j12 = j11;
                                                float f44 = f13;
                                                path.addCircle(f10 - AndroidUtilities.dp(18.0f), c3.h0.B(measuredHeight, f16, 2.0f, f16), org.telegram.messenger.t.A(f43, f44, 1.1f, f14), Path.Direction.CW);
                                                canvas.save();
                                                canvas.clipPath(path);
                                                f15 = f43;
                                                f17 = 0.0f;
                                                canvas.drawRoundRect(f44, f16, f15, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                                canvas.restore();
                                            } else {
                                                f15 = f10;
                                                f16 = f7;
                                                f17 = 0.0f;
                                                j12 = j11;
                                                canvas.drawRoundRect(f13, f16, f15, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                            }
                                        }
                                        i10++;
                                        c11 = c10;
                                        j11 = j12;
                                        f19 = f11;
                                        z10 = z12;
                                        f7 = f16;
                                        f10 = f15;
                                        f20 = f17;
                                    }
                                }
                            }
                            j11 = j10;
                            float f202 = 0.0f;
                            if (z11) {
                            }
                            i10 = 0;
                            while (i10 < 2) {
                            }
                        }
                    }
                    z10 = false;
                    z11 = z13;
                    if (z13) {
                    }
                    j11 = j10;
                    float f2022 = 0.0f;
                    if (z11) {
                    }
                    i10 = 0;
                    while (i10 < 2) {
                    }
                }
                f18 = f19;
                invalidate();
            } else {
                f18 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.U == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f45 = -AndroidUtilities.dpf2(f18);
                float lerp = AndroidUtilities.lerp(f45, AndroidUtilities.dpf2(f18) + getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight2 = getMeasuredHeight();
                float dpf2 = measuredHeight2 - AndroidUtilities.dpf2(2.0f);
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.hl, this.q0);
                Paint paint2 = this.Q0;
                paint2.setColor(w02);
                canvas.drawRoundRect(f45, dpf2, lerp, measuredHeight2, AndroidUtilities.dpf2(f18), AndroidUtilities.dpf2(f18), paint2);
            }
            this.P0 = true;
        }
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        di.h1 h1Var = di.h1.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.u0;
        if (h1Var != null) {
            b();
            int i10 = this.U;
            if (6 != i10 && this.f != null && !z10) {
                this.x0 = true;
                return;
            }
            if (6 != i10 && this.T && !z10) {
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
                this.f.setInterpolator(ds.f);
                this.f.addListener(new y10(this, 7));
                this.f.start();
                return;
            }
            r(6);
            if (this.T) {
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
                    this.v0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(ds.f);
                    this.f.addListener(new y10(this, 8));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
        } else {
            boolean z11 = this.T;
            if (z11 && ((z10 && this.U == -1) || this.U == 6)) {
                this.T = false;
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
                    this.f.setInterpolator(ds.f);
                    this.f.addListener(new y10(this, 6));
                    this.f.start();
                }
            } else if (z11 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        di.h1 h1Var2 = di.h1.W;
        if (h1Var2 == null || this.U != 6) {
            return;
        }
        b20 b20Var = this.d;
        TLRPC.GroupCall groupCall = h1Var2.v;
        b20Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i10;
        String format;
        bh bhVar = this.n;
        if (bhVar == null || this.d == null) {
            return;
        }
        b();
        long a2 = bhVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
        if (!this.r0) {
            LocationController.getInstance(currentAccount).loadLiveLocations(a2);
            this.r0 = true;
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
        if (this.s0 == i10) {
            return;
        }
        this.s0 = i10;
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i10 == 0) {
            format = string;
        } else {
            int i12 = i10 - 1;
            format = LocationController.getInstance(currentAccount).isSharingLocation(a2) ? i12 != 0 ? (i12 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user))) : String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName)) : i12 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
        }
        if (format.equals(this.V)) {
            return;
        }
        this.V = format;
        int indexOf = format.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i13 = 0;
        while (i13 < 2) {
            b20 b20Var = this.d;
            TextView textView = i13 == 0 ? b20Var.getTextView() : b20Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i13++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.t7, this.q0)), indexOf, string.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        bh bhVar;
        SpannableStringBuilder spannableStringBuilder;
        if (this.T) {
            int i10 = this.U;
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
        boolean z11 = this.T;
        AnimationNotificationsLocker animationNotificationsLocker = this.u0;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.R = null;
            boolean z12 = (!this.a0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || k30.c()) ? false : true;
            if (!j() && !z12 && (bhVar = this.n) != null && !k30.c()) {
                ChatObject.Call groupCall = bhVar.getGroupCall();
                z12 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z12) {
                a(false);
                return;
            }
            if (!this.T) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.G;
            if (w0Var != null && w0Var.x()) {
                this.G.U(null, null);
            }
            this.T = false;
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
            g20 g20Var = this.p0;
            if (g20Var != null) {
                ((wr0) g20Var).a(true);
            }
            this.f.addListener(new y10(this, 2));
            this.f.start();
            return;
        }
        b();
        int i11 = this.U;
        if (i11 != 0 && this.f != null && !z10) {
            this.y0 = true;
            return;
        }
        r(0);
        if (z10 && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            g20 g20Var2 = this.p0;
            if (g20Var2 != null) {
                ((wr0) g20Var2).a(true);
                ((wr0) this.p0).a(false);
            }
        }
        if (!this.T) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                this.f = new AnimatorSet();
                g20 g20Var3 = this.p0;
                if (g20Var3 != null) {
                    ((wr0) g20Var3).a(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new y10(this, 3));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.c.a(false, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.c.a(true, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        if (this.R == playingMessageObject && i11 == 0) {
            return;
        }
        this.R = playingMessageObject;
        if (playingMessageObject.isVoice() || this.R.isRoundVideo()) {
            this.W = false;
            org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
            if (w0Var2 != null) {
                w0Var2.setAlpha(1.0f);
                this.G.setEnabled(true);
            }
            this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.N, 0);
            spannableStringBuilder = new SpannableStringBuilder(a1.g.D(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i12 = 0;
            while (i12 < 2) {
                b20 b20Var = this.d;
                TextView textView = i12 == 0 ? b20Var.getTextView() : b20Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            q(false);
        } else {
            this.W = true;
            if (this.G == null) {
                this.d.setPadding(0, 0, this.N, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.G.setAlpha(1.0f);
                this.G.setEnabled(true);
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.N, 0);
                q(false);
            } else {
                this.G.setAlpha(0.0f);
                this.G.setEnabled(false);
                this.d.setPadding(0, 0, this.N, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a1.g.D(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i13 = 0;
            while (i13 < 2) {
                b20 b20Var2 = this.d;
                TextView textView2 = i13 == 0 ? b20Var2.getTextView() : b20Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.t7, this.q0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        this.d.b(spannableStringBuilder, !z10 && z11 && this.W);
    }

    public hd getCapsuleBlobDrawable() {
        return this.a;
    }

    public int getCurrentStyle() {
        return this.U;
    }

    public int getStyleHeight() {
        return this.U == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.S;
    }

    public final void h() {
        if (this.G != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), false, this.q0);
        this.G = w0Var;
        if (w0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.f7.t(this.G.getIconView(), i10, u6Var, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        int i11 = 0;
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.G.setDelegate(new t10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
        dd ddVar = new dd();
        this.H = ddVar;
        w0Var2.setIcon(ddVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), u6Var);
        this.I = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.u0 z10 = this.G.z(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.u0[] u0VarArr = this.J;
        u0VarArr[0] = z10;
        u0VarArr[1] = this.G.z(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        u0VarArr[2] = this.G.z(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        u0VarArr[3] = this.G.z(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        u0VarArr[4] = this.G.z(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        u0VarArr[5] = this.G.z(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.G, gb1.h(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new ga(15, this, fArr));
        this.G.setOnLongClickListener(new w10(this, i11));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i10 = this.U;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.r2 r2Var = this.h;
            if (r2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) r2Var.getParentActivity();
                launchActivity.P0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.pc0 pc0Var = new org.telegram.ui.pc0(2);
                pc0Var.v0(sharingLocationInfo.messageObject);
                pc0Var.E0 = new di.d1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.u0(pc0Var);
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
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, dd.a(f10));
            i10 = R.raw.speed_1to15;
        } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
            formatString = LocaleController.getString(R.string.AudioSpeedFast);
            i10 = R.raw.speed_15to2;
        } else {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, dd.a(f10));
            i10 = f10 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        wc.b0(this.h).R(i10, 36, formatString).j();
    }

    public final void m() {
        NotificationCenter.ObserversGroup observersGroup = this.L0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.L0 = null;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.ObserversGroup[] observersGroupArr = this.K0;
            NotificationCenter.ObserversGroup observersGroup2 = observersGroupArr[i10];
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                observersGroupArr[i10] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.h hVar = this.O;
        if (hVar == null || hVar.g < 1.0f) {
            this.O0 = true;
        } else {
            this.O0 = false;
            AndroidUtilities.runOnUIThread(new x10(this, 0), 150L);
        }
    }

    public final void o(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.b0.a.f) != null) {
            valueAnimator.cancel();
            this.b0.a.f = null;
        }
        l9 l9Var = this.b0.a;
        if (l9Var.f != null) {
            l9Var.g = true;
            return;
        }
        int i11 = this.U;
        int i12 = this.n0;
        bh bhVar = this.n;
        if (i11 == 4) {
            if (bhVar != null) {
                call = bhVar.getGroupCall();
                i12 = this.h.getCurrentAccount();
            } else {
                call = null;
            }
            i10 = i12;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            call = VoIPService.getSharedInstance().groupCall;
            user = bhVar != null ? null : VoIPService.getSharedInstance().getUser();
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
                    this.b0.b(i13, call.sortedParticipants.get(i13), i10);
                } else {
                    this.b0.b(i13, null, i10);
                }
            }
        } else if (user != null) {
            this.b0.b(0, user, i10);
            for (int i14 = 1; i14 < 3; i14++) {
                this.b0.b(i14, null, i10);
            }
        } else {
            for (int i15 = 0; i15 < 3; i15++) {
                this.b0.b(i15, null, i10);
            }
        }
        this.b0.a(z10);
        if (this.U != 4 || call == null) {
            return;
        }
        int min = call.call.rtmp_stream ? 0 : Math.min(3, call.sortedParticipants.size());
        int w10 = (min == 0 ? 10 : c3.h0.w(min, 1, 24, 52)) + 3;
        if (z10) {
            int i16 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (AndroidUtilities.dp(w10) != i16) {
                float translationX = (this.d.getTranslationX() + i16) - AndroidUtilities.dp(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                ds dsVar = ds.f;
                duration.setInterpolator(dsVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(dsVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f7 = w10;
        this.d.setLayoutParams(gb1.h(-1, 20.0f, 51, f7, 5.0f, call.isScheduled() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(gb1.h(-1, 20.0f, 51, f7, 25.0f, call.isScheduled() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.o0) {
            this.L0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.liveLocationsChanged).add(NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                this.K0[i10] = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.groupCallTypingsUpdated).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.liveStoryUpdated).add(NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            this.L0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.messagePlayingSpeedChanged).add(NotificationCenter.didStartedCall).add(NotificationCenter.didEndCall).add(NotificationCenter.webRtcSpeakerAmplitudeEvent).add(NotificationCenter.webRtcMicAmplitudeEvent).add(NotificationCenter.groupCallVisibilityChanged);
            if (di.h1.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || k30.c()) {
                bh bhVar = this.n;
                if (bhVar != null && this.h.getSendMessagesHelper().getImportingHistory(bhVar.a()) != null && !j()) {
                    c(true);
                } else if (bhVar == null || bhVar.getGroupCall() == null || !bhVar.getGroupCall().shouldShowPanel() || k30.c() || j()) {
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
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.y6.F0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            hd hdVar = this.a;
            if (!hdVar.u) {
                hdVar.u = true;
                hdVar.t = SystemClock.elapsedRealtime();
                ag.n.d().a(60, hdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.P != z10 && this.y != null) {
                this.P = z10;
                this.E.P(z10 ? 15 : 29);
                xj0 xj0Var = this.E;
                xj0Var.N(xj0Var.f - 1, false, true);
                this.y.invalidate();
            }
        } else if (i11 == 4 && !this.l0) {
            this.l0 = true;
            this.m0.run();
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z11 = this.P;
        hd hdVar = this.a;
        if (z11 != z10) {
            this.P = z10;
            this.E.P(z10 ? 15 : 29);
            xj0 xj0Var = this.E;
            xj0Var.N(xj0Var.f - 1, false, true);
            this.y.invalidate();
            org.telegram.ui.ActionBar.y6.F0().c(this.T);
            hdVar.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            org.telegram.ui.ActionBar.y6.F0().a(0.0f);
            hdVar.f(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.t0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (this.l0) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
            this.l0 = false;
        }
        this.T = false;
        this.u0.unlock();
        this.S = 0.0f;
        m();
        if (!this.o0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            i20 F0 = org.telegram.ui.ActionBar.y6.F0();
            ArrayList arrayList = F0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                F0.d = F0.b;
                F0.b = null;
                F0.c = null;
            }
            hd hdVar = this.a;
            if (hdVar.u) {
                hdVar.u = false;
                ag.n.d().g(hdVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.t0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.v == null) {
            return;
        }
        int i10 = this.U;
        if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
            this.V0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.U0.h(new f20(this.v, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i10 = this.V0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.V0 = i11;
            if (i11 == 0) {
                this.U0.h(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.t0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        p();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final void p() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.U;
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
                bh bhVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (bhVar == null || bhVar.i() == null || bhVar.i().id != user.id) {
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
                if (bhVar == null || bhVar.g() == null || bhVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g7 = bhVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else if (ChatObject.isChannelOrGiga(g7)) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else {
                    this.d.b(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.H == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.W);
        this.H.l(playbackSpeed, z10);
        updateColors();
        boolean z11 = this.A0;
        int i10 = 0;
        this.A0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.J;
            if (i10 >= u0VarArr.length) {
                this.I.e(playbackSpeed, z10);
                return;
            }
            org.telegram.ui.ActionBar.u6 u6Var = this.q0;
            if (z11 || Math.abs(playbackSpeed - W0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.y6.E8;
                u0Var.a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            } else {
                org.telegram.ui.ActionBar.u0 u0Var2 = u0VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.y6.Qh;
                u0Var2.a(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            }
            i10++;
        }
    }

    public final void r(int i10) {
        if (this.U == i10) {
            return;
        }
        b();
        int i11 = this.U;
        hd hdVar = this.a;
        if (i11 == 3 || i11 == 1) {
            i20 F0 = org.telegram.ui.ActionBar.y6.F0();
            ArrayList arrayList = F0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                F0.d = F0.b;
                F0.b = null;
                F0.c = null;
            }
            if (hdVar.u) {
                hdVar.u = false;
                ag.n.d().g(hdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            oe.l lVar = this.U0;
            if (lVar != null) {
                lVar.h(null, true);
            }
        }
        this.U = i10;
        this.s.setWillNotDraw(i10 != 4);
        if (i10 != 4) {
            this.h0 = false;
        }
        m9 m9Var = this.b0;
        if (m9Var != null) {
            m9Var.setStyle(this.U);
            this.b0.setLayoutParams(gb1.i(108, getStyleHeight(), 51));
        }
        this.s.setLayoutParams(gb1.h(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f7 = this.S;
        if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        if (i10 == 6) {
            this.w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            this.s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.nk, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ok, u6Var)}));
            this.s.setTag(null);
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.y.setVisibility(8);
            this.x.setVisibility(8);
            this.x.i();
            this.b0.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.A7));
            int i12 = 0;
            while (i12 < 2) {
                b20 b20Var = this.d;
                TextView textView = i12 == 0 ? b20Var.getTextView() : b20Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A7, u6Var);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setLayoutParams(gb1.h(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i10 == 5) {
            this.w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.v7));
            int i13 = 0;
            while (i13 < 2) {
                b20 b20Var2 = this.d;
                TextView textView2 = i13 == 0 ? b20Var2.getTextView() : b20Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.u7, u6Var);
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.u7));
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.y.setVisibility(8);
            this.b0.setVisibility(8);
            this.x.setVisibility(0);
            this.x.d();
            this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
            org.telegram.ui.ActionBar.w0 w0Var = this.G;
            if (w0Var != null) {
                w0Var.setVisibility(8);
                this.G.setTag(null);
            }
            this.d.setLayoutParams(gb1.h(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i10 == 0 || i10 == 2) {
            this.w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.v7));
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(0);
            this.b.setVisibility(0);
            this.y.setVisibility(8);
            this.x.setVisibility(8);
            this.x.i();
            this.b0.setVisibility(8);
            int i14 = 0;
            while (i14 < 2) {
                b20 b20Var3 = this.d;
                TextView textView3 = i14 == 0 ? b20Var3.getTextView() : b20Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.u7, u6Var);
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.u7));
            if (i10 == 6) {
                this.b.setLayoutParams(gb1.h(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(gb1.h(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.F.setVisibility(8);
                return;
            } else {
                if (i10 != 0) {
                    this.b.setLayoutParams(gb1.h(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(gb1.h(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                    return;
                }
                this.b.setLayoutParams(gb1.h(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(gb1.h(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(0);
                    this.G.setTag(1);
                }
                this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                return;
            }
        }
        if (i10 == 4) {
            this.w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.v7));
            this.y.setVisibility(8);
            this.e.setVisibility(0);
            int i15 = 0;
            while (i15 < 2) {
                b20 b20Var4 = this.d;
                TextView textView4 = i15 == 0 ? b20Var4.getTextView() : b20Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.t7, u6Var);
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setTextSize(1, 15.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.t7));
            this.d.setPadding(0, 0, this.N, 0);
            this.x.setVisibility(8);
            this.x.i();
            bh bhVar = this.n;
            this.b0.setVisibility(!((bhVar == null || bhVar.getGroupCall() == null || bhVar.getGroupCall().call == null || !bhVar.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.b0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
            }
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var3 = this.G;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
                this.G.setTag(null);
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.w.setBackground(null);
            p();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.b0.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.b0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.y.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.P = z10;
            this.E.P(z10 ? 15 : 29);
            xj0 xj0Var = this.E;
            xj0Var.N(xj0Var.f - 1, false, true);
            this.y.invalidate();
            this.s.setBackground(null);
            this.s.setBackgroundColor(0);
            this.x.setVisibility(8);
            this.x.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.y6.F0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!hdVar.u) {
                hdVar.u = true;
                hdVar.t = SystemClock.elapsedRealtime();
                ag.n.d().a(60, hdVar.F);
            }
            invalidate();
            int i16 = 0;
            while (i16 < 2) {
                b20 b20Var5 = this.d;
                TextView textView5 = i16 == 0 ? b20Var5.getTextView() : b20Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    org.telegram.ui.ActionBar.f7.V(textView5, org.telegram.ui.ActionBar.y6.A7, u6Var);
                    textView5.setTypeface(AndroidUtilities.bold());
                    textView5.setTextSize(1, 14.0f);
                }
                i16++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.A7));
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.d.setLayoutParams(gb1.h(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.N, 0);
            org.telegram.ui.ActionBar.w0 w0Var4 = this.G;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
                this.G.setTag(null);
            }
        }
    }

    public void setDelegate(g20 g20Var) {
        this.p0 = g20Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.R0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.s == null) {
            this.T0 = f7;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        ak0 ak0Var = this.x;
        if (ak0Var != null) {
            ak0Var.setTranslationX(f7);
        }
        b20 b20Var = this.d;
        if (b20Var != null) {
            b20Var.setTranslationX(f7);
        }
        b20 b20Var2 = this.e;
        if (b20Var2 != null) {
            b20Var2.setTranslationX(f7);
        }
        m9 m9Var = this.b0;
        if (m9Var != null) {
            m9Var.setTranslationX(f7);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.a0 = z10;
    }

    public void setTopPadding(float f7) {
        this.S = f7;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.S);
        if (i10 == 8) {
            this.P0 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        q61[] q61VarArr;
        hd hdVar = this.a;
        int i10 = hdVar.A;
        if (i10 >= 0) {
            hdVar.E = 1.0f;
            hdVar.a(hd.e(i10));
        }
        int i11 = !i(MediaController.getInstance().getPlaybackSpeed(this.W), 1.0f) ? org.telegram.ui.ActionBar.y6.Qh : org.telegram.ui.ActionBar.y6.x7;
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        dd ddVar = this.H;
        if (ddVar != null) {
            ((r6) ddVar.c).u(w02);
            Paint paint = (Paint) ddVar.b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.G;
        if (w0Var != null) {
            Drawable background = w0Var.getBackground();
            if (background == null || background != this.E0) {
                org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(436207615 & w02, 1, AndroidUtilities.dp(14.0f));
                this.E0 = g02;
                w0Var2.setBackground(g02);
                this.J0 = w02;
            } else if (w02 != this.J0) {
                this.J0 = w02;
                org.telegram.ui.ActionBar.y6.E1(background, w02 & 436207615, true);
            }
        }
        if (this.b != null) {
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.w7, u6Var);
            if (this.F0 == null || w03 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.x7, u6Var);
            if (this.G0 == null || w04 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            int i12 = 0;
            while (i12 < 2) {
                b20 b20Var = this.e;
                TextView textView = i12 == 0 ? b20Var.getTextView() : b20Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.x7, u6Var));
                }
                i12++;
            }
        }
        b20 b20Var2 = this.d;
        if (b20Var2 != null) {
            Object tag = b20Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i13 = 0;
                while (i13 < 2) {
                    b20 b20Var3 = this.d;
                    TextView textView2 = i13 == 0 ? b20Var3.getTextView() : b20Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.y6.w0(intValue, u6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (q61VarArr = (q61[]) ((Spanned) text).getSpans(0, text.length(), q61.class)) != null) {
                            for (q61 q61Var : q61VarArr) {
                                q61Var.b = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.t7, u6Var);
                            }
                        }
                    }
                    i13++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.r2 r2Var, View view, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = new hd();
        this.J = new org.telegram.ui.ActionBar.u0[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new r6(false, true, true);
        this.m0 = new z10(this);
        this.n0 = UserConfig.selectedAccount;
        this.s0 = -1;
        this.t0 = new m.g3(this, 18);
        this.u0 = new AnimationNotificationsLocker();
        this.v0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.K0 = new NotificationCenter.ObserversGroup[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new oe.l(new t10(this), ds.h, 450L);
        this.V0 = 0;
        this.q0 = u6Var;
        this.h = r2Var;
        if (r2Var instanceof bh) {
            this.n = (bh) r2Var;
        }
        this.r = view;
        this.T = true;
        this.o0 = z10;
        if (view == null) {
            ((ViewGroup) r2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
