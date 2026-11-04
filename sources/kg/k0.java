package kg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout implements z5 {
    public final e6 a;
    public final k9 b;
    public final TextView c;
    public xp d;
    public l0 e;

    public k0(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        k9 k9Var = new k9(context);
        this.b = k9Var;
        addView(k9Var, mf.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, mf.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(l0 l0Var) {
        this.e = l0Var;
        k9 k9Var = this.b;
        k9Var.getImageReceiver().f();
        int i3 = l0Var.d;
        String str = l0Var.c;
        TextView textView = this.c;
        e6 e6Var = this.a;
        if (i3 == 7) {
            xp N = k6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.e = L;
            N.f = L2;
            k6.B1(this.d, k6.w0(k6.Ci, e6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, e6Var), true);
            k9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        xp N2 = k6.N(org.telegram.messenger.g0.L(32.0f), l0Var.a);
        this.d = N2;
        int i10 = k6.Ci;
        k6.B1(N2, k6.w0(i10, e6Var), false);
        xp xpVar = this.d;
        int i11 = k6.Gi;
        k6.B1(xpVar, k6.w0(i11, e6Var), true);
        if (l0Var.d == 4) {
            TLObject tLObject = l0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (h10.i(h10.t0).f().id == user.id) {
                    xp N3 = k6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.e = L3;
                    N3.f = L4;
                    k6.B1(N3, k6.w0(i10, e6Var), false);
                    k6.B1(N3, k6.w0(i11, e6Var), true);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        l0 l0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        e6 e6Var = this.a;
        if (z10) {
            k6.C1(k6.w0(k6.Qi, e6Var), getBackground());
            invalidate();
        } else {
            setBackground(k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Qi, e6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(k6.w0(k6.G6, e6Var));
        }
        xp xpVar = this.d;
        if (xpVar == null || (l0Var = this.e) == null) {
            return;
        }
        if (l0Var.d == 7) {
            k6.B1(xpVar, k6.w0(k6.Ci, e6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, e6Var), true);
        } else {
            k6.B1(xpVar, k6.w0(k6.Ci, e6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, e6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
