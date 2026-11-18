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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jy extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ ky c;

    public jy(ky kyVar) {
        this.c = kyVar;
    }

    @Override // org.telegram.ui.Components.bk0
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
        ky kyVar = this.c;
        if (i7 == kyVar.O || i7 == kyVar.K) {
            return 2;
        }
        if (i7 == kyVar.I) {
            return 3;
        }
        if (i7 < kyVar.M || i7 >= kyVar.N) {
            return (i7 == kyVar.L || i7 == kyVar.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        String str2;
        TLRPC.Chat chat;
        ky kyVar = this.c;
        ArrayList arrayList = kyVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = kyVar.d;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            kyVar.Q = (yx) view;
            kyVar.l0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 != kyVar.O) {
                z8Var.setFixedSize(12);
                return;
            }
            z8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                z8Var.setText(org.telegram.messenger.gd.M0(2131750735, null));
                return;
            } else {
                z8Var.setText(org.telegram.messenger.gd.M0(2131750736, null));
                return;
            }
        }
        if (i10 == 3) {
            dy dyVar = (dy) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            di.xb xbVar = dyVar.h;
            org.telegram.ui.ActionBar.n5 n5Var = dyVar.c;
            TextView textView = dyVar.n;
            ImageView imageView = dyVar.d;
            di.xb xbVar2 = dyVar.f;
            dyVar.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            n5Var.l(str3, false);
            if (dyVar.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = dyVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    dyVar.x = null;
                }
                float f10 = str3 != null ? 1.0f : 0.0f;
                dyVar.w = f10;
                cy cyVar = dyVar.e;
                cyVar.d = f10;
                cyVar.invalidate();
                xbVar2.setAlpha(dyVar.w);
                dyVar.h.setAlpha(dyVar.w);
                imageView.setAlpha(dyVar.w);
                textView.setAlpha(1.0f - dyVar.w);
                n5Var.setAlpha(dyVar.w);
                dyVar.b.setAlpha(1.0f - dyVar.w);
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
                if (d00Var == kyVar.P) {
                    kyVar.P = null;
                }
                if (i7 == kyVar.J) {
                    d00Var.b(org.telegram.messenger.gd.M0(2131748957, null), false);
                    d00Var.a("", null);
                    return;
                }
                kyVar.P = d00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    kyVar.k0(false);
                    return;
                } else {
                    d00Var.b(org.telegram.messenger.gd.M0(2131750742, null), false);
                    d00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        Long l10 = (Long) kyVar.h.get(i7 - kyVar.M);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User c22 = kyVar.getMessagesController().c2(l10);
            str = c22 != null ? org.telegram.messenger.o10.q(c22) : null;
            str2 = null;
            chat = c22;
        } else {
            TLRPC.Chat O0 = kyVar.getMessagesController().O0(Long.valueOf(-longValue));
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
                    str2 = org.telegram.messenger.gd.N0("ChannelPublic");
                    chat = O0;
                } else {
                    str2 = org.telegram.messenger.gd.N0("MegaPublic");
                    chat = O0;
                }
            } else {
                str = null;
                str2 = null;
                chat = O0;
            }
        }
        if (arrayList.contains(l10)) {
            h4Var.setForbiddenCheck(false);
            h4Var.c(kyVar.e.contains(l10), false);
        } else {
            h4Var.setForbiddenCheck(true);
            h4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? org.telegram.messenger.gd.M0(2131750760, null) : org.telegram.messenger.gd.M0(2131750728, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = org.telegram.messenger.v3.V(chat) ? org.telegram.messenger.gd.M0(2131750758, null) : org.telegram.messenger.gd.M0(2131750747, null);
            }
        }
        h4Var.setTag(l10);
        h4Var.d(chat, str, str2);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View d00Var;
        View view;
        ky kyVar = this.c;
        View view2 = null;
        if (i7 != 0) {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.z8(kyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    d00Var = new iy(this, kyVar.getParentActivity(), kyVar);
                    d00Var.setLayoutParams(new v4.q0(-1, -2));
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, d00Var, null);
                } else if (i7 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(kyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, h4Var, null);
                    view = h4Var;
                } else if (i7 == 5) {
                    d00Var = new org.telegram.ui.Components.d00(kyVar.getParentActivity());
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, d00Var, null);
                }
                view2 = d00Var;
            }
            return new org.telegram.ui.Components.kj0(view2);
        }
        Activity parentActivity = kyVar.getParentActivity();
        yx yxVar = new yx(parentActivity);
        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(parentActivity);
        ph0Var.f(R.raw.folder_share, 90, 90, null);
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        ph0Var.d();
        ph0Var.setImportantForAccessibility(2);
        yxVar.addView(ph0Var, c8.ma.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(parentActivity);
        yxVar.a = lVar;
        org.telegram.ui.ActionBar.u6.U(lVar, org.telegram.ui.ActionBar.n6.B6, null);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(17);
        lVar.setLines(2);
        yxVar.addView(lVar, c8.ma.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = yxVar;
        view2 = view;
        return new org.telegram.ui.Components.kj0(view2);
    }
}
