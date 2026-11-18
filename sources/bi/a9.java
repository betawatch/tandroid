package bi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.pb;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.q9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class a9 extends sa implements fs, t9 {
    public final boolean T1;
    public final int U1;
    public final long V1;
    public final boolean W1;
    public final boolean X1;
    public final TL_stars.StarGift Y1;
    public q9 Z1;
    public final ug.j a2;
    public final String b2;
    public final Runnable c2;
    public final t8 d2;
    public final LinearLayout e2;
    public final long f2;
    public final org.telegram.ui.Cells.u0 g2;
    public final TLRPC.MessageAction h2;
    public final fj i2;
    public final LinearLayout j2;
    public final hi.d k2;
    public final FrameLayout l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public final u8 p2;
    public z41 q2;
    public int r2;
    public final lq[] s2;
    public boolean t2;
    public final ui.c u2;

    public a9(Context context, int i7, final TL_stars.StarGift starGift, final ug.j jVar, long j3, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        int i10;
        float f10;
        long j10;
        Integer num;
        Integer num2;
        int w02;
        int i11;
        boolean z12;
        int i12;
        this.n2 = false;
        this.o2 = false;
        this.r2 = -2;
        this.s2 = new lq[1];
        this.t2 = false;
        boolean z13 = j3 == j10.i(i7).e();
        this.T1 = z13;
        this.N0 = 4;
        O();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-10.0f);
        if (z13) {
            this.m2 = true;
        }
        this.U1 = i7;
        this.V1 = j3;
        this.Y1 = starGift;
        if (starGift == null || !starGift.auction) {
            i10 = 4;
            f10 = 4.0f;
        } else {
            i10 = 4;
            f10 = 4.0f;
            this.Z1 = u9.c(i7).l(starGift.id, this);
        }
        this.a2 = jVar;
        this.c2 = runnable;
        this.W1 = z10;
        this.X1 = z11;
        if (z10) {
            this.n2 = true;
        } else if (z11) {
            this.n2 = false;
        }
        this.v1 = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.b2 = o10.l(mp.u1(i7).c2(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            this.b2 = O0 == null ? "" : O0.title;
        }
        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(context, this.J0, false);
        this.g2 = u0Var;
        u0Var.setDelegate(new s8());
        t8 t8Var = new t8(this, context);
        this.d2 = t8Var;
        Drawable e10 = hi.w5.e(null, i7, j3, org.telegram.ui.ActionBar.n6.I.q());
        t8Var.U(e10);
        ui.c cVar = new ui.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof bb0) {
                bb0 bb0Var = (bb0) e10;
                if (bb0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = bb0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        if (num != null) {
            w02 = num.intValue();
            num2 = num;
        } else {
            num2 = num;
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0);
        }
        cVar.a(w02);
        this.u2 = num2 == null ? cVar : null;
        fh.g gVar = new fh.g(cVar, cVar, cVar);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        int i13 = org.telegram.ui.ActionBar.n6.h5;
        gVar.p(new gh.b(i13, i6Var));
        gVar.r(org.telegram.messenger.g0.L(20.0f));
        gVar.q(org.telegram.messenger.g0.L(f10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.e2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.h2 = tL_messageActionStarGift;
            z12 = z13;
            i12 = i13;
        } else {
            boolean z14 = z13;
            i11 = 6;
            if (jVar == null || jVar.b == null) {
                z12 = z14;
                i12 = i13;
                if (jVar == null || jVar.a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = jVar.d();
                tL_messageActionGiftPremium.currency = jVar.a();
                long e11 = jVar.e();
                tL_messageActionGiftPremium.amount = e11;
                if (jVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium.currency) - 6) * e11);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.h2 = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = jVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = jVar.a();
                long e12 = jVar.e();
                tL_messageActionGiftCode.amount = e12;
                z12 = z14;
                if (jVar.h != null) {
                    i12 = i13;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode.currency) - 6) * e12);
                } else {
                    i12 = i13;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.h2 = tL_messageActionGiftCode;
            }
        }
        TLRPC.MessageAction messageAction = this.h2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.n2;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z15 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = mp.u1(i7).B1(j10.i(i7).e());
        tL_messageService.peer_id = mp.u1(i7).B1(j3);
        tL_messageService.action = this.h2;
        long P1 = starGift != null ? mp.u1(i7).P1(j3) : j10;
        this.f2 = P1;
        fj fjVar = new fj(i7, tL_messageService, false, false);
        this.i2 = fjVar;
        int i14 = 1;
        u0Var.j0(fjVar, true);
        linearLayout.addView(u0Var, ma.t(-1, -1, ks.E1, 0, P1 > j10 ? 0 : 8, 0, 8));
        t8Var.addView(linearLayout, ma.e(-1, -1, ks.E1));
        u8 u8Var = new u8(this, context, (au0) this.b, gd.M0(starGift != null ? 2131750104 : 2131750103, null), mp.u1(i7).G6, this.J0, gVar, i7);
        this.p2 = u8Var;
        org.telegram.ui.Cells.f3 f3Var = u8Var.b;
        f3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        f3Var.R = true;
        u8Var.setShowLimitWhenNear(50);
        this.L1 = f3Var;
        u8Var.setShowLimitOnFocus(true);
        u8Var.setDivider(false);
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(u8Var, i10);
        f3Var.getEditText().setImeOptions(i11);
        f3Var.getEditText().setOnEditorActionListener(new m.r2(fVar, i14));
        int i15 = this.u0;
        u8Var.setPadding(i15, 0, i15, 0);
        v8 v8Var = new v8();
        v8Var.C = false;
        v8Var.m = false;
        v8Var.n(350L);
        v8Var.o(lr.h);
        v8Var.D = 40L;
        this.o1.setItemAnimator(v8Var);
        this.q2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.j2 = linearLayout2;
        linearLayout2.setOrientation(1);
        int i16 = i12;
        ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(i16, this.J0));
        int i17 = this.u0;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i17, 0, i17, 0));
        int i18 = this.u0;
        linearLayout2.setPadding(i18, 0, i18, 0);
        this.b.addView(linearLayout2, ma.e(-1, -2, 87));
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.K5, view, this.J0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ma.z(-1.0f), ma.z(1.0f / org.telegram.messenger.g0.p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i19 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i20 = org.telegram.ui.ActionBar.n6.a7;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i20, this.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i20);
        org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var2);
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, ma.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.l2 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.l2 = frameLayout2;
            frameLayout2.addView(frameLayout, ma.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            org.telegram.ui.ActionBar.u6.h(i16, frameLayout2, this.J0);
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i21 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i21, this.J0);
        if (starGift != null) {
            textView.setText(gd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, ma.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        m10.setTextSize(1, 13.0f);
        m10.setGravity(21);
        m10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(m10, i21, this.J0);
        if (starGift != null) {
            m10.setText(gd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(m10, ma.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View w8Var = new w8(context, starGift, i19);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i22 = org.telegram.ui.ActionBar.n6.Fi;
        Drawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i22, this.J0));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i22);
        org.telegram.ui.ActionBar.i6 i6Var3 = this.J0;
        w8Var.setBackground(d03);
        org.telegram.ui.ActionBar.u6.j(w8Var, d03, M2, null, i6Var3);
        frameLayout.addView(w8Var, ma.e(-1, -1, ks.E1));
        x8 x8Var = new x8(context, i19);
        x8Var.setWillNotDraw(false);
        frameLayout.addView(x8Var, ma.e(-1, -1, ks.E1));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(gd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        x8Var.addView(textView2, ma.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(gd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        x8Var.addView(textView3, ma.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        hi.d dVar = new hi.d(context, this.J0, true);
        this.k2 = dVar;
        dVar.f();
        h1(false);
        linearLayout2.addView(dVar, ma.t(-1, 48, ks.E1, 10, 10, 10, 10));
        dVar.setOnClickListener(new a0(this, j3, context, runnable, starGift));
        jg.b0 b0Var = this.n1;
        this.K1 = true;
        b0Var.k1(true);
        this.q2.O(false);
        this.n1.h1(this.q2.E.size(), org.telegram.messenger.g0.L(200.0f));
        ck0 ck0Var = this.o1;
        int i23 = this.u0;
        ck0Var.setPadding(i23, 0, i23, org.telegram.messenger.g0.L(68 + ((starGift != null && starGift.limited && this.l2 == null) ? 40 : 0)));
        this.o1.i(new y8(this));
        this.o1.setOnItemClickListener(new oj0() { // from class: bi.r8
            @Override // org.telegram.ui.Components.oj0
            public final void c(int i24, View view2) {
                TL_stars.StarGift starGift2;
                a9 a9Var = a9.this;
                TL_stars.StarGift starGift3 = a9Var.Y1;
                boolean z16 = a9Var.T1;
                org.telegram.ui.Cells.u0 u0Var2 = a9Var.g2;
                TLRPC.MessageAction messageAction2 = a9Var.h2;
                fj fjVar2 = a9Var.i2;
                z41 z41Var = a9Var.q2;
                if (!a9Var.K1) {
                    i24--;
                }
                l41 G = z41Var.G(i24);
                if (G == null) {
                    return;
                }
                int i25 = G.d;
                if (i25 == 1) {
                    boolean z17 = !a9Var.m2;
                    a9Var.m2 = z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z17;
                    }
                    fjVar2.a6();
                    u0Var2.j0(fjVar2, true);
                    a9Var.q2.O(true);
                    return;
                }
                if (i25 == 2) {
                    if (z10 || z11) {
                        int i26 = -a9Var.r2;
                        a9Var.r2 = i26;
                        org.telegram.messenger.g0.E3(i26, view2, null);
                        return;
                    }
                    boolean z18 = a9Var.n2;
                    a9Var.n2 = !z18;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z18 || (z16 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z16 || z18) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z18 ? starGift3.convert_stars : 0L;
                    }
                    fjVar2.a6();
                    u0Var2.j0(fjVar2, true);
                    a9Var.q2.O(true);
                    a9Var.h1(true);
                    return;
                }
                if (i25 == 3) {
                    boolean z19 = a9Var.o2;
                    a9Var.o2 = !z19;
                    boolean z20 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    ug.j jVar2 = jVar;
                    if (z20) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z19) {
                            tL_messageActionGiftPremium2.currency = jVar2.a();
                            long e13 = jVar2.e();
                            tL_messageActionGiftPremium2.amount = e13;
                            if (jVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium2.currency) - 6) * e13);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = jVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z19) {
                            tL_messageActionGiftCode2.currency = jVar2.a();
                            long e14 = jVar2.e();
                            tL_messageActionGiftCode2.amount = e14;
                            if (jVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode2.currency) - 6) * e14);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = jVar2.g();
                        }
                    }
                    fjVar2.a6();
                    u0Var2.j0(fjVar2, true);
                    a9Var.q2.O(true);
                    a9Var.h1(true);
                }
            }
        });
        this.p1.setTitle(P0());
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.U1, 0, true, new m8(this, 0), this.J0);
        this.q2 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return gd.M0(this.T1 ? 2131749922 : 2131749928, null);
    }

    @Override // org.telegram.messenger.t9
    public final void c(q9 q9Var) {
        this.Z1 = q9Var;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.A3) {
            h1(true);
            z41 z41Var = this.q2;
            if (z41Var == null || this.a2 == null) {
                return;
            }
            z41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        u8 u8Var = this.p2;
        org.telegram.ui.Cells.f3 f3Var = u8Var.b;
        org.telegram.ui.Cells.f3 f3Var2 = u8Var.b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
            return;
        }
        if (f3Var2.w) {
            f3Var2.d();
            return;
        }
        f3Var2.r();
        if (this.Z1 != null) {
            u9.c(this.U1).n(this.Z1.b, this);
        }
        this.t2 = true;
        super.dismiss();
    }

    public final TLRPC.TL_textWithEntities e1() {
        if (mp.u1(this.U1).P1(this.V1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.h2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    public lc f1() {
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return lc.b0(T);
    }

    public final void g1(boolean z10) {
        int i7 = this.U1;
        mp u12 = mp.u1(i7);
        long j3 = this.V1;
        TLRPC.UserFull d2 = u12.d2(j3);
        TLObject g22 = mp.u1(i7).g2(j3);
        int i10 = 0;
        if (d2 != null && (g22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) g22;
            user.premium = true;
            mp.u1(i7).e4(user, true, false);
            ks.f(i7).k(ks.E0, Long.valueOf(user.id), d2);
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.s1;
        if (h2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) h2Var.getParentActivity()).M().getFragmentStack());
            org.telegram.ui.ActionBar.s4 parentLayout = h2Var.getParentLayout();
            int size = arrayList.size();
            bn bnVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj;
                if (h2Var2 instanceof bn) {
                    bnVar = (bn) h2Var2;
                    if (bnVar.a() != j3) {
                        h2Var2.removeSelfFromStack();
                    }
                } else if (h2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == h2Var2) {
                        h2Var2.finishFragment();
                    } else {
                        h2Var2.removeSelfFromStack();
                    }
                }
            }
            if (bnVar == null || bnVar.a() != j3) {
                ((ActionBarLayout) parentLayout).T(new bn(a8.p0.j(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void h1(boolean z10) {
        CharSequence charSequence;
        q9 q9Var = this.Z1;
        int i7 = this.U1;
        hi.d dVar = this.k2;
        if (q9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (this.Z1.g(currentTime)) {
                int i10 = this.Z1.d.auction_start_date - currentTime;
                dVar.i(gd.M0(2131750324, null), z10, true);
                dVar.g(gd.a0(null, null, 2131750319, gd.c0(i10)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Z1.f;
            if (tL_starGiftAuctionState == null) {
                dVar.i(gd.M0(2131750329, null), z10, true);
                dVar.g(null, z10);
                return;
            } else {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(gd.M0(2131750329, null), z10, true);
                dVar.g(gd.a0(null, null, 2131750305, gd.c0(i11)), z10);
                return;
            }
        }
        TL_stars.StarGift starGift = this.Y1;
        lq[] lqVarArr = this.s2;
        if (starGift != null) {
            long j3 = di.x8.y(i7, false).p().amount;
            long j10 = starGift.stars + (this.n2 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.p2.getText()) ? 0L : this.f2);
            dVar.i(pb.Z0(false, gd.H(',', this.T1 ? "Gift2SendSelf" : "Gift2Send", (int) j10), lqVarArr), z10, true);
            if (!di.x8.y(i7, false).e || j10 <= j3) {
                dVar.g(null, z10);
                return;
            } else {
                dVar.g(gd.H(',', "Gift2SendYourBalance", (int) j3), z10);
                return;
            }
        }
        ug.j jVar = this.a2;
        if (jVar != null) {
            if (this.o2) {
                dVar.i(pb.U0(gd.a0(null, null, 2131749978, gd.E(jVar.g(), ',')), 1.0f, lqVarArr), z10, true);
                lqVarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                dVar.i(new SpannableStringBuilder(gd.a0(null, null, 2131749979, jVar.c())), z10, true);
            }
            dVar.g(charSequence, z10);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.U1).c(this, ks.A3);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        u8 u8Var = this.p2;
        org.telegram.ui.Cells.f3 f3Var = u8Var.b;
        org.telegram.ui.Cells.f3 f3Var2 = u8Var.b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.w) {
            f3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.U1).n(this, ks.A3);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.j2;
            if (linearLayout != null) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i7 = this.u0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i7, 0, i7, 0));
                }
            }
            ui.c cVar = this.u2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        u8 u8Var = this.p2;
        if (u8Var != null) {
            u8Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void v() {
        this.o1.a0();
    }
}
