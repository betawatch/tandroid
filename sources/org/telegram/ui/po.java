package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class po extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ so d;

    public po(so soVar, Context context) {
        this.d = soVar;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 2;
    }

    @Override // v4.g0
    public final int b() {
        so soVar = this.d;
        if (!soVar.x || soVar.y) {
            return soVar.M;
        }
        return 0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        so soVar = this.d;
        soVar.getClass();
        if (i7 == 0) {
            return 3;
        }
        if (i7 == soVar.F || i7 == soVar.I) {
            return 2;
        }
        if (i7 < soVar.G || i7 >= soVar.H) {
            return i7 == soVar.K ? 4 : 1;
        }
        return 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        so soVar = this.d;
        boolean z9 = soVar.s;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            TLRPC.Chat chat = (TLRPC.Chat) soVar.w.get(i7 - soVar.G);
            String K = org.telegram.messenger.t3.K(chat, false);
            a5Var.c(chat, null, TextUtils.isEmpty(K) ? null : rf.b.i("@", K), (i7 == soVar.H - 1 && soVar.h.linked_chat_id == 0) ? false : true);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == soVar.L) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131752303, null));
                return;
            } else {
                if (i7 == soVar.J) {
                    if (z9) {
                        z8Var.setText(org.telegram.messenger.hd.M0(2131751388, null));
                        return;
                    } else {
                        z8Var.setText(org.telegram.messenger.hd.M0(2131751384, null));
                        return;
                    }
                }
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
        if (!z9) {
            int i11 = org.telegram.ui.ActionBar.k6.p7;
            x4Var.a(i11, i11);
            x4Var.b(R.drawable.msg_remove, 5, org.telegram.messenger.hd.M0(2131751374, null), false);
        } else if (soVar.h.linked_chat_id == 0) {
            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            x4Var.b(R.drawable.msg_groups, 5, org.telegram.messenger.hd.M0(2131751386, null), true);
        } else {
            int i12 = org.telegram.ui.ActionBar.k6.p7;
            x4Var.a(i12, i12);
            x4Var.b(R.drawable.msg_remove, 5, org.telegram.messenger.hd.M0(2131751372, null), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout a5Var;
        so soVar = this.d;
        boolean z9 = soVar.s;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                a5Var = new org.telegram.ui.Cells.z8(context);
            } else if (i7 == 2) {
                a5Var = new org.telegram.ui.Cells.x4(context);
            } else if (i7 != 4) {
                mo moVar = new mo(context);
                lo loVar = new lo(context);
                loVar.c = org.telegram.messenger.p10.s0;
                loVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                loVar.setOrientation(1);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                loVar.a = l9Var;
                org.telegram.ui.Components.c80 c80Var = new org.telegram.ui.Components.c80(l9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(104.0f));
                loVar.b = c80Var;
                l9Var.setImageDrawable(c80Var);
                loVar.addView(l9Var, c8.ha.t(org.telegram.messenger.qs.p1, org.telegram.messenger.qs.p1, 49, 0, 2, 0, 0));
                moVar.addView(loVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (z9) {
                    TLRPC.ChatFull chatFull = soVar.h;
                    if (chatFull == null || chatFull.linked_chat_id == 0) {
                        textView.setText(org.telegram.messenger.hd.M0(2131751387, null));
                    } else {
                        TLRPC.Chat M0 = soVar.getMessagesController().M0(Long.valueOf(soVar.h.linked_chat_id));
                        if (M0 != null) {
                            org.telegram.messenger.k5.r("DiscussionChannelGroupSetHelp2", null, 2131751389, new Object[]{M0.title}, textView);
                        }
                    }
                } else {
                    TLRPC.Chat M02 = soVar.getMessagesController().M0(Long.valueOf(soVar.h.linked_chat_id));
                    if (M02 != null) {
                        org.telegram.messenger.k5.r("DiscussionGroupHelp", null, 2131751385, new Object[]{M02.title}, textView);
                    }
                }
                moVar.addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                moVar.setTag(-33024);
                a5Var = moVar;
            } else {
                TLRPC.Chat chat = z9 ? (TLRPC.Chat) soVar.w.get(0) : soVar.f;
                oo ooVar = new oo(this, context, chat, chat);
                soVar.D = ooVar;
                a5Var = ooVar;
            }
        } else {
            a5Var = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
        }
        return new org.telegram.ui.Components.xi0(a5Var);
    }
}
