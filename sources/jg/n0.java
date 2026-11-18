package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.j10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements c6 {
    public final i6 a;
    public final q9 b;
    public final TextView c;
    public mq d;
    public o0 e;

    public n0(Context context, i6 i6Var) {
        super(context);
        this.a = i6Var;
        q9 q9Var = new q9(context);
        this.b = q9Var;
        addView(q9Var, ma.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, ma.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.e = o0Var;
        q9 q9Var = this.b;
        q9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.c;
        TextView textView = this.c;
        i6 i6Var = this.a;
        if (i7 == 7) {
            mq N = n6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.e = L;
            N.f = L2;
            n6.B1(this.d, n6.w0(n6.Fi, i6Var), false);
            n6.B1(this.d, n6.w0(n6.Ji, i6Var), true);
            q9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        mq N2 = n6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.d = N2;
        int i10 = n6.Fi;
        n6.B1(N2, n6.w0(i10, i6Var), false);
        mq mqVar = this.d;
        int i11 = n6.Ji;
        n6.B1(mqVar, n6.w0(i11, i6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (j10.i(j10.t0).f().id == user.id) {
                    mq N3 = n6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.e = L3;
                    N3.f = L4;
                    n6.B1(N3, n6.w0(i10, i6Var), false);
                    n6.B1(N3, n6.w0(i11, i6Var), true);
                    q9Var.setImageDrawable(N3);
                } else {
                    q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                    q9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(v3.Y(chat) ? 10.0f : 16.0f));
                q9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            q9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        o0 o0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        i6 i6Var = this.a;
        if (z10) {
            n6.C1(n6.w0(n6.Ti, i6Var), getBackground());
            invalidate();
        } else {
            setBackground(n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(n6.Ti, i6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(n6.w0(n6.G6, i6Var));
        }
        mq mqVar = this.d;
        if (mqVar == null || (o0Var = this.e) == null) {
            return;
        }
        if (o0Var.d == 7) {
            n6.B1(mqVar, n6.w0(n6.Fi, i6Var), false);
            n6.B1(this.d, n6.w0(n6.Ji, i6Var), true);
        } else {
            n6.B1(mqVar, n6.w0(n6.Fi, i6Var), false);
            n6.B1(this.d, n6.w0(n6.Ji, i6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
