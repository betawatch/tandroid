// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class le4 extends q59 {
    public final /* synthetic */ me4 c;

    public le4(me4 me4Var) {
        this.c = me4Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 4;
    }

    @Override // y59
    public final int b() {
        return this.c.H;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        me4 me4Var = this.c;
        if (i == me4Var.O || i == me4Var.K) {
            return 2;
        }
        if (i == me4Var.I) {
            return 3;
        }
        if (i < me4Var.M || i >= me4Var.N) {
            return (i == me4Var.L || i == me4Var.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String str;
        String str2;
        TLRPC.Chat chat;
        me4 me4Var = this.c;
        ArrayList arrayList = me4Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = me4Var.d;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            me4Var.Q = (be4) view;
            me4Var.l0();
            return;
        }
        if (i2 == 2) {
            njb njbVar = (njb) view;
            if (i != me4Var.O) {
                njbVar.setFixedSize(12);
                return;
            }
            njbVar.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                njbVar.setText(jb6.M0(2131750683, null));
                return;
            } else {
                njbVar.setText(jb6.M0(2131750684, null));
                return;
            }
        }
        if (i2 == 3) {
            fe4 fe4Var = (fe4) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            TextView textView = fe4Var.n;
            lka lkaVar = fe4Var.c;
            ImageView imageView = fe4Var.d;
            wb wbVar = fe4Var.f;
            wb wbVar2 = fe4Var.h;
            fe4Var.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            lkaVar.l(str3, false);
            if (fe4Var.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = fe4Var.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    fe4Var.x = null;
                }
                float f = str3 != null ? 1.0f : 0.0f;
                fe4Var.w = f;
                ee4 ee4Var = fe4Var.e;
                ee4Var.d = f;
                ee4Var.invalidate();
                wbVar.setAlpha(fe4Var.w);
                wbVar2.setAlpha(fe4Var.w);
                imageView.setAlpha(fe4Var.w);
                fe4Var.n.setAlpha(1.0f - fe4Var.w);
                lkaVar.setAlpha(fe4Var.w);
                fe4Var.b.setAlpha(1.0f - fe4Var.w);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    wbVar.setVisibility(8);
                    wbVar2.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                wbVar.setVisibility(0);
                wbVar2.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 != 4) {
            if (i2 == 5) {
                in4 in4Var = (in4) view;
                if (in4Var == me4Var.P) {
                    me4Var.P = null;
                }
                if (i == me4Var.J) {
                    in4Var.b(jb6.M0(2131748906, null), false);
                    in4Var.a("", null);
                    return;
                }
                me4Var.P = in4Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    me4Var.k0(false);
                    return;
                } else {
                    in4Var.b(jb6.M0(2131750690, null), false);
                    in4Var.a("", null);
                    return;
                }
            }
            return;
        }
        xc5 xc5Var = (xc5) view;
        Long l = (Long) me4Var.h.get(i - me4Var.M);
        long longValue = l.longValue();
        if (longValue >= 0) {
            TLRPC.User W1 = me4Var.getMessagesController().W1(l);
            str = W1 != null ? m9c.r(W1) : null;
            str2 = null;
            chat = W1;
        } else {
            TLRPC.Chat L0 = me4Var.getMessagesController().L0(Long.valueOf(-longValue));
            if (L0 != null) {
                str = L0.title;
                if (L0.participants_count != 0) {
                    boolean V = sd2.V(L0);
                    int i3 = L0.participants_count;
                    if (V) {
                        str2 = jb6.H(',', "Subscribers", i3);
                        chat = L0;
                    } else {
                        str2 = jb6.H(',', "Members", i3);
                        chat = L0;
                    }
                } else if (sd2.V(L0)) {
                    str2 = jb6.N0("ChannelPublic");
                    chat = L0;
                } else {
                    str2 = jb6.N0("MegaPublic");
                    chat = L0;
                }
            } else {
                str = null;
                str2 = null;
                chat = L0;
            }
        }
        if (arrayList.contains(l)) {
            xc5Var.setForbiddenCheck(false);
            xc5Var.c(me4Var.e.contains(l), false);
        } else {
            xc5Var.setForbiddenCheck(true);
            xc5Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? jb6.M0(2131750708, null) : jb6.M0(2131750676, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = sd2.V(chat) ? jb6.M0(2131750706, null) : jb6.M0(2131750695, null);
            }
        }
        xc5Var.setTag(l);
        xc5Var.d(chat, str, str2);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        me4 me4Var = this.c;
        View view2 = null;
        if (i != 0) {
            if (i == 2) {
                view2 = new njb(me4Var.getParentActivity());
            } else if (i == 3) {
                View ke4Var = new ke4(this, me4Var.getParentActivity(), me4Var);
                ke4Var.setLayoutParams(new g69(-1, -2));
                anb.h(cmb.c6, null, ke4Var);
                view2 = ke4Var;
            } else if (i == 4) {
                View xc5Var = new xc5(me4Var.getParentActivity(), 1, 0, false);
                anb.h(cmb.c6, null, xc5Var);
                view = xc5Var;
            } else if (i == 5) {
                View in4Var = new in4(me4Var.getParentActivity());
                anb.h(cmb.c6, null, in4Var);
                view = in4Var;
            }
            return new b59(view2);
        }
        Activity parentActivity = me4Var.getParentActivity();
        be4 be4Var = new be4(parentActivity);
        s09 s09Var = new s09(parentActivity);
        s09Var.f(R.raw.folder_share, 90, 90, null);
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        s09Var.d();
        s09Var.setImportantForAccessibility(2);
        be4Var.addView(s09Var, qoe.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xna xnaVar = new xna(parentActivity);
        be4Var.a = xnaVar;
        anb.X(xnaVar, cmb.A6, null);
        xnaVar.setTextSize(1, 14.0f);
        xnaVar.setGravity(17);
        xnaVar.setLines(2);
        be4Var.addView(xnaVar, qoe.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = be4Var;
        view2 = view;
        return new b59(view2);
    }
}
