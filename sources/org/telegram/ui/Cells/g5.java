package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.xb;
import org.telegram.messenger.j10;
import org.telegram.messenger.ni;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g5 extends LinearLayout {
    public final org.telegram.ui.Components.q9 a;
    public final xb b;
    public final TextView c;
    public final org.telegram.ui.Components.b9 d;
    public final org.telegram.ui.ActionBar.i6 e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public g5(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = false;
        this.e = i6Var;
        setOrientation(0);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.d = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(q9Var, c8.ma.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        xb xbVar = new xb(context, 7);
        this.b = xbVar;
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        xbVar.setTextSize(1, 15.0f);
        xbVar.setSingleLine(true);
        xbVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xbVar.setEllipsize(truncateAt);
        addView(xbVar, c8.ma.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ma.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.o5) {
                ((org.telegram.ui.Components.o5) drawable).n(this);
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
            int L = org.telegram.messenger.g0.L(drawable instanceof org.telegram.ui.Components.o5 ? 24.0f : 20.0f);
            int L2 = org.telegram.messenger.g0.L(this.f instanceof org.telegram.ui.Components.o5 ? -2.0f : 0.0f);
            Drawable drawable2 = this.f;
            xb xbVar = this.b;
            drawable2.setBounds(xbVar.getLeft() + L2, ((xbVar.getBottom() + xbVar.getTop()) - L) / 2, xbVar.getLeft() + L2 + L, ((xbVar.getBottom() + xbVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof org.telegram.ui.Components.o5) {
                ((org.telegram.ui.Components.o5) drawable3).p(System.currentTimeMillis());
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
            ((org.telegram.ui.Components.o5) drawable).n(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.g0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        xb xbVar = this.b;
        org.telegram.ui.Components.q9 q9Var = this.a;
        TextView textView = this.c;
        if (chat == null) {
            xbVar.setText("");
            textView.setText("");
            q9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            q9Var.setImageDrawable(b9Var);
        } else {
            q9Var.f(chat, b9Var);
        }
        xbVar.setText(chat.title);
        String K = org.telegram.messenger.v3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        q9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(ni niVar) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = niVar.a;
        if (str == null || !str.startsWith("animated_")) {
            this.f = org.telegram.messenger.j6.g(niVar.a);
        } else {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).n(this);
                    this.f = null;
                }
                org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(j10.t0, Long.parseLong(niVar.a.substring(9)), null, 0);
                this.f = m10;
                if (this.n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f = org.telegram.messenger.j6.g(niVar.a);
            }
        }
        Drawable drawable2 = this.f;
        xb xbVar = this.b;
        if (drawable2 != null) {
            xbVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":  ");
            sb2.append(niVar.b);
            xbVar.setText(sb2);
            return;
        }
        xbVar.setPadding(0, 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(niVar.a);
        sb3.append(":  ");
        sb3.append(niVar.b);
        xbVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.c;
        xb xbVar = this.b;
        if (z10) {
            org.telegram.ui.ActionBar.u6.q(xbVar);
            org.telegram.ui.ActionBar.u6.q(textView);
            xbVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.e;
        org.telegram.ui.ActionBar.u6.U(xbVar, i7, i6Var);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
    }

    public void setText(String str) {
        a();
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        this.b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        xb xbVar = this.b;
        org.telegram.ui.Components.q9 q9Var = this.a;
        TextView textView = this.c;
        if (user == null) {
            xbVar.setText("");
            textView.setText("");
            q9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            q9Var.setImageDrawable(b9Var);
        } else {
            q9Var.f(user, b9Var);
        }
        xbVar.setText(o10.q(user));
        if (o10.o(user) != null) {
            textView.setText("@" + o10.o(user));
        } else {
            textView.setText("");
        }
        q9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
