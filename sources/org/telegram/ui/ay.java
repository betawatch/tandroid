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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ay extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ cy c;

    public ay(cy cyVar) {
        this.c = cyVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 4;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.H;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        cy cyVar = this.c;
        if (i3 == cyVar.O || i3 == cyVar.K) {
            return 2;
        }
        if (i3 == cyVar.I) {
            return 3;
        }
        if (i3 < cyVar.M || i3 >= cyVar.N) {
            return (i3 == cyVar.L || i3 == cyVar.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        String str2;
        TLRPC.Chat chat;
        cy cyVar = this.c;
        ArrayList arrayList = cyVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = cyVar.d;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            cyVar.Q = (rx) view;
            cyVar.l0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 != cyVar.O) {
                y8Var.setFixedSize(12);
                return;
            }
            y8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131750747, null));
                return;
            } else {
                y8Var.setText(org.telegram.messenger.bd.M0(2131750748, null));
                return;
            }
        }
        if (i10 == 3) {
            ux uxVar = (ux) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            ci.ec ecVar = uxVar.h;
            org.telegram.ui.ActionBar.k5 k5Var = uxVar.c;
            TextView textView = uxVar.n;
            ImageView imageView = uxVar.d;
            ci.ec ecVar2 = uxVar.f;
            uxVar.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            k5Var.l(str3, false);
            if (uxVar.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = uxVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    uxVar.x = null;
                }
                float f10 = str3 != null ? 1.0f : 0.0f;
                uxVar.w = f10;
                tx txVar = uxVar.e;
                txVar.d = f10;
                txVar.invalidate();
                ecVar2.setAlpha(uxVar.w);
                uxVar.h.setAlpha(uxVar.w);
                imageView.setAlpha(uxVar.w);
                textView.setAlpha(1.0f - uxVar.w);
                k5Var.setAlpha(uxVar.w);
                uxVar.b.setAlpha(1.0f - uxVar.w);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    ecVar2.setVisibility(8);
                    ecVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                ecVar2.setVisibility(0);
                ecVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                org.telegram.ui.Components.oz ozVar = (org.telegram.ui.Components.oz) view;
                if (ozVar == cyVar.P) {
                    cyVar.P = null;
                }
                if (i3 == cyVar.J) {
                    ozVar.b(org.telegram.messenger.bd.M0(2131749157, null), false);
                    ozVar.a("", null);
                    return;
                }
                cyVar.P = ozVar;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    cyVar.k0(false);
                    return;
                } else {
                    ozVar.b(org.telegram.messenger.bd.M0(2131750754, null), false);
                    ozVar.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        Long l10 = (Long) cyVar.h.get(i3 - cyVar.M);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User a22 = cyVar.getMessagesController().a2(l10);
            str = a22 != null ? org.telegram.messenger.l10.p(a22) : null;
            str2 = null;
            chat = a22;
        } else {
            TLRPC.Chat M0 = cyVar.getMessagesController().M0(Long.valueOf(-longValue));
            if (M0 != null) {
                str = M0.title;
                if (M0.participants_count != 0) {
                    if (org.telegram.messenger.t3.V(M0)) {
                        str2 = org.telegram.messenger.bd.H(',', "Subscribers", M0.participants_count);
                        chat = M0;
                    } else {
                        str2 = org.telegram.messenger.bd.H(',', "Members", M0.participants_count);
                        chat = M0;
                    }
                } else if (org.telegram.messenger.t3.V(M0)) {
                    str2 = org.telegram.messenger.bd.N0("ChannelPublic");
                    chat = M0;
                } else {
                    str2 = org.telegram.messenger.bd.N0("MegaPublic");
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
            h4Var.c(cyVar.e.contains(l10), false);
        } else {
            h4Var.setForbiddenCheck(true);
            h4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? org.telegram.messenger.bd.M0(2131750772, null) : org.telegram.messenger.bd.M0(2131750740, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = org.telegram.messenger.t3.V(chat) ? org.telegram.messenger.bd.M0(2131750770, null) : org.telegram.messenger.bd.M0(2131750759, null);
            }
        }
        h4Var.setTag(l10);
        h4Var.d(chat, str, str2);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View ozVar;
        View view;
        cy cyVar = this.c;
        View view2 = null;
        if (i3 != 0) {
            if (i3 == 2) {
                view2 = new org.telegram.ui.Cells.y8(cyVar.getParentActivity());
            } else {
                if (i3 == 3) {
                    ozVar = new zx(this, cyVar.getParentActivity(), cyVar);
                    ozVar.setLayoutParams(new u4.p0(-1, -2));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ozVar, null);
                } else if (i3 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(cyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h4Var, null);
                    view = h4Var;
                } else if (i3 == 5) {
                    ozVar = new org.telegram.ui.Components.oz(cyVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ozVar, null);
                }
                view2 = ozVar;
            }
            return new org.telegram.ui.Components.bj0(view2);
        }
        Activity parentActivity = cyVar.getParentActivity();
        rx rxVar = new rx(parentActivity);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(parentActivity);
        fh0Var.f(R.raw.folder_share, 90, 90, null);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.d();
        fh0Var.setImportantForAccessibility(2);
        rxVar.addView(fh0Var, b8.mf.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        yh.l lVar = new yh.l(parentActivity);
        rxVar.a = lVar;
        org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.B6, null);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(17);
        lVar.setLines(2);
        rxVar.addView(lVar, b8.mf.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = rxVar;
        view2 = view;
        return new org.telegram.ui.Components.bj0(view2);
    }
}
