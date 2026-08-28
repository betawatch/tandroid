package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.jh0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.o9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.Components.z8 d;
    public final dp e;
    public ContactsController.Contact f;
    public CharSequence h;

    public p4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(o9Var, g7.e6.d(46, 46.0f, (LocaleController.isRTL ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, g7.e6.d(-1, -1.0f, 119, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, g7.e6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(h5Var, g7.e6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var2;
        h5Var2.setTextSize(13);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(h5Var2, g7.e6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            dp dpVar = new dp(context, 21, null);
            this.e = dpVar;
            dpVar.b(-1, org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        jh0 jh0Var = new jh0(context);
        jh0Var.setText(LocaleController.getString(R.string.Invite));
        jh0Var.setTextSize(1, 14.0f);
        jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hl, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{16.0f}, w02));
        jh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(jh0Var, g7.e6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        jh0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f;
        if (contact == null) {
            return;
        }
        long j10 = contact.contact_id;
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.o(j10, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f;
            h5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i9 = org.telegram.ui.ActionBar.f6.y6;
        Integer valueOf = Integer.valueOf(i9);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.c;
        h5Var2.setTag(valueOf);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        ContactsController.Contact contact3 = this.f;
        int i10 = contact3.imported;
        if (i10 > 0) {
            h5Var2.l(LocaleController.formatPluralString("TelegramContacts", i10, new Object[0]), false);
        } else {
            h5Var2.l(contact3.phones.get(0), false);
        }
        this.a.setImageDrawable(z8Var);
    }

    public ContactsController.Contact getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
