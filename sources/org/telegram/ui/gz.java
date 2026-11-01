package org.telegram.ui;

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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gz extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ hz c;

    public gz(hz hzVar) {
        this.c = hzVar;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 4;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.G;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        hz hzVar = this.c;
        if (i10 == hzVar.N || i10 == hzVar.J) {
            return 2;
        }
        if (i10 == hzVar.H) {
            return 3;
        }
        if (i10 < hzVar.L || i10 >= hzVar.M) {
            return (i10 == hzVar.K || i10 == hzVar.I) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        hz hzVar = this.c;
        ArrayList arrayList = hzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hzVar.d;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            hzVar.P = (wy) view;
            hzVar.l0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 != hzVar.N) {
                b9Var.setFixedSize(12);
                return;
            }
            b9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                b9Var.setText(org.telegram.messenger.dd.L0(2131750747, null));
                return;
            } else {
                b9Var.setText(org.telegram.messenger.dd.L0(2131750748, null));
                return;
            }
        }
        if (i11 == 3) {
            az azVar = (az) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            ag.j3 j3Var = azVar.h;
            org.telegram.ui.ActionBar.u5 u5Var = azVar.c;
            TextView textView = azVar.n;
            ImageView imageView = azVar.d;
            ag.j3 j3Var2 = azVar.f;
            azVar.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            u5Var.l(str3, false);
            if (azVar.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = azVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    azVar.x = null;
                }
                float f7 = str3 != null ? 1.0f : 0.0f;
                azVar.w = f7;
                zy zyVar = azVar.e;
                zyVar.d = f7;
                zyVar.invalidate();
                j3Var2.setAlpha(azVar.w);
                azVar.h.setAlpha(azVar.w);
                imageView.setAlpha(azVar.w);
                textView.setAlpha(1.0f - azVar.w);
                u5Var.setAlpha(azVar.w);
                azVar.b.setAlpha(1.0f - azVar.w);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    j3Var2.setVisibility(8);
                    j3Var.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                j3Var2.setVisibility(0);
                j3Var.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.g00 g00Var = (org.telegram.ui.Components.g00) view;
                if (g00Var == hzVar.O) {
                    hzVar.O = null;
                }
                if (i10 == hzVar.I) {
                    g00Var.b(org.telegram.messenger.dd.L0(2131749159, null), false);
                    g00Var.a("", null);
                    return;
                }
                hzVar.O = g00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    hzVar.k0(false);
                    return;
                } else {
                    g00Var.b(org.telegram.messenger.dd.L0(2131750754, null), false);
                    g00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        Long l4 = (Long) hzVar.h.get(i10 - hzVar.L);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User Z1 = hzVar.getMessagesController().Z1(l4);
            str = Z1 != null ? org.telegram.messenger.i20.p(Z1) : null;
            str2 = null;
            chat = Z1;
        } else {
            TLRPC.Chat L0 = hzVar.getMessagesController().L0(Long.valueOf(-longValue));
            if (L0 != null) {
                str = L0.title;
                if (L0.participants_count != 0) {
                    if (org.telegram.messenger.w3.V(L0)) {
                        str2 = org.telegram.messenger.dd.H(',', "Subscribers", L0.participants_count);
                        chat = L0;
                    } else {
                        str2 = org.telegram.messenger.dd.H(',', "Members", L0.participants_count);
                        chat = L0;
                    }
                } else if (org.telegram.messenger.w3.V(L0)) {
                    str2 = org.telegram.messenger.dd.M0("ChannelPublic");
                    chat = L0;
                } else {
                    str2 = org.telegram.messenger.dd.M0("MegaPublic");
                    chat = L0;
                }
            } else {
                str = null;
                str2 = null;
                chat = L0;
            }
        }
        if (arrayList.contains(l4)) {
            j4Var.setForbiddenCheck(false);
            j4Var.c(hzVar.e.contains(l4), false);
        } else {
            j4Var.setForbiddenCheck(true);
            j4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? org.telegram.messenger.dd.L0(2131750772, null) : org.telegram.messenger.dd.L0(2131750740, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = org.telegram.messenger.w3.V(chat) ? org.telegram.messenger.dd.L0(2131750770, null) : org.telegram.messenger.dd.L0(2131750759, null);
            }
        }
        j4Var.setTag(l4);
        j4Var.d(chat, str, str2);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View g00Var;
        View view;
        hz hzVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.b9(hzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    g00Var = new fz(this, hzVar.getParentActivity(), hzVar);
                    g00Var.setLayoutParams(new s4.o0(-1, -2));
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, g00Var, null);
                } else if (i10 == 4) {
                    View j4Var = new org.telegram.ui.Cells.j4(hzVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, j4Var, null);
                    view = j4Var;
                } else if (i10 == 5) {
                    g00Var = new org.telegram.ui.Components.g00(hzVar.getParentActivity());
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, g00Var, null);
                }
                view2 = g00Var;
            }
            return new org.telegram.ui.Components.dk0(view2);
        }
        Activity parentActivity = hzVar.getParentActivity();
        wy wyVar = new wy(parentActivity);
        org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(parentActivity);
        fi0Var.f(R.raw.folder_share, 90, 90, null);
        fi0Var.setScaleType(ImageView.ScaleType.CENTER);
        fi0Var.d();
        fi0Var.setImportantForAccessibility(2);
        wyVar.addView(fi0Var, w7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        nh.p pVar = new nh.p(parentActivity);
        wyVar.a = pVar;
        org.telegram.ui.ActionBar.a7.V(pVar, org.telegram.ui.ActionBar.t6.B6, null);
        pVar.setTextSize(1, 14.0f);
        pVar.setGravity(17);
        pVar.setLines(2);
        wyVar.addView(pVar, w7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = wyVar;
        view2 = view;
        return new org.telegram.ui.Components.dk0(view2);
    }
}
