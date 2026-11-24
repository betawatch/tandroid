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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f41 extends n5c implements gk7 {
    public static hd e;

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
    public static void f0(Activity activity, int i, TL_account.TL_businessChatLink tL_businessChatLink, wjb wjbVar) {
        d Q = LaunchActivity.Q();
        Activity W = gl.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        byte b = 1;
        byte b2 = 0;
        boolean z = Q != null && (Q.getFragmentView() instanceof cja) && ((cja) Q.getFragmentView()).Q() > gl.L(20.0f);
        hd[] hdVarArr = new hd[1];
        ?? mdVar = z ? new md(0, wjbVar, activity) : new AlertDialog$Builder(0, wjbVar, activity);
        String M0 = k96.M0(2131752687, null);
        hd hdVar = mdVar.a;
        hdVar.S = M0;
        c41 c41Var = new c41(activity, wjbVar);
        hq6.d0(i).O(gl.F0(), true);
        c41Var.setInputType(49153);
        c41Var.setTextSize(1, 18.0f);
        c41Var.setText(tL_businessChatLink.title);
        int i2 = bkb.i5;
        zkb.X(c41Var, i2, wjbVar);
        zkb.l(c41Var, 34, bkb.Ni, wjbVar);
        zkb.l(c41Var, 30, bkb.Me, null);
        c41Var.setHintText(k96.M0(2131752689, null));
        c41Var.setSingleLine(true);
        c41Var.setFocusable(true);
        zkb.F(c41Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        c41Var.setImeOptions(6);
        c41Var.setBackgroundDrawable(null);
        c41Var.setPadding(0, 0, gl.L(42.0f), 0);
        LinearLayout m = ir2.m(activity, 1);
        TextView textView = new TextView(activity);
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131752688, null));
        m.addView(textView, nme.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        m.addView(c41Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        mdVar.n(m);
        hdVar.a = gl.L(292.0f);
        c41Var.setOnEditorActionListener(new yf(c41Var, i, tL_businessChatLink, hdVarArr, currentFocus, (byte) 1));
        mdVar.j(k96.M0(2131751342, null), new zf(c41Var, i, tL_businessChatLink, b));
        mdVar.g(k96.M0(2131752577, null), new qm0((byte) 13));
        if (z) {
            e = hdVar;
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new b41(currentFocus, (byte) 0));
            e.setOnShowListener(new jg(c41Var, (byte) 2));
            e.q(250L);
        } else {
            hdVar.P = new x0(currentFocus, c41Var, (byte) 11);
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new n1(c41Var, (byte) 9));
            hdVarArr[0].setOnShowListener(new z31(currentFocus, c41Var, b2));
            hdVarArr[0].show();
        }
        hdVarArr[0].k0 = false;
        c41Var.setSelection(c41Var.getText().length());
    }

    @Override // n5c
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        vib vibVar = null;
        String M0 = k96.M0(2131752698, null);
        String M02 = k96.M0(2131752691, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.p = M02;
        c4cVar.k = R.raw.biz_links;
        arrayList.add(c4cVar);
        l5cVar.V();
        j41 d = j41.d(this.currentAccount);
        if (d.b.size() < na7.q1(d.a).k4.m2.f()) {
            c4c c = c4c.c(1, R.drawable.menu_link_create, k96.M0(2131752697, null));
            c.r = true;
            arrayList.add(c);
        }
        ArrayList arrayList2 = j41.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            e41 e41Var = new e41();
            e41Var.a = (TL_account.TL_businessChatLink) obj;
            c4c c4cVar2 = new c4c(29);
            c4cVar2.H = e41Var;
            arrayList.add(c4cVar2);
        }
        l5cVar.U();
        TLRPC.User f = y6c.h(this.currentAccount).f();
        String j = b00.j(new StringBuilder(), na7.q1(this.currentAccount).N2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String o = l7c.o(f);
        if (o != null) {
            arrayList3.add(j.concat(o));
        }
        ArrayList v = qu2.r(this.currentAccount).v(6);
        ArrayList v2 = qu2.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f.phone) && v != null && v2 != null && (c0(v) != 1 || c0(v2) != 2)) {
            StringBuilder k = b00.k(j, "+");
            k.append(f.phone);
            arrayList3.add(k.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String a0 = arrayList3.size() == 2 ? k96.a0(null, null, 2131752692, arrayList3.get(0), arrayList3.get(1)) : k96.a0(null, null, 2131752693, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(a0);
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            String str = (String) obj2;
            int indexOf = a0.indexOf(str);
            if (indexOf > -1) {
                ui uiVar = new ui(b00.h("https://", str), vibVar);
                uiVar.f = this;
                spannableString.setSpan(uiVar, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(c4c.C(spannableString));
    }

    @Override // n5c
    public final CharSequence Z() {
        return k96.M0(2131752698, null);
    }

    @Override // n5c
    public final boolean b0(c4c c4cVar, View view) {
        final byte b = 0;
        if (c4cVar.a == 29) {
            Object obj = c4cVar.H;
            if (obj instanceof e41) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((e41) obj).a;
                cs5 I = cs5.I(this, view);
                I.b(R.drawable.msg_copy, k96.M0(2131751755, null), new nv0(tL_businessChatLink, (byte) 8), false);
                I.b(R.drawable.msg_share, k96.M0(2131748733, null), new Runnable(this) { // from class: a41
                    public final /* synthetic */ f41 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        f41 f41Var = this.b;
                        switch (b2) {
                            case 0:
                                Intent intent = new Intent(f41Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                f41Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                f41Var.d0(tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f41Var.getResourceProvider(), f41Var.getParentActivity());
                                String M0 = k96.M0(2131752695, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131752696, null);
                                alertDialog$Builder.j(k96.M0(2131746128, null), new q31(f41Var, tL_businessChatLink2, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                f41Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, f41Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final byte b2 = 1;
                I.b(R.drawable.msg_edit, k96.M0(2131746085, null), new Runnable(this) { // from class: a41
                    public final /* synthetic */ f41 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        f41 f41Var = this.b;
                        switch (b22) {
                            case 0:
                                Intent intent = new Intent(f41Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                f41Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                f41Var.d0(tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f41Var.getResourceProvider(), f41Var.getParentActivity());
                                String M0 = k96.M0(2131752695, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131752696, null);
                                alertDialog$Builder.j(k96.M0(2131746128, null), new q31(f41Var, tL_businessChatLink2, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                f41Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, f41Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final byte b3 = 2;
                I.b(R.drawable.msg_delete, k96.M0(2131751586, null), new Runnable(this) { // from class: a41
                    public final /* synthetic */ f41 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b3;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        f41 f41Var = this.b;
                        switch (b22) {
                            case 0:
                                Intent intent = new Intent(f41Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                f41Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                f41Var.d0(tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f41Var.getResourceProvider(), f41Var.getParentActivity());
                                String M0 = k96.M0(2131752695, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131752696, null);
                                alertDialog$Builder.j(k96.M0(2131746128, null), new q31(f41Var, tL_businessChatLink2, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                f41Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, f41Var.getResourceProvider());
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

    @Override // n5c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(k96.M0(2131752698, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    public final void d0(TL_account.TL_businessChatLink tL_businessChatLink) {
        f0(getParentActivity(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i == kk7.I1 || i == kk7.j0) {
            va vaVar = this.a;
            if (vaVar == null || (l5cVar = vaVar.g3) == null) {
                return;
            }
            l5cVar.O(true);
            return;
        }
        if (i != kk7.J1) {
            if (i == kk7.K1) {
                j41.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle j = ls6.j(6, "chatMode");
            j.putString("business_link", tL_businessChatLink.link);
            presentFragment(new mu1(j));
        }
    }

    public final /* synthetic */ void e0(TL_account.TL_businessChatLink tL_businessChatLink) {
        j41.d(this.currentAccount).a(this, tL_businessChatLink.link);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        hd hdVar = e;
        if (hdVar == null || !hdVar.isShowing()) {
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
        getNotificationCenter().b(this, kk7.I1);
        getNotificationCenter().b(this, kk7.J1);
        getNotificationCenter().b(this, kk7.K1);
        getNotificationCenter().b(this, kk7.j0);
        j41 d = j41.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        qu2.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.I1);
        getNotificationCenter().n(this, kk7.J1);
        getNotificationCenter().n(this, kk7.K1);
        getNotificationCenter().n(this, kk7.j0);
        m21.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
