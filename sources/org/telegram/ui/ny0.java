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
import java.util.Iterator;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import rg.q1;
import tg.b0;
import tg.i;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ny0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        cf.c cVar;
        qg.k2 j3;
        TL_stars.SavedStarGift savedStarGift;
        int i11 = 24;
        int i12 = 4;
        int i13 = 10;
        int i14 = 14;
        int i15 = 5;
        int i16 = 11;
        int i17 = 2;
        org.telegram.ui.ActionBar.z2 z2Var = null;
        final int i18 = 0;
        final int i19 = 1;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity.e1;
                long j11 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                kq kqVar = new kq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                kqVar.X0 = new ez0(profileActivity, chat, kqVar);
                profileActivity.presentFragment(kqVar);
                break;
            case 1:
                f21 f21Var = (f21) this.b;
                Context context = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj = f21Var.a[0].getText().toString();
                String obj2 = f21Var.a[3].getText().toString();
                String obj3 = f21Var.a[2].getText().toString();
                String obj4 = f21Var.a[1].getText().toString();
                String obj5 = f21Var.a[4].getText().toString();
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
                    if (f21Var.v == 2) {
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
                        StringBuilder v = a4.a.v(str);
                        v.append(sb2.toString());
                        org.telegram.ui.Components.ui0 ui0Var = new org.telegram.ui.Components.ui0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ui0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        f21Var.showDialog(ui0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                p51 p51Var = (p51) this.b;
                Context context2 = (Context) this.c;
                if (p51Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ds0 ds0Var = new ds0(9, p51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false);
                        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false);
                        int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context2, null);
                        z2Var2.a();
                        org.telegram.ui.Components.ed0 ed0Var = new org.telegram.ui.Components.ed0(context2, null);
                        ed0Var.setTextColor(w02);
                        ed0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        ed0Var.setItemCount(5);
                        org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context2, null);
                        g4Var.setItemCount(5);
                        g4Var.setTextColor(w02);
                        g4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.h4 h4Var = new org.telegram.ui.Components.h4(context2, null);
                        h4Var.setItemCount(5);
                        h4Var.setTextColor(w02);
                        h4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, ed0Var, g4Var, h4Var, 3);
                        org.telegram.ui.Components.h4 h4Var2 = h4Var;
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(ed0Var, w7.y5.l(0.5f, 0, 270));
                        ed0Var.setMinValue(0);
                        ed0Var.setMaxValue(365);
                        ed0Var.setWrapSelectorWheel(false);
                        ed0Var.setFormatter(new u6(24));
                        ai.q5 q5Var = new ai.q5(ed0Var, g4Var, h4Var2, 17);
                        ed0Var.setOnValueChangedListener(q5Var);
                        g4Var.setMinValue(0);
                        g4Var.setMaxValue(23);
                        linearLayout.addView(g4Var, w7.y5.l(0.2f, 0, 270));
                        g4Var.setFormatter(new u6(25));
                        g4Var.setOnValueChangedListener(q5Var);
                        h4Var2.setMinValue(0);
                        h4Var2.setMaxValue(59);
                        h4Var2.setValue(0);
                        h4Var2.setFormatter(new u6(26));
                        linearLayout.addView(h4Var2, w7.y5.l(0.3f, 0, 270));
                        h4Var2.setOnValueChangedListener(q5Var);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            i10 = w03;
                        } else {
                            long j12 = currentTimeMillis * 1000;
                            i10 = w03;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                h4Var2 = h4Var2;
                                h4Var2.setValue(calendar.get(12));
                                g4Var.setValue(calendar.get(11));
                                ed0Var.setValue(timeInMillis);
                            } else {
                                h4Var2 = h4Var2;
                            }
                        }
                        org.telegram.ui.Components.h4 h4Var3 = h4Var2;
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, ed0Var, g4Var, h4Var3);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.z2 z2Var3 = z2Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(ed0Var, g4Var, h4Var3, calendar, ds0Var, z2Var2, 1));
                        z2Var3.b(w3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var3.a;
                        e3Var.show();
                        e3Var.setBackgroundColor(i10);
                        e3Var.fixNavigationBar(i10);
                        z2Var = z2Var3;
                    }
                    z2Var.a.setOnHideListener(new ei.e0(p51Var, zArr, 11));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.a;
                    e3Var2.show();
                    p51Var.w = e3Var2;
                    p51Var.c(false);
                    break;
                }
                break;
            case 3:
                n71 n71Var = (n71) this.b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.c;
                if (n71Var.Z.g() != 0) {
                    tcVar.run(new ArrayList(n71Var.a0.values()));
                    n71Var.dismiss();
                    break;
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num = (Integer) view.getTag();
                int i20 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 183 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i20;
                sessionsActivity.v = i20;
                k81 k81Var = sessionsActivity.a;
                if (k81Var != null) {
                    k81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.u7(8));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(yh.w7.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 6:
                x91 x91Var = (x91) this.b;
                pa1 pa1Var = (pa1) this.c;
                sa1 sa1Var = x91Var.d0;
                sa1Var.getOrCreateStoryViewer().C(sa1Var.getParentActivity(), pa1Var.b(), sa1Var.z0, ai.u9.a(sa1Var.S));
                break;
            case 7:
                ba1 ba1Var = (ba1) this.b;
                kg.f fVar = (kg.f) this.c;
                int i21 = ba1Var.c;
                ca1 ca1Var = ba1Var.d;
                org.telegram.ui.Components.t00 t00Var = ba1Var.a;
                if (t00Var.c) {
                    ArrayList arrayList = ca1Var.n;
                    ig.g gVar = ca1Var.c;
                    int size = arrayList.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 >= size) {
                            i18 = 1;
                        } else if (i22 == i21 || !((ba1) arrayList.get(i22)).a.c || !((ba1) arrayList.get(i22)).a.b) {
                            i22++;
                        }
                    }
                    ca1Var.f();
                    if (i18 != 0) {
                        AndroidUtilities.shakeView(t00Var);
                        break;
                    } else {
                        t00Var.setChecked(true ^ t00Var.b);
                        fVar.n = t00Var.b;
                        ca1Var.b.z();
                        if (ca1Var.r.c > 0 && i21 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i21)).n = t00Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 8:
                ab1 ab1Var = (ab1) this.b;
                qy qyVar = (qy) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ds0(i16, ab1Var, qyVar));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                qyVar.showDialog(a2Var);
                TextView textView2 = (TextView) a2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    break;
                }
                break;
            case 9:
                td1 td1Var = (td1) this.b;
                Context context3 = (Context) this.c;
                if (td1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 z2Var4 = new org.telegram.ui.ActionBar.z2(td1Var.getParentActivity(), null);
                    z2Var4.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.f0.q(textView3, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.y5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    z2Var4.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.h6.F.size();
                    while (i18 < size2) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) org.telegram.ui.ActionBar.h6.F.get(i18);
                        TLRPC.TL_theme tL_theme = g6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(g6Var);
                        }
                        i18++;
                    }
                    vb1 vb1Var = new vb1(context3, td1Var, arrayList2, new ArrayList(), z2Var4);
                    linearLayout2.addView(vb1Var, w7.y5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    vb1Var.x1(td1Var.fragmentView.getMeasuredWidth());
                    td1Var.showDialog(z2Var4.a);
                    break;
                }
                break;
            case 10:
                mi1 mi1Var = (mi1) this.b;
                Context context4 = (Context) this.c;
                tg.m1 m1Var = mi1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    mi1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, mi1Var.a, null, 4, new ai.a1());
                TLRPC.User user = mi1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = mi1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i23 = 0; i23 < 2; i23++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i23]));
                }
                m1Var2.h0(false, true);
                m1Var2.D0 = new hh.b(i17);
                mi1Var.M = m1Var2;
                m1Var2.show();
                break;
            case 11:
                ci.d dVar = (ci.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.N && (cVar = dj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = cVar.l();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) cVar.d;
                        com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                        b8.e eVar = new b8.e(t0Var, str2, "/tg-wear-auth/answer", l4);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new b7(cVar, dVar, iArr, i11)).addOnFailureListener(new cj1(dVar, 0));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                y yVar = (y) this.c;
                kVar.b = true;
                yVar.run();
                kVar.w.Y2.N(true);
                break;
            case 13:
                pg.x xVar = (pg.x) this.b;
                Context context5 = (Context) this.c;
                if (!xVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.n.f().addView(nVar, w7.y5.c(-1.0f, -1));
                    pg.u uVar = xVar.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.d5(uVar, i12));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.rr.f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, i16));
                    duration.start();
                    xVar.n.a();
                    xVar.dismiss();
                    break;
                }
                break;
            case 14:
                qg.n2 n2Var = (qg.n2) this.b;
                ci.ed edVar = (ci.ed) this.c;
                qg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j3 = n2Var.j(n2Var.n0, n2Var.o0)) != null) {
                    edVar.run(j3);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.vn.d0((wn) this.c, 41026, new ii.q1((qh.c) this.b, i13), null);
                break;
            case 16:
                rg.j0.V((rg.j0) this.b, (Context) this.c);
                break;
            case 17:
                tg.s0 s0Var = (tg.s0) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i18 < size3) {
                            Object obj6 = arrayList3.get(i18);
                            i18++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        tg.s.a(chat2.id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 17), new ii.q1(s0Var, i14));
                        break;
                    }
                }
                break;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = m1Var3.h0;
                int size4 = arrayList5.size();
                while (i18 < size4) {
                    Object obj7 = arrayList5.get(i18);
                    i18++;
                    Long l10 = (Long) obj7;
                    l10.getClass();
                    hashSet2.remove(l10);
                    m1Var3.n0.remove(l10);
                }
                m1Var3.W();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, i15), null);
                m1Var3.i0(true, true);
                m1Var3.X();
                break;
            case 19:
                tg.m1.S((tg.m1) this.b, (TLRPC.User) this.c, view);
                break;
            case 20:
                final ug.e eVar2 = (ug.e) this.b;
                final vg.a aVar = (vg.a) this.c;
                if (!eVar2.d) {
                    ((tg.b0) eVar2).r.dismiss();
                    break;
                } else if (!aVar.a.N) {
                    aVar.b(true);
                    String str3 = eVar2.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: ug.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (i18) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    i.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: ug.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (i19) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    i.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.o(callback2, callback, i18), 2);
                    break;
                }
                break;
            case 21:
                vg.g gVar2 = (vg.g) this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                vg.f fVar2 = gVar2.s;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).a;
                    a0Var.c0.remove(chat3);
                    a0Var.a0(true, true);
                    break;
                }
                break;
            case 22:
                ((ii.q1) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 23:
                ((ii.q1) this.b).run((TLRPC.Chat) this.c);
                break;
            case 24:
                xh.c.P((xh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 25:
                xh.i4 i4Var = (xh.i4) this.b;
                yh.k7 k7Var = (yh.k7) this.c;
                i4Var.getClass();
                if (k7Var.f > 0) {
                    i4Var.presentFragment(new yh.w7());
                    break;
                }
                break;
            case 26:
                xh.h4.P((xh.h4) this.b, (xh.g4) this.c);
                break;
            case 27:
                xh.m4 m4Var = (xh.m4) this.b;
                ei.r4 r4Var = (ei.r4) this.c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.l;
                        int size5 = arrayList7.size();
                        int i24 = 0;
                        while (true) {
                            if (i24 < size5) {
                                Object obj8 = arrayList7.get(i24);
                                i24++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i25 = savedStarGift.msg_id;
                                if ((i25 == 0 || i25 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList6.add(savedStarGift);
                        }
                    }
                    r4Var.run(arrayList6);
                    m4Var.dismiss();
                    break;
                }
                break;
            case 28:
                xh.j4 j4Var = (xh.j4) this.b;
                org.telegram.messenger.ik ikVar = (org.telegram.messenger.ik) this.c;
                yh.k5 k5Var = j4Var.c.Y;
                k5Var.e = !k5Var.e;
                ikVar.run();
                k5Var.i(true);
                break;
            default:
                yh.g.X((yh.g) this.b, (Context) this.c, view);
                break;
        }
    }
}
