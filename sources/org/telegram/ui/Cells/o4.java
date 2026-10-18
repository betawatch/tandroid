package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout {
    public final org.telegram.ui.Components.w9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final org.telegram.ui.Components.h9 d;
    public final xp e;
    public ContactsController.Contact f;
    public CharSequence h;

    public o4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.z5.a(46.0f, 13.0f, 6.0f, 13.0f, 6.0f, 46, (LocaleController.isRTL ? 5 : 3) | 48));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, w7.z5.a(-1.0f, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.z5.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(15);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(j5Var, w7.z5.a(20.0f, 0.0f, 9.0f, 0.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var2;
        j5Var2.setTextSize(13);
        j5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(j5Var2, w7.z5.a(20.0f, 0.0f, 33.0f, 0.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        if (z10) {
            xp xpVar = new xp(context, 21, null);
            this.e = xpVar;
            xpVar.b(-1, org.telegram.ui.ActionBar.h6.d6, org.telegram.ui.ActionBar.h6.k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(xpVar, w7.z5.a(24.0f, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f, 24, (z12 ? 5 : 3) | 48));
            return;
        }
        this.e = null;
        ti0 ti0Var = new ti0(context);
        ti0Var.setText(LocaleController.getString(R.string.Invite));
        ti0Var.setTextSize(1, 14.0f);
        ti0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        ti0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hl, false);
        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
        ti0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{16.0f}, x02));
        ti0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(ti0Var, w7.z5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        ti0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f;
        if (contact == null) {
            return;
        }
        long j10 = contact.contact_id;
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.h9 h9Var = this.d;
        h9Var.o(j10, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.j5 j5Var = this.b;
        if (charSequence != null) {
            j5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f;
            j5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.h6.y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.c;
        j5Var2.setTag(valueOf);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        ContactsController.Contact contact3 = this.f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            j5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            j5Var2.l(contact3.phones.get(0), false);
        }
        this.a.setImageDrawable(h9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
