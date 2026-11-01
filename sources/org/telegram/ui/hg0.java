package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hg0 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final /* synthetic */ ig0 d;

    public hg0(ig0 ig0Var, Context context) {
        this.d = ig0Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ig0 ig0Var = this.d;
        if (ig0Var.Q == b10 || ig0Var.y == b10) {
            return true;
        }
        if (b10 >= ig0Var.D && b10 < ig0Var.E) {
            return true;
        }
        if ((b10 < ig0Var.H || b10 >= ig0Var.I) && b10 != ig0Var.N) {
            return b10 >= ig0Var.U && b10 < ig0Var.V;
        }
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.X;
    }

    @Override // s4.g0
    public final int d(int i10) {
        ig0 ig0Var = this.d;
        if (i10 == ig0Var.r) {
            return 0;
        }
        if (i10 == ig0Var.s || i10 == ig0Var.L || i10 == ig0Var.S || i10 == ig0Var.P) {
            return 1;
        }
        if (i10 == ig0Var.w) {
            return 2;
        }
        if (i10 == ig0Var.y) {
            return 3;
        }
        if (i10 == ig0Var.x || i10 == ig0Var.J || i10 == ig0Var.M || i10 == ig0Var.R || i10 == ig0Var.T) {
            return 4;
        }
        if (i10 >= ig0Var.D && i10 < ig0Var.E) {
            return 5;
        }
        if (i10 >= ig0Var.H && i10 < ig0Var.I) {
            return 5;
        }
        if (i10 == ig0Var.F) {
            return 6;
        }
        if (i10 == ig0Var.K) {
            return 7;
        }
        if (i10 == ig0Var.N) {
            return 8;
        }
        if (i10 == ig0Var.O) {
            return 9;
        }
        if (i10 == ig0Var.Q) {
            return 10;
        }
        if (i10 < ig0Var.U || i10 >= ig0Var.V) {
            return i10 == ig0Var.G ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r15 == (r0.E - 1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        r14 = (org.telegram.ui.fg0) r14;
        r14.b(r1, r15 - r0.D);
        r14.H = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
    
        if (r15 == (r0.I - 1)) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        ig0 ig0Var = this.d;
        ArrayList arrayList = ig0Var.i0;
        long j10 = ig0Var.f;
        long j11 = ig0Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (i10 == ig0Var.s) {
                if (ig0Var.o0 && j10 == org.telegram.messenger.e20.i(ig0Var.getAccountInstance().a).n) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131746606, null));
                    return;
                } else if (j10 == org.telegram.messenger.e20.i(ig0Var.getAccountInstance().a).n) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131752403, null));
                    return;
                } else {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131747336, null));
                    return;
                }
            }
            if (i10 == ig0Var.L) {
                p4Var.setText(org.telegram.messenger.dd.L0(2131746030, null));
                return;
            } else if (i10 == ig0Var.P) {
                p4Var.setText(org.telegram.messenger.dd.L0(2131748890, null));
                return;
            } else {
                if (i10 == ig0Var.S) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131748891, null));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) view;
            j80Var.setCanEdit(j10 == org.telegram.messenger.e20.i(ig0Var.getAccountInstance().a).n);
            if (ig0Var.o0 && j10 == org.telegram.messenger.e20.i(ig0Var.getAccountInstance().a).n) {
                if (ig0Var.d != null) {
                    j80Var.setLink("https://t.me/" + org.telegram.messenger.w3.K(ig0Var.c, false));
                    j80Var.d(0, null, false);
                    j80Var.b(true);
                    return;
                }
                return;
            }
            j80Var.b(!ig0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ig0Var.e;
            if (tL_chatInviteExported2 != null) {
                j80Var.setLink(tL_chatInviteExported2.link);
                j80Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                j80Var.setLink(null);
                j80Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i13 = org.telegram.ui.ActionBar.t6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.y(i2Var, drawable, i13, null, mode);
            org.telegram.ui.ActionBar.a7.y(i2Var, drawable2, org.telegram.ui.ActionBar.t6.k7, null, mode);
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(drawable, drawable2);
            String L0 = org.telegram.messenger.dd.L0(2131751714, null);
            boolean z11 = !arrayList.isEmpty();
            i2Var.a.l(L0, false);
            i2Var.b.setImageDrawable(eqVar);
            i2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    TLRPC.ChatFull M0 = ig0Var.getMessagesController().M0(j11);
                    TLRPC.Chat L02 = ig0Var.getMessagesController().L0(Long.valueOf(j11));
                    if (M0 == null || !M0.paid_media_allowed || !org.telegram.messenger.w3.V(L02)) {
                        b9Var.setText(org.telegram.messenger.dd.L0(2131752384, null));
                        break;
                    } else {
                        b9Var.setText(org.telegram.messenger.dd.L0(2131752383, null));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
                    if (i10 != ig0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ig0Var.m0.get(i10 - ig0Var.U);
                        TLRPC.User user2 = (TLRPC.User) ig0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i14 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != ig0Var.V - 1) {
                            i11 = i14;
                            user = user2;
                            if (user == null) {
                                e5Var.c(user, org.telegram.messenger.i5.m(0, user.first_name, user.last_name), org.telegram.messenger.dd.G(i11, "InviteLinkCount", new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i14;
                            user = user2;
                        }
                    } else {
                        user = ig0Var.getMessagesController().Z1(Long.valueOf(j10));
                        i11 = ig0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.b9 b9Var2 = (org.telegram.ui.Cells.b9) view;
                    if (i10 == ig0Var.G) {
                        TLRPC.ChatFull M02 = ig0Var.getMessagesController().M0(j11);
                        TLRPC.Chat L03 = ig0Var.getMessagesController().L0(Long.valueOf(j11));
                        if (M02 == null || !M02.paid_media_allowed || !org.telegram.messenger.w3.V(L03)) {
                            b9Var2.setText(org.telegram.messenger.dd.L0(2131752384, null));
                            break;
                        } else {
                            b9Var2.setText(org.telegram.messenger.dd.L0(2131752383, null));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i15 = ig0Var.D;
        if (i10 < i15 || i10 >= ig0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ig0Var.j0.get(i10 - ig0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i15);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        ig0 ig0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.p4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(this.c, ig0Var, null, true, ig0Var.h);
                j80Var.setPermanent(true);
                j80Var.setDelegate(new gg0(this, j80Var));
                view = j80Var;
                break;
            case 3:
                p6Var = ((org.telegram.ui.ActionBar.k2) ig0Var).resourceProvider;
                view = new org.telegram.ui.Cells.i2(64, context, p6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                view = new fg0(ig0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(9);
                zzVar.x = false;
                view = zzVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.b(org.telegram.messenger.dd.L0(2131751576, null), false);
                org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.p7, null);
                view = x9Var;
                break;
            case 9:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.e5(8, 6, this.c, null, false);
                break;
            case 11:
                p6Var2 = ((org.telegram.ui.ActionBar.k2) ig0Var).resourceProvider;
                view = new org.telegram.ui.Cells.b9(context, p6Var2);
                break;
            default:
                FrameLayout bg0Var = new bg0(context, 0);
                bg0Var.addView(new ag0(context), w7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(org.telegram.messenger.dd.L0(ig0Var.h ? 2131746885 : 2131746886, null));
                bg0Var.addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                bg0Var.setTag(-33024);
                view = bg0Var;
                break;
        }
        return sc.e.o(view, view, -1, -2);
    }
}
