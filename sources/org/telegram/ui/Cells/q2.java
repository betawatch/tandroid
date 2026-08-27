package org.telegram.ui.Cells;

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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q2 extends a0 {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public TLRPC.RecentMeUrl f;
    public ImageReceiver h;
    public org.telegram.ui.Components.y8 n;
    public int r;
    public StaticLayout s;
    public int v;
    public int w;
    public int x;
    public StaticLayout y;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.C) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.u0);
        } else {
            canvas2 = canvas;
        }
        if (this.s != null) {
            canvas2.save();
            canvas2.translate(this.r, AndroidUtilities.dp(13.0f));
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (this.y != null) {
            canvas2.save();
            canvas2.translate(this.x, this.w);
            try {
                this.y.draw(canvas2);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            canvas2.restore();
        }
        if (this.A) {
            a0.p(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.g6.f1);
            a0.p(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.g6.i1);
            org.telegram.ui.ActionBar.g6.f1.draw(canvas2);
            org.telegram.ui.ActionBar.g6.i1.draw(canvas2);
        }
        this.h.draw(canvas2);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0359  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        String str;
        int measuredWidth;
        int dp;
        int i14;
        TextPaint textPaint;
        int measuredWidth2;
        int max;
        int i15;
        CharSequence ellipsize;
        if (z10) {
            int i16 = this.D;
            ImageReceiver imageReceiver = this.h;
            org.telegram.ui.Components.y8 y8Var = this.n;
            TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.B0[0];
            TextPaint textPaint3 = org.telegram.ui.ActionBar.g6.F0[0];
            this.A = false;
            TLRPC.RecentMeUrl recentMeUrl = this.f;
            if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChat) {
                TLRPC.Chat chat = MessagesController.getInstance(i16).getChat(Long.valueOf(this.f.chat_id));
                this.A = chat.verified;
                if (LocaleController.isRTL) {
                    getMeasuredWidth();
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.r = AndroidUtilities.dp(14.0f);
                } else {
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.r = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                }
                str = chat.title;
                y8Var.k(i16, chat);
                imageReceiver.setForUserOrChat(chat, y8Var, this.f);
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUser) {
                TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(this.f.user_id));
                if (LocaleController.isRTL) {
                    this.r = AndroidUtilities.dp(14.0f);
                } else {
                    this.r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                if (user != null) {
                    if (user.bot) {
                        AndroidUtilities.dp(16.5f);
                        if (LocaleController.isRTL) {
                            getMeasuredWidth();
                            AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                            this.r = AndroidUtilities.dp(14.0f);
                        } else {
                            AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                            this.r = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                        }
                    }
                    this.A = user.verified;
                }
                str = UserObject.getUserName(user);
                y8Var.m(i16, user);
                imageReceiver.setForUserOrChat(user, y8Var, this.f);
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlStickerSet) {
                if (LocaleController.isRTL) {
                    this.r = AndroidUtilities.dp(14.0f);
                } else {
                    this.r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                String str2 = this.f.set.set.title;
                y8Var.n(5L, str2, null);
                imageReceiver.setImage(ImageLocation.getForDocument(this.f.set.cover), null, y8Var, null, this.f, 0);
                str = str2;
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChatInvite) {
                if (LocaleController.isRTL) {
                    this.r = AndroidUtilities.dp(14.0f);
                } else {
                    this.r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                TLRPC.ChatInvite chatInvite = this.f.chat_invite;
                TLRPC.Chat chat2 = chatInvite.chat;
                if (chat2 != null) {
                    y8Var.k(i16, chat2);
                    TLRPC.RecentMeUrl recentMeUrl2 = this.f;
                    TLRPC.Chat chat3 = recentMeUrl2.chat_invite.chat;
                    String str3 = chat3.title;
                    this.A = chat3.verified;
                    imageReceiver.setForUserOrChat(chat3, y8Var, recentMeUrl2);
                    str = str3;
                } else {
                    String str4 = chatInvite.title;
                    y8Var.n(5L, str4, null);
                    imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(this.f.chat_invite.photo.sizes, 50), this.f.chat_invite.photo), "50_50", y8Var, null, this.f, 0);
                    str = str4;
                }
                if (LocaleController.isRTL) {
                    getMeasuredWidth();
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.r = AndroidUtilities.dp(14.0f);
                } else {
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.r = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                }
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUnknown) {
                if (LocaleController.isRTL) {
                    this.r = AndroidUtilities.dp(14.0f);
                } else {
                    this.r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                imageReceiver.setImage(null, null, y8Var, null, this.f, 0);
                str = "Url";
            } else {
                imageReceiver.setImage(null, null, y8Var, null, recentMeUrl, 0);
                str = "";
            }
            String str5 = MessagesController.getInstance(i16).linkPrefix + "/" + this.f.url;
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.HiddenName);
            }
            if (LocaleController.isRTL) {
                measuredWidth = getMeasuredWidth() - this.r;
                dp = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                measuredWidth = getMeasuredWidth() - this.r;
                dp = AndroidUtilities.dp(14.0f);
            }
            int i17 = measuredWidth - dp;
            if (this.A) {
                int intrinsicWidth = org.telegram.ui.ActionBar.g6.f1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                i17 -= intrinsicWidth;
                if (LocaleController.isRTL) {
                    this.r += intrinsicWidth;
                }
            }
            int max2 = Math.max(AndroidUtilities.dp(12.0f), i17);
            try {
                ellipsize = TextUtils.ellipsize(str.replace('\n', ' '), textPaint2, max2 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                textPaint = textPaint3;
                try {
                    i14 = max2;
                } catch (Exception e9) {
                    e = e9;
                    i14 = max2;
                }
            } catch (Exception e10) {
                e = e10;
                i14 = max2;
                textPaint = textPaint3;
            }
            try {
                this.s = new StaticLayout(ellipsize, textPaint2, max2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } catch (Exception e11) {
                e = e11;
                FileLog.e(e);
                int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 16);
                if (LocaleController.isRTL) {
                }
                imageReceiver.setImageCoords(measuredWidth2, this.B, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(52.0f));
                max = Math.max(AndroidUtilities.dp(12.0f), measuredWidth3);
                i15 = max;
                this.y = new StaticLayout(TextUtils.ellipsize(str5, textPaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (LocaleController.isRTL) {
                }
            }
            int measuredWidth32 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 16);
            if (LocaleController.isRTL) {
                this.x = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                measuredWidth2 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 13.0f : 9.0f);
            } else {
                this.x = AndroidUtilities.dp(16.0f);
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.isTablet() ? 65.0f : 61.0f);
            }
            imageReceiver.setImageCoords(measuredWidth2, this.B, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(52.0f));
            max = Math.max(AndroidUtilities.dp(12.0f), measuredWidth32);
            try {
                i15 = max;
            } catch (Exception e12) {
                e = e12;
                i15 = max;
            }
            try {
                this.y = new StaticLayout(TextUtils.ellipsize(str5, textPaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } catch (Exception e13) {
                e = e13;
                FileLog.e(e);
                if (LocaleController.isRTL) {
                }
            }
            if (LocaleController.isRTL) {
                StaticLayout staticLayout = this.s;
                if (staticLayout != null && staticLayout.getLineCount() > 0) {
                    float lineLeft = this.s.getLineLeft(0);
                    double ceil = Math.ceil(this.s.getLineWidth(0));
                    if (this.A) {
                        this.v = (int) ((((i14 - ceil) + this.r) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.g6.f1.getIntrinsicWidth());
                    }
                    if (lineLeft == 0.0f) {
                        double d = i14;
                        if (ceil < d) {
                            this.r = (int) ((d - ceil) + this.r);
                        }
                    }
                }
                StaticLayout staticLayout2 = this.y;
                if (staticLayout2 == null || staticLayout2.getLineCount() <= 0 || this.y.getLineLeft(0) != 0.0f) {
                    return;
                }
                double ceil2 = Math.ceil(this.y.getLineWidth(0));
                double d10 = i15;
                if (ceil2 < d10) {
                    this.x = (int) ((d10 - ceil2) + this.x);
                    return;
                }
                return;
            }
            StaticLayout staticLayout3 = this.s;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                float lineRight = this.s.getLineRight(0);
                if (lineRight == i14) {
                    double ceil3 = Math.ceil(this.s.getLineWidth(0));
                    double d11 = i14;
                    if (ceil3 < d11) {
                        this.r = (int) (this.r - (d11 - ceil3));
                    }
                }
                if (this.A) {
                    this.v = (int) (this.r + lineRight + AndroidUtilities.dp(6.0f));
                }
            }
            StaticLayout staticLayout4 = this.y;
            if (staticLayout4 == null || staticLayout4.getLineCount() <= 0 || this.y.getLineRight(0) != i15) {
                return;
            }
            double ceil4 = Math.ceil(this.y.getLineWidth(0));
            double d12 = i15;
            if (ceil4 < d12) {
                this.x = (int) (this.x - (d12 - ceil4));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(72.0f));
    }

    public void setDialogSelected(boolean z10) {
        if (this.C != z10) {
            invalidate();
        }
        this.C = z10;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f = recentMeUrl;
        requestLayout();
    }
}
