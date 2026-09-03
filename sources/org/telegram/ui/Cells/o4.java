package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout {
    public final org.telegram.ui.Components.p9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.Components.z8 d;
    public final kp e;
    public ContactsController.Contact f;
    public CharSequence h;

    public o4(Context context, boolean z4) {
        super(context);
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(p9Var, k7.b6.d(46, 46.0f, (LocaleController.isRTL ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z10 = LocaleController.isRTL;
        addView(linearLayout, k7.b6.d(-1, -1.0f, 119, z10 ? 0 : 72, 0.0f, z10 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, k7.b6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(15);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(k5Var, k7.b6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(13);
        k5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(k5Var2, k7.b6.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z4) {
            kp kpVar = new kp(context, 21, null);
            this.e = kpVar;
            kpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            addView(kpVar, k7.b6.d(24, 24.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 40.0f, 32.0f, z11 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        fi0 fi0Var = new fi0(context);
        fi0Var.setText(LocaleController.getString(R.string.Invite));
        fi0Var.setTextSize(1, 14.0f);
        fi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        fi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        fi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{16.0f}, w02));
        fi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(fi0Var, k7.b6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        fi0Var.setOnClickListener(new a(this, 6));
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
