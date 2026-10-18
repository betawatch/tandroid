package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jh0 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ kh0 d;

    public jh0(kh0 kh0Var, Context context) {
        this.d = kh0Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        kh0 kh0Var = this.d;
        if (kh0Var.Q == b10 || kh0Var.x == b10) {
            return true;
        }
        if (b10 >= kh0Var.y && b10 < kh0Var.E) {
            return true;
        }
        if ((b10 < kh0Var.H || b10 >= kh0Var.I) && b10 != kh0Var.N) {
            return b10 >= kh0Var.U && b10 < kh0Var.V;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.g0
    public final int j(int i10) {
        kh0 kh0Var = this.d;
        if (i10 == kh0Var.r) {
            return 0;
        }
        if (i10 == kh0Var.s || i10 == kh0Var.L || i10 == kh0Var.S || i10 == kh0Var.P) {
            return 1;
        }
        if (i10 == kh0Var.v) {
            return 2;
        }
        if (i10 == kh0Var.x) {
            return 3;
        }
        if (i10 == kh0Var.w || i10 == kh0Var.J || i10 == kh0Var.M || i10 == kh0Var.R || i10 == kh0Var.T) {
            return 4;
        }
        if (i10 >= kh0Var.y && i10 < kh0Var.E) {
            return 5;
        }
        if (i10 >= kh0Var.H && i10 < kh0Var.I) {
            return 5;
        }
        if (i10 == kh0Var.F) {
            return 6;
        }
        if (i10 == kh0Var.K) {
            return 7;
        }
        if (i10 == kh0Var.N) {
            return 8;
        }
        if (i10 == kh0Var.O) {
            return 9;
        }
        if (i10 == kh0Var.Q) {
            return 10;
        }
        if (i10 < kh0Var.U || i10 >= kh0Var.V) {
            return i10 == kh0Var.G ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r15 == (r0.E - 1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        r14 = (org.telegram.ui.hh0) r14;
        r14.b(r1, r15 - r0.y);
        r14.H = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.I - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        kh0 kh0Var = this.d;
        ArrayList arrayList = kh0Var.i0;
        long j10 = kh0Var.f;
        long j11 = kh0Var.n;
        int i12 = b1Var.f;
        View view = b1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == kh0Var.s) {
                if (kh0Var.o0 && j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    l4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == kh0Var.L) {
                l4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == kh0Var.P) {
                l4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == kh0Var.S) {
                    l4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) view;
            q90Var.setCanEdit(j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (kh0Var.o0 && j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (kh0Var.d != null) {
                    q90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(kh0Var.c));
                    q90Var.d(0, null, false);
                    q90Var.b(true);
                    return;
                }
                return;
            }
            q90Var.b(!kh0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = kh0Var.e;
            if (tL_chatInviteExported2 != null) {
                q90Var.setLink(tL_chatInviteExported2.link);
                q90Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                q90Var.setLink(null);
                q90Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            g2Var.a.l(string, false);
            g2Var.b.setImageDrawable(zqVar);
            g2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    TLRPC.ChatFull chatFull = kh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = kh0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        d9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        d9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (i10 != kh0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) kh0Var.m0.get(i10 - kh0Var.U);
                        TLRPC.User user2 = (TLRPC.User) kh0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != kh0Var.V - 1) {
                            i11 = i13;
                            user = user2;
                            if (user == null) {
                                a5Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i13;
                            user = user2;
                        }
                    } else {
                        user = kh0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = kh0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.d9 d9Var2 = (org.telegram.ui.Cells.d9) view;
                    if (i10 == kh0Var.G) {
                        TLRPC.ChatFull chatFull2 = kh0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = kh0Var.getMessagesController().getChat(Long.valueOf(j11));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            d9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            d9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = kh0Var.y;
        if (i10 < i14 || i10 >= kh0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) kh0Var.j0.get(i10 - kh0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        kh0 kh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(this.c, kh0Var, null, true, kh0Var.h);
                q90Var.setPermanent(true);
                q90Var.setDelegate(new ih0(this, q90Var));
                view = q90Var;
                break;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.n2) kh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.g2(context, 64, d6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                view = new hh0(kh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(9);
                b10Var.w = false;
                view = b10Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                baVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
                view = baVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.d9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.a5(8, 6, this.c, null, false);
                break;
            case 11:
                d6Var2 = ((org.telegram.ui.ActionBar.n2) kh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.d9(context, d6Var2);
                break;
            default:
                FrameLayout dh0Var = new dh0(context);
                dh0Var.addView(new ch0(context), w7.z5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(kh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                dh0Var.addView(textView, w7.z5.a(-2.0f, 52.0f, 143.0f, 52.0f, 18.0f, -1, 51));
                dh0Var.setTag(-33024);
                view = dh0Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
