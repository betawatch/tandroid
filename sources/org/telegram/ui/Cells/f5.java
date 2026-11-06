package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import org.telegram.messenger.p10;
import org.telegram.messenger.qi;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f5 extends LinearLayout {
    public final org.telegram.ui.Components.l9 a;
    public final md b;
    public final TextView c;
    public final org.telegram.ui.Components.w8 d;
    public final org.telegram.ui.ActionBar.f6 e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public f5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = false;
        this.e = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.d = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(l9Var, c8.ha.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        md mdVar = new md(context, 7);
        this.b = mdVar;
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.G6, f6Var);
        mdVar.setTextSize(1, 15.0f);
        mdVar.setSingleLine(true);
        mdVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mdVar.setEllipsize(truncateAt);
        addView(mdVar, c8.ha.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, f6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ha.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.i5) {
                ((org.telegram.ui.Components.i5) drawable).n(this);
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
            int L = org.telegram.messenger.g0.L(drawable instanceof org.telegram.ui.Components.i5 ? 24.0f : 20.0f);
            int L2 = org.telegram.messenger.g0.L(this.f instanceof org.telegram.ui.Components.i5 ? -2.0f : 0.0f);
            Drawable drawable2 = this.f;
            md mdVar = this.b;
            drawable2.setBounds(mdVar.getLeft() + L2, ((mdVar.getBottom() + mdVar.getTop()) - L) / 2, mdVar.getLeft() + L2 + L, ((mdVar.getBottom() + mdVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof org.telegram.ui.Components.i5) {
                ((org.telegram.ui.Components.i5) drawable3).p(System.currentTimeMillis());
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
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).n(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.g0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        md mdVar = this.b;
        org.telegram.ui.Components.l9 l9Var = this.a;
        TextView textView = this.c;
        if (chat == null) {
            mdVar.setText("");
            textView.setText("");
            l9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.w8 w8Var = this.d;
        w8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            l9Var.setImageDrawable(w8Var);
        } else {
            l9Var.e(chat, w8Var);
        }
        mdVar.setText(chat.title);
        String K = org.telegram.messenger.t3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        l9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z9) {
        if (z9 != this.h) {
            this.h = z9;
            setWillNotDraw(!z9);
            invalidate();
        }
    }

    public void setEmojiSuggestion(qi qiVar) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = qiVar.a;
        if (str == null || !str.startsWith("animated_")) {
            this.f = org.telegram.messenger.i6.g(qiVar.a);
        } else {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable).n(this);
                    this.f = null;
                }
                org.telegram.ui.Components.i5 m10 = org.telegram.ui.Components.i5.m(p10.s0, Long.parseLong(qiVar.a.substring(9)), null, 0);
                this.f = m10;
                if (this.n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f = org.telegram.messenger.i6.g(qiVar.a);
            }
        }
        Drawable drawable2 = this.f;
        md mdVar = this.b;
        if (drawable2 != null) {
            mdVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":  ");
            sb2.append(qiVar.b);
            mdVar.setText(sb2);
            return;
        }
        mdVar.setPadding(0, 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(qiVar.a);
        sb3.append(":  ");
        sb3.append(qiVar.b);
        mdVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z9) {
        TextView textView = this.c;
        md mdVar = this.b;
        if (z9) {
            org.telegram.ui.ActionBar.r6.r(mdVar);
            org.telegram.ui.ActionBar.r6.r(textView);
            mdVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        org.telegram.ui.ActionBar.r6.V(mdVar, i7, f6Var);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, f6Var);
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
        org.telegram.ui.Components.l9 l9Var = this.a;
        TextView textView = this.c;
        if (user == null) {
            mdVar.setText("");
            textView.setText("");
            l9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.w8 w8Var = this.d;
        w8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            l9Var.setImageDrawable(w8Var);
        } else {
            l9Var.e(user, w8Var);
        }
        mdVar.setText(t10.p(user));
        if (t10.n(user) != null) {
            textView.setText("@" + t10.n(user));
        } else {
            textView.setText("");
        }
        l9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
