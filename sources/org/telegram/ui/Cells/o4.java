package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.yh0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout {
    public final org.telegram.ui.Components.u9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.Components.f9 d;
    public final np e;
    public ContactsController.Contact f;
    public CharSequence h;

    public o4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(u9Var, w7.x5.d(46, 46.0f, (LocaleController.isRTL ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, w7.x5.d(-1, -1.0f, 119, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.x5.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(15);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(k5Var, w7.x5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(13);
        k5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(k5Var2, w7.x5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            np npVar = new np(context, 21, null);
            this.e = npVar;
            npVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(npVar, w7.x5.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        yh0 yh0Var = new yh0(context);
        yh0Var.setText(LocaleController.getString(R.string.Invite));
        yh0Var.setTextSize(1, 14.0f);
        yh0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        yh0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        yh0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{16.0f}, w02));
        yh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(yh0Var, w7.x5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        yh0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f;
        if (contact == null) {
            return;
        }
        long j3 = contact.contact_id;
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.f9 f9Var = this.d;
        f9Var.o(j3, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        if (charSequence != null) {
            k5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f;
            k5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.c;
        k5Var2.setTag(valueOf);
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            k5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            k5Var2.l(contact3.phones.get(0), false);
        }
        this.a.setImageDrawable(f9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
