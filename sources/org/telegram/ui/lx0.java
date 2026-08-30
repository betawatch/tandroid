package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lx0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ mx0 d;

    public lx0(mx0 mx0Var, Context context) {
        this.d = mx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.e;
    }

    @Override // f2.o0
    public final int j(int i10) {
        mx0 mx0Var = this.d;
        if (i10 == mx0Var.w) {
            return 4;
        }
        if (i10 == mx0Var.n) {
            return 3;
        }
        if (i10 == mx0Var.f) {
            return 2;
        }
        return (i10 == mx0Var.h || i10 == mx0Var.v) ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String string;
        mx0 mx0Var = this.d;
        int i11 = mx0Var.y;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = mx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    b5Var.b(chat, null, i13 != 0 ? LocaleController.formatPluralString("Members", i13, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i10 != mx0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = mx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.y3.j(new StringBuilder("+"), user.phone, se.b.c());
                }
                b5Var.b(user, null, string, i10 != mx0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 != mx0Var.h) {
                if (i10 == mx0Var.v) {
                    a9Var.setFixedSize(12);
                    a9Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                a9Var.setFixedSize(0);
                a9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                a9Var.setFixedSize(8);
                a9Var.setText(null);
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
        if (i10 == mx0Var.n) {
            if (i11 == 1) {
                m4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", mx0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                m4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout a9Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                a9Var = new org.telegram.ui.Cells.a9(context);
            } else if (i10 == 2) {
                a9Var = new org.telegram.ui.Cells.y4(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                frameLayout = m4Var;
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                o8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                o8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                frameLayout = o8Var;
            }
            frameLayout = a9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(7, 6, this.c, null, true);
            b5Var.setDelegate(new il0(this, 10));
            frameLayout = b5Var;
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
