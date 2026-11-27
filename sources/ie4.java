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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ie4 extends c79 {
    public final /* synthetic */ je4 c;

    public ie4(je4 je4Var) {
        this.c = je4Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 4;
    }

    @Override // j79
    public final int b() {
        return this.c.H;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        je4 je4Var = this.c;
        if (i == je4Var.O || i == je4Var.K) {
            return 2;
        }
        if (i == je4Var.I) {
            return 3;
        }
        if (i < je4Var.M || i >= je4Var.N) {
            return (i == je4Var.L || i == je4Var.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        String str;
        String str2;
        TLRPC.Chat chat;
        je4 je4Var = this.c;
        ArrayList arrayList = je4Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = je4Var.d;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            je4Var.Q = (yd4) view;
            je4Var.k0();
            return;
        }
        if (i2 == 2) {
            ilb ilbVar = (ilb) view;
            if (i != je4Var.O) {
                ilbVar.setFixedSize(12);
                return;
            }
            ilbVar.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                ilbVar.setText(ob6.M0(2131750711, null));
                return;
            } else {
                ilbVar.setText(ob6.M0(2131750712, null));
                return;
            }
        }
        if (i2 == 3) {
            ce4 ce4Var = (ce4) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            TextView textView = ce4Var.n;
            ema emaVar = ce4Var.c;
            ImageView imageView = ce4Var.d;
            xb xbVar = ce4Var.f;
            xb xbVar2 = ce4Var.h;
            ce4Var.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            emaVar.l(str3, false);
            if (ce4Var.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = ce4Var.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ce4Var.x = null;
                }
                float f = str3 != null ? 1.0f : 0.0f;
                ce4Var.w = f;
                be4 be4Var = ce4Var.e;
                be4Var.d = f;
                be4Var.invalidate();
                xbVar.setAlpha(ce4Var.w);
                xbVar2.setAlpha(ce4Var.w);
                imageView.setAlpha(ce4Var.w);
                ce4Var.n.setAlpha(1.0f - ce4Var.w);
                emaVar.setAlpha(ce4Var.w);
                ce4Var.b.setAlpha(1.0f - ce4Var.w);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    xbVar.setVisibility(8);
                    xbVar2.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                xbVar.setVisibility(0);
                xbVar2.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 != 4) {
            if (i2 == 5) {
                nn4 nn4Var = (nn4) view;
                if (nn4Var == je4Var.P) {
                    je4Var.P = null;
                }
                if (i == je4Var.J) {
                    nn4Var.b(ob6.M0(2131748903, null), false);
                    nn4Var.a("", null);
                    return;
                }
                je4Var.P = nn4Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    je4Var.j0(false);
                    return;
                } else {
                    nn4Var.b(ob6.M0(2131750718, null), false);
                    nn4Var.a("", null);
                    return;
                }
            }
            return;
        }
        bd5 bd5Var = (bd5) view;
        Long l = (Long) je4Var.h.get(i - je4Var.M);
        long longValue = l.longValue();
        if (longValue >= 0) {
            TLRPC.User X1 = je4Var.getMessagesController().X1(l);
            str = X1 != null ? lbc.r(X1) : null;
            str2 = null;
            chat = X1;
        } else {
            TLRPC.Chat M0 = je4Var.getMessagesController().M0(Long.valueOf(-longValue));
            if (M0 != null) {
                str = M0.title;
                if (M0.participants_count != 0) {
                    boolean V = xc2.V(M0);
                    int i3 = M0.participants_count;
                    if (V) {
                        str2 = ob6.H(',', "Subscribers", i3);
                        chat = M0;
                    } else {
                        str2 = ob6.H(',', "Members", i3);
                        chat = M0;
                    }
                } else if (xc2.V(M0)) {
                    str2 = ob6.N0("ChannelPublic");
                    chat = M0;
                } else {
                    str2 = ob6.N0("MegaPublic");
                    chat = M0;
                }
            } else {
                str = null;
                str2 = null;
                chat = M0;
            }
        }
        if (arrayList.contains(l)) {
            bd5Var.setForbiddenCheck(false);
            bd5Var.c(je4Var.e.contains(l), false);
        } else {
            bd5Var.setForbiddenCheck(true);
            bd5Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? ob6.M0(2131750736, null) : ob6.M0(2131750704, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = xc2.V(chat) ? ob6.M0(2131750734, null) : ob6.M0(2131750723, null);
            }
        }
        bd5Var.setTag(l);
        bd5Var.d(chat, str, str2);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        je4 je4Var = this.c;
        View view2 = null;
        if (i != 0) {
            if (i == 2) {
                view2 = new ilb(je4Var.getParentActivity());
            } else if (i == 3) {
                View he4Var = new he4(this, je4Var.getParentActivity(), je4Var);
                he4Var.setLayoutParams(new r79(-1, -2));
                yob.h(aob.d6, null, he4Var);
                view2 = he4Var;
            } else if (i == 4) {
                View bd5Var = new bd5(je4Var.getParentActivity(), 1, 0, false);
                yob.h(aob.d6, null, bd5Var);
                view = bd5Var;
            } else if (i == 5) {
                View nn4Var = new nn4(je4Var.getParentActivity());
                yob.h(aob.d6, null, nn4Var);
                view = nn4Var;
            }
            return new n69(view2);
        }
        Activity parentActivity = je4Var.getParentActivity();
        yd4 yd4Var = new yd4(parentActivity);
        e29 e29Var = new e29(parentActivity);
        e29Var.f(R.raw.folder_share, 90, 90, null);
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        e29Var.d();
        e29Var.setImportantForAccessibility(2);
        yd4Var.addView(e29Var, tre.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        tpa tpaVar = new tpa(parentActivity);
        yd4Var.a = tpaVar;
        yob.X(tpaVar, aob.B6, null);
        tpaVar.setTextSize(1, 14.0f);
        tpaVar.setGravity(17);
        tpaVar.setLines(2);
        yd4Var.addView(tpaVar, tre.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = yd4Var;
        view2 = view;
        return new n69(view2);
    }
}
