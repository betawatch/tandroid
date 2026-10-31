package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.qi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j5 extends LinearLayout {
    public final org.telegram.ui.Components.g9 a;
    public final ag.j3 b;
    public final TextView c;
    public final org.telegram.ui.Components.r8 d;
    public final org.telegram.ui.ActionBar.p6 e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public j5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = false;
        this.e = p6Var;
        setOrientation(0);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.d = r8Var;
        r8Var.u(org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        addView(g9Var, w7.b6.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ag.j3 j3Var = new ag.j3(context, 4);
        this.b = j3Var;
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        j3Var.setTextSize(1, 15.0f);
        j3Var.setSingleLine(true);
        j3Var.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        j3Var.setEllipsize(truncateAt);
        addView(j3Var, w7.b6.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.b6.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.f5) {
                ((org.telegram.ui.Components.f5) drawable).n(this);
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
            int L = org.telegram.messenger.i0.L(drawable instanceof org.telegram.ui.Components.f5 ? 24.0f : 20.0f);
            int L2 = org.telegram.messenger.i0.L(this.f instanceof org.telegram.ui.Components.f5 ? -2.0f : 0.0f);
            Drawable drawable2 = this.f;
            ag.j3 j3Var = this.b;
            drawable2.setBounds(j3Var.getLeft() + L2, ((j3Var.getBottom() + j3Var.getTop()) - L) / 2, j3Var.getLeft() + L2 + L, ((j3Var.getBottom() + j3Var.getTop()) + L) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof org.telegram.ui.Components.f5) {
                ((org.telegram.ui.Components.f5) drawable3).p(System.currentTimeMillis());
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
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).n(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.i0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        ag.j3 j3Var = this.b;
        org.telegram.ui.Components.g9 g9Var = this.a;
        TextView textView = this.c;
        if (chat == null) {
            j3Var.setText("");
            textView.setText("");
            g9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            g9Var.setImageDrawable(r8Var);
        } else {
            g9Var.e(chat, r8Var);
        }
        j3Var.setText(chat.title);
        String K = org.telegram.messenger.w3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        g9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(qi qiVar) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = qiVar.a;
        if (str == null || !str.startsWith("animated_")) {
            this.f = org.telegram.messenger.k6.g(qiVar.a);
        } else {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    ((org.telegram.ui.Components.f5) drawable).n(this);
                    this.f = null;
                }
                org.telegram.ui.Components.f5 m10 = org.telegram.ui.Components.f5.m(d20.s0, Long.parseLong(qiVar.a.substring(9)), null, 0);
                this.f = m10;
                if (this.n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f = org.telegram.messenger.k6.g(qiVar.a);
            }
        }
        Drawable drawable2 = this.f;
        ag.j3 j3Var = this.b;
        if (drawable2 != null) {
            j3Var.setPadding(org.telegram.messenger.i0.L(22.0f), 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":  ");
            sb2.append(qiVar.b);
            j3Var.setText(sb2);
            return;
        }
        j3Var.setPadding(0, 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(qiVar.a);
        sb3.append(":  ");
        sb3.append(qiVar.b);
        j3Var.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.c;
        ag.j3 j3Var = this.b;
        if (z10) {
            org.telegram.ui.ActionBar.a7.r(j3Var);
            org.telegram.ui.ActionBar.a7.r(textView);
            j3Var.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        org.telegram.ui.ActionBar.a7.V(j3Var, i10, p6Var);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
    }

    public void setText(String str) {
        a();
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        this.b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        ag.j3 j3Var = this.b;
        org.telegram.ui.Components.g9 g9Var = this.a;
        TextView textView = this.c;
        if (user == null) {
            j3Var.setText("");
            textView.setText("");
            g9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            g9Var.setImageDrawable(r8Var);
        } else {
            g9Var.e(user, r8Var);
        }
        j3Var.setText(h20.p(user));
        if (h20.n(user) != null) {
            textView.setText("@" + h20.n(user));
        } else {
            textView.setText("");
        }
        g9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
