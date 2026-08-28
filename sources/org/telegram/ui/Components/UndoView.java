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
import org.telegram.ui.oc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final Paint A;
    public final RectF B;
    public long C;
    public int D;
    public String E;
    public int F;
    public int G;
    public ArrayList H;
    public Runnable I;
    public Runnable J;
    public long K;
    public float L;
    public boolean M;
    public final boolean N;
    public CharSequence O;
    public int P;
    public final ShapeDrawable Q;
    public final org.telegram.ui.ActionBar.b6 R;
    public int S;
    public StaticLayout T;
    public StaticLayout U;
    public float V;
    public float W;
    public int a;
    public final org.telegram.ui.Cells.x1 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final pi0 f;
    public final o9 h;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.o2 s;
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

    public final int c(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.R);
    }

    public final boolean d() {
        int i9;
        Object obj;
        int i10 = this.G;
        if (i10 == 11 || i10 == 24 || i10 == 6 || i10 == 3 || i10 == 5 || i10 == 13 || i10 == 14 || i10 == 74) {
            return true;
        }
        if ((i10 == 7 && MessagesController.getInstance(this.x).dialogFilters.isEmpty()) || (i9 = this.G) == 83 || i9 == 85) {
            return true;
        }
        return i9 == 88 && (obj = this.w) != null && ((Integer) obj).intValue() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.L == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.W) + AndroidUtilities.dp(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public void e(int i9, boolean z10) {
        if (getVisibility() == 0 && this.M) {
            this.v = null;
            this.w = null;
            this.M = false;
            Runnable runnable = this.I;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.I = null;
            }
            Runnable runnable2 = this.J;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.J = null;
            }
            int i10 = this.G;
            if (i10 == 0 || i10 == 1 || i10 == 95 || i10 == 26 || i10 == 27) {
                for (int i11 = 0; i11 < this.H.size(); i11++) {
                    long longValue = ((Long) this.H.get(i11)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.x);
                    int i12 = this.G;
                    messagesController.removeDialogAction(longValue, i12 == 0 || i12 == 26, z10);
                    h(this.G, longValue);
                }
            }
            boolean z11 = this.N;
            if (i9 == 0) {
                setEnterOffset((z11 ? -1.0f : 1.0f) * (this.S + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int i13 = 2;
            if (i9 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.S + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new y11(this, i13));
            animatorSet.start();
        }
    }

    public final boolean f() {
        int i9 = this.G;
        return i9 == 12 || i9 == 15 || i9 == 24 || i9 == 74 || i9 == 83;
    }

    public final boolean g() {
        int i9 = this.G;
        return i9 == 6 || i9 == 3 || i9 == 5 || i9 == 7 || i9 == 8 || i9 == 87 || i9 == 9 || i9 == 10 || i9 == 13 || i9 == 14 || i9 == 19 || i9 == 20 || i9 == 21 || i9 == 22 || i9 == 23 || i9 == 30 || i9 == 31 || i9 == 32 || i9 == 102 || i9 == 33 || i9 == 34 || i9 == 35 || i9 == 36 || i9 == 74 || i9 == 37 || i9 == 38 || i9 == 39 || i9 == 40 || i9 == 42 || i9 == 43 || i9 == 77 || i9 == 44 || i9 == 78 || i9 == 79 || i9 == 100 || i9 == 101 || i9 == 83;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.Q;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.W;
    }

    public final void i() {
        org.telegram.ui.ActionBar.f6.w1(-115203550, this.Q);
        this.b.setTextColor(-1);
        this.c.setTextColor(-1);
        pi0 pi0Var = this.f;
        pi0Var.h(-14540254, "info1");
        pi0Var.h(-14540254, "info2");
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i9, long j10, Runnable runnable) {
        k(j10, i9, null, null, runnable, null);
    }

    public void k(long j10, int i9, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i9, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i9, Runnable runnable, Runnable runnable2) {
        k(j10, i9, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i9) {
        k(j10, i9, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x16f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x171c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1807  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x16db  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x175b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x170a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x08a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i9, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        org.telegram.ui.Cells.x1 x1Var;
        String str;
        boolean z10;
        pi0 pi0Var;
        long j10;
        int i10;
        int dp;
        CharSequence replaceTags;
        int i11;
        int i12;
        CharSequence charSequence;
        int i13;
        CharSequence replaceTags2;
        String string;
        int i14;
        String str2;
        int i15;
        int i16;
        SpannableStringBuilder replaceTags3;
        int i17;
        int i18;
        if (!AndroidUtilities.shouldShowClipboardToast() && ((i18 = this.G) == 52 || i18 == 56 || i18 == 57 || i18 == 58 || i18 == 59 || i18 == 60 || i18 == 80 || i18 == 33)) {
            return;
        }
        Runnable runnable3 = this.I;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.M = true;
        this.I = runnable;
        this.J = runnable2;
        this.H = arrayList;
        Long l10 = (Long) arrayList.get(0);
        long longValue = l10.longValue();
        this.G = i9;
        this.C = 5000L;
        this.v = obj;
        this.w = obj2;
        this.K = SystemClock.elapsedRealtime();
        String string2 = LocaleController.getString(R.string.UndoNoCaps);
        TextView textView = this.d;
        textView.setText(string2);
        ImageView imageView = this.e;
        imageView.setVisibility(0);
        pi0 pi0Var2 = this.f;
        pi0Var2.setPadding(0, 0, 0, 0);
        pi0Var2.setScaleX(1.0f);
        pi0Var2.setScaleY(1.0f);
        org.telegram.ui.Cells.x1 x1Var2 = this.b;
        x1Var2.setTextSize(1, 15.0f);
        o9 o9Var = this.h;
        o9Var.setVisibility(8);
        x1Var2.setGravity(51);
        TextView textView2 = this.c;
        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
        layoutParams.bottomMargin = 0;
        pi0Var2.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pi0Var2.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
        layoutParams2.width = AndroidUtilities.dp(54.0f);
        layoutParams2.height = -2;
        x1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i9 == 83) {
            setOnClickListener(new t41(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new jh.d(26));
            movementMethod = null;
        }
        x1Var2.setMovementMethod(movementMethod);
        boolean g10 = g();
        LinearLayout linearLayout = this.n;
        int i19 = this.x;
        int i20 = 36;
        if (g10) {
            if (i9 == 83) {
                textView2.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.SoundAdded);
                charSequence = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.I = null;
                i12 = R.raw.sound_download;
                this.C = 4000L;
            } else if (i9 == 74) {
                textView2.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.ReportChatSent);
                charSequence = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                i12 = R.raw.ic_admin;
                this.C = 4000L;
            } else {
                if (i9 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i16 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user)));
                    } else {
                        i16 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                    }
                    z8 z8Var = new z8();
                    z8Var.u(AndroidUtilities.dp(12.0f));
                    z8Var.m(i19, user);
                    o9Var.e(user, z8Var);
                    o9Var.setVisibility(i16);
                    this.C = 3000L;
                    replaceTags = replaceTags3;
                } else if (i9 == 44) {
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
                    z8 z8Var2 = new z8();
                    z8Var2.u(AndroidUtilities.dp(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    z8Var2.j(i19, tLObject);
                    o9Var.e(tLObject, z8Var2);
                    o9Var.setVisibility(0);
                    this.C = 3000L;
                } else if (i9 == 37) {
                    z8 z8Var3 = new z8();
                    z8Var3.u(AndroidUtilities.dp(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        z8Var3.m(i19, user3);
                        o9Var.e(user3, z8Var3);
                        str2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        z8Var3.k(i19, chat3);
                        o9Var.e(chat3, z8Var3);
                        str2 = chat3.title;
                    }
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i15 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, str2));
                    } else {
                        i15 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, str2));
                    }
                    o9Var.setVisibility(i15);
                    this.C = 3000L;
                } else {
                    if (i9 == 33) {
                        replaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                        int i21 = R.raw.voip_invite;
                        this.C = 3000L;
                        i12 = i21;
                        x1Var = x1Var2;
                    } else {
                        if (i9 == 77) {
                            replaceTags = (CharSequence) obj;
                            i13 = R.raw.payment_success;
                            this.C = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                x1Var = x1Var2;
                            } else {
                                setOnTouchListener(null);
                                x1Var = x1Var2;
                                x1Var.setMovementMethod(null);
                                setOnClickListener(new vh0(8, this, (TLRPC.Message) obj2));
                            }
                        } else {
                            x1Var = x1Var2;
                            if (i9 == 30) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i13 = R.raw.voip_muted;
                                this.C = 3000L;
                            } else if (i9 == 35) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                i13 = R.raw.voip_muted;
                                this.C = 3000L;
                            } else if (i9 == 31) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i13 = R.raw.voip_unmuted;
                                this.C = 3000L;
                            } else if (i9 == 38) {
                                replaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                i13 = R.raw.voip_allow_talk;
                                this.C = 3000L;
                            } else if (i9 == 42) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                i13 = R.raw.ic_mute;
                                this.C = 3000L;
                            } else if (i9 == 43) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                i13 = R.raw.ic_unmute;
                                this.C = 3000L;
                            } else {
                                int i22 = this.G;
                                if (i22 == 39 || i22 == 100) {
                                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i22 == 39 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                    i11 = R.raw.voip_record_start;
                                    this.C = 3000L;
                                } else if (i22 == 40 || i22 == 101) {
                                    String string3 = LocaleController.getString(i22 == 40 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                    i13 = R.raw.voip_record_saved;
                                    this.C = 4000L;
                                    x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                    int indexOf = string3.indexOf("**");
                                    int lastIndexOf = string3.lastIndexOf("**");
                                    if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                        spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                        try {
                                            spannableStringBuilder.setSpan(new p41("tg://openmessage?user_id=" + UserConfig.getInstance(i19).getClientUserId()), indexOf, lastIndexOf - 2, 33);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                    replaceTags = spannableStringBuilder;
                                    i20 = 36;
                                } else if (i9 == 36) {
                                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    i13 = R.raw.voip_unmuted;
                                    this.C = 3000L;
                                } else if (i9 == 32 || i9 == 102) {
                                    String firstName = obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                    replaceTags = i9 == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                    i11 = R.raw.ic_ban;
                                    this.C = 3000L;
                                } else if (i9 == 9 || i9 == 10) {
                                    TLRPC.User user4 = (TLRPC.User) obj;
                                    replaceTags = i9 == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                    i11 = R.raw.contact_check;
                                } else if (i9 == 8) {
                                    replaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                    i12 = R.raw.contact_check;
                                } else if (i9 == 87) {
                                    replaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                    i13 = R.raw.contact_check;
                                } else if (i9 == 22) {
                                    if (DialogObject.isUserDialog(longValue)) {
                                        replaceTags = obj == null ? LocaleController.getString(R.string.MainProfilePhotoSetHint) : LocaleController.getString(R.string.MainProfileVideoSetHint);
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-longValue));
                                        replaceTags = (!ChatObject.isChannel(chat4) || chat4.megagroup) ? obj == null ? LocaleController.getString(R.string.MainGroupProfilePhotoSetHint) : LocaleController.getString(R.string.MainGroupProfileVideoSetHint) : obj == null ? LocaleController.getString(R.string.MainChannelProfilePhotoSetHint) : LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                    }
                                    i13 = R.raw.contact_check;
                                } else if (i9 == 23) {
                                    replaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                    i11 = R.raw.contact_check;
                                } else {
                                    if (i9 == 6) {
                                        replaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                        charSequence = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                        i12 = R.raw.chats_swipearchive;
                                        i20 = 48;
                                    } else {
                                        if (i22 == 13) {
                                            replaceTags = LocaleController.getString(R.string.QuizWellDone);
                                            charSequence = LocaleController.getString(R.string.QuizWellDoneInfo);
                                            i12 = R.raw.wallet_congrats;
                                        } else if (i22 == 14) {
                                            replaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                            charSequence = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                            i12 = R.raw.wallet_science;
                                        } else {
                                            if (i9 == 7) {
                                                replaceTags = LocaleController.getString(R.string.ArchivePinned);
                                                string = MessagesController.getInstance(i19).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                                i14 = R.raw.chats_infotip;
                                            } else if (i9 == 20 || i9 == 21) {
                                                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, x1Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, x1Var.getPaint().getFontMetricsInt());
                                                this.a = dialogFilter.title_noanimate ? 26 : 0;
                                                if (longValue != 0) {
                                                    long j11 = DialogObject.isEncryptedDialog(longValue) ? org.telegram.messenger.l0.l(MessagesController.getInstance(i19), longValue).user_id : longValue;
                                                    if (DialogObject.isUserDialog(j11)) {
                                                        TLRPC.User user5 = MessagesController.getInstance(i19).getUser(Long.valueOf(j11));
                                                        String firstName2 = UserObject.getFirstName(user5);
                                                        if (UserObject.isUserSelf(user5)) {
                                                            firstName2 = LocaleController.getString(R.string.SavedMessages);
                                                        } else if (UserObject.isReplyUser(user5)) {
                                                            firstName2 = LocaleController.getString(R.string.RepliesTitle);
                                                        }
                                                        replaceTags2 = i9 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName2, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName2, replaceAnimatedEmoji));
                                                    } else {
                                                        TLRPC.Chat chat5 = MessagesController.getInstance(i19).getChat(Long.valueOf(-j11));
                                                        replaceTags2 = i9 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, replaceAnimatedEmoji));
                                                    }
                                                } else {
                                                    replaceTags2 = i9 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji));
                                                }
                                                CharSequence charSequence2 = replaceTags2;
                                                i12 = i9 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                replaceTags = charSequence2;
                                                charSequence = null;
                                                i20 = 36;
                                            } else if (i9 == 19) {
                                                replaceTags = this.O;
                                                i11 = R.raw.ic_delete;
                                            } else if (i9 == 82) {
                                                replaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                                charSequence = null;
                                                i12 = 0;
                                                i20 = 36;
                                            } else if (i9 == 78 || i9 == 79) {
                                                int intValue = ((Integer) obj).intValue();
                                                replaceTags = i9 == 78 ? LocaleController.formatPluralString("PinnedDialogsCount", intValue, new Object[0]) : LocaleController.formatPluralString("UnpinnedDialogsCount", intValue, new Object[0]);
                                                i11 = this.G == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                if (obj2 instanceof Integer) {
                                                    this.C = ((Integer) obj2).intValue();
                                                }
                                            } else {
                                                replaceTags = i9 == 3 ? LocaleController.getString(R.string.ChatArchived) : LocaleController.getString(R.string.ChatsArchived);
                                                string = MessagesController.getInstance(i19).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                i14 = R.raw.chats_infotip;
                                            }
                                            i12 = i14;
                                            charSequence = string;
                                            i20 = 36;
                                        }
                                        i20 = 44;
                                    }
                                    x1Var.setText(replaceTags);
                                    if (i12 != 0) {
                                        pi0Var2.e(i12, i20, i20);
                                        mi0 animatedDrawable = pi0Var2.getAnimatedDrawable();
                                        animatedDrawable.h = false;
                                        animatedDrawable.N(animatedDrawable.q());
                                        pi0Var2.setVisibility(0);
                                        pi0Var2.setProgress(0.0f);
                                        pi0Var2.d();
                                    } else {
                                        pi0Var2.setVisibility(8);
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
                                        i17 = 8;
                                    } else {
                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                        i17 = 8;
                                        textView2.setVisibility(8);
                                        x1Var.setTextSize(1, 15.0f);
                                        x1Var.setTypeface(Typeface.DEFAULT);
                                    }
                                    linearLayout.setVisibility(i17);
                                }
                                i12 = i11;
                                charSequence = null;
                                i20 = 36;
                                x1Var.setText(replaceTags);
                                if (i12 != 0) {
                                }
                                if (charSequence != null) {
                                }
                                linearLayout.setVisibility(i17);
                            }
                        }
                        i12 = i13;
                    }
                    charSequence = null;
                    x1Var.setText(replaceTags);
                    if (i12 != 0) {
                    }
                    if (charSequence != null) {
                    }
                    linearLayout.setVisibility(i17);
                }
                x1Var = x1Var2;
                charSequence = null;
                i12 = 0;
                x1Var.setText(replaceTags);
                if (i12 != 0) {
                }
                if (charSequence != null) {
                }
                linearLayout.setVisibility(i17);
            }
            x1Var = x1Var2;
            x1Var.setText(replaceTags);
            if (i12 != 0) {
            }
            if (charSequence != null) {
            }
            linearLayout.setVisibility(i17);
        } else {
            x1Var = x1Var2;
            int i23 = this.G;
            if (i23 == 45 || i23 == 46 || i23 == 47 || i23 == 52 || i23 == 53 || i23 == 54 || i23 == 55 || i23 == 56 || i23 == 57 || i23 == 58 || i23 == 59 || i23 == 60 || i23 == 71 || i23 == 70 || i23 == 75 || i23 == 76 || i23 == 41 || i23 == 78 || i23 == 79 || i23 == 61 || i23 == 80) {
                str = "";
                imageView.setVisibility(8);
                pi0Var2.setVisibility(0);
                x1Var.setTypeface(Typeface.DEFAULT);
                int i24 = this.G;
                long j12 = -1;
                if (i24 != 76) {
                    z10 = true;
                    if (i24 == 75) {
                        x1Var.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                        pi0Var2.e(R.raw.chats_infotip, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                        pi0Var = pi0Var2;
                        j10 = -1;
                        i10 = 8;
                    } else if (i9 == 70) {
                        int intValue2 = ((Integer) obj2).intValue();
                        textView2.setSingleLine(false);
                        x1Var.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(intValue2)));
                        pi0Var2.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        this.C = 4000L;
                        pi0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    } else {
                        if (i24 == 71) {
                            x1Var.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                            pi0Var2.e(R.raw.fire_off, 36, 36);
                            x1Var.setTextSize(1, 14.0f);
                            this.C = 3000L;
                            pi0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        } else if (i24 == 45) {
                            x1Var.setText(LocaleController.getString(R.string.ImportMutualError));
                            pi0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            x1Var.setTextSize(1, 14.0f);
                        } else if (i24 == 46) {
                            x1Var.setText(LocaleController.getString(R.string.ImportNotAdmin));
                            pi0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            x1Var.setTextSize(1, 14.0f);
                        } else if (i24 == 47) {
                            x1Var.setText(LocaleController.getString(R.string.ImportedInfo));
                            pi0Var2.e(R.raw.imported, 36, 36);
                            pi0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            x1Var.setTextSize(1, 14.0f);
                        } else {
                            if (i24 == 52 || i24 == 56 || i24 == 57 || i24 == 58 || i24 == 59 || i24 == 60 || i24 == 80) {
                                pi0Var = pi0Var2;
                                if (!AndroidUtilities.shouldShowClipboardToast()) {
                                    return;
                                }
                                int i25 = R.raw.copy;
                                int i26 = this.G;
                                if (i26 == 80) {
                                    x1Var.setText(LocaleController.getString(R.string.EmailCopied));
                                } else if (i26 == 60) {
                                    x1Var.setText(LocaleController.getString(R.string.PhoneCopied));
                                } else if (i26 == 56) {
                                    x1Var.setText(LocaleController.getString(R.string.UsernameCopied));
                                } else if (i26 == 57) {
                                    x1Var.setText(LocaleController.getString(R.string.HashtagCopied));
                                } else if (i26 == 52) {
                                    x1Var.setText(LocaleController.getString(R.string.MessageCopied));
                                } else if (i26 == 59) {
                                    i25 = R.raw.voip_invite;
                                    x1Var.setText(LocaleController.getString(R.string.LinkCopied));
                                } else {
                                    x1Var.setText(LocaleController.getString(R.string.TextCopied));
                                }
                                pi0Var.e(i25, 30, 30);
                                this.C = 3000L;
                                x1Var.setTextSize(1, 15.0f);
                            } else if (i24 == 54) {
                                x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                                pi0Var2.e(R.raw.silent_unmute, 30, 30);
                                this.C = 3000L;
                                x1Var.setTextSize(1, 15.0f);
                            } else if (i24 == 55) {
                                x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                                pi0Var2.e(R.raw.silent_mute, 30, 30);
                                this.C = 3000L;
                                x1Var.setTextSize(1, 15.0f);
                            } else if (i24 == 41) {
                                if (obj2 != null) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                } else if (longValue == UserConfig.getInstance(i19).clientUserId) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                                } else if (DialogObject.isChatDialog(longValue)) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i19).getChat(Long.valueOf(-longValue)).title)));
                                } else {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i19).getUser(l10)))));
                                }
                                pi0Var2.e(R.raw.contact_check, 36, 36);
                                this.C = 3000L;
                            } else if (i24 == 53) {
                                Integer num = (Integer) obj;
                                if (obj2 == null || (obj2 instanceof TLRPC.TL_forumTopic)) {
                                    pi0Var = pi0Var2;
                                    if (longValue == UserConfig.getInstance(i19).clientUserId) {
                                        if (num.intValue() == 1) {
                                            x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new hc(17)));
                                        } else {
                                            x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new hc(17)));
                                        }
                                        pi0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            TLRPC.Chat chat6 = MessagesController.getInstance(i19).getChat(Long.valueOf(-longValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            String i27 = ChatObject.isMonoForum(chat6) ? vf.c.i(chat6, i19, false) : null;
                                            if (num.intValue() == 1) {
                                                int i28 = R.string.FwdMessageToGroup;
                                                if (i27 == null) {
                                                    i27 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i28, i27)));
                                            } else {
                                                int i29 = R.string.FwdMessagesToGroup;
                                                if (i27 == null) {
                                                    i27 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i29, i27)));
                                            }
                                        } else {
                                            TLRPC.User user6 = MessagesController.getInstance(i19).getUser(l10);
                                            if (num.intValue() == 1) {
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user6))));
                                            } else {
                                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user6))));
                                            }
                                        }
                                        pi0Var.e(R.raw.forward, 30, 30);
                                        j12 = 300;
                                    }
                                } else {
                                    int intValue3 = ((Integer) obj2).intValue();
                                    if (num.intValue() == 1) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", intValue3, new Object[0])));
                                    } else {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", intValue3, new Object[0])));
                                    }
                                    pi0Var2.e(R.raw.forward, 30, 30);
                                    j12 = 300;
                                    pi0Var = pi0Var2;
                                }
                                this.C = 3000L;
                            } else {
                                pi0Var = pi0Var2;
                                if (i24 == 61) {
                                    if (obj2 != null) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                        pi0Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == UserConfig.getInstance(i19).clientUserId) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                        pi0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i19).getChat(Long.valueOf(-longValue)).title)));
                                        } else {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i19).getUser(l10)))));
                                        }
                                        pi0Var.e(R.raw.forward, 30, 30);
                                    }
                                    this.C = 3000L;
                                }
                            }
                            j10 = j12;
                            i10 = 8;
                            z10 = false;
                        }
                        pi0Var = pi0Var2;
                        j10 = j12;
                        i10 = 8;
                        z10 = false;
                    }
                    textView2.setVisibility(i10);
                    textView.setTextColor(c(org.telegram.ui.ActionBar.f6.Gi));
                    linearLayout.setVisibility(i10);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    pi0Var.setProgress(0.0f);
                    pi0Var.d();
                    if (j10 > 0) {
                        pi0Var.postDelayed(new tp0(this, 27), j10);
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
                        measureChildWithMargins(textView2, org.telegram.messenger.ll.d(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
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
                        measureChildWithMargins(view, org.telegram.messenger.ll.d(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        int measuredHeight = view.getMeasuredHeight();
                        int i30 = this.G;
                        int dp2 = AndroidUtilities.dp((i30 == 16 || i30 == 17 || i30 == 18 || i30 == 84 || i30 == 86) ? 14.0f : 28.0f) + measuredHeight;
                        this.r = dp2;
                        int i31 = this.G;
                        if (i31 == 18) {
                            this.r = Math.max(dp2, AndroidUtilities.dp(52.0f));
                        } else if (i31 == 25) {
                            this.r = Math.max(dp2, AndroidUtilities.dp(50.0f));
                        } else if (z10) {
                            this.r = dp2 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() == 0) {
                        setVisibility(0);
                        setEnterOffset((this.N ? -1.0f : 1.0f) * (this.S + this.r));
                        AnimatorSet animatorSet = new AnimatorSet();
                        boolean z11 = this.N;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.S + this.r), z11 ? 1.0f : -1.0f));
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.setDuration(180L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                x1Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                pi0Var2.e(R.raw.gigagroup_convert, 36, 36);
                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                x1Var.setTextSize(1, 14.0f);
                pi0Var = pi0Var2;
                j10 = -1;
                i10 = 8;
                z10 = true;
                textView2.setVisibility(i10);
                textView.setTextColor(c(org.telegram.ui.ActionBar.f6.Gi));
                linearLayout.setVisibility(i10);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                pi0Var.setProgress(0.0f);
                pi0Var.d();
                if (j10 > 0) {
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
                if (i23 == 24 || i23 == 25) {
                    str = "";
                    int intValue4 = ((Integer) obj).intValue();
                    TLRPC.User user7 = (TLRPC.User) obj2;
                    imageView.setVisibility(8);
                    pi0Var2.setVisibility(0);
                    if (intValue4 != 0) {
                        x1Var.setTypeface(AndroidUtilities.bold());
                        x1Var.setTextSize(1, 14.0f);
                        pi0Var2.a.clear();
                        int i32 = org.telegram.ui.ActionBar.f6.Hi;
                        pi0Var2.h(c(i32), "BODY");
                        pi0Var2.h(c(i32), "Wibe Big");
                        pi0Var2.h(c(i32), "Wibe Big 3");
                        pi0Var2.h(c(i32), "Wibe Small");
                        x1Var.setText(LocaleController.getString(R.string.ProximityAlertSet));
                        pi0Var2.e(R.raw.ic_unmute, 28, 28);
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
                        pi0Var2.a.clear();
                        int i33 = org.telegram.ui.ActionBar.f6.Hi;
                        pi0Var2.h(c(i33), "Body Main");
                        pi0Var2.h(c(i33), "Body Top");
                        pi0Var2.h(c(i33), "Line");
                        pi0Var2.h(c(i33), "Curve Big");
                        pi0Var2.h(c(i33), "Curve Small");
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        x1Var.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                        pi0Var2.e(R.raw.ic_mute, 28, 28);
                        textView2.setVisibility(8);
                        textView.setTextColor(c(org.telegram.ui.ActionBar.f6.Gi));
                        linearLayout.setVisibility(0);
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    pi0Var2.setProgress(0.0f);
                    pi0Var2.d();
                } else if (i23 == 11) {
                    x1Var.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                    pi0Var2.e(R.raw.contact_check, 36, 36);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    textView2.setText(((TLRPC.TL_authorization) obj).app_name);
                    textView2.setVisibility(0);
                    x1Var.setTextSize(1, 14.0f);
                    x1Var.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(c(org.telegram.ui.ActionBar.f6.p7));
                    imageView.setVisibility(8);
                    linearLayout.setVisibility(0);
                    pi0Var2.setVisibility(0);
                    pi0Var2.setProgress(0.0f);
                    pi0Var2.d();
                } else if (i23 == 15) {
                    this.C = 10000L;
                    textView.setText(LocaleController.getString(R.string.Open));
                    x1Var.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                    pi0Var2.e(R.raw.filter_new, 36, 36);
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
                        spannableStringBuilder2.setSpan(new p41("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                    }
                    textView2.setText(spannableStringBuilder2);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(2);
                    linearLayout.setVisibility(0);
                    imageView.setVisibility(8);
                    pi0Var2.setVisibility(0);
                    pi0Var2.setProgress(0.0f);
                    pi0Var2.d();
                } else if (i23 == 16 || i23 == 17) {
                    str = "";
                    this.C = 4000L;
                    x1Var.setTextSize(1, 14.0f);
                    x1Var.setGravity(16);
                    x1Var.setMinHeight(AndroidUtilities.dp(30.0f));
                    String str3 = (String) obj;
                    if ("🎲".equals(str3)) {
                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                        pi0Var2.setImageResource(R.drawable.dice);
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
                        pi0Var2.setImageDrawable(Emoji.getEmojiDrawable(str3));
                        pi0Var2.setScaleType(ImageView.ScaleType.FIT_XY);
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.width = AndroidUtilities.dp(26.0f);
                        layoutParams2.height = AndroidUtilities.dp(26.0f);
                    }
                    textView.setText(LocaleController.getString(R.string.SendDice));
                    if (this.G == 16) {
                        dp = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        textView.setVisibility(0);
                        textView.setTextColor(c(org.telegram.ui.ActionBar.f6.Gi));
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
                    pi0Var2.setVisibility(0);
                } else if (i23 == 18) {
                    this.C = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
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
                    pi0Var2.setVisibility(0);
                    pi0Var2.e(R.raw.chats_infotip, 36, 36);
                    pi0Var2.setProgress(0.0f);
                    pi0Var2.d();
                    x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                } else if (i23 == 12) {
                    x1Var.setText(LocaleController.getString(R.string.ColorThemeChanged));
                    pi0Var2.setImageResource(R.drawable.toast_pallete);
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
                        spannableStringBuilder3.setSpan(new p41("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                    }
                    textView2.setText(spannableStringBuilder3);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(2);
                    textView.setVisibility(8);
                    linearLayout.setVisibility(0);
                    pi0Var2.setVisibility(0);
                } else {
                    str = "";
                    if (i23 == 84) {
                        x1Var.setVisibility(0);
                        x1Var.setTextSize(1, 15.0f);
                        x1Var.setTypeface(Typeface.DEFAULT);
                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                        pi0Var2.setVisibility(0);
                        pi0Var2.e(R.raw.voice_to_text, 36, 36);
                        pi0Var2.setProgress(0.0f);
                        pi0Var2.d();
                        layoutParams.leftMargin = org.telegram.ui.Cells.j2.c(58.0f, R.string.PremiumMore, textView);
                        layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        int dp5 = AndroidUtilities.dp(6.0f);
                        layoutParams.bottomMargin = dp5;
                        layoutParams.topMargin = dp5;
                        layoutParams.height = -2;
                        o9Var.setVisibility(8);
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        linearLayout.setVisibility(0);
                        imageView.setVisibility(8);
                    } else if (i23 == 85) {
                        x1Var.setVisibility(0);
                        x1Var.setTextSize(1, 15.0f);
                        x1Var.setTypeface(AndroidUtilities.bold());
                        x1Var.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                        pi0Var2.setVisibility(0);
                        pi0Var2.e(R.raw.hint_swipe_reply, 64, 64);
                        pi0Var2.setProgress(0.0f);
                        pi0Var2.d();
                        textView2.setVisibility(0);
                        layoutParams.leftMargin = org.telegram.ui.Cells.j2.c(58.0f, R.string.SwipeToReplyHintMessage, textView2);
                        layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams.height = -2;
                        o9Var.setVisibility(8);
                        linearLayout.setVisibility(8);
                    } else if (i23 == 90 || i23 == 91 || i23 == 92 || i23 == 93 || i23 == 94) {
                        switch (i23) {
                            case 90:
                                x1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) bg.u0.f(), new Object[0]));
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
                        pi0Var2.setVisibility(0);
                        pi0Var2.e(R.raw.chats_infotip, 36, 36);
                        pi0Var2.setProgress(0.0f);
                        pi0Var2.d();
                    } else if (i23 == 2 || i23 == 4) {
                        if (i9 == 2) {
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
                        pi0Var2.setVisibility(0);
                        pi0Var2.e(R.raw.chats_archived, 36, 36);
                        pi0Var2.setProgress(0.0f);
                        pi0Var2.d();
                    } else if (i9 == 82) {
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        x1Var.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                        linearLayout.setVisibility(0);
                        x1Var.setTextSize(1, 15.0f);
                        x1Var.setTypeface(Typeface.DEFAULT);
                        textView2.setVisibility(8);
                        o9Var.setVisibility(0);
                        o9Var.setRoundRadius(AndroidUtilities.dp(2.0f));
                        String str4 = photoEntry.thumbPath;
                        if (str4 != null) {
                            o9Var.f(str4, null, org.telegram.ui.ActionBar.f6.R4);
                        } else if (photoEntry.path != null) {
                            o9Var.p(photoEntry.orientation, photoEntry.invert, true);
                            if (photoEntry.isVideo) {
                                o9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
                            } else {
                                o9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
                            }
                        } else {
                            o9Var.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
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
                        pi0Var2.setVisibility(8);
                        int i34 = this.G;
                        if (i34 == 88) {
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
                                int i35 = R.string.FolderLinkDeleted;
                                if (str5 == null) {
                                    str5 = str;
                                }
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i35, str5.replace('*', (char) 10033))));
                            }
                        } else if (i34 == 81 || i34 == 0 || i34 == 26) {
                            x1Var.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                        } else if (i34 == 27) {
                            x1Var.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                        } else if (i34 == 95) {
                            if (DialogObject.isChatDialog(longValue)) {
                                TLRPC.Chat chat7 = MessagesController.getInstance(i19).getChat(Long.valueOf(-longValue));
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
                            TLRPC.Chat chat8 = MessagesController.getInstance(i19).getChat(Long.valueOf(-longValue));
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
                        if (this.G != 81) {
                            for (int i36 = 0; i36 < arrayList.size(); i36++) {
                                MessagesController messagesController = MessagesController.getInstance(i19);
                                long longValue2 = ((Long) arrayList.get(i36)).longValue();
                                int i37 = this.G;
                                messagesController.addDialogAction(longValue2, i37 == 0 || i37 == 26);
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
        float f10 = this.L;
        ShapeDrawable shapeDrawable = this.Q;
        if (f10 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.W) + this.S + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i9 = this.G;
        if (i9 == 1 || i9 == 95 || i9 == 0 || i9 == 27 || i9 == 26 || i9 == 81 || i9 == 88) {
            int ceil = this.C > 0 ? (int) Math.ceil(r2 / 1000.0f) : 0;
            int i10 = this.D;
            TextPaint textPaint = this.y;
            if (i10 != ceil) {
                this.D = ceil;
                this.E = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.T;
                if (staticLayout != null) {
                    this.U = staticLayout;
                    this.V = 0.0f;
                }
                this.F = (int) Math.ceil(textPaint.measureText(r2));
                this.T = new StaticLayout(this.E, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f11 = this.V;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.10666667f;
                this.V = f12;
                if (f12 > 1.0f) {
                    this.V = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.U;
            RectF rectF = this.B;
            if (staticLayout2 != null) {
                float f13 = this.V;
                if (f13 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f13) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.F / 2), (AndroidUtilities.dp(10.0f) * this.V) + AndroidUtilities.dp(17.2f));
                    this.U.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.T != null) {
                float f14 = this.V;
                if (f14 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f14));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.F / 2), j3.r0.C(1.0f, this.V, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.T.draw(canvas);
                if (this.V != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.C / 5000.0f) * (-360.0f), false, this.A);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.C - (elapsedRealtime - this.K);
        this.C = j10;
        this.K = elapsedRealtime;
        if (j10 <= 0) {
            e(this.P, true);
        }
        if (this.G != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.Q.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.L != f10) {
            this.L = f10;
            setTranslationY(((this.W - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.W != f10) {
            this.W = f10;
            setTranslationY(((f10 - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i9) {
        this.S = i9;
    }

    public void setHideAnimationType(int i9) {
        this.P = i9;
    }

    public void setInfoText(CharSequence charSequence) {
        this.O = charSequence;
    }

    public UndoView(Context context, oc1 oc1Var) {
        this(context, oc1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = 0;
        this.x = UserConfig.selectedAccount;
        this.G = -1;
        this.P = 1;
        this.S = AndroidUtilities.dp(8.0f);
        this.V = 1.0f;
        this.R = b6Var;
        this.s = o2Var;
        this.N = z10;
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, context, b6Var);
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        int i9 = org.telegram.ui.ActionBar.f6.Hi;
        x1Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.Gi;
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        x1Var.setMovementMethod(new u41(this));
        addView(x1Var, g7.e6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, g7.e6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        pi0 pi0Var = new pi0(context);
        this.f = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.f6.Fi;
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i11, b6Var) | (-16777216), "info1");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i11, b6Var) | (-16777216), "info2");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc12");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc11");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc10");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc9");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc8");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc7");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc6");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc5");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc4");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc3");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc2");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc1");
        pi0Var.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "Oval");
        addView(pi0Var, g7.e6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        o9 o9Var = new o9(context);
        this.h = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(o9Var, g7.e6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(i10, b6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new t41(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, g7.e6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 19, 6, 4, 8, 4));
        this.B = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        setWillNotDraw(false);
        this.Q = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        setOnTouchListener(new jh.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i9, long j10) {
    }
}
