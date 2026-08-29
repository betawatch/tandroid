package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.th0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n4 extends FrameLayout {
    public final org.telegram.ui.Components.t9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.Components.e9 d;
    public final hp e;
    public ContactsController.Contact f;
    public CharSequence h;

    public n4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(t9Var, i7.f6.d(46, 46.0f, (LocaleController.isRTL ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, i7.f6.d(-1, -1.0f, 119, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, i7.f6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(h5Var, i7.f6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var2;
        h5Var2.setTextSize(13);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(h5Var2, i7.f6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            hp hpVar = new hp(context, 21, null);
            this.e = hpVar;
            hpVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(hpVar, i7.f6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        th0 th0Var = new th0(context);
        th0Var.setText(LocaleController.getString(R.string.Invite));
        th0Var.setTextSize(1, 14.0f);
        th0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, w02));
        th0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(th0Var, i7.f6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        th0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f;
        if (contact == null) {
            return;
        }
        long j10 = contact.contact_id;
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.e9 e9Var = this.d;
        e9Var.o(j10, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f;
            h5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.g6.y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.c;
        h5Var2.setTag(valueOf);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            h5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            h5Var2.l(contact3.phones.get(0), false);
        }
        this.a.setImageDrawable(e9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
