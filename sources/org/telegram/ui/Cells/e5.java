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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e5 extends LinearLayout {
    public final org.telegram.ui.Components.n9 a;
    public final cg.q b;
    public final TextView c;
    public final org.telegram.ui.Components.y8 d;
    public final org.telegram.ui.ActionBar.c6 e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public e5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = false;
        this.e = c6Var;
        setOrientation(0);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.d = y8Var;
        y8Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(n9Var, h7.z5.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        cg.q qVar = new cg.q(context, 7);
        this.b = qVar;
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        qVar.setTextSize(1, 15.0f);
        qVar.setSingleLine(true);
        qVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        qVar.setEllipsize(truncateAt);
        addView(qVar, h7.z5.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        rl.l(org.telegram.ui.ActionBar.g6.A6, c6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, h7.z5.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.k5) {
                ((org.telegram.ui.Components.k5) drawable).o(this);
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
            int dp = AndroidUtilities.dp(drawable instanceof org.telegram.ui.Components.k5 ? 24.0f : 20.0f);
            int dp2 = AndroidUtilities.dp(this.f instanceof org.telegram.ui.Components.k5 ? -2.0f : 0.0f);
            Drawable drawable2 = this.f;
            cg.q qVar = this.b;
            drawable2.setBounds(qVar.getLeft() + dp2, ((qVar.getBottom() + qVar.getTop()) - dp) / 2, qVar.getLeft() + dp2 + dp, ((qVar.getBottom() + qVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof org.telegram.ui.Components.k5) {
                ((org.telegram.ui.Components.k5) drawable3).q(System.currentTimeMillis());
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
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).o(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        cg.q qVar = this.b;
        org.telegram.ui.Components.n9 n9Var = this.a;
        TextView textView = this.c;
        if (chat == null) {
            qVar.setText("");
            textView.setText("");
            n9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.y8 y8Var = this.d;
        y8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            n9Var.setImageDrawable(y8Var);
        } else {
            n9Var.e(chat, y8Var);
        }
        qVar.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        n9Var.setVisibility(0);
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
                if (drawable instanceof org.telegram.ui.Components.k5) {
                    ((org.telegram.ui.Components.k5) drawable).o(this);
                    this.f = null;
                }
                org.telegram.ui.Components.k5 n10 = org.telegram.ui.Components.k5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f = n10;
                if (this.n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        }
        Drawable drawable2 = this.f;
        cg.q qVar = this.b;
        if (drawable2 != null) {
            qVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            qVar.setText(sb2);
            return;
        }
        qVar.setPadding(0, 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(keywordResult.emoji);
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        qVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.c;
        cg.q qVar = this.b;
        if (z10) {
            qVar.setTextColor(-1);
            textView.setTextColor(-4473925);
        } else {
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.c6 c6Var = this.e;
            qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
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
        cg.q qVar = this.b;
        org.telegram.ui.Components.n9 n9Var = this.a;
        TextView textView = this.c;
        if (user == null) {
            qVar.setText("");
            textView.setText("");
            n9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.y8 y8Var = this.d;
        y8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            n9Var.setImageDrawable(y8Var);
        } else {
            n9Var.e(user, y8Var);
        }
        qVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        n9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
