package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements c6 {
    public final h6 a;
    public final k9 b;
    public final TextView c;
    public xp d;
    public o0 e;

    public n0(Context context, h6 h6Var) {
        super(context);
        this.a = h6Var;
        k9 k9Var = new k9(context);
        this.b = k9Var;
        addView(k9Var, ha.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.e = o0Var;
        k9 k9Var = this.b;
        k9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.c;
        TextView textView = this.c;
        h6 h6Var = this.a;
        if (i7 == 7) {
            xp N = m6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.e = L;
            N.f = L2;
            m6.B1(this.d, m6.w0(m6.Ci, h6Var), false);
            m6.B1(this.d, m6.w0(m6.Gi, h6Var), true);
            k9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        xp N2 = m6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.d = N2;
        int i10 = m6.Ci;
        m6.B1(N2, m6.w0(i10, h6Var), false);
        xp xpVar = this.d;
        int i11 = m6.Gi;
        m6.B1(xpVar, m6.w0(i11, h6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (p10.i(p10.s0).f().id == user.id) {
                    xp N3 = m6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.e = L3;
                    N3.f = L4;
                    m6.B1(N3, m6.w0(i10, h6Var), false);
                    m6.B1(N3, m6.w0(i11, h6Var), true);
                    k9Var.setImageDrawable(N3);
                } else {
                    k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                    k9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(t3.Y(chat) ? 10.0f : 16.0f));
                k9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            k9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        o0 o0Var;
        boolean z9 = getBackground() instanceof ShapeDrawable;
        h6 h6Var = this.a;
        if (z9) {
            m6.C1(m6.w0(m6.Qi, h6Var), getBackground());
            invalidate();
        } else {
            setBackground(m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(m6.Qi, h6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(m6.w0(m6.G6, h6Var));
        }
        xp xpVar = this.d;
        if (xpVar == null || (o0Var = this.e) == null) {
            return;
        }
        if (o0Var.d == 7) {
            m6.B1(xpVar, m6.w0(m6.Ci, h6Var), false);
            m6.B1(this.d, m6.w0(m6.Gi, h6Var), true);
        } else {
            m6.B1(xpVar, m6.w0(m6.Ci, h6Var), false);
            m6.B1(this.d, m6.w0(m6.Gi, h6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
