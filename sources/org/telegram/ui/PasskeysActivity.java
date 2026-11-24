package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class PasskeysActivity extends org.telegram.ui.ActionBar.d {
    public q7c a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void f0(int i, ylb ylbVar, Context context, boolean z) {
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i2 = hg9.i(context, 1);
        i2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(8.0f));
        h.O = i2;
        s09 s09Var = new s09(context);
        s09Var.f(R.raw.passkey, gm.L(115.0f), gm.L(115.0f), null);
        s09Var.d();
        i2.addView(s09Var, qoe.t(nm7.z1, nm7.z1, 17, 0, 0, 0, 9));
        int i3 = cmb.i5;
        TextView b = jxe.b(context, 18.0f, i3, true, ylbVar);
        hg9.p(b, 17, null, 2131747369);
        i2.addView(b, qoe.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b2 = jxe.b(context, 14.0f, i3, false, ylbVar);
        hg9.p(b2, 17, null, 2131747370);
        i2.addView(b2, qoe.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        z74 z74Var = new z74(1, ylbVar, context);
        z74Var.a(R.drawable.msg2_permissions, jb6.M0(2131747376, null), jb6.M0(2131747377, null));
        i2.addView(z74Var, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        z74 z74Var2 = new z74(1, ylbVar, context);
        z74Var2.a(R.drawable.menu_face, jb6.M0(2131747374, null), jb6.M0(2131747375, null));
        i2.addView(z74Var2, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        z74 z74Var3 = new z74(1, ylbVar, context);
        z74Var3.a(R.drawable.menu_privacy, jb6.M0(2131747372, null), jb6.M0(2131747373, null));
        i2.addView(z74Var3, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        b61 i4 = mlb.i(24, ylbVar, context, true);
        i4.i(jb6.M0(2131747371, null), false, true);
        i4.setOnClickListener(new ph((Object) i4, (Object) context, i, (Object) h, (byte) 5));
        if (z) {
            i2.addView(i4, qoe.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        h.J();
        h.show();
    }

    public final void Z(TL_account.Passkey passkey) {
        l7c l7cVar;
        this.b.add(passkey);
        q7c q7cVar = this.a;
        if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
            l7cVar.O(true);
        }
        u31 I = c41.b0(this).I(R.raw.passcode_lock_close, jb6.M0(2131747381, null), jb6.a0(null, null, 2131747382, passkey.name));
        I.j = 5000;
        I.k(true);
    }

    public final void a0() {
        f0(this.currentAccount, this.resourceProvider, getParentActivity(), this.b.size() + 1 <= getMessagesController().l4.D.f());
    }

    public final void b0(TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                oc7.r1(this.currentAccount).p4(0L, "SETUP_PASSKEY");
                Z(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            c41.b0(this).f0(str, true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131747365, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131747366, null);
        b10.t(null, 2131747564, alertDialog$Builder, null);
    }

    public final /* synthetic */ void c0(TL_account.Passkey passkey, String str, int i) {
        this.b.remove(passkey);
        this.a.g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletepasskey, new kc((byte) 0), new ro1(this, i, passkey, (byte) 2));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131747384, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 17));
        FrameLayout frameLayout = new FrameLayout(context);
        q7c q7cVar = new q7c(this, new ey7(this, (byte) 0), new cj6(this, (byte) 28), null);
        this.a = q7cVar;
        q7cVar.r1();
        this.a.setSectionsDrawBackground(true);
        q7c q7cVar2 = this.a;
        q7cVar2.g3.r = false;
        frameLayout.addView(q7cVar2, qoe.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(c6c c6cVar, View view) {
        if (c6cVar.d == -1) {
            ly7.a(getParentActivity(), this.currentAccount, new ey7(this, (byte) 1));
        } else if (c6cVar.H != null) {
            e0(view);
        }
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z) {
            viewParent = view.getParent();
        }
        gy7 gy7Var = (gy7) viewParent;
        String str = gy7Var.w;
        int i = 0;
        while (true) {
            arrayList = this.b;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (str.equals(((TL_account.Passkey) arrayList.get(i)).id)) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i;
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i2);
        bu5 I = bu5.I(this, gy7Var);
        I.b(R.drawable.msg_delete, jb6.M0(2131751535, null), new v36((Object) this, (Object) passkey, (Object) str, i2, (byte) 16), true);
        I.X(this.a.V0(gy7Var, false));
        I.a0();
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
    public final boolean useSimpleActionBar() {
        return true;
    }
}
