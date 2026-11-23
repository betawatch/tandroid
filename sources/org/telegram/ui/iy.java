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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class iy extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ jy c;

    public iy(jy jyVar) {
        this.c = jyVar;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 4;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.H;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        jy jyVar = this.c;
        if (i7 == jyVar.O || i7 == jyVar.K) {
            return 2;
        }
        if (i7 == jyVar.I) {
            return 3;
        }
        if (i7 < jyVar.M || i7 >= jyVar.N) {
            return (i7 == jyVar.L || i7 == jyVar.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        String str2;
        TLRPC.Chat chat;
        jy jyVar = this.c;
        ArrayList arrayList = jyVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = jyVar.d;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            jyVar.Q = (xx) view;
            jyVar.l0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 != jyVar.O) {
                z8Var.setFixedSize(12);
                return;
            }
            z8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                z8Var.setText(org.telegram.messenger.gd.N0(2131750734, null));
                return;
            } else {
                z8Var.setText(org.telegram.messenger.gd.N0(2131750735, null));
                return;
            }
        }
        if (i10 == 3) {
            cy cyVar = (cy) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            di.xb xbVar = cyVar.h;
            org.telegram.ui.ActionBar.n5 n5Var = cyVar.c;
            TextView textView = cyVar.n;
            ImageView imageView = cyVar.d;
            di.xb xbVar2 = cyVar.f;
            cyVar.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            n5Var.l(str3, false);
            if (cyVar.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = cyVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    cyVar.x = null;
                }
                float f10 = str3 != null ? 1.0f : 0.0f;
                cyVar.w = f10;
                ay ayVar = cyVar.e;
                ayVar.d = f10;
                ayVar.invalidate();
                xbVar2.setAlpha(cyVar.w);
                cyVar.h.setAlpha(cyVar.w);
                imageView.setAlpha(cyVar.w);
                textView.setAlpha(1.0f - cyVar.w);
                n5Var.setAlpha(cyVar.w);
                cyVar.b.setAlpha(1.0f - cyVar.w);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    xbVar2.setVisibility(8);
                    xbVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                xbVar2.setVisibility(0);
                xbVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                org.telegram.ui.Components.d00 d00Var = (org.telegram.ui.Components.d00) view;
                if (d00Var == jyVar.P) {
                    jyVar.P = null;
                }
                if (i7 == jyVar.J) {
                    d00Var.b(org.telegram.messenger.gd.N0(2131748956, null), false);
                    d00Var.a("", null);
                    return;
                }
                jyVar.P = d00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    jyVar.k0(false);
                    return;
                } else {
                    d00Var.b(org.telegram.messenger.gd.N0(2131750741, null), false);
                    d00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
        Long l10 = (Long) jyVar.h.get(i7 - jyVar.M);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User c22 = jyVar.getMessagesController().c2(l10);
            str = c22 != null ? org.telegram.messenger.n10.q(c22) : null;
            str2 = null;
            chat = c22;
        } else {
            TLRPC.Chat O0 = jyVar.getMessagesController().O0(Long.valueOf(-longValue));
            if (O0 != null) {
                str = O0.title;
                if (O0.participants_count != 0) {
                    if (org.telegram.messenger.v3.V(O0)) {
                        str2 = org.telegram.messenger.gd.H(',', "Subscribers", O0.participants_count);
                        chat = O0;
                    } else {
                        str2 = org.telegram.messenger.gd.H(',', "Members", O0.participants_count);
                        chat = O0;
                    }
                } else if (org.telegram.messenger.v3.V(O0)) {
                    str2 = org.telegram.messenger.gd.O0("ChannelPublic");
                    chat = O0;
                } else {
                    str2 = org.telegram.messenger.gd.O0("MegaPublic");
                    chat = O0;
                }
            } else {
                str = null;
                str2 = null;
                chat = O0;
            }
        }
        if (arrayList.contains(l10)) {
            i4Var.setForbiddenCheck(false);
            i4Var.c(jyVar.e.contains(l10), false);
        } else {
            i4Var.setForbiddenCheck(true);
            i4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? org.telegram.messenger.gd.N0(2131750759, null) : org.telegram.messenger.gd.N0(2131750727, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = org.telegram.messenger.v3.V(chat) ? org.telegram.messenger.gd.N0(2131750757, null) : org.telegram.messenger.gd.N0(2131750746, null);
            }
        }
        i4Var.setTag(l10);
        i4Var.d(chat, str, str2);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View d00Var;
        View view;
        jy jyVar = this.c;
        View view2 = null;
        if (i7 != 0) {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.z8(jyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    d00Var = new hy(this, jyVar.getParentActivity(), jyVar);
                    d00Var.setLayoutParams(new v4.q0(-1, -2));
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, d00Var, null);
                } else if (i7 == 4) {
                    View i4Var = new org.telegram.ui.Cells.i4(jyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, i4Var, null);
                    view = i4Var;
                } else if (i7 == 5) {
                    d00Var = new org.telegram.ui.Components.d00(jyVar.getParentActivity());
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, d00Var, null);
                }
                view2 = d00Var;
            }
            return new org.telegram.ui.Components.mj0(view2);
        }
        Activity parentActivity = jyVar.getParentActivity();
        xx xxVar = new xx(parentActivity);
        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
        qh0Var.f(R.raw.folder_share, 90, 90, null);
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        qh0Var.d();
        qh0Var.setImportantForAccessibility(2);
        xxVar.addView(qh0Var, c8.na.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(parentActivity);
        xxVar.a = lVar;
        org.telegram.ui.ActionBar.u6.U(lVar, org.telegram.ui.ActionBar.n6.B6, null);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(17);
        lVar.setLines(2);
        xxVar.addView(lVar, c8.na.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = xxVar;
        view2 = view;
        return new org.telegram.ui.Components.mj0(view2);
    }
}
