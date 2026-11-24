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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lc4 extends n39 {
    public final /* synthetic */ mc4 c;

    public lc4(mc4 mc4Var) {
        this.c = mc4Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 4;
    }

    @Override // w39
    public final int b() {
        return this.c.H;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        mc4 mc4Var = this.c;
        if (i == mc4Var.O || i == mc4Var.K) {
            return 2;
        }
        if (i == mc4Var.I) {
            return 3;
        }
        if (i < mc4Var.M || i >= mc4Var.N) {
            return (i == mc4Var.L || i == mc4Var.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String str;
        String str2;
        TLRPC.Chat chat;
        mc4 mc4Var = this.c;
        ArrayList arrayList = mc4Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = mc4Var.d;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            mc4Var.Q = (bc4) view;
            mc4Var.k0();
            return;
        }
        if (i2 == 2) {
            mhb mhbVar = (mhb) view;
            if (i != mc4Var.O) {
                mhbVar.setFixedSize(12);
                return;
            }
            mhbVar.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                mhbVar.setText(k96.M0(2131750734, null));
                return;
            } else {
                mhbVar.setText(k96.M0(2131750735, null));
                return;
            }
        }
        if (i2 == 3) {
            fc4 fc4Var = (fc4) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            TextView textView = fc4Var.n;
            jia jiaVar = fc4Var.c;
            ImageView imageView = fc4Var.d;
            wb wbVar = fc4Var.f;
            wb wbVar2 = fc4Var.h;
            fc4Var.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            jiaVar.l(str3, false);
            if (fc4Var.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = fc4Var.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    fc4Var.x = null;
                }
                float f = str3 != null ? 1.0f : 0.0f;
                fc4Var.w = f;
                ec4 ec4Var = fc4Var.e;
                ec4Var.d = f;
                ec4Var.invalidate();
                wbVar.setAlpha(fc4Var.w);
                wbVar2.setAlpha(fc4Var.w);
                imageView.setAlpha(fc4Var.w);
                fc4Var.n.setAlpha(1.0f - fc4Var.w);
                jiaVar.setAlpha(fc4Var.w);
                fc4Var.b.setAlpha(1.0f - fc4Var.w);
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
                il4 il4Var = (il4) view;
                if (il4Var == mc4Var.P) {
                    mc4Var.P = null;
                }
                if (i == mc4Var.J) {
                    il4Var.b(k96.M0(2131748957, null), false);
                    il4Var.a("", null);
                    return;
                }
                mc4Var.P = il4Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    mc4Var.j0(false);
                    return;
                } else {
                    il4Var.b(k96.M0(2131750741, null), false);
                    il4Var.a("", null);
                    return;
                }
            }
            return;
        }
        za5 za5Var = (za5) view;
        Long l = (Long) mc4Var.h.get(i - mc4Var.M);
        long longValue = l.longValue();
        if (longValue >= 0) {
            TLRPC.User V1 = mc4Var.getMessagesController().V1(l);
            str = V1 != null ? l7c.r(V1) : null;
            str2 = null;
            chat = V1;
        } else {
            TLRPC.Chat K0 = mc4Var.getMessagesController().K0(Long.valueOf(-longValue));
            if (K0 != null) {
                str = K0.title;
                if (K0.participants_count != 0) {
                    boolean V = hc2.V(K0);
                    int i3 = K0.participants_count;
                    if (V) {
                        str2 = k96.H(',', "Subscribers", i3);
                        chat = K0;
                    } else {
                        str2 = k96.H(',', "Members", i3);
                        chat = K0;
                    }
                } else if (hc2.V(K0)) {
                    str2 = k96.N0("ChannelPublic");
                    chat = K0;
                } else {
                    str2 = k96.N0("MegaPublic");
                    chat = K0;
                }
            } else {
                str = null;
                str2 = null;
                chat = K0;
            }
        }
        if (arrayList.contains(l)) {
            za5Var.setForbiddenCheck(false);
            za5Var.c(mc4Var.e.contains(l), false);
        } else {
            za5Var.setForbiddenCheck(true);
            za5Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? k96.M0(2131750759, null) : k96.M0(2131750727, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = hc2.V(chat) ? k96.M0(2131750757, null) : k96.M0(2131750746, null);
            }
        }
        za5Var.setTag(l);
        za5Var.d(chat, str, str2);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        mc4 mc4Var = this.c;
        View view2 = null;
        if (i != 0) {
            if (i == 2) {
                view2 = new mhb(mc4Var.getParentActivity());
            } else if (i == 3) {
                View kc4Var = new kc4(this, mc4Var.getParentActivity(), mc4Var);
                kc4Var.setLayoutParams(new e49(-1, -2));
                zkb.h(bkb.c6, null, kc4Var);
                view2 = kc4Var;
            } else if (i == 4) {
                View za5Var = new za5(mc4Var.getParentActivity(), 1, 0, false);
                zkb.h(bkb.c6, null, za5Var);
                view = za5Var;
            } else if (i == 5) {
                View il4Var = new il4(mc4Var.getParentActivity());
                zkb.h(bkb.c6, null, il4Var);
                view = il4Var;
            }
            return new y29(view2);
        }
        Activity parentActivity = mc4Var.getParentActivity();
        bc4 bc4Var = new bc4(parentActivity);
        ry8 ry8Var = new ry8(parentActivity);
        ry8Var.f(R.raw.folder_share, 90, 90, null);
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var.d();
        ry8Var.setImportantForAccessibility(2);
        bc4Var.addView(ry8Var, nme.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        wla wlaVar = new wla(parentActivity);
        bc4Var.a = wlaVar;
        zkb.X(wlaVar, bkb.A6, null);
        wlaVar.setTextSize(1, 14.0f);
        wlaVar.setGravity(17);
        wlaVar.setLines(2);
        bc4Var.addView(wlaVar, nme.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = bc4Var;
        view2 = view;
        return new y29(view2);
    }
}
