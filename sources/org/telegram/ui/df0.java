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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class df0 extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public final /* synthetic */ ef0 d;

    public df0(ef0 ef0Var, Context context) {
        this.d = ef0Var;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        ef0 ef0Var = this.d;
        if (ef0Var.Q == b10 || ef0Var.y == b10) {
            return true;
        }
        if (b10 >= ef0Var.D && b10 < ef0Var.E) {
            return true;
        }
        if ((b10 < ef0Var.H || b10 >= ef0Var.I) && b10 != ef0Var.N) {
            return b10 >= ef0Var.U && b10 < ef0Var.V;
        }
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.X;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ef0 ef0Var = this.d;
        if (i7 == ef0Var.r) {
            return 0;
        }
        if (i7 == ef0Var.s || i7 == ef0Var.L || i7 == ef0Var.S || i7 == ef0Var.P) {
            return 1;
        }
        if (i7 == ef0Var.w) {
            return 2;
        }
        if (i7 == ef0Var.y) {
            return 3;
        }
        if (i7 == ef0Var.x || i7 == ef0Var.J || i7 == ef0Var.M || i7 == ef0Var.R || i7 == ef0Var.T) {
            return 4;
        }
        if (i7 >= ef0Var.D && i7 < ef0Var.E) {
            return 5;
        }
        if (i7 >= ef0Var.H && i7 < ef0Var.I) {
            return 5;
        }
        if (i7 == ef0Var.F) {
            return 6;
        }
        if (i7 == ef0Var.K) {
            return 7;
        }
        if (i7 == ef0Var.N) {
            return 8;
        }
        if (i7 == ef0Var.O) {
            return 9;
        }
        if (i7 == ef0Var.Q) {
            return 10;
        }
        if (i7 < ef0Var.U || i7 >= ef0Var.V) {
            return i7 == ef0Var.G ? 11 : 1;
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
    
        r14 = (org.telegram.ui.bf0) r14;
        r14.b(r1, r15 - r0.D);
        r14.H = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
    
        if (r15 == (r0.I - 1)) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        TLRPC.User user;
        ef0 ef0Var = this.d;
        ArrayList arrayList = ef0Var.i0;
        long j3 = ef0Var.f;
        long j10 = ef0Var.n;
        int i11 = d1Var.f;
        View view = d1Var.a;
        boolean z9 = true;
        if (i11 == 1) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == ef0Var.s) {
                if (ef0Var.o0 && j3 == org.telegram.messenger.p10.i(ef0Var.getAccountInstance().a).n) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746591, null));
                    return;
                } else if (j3 == org.telegram.messenger.p10.i(ef0Var.getAccountInstance().a).n) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131752403, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.id.M0(2131747320, null));
                    return;
                }
            }
            if (i7 == ef0Var.L) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746013, null));
                return;
            } else if (i7 == ef0Var.P) {
                n4Var.setText(org.telegram.messenger.id.M0(2131748880, null));
                return;
            } else {
                if (i7 == ef0Var.S) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131748881, null));
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Components.r70 r70Var = (org.telegram.ui.Components.r70) view;
            r70Var.setCanEdit(j3 == org.telegram.messenger.p10.i(ef0Var.getAccountInstance().a).n);
            if (ef0Var.o0 && j3 == org.telegram.messenger.p10.i(ef0Var.getAccountInstance().a).n) {
                if (ef0Var.d != null) {
                    r70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(ef0Var.c, false));
                    r70Var.d(0, null, false);
                    r70Var.b(true);
                    return;
                }
                return;
            }
            r70Var.b(!ef0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ef0Var.e;
            if (tL_chatInviteExported2 != null) {
                r70Var.setLink(tL_chatInviteExported2.link);
                r70Var.c(tL_chatInviteExported2, j10);
                return;
            } else {
                r70Var.setLink(null);
                r70Var.d(0, null, false);
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.l6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.s6.x(i2Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.s6.x(i2Var, drawable2, org.telegram.ui.ActionBar.l6.k7, null, mode);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            String M0 = org.telegram.messenger.id.M0(2131751713, null);
            boolean z10 = !arrayList.isEmpty();
            i2Var.a.l(M0, false);
            i2Var.b.setImageDrawable(xpVar);
            i2Var.c = z10;
            return;
        }
        if (i11 != 5) {
            switch (i11) {
                case 9:
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    TLRPC.ChatFull N0 = ef0Var.getMessagesController().N0(j10);
                    TLRPC.Chat M02 = ef0Var.getMessagesController().M0(Long.valueOf(j10));
                    if (N0 == null || !N0.paid_media_allowed || !org.telegram.messenger.t3.V(M02)) {
                        z8Var.setText(org.telegram.messenger.id.M0(2131752384, null));
                        break;
                    } else {
                        z8Var.setText(org.telegram.messenger.id.M0(2131752383, null));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (i7 != ef0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ef0Var.m0.get(i7 - ef0Var.U);
                        TLRPC.User user2 = (TLRPC.User) ef0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i7 != ef0Var.V - 1) {
                            i10 = i13;
                            user = user2;
                            if (user == null) {
                                a5Var.c(user, org.telegram.messenger.g5.m(0, user.first_name, user.last_name), org.telegram.messenger.id.G(i10, "InviteLinkCount", new Object[0]), z9);
                                break;
                            }
                        } else {
                            i10 = i13;
                            user = user2;
                        }
                    } else {
                        user = ef0Var.getMessagesController().a2(Long.valueOf(j3));
                        i10 = ef0Var.f0;
                    }
                    z9 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
                    if (i7 == ef0Var.G) {
                        TLRPC.ChatFull N02 = ef0Var.getMessagesController().N0(j10);
                        TLRPC.Chat M03 = ef0Var.getMessagesController().M0(Long.valueOf(j10));
                        if (N02 == null || !N02.paid_media_allowed || !org.telegram.messenger.t3.V(M03)) {
                            z8Var2.setText(org.telegram.messenger.id.M0(2131752384, null));
                            break;
                        } else {
                            z8Var2.setText(org.telegram.messenger.id.M0(2131752383, null));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = ef0Var.D;
        if (i7 < i14 || i7 >= ef0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ef0Var.j0.get(i7 - ef0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i7 - i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.mz mzVar;
        org.telegram.ui.ActionBar.g6 g6Var2;
        ef0 ef0Var = this.d;
        Context context = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(this.c, ef0Var, null, true, ef0Var.h);
                r70Var.setPermanent(true);
                r70Var.setDelegate(new cf0(this, r70Var));
                view = r70Var;
                break;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.f2) ef0Var).resourceProvider;
                view = new org.telegram.ui.Cells.i2(64, context, g6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                view = new bf0(ef0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.mz mzVar2 = new org.telegram.ui.Components.mz(context, null);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(9);
                mzVar2.x = false;
                mzVar = mzVar2;
                view = mzVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                w9Var.b(org.telegram.messenger.id.M0(2131751575, null), false);
                org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.p7, null);
                mzVar = w9Var;
                view = mzVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.a5(this.c, 8, 6, false, null);
                break;
            case 11:
                g6Var2 = ((org.telegram.ui.ActionBar.f2) ef0Var).resourceProvider;
                view = new org.telegram.ui.Cells.z8(context, g6Var2);
                break;
            default:
                FrameLayout b4Var = new di.b4(context, 27);
                b4Var.addView(new xe0(context), c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(org.telegram.messenger.id.M0(ef0Var.h ? 2131746870 : 2131746871, null));
                b4Var.addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                b4Var.setTag(-33024);
                view = b4Var;
                break;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
