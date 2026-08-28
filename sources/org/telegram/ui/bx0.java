package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bx0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ cx0 d;

    public bx0(cx0 cx0Var, Context context) {
        this.d = cx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 2 || i9 == 4;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.e;
    }

    @Override // f2.r0
    public final int j(int i9) {
        cx0 cx0Var = this.d;
        if (i9 == cx0Var.w) {
            return 4;
        }
        if (i9 == cx0Var.n) {
            return 3;
        }
        if (i9 == cx0Var.f) {
            return 2;
        }
        return (i9 == cx0Var.h || i9 == cx0Var.v) ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String string;
        cx0 cx0Var = this.d;
        int i10 = cx0Var.y;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (i10 != 1) {
                throw null;
            }
            long keyAt = cx0Var.getMessagesController().blockePeers.keyAt(i9 - cx0Var.r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = cx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i12 = chat.participants_count;
                    b5Var.b(chat, null, i12 != 0 ? LocaleController.formatPluralString("Members", i12, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i9 != cx0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = cx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.ll.g(new StringBuilder("+"), user.phone, ne.b.c());
                }
                b5Var.b(user, null, string, i9 != cx0Var.s - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 != cx0Var.h) {
                if (i9 == cx0Var.v) {
                    b9Var.setFixedSize(12);
                    b9Var.setText("");
                    return;
                }
                return;
            }
            if (i10 == 1) {
                b9Var.setFixedSize(0);
                b9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                b9Var.setFixedSize(8);
                b9Var.setText(null);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            y4Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
            if (i10 == 1) {
                y4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                return;
            } else {
                LocaleController.getString(R.string.PrivacyAddAnException);
                throw null;
            }
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i9 == cx0Var.n) {
            if (i10 == 1) {
                m4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", cx0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                m4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        FrameLayout b9Var;
        if (i9 != 0) {
            Context context = this.c;
            if (i9 == 1) {
                b9Var = new org.telegram.ui.Cells.b9(context);
            } else if (i9 == 2) {
                b9Var = new org.telegram.ui.Cells.y4(context);
            } else if (i9 != 4) {
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.f6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                frameLayout = m4Var;
            } else {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                p8Var.e(-1, org.telegram.ui.ActionBar.f6.p7);
                frameLayout = p8Var;
            }
            frameLayout = b9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(7, 6, this.c, null, true);
            b5Var.setDelegate(new dl0(this, 10));
            frameLayout = b5Var;
        }
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
