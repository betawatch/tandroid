package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;

/* loaded from: classes4.dex */
public class DialogMeUrlCell extends BaseCell {
    private AvatarDrawable avatarDrawable;
    private ImageReceiver avatarImage;
    private int avatarTop;
    private int currentAccount;
    private boolean drawNameLock;
    private boolean drawVerified;
    private boolean isSelected;
    private StaticLayout messageLayout;
    private int messageLeft;
    private int messageTop;
    private StaticLayout nameLayout;
    private int nameLeft;
    private int nameLockLeft;
    private int nameLockTop;
    private int nameMuteLeft;
    private TLRPC.RecentMeUrl recentMeUrl;
    public boolean useSeparator;

    @Override // org.telegram.ui.Cells.BaseCell, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public DialogMeUrlCell(Context context) {
        super(context);
        this.avatarImage = new ImageReceiver(this);
        this.avatarDrawable = new AvatarDrawable();
        this.messageTop = AndroidUtilities.dp(40.0f);
        this.avatarTop = AndroidUtilities.dp(10.0f);
        this.currentAccount = UserConfig.selectedAccount;
        Theme.createDialogsResources(context);
        this.avatarImage.setRoundRadius(AndroidUtilities.dp(26.0f));
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.recentMeUrl = recentMeUrl;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarImage.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(72.0f) + (this.useSeparator ? 1 : 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            buildLayout();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(3:3|(1:5)(1:108)|6)(2:109|(4:111|(1:113)(1:123)|(3:115|(2:117|(1:119)(1:120))|121)|122)(2:124|(3:126|(1:128)(1:130)|129)(2:131|(6:133|(1:135)(1:144)|136|(1:138)(1:143)|139|(1:141)(1:142))(2:145|(3:147|(1:149)(1:151)|150)(1:152)))))|7|(1:9)|10|(1:12)(1:107)|13|14|(1:16)|17|(2:19|(1:21))|22|(3:23|24|25)|(2:26|27)|28|(3:30|(1:32)(1:95)|33)(3:96|(1:98)(1:100)|99)|34|35|36|37|(4:39|(4:43|(1:45)|46|(2:48|(1:50)))|51|(1:63)(2:57|(2:59|60)(1:62)))(4:66|(4:70|(2:72|(1:74))|75|(1:77))|78|(1:89)(2:84|(2:86|87)(1:88)))) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0338, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0339, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildLayout() {
        String str;
        int measuredWidth;
        int dp;
        int i;
        int measuredWidth2;
        StaticLayout staticLayout;
        TextPaint textPaint = Theme.dialogs_namePaint[0];
        TextPaint textPaint2 = Theme.dialogs_messagePaint[0];
        this.drawNameLock = false;
        this.drawVerified = false;
        TLRPC.RecentMeUrl recentMeUrl = this.recentMeUrl;
        if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChat) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.recentMeUrl.chat_id));
            this.drawVerified = chat.verified;
            if (!LocaleController.isRTL) {
                this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.nameLockLeft = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            str = chat.title;
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            this.avatarImage.setForUserOrChat(chat, this.avatarDrawable, this.recentMeUrl);
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUser) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.recentMeUrl.user_id));
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            if (user != null) {
                if (user.bot) {
                    this.nameLockTop = AndroidUtilities.dp(16.5f);
                    if (!LocaleController.isRTL) {
                        this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                        this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                    } else {
                        this.nameLockLeft = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                        this.nameLeft = AndroidUtilities.dp(14.0f);
                    }
                }
                this.drawVerified = user.verified;
            }
            str = UserObject.getUserName(user);
            this.avatarDrawable.setInfo(this.currentAccount, user);
            this.avatarImage.setForUserOrChat(user, this.avatarDrawable, this.recentMeUrl);
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlStickerSet) {
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            str = this.recentMeUrl.set.set.title;
            this.avatarDrawable.setInfo(5L, str, null);
            this.avatarImage.setImage(ImageLocation.getForDocument(this.recentMeUrl.set.cover), null, this.avatarDrawable, null, this.recentMeUrl, 0);
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChatInvite) {
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            TLRPC.ChatInvite chatInvite = this.recentMeUrl.chat_invite;
            TLRPC.Chat chat2 = chatInvite.chat;
            if (chat2 != null) {
                this.avatarDrawable.setInfo(this.currentAccount, chat2);
                TLRPC.RecentMeUrl recentMeUrl2 = this.recentMeUrl;
                TLRPC.Chat chat3 = recentMeUrl2.chat_invite.chat;
                String str2 = chat3.title;
                this.drawVerified = chat3.verified;
                this.avatarImage.setForUserOrChat(chat3, this.avatarDrawable, recentMeUrl2);
                str = str2;
            } else {
                String str3 = chatInvite.title;
                this.avatarDrawable.setInfo(5L, str3, null);
                this.avatarImage.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(this.recentMeUrl.chat_invite.photo.sizes, 50), this.recentMeUrl.chat_invite.photo), "50_50", this.avatarDrawable, null, this.recentMeUrl, 0);
                str = str3;
            }
            if (!LocaleController.isRTL) {
                this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.nameLockLeft = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUnknown) {
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.recentMeUrl, 0);
            str = "Url";
        } else {
            this.avatarImage.setImage(null, null, this.avatarDrawable, null, recentMeUrl, 0);
            str = "";
        }
        String str4 = MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + this.recentMeUrl.url;
        if (TextUtils.isEmpty(str)) {
            str = LocaleController.getString(R.string.HiddenName);
        }
        if (!LocaleController.isRTL) {
            measuredWidth = getMeasuredWidth() - this.nameLeft;
            dp = AndroidUtilities.dp(14.0f);
        } else {
            measuredWidth = getMeasuredWidth() - this.nameLeft;
            dp = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        }
        int i2 = measuredWidth - dp;
        if (this.drawNameLock) {
            i2 -= AndroidUtilities.dp(4.0f) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
        }
        if (this.drawVerified) {
            int dp2 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            i2 -= dp2;
            if (LocaleController.isRTL) {
                this.nameLeft += dp2;
            }
        }
        int max = Math.max(AndroidUtilities.dp(12.0f), i2);
        try {
            staticLayout = new StaticLayout(TextUtils.ellipsize(str.replace('\n', ' '), textPaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i = max;
        } catch (Exception e) {
            e = e;
            i = max;
        }
        try {
            this.nameLayout = staticLayout;
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 16);
            if (LocaleController.isRTL) {
            }
            this.avatarImage.setImageCoords(measuredWidth2, this.avatarTop, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(52.0f));
            int max2 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth3);
            this.messageLayout = new StaticLayout(TextUtils.ellipsize(str4, textPaint2, max2 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint2, max2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
            }
        }
        int measuredWidth32 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 16);
        if (LocaleController.isRTL) {
            this.messageLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            measuredWidth2 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 13.0f : 9.0f);
        } else {
            this.messageLeft = AndroidUtilities.dp(16.0f);
            measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.isTablet() ? 65.0f : 61.0f);
        }
        this.avatarImage.setImageCoords(measuredWidth2, this.avatarTop, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(52.0f));
        int max22 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth32);
        this.messageLayout = new StaticLayout(TextUtils.ellipsize(str4, textPaint2, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint2, max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        if (!LocaleController.isRTL) {
            StaticLayout staticLayout2 = this.nameLayout;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                float lineLeft = this.nameLayout.getLineLeft(0);
                double ceil = Math.ceil(this.nameLayout.getLineWidth(0));
                if (this.drawVerified) {
                    this.nameMuteLeft = (int) (((this.nameLeft + (i - ceil)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth());
                }
                if (lineLeft == 0.0f) {
                    double d = i;
                    if (ceil < d) {
                        this.nameLeft = (int) (this.nameLeft + (d - ceil));
                    }
                }
            }
            StaticLayout staticLayout3 = this.messageLayout;
            if (staticLayout3 == null || staticLayout3.getLineCount() <= 0 || this.messageLayout.getLineLeft(0) != 0.0f) {
                return;
            }
            double ceil2 = Math.ceil(this.messageLayout.getLineWidth(0));
            double d2 = max22;
            if (ceil2 < d2) {
                this.messageLeft = (int) (this.messageLeft + (d2 - ceil2));
                return;
            }
            return;
        }
        StaticLayout staticLayout4 = this.nameLayout;
        if (staticLayout4 != null && staticLayout4.getLineCount() > 0) {
            float lineRight = this.nameLayout.getLineRight(0);
            if (lineRight == i) {
                double ceil3 = Math.ceil(this.nameLayout.getLineWidth(0));
                double d3 = i;
                if (ceil3 < d3) {
                    this.nameLeft = (int) (this.nameLeft - (d3 - ceil3));
                }
            }
            if (this.drawVerified) {
                this.nameMuteLeft = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
            }
        }
        StaticLayout staticLayout5 = this.messageLayout;
        if (staticLayout5 == null || staticLayout5.getLineCount() <= 0 || this.messageLayout.getLineRight(0) != max22) {
            return;
        }
        double ceil4 = Math.ceil(this.messageLayout.getLineWidth(0));
        double d4 = max22;
        if (ceil4 < d4) {
            this.messageLeft = (int) (this.messageLeft - (d4 - ceil4));
        }
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z) {
            invalidate();
        }
        this.isSelected = z;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.isSelected) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_tabletSeletedPaint);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        if (this.drawNameLock) {
            BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, this.nameLockLeft, this.nameLockTop);
            Theme.dialogs_lockDrawable.draw(canvas2);
        }
        if (this.nameLayout != null) {
            canvas2.save();
            canvas2.translate(this.nameLeft, AndroidUtilities.dp(13.0f));
            this.nameLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.messageLayout != null) {
            canvas2.save();
            canvas2.translate(this.messageLeft, this.messageTop);
            try {
                this.messageLayout.draw(canvas2);
            } catch (Exception e) {
                FileLog.e(e);
            }
            canvas2.restore();
        }
        if (this.drawVerified) {
            BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft, AndroidUtilities.dp(16.5f));
            BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft, AndroidUtilities.dp(16.5f));
            Theme.dialogs_verifiedDrawable.draw(canvas2);
            Theme.dialogs_verifiedCheckDrawable.draw(canvas2);
        }
        if (this.useSeparator) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas2.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
        this.avatarImage.draw(canvas2);
    }
}
