package ag;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.m4;
import j$.util.Objects;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import lg.s;
import mg.p;
import mg.x0;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a5;
import org.telegram.ui.b5;
import org.telegram.ui.be;
import org.telegram.ui.d7;
import org.telegram.ui.er0;
import org.telegram.ui.h4;
import org.telegram.ui.i7;
import org.telegram.ui.j9;
import org.telegram.ui.le;
import org.telegram.ui.m60;
import org.telegram.ui.m7;
import org.telegram.ui.m8;
import org.telegram.ui.n8;
import org.telegram.ui.rd;
import org.telegram.ui.rv0;
import org.telegram.ui.sd;
import org.telegram.ui.u3;
import org.telegram.ui.u61;
import org.telegram.ui.un;
import org.telegram.ui.w6;
import org.telegram.ui.y6;
import org.telegram.ui.zd;
import vh.s7;
import vh.v3;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v26 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        jg.s2 j10;
        int i10;
        String str;
        ?? r10;
        String str2;
        String str3;
        int i11 = 19;
        int i12 = 3;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                un unVar = (un) this.c;
                org.telegram.messenger.i0.g(tL_businessChatLink.link);
                cc.a0(unVar).k(false).j();
                return;
            case 1:
                j1 j1Var = (j1) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                x0 x0Var = j1Var.R1;
                vh.d dVar = j1Var.V1;
                if (dVar.Q) {
                    return;
                }
                dVar.setLoading(true);
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.bot = vp.r1(j1Var.a).n1(tL_connectedBot.bot_id);
                updateconnectedbot.recipients = x0Var.b();
                ConnectionsManager.getInstance(j1Var.a).sendRequest(updateconnectedbot, new p0(j1Var, tL_connectedBot, x0Var.c(), 1));
                return;
            case 2:
                ai.c cVar = (ai.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.dismiss();
                return;
            case 3:
                bi.k2.b0((bi.k2) this.b, (Context) this.c, view);
                return;
            case 4:
                ig.u uVar = (ig.u) this.b;
                Context context = (Context) this.c;
                androidx.activity.o oVar = uVar.o1;
                switch (oVar.a) {
                    case 3:
                        z10 = oVar.b;
                        break;
                    default:
                        z10 = oVar.b;
                        break;
                }
                if (z10) {
                    return;
                }
                androidx.activity.o oVar2 = uVar.o1;
                switch (oVar2.a) {
                    case 3:
                        view2 = (er0) oVar2.d;
                        break;
                    default:
                        view2 = (s7) oVar2.d;
                        break;
                }
                Bitmap M3 = org.telegram.messenger.i0.M3(view2);
                Bitmap createBitmap = Bitmap.createBitmap(M3.getWidth(), M3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(-16777216);
                androidx.activity.o oVar3 = uVar.o1;
                switch (oVar3.a) {
                    case 3:
                        jg.j0 j0Var = ((er0) oVar3.d).F0;
                        Matrix matrix = j0Var.getMatrix();
                        canvas.save();
                        canvas.translate(j0Var.getX(), j0Var.getY());
                        canvas.concat(matrix);
                        float width = j0Var.getWidth();
                        Bitmap bitmap = (Bitmap) oVar3.c;
                        canvas.scale(width / bitmap.getWidth(), j0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        canvas.drawBitmap(M3, 0.0f, 0.0f, (Paint) null);
                        M3.recycle();
                        ig.j jVar = new ig.j(uVar, context, createBitmap);
                        androidx.activity.o oVar4 = uVar.o1;
                        switch (oVar4.a) {
                            case 3:
                                frameLayout = ((er0) oVar4.d).N0;
                                break;
                            default:
                                frameLayout = ((s7) oVar4.d).E0;
                                break;
                        }
                        frameLayout.addView(jVar, b6.c(-1.0f, -1));
                        androidx.activity.o oVar5 = uVar.o1;
                        Objects.requireNonNull(oVar5);
                        jVar.setColorListener(new ig.i(oVar5, 0));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                        duration.setInterpolator(gr.f);
                        duration.addUpdateListener(new bg.k(jVar, 6));
                        duration.start();
                        androidx.activity.o oVar6 = uVar.o1;
                        switch (oVar6.a) {
                            case 3:
                                oVar6.b = true;
                                break;
                            default:
                                oVar6.b = true;
                                break;
                        }
                        uVar.dismiss();
                        return;
                    default:
                        v3 v3Var = ((s7) oVar3.d).x0;
                        Matrix matrix2 = v3Var.getMatrix();
                        canvas.save();
                        canvas.translate(v3Var.getX(), v3Var.getY());
                        canvas.concat(matrix2);
                        v3Var.getWidth();
                        throw null;
                }
            case 5:
                jn.g0((un) this.c, 41026, new l((ih.d) this.b, 12), null);
                return;
            case 6:
                jg.v2 v2Var = (jg.v2) this.b;
                ll llVar = (ll) this.c;
                jg.s2[] s2VarArr = v2Var.H;
                if (s2VarArr == null || s2VarArr.length == 0 || v2Var.I == null || (j10 = v2Var.j(v2Var.n0, v2Var.o0)) == null) {
                    return;
                }
                llVar.a(j10);
                return;
            case 7:
                kg.q0 q0Var = (kg.q0) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.k2 k2Var = q0Var.C2;
                int i16 = q0Var.Z1;
                if (i16 == 11 || i16 == 34) {
                    return;
                }
                if (i16 != 19 && i16 != 32 && !q0Var.s1()) {
                    if (i16 == 18 || i16 == 20 || i16 == 24 || i16 == 25 || i16 == 26 || i16 == 29 || i16 == 22 || i16 == 23 || i16 == 21 || i16 == 27 || i16 == 28 || i16 == 30 || i16 == 35) {
                        org.telegram.messenger.i0.g(q0Var.k1());
                        q0Var.dismiss();
                        return;
                    }
                    if (d20.i(q0Var.a).q() || vp.r1(q0Var.a).A3() || q0Var.F2) {
                        q0Var.dismiss();
                        return;
                    } else {
                        if (k2Var == null) {
                            return;
                        }
                        if (k2Var.getVisibleDialog() != null) {
                            k2Var.getVisibleDialog().dismiss();
                        }
                        k2Var.presentFragment(new PremiumPreviewFragment(0, kg.q0.u1(i16)));
                        q0Var.dismiss();
                        return;
                    }
                }
                org.telegram.messenger.h3 h3Var = q0Var.U1;
                if (h3Var.b) {
                    if (d20.i(q0Var.a).q() && mg.k0.i()) {
                        mg.p.i(q0Var.S1, q0Var);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, q0Var.I0);
                    alertDialog$Builder.a.R = cd.L0(2131747047, null);
                    alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(cd.L0(q0Var.r1() ? 2131747045 : 2131747046, null));
                    alertDialog$Builder.k(cd.L0(2131752152, null), new kg.b0(q0Var, 0));
                    alertDialog$Builder.h(cd.L0(2131752589, null), new k2.k0(i13));
                    alertDialog$Builder.p();
                    return;
                }
                boolean z11 = h3Var.a;
                if (z11 && h3Var.c == 0) {
                    if (!h3Var.e || !mg.k0.i()) {
                        q0Var.i1();
                        return;
                    }
                    q0Var.X1 = true;
                    q0Var.p2.d0 = false;
                    org.telegram.ui.ActionBar.k2 k2Var2 = q0Var.o1;
                    org.telegram.messenger.h3 h3Var2 = q0Var.U1;
                    mg.o1 o1Var = new mg.o1(k2Var2, h3Var2.h, h3Var2.k);
                    o1Var.show();
                    o1Var.H0 = new x(q0Var, 4);
                    return;
                }
                if (!z11) {
                    int i17 = h3Var.f;
                    if (i17 != 0) {
                        mg.p.g(i17);
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout2 = new FrameLayout(q0Var.getContext());
                g9 g9Var = new g9(q0Var.getContext());
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                frameLayout2.addView(g9Var, b6.c(60.0f, 60));
                frameLayout2.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(t6.x0(null, t6.h5, false));
                frameLayout2.addView(new kg.f0(q0Var.getContext(), paint, q0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), b6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(q0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                a7.t(imageView, t6.m6, null, PorterDuff.Mode.SRC_ATOP);
                frameLayout2.addView(imageView, b6.e(24, 24, 17));
                g9 g9Var2 = new g9(q0Var.getContext());
                g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                frameLayout2.addView(g9Var2, b6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout3 = new FrameLayout(q0Var.getContext());
                frameLayout3.addView(frameLayout2, b6.e(-2, 60, 1));
                frameLayout3.setClipChildren(false);
                TextView textView = new TextView(context2);
                textView.setLetterSpacing(0.025f);
                a7.V(textView, t6.j5, null);
                textView.setTextSize(1, 16.0f);
                frameLayout3.addView(textView, b6.t(-1, -2, 0, 24, 80, 24, 0));
                r8 r8Var = new r8((p6) null);
                TLRPC.Chat L0 = vp.r1(q0Var.a).L0(Long.valueOf(-q0Var.U1.c));
                r8Var.q(L0);
                g9Var.e(L0, r8Var);
                r8 r8Var2 = new r8((p6) null);
                TLRPC.Chat L02 = vp.r1(q0Var.a).L0(Long.valueOf(-q0Var.S1));
                r8Var2.q(L02);
                g9Var2.e(L02, r8Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                alertDialog$Builder2.o(frameLayout3);
                m5.q("ReplaceBoostChannelDescription", null, 2131746285, new Object[]{L0.title, L02.title}, textView);
                alertDialog$Builder2.k(cd.L0(2131746287, null), new kg.b0(q0Var, 1));
                alertDialog$Builder2.h(cd.L0(2131752589, null), new k2.k0(i12));
                alertDialog$Builder2.p();
                return;
            case 8:
                mg.o1 o1Var2 = (mg.o1) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = o1Var2.P1;
                if (arrayList.isEmpty()) {
                    return;
                }
                mg.z0 z0Var = o1Var2.S1;
                if (z0Var.Q) {
                    return;
                }
                z0Var.setLoading(true);
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList.get(i18);
                    i18++;
                    TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                    arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                    hashSet.add(Long.valueOf(o5.o(tL_myBoost.peer)));
                }
                mg.k0.a(chat.id, arrayList2, new m2(o1Var2, chat, arrayList2, hashSet, 2), new l(o1Var2, i11));
                return;
            case 9:
                mg.i2 i2Var = (mg.i2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = i2Var.Z1;
                int size2 = arrayList3.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj2 = arrayList3.get(i19);
                    i19++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    i2Var.f2.remove(l4);
                }
                i2Var.e1();
                i2Var.R1.b(true, hashSet2, new mg.w1(i2Var, 5), null);
                i2Var.p1(true, true);
                i2Var.f1();
                return;
            case 10:
                final mg.i2 i2Var2 = (mg.i2) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                z60 F = z60.F(i2Var2.c, i2Var2.I0, (View) view.getParent());
                final int i20 = 0;
                F.c(R.drawable.profile_discuss, cd.L0(2131745618, null), new Runnable() { // from class: mg.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i20) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    k2 k2Var3 = i2Var2.o1;
                                    if (k2Var3 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        k2Var3.presentFragment(new un(bundle));
                                        break;
                                    } else {
                                        k2 T = LaunchActivity.T();
                                        org.telegram.ui.ActionBar.i2 i2Var3 = new org.telegram.ui.ActionBar.i2();
                                        i2Var3.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new un(bundle2), i2Var3);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    k2 k2Var4 = i2Var2.o1;
                                    if (k2Var4 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        k2Var4.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        k2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            org.telegram.ui.ActionBar.i2 i2Var4 = new org.telegram.ui.ActionBar.i2();
                                            i2Var4.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), i2Var4);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                final int i21 = 1;
                F.c(R.drawable.msg_openprofile, cd.L0(2131747802, null), new Runnable() { // from class: mg.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i21) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    k2 k2Var3 = i2Var2.o1;
                                    if (k2Var3 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        k2Var3.presentFragment(new un(bundle));
                                        break;
                                    } else {
                                        k2 T = LaunchActivity.T();
                                        org.telegram.ui.ActionBar.i2 i2Var3 = new org.telegram.ui.ActionBar.i2();
                                        i2Var3.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new un(bundle2), i2Var3);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    k2 k2Var4 = i2Var2.o1;
                                    if (k2Var4 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        k2Var4.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        k2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            org.telegram.ui.ActionBar.i2 i2Var4 = new org.telegram.ui.ActionBar.i2();
                                            i2Var4.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), i2Var4);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                F.Z();
                return;
            case 11:
                final ng.f fVar = (ng.f) this.b;
                final og.a aVar = (og.a) this.c;
                if (!fVar.d) {
                    ((mg.x0) fVar).r.dismiss();
                    return;
                }
                if (aVar.a.Q) {
                    return;
                }
                final int i22 = 1;
                aVar.b(true);
                String str4 = fVar.h;
                final int i23 = 0;
                q20 q20Var = new q20() { // from class: ng.e
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj3) {
                        switch (i23) {
                            case 0:
                                aVar.b(false);
                                x0 x0Var2 = (x0) fVar;
                                i0.h3(new s(x0Var2, 9), 200L);
                                x0Var2.r.dismiss();
                                break;
                            default:
                                aVar.b(false);
                                f fVar2 = fVar;
                                p.c((TLRPC.TL_error) obj3, fVar2.n, fVar2.c, new c(fVar2, 1));
                                break;
                        }
                    }
                };
                q20 q20Var2 = new q20() { // from class: ng.e
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj3) {
                        switch (i22) {
                            case 0:
                                aVar.b(false);
                                x0 x0Var2 = (x0) fVar;
                                i0.h3(new s(x0Var2, 9), 200L);
                                x0Var2.r.dismiss();
                                break;
                            default:
                                aVar.b(false);
                                f fVar2 = fVar;
                                p.c((TLRPC.TL_error) obj3, fVar2.n, fVar2.c, new c(fVar2, 1));
                                break;
                        }
                    }
                };
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.s0);
                TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                tL_payments_applyGiftCode.slug = str4;
                connectionsManager.sendRequest(tL_payments_applyGiftCode, new mg.b0(q20Var2, q20Var, i23), 2);
                return;
            case 12:
                og.h hVar = (og.h) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                og.g gVar = hVar.w;
                if (gVar != null) {
                    mg.w0 w0Var = ((mg.m0) gVar).a;
                    w0Var.U1.remove(chat2);
                    w0Var.k1(true, true);
                    return;
                }
                return;
            case 13:
                ((l) this.b).a((TLRPC.TL_payments_checkedGiftCode) this.c);
                return;
            case 14:
                ((l) this.b).a((TLRPC.Chat) this.c);
                return;
            case 15:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                return;
            case 16:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                return;
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.b;
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.c;
                int indexOf = t0Var.g0.indexOf(s0Var.getFilter());
                if (t0Var.h0 != indexOf) {
                    t0Var.h0 = indexOf;
                    t0Var.D();
                    return;
                }
                if (s0Var.getFilter().h) {
                    if (!s0Var.a.f) {
                        s0Var.setSelectedForDelete(true);
                        return;
                    }
                    zf.e0 filter = s0Var.getFilter();
                    t0Var.I(filter);
                    org.telegram.ui.ActionBar.p0 p0Var = t0Var.H;
                    if (p0Var != null) {
                        p0Var.j(filter);
                        t0Var.H.l(t0Var.e);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
                org.telegram.ui.ActionBar.t0 t0Var2 = (org.telegram.ui.ActionBar.t0) this.c;
                if (t0Var2.x() && r0Var.f) {
                    if (t0Var2.T) {
                        return;
                    }
                    t0Var2.T = true;
                    t0Var2.q();
                }
                org.telegram.ui.ActionBar.y yVar = t0Var2.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.o0 o0Var = t0Var2.P;
                if (o0Var != null) {
                    o0Var.k(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.b;
                if (((org.telegram.ui.ActionBar.q1) this.c).a) {
                    return;
                }
                org.telegram.ui.ActionBar.u1 u1Var = x1Var.o0;
                if (u1Var != null) {
                    u1Var.h(x1Var, -1);
                }
                if (x1Var.j0) {
                    x1Var.dismiss();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.b;
                if (((org.telegram.ui.ActionBar.q1) this.c).a) {
                    return;
                }
                org.telegram.ui.ActionBar.u1 u1Var2 = x1Var2.q0;
                if (u1Var2 != null) {
                    u1Var2.h(x1Var2, -2);
                }
                if (x1Var2.j0) {
                    x1Var2.cancel();
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.x1 x1Var3 = (org.telegram.ui.ActionBar.x1) this.b;
                if (((org.telegram.ui.ActionBar.q1) this.c).a) {
                    return;
                }
                org.telegram.ui.ActionBar.u1 u1Var3 = x1Var3.u0;
                if (u1Var3 != null) {
                    u1Var3.h(x1Var3, -2);
                }
                if (x1Var3.j0) {
                    x1Var3.dismiss();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ActionBar.x1 x1Var4 = (org.telegram.ui.ActionBar.x1) this.b;
                if (((org.telegram.ui.ActionBar.q1) this.c).a) {
                    return;
                }
                m4 m4Var = x1Var4.s0;
                if (m4Var != null) {
                    m4Var.h(x1Var4, -2);
                }
                if (x1Var4.j0) {
                    x1Var4.cancel();
                    return;
                }
                return;
            case 23:
                h4 h4Var = (h4) this.b;
                Activity activity = (Activity) this.c;
                u3 u3Var = h4Var.K;
                if (h4Var.h0.A0) {
                    return;
                }
                org.telegram.ui.l3 l3Var = h4Var.u0[0];
                if (!l3Var.f()) {
                    if (u3Var == null) {
                        l3Var.b.y0(0);
                        return;
                    }
                    dv0 dv0Var = new dv0(activity);
                    dv0Var.a = 1;
                    dv0Var.s = -org.telegram.messenger.i0.L(32.0f);
                    l3Var.d.w0(dv0Var);
                    return;
                }
                if (l3Var.getWebView() == null || h4Var.h0.W) {
                    return;
                }
                if (h4Var.i0 != null) {
                    org.telegram.ui.web.v0 webView = l3Var.getWebView();
                    String title = webView != null ? webView.getTitle() : null;
                    String u10 = org.telegram.ui.web.z0.u(webView != null ? webView.getUrl() : null);
                    org.telegram.ui.web.j jVar2 = h4Var.i0;
                    Bitmap favicon = webView != null ? webView.getFavicon() : null;
                    if (TextUtils.isEmpty(title)) {
                        title = cd.L0(2131742952, null);
                    }
                    String str5 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                    org.telegram.ui.v vVar = new org.telegram.ui.v(h4Var, u10, i14);
                    org.telegram.ui.w wVar = new org.telegram.ui.w(h4Var, l3Var, activity, i14);
                    org.telegram.ui.p pVar = new org.telegram.ui.p(h4Var, i15);
                    org.telegram.ui.p pVar2 = new org.telegram.ui.p(h4Var, i13);
                    org.telegram.ui.x xVar = new org.telegram.ui.x(h4Var, u10, l3Var, i14);
                    ii iiVar = jVar2.x;
                    ImageView imageView2 = jVar2.f;
                    if (favicon == null) {
                        imageView2.setImageResource(R.drawable.msg_language);
                        str = str5;
                        imageView2.setColorFilter(new PorterDuffColorFilter(jVar2.H, PorterDuff.Mode.SRC_IN));
                        r10 = 0;
                    } else {
                        str = str5;
                        imageView2.setImageDrawable(new BitmapDrawable(jVar2.getContext().getResources(), favicon));
                        r10 = 0;
                        imageView2.setColorFilter((ColorFilter) null);
                    }
                    TextView textView2 = jVar2.r;
                    textView2.setText(k6.m(title, textView2.getPaint().getFontMetricsInt(), false, r10, 0));
                    try {
                        Uri parse = Uri.parse(str);
                        str2 = gf.f.u(parse, r10, r10, gf.f.a(parse.getHost()), r10);
                    } catch (Exception e) {
                        try {
                            f8.g(e, false);
                            str2 = str;
                        } catch (Exception e7) {
                            e = e7;
                            str2 = str;
                            f8.g(e, true);
                            str3 = str2;
                            TextView textView3 = jVar2.s;
                            i10 = 0;
                            textView3.setText(k6.m(str3, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                            jVar2.L = wVar;
                            jVar2.M = pVar;
                            jVar2.N = pVar2;
                            jVar2.e.setOnClickListener(new rv0(18, jVar2, vVar));
                            jVar2.n.setOnClickListener(xVar);
                            jVar2.b = false;
                            jVar2.setInput(null);
                            iiVar.f3.O(true);
                            iiVar.v0(0);
                            org.telegram.ui.m0 m0Var = h4Var.h0;
                            e0 e0Var = new e0(12, l3Var, activity);
                            zd zdVar = m0Var.b0;
                            zdVar.setText("");
                            zdVar.setSelection(i10, zdVar.getText().length());
                            zdVar.setScrollX(i10);
                            m0Var.v0 = e0Var;
                            m0Var.k(true);
                            return;
                        }
                    }
                    try {
                        str3 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                    } catch (Exception e10) {
                        e = e10;
                        f8.g(e, true);
                        str3 = str2;
                        TextView textView32 = jVar2.s;
                        i10 = 0;
                        textView32.setText(k6.m(str3, textView32.getPaint().getFontMetricsInt(), false, null, 0));
                        jVar2.L = wVar;
                        jVar2.M = pVar;
                        jVar2.N = pVar2;
                        jVar2.e.setOnClickListener(new rv0(18, jVar2, vVar));
                        jVar2.n.setOnClickListener(xVar);
                        jVar2.b = false;
                        jVar2.setInput(null);
                        iiVar.f3.O(true);
                        iiVar.v0(0);
                        org.telegram.ui.m0 m0Var2 = h4Var.h0;
                        e0 e0Var2 = new e0(12, l3Var, activity);
                        zd zdVar2 = m0Var2.b0;
                        zdVar2.setText("");
                        zdVar2.setSelection(i10, zdVar2.getText().length());
                        zdVar2.setScrollX(i10);
                        m0Var2.v0 = e0Var2;
                        m0Var2.k(true);
                        return;
                    }
                    TextView textView322 = jVar2.s;
                    i10 = 0;
                    textView322.setText(k6.m(str3, textView322.getPaint().getFontMetricsInt(), false, null, 0));
                    jVar2.L = wVar;
                    jVar2.M = pVar;
                    jVar2.N = pVar2;
                    jVar2.e.setOnClickListener(new rv0(18, jVar2, vVar));
                    jVar2.n.setOnClickListener(xVar);
                    jVar2.b = false;
                    jVar2.setInput(null);
                    iiVar.f3.O(true);
                    iiVar.v0(0);
                } else {
                    i10 = 0;
                }
                org.telegram.ui.m0 m0Var22 = h4Var.h0;
                e0 e0Var22 = new e0(12, l3Var, activity);
                zd zdVar22 = m0Var22.b0;
                zdVar22.setText("");
                zdVar22.setSelection(i10, zdVar22.getText().length());
                zdVar22.setScrollX(i10);
                m0Var22.v0 = e0Var22;
                m0Var22.k(true);
                return;
            case 24:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.b;
                m60 m60Var = (m60) this.c;
                if (c1Var.h != 0) {
                    return;
                }
                c1Var.a(1, true);
                int i24 = ((h4) m60Var).X;
                TLRPC.Chat chat3 = m60Var.n;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = vp.h1(chat3);
                ConnectionsManager.getInstance(i24).sendRequestTyped(tL_channels_joinChannel, new org.telegram.ui.f0(c1Var, i24, tL_channels_joinChannel, chat3, 0));
                return;
            case 25:
                a5 a5Var = (a5) this.b;
                b5 b5Var = (b5) this.c;
                a5Var.b(false);
                a5Var.e.d(b5Var);
                return;
            case 26:
                ((y6) ((w6) this.b).f).w0((org.telegram.ui.Cells.c2) this.c);
                return;
            case 27:
                d7 d7Var = (d7) this.b;
                m7 m7Var = (m7) this.c;
                i7 i7Var = d7Var.f.F;
                if (i7Var != null) {
                    i7Var.a(m7Var.c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.k1 k1Var = d7Var.a;
                if (k1Var != null) {
                    k1Var.d(true);
                    return;
                }
                return;
            case 28:
                j9 j9Var = (j9) this.b;
                org.telegram.ui.g9 g9Var3 = (org.telegram.ui.g9) this.c;
                ArrayList arrayList4 = g9Var3.b;
                if (arrayList4.size() == 1) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(0);
                    TLRPC.UserFull a2 = j9Var.getMessagesController().a2(user2.id);
                    j9Var.L = user2;
                    boolean z12 = g9Var3.e;
                    org.telegram.ui.Components.voip.m1.m(user2, z12, z12 || (a2 != null && a2.video_calls_available), j9Var.getParentActivity(), null, j9Var.getAccountInstance());
                    return;
                }
                boolean z13 = g9Var3.e;
                HashSet hashSet3 = new HashSet();
                int size3 = arrayList4.size();
                int i25 = 0;
                while (i25 < size3) {
                    Object obj3 = arrayList4.get(i25);
                    i25++;
                    hashSet3.add(Long.valueOf(((TLRPC.User) obj3).id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var3.c.get(0)).id;
                org.telegram.ui.ActionBar.x1 x1Var5 = new org.telegram.ui.ActionBar.x1(3, j9Var.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = j9Var.getMessagesController().Q6;
                x1Var5.setOnCancelListener(new n8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(j9Var, x1Var5, hashSet3, tL_inputGroupCallInviteMessage, z13, 1)), i15));
                x1Var5.r(600L);
                return;
            default:
                le leVar = (le) this.b;
                u61 u61Var = (u61) this.c;
                vh.d dVar2 = leVar.A0;
                if (!view.isEnabled() || dVar2.Q) {
                    return;
                }
                be beVar = leVar.G0;
                if (beVar == null || !beVar.Q) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(leVar, twoStepVerificationActivity, i14);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = rdVar;
                    dVar2.setLoading(true);
                    twoStepVerificationActivity.w0(new sd(leVar, u61Var, twoStepVerificationActivity, i14));
                    return;
                }
                return;
        }
    }
}
