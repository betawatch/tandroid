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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hy extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ iy c;

    public hy(iy iyVar) {
        this.c = iyVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 4;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.G;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        iy iyVar = this.c;
        if (i7 == iyVar.N || i7 == iyVar.J) {
            return 2;
        }
        if (i7 == iyVar.H) {
            return 3;
        }
        if (i7 < iyVar.L || i7 >= iyVar.M) {
            return (i7 == iyVar.K || i7 == iyVar.I) ? 5 : 0;
        }
        return 4;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        String str2;
        TLRPC.Chat chat;
        iy iyVar = this.c;
        ArrayList arrayList = iyVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = iyVar.d;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            iyVar.P = (xx) view;
            iyVar.l0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 != iyVar.N) {
                z8Var.setFixedSize(12);
                return;
            }
            z8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                z8Var.setText(org.telegram.messenger.id.M0(2131750746, null));
                return;
            } else {
                z8Var.setText(org.telegram.messenger.id.M0(2131750747, null));
                return;
            }
        }
        if (i10 == 3) {
            ay ayVar = (ay) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            bi.md mdVar = ayVar.h;
            org.telegram.ui.ActionBar.l5 l5Var = ayVar.c;
            TextView textView = ayVar.n;
            ImageView imageView = ayVar.d;
            bi.md mdVar2 = ayVar.f;
            ayVar.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            l5Var.l(str3, false);
            if (ayVar.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = ayVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ayVar.x = null;
                }
                float f10 = str3 != null ? 1.0f : 0.0f;
                ayVar.w = f10;
                zx zxVar = ayVar.e;
                zxVar.d = f10;
                zxVar.invalidate();
                mdVar2.setAlpha(ayVar.w);
                ayVar.h.setAlpha(ayVar.w);
                imageView.setAlpha(ayVar.w);
                textView.setAlpha(1.0f - ayVar.w);
                l5Var.setAlpha(ayVar.w);
                ayVar.b.setAlpha(1.0f - ayVar.w);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    mdVar2.setVisibility(8);
                    mdVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                mdVar2.setVisibility(0);
                mdVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                org.telegram.ui.Components.tz tzVar = (org.telegram.ui.Components.tz) view;
                if (tzVar == iyVar.O) {
                    iyVar.O = null;
                }
                if (i7 == iyVar.I) {
                    tzVar.b(org.telegram.messenger.id.M0(2131749149, null), false);
                    tzVar.a("", null);
                    return;
                }
                iyVar.O = tzVar;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    iyVar.k0(false);
                    return;
                } else {
                    tzVar.b(org.telegram.messenger.id.M0(2131750753, null), false);
                    tzVar.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        Long l10 = (Long) iyVar.h.get(i7 - iyVar.L);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User a22 = iyVar.getMessagesController().a2(l10);
            str = a22 != null ? org.telegram.messenger.t10.p(a22) : null;
            str2 = null;
            chat = a22;
        } else {
            TLRPC.Chat M0 = iyVar.getMessagesController().M0(Long.valueOf(-longValue));
            if (M0 != null) {
                str = M0.title;
                if (M0.participants_count != 0) {
                    if (org.telegram.messenger.t3.V(M0)) {
                        str2 = org.telegram.messenger.id.H(',', "Subscribers", M0.participants_count);
                        chat = M0;
                    } else {
                        str2 = org.telegram.messenger.id.H(',', "Members", M0.participants_count);
                        chat = M0;
                    }
                } else if (org.telegram.messenger.t3.V(M0)) {
                    str2 = org.telegram.messenger.id.N0("ChannelPublic");
                    chat = M0;
                } else {
                    str2 = org.telegram.messenger.id.N0("MegaPublic");
                    chat = M0;
                }
            } else {
                str = null;
                str2 = null;
                chat = M0;
            }
        }
        if (arrayList.contains(l10)) {
            h4Var.setForbiddenCheck(false);
            h4Var.c(iyVar.e.contains(l10), false);
        } else {
            h4Var.setForbiddenCheck(true);
            h4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? org.telegram.messenger.id.M0(2131750771, null) : org.telegram.messenger.id.M0(2131750739, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = org.telegram.messenger.t3.V(chat) ? org.telegram.messenger.id.M0(2131750769, null) : org.telegram.messenger.id.M0(2131750758, null);
            }
        }
        h4Var.setTag(l10);
        h4Var.d(chat, str, str2);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View tzVar;
        View view;
        iy iyVar = this.c;
        View view2 = null;
        if (i7 != 0) {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.z8(iyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    tzVar = new gy(this, iyVar.getParentActivity(), iyVar);
                    tzVar.setLayoutParams(new v4.o0(-1, -2));
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, tzVar, null);
                } else if (i7 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(iyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, h4Var, null);
                    view = h4Var;
                } else if (i7 == 5) {
                    tzVar = new org.telegram.ui.Components.tz(iyVar.getParentActivity());
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, tzVar, null);
                }
                view2 = tzVar;
            }
            return new org.telegram.ui.Components.yi0(view2);
        }
        Activity parentActivity = iyVar.getParentActivity();
        xx xxVar = new xx(parentActivity);
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(parentActivity);
        dh0Var.f(R.raw.folder_share, 90, 90, null);
        dh0Var.setScaleType(ImageView.ScaleType.CENTER);
        dh0Var.d();
        dh0Var.setImportantForAccessibility(2);
        xxVar.addView(dh0Var, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(parentActivity);
        xxVar.a = lVar;
        org.telegram.ui.ActionBar.s6.U(lVar, org.telegram.ui.ActionBar.l6.B6, null);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(17);
        lVar.setLines(2);
        xxVar.addView(lVar, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = xxVar;
        view2 = view;
        return new org.telegram.ui.Components.yi0(view2);
    }
}
