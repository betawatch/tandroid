package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.ec;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f5 extends LinearLayout {
    public final org.telegram.ui.Components.k9 a;
    public final ec b;
    public final TextView c;
    public final org.telegram.ui.Components.u8 d;
    public final org.telegram.ui.ActionBar.e6 e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public f5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = false;
        this.e = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.d = u8Var;
        u8Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(k9Var, mf.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ec ecVar = new ec(context, 7);
        this.b = ecVar;
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        ecVar.setTextSize(1, 15.0f);
        ecVar.setSingleLine(true);
        ecVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        ecVar.setEllipsize(truncateAt);
        addView(ecVar, mf.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, mf.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.g5) {
                ((org.telegram.ui.Components.g5) drawable).n(this);
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
            int L = org.telegram.messenger.g0.L(drawable instanceof org.telegram.ui.Components.g5 ? 24.0f : 20.0f);
            int L2 = org.telegram.messenger.g0.L(this.f instanceof org.telegram.ui.Components.g5 ? -2.0f : 0.0f);
            Drawable drawable2 = this.f;
            ec ecVar = this.b;
            drawable2.setBounds(ecVar.getLeft() + L2, ((ecVar.getBottom() + ecVar.getTop()) - L) / 2, ecVar.getLeft() + L2 + L, ((ecVar.getBottom() + ecVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof org.telegram.ui.Components.g5) {
                ((org.telegram.ui.Components.g5) drawable3).p(System.currentTimeMillis());
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
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).n(this);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        ec ecVar = this.b;
        org.telegram.ui.Components.k9 k9Var = this.a;
        TextView textView = this.c;
        if (chat == null) {
            ecVar.setText("");
            textView.setText("");
            k9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.u8 u8Var = this.d;
        u8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            k9Var.setImageDrawable(u8Var);
        } else {
            k9Var.e(chat, u8Var);
        }
        ecVar.setText(chat.title);
        String K = org.telegram.messenger.t3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        k9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(hi hiVar) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = hiVar.a;
        if (str == null || !str.startsWith("animated_")) {
            this.f = org.telegram.messenger.i6.g(hiVar.a);
        } else {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable).n(this);
                    this.f = null;
                }
                org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(h10.t0, Long.parseLong(hiVar.a.substring(9)), null, 0);
                this.f = m10;
                if (this.n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f = org.telegram.messenger.i6.g(hiVar.a);
            }
        }
        Drawable drawable2 = this.f;
        ec ecVar = this.b;
        if (drawable2 != null) {
            ecVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":  ");
            sb2.append(hiVar.b);
            ecVar.setText(sb2);
            return;
        }
        ecVar.setPadding(0, 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(hiVar.a);
        sb3.append(":  ");
        sb3.append(hiVar.b);
        ecVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.c;
        ec ecVar = this.b;
        if (z10) {
            org.telegram.ui.ActionBar.r6.r(ecVar);
            org.telegram.ui.ActionBar.r6.r(textView);
            ecVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        org.telegram.ui.ActionBar.r6.V(ecVar, i3, e6Var);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
    }

    public void setText(String str) {
        a();
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        this.b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        ec ecVar = this.b;
        org.telegram.ui.Components.k9 k9Var = this.a;
        TextView textView = this.c;
        if (user == null) {
            ecVar.setText("");
            textView.setText("");
            k9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.u8 u8Var = this.d;
        u8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            k9Var.setImageDrawable(u8Var);
        } else {
            k9Var.e(user, u8Var);
        }
        ecVar.setText(l10.p(user));
        if (l10.n(user) != null) {
            textView.setText("@" + l10.n(user));
        } else {
            textView.setText("");
        }
        k9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
