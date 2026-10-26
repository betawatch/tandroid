package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.y9 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final org.telegram.ui.Components.j9 d;
    public final zp e;
    public ContactsController.Contact f;
    public CharSequence h;
    public int n;

    public t4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, gb1.h(46, 46.0f, (LocaleController.isRTL ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, gb1.h(-1, -1.0f, 119, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, gb1.p(1.0f, 0, 58));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(15);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(b6Var, gb1.h(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.c = b6Var2;
        b6Var2.setTextSize(13);
        b6Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(b6Var2, gb1.h(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            zp zpVar = new zp(context, 21, null);
            this.e = zpVar;
            zpVar.b(-1, org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.k7);
            zpVar.setDrawUnchecked(false);
            zpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(zpVar, gb1.h(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        wi0 wi0Var = new wi0(context);
        wi0Var.setText(LocaleController.getString(R.string.Invite));
        wi0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(wi0Var, org.telegram.ui.ActionBar.y6.Sh, null);
        wi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
        int i10 = org.telegram.ui.ActionBar.y6.hl;
        y e = org.telegram.ui.ActionBar.o6.e(new float[]{16.0f}, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i10);
        wi0Var.setBackground(e);
        org.telegram.ui.ActionBar.f7.k(wi0Var, e, N, f7, null);
        wi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(wi0Var, gb1.t(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        wi0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(ContactsController.Contact contact, CharSequence charSequence) {
        this.f = contact;
        this.h = charSequence;
        if (contact == null) {
            return;
        }
        long j10 = contact.contact_id;
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.o(j10, str, str2, null, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        if (charSequence2 != null) {
            b6Var.l(charSequence2, true);
        } else {
            ContactsController.Contact contact2 = this.f;
            b6Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.b6 b6Var2 = this.c;
        b6Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.f7.Y(b6Var2, i10, null);
        ContactsController.Contact contact3 = this.f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            b6Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            b6Var2.l(contact3.phones.get(0), false);
        }
        this.a.setImageDrawable(j9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J7, false) * 31) + org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O7, false)) * 31) + org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P7, false)) * 31) + org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Q7, false)) * 31) + org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R7, false)) * 31) + org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.S7, false)) * 31) + org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.T7, false)) * 31) + org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.U7, false);
            if (x02 == this.n) {
                return;
            }
            this.n = x02;
            org.telegram.ui.Components.y9 y9Var = this.a;
            if (y9Var != null) {
                y9Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
