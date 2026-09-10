package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jy0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ ky0 d;

    public jy0(ky0 ky0Var, Context context) {
        this.d = ky0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.e;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ky0 ky0Var = this.d;
        if (i10 == ky0Var.w) {
            return 4;
        }
        if (i10 == ky0Var.n) {
            return 3;
        }
        if (i10 == ky0Var.f) {
            return 2;
        }
        return (i10 == ky0Var.h || i10 == ky0Var.v) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        ky0 ky0Var = this.d;
        int i11 = ky0Var.y;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = ky0Var.getMessagesController().blockePeers.keyAt(i10 - ky0Var.r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = ky0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    b5Var.b(chat, null, i13 != 0 ? LocaleController.formatPluralString("Members", i13, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i10 != ky0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = ky0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.a2.j(new StringBuilder("+"), user.phone, gf.b.c());
                }
                b5Var.b(user, null, string, i10 != ky0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 != ky0Var.h) {
                if (i10 == ky0Var.v) {
                    f9Var.setFixedSize(12);
                    f9Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                f9Var.setFixedSize(0);
                f9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                f9Var.setFixedSize(8);
                f9Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            if (i11 == 1) {
                y4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                return;
            } else {
                LocaleController.getString(R.string.PrivacyAddAnException);
                throw null;
            }
        }
        if (i12 != 3) {
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == ky0Var.n) {
            if (i11 == 1) {
                m4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", ky0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                m4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout f9Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                f9Var = new org.telegram.ui.Cells.f9(context);
            } else if (i10 == 2) {
                f9Var = new org.telegram.ui.Cells.y4(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                frameLayout = m4Var;
            } else {
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                s8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                s8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                frameLayout = s8Var;
            }
            frameLayout = f9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(7, 6, this.c, null, true);
            b5Var.setDelegate(new ul0(this, 10));
            frameLayout = b5Var;
        }
        return new org.telegram.ui.Components.fl0(frameLayout);
    }
}
