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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements a6 {
    public final f6 a;
    public final l9 b;
    public final TextView c;
    public xp d;
    public o0 e;

    public n0(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        l9 l9Var = new l9(context);
        this.b = l9Var;
        addView(l9Var, ha.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.e = o0Var;
        l9 l9Var = this.b;
        l9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.c;
        TextView textView = this.c;
        f6 f6Var = this.a;
        if (i7 == 7) {
            xp N = k6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.e = L;
            N.f = L2;
            k6.B1(this.d, k6.w0(k6.Ci, f6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, f6Var), true);
            l9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        xp N2 = k6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.d = N2;
        int i10 = k6.Ci;
        k6.B1(N2, k6.w0(i10, f6Var), false);
        xp xpVar = this.d;
        int i11 = k6.Gi;
        k6.B1(xpVar, k6.w0(i11, f6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (p10.i(p10.s0).f().id == user.id) {
                    xp N3 = k6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.e = L3;
                    N3.f = L4;
                    k6.B1(N3, k6.w0(i10, f6Var), false);
                    k6.B1(N3, k6.w0(i11, f6Var), true);
                    l9Var.setImageDrawable(N3);
                } else {
                    l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                    l9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(t3.Y(chat) ? 10.0f : 16.0f));
                l9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            l9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        o0 o0Var;
        boolean z9 = getBackground() instanceof ShapeDrawable;
        f6 f6Var = this.a;
        if (z9) {
            k6.C1(k6.w0(k6.Qi, f6Var), getBackground());
            invalidate();
        } else {
            setBackground(k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Qi, f6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(k6.w0(k6.G6, f6Var));
        }
        xp xpVar = this.d;
        if (xpVar == null || (o0Var = this.e) == null) {
            return;
        }
        if (o0Var.d == 7) {
            k6.B1(xpVar, k6.w0(k6.Ci, f6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, f6Var), true);
        } else {
            k6.B1(xpVar, k6.w0(k6.Ci, f6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, f6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
