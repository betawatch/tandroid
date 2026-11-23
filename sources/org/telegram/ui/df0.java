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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class df0 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ ef0 d;

    public df0(ef0 ef0Var, Context context) {
        this.d = ef0Var;
        this.c = context;
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        ef0 ef0Var = this.d;
        if (ef0Var.R == b10 || ef0Var.y == b10) {
            return true;
        }
        if (b10 >= ef0Var.E && b10 < ef0Var.F) {
            return true;
        }
        if ((b10 < ef0Var.I || b10 >= ef0Var.J) && b10 != ef0Var.O) {
            return b10 >= ef0Var.V && b10 < ef0Var.W;
        }
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.Y;
    }

    @Override // v4.i0
    public final int d(int i7) {
        ef0 ef0Var = this.d;
        if (i7 == ef0Var.r) {
            return 0;
        }
        if (i7 == ef0Var.s || i7 == ef0Var.M || i7 == ef0Var.T || i7 == ef0Var.Q) {
            return 1;
        }
        if (i7 == ef0Var.w) {
            return 2;
        }
        if (i7 == ef0Var.y) {
            return 3;
        }
        if (i7 == ef0Var.x || i7 == ef0Var.K || i7 == ef0Var.N || i7 == ef0Var.S || i7 == ef0Var.U) {
            return 4;
        }
        if (i7 >= ef0Var.E && i7 < ef0Var.F) {
            return 5;
        }
        if (i7 >= ef0Var.I && i7 < ef0Var.J) {
            return 5;
        }
        if (i7 == ef0Var.G) {
            return 6;
        }
        if (i7 == ef0Var.L) {
            return 7;
        }
        if (i7 == ef0Var.O) {
            return 8;
        }
        if (i7 == ef0Var.P) {
            return 9;
        }
        if (i7 == ef0Var.R) {
            return 10;
        }
        if (i7 < ef0Var.V || i7 >= ef0Var.W) {
            return i7 == ef0Var.H ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r15 == (r0.F - 1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        r14 = (org.telegram.ui.bf0) r14;
        r14.b(r1, r15 - r0.E);
        r14.I = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
    
        if (r15 == (r0.J - 1)) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        TLRPC.User user;
        ef0 ef0Var = this.d;
        ArrayList arrayList = ef0Var.j0;
        long j3 = ef0Var.f;
        long j10 = ef0Var.n;
        int i11 = f1Var.f;
        View view = f1Var.a;
        boolean z10 = true;
        if (i11 == 1) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (i7 == ef0Var.s) {
                if (ef0Var.p0 && j3 == org.telegram.messenger.i10.i(ef0Var.getAccountInstance().a).n) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131746395, null));
                    return;
                } else if (j3 == org.telegram.messenger.i10.i(ef0Var.getAccountInstance().a).n) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131752391, null));
                    return;
                } else {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131747126, null));
                    return;
                }
            }
            if (i7 == ef0Var.M) {
                o4Var.setText(org.telegram.messenger.gd.N0(2131745817, null));
                return;
            } else if (i7 == ef0Var.Q) {
                o4Var.setText(org.telegram.messenger.gd.N0(2131748687, null));
                return;
            } else {
                if (i7 == ef0Var.T) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131748688, null));
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Components.d80 d80Var = (org.telegram.ui.Components.d80) view;
            d80Var.setCanEdit(j3 == org.telegram.messenger.i10.i(ef0Var.getAccountInstance().a).n);
            if (ef0Var.p0 && j3 == org.telegram.messenger.i10.i(ef0Var.getAccountInstance().a).n) {
                if (ef0Var.d != null) {
                    d80Var.setLink("https://t.me/" + org.telegram.messenger.v3.K(ef0Var.c, false));
                    d80Var.d(0, null, false);
                    d80Var.b(true);
                    return;
                }
                return;
            }
            d80Var.b(!ef0Var.q0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ef0Var.e;
            if (tL_chatInviteExported2 != null) {
                d80Var.setLink(tL_chatInviteExported2.link);
                d80Var.c(tL_chatInviteExported2, j10);
                return;
            } else {
                d80Var.setLink(null);
                d80Var.d(0, null, false);
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.n6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(j2Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.u6.x(j2Var, drawable2, org.telegram.ui.ActionBar.n6.k7, null, mode);
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(drawable, drawable2);
            String N0 = org.telegram.messenger.gd.N0(2131751701, null);
            boolean z11 = !arrayList.isEmpty();
            j2Var.a.l(N0, false);
            j2Var.b.setImageDrawable(lqVar);
            j2Var.c = z11;
            return;
        }
        if (i11 != 5) {
            switch (i11) {
                case 9:
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    TLRPC.ChatFull P0 = ef0Var.getMessagesController().P0(j10);
                    TLRPC.Chat O0 = ef0Var.getMessagesController().O0(Long.valueOf(j10));
                    if (P0 == null || !P0.paid_media_allowed || !org.telegram.messenger.v3.V(O0)) {
                        z8Var.setText(org.telegram.messenger.gd.N0(2131752372, null));
                        break;
                    } else {
                        z8Var.setText(org.telegram.messenger.gd.N0(2131752371, null));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (i7 != ef0Var.R) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ef0Var.n0.get(i7 - ef0Var.V);
                        TLRPC.User user2 = (TLRPC.User) ef0Var.l0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i7 != ef0Var.W - 1) {
                            i10 = i13;
                            user = user2;
                            if (user == null) {
                                b5Var.c(user, org.telegram.messenger.i5.m(0, user.first_name, user.last_name), org.telegram.messenger.gd.G(i10, "InviteLinkCount", new Object[0]), z10);
                                break;
                            }
                        } else {
                            i10 = i13;
                            user = user2;
                        }
                    } else {
                        user = ef0Var.getMessagesController().c2(Long.valueOf(j3));
                        i10 = ef0Var.g0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
                    if (i7 == ef0Var.H) {
                        TLRPC.ChatFull P02 = ef0Var.getMessagesController().P0(j10);
                        TLRPC.Chat O02 = ef0Var.getMessagesController().O0(Long.valueOf(j10));
                        if (P02 == null || !P02.paid_media_allowed || !org.telegram.messenger.v3.V(O02)) {
                            z8Var2.setText(org.telegram.messenger.gd.N0(2131752372, null));
                            break;
                        } else {
                            z8Var2.setText(org.telegram.messenger.gd.N0(2131752371, null));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = ef0Var.E;
        if (i7 < i14 || i7 >= ef0Var.F) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ef0Var.k0.get(i7 - ef0Var.I);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i7 - i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.vz vzVar;
        org.telegram.ui.ActionBar.i6 i6Var2;
        ef0 ef0Var = this.d;
        Context context = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.o4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80(this.c, ef0Var, null, true, ef0Var.h);
                d80Var.setPermanent(true);
                d80Var.setDelegate(new cf0(this, d80Var));
                view = d80Var;
                break;
            case 3:
                i6Var = ((org.telegram.ui.ActionBar.g2) ef0Var).resourceProvider;
                view = new org.telegram.ui.Cells.j2(64, context, i6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 5:
                view = new bf0(ef0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.vz vzVar2 = new org.telegram.ui.Components.vz(context, null);
                vzVar2.setIsSingleCell(true);
                vzVar2.setViewType(9);
                vzVar2.x = false;
                vzVar = vzVar2;
                view = vzVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                w9Var.b(org.telegram.messenger.gd.N0(2131751563, null), false);
                org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.p7, null);
                vzVar = w9Var;
                view = vzVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.b5(this.c, 8, 6, false, null);
                break;
            case 11:
                i6Var2 = ((org.telegram.ui.ActionBar.g2) ef0Var).resourceProvider;
                view = new org.telegram.ui.Cells.z8(context, i6Var2);
                break;
            default:
                FrameLayout v2Var = new bi.v2(context, 29);
                v2Var.addView(new xe0(context), c8.na.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(org.telegram.messenger.gd.N0(ef0Var.h ? 2131746676 : 2131746677, null));
                v2Var.addView(textView, c8.na.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                v2Var.setTag(-33024);
                view = v2Var;
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
