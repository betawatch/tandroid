package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nx0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ ox0 d;

    public nx0(ox0 ox0Var, Context context) {
        this.d = ox0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
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
        ox0 ox0Var = this.d;
        if (i10 == ox0Var.w) {
            return 4;
        }
        if (i10 == ox0Var.n) {
            return 3;
        }
        if (i10 == ox0Var.f) {
            return 2;
        }
        return (i10 == ox0Var.h || i10 == ox0Var.v) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        ox0 ox0Var = this.d;
        int i11 = ox0Var.y;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = ox0Var.getMessagesController().blockePeers.keyAt(i10 - ox0Var.r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = ox0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    a5Var.c(chat, null, i13 != 0 ? LocaleController.formatPluralString("Members", i13, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i10 != ox0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = ox0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.sl.h(new StringBuilder("+"), user.phone, jf.b.c());
                }
                a5Var.c(user, null, string, i10 != ox0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 != ox0Var.h) {
                if (i10 == ox0Var.v) {
                    e9Var.setFixedSize(12);
                    e9Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                e9Var.setFixedSize(0);
                e9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                e9Var.setFixedSize(8);
                e9Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
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
        if (i10 == ox0Var.n) {
            if (i11 == 1) {
                l4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", ox0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                l4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout e9Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                e9Var = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 2) {
                e9Var = new org.telegram.ui.Cells.x4(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                frameLayout = l4Var;
            } else {
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                frameLayout = r8Var;
            }
            frameLayout = e9Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(7, 6, this.c, null, true);
            a5Var.setDelegate(new sp0(this, 9));
            frameLayout = a5Var;
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
