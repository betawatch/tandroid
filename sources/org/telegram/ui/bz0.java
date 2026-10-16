package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import ri.h0;
import ug.b0;
import ug.j;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bz0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        com.google.android.gms.internal.cast.z5 z5Var;
        rg.m2 j10;
        int i10 = 13;
        int i11 = 12;
        int i12 = 4;
        int i13 = 14;
        int i14 = 5;
        int i15 = 10;
        org.telegram.ui.ActionBar.z2 z2Var = null;
        int i16 = 2;
        final int i17 = 1;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j11 = profileActivity.e1;
                long j12 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                tq tqVar = new tq(j11, j12, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                tqVar.X0 = new sz0(profileActivity, chat, tqVar);
                profileActivity.presentFragment(tqVar);
                break;
            case 1:
                v21 v21Var = (v21) this.b;
                Context context = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj = v21Var.a[0].getText().toString();
                String obj2 = v21Var.a[3].getText().toString();
                String obj3 = v21Var.a[2].getText().toString();
                String obj4 = v21Var.a[1].getText().toString();
                String obj5 = v21Var.a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj4)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                    }
                    if (v21Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        kj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        v21Var.showDialog(kj0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                g61 g61Var = (g61) this.b;
                Context context2 = (Context) this.c;
                if (g61Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    bs0 bs0Var = new bs0(11, g61Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ji, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ni, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context2, null);
                        z2Var2.a();
                        org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var.setTextColor(x02);
                        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        ud0Var.setItemCount(5);
                        org.telegram.ui.Components.i4 i4Var = new org.telegram.ui.Components.i4(context2, null);
                        i4Var.setItemCount(5);
                        i4Var.setTextColor(x02);
                        i4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.j4 j4Var = new org.telegram.ui.Components.j4(context2, null);
                        j4Var.setItemCount(5);
                        j4Var.setTextColor(x02);
                        j4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, ud0Var, i4Var, j4Var, 3);
                        y3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        y3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                        textView.setOnTouchListener(new ci.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        y3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bi.f4 f4Var = new bi.f4(context2, 17);
                        linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                        ud0Var.setMinValue(0);
                        ud0Var.setMaxValue(365);
                        ud0Var.setWrapSelectorWheel(false);
                        ud0Var.setFormatter(new is(9));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(ud0Var, i4Var, j4Var, 17);
                        ud0Var.setOnValueChangedListener(aVar);
                        i4Var.setMinValue(0);
                        i4Var.setMaxValue(23);
                        linearLayout.addView(i4Var, w7.z5.l(0.2f, 0, 270));
                        i4Var.setFormatter(new is(10));
                        i4Var.setOnValueChangedListener(aVar);
                        j4Var.setMinValue(0);
                        j4Var.setMaxValue(59);
                        j4Var.setValue(0);
                        j4Var.setFormatter(new is(11));
                        linearLayout.addView(j4Var, w7.z5.l(0.3f, 0, 270));
                        j4Var.setOnValueChangedListener(aVar);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j13 = currentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j13);
                            if (timeInMillis >= 0) {
                                j4Var.setValue(calendar.get(12));
                                i4Var = i4Var;
                                i4Var.setValue(calendar.get(11));
                                ud0Var.setValue(timeInMillis);
                            } else {
                                i4Var = i4Var;
                            }
                        }
                        org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, ud0Var, i4Var, j4Var);
                        f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        f4Var.setGravity(17);
                        f4Var.setTextColor(x04);
                        f4Var.setTextSize(1, 14.0f);
                        f4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        f4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x05, x06, x06));
                        f4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(f4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        f4Var.setOnClickListener(new org.telegram.ui.Components.m0(ud0Var, i4Var, j4Var, calendar, bs0Var, z2Var2, 1));
                        z2Var2.b(y3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var2.a;
                        e3Var.show();
                        e3Var.setBackgroundColor(x03);
                        e3Var.fixNavigationBar(x03);
                        z2Var = z2Var2;
                    }
                    z2Var.a.setOnHideListener(new fi.d0(g61Var, zArr, 11));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.a;
                    e3Var2.show();
                    g61Var.w = e3Var2;
                    g61Var.c(false);
                    break;
                }
                break;
            case 3:
                e81 e81Var = (e81) this.b;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.c;
                if (e81Var.Z.g() != 0) {
                    vcVar.run(new ArrayList(e81Var.a0.values()));
                    e81Var.dismiss();
                    break;
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num = (Integer) view.getTag();
                int i18 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 183 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i18;
                sessionsActivity.v = i18;
                a91 a91Var = sessionsActivity.a;
                if (a91Var != null) {
                    a91Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new bi.g7(8));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(zh.p7.N0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 6:
                ma1 ma1Var = (ma1) this.b;
                eb1 eb1Var = (eb1) this.c;
                hb1 hb1Var = ma1Var.d0;
                hb1Var.getOrCreateStoryViewer().C(hb1Var.getParentActivity(), eb1Var.b(), hb1Var.z0, bi.g9.a(hb1Var.S));
                break;
            case 7:
                qa1 qa1Var = (qa1) this.b;
                lg.f fVar = (lg.f) this.c;
                int i19 = qa1Var.c;
                ra1 ra1Var = qa1Var.d;
                org.telegram.ui.Components.e10 e10Var = qa1Var.a;
                if (e10Var.c) {
                    ArrayList arrayList = ra1Var.n;
                    jg.g gVar = ra1Var.c;
                    int size = arrayList.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            r7 = 1;
                        } else if (i20 == i19 || !((qa1) arrayList.get(i20)).a.c || !((qa1) arrayList.get(i20)).a.b) {
                            i20++;
                        }
                    }
                    ra1Var.f();
                    if (r7 != 0) {
                        AndroidUtilities.shakeView(e10Var);
                        break;
                    } else {
                        e10Var.setChecked(true ^ e10Var.b);
                        fVar.n = e10Var.b;
                        ra1Var.b.z();
                        if (ra1Var.r.c > 0 && i19 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i19)).n = e10Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 8:
                pb1 pb1Var = (pb1) this.b;
                yy yyVar = (yy) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new bs0(i10, pb1Var, yyVar));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                yyVar.showDialog(a2Var);
                TextView textView2 = (TextView) a2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    break;
                }
                break;
            case 9:
                he1 he1Var = (he1) this.b;
                Context context3 = (Context) this.c;
                if (he1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 z2Var3 = new org.telegram.ui.ActionBar.z2(he1Var.getParentActivity(), null);
                    z2Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, textView3);
                    linearLayout2.addView(textView3, w7.z5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new ci.d(2));
                    z2Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.g6.F.size();
                    while (r7 < size2) {
                        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(r7);
                        TLRPC.TL_theme tL_theme = f6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(f6Var);
                        }
                        r7++;
                    }
                    jc1 jc1Var = new jc1(context3, he1Var, arrayList2, new ArrayList(), z2Var3);
                    linearLayout2.addView(jc1Var, w7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    jc1Var.y1(he1Var.fragmentView.getMeasuredWidth());
                    he1Var.showDialog(z2Var3.a);
                    break;
                }
                break;
            case 10:
                cj1 cj1Var = (cj1) this.b;
                Context context4 = (Context) this.c;
                ug.m1 m1Var = cj1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    cj1Var.M = null;
                }
                ug.m1 m1Var2 = new ug.m1(context4, cj1Var.a, null, 4, new bi.s0());
                TLRPC.User user = cj1Var.c;
                long j14 = user != null ? user.id : 0L;
                TLRPC.User user2 = cj1Var.d;
                long[] jArr = {j14, user2 != null ? user2.id : 0L};
                for (int i21 = 0; i21 < 2; i21++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i21]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new ih.b(i16);
                cj1Var.M = m1Var2;
                m1Var2.show();
                break;
            case 11:
                di.d dVar = (di.d) this.b;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.c;
                if (!dVar.N) {
                    j2Var.dismiss();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.b;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.c;
                if (!a2Var2.m) {
                    i2Var.dismiss();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Wallet.z3 z3Var = (org.telegram.ui.Wallet.z3) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    z3Var.dismiss();
                    org.telegram.ui.Wallet.s8 s8Var = new org.telegram.ui.Wallet.s8();
                    s8Var.g0(nftitem);
                    U.presentFragment(s8Var);
                    break;
                }
                break;
            case 14:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) this.c;
                runnable.run();
                j2VarArr[0].dismiss();
                break;
            case 15:
                org.telegram.ui.Wallet.a5.Y((org.telegram.ui.Wallet.a5) this.b, (Context) this.c, view);
                break;
            case 16:
                org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) this.b;
                TextView textView4 = (TextView) this.c;
                a2Var3.c(!a2Var3.b(), true);
                textView4.setVisibility(a2Var3.b() ? 0 : 8);
                break;
            case 17:
                di.d dVar2 = (di.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar2.N && (z5Var = tj1.d) != null) {
                    dVar2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] i22 = z5Var.i();
                        com.google.android.gms.internal.clearcut.u0 u0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) z5Var.a;
                        com.google.android.gms.common.api.internal.t0 t0Var = u0Var.h;
                        b8.e eVar = new b8.e(t0Var, str2, "/tg-wear-auth/answer", i22);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new f7(z5Var, dVar2, iArr, 24)).addOnFailureListener(new sj1(dVar2, 0));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar2.setLoading(false);
                        return;
                    }
                }
                break;
            case 18:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                y yVar = (y) this.c;
                kVar.b = true;
                yVar.run();
                kVar.w.W2.N(true);
                break;
            case 19:
                qg.x xVar = (qg.x) this.b;
                Context context5 = (Context) this.c;
                if (!xVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(xVar, context5, createBitmap);
                    xVar.n.f().addView(nVar, w7.z5.d(-1.0f, -1));
                    qg.u uVar = xVar.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new di.c5(uVar, i12));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.es.f);
                    duration.addUpdateListener(new ki.a(nVar, i11));
                    duration.start();
                    xVar.n.a();
                    xVar.dismiss();
                    break;
                }
                break;
            case 20:
                rg.p2 p2Var = (rg.p2) this.b;
                di.cd cdVar = (di.cd) this.c;
                rg.m2[] m2VarArr = p2Var.H;
                if (m2VarArr != null && m2VarArr.length != 0 && p2Var.I != null && (j10 = p2Var.j(p2Var.n0, p2Var.o0)) != null) {
                    cdVar.run(j10);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.io.g0((fo) this.c, 41026, new ji.p1((rh.c) this.b, i15), null);
                break;
            case 22:
                sg.j0.W((sg.j0) this.b, (Context) this.c);
                break;
            case 23:
                ug.s0 s0Var = (ug.s0) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    ug.d0 d0Var = s0Var.a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (r7 < size3) {
                            Object obj6 = arrayList3.get(r7);
                            r7++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        ug.s.a(chat2.id, arrayList4, new bi.u3(s0Var, chat2, arrayList4, hashSet, 17), new ji.p1(s0Var, i13));
                        break;
                    }
                }
                break;
            case 24:
                ug.m1 m1Var3 = (ug.m1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = m1Var3.h0;
                int size4 = arrayList5.size();
                while (r7 < size4) {
                    Object obj7 = arrayList5.get(r7);
                    r7++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var3.n0.remove(l4);
                }
                m1Var3.X();
                m1Var3.Z.b(true, hashSet2, new ug.a1(m1Var3, i14), null);
                m1Var3.j0(true, true);
                m1Var3.Y();
                break;
            case 25:
                ug.m1.T((ug.m1) this.b, (TLRPC.User) this.c, view);
                break;
            case 26:
                final vg.e eVar2 = (vg.e) this.b;
                final wg.a aVar2 = (wg.a) this.c;
                if (!eVar2.d) {
                    ((ug.b0) eVar2).r.dismiss();
                    break;
                } else if (!aVar2.a.N) {
                    aVar2.b(true);
                    String str3 = eVar2.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: vg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (r3) {
                                case 0:
                                    aVar2.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new h0(b0Var, 17), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar2.b(false);
                                    e eVar3 = eVar2;
                                    j.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: vg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (i17) {
                                case 0:
                                    aVar2.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new h0(b0Var, 17), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar2.b(false);
                                    e eVar3 = eVar2;
                                    j.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.p(callback2, callback, r7), 2);
                    break;
                }
                break;
            case 27:
                wg.g gVar2 = (wg.g) this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                wg.f fVar2 = gVar2.v;
                if (fVar2 != null) {
                    ug.a0 a0Var = ((ug.u) fVar2).a;
                    a0Var.c0.remove(chat3);
                    a0Var.b0(true, true);
                    break;
                }
                break;
            case 28:
                ((ji.p1) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            default:
                ((ji.p1) this.b).run((TLRPC.Chat) this.c);
                break;
        }
    }
}
