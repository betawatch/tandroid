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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fy extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ gy c;

    public fy(gy gyVar) {
        this.c = gyVar;
    }

    @Override // org.telegram.ui.Components.oj0
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
        gy gyVar = this.c;
        if (i7 == gyVar.N || i7 == gyVar.J) {
            return 2;
        }
        if (i7 == gyVar.H) {
            return 3;
        }
        if (i7 < gyVar.L || i7 >= gyVar.M) {
            return (i7 == gyVar.K || i7 == gyVar.I) ? 5 : 0;
        }
        return 4;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        String str2;
        TLRPC.Chat chat;
        gy gyVar = this.c;
        ArrayList arrayList = gyVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = gyVar.d;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            gyVar.P = (vx) view;
            gyVar.l0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 != gyVar.N) {
                z8Var.setFixedSize(12);
                return;
            }
            z8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131750747, null));
                return;
            } else {
                z8Var.setText(org.telegram.messenger.hd.M0(2131750748, null));
                return;
            }
        }
        if (i10 == 3) {
            yx yxVar = (yx) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            bi.md mdVar = yxVar.h;
            org.telegram.ui.ActionBar.k5 k5Var = yxVar.c;
            TextView textView = yxVar.n;
            ImageView imageView = yxVar.d;
            bi.md mdVar2 = yxVar.f;
            yxVar.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            k5Var.l(str3, false);
            if (yxVar.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = yxVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    yxVar.x = null;
                }
                float f10 = str3 != null ? 1.0f : 0.0f;
                yxVar.w = f10;
                xx xxVar = yxVar.e;
                xxVar.d = f10;
                xxVar.invalidate();
                mdVar2.setAlpha(yxVar.w);
                yxVar.h.setAlpha(yxVar.w);
                imageView.setAlpha(yxVar.w);
                textView.setAlpha(1.0f - yxVar.w);
                k5Var.setAlpha(yxVar.w);
                yxVar.b.setAlpha(1.0f - yxVar.w);
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
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) view;
                if (szVar == gyVar.O) {
                    gyVar.O = null;
                }
                if (i7 == gyVar.I) {
                    szVar.b(org.telegram.messenger.hd.M0(2131749148, null), false);
                    szVar.a("", null);
                    return;
                }
                gyVar.O = szVar;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    gyVar.k0(false);
                    return;
                } else {
                    szVar.b(org.telegram.messenger.hd.M0(2131750754, null), false);
                    szVar.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        Long l10 = (Long) gyVar.h.get(i7 - gyVar.L);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User a22 = gyVar.getMessagesController().a2(l10);
            str = a22 != null ? org.telegram.messenger.t10.p(a22) : null;
            str2 = null;
            chat = a22;
        } else {
            TLRPC.Chat M0 = gyVar.getMessagesController().M0(Long.valueOf(-longValue));
            if (M0 != null) {
                str = M0.title;
                if (M0.participants_count != 0) {
                    if (org.telegram.messenger.t3.V(M0)) {
                        str2 = org.telegram.messenger.hd.H(',', "Subscribers", M0.participants_count);
                        chat = M0;
                    } else {
                        str2 = org.telegram.messenger.hd.H(',', "Members", M0.participants_count);
                        chat = M0;
                    }
                } else if (org.telegram.messenger.t3.V(M0)) {
                    str2 = org.telegram.messenger.hd.N0("ChannelPublic");
                    chat = M0;
                } else {
                    str2 = org.telegram.messenger.hd.N0("MegaPublic");
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
            h4Var.c(gyVar.e.contains(l10), false);
        } else {
            h4Var.setForbiddenCheck(true);
            h4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? org.telegram.messenger.hd.M0(2131750772, null) : org.telegram.messenger.hd.M0(2131750740, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = org.telegram.messenger.t3.V(chat) ? org.telegram.messenger.hd.M0(2131750770, null) : org.telegram.messenger.hd.M0(2131750759, null);
            }
        }
        h4Var.setTag(l10);
        h4Var.d(chat, str, str2);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View szVar;
        View view;
        gy gyVar = this.c;
        View view2 = null;
        if (i7 != 0) {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.z8(gyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    szVar = new ey(this, gyVar.getParentActivity(), gyVar);
                    szVar.setLayoutParams(new v4.o0(-1, -2));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, szVar, null);
                } else if (i7 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(gyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h4Var, null);
                    view = h4Var;
                } else if (i7 == 5) {
                    szVar = new org.telegram.ui.Components.sz(gyVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, szVar, null);
                }
                view2 = szVar;
            }
            return new org.telegram.ui.Components.xi0(view2);
        }
        Activity parentActivity = gyVar.getParentActivity();
        vx vxVar = new vx(parentActivity);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(parentActivity);
        ch0Var.f(R.raw.folder_share, 90, 90, null);
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.d();
        ch0Var.setImportantForAccessibility(2);
        vxVar.addView(ch0Var, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(parentActivity);
        vxVar.a = lVar;
        org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.B6, null);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(17);
        lVar.setLines(2);
        vxVar.addView(lVar, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = vxVar;
        view2 = view;
        return new org.telegram.ui.Components.xi0(view2);
    }
}
