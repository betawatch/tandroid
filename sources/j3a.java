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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class j3a extends mz0 implements jm7, kv4 {
    public final boolean S1;
    public final int T1;
    public final long U1;
    public final boolean V1;
    public final boolean W1;
    public final TL_stars.StarGift X1;
    public hv4 Y1;
    public final nw4 Z1;
    public final String a2;
    public final Runnable b2;
    public final d3a c2;
    public final LinearLayout d2;
    public final long e2;
    public final cm1 f2;
    public final TLRPC.MessageAction g2;
    public final k47 h2;
    public final LinearLayout i2;
    public final b61 j2;
    public final FrameLayout k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public final e3a o2;
    public l7c p2;
    public int q2;
    public final pn2[] r2;
    public boolean s2;
    public final kz4 t2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j3a(Context context, int i, final TL_stars.StarGift starGift, final nw4 nw4Var, long j, Runnable runnable, final boolean z, final boolean z2) {
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
        this.r2 = new pn2[1];
        this.s2 = false;
        boolean z4 = j == z8c.h(i).e();
        this.S1 = z4;
        this.N0 = (byte) 4;
        J();
        this.C1 = gm.L(4.0f);
        this.D1 = gm.L(-10.0f);
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
            this.Y1 = lv4.c(i).l(starGift.id, this);
        }
        this.Z1 = nw4Var;
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
            this.a2 = m9c.l(oc7.r1(i).W1(Long.valueOf(j)));
        } else {
            j2 = 0;
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            this.a2 = L0 == null ? "" : L0.title;
        }
        cm1 cm1Var = new cm1(this.J0, context, false);
        this.f2 = cm1Var;
        cm1Var.setDelegate(new c3a());
        d3a d3aVar = new d3a(this, context);
        this.c2 = d3aVar;
        Drawable d = cl8.d(null, i, j, cmb.I.o());
        d3aVar.U(d);
        kz4 kz4Var = new kz4();
        if (d instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) d).getColor());
        } else {
            if (d instanceof ah7) {
                ah7 ah7Var = (ah7) d;
                if (ah7Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = ah7Var.a;
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
            v0 = cmb.v0(cmb.g5, this.J0);
        }
        kz4Var.a(v0);
        this.t2 = num2 == null ? kz4Var : null;
        im0 im0Var = new im0(kz4Var, kz4Var, kz4Var);
        ylb ylbVar = this.J0;
        int i5 = cmb.g5;
        im0Var.p(new bm0(i5, ylbVar));
        im0Var.r(gm.L(20.0f));
        im0Var.q(gm.L(f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift == null) {
            boolean z5 = z4;
            i2 = 6;
            if (nw4Var != null) {
                if (nw4Var.b != null) {
                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                    tL_messageActionGiftCode.unclaimed = true;
                    tL_messageActionGiftCode.via_giveaway = false;
                    tL_messageActionGiftCode.months = nw4Var.d();
                    tL_messageActionGiftCode.flags |= 4;
                    tL_messageActionGiftCode.currency = nw4Var.a();
                    long e = nw4Var.e();
                    tL_messageActionGiftCode.amount = e;
                    z3 = z5;
                    if (nw4Var.h != null) {
                        i3 = i5;
                        tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftCode.currency) - 6) * e);
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
                    if (nw4Var.a != null) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = new TLRPC.TL_messageActionGiftPremium();
                        tL_messageActionGiftPremium2.months = nw4Var.d();
                        tL_messageActionGiftPremium2.currency = nw4Var.a();
                        long e2 = nw4Var.e();
                        tL_messageActionGiftPremium2.amount = e2;
                        if (nw4Var.h != null) {
                            tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftPremium2.currency) - 6) * e2);
                        }
                        tL_messageActionGiftPremium2.flags |= 2;
                        tL_messageActionGiftPremium2.message = new TLRPC.TL_textWithEntities();
                        this.g2 = tL_messageActionGiftPremium2;
                        tL_messageActionGiftPremium = tL_messageActionGiftPremium2;
                    }
                }
            }
            zo4.k("SendGiftSheet with no star gift and no premium tier");
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
        tL_messageService.from_id = oc7.r1(i).x1(z8c.h(i).e());
        tL_messageService.peer_id = oc7.r1(i).x1(j);
        tL_messageService.action = tL_messageActionGiftPremium;
        long L1 = starGift != null ? oc7.r1(i).L1(j) : j2;
        this.e2 = L1;
        k47 k47Var = new k47(i, tL_messageService, false, false);
        this.h2 = k47Var;
        byte b = 1;
        cm1Var.i0(k47Var, true);
        linearLayout.addView(cm1Var, qoe.t(-1, -1, nm7.D1, 0, L1 > j2 ? 0 : 8, 0, 8));
        d3aVar.addView(linearLayout, qoe.e(-1, -1, nm7.D1));
        e3a e3aVar = new e3a(this, context, (ela) this.b, jb6.M0(starGift != null ? 2131750053 : 2131750052, null), oc7.r1(i).l4.E1.f(), this.J0, im0Var, i);
        this.o2 = e3aVar;
        du3 du3Var = e3aVar.b;
        du3Var.getEditText().addTextChangedListener(new fj());
        du3Var.R = true;
        e3aVar.setShowLimitWhenNear(50);
        this.K1 = du3Var;
        e3aVar.setShowLimitOnFocus(true);
        e3aVar.setDivider(false);
        bi3 bi3Var = new bi3(e3aVar, (byte) 18);
        du3Var.getEditText().setImeOptions(i2);
        du3Var.getEditText().setOnEditorActionListener(new uy1(bi3Var, b));
        int i6 = this.u0;
        e3aVar.setPadding(i6, 0, i6, 0);
        f3a f3aVar = new f3a();
        f3aVar.C = false;
        f3aVar.m = false;
        f3aVar.n(350L);
        f3aVar.o(d53.h);
        f3aVar.D = (byte) 40;
        this.n1.setItemAnimator(f3aVar);
        this.p2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i2 = linearLayout2;
        linearLayout2.setOrientation(1);
        int i7 = i3;
        ColorDrawable colorDrawable = new ColorDrawable(cmb.v0(i7, this.J0));
        int i8 = this.u0;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i8, 0, i8, 0));
        int i9 = this.u0;
        linearLayout2.setPadding(i9, 0, i9, 0);
        this.b.addView(linearLayout2, qoe.e(-1, -2, 87));
        View view = new View(context);
        anb.h(cmb.J5, this.J0, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qoe.z(-1.0f), qoe.z(1.0f / gm.p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i10 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gm.L(6.0f);
        int i11 = cmb.Z6;
        Drawable b0 = cmb.b0(L, cmb.v0(i11, this.J0));
        wmb M = anb.M(i11);
        ylb ylbVar2 = this.J0;
        frameLayout.setBackground(b0);
        anb.j(frameLayout, b0, M, null, ylbVar2);
        if (starGift != null) {
            if (starGift.auction) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.k2 = frameLayout2;
                frameLayout2.addView(frameLayout, qoe.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
                anb.h(i7, this.J0, frameLayout2);
                TextView textView = new TextView(context);
                textView.setTextSize(1, 13.0f);
                textView.setGravity(19);
                textView.setTypeface(gm.o());
                int i12 = cmb.F6;
                anb.X(textView, i12, this.J0);
                if (starGift != null) {
                    textView.setText(jb6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
                }
                TextView l = wi8.l(frameLayout, textView, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
                l.setTextSize(1, 13.0f);
                l.setGravity(21);
                l.setTypeface(gm.o());
                anb.X(l, i12, this.J0);
                if (starGift != null) {
                    l.setText(jb6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
                }
                frameLayout.addView(l, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                View g3aVar = new g3a(context, starGift, i10);
                int L2 = gm.L(6.0f);
                int i13 = cmb.Ei;
                Drawable b02 = cmb.b0(L2, cmb.v0(i13, this.J0));
                wmb M2 = anb.M(i13);
                ylb ylbVar3 = this.J0;
                g3aVar.setBackground(b02);
                anb.j(g3aVar, b02, M2, null, ylbVar3);
                frameLayout.addView(g3aVar, qoe.e(-1, -1, nm7.D1));
                h3a h3aVar = new h3a(context, i10);
                h3aVar.setWillNotDraw(false);
                frameLayout.addView(h3aVar, qoe.e(-1, -1, nm7.D1));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 13.0f);
                textView2.setGravity(19);
                textView2.setTypeface(gm.o());
                textView2.setTextColor(-1);
                if (starGift != null) {
                    textView2.setText(jb6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
                }
                h3aVar.addView(textView2, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 13.0f);
                textView3.setGravity(21);
                textView3.setTypeface(gm.o());
                textView3.setTextColor(-1);
                if (starGift != null) {
                    textView3.setText(jb6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
                }
                h3aVar.addView(textView3, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                b61 b61Var = new b61(this.J0, context, true);
                this.j2 = b61Var;
                b61Var.f();
                b1(false);
                linearLayout2.addView(b61Var, qoe.t(-1, 48, nm7.D1, 10, 10, 10, 10));
                b61Var.setOnClickListener(new zz(this, j, context, runnable, starGift, (byte) 3));
                zs zsVar = this.m1;
                this.J1 = true;
                zsVar.j1(true);
                this.p2.O(false);
                this.m1.g1(this.p2.E.size(), gm.L(200.0f));
                r59 r59Var = this.n1;
                int i14 = this.u0;
                r59Var.setPadding(i14, 0, i14, gm.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
                this.n1.i(new i3a(this));
                this.n1.setOnItemClickListener(new f59() { // from class: b3a
                    @Override // f59
                    public final void g(int i15, View view2) {
                        TL_stars.StarGift starGift2;
                        j3a j3aVar = j3a.this;
                        TL_stars.StarGift starGift3 = j3aVar.X1;
                        boolean z7 = j3aVar.S1;
                        cm1 cm1Var2 = j3aVar.f2;
                        TLRPC.MessageAction messageAction = j3aVar.g2;
                        k47 k47Var2 = j3aVar.h2;
                        l7c l7cVar = j3aVar.p2;
                        if (!j3aVar.J1) {
                            i15--;
                        }
                        c6c G = l7cVar.G(i15);
                        if (G != null) {
                            int i16 = G.d;
                            if (i16 == 1) {
                                boolean z8 = !j3aVar.l2;
                                j3aVar.l2 = z8;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                                }
                                k47Var2.Z5();
                                cm1Var2.i0(k47Var2, true);
                                j3aVar.p2.O(true);
                                return;
                            }
                            if (i16 == 2) {
                                if (z || z2) {
                                    int i17 = -j3aVar.q2;
                                    j3aVar.q2 = i17;
                                    gm.A3(i17, view2, null);
                                    return;
                                }
                                boolean z9 = j3aVar.m2;
                                j3aVar.m2 = !z9;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                                    tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                                    tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                                    tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                                }
                                k47Var2.Z5();
                                cm1Var2.i0(k47Var2, true);
                                j3aVar.p2.O(true);
                                j3aVar.b1(true);
                                return;
                            }
                            if (i16 == 3) {
                                boolean z10 = j3aVar.n2;
                                j3aVar.n2 = !z10;
                                boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                                nw4 nw4Var2 = nw4Var;
                                if (z11) {
                                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftPremium3.currency = nw4Var2.a();
                                        long e3 = nw4Var2.e();
                                        tL_messageActionGiftPremium3.amount = e3;
                                        if (nw4Var2.h != null) {
                                            tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                        }
                                    } else {
                                        tL_messageActionGiftPremium3.currency = "XTR";
                                        tL_messageActionGiftPremium3.amount = nw4Var2.g();
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftCode2.currency = nw4Var2.a();
                                        long e4 = nw4Var2.e();
                                        tL_messageActionGiftCode2.amount = e4;
                                        if (nw4Var2.h != null) {
                                            tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                        }
                                    } else {
                                        tL_messageActionGiftCode2.currency = "XTR";
                                        tL_messageActionGiftCode2.amount = nw4Var2.g();
                                    }
                                }
                                k47Var2.Z5();
                                cm1Var2.i0(k47Var2, true);
                                j3aVar.p2.O(true);
                                j3aVar.b1(true);
                            }
                        }
                    }
                });
                this.o1.setTitle(J0());
            }
            if (starGift.limited) {
                i4 = 0;
                frameLayout.setVisibility(i4);
                linearLayout2.addView(frameLayout, qoe.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
                this.k2 = null;
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 13.0f);
                textView4.setGravity(19);
                textView4.setTypeface(gm.o());
                int i122 = cmb.F6;
                anb.X(textView4, i122, this.J0);
                if (starGift != null) {
                }
                TextView l2 = wi8.l(frameLayout, textView4, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
                l2.setTextSize(1, 13.0f);
                l2.setGravity(21);
                l2.setTypeface(gm.o());
                anb.X(l2, i122, this.J0);
                if (starGift != null) {
                }
                frameLayout.addView(l2, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                View g3aVar2 = new g3a(context, starGift, i10);
                int L22 = gm.L(6.0f);
                int i132 = cmb.Ei;
                Drawable b022 = cmb.b0(L22, cmb.v0(i132, this.J0));
                wmb M22 = anb.M(i132);
                ylb ylbVar32 = this.J0;
                g3aVar2.setBackground(b022);
                anb.j(g3aVar2, b022, M22, null, ylbVar32);
                frameLayout.addView(g3aVar2, qoe.e(-1, -1, nm7.D1));
                h3a h3aVar2 = new h3a(context, i10);
                h3aVar2.setWillNotDraw(false);
                frameLayout.addView(h3aVar2, qoe.e(-1, -1, nm7.D1));
                TextView textView22 = new TextView(context);
                textView22.setTextSize(1, 13.0f);
                textView22.setGravity(19);
                textView22.setTypeface(gm.o());
                textView22.setTextColor(-1);
                if (starGift != null) {
                }
                h3aVar2.addView(textView22, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
                TextView textView32 = new TextView(context);
                textView32.setTextSize(1, 13.0f);
                textView32.setGravity(21);
                textView32.setTypeface(gm.o());
                textView32.setTextColor(-1);
                if (starGift != null) {
                }
                h3aVar2.addView(textView32, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                b61 b61Var2 = new b61(this.J0, context, true);
                this.j2 = b61Var2;
                b61Var2.f();
                b1(false);
                linearLayout2.addView(b61Var2, qoe.t(-1, 48, nm7.D1, 10, 10, 10, 10));
                b61Var2.setOnClickListener(new zz(this, j, context, runnable, starGift, (byte) 3));
                zs zsVar2 = this.m1;
                this.J1 = true;
                zsVar2.j1(true);
                this.p2.O(false);
                this.m1.g1(this.p2.E.size(), gm.L(200.0f));
                r59 r59Var2 = this.n1;
                int i142 = this.u0;
                r59Var2.setPadding(i142, 0, i142, gm.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
                this.n1.i(new i3a(this));
                this.n1.setOnItemClickListener(new f59() { // from class: b3a
                    @Override // f59
                    public final void g(int i15, View view2) {
                        TL_stars.StarGift starGift2;
                        j3a j3aVar = j3a.this;
                        TL_stars.StarGift starGift3 = j3aVar.X1;
                        boolean z7 = j3aVar.S1;
                        cm1 cm1Var2 = j3aVar.f2;
                        TLRPC.MessageAction messageAction = j3aVar.g2;
                        k47 k47Var2 = j3aVar.h2;
                        l7c l7cVar = j3aVar.p2;
                        if (!j3aVar.J1) {
                            i15--;
                        }
                        c6c G = l7cVar.G(i15);
                        if (G != null) {
                            int i16 = G.d;
                            if (i16 == 1) {
                                boolean z8 = !j3aVar.l2;
                                j3aVar.l2 = z8;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                                }
                                k47Var2.Z5();
                                cm1Var2.i0(k47Var2, true);
                                j3aVar.p2.O(true);
                                return;
                            }
                            if (i16 == 2) {
                                if (z || z2) {
                                    int i17 = -j3aVar.q2;
                                    j3aVar.q2 = i17;
                                    gm.A3(i17, view2, null);
                                    return;
                                }
                                boolean z9 = j3aVar.m2;
                                j3aVar.m2 = !z9;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                                    tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                                    tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                                    tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                                }
                                k47Var2.Z5();
                                cm1Var2.i0(k47Var2, true);
                                j3aVar.p2.O(true);
                                j3aVar.b1(true);
                                return;
                            }
                            if (i16 == 3) {
                                boolean z10 = j3aVar.n2;
                                j3aVar.n2 = !z10;
                                boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                                nw4 nw4Var2 = nw4Var;
                                if (z11) {
                                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftPremium3.currency = nw4Var2.a();
                                        long e3 = nw4Var2.e();
                                        tL_messageActionGiftPremium3.amount = e3;
                                        if (nw4Var2.h != null) {
                                            tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                        }
                                    } else {
                                        tL_messageActionGiftPremium3.currency = "XTR";
                                        tL_messageActionGiftPremium3.amount = nw4Var2.g();
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftCode2.currency = nw4Var2.a();
                                        long e4 = nw4Var2.e();
                                        tL_messageActionGiftCode2.amount = e4;
                                        if (nw4Var2.h != null) {
                                            tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                        }
                                    } else {
                                        tL_messageActionGiftCode2.currency = "XTR";
                                        tL_messageActionGiftCode2.amount = nw4Var2.g();
                                    }
                                }
                                k47Var2.Z5();
                                cm1Var2.i0(k47Var2, true);
                                j3aVar.p2.O(true);
                                j3aVar.b1(true);
                            }
                        }
                    }
                });
                this.o1.setTitle(J0());
            }
        }
        i4 = 8;
        frameLayout.setVisibility(i4);
        linearLayout2.addView(frameLayout, qoe.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
        this.k2 = null;
        TextView textView42 = new TextView(context);
        textView42.setTextSize(1, 13.0f);
        textView42.setGravity(19);
        textView42.setTypeface(gm.o());
        int i1222 = cmb.F6;
        anb.X(textView42, i1222, this.J0);
        if (starGift != null) {
        }
        TextView l22 = wi8.l(frameLayout, textView42, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l22.setTextSize(1, 13.0f);
        l22.setGravity(21);
        l22.setTypeface(gm.o());
        anb.X(l22, i1222, this.J0);
        if (starGift != null) {
        }
        frameLayout.addView(l22, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View g3aVar22 = new g3a(context, starGift, i10);
        int L222 = gm.L(6.0f);
        int i1322 = cmb.Ei;
        Drawable b0222 = cmb.b0(L222, cmb.v0(i1322, this.J0));
        wmb M222 = anb.M(i1322);
        ylb ylbVar322 = this.J0;
        g3aVar22.setBackground(b0222);
        anb.j(g3aVar22, b0222, M222, null, ylbVar322);
        frameLayout.addView(g3aVar22, qoe.e(-1, -1, nm7.D1));
        h3a h3aVar22 = new h3a(context, i10);
        h3aVar22.setWillNotDraw(false);
        frameLayout.addView(h3aVar22, qoe.e(-1, -1, nm7.D1));
        TextView textView222 = new TextView(context);
        textView222.setTextSize(1, 13.0f);
        textView222.setGravity(19);
        textView222.setTypeface(gm.o());
        textView222.setTextColor(-1);
        if (starGift != null) {
        }
        h3aVar22.addView(textView222, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView322 = new TextView(context);
        textView322.setTextSize(1, 13.0f);
        textView322.setGravity(21);
        textView322.setTypeface(gm.o());
        textView322.setTextColor(-1);
        if (starGift != null) {
        }
        h3aVar22.addView(textView322, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        b61 b61Var22 = new b61(this.J0, context, true);
        this.j2 = b61Var22;
        b61Var22.f();
        b1(false);
        linearLayout2.addView(b61Var22, qoe.t(-1, 48, nm7.D1, 10, 10, 10, 10));
        b61Var22.setOnClickListener(new zz(this, j, context, runnable, starGift, (byte) 3));
        zs zsVar22 = this.m1;
        this.J1 = true;
        zsVar22.j1(true);
        this.p2.O(false);
        this.m1.g1(this.p2.E.size(), gm.L(200.0f));
        r59 r59Var22 = this.n1;
        int i1422 = this.u0;
        r59Var22.setPadding(i1422, 0, i1422, gm.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
        this.n1.i(new i3a(this));
        this.n1.setOnItemClickListener(new f59() { // from class: b3a
            @Override // f59
            public final void g(int i15, View view2) {
                TL_stars.StarGift starGift2;
                j3a j3aVar = j3a.this;
                TL_stars.StarGift starGift3 = j3aVar.X1;
                boolean z7 = j3aVar.S1;
                cm1 cm1Var2 = j3aVar.f2;
                TLRPC.MessageAction messageAction = j3aVar.g2;
                k47 k47Var2 = j3aVar.h2;
                l7c l7cVar = j3aVar.p2;
                if (!j3aVar.J1) {
                    i15--;
                }
                c6c G = l7cVar.G(i15);
                if (G != null) {
                    int i16 = G.d;
                    if (i16 == 1) {
                        boolean z8 = !j3aVar.l2;
                        j3aVar.l2 = z8;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                        }
                        k47Var2.Z5();
                        cm1Var2.i0(k47Var2, true);
                        j3aVar.p2.O(true);
                        return;
                    }
                    if (i16 == 2) {
                        if (z || z2) {
                            int i17 = -j3aVar.q2;
                            j3aVar.q2 = i17;
                            gm.A3(i17, view2, null);
                            return;
                        }
                        boolean z9 = j3aVar.m2;
                        j3aVar.m2 = !z9;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                            tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                            tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                            tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                        }
                        k47Var2.Z5();
                        cm1Var2.i0(k47Var2, true);
                        j3aVar.p2.O(true);
                        j3aVar.b1(true);
                        return;
                    }
                    if (i16 == 3) {
                        boolean z10 = j3aVar.n2;
                        j3aVar.n2 = !z10;
                        boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                        nw4 nw4Var2 = nw4Var;
                        if (z11) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                            if (z10) {
                                tL_messageActionGiftPremium3.currency = nw4Var2.a();
                                long e3 = nw4Var2.e();
                                tL_messageActionGiftPremium3.amount = e3;
                                if (nw4Var2.h != null) {
                                    tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                }
                            } else {
                                tL_messageActionGiftPremium3.currency = "XTR";
                                tL_messageActionGiftPremium3.amount = nw4Var2.g();
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                            if (z10) {
                                tL_messageActionGiftCode2.currency = nw4Var2.a();
                                long e4 = nw4Var2.e();
                                tL_messageActionGiftCode2.amount = e4;
                                if (nw4Var2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                }
                            } else {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = nw4Var2.g();
                            }
                        }
                        k47Var2.Z5();
                        cm1Var2.i0(k47Var2, true);
                        j3aVar.p2.O(true);
                        j3aVar.b1(true);
                    }
                }
            }
        });
        this.o1.setTitle(J0());
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.T1, 0, true, new y2a(this, (byte) 0), this.J0);
        this.p2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(this.S1 ? 2131749871 : 2131749877, null);
    }

    public final TLRPC.TL_textWithEntities Y0() {
        if (oc7.r1(this.T1).L1(this.U1) > 0) {
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

    public c41 Z0() {
        d S = LaunchActivity.S();
        if (S == null) {
            return null;
        }
        return c41.b0(S);
    }

    public final void a1(boolean z) {
        int i = this.T1;
        oc7 r1 = oc7.r1(i);
        long j = this.U1;
        TLRPC.UserFull X1 = r1.X1(j);
        TLObject a2 = oc7.r1(i).a2(j);
        int i2 = 0;
        if (X1 != null && (a2 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) a2;
            user.premium = true;
            oc7.r1(i).c4(user, true, false);
            nm7.f(i).k(nm7.E0, Long.valueOf(user.id), X1);
        }
        d dVar = this.r1;
        if (dVar != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) dVar.getParentActivity()).N().getFragmentStack());
            tk5 parentLayout = dVar.getParentLayout();
            int size = arrayList.size();
            yv1 yv1Var = null;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                d dVar2 = (d) obj;
                if (dVar2 instanceof yv1) {
                    yv1Var = (yv1) dVar2;
                    if (yv1Var.a() != j) {
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
            if (yv1Var == null || yv1Var.a() != j) {
                ((ActionBarLayout) parentLayout).T(new yv1(kt6.k(j, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void b1(boolean z) {
        CharSequence charSequence;
        hv4 hv4Var = this.Y1;
        int i = this.T1;
        b61 b61Var = this.j2;
        if (hv4Var != null) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            boolean g = this.Y1.g(currentTime);
            hv4 hv4Var2 = this.Y1;
            if (g) {
                int i2 = hv4Var2.d.auction_start_date - currentTime;
                b61Var.i(jb6.M0(2131750273, null), z, true);
                b61Var.g(jb6.a0(null, null, 2131750268, jb6.c0(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var2.f;
            if (tL_starGiftAuctionState == null) {
                b61Var.i(jb6.M0(2131750278, null), z, true);
                b61Var.g(null, z);
                return;
            } else {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                b61Var.i(jb6.M0(2131750278, null), z, true);
                b61Var.g(jb6.a0(null, null, 2131750254, jb6.c0(i3)), z);
                return;
            }
        }
        TL_stars.StarGift starGift = this.X1;
        pn2[] pn2VarArr = this.r2;
        if (starGift != null) {
            long j = jva.v(i, false).m().amount;
            long j2 = starGift.stars + (this.m2 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.o2.getText()) ? 0L : this.e2);
            b61Var.i(nxa.Z0(false, jb6.H(',', this.S1 ? "Gift2SendSelf" : "Gift2Send", (int) j2), pn2VarArr), z, true);
            if (!jva.v(i, false).e || j2 <= j) {
                b61Var.g(null, z);
                return;
            } else {
                b61Var.g(jb6.H(',', "Gift2SendYourBalance", (int) j), z);
                return;
            }
        }
        nw4 nw4Var = this.Z1;
        if (nw4Var != null) {
            if (this.n2) {
                b61Var.i(nxa.U0(jb6.a0(null, null, 2131749927, jb6.E(nw4Var.g(), ',')), 1.0f, pn2VarArr), z, true);
                pn2VarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                b61Var.i(new SpannableStringBuilder(jb6.a0(null, null, 2131749928, nw4Var.c())), z, true);
            }
            b61Var.g(charSequence, z);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.A3) {
            b1(true);
            l7c l7cVar = this.p2;
            if (l7cVar == null || this.Z1 == null) {
                return;
            }
            l7cVar.O(true);
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        e3a e3aVar = this.o2;
        int emojiPadding = e3aVar.b.getEmojiPadding();
        du3 du3Var = e3aVar.b;
        if (emojiPadding > 0) {
            du3Var.k(true);
            return;
        }
        if (du3Var.w) {
            du3Var.d();
            return;
        }
        du3Var.r();
        if (this.Y1 != null) {
            lv4.c(this.T1).n(this.Y1.b, this);
        }
        this.s2 = true;
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.T1).b(this, nm7.A3);
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        e3a e3aVar = this.o2;
        int emojiPadding = e3aVar.b.getEmojiPadding();
        du3 du3Var = e3aVar.b;
        if (emojiPadding > 0) {
            du3Var.k(true);
        } else if (du3Var.w) {
            du3Var.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.T1).n(this, nm7.A3);
    }

    @Override // my0
    public final void p0() {
        try {
            super.p0();
            LinearLayout linearLayout = this.i2;
            if (linearLayout != null) {
                int v0 = cmb.v0(cmb.g5, this.J0);
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
            kz4 kz4Var = this.t2;
            if (kz4Var != null) {
                kz4Var.a(cmb.v0(cmb.g5, this.J0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // kv4
    public final void q(hv4 hv4Var) {
        this.Y1 = hv4Var;
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        e3a e3aVar = this.o2;
        if (e3aVar != null) {
            e3aVar.b.s();
        }
        super.show();
    }

    @Override // my0
    public final void w() {
        this.n1.b0();
    }
}
