package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xh0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.u9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final org.telegram.ui.Components.f9 d;
    public final np e;
    public ContactsController.Contact f;
    public CharSequence h;

    public p4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
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
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(15);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(j5Var, w7.x5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var2;
        j5Var2.setTextSize(13);
        j5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(j5Var2, w7.x5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            np npVar = new np(context, 21, null);
            this.e = npVar;
            npVar.b(-1, org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(npVar, w7.x5.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        xh0 xh0Var = new xh0(context);
        xh0Var.setText(LocaleController.getString(R.string.Invite));
        xh0Var.setTextSize(1, 14.0f);
        xh0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        xh0Var.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hl, false);
        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        xh0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{16.0f}, w02));
        xh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(xh0Var, w7.x5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        xh0Var.setOnClickListener(new a(this, 6));
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
        org.telegram.ui.ActionBar.j5 j5Var = this.b;
        if (charSequence != null) {
            j5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f;
            j5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.i6.y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.c;
        j5Var2.setTag(valueOf);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            j5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            j5Var2.l(contact3.phones.get(0), false);
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
