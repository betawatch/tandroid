package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements z5 {
    public final e6 a;
    public final i9 b;
    public final TextView c;
    public fq d;
    public o0 e;

    public n0(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        i9 i9Var = new i9(context);
        this.b = i9Var;
        addView(i9Var, ja.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, ja.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.e = o0Var;
        i9 i9Var = this.b;
        i9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.c;
        TextView textView = this.c;
        e6 e6Var = this.a;
        if (i7 == 7) {
            fq N = j6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.e = L;
            N.f = L2;
            j6.B1(this.d, j6.w0(j6.Fi, e6Var), false);
            j6.B1(this.d, j6.w0(j6.Ji, e6Var), true);
            i9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        fq N2 = j6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.d = N2;
        int i10 = j6.Fi;
        j6.B1(N2, j6.w0(i10, e6Var), false);
        fq fqVar = this.d;
        int i11 = j6.Ji;
        j6.B1(fqVar, j6.w0(i11, e6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (m10.i(m10.t0).f().id == user.id) {
                    fq N3 = j6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.e = L3;
                    N3.f = L4;
                    j6.B1(N3, j6.w0(i10, e6Var), false);
                    j6.B1(N3, j6.w0(i11, e6Var), true);
                    i9Var.setImageDrawable(N3);
                } else {
                    i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                    i9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(t3.Y(chat) ? 10.0f : 16.0f));
                i9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            i9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        o0 o0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        e6 e6Var = this.a;
        if (z10) {
            j6.C1(j6.w0(j6.Ti, e6Var), getBackground());
            invalidate();
        } else {
            setBackground(j6.d0(org.telegram.messenger.g0.L(28.0f), j6.w0(j6.Ti, e6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(j6.w0(j6.G6, e6Var));
        }
        fq fqVar = this.d;
        if (fqVar == null || (o0Var = this.e) == null) {
            return;
        }
        if (o0Var.d == 7) {
            j6.B1(fqVar, j6.w0(j6.Fi, e6Var), false);
            j6.B1(this.d, j6.w0(j6.Ji, e6Var), true);
        } else {
            j6.B1(fqVar, j6.w0(j6.Fi, e6Var), false);
            j6.B1(this.d, j6.w0(j6.Ji, e6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
