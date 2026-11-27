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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n41 extends n9c implements fn7 {
    public static id e;

    public static int c0(ArrayList arrayList) {
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
    public static void f0(Activity activity, int i, TL_account.TL_businessChatLink tL_businessChatLink, vnb vnbVar) {
        e Q = LaunchActivity.Q();
        Activity W = hl.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        byte b = 1;
        byte b2 = 0;
        boolean z = Q != null && (Q.getFragmentView() instanceof wma) && ((wma) Q.getFragmentView()).Q() > hl.L(20.0f);
        id[] idVarArr = new id[1];
        ?? ndVar = z ? new nd(0, vnbVar, activity) : new AlertDialog$Builder(0, vnbVar, activity);
        String M0 = ob6.M0(2131752680, null);
        id idVar = ndVar.a;
        idVar.S = M0;
        k41 k41Var = new k41(activity, vnbVar);
        ls6.d0(i).O(hl.F0(), true);
        k41Var.setInputType(49153);
        k41Var.setTextSize(1, 18.0f);
        k41Var.setText(tL_businessChatLink.title);
        int i2 = aob.j5;
        yob.X(k41Var, i2, vnbVar);
        yob.l(k41Var, 34, aob.Oi, vnbVar);
        yob.l(k41Var, 30, aob.Ne, null);
        k41Var.setHintText(ob6.M0(2131752682, null));
        k41Var.setSingleLine(true);
        k41Var.setFocusable(true);
        yob.F(k41Var, aob.k6, aob.l6, aob.p7, vnbVar);
        k41Var.setImeOptions(6);
        k41Var.setBackgroundDrawable(null);
        k41Var.setPadding(0, 0, hl.L(42.0f), 0);
        LinearLayout m = bs2.m(activity, 1);
        TextView textView = new TextView(activity);
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131752681, null));
        m.addView(textView, tre.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        m.addView(k41Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        ndVar.n(m);
        idVar.a = hl.L(292.0f);
        k41Var.setOnEditorActionListener(new af(k41Var, i, tL_businessChatLink, idVarArr, currentFocus, (byte) 1));
        ndVar.j(ob6.M0(2131751319, null), new bf(k41Var, i, tL_businessChatLink, b));
        ndVar.g(ob6.M0(2131752570, null), new rm0((byte) 14));
        if (z) {
            e = idVar;
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new i41(currentFocus, (byte) 0));
            e.setOnShowListener(new ig(k41Var, (byte) 2));
            e.q(250L);
        } else {
            idVar.P = new y0(currentFocus, k41Var, (byte) 11);
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new o1(k41Var, (byte) 9));
            idVarArr[0].setOnShowListener(new j41(b2, currentFocus, k41Var));
            idVarArr[0].show();
        }
        idVarArr[0].k0 = false;
        k41Var.setSelection(k41Var.getText().length());
    }

    @Override // n9c
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        rmb rmbVar = null;
        String M0 = ob6.M0(2131752691, null);
        String M02 = ob6.M0(2131752684, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.k = R.raw.biz_links;
        arrayList.add(b8cVar);
        l9cVar.V();
        r41 d = r41.d(this.currentAccount);
        if (d.b.size() < uc7.s1(d.a).k4.u2.f()) {
            b8c c = b8c.c(1, R.drawable.menu_link_create, ob6.M0(2131752690, null));
            c.r = true;
            arrayList.add(c);
        }
        ArrayList arrayList2 = r41.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            m41 m41Var = new m41();
            m41Var.a = (TL_account.TL_businessChatLink) obj;
            b8c b8cVar2 = new b8c(29);
            b8cVar2.H = m41Var;
            arrayList.add(b8cVar2);
        }
        l9cVar.U();
        TLRPC.User f = yac.h(this.currentAccount).f();
        String k = c00.k(new StringBuilder(), uc7.s1(this.currentAccount).N2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String p = lbc.p(f);
        if (p != null) {
            arrayList3.add(k.concat(p));
        }
        ArrayList v = lv2.r(this.currentAccount).v(6);
        ArrayList v2 = lv2.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f.phone) && v != null && v2 != null && (c0(v) != 1 || c0(v2) != 2)) {
            StringBuilder l = c00.l(k, "+");
            l.append(f.phone);
            arrayList3.add(l.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String a0 = arrayList3.size() == 2 ? ob6.a0(null, null, 2131752685, arrayList3.get(0), arrayList3.get(1)) : ob6.a0(null, null, 2131752686, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(a0);
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            String str = (String) obj2;
            int indexOf = a0.indexOf(str);
            if (indexOf > -1) {
                vi viVar = new vi(c00.i("https://", str), rmbVar);
                viVar.f = this;
                spannableString.setSpan(viVar, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(b8c.C(spannableString));
    }

    @Override // n9c
    public final CharSequence Z() {
        return ob6.M0(2131752691, null);
    }

    @Override // n9c
    public final boolean b0(b8c b8cVar, View view) {
        final byte b = 0;
        if (b8cVar.a == 29) {
            Object obj = b8cVar.H;
            if (obj instanceof m41) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((m41) obj).a;
                fu5 I = fu5.I(this, view);
                I.b(R.drawable.msg_copy, ob6.M0(2131751732, null), new fv0(tL_businessChatLink, (byte) 10), false);
                final byte b2 = 2;
                I.b(R.drawable.msg_share, ob6.M0(2131748679, null), new Runnable(this) { // from class: h41
                    public final /* synthetic */ n41 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        n41 n41Var = this.b;
                        switch (b3) {
                            case 0:
                                n41Var.d0(tL_businessChatLink2);
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n41Var.getResourceProvider(), n41Var.getParentActivity());
                                String M0 = ob6.M0(2131752688, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131752689, null);
                                alertDialog$Builder.j(ob6.M0(2131746048, null), new h01(n41Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                n41Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, n41Var.getResourceProvider());
                                    break;
                                }
                                break;
                            default:
                                Intent intent = new Intent(n41Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                n41Var.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                }, false);
                I.b(R.drawable.msg_edit, ob6.M0(2131746005, null), new Runnable(this) { // from class: h41
                    public final /* synthetic */ n41 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        n41 n41Var = this.b;
                        switch (b3) {
                            case 0:
                                n41Var.d0(tL_businessChatLink2);
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n41Var.getResourceProvider(), n41Var.getParentActivity());
                                String M0 = ob6.M0(2131752688, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131752689, null);
                                alertDialog$Builder.j(ob6.M0(2131746048, null), new h01(n41Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                n41Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, n41Var.getResourceProvider());
                                    break;
                                }
                                break;
                            default:
                                Intent intent = new Intent(n41Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                n41Var.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                }, false);
                final byte b3 = 1;
                I.b(R.drawable.msg_delete, ob6.M0(2131751563, null), new Runnable(this) { // from class: h41
                    public final /* synthetic */ n41 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        n41 n41Var = this.b;
                        switch (b32) {
                            case 0:
                                n41Var.d0(tL_businessChatLink2);
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n41Var.getResourceProvider(), n41Var.getParentActivity());
                                String M0 = ob6.M0(2131752688, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131752689, null);
                                alertDialog$Builder.j(ob6.M0(2131746048, null), new h01(n41Var, tL_businessChatLink2, (byte) 2));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                n41Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, n41Var.getResourceProvider());
                                    break;
                                }
                                break;
                            default:
                                Intent intent = new Intent(n41Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                n41Var.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                }, true);
                I.X(this.a.W0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // n9c, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(ob6.M0(2131752691, null));
        this.b.setBackground(null);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    public final void d0(TL_account.TL_businessChatLink tL_businessChatLink) {
        f0(getParentActivity(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i == jn7.J1 || i == jn7.k0) {
            wa waVar = this.a;
            if (waVar == null || (l9cVar = waVar.g3) == null) {
                return;
            }
            l9cVar.O(true);
            return;
        }
        if (i != jn7.K1) {
            if (i == jn7.L1) {
                r41.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle j = qu6.j(6, "chatMode");
            j.putString("business_link", tL_businessChatLink.link);
            presentFragment(new zu1(j));
        }
    }

    public final /* synthetic */ void e0(TL_account.TL_businessChatLink tL_businessChatLink) {
        r41.d(this.currentAccount).a(this, tL_businessChatLink.link);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        id idVar = e;
        if (idVar == null || !idVar.isShowing()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.J1);
        getNotificationCenter().b(this, jn7.K1);
        getNotificationCenter().b(this, jn7.L1);
        getNotificationCenter().b(this, jn7.k0);
        r41 d = r41.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        lv2.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.J1);
        getNotificationCenter().n(this, jn7.K1);
        getNotificationCenter().n(this, jn7.L1);
        getNotificationCenter().n(this, jn7.k0);
        v21.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
