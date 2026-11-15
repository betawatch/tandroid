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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gy extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ hy c;

    public gy(hy hyVar) {
        this.c = hyVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 4;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.H;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        hy hyVar = this.c;
        if (i7 == hyVar.O || i7 == hyVar.K) {
            return 2;
        }
        if (i7 == hyVar.I) {
            return 3;
        }
        if (i7 < hyVar.M || i7 >= hyVar.N) {
            return (i7 == hyVar.L || i7 == hyVar.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        String str2;
        TLRPC.Chat chat;
        hy hyVar = this.c;
        ArrayList arrayList = hyVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hyVar.d;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 0) {
            hyVar.Q = (vx) view;
            hyVar.l0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 != hyVar.O) {
                y8Var.setFixedSize(12);
                return;
            }
            y8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131750746, null));
                return;
            } else {
                y8Var.setText(org.telegram.messenger.hd.M0(2131750747, null));
                return;
            }
        }
        if (i10 == 3) {
            zx zxVar = (zx) view;
            String str3 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            di.tb tbVar = zxVar.h;
            org.telegram.ui.ActionBar.j5 j5Var = zxVar.c;
            TextView textView = zxVar.n;
            ImageView imageView = zxVar.d;
            di.tb tbVar2 = zxVar.f;
            zxVar.s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            j5Var.l(str3, false);
            if (zxVar.w != (str3 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = zxVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    zxVar.x = null;
                }
                float f10 = str3 != null ? 1.0f : 0.0f;
                zxVar.w = f10;
                yx yxVar = zxVar.e;
                yxVar.d = f10;
                yxVar.invalidate();
                tbVar2.setAlpha(zxVar.w);
                zxVar.h.setAlpha(zxVar.w);
                imageView.setAlpha(zxVar.w);
                textView.setAlpha(1.0f - zxVar.w);
                j5Var.setAlpha(zxVar.w);
                zxVar.b.setAlpha(1.0f - zxVar.w);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    tbVar2.setVisibility(8);
                    tbVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                tbVar2.setVisibility(0);
                tbVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                org.telegram.ui.Components.wz wzVar = (org.telegram.ui.Components.wz) view;
                if (wzVar == hyVar.P) {
                    hyVar.P = null;
                }
                if (i7 == hyVar.J) {
                    wzVar.b(org.telegram.messenger.hd.M0(2131749149, null), false);
                    wzVar.a("", null);
                    return;
                }
                hyVar.P = wzVar;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    hyVar.k0(false);
                    return;
                } else {
                    wzVar.b(org.telegram.messenger.hd.M0(2131750753, null), false);
                    wzVar.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        Long l10 = (Long) hyVar.h.get(i7 - hyVar.M);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User a22 = hyVar.getMessagesController().a2(l10);
            str = a22 != null ? org.telegram.messenger.q10.p(a22) : null;
            str2 = null;
            chat = a22;
        } else {
            TLRPC.Chat M0 = hyVar.getMessagesController().M0(Long.valueOf(-longValue));
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
            h4Var.c(hyVar.e.contains(l10), false);
        } else {
            h4Var.setForbiddenCheck(true);
            h4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str2 = ((TLRPC.User) chat).bot ? org.telegram.messenger.hd.M0(2131750771, null) : org.telegram.messenger.hd.M0(2131750739, null);
            } else if (chat instanceof TLRPC.Chat) {
                str2 = org.telegram.messenger.t3.V(chat) ? org.telegram.messenger.hd.M0(2131750769, null) : org.telegram.messenger.hd.M0(2131750758, null);
            }
        }
        h4Var.setTag(l10);
        h4Var.d(chat, str, str2);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View wzVar;
        View view;
        hy hyVar = this.c;
        View view2 = null;
        if (i7 != 0) {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.y8(hyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    wzVar = new fy(this, hyVar.getParentActivity(), hyVar);
                    wzVar.setLayoutParams(new v4.p0(-1, -2));
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, wzVar, null);
                } else if (i7 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(hyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, h4Var, null);
                    view = h4Var;
                } else if (i7 == 5) {
                    wzVar = new org.telegram.ui.Components.wz(hyVar.getParentActivity());
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, wzVar, null);
                }
                view2 = wzVar;
            }
            return new org.telegram.ui.Components.cj0(view2);
        }
        Activity parentActivity = hyVar.getParentActivity();
        vx vxVar = new vx(parentActivity);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(parentActivity);
        fh0Var.f(R.raw.folder_share, 90, 90, null);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.d();
        fh0Var.setImportantForAccessibility(2);
        vxVar.addView(fh0Var, c8.ja.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(parentActivity);
        vxVar.a = lVar;
        org.telegram.ui.ActionBar.q6.U(lVar, org.telegram.ui.ActionBar.j6.B6, null);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(17);
        lVar.setLines(2);
        vxVar.addView(lVar, c8.ja.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = vxVar;
        view2 = view;
        return new org.telegram.ui.Components.cj0(view2);
    }
}
