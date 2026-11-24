// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m51 extends n7c implements jm7 {
    public static he e;

    public static int d0(ArrayList arrayList) {
        char c = 65535;
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c == 65535) {
                                c = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        if (c == 0 || (c == 65535 && z)) {
            return 0;
        }
        return c == 2 ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void g0(Activity activity, int i, TL_account.TL_businessChatLink tL_businessChatLink, ylb ylbVar) {
        d Q = LaunchActivity.Q();
        Activity W = gm.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        byte b = 1;
        byte b2 = 0;
        boolean z = Q != null && (Q.getFragmentView() instanceof ela) && ((ela) Q.getFragmentView()).Q() > gm.L(20.0f);
        he[] heVarArr = new he[1];
        ?? meVar = z ? new me(0, ylbVar, activity) : new AlertDialog$Builder(0, ylbVar, activity);
        String M0 = jb6.M0(2131752652, null);
        he heVar = meVar.a;
        heVar.S = M0;
        j51 j51Var = new j51(activity, ylbVar);
        hs6.d0(i).O(gm.F0(), true);
        j51Var.setInputType(49153);
        j51Var.setTextSize(1, 18.0f);
        j51Var.setText(tL_businessChatLink.title);
        int i2 = cmb.i5;
        anb.X(j51Var, i2, ylbVar);
        anb.l(j51Var, 34, cmb.Ni, ylbVar);
        anb.l(j51Var, 30, cmb.Me, null);
        j51Var.setHintText(jb6.M0(2131752654, null));
        j51Var.setSingleLine(true);
        j51Var.setFocusable(true);
        anb.F(j51Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        j51Var.setImeOptions(6);
        j51Var.setBackgroundDrawable(null);
        j51Var.setPadding(0, 0, gm.L(42.0f), 0);
        LinearLayout l = td4.l(activity, 1);
        TextView textView = new TextView(activity);
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131752653, null));
        l.addView(textView, qoe.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        l.addView(j51Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        meVar.n(l);
        heVar.a = gm.L(292.0f);
        j51Var.setOnEditorActionListener(new xg(j51Var, i, tL_businessChatLink, heVarArr, currentFocus, (byte) 1));
        meVar.j(jb6.M0(2131751291, null), new yg(j51Var, i, tL_businessChatLink, b));
        meVar.g(jb6.M0(2131752542, null), new qn0((byte) 13));
        if (z) {
            e = heVar;
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new i51(currentFocus, (byte) 0));
            e.setOnShowListener(new jh(j51Var, (byte) 2));
            e.q(250L);
        } else {
            heVar.P = new x0(currentFocus, j51Var, (byte) 12);
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new n1(j51Var, (byte) 9));
            heVarArr[0].setOnShowListener(new g51(currentFocus, j51Var, b2));
            heVarArr[0].show();
        }
        heVarArr[0].k0 = false;
        j51Var.setSelection(j51Var.getText().length());
    }

    @Override // n7c
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        wkb wkbVar = null;
        String M0 = jb6.M0(2131752663, null);
        String M02 = jb6.M0(2131752656, null);
        c6c c6cVar = new c6c(2);
        c6cVar.m = M0;
        c6cVar.p = M02;
        c6cVar.k = R.raw.biz_links;
        arrayList.add(c6cVar);
        l7cVar.V();
        q51 d = q51.d(this.currentAccount);
        if (d.b.size() < oc7.r1(d.a).l4.m2.f()) {
            c6c c = c6c.c(1, R.drawable.menu_link_create, jb6.M0(2131752662, null));
            c.r = true;
            arrayList.add(c);
        }
        ArrayList arrayList2 = q51.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            l51 l51Var = new l51();
            l51Var.a = (TL_account.TL_businessChatLink) obj;
            c6c c6cVar2 = new c6c(29);
            c6cVar2.H = l51Var;
            arrayList.add(c6cVar2);
        }
        l7cVar.U();
        TLRPC.User f = z8c.h(this.currentAccount).f();
        String j = b10.j(new StringBuilder(), oc7.r1(this.currentAccount).N2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String p = m9c.p(f);
        if (p != null) {
            arrayList3.add(j.concat(p));
        }
        ArrayList v = bw2.r(this.currentAccount).v(6);
        ArrayList v2 = bw2.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f.phone) && v != null && v2 != null && (d0(v) != 1 || d0(v2) != 2)) {
            StringBuilder k = b10.k(j, "+");
            k.append(f.phone);
            arrayList3.add(k.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String a0 = arrayList3.size() == 2 ? jb6.a0(null, null, 2131752657, arrayList3.get(0), arrayList3.get(1)) : jb6.a0(null, null, 2131752658, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(a0);
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            String str = (String) obj2;
            int indexOf = a0.indexOf(str);
            if (indexOf > -1) {
                uj ujVar = new uj(b10.h("https://", str), wkbVar);
                ujVar.f = this;
                spannableString.setSpan(ujVar, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(c6c.C(spannableString));
    }

    @Override // n7c
    public final CharSequence a0() {
        return jb6.M0(2131752663, null);
    }

    @Override // n7c
    public final boolean c0(c6c c6cVar, View view) {
        final byte b = 0;
        if (c6cVar.a == 29) {
            Object obj = c6cVar.H;
            if (obj instanceof l51) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((l51) obj).a;
                bu5 I = bu5.I(this, view);
                I.b(R.drawable.msg_copy, jb6.M0(2131751704, null), new yt0(tL_businessChatLink, (byte) 11), false);
                I.b(R.drawable.msg_share, jb6.M0(2131748682, null), new Runnable(this) { // from class: h51
                    public final /* synthetic */ m51 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        m51 m51Var = this.b;
                        switch (b2) {
                            case 0:
                                Intent intent = new Intent(m51Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                m51Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                m51Var.e0(tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m51Var.getResourceProvider(), m51Var.getParentActivity());
                                String M0 = jb6.M0(2131752660, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131752661, null);
                                alertDialog$Builder.j(jb6.M0(2131746054, null), new g11(m51Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                m51Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, m51Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final byte b2 = 1;
                I.b(R.drawable.msg_edit, jb6.M0(2131746011, null), new Runnable(this) { // from class: h51
                    public final /* synthetic */ m51 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        m51 m51Var = this.b;
                        switch (b22) {
                            case 0:
                                Intent intent = new Intent(m51Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                m51Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                m51Var.e0(tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m51Var.getResourceProvider(), m51Var.getParentActivity());
                                String M0 = jb6.M0(2131752660, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131752661, null);
                                alertDialog$Builder.j(jb6.M0(2131746054, null), new g11(m51Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                m51Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, m51Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final byte b3 = 2;
                I.b(R.drawable.msg_delete, jb6.M0(2131751535, null), new Runnable(this) { // from class: h51
                    public final /* synthetic */ m51 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        m51 m51Var = this.b;
                        switch (b22) {
                            case 0:
                                Intent intent = new Intent(m51Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                m51Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                m51Var.e0(tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m51Var.getResourceProvider(), m51Var.getParentActivity());
                                String M0 = jb6.M0(2131752660, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131752661, null);
                                alertDialog$Builder.j(jb6.M0(2131746054, null), new g11(m51Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                m51Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, m51Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                I.X(this.a.V0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // n7c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(jb6.M0(2131752663, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i == nm7.J1 || i == nm7.k0) {
            va vaVar = this.a;
            if (vaVar == null || (l7cVar = vaVar.g3) == null) {
                return;
            }
            l7cVar.O(true);
            return;
        }
        if (i != nm7.K1) {
            if (i == nm7.L1) {
                q51.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle j = kt6.j(6, "chatMode");
            j.putString("business_link", tL_businessChatLink.link);
            presentFragment(new yv1(j));
        }
    }

    public final void e0(TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(getParentActivity(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    public final /* synthetic */ void f0(TL_account.TL_businessChatLink tL_businessChatLink) {
        q51.d(this.currentAccount).a(this, tL_businessChatLink.link);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        he heVar = e;
        if (heVar == null || !heVar.isShowing()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.J1);
        getNotificationCenter().b(this, nm7.K1);
        getNotificationCenter().b(this, nm7.L1);
        getNotificationCenter().b(this, nm7.k0);
        q51 d = q51.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        bw2.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.J1);
        getNotificationCenter().n(this, nm7.K1);
        getNotificationCenter().n(this, nm7.L1);
        getNotificationCenter().n(this, nm7.k0);
        u31.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
