package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l5 extends LinearLayout {
    public final org.telegram.ui.Components.y9 a;
    public final md b;
    public final TextView c;
    public final org.telegram.ui.Components.j9 d;
    public final org.telegram.ui.ActionBar.u6 e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public l5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = false;
        this.e = u6Var;
        setOrientation(0);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.d = j9Var;
        j9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(y9Var, kb1.o(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        md mdVar = new md(context, 7);
        this.b = mdVar;
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.G6, u6Var);
        mdVar.setTextSize(1, 15.0f);
        mdVar.setSingleLine(true);
        mdVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mdVar.setEllipsize(truncateAt);
        addView(mdVar, kb1.x(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, kb1.x(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.t5) {
                ((org.telegram.ui.Components.t5) drawable).o(this);
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
            int dp = AndroidUtilities.dp(drawable instanceof org.telegram.ui.Components.t5 ? 24.0f : 20.0f);
            int dp2 = AndroidUtilities.dp(this.f instanceof org.telegram.ui.Components.t5 ? -2.0f : 0.0f);
            Drawable drawable2 = this.f;
            md mdVar = this.b;
            drawable2.setBounds(mdVar.getLeft() + dp2, ((mdVar.getBottom() + mdVar.getTop()) - dp) / 2, mdVar.getLeft() + dp2 + dp, ((mdVar.getBottom() + mdVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof org.telegram.ui.Components.t5) {
                ((org.telegram.ui.Components.t5) drawable3).q(System.currentTimeMillis());
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
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).o(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        md mdVar = this.b;
        org.telegram.ui.Components.y9 y9Var = this.a;
        TextView textView = this.c;
        if (chat == null) {
            mdVar.setText("");
            textView.setText("");
            y9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            y9Var.setImageDrawable(j9Var);
        } else {
            y9Var.f(chat, j9Var);
        }
        mdVar.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        y9Var.setVisibility(0);
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
                if (drawable instanceof org.telegram.ui.Components.t5) {
                    ((org.telegram.ui.Components.t5) drawable).o(this);
                    this.f = null;
                }
                org.telegram.ui.Components.t5 n10 = org.telegram.ui.Components.t5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f = n10;
                if (this.n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        }
        Drawable drawable2 = this.f;
        md mdVar = this.b;
        if (drawable2 != null) {
            mdVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            mdVar.setText(sb2);
            return;
        }
        mdVar.setPadding(0, 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(keywordResult.emoji);
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        mdVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.c;
        md mdVar = this.b;
        if (z10) {
            org.telegram.ui.ActionBar.f7.r(mdVar);
            org.telegram.ui.ActionBar.f7.r(textView);
            mdVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.e;
        org.telegram.ui.ActionBar.f7.V(mdVar, i10, u6Var);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
    }

    public void setText(String str) {
        a();
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        this.b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        md mdVar = this.b;
        org.telegram.ui.Components.y9 y9Var = this.a;
        TextView textView = this.c;
        if (user == null) {
            mdVar.setText("");
            textView.setText("");
            y9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            y9Var.setImageDrawable(j9Var);
        } else {
            y9Var.f(user, j9Var);
        }
        mdVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        y9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
