// default package

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
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class h1a extends fy0 implements gk7, jt4 {
    public final boolean S1;
    public final int T1;
    public final long U1;
    public final boolean V1;
    public final boolean W1;
    public final TL_stars.StarGift X1;
    public gt4 Y1;
    public final mu4 Z1;
    public final String a2;
    public final Runnable b2;
    public final b1a c2;
    public final LinearLayout d2;
    public final long e2;
    public final uk1 f2;
    public final TLRPC.MessageAction g2;
    public final k27 h2;
    public final LinearLayout i2;
    public final u41 j2;
    public final FrameLayout k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public final c1a o2;
    public l5c p2;
    public int q2;
    public final cm2[] r2;
    public boolean s2;
    public final ix4 t2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h1a(Context context, int i, final TL_stars.StarGift starGift, final mu4 mu4Var, long j, Runnable runnable, final boolean z, final boolean z2) {
        super(context, null, true, false, 2, null);
        float f;
        long j2;
        Integer num;
        Integer num2;
        int v0;
        int i2;
        boolean z3;
        int i3;
        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium;
        int i4;
        this.m2 = false;
        this.n2 = false;
        this.q2 = -2;
        this.r2 = new cm2[1];
        this.s2 = false;
        boolean z4 = j == y6c.h(i).e();
        this.S1 = z4;
        this.N0 = (byte) 4;
        K();
        this.C1 = gl.L(4.0f);
        this.D1 = gl.L(-10.0f);
        if (z4) {
            this.l2 = true;
        }
        this.T1 = i;
        this.U1 = j;
        this.X1 = starGift;
        if (starGift == null || !starGift.auction) {
            f = 4.0f;
        } else {
            f = 4.0f;
            this.Y1 = kt4.c(i).l(starGift.id, this);
        }
        this.Z1 = mu4Var;
        this.b2 = runnable;
        this.V1 = z;
        this.W1 = z2;
        if (z) {
            this.m2 = true;
        } else if (z2) {
            this.m2 = false;
        }
        this.u1 = 0.2f;
        if (j >= 0) {
            j2 = 0;
            this.a2 = l7c.l(na7.q1(i).V1(Long.valueOf(j)));
        } else {
            j2 = 0;
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            this.a2 = K0 == null ? "" : K0.title;
        }
        uk1 uk1Var = new uk1(this.J0, context, false);
        this.f2 = uk1Var;
        uk1Var.setDelegate(new a1a());
        b1a b1aVar = new b1a(this, context);
        this.c2 = b1aVar;
        Drawable d = zi8.d(null, i, j, bkb.I.o());
        b1aVar.U(d);
        ix4 ix4Var = new ix4();
        if (d instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) d).getColor());
        } else {
            if (d instanceof ye7) {
                ye7 ye7Var = (ye7) d;
                if (ye7Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = ye7Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        if (num != null) {
            v0 = num.intValue();
            num2 = num;
        } else {
            num2 = num;
            v0 = bkb.v0(bkb.g5, this.J0);
        }
        ix4Var.a(v0);
        this.t2 = num2 == null ? ix4Var : null;
        il0 il0Var = new il0(ix4Var, ix4Var, ix4Var);
        wjb wjbVar = this.J0;
        int i5 = bkb.g5;
        il0Var.p(new bl0(i5, wjbVar));
        il0Var.r(gl.L(20.0f));
        il0Var.q(gl.L(f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift == null) {
            boolean z5 = z4;
            i2 = 6;
            if (mu4Var != null) {
                if (mu4Var.b != null) {
                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                    tL_messageActionGiftCode.unclaimed = true;
                    tL_messageActionGiftCode.via_giveaway = false;
                    tL_messageActionGiftCode.months = mu4Var.d();
                    tL_messageActionGiftCode.flags |= 4;
                    tL_messageActionGiftCode.currency = mu4Var.a();
                    long e = mu4Var.e();
                    tL_messageActionGiftCode.amount = e;
                    z3 = z5;
                    if (mu4Var.h != null) {
                        i3 = i5;
                        tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftCode.currency) - 6) * e);
                    } else {
                        i3 = i5;
                    }
                    tL_messageActionGiftCode.flags |= 16;
                    tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                    this.g2 = tL_messageActionGiftCode;
                    tL_messageActionGiftPremium = tL_messageActionGiftCode;
                } else {
                    z3 = z5;
                    i3 = i5;
                    if (mu4Var.a != null) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = new TLRPC.TL_messageActionGiftPremium();
                        tL_messageActionGiftPremium2.months = mu4Var.d();
                        tL_messageActionGiftPremium2.currency = mu4Var.a();
                        long e2 = mu4Var.e();
                        tL_messageActionGiftPremium2.amount = e2;
                        if (mu4Var.h != null) {
                            tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftPremium2.currency) - 6) * e2);
                        }
                        tL_messageActionGiftPremium2.flags |= 2;
                        tL_messageActionGiftPremium2.message = new TLRPC.TL_textWithEntities();
                        this.g2 = tL_messageActionGiftPremium2;
                        tL_messageActionGiftPremium = tL_messageActionGiftPremium2;
                    }
                }
            }
            wn4.j("SendGiftSheet with no star gift and no premium tier");
            throw null;
        }
        i2 = 6;
        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
        tL_messageActionStarGift.gift = starGift;
        tL_messageActionStarGift.flags |= 2;
        tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
        tL_messageActionStarGift.convert_stars = starGift.convert_stars;
        tL_messageActionStarGift.forceIn = true;
        this.g2 = tL_messageActionStarGift;
        z3 = z4;
        i3 = i5;
        tL_messageActionGiftPremium = tL_messageActionStarGift;
        if (tL_messageActionGiftPremium instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) tL_messageActionGiftPremium;
            boolean z6 = this.m2;
            tL_messageActionStarGift2.can_upgrade = z6 || (z3 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (z3 || !z6) ? j2 : starGift.upgrade_stars;
            tL_messageActionStarGift2.convert_stars = z6 ? j2 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j;
        tL_messageService.from_id = na7.q1(i).w1(y6c.h(i).e());
        tL_messageService.peer_id = na7.q1(i).w1(j);
        tL_messageService.action = tL_messageActionGiftPremium;
        long K1 = starGift != null ? na7.q1(i).K1(j) : j2;
        this.e2 = K1;
        k27 k27Var = new k27(i, tL_messageService, false, false);
        this.h2 = k27Var;
        byte b = 1;
        uk1Var.j0(k27Var, true);
        linearLayout.addView(uk1Var, nme.t(-1, -1, kk7.D1, 0, K1 > j2 ? 0 : 8, 0, 8));
        b1aVar.addView(linearLayout, nme.e(-1, -1, kk7.D1));
        c1a c1aVar = new c1a(this, context, (cja) this.b, k96.M0(starGift != null ? 2131750104 : 2131750103, null), na7.q1(i).k4.E1.f(), this.J0, il0Var, i);
        this.o2 = c1aVar;
        ts3 ts3Var = c1aVar.b;
        ts3Var.getEditText().addTextChangedListener(new fi());
        ts3Var.R = true;
        c1aVar.setShowLimitWhenNear(50);
        this.K1 = ts3Var;
        c1aVar.setShowLimitOnFocus(true);
        c1aVar.setDivider(false);
        li3 li3Var = new li3(c1aVar, (byte) 13);
        ts3Var.getEditText().setImeOptions(i2);
        ts3Var.getEditText().setOnEditorActionListener(new gx1(li3Var, b));
        int i6 = this.u0;
        c1aVar.setPadding(i6, 0, i6, 0);
        d1a d1aVar = new d1a();
        d1aVar.C = false;
        d1aVar.m = false;
        d1aVar.n(350L);
        d1aVar.o(s33.h);
        d1aVar.D = (byte) 40;
        this.n1.setItemAnimator(d1aVar);
        this.p2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i2 = linearLayout2;
        linearLayout2.setOrientation(1);
        int i7 = i3;
        ColorDrawable colorDrawable = new ColorDrawable(bkb.v0(i7, this.J0));
        int i8 = this.u0;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i8, 0, i8, 0));
        int i9 = this.u0;
        linearLayout2.setPadding(i9, 0, i9, 0);
        this.b.addView(linearLayout2, nme.e(-1, -2, 87));
        View view = new View(context);
        zkb.h(bkb.J5, this.J0, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(nme.z(-1.0f), nme.z(1.0f / gl.p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i10 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gl.L(6.0f);
        int i11 = bkb.Z6;
        Drawable b0 = bkb.b0(L, bkb.v0(i11, this.J0));
        vkb M = zkb.M(i11);
        wjb wjbVar2 = this.J0;
        frameLayout.setBackground(b0);
        zkb.j(frameLayout, b0, M, null, wjbVar2);
        if (starGift != null) {
            if (starGift.auction) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.k2 = frameLayout2;
                frameLayout2.addView(frameLayout, nme.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
                zkb.h(i7, this.J0, frameLayout2);
                TextView textView = new TextView(context);
                textView.setTextSize(1, 13.0f);
                textView.setGravity(19);
                textView.setTypeface(gl.o());
                int i12 = bkb.F6;
                zkb.X(textView, i12, this.J0);
                if (starGift != null) {
                    textView.setText(k96.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
                }
                TextView l = ug8.l(frameLayout, textView, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
                l.setTextSize(1, 13.0f);
                l.setGravity(21);
                l.setTypeface(gl.o());
                zkb.X(l, i12, this.J0);
                if (starGift != null) {
                    l.setText(k96.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
                }
                frameLayout.addView(l, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                View e1aVar = new e1a(context, starGift, i10);
                int L2 = gl.L(6.0f);
                int i13 = bkb.Ei;
                Drawable b02 = bkb.b0(L2, bkb.v0(i13, this.J0));
                vkb M2 = zkb.M(i13);
                wjb wjbVar3 = this.J0;
                e1aVar.setBackground(b02);
                zkb.j(e1aVar, b02, M2, null, wjbVar3);
                frameLayout.addView(e1aVar, nme.e(-1, -1, kk7.D1));
                f1a f1aVar = new f1a(context, i10);
                f1aVar.setWillNotDraw(false);
                frameLayout.addView(f1aVar, nme.e(-1, -1, kk7.D1));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 13.0f);
                textView2.setGravity(19);
                textView2.setTypeface(gl.o());
                textView2.setTextColor(-1);
                if (starGift != null) {
                    textView2.setText(k96.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
                }
                f1aVar.addView(textView2, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 13.0f);
                textView3.setGravity(21);
                textView3.setTypeface(gl.o());
                textView3.setTextColor(-1);
                if (starGift != null) {
                    textView3.setText(k96.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
                }
                f1aVar.addView(textView3, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                u41 u41Var = new u41(this.J0, context, true);
                this.j2 = u41Var;
                u41Var.f();
                b1(false);
                linearLayout2.addView(u41Var, nme.t(-1, 48, kk7.D1, 10, 10, 10, 10));
                u41Var.setOnClickListener(new zy(this, j, context, runnable, starGift, (byte) 3));
                zr zrVar = this.m1;
                this.J1 = true;
                zrVar.j1(true);
                this.p2.O(false);
                this.m1.g1(this.p2.E.size(), gl.L(200.0f));
                o39 o39Var = this.n1;
                int i14 = this.u0;
                o39Var.setPadding(i14, 0, i14, gl.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
                this.n1.i(new g1a(this));
                this.n1.setOnItemClickListener(new c39() { // from class: z0a
                    @Override // c39
                    public final void d(int i15, View view2) {
                        TL_stars.StarGift starGift2;
                        h1a h1aVar = h1a.this;
                        TL_stars.StarGift starGift3 = h1aVar.X1;
                        boolean z7 = h1aVar.S1;
                        uk1 uk1Var2 = h1aVar.f2;
                        TLRPC.MessageAction messageAction = h1aVar.g2;
                        k27 k27Var2 = h1aVar.h2;
                        l5c l5cVar = h1aVar.p2;
                        if (!h1aVar.J1) {
                            i15--;
                        }
                        c4c G = l5cVar.G(i15);
                        if (G != null) {
                            int i16 = G.d;
                            if (i16 == 1) {
                                boolean z8 = !h1aVar.l2;
                                h1aVar.l2 = z8;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                                }
                                k27Var2.Z5();
                                uk1Var2.j0(k27Var2, true);
                                h1aVar.p2.O(true);
                                return;
                            }
                            if (i16 == 2) {
                                if (z || z2) {
                                    int i17 = -h1aVar.q2;
                                    h1aVar.q2 = i17;
                                    gl.A3(i17, view2, null);
                                    return;
                                }
                                boolean z9 = h1aVar.m2;
                                h1aVar.m2 = !z9;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                                    tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                                    tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                                    tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                                }
                                k27Var2.Z5();
                                uk1Var2.j0(k27Var2, true);
                                h1aVar.p2.O(true);
                                h1aVar.b1(true);
                                return;
                            }
                            if (i16 == 3) {
                                boolean z10 = h1aVar.n2;
                                h1aVar.n2 = !z10;
                                boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                                mu4 mu4Var2 = mu4Var;
                                if (z11) {
                                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftPremium3.currency = mu4Var2.a();
                                        long e3 = mu4Var2.e();
                                        tL_messageActionGiftPremium3.amount = e3;
                                        if (mu4Var2.h != null) {
                                            tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                        }
                                    } else {
                                        tL_messageActionGiftPremium3.currency = "XTR";
                                        tL_messageActionGiftPremium3.amount = mu4Var2.g();
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftCode2.currency = mu4Var2.a();
                                        long e4 = mu4Var2.e();
                                        tL_messageActionGiftCode2.amount = e4;
                                        if (mu4Var2.h != null) {
                                            tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                        }
                                    } else {
                                        tL_messageActionGiftCode2.currency = "XTR";
                                        tL_messageActionGiftCode2.amount = mu4Var2.g();
                                    }
                                }
                                k27Var2.Z5();
                                uk1Var2.j0(k27Var2, true);
                                h1aVar.p2.O(true);
                                h1aVar.b1(true);
                            }
                        }
                    }
                });
                this.o1.setTitle(J0());
            }
            if (starGift.limited) {
                i4 = 0;
                frameLayout.setVisibility(i4);
                linearLayout2.addView(frameLayout, nme.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
                this.k2 = null;
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 13.0f);
                textView4.setGravity(19);
                textView4.setTypeface(gl.o());
                int i122 = bkb.F6;
                zkb.X(textView4, i122, this.J0);
                if (starGift != null) {
                }
                TextView l2 = ug8.l(frameLayout, textView4, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
                l2.setTextSize(1, 13.0f);
                l2.setGravity(21);
                l2.setTypeface(gl.o());
                zkb.X(l2, i122, this.J0);
                if (starGift != null) {
                }
                frameLayout.addView(l2, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                View e1aVar2 = new e1a(context, starGift, i10);
                int L22 = gl.L(6.0f);
                int i132 = bkb.Ei;
                Drawable b022 = bkb.b0(L22, bkb.v0(i132, this.J0));
                vkb M22 = zkb.M(i132);
                wjb wjbVar32 = this.J0;
                e1aVar2.setBackground(b022);
                zkb.j(e1aVar2, b022, M22, null, wjbVar32);
                frameLayout.addView(e1aVar2, nme.e(-1, -1, kk7.D1));
                f1a f1aVar2 = new f1a(context, i10);
                f1aVar2.setWillNotDraw(false);
                frameLayout.addView(f1aVar2, nme.e(-1, -1, kk7.D1));
                TextView textView22 = new TextView(context);
                textView22.setTextSize(1, 13.0f);
                textView22.setGravity(19);
                textView22.setTypeface(gl.o());
                textView22.setTextColor(-1);
                if (starGift != null) {
                }
                f1aVar2.addView(textView22, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
                TextView textView32 = new TextView(context);
                textView32.setTextSize(1, 13.0f);
                textView32.setGravity(21);
                textView32.setTypeface(gl.o());
                textView32.setTextColor(-1);
                if (starGift != null) {
                }
                f1aVar2.addView(textView32, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                u41 u41Var2 = new u41(this.J0, context, true);
                this.j2 = u41Var2;
                u41Var2.f();
                b1(false);
                linearLayout2.addView(u41Var2, nme.t(-1, 48, kk7.D1, 10, 10, 10, 10));
                u41Var2.setOnClickListener(new zy(this, j, context, runnable, starGift, (byte) 3));
                zr zrVar2 = this.m1;
                this.J1 = true;
                zrVar2.j1(true);
                this.p2.O(false);
                this.m1.g1(this.p2.E.size(), gl.L(200.0f));
                o39 o39Var2 = this.n1;
                int i142 = this.u0;
                o39Var2.setPadding(i142, 0, i142, gl.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
                this.n1.i(new g1a(this));
                this.n1.setOnItemClickListener(new c39() { // from class: z0a
                    @Override // c39
                    public final void d(int i15, View view2) {
                        TL_stars.StarGift starGift2;
                        h1a h1aVar = h1a.this;
                        TL_stars.StarGift starGift3 = h1aVar.X1;
                        boolean z7 = h1aVar.S1;
                        uk1 uk1Var2 = h1aVar.f2;
                        TLRPC.MessageAction messageAction = h1aVar.g2;
                        k27 k27Var2 = h1aVar.h2;
                        l5c l5cVar = h1aVar.p2;
                        if (!h1aVar.J1) {
                            i15--;
                        }
                        c4c G = l5cVar.G(i15);
                        if (G != null) {
                            int i16 = G.d;
                            if (i16 == 1) {
                                boolean z8 = !h1aVar.l2;
                                h1aVar.l2 = z8;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                                }
                                k27Var2.Z5();
                                uk1Var2.j0(k27Var2, true);
                                h1aVar.p2.O(true);
                                return;
                            }
                            if (i16 == 2) {
                                if (z || z2) {
                                    int i17 = -h1aVar.q2;
                                    h1aVar.q2 = i17;
                                    gl.A3(i17, view2, null);
                                    return;
                                }
                                boolean z9 = h1aVar.m2;
                                h1aVar.m2 = !z9;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                                    tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                                    tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                                    tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                                }
                                k27Var2.Z5();
                                uk1Var2.j0(k27Var2, true);
                                h1aVar.p2.O(true);
                                h1aVar.b1(true);
                                return;
                            }
                            if (i16 == 3) {
                                boolean z10 = h1aVar.n2;
                                h1aVar.n2 = !z10;
                                boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                                mu4 mu4Var2 = mu4Var;
                                if (z11) {
                                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftPremium3.currency = mu4Var2.a();
                                        long e3 = mu4Var2.e();
                                        tL_messageActionGiftPremium3.amount = e3;
                                        if (mu4Var2.h != null) {
                                            tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                        }
                                    } else {
                                        tL_messageActionGiftPremium3.currency = "XTR";
                                        tL_messageActionGiftPremium3.amount = mu4Var2.g();
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftCode2.currency = mu4Var2.a();
                                        long e4 = mu4Var2.e();
                                        tL_messageActionGiftCode2.amount = e4;
                                        if (mu4Var2.h != null) {
                                            tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                        }
                                    } else {
                                        tL_messageActionGiftCode2.currency = "XTR";
                                        tL_messageActionGiftCode2.amount = mu4Var2.g();
                                    }
                                }
                                k27Var2.Z5();
                                uk1Var2.j0(k27Var2, true);
                                h1aVar.p2.O(true);
                                h1aVar.b1(true);
                            }
                        }
                    }
                });
                this.o1.setTitle(J0());
            }
        }
        i4 = 8;
        frameLayout.setVisibility(i4);
        linearLayout2.addView(frameLayout, nme.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
        this.k2 = null;
        TextView textView42 = new TextView(context);
        textView42.setTextSize(1, 13.0f);
        textView42.setGravity(19);
        textView42.setTypeface(gl.o());
        int i1222 = bkb.F6;
        zkb.X(textView42, i1222, this.J0);
        if (starGift != null) {
        }
        TextView l22 = ug8.l(frameLayout, textView42, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l22.setTextSize(1, 13.0f);
        l22.setGravity(21);
        l22.setTypeface(gl.o());
        zkb.X(l22, i1222, this.J0);
        if (starGift != null) {
        }
        frameLayout.addView(l22, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View e1aVar22 = new e1a(context, starGift, i10);
        int L222 = gl.L(6.0f);
        int i1322 = bkb.Ei;
        Drawable b0222 = bkb.b0(L222, bkb.v0(i1322, this.J0));
        vkb M222 = zkb.M(i1322);
        wjb wjbVar322 = this.J0;
        e1aVar22.setBackground(b0222);
        zkb.j(e1aVar22, b0222, M222, null, wjbVar322);
        frameLayout.addView(e1aVar22, nme.e(-1, -1, kk7.D1));
        f1a f1aVar22 = new f1a(context, i10);
        f1aVar22.setWillNotDraw(false);
        frameLayout.addView(f1aVar22, nme.e(-1, -1, kk7.D1));
        TextView textView222 = new TextView(context);
        textView222.setTextSize(1, 13.0f);
        textView222.setGravity(19);
        textView222.setTypeface(gl.o());
        textView222.setTextColor(-1);
        if (starGift != null) {
        }
        f1aVar22.addView(textView222, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView322 = new TextView(context);
        textView322.setTextSize(1, 13.0f);
        textView322.setGravity(21);
        textView322.setTypeface(gl.o());
        textView322.setTextColor(-1);
        if (starGift != null) {
        }
        f1aVar22.addView(textView322, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        u41 u41Var22 = new u41(this.J0, context, true);
        this.j2 = u41Var22;
        u41Var22.f();
        b1(false);
        linearLayout2.addView(u41Var22, nme.t(-1, 48, kk7.D1, 10, 10, 10, 10));
        u41Var22.setOnClickListener(new zy(this, j, context, runnable, starGift, (byte) 3));
        zr zrVar22 = this.m1;
        this.J1 = true;
        zrVar22.j1(true);
        this.p2.O(false);
        this.m1.g1(this.p2.E.size(), gl.L(200.0f));
        o39 o39Var22 = this.n1;
        int i1422 = this.u0;
        o39Var22.setPadding(i1422, 0, i1422, gl.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
        this.n1.i(new g1a(this));
        this.n1.setOnItemClickListener(new c39() { // from class: z0a
            @Override // c39
            public final void d(int i15, View view2) {
                TL_stars.StarGift starGift2;
                h1a h1aVar = h1a.this;
                TL_stars.StarGift starGift3 = h1aVar.X1;
                boolean z7 = h1aVar.S1;
                uk1 uk1Var2 = h1aVar.f2;
                TLRPC.MessageAction messageAction = h1aVar.g2;
                k27 k27Var2 = h1aVar.h2;
                l5c l5cVar = h1aVar.p2;
                if (!h1aVar.J1) {
                    i15--;
                }
                c4c G = l5cVar.G(i15);
                if (G != null) {
                    int i16 = G.d;
                    if (i16 == 1) {
                        boolean z8 = !h1aVar.l2;
                        h1aVar.l2 = z8;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                        }
                        k27Var2.Z5();
                        uk1Var2.j0(k27Var2, true);
                        h1aVar.p2.O(true);
                        return;
                    }
                    if (i16 == 2) {
                        if (z || z2) {
                            int i17 = -h1aVar.q2;
                            h1aVar.q2 = i17;
                            gl.A3(i17, view2, null);
                            return;
                        }
                        boolean z9 = h1aVar.m2;
                        h1aVar.m2 = !z9;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                            tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                            tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                            tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                        }
                        k27Var2.Z5();
                        uk1Var2.j0(k27Var2, true);
                        h1aVar.p2.O(true);
                        h1aVar.b1(true);
                        return;
                    }
                    if (i16 == 3) {
                        boolean z10 = h1aVar.n2;
                        h1aVar.n2 = !z10;
                        boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                        mu4 mu4Var2 = mu4Var;
                        if (z11) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                            if (z10) {
                                tL_messageActionGiftPremium3.currency = mu4Var2.a();
                                long e3 = mu4Var2.e();
                                tL_messageActionGiftPremium3.amount = e3;
                                if (mu4Var2.h != null) {
                                    tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                }
                            } else {
                                tL_messageActionGiftPremium3.currency = "XTR";
                                tL_messageActionGiftPremium3.amount = mu4Var2.g();
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                            if (z10) {
                                tL_messageActionGiftCode2.currency = mu4Var2.a();
                                long e4 = mu4Var2.e();
                                tL_messageActionGiftCode2.amount = e4;
                                if (mu4Var2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                }
                            } else {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = mu4Var2.g();
                            }
                        }
                        k27Var2.Z5();
                        uk1Var2.j0(k27Var2, true);
                        h1aVar.p2.O(true);
                        h1aVar.b1(true);
                    }
                }
            }
        });
        this.o1.setTitle(J0());
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.T1, 0, true, new w0a(this, (byte) 0), this.J0);
        this.p2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(this.S1 ? 2131749922 : 2131749928, null);
    }

    public final TLRPC.TL_textWithEntities Y0() {
        if (na7.q1(this.T1).K1(this.U1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.g2;
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

    public u21 Z0() {
        d S = LaunchActivity.S();
        if (S == null) {
            return null;
        }
        return u21.b0(S);
    }

    public final void a1(boolean z) {
        int i = this.T1;
        na7 q1 = na7.q1(i);
        long j = this.U1;
        TLRPC.UserFull W1 = q1.W1(j);
        TLObject Z1 = na7.q1(i).Z1(j);
        int i2 = 0;
        if (W1 != null && (Z1 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) Z1;
            user.premium = true;
            na7.q1(i).a4(user, true, false);
            kk7.f(i).k(kk7.D0, Long.valueOf(user.id), W1);
        }
        d dVar = this.r1;
        if (dVar != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) dVar.getParentActivity()).N().getFragmentStack());
            ui5 parentLayout = dVar.getParentLayout();
            int size = arrayList.size();
            mu1 mu1Var = null;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                d dVar2 = (d) obj;
                if (dVar2 instanceof mu1) {
                    mu1Var = (mu1) dVar2;
                    if (mu1Var.a() != j) {
                        dVar2.removeSelfFromStack();
                    }
                } else if (dVar2 instanceof ProfileActivity) {
                    if (z && parentLayout.getLastFragment() == dVar2) {
                        dVar2.finishFragment();
                    } else {
                        dVar2.removeSelfFromStack();
                    }
                }
            }
            if (mu1Var == null || mu1Var.a() != j) {
                ((ActionBarLayout) parentLayout).T(new mu1(ls6.k(j, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void b1(boolean z) {
        CharSequence charSequence;
        gt4 gt4Var = this.Y1;
        int i = this.T1;
        u41 u41Var = this.j2;
        if (gt4Var != null) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            boolean g = this.Y1.g(currentTime);
            gt4 gt4Var2 = this.Y1;
            if (g) {
                int i2 = gt4Var2.d.auction_start_date - currentTime;
                u41Var.i(k96.M0(2131750324, null), z, true);
                u41Var.g(k96.a0(null, null, 2131750319, k96.c0(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var2.f;
            if (tL_starGiftAuctionState == null) {
                u41Var.i(k96.M0(2131750329, null), z, true);
                u41Var.g(null, z);
                return;
            } else {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                u41Var.i(k96.M0(2131750329, null), z, true);
                u41Var.g(k96.a0(null, null, 2131750305, k96.c0(i3)), z);
                return;
            }
        }
        TL_stars.StarGift starGift = this.X1;
        cm2[] cm2VarArr = this.r2;
        if (starGift != null) {
            long j = gta.v(i, false).m().amount;
            long j2 = starGift.stars + (this.m2 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.o2.getText()) ? 0L : this.e2);
            u41Var.i(jva.Y0(false, k96.H(',', this.S1 ? "Gift2SendSelf" : "Gift2Send", (int) j2), cm2VarArr), z, true);
            if (!gta.v(i, false).e || j2 <= j) {
                u41Var.g(null, z);
                return;
            } else {
                u41Var.g(k96.H(',', "Gift2SendYourBalance", (int) j), z);
                return;
            }
        }
        mu4 mu4Var = this.Z1;
        if (mu4Var != null) {
            if (this.n2) {
                u41Var.i(jva.T0(k96.a0(null, null, 2131749978, k96.E(mu4Var.g(), ',')), 1.0f, cm2VarArr), z, true);
                cm2VarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                u41Var.i(new SpannableStringBuilder(k96.a0(null, null, 2131749979, mu4Var.c())), z, true);
            }
            u41Var.g(charSequence, z);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.z3) {
            b1(true);
            l5c l5cVar = this.p2;
            if (l5cVar == null || this.Z1 == null) {
                return;
            }
            l5cVar.O(true);
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        c1a c1aVar = this.o2;
        int emojiPadding = c1aVar.b.getEmojiPadding();
        ts3 ts3Var = c1aVar.b;
        if (emojiPadding > 0) {
            ts3Var.k(true);
            return;
        }
        if (ts3Var.w) {
            ts3Var.d();
            return;
        }
        ts3Var.r();
        if (this.Y1 != null) {
            kt4.c(this.T1).n(this.Y1.b, this);
        }
        this.s2 = true;
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.T1).b(this, kk7.z3);
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        c1a c1aVar = this.o2;
        int emojiPadding = c1aVar.b.getEmojiPadding();
        ts3 ts3Var = c1aVar.b;
        if (emojiPadding > 0) {
            ts3Var.k(true);
        } else if (ts3Var.w) {
            ts3Var.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.T1).n(this, kk7.z3);
    }

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
            LinearLayout linearLayout = this.i2;
            if (linearLayout != null) {
                int v0 = bkb.v0(bkb.g5, this.J0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != v0) {
                        colorDrawable.setColor(v0);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(v0);
                    int i = this.u0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i, 0, i, 0));
                }
            }
            ix4 ix4Var = this.t2;
            if (ix4Var != null) {
                ix4Var.a(bkb.v0(bkb.g5, this.J0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // jt4
    public final void r(gt4 gt4Var) {
        this.Y1 = gt4Var;
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        c1a c1aVar = this.o2;
        if (c1aVar != null) {
            c1aVar.b.s();
        }
        super.show();
    }

    @Override // fx0
    public final void x() {
        this.n1.b0();
    }
}
