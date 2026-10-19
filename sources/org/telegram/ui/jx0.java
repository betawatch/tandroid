package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class jx0 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ kx0 d;

    public jx0(kx0 kx0Var, Context context) {
        this.d = kx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.e;
    }

    @Override // s4.g0
    public final int j(int i10) {
        kx0 kx0Var = this.d;
        if (i10 == kx0Var.w) {
            return 4;
        }
        if (i10 == kx0Var.n) {
            return 3;
        }
        if (i10 == kx0Var.f) {
            return 2;
        }
        return (i10 == kx0Var.h || i10 == kx0Var.v) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        kx0 kx0Var = this.d;
        int i11 = kx0Var.y;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = kx0Var.getMessagesController().blockePeers.keyAt(i10 - kx0Var.r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = kx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    a5Var.b(chat, null, i13 != 0 ? LocaleController.formatPluralString("Members", i13, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i10 != kx0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = kx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.kk.g(new StringBuilder("+"), user.phone, jf.b.c());
                }
                a5Var.b(user, null, string, i10 != kx0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 != kx0Var.h) {
                if (i10 == kx0Var.v) {
                    d9Var.setFixedSize(12);
                    d9Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                d9Var.setFixedSize(0);
                d9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                d9Var.setFixedSize(8);
                d9Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            x4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
            if (i11 == 1) {
                x4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                return;
            } else {
                LocaleController.getString(R.string.PrivacyAddAnException);
                throw null;
            }
        }
        if (i12 != 3) {
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == kx0Var.n) {
            if (i11 == 1) {
                l4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", kx0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                l4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout d9Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                d9Var = new org.telegram.ui.Cells.d9(context);
            } else if (i10 == 2) {
                d9Var = new org.telegram.ui.Cells.x4(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                frameLayout = l4Var;
            } else {
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                q8Var.e(-1, org.telegram.ui.ActionBar.h6.p7);
                frameLayout = q8Var;
            }
            frameLayout = d9Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(7, 6, this.c, null, true);
            a5Var.setDelegate(new pp0(this, 9));
            frameLayout = a5Var;
        }
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
