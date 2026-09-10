package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ae1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout {
    public static final /* synthetic */ int e0 = 0;
    public final Paint E;
    public final RectF F;
    public long G;
    public int H;
    public String I;
    public int J;
    public int K;
    public ArrayList L;
    public Runnable M;
    public Runnable N;
    public long O;
    public float P;
    public boolean Q;
    public final boolean R;
    public CharSequence S;
    public int T;
    public final ShapeDrawable U;
    public final org.telegram.ui.ActionBar.f6 V;
    public int W;
    public int a;
    public StaticLayout a0;
    public final org.telegram.ui.Cells.x1 b;
    public StaticLayout b0;
    public final TextView c;
    public float c0;
    public final TextView d;
    public float d0;
    public final ImageView e;
    public final kj0 f;
    public final w9 h;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.p2 s;
    public Object v;
    public Object w;
    public final int x;
    public final TextPaint y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    public final int c(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.V);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.K;
        if (i11 == 11 || i11 == 24 || i11 == 6 || i11 == 3 || i11 == 5 || i11 == 13 || i11 == 14 || i11 == 74) {
            return true;
        }
        if ((i11 == 7 && MessagesController.getInstance(this.x).dialogFilters.isEmpty()) || (i10 = this.K) == 83 || i10 == 85) {
            return true;
        }
        return i10 == 88 && (obj = this.w) != null && ((Integer) obj).intValue() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.P == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.d0) + AndroidUtilities.dp(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public void e(int i10, boolean z10) {
        if (getVisibility() == 0 && this.Q) {
            this.v = null;
            this.w = null;
            this.Q = false;
            Runnable runnable = this.M;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.M = null;
            }
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.N = null;
            }
            int i11 = this.K;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.L.size(); i12++) {
                    long longValue = ((Long) this.L.get(i12)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.x);
                    int i13 = this.K;
                    messagesController.removeDialogAction(longValue, i13 == 0 || i13 == 26, z10);
                    h(this.K, longValue);
                }
            }
            boolean z11 = this.R;
            if (i10 == 0) {
                setEnterOffset((z11 ? -1.0f : 1.0f) * (this.W + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i10 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.W + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new zn0(this, 16));
            animatorSet.start();
        }
    }

    public final boolean f() {
        int i10 = this.K;
        return i10 == 12 || i10 == 15 || i10 == 24 || i10 == 74 || i10 == 83;
    }

    public final boolean g() {
        int i10 = this.K;
        return i10 == 6 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 8 || i10 == 87 || i10 == 9 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 19 || i10 == 20 || i10 == 21 || i10 == 22 || i10 == 23 || i10 == 30 || i10 == 31 || i10 == 32 || i10 == 102 || i10 == 33 || i10 == 34 || i10 == 35 || i10 == 36 || i10 == 74 || i10 == 37 || i10 == 38 || i10 == 39 || i10 == 40 || i10 == 42 || i10 == 43 || i10 == 77 || i10 == 44 || i10 == 78 || i10 == 79 || i10 == 100 || i10 == 101 || i10 == 83;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.U;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.d0;
    }

    public final void i() {
        org.telegram.ui.ActionBar.j6.w1(-115203550, this.U);
        this.b.setTextColor(-1);
        this.c.setTextColor(-1);
        kj0 kj0Var = this.f;
        kj0Var.h(-14540254, "info1");
        kj0Var.h(-14540254, "info2");
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i10, long j3, Runnable runnable) {
        k(j3, i10, null, null, runnable, null);
    }

    public void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        n(arrayList, i10, obj, obj2, runnable, runnable2);
    }

    public final void l(long j3, int i10, Runnable runnable, Runnable runnable2) {
        k(j3, i10, null, null, runnable, runnable2);
    }

    public final void m(long j3, Object obj, int i10) {
        k(j3, i10, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x16f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1718  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1803  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x16d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x1757  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1706  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x089f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        org.telegram.ui.Cells.x1 x1Var;
        String str;
        boolean z10;
        kj0 kj0Var;
        long j3;
        int i11;
        int dp;
        CharSequence replaceTags;
        int i12;
        int i13;
        CharSequence charSequence;
        int i14;
        CharSequence replaceTags2;
        String string;
        int i15;
        String str2;
        int i16;
        int i17;
        SpannableStringBuilder replaceTags3;
        int i18;
        int i19;
        if (!AndroidUtilities.shouldShowClipboardToast() && ((i19 = this.K) == 52 || i19 == 56 || i19 == 57 || i19 == 58 || i19 == 59 || i19 == 60 || i19 == 80 || i19 == 33)) {
            return;
        }
        Runnable runnable3 = this.M;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.Q = true;
        this.M = runnable;
        this.N = runnable2;
        this.L = arrayList;
        Long l4 = (Long) arrayList.get(0);
        long longValue = l4.longValue();
        this.K = i10;
        this.G = 5000L;
        this.v = obj;
        this.w = obj2;
        this.O = SystemClock.elapsedRealtime();
        String string2 = LocaleController.getString(R.string.UndoNoCaps);
        TextView textView = this.d;
        textView.setText(string2);
        ImageView imageView = this.e;
        imageView.setVisibility(0);
        kj0 kj0Var2 = this.f;
        kj0Var2.setPadding(0, 0, 0, 0);
        kj0Var2.setScaleX(1.0f);
        kj0Var2.setScaleY(1.0f);
        org.telegram.ui.Cells.x1 x1Var2 = this.b;
        x1Var2.setTextSize(1, 15.0f);
        w9 w9Var = this.h;
        w9Var.setVisibility(8);
        x1Var2.setGravity(51);
        TextView textView2 = this.c;
        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
        layoutParams.bottomMargin = 0;
        kj0Var2.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) kj0Var2.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
        layoutParams2.width = AndroidUtilities.dp(54.0f);
        layoutParams2.height = -2;
        x1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i10 == 83) {
            setOnClickListener(new d61(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new ai.h(26));
            movementMethod = null;
        }
        x1Var2.setMovementMethod(movementMethod);
        boolean g10 = g();
        LinearLayout linearLayout = this.n;
        int i20 = this.x;
        int i21 = 36;
        if (g10) {
            if (i10 == 83) {
                textView2.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.SoundAdded);
                charSequence = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.M = null;
                i13 = R.raw.sound_download;
                this.G = 4000L;
            } else if (i10 == 74) {
                textView2.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.ReportChatSent);
                charSequence = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                i13 = R.raw.ic_admin;
                this.G = 4000L;
            } else {
                if (i10 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user)));
                    } else {
                        i17 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                    }
                    g9 g9Var = new g9();
                    g9Var.u(AndroidUtilities.dp(12.0f));
                    g9Var.m(i20, user);
                    w9Var.e(user, g9Var);
                    w9Var.setVisibility(i17);
                    this.G = 3000L;
                    replaceTags = replaceTags3;
                } else if (i10 == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        replaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelUserJoined, UserObject.getFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatUserJoined, UserObject.getFirstName(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        replaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelChatJoined, chat2.title)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatChatJoined, chat2.title));
                    } else {
                        replaceTags = "";
                    }
                    g9 g9Var2 = new g9();
                    g9Var2.u(AndroidUtilities.dp(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    g9Var2.j(i20, tLObject);
                    w9Var.e(tLObject, g9Var2);
                    w9Var.setVisibility(0);
                    this.G = 3000L;
                } else if (i10 == 37) {
                    g9 g9Var3 = new g9();
                    g9Var3.u(AndroidUtilities.dp(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        g9Var3.m(i20, user3);
                        w9Var.e(user3, g9Var3);
                        str2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        g9Var3.k(i20, chat3);
                        w9Var.e(chat3, g9Var3);
                        str2 = chat3.title;
                    }
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i16 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, str2));
                    } else {
                        i16 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, str2));
                    }
                    w9Var.setVisibility(i16);
                    this.G = 3000L;
                } else {
                    if (i10 == 33) {
                        replaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                        int i22 = R.raw.voip_invite;
                        this.G = 3000L;
                        i13 = i22;
                        x1Var = x1Var2;
                    } else {
                        if (i10 == 77) {
                            replaceTags = (CharSequence) obj;
                            i14 = R.raw.payment_success;
                            this.G = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                x1Var = x1Var2;
                            } else {
                                setOnTouchListener(null);
                                x1Var = x1Var2;
                                x1Var.setMovementMethod(null);
                                setOnClickListener(new u10(18, this, (TLRPC.Message) obj2));
                            }
                        } else {
                            x1Var = x1Var2;
                            if (i10 == 30) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i14 = R.raw.voip_muted;
                                this.G = 3000L;
                            } else if (i10 == 35) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                i14 = R.raw.voip_muted;
                                this.G = 3000L;
                            } else if (i10 == 31) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i14 = R.raw.voip_unmuted;
                                this.G = 3000L;
                            } else if (i10 == 38) {
                                replaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                i14 = R.raw.voip_allow_talk;
                                this.G = 3000L;
                            } else if (i10 == 42) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                i14 = R.raw.ic_mute;
                                this.G = 3000L;
                            } else if (i10 == 43) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                i14 = R.raw.ic_unmute;
                                this.G = 3000L;
                            } else {
                                int i23 = this.K;
                                if (i23 == 39 || i23 == 100) {
                                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i23 == 39 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                    i12 = R.raw.voip_record_start;
                                    this.G = 3000L;
                                } else if (i23 == 40 || i23 == 101) {
                                    String string3 = LocaleController.getString(i23 == 40 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                    i14 = R.raw.voip_record_saved;
                                    this.G = 4000L;
                                    x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                    int indexOf = string3.indexOf("**");
                                    int lastIndexOf = string3.lastIndexOf("**");
                                    if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                        spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                        try {
                                            spannableStringBuilder.setSpan(new z51("tg://openmessage?user_id=" + UserConfig.getInstance(i20).getClientUserId()), indexOf, lastIndexOf - 2, 33);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                    replaceTags = spannableStringBuilder;
                                    i21 = 36;
                                } else if (i10 == 36) {
                                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    i14 = R.raw.voip_unmuted;
                                    this.G = 3000L;
                                } else if (i10 == 32 || i10 == 102) {
                                    String firstName = obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                    replaceTags = i10 == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                    i12 = R.raw.ic_ban;
                                    this.G = 3000L;
                                } else if (i10 == 9 || i10 == 10) {
                                    TLRPC.User user4 = (TLRPC.User) obj;
                                    replaceTags = i10 == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                    i12 = R.raw.contact_check;
                                } else if (i10 == 8) {
                                    replaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                    i13 = R.raw.contact_check;
                                } else if (i10 == 87) {
                                    replaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                    i14 = R.raw.contact_check;
                                } else if (i10 == 22) {
                                    if (DialogObject.isUserDialog(longValue)) {
                                        replaceTags = obj == null ? LocaleController.getString(R.string.MainProfilePhotoSetHint) : LocaleController.getString(R.string.MainProfileVideoSetHint);
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-longValue));
                                        replaceTags = (!ChatObject.isChannel(chat4) || chat4.megagroup) ? obj == null ? LocaleController.getString(R.string.MainGroupProfilePhotoSetHint) : LocaleController.getString(R.string.MainGroupProfileVideoSetHint) : obj == null ? LocaleController.getString(R.string.MainChannelProfilePhotoSetHint) : LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                    }
                                    i14 = R.raw.contact_check;
                                } else if (i10 == 23) {
                                    replaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                    i12 = R.raw.contact_check;
                                } else {
                                    if (i10 == 6) {
                                        replaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                        charSequence = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                        i13 = R.raw.chats_swipearchive;
                                        i21 = 48;
                                    } else {
                                        if (i23 == 13) {
                                            replaceTags = LocaleController.getString(R.string.QuizWellDone);
                                            charSequence = LocaleController.getString(R.string.QuizWellDoneInfo);
                                            i13 = R.raw.wallet_congrats;
                                        } else if (i23 == 14) {
                                            replaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                            charSequence = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                            i13 = R.raw.wallet_science;
                                        } else {
                                            if (i10 == 7) {
                                                replaceTags = LocaleController.getString(R.string.ArchivePinned);
                                                string = MessagesController.getInstance(i20).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                                i15 = R.raw.chats_infotip;
                                            } else if (i10 == 20 || i10 == 21) {
                                                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, x1Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, x1Var.getPaint().getFontMetricsInt());
                                                this.a = dialogFilter.title_noanimate ? 26 : 0;
                                                if (longValue != 0) {
                                                    long j10 = DialogObject.isEncryptedDialog(longValue) ? org.telegram.messenger.a2.m(MessagesController.getInstance(i20), longValue).user_id : longValue;
                                                    if (DialogObject.isUserDialog(j10)) {
                                                        TLRPC.User user5 = MessagesController.getInstance(i20).getUser(Long.valueOf(j10));
                                                        String firstName2 = UserObject.getFirstName(user5);
                                                        if (UserObject.isUserSelf(user5)) {
                                                            firstName2 = LocaleController.getString(R.string.SavedMessages);
                                                        } else if (UserObject.isReplyUser(user5)) {
                                                            firstName2 = LocaleController.getString(R.string.RepliesTitle);
                                                        }
                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName2, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName2, replaceAnimatedEmoji));
                                                    } else {
                                                        TLRPC.Chat chat5 = MessagesController.getInstance(i20).getChat(Long.valueOf(-j10));
                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, replaceAnimatedEmoji));
                                                    }
                                                } else {
                                                    replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji));
                                                }
                                                CharSequence charSequence2 = replaceTags2;
                                                i13 = i10 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                replaceTags = charSequence2;
                                                charSequence = null;
                                                i21 = 36;
                                            } else if (i10 == 19) {
                                                replaceTags = this.S;
                                                i12 = R.raw.ic_delete;
                                            } else if (i10 == 82) {
                                                replaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                                charSequence = null;
                                                i13 = 0;
                                                i21 = 36;
                                            } else if (i10 == 78 || i10 == 79) {
                                                int intValue = ((Integer) obj).intValue();
                                                replaceTags = i10 == 78 ? LocaleController.formatPluralString("PinnedDialogsCount", intValue, new Object[0]) : LocaleController.formatPluralString("UnpinnedDialogsCount", intValue, new Object[0]);
                                                i12 = this.K == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                if (obj2 instanceof Integer) {
                                                    this.G = ((Integer) obj2).intValue();
                                                }
                                            } else {
                                                replaceTags = i10 == 3 ? LocaleController.getString(R.string.ChatArchived) : LocaleController.getString(R.string.ChatsArchived);
                                                string = MessagesController.getInstance(i20).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                i15 = R.raw.chats_infotip;
                                            }
                                            i13 = i15;
                                            charSequence = string;
                                            i21 = 36;
                                        }
                                        i21 = 44;
                                    }
                                    x1Var.setText(replaceTags);
                                    if (i13 != 0) {
                                        kj0Var2.e(i13, i21, i21);
                                        hj0 animatedDrawable = kj0Var2.getAnimatedDrawable();
                                        animatedDrawable.h = false;
                                        animatedDrawable.P(animatedDrawable.s());
                                        kj0Var2.setVisibility(0);
                                        kj0Var2.setProgress(0.0f);
                                        kj0Var2.d();
                                    } else {
                                        kj0Var2.setVisibility(8);
                                    }
                                    if (charSequence != null) {
                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                                        textView2.setText(charSequence);
                                        textView2.setVisibility(0);
                                        x1Var.setTextSize(1, 14.0f);
                                        x1Var.setTypeface(AndroidUtilities.bold());
                                        i18 = 8;
                                    } else {
                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                        i18 = 8;
                                        textView2.setVisibility(8);
                                        x1Var.setTextSize(1, 15.0f);
                                        x1Var.setTypeface(Typeface.DEFAULT);
                                    }
                                    linearLayout.setVisibility(i18);
                                }
                                i13 = i12;
                                charSequence = null;
                                i21 = 36;
                                x1Var.setText(replaceTags);
                                if (i13 != 0) {
                                }
                                if (charSequence != null) {
                                }
                                linearLayout.setVisibility(i18);
                            }
                        }
                        i13 = i14;
                    }
                    charSequence = null;
                    x1Var.setText(replaceTags);
                    if (i13 != 0) {
                    }
                    if (charSequence != null) {
                    }
                    linearLayout.setVisibility(i18);
                }
                x1Var = x1Var2;
                charSequence = null;
                i13 = 0;
                x1Var.setText(replaceTags);
                if (i13 != 0) {
                }
                if (charSequence != null) {
                }
                linearLayout.setVisibility(i18);
            }
            x1Var = x1Var2;
            x1Var.setText(replaceTags);
            if (i13 != 0) {
            }
            if (charSequence != null) {
            }
            linearLayout.setVisibility(i18);
        } else {
            x1Var = x1Var2;
            int i24 = this.K;
            if (i24 == 45 || i24 == 46 || i24 == 47 || i24 == 52 || i24 == 53 || i24 == 54 || i24 == 55 || i24 == 56 || i24 == 57 || i24 == 58 || i24 == 59 || i24 == 60 || i24 == 71 || i24 == 70 || i24 == 75 || i24 == 76 || i24 == 41 || i24 == 78 || i24 == 79 || i24 == 61 || i24 == 80) {
                str = "";
                imageView.setVisibility(8);
                kj0Var2.setVisibility(0);
                x1Var.setTypeface(Typeface.DEFAULT);
                int i25 = this.K;
                long j11 = -1;
                if (i25 != 76) {
                    z10 = true;
                    if (i25 == 75) {
                        x1Var.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                        kj0Var2.e(R.raw.chats_infotip, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                        kj0Var = kj0Var2;
                        j3 = -1;
                        i11 = 8;
                    } else if (i10 == 70) {
                        int intValue2 = ((Integer) obj2).intValue();
                        textView2.setSingleLine(false);
                        x1Var.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(intValue2)));
                        kj0Var2.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        this.G = 4000L;
                        kj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    } else {
                        if (i25 == 71) {
                            x1Var.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                            kj0Var2.e(R.raw.fire_off, 36, 36);
                            x1Var.setTextSize(1, 14.0f);
                            this.G = 3000L;
                            kj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        } else if (i25 == 45) {
                            x1Var.setText(LocaleController.getString(R.string.ImportMutualError));
                            kj0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            x1Var.setTextSize(1, 14.0f);
                        } else if (i25 == 46) {
                            x1Var.setText(LocaleController.getString(R.string.ImportNotAdmin));
                            kj0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            x1Var.setTextSize(1, 14.0f);
                        } else if (i25 == 47) {
                            x1Var.setText(LocaleController.getString(R.string.ImportedInfo));
                            kj0Var2.e(R.raw.imported, 36, 36);
                            kj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            x1Var.setTextSize(1, 14.0f);
                        } else {
                            if (i25 == 52 || i25 == 56 || i25 == 57 || i25 == 58 || i25 == 59 || i25 == 60 || i25 == 80) {
                                kj0Var = kj0Var2;
                                if (!AndroidUtilities.shouldShowClipboardToast()) {
                                    return;
                                }
                                int i26 = R.raw.copy;
                                int i27 = this.K;
                                if (i27 == 80) {
                                    x1Var.setText(LocaleController.getString(R.string.EmailCopied));
                                } else if (i27 == 60) {
                                    x1Var.setText(LocaleController.getString(R.string.PhoneCopied));
                                } else if (i27 == 56) {
                                    x1Var.setText(LocaleController.getString(R.string.UsernameCopied));
                                } else if (i27 == 57) {
                                    x1Var.setText(LocaleController.getString(R.string.HashtagCopied));
                                } else if (i27 == 52) {
                                    x1Var.setText(LocaleController.getString(R.string.MessageCopied));
                                } else if (i27 == 59) {
                                    i26 = R.raw.voip_invite;
                                    x1Var.setText(LocaleController.getString(R.string.LinkCopied));
                                } else {
                                    x1Var.setText(LocaleController.getString(R.string.TextCopied));
                                }
                                kj0Var.e(i26, 30, 30);
                                this.G = 3000L;
                                x1Var.setTextSize(1, 15.0f);
                            } else if (i25 == 54) {
                                x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                                kj0Var2.e(R.raw.silent_unmute, 30, 30);
                                this.G = 3000L;
                                x1Var.setTextSize(1, 15.0f);
                            } else if (i25 == 55) {
                                x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                                kj0Var2.e(R.raw.silent_mute, 30, 30);
                                this.G = 3000L;
                                x1Var.setTextSize(1, 15.0f);
                            } else if (i25 == 41) {
                                if (obj2 != null) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                } else if (longValue == UserConfig.getInstance(i20).clientUserId) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                                } else if (DialogObject.isChatDialog(longValue)) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue)).title)));
                                } else {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i20).getUser(l4)))));
                                }
                                kj0Var2.e(R.raw.contact_check, 36, 36);
                                this.G = 3000L;
                            } else if (i25 == 53) {
                                Integer num = (Integer) obj;
                                if (obj2 == null || (obj2 instanceof TLRPC.TL_forumTopic)) {
                                    kj0Var = kj0Var2;
                                    if (longValue == UserConfig.getInstance(i20).clientUserId) {
                                        if (num.intValue() == 1) {
                                            x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new c30(7)));
                                        } else {
                                            x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new c30(7)));
                                        }
                                        kj0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            TLRPC.Chat chat6 = MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            String i28 = ChatObject.isMonoForum(chat6) ? mg.d.i(chat6, i20, false) : null;
                                            if (num.intValue() == 1) {
                                                int i29 = R.string.FwdMessageToGroup;
                                                if (i28 == null) {
                                                    i28 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i29, i28)));
                                            } else {
                                                int i30 = R.string.FwdMessagesToGroup;
                                                if (i28 == null) {
                                                    i28 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i30, i28)));
                                            }
                                        } else {
                                            TLRPC.User user6 = MessagesController.getInstance(i20).getUser(l4);
                                            if (num.intValue() == 1) {
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user6))));
                                            } else {
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user6))));
                                            }
                                        }
                                        kj0Var.e(R.raw.forward, 30, 30);
                                        j11 = 300;
                                    }
                                } else {
                                    int intValue3 = ((Integer) obj2).intValue();
                                    if (num.intValue() == 1) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", intValue3, new Object[0])));
                                    } else {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", intValue3, new Object[0])));
                                    }
                                    kj0Var2.e(R.raw.forward, 30, 30);
                                    j11 = 300;
                                    kj0Var = kj0Var2;
                                }
                                this.G = 3000L;
                            } else {
                                kj0Var = kj0Var2;
                                if (i25 == 61) {
                                    if (obj2 != null) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                        kj0Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == UserConfig.getInstance(i20).clientUserId) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                        kj0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue)).title)));
                                        } else {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i20).getUser(l4)))));
                                        }
                                        kj0Var.e(R.raw.forward, 30, 30);
                                    }
                                    this.G = 3000L;
                                }
                            }
                            j3 = j11;
                            i11 = 8;
                            z10 = false;
                        }
                        kj0Var = kj0Var2;
                        j3 = j11;
                        i11 = 8;
                        z10 = false;
                    }
                    textView2.setVisibility(i11);
                    textView.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
                    linearLayout.setVisibility(i11);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    kj0Var.setProgress(0.0f);
                    kj0Var.d();
                    if (j3 > 0) {
                        kj0Var.postDelayed(new uq0(this, 27), j3);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) x1Var.getText());
                    sb2.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
                    AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
                    if (!f()) {
                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                        if (measuredWidth == 0) {
                            measuredWidth = AndroidUtilities.displaySize.x;
                        }
                        measureChildWithMargins(textView2, org.telegram.messenger.em.d(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        this.r = AndroidUtilities.dp(37.0f) + textView2.getMeasuredHeight();
                    } else if (d()) {
                        this.r = AndroidUtilities.dp(52.0f);
                    } else if (getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                        if (measuredWidth2 <= 0) {
                            measuredWidth2 = AndroidUtilities.displaySize.x;
                        }
                        View view = x1Var;
                        measureChildWithMargins(view, org.telegram.messenger.em.d(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        int measuredHeight = view.getMeasuredHeight();
                        int i31 = this.K;
                        int dp2 = AndroidUtilities.dp((i31 == 16 || i31 == 17 || i31 == 18 || i31 == 84 || i31 == 86) ? 14.0f : 28.0f) + measuredHeight;
                        this.r = dp2;
                        int i32 = this.K;
                        if (i32 == 18) {
                            this.r = Math.max(dp2, AndroidUtilities.dp(52.0f));
                        } else if (i32 == 25) {
                            this.r = Math.max(dp2, AndroidUtilities.dp(50.0f));
                        } else if (z10) {
                            this.r = dp2 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() == 0) {
                        setVisibility(0);
                        setEnterOffset((this.R ? -1.0f : 1.0f) * (this.W + this.r));
                        AnimatorSet animatorSet = new AnimatorSet();
                        boolean z11 = this.R;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.W + this.r), z11 ? 1.0f : -1.0f));
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.setDuration(180L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                x1Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                kj0Var2.e(R.raw.gigagroup_convert, 36, 36);
                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                x1Var.setTextSize(1, 14.0f);
                kj0Var = kj0Var2;
                j3 = -1;
                i11 = 8;
                z10 = true;
                textView2.setVisibility(i11);
                textView.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
                linearLayout.setVisibility(i11);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                kj0Var.setProgress(0.0f);
                kj0Var.d();
                if (j3 > 0) {
                }
                StringBuilder sb22 = new StringBuilder();
                sb22.append((Object) x1Var.getText());
                if (textView2.getVisibility() != 0) {
                }
                sb22.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
                AndroidUtilities.makeAccessibilityAnnouncement(sb22.toString());
                if (!f()) {
                }
                if (getVisibility() == 0) {
                }
            } else {
                if (i24 == 24 || i24 == 25) {
                    str = "";
                    int intValue4 = ((Integer) obj).intValue();
                    TLRPC.User user7 = (TLRPC.User) obj2;
                    imageView.setVisibility(8);
                    kj0Var2.setVisibility(0);
                    if (intValue4 != 0) {
                        x1Var.setTypeface(AndroidUtilities.bold());
                        x1Var.setTextSize(1, 14.0f);
                        kj0Var2.a.clear();
                        int i33 = org.telegram.ui.ActionBar.j6.Hi;
                        kj0Var2.h(c(i33), "BODY");
                        kj0Var2.h(c(i33), "Wibe Big");
                        kj0Var2.h(c(i33), "Wibe Big 3");
                        kj0Var2.h(c(i33), "Wibe Small");
                        x1Var.setText(LocaleController.getString(R.string.ProximityAlertSet));
                        kj0Var2.e(R.raw.ic_unmute, 28, 28);
                        textView2.setVisibility(0);
                        textView2.setSingleLine(false);
                        textView2.setMaxLines(3);
                        if (user7 != null) {
                            textView2.setText(LocaleController.formatString("ProximityAlertSetInfoUser", R.string.ProximityAlertSetInfoUser, UserObject.getFirstName(user7), LocaleController.formatDistance(intValue4, 2)));
                        } else {
                            textView2.setText(LocaleController.formatString("ProximityAlertSetInfoGroup2", R.string.ProximityAlertSetInfoGroup2, LocaleController.formatDistance(intValue4, 2)));
                        }
                        linearLayout.setVisibility(8);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    } else {
                        x1Var.setTypeface(Typeface.DEFAULT);
                        x1Var.setTextSize(1, 15.0f);
                        kj0Var2.a.clear();
                        int i34 = org.telegram.ui.ActionBar.j6.Hi;
                        kj0Var2.h(c(i34), "Body Main");
                        kj0Var2.h(c(i34), "Body Top");
                        kj0Var2.h(c(i34), "Line");
                        kj0Var2.h(c(i34), "Curve Big");
                        kj0Var2.h(c(i34), "Curve Small");
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        x1Var.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                        kj0Var2.e(R.raw.ic_mute, 28, 28);
                        textView2.setVisibility(8);
                        textView.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
                        linearLayout.setVisibility(0);
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    kj0Var2.setProgress(0.0f);
                    kj0Var2.d();
                } else if (i24 == 11) {
                    x1Var.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                    kj0Var2.e(R.raw.contact_check, 36, 36);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    textView2.setText(((TLRPC.TL_authorization) obj).app_name);
                    textView2.setVisibility(0);
                    x1Var.setTextSize(1, 14.0f);
                    x1Var.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(c(org.telegram.ui.ActionBar.j6.p7));
                    imageView.setVisibility(8);
                    linearLayout.setVisibility(0);
                    kj0Var2.setVisibility(0);
                    kj0Var2.setProgress(0.0f);
                    kj0Var2.d();
                } else if (i24 == 15) {
                    this.G = 10000L;
                    textView.setText(LocaleController.getString(R.string.Open));
                    x1Var.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                    kj0Var2.e(R.raw.filter_new, 36, 36);
                    int dp3 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = dp3;
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = dp3;
                    String string4 = LocaleController.getString(R.string.FilterAvailableText);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string4);
                    int indexOf2 = string4.indexOf(42);
                    int lastIndexOf2 = string4.lastIndexOf(42);
                    if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                        spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                        spannableStringBuilder2.setSpan(new z51("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                    }
                    textView2.setText(spannableStringBuilder2);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(2);
                    linearLayout.setVisibility(0);
                    imageView.setVisibility(8);
                    kj0Var2.setVisibility(0);
                    kj0Var2.setProgress(0.0f);
                    kj0Var2.d();
                } else if (i24 == 16 || i24 == 17) {
                    str = "";
                    this.G = 4000L;
                    x1Var.setTextSize(1, 14.0f);
                    x1Var.setGravity(16);
                    x1Var.setMinHeight(AndroidUtilities.dp(30.0f));
                    String str3 = (String) obj;
                    if ("🎲".equals(str3)) {
                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                        kj0Var2.setImageResource(R.drawable.dice);
                    } else {
                        if ("🎯".equals(str3)) {
                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                        } else {
                            String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str3);
                            if (TextUtils.isEmpty(serverString)) {
                                x1Var.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str3), x1Var.getPaint().getFontMetricsInt(), false));
                            } else {
                                x1Var.setText(Emoji.replaceEmoji(serverString, x1Var.getPaint().getFontMetricsInt(), false));
                            }
                        }
                        kj0Var2.setImageDrawable(Emoji.getEmojiDrawable(str3));
                        kj0Var2.setScaleType(ImageView.ScaleType.FIT_XY);
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.width = AndroidUtilities.dp(26.0f);
                        layoutParams2.height = AndroidUtilities.dp(26.0f);
                    }
                    textView.setText(LocaleController.getString(R.string.SendDice));
                    if (this.K == 16) {
                        dp = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        textView.setVisibility(0);
                        textView.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
                        imageView.setVisibility(8);
                        linearLayout.setVisibility(0);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                        textView.setVisibility(8);
                        linearLayout.setVisibility(8);
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = dp;
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams.height = -1;
                    textView2.setVisibility(8);
                    kj0Var2.setVisibility(0);
                } else if (i24 == 18) {
                    this.G = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                    x1Var.setTextSize(1, 14.0f);
                    x1Var.setGravity(16);
                    x1Var.setText((CharSequence) obj);
                    textView.setVisibility(8);
                    linearLayout.setVisibility(8);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams.height = -1;
                    layoutParams2.gravity = 51;
                    int dp4 = AndroidUtilities.dp(8.0f);
                    layoutParams2.bottomMargin = dp4;
                    layoutParams2.topMargin = dp4;
                    kj0Var2.setVisibility(0);
                    kj0Var2.e(R.raw.chats_infotip, 36, 36);
                    kj0Var2.setProgress(0.0f);
                    kj0Var2.d();
                    x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                } else if (i24 == 12) {
                    x1Var.setText(LocaleController.getString(R.string.ColorThemeChanged));
                    kj0Var2.setImageResource(R.drawable.toast_pallete);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(48.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = AndroidUtilities.dp(48.0f);
                    String string5 = LocaleController.getString(R.string.ColorThemeChangedInfo);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string5);
                    int indexOf3 = string5.indexOf(42);
                    int lastIndexOf3 = string5.lastIndexOf(42);
                    if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                        spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                        spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                        spannableStringBuilder3.setSpan(new z51("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                    }
                    textView2.setText(spannableStringBuilder3);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(2);
                    textView.setVisibility(8);
                    linearLayout.setVisibility(0);
                    kj0Var2.setVisibility(0);
                } else {
                    str = "";
                    if (i24 == 84) {
                        x1Var.setVisibility(0);
                        x1Var.setTextSize(1, 15.0f);
                        x1Var.setTypeface(Typeface.DEFAULT);
                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                        kj0Var2.setVisibility(0);
                        kj0Var2.e(R.raw.voice_to_text, 36, 36);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                        layoutParams.leftMargin = org.telegram.ui.Cells.r6.b(58.0f, R.string.PremiumMore, textView);
                        layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        int dp5 = AndroidUtilities.dp(6.0f);
                        layoutParams.bottomMargin = dp5;
                        layoutParams.topMargin = dp5;
                        layoutParams.height = -2;
                        w9Var.setVisibility(8);
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        linearLayout.setVisibility(0);
                        imageView.setVisibility(8);
                    } else if (i24 == 85) {
                        x1Var.setVisibility(0);
                        x1Var.setTextSize(1, 15.0f);
                        x1Var.setTypeface(AndroidUtilities.bold());
                        x1Var.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                        kj0Var2.setVisibility(0);
                        kj0Var2.e(R.raw.hint_swipe_reply, 64, 64);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                        textView2.setVisibility(0);
                        layoutParams.leftMargin = org.telegram.ui.Cells.r6.b(58.0f, R.string.SwipeToReplyHintMessage, textView2);
                        layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams.height = -2;
                        w9Var.setVisibility(8);
                        linearLayout.setVisibility(8);
                    } else if (i24 == 90 || i24 == 91 || i24 == 92 || i24 == 93 || i24 == 94) {
                        switch (i24) {
                            case 90:
                                x1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) sg.s.f(), new Object[0]));
                                break;
                            case 91:
                                x1Var.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                                break;
                            case 92:
                                x1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]));
                                break;
                            case 93:
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0])));
                                break;
                            case 94:
                                x1Var.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                                break;
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                        x1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(8);
                        x1Var.setTypeface(Typeface.DEFAULT);
                        textView2.setVisibility(8);
                        kj0Var2.setVisibility(0);
                        kj0Var2.e(R.raw.chats_infotip, 36, 36);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                    } else if (i24 == 2 || i24 == 4) {
                        if (i10 == 2) {
                            x1Var.setText(LocaleController.getString(R.string.ChatArchived));
                        } else {
                            x1Var.setText(LocaleController.getString(R.string.ChatsArchived));
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams.rightMargin = 0;
                        x1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        x1Var.setTypeface(Typeface.DEFAULT);
                        textView2.setVisibility(8);
                        kj0Var2.setVisibility(0);
                        kj0Var2.e(R.raw.chats_archived, 36, 36);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                    } else if (i10 == 82) {
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        x1Var.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                        linearLayout.setVisibility(0);
                        x1Var.setTextSize(1, 15.0f);
                        x1Var.setTypeface(Typeface.DEFAULT);
                        textView2.setVisibility(8);
                        w9Var.setVisibility(0);
                        w9Var.setRoundRadius(AndroidUtilities.dp(2.0f));
                        String str4 = photoEntry.thumbPath;
                        if (str4 != null) {
                            w9Var.f(str4, null, org.telegram.ui.ActionBar.j6.R4);
                        } else if (photoEntry.path != null) {
                            w9Var.p(photoEntry.orientation, photoEntry.invert, true);
                            if (photoEntry.isVideo) {
                                w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                            } else {
                                w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                            }
                        } else {
                            w9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                        }
                    } else {
                        layoutParams.leftMargin = AndroidUtilities.dp(45.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams.rightMargin = 0;
                        x1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        x1Var.setTypeface(typeface);
                        textView2.setVisibility(8);
                        kj0Var2.setVisibility(8);
                        int i35 = this.K;
                        if (i35 == 88) {
                            String str5 = (String) obj;
                            int intValue5 = ((Integer) obj2).intValue();
                            if (intValue5 > 0) {
                                int dp6 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                                layoutParams.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams.rightMargin = dp6;
                                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                                layoutParams3.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams3.rightMargin = dp6;
                                x1Var.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str5));
                                x1Var.setTypeface(AndroidUtilities.bold());
                                textView2.setVisibility(0);
                                textView2.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", intValue5, new Object[0]));
                            } else {
                                x1Var.setTypeface(typeface);
                                int i36 = R.string.FolderLinkDeleted;
                                if (str5 == null) {
                                    str5 = str;
                                }
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i36, str5.replace('*', (char) 10033))));
                            }
                        } else if (i35 == 81 || i35 == 0 || i35 == 26) {
                            x1Var.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                        } else if (i35 == 27) {
                            x1Var.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                        } else if (i35 == 95) {
                            if (DialogObject.isChatDialog(longValue)) {
                                TLRPC.Chat chat7 = MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue));
                                if (ChatObject.isMonoForum(chat7)) {
                                    x1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                } else if (!ChatObject.isChannel(chat7) || chat7.megagroup) {
                                    x1Var.setText(LocaleController.getString(R.string.GroupLeftUndo));
                                } else {
                                    x1Var.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                                }
                            } else {
                                x1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                            }
                        } else if (DialogObject.isChatDialog(longValue)) {
                            TLRPC.Chat chat8 = MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue));
                            if (ChatObject.isMonoForum(chat8)) {
                                x1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                            } else if (!ChatObject.isChannel(chat8) || chat8.megagroup) {
                                x1Var.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                            } else {
                                x1Var.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                            }
                        } else {
                            x1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                        }
                        if (this.K != 81) {
                            for (int i37 = 0; i37 < arrayList.size(); i37++) {
                                MessagesController messagesController = MessagesController.getInstance(i20);
                                long longValue2 = ((Long) arrayList.get(i37)).longValue();
                                int i38 = this.K;
                                messagesController.addDialogAction(longValue2, i38 == 0 || i38 == 26);
                            }
                        }
                    }
                }
                z10 = false;
                StringBuilder sb222 = new StringBuilder();
                sb222.append((Object) x1Var.getText());
                if (textView2.getVisibility() != 0) {
                }
                sb222.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
                AndroidUtilities.makeAccessibilityAnnouncement(sb222.toString());
                if (!f()) {
                }
                if (getVisibility() == 0) {
                }
            }
        }
        str = "";
        z10 = false;
        StringBuilder sb2222 = new StringBuilder();
        sb2222.append((Object) x1Var.getText());
        if (textView2.getVisibility() != 0) {
        }
        sb2222.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2222.toString());
        if (!f()) {
        }
        if (getVisibility() == 0) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7 = this.P;
        ShapeDrawable shapeDrawable = this.U;
        if (f7 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.d0) + this.W + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i10 = this.K;
        if (i10 == 1 || i10 == 95 || i10 == 0 || i10 == 27 || i10 == 26 || i10 == 81 || i10 == 88) {
            int ceil = this.G > 0 ? (int) Math.ceil(r2 / 1000.0f) : 0;
            int i11 = this.H;
            TextPaint textPaint = this.y;
            if (i11 != ceil) {
                this.H = ceil;
                this.I = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.a0;
                if (staticLayout != null) {
                    this.b0 = staticLayout;
                    this.c0 = 0.0f;
                }
                this.J = (int) Math.ceil(textPaint.measureText(r2));
                this.a0 = new StaticLayout(this.I, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.c0;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.c0 = f11;
                if (f11 > 1.0f) {
                    this.c0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.b0;
            RectF rectF = this.F;
            if (staticLayout2 != null) {
                float f12 = this.c0;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.J / 2), (AndroidUtilities.dp(10.0f) * this.c0) + AndroidUtilities.dp(17.2f));
                    this.b0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.a0 != null) {
                float f13 = this.c0;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.J / 2), com.google.android.gms.internal.vision.e2.a(1.0f, this.c0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.a0.draw(canvas);
                if (this.c0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.G / 5000.0f) * (-360.0f), false, this.E);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.G - (elapsedRealtime - this.O);
        this.G = j3;
        this.O = elapsedRealtime;
        if (j3 <= 0) {
            e(this.T, true);
        }
        if (this.K != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.U.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f7) {
        if (this.P != f7) {
            this.P = f7;
            setTranslationY(((this.d0 - this.W) + AndroidUtilities.dp(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffset(float f7) {
        if (this.d0 != f7) {
            this.d0 = f7;
            setTranslationY(((f7 - this.W) + AndroidUtilities.dp(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.W = i10;
    }

    public void setHideAnimationType(int i10) {
        this.T = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.S = charSequence;
    }

    public UndoView(Context context, ae1 ae1Var) {
        this(context, ae1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 0;
        this.x = UserConfig.selectedAccount;
        this.K = -1;
        this.T = 1;
        this.W = AndroidUtilities.dp(8.0f);
        this.c0 = 1.0f;
        this.V = f6Var;
        this.s = p2Var;
        this.R = z10;
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, context, f6Var);
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        x1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Gi;
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x1Var.setMovementMethod(new e61(this));
        addView(x1Var, w7.a6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, w7.a6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        kj0 kj0Var = new kj0(context);
        this.f = kj0Var;
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) | (-16777216), "info1");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) | (-16777216), "info2");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc12");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc11");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc10");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc9");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc8");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc7");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc6");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc5");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc4");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc3");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc2");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc1");
        kj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "Oval");
        addView(kj0Var, w7.a6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var = new w9(context);
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(w9Var, w7.a6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, w7.a6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new d61(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, w7.a6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 19, 6, 4, 8, 4));
        this.F = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        setWillNotDraw(false);
        this.U = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        setOnTouchListener(new ai.h(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j3) {
    }
}
