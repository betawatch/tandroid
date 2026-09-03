package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pp extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ sp d;

    public pp(sp spVar, Context context) {
        this.d = spVar;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // f2.o0
    public final int h() {
        sp spVar = this.d;
        if (!spVar.w || spVar.x) {
            return spVar.J;
        }
        return 0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        sp spVar = this.d;
        spVar.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == spVar.C || i10 == spVar.F) {
            return 2;
        }
        if (i10 < spVar.D || i10 >= spVar.E) {
            return i10 == spVar.H ? 4 : 1;
        }
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        sp spVar = this.d;
        boolean z4 = spVar.s;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            TLRPC.Chat chat = (TLRPC.Chat) spVar.v.get(i10 - spVar.D);
            String publicUsername = ChatObject.getPublicUsername(chat);
            a5Var.b(chat, null, TextUtils.isEmpty(publicUsername) ? null : vh.w2.e("@", publicUsername), (i10 == spVar.E - 1 && spVar.h.linked_chat_id == 0) ? false : true);
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == spVar.I) {
                z8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                return;
            } else {
                if (i10 == spVar.G) {
                    if (z4) {
                        z8Var.setText(LocaleController.getString(R.string.DiscussionChannelHelp2));
                        return;
                    } else {
                        z8Var.setText(LocaleController.getString(R.string.DiscussionGroupHelp2));
                        return;
                    }
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
        if (!z4) {
            int i12 = org.telegram.ui.ActionBar.j6.p7;
            x4Var.a(i12, i12);
            x4Var.b(LocaleController.getString(R.string.DiscussionUnlinkChannel), R.drawable.msg_remove, 5, false);
        } else if (spVar.h.linked_chat_id == 0) {
            x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            x4Var.b(LocaleController.getString(R.string.DiscussionCreateGroup), R.drawable.msg_groups, 5, true);
        } else {
            int i13 = org.telegram.ui.ActionBar.j6.p7;
            x4Var.a(i13, i13);
            x4Var.b(LocaleController.getString(R.string.DiscussionUnlinkGroup), R.drawable.msg_remove, 5, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout a5Var;
        sp spVar = this.d;
        boolean z4 = spVar.s;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                a5Var = new org.telegram.ui.Cells.z8(context);
            } else if (i10 == 2) {
                a5Var = new org.telegram.ui.Cells.x4(context);
            } else if (i10 != 4) {
                lp lpVar = new lp(context);
                kp kpVar = new kp(context);
                kpVar.c = UserConfig.selectedAccount;
                kpVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                kpVar.setOrientation(1);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                kpVar.a = p9Var;
                org.telegram.ui.Components.l90 l90Var = new org.telegram.ui.Components.l90(p9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
                kpVar.b = l90Var;
                p9Var.setImageDrawable(l90Var);
                kpVar.addView(p9Var, k7.b6.t(104, 104, 49, 0, 2, 0, 0));
                lpVar.addView(kpVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (z4) {
                    TLRPC.ChatFull chatFull = spVar.h;
                    if (chatFull == null || chatFull.linked_chat_id == 0) {
                        textView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
                    } else {
                        TLRPC.Chat chat = spVar.getMessagesController().getChat(Long.valueOf(spVar.h.linked_chat_id));
                        if (chat != null) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat.title)));
                        }
                    }
                } else {
                    TLRPC.Chat chat2 = spVar.getMessagesController().getChat(Long.valueOf(spVar.h.linked_chat_id));
                    if (chat2 != null) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat2.title)));
                    }
                }
                lpVar.addView(textView, k7.b6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                lpVar.setTag(-33024);
                a5Var = lpVar;
            } else {
                TLRPC.Chat chat3 = z4 ? (TLRPC.Chat) spVar.v.get(0) : spVar.f;
                op opVar = new op(this, context, chat3, chat3);
                spVar.y = opVar;
                a5Var = opVar;
            }
        } else {
            a5Var = new org.telegram.ui.Cells.a5(6, 2, this.c, null, false);
        }
        return new org.telegram.ui.Components.dl0(a5Var);
    }
}
