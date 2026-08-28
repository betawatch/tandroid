package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class fa extends LinearLayout {
    public org.telegram.ui.Components.m9 a;
    public org.telegram.ui.Components.m9 b;
    public Drawable c;
    public Drawable d;
    public final t1[] e;
    public final Drawable f;
    public final org.telegram.ui.ActionBar.b5 h;
    public final int n;
    public org.telegram.ui.ActionBar.o2 r;
    public int s;
    public final g v;
    public Drawable w;
    public boolean x;
    public final org.telegram.ui.Components.y5 y;

    public fa(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i9) {
        this(context, b5Var, i9, 0L, null);
    }

    public final boolean a() {
        int i9 = this.n;
        return i9 == 3 || i9 == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n == 2 || a()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public t1[] getCells() {
        return this.e;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i9 = 0;
        while (true) {
            t1[] t1VarArr = this.e;
            if (i9 >= t1VarArr.length) {
                return;
            }
            t1VarArr[i9].invalidate();
            i9++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.w;
        if (drawable instanceof tn) {
            ((tn) drawable).f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.m9 m9Var = this.a;
        if (m9Var != null) {
            m9Var.dispose();
            this.a = null;
        }
        org.telegram.ui.Components.m9 m9Var2 = this.b;
        if (m9Var2 != null) {
            m9Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.w;
        if (drawable instanceof tn) {
            ((tn) drawable).g(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.w;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.f6.s0();
        }
        if (org.telegram.ui.ActionBar.f6.d != null) {
            invalidate();
        }
        Drawable drawable2 = this.c;
        org.telegram.ui.Components.y5 y5Var = this.y;
        if (drawable != drawable2 && drawable != null) {
            if (org.telegram.ui.ActionBar.f6.sl == null && !this.x) {
                org.telegram.ui.Components.m9 m9Var = this.a;
                if (m9Var != null) {
                    m9Var.dispose();
                    this.a = null;
                }
            } else {
                this.d = drawable2;
                this.b = this.a;
            }
            this.c = drawable;
            y5Var.d(0.0f, true);
        }
        boolean z10 = this.x;
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        float d = z10 ? y5Var.d(1.0f, false) : b5Var.getThemeAnimationValue();
        int i9 = 0;
        while (i9 < 2) {
            Drawable drawable3 = i9 == 0 ? this.d : this.c;
            if (drawable3 != null) {
                int i10 = (i9 != 1 || this.d == null || (b5Var == null && !this.x)) ? 255 : (int) (255.0f * d);
                if (i10 > 0) {
                    drawable3.setAlpha(i10);
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof jb0)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof org.telegram.ui.Components.n9) {
                            this.a = ((org.telegram.ui.Components.n9) drawable3).c(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f10 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f10, f10);
                            drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i11 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable3.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                        }
                        drawable3.draw(canvas);
                        canvas.restore();
                    } else {
                        kh.a8.j(canvas, drawable3, getWidth(), getHeight());
                    }
                    if (i9 == 0 && this.d != null && d >= 1.0f) {
                        org.telegram.ui.Components.m9 m9Var2 = this.b;
                        if (m9Var2 != null) {
                            m9Var2.dispose();
                            this.b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
            i9++;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.n == 2 || a()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.n == 2 || a()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOverrideBackground(Drawable drawable) {
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.w instanceof tn) && isAttachedToWindow()) {
            ((tn) this.w).f(this);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.w || drawable == this.d || super.verifyDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x046e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fa(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        MessageObject messageObject;
        MessageObject messageObject2;
        int i10;
        t1[] t1VarArr;
        Context context2 = context;
        int i11 = i9;
        this.e = new t1[2];
        this.s = -1;
        this.v = new g(this, 9);
        this.y = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.n = i11;
        int i12 = UserConfig.selectedAccount;
        this.h = b5Var;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
        this.f = org.telegram.ui.ActionBar.f6.U0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.b7, b6Var2));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i11 == 3) {
            boolean z10 = j10 < 0;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(z10 ? R.string.ChannelColorPreview : R.string.UserColorPreview);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j10 == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerChannel();
                tL_message.reply_to.reply_to_peer_id.channel_id = -j10;
            }
            TLRPC.Message message = new TLRPC.Message();
            tL_message.replyMessage = message;
            message.media = new TLRPC.TL_messageMediaEmpty();
            if (j10 == 0) {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.from_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message2 = tL_message.replyMessage;
                long j11 = -j10;
                message2.from_id.channel_id = j11;
                message2.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j11;
            }
            tL_message.replyMessage.message = LocaleController.getString(z10 ? R.string.ChannelColorPreviewReply : R.string.UserColorPreviewReply);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = LocaleController.getString(R.string.AppName);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = LocaleController.getString(z10 ? R.string.ChannelColorPreviewLinkTitle : R.string.UserColorPreviewLinkTitle);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = LocaleController.getString(z10 ? R.string.ChannelColorPreviewLinkDescription : R.string.UserColorPreviewLinkDescription);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 259;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_message.id = 1;
            tL_message.out = false;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = 0L;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = -j10;
            }
            MessageObject messageObject3 = new MessageObject(UserConfig.selectedAccount, tL_message, true, false);
            messageObject3.notime = true;
            messageObject3.forceAvatar = true;
            messageObject3.resetLayout();
            messageObject3.eventId = 1L;
            messageObject = messageObject3;
        } else if (i11 == 2) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = LocaleController.getString(R.string.DoubleTapPreviewMessage);
            tL_message2.date = currentTimeMillis - 3540;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 259;
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_message2.from_id = tL_peerUser3;
            tL_peerUser3.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message2.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = 0L;
            MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tL_message2, true, false);
            messageObject4.resetLayout();
            messageObject4.eventId = 1L;
            messageObject4.customName = LocaleController.getString(R.string.DoubleTapPreviewSenderName);
            messageObject4.customAvatarDrawable = context2.getDrawable(R.drawable.dino_pic);
            messageObject4.overrideLinkColor = 5;
            messageObject4.overrideLinkEmoji = 0L;
            messageObject = messageObject4;
        } else {
            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
            if (i11 == 0) {
                tL_message3.message = LocaleController.getString(R.string.FontSizePreviewReply);
            } else {
                tL_message3.message = LocaleController.getString(R.string.NewThemePreviewReply);
            }
            int indexOf = tL_message3.message.indexOf("👋");
            if (indexOf >= 0) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                tL_messageEntityCustomEmoji.offset = indexOf;
                tL_messageEntityCustomEmoji.length = 2;
                tL_messageEntityCustomEmoji.document_id = 5386654653003864312L;
                tL_message3.entities.add(tL_messageEntityCustomEmoji);
            }
            int i13 = currentTimeMillis - 3540;
            tL_message3.date = i13;
            tL_message3.dialog_id = 1L;
            tL_message3.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message3.from_id = tL_peerUser5;
            tL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tL_message3.id = 1;
            tL_message3.media = new TLRPC.TL_messageMediaEmpty();
            tL_message3.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message3.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            MessageObject messageObject5 = new MessageObject(UserConfig.selectedAccount, tL_message3, true, false);
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            if (i11 == 0) {
                tL_message4.message = LocaleController.getString(R.string.FontSizePreviewLine2);
            } else {
                String string = LocaleController.getString(R.string.NewThemePreviewLine3);
                StringBuilder sb2 = new StringBuilder(string);
                int indexOf2 = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf2 != -1 && lastIndexOf != -1) {
                    sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                    sb2.replace(indexOf2, indexOf2 + 1, "");
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = indexOf2;
                    tL_messageEntityTextUrl.length = (lastIndexOf - indexOf2) - 1;
                    tL_messageEntityTextUrl.url = "https://telegram.org";
                    tL_message4.entities.add(tL_messageEntityTextUrl);
                }
                tL_message4.message = sb2.toString();
            }
            int indexOf3 = tL_message4.message.indexOf("😎");
            if (indexOf3 >= 0) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                tL_messageEntityCustomEmoji2.offset = indexOf3;
                tL_messageEntityCustomEmoji2.length = 2;
                tL_messageEntityCustomEmoji2.document_id = 5373141891321699086L;
                tL_message4.entities.add(tL_messageEntityCustomEmoji2);
            }
            tL_message4.date = currentTimeMillis - 2640;
            tL_message4.dialog_id = 1L;
            tL_message4.flags = 259;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message4.from_id = tL_peerUser7;
            tL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tL_message4.id = 1;
            tL_message4.media = new TLRPC.TL_messageMediaEmpty();
            tL_message4.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message4.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            MessageObject messageObject6 = new MessageObject(UserConfig.selectedAccount, tL_message4, true, false);
            messageObject6.resetLayout();
            messageObject6.overrideLinkColor = 5;
            messageObject6.overrideLinkEmoji = 0L;
            messageObject6.eventId = 1L;
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (i11 == 0) {
                tL_message5.message = LocaleController.getString(R.string.FontSizePreviewLine1);
            } else {
                tL_message5.message = LocaleController.getString(R.string.NewThemePreviewLine1);
            }
            tL_message5.date = i13;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = 265;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message5.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            MessageObject messageObject7 = new MessageObject(UserConfig.selectedAccount, tL_message5, true, false);
            if (i11 != 0) {
                messageObject7.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
            }
            messageObject7.eventId = 1L;
            messageObject7.resetLayout();
            messageObject7.replyMessageObject = messageObject5;
            if (i11 == 4) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                String string2 = LocaleController.getString(R.string.GroupThemePreviewSenderName);
                tL_user.first_name = string2;
                messageObject7.customName = string2;
                messageObject7.customAvatarDrawable = new org.telegram.ui.Components.z8(0, tL_user);
            }
            messageObject = messageObject6;
            messageObject2 = messageObject7;
            i10 = 0;
            while (true) {
                t1VarArr = this.e;
                if (i10 < t1VarArr.length) {
                    return;
                }
                int i14 = i11;
                t1VarArr[i10] = new ea(this, context2, i12, b6Var2, context, i14);
                this.e[i10].setDelegate(new n5.e0(this, 7));
                t1 t1Var = this.e[i10];
                t1Var.J7 = i14 == 2 || i14 == 4;
                t1Var.setFullyDraw(true);
                MessageObject messageObject8 = i10 == 0 ? messageObject2 : messageObject;
                if (messageObject8 != null) {
                    this.e[i10].X3(messageObject8, null, false, false, false, false);
                    addView(this.e[i10], g7.e6.n(-1, -2));
                }
                i10++;
                context2 = context;
                b6Var2 = b6Var;
                i11 = i14;
            }
        }
        messageObject2 = null;
        i10 = 0;
        while (true) {
            t1VarArr = this.e;
            if (i10 < t1VarArr.length) {
            }
            i10++;
            context2 = context;
            b6Var2 = b6Var;
            i11 = i14;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z10) {
    }
}
