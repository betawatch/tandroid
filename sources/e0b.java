// default package

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class e0b extends nx0 implements fn7 {
    public final m96 A1;
    public final h96 B1;
    public final View C1;
    public final og2 D1;
    public final i94 E1;
    public final r47 F1;
    public final ArrayList G1;
    public final ie0 H1;
    public int I1;
    public b58 J1;
    public int K1;
    public z86 L1;
    public final wm2[] M1;
    public boolean N1;
    public boolean O1;
    public zu1 P1;
    public View Q1;
    public ValueAnimator R1;
    public final vnb l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final LinearLayout p1;
    public final FrameLayout q1;
    public final LinearLayout r1;
    public final tza s1;
    public final FrameLayout t1;
    public final FrameLayout u1;
    public final de0 v1;
    public final c51 w1;
    public final d0b x1;
    public long y1;
    public long z1;

    /* JADX WARN: Removed duplicated region for block: B:102:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0635 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0667 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04a7  */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.String, vnb] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0b(Context context, final int i, final long j, zu1 zu1Var, r47 r47Var, ArrayList arrayList, boolean z, final boolean z2, long j2, final vnb vnbVar) {
        super(1, vnbVar, context, false);
        TLRPC.MessageReactor messageReactor;
        long x;
        LinearLayout linearLayout;
        TextView textView;
        int[] iArr;
        String a0;
        String str;
        d0b d0bVar;
        LinearLayout j3;
        ?? r14;
        long j4;
        Context context2;
        p66 p66Var;
        int i2;
        this.M1 = new wm2[1];
        this.O1 = false;
        this.l1 = vnbVar;
        this.m1 = i;
        this.F1 = r47Var;
        this.G1 = arrayList;
        this.n1 = z2;
        this.o1 = z;
        ie0 ie0Var = new ie0(i, vnbVar, context);
        this.H1 = ie0Var;
        ie0Var.setScaleX(0.6f);
        ie0Var.setScaleY(0.6f);
        ie0Var.setAlpha(0.0f);
        this.c.addView(ie0Var, tre.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        iye.a(ie0Var);
        ie0Var.setOnClickListener(new ly(context, vnbVar, (byte) 3));
        long e = yac.h(i).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long n = wf3.n(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    n = e;
                }
                if (messageReactor3.my || n == e) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
        } else {
            messageReactor = null;
        }
        boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z2) {
            if (arrayList != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i4)).my) {
                        break;
                    }
                    i4++;
                }
            }
            x = j2;
            this.y1 = x;
        } else {
            x = jxa.v(i, false).x(r47Var);
            this.y1 = x;
        }
        this.z1 = x == 2666000 ? e : x;
        K(aob.v0(aob.h5, vnbVar));
        this.I1 = this.H0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.p1 = linearLayout2;
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.q1 = frameLayout;
        linearLayout2.addView(frameLayout, tre.o(-1, -2));
        this.s1 = new tza(this, context, vnbVar, z2, i);
        int i5 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long f = uc7.s1(i).k4.G2.f();
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = z3;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            int i7 = iArr2[i6];
            int[] iArr3 = iArr2;
            if (i7 > f) {
                arrayList2.add(Integer.valueOf((int) f));
                break;
            }
            arrayList2.add(Integer.valueOf(i7));
            if (iArr3[i6] == f) {
                break;
            }
            i6++;
            iArr2 = iArr3;
            i5 = 9;
        }
        int[] iArr4 = new int[arrayList2.size()];
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            iArr4[i8] = ((Integer) arrayList2.get(i8)).intValue();
        }
        tza tzaVar = this.s1;
        tzaVar.f0 = iArr4;
        if (!z) {
            if (z2) {
                tzaVar.setAlpha(0.5f);
            }
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.r1 = linearLayout3;
            linearLayout3.setOrientation(0);
            if (!z2) {
                this.q1.addView(linearLayout3, tre.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.t1 = frameLayout2;
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.u1 = frameLayout3;
            int L = hl.L(14.0f);
            int i9 = aob.i5;
            ShapeDrawable b0 = aob.b0(L, aob.v0(i9, vnbVar));
            uob M = yob.M(i9);
            frameLayout3.setBackground(b0);
            yob.j(frameLayout3, b0, M, null, vnbVar);
            de0 de0Var = new de0(context);
            this.v1 = de0Var;
            de0Var.setRoundRadius(hl.L(14.0f));
            de0Var.getImageReceiver().B0 = true;
            I0();
            frameLayout3.addView(de0Var, tre.e(28, 28, jn7.z1));
            ImageView imageView = new ImageView(context);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            int i10 = aob.r5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            yob.s(imageView, i10, vnbVar, mode);
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, tre.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, tre.e(52, 28, 17));
            frameLayout2.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), 0);
            linearLayout3.addView(frameLayout2, tre.q(-2, -1, 0.0f, jn7.z1, 6, 4, 6, 0));
            iye.a(frameLayout2);
            kt0.g(i).o();
            c19 c19Var = new c19(context, (byte) 3);
            int i11 = aob.G6;
            yob.X(c19Var, i11, vnbVar);
            c19Var.setTextSize(1, 20.0f);
            c19Var.setGravity(17);
            c19Var.setText(ob6.M0(2131744695, null));
            c19Var.setTypeface(hl.o());
            c19Var.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout3.addView(c19Var, tre.q(-1, -2, 1.0f, jn7.D1, 2, 0, 2, 0));
            final byte b = 0;
            H0(false);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.ic_close_white);
            yob.s(imageView2, aob.W5, vnbVar, mode);
            iye.a(imageView2);
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: qza
                public final /* synthetic */ e0b b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    e0b e0bVar = this.b;
                    switch (b2) {
                        case 0:
                            e0bVar.dismiss();
                            break;
                        default:
                            og2 og2Var = e0bVar.D1;
                            og2Var.a(!og2Var.a.q, true);
                            e0bVar.y1 = og2Var.a.q ? e0bVar.z1 : 2666000L;
                            e0bVar.I0();
                            d0b d0bVar2 = e0bVar.x1;
                            if (d0bVar2 != null) {
                                d0bVar2.setMyPrivacy(e0bVar.y1);
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout3.addView(imageView2, tre.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.q1.addView(linearLayout, tre.d(-1, -2.0f, 55, 0.0f, z2 ? z ? 179.0f : 45.0f : 0.0f, 0.0f, 15.0f));
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            textView = new TextView(context);
            yob.X(textView, i11, vnbVar);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setSingleLine(false);
            textView.setMaxLines(3);
            if (messageReactor == null) {
                a0 = ob6.H(',', "StarsReactionTextSent", messageReactor.count);
                iArr = null;
            } else {
                iArr = null;
                a0 = ob6.a0(null, null, 2131744700, M0 == null ? "" : M0.title);
            }
            textView.setText(pv3.m(hl.S2(a0), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
            if (z && !z2) {
                linearLayout.addView(textView, tre.t(-1, -2, 55, 40, 0, 40, 0));
            }
            if (z4) {
                str = null;
                this.x1 = null;
                this.C1 = null;
                d0bVar = null;
            } else {
                if (!z2) {
                    linearLayout.addView(new gla(context, vnbVar), tre.t(-1, 30, 55, 0, 20, 0, 0));
                }
                d0bVar = new d0b(this, context, z2);
                this.x1 = d0bVar;
                d0bVar.setOnSenderClickListener(new pcc() { // from class: rza
                    @Override // pcc
                    public final void a(Object obj2) {
                        Long l = (Long) obj2;
                        e S = LaunchActivity.S();
                        if (S == null) {
                            return;
                        }
                        long longValue = l.longValue();
                        e0b e0bVar = e0b.this;
                        boolean z5 = z2;
                        if (longValue >= 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", l.longValue());
                            if (l.longValue() == yac.h(i).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                            S.presentFragment(new uza(e0bVar, bundle, z5));
                            e0bVar.dismiss();
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", -l.longValue());
                            S.presentFragment(new vza(e0bVar, bundle2, z5));
                        }
                        e0bVar.dismiss();
                    }
                });
                this.p1.addView(d0bVar, tre.k(0.0f, z2 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, jn7.u1));
                View view = new View(context);
                this.C1 = view;
                yob.h(aob.d7, vnbVar, view);
                if (!z2 && (z || messageReactor != null)) {
                    this.p1.addView(view, tre.n(1.0f / hl.p, -1, 7, 24, 0, 24, 0));
                }
                str = null;
            }
            if (z2) {
                int i12 = aob.j5;
                TextView b2 = zze.b(context, 20.0f, i12, true, vnbVar);
                b2.setGravity(17);
                b2.setText(ob6.M0(z ? 2131748545 : 2131748547, str));
                this.p1.addView(b2, tre.t(-1, -2, 7, 32, 6, 32, 9));
                TextView b3 = zze.b(context, 14.0f, i12, false, vnbVar);
                b3.setGravity(17);
                uh9.r(null, null, z ? 2131748546 : z4 ? 2131748548 : 2131748549, new Object[]{wf3.k(yac.t0, j)}, b3);
                this.p1.addView(b3, tre.t(-1, -2, 7, 32, 0, 32, 20));
            }
            if (z2) {
                m96 m96Var = new m96();
                this.A1 = m96Var;
                m96Var.c = this.y1;
                m96Var.g = 50L;
                m96Var.e = true;
                h96 h96Var = new h96(i, context, true);
                this.B1 = h96Var;
                h96Var.set(m96Var);
                this.p1.addView(h96Var, tre.t(-2, -2, 17, 32, 0, 32, 20));
            }
            og2 og2Var = new og2(21, vnbVar, context);
            this.D1 = og2Var;
            og2Var.b(aob.h7, aob.j7, aob.k7);
            og2Var.setDrawUnchecked(true);
            og2Var.a(this.y1 == 2666000, false);
            if (d0bVar != null) {
                d0bVar.setMyPrivacy(this.y1);
            }
            og2Var.setDrawBackgroundAsArc(10);
            TextView textView2 = new TextView(context);
            yob.X(textView2, i11, vnbVar);
            textView2.setTextSize(1, 14.0f);
            textView2.setText(ob6.M0(2131744703, null));
            j3 = uh9.j(context, 0);
            j3.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
            j3.addView(og2Var, tre.t(21, 21, 16, 0, 0, 9, 0));
            j3.addView(textView2, tre.r(-2, -2, 16));
            final byte b4 = 1;
            j3.setOnClickListener(new View.OnClickListener(this) { // from class: qza
                public final /* synthetic */ e0b b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b22 = b4;
                    e0b e0bVar = this.b;
                    switch (b22) {
                        case 0:
                            e0bVar.dismiss();
                            break;
                        default:
                            og2 og2Var2 = e0bVar.D1;
                            og2Var2.a(!og2Var2.a.q, true);
                            e0bVar.y1 = og2Var2.a.q ? e0bVar.z1 : 2666000L;
                            e0bVar.I0();
                            d0b d0bVar2 = e0bVar.x1;
                            if (d0bVar2 != null) {
                                d0bVar2.setMyPrivacy(e0bVar.y1);
                                break;
                            }
                            break;
                    }
                }
            });
            iye.b(j3, 0.05f, 1.2f);
            int i13 = aob.i6;
            hf0 Y = aob.Y(aob.v0(i13, vnbVar), 6, 6);
            uob M2 = yob.M(i13);
            j3.setBackground(Y);
            yob.j(j3, Y, null, M2, vnbVar);
            if (!z2 && (z || messageReactor != null)) {
                this.p1.addView(j3, tre.t(-2, -2, 1, 0, !z4 ? 10 : 4, 0, 10));
            }
            c51 c51Var = new c51(vnbVar, context, true);
            this.w1 = c51Var;
            c51Var.f();
            if (!z) {
                if (z2) {
                    c51Var.setAlpha(0.5f);
                    c51Var.setEnabled(false);
                }
                J0(0L);
                c51Var.i(nza.Z0(false, ob6.a0(null, null, 2131744704, ob6.E(50L, ',')), this.M1), true, true);
                if (z) {
                    r14 = 0;
                    j4 = 0;
                    context2 = context;
                    c51Var.setOnClickListener(new cya(this, r47Var, zu1Var, i, z2, context, vnbVar, j, M0));
                } else {
                    r14 = 0;
                    j4 = 0;
                    context2 = context;
                }
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: sza
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        long j5;
                        int i14 = i;
                        kt0 g = kt0.g(i14);
                        g.o();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = g.l;
                        if (arrayList4 != null) {
                            arrayList3.addAll(arrayList4);
                        }
                        arrayList3.add(0, yac.h(i14).f());
                        e0b e0bVar = e0b.this;
                        fu5 G = fu5.G(e0bVar.b, vnbVar, e0bVar.u1);
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            int i16 = i15 + 1;
                            TLObject tLObject = (TLObject) arrayList3.get(i15);
                            if (tLObject instanceof TLRPC.User) {
                                j5 = ((TLRPC.User) tLObject).id;
                            } else {
                                if (tLObject instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                    if (xc2.V(chat)) {
                                        j5 = -chat.id;
                                    }
                                }
                                i15 = i16;
                            }
                            if (j5 != j) {
                                long j6 = e0bVar.y1;
                                G.f(tLObject, j5 == j6 || (j6 == 0 && j5 == yac.h(i14).e()), new dp2((Object) e0bVar, j5, z2, (byte) 2));
                            }
                            i15 = i16;
                        }
                        G.t = false;
                        G.e0 = true;
                        G.s = (short) 0;
                        G.W(5);
                        G.a0();
                    }
                });
                p66Var = new p66(context2, vnbVar);
                p66Var.setTextSize(1, 13.0f);
                yob.X(p66Var, aob.z6, vnbVar);
                if (z2 || z) {
                    i2 = 0;
                    p66Var.setText(hl.N2(ob6.M0(2131744702, r14), -1, 0, new xf1(context2, (byte) 21), r14));
                } else {
                    p66Var.setText(ob6.M0(2131748550, r14));
                    i2 = 0;
                }
                p66Var.setGravity(17);
                yob.G(p66Var, aob.k5, vnbVar);
                if (!z || z2) {
                    this.p1.addView(p66Var, tre.t(-1, -2, 17, 14, 8, 14, 12));
                }
                this.O = this.p1;
                i94 i94Var = new i94(context2, 1, 2, (byte) 5);
                this.E1 = i94Var;
                ys4 ys4Var = i94Var.b;
                ys4Var.z = aob.Wk;
                ys4Var.A = aob.Xk;
                ys4Var.b();
                i94Var.b.k = 1.0f;
                i94Var.setVisibility(4);
                i94Var.setPaused(true);
                this.c.addView(i94Var, tre.c(150.0f, jn7.f2));
                this.s1.setValue(50);
                if (arrayList != null) {
                    long j5 = j4;
                    for (int i14 = i2; i14 < arrayList.size(); i14++) {
                        long j6 = ((TLRPC.MessageReactor) arrayList.get(i14)).count;
                        if (j6 > j5) {
                            j5 = j6;
                        }
                    }
                    j5 = messageReactor != null ? j5 - messageReactor.count : j5;
                    if (j5 > j4) {
                        this.s1.setStarsTop(j5 + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            this.p1.addView(c51Var, tre.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
            J0(0L);
            c51Var.i(nza.Z0(false, ob6.a0(null, null, 2131744704, ob6.E(50L, ',')), this.M1), true, true);
            if (z) {
            }
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: sza
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    long j52;
                    int i142 = i;
                    kt0 g = kt0.g(i142);
                    g.o();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = g.l;
                    if (arrayList4 != null) {
                        arrayList3.addAll(arrayList4);
                    }
                    arrayList3.add(0, yac.h(i142).f());
                    e0b e0bVar = e0b.this;
                    fu5 G = fu5.G(e0bVar.b, vnbVar, e0bVar.u1);
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        int i16 = i15 + 1;
                        TLObject tLObject = (TLObject) arrayList3.get(i15);
                        if (tLObject instanceof TLRPC.User) {
                            j52 = ((TLRPC.User) tLObject).id;
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (xc2.V(chat)) {
                                    j52 = -chat.id;
                                }
                            }
                            i15 = i16;
                        }
                        if (j52 != j) {
                            long j62 = e0bVar.y1;
                            G.f(tLObject, j52 == j62 || (j62 == 0 && j52 == yac.h(i142).e()), new dp2((Object) e0bVar, j52, z2, (byte) 2));
                        }
                        i15 = i16;
                    }
                    G.t = false;
                    G.e0 = true;
                    G.s = (short) 0;
                    G.W(5);
                    G.a0();
                }
            });
            p66Var = new p66(context2, vnbVar);
            p66Var.setTextSize(1, 13.0f);
            yob.X(p66Var, aob.z6, vnbVar);
            if (z2) {
            }
            i2 = 0;
            p66Var.setText(hl.N2(ob6.M0(2131744702, r14), -1, 0, new xf1(context2, (byte) 21), r14));
            p66Var.setGravity(17);
            yob.G(p66Var, aob.k5, vnbVar);
            if (!z) {
            }
            this.p1.addView(p66Var, tre.t(-1, -2, 17, 14, 8, 14, 12));
            this.O = this.p1;
            i94 i94Var2 = new i94(context2, 1, 2, (byte) 5);
            this.E1 = i94Var2;
            ys4 ys4Var2 = i94Var2.b;
            ys4Var2.z = aob.Wk;
            ys4Var2.A = aob.Xk;
            ys4Var2.b();
            i94Var2.b.k = 1.0f;
            i94Var2.setVisibility(4);
            i94Var2.setPaused(true);
            this.c.addView(i94Var2, tre.c(150.0f, jn7.f2));
            this.s1.setValue(50);
            if (arrayList != null) {
            }
        }
        this.q1.addView(this.s1, tre.d(-1, -2.0f, 55, 0.0f, z2 ? -50.0f : 0.0f, 0.0f, (!z2 || z4) ? 0.0f : -40.0f));
        LinearLayout linearLayout32 = new LinearLayout(context);
        this.r1 = linearLayout32;
        linearLayout32.setOrientation(0);
        if (!z2) {
        }
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.t1 = frameLayout22;
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.u1 = frameLayout32;
        int L2 = hl.L(14.0f);
        int i92 = aob.i5;
        ShapeDrawable b02 = aob.b0(L2, aob.v0(i92, vnbVar));
        uob M3 = yob.M(i92);
        frameLayout32.setBackground(b02);
        yob.j(frameLayout32, b02, M3, null, vnbVar);
        de0 de0Var2 = new de0(context);
        this.v1 = de0Var2;
        de0Var2.setRoundRadius(hl.L(14.0f));
        de0Var2.getImageReceiver().B0 = true;
        I0();
        frameLayout32.addView(de0Var2, tre.e(28, 28, jn7.z1));
        ImageView imageView3 = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType2);
        int i102 = aob.r5;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        yob.s(imageView3, i102, vnbVar, mode2);
        imageView3.setImageResource(R.drawable.arrows_select);
        frameLayout32.addView(imageView3, tre.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout22.addView(frameLayout32, tre.e(52, 28, 17));
        frameLayout22.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), 0);
        linearLayout32.addView(frameLayout22, tre.q(-2, -1, 0.0f, jn7.z1, 6, 4, 6, 0));
        iye.a(frameLayout22);
        kt0.g(i).o();
        c19 c19Var2 = new c19(context, (byte) 3);
        int i112 = aob.G6;
        yob.X(c19Var2, i112, vnbVar);
        c19Var2.setTextSize(1, 20.0f);
        c19Var2.setGravity(17);
        c19Var2.setText(ob6.M0(2131744695, null));
        c19Var2.setTypeface(hl.o());
        c19Var2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout32.addView(c19Var2, tre.q(-1, -2, 1.0f, jn7.D1, 2, 0, 2, 0));
        final byte b5 = 0;
        H0(false);
        ImageView imageView22 = new ImageView(context);
        imageView22.setScaleType(scaleType2);
        imageView22.setImageResource(R.drawable.ic_close_white);
        yob.s(imageView22, aob.W5, vnbVar, mode2);
        iye.a(imageView22);
        imageView22.setOnClickListener(new View.OnClickListener(this) { // from class: qza
            public final /* synthetic */ e0b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                e0b e0bVar = this.b;
                switch (b22) {
                    case 0:
                        e0bVar.dismiss();
                        break;
                    default:
                        og2 og2Var2 = e0bVar.D1;
                        og2Var2.a(!og2Var2.a.q, true);
                        e0bVar.y1 = og2Var2.a.q ? e0bVar.z1 : 2666000L;
                        e0bVar.I0();
                        d0b d0bVar2 = e0bVar.x1;
                        if (d0bVar2 != null) {
                            d0bVar2.setMyPrivacy(e0bVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout32.addView(imageView22, tre.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z2) {
        }
        this.q1.addView(linearLayout, tre.d(-1, -2.0f, 55, 0.0f, z2 ? z ? 179.0f : 45.0f : 0.0f, 0.0f, 15.0f));
        TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(-j));
        textView = new TextView(context);
        yob.X(textView, i112, vnbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor == null) {
        }
        textView.setText(pv3.m(hl.S2(a0), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z) {
            linearLayout.addView(textView, tre.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z4) {
        }
        if (z2) {
        }
        if (z2) {
        }
        og2 og2Var2 = new og2(21, vnbVar, context);
        this.D1 = og2Var2;
        og2Var2.b(aob.h7, aob.j7, aob.k7);
        og2Var2.setDrawUnchecked(true);
        og2Var2.a(this.y1 == 2666000, false);
        if (d0bVar != null) {
        }
        og2Var2.setDrawBackgroundAsArc(10);
        TextView textView22 = new TextView(context);
        yob.X(textView22, i112, vnbVar);
        textView22.setTextSize(1, 14.0f);
        textView22.setText(ob6.M0(2131744703, null));
        j3 = uh9.j(context, 0);
        j3.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        j3.addView(og2Var2, tre.t(21, 21, 16, 0, 0, 9, 0));
        j3.addView(textView22, tre.r(-2, -2, 16));
        final byte b42 = 1;
        j3.setOnClickListener(new View.OnClickListener(this) { // from class: qza
            public final /* synthetic */ e0b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b42;
                e0b e0bVar = this.b;
                switch (b22) {
                    case 0:
                        e0bVar.dismiss();
                        break;
                    default:
                        og2 og2Var22 = e0bVar.D1;
                        og2Var22.a(!og2Var22.a.q, true);
                        e0bVar.y1 = og2Var22.a.q ? e0bVar.z1 : 2666000L;
                        e0bVar.I0();
                        d0b d0bVar2 = e0bVar.x1;
                        if (d0bVar2 != null) {
                            d0bVar2.setMyPrivacy(e0bVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        iye.b(j3, 0.05f, 1.2f);
        int i132 = aob.i6;
        hf0 Y2 = aob.Y(aob.v0(i132, vnbVar), 6, 6);
        uob M22 = yob.M(i132);
        j3.setBackground(Y2);
        yob.j(j3, Y2, null, M22, vnbVar);
        if (!z2) {
            this.p1.addView(j3, tre.t(-2, -2, 1, 0, !z4 ? 10 : 4, 0, 10));
        }
        c51 c51Var2 = new c51(vnbVar, context, true);
        this.w1 = c51Var2;
        c51Var2.f();
        if (!z) {
        }
        this.p1.addView(c51Var2, tre.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        J0(0L);
        c51Var2.i(nza.Z0(false, ob6.a0(null, null, 2131744704, ob6.E(50L, ',')), this.M1), true, true);
        if (z) {
        }
        frameLayout22.setOnClickListener(new View.OnClickListener() { // from class: sza
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j52;
                int i142 = i;
                kt0 g = kt0.g(i142);
                g.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g.l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, yac.h(i142).f());
                e0b e0bVar = e0b.this;
                fu5 G = fu5.G(e0bVar.b, vnbVar, e0bVar.u1);
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i15);
                    if (tLObject instanceof TLRPC.User) {
                        j52 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (xc2.V(chat)) {
                                j52 = -chat.id;
                            }
                        }
                        i15 = i16;
                    }
                    if (j52 != j) {
                        long j62 = e0bVar.y1;
                        G.f(tLObject, j52 == j62 || (j62 == 0 && j52 == yac.h(i142).e()), new dp2((Object) e0bVar, j52, z2, (byte) 2));
                    }
                    i15 = i16;
                }
                G.t = false;
                G.e0 = true;
                G.s = (short) 0;
                G.W(5);
                G.a0();
            }
        });
        p66Var = new p66(context2, vnbVar);
        p66Var.setTextSize(1, 13.0f);
        yob.X(p66Var, aob.z6, vnbVar);
        if (z2) {
        }
        i2 = 0;
        p66Var.setText(hl.N2(ob6.M0(2131744702, r14), -1, 0, new xf1(context2, (byte) 21), r14));
        p66Var.setGravity(17);
        yob.G(p66Var, aob.k5, vnbVar);
        if (!z) {
        }
        this.p1.addView(p66Var, tre.t(-1, -2, 17, 14, 8, 14, 12));
        this.O = this.p1;
        i94 i94Var22 = new i94(context2, 1, 2, (byte) 5);
        this.E1 = i94Var22;
        ys4 ys4Var22 = i94Var22.b;
        ys4Var22.z = aob.Wk;
        ys4Var22.A = aob.Xk;
        ys4Var22.b();
        i94Var22.b.k = 1.0f;
        i94Var22.setVisibility(4);
        i94Var22.setPaused(true);
        this.c.addView(i94Var22, tre.c(150.0f, jn7.f2));
        this.s1.setValue(50);
        if (arrayList != null) {
        }
    }

    @Override // nx0
    public final void C(ArrayList arrayList, boolean z) {
        Property property = View.ALPHA;
        float f = z ? 1.0f : 0.0f;
        ie0 ie0Var = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(ie0Var, (Property<ie0, Float>) property, f));
        arrayList.add(ObjectAnimator.ofFloat(ie0Var, (Property<ie0, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(ie0Var, (Property<ie0, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
    }

    @Override // nx0
    public final boolean D() {
        if (this.s1.l0) {
            return false;
        }
        return this.c0;
    }

    public final void F0(final fxa fxaVar) {
        u49 u49Var;
        View view;
        x49 x49Var;
        b58 b58Var;
        View view2;
        x49 x49Var2;
        u49 u49Var2;
        r47 r47Var;
        tza tzaVar = this.s1;
        i94 i94Var = this.E1;
        r47 r47Var2 = this.F1;
        if (r47Var2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof wb2) {
                x49Var2 = ((wb2) view3).O;
                x49Var2.getClass();
                u49Var2 = x49Var2.l("stars");
            } else if (view3 instanceof dl1) {
                x49Var2 = ((dl1) view3).F0;
                x49Var2.getClass();
                u49Var2 = x49Var2.l("stars");
            } else {
                x49Var2 = null;
                u49Var2 = null;
            }
            if (u49Var2 == null && x49Var2 != null) {
                m47 v7 = this.P1.v7(r47Var2);
                if (v7 != null && !v7.e.isEmpty()) {
                    ArrayList arrayList = v7.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            r47Var = null;
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        r47Var = (r47) obj;
                        j47 d = v7.d(r47Var);
                        if (d != null) {
                            int i2 = d.l;
                            if ((i2 & 1) != 0 && (i2 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (r47Var != null) {
                        view3 = this.P1.L6(r47Var.e1(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof wb2) {
                    x49Var2 = ((wb2) view3).O;
                    x49Var2.getClass();
                    u49Var2 = x49Var2.l("stars");
                }
            }
            if (u49Var2 == null) {
                return;
            }
            x49Var = x49Var2;
            u49Var = u49Var2;
            view = view3;
        } else {
            if (this.J1 == null) {
                return;
            }
            u49Var = null;
            view = null;
            x49Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        tzaVar.getLocationInWindow(iArr);
        rectF.set(tzaVar.H.getBounds());
        rectF.inset(-hl.L(3.5f), -hl.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        oza ozaVar = new oza(this, (byte) 2);
        i94Var.b0 = ozaVar;
        if (i94Var.a0) {
            i94Var.b0 = null;
            ozaVar.run();
        }
        if (u49Var != null) {
            u49Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        u49 u49Var3 = u49Var;
        h96[] h96VarArr = new h96[1];
        if (this.n1 && (b58Var = this.J1) != null) {
            h96VarArr[0] = b58Var.c(this.K1);
        }
        final RectF rectF2 = new RectF();
        final ra7 ra7Var = new ra7((Object) this, (Object) h96VarArr, (Object) iArr, (Object) rectF2, (Object) view, (Object) x49Var, (Object) u49Var3, (byte) 21);
        View view4 = view;
        ra7Var.run();
        i94Var.setPaused(false);
        i94Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        i94Var.setTranslationX(rectF3.centerX() - (hl.L(150.0f) / 2.0f));
        i94Var.setTranslationY(rectF3.centerY() - (hl.L(150.0f) / 2.0f));
        i94Var.setScaleX(rectF3.width() / hl.L(150.0f));
        i94Var.setScaleY(rectF3.height() / hl.L(150.0f));
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pza
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ra7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                hl.X1(rectF4, rectF5, floatValue, rectF6);
                e0b e0bVar = e0b.this;
                i94 i94Var2 = e0bVar.E1;
                i94Var2.setTranslationX(rectF6.centerX() - (hl.L(150.0f) / 2.0f));
                i94Var2.setTranslationY(rectF6.centerY() - (hl.L(150.0f) / 2.0f));
                float R1 = hl.R1(Math.max(rectF6.width() / hl.L(150.0f), rectF6.height() / hl.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                i94Var2.setScaleX(R1);
                i94Var2.setScaleY(R1);
                ys4 ys4Var = i94Var2.b;
                ys4Var.d = 360.0f * floatValue;
                ys4Var.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.a0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    e0bVar.c.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                fxa fxaVar2 = fxaVar;
                if (fxaVar2 != null) {
                    fxaVar2.run();
                }
            }
        });
        this.R1.addListener(new wza(this, u49Var3, view4, h96VarArr, zArr, rectF2, fxaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new if3((byte) 4));
        this.R1.start();
    }

    public final boolean G0() {
        if (!this.n1) {
            kt0 g = kt0.g(this.m1);
            g.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if ((obj instanceof TLRPC.Chat) && xc2.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // nx0
    public final void H() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.H();
        }
    }

    public final void H0(boolean z) {
        FrameLayout frameLayout = this.t1;
        if ((frameLayout.getVisibility() == 0) != G0()) {
            frameLayout.setVisibility(G0() ? 0 : 8);
            if (z) {
                if (G0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.r1, changeBounds);
            }
        }
    }

    public final void I0() {
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.p = 0.42f;
        long j = this.y1;
        de0 de0Var = this.v1;
        if (j == 2666000) {
            rb0Var.f(21);
            int i = aob.c8;
            vnb vnbVar = this.l1;
            rb0Var.h(aob.v0(i, vnbVar), aob.v0(i, vnbVar));
            de0Var.f(null, rb0Var);
            return;
        }
        int i2 = this.m1;
        if (j >= 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(this.y1));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
        } else {
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-this.y1));
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
        }
    }

    public final void J0(long j) {
        d0b d0bVar;
        long j2;
        long j3;
        long j4 = 0;
        if ((!this.n1 || this.o1 || j <= 0) && (d0bVar = this.x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = yac.h(this.m1).e();
            int i = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j3 = 0;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i2);
                    long n = wf3.n(messageReactor.peer_id);
                    long j5 = j4;
                    boolean z = messageReactor.anonymous;
                    if (z) {
                        n = messageReactor.my ? e : (-i2) - i;
                    }
                    if (messageReactor.my || n == e) {
                        j3 = messageReactor.count;
                    } else {
                        long j6 = messageReactor.count;
                        zza zzaVar = new zza();
                        zzaVar.a = z;
                        zzaVar.b = false;
                        zzaVar.c = n;
                        zzaVar.d = j6;
                        arrayList.add(zzaVar);
                    }
                    i2++;
                    j4 = j5;
                    i = 1;
                }
                j2 = j4;
            } else {
                j2 = 0;
                j3 = 0;
            }
            long j7 = j3 + j;
            if (j7 > j2) {
                boolean z2 = this.y1 == 2666000;
                zza zzaVar2 = new zza();
                zzaVar2.a = z2;
                zzaVar2.b = true;
                zzaVar2.c = e;
                zzaVar2.d = j7;
                arrayList.add(zzaVar2);
            }
            Collections.sort(arrayList, new fna((byte) 3));
            d0bVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override // nx0
    public final boolean U(float f, float f2) {
        ie0 ie0Var = this.H1;
        if (f < ie0Var.getX() || f > ie0Var.getX() + ie0Var.getWidth() || f2 < ie0Var.getY() || f2 > ie0Var.getY() + ie0Var.getHeight()) {
            return super.U(f, f2);
        }
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.P3) {
            H0(true);
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        Long z1;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            r47 r47Var = this.F1;
            if (r47Var != null && ((z1 = r47Var.z1()) == null || z1.longValue() != this.y1)) {
                r47Var.I5(this.y1);
                cxa b = cxa.b(r47Var);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i = this.m1;
                uc7 s1 = uc7.s1(i);
                long j = b.a;
                int i2 = b.b;
                tL_messages_togglePaidReactionPrivacy.peer = s1.j1(j);
                tL_messages_togglePaidReactionPrivacy.msg_id = i2;
                long j2 = this.y1;
                if (j2 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j2 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = uc7.s1(i).j1(this.y1);
                }
                jn7.f(i).k(jn7.I1, Long.valueOf(b.a), Integer.valueOf(i2), Long.valueOf(this.y1));
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_togglePaidReactionPrivacy, new yp9(this, (byte) 5));
            }
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.m1).b(this, jn7.P3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.m1).n(this, jn7.P3);
    }

    @Override // nx0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 >= 0 || this.H0 != this.I1 || (v0 = aob.v0(aob.h5, this.l1)) == this.H0) {
                return;
            }
            this.H0 = v0;
            this.I1 = v0;
            y0(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
