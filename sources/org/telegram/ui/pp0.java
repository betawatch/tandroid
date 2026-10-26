package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class pp0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.u6 a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.j9 e;
    public final fl f;
    public final org.telegram.ui.ActionBar.b6 h;
    public boolean n;
    public final org.telegram.ui.Components.r5 r;
    public final org.telegram.ui.Components.r5 s;
    public final org.telegram.ui.Components.r5 v;
    public final di.y7 w;
    public final org.telegram.ui.Components.h6 x;
    public MessagesController.PeerColor y;

    public pp0(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        CharSequence userName;
        long botVerificationIcon;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.e = j9Var;
        this.v = new org.telegram.ui.Components.r5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.w = new di.y7(this);
        this.x = new org.telegram.ui.Components.h6(this, 320L, org.telegram.ui.Components.ds.h);
        this.F = new RectF();
        this.b = i10;
        this.a = u6Var;
        long j11 = 0;
        boolean z10 = j10 < 0;
        this.c = z10;
        fl flVar = new fl(this, context, 2);
        this.f = flVar;
        this.r = new org.telegram.ui.Components.r5(AndroidUtilities.dp(17.0f), flVar);
        this.s = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), flVar);
        flVar.setLeftDrawableOutside(true);
        flVar.setRightDrawableOutside(true);
        flVar.setTextColor(-1);
        flVar.setTextSize(20);
        flVar.setTypeface(AndroidUtilities.bold());
        flVar.setWidthWrapContent(true);
        addView(flVar, org.telegram.ui.Components.gb1.h(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.h = b6Var;
        b6Var.setTextSize(14);
        b6Var.setTextColor(-2130706433);
        b6Var.setGravity(1);
        addView(b6Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            userName = chat == null ? "" : chat.title;
            j9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            j9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f.l(userName, false);
        this.r.j(botVerificationIcon, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j11, false);
        this.f.i(this.s);
        if (this.c) {
            long j12 = -j10;
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j12));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j12);
            if (chatFull == null || chatFull.participants_count <= 0) {
                if (chat2 == null || chat2.participants_count <= 0) {
                    boolean isPublic = ChatObject.isPublic(chat2);
                    if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.h.l(LocaleController.getString(isPublic ? R.string.ChannelPublic : R.string.ChannelPrivate).toLowerCase(), false);
                    } else {
                        this.h.l(LocaleController.getString(isPublic ? R.string.MegaPublic : R.string.MegaPrivate).toLowerCase(), false);
                    }
                } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.h.l(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count), false);
                } else {
                    this.h.l(LocaleController.formatPluralStringComma("Members", chat2.participants_count), false);
                }
            } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                this.h.l(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count), false);
            } else {
                this.h.l(LocaleController.formatPluralStringComma("Members", chatFull.participants_count), false);
            }
        } else {
            this.h.l(LocaleController.getString(R.string.Online), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
            if (color != null) {
                int color1 = color.getColor1();
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p8[org.telegram.ui.Components.j9.f(color1)], u6Var);
                w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.q8[org.telegram.ui.Components.j9.f(color1)], u6Var);
            } else {
                long j10 = i10;
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p8[org.telegram.ui.Components.j9.e(j10)], u6Var);
                w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.q8[org.telegram.ui.Components.j9.e(j10)], u6Var);
            }
        } else {
            long j11 = i10;
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p8[org.telegram.ui.Components.j9.e(j11)], u6Var);
            w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.q8[org.telegram.ui.Components.j9.e(j11)], u6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h8));
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.b).profilePeerColors;
        c(peerColors == null ? null : peerColors.getColor(i10), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.y = peerColor;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        fl flVar = this.f;
        org.telegram.ui.Components.r5 r5Var = this.r;
        org.telegram.ui.Components.r5 r5Var2 = this.s;
        org.telegram.ui.ActionBar.b6 b6Var = this.h;
        org.telegram.ui.Components.r5 r5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                r5Var3.k(Integer.valueOf(i10));
            } else {
                r5Var3.k(Integer.valueOf(rp0.x0(peerColor.getBgColor1(a2))));
            }
            r5Var2.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
            r5Var.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
            int f7 = i0.a.f(0.5f, peerColor.getStoryColor1(a2), peerColor.getStoryColor2(a2));
            int i11 = org.telegram.ui.ActionBar.y6.s8;
            if (org.telegram.ui.ActionBar.y6.d1(org.telegram.ui.ActionBar.y6.w0(i11, u6Var))) {
                b6Var.setTextColor(org.telegram.ui.ActionBar.y6.C(a2, org.telegram.ui.ActionBar.y6.w0(i11, u6Var), f7, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, u6Var), f7));
            } else {
                b6Var.setTextColor(f7);
            }
            flVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)) > 0.8f) {
                r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)) < 0.2f) {
                r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var))));
            } else {
                r5Var3.k(Integer.valueOf(rp0.x0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.y6.zh;
            r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)));
            r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)));
            b6Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
            flVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
        }
        this.E = 0;
        this.w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.r5 r5Var = this.v;
        if (j10 == 0) {
            r5Var.g(null, z11);
        } else {
            r5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        MessagesController.PeerColor peerColor2 = this.y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                r5Var.k(Integer.valueOf(i11));
            } else {
                r5Var.k(Integer.valueOf(rp0.x0(peerColor2.getBgColor1(a2))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)) > 0.8f) {
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)) < 0.2f) {
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A8, false))));
            } else {
                r5Var.k(Integer.valueOf(rp0.x0(org.telegram.ui.ActionBar.y6.x0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.y;
        org.telegram.ui.Components.r5 r5Var2 = this.s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, u6Var);
            if (this.y.hasColor6(a2)) {
                peerColor = this.y;
                i10 = 4;
            } else {
                peerColor = this.y;
                i10 = 2;
            }
            r5Var2.k(Integer.valueOf(i0.a.f(0.5f, color, peerColor.getColor(i10, u6Var))));
        } else {
            r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, u6Var)));
        }
        this.E = 1;
        if (!z11) {
            this.x.a(z10);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight() - AndroidUtilities.dp(82.0f);
        RectF rectF = this.F;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + getWidth()) / 2.0f, height);
        bi.l1.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        int dp = AndroidUtilities.dp(this.n ? 18.0f : 54.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(dp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float width = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        float dp2 = AndroidUtilities.dp(this.n ? 22.0f : 58.0f);
        canvas.drawRoundRect(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width, dp2, dp2, this.w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.r5 r5Var = this.s;
        r5Var.j(j10, z11);
        r5Var.m(z10, z11);
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        MessagesController.PeerColor peerColor = this.y;
        if (peerColor != null) {
            r5Var.k(Integer.valueOf(i0.a.f(0.5f, peerColor.getColor2(a2), this.y.hasColor6(a2) ? this.y.getColor5(a2) : this.y.getColor3(a2))));
        } else {
            r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, u6Var)));
        }
        this.E = 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.a();
        this.d.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.b();
        this.d.onDetachedFromWindow();
    }

    public void setForum(boolean z10) {
        if (this.n != z10) {
            invalidate();
        }
        this.n = z10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.Components.r5 r5Var2;
        fl flVar;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.Components.r5 r5Var3 = this.v;
        if (r5Var3 == null || (r5Var = this.s) == null || (r5Var2 = this.r) == null || (flVar = this.f) == null || (b6Var = this.h) == null) {
            return;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        try {
            boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
            MessagesController.PeerColor peerColor = this.y;
            if (peerColor != null) {
                int i10 = peerColor.patternColor;
                if (i10 != 0) {
                    r5Var3.k(Integer.valueOf(i10));
                } else {
                    r5Var3.k(Integer.valueOf(rp0.x0(peerColor.getBgColor1(a2))));
                }
                r5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.y.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
                int i11 = this.E;
                if (i11 == 1) {
                    r5Var.k(Integer.valueOf(i0.a.f(0.5f, this.y.getColor(1, u6Var), this.y.hasColor6(a2) ? this.y.getColor(4, u6Var) : this.y.getColor(2, u6Var))));
                } else if (i11 == 2) {
                    r5Var.k(Integer.valueOf(i0.a.f(0.5f, this.y.getColor2(a2), this.y.hasColor6(a2) ? this.y.getColor5(a2) : this.y.getColor3(a2))));
                } else {
                    r5Var.k(Integer.valueOf(i0.a.f(0.25f, this.y.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1)));
                }
                int f7 = i0.a.f(0.5f, this.y.getStoryColor1(a2), this.y.getStoryColor2(a2));
                int i12 = org.telegram.ui.ActionBar.y6.s8;
                if (org.telegram.ui.ActionBar.y6.d1(org.telegram.ui.ActionBar.y6.w0(i12, u6Var))) {
                    b6Var.setTextColor(org.telegram.ui.ActionBar.y6.C(a2, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), f7, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, u6Var), f7));
                } else {
                    b6Var.setTextColor(f7);
                }
                flVar.setTextColor(-1);
            } else {
                int i13 = org.telegram.ui.ActionBar.y6.s8;
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)) > 0.8f) {
                    r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var)));
                } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i13, u6Var)) < 0.2f) {
                    r5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var))));
                } else {
                    r5Var3.k(Integer.valueOf(rp0.x0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var))));
                }
                int i14 = org.telegram.ui.ActionBar.y6.zh;
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i14, u6Var)));
                r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i14, u6Var)));
                b6Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
                flVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
