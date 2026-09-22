package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.u9 a;
    public final ai.p4 b;
    public final TextView c;
    public final org.telegram.ui.Components.f9 d;
    public final org.telegram.ui.ActionBar.e6 e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public h5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = false;
        this.e = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        this.d = f9Var;
        f9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(u9Var, w7.x5.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ai.p4 p4Var = new ai.p4(context, 6);
        this.b = p4Var;
        p4Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        p4Var.setTextSize(1, 15.0f);
        p4Var.setSingleLine(true);
        p4Var.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p4Var.setEllipsize(truncateAt);
        addView(p4Var, w7.x5.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        vl.o(org.telegram.ui.ActionBar.i6.A6, e6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.x5.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.o5) {
                ((org.telegram.ui.Components.o5) drawable).o(this);
            }
            this.f = null;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = this.f;
        if (drawable != null) {
            int dp = AndroidUtilities.dp(drawable instanceof org.telegram.ui.Components.o5 ? 24.0f : 20.0f);
            int dp2 = AndroidUtilities.dp(this.f instanceof org.telegram.ui.Components.o5 ? -2.0f : 0.0f);
            Drawable drawable2 = this.f;
            ai.p4 p4Var = this.b;
            drawable2.setBounds(p4Var.getLeft() + dp2, ((p4Var.getBottom() + p4Var.getTop()) - dp) / 2, p4Var.getLeft() + dp2 + dp, ((p4Var.getBottom() + p4Var.getTop()) + dp) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof org.telegram.ui.Components.o5) {
                ((org.telegram.ui.Components.o5) drawable3).q(System.currentTimeMillis());
            }
            this.f.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        Drawable drawable = this.f;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).o(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        ai.p4 p4Var = this.b;
        org.telegram.ui.Components.u9 u9Var = this.a;
        TextView textView = this.c;
        if (chat == null) {
            p4Var.setText("");
            textView.setText("");
            u9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.f9 f9Var = this.d;
        f9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            u9Var.setImageDrawable(f9Var);
        } else {
            u9Var.e(chat, f9Var);
        }
        p4Var.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        u9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(MediaDataController.KeywordResult keywordResult) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str == null || !str.startsWith("animated_")) {
            this.f = Emoji.getEmojiDrawable(keywordResult.emoji);
        } else {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).o(this);
                    this.f = null;
                }
                org.telegram.ui.Components.o5 n10 = org.telegram.ui.Components.o5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f = n10;
                if (this.n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        }
        Drawable drawable2 = this.f;
        ai.p4 p4Var = this.b;
        if (drawable2 != null) {
            p4Var.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            p4Var.setText(sb2);
            return;
        }
        p4Var.setPadding(0, 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(keywordResult.emoji);
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        p4Var.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.c;
        ai.p4 p4Var = this.b;
        if (z10) {
            p4Var.setTextColor(-1);
            textView.setTextColor(-4473925);
        } else {
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.e6 e6Var = this.e;
            p4Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, e6Var));
        }
    }

    public void setText(String str) {
        a();
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        this.b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        ai.p4 p4Var = this.b;
        org.telegram.ui.Components.u9 u9Var = this.a;
        TextView textView = this.c;
        if (user == null) {
            p4Var.setText("");
            textView.setText("");
            u9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.f9 f9Var = this.d;
        f9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            u9Var.setImageDrawable(f9Var);
        } else {
            u9Var.e(user, f9Var);
        }
        p4Var.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        u9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
