package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ax0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ bx0 d;

    public ax0(bx0 bx0Var, Context context) {
        this.d = bx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.e;
    }

    @Override // f2.p0
    public final int j(int i10) {
        bx0 bx0Var = this.d;
        if (i10 == bx0Var.w) {
            return 4;
        }
        if (i10 == bx0Var.n) {
            return 3;
        }
        if (i10 == bx0Var.f) {
            return 2;
        }
        return (i10 == bx0Var.h || i10 == bx0Var.v) ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        String string;
        bx0 bx0Var = this.d;
        int i11 = bx0Var.y;
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = bx0Var.getMessagesController().blockePeers.keyAt(i10 - bx0Var.r);
            z4Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = bx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    z4Var.b(chat, null, i13 != 0 ? LocaleController.formatPluralString("Members", i13, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i10 != bx0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = bx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.x3.k(new StringBuilder("+"), user.phone, qe.b.c());
                }
                z4Var.b(user, null, string, i10 != bx0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 != bx0Var.h) {
                if (i10 == bx0Var.v) {
                    y8Var.setFixedSize(12);
                    y8Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                y8Var.setFixedSize(0);
                y8Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                y8Var.setFixedSize(8);
                y8Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
            w4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            if (i11 == 1) {
                w4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                return;
            } else {
                LocaleController.getString(R.string.PrivacyAddAnException);
                throw null;
            }
        }
        if (i12 != 3) {
            return;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        if (i10 == bx0Var.n) {
            if (i11 == 1) {
                k4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", bx0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                k4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout y8Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                y8Var = new org.telegram.ui.Cells.y8(context);
            } else if (i10 == 2) {
                y8Var = new org.telegram.ui.Cells.w4(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                k4Var.setHeight(43);
                frameLayout = k4Var;
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                m8Var.e(-1, org.telegram.ui.ActionBar.g6.p7);
                frameLayout = m8Var;
            }
            frameLayout = y8Var;
        } else {
            org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(7, 6, this.c, null, true);
            z4Var.setDelegate(new zk0(this, 10));
            frameLayout = z4Var;
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
