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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class a5a extends ny0 implements fn7, nv4 {
    public final boolean S1;
    public final int T1;
    public final long U1;
    public final boolean V1;
    public final boolean W1;
    public final TL_stars.StarGift X1;
    public kv4 Y1;
    public final pw4 Z1;
    public final String a2;
    public final Runnable b2;
    public final u4a c2;
    public final LinearLayout d2;
    public final long e2;
    public final dl1 f2;
    public final TLRPC.MessageAction g2;
    public final r47 h2;
    public final LinearLayout i2;
    public final c51 j2;
    public final FrameLayout k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public final v4a o2;
    public l9c p2;
    public int q2;
    public final wm2[] r2;
    public boolean s2;
    public final oz4 t2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a5a(Context context, int i, final TL_stars.StarGift starGift, final pw4 pw4Var, long j, Runnable runnable, final boolean z, final boolean z2) {
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
        this.r2 = new wm2[1];
        this.s2 = false;
        boolean z4 = j == yac.h(i).e();
        this.S1 = z4;
        this.N0 = (byte) 4;
        J();
        this.C1 = hl.L(4.0f);
        this.D1 = hl.L(-10.0f);
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
            this.Y1 = ov4.c(i).l(starGift.id, this);
        }
        this.Z1 = pw4Var;
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
            this.a2 = lbc.l(uc7.s1(i).X1(Long.valueOf(j)));
        } else {
            j2 = 0;
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            this.a2 = M0 == null ? "" : M0.title;
        }
        dl1 dl1Var = new dl1(this.J0, context, false);
        this.f2 = dl1Var;
        dl1Var.setDelegate(new t4a());
        u4a u4aVar = new u4a(this, context);
        this.c2 = u4aVar;
        Drawable d = mm8.d(null, i, j, aob.I.o());
        u4aVar.U(d);
        oz4 oz4Var = new oz4();
        if (d instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) d).getColor());
        } else {
            if (d instanceof hh7) {
                hh7 hh7Var = (hh7) d;
                if (hh7Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = hh7Var.a;
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
            v0 = aob.v0(aob.h5, this.J0);
        }
        oz4Var.a(v0);
        this.t2 = num2 == null ? oz4Var : null;
        jl0 jl0Var = new jl0(oz4Var, oz4Var, oz4Var);
        vnb vnbVar = this.J0;
        int i5 = aob.h5;
        jl0Var.p(new cl0(i5, vnbVar));
        jl0Var.r(hl.L(20.0f));
        jl0Var.q(hl.L(f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift == null) {
            boolean z5 = z4;
            i2 = 6;
            if (pw4Var != null) {
                if (pw4Var.b != null) {
                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                    tL_messageActionGiftCode.unclaimed = true;
                    tL_messageActionGiftCode.via_giveaway = false;
                    tL_messageActionGiftCode.months = pw4Var.d();
                    tL_messageActionGiftCode.flags |= 4;
                    tL_messageActionGiftCode.currency = pw4Var.a();
                    long e = pw4Var.e();
                    tL_messageActionGiftCode.amount = e;
                    z3 = z5;
                    if (pw4Var.h != null) {
                        i3 = i5;
                        tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftCode.currency) - 6) * e);
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
                    if (pw4Var.a != null) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = new TLRPC.TL_messageActionGiftPremium();
                        tL_messageActionGiftPremium2.months = pw4Var.d();
                        tL_messageActionGiftPremium2.currency = pw4Var.a();
                        long e2 = pw4Var.e();
                        tL_messageActionGiftPremium2.amount = e2;
                        if (pw4Var.h != null) {
                            tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftPremium2.currency) - 6) * e2);
                        }
                        tL_messageActionGiftPremium2.flags |= 2;
                        tL_messageActionGiftPremium2.message = new TLRPC.TL_textWithEntities();
                        this.g2 = tL_messageActionGiftPremium2;
                        tL_messageActionGiftPremium = tL_messageActionGiftPremium2;
                    }
                }
            }
            xi4.l("SendGiftSheet with no star gift and no premium tier");
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
        tL_messageService.from_id = uc7.s1(i).y1(yac.h(i).e());
        tL_messageService.peer_id = uc7.s1(i).y1(j);
        tL_messageService.action = tL_messageActionGiftPremium;
        long M1 = starGift != null ? uc7.s1(i).M1(j) : j2;
        this.e2 = M1;
        r47 r47Var = new r47(i, tL_messageService, false, false);
        this.h2 = r47Var;
        byte b = 1;
        dl1Var.i0(r47Var, true);
        linearLayout.addView(dl1Var, tre.t(-1, -1, jn7.D1, 0, M1 > j2 ? 0 : 8, 0, 8));
        u4aVar.addView(linearLayout, tre.e(-1, -1, jn7.D1));
        v4a v4aVar = new v4a(this, context, (wma) this.b, ob6.M0(starGift != null ? 2131750079 : 2131750078, null), uc7.s1(i).k4.M1.f(), this.J0, jl0Var, i);
        this.o2 = v4aVar;
        lt3 lt3Var = v4aVar.b;
        lt3Var.getEditText().addTextChangedListener(new gi());
        lt3Var.R = true;
        v4aVar.setShowLimitWhenNear(50);
        this.K1 = lt3Var;
        v4aVar.setShowLimitOnFocus(true);
        v4aVar.setDivider(false);
        zg3 zg3Var = new zg3(v4aVar, (byte) 19);
        lt3Var.getEditText().setImeOptions(i2);
        lt3Var.getEditText().setOnEditorActionListener(new vx1(zg3Var, b));
        int i6 = this.u0;
        v4aVar.setPadding(i6, 0, i6, 0);
        w4a w4aVar = new w4a();
        w4aVar.C = false;
        w4aVar.m = false;
        w4aVar.n(350L);
        w4aVar.o(k43.h);
        w4aVar.D = (byte) 40;
        this.n1.setItemAnimator(w4aVar);
        this.p2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i2 = linearLayout2;
        linearLayout2.setOrientation(1);
        int i7 = i3;
        ColorDrawable colorDrawable = new ColorDrawable(aob.v0(i7, this.J0));
        int i8 = this.u0;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i8, 0, i8, 0));
        int i9 = this.u0;
        linearLayout2.setPadding(i9, 0, i9, 0);
        this.b.addView(linearLayout2, tre.e(-1, -2, 87));
        View view = new View(context);
        yob.h(aob.K5, this.J0, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tre.z(-1.0f), tre.z(1.0f / hl.p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i10 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = hl.L(6.0f);
        int i11 = aob.a7;
        Drawable b0 = aob.b0(L, aob.v0(i11, this.J0));
        uob M = yob.M(i11);
        vnb vnbVar2 = this.J0;
        frameLayout.setBackground(b0);
        yob.j(frameLayout, b0, M, null, vnbVar2);
        if (starGift != null) {
            if (starGift.auction) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.k2 = frameLayout2;
                frameLayout2.addView(frameLayout, tre.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
                yob.h(i7, this.J0, frameLayout2);
                TextView textView = new TextView(context);
                textView.setTextSize(1, 13.0f);
                textView.setGravity(19);
                textView.setTypeface(hl.o());
                int i12 = aob.G6;
                yob.X(textView, i12, this.J0);
                if (starGift != null) {
                    textView.setText(ob6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
                }
                TextView l = ik8.l(frameLayout, textView, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
                l.setTextSize(1, 13.0f);
                l.setGravity(21);
                l.setTypeface(hl.o());
                yob.X(l, i12, this.J0);
                if (starGift != null) {
                    l.setText(ob6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
                }
                frameLayout.addView(l, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                View x4aVar = new x4a(context, starGift, i10);
                int L2 = hl.L(6.0f);
                int i13 = aob.Fi;
                Drawable b02 = aob.b0(L2, aob.v0(i13, this.J0));
                uob M2 = yob.M(i13);
                vnb vnbVar3 = this.J0;
                x4aVar.setBackground(b02);
                yob.j(x4aVar, b02, M2, null, vnbVar3);
                frameLayout.addView(x4aVar, tre.e(-1, -1, jn7.D1));
                y4a y4aVar = new y4a(context, i10);
                y4aVar.setWillNotDraw(false);
                frameLayout.addView(y4aVar, tre.e(-1, -1, jn7.D1));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 13.0f);
                textView2.setGravity(19);
                textView2.setTypeface(hl.o());
                textView2.setTextColor(-1);
                if (starGift != null) {
                    textView2.setText(ob6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
                }
                y4aVar.addView(textView2, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 13.0f);
                textView3.setGravity(21);
                textView3.setTypeface(hl.o());
                textView3.setTextColor(-1);
                if (starGift != null) {
                    textView3.setText(ob6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
                }
                y4aVar.addView(textView3, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                c51 c51Var = new c51(this.J0, context, true);
                this.j2 = c51Var;
                c51Var.f();
                c1(false);
                linearLayout2.addView(c51Var, tre.t(-1, 48, jn7.D1, 10, 10, 10, 10));
                c51Var.setOnClickListener(new az(this, j, context, runnable, starGift, (byte) 3));
                as asVar = this.m1;
                this.J1 = true;
                asVar.j1(true);
                this.p2.O(false);
                this.m1.g1(this.p2.E.size(), hl.L(200.0f));
                d79 d79Var = this.n1;
                int i14 = this.u0;
                d79Var.setPadding(i14, 0, i14, hl.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
                this.n1.i(new z4a(this));
                this.n1.setOnItemClickListener(new r69() { // from class: s4a
                    @Override // r69
                    public final void e(int i15, View view2) {
                        TL_stars.StarGift starGift2;
                        a5a a5aVar = a5a.this;
                        TL_stars.StarGift starGift3 = a5aVar.X1;
                        boolean z7 = a5aVar.S1;
                        dl1 dl1Var2 = a5aVar.f2;
                        TLRPC.MessageAction messageAction = a5aVar.g2;
                        r47 r47Var2 = a5aVar.h2;
                        l9c l9cVar = a5aVar.p2;
                        if (!a5aVar.J1) {
                            i15--;
                        }
                        b8c G = l9cVar.G(i15);
                        if (G != null) {
                            int i16 = G.d;
                            if (i16 == 1) {
                                boolean z8 = !a5aVar.l2;
                                a5aVar.l2 = z8;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                                }
                                r47Var2.Z5();
                                dl1Var2.i0(r47Var2, true);
                                a5aVar.p2.O(true);
                                return;
                            }
                            if (i16 == 2) {
                                if (z || z2) {
                                    int i17 = -a5aVar.q2;
                                    a5aVar.q2 = i17;
                                    hl.A3(i17, view2, null);
                                    return;
                                }
                                boolean z9 = a5aVar.m2;
                                a5aVar.m2 = !z9;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                                    tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                                    tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                                    tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                                }
                                r47Var2.Z5();
                                dl1Var2.i0(r47Var2, true);
                                a5aVar.p2.O(true);
                                a5aVar.c1(true);
                                return;
                            }
                            if (i16 == 3) {
                                boolean z10 = a5aVar.n2;
                                a5aVar.n2 = !z10;
                                boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                                pw4 pw4Var2 = pw4Var;
                                if (z11) {
                                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftPremium3.currency = pw4Var2.a();
                                        long e3 = pw4Var2.e();
                                        tL_messageActionGiftPremium3.amount = e3;
                                        if (pw4Var2.h != null) {
                                            tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                        }
                                    } else {
                                        tL_messageActionGiftPremium3.currency = "XTR";
                                        tL_messageActionGiftPremium3.amount = pw4Var2.g();
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftCode2.currency = pw4Var2.a();
                                        long e4 = pw4Var2.e();
                                        tL_messageActionGiftCode2.amount = e4;
                                        if (pw4Var2.h != null) {
                                            tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                        }
                                    } else {
                                        tL_messageActionGiftCode2.currency = "XTR";
                                        tL_messageActionGiftCode2.amount = pw4Var2.g();
                                    }
                                }
                                r47Var2.Z5();
                                dl1Var2.i0(r47Var2, true);
                                a5aVar.p2.O(true);
                                a5aVar.c1(true);
                            }
                        }
                    }
                });
                this.o1.setTitle(K0());
            }
            if (starGift.limited) {
                i4 = 0;
                frameLayout.setVisibility(i4);
                linearLayout2.addView(frameLayout, tre.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
                this.k2 = null;
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 13.0f);
                textView4.setGravity(19);
                textView4.setTypeface(hl.o());
                int i122 = aob.G6;
                yob.X(textView4, i122, this.J0);
                if (starGift != null) {
                }
                TextView l2 = ik8.l(frameLayout, textView4, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
                l2.setTextSize(1, 13.0f);
                l2.setGravity(21);
                l2.setTypeface(hl.o());
                yob.X(l2, i122, this.J0);
                if (starGift != null) {
                }
                frameLayout.addView(l2, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                View x4aVar2 = new x4a(context, starGift, i10);
                int L22 = hl.L(6.0f);
                int i132 = aob.Fi;
                Drawable b022 = aob.b0(L22, aob.v0(i132, this.J0));
                uob M22 = yob.M(i132);
                vnb vnbVar32 = this.J0;
                x4aVar2.setBackground(b022);
                yob.j(x4aVar2, b022, M22, null, vnbVar32);
                frameLayout.addView(x4aVar2, tre.e(-1, -1, jn7.D1));
                y4a y4aVar2 = new y4a(context, i10);
                y4aVar2.setWillNotDraw(false);
                frameLayout.addView(y4aVar2, tre.e(-1, -1, jn7.D1));
                TextView textView22 = new TextView(context);
                textView22.setTextSize(1, 13.0f);
                textView22.setGravity(19);
                textView22.setTypeface(hl.o());
                textView22.setTextColor(-1);
                if (starGift != null) {
                }
                y4aVar2.addView(textView22, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
                TextView textView32 = new TextView(context);
                textView32.setTextSize(1, 13.0f);
                textView32.setGravity(21);
                textView32.setTypeface(hl.o());
                textView32.setTextColor(-1);
                if (starGift != null) {
                }
                y4aVar2.addView(textView32, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
                c51 c51Var2 = new c51(this.J0, context, true);
                this.j2 = c51Var2;
                c51Var2.f();
                c1(false);
                linearLayout2.addView(c51Var2, tre.t(-1, 48, jn7.D1, 10, 10, 10, 10));
                c51Var2.setOnClickListener(new az(this, j, context, runnable, starGift, (byte) 3));
                as asVar2 = this.m1;
                this.J1 = true;
                asVar2.j1(true);
                this.p2.O(false);
                this.m1.g1(this.p2.E.size(), hl.L(200.0f));
                d79 d79Var2 = this.n1;
                int i142 = this.u0;
                d79Var2.setPadding(i142, 0, i142, hl.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
                this.n1.i(new z4a(this));
                this.n1.setOnItemClickListener(new r69() { // from class: s4a
                    @Override // r69
                    public final void e(int i15, View view2) {
                        TL_stars.StarGift starGift2;
                        a5a a5aVar = a5a.this;
                        TL_stars.StarGift starGift3 = a5aVar.X1;
                        boolean z7 = a5aVar.S1;
                        dl1 dl1Var2 = a5aVar.f2;
                        TLRPC.MessageAction messageAction = a5aVar.g2;
                        r47 r47Var2 = a5aVar.h2;
                        l9c l9cVar = a5aVar.p2;
                        if (!a5aVar.J1) {
                            i15--;
                        }
                        b8c G = l9cVar.G(i15);
                        if (G != null) {
                            int i16 = G.d;
                            if (i16 == 1) {
                                boolean z8 = !a5aVar.l2;
                                a5aVar.l2 = z8;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                                }
                                r47Var2.Z5();
                                dl1Var2.i0(r47Var2, true);
                                a5aVar.p2.O(true);
                                return;
                            }
                            if (i16 == 2) {
                                if (z || z2) {
                                    int i17 = -a5aVar.q2;
                                    a5aVar.q2 = i17;
                                    hl.A3(i17, view2, null);
                                    return;
                                }
                                boolean z9 = a5aVar.m2;
                                a5aVar.m2 = !z9;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                                    tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                                    tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                                    tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                                }
                                r47Var2.Z5();
                                dl1Var2.i0(r47Var2, true);
                                a5aVar.p2.O(true);
                                a5aVar.c1(true);
                                return;
                            }
                            if (i16 == 3) {
                                boolean z10 = a5aVar.n2;
                                a5aVar.n2 = !z10;
                                boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                                pw4 pw4Var2 = pw4Var;
                                if (z11) {
                                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftPremium3.currency = pw4Var2.a();
                                        long e3 = pw4Var2.e();
                                        tL_messageActionGiftPremium3.amount = e3;
                                        if (pw4Var2.h != null) {
                                            tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                        }
                                    } else {
                                        tL_messageActionGiftPremium3.currency = "XTR";
                                        tL_messageActionGiftPremium3.amount = pw4Var2.g();
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                                    if (z10) {
                                        tL_messageActionGiftCode2.currency = pw4Var2.a();
                                        long e4 = pw4Var2.e();
                                        tL_messageActionGiftCode2.amount = e4;
                                        if (pw4Var2.h != null) {
                                            tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                        }
                                    } else {
                                        tL_messageActionGiftCode2.currency = "XTR";
                                        tL_messageActionGiftCode2.amount = pw4Var2.g();
                                    }
                                }
                                r47Var2.Z5();
                                dl1Var2.i0(r47Var2, true);
                                a5aVar.p2.O(true);
                                a5aVar.c1(true);
                            }
                        }
                    }
                });
                this.o1.setTitle(K0());
            }
        }
        i4 = 8;
        frameLayout.setVisibility(i4);
        linearLayout2.addView(frameLayout, tre.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
        this.k2 = null;
        TextView textView42 = new TextView(context);
        textView42.setTextSize(1, 13.0f);
        textView42.setGravity(19);
        textView42.setTypeface(hl.o());
        int i1222 = aob.G6;
        yob.X(textView42, i1222, this.J0);
        if (starGift != null) {
        }
        TextView l22 = ik8.l(frameLayout, textView42, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l22.setTextSize(1, 13.0f);
        l22.setGravity(21);
        l22.setTypeface(hl.o());
        yob.X(l22, i1222, this.J0);
        if (starGift != null) {
        }
        frameLayout.addView(l22, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View x4aVar22 = new x4a(context, starGift, i10);
        int L222 = hl.L(6.0f);
        int i1322 = aob.Fi;
        Drawable b0222 = aob.b0(L222, aob.v0(i1322, this.J0));
        uob M222 = yob.M(i1322);
        vnb vnbVar322 = this.J0;
        x4aVar22.setBackground(b0222);
        yob.j(x4aVar22, b0222, M222, null, vnbVar322);
        frameLayout.addView(x4aVar22, tre.e(-1, -1, jn7.D1));
        y4a y4aVar22 = new y4a(context, i10);
        y4aVar22.setWillNotDraw(false);
        frameLayout.addView(y4aVar22, tre.e(-1, -1, jn7.D1));
        TextView textView222 = new TextView(context);
        textView222.setTextSize(1, 13.0f);
        textView222.setGravity(19);
        textView222.setTypeface(hl.o());
        textView222.setTextColor(-1);
        if (starGift != null) {
        }
        y4aVar22.addView(textView222, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView322 = new TextView(context);
        textView322.setTextSize(1, 13.0f);
        textView322.setGravity(21);
        textView322.setTypeface(hl.o());
        textView322.setTextColor(-1);
        if (starGift != null) {
        }
        y4aVar22.addView(textView322, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        c51 c51Var22 = new c51(this.J0, context, true);
        this.j2 = c51Var22;
        c51Var22.f();
        c1(false);
        linearLayout2.addView(c51Var22, tre.t(-1, 48, jn7.D1, 10, 10, 10, 10));
        c51Var22.setOnClickListener(new az(this, j, context, runnable, starGift, (byte) 3));
        as asVar22 = this.m1;
        this.J1 = true;
        asVar22.j1(true);
        this.p2.O(false);
        this.m1.g1(this.p2.E.size(), hl.L(200.0f));
        d79 d79Var22 = this.n1;
        int i1422 = this.u0;
        d79Var22.setPadding(i1422, 0, i1422, hl.L(68 + ((starGift == null && starGift.limited && this.k2 == null) ? 40 : 0)));
        this.n1.i(new z4a(this));
        this.n1.setOnItemClickListener(new r69() { // from class: s4a
            @Override // r69
            public final void e(int i15, View view2) {
                TL_stars.StarGift starGift2;
                a5a a5aVar = a5a.this;
                TL_stars.StarGift starGift3 = a5aVar.X1;
                boolean z7 = a5aVar.S1;
                dl1 dl1Var2 = a5aVar.f2;
                TLRPC.MessageAction messageAction = a5aVar.g2;
                r47 r47Var2 = a5aVar.h2;
                l9c l9cVar = a5aVar.p2;
                if (!a5aVar.J1) {
                    i15--;
                }
                b8c G = l9cVar.G(i15);
                if (G != null) {
                    int i16 = G.d;
                    if (i16 == 1) {
                        boolean z8 = !a5aVar.l2;
                        a5aVar.l2 = z8;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z8;
                        }
                        r47Var2.Z5();
                        dl1Var2.i0(r47Var2, true);
                        a5aVar.p2.O(true);
                        return;
                    }
                    if (i16 == 2) {
                        if (z || z2) {
                            int i17 = -a5aVar.q2;
                            a5aVar.q2 = i17;
                            hl.A3(i17, view2, null);
                            return;
                        }
                        boolean z9 = a5aVar.m2;
                        a5aVar.m2 = !z9;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction;
                            tL_messageActionStarGift3.can_upgrade = !z9 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                            tL_messageActionStarGift3.upgrade_stars = (z7 || z9) ? 0L : starGift3.upgrade_stars;
                            tL_messageActionStarGift3.convert_stars = z9 ? starGift3.convert_stars : 0L;
                        }
                        r47Var2.Z5();
                        dl1Var2.i0(r47Var2, true);
                        a5aVar.p2.O(true);
                        a5aVar.c1(true);
                        return;
                    }
                    if (i16 == 3) {
                        boolean z10 = a5aVar.n2;
                        a5aVar.n2 = !z10;
                        boolean z11 = messageAction instanceof TLRPC.TL_messageActionGiftPremium;
                        pw4 pw4Var2 = pw4Var;
                        if (z11) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium3 = (TLRPC.TL_messageActionGiftPremium) messageAction;
                            if (z10) {
                                tL_messageActionGiftPremium3.currency = pw4Var2.a();
                                long e3 = pw4Var2.e();
                                tL_messageActionGiftPremium3.amount = e3;
                                if (pw4Var2.h != null) {
                                    tL_messageActionGiftPremium3.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftPremium3.currency) - 6) * e3);
                                }
                            } else {
                                tL_messageActionGiftPremium3.currency = "XTR";
                                tL_messageActionGiftPremium3.amount = pw4Var2.g();
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction;
                            if (z10) {
                                tL_messageActionGiftCode2.currency = pw4Var2.a();
                                long e4 = pw4Var2.e();
                                tL_messageActionGiftCode2.amount = e4;
                                if (pw4Var2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_messageActionGiftCode2.currency) - 6) * e4);
                                }
                            } else {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = pw4Var2.g();
                            }
                        }
                        r47Var2.Z5();
                        dl1Var2.i0(r47Var2, true);
                        a5aVar.p2.O(true);
                        a5aVar.c1(true);
                    }
                }
            }
        });
        this.o1.setTitle(K0());
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.T1, 0, true, new p4a(this, (byte) 0), this.J0);
        this.p2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return ob6.M0(this.S1 ? 2131749884 : 2131749890, null);
    }

    public final TLRPC.TL_textWithEntities Z0() {
        if (uc7.s1(this.T1).M1(this.U1) > 0) {
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

    public d31 a1() {
        e S = LaunchActivity.S();
        if (S == null) {
            return null;
        }
        return d31.b0(S);
    }

    public final void b1(boolean z) {
        int i = this.T1;
        uc7 s1 = uc7.s1(i);
        long j = this.U1;
        TLRPC.UserFull Y1 = s1.Y1(j);
        TLObject b2 = uc7.s1(i).b2(j);
        int i2 = 0;
        if (Y1 != null && (b2 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) b2;
            user.premium = true;
            uc7.s1(i).i4(user, true, false);
            jn7.f(i).k(jn7.E0, Long.valueOf(user.id), Y1);
        }
        e eVar = this.r1;
        if (eVar != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) eVar.getParentActivity()).N().getFragmentStack());
            wk5 parentLayout = eVar.getParentLayout();
            int size = arrayList.size();
            zu1 zu1Var = null;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                e eVar2 = (e) obj;
                if (eVar2 instanceof zu1) {
                    zu1Var = (zu1) eVar2;
                    if (zu1Var.a() != j) {
                        eVar2.removeSelfFromStack();
                    }
                } else if (eVar2 instanceof ProfileActivity) {
                    if (z && parentLayout.getLastFragment() == eVar2) {
                        eVar2.finishFragment();
                    } else {
                        eVar2.removeSelfFromStack();
                    }
                }
            }
            if (zu1Var == null || zu1Var.a() != j) {
                ((ActionBarLayout) parentLayout).T(new zu1(qu6.k(j, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void c1(boolean z) {
        CharSequence charSequence;
        kv4 kv4Var = this.Y1;
        int i = this.T1;
        c51 c51Var = this.j2;
        if (kv4Var != null) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            boolean g = this.Y1.g(currentTime);
            kv4 kv4Var2 = this.Y1;
            if (g) {
                int i2 = kv4Var2.d.auction_start_date - currentTime;
                c51Var.i(ob6.M0(2131750301, null), z, true);
                c51Var.g(ob6.a0(null, null, 2131750296, ob6.c0(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var2.f;
            if (tL_starGiftAuctionState == null) {
                c51Var.i(ob6.M0(2131750306, null), z, true);
                c51Var.g(null, z);
                return;
            } else {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                c51Var.i(ob6.M0(2131750306, null), z, true);
                c51Var.g(ob6.a0(null, null, 2131750282, ob6.c0(i3)), z);
                return;
            }
        }
        TL_stars.StarGift starGift = this.X1;
        wm2[] wm2VarArr = this.r2;
        if (starGift != null) {
            long j = jxa.v(i, false).m().amount;
            long j2 = starGift.stars + (this.m2 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.o2.getText()) ? 0L : this.e2);
            c51Var.i(nza.Z0(false, ob6.H(',', this.S1 ? "Gift2SendSelf" : "Gift2Send", (int) j2), wm2VarArr), z, true);
            if (!jxa.v(i, false).e || j2 <= j) {
                c51Var.g(null, z);
                return;
            } else {
                c51Var.g(ob6.H(',', "Gift2SendYourBalance", (int) j), z);
                return;
            }
        }
        pw4 pw4Var = this.Z1;
        if (pw4Var != null) {
            if (this.n2) {
                c51Var.i(nza.U0(ob6.a0(null, null, 2131749940, ob6.E(pw4Var.g(), ',')), 1.0f, wm2VarArr), z, true);
                wm2VarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                c51Var.i(new SpannableStringBuilder(ob6.a0(null, null, 2131749941, pw4Var.c())), z, true);
            }
            c51Var.g(charSequence, z);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.A3) {
            c1(true);
            l9c l9cVar = this.p2;
            if (l9cVar == null || this.Z1 == null) {
                return;
            }
            l9cVar.O(true);
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        v4a v4aVar = this.o2;
        int emojiPadding = v4aVar.b.getEmojiPadding();
        lt3 lt3Var = v4aVar.b;
        if (emojiPadding > 0) {
            lt3Var.k(true);
            return;
        }
        if (lt3Var.w) {
            lt3Var.d();
            return;
        }
        lt3Var.r();
        if (this.Y1 != null) {
            ov4.c(this.T1).n(this.Y1.b, this);
        }
        this.s2 = true;
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.T1).b(this, jn7.A3);
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        v4a v4aVar = this.o2;
        int emojiPadding = v4aVar.b.getEmojiPadding();
        lt3 lt3Var = v4aVar.b;
        if (emojiPadding > 0) {
            lt3Var.k(true);
        } else if (lt3Var.w) {
            lt3Var.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.T1).n(this, jn7.A3);
    }

    @Override // nx0
    public final void p0() {
        try {
            super.p0();
            LinearLayout linearLayout = this.i2;
            if (linearLayout != null) {
                int v0 = aob.v0(aob.h5, this.J0);
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
            oz4 oz4Var = this.t2;
            if (oz4Var != null) {
                oz4Var.a(aob.v0(aob.h5, this.J0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nv4
    public final void q(kv4 kv4Var) {
        this.Y1 = kv4Var;
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        v4a v4aVar = this.o2;
        if (v4aVar != null) {
            v4aVar.b.s();
        }
        super.show();
    }

    @Override // nx0
    public final void x() {
        this.n1.c0();
    }
}
